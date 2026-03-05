package com.gse.aulapp.model.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bB\t\b\u0016¢\u0006\u0004\b\n\u0010\fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J;\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0006\u0010#\u001a\u00020$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020$HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020$R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014¨\u00060"}, d2 = {"Lcom/gse/aulapp/model/data/entity/GpsTraceEntity;", "Landroid/os/Parcelable;", "sessionID", BuildConfig.FLAVOR, "latitude", BuildConfig.FLAVOR, "longitude", "date", BuildConfig.FLAVOR, "speed", "<init>", "(Ljava/lang/String;DDJD)V", "()V", "getSessionID", "()Ljava/lang/String;", "setSessionID", "(Ljava/lang/String;)V", "getLatitude", "()D", "setLatitude", "(D)V", "getLongitude", "setLongitude", "getDate", "()J", "setDate", "(J)V", "getSpeed", "setSpeed", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class GpsTraceEntity implements Parcelable {
    public static final Parcelable.Creator<GpsTraceEntity> CREATOR = new Creator();
    private long date;
    private double latitude;
    private double longitude;
    private String sessionID;
    private double speed;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GpsTraceEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GpsTraceEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GpsTraceEntity(parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readLong(), parcel.readDouble());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GpsTraceEntity[] newArray(int i) {
            return new GpsTraceEntity[i];
        }
    }

    public GpsTraceEntity(String sessionID, double d, double d2, long j, double d3) {
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        this.sessionID = sessionID;
        this.latitude = d;
        this.longitude = d2;
        this.date = j;
        this.speed = d3;
    }

    public static /* synthetic */ GpsTraceEntity copy$default(GpsTraceEntity gpsTraceEntity, String str, double d, double d2, long j, double d3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gpsTraceEntity.sessionID;
        }
        if ((i & 2) != 0) {
            d = gpsTraceEntity.latitude;
        }
        if ((i & 4) != 0) {
            d2 = gpsTraceEntity.longitude;
        }
        if ((i & 8) != 0) {
            j = gpsTraceEntity.date;
        }
        if ((i & 16) != 0) {
            d3 = gpsTraceEntity.speed;
        }
        double d4 = d3;
        long j2 = j;
        return gpsTraceEntity.copy(str, d, d2, j2, d4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSessionID() {
        return this.sessionID;
    }

    /* renamed from: component2, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* renamed from: component3, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* renamed from: component4, reason: from getter */
    public final long getDate() {
        return this.date;
    }

    /* renamed from: component5, reason: from getter */
    public final double getSpeed() {
        return this.speed;
    }

    public final GpsTraceEntity copy(String sessionID, double latitude, double longitude, long date, double speed) {
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        return new GpsTraceEntity(sessionID, latitude, longitude, date, speed);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GpsTraceEntity)) {
            return false;
        }
        GpsTraceEntity gpsTraceEntity = (GpsTraceEntity) other;
        return Intrinsics.areEqual(this.sessionID, gpsTraceEntity.sessionID) && Double.compare(this.latitude, gpsTraceEntity.latitude) == 0 && Double.compare(this.longitude, gpsTraceEntity.longitude) == 0 && this.date == gpsTraceEntity.date && Double.compare(this.speed, gpsTraceEntity.speed) == 0;
    }

    public final long getDate() {
        return this.date;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final String getSessionID() {
        return this.sessionID;
    }

    public final double getSpeed() {
        return this.speed;
    }

    public int hashCode() {
        return Double.hashCode(this.speed) + ((Long.hashCode(this.date) + ((Double.hashCode(this.longitude) + ((Double.hashCode(this.latitude) + (this.sessionID.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final void setDate(long j) {
        this.date = j;
    }

    public final void setLatitude(double d) {
        this.latitude = d;
    }

    public final void setLongitude(double d) {
        this.longitude = d;
    }

    public final void setSessionID(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sessionID = str;
    }

    public final void setSpeed(double d) {
        this.speed = d;
    }

    public String toString() {
        return "GpsTraceEntity(sessionID=" + this.sessionID + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", date=" + this.date + ", speed=" + this.speed + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.sessionID);
        dest.writeDouble(this.latitude);
        dest.writeDouble(this.longitude);
        dest.writeLong(this.date);
        dest.writeDouble(this.speed);
    }

    public GpsTraceEntity() {
        this(BuildConfig.FLAVOR, 0.0d, 0.0d, 0L, 0.0d);
    }
}
