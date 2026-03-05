package com.gse.aulapp.model.repository;

import com.gse.aulapp.model.dao.GpsDao;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/gse/aulapp/model/repository/PracticeClassRepository;", BuildConfig.FLAVOR, "gpsDao", "Lcom/gse/aulapp/model/dao/GpsDao;", "<init>", "(Lcom/gse/aulapp/model/dao/GpsDao;)V", "deleteAllQuestionBySessionID", BuildConfig.FLAVOR, "sessionID", BuildConfig.FLAVOR, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PracticeClassRepository {
    private final GpsDao gpsDao;

    public PracticeClassRepository(GpsDao gpsDao) {
        Intrinsics.checkNotNullParameter(gpsDao, "gpsDao");
        this.gpsDao = gpsDao;
    }

    public final Object deleteAllQuestionBySessionID(String str, Continuation<? super Unit> continuation) {
        Object deleteGpsTraceBySessionID = this.gpsDao.deleteGpsTraceBySessionID(str, continuation);
        return deleteGpsTraceBySessionID == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? deleteGpsTraceBySessionID : Unit.INSTANCE;
    }
}
