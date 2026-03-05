package co.ceduladigital.sdk;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.FragmentKt;
import com.gse.aulapp.model.adapter.ClassDateRecyclerAdapter;
import com.gse.aulapp.model.adapter.StepRecyclerAdapter;
import com.gse.aulapp.model.data.entity.entityFull.SessionFull;
import com.gse.aulapp.model.dto.SessionDto;
import com.gse.aulapp.util.GpsUtil;
import com.gse.aulapp.view.fragment.ClassFragment;
import com.gse.aulapp.view.fragment.HomeFragment;
import com.gse.aulapp.view.fragment.PracticeClassFragment;
import com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel;
import com.gse.aulapp.viewmodel.HomeViewModel;
import com.gse.aulapp.viewmodel.PracticeClassViewModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.internal.JsonNamesMapKt;

/* loaded from: classes2.dex */
public final /* synthetic */ class j0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j0(Object obj, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit showDialog$lambda$0;
        Map buildDeserializationNamesMap;
        Unit startGpsTrace$lambda$10;
        Unit _init_$lambda$1;
        switch (this.a) {
            case 0:
                ClassFragment this$0 = (ClassFragment) this.c;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                String sessionId = (String) this.b;
                Intrinsics.checkNotNullParameter(sessionId, "$sessionId");
                GpsUtil.Companion companion = GpsUtil.INSTANCE;
                FragmentActivity requireActivity = this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                companion.validatePermissionsAndStart(requireActivity, 2500L, sessionId);
                return Unit.INSTANCE;
            case 1:
                showDialog$lambda$0 = ClassPracticeBeforeViewModel.showDialog$lambda$0((Context) this.c, (String) this.b);
                return showDialog$lambda$0;
            case 2:
                HomeFragment this$02 = (HomeFragment) this.c;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                SessionDto it = (SessionDto) this.b;
                Intrinsics.checkNotNullParameter(it, "$it");
                HomeViewModel homeViewModel = this$02.a;
                HomeViewModel homeViewModel2 = null;
                ClassDateRecyclerAdapter classDateRecyclerAdapter = null;
                if (homeViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    homeViewModel = null;
                }
                homeViewModel.setSwipeRefresh(false);
                if (Intrinsics.areEqual(it.getEnabledToStart(), Boolean.TRUE)) {
                    HomeViewModel homeViewModel3 = this$02.a;
                    if (homeViewModel3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        homeViewModel3 = null;
                    }
                    NavController findNavController = FragmentKt.findNavController(this$02);
                    ClassDateRecyclerAdapter classDateRecyclerAdapter2 = this$02.b;
                    if (classDateRecyclerAdapter2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("classRecyclerAdapter");
                    } else {
                        classDateRecyclerAdapter = classDateRecyclerAdapter2;
                    }
                    FragmentActivity requireActivity2 = this$02.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
                    homeViewModel3.validateAllowNavigate(findNavController, it, classDateRecyclerAdapter, requireActivity2);
                } else {
                    Context context = this$02.getContext();
                    if (context != null) {
                        HomeViewModel homeViewModel4 = this$02.a;
                        if (homeViewModel4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        } else {
                            homeViewModel2 = homeViewModel4;
                        }
                        Context requireContext = this$02.requireContext();
                        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                        homeViewModel2.getSessionRequest(requireContext, new l1(this$02, context, it, 1));
                    }
                }
                return Unit.INSTANCE;
            case 3:
                buildDeserializationNamesMap = JsonNamesMapKt.buildDeserializationNamesMap((SerialDescriptor) this.c, (Json) this.b);
                return buildDeserializationNamesMap;
            case 4:
                PracticeClassFragment this$03 = (PracticeClassFragment) this.c;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                SessionFull sessionFull = (SessionFull) this.b;
                Intrinsics.checkNotNullParameter(sessionFull, "$sessionFull");
                Context context2 = this$03.getContext();
                if (context2 != null) {
                    GpsUtil.INSTANCE.locationEnabled(context2, new l1(this$03, context2, sessionFull, 2));
                }
                return Unit.INSTANCE;
            case 5:
                startGpsTrace$lambda$10 = PracticeClassViewModel.startGpsTrace$lambda$10((PracticeClassViewModel) this.c, (Activity) this.b);
                return startGpsTrace$lambda$10;
            default:
                _init_$lambda$1 = StepRecyclerAdapter.ViewHolderStep._init_$lambda$1((StepRecyclerAdapter) this.c, (StepRecyclerAdapter.ViewHolderStep) this.b);
                return _init_$lambda$1;
        }
    }
}
