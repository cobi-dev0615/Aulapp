package com.gse.aulapp.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\"\u001a\u00020\u0003J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0003R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011R\u001e\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011¨\u0006("}, d2 = {"Lcom/gse/aulapp/model/response/PracticalConfigurationResponse;", "Landroid/os/Parcelable;", "minToleranceEntryBefore", BuildConfig.FLAVOR, "minToleranceEntryAfter", "minToleranceDepartureAfter", "minToleranceDepartureBefore", "durationForHour", "minutesForHour", "durationForHourShow", "alertEndSession", "alertDepartureAfter", "<init>", "(IIIIIIIII)V", "getMinToleranceEntryBefore", "()I", "setMinToleranceEntryBefore", "(I)V", "getMinToleranceEntryAfter", "setMinToleranceEntryAfter", "getMinToleranceDepartureAfter", "setMinToleranceDepartureAfter", "getMinToleranceDepartureBefore", "setMinToleranceDepartureBefore", "getDurationForHour", "setDurationForHour", "getMinutesForHour", "setMinutesForHour", "getDurationForHourShow", "setDurationForHourShow", "getAlertEndSession", "setAlertEndSession", "getAlertDepartureAfter", "setAlertDepartureAfter", "describeContents", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PracticalConfigurationResponse implements Parcelable {
    public static final Parcelable.Creator<PracticalConfigurationResponse> CREATOR = new Creator();

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

    @SerializedName("min_tolerance_departure_before")
    @Expose
    private int minToleranceDepartureBefore;

    @SerializedName("min_tolerance_entry_after")
    @Expose
    private int minToleranceEntryAfter;

    @SerializedName("min_tolerance_entry_before")
    @Expose
    private int minToleranceEntryBefore;

    @SerializedName("minutes_for_hour")
    @Expose
    private int minutesForHour;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PracticalConfigurationResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PracticalConfigurationResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PracticalConfigurationResponse(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PracticalConfigurationResponse[] newArray(int i) {
            return new PracticalConfigurationResponse[i];
        }
    }

    public PracticalConfigurationResponse(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.minToleranceEntryBefore = i;
        this.minToleranceEntryAfter = i2;
        this.minToleranceDepartureAfter = i3;
        this.minToleranceDepartureBefore = i4;
        this.durationForHour = i5;
        this.minutesForHour = i6;
        this.durationForHourShow = i7;
        this.alertEndSession = i8;
        this.alertDepartureAfter = i9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
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

    public final int getMinToleranceDepartureBefore() {
        return this.minToleranceDepartureBefore;
    }

    public final int getMinToleranceEntryAfter() {
        return this.minToleranceEntryAfter;
    }

    public final int getMinToleranceEntryBefore() {
        return this.minToleranceEntryBefore;
    }

    public final int getMinutesForHour() {
        return this.minutesForHour;
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

    public final void setMinToleranceDepartureBefore(int i) {
        this.minToleranceDepartureBefore = i;
    }

    public final void setMinToleranceEntryAfter(int i) {
        this.minToleranceEntryAfter = i;
    }

    public final void setMinToleranceEntryBefore(int i) {
        this.minToleranceEntryBefore = i;
    }

    public final void setMinutesForHour(int i) {
        this.minutesForHour = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.minToleranceEntryBefore);
        dest.writeInt(this.minToleranceEntryAfter);
        dest.writeInt(this.minToleranceDepartureAfter);
        dest.writeInt(this.minToleranceDepartureBefore);
        dest.writeInt(this.durationForHour);
        dest.writeInt(this.minutesForHour);
        dest.writeInt(this.durationForHourShow);
        dest.writeInt(this.alertEndSession);
        dest.writeInt(this.alertDepartureAfter);
    }
}
