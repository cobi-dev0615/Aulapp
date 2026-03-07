package com.gse.aulapp.model.dao;

import androidx.sqlite.db.SimpleSQLiteQuery;
import com.gse.aulapp.model.data.entity.GpsTraceEntity;
import com.karumi.dexter.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H§@¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\r\u0010\u0007J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/gse/aulapp/model/dao/GpsDao;", BuildConfig.FLAVOR, "Landroidx/sqlite/db/SimpleSQLiteQuery;", "query", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/data/entity/GpsTraceEntity;", "getAllGpsTraceCustom", "(Landroidx/sqlite/db/SimpleSQLiteQuery;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "gpsTrace", BuildConfig.FLAVOR, "saveGpsTrace", "(Lcom/gse/aulapp/model/data/entity/GpsTraceEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", BuildConfig.FLAVOR, "getSpeedCustom", BuildConfig.FLAVOR, "sessionID", BuildConfig.FLAVOR, "deleteGpsTraceBySessionID", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface GpsDao {
    Object deleteGpsTraceBySessionID(String str, Continuation continuation);

    Object getAllGpsTraceCustom(SimpleSQLiteQuery simpleSQLiteQuery, Continuation<? super List<GpsTraceEntity>> continuation);

    Object getSpeedCustom(SimpleSQLiteQuery simpleSQLiteQuery, Continuation continuation);

    Object saveGpsTrace(GpsTraceEntity gpsTraceEntity, Continuation continuation);
}
