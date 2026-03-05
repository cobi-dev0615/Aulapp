package co.ceduladigital.sdk;

import android.content.Context;
import androidx.navigation.NavController;
import com.gse.aulapp.viewmodel.PracticeClassViewModel;

/* loaded from: classes2.dex */
public final /* synthetic */ class s7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PracticeClassViewModel b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ NavController d;
    public final /* synthetic */ String e;

    public /* synthetic */ s7(PracticeClassViewModel practiceClassViewModel, Context context, NavController navController, String str, int i) {
        this.a = i;
        this.b = practiceClassViewModel;
        this.c = context;
        this.d = navController;
        this.e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                PracticeClassViewModel.dialogExtraTimeClass$lambda$17$lambda$16(this.b, this.c, this.d, this.e);
                break;
            default:
                PracticeClassViewModel.dialogMaxExtraTimeClass$lambda$19$lambda$18(this.b, this.c, this.d, this.e);
                break;
        }
    }
}
