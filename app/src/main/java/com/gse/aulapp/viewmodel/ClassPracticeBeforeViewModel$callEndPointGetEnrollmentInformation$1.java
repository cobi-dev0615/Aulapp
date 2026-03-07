package com.gse.aulapp.viewmodel;

import android.app.Activity;
import com.gse.aulapp.model.data.statusControl.ApiResult;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.enumerate.EnumApiStatus;
import com.gse.aulapp.model.repository.GetEnrollmentInformationRepository;
import com.gse.aulapp.model.request.GetEnrollmentInformationRequest;
import com.gse.aulapp.model.response.ErrorResponse;
import com.gse.aulapp.model.response.GetEnrollmentInformationResponse;
import com.gse.aulapp.receptions.feature.core.model.dto.UserInfoDto;
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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel$callEndPointGetEnrollmentInformation$1", f = "ClassPracticeBeforeViewModel.kt", i = {}, l = {1156, 1170}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class ClassPracticeBeforeViewModel$callEndPointGetEnrollmentInformation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ GetEnrollmentInformationRequest $getEnrollmentInformationRequest;
    final /* synthetic */ UserInfoDto $userInfo;
    int label;
    final /* synthetic */ ClassPracticeBeforeViewModel this$0;

    @Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u00022\u0015\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tH\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/gse/aulapp/model/data/statusControl/ApiResult;", "Lcom/gse/aulapp/model/response/GetEnrollmentInformationResponse;", "e", BuildConfig.FLAVOR, "Lkotlin/ParameterName;", "name", "cause"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel$callEndPointGetEnrollmentInformation$1$1", f = "ClassPracticeBeforeViewModel.kt", i = {}, l = {1169}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel$callEndPointGetEnrollmentInformation$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function3<FlowCollector<? super ApiResult<? extends GetEnrollmentInformationResponse>>, Throwable, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $activity;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ClassPracticeBeforeViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Activity activity, ClassPracticeBeforeViewModel classPracticeBeforeViewModel, Continuation<?> continuation) {
            super(3, continuation);
            this.$activity = activity;
            this.this$0 = classPracticeBeforeViewModel;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super ApiResult<? extends GetEnrollmentInformationResponse>> flowCollector, Throwable th, Continuation continuation) {
            return invoke2((FlowCollector<? super ApiResult<GetEnrollmentInformationResponse>>) flowCollector, th, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableSharedFlow mutableSharedFlow;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Throwable th = (Throwable) this.L$0;
                LogSendUtil.INSTANCE.setLog(this.$activity, "endPointGetEnrollmentInformation catch: " + th, null, false);
                mutableSharedFlow = this.this$0._message;
                Status.Failure failure = new Status.Failure(th);
                this.label = 1;
                if (mutableSharedFlow.emit(failure, this) == coroutine_suspended) {
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

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super ApiResult<GetEnrollmentInformationResponse>> flowCollector, Throwable th, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$activity, this.this$0, continuation);
            anonymousClass1.L$0 = th;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassPracticeBeforeViewModel$callEndPointGetEnrollmentInformation$1(ClassPracticeBeforeViewModel classPracticeBeforeViewModel, Activity activity, GetEnrollmentInformationRequest getEnrollmentInformationRequest, UserInfoDto userInfoDto, Continuation continuation) {
        super(2, continuation);
        this.this$0 = classPracticeBeforeViewModel;
        this.$activity = activity;
        this.$getEnrollmentInformationRequest = getEnrollmentInformationRequest;
        this.$userInfo = userInfoDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ClassPracticeBeforeViewModel$callEndPointGetEnrollmentInformation$1(this.this$0, this.$activity, this.$getEnrollmentInformationRequest, this.$userInfo, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x007e, code lost:
    
        if (r11.collect(r1, r10) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0080, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r11.emit(r1, r10) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow mutableSharedFlow;
        GetEnrollmentInformationRepository getEnrollmentInformationRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mutableSharedFlow = this.this$0._message;
            Status.Loading loading = new Status.Loading(true);
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
        LogSendUtil.INSTANCE.setLog(this.$activity, "endPointGetEnrollmentInformation Request: " + this.$getEnrollmentInformationRequest, null, false);
        getEnrollmentInformationRepository = this.this$0.enrollmentInformationRepository;
        Flow m1541catch = FlowKt.m1541catch(getEnrollmentInformationRepository.getGetEnrollmentInformation(this.$activity, this.$getEnrollmentInformationRequest), new AnonymousClass1(this.$activity, this.this$0, null));
        final Activity activity = this.$activity;
        final UserInfoDto userInfoDto = this.$userInfo;
        final ClassPracticeBeforeViewModel classPracticeBeforeViewModel = this.this$0;
        FlowCollector flowCollector = new FlowCollector() { // from class: com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel$callEndPointGetEnrollmentInformation$1.2

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel$callEndPointGetEnrollmentInformation$1$2$1", f = "ClassPracticeBeforeViewModel.kt", i = {}, l = {1185, 1191, 1194, 1201}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel$callEndPointGetEnrollmentInformation$1$2$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Activity $activity;
                final /* synthetic */ ApiResult<GetEnrollmentInformationResponse> $apiResponse;
                final /* synthetic */ UserInfoDto $userInfo;
                int label;
                final /* synthetic */ ClassPracticeBeforeViewModel this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(ApiResult<GetEnrollmentInformationResponse> apiResult, Activity activity, UserInfoDto userInfoDto, ClassPracticeBeforeViewModel classPracticeBeforeViewModel, Continuation<?> continuation) {
                    super(2, continuation);
                    this.$apiResponse = apiResult;
                    this.$activity = activity;
                    this.$userInfo = userInfoDto;
                    this.this$0 = classPracticeBeforeViewModel;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$apiResponse, this.$activity, this.$userInfo, this.this$0, continuation);
                }

                /* JADX WARN: Code restructure failed: missing block: B:38:0x00ef, code lost:
                
                    if (r2.emit(r3, r17) == r1) goto L70;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:39:0x01b1, code lost:
                
                    return r1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:51:0x0134, code lost:
                
                    if (r3.emit(r4, r17) == r1) goto L70;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:56:0x0153, code lost:
                
                    if (r2.emit(r3, r17) == r1) goto L70;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:67:0x01af, code lost:
                
                    if (r2.emit(r4, r17) == r1) goto L70;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    MutableSharedFlow mutableSharedFlow;
                    MutableSharedFlow mutableSharedFlow2;
                    MutableSharedFlow mutableSharedFlow3;
                    GetEnrollmentInformationResponse.Result result;
                    GetEnrollmentInformationResponse.Result result2;
                    MutableSharedFlow mutableSharedFlow4;
                    Boolean fullEnrollment;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        if (this.$apiResponse.getStatus() == EnumApiStatus.SUCCESS) {
                            LogSendUtil.Companion companion = LogSendUtil.INSTANCE;
                            Activity activity = this.$activity;
                            GetEnrollmentInformationResponse data = this.$apiResponse.getData();
                            GetEnrollmentInformationResponse.Result result3 = data != null ? data.getResult() : null;
                            GetEnrollmentInformationResponse data2 = this.$apiResponse.getData();
                            companion.setLog(activity, "endPointGetEnrollmentInformation succes: " + result3 + ", url: " + (data2 != null ? data2.getUrl() : null), null, false);
                            GetEnrollmentInformationResponse data3 = this.$apiResponse.getData();
                            if ((data3 != null ? data3.getResult() : null) != null) {
                                UserInfoDto userInfoDto = this.$userInfo;
                                GetEnrollmentInformationResponse.Result result4 = this.$apiResponse.getData().getResult();
                                userInfoDto.setFullEnrolment((result4 == null || (fullEnrollment = result4.getFullEnrollment()) == null) ? false : fullEnrollment.booleanValue());
                                UserInfoDto userInfoDto2 = this.$userInfo;
                                GetEnrollmentInformationResponse.Result result5 = this.$apiResponse.getData().getResult();
                                userInfoDto2.setFourFingersIdentyID(result5 != null ? result5.getFourFingersIdentyID() : null);
                                GetEnrollmentInformationResponse.Result result6 = this.$apiResponse.getData().getResult();
                                if (result6 != null ? Intrinsics.areEqual(result6.getSuccess(), Boxing.boxBoolean(true)) : false) {
                                    mutableSharedFlow4 = this.this$0._messageGetEnrollmentInformation;
                                    Status.Success success = new Status.Success(this.$userInfo);
                                    this.label = 1;
                                } else {
                                    ClassPracticeBeforeViewModel classPracticeBeforeViewModel = this.this$0;
                                    GetEnrollmentInformationResponse data4 = this.$apiResponse.getData();
                                    String message = (data4 == null || (result2 = data4.getResult()) == null) ? null : result2.getMessage();
                                    GetEnrollmentInformationResponse data5 = this.$apiResponse.getData();
                                    if (data5 != null && (result = data5.getResult()) != null) {
                                        r9 = result.getCode();
                                    }
                                    ErrorResponse errorEndpoint = classPracticeBeforeViewModel.getErrorEndpoint(message, r9);
                                    mutableSharedFlow3 = this.this$0._messageGetEnrollmentInformation;
                                    Status.Exception exception = new Status.Exception(errorEndpoint);
                                    this.label = 2;
                                }
                            } else {
                                mutableSharedFlow2 = this.this$0._messageGetEnrollmentInformation;
                                Status.Exception exception2 = new Status.Exception(String.valueOf(this.$apiResponse.getMessage()));
                                this.label = 3;
                            }
                        } else {
                            LogSendUtil.Companion companion2 = LogSendUtil.INSTANCE;
                            Activity activity2 = this.$activity;
                            GetEnrollmentInformationResponse data6 = this.$apiResponse.getData();
                            GetEnrollmentInformationResponse.Result result7 = data6 != null ? data6.getResult() : null;
                            GetEnrollmentInformationResponse data7 = this.$apiResponse.getData();
                            companion2.setLog(activity2, "endPointGetEnrollmentInformation result: " + result7 + ", url: " + (data7 != null ? data7.getUrl() : null), null, false);
                            mutableSharedFlow = this.this$0._messageGetEnrollmentInformation;
                            Status.Exception exception3 = new Status.Exception(String.valueOf(this.$apiResponse.getMessage()));
                            this.label = 4;
                        }
                    } else {
                        if (i != 1 && i != 2 && i != 3 && i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit((ApiResult<GetEnrollmentInformationResponse>) obj2, (Continuation<? super Unit>) continuation);
            }

            public final Object emit(ApiResult<GetEnrollmentInformationResponse> apiResult, Continuation continuation) {
                Object withContext = BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(apiResult, activity, userInfoDto, classPracticeBeforeViewModel, null), continuation);
                return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
            }
        };
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ClassPracticeBeforeViewModel$callEndPointGetEnrollmentInformation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
