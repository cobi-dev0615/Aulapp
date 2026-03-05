package com.gse.aulapp.util;

import com.gse.aulapp.util.ConnectivityObserver;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.util.NetworkConnectivityObserver$observe$1$callback$1$onLosing$1", f = "NetworkConnectivityObserver.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class NetworkConnectivityObserver$observe$1$callback$1$onLosing$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ProducerScope<ConnectivityObserver.Status> $$this$callbackFlow;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NetworkConnectivityObserver$observe$1$callback$1$onLosing$1(ProducerScope<? super ConnectivityObserver.Status> producerScope, Continuation<? super NetworkConnectivityObserver$observe$1$callback$1$onLosing$1> continuation) {
        super(2, continuation);
        this.$$this$callbackFlow = producerScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NetworkConnectivityObserver$observe$1$callback$1$onLosing$1(this.$$this$callbackFlow, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ProducerScope<ConnectivityObserver.Status> producerScope = this.$$this$callbackFlow;
            ConnectivityObserver.Status status = ConnectivityObserver.Status.Losing;
            this.label = 1;
            if (producerScope.send(status, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NetworkConnectivityObserver$observe$1$callback$1$onLosing$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
