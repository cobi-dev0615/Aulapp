package com.gse.aulapp.model.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.IntCompanionObject;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.model.repository.SessionRepository", f = "SessionRepository.kt", i = {}, l = {620}, m = "sendSessionSyncPracticalRequest", n = {}, s = {})
/* loaded from: classes.dex */
public final class SessionRepository$sendSessionSyncPracticalRequest$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SessionRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionRepository$sendSessionSyncPracticalRequest$1(SessionRepository sessionRepository, Continuation<? super SessionRepository$sendSessionSyncPracticalRequest$1> continuation) {
        super(continuation);
        this.this$0 = sessionRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object sendSessionSyncPracticalRequest;
        this.result = obj;
        this.label |= IntCompanionObject.MIN_VALUE;
        sendSessionSyncPracticalRequest = this.this$0.sendSessionSyncPracticalRequest(null, null, this);
        return sendSessionSyncPracticalRequest;
    }
}
