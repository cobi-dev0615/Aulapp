package co.ceduladigital.sdk;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.platforminfo.LibraryVersion;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.tracing.ComponentMonitor;

/* loaded from: classes.dex */
public final /* synthetic */ class y2 implements ComponentFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y2(Object obj, int i, String str) {
        this.a = i;
        this.b = str;
        this.c = obj;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        Object lambda$processRegistrar$0;
        LibraryVersion lambda$fromContext$0;
        switch (this.a) {
            case 0:
                lambda$processRegistrar$0 = ComponentMonitor.lambda$processRegistrar$0(this.b, (Component) this.c, componentContainer);
                return lambda$processRegistrar$0;
            default:
                lambda$fromContext$0 = LibraryVersionComponent.lambda$fromContext$0(this.b, (LibraryVersionComponent.VersionExtractor) this.c, componentContainer);
                return lambda$fromContext$0;
        }
    }
}
