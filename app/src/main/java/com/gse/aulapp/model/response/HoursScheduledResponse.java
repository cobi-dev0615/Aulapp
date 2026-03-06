package com.gse.aulapp.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.q;
import co.ceduladigital.sdk.x5;
import com.google.gson.annotations.SerializedName;
import com.gse.aulapp.io.model.response.GeneralResponseDecrypt;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00010BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u001d\u001a\u00020\u0005H\u0016J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003JJ\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010$J\u0006\u0010%\u001a\u00020\u0003J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0003R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014¨\u00061"}, d2 = {"Lcom/gse/aulapp/model/response/HoursScheduledResponse;", "Lcom/gse/aulapp/io/model/response/GeneralResponseDecrypt;", "statusCode", BuildConfig.FLAVOR, "statusMessage", BuildConfig.FLAVOR, "generalMessage", "result", "Lcom/gse/aulapp/model/response/HoursScheduledResponse$Result;", "url", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/gse/aulapp/model/response/HoursScheduledResponse$Result;Ljava/lang/String;)V", "getStatusCode", "()Ljava/lang/Integer;", "setStatusCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getStatusMessage", "()Ljava/lang/String;", "setStatusMessage", "(Ljava/lang/String;)V", "getGeneralMessage", "setGeneralMessage", "getResult", "()Lcom/gse/aulapp/model/response/HoursScheduledResponse$Result;", "setResult", "(Lcom/gse/aulapp/model/response/HoursScheduledResponse$Result;)V", "getUrl", "setUrl", "toString", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/gse/aulapp/model/response/HoursScheduledResponse$Result;Ljava/lang/String;)Lcom/gse/aulapp/model/response/HoursScheduledResponse;", "describeContents", "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "Result", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class HoursScheduledResponse extends GeneralResponseDecrypt {
    public static final Parcelable.Creator<HoursScheduledResponse> CREATOR = new Creator();

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
    public static final class Creator implements Parcelable.Creator<HoursScheduledResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HoursScheduledResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HoursScheduledResponse(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Result.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HoursScheduledResponse[] newArray(int i) {
            return new HoursScheduledResponse[i];
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007HÆ\u0003J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0080\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00072\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010-J\u0006\u0010.\u001a\u00020\nJ\u0013\u0010/\u001a\u00020\u00052\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020\nHÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001J\u0016\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\nR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\"\u0010\u001eR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b#\u0010\u001e¨\u00069"}, d2 = {"Lcom/gse/aulapp/model/response/HoursScheduledResponse$Result;", "Lcom/gse/aulapp/model/response/GeneralResponse;", "code", BuildConfig.FLAVOR, "success", BuildConfig.FLAVOR, "hoursDayByCEA", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/response/HoursScheduledHoursDayByCEAResponse;", "hoursMonth", BuildConfig.FLAVOR, "dayInformation", "Lcom/gse/aulapp/model/response/HoursScheduledMonthInformationResponse;", "monthInformation", "instructorDay", "instructorMonth", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "getSuccess", "()Ljava/lang/Boolean;", "setSuccess", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getHoursDayByCEA", "()Ljava/util/List;", "getHoursMonth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDayInformation", "getMonthInformation", "getInstructorDay", "getInstructorMonth", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/gse/aulapp/model/response/HoursScheduledResponse$Result;", "describeContents", "equals", "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Result extends GeneralResponse {
        public static final Parcelable.Creator<Result> CREATOR = new Creator();

        @SerializedName("code")
        private String code;

        @SerializedName("dayInformation")
        private final List<HoursScheduledMonthInformationResponse> dayInformation;

        @SerializedName("hoursDayByCEA")
        private final List<HoursScheduledHoursDayByCEAResponse> hoursDayByCEA;

        @SerializedName("hoursMonth")
        private final Integer hoursMonth;

        @SerializedName("instructorDay")
        private final Integer instructorDay;

        @SerializedName("instructorMonth")
        private final Integer instructorMonth;

        @SerializedName("monthInformation")
        private final List<HoursScheduledMonthInformationResponse> monthInformation;

        @SerializedName("success")
        private Boolean success;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Result> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result createFromParcel(Parcel parcel) {
                Boolean valueOf;
                ArrayList arrayList;
                ArrayList arrayList2;
                ArrayList arrayList3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                int i = 0;
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(readInt);
                    int i2 = 0;
                    while (i2 != readInt) {
                        i2 = q.b(HoursScheduledHoursDayByCEAResponse.CREATOR, parcel, arrayList4, i2, 1);
                    }
                    arrayList = arrayList4;
                }
                Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList5 = new ArrayList(readInt2);
                    int i3 = 0;
                    while (i3 != readInt2) {
                        i3 = q.b(HoursScheduledMonthInformationResponse.CREATOR, parcel, arrayList5, i3, 1);
                    }
                    arrayList2 = arrayList5;
                }
                if (parcel.readInt() == 0) {
                    arrayList3 = null;
                } else {
                    int readInt3 = parcel.readInt();
                    ArrayList arrayList6 = new ArrayList(readInt3);
                    while (i != readInt3) {
                        i = q.b(HoursScheduledMonthInformationResponse.CREATOR, parcel, arrayList6, i, 1);
                    }
                    arrayList3 = arrayList6;
                }
                return new Result(readString, valueOf, arrayList, valueOf2, arrayList2, arrayList3, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result[] newArray(int i) {
                return new Result[i];
            }
        }

        public /* synthetic */ Result(String str, Boolean bool, List list, Integer num, List list2, List list3, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, bool, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : list3, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : num3);
        }

        public static /* synthetic */ Result copy$default(Result result, String str, Boolean bool, List list, Integer num, List list2, List list3, Integer num2, Integer num3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = result.code;
            }
            if ((i & 2) != 0) {
                bool = result.success;
            }
            if ((i & 4) != 0) {
                list = result.hoursDayByCEA;
            }
            if ((i & 8) != 0) {
                num = result.hoursMonth;
            }
            if ((i & 16) != 0) {
                list2 = result.dayInformation;
            }
            if ((i & 32) != 0) {
                list3 = result.monthInformation;
            }
            if ((i & 64) != 0) {
                num2 = result.instructorDay;
            }
            if ((i & 128) != 0) {
                num3 = result.instructorMonth;
            }
            Integer num4 = num2;
            Integer num5 = num3;
            List list4 = list2;
            List list5 = list3;
            return result.copy(str, bool, list, num, list4, list5, num4, num5);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getSuccess() {
            return this.success;
        }

        public final List<HoursScheduledHoursDayByCEAResponse> component3() {
            return this.hoursDayByCEA;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getHoursMonth() {
            return this.hoursMonth;
        }

        public final List<HoursScheduledMonthInformationResponse> component5() {
            return this.dayInformation;
        }

        public final List<HoursScheduledMonthInformationResponse> component6() {
            return this.monthInformation;
        }

        /* renamed from: component7, reason: from getter */
        public final Integer getInstructorDay() {
            return this.instructorDay;
        }

        /* renamed from: component8, reason: from getter */
        public final Integer getInstructorMonth() {
            return this.instructorMonth;
        }

        public final Result copy(String code, Boolean success, List<HoursScheduledHoursDayByCEAResponse> hoursDayByCEA, Integer hoursMonth, List<HoursScheduledMonthInformationResponse> dayInformation, List<HoursScheduledMonthInformationResponse> monthInformation, Integer instructorDay, Integer instructorMonth) {
            return new Result(code, success, hoursDayByCEA, hoursMonth, dayInformation, monthInformation, instructorDay, instructorMonth);
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
            return Intrinsics.areEqual(this.code, result.code) && Intrinsics.areEqual(this.success, result.success) && Intrinsics.areEqual(this.hoursDayByCEA, result.hoursDayByCEA) && Intrinsics.areEqual(this.hoursMonth, result.hoursMonth) && Intrinsics.areEqual(this.dayInformation, result.dayInformation) && Intrinsics.areEqual(this.monthInformation, result.monthInformation) && Intrinsics.areEqual(this.instructorDay, result.instructorDay) && Intrinsics.areEqual(this.instructorMonth, result.instructorMonth);
        }

        @Override // com.gse.aulapp.model.response.GeneralResponse

        public final List<HoursScheduledMonthInformationResponse> getDayInformation() {
            return this.dayInformation;
        }

        public final List<HoursScheduledHoursDayByCEAResponse> getHoursDayByCEA() {
            return this.hoursDayByCEA;
        }

        public final List<HoursScheduledMonthInformationResponse> getMonthInformation() {
            return this.monthInformation;
        }

        @Override // com.gse.aulapp.model.response.GeneralResponse

        public int hashCode() {
            String str = this.code;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.success;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            List<HoursScheduledHoursDayByCEAResponse> list = this.hoursDayByCEA;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            Integer num = this.hoursMonth;
            int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            List<HoursScheduledMonthInformationResponse> list2 = this.dayInformation;
            int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<HoursScheduledMonthInformationResponse> list3 = this.monthInformation;
            int hashCode6 = (hashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
            Integer num2 = this.instructorDay;
            int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.instructorMonth;
            return hashCode7 + (num3 != null ? num3.hashCode() : 0);
        }

        @Override // com.gse.aulapp.model.response.GeneralResponse
        public void setCode(String str) {
            this.code = str;
        }

        @Override // com.gse.aulapp.model.response.GeneralResponse
        public void setSuccess(Boolean bool) {
            this.success = bool;
        }

        public String toString() {
            return "Result(code=" + this.code + ", success=" + this.success + ", hoursDayByCEA=" + this.hoursDayByCEA + ", hoursMonth=" + this.hoursMonth + ", dayInformation=" + this.dayInformation + ", monthInformation=" + this.monthInformation + ", instructorDay=" + this.instructorDay + ", instructorMonth=" + this.instructorMonth + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.code);
            Boolean bool = this.success;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                x5.v(dest, 1, bool);
            }
            List<HoursScheduledHoursDayByCEAResponse> list = this.hoursDayByCEA;
            if (list == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list.size());
                Iterator<HoursScheduledHoursDayByCEAResponse> it = list.iterator();
                while (it.hasNext()) {
                    it.next().writeToParcel(dest, flags);
                }
            }
            Integer num = this.hoursMonth;
            if (num == null) {
                dest.writeInt(0);
            } else {
                x5.w(dest, 1, num);
            }
            List<HoursScheduledMonthInformationResponse> list2 = this.dayInformation;
            if (list2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list2.size());
                Iterator<HoursScheduledMonthInformationResponse> it2 = list2.iterator();
                while (it2.hasNext()) {
                    it2.next().writeToParcel(dest, flags);
                }
            }
            List<HoursScheduledMonthInformationResponse> list3 = this.monthInformation;
            if (list3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list3.size());
                Iterator<HoursScheduledMonthInformationResponse> it3 = list3.iterator();
                while (it3.hasNext()) {
                    it3.next().writeToParcel(dest, flags);
                }
            }
            Integer num2 = this.instructorDay;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                x5.w(dest, 1, num2);
            }
            Integer num3 = this.instructorMonth;
            if (num3 == null) {
                dest.writeInt(0);
            } else {
                x5.w(dest, 1, num3);
            }
        }

        public Result(String str, Boolean bool, List<HoursScheduledHoursDayByCEAResponse> list, Integer num, List<HoursScheduledMonthInformationResponse> list2, List<HoursScheduledMonthInformationResponse> list3, Integer num2, Integer num3) {
            super(bool, null, null, str);
            this.code = str;
            this.success = bool;
            this.hoursDayByCEA = list;
            this.hoursMonth = num;
            this.dayInformation = list2;
            this.monthInformation = list3;
            this.instructorDay = num2;
            this.instructorMonth = num3;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ HoursScheduledResponse(Integer num, String str, String str2, Result result, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
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

    public static /* synthetic */ HoursScheduledResponse copy$default(HoursScheduledResponse hoursScheduledResponse, Integer num, String str, String str2, Result result, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = hoursScheduledResponse.statusCode;
        }
        if ((i & 2) != 0) {
            str = hoursScheduledResponse.statusMessage;
        }
        if ((i & 4) != 0) {
            str2 = hoursScheduledResponse.generalMessage;
        }
        if ((i & 8) != 0) {
            result = hoursScheduledResponse.result;
        }
        if ((i & 16) != 0) {
            str3 = hoursScheduledResponse.url;
        }
        String str4 = str3;
        String str5 = str2;
        return hoursScheduledResponse.copy(num, str, str5, result, str4);
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

    public final HoursScheduledResponse copy(Integer statusCode, String statusMessage, String generalMessage, Result result, String url) {
        return new HoursScheduledResponse(statusCode, statusMessage, generalMessage, result, url);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HoursScheduledResponse)) {
            return false;
        }
        HoursScheduledResponse hoursScheduledResponse = (HoursScheduledResponse) other;
        return Intrinsics.areEqual(this.statusCode, hoursScheduledResponse.statusCode) && Intrinsics.areEqual(this.statusMessage, hoursScheduledResponse.statusMessage) && Intrinsics.areEqual(this.generalMessage, hoursScheduledResponse.generalMessage) && Intrinsics.areEqual(this.result, hoursScheduledResponse.result) && Intrinsics.areEqual(this.url, hoursScheduledResponse.url);
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
        StringBuilder p = x5.p("HoursScheduledResponse{statusCode=", statusCode, ", statusMessage=", statusMessage, ", message=");
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

    public HoursScheduledResponse(Integer num, String str, String str2, Result result, String str3) {
        super(num, str, str2);
        this.statusCode = num;
        this.statusMessage = str;
        this.generalMessage = str2;
        this.result = result;
        this.url = str3;
    }
}
