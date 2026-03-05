package co.ceduladigital.sdk;

import android.app.Activity;
import android.view.View;
import com.gse.aulapp.viewmodel.HomeViewModel;
import com.gse.aulapp.viewmodel.PrincipalActivityViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

/* loaded from: classes2.dex */
public final /* synthetic */ class k6 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ Ref.ObjectRef c;
    public final /* synthetic */ Function0 d;

    public /* synthetic */ k6(Activity activity, Ref.ObjectRef objectRef, Function0 function0, int i) {
        this.a = i;
        this.b = activity;
        this.c = objectRef;
        this.d = function0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                HomeViewModel.validateConnection$lambda$12(this.b, this.c, this.d, view);
                break;
            default:
                PrincipalActivityViewModel.validateConnection$lambda$7(this.b, this.c, this.d, view);
                break;
        }
    }
}
