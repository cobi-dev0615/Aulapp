package co.ceduladigital.sdk;

import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.view.fragment.HoursPerformedFragment;
import com.gse.aulapp.viewmodel.HoursPerformedViewModel;
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
public final class o6 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ HoursPerformedFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(HoursPerformedFragment hoursPerformedFragment, Continuation continuation) {
        super(2, continuation);
        this.b = hoursPerformedFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new o6(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o6) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            HoursPerformedFragment hoursPerformedFragment = this.b;
            HoursPerformedViewModel hoursPerformedViewModel = hoursPerformedFragment.b;
            if (hoursPerformedViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                hoursPerformedViewModel = null;
            }
            StateFlow<Status> message = hoursPerformedViewModel.getMessage();
            n6 n6Var = new n6(hoursPerformedFragment);
            this.a = 1;
            if (message.collect(n6Var, this) == coroutine_suspended) {
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
