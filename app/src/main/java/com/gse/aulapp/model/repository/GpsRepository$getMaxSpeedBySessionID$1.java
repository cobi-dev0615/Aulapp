package com.gse.aulapp.model.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.IntCompanionObject;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.model.repository.GpsRepository", f = "GpsRepository.kt", i = {0, 0}, l = {45, 46}, m = "getMaxSpeedBySessionID", n = {"this", "query"}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
public final class GpsRepository$getMaxSpeedBySessionID$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GpsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GpsRepository$getMaxSpeedBySessionID$1(GpsRepository gpsRepository, Continuation continuation) {
        super((Continuation) continuation);
        this.this$0 = gpsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= IntCompanionObject.MIN_VALUE;
        return this.this$0.getMaxSpeedBySessionID(null, this);
    }
}
