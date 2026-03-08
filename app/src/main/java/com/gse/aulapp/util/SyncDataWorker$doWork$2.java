package com.gse.aulapp.util;

import android.app.Notification;
import android.app.NotificationManager;
import androidx.work.ListenableWorker;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Landroidx/work/ListenableWorker$Result;", "Lkotlin/jvm/internal/EnhancedNullability;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.util.SyncDataWorker$doWork$2", f = "WorkManagerUtil.kt", i = {}, l = {99, 101}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class SyncDataWorker$doWork$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ListenableWorker.Result>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SyncDataWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncDataWorker$doWork$2(SyncDataWorker syncDataWorker, Continuation continuation) {
        super(2, continuation);
        this.this$0 = syncDataWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation<?> continuation) {
        SyncDataWorker$doWork$2 syncDataWorker$doWork$2 = new SyncDataWorker$doWork$2(this.this$0, continuation);
        syncDataWorker$doWork$2.L$0 = obj;
        return syncDataWorker$doWork$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(10000, r11) == r2) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Notification createNotification;
        NotificationManager notificationManager;
        Deferred async$default;
        Deferred async$default2;
        NotificationManager notificationManager2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                createNotification = this.this$0.createNotification();
                notificationManager = this.this$0.notificationManager;
                notificationManager.notify(100, createNotification);
                async$default = BuildersKt.async(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new SyncDataWorker$doWork$2$asyncSyncSession$1(this.this$0, null));
                async$default2 = BuildersKt.async(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new SyncDataWorker$doWork$2$asyncSyncHistory$1(this.this$0, null));
                Deferred[] deferredArr = {async$default, async$default2};
                this.label = 1;
                if (AwaitKt.awaitAll(deferredArr, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    notificationManager2 = this.this$0.notificationManager;
                    notificationManager2.cancel(100);
                    return ListenableWorker.Result.success();
                }
                ResultKt.throwOnFailure(obj);
            }
            this.label = 2;
            return coroutine_suspended;
        } catch (Exception unused) {
            return ListenableWorker.Result.failure();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ListenableWorker.Result> continuation) {
        return ((SyncDataWorker$doWork$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
