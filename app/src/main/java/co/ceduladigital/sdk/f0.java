package co.ceduladigital.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.View;
import com.google.android.material.snackbar.Snackbar;
import com.gse.aulapp.databinding.FragmentHomeBinding;
import com.gse.aulapp.databinding.ItemClassCardDetailBinding;
import com.gse.aulapp.model.adapter.ClassDetailRecyclerAdapter;
import com.gse.aulapp.model.dto.StepProfile;
import com.gse.aulapp.util.NetworkUtil;
import com.gse.aulapp.util.PermissionHelper;
import com.gse.aulapp.view.fragment.ClassPracticeBeforeFragment;
import com.gse.aulapp.view.fragment.FirstLoginFragment;
import com.gse.aulapp.view.fragment.HomeFragment;
import com.gse.aulapp.view.fragment.RideHistoryFragment;
import com.gse.aulapp.viewmodel.HomeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f0(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                ClassDetailRecyclerAdapter.ClassDetailViewHolder.handlerClassCardByType$lambda$5$lambda$4$lambda$3((ClassDetailRecyclerAdapter) obj2, (ItemClassCardDetailBinding) obj, view);
                break;
            case 1:
                Function0 function = (Function0) obj2;
                Intrinsics.checkNotNullParameter(function, "$function");
                ClassPracticeBeforeFragment this$0 = (ClassPracticeBeforeFragment) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                function.invoke();
                AlertDialog alertDialog = this$0.q;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                    break;
                }
                break;
            case 2:
                ClassPracticeBeforeFragment this$02 = (ClassPracticeBeforeFragment) obj2;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                StepProfile step = (StepProfile) obj;
                Intrinsics.checkNotNullParameter(step, "$step");
                if (NetworkUtil.INSTANCE.isNetworkAvailable(this$02.getActivity())) {
                    this$02.h(step);
                    AlertDialog alertDialog2 = this$02.m;
                    Intrinsics.checkNotNull(alertDialog2);
                    alertDialog2.dismiss();
                    break;
                }
                break;
            case 3:
                FirstLoginFragment this$03 = (FirstLoginFragment) obj2;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                r4 function2 = (r4) obj;
                Intrinsics.checkNotNullParameter(function2, "$function");
                AlertDialog alertDialog3 = this$03.e;
                if (alertDialog3 != null) {
                    alertDialog3.dismiss();
                }
                function2.invoke();
                break;
            case 4:
                FirstLoginFragment this$04 = (FirstLoginFragment) obj2;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Function0 function3 = (Function0) obj;
                Intrinsics.checkNotNullParameter(function3, "$function");
                AlertDialog alertDialog4 = this$04.e;
                if (alertDialog4 != null) {
                    Intrinsics.checkNotNull(alertDialog4);
                    if (alertDialog4.isShowing()) {
                        function3.invoke();
                        AlertDialog alertDialog5 = this$04.e;
                        Intrinsics.checkNotNull(alertDialog5);
                        alertDialog5.dismiss();
                        break;
                    }
                }
                break;
            case 5:
                Intrinsics.checkNotNullParameter((t1) obj2, "$function");
                HomeFragment this$05 = (HomeFragment) obj;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Unit unit = Unit.INSTANCE;
                AlertDialog alertDialog6 = this$05.f;
                if (alertDialog6 != null) {
                    alertDialog6.dismiss();
                    break;
                }
                break;
            case 6:
                HomeViewModel.addChipToGroup$lambda$20((HomeViewModel) obj2, (FragmentHomeBinding) obj, view);
                break;
            case 7:
                PermissionHelper.Companion.requestNotificationPermission$lambda$2((Activity) obj2, (View.OnClickListener) obj, view);
                break;
            case 8:
                RideHistoryFragment this$06 = (RideHistoryFragment) obj2;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                Intrinsics.checkNotNullParameter((t1) obj, "$function");
                AlertDialog alertDialog7 = this$06.d;
                if (alertDialog7 != null) {
                    Intrinsics.checkNotNull(alertDialog7);
                    if (alertDialog7.isShowing()) {
                        Unit unit2 = Unit.INSTANCE;
                        AlertDialog alertDialog8 = this$06.d;
                        Intrinsics.checkNotNull(alertDialog8);
                        alertDialog8.dismiss();
                        break;
                    }
                }
                break;
            default:
                ((Snackbar) obj2).lambda$setAction$0((View.OnClickListener) obj, view);
                break;
        }
    }
}
