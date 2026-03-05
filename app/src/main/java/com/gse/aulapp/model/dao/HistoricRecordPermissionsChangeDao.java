package com.gse.aulapp.model.dao;

import androidx.sqlite.db.SimpleSQLiteQuery;
import com.gse.aulapp.model.data.entity.HistoricRecordPermissionsChangeEntity;
import com.karumi.dexter.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\t\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/gse/aulapp/model/dao/HistoricRecordPermissionsChangeDao;", BuildConfig.FLAVOR, "saveHistoric", BuildConfig.FLAVOR, "historic", "Lcom/gse/aulapp/model/data/entity/HistoricRecordPermissionsChangeEntity;", "(Lcom/gse/aulapp/model/data/entity/HistoricRecordPermissionsChangeEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHistoricCustom", BuildConfig.FLAVOR, "query", "Landroidx/sqlite/db/SimpleSQLiteQuery;", "(Landroidx/sqlite/db/SimpleSQLiteQuery;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteHistoricCustom", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface HistoricRecordPermissionsChangeDao {
    Object deleteHistoricCustom(SimpleSQLiteQuery simpleSQLiteQuery, Continuation<? super Long> continuation);

    Object getHistoricCustom(SimpleSQLiteQuery simpleSQLiteQuery, Continuation<? super List<HistoricRecordPermissionsChangeEntity>> continuation);

    Object saveHistoric(HistoricRecordPermissionsChangeEntity historicRecordPermissionsChangeEntity, Continuation<? super Long> continuation);
}
