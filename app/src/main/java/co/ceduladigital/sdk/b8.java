package co.ceduladigital.sdk;

import android.app.AlertDialog;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.gse.aulapp.databinding.FragmentRideHistoryBinding;
import com.gse.aulapp.model.adapter.RideHistoryRecyclerAdapter;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.enumerate.EnumDialogType;
import com.gse.aulapp.model.response.ErrorResponse;
import com.gse.aulapp.model.response.SessionRoutesDataResponse;
import com.gse.aulapp.util.DialogUtil;
import com.gse.aulapp.view.fragment.RideHistoryFragment;
import com.gse.aulapp.viewmodel.RideHistoryViewModel;
import com.karumi.dexter.BuildConfig;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes2.dex */
public final class b8 implements FlowCollector {
    public final /* synthetic */ RideHistoryFragment a;

    public b8(RideHistoryFragment rideHistoryFragment) {
        this.a = rideHistoryFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0134  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        String str;
        String str2;
        EnumDialogType enumDialogType;
        AlertDialog showErrorDialog$default;
        Status status = (Status) obj;
        boolean z = status instanceof Status.Success;
        RideHistoryFragment rideHistoryFragment = this.a;
        if (z) {
            Status.Success success = (Status.Success) status;
            Objects.toString(success.getData());
            if (success.getData() instanceof List) {
                Collection collection = (Collection) success.getData();
                if (collection == null || collection.isEmpty() || !(((List) success.getData()).get(0) instanceof SessionRoutesDataResponse)) {
                    RideHistoryFragment.b(rideHistoryFragment, true);
                } else {
                    RideHistoryRecyclerAdapter rideHistoryRecyclerAdapter = rideHistoryFragment.c;
                    RideHistoryRecyclerAdapter rideHistoryRecyclerAdapter2 = null;
                    if (rideHistoryRecyclerAdapter == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("rideRecyclerAdapter");
                        rideHistoryRecyclerAdapter = null;
                    }
                    rideHistoryRecyclerAdapter.notifyDataSetChanged();
                    RideHistoryFragment.b(rideHistoryFragment, false);
                    RideHistoryViewModel rideHistoryViewModel = rideHistoryFragment.a;
                    if (rideHistoryViewModel == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        rideHistoryViewModel = null;
                    }
                    FragmentRideHistoryBinding fragmentRideHistoryBinding = rideHistoryFragment.b;
                    Intrinsics.checkNotNull(fragmentRideHistoryBinding);
                    RecyclerView rvRide = fragmentRideHistoryBinding.rvRide;
                    Intrinsics.checkNotNullExpressionValue(rvRide, "rvRide");
                    Object data = success.getData();
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.collections.List<com.gse.aulapp.model.response.SessionRoutesDataResponse>");
                    List<SessionRoutesDataResponse> list = (List) data;
                    RideHistoryRecyclerAdapter rideHistoryRecyclerAdapter3 = rideHistoryFragment.c;
                    if (rideHistoryRecyclerAdapter3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("rideRecyclerAdapter");
                    } else {
                        rideHistoryRecyclerAdapter2 = rideHistoryRecyclerAdapter3;
                    }
                    FragmentActivity requireActivity = rideHistoryFragment.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                    rideHistoryViewModel.updateClassDateList(rvRide, list, rideHistoryRecyclerAdapter2, requireActivity);
                }
            }
        } else if (status instanceof Status.Failure) {
            String message = ((Status.Failure) status).getE().getMessage();
            if (message != null) {
                if (!Intrinsics.areEqual(message, "401")) {
                    Toast.makeText(rideHistoryFragment.requireActivity(), message, 1).show();
                }
                DialogUtil.Companion companion = DialogUtil.INSTANCE;
                FragmentActivity requireActivity2 = rideHistoryFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
                DialogUtil.Companion.showErrorDialog$default(companion, requireActivity2, EnumDialogType.DIALOG_TYPE_GENERAL_ERROR, message, null, null, false, null, 24, null);
            }
        } else if (status instanceof Status.Exception) {
            Status.Exception exception = (Status.Exception) status;
            Object data2 = exception.getData();
            boolean z2 = data2 instanceof ErrorResponse;
            String str3 = BuildConfig.FLAVOR;
            if (z2) {
                String message2 = ((ErrorResponse) exception.getData()).getResult().getMessage();
                if (message2 == null) {
                    message2 = BuildConfig.FLAVOR;
                }
                String code = ((ErrorResponse) exception.getData()).getResult().getCode();
                if (code != null) {
                    str3 = code;
                }
                str = message2;
            } else if (data2 instanceof String) {
                str = (String) exception.getData();
            } else {
                str = BuildConfig.FLAVOR;
                str2 = str;
                enumDialogType = EnumDialogType.DIALOG_WITH_MESSAGE;
                t1 t1Var = new t1(22);
                DialogUtil.Companion companion2 = DialogUtil.INSTANCE;
                FragmentActivity requireActivity3 = rideHistoryFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity3, "requireActivity(...)");
                if (enumDialogType == null) {
                    enumDialogType = EnumDialogType.DIALOG_TYPE_GENERAL_ERROR;
                }
                showErrorDialog$default = DialogUtil.Companion.showErrorDialog$default(companion2, requireActivity3, enumDialogType, str, str2, null, false, new f0(rideHistoryFragment, t1Var, 8), 16, null);
                rideHistoryFragment.d = showErrorDialog$default;
                if (showErrorDialog$default != null) {
                    showErrorDialog$default.show();
                }
                RideHistoryFragment.b(rideHistoryFragment, true);
            }
            str2 = str3;
            enumDialogType = EnumDialogType.DIALOG_WITH_MESSAGE;
            t1 t1Var2 = new t1(22);
            DialogUtil.Companion companion22 = DialogUtil.INSTANCE;
            FragmentActivity requireActivity32 = rideHistoryFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity32, "requireActivity(...)");
            if (enumDialogType == null) {
            }
            showErrorDialog$default = DialogUtil.Companion.showErrorDialog$default(companion22, requireActivity32, enumDialogType, str, str2, null, false, new f0(rideHistoryFragment, t1Var2, 8), 16, null);
            rideHistoryFragment.d = showErrorDialog$default;
            if (showErrorDialog$default != null) {
            }
            RideHistoryFragment.b(rideHistoryFragment, true);
        } else {
            DialogUtil.Companion companion3 = DialogUtil.INSTANCE;
            FragmentActivity requireActivity4 = rideHistoryFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity4, "requireActivity(...)");
            companion3.showDialogProgressGlobal(requireActivity4, false, false, true);
        }
        return Unit.INSTANCE;
    }
}
