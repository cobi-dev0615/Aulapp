package com.gse.aulapp.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.y7;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u001d"}, d2 = {"Lcom/gse/aulapp/model/response/TimezoneResponse;", "Landroid/os/Parcelable;", "datetime", BuildConfig.FLAVOR, "timezone", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDatetime", "()Ljava/lang/String;", "setDatetime", "(Ljava/lang/String;)V", "getTimezone", "setTimezone", "component1", "component2", "copy", "describeContents", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TimezoneResponse implements Parcelable {
    public static final Parcelable.Creator<TimezoneResponse> CREATOR = new Creator();

    @SerializedName("datetime")
    @Expose
    private String datetime;

    @SerializedName("timezone")
    @Expose
    private String timezone;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TimezoneResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TimezoneResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TimezoneResponse(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TimezoneResponse[] newArray(int i) {
            return new TimezoneResponse[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TimezoneResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TimezoneResponse copy$default(TimezoneResponse timezoneResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = timezoneResponse.datetime;
        }
        if ((i & 2) != 0) {
            str2 = timezoneResponse.timezone;
        }
        return timezoneResponse.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDatetime() {
        return this.datetime;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTimezone() {
        return this.timezone;
    }

    public final TimezoneResponse copy(String datetime, String timezone) {
        return new TimezoneResponse(datetime, timezone);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimezoneResponse)) {
            return false;
        }
        TimezoneResponse timezoneResponse = (TimezoneResponse) other;
        return Intrinsics.areEqual(this.datetime, timezoneResponse.datetime) && Intrinsics.areEqual(this.timezone, timezoneResponse.timezone);
    }

    public int hashCode() {
        String str = this.datetime;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.timezone;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setDatetime(String str) {
        this.datetime = str;
    }

    public final void setTimezone(String str) {
        this.timezone = str;
    }

    public String toString() {
        return y7.p("TimezoneResponse(datetime=", this.datetime, ", timezone=", this.timezone, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.datetime);
        dest.writeString(this.timezone);
    }

    public TimezoneResponse(String str, String str2) {
        this.datetime = str;
        this.timezone = str2;
    }

    public /* synthetic */ TimezoneResponse(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
