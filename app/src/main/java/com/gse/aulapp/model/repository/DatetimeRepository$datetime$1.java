package com.gse.aulapp.model.repository;

import android.content.Context;
import com.google.gson.Gson;
import com.gse.aulapp.io.ReceptionsAdapter;
import com.gse.aulapp.io.ReceptionsApiService;
import com.gse.aulapp.model.data.statusControl.ApiResult;
import com.gse.aulapp.model.request.DatetimeRequest;
import com.gse.aulapp.model.response.DatetimeResponse;
import com.gse.aulapp.model.response.ErrorResponse;
import com.gse.aulapp.model.response.ErrorResult;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import okhttp3.ResponseBody;
import retrofit2.Response;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/gse/aulapp/model/data/statusControl/ApiResult;", "Lcom/gse/aulapp/model/response/DatetimeResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.model.repository.DatetimeRepository$datetime$1", f = "DatetimeRepository.kt", i = {0, 1, 2}, l = {25, 31, 44, 53}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes.dex */
public final class DatetimeRepository$datetime$1 extends SuspendLambda implements Function2<FlowCollector<? super ApiResult<? extends DatetimeResponse>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ DatetimeRequest $request;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatetimeRepository$datetime$1(Context context, DatetimeRequest datetimeRequest, Continuation<? super DatetimeRepository$datetime$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$request = datetimeRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DatetimeRepository$datetime$1 datetimeRepository$datetime$1 = new DatetimeRepository$datetime$1(this.$context, this.$request, continuation);
        datetimeRepository$datetime$1.L$0 = obj;
        return datetimeRepository$datetime$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super ApiResult<? extends DatetimeResponse>> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super ApiResult<DatetimeResponse>>) flowCollector, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
    
        if (r1.emit(r3, r8) == r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e9, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ce, code lost:
    
        if (r1.emit(r4, r8) == r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e7, code lost:
    
        if (r1.emit(r9, r8) == r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x004b, code lost:
    
        if (r9 == r0) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d1  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Response response;
        ErrorResult result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        String str = null;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            ReceptionsApiService apiService = ReceptionsAdapter.INSTANCE.getApiService(this.$context);
            if (apiService != null) {
                DatetimeRequest datetimeRequest = this.$request;
                this.L$0 = flowCollector;
                this.label = 1;
                obj = apiService.getDatetime(datetimeRequest, this);
            } else {
                response = null;
                if (response != null) {
                    ApiResult.Failure failure = new ApiResult.Failure(500, new Exception("Unknown error"));
                    this.L$0 = null;
                    this.label = 4;
                } else {
                    if (response.isSuccessful()) {
                        DatetimeResponse datetimeResponse = (DatetimeResponse) response.body();
                        if (datetimeResponse != null) {
                            datetimeResponse.setUrl(response.raw().getRequest().getUrl().getUrl());
                            ApiResult.Success success = new ApiResult.Success(response.code(), datetimeResponse);
                            this.L$0 = flowCollector;
                            this.label = 2;
                        }
                        return Unit.INSTANCE;
                    }
                    Gson gson = new Gson();
                    ResponseBody errorBody = response.errorBody();
                    ErrorResponse errorResponse = (ErrorResponse) gson.fromJson(errorBody != null ? errorBody.string() : null, ErrorResponse.class);
                    ResponseBody errorBody2 = response.errorBody();
                    if (errorBody2 != null) {
                        errorBody2.close();
                    }
                    int code = response.code();
                    if (errorResponse != null && (result = errorResponse.getResult()) != null) {
                        str = result.getMessage();
                    }
                    ApiResult.Failure failure2 = new ApiResult.Failure(code, new Exception(str));
                    this.L$0 = flowCollector;
                    this.label = 3;
                }
            }
        } else {
            if (i != 1) {
                if (i == 2 || i == 3) {
                } else if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        response = (Response) obj;
        if (response != null) {
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super ApiResult<DatetimeResponse>> flowCollector, Continuation<? super Unit> continuation) {
        return ((DatetimeRepository$datetime$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
