package co.ceduladigital.sdk;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
@SuppressWarnings("unchecked")
public final /* synthetic */ class d3 implements Function2<Object, Object, Object> {
    public final /* synthetic */ int a;

    public /* synthetic */ d3(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineContext plus;
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Not decompiled");
            case 1:
                plus = ((CoroutineContext) obj).plus((CoroutineContext.Element) obj2);
                return plus;
            case 2:
                throw new UnsupportedOperationException("Not decompiled");
            case 3:
                throw new UnsupportedOperationException("Not decompiled");
            default:
                throw new UnsupportedOperationException("Not decompiled");
        }
    }
}
