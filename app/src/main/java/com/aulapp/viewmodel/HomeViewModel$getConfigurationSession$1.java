package com.gse.aulapp.viewmodel;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.IntCompanionObject;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.HomeViewModel", f = "HomeViewModel.kt", i = {}, l = {1075}, m = "getConfigurationSession", n = {}, s = {})
/* loaded from: classes2.dex */
public final class HomeViewModel$getConfigurationSession$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$getConfigurationSession$1(HomeViewModel homeViewModel, Continuation<? super HomeViewModel$getConfigurationSession$1> continuation) {
        super(continuation);
        this.this$0 = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object configurationSession;
        this.result = obj;
        this.label |= IntCompanionObject.MIN_VALUE;
        configurationSession = this.this$0.getConfigurationSession(null, this);
        return configurationSession;
    }
}
