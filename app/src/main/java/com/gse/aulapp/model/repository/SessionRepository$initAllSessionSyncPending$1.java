package com.gse.aulapp.model.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.IntCompanionObject;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.model.repository.SessionRepository", f = "SessionRepository.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, l = {933, 934, 940}, m = "initAllSessionSyncPending", n = {"this", "context", "result", "this", "context", "result", "it", "this", "context", "result"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$4", "L$0", "L$1", "L$2"})
/* loaded from: classes.dex */
public final class SessionRepository$initAllSessionSyncPending$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SessionRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionRepository$initAllSessionSyncPending$1(SessionRepository sessionRepository, Continuation continuation) {
        super((Continuation) continuation);
        this.this$0 = sessionRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= IntCompanionObject.MIN_VALUE;
        return this.this$0.initAllSessionSyncPending(null, this);
    }
}
