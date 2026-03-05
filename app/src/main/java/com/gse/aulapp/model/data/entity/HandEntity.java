package com.gse.aulapp.model.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.x5;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bB\t\b\u0016¢\u0006\u0004\b\n\u0010\fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003JE\u0010#\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0006\u0010$\u001a\u00020\u0003J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\t\u0010*\u001a\u00020\u0005HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0003R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014¨\u00060"}, d2 = {"Lcom/gse/aulapp/model/data/entity/HandEntity;", "Landroid/os/Parcelable;", "id", BuildConfig.FLAVOR, "type", BuildConfig.FLAVOR, "indexFinger", "middleFinger", "ringFinger", "littleFinger", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()V", "getId", "()I", "setId", "(I)V", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "getIndexFinger", "setIndexFinger", "getMiddleFinger", "setMiddleFinger", "getRingFinger", "setRingFinger", "getLittleFinger", "setLittleFinger", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class HandEntity implements Parcelable {
    public static final Parcelable.Creator<HandEntity> CREATOR = new Creator();
    private int id;
    private String indexFinger;
    private String littleFinger;
    private String middleFinger;
    private String ringFinger;
    private String type;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<HandEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HandEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HandEntity(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HandEntity[] newArray(int i) {
            return new HandEntity[i];
        }
    }

    public HandEntity(int i, String type, String indexFinger, String middleFinger, String ringFinger, String littleFinger) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(indexFinger, "indexFinger");
        Intrinsics.checkNotNullParameter(middleFinger, "middleFinger");
        Intrinsics.checkNotNullParameter(ringFinger, "ringFinger");
        Intrinsics.checkNotNullParameter(littleFinger, "littleFinger");
        this.id = i;
        this.type = type;
        this.indexFinger = indexFinger;
        this.middleFinger = middleFinger;
        this.ringFinger = ringFinger;
        this.littleFinger = littleFinger;
    }

    public static /* synthetic */ HandEntity copy$default(HandEntity handEntity, int i, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = handEntity.id;
        }
        if ((i2 & 2) != 0) {
            str = handEntity.type;
        }
        if ((i2 & 4) != 0) {
            str2 = handEntity.indexFinger;
        }
        if ((i2 & 8) != 0) {
            str3 = handEntity.middleFinger;
        }
        if ((i2 & 16) != 0) {
            str4 = handEntity.ringFinger;
        }
        if ((i2 & 32) != 0) {
            str5 = handEntity.littleFinger;
        }
        String str6 = str4;
        String str7 = str5;
        return handEntity.copy(i, str, str2, str3, str6, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIndexFinger() {
        return this.indexFinger;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMiddleFinger() {
        return this.middleFinger;
    }

    /* renamed from: component5, reason: from getter */
    public final String getRingFinger() {
        return this.ringFinger;
    }

    /* renamed from: component6, reason: from getter */
    public final String getLittleFinger() {
        return this.littleFinger;
    }

    public final HandEntity copy(int id, String type, String indexFinger, String middleFinger, String ringFinger, String littleFinger) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(indexFinger, "indexFinger");
        Intrinsics.checkNotNullParameter(middleFinger, "middleFinger");
        Intrinsics.checkNotNullParameter(ringFinger, "ringFinger");
        Intrinsics.checkNotNullParameter(littleFinger, "littleFinger");
        return new HandEntity(id, type, indexFinger, middleFinger, ringFinger, littleFinger);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HandEntity)) {
            return false;
        }
        HandEntity handEntity = (HandEntity) other;
        return this.id == handEntity.id && Intrinsics.areEqual(this.type, handEntity.type) && Intrinsics.areEqual(this.indexFinger, handEntity.indexFinger) && Intrinsics.areEqual(this.middleFinger, handEntity.middleFinger) && Intrinsics.areEqual(this.ringFinger, handEntity.ringFinger) && Intrinsics.areEqual(this.littleFinger, handEntity.littleFinger);
    }

    public int hashCode() {
        return this.littleFinger.hashCode() + x5.d(this.ringFinger, x5.d(this.middleFinger, x5.d(this.indexFinger, x5.d(this.type, Integer.hashCode(this.id) * 31, 31), 31), 31), 31);
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setIndexFinger(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.indexFinger = str;
    }

    public final void setLittleFinger(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.littleFinger = str;
    }

    public final void setMiddleFinger(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.middleFinger = str;
    }

    public final void setRingFinger(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ringFinger = str;
    }

    public final void setType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    public String toString() {
        int i = this.id;
        String str = this.type;
        String str2 = this.indexFinger;
        String str3 = this.middleFinger;
        String str4 = this.ringFinger;
        String str5 = this.littleFinger;
        StringBuilder sb = new StringBuilder("HandEntity(id=");
        sb.append(i);
        sb.append(", type=");
        sb.append(str);
        sb.append(", indexFinger=");
        x5.z(sb, str2, ", middleFinger=", str3, ", ringFinger=");
        sb.append(str4);
        sb.append(", littleFinger=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.id);
        dest.writeString(this.type);
        dest.writeString(this.indexFinger);
        dest.writeString(this.middleFinger);
        dest.writeString(this.ringFinger);
        dest.writeString(this.littleFinger);
    }

    public HandEntity() {
        this(0, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR);
    }
}
