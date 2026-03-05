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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0017R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/gse/aulapp/model/response/VehicleResponse;", "Landroid/os/Parcelable;", "vehicleID", BuildConfig.FLAVOR, "brand", "line", "plates", "tagCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getVehicleID", "()Ljava/lang/String;", "setVehicleID", "(Ljava/lang/String;)V", "getBrand", "setBrand", "getLine", "setLine", "getPlates", "setPlates", "getTagCode", "setTagCode", "describeContents", BuildConfig.FLAVOR, "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VehicleResponse implements Parcelable {
    public static final Parcelable.Creator<VehicleResponse> CREATOR = new Creator();

    @SerializedName("brand")
    @Expose
    private String brand;

    @SerializedName("line")
    @Expose
    private String line;

    @SerializedName("plates")
    @Expose
    private String plates;

    @SerializedName("tagCode")
    @Expose
    private String tagCode;

    @SerializedName("vehicleID")
    @Expose
    private String vehicleID;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VehicleResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VehicleResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new VehicleResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VehicleResponse[] newArray(int i) {
            return new VehicleResponse[i];
        }
    }

    public VehicleResponse(String vehicleID, String brand, String line, String plates, String tagCode) {
        Intrinsics.checkNotNullParameter(vehicleID, "vehicleID");
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(line, "line");
        Intrinsics.checkNotNullParameter(plates, "plates");
        Intrinsics.checkNotNullParameter(tagCode, "tagCode");
        this.vehicleID = vehicleID;
        this.brand = brand;
        this.line = line;
        this.plates = plates;
        this.tagCode = tagCode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getBrand() {
        return this.brand;
    }

    public final String getLine() {
        return this.line;
    }

    public final String getPlates() {
        return this.plates;
    }

    public final String getTagCode() {
        return this.tagCode;
    }

    public final String getVehicleID() {
        return this.vehicleID;
    }

    public final void setBrand(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.brand = str;
    }

    public final void setLine(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.line = str;
    }

    public final void setPlates(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.plates = str;
    }

    public final void setTagCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tagCode = str;
    }

    public final void setVehicleID(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.vehicleID = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.vehicleID);
        dest.writeString(this.brand);
        dest.writeString(this.line);
        dest.writeString(this.plates);
        dest.writeString(this.tagCode);
    }
}
