package com.gse.aulapp.model.repository;

import android.content.Context;
import com.gse.aulapp.io.ReceptionsAdapter;
import com.gse.aulapp.io.ReceptionsApiService;
import com.gse.aulapp.model.request.SessionPracticeSyncRequest;
import com.gse.aulapp.model.response.SessionPracticeExamResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import retrofit2.Response;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Deferred;", "Lretrofit2/Response;", "Lcom/gse/aulapp/model/response/SessionPracticeExamResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.model.repository.SessionRepository$sendSessionPracticeAndSyncPracticalRequest$response$1", f = "SessionRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class SessionRepository$sendSessionPracticeAndSyncPracticalRequest$response$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Deferred<? extends Response<SessionPracticeExamResponse>>>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ SessionPracticeSyncRequest $practiceRequest;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/gse/aulapp/model/response/SessionPracticeExamResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.gse.aulapp.model.repository.SessionRepository$sendSessionPracticeAndSyncPracticalRequest$response$1$1", f = "SessionRepository.kt", i = {}, l = {427}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.gse.aulapp.model.repository.SessionRepository$sendSessionPracticeAndSyncPracticalRequest$response$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<SessionPracticeExamResponse>>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ SessionPracticeSyncRequest $practiceRequest;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, SessionPracticeSyncRequest sessionPracticeSyncRequest, Continuation<?> continuation) {
            super(2, (Continuation<Object>) continuation);
            this.$context = context;
            this.$practiceRequest = sessionPracticeSyncRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation<?> continuation) {
            return (Continuation<Unit>) (Object) new AnonymousClass1(this.$context, this.$practiceRequest, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ReceptionsApiService apiService = ReceptionsAdapter.INSTANCE.getApiService(this.$context);
                if (apiService == null) {
                    return null;
                }
                SessionPracticeSyncRequest sessionPracticeSyncRequest = this.$practiceRequest;
                this.label = 1;
                obj = apiService.sendSessionPracticeRequest(sessionPracticeSyncRequest, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return (Response) obj;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Response<SessionPracticeExamResponse>> continuation) {
            return ((AnonymousClass1) (Object) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionRepository$sendSessionPracticeAndSyncPracticalRequest$response$1(Context context, SessionPracticeSyncRequest sessionPracticeSyncRequest, Continuation continuation) {
        super(2, (Continuation<Object>) continuation);
        this.$context = context;
        this.$practiceRequest = sessionPracticeSyncRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation<?> continuation) {
        SessionRepository$sendSessionPracticeAndSyncPracticalRequest$response$1 sessionRepository$sendSessionPracticeAndSyncPracticalRequest$response$1 = new SessionRepository$sendSessionPracticeAndSyncPracticalRequest$response$1(this.$context, this.$practiceRequest, (Continuation) continuation);
        sessionRepository$sendSessionPracticeAndSyncPracticalRequest$response$1.L$0 = obj;
        return (Continuation<Unit>) (Object) sessionRepository$sendSessionPracticeAndSyncPracticalRequest$response$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Deferred<? extends Response<SessionPracticeExamResponse>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Deferred<Response<SessionPracticeExamResponse>>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Deferred async$default;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        async$default = BuildersKt.async((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$context, this.$practiceRequest, null));
        return async$default;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Deferred<Response<SessionPracticeExamResponse>>> continuation) {
        return ((SessionRepository$sendSessionPracticeAndSyncPracticalRequest$response$1) (Object) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
