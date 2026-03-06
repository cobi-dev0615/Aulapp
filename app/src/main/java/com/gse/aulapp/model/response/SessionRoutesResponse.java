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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00010BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u001d\u001a\u00020\u0005H\u0016J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003JJ\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010$J\u0006\u0010%\u001a\u00020\u0003J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0003R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014¨\u00061"}, d2 = {"Lcom/gse/aulapp/model/response/SessionRoutesResponse;", "Lcom/gse/aulapp/io/model/response/GeneralResponseDecrypt;", "statusCode", BuildConfig.FLAVOR, "statusMessage", BuildConfig.FLAVOR, "generalMessage", "result", "Lcom/gse/aulapp/model/response/SessionRoutesResponse$Result;", "url", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/gse/aulapp/model/response/SessionRoutesResponse$Result;Ljava/lang/String;)V", "getStatusCode", "()Ljava/lang/Integer;", "setStatusCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getStatusMessage", "()Ljava/lang/String;", "setStatusMessage", "(Ljava/lang/String;)V", "getGeneralMessage", "setGeneralMessage", "getResult", "()Lcom/gse/aulapp/model/response/SessionRoutesResponse$Result;", "setResult", "(Lcom/gse/aulapp/model/response/SessionRoutesResponse$Result;)V", "getUrl", "setUrl", "toString", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/gse/aulapp/model/response/SessionRoutesResponse$Result;Ljava/lang/String;)Lcom/gse/aulapp/model/response/SessionRoutesResponse;", "describeContents", "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "Result", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SessionRoutesResponse extends GeneralResponseDecrypt {
    public static final Parcelable.Creator<SessionRoutesResponse> CREATOR = new Creator();

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
    public static final class Creator implements Parcelable.Creator<SessionRoutesResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SessionRoutesResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SessionRoutesResponse(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Result.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SessionRoutesResponse[] newArray(int i) {
            return new SessionRoutesResponse[i];
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003JD\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020 HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020 R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R \u0010\t\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014¨\u0006+"}, d2 = {"Lcom/gse/aulapp/model/response/SessionRoutesResponse$Result;", "Lcom/gse/aulapp/model/response/GeneralResponse;", "success", BuildConfig.FLAVOR, "message", BuildConfig.FLAVOR, "data", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/response/SessionRoutesDataResponse;", "code", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getSuccess", "()Ljava/lang/Boolean;", "setSuccess", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getData", "()Ljava/util/List;", "getCode", "setCode", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/gse/aulapp/model/response/SessionRoutesResponse$Result;", "describeContents", BuildConfig.FLAVOR, "equals", "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Result extends GeneralResponse {
        public static final Parcelable.Creator<Result> CREATOR = new Creator();

        @SerializedName("code")
        private String code;

        @SerializedName("data")
        private final List<SessionRoutesDataResponse> data;

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
                int i = 0;
                ArrayList arrayList = null;
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    while (i != readInt) {
                        i = q.b(SessionRoutesDataResponse.CREATOR, parcel, arrayList2, i, 1);
                    }
                    arrayList = arrayList2;
                }
                return new Result(valueOf, readString, arrayList, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result[] newArray(int i) {
                return new Result[i];
            }
        }

        public /* synthetic */ Result(Boolean bool, String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Result copy$default(Result result, Boolean bool, String str, List list, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = result.success;
            }
            if ((i & 2) != 0) {
                str = result.message;
            }
            if ((i & 4) != 0) {
                list = result.data;
            }
            if ((i & 8) != 0) {
                str2 = result.code;
            }
            return result.copy(bool, str, list, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final Boolean getSuccess() {
            return this.success;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final List<SessionRoutesDataResponse> component3() {
            return this.data;
        }

        /* renamed from: component4, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        public final Result copy(Boolean success, String message, List<SessionRoutesDataResponse> data, String code) {
            return new Result(success, message, data, code);
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
            return Intrinsics.areEqual(this.success, result.success) && Intrinsics.areEqual(this.message, result.message) && Intrinsics.areEqual(this.data, result.data) && Intrinsics.areEqual(this.code, result.code);
        }

        public int hashCode() {
            Boolean bool = this.success;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.message;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List<SessionRoutesDataResponse> list = this.data;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            String str2 = this.code;
            return hashCode3 + (str2 != null ? str2.hashCode() : 0);
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
            List<SessionRoutesDataResponse> list = this.data;
            String str2 = this.code;
            StringBuilder q = a.q(bool, "Result(success=", ", message=", str, ", data=");
            q.append(list);
            q.append(", code=");
            q.append(str2);
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
            List<SessionRoutesDataResponse> list = this.data;
            if (list == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list.size());
                Iterator<SessionRoutesDataResponse> it = list.iterator();
                while (it.hasNext()) {
                    it.next().writeToParcel(dest, flags);
                }
            }
            dest.writeString(this.code);
        }

        public Result(Boolean bool, String str, List<SessionRoutesDataResponse> list, String str2) {
            super(bool, null, null, str2);
            this.success = bool;
            this.message = str;
            this.data = list;
            this.code = str2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ SessionRoutesResponse(Integer num, String str, String str2, Result result, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str, str2, null, null);
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

    public static /* synthetic */ SessionRoutesResponse copy$default(SessionRoutesResponse sessionRoutesResponse, Integer num, String str, String str2, Result result, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = sessionRoutesResponse.statusCode;
        }
        if ((i & 2) != 0) {
            str = sessionRoutesResponse.statusMessage;
        }
        if ((i & 4) != 0) {
            str2 = sessionRoutesResponse.generalMessage;
        }
        if ((i & 8) != 0) {
            result = sessionRoutesResponse.result;
        }
        if ((i & 16) != 0) {
            str3 = sessionRoutesResponse.url;
        }
        String str4 = str3;
        String str5 = str2;
        return sessionRoutesResponse.copy(num, str, str5, result, str4);
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

    public final SessionRoutesResponse copy(Integer statusCode, String statusMessage, String generalMessage, Result result, String url) {
        return new SessionRoutesResponse(statusCode, statusMessage, generalMessage, result, url);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionRoutesResponse)) {
            return false;
        }
        SessionRoutesResponse sessionRoutesResponse = (SessionRoutesResponse) other;
        return Intrinsics.areEqual(this.statusCode, sessionRoutesResponse.statusCode) && Intrinsics.areEqual(this.statusMessage, sessionRoutesResponse.statusMessage) && Intrinsics.areEqual(this.generalMessage, sessionRoutesResponse.generalMessage) && Intrinsics.areEqual(this.result, sessionRoutesResponse.result) && Intrinsics.areEqual(this.url, sessionRoutesResponse.url);
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
        Integer statusCode = getStatusCode();
        String statusMessage = getStatusMessage();
        String generalMessage = getGeneralMessage();
        Result result = this.result;
        StringBuilder p = x5.p("SessionRoutesResponse{statusCode=", statusCode, ", statusMessage=", statusMessage, ", message=");
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

    public SessionRoutesResponse(Integer num, String str, String str2, Result result, String str3) {
        super(num, str, str2);
        this.statusCode = num;
        this.statusMessage = str;
        this.generalMessage = str2;
        this.result = result;
        this.url = str3;
    }
}
