package com.gse.aulapp.model.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.q;
import co.ceduladigital.sdk.x5;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import defpackage.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bB\t\b\u0017¢\u0006\u0004\b\n\u0010\fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J=\u0010\"\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010#\u001a\u00020$J\u0013\u0010%\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020$HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020$R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R \u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014¨\u0006/"}, d2 = {"Lcom/gse/aulapp/model/data/entity/Biometrics;", "Landroid/os/Parcelable;", "id", BuildConfig.FLAVOR, "idUser", BuildConfig.FLAVOR, "left", BuildConfig.FLAVOR, "right", "exception", "<init>", "(JLjava/lang/String;ZZLjava/lang/String;)V", "()V", "getId", "()J", "setId", "(J)V", "getIdUser", "()Ljava/lang/String;", "setIdUser", "(Ljava/lang/String;)V", "getLeft", "()Z", "setLeft", "(Z)V", "getRight", "setRight", "getException", "setException", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", BuildConfig.FLAVOR, "equals", "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Biometrics implements Parcelable {
    public static final Parcelable.Creator<Biometrics> CREATOR = new Creator();

    @SerializedName("exception")
    @Expose
    private String exception;
    private long id;
    private String idUser;

    @SerializedName("left")
    @Expose
    private boolean left;

    @SerializedName("right")
    @Expose
    private boolean right;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Biometrics> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Biometrics createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            return new Biometrics(readLong, readString, z2, parcel.readInt() == 0 ? z : true, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Biometrics[] newArray(int i) {
            return new Biometrics[i];
        }
    }

    public Biometrics(long j, String idUser, boolean z, boolean z2, String str) {
        Intrinsics.checkNotNullParameter(idUser, "idUser");
        this.id = j;
        this.idUser = idUser;
        this.left = z;
        this.right = z2;
        this.exception = str;
    }

    public static /* synthetic */ Biometrics copy$default(Biometrics biometrics, long j, String str, boolean z, boolean z2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = biometrics.id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = biometrics.idUser;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            z = biometrics.left;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = biometrics.right;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            str2 = biometrics.exception;
        }
        return biometrics.copy(j2, str3, z3, z4, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIdUser() {
        return this.idUser;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getLeft() {
        return this.left;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getRight() {
        return this.right;
    }

    /* renamed from: component5, reason: from getter */
    public final String getException() {
        return this.exception;
    }

    public final Biometrics copy(long id, String idUser, boolean left, boolean right, String exception) {
        Intrinsics.checkNotNullParameter(idUser, "idUser");
        return new Biometrics(id, idUser, left, right, exception);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Biometrics)) {
            return false;
        }
        Biometrics biometrics = (Biometrics) other;
        return this.id == biometrics.id && Intrinsics.areEqual(this.idUser, biometrics.idUser) && this.left == biometrics.left && this.right == biometrics.right && Intrinsics.areEqual(this.exception, biometrics.exception);
    }

    public int hashCode() {
        int g = a.g(this.right, a.g(this.left, x5.d(this.idUser, Long.hashCode(this.id) * 31, 31), 31), 31);
        String str = this.exception;
        return g + (str == null ? 0 : str.hashCode());
    }

    public final void setException(String str) {
        this.exception = str;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setIdUser(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.idUser = str;
    }

    public final void setLeft(boolean z) {
        this.left = z;
    }

    public final void setRight(boolean z) {
        this.right = z;
    }

    public String toString() {
        long j = this.id;
        String str = this.idUser;
        boolean z = this.left;
        boolean z2 = this.right;
        String str2 = this.exception;
        StringBuilder sb = new StringBuilder("Biometrics(id=");
        sb.append(j);
        sb.append(", idUser=");
        sb.append(str);
        sb.append(", left=");
        sb.append(z);
        sb.append(", right=");
        sb.append(z2);
        return q.m(sb, ", exception=", str2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.id);
        dest.writeString(this.idUser);
        dest.writeInt(this.left ? 1 : 0);
        dest.writeInt(this.right ? 1 : 0);
        dest.writeString(this.exception);
    }

    public Biometrics() {
        this(0L, BuildConfig.FLAVOR, false, false, BuildConfig.FLAVOR);
    }
}
