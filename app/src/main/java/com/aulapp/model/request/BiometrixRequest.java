package com.gse.aulapp.model.request;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.q;
import co.ceduladigital.sdk.x5;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u001e\u0010\u0002\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006%"}, d2 = {"Lcom/gse/aulapp/model/request/BiometrixRequest;", "Lcom/gse/aulapp/model/request/BiometrixGeneralRequest;", "userID", BuildConfig.FLAVOR, "documentType", "documentNumber", "userType", "processType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUserID", "()Ljava/lang/String;", "setUserID", "(Ljava/lang/String;)V", "getDocumentType", "getDocumentNumber", "getUserType", "getProcessType", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BiometrixRequest extends BiometrixGeneralRequest {
    public static final Parcelable.Creator<BiometrixRequest> CREATOR = new Creator();

    @SerializedName("documentNumber")
    private final String documentNumber;

    @SerializedName("documentType")
    private final String documentType;

    @SerializedName("processType")
    private final String processType;

    @SerializedName("userID")
    private String userID;

    @SerializedName("userType")
    private final String userType;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BiometrixRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BiometrixRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BiometrixRequest(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BiometrixRequest[] newArray(int i) {
            return new BiometrixRequest[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiometrixRequest(String userID, String documentType, String documentNumber, String userType, String processType) {
        super(userID);
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(userType, "userType");
        Intrinsics.checkNotNullParameter(processType, "processType");
        this.userID = userID;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.userType = userType;
        this.processType = processType;
    }

    public static /* synthetic */ BiometrixRequest copy$default(BiometrixRequest biometrixRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = biometrixRequest.userID;
        }
        if ((i & 2) != 0) {
            str2 = biometrixRequest.documentType;
        }
        if ((i & 4) != 0) {
            str3 = biometrixRequest.documentNumber;
        }
        if ((i & 8) != 0) {
            str4 = biometrixRequest.userType;
        }
        if ((i & 16) != 0) {
            str5 = biometrixRequest.processType;
        }
        String str6 = str5;
        String str7 = str3;
        return biometrixRequest.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUserID() {
        return this.userID;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDocumentType() {
        return this.documentType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final String getUserType() {
        return this.userType;
    }

    /* renamed from: component5, reason: from getter */
    public final String getProcessType() {
        return this.processType;
    }

    public final BiometrixRequest copy(String userID, String documentType, String documentNumber, String userType, String processType) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(userType, "userType");
        Intrinsics.checkNotNullParameter(processType, "processType");
        return new BiometrixRequest(userID, documentType, documentNumber, userType, processType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BiometrixRequest)) {
            return false;
        }
        BiometrixRequest biometrixRequest = (BiometrixRequest) other;
        return Intrinsics.areEqual(this.userID, biometrixRequest.userID) && Intrinsics.areEqual(this.documentType, biometrixRequest.documentType) && Intrinsics.areEqual(this.documentNumber, biometrixRequest.documentNumber) && Intrinsics.areEqual(this.userType, biometrixRequest.userType) && Intrinsics.areEqual(this.processType, biometrixRequest.processType);
    }

    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    public final String getDocumentType() {
        return this.documentType;
    }

    public final String getProcessType() {
        return this.processType;
    }

    @Override // com.gse.aulapp.model.request.BiometrixGeneralRequest
    public String getUserID() {
        return this.userID;
    }

    public final String getUserType() {
        return this.userType;
    }

    public int hashCode() {
        return this.processType.hashCode() + x5.d(this.userType, x5.d(this.documentNumber, x5.d(this.documentType, this.userID.hashCode() * 31, 31), 31), 31);
    }

    @Override // com.gse.aulapp.model.request.BiometrixGeneralRequest
    public void setUserID(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userID = str;
    }

    @Override // com.gse.aulapp.model.request.BiometrixGeneralRequest
    public String toString() {
        String str = this.userID;
        String str2 = this.documentType;
        String str3 = this.documentNumber;
        String str4 = this.userType;
        String str5 = this.processType;
        StringBuilder r = x5.r("BiometrixRequest(userID=", str, ", documentType=", str2, ", documentNumber=");
        x5.z(r, str3, ", userType=", str4, ", processType=");
        return q.j(str5, ")", r);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.userID);
        dest.writeString(this.documentType);
        dest.writeString(this.documentNumber);
        dest.writeString(this.userType);
        dest.writeString(this.processType);
    }
}
