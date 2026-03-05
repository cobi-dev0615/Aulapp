package com.gse.aulapp.model.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.x5;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0017JB\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010 J\u0006\u0010!\u001a\u00020\bJ\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\bHÖ\u0001J\t\u0010'\u001a\u00020\u0004HÖ\u0001J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\bR&\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\"\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006-"}, d2 = {"Lcom/gse/aulapp/model/dto/CoursesDto;", "Landroid/os/Parcelable;", "moduleID", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "id", "name", "duration", BuildConfig.FLAVOR, "<init>", "([Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getModuleID", "()[Ljava/lang/String;", "setModuleID", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getName", "setName", "getDuration", "()Ljava/lang/Integer;", "setDuration", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "([Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/gse/aulapp/model/dto/CoursesDto;", "describeContents", "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CoursesDto implements Parcelable {
    public static final Parcelable.Creator<CoursesDto> CREATOR = new Creator();

    @SerializedName("duration")
    private Integer duration;

    @SerializedName("id")
    private String id;

    @SerializedName("moduleID")
    private String[] moduleID;

    @SerializedName("name")
    private String name;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CoursesDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoursesDto createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CoursesDto(parcel.createStringArray(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoursesDto[] newArray(int i) {
            return new CoursesDto[i];
        }
    }

    public CoursesDto(String[] moduleID, String str, String str2, Integer num) {
        Intrinsics.checkNotNullParameter(moduleID, "moduleID");
        this.moduleID = moduleID;
        this.id = str;
        this.name = str2;
        this.duration = num;
    }

    public static /* synthetic */ CoursesDto copy$default(CoursesDto coursesDto, String[] strArr, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            strArr = coursesDto.moduleID;
        }
        if ((i & 2) != 0) {
            str = coursesDto.id;
        }
        if ((i & 4) != 0) {
            str2 = coursesDto.name;
        }
        if ((i & 8) != 0) {
            num = coursesDto.duration;
        }
        return coursesDto.copy(strArr, str, str2, num);
    }

    /* renamed from: component1, reason: from getter */
    public final String[] getModuleID() {
        return this.moduleID;
    }

    /* renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getDuration() {
        return this.duration;
    }

    public final CoursesDto copy(String[] moduleID, String id, String name, Integer duration) {
        Intrinsics.checkNotNullParameter(moduleID, "moduleID");
        return new CoursesDto(moduleID, id, name, duration);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoursesDto)) {
            return false;
        }
        CoursesDto coursesDto = (CoursesDto) other;
        return Intrinsics.areEqual(this.moduleID, coursesDto.moduleID) && Intrinsics.areEqual(this.id, coursesDto.id) && Intrinsics.areEqual(this.name, coursesDto.name) && Intrinsics.areEqual(this.duration, coursesDto.duration);
    }

    public final String[] getModuleID() {
        return this.moduleID;
    }

    public int hashCode() {
        int hashCode = Arrays.hashCode(this.moduleID) * 31;
        String str = this.id;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.duration;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final void setDuration(Integer num) {
        this.duration = num;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setModuleID(String[] strArr) {
        Intrinsics.checkNotNullParameter(strArr, "<set-?>");
        this.moduleID = strArr;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public String toString() {
        String arrays = Arrays.toString(this.moduleID);
        String str = this.id;
        String str2 = this.name;
        Integer num = this.duration;
        StringBuilder r = x5.r("CoursesDto(moduleID=", arrays, ", id=", str, ", name=");
        r.append(str2);
        r.append(", duration=");
        r.append(num);
        r.append(")");
        return r.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeStringArray(this.moduleID);
        dest.writeString(this.id);
        dest.writeString(this.name);
        Integer num = this.duration;
        if (num == null) {
            dest.writeInt(0);
        } else {
            x5.w(dest, 1, num);
        }
    }

    public /* synthetic */ CoursesDto(String[] strArr, String str, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num);
    }
}
