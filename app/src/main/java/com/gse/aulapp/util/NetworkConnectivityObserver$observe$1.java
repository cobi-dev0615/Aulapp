package com.gse.aulapp.util;

import android.net.ConnectivityManager;
import android.net.Network;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/gse/aulapp/util/ConnectivityObserver$Status;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.util.NetworkConnectivityObserver$observe$1", f = "NetworkConnectivityObserver.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class NetworkConnectivityObserver$observe$1 extends SuspendLambda implements Function2<ProducerScope<? super ConnectivityObserver.Status>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NetworkConnectivityObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkConnectivityObserver$observe$1(NetworkConnectivityObserver networkConnectivityObserver, Continuation continuation) {
        super(2, (Continuation<Object>) continuation);
        this.this$0 = networkConnectivityObserver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(NetworkConnectivityObserver networkConnectivityObserver, Object networkConnectivityObserver$observe$1$callback$1) {
        ConnectivityManager connectivityManager;
        connectivityManager = networkConnectivityObserver.connectivityManager;
        connectivityManager.unregisterNetworkCallback((ConnectivityManager.NetworkCallback) networkConnectivityObserver$observe$1$callback$1);
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NetworkConnectivityObserver$observe$1 networkConnectivityObserver$observe$1 = new NetworkConnectivityObserver$observe$1(this.this$0, (Continuation) continuation);
        networkConnectivityObserver$observe$1.L$0 = obj;
        return (Continuation<Unit>) (Object) networkConnectivityObserver$observe$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ConnectivityManager connectivityManager;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback() { // from class: com.gse.aulapp.util.NetworkConnectivityObserver$observe$1$callback$1
                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(Network network) {
                    Intrinsics.checkNotNullParameter(network, "network");
                    super.onAvailable(network);
                    ProducerScope<ConnectivityObserver.Status> producerScope2 = producerScope;
                    BuildersKt.launch(producerScope2, (CoroutineContext) null, (CoroutineStart) null, new NetworkConnectivityObserver$observe$1$callback$1$onAvailable$1(producerScope2, null));
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLosing(Network network, int maxMsToLive) {
                    Intrinsics.checkNotNullParameter(network, "network");
                    super.onLosing(network, maxMsToLive);
                    ProducerScope<ConnectivityObserver.Status> producerScope2 = producerScope;
                    BuildersKt.launch(producerScope2, (CoroutineContext) null, (CoroutineStart) null, new NetworkConnectivityObserver$observe$1$callback$1$onLosing$1(producerScope2, null));
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(Network network) {
                    Intrinsics.checkNotNullParameter(network, "network");
                    super.onLost(network);
                    ProducerScope<ConnectivityObserver.Status> producerScope2 = producerScope;
                    BuildersKt.launch(producerScope2, (CoroutineContext) null, (CoroutineStart) null, new NetworkConnectivityObserver$observe$1$callback$1$onLost$1(producerScope2, null));
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onUnavailable() {
                    super.onUnavailable();
                    ProducerScope<ConnectivityObserver.Status> producerScope2 = producerScope;
                    BuildersKt.launch(producerScope2, (CoroutineContext) null, (CoroutineStart) null, new NetworkConnectivityObserver$observe$1$callback$1$onUnavailable$1(producerScope2, null));
                }
            };
            connectivityManager = this.this$0.connectivityManager;
            connectivityManager.registerDefaultNetworkCallback(networkCallback);
            a aVar = new a(this.this$0, networkCallback, 1);
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, aVar, this) == coroutine_suspended) {
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
    public final Object invoke(ProducerScope<? super ConnectivityObserver.Status> producerScope, Continuation<? super Unit> continuation) {
        return ((NetworkConnectivityObserver$observe$1) (Object) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
