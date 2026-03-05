package com.gse.aulapp.viewmodel;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.IntCompanionObject;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.ClassInCourseViewModel", f = "ClassInCourseViewModel.kt", i = {0}, l = {265}, m = "loadQuestionsFromDB", n = {"context"}, s = {"L$0"})
/* loaded from: classes2.dex */
public final class ClassInCourseViewModel$loadQuestionsFromDB$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ClassInCourseViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassInCourseViewModel$loadQuestionsFromDB$1(ClassInCourseViewModel classInCourseViewModel, Continuation<? super ClassInCourseViewModel$loadQuestionsFromDB$1> continuation) {
        super(continuation);
        this.this$0 = classInCourseViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object loadQuestionsFromDB;
        this.result = obj;
        this.label |= IntCompanionObject.MIN_VALUE;
        loadQuestionsFromDB = this.this$0.loadQuestionsFromDB(null, null, null, null, this);
        return loadQuestionsFromDB;
    }
}
