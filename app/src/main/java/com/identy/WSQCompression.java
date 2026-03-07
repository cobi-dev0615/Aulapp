package com.identy;

import android.os.Process;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public enum WSQCompression {
    WSQ_5_1(2.25d),
    WSQ_10_1(1.5d),
    WSQ_15_1(0.75d),
    WSQ_20_1(0.5d);

    private static byte[] $$a = null;
    private static int $$b = 0;
    double a;

    static {
        init$0();
    }

    WSQCompression(double d) {
        this.a = d;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, int i2, int i3, Object[] objArr) {
        int i4;
        int i5 = 139 - i3;
        int i6 = 118 - (i * 19);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i2 + 6];
        int i7 = i2 + 5;
        if (bArr == null) {
            int i8 = i6;
            i6 = i7;
            i4 = 0;
            i6 = (i6 + i8) - 13;
            i5++;
            bArr2[i4] = (byte) i6;
            if (i4 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i8 = bArr[i5];
            i4++;
            i6 = (i6 + i8) - 13;
            i5++;
            bArr2[i4] = (byte) i6;
            if (i4 == i7) {
            }
        } else {
            i4 = 0;
            bArr2[i4] = (byte) i6;
            if (i4 == i7) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{14, 12, 119, -3, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 36, 54, 17, 10, 10, 13, -43, 31, 8, 47, 30, 2, 26, 0, 24, 18, -72, 57, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 38, 59, 1, 8, 14, -10, 46, -27, 59, 1, 8, 14, -16, 42, 20, 17, 2, 26, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 70, -44, 47, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, -8, 24, 22, -3, 27};
        $$b = 151;
    }

    public static WSQCompression valueOfString(String str) {
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
                    int c = defpackage.a.c(uptimeMillis | (-805295828), 54, (((~((~uptimeMillis) | 669927059)) | (~((-669927060) | uptimeMillis)) | (-805295828)) * 54) + ((((~((-171037780) | 0)) | 35669011) * (-108)) - 687544143), -1382269280);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 5032;
                    Fpnative.valueOf = objArr;
                    return (WSQCompression) Enum.valueOf(WSQCompression.class, str);
                }
            }
            throw new UnsupportedOperationException("Method not decompiled: WSQCompression.valueOfString");
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static WSQCompression[] valuesCustom() {
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
                    int i = (((~(14159209 | startElapsedRealtime)) | 484730070) * 672) - 1513209249;
                    int i2 = ~startElapsedRealtime;
                    int c = defpackage.a.c((~((-484730071) | i2)) | 472146070, 672, (((~(startElapsedRealtime | 484730070)) | (~((-14159210) | i2))) * (-672)) + i, -1327796645);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 5033;
                    Fpnative.valueOf = objArr;
                    return (WSQCompression[]) values().clone();
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c(bArr[77], bArr[75], (short) ($$b & 1007), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(bArr[25], bArr[19], (short) 92, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1327796645);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5033;
            Fpnative.valueOf = objArr;
            return (WSQCompression[]) values().clone();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    public final double getCompression() {
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
                    int i = ~identityHashCode;
                    int c = defpackage.a.c((~(i | (-257396685))) | (-259518464), 564, ((~(identityHashCode | (-18025869))) * 1128) + (((~((-241492596) | i)) | (-257396685) | (~(241492595 | identityHashCode))) * (-564)) + 118917675, -911438084);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4938;
                    Fpnative.valueOf = objArr;
                    return this.a;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c(bArr[77], bArr[26], bArr[21], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b2 = bArr[27];
            byte b3 = b2;
            Object[] objArr4 = new Object[1];
            c(b2, b3, b3, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -911438084);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4938;
            Fpnative.valueOf = objArr;
            return this.a;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x014e A[RETURN] */
    @Override // java.lang.Enum
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i = (int) Runtime.getRuntime().totalMemory();
                    int c = defpackage.a.c((~(i | (-301679160))) | (-197210121), 318, (((~(301679159 | i)) | 167784456) * (-318)) + (((~((-29425665) | i)) | (~((~i) | 469463615))) * (-318)) + 1637473245, 1595493269);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 5042;
                    Fpnative.valueOf = objArr;
                    double d = this.a;
                    int i4 = ((int[]) objArr[1])[0];
                    int i5 = i4 * i4;
                    int i6 = -(850717128 * i4);
                    int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
                    int i8 = -(i4 * 441695806);
                    int i9 = ((i7 ^ i8) + ((i8 & i7) << 1)) - 1565919223;
                    int i10 = i9 >> 16;
                    int i11 = (i9 - (~IdentyB.a(i10 ^ (-131071), (i10 & (-131071)) << 1, 65536, -1))) - 1;
                    int i12 = i9 >> 17;
                    int i13 = -(i11 ^ IdentyB.a(i12 ^ (-65535), (i12 & (-65535)) << 1, 32768, -1));
                    int i14 = (i13 ^ 8) + ((i13 & 8) << 1);
                    int i15 = i14 >> 27;
                    int i16 = ((i15 ^ (-63)) + ((i15 & (-63)) << 1)) / 32;
                    int i17 = ((i16 | 1) << 1) - (i16 ^ 1);
                    return d != ((double) (4736 / (((-((i17 & 1) + (i17 | 1))) & i14) * 592))) + 1.25d ? "5:1" : d == 1.5d ? "10:1" : d == 0.75d ? "15:1" : d == 0.5d ? "20:1" : super.toString();
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c(bArr[77], bArr[75], (short) ($$b & 1007), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(bArr[25], bArr[19], (short) 92, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1595493269);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5042;
            Fpnative.valueOf = objArr;
            double d2 = this.a;
            int i42 = ((int[]) objArr[1])[0];
            int i52 = i42 * i42;
            int i62 = -(850717128 * i42);
            int i72 = (i52 ^ i62) + ((i52 & i62) << 1);
            int i82 = -(i42 * 441695806);
            int i92 = ((i72 ^ i82) + ((i82 & i72) << 1)) - 1565919223;
            int i102 = i92 >> 16;
            int i112 = (i92 - (~IdentyB.a(i102 ^ (-131071), (i102 & (-131071)) << 1, 65536, -1))) - 1;
            int i122 = i92 >> 17;
            int i132 = -(i112 ^ IdentyB.a(i122 ^ (-65535), (i122 & (-65535)) << 1, 32768, -1));
            int i142 = (i132 ^ 8) + ((i132 & 8) << 1);
            int i152 = i142 >> 27;
            int i162 = ((i152 ^ (-63)) + ((i152 & (-63)) << 1)) / 32;
            int i172 = ((i162 | 1) << 1) - (i162 ^ 1);
            if (d2 != ((double) (4736 / (((-((i172 & 1) + (i172 | 1))) & i142) * 592))) + 1.25d) {
            }
            return d2 != ((double) (4736 / (((-((i172 & 1) + (i172 | 1))) & i142) * 592))) + 1.25d ? "5:1" : d2 == 1.5d ? "10:1" : d2 == 0.75d ? "15:1" : d2 == 0.5d ? "20:1" : super.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }
}
