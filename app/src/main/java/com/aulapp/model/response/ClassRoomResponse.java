package com.gse.aulapp.model.response;

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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006)"}, d2 = {"Lcom/gse/aulapp/model/response/ClassRoomResponse;", "Landroid/os/Parcelable;", "classroomID", BuildConfig.FLAVOR, "nomenclature", "location", "type", "address", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClassroomID", "()Ljava/lang/String;", "setClassroomID", "(Ljava/lang/String;)V", "getNomenclature", "setNomenclature", "getLocation", "setLocation", "getType", "setType", "getAddress", "setAddress", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ClassRoomResponse implements Parcelable {
    public static final Parcelable.Creator<ClassRoomResponse> CREATOR = new Creator();

    @SerializedName("address")
    @Expose
    private String address;

    @SerializedName("classroomID")
    @Expose
    private String classroomID;

    @SerializedName("location")
    @Expose
    private String location;

    @SerializedName("nomenclature")
    @Expose
    private String nomenclature;

    @SerializedName("type")
    @Expose
    private String type;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ClassRoomResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ClassRoomResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ClassRoomResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ClassRoomResponse[] newArray(int i) {
            return new ClassRoomResponse[i];
        }
    }

    public ClassRoomResponse(String classroomID, String nomenclature, String location, String type, String address) {
        Intrinsics.checkNotNullParameter(classroomID, "classroomID");
        Intrinsics.checkNotNullParameter(nomenclature, "nomenclature");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(address, "address");
        this.classroomID = classroomID;
        this.nomenclature = nomenclature;
        this.location = location;
        this.type = type;
        this.address = address;
    }

    public static /* synthetic */ ClassRoomResponse copy$default(ClassRoomResponse classRoomResponse, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = classRoomResponse.classroomID;
        }
        if ((i & 2) != 0) {
            str2 = classRoomResponse.nomenclature;
        }
        if ((i & 4) != 0) {
            str3 = classRoomResponse.location;
        }
        if ((i & 8) != 0) {
            str4 = classRoomResponse.type;
        }
        if ((i & 16) != 0) {
            str5 = classRoomResponse.address;
        }
        String str6 = str5;
        String str7 = str3;
        return classRoomResponse.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getClassroomID() {
        return this.classroomID;
    }

    /* renamed from: component2, reason: from getter */
    public final String getNomenclature() {
        return this.nomenclature;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    /* renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    public final ClassRoomResponse copy(String classroomID, String nomenclature, String location, String type, String address) {
        Intrinsics.checkNotNullParameter(classroomID, "classroomID");
        Intrinsics.checkNotNullParameter(nomenclature, "nomenclature");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(address, "address");
        return new ClassRoomResponse(classroomID, nomenclature, location, type, address);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClassRoomResponse)) {
            return false;
        }
        ClassRoomResponse classRoomResponse = (ClassRoomResponse) other;
        return Intrinsics.areEqual(this.classroomID, classRoomResponse.classroomID) && Intrinsics.areEqual(this.nomenclature, classRoomResponse.nomenclature) && Intrinsics.areEqual(this.location, classRoomResponse.location) && Intrinsics.areEqual(this.type, classRoomResponse.type) && Intrinsics.areEqual(this.address, classRoomResponse.address);
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getClassroomID() {
        return this.classroomID;
    }

    public final String getLocation() {
        return this.location;
    }

    public final String getNomenclature() {
        return this.nomenclature;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.address.hashCode() + x5.d(this.type, x5.d(this.location, x5.d(this.nomenclature, this.classroomID.hashCode() * 31, 31), 31), 31);
    }

    public final void setAddress(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.address = str;
    }

    public final void setClassroomID(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.classroomID = str;
    }

    public final void setLocation(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.location = str;
    }

    public final void setNomenclature(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nomenclature = str;
    }

    public final void setType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    public String toString() {
        String str = this.classroomID;
        String str2 = this.nomenclature;
        String str3 = this.location;
        String str4 = this.type;
        String str5 = this.address;
        StringBuilder r = x5.r("ClassRoomResponse(classroomID=", str, ", nomenclature=", str2, ", location=");
        x5.z(r, str3, ", type=", str4, ", address=");
        return q.j(str5, ")", r);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.classroomID);
        dest.writeString(this.nomenclature);
        dest.writeString(this.location);
        dest.writeString(this.type);
        dest.writeString(this.address);
    }
}
