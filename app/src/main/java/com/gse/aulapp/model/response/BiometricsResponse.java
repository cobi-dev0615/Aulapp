package com.gse.aulapp.model.response;

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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J2\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006%"}, d2 = {"Lcom/gse/aulapp/model/response/BiometricsResponse;", "Landroid/os/Parcelable;", "left", BuildConfig.FLAVOR, "right", "exception", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "getLeft", "()Ljava/lang/Boolean;", "setLeft", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getRight", "setRight", "getException", "()Ljava/lang/String;", "setException", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/gse/aulapp/model/response/BiometricsResponse;", "describeContents", BuildConfig.FLAVOR, "equals", "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BiometricsResponse implements Parcelable {
    public static final Parcelable.Creator<BiometricsResponse> CREATOR = new Creator();

    @SerializedName("exception")
    private String exception;

    @SerializedName("left")
    private Boolean left;

    @SerializedName("right")
    private Boolean right;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BiometricsResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BiometricsResponse createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BiometricsResponse(valueOf, bool, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BiometricsResponse[] newArray(int i) {
            return new BiometricsResponse[i];
        }
    }

    public BiometricsResponse() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ BiometricsResponse copy$default(BiometricsResponse biometricsResponse, Boolean bool, Boolean bool2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = biometricsResponse.left;
        }
        if ((i & 2) != 0) {
            bool2 = biometricsResponse.right;
        }
        if ((i & 4) != 0) {
            str = biometricsResponse.exception;
        }
        return biometricsResponse.copy(bool, bool2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getLeft() {
        return this.left;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getRight() {
        return this.right;
    }

    /* renamed from: component3, reason: from getter */
    public final String getException() {
        return this.exception;
    }

    public final BiometricsResponse copy(Boolean left, Boolean right, String exception) {
        return new BiometricsResponse(left, right, exception);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BiometricsResponse)) {
            return false;
        }
        BiometricsResponse biometricsResponse = (BiometricsResponse) other;
        return Intrinsics.areEqual(this.left, biometricsResponse.left) && Intrinsics.areEqual(this.right, biometricsResponse.right) && Intrinsics.areEqual(this.exception, biometricsResponse.exception);
    }

    public final String getException() {
        return this.exception;
    }

    public final Boolean getLeft() {
        return this.left;
    }

    public final Boolean getRight() {
        return this.right;
    }

    public int hashCode() {
        Boolean bool = this.left;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.right;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.exception;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final void setException(String str) {
        this.exception = str;
    }

    public final void setLeft(Boolean bool) {
        this.left = bool;
    }

    public final void setRight(Boolean bool) {
        this.right = bool;
    }

    public String toString() {
        Boolean bool = this.left;
        Boolean bool2 = this.right;
        String str = this.exception;
        StringBuilder sb = new StringBuilder("BiometricsResponse(left=");
        sb.append(bool);
        sb.append(", right=");
        sb.append(bool2);
        sb.append(", exception=");
        return q.j(str, ")", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Boolean bool = this.left;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            x5.v(dest, 1, bool);
        }
        Boolean bool2 = this.right;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            x5.v(dest, 1, bool2);
        }
        dest.writeString(this.exception);
    }

    public BiometricsResponse(Boolean bool, Boolean bool2, String str) {
        this.left = bool;
        this.right = bool2;
        this.exception = str;
    }

    public /* synthetic */ BiometricsResponse(Boolean bool, Boolean bool2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : str);
    }
}
