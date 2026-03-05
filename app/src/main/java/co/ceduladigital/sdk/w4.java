package co.ceduladigital.sdk;

import android.widget.TextView;
import com.gse.aulapp.databinding.FragmentFirstLoginBinding;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.dto.CenterDto;
import com.gse.aulapp.model.dto.LoginObject;
import com.gse.aulapp.view.fragment.FirstLoginFragment;
import com.karumi.dexter.BuildConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes2.dex */
public final class w4 implements FlowCollector {
    public final /* synthetic */ FirstLoginFragment a;

    public w4(FirstLoginFragment firstLoginFragment) {
        this.a = firstLoginFragment;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Status status = (Status) obj;
        boolean z = status instanceof Status.Loading;
        FirstLoginFragment firstLoginFragment = this.a;
        if (z) {
            firstLoginFragment.g(true);
        } else if (status instanceof Status.Success) {
            firstLoginFragment.g(false);
            FragmentFirstLoginBinding fragmentFirstLoginBinding = firstLoginFragment.b;
            Intrinsics.checkNotNull(fragmentFirstLoginBinding);
            fragmentFirstLoginBinding.tvInformationLogin.setVisibility(4);
            Object data = ((Status.Success) status).getData();
            Intrinsics.checkNotNull(data, "null cannot be cast to non-null type com.gse.aulapp.model.dto.LoginObject");
            LoginObject loginObject = (LoginObject) data;
            firstLoginFragment.h = loginObject;
            if (loginObject.getCenterList() != null) {
                List<CenterDto> centerList = loginObject.getCenterList();
                Intrinsics.checkNotNull(centerList);
                if (centerList.size() > 1) {
                    List<CenterDto> centerList2 = loginObject.getCenterList();
                    Intrinsics.checkNotNull(centerList2);
                    firstLoginFragment.g = centerList2;
                    firstLoginFragment.d = loginObject.getEmail();
                    firstLoginFragment.c = loginObject.getDocumentNumber();
                    FragmentFirstLoginBinding fragmentFirstLoginBinding2 = firstLoginFragment.b;
                    Intrinsics.checkNotNull(fragmentFirstLoginBinding2);
                    fragmentFirstLoginBinding2.tilTextInputUserLogin.setEnabled(false);
                    FragmentFirstLoginBinding fragmentFirstLoginBinding3 = firstLoginFragment.b;
                    Intrinsics.checkNotNull(fragmentFirstLoginBinding3);
                    fragmentFirstLoginBinding3.tilTextInputUserPassword.setEnabled(false);
                    firstLoginFragment.i(BuildConfig.FLAVOR, firstLoginFragment.g);
                }
            }
            FirstLoginFragment.e(firstLoginFragment, loginObject);
        } else if (status instanceof Status.Failure) {
            Throwable e = ((Status.Failure) status).getE();
            FragmentFirstLoginBinding fragmentFirstLoginBinding4 = firstLoginFragment.b;
            Intrinsics.checkNotNull(fragmentFirstLoginBinding4);
            fragmentFirstLoginBinding4.tvInformationLogin.setVisibility(0);
            FragmentFirstLoginBinding fragmentFirstLoginBinding5 = firstLoginFragment.b;
            Intrinsics.checkNotNull(fragmentFirstLoginBinding5);
            TextView textView = fragmentFirstLoginBinding5.tvInformationLogin;
            String message = e.getMessage();
            if (message == null) {
                message = "Ha ocurrido un error interno en la aplicación, estamos trabajando para solucionarlo.";
            }
            textView.setText(message);
            FirstLoginFragment.d(firstLoginFragment);
        } else if (!(status instanceof Status.Empty)) {
            firstLoginFragment.g(false);
        }
        return Unit.INSTANCE;
    }
}
