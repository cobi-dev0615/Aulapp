package com.gse.aulapp.viewmodel;

import android.app.Activity;
import com.gse.aulapp.model.data.statusControl.ApiResult;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.enumerate.EnumApiStatus;
import com.gse.aulapp.model.repository.BiometrixRepository;
import com.gse.aulapp.model.request.BiometrixRequest;
import com.gse.aulapp.model.response.BiometrixUrlActionResponse;
import com.gse.aulapp.model.response.ErrorResponse;
import com.gse.aulapp.util.LogSendUtil;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel$initBiometrix$1", f = "ClassPracticeBeforeViewModel.kt", i = {}, l = {1210, 1229}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class ClassPracticeBeforeViewModel$initBiometrix$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ BiometrixRequest $request;
    int label;
    final /* synthetic */ ClassPracticeBeforeViewModel this$0;

    @Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u00022\u0015\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tH\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/gse/aulapp/model/data/statusControl/ApiResult;", "Lcom/gse/aulapp/model/response/BiometrixUrlActionResponse;", "e", BuildConfig.FLAVOR, "Lkotlin/ParameterName;", "name", "cause"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel$initBiometrix$1$1", f = "ClassPracticeBeforeViewModel.kt", i = {0}, l = {1227, 1228}, m = "invokeSuspend", n = {"e"}, s = {"L$0"})
    /* renamed from: com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel$initBiometrix$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function3<FlowCollector<? super ApiResult<? extends BiometrixUrlActionResponse>>, Throwable, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $activity;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ClassPracticeBeforeViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @SuppressWarnings("unchecked")
        public AnonymousClass1(Activity activity, ClassPracticeBeforeViewModel classPracticeBeforeViewModel, Continuation<?> continuation) {
            super(3, (Continuation<Object>) continuation);
            this.$activity = activity;
            this.this$0 = classPracticeBeforeViewModel;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super ApiResult<? extends BiometrixUrlActionResponse>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super ApiResult<BiometrixUrlActionResponse>>) flowCollector, th, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x006c, code lost:
        
            if (r8.emit(r3, r7) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x006e, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
        
            if (r8.emit(r4, r7) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Throwable th;
            MutableSharedFlow mutableSharedFlow;
            MutableSharedFlow mutableSharedFlow2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                th = (Throwable) this.L$0;
                LogSendUtil.INSTANCE.setLog(this.$activity, "endPointGetUrlBiometrixException :" + th, "endPointGetUrlBiometrix", true);
                mutableSharedFlow = this.this$0._messageBiometrix;
                Status.Loading loading = new Status.Loading(false);
                this.L$0 = th;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                th = (Throwable) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            mutableSharedFlow2 = this.this$0._messageBiometrix;
            Status.Failure failure = new Status.Failure(th);
            this.L$0 = null;
            this.label = 2;
            if (mutableSharedFlow2.emit(failure, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super ApiResult<BiometrixUrlActionResponse>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$activity, this.this$0, continuation);
            anonymousClass1.L$0 = th;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassPracticeBeforeViewModel$initBiometrix$1(ClassPracticeBeforeViewModel classPracticeBeforeViewModel, Activity activity, BiometrixRequest biometrixRequest, Continuation continuation) {
        super(2, continuation);
        this.this$0 = classPracticeBeforeViewModel;
        this.$activity = activity;
        this.$request = biometrixRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation<?> continuation) {
        return new ClassPracticeBeforeViewModel$initBiometrix$1(this.this$0, this.$activity, this.$request, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x007e, code lost:
    
        if (r12.collect(r1, r11) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0080, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r12.emit(r1, r11) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow mutableSharedFlow;
        BiometrixRepository biometrixRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mutableSharedFlow = this.this$0._messageBiometrix;
            Status.Loading loading = new Status.Loading(false, 1, null);
            this.label = 1;
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
        LogSendUtil.INSTANCE.setLog(this.$activity, "request: BiometrixRequest: " + this.$request, "endPointGetUrl", false);
        biometrixRepository = this.this$0.biometrixRepository;
        Flow m1541catch = biometrixRepository.getUrlBiometrix(this.$activity, this.$request);
        final Activity activity = this.$activity;
        final ClassPracticeBeforeViewModel classPracticeBeforeViewModel = this.this$0;
        FlowCollector flowCollector = new FlowCollector() { // from class: com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel$initBiometrix$1.2
            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit((ApiResult<BiometrixUrlActionResponse>) obj2, (Continuation<? super Unit>) continuation);
            }

            public final Object emit(ApiResult<BiometrixUrlActionResponse> apiResult, Continuation continuation) {
                MutableSharedFlow mutableSharedFlow2;
                String str;
                MutableSharedFlow mutableSharedFlow3;
                BiometrixUrlActionResponse.Result result;
                BiometrixUrlActionResponse.Result result2;
                MutableSharedFlow mutableSharedFlow4;
                BiometrixUrlActionResponse.Result result3;
                BiometrixUrlActionResponse.Result result4;
                if (apiResult.getStatus() != EnumApiStatus.SUCCESS) {
                    if (apiResult.getStatus() != EnumApiStatus.ERROR) {
                        return Unit.INSTANCE;
                    }
                    LogSendUtil.Companion companion = LogSendUtil.INSTANCE;
                    Activity activity2 = activity;
                    BiometrixUrlActionResponse data = apiResult.getData();
                    BiometrixUrlActionResponse.Result result5 = data != null ? data.getResult() : null;
                    BiometrixUrlActionResponse data2 = apiResult.getData();
                    companion.setLog(activity2, "endPointGetUrlRegister error :" + result5 + ", url: " + (data2 != null ? data2.getUrl() : null), null, false);
                    mutableSharedFlow2 = classPracticeBeforeViewModel._messageBiometrix;
                    Object emit = mutableSharedFlow2.emit(new Status.Exception(String.valueOf(apiResult.getMessage())), continuation);
                    return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
                }
                BiometrixUrlActionResponse data3 = apiResult.getData();
                if (data3 == null || (result4 = data3.getResult()) == null || (str = result4.getRedirectUrl()) == null) {
                    str = BuildConfig.FLAVOR;
                }
                LogSendUtil.Companion companion2 = LogSendUtil.INSTANCE;
                Activity activity3 = activity;
                BiometrixUrlActionResponse data4 = apiResult.getData();
                BiometrixUrlActionResponse.Result result6 = data4 != null ? data4.getResult() : null;
                BiometrixUrlActionResponse data5 = apiResult.getData();
                companion2.setLog(activity3, "endPointGetUrlRegister success :" + result6 + ", url: " + (data5 != null ? data5.getUrl() : null), null, false);
                BiometrixUrlActionResponse data6 = apiResult.getData();
                if ((data6 == null || (result3 = data6.getResult()) == null) ? false : Intrinsics.areEqual(result3.getSuccess(), Boxing.boxBoolean(true))) {
                    mutableSharedFlow4 = classPracticeBeforeViewModel._messageBiometrix;
                    Object emit2 = mutableSharedFlow4.emit(new Status.Success(str), continuation);
                    return emit2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit2 : Unit.INSTANCE;
                }
                ClassPracticeBeforeViewModel classPracticeBeforeViewModel2 = classPracticeBeforeViewModel;
                BiometrixUrlActionResponse data7 = apiResult.getData();
                String message = (data7 == null || (result2 = data7.getResult()) == null) ? null : result2.getMessage();
                String code = null;
                BiometrixUrlActionResponse data8 = apiResult.getData();
                if (data8 != null && (result = data8.getResult()) != null) {
                    code = result.getCode();
                }
                ErrorResponse errorEndpoint = classPracticeBeforeViewModel2.getErrorEndpoint(message, code);
                mutableSharedFlow3 = classPracticeBeforeViewModel._messageBiometrix;
                Object emit3 = mutableSharedFlow3.emit(new Status.Exception(errorEndpoint), continuation);
                return emit3 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit3 : Unit.INSTANCE;
            }
        };
        this.label = 2;
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ClassPracticeBeforeViewModel$initBiometrix$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
