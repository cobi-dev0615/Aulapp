package co.ceduladigital.sdk;

import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.gse.aulapp.databinding.FragmentHoursPerformedBinding;
import com.gse.aulapp.model.adapter.HoursPerformedRecyclerAdapter;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.response.HoursScheduledMonthInformationResponse;
import com.gse.aulapp.util.DialogUtil;
import com.gse.aulapp.view.fragment.HoursPerformedFragment;
import com.gse.aulapp.viewmodel.HoursPerformedViewModel;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes2.dex */
public final class n6 implements FlowCollector {
    public final /* synthetic */ HoursPerformedFragment a;

    public n6(HoursPerformedFragment hoursPerformedFragment) {
        this.a = hoursPerformedFragment;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Status status = (Status) obj;
        boolean z = status instanceof Status.Success;
        HoursPerformedFragment hoursPerformedFragment = this.a;
        if (z) {
            Status.Success success = (Status.Success) status;
            if (success.getData() instanceof List) {
                Collection collection = (Collection) success.getData();
                if (collection == null || collection.isEmpty() || !(((List) success.getData()).get(0) instanceof HoursScheduledMonthInformationResponse)) {
                    HoursPerformedFragment.b(hoursPerformedFragment, true);
                } else {
                    HoursPerformedRecyclerAdapter hoursPerformedRecyclerAdapter = hoursPerformedFragment.c;
                    HoursPerformedRecyclerAdapter hoursPerformedRecyclerAdapter2 = null;
                    if (hoursPerformedRecyclerAdapter == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("hoursRecyclerAdapter");
                        hoursPerformedRecyclerAdapter = null;
                    }
                    hoursPerformedRecyclerAdapter.notifyDataSetChanged();
                    HoursPerformedFragment.b(hoursPerformedFragment, false);
                    HoursPerformedViewModel hoursPerformedViewModel = hoursPerformedFragment.b;
                    if (hoursPerformedViewModel == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        hoursPerformedViewModel = null;
                    }
                    FragmentActivity activity = hoursPerformedFragment.getActivity();
                    FragmentHoursPerformedBinding fragmentHoursPerformedBinding = hoursPerformedFragment.a;
                    Intrinsics.checkNotNull(fragmentHoursPerformedBinding);
                    hoursPerformedViewModel.showFooter(activity, fragmentHoursPerformedBinding);
                    HoursPerformedViewModel hoursPerformedViewModel2 = hoursPerformedFragment.b;
                    if (hoursPerformedViewModel2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        hoursPerformedViewModel2 = null;
                    }
                    FragmentHoursPerformedBinding fragmentHoursPerformedBinding2 = hoursPerformedFragment.a;
                    Intrinsics.checkNotNull(fragmentHoursPerformedBinding2);
                    RecyclerView rvHoursPerformed = fragmentHoursPerformedBinding2.rvHoursPerformed;
                    Intrinsics.checkNotNullExpressionValue(rvHoursPerformed, "rvHoursPerformed");
                    Object data = success.getData();
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.collections.List<com.gse.aulapp.model.response.HoursScheduledMonthInformationResponse>");
                    List<HoursScheduledMonthInformationResponse> list = (List) data;
                    HoursPerformedRecyclerAdapter hoursPerformedRecyclerAdapter3 = hoursPerformedFragment.c;
                    if (hoursPerformedRecyclerAdapter3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("hoursRecyclerAdapter");
                    } else {
                        hoursPerformedRecyclerAdapter2 = hoursPerformedRecyclerAdapter3;
                    }
                    FragmentActivity requireActivity = hoursPerformedFragment.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                    hoursPerformedViewModel2.updateClassDateList(rvHoursPerformed, list, hoursPerformedRecyclerAdapter2, requireActivity);
                }
            }
        } else if (status instanceof Status.Failure) {
            DialogUtil.Companion companion = DialogUtil.INSTANCE;
            FragmentActivity requireActivity2 = hoursPerformedFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
            companion.showDialogProgressGlobal(requireActivity2, false, false, true);
        } else {
            DialogUtil.Companion companion2 = DialogUtil.INSTANCE;
            FragmentActivity requireActivity3 = hoursPerformedFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity3, "requireActivity(...)");
            companion2.showDialogProgressGlobal(requireActivity3, false, false, true);
        }
        return Unit.INSTANCE;
    }
}
