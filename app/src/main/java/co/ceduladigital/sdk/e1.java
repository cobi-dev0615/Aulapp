package co.ceduladigital.sdk;

import android.content.Context;
import androidx.navigation.NavController;
import com.gse.aulapp.viewmodel.ClassInCourseViewModel;

/* loaded from: classes2.dex */
public final /* synthetic */ class e1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ClassInCourseViewModel b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ String d;
    public final /* synthetic */ NavController e;

    public /* synthetic */ e1(ClassInCourseViewModel classInCourseViewModel, Context context, NavController navController, String str) {
        this.b = classInCourseViewModel;
        this.c = context;
        this.e = navController;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ClassInCourseViewModel.dialogMaxExtraTimeClass$lambda$31$lambda$30(this.b, this.c, this.e, this.d);
                break;
            default:
                ClassInCourseViewModel.dialogExtraTimeClass$lambda$29$lambda$28(this.b, this.c, this.d, this.e);
                break;
        }
    }

    public /* synthetic */ e1(ClassInCourseViewModel classInCourseViewModel, Context context, String str, NavController navController) {
        this.b = classInCourseViewModel;
        this.c = context;
        this.d = str;
        this.e = navController;
    }
}
