package co.ceduladigital.sdk;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* loaded from: classes.dex */
public final /* synthetic */ class k3 implements Deferred.DeferredHandler, SynchronizationGuard.CriticalSection {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k3(Uploader uploader, Iterable iterable, TransportContext transportContext, long j) {
        this.b = uploader;
        this.c = iterable;
        this.d = transportContext;
        this.a = j;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        Object lambda$logAndUpdateState$4;
        lambda$logAndUpdateState$4 = ((Uploader) this.b).lambda$logAndUpdateState$4((Iterable) this.c, (TransportContext) this.d, this.a);
        return lambda$logAndUpdateState$4;
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void handle(Provider provider) {
        CrashlyticsNativeComponentDeferredProxy.lambda$prepareNativeSession$1((String) this.b, (String) this.c, this.a, (StaticSessionData) this.d, provider);
    }

    public /* synthetic */ k3(String str, String str2, long j, StaticSessionData staticSessionData) {
        this.b = str;
        this.c = str2;
        this.a = j;
        this.d = staticSessionData;
    }
}
