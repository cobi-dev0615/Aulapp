package com.gse.aulapp.model.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.gse.aulapp.databinding.CardRideHistoryBinding;
import com.gse.aulapp.model.adapter.RideHistoryRecyclerAdapter;
import com.gse.aulapp.model.enumerate.EnumClassType;
import com.gse.aulapp.model.response.SessionRoutePointResponse;
import com.gse.aulapp.model.response.SessionRoutesDataResponse;
import com.gse.aulapp.util.ActionUtil;
import com.gse.aulapp.util.GpsUtil;
import com.gse.aulapp.util.extension.TextViewExtKt;
import com.gse.aulapp.util.extension.ViewExtKt;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001(B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n0\u00032\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0019\u001a\u00020\u00182\n\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010 \u001a\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b \u0010\u0007R(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010\u0007R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/gse/aulapp/model/adapter/RideHistoryRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/gse/aulapp/model/adapter/RideHistoryRecyclerAdapter$RideHistoryDateViewHolder;", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/response/SessionRoutesDataResponse;", "rideHistoryDateList", "<init>", "(Ljava/util/List;)V", "Lcom/gse/aulapp/model/response/SessionRoutePointResponse;", "coordinates", "Lkotlin/Pair;", BuildConfig.FLAVOR, "getParsedCoordinates", "(Ljava/util/List;)Ljava/util/List;", "Landroid/view/ViewGroup;", "parent", BuildConfig.FLAVOR, "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/gse/aulapp/model/adapter/RideHistoryRecyclerAdapter$RideHistoryDateViewHolder;", "getItemCount", "()I", "holder", "position", BuildConfig.FLAVOR, "onBindViewHolder", "(Lcom/gse/aulapp/model/adapter/RideHistoryRecyclerAdapter$RideHistoryDateViewHolder;I)V", BuildConfig.FLAVOR, "hour", "addAMPM", "(Ljava/lang/String;)Ljava/lang/String;", "newClassDateList", "updateData", "Ljava/util/List;", "getRideHistoryDateList", "()Ljava/util/List;", "setRideHistoryDateList", "Landroid/content/Context;", "context", "Landroid/content/Context;", "RideHistoryDateViewHolder", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RideHistoryRecyclerAdapter extends RecyclerView.Adapter<RideHistoryDateViewHolder> {
    private Context context;
    private List<SessionRoutesDataResponse> rideHistoryDateList;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/gse/aulapp/model/adapter/RideHistoryRecyclerAdapter$RideHistoryDateViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/gse/aulapp/databinding/CardRideHistoryBinding;", "<init>", "(Lcom/gse/aulapp/model/adapter/RideHistoryRecyclerAdapter;Lcom/gse/aulapp/databinding/CardRideHistoryBinding;)V", "getBinding", "()Lcom/gse/aulapp/databinding/CardRideHistoryBinding;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class RideHistoryDateViewHolder extends RecyclerView.ViewHolder {
        private final CardRideHistoryBinding binding;
        final /* synthetic */ RideHistoryRecyclerAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RideHistoryDateViewHolder(RideHistoryRecyclerAdapter rideHistoryRecyclerAdapter, CardRideHistoryBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = rideHistoryRecyclerAdapter;
            this.binding = binding;
        }

        public final CardRideHistoryBinding getBinding() {
            return this.binding;
        }
    }

    public RideHistoryRecyclerAdapter(List<SessionRoutesDataResponse> rideHistoryDateList) {
        Intrinsics.checkNotNullParameter(rideHistoryDateList, "rideHistoryDateList");
        this.rideHistoryDateList = rideHistoryDateList;
    }

    private final List<Pair<Double, Double>> getParsedCoordinates(List<SessionRoutePointResponse> coordinates) {
        ArrayList arrayList = new ArrayList();
        if (coordinates != null) {
            for (SessionRoutePointResponse sessionRoutePointResponse : coordinates) {
                arrayList.add(new Pair(sessionRoutePointResponse.getLatitude(), sessionRoutePointResponse.getLongitude()));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$4$lambda$3$lambda$1(RideHistoryRecyclerAdapter this$0, SessionRoutesDataResponse this_with) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        Context context = this$0.context;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context = null;
        }
        ActionUtil.INSTANCE.dialPhoneNumber(context, String.valueOf(this_with.getCellphoneNumber()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$4$lambda$3$lambda$2(RideHistoryRecyclerAdapter this$0, SessionRoutesDataResponse this_with) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        GpsUtil.Companion companion = GpsUtil.INSTANCE;
        List<Pair<Double, Double>> parsedCoordinates = this$0.getParsedCoordinates(this_with.getPoints());
        Context context = this$0.context;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context = null;
        }
        companion.traceRouteOnMaps(parsedCoordinates, context);
        return Unit.INSTANCE;
    }

    public final String addAMPM(String hour) {
        List split$default;
        Intrinsics.checkNotNullParameter(hour, "hour");
        split$default = StringsKt.split$default((CharSequence) hour, new String[]{":"}, false, 0, 6, (Object) null);
        int parseInt = Integer.parseInt((String) split$default.get(0));
        String str = (String) split$default.get(1);
        String str2 = parseInt >= 12 ? "pm" : "am";
        if (parseInt > 12) {
            parseInt -= 12;
        }
        return parseInt + ":" + str + " " + str2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.rideHistoryDateList.size();
    }

    public final void updateData(List<SessionRoutesDataResponse> newClassDateList) {
        Intrinsics.checkNotNullParameter(newClassDateList, "newClassDateList");
        this.rideHistoryDateList = newClassDateList;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RideHistoryDateViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final SessionRoutesDataResponse sessionRoutesDataResponse = this.rideHistoryDateList.get(position);
        EnumClassType enumByName = EnumClassType.INSTANCE.getEnumByName(sessionRoutesDataResponse.getType());
        String addAMPM = addAMPM(String.valueOf(sessionRoutesDataResponse.getStart()));
        String addAMPM2 = addAMPM(String.valueOf(sessionRoutesDataResponse.getEnd()));
        holder.getBinding().includeShowHistoryButton.btnStartClass.setText("Ver recorrido");
        holder.getBinding().ivPracticeClassIconCard.setImageResource(enumByName.resource());
        holder.getBinding().tvPracticeClassTitleClassCard.setText(EnumClassType.nameShow$default(enumByName, null, 1, null));
        holder.getBinding().tvClassTypeIntervalo.setText(addAMPM + " - " + addAMPM2);
        holder.getBinding().tvClassTypeDuration.setText(" (" + sessionRoutesDataResponse.getDiff() + ") ");
        holder.getBinding().tvNameApprentice.setText(sessionRoutesDataResponse.getApprentice());
        holder.getBinding().tvCellNumber.setText(sessionRoutesDataResponse.getCellphoneNumber());
        holder.getBinding().tvCategory.setText(sessionRoutesDataResponse.getCategory());
        holder.getBinding().tvTrack.setText(sessionRoutesDataResponse.getClassroom());
        holder.getBinding().tvVehicle.setText(sessionRoutesDataResponse.getVehicle());
        TextView tvCellNumber = holder.getBinding().tvCellNumber;
        Intrinsics.checkNotNullExpressionValue(tvCellNumber, "tvCellNumber");
        TextViewExtKt.underline(tvCellNumber);
        TextView tvCellNumber2 = holder.getBinding().tvCellNumber;
        Intrinsics.checkNotNullExpressionValue(tvCellNumber2, "tvCellNumber");
        final int i = 0;
        ViewExtKt.setOnSingleClickListener(tvCellNumber2, new Function0(this) { // from class: co.ceduladigital.sdk.e8
            public final /* synthetic */ RideHistoryRecyclerAdapter b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit onBindViewHolder$lambda$4$lambda$3$lambda$1;
                Unit onBindViewHolder$lambda$4$lambda$3$lambda$2;
                switch (i) {
                    case 0:
                        onBindViewHolder$lambda$4$lambda$3$lambda$1 = RideHistoryRecyclerAdapter.onBindViewHolder$lambda$4$lambda$3$lambda$1(this.b, sessionRoutesDataResponse);
                        return onBindViewHolder$lambda$4$lambda$3$lambda$1;
                    default:
                        onBindViewHolder$lambda$4$lambda$3$lambda$2 = RideHistoryRecyclerAdapter.onBindViewHolder$lambda$4$lambda$3$lambda$2(this.b, sessionRoutesDataResponse);
                        return onBindViewHolder$lambda$4$lambda$3$lambda$2;
                }
            }
        });
        MaterialButton btnStartClass = holder.getBinding().includeShowHistoryButton.btnStartClass;
        Intrinsics.checkNotNullExpressionValue(btnStartClass, "btnStartClass");
        final int i2 = 1;
        ViewExtKt.setOnSingleClickListener(btnStartClass, new Function0(this) { // from class: co.ceduladigital.sdk.e8
            public final /* synthetic */ RideHistoryRecyclerAdapter b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit onBindViewHolder$lambda$4$lambda$3$lambda$1;
                Unit onBindViewHolder$lambda$4$lambda$3$lambda$2;
                switch (i2) {
                    case 0:
                        onBindViewHolder$lambda$4$lambda$3$lambda$1 = RideHistoryRecyclerAdapter.onBindViewHolder$lambda$4$lambda$3$lambda$1(this.b, sessionRoutesDataResponse);
                        return onBindViewHolder$lambda$4$lambda$3$lambda$1;
                    default:
                        onBindViewHolder$lambda$4$lambda$3$lambda$2 = RideHistoryRecyclerAdapter.onBindViewHolder$lambda$4$lambda$3$lambda$2(this.b, sessionRoutesDataResponse);
                        return onBindViewHolder$lambda$4$lambda$3$lambda$2;
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RideHistoryDateViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.context = parent.getContext();
        CardRideHistoryBinding inflate = CardRideHistoryBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new RideHistoryDateViewHolder(this, inflate);
    }
}
