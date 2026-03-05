package com.gse.aulapp.model.request;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import defpackage.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0018"}, d2 = {"Lcom/gse/aulapp/model/request/RefreshTokenRequest;", "Landroid/os/Parcelable;", "email", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "setEmail", "component1", "copy", "describeContents", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RefreshTokenRequest implements Parcelable {
    public static final Parcelable.Creator<RefreshTokenRequest> CREATOR = new Creator();

    @SerializedName("email")
    private String email;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RefreshTokenRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RefreshTokenRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RefreshTokenRequest(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RefreshTokenRequest[] newArray(int i) {
            return new RefreshTokenRequest[i];
        }
    }

    public RefreshTokenRequest(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.email = email;
    }

    public static /* synthetic */ RefreshTokenRequest copy$default(RefreshTokenRequest refreshTokenRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = refreshTokenRequest.email;
        }
        return refreshTokenRequest.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    public final RefreshTokenRequest copy(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        return new RefreshTokenRequest(email);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RefreshTokenRequest) && Intrinsics.areEqual(this.email, ((RefreshTokenRequest) other).email);
    }

    public final String getEmail() {
        return this.email;
    }

    public int hashCode() {
        return this.email.hashCode();
    }

    public final void setEmail(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.email = str;
    }

    public String toString() {
        return a.m("RefreshTokenRequest(email=", this.email, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.email);
    }
}
