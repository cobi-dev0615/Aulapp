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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000b¨\u0006#"}, d2 = {"Lcom/gse/aulapp/model/response/ValidationsResponse;", "Landroid/os/Parcelable;", "instructor", BuildConfig.FLAVOR, "apprentice", "vehicle", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getInstructor", "()Ljava/lang/Boolean;", "setInstructor", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getApprentice", "setApprentice", "getVehicle", "setVehicle", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/gse/aulapp/model/response/ValidationsResponse;", "describeContents", BuildConfig.FLAVOR, "equals", "other", BuildConfig.FLAVOR, "hashCode", "toString", BuildConfig.FLAVOR, "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ValidationsResponse implements Parcelable {
    public static final Parcelable.Creator<ValidationsResponse> CREATOR = new Creator();

    @SerializedName("apprentice")
    private Boolean apprentice;

    @SerializedName("instructor")
    private Boolean instructor;

    @SerializedName("vehicle")
    private Boolean vehicle;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ValidationsResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ValidationsResponse createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ValidationsResponse(valueOf, valueOf2, bool);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ValidationsResponse[] newArray(int i) {
            return new ValidationsResponse[i];
        }
    }

    public ValidationsResponse() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ValidationsResponse copy$default(ValidationsResponse validationsResponse, Boolean bool, Boolean bool2, Boolean bool3, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = validationsResponse.instructor;
        }
        if ((i & 2) != 0) {
            bool2 = validationsResponse.apprentice;
        }
        if ((i & 4) != 0) {
            bool3 = validationsResponse.vehicle;
        }
        return validationsResponse.copy(bool, bool2, bool3);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getInstructor() {
        return this.instructor;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getApprentice() {
        return this.apprentice;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getVehicle() {
        return this.vehicle;
    }

    public final ValidationsResponse copy(Boolean instructor, Boolean apprentice, Boolean vehicle) {
        return new ValidationsResponse(instructor, apprentice, vehicle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValidationsResponse)) {
            return false;
        }
        ValidationsResponse validationsResponse = (ValidationsResponse) other;
        return Intrinsics.areEqual(this.instructor, validationsResponse.instructor) && Intrinsics.areEqual(this.apprentice, validationsResponse.apprentice) && Intrinsics.areEqual(this.vehicle, validationsResponse.vehicle);
    }

    public final Boolean getApprentice() {
        return this.apprentice;
    }

    public final Boolean getInstructor() {
        return this.instructor;
    }

    public final Boolean getVehicle() {
        return this.vehicle;
    }

    public int hashCode() {
        Boolean bool = this.instructor;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.apprentice;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.vehicle;
        return hashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final void setApprentice(Boolean bool) {
        this.apprentice = bool;
    }

    public final void setInstructor(Boolean bool) {
        this.instructor = bool;
    }

    public final void setVehicle(Boolean bool) {
        this.vehicle = bool;
    }

    public String toString() {
        return "ValidationsResponse(instructor=" + this.instructor + ", apprentice=" + this.apprentice + ", vehicle=" + this.vehicle + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Boolean bool = this.instructor;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            x5.v(dest, 1, bool);
        }
        Boolean bool2 = this.apprentice;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            x5.v(dest, 1, bool2);
        }
        Boolean bool3 = this.vehicle;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            x5.v(dest, 1, bool3);
        }
    }

    public ValidationsResponse(Boolean bool, Boolean bool2, Boolean bool3) {
        this.instructor = bool;
        this.apprentice = bool2;
        this.vehicle = bool3;
    }

    public /* synthetic */ ValidationsResponse(Boolean bool, Boolean bool2, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3);
    }
}
