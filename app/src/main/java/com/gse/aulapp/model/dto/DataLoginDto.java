package com.gse.aulapp.model.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.q;
import co.ceduladigital.sdk.x5;
import com.google.gson.annotations.SerializedName;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bK\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÝ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0019\u0010\u001aJ\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010O\u001a\u00020\nHÆ\u0003J\t\u0010P\u001a\u00020\nHÆ\u0003J\u0011\u0010Q\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u0011\u0010R\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u0010U\u001a\u00020\nHÆ\u0003J\t\u0010V\u001a\u00020\nHÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010Z\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010EJê\u0001\u0010[\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\\J\u0006\u0010]\u001a\u00020^J\u0013\u0010_\u001a\u00020\n2\b\u0010`\u001a\u0004\u0018\u00010aHÖ\u0003J\t\u0010b\u001a\u00020^HÖ\u0001J\t\u0010c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020g2\u0006\u0010h\u001a\u00020^R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001c\"\u0004\b&\u0010\u001eR \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001c\"\u0004\b(\u0010\u001eR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010*R&\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R&\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010/\"\u0004\b3\u00101R \u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001c\"\u0004\b5\u0010\u001eR \u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001e\u0010\u0013\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010*\"\u0004\b;\u0010,R\u001e\u0010\u0014\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010*\"\u0004\b=\u0010,R \u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u001c\"\u0004\b?\u0010\u001eR \u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001c\"\u0004\bA\u0010\u001eR \u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u001c\"\u0004\bC\u0010\u001eR\"\u0010\u0018\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010H\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006i"}, d2 = {"Lcom/gse/aulapp/model/dto/DataLoginDto;", "Landroid/os/Parcelable;", "id", BuildConfig.FLAVOR, "fullName", "role", "email", "docNumber", "docType", "changePass", BuildConfig.FLAVOR, "demoUser", "courses", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/dto/CoursesDto;", "schedulingCategories", "preferredHand", "workedHors", "Lcom/gse/aulapp/model/dto/WorkedHorsDto;", "biometricValidationRNEC", "usingIdenty", "phone", "mobile", "center", "biometricException", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/gse/aulapp/model/dto/WorkedHorsDto;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getFullName", "setFullName", "getRole", "setRole", "getEmail", "setEmail", "getDocNumber", "setDocNumber", "getDocType", "setDocType", "getChangePass", "()Z", "setChangePass", "(Z)V", "getDemoUser", "getCourses", "()Ljava/util/List;", "setCourses", "(Ljava/util/List;)V", "getSchedulingCategories", "setSchedulingCategories", "getPreferredHand", "setPreferredHand", "getWorkedHors", "()Lcom/gse/aulapp/model/dto/WorkedHorsDto;", "setWorkedHors", "(Lcom/gse/aulapp/model/dto/WorkedHorsDto;)V", "getBiometricValidationRNEC", "setBiometricValidationRNEC", "getUsingIdenty", "setUsingIdenty", "getPhone", "setPhone", "getMobile", "setMobile", "getCenter", "setCenter", "getBiometricException", "()Ljava/lang/Boolean;", "setBiometricException", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/gse/aulapp/model/dto/WorkedHorsDto;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/gse/aulapp/model/dto/DataLoginDto;", "describeContents", BuildConfig.FLAVOR, "equals", "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class DataLoginDto implements Parcelable {
    public static final Parcelable.Creator<DataLoginDto> CREATOR = new Creator();

    @SerializedName("biometricException")
    private Boolean biometricException;

    @SerializedName("biometricValidationRNEC")
    private boolean biometricValidationRNEC;

    @SerializedName("center")
    private String center;

    @SerializedName("changePass")
    private boolean changePass;

    @SerializedName("courses")
    private List<CoursesDto> courses;

    @SerializedName("demoUser")
    private final boolean demoUser;

    @SerializedName("docNumber")
    private String docNumber;

    @SerializedName("docType")
    private String docType;

    @SerializedName("email")
    private String email;

    @SerializedName("full_name")
    private String fullName;

    @SerializedName("id")
    private String id;

    @SerializedName("mobile")
    private String mobile;

    @SerializedName("phone")
    private String phone;

    @SerializedName("preferredHand")
    private String preferredHand;

    @SerializedName("role")
    private String role;

    @SerializedName("schedulingCategories")
    private List<String> schedulingCategories;

    @SerializedName("usingIdenty")
    private boolean usingIdenty;

    @SerializedName("workedHors")
    private WorkedHorsDto workedHors;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DataLoginDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final DataLoginDto createFromParcel(Parcel parcel) {
            boolean z;
            WorkedHorsDto workedHorsDto;
            ArrayList arrayList;
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            boolean z3 = parcel.readInt() != 0 ? z : false;
            if (parcel.readInt() == 0) {
                workedHorsDto = null;
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = q.b(CoursesDto.CREATOR, parcel, arrayList2, i, 1);
                }
                workedHorsDto = null;
                arrayList = arrayList2;
            }
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            String readString7 = parcel.readString();
            WorkedHorsDto createFromParcel = parcel.readInt() == 0 ? workedHorsDto : WorkedHorsDto.CREATOR.createFromParcel(parcel);
            boolean z4 = parcel.readInt() != 0;
            boolean z5 = parcel.readInt() != 0;
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = workedHorsDto;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DataLoginDto(readString, readString2, readString3, readString4, readString5, readString6, z2, z3, arrayList, createStringArrayList, readString7, createFromParcel, z4, z5, readString8, readString9, readString10, valueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DataLoginDto[] newArray(int i) {
            return new DataLoginDto[i];
        }
    }

    public DataLoginDto(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, List<CoursesDto> list, List<String> list2, String str7, WorkedHorsDto workedHorsDto, boolean z3, boolean z4, String str8, String str9, String str10, Boolean bool) {
        this.id = str;
        this.fullName = str2;
        this.role = str3;
        this.email = str4;
        this.docNumber = str5;
        this.docType = str6;
        this.changePass = z;
        this.demoUser = z2;
        this.courses = list;
        this.schedulingCategories = list2;
        this.preferredHand = str7;
        this.workedHors = workedHorsDto;
        this.biometricValidationRNEC = z3;
        this.usingIdenty = z4;
        this.phone = str8;
        this.mobile = str9;
        this.center = str10;
        this.biometricException = bool;
    }

    public static /* synthetic */ DataLoginDto copy$default(DataLoginDto dataLoginDto, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, List list, List list2, String str7, WorkedHorsDto workedHorsDto, boolean z3, boolean z4, String str8, String str9, String str10, Boolean bool, int i, Object obj) {
        Boolean bool2;
        String str11;
        String str12 = (i & 1) != 0 ? dataLoginDto.id : str;
        String str13 = (i & 2) != 0 ? dataLoginDto.fullName : str2;
        String str14 = (i & 4) != 0 ? dataLoginDto.role : str3;
        String str15 = (i & 8) != 0 ? dataLoginDto.email : str4;
        String str16 = (i & 16) != 0 ? dataLoginDto.docNumber : str5;
        String str17 = (i & 32) != 0 ? dataLoginDto.docType : str6;
        boolean z5 = (i & 64) != 0 ? dataLoginDto.changePass : z;
        boolean z6 = (i & 128) != 0 ? dataLoginDto.demoUser : z2;
        List list3 = (i & 256) != 0 ? dataLoginDto.courses : list;
        List list4 = (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? dataLoginDto.schedulingCategories : list2;
        String str18 = (i & 1024) != 0 ? dataLoginDto.preferredHand : str7;
        WorkedHorsDto workedHorsDto2 = (i & 2048) != 0 ? dataLoginDto.workedHors : workedHorsDto;
        boolean z7 = (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? dataLoginDto.biometricValidationRNEC : z3;
        boolean z8 = (i & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? dataLoginDto.usingIdenty : z4;
        String str19 = str12;
        String str20 = (i & 16384) != 0 ? dataLoginDto.phone : str8;
        String str21 = (i & 32768) != 0 ? dataLoginDto.mobile : str9;
        String str22 = (i & 65536) != 0 ? dataLoginDto.center : str10;
        if ((i & 131072) != 0) {
            str11 = str22;
            bool2 = dataLoginDto.biometricException;
        } else {
            bool2 = bool;
            str11 = str22;
        }
        return dataLoginDto.copy(str19, str13, str14, str15, str16, str17, z5, z6, list3, list4, str18, workedHorsDto2, z7, z8, str20, str21, str11, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<String> component10() {
        return this.schedulingCategories;
    }

    /* renamed from: component11, reason: from getter */
    public final String getPreferredHand() {
        return this.preferredHand;
    }

    /* renamed from: component12, reason: from getter */
    public final WorkedHorsDto getWorkedHors() {
        return this.workedHors;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getBiometricValidationRNEC() {
        return this.biometricValidationRNEC;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getUsingIdenty() {
        return this.usingIdenty;
    }

    /* renamed from: component15, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: component16, reason: from getter */
    public final String getMobile() {
        return this.mobile;
    }

    /* renamed from: component17, reason: from getter */
    public final String getCenter() {
        return this.center;
    }

    /* renamed from: component18, reason: from getter */
    public final Boolean getBiometricException() {
        return this.biometricException;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    /* renamed from: component4, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDocNumber() {
        return this.docNumber;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDocType() {
        return this.docType;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getChangePass() {
        return this.changePass;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getDemoUser() {
        return this.demoUser;
    }

    public final List<CoursesDto> component9() {
        return this.courses;
    }

    public final DataLoginDto copy(String id, String fullName, String role, String email, String docNumber, String docType, boolean changePass, boolean demoUser, List<CoursesDto> courses, List<String> schedulingCategories, String preferredHand, WorkedHorsDto workedHors, boolean biometricValidationRNEC, boolean usingIdenty, String phone, String mobile, String center, Boolean biometricException) {
        return new DataLoginDto(id, fullName, role, email, docNumber, docType, changePass, demoUser, courses, schedulingCategories, preferredHand, workedHors, biometricValidationRNEC, usingIdenty, phone, mobile, center, biometricException);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataLoginDto)) {
            return false;
        }
        DataLoginDto dataLoginDto = (DataLoginDto) other;
        return Intrinsics.areEqual(this.id, dataLoginDto.id) && Intrinsics.areEqual(this.fullName, dataLoginDto.fullName) && Intrinsics.areEqual(this.role, dataLoginDto.role) && Intrinsics.areEqual(this.email, dataLoginDto.email) && Intrinsics.areEqual(this.docNumber, dataLoginDto.docNumber) && Intrinsics.areEqual(this.docType, dataLoginDto.docType) && this.changePass == dataLoginDto.changePass && this.demoUser == dataLoginDto.demoUser && Intrinsics.areEqual(this.courses, dataLoginDto.courses) && Intrinsics.areEqual(this.schedulingCategories, dataLoginDto.schedulingCategories) && Intrinsics.areEqual(this.preferredHand, dataLoginDto.preferredHand) && Intrinsics.areEqual(this.workedHors, dataLoginDto.workedHors) && this.biometricValidationRNEC == dataLoginDto.biometricValidationRNEC && this.usingIdenty == dataLoginDto.usingIdenty && Intrinsics.areEqual(this.phone, dataLoginDto.phone) && Intrinsics.areEqual(this.mobile, dataLoginDto.mobile) && Intrinsics.areEqual(this.center, dataLoginDto.center) && Intrinsics.areEqual(this.biometricException, dataLoginDto.biometricException);
    }

    public final Boolean getBiometricException() {
        return this.biometricException;
    }

    public final boolean getBiometricValidationRNEC() {
        return this.biometricValidationRNEC;
    }

    public final String getCenter() {
        return this.center;
    }

    public final boolean getChangePass() {
        return this.changePass;
    }

    public final List<CoursesDto> getCourses() {
        return this.courses;
    }

    public final boolean getDemoUser() {
        return this.demoUser;
    }

    public final String getDocNumber() {
        return this.docNumber;
    }

    public final String getDocType() {
        return this.docType;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMobile() {
        return this.mobile;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getPreferredHand() {
        return this.preferredHand;
    }

    public final String getRole() {
        return this.role;
    }

    public final List<String> getSchedulingCategories() {
        return this.schedulingCategories;
    }

    public final boolean getUsingIdenty() {
        return this.usingIdenty;
    }

    public final WorkedHorsDto getWorkedHors() {
        return this.workedHors;
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fullName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.role;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.email;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.docNumber;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.docType;
        int g = a.g(this.demoUser, a.g(this.changePass, (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31, 31), 31);
        List<CoursesDto> list = this.courses;
        int hashCode6 = (g + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.schedulingCategories;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str7 = this.preferredHand;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        WorkedHorsDto workedHorsDto = this.workedHors;
        int g2 = a.g(this.usingIdenty, a.g(this.biometricValidationRNEC, (hashCode8 + (workedHorsDto == null ? 0 : workedHorsDto.hashCode())) * 31, 31), 31);
        String str8 = this.phone;
        int hashCode9 = (g2 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.mobile;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.center;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool = this.biometricException;
        return hashCode11 + (bool != null ? bool.hashCode() : 0);
    }

    public final void setBiometricException(Boolean bool) {
        this.biometricException = bool;
    }

    public final void setBiometricValidationRNEC(boolean z) {
        this.biometricValidationRNEC = z;
    }

    public final void setCenter(String str) {
        this.center = str;
    }

    public final void setChangePass(boolean z) {
        this.changePass = z;
    }

    public final void setCourses(List<CoursesDto> list) {
        this.courses = list;
    }

    public final void setDocNumber(String str) {
        this.docNumber = str;
    }

    public final void setDocType(String str) {
        this.docType = str;
    }

    public final void setEmail(String str) {
        this.email = str;
    }

    public final void setFullName(String str) {
        this.fullName = str;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setMobile(String str) {
        this.mobile = str;
    }

    public final void setPhone(String str) {
        this.phone = str;
    }

    public final void setPreferredHand(String str) {
        this.preferredHand = str;
    }

    public final void setRole(String str) {
        this.role = str;
    }

    public final void setSchedulingCategories(List<String> list) {
        this.schedulingCategories = list;
    }

    public final void setUsingIdenty(boolean z) {
        this.usingIdenty = z;
    }

    public final void setWorkedHors(WorkedHorsDto workedHorsDto) {
        this.workedHors = workedHorsDto;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.fullName;
        String str3 = this.role;
        String str4 = this.email;
        String str5 = this.docNumber;
        String str6 = this.docType;
        boolean z = this.changePass;
        boolean z2 = this.demoUser;
        List<CoursesDto> list = this.courses;
        List<String> list2 = this.schedulingCategories;
        String str7 = this.preferredHand;
        WorkedHorsDto workedHorsDto = this.workedHors;
        boolean z3 = this.biometricValidationRNEC;
        boolean z4 = this.usingIdenty;
        String str8 = this.phone;
        String str9 = this.mobile;
        String str10 = this.center;
        Boolean bool = this.biometricException;
        StringBuilder r = x5.r("DataLoginDto(id=", str, ", fullName=", str2, ", role=");
        x5.z(r, str3, ", email=", str4, ", docNumber=");
        x5.z(r, str5, ", docType=", str6, ", changePass=");
        r.append(z);
        r.append(", demoUser=");
        r.append(z2);
        r.append(", courses=");
        r.append(list);
        r.append(", schedulingCategories=");
        r.append(list2);
        r.append(", preferredHand=");
        r.append(str7);
        r.append(", workedHors=");
        r.append(workedHorsDto);
        r.append(", biometricValidationRNEC=");
        r.append(z3);
        r.append(", usingIdenty=");
        r.append(z4);
        r.append(", phone=");
        x5.z(r, str8, ", mobile=", str9, ", center=");
        r.append(str10);
        r.append(", biometricException=");
        r.append(bool);
        r.append(")");
        return r.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.fullName);
        dest.writeString(this.role);
        dest.writeString(this.email);
        dest.writeString(this.docNumber);
        dest.writeString(this.docType);
        dest.writeInt(this.changePass ? 1 : 0);
        dest.writeInt(this.demoUser ? 1 : 0);
        List<CoursesDto> list = this.courses;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<CoursesDto> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeStringList(this.schedulingCategories);
        dest.writeString(this.preferredHand);
        WorkedHorsDto workedHorsDto = this.workedHors;
        if (workedHorsDto == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            workedHorsDto.writeToParcel(dest, flags);
        }
        dest.writeInt(this.biometricValidationRNEC ? 1 : 0);
        dest.writeInt(this.usingIdenty ? 1 : 0);
        dest.writeString(this.phone);
        dest.writeString(this.mobile);
        dest.writeString(this.center);
        Boolean bool = this.biometricException;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            x5.v(dest, 1, bool);
        }
    }

    public /* synthetic */ DataLoginDto(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, List list, List list2, String str7, WorkedHorsDto workedHorsDto, boolean z3, boolean z4, String str8, String str9, String str10, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, z, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? null : list, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : list2, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : workedHorsDto, z3, z4, (i & 16384) != 0 ? null : str8, (32768 & i) != 0 ? null : str9, (65536 & i) != 0 ? null : str10, (i & 131072) != 0 ? Boolean.FALSE : bool);
    }
}
