package com.gse.aulapp.model.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.q;
import co.ceduladigital.sdk.x5;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import java.util.Arrays;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eB\t\b\u0016¢\u0006\u0004\b\r\u0010\u000fJ\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0016\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010#J`\u0010.\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010/J\u0006\u00100\u001a\u000201J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u000201HÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001J\u0016\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u000201R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006="}, d2 = {"Lcom/gse/aulapp/model/data/entity/ExamsInfo;", "Landroid/os/Parcelable;", "_id", BuildConfig.FLAVOR, "instructorID", "startTime", "endTime", "date", "Ljava/util/Date;", "computerID", "Lcom/gse/aulapp/model/data/entity/Computer;", "apprentices", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lcom/gse/aulapp/model/data/entity/Computer;[Ljava/lang/String;)V", "()V", "get_id", "()Ljava/lang/String;", "set_id", "(Ljava/lang/String;)V", "getInstructorID", "setInstructorID", "getStartTime", "setStartTime", "getEndTime", "setEndTime", "getDate", "()Ljava/util/Date;", "setDate", "(Ljava/util/Date;)V", "getComputerID", "()Lcom/gse/aulapp/model/data/entity/Computer;", "setComputerID", "(Lcom/gse/aulapp/model/data/entity/Computer;)V", "getApprentices", "()[Ljava/lang/String;", "setApprentices", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lcom/gse/aulapp/model/data/entity/Computer;[Ljava/lang/String;)Lcom/gse/aulapp/model/data/entity/ExamsInfo;", "describeContents", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ExamsInfo implements Parcelable {
    public static final Parcelable.Creator<ExamsInfo> CREATOR = new Creator();

    @SerializedName("_id")
    @Expose
    private String _id;

    @SerializedName("apprentices")
    @Expose
    private String[] apprentices;

    @SerializedName("computerID")
    @Expose
    private Computer computerID;

    @SerializedName("date")
    @Expose
    private Date date;

    @SerializedName("endTime")
    @Expose
    private String endTime;

    @SerializedName("instructorID")
    @Expose
    private String instructorID;

    @SerializedName("startTime")
    @Expose
    private String startTime;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ExamsInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExamsInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExamsInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Date) parcel.readSerializable(), parcel.readInt() == 0 ? null : Computer.CREATOR.createFromParcel(parcel), parcel.createStringArray());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExamsInfo[] newArray(int i) {
            return new ExamsInfo[i];
        }
    }

    public ExamsInfo(String _id, String instructorID, String startTime, String endTime, Date date, Computer computer, String[] strArr) {
        Intrinsics.checkNotNullParameter(_id, "_id");
        Intrinsics.checkNotNullParameter(instructorID, "instructorID");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(endTime, "endTime");
        this._id = _id;
        this.instructorID = instructorID;
        this.startTime = startTime;
        this.endTime = endTime;
        this.date = date;
        this.computerID = computer;
        this.apprentices = strArr;
    }

    public static /* synthetic */ ExamsInfo copy$default(ExamsInfo examsInfo, String str, String str2, String str3, String str4, Date date, Computer computer, String[] strArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = examsInfo._id;
        }
        if ((i & 2) != 0) {
            str2 = examsInfo.instructorID;
        }
        if ((i & 4) != 0) {
            str3 = examsInfo.startTime;
        }
        if ((i & 8) != 0) {
            str4 = examsInfo.endTime;
        }
        if ((i & 16) != 0) {
            date = examsInfo.date;
        }
        if ((i & 32) != 0) {
            computer = examsInfo.computerID;
        }
        if ((i & 64) != 0) {
            strArr = examsInfo.apprentices;
        }
        Computer computer2 = computer;
        String[] strArr2 = strArr;
        Date date2 = date;
        String str5 = str3;
        return examsInfo.copy(str, str2, str5, str4, date2, computer2, strArr2);
    }

    /* renamed from: component1, reason: from getter */
    public final String get_id() {
        return this._id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getInstructorID() {
        return this.instructorID;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    /* renamed from: component4, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    /* renamed from: component5, reason: from getter */
    public final Date getDate() {
        return this.date;
    }

    /* renamed from: component6, reason: from getter */
    public final Computer getComputerID() {
        return this.computerID;
    }

    /* renamed from: component7, reason: from getter */
    public final String[] getApprentices() {
        return this.apprentices;
    }

    public final ExamsInfo copy(String _id, String instructorID, String startTime, String endTime, Date date, Computer computerID, String[] apprentices) {
        Intrinsics.checkNotNullParameter(_id, "_id");
        Intrinsics.checkNotNullParameter(instructorID, "instructorID");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(endTime, "endTime");
        return new ExamsInfo(_id, instructorID, startTime, endTime, date, computerID, apprentices);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExamsInfo)) {
            return false;
        }
        ExamsInfo examsInfo = (ExamsInfo) other;
        return Intrinsics.areEqual(this._id, examsInfo._id) && Intrinsics.areEqual(this.instructorID, examsInfo.instructorID) && Intrinsics.areEqual(this.startTime, examsInfo.startTime) && Intrinsics.areEqual(this.endTime, examsInfo.endTime) && Intrinsics.areEqual(this.date, examsInfo.date) && Intrinsics.areEqual(this.computerID, examsInfo.computerID) && Intrinsics.areEqual(this.apprentices, examsInfo.apprentices);
    }

    public final String[] getApprentices() {
        return this.apprentices;
    }

    public final Computer getComputerID() {
        return this.computerID;
    }

    public final Date getDate() {
        return this.date;
    }

    public final String getEndTime() {
        return this.endTime;
    }

    public final String getInstructorID() {
        return this.instructorID;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public final String get_id() {
        return this._id;
    }

    public int hashCode() {
        int d = x5.d(this.endTime, x5.d(this.startTime, x5.d(this.instructorID, this._id.hashCode() * 31, 31), 31), 31);
        Date date = this.date;
        int hashCode = (d + (date == null ? 0 : date.hashCode())) * 31;
        Computer computer = this.computerID;
        int hashCode2 = (hashCode + (computer == null ? 0 : computer.hashCode())) * 31;
        String[] strArr = this.apprentices;
        return hashCode2 + (strArr != null ? Arrays.hashCode(strArr) : 0);
    }

    public final void setApprentices(String[] strArr) {
        this.apprentices = strArr;
    }

    public final void setComputerID(Computer computer) {
        this.computerID = computer;
    }

    public final void setDate(Date date) {
        this.date = date;
    }

    public final void setEndTime(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.endTime = str;
    }

    public final void setInstructorID(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.instructorID = str;
    }

    public final void setStartTime(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.startTime = str;
    }

    public final void set_id(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this._id = str;
    }

    public String toString() {
        String str = this._id;
        String str2 = this.instructorID;
        String str3 = this.startTime;
        String str4 = this.endTime;
        Date date = this.date;
        Computer computer = this.computerID;
        String arrays = Arrays.toString(this.apprentices);
        StringBuilder r = x5.r("ExamsInfo(_id=", str, ", instructorID=", str2, ", startTime=");
        x5.z(r, str3, ", endTime=", str4, ", date=");
        r.append(date);
        r.append(", computerID=");
        r.append(computer);
        r.append(", apprentices=");
        return q.j(arrays, ")", r);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this._id);
        dest.writeString(this.instructorID);
        dest.writeString(this.startTime);
        dest.writeString(this.endTime);
        dest.writeSerializable(this.date);
        Computer computer = this.computerID;
        if (computer == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            computer.writeToParcel(dest, flags);
        }
        dest.writeStringArray(this.apprentices);
    }

    public ExamsInfo() {
        this(BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, null, null, null);
    }
}
