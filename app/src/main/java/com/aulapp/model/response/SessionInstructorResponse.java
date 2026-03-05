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
import kotlin.uuid.Uuid;

@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00010BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u001d\u001a\u00020\u0005H\u0016J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003JJ\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010$J\u0006\u0010%\u001a\u00020\u0003J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0003R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014¨\u00061"}, d2 = {"Lcom/gse/aulapp/model/response/SessionInstructorResponse;", "Lcom/gse/aulapp/io/model/response/GeneralResponseDecrypt;", "statusCode", BuildConfig.FLAVOR, "statusMessage", BuildConfig.FLAVOR, "generalMessage", "result", "Lcom/gse/aulapp/model/response/SessionInstructorResponse$Result;", "url", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/gse/aulapp/model/response/SessionInstructorResponse$Result;Ljava/lang/String;)V", "getStatusCode", "()Ljava/lang/Integer;", "setStatusCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getStatusMessage", "()Ljava/lang/String;", "setStatusMessage", "(Ljava/lang/String;)V", "getGeneralMessage", "setGeneralMessage", "getResult", "()Lcom/gse/aulapp/model/response/SessionInstructorResponse$Result;", "setResult", "(Lcom/gse/aulapp/model/response/SessionInstructorResponse$Result;)V", "getUrl", "setUrl", "toString", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/gse/aulapp/model/response/SessionInstructorResponse$Result;Ljava/lang/String;)Lcom/gse/aulapp/model/response/SessionInstructorResponse;", "describeContents", "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "Result", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SessionInstructorResponse extends GeneralResponseDecrypt {
    public static final Parcelable.Creator<SessionInstructorResponse> CREATOR = new Creator();

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
    public static final class Creator implements Parcelable.Creator<SessionInstructorResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SessionInstructorResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SessionInstructorResponse(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Result.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SessionInstructorResponse[] newArray(int i) {
            return new SessionInstructorResponse[i];
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\t\u00107\u001a\u00020\u000eHÆ\u0003J\t\u00108\u001a\u00020\u0010HÆ\u0003Jn\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001¢\u0006\u0002\u0010:J\u0006\u0010;\u001a\u00020\u0007J\u0013\u0010<\u001a\u00020\u00032\b\u0010=\u001a\u0004\u0018\u00010>HÖ\u0003J\t\u0010?\u001a\u00020\u0007HÖ\u0001J\t\u0010@\u001a\u00020\u0005HÖ\u0001J\u0016\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u0007R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR \u0010\b\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0019\"\u0004\b\"\u0010\u001bR \u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010\u001bR$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u0006F"}, d2 = {"Lcom/gse/aulapp/model/response/SessionInstructorResponse$Result;", "Lcom/gse/aulapp/model/response/GeneralResponse;", "success", BuildConfig.FLAVOR, "message", BuildConfig.FLAVOR, "status", BuildConfig.FLAVOR, "code", "date", "data", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/response/SessionInstructorObjectResponse;", "practicalConfiguration", "Lcom/gse/aulapp/model/response/PracticalConfigurationResponse;", "examPracticalConfiguration", "Lcom/gse/aulapp/model/response/ExamPracticalConfigurationResponse;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/gse/aulapp/model/response/PracticalConfigurationResponse;Lcom/gse/aulapp/model/response/ExamPracticalConfigurationResponse;)V", "getSuccess", "()Ljava/lang/Boolean;", "setSuccess", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getStatus", "()Ljava/lang/Integer;", "setStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCode", "setCode", "getDate", "setDate", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "getPracticalConfiguration", "()Lcom/gse/aulapp/model/response/PracticalConfigurationResponse;", "setPracticalConfiguration", "(Lcom/gse/aulapp/model/response/PracticalConfigurationResponse;)V", "getExamPracticalConfiguration", "()Lcom/gse/aulapp/model/response/ExamPracticalConfigurationResponse;", "setExamPracticalConfiguration", "(Lcom/gse/aulapp/model/response/ExamPracticalConfigurationResponse;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/gse/aulapp/model/response/PracticalConfigurationResponse;Lcom/gse/aulapp/model/response/ExamPracticalConfigurationResponse;)Lcom/gse/aulapp/model/response/SessionInstructorResponse$Result;", "describeContents", "equals", "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Result extends GeneralResponse {
        public static final Parcelable.Creator<Result> CREATOR = new Creator();

        @SerializedName("code")
        private String code;

        @SerializedName("data")
        private List<SessionInstructorObjectResponse> data;

        @SerializedName("date")
        private String date;

        @SerializedName("examPracticalConfiguration")
        private ExamPracticalConfigurationResponse examPracticalConfiguration;

        @SerializedName("message")
        private String message;

        @SerializedName("practicalConfiguration")
        private PracticalConfigurationResponse practicalConfiguration;

        @SerializedName("status")
        private Integer status;

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
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString = parcel.readString();
                Integer valueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                while (i != readInt) {
                    i = q.b(SessionInstructorObjectResponse.CREATOR, parcel, arrayList, i, 1);
                }
                return new Result(valueOf, readString, valueOf2, readString2, readString3, arrayList, PracticalConfigurationResponse.CREATOR.createFromParcel(parcel), ExamPracticalConfigurationResponse.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result[] newArray(int i) {
                return new Result[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Result(Boolean bool, String str, Integer num, String str2, String str3, List list, PracticalConfigurationResponse practicalConfigurationResponse, ExamPracticalConfigurationResponse examPracticalConfigurationResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bool, str, r5, r6, r7, r8, r9, r10);
            ExamPracticalConfigurationResponse examPracticalConfigurationResponse2;
            PracticalConfigurationResponse practicalConfigurationResponse2;
            List list2;
            String str4;
            String str5;
            Integer num2;
            str = (i & 2) != 0 ? null : str;
            if ((i & 4) != 0) {
                examPracticalConfigurationResponse2 = examPracticalConfigurationResponse;
                practicalConfigurationResponse2 = practicalConfigurationResponse;
                list2 = list;
                str4 = str3;
                str5 = str2;
                num2 = null;
            } else {
                examPracticalConfigurationResponse2 = examPracticalConfigurationResponse;
                practicalConfigurationResponse2 = practicalConfigurationResponse;
                list2 = list;
                str4 = str3;
                str5 = str2;
                num2 = num;
            }
        }

        public static /* synthetic */ Result copy$default(Result result, Boolean bool, String str, Integer num, String str2, String str3, List list, PracticalConfigurationResponse practicalConfigurationResponse, ExamPracticalConfigurationResponse examPracticalConfigurationResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = result.success;
            }
            if ((i & 2) != 0) {
                str = result.message;
            }
            if ((i & 4) != 0) {
                num = result.status;
            }
            if ((i & 8) != 0) {
                str2 = result.code;
            }
            if ((i & 16) != 0) {
                str3 = result.date;
            }
            if ((i & 32) != 0) {
                list = result.data;
            }
            if ((i & 64) != 0) {
                practicalConfigurationResponse = result.practicalConfiguration;
            }
            if ((i & Uuid.SIZE_BITS) != 0) {
                examPracticalConfigurationResponse = result.examPracticalConfiguration;
            }
            PracticalConfigurationResponse practicalConfigurationResponse2 = practicalConfigurationResponse;
            ExamPracticalConfigurationResponse examPracticalConfigurationResponse2 = examPracticalConfigurationResponse;
            String str4 = str3;
            List list2 = list;
            return result.copy(bool, str, num, str2, str4, list2, practicalConfigurationResponse2, examPracticalConfigurationResponse2);
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
        public final Integer getStatus() {
            return this.status;
        }

        /* renamed from: component4, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        /* renamed from: component5, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        public final List<SessionInstructorObjectResponse> component6() {
            return this.data;
        }

        /* renamed from: component7, reason: from getter */
        public final PracticalConfigurationResponse getPracticalConfiguration() {
            return this.practicalConfiguration;
        }

        /* renamed from: component8, reason: from getter */
        public final ExamPracticalConfigurationResponse getExamPracticalConfiguration() {
            return this.examPracticalConfiguration;
        }

        public final Result copy(Boolean success, String message, Integer status, String code, String date, List<SessionInstructorObjectResponse> data, PracticalConfigurationResponse practicalConfiguration, ExamPracticalConfigurationResponse examPracticalConfiguration) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(practicalConfiguration, "practicalConfiguration");
            Intrinsics.checkNotNullParameter(examPracticalConfiguration, "examPracticalConfiguration");
            return new Result(success, message, status, code, date, data, practicalConfiguration, examPracticalConfiguration);
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
            return Intrinsics.areEqual(this.success, result.success) && Intrinsics.areEqual(this.message, result.message) && Intrinsics.areEqual(this.status, result.status) && Intrinsics.areEqual(this.code, result.code) && Intrinsics.areEqual(this.date, result.date) && Intrinsics.areEqual(this.data, result.data) && Intrinsics.areEqual(this.practicalConfiguration, result.practicalConfiguration) && Intrinsics.areEqual(this.examPracticalConfiguration, result.examPracticalConfiguration);
        }

        @Override // com.gse.aulapp.model.response.GeneralResponse
        public String getCode() {
            return this.code;
        }

        public final List<SessionInstructorObjectResponse> getData() {
            return this.data;
        }

        public final String getDate() {
            return this.date;
        }

        public final ExamPracticalConfigurationResponse getExamPracticalConfiguration() {
            return this.examPracticalConfiguration;
        }

        @Override // com.gse.aulapp.model.response.GeneralResponse
        public String getMessage() {
            return this.message;
        }

        public final PracticalConfigurationResponse getPracticalConfiguration() {
            return this.practicalConfiguration;
        }

        @Override // com.gse.aulapp.model.response.GeneralResponse
        public Integer getStatus() {
            return this.status;
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
            Integer num = this.status;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.code;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.date;
            return this.examPracticalConfiguration.hashCode() + ((this.practicalConfiguration.hashCode() + ((this.data.hashCode() + ((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31)) * 31)) * 31);
        }

        @Override // com.gse.aulapp.model.response.GeneralResponse
        public void setCode(String str) {
            this.code = str;
        }

        public final void setData(List<SessionInstructorObjectResponse> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.data = list;
        }

        public final void setDate(String str) {
            this.date = str;
        }

        public final void setExamPracticalConfiguration(ExamPracticalConfigurationResponse examPracticalConfigurationResponse) {
            Intrinsics.checkNotNullParameter(examPracticalConfigurationResponse, "<set-?>");
            this.examPracticalConfiguration = examPracticalConfigurationResponse;
        }

        @Override // com.gse.aulapp.model.response.GeneralResponse
        public void setMessage(String str) {
            this.message = str;
        }

        public final void setPracticalConfiguration(PracticalConfigurationResponse practicalConfigurationResponse) {
            Intrinsics.checkNotNullParameter(practicalConfigurationResponse, "<set-?>");
            this.practicalConfiguration = practicalConfigurationResponse;
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
            String str3 = this.date;
            List<SessionInstructorObjectResponse> list = this.data;
            PracticalConfigurationResponse practicalConfigurationResponse = this.practicalConfiguration;
            ExamPracticalConfigurationResponse examPracticalConfigurationResponse = this.examPracticalConfiguration;
            StringBuilder q = a.q(bool, "Result(success=", ", message=", str, ", status=");
            q.append(num);
            q.append(", code=");
            q.append(str2);
            q.append(", date=");
            q.append(str3);
            q.append(", data=");
            q.append(list);
            q.append(", practicalConfiguration=");
            q.append(practicalConfigurationResponse);
            q.append(", examPracticalConfiguration=");
            q.append(examPracticalConfigurationResponse);
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
            dest.writeString(this.date);
            List<SessionInstructorObjectResponse> list = this.data;
            dest.writeInt(list.size());
            Iterator<SessionInstructorObjectResponse> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            this.practicalConfiguration.writeToParcel(dest, flags);
            this.examPracticalConfiguration.writeToParcel(dest, flags);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Result(Boolean bool, String str, Integer num, String str2, String str3, List<SessionInstructorObjectResponse> data, PracticalConfigurationResponse practicalConfiguration, ExamPracticalConfigurationResponse examPracticalConfiguration) {
            super(bool, str, num, str2);
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(practicalConfiguration, "practicalConfiguration");
            Intrinsics.checkNotNullParameter(examPracticalConfiguration, "examPracticalConfiguration");
            this.success = bool;
            this.message = str;
            this.status = num;
            this.code = str2;
            this.date = str3;
            this.data = data;
            this.practicalConfiguration = practicalConfiguration;
            this.examPracticalConfiguration = examPracticalConfiguration;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ SessionInstructorResponse(Integer num, String str, String str2, Result result, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
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

    public static /* synthetic */ SessionInstructorResponse copy$default(SessionInstructorResponse sessionInstructorResponse, Integer num, String str, String str2, Result result, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = sessionInstructorResponse.statusCode;
        }
        if ((i & 2) != 0) {
            str = sessionInstructorResponse.statusMessage;
        }
        if ((i & 4) != 0) {
            str2 = sessionInstructorResponse.generalMessage;
        }
        if ((i & 8) != 0) {
            result = sessionInstructorResponse.result;
        }
        if ((i & 16) != 0) {
            str3 = sessionInstructorResponse.url;
        }
        String str4 = str3;
        String str5 = str2;
        return sessionInstructorResponse.copy(num, str, str5, result, str4);
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

    public final SessionInstructorResponse copy(Integer statusCode, String statusMessage, String generalMessage, Result result, String url) {
        return new SessionInstructorResponse(statusCode, statusMessage, generalMessage, result, url);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionInstructorResponse)) {
            return false;
        }
        SessionInstructorResponse sessionInstructorResponse = (SessionInstructorResponse) other;
        return Intrinsics.areEqual(this.statusCode, sessionInstructorResponse.statusCode) && Intrinsics.areEqual(this.statusMessage, sessionInstructorResponse.statusMessage) && Intrinsics.areEqual(this.generalMessage, sessionInstructorResponse.generalMessage) && Intrinsics.areEqual(this.result, sessionInstructorResponse.result) && Intrinsics.areEqual(this.url, sessionInstructorResponse.url);
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
        Integer statusCode = getStatusCode();
        String statusMessage = getStatusMessage();
        String generalMessage = getGeneralMessage();
        Result result = this.result;
        StringBuilder p = x5.p("SessionInstructorResponse{statusCode=", statusCode, ", statusMessage=", statusMessage, ", message=");
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

    public SessionInstructorResponse(Integer num, String str, String str2, Result result, String str3) {
        super(num, str, str2);
        this.statusCode = num;
        this.statusMessage = str;
        this.generalMessage = str2;
        this.result = result;
        this.url = str3;
    }
}
