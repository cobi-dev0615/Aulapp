package com.gse.aulapp.model.request;

import android.os.Parcel;
import android.os.Parcelable;
import co.ceduladigital.sdk.x5;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001e¨\u0006%"}, d2 = {"Lcom/gse/aulapp/model/request/LevelSummary;", "Landroid/os/Parcelable;", BuildConfig.FLAVOR, "approved", "failed", "notApply", "total", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getApproved", "()Ljava/lang/Integer;", "setApproved", "(Ljava/lang/Integer;)V", "getFailed", "setFailed", "getNotApply", "setNotApply", "getTotal", "setTotal", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class LevelSummary implements Parcelable {
    public static final Parcelable.Creator<LevelSummary> CREATOR = new Creator();

    @SerializedName("approved")
    private Integer approved;

    @SerializedName("failed")
    private Integer failed;

    @SerializedName("notApply")
    private Integer notApply;

    @SerializedName("total")
    private Integer total;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LevelSummary> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LevelSummary createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LevelSummary(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LevelSummary[] newArray(int i) {
            return new LevelSummary[i];
        }
    }

    public LevelSummary(Integer num, Integer num2, Integer num3, Integer num4) {
        this.approved = num;
        this.failed = num2;
        this.notApply = num3;
        this.total = num4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LevelSummary)) {
            return false;
        }
        LevelSummary levelSummary = (LevelSummary) other;
        return Intrinsics.areEqual(this.approved, levelSummary.approved) && Intrinsics.areEqual(this.failed, levelSummary.failed) && Intrinsics.areEqual(this.notApply, levelSummary.notApply) && Intrinsics.areEqual(this.total, levelSummary.total);
    }

    public int hashCode() {
        Integer num = this.approved;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.failed;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.notApply;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.total;
        return hashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public String toString() {
        return "LevelSummary(approved=" + this.approved + ", failed=" + this.failed + ", notApply=" + this.notApply + ", total=" + this.total + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Integer num = this.approved;
        if (num == null) {
            dest.writeInt(0);
        } else {
            x5.w(dest, 1, num);
        }
        Integer num2 = this.failed;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            x5.w(dest, 1, num2);
        }
        Integer num3 = this.notApply;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            x5.w(dest, 1, num3);
        }
        Integer num4 = this.total;
        if (num4 == null) {
            dest.writeInt(0);
        } else {
            x5.w(dest, 1, num4);
        }
    }
}
