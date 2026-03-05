package com.gse.aulapp.receptions.feature.core.model.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u001d"}, d2 = {"Lcom/gse/aulapp/receptions/feature/core/model/dto/HandStatus;", "Landroid/os/Parcelable;", "enroll", BuildConfig.FLAVOR, "verify", "<init>", "(ZZ)V", "getEnroll", "()Z", "setEnroll", "(Z)V", "getVerify", "setVerify", "component1", "component2", "copy", "describeContents", BuildConfig.FLAVOR, "equals", "other", BuildConfig.FLAVOR, "hashCode", "toString", BuildConfig.FLAVOR, "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class HandStatus implements Parcelable {
    public static final Parcelable.Creator<HandStatus> CREATOR = new Creator();

    @SerializedName("enroll")
    private boolean enroll;

    @SerializedName("verify")
    private boolean verify;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<HandStatus> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HandStatus createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HandStatus(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HandStatus[] newArray(int i) {
            return new HandStatus[i];
        }
    }

    public HandStatus(boolean z, boolean z2) {
        this.enroll = z;
        this.verify = z2;
    }

    public static /* synthetic */ HandStatus copy$default(HandStatus handStatus, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = handStatus.enroll;
        }
        if ((i & 2) != 0) {
            z2 = handStatus.verify;
        }
        return handStatus.copy(z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnroll() {
        return this.enroll;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getVerify() {
        return this.verify;
    }

    public final HandStatus copy(boolean enroll, boolean verify) {
        return new HandStatus(enroll, verify);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HandStatus)) {
            return false;
        }
        HandStatus handStatus = (HandStatus) other;
        return this.enroll == handStatus.enroll && this.verify == handStatus.verify;
    }

    public int hashCode() {
        return Boolean.hashCode(this.verify) + (Boolean.hashCode(this.enroll) * 31);
    }

    public final void setEnroll(boolean z) {
        this.enroll = z;
    }

    public final void setVerify(boolean z) {
        this.verify = z;
    }

    public String toString() {
        return "HandStatus(enroll=" + this.enroll + ", verify=" + this.verify + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.enroll ? 1 : 0);
        dest.writeInt(this.verify ? 1 : 0);
    }
}
