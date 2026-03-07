package com.gse.aulapp.util;

import com.gse.aulapp.util.SaveDbUtil;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.IntCompanionObject;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.util.SaveDbUtil$Companion", f = "SaveDbUtil.kt", i = {}, l = {30}, m = "saveGpsTracker", n = {}, s = {})
/* loaded from: classes.dex */
public final class SaveDbUtil$Companion$saveGpsTracker$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SaveDbUtil.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveDbUtil$Companion$saveGpsTracker$1(SaveDbUtil.Companion companion, Continuation continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= IntCompanionObject.MIN_VALUE;
        return this.this$0.saveGpsTracker(null, null, null, this);
    }
}
