package com.gse.aulapp.viewmodel;

import android.content.Context;
import co.ceduladigital.sdk.q;
import com.gse.aulapp.R;
import com.gse.aulapp.model.data.statusControl.ApiResult;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.enumerate.EnumApiStatus;
import com.gse.aulapp.model.enumerate.EnumStatusAppointment;
import com.gse.aulapp.model.repository.SessionRepository;
import com.gse.aulapp.model.response.ErrorResponse;
import com.gse.aulapp.model.response.HistoricRecordPermissionsChangeResponse;
import com.gse.aulapp.util.LogSendUtil;
import com.gse.aulapp.util.SingleLiveEvent;
import com.gse.aulapp.util.UtilString;
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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel$updateSessionStatusAppointment$1", f = "ClassPracticeBeforeViewModel.kt", i = {}, l = {1070}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class ClassPracticeBeforeViewModel$updateSessionStatusAppointment$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $data;
    final /* synthetic */ String $sessionID;
    int label;
    final /* synthetic */ ClassPracticeBeforeViewModel this$0;

    @Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u00022\u0015\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tH\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/gse/aulapp/model/data/statusControl/ApiResult;", "Lcom/gse/aulapp/model/response/HistoricRecordPermissionsChangeResponse;", "e", BuildConfig.FLAVOR, "Lkotlin/ParameterName;", "name", "cause"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel$updateSessionStatusAppointment$1$1", f = "ClassPracticeBeforeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel$updateSessionStatusAppointment$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function3<FlowCollector<? super ApiResult<? extends HistoricRecordPermissionsChangeResponse>>, Throwable, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ClassPracticeBeforeViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, ClassPracticeBeforeViewModel classPracticeBeforeViewModel, Continuation<?> continuation) {
            super(3, continuation);
            this.$context = context;
            this.this$0 = classPracticeBeforeViewModel;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super ApiResult<? extends HistoricRecordPermissionsChangeResponse>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super ApiResult<HistoricRecordPermissionsChangeResponse>>) flowCollector, th, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SingleLiveEvent singleLiveEvent;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Throwable th = (Throwable) this.L$0;
            LogSendUtil.INSTANCE.setLog(this.$context, q.i("updateSessionStatusAppointment exception: ", th.getMessage()), "updateSessionStatusAppointment", true);
            singleLiveEvent = this.this$0._statusClass;
            singleLiveEvent.postValue(new Status.Failure(th));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super ApiResult<HistoricRecordPermissionsChangeResponse>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, this.this$0, continuation);
            anonymousClass1.L$0 = th;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassPracticeBeforeViewModel$updateSessionStatusAppointment$1(ClassPracticeBeforeViewModel classPracticeBeforeViewModel, Context context, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = classPracticeBeforeViewModel;
        this.$context = context;
        this.$sessionID = str;
        this.$data = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ClassPracticeBeforeViewModel$updateSessionStatusAppointment$1(this.this$0, this.$context, this.$sessionID, this.$data, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SessionRepository sessionRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            sessionRepository = this.this$0.repository;
            Flow m1541catch = FlowKt.m1541catch(sessionRepository.sendSessionStatusAppointment(this.$context, this.$sessionID, EnumStatusAppointment.UNDER_DEVELOPMENT), new AnonymousClass1(this.$context, this.this$0, null));
            final Context context = this.$context;
            final ClassPracticeBeforeViewModel classPracticeBeforeViewModel = this.this$0;
            final String str = this.$data;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel$updateSessionStatusAppointment$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation<? super Unit> continuation) {
                    return emit((ApiResult<HistoricRecordPermissionsChangeResponse>) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(ApiResult<HistoricRecordPermissionsChangeResponse> apiResult, Continuation<? super Unit> continuation) {
                    SingleLiveEvent singleLiveEvent;
                    SingleLiveEvent singleLiveEvent2;
                    SingleLiveEvent singleLiveEvent3;
                    HistoricRecordPermissionsChangeResponse.Result result;
                    HistoricRecordPermissionsChangeResponse.Result result2;
                    SingleLiveEvent singleLiveEvent4;
                    HistoricRecordPermissionsChangeResponse.Result result3;
                    LogSendUtil.Companion companion = LogSendUtil.INSTANCE;
                    Context context2 = context;
                    HistoricRecordPermissionsChangeResponse data = apiResult.getData();
                    HistoricRecordPermissionsChangeResponse.Result result4 = data != null ? data.getResult() : null;
                    HistoricRecordPermissionsChangeResponse data2 = apiResult.getData();
                    companion.setLog(context2, "updateSessionStatusAppointment result: " + result4 + ", url: " + (data2 != null ? data2.getUrl() : null), null, false);
                    if (apiResult.getStatus() == EnumApiStatus.SUCCESS) {
                        Context context3 = context;
                        HistoricRecordPermissionsChangeResponse data3 = apiResult.getData();
                        HistoricRecordPermissionsChangeResponse.Result result5 = data3 != null ? data3.getResult() : null;
                        HistoricRecordPermissionsChangeResponse data4 = apiResult.getData();
                        companion.setLog(context3, "updateSessionStatusAppointment success: " + result5 + ", url: " + (data4 != null ? data4.getUrl() : null), null, false);
                        HistoricRecordPermissionsChangeResponse data5 = apiResult.getData();
                        if ((data5 == null || (result3 = data5.getResult()) == null) ? false : Intrinsics.areEqual(result3.getSuccess(), Boxing.boxBoolean(true))) {
                            singleLiveEvent4 = classPracticeBeforeViewModel._statusClass;
                            singleLiveEvent4.postValue(new Status.Success(str));
                        } else {
                            ClassPracticeBeforeViewModel classPracticeBeforeViewModel2 = classPracticeBeforeViewModel;
                            HistoricRecordPermissionsChangeResponse data6 = apiResult.getData();
                            String message = (data6 == null || (result2 = data6.getResult()) == null) ? null : result2.getMessage();
                            HistoricRecordPermissionsChangeResponse data7 = apiResult.getData();
                            if (data7 != null && (result = data7.getResult()) != null) {
                                r7 = result.getCode();
                            }
                            ErrorResponse errorEndpoint = classPracticeBeforeViewModel2.getErrorEndpoint(message, r7);
                            singleLiveEvent3 = classPracticeBeforeViewModel._statusClass;
                            singleLiveEvent3.postValue(new Status.Exception(errorEndpoint));
                        }
                    } else if (apiResult.getStatus() == EnumApiStatus.ERROR) {
                        Context context4 = context;
                        HistoricRecordPermissionsChangeResponse data8 = apiResult.getData();
                        HistoricRecordPermissionsChangeResponse.Result result6 = data8 != null ? data8.getResult() : null;
                        HistoricRecordPermissionsChangeResponse data9 = apiResult.getData();
                        companion.setLog(context4, "updateSessionStatusAppointment error: " + result6 + ", url: " + (data9 != null ? data9.getUrl() : null), null, false);
                        Integer statusCode = apiResult.getStatusCode();
                        if (statusCode != null && statusCode.intValue() == 401) {
                            singleLiveEvent2 = classPracticeBeforeViewModel._statusClass;
                            singleLiveEvent2.postValue(new Status.Failure(new Exception("401")));
                        } else {
                            String extractErrorMessage = UtilString.INSTANCE.extractErrorMessage(String.valueOf(apiResult.getMessage()));
                            if (extractErrorMessage == null) {
                                extractErrorMessage = context.getString(R.string.dialog_fullscreen_error_status_appointment);
                                Intrinsics.checkNotNullExpressionValue(extractErrorMessage, "getString(...)");
                            }
                            singleLiveEvent = classPracticeBeforeViewModel._statusClass;
                            singleLiveEvent.postValue(new Status.Failure(new Exception(extractErrorMessage)));
                        }
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (m1541catch.collect(flowCollector, this) == coroutine_suspended) {
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
        return ((ClassPracticeBeforeViewModel$updateSessionStatusAppointment$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
