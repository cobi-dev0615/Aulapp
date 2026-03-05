package com.gse.aulapp.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.x5;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000f\u001a\u00020\u0006J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0006R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/gse/aulapp/model/response/HoursScheduledHoursDayByCEAResponse;", "Landroid/os/Parcelable;", "centerID", BuildConfig.FLAVOR, "centerName", "hoursDay", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getCenterID", "()Ljava/lang/String;", "getCenterName", "getHoursDay", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "describeContents", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HoursScheduledHoursDayByCEAResponse implements Parcelable {
    public static final Parcelable.Creator<HoursScheduledHoursDayByCEAResponse> CREATOR = new Creator();

    @SerializedName("centerID")
    private final String centerID;

    @SerializedName("centerName")
    private final String centerName;

    @SerializedName("hoursDay")
    private final Integer hoursDay;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<HoursScheduledHoursDayByCEAResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HoursScheduledHoursDayByCEAResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HoursScheduledHoursDayByCEAResponse(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HoursScheduledHoursDayByCEAResponse[] newArray(int i) {
            return new HoursScheduledHoursDayByCEAResponse[i];
        }
    }

    public HoursScheduledHoursDayByCEAResponse() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getCenterID() {
        return this.centerID;
    }

    public final String getCenterName() {
        return this.centerName;
    }

    public final Integer getHoursDay() {
        return this.hoursDay;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.centerID);
        dest.writeString(this.centerName);
        Integer num = this.hoursDay;
        if (num == null) {
            dest.writeInt(0);
        } else {
            x5.w(dest, 1, num);
        }
    }

    public HoursScheduledHoursDayByCEAResponse(String str, String str2, Integer num) {
        this.centerID = str;
        this.centerName = str2;
        this.hoursDay = num;
    }

    public /* synthetic */ HoursScheduledHoursDayByCEAResponse(String str, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num);
    }
}
