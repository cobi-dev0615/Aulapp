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
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bF\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÓ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0019\u0010\u001aJ\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010P\u001a\u00020\nHÆ\u0003J\u0011\u0010Q\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u0011\u0010R\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fHÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u0010U\u001a\u00020\nHÆ\u0003J\t\u0010V\u001a\u00020\nHÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u0010\u0010Z\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010FJà\u0001\u0010[\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\\J\u0006\u0010]\u001a\u00020^J\u0013\u0010_\u001a\u00020\n2\b\u0010`\u001a\u0004\u0018\u00010aHÖ\u0003J\t\u0010b\u001a\u00020^HÖ\u0001J\t\u0010c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020g2\u0006\u0010h\u001a\u00020^R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001c\"\u0004\b&\u0010\u001eR \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001c\"\u0004\b(\u0010\u001eR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R&\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R&\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010.\"\u0004\b2\u00100R \u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001c\"\u0004\b4\u0010\u001eR \u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001e\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010*\"\u0004\b:\u0010,R\u001e\u0010\u0013\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010*\"\u0004\b<\u0010,R \u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001c\"\u0004\b>\u0010\u001eR \u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001c\"\u0004\b@\u0010\u001eR \u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010\u0018\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010I\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H¨\u0006i"}, d2 = {"Lcom/gse/aulapp/model/dto/RefreshToken;", "Landroid/os/Parcelable;", "id", BuildConfig.FLAVOR, "fullName", "role", "email", "docNumber", "docType", "changePass", BuildConfig.FLAVOR, "courses", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/dto/CoursesDto;", "schedulingCategories", "preferredHand", "workedHors", "Lcom/gse/aulapp/model/dto/WorkedHorsDto;", "biometricValidationRNEC", "usingIdenty", "phone", "mobile", "center", "Lcom/gse/aulapp/model/dto/CenterDto;", "userDemo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/gse/aulapp/model/dto/WorkedHorsDto;ZZLjava/lang/String;Ljava/lang/String;Lcom/gse/aulapp/model/dto/CenterDto;Ljava/lang/Boolean;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getFullName", "setFullName", "getRole", "setRole", "getEmail", "setEmail", "getDocNumber", "setDocNumber", "getDocType", "setDocType", "getChangePass", "()Z", "setChangePass", "(Z)V", "getCourses", "()Ljava/util/List;", "setCourses", "(Ljava/util/List;)V", "getSchedulingCategories", "setSchedulingCategories", "getPreferredHand", "setPreferredHand", "getWorkedHors", "()Lcom/gse/aulapp/model/dto/WorkedHorsDto;", "setWorkedHors", "(Lcom/gse/aulapp/model/dto/WorkedHorsDto;)V", "getBiometricValidationRNEC", "setBiometricValidationRNEC", "getUsingIdenty", "setUsingIdenty", "getPhone", "setPhone", "getMobile", "setMobile", "getCenter", "()Lcom/gse/aulapp/model/dto/CenterDto;", "setCenter", "(Lcom/gse/aulapp/model/dto/CenterDto;)V", "getUserDemo", "()Ljava/lang/Boolean;", "setUserDemo", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/gse/aulapp/model/dto/WorkedHorsDto;ZZLjava/lang/String;Ljava/lang/String;Lcom/gse/aulapp/model/dto/CenterDto;Ljava/lang/Boolean;)Lcom/gse/aulapp/model/dto/RefreshToken;", "describeContents", BuildConfig.FLAVOR, "equals", "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RefreshToken implements Parcelable {
    public static final Parcelable.Creator<RefreshToken> CREATOR = new Creator();

    @SerializedName("biometricValidationRNEC")
    private boolean biometricValidationRNEC;

    @SerializedName("center")
    private CenterDto center;

    @SerializedName("changePass")
    private boolean changePass;

    @SerializedName("courses")
    private List<CoursesDto> courses;

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

    @SerializedName("demoUser")
    private Boolean userDemo;

    @SerializedName("usingIdenty")
    private boolean usingIdenty;

    @SerializedName("workedHors")
    private WorkedHorsDto workedHors;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RefreshToken> {
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final RefreshToken createFromParcel(Parcel parcel) {
            boolean z;
            ArrayList arrayList;
            Parcelable parcelable;
            Parcelable parcelable2;
            WorkedHorsDto workedHorsDto;
            boolean z2;
            Parcelable parcelable3;
            boolean z3;
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            boolean z4 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z4 = false;
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
                parcelable = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = q.b(CoursesDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
                parcelable = null;
            }
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            Parcelable parcelable4 = parcelable;
            String readString7 = parcel.readString();
            WorkedHorsDto workedHorsDto2 = (WorkedHorsDto) (parcel.readInt() == 0 ? parcelable4 : WorkedHorsDto.CREATOR.createFromParcel(parcel));
            if (parcel.readInt() != 0) {
                parcelable2 = parcelable4;
                workedHorsDto = workedHorsDto2;
                z2 = z;
            } else {
                parcelable2 = parcelable4;
                workedHorsDto = workedHorsDto2;
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                parcelable3 = parcelable2;
                z3 = z;
            } else {
                parcelable3 = parcelable2;
                z3 = false;
            }
            String readString8 = parcel.readString();
            Parcelable parcelable5 = parcelable3;
            String readString9 = parcel.readString();
            CenterDto centerDto = (CenterDto) (parcel.readInt() == 0 ? parcelable5 : CenterDto.CREATOR.createFromParcel(parcel));
            if (parcel.readInt() == 0) {
                valueOf = parcelable5;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new RefreshToken(readString, readString2, readString3, readString4, readString5, readString6, z4, arrayList, createStringArrayList, readString7, workedHorsDto, z2, z3, readString8, readString9, centerDto, valueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RefreshToken[] newArray(int i) {
            return new RefreshToken[i];
        }
    }

    public RefreshToken(String str, String str2, String str3, String str4, String str5, String str6, boolean z, List<CoursesDto> list, List<String> list2, String str7, WorkedHorsDto workedHorsDto, boolean z2, boolean z3, String str8, String str9, CenterDto centerDto, Boolean bool) {
        this.id = str;
        this.fullName = str2;
        this.role = str3;
        this.email = str4;
        this.docNumber = str5;
        this.docType = str6;
        this.changePass = z;
        this.courses = list;
        this.schedulingCategories = list2;
        this.preferredHand = str7;
        this.workedHors = workedHorsDto;
        this.biometricValidationRNEC = z2;
        this.usingIdenty = z3;
        this.phone = str8;
        this.mobile = str9;
        this.center = centerDto;
        this.userDemo = bool;
    }

    public static /* synthetic */ RefreshToken copy$default(RefreshToken refreshToken, String str, String str2, String str3, String str4, String str5, String str6, boolean z, List list, List list2, String str7, WorkedHorsDto workedHorsDto, boolean z2, boolean z3, String str8, String str9, CenterDto centerDto, Boolean bool, int i, Object obj) {
        Boolean bool2;
        CenterDto centerDto2;
        String str10;
        RefreshToken refreshToken2;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        boolean z4;
        List list3;
        List list4;
        String str17;
        WorkedHorsDto workedHorsDto2;
        boolean z5;
        boolean z6;
        String str18;
        String str19 = (i & 1) != 0 ? refreshToken.id : str;
        String str20 = (i & 2) != 0 ? refreshToken.fullName : str2;
        String str21 = (i & 4) != 0 ? refreshToken.role : str3;
        String str22 = (i & 8) != 0 ? refreshToken.email : str4;
        String str23 = (i & 16) != 0 ? refreshToken.docNumber : str5;
        String str24 = (i & 32) != 0 ? refreshToken.docType : str6;
        boolean z7 = (i & 64) != 0 ? refreshToken.changePass : z;
        List list5 = (i & 128) != 0 ? refreshToken.courses : list;
        List list6 = (i & 256) != 0 ? refreshToken.schedulingCategories : list2;
        String str25 = (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? refreshToken.preferredHand : str7;
        WorkedHorsDto workedHorsDto3 = (i & 1024) != 0 ? refreshToken.workedHors : workedHorsDto;
        boolean z8 = (i & 2048) != 0 ? refreshToken.biometricValidationRNEC : z2;
        boolean z9 = (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? refreshToken.usingIdenty : z3;
        String str26 = (i & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? refreshToken.phone : str8;
        String str27 = str19;
        String str28 = (i & 16384) != 0 ? refreshToken.mobile : str9;
        CenterDto centerDto3 = (i & 32768) != 0 ? refreshToken.center : centerDto;
        if ((i & 65536) != 0) {
            centerDto2 = centerDto3;
            bool2 = refreshToken.userDemo;
            str11 = str28;
            str12 = str20;
            str13 = str21;
            str14 = str22;
            str15 = str23;
            str16 = str24;
            z4 = z7;
            list3 = list5;
            list4 = list6;
            str17 = str25;
            workedHorsDto2 = workedHorsDto3;
            z5 = z8;
            z6 = z9;
            str18 = str26;
            str10 = str27;
            refreshToken2 = refreshToken;
        } else {
            bool2 = bool;
            centerDto2 = centerDto3;
            str10 = str27;
            refreshToken2 = refreshToken;
            str11 = str28;
            str12 = str20;
            str13 = str21;
            str14 = str22;
            str15 = str23;
            str16 = str24;
            z4 = z7;
            list3 = list5;
            list4 = list6;
            str17 = str25;
            workedHorsDto2 = workedHorsDto3;
            z5 = z8;
            z6 = z9;
            str18 = str26;
        }
        return refreshToken2.copy(str10, str12, str13, str14, str15, str16, z4, list3, list4, str17, workedHorsDto2, z5, z6, str18, str11, centerDto2, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getPreferredHand() {
        return this.preferredHand;
    }

    /* renamed from: component11, reason: from getter */
    public final WorkedHorsDto getWorkedHors() {
        return this.workedHors;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getBiometricValidationRNEC() {
        return this.biometricValidationRNEC;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getUsingIdenty() {
        return this.usingIdenty;
    }

    /* renamed from: component14, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: component15, reason: from getter */
    public final String getMobile() {
        return this.mobile;
    }

    /* renamed from: component16, reason: from getter */
    public final CenterDto getCenter() {
        return this.center;
    }

    /* renamed from: component17, reason: from getter */
    public final Boolean getUserDemo() {
        return this.userDemo;
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

    public final List<CoursesDto> component8() {
        return this.courses;
    }

    public final List<String> component9() {
        return this.schedulingCategories;
    }

    public final RefreshToken copy(String id, String fullName, String role, String email, String docNumber, String docType, boolean changePass, List<CoursesDto> courses, List<String> schedulingCategories, String preferredHand, WorkedHorsDto workedHors, boolean biometricValidationRNEC, boolean usingIdenty, String phone, String mobile, CenterDto center, Boolean userDemo) {
        return new RefreshToken(id, fullName, role, email, docNumber, docType, changePass, courses, schedulingCategories, preferredHand, workedHors, biometricValidationRNEC, usingIdenty, phone, mobile, center, userDemo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RefreshToken)) {
            return false;
        }
        RefreshToken refreshToken = (RefreshToken) other;
        return Intrinsics.areEqual(this.id, refreshToken.id) && Intrinsics.areEqual(this.fullName, refreshToken.fullName) && Intrinsics.areEqual(this.role, refreshToken.role) && Intrinsics.areEqual(this.email, refreshToken.email) && Intrinsics.areEqual(this.docNumber, refreshToken.docNumber) && Intrinsics.areEqual(this.docType, refreshToken.docType) && this.changePass == refreshToken.changePass && Intrinsics.areEqual(this.courses, refreshToken.courses) && Intrinsics.areEqual(this.schedulingCategories, refreshToken.schedulingCategories) && Intrinsics.areEqual(this.preferredHand, refreshToken.preferredHand) && Intrinsics.areEqual(this.workedHors, refreshToken.workedHors) && this.biometricValidationRNEC == refreshToken.biometricValidationRNEC && this.usingIdenty == refreshToken.usingIdenty && Intrinsics.areEqual(this.phone, refreshToken.phone) && Intrinsics.areEqual(this.mobile, refreshToken.mobile) && Intrinsics.areEqual(this.center, refreshToken.center) && Intrinsics.areEqual(this.userDemo, refreshToken.userDemo);
    }

    public final boolean getBiometricValidationRNEC() {
        return this.biometricValidationRNEC;
    }

    public final CenterDto getCenter() {
        return this.center;
    }

    public final boolean getChangePass() {
        return this.changePass;
    }

    public final List<CoursesDto> getCourses() {
        return this.courses;
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

    public final Boolean getUserDemo() {
        return this.userDemo;
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
        int g = a.g(this.changePass, (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31, 31);
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
        CenterDto centerDto = this.center;
        int hashCode11 = (hashCode10 + (centerDto == null ? 0 : centerDto.hashCode())) * 31;
        Boolean bool = this.userDemo;
        return hashCode11 + (bool != null ? bool.hashCode() : 0);
    }

    public final void setBiometricValidationRNEC(boolean z) {
        this.biometricValidationRNEC = z;
    }

    public final void setCenter(CenterDto centerDto) {
        this.center = centerDto;
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

    public final void setUserDemo(Boolean bool) {
        this.userDemo = bool;
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
        List<CoursesDto> list = this.courses;
        List<String> list2 = this.schedulingCategories;
        String str7 = this.preferredHand;
        WorkedHorsDto workedHorsDto = this.workedHors;
        boolean z2 = this.biometricValidationRNEC;
        boolean z3 = this.usingIdenty;
        String str8 = this.phone;
        String str9 = this.mobile;
        CenterDto centerDto = this.center;
        Boolean bool = this.userDemo;
        StringBuilder r = x5.r("RefreshToken(id=", str, ", fullName=", str2, ", role=");
        x5.z(r, str3, ", email=", str4, ", docNumber=");
        x5.z(r, str5, ", docType=", str6, ", changePass=");
        r.append(z);
        r.append(", courses=");
        r.append(list);
        r.append(", schedulingCategories=");
        r.append(list2);
        r.append(", preferredHand=");
        r.append(str7);
        r.append(", workedHors=");
        r.append(workedHorsDto);
        r.append(", biometricValidationRNEC=");
        r.append(z2);
        r.append(", usingIdenty=");
        r.append(z3);
        r.append(", phone=");
        r.append(str8);
        r.append(", mobile=");
        r.append(str9);
        r.append(", center=");
        r.append(centerDto);
        r.append(", userDemo=");
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
        CenterDto centerDto = this.center;
        if (centerDto == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            centerDto.writeToParcel(dest, flags);
        }
        Boolean bool = this.userDemo;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            x5.v(dest, 1, bool);
        }
    }

    public /* synthetic */ RefreshToken(String str, String str2, String str3, String str4, String str5, String str6, boolean z, List list, List list2, String str7, WorkedHorsDto workedHorsDto, boolean z2, boolean z3, String str8, String str9, CenterDto centerDto, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, z, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : list2, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : str7, (i & 1024) != 0 ? null : workedHorsDto, z2, z3, (i & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : str8, (i & 16384) != 0 ? null : str9, (32768 & i) != 0 ? null : centerDto, (i & 65536) != 0 ? Boolean.FALSE : bool);
    }
}
