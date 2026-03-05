package co.ceduladigital.sdk;

import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class q3 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String lambda$getHeartBeatsHeader$1;
        Void lambda$registerHeartBeat$0;
        Boolean lambda$checkForPreviousCrash$10;
        switch (this.a) {
            case 0:
                lambda$getHeartBeatsHeader$1 = ((DefaultHeartBeatController) this.b).lambda$getHeartBeatsHeader$1();
                return lambda$getHeartBeatsHeader$1;
            case 1:
                lambda$registerHeartBeat$0 = ((DefaultHeartBeatController) this.b).lambda$registerHeartBeat$0();
                return lambda$registerHeartBeat$0;
            default:
                lambda$checkForPreviousCrash$10 = ((CrashlyticsCore) this.b).lambda$checkForPreviousCrash$10();
                return lambda$checkForPreviousCrash$10;
        }
    }
}
