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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0006\u0010\u0016\u001a\u00020\u0003J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0003R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000b¨\u0006#"}, d2 = {"Lcom/gse/aulapp/model/response/ConfigResponse;", "Landroid/os/Parcelable;", "averagePercentage", BuildConfig.FLAVOR, "lowPercentage", "approvedPercentage", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getAveragePercentage", "()Ljava/lang/Integer;", "setAveragePercentage", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getLowPercentage", "setLowPercentage", "getApprovedPercentage", "setApprovedPercentage", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/gse/aulapp/model/response/ConfigResponse;", "describeContents", "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", BuildConfig.FLAVOR, "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ConfigResponse implements Parcelable {
    public static final Parcelable.Creator<ConfigResponse> CREATOR = new Creator();

    @SerializedName("approvedPercentage")
    private Integer approvedPercentage;

    @SerializedName("averagePercentage")
    private Integer averagePercentage;

    @SerializedName("lowPercentage")
    private Integer lowPercentage;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ConfigResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConfigResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConfigResponse(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConfigResponse[] newArray(int i) {
            return new ConfigResponse[i];
        }
    }

    public ConfigResponse() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ConfigResponse copy$default(ConfigResponse configResponse, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = configResponse.averagePercentage;
        }
        if ((i & 2) != 0) {
            num2 = configResponse.lowPercentage;
        }
        if ((i & 4) != 0) {
            num3 = configResponse.approvedPercentage;
        }
        return configResponse.copy(num, num2, num3);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getAveragePercentage() {
        return this.averagePercentage;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getLowPercentage() {
        return this.lowPercentage;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getApprovedPercentage() {
        return this.approvedPercentage;
    }

    public final ConfigResponse copy(Integer averagePercentage, Integer lowPercentage, Integer approvedPercentage) {
        return new ConfigResponse(averagePercentage, lowPercentage, approvedPercentage);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigResponse)) {
            return false;
        }
        ConfigResponse configResponse = (ConfigResponse) other;
        return Intrinsics.areEqual(this.averagePercentage, configResponse.averagePercentage) && Intrinsics.areEqual(this.lowPercentage, configResponse.lowPercentage) && Intrinsics.areEqual(this.approvedPercentage, configResponse.approvedPercentage);
    }

    public final Integer getApprovedPercentage() {
        return this.approvedPercentage;
    }

    public final Integer getAveragePercentage() {
        return this.averagePercentage;
    }

    public final Integer getLowPercentage() {
        return this.lowPercentage;
    }

    public int hashCode() {
        Integer num = this.averagePercentage;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.lowPercentage;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.approvedPercentage;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final void setApprovedPercentage(Integer num) {
        this.approvedPercentage = num;
    }

    public final void setAveragePercentage(Integer num) {
        this.averagePercentage = num;
    }

    public final void setLowPercentage(Integer num) {
        this.lowPercentage = num;
    }

    public String toString() {
        return "ConfigResponse(averagePercentage=" + this.averagePercentage + ", lowPercentage=" + this.lowPercentage + ", approvedPercentage=" + this.approvedPercentage + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Integer num = this.averagePercentage;
        if (num == null) {
            dest.writeInt(0);
        } else {
            x5.w(dest, 1, num);
        }
        Integer num2 = this.lowPercentage;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            x5.w(dest, 1, num2);
        }
        Integer num3 = this.approvedPercentage;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            x5.w(dest, 1, num3);
        }
    }

    public ConfigResponse(Integer num, Integer num2, Integer num3) {
        this.averagePercentage = num;
        this.lowPercentage = num2;
        this.approvedPercentage = num3;
    }

    public /* synthetic */ ConfigResponse(Integer num, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3);
    }
}
