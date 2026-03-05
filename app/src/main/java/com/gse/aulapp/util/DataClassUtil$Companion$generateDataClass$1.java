package com.gse.aulapp.util;

import com.gse.aulapp.util.DataClassUtil;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.IntCompanionObject;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.util.DataClassUtil$Companion", f = "DataClassUtil.kt", i = {0, 0, 1, 1, 1, 2, 2}, l = {27, 28, 29}, m = "generateDataClass", n = {"sessionId", "gpsRepository", "sessionId", "gpsRepository", "gpsTrackerPointList", "gpsTrackerPointList", "averageSpeed"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "D$0"})
/* loaded from: classes.dex */
public final class DataClassUtil$Companion$generateDataClass$1 extends ContinuationImpl {
    double D$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DataClassUtil.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataClassUtil$Companion$generateDataClass$1(DataClassUtil.Companion companion, Continuation<? super DataClassUtil$Companion$generateDataClass$1> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= IntCompanionObject.MIN_VALUE;
        return this.this$0.generateDataClass(null, null, this);
    }
}
