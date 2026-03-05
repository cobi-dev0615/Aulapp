package com.gse.aulapp.model.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.x5;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\t\b\u0016¢\u0006\u0004\b\b\u0010\nJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001cHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006'"}, d2 = {"Lcom/gse/aulapp/model/data/entity/StepProcessSessionEntity;", "Landroid/os/Parcelable;", "sessionID", BuildConfig.FLAVOR, "type", "status", "isEntry", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "()V", "getSessionID", "()Ljava/lang/String;", "setSessionID", "(Ljava/lang/String;)V", "getType", "setType", "getStatus", "setStatus", "()Z", "setEntry", "(Z)V", "component1", "component2", "component3", "component4", "copy", "describeContents", BuildConfig.FLAVOR, "equals", "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StepProcessSessionEntity implements Parcelable {
    public static final Parcelable.Creator<StepProcessSessionEntity> CREATOR = new Creator();
    private boolean isEntry;
    private String sessionID;
    private String status;
    private String type;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StepProcessSessionEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StepProcessSessionEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StepProcessSessionEntity(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StepProcessSessionEntity[] newArray(int i) {
            return new StepProcessSessionEntity[i];
        }
    }

    public StepProcessSessionEntity(String sessionID, String type, String status, boolean z) {
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(status, "status");
        this.sessionID = sessionID;
        this.type = type;
        this.status = status;
        this.isEntry = z;
    }

    public static /* synthetic */ StepProcessSessionEntity copy$default(StepProcessSessionEntity stepProcessSessionEntity, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stepProcessSessionEntity.sessionID;
        }
        if ((i & 2) != 0) {
            str2 = stepProcessSessionEntity.type;
        }
        if ((i & 4) != 0) {
            str3 = stepProcessSessionEntity.status;
        }
        if ((i & 8) != 0) {
            z = stepProcessSessionEntity.isEntry;
        }
        return stepProcessSessionEntity.copy(str, str2, str3, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSessionID() {
        return this.sessionID;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsEntry() {
        return this.isEntry;
    }

    public final StepProcessSessionEntity copy(String sessionID, String type, String status, boolean isEntry) {
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(status, "status");
        return new StepProcessSessionEntity(sessionID, type, status, isEntry);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StepProcessSessionEntity)) {
            return false;
        }
        StepProcessSessionEntity stepProcessSessionEntity = (StepProcessSessionEntity) other;
        return Intrinsics.areEqual(this.sessionID, stepProcessSessionEntity.sessionID) && Intrinsics.areEqual(this.type, stepProcessSessionEntity.type) && Intrinsics.areEqual(this.status, stepProcessSessionEntity.status) && this.isEntry == stepProcessSessionEntity.isEntry;
    }

    public final String getSessionID() {
        return this.sessionID;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isEntry) + x5.d(this.status, x5.d(this.type, this.sessionID.hashCode() * 31, 31), 31);
    }

    public final boolean isEntry() {
        return this.isEntry;
    }

    public final void setEntry(boolean z) {
        this.isEntry = z;
    }

    public final void setSessionID(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sessionID = str;
    }

    public final void setStatus(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.status = str;
    }

    public final void setType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    public String toString() {
        String str = this.sessionID;
        String str2 = this.type;
        String str3 = this.status;
        boolean z = this.isEntry;
        StringBuilder r = x5.r("StepProcessSessionEntity(sessionID=", str, ", type=", str2, ", status=");
        r.append(str3);
        r.append(", isEntry=");
        r.append(z);
        r.append(")");
        return r.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.sessionID);
        dest.writeString(this.type);
        dest.writeString(this.status);
        dest.writeInt(this.isEntry ? 1 : 0);
    }

    public StepProcessSessionEntity() {
        this(BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, true);
    }
}
