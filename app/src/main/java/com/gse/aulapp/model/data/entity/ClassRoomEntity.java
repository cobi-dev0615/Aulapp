package com.gse.aulapp.model.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.q;
import co.ceduladigital.sdk.x5;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tB\t\b\u0016¢\u0006\u0004\b\b\u0010\nJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J;\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001eHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001eR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000e¨\u0006*"}, d2 = {"Lcom/gse/aulapp/model/data/entity/ClassRoomEntity;", "Landroid/os/Parcelable;", "classroomID", BuildConfig.FLAVOR, "nomenclature", "location", "type", "address", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()V", "getClassroomID", "()Ljava/lang/String;", "setClassroomID", "(Ljava/lang/String;)V", "getNomenclature", "setNomenclature", "getLocation", "setLocation", "getType", "setType", "getAddress", "setAddress", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ClassRoomEntity implements Parcelable {
    public static final Parcelable.Creator<ClassRoomEntity> CREATOR = new Creator();
    private String address;
    private String classroomID;
    private String location;
    private String nomenclature;
    private String type;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ClassRoomEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ClassRoomEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ClassRoomEntity(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ClassRoomEntity[] newArray(int i) {
            return new ClassRoomEntity[i];
        }
    }

    public ClassRoomEntity(String classroomID, String nomenclature, String location, String type, String address) {
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

    public static /* synthetic */ ClassRoomEntity copy$default(ClassRoomEntity classRoomEntity, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = classRoomEntity.classroomID;
        }
        if ((i & 2) != 0) {
            str2 = classRoomEntity.nomenclature;
        }
        if ((i & 4) != 0) {
            str3 = classRoomEntity.location;
        }
        if ((i & 8) != 0) {
            str4 = classRoomEntity.type;
        }
        if ((i & 16) != 0) {
            str5 = classRoomEntity.address;
        }
        String str6 = str5;
        String str7 = str3;
        return classRoomEntity.copy(str, str2, str7, str4, str6);
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

    public final ClassRoomEntity copy(String classroomID, String nomenclature, String location, String type, String address) {
        Intrinsics.checkNotNullParameter(classroomID, "classroomID");
        Intrinsics.checkNotNullParameter(nomenclature, "nomenclature");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(address, "address");
        return new ClassRoomEntity(classroomID, nomenclature, location, type, address);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClassRoomEntity)) {
            return false;
        }
        ClassRoomEntity classRoomEntity = (ClassRoomEntity) other;
        return Intrinsics.areEqual(this.classroomID, classRoomEntity.classroomID) && Intrinsics.areEqual(this.nomenclature, classRoomEntity.nomenclature) && Intrinsics.areEqual(this.location, classRoomEntity.location) && Intrinsics.areEqual(this.type, classRoomEntity.type) && Intrinsics.areEqual(this.address, classRoomEntity.address);
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
        StringBuilder r = x5.r("ClassRoomEntity(classroomID=", str, ", nomenclature=", str2, ", location=");
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

    public ClassRoomEntity() {
        this(BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR);
    }
}
