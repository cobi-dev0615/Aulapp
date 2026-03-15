package com.gse.aulapp.view.fragment;

import android.app.AlertDialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.fragment.FragmentKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelProvider;
import co.ceduladigital.sdk.a1;
import co.ceduladigital.sdk.a2;
import co.ceduladigital.sdk.d2;
import co.ceduladigital.sdk.e2;
import co.ceduladigital.sdk.f0;
import co.ceduladigital.sdk.h2;
import co.ceduladigital.sdk.m2;
import co.ceduladigital.sdk.n1;
import co.ceduladigital.sdk.p1;
import co.ceduladigital.sdk.r1;
import co.ceduladigital.sdk.s1;
import co.ceduladigital.sdk.w1;
import co.ceduladigital.sdk.x0;
import co.ceduladigital.sdk.x1;
import co.ceduladigital.sdk.z0;
import com.google.android.material.button.MaterialButton;
import com.gse.aulapp.GeneralApp;
import com.gse.aulapp.R;
import com.gse.aulapp.databinding.FragmentClassPracticeBeforeBinding;
import com.gse.aulapp.model.adapter.StepRecyclerAdapter;
import com.gse.aulapp.model.converter.ConfigurationSessionTypeConverter;
import com.gse.aulapp.model.dao.SessionDao;
import com.gse.aulapp.model.dto.StepProfile;
import com.gse.aulapp.model.enumerate.EnumApps;
import com.gse.aulapp.model.enumerate.EnumBiometrixAction;
import com.gse.aulapp.model.enumerate.EnumClassType;
import com.gse.aulapp.model.enumerate.EnumDialogType;
import com.gse.aulapp.model.enumerate.EnumHandsAulapp;
import com.gse.aulapp.model.enumerate.EnumIdStepperMenu;
import com.gse.aulapp.model.enumerate.EnumStatusAppointment;
import com.gse.aulapp.model.enumerate.EnumUserProfile;
import com.gse.aulapp.model.repository.BiometrixRepository;
import com.gse.aulapp.model.repository.GetEnrollmentInformationRepository;
import com.gse.aulapp.model.repository.SessionRepository;
import com.gse.aulapp.model.request.BiometrixRequest;
import com.gse.aulapp.receptions.feature.core.model.dto.UserInfoDto;
import com.gse.aulapp.util.DialogUtil;
import com.gse.aulapp.util.NavigationUtil;
import com.gse.aulapp.util.PermissionHelper;
import com.gse.aulapp.util.PreferenceUtil;
import com.gse.aulapp.util.TemplatesUtil;
import com.gse.aulapp.util.UIHelper;
import com.gse.aulapp.util.ValidationFlowManager;
import com.gse.aulapp.util.extension.ViewExtKt;
import com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel;
import com.gse.aulapp.viewmodel.factory.ClassPracticeBeforeViewModelFactory;
import com.karumi.dexter.BuildConfig;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlin.coroutines.CoroutineContext;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/gse/aulapp/view/fragment/ClassPracticeBeforeFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nClassPracticeBeforeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassPracticeBeforeFragment.kt\ncom/gse/aulapp/view/fragment/ClassPracticeBeforeFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1060:1\n1#2:1061\n*E\n"})
/* loaded from: classes2.dex */
public final class ClassPracticeBeforeFragment extends Fragment {
    public ClassPracticeBeforeViewModel b;
    public FragmentClassPracticeBeforeBinding c;
    public String d;
    public StepRecyclerAdapter e;
    public String f;
    public String g;
    public String k;
    public String l;
    public AlertDialog m;
    public AlertDialog n;
    public NavController o;
    public ValidationFlowManager p;
    public AlertDialog q;
    public UserInfoDto r;
    public boolean s;
    public final String a = Reflection.getOrCreateKotlinClass(ClassPracticeBeforeFragment.class).getSimpleName();
    public boolean h = true;
    public String i = BuildConfig.FLAVOR;
    public EnumClassType j = EnumClassType.PRACTICE;

    // ADDED: Gallery photo picker launcher - opens device gallery directly
    private Uri selectedPhotoUri = null;
    private final ActivityResultLauncher<String> galleryLauncher =
            registerForActivityResult(new ActivityResultContracts.GetContent(),
                    new ActivityResultCallback<Uri>() {
                        @Override
                        public void onActivityResult(Uri uri) {
                            if (uri != null) {
                                selectedPhotoUri = uri;
                                onGalleryPhotoSelected(uri);
                            } else {
                                // User cancelled gallery - dismiss loading
                                callGlobalLoading(false);
                            }
                        }
                    });

    /**
     * Called when a photo is selected from the gallery.
     * Completes the current validation step and moves to the next one.
     */
    private void onGalleryPhotoSelected(Uri uri) {
        callGlobalLoading(false);
        // Move past the current validation step (biometrix or fingerprint)
        ValidationFlowManager vfm = this.p;
        if (vfm != null) {
            vfm.moveToNextValidation();
        }
        // Continue with the next validation step
        g();
    }

    /**
     * Opens the device gallery to select a photo.
     * Called instead of biometrix facial recognition or fingerprint scanning.
     */
    private void openGalleryForValidation() {
        galleryLauncher.launch("image/*");
    }

    public ClassPracticeBeforeFragment() {
        EnumStatusAppointment.Companion companion = EnumStatusAppointment.INSTANCE;
    }

    public static final void b(ClassPracticeBeforeFragment classPracticeBeforeFragment, FragmentActivity fragmentActivity, String str) {
        classPracticeBeforeFragment.getClass();
        if (fragmentActivity.isFinishing() || fragmentActivity.isDestroyed()) {
            return;
        }
        DialogUtil.Companion companion = DialogUtil.INSTANCE;
        if (str == null || str.length() == 0) {
            str = fragmentActivity.getString(R.string.dialog_text_fail_registered_hand_message_2);
            Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        }
        String str2 = str;
        Context context = classPracticeBeforeFragment.getContext();
        AlertDialog alertDialog = null;
        String string = context != null ? context.getString(R.string.dialog_fullscreen_max_wait_time_title) : null;
        Context context2 = classPracticeBeforeFragment.getContext();
        AlertDialog showInformationDialog = companion.showInformationDialog(fragmentActivity, str2, string, context2 != null ? context2.getString(R.string.id_continue) : null, 8, false, new r1(classPracticeBeforeFragment, 1), null);
        classPracticeBeforeFragment.n = showInformationDialog;
        if (showInformationDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fullDialog");
            showInformationDialog = null;
        }
        if (showInformationDialog.isShowing()) {
            AlertDialog alertDialog2 = classPracticeBeforeFragment.n;
            if (alertDialog2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fullDialog");
            } else {
                alertDialog = alertDialog2;
            }
            alertDialog.dismiss();
            return;
        }
        AlertDialog alertDialog3 = classPracticeBeforeFragment.n;
        if (alertDialog3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fullDialog");
        } else {
            alertDialog = alertDialog3;
        }
        alertDialog.show();
    }

    public static void c(ClassPracticeBeforeFragment classPracticeBeforeFragment, EnumDialogType enumDialogType, String str, String str2, Function0 function0, int i) {
        if ((i & 1) != 0) {
            enumDialogType = EnumDialogType.DIALOG_TYPE_GENERAL_ERROR;
        }
        EnumDialogType enumDialogType2 = enumDialogType;
        if ((i & 4) != 0) {
            str2 = null;
        }
        classPracticeBeforeFragment.getClass();
        DialogUtil.Companion companion = DialogUtil.INSTANCE;
        FragmentActivity requireActivity = classPracticeBeforeFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        AlertDialog showErrorDialog$default = DialogUtil.Companion.showErrorDialog$default(companion, requireActivity, enumDialogType2, str, str2, null, false, new f0(function0, classPracticeBeforeFragment, 1), 16, null);
        classPracticeBeforeFragment.q = showErrorDialog$default;
        if (showErrorDialog$default != null) {
            showErrorDialog$default.show();
        }
    }

    public static void d(Context context, String str, Map map, EnumHandsAulapp enumHandsAulapp) {
        if (map == null || map.isEmpty()) {
            return;
        }
        Map map2 = (Map) map.get(enumHandsAulapp);
        Integer valueOf = map2 != null ? Integer.valueOf(map2.size()) : null;
        Intrinsics.checkNotNull(valueOf);
        if (valueOf.intValue() > 0) {
            TemplatesUtil.INSTANCE.saveTemplateFromBackend(context, map, str, enumHandsAulapp);
        }
    }

    public final void callGlobalLoading(boolean z) {
        DialogUtil.Companion companion = DialogUtil.INSTANCE;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        companion.showDialogProgressGlobal(requireContext, z, false, true);
    }

    public final void e() {
        String str = this.f;
        if (str == null || str.length() == 0) {
            return;
        }
        ClassPracticeBeforeViewModel classPracticeBeforeViewModel = this.b;
        if (classPracticeBeforeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            classPracticeBeforeViewModel = null;
        }
        String str2 = this.f;
        Intrinsics.checkNotNull(str2);
        classPracticeBeforeViewModel.getSessionById(str2);
    }

    public final void f() {
        if (!this.h) {
            DialogUtil.Companion companion = DialogUtil.INSTANCE;
            FragmentActivity requireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            companion.showGlobalDialogController(requireActivity, new n1(this, 1));
            return;
        }
        ClassPracticeBeforeViewModel classPracticeBeforeViewModel = this.b;
        if (classPracticeBeforeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            classPracticeBeforeViewModel = null;
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        classPracticeBeforeViewModel.navigateTo(requireContext, FragmentKt.findNavController(this), new ActionOnlyNavDirections(R.id.action_classPracticeBeforeFragment_to_homeFragment));
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c4, code lost:
    
        if (r0 == null) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        String name;
        EnumUserProfile userRole;
        ValidationFlowManager validationFlowManager = this.p;
        ClassPracticeBeforeViewModel classPracticeBeforeViewModel = null;
        EnumApps currentValidation = validationFlowManager != null ? validationFlowManager.getCurrentValidation() : null;
        int i = currentValidation == null ? -1 : s1.$EnumSwitchMapping$1[currentValidation.ordinal()];
        if (i == 1 || i == 2) {
            // MODIFIED: Open device gallery directly instead of biometrix facial recognition
            // or fingerprint scanning. Both "Student Login" and "Instructor Login" now
            // redirect to the device gallery to select and attach an image.
            openGalleryForValidation();
            return;
        }
        // Default case: validation complete — update stepper status and proceed
        this.p = null;
        callGlobalLoading(false);
        UserInfoDto userInfoDto5 = this.r;
        EnumIdStepperMenu enumIdStepperMenu = (userInfoDto5 != null ? userInfoDto5.getUserRole() : null) == EnumUserProfile.APPRENTICE ? EnumIdStepperMenu.ID_VALIDATION_APPRENTICE : EnumIdStepperMenu.ID_VALIDATION_INSTRUCTOR;
        ClassPracticeBeforeViewModel classPracticeBeforeViewModel3 = this.b;
        if (classPracticeBeforeViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            classPracticeBeforeViewModel = classPracticeBeforeViewModel3;
        }
        FragmentActivity requireActivity2 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
        FragmentClassPracticeBeforeBinding fragmentClassPracticeBeforeBinding = this.c;
        Intrinsics.checkNotNull(fragmentClassPracticeBeforeBinding);
        classPracticeBeforeViewModel.changeStatus(requireActivity2, enumIdStepperMenu, fragmentClassPracticeBeforeBinding, this.h);
        e();
    }

    public final void h(StepProfile stepProfile) {
        String str;
        if (this.d == null || (str = this.l) == null) {
            return;
        }
        ClassPracticeBeforeViewModel classPracticeBeforeViewModel = this.b;
        if (classPracticeBeforeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            classPracticeBeforeViewModel = null;
        }
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        String str2 = this.d;
        FragmentClassPracticeBeforeBinding fragmentClassPracticeBeforeBinding = this.c;
        Intrinsics.checkNotNull(fragmentClassPracticeBeforeBinding);
        classPracticeBeforeViewModel.itemSelectedMenuStepper(this, requireActivity, stepProfile, str2, fragmentClassPracticeBeforeBinding, this.i, this.g, this.h, this.k, str);
    }

    public final void i() {
        // MODIFIED: Skip camera permission request entirely since we now use gallery
        // instead of camera-based facial recognition. Go directly to validation flow.
        g();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            SessionDao SessionDao = GeneralApp.INSTANCE.getDatabase().SessionDao();
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            this.b = (ClassPracticeBeforeViewModel) new ViewModelProvider(this, new ClassPracticeBeforeViewModelFactory(new SessionRepository(SessionDao, requireContext), new GetEnrollmentInformationRepository(), new BiometrixRepository())).get(ClassPracticeBeforeViewModel.class);
        } catch (Exception e) {
            e.getMessage();
        }
        setHasOptionsMenu(false);
        ClassPracticeBeforeViewModel classPracticeBeforeViewModel = this.b;
        if (classPracticeBeforeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            classPracticeBeforeViewModel = null;
        }
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        classPracticeBeforeViewModel.initNfcStatus(requireActivity);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentClassPracticeBeforeBinding inflate = FragmentClassPracticeBeforeBinding.inflate(inflater, viewGroup, false);
        this.c = inflate;
        Intrinsics.checkNotNull(inflate);
        return inflate.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        ClassPracticeBeforeViewModel classPracticeBeforeViewModel = this.b;
        if (classPracticeBeforeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            classPracticeBeforeViewModel = null;
        }
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        classPracticeBeforeViewModel.disableNfc(requireActivity);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        UIHelper.Companion companion = UIHelper.INSTANCE;
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        UIHelper.Companion.setterCustomToolbar$default(companion, requireActivity, false, false, getString(this.j == EnumClassType.PRACTICE ? R.string.title_practice_class : R.string.txt_title_name_exam), null, null, false, true, 118, null);
        e();
        ClassPracticeBeforeViewModel classPracticeBeforeViewModel = this.b;
        if (classPracticeBeforeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            classPracticeBeforeViewModel = null;
        }
        FragmentActivity requireActivity2 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
        FragmentClassPracticeBeforeBinding fragmentClassPracticeBeforeBinding = this.c;
        Intrinsics.checkNotNull(fragmentClassPracticeBeforeBinding);
        classPracticeBeforeViewModel.validateVehicleActive(requireActivity2, fragmentClassPracticeBeforeBinding, this.h);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        NavBackStackEntry currentBackStackEntry;
        SavedStateHandle savedStateHandle;
        MutableLiveData liveData;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        if (this.c != null) {
            if (getArguments() != null) {
                Bundle requireArguments = requireArguments();
                Intrinsics.checkNotNullExpressionValue(requireArguments, "requireArguments(...)");
                this.f = a1.b(requireArguments).a;
                Bundle requireArguments2 = requireArguments();
                Intrinsics.checkNotNullExpressionValue(requireArguments2, "requireArguments(...)");
                this.h = a1.b(requireArguments2).b;
                Bundle requireArguments3 = requireArguments();
                Intrinsics.checkNotNullExpressionValue(requireArguments3, "requireArguments(...)");
                this.j = a1.b(requireArguments3).c;
                PreferenceUtil.Companion.saveEntrySession$default(PreferenceUtil.INSTANCE, null, this.h, 1, null);
            }
            ClassPracticeBeforeViewModel classPracticeBeforeViewModel = this.b;
            if (classPracticeBeforeViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                classPracticeBeforeViewModel = null;
            }
            classPracticeBeforeViewModel.getConfigSessionDto(ConfigurationSessionTypeConverter.INSTANCE.getType(this.j));
            this.o = FragmentKt.findNavController(this);
            FragmentClassPracticeBeforeBinding fragmentClassPracticeBeforeBinding = this.c;
            Intrinsics.checkNotNull(fragmentClassPracticeBeforeBinding);
            MaterialButton root = fragmentClassPracticeBeforeBinding.primaryButtonClass.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            ViewExtKt.setOnSingleClickListener(root, new n1(this, 0));
            FragmentClassPracticeBeforeBinding fragmentClassPracticeBeforeBinding2 = this.c;
            Intrinsics.checkNotNull(fragmentClassPracticeBeforeBinding2);
            fragmentClassPracticeBeforeBinding2.cardProfileUserProfileUser.includeFabLocation.cvContainerIconUser.setOnClickListener(new r1(this, 0));
            OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            onBackPressedDispatcher.addCallback(viewLifecycleOwner, new e2(0, this));
            NavController navController = this.o;
            if (navController != null && (currentBackStackEntry = navController.getCurrentBackStackEntry()) != null && (savedStateHandle = currentBackStackEntry.getSavedStateHandle()) != null && (liveData = savedStateHandle.getLiveData("result_key")) != null) {
                liveData.observe(getViewLifecycleOwner(), new x0(1, new p1(this, 2)));
            }
            LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
            BuildersKt.launch(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new a2(this, null));
            ClassPracticeBeforeViewModel classPracticeBeforeViewModel2 = this.b;
            if (classPracticeBeforeViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                classPracticeBeforeViewModel2 = null;
            }
            classPracticeBeforeViewModel2.getMessageValidation().observe(getViewLifecycleOwner(), new x0(1, new z0(1, this, ClassPracticeBeforeFragment.class, "validationTime", "validationTime(Lcom/gse/aulapp/model/data/statusControl/Status;)V", 0, 6)));
            ClassPracticeBeforeViewModel classPracticeBeforeViewModel3 = this.b;
            if (classPracticeBeforeViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                classPracticeBeforeViewModel3 = null;
            }
            classPracticeBeforeViewModel3.getStatusClass().observe(getViewLifecycleOwner(), new x0(1, new z0(1, this, ClassPracticeBeforeFragment.class, "validateUpdateStatusAppointment", "validateUpdateStatusAppointment(Lcom/gse/aulapp/model/data/statusControl/Status;)V", 0, 7)));
            LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
            BuildersKt.launch(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new w1(this, null));
            LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
            BuildersKt.launch(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner4), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new d2(this, null));
        }
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        ActionBar supportActionBar = ((AppCompatActivity) requireActivity).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
            supportActionBar.setHomeButtonEnabled(true);
        }
        requireActivity().addMenuProvider(new x1(this), getViewLifecycleOwner(), Lifecycle.State.STARTED);
    }
}
