package com.gse.aulapp.util;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.gse.aulapp.GeneralApp;
import com.gse.aulapp.R;
import com.gse.aulapp.model.dao.HistoricRecordPermissionsChangeDao;
import com.gse.aulapp.model.dao.SessionDao;
import com.gse.aulapp.model.repository.HistoricRecordPermissionsChangeRepository;
import com.gse.aulapp.model.repository.SessionRepository;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0012\u001a\u00020\u0013H\u0096@¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/gse/aulapp/util/SyncDataWorker;", "Landroidx/work/CoroutineWorker;", "appContext", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "sessionDao", "Lcom/gse/aulapp/model/dao/SessionDao;", "sessionRepository", "Lcom/gse/aulapp/model/repository/SessionRepository;", "historicRecordPermissionsChangeDao", "Lcom/gse/aulapp/model/dao/HistoricRecordPermissionsChangeDao;", "historicRecordPermissionsChangeRepository", "Lcom/gse/aulapp/model/repository/HistoricRecordPermissionsChangeRepository;", "notificationManager", "Landroid/app/NotificationManager;", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createNotification", "Landroid/app/Notification;", "createChannel", BuildConfig.FLAVOR, "idChannel", BuildConfig.FLAVOR, "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SyncDataWorker extends CoroutineWorker {
    private final Context appContext;
    private final HistoricRecordPermissionsChangeDao historicRecordPermissionsChangeDao;
    private final HistoricRecordPermissionsChangeRepository historicRecordPermissionsChangeRepository;
    private final NotificationManager notificationManager;
    private final WorkerParameters params;
    private final SessionDao sessionDao;
    private final SessionRepository sessionRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncDataWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        this.appContext = appContext;
        this.params = params;
        GeneralApp.Companion companion = GeneralApp.INSTANCE;
        SessionDao SessionDao = companion.getDatabase().SessionDao();
        this.sessionDao = SessionDao;
        this.sessionRepository = new SessionRepository(SessionDao, appContext);
        HistoricRecordPermissionsChangeDao HistoricRecordPermissionsChangeDao = companion.getDatabase().HistoricRecordPermissionsChangeDao();
        this.historicRecordPermissionsChangeDao = HistoricRecordPermissionsChangeDao;
        this.historicRecordPermissionsChangeRepository = new HistoricRecordPermissionsChangeRepository(HistoricRecordPermissionsChangeDao);
        Object systemService = appContext.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        this.notificationManager = (NotificationManager) systemService;
    }

    private final void createChannel(String idChannel) {
        NotificationChannel notificationChannel = new NotificationChannel(idChannel, getApplicationContext().getString(R.string.name_channel_sync), 3);
        notificationChannel.setDescription(this.appContext.getString(R.string.description_channel_sync));
        this.notificationManager.createNotificationChannel(notificationChannel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Notification createNotification() {
        createChannel("sync_data_worker_channel_id");
        Notification build = new NotificationCompat.Builder(this.appContext, "sync_data_worker_channel_id").setContentTitle(this.appContext.getString(R.string.title_notification_sync)).setContentInfo(this.appContext.getString(R.string.content_notification_sync)).setContentText(this.appContext.getString(R.string.content_notification_sync)).setSmallIcon(R.drawable.ic_aulapp_notification).setOngoing(true).setVisibility(1).setPriority(1).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(Continuation<? super ListenableWorker.Result> continuation) {
        SyncDataWorker$doWork$1 syncDataWorker$doWork$1;
        int i;
        if (continuation instanceof SyncDataWorker$doWork$1) {
            syncDataWorker$doWork$1 = (SyncDataWorker$doWork$1) continuation;
            int i2 = syncDataWorker$doWork$1.label;
            if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                syncDataWorker$doWork$1.label = i2 - IntCompanionObject.MIN_VALUE;
                Object obj = syncDataWorker$doWork$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = syncDataWorker$doWork$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    SyncDataWorker$doWork$2 syncDataWorker$doWork$2 = new SyncDataWorker$doWork$2(this, null);
                    syncDataWorker$doWork$1.label = 1;
                    obj = BuildersKt.withContext(io2, syncDataWorker$doWork$2, syncDataWorker$doWork$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                return obj;
            }
        }
        syncDataWorker$doWork$1 = new SyncDataWorker$doWork$1(this, continuation);
        Object obj2 = syncDataWorker$doWork$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = syncDataWorker$doWork$1.label;
        if (i != 0) {
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "withContext(...)");
        return obj2;
    }
}
