package com.gse.aulapp.viewmodel;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import co.ceduladigital.sdk.l1;
import co.ceduladigital.sdk.q;
import com.gse.aulapp.databinding.FragmentRideHistoryBinding;
import com.gse.aulapp.model.adapter.RideHistoryRecyclerAdapter;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.repository.SessionRepository;
import com.gse.aulapp.model.request.SessionInstructorRequest;
import com.gse.aulapp.model.response.ErrorResponse;
import com.gse.aulapp.model.response.ErrorResult;
import com.gse.aulapp.model.response.SessionRoutesDataResponse;
import com.gse.aulapp.util.DateUtil;
import com.gse.aulapp.util.DialogUtil;
import com.gse.aulapp.util.LogSendUtil;
import com.gse.aulapp.util.UtilDatePicker;
import com.karumi.dexter.BuildConfig;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0018\u0010\u001a\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0018\u0010\u001b\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\"\u0010\u001c\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J$\u0010 \u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002J,\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-J\u0018\u0010.\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010/\u001a\u000200H\u0002J\u001a\u00101\u001a\u0002022\b\u0010\u0010\u001a\u0004\u0018\u00010\"2\b\u00103\u001a\u0004\u0018\u00010\"R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u00064"}, d2 = {"Lcom/gse/aulapp/viewmodel/RideHistoryViewModel;", "Landroidx/lifecycle/ViewModel;", "sessionRepository", "Lcom/gse/aulapp/model/repository/SessionRepository;", "<init>", "(Lcom/gse/aulapp/model/repository/SessionRepository;)V", "currentMonth", BuildConfig.FLAVOR, "currentYear", "dateSelect", "Ljava/util/Date;", "_message", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/gse/aulapp/model/data/statusControl/Status;", "get_message", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "message", "Lkotlinx/coroutines/flow/StateFlow;", "getMessage", "()Lkotlinx/coroutines/flow/StateFlow;", "initDate", BuildConfig.FLAVOR, "context", "Landroid/content/Context;", "binding", "Lcom/gse/aulapp/databinding/FragmentRideHistoryBinding;", "previousMonth", "nextMonth", "showCalendar", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "updateMonthYear", "updateRequest", "toDate", BuildConfig.FLAVOR, "fromDate", "updateClassDateList", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newRideHistoryList", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/response/SessionRoutesDataResponse;", "rideHistoryRecyclerAdapter", "Lcom/gse/aulapp/model/adapter/RideHistoryRecyclerAdapter;", "activity", "Landroid/app/Activity;", "getRoutesFromApi", "sessionInstructorRequest", "Lcom/gse/aulapp/model/request/SessionInstructorRequest;", "getErrorEndpoint", "Lcom/gse/aulapp/model/response/ErrorResponse;", "code", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRideHistoryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideHistoryViewModel.kt\ncom/gse/aulapp/viewmodel/RideHistoryViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,194:1\n1#2:195\n*E\n"})
/* loaded from: classes2.dex */
public final class RideHistoryViewModel extends ViewModel {
    private final MutableStateFlow<Status> _message;
    private int currentMonth;
    private int currentYear;
    private Date dateSelect;
    private final StateFlow<Status> message;
    final SessionRepository sessionRepository;

    public RideHistoryViewModel(SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
        this.currentMonth = Calendar.getInstance().get(2);
        this.currentYear = Calendar.getInstance().get(1);
        MutableStateFlow<Status> MutableStateFlow = StateFlowKt.MutableStateFlow(Status.Empty.INSTANCE);
        this._message = MutableStateFlow;
        this.message = MutableStateFlow;
    }

    private final void getRoutesFromApi(Context context, SessionInstructorRequest sessionInstructorRequest) {
        try {
            BuildersKt.launch(ViewModelKt.getViewModelScope(this), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new RideHistoryViewModel$getRoutesFromApi$1(context, sessionInstructorRequest, this, null));
        } catch (Exception e) {
            LogSendUtil.INSTANCE.setLog(context, q.i("getRoutesFromApi exception: ", e.getMessage()), "getRoutesFromApi", true);
            this._message.setValue(new Status.Failure(new Exception(e.getMessage())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showCalendar$lambda$0(RideHistoryViewModel this$0, FragmentRideHistoryBinding binding, Context context, Date selection) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(binding, "$binding");
        Intrinsics.checkNotNullParameter(selection, "selection");
        this$0.dateSelect = selection;
        DateUtil.Companion companion = DateUtil.INSTANCE;
        this$0.currentYear = Integer.parseInt(companion.getYearByDate(selection));
        this$0.currentMonth = companion.getMonthNumber(selection);
        this$0.updateMonthYear(binding);
        Date date = this$0.dateSelect;
        Intrinsics.checkNotNull(date);
        this$0.updateRequest(context, companion.getDateFormatToGeneral(date), null);
        return Unit.INSTANCE;
    }

    private final void updateMonthYear(FragmentRideHistoryBinding binding) {
        binding.includeCardDate.dateMonth.setText(DateUtil.INSTANCE.getMonthBySymbols(this.currentMonth));
        binding.includeCardDate.dateYear.setText(String.valueOf(this.currentYear));
    }

    private final void updateRequest(Context context, String toDate, String fromDate) {
        if (fromDate == null) {
            fromDate = toDate;
        }
        SessionInstructorRequest sessionInstructorRequest = new SessionInstructorRequest(toDate, fromDate);
        if (context != null) {
            getRoutesFromApi(context, sessionInstructorRequest);
        }
    }

    public final ErrorResponse getErrorEndpoint(String message, String code) {
        return new ErrorResponse(null, new ErrorResult(false, message, code), null, 5, null);
    }

    public final StateFlow<Status> getMessage() {
        return this.message;
    }

    public final MutableStateFlow<Status> get_message() {
        return this._message;
    }

    public final void initDate(Context context, FragmentRideHistoryBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        updateMonthYear(binding);
        DateUtil.Companion companion = DateUtil.INSTANCE;
        updateRequest(context, companion.getLastDayOfMonth(this.currentYear, this.currentMonth), companion.getFirstDayOfMonth(this.currentYear, this.currentMonth));
    }

    public final void nextMonth(Context context, FragmentRideHistoryBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        int i = this.currentMonth;
        if (i == 11) {
            this.currentMonth = 0;
            this.currentYear++;
        } else {
            this.currentMonth = i + 1;
        }
        initDate(context, binding);
    }

    public final void previousMonth(Context context, FragmentRideHistoryBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        int i = this.currentMonth;
        if (i == 0) {
            this.currentMonth = 11;
            this.currentYear--;
        } else {
            this.currentMonth = i - 1;
        }
        initDate(context, binding);
    }

    public final void showCalendar(Context context, FragmentManager fragmentManager, FragmentRideHistoryBinding binding) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(binding, "binding");
        UtilDatePicker.INSTANCE.showCalendar(context, fragmentManager, new l1(this, binding, context));
    }

    public final void updateClassDateList(RecyclerView recyclerView, List<SessionRoutesDataResponse> newRideHistoryList, RideHistoryRecyclerAdapter rideHistoryRecyclerAdapter, Activity activity) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(newRideHistoryList, "newRideHistoryList");
        Intrinsics.checkNotNullParameter(rideHistoryRecyclerAdapter, "rideHistoryRecyclerAdapter");
        Intrinsics.checkNotNullParameter(activity, "activity");
        recyclerView.setAdapter(rideHistoryRecyclerAdapter);
        rideHistoryRecyclerAdapter.updateData(newRideHistoryList);
        recyclerView.clearOnScrollListeners();
        DialogUtil.INSTANCE.showDialogProgressGlobal(activity, false, false, true);
    }
}
