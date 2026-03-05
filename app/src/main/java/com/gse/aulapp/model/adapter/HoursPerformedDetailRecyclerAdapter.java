package com.gse.aulapp.model.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.gse.aulapp.R;
import com.gse.aulapp.databinding.ItemHoursPerformedCardBinding;
import com.gse.aulapp.model.enumerate.EnumClassType;
import com.gse.aulapp.model.response.HoursScheduledCollectionTypeResponse;
import com.karumi.dexter.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001!B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u00020\u00122\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\u0007¨\u0006\""}, d2 = {"Lcom/gse/aulapp/model/adapter/HoursPerformedDetailRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/gse/aulapp/model/adapter/HoursPerformedDetailRecyclerAdapter$HoursPerformedDetailViewHolder;", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/response/HoursScheduledCollectionTypeResponse;", "hoursPerformedDetailList", "<init>", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", BuildConfig.FLAVOR, "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/gse/aulapp/model/adapter/HoursPerformedDetailRecyclerAdapter$HoursPerformedDetailViewHolder;", "getItemCount", "()I", "holder", "position", BuildConfig.FLAVOR, "onBindViewHolder", "(Lcom/gse/aulapp/model/adapter/HoursPerformedDetailRecyclerAdapter$HoursPerformedDetailViewHolder;I)V", "Lcom/gse/aulapp/databinding/ItemHoursPerformedCardBinding;", "binding", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "nameShow", "showTitle", "(Lcom/gse/aulapp/databinding/ItemHoursPerformedCardBinding;Landroid/content/Context;Ljava/lang/String;)V", "Ljava/util/List;", "getHoursPerformedDetailList", "()Ljava/util/List;", "setHoursPerformedDetailList", "HoursPerformedDetailViewHolder", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HoursPerformedDetailRecyclerAdapter extends RecyclerView.Adapter<HoursPerformedDetailRecyclerAdapter.HoursPerformedDetailViewHolder> {
    private List<HoursScheduledCollectionTypeResponse> hoursPerformedDetailList;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/gse/aulapp/model/adapter/HoursPerformedDetailRecyclerAdapter$HoursPerformedDetailViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/gse/aulapp/databinding/ItemHoursPerformedCardBinding;", "<init>", "(Lcom/gse/aulapp/model/adapter/HoursPerformedDetailRecyclerAdapter;Lcom/gse/aulapp/databinding/ItemHoursPerformedCardBinding;)V", "getBinding", "()Lcom/gse/aulapp/databinding/ItemHoursPerformedCardBinding;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class HoursPerformedDetailViewHolder extends RecyclerView.ViewHolder {
        private final ItemHoursPerformedCardBinding binding;
        final /* synthetic */ HoursPerformedDetailRecyclerAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HoursPerformedDetailViewHolder(HoursPerformedDetailRecyclerAdapter hoursPerformedDetailRecyclerAdapter, ItemHoursPerformedCardBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = hoursPerformedDetailRecyclerAdapter;
            this.binding = binding;
        }

        public final ItemHoursPerformedCardBinding getBinding() {
            return this.binding;
        }
    }

    public HoursPerformedDetailRecyclerAdapter(List<HoursScheduledCollectionTypeResponse> hoursPerformedDetailList) {
        Intrinsics.checkNotNullParameter(hoursPerformedDetailList, "hoursPerformedDetailList");
        this.hoursPerformedDetailList = hoursPerformedDetailList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.hoursPerformedDetailList.size();
    }

    public final void showTitle(ItemHoursPerformedCardBinding binding, Context context, String nameShow) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nameShow, "nameShow");
        CharSequence text = context.getText(R.string.txt_practice_exams_title_class_card);
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        binding.includeHoursPerformedCardDetail.tvPracticeClassTitleClassCard.setText(StringsKt.t(text.toString(), "[TYPE]", nameShow));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(HoursPerformedDetailViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        HoursScheduledCollectionTypeResponse hoursScheduledCollectionTypeResponse = this.hoursPerformedDetailList.get(position);
        EnumClassType enumByName = EnumClassType.INSTANCE.getEnumByName(hoursScheduledCollectionTypeResponse.getType());
        holder.getBinding().includeHoursPerformedCardDetail.ivPracticeClassIconCard.setImageResource(enumByName.resource());
        holder.getBinding().includeHoursPerformedCardDetail.totalHoursPerfomed.setText(String.valueOf(hoursScheduledCollectionTypeResponse.getHoursDay()));
        ItemHoursPerformedCardBinding binding = holder.getBinding();
        Context context = holder.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        showTitle(binding, context, EnumClassType.nameShow$default(enumByName, null, 1, null));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public HoursPerformedDetailViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemHoursPerformedCardBinding inflate = ItemHoursPerformedCardBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new HoursPerformedDetailViewHolder(this, inflate);
    }
}
