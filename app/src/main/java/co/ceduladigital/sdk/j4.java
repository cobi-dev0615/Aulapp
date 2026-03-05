package co.ceduladigital.sdk;

import android.util.Log;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.view.fragment.FingerPrintBiometricFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes2.dex */
public final class j4 implements FlowCollector {
    public final /* synthetic */ FingerPrintBiometricFragment a;

    public j4(FingerPrintBiometricFragment fingerPrintBiometricFragment) {
        this.a = fingerPrintBiometricFragment;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        boolean contains$default;
        Status status = (Status) obj;
        boolean z = status instanceof Status.Success;
        FingerPrintBiometricFragment fingerPrintBiometricFragment = this.a;
        if (z) {
            fingerPrintBiometricFragment.d(true);
        } else if (status instanceof Status.Exception) {
            contains$default = StringsKt.contains$default(((Status.Exception) status).getData().toString(), (CharSequence) "activty paused on back pressed", false, 2, (Object) null);
            if (contains$default) {
                fingerPrintBiometricFragment.requireActivity().onBackPressed();
            } else {
                fingerPrintBiometricFragment.d(false);
            }
        } else if (status instanceof Status.Failure) {
            fingerPrintBiometricFragment.d(false);
        } else if (status instanceof Status.Loading) {
            fingerPrintBiometricFragment.d(true);
        } else {
            Boxing.boxInt(Log.e(fingerPrintBiometricFragment.getTag(), "Error in collects"));
        }
        return Unit.INSTANCE;
    }
}
