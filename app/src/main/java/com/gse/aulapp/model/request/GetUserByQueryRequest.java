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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0018"}, d2 = {"Lcom/gse/aulapp/model/request/GetUserByQueryRequest;", "Landroid/os/Parcelable;", "query", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;)V", "getQuery", "()Ljava/lang/String;", "setQuery", "component1", "copy", "describeContents", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class GetUserByQueryRequest implements Parcelable {
    public static final Parcelable.Creator<GetUserByQueryRequest> CREATOR = new Creator();

    @SerializedName("query")
    private String query;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GetUserByQueryRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GetUserByQueryRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GetUserByQueryRequest(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GetUserByQueryRequest[] newArray(int i) {
            return new GetUserByQueryRequest[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetUserByQueryRequest() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ GetUserByQueryRequest copy$default(GetUserByQueryRequest getUserByQueryRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getUserByQueryRequest.query;
        }
        return getUserByQueryRequest.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    public final GetUserByQueryRequest copy(String query) {
        return new GetUserByQueryRequest(query);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetUserByQueryRequest) && Intrinsics.areEqual(this.query, ((GetUserByQueryRequest) other).query);
    }

    public final String getQuery() {
        return this.query;
    }

    public int hashCode() {
        String str = this.query;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setQuery(String str) {
        this.query = str;
    }

    public String toString() {
        return a.m("GetUserByQueryRequest(query=", this.query, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.query);
    }

    public GetUserByQueryRequest(String str) {
        this.query = str;
    }

    public /* synthetic */ GetUserByQueryRequest(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
