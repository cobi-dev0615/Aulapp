package com.gse.aulapp.model.request;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.q;
import co.ceduladigital.sdk.x5;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006!"}, d2 = {"Lcom/gse/aulapp/model/request/GetEnrollmentInformationRequest;", "Landroid/os/Parcelable;", "valueSearch", BuildConfig.FLAVOR, "type", "role", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getValueSearch", "()Ljava/lang/String;", "setValueSearch", "(Ljava/lang/String;)V", "getType", "setType", "getRole", "setRole", "component1", "component2", "component3", "copy", "describeContents", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class GetEnrollmentInformationRequest implements Parcelable {
    public static final Parcelable.Creator<GetEnrollmentInformationRequest> CREATOR = new Creator();

    @SerializedName("role")
    private String role;

    @SerializedName("type")
    private String type;

    @SerializedName("valueSearch")
    private String valueSearch;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GetEnrollmentInformationRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GetEnrollmentInformationRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GetEnrollmentInformationRequest(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GetEnrollmentInformationRequest[] newArray(int i) {
            return new GetEnrollmentInformationRequest[i];
        }
    }

    public GetEnrollmentInformationRequest(String valueSearch, String type, String role) {
        Intrinsics.checkNotNullParameter(valueSearch, "valueSearch");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(role, "role");
        this.valueSearch = valueSearch;
        this.type = type;
        this.role = role;
    }

    public static /* synthetic */ GetEnrollmentInformationRequest copy$default(GetEnrollmentInformationRequest getEnrollmentInformationRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getEnrollmentInformationRequest.valueSearch;
        }
        if ((i & 2) != 0) {
            str2 = getEnrollmentInformationRequest.type;
        }
        if ((i & 4) != 0) {
            str3 = getEnrollmentInformationRequest.role;
        }
        return getEnrollmentInformationRequest.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getValueSearch() {
        return this.valueSearch;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    public final GetEnrollmentInformationRequest copy(String valueSearch, String type, String role) {
        Intrinsics.checkNotNullParameter(valueSearch, "valueSearch");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(role, "role");
        return new GetEnrollmentInformationRequest(valueSearch, type, role);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetEnrollmentInformationRequest)) {
            return false;
        }
        GetEnrollmentInformationRequest getEnrollmentInformationRequest = (GetEnrollmentInformationRequest) other;
        return Intrinsics.areEqual(this.valueSearch, getEnrollmentInformationRequest.valueSearch) && Intrinsics.areEqual(this.type, getEnrollmentInformationRequest.type) && Intrinsics.areEqual(this.role, getEnrollmentInformationRequest.role);
    }

    public final String getRole() {
        return this.role;
    }

    public final String getType() {
        return this.type;
    }

    public final String getValueSearch() {
        return this.valueSearch;
    }

    public int hashCode() {
        return this.role.hashCode() + x5.d(this.type, this.valueSearch.hashCode() * 31, 31);
    }

    public final void setRole(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.role = str;
    }

    public final void setType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    public final void setValueSearch(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.valueSearch = str;
    }

    public String toString() {
        return q.j(this.role, ")", x5.r("GetEnrollmentInformationRequest(valueSearch=", this.valueSearch, ", type=", this.type, ", role="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.valueSearch);
        dest.writeString(this.type);
        dest.writeString(this.role);
    }
}
