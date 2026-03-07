package com.gse.aulapp.model.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.IntCompanionObject;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.model.repository.ClassInCourseRepository", f = "ClassInCourseRepository.kt", i = {0}, l = {61, 63}, m = "deleteAllQuestionBySessionID", n = {"this"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class ClassInCourseRepository$deleteAllQuestionBySessionID$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ClassInCourseRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassInCourseRepository$deleteAllQuestionBySessionID$1(ClassInCourseRepository classInCourseRepository, Continuation continuation) {
        super((Continuation) continuation);
        this.this$0 = classInCourseRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= IntCompanionObject.MIN_VALUE;
        return this.this$0.deleteAllQuestionBySessionID(null, this);
    }
}
