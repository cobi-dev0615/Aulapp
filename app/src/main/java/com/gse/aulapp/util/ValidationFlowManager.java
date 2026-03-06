package com.gse.aulapp.util;

import com.gse.aulapp.model.enumerate.EnumApps;
import com.karumi.dexter.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/gse/aulapp/util/ValidationFlowManager;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/enumerate/EnumApps;", "validationOrder", "<init>", "(Ljava/util/List;)V", "getCurrentValidation", "()Lcom/gse/aulapp/model/enumerate/EnumApps;", BuildConfig.FLAVOR, "moveToNextValidation", "()V", "Ljava/util/List;", BuildConfig.FLAVOR, "currentIndex", "I", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ValidationFlowManager {
    private int currentIndex;
    private final List<EnumApps> validationOrder;

    /* JADX WARN: Multi-variable type inference failed */
    public ValidationFlowManager(List<? extends EnumApps> validationOrder) {
        Intrinsics.checkNotNullParameter(validationOrder, "validationOrder");
        this.validationOrder = (List<EnumApps>) (List<?>) validationOrder;
    }

    public final EnumApps getCurrentValidation() {
        return (EnumApps) CollectionsKt.getOrNull(this.validationOrder, this.currentIndex);
    }

    public final void moveToNextValidation() {
        this.currentIndex++;
    }
}
