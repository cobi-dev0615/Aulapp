package com.identy.ex;

import android.os.Process;
import com.d.e.a.values;
import com.identy.FingerAS;
import com.identy.Fpnative;
import com.identy.LibSettings;
import com.identy.IdentyB;
import defpackage.a;
import java.lang.reflect.Method;
import kotlin.io.ConstantsKt;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ASResult {
    private static final byte[] $$a = {4, -123, 38, -14, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -70, 44, -47, -43, -6, -16, 27, -44, -16, 20, -60, 2, 17, -64, 8, -15, -24, -17, -2, -19, -12, 8, -24, -22, 3, -27, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -36, -54, -17, -10, -10, -13, 43, -31, -8, -47, -30, -2, -26, 0, -24, -18, 72, -57, -43, -6, -16, 27, -44, -16, 4, -35, -11, -20, 0, -32, -14, -10, 0, -43, -6, -16, 27, -44, -16, 20, -60, 2, 17, -64, 8, -15, -24, -17, -2, -19, -12, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -38, -59, -1, -8, -14, 10, -46, 27, -59, -1, -8, -14, 16, -42, -20, -17, -2, -26, -43, -6, -16, 27, -44, -16, 4, -35, -11, -20, 0, -32, -14, -10, 0};
    private static final int $$b = 17;
    boolean a;
    public boolean asPass;
    long b;
    public boolean fusionPass;
    public float l1P;
    public float l1R;
    public float l1S;
    public boolean l2Pass;
    public float l3P;
    public boolean l3Pass;
    public float l3R;
    public float l3S;
    public float l7P;
    public float l7R;
    public float l7S;
    public boolean lAPass;
    public boolean lSeqPass;
    public FingerAS liveness_true_up_to_security_level;
    public int seqFrames;
    public float seqFramesPassedRatio;
    public float spoofScore;
    public float xl3;

    /* JADX WARN: Type inference failed for: r1v23, types: [boolean, int] */
    public ASResult() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int freeMemory = (int) Runtime.getRuntime().freeMemory();
                    int c = a.c((~(freeMemory | (-1052753791))) | 553864510, 301, (((~(553864510 | freeMemory)) | (~((~freeMemory) | 1052753790))) * (-301)) + (((~((-16793601) | freeMemory)) * (-301)) - 2056882170), -93950597);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4952;
                    Fpnative.valueOf = objArr;
                    this.l1P = -1.0f;
                    this.l1R = -1.0f;
                    this.l1S = -1.0f;
                    this.l7S = -1.0f;
                    this.l7P = -1.0f;
                    this.l7R = -1.0f;
                    this.l3P = -1.0f;
                    this.l3R = -1.0f;
                    this.l3S = -1.0f;
                    this.xl3 = -1.0f;
                    this.seqFramesPassedRatio = -1.0f;
                    this.spoofScore = -1.0f;
                    this.fusionPass = true;
                    this.l3Pass = true;
                    this.asPass = true;
                    this.lSeqPass = true;
                    this.lAPass = true;
                    this.a = true;
                    this.b = 0L;
                    this.seqFrames = -1;
                    int i3 = ((int[]) objArr[1])[0];
                    int i4 = i3 * i3;
                    int i5 = -(202345337 * i3);
                    int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
                    int i7 = -(i3 * 1723161895);
                    int i8 = (i6 & i7) + (i7 | i6);
                    int i9 = (i8 ^ (-501704448)) + (((-501704448) & i8) << 1);
                    int i10 = i9 >> 29;
                    int i11 = (((i10 | (-15)) << 1) - (i10 ^ (-15))) / 8;
                    int i12 = (i11 & 1) + (i11 | 1);
                    int i13 = (i9 & i12) + (i12 | i9);
                    int i14 = ((i9 >> 20) - 8191) / ConstantsKt.DEFAULT_BLOCK_SIZE;
                    int i15 = -(i13 ^ ((i14 & 1) + (i14 | 1)));
                    int i16 = (i15 & 5) + (i15 | 5);
                    int i17 = i16 >> 19;
                    int i18 = (((i17 | (-16383)) << 1) - (i17 ^ (-16383))) / ConstantsKt.DEFAULT_BUFFER_SIZE;
                    int i19 = (i18 ^ 1) + ((i18 & 1) << 1);
                    this.l2Pass = 8025 / (((-((i19 ^ 1) + ((i19 & 1) << 1))) & i16) * 1605);
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c(bArr[63], (byte) (-bArr[62]), (byte) (-bArr[113]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c((byte) (-bArr[57]), bArr[63], bArr[25], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -93950597);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4952;
            Fpnative.valueOf = objArr;
            this.l1P = -1.0f;
            this.l1R = -1.0f;
            this.l1S = -1.0f;
            this.l7S = -1.0f;
            this.l7P = -1.0f;
            this.l7R = -1.0f;
            this.l3P = -1.0f;
            this.l3R = -1.0f;
            this.l3S = -1.0f;
            this.xl3 = -1.0f;
            this.seqFramesPassedRatio = -1.0f;
            this.spoofScore = -1.0f;
            this.fusionPass = true;
            this.l3Pass = true;
            this.asPass = true;
            this.lSeqPass = true;
            this.lAPass = true;
            this.a = true;
            this.b = 0L;
            this.seqFrames = -1;
            int i32 = ((int[]) objArr[1])[0];
            int i42 = i32 * i32;
            int i52 = -(202345337 * i32);
            int i62 = ((i42 | i52) << 1) - (i42 ^ i52);
            int i72 = -(i32 * 1723161895);
            int i82 = (i62 & i72) + (i72 | i62);
            int i92 = (i82 ^ (-501704448)) + (((-501704448) & i82) << 1);
            int i102 = i92 >> 29;
            int i112 = (((i102 | (-15)) << 1) - (i102 ^ (-15))) / 8;
            int i122 = (i112 & 1) + (i112 | 1);
            int i132 = (i92 & i122) + (i122 | i92);
            int i142 = ((i92 >> 20) - 8191) / ConstantsKt.DEFAULT_BLOCK_SIZE;
            int i152 = -(i132 ^ ((i142 & 1) + (i142 | 1)));
            int i162 = (i152 & 5) + (i152 | 5);
            int i172 = i162 >> 19;
            int i182 = (((i172 | (-16383)) << 1) - (i172 ^ (-16383))) / ConstantsKt.DEFAULT_BUFFER_SIZE;
            int i192 = (i182 ^ 1) + ((i182 & 1) << 1);
            this.l2Pass = 8025 / (((-((i192 ^ 1) + ((i192 & 1) << 1))) & i162) * 1605);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void c(int i, short s, short s2, Object[] objArr) {
        byte[] bArr = $$a;
        int i2 = (s2 * 19) + 80;
        int i3 = i + 4;
        byte[] bArr2 = new byte[s + 6];
        int i4 = s + 5;
        int i5 = -1;
        if (bArr == null) {
            i2 = (i2 + (-i4)) - 13;
            i3++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2 = (i2 + (-bArr[i3])) - 13;
                i3++;
            }
        }
    }

    public long getServerValidationTime() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int freeMemory = (int) Runtime.getRuntime().freeMemory();
                    int c = a.c((~(freeMemory | (-531400875))) | (~(1030290154 | freeMemory)), -1324, (((~freeMemory) | 541094464) * 1324) + 946668373, 894303766);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 5047;
                    Fpnative.valueOf = objArr;
                    return this.b;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c(bArr[63], (byte) (-bArr[62]), (byte) (-bArr[113]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c((byte) (-bArr[57]), bArr[63], bArr[25], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 491614764);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5047;
            Fpnative.valueOf = objArr;
            return this.b;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public boolean isAsPass() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i = ~identityHashCode;
                    int i2 = (~((-176204598) | i)) | 142616629;
                    int c = a.c(~(i | (-322684683)), 713, ((~(identityHashCode | (-289096715))) * 1426) + (((i2 | 0) * (-713)) - 862196222), 1073179592);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 4978;
                    Fpnative.valueOf = objArr;
                    return this.asPass;
                }
            }
            int i5 = $$b;
            Object[] objArr3 = new Object[1];
            c((byte) 97, (byte) (i5 | 6), (byte) (-$$a[113]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c((byte) (i5 | 108), $$a[116], $$a[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1073179592);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4978;
            Fpnative.valueOf = objArr;
            return this.asPass;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public boolean isAsValidatedLocal() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                    int i = (((~((-789298543) | startElapsedRealtime)) | 771798080 | (~(290409262 | startElapsedRealtime))) * (-880)) + 1434790607;
                    int i2 = (~((-789298543) | (~startElapsedRealtime))) | (-290409263);
                    int i3 = ~(startElapsedRealtime | 789298542);
                    int c = a.c(i3, 880, ((i2 | i3) * (-880)) + i, -376223536);
                    int i4 = c ^ (c << 13);
                    int i5 = i4 ^ (i4 >>> 17);
                    ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                    ((long[]) objArr[0])[0] = j + 4919;
                    Fpnative.valueOf = objArr;
                    return this.a;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c((byte) (-bArr[50]), bArr[2], (byte) (-bArr[113]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c((byte) 79, (byte) (-bArr[55]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -376223536);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4919;
            Fpnative.valueOf = objArr;
            return this.a;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public void setAsValidatedLocal(boolean z) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i = (int) Runtime.getRuntime().totalMemory();
                    int i2 = ~i;
                    int c = a.c((~(i | (-307903027))) | 37894144 | (~(i2 | 460995135)), 988, (((~((-270008883) | i2)) | (~(460995135 | i))) * 988) + 1430038599, 2110814560);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 5008;
                    Fpnative.valueOf = objArr;
                    this.a = z;
                }
            }
            int i5 = $$b;
            Object[] objArr3 = new Object[1];
            c((byte) 97, (byte) (i5 | 6), (byte) (-$$a[113]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c((byte) (i5 | 108), $$a[116], $$a[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 2110814560);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5008;
            Fpnative.valueOf = objArr;
            this.a = z;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public void setServerValidationTime(long j) {
        Object[] objArr;
        long j2;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j3 = ((long[]) objArr2[0])[0];
                j2 = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j3 > j2) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i = ~((~((int) Process.getStartUptimeMillis())) | 275439776);
                    int c = a.c(i | 4227200, 970, ((271212576 | i) * (-970)) + 1776666239, 145774005);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j2 + 4900;
                    Fpnative.valueOf = objArr;
                    this.b = j;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c((byte) (-bArr[50]), bArr[2], (byte) (-bArr[113]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c((byte) 79, (byte) (-bArr[55]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 145774005);
            j2 = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j2 + 4900;
            Fpnative.valueOf = objArr;
            this.b = j;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JSONObject toJson() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = a.c((~((~System.identityHashCode(this)) | 38091053)) | (-422707264), 381, (((-422707219) | 0) * (-381)) - 1638753682, 864231622);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4980;
                    Fpnative.valueOf = objArr;
                    if (LibSettings.isSaveCaptured()) {
                        return new JSONObject();
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("l1P", this.l1P);
                        jSONObject.put("l1R", this.l1R);
                        jSONObject.put("l1S", this.l1S);
                        jSONObject.put("l7S", this.l7S);
                        int i3 = ((int[]) objArr[1])[0];
                        int i4 = i3 * i3;
                        int i5 = -(1052865799 * i3);
                        int i6 = (i4 & i5) + (i4 | i5);
                        int i7 = -(i3 * 174859549);
                        int i8 = (((i6 | i7) << 1) - (i7 ^ i6)) - (-90035524);
                        int i9 = ((i8 >> 15) - 262143) / 131072;
                        int i10 = (i9 ^ 1) + ((i9 & 1) << 1);
                        int i11 = (i8 & i10) + (i10 | i8);
                        int i12 = i8 >> 22;
                        int i13 = ((i12 & (-2047)) + (i12 | (-2047))) / 1024;
                        int i14 = -(i11 ^ ((i13 & 1) + (i13 | 1)));
                        int i15 = (i14 & 9) + (i14 | 9);
                        int i16 = ((i15 >> 20) - 8191) / ConstantsKt.DEFAULT_BLOCK_SIZE;
                        int i17 = (i16 & 1) + (i16 | 1);
                        jSONObject.put("15;25;31;4;20;l7R".substring(209916 / (((-(((i17 | 1) << 1) - (1 ^ i17))) & i15) * 1666)), this.l7R);
                        jSONObject.put("l7P", this.l7P);
                        jSONObject.put("l3P", this.l3P);
                        jSONObject.put("l3R", this.l3R);
                        jSONObject.put("l3S", this.l3S);
                        jSONObject.put("xl3", this.xl3);
                        jSONObject.put("seqFramesPassedRatio", this.seqFramesPassedRatio);
                        jSONObject.put("fusionPass", this.fusionPass);
                        jSONObject.put("l3Pass", this.l3Pass);
                        jSONObject.put("asPass", this.asPass);
                        jSONObject.put("seqFrames", this.seqFrames);
                        jSONObject.put("l2Pass", this.l2Pass);
                        jSONObject.put("spoofScore", this.spoofScore);
                        return jSONObject;
                    } catch (Exception e) {
                        e.printStackTrace();
                        return jSONObject;
                    }
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c((byte) (-bArr[50]), bArr[2], (byte) (-bArr[113]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c((byte) 79, (byte) (-bArr[55]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1273428484);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4980;
            Fpnative.valueOf = objArr;
            if (LibSettings.isSaveCaptured()) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public String toString() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i = (((~((-284469040) | identityHashCode)) | 271590447 | (~(214420240 | identityHashCode))) * (-754)) + 1776076173;
                    int i2 = ~((-271590448) | identityHashCode);
                    int i3 = ~identityHashCode;
                    int c = a.c(i3 | (-284469040), 754, ((i2 | (~(486010687 | i3))) * (-754)) + i, -292197269);
                    int i4 = c ^ (c << 13);
                    int i5 = i4 ^ (i4 >>> 17);
                    ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                    ((long[]) objArr[0])[0] = j + 5007;
                    Fpnative.valueOf = objArr;
                    int i6 = ((int[]) objArr[1])[0];
                    int i7 = i6 * i6;
                    int i8 = -(296674793 * i6);
                    int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
                    int i10 = -(i6 * 2088332007);
                    int i11 = ((i9 ^ i10) + ((i10 & i9) << 1)) - (-111192640);
                    int i12 = i11 >> 22;
                    int i13 = ((i12 ^ (-2047)) + ((i12 & (-2047)) << 1)) / 1024;
                    int i14 = (i11 - (~(((i13 | 1) << 1) - (i13 ^ 1)))) - 1;
                    int i15 = i11 >> 27;
                    int i16 = ((i15 & (-63)) + (i15 | (-63))) / 32;
                    int i17 = -(i14 ^ ((i16 & 1) + (i16 | 1)));
                    int i18 = (i17 & 4) + (i17 | 4);
                    int i19 = ((i18 >> 26) - 127) / 64;
                    int i20 = (i19 & 1) + (i19 | 1);
                    return IdentyB.c((-(((i20 | 1) << 1) - (i20 ^ 1))) & i18, 724, 8688, "20;");
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c(bArr[63], (byte) (-bArr[62]), (byte) (-bArr[113]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c((byte) (-bArr[57]), bArr[63], bArr[25], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -292197269);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5007;
            Fpnative.valueOf = objArr;
            int i62 = ((int[]) objArr[1])[0];
            int i72 = i62 * i62;
            int i82 = -(296674793 * i62);
            int i92 = (i72 ^ i82) + ((i72 & i82) << 1);
            int i102 = -(i62 * 2088332007);
            int i112 = ((i92 ^ i102) + ((i102 & i92) << 1)) - (-111192640);
            int i122 = i112 >> 22;
            int i132 = ((i122 ^ (-2047)) + ((i122 & (-2047)) << 1)) / 1024;
            int i142 = (i112 - (~(((i132 | 1) << 1) - (i132 ^ 1)))) - 1;
            int i152 = i112 >> 27;
            int i162 = ((i152 & (-63)) + (i152 | (-63))) / 32;
            int i172 = -(i142 ^ ((i162 & 1) + (i162 | 1)));
            int i182 = (i172 & 4) + (i172 | 4);
            int i192 = ((i182 >> 26) - 127) / 64;
            int i202 = (i192 & 1) + (i192 | 1);
            return IdentyB.c((-(((i202 | 1) << 1) - (i202 ^ 1))) & i182, 724, 8688, "20;");
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
