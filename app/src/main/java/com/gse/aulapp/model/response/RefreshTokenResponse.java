package com.gse.aulapp.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.x5;
import com.google.gson.annotations.SerializedName;
import com.gse.aulapp.io.model.response.GeneralResponseDecrypt;
import com.gse.aulapp.model.dto.FourFingersIdenty;
import com.gse.aulapp.model.dto.RefreshToken;
import com.karumi.dexter.BuildConfig;
import defpackage.a;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00010BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u001d\u001a\u00020\u0005H\u0016J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003JJ\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010$J\u0006\u0010%\u001a\u00020\u0003J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0003R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014¨\u00061"}, d2 = {"Lcom/gse/aulapp/model/response/RefreshTokenResponse;", "Lcom/gse/aulapp/io/model/response/GeneralResponseDecrypt;", "statusCode", BuildConfig.FLAVOR, "statusMessage", BuildConfig.FLAVOR, "generalMessage", "result", "Lcom/gse/aulapp/model/response/RefreshTokenResponse$Result;", "url", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/gse/aulapp/model/response/RefreshTokenResponse$Result;Ljava/lang/String;)V", "getStatusCode", "()Ljava/lang/Integer;", "setStatusCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getStatusMessage", "()Ljava/lang/String;", "setStatusMessage", "(Ljava/lang/String;)V", "getGeneralMessage", "setGeneralMessage", "getResult", "()Lcom/gse/aulapp/model/response/RefreshTokenResponse$Result;", "setResult", "(Lcom/gse/aulapp/model/response/RefreshTokenResponse$Result;)V", "getUrl", "setUrl", "toString", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/gse/aulapp/model/response/RefreshTokenResponse$Result;Ljava/lang/String;)Lcom/gse/aulapp/model/response/RefreshTokenResponse;", "describeContents", "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "Result", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RefreshTokenResponse extends GeneralResponseDecrypt {
    public static final Parcelable.Creator<RefreshTokenResponse> CREATOR = new Creator();

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
    public static final class Creator implements Parcelable.Creator<RefreshTokenResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RefreshTokenResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RefreshTokenResponse(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Result.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RefreshTokenResponse[] newArray(int i) {
            return new RefreshTokenResponse[i];
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010 J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0013HÆ\u0003J¤\u0001\u0010>\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u0010?J\u0006\u0010@\u001a\u00020\u0007J\u0013\u0010A\u001a\u00020\u00032\b\u0010B\u001a\u0004\u0018\u00010CHÖ\u0003J\t\u0010D\u001a\u00020\u0007HÖ\u0001J\t\u0010E\u001a\u00020\u0005HÖ\u0001J\u0016\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020\u0007R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R \u0010\b\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001c\"\u0004\b%\u0010\u001eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b(\u0010\u0017R\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b+\u0010\u0017R\u0016\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100¨\u0006K"}, d2 = {"Lcom/gse/aulapp/model/response/RefreshTokenResponse$Result;", "Lcom/gse/aulapp/model/response/GeneralResponse;", "success", BuildConfig.FLAVOR, "message", BuildConfig.FLAVOR, "status", BuildConfig.FLAVOR, "code", "token", "date", "fullEnrollment", "fraudInformationID", "biometrixInformationID", "biometricException", "fullName", "data", "Lcom/gse/aulapp/model/dto/RefreshToken;", "fourFingersIdentyID", "Lcom/gse/aulapp/model/dto/FourFingersIdenty;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/gse/aulapp/model/dto/RefreshToken;Lcom/gse/aulapp/model/dto/FourFingersIdenty;)V", "getSuccess", "()Ljava/lang/Boolean;", "setSuccess", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getStatus", "()Ljava/lang/Integer;", "setStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCode", "setCode", "getToken", "getDate", "getFullEnrollment", "getFraudInformationID", "getBiometrixInformationID", "getBiometricException", "getFullName", "getData", "()Lcom/gse/aulapp/model/dto/RefreshToken;", "getFourFingersIdentyID", "()Lcom/gse/aulapp/model/dto/FourFingersIdenty;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/gse/aulapp/model/dto/RefreshToken;Lcom/gse/aulapp/model/dto/FourFingersIdenty;)Lcom/gse/aulapp/model/response/RefreshTokenResponse$Result;", "describeContents", "equals", "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Result extends GeneralResponse {
        public static final Parcelable.Creator<Result> CREATOR = new Creator();

        @SerializedName("biometricException")
        private final Boolean biometricException;

        @SerializedName("biometrixInformationID")
        private final String biometrixInformationID;

        @SerializedName("code")
        private String code;

        @SerializedName("data")
        private final RefreshToken data;

        @SerializedName("date")
        private final String date;

        @SerializedName("fourFingersIdentyID")
        private final FourFingersIdenty fourFingersIdentyID;

        @SerializedName("fraudInformationID")
        private final String fraudInformationID;

        @SerializedName("fullEnrollment")
        private final Boolean fullEnrollment;

        @SerializedName("full_name")
        private final String fullName;

        @SerializedName("message")
        private String message;

        @SerializedName("status")
        private Integer status;

        @SerializedName("success")
        private Boolean success;

        @SerializedName("token")
        private final String token;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Result> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                Parcelable parcelable;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString = parcel.readString();
                Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString2 = parcel.readString();
                Integer num = valueOf4;
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString5 = parcel.readString();
                Boolean bool = valueOf2;
                String readString6 = parcel.readString();
                if (parcel.readInt() == 0) {
                    parcelable = null;
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                    parcelable = null;
                }
                return new Result(valueOf, readString, num, readString2, readString3, readString4, bool, readString5, readString6, valueOf3, parcel.readString(), (RefreshToken) (parcel.readInt() == 0 ? parcelable : RefreshToken.CREATOR.createFromParcel(parcel)), (FourFingersIdenty) (parcel.readInt() == 0 ? parcelable : FourFingersIdenty.CREATOR.createFromParcel(parcel)));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result[] newArray(int i) {
                return new Result[i];
            }
        }

        public /* synthetic */ Result(Boolean bool, String str, Integer num, String str2, String str3, String str4, Boolean bool2, String str5, String str6, Boolean bool3, String str7, RefreshToken refreshToken, FourFingersIdenty fourFingersIdenty, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : bool2, (i & 128) != 0 ? BuildConfig.FLAVOR : str5, (i & 256) != 0 ? BuildConfig.FLAVOR : str6, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : bool3, (i & 1024) == 0 ? str7 : BuildConfig.FLAVOR, (i & 2048) != 0 ? null : refreshToken, (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : fourFingersIdenty);
        }

        public static /* synthetic */ Result copy$default(Result result, Boolean bool, String str, Integer num, String str2, String str3, String str4, Boolean bool2, String str5, String str6, Boolean bool3, String str7, RefreshToken refreshToken, FourFingersIdenty fourFingersIdenty, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = result.success;
            }
            return result.copy(bool, (i & 2) != 0 ? result.message : str, (i & 4) != 0 ? result.status : num, (i & 8) != 0 ? result.code : str2, (i & 16) != 0 ? result.token : str3, (i & 32) != 0 ? result.date : str4, (i & 64) != 0 ? result.fullEnrollment : bool2, (i & 128) != 0 ? result.fraudInformationID : str5, (i & 256) != 0 ? result.biometrixInformationID : str6, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? result.biometricException : bool3, (i & 1024) != 0 ? result.fullName : str7, (i & 2048) != 0 ? result.data : refreshToken, (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? result.fourFingersIdentyID : fourFingersIdenty);
        }

        /* renamed from: component1, reason: from getter */
        public final Boolean getSuccess() {
            return this.success;
        }

        /* renamed from: component10, reason: from getter */
        public final Boolean getBiometricException() {
            return this.biometricException;
        }

        /* renamed from: component11, reason: from getter */
        public final String getFullName() {
            return this.fullName;
        }

        /* renamed from: component12, reason: from getter */
        public final RefreshToken getData() {
            return this.data;
        }

        /* renamed from: component13, reason: from getter */
        public final FourFingersIdenty getFourFingersIdentyID() {
            return this.fourFingersIdentyID;
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
        public final String getDate() {
            return this.date;
        }

        /* renamed from: component7, reason: from getter */
        public final Boolean getFullEnrollment() {
            return this.fullEnrollment;
        }

        /* renamed from: component8, reason: from getter */
        public final String getFraudInformationID() {
            return this.fraudInformationID;
        }

        /* renamed from: component9, reason: from getter */
        public final String getBiometrixInformationID() {
            return this.biometrixInformationID;
        }

        public final Result copy(Boolean success, String message, Integer status, String code, String token, String date, Boolean fullEnrollment, String fraudInformationID, String biometrixInformationID, Boolean biometricException, String fullName, RefreshToken data, FourFingersIdenty fourFingersIdentyID) {
            Intrinsics.checkNotNullParameter(fraudInformationID, "fraudInformationID");
            Intrinsics.checkNotNullParameter(biometrixInformationID, "biometrixInformationID");
            Intrinsics.checkNotNullParameter(fullName, "fullName");
            return new Result(success, message, status, code, token, date, fullEnrollment, fraudInformationID, biometrixInformationID, biometricException, fullName, data, fourFingersIdentyID);
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
            return Intrinsics.areEqual(this.success, result.success) && Intrinsics.areEqual(this.message, result.message) && Intrinsics.areEqual(this.status, result.status) && Intrinsics.areEqual(this.code, result.code) && Intrinsics.areEqual(this.token, result.token) && Intrinsics.areEqual(this.date, result.date) && Intrinsics.areEqual(this.fullEnrollment, result.fullEnrollment) && Intrinsics.areEqual(this.fraudInformationID, result.fraudInformationID) && Intrinsics.areEqual(this.biometrixInformationID, result.biometrixInformationID) && Intrinsics.areEqual(this.biometricException, result.biometricException) && Intrinsics.areEqual(this.fullName, result.fullName) && Intrinsics.areEqual(this.data, result.data) && Intrinsics.areEqual(this.fourFingersIdentyID, result.fourFingersIdentyID);
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
            String str4 = this.date;
            int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool2 = this.fullEnrollment;
            int d = x5.d(this.biometrixInformationID, x5.d(this.fraudInformationID, (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31), 31);
            Boolean bool3 = this.biometricException;
            int d2 = x5.d(this.fullName, (d + (bool3 == null ? 0 : bool3.hashCode())) * 31, 31);
            RefreshToken refreshToken = this.data;
            int hashCode7 = (d2 + (refreshToken == null ? 0 : refreshToken.hashCode())) * 31;
            FourFingersIdenty fourFingersIdenty = this.fourFingersIdentyID;
            return hashCode7 + (fourFingersIdenty != null ? fourFingersIdenty.hashCode() : 0);
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
            String str4 = this.date;
            Boolean bool2 = this.fullEnrollment;
            String str5 = this.fraudInformationID;
            String str6 = this.biometrixInformationID;
            Boolean bool3 = this.biometricException;
            String str7 = this.fullName;
            RefreshToken refreshToken = this.data;
            FourFingersIdenty fourFingersIdenty = this.fourFingersIdentyID;
            StringBuilder q = a.q(bool, "Result(success=", ", message=", str, ", status=");
            q.append(num);
            q.append(", code=");
            q.append(str2);
            q.append(", token=");
            x5.z(q, str3, ", date=", str4, ", fullEnrollment=");
            q.append(bool2);
            q.append(", fraudInformationID=");
            q.append(str5);
            q.append(", biometrixInformationID=");
            q.append(str6);
            q.append(", biometricException=");
            q.append(bool3);
            q.append(", fullName=");
            q.append(str7);
            q.append(", data=");
            q.append(refreshToken);
            q.append(", fourFingersIdentyID=");
            q.append(fourFingersIdenty);
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
            dest.writeString(this.date);
            Boolean bool2 = this.fullEnrollment;
            if (bool2 == null) {
                dest.writeInt(0);
            } else {
                x5.v(dest, 1, bool2);
            }
            dest.writeString(this.fraudInformationID);
            dest.writeString(this.biometrixInformationID);
            Boolean bool3 = this.biometricException;
            if (bool3 == null) {
                dest.writeInt(0);
            } else {
                x5.v(dest, 1, bool3);
            }
            dest.writeString(this.fullName);
            RefreshToken refreshToken = this.data;
            if (refreshToken == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                refreshToken.writeToParcel(dest, flags);
            }
            FourFingersIdenty fourFingersIdenty = this.fourFingersIdentyID;
            if (fourFingersIdenty == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                fourFingersIdenty.writeToParcel(dest, flags);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Result(Boolean bool, String str, Integer num, String str2, String str3, String str4, Boolean bool2, String fraudInformationID, String biometrixInformationID, Boolean bool3, String fullName, RefreshToken refreshToken, FourFingersIdenty fourFingersIdenty) {
            super(bool, str, num, str2);
            Intrinsics.checkNotNullParameter(fraudInformationID, "fraudInformationID");
            Intrinsics.checkNotNullParameter(biometrixInformationID, "biometrixInformationID");
            Intrinsics.checkNotNullParameter(fullName, "fullName");
            this.success = bool;
            this.message = str;
            this.status = num;
            this.code = str2;
            this.token = str3;
            this.date = str4;
            this.fullEnrollment = bool2;
            this.fraudInformationID = fraudInformationID;
            this.biometrixInformationID = biometrixInformationID;
            this.biometricException = bool3;
            this.fullName = fullName;
            this.data = refreshToken;
            this.fourFingersIdentyID = fourFingersIdenty;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ RefreshTokenResponse(Integer num, String str, String str2, Result result, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : result, (i & 16) != 0 ? null : str3);
    }

    public static /* synthetic */ RefreshTokenResponse copy$default(RefreshTokenResponse refreshTokenResponse, Integer num, String str, String str2, Result result, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = refreshTokenResponse.statusCode;
        }
        if ((i & 2) != 0) {
            str = refreshTokenResponse.statusMessage;
        }
        if ((i & 4) != 0) {
            str2 = refreshTokenResponse.generalMessage;
        }
        if ((i & 8) != 0) {
            result = refreshTokenResponse.result;
        }
        if ((i & 16) != 0) {
            str3 = refreshTokenResponse.url;
        }
        String str4 = str3;
        String str5 = str2;
        return refreshTokenResponse.copy(num, str, str5, result, str4);
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

    public final RefreshTokenResponse copy(Integer statusCode, String statusMessage, String generalMessage, Result result, String url) {
        return new RefreshTokenResponse(statusCode, statusMessage, generalMessage, result, url);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RefreshTokenResponse)) {
            return false;
        }
        RefreshTokenResponse refreshTokenResponse = (RefreshTokenResponse) other;
        return Intrinsics.areEqual(this.statusCode, refreshTokenResponse.statusCode) && Intrinsics.areEqual(this.statusMessage, refreshTokenResponse.statusMessage) && Intrinsics.areEqual(this.generalMessage, refreshTokenResponse.generalMessage) && Intrinsics.areEqual(this.result, refreshTokenResponse.result) && Intrinsics.areEqual(this.url, refreshTokenResponse.url);
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
        StringBuilder p = x5.p("RefreshTokenResponse{statusCode=", statusCode, ", statusMessage=", statusMessage, ", message=");
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

    public RefreshTokenResponse(Integer num, String str, String str2, Result result, String str3) {
        super(num, str, str2);
        this.statusCode = num;
        this.statusMessage = str;
        this.generalMessage = str2;
        this.result = result;
        this.url = str3;
    }
}
