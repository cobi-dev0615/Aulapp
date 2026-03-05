package com.gse.aulapp.model.converter;

import com.gse.aulapp.model.data.entity.ClassRoomEntity;
import com.gse.aulapp.model.data.entity.LessonEntity;
import com.gse.aulapp.model.data.entity.SessionEntity;
import com.gse.aulapp.model.data.entity.StepProcessSessionEntity;
import com.gse.aulapp.model.data.entity.VehicleEntity;
import com.gse.aulapp.model.data.entity.entityFull.SessionFull;
import com.gse.aulapp.model.dto.ClassRoomDto;
import com.gse.aulapp.model.dto.LessonDto;
import com.gse.aulapp.model.dto.SessionDto;
import com.gse.aulapp.model.dto.StepProcessSessionDto;
import com.gse.aulapp.model.dto.VehicleDto;
import com.gse.aulapp.model.response.ClassRoomResponse;
import com.gse.aulapp.model.response.LessonResponse;
import com.gse.aulapp.model.response.SessionResponse;
import com.gse.aulapp.model.response.VehicleResponse;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/model/converter/SessionDataConverter;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class SessionDataConverter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJa\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0002\u0010\u001fJ\u0014\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010\rH\u0002J\u0014\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010\u0005H\u0002J\u0012\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010\tJ<\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u00112\b\u0010\"\u001a\u0004\u0018\u00010\r2\b\u0010%\u001a\u0004\u0018\u00010\u00052\b\u0010(\u001a\u0004\u0018\u00010\t2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-J\u001a\u0010/\u001a\b\u0012\u0004\u0012\u0002000-2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-J\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020*022\f\u00103\u001a\b\u0012\u0004\u0012\u0002040-J\u000e\u00105\u001a\u0002002\u0006\u00106\u001a\u00020.J\u001e\u00107\u001a\u00020*2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u00108\u001a\u00020\u001d2\u0006\u00109\u001a\u00020\u001dJ\u0010\u0010:\u001a\u00020'2\u0006\u0010(\u001a\u00020\u000bH\u0002J\u0010\u0010;\u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010<\u001a\u00020$2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006="}, d2 = {"Lcom/gse/aulapp/model/converter/SessionDataConverter$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "getVehicleEntityFromVehicleResponse", "Lcom/gse/aulapp/model/data/entity/VehicleEntity;", "vehicleResponse", "Lcom/gse/aulapp/model/response/VehicleResponse;", "getLessonEntityFromLessonResponse", "Lcom/gse/aulapp/model/data/entity/LessonEntity;", "lessonResponse", "Lcom/gse/aulapp/model/response/LessonResponse;", "getClassRoomEntityFormClassRoomResponse", "Lcom/gse/aulapp/model/data/entity/ClassRoomEntity;", "classRoomResponse", "Lcom/gse/aulapp/model/response/ClassRoomResponse;", "getSessionEntityFromSessionResponse", "Lcom/gse/aulapp/model/data/entity/SessionEntity;", "sessionResponse", "Lcom/gse/aulapp/model/response/SessionResponse;", "classRoomID", BuildConfig.FLAVOR, "vehicleID", "lessonID", "dateHead", "startEntryClass", BuildConfig.FLAVOR, "endEntryClass", "minBefore", BuildConfig.FLAVOR, "minAfter", "(Lcom/gse/aulapp/model/response/SessionResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;II)Lcom/gse/aulapp/model/data/entity/SessionEntity;", "getClassRoomDtoFromClassRoomEntity", "Lcom/gse/aulapp/model/dto/ClassRoomDto;", "classRoom", "getVehicleDtoFromVehicleEntity", "Lcom/gse/aulapp/model/dto/VehicleDto;", "vehicle", "getLessonDtoFromLessonEntity", "Lcom/gse/aulapp/model/dto/LessonDto;", "lesson", "getSessionDtoFromSessionEntity", "Lcom/gse/aulapp/model/dto/SessionDto;", "session", "listStepStatus", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/data/entity/StepProcessSessionEntity;", "getListStepSessionDtoFromStepSessionEntity", "Lcom/gse/aulapp/model/dto/StepProcessSessionDto;", "getListSessionDtoFromListSessionFull", BuildConfig.FLAVOR, "listSession", "Lcom/gse/aulapp/model/data/entity/entityFull/SessionFull;", "getStepProcessSessionDtoFromStepProcessSessionEntity", "step", "getSessionDtoBySessionResponse", "minToleranceEntryBefore", "minToleranceEntryAfter", "getLessonByLessonResponse", "getClassRoomDtoByClassRoomResponse", "getVehicleDtoByVehicleResponse", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSessionDataConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionDataConverter.kt\ncom/gse/aulapp/model/converter/SessionDataConverter$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,262:1\n1863#2,2:263\n1863#2,2:265\n1#3:267\n*S KotlinDebug\n*F\n+ 1 SessionDataConverter.kt\ncom/gse/aulapp/model/converter/SessionDataConverter$Companion\n*L\n174#1:263,2\n183#1:265,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final ClassRoomDto getClassRoomDtoByClassRoomResponse(ClassRoomResponse classRoomResponse) {
            return new ClassRoomDto(classRoomResponse.getClassroomID(), classRoomResponse.getNomenclature(), classRoomResponse.getLocation(), classRoomResponse.getType(), classRoomResponse.getAddress());
        }

        private final ClassRoomDto getClassRoomDtoFromClassRoomEntity(ClassRoomEntity classRoom) {
            if (classRoom != null) {
                return new ClassRoomDto(classRoom.getClassroomID(), classRoom.getNomenclature(), classRoom.getLocation(), classRoom.getType(), classRoom.getAddress());
            }
            return null;
        }

        private final LessonDto getLessonByLessonResponse(LessonResponse lesson) {
            return new LessonDto(lesson.getLessonID(), lesson.getName());
        }

        private final VehicleDto getVehicleDtoByVehicleResponse(VehicleResponse vehicleResponse) {
            return new VehicleDto(vehicleResponse.getVehicleID(), vehicleResponse.getPlates(), vehicleResponse.getLine(), vehicleResponse.getBrand(), vehicleResponse.getTagCode());
        }

        private final VehicleDto getVehicleDtoFromVehicleEntity(VehicleEntity vehicle) {
            if (vehicle != null) {
                return new VehicleDto(vehicle.getVehicleID(), vehicle.getPlates(), vehicle.getLine(), vehicle.getBrand(), vehicle.getTagCode());
            }
            return null;
        }

        public final ClassRoomEntity getClassRoomEntityFormClassRoomResponse(ClassRoomResponse classRoomResponse) {
            Intrinsics.checkNotNullParameter(classRoomResponse, "classRoomResponse");
            return new ClassRoomEntity(classRoomResponse.getClassroomID(), classRoomResponse.getNomenclature(), classRoomResponse.getLocation(), classRoomResponse.getType(), classRoomResponse.getAddress());
        }

        public final LessonDto getLessonDtoFromLessonEntity(LessonEntity lesson) {
            if (lesson != null) {
                return new LessonDto(lesson.getLessonID(), lesson.getName());
            }
            return null;
        }

        public final LessonEntity getLessonEntityFromLessonResponse(LessonResponse lessonResponse) {
            Intrinsics.checkNotNullParameter(lessonResponse, "lessonResponse");
            return new LessonEntity(lessonResponse.getLessonID(), lessonResponse.getName());
        }

        public final List<SessionDto> getListSessionDtoFromListSessionFull(List<SessionFull> listSession) {
            Intrinsics.checkNotNullParameter(listSession, "listSession");
            ArrayList arrayList = new ArrayList();
            for (SessionFull sessionFull : listSession) {
                arrayList.add(SessionDataConverter.INSTANCE.getSessionDtoFromSessionEntity(sessionFull.getSession(), sessionFull.getClassRoom(), sessionFull.getVehicle(), sessionFull.getLesson(), sessionFull.getListStepStatus()));
            }
            return arrayList;
        }

        public final List<StepProcessSessionDto> getListStepSessionDtoFromStepSessionEntity(List<StepProcessSessionEntity> listStepStatus) {
            Intrinsics.checkNotNullParameter(listStepStatus, "listStepStatus");
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listStepStatus.iterator();
            while (it.hasNext()) {
                arrayList.add(SessionDataConverter.INSTANCE.getStepProcessSessionDtoFromStepProcessSessionEntity((StepProcessSessionEntity) it.next()));
            }
            return arrayList;
        }

        public final SessionDto getSessionDtoBySessionResponse(SessionResponse sessionResponse, int minToleranceEntryBefore, int minToleranceEntryAfter) {
            ClassRoomDto classRoomDto;
            LessonDto lessonDto;
            Intrinsics.checkNotNullParameter(sessionResponse, "sessionResponse");
            String id = sessionResponse.getId();
            String date = sessionResponse.getDate();
            String start = sessionResponse.getStart();
            String end = sessionResponse.getEnd();
            Integer duration = sessionResponse.getDuration();
            String center = sessionResponse.getCenter();
            String category = sessionResponse.getCategory();
            String instructorID = sessionResponse.getInstructorID();
            ClassRoomResponse classroom = sessionResponse.getClassroom();
            ClassRoomDto classRoomDtoByClassRoomResponse = classroom != null ? SessionDataConverter.INSTANCE.getClassRoomDtoByClassRoomResponse(classroom) : null;
            VehicleResponse vehicle = sessionResponse.getVehicle();
            VehicleDto vehicleDtoByVehicleResponse = vehicle != null ? SessionDataConverter.INSTANCE.getVehicleDtoByVehicleResponse(vehicle) : null;
            String cellphoneNumber = sessionResponse.getCellphoneNumber();
            String apprentice = sessionResponse.getApprentice();
            String type = sessionResponse.getType();
            String course = sessionResponse.getCourse();
            LessonResponse lesson = sessionResponse.getLesson();
            if (lesson != null) {
                lessonDto = SessionDataConverter.INSTANCE.getLessonByLessonResponse(lesson);
                classRoomDto = classRoomDtoByClassRoomResponse;
            } else {
                classRoomDto = classRoomDtoByClassRoomResponse;
                lessonDto = null;
            }
            return new SessionDto(id, date, start, end, duration, center, category, instructorID, classRoomDto, vehicleDtoByVehicleResponse, cellphoneNumber, apprentice, type, course, lessonDto, sessionResponse.getApprenticeEmail(), CollectionsKt.emptyList(), Boolean.FALSE, BuildConfig.FLAVOR, sessionResponse.getEnabledToStart(), sessionResponse.getMessageEnable(), Integer.valueOf(minToleranceEntryBefore), Integer.valueOf(minToleranceEntryAfter), sessionResponse.getStatusAppointment());
        }

        public final SessionDto getSessionDtoFromSessionEntity(SessionEntity session, ClassRoomEntity classRoom, VehicleEntity vehicle, LessonEntity lesson, List<StepProcessSessionEntity> listStepStatus) {
            Intrinsics.checkNotNullParameter(listStepStatus, "listStepStatus");
            String id = session != null ? session.getId() : null;
            String str = BuildConfig.FLAVOR;
            if (id == null) {
                id = BuildConfig.FLAVOR;
            }
            String date = session != null ? session.getDate() : null;
            if (date == null) {
                date = BuildConfig.FLAVOR;
            }
            String start = session != null ? session.getStart() : null;
            if (start == null) {
                start = BuildConfig.FLAVOR;
            }
            String end = session != null ? session.getEnd() : null;
            if (end == null) {
                end = BuildConfig.FLAVOR;
            }
            Integer duration = session != null ? session.getDuration() : null;
            String center = session != null ? session.getCenter() : null;
            if (center == null) {
                center = BuildConfig.FLAVOR;
            }
            String category = session != null ? session.getCategory() : null;
            if (category == null) {
                category = BuildConfig.FLAVOR;
            }
            String instructorID = session != null ? session.getInstructorID() : null;
            if (instructorID == null) {
                instructorID = BuildConfig.FLAVOR;
            }
            ClassRoomDto classRoomDtoFromClassRoomEntity = getClassRoomDtoFromClassRoomEntity(classRoom);
            VehicleDto vehicleDtoFromVehicleEntity = getVehicleDtoFromVehicleEntity(vehicle);
            String cellphoneNumber = session != null ? session.getCellphoneNumber() : null;
            if (cellphoneNumber == null) {
                cellphoneNumber = BuildConfig.FLAVOR;
            }
            String apprentice = session != null ? session.getApprentice() : null;
            if (apprentice == null) {
                apprentice = BuildConfig.FLAVOR;
            }
            String type = session != null ? session.getType() : null;
            if (type == null) {
                type = BuildConfig.FLAVOR;
            }
            String course = session != null ? session.getCourse() : null;
            if (course != null) {
                str = course;
            }
            return new SessionDto(id, date, start, end, duration, center, category, instructorID, classRoomDtoFromClassRoomEntity, vehicleDtoFromVehicleEntity, cellphoneNumber, apprentice, type, str, getLessonDtoFromLessonEntity(lesson), session != null ? session.getApprenticeEmail() : null, getListStepSessionDtoFromStepSessionEntity(listStepStatus), session != null ? Boolean.valueOf(session.getStartExam()) : null, session != null ? session.getDateStartEntry() : null, session != null ? session.getEnabledToStart() : null, session != null ? session.getMessageEnable() : null, null, null, session != null ? session.getStatusAppointment() : null, 6291456, null);
        }

        public final SessionEntity getSessionEntityFromSessionResponse(SessionResponse sessionResponse, String classRoomID, String vehicleID, String lessonID, String dateHead, Long startEntryClass, Long endEntryClass, int minBefore, int minAfter) {
            String id = sessionResponse != null ? sessionResponse.getId() : null;
            if (id == null) {
                id = BuildConfig.FLAVOR;
            }
            String date = sessionResponse != null ? sessionResponse.getDate() : null;
            if (date == null) {
                date = BuildConfig.FLAVOR;
            }
            String start = sessionResponse != null ? sessionResponse.getStart() : null;
            if (start == null) {
                start = BuildConfig.FLAVOR;
            }
            String end = sessionResponse != null ? sessionResponse.getEnd() : null;
            if (end == null) {
                end = BuildConfig.FLAVOR;
            }
            Integer duration = sessionResponse != null ? sessionResponse.getDuration() : null;
            String center = sessionResponse != null ? sessionResponse.getCenter() : null;
            if (center == null) {
                center = BuildConfig.FLAVOR;
            }
            String category = sessionResponse != null ? sessionResponse.getCategory() : null;
            if (category == null) {
                category = BuildConfig.FLAVOR;
            }
            String instructorID = sessionResponse != null ? sessionResponse.getInstructorID() : null;
            if (instructorID == null) {
                instructorID = BuildConfig.FLAVOR;
            }
            String cellphoneNumber = sessionResponse != null ? sessionResponse.getCellphoneNumber() : null;
            if (cellphoneNumber == null) {
                cellphoneNumber = BuildConfig.FLAVOR;
            }
            String apprentice = sessionResponse != null ? sessionResponse.getApprentice() : null;
            if (apprentice == null) {
                apprentice = BuildConfig.FLAVOR;
            }
            String type = sessionResponse != null ? sessionResponse.getType() : null;
            if (type == null) {
                type = BuildConfig.FLAVOR;
            }
            String course = sessionResponse != null ? sessionResponse.getCourse() : null;
            if (course == null) {
                course = BuildConfig.FLAVOR;
            }
            return new SessionEntity(id, date, start, end, duration, center, category, instructorID, classRoomID, vehicleID, cellphoneNumber, apprentice, type, course, lessonID, dateHead == null ? BuildConfig.FLAVOR : dateHead, startEntryClass, endEntryClass, null, null, sessionResponse != null ? sessionResponse.getApprenticeEmail() : null, sessionResponse != null ? sessionResponse.getApprenticeID() : null, sessionResponse != null ? sessionResponse.getApprenticeDocumentNumber() : null, sessionResponse != null ? sessionResponse.getApprenticeDocumentType() : null, false, false, false, null, sessionResponse != null ? sessionResponse.getEnabledToStart() : null, sessionResponse != null ? sessionResponse.getMessageEnable() : null, sessionResponse != null ? sessionResponse.getStatusAppointment() : null, minAfter, minBefore);
        }

        public final StepProcessSessionDto getStepProcessSessionDtoFromStepProcessSessionEntity(StepProcessSessionEntity step) {
            Intrinsics.checkNotNullParameter(step, "step");
            return new StepProcessSessionDto(step.getSessionID(), step.getType(), step.getStatus(), step.isEntry());
        }

        public final VehicleEntity getVehicleEntityFromVehicleResponse(VehicleResponse vehicleResponse) {
            Intrinsics.checkNotNullParameter(vehicleResponse, "vehicleResponse");
            return new VehicleEntity(vehicleResponse.getVehicleID(), vehicleResponse.getPlates(), vehicleResponse.getLine(), vehicleResponse.getBrand(), vehicleResponse.getTagCode());
        }

        private Companion() {
        }
    }
}
