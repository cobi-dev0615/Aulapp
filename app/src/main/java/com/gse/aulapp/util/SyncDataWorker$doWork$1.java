package com.gse.aulapp.util;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.IntCompanionObject;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.util.SyncDataWorker", f = "WorkManagerUtil.kt", i = {}, l = {87}, m = "doWork", n = {}, s = {})
/* loaded from: classes.dex */
public final class SyncDataWorker$doWork$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SyncDataWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncDataWorker$doWork$1(SyncDataWorker syncDataWorker, Continuation continuation) {
        super(continuation);
        this.this$0 = syncDataWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= IntCompanionObject.MIN_VALUE;
        return this.this$0.doWork(this);
    }
}
