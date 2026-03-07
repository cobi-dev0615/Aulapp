package com.gse.aulapp.model.repository;

import android.content.Context;
import com.gse.aulapp.io.ReceptionsAdapter;
import com.gse.aulapp.io.ReceptionsApiService;
import com.gse.aulapp.model.data.statusControl.ApiResult;
import com.gse.aulapp.model.request.SessionSyncPracticalRequest;
import com.gse.aulapp.model.response.SessionSyncPracticalResponse;
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

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/gse/aulapp/model/data/statusControl/ApiResult;", "Lcom/gse/aulapp/model/response/SessionSyncPracticalResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.model.repository.SessionRepository$sendSessionSyncPracticalRequest2$1", f = "SessionRepository.kt", i = {0, 1, 2}, l = {580, 586, 596, 603}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes.dex */
public final class SessionRepository$sendSessionSyncPracticalRequest2$1 extends SuspendLambda implements Function2<FlowCollector<? super ApiResult<? extends SessionSyncPracticalResponse>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ SessionSyncPracticalRequest $request;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SessionRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionRepository$sendSessionSyncPracticalRequest2$1(Context context, SessionSyncPracticalRequest sessionSyncPracticalRequest, SessionRepository sessionRepository, Continuation<? super SessionRepository$sendSessionSyncPracticalRequest2$1> continuation) {
        super(2, (Continuation<Object>) continuation);
        this.$context = context;
        this.$request = sessionSyncPracticalRequest;
        this.this$0 = sessionRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SessionRepository$sendSessionSyncPracticalRequest2$1 sessionRepository$sendSessionSyncPracticalRequest2$1 = new SessionRepository$sendSessionSyncPracticalRequest2$1(this.$context, this.$request, this.this$0, (Continuation) continuation);
        sessionRepository$sendSessionSyncPracticalRequest2$1.L$0 = obj;
        return (Continuation<Unit>) (Object) sessionRepository$sendSessionSyncPracticalRequest2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super ApiResult<? extends SessionSyncPracticalResponse>> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super ApiResult<SessionSyncPracticalResponse>>) flowCollector, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d4, code lost:
    
        if (r1.emit(r9, r8) == r0) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d A[Catch: Exception -> 0x001a, TryCatch #0 {Exception -> 0x001a, blocks: (B:8:0x0015, B:17:0x0033, B:18:0x0057, B:20:0x005d, B:22:0x0063, B:24:0x006b, B:28:0x0092, B:30:0x0098, B:31:0x009c, B:33:0x00a2, B:34:0x00a5, B:37:0x00be, B:40:0x003f, B:42:0x0049), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be A[Catch: Exception -> 0x001a, TRY_LEAVE, TryCatch #0 {Exception -> 0x001a, blocks: (B:8:0x0015, B:17:0x0033, B:18:0x0057, B:20:0x005d, B:22:0x0063, B:24:0x006b, B:28:0x0092, B:30:0x0098, B:31:0x009c, B:33:0x00a2, B:34:0x00a5, B:37:0x00be, B:40:0x003f, B:42:0x0049), top: B:2:0x000b }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Response response;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Exception e) {
            this.this$0.getTag();
            e.getMessage();
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            ReceptionsApiService apiService = ReceptionsAdapter.INSTANCE.getApiService(this.$context);
            if (apiService == null) {
                response = null;
                if (response == null) {
                    if (response.isSuccessful()) {
                        SessionSyncPracticalResponse sessionSyncPracticalResponse = (SessionSyncPracticalResponse) response.body();
                        if (sessionSyncPracticalResponse != null) {
                            sessionSyncPracticalResponse.setUrl(response.raw().request().url().url().toString());
                            ApiResult.Success success = new ApiResult.Success(response.code(), sessionSyncPracticalResponse);
                            this.L$0 = flowCollector;
                            this.label = 2;
                            if (flowCollector.emit(success, this) == coroutine_suspended) {
                            }
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
                    ApiResult.Failure failure = new ApiResult.Failure(response.code(), new Exception(string));
                    this.L$0 = flowCollector;
                    this.label = 3;
                    if (flowCollector.emit(failure, this) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                }
                ApiResult.Failure failure2 = new ApiResult.Failure(500, new Exception("Unknown error"));
                this.L$0 = null;
                this.label = 4;
                return coroutine_suspended;
            }
            SessionSyncPracticalRequest sessionSyncPracticalRequest = this.$request;
            this.L$0 = flowCollector;
            this.label = 1;
            obj = apiService.syncSessionPractical(sessionSyncPracticalRequest, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                } else if (i == 3) {
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
        if (response == null) {
        }
        return coroutine_suspended;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super ApiResult<SessionSyncPracticalResponse>> flowCollector, Continuation<? super Unit> continuation) {
        return ((SessionRepository$sendSessionSyncPracticalRequest2$1) (Object) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
