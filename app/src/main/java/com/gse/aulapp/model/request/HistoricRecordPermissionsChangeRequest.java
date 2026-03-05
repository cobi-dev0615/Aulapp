package com.gse.aulapp.model.request;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0017R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/gse/aulapp/model/request/HistoricRecordPermissionsChangeRequest;", "Landroid/os/Parcelable;", "type", BuildConfig.FLAVOR, "action", "appointmentID", "date", "time", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "getAction", "setAction", "getAppointmentID", "setAppointmentID", "getDate", "setDate", "getTime", "setTime", "describeContents", BuildConfig.FLAVOR, "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HistoricRecordPermissionsChangeRequest implements Parcelable {
    public static final Parcelable.Creator<HistoricRecordPermissionsChangeRequest> CREATOR = new Creator();

    @SerializedName("action")
    private String action;

    @SerializedName("appointmentID")
    private String appointmentID;

    @SerializedName("date")
    private String date;

    @SerializedName("time")
    private String time;

    @SerializedName("type")
    private String type;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<HistoricRecordPermissionsChangeRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HistoricRecordPermissionsChangeRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HistoricRecordPermissionsChangeRequest(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HistoricRecordPermissionsChangeRequest[] newArray(int i) {
            return new HistoricRecordPermissionsChangeRequest[i];
        }
    }

    public HistoricRecordPermissionsChangeRequest() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getAction() {
        return this.action;
    }

    public final String getAppointmentID() {
        return this.appointmentID;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getTime() {
        return this.time;
    }

    public final String getType() {
        return this.type;
    }

    public final void setAction(String str) {
        this.action = str;
    }

    public final void setAppointmentID(String str) {
        this.appointmentID = str;
    }

    public final void setDate(String str) {
        this.date = str;
    }

    public final void setTime(String str) {
        this.time = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.type);
        dest.writeString(this.action);
        dest.writeString(this.appointmentID);
        dest.writeString(this.date);
        dest.writeString(this.time);
    }

    public HistoricRecordPermissionsChangeRequest(String str, String str2, String str3, String str4, String str5) {
        this.type = str;
        this.action = str2;
        this.appointmentID = str3;
        this.date = str4;
        this.time = str5;
    }

    public /* synthetic */ HistoricRecordPermissionsChangeRequest(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
