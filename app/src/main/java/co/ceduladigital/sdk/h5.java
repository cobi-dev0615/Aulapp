package co.ceduladigital.sdk;

import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.view.fragment.FirstLoginFragment;
import com.gse.aulapp.viewmodel.FirstLoginViewModel;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlow;

/* loaded from: classes2.dex */
public final class h5 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ FirstLoginFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(FirstLoginFragment firstLoginFragment, Continuation continuation) {
        super(2, continuation);
        this.b = firstLoginFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new h5(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h5) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FirstLoginFragment firstLoginFragment = this.b;
            FirstLoginViewModel firstLoginViewModel = firstLoginFragment.k;
            if (firstLoginViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                firstLoginViewModel = null;
            }
            SharedFlow<Status> messageRefreshTokenCEA = firstLoginViewModel.getMessageRefreshTokenCEA();
            g5 g5Var = new g5(firstLoginFragment);
            this.a = 1;
            if (messageRefreshTokenCEA.collect(g5Var, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
