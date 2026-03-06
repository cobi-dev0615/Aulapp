package com.gse.aulapp.model.dto;

import android.os.Parcel;
import android.os.Parcelable;
import co.ceduladigital.sdk.x5;
import com.gse.aulapp.model.enumerate.EnumCallType;
import com.gse.aulapp.model.enumerate.EnumClassType;
import com.gse.aulapp.model.enumerate.EnumUserProfile;
import com.karumi.dexter.BuildConfig;
import defpackage.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B§\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b#\u0010 J\u001a\u0010&\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u00104R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b5\u0010\"R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b9\u0010\"R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b:\u0010\"R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b;\u0010\"R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0012\u00100\u001a\u0004\b<\u0010\"R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0013\u00100\u001a\u0004\b=\u0010\"R\u0017\u0010\u0014\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0014\u00102\u001a\u0004\b>\u00104R\u0017\u0010\u0015\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u00100\u001a\u0004\b?\u0010\"R\u0017\u0010\u0016\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0016\u00102\u001a\u0004\b@\u00104¨\u0006A"}, d2 = {"Lcom/gse/aulapp/model/dto/CallTypeDto;", "Landroid/os/Parcelable;", "Lcom/gse/aulapp/model/enumerate/EnumCallType;", "callType", "Lcom/gse/aulapp/model/enumerate/EnumUserProfile;", "role", BuildConfig.FLAVOR, "order", BuildConfig.FLAVOR, "email", BuildConfig.FLAVOR, "startExamOrClass", "momentStep", "Lcom/gse/aulapp/model/enumerate/EnumClassType;", "typeClass", "name", "category", "userId", "fullName", "document", "fullEnrolment", "docType", "biometricException", "<init>", "(Lcom/gse/aulapp/model/enumerate/EnumCallType;Lcom/gse/aulapp/model/enumerate/EnumUserProfile;ILjava/lang/String;ZLjava/lang/String;Lcom/gse/aulapp/model/enumerate/EnumClassType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Z)V", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/gse/aulapp/model/enumerate/EnumCallType;", "getCallType", "()Lcom/gse/aulapp/model/enumerate/EnumCallType;", "Lcom/gse/aulapp/model/enumerate/EnumUserProfile;", "getRole", "()Lcom/gse/aulapp/model/enumerate/EnumUserProfile;", "I", "getOrder", "Ljava/lang/String;", "getEmail", "Z", "getStartExamOrClass", "()Z", "getMomentStep", "Lcom/gse/aulapp/model/enumerate/EnumClassType;", "getTypeClass", "()Lcom/gse/aulapp/model/enumerate/EnumClassType;", "getName", "getCategory", "getUserId", "getFullName", "getDocument", "getFullEnrolment", "getDocType", "getBiometricException", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CallTypeDto implements Parcelable {
    public static final Parcelable.Creator<CallTypeDto> CREATOR = new Creator();
    private final boolean biometricException;
    private final EnumCallType callType;
    private final String category;
    private final String docType;
    private final String document;
    private final String email;
    private final boolean fullEnrolment;
    private final String fullName;
    private final String momentStep;
    private final String name;
    private final int order;
    private final EnumUserProfile role;
    private final boolean startExamOrClass;
    private final EnumClassType typeClass;
    private final String userId;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CallTypeDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CallTypeDto createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            String str;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            EnumCallType valueOf = EnumCallType.valueOfString(parcel.readString());
            EnumUserProfile valueOf2 = parcel.readInt() == 0 ? null : EnumUserProfile.valueOfString(parcel.readString());
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = false;
                z = true;
            } else {
                z = false;
                z2 = false;
            }
            String readString2 = parcel.readString();
            EnumClassType valueOf3 = parcel.readInt() != 0 ? EnumClassType.valueOfString(parcel.readString()) : null;
            boolean z5 = z2;
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            boolean z6 = z5;
            String readString7 = parcel.readString();
            if (parcel.readInt() != 0) {
                z3 = z6;
                z6 = true;
            } else {
                z3 = z6;
            }
            String readString8 = parcel.readString();
            if (parcel.readInt() != 0) {
                str = readString8;
                z4 = true;
            } else {
                z4 = z3;
                str = readString8;
            }
            return new CallTypeDto(valueOf, valueOf2, readInt, readString, z, readString2, valueOf3, readString3, readString4, readString5, readString6, readString7, z6, str, z4);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CallTypeDto[] newArray(int i) {
            return new CallTypeDto[i];
        }
    }

    public CallTypeDto(EnumCallType callType, EnumUserProfile enumUserProfile, int i, String str, boolean z, String str2, EnumClassType enumClassType, String str3, String str4, String str5, String str6, String str7, boolean z2, String docType, boolean z3) {
        Intrinsics.checkNotNullParameter(callType, "callType");
        Intrinsics.checkNotNullParameter(docType, "docType");
        this.callType = callType;
        this.role = enumUserProfile;
        this.order = i;
        this.email = str;
        this.startExamOrClass = z;
        this.momentStep = str2;
        this.typeClass = enumClassType;
        this.name = str3;
        this.category = str4;
        this.userId = str5;
        this.fullName = str6;
        this.document = str7;
        this.fullEnrolment = z2;
        this.docType = docType;
        this.biometricException = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallTypeDto)) {
            return false;
        }
        CallTypeDto callTypeDto = (CallTypeDto) other;
        return this.callType == callTypeDto.callType && this.role == callTypeDto.role && this.order == callTypeDto.order && Intrinsics.areEqual(this.email, callTypeDto.email) && this.startExamOrClass == callTypeDto.startExamOrClass && Intrinsics.areEqual(this.momentStep, callTypeDto.momentStep) && this.typeClass == callTypeDto.typeClass && Intrinsics.areEqual(this.name, callTypeDto.name) && Intrinsics.areEqual(this.category, callTypeDto.category) && Intrinsics.areEqual(this.userId, callTypeDto.userId) && Intrinsics.areEqual(this.fullName, callTypeDto.fullName) && Intrinsics.areEqual(this.document, callTypeDto.document) && this.fullEnrolment == callTypeDto.fullEnrolment && Intrinsics.areEqual(this.docType, callTypeDto.docType) && this.biometricException == callTypeDto.biometricException;
    }

    public int hashCode() {
        int hashCode = this.callType.hashCode() * 31;
        EnumUserProfile enumUserProfile = this.role;
        int aVal = x5.a(this.order, (hashCode + (enumUserProfile == null ? 0 : enumUserProfile.hashCode())) * 31, 31);
        String str = this.email;
        int g = defpackage.a.g(this.startExamOrClass, (aVal + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.momentStep;
        int hashCode2 = (g + (str2 == null ? 0 : str2.hashCode())) * 31;
        EnumClassType enumClassType = this.typeClass;
        int hashCode3 = (hashCode2 + (enumClassType == null ? 0 : enumClassType.hashCode())) * 31;
        String str3 = this.name;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.category;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.userId;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.fullName;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.document;
        return Boolean.hashCode(this.biometricException) + x5.d(this.docType, defpackage.a.g(this.fullEnrolment, (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31, 31), 31);
    }

    public String toString() {
        EnumCallType enumCallType = this.callType;
        EnumUserProfile enumUserProfile = this.role;
        int i = this.order;
        String str = this.email;
        boolean z = this.startExamOrClass;
        String str2 = this.momentStep;
        EnumClassType enumClassType = this.typeClass;
        String str3 = this.name;
        String str4 = this.category;
        String str5 = this.userId;
        String str6 = this.fullName;
        String str7 = this.document;
        boolean z2 = this.fullEnrolment;
        String str8 = this.docType;
        boolean z3 = this.biometricException;
        StringBuilder sb = new StringBuilder("CallTypeDto(callType=");
        sb.append(enumCallType);
        sb.append(", role=");
        sb.append(enumUserProfile);
        sb.append(", order=");
        sb.append(i);
        sb.append(", email=");
        sb.append(str);
        sb.append(", startExamOrClass=");
        sb.append(z);
        sb.append(", momentStep=");
        sb.append(str2);
        sb.append(", typeClass=");
        sb.append(enumClassType);
        sb.append(", name=");
        sb.append(str3);
        sb.append(", category=");
        x5.z(sb, str4, ", userId=", str5, ", fullName=");
        x5.z(sb, str6, ", document=", str7, ", fullEnrolment=");
        sb.append(z2);
        sb.append(", docType=");
        sb.append(str8);
        sb.append(", biometricException=");
        sb.append(z3);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.callType.name());
        EnumUserProfile enumUserProfile = this.role;
        if (enumUserProfile == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumUserProfile.name());
        }
        dest.writeInt(this.order);
        dest.writeString(this.email);
        dest.writeInt(this.startExamOrClass ? 1 : 0);
        dest.writeString(this.momentStep);
        EnumClassType enumClassType = this.typeClass;
        if (enumClassType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumClassType.name());
        }
        dest.writeString(this.name);
        dest.writeString(this.category);
        dest.writeString(this.userId);
        dest.writeString(this.fullName);
        dest.writeString(this.document);
        dest.writeInt(this.fullEnrolment ? 1 : 0);
        dest.writeString(this.docType);
        dest.writeInt(this.biometricException ? 1 : 0);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ CallTypeDto(com.gse.aulapp.model.enumerate.EnumCallType r20, com.gse.aulapp.model.enumerate.EnumUserProfile r21, int r22, java.lang.String r23, boolean r24, java.lang.String r25, com.gse.aulapp.model.enumerate.EnumClassType r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, boolean r32, java.lang.String r33, boolean r34, int r35, kotlin.jvm.internal.DefaultConstructorMarker r36) {
        /*
            r19 = this;
            r0 = r35
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L9
            r5 = r2
            goto Lb
        L9:
            r5 = r21
        Lb:
            r1 = r0 & 8
            if (r1 == 0) goto L11
            r7 = r2
            goto L13
        L11:
            r7 = r23
        L13:
            r1 = r0 & 16
            r3 = 0
            if (r1 == 0) goto L1a
            r8 = r3
            goto L1c
        L1a:
            r8 = r24
        L1c:
            r1 = r0 & 32
            if (r1 == 0) goto L22
            r9 = r2
            goto L24
        L22:
            r9 = r25
        L24:
            r1 = r0 & 64
            if (r1 == 0) goto L2a
            r10 = r2
            goto L2c
        L2a:
            r10 = r26
        L2c:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L32
            r11 = r2
            goto L34
        L32:
            r11 = r27
        L34:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L3a
            r12 = r2
            goto L3c
        L3a:
            r12 = r28
        L3c:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L42
            r13 = r2
            goto L44
        L42:
            r13 = r29
        L44:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L4a
            r14 = r2
            goto L4c
        L4a:
            r14 = r30
        L4c:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L52
            r15 = r2
            goto L54
        L52:
            r15 = r31
        L54:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L65
            r18 = r3
            r4 = r20
            r6 = r22
            r16 = r32
            r17 = r33
            r3 = r19
            goto L71
        L65:
            r18 = r34
            r3 = r19
            r4 = r20
            r6 = r22
            r16 = r32
            r17 = r33
        L71:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gse.aulapp.model.dto.CallTypeDto.<init>(com.gse.aulapp.model.enumerate.EnumCallType, com.gse.aulapp.model.enumerate.EnumUserProfile, int, java.lang.String, boolean, java.lang.String, com.gse.aulapp.model.enumerate.EnumClassType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
