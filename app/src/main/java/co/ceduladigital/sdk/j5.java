package co.ceduladigital.sdk;

import androidx.navigation.NavController;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.dto.LoginObject;
import com.gse.aulapp.model.enumerate.EnumDialogType;
import com.gse.aulapp.model.response.ErrorResponse;
import com.gse.aulapp.view.fragment.FirstLoginFragment;
import com.karumi.dexter.BuildConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes2.dex */
public final class j5 implements FlowCollector {
    public final /* synthetic */ FirstLoginFragment a;

    public j5(FirstLoginFragment firstLoginFragment) {
        this.a = firstLoginFragment;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        String str;
        Status status = (Status) obj;
        boolean z = status instanceof Status.Loading;
        FirstLoginFragment firstLoginFragment = this.a;
        if (z) {
            firstLoginFragment.g(((Status.Loading) status).getShow());
        } else {
            if (status instanceof Status.Success) {
                Status.Success success = (Status.Success) status;
                if (success.getData() instanceof String) {
                    NavController navController = firstLoginFragment.j;
                    if (navController != null) {
                        String urlAction = (String) success.getData();
                        LoginObject loginObject = firstLoginFragment.h;
                        boolean areEqual = loginObject != null ? Intrinsics.areEqual(loginObject.getFullEnrollment(), Boxing.boxBoolean(false)) : false;
                        Intrinsics.checkNotNullParameter(urlAction, "urlAction");
                        navController.navigate(new q5(urlAction, areEqual));
                    }
                } else {
                    firstLoginFragment.g(false);
                    FirstLoginFragment.f(firstLoginFragment, null, BuildConfig.FLAVOR, null, new t1(14), 13);
                }
            } else if (status instanceof Status.Failure) {
                firstLoginFragment.g(false);
                FirstLoginFragment.f(firstLoginFragment, null, BuildConfig.FLAVOR, null, new t1(15), 13);
            } else if (!(status instanceof Status.Empty)) {
                if (status instanceof Status.Exception) {
                    firstLoginFragment.g(false);
                    Status.Exception exception = (Status.Exception) status;
                    Object data = exception.getData();
                    boolean z2 = data instanceof ErrorResponse;
                    String str2 = BuildConfig.FLAVOR;
                    if (z2) {
                        String message = ((ErrorResponse) exception.getData()).getResult().getMessage();
                        if (message == null) {
                            message = "Ha ocurrido un error interno en la aplicación, estamos trabajando para solucionarlo.";
                        }
                        String code = ((ErrorResponse) exception.getData()).getResult().getCode();
                        if (code != null) {
                            str2 = code;
                        }
                        str = str2;
                        str2 = message;
                    } else if (data instanceof String) {
                        String str3 = (String) exception.getData();
                        str = BuildConfig.FLAVOR;
                        str2 = str3;
                    } else {
                        str = BuildConfig.FLAVOR;
                    }
                    FirstLoginFragment.f(firstLoginFragment, EnumDialogType.DIALOG_WITH_MESSAGE, str2, str, new t1(16), 8);
                } else {
                    firstLoginFragment.g(false);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
