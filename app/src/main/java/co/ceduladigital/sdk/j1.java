package co.ceduladigital.sdk;

import android.view.View;
import com.gse.aulapp.viewmodel.ClassInCourseViewModel;

/* loaded from: classes2.dex */
public final /* synthetic */ class j1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ClassInCourseViewModel b;

    public /* synthetic */ j1(ClassInCourseViewModel classInCourseViewModel, int i) {
        this.a = i;
        this.b = classInCourseViewModel;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ClassInCourseViewModel.failConnection$lambda$22(this.b, view);
                break;
            default:
                ClassInCourseViewModel.dialogMaxTimeClass$lambda$11(this.b, view);
                break;
        }
    }
}
