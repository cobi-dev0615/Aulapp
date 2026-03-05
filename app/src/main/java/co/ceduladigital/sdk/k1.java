package co.ceduladigital.sdk;

import android.view.View;
import com.gse.aulapp.util.DialogNormalUtil;
import com.gse.aulapp.util.DialogUtil;
import com.gse.aulapp.util.GpsUtil;
import com.gse.aulapp.util.PermissionHelper;
import com.gse.aulapp.util.PermissionHelper$Companion$requestPermission$1;
import com.gse.aulapp.viewmodel.ClassInCourseViewModel;
import com.gse.aulapp.viewmodel.PracticeClassViewModel;

/* loaded from: classes2.dex */
public final /* synthetic */ class k1 implements View.OnClickListener {
    public final /* synthetic */ int a;

    public /* synthetic */ k1(int i) {
        this.a = i;
    }

    private final void a(View view) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ClassInCourseViewModel.failConnection$lambda$23(view);
                break;
            case 1:
                ClassInCourseViewModel.dialogMaxExtraTimeClass$lambda$32(view);
                break;
            case 2:
                DialogNormalUtil.showDialogExamInfo$lambda$0(view);
                break;
            case 3:
                DialogUtil.Companion.showGlobalDialogController$lambda$7(view);
                break;
            case 4:
                GpsUtil.Companion.validateHardwareAndGpsTurnOn$lambda$7(view);
                break;
            case 5:
                break;
            case 6:
                PermissionHelper.Companion.showDialogActivatePermissionManually$lambda$1(view);
                break;
            case 7:
                PermissionHelper$Companion$requestPermission$1.onPermissionDenied$lambda$2(view);
                break;
            default:
                PracticeClassViewModel.dialogMaxExtraTimeClass$lambda$20(view);
                break;
        }
    }
}
