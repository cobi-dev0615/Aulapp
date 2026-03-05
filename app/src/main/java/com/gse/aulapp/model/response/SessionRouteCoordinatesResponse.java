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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u001d"}, d2 = {"Lcom/gse/aulapp/model/response/SessionRouteCoordinatesResponse;", "Landroid/os/Parcelable;", "latitude", BuildConfig.FLAVOR, "longitude", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;)V", "getLatitude", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLongitude", "component1", "component2", "copy", "(Ljava/lang/Double;Ljava/lang/Double;)Lcom/gse/aulapp/model/response/SessionRouteCoordinatesResponse;", "describeContents", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", BuildConfig.FLAVOR, "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SessionRouteCoordinatesResponse implements Parcelable {
    public static final Parcelable.Creator<SessionRouteCoordinatesResponse> CREATOR = new Creator();

    @SerializedName("latitude")
    private final Double latitude;

    @SerializedName("longitude")
    private final Double longitude;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SessionRouteCoordinatesResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SessionRouteCoordinatesResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SessionRouteCoordinatesResponse(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SessionRouteCoordinatesResponse[] newArray(int i) {
            return new SessionRouteCoordinatesResponse[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SessionRouteCoordinatesResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SessionRouteCoordinatesResponse copy$default(SessionRouteCoordinatesResponse sessionRouteCoordinatesResponse, Double d, Double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = sessionRouteCoordinatesResponse.latitude;
        }
        if ((i & 2) != 0) {
            d2 = sessionRouteCoordinatesResponse.longitude;
        }
        return sessionRouteCoordinatesResponse.copy(d, d2);
    }

    /* renamed from: component1, reason: from getter */
    public final Double getLatitude() {
        return this.latitude;
    }

    /* renamed from: component2, reason: from getter */
    public final Double getLongitude() {
        return this.longitude;
    }

    public final SessionRouteCoordinatesResponse copy(Double latitude, Double longitude) {
        return new SessionRouteCoordinatesResponse(latitude, longitude);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionRouteCoordinatesResponse)) {
            return false;
        }
        SessionRouteCoordinatesResponse sessionRouteCoordinatesResponse = (SessionRouteCoordinatesResponse) other;
        return Intrinsics.areEqual((Object) this.latitude, (Object) sessionRouteCoordinatesResponse.latitude) && Intrinsics.areEqual((Object) this.longitude, (Object) sessionRouteCoordinatesResponse.longitude);
    }

    public int hashCode() {
        Double d = this.latitude;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.longitude;
        return hashCode + (d2 != null ? d2.hashCode() : 0);
    }

    public String toString() {
        return "SessionRouteCoordinatesResponse(latitude=" + this.latitude + ", longitude=" + this.longitude + ")";
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
    }

    public SessionRouteCoordinatesResponse(Double d, Double d2) {
        this.latitude = d;
        this.longitude = d2;
    }

    public /* synthetic */ SessionRouteCoordinatesResponse(Double d, Double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2);
    }
}
