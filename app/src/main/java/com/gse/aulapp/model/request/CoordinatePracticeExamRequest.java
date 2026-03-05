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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u000e\u001a\u00020\u0003J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/gse/aulapp/model/request/CoordinatePracticeExamRequest;", "Landroid/os/Parcelable;", "longitude", BuildConfig.FLAVOR, "latitude", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getLongitude", "()Ljava/lang/Integer;", "setLongitude", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getLatitude", "setLatitude", "describeContents", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CoordinatePracticeExamRequest implements Parcelable {
    public static final Parcelable.Creator<CoordinatePracticeExamRequest> CREATOR = new Creator();

    @SerializedName("latitude")
    private Integer latitude;

    @SerializedName("longitude")
    private Integer longitude;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CoordinatePracticeExamRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoordinatePracticeExamRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CoordinatePracticeExamRequest(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoordinatePracticeExamRequest[] newArray(int i) {
            return new CoordinatePracticeExamRequest[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CoordinatePracticeExamRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer getLatitude() {
        return this.latitude;
    }

    public final Integer getLongitude() {
        return this.longitude;
    }

    public final void setLatitude(Integer num) {
        this.latitude = num;
    }

    public final void setLongitude(Integer num) {
        this.longitude = num;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Integer num = this.longitude;
        if (num == null) {
            dest.writeInt(0);
        } else {
            x5.w(dest, 1, num);
        }
        Integer num2 = this.latitude;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            x5.w(dest, 1, num2);
        }
    }

    public CoordinatePracticeExamRequest(Integer num, Integer num2) {
        this.longitude = num;
        this.latitude = num2;
    }

    public /* synthetic */ CoordinatePracticeExamRequest(Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
