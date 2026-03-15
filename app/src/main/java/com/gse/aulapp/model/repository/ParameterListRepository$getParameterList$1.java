package com.gse.aulapp.model.repository;

import android.content.Context;
import android.util.Log;
import com.google.gson.Gson;
import com.gse.aulapp.io.ReceptionsAdapter;
import com.gse.aulapp.io.ReceptionsApiService;
import com.gse.aulapp.model.data.statusControl.ApiResult;
import com.gse.aulapp.model.request.ParameterListRequest;
import com.gse.aulapp.model.response.ErrorResponse;
import com.gse.aulapp.model.response.ErrorResult;
import com.gse.aulapp.model.response.ParameterListResponse;
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

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/gse/aulapp/model/data/statusControl/ApiResult;", "Lcom/gse/aulapp/model/response/ParameterListResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.model.repository.ParameterListRepository$getParameterList$1", f = "ParameterListRepository.kt", i = {0, 1, 2}, l = {28, 35, 48, 58}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes.dex */
public final class ParameterListRepository$getParameterList$1 extends SuspendLambda implements Function2<FlowCollector<? super ApiResult<? extends ParameterListResponse>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ParameterListRequest $request;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParameterListRepository$getParameterList$1(Context context, ParameterListRequest parameterListRequest, Continuation continuation) {
        super(2, (Continuation<Object>) continuation);
        this.$context = context;
        this.$request = parameterListRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation<?> continuation) {
        ParameterListRepository$getParameterList$1 parameterListRepository$getParameterList$1 = new ParameterListRepository$getParameterList$1(this.$context, this.$request, (Continuation) continuation);
        parameterListRepository$getParameterList$1.L$0 = obj;
        return (Continuation<Unit>) (Object) parameterListRepository$getParameterList$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super ApiResult<? extends ParameterListResponse>> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super ApiResult<ParameterListResponse>>) flowCollector, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            ReceptionsApiService apiService = ReceptionsAdapter.INSTANCE.getApiService(this.$context);
            if (apiService == null) {
                ApiResult.Failure failure = new ApiResult.Failure(500, new Exception("Unknown error"));
                this.L$0 = null;
                this.label = 4;
                if (flowCollector.emit(failure, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            ParameterListRequest parameterListRequest = this.$request;
            this.L$0 = flowCollector;
            this.label = 1;
            obj = apiService.parameterList(parameterListRequest, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else if (i == 2 || i == 3 || i == 4) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        // Process the API response
        Response response = (Response) obj;
        if (response == null) {
            Log.e("ParameterListRepo", "API response is null");
            ApiResult.Failure failure = new ApiResult.Failure(500, new Exception("Unknown error"));
            this.L$0 = null;
            this.label = 4;
            if (flowCollector.emit(failure, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        Object emitResult;
        if (response.isSuccessful()) {
            ParameterListResponse parameterListResponse = (ParameterListResponse) response.body();
            if (parameterListResponse != null) {
                parameterListResponse.setUrl(response.raw().request().url().url().toString());
            }
            ApiResult.Success success = new ApiResult.Success(response.code(), parameterListResponse);
            this.L$0 = null;
            this.label = 2;
            emitResult = flowCollector.emit(success, this);
        } else {
            String str = null;
            try {
                Gson gson = new Gson();
                ResponseBody errorBody = response.errorBody();
                String errorBodyString = null;
                try { if (errorBody != null) errorBodyString = errorBody.string(); } catch (java.io.IOException ignored) {}
                if (errorBodyString != null && !errorBodyString.isEmpty()) {
                    try {
                        ErrorResponse errorResponse = gson.fromJson(errorBodyString, ErrorResponse.class);
                        if (errorResponse != null) {
                            ErrorResult result = errorResponse.getResult();
                            if (result != null) {
                                str = result.getMessage();
                            }
                        }
                    } catch (Exception ignored2) {}
                    if (str == null) {
                        try {
                            com.google.gson.JsonObject jsonObj = com.google.gson.JsonParser.parseString(errorBodyString).getAsJsonObject();
                            if (jsonObj.has("message") && !jsonObj.get("message").isJsonNull()) {
                                str = jsonObj.get("message").getAsString();
                            }
                        } catch (Exception ignored3) {}
                    }
                }
                ResponseBody errorBody2 = response.errorBody();
                if (errorBody2 != null) {
                    errorBody2.close();
                }
            } catch (Exception ignored) {
                Log.e("ParameterListRepo", "Failed to parse error body", ignored);
            }
            ApiResult.Failure failure2 = new ApiResult.Failure(response.code(), new Exception(str));
            this.L$0 = null;
            this.label = 3;
            emitResult = flowCollector.emit(failure2, this);
        }
        if (emitResult == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super ApiResult<ParameterListResponse>> flowCollector, Continuation<? super Unit> continuation) {
        return ((ParameterListRepository$getParameterList$1) (Object) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
