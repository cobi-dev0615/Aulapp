package com.gse.aulapp.model.request;

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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006%"}, d2 = {"Lcom/gse/aulapp/model/request/FallBackRequest;", "Landroid/os/Parcelable;", "action", BuildConfig.FLAVOR, "sessionID", "userID", "photo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "getSessionID", "setSessionID", "getUserID", "setUserID", "getPhoto", "setPhoto", "component1", "component2", "component3", "component4", "copy", "describeContents", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FallBackRequest implements Parcelable {
    public static final Parcelable.Creator<FallBackRequest> CREATOR = new Creator();

    @SerializedName("action")
    private String action;

    @SerializedName("photo")
    private String photo;

    @SerializedName("sessionID")
    private String sessionID;

    @SerializedName("userID")
    private String userID;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FallBackRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FallBackRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FallBackRequest(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FallBackRequest[] newArray(int i) {
            return new FallBackRequest[i];
        }
    }

    public FallBackRequest() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ FallBackRequest copy$default(FallBackRequest fallBackRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fallBackRequest.action;
        }
        if ((i & 2) != 0) {
            str2 = fallBackRequest.sessionID;
        }
        if ((i & 4) != 0) {
            str3 = fallBackRequest.userID;
        }
        if ((i & 8) != 0) {
            str4 = fallBackRequest.photo;
        }
        return fallBackRequest.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSessionID() {
        return this.sessionID;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUserID() {
        return this.userID;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPhoto() {
        return this.photo;
    }

    public final FallBackRequest copy(String action, String sessionID, String userID, String photo) {
        return new FallBackRequest(action, sessionID, userID, photo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FallBackRequest)) {
            return false;
        }
        FallBackRequest fallBackRequest = (FallBackRequest) other;
        return Intrinsics.areEqual(this.action, fallBackRequest.action) && Intrinsics.areEqual(this.sessionID, fallBackRequest.sessionID) && Intrinsics.areEqual(this.userID, fallBackRequest.userID) && Intrinsics.areEqual(this.photo, fallBackRequest.photo);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getPhoto() {
        return this.photo;
    }

    public final String getSessionID() {
        return this.sessionID;
    }

    public final String getUserID() {
        return this.userID;
    }

    public int hashCode() {
        String str = this.action;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sessionID;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userID;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.photo;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setAction(String str) {
        this.action = str;
    }

    public final void setPhoto(String str) {
        this.photo = str;
    }

    public final void setSessionID(String str) {
        this.sessionID = str;
    }

    public final void setUserID(String str) {
        this.userID = str;
    }

    public String toString() {
        String str = this.action;
        String str2 = this.sessionID;
        String str3 = this.userID;
        String str4 = this.photo;
        StringBuilder r = x5.r("FallBackRequest(action=", str, ", sessionID=", str2, ", userID=");
        r.append(str3);
        r.append(", photo=");
        r.append(str4);
        r.append(")");
        return r.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.action);
        dest.writeString(this.sessionID);
        dest.writeString(this.userID);
        dest.writeString(this.photo);
    }

    public FallBackRequest(String str, String str2, String str3, String str4) {
        this.action = str;
        this.sessionID = str2;
        this.userID = str3;
        this.photo = str4;
    }

    public /* synthetic */ FallBackRequest(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
