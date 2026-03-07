package com.gse.aulapp.util;

import com.gse.aulapp.databinding.DialogExamInfoLayoutBinding;
import com.gse.aulapp.model.repository.GpsRepository;
import com.gse.aulapp.util.DataClassUtil;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.IntCompanionObject;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.util.DataClassUtil$Companion", f = "DataClassUtil.kt", i = {0}, l = {50, 63}, m = "updateClassValues", n = {"binding"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class DataClassUtil$Companion$updateClassValues$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DataClassUtil.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataClassUtil$Companion$updateClassValues$1(DataClassUtil.Companion companion, Continuation continuation) {
        super((Continuation) continuation);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= IntCompanionObject.MIN_VALUE;
        return this.this$0.updateClassValues((DialogExamInfoLayoutBinding) null, (GpsRepository) null, (String) null, this);
    }
}
