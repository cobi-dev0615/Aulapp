package com.gse.aulapp.model.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.q;
import co.ceduladigital.sdk.x5;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b,\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eB\t\b\u0016¢\u0006\u0004\b\r\u0010\u000fJ\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003Jc\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001J\u0006\u00100\u001a\u00020\u0005J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u00020\u0005HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001J\u0016\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u0005R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R\u001e\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001e\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0015\"\u0004\b%\u0010\u0017¨\u0006<"}, d2 = {"Lcom/gse/aulapp/model/data/entity/ConfigurationSessionEntity;", "Landroid/os/Parcelable;", "typeConfiguration", BuildConfig.FLAVOR, "minToleranceEntryBefore", BuildConfig.FLAVOR, "minToleranceEntryAfter", "minToleranceDepartureAfter", "durationForHour", "durationForHourShow", "alertEndSession", "alertDepartureAfter", "minuteForHour", "<init>", "(Ljava/lang/String;IIIIIIII)V", "()V", "getTypeConfiguration", "()Ljava/lang/String;", "setTypeConfiguration", "(Ljava/lang/String;)V", "getMinToleranceEntryBefore", "()I", "setMinToleranceEntryBefore", "(I)V", "getMinToleranceEntryAfter", "setMinToleranceEntryAfter", "getMinToleranceDepartureAfter", "setMinToleranceDepartureAfter", "getDurationForHour", "setDurationForHour", "getDurationForHourShow", "setDurationForHourShow", "getAlertEndSession", "setAlertEndSession", "getAlertDepartureAfter", "setAlertDepartureAfter", "getMinuteForHour", "setMinuteForHour", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ConfigurationSessionEntity implements Parcelable {
    public static final Parcelable.Creator<ConfigurationSessionEntity> CREATOR = new Creator();

    @SerializedName("alert_departure_after")
    @Expose
    private int alertDepartureAfter;

    @SerializedName("alert_end_session")
    @Expose
    private int alertEndSession;

    @SerializedName("duration_for_hour")
    @Expose
    private int durationForHour;

    @SerializedName("duration_for_hour_show")
    @Expose
    private int durationForHourShow;

    @SerializedName("min_tolerance_departure_after")
    @Expose
    private int minToleranceDepartureAfter;

    @SerializedName("min_tolerance_entry_after")
    @Expose
    private int minToleranceEntryAfter;

    @SerializedName("min_tolerance_entry_before")
    @Expose
    private int minToleranceEntryBefore;

    @SerializedName("minutes_for_hour")
    @Expose
    private int minuteForHour;

    @SerializedName("typeConfiguration")
    @Expose
    private String typeConfiguration;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ConfigurationSessionEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConfigurationSessionEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConfigurationSessionEntity(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConfigurationSessionEntity[] newArray(int i) {
            return new ConfigurationSessionEntity[i];
        }
    }

    public ConfigurationSessionEntity(String typeConfiguration, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Intrinsics.checkNotNullParameter(typeConfiguration, "typeConfiguration");
        this.typeConfiguration = typeConfiguration;
        this.minToleranceEntryBefore = i;
        this.minToleranceEntryAfter = i2;
        this.minToleranceDepartureAfter = i3;
        this.durationForHour = i4;
        this.durationForHourShow = i5;
        this.alertEndSession = i6;
        this.alertDepartureAfter = i7;
        this.minuteForHour = i8;
    }

    public static /* synthetic */ ConfigurationSessionEntity copy$default(ConfigurationSessionEntity configurationSessionEntity, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = configurationSessionEntity.typeConfiguration;
        }
        if ((i9 & 2) != 0) {
            i = configurationSessionEntity.minToleranceEntryBefore;
        }
        if ((i9 & 4) != 0) {
            i2 = configurationSessionEntity.minToleranceEntryAfter;
        }
        if ((i9 & 8) != 0) {
            i3 = configurationSessionEntity.minToleranceDepartureAfter;
        }
        if ((i9 & 16) != 0) {
            i4 = configurationSessionEntity.durationForHour;
        }
        if ((i9 & 32) != 0) {
            i5 = configurationSessionEntity.durationForHourShow;
        }
        if ((i9 & 64) != 0) {
            i6 = configurationSessionEntity.alertEndSession;
        }
        if ((i9 & 128) != 0) {
            i7 = configurationSessionEntity.alertDepartureAfter;
        }
        if ((i9 & 256) != 0) {
            i8 = configurationSessionEntity.minuteForHour;
        }
        int i10 = i7;
        int i11 = i8;
        int i12 = i5;
        int i13 = i6;
        int i14 = i4;
        int i15 = i2;
        return configurationSessionEntity.copy(str, i, i15, i3, i14, i12, i13, i10, i11);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTypeConfiguration() {
        return this.typeConfiguration;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMinToleranceEntryBefore() {
        return this.minToleranceEntryBefore;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMinToleranceEntryAfter() {
        return this.minToleranceEntryAfter;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMinToleranceDepartureAfter() {
        return this.minToleranceDepartureAfter;
    }

    /* renamed from: component5, reason: from getter */
    public final int getDurationForHour() {
        return this.durationForHour;
    }

    /* renamed from: component6, reason: from getter */
    public final int getDurationForHourShow() {
        return this.durationForHourShow;
    }

    /* renamed from: component7, reason: from getter */
    public final int getAlertEndSession() {
        return this.alertEndSession;
    }

    /* renamed from: component8, reason: from getter */
    public final int getAlertDepartureAfter() {
        return this.alertDepartureAfter;
    }

    /* renamed from: component9, reason: from getter */
    public final int getMinuteForHour() {
        return this.minuteForHour;
    }

    public final ConfigurationSessionEntity copy(String typeConfiguration, int minToleranceEntryBefore, int minToleranceEntryAfter, int minToleranceDepartureAfter, int durationForHour, int durationForHourShow, int alertEndSession, int alertDepartureAfter, int minuteForHour) {
        Intrinsics.checkNotNullParameter(typeConfiguration, "typeConfiguration");
        return new ConfigurationSessionEntity(typeConfiguration, minToleranceEntryBefore, minToleranceEntryAfter, minToleranceDepartureAfter, durationForHour, durationForHourShow, alertEndSession, alertDepartureAfter, minuteForHour);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigurationSessionEntity)) {
            return false;
        }
        ConfigurationSessionEntity configurationSessionEntity = (ConfigurationSessionEntity) other;
        return Intrinsics.areEqual(this.typeConfiguration, configurationSessionEntity.typeConfiguration) && this.minToleranceEntryBefore == configurationSessionEntity.minToleranceEntryBefore && this.minToleranceEntryAfter == configurationSessionEntity.minToleranceEntryAfter && this.minToleranceDepartureAfter == configurationSessionEntity.minToleranceDepartureAfter && this.durationForHour == configurationSessionEntity.durationForHour && this.durationForHourShow == configurationSessionEntity.durationForHourShow && this.alertEndSession == configurationSessionEntity.alertEndSession && this.alertDepartureAfter == configurationSessionEntity.alertDepartureAfter && this.minuteForHour == configurationSessionEntity.minuteForHour;
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

    public final String getTypeConfiguration() {
        return this.typeConfiguration;
    }

    public int hashCode() {
        return Integer.hashCode(this.minuteForHour) + x5.a(this.alertDepartureAfter, x5.a(this.alertEndSession, x5.a(this.durationForHourShow, x5.a(this.durationForHour, x5.a(this.minToleranceDepartureAfter, x5.a(this.minToleranceEntryAfter, x5.a(this.minToleranceEntryBefore, this.typeConfiguration.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final void setAlertDepartureAfter(int i) {
        this.alertDepartureAfter = i;
    }

    public final void setAlertEndSession(int i) {
        this.alertEndSession = i;
    }

    public final void setDurationForHour(int i) {
        this.durationForHour = i;
    }

    public final void setDurationForHourShow(int i) {
        this.durationForHourShow = i;
    }

    public final void setMinToleranceDepartureAfter(int i) {
        this.minToleranceDepartureAfter = i;
    }

    public final void setMinToleranceEntryAfter(int i) {
        this.minToleranceEntryAfter = i;
    }

    public final void setMinToleranceEntryBefore(int i) {
        this.minToleranceEntryBefore = i;
    }

    public final void setMinuteForHour(int i) {
        this.minuteForHour = i;
    }

    public final void setTypeConfiguration(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.typeConfiguration = str;
    }

    public String toString() {
        String str = this.typeConfiguration;
        int i = this.minToleranceEntryBefore;
        int i2 = this.minToleranceEntryAfter;
        int i3 = this.minToleranceDepartureAfter;
        int i4 = this.durationForHour;
        int i5 = this.durationForHourShow;
        int i6 = this.alertEndSession;
        int i7 = this.alertDepartureAfter;
        int i8 = this.minuteForHour;
        StringBuilder sb = new StringBuilder("ConfigurationSessionEntity(typeConfiguration=");
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
        dest.writeString(this.typeConfiguration);
        dest.writeInt(this.minToleranceEntryBefore);
        dest.writeInt(this.minToleranceEntryAfter);
        dest.writeInt(this.minToleranceDepartureAfter);
        dest.writeInt(this.durationForHour);
        dest.writeInt(this.durationForHourShow);
        dest.writeInt(this.alertEndSession);
        dest.writeInt(this.alertDepartureAfter);
        dest.writeInt(this.minuteForHour);
    }

    public ConfigurationSessionEntity() {
        this(BuildConfig.FLAVOR, 0, 0, 0, 0, 0, 0, 0, 0);
    }
}
