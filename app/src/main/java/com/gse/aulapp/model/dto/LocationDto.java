package com.gse.aulapp.model.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dR\u001e\u0010\u0002\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013¨\u0006)"}, d2 = {"Lcom/gse/aulapp/model/dto/LocationDto;", "Lcom/gse/aulapp/model/dto/GeneralSessionDto;", "id", BuildConfig.FLAVOR, "date", BuildConfig.FLAVOR, "latitude", BuildConfig.FLAVOR, "longitude", "speed", "<init>", "(Ljava/lang/String;JDDD)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getDate", "()J", "getLatitude", "()D", "getLongitude", "getSpeed", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class LocationDto extends GeneralSessionDto {
    public static final Parcelable.Creator<LocationDto> CREATOR = new Creator();
    private final long date;

    @SerializedName("SessionID")
    private String id;
    private final double latitude;
    private final double longitude;
    private final double speed;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LocationDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocationDto createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LocationDto(parcel.readString(), parcel.readLong(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocationDto[] newArray(int i) {
            return new LocationDto[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationDto(String id, long j, double d, double d2, double d3) {
        super(id);
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.date = j;
        this.latitude = d;
        this.longitude = d2;
        this.speed = d3;
    }

    public static /* synthetic */ LocationDto copy$default(LocationDto locationDto, String str, long j, double d, double d2, double d3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = locationDto.id;
        }
        if ((i & 2) != 0) {
            j = locationDto.date;
        }
        if ((i & 4) != 0) {
            d = locationDto.latitude;
        }
        if ((i & 8) != 0) {
            d2 = locationDto.longitude;
        }
        if ((i & 16) != 0) {
            d3 = locationDto.speed;
        }
        double d4 = d3;
        double d5 = d2;
        return locationDto.copy(str, j, d, d5, d4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getDate() {
        return this.date;
    }

    /* renamed from: component3, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* renamed from: component4, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* renamed from: component5, reason: from getter */
    public final double getSpeed() {
        return this.speed;
    }

    public final LocationDto copy(String id, long date, double latitude, double longitude, double speed) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new LocationDto(id, date, latitude, longitude, speed);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocationDto)) {
            return false;
        }
        LocationDto locationDto = (LocationDto) other;
        return Intrinsics.areEqual(this.id, locationDto.id) && this.date == locationDto.date && Double.compare(this.latitude, locationDto.latitude) == 0 && Double.compare(this.longitude, locationDto.longitude) == 0 && Double.compare(this.speed, locationDto.speed) == 0;
    }

    @Override // com.gse.aulapp.model.dto.GeneralSessionDto

    public int hashCode() {
        return Double.hashCode(this.speed) + ((Double.hashCode(this.longitude) + ((Double.hashCode(this.latitude) + ((Long.hashCode(this.date) + (this.id.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @Override // com.gse.aulapp.model.dto.GeneralSessionDto
    public void setId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public String toString() {
        return "LocationDto(id=" + this.id + ", date=" + this.date + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", speed=" + this.speed + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeLong(this.date);
        dest.writeDouble(this.latitude);
        dest.writeDouble(this.longitude);
        dest.writeDouble(this.speed);
    }
}
