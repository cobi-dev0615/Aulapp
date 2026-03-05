package co.ceduladigital.sdk;

import android.content.Context;
import android.view.Menu;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.gse.aulapp.databinding.FragmentHomeBinding;
import com.gse.aulapp.view.fragment.HomeFragment;
import com.gse.aulapp.viewmodel.HomeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class a6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ HomeFragment b;

    public /* synthetic */ a6(HomeFragment homeFragment, int i) {
        this.a = i;
        this.b = homeFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                HomeFragment this$0 = this.b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                HomeViewModel homeViewModel = this$0.a;
                if (homeViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    homeViewModel = null;
                }
                FragmentActivity requireActivity = this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                homeViewModel.validateConnection(requireActivity, new a6(this$0, 1));
                break;
            case 1:
                HomeFragment this$02 = this.b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                HomeViewModel homeViewModel2 = this$02.a;
                if (homeViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    homeViewModel2 = null;
                }
                Context context = this$02.getContext();
                FragmentActivity requireActivity2 = this$02.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
                FragmentManager requireFragmentManager = this$02.requireFragmentManager();
                Intrinsics.checkNotNullExpressionValue(requireFragmentManager, "requireFragmentManager(...)");
                FragmentHomeBinding fragmentHomeBinding = this$02.c;
                Intrinsics.checkNotNull(fragmentHomeBinding);
                homeViewModel2.showCalendar(context, requireActivity2, requireFragmentManager, fragmentHomeBinding);
                break;
            default:
                HomeFragment this$03 = this.b;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Context context2 = this$03.getContext();
                if (context2 != null) {
                    HomeViewModel homeViewModel3 = this$03.a;
                    if (homeViewModel3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        homeViewModel3 = null;
                    }
                    FragmentHomeBinding fragmentHomeBinding2 = this$03.c;
                    Intrinsics.checkNotNull(fragmentHomeBinding2);
                    Menu menu = this$03.d;
                    Intrinsics.checkNotNull(menu);
                    homeViewModel3.initSessionSyncPending(context2, fragmentHomeBinding2, menu, true);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
