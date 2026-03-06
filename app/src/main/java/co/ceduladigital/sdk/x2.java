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
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Not decompiled");
            case 1:
                throw new UnsupportedOperationException("Not decompiled");
            default:
                throw new UnsupportedOperationException("Not decompiled");
        }
    }
}
