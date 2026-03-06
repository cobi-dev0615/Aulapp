package co.ceduladigital.sdk;

import com.gse.aulapp.view.fragment.ClassInCourseFragment;
import com.gse.aulapp.viewmodel.ClassInCourseViewModel;
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
public final class w0 extends SuspendLambda implements Function2<Object, Object, Object> {
    public int a;
    public final /* synthetic */ ClassInCourseFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(ClassInCourseFragment classInCourseFragment, Continuation continuation) {
        super(2, continuation);
        this.b = classInCourseFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new w0(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ClassInCourseFragment classInCourseFragment = this.b;
            ClassInCourseViewModel classInCourseViewModel = classInCourseFragment.b;
            if (classInCourseViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                classInCourseViewModel = null;
            }
            StateFlow<Boolean> isMinimumClassTime = classInCourseViewModel.isMinimumClassTime();
            r0 r0Var = new r0(classInCourseFragment, 1);
            this.a = 1;
            if (isMinimumClassTime.collect(r0Var, this) == coroutine_suspended) {
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
