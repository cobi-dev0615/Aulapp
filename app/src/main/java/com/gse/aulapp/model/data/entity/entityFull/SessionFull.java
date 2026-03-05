package com.gse.aulapp.model.data.entity.entityFull;

import com.gse.aulapp.model.data.entity.ClassRoomEntity;
import com.gse.aulapp.model.data.entity.LessonEntity;
import com.gse.aulapp.model.data.entity.SessionEntity;
import com.gse.aulapp.model.data.entity.StepProcessSessionEntity;
import com.gse.aulapp.model.data.entity.VehicleEntity;
import com.karumi.dexter.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/gse/aulapp/model/data/entity/entityFull/SessionFull;", BuildConfig.FLAVOR, "<init>", "()V", "session", "Lcom/gse/aulapp/model/data/entity/SessionEntity;", "getSession", "()Lcom/gse/aulapp/model/data/entity/SessionEntity;", "setSession", "(Lcom/gse/aulapp/model/data/entity/SessionEntity;)V", "vehicle", "Lcom/gse/aulapp/model/data/entity/VehicleEntity;", "getVehicle", "()Lcom/gse/aulapp/model/data/entity/VehicleEntity;", "setVehicle", "(Lcom/gse/aulapp/model/data/entity/VehicleEntity;)V", "lesson", "Lcom/gse/aulapp/model/data/entity/LessonEntity;", "getLesson", "()Lcom/gse/aulapp/model/data/entity/LessonEntity;", "setLesson", "(Lcom/gse/aulapp/model/data/entity/LessonEntity;)V", "classRoom", "Lcom/gse/aulapp/model/data/entity/ClassRoomEntity;", "getClassRoom", "()Lcom/gse/aulapp/model/data/entity/ClassRoomEntity;", "setClassRoom", "(Lcom/gse/aulapp/model/data/entity/ClassRoomEntity;)V", "listStepStatus", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/data/entity/StepProcessSessionEntity;", "getListStepStatus", "()Ljava/util/List;", "setListStepStatus", "(Ljava/util/List;)V", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SessionFull {
    private ClassRoomEntity classRoom;
    private LessonEntity lesson;
    private List<StepProcessSessionEntity> listStepStatus = CollectionsKt.emptyList();
    private SessionEntity session;
    private VehicleEntity vehicle;

    public final ClassRoomEntity getClassRoom() {
        return this.classRoom;
    }

    public final LessonEntity getLesson() {
        return this.lesson;
    }

    public final List<StepProcessSessionEntity> getListStepStatus() {
        return this.listStepStatus;
    }

    public final SessionEntity getSession() {
        return this.session;
    }

    public final VehicleEntity getVehicle() {
        return this.vehicle;
    }

    public final void setClassRoom(ClassRoomEntity classRoomEntity) {
        this.classRoom = classRoomEntity;
    }

    public final void setLesson(LessonEntity lessonEntity) {
        this.lesson = lessonEntity;
    }

    public final void setListStepStatus(List<StepProcessSessionEntity> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.listStepStatus = list;
    }

    public final void setSession(SessionEntity sessionEntity) {
        this.session = sessionEntity;
    }

    public final void setVehicle(VehicleEntity vehicleEntity) {
        this.vehicle = vehicleEntity;
    }
}
