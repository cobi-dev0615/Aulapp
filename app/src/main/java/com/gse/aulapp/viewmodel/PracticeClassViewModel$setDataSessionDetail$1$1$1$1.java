package com.gse.aulapp.viewmodel;

import com.gse.aulapp.databinding.LayoutPracticeClassCardBinding;
import com.gse.aulapp.model.enumerate.EnumClassType;
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
@DebugMetadata(c = "com.gse.aulapp.viewmodel.PracticeClassViewModel$setDataSessionDetail$1$1$1$1", f = "PracticeClassViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class PracticeClassViewModel$setDataSessionDetail$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ EnumClassType $eClassType;
    final /* synthetic */ LayoutPracticeClassCardBinding $this_run;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PracticeClassViewModel$setDataSessionDetail$1$1$1$1(LayoutPracticeClassCardBinding layoutPracticeClassCardBinding, EnumClassType enumClassType, Continuation<? super PracticeClassViewModel$setDataSessionDetail$1$1$1$1> continuation) {
        super(2, (Continuation<Object>) continuation);
        this.$this_run = layoutPracticeClassCardBinding;
        this.$eClassType = enumClassType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return (Continuation<Unit>) (Object) new PracticeClassViewModel$setDataSessionDetail$1$1$1$1(this.$this_run, this.$eClassType, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$this_run.ivPracticeClassIconCard.setImageResource(this.$eClassType.resource());
        this.$this_run.tvPracticeClassTitleClassCard.setText(EnumClassType.nameShow$default(this.$eClassType, null, 1, null));
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PracticeClassViewModel$setDataSessionDetail$1$1$1$1) (Object) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
