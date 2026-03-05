package com.gse.aulapp.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.x5;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, d2 = {"Lcom/gse/aulapp/model/response/SessionRouteQuestionResponse;", "Landroid/os/Parcelable;", "description", BuildConfig.FLAVOR, "answer", "level", "coordinates", "Lcom/gse/aulapp/model/response/SessionRouteCoordinatesResponse;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/gse/aulapp/model/response/SessionRouteCoordinatesResponse;)V", "getDescription", "()Ljava/lang/String;", "getAnswer", "getLevel", "getCoordinates", "()Lcom/gse/aulapp/model/response/SessionRouteCoordinatesResponse;", "component1", "component2", "component3", "component4", "copy", "describeContents", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SessionRouteQuestionResponse implements Parcelable {
    public static final Parcelable.Creator<SessionRouteQuestionResponse> CREATOR = new Creator();

    @SerializedName("answer")
    private final String answer;

    @SerializedName("coordinates")
    private final SessionRouteCoordinatesResponse coordinates;

    @SerializedName("description")
    private final String description;

    @SerializedName("level")
    private final String level;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SessionRouteQuestionResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SessionRouteQuestionResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SessionRouteQuestionResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : SessionRouteCoordinatesResponse.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SessionRouteQuestionResponse[] newArray(int i) {
            return new SessionRouteQuestionResponse[i];
        }
    }

    public SessionRouteQuestionResponse() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ SessionRouteQuestionResponse copy$default(SessionRouteQuestionResponse sessionRouteQuestionResponse, String str, String str2, String str3, SessionRouteCoordinatesResponse sessionRouteCoordinatesResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sessionRouteQuestionResponse.description;
        }
        if ((i & 2) != 0) {
            str2 = sessionRouteQuestionResponse.answer;
        }
        if ((i & 4) != 0) {
            str3 = sessionRouteQuestionResponse.level;
        }
        if ((i & 8) != 0) {
            sessionRouteCoordinatesResponse = sessionRouteQuestionResponse.coordinates;
        }
        return sessionRouteQuestionResponse.copy(str, str2, str3, sessionRouteCoordinatesResponse);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAnswer() {
        return this.answer;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLevel() {
        return this.level;
    }

    /* renamed from: component4, reason: from getter */
    public final SessionRouteCoordinatesResponse getCoordinates() {
        return this.coordinates;
    }

    public final SessionRouteQuestionResponse copy(String description, String answer, String level, SessionRouteCoordinatesResponse coordinates) {
        return new SessionRouteQuestionResponse(description, answer, level, coordinates);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionRouteQuestionResponse)) {
            return false;
        }
        SessionRouteQuestionResponse sessionRouteQuestionResponse = (SessionRouteQuestionResponse) other;
        return Intrinsics.areEqual(this.description, sessionRouteQuestionResponse.description) && Intrinsics.areEqual(this.answer, sessionRouteQuestionResponse.answer) && Intrinsics.areEqual(this.level, sessionRouteQuestionResponse.level) && Intrinsics.areEqual(this.coordinates, sessionRouteQuestionResponse.coordinates);
    }

    public int hashCode() {
        String str = this.description;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.answer;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.level;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        SessionRouteCoordinatesResponse sessionRouteCoordinatesResponse = this.coordinates;
        return hashCode3 + (sessionRouteCoordinatesResponse != null ? sessionRouteCoordinatesResponse.hashCode() : 0);
    }

    public String toString() {
        String str = this.description;
        String str2 = this.answer;
        String str3 = this.level;
        SessionRouteCoordinatesResponse sessionRouteCoordinatesResponse = this.coordinates;
        StringBuilder r = x5.r("SessionRouteQuestionResponse(description=", str, ", answer=", str2, ", level=");
        r.append(str3);
        r.append(", coordinates=");
        r.append(sessionRouteCoordinatesResponse);
        r.append(")");
        return r.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.description);
        dest.writeString(this.answer);
        dest.writeString(this.level);
        SessionRouteCoordinatesResponse sessionRouteCoordinatesResponse = this.coordinates;
        if (sessionRouteCoordinatesResponse == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            sessionRouteCoordinatesResponse.writeToParcel(dest, flags);
        }
    }

    public SessionRouteQuestionResponse(String str, String str2, String str3, SessionRouteCoordinatesResponse sessionRouteCoordinatesResponse) {
        this.description = str;
        this.answer = str2;
        this.level = str3;
        this.coordinates = sessionRouteCoordinatesResponse;
    }

    public /* synthetic */ SessionRouteQuestionResponse(String str, String str2, String str3, SessionRouteCoordinatesResponse sessionRouteCoordinatesResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : sessionRouteCoordinatesResponse);
    }
}
