package com.gse.aulapp.util;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit invokeSuspend$lambda$0;
        Unit invokeSuspend$lambda$02;
        switch (this.a) {
            case 0:
                invokeSuspend$lambda$0 = DefaultLocationClient$getLocationUpdates$1.invokeSuspend$lambda$0((DefaultLocationClient) this.b, (DefaultLocationClient$getLocationUpdates$1$callback$1) this.c);
                return invokeSuspend$lambda$0;
            default:
                invokeSuspend$lambda$02 = NetworkConnectivityObserver$observe$1.invokeSuspend$lambda$0((NetworkConnectivityObserver) this.b, (NetworkConnectivityObserver$observe$1$callback$1) this.c);
                return invokeSuspend$lambda$02;
        }
    }
}
