package com.gse.aulapp.util;

import androidx.work.Constraints;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import com.karumi.dexter.BuildConfig;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/gse/aulapp/util/WorkManagerUtil;", BuildConfig.FLAVOR, "workManager", "Landroidx/work/WorkManager;", "<init>", "(Landroidx/work/WorkManager;)V", "runTask", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWorkManagerUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkManagerUtil.kt\ncom/gse/aulapp/util/WorkManagerUtil\n+ 2 PeriodicWorkRequest.kt\nandroidx/work/PeriodicWorkRequestKt\n*L\n1#1,174:1\n33#2:175\n*S KotlinDebug\n*F\n+ 1 WorkManagerUtil.kt\ncom/gse/aulapp/util/WorkManagerUtil\n*L\n41#1:175\n*E\n"})
/* loaded from: classes.dex */
public final class WorkManagerUtil {
    private final WorkManager workManager;

    public WorkManagerUtil(WorkManager workManager) {
        Intrinsics.checkNotNullParameter(workManager, "workManager");
        this.workManager = workManager;
    }

    public final void runTask() {
        long calculateDesiredTimeMillis;
        Constraints build = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        PeriodicWorkRequest.Builder constraints = new PeriodicWorkRequest.Builder(SyncDataWorker.class, 24L, TimeUnit.HOURS).setConstraints(build);
        calculateDesiredTimeMillis = WorkManagerUtilKt.calculateDesiredTimeMillis(21, 0);
        PeriodicWorkRequest build2 = constraints.setInitialDelay(calculateDesiredTimeMillis, TimeUnit.MILLISECONDS).build();
        Intrinsics.checkNotNullExpressionValue(build2, "build(...)");
        this.workManager.enqueueUniquePeriodicWork("SyncDataWorker", ExistingPeriodicWorkPolicy.REPLACE, build2);
    }
}
