package co.ceduladigital.sdk;

import android.app.AlertDialog;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.enumerate.EnumDialogType;
import com.gse.aulapp.model.response.ErrorResponse;
import com.gse.aulapp.view.fragment.FirstLoginFragment;
import com.karumi.dexter.BuildConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes2.dex */
public final class c5 implements FlowCollector {
    public final /* synthetic */ FirstLoginFragment a;

    public c5(FirstLoginFragment firstLoginFragment) {
        this.a = firstLoginFragment;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        String str;
        String str2;
        Status status = (Status) obj;
        boolean z = status instanceof Status.Loading;
        FirstLoginFragment firstLoginFragment = this.a;
        if (z) {
            firstLoginFragment.g(true);
        } else if (status instanceof Status.Success) {
            firstLoginFragment.g(false);
            FirstLoginFragment.b(firstLoginFragment, true);
            AlertDialog alertDialog = firstLoginFragment.e;
            Intrinsics.checkNotNull(alertDialog);
            alertDialog.show();
        } else if (status instanceof Status.Failure) {
            firstLoginFragment.g(false);
            FirstLoginFragment.b(firstLoginFragment, false);
            Status.Failure failure = (Status.Failure) status;
            String message = failure.getE().getMessage();
            if (Intrinsics.areEqual(message, "Sin respuesta del servicio") || Intrinsics.areEqual(message, "Registre el campo de usuario")) {
                Object c = FirstLoginFragment.c(firstLoginFragment, String.valueOf(failure.getE().getMessage()), continuation);
                return c == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? c : Unit.INSTANCE;
            }
        } else if (!(status instanceof Status.Empty)) {
            if (!(status instanceof Status.Exception)) {
                throw new NoWhenBranchMatchedException();
            }
            firstLoginFragment.g(false);
            Status.Exception exception = (Status.Exception) status;
            Object data = exception.getData();
            boolean z2 = data instanceof ErrorResponse;
            String str3 = BuildConfig.FLAVOR;
            if (z2) {
                String message2 = ((ErrorResponse) exception.getData()).getResult().getMessage();
                if (message2 == null) {
                    message2 = BuildConfig.FLAVOR;
                }
                String code = ((ErrorResponse) exception.getData()).getResult().getCode();
                if (code != null) {
                    str3 = code;
                }
                str = message2;
            } else if (data instanceof String) {
                str = (String) exception.getData();
            } else {
                str = BuildConfig.FLAVOR;
                str2 = str;
                FirstLoginFragment.f(firstLoginFragment, EnumDialogType.DIALOG_WITH_MESSAGE, str, str2, new t1(13), 8);
            }
            str2 = str3;
            FirstLoginFragment.f(firstLoginFragment, EnumDialogType.DIALOG_WITH_MESSAGE, str, str2, new t1(13), 8);
        }
        return Unit.INSTANCE;
    }
}
