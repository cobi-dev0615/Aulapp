package com.gse.aulapp.viewmodel;

import com.gse.aulapp.model.data.statusControl.ApiResult;
import com.gse.aulapp.model.response.SessionInstructorResponse;
import com.gse.aulapp.viewmodel.HomeViewModel$getSessionFromApiAndSave$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.IntCompanionObject;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.HomeViewModel$getSessionFromApiAndSave$1$2", f = "HomeViewModel.kt", i = {0, 0, 0, 1, 1, 1}, l = {160, 166, 184, 190, 199, 205}, m = "emit", n = {"this", "apiResponse", "result", "this", "apiResponse", "result"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
/* loaded from: classes2.dex */
public final class HomeViewModel$getSessionFromApiAndSave$1$2$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomeViewModel$getSessionFromApiAndSave$1.AnonymousClass2<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HomeViewModel$getSessionFromApiAndSave$1$2$emit$1(HomeViewModel$getSessionFromApiAndSave$1.AnonymousClass2<? super T> anonymousClass2, Continuation<? super HomeViewModel$getSessionFromApiAndSave$1$2$emit$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= IntCompanionObject.MIN_VALUE;
        return this.this$0.emit((ApiResult<SessionInstructorResponse>) null, (Continuation<? super Unit>) this);
    }
}
