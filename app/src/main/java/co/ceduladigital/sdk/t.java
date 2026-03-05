package co.ceduladigital.sdk;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.sync.MutexImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class t implements Function3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Unit resume$lambda$13$lambda$12;
        Function3 onSelectCancellationUnlockConstructor$lambda$1;
        switch (this.a) {
            case 0:
                if (obj == null) {
                    return BufferedChannel.b((BufferedChannel) this.b, obj2, obj3);
                }
                throw new ClassCastException();
            case 1:
                resume$lambda$13$lambda$12 = CancellableContinuationImpl.resume$lambda$13$lambda$12((Function1) this.b, (Throwable) obj, obj2, (CoroutineContext) obj3);
                return resume$lambda$13$lambda$12;
            case 2:
                if (obj != null) {
                    throw new ClassCastException();
                }
                onSelectCancellationUnlockConstructor$lambda$1 = MutexImpl.onSelectCancellationUnlockConstructor$lambda$1((MutexImpl) this.b, null, obj2, obj3);
                return onSelectCancellationUnlockConstructor$lambda$1;
            default:
                // Stubbed: SemaphoreAndMutexImpl.onCancellationRelease$lambda$2
                throw new UnsupportedOperationException("Decompiled stub");
        }
    }
}
