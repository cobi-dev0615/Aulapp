package com.gse.aulapp.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.q;
import co.ceduladigital.sdk.x5;
import com.google.gson.annotations.SerializedName;
import com.gse.aulapp.io.model.response.GeneralResponseDecrypt;
import com.karumi.dexter.BuildConfig;
import defpackage.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00010BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003JJ\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010#J\u0006\u0010$\u001a\u00020\u0003J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\t\u0010*\u001a\u00020\u0005HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0003R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014¨\u00061"}, d2 = {"Lcom/gse/aulapp/model/response/BiometricVerifyResponse;", "Lcom/gse/aulapp/io/model/response/GeneralResponseDecrypt;", "statusCode", BuildConfig.FLAVOR, "statusMessage", BuildConfig.FLAVOR, "generalMessage", "result", "Lcom/gse/aulapp/model/response/BiometricVerifyResponse$Result;", "url", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/gse/aulapp/model/response/BiometricVerifyResponse$Result;Ljava/lang/String;)V", "getStatusCode", "()Ljava/lang/Integer;", "setStatusCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getStatusMessage", "()Ljava/lang/String;", "setStatusMessage", "(Ljava/lang/String;)V", "getGeneralMessage", "setGeneralMessage", "getResult", "()Lcom/gse/aulapp/model/response/BiometricVerifyResponse$Result;", "setResult", "(Lcom/gse/aulapp/model/response/BiometricVerifyResponse$Result;)V", "getUrl", "setUrl", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/gse/aulapp/model/response/BiometricVerifyResponse$Result;Ljava/lang/String;)Lcom/gse/aulapp/model/response/BiometricVerifyResponse;", "describeContents", "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "Result", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BiometricVerifyResponse extends GeneralResponseDecrypt {
    public static final Parcelable.Creator<BiometricVerifyResponse> CREATOR = new Creator();

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
    public static final class Creator implements Parcelable.Creator<BiometricVerifyResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BiometricVerifyResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BiometricVerifyResponse(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Result.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BiometricVerifyResponse[] newArray(int i) {
            return new BiometricVerifyResponse[i];
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J>\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0006\u0010 \u001a\u00020!J\u0013\u0010\"\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020!HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020!R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006,"}, d2 = {"Lcom/gse/aulapp/model/response/BiometricVerifyResponse$Result;", "Lcom/gse/aulapp/model/response/GeneralResponse;", "success", BuildConfig.FLAVOR, "message", BuildConfig.FLAVOR, "code", "authStatus", "Lcom/gse/aulapp/model/response/AuthStatus;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/gse/aulapp/model/response/AuthStatus;)V", "getSuccess", "()Ljava/lang/Boolean;", "setSuccess", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getCode", "setCode", "getAuthStatus", "()Lcom/gse/aulapp/model/response/AuthStatus;", "setAuthStatus", "(Lcom/gse/aulapp/model/response/AuthStatus;)V", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/gse/aulapp/model/response/AuthStatus;)Lcom/gse/aulapp/model/response/BiometricVerifyResponse$Result;", "describeContents", BuildConfig.FLAVOR, "equals", "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Result extends GeneralResponse {
        public static final Parcelable.Creator<Result> CREATOR = new Creator();

        @SerializedName("authStatus")
        private AuthStatus authStatus;

        @SerializedName("code")
        private String code;

        @SerializedName("message")
        private String message;

        @SerializedName("success")
        private Boolean success;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Result> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Result(valueOf, parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? AuthStatus.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result[] newArray(int i) {
                return new Result[i];
            }
        }

        public /* synthetic */ Result(Boolean bool, String str, String str2, AuthStatus authStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : authStatus);
        }

        public static /* synthetic */ Result copy$default(Result result, Boolean bool, String str, String str2, AuthStatus authStatus, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = result.success;
            }
            if ((i & 2) != 0) {
                str = result.message;
            }
            if ((i & 4) != 0) {
                str2 = result.code;
            }
            if ((i & 8) != 0) {
                authStatus = result.authStatus;
            }
            return result.copy(bool, str, str2, authStatus);
        }

        /* renamed from: component1, reason: from getter */
        public final Boolean getSuccess() {
            return this.success;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        /* renamed from: component4, reason: from getter */
        public final AuthStatus getAuthStatus() {
            return this.authStatus;
        }

        public final Result copy(Boolean success, String message, String code, AuthStatus authStatus) {
            return new Result(success, message, code, authStatus);
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
            return Intrinsics.areEqual(this.success, result.success) && Intrinsics.areEqual(this.message, result.message) && Intrinsics.areEqual(this.code, result.code) && Intrinsics.areEqual(this.authStatus, result.authStatus);
        }

        public final AuthStatus getAuthStatus() {
            return this.authStatus;
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

        public int hashCode() {
            Boolean bool = this.success;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.message;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.code;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            AuthStatus authStatus = this.authStatus;
            return hashCode3 + (authStatus != null ? authStatus.hashCode() : 0);
        }

        public final void setAuthStatus(AuthStatus authStatus) {
            this.authStatus = authStatus;
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

        public String toString() {
            Boolean bool = this.success;
            String str = this.message;
            String str2 = this.code;
            AuthStatus authStatus = this.authStatus;
            StringBuilder q = a.q(bool, "Result(success=", ", message=", str, ", code=");
            q.append(str2);
            q.append(", authStatus=");
            q.append(authStatus);
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
            dest.writeString(this.code);
            AuthStatus authStatus = this.authStatus;
            if (authStatus == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                authStatus.writeToParcel(dest, flags);
            }
        }

        public Result(Boolean bool, String str, String str2, AuthStatus authStatus) {
            super(bool, str, null, str2);
            this.success = bool;
            this.message = str;
            this.code = str2;
            this.authStatus = authStatus;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ BiometricVerifyResponse(Integer num, String str, String str2, Result result, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str, str2, r6, r7);
        String str4;
        Result result2;
        num = (i & 1) != 0 ? null : num;
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        if ((i & 8) != 0) {
            str4 = str3;
            result2 = null;
        } else {
            str4 = str3;
            result2 = result;
        }
    }

    public static /* synthetic */ BiometricVerifyResponse copy$default(BiometricVerifyResponse biometricVerifyResponse, Integer num, String str, String str2, Result result, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = biometricVerifyResponse.statusCode;
        }
        if ((i & 2) != 0) {
            str = biometricVerifyResponse.statusMessage;
        }
        if ((i & 4) != 0) {
            str2 = biometricVerifyResponse.generalMessage;
        }
        if ((i & 8) != 0) {
            result = biometricVerifyResponse.result;
        }
        if ((i & 16) != 0) {
            str3 = biometricVerifyResponse.url;
        }
        String str4 = str3;
        String str5 = str2;
        return biometricVerifyResponse.copy(num, str, str5, result, str4);
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

    public final BiometricVerifyResponse copy(Integer statusCode, String statusMessage, String generalMessage, Result result, String url) {
        return new BiometricVerifyResponse(statusCode, statusMessage, generalMessage, result, url);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BiometricVerifyResponse)) {
            return false;
        }
        BiometricVerifyResponse biometricVerifyResponse = (BiometricVerifyResponse) other;
        return Intrinsics.areEqual(this.statusCode, biometricVerifyResponse.statusCode) && Intrinsics.areEqual(this.statusMessage, biometricVerifyResponse.statusMessage) && Intrinsics.areEqual(this.generalMessage, biometricVerifyResponse.generalMessage) && Intrinsics.areEqual(this.result, biometricVerifyResponse.result) && Intrinsics.areEqual(this.url, biometricVerifyResponse.url);
    }

    @Override // com.gse.aulapp.io.model.response.GeneralResponseDecrypt
    public String getGeneralMessage() {
        return this.generalMessage;
    }

    public final Result getResult() {
        return this.result;
    }

    @Override // com.gse.aulapp.io.model.response.GeneralResponseDecrypt
    public Integer getStatusCode() {
        return this.statusCode;
    }

    @Override // com.gse.aulapp.io.model.response.GeneralResponseDecrypt
    public String getStatusMessage() {
        return this.statusMessage;
    }

    public final String getUrl() {
        return this.url;
    }

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
        Integer num = this.statusCode;
        String str = this.statusMessage;
        String str2 = this.generalMessage;
        Result result = this.result;
        String str3 = this.url;
        StringBuilder p = x5.p("BiometricVerifyResponse(statusCode=", num, ", statusMessage=", str, ", generalMessage=");
        p.append(str2);
        p.append(", result=");
        p.append(result);
        p.append(", url=");
        return q.j(str3, ")", p);
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

    public BiometricVerifyResponse(Integer num, String str, String str2, Result result, String str3) {
        super(num, str, str2);
        this.statusCode = num;
        this.statusMessage = str;
        this.generalMessage = str2;
        this.result = result;
        this.url = str3;
    }
}
