package com.gse.aulapp.viewmodel;

import com.gse.aulapp.model.dto.ConfigurationSessionDto;
import com.gse.aulapp.model.enumerate.EnumTypeConfiguration;
import com.gse.aulapp.util.SingleLiveEvent;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel$getConfigSessionDto$1", f = "ClassPracticeBeforeViewModel.kt", i = {}, l = {1048}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class ClassPracticeBeforeViewModel$getConfigSessionDto$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ EnumTypeConfiguration $type;
    int label;
    final /* synthetic */ ClassPracticeBeforeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassPracticeBeforeViewModel$getConfigSessionDto$1(ClassPracticeBeforeViewModel classPracticeBeforeViewModel, EnumTypeConfiguration enumTypeConfiguration, Continuation continuation) {
        super(2, continuation);
        this.this$0 = classPracticeBeforeViewModel;
        this.$type = enumTypeConfiguration;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation<?> continuation) {
        return new ClassPracticeBeforeViewModel$getConfigSessionDto$1(this.this$0, this.$type, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SingleLiveEvent singleLiveEvent;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            ClassPracticeBeforeViewModel$getConfigSessionDto$1$config$1 classPracticeBeforeViewModel$getConfigSessionDto$1$config$1 = new ClassPracticeBeforeViewModel$getConfigSessionDto$1$config$1(this.this$0, this.$type, null);
            this.label = 1;
            obj = BuildersKt.withContext(io2, classPracticeBeforeViewModel$getConfigSessionDto$1$config$1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        singleLiveEvent = this.this$0._configSession;
        singleLiveEvent.postValue((ConfigurationSessionDto) obj);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ClassPracticeBeforeViewModel$getConfigSessionDto$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
