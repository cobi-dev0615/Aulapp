package com.gse.aulapp.viewmodel;

import android.content.Context;
import co.ceduladigital.sdk.q;
import com.gse.aulapp.model.data.statusControl.ApiResult;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.enumerate.EnumApiStatus;
import com.gse.aulapp.model.repository.SessionRepository;
import com.gse.aulapp.model.request.SessionInstructorRequest;
import com.gse.aulapp.model.response.SessionRoutesDataResponse;
import com.gse.aulapp.model.response.SessionRoutesResponse;
import com.gse.aulapp.util.LogSendUtil;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
@DebugMetadata(c = "com.gse.aulapp.viewmodel.RideHistoryViewModel$getRoutesFromApi$1", f = "RideHistoryViewModel.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class RideHistoryViewModel$getRoutesFromApi$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ SessionInstructorRequest $sessionInstructorRequest;
    int label;
    final /* synthetic */ RideHistoryViewModel this$0;

    @Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u00022\u0015\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tH\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/gse/aulapp/model/data/statusControl/ApiResult;", "Lcom/gse/aulapp/model/response/SessionRoutesResponse;", "e", BuildConfig.FLAVOR, "Lkotlin/ParameterName;", "name", "cause"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.gse.aulapp.viewmodel.RideHistoryViewModel$getRoutesFromApi$1$1", f = "RideHistoryViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.gse.aulapp.viewmodel.RideHistoryViewModel$getRoutesFromApi$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function3<FlowCollector<? super ApiResult<? extends SessionRoutesResponse>>, Throwable, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ RideHistoryViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, RideHistoryViewModel rideHistoryViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
            this.$context = context;
            this.this$0 = rideHistoryViewModel;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super ApiResult<? extends SessionRoutesResponse>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super ApiResult<SessionRoutesResponse>>) flowCollector, th, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Throwable th = (Throwable) this.L$0;
            LogSendUtil.INSTANCE.setLog(this.$context, q.i("getRoutesFromApi exception: ", th.getMessage()), "getRoutesFromApi", true);
            this.this$0.get_message().setValue(new Status.Failure(th));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super ApiResult<SessionRoutesResponse>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, this.this$0, continuation);
            anonymousClass1.L$0 = th;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideHistoryViewModel$getRoutesFromApi$1(Context context, SessionInstructorRequest sessionInstructorRequest, RideHistoryViewModel rideHistoryViewModel, Continuation<? super RideHistoryViewModel$getRoutesFromApi$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$sessionInstructorRequest = sessionInstructorRequest;
        this.this$0 = rideHistoryViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RideHistoryViewModel$getRoutesFromApi$1(this.$context, this.$sessionInstructorRequest, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SessionRepository sessionRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LogSendUtil.INSTANCE.setLog(this.$context, "getRoutesFromApi request: " + this.$sessionInstructorRequest, null, false);
            sessionRepository = this.this$0.sessionRepository;
            Flow m1541catch = FlowKt.m1541catch(sessionRepository.getSessionsRoute(this.$context, this.$sessionInstructorRequest), new AnonymousClass1(this.$context, this.this$0, null));
            final Context context = this.$context;
            final RideHistoryViewModel rideHistoryViewModel = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.gse.aulapp.viewmodel.RideHistoryViewModel$getRoutesFromApi$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((ApiResult<SessionRoutesResponse>) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(ApiResult<SessionRoutesResponse> apiResult, Continuation<? super Unit> continuation) {
                    List<SessionRoutesDataResponse> emptyList;
                    SessionRoutesResponse.Result result;
                    SessionRoutesResponse.Result result2;
                    SessionRoutesResponse.Result result3;
                    SessionRoutesResponse.Result result4;
                    SessionRoutesResponse.Result result5;
                    String str = null;
                    if (apiResult.getStatus() == EnumApiStatus.SUCCESS) {
                        LogSendUtil.Companion companion = LogSendUtil.INSTANCE;
                        Context context2 = context;
                        SessionRoutesResponse data = apiResult.getData();
                        Boolean success = (data == null || (result5 = data.getResult()) == null) ? null : result5.getSuccess();
                        SessionRoutesResponse data2 = apiResult.getData();
                        companion.setLog(context2, "getRoutesFromApi success: " + success + ", url: " + (data2 != null ? data2.getUrl() : null), null, false);
                        SessionRoutesResponse data3 = apiResult.getData();
                        if (data3 == null || (result4 = data3.getResult()) == null || (emptyList = result4.getData()) == null) {
                            emptyList = CollectionsKt.emptyList();
                        }
                        SessionRoutesResponse data4 = apiResult.getData();
                        if ((data4 == null || (result3 = data4.getResult()) == null) ? false : Intrinsics.areEqual(result3.getSuccess(), Boxing.boxBoolean(true))) {
                            rideHistoryViewModel.get_message().setValue(new Status.Success(emptyList));
                        } else {
                            RideHistoryViewModel rideHistoryViewModel2 = rideHistoryViewModel;
                            SessionRoutesResponse data5 = apiResult.getData();
                            String message = (data5 == null || (result2 = data5.getResult()) == null) ? null : result2.getMessage();
                            SessionRoutesResponse data6 = apiResult.getData();
                            if (data6 != null && (result = data6.getResult()) != null) {
                                str = result.getCode();
                            }
                            rideHistoryViewModel.get_message().setValue(new Status.Exception(rideHistoryViewModel2.getErrorEndpoint(message, str)));
                        }
                    } else if (apiResult.getStatus() == EnumApiStatus.ERROR) {
                        LogSendUtil.Companion companion2 = LogSendUtil.INSTANCE;
                        Context context3 = context;
                        SessionRoutesResponse data7 = apiResult.getData();
                        SessionRoutesResponse.Result result6 = data7 != null ? data7.getResult() : null;
                        SessionRoutesResponse data8 = apiResult.getData();
                        companion2.setLog(context3, "getRoutesFromApi Error: " + result6 + ", url: " + (data8 != null ? data8.getUrl() : null), null, false);
                        if (apiResult.hashCode() == 401) {
                            rideHistoryViewModel.get_message().setValue(new Status.Failure(new Exception("401")));
                        } else {
                            SessionRoutesResponse data9 = apiResult.getData();
                            if ((data9 != null ? data9.getResult() : null) == null) {
                                rideHistoryViewModel.get_message().setValue(new Status.Success(new ArrayList()));
                            } else {
                                rideHistoryViewModel.get_message().setValue(new Status.Exception(rideHistoryViewModel.getErrorEndpoint(apiResult.getMessage(), null)));
                            }
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
        return ((RideHistoryViewModel$getRoutesFromApi$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
