package co.ceduladigital.sdk;

import androidx.fragment.app.FragmentActivity;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.enumerate.EnumDialogType;
import com.gse.aulapp.util.DialogUtil;
import com.gse.aulapp.view.fragment.LoginFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes2.dex */
public final class u6 implements FlowCollector {
    public final /* synthetic */ LoginFragment a;

    public u6(LoginFragment loginFragment) {
        this.a = loginFragment;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Status status = (Status) obj;
        if (!(status instanceof Status.Loading) && !(status instanceof Status.Success)) {
            if (status instanceof Status.Failure) {
                String message = ((Status.Failure) status).getE().getMessage();
                if (message != null) {
                    Intrinsics.areEqual(message, "401");
                    DialogUtil.Companion companion = DialogUtil.INSTANCE;
                    FragmentActivity requireActivity = this.a.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                    DialogUtil.Companion.showErrorDialog$default(companion, requireActivity, EnumDialogType.DIALOG_TYPE_GENERAL_ERROR, null, null, message, false, null, 12, null);
                }
            } else {
                boolean z = status instanceof Status.Empty;
            }
        }
        return Unit.INSTANCE;
    }
}
