package com.identy.enums;

import android.os.Process;
import android.os.SystemClock;
import com.d.e.a.values;
import com.identy.Fpnative;
import com.identy.R;
import com.identy.IdentyB;
import defpackage.a;
import java.io.Serializable;
import java.lang.reflect.Method;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'L4F' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class FingerDetectionMode implements Serializable {
    private static  byte[] $$a = null;
    private static  int $$b = 0;
    public static final FingerDetectionMode L4F;
    public static final FingerDetectionMode LEFT_INDEX;
    public static final FingerDetectionMode LEFT_LITTLE;
    public static final FingerDetectionMode LEFT_MIDDLE;
    public static final FingerDetectionMode LEFT_RIGHT_INDEX;
    public static final FingerDetectionMode LEFT_RING;
    public static final FingerDetectionMode LEFT_THUMB;
    public static final FingerDetectionMode R4F;
    public static final FingerDetectionMode RIGHT_INDEX;
    public static final FingerDetectionMode RIGHT_LITTLE;
    public static final FingerDetectionMode RIGHT_MIDDLE;
    public static final FingerDetectionMode RIGHT_RING;
    public static final FingerDetectionMode RIGHT_THUMB;
    public static final FingerDetectionMode TWO_THUMB;
    private static final /* synthetic */ FingerDetectionMode[] m;
    boolean a;
    private String enumName;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    boolean h;
    protected String i;
    protected String j;
    protected Hand k;
    protected Finger l;

    static {
        init$0();
        Hand hand = Hand.LEFT;
        int i = R.string.id_next_4L_1_OK;
        int i2 = R.string.id_next_4L_2_OK;
        int i3 = R.string.id_enroll_next_4L_1_OK;
        int i4 = R.string.id_enroll_next_4L_2_OK;
        int i5 = R.string.id_verify_next_4L_1_OK;
        int i6 = R.string.id_verify_next_4L_2_OK;
        L4F = new FingerDetectionMode("L4F", 0, "4F", hand, "LF", i, i2, i3, i4, i5, i6, false);
        Hand hand2 = Hand.RIGHT;
        int i7 = R.string.id_next_4R_1_OK;
        int i8 = R.string.id_next_4R_2_OK;
        int i9 = R.string.id_enroll_next_4R_1_OK;
        int i10 = R.string.id_enroll_next_4R_2_OK;
        int i11 = R.string.id_verify_next_4R_1_OK;
        int i12 = R.string.id_verify_next_4R_2_OK;
        R4F = new FingerDetectionMode("R4F", 1, "4F", hand2, "RF", i7, i8, i9, i10, i11, i12, false);
        Finger finger = Finger.THUMB;
        TWO_THUMB = new FingerDetectionMode("TWO_THUMB", 2, "2T", null, finger, false, "2T", R.string.id_next_2T_1_OK, R.string.id_next_2T_2_OK, R.string.id_enroll_next_2T_1_OK, R.string.id_enroll_next_2T_2_OK, R.string.id_verify_next_2T_1_OK, R.string.id_verify_next_2T_2_OK, false);
        LEFT_THUMB = new FingerDetectionMode("LEFT_THUMB", 3, "THUMB", hand, finger, false, "LT", R.string.id_next_LT_1_OK, R.string.id_next_LT_2_OK, R.string.id_enroll_next_LT_1_OK, R.string.id_enroll_next_LT_2_OK, R.string.id_verify_next_LT_1_OK, R.string.id_verify_next_LT_2_OK, true);
        RIGHT_THUMB = new FingerDetectionMode("RIGHT_THUMB", 4, "THUMB", hand2, finger, false, "RT", R.string.id_next_RT_1_OK, R.string.id_next_RT_2_OK, R.string.id_enroll_next_RT_1_OK, R.string.id_enroll_next_RT_2_OK, R.string.id_verify_next_RT_1_OK, R.string.id_verify_next_RT_2_OK, true);
        Finger finger2 = Finger.INDEX;
        LEFT_INDEX = new FingerDetectionMode("LEFT_INDEX", 5, "1F", hand, finger2, true, "LI", i, i2, i3, i4, i5, i6, true);
        Finger finger3 = Finger.MIDDLE;
        LEFT_MIDDLE = new FingerDetectionMode("LEFT_MIDDLE", 6, "1F", hand, finger3, true, "LM", i, i2, i3, i4, i5, i6, true);
        Finger finger4 = Finger.RING;
        LEFT_RING = new FingerDetectionMode("LEFT_RING", 7, "1F", hand, finger4, true, "LR", i, i2, i3, i4, i5, i6, true);
        Finger finger5 = Finger.LITTLE;
        LEFT_LITTLE = new FingerDetectionMode("LEFT_LITTLE", 8, "1F", hand, finger5, true, "LL", i, i2, i3, i4, i5, i6, true);
        RIGHT_INDEX = new FingerDetectionMode("RIGHT_INDEX", 9, "1F", hand2, finger2, true, "RI", i7, i8, i9, i10, i11, i12, true);
        RIGHT_MIDDLE = new FingerDetectionMode("RIGHT_MIDDLE", 10, "1F", hand2, finger3, true, "RM", i7, i8, i9, i10, i11, i12, true);
        RIGHT_RING = new FingerDetectionMode("RIGHT_RING", 11, "1F", hand2, finger4, true, "RR", i7, i8, i9, i10, i11, i12, true);
        RIGHT_LITTLE = new FingerDetectionMode("RIGHT_LITTLE", 12, "1F", hand2, finger5, true, "RL", i7, i8, i9, i10, i11, i12, true);
        int i13 = R.string.id_next_2I_1_OK;
        LEFT_RIGHT_INDEX = new FingerDetectionMode("LEFT_RIGHT_INDEX", 13, "2F", null, finger2, false, "LRI", i13, i13, R.string.id_enroll_next_2I_1_OK, R.string.id_enroll_next_2I_2_OK, R.string.id_verify_next_2I_1_OK, R.string.id_verify_next_2I_2_OK, true);
        m = a();
    }

    private FingerDetectionMode(String str, int i, String str2, Hand hand, String str3, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.enumName = str;
        this.a = false;
        this.i = str2;
        this.k = hand;
        this.j = str3;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = z;
    }

    private static /* synthetic */ FingerDetectionMode[] a() {
        return new FingerDetectionMode[]{L4F, R4F, TWO_THUMB, LEFT_THUMB, RIGHT_THUMB, LEFT_INDEX, LEFT_MIDDLE, LEFT_RING, LEFT_LITTLE, RIGHT_INDEX, RIGHT_MIDDLE, RIGHT_RING, RIGHT_LITTLE, LEFT_RIGHT_INDEX};
    }

    private static FingerDetectionMode valueOfName(String name) {
        for (FingerDetectionMode v : values()) {
            if (v.enumName != null && v.enumName.equals(name)) return v;
        }
        throw new IllegalArgumentException("No enum constant " + name);
    }

    public static void init$0() {
        $$a = new byte[]{18, 103, 62, 73, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -38, -59, -1, -8, -14, 10, -46, 27, -59, -1, -8, -14, 16, -42, -20, -17, -2, -26, -43, -6, -16, 27, -44, -16, 4, -35, -11, -20, 0, -32, -14, -10, 0, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -70, 44, -47, -43, -6, -16, 27, -44, -16, 20, -60, 2, 17, -64, 8, -15, -24, -17, -2, -19, -12, 8, -24, -22, 3, -27, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -36, -54, -17, -10, -10, -13, 43, -31, -8, -47, -30, -2, -26, 0, -24, -18, 72, -57, -43, -6, -16, 27, -44, -16, 4, -35, -11, -20, 0, -32, -14, -10, 0, -43, -6, -16, 27, -44, -16, 20, -60, 2, 17, -64, 8, -15, -24, -17, -2, -19, -12};
        $$b = 111;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void n(byte b, byte b2, byte b3, Object[] objArr) {
        int i;
        int i2;
        int i3 = (b3 * 19) + 80;
        int i4 = b + 4;
        int i5 = b2 + 6;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            byte[] bArr3 = bArr;
            i2 = 0;
            int i6 = i5;
            i3 = (i6 + (-i3)) - 13;
            bArr = bArr3;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i4++;
            byte b4 = bArr[i4];
            byte[] bArr4 = bArr;
            i6 = i3;
            i3 = b4;
            bArr3 = bArr4;
            i3 = (i6 + (-i3)) - 13;
            bArr = bArr3;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i5) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i5) {
            }
        }
    }

    public static FingerDetectionMode valueOfString(String str) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int myPid = Process.myPid();
                    int c = defpackage.a.c(~(myPid | (-549454913)), 345, (((~((-616850503) | (~myPid))) | (-667416135)) * 345) + (((~((-616850503) | myPid)) | 549454912) * 345) + 180779864, -713872315);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4906;
                    Fpnative.valueOf = objArr;
                    return valueOfName(str);
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            n((byte) (-bArr[27]), (byte) (-bArr[31]), (byte) (-bArr[16]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            n(bArr[3], bArr[42], bArr[68], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -713872315);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4906;
            Fpnative.valueOf = objArr;
            return valueOfName(str);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static FingerDetectionMode[] values() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int maxMemory = (int) Runtime.getRuntime().maxMemory();
                    int c = defpackage.a.c(~(maxMemory | 160293434), 113, (((~((~maxMemory) | 802158202)) | (~((-659182715) | maxMemory)) | 17317946) * (-113)) + ((((~(160293434 | 0)) | 659182714) * 226) - 41024400), -984920321);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 5008;
                    Fpnative.valueOf = objArr;
                    return (FingerDetectionMode[]) m.clone();
                }
            }
            byte b = $$a[16];
            byte b2 = b;
            Object[] objArr3 = new Object[1];
            n(b2, (byte) (b2 & 23), (byte) (-b), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            n($$a[21], $$a[19], $$a[42], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -984920321);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5008;
            Fpnative.valueOf = objArr;
            return (FingerDetectionMode[]) m.clone();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final boolean canClub() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int startUptimeMillis = (int) Process.getStartUptimeMillis();
                    int i = ~startUptimeMillis;
                    int c = defpackage.a.c((~(startUptimeMillis | (-270762004))) | (~(304607891 | i)) | 160435500, 140, (((~(194281388 | i)) | 270762003) * (-280)) + ((startUptimeMillis | 194281388) * 140) + 1630107267, -1936537369);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 5017;
                    Fpnative.valueOf = objArr;
                    return this.a;
                }
            }
            byte b = $$a[16];
            byte b2 = b;
            Object[] objArr3 = new Object[1];
            n(b2, (byte) (b2 & 23), (byte) (-b), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            n($$a[21], $$a[19], $$a[42], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1936537369);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5017;
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

    /* JADX WARN: Removed duplicated region for block: B:8:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final FingerDetectionMode changeHand() {
        Object[] objArr;
        long j;
        int length;
        int i;
        Finger finger;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int elapsedRealtime = (int) SystemClock.elapsedRealtime();
                    int i2 = ~elapsedRealtime;
                    int c = defpackage.a.c((~(elapsedRealtime | 361824709)) | 136998970, 464, (((-65601) | elapsedRealtime) * (-464)) + (((~(i2 | 361824709)) | (~((-137064571) | i2)) | 136998970) * 464) + 1708378671, 959132631);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 4865;
                    Fpnative.valueOf = objArr;
                    FingerDetectionMode[] values = values();
                    length = values.length;
                    int i5 = ((int[]) objArr[1])[0];
                    int i6 = i5 * i5;
                    int i7 = -(1570374426 * i5);
                    int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
                    int i9 = -(i5 * 1869458414);
                    int i10 = (i8 & i9) + (i9 | i8);
                    int i11 = (i10 ^ 1988557840) + ((1988557840 & i10) << 1);
                    int i12 = i11 >> 22;
                    int i13 = (((i12 | (-2047)) << 1) - (i12 ^ (-2047))) / 1024;
                    int i14 = (i13 ^ 1) + ((i13 & 1) << 1);
                    int i15 = (i11 ^ i14) + ((i14 & i11) << 1);
                    int i16 = i11 >> 27;
                    int i17 = (-(IdentyB.a(i16 & (-63), i16 | (-63), 32, -1) ^ i15)) + 2;
                    int i18 = i17 >> 28;
                    int i19 = ((i18 ^ (-31)) + ((i18 & (-31)) << 1)) / 16;
                    for (i = 0 / (((-((((i19 | 1) << 1) - (1 ^ i19)) - (-1))) & i17) * 135); i < length; i++) {
                        FingerDetectionMode fingerDetectionMode = values[i];
                        if (getCode().equals(fingerDetectionMode.getCode()) && !equals(fingerDetectionMode) && ((finger = this.l) == null || finger.equals(fingerDetectionMode.l))) {
                            return fingerDetectionMode;
                        }
                    }
                    return null;
                }
            }
            byte b = (byte) ($$b & 478);
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            n(b, (byte) (-bArr[14]), (byte) (-bArr[16]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            n((byte) 121, (byte) (-bArr[98]), bArr[42], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 959132631);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4865;
            Fpnative.valueOf = objArr;
            FingerDetectionMode[] values2 = values();
            length = values2.length;
            int i52 = ((int[]) objArr[1])[0];
            int i62 = i52 * i52;
            int i72 = -(1570374426 * i52);
            int i82 = (i62 ^ i72) + ((i62 & i72) << 1);
            int i92 = -(i52 * 1869458414);
            int i102 = (i82 & i92) + (i92 | i82);
            int i112 = (i102 ^ 1988557840) + ((1988557840 & i102) << 1);
            int i122 = i112 >> 22;
            int i132 = (((i122 | (-2047)) << 1) - (i122 ^ (-2047))) / 1024;
            int i142 = (i132 ^ 1) + ((i132 & 1) << 1);
            int i152 = (i112 ^ i142) + ((i142 & i112) << 1);
            int i162 = i112 >> 27;
            int i172 = (-(IdentyB.a(i162 & (-63), i162 | (-63), 32, -1) ^ i152)) + 2;
            int i182 = i172 >> 28;
            int i192 = ((i182 ^ (-31)) + ((i182 & (-31)) << 1)) / 16;
            int i = 0;
            while (i < length) {
            }
            return null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final String getCode() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int maxMemory = (int) Runtime.getRuntime().maxMemory();
                    int i = ~maxMemory;
                    int i2 = ~(614472667 | i);
                    int c = defpackage.a.c(i2 | 115583387, 712, (((~(maxMemory | (-37986305))) | (~(i | 652458971))) * (-712)) + (((-652458972) | i2) * (-712)) + 390020935, 437171682);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 5012;
                    Fpnative.valueOf = objArr;
                    return this.i;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            n((byte) (-bArr[27]), (byte) (-bArr[31]), (byte) (-bArr[16]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            n(bArr[3], bArr[42], bArr[68], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 437171682);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5012;
            Fpnative.valueOf = objArr;
            return this.i;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final int getEnrollnextMsg() {
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
                    int c = defpackage.a.c((~(identityHashCode | 944083547)) | (-445194268), 272, (((~((-944083548) | identityHashCode)) | 402718747) * (-272)) + (((~((-541364801) | (~identityHashCode))) | (~((-42475521) | identityHashCode))) * (-272)) + 425332911, -486574493);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4970;
                    Fpnative.valueOf = objArr;
                    return this.e;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            n((byte) (-bArr[27]), (byte) (-bArr[31]), (byte) (-bArr[16]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            n(bArr[3], bArr[42], bArr[68], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -486574493);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4970;
            Fpnative.valueOf = objArr;
            return this.e;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final int getEnrollsuccessMsg() {
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
                    int i = ~(147616866 | identityHashCode);
                    int i2 = ~identityHashCode;
                    int i3 = i | (~(646506146 | i2));
                    int c = defpackage.a.c(8938530 | (~((-147616867) | i2)), 516, (((~(identityHashCode | (-637567617))) | (~(i2 | (-8938531)))) * 516) + (((i3 | 0) * (-516)) - 1246692309), 2069747002);
                    int i4 = c ^ (c << 13);
                    int i5 = i4 ^ (i4 >>> 17);
                    ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                    ((long[]) objArr[0])[0] = j + 4925;
                    Fpnative.valueOf = objArr;
                    return this.d;
                }
            }
            byte b = (byte) ($$b & 478);
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            n(b, (byte) (-bArr[14]), (byte) (-bArr[16]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            n((byte) 121, (byte) (-bArr[98]), bArr[42], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 2069747002);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4925;
            Fpnative.valueOf = objArr;
            return this.d;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final Finger getFinger() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = defpackage.a.c((~((~((int) Runtime.getRuntime().freeMemory())) | (-699606083))) | 162668546, 983, (((~(200716802 | 0)) | (-699606083)) * (-983)) - 1008513716, 1168641282);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4953;
                    Fpnative.valueOf = objArr;
                    return this.l;
                }
            }
            byte b = (byte) ($$b & 478);
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            n(b, (byte) (-bArr[14]), (byte) (-bArr[16]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            n((byte) 121, (byte) (-bArr[98]), bArr[42], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1168641282);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4953;
            Fpnative.valueOf = objArr;
            return this.l;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final Hand getHand() {
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
                    int i2 = (((~(17905893 | i)) | 480903450) * (-1188)) - 1357152673;
                    int i3 = (~(identityHashCode | (-17905894))) | 480903450;
                    int i4 = ~(480983386 | i);
                    int c = defpackage.a.c((~(i | (-17905894))) | 17825957 | i4, 594, ((i3 | i4) * 594) + i2, -2122098009);
                    int i5 = c ^ (c << 13);
                    int i6 = i5 ^ (i5 >>> 17);
                    ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
                    ((long[]) objArr[0])[0] = j + 4890;
                    Fpnative.valueOf = objArr;
                    return this.k;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            n((byte) (-bArr[27]), (byte) (-bArr[31]), (byte) (-bArr[16]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            n(bArr[3], bArr[42], bArr[68], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -2122098009);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4890;
            Fpnative.valueOf = objArr;
            return this.k;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final int getNextMsg() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int myTid = Process.myTid();
                    int i = ~myTid;
                    int c = defpackage.a.c(~(i | (-116960144)), 184, ((myTid | 268649520) * (-184)) + (((~(381929136 | i)) | 3680527) * 184) + 2008543735, -273828672);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4927;
                    Fpnative.valueOf = objArr;
                    return this.c;
                }
            }
            byte b = $$a[16];
            byte b2 = b;
            Object[] objArr3 = new Object[1];
            n(b2, (byte) (b2 & 23), (byte) (-b), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            n($$a[21], $$a[19], $$a[42], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -273828672);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4927;
            Fpnative.valueOf = objArr;
            return this.c;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final int getSuccessMsg() {
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
                    int c = defpackage.a.c((~(i | 945268556)) | (~(446379276 | i)), 865, ((~(identityHashCode | 945268556)) * 865) + (((~((-945268557) | i)) | 446379276) * (-865)) + 1683421944, -926559172);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4954;
                    Fpnative.valueOf = objArr;
                    return this.b;
                }
            }
            byte b = (byte) ($$b & 478);
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            n(b, (byte) (-bArr[14]), (byte) (-bArr[16]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            n((byte) 121, (byte) (-bArr[98]), bArr[42], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -926559172);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4954;
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

    public final String getTransactionCode() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int b = defpackage.a.b(1383466173);
                    int c = defpackage.a.c((~(b | (-430978078))) | (-67911203), 502, ((~((~b) | (-67897891))) * (-502)) + ((((~((-67911203) | b)) | (-498875968)) * (-502)) - 1372055539), -1876117010);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4986;
                    Fpnative.valueOf = objArr;
                    return this.j;
                }
            }
            byte b2 = $$a[16];
            byte b3 = b2;
            Object[] objArr3 = new Object[1];
            n(b3, (byte) (b3 & 23), (byte) (-b2), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            n($$a[21], $$a[19], $$a[42], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1876117010);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4986;
            Fpnative.valueOf = objArr;
            return this.j;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final int getVerifynextMsg() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int myUid = Process.myUid();
                    int c = defpackage.a.c((~(myUid | 469495615)) | (~((-333179658) | (~myUid))), 338, (((136315958 | 0) | (~(333179657 | myUid))) * (-338)) - 670957173, -1043034424);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4979;
                    Fpnative.valueOf = objArr;
                    return this.g;
                }
            }
            byte b = $$a[16];
            byte b2 = b;
            Object[] objArr3 = new Object[1];
            n(b2, (byte) (b2 & 23), (byte) (-b), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            n($$a[21], $$a[19], $$a[42], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1043034424);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4979;
            Fpnative.valueOf = objArr;
            return this.g;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final int getVerifysuccessMsg() {
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
                    int c = defpackage.a.c((~((~identityHashCode) | 175081862)) | 673971142, 217, (((~(identityHashCode | (-673971143))) | 536900160) * 217) + ((((~((-673971143) | 0)) | (~(175081862 | identityHashCode))) * 217) - 608751614), 462898700);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4965;
                    Fpnative.valueOf = objArr;
                    return this.f;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            n((byte) (-bArr[27]), (byte) (-bArr[31]), (byte) (-bArr[16]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            n(bArr[3], bArr[42], bArr[68], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 462898700);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4965;
            Fpnative.valueOf = objArr;
            return this.f;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final boolean isRollAllowed() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int myUid = Process.myUid();
                    int i = ~myUid;
                    int c = defpackage.a.c(myUid | (-75735233), 220, (((~(i | (-481796314))) | 980685593) * (-440)) + (((~(i | (-75735233))) | 574624512) * 220) + 122361619, -223468470);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4954;
                    Fpnative.valueOf = objArr;
                    return this.h;
                }
            }
            byte b = $$a[16];
            byte b2 = b;
            Object[] objArr3 = new Object[1];
            n(b2, (byte) (b2 & 23), (byte) (-b), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            n($$a[21], $$a[19], $$a[42], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -223468470);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4954;
            Fpnative.valueOf = objArr;
            return this.h;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private FingerDetectionMode(String str, int i, String str2, Hand hand, Finger finger, boolean z, String str3, int i2, int i3, int i4, int i5, int i6, int i7, boolean z2) {
        this.enumName = str;
        this.i = str2;
        this.k = hand;
        this.l = finger;
        this.a = z;
        this.j = str3;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = z2;
    }
}
