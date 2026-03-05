package com.gse.aulapp.model.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import co.ceduladigital.sdk.c0;
import com.gse.aulapp.databinding.ItemClassCardSectionBinding;
import com.gse.aulapp.model.data.ClassDate;
import com.gse.aulapp.model.dto.SessionDto;
import com.karumi.dexter.BuildConfig;
import defpackage.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001%B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\u000f\u001a\u00020\r2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\b¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0019\u001a\u00020\r2\n\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001e\u001a\u00020\r2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u001e\u0010\u0007R(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\u0007R3\u0010#\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/gse/aulapp/model/adapter/ClassDateRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/gse/aulapp/model/adapter/ClassDateRecyclerAdapter$ClassDateViewHolder;", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/data/ClassDate;", "classDateList", "<init>", "(Ljava/util/List;)V", "Lkotlin/Function1;", "Lcom/gse/aulapp/model/dto/SessionDto;", "Lkotlin/ParameterName;", "name", "session", BuildConfig.FLAVOR, "listener", "setOnItemClickListenerClass", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", BuildConfig.FLAVOR, "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/gse/aulapp/model/adapter/ClassDateRecyclerAdapter$ClassDateViewHolder;", "holder", "position", "onBindViewHolder", "(Lcom/gse/aulapp/model/adapter/ClassDateRecyclerAdapter$ClassDateViewHolder;I)V", "getItemCount", "()I", "newClassDateList", "updateData", "Ljava/util/List;", "getClassDateList", "()Ljava/util/List;", "setClassDateList", "onItemClickListenerClass", "Lkotlin/jvm/functions/Function1;", "ClassDateViewHolder", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ClassDateRecyclerAdapter extends RecyclerView.Adapter<ClassDateViewHolder> {
    private List<ClassDate> classDateList;
    private Function1<? super SessionDto, Unit> onItemClickListenerClass;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/gse/aulapp/model/adapter/ClassDateRecyclerAdapter$ClassDateViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/gse/aulapp/databinding/ItemClassCardSectionBinding;", "<init>", "(Lcom/gse/aulapp/model/adapter/ClassDateRecyclerAdapter;Lcom/gse/aulapp/databinding/ItemClassCardSectionBinding;)V", "getBinding", "()Lcom/gse/aulapp/databinding/ItemClassCardSectionBinding;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class ClassDateViewHolder extends RecyclerView.ViewHolder {
        private final ItemClassCardSectionBinding binding;
        final /* synthetic */ ClassDateRecyclerAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClassDateViewHolder(ClassDateRecyclerAdapter classDateRecyclerAdapter, ItemClassCardSectionBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = classDateRecyclerAdapter;
            this.binding = binding;
        }

        public final ItemClassCardSectionBinding getBinding() {
            return this.binding;
        }
    }

    public ClassDateRecyclerAdapter(List<ClassDate> classDateList) {
        Intrinsics.checkNotNullParameter(classDateList, "classDateList");
        this.classDateList = classDateList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$2$lambda$1$lambda$0(ClassDateRecyclerAdapter this$0, SessionDto it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Function1<? super SessionDto, Unit> function1 = this$0.onItemClickListenerClass;
        if (function1 != null) {
            function1.invoke(it);
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.classDateList.size();
    }

    public final void setClassDateList(List<ClassDate> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.classDateList = list;
    }

    public final void setOnItemClickListenerClass(Function1<? super SessionDto, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onItemClickListenerClass = listener;
    }

    public final void updateData(List<ClassDate> newClassDateList) {
        Intrinsics.checkNotNullParameter(newClassDateList, "newClassDateList");
        this.classDateList = newClassDateList;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ClassDateViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ClassDate classDate = this.classDateList.get(position);
        holder.getBinding().tvClassDate.setText(classDate.getDate());
        holder.getBinding().tvClassDay.setText(classDate.getDay().length() > 0 ? a.m("(", classDate.getDay(), ")") : classDate.getDay());
        holder.getBinding().rvClassDetail.setHasFixedSize(true);
        holder.getBinding().rvClassDetail.setLayoutManager(new LinearLayoutManager(holder.itemView.getContext()));
        ClassDetailRecyclerAdapter classDetailRecyclerAdapter = new ClassDetailRecyclerAdapter(classDate.getClassDetailList());
        holder.getBinding().rvClassDetail.setAdapter(classDetailRecyclerAdapter);
        classDetailRecyclerAdapter.setOnItemClickListener(new c0(this, 0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ClassDateViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemClassCardSectionBinding inflate = ItemClassCardSectionBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new ClassDateViewHolder(this, inflate);
    }
}
