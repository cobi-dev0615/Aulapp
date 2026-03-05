package com.gse.aulapp.model.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tB\t\b\u0016¢\u0006\u0004\b\b\u0010\nJ\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0018R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/gse/aulapp/model/data/entity/VehicleEntity;", "Landroid/os/Parcelable;", "vehicleID", BuildConfig.FLAVOR, "plates", "line", "brand", "tagCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()V", "getVehicleID", "()Ljava/lang/String;", "setVehicleID", "(Ljava/lang/String;)V", "getPlates", "setPlates", "getLine", "setLine", "getBrand", "setBrand", "getTagCode", "setTagCode", "describeContents", BuildConfig.FLAVOR, "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VehicleEntity implements Parcelable {
    public static final Parcelable.Creator<VehicleEntity> CREATOR = new Creator();
    private String brand;
    private String line;
    private String plates;
    private String tagCode;
    private String vehicleID;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VehicleEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VehicleEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new VehicleEntity(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VehicleEntity[] newArray(int i) {
            return new VehicleEntity[i];
        }
    }

    public VehicleEntity(String vehicleID, String plates, String line, String brand, String tagCode) {
        Intrinsics.checkNotNullParameter(vehicleID, "vehicleID");
        Intrinsics.checkNotNullParameter(plates, "plates");
        Intrinsics.checkNotNullParameter(line, "line");
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(tagCode, "tagCode");
        this.vehicleID = vehicleID;
        this.plates = plates;
        this.line = line;
        this.brand = brand;
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
        dest.writeString(this.plates);
        dest.writeString(this.line);
        dest.writeString(this.brand);
        dest.writeString(this.tagCode);
    }

    public VehicleEntity() {
        this(BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR);
    }
}
