package co.ceduladigital.sdk;

import android.app.Activity;
import android.content.Context;
import com.gse.aulapp.databinding.FragmentHomeBinding;
import com.gse.aulapp.model.adapter.ClassDetailRecyclerAdapter;
import com.gse.aulapp.viewmodel.HomeViewModel;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h0(Context context, ClassDetailRecyclerAdapter.ClassDetailViewHolder classDetailViewHolder, String str, Function1 function1) {
        this.b = context;
        this.c = classDetailViewHolder;
        this.d = str;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit classInProgress$lambda$19;
        Unit showCalendar$lambda$11;
        switch (this.a) {
            case 0:
                classInProgress$lambda$19 = ClassDetailRecyclerAdapter.ClassDetailViewHolder.classInProgress$lambda$19(this.b, (ClassDetailRecyclerAdapter.ClassDetailViewHolder) this.c, (String) this.d, (Function1) this.e, ((Boolean) obj).booleanValue());
                return classInProgress$lambda$19;
            default:
                showCalendar$lambda$11 = HomeViewModel.showCalendar$lambda$11((HomeViewModel) this.c, this.b, (Activity) this.d, (FragmentHomeBinding) this.e, (Date) obj);
                return showCalendar$lambda$11;
        }
    }

    public /* synthetic */ h0(HomeViewModel homeViewModel, Context context, Activity activity, FragmentHomeBinding fragmentHomeBinding) {
        this.c = homeViewModel;
        this.b = context;
        this.d = activity;
        this.e = fragmentHomeBinding;
    }
}
