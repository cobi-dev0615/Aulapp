package co.ceduladigital.sdk;

import android.content.Context;
import android.view.View;
import androidx.navigation.NavController;
import com.gse.aulapp.viewmodel.ClassInCourseViewModel;

/* loaded from: classes2.dex */
public final /* synthetic */ class i1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ClassInCourseViewModel b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ NavController e;

    public /* synthetic */ i1(ClassInCourseViewModel classInCourseViewModel, Context context, NavController navController, String str, int i) {
        this.a = i;
        this.b = classInCourseViewModel;
        this.d = context;
        this.e = navController;
        this.c = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ClassInCourseViewModel.validateConnection$lambda$26(this.b, this.c, this.d, this.e, view);
                break;
            case 1:
                ClassInCourseViewModel.showPendingFinish$lambda$24(this.b, this.c, this.d, this.e, view);
                break;
            case 2:
                ClassInCourseViewModel.showDialogPassExam$lambda$14(this.b, this.c, this.d, this.e, view);
                break;
            case 3:
                ClassInCourseViewModel.dialogExtraTimeClass$lambda$29(this.b, this.d, this.c, this.e, view);
                break;
            case 4:
                ClassInCourseViewModel.dialogCloseBeforeTime$lambda$12(this.b, this.d, this.e, this.c, view);
                break;
            default:
                ClassInCourseViewModel.dialogMaxExtraTimeClass$lambda$31(this.b, this.d, this.e, this.c, view);
                break;
        }
    }

    public /* synthetic */ i1(ClassInCourseViewModel classInCourseViewModel, Context context, String str, NavController navController) {
        this.a = 3;
        this.b = classInCourseViewModel;
        this.d = context;
        this.c = str;
        this.e = navController;
    }

    public /* synthetic */ i1(ClassInCourseViewModel classInCourseViewModel, String str, Context context, NavController navController, int i) {
        this.a = i;
        this.b = classInCourseViewModel;
        this.c = str;
        this.d = context;
        this.e = navController;
    }
}
