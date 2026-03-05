package com.gse.aulapp.model.dto;

import android.os.Parcel;
import android.os.Parcelable;
import co.ceduladigital.sdk.q;
import co.ceduladigital.sdk.x5;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b3\b\u0087\b\u0018\u00002\u00020\u0001Bý\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0007\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\"\u0010#B\t\b\u0016¢\u0006\u0004\b\"\u0010$J\u001d\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0007¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0007¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b/\u0010,J\u001a\u00102\u001a\u00020\u001a2\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b2\u00103R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010.\"\u0004\b6\u00107R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b8\u0010.R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b9\u0010.R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b:\u0010.R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b>\u0010.R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b?\u0010.R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b@\u0010.R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010D\u001a\u0004\bE\u0010FR$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u00104\u001a\u0004\bG\u0010.\"\u0004\bH\u00107R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u00104\u001a\u0004\bI\u0010.R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u00104\u001a\u0004\bJ\u0010.R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u00104\u001a\u0004\bK\u0010.R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010L\u001a\u0004\bM\u0010NR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u00104\u001a\u0004\bO\u0010.R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006¢\u0006\f\n\u0004\b\u0019\u0010P\u001a\u0004\bQ\u0010RR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010S\u001a\u0004\bT\u0010UR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u00104\u001a\u0004\bV\u0010.R$\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010S\u001a\u0004\bW\u0010U\"\u0004\bX\u0010YR$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u00104\u001a\u0004\bZ\u0010.\"\u0004\b[\u00107R$\u0010\u001f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010;\u001a\u0004\b\\\u0010=\"\u0004\b]\u0010^R$\u0010 \u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010;\u001a\u0004\b_\u0010=\"\u0004\b`\u0010^R$\u0010!\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u00104\u001a\u0004\ba\u0010.\"\u0004\bb\u00107¨\u0006c"}, d2 = {"Lcom/gse/aulapp/model/dto/SessionDto;", "Lcom/gse/aulapp/model/dto/GeneralSessionDto;", BuildConfig.FLAVOR, "id", "date", "start", "end", BuildConfig.FLAVOR, "duration", "center", "category", "instructorID", "Lcom/gse/aulapp/model/dto/ClassRoomDto;", "classroom", "Lcom/gse/aulapp/model/dto/VehicleDto;", "vehicle", "cellphoneNumber", "apprentice", "type", "course", "Lcom/gse/aulapp/model/dto/LessonDto;", "lesson", "apprenticeEmail", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/dto/StepProcessSessionDto;", "listStepStatus", BuildConfig.FLAVOR, "startExam", "startDateEntryClass", "enabledToStart", "messageEnable", "minToleranceEntryBefore", "minToleranceEntryAfter", "statusAppointment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/gse/aulapp/model/dto/ClassRoomDto;Lcom/gse/aulapp/model/dto/VehicleDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/gse/aulapp/model/dto/LessonDto;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "()V", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "setId", "(Ljava/lang/String;)V", "getDate", "getStart", "getEnd", "Ljava/lang/Integer;", "getDuration", "()Ljava/lang/Integer;", "getCenter", "getCategory", "getInstructorID", "Lcom/gse/aulapp/model/dto/ClassRoomDto;", "getClassroom", "()Lcom/gse/aulapp/model/dto/ClassRoomDto;", "Lcom/gse/aulapp/model/dto/VehicleDto;", "getVehicle", "()Lcom/gse/aulapp/model/dto/VehicleDto;", "getCellphoneNumber", "setCellphoneNumber", "getApprentice", "getType", "getCourse", "Lcom/gse/aulapp/model/dto/LessonDto;", "getLesson", "()Lcom/gse/aulapp/model/dto/LessonDto;", "getApprenticeEmail", "Ljava/util/List;", "getListStepStatus", "()Ljava/util/List;", "Ljava/lang/Boolean;", "getStartExam", "()Ljava/lang/Boolean;", "getStartDateEntryClass", "getEnabledToStart", "setEnabledToStart", "(Ljava/lang/Boolean;)V", "getMessageEnable", "setMessageEnable", "getMinToleranceEntryBefore", "setMinToleranceEntryBefore", "(Ljava/lang/Integer;)V", "getMinToleranceEntryAfter", "setMinToleranceEntryAfter", "getStatusAppointment", "setStatusAppointment", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SessionDto extends GeneralSessionDto {
    public static final Parcelable.Creator<SessionDto> CREATOR = new Creator();
    private final String apprentice;
    private final String apprenticeEmail;
    private final String category;
    private String cellphoneNumber;
    private final String center;
    private final ClassRoomDto classroom;
    private final String course;
    private final String date;
    private final Integer duration;
    private Boolean enabledToStart;
    private final String end;
    private String id;
    private final String instructorID;
    private final LessonDto lesson;
    private final List<StepProcessSessionDto> listStepStatus;
    private String messageEnable;
    private Integer minToleranceEntryAfter;
    private Integer minToleranceEntryBefore;
    private final String start;
    private final String startDateEntryClass;
    private final Boolean startExam;
    private String statusAppointment;
    private final String type;
    private final VehicleDto vehicle;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SessionDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SessionDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            ClassRoomDto createFromParcel = parcel.readInt() == 0 ? null : ClassRoomDto.CREATOR.createFromParcel(parcel);
            VehicleDto createFromParcel2 = parcel.readInt() == 0 ? null : VehicleDto.CREATOR.createFromParcel(parcel);
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            LessonDto createFromParcel3 = parcel.readInt() == 0 ? null : LessonDto.CREATOR.createFromParcel(parcel);
            String readString12 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = q.b(StepProcessSessionDto.CREATOR, parcel, arrayList, i, 1);
                readInt = readInt;
                readString2 = readString2;
            }
            String str = readString2;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString13 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SessionDto(readString, str, readString3, readString4, valueOf3, readString5, readString6, readString7, createFromParcel, createFromParcel2, readString8, readString9, readString10, readString11, createFromParcel3, readString12, arrayList, valueOf, readString13, valueOf2, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SessionDto[] newArray(int i) {
            return new SessionDto[i];
        }
    }

    public /* synthetic */ SessionDto(String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, ClassRoomDto classRoomDto, VehicleDto vehicleDto, String str8, String str9, String str10, String str11, LessonDto lessonDto, String str12, List list, Boolean bool, String str13, Boolean bool2, String str14, Integer num2, Integer num3, String str15, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, num, str5, str6, str7, classRoomDto, vehicleDto, str8, str9, str10, str11, lessonDto, str12, list, bool, str13, bool2, str14, (i & 2097152) != 0 ? 20 : num2, (i & 4194304) != 0 ? 20 : num3, str15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionDto)) {
            return false;
        }
        SessionDto sessionDto = (SessionDto) other;
        return Intrinsics.areEqual(this.id, sessionDto.id) && Intrinsics.areEqual(this.date, sessionDto.date) && Intrinsics.areEqual(this.start, sessionDto.start) && Intrinsics.areEqual(this.end, sessionDto.end) && Intrinsics.areEqual(this.duration, sessionDto.duration) && Intrinsics.areEqual(this.center, sessionDto.center) && Intrinsics.areEqual(this.category, sessionDto.category) && Intrinsics.areEqual(this.instructorID, sessionDto.instructorID) && Intrinsics.areEqual(this.classroom, sessionDto.classroom) && Intrinsics.areEqual(this.vehicle, sessionDto.vehicle) && Intrinsics.areEqual(this.cellphoneNumber, sessionDto.cellphoneNumber) && Intrinsics.areEqual(this.apprentice, sessionDto.apprentice) && Intrinsics.areEqual(this.type, sessionDto.type) && Intrinsics.areEqual(this.course, sessionDto.course) && Intrinsics.areEqual(this.lesson, sessionDto.lesson) && Intrinsics.areEqual(this.apprenticeEmail, sessionDto.apprenticeEmail) && Intrinsics.areEqual(this.listStepStatus, sessionDto.listStepStatus) && Intrinsics.areEqual(this.startExam, sessionDto.startExam) && Intrinsics.areEqual(this.startDateEntryClass, sessionDto.startDateEntryClass) && Intrinsics.areEqual(this.enabledToStart, sessionDto.enabledToStart) && Intrinsics.areEqual(this.messageEnable, sessionDto.messageEnable) && Intrinsics.areEqual(this.minToleranceEntryBefore, sessionDto.minToleranceEntryBefore) && Intrinsics.areEqual(this.minToleranceEntryAfter, sessionDto.minToleranceEntryAfter) && Intrinsics.areEqual(this.statusAppointment, sessionDto.statusAppointment);
    }

    public final String getApprentice() {
        return this.apprentice;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getCellphoneNumber() {
        return this.cellphoneNumber;
    }

    public final ClassRoomDto getClassroom() {
        return this.classroom;
    }

    public final String getDate() {
        return this.date;
    }

    public final Integer getDuration() {
        return this.duration;
    }

    public final Boolean getEnabledToStart() {
        return this.enabledToStart;
    }

    public final String getEnd() {
        return this.end;
    }

    @Override // com.gse.aulapp.model.dto.GeneralSessionDto
    public String getId() {
        return this.id;
    }

    public final LessonDto getLesson() {
        return this.lesson;
    }

    public final List<StepProcessSessionDto> getListStepStatus() {
        return this.listStepStatus;
    }

    public final String getMessageEnable() {
        return this.messageEnable;
    }

    public final Integer getMinToleranceEntryAfter() {
        return this.minToleranceEntryAfter;
    }

    public final Integer getMinToleranceEntryBefore() {
        return this.minToleranceEntryBefore;
    }

    public final String getStart() {
        return this.start;
    }

    public final String getStartDateEntryClass() {
        return this.startDateEntryClass;
    }

    public final Boolean getStartExam() {
        return this.startExam;
    }

    public final String getStatusAppointment() {
        return this.statusAppointment;
    }

    public final String getType() {
        return this.type;
    }

    public final VehicleDto getVehicle() {
        return this.vehicle;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.date;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.start;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.end;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.duration;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.center;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.category;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.instructorID;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        ClassRoomDto classRoomDto = this.classroom;
        int hashCode9 = (hashCode8 + (classRoomDto == null ? 0 : classRoomDto.hashCode())) * 31;
        VehicleDto vehicleDto = this.vehicle;
        int hashCode10 = (hashCode9 + (vehicleDto == null ? 0 : vehicleDto.hashCode())) * 31;
        String str7 = this.cellphoneNumber;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.apprentice;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.type;
        int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.course;
        int hashCode14 = (hashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        LessonDto lessonDto = this.lesson;
        int hashCode15 = (hashCode14 + (lessonDto == null ? 0 : lessonDto.hashCode())) * 31;
        String str11 = this.apprenticeEmail;
        int hashCode16 = (this.listStepStatus.hashCode() + ((hashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31)) * 31;
        Boolean bool = this.startExam;
        int hashCode17 = (hashCode16 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str12 = this.startDateEntryClass;
        int hashCode18 = (hashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Boolean bool2 = this.enabledToStart;
        int hashCode19 = (hashCode18 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str13 = this.messageEnable;
        int hashCode20 = (hashCode19 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Integer num2 = this.minToleranceEntryBefore;
        int hashCode21 = (hashCode20 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.minToleranceEntryAfter;
        int hashCode22 = (hashCode21 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str14 = this.statusAppointment;
        return hashCode22 + (str14 != null ? str14.hashCode() : 0);
    }

    @Override // com.gse.aulapp.model.dto.GeneralSessionDto
    public void setId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final void setMinToleranceEntryAfter(Integer num) {
        this.minToleranceEntryAfter = num;
    }

    public final void setMinToleranceEntryBefore(Integer num) {
        this.minToleranceEntryBefore = num;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.date;
        String str3 = this.start;
        String str4 = this.end;
        Integer num = this.duration;
        String str5 = this.center;
        String str6 = this.category;
        String str7 = this.instructorID;
        ClassRoomDto classRoomDto = this.classroom;
        VehicleDto vehicleDto = this.vehicle;
        String str8 = this.cellphoneNumber;
        String str9 = this.apprentice;
        String str10 = this.type;
        String str11 = this.course;
        LessonDto lessonDto = this.lesson;
        String str12 = this.apprenticeEmail;
        List<StepProcessSessionDto> list = this.listStepStatus;
        Boolean bool = this.startExam;
        String str13 = this.startDateEntryClass;
        Boolean bool2 = this.enabledToStart;
        String str14 = this.messageEnable;
        Integer num2 = this.minToleranceEntryBefore;
        Integer num3 = this.minToleranceEntryAfter;
        String str15 = this.statusAppointment;
        StringBuilder r = x5.r("SessionDto(id=", str, ", date=", str2, ", start=");
        x5.z(r, str3, ", end=", str4, ", duration=");
        r.append(num);
        r.append(", center=");
        r.append(str5);
        r.append(", category=");
        x5.z(r, str6, ", instructorID=", str7, ", classroom=");
        r.append(classRoomDto);
        r.append(", vehicle=");
        r.append(vehicleDto);
        r.append(", cellphoneNumber=");
        x5.z(r, str8, ", apprentice=", str9, ", type=");
        x5.z(r, str10, ", course=", str11, ", lesson=");
        r.append(lessonDto);
        r.append(", apprenticeEmail=");
        r.append(str12);
        r.append(", listStepStatus=");
        r.append(list);
        r.append(", startExam=");
        r.append(bool);
        r.append(", startDateEntryClass=");
        r.append(str13);
        r.append(", enabledToStart=");
        r.append(bool2);
        r.append(", messageEnable=");
        r.append(str14);
        r.append(", minToleranceEntryBefore=");
        r.append(num2);
        r.append(", minToleranceEntryAfter=");
        r.append(num3);
        r.append(", statusAppointment=");
        r.append(str15);
        r.append(")");
        return r.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.date);
        dest.writeString(this.start);
        dest.writeString(this.end);
        Integer num = this.duration;
        if (num == null) {
            dest.writeInt(0);
        } else {
            x5.w(dest, 1, num);
        }
        dest.writeString(this.center);
        dest.writeString(this.category);
        dest.writeString(this.instructorID);
        ClassRoomDto classRoomDto = this.classroom;
        if (classRoomDto == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            classRoomDto.writeToParcel(dest, flags);
        }
        VehicleDto vehicleDto = this.vehicle;
        if (vehicleDto == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            vehicleDto.writeToParcel(dest, flags);
        }
        dest.writeString(this.cellphoneNumber);
        dest.writeString(this.apprentice);
        dest.writeString(this.type);
        dest.writeString(this.course);
        LessonDto lessonDto = this.lesson;
        if (lessonDto == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            lessonDto.writeToParcel(dest, flags);
        }
        dest.writeString(this.apprenticeEmail);
        List<StepProcessSessionDto> list = this.listStepStatus;
        dest.writeInt(list.size());
        Iterator<StepProcessSessionDto> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        Boolean bool = this.startExam;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            x5.v(dest, 1, bool);
        }
        dest.writeString(this.startDateEntryClass);
        Boolean bool2 = this.enabledToStart;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            x5.v(dest, 1, bool2);
        }
        dest.writeString(this.messageEnable);
        Integer num2 = this.minToleranceEntryBefore;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            x5.w(dest, 1, num2);
        }
        Integer num3 = this.minToleranceEntryAfter;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            x5.w(dest, 1, num3);
        }
        dest.writeString(this.statusAppointment);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionDto(String id, String str, String str2, String str3, Integer num, String str4, String str5, String str6, ClassRoomDto classRoomDto, VehicleDto vehicleDto, String str7, String str8, String str9, String str10, LessonDto lessonDto, String str11, List<StepProcessSessionDto> listStepStatus, Boolean bool, String str12, Boolean bool2, String str13, Integer num2, Integer num3, String str14) {
        super(id);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(listStepStatus, "listStepStatus");
        this.id = id;
        this.date = str;
        this.start = str2;
        this.end = str3;
        this.duration = num;
        this.center = str4;
        this.category = str5;
        this.instructorID = str6;
        this.classroom = classRoomDto;
        this.vehicle = vehicleDto;
        this.cellphoneNumber = str7;
        this.apprentice = str8;
        this.type = str9;
        this.course = str10;
        this.lesson = lessonDto;
        this.apprenticeEmail = str11;
        this.listStepStatus = listStepStatus;
        this.startExam = bool;
        this.startDateEntryClass = str12;
        this.enabledToStart = bool2;
        this.messageEnable = str13;
        this.minToleranceEntryBefore = num2;
        this.minToleranceEntryAfter = num3;
        this.statusAppointment = str14;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SessionDto() {
        this(BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, null, null, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, null, null, r18, r19, BuildConfig.FLAVOR, r19, BuildConfig.FLAVOR, 0, 0, BuildConfig.FLAVOR);
        List emptyList = CollectionsKt.emptyList();
        Boolean bool = Boolean.FALSE;
    }
}
