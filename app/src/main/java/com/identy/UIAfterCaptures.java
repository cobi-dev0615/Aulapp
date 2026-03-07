package com.identy;

import android.os.SystemClock;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public enum UIAfterCaptures {
    ALERTS("A"),
    INLINE("I");

    private static  byte[] $$a = null;
    private static  int $$b = 0;
    String a;

    static {
        init$0();
    }

    UIAfterCaptures(String str) {
        this.a = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, byte b2, int i2, Object[] objArr) {
        int i3;
        int i4 = 118 - (b2 * 19);
        byte[] bArr = $$a;
        int i5 = i2 + 4;
        byte[] bArr2 = new byte[i + 6];
        int i6 = i + 5;
        if (bArr == null) {
            int i7 = i6;
            int i8 = i5;
            int i9 = 0;
            int i10 = (i5 + i7) - 8;
            i5 = i8 + 1;
            i4 = i10;
            i3 = i9;
            bArr2[i3] = (byte) i4;
            i9 = i3 + 1;
            if (i3 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i7 = bArr[i5];
            int i11 = i5;
            i5 = i4;
            i8 = i11;
            int i102 = (i5 + i7) - 8;
            i5 = i8 + 1;
            i4 = i102;
            i3 = i9;
            bArr2[i3] = (byte) i4;
            i9 = i3 + 1;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            int i9 = i3 + 1;
            if (i3 == i6) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{31, 21, -121, 35, 20, 6, -55, 67, 3, 9, 17, 14, 13, -67, 33, 54, -4, 3, 9, -15, 41, -32, 54, -4, 3, 9, -21, 37, 15, 12, -3, 21, 38, 1, 11, -32, 39, 11, -9, 30, 6, 15, -5, 27, 9, 5, -5, 20, 6, -55, 67, 3, 9, 17, 14, 13, -67, 65, -49, 42, 38, 1, 11, -32, 39, 11, -25, 55, -7, -22, 59, -13, 10, 19, 12, -3, 14, 7, -13, 19, 17, -8, 22};
        $$b = 36;
    }

    public static UIAfterCaptures valueOfString(String str) {
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
                    int c = defpackage.a.c((~(a | (-151202856))) | (-801619688), 235, (((~((-725855912) | a)) | (-226966632)) * (-470)) + ((((~((~a) | (-725855912))) | (-226966632)) * (-235)) - 23798116), 1688928005);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4981;
                    Fpnative.valueOf = objArr;
                    return (UIAfterCaptures) Enum.valueOf(UIAfterCaptures.class, str);
                }
            }
            byte[] bArr = $$a;
            byte b2 = (byte) (bArr[43] - 1);
            byte b3 = bArr[33];
            Object[] objArr3 = new Object[1];
            c(b2, b3, (byte) (b3 | 42), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b4 = (byte) (bArr[33] - 1);
            byte b5 = b4;
            Object[] objArr4 = new Object[1];
            c(b4, b5, (byte) (b5 | 74), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1688928005);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4981;
            Fpnative.valueOf = objArr;
            return (UIAfterCaptures) Enum.valueOf(UIAfterCaptures.class, str);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static UIAfterCaptures[] valuesCustom() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = defpackage.a.c((~((~((int) SystemClock.elapsedRealtime())) | (-243553353))) | 255335927, 160, (((~(0 | 255335927)) | (-264003072)) * (-160)) - 990971937, -617693138);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4931;
                    Fpnative.valueOf = objArr;
                    return (UIAfterCaptures[]) values().clone();
                }
            }
            byte[] bArr = $$a;
            byte b2 = (byte) (bArr[82] + 1);
            byte b3 = bArr[33];
            Object[] objArr3 = new Object[1];
            c(b2, b3, (byte) (b3 - 1), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b4 = bArr[72];
            Object[] objArr4 = new Object[1];
            c(b4, (byte) (b4 >>> 2), (byte) (bArr[43] + 1), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -617693138);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4931;
            Fpnative.valueOf = objArr;
            return (UIAfterCaptures[]) values().clone();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
