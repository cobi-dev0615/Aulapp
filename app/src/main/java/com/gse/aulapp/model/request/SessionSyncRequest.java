package com.gse.aulapp.model.request;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.x5;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.uuid.Uuid;

@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b-\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0081\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u00100\u001a\u000201J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u000201HÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001J\u0016\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u000201R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010\u0012R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012¨\u0006="}, d2 = {"Lcom/gse/aulapp/model/request/SessionSyncRequest;", "Landroid/os/Parcelable;", "Id", BuildConfig.FLAVOR, "classroomID", "vehicleID", "apprenticeID", "instructorID", "endTime", "startTime", "date", "statusAppointment", "systemNotification", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getClassroomID", "setClassroomID", "getVehicleID", "setVehicleID", "getApprenticeID", "setApprenticeID", "getInstructorID", "setInstructorID", "getEndTime", "setEndTime", "getStartTime", "setStartTime", "getDate", "setDate", "getStatusAppointment", "setStatusAppointment", "getSystemNotification", "setSystemNotification", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "describeContents", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SessionSyncRequest implements Parcelable {
    public static final Parcelable.Creator<SessionSyncRequest> CREATOR = new Creator();

    @SerializedName("_id")
    private String Id;

    @SerializedName("apprenticeID")
    private String apprenticeID;

    @SerializedName("classroomID")
    private String classroomID;

    @SerializedName("date")
    private String date;

    @SerializedName("endTime")
    private String endTime;

    @SerializedName("instructorID")
    private String instructorID;

    @SerializedName("startTime")
    private String startTime;

    @SerializedName("statusAppointment")
    private String statusAppointment;

    @SerializedName("systemNotification")
    private String systemNotification;

    @SerializedName("vehicleID")
    private String vehicleID;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SessionSyncRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SessionSyncRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SessionSyncRequest(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SessionSyncRequest[] newArray(int i) {
            return new SessionSyncRequest[i];
        }
    }

    public SessionSyncRequest() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public static /* synthetic */ SessionSyncRequest copy$default(SessionSyncRequest sessionSyncRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sessionSyncRequest.Id;
        }
        if ((i & 2) != 0) {
            str2 = sessionSyncRequest.classroomID;
        }
        if ((i & 4) != 0) {
            str3 = sessionSyncRequest.vehicleID;
        }
        if ((i & 8) != 0) {
            str4 = sessionSyncRequest.apprenticeID;
        }
        if ((i & 16) != 0) {
            str5 = sessionSyncRequest.instructorID;
        }
        if ((i & 32) != 0) {
            str6 = sessionSyncRequest.endTime;
        }
        if ((i & 64) != 0) {
            str7 = sessionSyncRequest.startTime;
        }
        if ((i & Uuid.SIZE_BITS) != 0) {
            str8 = sessionSyncRequest.date;
        }
        if ((i & 256) != 0) {
            str9 = sessionSyncRequest.statusAppointment;
        }
        if ((i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
            str10 = sessionSyncRequest.systemNotification;
        }
        String str11 = str9;
        String str12 = str10;
        String str13 = str7;
        String str14 = str8;
        String str15 = str5;
        String str16 = str6;
        return sessionSyncRequest.copy(str, str2, str3, str4, str15, str16, str13, str14, str11, str12);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.Id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getSystemNotification() {
        return this.systemNotification;
    }

    /* renamed from: component2, reason: from getter */
    public final String getClassroomID() {
        return this.classroomID;
    }

    /* renamed from: component3, reason: from getter */
    public final String getVehicleID() {
        return this.vehicleID;
    }

    /* renamed from: component4, reason: from getter */
    public final String getApprenticeID() {
        return this.apprenticeID;
    }

    /* renamed from: component5, reason: from getter */
    public final String getInstructorID() {
        return this.instructorID;
    }

    /* renamed from: component6, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    /* renamed from: component7, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    /* renamed from: component8, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: component9, reason: from getter */
    public final String getStatusAppointment() {
        return this.statusAppointment;
    }

    public final SessionSyncRequest copy(String Id, String classroomID, String vehicleID, String apprenticeID, String instructorID, String endTime, String startTime, String date, String statusAppointment, String systemNotification) {
        return new SessionSyncRequest(Id, classroomID, vehicleID, apprenticeID, instructorID, endTime, startTime, date, statusAppointment, systemNotification);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionSyncRequest)) {
            return false;
        }
        SessionSyncRequest sessionSyncRequest = (SessionSyncRequest) other;
        return Intrinsics.areEqual(this.Id, sessionSyncRequest.Id) && Intrinsics.areEqual(this.classroomID, sessionSyncRequest.classroomID) && Intrinsics.areEqual(this.vehicleID, sessionSyncRequest.vehicleID) && Intrinsics.areEqual(this.apprenticeID, sessionSyncRequest.apprenticeID) && Intrinsics.areEqual(this.instructorID, sessionSyncRequest.instructorID) && Intrinsics.areEqual(this.endTime, sessionSyncRequest.endTime) && Intrinsics.areEqual(this.startTime, sessionSyncRequest.startTime) && Intrinsics.areEqual(this.date, sessionSyncRequest.date) && Intrinsics.areEqual(this.statusAppointment, sessionSyncRequest.statusAppointment) && Intrinsics.areEqual(this.systemNotification, sessionSyncRequest.systemNotification);
    }

    public final String getApprenticeID() {
        return this.apprenticeID;
    }

    public final String getClassroomID() {
        return this.classroomID;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getEndTime() {
        return this.endTime;
    }

    public final String getId() {
        return this.Id;
    }

    public final String getInstructorID() {
        return this.instructorID;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public final String getStatusAppointment() {
        return this.statusAppointment;
    }

    public final String getSystemNotification() {
        return this.systemNotification;
    }

    public final String getVehicleID() {
        return this.vehicleID;
    }

    public int hashCode() {
        String str = this.Id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.classroomID;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.vehicleID;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.apprenticeID;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.instructorID;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.endTime;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.startTime;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.date;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.statusAppointment;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.systemNotification;
        return hashCode9 + (str10 != null ? str10.hashCode() : 0);
    }

    public final void setApprenticeID(String str) {
        this.apprenticeID = str;
    }

    public final void setClassroomID(String str) {
        this.classroomID = str;
    }

    public final void setDate(String str) {
        this.date = str;
    }

    public final void setEndTime(String str) {
        this.endTime = str;
    }

    public final void setId(String str) {
        this.Id = str;
    }

    public final void setInstructorID(String str) {
        this.instructorID = str;
    }

    public final void setStartTime(String str) {
        this.startTime = str;
    }

    public final void setStatusAppointment(String str) {
        this.statusAppointment = str;
    }

    public final void setSystemNotification(String str) {
        this.systemNotification = str;
    }

    public final void setVehicleID(String str) {
        this.vehicleID = str;
    }

    public String toString() {
        String str = this.Id;
        String str2 = this.classroomID;
        String str3 = this.vehicleID;
        String str4 = this.apprenticeID;
        String str5 = this.instructorID;
        String str6 = this.endTime;
        String str7 = this.startTime;
        String str8 = this.date;
        String str9 = this.statusAppointment;
        String str10 = this.systemNotification;
        StringBuilder r = x5.r("SessionSyncRequest(Id=", str, ", classroomID=", str2, ", vehicleID=");
        x5.z(r, str3, ", apprenticeID=", str4, ", instructorID=");
        x5.z(r, str5, ", endTime=", str6, ", startTime=");
        x5.z(r, str7, ", date=", str8, ", statusAppointment=");
        r.append(str9);
        r.append(", systemNotification=");
        r.append(str10);
        r.append(")");
        return r.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.Id);
        dest.writeString(this.classroomID);
        dest.writeString(this.vehicleID);
        dest.writeString(this.apprenticeID);
        dest.writeString(this.instructorID);
        dest.writeString(this.endTime);
        dest.writeString(this.startTime);
        dest.writeString(this.date);
        dest.writeString(this.statusAppointment);
        dest.writeString(this.systemNotification);
    }

    public SessionSyncRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.Id = str;
        this.classroomID = str2;
        this.vehicleID = str3;
        this.apprenticeID = str4;
        this.instructorID = str5;
        this.endTime = str6;
        this.startTime = str7;
        this.date = str8;
        this.statusAppointment = str9;
        this.systemNotification = str10;
    }

    public /* synthetic */ SessionSyncRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & Uuid.SIZE_BITS) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : str10);
    }
}
