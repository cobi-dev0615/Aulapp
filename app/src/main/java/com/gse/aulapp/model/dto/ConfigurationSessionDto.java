package com.gse.aulapp.model.dto;

import android.os.Parcel;
import android.os.Parcelable;
import co.ceduladigital.sdk.q;
import co.ceduladigital.sdk.x5;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.uuid.Uuid;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0018\"\u0004\b!\u0010\"R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0016\"\u0004\b%\u0010&R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010#\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010&R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010#\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010&R\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010#\u001a\u0004\b+\u0010\u0016\"\u0004\b,\u0010&R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010#\u001a\u0004\b-\u0010\u0016\"\u0004\b.\u0010&R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010#\u001a\u0004\b/\u0010\u0016\"\u0004\b0\u0010&R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010#\u001a\u0004\b1\u0010\u0016\"\u0004\b2\u0010&R\"\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010#\u001a\u0004\b3\u0010\u0016\"\u0004\b4\u0010&¨\u00065"}, d2 = {"Lcom/gse/aulapp/model/dto/ConfigurationSessionDto;", "Landroid/os/Parcelable;", BuildConfig.FLAVOR, "type", BuildConfig.FLAVOR, "minToleranceEntryBefore", "minToleranceEntryAfter", "minToleranceDepartureAfter", "durationForHour", "durationForHourShow", "alertEndSession", "alertDepartureAfter", "minuteForHour", "<init>", "(Ljava/lang/String;IIIIIIII)V", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "setType", "(Ljava/lang/String;)V", "I", "getMinToleranceEntryBefore", "setMinToleranceEntryBefore", "(I)V", "getMinToleranceEntryAfter", "setMinToleranceEntryAfter", "getMinToleranceDepartureAfter", "setMinToleranceDepartureAfter", "getDurationForHour", "setDurationForHour", "getDurationForHourShow", "setDurationForHourShow", "getAlertEndSession", "setAlertEndSession", "getAlertDepartureAfter", "setAlertDepartureAfter", "getMinuteForHour", "setMinuteForHour", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ConfigurationSessionDto implements Parcelable {
    public static final Parcelable.Creator<ConfigurationSessionDto> CREATOR = new Creator();
    private int alertDepartureAfter;
    private int alertEndSession;
    private int durationForHour;
    private int durationForHourShow;
    private int minToleranceDepartureAfter;
    private int minToleranceEntryAfter;
    private int minToleranceEntryBefore;
    private int minuteForHour;
    private String type;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ConfigurationSessionDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConfigurationSessionDto createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConfigurationSessionDto(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConfigurationSessionDto[] newArray(int i) {
            return new ConfigurationSessionDto[i];
        }
    }

    public ConfigurationSessionDto(String type, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.minToleranceEntryBefore = i;
        this.minToleranceEntryAfter = i2;
        this.minToleranceDepartureAfter = i3;
        this.durationForHour = i4;
        this.durationForHourShow = i5;
        this.alertEndSession = i6;
        this.alertDepartureAfter = i7;
        this.minuteForHour = i8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigurationSessionDto)) {
            return false;
        }
        ConfigurationSessionDto configurationSessionDto = (ConfigurationSessionDto) other;
        return Intrinsics.areEqual(this.type, configurationSessionDto.type) && this.minToleranceEntryBefore == configurationSessionDto.minToleranceEntryBefore && this.minToleranceEntryAfter == configurationSessionDto.minToleranceEntryAfter && this.minToleranceDepartureAfter == configurationSessionDto.minToleranceDepartureAfter && this.durationForHour == configurationSessionDto.durationForHour && this.durationForHourShow == configurationSessionDto.durationForHourShow && this.alertEndSession == configurationSessionDto.alertEndSession && this.alertDepartureAfter == configurationSessionDto.alertDepartureAfter && this.minuteForHour == configurationSessionDto.minuteForHour;
    }

    public final int getAlertDepartureAfter() {
        return this.alertDepartureAfter;
    }

    public final int getAlertEndSession() {
        return this.alertEndSession;
    }

    public final int getDurationForHour() {
        return this.durationForHour;
    }

    public final int getDurationForHourShow() {
        return this.durationForHourShow;
    }

    public final int getMinToleranceDepartureAfter() {
        return this.minToleranceDepartureAfter;
    }

    public final int getMinToleranceEntryAfter() {
        return this.minToleranceEntryAfter;
    }

    public final int getMinToleranceEntryBefore() {
        return this.minToleranceEntryBefore;
    }

    public final int getMinuteForHour() {
        return this.minuteForHour;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return Integer.hashCode(this.minuteForHour) + x5.a(this.alertDepartureAfter, x5.a(this.alertEndSession, x5.a(this.durationForHourShow, x5.a(this.durationForHour, x5.a(this.minToleranceDepartureAfter, x5.a(this.minToleranceEntryAfter, x5.a(this.minToleranceEntryBefore, this.type.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        String str = this.type;
        int i = this.minToleranceEntryBefore;
        int i2 = this.minToleranceEntryAfter;
        int i3 = this.minToleranceDepartureAfter;
        int i4 = this.durationForHour;
        int i5 = this.durationForHourShow;
        int i6 = this.alertEndSession;
        int i7 = this.alertDepartureAfter;
        int i8 = this.minuteForHour;
        StringBuilder sb = new StringBuilder("ConfigurationSessionDto(type=");
        sb.append(str);
        sb.append(", minToleranceEntryBefore=");
        sb.append(i);
        sb.append(", minToleranceEntryAfter=");
        sb.append(i2);
        sb.append(", minToleranceDepartureAfter=");
        sb.append(i3);
        sb.append(", durationForHour=");
        sb.append(i4);
        sb.append(", durationForHourShow=");
        sb.append(i5);
        sb.append(", alertEndSession=");
        sb.append(i6);
        sb.append(", alertDepartureAfter=");
        sb.append(i7);
        sb.append(", minuteForHour=");
        return q.k(sb, i8, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.type);
        dest.writeInt(this.minToleranceEntryBefore);
        dest.writeInt(this.minToleranceEntryAfter);
        dest.writeInt(this.minToleranceDepartureAfter);
        dest.writeInt(this.durationForHour);
        dest.writeInt(this.durationForHourShow);
        dest.writeInt(this.alertEndSession);
        dest.writeInt(this.alertDepartureAfter);
        dest.writeInt(this.minuteForHour);
    }

    public /* synthetic */ ConfigurationSessionDto(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? BuildConfig.FLAVOR : str, (i9 & 2) != 0 ? 10 : i, (i9 & 4) != 0 ? 10 : i2, (i9 & 8) != 0 ? 15 : i3, (i9 & 16) != 0 ? 45 : i4, (i9 & 32) != 0 ? 45 : i5, (i9 & 64) != 0 ? 10 : i6, (i9 & Uuid.SIZE_BITS) != 0 ? 10 : i7, (i9 & 256) != 0 ? 60 : i8);
    }
}
