package com.gse.aulapp.viewmodel;

import com.gse.aulapp.model.data.statusControl.ApiResult;
import com.gse.aulapp.model.response.SessionExamResponse;
import com.gse.aulapp.viewmodel.ClassInCourseViewModel$getSessionDataApi$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.IntCompanionObject;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.ClassInCourseViewModel$getSessionDataApi$1$1", f = "ClassInCourseViewModel.kt", i = {0, 0, 0, 1, 1}, l = {154, 156, 161}, m = "emit", n = {"this", "testResponse", "questionsResponses", "this", "testResponse"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
/* loaded from: classes2.dex */
public final class ClassInCourseViewModel$getSessionDataApi$1$1$emit$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ClassInCourseViewModel$getSessionDataApi$1.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ClassInCourseViewModel$getSessionDataApi$1$1$emit$1(ClassInCourseViewModel$getSessionDataApi$1.AnonymousClass1<? super T> anonymousClass1, Continuation<? super ClassInCourseViewModel$getSessionDataApi$1$1$emit$1> continuation) {
        super((Continuation<Object>) continuation);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= IntCompanionObject.MIN_VALUE;
        return this.this$0.emit((ApiResult<SessionExamResponse>) null, (Continuation<? super Unit>) this);
    }
}
