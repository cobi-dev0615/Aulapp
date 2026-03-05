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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001bR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006("}, d2 = {"Lcom/gse/aulapp/model/request/SessionPracticeExamSyncRequest;", "Landroid/os/Parcelable;", "session", "Lcom/gse/aulapp/model/request/SessionSyncRequest;", "assist", "Lcom/gse/aulapp/model/request/AssistSyncRequest;", "exam", "Lcom/gse/aulapp/model/request/PracticeExamRequest;", "<init>", "(Lcom/gse/aulapp/model/request/SessionSyncRequest;Lcom/gse/aulapp/model/request/AssistSyncRequest;Lcom/gse/aulapp/model/request/PracticeExamRequest;)V", "getSession", "()Lcom/gse/aulapp/model/request/SessionSyncRequest;", "setSession", "(Lcom/gse/aulapp/model/request/SessionSyncRequest;)V", "getAssist", "()Lcom/gse/aulapp/model/request/AssistSyncRequest;", "setAssist", "(Lcom/gse/aulapp/model/request/AssistSyncRequest;)V", "getExam", "()Lcom/gse/aulapp/model/request/PracticeExamRequest;", "setExam", "(Lcom/gse/aulapp/model/request/PracticeExamRequest;)V", "component1", "component2", "component3", "copy", "describeContents", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", BuildConfig.FLAVOR, "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SessionPracticeExamSyncRequest implements Parcelable {
    public static final Parcelable.Creator<SessionPracticeExamSyncRequest> CREATOR = new Creator();

    @SerializedName("assist")
    private AssistSyncRequest assist;

    @SerializedName("exam")
    private PracticeExamRequest exam;

    @SerializedName("session")
    private SessionSyncRequest session;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SessionPracticeExamSyncRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SessionPracticeExamSyncRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SessionPracticeExamSyncRequest(parcel.readInt() == 0 ? null : SessionSyncRequest.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AssistSyncRequest.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PracticeExamRequest.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SessionPracticeExamSyncRequest[] newArray(int i) {
            return new SessionPracticeExamSyncRequest[i];
        }
    }

    public SessionPracticeExamSyncRequest() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ SessionPracticeExamSyncRequest copy$default(SessionPracticeExamSyncRequest sessionPracticeExamSyncRequest, SessionSyncRequest sessionSyncRequest, AssistSyncRequest assistSyncRequest, PracticeExamRequest practiceExamRequest, int i, Object obj) {
        if ((i & 1) != 0) {
            sessionSyncRequest = sessionPracticeExamSyncRequest.session;
        }
        if ((i & 2) != 0) {
            assistSyncRequest = sessionPracticeExamSyncRequest.assist;
        }
        if ((i & 4) != 0) {
            practiceExamRequest = sessionPracticeExamSyncRequest.exam;
        }
        return sessionPracticeExamSyncRequest.copy(sessionSyncRequest, assistSyncRequest, practiceExamRequest);
    }

    /* renamed from: component1, reason: from getter */
    public final SessionSyncRequest getSession() {
        return this.session;
    }

    /* renamed from: component2, reason: from getter */
    public final AssistSyncRequest getAssist() {
        return this.assist;
    }

    /* renamed from: component3, reason: from getter */
    public final PracticeExamRequest getExam() {
        return this.exam;
    }

    public final SessionPracticeExamSyncRequest copy(SessionSyncRequest session, AssistSyncRequest assist, PracticeExamRequest exam) {
        return new SessionPracticeExamSyncRequest(session, assist, exam);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionPracticeExamSyncRequest)) {
            return false;
        }
        SessionPracticeExamSyncRequest sessionPracticeExamSyncRequest = (SessionPracticeExamSyncRequest) other;
        return Intrinsics.areEqual(this.session, sessionPracticeExamSyncRequest.session) && Intrinsics.areEqual(this.assist, sessionPracticeExamSyncRequest.assist) && Intrinsics.areEqual(this.exam, sessionPracticeExamSyncRequest.exam);
    }

    public final AssistSyncRequest getAssist() {
        return this.assist;
    }

    public final PracticeExamRequest getExam() {
        return this.exam;
    }

    public final SessionSyncRequest getSession() {
        return this.session;
    }

    public int hashCode() {
        SessionSyncRequest sessionSyncRequest = this.session;
        int hashCode = (sessionSyncRequest == null ? 0 : sessionSyncRequest.hashCode()) * 31;
        AssistSyncRequest assistSyncRequest = this.assist;
        int hashCode2 = (hashCode + (assistSyncRequest == null ? 0 : assistSyncRequest.hashCode())) * 31;
        PracticeExamRequest practiceExamRequest = this.exam;
        return hashCode2 + (practiceExamRequest != null ? practiceExamRequest.hashCode() : 0);
    }

    public final void setAssist(AssistSyncRequest assistSyncRequest) {
        this.assist = assistSyncRequest;
    }

    public final void setExam(PracticeExamRequest practiceExamRequest) {
        this.exam = practiceExamRequest;
    }

    public final void setSession(SessionSyncRequest sessionSyncRequest) {
        this.session = sessionSyncRequest;
    }

    public String toString() {
        return "SessionPracticeExamSyncRequest(session=" + this.session + ", assist=" + this.assist + ", exam=" + this.exam + ")";
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
        PracticeExamRequest practiceExamRequest = this.exam;
        if (practiceExamRequest == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            practiceExamRequest.writeToParcel(dest, flags);
        }
    }

    public SessionPracticeExamSyncRequest(SessionSyncRequest sessionSyncRequest, AssistSyncRequest assistSyncRequest, PracticeExamRequest practiceExamRequest) {
        this.session = sessionSyncRequest;
        this.assist = assistSyncRequest;
        this.exam = practiceExamRequest;
    }

    public /* synthetic */ SessionPracticeExamSyncRequest(SessionSyncRequest sessionSyncRequest, AssistSyncRequest assistSyncRequest, PracticeExamRequest practiceExamRequest, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : sessionSyncRequest, (i & 2) != 0 ? null : assistSyncRequest, (i & 4) != 0 ? null : practiceExamRequest);
    }
}
