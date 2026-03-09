package com.gse.aulapp.viewmodel;

import android.app.Activity;
import android.content.Context;
import androidx.core.text.HtmlCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import co.ceduladigital.sdk.q;
import com.gse.aulapp.R;
import com.gse.aulapp.databinding.FragmentHoursPerformedBinding;
import com.gse.aulapp.model.adapter.HoursPerformedRecyclerAdapter;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.repository.SessionRepository;
import com.gse.aulapp.model.request.HoursScheduledRequest;
import com.gse.aulapp.model.response.HoursScheduledMonthInformationResponse;
import com.gse.aulapp.util.DateUtil;
import com.gse.aulapp.util.DialogUtil;
import com.gse.aulapp.util.LogSendUtil;
import com.gse.aulapp.util.ResourceUtil;
import com.karumi.dexter.BuildConfig;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J3\u0010\u0015\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010\u001aJ,\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020#J\u0006\u0010$\u001a\u00020%J\u0016\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020%J\u0018\u0010*\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0012\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006+"}, d2 = {"Lcom/gse/aulapp/viewmodel/HoursPerformedViewModel;", "Landroidx/lifecycle/ViewModel;", "sessionRepository", "Lcom/gse/aulapp/model/repository/SessionRepository;", "<init>", "(Lcom/gse/aulapp/model/repository/SessionRepository;)V", "numberHours", BuildConfig.FLAVOR, "Ljava/lang/Integer;", "numberHoursMax", "_message", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/gse/aulapp/model/data/statusControl/Status;", "message", "Lkotlinx/coroutines/flow/StateFlow;", "getMessage", "()Lkotlinx/coroutines/flow/StateFlow;", "initDate", BuildConfig.FLAVOR, "binding", "Lcom/gse/aulapp/databinding/FragmentHoursPerformedBinding;", "footer", "activity", "Landroidx/fragment/app/FragmentActivity;", "hour", "hourMax", "(Landroidx/fragment/app/FragmentActivity;Lcom/gse/aulapp/databinding/FragmentHoursPerformedBinding;Ljava/lang/Integer;Ljava/lang/Integer;)V", "updateClassDateList", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "hoursPerformedList", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/response/HoursScheduledMonthInformationResponse;", "hoursPerformedRecyclerAdapter", "Lcom/gse/aulapp/model/adapter/HoursPerformedRecyclerAdapter;", "Landroid/app/Activity;", "getHoursScheduledRequest", "Lcom/gse/aulapp/model/request/HoursScheduledRequest;", "getHoursPerformedApi", "context", "Landroid/content/Context;", "request", "showFooter", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HoursPerformedViewModel extends ViewModel {
    final MutableStateFlow<Status> _message;
    private final StateFlow<Status> message;
    Integer numberHours;
    Integer numberHoursMax;
    final SessionRepository sessionRepository;

    public HoursPerformedViewModel(SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
        MutableStateFlow<Status> MutableStateFlow = StateFlowKt.MutableStateFlow(Status.Empty.INSTANCE);
        this._message = MutableStateFlow;
        this.message = MutableStateFlow;
    }

    private final void footer(FragmentActivity activity, FragmentHoursPerformedBinding binding, Integer hour, Integer hourMax) {
        CharSequence text = activity != null ? activity.getText(R.string.footer_hours_performed) : null;
        int colorResource = ResourceUtil.INSTANCE.getColorResource(activity, R.color.light_green);
        String t = String.valueOf(text).replace("[HOURS]", String.valueOf(hour)).replace("[HOURSMAXIMUM]", String.valueOf(hourMax)).replace(hour + " horas", "<font color='" + colorResource + "'>" + hour + " horas</font>");
        StringBuilder sb = new StringBuilder();
        sb.append(hourMax);
        sb.append(" máximas");
        String t2 = t.replace(sb.toString(), "<font color='" + colorResource + "'>" + hourMax + " máximas</font>");
        binding.cvContainerFooter.setVisibility(0);
        binding.footer.setText(HtmlCompat.fromHtml(t2, 0));
    }

    public final void getHoursPerformedApi(Context context, HoursScheduledRequest request) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            BuildersKt.launch(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new HoursPerformedViewModel$getHoursPerformedApi$1(context, request, this, null));
        } catch (Exception e) {
            LogSendUtil.INSTANCE.setLog(context, q.i("getHoursPerformedApi exception ", e.getMessage()), "getHoursPerformedApi", true);
            this._message.setValue(new Status.Failure(new Exception(e.getMessage())));
        }
    }

    public final HoursScheduledRequest getHoursScheduledRequest() {
        return new HoursScheduledRequest(DateUtil.INSTANCE.getDateFormatToGeneral(new Date()));
    }

    public final StateFlow<Status> getMessage() {
        return this.message;
    }

    public final void initDate(FragmentHoursPerformedBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Date date = new Date();
        DateUtil.Companion companion = DateUtil.INSTANCE;
        String yearByDate = companion.getYearByDate(date);
        binding.includeCardDate.dateMonth.setText(companion.getMonthFormat(date));
        binding.includeCardDate.dateYear.setText(yearByDate);
    }

    public final void showFooter(FragmentActivity activity, FragmentHoursPerformedBinding binding) {
        Integer num;
        Intrinsics.checkNotNullParameter(binding, "binding");
        if (this.numberHours == null || (num = this.numberHoursMax) == null) {
            return;
        }
        Intrinsics.checkNotNull(num);
        int intValue = num.intValue();
        Integer num2 = this.numberHours;
        Intrinsics.checkNotNull(num2);
        footer(activity, binding, Integer.valueOf(intValue - num2.intValue()), this.numberHoursMax);
    }

    public final void updateClassDateList(RecyclerView recyclerView, List<HoursScheduledMonthInformationResponse> hoursPerformedList, HoursPerformedRecyclerAdapter hoursPerformedRecyclerAdapter, Activity activity) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(hoursPerformedList, "hoursPerformedList");
        Intrinsics.checkNotNullParameter(hoursPerformedRecyclerAdapter, "hoursPerformedRecyclerAdapter");
        Intrinsics.checkNotNullParameter(activity, "activity");
        recyclerView.setAdapter(hoursPerformedRecyclerAdapter);
        hoursPerformedRecyclerAdapter.updateData(hoursPerformedList);
        recyclerView.clearOnScrollListeners();
        DialogUtil.INSTANCE.showDialogProgressGlobal(activity, false, false, true);
    }
}
