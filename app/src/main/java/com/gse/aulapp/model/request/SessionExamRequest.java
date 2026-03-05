package com.gse.aulapp.model.request;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import defpackage.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/gse/aulapp/model/request/SessionExamRequest;", "Landroid/os/Parcelable;", "sessionID", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;)V", "getSessionID", "()Ljava/lang/String;", "component1", "copy", "describeContents", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SessionExamRequest implements Parcelable {
    public static final Parcelable.Creator<SessionExamRequest> CREATOR = new Creator();

    @SerializedName("sessionID")
    private final String sessionID;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SessionExamRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SessionExamRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SessionExamRequest(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SessionExamRequest[] newArray(int i) {
            return new SessionExamRequest[i];
        }
    }

    public SessionExamRequest(String sessionID) {
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        this.sessionID = sessionID;
    }

    public static /* synthetic */ SessionExamRequest copy$default(SessionExamRequest sessionExamRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sessionExamRequest.sessionID;
        }
        return sessionExamRequest.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSessionID() {
        return this.sessionID;
    }

    public final SessionExamRequest copy(String sessionID) {
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        return new SessionExamRequest(sessionID);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SessionExamRequest) && Intrinsics.areEqual(this.sessionID, ((SessionExamRequest) other).sessionID);
    }

    public int hashCode() {
        return this.sessionID.hashCode();
    }

    public String toString() {
        return a.m("SessionExamRequest(sessionID=", this.sessionID, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.sessionID);
    }
}
