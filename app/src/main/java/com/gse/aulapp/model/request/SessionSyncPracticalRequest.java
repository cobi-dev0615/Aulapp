package com.gse.aulapp.model.request;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import defpackage.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0018"}, d2 = {"Lcom/gse/aulapp/model/request/SessionSyncPracticalRequest;", "Landroid/os/Parcelable;", "dataID", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;)V", "getDataID", "()Ljava/lang/String;", "setDataID", "component1", "copy", "describeContents", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SessionSyncPracticalRequest implements Parcelable {
    public static final Parcelable.Creator<SessionSyncPracticalRequest> CREATOR = new Creator();

    @SerializedName("dataID")
    private String dataID;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SessionSyncPracticalRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SessionSyncPracticalRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SessionSyncPracticalRequest(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SessionSyncPracticalRequest[] newArray(int i) {
            return new SessionSyncPracticalRequest[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SessionSyncPracticalRequest() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SessionSyncPracticalRequest copy$default(SessionSyncPracticalRequest sessionSyncPracticalRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sessionSyncPracticalRequest.dataID;
        }
        return sessionSyncPracticalRequest.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDataID() {
        return this.dataID;
    }

    public final SessionSyncPracticalRequest copy(String dataID) {
        return new SessionSyncPracticalRequest(dataID);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SessionSyncPracticalRequest) && Intrinsics.areEqual(this.dataID, ((SessionSyncPracticalRequest) other).dataID);
    }

    public int hashCode() {
        String str = this.dataID;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setDataID(String str) {
        this.dataID = str;
    }

    public String toString() {
        return a.m("SessionSyncPracticalRequest(dataID=", this.dataID, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.dataID);
    }

    public SessionSyncPracticalRequest(String str) {
        this.dataID = str;
    }

    public /* synthetic */ SessionSyncPracticalRequest(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
