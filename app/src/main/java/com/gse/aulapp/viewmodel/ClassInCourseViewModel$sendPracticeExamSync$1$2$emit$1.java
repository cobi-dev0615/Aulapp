package com.gse.aulapp.viewmodel;

import com.gse.aulapp.model.data.statusControl.ApiResult;
import com.gse.aulapp.model.response.SessionPracticeExamResponse;
import com.gse.aulapp.viewmodel.ClassInCourseViewModel$sendPracticeExamSync$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.IntCompanionObject;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.ClassInCourseViewModel$sendPracticeExamSync$1$2", f = "ClassInCourseViewModel.kt", i = {0, 0, 1, 1, 1, 1, 2}, l = {1029, 1043, 1093}, m = "emit", n = {"this", "apiResponse", "this", "apiResponse", "approved", "disapproved", "this"}, s = {"L$0", "L$1", "L$0", "L$1", "I$0", "I$1", "L$0"})
/* loaded from: classes2.dex */
public final class ClassInCourseViewModel$sendPracticeExamSync$1$2$emit$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ClassInCourseViewModel$sendPracticeExamSync$1.AnonymousClass2<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ClassInCourseViewModel$sendPracticeExamSync$1$2$emit$1(ClassInCourseViewModel$sendPracticeExamSync$1.AnonymousClass2<? super T> anonymousClass2, Continuation<? super ClassInCourseViewModel$sendPracticeExamSync$1$2$emit$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= IntCompanionObject.MIN_VALUE;
        return this.this$0.emit((ApiResult<SessionPracticeExamResponse>) null, (Continuation<? super Unit>) this);
    }
}
