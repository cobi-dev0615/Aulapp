package com.gse.aulapp.model.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.IntCompanionObject;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.model.repository.SessionRepository", f = "SessionRepository.kt", i = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16}, l = {786, 791, 796, 801, 806, 811, 816, 821, 826, 831, 836, 841, 846, 851, 856, 861, 866, 871}, m = "deleteLogOutSession", n = {"this", "this", "this", "this", "this", "this", "this", "this", "this", "this", "this", "this", "this", "this", "this", "this", "this"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$0"})
/* loaded from: classes.dex */
public final class SessionRepository$deleteLogOutSession$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SessionRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionRepository$deleteLogOutSession$1(SessionRepository sessionRepository, Continuation<? super SessionRepository$deleteLogOutSession$1> continuation) {
        super(continuation);
        this.this$0 = sessionRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= IntCompanionObject.MIN_VALUE;
        return this.this$0.deleteLogOutSession(this);
    }
}
