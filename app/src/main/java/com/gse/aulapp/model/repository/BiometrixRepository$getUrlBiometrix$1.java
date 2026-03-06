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
    public BiometrixRepository$getUrlBiometrix$1(Context context, BiometrixRequest biometrixRequest, Continuation<? super BiometrixRepository$getUrlBiometrix$1> continuation) {
        super(2, (Continuation<Object>) continuation);
        this.$context = context;
        this.$request = biometrixRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
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
        BiometrixRepository$getUrlBiometrix$1 biometrixRepository$getUrlBiometrix$1;
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
                BiometrixRequest biometrixRequest = this.$request;
                this.L$0 = flowCollector;
                this.label = 1;
                biometrixRepository$getUrlBiometrix$1 = this;
                obj = ReceptionsApiService.DefaultImpls.getUrlBiometrix$default(apiService, null, biometrixRequest, biometrixRepository$getUrlBiometrix$1, 1, null);
            } else {
                biometrixRepository$getUrlBiometrix$1 = this;
                response = null;
                if (response != null) {
                    ApiResult.Failure failure = new ApiResult.Failure(500, new Exception("Unknown error"));
                    biometrixRepository$getUrlBiometrix$1.L$0 = null;
                    biometrixRepository$getUrlBiometrix$1.label = 4;
                } else {
                    if (response.isSuccessful()) {
                        Object body = response.body();
                        Intrinsics.checkNotNull(body);
                        BiometrixUrlActionResponse biometrixUrlActionResponse = (BiometrixUrlActionResponse) body;
                        if (biometrixUrlActionResponse != null) {
                            biometrixUrlActionResponse.setUrl(response.raw().request().url().url().toString());
                            ApiResult.Success success = new ApiResult.Success(response.code(), biometrixUrlActionResponse);
                            biometrixRepository$getUrlBiometrix$1.L$0 = flowCollector;
                            biometrixRepository$getUrlBiometrix$1.label = 2;
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
                    biometrixRepository$getUrlBiometrix$1.L$0 = flowCollector;
                    biometrixRepository$getUrlBiometrix$1.label = 3;
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
            biometrixRepository$getUrlBiometrix$1 = this;
        }
        response = (Response) obj;
        if (response != null) {
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super ApiResult<BiometrixUrlActionResponse>> flowCollector, Continuation<? super Unit> continuation) {
        return ((BiometrixRepository$getUrlBiometrix$1) (Object) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
