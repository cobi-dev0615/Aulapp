package com.gse.aulapp.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0015\u001a\u00020\fJ\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/gse/aulapp/model/response/AuthStatus;", "Landroid/os/Parcelable;", "<init>", "()V", "authorized", BuildConfig.FLAVOR, "getAuthorized", "()Ljava/lang/Boolean;", "setAuthorized", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "error", BuildConfig.FLAVOR, "getError", "()Ljava/lang/Integer;", "setError", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "score", "getScore", "setScore", "describeContents", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AuthStatus implements Parcelable {
    public static final Parcelable.Creator<AuthStatus> CREATOR = new Creator();
    private Boolean authorized = Boolean.FALSE;
    private Integer error = 0;
    private Integer score = 0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AuthStatus> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthStatus createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return new AuthStatus();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthStatus[] newArray(int i) {
            return new AuthStatus[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean getAuthorized() {
        return this.authorized;
    }

    public final Integer getError() {
        return this.error;
    }

    public final Integer getScore() {
        return this.score;
    }

    public final void setAuthorized(Boolean bool) {
        this.authorized = bool;
    }

    public final void setError(Integer num) {
        this.error = num;
    }

    public final void setScore(Integer num) {
        this.score = num;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}
