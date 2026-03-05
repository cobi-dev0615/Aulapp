package com.identy;

import android.os.Process;
import android.os.SystemClock;
import com.identy.enums.FingerMatchSecLevel;
import java.lang.reflect.Method;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;

/* loaded from: classes2.dex */
public class Attempt {
    private static final byte[] $$a = {99, -40, 88, 17, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -38, -59, -1, -8, -14, 10, -46, 27, -59, -1, -8, -14, 16, -42, -20, -17, -2, -26, -43, -6, -16, 27, -44, -16, 4, -35, -11, -20, 0, -32, -14, -10, 0, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -70, 44, -47, -43, -6, -16, 27, -44, -16, 20, -60, 2, 17, -64, 8, -15, -24, -17, -2, -19, -12, 8, -24, -22, 3, -27, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -36, -54, -17, -10, -10, -13, 43, -31, -8, -47, -30, -2, -26, 0, -24, -18, 72, -57, -43, -6, -16, 27, -44, -16, 4, -35, -11, -20, 0, -32, -14, -10, 0, -43, -6, -16, 27, -44, -16, 20, -60, 2, 17, -64, 8, -15, -24, -17, -2, -19, -12};
    private static final int $$b = 122;
    private long Action;
    private String Attempt;
    private long PngBadCharsetException;
    private float PngjBadCrcException;
    private double PngjBadSignature;
    private int PngjException;
    private int PngjExceptionInternal;
    private float PngjInputException;
    private float PngjOutputException;
    private float PngjPrematureEnding;
    private float PngjUnsupportedException;
    private long a;
    private long e1;
    private boolean getAsHighestSecurityLevelReached;
    private FingerAS getPadSub1;
    private FingerMatchSecLevel getPadSub2;
    private int getPadSub3;
    private boolean onErrorResponse;
    private float valueOf;
    private int values;

    public Attempt() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int myUid = Process.myUid();
                    int i = ~myUid;
                    int c = defpackage.a.c((~(i | 1017794516)) | (~(518905236 | i)), 865, ((~(myUid | 1017794516)) * 865) + ((((~((-1017794517) | i)) | 518905236) * (-865)) - 1695686136), 1113730988);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 5017;
                    Fpnative.valueOf = objArr;
                    this.values = 0;
                    this.PngjBadSignature = 0.0d;
                    this.PngjBadCrcException = 0.0f;
                    this.valueOf = 0.0f;
                    this.PngjUnsupportedException = 0.0f;
                    this.PngjInputException = 0.0f;
                    this.PngjPrematureEnding = 0.0f;
                    this.PngjOutputException = 0.0f;
                    this.PngjExceptionInternal = 0;
                    this.a = 0L;
                    int i4 = ((int[]) objArr[1])[0];
                    int i5 = i4 * i4;
                    int i6 = -(1899938076 * i4);
                    int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
                    int i8 = -(i4 * (-278722472));
                    int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                    int i10 = ((i9 | (-2137270492)) << 1) - ((-2137270492) ^ i9);
                    int i11 = i10 >> 29;
                    int i12 = (((i11 | (-15)) << 1) - (i11 ^ (-15))) / 8;
                    int i13 = (i10 - (~(((i12 | 1) << 1) - (i12 ^ 1)))) - 1;
                    int i14 = i10 >> 18;
                    int i15 = ((i14 ^ (-32767)) + ((i14 & (-32767)) << 1)) / 16384;
                    int i16 = -(i13 ^ (((i15 | 1) << 1) - (i15 ^ 1)));
                    int i17 = ((i16 ^ 5) + ((i16 & 5) << 1)) >> 27;
                    int i18 = ((i17 & (-63)) + (i17 | (-63))) / 32;
                    int i19 = (i18 ^ 1) + ((i18 & 1) << 1);
                    this.e1 = (993300 / (((-((i19 ^ 1) + ((i19 & 1) << 1))) & r5) * 462)) - 430;
                    this.PngBadCharsetException = 0L;
                    this.Action = 0L;
                    this.onErrorResponse = false;
                    this.getAsHighestSecurityLevelReached = false;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) (-bArr[72]), (byte) $$b, (byte) (-bArr[16]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = (byte) (bArr[21] + 1);
            Object[] objArr4 = new Object[1];
            b(b, (byte) (b | 66), bArr[68], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1113730988);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5017;
            Fpnative.valueOf = objArr;
            this.values = 0;
            this.PngjBadSignature = 0.0d;
            this.PngjBadCrcException = 0.0f;
            this.valueOf = 0.0f;
            this.PngjUnsupportedException = 0.0f;
            this.PngjInputException = 0.0f;
            this.PngjPrematureEnding = 0.0f;
            this.PngjOutputException = 0.0f;
            this.PngjExceptionInternal = 0;
            this.a = 0L;
            int i42 = ((int[]) objArr[1])[0];
            int i52 = i42 * i42;
            int i62 = -(1899938076 * i42);
            int i72 = (i52 ^ i62) + ((i52 & i62) << 1);
            int i82 = -(i42 * (-278722472));
            int i92 = (i72 ^ i82) + ((i82 & i72) << 1);
            int i102 = ((i92 | (-2137270492)) << 1) - ((-2137270492) ^ i92);
            int i112 = i102 >> 29;
            int i122 = (((i112 | (-15)) << 1) - (i112 ^ (-15))) / 8;
            int i132 = (i102 - (~(((i122 | 1) << 1) - (i122 ^ 1)))) - 1;
            int i142 = i102 >> 18;
            int i152 = ((i142 ^ (-32767)) + ((i142 & (-32767)) << 1)) / 16384;
            int i162 = -(i132 ^ (((i152 | 1) << 1) - (i152 ^ 1)));
            int i172 = ((i162 ^ 5) + ((i162 & 5) << 1)) >> 27;
            int i182 = ((i172 & (-63)) + (i172 | (-63))) / 32;
            int i192 = (i182 ^ 1) + ((i182 & 1) << 1);
            this.e1 = (993300 / (((-((i192 ^ 1) + ((i192 & 1) << 1))) & r5) * 462)) - 430;
            this.PngBadCharsetException = 0L;
            this.Action = 0L;
            this.onErrorResponse = false;
            this.getAsHighestSecurityLevelReached = false;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, byte b, Object[] objArr) {
        int i;
        int i2;
        int i3 = 126 - s2;
        int i4 = 118 - (b * 19);
        int i5 = 44 - s;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            byte[] bArr3 = bArr;
            i2 = 0;
            int i6 = i4;
            int i7 = i3;
            int i8 = i7 + 1;
            i4 = (i6 + (-i3)) - 13;
            i3 = i8;
            bArr = bArr3;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i9 = i4;
            i7 = i3;
            i3 = bArr[i3];
            bArr3 = bArr;
            i6 = i9;
            int i82 = i7 + 1;
            i4 = (i6 + (-i3)) - 13;
            i3 = i82;
            bArr = bArr3;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
            }
        }
    }

    public FingerAS getAsHighestSecurityLevelReached() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int myPid = Process.myPid();
                    int i = ~myPid;
                    int c = defpackage.a.c((~(myPid | 452747263)) | (~(i | (-405800127))) | (~((-46142017) | myPid)), 192, (((~((-451942143) | i)) | 46142016) * (-384)) + ((805121 | i) * (-192)) + 1796350335, -807251137);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 5036;
                    Fpnative.valueOf = objArr;
                    return this.getPadSub1;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b(bArr[42], bArr[99], (byte) (-bArr[16]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((byte) (-bArr[4]), bArr[42], bArr[68], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -807251137);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5036;
            Fpnative.valueOf = objArr;
            return this.getPadSub1;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0136 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long getCaptureTime() {
        Object[] objArr;
        long j;
        long j2;
        int i;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j3 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j3 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    int c = defpackage.a.c((~(elapsedCpuTime | 498593215)) | (~((-8817849) | (~elapsedCpuTime))), 338, (((489775367 | r6) | (~(8817848 | elapsedCpuTime))) * (-338)) - 1460761219, -1417565455);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 5016;
                    Fpnative.valueOf = objArr;
                    j2 = this.e1;
                    int i4 = ((int[]) objArr[1])[0];
                    int i5 = i4 * i4;
                    int i6 = -(89375384 * i4);
                    int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
                    int i8 = -(i4 * (-1377669792));
                    int i9 = (i7 & i8) + (i8 | i7);
                    int i10 = (i9 ^ 1164394512) + ((1164394512 & i9) << 1);
                    int e = b.e(i10 >> 26, 127, 64, -1);
                    int i11 = (i10 & e) + (e | i10);
                    int i12 = ((i10 >> 20) - 8191) / ConstantsKt.DEFAULT_BLOCK_SIZE;
                    int i13 = -(i11 ^ ((i12 ^ 1) + ((i12 & 1) << 1)));
                    int i14 = ((i13 & 2) + (2 | i13)) >> 21;
                    i = ((i14 ^ (-4095)) + ((i14 & (-4095)) << 1)) / 2048;
                    if (j2 >= (504594 / (((-((((i | 1) << 1) - (i ^ 1)) - (-1))) & r5) * 1649)) - 153) {
                        return 0L;
                    }
                    return j2;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) (-bArr[72]), (byte) $$b, (byte) (-bArr[16]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = (byte) (bArr[21] + 1);
            Object[] objArr4 = new Object[1];
            b(b, (byte) (b | 66), bArr[68], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1417565455);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5016;
            Fpnative.valueOf = objArr;
            j2 = this.e1;
            int i42 = ((int[]) objArr[1])[0];
            int i52 = i42 * i42;
            int i62 = -(89375384 * i42);
            int i72 = (i52 ^ i62) + ((i52 & i62) << 1);
            int i82 = -(i42 * (-1377669792));
            int i92 = (i72 & i82) + (i82 | i72);
            int i102 = (i92 ^ 1164394512) + ((1164394512 & i92) << 1);
            int e2 = b.e(i102 >> 26, 127, 64, -1);
            int i112 = (i102 & e2) + (e2 | i102);
            int i122 = ((i102 >> 20) - 8191) / ConstantsKt.DEFAULT_BLOCK_SIZE;
            int i132 = -(i112 ^ ((i122 ^ 1) + ((i122 & 1) << 1)));
            int i142 = ((i132 & 2) + (2 | i132)) >> 21;
            i = ((i142 ^ (-4095)) + ((i142 & (-4095)) << 1)) / 2048;
            if (j2 >= (504594 / (((-((((i | 1) << 1) - (i ^ 1)) - (-1))) & r5) * 1649)) - 153) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public String getData() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                    int c = defpackage.a.c((~(startElapsedRealtime | (-379375742))) | (~(878265021 | startElapsedRealtime)) | 42242112, -1444, (((~startElapsedRealtime) | 583373504) * 1444) + 1078082705, 1094370335);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4907;
                    Fpnative.valueOf = objArr;
                    return this.Attempt;
                }
            }
            byte[] bArr = $$a;
            byte b = (byte) (-bArr[77]);
            Object[] objArr3 = new Object[1];
            b(b, (byte) (b | 67), (byte) (-bArr[16]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((byte) (-bArr[14]), (byte) ($$b & 180), bArr[42], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1383245937);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4907;
            Fpnative.valueOf = objArr;
            return this.Attempt;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public int getFingerPrintQualityScore() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int b = defpackage.a.b(1411538661);
                    int i = ~b;
                    int i2 = (((((~((-676700998) | i)) | 541360704) | (~(177811717 | i))) | (~((-42471425) | b))) * (-84)) - 544084245;
                    int i3 = (~(b | 177811717)) | 676700997;
                    int i4 = ~(i | (-177811718));
                    int c = defpackage.a.c(i4 | 42471424, 84, ((i3 | i4) * (-84)) + i2, -1128604302);
                    int i5 = c ^ (c << 13);
                    int i6 = i5 ^ (i5 >>> 17);
                    ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
                    ((long[]) objArr[0])[0] = j + 4997;
                    Fpnative.valueOf = objArr;
                    return this.getPadSub3;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) (-bArr[72]), (byte) $$b, (byte) (-bArr[16]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b2 = (byte) (bArr[21] + 1);
            Object[] objArr4 = new Object[1];
            b(b2, (byte) (b2 | 66), bArr[68], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1128604302);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4997;
            Fpnative.valueOf = objArr;
            return this.getPadSub3;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public float getL1Score() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int freeMemory = (int) Runtime.getRuntime().freeMemory();
                    int c = defpackage.a.c((~(freeMemory | (-550202987))) | 1049092266, 519, (((~((~freeMemory) | (-545480747))) | (~((-4722241) | freeMemory))) * (-519)) + ((((~((-1049092267) | r5)) | (-550202987)) * 519) - 726608762), 604584575);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4961;
                    Fpnative.valueOf = objArr;
                    return this.valueOf;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b(bArr[42], bArr[99], (byte) (-bArr[16]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((byte) (-bArr[4]), bArr[42], bArr[68], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 604584575);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4961;
            Fpnative.valueOf = objArr;
            return this.valueOf;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public int getL2Score() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int a = defpackage.a.a();
                    int c = defpackage.a.c((~((~a) | 634384072)) | 135494792, 168, (((~(a | 634384072)) | 135270400) * (-168)) + ((((~(135494792 | a)) | 634159680) * 336) - 1710130969), -495683033);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 5027;
                    Fpnative.valueOf = objArr;
                    return this.PngjExceptionInternal;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) (-bArr[72]), (byte) $$b, (byte) (-bArr[16]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = (byte) (bArr[21] + 1);
            Object[] objArr4 = new Object[1];
            b(b, (byte) (b | 66), bArr[68], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -495683033);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5027;
            Fpnative.valueOf = objArr;
            return this.PngjExceptionInternal;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public float getL3Score() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int maxMemory = (int) Runtime.getRuntime().maxMemory();
                    int c = defpackage.a.c((~(maxMemory | (-116354838))) | 114098944 | (~((~maxMemory) | 384790335)), 988, (((~((-2255894) | r5)) | (~(384790335 | maxMemory))) * 988) - 574810061, 439586937);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4860;
                    Fpnative.valueOf = objArr;
                    return this.PngjUnsupportedException;
                }
            }
            byte[] bArr = $$a;
            byte b = (byte) (-bArr[77]);
            Object[] objArr3 = new Object[1];
            b(b, (byte) (b | 67), (byte) (-bArr[16]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((byte) (-bArr[14]), (byte) ($$b & 180), bArr[42], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 439586937);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4860;
            Fpnative.valueOf = objArr;
            return this.PngjUnsupportedException;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0139 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0136 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long getMatchingTime() {
        Object[] objArr;
        long j;
        long j2;
        int i;
        int i2;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j3 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j3 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int myTid = Process.myTid();
                    int c = defpackage.a.c(~(myTid | 65097441), 113, (((~((~myTid) | 603836385)) | (~((-563986722) | myTid)) | 25247777) * (-113)) + ((((~(65097441 | r6)) | 563986721) * 226) - 41024400), -1180490681);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 4876;
                    Fpnative.valueOf = objArr;
                    j2 = this.Action;
                    int i5 = ((int[]) objArr[1])[0];
                    int i6 = i5 * i5;
                    int i7 = -(206905691 * i5);
                    int i8 = (((i6 & i7) + (i6 | i7)) - (~(-(i5 * 477788007)))) - (-1094237376);
                    int i9 = ((i8 >> 21) - 4095) / 2048;
                    int i10 = (i8 - (~((i9 ^ 1) + ((i9 & 1) << 1)))) - 1;
                    int i11 = ((i8 >> 25) - 255) / Uuid.SIZE_BITS;
                    int i12 = -(i10 ^ ((i11 & 1) + (i11 | 1)));
                    i = (i12 ^ 7) + ((i12 & 7) << 1);
                    int i13 = ((i >> 28) - 31) / 16;
                    i2 = ((i13 | 1) << 1) - (i13 ^ 1);
                    if (j2 >= (1671516 / (((-(((i2 | 1) << 1) - (i2 ^ 1))) & i) * 1809)) - 132) {
                        return 0L;
                    }
                    return j2;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b(bArr[42], bArr[99], (byte) (-bArr[16]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((byte) (-bArr[4]), bArr[42], bArr[68], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1180490681);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4876;
            Fpnative.valueOf = objArr;
            j2 = this.Action;
            int i52 = ((int[]) objArr[1])[0];
            int i62 = i52 * i52;
            int i72 = -(206905691 * i52);
            int i82 = (((i62 & i72) + (i62 | i72)) - (~(-(i52 * 477788007)))) - (-1094237376);
            int i92 = ((i82 >> 21) - 4095) / 2048;
            int i102 = (i82 - (~((i92 ^ 1) + ((i92 & 1) << 1)))) - 1;
            int i112 = ((i82 >> 25) - 255) / Uuid.SIZE_BITS;
            int i122 = -(i102 ^ ((i112 & 1) + (i112 | 1)));
            i = (i122 ^ 7) + ((i122 & 7) << 1);
            int i132 = ((i >> 28) - 31) / 16;
            i2 = ((i132 | 1) << 1) - (i132 ^ 1);
            if (j2 >= (1671516 / (((-(((i2 | 1) << 1) - (i2 ^ 1))) & i) * 1809)) - 132) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public int getNfiq1Score() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = defpackage.a.c((~((~System.identityHashCode(this)) | (-151195038))) | (-794804190), 241, (((~((-722444254) | r0)) | 571249216) * (-241)) - 994721667, -1317032922);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4929;
                    Fpnative.valueOf = objArr;
                    return this.values;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b(bArr[42], bArr[99], (byte) (-bArr[16]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((byte) (-bArr[4]), bArr[42], bArr[68], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1317032922);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4929;
            Fpnative.valueOf = objArr;
            return this.values;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0138 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long getOveralTimetaken() {
        Object[] objArr;
        long j;
        long j2;
        int e;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j3 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j3 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int uptimeMillis = (int) SystemClock.uptimeMillis();
                    int c = defpackage.a.c((~(uptimeMillis | 139863176)) | (~((~uptimeMillis) | 638752456)), 959, (((~(139863176 | r5)) | (~(uptimeMillis | 638752456))) * 959) - 133027219, 547286276);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 5024;
                    Fpnative.valueOf = objArr;
                    j2 = this.a;
                    int i3 = ((int[]) objArr[1])[0];
                    int i4 = i3 * i3;
                    int i5 = -(1184039580 * i3);
                    int i6 = (((i4 ^ i5) + ((i4 & i5) << 1)) - (~(-(i3 * (-2129638632))))) - 1;
                    int i7 = (i6 & 2025025956) + (2025025956 | i6);
                    int i8 = i7 >> 25;
                    int a = b.a(i8 ^ (-255), (i8 & (-255)) << 1, Uuid.SIZE_BITS, -1);
                    int i9 = (i7 & a) + (a | i7);
                    int i10 = ((i7 >> 29) - 15) / 8;
                    int i11 = -(i9 ^ (((i10 | 1) << 1) - (i10 ^ 1)));
                    int i12 = ((i11 & 7) + (i11 | 7)) >> 24;
                    e = b.e((i12 | (-511)) << 1, i12 ^ (-511), 256, -1);
                    if (j2 >= (8186178 / (((-((e ^ 1) + ((e & 1) << 1))) & r4) * 1551)) - 754) {
                        return 0L;
                    }
                    return j2;
                }
            }
            byte[] bArr = $$a;
            byte b = (byte) (-bArr[77]);
            Object[] objArr3 = new Object[1];
            b(b, (byte) (b | 67), (byte) (-bArr[16]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((byte) (-bArr[14]), (byte) ($$b & 180), bArr[42], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 547286276);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5024;
            Fpnative.valueOf = objArr;
            j2 = this.a;
            int i32 = ((int[]) objArr[1])[0];
            int i42 = i32 * i32;
            int i52 = -(1184039580 * i32);
            int i62 = (((i42 ^ i52) + ((i42 & i52) << 1)) - (~(-(i32 * (-2129638632))))) - 1;
            int i72 = (i62 & 2025025956) + (2025025956 | i62);
            int i82 = i72 >> 25;
            int a2 = b.a(i82 ^ (-255), (i82 & (-255)) << 1, Uuid.SIZE_BITS, -1);
            int i92 = (i72 & a2) + (a2 | i72);
            int i102 = ((i72 >> 29) - 15) / 8;
            int i112 = -(i92 ^ (((i102 | 1) << 1) - (i102 ^ 1)));
            int i122 = ((i112 & 7) + (i112 | 7)) >> 24;
            e = b.e((i122 | (-511)) << 1, i122 ^ (-511), 256, -1);
            if (j2 >= (8186178 / (((-((e ^ 1) + ((e & 1) << 1))) & r4) * 1551)) - 754) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public float getPadSub1() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                    int i = ~startElapsedRealtime;
                    int c = defpackage.a.c((~(startElapsedRealtime | (-419433476))) | (~(457248515 | i)) | 3825724, 140, (((~(41640764 | i)) | 419433475) * (-280)) + ((startElapsedRealtime | 41640764) * 140) + 1314659907, 788342811);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 5047;
                    Fpnative.valueOf = objArr;
                    return this.PngjInputException;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b(bArr[42], bArr[99], (byte) (-bArr[16]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((byte) (-bArr[4]), bArr[42], bArr[68], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 788342811);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5047;
            Fpnative.valueOf = objArr;
            return this.PngjInputException;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public float getPadSub2() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = defpackage.a.c(~(((int) Process.getStartElapsedRealtime()) | (-488664355)), -1504, (((~((-492924771) | r0)) | 4260416) * 1504) - 1003693777, -725311687);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 5032;
                    Fpnative.valueOf = objArr;
                    return this.PngjPrematureEnding;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) (-bArr[72]), (byte) $$b, (byte) (-bArr[16]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = (byte) (bArr[21] + 1);
            Object[] objArr4 = new Object[1];
            b(b, (byte) (b | 66), bArr[68], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -115196375);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5032;
            Fpnative.valueOf = objArr;
            return this.PngjPrematureEnding;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public float getPadSub3() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i = ~(141656570 | identityHashCode);
                    int i2 = ~identityHashCode;
                    int c = defpackage.a.c((~(identityHashCode | (-640545851))) | (~((-141656571) | i2)), 406, ((~(780006906 | i2)) * (-406)) + ((i | (~((-139461057) | i2))) * (-406)) + 752286257, 2036438655);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 4957;
                    Fpnative.valueOf = objArr;
                    return this.PngjOutputException;
                }
            }
            byte[] bArr = $$a;
            byte b = (byte) (-bArr[77]);
            Object[] objArr3 = new Object[1];
            b(b, (byte) (b | 67), (byte) (-bArr[16]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((byte) (-bArr[14]), (byte) ($$b & 180), bArr[42], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 2036438655);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4957;
            Fpnative.valueOf = objArr;
            return this.PngjOutputException;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0140 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x013d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long getProcessingTime() {
        Object[] objArr;
        long j;
        long j2;
        int i;
        int i2;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j3 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j3 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int myUid = Process.myUid();
                    int c = defpackage.a.c((~(myUid | (-522269922))) | (~(1021159201 | myUid)) | 52433088, -1444, (((~myUid) | 603755456) * 1444) + 1078082705, -978424407);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 4962;
                    Fpnative.valueOf = objArr;
                    j2 = this.PngBadCharsetException;
                    int i5 = ((int[]) objArr[1])[0];
                    int i6 = i5 * i5;
                    int i7 = -(187324245 * i5);
                    int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
                    int i9 = -(i5 * (-602670565));
                    int i10 = (i8 & i9) + (i9 | i8);
                    int i11 = (i10 & (-351665088)) + ((-351665088) | i10);
                    int i12 = ((i11 >> 19) - 16383) / ConstantsKt.DEFAULT_BUFFER_SIZE;
                    int i13 = (i12 & 1) + (i12 | 1);
                    int i14 = (i11 ^ i13) + ((i13 & i11) << 1);
                    int i15 = i11 >> 16;
                    int i16 = ((i15 ^ (-131071)) + ((i15 & (-131071)) << 1)) / 65536;
                    int i17 = -(i14 ^ ((i16 & 1) + (i16 | 1)));
                    i = (i17 ^ 3) + ((i17 & 3) << 1);
                    int i18 = ((i >> 22) - 2047) / 1024;
                    i2 = (i18 ^ 1) + ((i18 & 1) << 1);
                    if (j2 >= (3241728 / (((-((i2 ^ 1) + ((i2 & 1) << 1))) & i) * 1206)) - 896) {
                        return 0L;
                    }
                    return j2;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) (-bArr[72]), (byte) $$b, (byte) (-bArr[16]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = (byte) (bArr[21] + 1);
            Object[] objArr4 = new Object[1];
            b(b, (byte) (b | 66), bArr[68], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1141318651);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4962;
            Fpnative.valueOf = objArr;
            j2 = this.PngBadCharsetException;
            int i52 = ((int[]) objArr[1])[0];
            int i62 = i52 * i52;
            int i72 = -(187324245 * i52);
            int i82 = (i62 ^ i72) + ((i62 & i72) << 1);
            int i92 = -(i52 * (-602670565));
            int i102 = (i82 & i92) + (i92 | i82);
            int i112 = (i102 & (-351665088)) + ((-351665088) | i102);
            int i122 = ((i112 >> 19) - 16383) / ConstantsKt.DEFAULT_BUFFER_SIZE;
            int i132 = (i122 & 1) + (i122 | 1);
            int i142 = (i112 ^ i132) + ((i132 & i112) << 1);
            int i152 = i112 >> 16;
            int i162 = ((i152 ^ (-131071)) + ((i152 & (-131071)) << 1)) / 65536;
            int i172 = -(i142 ^ ((i162 & 1) + (i162 | 1)));
            i = (i172 ^ 3) + ((i172 & 3) << 1);
            int i182 = ((i >> 22) - 2047) / 1024;
            i2 = (i182 ^ 1) + ((i182 & 1) << 1);
            if (j2 >= (3241728 / (((-((i2 ^ 1) + ((i2 & 1) << 1))) & i) * 1206)) - 896) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public double getQualityScore() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i = (~((-267942721) | identityHashCode)) | 230715968;
                    int i2 = ~identityHashCode;
                    int c = defpackage.a.c(~(i2 | 230946559), 886, (((~(i2 | 267942720)) | 230946559) * (-1772)) + ((i | (~(268173311 | i2))) * 886) + 540250067, 2044639169);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 4969;
                    Fpnative.valueOf = objArr;
                    return this.PngjBadSignature;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) (-bArr[72]), (byte) $$b, (byte) (-bArr[16]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = (byte) (bArr[21] + 1);
            Object[] objArr4 = new Object[1];
            b(b, (byte) (b | 66), bArr[68], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 2044639169);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4969;
            Fpnative.valueOf = objArr;
            return this.PngjBadSignature;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public int getScore() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int uptimeMillis = (int) SystemClock.uptimeMillis();
                    int i = ((uptimeMillis | 464194123) * (-50)) + 499001149;
                    int i2 = ~((-33620545) | uptimeMillis);
                    int i3 = ~uptimeMillis;
                    int c = defpackage.a.c((~(i3 | 464194123)) | (~((-34695157) | i3)) | 1074612, 50, ((i2 | (~((-1074613) | i3))) * 50) + i, 281597494);
                    int i4 = c ^ (c << 13);
                    int i5 = i4 ^ (i4 >>> 17);
                    ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                    ((long[]) objArr[0])[0] = j + 4943;
                    Fpnative.valueOf = objArr;
                    return this.PngjException;
                }
            }
            byte[] bArr = $$a;
            byte b = (byte) (-bArr[77]);
            Object[] objArr3 = new Object[1];
            b(b, (byte) (b | 67), (byte) (-bArr[16]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((byte) (-bArr[14]), (byte) ($$b & 180), bArr[42], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 281597494);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4943;
            Fpnative.valueOf = objArr;
            return this.PngjException;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public float getSpoofScore() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int myPid = Process.myPid();
                    int c = defpackage.a.c(myPid | 217002622, 496, (((~((-281886658) | myPid)) | 13447744 | (~((~myPid) | 485441535))) * (-496)) + ((r5 * 992) - 2137057233), -1688300247);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4914;
                    Fpnative.valueOf = objArr;
                    return this.PngjBadCrcException;
                }
            }
            byte[] bArr = $$a;
            byte b = (byte) (-bArr[77]);
            Object[] objArr3 = new Object[1];
            b(b, (byte) (b | 67), (byte) (-bArr[16]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((byte) (-bArr[14]), (byte) ($$b & 180), bArr[42], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1688300247);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4914;
            Fpnative.valueOf = objArr;
            return this.PngjBadCrcException;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public boolean isAuthSucess() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = defpackage.a.c((~((~defpackage.a.b(88807956)) | (-557318568))) | (-1065129960), 521, ((~((-557318568) | r0)) * 521) - 1219347320, -1562148214);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4956;
                    Fpnative.valueOf = objArr;
                    return this.onErrorResponse;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b(bArr[42], bArr[99], (byte) (-bArr[16]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((byte) (-bArr[4]), bArr[42], bArr[68], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1562148214);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4956;
            Fpnative.valueOf = objArr;
            return this.onErrorResponse;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public boolean isQualityFailed() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i = (((~(134950246 | identityHashCode)) | 363939033) * 672) + 1483352767;
                    int i2 = ~identityHashCode;
                    int c = defpackage.a.c((~((-363939034) | i2)) | 363872409, 672, (((~(identityHashCode | 363939033)) | (~((-134950247) | i2))) * (-672)) + i, 1526728292);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 4853;
                    Fpnative.valueOf = objArr;
                    return this.getAsHighestSecurityLevelReached;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b(bArr[42], bArr[99], (byte) (-bArr[16]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((byte) (-bArr[4]), bArr[42], bArr[68], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1526728292);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4853;
            Fpnative.valueOf = objArr;
            return this.getAsHighestSecurityLevelReached;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public Attempt(int i, double d, int i2, int i3, float f, float f2, float f3, float f4, float f5, float f6, long j, long j2, long j3, boolean z, boolean z2, String str, int i4, long j4, FingerAS fingerAS, FingerMatchSecLevel fingerMatchSecLevel) {
        Object[] objArr;
        long j5;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j6 = ((long[]) objArr2[0])[0];
                j5 = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j6 > j5) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = defpackage.a.c(~((~((int) SystemClock.elapsedRealtime())) | (-536871489)), -948, (((~(398694698 | r0)) | (-897583979)) * (-948)) - 12649861, -2037216983);
                    int i5 = c ^ (c << 13);
                    int i6 = i5 ^ (i5 >>> 17);
                    ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
                    ((long[]) objArr[0])[0] = j5 + 5040;
                    Fpnative.valueOf = objArr;
                    this.PngjException = i;
                    this.PngjBadSignature = d;
                    this.values = i2;
                    this.PngjExceptionInternal = i3;
                    this.PngjBadCrcException = f;
                    this.valueOf = f2;
                    this.PngjUnsupportedException = f3;
                    this.e1 = j;
                    this.PngBadCharsetException = j2;
                    this.Action = j3;
                    this.onErrorResponse = z;
                    this.getAsHighestSecurityLevelReached = z2;
                    this.Attempt = str;
                    this.getPadSub3 = i4;
                    this.a = j4;
                    this.getPadSub1 = fingerAS;
                    this.getPadSub2 = fingerMatchSecLevel;
                    this.PngjInputException = f4;
                    this.PngjPrematureEnding = f5;
                    this.PngjOutputException = f6;
                }
            }
            byte[] bArr = $$a;
            byte b = (byte) (-bArr[77]);
            Object[] objArr3 = new Object[1];
            b(b, (byte) (b | 67), (byte) (-bArr[16]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((byte) (-bArr[14]), (byte) ($$b & 180), bArr[42], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 104268961);
            j5 = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j5 + 5040;
            Fpnative.valueOf = objArr;
            this.PngjException = i;
            this.PngjBadSignature = d;
            this.values = i2;
            this.PngjExceptionInternal = i3;
            this.PngjBadCrcException = f;
            this.valueOf = f2;
            this.PngjUnsupportedException = f3;
            this.e1 = j;
            this.PngBadCharsetException = j2;
            this.Action = j3;
            this.onErrorResponse = z;
            this.getAsHighestSecurityLevelReached = z2;
            this.Attempt = str;
            this.getPadSub3 = i4;
            this.a = j4;
            this.getPadSub1 = fingerAS;
            this.getPadSub2 = fingerMatchSecLevel;
            this.PngjInputException = f4;
            this.PngjPrematureEnding = f5;
            this.PngjOutputException = f6;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
