package com.gse.aulapp.model.data.entity.entityFull;

import com.gse.aulapp.model.data.entity.GpsTraceEntity;
import com.gse.aulapp.model.data.entity.QuestionApprovedEntity;
import com.gse.aulapp.model.data.entity.SessionEntity;
import com.karumi.dexter.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/gse/aulapp/model/data/entity/entityFull/SessionFullSync;", BuildConfig.FLAVOR, "<init>", "()V", "Lcom/gse/aulapp/model/data/entity/SessionEntity;", "session", "Lcom/gse/aulapp/model/data/entity/SessionEntity;", "getSession", "()Lcom/gse/aulapp/model/data/entity/SessionEntity;", "setSession", "(Lcom/gse/aulapp/model/data/entity/SessionEntity;)V", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/data/entity/QuestionApprovedEntity;", "listQuestion", "Ljava/util/List;", "getListQuestion", "()Ljava/util/List;", "setListQuestion", "(Ljava/util/List;)V", "Lcom/gse/aulapp/model/data/entity/GpsTraceEntity;", "listGpsTrace", "getListGpsTrace", "setListGpsTrace", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SessionFullSync {
    private SessionEntity session;
    private List<QuestionApprovedEntity> listQuestion = CollectionsKt.emptyList();
    private List<GpsTraceEntity> listGpsTrace = CollectionsKt.emptyList();

    public final List<GpsTraceEntity> getListGpsTrace() {
        return this.listGpsTrace;
    }

    public final SessionEntity getSession() {
        return this.session;
    }

    public final void setListGpsTrace(List<GpsTraceEntity> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.listGpsTrace = list;
    }

    public final void setListQuestion(List<QuestionApprovedEntity> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.listQuestion = list;
    }

    public final void setSession(SessionEntity sessionEntity) {
        this.session = sessionEntity;
    }
}
