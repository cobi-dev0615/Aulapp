package co.ceduladigital.sdk;

import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.view.fragment.LoginFragment;
import com.gse.aulapp.viewmodel.LoginViewModel;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes2.dex */
public final class v6 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ LoginFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(LoginFragment loginFragment, Continuation continuation) {
        super(2, continuation);
        this.b = loginFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new v6(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v6) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LoginFragment loginFragment = this.b;
            LoginViewModel loginViewModel = loginFragment.a;
            if (loginViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                loginViewModel = null;
            }
            StateFlow<Status> message = loginViewModel.getMessage();
            u6 u6Var = new u6(loginFragment);
            this.a = 1;
            if (message.collect(u6Var, this) == coroutine_suspended) {
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
