package co.ceduladigital.sdk;

import android.app.Activity;
import android.view.View;
import com.gse.aulapp.util.GpsUtil;
import com.gse.aulapp.util.NavigationUtil;
import com.gse.aulapp.util.PermissionHelper;
import com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel;

/* loaded from: classes2.dex */
public final /* synthetic */ class q2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ q2(Activity activity, int i) {
        this.a = i;
        this.b = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ClassPracticeBeforeViewModel.validateNfcStatus$lambda$5(this.b, view);
                break;
            case 1:
                GpsUtil.Companion.validateHardwareAndGpsTurnOn$lambda$6(this.b, view);
                break;
            case 2:
                NavigationUtil.Companion.dialogEmulator$lambda$0(this.b, view);
                break;
            default:
                PermissionHelper.Companion.showDialogActivatePermissionManually$lambda$0(this.b, view);
                break;
        }
    }
}
