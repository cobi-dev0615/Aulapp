package com.identy;

import android.os.Process;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public enum FingerAS {
    NONE("N"),
    LOW("L"),
    MEDIUM("M"),
    BALANCED_HIGH("BH"),
    HIGH("H"),
    BALANCED_VERY_HIGH("BVH"),
    VERY_HIGH("VH"),
    HIGHEST("HT");

    private static final byte[] $$a = null;
    private static final int $$b = 0;
    String a;

    static {
        init$0();
    }

    FingerAS(String str) {
        this.a = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b2, int i, int i2, Object[] objArr) {
        int i3;
        int i4;
        int i5 = 93 - i;
        byte[] bArr = $$a;
        int i6 = 44 - b2;
        int i7 = 99 - (i2 * 19);
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i8 = i5;
            byte[] bArr3 = bArr;
            int i9 = 0;
            int i10 = i6;
            int i11 = i10 + i5;
            i5 = i8 + 1;
            i7 = i11 - 13;
            bArr = bArr3;
            i3 = i9;
            bArr2[i3] = (byte) i7;
            i4 = i3 + 1;
            if (i4 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i12 = i7;
            i8 = i5;
            i5 = bArr[i5];
            i9 = i4;
            bArr3 = bArr;
            i10 = i12;
            int i112 = i10 + i5;
            i5 = i8 + 1;
            i7 = i112 - 13;
            bArr = bArr3;
            i3 = i9;
            bArr2[i3] = (byte) i7;
            i4 = i3 + 1;
            if (i4 == i6) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i7;
            i4 = i3 + 1;
            if (i4 == i6) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{58, 76, -101, 43, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 36, 54, 17, 10, 10, 13, -43, 31, 8, 47, 30, 2, 26, 0, 24, 18, -72, 57, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 38, 59, 1, 8, 14, -10, 46, -27, 59, 1, 8, 14, -16, 42, 20, 17, 2, 26, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0};
        $$b = 17;
    }

    public static FingerAS valueOf(String str) {
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
                    int c = defpackage.a.c((~startElapsedRealtime) | (-299585), 756, (((~((-299585) | startElapsedRealtime)) | 499188864) * (-756)) + 155034675, 2003176663);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4981;
                    Fpnative.valueOf = objArr;
                    return (FingerAS) Enum.valueOf(FingerAS.class, str);
                }
            }
            byte[] bArr = $$a;
            byte b2 = (byte) 28;
            Object[] objArr3 = new Object[1];
            c(bArr[59], b2, bArr[27], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(b2, bArr[27], bArr[77], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 2003176663);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4981;
            Fpnative.valueOf = objArr;
            return (FingerAS) Enum.valueOf(FingerAS.class, str);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static FingerAS[] valuesCustom() {
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
                    int c = defpackage.a.c((~(freeMemory | (-134365246))) | 289417474, 235, (((~((-171918526) | freeMemory)) | 326970754) * (-470)) + (((~((~freeMemory) | (-171918526))) | 326970754) * (-235)) + 1302468714, -1052466576);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4922;
                    Fpnative.valueOf = objArr;
                    return (FingerAS[]) values().clone();
                }
            }
            byte b2 = $$a[27];
            byte b3 = b2;
            Object[] objArr3 = new Object[1];
            c(b3, (byte) (b3 | 89), b2, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(r1[4], r1[81], r1[77], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1052466576);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4922;
            Fpnative.valueOf = objArr;
            return (FingerAS[]) values().clone();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final String getShortform() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = defpackage.a.c((~((~defpackage.a.b(485300798)) | 297037105)) | 1280, 374, ((297035825 | r0) * (-374)) - 79340587, 963230402);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4943;
                    Fpnative.valueOf = objArr;
                    return this.a;
                }
            }
            byte b2 = $$a[27];
            byte b3 = b2;
            Object[] objArr3 = new Object[1];
            c(b3, (byte) (b3 | 89), b2, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(r1[4], r1[81], r1[77], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 963230402);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4943;
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
}
