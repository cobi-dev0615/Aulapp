package com.gse.aulapp.viewmodel;

import com.gse.aulapp.model.repository.SessionRepository;
import com.gse.aulapp.util.DateUtil;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.ClassInCourseViewModel$updateDateEndClass$1", f = "ClassInCourseViewModel.kt", i = {}, l = {1251}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class ClassInCourseViewModel$updateDateEndClass$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $sessionID;
    int label;
    final /* synthetic */ ClassInCourseViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassInCourseViewModel$updateDateEndClass$1(ClassInCourseViewModel classInCourseViewModel, String str, Continuation continuation) {
        super(2, (Continuation<Object>) continuation);
        this.this$0 = classInCourseViewModel;
        this.$sessionID = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return (Continuation<Unit>) (Object) new ClassInCourseViewModel$updateDateEndClass$1(this.this$0, this.$sessionID, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SessionRepository sessionRepository;
        String unused;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Exception e) {
            unused = this.this$0.TAG;
            e.getMessage();
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Long dateLong = DateUtil.INSTANCE.getDateLong();
            if (dateLong != null) {
                ClassInCourseViewModel classInCourseViewModel = this.this$0;
                String str = this.$sessionID;
                long longValue = dateLong.longValue();
                sessionRepository = classInCourseViewModel.sessionRepository;
                this.label = 1;
                if (sessionRepository.updateDateEndClass(longValue, str, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ClassInCourseViewModel$updateDateEndClass$1) (Object) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
