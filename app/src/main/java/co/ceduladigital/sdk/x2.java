package co.ceduladigital.sdk;

import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentDiscovery;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.installations.local.IidStore;

/* loaded from: classes.dex */
public final /* synthetic */ class x2 implements Provider {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        ComponentRegistrar instantiate;
        ComponentRegistrar lambda$addComponentRegistrar$0;
        IidStore lambda$new$0;
        switch (this.a) {
            case 0:
                instantiate = ComponentDiscovery.instantiate((String) this.b);
                return instantiate;
            case 1:
                lambda$addComponentRegistrar$0 = ComponentRuntime.Builder.lambda$addComponentRegistrar$0((ComponentRegistrar) this.b);
                return lambda$addComponentRegistrar$0;
            default:
                lambda$new$0 = FirebaseInstallations.lambda$new$0((FirebaseApp) this.b);
                return lambda$new$0;
        }
    }
}
