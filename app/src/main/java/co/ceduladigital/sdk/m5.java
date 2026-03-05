package co.ceduladigital.sdk;

import com.gse.aulapp.view.fragment.FirstLoginFragment;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public final class m5 extends ContinuationImpl {
    public FirstLoginFragment a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ FirstLoginFragment d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(FirstLoginFragment firstLoginFragment, Continuation continuation) {
        super(continuation);
        this.d = firstLoginFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= IntCompanionObject.MIN_VALUE;
        return FirstLoginFragment.c(this.d, null, this);
    }
}
