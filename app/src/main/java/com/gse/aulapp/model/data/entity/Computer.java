package com.gse.aulapp.model.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.y7;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0017¢\u0006\u0004\b\u0005\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/gse/aulapp/model/data/entity/Computer;", "Landroid/os/Parcelable;", "_id", BuildConfig.FLAVOR, "nameItem", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "()V", "get_id", "()Ljava/lang/String;", "set_id", "(Ljava/lang/String;)V", "getNameItem", "setNameItem", "component1", "component2", "copy", "describeContents", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Computer implements Parcelable {
    public static final Parcelable.Creator<Computer> CREATOR = new Creator();

    @SerializedName("_id")
    @Expose
    private String _id;

    @SerializedName("nameItem")
    @Expose
    private String nameItem;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Computer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Computer createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Computer(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Computer[] newArray(int i) {
            return new Computer[i];
        }
    }

    public Computer(String str, String nameItem) {
        Intrinsics.checkNotNullParameter(nameItem, "nameItem");
        this._id = str;
        this.nameItem = nameItem;
    }

    public static /* synthetic */ Computer copy$default(Computer computer, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = computer._id;
        }
        if ((i & 2) != 0) {
            str2 = computer.nameItem;
        }
        return computer.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String get_id() {
        return this._id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getNameItem() {
        return this.nameItem;
    }

    public final Computer copy(String _id, String nameItem) {
        Intrinsics.checkNotNullParameter(nameItem, "nameItem");
        return new Computer(_id, nameItem);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Computer)) {
            return false;
        }
        Computer computer = (Computer) other;
        return Intrinsics.areEqual(this._id, computer._id) && Intrinsics.areEqual(this.nameItem, computer.nameItem);
    }

    public int hashCode() {
        String str = this._id;
        return this.nameItem.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final void setNameItem(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nameItem = str;
    }

    public final void set_id(String str) {
        this._id = str;
    }

    public String toString() {
        return y7.p("Computer(_id=", this._id, ", nameItem=", this.nameItem, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this._id);
        dest.writeString(this.nameItem);
    }

    public Computer() {
        this(BuildConfig.FLAVOR, BuildConfig.FLAVOR);
    }
}
