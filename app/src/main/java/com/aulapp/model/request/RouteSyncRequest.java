package com.gse.aulapp.model.request;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.q;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J2\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0006HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006&"}, d2 = {"Lcom/gse/aulapp/model/request/RouteSyncRequest;", "Landroid/os/Parcelable;", "latitude", BuildConfig.FLAVOR, "longitude", "time", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)V", "getLatitude", "()Ljava/lang/Double;", "setLatitude", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getLongitude", "setLongitude", "getTime", "()Ljava/lang/String;", "setTime", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)Lcom/gse/aulapp/model/request/RouteSyncRequest;", "describeContents", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RouteSyncRequest implements Parcelable {
    public static final Parcelable.Creator<RouteSyncRequest> CREATOR = new Creator();

    @SerializedName("latitude")
    private Double latitude;

    @SerializedName("longitude")
    private Double longitude;

    @SerializedName("time")
    private String time;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RouteSyncRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RouteSyncRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RouteSyncRequest(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RouteSyncRequest[] newArray(int i) {
            return new RouteSyncRequest[i];
        }
    }

    public RouteSyncRequest() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ RouteSyncRequest copy$default(RouteSyncRequest routeSyncRequest, Double d, Double d2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d = routeSyncRequest.latitude;
        }
        if ((i & 2) != 0) {
            d2 = routeSyncRequest.longitude;
        }
        if ((i & 4) != 0) {
            str = routeSyncRequest.time;
        }
        return routeSyncRequest.copy(d, d2, str);
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

    public final RouteSyncRequest copy(Double latitude, Double longitude, String time) {
        return new RouteSyncRequest(latitude, longitude, time);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RouteSyncRequest)) {
            return false;
        }
        RouteSyncRequest routeSyncRequest = (RouteSyncRequest) other;
        return Intrinsics.areEqual((Object) this.latitude, (Object) routeSyncRequest.latitude) && Intrinsics.areEqual((Object) this.longitude, (Object) routeSyncRequest.longitude) && Intrinsics.areEqual(this.time, routeSyncRequest.time);
    }

    public final Double getLatitude() {
        return this.latitude;
    }

    public final Double getLongitude() {
        return this.longitude;
    }

    public final String getTime() {
        return this.time;
    }

    public int hashCode() {
        Double d = this.latitude;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.longitude;
        int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str = this.time;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final void setLatitude(Double d) {
        this.latitude = d;
    }

    public final void setLongitude(Double d) {
        this.longitude = d;
    }

    public final void setTime(String str) {
        this.time = str;
    }

    public String toString() {
        Double d = this.latitude;
        Double d2 = this.longitude;
        String str = this.time;
        StringBuilder sb = new StringBuilder("RouteSyncRequest(latitude=");
        sb.append(d);
        sb.append(", longitude=");
        sb.append(d2);
        sb.append(", time=");
        return q.j(str, ")", sb);
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
    }

    public RouteSyncRequest(Double d, Double d2, String str) {
        this.latitude = d;
        this.longitude = d2;
        this.time = str;
    }

    public /* synthetic */ RouteSyncRequest(Double d, Double d2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2, (i & 4) != 0 ? null : str);
    }
}
