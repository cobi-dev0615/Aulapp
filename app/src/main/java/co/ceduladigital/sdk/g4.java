package co.ceduladigital.sdk;

import android.app.AlertDialog;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.gse.aulapp.model.enumerate.EnumStatusFingerPrintBiometric;
import com.gse.aulapp.util.PermissionHelper;
import com.gse.aulapp.util.ViewUtil;
import com.gse.aulapp.view.fragment.FingerPrintBiometricFragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class g4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FingerPrintBiometricFragment b;

    public /* synthetic */ g4(FingerPrintBiometricFragment fingerPrintBiometricFragment, int i) {
        this.a = i;
        this.b = fingerPrintBiometricFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                FingerPrintBiometricFragment this$0 = this.b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.c(EnumStatusFingerPrintBiometric.TIMEOUT);
                AlertDialog alertDialog = this$0.d;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                    break;
                }
                break;
            case 1:
                FingerPrintBiometricFragment this$02 = this.b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                AlertDialog alertDialog2 = this$02.d;
                if (alertDialog2 != null) {
                    alertDialog2.dismiss();
                    break;
                }
                break;
            case 2:
                FingerPrintBiometricFragment this$03 = this.b;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                ViewUtil.Companion companion = ViewUtil.INSTANCE;
                Intrinsics.checkNotNull(view);
                companion.preventDoubleClick(view);
                this$03.d(true);
                try {
                    PermissionHelper.Companion companion2 = PermissionHelper.INSTANCE;
                    FragmentActivity requireActivity = this$03.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                    companion2.requestCameraPermission(requireActivity, 0, new l4(this$03));
                    break;
                } catch (Exception e) {
                    this$03.getTag();
                    e.getMessage();
                    return;
                }
            default:
                FingerPrintBiometricFragment this$04 = this.b;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                AlertDialog alertDialog3 = this$04.d;
                if (alertDialog3 != null) {
                    alertDialog3.dismiss();
                    break;
                }
                break;
        }
    }
}
