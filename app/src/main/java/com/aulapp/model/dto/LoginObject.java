package com.gse.aulapp.model.dto;

import co.ceduladigital.sdk.q;
import co.ceduladigital.sdk.x5;
import com.gse.aulapp.model.enumerate.EnumUserProfile;
import com.karumi.dexter.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b-\b\u0086\b\u0018\u00002\u00020\u0001BË\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u001b\"\u0004\b$\u0010%R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u001a\u0004\b&\u0010\u001b\"\u0004\b'\u0010%R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b(\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b,\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b-\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b.\u0010\u001bR$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\"\u001a\u0004\b/\u0010\u001b\"\u0004\b0\u0010%R$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\"\u001a\u0004\b1\u0010\u001b\"\u0004\b2\u0010%R$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\"\u001a\u0004\b3\u0010\u001b\"\u0004\b4\u0010%R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\"\u001a\u0004\b8\u0010\u001bR*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010)\u001a\u0004\b\u0015\u0010+\"\u0004\bC\u0010DR$\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010)\u001a\u0004\bE\u0010+\"\u0004\bF\u0010DR$\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\"\u001a\u0004\bG\u0010\u001b\"\u0004\bH\u0010%¨\u0006I"}, d2 = {"Lcom/gse/aulapp/model/dto/LoginObject;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "token", "email", "documentNumber", BuildConfig.FLAVOR, "fullEnrollment", "dateEnrollment", "fraudInformationID", "userId", "pathDocumentHandRight", "pathDocumentHandLeft", "fullName", "Lcom/gse/aulapp/model/enumerate/EnumUserProfile;", "role", "docType", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/dto/CenterDto;", "centerList", "cea", "isUserDemo", "biometricException", "biometrixInformationID", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/gse/aulapp/model/enumerate/EnumUserProfile;Ljava/lang/String;Ljava/util/List;Lcom/gse/aulapp/model/dto/CenterDto;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getToken", "setToken", "(Ljava/lang/String;)V", "getEmail", "setEmail", "getDocumentNumber", "Ljava/lang/Boolean;", "getFullEnrollment", "()Ljava/lang/Boolean;", "getDateEnrollment", "getFraudInformationID", "getUserId", "getPathDocumentHandRight", "setPathDocumentHandRight", "getPathDocumentHandLeft", "setPathDocumentHandLeft", "getFullName", "setFullName", "Lcom/gse/aulapp/model/enumerate/EnumUserProfile;", "getRole", "()Lcom/gse/aulapp/model/enumerate/EnumUserProfile;", "getDocType", "Ljava/util/List;", "getCenterList", "()Ljava/util/List;", "setCenterList", "(Ljava/util/List;)V", "Lcom/gse/aulapp/model/dto/CenterDto;", "getCea", "()Lcom/gse/aulapp/model/dto/CenterDto;", "setCea", "(Lcom/gse/aulapp/model/dto/CenterDto;)V", "setUserDemo", "(Ljava/lang/Boolean;)V", "getBiometricException", "setBiometricException", "getBiometrixInformationID", "setBiometrixInformationID", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class LoginObject {
    private Boolean biometricException;
    private String biometrixInformationID;
    private CenterDto cea;
    private List<CenterDto> centerList;
    private final String dateEnrollment;
    private final String docType;
    private final String documentNumber;
    private String email;
    private final String fraudInformationID;
    private final Boolean fullEnrollment;
    private String fullName;
    private Boolean isUserDemo;
    private String pathDocumentHandLeft;
    private String pathDocumentHandRight;
    private final EnumUserProfile role;
    private String token;
    private final String userId;

    public LoginObject(String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, String str7, String str8, String str9, EnumUserProfile role, String str10, List<CenterDto> list, CenterDto centerDto, Boolean bool2, Boolean bool3, String str11) {
        Intrinsics.checkNotNullParameter(role, "role");
        this.token = str;
        this.email = str2;
        this.documentNumber = str3;
        this.fullEnrollment = bool;
        this.dateEnrollment = str4;
        this.fraudInformationID = str5;
        this.userId = str6;
        this.pathDocumentHandRight = str7;
        this.pathDocumentHandLeft = str8;
        this.fullName = str9;
        this.role = role;
        this.docType = str10;
        this.centerList = list;
        this.cea = centerDto;
        this.isUserDemo = bool2;
        this.biometricException = bool3;
        this.biometrixInformationID = str11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginObject)) {
            return false;
        }
        LoginObject loginObject = (LoginObject) other;
        return Intrinsics.areEqual(this.token, loginObject.token) && Intrinsics.areEqual(this.email, loginObject.email) && Intrinsics.areEqual(this.documentNumber, loginObject.documentNumber) && Intrinsics.areEqual(this.fullEnrollment, loginObject.fullEnrollment) && Intrinsics.areEqual(this.dateEnrollment, loginObject.dateEnrollment) && Intrinsics.areEqual(this.fraudInformationID, loginObject.fraudInformationID) && Intrinsics.areEqual(this.userId, loginObject.userId) && Intrinsics.areEqual(this.pathDocumentHandRight, loginObject.pathDocumentHandRight) && Intrinsics.areEqual(this.pathDocumentHandLeft, loginObject.pathDocumentHandLeft) && Intrinsics.areEqual(this.fullName, loginObject.fullName) && this.role == loginObject.role && Intrinsics.areEqual(this.docType, loginObject.docType) && Intrinsics.areEqual(this.centerList, loginObject.centerList) && Intrinsics.areEqual(this.cea, loginObject.cea) && Intrinsics.areEqual(this.isUserDemo, loginObject.isUserDemo) && Intrinsics.areEqual(this.biometricException, loginObject.biometricException) && Intrinsics.areEqual(this.biometrixInformationID, loginObject.biometrixInformationID);
    }

    public final Boolean getBiometricException() {
        return this.biometricException;
    }

    public final String getBiometrixInformationID() {
        return this.biometrixInformationID;
    }

    public final CenterDto getCea() {
        return this.cea;
    }

    public final List<CenterDto> getCenterList() {
        return this.centerList;
    }

    public final String getDateEnrollment() {
        return this.dateEnrollment;
    }

    public final String getDocType() {
        return this.docType;
    }

    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFraudInformationID() {
        return this.fraudInformationID;
    }

    public final Boolean getFullEnrollment() {
        return this.fullEnrollment;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final String getPathDocumentHandLeft() {
        return this.pathDocumentHandLeft;
    }

    public final String getPathDocumentHandRight() {
        return this.pathDocumentHandRight;
    }

    public final EnumUserProfile getRole() {
        return this.role;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.email;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.documentNumber;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.fullEnrollment;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.dateEnrollment;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.fraudInformationID;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.userId;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.pathDocumentHandRight;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.pathDocumentHandLeft;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.fullName;
        int hashCode10 = (this.role.hashCode() + ((hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31)) * 31;
        String str10 = this.docType;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List<CenterDto> list = this.centerList;
        int hashCode12 = (hashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        CenterDto centerDto = this.cea;
        int hashCode13 = (hashCode12 + (centerDto == null ? 0 : centerDto.hashCode())) * 31;
        Boolean bool2 = this.isUserDemo;
        int hashCode14 = (hashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.biometricException;
        int hashCode15 = (hashCode14 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str11 = this.biometrixInformationID;
        return hashCode15 + (str11 != null ? str11.hashCode() : 0);
    }

    /* renamed from: isUserDemo, reason: from getter */
    public final Boolean getIsUserDemo() {
        return this.isUserDemo;
    }

    public String toString() {
        String str = this.token;
        String str2 = this.email;
        String str3 = this.documentNumber;
        Boolean bool = this.fullEnrollment;
        String str4 = this.dateEnrollment;
        String str5 = this.fraudInformationID;
        String str6 = this.userId;
        String str7 = this.pathDocumentHandRight;
        String str8 = this.pathDocumentHandLeft;
        String str9 = this.fullName;
        EnumUserProfile enumUserProfile = this.role;
        String str10 = this.docType;
        List<CenterDto> list = this.centerList;
        CenterDto centerDto = this.cea;
        Boolean bool2 = this.isUserDemo;
        Boolean bool3 = this.biometricException;
        String str11 = this.biometrixInformationID;
        StringBuilder r = x5.r("LoginObject(token=", str, ", email=", str2, ", documentNumber=");
        r.append(str3);
        r.append(", fullEnrollment=");
        r.append(bool);
        r.append(", dateEnrollment=");
        x5.z(r, str4, ", fraudInformationID=", str5, ", userId=");
        x5.z(r, str6, ", pathDocumentHandRight=", str7, ", pathDocumentHandLeft=");
        x5.z(r, str8, ", fullName=", str9, ", role=");
        r.append(enumUserProfile);
        r.append(", docType=");
        r.append(str10);
        r.append(", centerList=");
        r.append(list);
        r.append(", cea=");
        r.append(centerDto);
        r.append(", isUserDemo=");
        r.append(bool2);
        r.append(", biometricException=");
        r.append(bool3);
        r.append(", biometrixInformationID=");
        return q.j(str11, ")", r);
    }

    public /* synthetic */ LoginObject(String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, String str7, String str8, String str9, EnumUserProfile enumUserProfile, String str10, List list, CenterDto centerDto, Boolean bool2, Boolean bool3, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? Boolean.FALSE : bool, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, str7, str8, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : str9, enumUserProfile, str10, (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : list, centerDto, (i & 16384) != 0 ? Boolean.FALSE : bool2, (i & 32768) != 0 ? Boolean.FALSE : bool3, str11);
    }
}
