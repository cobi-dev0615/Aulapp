package co.ceduladigital.sdk;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.navigation.NavController;
import com.gse.aulapp.databinding.FragmentPasswordRecoverBinding;
import com.gse.aulapp.viewmodel.PasswordRecoverViewModel;
import com.gse.aulapp.viewmodel.PracticeClassViewModel;

/* loaded from: classes2.dex */
public final /* synthetic */ class r7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ NavController d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r7(PracticeClassViewModel practiceClassViewModel, Context context, NavController navController, String str, int i) {
        this.a = i;
        this.b = practiceClassViewModel;
        this.c = context;
        this.d = navController;
        this.e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                PracticeClassViewModel.dialogCloseBeforeTime$lambda$12((Context) this.c, (PracticeClassViewModel) this.b, (String) this.e, this.d, view);
                break;
            case 1:
                PracticeClassViewModel.dialogMaxExtraTimeClass$lambda$19((PracticeClassViewModel) this.b, (Context) this.c, this.d, (String) this.e, view);
                break;
            case 2:
                PracticeClassViewModel.dialogExtraTimeClass$lambda$17((PracticeClassViewModel) this.b, (Context) this.c, this.d, (String) this.e, view);
                break;
            default:
                PasswordRecoverViewModel.initPasswordRecovery$lambda$0((PasswordRecoverViewModel) this.c, (Activity) this.b, (FragmentPasswordRecoverBinding) this.e, this.d, view);
                break;
        }
    }

    public /* synthetic */ r7(Object obj, Object obj2, Object obj3, NavController navController, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
        this.e = obj3;
        this.d = navController;
    }
}
