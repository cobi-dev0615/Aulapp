package co.ceduladigital.sdk;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.inject.Provider;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class z2 implements Provider {
    public final /* synthetic */ int a;

    public /* synthetic */ z2(int i) {
        this.a = i;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        switch (this.a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                throw new UnsupportedOperationException("Not decompiled");
            case 2:
                throw new UnsupportedOperationException("Not decompiled");
            case 3:
                throw new UnsupportedOperationException("Not decompiled");
            default:
                throw new UnsupportedOperationException("Not decompiled");
        }
    }
}
