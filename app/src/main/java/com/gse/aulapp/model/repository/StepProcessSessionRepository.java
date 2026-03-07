package com.gse.aulapp.model.repository;

import androidx.sqlite.db.SimpleSQLiteQuery;
import com.gse.aulapp.model.dao.StepProcessSessionDao;
import com.gse.aulapp.model.data.entity.StepProcessSessionEntity;
import com.gse.aulapp.model.enumerate.EnumIdStepperMenu;
import com.gse.aulapp.model.enumerate.EnumStatusStepSession;
import com.karumi.dexter.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010\u0010J$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010\u0014J\u0016\u0010\u0015\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/gse/aulapp/model/repository/StepProcessSessionRepository;", BuildConfig.FLAVOR, "dao", "Lcom/gse/aulapp/model/dao/StepProcessSessionDao;", "<init>", "(Lcom/gse/aulapp/model/dao/StepProcessSessionDao;)V", "saveUpdateStepProcessSession", BuildConfig.FLAVOR, "sessionID", BuildConfig.FLAVOR, "type", "Lcom/gse/aulapp/model/enumerate/EnumIdStepperMenu;", "status", "Lcom/gse/aulapp/model/enumerate/EnumStatusStepSession;", "isEntry", BuildConfig.FLAVOR, "(Ljava/lang/String;Lcom/gse/aulapp/model/enumerate/EnumIdStepperMenu;Lcom/gse/aulapp/model/enumerate/EnumStatusStepSession;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllStepBySessionID", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/data/entity/StepProcessSessionEntity;", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeSessionBySessionID", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
@SuppressWarnings({"unchecked", "rawtypes"})
public final class StepProcessSessionRepository {
    private final StepProcessSessionDao dao;

    public StepProcessSessionRepository(StepProcessSessionDao dao) {
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.dao = dao;
    }

    public final Object getAllStepBySessionID(String str, boolean z, Continuation<? super List<StepProcessSessionEntity>> continuation) {
        return this.dao.getStepCustom(new SimpleSQLiteQuery("SELECT * FROM stepProcessSession s where s.sessionID = ? and s.isEntry = ?", new Object[]{str, Boxing.boxInt(z ? 1 : 0)}), continuation);
    }

    public final Object removeSessionBySessionID(String str, Continuation continuation) {
        Object deleteSessionsOfSessionId = this.dao.deleteSessionsOfSessionId(str, continuation);
        return deleteSessionsOfSessionId == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? deleteSessionsOfSessionId : Unit.INSTANCE;
    }

    public final Object saveUpdateStepProcessSession(String str, EnumIdStepperMenu enumIdStepperMenu, EnumStatusStepSession enumStatusStepSession, boolean z, Continuation continuation) {
        Object saveUpdateStep = this.dao.saveUpdateStep(new StepProcessSessionEntity(str, EnumIdStepperMenu.name$default(enumIdStepperMenu, null, 1, null), enumStatusStepSession.name(), z), (Continuation) continuation);
        return saveUpdateStep == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? saveUpdateStep : Unit.INSTANCE;
    }
}
