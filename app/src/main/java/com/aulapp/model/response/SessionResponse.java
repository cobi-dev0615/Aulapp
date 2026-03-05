package com.gse.aulapp.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.x5;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\bB\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bë\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001f\u0010 J\u0006\u0010]\u001a\u00020\bJ\u0016\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020\bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R\"\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010/\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\"\"\u0004\b1\u0010$R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\"\"\u0004\b3\u0010$R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\"\"\u0004\b5\u0010$R \u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R \u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R \u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\"\"\u0004\b?\u0010$R \u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\"\"\u0004\bA\u0010$R \u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\"\"\u0004\bC\u0010$R \u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\"\"\u0004\bE\u0010$R \u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR \u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\"\"\u0004\bK\u0010$R \u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\"\"\u0004\bM\u0010$R \u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\"\"\u0004\bO\u0010$R \u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\"\"\u0004\bQ\u0010$R \u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\"\"\u0004\bS\u0010$R\"\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010X\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR \u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\"\"\u0004\bZ\u0010$R \u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\"\"\u0004\b\\\u0010$¨\u0006c"}, d2 = {"Lcom/gse/aulapp/model/response/SessionResponse;", "Landroid/os/Parcelable;", "id", BuildConfig.FLAVOR, "date", "start", "end", "duration", BuildConfig.FLAVOR, "center", "category", "instructorID", "classroom", "Lcom/gse/aulapp/model/response/ClassRoomResponse;", "vehicle", "Lcom/gse/aulapp/model/response/VehicleResponse;", "cellphoneNumber", "apprentice", "type", "course", "lesson", "Lcom/gse/aulapp/model/response/LessonResponse;", "apprenticeEmail", "apprenticeID", "apprenticeDocumentNumber", "apprenticeDocumentType", "startExam", "enabledToStart", BuildConfig.FLAVOR, "messageEnable", "statusAppointment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/gse/aulapp/model/response/ClassRoomResponse;Lcom/gse/aulapp/model/response/VehicleResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/gse/aulapp/model/response/LessonResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getDate", "setDate", "getStart", "setStart", "getEnd", "setEnd", "getDuration", "()Ljava/lang/Integer;", "setDuration", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCenter", "setCenter", "getCategory", "setCategory", "getInstructorID", "setInstructorID", "getClassroom", "()Lcom/gse/aulapp/model/response/ClassRoomResponse;", "setClassroom", "(Lcom/gse/aulapp/model/response/ClassRoomResponse;)V", "getVehicle", "()Lcom/gse/aulapp/model/response/VehicleResponse;", "setVehicle", "(Lcom/gse/aulapp/model/response/VehicleResponse;)V", "getCellphoneNumber", "setCellphoneNumber", "getApprentice", "setApprentice", "getType", "setType", "getCourse", "setCourse", "getLesson", "()Lcom/gse/aulapp/model/response/LessonResponse;", "setLesson", "(Lcom/gse/aulapp/model/response/LessonResponse;)V", "getApprenticeEmail", "setApprenticeEmail", "getApprenticeID", "setApprenticeID", "getApprenticeDocumentNumber", "setApprenticeDocumentNumber", "getApprenticeDocumentType", "setApprenticeDocumentType", "getStartExam", "setStartExam", "getEnabledToStart", "()Ljava/lang/Boolean;", "setEnabledToStart", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getMessageEnable", "setMessageEnable", "getStatusAppointment", "setStatusAppointment", "describeContents", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SessionResponse implements Parcelable {
    public static final Parcelable.Creator<SessionResponse> CREATOR = new Creator();

    @SerializedName("apprentice")
    @Expose
    private String apprentice;

    @SerializedName("apprenticeDocumentNumber")
    @Expose
    private String apprenticeDocumentNumber;

    @SerializedName("apprenticeDocumentType")
    @Expose
    private String apprenticeDocumentType;

    @SerializedName("apprenticeEmail")
    @Expose
    private String apprenticeEmail;

    @SerializedName("apprenticeID")
    @Expose
    private String apprenticeID;

    @SerializedName("category")
    @Expose
    private String category;

    @SerializedName("cellphoneNumber")
    @Expose
    private String cellphoneNumber;

    @SerializedName("center")
    @Expose
    private String center;

    @SerializedName("classroom")
    @Expose
    private ClassRoomResponse classroom;

    @SerializedName("course")
    @Expose
    private String course;

    @SerializedName("date")
    @Expose
    private String date;

    @SerializedName("duration")
    @Expose
    private Integer duration;

    @SerializedName("enabledToStart")
    @Expose
    private Boolean enabledToStart;

    @SerializedName("end")
    @Expose
    private String end;

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("instructorID")
    @Expose
    private String instructorID;

    @SerializedName("lesson")
    @Expose
    private LessonResponse lesson;

    @SerializedName("message")
    @Expose
    private String messageEnable;

    @SerializedName("start")
    @Expose
    private String start;

    @SerializedName("startExam")
    @Expose
    private String startExam;

    @SerializedName("statusAppointment")
    @Expose
    private String statusAppointment;

    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("vehicle")
    @Expose
    private VehicleResponse vehicle;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SessionResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SessionResponse createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            ClassRoomResponse createFromParcel = parcel.readInt() == 0 ? null : ClassRoomResponse.CREATOR.createFromParcel(parcel);
            VehicleResponse createFromParcel2 = parcel.readInt() == 0 ? null : VehicleResponse.CREATOR.createFromParcel(parcel);
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            LessonResponse createFromParcel3 = parcel.readInt() == 0 ? null : LessonResponse.CREATOR.createFromParcel(parcel);
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            String readString15 = parcel.readString();
            String readString16 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SessionResponse(readString, readString2, readString3, readString4, valueOf2, readString5, readString6, readString7, createFromParcel, createFromParcel2, readString8, readString9, readString10, readString11, createFromParcel3, readString12, readString13, readString14, readString15, readString16, valueOf, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SessionResponse[] newArray(int i) {
            return new SessionResponse[i];
        }
    }

    public SessionResponse(String id, String str, String str2, String str3, Integer num, String str4, String str5, String str6, ClassRoomResponse classRoomResponse, VehicleResponse vehicleResponse, String str7, String str8, String str9, String str10, LessonResponse lessonResponse, String str11, String str12, String str13, String str14, String str15, Boolean bool, String str16, String str17) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.date = str;
        this.start = str2;
        this.end = str3;
        this.duration = num;
        this.center = str4;
        this.category = str5;
        this.instructorID = str6;
        this.classroom = classRoomResponse;
        this.vehicle = vehicleResponse;
        this.cellphoneNumber = str7;
        this.apprentice = str8;
        this.type = str9;
        this.course = str10;
        this.lesson = lessonResponse;
        this.apprenticeEmail = str11;
        this.apprenticeID = str12;
        this.apprenticeDocumentNumber = str13;
        this.apprenticeDocumentType = str14;
        this.startExam = str15;
        this.enabledToStart = bool;
        this.messageEnable = str16;
        this.statusAppointment = str17;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getApprentice() {
        return this.apprentice;
    }

    public final String getApprenticeDocumentNumber() {
        return this.apprenticeDocumentNumber;
    }

    public final String getApprenticeDocumentType() {
        return this.apprenticeDocumentType;
    }

    public final String getApprenticeEmail() {
        return this.apprenticeEmail;
    }

    public final String getApprenticeID() {
        return this.apprenticeID;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getCellphoneNumber() {
        return this.cellphoneNumber;
    }

    public final String getCenter() {
        return this.center;
    }

    public final ClassRoomResponse getClassroom() {
        return this.classroom;
    }

    public final String getCourse() {
        return this.course;
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

    public final String getId() {
        return this.id;
    }

    public final String getInstructorID() {
        return this.instructorID;
    }

    public final LessonResponse getLesson() {
        return this.lesson;
    }

    public final String getMessageEnable() {
        return this.messageEnable;
    }

    public final String getStart() {
        return this.start;
    }

    public final String getStartExam() {
        return this.startExam;
    }

    public final String getStatusAppointment() {
        return this.statusAppointment;
    }

    public final String getType() {
        return this.type;
    }

    public final VehicleResponse getVehicle() {
        return this.vehicle;
    }

    public final void setApprentice(String str) {
        this.apprentice = str;
    }

    public final void setApprenticeDocumentNumber(String str) {
        this.apprenticeDocumentNumber = str;
    }

    public final void setApprenticeDocumentType(String str) {
        this.apprenticeDocumentType = str;
    }

    public final void setApprenticeEmail(String str) {
        this.apprenticeEmail = str;
    }

    public final void setApprenticeID(String str) {
        this.apprenticeID = str;
    }

    public final void setCategory(String str) {
        this.category = str;
    }

    public final void setCellphoneNumber(String str) {
        this.cellphoneNumber = str;
    }

    public final void setCenter(String str) {
        this.center = str;
    }

    public final void setClassroom(ClassRoomResponse classRoomResponse) {
        this.classroom = classRoomResponse;
    }

    public final void setCourse(String str) {
        this.course = str;
    }

    public final void setDate(String str) {
        this.date = str;
    }

    public final void setDuration(Integer num) {
        this.duration = num;
    }

    public final void setEnabledToStart(Boolean bool) {
        this.enabledToStart = bool;
    }

    public final void setEnd(String str) {
        this.end = str;
    }

    public final void setId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final void setInstructorID(String str) {
        this.instructorID = str;
    }

    public final void setLesson(LessonResponse lessonResponse) {
        this.lesson = lessonResponse;
    }

    public final void setMessageEnable(String str) {
        this.messageEnable = str;
    }

    public final void setStart(String str) {
        this.start = str;
    }

    public final void setStartExam(String str) {
        this.startExam = str;
    }

    public final void setStatusAppointment(String str) {
        this.statusAppointment = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setVehicle(VehicleResponse vehicleResponse) {
        this.vehicle = vehicleResponse;
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
        ClassRoomResponse classRoomResponse = this.classroom;
        if (classRoomResponse == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            classRoomResponse.writeToParcel(dest, flags);
        }
        VehicleResponse vehicleResponse = this.vehicle;
        if (vehicleResponse == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            vehicleResponse.writeToParcel(dest, flags);
        }
        dest.writeString(this.cellphoneNumber);
        dest.writeString(this.apprentice);
        dest.writeString(this.type);
        dest.writeString(this.course);
        LessonResponse lessonResponse = this.lesson;
        if (lessonResponse == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            lessonResponse.writeToParcel(dest, flags);
        }
        dest.writeString(this.apprenticeEmail);
        dest.writeString(this.apprenticeID);
        dest.writeString(this.apprenticeDocumentNumber);
        dest.writeString(this.apprenticeDocumentType);
        dest.writeString(this.startExam);
        Boolean bool = this.enabledToStart;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            x5.v(dest, 1, bool);
        }
        dest.writeString(this.messageEnable);
        dest.writeString(this.statusAppointment);
    }
}
