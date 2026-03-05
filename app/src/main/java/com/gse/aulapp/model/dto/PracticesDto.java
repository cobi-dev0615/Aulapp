package com.gse.aulapp.model.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import defpackage.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006%"}, d2 = {"Lcom/gse/aulapp/model/dto/PracticesDto;", "Landroid/os/Parcelable;", "enrollApprentice", BuildConfig.FLAVOR, "enrollInstructor", "verifyCar", "complete", "<init>", "(ZZZZ)V", "getEnrollApprentice", "()Z", "setEnrollApprentice", "(Z)V", "getEnrollInstructor", "setEnrollInstructor", "getVerifyCar", "setVerifyCar", "getComplete", "setComplete", "component1", "component2", "component3", "component4", "copy", "describeContents", BuildConfig.FLAVOR, "equals", "other", BuildConfig.FLAVOR, "hashCode", "toString", BuildConfig.FLAVOR, "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PracticesDto implements Parcelable {
    public static final Parcelable.Creator<PracticesDto> CREATOR = new Creator();

    @SerializedName("complete")
    private boolean complete;

    @SerializedName("enrollApprentice")
    private boolean enrollApprentice;

    @SerializedName("enrollInstructor")
    private boolean enrollInstructor;

    @SerializedName("verifyCar")
    private boolean verifyCar;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PracticesDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PracticesDto createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PracticesDto(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PracticesDto[] newArray(int i) {
            return new PracticesDto[i];
        }
    }

    public PracticesDto(boolean z, boolean z2, boolean z3, boolean z4) {
        this.enrollApprentice = z;
        this.enrollInstructor = z2;
        this.verifyCar = z3;
        this.complete = z4;
    }

    public static /* synthetic */ PracticesDto copy$default(PracticesDto practicesDto, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = practicesDto.enrollApprentice;
        }
        if ((i & 2) != 0) {
            z2 = practicesDto.enrollInstructor;
        }
        if ((i & 4) != 0) {
            z3 = practicesDto.verifyCar;
        }
        if ((i & 8) != 0) {
            z4 = practicesDto.complete;
        }
        return practicesDto.copy(z, z2, z3, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnrollApprentice() {
        return this.enrollApprentice;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnrollInstructor() {
        return this.enrollInstructor;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getVerifyCar() {
        return this.verifyCar;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getComplete() {
        return this.complete;
    }

    public final PracticesDto copy(boolean enrollApprentice, boolean enrollInstructor, boolean verifyCar, boolean complete) {
        return new PracticesDto(enrollApprentice, enrollInstructor, verifyCar, complete);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PracticesDto)) {
            return false;
        }
        PracticesDto practicesDto = (PracticesDto) other;
        return this.enrollApprentice == practicesDto.enrollApprentice && this.enrollInstructor == practicesDto.enrollInstructor && this.verifyCar == practicesDto.verifyCar && this.complete == practicesDto.complete;
    }

    public int hashCode() {
        return Boolean.hashCode(this.complete) + a.g(this.verifyCar, a.g(this.enrollInstructor, Boolean.hashCode(this.enrollApprentice) * 31, 31), 31);
    }

    public final void setComplete(boolean z) {
        this.complete = z;
    }

    public final void setEnrollApprentice(boolean z) {
        this.enrollApprentice = z;
    }

    public final void setEnrollInstructor(boolean z) {
        this.enrollInstructor = z;
    }

    public final void setVerifyCar(boolean z) {
        this.verifyCar = z;
    }

    public String toString() {
        return "PracticesDto(enrollApprentice=" + this.enrollApprentice + ", enrollInstructor=" + this.enrollInstructor + ", verifyCar=" + this.verifyCar + ", complete=" + this.complete + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.enrollApprentice ? 1 : 0);
        dest.writeInt(this.enrollInstructor ? 1 : 0);
        dest.writeInt(this.verifyCar ? 1 : 0);
        dest.writeInt(this.complete ? 1 : 0);
    }
}
