package com.gse.aulapp.view.fragment;

import android.app.AlertDialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.widget.TextViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.fragment.FragmentKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelProvider;

import com.google.android.material.button.MaterialButton;
import com.gse.aulapp.R;
import com.gse.aulapp.databinding.FragmentRegistrationBiometricBinding;
import com.gse.aulapp.model.enumerate.EnumStatusFingerPrintBiometric;
import com.gse.aulapp.model.enumerate.EnumUserProfile;
import com.gse.aulapp.receptions.feature.core.model.dto.UserInfoDto;
import com.gse.aulapp.util.DialogUtil;
import com.gse.aulapp.viewmodel.FingerPrintBiometricViewModel;

import java.io.Serializable;

import kotlin.jvm.internal.Intrinsics;

/**
 * Fragment that replaces the original fingerprint biometric verification
 * with a gallery photo picker. Users can select a photo from their device
 * gallery instead of using the Identy SDK for fingerprint scanning.
 */
public final class FingerPrintBiometricFragment extends Fragment {

    public FingerPrintBiometricViewModel a;
    public FragmentRegistrationBiometricBinding b;
    public UserInfoDto c;
    public AlertDialog d;

    private Uri selectedPhotoUri = null;

    // Gallery photo picker launcher
    private final ActivityResultLauncher<String> galleryLauncher =
            registerForActivityResult(new ActivityResultContracts.GetContent(),
                    new ActivityResultCallback<Uri>() {
                        @Override
                        public void onActivityResult(Uri uri) {
                            if (uri != null) {
                                selectedPhotoUri = uri;
                                onPhotoSelected(uri);
                            }
                        }
                    });

    public FingerPrintBiometricFragment() {
    }

    /**
     * Called when a photo is selected from the gallery.
     * Updates the preview ImageView and enables the confirm button.
     */
    private void onPhotoSelected(Uri uri) {
        FragmentRegistrationBiometricBinding binding = this.b;
        if (binding != null) {
            // Update the image preview with selected photo
            binding.imgHandType.setImageURI(uri);
            binding.imgHandType.setVisibility(View.VISIBLE);

            // Update label text
            binding.textHandIndicator.setText("Foto seleccionada");

            // Enable the confirm button
            binding.includePrimaryButtonBiometricRegistration.getRoot().setEnabled(true);
            binding.includePrimaryButtonBiometricRegistration.getRoot().setAlpha(1.0f);
        }
    }

    /**
     * Returns the result back to the previous fragment via SavedStateHandle
     * and pops the back stack, same as the original flow.
     */
    private void returnSuccessResult() {
        SavedStateHandle savedStateHandle;
        NavController findNavController = FragmentKt.findNavController(this);
        NavBackStackEntry previousBackStackEntry = findNavController.getPreviousBackStackEntry();
        if (previousBackStackEntry != null && (savedStateHandle = previousBackStackEntry.getSavedStateHandle()) != null) {
            savedStateHandle.set("RESULT_FINGER_PRINT", EnumStatusFingerPrintBiometric.ON_SUCCESS);
        }
        findNavController.popBackStack();
    }

    /**
     * Opens the device gallery to select a photo.
     */
    private void openGallery() {
        galleryLauncher.launch("image/*");
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = (FingerPrintBiometricViewModel) new ViewModelProvider(this).get(FingerPrintBiometricViewModel.class);
        setHasOptionsMenu(false);
    }

    @Override
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentRegistrationBiometricBinding inflate = FragmentRegistrationBiometricBinding.inflate(inflater, viewGroup, false);
        this.b = inflate;
        Intrinsics.checkNotNull(inflate);
        return inflate.getRoot();
    }

    @Override
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);

        // Parse arguments (userInfo)
        if (getArguments() != null) {
            Bundle bundle2 = requireArguments();
            if (bundle2.containsKey("userInfo")) {
                if (Parcelable.class.isAssignableFrom(UserInfoDto.class) || Serializable.class.isAssignableFrom(UserInfoDto.class)) {
                    UserInfoDto userInfoDto = (UserInfoDto) bundle2.get("userInfo");
                    if (userInfoDto != null) {
                        this.c = userInfoDto;
                    }
                }
            }
        }

        FragmentRegistrationBiometricBinding binding = this.b;
        if (binding == null) return;

        // Hide progress dialog
        DialogUtil.Companion companion = DialogUtil.INSTANCE;
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        companion.showDialogProgressGlobal(requireActivity, false, false, true);

        // Display user info if available
        UserInfoDto userInfoDto = this.c;
        if (userInfoDto != null) {
            binding.txtUserName.setText(
                    "null".equals(userInfoDto.getUserName()) ? "" : userInfoDto.getUserName()
            );
            binding.txtUserNumberDocument.setText(userInfoDto.getDocumentNumber());
            binding.txtUserEmail.setText(userInfoDto.getUserEmail());

            EnumUserProfile userRole = userInfoDto.getUserRole();
            if (userRole != null) {
                Context ctx = requireContext();
                binding.txtUserRol.setText(userRole.nameTranslated(ctx));
                binding.imgRol.setImageResource(userRole.icon(ctx));
                TextViewCompat.setTextAppearance(binding.txtUserName, userRole.style(ctx));
            }
        }

        // Set title
        binding.txtTypeProcessBiometrics.setText("Verificación por foto");

        // Set up photo label
        binding.textHandIndicator.setText("Seleccionar foto de galería");

        // Set placeholder icon for photo preview
        binding.imgHandType.setImageResource(android.R.drawable.ic_menu_gallery);
        binding.imgHandType.setScaleType(ImageView.ScaleType.CENTER_INSIDE);

        // Initially disable confirm button until photo is selected
        binding.includePrimaryButtonBiometricRegistration.getRoot().setEnabled(false);
        binding.includePrimaryButtonBiometricRegistration.getRoot().setAlpha(0.5f);

        // Set up "Select Photo" button
        View btnSelectPhoto = view.findViewById(R.id.btn_select_photo);
        if (btnSelectPhoto != null) {
            btnSelectPhoto.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openGallery();
                }
            });
        }

        // Set up confirm button - returns success when photo is selected
        binding.includePrimaryButtonBiometricRegistration.getRoot().setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (selectedPhotoUri != null) {
                            returnSuccessResult();
                        }
                    }
                }
        );
    }
}
