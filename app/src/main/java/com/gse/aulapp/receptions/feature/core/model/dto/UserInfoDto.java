package com.gse.aulapp.receptions.feature.core.model.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.x5;
import com.google.gson.annotations.SerializedName;
import com.gse.aulapp.model.dto.FourFingersIdenty;
import com.gse.aulapp.model.enumerate.EnumBiometricMoments;
import com.gse.aulapp.model.enumerate.EnumHandsAulapp;
import com.gse.aulapp.model.enumerate.EnumUserProfile;
import com.karumi.dexter.BuildConfig;
import defpackage.a;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0006HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u000bHÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0012HÆ\u0003J}\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\u0006\u0010C\u001a\u00020DJ\u0013\u0010E\u001a\u00020\u000b2\b\u0010F\u001a\u0004\u0018\u00010GHÖ\u0003J\t\u0010H\u001a\u00020DHÖ\u0001J\t\u0010I\u001a\u00020\u0003HÖ\u0001J\u0016\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020DR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010\u0018R \u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R \u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u0006O"}, d2 = {"Lcom/gse/aulapp/receptions/feature/core/model/dto/UserInfoDto;", "Landroid/os/Parcelable;", "userID", BuildConfig.FLAVOR, "documentNumber", "userRole", "Lcom/gse/aulapp/model/enumerate/EnumUserProfile;", "userName", "userEmail", "documentType", "fullEnrolment", BuildConfig.FLAVOR, "pathDocument", "enrollOrVerify", "Lcom/gse/aulapp/model/enumerate/EnumBiometricMoments;", "hand", "Lcom/gse/aulapp/model/enumerate/EnumHandsAulapp;", "fourFingersIdentyID", "Lcom/gse/aulapp/model/dto/FourFingersIdenty;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/gse/aulapp/model/enumerate/EnumUserProfile;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/gse/aulapp/model/enumerate/EnumBiometricMoments;Lcom/gse/aulapp/model/enumerate/EnumHandsAulapp;Lcom/gse/aulapp/model/dto/FourFingersIdenty;)V", "getUserID", "()Ljava/lang/String;", "setUserID", "(Ljava/lang/String;)V", "getDocumentNumber", "setDocumentNumber", "getUserRole", "()Lcom/gse/aulapp/model/enumerate/EnumUserProfile;", "setUserRole", "(Lcom/gse/aulapp/model/enumerate/EnumUserProfile;)V", "getUserName", "setUserName", "getUserEmail", "setUserEmail", "getDocumentType", "setDocumentType", "getFullEnrolment", "()Z", "setFullEnrolment", "(Z)V", "getPathDocument", "setPathDocument", "getEnrollOrVerify", "()Lcom/gse/aulapp/model/enumerate/EnumBiometricMoments;", "setEnrollOrVerify", "(Lcom/gse/aulapp/model/enumerate/EnumBiometricMoments;)V", "getHand", "()Lcom/gse/aulapp/model/enumerate/EnumHandsAulapp;", "setHand", "(Lcom/gse/aulapp/model/enumerate/EnumHandsAulapp;)V", "getFourFingersIdentyID", "()Lcom/gse/aulapp/model/dto/FourFingersIdenty;", "setFourFingersIdentyID", "(Lcom/gse/aulapp/model/dto/FourFingersIdenty;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "describeContents", BuildConfig.FLAVOR, "equals", "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UserInfoDto implements Parcelable {
    public static final Parcelable.Creator<UserInfoDto> CREATOR = new Creator();

    @SerializedName("userDocument")
    private String documentNumber;

    @SerializedName("documentType")
    private String documentType;

    @SerializedName("enrollOrVerify")
    private EnumBiometricMoments enrollOrVerify;

    @SerializedName("fourFingersIdentyID")
    private FourFingersIdenty fourFingersIdentyID;

    @SerializedName("fullEnrolment")
    private boolean fullEnrolment;

    @SerializedName("hand")
    private EnumHandsAulapp hand;

    @SerializedName("pathDocument")
    private String pathDocument;

    @SerializedName("userEmail")
    private String userEmail;

    @SerializedName("userID")
    private String userID;

    @SerializedName("userName")
    private String userName;

    @SerializedName("userRole")
    private EnumUserProfile userRole;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UserInfoDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserInfoDto createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UserInfoDto(parcel.readString(), parcel.readString(), EnumUserProfile.valueOfString(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : EnumBiometricMoments.valueOfString(parcel.readString()), parcel.readInt() == 0 ? null : EnumHandsAulapp.valueOfString(parcel.readString()), parcel.readInt() != 0 ? FourFingersIdenty.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserInfoDto[] newArray(int i) {
            return new UserInfoDto[i];
        }
    }

    public UserInfoDto(String userID, String documentNumber, EnumUserProfile userRole, String userName, String userEmail, String documentType, boolean z, String pathDocument, EnumBiometricMoments enumBiometricMoments, EnumHandsAulapp enumHandsAulapp, FourFingersIdenty fourFingersIdenty) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(userRole, "userRole");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(userEmail, "userEmail");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(pathDocument, "pathDocument");
        this.userID = userID;
        this.documentNumber = documentNumber;
        this.userRole = userRole;
        this.userName = userName;
        this.userEmail = userEmail;
        this.documentType = documentType;
        this.fullEnrolment = z;
        this.pathDocument = pathDocument;
        this.enrollOrVerify = enumBiometricMoments;
        this.hand = enumHandsAulapp;
        this.fourFingersIdentyID = fourFingersIdenty;
    }

    public static /* synthetic */ UserInfoDto copy$default(UserInfoDto userInfoDto, String str, String str2, EnumUserProfile enumUserProfile, String str3, String str4, String str5, boolean z, String str6, EnumBiometricMoments enumBiometricMoments, EnumHandsAulapp enumHandsAulapp, FourFingersIdenty fourFingersIdenty, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userInfoDto.userID;
        }
        if ((i & 2) != 0) {
            str2 = userInfoDto.documentNumber;
        }
        if ((i & 4) != 0) {
            enumUserProfile = userInfoDto.userRole;
        }
        if ((i & 8) != 0) {
            str3 = userInfoDto.userName;
        }
        if ((i & 16) != 0) {
            str4 = userInfoDto.userEmail;
        }
        if ((i & 32) != 0) {
            str5 = userInfoDto.documentType;
        }
        if ((i & 64) != 0) {
            z = userInfoDto.fullEnrolment;
        }
        if ((i & 128) != 0) {
            str6 = userInfoDto.pathDocument;
        }
        if ((i & 256) != 0) {
            enumBiometricMoments = userInfoDto.enrollOrVerify;
        }
        if ((i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
            enumHandsAulapp = userInfoDto.hand;
        }
        if ((i & 1024) != 0) {
            fourFingersIdenty = userInfoDto.fourFingersIdentyID;
        }
        EnumHandsAulapp enumHandsAulapp2 = enumHandsAulapp;
        FourFingersIdenty fourFingersIdenty2 = fourFingersIdenty;
        String str7 = str6;
        EnumBiometricMoments enumBiometricMoments2 = enumBiometricMoments;
        String str8 = str5;
        boolean z2 = z;
        String str9 = str4;
        EnumUserProfile enumUserProfile2 = enumUserProfile;
        return userInfoDto.copy(str, str2, enumUserProfile2, str3, str9, str8, z2, str7, enumBiometricMoments2, enumHandsAulapp2, fourFingersIdenty2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUserID() {
        return this.userID;
    }

    /* renamed from: component10, reason: from getter */
    public final EnumHandsAulapp getHand() {
        return this.hand;
    }

    /* renamed from: component11, reason: from getter */
    public final FourFingersIdenty getFourFingersIdentyID() {
        return this.fourFingersIdentyID;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final EnumUserProfile getUserRole() {
        return this.userRole;
    }

    /* renamed from: component4, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getUserEmail() {
        return this.userEmail;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDocumentType() {
        return this.documentType;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getFullEnrolment() {
        return this.fullEnrolment;
    }

    /* renamed from: component8, reason: from getter */
    public final String getPathDocument() {
        return this.pathDocument;
    }

    /* renamed from: component9, reason: from getter */
    public final EnumBiometricMoments getEnrollOrVerify() {
        return this.enrollOrVerify;
    }

    public final UserInfoDto copy(String userID, String documentNumber, EnumUserProfile userRole, String userName, String userEmail, String documentType, boolean fullEnrolment, String pathDocument, EnumBiometricMoments enrollOrVerify, EnumHandsAulapp hand, FourFingersIdenty fourFingersIdentyID) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(userRole, "userRole");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(userEmail, "userEmail");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(pathDocument, "pathDocument");
        return new UserInfoDto(userID, documentNumber, userRole, userName, userEmail, documentType, fullEnrolment, pathDocument, enrollOrVerify, hand, fourFingersIdentyID);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserInfoDto)) {
            return false;
        }
        UserInfoDto userInfoDto = (UserInfoDto) other;
        return Intrinsics.areEqual(this.userID, userInfoDto.userID) && Intrinsics.areEqual(this.documentNumber, userInfoDto.documentNumber) && this.userRole == userInfoDto.userRole && Intrinsics.areEqual(this.userName, userInfoDto.userName) && Intrinsics.areEqual(this.userEmail, userInfoDto.userEmail) && Intrinsics.areEqual(this.documentType, userInfoDto.documentType) && this.fullEnrolment == userInfoDto.fullEnrolment && Intrinsics.areEqual(this.pathDocument, userInfoDto.pathDocument) && this.enrollOrVerify == userInfoDto.enrollOrVerify && this.hand == userInfoDto.hand && Intrinsics.areEqual(this.fourFingersIdentyID, userInfoDto.fourFingersIdentyID);
    }

    public int hashCode() {
        int d = x5.d(this.pathDocument, a.g(this.fullEnrolment, x5.d(this.documentType, x5.d(this.userEmail, x5.d(this.userName, (this.userRole.hashCode() + x5.d(this.documentNumber, this.userID.hashCode() * 31, 31)) * 31, 31), 31), 31), 31), 31);
        EnumBiometricMoments enumBiometricMoments = this.enrollOrVerify;
        int hashCode = (d + (enumBiometricMoments == null ? 0 : enumBiometricMoments.hashCode())) * 31;
        EnumHandsAulapp enumHandsAulapp = this.hand;
        int hashCode2 = (hashCode + (enumHandsAulapp == null ? 0 : enumHandsAulapp.hashCode())) * 31;
        FourFingersIdenty fourFingersIdenty = this.fourFingersIdentyID;
        return hashCode2 + (fourFingersIdenty != null ? fourFingersIdenty.hashCode() : 0);
    }

    public final void setDocumentNumber(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.documentNumber = str;
    }

    public final void setDocumentType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.documentType = str;
    }

    public final void setEnrollOrVerify(EnumBiometricMoments enumBiometricMoments) {
        this.enrollOrVerify = enumBiometricMoments;
    }

    public final void setFourFingersIdentyID(FourFingersIdenty fourFingersIdenty) {
        this.fourFingersIdentyID = fourFingersIdenty;
    }

    public final void setFullEnrolment(boolean z) {
        this.fullEnrolment = z;
    }

    public final void setHand(EnumHandsAulapp enumHandsAulapp) {
        this.hand = enumHandsAulapp;
    }

    public final void setPathDocument(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pathDocument = str;
    }

    public final void setUserEmail(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userEmail = str;
    }

    public final void setUserID(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userID = str;
    }

    public final void setUserName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userName = str;
    }

    public final void setUserRole(EnumUserProfile enumUserProfile) {
        Intrinsics.checkNotNullParameter(enumUserProfile, "<set-?>");
        this.userRole = enumUserProfile;
    }

    public String toString() {
        String str = this.userID;
        String str2 = this.documentNumber;
        EnumUserProfile enumUserProfile = this.userRole;
        String str3 = this.userName;
        String str4 = this.userEmail;
        String str5 = this.documentType;
        boolean z = this.fullEnrolment;
        String str6 = this.pathDocument;
        EnumBiometricMoments enumBiometricMoments = this.enrollOrVerify;
        EnumHandsAulapp enumHandsAulapp = this.hand;
        FourFingersIdenty fourFingersIdenty = this.fourFingersIdentyID;
        StringBuilder r = x5.r("UserInfoDto(userID=", str, ", documentNumber=", str2, ", userRole=");
        r.append(enumUserProfile);
        r.append(", userName=");
        r.append(str3);
        r.append(", userEmail=");
        x5.z(r, str4, ", documentType=", str5, ", fullEnrolment=");
        r.append(z);
        r.append(", pathDocument=");
        r.append(str6);
        r.append(", enrollOrVerify=");
        r.append(enumBiometricMoments);
        r.append(", hand=");
        r.append(enumHandsAulapp);
        r.append(", fourFingersIdentyID=");
        r.append(fourFingersIdenty);
        r.append(")");
        return r.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.userID);
        dest.writeString(this.documentNumber);
        dest.writeString(this.userRole.name());
        dest.writeString(this.userName);
        dest.writeString(this.userEmail);
        dest.writeString(this.documentType);
        dest.writeInt(this.fullEnrolment ? 1 : 0);
        dest.writeString(this.pathDocument);
        EnumBiometricMoments enumBiometricMoments = this.enrollOrVerify;
        if (enumBiometricMoments == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumBiometricMoments.name());
        }
        EnumHandsAulapp enumHandsAulapp = this.hand;
        if (enumHandsAulapp == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumHandsAulapp.name());
        }
        FourFingersIdenty fourFingersIdenty = this.fourFingersIdentyID;
        if (fourFingersIdenty == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            fourFingersIdenty.writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ UserInfoDto(String str, String str2, EnumUserProfile enumUserProfile, String str3, String str4, String str5, boolean z, String str6, EnumBiometricMoments enumBiometricMoments, EnumHandsAulapp enumHandsAulapp, FourFingersIdenty fourFingersIdenty, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, enumUserProfile, str3, str4, str5, z, str6, (i & 256) != 0 ? null : enumBiometricMoments, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : enumHandsAulapp, (i & 1024) != 0 ? null : fourFingersIdenty);
    }
}
