package com.gse.aulapp.model.request;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.y7;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u001d"}, d2 = {"Lcom/gse/aulapp/model/request/ChangeCenterRequest;", "Landroid/os/Parcelable;", "centerID", BuildConfig.FLAVOR, "documentNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCenterID", "()Ljava/lang/String;", "setCenterID", "(Ljava/lang/String;)V", "getDocumentNumber", "setDocumentNumber", "component1", "component2", "copy", "describeContents", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ChangeCenterRequest implements Parcelable {
    public static final Parcelable.Creator<ChangeCenterRequest> CREATOR = new Creator();

    @SerializedName("centerID")
    private String centerID;

    @SerializedName("documentNumber")
    private String documentNumber;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ChangeCenterRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChangeCenterRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChangeCenterRequest(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChangeCenterRequest[] newArray(int i) {
            return new ChangeCenterRequest[i];
        }
    }

    public ChangeCenterRequest(String centerID, String documentNumber) {
        Intrinsics.checkNotNullParameter(centerID, "centerID");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        this.centerID = centerID;
        this.documentNumber = documentNumber;
    }

    public static /* synthetic */ ChangeCenterRequest copy$default(ChangeCenterRequest changeCenterRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = changeCenterRequest.centerID;
        }
        if ((i & 2) != 0) {
            str2 = changeCenterRequest.documentNumber;
        }
        return changeCenterRequest.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCenterID() {
        return this.centerID;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    public final ChangeCenterRequest copy(String centerID, String documentNumber) {
        Intrinsics.checkNotNullParameter(centerID, "centerID");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        return new ChangeCenterRequest(centerID, documentNumber);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangeCenterRequest)) {
            return false;
        }
        ChangeCenterRequest changeCenterRequest = (ChangeCenterRequest) other;
        return Intrinsics.areEqual(this.centerID, changeCenterRequest.centerID) && Intrinsics.areEqual(this.documentNumber, changeCenterRequest.documentNumber);
    }

    public int hashCode() {
        return this.documentNumber.hashCode() + (this.centerID.hashCode() * 31);
    }

    public final void setCenterID(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.centerID = str;
    }

    public final void setDocumentNumber(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.documentNumber = str;
    }

    public String toString() {
        return y7.p("ChangeCenterRequest(centerID=", this.centerID, ", documentNumber=", this.documentNumber, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.centerID);
        dest.writeString(this.documentNumber);
    }
}
