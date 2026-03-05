package co.ceduladigital.sdk;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.heartbeatinfo.HeartBeatInfoStorage;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.DataCollectionConfigStorage;

/* loaded from: classes.dex */
public final /* synthetic */ class a3 implements Provider {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a3(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        Object lambda$discoverComponents$0;
        HeartBeatInfoStorage lambda$new$2;
        DataCollectionConfigStorage lambda$new$0;
        switch (this.a) {
            case 0:
                lambda$discoverComponents$0 = ((ComponentRuntime) this.b).lambda$discoverComponents$0((Component) this.c);
                return lambda$discoverComponents$0;
            case 1:
                lambda$new$2 = DefaultHeartBeatController.lambda$new$2((Context) this.b, (String) this.c);
                return lambda$new$2;
            default:
                lambda$new$0 = ((FirebaseApp) this.b).lambda$new$0((Context) this.c);
                return lambda$new$0;
        }
    }
}
