package com.gse.aulapp.viewmodel;

import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.dto.SessionDto;
import com.gse.aulapp.model.enumerate.EnumIdStepperMenu;
import com.gse.aulapp.model.enumerate.EnumStatusStepSession;
import com.gse.aulapp.model.repository.StepProcessSessionRepository;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableSharedFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel$saveStepStatus$1", f = "ClassPracticeBeforeViewModel.kt", i = {}, l = {619, 620, 633}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class ClassPracticeBeforeViewModel$saveStepStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ EnumIdStepperMenu $enumIdStepperMenu;
    final /* synthetic */ boolean $isEntry;
    int label;
    final /* synthetic */ ClassPracticeBeforeViewModel this$0;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel$saveStepStatus$1$1", f = "ClassPracticeBeforeViewModel.kt", i = {}, l = {622, 629}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel$saveStepStatus$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ EnumIdStepperMenu $enumIdStepperMenu;
        final /* synthetic */ boolean $isEntry;
        int label;
        final /* synthetic */ ClassPracticeBeforeViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ClassPracticeBeforeViewModel classPracticeBeforeViewModel, EnumIdStepperMenu enumIdStepperMenu, boolean z, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = classPracticeBeforeViewModel;
            this.$enumIdStepperMenu = enumIdStepperMenu;
            this.$isEntry = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$enumIdStepperMenu, this.$isEntry, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
        
            if (r11.emit(r1, r10) == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
        
            if (r4.saveUpdateStepProcessSession(r5, r6, r7, r8, r9) == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            SessionDto sessionDto;
            StepProcessSessionRepository stepProcessSessionRepository;
            SessionDto sessionDto2;
            AnonymousClass1 anonymousClass1;
            MutableSharedFlow mutableSharedFlow;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                sessionDto = this.this$0.sessionReceived;
                if (sessionDto != null) {
                    stepProcessSessionRepository = this.this$0.stepRepository;
                    sessionDto2 = this.this$0.sessionReceived;
                    Intrinsics.checkNotNull(sessionDto2);
                    String id = sessionDto2.getId();
                    EnumIdStepperMenu enumIdStepperMenu = this.$enumIdStepperMenu;
                    EnumStatusStepSession enumStatusStepSession = EnumStatusStepSession.FINISH;
                    boolean z = this.$isEntry;
                    this.label = 1;
                    anonymousClass1 = this;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            anonymousClass1 = this;
            mutableSharedFlow = anonymousClass1.this$0._message;
            Status.Success success = new Status.Success(Boxing.boxBoolean(true));
            anonymousClass1.label = 2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassPracticeBeforeViewModel$saveStepStatus$1(ClassPracticeBeforeViewModel classPracticeBeforeViewModel, EnumIdStepperMenu enumIdStepperMenu, boolean z, Continuation<? super ClassPracticeBeforeViewModel$saveStepStatus$1> continuation) {
        super(2, continuation);
        this.this$0 = classPracticeBeforeViewModel;
        this.$enumIdStepperMenu = enumIdStepperMenu;
        this.$isEntry = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ClassPracticeBeforeViewModel$saveStepStatus$1(this.this$0, this.$enumIdStepperMenu, this.$isEntry, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r9, r1, r8) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        if (r1.emit(r3, r8) != r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow mutableSharedFlow;
        MutableSharedFlow mutableSharedFlow2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Exception e) {
            mutableSharedFlow = this.this$0._message;
            Status.Failure failure = new Status.Failure(new Exception(e.getMessage()));
            this.label = 3;
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mutableSharedFlow2 = this.this$0._message;
            Status.Success success = new Status.Success(Boxing.boxBoolean(false));
            this.label = 1;
            if (mutableSharedFlow2.emit(success, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        CoroutineDispatcher io2 = Dispatchers.getIO();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$enumIdStepperMenu, this.$isEntry, null);
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ClassPracticeBeforeViewModel$saveStepStatus$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
