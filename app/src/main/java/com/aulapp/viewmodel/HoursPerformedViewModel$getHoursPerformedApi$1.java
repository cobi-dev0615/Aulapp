package com.gse.aulapp.viewmodel;

import android.content.Context;
import co.ceduladigital.sdk.q;
import com.gse.aulapp.model.data.statusControl.ApiResult;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.enumerate.EnumApiStatus;
import com.gse.aulapp.model.repository.SessionRepository;
import com.gse.aulapp.model.request.HoursScheduledRequest;
import com.gse.aulapp.model.response.HoursScheduledMonthInformationResponse;
import com.gse.aulapp.model.response.HoursScheduledResponse;
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
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.HoursPerformedViewModel$getHoursPerformedApi$1", f = "HoursPerformedViewModel.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class HoursPerformedViewModel$getHoursPerformedApi$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ HoursScheduledRequest $request;
    int label;
    final /* synthetic */ HoursPerformedViewModel this$0;

    @Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u00022\u0015\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tH\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/gse/aulapp/model/data/statusControl/ApiResult;", "Lcom/gse/aulapp/model/response/HoursScheduledResponse;", "e", BuildConfig.FLAVOR, "Lkotlin/ParameterName;", "name", "cause"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.gse.aulapp.viewmodel.HoursPerformedViewModel$getHoursPerformedApi$1$1", f = "HoursPerformedViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.gse.aulapp.viewmodel.HoursPerformedViewModel$getHoursPerformedApi$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function3<FlowCollector<? super ApiResult<? extends HoursScheduledResponse>>, Throwable, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ HoursPerformedViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, HoursPerformedViewModel hoursPerformedViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
            this.$context = context;
            this.this$0 = hoursPerformedViewModel;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super ApiResult<? extends HoursScheduledResponse>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super ApiResult<HoursScheduledResponse>>) flowCollector, th, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableStateFlow mutableStateFlow;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Throwable th = (Throwable) this.L$0;
            LogSendUtil.INSTANCE.setLog(this.$context, q.i("getHoursPerformedApi exception ", th.getMessage()), "getHoursPerformedApi", true);
            mutableStateFlow = this.this$0._message;
            mutableStateFlow.setValue(new Status.Failure(th));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super ApiResult<HoursScheduledResponse>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, this.this$0, continuation);
            anonymousClass1.L$0 = th;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoursPerformedViewModel$getHoursPerformedApi$1(Context context, HoursScheduledRequest hoursScheduledRequest, HoursPerformedViewModel hoursPerformedViewModel, Continuation<? super HoursPerformedViewModel$getHoursPerformedApi$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$request = hoursScheduledRequest;
        this.this$0 = hoursPerformedViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HoursPerformedViewModel$getHoursPerformedApi$1(this.$context, this.$request, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SessionRepository sessionRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LogSendUtil.Companion.setLog$default(LogSendUtil.INSTANCE, this.$context, "getHoursPerformedApi request: " + this.$request, null, false, 12, null);
            sessionRepository = this.this$0.sessionRepository;
            Flow m1541catch = FlowKt.m1541catch(sessionRepository.getHoursScheduled(this.$context, this.$request), new AnonymousClass1(this.$context, this.this$0, null));
            final Context context = this.$context;
            final HoursPerformedViewModel hoursPerformedViewModel = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.gse.aulapp.viewmodel.HoursPerformedViewModel$getHoursPerformedApi$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((ApiResult<HoursScheduledResponse>) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(ApiResult<HoursScheduledResponse> apiResult, Continuation<? super Unit> continuation) {
                    MutableStateFlow mutableStateFlow;
                    MutableStateFlow mutableStateFlow2;
                    MutableStateFlow mutableStateFlow3;
                    List<HoursScheduledMonthInformationResponse> emptyList;
                    MutableStateFlow mutableStateFlow4;
                    HoursScheduledResponse.Result result;
                    HoursScheduledResponse.Result result2;
                    HoursScheduledResponse.Result result3;
                    r2 = null;
                    Integer num = null;
                    if (apiResult.getStatus() == EnumApiStatus.SUCCESS) {
                        LogSendUtil.Companion companion = LogSendUtil.INSTANCE;
                        Context context2 = context;
                        HoursScheduledResponse data = apiResult.getData();
                        HoursScheduledResponse.Result result4 = data != null ? data.getResult() : null;
                        HoursScheduledResponse data2 = apiResult.getData();
                        LogSendUtil.Companion.setLog$default(companion, context2, "getHoursPerformedApi success " + result4 + ", url: " + (data2 != null ? data2.getUrl() : null), null, false, 12, null);
                        HoursScheduledResponse data3 = apiResult.getData();
                        if (data3 == null || (result3 = data3.getResult()) == null || (emptyList = result3.getMonthInformation()) == null) {
                            emptyList = CollectionsKt.emptyList();
                        }
                        HoursPerformedViewModel hoursPerformedViewModel2 = hoursPerformedViewModel;
                        HoursScheduledResponse data4 = apiResult.getData();
                        hoursPerformedViewModel2.numberHours = (data4 == null || (result2 = data4.getResult()) == null) ? null : result2.getHoursMonth();
                        HoursPerformedViewModel hoursPerformedViewModel3 = hoursPerformedViewModel;
                        HoursScheduledResponse data5 = apiResult.getData();
                        if (data5 != null && (result = data5.getResult()) != null) {
                            num = result.getInstructorMonth();
                        }
                        hoursPerformedViewModel3.numberHoursMax = num;
                        mutableStateFlow4 = hoursPerformedViewModel._message;
                        mutableStateFlow4.setValue(new Status.Success(emptyList));
                    } else if (apiResult.getStatus() == EnumApiStatus.ERROR) {
                        LogSendUtil.Companion companion2 = LogSendUtil.INSTANCE;
                        Context context3 = context;
                        HoursScheduledResponse data6 = apiResult.getData();
                        HoursScheduledResponse.Result result5 = data6 != null ? data6.getResult() : null;
                        HoursScheduledResponse data7 = apiResult.getData();
                        LogSendUtil.Companion.setLog$default(companion2, context3, "getHoursPerformedApi error " + result5 + ", url: " + (data7 != null ? data7.getUrl() : null), null, false, 12, null);
                        Integer statusCode = apiResult.getStatusCode();
                        if (statusCode != null && statusCode.intValue() == 401) {
                            mutableStateFlow3 = hoursPerformedViewModel._message;
                            mutableStateFlow3.setValue(new Status.Failure(new Exception("401")));
                        } else {
                            HoursScheduledResponse data8 = apiResult.getData();
                            if ((data8 != null ? data8.getResult() : null) == null) {
                                ArrayList arrayList = new ArrayList();
                                mutableStateFlow2 = hoursPerformedViewModel._message;
                                mutableStateFlow2.setValue(new Status.Success(arrayList));
                            } else {
                                mutableStateFlow = hoursPerformedViewModel._message;
                                mutableStateFlow.setValue(new Status.Failure(new Exception(apiResult.getMessage())));
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
        return ((HoursPerformedViewModel$getHoursPerformedApi$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
