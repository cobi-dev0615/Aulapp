package com.gse.aulapp.feature.fingerPrint.util;

import androidx.fragment.app.FragmentActivity;
import com.gse.aulapp.feature.fingerPrint.domain.usecase.ValidationFingerPrintUseCase;
import com.gse.aulapp.model.data.DataFailure;
import com.gse.aulapp.model.enumerate.EnumHandsAulapp;
import com.gse.aulapp.util.Either;
import com.karumi.dexter.BuildConfig;
import defpackage.FingerPrintResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.feature.fingerPrint.util.ModuleFingerPrintUtil$Companion$moduleFingerPrintValidation$1", f = "ModuleFingerPrintUtil.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class ModuleFingerPrintUtil$Companion$moduleFingerPrintValidation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $fragmentActivity;
    final /* synthetic */ EnumHandsAulapp $hand;
    final /* synthetic */ Function1<DataFailure, Unit> $onErrorCallback;
    final /* synthetic */ Function1<FingerPrintResponse, Unit> $onSuccessCallback;
    final /* synthetic */ String $urlDocument;
    final /* synthetic */ String $userId;
    int label;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.gse.aulapp.feature.fingerPrint.util.ModuleFingerPrintUtil$Companion$moduleFingerPrintValidation$1$1", f = "ModuleFingerPrintUtil.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.gse.aulapp.feature.fingerPrint.util.ModuleFingerPrintUtil$Companion$moduleFingerPrintValidation$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FragmentActivity $fragmentActivity;
        final /* synthetic */ EnumHandsAulapp $hand;
        final /* synthetic */ Function1<DataFailure, Unit> $onErrorCallback;
        final /* synthetic */ Function1<FingerPrintResponse, Unit> $onSuccessCallback;
        final /* synthetic */ String $urlDocument;
        final /* synthetic */ String $userId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(FragmentActivity fragmentActivity, EnumHandsAulapp enumHandsAulapp, String str, String str2, Function1<? super DataFailure, Unit> function1, Function1<? super FingerPrintResponse, Unit> function12, Continuation<?> continuation) {
            super(2, (Continuation<Object>) continuation);
            this.$fragmentActivity = fragmentActivity;
            this.$hand = enumHandsAulapp;
            this.$userId = str;
            this.$urlDocument = str2;
            this.$onErrorCallback = (Function1) function1;
            this.$onSuccessCallback = (Function1) function12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return (Continuation<Unit>) (Object) new AnonymousClass1(this.$fragmentActivity, this.$hand, this.$userId, this.$urlDocument, this.$onErrorCallback, this.$onSuccessCallback, (Continuation) continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AnonymousClass1 anonymousClass1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ValidationFingerPrintUseCase.Companion companion = ValidationFingerPrintUseCase.INSTANCE;
                FragmentActivity fragmentActivity = this.$fragmentActivity;
                EnumHandsAulapp enumHandsAulapp = this.$hand;
                String str = this.$userId;
                String str2 = this.$urlDocument;
                this.label = 1;
                anonymousClass1 = this;
                obj = companion.validationFingerPrint(fragmentActivity, enumHandsAulapp, str, str2, anonymousClass1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                anonymousClass1 = this;
            }
            Either either = (Either) obj;
            if (either.isLeft()) {
                anonymousClass1.$onErrorCallback.invoke((DataFailure) either.leftValue());
            } else {
                anonymousClass1.$onSuccessCallback.invoke((FingerPrintResponse) either.rightValue());
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) (Object) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModuleFingerPrintUtil$Companion$moduleFingerPrintValidation$1(FragmentActivity fragmentActivity, EnumHandsAulapp enumHandsAulapp, String str, String str2, Function1<? super DataFailure, Unit> function1, Function1<? super FingerPrintResponse, Unit> function12, Continuation continuation) {
        super(2, (Continuation<Object>) continuation);
        this.$fragmentActivity = fragmentActivity;
        this.$hand = enumHandsAulapp;
        this.$userId = str;
        this.$urlDocument = str2;
        this.$onErrorCallback = (Function1) function1;
        this.$onSuccessCallback = (Function1) function12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return (Continuation<Unit>) (Object) new ModuleFingerPrintUtil$Companion$moduleFingerPrintValidation$1(this.$fragmentActivity, this.$hand, this.$userId, this.$urlDocument, this.$onErrorCallback, this.$onSuccessCallback, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$fragmentActivity, this.$hand, this.$userId, this.$urlDocument, this.$onErrorCallback, this.$onSuccessCallback, null);
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
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ModuleFingerPrintUtil$Companion$moduleFingerPrintValidation$1) (Object) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
