package com.gse.aulapp.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006$"}, d2 = {"Lcom/gse/aulapp/model/response/SessionRoutePointResponse;", "Landroid/os/Parcelable;", "latitude", BuildConfig.FLAVOR, "longitude", "time", BuildConfig.FLAVOR, "_id", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "getLatitude", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLongitude", "getTime", "()Ljava/lang/String;", "get_id", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)Lcom/gse/aulapp/model/response/SessionRoutePointResponse;", "describeContents", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SessionRoutePointResponse implements Parcelable {
    public static final Parcelable.Creator<SessionRoutePointResponse> CREATOR = new Creator();

    @SerializedName("_id")
    private final String _id;

    @SerializedName("latitude")
    private final Double latitude;

    @SerializedName("longitude")
    private final Double longitude;

    @SerializedName("time")
    private final String time;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SessionRoutePointResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SessionRoutePointResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SessionRoutePointResponse(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SessionRoutePointResponse[] newArray(int i) {
            return new SessionRoutePointResponse[i];
        }
    }

    public SessionRoutePointResponse() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ SessionRoutePointResponse copy$default(SessionRoutePointResponse sessionRoutePointResponse, Double d, Double d2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = sessionRoutePointResponse.latitude;
        }
        if ((i & 2) != 0) {
            d2 = sessionRoutePointResponse.longitude;
        }
        if ((i & 4) != 0) {
            str = sessionRoutePointResponse.time;
        }
        if ((i & 8) != 0) {
            str2 = sessionRoutePointResponse._id;
        }
        return sessionRoutePointResponse.copy(d, d2, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final Double getLatitude() {
        return this.latitude;
    }

    /* renamed from: component2, reason: from getter */
    public final Double getLongitude() {
        return this.longitude;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    /* renamed from: component4, reason: from getter */
    public final String get_id() {
        return this._id;
    }

    public final SessionRoutePointResponse copy(Double latitude, Double longitude, String time, String _id) {
        return new SessionRoutePointResponse(latitude, longitude, time, _id);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionRoutePointResponse)) {
            return false;
        }
        SessionRoutePointResponse sessionRoutePointResponse = (SessionRoutePointResponse) other;
        return Intrinsics.areEqual((Object) this.latitude, (Object) sessionRoutePointResponse.latitude) && Intrinsics.areEqual((Object) this.longitude, (Object) sessionRoutePointResponse.longitude) && Intrinsics.areEqual(this.time, sessionRoutePointResponse.time) && Intrinsics.areEqual(this._id, sessionRoutePointResponse._id);
    }

    public int hashCode() {
        Double d = this.latitude;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.longitude;
        int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str = this.time;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this._id;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "SessionRoutePointResponse(latitude=" + this.latitude + ", longitude=" + this.longitude + ", time=" + this.time + ", _id=" + this._id + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Double d = this.latitude;
        if (d == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d.doubleValue());
        }
        Double d2 = this.longitude;
        if (d2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d2.doubleValue());
        }
        dest.writeString(this.time);
        dest.writeString(this._id);
    }

    public SessionRoutePointResponse(Double d, Double d2, String str, String str2) {
        this.latitude = d;
        this.longitude = d2;
        this.time = str;
        this._id = str2;
    }

    public /* synthetic */ SessionRoutePointResponse(Double d, Double d2, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }
}
