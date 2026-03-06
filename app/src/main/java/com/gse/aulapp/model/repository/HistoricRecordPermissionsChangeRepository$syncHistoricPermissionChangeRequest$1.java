package com.gse.aulapp.model.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.IntCompanionObject;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.model.repository.HistoricRecordPermissionsChangeRepository", f = "HistoricRecordPermissionsChangeRepository.kt", i = {0, 0, 0}, l = {74}, m = "syncHistoricPermissionChangeRequest", n = {"this", "context", "destination$iv$iv"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes.dex */
public final class HistoricRecordPermissionsChangeRepository$syncHistoricPermissionChangeRequest$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HistoricRecordPermissionsChangeRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoricRecordPermissionsChangeRepository$syncHistoricPermissionChangeRequest$1(HistoricRecordPermissionsChangeRepository historicRecordPermissionsChangeRepository, Continuation<? super HistoricRecordPermissionsChangeRepository$syncHistoricPermissionChangeRequest$1> continuation) {
        super((Continuation<Object>) continuation);
        this.this$0 = historicRecordPermissionsChangeRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object syncHistoricPermissionChangeRequest;
        this.result = obj;
        this.label |= IntCompanionObject.MIN_VALUE;
        syncHistoricPermissionChangeRequest = this.this$0.syncHistoricPermissionChangeRequest(null, null, this);
        return syncHistoricPermissionChangeRequest;
    }
}
