package com.gse.aulapp.model.repository;

import android.content.Context;
import android.util.Log;
import androidx.sqlite.db.SimpleSQLiteQuery;
import com.gse.aulapp.io.ReceptionsAdapter;
import com.gse.aulapp.io.ReceptionsApiService;
import com.gse.aulapp.model.dao.SessionDao;
import com.gse.aulapp.model.data.entity.ClassRoomEntity;
import com.gse.aulapp.model.data.entity.GpsTraceEntity;
import com.gse.aulapp.model.data.entity.LessonEntity;
import com.gse.aulapp.model.data.entity.SessionEntity;
import com.gse.aulapp.model.data.entity.VehicleEntity;
import com.gse.aulapp.model.data.entity.entityFull.SessionFull;
import com.gse.aulapp.model.data.entity.entityFull.SessionFullSync;
import com.gse.aulapp.model.data.statusControl.ApiResult;
import com.gse.aulapp.model.enumerate.EnumClassType;
import com.gse.aulapp.model.enumerate.EnumStatusAppointment;
import com.gse.aulapp.model.request.AssistSyncRequest;
import com.gse.aulapp.model.request.CoordinatePracticeExamRequest;
import com.gse.aulapp.model.request.HoursScheduledRequest;
import com.gse.aulapp.model.request.PracticeExamRequest;
import com.gse.aulapp.model.request.QuestionsPracticeExamRequest;
import com.gse.aulapp.model.request.RouteSyncRequest;
import com.gse.aulapp.model.request.SessionExamRequest;
import com.gse.aulapp.model.request.SessionInstructorRequest;
import com.gse.aulapp.model.request.SessionPracticeExamSyncRequest;
import com.gse.aulapp.model.request.SessionPracticeSyncRequest;
import com.gse.aulapp.model.request.SessionSyncPracticalRequest;
import com.gse.aulapp.model.request.SessionSyncRequest;
import com.gse.aulapp.model.response.HistoricRecordPermissionsChangeResponse;
import com.gse.aulapp.model.response.HoursScheduledResponse;
import com.gse.aulapp.model.response.QuestionPracticeExam;
import com.gse.aulapp.model.response.SessionExamResponse;
import com.gse.aulapp.model.response.SessionInstructorResponse;
import com.gse.aulapp.model.response.SessionPracticeExamResponse;
import com.gse.aulapp.model.response.SessionRoutesResponse;
import com.gse.aulapp.model.response.SessionSyncPracticalResponse;
import com.gse.aulapp.util.ConverterUtil;
import com.gse.aulapp.util.DateUtil;
import com.gse.aulapp.util.SummaryExamUtil;
import com.karumi.dexter.BuildConfig;
import defpackage.a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import okhttp3.ResponseBody;
import retrofit2.Response;

@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u000eJ+\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0086@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\"\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 H\u0086@¢\u0006\u0004\b\"\u0010#J\u0018\u0010&\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020$H\u0086@¢\u0006\u0004\b&\u0010'J\u0018\u0010*\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020(H\u0086@¢\u0006\u0004\b*\u0010+J \u0010/\u001a\b\u0012\u0004\u0012\u00020.0-2\b\u0010,\u001a\u0004\u0018\u00010\u001dH\u0086@¢\u0006\u0004\b/\u00100J$\u00103\u001a\b\u0012\u0004\u0012\u00020.0-2\f\u00102\u001a\b\u0012\u0004\u0012\u0002010-H\u0086@¢\u0006\u0004\b3\u00104J\u001e\u00106\u001a\b\u0012\u0004\u0012\u00020.0-2\u0006\u00105\u001a\u000201H\u0086@¢\u0006\u0004\b6\u00107J0\u0010:\u001a\u0010\u0012\u0004\u0012\u000209\u0012\u0006\u0012\u0004\u0018\u000101082\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u00105\u001a\u000201H\u0086@¢\u0006\u0004\b:\u0010;J\u0018\u0010=\u001a\u00020<2\u0006\u00105\u001a\u000201H\u0086@¢\u0006\u0004\b=\u00107J\u001e\u0010@\u001a\b\u0012\u0004\u0012\u00020?0-2\u0006\u0010>\u001a\u000201H\u0086@¢\u0006\u0004\b@\u00107J3\u0010D\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010C0\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00105\u001a\u0002012\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bD\u0010EJ-\u0010G\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010F\u0018\u00010\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00105\u001a\u000201¢\u0006\u0004\bG\u0010HJ\u0010\u0010J\u001a\u00020IH\u0086@¢\u0006\u0004\bJ\u0010KJ\u0016\u0010L\u001a\b\u0012\u0004\u0012\u0002010-H\u0086@¢\u0006\u0004\bL\u0010KJ\u0016\u0010M\u001a\b\u0012\u0004\u0012\u0002010-H\u0086@¢\u0006\u0004\bM\u0010KJ\u001e\u0010O\u001a\u00020I2\f\u0010N\u001a\b\u0012\u0004\u0012\u0002010-H\u0086@¢\u0006\u0004\bO\u00104J\u0018\u0010Q\u001a\u00020I2\u0006\u0010P\u001a\u000201H\u0086@¢\u0006\u0004\bQ\u00107J\u0010\u0010R\u001a\u000209H\u0086@¢\u0006\u0004\bR\u0010KJ&\u0010S\u001a\u0010\u0012\u0004\u0012\u000209\u0012\u0006\u0012\u0004\u0018\u000101082\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\bS\u0010TJ \u0010V\u001a\u00020\u001d2\u0006\u0010U\u001a\u0002012\u0006\u00105\u001a\u000201H\u0086@¢\u0006\u0004\bV\u0010WJ \u0010X\u001a\u00020I2\u0006\u0010P\u001a\u00020\u001d2\u0006\u00105\u001a\u000201H\u0086@¢\u0006\u0004\bX\u0010YJ\"\u0010Z\u001a\u0004\u0018\u00010\u001d2\u0006\u0010P\u001a\u00020\u001d2\u0006\u00105\u001a\u000201H\u0086@¢\u0006\u0004\bZ\u0010YJ\u001a\u0010[\u001a\u0004\u0018\u00010\u001d2\u0006\u00105\u001a\u000201H\u0086@¢\u0006\u0004\b[\u00107J\u0010\u0010\\\u001a\u00020\u001dH\u0086@¢\u0006\u0004\b\\\u0010KJ\u0018\u0010]\u001a\u00020\u001d2\u0006\u00105\u001a\u000201H\u0086@¢\u0006\u0004\b]\u00107J\u0018\u0010^\u001a\u00020\u001d2\u0006\u00105\u001a\u000201H\u0086@¢\u0006\u0004\b^\u00107J \u0010`\u001a\u00020I2\u0006\u0010_\u001a\u0002012\u0006\u0010>\u001a\u000201H\u0086@¢\u0006\u0004\b`\u0010WJ.\u0010b\u001a\u0010\u0012\u0004\u0012\u000209\u0012\u0006\u0012\u0004\u0018\u000101082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010a\u001a\u00020<H\u0082@¢\u0006\u0004\bb\u0010cJ.\u0010e\u001a\u0010\u0012\u0004\u0012\u000209\u0012\u0006\u0012\u0004\u0018\u000101082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010a\u001a\u00020dH\u0082@¢\u0006\u0004\be\u0010fJ-\u0010g\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010F0\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020<H\u0002¢\u0006\u0004\bg\u0010hJ-\u0010k\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010j0\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020iH\u0002¢\u0006\u0004\bk\u0010lJ(\u0010n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010j0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010m\u001a\u00020iH\u0082@¢\u0006\u0004\bn\u0010oJ%\u0010s\u001a\u00020<2\u0006\u0010q\u001a\u00020p2\f\u0010r\u001a\b\u0012\u0004\u0012\u00020?0-H\u0002¢\u0006\u0004\bs\u0010tJ\u0017\u0010a\u001a\u00020d2\u0006\u0010q\u001a\u00020pH\u0002¢\u0006\u0004\ba\u0010uJ\u0018\u0010v\u001a\u00020p2\u0006\u00105\u001a\u000201H\u0082@¢\u0006\u0004\bv\u00107J\u0016\u0010w\u001a\b\u0012\u0004\u0012\u00020p0-H\u0082@¢\u0006\u0004\bw\u0010KR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010xR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010yR\u0017\u0010z\u001a\u0002018\u0006¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}¨\u0006~"}, d2 = {"Lcom/gse/aulapp/model/repository/SessionRepository;", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/dao/SessionDao;", "sessionDao", "Landroid/content/Context;", "context", "<init>", "(Lcom/gse/aulapp/model/dao/SessionDao;Landroid/content/Context;)V", "Lcom/gse/aulapp/model/request/SessionInstructorRequest;", "request", "Lkotlinx/coroutines/flow/Flow;", "Lcom/gse/aulapp/model/data/statusControl/ApiResult;", "Lcom/gse/aulapp/model/response/SessionInstructorResponse;", "getSessionApi", "(Landroid/content/Context;Lcom/gse/aulapp/model/request/SessionInstructorRequest;)Lkotlinx/coroutines/flow/Flow;", "Lcom/gse/aulapp/model/request/SessionExamRequest;", "sessionExamRequest", "Lcom/gse/aulapp/model/response/SessionExamResponse;", "getSessionDataApi", "(Landroid/content/Context;Lcom/gse/aulapp/model/request/SessionExamRequest;)Lkotlinx/coroutines/flow/Flow;", "sessionInstructorRequest", "Lcom/gse/aulapp/model/response/SessionRoutesResponse;", "getSessionsRoute", "Lcom/gse/aulapp/model/request/HoursScheduledRequest;", "Lcom/gse/aulapp/model/response/HoursScheduledResponse;", "getHoursScheduled", "(Landroid/content/Context;Lcom/gse/aulapp/model/request/HoursScheduledRequest;)Lkotlinx/coroutines/flow/Flow;", "Lcom/gse/aulapp/model/data/entity/SessionEntity;", "session", BuildConfig.FLAVOR, "saveSession", "(Lcom/gse/aulapp/model/data/entity/SessionEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/gse/aulapp/model/data/entity/VehicleEntity;", "vehicle", "saveVehicle", "(Lcom/gse/aulapp/model/data/entity/VehicleEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/gse/aulapp/model/data/entity/LessonEntity;", "lesson", "saveLesson", "(Lcom/gse/aulapp/model/data/entity/LessonEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/gse/aulapp/model/data/entity/ClassRoomEntity;", "classRoomEntity", "saveClassRoom", "(Lcom/gse/aulapp/model/data/entity/ClassRoomEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dateFilter", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/data/entity/entityFull/SessionFull;", "getAllSession", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", BuildConfig.FLAVOR, "listType", "getSessionByType", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sessionID", "getSessionById", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Pair;", BuildConfig.FLAVOR, "syncSessionProcess", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/gse/aulapp/model/request/SessionPracticeExamSyncRequest;", "examRequest", "sessionId", "Lcom/gse/aulapp/model/response/QuestionPracticeExam;", "getAllQuestionSync", "Lcom/gse/aulapp/model/enumerate/EnumStatusAppointment;", "sessionStatus", "Lcom/gse/aulapp/model/response/HistoricRecordPermissionsChangeResponse;", "sendSessionStatusAppointment", "(Landroid/content/Context;Ljava/lang/String;Lcom/gse/aulapp/model/enumerate/EnumStatusAppointment;)Lkotlinx/coroutines/flow/Flow;", "Lcom/gse/aulapp/model/response/SessionPracticeExamResponse;", "sendSessionPracticeAndSyncPracticalRequest2", "(Landroid/content/Context;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", BuildConfig.FLAVOR, "deleteLogOutSession", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSessionIdPendingSync", "getAllSessionID", "listSessionID", "deleteSessionById", "date", "deleteSessionsByDate", "initSessionSyncPending", "initAllSessionSyncPending", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isPending", "updateIsPending", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateDateEndClass", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateDateEntryClass", "updateIsFinished", "getSessionsIsPending", "getStartEntryClass", "getEndEntryClass", "dateEntryExam", "saveDateExamEntry", "practiceRequest", "sendSessionPracticeAndSyncPracticalExamRequest", "(Landroid/content/Context;Lcom/gse/aulapp/model/request/SessionPracticeExamSyncRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/gse/aulapp/model/request/SessionPracticeSyncRequest;", "sendSessionPracticeAndSyncPracticalRequest", "(Landroid/content/Context;Lcom/gse/aulapp/model/request/SessionPracticeSyncRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendSessionPracticeRequest", "(Landroid/content/Context;Lcom/gse/aulapp/model/request/SessionPracticeExamSyncRequest;)Lkotlinx/coroutines/flow/Flow;", "Lcom/gse/aulapp/model/request/SessionSyncPracticalRequest;", "Lcom/gse/aulapp/model/response/SessionSyncPracticalResponse;", "sendSessionSyncPracticalRequest2", "(Landroid/content/Context;Lcom/gse/aulapp/model/request/SessionSyncPracticalRequest;)Lkotlinx/coroutines/flow/Flow;", "syncRequest", "sendSessionSyncPracticalRequest", "(Landroid/content/Context;Lcom/gse/aulapp/model/request/SessionSyncPracticalRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/gse/aulapp/model/data/entity/entityFull/SessionFullSync;", "data", "questionFullSync", "practiceExamRequest", "(Lcom/gse/aulapp/model/data/entity/entityFull/SessionFullSync;Ljava/util/List;)Lcom/gse/aulapp/model/request/SessionPracticeExamSyncRequest;", "(Lcom/gse/aulapp/model/data/entity/entityFull/SessionFullSync;)Lcom/gse/aulapp/model/request/SessionPracticeSyncRequest;", "getSessionSyncById", "getAllSessionPendingSync", "Lcom/gse/aulapp/model/dao/SessionDao;", "Landroid/content/Context;", "tag", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSessionRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionRepository.kt\ncom/gse/aulapp/model/repository/SessionRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1017:1\n1863#2,2:1018\n1863#2,2:1020\n*S KotlinDebug\n*F\n+ 1 SessionRepository.kt\ncom/gse/aulapp/model/repository/SessionRepository\n*L\n907#1:1018,2\n933#1:1020,2\n*E\n"})
/* loaded from: classes.dex */
@SuppressWarnings({"unchecked", "rawtypes"})
public final class SessionRepository {
    private final Context context;
    private final SessionDao sessionDao;
    private final String tag;

    public SessionRepository(SessionDao sessionDao, Context context) {
        Intrinsics.checkNotNullParameter(sessionDao, "sessionDao");
        Intrinsics.checkNotNullParameter(context, "context");
        this.sessionDao = sessionDao;
        this.context = context;
        Intrinsics.checkNotNullExpressionValue("SessionRepository", "getSimpleName(...)");
        this.tag = "SessionRepository";
    }

    private final Object getAllSessionPendingSync(Continuation<? super List<SessionFullSync>> continuation) {
        return this.sessionDao.getAllSessionCustomSync(new SimpleSQLiteQuery("SELECT * FROM session WHERE isPendingSync = 1 ", null), continuation);
    }

    private final Object getSessionSyncById(String str, Continuation<? super SessionFullSync> continuation) {
        return this.sessionDao.getSessionCustomSync(new SimpleSQLiteQuery("SELECT * FROM session s where s.id = ?", new Object[]{str}), continuation);
    }

    private final SessionPracticeExamSyncRequest practiceExamRequest(SessionFullSync data, List<QuestionPracticeExam> questionFullSync) {
        String str;
        String obj;
        String date;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        new ArrayList();
        SessionEntity session = data.getSession();
        String id = session != null ? session.getId() : null;
        SessionEntity session2 = data.getSession();
        String classroomID = session2 != null ? session2.getClassroomID() : null;
        SessionEntity session3 = data.getSession();
        String vehicleID = session3 != null ? session3.getVehicleID() : null;
        SessionEntity session4 = data.getSession();
        String apprenticeID = session4 != null ? session4.getApprenticeID() : null;
        SessionEntity session5 = data.getSession();
        String instructorID = session5 != null ? session5.getInstructorID() : null;
        SessionEntity session6 = data.getSession();
        String end = session6 != null ? session6.getEnd() : null;
        SessionEntity session7 = data.getSession();
        String start = session7 != null ? session7.getStart() : null;
        SessionEntity session8 = data.getSession();
        if (session8 == null || (date = session8.getDate()) == null) {
            str = null;
        } else {
            str = date.substring(0, 10);
            Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
        }
        SessionSyncRequest sessionSyncRequest = new SessionSyncRequest(id, classroomID, vehicleID, apprenticeID, instructorID, end, start, str, "Vista", BuildConfig.FLAVOR);
        for (GpsTraceEntity gpsTraceEntity : data.getListGpsTrace()) {
            arrayList.add(new RouteSyncRequest(Double.valueOf(gpsTraceEntity.getLatitude()), Double.valueOf(gpsTraceEntity.getLongitude()), DateUtil.INSTANCE.parseDateLongToString12h(Long.valueOf(gpsTraceEntity.getDate()))));
        }
        DateUtil.Companion companion = DateUtil.INSTANCE;
        SessionEntity session9 = data.getSession();
        String parseDateLongToString12h = companion.parseDateLongToString12h(session9 != null ? session9.getDateStartEntryClass() : null);
        SessionEntity session10 = data.getSession();
        AssistSyncRequest assistSyncRequest = new AssistSyncRequest(arrayList, parseDateLongToString12h, companion.parseDateLongToString12h(session10 != null ? session10.getDateEndEntryClass() : null));
        for (QuestionPracticeExam questionPracticeExam : questionFullSync) {
            arrayList2.add(new QuestionsPracticeExamRequest(questionPracticeExam.getLevel(), questionPracticeExam.getAnswer(), questionPracticeExam.getDescription(), questionPracticeExam.getItemID(), questionPracticeExam.getQuestionID(), new CoordinatePracticeExamRequest(0, 0)));
        }
        if (questionFullSync.isEmpty()) {
            obj = "0";
        } else {
            Object testID = questionFullSync.get(0).getTestID();
            if (testID == null) {
                testID = 0;
            }
            obj = testID.toString();
        }
        return new SessionPracticeExamSyncRequest(sessionSyncRequest, assistSyncRequest, new PracticeExamRequest(obj, arrayList2, "undeveloped", SummaryExamUtil.INSTANCE.calculateSummary(questionFullSync)));
    }

    private final SessionPracticeSyncRequest practiceRequest(SessionFullSync data) {
        String str;
        String date;
        ArrayList arrayList = new ArrayList();
        SessionEntity session = data.getSession();
        String id = session != null ? session.getId() : null;
        SessionEntity session2 = data.getSession();
        String classroomID = session2 != null ? session2.getClassroomID() : null;
        SessionEntity session3 = data.getSession();
        String vehicleID = session3 != null ? session3.getVehicleID() : null;
        SessionEntity session4 = data.getSession();
        String apprenticeID = session4 != null ? session4.getApprenticeID() : null;
        SessionEntity session5 = data.getSession();
        String instructorID = session5 != null ? session5.getInstructorID() : null;
        SessionEntity session6 = data.getSession();
        String end = session6 != null ? session6.getEnd() : null;
        SessionEntity session7 = data.getSession();
        String start = session7 != null ? session7.getStart() : null;
        SessionEntity session8 = data.getSession();
        if (session8 == null || (date = session8.getDate()) == null) {
            str = null;
        } else {
            str = date.substring(0, 10);
            Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
        }
        SessionSyncRequest sessionSyncRequest = new SessionSyncRequest(id, classroomID, vehicleID, apprenticeID, instructorID, end, start, str, "Vista", BuildConfig.FLAVOR);
        for (GpsTraceEntity gpsTraceEntity : data.getListGpsTrace()) {
            arrayList.add(new RouteSyncRequest(Double.valueOf(gpsTraceEntity.getLatitude()), Double.valueOf(gpsTraceEntity.getLongitude()), DateUtil.INSTANCE.parseDateLongToString12h(Long.valueOf(gpsTraceEntity.getDate()))));
        }
        DateUtil.Companion companion = DateUtil.INSTANCE;
        SessionEntity session9 = data.getSession();
        String parseDateLongToString12h = companion.parseDateLongToString12h(session9 != null ? session9.getDateStartEntryClass() : null);
        SessionEntity session10 = data.getSession();
        return new SessionPracticeSyncRequest(sessionSyncRequest, new AssistSyncRequest(arrayList, parseDateLongToString12h, companion.parseDateLongToString12h(session10 != null ? session10.getDateEndEntryClass() : null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b4 A[Catch: Exception -> 0x00f4, TryCatch #0 {Exception -> 0x00f4, blocks: (B:13:0x0031, B:14:0x00ae, B:16:0x00b4, B:18:0x00bc, B:20:0x00c2, B:21:0x00c8, B:25:0x00cc, B:27:0x00d0, B:29:0x00da, B:30:0x00df, B:34:0x0046, B:35:0x007b, B:37:0x007f, B:39:0x0085, B:41:0x008f, B:43:0x0095, B:44:0x009b, B:49:0x00e0, B:51:0x00ea, B:54:0x0052, B:55:0x006c, B:59:0x0059), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cc A[Catch: Exception -> 0x00f4, TryCatch #0 {Exception -> 0x00f4, blocks: (B:13:0x0031, B:14:0x00ae, B:16:0x00b4, B:18:0x00bc, B:20:0x00c2, B:21:0x00c8, B:25:0x00cc, B:27:0x00d0, B:29:0x00da, B:30:0x00df, B:34:0x0046, B:35:0x007b, B:37:0x007f, B:39:0x0085, B:41:0x008f, B:43:0x0095, B:44:0x009b, B:49:0x00e0, B:51:0x00ea, B:54:0x0052, B:55:0x006c, B:59:0x0059), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f A[Catch: Exception -> 0x00f4, TryCatch #0 {Exception -> 0x00f4, blocks: (B:13:0x0031, B:14:0x00ae, B:16:0x00b4, B:18:0x00bc, B:20:0x00c2, B:21:0x00c8, B:25:0x00cc, B:27:0x00d0, B:29:0x00da, B:30:0x00df, B:34:0x0046, B:35:0x007b, B:37:0x007f, B:39:0x0085, B:41:0x008f, B:43:0x0095, B:44:0x009b, B:49:0x00e0, B:51:0x00ea, B:54:0x0052, B:55:0x006c, B:59:0x0059), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ea A[ADDED_TO_REGION, Catch: Exception -> 0x00f4, TRY_LEAVE, TryCatch #0 {Exception -> 0x00f4, blocks: (B:13:0x0031, B:14:0x00ae, B:16:0x00b4, B:18:0x00bc, B:20:0x00c2, B:21:0x00c8, B:25:0x00cc, B:27:0x00d0, B:29:0x00da, B:30:0x00df, B:34:0x0046, B:35:0x007b, B:37:0x007f, B:39:0x0085, B:41:0x008f, B:43:0x0095, B:44:0x009b, B:49:0x00e0, B:51:0x00ea, B:54:0x0052, B:55:0x006c, B:59:0x0059), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendSessionPracticeAndSyncPracticalExamRequest(Context context, SessionPracticeExamSyncRequest sessionPracticeExamSyncRequest, Continuation<? super Pair<Boolean, String>> continuation) {
        SessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$1 sessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$1 = null;
        Object obj = null;
        Object coroutine_suspended = null;
        int i = 0;
        SessionRepository sessionRepository = null;
        Response response;
        Object sendSessionSyncPracticalRequest;
        SessionPracticeExamResponse sessionPracticeExamResponse;
        SessionPracticeExamResponse.Result result;
        ApiResult apiResult;
        SessionPracticeExamResponse.Result result2;
        try {
            if (continuation instanceof SessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$1) {
                sessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$1 = (SessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$1) continuation;
                int i2 = sessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$1.label;
                if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                    sessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$1.label = i2 - IntCompanionObject.MIN_VALUE;
                    obj = sessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = sessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        SessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$response$1 sessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$response$1 = new SessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$response$1(context, sessionPracticeExamSyncRequest, null);
                        sessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$1.L$0 = this;
                        sessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$1.L$1 = context;
                        sessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$1.label = 1;
                        obj = CoroutineScopeKt.coroutineScope(sessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$response$1, sessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        sessionRepository = this;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                sessionPracticeExamResponse = (SessionPracticeExamResponse) sessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$1.L$0;
                                ResultKt.throwOnFailure(obj);
                                apiResult = (ApiResult) obj;
                                if (!(apiResult instanceof ApiResult.Success)) {
                                    return new Pair(Boxing.boxBoolean(true), (sessionPracticeExamResponse == null || (result2 = sessionPracticeExamResponse.getResult()) == null) ? null : result2.getExamResult());
                                }
                                if (apiResult instanceof ApiResult.Failure) {
                                    return new Pair(Boxing.boxBoolean(false), null);
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                            context = (Context) sessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$1.L$1;
                            sessionRepository = (SessionRepository) sessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            response = (Response) obj;
                            if (response != null && response.isSuccessful()) {
                                SessionPracticeExamResponse sessionPracticeExamResponse2 = (SessionPracticeExamResponse) response.body();
                                SessionSyncPracticalRequest sessionSyncPracticalRequest = new SessionSyncPracticalRequest((sessionPracticeExamResponse2 != null || (result = sessionPracticeExamResponse2.getResult()) == null) ? null : result.getDataID());
                                sessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$1.L$0 = sessionPracticeExamResponse2;
                                sessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$1.L$1 = null;
                                sessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$1.label = 3;
                                sendSessionSyncPracticalRequest = sessionRepository.sendSessionSyncPracticalRequest(context, sessionSyncPracticalRequest, sessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$1);
                                if (sendSessionSyncPracticalRequest != coroutine_suspended) {
                                    obj = sendSessionSyncPracticalRequest;
                                    sessionPracticeExamResponse = sessionPracticeExamResponse2;
                                    apiResult = (ApiResult) obj;
                                    if (!(apiResult instanceof ApiResult.Success)) {
                                    }
                                }
                                return coroutine_suspended;
                            }
                            return new Pair(Boxing.boxBoolean(false), null);
                        }
                        context = (Context) sessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$1.L$1;
                        sessionRepository = (SessionRepository) sessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    sessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$1.L$0 = sessionRepository;
                    sessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$1.L$1 = context;
                    sessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$1.label = 2;
                    obj = ((Deferred) obj).await(sessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    response = (Response) obj;
                    if (response != null) {
                        return new Pair(Boxing.boxBoolean(false), null);
                    }
                    SessionPracticeExamResponse sessionPracticeExamResponse22 = (SessionPracticeExamResponse) response.body();
                    SessionSyncPracticalRequest sessionSyncPracticalRequest2 = new SessionSyncPracticalRequest((sessionPracticeExamResponse22 != null || (result = sessionPracticeExamResponse22.getResult()) == null) ? null : result.getDataID());
                    sessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$1.L$0 = sessionPracticeExamResponse22;
                    sessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$1.L$1 = null;
                    sessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$1.label = 3;
                    sendSessionSyncPracticalRequest = sessionRepository.sendSessionSyncPracticalRequest(context, sessionSyncPracticalRequest2, sessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$1);
                    if (sendSessionSyncPracticalRequest != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
            }
            if (i != 0) {
            }
            sessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$1.L$0 = sessionRepository;
            sessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$1.L$1 = context;
            sessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$1.label = 2;
            obj = ((Deferred) obj).await(sessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$1);
            if (obj == coroutine_suspended) {
            }
            response = (Response) obj;
            if (response != null) {
            }
        } catch (Exception unused) {
            return new Pair(Boxing.boxBoolean(false), null);
        }
        sessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$1 = new SessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$1(this, (Continuation) continuation);
        obj = sessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sessionRepository$sendSessionPracticeAndSyncPracticalExamRequest$1.label;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00cb A[Catch: Exception -> 0x0123, TryCatch #0 {Exception -> 0x0123, blocks: (B:13:0x0031, B:14:0x00c5, B:16:0x00cb, B:18:0x00d3, B:20:0x00d9, B:21:0x00df, B:25:0x00e3, B:27:0x00e7, B:29:0x00f1, B:30:0x00f6, B:34:0x0046, B:35:0x007b, B:37:0x007f, B:39:0x0085, B:41:0x008d, B:43:0x0093, B:45:0x009b, B:48:0x00a2, B:50:0x00a6, B:52:0x00ac, B:53:0x00b2, B:58:0x00f7, B:60:0x00ff, B:62:0x0105, B:63:0x010b, B:67:0x010f, B:69:0x0119, B:72:0x0052, B:73:0x006c, B:77:0x0059), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e3 A[Catch: Exception -> 0x0123, TryCatch #0 {Exception -> 0x0123, blocks: (B:13:0x0031, B:14:0x00c5, B:16:0x00cb, B:18:0x00d3, B:20:0x00d9, B:21:0x00df, B:25:0x00e3, B:27:0x00e7, B:29:0x00f1, B:30:0x00f6, B:34:0x0046, B:35:0x007b, B:37:0x007f, B:39:0x0085, B:41:0x008d, B:43:0x0093, B:45:0x009b, B:48:0x00a2, B:50:0x00a6, B:52:0x00ac, B:53:0x00b2, B:58:0x00f7, B:60:0x00ff, B:62:0x0105, B:63:0x010b, B:67:0x010f, B:69:0x0119, B:72:0x0052, B:73:0x006c, B:77:0x0059), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f A[Catch: Exception -> 0x0123, TryCatch #0 {Exception -> 0x0123, blocks: (B:13:0x0031, B:14:0x00c5, B:16:0x00cb, B:18:0x00d3, B:20:0x00d9, B:21:0x00df, B:25:0x00e3, B:27:0x00e7, B:29:0x00f1, B:30:0x00f6, B:34:0x0046, B:35:0x007b, B:37:0x007f, B:39:0x0085, B:41:0x008d, B:43:0x0093, B:45:0x009b, B:48:0x00a2, B:50:0x00a6, B:52:0x00ac, B:53:0x00b2, B:58:0x00f7, B:60:0x00ff, B:62:0x0105, B:63:0x010b, B:67:0x010f, B:69:0x0119, B:72:0x0052, B:73:0x006c, B:77:0x0059), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0119 A[ADDED_TO_REGION, Catch: Exception -> 0x0123, TRY_LEAVE, TryCatch #0 {Exception -> 0x0123, blocks: (B:13:0x0031, B:14:0x00c5, B:16:0x00cb, B:18:0x00d3, B:20:0x00d9, B:21:0x00df, B:25:0x00e3, B:27:0x00e7, B:29:0x00f1, B:30:0x00f6, B:34:0x0046, B:35:0x007b, B:37:0x007f, B:39:0x0085, B:41:0x008d, B:43:0x0093, B:45:0x009b, B:48:0x00a2, B:50:0x00a6, B:52:0x00ac, B:53:0x00b2, B:58:0x00f7, B:60:0x00ff, B:62:0x0105, B:63:0x010b, B:67:0x010f, B:69:0x0119, B:72:0x0052, B:73:0x006c, B:77:0x0059), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendSessionPracticeAndSyncPracticalRequest(Context context, SessionPracticeSyncRequest sessionPracticeSyncRequest, Continuation<? super Pair<Boolean, String>> continuation) {
        SessionRepository$sendSessionPracticeAndSyncPracticalRequest$1 sessionRepository$sendSessionPracticeAndSyncPracticalRequest$1 = null;
        Object obj = null;
        Object coroutine_suspended = null;
        int i = 0;
        SessionRepository sessionRepository = null;
        Response response;
        SessionPracticeExamResponse sessionPracticeExamResponse;
        String dataID = null;
        SessionPracticeExamResponse.Result result;
        Object sendSessionSyncPracticalRequest;
        SessionPracticeExamResponse sessionPracticeExamResponse2;
        SessionPracticeExamResponse.Result result2;
        SessionPracticeExamResponse.Result result3;
        ApiResult apiResult;
        SessionPracticeExamResponse.Result result4;
        try {
            if (continuation instanceof SessionRepository$sendSessionPracticeAndSyncPracticalRequest$1) {
                sessionRepository$sendSessionPracticeAndSyncPracticalRequest$1 = (SessionRepository$sendSessionPracticeAndSyncPracticalRequest$1) continuation;
                int i2 = sessionRepository$sendSessionPracticeAndSyncPracticalRequest$1.label;
                if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                    sessionRepository$sendSessionPracticeAndSyncPracticalRequest$1.label = i2 - IntCompanionObject.MIN_VALUE;
                    obj = sessionRepository$sendSessionPracticeAndSyncPracticalRequest$1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = sessionRepository$sendSessionPracticeAndSyncPracticalRequest$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        SessionRepository$sendSessionPracticeAndSyncPracticalRequest$response$1 sessionRepository$sendSessionPracticeAndSyncPracticalRequest$response$1 = new SessionRepository$sendSessionPracticeAndSyncPracticalRequest$response$1(context, sessionPracticeSyncRequest, null);
                        sessionRepository$sendSessionPracticeAndSyncPracticalRequest$1.L$0 = this;
                        sessionRepository$sendSessionPracticeAndSyncPracticalRequest$1.L$1 = context;
                        sessionRepository$sendSessionPracticeAndSyncPracticalRequest$1.label = 1;
                        obj = CoroutineScopeKt.coroutineScope(sessionRepository$sendSessionPracticeAndSyncPracticalRequest$response$1, sessionRepository$sendSessionPracticeAndSyncPracticalRequest$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        sessionRepository = this;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                sessionPracticeExamResponse2 = (SessionPracticeExamResponse) sessionRepository$sendSessionPracticeAndSyncPracticalRequest$1.L$0;
                                ResultKt.throwOnFailure(obj);
                                apiResult = (ApiResult) obj;
                                if (!(apiResult instanceof ApiResult.Success)) {
                                    return new Pair(Boxing.boxBoolean(true), (sessionPracticeExamResponse2 == null || (result4 = sessionPracticeExamResponse2.getResult()) == null) ? null : result4.getExamResult());
                                }
                                if (apiResult instanceof ApiResult.Failure) {
                                    return new Pair(Boxing.boxBoolean(false), null);
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                            context = (Context) sessionRepository$sendSessionPracticeAndSyncPracticalRequest$1.L$1;
                            sessionRepository = (SessionRepository) sessionRepository$sendSessionPracticeAndSyncPracticalRequest$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            response = (Response) obj;
                            if (response != null && response.isSuccessful()) {
                                sessionPracticeExamResponse = (SessionPracticeExamResponse) response.body();
                                dataID = (sessionPracticeExamResponse != null || (result3 = sessionPracticeExamResponse.getResult()) == null) ? null : result3.getDataID();
                                if (dataID != null && dataID.length() != 0) {
                                    SessionSyncPracticalRequest sessionSyncPracticalRequest = new SessionSyncPracticalRequest((sessionPracticeExamResponse != null || (result2 = sessionPracticeExamResponse.getResult()) == null) ? null : result2.getDataID());
                                    sessionRepository$sendSessionPracticeAndSyncPracticalRequest$1.L$0 = sessionPracticeExamResponse;
                                    sessionRepository$sendSessionPracticeAndSyncPracticalRequest$1.L$1 = null;
                                    sessionRepository$sendSessionPracticeAndSyncPracticalRequest$1.label = 3;
                                    sendSessionSyncPracticalRequest = sessionRepository.sendSessionSyncPracticalRequest(context, sessionSyncPracticalRequest, sessionRepository$sendSessionPracticeAndSyncPracticalRequest$1);
                                    if (sendSessionSyncPracticalRequest != coroutine_suspended) {
                                        obj = sendSessionSyncPracticalRequest;
                                        sessionPracticeExamResponse2 = sessionPracticeExamResponse;
                                        apiResult = (ApiResult) obj;
                                        if (!(apiResult instanceof ApiResult.Success)) {
                                        }
                                    }
                                    return coroutine_suspended;
                                }
                                return new Pair(Boxing.boxBoolean(true), (sessionPracticeExamResponse != null || (result = sessionPracticeExamResponse.getResult()) == null) ? null : result.getExamResult());
                            }
                            return new Pair(Boxing.boxBoolean(false), null);
                        }
                        context = (Context) sessionRepository$sendSessionPracticeAndSyncPracticalRequest$1.L$1;
                        sessionRepository = (SessionRepository) sessionRepository$sendSessionPracticeAndSyncPracticalRequest$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    sessionRepository$sendSessionPracticeAndSyncPracticalRequest$1.L$0 = sessionRepository;
                    sessionRepository$sendSessionPracticeAndSyncPracticalRequest$1.L$1 = context;
                    sessionRepository$sendSessionPracticeAndSyncPracticalRequest$1.label = 2;
                    obj = ((Deferred) obj).await(sessionRepository$sendSessionPracticeAndSyncPracticalRequest$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    response = (Response) obj;
                    if (response != null) {
                        return new Pair(Boxing.boxBoolean(false), null);
                    }
                    sessionPracticeExamResponse = (SessionPracticeExamResponse) response.body();
                    if (sessionPracticeExamResponse != null) {
                    }
                    if (dataID != null) {
                        SessionSyncPracticalRequest sessionSyncPracticalRequest2 = new SessionSyncPracticalRequest((sessionPracticeExamResponse != null || (result2 = sessionPracticeExamResponse.getResult()) == null) ? null : result2.getDataID());
                        sessionRepository$sendSessionPracticeAndSyncPracticalRequest$1.L$0 = sessionPracticeExamResponse;
                        sessionRepository$sendSessionPracticeAndSyncPracticalRequest$1.L$1 = null;
                        sessionRepository$sendSessionPracticeAndSyncPracticalRequest$1.label = 3;
                        sendSessionSyncPracticalRequest = sessionRepository.sendSessionSyncPracticalRequest(context, sessionSyncPracticalRequest2, sessionRepository$sendSessionPracticeAndSyncPracticalRequest$1);
                        if (sendSessionSyncPracticalRequest != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    return new Pair(Boxing.boxBoolean(true), (sessionPracticeExamResponse != null || (result = sessionPracticeExamResponse.getResult()) == null) ? null : result.getExamResult());
                }
            }
            if (i != 0) {
            }
            sessionRepository$sendSessionPracticeAndSyncPracticalRequest$1.L$0 = sessionRepository;
            sessionRepository$sendSessionPracticeAndSyncPracticalRequest$1.L$1 = context;
            sessionRepository$sendSessionPracticeAndSyncPracticalRequest$1.label = 2;
            obj = ((Deferred) obj).await(sessionRepository$sendSessionPracticeAndSyncPracticalRequest$1);
            if (obj == coroutine_suspended) {
            }
            response = (Response) obj;
            if (response != null) {
            }
        } catch (Exception unused) {
            return new Pair(Boxing.boxBoolean(false), null);
        }
        sessionRepository$sendSessionPracticeAndSyncPracticalRequest$1 = new SessionRepository$sendSessionPracticeAndSyncPracticalRequest$1(this, (Continuation) continuation);
        obj = sessionRepository$sendSessionPracticeAndSyncPracticalRequest$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sessionRepository$sendSessionPracticeAndSyncPracticalRequest$1.label;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<ApiResult<SessionPracticeExamResponse>> sendSessionPracticeRequest(Context context, SessionPracticeExamSyncRequest request) {
        return FlowKt.flowOn((Flow) FlowKt.flow(new SessionRepository$sendSessionPracticeRequest$1(context, request, null)), Dispatchers.getIO());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0050 A[Catch: Exception -> 0x0091, TryCatch #0 {Exception -> 0x0091, blocks: (B:10:0x002a, B:11:0x004a, B:13:0x0050, B:15:0x0056, B:18:0x0064, B:20:0x006a, B:21:0x006e, B:23:0x0074, B:24:0x0077, B:26:0x0086, B:31:0x0039, B:33:0x0041), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086 A[Catch: Exception -> 0x0091, TRY_LEAVE, TryCatch #0 {Exception -> 0x0091, blocks: (B:10:0x002a, B:11:0x004a, B:13:0x0050, B:15:0x0056, B:18:0x0064, B:20:0x006a, B:21:0x006e, B:23:0x0074, B:24:0x0077, B:26:0x0086, B:31:0x0039, B:33:0x0041), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendSessionSyncPracticalRequest(Context context, SessionSyncPracticalRequest sessionSyncPracticalRequest, Continuation<? super ApiResult<SessionSyncPracticalResponse>> continuation) {
        SessionRepository$sendSessionSyncPracticalRequest$1 sessionRepository$sendSessionSyncPracticalRequest$1;
        int i = 0;
        Response response;
        Object obj = null;
        try {
            if (continuation instanceof SessionRepository$sendSessionSyncPracticalRequest$1) {
                sessionRepository$sendSessionSyncPracticalRequest$1 = (SessionRepository$sendSessionSyncPracticalRequest$1) continuation;
                int i2 = sessionRepository$sendSessionSyncPracticalRequest$1.label;
                if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                    sessionRepository$sendSessionSyncPracticalRequest$1.label = i2 - IntCompanionObject.MIN_VALUE;
                    obj = sessionRepository$sendSessionSyncPracticalRequest$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = sessionRepository$sendSessionSyncPracticalRequest$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        ReceptionsApiService apiService = ReceptionsAdapter.INSTANCE.getApiService(context);
                        if (apiService == null) {
                            response = null;
                            if (response == null) {
                                return new ApiResult.Failure(500, new Exception("Unknown error"));
                            }
                            if (response.isSuccessful()) {
                                return new ApiResult.Success(response.code(), response.body());
                            }
                            ResponseBody errorBody = response.errorBody();
                            String string = errorBody != null ? errorBody.string() : null;
                            ResponseBody errorBody2 = response.errorBody();
                            if (errorBody2 != null) {
                                errorBody2.close();
                            }
                            return new ApiResult.Failure(response.code(), new Exception(string));
                        }
                        sessionRepository$sendSessionSyncPracticalRequest$1.label = 1;
                        obj = apiService.syncSessionPractical(sessionSyncPracticalRequest, sessionRepository$sendSessionSyncPracticalRequest$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    response = (Response) obj;
                    if (response == null) {
                    }
                }
            }
            if (i != 0) {
            }
            response = (Response) obj;
            if (response == null) {
            }
        } catch (Exception unused) {
            return new ApiResult.Failure(500, new Exception("Unknown error"));
        }
        sessionRepository$sendSessionSyncPracticalRequest$1 = new SessionRepository$sendSessionSyncPracticalRequest$1(this, (Continuation) continuation);
        Object obj2 = sessionRepository$sendSessionSyncPracticalRequest$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sessionRepository$sendSessionSyncPracticalRequest$1.label;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<ApiResult<SessionSyncPracticalResponse>> sendSessionSyncPracticalRequest2(Context context, SessionSyncPracticalRequest request) {
        return FlowKt.flowOn((Flow) FlowKt.flow(new SessionRepository$sendSessionSyncPracticalRequest2$1(context, request, this, null)), Dispatchers.getIO());
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0259, code lost:
    
        if (r2.deleteSessionCustom(r7, r0) == r1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0243, code lost:
    
        if (r4.deleteSessionCustom(r7, r0) == r1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x022d, code lost:
    
        if (r4.deleteSessionCustom(r7, r0) == r1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0217, code lost:
    
        if (r4.deleteSessionCustom(r7, r0) == r1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0201, code lost:
    
        if (r4.deleteSessionCustom(r7, r0) == r1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01eb, code lost:
    
        if (r4.deleteSessionCustom(r7, r0) == r1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01d4, code lost:
    
        if (r4.deleteSessionCustom(r7, r0) == r1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01bd, code lost:
    
        if (r4.deleteSessionCustom(r7, r0) == r1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01a6, code lost:
    
        if (r4.deleteSessionCustom(r7, r0) == r1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x018f, code lost:
    
        if (r4.deleteSessionCustom(r7, r0) == r1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0178, code lost:
    
        if (r4.deleteSessionCustom(r7, r0) == r1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0161, code lost:
    
        if (r4.deleteSessionCustom(r7, r0) == r1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x014b, code lost:
    
        if (r4.deleteSessionCustom(r7, r0) == r1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0135, code lost:
    
        if (r4.deleteSessionCustom(r7, r0) == r1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011f, code lost:
    
        if (r4.deleteSessionCustom(r7, r0) == r1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0109, code lost:
    
        if (r4.deleteSessionCustom(r7, r0) == r1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f3, code lost:
    
        if (r4.deleteSessionCustom(r7, r0) != r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deleteLogOutSession(Continuation<? super Unit> continuation) {
        SessionRepository$deleteLogOutSession$1 sessionRepository$deleteLogOutSession$1;
        SessionRepository sessionRepository;
        if (continuation instanceof SessionRepository$deleteLogOutSession$1) {
            sessionRepository$deleteLogOutSession$1 = (SessionRepository$deleteLogOutSession$1) continuation;
            int i = sessionRepository$deleteLogOutSession$1.label;
            if ((i & IntCompanionObject.MIN_VALUE) != 0) {
                sessionRepository$deleteLogOutSession$1.label = i - IntCompanionObject.MIN_VALUE;
                Object obj = sessionRepository$deleteLogOutSession$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (sessionRepository$deleteLogOutSession$1.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        SimpleSQLiteQuery simpleSQLiteQuery = new SimpleSQLiteQuery("DELETE FROM biometrics", null);
                        SessionDao sessionDao = this.sessionDao;
                        sessionRepository$deleteLogOutSession$1.L$0 = this;
                        sessionRepository$deleteLogOutSession$1.label = 1;
                        if (sessionDao.deleteSessionCustom(simpleSQLiteQuery, sessionRepository$deleteLogOutSession$1) != coroutine_suspended) {
                            sessionRepository = this;
                            SimpleSQLiteQuery simpleSQLiteQuery2 = new SimpleSQLiteQuery("DELETE FROM classroom", null);
                            SessionDao sessionDao2 = sessionRepository.sessionDao;
                            sessionRepository$deleteLogOutSession$1.L$0 = sessionRepository;
                            sessionRepository$deleteLogOutSession$1.label = 2;
                            break;
                        }
                        return coroutine_suspended;
                    case 1:
                        sessionRepository = (SessionRepository) sessionRepository$deleteLogOutSession$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        SimpleSQLiteQuery simpleSQLiteQuery22 = new SimpleSQLiteQuery("DELETE FROM classroom", null);
                        SessionDao sessionDao22 = sessionRepository.sessionDao;
                        sessionRepository$deleteLogOutSession$1.L$0 = sessionRepository;
                        sessionRepository$deleteLogOutSession$1.label = 2;
                        break;
                    case 2:
                        sessionRepository = (SessionRepository) sessionRepository$deleteLogOutSession$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        SimpleSQLiteQuery simpleSQLiteQuery3 = new SimpleSQLiteQuery("DELETE FROM countMethodEntry", null);
                        SessionDao sessionDao3 = sessionRepository.sessionDao;
                        sessionRepository$deleteLogOutSession$1.L$0 = sessionRepository;
                        sessionRepository$deleteLogOutSession$1.label = 3;
                        break;
                    case 3:
                        sessionRepository = (SessionRepository) sessionRepository$deleteLogOutSession$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        SimpleSQLiteQuery simpleSQLiteQuery4 = new SimpleSQLiteQuery("DELETE FROM exams", null);
                        SessionDao sessionDao4 = sessionRepository.sessionDao;
                        sessionRepository$deleteLogOutSession$1.L$0 = sessionRepository;
                        sessionRepository$deleteLogOutSession$1.label = 4;
                        break;
                    case 4:
                        sessionRepository = (SessionRepository) sessionRepository$deleteLogOutSession$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        SimpleSQLiteQuery simpleSQLiteQuery5 = new SimpleSQLiteQuery("DELETE FROM gpsTrace", null);
                        SessionDao sessionDao5 = sessionRepository.sessionDao;
                        sessionRepository$deleteLogOutSession$1.L$0 = sessionRepository;
                        sessionRepository$deleteLogOutSession$1.label = 5;
                        break;
                    case 5:
                        sessionRepository = (SessionRepository) sessionRepository$deleteLogOutSession$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        SimpleSQLiteQuery simpleSQLiteQuery6 = new SimpleSQLiteQuery("DELETE FROM hand", null);
                        SessionDao sessionDao6 = sessionRepository.sessionDao;
                        sessionRepository$deleteLogOutSession$1.L$0 = sessionRepository;
                        sessionRepository$deleteLogOutSession$1.label = 6;
                        break;
                    case 6:
                        sessionRepository = (SessionRepository) sessionRepository$deleteLogOutSession$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        SimpleSQLiteQuery simpleSQLiteQuery7 = new SimpleSQLiteQuery("DELETE FROM historicRecordPermissionsChange", null);
                        SessionDao sessionDao7 = sessionRepository.sessionDao;
                        sessionRepository$deleteLogOutSession$1.L$0 = sessionRepository;
                        sessionRepository$deleteLogOutSession$1.label = 7;
                        break;
                    case 7:
                        sessionRepository = (SessionRepository) sessionRepository$deleteLogOutSession$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        SimpleSQLiteQuery simpleSQLiteQuery8 = new SimpleSQLiteQuery("DELETE FROM identity", null);
                        SessionDao sessionDao8 = sessionRepository.sessionDao;
                        sessionRepository$deleteLogOutSession$1.L$0 = sessionRepository;
                        sessionRepository$deleteLogOutSession$1.label = 8;
                        break;
                    case 8:
                        sessionRepository = (SessionRepository) sessionRepository$deleteLogOutSession$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        SimpleSQLiteQuery simpleSQLiteQuery9 = new SimpleSQLiteQuery("DELETE FROM lesson", null);
                        SessionDao sessionDao9 = sessionRepository.sessionDao;
                        sessionRepository$deleteLogOutSession$1.L$0 = sessionRepository;
                        sessionRepository$deleteLogOutSession$1.label = 9;
                        break;
                    case 9:
                        sessionRepository = (SessionRepository) sessionRepository$deleteLogOutSession$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        SimpleSQLiteQuery simpleSQLiteQuery10 = new SimpleSQLiteQuery("DELETE FROM question", null);
                        SessionDao sessionDao10 = sessionRepository.sessionDao;
                        sessionRepository$deleteLogOutSession$1.L$0 = sessionRepository;
                        sessionRepository$deleteLogOutSession$1.label = 10;
                        break;
                    case 10:
                        sessionRepository = (SessionRepository) sessionRepository$deleteLogOutSession$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        SimpleSQLiteQuery simpleSQLiteQuery11 = new SimpleSQLiteQuery("DELETE FROM questionApproved", null);
                        SessionDao sessionDao11 = sessionRepository.sessionDao;
                        sessionRepository$deleteLogOutSession$1.L$0 = sessionRepository;
                        sessionRepository$deleteLogOutSession$1.label = 11;
                        break;
                    case 11:
                        sessionRepository = (SessionRepository) sessionRepository$deleteLogOutSession$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        SimpleSQLiteQuery simpleSQLiteQuery12 = new SimpleSQLiteQuery("DELETE FROM reception", null);
                        SessionDao sessionDao12 = sessionRepository.sessionDao;
                        sessionRepository$deleteLogOutSession$1.L$0 = sessionRepository;
                        sessionRepository$deleteLogOutSession$1.label = 12;
                        break;
                    case 12:
                        sessionRepository = (SessionRepository) sessionRepository$deleteLogOutSession$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        SimpleSQLiteQuery simpleSQLiteQuery13 = new SimpleSQLiteQuery("DELETE FROM stepProcessSession", null);
                        SessionDao sessionDao13 = sessionRepository.sessionDao;
                        sessionRepository$deleteLogOutSession$1.L$0 = sessionRepository;
                        sessionRepository$deleteLogOutSession$1.label = 13;
                        break;
                    case 13:
                        sessionRepository = (SessionRepository) sessionRepository$deleteLogOutSession$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        SimpleSQLiteQuery simpleSQLiteQuery14 = new SimpleSQLiteQuery("DELETE FROM test", null);
                        SessionDao sessionDao14 = sessionRepository.sessionDao;
                        sessionRepository$deleteLogOutSession$1.L$0 = sessionRepository;
                        sessionRepository$deleteLogOutSession$1.label = 14;
                        break;
                    case 14:
                        sessionRepository = (SessionRepository) sessionRepository$deleteLogOutSession$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        SimpleSQLiteQuery simpleSQLiteQuery15 = new SimpleSQLiteQuery("DELETE FROM user", null);
                        SessionDao sessionDao15 = sessionRepository.sessionDao;
                        sessionRepository$deleteLogOutSession$1.L$0 = sessionRepository;
                        sessionRepository$deleteLogOutSession$1.label = 15;
                        break;
                    case 15:
                        sessionRepository = (SessionRepository) sessionRepository$deleteLogOutSession$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        SimpleSQLiteQuery simpleSQLiteQuery16 = new SimpleSQLiteQuery("DELETE FROM userApp", null);
                        SessionDao sessionDao16 = sessionRepository.sessionDao;
                        sessionRepository$deleteLogOutSession$1.L$0 = sessionRepository;
                        sessionRepository$deleteLogOutSession$1.label = 16;
                        break;
                    case 16:
                        sessionRepository = (SessionRepository) sessionRepository$deleteLogOutSession$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        SimpleSQLiteQuery simpleSQLiteQuery17 = new SimpleSQLiteQuery("DELETE FROM vehicle", null);
                        SessionDao sessionDao17 = sessionRepository.sessionDao;
                        sessionRepository$deleteLogOutSession$1.L$0 = sessionRepository;
                        sessionRepository$deleteLogOutSession$1.label = 17;
                        break;
                    case 17:
                        sessionRepository = (SessionRepository) sessionRepository$deleteLogOutSession$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        SimpleSQLiteQuery simpleSQLiteQuery18 = new SimpleSQLiteQuery("DELETE FROM session", null);
                        SessionDao sessionDao18 = sessionRepository.sessionDao;
                        sessionRepository$deleteLogOutSession$1.L$0 = null;
                        sessionRepository$deleteLogOutSession$1.label = 18;
                        break;
                    case 18:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        sessionRepository$deleteLogOutSession$1 = new SessionRepository$deleteLogOutSession$1(this, (Continuation) continuation);
        Object obj2 = sessionRepository$deleteLogOutSession$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (sessionRepository$deleteLogOutSession$1.label) {
        }
        return null;
    }

    public final Object deleteSessionById(List<String> list, Continuation<? super Unit> continuation) {
        Object deleteSessionById = this.sessionDao.deleteSessionById(list, (Continuation) continuation);
        return deleteSessionById == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? deleteSessionById : Unit.INSTANCE;
    }

    public final Object deleteSessionsByDate(String str, Continuation<? super Unit> continuation) {
        Object deleteSessionsByDate = this.sessionDao.deleteSessionsByDate(str, (Continuation) continuation);
        return deleteSessionsByDate == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? deleteSessionsByDate : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object examRequest(String str, Continuation<? super SessionPracticeExamSyncRequest> continuation) {
        SessionRepository$examRequest$1 sessionRepository$examRequest$1;
        Object coroutine_suspended;
        int i;
        SessionRepository sessionRepository;
        Object sessionSyncById;
        List<QuestionPracticeExam> list;
        SessionRepository sessionRepository2;
        if (continuation instanceof SessionRepository$examRequest$1) {
            sessionRepository$examRequest$1 = (SessionRepository$examRequest$1) continuation;
            int i2 = sessionRepository$examRequest$1.label;
            if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                sessionRepository$examRequest$1.label = i2 - IntCompanionObject.MIN_VALUE;
                Object obj = sessionRepository$examRequest$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sessionRepository$examRequest$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    sessionRepository$examRequest$1.L$0 = this;
                    sessionRepository$examRequest$1.L$1 = str;
                    sessionRepository$examRequest$1.label = 1;
                    obj = getAllQuestionSync(str, sessionRepository$examRequest$1);
                    if (obj != coroutine_suspended) {
                        sessionRepository = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) sessionRepository$examRequest$1.L$1;
                    sessionRepository2 = (SessionRepository) sessionRepository$examRequest$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    return sessionRepository2.practiceExamRequest((SessionFullSync) obj, list);
                }
                str = (String) sessionRepository$examRequest$1.L$1;
                sessionRepository = (SessionRepository) sessionRepository$examRequest$1.L$0;
                ResultKt.throwOnFailure(obj);
                List<QuestionPracticeExam> list2 = (List) obj;
                sessionRepository$examRequest$1.L$0 = sessionRepository;
                sessionRepository$examRequest$1.L$1 = list2;
                sessionRepository$examRequest$1.label = 2;
                sessionSyncById = sessionRepository.getSessionSyncById(str, sessionRepository$examRequest$1);
                if (sessionSyncById != coroutine_suspended) {
                    obj = sessionSyncById;
                    list = list2;
                    sessionRepository2 = sessionRepository;
                    return sessionRepository2.practiceExamRequest((SessionFullSync) obj, list);
                }
                return coroutine_suspended;
            }
        }
        sessionRepository$examRequest$1 = new SessionRepository$examRequest$1(this, (Continuation) continuation);
        Object obj2 = sessionRepository$examRequest$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sessionRepository$examRequest$1.label;
        if (i != 0) {
        }
        List<QuestionPracticeExam> list22 = (List) obj2;
        sessionRepository$examRequest$1.L$0 = sessionRepository;
        sessionRepository$examRequest$1.L$1 = list22;
        sessionRepository$examRequest$1.label = 2;
        sessionSyncById = sessionRepository.getSessionSyncById(str, sessionRepository$examRequest$1);
        if (sessionSyncById != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    public final Object getAllQuestionSync(String str, Continuation<? super List<QuestionPracticeExam>> continuation) {
        return this.sessionDao.getAllQuestionBySessionId(new SimpleSQLiteQuery("SELECT q.* FROM session s INNER JOIN test t ON t.sessionID = s.id INNER JOIN question q ON t.testID = q.testID WHERE s.id = ?", new Object[]{str}), continuation);
    }

    public final Object getAllSession(Long l, Continuation<? super List<SessionFull>> continuation) {
        SimpleSQLiteQuery simpleSQLiteQuery;
        if (l == null) {
            Long dateToTimestamp = ConverterUtil.INSTANCE.dateToTimestamp(DateUtil.INSTANCE.getNowDateDate(false));
            simpleSQLiteQuery = dateToTimestamp != null ? new SimpleSQLiteQuery("SELECT * FROM session s where s.dateEndClass > ? ", new Object[]{dateToTimestamp}) : null;
        } else {
            simpleSQLiteQuery = new SimpleSQLiteQuery("SELECT * FROM session s where s.dateClass  = ? ", new Object[]{l});
        }
        return simpleSQLiteQuery != null ? this.sessionDao.getAllSessionCustom(simpleSQLiteQuery, continuation) : CollectionsKt.emptyList();
    }

    public final Object getAllSessionID(Continuation<? super List<String>> continuation) {
        return this.sessionDao.getIdSessionCustom(new SimpleSQLiteQuery("SELECT s.id FROM session s", null), continuation);
    }

    public final Object getEndEntryClass(String str, Continuation<? super Long> continuation) {
        return this.sessionDao.getEndEntryClassBySessionId(new SimpleSQLiteQuery("SELECT dateEndEntryClass FROM session WHERE id = ?", new Object[]{str}), continuation);
    }

    public final Flow<ApiResult<HoursScheduledResponse>> getHoursScheduled(Context context, HoursScheduledRequest request) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        return FlowKt.flowOn((Flow) FlowKt.flow(new SessionRepository$getHoursScheduled$1(context, request, null)), Dispatchers.getIO());
    }

    public final Flow<ApiResult<SessionInstructorResponse>> getSessionApi(Context context, SessionInstructorRequest request) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        return FlowKt.flowOn((Flow) FlowKt.flow(new SessionRepository$getSessionApi$1(context, request, null)), Dispatchers.getIO());
    }

    public final Object getSessionById(String str, Continuation<? super List<SessionFull>> continuation) {
        return this.sessionDao.getAllSessionCustom(new SimpleSQLiteQuery("SELECT * FROM session s where s.id = ?", new Object[]{str}), continuation);
    }

    public final Object getSessionByType(List<String> list, Continuation<? super List<SessionFull>> continuation) {
        if (!list.isEmpty()) {
            return this.sessionDao.getAllSessionByType(list, continuation);
        }
        Long dateToTimestamp = ConverterUtil.INSTANCE.dateToTimestamp(DateUtil.INSTANCE.getNowDateDate(false));
        if (dateToTimestamp == null) {
            return CollectionsKt.emptyList();
        }
        return this.sessionDao.getAllSessionCustom(new SimpleSQLiteQuery("SELECT * FROM session s where s.dateEndClass > ? ", new Object[]{dateToTimestamp}), continuation);
    }

    public final Flow<ApiResult<SessionExamResponse>> getSessionDataApi(Context context, SessionExamRequest sessionExamRequest) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sessionExamRequest, "sessionExamRequest");
        return FlowKt.flowOn((Flow) FlowKt.flow(new SessionRepository$getSessionDataApi$1(context, sessionExamRequest, null)), Dispatchers.getIO());
    }

    public final Object getSessionIdPendingSync(Continuation<? super List<String>> continuation) {
        return this.sessionDao.getIdSessionCustom(new SimpleSQLiteQuery("SELECT s.id FROM session s where s.isPendingSync = 1 ", null), continuation);
    }

    public final Object getSessionsIsPending(Continuation<? super Long> continuation) {
        return this.sessionDao.getCountSessionIsPending(new SimpleSQLiteQuery("SELECT Count(*) FROM session WHERE isPendingSync = 1", null), continuation);
    }

    public final Flow<ApiResult<SessionRoutesResponse>> getSessionsRoute(Context context, SessionInstructorRequest sessionInstructorRequest) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sessionInstructorRequest, "sessionInstructorRequest");
        return FlowKt.flowOn((Flow) FlowKt.flow(new SessionRepository$getSessionsRoute$1(context, sessionInstructorRequest, null)), Dispatchers.getIO());
    }

    public final Object getStartEntryClass(String str, Continuation<? super Long> continuation) {
        return this.sessionDao.getStartEntryClassBySessionId(new SimpleSQLiteQuery("SELECT dateStartEntryClass FROM session WHERE id = ?", new Object[]{str}), continuation);
    }

    public final String getTag() {
        return this.tag;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r10v0, types: [T, kotlin.Pair] */
    /* JADX WARN: Type inference failed for: r13v5, types: [T, kotlin.Pair] */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlin.Pair] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00fa -> B:16:0x012d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0115 -> B:14:0x0119). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0149 -> B:16:0x012d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initAllSessionSyncPending(Context context, Continuation<? super Pair<Boolean, String>> continuation) {
        SessionRepository$initAllSessionSyncPending$1 sessionRepository$initAllSessionSyncPending$1;
        int i = 0;
        Ref.ObjectRef objectRef;
        Object allSessionPendingSync = null;
        SessionRepository sessionRepository;
        Iterator it;
        SessionFullSync sessionFullSync;
        SessionRepository sessionRepository2;
        Context context2;
        Ref.ObjectRef objectRef2;
        boolean booleanValue;
        String str;
        if (continuation instanceof SessionRepository$initAllSessionSyncPending$1) {
            sessionRepository$initAllSessionSyncPending$1 = (SessionRepository$initAllSessionSyncPending$1) continuation;
            int i2 = sessionRepository$initAllSessionSyncPending$1.label;
            if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                sessionRepository$initAllSessionSyncPending$1.label = i2 - IntCompanionObject.MIN_VALUE;
                Object obj = sessionRepository$initAllSessionSyncPending$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sessionRepository$initAllSessionSyncPending$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    objectRef = new Ref.ObjectRef();
                    objectRef.element = new Pair(Boxing.boxBoolean(true), null);
                    sessionRepository$initAllSessionSyncPending$1.L$0 = this;
                    sessionRepository$initAllSessionSyncPending$1.L$1 = context;
                    sessionRepository$initAllSessionSyncPending$1.L$2 = objectRef;
                    sessionRepository$initAllSessionSyncPending$1.label = 1;
                    allSessionPendingSync = getAllSessionPendingSync(sessionRepository$initAllSessionSyncPending$1);
                    if (allSessionPendingSync != coroutine_suspended) {
                        sessionRepository = this;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    Ref.ObjectRef objectRef3 = (Ref.ObjectRef) sessionRepository$initAllSessionSyncPending$1.L$2;
                    Context context3 = (Context) sessionRepository$initAllSessionSyncPending$1.L$1;
                    sessionRepository = (SessionRepository) sessionRepository$initAllSessionSyncPending$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    objectRef = objectRef3;
                    context = context3;
                    allSessionPendingSync = obj;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Iterator it2 = (Iterator) sessionRepository$initAllSessionSyncPending$1.L$3;
                        Ref.ObjectRef objectRef4 = (Ref.ObjectRef) sessionRepository$initAllSessionSyncPending$1.L$2;
                        Context context4 = (Context) sessionRepository$initAllSessionSyncPending$1.L$1;
                        SessionRepository sessionRepository3 = (SessionRepository) sessionRepository$initAllSessionSyncPending$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Exception e) {
                            Boxing.boxInt(Log.e("Exception updateIsNotPending", String.valueOf(e.getMessage())));
                            objectRef = objectRef4;
                            it = it2;
                            context = context4;
                            sessionRepository = sessionRepository3;
                        }
                        Boxing.boxLong(((Number) obj).longValue());
                        sessionRepository2 = sessionRepository3;
                        context2 = context4;
                        objectRef2 = objectRef4;
                        it = it2;
                        objectRef = objectRef2;
                        context = context2;
                        sessionRepository = sessionRepository2;
                        if (!it.hasNext()) {
                            return objectRef.element;
                        }
                        SessionFullSync sessionFullSync2 = (SessionFullSync) it.next();
                        SessionEntity session = sessionFullSync2.getSession();
                        if (session == null || (str = session.getId()) == null) {
                            str = BuildConfig.FLAVOR;
                        }
                        sessionRepository$initAllSessionSyncPending$1.L$0 = sessionRepository;
                        sessionRepository$initAllSessionSyncPending$1.L$1 = context;
                        sessionRepository$initAllSessionSyncPending$1.L$2 = objectRef;
                        sessionRepository$initAllSessionSyncPending$1.L$3 = it;
                        sessionRepository$initAllSessionSyncPending$1.L$4 = sessionFullSync2;
                        sessionRepository$initAllSessionSyncPending$1.label = 2;
                        Object syncSessionProcess = sessionRepository.syncSessionProcess(context, str, sessionRepository$initAllSessionSyncPending$1);
                        if (syncSessionProcess != coroutine_suspended) {
                            context2 = context;
                            sessionFullSync = sessionFullSync2;
                            SessionRepository sessionRepository4 = sessionRepository;
                            objectRef2 = objectRef;
                            obj = syncSessionProcess;
                            sessionRepository2 = sessionRepository4;
                            Pair pair = (Pair) obj;
                            booleanValue = ((Boolean) pair.component1()).booleanValue();
                            String str2 = (String) pair.component2();
                            if (booleanValue) {
                                objectRef2.element = new Pair(Boxing.boxBoolean(false), null);
                            } else {
                                objectRef2.element = new Pair(Boxing.boxBoolean(booleanValue), str2);
                                try {
                                } catch (Exception e2) {
                                    Iterator it3 = it;
                                    Ref.ObjectRef objectRef5 = objectRef2;
                                    Context context5 = context2;
                                    SessionRepository sessionRepository5 = sessionRepository2;
                                    Boxing.boxInt(Log.e("Exception updateIsNotPending", String.valueOf(e2.getMessage())));
                                    objectRef = objectRef5;
                                    it = it3;
                                    context = context5;
                                    sessionRepository = sessionRepository5;
                                }
                                SessionEntity session2 = sessionFullSync.getSession();
                                if (session2 != null) {
                                    String id = session2.getId();
                                    sessionRepository$initAllSessionSyncPending$1.L$0 = sessionRepository2;
                                    sessionRepository$initAllSessionSyncPending$1.L$1 = context2;
                                    sessionRepository$initAllSessionSyncPending$1.L$2 = objectRef2;
                                    sessionRepository$initAllSessionSyncPending$1.L$3 = it;
                                    sessionRepository$initAllSessionSyncPending$1.L$4 = null;
                                    sessionRepository$initAllSessionSyncPending$1.label = 3;
                                    obj = sessionRepository2.updateIsPending("0", id, sessionRepository$initAllSessionSyncPending$1);
                                    if (obj != coroutine_suspended) {
                                        it2 = it;
                                        objectRef4 = objectRef2;
                                        context4 = context2;
                                        sessionRepository3 = sessionRepository2;
                                        Boxing.boxLong(((Number) obj).longValue());
                                        sessionRepository2 = sessionRepository3;
                                        context2 = context4;
                                        objectRef2 = objectRef4;
                                        it = it2;
                                    }
                                }
                            }
                            objectRef = objectRef2;
                            context = context2;
                            sessionRepository = sessionRepository2;
                            if (!it.hasNext()) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    sessionFullSync = (SessionFullSync) sessionRepository$initAllSessionSyncPending$1.L$4;
                    it = (Iterator) sessionRepository$initAllSessionSyncPending$1.L$3;
                    objectRef2 = (Ref.ObjectRef) sessionRepository$initAllSessionSyncPending$1.L$2;
                    context2 = (Context) sessionRepository$initAllSessionSyncPending$1.L$1;
                    sessionRepository2 = (SessionRepository) sessionRepository$initAllSessionSyncPending$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    Pair pair2 = (Pair) obj;
                    booleanValue = ((Boolean) pair2.component1()).booleanValue();
                    String str22 = (String) pair2.component2();
                    if (booleanValue) {
                    }
                    objectRef = objectRef2;
                    context = context2;
                    sessionRepository = sessionRepository2;
                    if (!it.hasNext()) {
                    }
                }
                it = ((Iterable) allSessionPendingSync).iterator();
                if (!it.hasNext()) {
                }
            }
        }
        sessionRepository$initAllSessionSyncPending$1 = new SessionRepository$initAllSessionSyncPending$1(this, (Continuation) continuation);
        Object obj2 = sessionRepository$initAllSessionSyncPending$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sessionRepository$initAllSessionSyncPending$1.label;
        if (i != 0) {
        }
        it = ((Iterable) allSessionPendingSync).iterator();
        if (!it.hasNext()) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x010a -> B:16:0x00f0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00c1 -> B:16:0x00f0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00db -> B:14:0x00de). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initSessionSyncPending(Continuation<? super Boolean> continuation) {
        SessionRepository$initSessionSyncPending$1 sessionRepository$initSessionSyncPending$1;
        int i = 0;
        Ref.BooleanRef booleanRef;
        SessionRepository sessionRepository;
        Iterator it;
        SessionRepository sessionRepository2;
        Ref.BooleanRef booleanRef2;
        Iterator it2;
        SessionFullSync sessionFullSync;
        if (continuation instanceof SessionRepository$initSessionSyncPending$1) {
            sessionRepository$initSessionSyncPending$1 = (SessionRepository$initSessionSyncPending$1) continuation;
            int i2 = sessionRepository$initSessionSyncPending$1.label;
            if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                sessionRepository$initSessionSyncPending$1.label = i2 - IntCompanionObject.MIN_VALUE;
                Object obj = sessionRepository$initSessionSyncPending$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sessionRepository$initSessionSyncPending$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    booleanRef = new Ref.BooleanRef();
                    booleanRef.element = true;
                    sessionRepository$initSessionSyncPending$1.L$0 = this;
                    sessionRepository$initSessionSyncPending$1.L$1 = booleanRef;
                    sessionRepository$initSessionSyncPending$1.label = 1;
                    obj = getAllSessionPendingSync(sessionRepository$initSessionSyncPending$1);
                    if (obj != coroutine_suspended) {
                        sessionRepository = this;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    booleanRef = (Ref.BooleanRef) sessionRepository$initSessionSyncPending$1.L$1;
                    sessionRepository = (SessionRepository) sessionRepository$initSessionSyncPending$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    sessionFullSync = (SessionFullSync) sessionRepository$initSessionSyncPending$1.L$3;
                    it2 = (Iterator) sessionRepository$initSessionSyncPending$1.L$2;
                    booleanRef2 = (Ref.BooleanRef) sessionRepository$initSessionSyncPending$1.L$1;
                    sessionRepository2 = (SessionRepository) sessionRepository$initSessionSyncPending$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (((Boolean) ((Pair) obj).getFirst()).booleanValue()) {
                    }
                    it = it2;
                    booleanRef = booleanRef2;
                    sessionRepository = sessionRepository2;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Iterator it3 = (Iterator) sessionRepository$initSessionSyncPending$1.L$2;
                    Ref.BooleanRef booleanRef3 = (Ref.BooleanRef) sessionRepository$initSessionSyncPending$1.L$1;
                    SessionRepository sessionRepository3 = (SessionRepository) sessionRepository$initSessionSyncPending$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Exception e) {
                        Boxing.boxInt(Log.e("Exception updateIsNotPending", String.valueOf(e.getMessage())));
                        it = it3;
                        booleanRef = booleanRef3;
                        sessionRepository = sessionRepository3;
                    }
                    Boxing.boxLong(((Number) obj).longValue());
                    sessionRepository2 = sessionRepository3;
                    booleanRef2 = booleanRef3;
                    it2 = it3;
                    it = it2;
                    booleanRef = booleanRef2;
                    sessionRepository = sessionRepository2;
                    if (it.hasNext()) {
                        SessionFullSync sessionFullSync2 = (SessionFullSync) it.next();
                        SessionPracticeSyncRequest practiceRequest = sessionRepository.practiceRequest(sessionFullSync2);
                        Context context = sessionRepository.context;
                        sessionRepository$initSessionSyncPending$1.L$0 = sessionRepository;
                        sessionRepository$initSessionSyncPending$1.L$1 = booleanRef;
                        sessionRepository$initSessionSyncPending$1.L$2 = it;
                        sessionRepository$initSessionSyncPending$1.L$3 = sessionFullSync2;
                        sessionRepository$initSessionSyncPending$1.label = 2;
                        Object sendSessionPracticeAndSyncPracticalRequest = sessionRepository.sendSessionPracticeAndSyncPracticalRequest(context, practiceRequest, sessionRepository$initSessionSyncPending$1);
                        if (sendSessionPracticeAndSyncPracticalRequest != coroutine_suspended) {
                            SessionRepository sessionRepository4 = sessionRepository;
                            it2 = it;
                            obj = sendSessionPracticeAndSyncPracticalRequest;
                            sessionRepository2 = sessionRepository4;
                            booleanRef2 = booleanRef;
                            sessionFullSync = sessionFullSync2;
                            if (((Boolean) ((Pair) obj).getFirst()).booleanValue()) {
                                booleanRef2.element = false;
                            } else {
                                try {
                                } catch (Exception e2) {
                                    Iterator it4 = it2;
                                    Ref.BooleanRef booleanRef4 = booleanRef2;
                                    SessionRepository sessionRepository5 = sessionRepository2;
                                    Boxing.boxInt(Log.e("Exception updateIsNotPending", String.valueOf(e2.getMessage())));
                                    it = it4;
                                    booleanRef = booleanRef4;
                                    sessionRepository = sessionRepository5;
                                }
                                SessionEntity session = sessionFullSync.getSession();
                                if (session != null) {
                                    String id = session.getId();
                                    sessionRepository$initSessionSyncPending$1.L$0 = sessionRepository2;
                                    sessionRepository$initSessionSyncPending$1.L$1 = booleanRef2;
                                    sessionRepository$initSessionSyncPending$1.L$2 = it2;
                                    sessionRepository$initSessionSyncPending$1.L$3 = null;
                                    sessionRepository$initSessionSyncPending$1.label = 3;
                                    obj = sessionRepository2.updateIsPending("0", id, sessionRepository$initSessionSyncPending$1);
                                    if (obj != coroutine_suspended) {
                                        it3 = it2;
                                        booleanRef3 = booleanRef2;
                                        sessionRepository3 = sessionRepository2;
                                        Boxing.boxLong(((Number) obj).longValue());
                                        sessionRepository2 = sessionRepository3;
                                        booleanRef2 = booleanRef3;
                                        it2 = it3;
                                    }
                                }
                            }
                            it = it2;
                            booleanRef = booleanRef2;
                            sessionRepository = sessionRepository2;
                            if (it.hasNext()) {
                                return Boxing.boxBoolean(booleanRef.element);
                            }
                        }
                        return coroutine_suspended;
                    }
                }
                it = ((Iterable) obj).iterator();
                if (it.hasNext()) {
                }
            }
        }
        sessionRepository$initSessionSyncPending$1 = new SessionRepository$initSessionSyncPending$1(this, (Continuation) continuation);
        Object obj2 = sessionRepository$initSessionSyncPending$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sessionRepository$initSessionSyncPending$1.label;
        if (i != 0) {
        }
        it = ((Iterable) obj2).iterator();
        if (it.hasNext()) {
        }
        return null;
    }

    public final Object saveClassRoom(ClassRoomEntity classRoomEntity, Continuation<? super Long> continuation) {
        return this.sessionDao.saveClassRoom(classRoomEntity, continuation);
    }

    public final Object saveDateExamEntry(String str, String str2, Continuation<? super Unit> continuation) {
        Object updateDateStartEntry = this.sessionDao.updateDateStartEntry(new SimpleSQLiteQuery("UPDATE session  SET dateStartEntry = ? WHERE id = ?", new Object[]{str, str2}), (Continuation) continuation);
        return updateDateStartEntry == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateDateStartEntry : Unit.INSTANCE;
    }

    public final Object saveLesson(LessonEntity lessonEntity, Continuation<? super Long> continuation) {
        return this.sessionDao.saveLesson(lessonEntity, continuation);
    }

    public final Object saveSession(SessionEntity sessionEntity, Continuation<? super Long> continuation) {
        String str;
        String date = sessionEntity.getDate();
        if (date != null) {
            str = date.substring(0, 10);
            Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
        } else {
            str = null;
        }
        String B = a.B(str, " ", sessionEntity.getStart());
        String B2 = a.B(str, " ", sessionEntity.getEnd());
        DateUtil.Companion companion = DateUtil.INSTANCE;
        companion.parseDate(B, "yyyy-MM-dd HH:mm", null);
        Date parseDate = companion.parseDate(B2, "yyyy-MM-dd HH:mm", null);
        ConverterUtil.Companion companion2 = ConverterUtil.INSTANCE;
        sessionEntity.setDateEndClass(companion2.dateToTimestamp(parseDate));
        try {
            sessionEntity.setDateClass(companion2.dateToTimestamp(new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).parse(str)));
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
        return this.sessionDao.saveSession(sessionEntity, continuation);
    }

    public final Object saveVehicle(VehicleEntity vehicleEntity, Continuation<? super Long> continuation) {
        return this.sessionDao.saveVehicle(vehicleEntity, continuation);
    }

    public final Flow<ApiResult<SessionPracticeExamResponse>> sendSessionPracticeAndSyncPracticalRequest2(Context context, String sessionID) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        return FlowKt.flowOn((Flow) FlowKt.flow(new SessionRepository$sendSessionPracticeAndSyncPracticalRequest2$1(this, sessionID, context, null)), Dispatchers.getIO());
    }

    public final Flow<ApiResult<HistoricRecordPermissionsChangeResponse>> sendSessionStatusAppointment(Context context, String sessionID, EnumStatusAppointment sessionStatus) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        Intrinsics.checkNotNullParameter(sessionStatus, "sessionStatus");
        return (Flow) FlowKt.flow(new SessionRepository$sendSessionStatusAppointment$1(sessionID, sessionStatus, context, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object syncSessionProcess(Context context, String str, Continuation<? super Pair<Boolean, String>> continuation) {
        SessionRepository$syncSessionProcess$1 sessionRepository$syncSessionProcess$1;
        Object coroutine_suspended = null;
        int i = 0;
        SessionRepository sessionRepository = null;
        Object sessionSyncById;
        Context context2;
        List<QuestionPracticeExam> list;
        String type = null;
        if (continuation instanceof SessionRepository$syncSessionProcess$1) {
            sessionRepository$syncSessionProcess$1 = (SessionRepository$syncSessionProcess$1) continuation;
            int i2 = sessionRepository$syncSessionProcess$1.label;
            if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                sessionRepository$syncSessionProcess$1.label = i2 - IntCompanionObject.MIN_VALUE;
                Object obj = sessionRepository$syncSessionProcess$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sessionRepository$syncSessionProcess$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    sessionRepository$syncSessionProcess$1.L$0 = this;
                    sessionRepository$syncSessionProcess$1.L$1 = context;
                    sessionRepository$syncSessionProcess$1.L$2 = str;
                    sessionRepository$syncSessionProcess$1.label = 1;
                    obj = getAllQuestionSync(str, sessionRepository$syncSessionProcess$1);
                    if (obj != coroutine_suspended) {
                        sessionRepository = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            ResultKt.throwOnFailure(obj);
                            return obj;
                        }
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    list = (List) sessionRepository$syncSessionProcess$1.L$2;
                    context2 = (Context) sessionRepository$syncSessionProcess$1.L$1;
                    sessionRepository = (SessionRepository) sessionRepository$syncSessionProcess$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    SessionFullSync sessionFullSync = (SessionFullSync) obj;
                    SessionEntity session = sessionFullSync.getSession();
                    type = session == null ? session.getType() : null;
                    if (Intrinsics.areEqual(type, EnumClassType.name$default(EnumClassType.PRACTICE_EXAM, null, 1, null))) {
                        if (!Intrinsics.areEqual(type, EnumClassType.name$default(EnumClassType.PRACTICE, null, 1, null))) {
                            return new Pair(Boxing.boxBoolean(false), null);
                        }
                        SessionPracticeSyncRequest practiceRequest = sessionRepository.practiceRequest(sessionFullSync);
                        sessionRepository$syncSessionProcess$1.L$0 = null;
                        sessionRepository$syncSessionProcess$1.L$1 = null;
                        sessionRepository$syncSessionProcess$1.L$2 = null;
                        sessionRepository$syncSessionProcess$1.label = 4;
                        Object sendSessionPracticeAndSyncPracticalRequest = sessionRepository.sendSessionPracticeAndSyncPracticalRequest(context2, practiceRequest, sessionRepository$syncSessionProcess$1);
                        if (sendSessionPracticeAndSyncPracticalRequest != coroutine_suspended) {
                            return sendSessionPracticeAndSyncPracticalRequest;
                        }
                    } else {
                        if (list.isEmpty()) {
                            return new Pair(Boxing.boxBoolean(false), null);
                        }
                        SessionPracticeExamSyncRequest practiceExamRequest = sessionRepository.practiceExamRequest(sessionFullSync, list);
                        sessionRepository$syncSessionProcess$1.L$0 = null;
                        sessionRepository$syncSessionProcess$1.L$1 = null;
                        sessionRepository$syncSessionProcess$1.L$2 = null;
                        sessionRepository$syncSessionProcess$1.label = 3;
                        Object sendSessionPracticeAndSyncPracticalExamRequest = sessionRepository.sendSessionPracticeAndSyncPracticalExamRequest(context2, practiceExamRequest, sessionRepository$syncSessionProcess$1);
                        if (sendSessionPracticeAndSyncPracticalExamRequest != coroutine_suspended) {
                            return sendSessionPracticeAndSyncPracticalExamRequest;
                        }
                    }
                    return coroutine_suspended;
                }
                str = (String) sessionRepository$syncSessionProcess$1.L$2;
                context = (Context) sessionRepository$syncSessionProcess$1.L$1;
                sessionRepository = (SessionRepository) sessionRepository$syncSessionProcess$1.L$0;
                ResultKt.throwOnFailure(obj);
                List<QuestionPracticeExam> list2 = (List) obj;
                sessionRepository$syncSessionProcess$1.L$0 = sessionRepository;
                sessionRepository$syncSessionProcess$1.L$1 = context;
                sessionRepository$syncSessionProcess$1.L$2 = list2;
                sessionRepository$syncSessionProcess$1.label = 2;
                sessionSyncById = sessionRepository.getSessionSyncById(str, sessionRepository$syncSessionProcess$1);
                if (sessionSyncById != coroutine_suspended) {
                    context2 = context;
                    list = list2;
                    obj = sessionSyncById;
                    SessionFullSync sessionFullSync2 = (SessionFullSync) obj;
                    SessionEntity session2 = sessionFullSync2.getSession();
                    if (session2 == null) {
                    }
                    if (Intrinsics.areEqual(type, EnumClassType.name$default(EnumClassType.PRACTICE_EXAM, null, 1, null))) {
                    }
                }
                return coroutine_suspended;
            }
        }
        sessionRepository$syncSessionProcess$1 = new SessionRepository$syncSessionProcess$1(this, (Continuation) continuation);
        Object obj2 = sessionRepository$syncSessionProcess$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sessionRepository$syncSessionProcess$1.label;
        if (i != 0) {
        }
        List<QuestionPracticeExam> list22 = (List) obj2;
        sessionRepository$syncSessionProcess$1.L$0 = sessionRepository;
        sessionRepository$syncSessionProcess$1.L$1 = context;
        sessionRepository$syncSessionProcess$1.L$2 = list22;
        sessionRepository$syncSessionProcess$1.label = 2;
        sessionSyncById = sessionRepository.getSessionSyncById(str, sessionRepository$syncSessionProcess$1);
        if (sessionSyncById != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    public final Object updateDateEndClass(long j, String str, Continuation<? super Unit> continuation) {
        Object updateSessionBySessionId = this.sessionDao.updateSessionBySessionId(new SimpleSQLiteQuery("UPDATE session SET dateEndEntryClass = ? WHERE id = ?", new Object[]{Boxing.boxLong(j), str}), (Continuation) continuation);
        return updateSessionBySessionId == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateSessionBySessionId : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateDateEntryClass(long j, String str, Continuation<? super Long> continuation) {
        SessionRepository$updateDateEntryClass$1 sessionRepository$updateDateEntryClass$1;
        int i;
        if (continuation instanceof SessionRepository$updateDateEntryClass$1) {
            sessionRepository$updateDateEntryClass$1 = (SessionRepository$updateDateEntryClass$1) continuation;
            int i2 = sessionRepository$updateDateEntryClass$1.label;
            if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                sessionRepository$updateDateEntryClass$1.label = i2 - IntCompanionObject.MIN_VALUE;
                Object obj = sessionRepository$updateDateEntryClass$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sessionRepository$updateDateEntryClass$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    SimpleSQLiteQuery simpleSQLiteQuery = new SimpleSQLiteQuery("UPDATE session SET dateStartEntryClass = ? WHERE id = ?", new Object[]{Boxing.boxLong(j), str});
                    SessionDao sessionDao = this.sessionDao;
                    sessionRepository$updateDateEntryClass$1.label = 1;
                    obj = sessionDao.updateSessionBySessionId(simpleSQLiteQuery, sessionRepository$updateDateEntryClass$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Long l = (Long) obj;
                return Boxing.boxLong(l == null ? l.longValue() : 0L);
            }
        }
        sessionRepository$updateDateEntryClass$1 = new SessionRepository$updateDateEntryClass$1(this, (Continuation) continuation);
        Object obj2 = sessionRepository$updateDateEntryClass$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sessionRepository$updateDateEntryClass$1.label;
        if (i != 0) {
        }
        Long l2 = (Long) obj2;
        return Boxing.boxLong(l2 == null ? l2.longValue() : 0L);
    }

    public final Object updateIsFinished(String str, Continuation<? super Long> continuation) {
        return this.sessionDao.updateSessionBySessionId(new SimpleSQLiteQuery("UPDATE session SET isFinished = 1 WHERE id = ?", new Object[]{str}), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateIsPending(String str, String str2, Continuation<? super Long> continuation) {
        SessionRepository$updateIsPending$1 sessionRepository$updateIsPending$1;
        int i;
        if (continuation instanceof SessionRepository$updateIsPending$1) {
            sessionRepository$updateIsPending$1 = (SessionRepository$updateIsPending$1) continuation;
            int i2 = sessionRepository$updateIsPending$1.label;
            if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                sessionRepository$updateIsPending$1.label = i2 - IntCompanionObject.MIN_VALUE;
                Object obj = sessionRepository$updateIsPending$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sessionRepository$updateIsPending$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    SimpleSQLiteQuery simpleSQLiteQuery = new SimpleSQLiteQuery("UPDATE session SET isPendingSync = ? WHERE id = ?", new Object[]{str, str2});
                    SessionDao sessionDao = this.sessionDao;
                    sessionRepository$updateIsPending$1.label = 1;
                    obj = sessionDao.updateSessionBySessionId(simpleSQLiteQuery, sessionRepository$updateIsPending$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Long l = (Long) obj;
                return Boxing.boxLong(l == null ? l.longValue() : 0L);
            }
        }
        sessionRepository$updateIsPending$1 = new SessionRepository$updateIsPending$1(this, (Continuation) continuation);
        Object obj2 = sessionRepository$updateIsPending$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sessionRepository$updateIsPending$1.label;
        if (i != 0) {
        }
        Long l2 = (Long) obj2;
        return Boxing.boxLong(l2 == null ? l2.longValue() : 0L);
    }
}
