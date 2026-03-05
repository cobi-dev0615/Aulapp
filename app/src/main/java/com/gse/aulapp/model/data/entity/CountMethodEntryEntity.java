package com.gse.aulapp.model.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.x5;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\t\b\u0016¢\u0006\u0004\b\b\u0010\nJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J1\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u0006J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0006HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0006R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014¨\u0006("}, d2 = {"Lcom/gse/aulapp/model/data/entity/CountMethodEntryEntity;", "Landroid/os/Parcelable;", "userID", BuildConfig.FLAVOR, "date", "fraudCount", BuildConfig.FLAVOR, "fingerPrintsCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "()V", "getUserID", "()Ljava/lang/String;", "setUserID", "(Ljava/lang/String;)V", "getDate", "setDate", "getFraudCount", "()I", "setFraudCount", "(I)V", "getFingerPrintsCount", "setFingerPrintsCount", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CountMethodEntryEntity implements Parcelable {
    public static final Parcelable.Creator<CountMethodEntryEntity> CREATOR = new Creator();
    private String date;
    private int fingerPrintsCount;
    private int fraudCount;
    private String userID;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CountMethodEntryEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CountMethodEntryEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CountMethodEntryEntity(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CountMethodEntryEntity[] newArray(int i) {
            return new CountMethodEntryEntity[i];
        }
    }

    public CountMethodEntryEntity(String userID, String date, int i, int i2) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(date, "date");
        this.userID = userID;
        this.date = date;
        this.fraudCount = i;
        this.fingerPrintsCount = i2;
    }

    public static /* synthetic */ CountMethodEntryEntity copy$default(CountMethodEntryEntity countMethodEntryEntity, String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = countMethodEntryEntity.userID;
        }
        if ((i3 & 2) != 0) {
            str2 = countMethodEntryEntity.date;
        }
        if ((i3 & 4) != 0) {
            i = countMethodEntryEntity.fraudCount;
        }
        if ((i3 & 8) != 0) {
            i2 = countMethodEntryEntity.fingerPrintsCount;
        }
        return countMethodEntryEntity.copy(str, str2, i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUserID() {
        return this.userID;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: component3, reason: from getter */
    public final int getFraudCount() {
        return this.fraudCount;
    }

    /* renamed from: component4, reason: from getter */
    public final int getFingerPrintsCount() {
        return this.fingerPrintsCount;
    }

    public final CountMethodEntryEntity copy(String userID, String date, int fraudCount, int fingerPrintsCount) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(date, "date");
        return new CountMethodEntryEntity(userID, date, fraudCount, fingerPrintsCount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountMethodEntryEntity)) {
            return false;
        }
        CountMethodEntryEntity countMethodEntryEntity = (CountMethodEntryEntity) other;
        return Intrinsics.areEqual(this.userID, countMethodEntryEntity.userID) && Intrinsics.areEqual(this.date, countMethodEntryEntity.date) && this.fraudCount == countMethodEntryEntity.fraudCount && this.fingerPrintsCount == countMethodEntryEntity.fingerPrintsCount;
    }

    public final String getDate() {
        return this.date;
    }

    public final int getFingerPrintsCount() {
        return this.fingerPrintsCount;
    }

    public final int getFraudCount() {
        return this.fraudCount;
    }

    public final String getUserID() {
        return this.userID;
    }

    public int hashCode() {
        return Integer.hashCode(this.fingerPrintsCount) + x5.a(this.fraudCount, x5.d(this.date, this.userID.hashCode() * 31, 31), 31);
    }

    public final void setDate(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.date = str;
    }

    public final void setFingerPrintsCount(int i) {
        this.fingerPrintsCount = i;
    }

    public final void setFraudCount(int i) {
        this.fraudCount = i;
    }

    public final void setUserID(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userID = str;
    }

    public String toString() {
        String str = this.userID;
        String str2 = this.date;
        int i = this.fraudCount;
        int i2 = this.fingerPrintsCount;
        StringBuilder r = x5.r("CountMethodEntryEntity(userID=", str, ", date=", str2, ", fraudCount=");
        r.append(i);
        r.append(", fingerPrintsCount=");
        r.append(i2);
        r.append(")");
        return r.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.userID);
        dest.writeString(this.date);
        dest.writeInt(this.fraudCount);
        dest.writeInt(this.fingerPrintsCount);
    }

    public CountMethodEntryEntity() {
        this(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0);
    }
}
