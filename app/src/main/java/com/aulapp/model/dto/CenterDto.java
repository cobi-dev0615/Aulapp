package com.gse.aulapp.model.dto;

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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006%"}, d2 = {"Lcom/gse/aulapp/model/dto/CenterDto;", "Landroid/os/Parcelable;", "name", BuildConfig.FLAVOR, "centerID", "phoneNumber", "address", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getCenterID", "setCenterID", "getPhoneNumber", "setPhoneNumber", "getAddress", "setAddress", "component1", "component2", "component3", "component4", "copy", "describeContents", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CenterDto implements Parcelable {
    public static final Parcelable.Creator<CenterDto> CREATOR = new Creator();

    @SerializedName("address")
    private String address;

    @SerializedName("centerID")
    private String centerID;

    @SerializedName("name")
    private String name;

    @SerializedName("phoneNumber")
    private String phoneNumber;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CenterDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CenterDto createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CenterDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CenterDto[] newArray(int i) {
            return new CenterDto[i];
        }
    }

    public CenterDto() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ CenterDto copy$default(CenterDto centerDto, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = centerDto.name;
        }
        if ((i & 2) != 0) {
            str2 = centerDto.centerID;
        }
        if ((i & 4) != 0) {
            str3 = centerDto.phoneNumber;
        }
        if ((i & 8) != 0) {
            str4 = centerDto.address;
        }
        return centerDto.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCenterID() {
        return this.centerID;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    public final CenterDto copy(String name, String centerID, String phoneNumber, String address) {
        return new CenterDto(name, centerID, phoneNumber, address);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CenterDto)) {
            return false;
        }
        CenterDto centerDto = (CenterDto) other;
        return Intrinsics.areEqual(this.name, centerDto.name) && Intrinsics.areEqual(this.centerID, centerDto.centerID) && Intrinsics.areEqual(this.phoneNumber, centerDto.phoneNumber) && Intrinsics.areEqual(this.address, centerDto.address);
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getCenterID() {
        return this.centerID;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.centerID;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phoneNumber;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.address;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setAddress(String str) {
        this.address = str;
    }

    public final void setCenterID(String str) {
        this.centerID = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public String toString() {
        String str = this.name;
        String str2 = this.centerID;
        String str3 = this.phoneNumber;
        String str4 = this.address;
        StringBuilder r = x5.r("CenterDto(name=", str, ", centerID=", str2, ", phoneNumber=");
        r.append(str3);
        r.append(", address=");
        r.append(str4);
        r.append(")");
        return r.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.centerID);
        dest.writeString(this.phoneNumber);
        dest.writeString(this.address);
    }

    public CenterDto(String str, String str2, String str3, String str4) {
        this.name = str;
        this.centerID = str2;
        this.phoneNumber = str3;
        this.address = str4;
    }

    public /* synthetic */ CenterDto(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
