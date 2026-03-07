package com.gse.aulapp.viewmodel;

import android.app.Activity;
import android.content.Context;
import androidx.navigation.NavController;
import co.ceduladigital.sdk.q;
import com.gse.aulapp.model.adapter.ClassDateRecyclerAdapter;
import com.gse.aulapp.model.data.statusControl.ApiResult;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.dto.SessionResponseDto;
import com.gse.aulapp.model.enumerate.EnumApiStatus;
import com.gse.aulapp.model.repository.SessionRepository;
import com.gse.aulapp.model.request.SessionInstructorRequest;
import com.gse.aulapp.model.response.ErrorResponse;
import com.gse.aulapp.model.response.PracticalConfigurationResponse;
import com.gse.aulapp.model.response.SessionInstructorObjectResponse;
import com.gse.aulapp.model.response.SessionInstructorResponse;
import com.gse.aulapp.util.LogSendUtil;
import com.karumi.dexter.BuildConfig;
import java.util.List;
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
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.HomeViewModel$getSessionFromApiAndSave$1", f = "HomeViewModel.kt", i = {}, l = {129, 146}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class HomeViewModel$getSessionFromApiAndSave$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ ClassDateRecyclerAdapter $classRecyclerAdapter;
    final /* synthetic */ Context $context;
    final /* synthetic */ boolean $isValidateSession;
    final /* synthetic */ NavController $navController;
    final /* synthetic */ String $sessionId;
    final /* synthetic */ SessionInstructorRequest $sessionInstructorRequest;
    int label;
    final /* synthetic */ HomeViewModel this$0;

    @Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u00022\u0015\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tH\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/gse/aulapp/model/data/statusControl/ApiResult;", "Lcom/gse/aulapp/model/response/SessionInstructorResponse;", "e", BuildConfig.FLAVOR, "Lkotlin/ParameterName;", "name", "cause"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.gse.aulapp.viewmodel.HomeViewModel$getSessionFromApiAndSave$1$1", f = "HomeViewModel.kt", i = {}, l = {145}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.gse.aulapp.viewmodel.HomeViewModel$getSessionFromApiAndSave$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function3<FlowCollector<? super ApiResult<? extends SessionInstructorResponse>>, Throwable, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ HomeViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, HomeViewModel homeViewModel, Continuation<?> continuation) {
            super(3, continuation);
            this.$context = context;
            this.this$0 = homeViewModel;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super ApiResult<? extends SessionInstructorResponse>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super ApiResult<SessionInstructorResponse>>) flowCollector, th, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableSharedFlow mutableSharedFlow;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Throwable th = (Throwable) this.L$0;
                LogSendUtil.INSTANCE.setLog(this.$context, q.i("getSessionFromApiAndSave exception: ", th.getMessage()), "getSessionFromApiAndSave", true);
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
        public final Object invoke2(FlowCollector<? super ApiResult<SessionInstructorResponse>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, this.this$0, continuation);
            anonymousClass1.L$0 = th;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$getSessionFromApiAndSave$1(HomeViewModel homeViewModel, Context context, SessionInstructorRequest sessionInstructorRequest, boolean z, String str, NavController navController, ClassDateRecyclerAdapter classDateRecyclerAdapter, Activity activity, Continuation continuation) {
        super(2, continuation);
        this.this$0 = homeViewModel;
        this.$context = context;
        this.$sessionInstructorRequest = sessionInstructorRequest;
        this.$isValidateSession = z;
        this.$sessionId = str;
        this.$navController = navController;
        this.$classRecyclerAdapter = classDateRecyclerAdapter;
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation<?> continuation) {
        return new HomeViewModel$getSessionFromApiAndSave$1(this.this$0, this.$context, this.$sessionInstructorRequest, this.$isValidateSession, this.$sessionId, this.$navController, this.$classRecyclerAdapter, this.$activity, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0090, code lost:
    
        if (r13.collect(r4, r12) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0092, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (r13.emit(r1, r12) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow mutableSharedFlow;
        SessionRepository sessionRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.this$0.getIsSwipeRefresh()) {
                mutableSharedFlow = this.this$0._message;
                Status.Loading loading = new Status.Loading(false, 1, null);
                this.label = 1;
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
        LogSendUtil.INSTANCE.setLog(this.$context, "getSessionFromApiAndSave request: " + this.$sessionInstructorRequest, null, false);
        sessionRepository = this.this$0.sessionRepository;
        Flow m1541catch = FlowKt.m1541catch(sessionRepository.getSessionApi(this.$context, this.$sessionInstructorRequest), new AnonymousClass1(this.$context, this.this$0, null));
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$context, this.this$0, this.$isValidateSession, this.$sessionId, this.$navController, this.$classRecyclerAdapter, this.$activity);
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeViewModel$getSessionFromApiAndSave$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.gse.aulapp.viewmodel.HomeViewModel$getSessionFromApiAndSave$1$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements FlowCollector {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ ClassDateRecyclerAdapter $classRecyclerAdapter;
        final /* synthetic */ Context $context;
        final /* synthetic */ boolean $isValidateSession;
        final /* synthetic */ NavController $navController;
        final /* synthetic */ String $sessionId;
        final /* synthetic */ HomeViewModel this$0;

        public AnonymousClass2(Context context, HomeViewModel homeViewModel, boolean z, String str, NavController navController, ClassDateRecyclerAdapter classDateRecyclerAdapter, Activity activity) {
            this.$context = context;
            this.this$0 = homeViewModel;
            this.$isValidateSession = z;
            this.$sessionId = str;
            this.$navController = navController;
            this.$classRecyclerAdapter = classDateRecyclerAdapter;
            this.$activity = activity;
        }

        /* JADX WARN: Code restructure failed: missing block: B:110:0x0228, code lost:
        
            if (r14.emit(r2, r0) == r1) goto L138;
         */
        /* JADX WARN: Code restructure failed: missing block: B:130:0x029b, code lost:
        
            if (r13.emit(r14, r0) == r1) goto L138;
         */
        /* JADX WARN: Code restructure failed: missing block: B:132:0x02bd, code lost:
        
            if (r14.emit(r2, r0) == r1) goto L138;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x0120, code lost:
        
            if (r2.emit(r4, r0) == r1) goto L138;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x0124, code lost:
        
            r0 = r12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x016d, code lost:
        
            if (r4.emit(r5, r0) == r1) goto L138;
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x01e3, code lost:
        
            if (r13.emit(r2, r0) == r1) goto L138;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0187  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(ApiResult<SessionInstructorResponse> apiResult, Continuation continuation) {
            HomeViewModel$getSessionFromApiAndSave$1$2$emit$1 homeViewModel$getSessionFromApiAndSave$1$2$emit$1;
            MutableSharedFlow mutableSharedFlow;
            MutableSharedFlow mutableSharedFlow2;
            SessionResponseDto sessionResponseDto;
            MutableSharedFlow mutableSharedFlow3;
            SessionInstructorResponse.Result result;
            SessionInstructorResponse.Result result2;
            MutableSharedFlow mutableSharedFlow4;
            SessionInstructorResponse.Result result3;
            MutableSharedFlow mutableSharedFlow5;
            SessionInstructorResponse.Result result4;
            SessionInstructorResponse.Result result5;
            AnonymousClass2<T> anonymousClass2;
            MutableSharedFlow mutableSharedFlow6;
            SessionInstructorResponse.Result result6;
            SessionInstructorResponse.Result result7;
            SessionInstructorResponse.Result result8;
            SessionInstructorResponse.Result result9;
            SessionInstructorResponse data;
            SessionInstructorResponse.Result result10;
            if (continuation instanceof HomeViewModel$getSessionFromApiAndSave$1$2$emit$1) {
                homeViewModel$getSessionFromApiAndSave$1$2$emit$1 = (HomeViewModel$getSessionFromApiAndSave$1$2$emit$1) continuation;
                int i = homeViewModel$getSessionFromApiAndSave$1$2$emit$1.label;
                if ((i & IntCompanionObject.MIN_VALUE) != 0) {
                    homeViewModel$getSessionFromApiAndSave$1$2$emit$1.label = i - IntCompanionObject.MIN_VALUE;
                    Object obj = homeViewModel$getSessionFromApiAndSave$1$2$emit$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    String str = null;
                    str = null;
                    switch (homeViewModel$getSessionFromApiAndSave$1$2$emit$1.label) {
                        case 0:
                            ResultKt.throwOnFailure(obj);
                            if (apiResult.getStatus() != EnumApiStatus.SUCCESS) {
                                if (apiResult.getStatus() == EnumApiStatus.ERROR) {
                                    LogSendUtil.Companion companion = LogSendUtil.INSTANCE;
                                    Context context = this.$context;
                                    SessionInstructorResponse data2 = apiResult.getData();
                                    SessionInstructorResponse.Result result11 = data2 != null ? data2.getResult() : null;
                                    SessionInstructorResponse data3 = apiResult.getData();
                                    companion.setLog(context, "getSessionFromApiAndSave error: " + result11 + ", url: " + (data3 != null ? data3.getUrl() : null), null, false);
                                    Integer statusCode = apiResult.getStatusCode();
                                    if (statusCode == null || statusCode.intValue() != 401) {
                                        ErrorResponse errorEndpoint = this.this$0.getErrorEndpoint(apiResult.getMessage(), null);
                                        mutableSharedFlow = this.this$0._message;
                                        Status.Exception exception = new Status.Exception(errorEndpoint);
                                        homeViewModel$getSessionFromApiAndSave$1$2$emit$1.label = 6;
                                        break;
                                    } else {
                                        mutableSharedFlow2 = this.this$0._message;
                                        Status.Failure failure = new Status.Failure(new Exception("401"));
                                        homeViewModel$getSessionFromApiAndSave$1$2$emit$1.label = 5;
                                        break;
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                            LogSendUtil.Companion companion2 = LogSendUtil.INSTANCE;
                            Context context2 = this.$context;
                            SessionInstructorResponse data4 = apiResult.getData();
                            SessionInstructorResponse.Result result12 = data4 != null ? data4.getResult() : null;
                            SessionInstructorResponse data5 = apiResult.getData();
                            companion2.setLog(context2, "getSessionFromApiAndSave success: " + result12 + ", url: " + (data5 != null ? data5.getUrl() : null), null, false);
                            SessionInstructorResponse data6 = apiResult.getData();
                            List<SessionInstructorObjectResponse> data7 = (data6 == null || (result9 = data6.getResult()) == null) ? null : result9.getData();
                            SessionInstructorResponse data8 = apiResult.getData();
                            PracticalConfigurationResponse practicalConfiguration = (data8 == null || (result8 = data8.getResult()) == null) ? null : result8.getPracticalConfiguration();
                            SessionInstructorResponse data9 = apiResult.getData();
                            sessionResponseDto = new SessionResponseDto(data7, practicalConfiguration, (data9 == null || (result7 = data9.getResult()) == null) ? null : result7.getExamPracticalConfiguration());
                            List<SessionInstructorObjectResponse> sessionInstructorObjectResponse = sessionResponseDto.getSessionInstructorObjectResponse();
                            boolean z = false;
                            if (sessionInstructorObjectResponse != null && !sessionInstructorObjectResponse.isEmpty()) {
                                SessionInstructorResponse data10 = apiResult.getData();
                                if (data10 != null && (result6 = data10.getResult()) != null) {
                                    z = Intrinsics.areEqual(result6.getSuccess(), Boxing.boxBoolean(true));
                                }
                                if (!z) {
                                    HomeViewModel homeViewModel = this.this$0;
                                    SessionInstructorResponse data11 = apiResult.getData();
                                    String message = (data11 == null || (result5 = data11.getResult()) == null) ? null : result5.getMessage();
                                    SessionInstructorResponse data12 = apiResult.getData();
                                    ErrorResponse errorEndpoint2 = homeViewModel.getErrorEndpoint(message, (data12 == null || (result4 = data12.getResult()) == null) ? null : result4.getCode());
                                    mutableSharedFlow5 = this.this$0._message;
                                    Status.Exception exception2 = new Status.Exception(errorEndpoint2);
                                    homeViewModel$getSessionFromApiAndSave$1$2$emit$1.L$0 = this;
                                    homeViewModel$getSessionFromApiAndSave$1$2$emit$1.L$1 = apiResult;
                                    homeViewModel$getSessionFromApiAndSave$1$2$emit$1.L$2 = sessionResponseDto;
                                    homeViewModel$getSessionFromApiAndSave$1$2$emit$1.label = 2;
                                    break;
                                } else {
                                    mutableSharedFlow6 = this.this$0._message;
                                    Status.Success success = new Status.Success(sessionResponseDto);
                                    homeViewModel$getSessionFromApiAndSave$1$2$emit$1.L$0 = this;
                                    homeViewModel$getSessionFromApiAndSave$1$2$emit$1.L$1 = apiResult;
                                    homeViewModel$getSessionFromApiAndSave$1$2$emit$1.L$2 = sessionResponseDto;
                                    homeViewModel$getSessionFromApiAndSave$1$2$emit$1.label = 1;
                                    break;
                                }
                                SessionResponseDto sessionResponseDto2 = sessionResponseDto;
                                data = apiResult.getData();
                                if (((data != null || (result10 = data.getResult()) == null) ? null : result10.getExamPracticalConfiguration()) != null) {
                                    SessionInstructorResponse.Result result13 = apiResult.getData().getResult();
                                    if ((result13 != null ? result13.getPracticalConfiguration() : null) != null) {
                                        anonymousClass2.this$0.initConfigurationPracticalAndExamPractical(apiResult.getData());
                                    }
                                }
                                anonymousClass2.this$0.validateEnableStart(anonymousClass2.$isValidateSession, sessionResponseDto2, anonymousClass2.$sessionId, anonymousClass2.$navController, anonymousClass2.$classRecyclerAdapter, anonymousClass2.$activity);
                                return Unit.INSTANCE;
                            }
                            SessionInstructorResponse data13 = apiResult.getData();
                            if (data13 != null && (result3 = data13.getResult()) != null) {
                                z = Intrinsics.areEqual(result3.getSuccess(), Boxing.boxBoolean(true));
                            }
                            if (!z) {
                                HomeViewModel homeViewModel2 = this.this$0;
                                SessionInstructorResponse data14 = apiResult.getData();
                                String message2 = (data14 == null || (result2 = data14.getResult()) == null) ? null : result2.getMessage();
                                SessionInstructorResponse data15 = apiResult.getData();
                                if (data15 != null && (result = data15.getResult()) != null) {
                                    str = result.getCode();
                                }
                                ErrorResponse errorEndpoint3 = homeViewModel2.getErrorEndpoint(message2, str);
                                mutableSharedFlow3 = this.this$0._message;
                                Status.Exception exception3 = new Status.Exception(errorEndpoint3);
                                homeViewModel$getSessionFromApiAndSave$1$2$emit$1.label = 4;
                                break;
                            } else {
                                mutableSharedFlow4 = this.this$0._message;
                                Status.Success success2 = new Status.Success(sessionResponseDto);
                                homeViewModel$getSessionFromApiAndSave$1$2$emit$1.label = 3;
                                break;
                            }
                            return coroutine_suspended;
                        case 1:
                        case 2:
                            SessionResponseDto sessionResponseDto3 = (SessionResponseDto) homeViewModel$getSessionFromApiAndSave$1$2$emit$1.L$2;
                            ApiResult<SessionInstructorResponse> apiResult2 = (ApiResult) homeViewModel$getSessionFromApiAndSave$1$2$emit$1.L$1;
                            anonymousClass2 = (AnonymousClass2) homeViewModel$getSessionFromApiAndSave$1$2$emit$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            sessionResponseDto = sessionResponseDto3;
                            apiResult = apiResult2;
                            SessionResponseDto sessionResponseDto22 = sessionResponseDto;
                            data = apiResult.getData();
                            if (data != null) {
                                break;
                            }
                            if (((data != null || (result10 = data.getResult()) == null) ? null : result10.getExamPracticalConfiguration()) != null) {
                            }
                            anonymousClass2.this$0.validateEnableStart(anonymousClass2.$isValidateSession, sessionResponseDto22, anonymousClass2.$sessionId, anonymousClass2.$navController, anonymousClass2.$classRecyclerAdapter, anonymousClass2.$activity);
                            return Unit.INSTANCE;
                        case 3:
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        case 4:
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        case 5:
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        case 6:
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            homeViewModel$getSessionFromApiAndSave$1$2$emit$1 = new HomeViewModel$getSessionFromApiAndSave$1$2$emit$1(this, continuation);
            Object obj2 = homeViewModel$getSessionFromApiAndSave$1$2$emit$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            String str2 = null;
            str2 = null;
            switch (homeViewModel$getSessionFromApiAndSave$1$2$emit$1.label) {
            }
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return emit((ApiResult<SessionInstructorResponse>) obj, (Continuation<? super Unit>) continuation);
        }
    }
}
