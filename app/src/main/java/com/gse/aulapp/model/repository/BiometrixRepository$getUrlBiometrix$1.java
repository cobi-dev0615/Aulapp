package com.gse.aulapp.model.repository;

import android.content.Context;
import com.google.gson.Gson;
import com.gse.aulapp.io.ReceptionsAdapter;
import com.gse.aulapp.io.ReceptionsApiService;
import com.gse.aulapp.model.data.statusControl.ApiResult;
import com.gse.aulapp.model.request.BiometrixRequest;
import com.gse.aulapp.model.response.BiometrixUrlActionResponse;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import okhttp3.ResponseBody;
import retrofit2.Response;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/gse/aulapp/model/data/statusControl/ApiResult;", "Lcom/gse/aulapp/model/response/BiometrixUrlActionResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.model.repository.BiometrixRepository$getUrlBiometrix$1", f = "BiometrixRepository.kt", i = {0, 1, 2}, l = {26, 33, 46, 55}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes.dex */
public final class BiometrixRepository$getUrlBiometrix$1 extends SuspendLambda implements Function2<FlowCollector<? super ApiResult<? extends BiometrixUrlActionResponse>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ BiometrixRequest $request;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiometrixRepository$getUrlBiometrix$1(Context context, BiometrixRequest biometrixRequest, Continuation continuation) {
        super(2, (Continuation<Object>) continuation);
        this.$context = context;
        this.$request = biometrixRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation<?> continuation) {
        BiometrixRepository$getUrlBiometrix$1 biometrixRepository$getUrlBiometrix$1 = new BiometrixRepository$getUrlBiometrix$1(this.$context, this.$request, (Continuation) continuation);
        biometrixRepository$getUrlBiometrix$1.L$0 = obj;
        return (Continuation<Unit>) (Object) biometrixRepository$getUrlBiometrix$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super ApiResult<? extends BiometrixUrlActionResponse>> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super ApiResult<BiometrixUrlActionResponse>>) flowCollector, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0091, code lost:
    
        if (r1.emit(r3, r14) == r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f3, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d8, code lost:
    
        if (r1.emit(r4, r14) == r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f1, code lost:
    
        if (r1.emit(r15, r14) == r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0051, code lost:
    
        if (r15 == r0) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00db  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
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
            BiometrixRequest biometrixRequest = this.$request;
            this.L$0 = flowCollector;
            this.label = 1;
            obj = ReceptionsApiService.DefaultImpls.getUrlBiometrix$default(apiService, null, biometrixRequest, this, 1, null);
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

        Response response = (Response) obj;
        if (response == null) {
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
            BiometrixUrlActionResponse biometrixUrlActionResponse = (BiometrixUrlActionResponse) response.body();
            if (biometrixUrlActionResponse != null) {
                biometrixUrlActionResponse.setUrl(response.raw().request().url().url().toString());
            }
            ApiResult.Success success = new ApiResult.Success(response.code(), biometrixUrlActionResponse);
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
                            if (result != null) { str = result.getMessage(); }
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
                if (errorBody2 != null) { errorBody2.close(); }
            } catch (Exception ignored) {}
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
    public final Object invoke2(FlowCollector<? super ApiResult<BiometrixUrlActionResponse>> flowCollector, Continuation<? super Unit> continuation) {
        return ((BiometrixRepository$getUrlBiometrix$1) (Object) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
