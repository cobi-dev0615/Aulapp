package co.ceduladigital.sdk;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public final class f5 extends ContinuationImpl {
    public g5 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ g5 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(g5 g5Var, Continuation continuation) {
        super(continuation);
        this.c = g5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= IntCompanionObject.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
