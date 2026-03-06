package com.gse.aulapp.util;

import android.content.Context;
import android.net.ConnectivityManager;
import com.gse.aulapp.util.ConnectivityObserver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/gse/aulapp/util/NetworkConnectivityObserver;", "Lcom/gse/aulapp/util/ConnectivityObserver;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "connectivityManager", "Landroid/net/ConnectivityManager;", "observe", "Lkotlinx/coroutines/flow/Flow;", "Lcom/gse/aulapp/util/ConnectivityObserver$Status;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NetworkConnectivityObserver implements ConnectivityObserver {
    final ConnectivityManager connectivityManager;
    final Context context;

    public NetworkConnectivityObserver(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.connectivityManager = (ConnectivityManager) systemService;
    }

    @Override // com.gse.aulapp.util.ConnectivityObserver
    public Flow<ConnectivityObserver.Status> observe() {
        return FlowKt.distinctUntilChanged(FlowKt.callbackFlow(new NetworkConnectivityObserver$observe$1(this, null)));
    }
}
