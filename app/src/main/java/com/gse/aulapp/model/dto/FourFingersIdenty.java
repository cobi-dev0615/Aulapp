package com.gse.aulapp.model.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.x5;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010(\u001a\u00020)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020)HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020)R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010¨\u00065"}, d2 = {"Lcom/gse/aulapp/model/dto/FourFingersIdenty;", "Landroid/os/Parcelable;", "rightLittle", BuildConfig.FLAVOR, "rightMiddle", "rightIndex", "rightRing", "leftLittle", "leftMiddle", "leftIndex", "leftRing", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRightLittle", "()Ljava/lang/String;", "setRightLittle", "(Ljava/lang/String;)V", "getRightMiddle", "setRightMiddle", "getRightIndex", "setRightIndex", "getRightRing", "setRightRing", "getLeftLittle", "setLeftLittle", "getLeftMiddle", "setLeftMiddle", "getLeftIndex", "setLeftIndex", "getLeftRing", "setLeftRing", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FourFingersIdenty implements Parcelable {
    public static final Parcelable.Creator<FourFingersIdenty> CREATOR = new Creator();

    @SerializedName("leftIndex")
    private String leftIndex;

    @SerializedName("leftLittle")
    private String leftLittle;

    @SerializedName("leftMiddle")
    private String leftMiddle;

    @SerializedName("leftRing")
    private String leftRing;

    @SerializedName("rightIndex")
    private String rightIndex;

    @SerializedName("rightLittle")
    private String rightLittle;

    @SerializedName("rightMiddle")
    private String rightMiddle;

    @SerializedName("rightRing")
    private String rightRing;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FourFingersIdenty> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FourFingersIdenty createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FourFingersIdenty(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FourFingersIdenty[] newArray(int i) {
            return new FourFingersIdenty[i];
        }
    }

    public FourFingersIdenty() {
        this(null, null, null, null, null, null, null, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
    }

    public static /* synthetic */ FourFingersIdenty copy$default(FourFingersIdenty fourFingersIdenty, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fourFingersIdenty.rightLittle;
        }
        if ((i & 2) != 0) {
            str2 = fourFingersIdenty.rightMiddle;
        }
        if ((i & 4) != 0) {
            str3 = fourFingersIdenty.rightIndex;
        }
        if ((i & 8) != 0) {
            str4 = fourFingersIdenty.rightRing;
        }
        if ((i & 16) != 0) {
            str5 = fourFingersIdenty.leftLittle;
        }
        if ((i & 32) != 0) {
            str6 = fourFingersIdenty.leftMiddle;
        }
        if ((i & 64) != 0) {
            str7 = fourFingersIdenty.leftIndex;
        }
        if ((i & 128) != 0) {
            str8 = fourFingersIdenty.leftRing;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return fourFingersIdenty.copy(str, str2, str3, str4, str11, str12, str9, str10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRightLittle() {
        return this.rightLittle;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRightMiddle() {
        return this.rightMiddle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRightIndex() {
        return this.rightIndex;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRightRing() {
        return this.rightRing;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLeftLittle() {
        return this.leftLittle;
    }

    /* renamed from: component6, reason: from getter */
    public final String getLeftMiddle() {
        return this.leftMiddle;
    }

    /* renamed from: component7, reason: from getter */
    public final String getLeftIndex() {
        return this.leftIndex;
    }

    /* renamed from: component8, reason: from getter */
    public final String getLeftRing() {
        return this.leftRing;
    }

    public final FourFingersIdenty copy(String rightLittle, String rightMiddle, String rightIndex, String rightRing, String leftLittle, String leftMiddle, String leftIndex, String leftRing) {
        return new FourFingersIdenty(rightLittle, rightMiddle, rightIndex, rightRing, leftLittle, leftMiddle, leftIndex, leftRing);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FourFingersIdenty)) {
            return false;
        }
        FourFingersIdenty fourFingersIdenty = (FourFingersIdenty) other;
        return Intrinsics.areEqual(this.rightLittle, fourFingersIdenty.rightLittle) && Intrinsics.areEqual(this.rightMiddle, fourFingersIdenty.rightMiddle) && Intrinsics.areEqual(this.rightIndex, fourFingersIdenty.rightIndex) && Intrinsics.areEqual(this.rightRing, fourFingersIdenty.rightRing) && Intrinsics.areEqual(this.leftLittle, fourFingersIdenty.leftLittle) && Intrinsics.areEqual(this.leftMiddle, fourFingersIdenty.leftMiddle) && Intrinsics.areEqual(this.leftIndex, fourFingersIdenty.leftIndex) && Intrinsics.areEqual(this.leftRing, fourFingersIdenty.leftRing);
    }

    public int hashCode() {
        String str = this.rightLittle;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.rightMiddle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.rightIndex;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.rightRing;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.leftLittle;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.leftMiddle;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.leftIndex;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.leftRing;
        return hashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public final void setLeftIndex(String str) {
        this.leftIndex = str;
    }

    public final void setLeftLittle(String str) {
        this.leftLittle = str;
    }

    public final void setLeftMiddle(String str) {
        this.leftMiddle = str;
    }

    public final void setLeftRing(String str) {
        this.leftRing = str;
    }

    public final void setRightIndex(String str) {
        this.rightIndex = str;
    }

    public final void setRightLittle(String str) {
        this.rightLittle = str;
    }

    public final void setRightMiddle(String str) {
        this.rightMiddle = str;
    }

    public final void setRightRing(String str) {
        this.rightRing = str;
    }

    public String toString() {
        String str = this.rightLittle;
        String str2 = this.rightMiddle;
        String str3 = this.rightIndex;
        String str4 = this.rightRing;
        String str5 = this.leftLittle;
        String str6 = this.leftMiddle;
        String str7 = this.leftIndex;
        String str8 = this.leftRing;
        StringBuilder r = x5.r("FourFingersIdenty(rightLittle=", str, ", rightMiddle=", str2, ", rightIndex=");
        x5.z(r, str3, ", rightRing=", str4, ", leftLittle=");
        x5.z(r, str5, ", leftMiddle=", str6, ", leftIndex=");
        r.append(str7);
        r.append(", leftRing=");
        r.append(str8);
        r.append(")");
        return r.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.rightLittle);
        dest.writeString(this.rightMiddle);
        dest.writeString(this.rightIndex);
        dest.writeString(this.rightRing);
        dest.writeString(this.leftLittle);
        dest.writeString(this.leftMiddle);
        dest.writeString(this.leftIndex);
        dest.writeString(this.leftRing);
    }

    public FourFingersIdenty(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.rightLittle = str;
        this.rightMiddle = str2;
        this.rightIndex = str3;
        this.rightRing = str4;
        this.leftLittle = str5;
        this.leftMiddle = str6;
        this.leftIndex = str7;
        this.leftRing = str8;
    }

    public /* synthetic */ FourFingersIdenty(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8);
    }
}
