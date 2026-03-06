package com.gse.aulapp.model.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.x5;
import com.gse.aulapp.model.enumerate.EnumUserProfile;
import com.gse.aulapp.model.enums.EnumFraudStep;
import com.karumi.dexter.BuildConfig;
import defpackage.a;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\rHÆ\u0003Jo\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\rHÆ\u0001J\u0006\u0010+\u001a\u00020,J\u0013\u0010-\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020,HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020,R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001d¨\u00067"}, d2 = {"Lcom/gse/aulapp/model/dto/FraudCredentialsDto;", "Landroid/os/Parcelable;", "fraudId", BuildConfig.FLAVOR, "documentNumber", "stepFraud", "Lcom/gse/aulapp/model/enums/EnumFraudStep;", "userId", "fullName", "role", "Lcom/gse/aulapp/model/enumerate/EnumUserProfile;", "docType", "fullEnrolment", BuildConfig.FLAVOR, "userEmail", "destinyExamOrClass", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/gse/aulapp/model/enums/EnumFraudStep;Ljava/lang/String;Ljava/lang/String;Lcom/gse/aulapp/model/enumerate/EnumUserProfile;Ljava/lang/String;ZLjava/lang/String;Z)V", "getFraudId", "()Ljava/lang/String;", "getDocumentNumber", "getStepFraud", "()Lcom/gse/aulapp/model/enums/EnumFraudStep;", "getUserId", "getFullName", "getRole", "()Lcom/gse/aulapp/model/enumerate/EnumUserProfile;", "getDocType", "getFullEnrolment", "()Z", "getUserEmail", "getDestinyExamOrClass", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "describeContents", BuildConfig.FLAVOR, "equals", "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FraudCredentialsDto implements Parcelable {
    public static final Parcelable.Creator<FraudCredentialsDto> CREATOR = new Creator();
    private final boolean destinyExamOrClass;
    private final String docType;
    private final String documentNumber;
    private final String fraudId;
    private final boolean fullEnrolment;
    private final String fullName;
    private final EnumUserProfile role;
    private final EnumFraudStep stepFraud;
    private final String userEmail;
    private final String userId;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FraudCredentialsDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FraudCredentialsDto createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            EnumFraudStep valueOf = EnumFraudStep.valueOfString(parcel.readString());
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            EnumUserProfile valueOf2 = EnumUserProfile.valueOfString(parcel.readString());
            String readString5 = parcel.readString();
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
                z2 = true;
            } else {
                z = false;
                z2 = true;
            }
            String readString6 = parcel.readString();
            if (parcel.readInt() == 0) {
                z2 = z;
            }
            return new FraudCredentialsDto(readString, readString2, valueOf, readString3, readString4, valueOf2, readString5, z3, readString6, z2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FraudCredentialsDto[] newArray(int i) {
            return new FraudCredentialsDto[i];
        }
    }

    public FraudCredentialsDto(String fraudId, String documentNumber, EnumFraudStep stepFraud, String str, String fullName, EnumUserProfile role, String docType, boolean z, String userEmail, boolean z2) {
        Intrinsics.checkNotNullParameter(fraudId, "fraudId");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(stepFraud, "stepFraud");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(docType, "docType");
        Intrinsics.checkNotNullParameter(userEmail, "userEmail");
        this.fraudId = fraudId;
        this.documentNumber = documentNumber;
        this.stepFraud = stepFraud;
        this.userId = str;
        this.fullName = fullName;
        this.role = role;
        this.docType = docType;
        this.fullEnrolment = z;
        this.userEmail = userEmail;
        this.destinyExamOrClass = z2;
    }

    public static /* synthetic */ FraudCredentialsDto copy$default(FraudCredentialsDto fraudCredentialsDto, String str, String str2, EnumFraudStep enumFraudStep, String str3, String str4, EnumUserProfile enumUserProfile, String str5, boolean z, String str6, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fraudCredentialsDto.fraudId;
        }
        if ((i & 2) != 0) {
            str2 = fraudCredentialsDto.documentNumber;
        }
        if ((i & 4) != 0) {
            enumFraudStep = fraudCredentialsDto.stepFraud;
        }
        if ((i & 8) != 0) {
            str3 = fraudCredentialsDto.userId;
        }
        if ((i & 16) != 0) {
            str4 = fraudCredentialsDto.fullName;
        }
        if ((i & 32) != 0) {
            enumUserProfile = fraudCredentialsDto.role;
        }
        if ((i & 64) != 0) {
            str5 = fraudCredentialsDto.docType;
        }
        if ((i & 128) != 0) {
            z = fraudCredentialsDto.fullEnrolment;
        }
        if ((i & 256) != 0) {
            str6 = fraudCredentialsDto.userEmail;
        }
        if ((i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
            z2 = fraudCredentialsDto.destinyExamOrClass;
        }
        String str7 = str6;
        boolean z3 = z2;
        String str8 = str5;
        boolean z4 = z;
        String str9 = str4;
        EnumUserProfile enumUserProfile2 = enumUserProfile;
        return fraudCredentialsDto.copy(str, str2, enumFraudStep, str3, str9, enumUserProfile2, str8, z4, str7, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFraudId() {
        return this.fraudId;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getDestinyExamOrClass() {
        return this.destinyExamOrClass;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final EnumFraudStep getStepFraud() {
        return this.stepFraud;
    }

    /* renamed from: component4, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* renamed from: component6, reason: from getter */
    public final EnumUserProfile getRole() {
        return this.role;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDocType() {
        return this.docType;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getFullEnrolment() {
        return this.fullEnrolment;
    }

    /* renamed from: component9, reason: from getter */
    public final String getUserEmail() {
        return this.userEmail;
    }

    public final FraudCredentialsDto copy(String fraudId, String documentNumber, EnumFraudStep stepFraud, String userId, String fullName, EnumUserProfile role, String docType, boolean fullEnrolment, String userEmail, boolean destinyExamOrClass) {
        Intrinsics.checkNotNullParameter(fraudId, "fraudId");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(stepFraud, "stepFraud");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(docType, "docType");
        Intrinsics.checkNotNullParameter(userEmail, "userEmail");
        return new FraudCredentialsDto(fraudId, documentNumber, stepFraud, userId, fullName, role, docType, fullEnrolment, userEmail, destinyExamOrClass);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FraudCredentialsDto)) {
            return false;
        }
        FraudCredentialsDto fraudCredentialsDto = (FraudCredentialsDto) other;
        return Intrinsics.areEqual(this.fraudId, fraudCredentialsDto.fraudId) && Intrinsics.areEqual(this.documentNumber, fraudCredentialsDto.documentNumber) && this.stepFraud == fraudCredentialsDto.stepFraud && Intrinsics.areEqual(this.userId, fraudCredentialsDto.userId) && Intrinsics.areEqual(this.fullName, fraudCredentialsDto.fullName) && this.role == fraudCredentialsDto.role && Intrinsics.areEqual(this.docType, fraudCredentialsDto.docType) && this.fullEnrolment == fraudCredentialsDto.fullEnrolment && Intrinsics.areEqual(this.userEmail, fraudCredentialsDto.userEmail) && this.destinyExamOrClass == fraudCredentialsDto.destinyExamOrClass;
    }

    public int hashCode() {
        int hashCode = (this.stepFraud.hashCode() + x5.d(this.documentNumber, this.fraudId.hashCode() * 31, 31)) * 31;
        String str = this.userId;
        return Boolean.hashCode(this.destinyExamOrClass) + x5.d(this.userEmail, defpackage.a.g(this.fullEnrolment, x5.d(this.docType, (this.role.hashCode() + x5.d(this.fullName, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31, 31), 31), 31);
    }

    public String toString() {
        String str = this.fraudId;
        String str2 = this.documentNumber;
        EnumFraudStep enumFraudStep = this.stepFraud;
        String str3 = this.userId;
        String str4 = this.fullName;
        EnumUserProfile enumUserProfile = this.role;
        String str5 = this.docType;
        boolean z = this.fullEnrolment;
        String str6 = this.userEmail;
        boolean z2 = this.destinyExamOrClass;
        StringBuilder r = x5.r("FraudCredentialsDto(fraudId=", str, ", documentNumber=", str2, ", stepFraud=");
        r.append(enumFraudStep);
        r.append(", userId=");
        r.append(str3);
        r.append(", fullName=");
        r.append(str4);
        r.append(", role=");
        r.append(enumUserProfile);
        r.append(", docType=");
        r.append(str5);
        r.append(", fullEnrolment=");
        r.append(z);
        r.append(", userEmail=");
        r.append(str6);
        r.append(", destinyExamOrClass=");
        r.append(z2);
        r.append(")");
        return r.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.fraudId);
        dest.writeString(this.documentNumber);
        dest.writeString(this.stepFraud.name());
        dest.writeString(this.userId);
        dest.writeString(this.fullName);
        dest.writeString(this.role.name());
        dest.writeString(this.docType);
        dest.writeInt(this.fullEnrolment ? 1 : 0);
        dest.writeString(this.userEmail);
        dest.writeInt(this.destinyExamOrClass ? 1 : 0);
    }
}
