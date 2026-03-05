package com.gse.aulapp.model.request;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.q;
import co.ceduladigital.sdk.x5;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J2\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\f¨\u0006%"}, d2 = {"Lcom/gse/aulapp/model/request/BiometricRegistrationRequest;", "Landroid/os/Parcelable;", "username", BuildConfig.FLAVOR, "enrollRightHand", BuildConfig.FLAVOR, "vector", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getUsername", "()Ljava/lang/String;", "setUsername", "(Ljava/lang/String;)V", "getEnrollRightHand", "()Ljava/lang/Boolean;", "setEnrollRightHand", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getVector", "setVector", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/gse/aulapp/model/request/BiometricRegistrationRequest;", "describeContents", BuildConfig.FLAVOR, "equals", "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BiometricRegistrationRequest implements Parcelable {
    public static final Parcelable.Creator<BiometricRegistrationRequest> CREATOR = new Creator();

    @SerializedName("enrollRightHand")
    private Boolean enrollRightHand;

    @SerializedName("username")
    private String username;

    @SerializedName("vector")
    private String vector;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BiometricRegistrationRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BiometricRegistrationRequest createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BiometricRegistrationRequest(readString, valueOf, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BiometricRegistrationRequest[] newArray(int i) {
            return new BiometricRegistrationRequest[i];
        }
    }

    public BiometricRegistrationRequest() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ BiometricRegistrationRequest copy$default(BiometricRegistrationRequest biometricRegistrationRequest, String str, Boolean bool, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = biometricRegistrationRequest.username;
        }
        if ((i & 2) != 0) {
            bool = biometricRegistrationRequest.enrollRightHand;
        }
        if ((i & 4) != 0) {
            str2 = biometricRegistrationRequest.vector;
        }
        return biometricRegistrationRequest.copy(str, bool, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getEnrollRightHand() {
        return this.enrollRightHand;
    }

    /* renamed from: component3, reason: from getter */
    public final String getVector() {
        return this.vector;
    }

    public final BiometricRegistrationRequest copy(String username, Boolean enrollRightHand, String vector) {
        return new BiometricRegistrationRequest(username, enrollRightHand, vector);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BiometricRegistrationRequest)) {
            return false;
        }
        BiometricRegistrationRequest biometricRegistrationRequest = (BiometricRegistrationRequest) other;
        return Intrinsics.areEqual(this.username, biometricRegistrationRequest.username) && Intrinsics.areEqual(this.enrollRightHand, biometricRegistrationRequest.enrollRightHand) && Intrinsics.areEqual(this.vector, biometricRegistrationRequest.vector);
    }

    public final Boolean getEnrollRightHand() {
        return this.enrollRightHand;
    }

    public final String getUsername() {
        return this.username;
    }

    public final String getVector() {
        return this.vector;
    }

    public int hashCode() {
        String str = this.username;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.enrollRightHand;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.vector;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setEnrollRightHand(Boolean bool) {
        this.enrollRightHand = bool;
    }

    public final void setUsername(String str) {
        this.username = str;
    }

    public final void setVector(String str) {
        this.vector = str;
    }

    public String toString() {
        String str = this.username;
        Boolean bool = this.enrollRightHand;
        String str2 = this.vector;
        StringBuilder sb = new StringBuilder("BiometricRegistrationRequest(username=");
        sb.append(str);
        sb.append(", enrollRightHand=");
        sb.append(bool);
        sb.append(", vector=");
        return q.j(str2, ")", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.username);
        Boolean bool = this.enrollRightHand;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            x5.v(dest, 1, bool);
        }
        dest.writeString(this.vector);
    }

    public BiometricRegistrationRequest(String str, Boolean bool, String str2) {
        this.username = str;
        this.enrollRightHand = bool;
        this.vector = str2;
    }

    public /* synthetic */ BiometricRegistrationRequest(String str, Boolean bool, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str2);
    }
}
