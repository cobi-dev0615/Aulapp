package com.gse.aulapp.model.dao;

import androidx.sqlite.db.SimpleSQLiteQuery;
import com.gse.aulapp.model.data.entity.StepProcessSessionEntity;
import com.karumi.dexter.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\t\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH§@¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/gse/aulapp/model/dao/StepProcessSessionDao;", BuildConfig.FLAVOR, "saveUpdateStep", BuildConfig.FLAVOR, "step", "Lcom/gse/aulapp/model/data/entity/StepProcessSessionEntity;", "(Lcom/gse/aulapp/model/data/entity/StepProcessSessionEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStepCustom", BuildConfig.FLAVOR, "query", "Landroidx/sqlite/db/SimpleSQLiteQuery;", "(Landroidx/sqlite/db/SimpleSQLiteQuery;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSessionsOfSessionId", BuildConfig.FLAVOR, "sessionId", BuildConfig.FLAVOR, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface StepProcessSessionDao {
    Object deleteSessionsOfSessionId(String str, Continuation<? super Unit> continuation);

    Object getStepCustom(SimpleSQLiteQuery simpleSQLiteQuery, Continuation<? super List<StepProcessSessionEntity>> continuation);

    Object saveUpdateStep(StepProcessSessionEntity stepProcessSessionEntity, Continuation<? super Long> continuation);
}
