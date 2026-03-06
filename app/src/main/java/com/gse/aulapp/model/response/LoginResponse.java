package com.gse.aulapp.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.q;
import co.ceduladigital.sdk.x5;
import com.google.gson.annotations.SerializedName;
import com.gse.aulapp.io.model.response.GeneralResponseDecrypt;
import com.gse.aulapp.model.dto.CenterDto;
import com.gse.aulapp.model.dto.DataLoginDto;
import com.gse.aulapp.model.dto.FourFingersIdenty;
import com.karumi.dexter.BuildConfig;
import defpackage.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00010BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u001d\u001a\u00020\u0005H\u0016J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003JJ\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010$J\u0006\u0010%\u001a\u00020\u0003J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0003R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014¨\u00061"}, d2 = {"Lcom/gse/aulapp/model/response/LoginResponse;", "Lcom/gse/aulapp/io/model/response/GeneralResponseDecrypt;", "statusCode", BuildConfig.FLAVOR, "statusMessage", BuildConfig.FLAVOR, "generalMessage", "result", "Lcom/gse/aulapp/model/response/LoginResponse$Result;", "url", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/gse/aulapp/model/response/LoginResponse$Result;Ljava/lang/String;)V", "getStatusCode", "()Ljava/lang/Integer;", "setStatusCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getStatusMessage", "()Ljava/lang/String;", "setStatusMessage", "(Ljava/lang/String;)V", "getGeneralMessage", "setGeneralMessage", "getResult", "()Lcom/gse/aulapp/model/response/LoginResponse$Result;", "setResult", "(Lcom/gse/aulapp/model/response/LoginResponse$Result;)V", "getUrl", "setUrl", "toString", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/gse/aulapp/model/response/LoginResponse$Result;Ljava/lang/String;)Lcom/gse/aulapp/model/response/LoginResponse;", "describeContents", "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "Result", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class LoginResponse extends GeneralResponseDecrypt {
    public static final Parcelable.Creator<LoginResponse> CREATOR = new Creator();

    @SerializedName("message")
    private String generalMessage;

    @SerializedName("result")
    private Result result;

    @SerializedName("statusCode")
    private Integer statusCode;

    @SerializedName("statusMessage")
    private String statusMessage;

    @SerializedName("url")
    private String url;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LoginResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LoginResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LoginResponse(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Result.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LoginResponse[] newArray(int i) {
            return new LoginResponse[i];
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÕ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010&J\u000b\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010C\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010E\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0011\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jà\u0001\u0010N\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010OJ\u0006\u0010P\u001a\u00020\u0007J\u0013\u0010Q\u001a\u00020\u00032\b\u0010R\u001a\u0004\u0018\u00010SHÖ\u0003J\t\u0010T\u001a\u00020\u0007HÖ\u0001J\t\u0010U\u001a\u00020\u0005HÖ\u0001J\u0016\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020\u0007R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R \u0010\b\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\"\"\u0004\b+\u0010$R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\"R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b-\u0010\u001dR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\"\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b0\u0010\u001d\"\u0004\b1\u0010\u001fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\"R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\"R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\"R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\"R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\"R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\"R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\"¨\u0006["}, d2 = {"Lcom/gse/aulapp/model/response/LoginResponse$Result;", "Lcom/gse/aulapp/model/response/GeneralResponse;", "success", BuildConfig.FLAVOR, "message", BuildConfig.FLAVOR, "status", BuildConfig.FLAVOR, "code", "token", "useLiveness", "data", "Lcom/gse/aulapp/model/dto/DataLoginDto;", "fullEnrollment", "userEmail", "documentNumber", "userID", "fraudInformationID", "biometrixInformationID", "fourFingersIdentyID", "Lcom/gse/aulapp/model/dto/FourFingersIdenty;", "centerList", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/dto/CenterDto;", "centerID", "date", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/gse/aulapp/model/dto/DataLoginDto;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/gse/aulapp/model/dto/FourFingersIdenty;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getSuccess", "()Ljava/lang/Boolean;", "setSuccess", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getStatus", "()Ljava/lang/Integer;", "setStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCode", "setCode", "getToken", "getUseLiveness", "getData", "()Lcom/gse/aulapp/model/dto/DataLoginDto;", "getFullEnrollment", "setFullEnrollment", "getUserEmail", "getDocumentNumber", "getUserID", "getFraudInformationID", "getBiometrixInformationID", "getFourFingersIdentyID", "()Lcom/gse/aulapp/model/dto/FourFingersIdenty;", "getCenterList", "()Ljava/util/List;", "getCenterID", "getDate", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/gse/aulapp/model/dto/DataLoginDto;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/gse/aulapp/model/dto/FourFingersIdenty;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/gse/aulapp/model/response/LoginResponse$Result;", "describeContents", "equals", "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Result extends GeneralResponse {
        public static final Parcelable.Creator<Result> CREATOR = new Creator();

        @SerializedName("biometrixInformationID")
        private final String biometrixInformationID;

        @SerializedName("centerID")
        private final String centerID;

        @SerializedName("centerList")
        private final List<CenterDto> centerList;

        @SerializedName("code")
        private String code;

        @SerializedName("data")
        private final DataLoginDto data;

        @SerializedName("date")
        private final String date;

        @SerializedName("documentNumber")
        private final String documentNumber;

        @SerializedName("fourFingersIdentyID")
        private final FourFingersIdenty fourFingersIdentyID;

        @SerializedName("fraudInformationID")
        private final String fraudInformationID;

        @SerializedName("fullEnrollment")
        private Boolean fullEnrollment;

        @SerializedName("message")
        private String message;

        @SerializedName("status")
        private Integer status;

        @SerializedName("success")
        private Boolean success;

        @SerializedName("token")
        private final String token;

        @SerializedName("useLiveness")
        private final Boolean useLiveness;

        @SerializedName("userEmail")
        private final String userEmail;

        @SerializedName("userID")
        private final String userID;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Result> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = 0;
                ArrayList arrayList = null;
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString = parcel.readString();
                Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                DataLoginDto createFromParcel = parcel.readInt() == 0 ? null : DataLoginDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                FourFingersIdenty createFromParcel2 = parcel.readInt() == 0 ? null : FourFingersIdenty.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    while (i != readInt) {
                        i = q.b(CenterDto.CREATOR, parcel, arrayList, i, 1);
                    }
                }
                return new Result(valueOf, readString, valueOf4, readString2, readString3, valueOf2, createFromParcel, valueOf3, readString4, readString5, readString6, readString7, readString8, createFromParcel2, arrayList, parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result[] newArray(int i) {
                return new Result[i];
            }
        }

        public /* synthetic */ Result(Boolean bool, String str, Integer num, String str2, String str3, Boolean bool2, DataLoginDto dataLoginDto, Boolean bool3, String str4, String str5, String str6, String str7, String str8, FourFingersIdenty fourFingersIdenty, List list, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : dataLoginDto, bool3, (i & 256) != 0 ? null : str4, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : str5, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : str7, (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : str8, (i & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : fourFingersIdenty, (i & 16384) != 0 ? null : list, (32768 & i) != 0 ? null : str9, (i & 65536) != 0 ? null : str10);
        }

        public static /* synthetic */ Result copy$default(Result result, Boolean bool, String str, Integer num, String str2, String str3, Boolean bool2, DataLoginDto dataLoginDto, Boolean bool3, String str4, String str5, String str6, String str7, String str8, FourFingersIdenty fourFingersIdenty, List list, String str9, String str10, int i, Object obj) {
            String str11;
            String str12;
            Boolean bool4;
            Result result2;
            List list2;
            String str13;
            Integer num2;
            String str14;
            String str15;
            Boolean bool5;
            DataLoginDto dataLoginDto2;
            Boolean bool6;
            String str16;
            String str17;
            String str18;
            String str19;
            String str20;
            FourFingersIdenty fourFingersIdenty2;
            Boolean bool7 = (i & 1) != 0 ? result.success : bool;
            String str21 = (i & 2) != 0 ? result.message : str;
            Integer num3 = (i & 4) != 0 ? result.status : num;
            String str22 = (i & 8) != 0 ? result.code : str2;
            String str23 = (i & 16) != 0 ? result.token : str3;
            Boolean bool8 = (i & 32) != 0 ? result.useLiveness : bool2;
            DataLoginDto dataLoginDto3 = (i & 64) != 0 ? result.data : dataLoginDto;
            Boolean bool9 = (i & 128) != 0 ? result.fullEnrollment : bool3;
            String str24 = (i & 256) != 0 ? result.userEmail : str4;
            String str25 = (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? result.documentNumber : str5;
            String str26 = (i & 1024) != 0 ? result.userID : str6;
            String str27 = (i & 2048) != 0 ? result.fraudInformationID : str7;
            String str28 = (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? result.biometrixInformationID : str8;
            FourFingersIdenty fourFingersIdenty3 = (i & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? result.fourFingersIdentyID : fourFingersIdenty;
            Boolean bool10 = bool7;
            List list3 = (i & 16384) != 0 ? result.centerList : list;
            String str29 = (i & 32768) != 0 ? result.centerID : str9;
            if ((i & 65536) != 0) {
                str12 = str29;
                str11 = result.date;
                list2 = list3;
                str13 = str21;
                num2 = num3;
                str14 = str22;
                str15 = str23;
                bool5 = bool8;
                dataLoginDto2 = dataLoginDto3;
                bool6 = bool9;
                str16 = str24;
                str17 = str25;
                str18 = str26;
                str19 = str27;
                str20 = str28;
                fourFingersIdenty2 = fourFingersIdenty3;
                bool4 = bool10;
                result2 = result;
            } else {
                str11 = str10;
                str12 = str29;
                bool4 = bool10;
                result2 = result;
                list2 = list3;
                str13 = str21;
                num2 = num3;
                str14 = str22;
                str15 = str23;
                bool5 = bool8;
                dataLoginDto2 = dataLoginDto3;
                bool6 = bool9;
                str16 = str24;
                str17 = str25;
                str18 = str26;
                str19 = str27;
                str20 = str28;
                fourFingersIdenty2 = fourFingersIdenty3;
            }
            return result2.copy(bool4, str13, num2, str14, str15, bool5, dataLoginDto2, bool6, str16, str17, str18, str19, str20, fourFingersIdenty2, list2, str12, str11);
        }

        /* renamed from: component1, reason: from getter */
        public final Boolean getSuccess() {
            return this.success;
        }

        /* renamed from: component10, reason: from getter */
        public final String getDocumentNumber() {
            return this.documentNumber;
        }

        /* renamed from: component11, reason: from getter */
        public final String getUserID() {
            return this.userID;
        }

        /* renamed from: component12, reason: from getter */
        public final String getFraudInformationID() {
            return this.fraudInformationID;
        }

        /* renamed from: component13, reason: from getter */
        public final String getBiometrixInformationID() {
            return this.biometrixInformationID;
        }

        /* renamed from: component14, reason: from getter */
        public final FourFingersIdenty getFourFingersIdentyID() {
            return this.fourFingersIdentyID;
        }

        public final List<CenterDto> component15() {
            return this.centerList;
        }

        /* renamed from: component16, reason: from getter */
        public final String getCenterID() {
            return this.centerID;
        }

        /* renamed from: component17, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getStatus() {
            return this.status;
        }

        /* renamed from: component4, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        /* renamed from: component5, reason: from getter */
        public final String getToken() {
            return this.token;
        }

        /* renamed from: component6, reason: from getter */
        public final Boolean getUseLiveness() {
            return this.useLiveness;
        }

        /* renamed from: component7, reason: from getter */
        public final DataLoginDto getData() {
            return this.data;
        }

        /* renamed from: component8, reason: from getter */
        public final Boolean getFullEnrollment() {
            return this.fullEnrollment;
        }

        /* renamed from: component9, reason: from getter */
        public final String getUserEmail() {
            return this.userEmail;
        }

        public final Result copy(Boolean success, String message, Integer status, String code, String token, Boolean useLiveness, DataLoginDto data, Boolean fullEnrollment, String userEmail, String documentNumber, String userID, String fraudInformationID, String biometrixInformationID, FourFingersIdenty fourFingersIdentyID, List<CenterDto> centerList, String centerID, String date) {
            return new Result(success, message, status, code, token, useLiveness, data, fullEnrollment, userEmail, documentNumber, userID, fraudInformationID, biometrixInformationID, fourFingersIdentyID, centerList, centerID, date);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return Intrinsics.areEqual(this.success, result.success) && Intrinsics.areEqual(this.message, result.message) && Intrinsics.areEqual(this.status, result.status) && Intrinsics.areEqual(this.code, result.code) && Intrinsics.areEqual(this.token, result.token) && Intrinsics.areEqual(this.useLiveness, result.useLiveness) && Intrinsics.areEqual(this.data, result.data) && Intrinsics.areEqual(this.fullEnrollment, result.fullEnrollment) && Intrinsics.areEqual(this.userEmail, result.userEmail) && Intrinsics.areEqual(this.documentNumber, result.documentNumber) && Intrinsics.areEqual(this.userID, result.userID) && Intrinsics.areEqual(this.fraudInformationID, result.fraudInformationID) && Intrinsics.areEqual(this.biometrixInformationID, result.biometrixInformationID) && Intrinsics.areEqual(this.fourFingersIdentyID, result.fourFingersIdentyID) && Intrinsics.areEqual(this.centerList, result.centerList) && Intrinsics.areEqual(this.centerID, result.centerID) && Intrinsics.areEqual(this.date, result.date);
        }

        public final List<CenterDto> getCenterList() {
            return this.centerList;
        }
        @Override // com.gse.aulapp.model.response.GeneralResponse

        public int hashCode() {
            Boolean bool = this.success;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.message;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.status;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.code;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.token;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Boolean bool2 = this.useLiveness;
            int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            DataLoginDto dataLoginDto = this.data;
            int hashCode7 = (hashCode6 + (dataLoginDto == null ? 0 : dataLoginDto.hashCode())) * 31;
            Boolean bool3 = this.fullEnrollment;
            int hashCode8 = (hashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str4 = this.userEmail;
            int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.documentNumber;
            int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.userID;
            int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.fraudInformationID;
            int hashCode12 = (hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.biometrixInformationID;
            int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
            FourFingersIdenty fourFingersIdenty = this.fourFingersIdentyID;
            int hashCode14 = (hashCode13 + (fourFingersIdenty == null ? 0 : fourFingersIdenty.hashCode())) * 31;
            List<CenterDto> list = this.centerList;
            int hashCode15 = (hashCode14 + (list == null ? 0 : list.hashCode())) * 31;
            String str9 = this.centerID;
            int hashCode16 = (hashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.date;
            return hashCode16 + (str10 != null ? str10.hashCode() : 0);
        }

        @Override // com.gse.aulapp.model.response.GeneralResponse
        public void setCode(String str) {
            this.code = str;
        }

        public final void setFullEnrollment(Boolean bool) {
            this.fullEnrollment = bool;
        }

        @Override // com.gse.aulapp.model.response.GeneralResponse
        public void setMessage(String str) {
            this.message = str;
        }

        @Override // com.gse.aulapp.model.response.GeneralResponse
        public void setStatus(Integer num) {
            this.status = num;
        }

        @Override // com.gse.aulapp.model.response.GeneralResponse
        public void setSuccess(Boolean bool) {
            this.success = bool;
        }

        public String toString() {
            Boolean bool = this.success;
            String str = this.message;
            Integer num = this.status;
            String str2 = this.code;
            String str3 = this.token;
            Boolean bool2 = this.useLiveness;
            DataLoginDto dataLoginDto = this.data;
            Boolean bool3 = this.fullEnrollment;
            String str4 = this.userEmail;
            String str5 = this.documentNumber;
            String str6 = this.userID;
            String str7 = this.fraudInformationID;
            String str8 = this.biometrixInformationID;
            FourFingersIdenty fourFingersIdenty = this.fourFingersIdentyID;
            List<CenterDto> list = this.centerList;
            String str9 = this.centerID;
            String str10 = this.date;
            StringBuilder q = a.q(bool, "Result(success=", ", message=", str, ", status=");
            q.append(num);
            q.append(", code=");
            q.append(str2);
            q.append(", token=");
            q.append(str3);
            q.append(", useLiveness=");
            q.append(bool2);
            q.append(", data=");
            q.append(dataLoginDto);
            q.append(", fullEnrollment=");
            q.append(bool3);
            q.append(", userEmail=");
            x5.z(q, str4, ", documentNumber=", str5, ", userID=");
            x5.z(q, str6, ", fraudInformationID=", str7, ", biometrixInformationID=");
            q.append(str8);
            q.append(", fourFingersIdentyID=");
            q.append(fourFingersIdenty);
            q.append(", centerList=");
            q.append(list);
            q.append(", centerID=");
            q.append(str9);
            q.append(", date=");
            q.append(str10);
            q.append(")");
            return q.toString();
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
            Integer num = this.status;
            if (num == null) {
                dest.writeInt(0);
            } else {
                x5.w(dest, 1, num);
            }
            dest.writeString(this.code);
            dest.writeString(this.token);
            Boolean bool2 = this.useLiveness;
            if (bool2 == null) {
                dest.writeInt(0);
            } else {
                x5.v(dest, 1, bool2);
            }
            DataLoginDto dataLoginDto = this.data;
            if (dataLoginDto == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dataLoginDto.writeToParcel(dest, flags);
            }
            Boolean bool3 = this.fullEnrollment;
            if (bool3 == null) {
                dest.writeInt(0);
            } else {
                x5.v(dest, 1, bool3);
            }
            dest.writeString(this.userEmail);
            dest.writeString(this.documentNumber);
            dest.writeString(this.userID);
            dest.writeString(this.fraudInformationID);
            dest.writeString(this.biometrixInformationID);
            FourFingersIdenty fourFingersIdenty = this.fourFingersIdentyID;
            if (fourFingersIdenty == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                fourFingersIdenty.writeToParcel(dest, flags);
            }
            List<CenterDto> list = this.centerList;
            if (list == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list.size());
                Iterator<CenterDto> it = list.iterator();
                while (it.hasNext()) {
                    it.next().writeToParcel(dest, flags);
                }
            }
            dest.writeString(this.centerID);
            dest.writeString(this.date);
        }

        public Result(Boolean bool, String str, Integer num, String str2, String str3, Boolean bool2, DataLoginDto dataLoginDto, Boolean bool3, String str4, String str5, String str6, String str7, String str8, FourFingersIdenty fourFingersIdenty, List<CenterDto> list, String str9, String str10) {
            super(bool, str, num, str2);
            this.success = bool;
            this.message = str;
            this.status = num;
            this.code = str2;
            this.token = str3;
            this.useLiveness = bool2;
            this.data = dataLoginDto;
            this.fullEnrollment = bool3;
            this.userEmail = str4;
            this.documentNumber = str5;
            this.userID = str6;
            this.fraudInformationID = str7;
            this.biometrixInformationID = str8;
            this.fourFingersIdentyID = fourFingersIdenty;
            this.centerList = list;
            this.centerID = str9;
            this.date = str10;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ LoginResponse(Integer num, String str, String str2, Result result, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : result, (i & 16) != 0 ? null : str3);
    }

    public static /* synthetic */ LoginResponse copy$default(LoginResponse loginResponse, Integer num, String str, String str2, Result result, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = loginResponse.statusCode;
        }
        if ((i & 2) != 0) {
            str = loginResponse.statusMessage;
        }
        if ((i & 4) != 0) {
            str2 = loginResponse.generalMessage;
        }
        if ((i & 8) != 0) {
            result = loginResponse.result;
        }
        if ((i & 16) != 0) {
            str3 = loginResponse.url;
        }
        String str4 = str3;
        String str5 = str2;
        return loginResponse.copy(num, str, str5, result, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getStatusCode() {
        return this.statusCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStatusMessage() {
        return this.statusMessage;
    }

    /* renamed from: component3, reason: from getter */
    public final String getGeneralMessage() {
        return this.generalMessage;
    }

    /* renamed from: component4, reason: from getter */
    public final Result getResult() {
        return this.result;
    }

    /* renamed from: component5, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final LoginResponse copy(Integer statusCode, String statusMessage, String generalMessage, Result result, String url) {
        return new LoginResponse(statusCode, statusMessage, generalMessage, result, url);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginResponse)) {
            return false;
        }
        LoginResponse loginResponse = (LoginResponse) other;
        return Intrinsics.areEqual(this.statusCode, loginResponse.statusCode) && Intrinsics.areEqual(this.statusMessage, loginResponse.statusMessage) && Intrinsics.areEqual(this.generalMessage, loginResponse.generalMessage) && Intrinsics.areEqual(this.result, loginResponse.result) && Intrinsics.areEqual(this.url, loginResponse.url);
    }

    @Override // com.gse.aulapp.io.model.response.GeneralResponseDecrypt

    public int hashCode() {
        Integer num = this.statusCode;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.statusMessage;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.generalMessage;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Result result = this.result;
        int hashCode4 = (hashCode3 + (result == null ? 0 : result.hashCode())) * 31;
        String str3 = this.url;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.gse.aulapp.io.model.response.GeneralResponseDecrypt
    public void setGeneralMessage(String str) {
        this.generalMessage = str;
    }

    public final void setResult(Result result) {
        this.result = result;
    }

    @Override // com.gse.aulapp.io.model.response.GeneralResponseDecrypt
    public void setStatusCode(Integer num) {
        this.statusCode = num;
    }

    @Override // com.gse.aulapp.io.model.response.GeneralResponseDecrypt
    public void setStatusMessage(String str) {
        this.statusMessage = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    @Override // com.gse.aulapp.io.model.response.GeneralResponseDecrypt
    public String toString() {
        Integer statusCode = getStatusCode();
        String statusMessage = getStatusMessage();
        String generalMessage = getGeneralMessage();
        Result result = this.result;
        StringBuilder p = x5.p("LoginResponse{statusCode=", statusCode, ", statusMessage=", statusMessage, ", message=");
        p.append(generalMessage);
        p.append(", result=");
        p.append(result);
        p.append("}");
        return p.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Integer num = this.statusCode;
        if (num == null) {
            dest.writeInt(0);
        } else {
            x5.w(dest, 1, num);
        }
        dest.writeString(this.statusMessage);
        dest.writeString(this.generalMessage);
        Result result = this.result;
        if (result == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            result.writeToParcel(dest, flags);
        }
        dest.writeString(this.url);
    }

    public LoginResponse(Integer num, String str, String str2, Result result, String str3) {
        super(num, str, str2);
        this.statusCode = num;
        this.statusMessage = str;
        this.generalMessage = str2;
        this.result = result;
        this.url = str3;
    }
}
