package co.ceduladigital.sdk;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.fragment.FragmentKt;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.gse.aulapp.databinding.FragmentClassPracticeBeforeBinding;
import com.gse.aulapp.databinding.FragmentHomeBinding;
import com.gse.aulapp.databinding.FragmentLoginBinding;
import com.gse.aulapp.databinding.FragmentPasswordRecoverBinding;
import com.gse.aulapp.util.DialogUtil;
import com.gse.aulapp.util.FingerPrintBiometricUtil;
import com.gse.aulapp.util.PermissionHelper$Companion$requestPermission$1;
import com.gse.aulapp.view.activity.MainActivity;
import com.gse.aulapp.view.activity.PrincipalActivity;
import com.gse.aulapp.view.fragment.HomeFragment;
import com.gse.aulapp.view.fragment.LoginFragment;
import com.gse.aulapp.view.fragment.PasswordRecoverFragment;
import com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel;
import com.gse.aulapp.viewmodel.HomeViewModel;
import com.gse.aulapp.viewmodel.LoginViewModel;
import com.gse.aulapp.viewmodel.PasswordRecoverViewModel;
import com.gse.aulapp.viewmodel.PracticeClassViewModel;
import com.karumi.dexter.PermissionToken;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class r2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ClassPracticeBeforeViewModel.setDataSessionDetail$lambda$2((FragmentClassPracticeBeforeBinding) this.b, view);
                break;
            case 1:
                DialogUtil.Companion.showGlobalDialogController$lambda$6((Function0) this.b, view);
                break;
            case 2:
                FingerPrintBiometricUtil.Companion.verifyHand$lambda$1((FragmentActivity) this.b, view);
                break;
            case 3:
                HomeFragment this$0 = (HomeFragment) this.b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                HomeViewModel homeViewModel = this$0.a;
                if (homeViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    homeViewModel = null;
                }
                FragmentHomeBinding fragmentHomeBinding = this$0.c;
                Intrinsics.checkNotNull(fragmentHomeBinding);
                homeViewModel.onClickActionFilter(fragmentHomeBinding);
                break;
            case 4:
                HomeViewModel.showDialogClassStarted$lambda$29((HomeViewModel) this.b, view);
                break;
            case 5:
                LoginFragment this$02 = (LoginFragment) this.b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                LoginViewModel loginViewModel = this$02.a;
                if (loginViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    loginViewModel = null;
                }
                FragmentActivity requireActivity = this$02.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                FragmentLoginBinding fragmentLoginBinding = this$02.b;
                Intrinsics.checkNotNull(fragmentLoginBinding);
                loginViewModel.continueLogin(requireActivity, fragmentLoginBinding, FragmentKt.findNavController(this$02));
                break;
            case 6:
                MainActivity.onCreate$lambda$0((MainActivity) this.b, view);
                break;
            case 7:
                throw new UnsupportedOperationException("Not decompiled");
            case 8:
                PasswordRecoverFragment this$03 = (PasswordRecoverFragment) this.b;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                PasswordRecoverViewModel passwordRecoverViewModel = this$03.a;
                if (passwordRecoverViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    passwordRecoverViewModel = null;
                }
                FragmentActivity requireActivity2 = this$03.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
                FragmentPasswordRecoverBinding fragmentPasswordRecoverBinding = this$03.b;
                Intrinsics.checkNotNull(fragmentPasswordRecoverBinding);
                passwordRecoverViewModel.initPasswordRecovery(requireActivity2, fragmentPasswordRecoverBinding, FragmentKt.findNavController(this$03));
                break;
            case 9:
                PasswordRecoverViewModel.callDialog$lambda$1((PasswordRecoverViewModel) this.b, view);
                break;
            case 10:
                PermissionHelper$Companion$requestPermission$1.onPermissionRationaleShouldBeShown$lambda$3((PermissionToken) this.b, view);
                break;
            case 11:
                PracticeClassViewModel.dialogMaxTimeClass$lambda$8((PracticeClassViewModel) this.b, view);
                break;
            default:
                PrincipalActivity.onCreate$lambda$0((PrincipalActivity) this.b, view);
                break;
        }
    }
}
