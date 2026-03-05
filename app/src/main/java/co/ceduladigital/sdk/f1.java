package co.ceduladigital.sdk;

import android.app.Activity;
import com.gse.aulapp.viewmodel.ClassInCourseViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class f1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ClassInCourseViewModel b;
    public final /* synthetic */ Activity c;

    public /* synthetic */ f1(ClassInCourseViewModel classInCourseViewModel, Activity activity, int i) {
        this.a = i;
        this.b = classInCourseViewModel;
        this.c = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit showDialogIsMock$lambda$33;
        Unit startGpsTrace$lambda$21;
        switch (this.a) {
            case 0:
                showDialogIsMock$lambda$33 = ClassInCourseViewModel.showDialogIsMock$lambda$33(this.b, this.c);
                return showDialogIsMock$lambda$33;
            default:
                startGpsTrace$lambda$21 = ClassInCourseViewModel.startGpsTrace$lambda$21(this.b, this.c);
                return startGpsTrace$lambda$21;
        }
    }
}
