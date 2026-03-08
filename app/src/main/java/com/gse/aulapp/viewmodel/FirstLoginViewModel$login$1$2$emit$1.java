package com.gse.aulapp.viewmodel;

import com.gse.aulapp.model.data.statusControl.ApiResult;
import com.gse.aulapp.model.response.LoginResponse;
import com.gse.aulapp.viewmodel.FirstLoginViewModel$login$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.IntCompanionObject;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.FirstLoginViewModel$login$1$2", f = "FirstLoginViewModel.kt", i = {0, 0, 2, 2}, l = {360, 366, 446, 460, 468, 477}, m = "emit", n = {"this", "apiResponse", "this", "apiResponse"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes2.dex */
public final class FirstLoginViewModel$login$1$2$emit$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FirstLoginViewModel$login$1.AnonymousClass2<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @SuppressWarnings("unchecked")
    public FirstLoginViewModel$login$1$2$emit$1(FirstLoginViewModel$login$1.AnonymousClass2 anonymousClass2, Continuation continuation) {
        super(continuation);
        this.this$0 = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= IntCompanionObject.MIN_VALUE;
        return this.this$0.emit((ApiResult<LoginResponse>) null, (Continuation<? super Unit>) this);
    }
}
