package com.gse.aulapp.viewmodel;

import com.gse.aulapp.model.data.statusControl.ApiResult;
import com.gse.aulapp.model.response.RefreshTokenResponse;
import com.gse.aulapp.viewmodel.FirstLoginViewModel$refreshToken$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.IntCompanionObject;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.FirstLoginViewModel$refreshToken$1$2", f = "FirstLoginViewModel.kt", i = {0, 0}, l = {285, 299, 310, 321, 324}, m = "emit", n = {"this", "apiResponse"}, s = {"L$0", "L$1"})
/* loaded from: classes2.dex */
public final class FirstLoginViewModel$refreshToken$1$2$emit$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FirstLoginViewModel$refreshToken$1.AnonymousClass2<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FirstLoginViewModel$refreshToken$1$2$emit$1(FirstLoginViewModel$refreshToken$1.AnonymousClass2<? super T> anonymousClass2, Continuation<? super FirstLoginViewModel$refreshToken$1$2$emit$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= IntCompanionObject.MIN_VALUE;
        return this.this$0.emit((ApiResult<RefreshTokenResponse>) null, (Continuation<? super Unit>) this);
    }
}
