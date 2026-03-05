package co.ceduladigital.sdk;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.flow.internal.SafeCollector;
import kotlinx.coroutines.internal.ThreadContextKt;

/* loaded from: classes2.dex */
public final /* synthetic */ class d3 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ d3(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean hasCopyableElements$lambda$0;
        CoroutineContext plus;
        int collectContextSize$lambda$0;
        Object countAll$lambda$0;
        switch (this.a) {
            case 0:
                hasCopyableElements$lambda$0 = CoroutineContextKt.hasCopyableElements$lambda$0(((Boolean) obj).booleanValue(), (CoroutineContext.Element) obj2);
                return Boolean.valueOf(hasCopyableElements$lambda$0);
            case 1:
                plus = ((CoroutineContext) obj).plus((CoroutineContext.Element) obj2);
                return plus;
            case 2:
                collectContextSize$lambda$0 = SafeCollector.collectContextSize$lambda$0(((Integer) obj).intValue(), (CoroutineContext.Element) obj2);
                return Integer.valueOf(collectContextSize$lambda$0);
            case 3:
                countAll$lambda$0 = ThreadContextKt.countAll$lambda$0(obj, (CoroutineContext.Element) obj2);
                return countAll$lambda$0;
            default:
                if (obj != null) {
                    throw new ClassCastException();
                }
                ThreadContextKt.findOne$lambda$1(null, (CoroutineContext.Element) obj2);
                return null;
        }
    }
}
