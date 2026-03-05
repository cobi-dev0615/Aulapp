package co.ceduladigital.sdk;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.view.ComponentActivity;
import com.google.firebase.sessions.ProcessDataManagerImpl;
import com.google.firebase.sessions.UuidGenerator;
import com.gse.aulapp.databinding.FragmentRideHistoryBinding;
import com.gse.aulapp.view.fragment.RideHistoryFragment;
import com.gse.aulapp.viewmodel.RideHistoryViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class u2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit lambda$new$0;
        String myUuid_delegate$lambda$1;
        switch (this.a) {
            case 0:
                lambda$new$0 = ((ComponentActivity) this.b).lambda$new$0();
                return lambda$new$0;
            case 1:
                myUuid_delegate$lambda$1 = ProcessDataManagerImpl.myUuid_delegate$lambda$1((UuidGenerator) this.b);
                return myUuid_delegate$lambda$1;
            default:
                RideHistoryFragment this$0 = (RideHistoryFragment) this.b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                RideHistoryViewModel rideHistoryViewModel = this$0.a;
                if (rideHistoryViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    rideHistoryViewModel = null;
                }
                FragmentActivity requireActivity = this$0.requireActivity();
                FragmentManager requireFragmentManager = this$0.requireFragmentManager();
                Intrinsics.checkNotNullExpressionValue(requireFragmentManager, "requireFragmentManager(...)");
                FragmentRideHistoryBinding fragmentRideHistoryBinding = this$0.b;
                Intrinsics.checkNotNull(fragmentRideHistoryBinding);
                rideHistoryViewModel.showCalendar(requireActivity, requireFragmentManager, fragmentRideHistoryBinding);
                return Unit.INSTANCE;
        }
    }
}
