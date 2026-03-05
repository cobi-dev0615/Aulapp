package com.gse.aulapp.model.dto;

import android.os.Parcel;
import android.os.Parcelable;
import co.ceduladigital.sdk.q;
import co.ceduladigital.sdk.x5;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b \u0010\u0014¨\u0006!"}, d2 = {"Lcom/gse/aulapp/model/dto/ClassRoomDto;", "Landroid/os/Parcelable;", BuildConfig.FLAVOR, "classroomID", "nomenclature", "location", "type", "address", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", BuildConfig.FLAVOR, "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getClassroomID", "getNomenclature", "getLocation", "getType", "getAddress", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ClassRoomDto implements Parcelable {
    public static final Parcelable.Creator<ClassRoomDto> CREATOR = new Creator();
    private final String address;
    private final String classroomID;
    private final String location;
    private final String nomenclature;
    private final String type;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ClassRoomDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ClassRoomDto createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ClassRoomDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ClassRoomDto[] newArray(int i) {
            return new ClassRoomDto[i];
        }
    }

    public ClassRoomDto(String str, String str2, String str3, String str4, String str5) {
        this.classroomID = str;
        this.nomenclature = str2;
        this.location = str3;
        this.type = str4;
        this.address = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClassRoomDto)) {
            return false;
        }
        ClassRoomDto classRoomDto = (ClassRoomDto) other;
        return Intrinsics.areEqual(this.classroomID, classRoomDto.classroomID) && Intrinsics.areEqual(this.nomenclature, classRoomDto.nomenclature) && Intrinsics.areEqual(this.location, classRoomDto.location) && Intrinsics.areEqual(this.type, classRoomDto.type) && Intrinsics.areEqual(this.address, classRoomDto.address);
    }

    public final String getAddress() {
        return this.address;
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
        String str = this.classroomID;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nomenclature;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.location;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.type;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.address;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.classroomID;
        String str2 = this.nomenclature;
        String str3 = this.location;
        String str4 = this.type;
        String str5 = this.address;
        StringBuilder r = x5.r("ClassRoomDto(classroomID=", str, ", nomenclature=", str2, ", location=");
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
