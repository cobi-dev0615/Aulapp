package co.ceduladigital.sdk;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;

/* loaded from: classes.dex */
public final /* synthetic */ class l3 implements ComponentFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        switch (this.a) {
            case 0:
                /* Stubbed: CrashlyticsRegistrar.buildCrashlytics is not accessible */
                return null;
            default:
                /* Stubbed: DefaultHeartBeatController.lambda$component$3 is not accessible */
                return null;
        }
    }
}
