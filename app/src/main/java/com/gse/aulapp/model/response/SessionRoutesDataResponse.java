package com.gse.aulapp.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.q;
import co.ceduladigital.sdk.x5;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fHÆ\u0003J±\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fHÆ\u0001J\u0006\u00102\u001a\u000203J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u000203HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001J\u0016\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u000203R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"¨\u0006?"}, d2 = {"Lcom/gse/aulapp/model/response/SessionRoutesDataResponse;", "Landroid/os/Parcelable;", "date", BuildConfig.FLAVOR, "start", "end", "type", "apprentice", "instructor", "vehicle", "category", "classroom", "cellphoneNumber", "diff", "points", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/response/SessionRoutePointResponse;", "questions", "Lcom/gse/aulapp/model/response/SessionRouteQuestionResponse;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getDate", "()Ljava/lang/String;", "getStart", "getEnd", "getType", "getApprentice", "getInstructor", "getVehicle", "getCategory", "getClassroom", "getCellphoneNumber", "getDiff", "getPoints", "()Ljava/util/List;", "getQuestions", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "describeContents", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SessionRoutesDataResponse implements Parcelable {
    public static final Parcelable.Creator<SessionRoutesDataResponse> CREATOR = new Creator();

    @SerializedName("apprentice")
    private final String apprentice;

    @SerializedName("category")
    private final String category;

    @SerializedName("cellphoneNumber")
    private final String cellphoneNumber;

    @SerializedName("classroom")
    private final String classroom;

    @SerializedName("date")
    private final String date;

    @SerializedName("diff")
    private final String diff;

    @SerializedName("end")
    private final String end;

    @SerializedName("instructor")
    private final String instructor;

    @SerializedName("points")
    private final List<SessionRoutePointResponse> points;

    @SerializedName("questions")
    private final List<SessionRouteQuestionResponse> questions;

    @SerializedName("start")
    private final String start;

    @SerializedName("type")
    private final String type;

    @SerializedName("vehicle")
    private final String vehicle;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SessionRoutesDataResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SessionRoutesDataResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = q.b(SessionRoutePointResponse.CREATOR, parcel, arrayList3, i, 1);
                    readInt = readInt;
                }
                arrayList = arrayList3;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = q.b(SessionRouteQuestionResponse.CREATOR, parcel, arrayList4, i2, 1);
                    readInt2 = readInt2;
                    readString = readString;
                }
                arrayList2 = arrayList4;
            }
            return new SessionRoutesDataResponse(readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, arrayList, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SessionRoutesDataResponse[] newArray(int i) {
            return new SessionRoutesDataResponse[i];
        }
    }

    public SessionRoutesDataResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public static /* synthetic */ SessionRoutesDataResponse copy$default(SessionRoutesDataResponse sessionRoutesDataResponse, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sessionRoutesDataResponse.date;
        }
        return sessionRoutesDataResponse.copy(str, (i & 2) != 0 ? sessionRoutesDataResponse.start : str2, (i & 4) != 0 ? sessionRoutesDataResponse.end : str3, (i & 8) != 0 ? sessionRoutesDataResponse.type : str4, (i & 16) != 0 ? sessionRoutesDataResponse.apprentice : str5, (i & 32) != 0 ? sessionRoutesDataResponse.instructor : str6, (i & 64) != 0 ? sessionRoutesDataResponse.vehicle : str7, (i & 128) != 0 ? sessionRoutesDataResponse.category : str8, (i & 256) != 0 ? sessionRoutesDataResponse.classroom : str9, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? sessionRoutesDataResponse.cellphoneNumber : str10, (i & 1024) != 0 ? sessionRoutesDataResponse.diff : str11, (i & 2048) != 0 ? sessionRoutesDataResponse.points : list, (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? sessionRoutesDataResponse.questions : list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: component10, reason: from getter */
    public final String getCellphoneNumber() {
        return this.cellphoneNumber;
    }

    /* renamed from: component11, reason: from getter */
    public final String getDiff() {
        return this.diff;
    }

    public final List<SessionRoutePointResponse> component12() {
        return this.points;
    }

    public final List<SessionRouteQuestionResponse> component13() {
        return this.questions;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStart() {
        return this.start;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEnd() {
        return this.end;
    }

    /* renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component5, reason: from getter */
    public final String getApprentice() {
        return this.apprentice;
    }

    /* renamed from: component6, reason: from getter */
    public final String getInstructor() {
        return this.instructor;
    }

    /* renamed from: component7, reason: from getter */
    public final String getVehicle() {
        return this.vehicle;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* renamed from: component9, reason: from getter */
    public final String getClassroom() {
        return this.classroom;
    }

    public final SessionRoutesDataResponse copy(String date, String start, String end, String type, String apprentice, String instructor, String vehicle, String category, String classroom, String cellphoneNumber, String diff, List<SessionRoutePointResponse> points, List<SessionRouteQuestionResponse> questions) {
        return new SessionRoutesDataResponse(date, start, end, type, apprentice, instructor, vehicle, category, classroom, cellphoneNumber, diff, points, questions);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionRoutesDataResponse)) {
            return false;
        }
        SessionRoutesDataResponse sessionRoutesDataResponse = (SessionRoutesDataResponse) other;
        return Intrinsics.areEqual(this.date, sessionRoutesDataResponse.date) && Intrinsics.areEqual(this.start, sessionRoutesDataResponse.start) && Intrinsics.areEqual(this.end, sessionRoutesDataResponse.end) && Intrinsics.areEqual(this.type, sessionRoutesDataResponse.type) && Intrinsics.areEqual(this.apprentice, sessionRoutesDataResponse.apprentice) && Intrinsics.areEqual(this.instructor, sessionRoutesDataResponse.instructor) && Intrinsics.areEqual(this.vehicle, sessionRoutesDataResponse.vehicle) && Intrinsics.areEqual(this.category, sessionRoutesDataResponse.category) && Intrinsics.areEqual(this.classroom, sessionRoutesDataResponse.classroom) && Intrinsics.areEqual(this.cellphoneNumber, sessionRoutesDataResponse.cellphoneNumber) && Intrinsics.areEqual(this.diff, sessionRoutesDataResponse.diff) && Intrinsics.areEqual(this.points, sessionRoutesDataResponse.points) && Intrinsics.areEqual(this.questions, sessionRoutesDataResponse.questions);
    }

    public final String getApprentice() {
        return this.apprentice;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getCellphoneNumber() {
        return this.cellphoneNumber;
    }

    public final String getClassroom() {
        return this.classroom;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getDiff() {
        return this.diff;
    }

    public final String getEnd() {
        return this.end;
    }

    public final String getInstructor() {
        return this.instructor;
    }

    public final List<SessionRoutePointResponse> getPoints() {
        return this.points;
    }

    public final List<SessionRouteQuestionResponse> getQuestions() {
        return this.questions;
    }

    public final String getStart() {
        return this.start;
    }

    public final String getType() {
        return this.type;
    }

    public final String getVehicle() {
        return this.vehicle;
    }

    public int hashCode() {
        String str = this.date;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.start;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.end;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.type;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.apprentice;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.instructor;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.vehicle;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.category;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.classroom;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.cellphoneNumber;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.diff;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        List<SessionRoutePointResponse> list = this.points;
        int hashCode12 = (hashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        List<SessionRouteQuestionResponse> list2 = this.questions;
        return hashCode12 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        String str = this.date;
        String str2 = this.start;
        String str3 = this.end;
        String str4 = this.type;
        String str5 = this.apprentice;
        String str6 = this.instructor;
        String str7 = this.vehicle;
        String str8 = this.category;
        String str9 = this.classroom;
        String str10 = this.cellphoneNumber;
        String str11 = this.diff;
        List<SessionRoutePointResponse> list = this.points;
        List<SessionRouteQuestionResponse> list2 = this.questions;
        StringBuilder r = x5.r("SessionRoutesDataResponse(date=", str, ", start=", str2, ", end=");
        x5.z(r, str3, ", type=", str4, ", apprentice=");
        x5.z(r, str5, ", instructor=", str6, ", vehicle=");
        x5.z(r, str7, ", category=", str8, ", classroom=");
        x5.z(r, str9, ", cellphoneNumber=", str10, ", diff=");
        r.append(str11);
        r.append(", points=");
        r.append(list);
        r.append(", questions=");
        r.append(list2);
        r.append(")");
        return r.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.date);
        dest.writeString(this.start);
        dest.writeString(this.end);
        dest.writeString(this.type);
        dest.writeString(this.apprentice);
        dest.writeString(this.instructor);
        dest.writeString(this.vehicle);
        dest.writeString(this.category);
        dest.writeString(this.classroom);
        dest.writeString(this.cellphoneNumber);
        dest.writeString(this.diff);
        List<SessionRoutePointResponse> list = this.points;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<SessionRoutePointResponse> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        List<SessionRouteQuestionResponse> list2 = this.questions;
        if (list2 == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list2.size());
        Iterator<SessionRouteQuestionResponse> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(dest, flags);
        }
    }

    public SessionRoutesDataResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List<SessionRoutePointResponse> list, List<SessionRouteQuestionResponse> list2) {
        this.date = str;
        this.start = str2;
        this.end = str3;
        this.type = str4;
        this.apprentice = str5;
        this.instructor = str6;
        this.vehicle = str7;
        this.category = str8;
        this.classroom = str9;
        this.cellphoneNumber = str10;
        this.diff = str11;
        this.points = list;
        this.questions = list2;
    }

    public /* synthetic */ SessionRoutesDataResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : list, (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : list2);
    }
}
