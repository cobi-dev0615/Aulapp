package co.ceduladigital.sdk;

import com.gse.aulapp.view.fragment.PracticeClassFragment;
import com.gse.aulapp.viewmodel.PracticeClassViewModel;
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
@SuppressWarnings("unchecked")
public final class n7 extends SuspendLambda implements Function2<Object, Object, Object> {
    public int a;
    public final /* synthetic */ PracticeClassFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(PracticeClassFragment practiceClassFragment, Continuation continuation) {
        super(2, continuation);
        this.b = practiceClassFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new n7(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n7) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PracticeClassFragment practiceClassFragment = this.b;
            PracticeClassViewModel practiceClassViewModel = practiceClassFragment.b;
            if (practiceClassViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                practiceClassViewModel = null;
            }
            StateFlow<Boolean> isTimeForAlarm = practiceClassViewModel.isTimeForAlarm();
            k7 k7Var = new k7(practiceClassFragment, 1);
            this.a = 1;
            if (isTimeForAlarm.collect(k7Var, this) == coroutine_suspended) {
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
