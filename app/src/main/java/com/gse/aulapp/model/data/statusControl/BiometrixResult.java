package com.gse.aulapp.model.data.statusControl;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.x5;
import com.gse.aulapp.model.enumerate.EnumBiometrixStatus;
import com.gse.aulapp.model.enumerate.EnumMethodBiometrix;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001cHÖ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014¨\u0006'"}, d2 = {"Lcom/gse/aulapp/model/data/statusControl/BiometrixResult;", "Landroid/os/Parcelable;", "status", "Lcom/gse/aulapp/model/enumerate/EnumBiometrixStatus;", "method", "Lcom/gse/aulapp/model/enumerate/EnumMethodBiometrix;", "code", BuildConfig.FLAVOR, "message", "isActiveException", BuildConfig.FLAVOR, "<init>", "(Lcom/gse/aulapp/model/enumerate/EnumBiometrixStatus;Lcom/gse/aulapp/model/enumerate/EnumMethodBiometrix;Ljava/lang/String;Ljava/lang/String;Z)V", "getStatus", "()Lcom/gse/aulapp/model/enumerate/EnumBiometrixStatus;", "getMethod", "()Lcom/gse/aulapp/model/enumerate/EnumMethodBiometrix;", "getCode", "()Ljava/lang/String;", "getMessage", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", BuildConfig.FLAVOR, "equals", "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BiometrixResult implements Parcelable {
    public static final Parcelable.Creator<BiometrixResult> CREATOR = new Creator();
    private final String code;
    private final boolean isActiveException;
    private final String message;
    private final EnumMethodBiometrix method;
    private final EnumBiometrixStatus status;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BiometrixResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BiometrixResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BiometrixResult(EnumBiometrixStatus.valueOf(parcel.readString()), EnumMethodBiometrix.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BiometrixResult[] newArray(int i) {
            return new BiometrixResult[i];
        }
    }

    public BiometrixResult(EnumBiometrixStatus status, EnumMethodBiometrix method, String code, String message, boolean z) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        this.status = status;
        this.method = method;
        this.code = code;
        this.message = message;
        this.isActiveException = z;
    }

    public static /* synthetic */ BiometrixResult copy$default(BiometrixResult biometrixResult, EnumBiometrixStatus enumBiometrixStatus, EnumMethodBiometrix enumMethodBiometrix, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            enumBiometrixStatus = biometrixResult.status;
        }
        if ((i & 2) != 0) {
            enumMethodBiometrix = biometrixResult.method;
        }
        if ((i & 4) != 0) {
            str = biometrixResult.code;
        }
        if ((i & 8) != 0) {
            str2 = biometrixResult.message;
        }
        if ((i & 16) != 0) {
            z = biometrixResult.isActiveException;
        }
        boolean z2 = z;
        String str3 = str;
        return biometrixResult.copy(enumBiometrixStatus, enumMethodBiometrix, str3, str2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final EnumBiometrixStatus getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final EnumMethodBiometrix getMethod() {
        return this.method;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsActiveException() {
        return this.isActiveException;
    }

    public final BiometrixResult copy(EnumBiometrixStatus status, EnumMethodBiometrix method, String code, String message, boolean isActiveException) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        return new BiometrixResult(status, method, code, message, isActiveException);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BiometrixResult)) {
            return false;
        }
        BiometrixResult biometrixResult = (BiometrixResult) other;
        return this.status == biometrixResult.status && this.method == biometrixResult.method && Intrinsics.areEqual(this.code, biometrixResult.code) && Intrinsics.areEqual(this.message, biometrixResult.message) && this.isActiveException == biometrixResult.isActiveException;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isActiveException) + x5.d(this.message, x5.d(this.code, (this.method.hashCode() + (this.status.hashCode() * 31)) * 31, 31), 31);
    }

    public final boolean isActiveException() {
        return this.isActiveException;
    }

    public String toString() {
        EnumBiometrixStatus enumBiometrixStatus = this.status;
        EnumMethodBiometrix enumMethodBiometrix = this.method;
        String str = this.code;
        String str2 = this.message;
        boolean z = this.isActiveException;
        StringBuilder sb = new StringBuilder("BiometrixResult(status=");
        sb.append(enumBiometrixStatus);
        sb.append(", method=");
        sb.append(enumMethodBiometrix);
        sb.append(", code=");
        x5.z(sb, str, ", message=", str2, ", isActiveException=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.status.name());
        dest.writeString(this.method.name());
        dest.writeString(this.code);
        dest.writeString(this.message);
        dest.writeInt(this.isActiveException ? 1 : 0);
    }
}
