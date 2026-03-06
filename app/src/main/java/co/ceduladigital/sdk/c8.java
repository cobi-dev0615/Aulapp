package co.ceduladigital.sdk;

import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.view.fragment.RideHistoryFragment;
import com.gse.aulapp.viewmodel.RideHistoryViewModel;
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
@SuppressWarnings({"rawtypes", "unchecked"})
public final class c8 extends SuspendLambda implements Function2<Object, Object, Object> {
    public int a;
    public final /* synthetic */ RideHistoryFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8(RideHistoryFragment rideHistoryFragment, Continuation continuation) {
        super(2, continuation);
        this.b = rideHistoryFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c8(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c8) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            RideHistoryFragment rideHistoryFragment = this.b;
            RideHistoryViewModel rideHistoryViewModel = rideHistoryFragment.a;
            if (rideHistoryViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                rideHistoryViewModel = null;
            }
            StateFlow<Status> message = rideHistoryViewModel.getMessage();
            b8 b8Var = new b8(rideHistoryFragment);
            this.a = 1;
            if (message.collect(b8Var, this) == coroutine_suspended) {
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
