package com.gse.aulapp.viewmodel;

import com.gse.aulapp.databinding.FragmentPracticeClassBinding;
import com.gse.aulapp.model.dto.SessionDto;
import com.gse.aulapp.model.repository.GpsRepository;
import com.gse.aulapp.util.DataClassUtil;
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
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.PracticeClassViewModel$updatePracticeInfo$1", f = "PracticeClassViewModel.kt", i = {0, 1}, l = {525, 527}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
/* loaded from: classes2.dex */
public final class PracticeClassViewModel$updatePracticeInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentPracticeClassBinding $binding;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PracticeClassViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PracticeClassViewModel$updatePracticeInfo$1(PracticeClassViewModel practiceClassViewModel, FragmentPracticeClassBinding fragmentPracticeClassBinding, Continuation continuation) {
        super(2, (Continuation<Object>) continuation);
        this.this$0 = practiceClassViewModel;
        this.$binding = fragmentPracticeClassBinding;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation<?> continuation) {
        PracticeClassViewModel$updatePracticeInfo$1 practiceClassViewModel$updatePracticeInfo$1 = new PracticeClassViewModel$updatePracticeInfo$1(this.this$0, this.$binding, (Continuation) continuation);
        practiceClassViewModel$updatePracticeInfo$1.L$0 = obj;
        return (Continuation<Unit>) (Object) practiceClassViewModel$updatePracticeInfo$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005c, code lost:
    
        if (r6.updateClassValues(r4, r5, r1, r7) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        kotlinx.coroutines.CoroutineScopeKt.cancel$default(r8, null, 1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0039, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(10000, r7) == r0) goto L20;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005c -> B:6:0x002f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        SessionDto sessionDto;
        GpsRepository gpsRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
        } else if (i == 1) {
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            coroutineScope = coroutineScope2;
            sessionDto = this.this$0.sessionReceived;
            String r1;
            if (sessionDto == null || (r1 = sessionDto.getId()) == null) {
                CoroutineScopeKt.cancel(coroutineScope, new kotlinx.coroutines.CancellationException("cancelled"));
            } else {
                FragmentPracticeClassBinding fragmentPracticeClassBinding = this.$binding;
                PracticeClassViewModel practiceClassViewModel = this.this$0;
                DataClassUtil.Companion companion = DataClassUtil.INSTANCE;
                gpsRepository = practiceClassViewModel.gpsRepository;
                this.L$0 = coroutineScope;
                this.label = 2;
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            coroutineScope = coroutineScope3;
        }
        this.L$0 = coroutineScope;
        this.label = 1;
        if (kotlinx.coroutines.DelayKt.delay(10000, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PracticeClassViewModel$updatePracticeInfo$1) (Object) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
