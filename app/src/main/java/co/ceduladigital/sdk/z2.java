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
        ScheduledExecutorService lambda$static$0;
        ScheduledExecutorService lambda$static$1;
        ScheduledExecutorService lambda$static$2;
        ScheduledExecutorService lambda$static$3;
        switch (this.a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                lambda$static$0 = ExecutorsRegistrar.lambda$static$0();
                return lambda$static$0;
            case 2:
                lambda$static$1 = ExecutorsRegistrar.lambda$static$1();
                return lambda$static$1;
            case 3:
                lambda$static$2 = ExecutorsRegistrar.lambda$static$2();
                return lambda$static$2;
            default:
                lambda$static$3 = ExecutorsRegistrar.lambda$static$3();
                return lambda$static$3;
        }
    }
}
