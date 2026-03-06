package com.gse.aulapp.util;

import com.gse.aulapp.model.repository.SessionRepository;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.util.ControllerFinishClassOrExamUtil$Companion$updateDateEndClass$1", f = "ControllerFinishClassOrExamUtil.kt", i = {}, l = {305}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class ControllerFinishClassOrExamUtil$Companion$updateDateEndClass$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $sessionID;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControllerFinishClassOrExamUtil$Companion$updateDateEndClass$1(String str, Continuation<? super ControllerFinishClassOrExamUtil$Companion$updateDateEndClass$1> continuation) {
        super(2, (Continuation<Object>) continuation);
        this.$sessionID = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return (Continuation<Unit>) (Object) new ControllerFinishClassOrExamUtil$Companion$updateDateEndClass$1(this.$sessionID, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SessionRepository sessionRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Long dateLong = DateUtil.INSTANCE.getDateLong();
                if (dateLong != null) {
                    String str = this.$sessionID;
                    long longValue = dateLong.longValue();
                    sessionRepository = ControllerFinishClassOrExamUtil.sessionRepository;
                    if (sessionRepository == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("sessionRepository");
                        sessionRepository = null;
                    }
                    this.label = 1;
                    if (sessionRepository.updateDateEndClass(longValue, str, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e) {
            String unused = ControllerFinishClassOrExamUtil.TAG;
            e.getMessage();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ControllerFinishClassOrExamUtil$Companion$updateDateEndClass$1) (Object) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
