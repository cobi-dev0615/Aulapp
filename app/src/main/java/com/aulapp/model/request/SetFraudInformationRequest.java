package com.gse.aulapp.model.request;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.q;
import com.google.gson.annotations.SerializedName;
import com.gse.aulapp.model.dto.OcrInformation;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006$"}, d2 = {"Lcom/gse/aulapp/model/request/SetFraudInformationRequest;", "Landroid/os/Parcelable;", "fraudID", BuildConfig.FLAVOR, "ocrInformation", "Lcom/gse/aulapp/model/dto/OcrInformation;", "userID", "<init>", "(Ljava/lang/String;Lcom/gse/aulapp/model/dto/OcrInformation;Ljava/lang/String;)V", "getFraudID", "()Ljava/lang/String;", "setFraudID", "(Ljava/lang/String;)V", "getOcrInformation", "()Lcom/gse/aulapp/model/dto/OcrInformation;", "setOcrInformation", "(Lcom/gse/aulapp/model/dto/OcrInformation;)V", "getUserID", "setUserID", "component1", "component2", "component3", "copy", "describeContents", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SetFraudInformationRequest implements Parcelable {
    public static final Parcelable.Creator<SetFraudInformationRequest> CREATOR = new Creator();

    @SerializedName("fraudID")
    private String fraudID;

    @SerializedName("ocrInformation")
    private OcrInformation ocrInformation;

    @SerializedName("userID")
    private String userID;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SetFraudInformationRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SetFraudInformationRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SetFraudInformationRequest(parcel.readString(), OcrInformation.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SetFraudInformationRequest[] newArray(int i) {
            return new SetFraudInformationRequest[i];
        }
    }

    public SetFraudInformationRequest(String fraudID, OcrInformation ocrInformation, String userID) {
        Intrinsics.checkNotNullParameter(fraudID, "fraudID");
        Intrinsics.checkNotNullParameter(ocrInformation, "ocrInformation");
        Intrinsics.checkNotNullParameter(userID, "userID");
        this.fraudID = fraudID;
        this.ocrInformation = ocrInformation;
        this.userID = userID;
    }

    public static /* synthetic */ SetFraudInformationRequest copy$default(SetFraudInformationRequest setFraudInformationRequest, String str, OcrInformation ocrInformation, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setFraudInformationRequest.fraudID;
        }
        if ((i & 2) != 0) {
            ocrInformation = setFraudInformationRequest.ocrInformation;
        }
        if ((i & 4) != 0) {
            str2 = setFraudInformationRequest.userID;
        }
        return setFraudInformationRequest.copy(str, ocrInformation, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFraudID() {
        return this.fraudID;
    }

    /* renamed from: component2, reason: from getter */
    public final OcrInformation getOcrInformation() {
        return this.ocrInformation;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUserID() {
        return this.userID;
    }

    public final SetFraudInformationRequest copy(String fraudID, OcrInformation ocrInformation, String userID) {
        Intrinsics.checkNotNullParameter(fraudID, "fraudID");
        Intrinsics.checkNotNullParameter(ocrInformation, "ocrInformation");
        Intrinsics.checkNotNullParameter(userID, "userID");
        return new SetFraudInformationRequest(fraudID, ocrInformation, userID);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetFraudInformationRequest)) {
            return false;
        }
        SetFraudInformationRequest setFraudInformationRequest = (SetFraudInformationRequest) other;
        return Intrinsics.areEqual(this.fraudID, setFraudInformationRequest.fraudID) && Intrinsics.areEqual(this.ocrInformation, setFraudInformationRequest.ocrInformation) && Intrinsics.areEqual(this.userID, setFraudInformationRequest.userID);
    }

    public final String getFraudID() {
        return this.fraudID;
    }

    public final OcrInformation getOcrInformation() {
        return this.ocrInformation;
    }

    public final String getUserID() {
        return this.userID;
    }

    public int hashCode() {
        return this.userID.hashCode() + ((this.ocrInformation.hashCode() + (this.fraudID.hashCode() * 31)) * 31);
    }

    public final void setFraudID(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fraudID = str;
    }

    public final void setOcrInformation(OcrInformation ocrInformation) {
        Intrinsics.checkNotNullParameter(ocrInformation, "<set-?>");
        this.ocrInformation = ocrInformation;
    }

    public final void setUserID(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userID = str;
    }

    public String toString() {
        String str = this.fraudID;
        OcrInformation ocrInformation = this.ocrInformation;
        String str2 = this.userID;
        StringBuilder sb = new StringBuilder("SetFraudInformationRequest(fraudID=");
        sb.append(str);
        sb.append(", ocrInformation=");
        sb.append(ocrInformation);
        sb.append(", userID=");
        return q.j(str2, ")", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.fraudID);
        this.ocrInformation.writeToParcel(dest, flags);
        dest.writeString(this.userID);
    }
}
