package com.gse.aulapp.model.repository;

import android.content.Context;
import com.gse.aulapp.io.ReceptionsAdapter;
import com.gse.aulapp.io.ReceptionsApiService;
import com.gse.aulapp.model.data.statusControl.ApiResult;
import com.gse.aulapp.model.request.SessionPracticeExamSyncRequest;
import com.gse.aulapp.model.response.SessionPracticeExamResponse;
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

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/gse/aulapp/model/data/statusControl/ApiResult;", "Lcom/gse/aulapp/model/response/SessionPracticeExamResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.model.repository.SessionRepository$sendSessionPracticeRequest$1", f = "SessionRepository.kt", i = {0, 1, 2}, l = {540, 547, 558, 565}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes.dex */
public final class SessionRepository$sendSessionPracticeRequest$1 extends SuspendLambda implements Function2<FlowCollector<? super ApiResult<? extends SessionPracticeExamResponse>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ SessionPracticeExamSyncRequest $request;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionRepository$sendSessionPracticeRequest$1(Context context, SessionPracticeExamSyncRequest sessionPracticeExamSyncRequest, Continuation continuation) {
        super(2, (Continuation<Object>) continuation);
        this.$context = context;
        this.$request = sessionPracticeExamSyncRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation<?> continuation) {
        SessionRepository$sendSessionPracticeRequest$1 sessionRepository$sendSessionPracticeRequest$1 = new SessionRepository$sendSessionPracticeRequest$1(this.$context, this.$request, (Continuation) continuation);
        sessionRepository$sendSessionPracticeRequest$1.L$0 = obj;
        return (Continuation<Unit>) (Object) sessionRepository$sendSessionPracticeRequest$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super ApiResult<? extends SessionPracticeExamResponse>> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super ApiResult<SessionPracticeExamResponse>>) flowCollector, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008e, code lost:
    
        if (r1.emit(r3, r8) == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d5, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ba, code lost:
    
        if (r1.emit(r2, r8) == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d3, code lost:
    
        if (r1.emit(r9, r8) == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x004b, code lost:
    
        if (r9 == r0) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Response response;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            ReceptionsApiService apiService = ReceptionsAdapter.INSTANCE.getApiService(this.$context);
            if (apiService != null) {
                SessionPracticeExamSyncRequest sessionPracticeExamSyncRequest = this.$request;
                this.L$0 = flowCollector;
                this.label = 1;
                obj = apiService.sendSessionPracticeExamRequest(sessionPracticeExamSyncRequest, this);
            } else {
                response = null;
                if (response != null) {
                    ApiResult.Failure failure = new ApiResult.Failure(500, new Exception("Unknown error"));
                    this.L$0 = null;
                    this.label = 4;
                } else {
                    if (response.isSuccessful()) {
                        if (response.body() != null) {
                            Object body = response.body();
                            Intrinsics.checkNotNull(body);
                            SessionPracticeExamResponse sessionPracticeExamResponse = (SessionPracticeExamResponse) body;
                            sessionPracticeExamResponse.setUrl(response.raw().request().url().url().toString());
                            ApiResult.Success success = new ApiResult.Success(response.code(), sessionPracticeExamResponse);
                            this.L$0 = flowCollector;
                            this.label = 2;
                        }
                        return Unit.INSTANCE;
                    }
                    ResponseBody errorBody = response.errorBody();
                    String string = null;
                    try { if (errorBody != null) string = errorBody.string(); } catch (java.io.IOException ignored) {}
                    ResponseBody errorBody2 = response.errorBody();
                    if (errorBody2 != null) {
                        errorBody2.close();
                    }
                    ApiResult.Failure failure2 = new ApiResult.Failure(response.code(), new Exception(string));
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
    public final Object invoke2(FlowCollector<? super ApiResult<SessionPracticeExamResponse>> flowCollector, Continuation<? super Unit> continuation) {
        return ((SessionRepository$sendSessionPracticeRequest$1) (Object) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
