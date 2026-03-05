package com.gse.aulapp.model.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006 "}, d2 = {"Lcom/gse/aulapp/model/dto/GpsCalculateDataDto;", "Landroid/os/Parcelable;", "totalDistance", BuildConfig.FLAVOR, "stoppedTime", BuildConfig.FLAVOR, "movingTime", "<init>", "(DJJ)V", "getTotalDistance", "()D", "getStoppedTime", "()J", "getMovingTime", "component1", "component2", "component3", "copy", "describeContents", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", BuildConfig.FLAVOR, "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class GpsCalculateDataDto implements Parcelable {
    public static final Parcelable.Creator<GpsCalculateDataDto> CREATOR = new Creator();
    private final long movingTime;
    private final long stoppedTime;
    private final double totalDistance;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GpsCalculateDataDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GpsCalculateDataDto createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GpsCalculateDataDto(parcel.readDouble(), parcel.readLong(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GpsCalculateDataDto[] newArray(int i) {
            return new GpsCalculateDataDto[i];
        }
    }

    public GpsCalculateDataDto(double d, long j, long j2) {
        this.totalDistance = d;
        this.stoppedTime = j;
        this.movingTime = j2;
    }

    public static /* synthetic */ GpsCalculateDataDto copy$default(GpsCalculateDataDto gpsCalculateDataDto, double d, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = gpsCalculateDataDto.totalDistance;
        }
        double d2 = d;
        if ((i & 2) != 0) {
            j = gpsCalculateDataDto.stoppedTime;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = gpsCalculateDataDto.movingTime;
        }
        return gpsCalculateDataDto.copy(d2, j3, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final double getTotalDistance() {
        return this.totalDistance;
    }

    /* renamed from: component2, reason: from getter */
    public final long getStoppedTime() {
        return this.stoppedTime;
    }

    /* renamed from: component3, reason: from getter */
    public final long getMovingTime() {
        return this.movingTime;
    }

    public final GpsCalculateDataDto copy(double totalDistance, long stoppedTime, long movingTime) {
        return new GpsCalculateDataDto(totalDistance, stoppedTime, movingTime);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GpsCalculateDataDto)) {
            return false;
        }
        GpsCalculateDataDto gpsCalculateDataDto = (GpsCalculateDataDto) other;
        return Double.compare(this.totalDistance, gpsCalculateDataDto.totalDistance) == 0 && this.stoppedTime == gpsCalculateDataDto.stoppedTime && this.movingTime == gpsCalculateDataDto.movingTime;
    }

    public final long getMovingTime() {
        return this.movingTime;
    }

    public final long getStoppedTime() {
        return this.stoppedTime;
    }

    public final double getTotalDistance() {
        return this.totalDistance;
    }

    public int hashCode() {
        return Long.hashCode(this.movingTime) + ((Long.hashCode(this.stoppedTime) + (Double.hashCode(this.totalDistance) * 31)) * 31);
    }

    public String toString() {
        return "GpsCalculateDataDto(totalDistance=" + this.totalDistance + ", stoppedTime=" + this.stoppedTime + ", movingTime=" + this.movingTime + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeDouble(this.totalDistance);
        dest.writeLong(this.stoppedTime);
        dest.writeLong(this.movingTime);
    }
}
