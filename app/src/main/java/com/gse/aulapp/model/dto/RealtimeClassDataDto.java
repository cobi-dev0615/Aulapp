package com.gse.aulapp.model.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006 "}, d2 = {"Lcom/gse/aulapp/model/dto/RealtimeClassDataDto;", "Landroid/os/Parcelable;", "gpsCalculateDataDto", "Lcom/gse/aulapp/model/dto/GpsCalculateDataDto;", "averageSpeed", BuildConfig.FLAVOR, "maxSpeed", "<init>", "(Lcom/gse/aulapp/model/dto/GpsCalculateDataDto;DD)V", "getGpsCalculateDataDto", "()Lcom/gse/aulapp/model/dto/GpsCalculateDataDto;", "getAverageSpeed", "()D", "getMaxSpeed", "component1", "component2", "component3", "copy", "describeContents", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", BuildConfig.FLAVOR, "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RealtimeClassDataDto implements Parcelable {
    public static final Parcelable.Creator<RealtimeClassDataDto> CREATOR = new Creator();
    private final double averageSpeed;
    private final GpsCalculateDataDto gpsCalculateDataDto;
    private final double maxSpeed;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RealtimeClassDataDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RealtimeClassDataDto createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RealtimeClassDataDto(GpsCalculateDataDto.CREATOR.createFromParcel(parcel), parcel.readDouble(), parcel.readDouble());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RealtimeClassDataDto[] newArray(int i) {
            return new RealtimeClassDataDto[i];
        }
    }

    public RealtimeClassDataDto(GpsCalculateDataDto gpsCalculateDataDto, double d, double d2) {
        Intrinsics.checkNotNullParameter(gpsCalculateDataDto, "gpsCalculateDataDto");
        this.gpsCalculateDataDto = gpsCalculateDataDto;
        this.averageSpeed = d;
        this.maxSpeed = d2;
    }

    public static /* synthetic */ RealtimeClassDataDto copy$default(RealtimeClassDataDto realtimeClassDataDto, GpsCalculateDataDto gpsCalculateDataDto, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            gpsCalculateDataDto = realtimeClassDataDto.gpsCalculateDataDto;
        }
        if ((i & 2) != 0) {
            d = realtimeClassDataDto.averageSpeed;
        }
        if ((i & 4) != 0) {
            d2 = realtimeClassDataDto.maxSpeed;
        }
        return realtimeClassDataDto.copy(gpsCalculateDataDto, d, d2);
    }

    /* renamed from: component1, reason: from getter */
    public final GpsCalculateDataDto getGpsCalculateDataDto() {
        return this.gpsCalculateDataDto;
    }

    /* renamed from: component2, reason: from getter */
    public final double getAverageSpeed() {
        return this.averageSpeed;
    }

    /* renamed from: component3, reason: from getter */
    public final double getMaxSpeed() {
        return this.maxSpeed;
    }

    public final RealtimeClassDataDto copy(GpsCalculateDataDto gpsCalculateDataDto, double averageSpeed, double maxSpeed) {
        Intrinsics.checkNotNullParameter(gpsCalculateDataDto, "gpsCalculateDataDto");
        return new RealtimeClassDataDto(gpsCalculateDataDto, averageSpeed, maxSpeed);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RealtimeClassDataDto)) {
            return false;
        }
        RealtimeClassDataDto realtimeClassDataDto = (RealtimeClassDataDto) other;
        return Intrinsics.areEqual(this.gpsCalculateDataDto, realtimeClassDataDto.gpsCalculateDataDto) && Double.compare(this.averageSpeed, realtimeClassDataDto.averageSpeed) == 0 && Double.compare(this.maxSpeed, realtimeClassDataDto.maxSpeed) == 0;
    }

    public int hashCode() {
        return Double.hashCode(this.maxSpeed) + ((Double.hashCode(this.averageSpeed) + (this.gpsCalculateDataDto.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "RealtimeClassDataDto(gpsCalculateDataDto=" + this.gpsCalculateDataDto + ", averageSpeed=" + this.averageSpeed + ", maxSpeed=" + this.maxSpeed + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.gpsCalculateDataDto.writeToParcel(dest, flags);
        dest.writeDouble(this.averageSpeed);
        dest.writeDouble(this.maxSpeed);
    }
}
