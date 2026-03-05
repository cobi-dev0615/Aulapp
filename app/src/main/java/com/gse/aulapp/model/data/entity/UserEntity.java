package com.gse.aulapp.model.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.x5;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\t\b\u0016¢\u0006\u0004\b\b\u0010\nJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J:\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0006\u0010\u001e\u001a\u00020\u0006J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0006HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0006R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014¨\u0006*"}, d2 = {"Lcom/gse/aulapp/model/data/entity/UserEntity;", "Landroid/os/Parcelable;", "userID", BuildConfig.FLAVOR, "role", "leftHand", BuildConfig.FLAVOR, "rightHand", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "()V", "getUserID", "()Ljava/lang/String;", "setUserID", "(Ljava/lang/String;)V", "getRole", "setRole", "getLeftHand", "()Ljava/lang/Integer;", "setLeftHand", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getRightHand", "setRightHand", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/gse/aulapp/model/data/entity/UserEntity;", "describeContents", "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UserEntity implements Parcelable {
    public static final Parcelable.Creator<UserEntity> CREATOR = new Creator();
    private Integer leftHand;
    private Integer rightHand;
    private String role;
    private String userID;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UserEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UserEntity(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserEntity[] newArray(int i) {
            return new UserEntity[i];
        }
    }

    public UserEntity(String userID, String role, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(role, "role");
        this.userID = userID;
        this.role = role;
        this.leftHand = num;
        this.rightHand = num2;
    }

    public static /* synthetic */ UserEntity copy$default(UserEntity userEntity, String str, String str2, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userEntity.userID;
        }
        if ((i & 2) != 0) {
            str2 = userEntity.role;
        }
        if ((i & 4) != 0) {
            num = userEntity.leftHand;
        }
        if ((i & 8) != 0) {
            num2 = userEntity.rightHand;
        }
        return userEntity.copy(str, str2, num, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUserID() {
        return this.userID;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getLeftHand() {
        return this.leftHand;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getRightHand() {
        return this.rightHand;
    }

    public final UserEntity copy(String userID, String role, Integer leftHand, Integer rightHand) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(role, "role");
        return new UserEntity(userID, role, leftHand, rightHand);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserEntity)) {
            return false;
        }
        UserEntity userEntity = (UserEntity) other;
        return Intrinsics.areEqual(this.userID, userEntity.userID) && Intrinsics.areEqual(this.role, userEntity.role) && Intrinsics.areEqual(this.leftHand, userEntity.leftHand) && Intrinsics.areEqual(this.rightHand, userEntity.rightHand);
    }

    public final Integer getLeftHand() {
        return this.leftHand;
    }

    public final Integer getRightHand() {
        return this.rightHand;
    }

    public final String getRole() {
        return this.role;
    }

    public final String getUserID() {
        return this.userID;
    }

    public int hashCode() {
        int d = x5.d(this.role, this.userID.hashCode() * 31, 31);
        Integer num = this.leftHand;
        int hashCode = (d + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.rightHand;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final void setLeftHand(Integer num) {
        this.leftHand = num;
    }

    public final void setRightHand(Integer num) {
        this.rightHand = num;
    }

    public final void setRole(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.role = str;
    }

    public final void setUserID(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userID = str;
    }

    public String toString() {
        String str = this.userID;
        String str2 = this.role;
        Integer num = this.leftHand;
        Integer num2 = this.rightHand;
        StringBuilder r = x5.r("UserEntity(userID=", str, ", role=", str2, ", leftHand=");
        r.append(num);
        r.append(", rightHand=");
        r.append(num2);
        r.append(")");
        return r.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.userID);
        dest.writeString(this.role);
        Integer num = this.leftHand;
        if (num == null) {
            dest.writeInt(0);
        } else {
            x5.w(dest, 1, num);
        }
        Integer num2 = this.rightHand;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            x5.w(dest, 1, num2);
        }
    }

    public UserEntity() {
        this(BuildConfig.FLAVOR, BuildConfig.FLAVOR, null, null);
    }
}
