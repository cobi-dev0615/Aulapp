package com.gse.aulapp.model.request;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0014R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/gse/aulapp/model/request/SessionPracticeSyncRequest;", "Landroid/os/Parcelable;", "session", "Lcom/gse/aulapp/model/request/SessionSyncRequest;", "assist", "Lcom/gse/aulapp/model/request/AssistSyncRequest;", "<init>", "(Lcom/gse/aulapp/model/request/SessionSyncRequest;Lcom/gse/aulapp/model/request/AssistSyncRequest;)V", "getSession", "()Lcom/gse/aulapp/model/request/SessionSyncRequest;", "setSession", "(Lcom/gse/aulapp/model/request/SessionSyncRequest;)V", "getAssist", "()Lcom/gse/aulapp/model/request/AssistSyncRequest;", "setAssist", "(Lcom/gse/aulapp/model/request/AssistSyncRequest;)V", "component1", "component2", "copy", "describeContents", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", BuildConfig.FLAVOR, "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SessionPracticeSyncRequest implements Parcelable {
    public static final Parcelable.Creator<SessionPracticeSyncRequest> CREATOR = new Creator();

    @SerializedName("assist")
    private AssistSyncRequest assist;

    @SerializedName("session")
    private SessionSyncRequest session;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SessionPracticeSyncRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SessionPracticeSyncRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SessionPracticeSyncRequest(parcel.readInt() == 0 ? null : SessionSyncRequest.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AssistSyncRequest.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SessionPracticeSyncRequest[] newArray(int i) {
            return new SessionPracticeSyncRequest[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SessionPracticeSyncRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SessionPracticeSyncRequest copy$default(SessionPracticeSyncRequest sessionPracticeSyncRequest, SessionSyncRequest sessionSyncRequest, AssistSyncRequest assistSyncRequest, int i, Object obj) {
        if ((i & 1) != 0) {
            sessionSyncRequest = sessionPracticeSyncRequest.session;
        }
        if ((i & 2) != 0) {
            assistSyncRequest = sessionPracticeSyncRequest.assist;
        }
        return sessionPracticeSyncRequest.copy(sessionSyncRequest, assistSyncRequest);
    }

    /* renamed from: component1, reason: from getter */
    public final SessionSyncRequest getSession() {
        return this.session;
    }

    /* renamed from: component2, reason: from getter */
    public final AssistSyncRequest getAssist() {
        return this.assist;
    }

    public final SessionPracticeSyncRequest copy(SessionSyncRequest session, AssistSyncRequest assist) {
        return new SessionPracticeSyncRequest(session, assist);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionPracticeSyncRequest)) {
            return false;
        }
        SessionPracticeSyncRequest sessionPracticeSyncRequest = (SessionPracticeSyncRequest) other;
        return Intrinsics.areEqual(this.session, sessionPracticeSyncRequest.session) && Intrinsics.areEqual(this.assist, sessionPracticeSyncRequest.assist);
    }

    public int hashCode() {
        SessionSyncRequest sessionSyncRequest = this.session;
        int hashCode = (sessionSyncRequest == null ? 0 : sessionSyncRequest.hashCode()) * 31;
        AssistSyncRequest assistSyncRequest = this.assist;
        return hashCode + (assistSyncRequest != null ? assistSyncRequest.hashCode() : 0);
    }

    public final void setAssist(AssistSyncRequest assistSyncRequest) {
        this.assist = assistSyncRequest;
    }

    public final void setSession(SessionSyncRequest sessionSyncRequest) {
        this.session = sessionSyncRequest;
    }

    public String toString() {
        return "SessionPracticeSyncRequest(session=" + this.session + ", assist=" + this.assist + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        SessionSyncRequest sessionSyncRequest = this.session;
        if (sessionSyncRequest == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            sessionSyncRequest.writeToParcel(dest, flags);
        }
        AssistSyncRequest assistSyncRequest = this.assist;
        if (assistSyncRequest == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            assistSyncRequest.writeToParcel(dest, flags);
        }
    }

    public SessionPracticeSyncRequest(SessionSyncRequest sessionSyncRequest, AssistSyncRequest assistSyncRequest) {
        this.session = sessionSyncRequest;
        this.assist = assistSyncRequest;
    }

    public /* synthetic */ SessionPracticeSyncRequest(SessionSyncRequest sessionSyncRequest, AssistSyncRequest assistSyncRequest, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new SessionSyncRequest(null, null, null, null, null, null, null, null, null, null, 1023, null) : sessionSyncRequest, (i & 2) != 0 ? new AssistSyncRequest(null, null, null, 7, null) : assistSyncRequest);
    }
}
