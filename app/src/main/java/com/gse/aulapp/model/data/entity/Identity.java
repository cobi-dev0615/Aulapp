package com.gse.aulapp.model.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.x5;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import defpackage.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\t\b\u0017¢\u0006\u0004\b\t\u0010\u000bJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J1\u0010\u001e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020 HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020 R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017¨\u0006+"}, d2 = {"Lcom/gse/aulapp/model/data/entity/Identity;", "Landroid/os/Parcelable;", "id", BuildConfig.FLAVOR, "idUser", BuildConfig.FLAVOR, "completed", BuildConfig.FLAVOR, "toValidate", "<init>", "(JLjava/lang/String;ZZ)V", "()V", "getId", "()J", "setId", "(J)V", "getIdUser", "()Ljava/lang/String;", "setIdUser", "(Ljava/lang/String;)V", "getCompleted", "()Z", "setCompleted", "(Z)V", "getToValidate", "setToValidate", "component1", "component2", "component3", "component4", "copy", "describeContents", BuildConfig.FLAVOR, "equals", "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Identity implements Parcelable {
    public static final Parcelable.Creator<Identity> CREATOR = new Creator();

    @SerializedName("completed")
    @Expose
    private boolean completed;
    private long id;
    private String idUser;

    @SerializedName("toValidate")
    @Expose
    private boolean toValidate;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Identity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Identity createFromParcel(Parcel parcel) {
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
            return new Identity(readLong, readString, z2, parcel.readInt() == 0 ? z : true);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Identity[] newArray(int i) {
            return new Identity[i];
        }
    }

    public Identity(long j, String idUser, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(idUser, "idUser");
        this.id = j;
        this.idUser = idUser;
        this.completed = z;
        this.toValidate = z2;
    }

    public static /* synthetic */ Identity copy$default(Identity identity, long j, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = identity.id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = identity.idUser;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            z = identity.completed;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = identity.toValidate;
        }
        return identity.copy(j2, str2, z3, z2);
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
    public final boolean getCompleted() {
        return this.completed;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getToValidate() {
        return this.toValidate;
    }

    public final Identity copy(long id, String idUser, boolean completed, boolean toValidate) {
        Intrinsics.checkNotNullParameter(idUser, "idUser");
        return new Identity(id, idUser, completed, toValidate);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Identity)) {
            return false;
        }
        Identity identity = (Identity) other;
        return this.id == identity.id && Intrinsics.areEqual(this.idUser, identity.idUser) && this.completed == identity.completed && this.toValidate == identity.toValidate;
    }

    public final boolean getCompleted() {
        return this.completed;
    }

    public final long getId() {
        return this.id;
    }

    public final String getIdUser() {
        return this.idUser;
    }

    public final boolean getToValidate() {
        return this.toValidate;
    }

    public int hashCode() {
        return Boolean.hashCode(this.toValidate) + a.g(this.completed, x5.d(this.idUser, Long.hashCode(this.id) * 31, 31), 31);
    }

    public final void setCompleted(boolean z) {
        this.completed = z;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setIdUser(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.idUser = str;
    }

    public final void setToValidate(boolean z) {
        this.toValidate = z;
    }

    public String toString() {
        return "Identity(id=" + this.id + ", idUser=" + this.idUser + ", completed=" + this.completed + ", toValidate=" + this.toValidate + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.id);
        dest.writeString(this.idUser);
        dest.writeInt(this.completed ? 1 : 0);
        dest.writeInt(this.toValidate ? 1 : 0);
    }

    public Identity() {
        this(0L, BuildConfig.FLAVOR, false, false);
    }
}
