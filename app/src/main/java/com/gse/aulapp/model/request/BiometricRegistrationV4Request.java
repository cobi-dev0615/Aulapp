package com.gse.aulapp.model.request;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.q;
import co.ceduladigital.sdk.x5;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import defpackage.a;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b2\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0089\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u00107\u001a\u000208J\u0013\u00109\u001a\u00020\u00052\b\u0010:\u001a\u0004\u0018\u00010;HÖ\u0003J\t\u0010<\u001a\u000208HÖ\u0001J\t\u0010=\u001a\u00020\u0003HÖ\u0001J\u0016\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u000208R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010\u0014R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\u0014R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014R \u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0012\"\u0004\b(\u0010\u0014R \u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0012\"\u0004\b*\u0010\u0014¨\u0006C"}, d2 = {"Lcom/gse/aulapp/model/request/BiometricRegistrationV4Request;", "Landroid/os/Parcelable;", "username", BuildConfig.FLAVOR, "enrollRightHand", BuildConfig.FLAVOR, "identy", "rightLittle", "rightMiddle", "rightIndex", "rightRing", "leftLittle", "leftMiddle", "leftIndex", "leftRing", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUsername", "()Ljava/lang/String;", "setUsername", "(Ljava/lang/String;)V", "getEnrollRightHand", "()Z", "setEnrollRightHand", "(Z)V", "getIdenty", "setIdenty", "getRightLittle", "setRightLittle", "getRightMiddle", "setRightMiddle", "getRightIndex", "setRightIndex", "getRightRing", "setRightRing", "getLeftLittle", "setLeftLittle", "getLeftMiddle", "setLeftMiddle", "getLeftIndex", "setLeftIndex", "getLeftRing", "setLeftRing", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "describeContents", BuildConfig.FLAVOR, "equals", "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BiometricRegistrationV4Request implements Parcelable {
    public static final Parcelable.Creator<BiometricRegistrationV4Request> CREATOR = new Creator();

    @SerializedName("enrollRightHand")
    private boolean enrollRightHand;

    @SerializedName("identy")
    private String identy;

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

    @SerializedName("username")
    private String username;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BiometricRegistrationV4Request> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BiometricRegistrationV4Request createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BiometricRegistrationV4Request(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BiometricRegistrationV4Request[] newArray(int i) {
            return new BiometricRegistrationV4Request[i];
        }
    }

    public BiometricRegistrationV4Request(String str, boolean z, String identy, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        Intrinsics.checkNotNullParameter(identy, "identy");
        this.username = str;
        this.enrollRightHand = z;
        this.identy = identy;
        this.rightLittle = str2;
        this.rightMiddle = str3;
        this.rightIndex = str4;
        this.rightRing = str5;
        this.leftLittle = str6;
        this.leftMiddle = str7;
        this.leftIndex = str8;
        this.leftRing = str9;
    }

    public static /* synthetic */ BiometricRegistrationV4Request copy$default(BiometricRegistrationV4Request biometricRegistrationV4Request, String str, boolean z, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, Object obj) {
        if ((i & 1) != 0) {
            str = biometricRegistrationV4Request.username;
        }
        if ((i & 2) != 0) {
            z = biometricRegistrationV4Request.enrollRightHand;
        }
        if ((i & 4) != 0) {
            str2 = biometricRegistrationV4Request.identy;
        }
        if ((i & 8) != 0) {
            str3 = biometricRegistrationV4Request.rightLittle;
        }
        if ((i & 16) != 0) {
            str4 = biometricRegistrationV4Request.rightMiddle;
        }
        if ((i & 32) != 0) {
            str5 = biometricRegistrationV4Request.rightIndex;
        }
        if ((i & 64) != 0) {
            str6 = biometricRegistrationV4Request.rightRing;
        }
        if ((i & 128) != 0) {
            str7 = biometricRegistrationV4Request.leftLittle;
        }
        if ((i & 256) != 0) {
            str8 = biometricRegistrationV4Request.leftMiddle;
        }
        if ((i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
            str9 = biometricRegistrationV4Request.leftIndex;
        }
        if ((i & 1024) != 0) {
            str10 = biometricRegistrationV4Request.leftRing;
        }
        String str11 = str9;
        String str12 = str10;
        String str13 = str7;
        String str14 = str8;
        String str15 = str5;
        String str16 = str6;
        String str17 = str4;
        String str18 = str2;
        return biometricRegistrationV4Request.copy(str, z, str18, str3, str17, str15, str16, str13, str14, str11, str12);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    /* renamed from: component10, reason: from getter */
    public final String getLeftIndex() {
        return this.leftIndex;
    }

    /* renamed from: component11, reason: from getter */
    public final String getLeftRing() {
        return this.leftRing;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnrollRightHand() {
        return this.enrollRightHand;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIdenty() {
        return this.identy;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRightLittle() {
        return this.rightLittle;
    }

    /* renamed from: component5, reason: from getter */
    public final String getRightMiddle() {
        return this.rightMiddle;
    }

    /* renamed from: component6, reason: from getter */
    public final String getRightIndex() {
        return this.rightIndex;
    }

    /* renamed from: component7, reason: from getter */
    public final String getRightRing() {
        return this.rightRing;
    }

    /* renamed from: component8, reason: from getter */
    public final String getLeftLittle() {
        return this.leftLittle;
    }

    /* renamed from: component9, reason: from getter */
    public final String getLeftMiddle() {
        return this.leftMiddle;
    }

    public final BiometricRegistrationV4Request copy(String username, boolean enrollRightHand, String identy, String rightLittle, String rightMiddle, String rightIndex, String rightRing, String leftLittle, String leftMiddle, String leftIndex, String leftRing) {
        Intrinsics.checkNotNullParameter(identy, "identy");
        return new BiometricRegistrationV4Request(username, enrollRightHand, identy, rightLittle, rightMiddle, rightIndex, rightRing, leftLittle, leftMiddle, leftIndex, leftRing);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BiometricRegistrationV4Request)) {
            return false;
        }
        BiometricRegistrationV4Request biometricRegistrationV4Request = (BiometricRegistrationV4Request) other;
        return Intrinsics.areEqual(this.username, biometricRegistrationV4Request.username) && this.enrollRightHand == biometricRegistrationV4Request.enrollRightHand && Intrinsics.areEqual(this.identy, biometricRegistrationV4Request.identy) && Intrinsics.areEqual(this.rightLittle, biometricRegistrationV4Request.rightLittle) && Intrinsics.areEqual(this.rightMiddle, biometricRegistrationV4Request.rightMiddle) && Intrinsics.areEqual(this.rightIndex, biometricRegistrationV4Request.rightIndex) && Intrinsics.areEqual(this.rightRing, biometricRegistrationV4Request.rightRing) && Intrinsics.areEqual(this.leftLittle, biometricRegistrationV4Request.leftLittle) && Intrinsics.areEqual(this.leftMiddle, biometricRegistrationV4Request.leftMiddle) && Intrinsics.areEqual(this.leftIndex, biometricRegistrationV4Request.leftIndex) && Intrinsics.areEqual(this.leftRing, biometricRegistrationV4Request.leftRing);
    }

    public final boolean getEnrollRightHand() {
        return this.enrollRightHand;
    }

    public final String getIdenty() {
        return this.identy;
    }

    public final String getLeftIndex() {
        return this.leftIndex;
    }

    public final String getLeftLittle() {
        return this.leftLittle;
    }

    public final String getLeftMiddle() {
        return this.leftMiddle;
    }

    public final String getLeftRing() {
        return this.leftRing;
    }

    public final String getRightIndex() {
        return this.rightIndex;
    }

    public final String getRightLittle() {
        return this.rightLittle;
    }

    public final String getRightMiddle() {
        return this.rightMiddle;
    }

    public final String getRightRing() {
        return this.rightRing;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        String str = this.username;
        int d = x5.d(this.identy, a.g(this.enrollRightHand, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        String str2 = this.rightLittle;
        int hashCode = (d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.rightMiddle;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.rightIndex;
        int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.rightRing;
        int hashCode4 = (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.leftLittle;
        int hashCode5 = (hashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.leftMiddle;
        int hashCode6 = (hashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.leftIndex;
        int hashCode7 = (hashCode6 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.leftRing;
        return hashCode7 + (str9 != null ? str9.hashCode() : 0);
    }

    public final void setEnrollRightHand(boolean z) {
        this.enrollRightHand = z;
    }

    public final void setIdenty(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.identy = str;
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

    public final void setUsername(String str) {
        this.username = str;
    }

    public String toString() {
        String str = this.username;
        boolean z = this.enrollRightHand;
        String str2 = this.identy;
        String str3 = this.rightLittle;
        String str4 = this.rightMiddle;
        String str5 = this.rightIndex;
        String str6 = this.rightRing;
        String str7 = this.leftLittle;
        String str8 = this.leftMiddle;
        String str9 = this.leftIndex;
        String str10 = this.leftRing;
        StringBuilder sb = new StringBuilder("BiometricRegistrationV4Request(username=");
        sb.append(str);
        sb.append(", enrollRightHand=");
        sb.append(z);
        sb.append(", identy=");
        x5.z(sb, str2, ", rightLittle=", str3, ", rightMiddle=");
        x5.z(sb, str4, ", rightIndex=", str5, ", rightRing=");
        x5.z(sb, str6, ", leftLittle=", str7, ", leftMiddle=");
        x5.z(sb, str8, ", leftIndex=", str9, ", leftRing=");
        return q.j(str10, ")", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.username);
        dest.writeInt(this.enrollRightHand ? 1 : 0);
        dest.writeString(this.identy);
        dest.writeString(this.rightLittle);
        dest.writeString(this.rightMiddle);
        dest.writeString(this.rightIndex);
        dest.writeString(this.rightRing);
        dest.writeString(this.leftLittle);
        dest.writeString(this.leftMiddle);
        dest.writeString(this.leftIndex);
        dest.writeString(this.leftRing);
    }

    public /* synthetic */ BiometricRegistrationV4Request(String str, boolean z, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : str9, (i & 1024) != 0 ? null : str10);
    }
}
