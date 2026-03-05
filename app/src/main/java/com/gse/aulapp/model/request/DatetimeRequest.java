package com.gse.aulapp.model.request;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.x5;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u001a"}, d2 = {"Lcom/gse/aulapp/model/request/DatetimeRequest;", "Landroid/os/Parcelable;", "success", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/Boolean;)V", "getSuccess", "()Ljava/lang/Boolean;", "setSuccess", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lcom/gse/aulapp/model/request/DatetimeRequest;", "describeContents", BuildConfig.FLAVOR, "equals", "other", BuildConfig.FLAVOR, "hashCode", "toString", BuildConfig.FLAVOR, "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class DatetimeRequest implements Parcelable {
    public static final Parcelable.Creator<DatetimeRequest> CREATOR = new Creator();

    @SerializedName("success")
    private Boolean success;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DatetimeRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DatetimeRequest createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DatetimeRequest(valueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DatetimeRequest[] newArray(int i) {
            return new DatetimeRequest[i];
        }
    }

    public DatetimeRequest(Boolean bool) {
        this.success = bool;
    }

    public static /* synthetic */ DatetimeRequest copy$default(DatetimeRequest datetimeRequest, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = datetimeRequest.success;
        }
        return datetimeRequest.copy(bool);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getSuccess() {
        return this.success;
    }

    public final DatetimeRequest copy(Boolean success) {
        return new DatetimeRequest(success);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DatetimeRequest) && Intrinsics.areEqual(this.success, ((DatetimeRequest) other).success);
    }

    public final Boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        Boolean bool = this.success;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final void setSuccess(Boolean bool) {
        this.success = bool;
    }

    public String toString() {
        return "DatetimeRequest(success=" + this.success + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Boolean bool = this.success;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            x5.v(dest, 1, bool);
        }
    }
}
