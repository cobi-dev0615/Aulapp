package com.gse.aulapp.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.x5;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u00104\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u00105\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0086\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u00107J\u0006\u00108\u001a\u000209J\u0013\u0010:\u001a\u00020\u000b2\b\u0010;\u001a\u0004\u0018\u00010<HÖ\u0003J\t\u0010=\u001a\u000209HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001J\u0016\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u000209R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R \u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006D"}, d2 = {"Lcom/gse/aulapp/model/response/ApprenticeResponse;", "Landroid/os/Parcelable;", "id", BuildConfig.FLAVOR, "fullName", "docNumber", "docType", "email", "role", "preferredHand", "biometricValidationRNEC", BuildConfig.FLAVOR, "usingIdenty", "biometrics", "Lcom/gse/aulapp/model/response/BiometricsResponse;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/gse/aulapp/model/response/BiometricsResponse;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getFullName", "setFullName", "getDocNumber", "setDocNumber", "getDocType", "setDocType", "getEmail", "setEmail", "getRole", "setRole", "getPreferredHand", "setPreferredHand", "getBiometricValidationRNEC", "()Ljava/lang/Boolean;", "setBiometricValidationRNEC", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getUsingIdenty", "setUsingIdenty", "getBiometrics", "()Lcom/gse/aulapp/model/response/BiometricsResponse;", "setBiometrics", "(Lcom/gse/aulapp/model/response/BiometricsResponse;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/gse/aulapp/model/response/BiometricsResponse;)Lcom/gse/aulapp/model/response/ApprenticeResponse;", "describeContents", BuildConfig.FLAVOR, "equals", "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ApprenticeResponse implements Parcelable {
    public static final Parcelable.Creator<ApprenticeResponse> CREATOR = new Creator();

    @SerializedName("biometricValidationRNEC")
    private Boolean biometricValidationRNEC;

    @SerializedName("biometrics")
    private BiometricsResponse biometrics;

    @SerializedName("docNumber")
    private String docNumber;

    @SerializedName("docType")
    private String docType;

    @SerializedName("email")
    private String email;

    @SerializedName("full_name")
    private String fullName;

    @SerializedName("id")
    private String id;

    @SerializedName("preferredHand")
    private String preferredHand;

    @SerializedName("role")
    private String role;

    @SerializedName("usingIdenty")
    private Boolean usingIdenty;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ApprenticeResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApprenticeResponse createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ApprenticeResponse(readString, readString2, readString3, readString4, readString5, readString6, readString7, valueOf, valueOf2, parcel.readInt() != 0 ? BiometricsResponse.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApprenticeResponse[] newArray(int i) {
            return new ApprenticeResponse[i];
        }
    }

    public ApprenticeResponse() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public static /* synthetic */ ApprenticeResponse copy$default(ApprenticeResponse apprenticeResponse, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, BiometricsResponse biometricsResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apprenticeResponse.id;
        }
        if ((i & 2) != 0) {
            str2 = apprenticeResponse.fullName;
        }
        if ((i & 4) != 0) {
            str3 = apprenticeResponse.docNumber;
        }
        if ((i & 8) != 0) {
            str4 = apprenticeResponse.docType;
        }
        if ((i & 16) != 0) {
            str5 = apprenticeResponse.email;
        }
        if ((i & 32) != 0) {
            str6 = apprenticeResponse.role;
        }
        if ((i & 64) != 0) {
            str7 = apprenticeResponse.preferredHand;
        }
        if ((i & 128) != 0) {
            bool = apprenticeResponse.biometricValidationRNEC;
        }
        if ((i & 256) != 0) {
            bool2 = apprenticeResponse.usingIdenty;
        }
        if ((i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
            biometricsResponse = apprenticeResponse.biometrics;
        }
        Boolean bool3 = bool2;
        BiometricsResponse biometricsResponse2 = biometricsResponse;
        String str8 = str7;
        Boolean bool4 = bool;
        String str9 = str5;
        String str10 = str6;
        return apprenticeResponse.copy(str, str2, str3, str4, str9, str10, str8, bool4, bool3, biometricsResponse2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final BiometricsResponse getBiometrics() {
        return this.biometrics;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDocNumber() {
        return this.docNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDocType() {
        return this.docType;
    }

    /* renamed from: component5, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component6, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPreferredHand() {
        return this.preferredHand;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getBiometricValidationRNEC() {
        return this.biometricValidationRNEC;
    }

    /* renamed from: component9, reason: from getter */
    public final Boolean getUsingIdenty() {
        return this.usingIdenty;
    }

    public final ApprenticeResponse copy(String id, String fullName, String docNumber, String docType, String email, String role, String preferredHand, Boolean biometricValidationRNEC, Boolean usingIdenty, BiometricsResponse biometrics) {
        return new ApprenticeResponse(id, fullName, docNumber, docType, email, role, preferredHand, biometricValidationRNEC, usingIdenty, biometrics);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApprenticeResponse)) {
            return false;
        }
        ApprenticeResponse apprenticeResponse = (ApprenticeResponse) other;
        return Intrinsics.areEqual(this.id, apprenticeResponse.id) && Intrinsics.areEqual(this.fullName, apprenticeResponse.fullName) && Intrinsics.areEqual(this.docNumber, apprenticeResponse.docNumber) && Intrinsics.areEqual(this.docType, apprenticeResponse.docType) && Intrinsics.areEqual(this.email, apprenticeResponse.email) && Intrinsics.areEqual(this.role, apprenticeResponse.role) && Intrinsics.areEqual(this.preferredHand, apprenticeResponse.preferredHand) && Intrinsics.areEqual(this.biometricValidationRNEC, apprenticeResponse.biometricValidationRNEC) && Intrinsics.areEqual(this.usingIdenty, apprenticeResponse.usingIdenty) && Intrinsics.areEqual(this.biometrics, apprenticeResponse.biometrics);
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fullName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.docNumber;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.docType;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.email;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.role;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.preferredHand;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.biometricValidationRNEC;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.usingIdenty;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        BiometricsResponse biometricsResponse = this.biometrics;
        return hashCode9 + (biometricsResponse != null ? biometricsResponse.hashCode() : 0);
    }

    public final void setBiometricValidationRNEC(Boolean bool) {
        this.biometricValidationRNEC = bool;
    }

    public final void setBiometrics(BiometricsResponse biometricsResponse) {
        this.biometrics = biometricsResponse;
    }

    public final void setDocNumber(String str) {
        this.docNumber = str;
    }

    public final void setDocType(String str) {
        this.docType = str;
    }

    public final void setEmail(String str) {
        this.email = str;
    }

    public final void setFullName(String str) {
        this.fullName = str;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setPreferredHand(String str) {
        this.preferredHand = str;
    }

    public final void setRole(String str) {
        this.role = str;
    }

    public final void setUsingIdenty(Boolean bool) {
        this.usingIdenty = bool;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.fullName;
        String str3 = this.docNumber;
        String str4 = this.docType;
        String str5 = this.email;
        String str6 = this.role;
        String str7 = this.preferredHand;
        Boolean bool = this.biometricValidationRNEC;
        Boolean bool2 = this.usingIdenty;
        BiometricsResponse biometricsResponse = this.biometrics;
        StringBuilder r = x5.r("ApprenticeResponse(id=", str, ", fullName=", str2, ", docNumber=");
        x5.z(r, str3, ", docType=", str4, ", email=");
        x5.z(r, str5, ", role=", str6, ", preferredHand=");
        r.append(str7);
        r.append(", biometricValidationRNEC=");
        r.append(bool);
        r.append(", usingIdenty=");
        r.append(bool2);
        r.append(", biometrics=");
        r.append(biometricsResponse);
        r.append(")");
        return r.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.fullName);
        dest.writeString(this.docNumber);
        dest.writeString(this.docType);
        dest.writeString(this.email);
        dest.writeString(this.role);
        dest.writeString(this.preferredHand);
        Boolean bool = this.biometricValidationRNEC;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            x5.v(dest, 1, bool);
        }
        Boolean bool2 = this.usingIdenty;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            x5.v(dest, 1, bool2);
        }
        BiometricsResponse biometricsResponse = this.biometrics;
        if (biometricsResponse == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            biometricsResponse.writeToParcel(dest, flags);
        }
    }

    public ApprenticeResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, BiometricsResponse biometricsResponse) {
        this.id = str;
        this.fullName = str2;
        this.docNumber = str3;
        this.docType = str4;
        this.email = str5;
        this.role = str6;
        this.preferredHand = str7;
        this.biometricValidationRNEC = bool;
        this.usingIdenty = bool2;
        this.biometrics = biometricsResponse;
    }

    public /* synthetic */ ApprenticeResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, BiometricsResponse biometricsResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : bool2, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : biometricsResponse);
    }
}
