package com.gse.aulapp.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0003J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/gse/aulapp/model/response/HoursScheduledCollectionTypeResponse;", "Landroid/os/Parcelable;", "hoursDay", BuildConfig.FLAVOR, "type", BuildConfig.FLAVOR, "<init>", "(ILjava/lang/String;)V", "getHoursDay", "()I", "getType", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class HoursScheduledCollectionTypeResponse implements Parcelable {
    public static final Parcelable.Creator<HoursScheduledCollectionTypeResponse> CREATOR = new Creator();

    @SerializedName("hoursDay")
    private final int hoursDay;

    @SerializedName("type")
    private final String type;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<HoursScheduledCollectionTypeResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HoursScheduledCollectionTypeResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HoursScheduledCollectionTypeResponse(parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HoursScheduledCollectionTypeResponse[] newArray(int i) {
            return new HoursScheduledCollectionTypeResponse[i];
        }
    }

    public HoursScheduledCollectionTypeResponse(int i, String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.hoursDay = i;
        this.type = type;
    }

    public static /* synthetic */ HoursScheduledCollectionTypeResponse copy$default(HoursScheduledCollectionTypeResponse hoursScheduledCollectionTypeResponse, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = hoursScheduledCollectionTypeResponse.hoursDay;
        }
        if ((i2 & 2) != 0) {
            str = hoursScheduledCollectionTypeResponse.type;
        }
        return hoursScheduledCollectionTypeResponse.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getHoursDay() {
        return this.hoursDay;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final HoursScheduledCollectionTypeResponse copy(int hoursDay, String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new HoursScheduledCollectionTypeResponse(hoursDay, type);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HoursScheduledCollectionTypeResponse)) {
            return false;
        }
        HoursScheduledCollectionTypeResponse hoursScheduledCollectionTypeResponse = (HoursScheduledCollectionTypeResponse) other;
        return this.hoursDay == hoursScheduledCollectionTypeResponse.hoursDay && Intrinsics.areEqual(this.type, hoursScheduledCollectionTypeResponse.type);
    }

    public final int getHoursDay() {
        return this.hoursDay;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + (Integer.hashCode(this.hoursDay) * 31);
    }

    public String toString() {
        return "HoursScheduledCollectionTypeResponse(hoursDay=" + this.hoursDay + ", type=" + this.type + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.hoursDay);
        dest.writeString(this.type);
    }
}
