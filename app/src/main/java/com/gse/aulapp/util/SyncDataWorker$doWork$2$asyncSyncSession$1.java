package com.gse.aulapp.util;

import com.gse.aulapp.model.repository.SessionRepository;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.util.SyncDataWorker$doWork$2$asyncSyncSession$1", f = "WorkManagerUtil.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class SyncDataWorker$doWork$2$asyncSyncSession$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    int label;
    final /* synthetic */ SyncDataWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncDataWorker$doWork$2$asyncSyncSession$1(SyncDataWorker syncDataWorker, Continuation continuation) {
        super(2, continuation);
        this.this$0 = syncDataWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SyncDataWorker$doWork$2$asyncSyncSession$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SessionRepository sessionRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        sessionRepository = this.this$0.sessionRepository;
        this.label = 1;
        Object initSessionSyncPending = sessionRepository.initSessionSyncPending(this);
        return initSessionSyncPending == coroutine_suspended ? coroutine_suspended : initSessionSyncPending;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SyncDataWorker$doWork$2$asyncSyncSession$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
