package com.gse.aulapp.viewmodel;

import com.gse.aulapp.databinding.DialogExamInfoLayoutBinding;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.ClassInCourseViewModel$setDataSessionDetailToDialog$2", f = "ClassInCourseViewModel.kt", i = {}, l = {822}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class ClassInCourseViewModel$setDataSessionDetailToDialog$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DialogExamInfoLayoutBinding $binding;
    int label;
    final /* synthetic */ ClassInCourseViewModel this$0;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.gse.aulapp.viewmodel.ClassInCourseViewModel$setDataSessionDetailToDialog$2$1", f = "ClassInCourseViewModel.kt", i = {}, l = {824}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.gse.aulapp.viewmodel.ClassInCourseViewModel$setDataSessionDetailToDialog$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DialogExamInfoLayoutBinding $binding;
        int label;
        final /* synthetic */ ClassInCourseViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ClassInCourseViewModel classInCourseViewModel, DialogExamInfoLayoutBinding dialogExamInfoLayoutBinding, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = classInCourseViewModel;
            this.$binding = dialogExamInfoLayoutBinding;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$binding, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SessionDto sessionReceived = this.this$0.getSessionReceived();
                String id = sessionReceived != null ? sessionReceived.getId() : null;
                if (id != null && id.length() != 0) {
                    DataClassUtil.Companion companion = DataClassUtil.INSTANCE;
                    DialogExamInfoLayoutBinding dialogExamInfoLayoutBinding = this.$binding;
                    GpsRepository gpsRepository = this.this$0.getGpsRepository();
                    SessionDto sessionReceived2 = this.this$0.getSessionReceived();
                    Intrinsics.checkNotNull(sessionReceived2);
                    String id2 = sessionReceived2.getId();
                    this.label = 1;
                    if (companion.updateClassValues(dialogExamInfoLayoutBinding, gpsRepository, id2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassInCourseViewModel$setDataSessionDetailToDialog$2(ClassInCourseViewModel classInCourseViewModel, DialogExamInfoLayoutBinding dialogExamInfoLayoutBinding, Continuation<? super ClassInCourseViewModel$setDataSessionDetailToDialog$2> continuation) {
        super(2, continuation);
        this.this$0 = classInCourseViewModel;
        this.$binding = dialogExamInfoLayoutBinding;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ClassInCourseViewModel$setDataSessionDetailToDialog$2(this.this$0, this.$binding, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$binding, null);
            this.label = 1;
            if (BuildersKt.withContext(main, anonymousClass1, this) == coroutine_suspended) {
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
        return ((ClassInCourseViewModel$setDataSessionDetailToDialog$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
