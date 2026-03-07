package com.gse.aulapp.viewmodel;

import com.gse.aulapp.model.dto.ConfigurationSessionDto;
import com.gse.aulapp.model.enumerate.EnumTypeConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/gse/aulapp/model/dto/ConfigurationSessionDto;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel$getConfigSessionDto$1$config$1", f = "ClassPracticeBeforeViewModel.kt", i = {}, l = {1049}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class ClassPracticeBeforeViewModel$getConfigSessionDto$1$config$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ConfigurationSessionDto>, Object> {
    final /* synthetic */ EnumTypeConfiguration $type;
    int label;
    final /* synthetic */ ClassPracticeBeforeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassPracticeBeforeViewModel$getConfigSessionDto$1$config$1(ClassPracticeBeforeViewModel classPracticeBeforeViewModel, EnumTypeConfiguration enumTypeConfiguration, Continuation continuation) {
        super(2, continuation);
        this.this$0 = classPracticeBeforeViewModel;
        this.$type = enumTypeConfiguration;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation<?> continuation) {
        return new ClassPracticeBeforeViewModel$getConfigSessionDto$1$config$1(this.this$0, this.$type, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object configurationSession;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        ClassPracticeBeforeViewModel classPracticeBeforeViewModel = this.this$0;
        EnumTypeConfiguration enumTypeConfiguration = this.$type;
        this.label = 1;
        configurationSession = classPracticeBeforeViewModel.getConfigurationSession(enumTypeConfiguration, this);
        return configurationSession == coroutine_suspended ? coroutine_suspended : configurationSession;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ClassPracticeBeforeViewModel$getConfigSessionDto$1$config$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
