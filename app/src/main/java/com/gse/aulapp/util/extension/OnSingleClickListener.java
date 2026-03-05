package com.gse.aulapp.util.extension;

import android.view.View;
import com.gse.aulapp.util.ViewUtil;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/gse/aulapp/util/extension/OnSingleClickListener;", "Landroid/view/View$OnClickListener;", "block", "Lkotlin/Function0;", BuildConfig.FLAVOR, "<init>", "(Lkotlin/jvm/functions/Function0;)V", "onClick", "view", "Landroid/view/View;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OnSingleClickListener implements View.OnClickListener {
    private final Function0<Unit> block;

    public OnSingleClickListener(Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.block = block;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewUtil.INSTANCE.preventDoubleClick(view);
        this.block.invoke();
    }
}
