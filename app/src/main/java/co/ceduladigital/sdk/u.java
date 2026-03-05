package co.ceduladigital.sdk;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.sync.MutexImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class u implements Function3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u(Object obj, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Unit bindCancellationFun$lambda$89;
        Unit onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56$lambda$55;
        Unit onSelectCancellationUnlockConstructor$lambda$1$lambda$0;
        Throwable th = (Throwable) obj;
        CoroutineContext coroutineContext = (CoroutineContext) obj3;
        switch (this.a) {
            case 0:
                bindCancellationFun$lambda$89 = BufferedChannel.bindCancellationFun$lambda$89((Function1) this.c, this.b, th, obj2, coroutineContext);
                return bindCancellationFun$lambda$89;
            case 1:
                onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56$lambda$55 = BufferedChannel.onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56$lambda$55(this.b, (BufferedChannel) this.c, null, th, obj2, coroutineContext);
                return onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56$lambda$55;
            default:
                onSelectCancellationUnlockConstructor$lambda$1$lambda$0 = MutexImpl.onSelectCancellationUnlockConstructor$lambda$1$lambda$0((MutexImpl) this.c, this.b, th, obj2, coroutineContext);
                return onSelectCancellationUnlockConstructor$lambda$1$lambda$0;
        }
    }

    public /* synthetic */ u(Object obj, BufferedChannel bufferedChannel) {
        this.a = 1;
        this.b = obj;
        this.c = bufferedChannel;
    }
}
