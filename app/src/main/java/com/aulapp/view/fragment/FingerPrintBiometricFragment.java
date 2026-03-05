package com.gse.aulapp.view.fragment;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.TextViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.fragment.FragmentKt;
import androidx.view.LifecycleOwnerKt;
import androidx.view.SavedStateHandle;
import androidx.view.ViewModelProvider;
import co.ceduladigital.sdk.g4;
import co.ceduladigital.sdk.i4;
import co.ceduladigital.sdk.k0;
import co.ceduladigital.sdk.k4;
import co.ceduladigital.sdk.m4;
import co.ceduladigital.sdk.z0;
import com.google.android.material.button.MaterialButton;
import com.gse.aulapp.R;
import com.gse.aulapp.databinding.FragmentRegistrationBiometricBinding;
import com.gse.aulapp.model.enumerate.EnumBiometricMoments;
import com.gse.aulapp.model.enumerate.EnumDialogType;
import com.gse.aulapp.model.enumerate.EnumHandsAulapp;
import com.gse.aulapp.model.enumerate.EnumStatusFingerPrintBiometric;
import com.gse.aulapp.model.enumerate.EnumUserProfile;
import com.gse.aulapp.receptions.feature.core.model.dto.UserInfoDto;
import com.gse.aulapp.util.ButtonUtil;
import com.gse.aulapp.util.DialogUtil;
import com.gse.aulapp.viewmodel.FingerPrintBiometricViewModel;
import com.karumi.dexter.BuildConfig;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/gse/aulapp/view/fragment/FingerPrintBiometricFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FingerPrintBiometricFragment extends Fragment {
    public FingerPrintBiometricViewModel a;
    public FragmentRegistrationBiometricBinding b;
    public UserInfoDto c;
    public AlertDialog d;

    public FingerPrintBiometricFragment() {
        Reflection.getOrCreateKotlinClass(FingerPrintBiometricFragment.class).getSimpleName();
    }

    public final void b(EnumDialogType enumDialogType) {
        AlertDialog showErrorDialog$default;
        if (enumDialogType == EnumDialogType.DIALOG_TYPE_TIMEOUT_FAIL) {
            FragmentActivity activity = getActivity();
            showErrorDialog$default = activity != null ? DialogUtil.INSTANCE.showDialogTimeout(activity, false, new g4(this, 0)) : null;
            this.d = showErrorDialog$default;
            if (showErrorDialog$default != null) {
                showErrorDialog$default.show();
                return;
            }
            return;
        }
        FragmentActivity activity2 = getActivity();
        showErrorDialog$default = activity2 != null ? DialogUtil.Companion.showErrorDialog$default(DialogUtil.INSTANCE, activity2, enumDialogType, null, null, null, false, new g4(this, 1), 28, null) : null;
        this.d = showErrorDialog$default;
        if (showErrorDialog$default != null) {
            showErrorDialog$default.show();
        }
    }

    public final void c(EnumStatusFingerPrintBiometric enumStatusFingerPrintBiometric) {
        SavedStateHandle savedStateHandle;
        NavController findNavController = FragmentKt.findNavController(this);
        NavBackStackEntry previousBackStackEntry = findNavController.getPreviousBackStackEntry();
        if (previousBackStackEntry != null && (savedStateHandle = previousBackStackEntry.getSavedStateHandle()) != null) {
            savedStateHandle.set("RESULT_FINGER_PRINT", enumStatusFingerPrintBiometric);
        }
        findNavController.popBackStack();
    }

    public final void d(boolean z) {
        DialogUtil.Companion companion = DialogUtil.INSTANCE;
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        companion.showDialogProgressGlobal(requireActivity, z, false, true);
    }

    public final void e() {
        ButtonUtil.Companion companion = ButtonUtil.INSTANCE;
        FragmentRegistrationBiometricBinding fragmentRegistrationBiometricBinding = this.b;
        Intrinsics.checkNotNull(fragmentRegistrationBiometricBinding);
        MaterialButton root = fragmentRegistrationBiometricBinding.includePrimaryButtonBiometricRegistration.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        EnumBiometricMoments enumBiometricMoments = EnumBiometricMoments.VERIFY;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        companion.customFourthButton(root, enumBiometricMoments.definitionText(requireContext));
        FragmentRegistrationBiometricBinding fragmentRegistrationBiometricBinding2 = this.b;
        Intrinsics.checkNotNull(fragmentRegistrationBiometricBinding2);
        fragmentRegistrationBiometricBinding2.txtTypeProcessBiometrics.setText(getString(R.string.verify_finger_print_biometric_title_bar));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = (FingerPrintBiometricViewModel) new ViewModelProvider(this).get(FingerPrintBiometricViewModel.class);
        setHasOptionsMenu(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentRegistrationBiometricBinding inflate = FragmentRegistrationBiometricBinding.inflate(inflater, viewGroup, false);
        this.b = inflate;
        Intrinsics.checkNotNull(inflate);
        return inflate.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        if (getArguments() != null) {
            Bundle bundle2 = requireArguments();
            Intrinsics.checkNotNullExpressionValue(bundle2, "requireArguments(...)");
            Intrinsics.checkNotNullParameter(bundle2, "bundle");
            bundle2.setClassLoader(m4.class.getClassLoader());
            if (!bundle2.containsKey("userInfo")) {
                throw new IllegalArgumentException("Required argument \"userInfo\" is missing and does not have an android:defaultValue");
            }
            if (!Parcelable.class.isAssignableFrom(UserInfoDto.class) && !Serializable.class.isAssignableFrom(UserInfoDto.class)) {
                throw new UnsupportedOperationException(UserInfoDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            UserInfoDto userInfoDto = (UserInfoDto) bundle2.get("userInfo");
            if (userInfoDto == null) {
                throw new IllegalArgumentException("Argument \"userInfo\" is marked as non-null but was passed a null value.");
            }
            this.c = new m4(userInfoDto).a;
        }
        FragmentRegistrationBiometricBinding fragmentRegistrationBiometricBinding = this.b;
        Intrinsics.checkNotNull(fragmentRegistrationBiometricBinding);
        if (fragmentRegistrationBiometricBinding != null) {
            d(false);
            UserInfoDto userInfoDto2 = this.c;
            if (userInfoDto2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("userInfoDto");
                userInfoDto2 = null;
            }
            EnumHandsAulapp hand = userInfoDto2.getHand();
            Intrinsics.checkNotNull(hand);
            int i = i4.$EnumSwitchMapping$0[hand.ordinal()];
            if (i == 1) {
                FragmentRegistrationBiometricBinding fragmentRegistrationBiometricBinding2 = this.b;
                Intrinsics.checkNotNull(fragmentRegistrationBiometricBinding2);
                fragmentRegistrationBiometricBinding2.imgHandType.setImageResource(R.drawable.ic_hand_right);
                FragmentRegistrationBiometricBinding fragmentRegistrationBiometricBinding3 = this.b;
                Intrinsics.checkNotNull(fragmentRegistrationBiometricBinding3);
                fragmentRegistrationBiometricBinding3.textHandIndicator.setText(getString(R.string.text_type_hand_right));
            } else if (i != 2) {
                getTag();
            } else {
                FragmentRegistrationBiometricBinding fragmentRegistrationBiometricBinding4 = this.b;
                Intrinsics.checkNotNull(fragmentRegistrationBiometricBinding4);
                fragmentRegistrationBiometricBinding4.imgHandType.setImageResource(R.drawable.ic_hand_left);
                FragmentRegistrationBiometricBinding fragmentRegistrationBiometricBinding5 = this.b;
                Intrinsics.checkNotNull(fragmentRegistrationBiometricBinding5);
                fragmentRegistrationBiometricBinding5.textHandIndicator.setText(getString(R.string.text_type_hand_left));
            }
            e();
            UserInfoDto userInfoDto3 = this.c;
            if (userInfoDto3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("userInfoDto");
                userInfoDto3 = null;
            }
            FragmentRegistrationBiometricBinding fragmentRegistrationBiometricBinding6 = this.b;
            Intrinsics.checkNotNull(fragmentRegistrationBiometricBinding6);
            fragmentRegistrationBiometricBinding6.txtUserName.setText(Intrinsics.areEqual(userInfoDto3.getUserName(), "null") ? BuildConfig.FLAVOR : userInfoDto3.getUserName());
            FragmentRegistrationBiometricBinding fragmentRegistrationBiometricBinding7 = this.b;
            Intrinsics.checkNotNull(fragmentRegistrationBiometricBinding7);
            fragmentRegistrationBiometricBinding7.txtUserNumberDocument.setText(userInfoDto3.getDocumentNumber());
            FragmentRegistrationBiometricBinding fragmentRegistrationBiometricBinding8 = this.b;
            Intrinsics.checkNotNull(fragmentRegistrationBiometricBinding8);
            fragmentRegistrationBiometricBinding8.txtUserEmail.setText(userInfoDto3.getUserEmail());
            FragmentRegistrationBiometricBinding fragmentRegistrationBiometricBinding9 = this.b;
            Intrinsics.checkNotNull(fragmentRegistrationBiometricBinding9);
            fragmentRegistrationBiometricBinding9.txtUserTypeDocument.setText(StringsKt.t("[DOCTYPE] -", "[DOCTYPE]", userInfoDto3.getDocumentType()));
            UserInfoDto userInfoDto4 = this.c;
            if (userInfoDto4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("userInfoDto");
                userInfoDto4 = null;
            }
            EnumUserProfile userRole = userInfoDto4.getUserRole();
            FragmentRegistrationBiometricBinding fragmentRegistrationBiometricBinding10 = this.b;
            Intrinsics.checkNotNull(fragmentRegistrationBiometricBinding10);
            TextView textView = fragmentRegistrationBiometricBinding10.txtUserRol;
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            textView.setText(userRole.nameTranslated(requireContext));
            FragmentRegistrationBiometricBinding fragmentRegistrationBiometricBinding11 = this.b;
            Intrinsics.checkNotNull(fragmentRegistrationBiometricBinding11);
            ImageView imageView = fragmentRegistrationBiometricBinding11.imgRol;
            Context requireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
            imageView.setImageResource(userRole.icon(requireContext2));
            FragmentRegistrationBiometricBinding fragmentRegistrationBiometricBinding12 = this.b;
            Intrinsics.checkNotNull(fragmentRegistrationBiometricBinding12);
            TextView textView2 = fragmentRegistrationBiometricBinding12.txtUserName;
            Context requireContext3 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
            TextViewCompat.setTextAppearance(textView2, userRole.style(requireContext3));
            FingerPrintBiometricViewModel fingerPrintBiometricViewModel = this.a;
            if (fingerPrintBiometricViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                fingerPrintBiometricViewModel = null;
            }
            fingerPrintBiometricViewModel.getStatusFingerPrint().observe(getViewLifecycleOwner(), new k0(new z0(1, this, FingerPrintBiometricFragment.class, "statusFingerController", "statusFingerController(LStatusFingerPrint;)V", 0, 8)));
            LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new k4(this, null));
            FragmentRegistrationBiometricBinding fragmentRegistrationBiometricBinding13 = this.b;
            Intrinsics.checkNotNull(fragmentRegistrationBiometricBinding13);
            fragmentRegistrationBiometricBinding13.includePrimaryButtonBiometricRegistration.getRoot().setOnClickListener(new g4(this, 2));
        }
    }
}
