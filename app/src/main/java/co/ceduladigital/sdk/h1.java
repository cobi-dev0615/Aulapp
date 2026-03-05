package co.ceduladigital.sdk;

import android.content.Context;
import android.view.View;
import androidx.navigation.NavController;
import com.gse.aulapp.databinding.FragmentHomeBinding;
import com.gse.aulapp.viewmodel.ClassInCourseViewModel;
import com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel;
import com.gse.aulapp.viewmodel.HomeViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

/* loaded from: classes2.dex */
public final /* synthetic */ class h1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h1(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ClassInCourseViewModel.validateConnection$lambda$25((Context) this.b, (ClassInCourseViewModel) this.d, (Function0) this.c, view);
                break;
            case 1:
                ClassPracticeBeforeViewModel.validateConnection$lambda$8((Context) this.b, (ClassPracticeBeforeViewModel) this.d, (Function0) this.c, view);
                break;
            case 2:
                ClassPracticeBeforeViewModel.validateConnection$lambda$9((String) this.b, (NavController) this.d, (ClassPracticeBeforeViewModel) this.c, view);
                break;
            default:
                HomeViewModel.buildChipAll$lambda$18((HomeViewModel) this.b, (Ref.ObjectRef) this.d, (FragmentHomeBinding) this.c, view);
                break;
        }
    }
}
