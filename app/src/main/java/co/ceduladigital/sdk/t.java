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
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Not decompiled");
            case 1:
                throw new UnsupportedOperationException("Not decompiled");
            case 2:
                throw new UnsupportedOperationException("Not decompiled");
            default:
                // Stubbed: SemaphoreAndMutexImpl.onCancellationRelease$lambda$2
                throw new UnsupportedOperationException("Decompiled stub");
        }
    }
}
