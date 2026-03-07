package com.gse.aulapp.viewmodel;

import com.gse.aulapp.model.repository.StepProcessSessionRepository;
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
@DebugMetadata(c = "com.gse.aulapp.viewmodel.PracticeClassViewModel$dialogCloseBeforeTime$1$2", f = "PracticeClassViewModel.kt", i = {}, l = {580}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class PracticeClassViewModel$dialogCloseBeforeTime$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $sessionID;
    final /* synthetic */ StepProcessSessionRepository $stepRepository;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PracticeClassViewModel$dialogCloseBeforeTime$1$2(StepProcessSessionRepository stepProcessSessionRepository, String str, Continuation continuation) {
        super(2, (Continuation<Object>) continuation);
        this.$stepRepository = stepProcessSessionRepository;
        this.$sessionID = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation<?> continuation) {
        return (Continuation<Unit>) (Object) new PracticeClassViewModel$dialogCloseBeforeTime$1$2(this.$stepRepository, this.$sessionID, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StepProcessSessionRepository stepProcessSessionRepository = this.$stepRepository;
            String str = this.$sessionID;
            this.label = 1;
            if (stepProcessSessionRepository.removeSessionBySessionID(str, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PracticeClassViewModel$dialogCloseBeforeTime$1$2) (Object) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
