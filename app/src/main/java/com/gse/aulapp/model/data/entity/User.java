package com.gse.aulapp.model.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.x5;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import defpackage.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b?\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018B\t\b\u0016¢\u0006\u0004\b\u0017\u0010\u0019J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u000bHÆ\u0003J\t\u0010L\u001a\u00020\u000bHÆ\u0003J\t\u0010M\u001a\u00020\u000bHÆ\u0003J\t\u0010N\u001a\u00020\u000bHÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0016HÆ\u0003J±\u0001\u0010T\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001J\u0006\u0010U\u001a\u00020VJ\u0013\u0010W\u001a\u00020\u000b2\b\u0010X\u001a\u0004\u0018\u00010YHÖ\u0003J\t\u0010Z\u001a\u00020VHÖ\u0001J\t\u0010[\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020VR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\u001dR\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001b\"\u0004\b'\u0010\u001dR\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001e\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010+\"\u0004\b/\u0010-R\u001e\u0010\r\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010+\"\u0004\b1\u0010-R\u001e\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010+\"\u0004\b3\u0010-R \u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001b\"\u0004\b5\u0010\u001dR\u001e\u0010\u0010\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001b\"\u0004\b7\u0010\u001dR \u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R \u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R \u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C¨\u0006a"}, d2 = {"Lcom/gse/aulapp/model/data/entity/User;", "Landroid/os/Parcelable;", "id", BuildConfig.FLAVOR, "fullName", "role", "email", "docType", "docNumber", "preferredHand", "biometricValidationRNEC", BuildConfig.FLAVOR, "usingIdenty", "withIdentityValidation", "attendance", "updateDate", "userOwner", "biometrics", "Lcom/gse/aulapp/model/data/entity/Biometrics;", "exams", "Lcom/gse/aulapp/model/data/entity/Exams;", "identity", "Lcom/gse/aulapp/model/data/entity/Identity;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;Ljava/lang/String;Lcom/gse/aulapp/model/data/entity/Biometrics;Lcom/gse/aulapp/model/data/entity/Exams;Lcom/gse/aulapp/model/data/entity/Identity;)V", "()V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getFullName", "setFullName", "getRole", "setRole", "getEmail", "setEmail", "getDocType", "setDocType", "getDocNumber", "setDocNumber", "getPreferredHand", "setPreferredHand", "getBiometricValidationRNEC", "()Z", "setBiometricValidationRNEC", "(Z)V", "getUsingIdenty", "setUsingIdenty", "getWithIdentityValidation", "setWithIdentityValidation", "getAttendance", "setAttendance", "getUpdateDate", "setUpdateDate", "getUserOwner", "setUserOwner", "getBiometrics", "()Lcom/gse/aulapp/model/data/entity/Biometrics;", "setBiometrics", "(Lcom/gse/aulapp/model/data/entity/Biometrics;)V", "getExams", "()Lcom/gse/aulapp/model/data/entity/Exams;", "setExams", "(Lcom/gse/aulapp/model/data/entity/Exams;)V", "getIdentity", "()Lcom/gse/aulapp/model/data/entity/Identity;", "setIdentity", "(Lcom/gse/aulapp/model/data/entity/Identity;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "describeContents", BuildConfig.FLAVOR, "equals", "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class User implements Parcelable {
    public static final Parcelable.Creator<User> CREATOR = new Creator();

    @SerializedName("attendance")
    @Expose
    private boolean attendance;

    @SerializedName("biometricValidationRNEC")
    @Expose
    private boolean biometricValidationRNEC;

    @SerializedName("biometrics")
    @Expose
    private Biometrics biometrics;

    @SerializedName("docNumber")
    @Expose
    private String docNumber;

    @SerializedName("docType")
    @Expose
    private String docType;

    @SerializedName("email")
    @Expose
    private String email;

    @SerializedName("exams")
    @Expose
    private Exams exams;

    @SerializedName("full_name")
    @Expose
    private String fullName;

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("identity")
    @Expose
    private Identity identity;

    @SerializedName("preferredHand")
    @Expose
    private String preferredHand;

    @SerializedName("role")
    @Expose
    private String role;
    private String updateDate;
    private String userOwner;

    @SerializedName("usingIdenty")
    @Expose
    private boolean usingIdenty;

    @SerializedName("withIdentityValidation")
    @Expose
    private boolean withIdentityValidation;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<User> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final User createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            Biometrics biometrics;
            Exams createFromParcel;
            Exams exams;
            Identity createFromParcel2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            boolean z4 = false;
            boolean z5 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z5 = z;
            }
            if (parcel.readInt() != 0) {
                z3 = z2;
            } else {
                z3 = z2;
                z2 = z;
            }
            if (parcel.readInt() == 0) {
                z3 = z;
            }
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            Biometrics createFromParcel3 = parcel.readInt() == 0 ? null : Biometrics.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                biometrics = createFromParcel3;
                createFromParcel = null;
            } else {
                biometrics = createFromParcel3;
                createFromParcel = Exams.CREATOR.createFromParcel(parcel);
            }
            Exams exams2 = createFromParcel;
            if (parcel.readInt() == 0) {
                createFromParcel2 = null;
                exams = exams2;
            } else {
                exams = exams2;
                createFromParcel2 = Identity.CREATOR.createFromParcel(parcel);
            }
            return new User(readString, readString2, readString3, readString4, readString5, readString6, readString7, z4, z5, z2, z3, readString8, readString9, biometrics, exams, createFromParcel2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final User[] newArray(int i) {
            return new User[i];
        }
    }

    public User(String id, String fullName, String role, String email, String docType, String docNumber, String preferredHand, boolean z, boolean z2, boolean z3, boolean z4, String str, String userOwner, Biometrics biometrics, Exams exams, Identity identity) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(docType, "docType");
        Intrinsics.checkNotNullParameter(docNumber, "docNumber");
        Intrinsics.checkNotNullParameter(preferredHand, "preferredHand");
        Intrinsics.checkNotNullParameter(userOwner, "userOwner");
        this.id = id;
        this.fullName = fullName;
        this.role = role;
        this.email = email;
        this.docType = docType;
        this.docNumber = docNumber;
        this.preferredHand = preferredHand;
        this.biometricValidationRNEC = z;
        this.usingIdenty = z2;
        this.withIdentityValidation = z3;
        this.attendance = z4;
        this.updateDate = str;
        this.userOwner = userOwner;
        this.biometrics = biometrics;
        this.exams = exams;
        this.identity = identity;
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getWithIdentityValidation() {
        return this.withIdentityValidation;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getAttendance() {
        return this.attendance;
    }

    /* renamed from: component12, reason: from getter */
    public final String getUpdateDate() {
        return this.updateDate;
    }

    /* renamed from: component13, reason: from getter */
    public final String getUserOwner() {
        return this.userOwner;
    }

    /* renamed from: component14, reason: from getter */
    public final Biometrics getBiometrics() {
        return this.biometrics;
    }

    /* renamed from: component15, reason: from getter */
    public final Exams getExams() {
        return this.exams;
    }

    /* renamed from: component16, reason: from getter */
    public final Identity getIdentity() {
        return this.identity;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    /* renamed from: component4, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDocType() {
        return this.docType;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDocNumber() {
        return this.docNumber;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPreferredHand() {
        return this.preferredHand;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getBiometricValidationRNEC() {
        return this.biometricValidationRNEC;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getUsingIdenty() {
        return this.usingIdenty;
    }

    public final User copy(String id, String fullName, String role, String email, String docType, String docNumber, String preferredHand, boolean biometricValidationRNEC, boolean usingIdenty, boolean withIdentityValidation, boolean attendance, String updateDate, String userOwner, Biometrics biometrics, Exams exams, Identity identity) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(docType, "docType");
        Intrinsics.checkNotNullParameter(docNumber, "docNumber");
        Intrinsics.checkNotNullParameter(preferredHand, "preferredHand");
        Intrinsics.checkNotNullParameter(userOwner, "userOwner");
        return new User(id, fullName, role, email, docType, docNumber, preferredHand, biometricValidationRNEC, usingIdenty, withIdentityValidation, attendance, updateDate, userOwner, biometrics, exams, identity);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof User)) {
            return false;
        }
        User user = (User) other;
        return Intrinsics.areEqual(this.id, user.id) && Intrinsics.areEqual(this.fullName, user.fullName) && Intrinsics.areEqual(this.role, user.role) && Intrinsics.areEqual(this.email, user.email) && Intrinsics.areEqual(this.docType, user.docType) && Intrinsics.areEqual(this.docNumber, user.docNumber) && Intrinsics.areEqual(this.preferredHand, user.preferredHand) && this.biometricValidationRNEC == user.biometricValidationRNEC && this.usingIdenty == user.usingIdenty && this.withIdentityValidation == user.withIdentityValidation && this.attendance == user.attendance && Intrinsics.areEqual(this.updateDate, user.updateDate) && Intrinsics.areEqual(this.userOwner, user.userOwner) && Intrinsics.areEqual(this.biometrics, user.biometrics) && Intrinsics.areEqual(this.exams, user.exams) && Intrinsics.areEqual(this.identity, user.identity);
    }

    public final boolean getAttendance() {
        return this.attendance;
    }

    public final boolean getBiometricValidationRNEC() {
        return this.biometricValidationRNEC;
    }

    public final Biometrics getBiometrics() {
        return this.biometrics;
    }

    public final String getDocNumber() {
        return this.docNumber;
    }

    public final String getDocType() {
        return this.docType;
    }

    public final String getEmail() {
        return this.email;
    }

    public final Exams getExams() {
        return this.exams;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final String getId() {
        return this.id;
    }

    public final Identity getIdentity() {
        return this.identity;
    }

    public final String getPreferredHand() {
        return this.preferredHand;
    }

    public final String getRole() {
        return this.role;
    }

    public final String getUpdateDate() {
        return this.updateDate;
    }

    public final String getUserOwner() {
        return this.userOwner;
    }

    public final boolean getUsingIdenty() {
        return this.usingIdenty;
    }

    public final boolean getWithIdentityValidation() {
        return this.withIdentityValidation;
    }

    public int hashCode() {
        int g = a.g(this.attendance, a.g(this.withIdentityValidation, a.g(this.usingIdenty, a.g(this.biometricValidationRNEC, x5.d(this.preferredHand, x5.d(this.docNumber, x5.d(this.docType, x5.d(this.email, x5.d(this.role, x5.d(this.fullName, this.id.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        String str = this.updateDate;
        int d = x5.d(this.userOwner, (g + (str == null ? 0 : str.hashCode())) * 31, 31);
        Biometrics biometrics = this.biometrics;
        int hashCode = (d + (biometrics == null ? 0 : biometrics.hashCode())) * 31;
        Exams exams = this.exams;
        int hashCode2 = (hashCode + (exams == null ? 0 : exams.hashCode())) * 31;
        Identity identity = this.identity;
        return hashCode2 + (identity != null ? identity.hashCode() : 0);
    }

    public final void setAttendance(boolean z) {
        this.attendance = z;
    }

    public final void setBiometricValidationRNEC(boolean z) {
        this.biometricValidationRNEC = z;
    }

    public final void setBiometrics(Biometrics biometrics) {
        this.biometrics = biometrics;
    }

    public final void setDocNumber(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.docNumber = str;
    }

    public final void setDocType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.docType = str;
    }

    public final void setEmail(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.email = str;
    }

    public final void setExams(Exams exams) {
        this.exams = exams;
    }

    public final void setFullName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fullName = str;
    }

    public final void setId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final void setIdentity(Identity identity) {
        this.identity = identity;
    }

    public final void setPreferredHand(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.preferredHand = str;
    }

    public final void setRole(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.role = str;
    }

    public final void setUpdateDate(String str) {
        this.updateDate = str;
    }

    public final void setUserOwner(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userOwner = str;
    }

    public final void setUsingIdenty(boolean z) {
        this.usingIdenty = z;
    }

    public final void setWithIdentityValidation(boolean z) {
        this.withIdentityValidation = z;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.fullName;
        String str3 = this.role;
        String str4 = this.email;
        String str5 = this.docType;
        String str6 = this.docNumber;
        String str7 = this.preferredHand;
        boolean z = this.biometricValidationRNEC;
        boolean z2 = this.usingIdenty;
        boolean z3 = this.withIdentityValidation;
        boolean z4 = this.attendance;
        String str8 = this.updateDate;
        String str9 = this.userOwner;
        Biometrics biometrics = this.biometrics;
        Exams exams = this.exams;
        Identity identity = this.identity;
        StringBuilder r = x5.r("User(id=", str, ", fullName=", str2, ", role=");
        x5.z(r, str3, ", email=", str4, ", docType=");
        x5.z(r, str5, ", docNumber=", str6, ", preferredHand=");
        r.append(str7);
        r.append(", biometricValidationRNEC=");
        r.append(z);
        r.append(", usingIdenty=");
        r.append(z2);
        r.append(", withIdentityValidation=");
        r.append(z3);
        r.append(", attendance=");
        r.append(z4);
        r.append(", updateDate=");
        r.append(str8);
        r.append(", userOwner=");
        r.append(str9);
        r.append(", biometrics=");
        r.append(biometrics);
        r.append(", exams=");
        r.append(exams);
        r.append(", identity=");
        r.append(identity);
        r.append(")");
        return r.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.fullName);
        dest.writeString(this.role);
        dest.writeString(this.email);
        dest.writeString(this.docType);
        dest.writeString(this.docNumber);
        dest.writeString(this.preferredHand);
        dest.writeInt(this.biometricValidationRNEC ? 1 : 0);
        dest.writeInt(this.usingIdenty ? 1 : 0);
        dest.writeInt(this.withIdentityValidation ? 1 : 0);
        dest.writeInt(this.attendance ? 1 : 0);
        dest.writeString(this.updateDate);
        dest.writeString(this.userOwner);
        Biometrics biometrics = this.biometrics;
        if (biometrics == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            biometrics.writeToParcel(dest, flags);
        }
        Exams exams = this.exams;
        if (exams == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            exams.writeToParcel(dest, flags);
        }
        Identity identity = this.identity;
        if (identity == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            identity.writeToParcel(dest, flags);
        }
    }

    public User() {
        this(BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, false, false, false, false, null, BuildConfig.FLAVOR, null, null, null);
    }
}
