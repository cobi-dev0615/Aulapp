package com.gse.aulapp.model.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import co.ceduladigital.sdk.m6;
import com.gse.aulapp.R;
import com.gse.aulapp.databinding.ItemQuestionStatusBinding;
import com.gse.aulapp.model.dto.QuestionDto;
import com.gse.aulapp.model.dto.Status;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0014B?\u00126\u0010\u0004\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0005¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000e\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0016J\u001c\u0010\u0012\u001a\u00020\u000b2\n\u0010\u0013\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\t\u001a\u00020\u0006H\u0016R>\u0010\u0004\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/gse/aulapp/model/adapter/QuestionStatusAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/gse/aulapp/model/dto/QuestionDto;", "Lcom/gse/aulapp/model/adapter/QuestionStatusAdapter$QuestionStatusViewHolder;", "onItemClick", "Lkotlin/Function2;", BuildConfig.FLAVOR, "Lkotlin/ParameterName;", "name", "position", "question", BuildConfig.FLAVOR, "<init>", "(Lkotlin/jvm/functions/Function2;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "holder", "QuestionStatusViewHolder", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class QuestionStatusAdapter extends ListAdapter<QuestionDto, QuestionStatusAdapter.QuestionStatusViewHolder> {
    private final Function2<Integer, QuestionDto, Unit> onItemClick;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/gse/aulapp/model/adapter/QuestionStatusAdapter$QuestionStatusViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/gse/aulapp/databinding/ItemQuestionStatusBinding;", "<init>", "(Lcom/gse/aulapp/model/adapter/QuestionStatusAdapter;Lcom/gse/aulapp/databinding/ItemQuestionStatusBinding;)V", "bind", BuildConfig.FLAVOR, "questionDto", "Lcom/gse/aulapp/model/dto/QuestionDto;", "position", BuildConfig.FLAVOR, "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class QuestionStatusViewHolder extends RecyclerView.ViewHolder {
        private final ItemQuestionStatusBinding binding;
        final /* synthetic */ QuestionStatusAdapter this$0;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Status.values().length];
                try {
                    iArr[Status.NOT_ANSWERED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Status.APPROVED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Status.REJECTED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Status.CURRENT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QuestionStatusViewHolder(QuestionStatusAdapter questionStatusAdapter, ItemQuestionStatusBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = questionStatusAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$1$lambda$0(QuestionDto questionDto, QuestionStatusAdapter this$0, int i, View view) {
            Intrinsics.checkNotNullParameter(questionDto, "$questionDto");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (questionDto.getStatus() == Status.NOT_ANSWERED || questionDto.getStatus() == Status.NOT_APPLICABLE) {
                return;
            }
            this$0.onItemClick.invoke(Integer.valueOf(i), questionDto);
        }

        public final void bind(QuestionDto questionDto, int position) {
            Intrinsics.checkNotNullParameter(questionDto, "questionDto");
            ItemQuestionStatusBinding itemQuestionStatusBinding = this.binding;
            itemQuestionStatusBinding.questionStatus.setOnClickListener(new m6(questionDto, this.this$0, position));
            this.binding.questionStatus.setText(String.valueOf(position + 1));
            Status status = questionDto.getStatus();
            int i = status == null ? -1 : WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i == 1) {
                itemQuestionStatusBinding.questionStatus.setBackgroundColor(ContextCompat.getColor(this.binding.getRoot().getContext(), R.color.colorUnanswered));
                return;
            }
            if (i == 2) {
                itemQuestionStatusBinding.questionStatus.setBackgroundColor(ContextCompat.getColor(this.binding.getRoot().getContext(), R.color.colorApproved));
                return;
            }
            if (i == 3) {
                itemQuestionStatusBinding.questionStatus.setBackgroundColor(ContextCompat.getColor(this.binding.getRoot().getContext(), R.color.colorRejected));
            } else if (i != 4) {
                itemQuestionStatusBinding.questionStatus.setBackgroundColor(ContextCompat.getColor(this.binding.getRoot().getContext(), R.color.colorUnanswered));
            } else {
                itemQuestionStatusBinding.questionStatus.setBackgroundColor(ContextCompat.getColor(this.binding.getRoot().getContext(), R.color.colorCurrent));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public QuestionStatusAdapter(Function2<? super Integer, ? super QuestionDto, Unit> onItemClick) {
        super(new QuestionDiffCallback());
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.onItemClick = onItemClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(QuestionStatusViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        QuestionDto item = getItem(position);
        Intrinsics.checkNotNull(item);
        holder.bind(item, position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public QuestionStatusViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemQuestionStatusBinding inflate = ItemQuestionStatusBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new QuestionStatusViewHolder(this, inflate);
    }
}
