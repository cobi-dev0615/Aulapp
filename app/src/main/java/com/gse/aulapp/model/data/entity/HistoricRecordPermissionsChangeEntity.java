package com.gse.aulapp.model.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.q;
import co.ceduladigital.sdk.x5;
import com.karumi.dexter.BuildConfig;
import defpackage.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bB\t\b\u0016¢\u0006\u0004\b\n\u0010\fJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003JB\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010$J\u0006\u0010%\u001a\u00020\u0003J\u0013\u0010&\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\t\u0010*\u001a\u00020\u0005HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0003R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015¨\u00060"}, d2 = {"Lcom/gse/aulapp/model/data/entity/HistoricRecordPermissionsChangeEntity;", "Landroid/os/Parcelable;", "id", BuildConfig.FLAVOR, "sessionID", BuildConfig.FLAVOR, "date", "active", BuildConfig.FLAVOR, "permission", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "()V", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getSessionID", "()Ljava/lang/String;", "setSessionID", "(Ljava/lang/String;)V", "getDate", "setDate", "getActive", "()Z", "setActive", "(Z)V", "getPermission", "setPermission", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lcom/gse/aulapp/model/data/entity/HistoricRecordPermissionsChangeEntity;", "describeContents", "equals", "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class HistoricRecordPermissionsChangeEntity implements Parcelable {
    public static final Parcelable.Creator<HistoricRecordPermissionsChangeEntity> CREATOR = new Creator();
    private boolean active;
    private String date;
    private Integer id;
    private String permission;
    private String sessionID;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<HistoricRecordPermissionsChangeEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HistoricRecordPermissionsChangeEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HistoricRecordPermissionsChangeEntity(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HistoricRecordPermissionsChangeEntity[] newArray(int i) {
            return new HistoricRecordPermissionsChangeEntity[i];
        }
    }

    public HistoricRecordPermissionsChangeEntity(Integer num, String sessionID, String date, boolean z, String permission) {
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(permission, "permission");
        this.id = num;
        this.sessionID = sessionID;
        this.date = date;
        this.active = z;
        this.permission = permission;
    }

    public static /* synthetic */ HistoricRecordPermissionsChangeEntity copy$default(HistoricRecordPermissionsChangeEntity historicRecordPermissionsChangeEntity, Integer num, String str, String str2, boolean z, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = historicRecordPermissionsChangeEntity.id;
        }
        if ((i & 2) != 0) {
            str = historicRecordPermissionsChangeEntity.sessionID;
        }
        if ((i & 4) != 0) {
            str2 = historicRecordPermissionsChangeEntity.date;
        }
        if ((i & 8) != 0) {
            z = historicRecordPermissionsChangeEntity.active;
        }
        if ((i & 16) != 0) {
            str3 = historicRecordPermissionsChangeEntity.permission;
        }
        String str4 = str3;
        String str5 = str2;
        return historicRecordPermissionsChangeEntity.copy(num, str, str5, z, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSessionID() {
        return this.sessionID;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getActive() {
        return this.active;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPermission() {
        return this.permission;
    }

    public final HistoricRecordPermissionsChangeEntity copy(Integer id, String sessionID, String date, boolean active, String permission) {
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(permission, "permission");
        return new HistoricRecordPermissionsChangeEntity(id, sessionID, date, active, permission);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistoricRecordPermissionsChangeEntity)) {
            return false;
        }
        HistoricRecordPermissionsChangeEntity historicRecordPermissionsChangeEntity = (HistoricRecordPermissionsChangeEntity) other;
        return Intrinsics.areEqual(this.id, historicRecordPermissionsChangeEntity.id) && Intrinsics.areEqual(this.sessionID, historicRecordPermissionsChangeEntity.sessionID) && Intrinsics.areEqual(this.date, historicRecordPermissionsChangeEntity.date) && this.active == historicRecordPermissionsChangeEntity.active && Intrinsics.areEqual(this.permission, historicRecordPermissionsChangeEntity.permission);
    }

    public final boolean getActive() {
        return this.active;
    }

    public final String getDate() {
        return this.date;
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getPermission() {
        return this.permission;
    }

    public final String getSessionID() {
        return this.sessionID;
    }

    public int hashCode() {
        Integer num = this.id;
        return this.permission.hashCode() + a.g(this.active, x5.d(this.date, x5.d(this.sessionID, (num == null ? 0 : num.hashCode()) * 31, 31), 31), 31);
    }

    public final void setActive(boolean z) {
        this.active = z;
    }

    public final void setDate(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.date = str;
    }

    public final void setId(Integer num) {
        this.id = num;
    }

    public final void setPermission(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.permission = str;
    }

    public final void setSessionID(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sessionID = str;
    }

    public String toString() {
        Integer num = this.id;
        String str = this.sessionID;
        String str2 = this.date;
        boolean z = this.active;
        String str3 = this.permission;
        StringBuilder p = x5.p("HistoricRecordPermissionsChangeEntity(id=", num, ", sessionID=", str, ", date=");
        p.append(str2);
        p.append(", active=");
        p.append(z);
        p.append(", permission=");
        return q.j(str3, ")", p);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Integer num = this.id;
        if (num == null) {
            dest.writeInt(0);
        } else {
            x5.w(dest, 1, num);
        }
        dest.writeString(this.sessionID);
        dest.writeString(this.date);
        dest.writeInt(this.active ? 1 : 0);
        dest.writeString(this.permission);
    }

    public HistoricRecordPermissionsChangeEntity() {
        this(0, BuildConfig.FLAVOR, BuildConfig.FLAVOR, false, BuildConfig.FLAVOR);
    }
}
