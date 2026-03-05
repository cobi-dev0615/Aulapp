package com.gse.aulapp.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.q;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR&\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006!"}, d2 = {"Lcom/gse/aulapp/model/response/SessionInstructorObjectResponse;", "Landroid/os/Parcelable;", "date", BuildConfig.FLAVOR, "sessions", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/response/SessionResponse;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "getSessions", "()Ljava/util/List;", "setSessions", "(Ljava/util/List;)V", "component1", "component2", "copy", "describeContents", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SessionInstructorObjectResponse implements Parcelable {
    public static final Parcelable.Creator<SessionInstructorObjectResponse> CREATOR = new Creator();

    @SerializedName("date")
    @Expose
    private String date;

    @SerializedName("sessions")
    @Expose
    private List<SessionResponse> sessions;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SessionInstructorObjectResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SessionInstructorObjectResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = q.b(SessionResponse.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new SessionInstructorObjectResponse(readString, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SessionInstructorObjectResponse[] newArray(int i) {
            return new SessionInstructorObjectResponse[i];
        }
    }

    public SessionInstructorObjectResponse(String date, List<SessionResponse> list) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.date = date;
        this.sessions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SessionInstructorObjectResponse copy$default(SessionInstructorObjectResponse sessionInstructorObjectResponse, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sessionInstructorObjectResponse.date;
        }
        if ((i & 2) != 0) {
            list = sessionInstructorObjectResponse.sessions;
        }
        return sessionInstructorObjectResponse.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    public final List<SessionResponse> component2() {
        return this.sessions;
    }

    public final SessionInstructorObjectResponse copy(String date, List<SessionResponse> sessions) {
        Intrinsics.checkNotNullParameter(date, "date");
        return new SessionInstructorObjectResponse(date, sessions);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionInstructorObjectResponse)) {
            return false;
        }
        SessionInstructorObjectResponse sessionInstructorObjectResponse = (SessionInstructorObjectResponse) other;
        return Intrinsics.areEqual(this.date, sessionInstructorObjectResponse.date) && Intrinsics.areEqual(this.sessions, sessionInstructorObjectResponse.sessions);
    }

    public final String getDate() {
        return this.date;
    }

    public final List<SessionResponse> getSessions() {
        return this.sessions;
    }

    public int hashCode() {
        int hashCode = this.date.hashCode() * 31;
        List<SessionResponse> list = this.sessions;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final void setDate(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.date = str;
    }

    public final void setSessions(List<SessionResponse> list) {
        this.sessions = list;
    }

    public String toString() {
        return "SessionInstructorObjectResponse(date=" + this.date + ", sessions=" + this.sessions + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.date);
        List<SessionResponse> list = this.sessions;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<SessionResponse> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ SessionInstructorObjectResponse(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : list);
    }
}
