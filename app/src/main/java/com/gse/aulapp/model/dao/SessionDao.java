package com.gse.aulapp.model.dao;

import androidx.sqlite.db.SimpleSQLiteQuery;
import com.gse.aulapp.model.data.entity.ClassRoomEntity;
import com.gse.aulapp.model.data.entity.LessonEntity;
import com.gse.aulapp.model.data.entity.SessionEntity;
import com.gse.aulapp.model.data.entity.VehicleEntity;
import com.gse.aulapp.model.data.entity.entityFull.SessionFull;
import com.gse.aulapp.model.data.entity.entityFull.SessionFullSync;
import com.gse.aulapp.model.response.QuestionPracticeExam;
import com.karumi.dexter.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H§@¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001e\u0010\u0007J\u0018\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001f\u0010\u0007J\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b \u0010\u0007J\u001e\u0010#\u001a\u00020\"2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H§@¢\u0006\u0004\b#\u0010\u000bJ\u0018\u0010%\u001a\u00020\"2\u0006\u0010$\u001a\u00020\bH§@¢\u0006\u0004\b%\u0010&J\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b'\u0010\u0007J\u001a\u0010(\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b(\u0010\u0007J\u0018\u0010)\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b)\u0010\u0007J\u001e\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b+\u0010\u0007J\u0018\u0010,\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b,\u0010\u0007J\u0018\u0010-\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b-\u0010\u0007J\u0018\u0010.\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b.\u0010\u0007¨\u0006/"}, d2 = {"Lcom/gse/aulapp/model/dao/SessionDao;", BuildConfig.FLAVOR, "Landroidx/sqlite/db/SimpleSQLiteQuery;", "query", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/data/entity/entityFull/SessionFull;", "getAllSessionCustom", "(Landroidx/sqlite/db/SimpleSQLiteQuery;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", BuildConfig.FLAVOR, "listType", "getAllSessionByType", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/gse/aulapp/model/data/entity/SessionEntity;", "session", BuildConfig.FLAVOR, "saveSession", "(Lcom/gse/aulapp/model/data/entity/SessionEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/gse/aulapp/model/data/entity/VehicleEntity;", "vehicle", "saveVehicle", "(Lcom/gse/aulapp/model/data/entity/VehicleEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/gse/aulapp/model/data/entity/LessonEntity;", "lesson", "saveLesson", "(Lcom/gse/aulapp/model/data/entity/LessonEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/gse/aulapp/model/data/entity/ClassRoomEntity;", "classRoom", "saveClassRoom", "(Lcom/gse/aulapp/model/data/entity/ClassRoomEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/gse/aulapp/model/data/entity/entityFull/SessionFullSync;", "getSessionCustomSync", "deleteSessionCustom", "getIdSessionCustom", "listId", BuildConfig.FLAVOR, "deleteSessionById", "date", "deleteSessionsByDate", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllSessionCustomSync", "updateSessionBySessionId", "getCountSessionIsPending", "Lcom/gse/aulapp/model/response/QuestionPracticeExam;", "getAllQuestionBySessionId", "getStartEntryClassBySessionId", "getEndEntryClassBySessionId", "updateDateStartEntry", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SessionDao {
    Object deleteSessionById(List<String> list, Continuation<? super Integer> continuation);

    Object deleteSessionCustom(SimpleSQLiteQuery simpleSQLiteQuery, Continuation<? super Long> continuation);

    Object deleteSessionsByDate(String str, Continuation<? super Integer> continuation);

    Object getAllQuestionBySessionId(SimpleSQLiteQuery simpleSQLiteQuery, Continuation<? super List<QuestionPracticeExam>> continuation);

    Object getAllSessionByType(List<String> list, Continuation<? super List<SessionFull>> continuation);

    Object getAllSessionCustom(SimpleSQLiteQuery simpleSQLiteQuery, Continuation<? super List<SessionFull>> continuation);

    Object getAllSessionCustomSync(SimpleSQLiteQuery simpleSQLiteQuery, Continuation<? super List<SessionFullSync>> continuation);

    Object getCountSessionIsPending(SimpleSQLiteQuery simpleSQLiteQuery, Continuation<? super Long> continuation);

    Object getEndEntryClassBySessionId(SimpleSQLiteQuery simpleSQLiteQuery, Continuation<? super Long> continuation);

    Object getIdSessionCustom(SimpleSQLiteQuery simpleSQLiteQuery, Continuation<? super List<String>> continuation);

    Object getSessionCustomSync(SimpleSQLiteQuery simpleSQLiteQuery, Continuation<? super SessionFullSync> continuation);

    Object getStartEntryClassBySessionId(SimpleSQLiteQuery simpleSQLiteQuery, Continuation<? super Long> continuation);

    Object saveClassRoom(ClassRoomEntity classRoomEntity, Continuation<? super Long> continuation);

    Object saveLesson(LessonEntity lessonEntity, Continuation<? super Long> continuation);

    Object saveSession(SessionEntity sessionEntity, Continuation<? super Long> continuation);

    Object saveVehicle(VehicleEntity vehicleEntity, Continuation<? super Long> continuation);

    Object updateDateStartEntry(SimpleSQLiteQuery simpleSQLiteQuery, Continuation<? super String> continuation);

    Object updateSessionBySessionId(SimpleSQLiteQuery simpleSQLiteQuery, Continuation<? super Long> continuation);
}
