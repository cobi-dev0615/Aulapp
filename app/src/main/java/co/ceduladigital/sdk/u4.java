package co.ceduladigital.sdk;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.gse.aulapp.databinding.FragmentFirstLoginBinding;
import com.gse.aulapp.util.PreferenceUtil;
import com.gse.aulapp.util.UtilDropDown;
import com.gse.aulapp.view.fragment.FirstLoginFragment;
import com.gse.aulapp.viewmodel.FirstLoginViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class u4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FirstLoginFragment b;

    public /* synthetic */ u4(FirstLoginFragment firstLoginFragment, int i) {
        this.a = i;
        this.b = firstLoginFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                FirstLoginFragment this$0 = this.b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                FragmentFirstLoginBinding fragmentFirstLoginBinding = this$0.b;
                Intrinsics.checkNotNull(fragmentFirstLoginBinding);
                if (fragmentFirstLoginBinding != null) {
                    FragmentFirstLoginBinding fragmentFirstLoginBinding2 = this$0.b;
                    Intrinsics.checkNotNull(fragmentFirstLoginBinding2);
                    if (fragmentFirstLoginBinding2.includeDropdownCea != null) {
                        FragmentFirstLoginBinding fragmentFirstLoginBinding3 = this$0.b;
                        Intrinsics.checkNotNull(fragmentFirstLoginBinding3);
                        UtilDropDown.changeStateDropdown(fragmentFirstLoginBinding3.includeDropdownCea.actv);
                        break;
                    }
                }
                break;
            case 1:
                FirstLoginFragment this$02 = this.b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                FragmentFirstLoginBinding fragmentFirstLoginBinding4 = this$02.b;
                Intrinsics.checkNotNull(fragmentFirstLoginBinding4);
                fragmentFirstLoginBinding4.tvInformationLogin.setVisibility(4);
                PreferenceUtil.Companion companion = PreferenceUtil.INSTANCE;
                FragmentActivity requireActivity = this$02.requireActivity();
                FragmentFirstLoginBinding fragmentFirstLoginBinding5 = this$02.b;
                Intrinsics.checkNotNull(fragmentFirstLoginBinding5);
                companion.saveDocumentNumber(requireActivity, String.valueOf(fragmentFirstLoginBinding5.tietTextInputUserLogin.getText()));
                FragmentActivity requireActivity2 = this$02.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
                Boolean isFirstLogin = companion.getIsFirstLogin(requireActivity2);
                boolean booleanValue = isFirstLogin != null ? isFirstLogin.booleanValue() : false;
                FirstLoginViewModel firstLoginViewModel = this$02.k;
                if (firstLoginViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    firstLoginViewModel = null;
                }
                FragmentActivity requireActivity3 = this$02.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity3, "requireActivity(...)");
                FragmentFirstLoginBinding fragmentFirstLoginBinding6 = this$02.b;
                Intrinsics.checkNotNull(fragmentFirstLoginBinding6);
                firstLoginViewModel.validateLogin(requireActivity3, fragmentFirstLoginBinding6, booleanValue, this$02.d, this$02.c, this$02.f, this$02.g);
                break;
            case 2:
                FirstLoginFragment this$03 = this.b;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                FirstLoginViewModel firstLoginViewModel2 = this$03.k;
                if (firstLoginViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    firstLoginViewModel2 = null;
                }
                Context requireContext = this$03.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                FragmentFirstLoginBinding fragmentFirstLoginBinding7 = this$03.b;
                Intrinsics.checkNotNull(fragmentFirstLoginBinding7);
                firstLoginViewModel2.recoverPassword(requireContext, String.valueOf(fragmentFirstLoginBinding7.tietTextInputUserLogin.getText()));
                break;
            default:
                FirstLoginFragment this$04 = this.b;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                AlertDialog alertDialog = this$04.e;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                    break;
                }
                break;
        }
    }
}
