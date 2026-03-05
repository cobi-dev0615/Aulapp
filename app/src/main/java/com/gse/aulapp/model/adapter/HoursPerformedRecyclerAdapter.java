package com.gse.aulapp.model.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.gse.aulapp.R;
import com.gse.aulapp.databinding.CardHoursPerformedSelectionBinding;
import com.gse.aulapp.model.response.HoursScheduledCollectionTypeResponse;
import com.gse.aulapp.model.response.HoursScheduledMonthInformationResponse;
import com.karumi.dexter.BuildConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0019B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u001c\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0011H\u0016J\u0014\u0010\u0017\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/gse/aulapp/model/adapter/HoursPerformedRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/gse/aulapp/model/adapter/HoursPerformedRecyclerAdapter$HoursPerformedDateViewHolder;", "hoursPerformedDataList", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/response/HoursScheduledMonthInformationResponse;", "<init>", "(Ljava/util/List;)V", "hoursPerformedDetailList", "Lcom/gse/aulapp/model/response/HoursScheduledCollectionTypeResponse;", "getHoursPerformedDetailList", "()Ljava/util/List;", "setHoursPerformedDetailList", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", BuildConfig.FLAVOR, "getItemCount", "onBindViewHolder", BuildConfig.FLAVOR, "holder", "position", "updateData", "newClassDateList", "HoursPerformedDateViewHolder", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HoursPerformedRecyclerAdapter extends RecyclerView.Adapter<HoursPerformedRecyclerAdapter.HoursPerformedDateViewHolder> {
    private List<HoursScheduledMonthInformationResponse> hoursPerformedDataList;
    public List<HoursScheduledCollectionTypeResponse> hoursPerformedDetailList;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/gse/aulapp/model/adapter/HoursPerformedRecyclerAdapter$HoursPerformedDateViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/gse/aulapp/databinding/CardHoursPerformedSelectionBinding;", "<init>", "(Lcom/gse/aulapp/model/adapter/HoursPerformedRecyclerAdapter;Lcom/gse/aulapp/databinding/CardHoursPerformedSelectionBinding;)V", "getBinding", "()Lcom/gse/aulapp/databinding/CardHoursPerformedSelectionBinding;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class HoursPerformedDateViewHolder extends RecyclerView.ViewHolder {
        private final CardHoursPerformedSelectionBinding binding;
        final /* synthetic */ HoursPerformedRecyclerAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HoursPerformedDateViewHolder(HoursPerformedRecyclerAdapter hoursPerformedRecyclerAdapter, CardHoursPerformedSelectionBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = hoursPerformedRecyclerAdapter;
            this.binding = binding;
        }

        public final CardHoursPerformedSelectionBinding getBinding() {
            return this.binding;
        }
    }

    public HoursPerformedRecyclerAdapter(List<HoursScheduledMonthInformationResponse> hoursPerformedDataList) {
        Intrinsics.checkNotNullParameter(hoursPerformedDataList, "hoursPerformedDataList");
        this.hoursPerformedDataList = hoursPerformedDataList;
    }

    public final List<HoursScheduledCollectionTypeResponse> getHoursPerformedDetailList() {
        List<HoursScheduledCollectionTypeResponse> list = this.hoursPerformedDetailList;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("hoursPerformedDetailList");
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.hoursPerformedDataList.size();
    }

    public final void setHoursPerformedDetailList(List<HoursScheduledCollectionTypeResponse> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.hoursPerformedDetailList = list;
    }

    public final void updateData(List<HoursScheduledMonthInformationResponse> newClassDateList) {
        Intrinsics.checkNotNullParameter(newClassDateList, "newClassDateList");
        this.hoursPerformedDataList = newClassDateList;
        Iterator<HoursScheduledMonthInformationResponse> it = newClassDateList.iterator();
        while (it.hasNext()) {
            List<HoursScheduledCollectionTypeResponse> collectionType = it.next().getCollectionType();
            Intrinsics.checkNotNull(collectionType);
            setHoursPerformedDetailList(collectionType);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(HoursPerformedDateViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        HoursScheduledMonthInformationResponse hoursScheduledMonthInformationResponse = this.hoursPerformedDataList.get(position);
        holder.getBinding().tvNameCea.setText(hoursScheduledMonthInformationResponse.getCenterName());
        holder.getBinding().includeHourPerfomedAddress.hourPerformedTitle.setText(holder.getBinding().getRoot().getContext().getText(R.string.txt_card_hours_performed_address));
        holder.getBinding().includeHourPerfomedAddress.hourPerformedDescription.setText(hoursScheduledMonthInformationResponse.getCenterAddress());
        holder.getBinding().includeHourPerfomedCellphone.hourPerformedTitle.setText(holder.getBinding().getRoot().getContext().getText(R.string.txt_card_hours_performed_cellphone));
        holder.getBinding().includeHourPerfomedCellphone.hourPerformedDescription.setText(hoursScheduledMonthInformationResponse.getCenterPhoneNumber());
        holder.getBinding().rvDetailHours.setHasFixedSize(true);
        holder.getBinding().rvDetailHours.setLayoutManager(new LinearLayoutManager(holder.itemView.getContext()));
        holder.getBinding().rvDetailHours.setAdapter(new HoursPerformedDetailRecyclerAdapter(getHoursPerformedDetailList()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public HoursPerformedDateViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        CardHoursPerformedSelectionBinding inflate = CardHoursPerformedSelectionBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new HoursPerformedDateViewHolder(this, inflate);
    }
}
