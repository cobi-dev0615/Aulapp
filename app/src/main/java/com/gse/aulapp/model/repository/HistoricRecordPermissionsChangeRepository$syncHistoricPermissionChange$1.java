package com.gse.aulapp.model.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.IntCompanionObject;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.model.repository.HistoricRecordPermissionsChangeRepository", f = "HistoricRecordPermissionsChangeRepository.kt", i = {0, 0}, l = {57, 58}, m = "syncHistoricPermissionChange", n = {"this", "context"}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
public final class HistoricRecordPermissionsChangeRepository$syncHistoricPermissionChange$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HistoricRecordPermissionsChangeRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoricRecordPermissionsChangeRepository$syncHistoricPermissionChange$1(HistoricRecordPermissionsChangeRepository historicRecordPermissionsChangeRepository, Continuation<? super HistoricRecordPermissionsChangeRepository$syncHistoricPermissionChange$1> continuation) {
        super((Continuation<Object>) continuation);
        this.this$0 = historicRecordPermissionsChangeRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= IntCompanionObject.MIN_VALUE;
        return this.this$0.syncHistoricPermissionChange(null, this);
    }
}
