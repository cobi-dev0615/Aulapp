package co.ceduladigital.sdk;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class t2 implements ComponentFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        Object lambda$intoSet$3;
        Object lambda$of$1;
        switch (this.a) {
            case 0:
                lambda$intoSet$3 = Component.lambda$intoSet$3(this.b, componentContainer);
                return lambda$intoSet$3;
            default:
                lambda$of$1 = Component.lambda$of$1(this.b, componentContainer);
                return lambda$of$1;
        }
    }
}
