package com.gse.aulapp.model.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.IntCompanionObject;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.model.repository.HistoricRecordPermissionsChangeRepository", f = "HistoricRecordPermissionsChangeRepository.kt", i = {0, 0, 0, 1, 1, 1, 2}, l = {89, 96, 103}, m = "sendSyncHistoricPermissionChange", n = {"this", "context", "id", "this", "context", "id", "context"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0"})
/* loaded from: classes.dex */
public final class HistoricRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HistoricRecordPermissionsChangeRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoricRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$1(HistoricRecordPermissionsChangeRepository historicRecordPermissionsChangeRepository, Continuation<? super HistoricRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$1> continuation) {
        super((kotlin.coroutines.Continuation) continuation);
        this.this$0 = historicRecordPermissionsChangeRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object sendSyncHistoricPermissionChange;
        this.result = obj;
        this.label |= IntCompanionObject.MIN_VALUE;
        sendSyncHistoricPermissionChange = this.this$0.sendSyncHistoricPermissionChange(null, null, null, this);
        return sendSyncHistoricPermissionChange;
    }
}
