package co.ceduladigital.sdk;

import android.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import androidx.activity.OnBackPressedCallback;
import com.gse.aulapp.databinding.FragmentFirstLoginBinding;
import com.gse.aulapp.model.data.statusControl.BiometrixResult;
import com.gse.aulapp.model.enumerate.EnumDialogType;
import com.gse.aulapp.util.DialogUtil;
import com.gse.aulapp.view.fragment.FirstLoginFragment;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class s4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FirstLoginFragment b;

    public /* synthetic */ s4(FirstLoginFragment firstLoginFragment, int i) {
        this.a = i;
        this.b = firstLoginFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                OnBackPressedCallback addCallback = (OnBackPressedCallback) obj;
                FirstLoginFragment this$0 = this.b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
                FragmentFirstLoginBinding fragmentFirstLoginBinding = this$0.b;
                Intrinsics.checkNotNull(fragmentFirstLoginBinding);
                fragmentFirstLoginBinding.tilTextInputUserLogin.setEnabled(true);
                FragmentFirstLoginBinding fragmentFirstLoginBinding2 = this$0.b;
                Intrinsics.checkNotNull(fragmentFirstLoginBinding2);
                fragmentFirstLoginBinding2.tilTextInputUserPassword.setEnabled(true);
                this$0.g = CollectionsKt.emptyList();
                FragmentFirstLoginBinding fragmentFirstLoginBinding3 = this$0.b;
                Intrinsics.checkNotNull(fragmentFirstLoginBinding3);
                fragmentFirstLoginBinding3.constraintMenuCea.setVisibility(8);
                FragmentFirstLoginBinding fragmentFirstLoginBinding4 = this$0.b;
                Intrinsics.checkNotNull(fragmentFirstLoginBinding4);
                fragmentFirstLoginBinding4.ivIconRecoveryLogin.setVisibility(0);
                FragmentFirstLoginBinding fragmentFirstLoginBinding5 = this$0.b;
                Intrinsics.checkNotNull(fragmentFirstLoginBinding5);
                fragmentFirstLoginBinding5.mtvLinkRecoveryPasswordLogin.setVisibility(0);
                break;
            default:
                BiometrixResult result = (BiometrixResult) obj;
                FirstLoginFragment this$02 = this.b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(result, "result");
                this$02.g(true);
                if (v4.$EnumSwitchMapping$1[result.getMethod().ordinal()] == 1) {
                    int i = v4.$EnumSwitchMapping$0[result.getStatus().ordinal()];
                    if (i == 1 || i == 2) {
                        result.toString();
                        EnumDialogType enumDialogType = EnumDialogType.SUCCESS_REGISTERED_FACE;
                        r4 r4Var = new r4(this$02, 1);
                        AlertDialog alertDialog = this$02.e;
                        if (alertDialog != null) {
                            alertDialog.dismiss();
                        }
                        DialogUtil.Companion companion = DialogUtil.INSTANCE;
                        FragmentActivity requireActivity = this$02.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                        AlertDialog showInformationFullDialogBiometricRegistrationResponse = companion.showInformationFullDialogBiometricRegistrationResponse(requireActivity, enumDialogType, false, true, new f0(this$02, r4Var, 3));
                        this$02.e = showInformationFullDialogBiometricRegistrationResponse;
                        if (showInformationFullDialogBiometricRegistrationResponse != null) {
                            showInformationFullDialogBiometricRegistrationResponse.show();
                        }
                    } else {
                        result.toString();
                        this$02.g(false);
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
