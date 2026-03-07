package com.gse.aulapp.model.repository;

import android.content.Context;
import com.google.gson.Gson;
import com.gse.aulapp.io.ReceptionsAdapter;
import com.gse.aulapp.io.ReceptionsApiService;
import com.gse.aulapp.model.data.statusControl.ApiResult;
import com.gse.aulapp.model.request.SessionInstructorRequest;
import com.gse.aulapp.model.response.ErrorResponse;
import com.gse.aulapp.model.response.ErrorResult;
import com.gse.aulapp.model.response.SessionInstructorResponse;
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

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/gse/aulapp/model/data/statusControl/ApiResult;", "Lcom/gse/aulapp/model/response/SessionInstructorResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.model.repository.SessionRepository$getSessionApi$1", f = "SessionRepository.kt", i = {0, 1, 2}, l = {69, 75, 88, 96}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes.dex */
public final class SessionRepository$getSessionApi$1 extends SuspendLambda implements Function2<FlowCollector<? super ApiResult<? extends SessionInstructorResponse>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ SessionInstructorRequest $request;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionRepository$getSessionApi$1(Context context, SessionInstructorRequest sessionInstructorRequest, Continuation<? super SessionRepository$getSessionApi$1> continuation) {
        super(2, (Continuation<Object>) continuation);
        this.$context = context;
        this.$request = sessionInstructorRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SessionRepository$getSessionApi$1 sessionRepository$getSessionApi$1 = new SessionRepository$getSessionApi$1(this.$context, this.$request, (Continuation) continuation);
        sessionRepository$getSessionApi$1.L$0 = obj;
        return (Continuation<Unit>) (Object) sessionRepository$getSessionApi$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super ApiResult<? extends SessionInstructorResponse>> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super ApiResult<SessionInstructorResponse>>) flowCollector, continuation);
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
                SessionInstructorRequest sessionInstructorRequest = this.$request;
                this.L$0 = flowCollector;
                this.label = 1;
                obj = apiService.getSessionInstructor(sessionInstructorRequest, this);
            } else {
                response = null;
                if (response != null) {
                    ApiResult.Failure failure = new ApiResult.Failure(500, new Exception("Unknown error"));
                    this.L$0 = null;
                    this.label = 4;
                } else {
                    if (response.isSuccessful()) {
                        SessionInstructorResponse sessionInstructorResponse = (SessionInstructorResponse) response.body();
                        if (sessionInstructorResponse != null) {
                            sessionInstructorResponse.setUrl(response.raw().request().url().url().toString());
                            ApiResult.Success success = new ApiResult.Success(response.code(), sessionInstructorResponse);
                            this.L$0 = flowCollector;
                            this.label = 2;
                        }
                        return Unit.INSTANCE;
                    }
                    Gson gson = new Gson();
                    ResponseBody errorBody = response.errorBody();
                    String errorBodyString = null;
                    try { if (errorBody != null) errorBodyString = errorBody.string(); } catch (java.io.IOException ignored) {}
                    ErrorResponse errorResponse = (ErrorResponse) gson.fromJson(errorBodyString, ErrorResponse.class);
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
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super ApiResult<SessionInstructorResponse>> flowCollector, Continuation<? super Unit> continuation) {
        return ((SessionRepository$getSessionApi$1) (Object) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
