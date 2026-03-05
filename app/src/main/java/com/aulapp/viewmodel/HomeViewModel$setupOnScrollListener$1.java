package com.gse.aulapp.viewmodel;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import co.ceduladigital.sdk.m6;
import com.google.android.material.button.MaterialButton;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0017¨\u0006\t"}, d2 = {"com/gse/aulapp/viewmodel/HomeViewModel$setupOnScrollListener$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrolled", BuildConfig.FLAVOR, "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", BuildConfig.FLAVOR, "dy", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HomeViewModel$setupOnScrollListener$1 extends RecyclerView.OnScrollListener {
    final /* synthetic */ MaterialButton $buttonTodayClass;
    final /* synthetic */ int $todayItemPosition;
    final /* synthetic */ TextView $tvSubtitle;
    final /* synthetic */ HomeViewModel this$0;

    public HomeViewModel$setupOnScrollListener$1(HomeViewModel homeViewModel, MaterialButton materialButton, int i, TextView textView) {
        this.this$0 = homeViewModel;
        this.$buttonTodayClass = materialButton;
        this.$todayItemPosition = i;
        this.$tvSubtitle = textView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onScrolled$lambda$0(int i, RecyclerView recyclerView, HomeViewModel this$0, View view) {
        Intrinsics.checkNotNullParameter(recyclerView, "$recyclerView");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i != -1) {
            recyclerView.smoothScrollToPosition(i);
        } else {
            this$0.loadDefaultList();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, dx, dy);
        this.this$0.updateTodayButtonVisibility(this.$buttonTodayClass, recyclerView, this.$todayItemPosition);
        this.$buttonTodayClass.setOnClickListener(new m6(this.$todayItemPosition, recyclerView, this.this$0));
        this.this$0.getItemsOfRecycler(recyclerView, this.$tvSubtitle);
    }
}
