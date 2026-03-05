package co.ceduladigital.sdk;

import android.view.View;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import com.gse.aulapp.util.ControllerFinishClassOrExamUtil;

/* loaded from: classes.dex */
public final /* synthetic */ class b3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ NavController c;
    public final /* synthetic */ NavDirections d;

    public /* synthetic */ b3(String str, NavController navController, NavDirections navDirections, int i) {
        this.a = i;
        this.b = str;
        this.c = navController;
        this.d = navDirections;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ControllerFinishClassOrExamUtil.Companion.showPendingFinish$lambda$0(this.b, this.c, this.d, view);
                break;
            default:
                ControllerFinishClassOrExamUtil.Companion.showDialogPassExam$lambda$1(this.b, this.c, this.d, view);
                break;
        }
    }
}
