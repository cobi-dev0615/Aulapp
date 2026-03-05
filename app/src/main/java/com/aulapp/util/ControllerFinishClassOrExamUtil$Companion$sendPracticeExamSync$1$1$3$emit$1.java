package com.gse.aulapp.util;

import com.gse.aulapp.model.data.statusControl.ApiResult;
import com.gse.aulapp.model.response.SessionPracticeExamResponse;
import com.gse.aulapp.util.ControllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.IntCompanionObject;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.util.ControllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1$3", f = "ControllerFinishClassOrExamUtil.kt", i = {0, 0, 1, 1, 1, 1, 2}, l = {69, 83, 145}, m = "emit", n = {"this", "apiResponse", "this", "apiResponse", "approved", "disapproved", "this"}, s = {"L$0", "L$1", "L$0", "L$1", "I$0", "I$1", "L$0"})
/* loaded from: classes.dex */
public final class ControllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1$3$emit$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ControllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1.AnonymousClass1.AnonymousClass3<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ControllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1$3$emit$1(ControllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1.AnonymousClass1.AnonymousClass3<? super T> anonymousClass3, Continuation<? super ControllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1$1$3$emit$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= IntCompanionObject.MIN_VALUE;
        return this.this$0.emit((ApiResult<SessionPracticeExamResponse>) null, (Continuation<? super Unit>) this);
    }
}
