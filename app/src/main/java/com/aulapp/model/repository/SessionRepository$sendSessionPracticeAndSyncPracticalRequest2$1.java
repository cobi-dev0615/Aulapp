package com.gse.aulapp.model.repository;

import android.content.Context;
import com.gse.aulapp.model.data.statusControl.ApiResult;
import com.gse.aulapp.model.request.SessionPracticeExamSyncRequest;
import com.gse.aulapp.model.request.SessionSyncPracticalRequest;
import com.gse.aulapp.model.response.SessionPracticeExamResponse;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/gse/aulapp/model/data/statusControl/ApiResult;", "Lcom/gse/aulapp/model/response/SessionPracticeExamResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.model.repository.SessionRepository$sendSessionPracticeAndSyncPracticalRequest2$1", f = "SessionRepository.kt", i = {0, 1, 2, 2}, l = {506, 507, ConstantsKt.MINIMUM_BLOCK_SIZE, 515, 519, 522, 527, 530}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "practiceResult"}, s = {"L$0", "L$0", "L$0", "L$1"})
/* loaded from: classes.dex */
public final class SessionRepository$sendSessionPracticeAndSyncPracticalRequest2$1 extends SuspendLambda implements Function2<FlowCollector<? super ApiResult<? extends SessionPracticeExamResponse>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $sessionID;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SessionRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionRepository$sendSessionPracticeAndSyncPracticalRequest2$1(SessionRepository sessionRepository, String str, Context context, Continuation<? super SessionRepository$sendSessionPracticeAndSyncPracticalRequest2$1> continuation) {
        super(2, continuation);
        this.this$0 = sessionRepository;
        this.$sessionID = str;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SessionRepository$sendSessionPracticeAndSyncPracticalRequest2$1 sessionRepository$sendSessionPracticeAndSyncPracticalRequest2$1 = new SessionRepository$sendSessionPracticeAndSyncPracticalRequest2$1(this.this$0, this.$sessionID, this.$context, continuation);
        sessionRepository$sendSessionPracticeAndSyncPracticalRequest2$1.L$0 = obj;
        return sessionRepository$sendSessionPracticeAndSyncPracticalRequest2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super ApiResult<? extends SessionPracticeExamResponse>> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super ApiResult<SessionPracticeExamResponse>>) flowCollector, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00af, code lost:
    
        if (r3.emit(r1, r6) == r0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c1, code lost:
    
        if (r3.emit(r1, r6) == r0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d1, code lost:
    
        if (r3.emit(r1, r6) == r0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009b, code lost:
    
        if (r7 == r0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e7, code lost:
    
        if (r3.emit(r1, r6) == r0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f6, code lost:
    
        if (r3.emit(r1, r6) == r0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0061, code lost:
    
        if (r7 == r0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x004a, code lost:
    
        if (r7 == r0) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Flow sendSessionPracticeRequest;
        FlowCollector flowCollector2;
        ApiResult apiResult;
        Flow sendSessionSyncPracticalRequest2;
        SessionPracticeExamResponse.Result result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                SessionRepository sessionRepository = this.this$0;
                String str = this.$sessionID;
                this.L$0 = flowCollector;
                this.label = 1;
                obj = sessionRepository.examRequest(str, this);
                break;
            case 1:
                flowCollector = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                sendSessionPracticeRequest = this.this$0.sendSessionPracticeRequest(this.$context, (SessionPracticeExamSyncRequest) obj);
                this.L$0 = flowCollector;
                this.label = 2;
                obj = FlowKt.firstOrNull(sendSessionPracticeRequest, this);
                break;
            case 2:
                flowCollector = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                flowCollector2 = flowCollector;
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    SessionPracticeExamResponse sessionPracticeExamResponse = (SessionPracticeExamResponse) ((ApiResult.Success) apiResult).getData();
                    sendSessionSyncPracticalRequest2 = this.this$0.sendSessionSyncPracticalRequest2(this.$context, new SessionSyncPracticalRequest((sessionPracticeExamResponse == null || (result = sessionPracticeExamResponse.getResult()) == null) ? null : result.getDataID()));
                    this.L$0 = flowCollector2;
                    this.L$1 = apiResult;
                    this.label = 3;
                    obj = FlowKt.firstOrNull(sendSessionSyncPracticalRequest2, this);
                    break;
                } else if (apiResult instanceof ApiResult.Failure) {
                    this.L$0 = null;
                    this.label = 7;
                    break;
                } else {
                    if (apiResult != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.L$0 = null;
                    this.label = 8;
                    break;
                }
                return coroutine_suspended;
            case 3:
                apiResult = (ApiResult) this.L$1;
                flowCollector2 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                ApiResult apiResult2 = (ApiResult) obj;
                if (apiResult2 instanceof ApiResult.Success) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 4;
                    break;
                } else if (apiResult2 instanceof ApiResult.Failure) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 5;
                    break;
                } else {
                    if (apiResult2 != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 6;
                    break;
                }
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super ApiResult<SessionPracticeExamResponse>> flowCollector, Continuation<? super Unit> continuation) {
        return ((SessionRepository$sendSessionPracticeAndSyncPracticalRequest2$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
