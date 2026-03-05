package com.gse.aulapp.model.adapter;

import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.widget.TextViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import co.ceduladigital.sdk.j0;
import com.gse.aulapp.R;
import com.gse.aulapp.model.dto.StepProfile;
import com.gse.aulapp.model.enumerate.EnumStatusStepSession;
import com.gse.aulapp.util.DrawableHelper;
import com.gse.aulapp.util.extension.ViewExtKt;
import com.karumi.dexter.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001bB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0010\u001a\u00020\u000f2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u000bJ\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001c\u0010\u0017\u001a\u00020\u000f2\n\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/gse/aulapp/model/adapter/StepRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/gse/aulapp/model/adapter/StepRecyclerAdapter$ViewHolderStep;", "requireActivity", "Landroidx/fragment/app/FragmentActivity;", "stepList", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/dto/StepProfile;", "<init>", "(Landroidx/fragment/app/FragmentActivity;Ljava/util/List;)V", "onItemChecklists", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "stepProfile", BuildConfig.FLAVOR, "setOnItemClickListener", "listener", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", BuildConfig.FLAVOR, "onBindViewHolder", "holder", "position", "getItemCount", "ViewHolderStep", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StepRecyclerAdapter extends RecyclerView.Adapter<StepRecyclerAdapter.ViewHolderStep> {
    private Function1<? super StepProfile, Unit> onItemChecklists;
    private final FragmentActivity requireActivity;
    private final List<StepProfile> stepList;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u0010H\u0002J \u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\tH\u0002R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/gse/aulapp/model/adapter/StepRecyclerAdapter$ViewHolderStep;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Lcom/gse/aulapp/model/adapter/StepRecyclerAdapter;Landroid/view/View;)V", "lineUp", "lineDown", "iconCircle", "Landroid/widget/ImageView;", "iconCard", "textCard", "Landroid/widget/TextView;", "cardStep", "Landroidx/cardview/widget/CardView;", "setDataSteep", BuildConfig.FLAVOR, "stepProfile", "Lcom/gse/aulapp/model/dto/StepProfile;", "position", BuildConfig.FLAVOR, "setStyleCardActive", "setStyleIconCard", "icon", "color", "imageView", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class ViewHolderStep extends RecyclerView.ViewHolder {
        private CardView cardStep;
        private ImageView iconCard;
        private ImageView iconCircle;
        private View lineDown;
        private View lineUp;
        private TextView textCard;
        final /* synthetic */ StepRecyclerAdapter this$0;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumStatusStepSession.values().length];
                try {
                    iArr[EnumStatusStepSession.ACTIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumStatusStepSession.FINISH.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolderStep(StepRecyclerAdapter stepRecyclerAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = stepRecyclerAdapter;
            this.lineUp = itemView.findViewById(R.id.v_line_up_item_step_profile);
            this.lineDown = itemView.findViewById(R.id.v_line_down_item_step_profile);
            this.iconCircle = (ImageView) itemView.findViewById(R.id.iv_ic_circle_item_step_profile);
            this.iconCard = (ImageView) itemView.findViewById(R.id.iv_icon_card_item_step_profile);
            this.textCard = (TextView) itemView.findViewById(R.id.tv_card_item_step_profile);
            CardView cardView = (CardView) itemView.findViewById(R.id.cv_item_step_profile);
            this.cardStep = cardView;
            ViewExtKt.setOnSingleClickListener(cardView, new j0(stepRecyclerAdapter, this, 6));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit _init_$lambda$1(StepRecyclerAdapter this$0, ViewHolderStep this$1) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Function1 function1 = this$0.onItemChecklists;
            if (function1 != null) {
                function1.invoke(this$0.stepList.get(this$1.getAdapterPosition()));
            }
            return Unit.INSTANCE;
        }

        private final void setStyleCardActive() {
            this.cardStep.setRadius(TypedValue.applyDimension(1, 10.0f, this.this$0.requireActivity.getResources().getDisplayMetrics()));
            DrawableHelper.withContext(this.this$0.requireActivity).withColor(R.color.dark_blue).applyTo(this.cardStep);
        }

        private final void setStyleIconCard(int icon, int color, ImageView imageView) {
            DrawableHelper.withContext(this.this$0.requireActivity).withColor(color).withDrawable(icon).tint().applyTo(imageView);
        }

        public final void setDataSteep(StepProfile stepProfile, int position) {
            Intrinsics.checkNotNullParameter(stepProfile, "stepProfile");
            this.lineUp.setVisibility(position == 0 ? 4 : 0);
            this.lineDown.setVisibility(position == this.this$0.stepList.size() - 1 ? 4 : 0);
            this.textCard.setText(stepProfile.getText());
            this.iconCard.setBackgroundResource(stepProfile.getIcon());
            int i = WhenMappings.$EnumSwitchMapping$0[stepProfile.getStatus().ordinal()];
            if (i == 1) {
                setStyleCardActive();
                TextViewCompat.setTextAppearance(this.textCard, R.style.text_card_item_step_profile_user_active);
                setStyleIconCard(stepProfile.getIcon(), R.color.white, this.iconCard);
                setStyleIconCard(R.drawable.ic_circle, R.color.dark_blue, this.iconCircle);
                return;
            }
            if (i != 2) {
                return;
            }
            TextViewCompat.setTextAppearance(this.textCard, R.style.text_card_item_step_profile_user_finish);
            this.iconCircle.setBackgroundResource(R.drawable.ic_circle_check);
            setStyleIconCard(stepProfile.getIcon(), R.color.green, this.iconCard);
        }
    }

    public StepRecyclerAdapter(FragmentActivity requireActivity, List<StepProfile> stepList) {
        Intrinsics.checkNotNullParameter(requireActivity, "requireActivity");
        Intrinsics.checkNotNullParameter(stepList, "stepList");
        this.requireActivity = requireActivity;
        this.stepList = stepList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.stepList.size();
    }

    public final void setOnItemClickListener(Function1<? super StepProfile, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onItemChecklists = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolderStep holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.setDataSteep(this.stepList.get(position), position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolderStep onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_step_profile_layout, (ViewGroup) null, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new ViewHolderStep(this, inflate);
    }
}
