package co.ceduladigital.sdk;

import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.view.fragment.ClassPracticeBeforeFragment;
import com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel;
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
@SuppressWarnings("unchecked")
public final class v1 extends SuspendLambda implements Function2<Object, Object, Object> {
    public int a;
    public final /* synthetic */ ClassPracticeBeforeFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(ClassPracticeBeforeFragment classPracticeBeforeFragment, Continuation continuation) {
        super(2, continuation);
        this.b = classPracticeBeforeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new v1(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ClassPracticeBeforeFragment classPracticeBeforeFragment = this.b;
            ClassPracticeBeforeViewModel classPracticeBeforeViewModel = classPracticeBeforeFragment.b;
            if (classPracticeBeforeViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                classPracticeBeforeViewModel = null;
            }
            SharedFlow<Status> messageBiometrix = classPracticeBeforeViewModel.getMessageBiometrix();
            u1 u1Var = new u1(classPracticeBeforeFragment);
            this.a = 1;
            if (messageBiometrix.collect(u1Var, this) == coroutine_suspended) {
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
