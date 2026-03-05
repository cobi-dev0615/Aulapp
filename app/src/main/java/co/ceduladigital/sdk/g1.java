package co.ceduladigital.sdk;

import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import androidx.navigation.NavController;
import androidx.view.ViewModel;
import com.gse.aulapp.databinding.FragmentHomeBinding;
import com.gse.aulapp.viewmodel.ClassInCourseViewModel;
import com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel;
import com.gse.aulapp.viewmodel.HomeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class g1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ViewModel e;

    public /* synthetic */ g1(ViewModel viewModel, Context context, Object obj, Object obj2, int i) {
        this.a = i;
        this.e = viewModel;
        this.b = context;
        this.c = obj;
        this.d = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit dialogExtraTimeClass$lambda$29$lambda$28$lambda$27;
        Unit exitValidation$lambda$11;
        Unit showDialogLogOut$lambda$14;
        switch (this.a) {
            case 0:
                dialogExtraTimeClass$lambda$29$lambda$28$lambda$27 = ClassInCourseViewModel.dialogExtraTimeClass$lambda$29$lambda$28$lambda$27((ClassInCourseViewModel) this.e, this.b, (String) this.c, (NavController) this.d);
                return dialogExtraTimeClass$lambda$29$lambda$28$lambda$27;
            case 1:
                exitValidation$lambda$11 = ClassPracticeBeforeViewModel.exitValidation$lambda$11((ClassPracticeBeforeViewModel) this.e, this.b, (String) this.c, (NavController) this.d);
                return exitValidation$lambda$11;
            default:
                showDialogLogOut$lambda$14 = HomeViewModel.showDialogLogOut$lambda$14((HomeViewModel) this.e, (Activity) this.b, (FragmentHomeBinding) this.c, (Menu) this.d);
                return showDialogLogOut$lambda$14;
        }
    }
}
