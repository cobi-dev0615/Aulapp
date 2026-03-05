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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0015R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/gse/aulapp/model/response/StatusAppointmentResponse;", "Lcom/gse/aulapp/model/response/GeneralResponse;", "success", BuildConfig.FLAVOR, "message", BuildConfig.FLAVOR, "code", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getSuccess", "()Ljava/lang/Boolean;", "setSuccess", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getCode", "setCode", "describeContents", BuildConfig.FLAVOR, "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StatusAppointmentResponse extends GeneralResponse {
    public static final Parcelable.Creator<StatusAppointmentResponse> CREATOR = new Creator();

    @SerializedName("code")
    private String code;

    @SerializedName("message")
    private String message;

    @SerializedName("success")
    private Boolean success;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StatusAppointmentResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StatusAppointmentResponse createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new StatusAppointmentResponse(valueOf, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StatusAppointmentResponse[] newArray(int i) {
            return new StatusAppointmentResponse[i];
        }
    }

    public StatusAppointmentResponse() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.gse.aulapp.model.response.GeneralResponse
    public String getCode() {
        return this.code;
    }

    @Override // com.gse.aulapp.model.response.GeneralResponse
    public String getMessage() {
        return this.message;
    }

    @Override // com.gse.aulapp.model.response.GeneralResponse
    public Boolean getSuccess() {
        return this.success;
    }

    @Override // com.gse.aulapp.model.response.GeneralResponse
    public void setCode(String str) {
        this.code = str;
    }

    @Override // com.gse.aulapp.model.response.GeneralResponse
    public void setMessage(String str) {
        this.message = str;
    }

    @Override // com.gse.aulapp.model.response.GeneralResponse
    public void setSuccess(Boolean bool) {
        this.success = bool;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Boolean bool = this.success;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            x5.v(dest, 1, bool);
        }
        dest.writeString(this.message);
        dest.writeString(this.code);
    }

    public /* synthetic */ StatusAppointmentResponse(Boolean bool, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }

    public StatusAppointmentResponse(Boolean bool, String str, String str2) {
        super(bool, str, null, str2);
        this.success = bool;
        this.message = str;
        this.code = str2;
    }
}
