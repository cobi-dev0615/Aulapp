package co.ceduladigital.sdk;

import com.google.android.datatransport.TransportFactory;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.firestore.FirestoreMultiDbComponent;
import com.google.firebase.firestore.FirestoreRegistrar;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;
import com.google.firebase.platforminfo.UserAgentPublisher;
import com.google.firebase.sessions.FirebaseSessions;
import com.google.firebase.sessions.FirebaseSessionsComponent;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class u3 implements ComponentFactory {
    public final /* synthetic */ int a;

    public /* synthetic */ u3(int i) {
        this.a = i;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        UserAgentPublisher lambda$component$0;
        ScheduledExecutorService lambda$getComponents$4;
        ScheduledExecutorService lambda$getComponents$5;
        ScheduledExecutorService lambda$getComponents$6;
        Executor lambda$getComponents$7;
        FirebaseInstallationsApi lambda$getComponents$0;
        FirebaseSessions components$lambda$0;
        FirebaseSessionsComponent components$lambda$1;
        FirestoreMultiDbComponent lambda$getComponents$02;
        TransportFactory lambda$getComponents$03;
        TransportFactory lambda$getComponents$1;
        TransportFactory lambda$getComponents$2;
        switch (this.a) {
            case 0:
                lambda$component$0 = DefaultUserAgentPublisher.lambda$component$0(componentContainer);
                return lambda$component$0;
            case 1:
                lambda$getComponents$4 = ExecutorsRegistrar.lambda$getComponents$4(componentContainer);
                return lambda$getComponents$4;
            case 2:
                lambda$getComponents$5 = ExecutorsRegistrar.lambda$getComponents$5(componentContainer);
                return lambda$getComponents$5;
            case 3:
                lambda$getComponents$6 = ExecutorsRegistrar.lambda$getComponents$6(componentContainer);
                return lambda$getComponents$6;
            case 4:
                lambda$getComponents$7 = ExecutorsRegistrar.lambda$getComponents$7(componentContainer);
                return lambda$getComponents$7;
            case 5:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(componentContainer);
                return lambda$getComponents$0;
            case 6:
                components$lambda$0 = FirebaseSessionsRegistrar.getComponents$lambda$0(componentContainer);
                return components$lambda$0;
            case 7:
                components$lambda$1 = FirebaseSessionsRegistrar.getComponents$lambda$1(componentContainer);
                return components$lambda$1;
            case 8:
                lambda$getComponents$02 = FirestoreRegistrar.lambda$getComponents$0(componentContainer);
                return lambda$getComponents$02;
            case 9:
                lambda$getComponents$03 = TransportRegistrar.lambda$getComponents$0(componentContainer);
                return lambda$getComponents$03;
            case 10:
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(componentContainer);
                return lambda$getComponents$1;
            default:
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(componentContainer);
                return lambda$getComponents$2;
        }
    }
}
