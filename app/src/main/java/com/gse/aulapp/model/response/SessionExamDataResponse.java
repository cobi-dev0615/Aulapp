package com.gse.aulapp.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.x5;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.uuid.Uuid;

@Keep
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bM\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bß\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010S\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010&J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010Z\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u00107J\u0010\u0010[\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u00107J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u001aHÆ\u0003Jæ\u0001\u0010c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÆ\u0001¢\u0006\u0002\u0010dJ\u0006\u0010e\u001a\u00020\u0007J\u0013\u0010f\u001a\u00020\u000f2\b\u0010g\u001a\u0004\u0018\u00010hHÖ\u0003J\t\u0010i\u001a\u00020\u0007HÖ\u0001J\t\u0010j\u001a\u00020\u0003HÖ\u0001J\u0016\u0010k\u001a\u00020l2\u0006\u0010m\u001a\u00020n2\u0006\u0010o\u001a\u00020\u0007R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001e\"\u0004\b+\u0010 R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001e\"\u0004\b-\u0010 R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001e\"\u0004\b/\u0010 R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001e\"\u0004\b1\u0010 R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001e\"\u0004\b3\u0010 R \u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001e\"\u0004\b5\u0010 R\"\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010:\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010:\u001a\u0004\b;\u00107\"\u0004\b<\u00109R \u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001e\"\u0004\b>\u0010 R \u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001e\"\u0004\b@\u0010 R \u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u001e\"\u0004\bB\u0010 R \u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u001e\"\u0004\bD\u0010 R \u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR \u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR \u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010P¨\u0006p"}, d2 = {"Lcom/gse/aulapp/model/response/SessionExamDataResponse;", "Landroid/os/Parcelable;", "Id", BuildConfig.FLAVOR, "validations", "Lcom/gse/aulapp/model/response/ValidationsResponse;", "duration", BuildConfig.FLAVOR, "start", "end", "date", "center", "centerID", "instructorID", "changeVehicle", BuildConfig.FLAVOR, "changeInstructor", "type", "course", "category", "advanceID", "apprentice", "Lcom/gse/aulapp/model/response/ApprenticeResponse;", "vehicle", "Lcom/gse/aulapp/model/response/SessionExamVehicleResponse;", "testData", "Lcom/gse/aulapp/model/response/TestDataResponse;", "<init>", "(Ljava/lang/String;Lcom/gse/aulapp/model/response/ValidationsResponse;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/gse/aulapp/model/response/ApprenticeResponse;Lcom/gse/aulapp/model/response/SessionExamVehicleResponse;Lcom/gse/aulapp/model/response/TestDataResponse;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getValidations", "()Lcom/gse/aulapp/model/response/ValidationsResponse;", "setValidations", "(Lcom/gse/aulapp/model/response/ValidationsResponse;)V", "getDuration", "()Ljava/lang/Integer;", "setDuration", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getStart", "setStart", "getEnd", "setEnd", "getDate", "setDate", "getCenter", "setCenter", "getCenterID", "setCenterID", "getInstructorID", "setInstructorID", "getChangeVehicle", "()Ljava/lang/Boolean;", "setChangeVehicle", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getChangeInstructor", "setChangeInstructor", "getType", "setType", "getCourse", "setCourse", "getCategory", "setCategory", "getAdvanceID", "setAdvanceID", "getApprentice", "()Lcom/gse/aulapp/model/response/ApprenticeResponse;", "setApprentice", "(Lcom/gse/aulapp/model/response/ApprenticeResponse;)V", "getVehicle", "()Lcom/gse/aulapp/model/response/SessionExamVehicleResponse;", "setVehicle", "(Lcom/gse/aulapp/model/response/SessionExamVehicleResponse;)V", "getTestData", "()Lcom/gse/aulapp/model/response/TestDataResponse;", "setTestData", "(Lcom/gse/aulapp/model/response/TestDataResponse;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(Ljava/lang/String;Lcom/gse/aulapp/model/response/ValidationsResponse;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/gse/aulapp/model/response/ApprenticeResponse;Lcom/gse/aulapp/model/response/SessionExamVehicleResponse;Lcom/gse/aulapp/model/response/TestDataResponse;)Lcom/gse/aulapp/model/response/SessionExamDataResponse;", "describeContents", "equals", "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SessionExamDataResponse implements Parcelable {
    public static final Parcelable.Creator<SessionExamDataResponse> CREATOR = new Creator();

    @SerializedName("_id")
    private String Id;

    @SerializedName("advanceID")
    private String advanceID;

    @SerializedName("apprentice")
    private ApprenticeResponse apprentice;

    @SerializedName("category")
    private String category;

    @SerializedName("center")
    private String center;

    @SerializedName("centerID")
    private String centerID;

    @SerializedName("changeInstructor")
    private Boolean changeInstructor;

    @SerializedName("changeVehicle")
    private Boolean changeVehicle;

    @SerializedName("course")
    private String course;

    @SerializedName("date")
    private String date;

    @SerializedName("duration")
    private Integer duration;

    @SerializedName("end")
    private String end;

    @SerializedName("instructorID")
    private String instructorID;

    @SerializedName("start")
    private String start;

    @SerializedName("testData")
    private TestDataResponse testData;

    @SerializedName("type")
    private String type;

    @SerializedName("validations")
    private ValidationsResponse validations;

    @SerializedName("vehicle")
    private SessionExamVehicleResponse vehicle;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SessionExamDataResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SessionExamDataResponse createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            ValidationsResponse validationsResponse;
            SessionExamVehicleResponse createFromParcel;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            ValidationsResponse createFromParcel2 = parcel.readInt() == 0 ? null : ValidationsResponse.CREATOR.createFromParcel(parcel);
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
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
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            ApprenticeResponse createFromParcel3 = parcel.readInt() == 0 ? null : ApprenticeResponse.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                validationsResponse = createFromParcel2;
                createFromParcel = null;
            } else {
                validationsResponse = createFromParcel2;
                createFromParcel = SessionExamVehicleResponse.CREATOR.createFromParcel(parcel);
            }
            return new SessionExamDataResponse(readString, validationsResponse, valueOf3, readString2, readString3, readString4, readString5, readString6, readString7, valueOf, valueOf2, readString8, readString9, readString10, readString11, createFromParcel3, createFromParcel, parcel.readInt() == 0 ? null : TestDataResponse.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SessionExamDataResponse[] newArray(int i) {
            return new SessionExamDataResponse[i];
        }
    }

    public SessionExamDataResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
    }

    public static /* synthetic */ SessionExamDataResponse copy$default(SessionExamDataResponse sessionExamDataResponse, String str, ValidationsResponse validationsResponse, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, String str8, String str9, String str10, String str11, ApprenticeResponse apprenticeResponse, SessionExamVehicleResponse sessionExamVehicleResponse, TestDataResponse testDataResponse, int i, Object obj) {
        TestDataResponse testDataResponse2;
        SessionExamVehicleResponse sessionExamVehicleResponse2;
        String str12 = (i & 1) != 0 ? sessionExamDataResponse.Id : str;
        ValidationsResponse validationsResponse2 = (i & 2) != 0 ? sessionExamDataResponse.validations : validationsResponse;
        Integer num2 = (i & 4) != 0 ? sessionExamDataResponse.duration : num;
        String str13 = (i & 8) != 0 ? sessionExamDataResponse.start : str2;
        String str14 = (i & 16) != 0 ? sessionExamDataResponse.end : str3;
        String str15 = (i & 32) != 0 ? sessionExamDataResponse.date : str4;
        String str16 = (i & 64) != 0 ? sessionExamDataResponse.center : str5;
        String str17 = (i & Uuid.SIZE_BITS) != 0 ? sessionExamDataResponse.centerID : str6;
        String str18 = (i & 256) != 0 ? sessionExamDataResponse.instructorID : str7;
        Boolean bool3 = (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? sessionExamDataResponse.changeVehicle : bool;
        Boolean bool4 = (i & 1024) != 0 ? sessionExamDataResponse.changeInstructor : bool2;
        String str19 = (i & 2048) != 0 ? sessionExamDataResponse.type : str8;
        String str20 = (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? sessionExamDataResponse.course : str9;
        String str21 = (i & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? sessionExamDataResponse.category : str10;
        String str22 = str12;
        String str23 = (i & 16384) != 0 ? sessionExamDataResponse.advanceID : str11;
        ApprenticeResponse apprenticeResponse2 = (i & 32768) != 0 ? sessionExamDataResponse.apprentice : apprenticeResponse;
        SessionExamVehicleResponse sessionExamVehicleResponse3 = (i & 65536) != 0 ? sessionExamDataResponse.vehicle : sessionExamVehicleResponse;
        if ((i & 131072) != 0) {
            sessionExamVehicleResponse2 = sessionExamVehicleResponse3;
            testDataResponse2 = sessionExamDataResponse.testData;
        } else {
            testDataResponse2 = testDataResponse;
            sessionExamVehicleResponse2 = sessionExamVehicleResponse3;
        }
        return sessionExamDataResponse.copy(str22, validationsResponse2, num2, str13, str14, str15, str16, str17, str18, bool3, bool4, str19, str20, str21, str23, apprenticeResponse2, sessionExamVehicleResponse2, testDataResponse2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.Id;
    }

    /* renamed from: component10, reason: from getter */
    public final Boolean getChangeVehicle() {
        return this.changeVehicle;
    }

    /* renamed from: component11, reason: from getter */
    public final Boolean getChangeInstructor() {
        return this.changeInstructor;
    }

    /* renamed from: component12, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component13, reason: from getter */
    public final String getCourse() {
        return this.course;
    }

    /* renamed from: component14, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* renamed from: component15, reason: from getter */
    public final String getAdvanceID() {
        return this.advanceID;
    }

    /* renamed from: component16, reason: from getter */
    public final ApprenticeResponse getApprentice() {
        return this.apprentice;
    }

    /* renamed from: component17, reason: from getter */
    public final SessionExamVehicleResponse getVehicle() {
        return this.vehicle;
    }

    /* renamed from: component18, reason: from getter */
    public final TestDataResponse getTestData() {
        return this.testData;
    }

    /* renamed from: component2, reason: from getter */
    public final ValidationsResponse getValidations() {
        return this.validations;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getDuration() {
        return this.duration;
    }

    /* renamed from: component4, reason: from getter */
    public final String getStart() {
        return this.start;
    }

    /* renamed from: component5, reason: from getter */
    public final String getEnd() {
        return this.end;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCenter() {
        return this.center;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCenterID() {
        return this.centerID;
    }

    /* renamed from: component9, reason: from getter */
    public final String getInstructorID() {
        return this.instructorID;
    }

    public final SessionExamDataResponse copy(String Id, ValidationsResponse validations, Integer duration, String start, String end, String date, String center, String centerID, String instructorID, Boolean changeVehicle, Boolean changeInstructor, String type, String course, String category, String advanceID, ApprenticeResponse apprentice, SessionExamVehicleResponse vehicle, TestDataResponse testData) {
        return new SessionExamDataResponse(Id, validations, duration, start, end, date, center, centerID, instructorID, changeVehicle, changeInstructor, type, course, category, advanceID, apprentice, vehicle, testData);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionExamDataResponse)) {
            return false;
        }
        SessionExamDataResponse sessionExamDataResponse = (SessionExamDataResponse) other;
        return Intrinsics.areEqual(this.Id, sessionExamDataResponse.Id) && Intrinsics.areEqual(this.validations, sessionExamDataResponse.validations) && Intrinsics.areEqual(this.duration, sessionExamDataResponse.duration) && Intrinsics.areEqual(this.start, sessionExamDataResponse.start) && Intrinsics.areEqual(this.end, sessionExamDataResponse.end) && Intrinsics.areEqual(this.date, sessionExamDataResponse.date) && Intrinsics.areEqual(this.center, sessionExamDataResponse.center) && Intrinsics.areEqual(this.centerID, sessionExamDataResponse.centerID) && Intrinsics.areEqual(this.instructorID, sessionExamDataResponse.instructorID) && Intrinsics.areEqual(this.changeVehicle, sessionExamDataResponse.changeVehicle) && Intrinsics.areEqual(this.changeInstructor, sessionExamDataResponse.changeInstructor) && Intrinsics.areEqual(this.type, sessionExamDataResponse.type) && Intrinsics.areEqual(this.course, sessionExamDataResponse.course) && Intrinsics.areEqual(this.category, sessionExamDataResponse.category) && Intrinsics.areEqual(this.advanceID, sessionExamDataResponse.advanceID) && Intrinsics.areEqual(this.apprentice, sessionExamDataResponse.apprentice) && Intrinsics.areEqual(this.vehicle, sessionExamDataResponse.vehicle) && Intrinsics.areEqual(this.testData, sessionExamDataResponse.testData);
    }

    public final String getAdvanceID() {
        return this.advanceID;
    }

    public final ApprenticeResponse getApprentice() {
        return this.apprentice;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getCenter() {
        return this.center;
    }

    public final String getCenterID() {
        return this.centerID;
    }

    public final Boolean getChangeInstructor() {
        return this.changeInstructor;
    }

    public final Boolean getChangeVehicle() {
        return this.changeVehicle;
    }

    public final String getCourse() {
        return this.course;
    }

    public final String getDate() {
        return this.date;
    }

    public final Integer getDuration() {
        return this.duration;
    }

    public final String getEnd() {
        return this.end;
    }

    public final String getId() {
        return this.Id;
    }

    public final String getInstructorID() {
        return this.instructorID;
    }

    public final String getStart() {
        return this.start;
    }

    public final TestDataResponse getTestData() {
        return this.testData;
    }

    public final String getType() {
        return this.type;
    }

    public final ValidationsResponse getValidations() {
        return this.validations;
    }

    public final SessionExamVehicleResponse getVehicle() {
        return this.vehicle;
    }

    public int hashCode() {
        String str = this.Id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ValidationsResponse validationsResponse = this.validations;
        int hashCode2 = (hashCode + (validationsResponse == null ? 0 : validationsResponse.hashCode())) * 31;
        Integer num = this.duration;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.start;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.end;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.date;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.center;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.centerID;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.instructorID;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.changeVehicle;
        int hashCode10 = (hashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.changeInstructor;
        int hashCode11 = (hashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str8 = this.type;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.course;
        int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.category;
        int hashCode14 = (hashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.advanceID;
        int hashCode15 = (hashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        ApprenticeResponse apprenticeResponse = this.apprentice;
        int hashCode16 = (hashCode15 + (apprenticeResponse == null ? 0 : apprenticeResponse.hashCode())) * 31;
        SessionExamVehicleResponse sessionExamVehicleResponse = this.vehicle;
        int hashCode17 = (hashCode16 + (sessionExamVehicleResponse == null ? 0 : sessionExamVehicleResponse.hashCode())) * 31;
        TestDataResponse testDataResponse = this.testData;
        return hashCode17 + (testDataResponse != null ? testDataResponse.hashCode() : 0);
    }

    public final void setAdvanceID(String str) {
        this.advanceID = str;
    }

    public final void setApprentice(ApprenticeResponse apprenticeResponse) {
        this.apprentice = apprenticeResponse;
    }

    public final void setCategory(String str) {
        this.category = str;
    }

    public final void setCenter(String str) {
        this.center = str;
    }

    public final void setCenterID(String str) {
        this.centerID = str;
    }

    public final void setChangeInstructor(Boolean bool) {
        this.changeInstructor = bool;
    }

    public final void setChangeVehicle(Boolean bool) {
        this.changeVehicle = bool;
    }

    public final void setCourse(String str) {
        this.course = str;
    }

    public final void setDate(String str) {
        this.date = str;
    }

    public final void setDuration(Integer num) {
        this.duration = num;
    }

    public final void setEnd(String str) {
        this.end = str;
    }

    public final void setId(String str) {
        this.Id = str;
    }

    public final void setInstructorID(String str) {
        this.instructorID = str;
    }

    public final void setStart(String str) {
        this.start = str;
    }

    public final void setTestData(TestDataResponse testDataResponse) {
        this.testData = testDataResponse;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setValidations(ValidationsResponse validationsResponse) {
        this.validations = validationsResponse;
    }

    public final void setVehicle(SessionExamVehicleResponse sessionExamVehicleResponse) {
        this.vehicle = sessionExamVehicleResponse;
    }

    public String toString() {
        String str = this.Id;
        ValidationsResponse validationsResponse = this.validations;
        Integer num = this.duration;
        String str2 = this.start;
        String str3 = this.end;
        String str4 = this.date;
        String str5 = this.center;
        String str6 = this.centerID;
        String str7 = this.instructorID;
        Boolean bool = this.changeVehicle;
        Boolean bool2 = this.changeInstructor;
        String str8 = this.type;
        String str9 = this.course;
        String str10 = this.category;
        String str11 = this.advanceID;
        ApprenticeResponse apprenticeResponse = this.apprentice;
        SessionExamVehicleResponse sessionExamVehicleResponse = this.vehicle;
        TestDataResponse testDataResponse = this.testData;
        StringBuilder sb = new StringBuilder("SessionExamDataResponse(Id=");
        sb.append(str);
        sb.append(", validations=");
        sb.append(validationsResponse);
        sb.append(", duration=");
        sb.append(num);
        sb.append(", start=");
        sb.append(str2);
        sb.append(", end=");
        x5.z(sb, str3, ", date=", str4, ", center=");
        x5.z(sb, str5, ", centerID=", str6, ", instructorID=");
        sb.append(str7);
        sb.append(", changeVehicle=");
        sb.append(bool);
        sb.append(", changeInstructor=");
        sb.append(bool2);
        sb.append(", type=");
        sb.append(str8);
        sb.append(", course=");
        x5.z(sb, str9, ", category=", str10, ", advanceID=");
        sb.append(str11);
        sb.append(", apprentice=");
        sb.append(apprenticeResponse);
        sb.append(", vehicle=");
        sb.append(sessionExamVehicleResponse);
        sb.append(", testData=");
        sb.append(testDataResponse);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.Id);
        ValidationsResponse validationsResponse = this.validations;
        if (validationsResponse == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            validationsResponse.writeToParcel(dest, flags);
        }
        Integer num = this.duration;
        if (num == null) {
            dest.writeInt(0);
        } else {
            x5.w(dest, 1, num);
        }
        dest.writeString(this.start);
        dest.writeString(this.end);
        dest.writeString(this.date);
        dest.writeString(this.center);
        dest.writeString(this.centerID);
        dest.writeString(this.instructorID);
        Boolean bool = this.changeVehicle;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            x5.v(dest, 1, bool);
        }
        Boolean bool2 = this.changeInstructor;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            x5.v(dest, 1, bool2);
        }
        dest.writeString(this.type);
        dest.writeString(this.course);
        dest.writeString(this.category);
        dest.writeString(this.advanceID);
        ApprenticeResponse apprenticeResponse = this.apprentice;
        if (apprenticeResponse == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            apprenticeResponse.writeToParcel(dest, flags);
        }
        SessionExamVehicleResponse sessionExamVehicleResponse = this.vehicle;
        if (sessionExamVehicleResponse == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            sessionExamVehicleResponse.writeToParcel(dest, flags);
        }
        TestDataResponse testDataResponse = this.testData;
        if (testDataResponse == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            testDataResponse.writeToParcel(dest, flags);
        }
    }

    public SessionExamDataResponse(String str, ValidationsResponse validationsResponse, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, String str8, String str9, String str10, String str11, ApprenticeResponse apprenticeResponse, SessionExamVehicleResponse sessionExamVehicleResponse, TestDataResponse testDataResponse) {
        this.Id = str;
        this.validations = validationsResponse;
        this.duration = num;
        this.start = str2;
        this.end = str3;
        this.date = str4;
        this.center = str5;
        this.centerID = str6;
        this.instructorID = str7;
        this.changeVehicle = bool;
        this.changeInstructor = bool2;
        this.type = str8;
        this.course = str9;
        this.category = str10;
        this.advanceID = str11;
        this.apprentice = apprenticeResponse;
        this.vehicle = sessionExamVehicleResponse;
        this.testData = testDataResponse;
    }

    public /* synthetic */ SessionExamDataResponse(String str, ValidationsResponse validationsResponse, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, String str8, String str9, String str10, String str11, ApprenticeResponse apprenticeResponse, SessionExamVehicleResponse sessionExamVehicleResponse, TestDataResponse testDataResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : validationsResponse, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & Uuid.SIZE_BITS) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : bool, (i & 1024) != 0 ? null : bool2, (i & 2048) != 0 ? null : str8, (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : str9, (i & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : str10, (i & 16384) != 0 ? null : str11, (i & 32768) != 0 ? null : apprenticeResponse, (i & 65536) != 0 ? null : sessionExamVehicleResponse, (i & 131072) != 0 ? null : testDataResponse);
    }
}
