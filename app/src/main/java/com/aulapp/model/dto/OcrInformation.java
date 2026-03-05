package com.gse.aulapp.model.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.y7;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u001d"}, d2 = {"Lcom/gse/aulapp/model/dto/OcrInformation;", "Landroid/os/Parcelable;", "name", BuildConfig.FLAVOR, "documentNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getDocumentNumber", "setDocumentNumber", "component1", "component2", "copy", "describeContents", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class OcrInformation implements Parcelable {
    public static final Parcelable.Creator<OcrInformation> CREATOR = new Creator();

    @SerializedName("documentNumber")
    private String documentNumber;

    @SerializedName("name")
    private String name;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OcrInformation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OcrInformation createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OcrInformation(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OcrInformation[] newArray(int i) {
            return new OcrInformation[i];
        }
    }

    public OcrInformation(String name, String documentNumber) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        this.name = name;
        this.documentNumber = documentNumber;
    }

    public static /* synthetic */ OcrInformation copy$default(OcrInformation ocrInformation, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ocrInformation.name;
        }
        if ((i & 2) != 0) {
            str2 = ocrInformation.documentNumber;
        }
        return ocrInformation.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    public final OcrInformation copy(String name, String documentNumber) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        return new OcrInformation(name, documentNumber);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OcrInformation)) {
            return false;
        }
        OcrInformation ocrInformation = (OcrInformation) other;
        return Intrinsics.areEqual(this.name, ocrInformation.name) && Intrinsics.areEqual(this.documentNumber, ocrInformation.documentNumber);
    }

    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.documentNumber.hashCode() + (this.name.hashCode() * 31);
    }

    public final void setDocumentNumber(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.documentNumber = str;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public String toString() {
        return y7.p("OcrInformation(name=", this.name, ", documentNumber=", this.documentNumber, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.documentNumber);
    }
}
