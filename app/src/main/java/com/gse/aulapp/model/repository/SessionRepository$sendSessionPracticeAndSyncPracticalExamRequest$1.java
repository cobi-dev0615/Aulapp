package com.gse.aulapp.model.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.IntCompanionObject;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.model.repository.SessionRepository", f = "SessionRepository.kt", i = {0, 0, 1, 1, 2}, l = {395, 401, 407}, m = "sendSessionPracticeAndSyncPracticalExamRequest", n = {"this", "context", "this", "context", "bodyResponse"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0"})
/* loaded from: classes.dex */
public final class SessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SessionRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$1(SessionRepository sessionRepository, Continuation<? super SessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$1> continuation) {
        super((Continuation<Object>) continuation);
        this.this$0 = sessionRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object sendSessionPracticeAndSyncPracticalExamRequest;
        this.result = obj;
        this.label |= IntCompanionObject.MIN_VALUE;
        sendSessionPracticeAndSyncPracticalExamRequest = this.this$0.sendSessionPracticeAndSyncPracticalExamRequest(null, null, this);
        return sendSessionPracticeAndSyncPracticalExamRequest;
    }
}
