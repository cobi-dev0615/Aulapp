package com.gse.aulapp.view.fragment;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.fragment.FragmentKt;
import androidx.view.LifecycleOwner;
import androidx.view.LifecycleOwnerKt;
import androidx.view.MutableLiveData;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherKt;
import androidx.view.SavedStateHandle;
import androidx.view.ViewModelProvider;
import co.ceduladigital.sdk.b5;
import co.ceduladigital.sdk.e5;
import co.ceduladigital.sdk.f0;
import co.ceduladigital.sdk.i5;
import co.ceduladigital.sdk.k0;
import co.ceduladigital.sdk.l5;
import co.ceduladigital.sdk.m5;
import co.ceduladigital.sdk.o5;
import co.ceduladigital.sdk.p5;
import co.ceduladigital.sdk.r4;
import co.ceduladigital.sdk.s4;
import co.ceduladigital.sdk.u4;
import co.ceduladigital.sdk.v4;
import co.ceduladigital.sdk.y4;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.gse.aulapp.GeneralApp;
import com.gse.aulapp.R;
import com.gse.aulapp.databinding.FragmentFirstLoginBinding;
import com.gse.aulapp.feature.core.util.RandomControllerUtil;
import com.gse.aulapp.model.adapter.CeaItemAutocompleteAdapter;
import com.gse.aulapp.model.converter.ProfileUserConverter;
import com.gse.aulapp.model.dao.SessionDao;
import com.gse.aulapp.model.dto.CenterDto;
import com.gse.aulapp.model.dto.LoginObject;
import com.gse.aulapp.model.enumerate.EnumApps;
import com.gse.aulapp.model.enumerate.EnumBiometrixAction;
import com.gse.aulapp.model.enumerate.EnumDialogType;
import com.gse.aulapp.model.enumerate.EnumUserProfile;
import com.gse.aulapp.model.repository.BiometrixRepository;
import com.gse.aulapp.model.repository.ChangeCenterRepository;
import com.gse.aulapp.model.repository.LoginRepository;
import com.gse.aulapp.model.repository.PasswordRecoveryRepository;
import com.gse.aulapp.model.repository.RefreshTokenRepository;
import com.gse.aulapp.model.repository.SessionRepository;
import com.gse.aulapp.model.request.BiometrixRequest;
import com.gse.aulapp.receptions.feature.core.model.dto.UserInfoDto;
import com.gse.aulapp.util.BuildTypeUtil;
import com.gse.aulapp.util.ButtonUtil;
import com.gse.aulapp.util.DialogUtil;
import com.gse.aulapp.util.InputUtil;
import com.gse.aulapp.util.LoadConfigurationUtil;
import com.gse.aulapp.util.NavigationUtil;
import com.gse.aulapp.util.Parameters;
import com.gse.aulapp.util.PermissionHelper;
import com.gse.aulapp.util.PreferenceUtil;
import com.gse.aulapp.util.ValidationFlowManager;
import com.gse.aulapp.view.fragment.FirstLoginFragment;
import com.gse.aulapp.viewmodel.FirstLoginViewModel;
import com.gse.aulapp.viewmodel.factory.FirstLoginViewModelFactory;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.DelayKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/gse/aulapp/view/fragment/FirstLoginFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFirstLoginFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirstLoginFragment.kt\ncom/gse/aulapp/view/fragment/FirstLoginFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,946:1\n254#2:947\n1#3:948\n*S KotlinDebug\n*F\n+ 1 FirstLoginFragment.kt\ncom/gse/aulapp/view/fragment/FirstLoginFragment\n*L\n222#1:947\n*E\n"})
/* loaded from: classes2.dex */
public final class FirstLoginFragment extends Fragment {
    public FragmentFirstLoginBinding b;
    public String c;
    public String d;
    public AlertDialog e;
    public String f;
    public LoginObject h;
    public ValidationFlowManager i;
    public NavController j;
    public FirstLoginViewModel k;
    public final String a = Reflection.getOrCreateKotlinClass(FirstLoginFragment.class).getSimpleName();
    public List g = new ArrayList();

    public static final void b(FirstLoginFragment firstLoginFragment, boolean z) {
        firstLoginFragment.e = null;
        DialogUtil.Companion companion = DialogUtil.INSTANCE;
        FragmentActivity requireActivity = firstLoginFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        AlertDialog showInformationFullDialogPasswordRecovery$default = DialogUtil.Companion.showInformationFullDialogPasswordRecovery$default(companion, requireActivity, z, null, null, false, new u4(firstLoginFragment, 3), 12, null);
        firstLoginFragment.e = showInformationFullDialogPasswordRecovery$default;
        if (showInformationFullDialogPasswordRecovery$default != null) {
            showInformationFullDialogPasswordRecovery$default.show();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(FirstLoginFragment firstLoginFragment, String str, Continuation continuation) {
        m5 m5Var;
        int i;
        if (continuation instanceof m5) {
            m5Var = (m5) continuation;
            int i2 = m5Var.e;
            if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                m5Var.e = i2 - IntCompanionObject.MIN_VALUE;
                Object obj = m5Var.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = m5Var.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    m5Var.a = firstLoginFragment;
                    m5Var.b = str;
                    m5Var.e = 1;
                    if (DelayKt.delay(500L, m5Var) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = m5Var.b;
                    firstLoginFragment = m5Var.a;
                    ResultKt.throwOnFailure(obj);
                }
                firstLoginFragment.g(false);
                FragmentFirstLoginBinding fragmentFirstLoginBinding = firstLoginFragment.b;
                Intrinsics.checkNotNull(fragmentFirstLoginBinding);
                fragmentFirstLoginBinding.tvInformationLogin.setText(str);
                FragmentFirstLoginBinding fragmentFirstLoginBinding2 = firstLoginFragment.b;
                Intrinsics.checkNotNull(fragmentFirstLoginBinding2);
                fragmentFirstLoginBinding2.tvInformationLogin.setVisibility(0);
                return Unit.INSTANCE;
            }
        }
        m5Var = new m5(firstLoginFragment, continuation);
        Object obj2 = m5Var.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = m5Var.e;
        if (i != 0) {
        }
        firstLoginFragment.g(false);
        FragmentFirstLoginBinding fragmentFirstLoginBinding3 = firstLoginFragment.b;
        Intrinsics.checkNotNull(fragmentFirstLoginBinding3);
        fragmentFirstLoginBinding3.tvInformationLogin.setText(str);
        FragmentFirstLoginBinding fragmentFirstLoginBinding22 = firstLoginFragment.b;
        Intrinsics.checkNotNull(fragmentFirstLoginBinding22);
        fragmentFirstLoginBinding22.tvInformationLogin.setVisibility(0);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.text.Editable] */
    public static final void d(FirstLoginFragment firstLoginFragment) {
        Editable text;
        PreferenceUtil.Companion companion = PreferenceUtil.INSTANCE;
        Context requireContext = firstLoginFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        companion.saveIsFirstLogin(requireContext, true);
        FragmentFirstLoginBinding fragmentFirstLoginBinding = firstLoginFragment.b;
        Intrinsics.checkNotNull(fragmentFirstLoginBinding);
        fragmentFirstLoginBinding.constraintMenuLogin.setVisibility(0);
        FragmentFirstLoginBinding fragmentFirstLoginBinding2 = firstLoginFragment.b;
        Intrinsics.checkNotNull(fragmentFirstLoginBinding2);
        Editable text2 = fragmentFirstLoginBinding2.tietTextInputUserLogin.getText();
        if (text2 != null && text2.length() > 0) {
            FragmentFirstLoginBinding fragmentFirstLoginBinding3 = firstLoginFragment.b;
            Intrinsics.checkNotNull(fragmentFirstLoginBinding3);
            EditText editText = fragmentFirstLoginBinding3.tilTextInputUserLogin.getEditText();
            String obj = (editText == null || (text = editText.getText()) == null) ? null : text.toString();
            FragmentFirstLoginBinding fragmentFirstLoginBinding4 = firstLoginFragment.b;
            Intrinsics.checkNotNull(fragmentFirstLoginBinding4);
            ?? text3 = fragmentFirstLoginBinding4.tietTextInputUserLogin.getText();
            if (obj == null || obj.length() == 0) {
                obj = text3;
            }
            FragmentFirstLoginBinding fragmentFirstLoginBinding5 = firstLoginFragment.b;
            Intrinsics.checkNotNull(fragmentFirstLoginBinding5);
            fragmentFirstLoginBinding5.tietTextInputUserLogin.setText(Editable.Factory.getInstance().newEditable(obj));
            firstLoginFragment.d = String.valueOf(obj);
        }
        firstLoginFragment.g(false);
    }

    public static final void e(FirstLoginFragment firstLoginFragment, LoginObject loginObject) {
        PreferenceUtil.Companion companion = PreferenceUtil.INSTANCE;
        companion.saveTokenTemporal(firstLoginFragment.requireActivity(), loginObject.getToken());
        LoadConfigurationUtil.Companion companion2 = LoadConfigurationUtil.INSTANCE;
        FragmentActivity requireActivity = firstLoginFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        companion2.saveParameterListOnPreference(requireActivity);
        try {
            List<CenterDto> centerList = loginObject.getCenterList();
            if ((centerList != null ? Integer.valueOf(centerList.size()) : null) != null) {
                List<CenterDto> centerList2 = loginObject.getCenterList();
                Intrinsics.checkNotNull(centerList2);
                if (centerList2.size() > 1) {
                    FragmentActivity requireActivity2 = firstLoginFragment.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
                    List<CenterDto> centerList3 = loginObject.getCenterList();
                    Intrinsics.checkNotNull(centerList3);
                    companion.saveListCenterCEA(requireActivity2, centerList3);
                    FragmentActivity requireActivity3 = firstLoginFragment.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity3, "requireActivity(...)");
                    LoginObject loginObject2 = firstLoginFragment.h;
                    companion.saveCEA(requireActivity3, loginObject2 != null ? loginObject2.getCea() : null);
                } else {
                    List<CenterDto> centerList4 = loginObject.getCenterList();
                    Intrinsics.checkNotNull(centerList4);
                    if (centerList4.size() == 1) {
                        FragmentActivity requireActivity4 = firstLoginFragment.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(requireActivity4, "requireActivity(...)");
                        LoginObject loginObject3 = firstLoginFragment.h;
                        List<CenterDto> centerList5 = loginObject3 != null ? loginObject3.getCenterList() : null;
                        Intrinsics.checkNotNull(centerList5);
                        companion.saveCEA(requireActivity4, centerList5.get(0));
                    }
                }
            } else {
                FragmentActivity requireActivity5 = firstLoginFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity5, "requireActivity(...)");
                LoginObject loginObject4 = firstLoginFragment.h;
                companion.saveCEA(requireActivity5, loginObject4 != null ? loginObject4.getCea() : null);
            }
        } catch (Exception e) {
            e.getMessage();
        }
        if (Intrinsics.areEqual(loginObject.getIsUserDemo(), Boolean.TRUE)) {
            firstLoginFragment.h();
        } else if (Intrinsics.areEqual(loginObject.getFullEnrollment(), Boolean.FALSE)) {
            f(firstLoginFragment, null, null, null, new r4(firstLoginFragment, 0), 15);
        } else {
            firstLoginFragment.i = new ValidationFlowManager(RandomControllerUtil.INSTANCE.randomInit());
            firstLoginFragment.k();
        }
    }

    public static void f(FirstLoginFragment firstLoginFragment, EnumDialogType enumDialogType, String str, String str2, Function0 function0, int i) {
        if ((i & 1) != 0) {
            enumDialogType = null;
        }
        String str3 = (i & 2) != 0 ? null : str;
        String str4 = (i & 4) != 0 ? null : str2;
        firstLoginFragment.g(false);
        DialogUtil.Companion companion = DialogUtil.INSTANCE;
        FragmentActivity requireActivity = firstLoginFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        if (enumDialogType == null) {
            enumDialogType = EnumDialogType.DIALOG_TYPE_GENERAL_ERROR;
        }
        AlertDialog showErrorDialog$default = DialogUtil.Companion.showErrorDialog$default(companion, requireActivity, enumDialogType, str3, str4, null, false, new f0(firstLoginFragment, function0, 4), 16, null);
        firstLoginFragment.e = showErrorDialog$default;
        if (showErrorDialog$default != null) {
            showErrorDialog$default.show();
        }
    }

    public final void g(boolean z) {
        DialogUtil.Companion companion = DialogUtil.INSTANCE;
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        companion.showDialogProgressGlobal(requireActivity, z, false, true);
    }

    public final void h() {
        EnumUserProfile role;
        this.i = null;
        PreferenceUtil.Companion companion = PreferenceUtil.INSTANCE;
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        LoginObject loginObject = this.h;
        companion.saveEmail(requireActivity, loginObject != null ? loginObject.getEmail() : null);
        FragmentActivity requireActivity2 = requireActivity();
        FragmentActivity requireActivity3 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity3, "requireActivity(...)");
        companion.saveToken(requireActivity2, companion.getTokenTemporal(requireActivity3));
        FragmentActivity requireActivity4 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity4, "requireActivity(...)");
        LoginObject loginObject2 = this.h;
        companion.saveUserId(requireActivity4, loginObject2 != null ? loginObject2.getUserId() : null);
        FragmentActivity requireActivity5 = requireActivity();
        LoginObject loginObject3 = this.h;
        companion.saveDocumentNumber(requireActivity5, loginObject3 != null ? loginObject3.getDocumentNumber() : null);
        FragmentActivity requireActivity6 = requireActivity();
        LoginObject loginObject4 = this.h;
        companion.saveFullEnrollment(requireActivity6, loginObject4 != null ? loginObject4.getFullEnrollment() : null);
        FragmentActivity requireActivity7 = requireActivity();
        LoginObject loginObject5 = this.h;
        companion.saveDateEnrollment(requireActivity7, loginObject5 != null ? loginObject5.getDateEnrollment() : null);
        FragmentActivity requireActivity8 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity8, "requireActivity(...)");
        companion.saveFourFingersIdentyID(requireActivity8, this.h);
        FragmentActivity requireActivity9 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity9, "requireActivity(...)");
        LoginObject loginObject6 = this.h;
        companion.saveFullName(requireActivity9, loginObject6 != null ? loginObject6.getFullName() : null);
        FragmentActivity requireActivity10 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity10, "requireActivity(...)");
        LoginObject loginObject7 = this.h;
        companion.saveRole(requireActivity10, (loginObject7 == null || (role = loginObject7.getRole()) == null) ? null : role.name());
        FragmentActivity requireActivity11 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity11, "requireActivity(...)");
        LoginObject loginObject8 = this.h;
        companion.saveDocType(requireActivity11, loginObject8 != null ? loginObject8.getDocType() : null);
        FragmentActivity requireActivity12 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity12, "requireActivity(...)");
        LoginObject loginObject9 = this.h;
        companion.saveFraudInformationID(requireActivity12, loginObject9 != null ? loginObject9.getFraudInformationID() : null);
        FragmentActivity requireActivity13 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity13, "requireActivity(...)");
        LoginObject loginObject10 = this.h;
        companion.saveBiometrixInformationID(requireActivity13, loginObject10 != null ? loginObject10.getBiometrixInformationID() : null);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        companion.saveIsFirstLogin(requireContext, false);
        companion.clearTokenTemporal(requireContext());
        g(false);
        NavController navController = this.j;
        if (navController != null) {
            navController.navigate(new ActionOnlyNavDirections(R.id.action_firstLoginFragment_to_homeFragment));
        }
    }

    public final void i(String str, List list) {
        int i;
        Object obj;
        if (!Intrinsics.areEqual(Parameters.INSTANCE.getX_APP_VALUE(), "instructor")) {
            FragmentFirstLoginBinding fragmentFirstLoginBinding = this.b;
            Intrinsics.checkNotNull(fragmentFirstLoginBinding);
            fragmentFirstLoginBinding.constraintMenuCea.setVisibility(8);
            return;
        }
        FragmentFirstLoginBinding fragmentFirstLoginBinding2 = this.b;
        Intrinsics.checkNotNull(fragmentFirstLoginBinding2);
        ConstraintLayout constraintLayout = fragmentFirstLoginBinding2.constraintMenuCea;
        boolean z = !list.isEmpty() && list.size() > 1;
        if (z) {
            i = 0;
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            i = 8;
        }
        constraintLayout.setVisibility(i);
        FragmentFirstLoginBinding fragmentFirstLoginBinding3 = this.b;
        Intrinsics.checkNotNull(fragmentFirstLoginBinding3);
        if (fragmentFirstLoginBinding3.constraintMenuCea.getVisibility() == 0) {
            FragmentFirstLoginBinding fragmentFirstLoginBinding4 = this.b;
            Intrinsics.checkNotNull(fragmentFirstLoginBinding4);
            fragmentFirstLoginBinding4.ivIconRecoveryLogin.setVisibility(8);
            FragmentFirstLoginBinding fragmentFirstLoginBinding5 = this.b;
            Intrinsics.checkNotNull(fragmentFirstLoginBinding5);
            fragmentFirstLoginBinding5.mtvLinkRecoveryPasswordLogin.setVisibility(8);
        } else {
            FragmentFirstLoginBinding fragmentFirstLoginBinding6 = this.b;
            Intrinsics.checkNotNull(fragmentFirstLoginBinding6);
            fragmentFirstLoginBinding6.ivIconRecoveryLogin.setVisibility(0);
            FragmentFirstLoginBinding fragmentFirstLoginBinding7 = this.b;
            Intrinsics.checkNotNull(fragmentFirstLoginBinding7);
            fragmentFirstLoginBinding7.mtvLinkRecoveryPasswordLogin.setVisibility(0);
        }
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        CeaItemAutocompleteAdapter ceaItemAutocompleteAdapter = new CeaItemAutocompleteAdapter(requireActivity, 0, list, 2, null);
        FragmentFirstLoginBinding fragmentFirstLoginBinding8 = this.b;
        Intrinsics.checkNotNull(fragmentFirstLoginBinding8);
        AutoCompleteTextView autoCompleteTextView = fragmentFirstLoginBinding8.includeDropdownCea.actv;
        if (str.length() > 0) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (Intrinsics.areEqual(((CenterDto) obj).getName(), str)) {
                        break;
                    }
                }
            }
            CenterDto centerDto = (CenterDto) obj;
            if (centerDto != null) {
                autoCompleteTextView.setText(centerDto.getName());
            }
        }
        autoCompleteTextView.setAdapter(ceaItemAutocompleteAdapter);
        autoCompleteTextView.setTextColor(ContextCompat.getColor(autoCompleteTextView.getContext(), R.color.dropdown_text_color));
    }

    public final void j() {
        String str;
        String str2;
        String str3;
        EnumUserProfile enumUserProfile;
        ValidationFlowManager validationFlowManager = this.i;
        FirstLoginViewModel firstLoginViewModel = null;
        EnumApps currentValidation = validationFlowManager != null ? validationFlowManager.getCurrentValidation() : null;
        int i = currentValidation == null ? -1 : v4.$EnumSwitchMapping$2[currentValidation.ordinal()];
        if (i != 1) {
            if (i != 2) {
                h();
                return;
            }
            LoginObject loginObject = this.h;
            if (loginObject != null ? Intrinsics.areEqual(loginObject.getBiometricException(), Boolean.TRUE) : false) {
                ValidationFlowManager validationFlowManager2 = this.i;
                if (validationFlowManager2 != null) {
                    validationFlowManager2.moveToNextValidation();
                }
                j();
                return;
            }
            if (this.h != null) {
                FirstLoginViewModel firstLoginViewModel2 = this.k;
                if (firstLoginViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                } else {
                    firstLoginViewModel = firstLoginViewModel2;
                }
                LoginObject loginObject2 = this.h;
                Intrinsics.checkNotNull(loginObject2);
                UserInfoDto userInfo = firstLoginViewModel.setUserInfo(loginObject2);
                NavigationUtil.Companion companion = NavigationUtil.INSTANCE;
                Context requireContext = requireContext();
                NavController navController = this.j;
                Intrinsics.checkNotNullParameter(userInfo, "userInfo");
                companion.navigateToDifferentFragment(requireContext, navController, new p5(userInfo));
                return;
            }
            return;
        }
        LoginObject loginObject3 = this.h;
        EnumBiometrixAction enumBiometrixAction = loginObject3 != null ? Intrinsics.areEqual(loginObject3.getFullEnrollment(), Boolean.TRUE) : false ? EnumBiometrixAction.VALIDATION : EnumBiometrixAction.ENLISTMENT;
        LoginObject loginObject4 = this.h;
        if (loginObject4 == null || (str = loginObject4.getUserId()) == null) {
            str = BuildConfig.FLAVOR;
        }
        LoginObject loginObject5 = this.h;
        if (loginObject5 == null || (str2 = loginObject5.getDocType()) == null) {
            str2 = BuildConfig.FLAVOR;
        }
        LoginObject loginObject6 = this.h;
        if (loginObject6 == null || (str3 = loginObject6.getDocumentNumber()) == null) {
            str3 = BuildConfig.FLAVOR;
        }
        ProfileUserConverter.Companion companion2 = ProfileUserConverter.INSTANCE;
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        LoginObject loginObject7 = this.h;
        if (loginObject7 == null || (enumUserProfile = loginObject7.getRole()) == null) {
            enumUserProfile = EnumUserProfile.NONE;
        }
        BiometrixRequest biometrixRequest = new BiometrixRequest(str, str2, str3, companion2.getProfileReverse(requireContext2, enumUserProfile), enumBiometrixAction.getValue());
        FirstLoginViewModel firstLoginViewModel3 = this.k;
        if (firstLoginViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            firstLoginViewModel = firstLoginViewModel3;
        }
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        firstLoginViewModel.initBiometrix(requireActivity, biometrixRequest);
    }

    public final void k() {
        try {
            PermissionHelper.Companion companion = PermissionHelper.INSTANCE;
            FragmentActivity requireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            companion.requestCameraPermission(requireActivity, 1, new o5(this));
        } catch (Exception e) {
            e.getMessage();
            g(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Resources resources;
        Configuration configuration;
        super.onCreate(bundle);
        LoginRepository loginRepository = new LoginRepository();
        RefreshTokenRepository refreshTokenRepository = new RefreshTokenRepository();
        PasswordRecoveryRepository passwordRecoveryRepository = new PasswordRecoveryRepository();
        ChangeCenterRepository changeCenterRepository = new ChangeCenterRepository();
        BiometrixRepository biometrixRepository = new BiometrixRepository();
        SessionDao SessionDao = GeneralApp.INSTANCE.getDatabase().SessionDao();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        this.k = (FirstLoginViewModel) new ViewModelProvider(this, new FirstLoginViewModelFactory(loginRepository, refreshTokenRepository, passwordRecoveryRepository, changeCenterRepository, biometrixRepository, new SessionRepository(SessionDao, requireContext))).get(FirstLoginViewModel.class);
        setHasOptionsMenu(false);
        Context context = getContext();
        Integer valueOf = (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null) ? null : Integer.valueOf(configuration.uiMode & 48);
        if (valueOf != null && valueOf.intValue() == 32) {
            AppCompatDelegate.setDefaultNightMode(1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentFirstLoginBinding inflate = FragmentFirstLoginBinding.inflate(inflater, viewGroup, false);
        this.b = inflate;
        Intrinsics.checkNotNull(inflate);
        return inflate.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        NavBackStackEntry currentBackStackEntry;
        SavedStateHandle savedStateHandle;
        MutableLiveData liveData;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        this.j = FragmentKt.findNavController(this);
        PreferenceUtil.Companion companion = PreferenceUtil.INSTANCE;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        this.c = companion.getDocumentNumber(requireContext);
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        this.d = companion.getEmail(requireContext2);
        Context requireContext3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
        CenterDto cea = companion.getCEA(requireContext3);
        this.f = cea != null ? cea.getName() : null;
        try {
            Context requireContext4 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
            this.g = companion.getListCenterCEA(requireContext4);
            i(String.valueOf(this.f), this.g);
        } catch (Exception e) {
            e.getMessage();
        }
        PreferenceUtil.Companion companion2 = PreferenceUtil.INSTANCE;
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        Boolean isFirstLogin = companion2.getIsFirstLogin(requireActivity);
        boolean booleanValue = isFirstLogin != null ? isFirstLogin.booleanValue() : false;
        FragmentFirstLoginBinding fragmentFirstLoginBinding = this.b;
        if (fragmentFirstLoginBinding != null) {
            if (this.c != null) {
                Intrinsics.checkNotNull(fragmentFirstLoginBinding);
                fragmentFirstLoginBinding.tietTextInputUserLogin.setText(Editable.Factory.getInstance().newEditable(this.c));
            }
            FragmentFirstLoginBinding fragmentFirstLoginBinding2 = this.b;
            Intrinsics.checkNotNull(fragmentFirstLoginBinding2);
            fragmentFirstLoginBinding2.constraintMenuLogin.setVisibility(0);
            FragmentFirstLoginBinding fragmentFirstLoginBinding3 = this.b;
            Intrinsics.checkNotNull(fragmentFirstLoginBinding3);
            ConstraintLayout constraintLayout = fragmentFirstLoginBinding3.constraintMenuPassword;
            int i2 = 8;
            if (booleanValue) {
                i = 0;
            } else {
                if (booleanValue) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 8;
            }
            constraintLayout.setVisibility(i);
            FragmentFirstLoginBinding fragmentFirstLoginBinding4 = this.b;
            Intrinsics.checkNotNull(fragmentFirstLoginBinding4);
            LinearLayout linearLayout = fragmentFirstLoginBinding4.llRecoveryLogin;
            if (!booleanValue) {
                i2 = 0;
            } else if (!booleanValue) {
                throw new NoWhenBranchMatchedException();
            }
            linearLayout.setVisibility(i2);
            FragmentFirstLoginBinding fragmentFirstLoginBinding5 = this.b;
            Intrinsics.checkNotNull(fragmentFirstLoginBinding5);
            fragmentFirstLoginBinding5.tvInformationLogin.setVisibility(4);
            InputUtil.Companion companion3 = InputUtil.INSTANCE;
            FragmentActivity requireActivity2 = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
            FragmentFirstLoginBinding fragmentFirstLoginBinding6 = this.b;
            Intrinsics.checkNotNull(fragmentFirstLoginBinding6);
            TextInputLayout tilTextInputUserLogin = fragmentFirstLoginBinding6.tilTextInputUserLogin;
            Intrinsics.checkNotNullExpressionValue(tilTextInputUserLogin, "tilTextInputUserLogin");
            companion3.emailTextInputLayout(requireActivity2, tilTextInputUserLogin);
            FragmentActivity requireActivity3 = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity3, "requireActivity(...)");
            FragmentFirstLoginBinding fragmentFirstLoginBinding7 = this.b;
            Intrinsics.checkNotNull(fragmentFirstLoginBinding7);
            TextInputLayout tilTextInputUserPassword = fragmentFirstLoginBinding7.tilTextInputUserPassword;
            Intrinsics.checkNotNullExpressionValue(tilTextInputUserPassword, "tilTextInputUserPassword");
            companion3.passwordTextInputLayout(requireActivity3, tilTextInputUserPassword);
            FragmentFirstLoginBinding fragmentFirstLoginBinding8 = this.b;
            Intrinsics.checkNotNull(fragmentFirstLoginBinding8);
            fragmentFirstLoginBinding8.includeDropdownCea.til.setEndIconOnClickListener(null);
            FragmentFirstLoginBinding fragmentFirstLoginBinding9 = this.b;
            Intrinsics.checkNotNull(fragmentFirstLoginBinding9);
            fragmentFirstLoginBinding9.includeDropdownCea.actv.setHint(getString(R.string.dropdown_cea_hint));
            FragmentFirstLoginBinding fragmentFirstLoginBinding10 = this.b;
            Intrinsics.checkNotNull(fragmentFirstLoginBinding10);
            fragmentFirstLoginBinding10.includeDropdownCea.actv.setTextColor(ContextCompat.getColor(requireContext(), R.color.grey));
            FragmentFirstLoginBinding fragmentFirstLoginBinding11 = this.b;
            Intrinsics.checkNotNull(fragmentFirstLoginBinding11);
            fragmentFirstLoginBinding11.includeDropdownCea.actv.setDropDownBackgroundDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.dropdown_background, null));
            FragmentFirstLoginBinding fragmentFirstLoginBinding12 = this.b;
            Intrinsics.checkNotNull(fragmentFirstLoginBinding12);
            AutoCompleteTextView autoCompleteTextView = fragmentFirstLoginBinding12.includeDropdownCea.actv;
            FragmentFirstLoginBinding fragmentFirstLoginBinding13 = this.b;
            Intrinsics.checkNotNull(fragmentFirstLoginBinding13);
            autoCompleteTextView.setDropDownAnchor(fragmentFirstLoginBinding13.includeDropdownCea.actv.getId());
            ButtonUtil.Companion companion4 = ButtonUtil.INSTANCE;
            FragmentFirstLoginBinding fragmentFirstLoginBinding14 = this.b;
            Intrinsics.checkNotNull(fragmentFirstLoginBinding14);
            MaterialButton root = fragmentFirstLoginBinding14.includePrimaryButtonLogin.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            companion4.customPrimaryButton(root, getString(R.string.title_mb_login));
            FragmentFirstLoginBinding fragmentFirstLoginBinding15 = this.b;
            Intrinsics.checkNotNull(fragmentFirstLoginBinding15);
            fragmentFirstLoginBinding15.mtvVersionAppLogin.setText(BuildTypeUtil.Companion.getAppVersion$default(BuildTypeUtil.INSTANCE, false, 1, null));
            FragmentFirstLoginBinding fragmentFirstLoginBinding16 = this.b;
            Intrinsics.checkNotNull(fragmentFirstLoginBinding16);
            ConstraintLayout constraintMenuPassword = fragmentFirstLoginBinding16.constraintMenuPassword;
            Intrinsics.checkNotNullExpressionValue(constraintMenuPassword, "constraintMenuPassword");
            if (constraintMenuPassword.getVisibility() == 0) {
                FragmentFirstLoginBinding fragmentFirstLoginBinding17 = this.b;
                Intrinsics.checkNotNull(fragmentFirstLoginBinding17);
                ViewGroup.LayoutParams layoutParams = fragmentFirstLoginBinding17.constraintAllMenu.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins(0, 22, 0, 0);
            } else {
                FragmentFirstLoginBinding fragmentFirstLoginBinding18 = this.b;
                Intrinsics.checkNotNull(fragmentFirstLoginBinding18);
                ViewGroup.LayoutParams layoutParams2 = fragmentFirstLoginBinding18.constraintAllMenu.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams.setMargins(0, 220, 0, 0);
            }
            FragmentFirstLoginBinding fragmentFirstLoginBinding19 = this.b;
            Intrinsics.checkNotNull(fragmentFirstLoginBinding19);
            fragmentFirstLoginBinding19.constraintAllMenu.setLayoutParams(marginLayoutParams);
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new y4(this, null), 3, null);
            LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new b5(this, null), 3, null);
            LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3), null, null, new e5(this, null), 3, null);
            LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner4), null, null, new i5(this, null), 3, null);
            LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner5), null, null, new l5(this, null), 3, null);
            OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
            Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
            OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, this, false, new s4(this, 0), 2, null);
            FragmentFirstLoginBinding fragmentFirstLoginBinding20 = this.b;
            Intrinsics.checkNotNull(fragmentFirstLoginBinding20);
            fragmentFirstLoginBinding20.includeDropdownCea.actv.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: co.ceduladigital.sdk.t4
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view2, int i3, long j) {
                    FirstLoginFragment this$0 = FirstLoginFragment.this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    FragmentFirstLoginBinding fragmentFirstLoginBinding21 = this$0.b;
                    Intrinsics.checkNotNull(fragmentFirstLoginBinding21);
                    if (fragmentFirstLoginBinding21 != null) {
                        FragmentFirstLoginBinding fragmentFirstLoginBinding22 = this$0.b;
                        Intrinsics.checkNotNull(fragmentFirstLoginBinding22);
                        if (fragmentFirstLoginBinding22.includeDropdownCea != null) {
                            FragmentFirstLoginBinding fragmentFirstLoginBinding23 = this$0.b;
                            Intrinsics.checkNotNull(fragmentFirstLoginBinding23);
                            if (fragmentFirstLoginBinding23.includeDropdownCea.actv != null) {
                                Object itemAtPosition = adapterView.getItemAtPosition(i3);
                                Intrinsics.checkNotNull(itemAtPosition, "null cannot be cast to non-null type com.gse.aulapp.model.dto.CenterDto");
                                CenterDto centerDto = (CenterDto) itemAtPosition;
                                centerDto.getCenterID();
                                centerDto.getName();
                                centerDto.getAddress();
                                this$0.f = centerDto.getName();
                                FirstLoginViewModel firstLoginViewModel = this$0.k;
                                if (firstLoginViewModel == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                    firstLoginViewModel = null;
                                }
                                FragmentFirstLoginBinding fragmentFirstLoginBinding24 = this$0.b;
                                Intrinsics.checkNotNull(fragmentFirstLoginBinding24);
                                AutoCompleteTextView actv = fragmentFirstLoginBinding24.includeDropdownCea.actv;
                                Intrinsics.checkNotNullExpressionValue(actv, "actv");
                                firstLoginViewModel.selectItem(actv, centerDto);
                            }
                        }
                    }
                }
            });
            FragmentFirstLoginBinding fragmentFirstLoginBinding21 = this.b;
            Intrinsics.checkNotNull(fragmentFirstLoginBinding21);
            fragmentFirstLoginBinding21.includeDropdownCea.actv.setOnClickListener(new u4(this, 0));
            FragmentFirstLoginBinding fragmentFirstLoginBinding22 = this.b;
            Intrinsics.checkNotNull(fragmentFirstLoginBinding22);
            fragmentFirstLoginBinding22.includePrimaryButtonLogin.getRoot().setOnClickListener(new u4(this, 1));
            FragmentFirstLoginBinding fragmentFirstLoginBinding23 = this.b;
            Intrinsics.checkNotNull(fragmentFirstLoginBinding23);
            fragmentFirstLoginBinding23.mtvLinkRecoveryPasswordLogin.setOnClickListener(new u4(this, 2));
            NavController navController = this.j;
            if (navController == null || (currentBackStackEntry = navController.getCurrentBackStackEntry()) == null || (savedStateHandle = currentBackStackEntry.getSavedStateHandle()) == null || (liveData = savedStateHandle.getLiveData("result_key")) == null) {
                return;
            }
            liveData.observe(getViewLifecycleOwner(), new k0(new s4(this, 1)));
        }
    }
}
