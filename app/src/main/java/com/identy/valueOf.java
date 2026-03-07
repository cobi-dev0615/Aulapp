package com.identy;

import android.os.Process;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public enum valueOf {
    SUCCESS,
    RETAKE,
    UNSUCCESS;

    private static  byte[] $$a = null;
    private static  int $$b = 0;

    static {
        init$0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v7, types: [int] */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        byte b2;
        byte[] bArr = $$a;
        int r5 = (s * 19) + 80;
        int i3 = 83 - i;
        byte[] bArr2 = new byte[44 - b];
        int r7 = 43 - b;
        if (bArr == null) {
            byte b3 = 0;
            byte b4 = 0;
            i2 = 0;
            i3++;
            b2 = (b4 + b3) - 13;
            bArr2[i2] = b2 == true ? (byte) 1 : (byte) 0;
            if (i2 == 0) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2++;
            b3 = bArr[i3];
            b4 = b2;
            i3++;
            b2 = (b4 + b3) - 13;
            bArr2[i2] = b2 == true ? (byte) 1 : (byte) 0;
            if (i2 == 0) {
            }
        } else {
            i2 = 0;
            b2 = 0;
            bArr2[i2] = b2 == true ? (byte) 1 : (byte) 0;
            if (i2 == 0) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{31, 21, -121, 35, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 70, -44, 47, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, -8, 24, 22, -3, 27, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 36, 54, 17, 10, 10, 13, -43, 31, 8, 47, 30, 2, 26, 0, 24, 18, -72, 57, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12};
        $$b = 79;
    }

    public static valueOf valueOfString(String str) {
        java.lang.Object[] objArr;
        long j;
        java.lang.Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new java.lang.Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = defpackage.a.c((~((~((int) Process.getStartUptimeMillis())) | 461902059)) | (-431780288), 184, (((-3432725) | 0) * 184) - 1657916169, -151298680);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4952;
                    Fpnative.valueOf = objArr;
                    return (valueOf) Enum.valueOf(valueOf.class, str);
                }
            }
            byte b = (byte) ($$b & 1);
            byte[] bArr = $$a;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a(b, bArr[17], bArr[63], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b2 = bArr[63];
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a(b2, b2, bArr[4], objArr4);
            objArr = (java.lang.Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -151298680);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4952;
            Fpnative.valueOf = objArr;
            return (valueOf) Enum.valueOf(valueOf.class, str);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static valueOf[] valuesCustom() {
        java.lang.Object[] objArr;
        long j;
        java.lang.Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new java.lang.Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int elapsedRealtime = (int) SystemClock.elapsedRealtime();
                    int i = (((~((-209200456) | elapsedRealtime)) | (-289688825)) * (-318)) + 673391713;
                    int i2 = ~((-289688825) | elapsedRealtime);
                    int i3 = ~elapsedRealtime;
                    int c = defpackage.a.c((~(elapsedRealtime | 494693887)) | (~((-285493433) | i3)), 318, ((i2 | (~(i3 | 494693887))) * 318) + i, 1619985614);
                    int i4 = c ^ (c << 13);
                    int i5 = i4 ^ (i4 >>> 17);
                    ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                    ((long[]) objArr[0])[0] = j + 4963;
                    Fpnative.valueOf = objArr;
                    return (valueOf[]) values().clone();
                }
            }
            int i6 = $$b;
            byte[] bArr = $$a;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a((byte) (i6 & 1), (byte) i6, bArr[34], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a(bArr[32], (byte) (bArr[16] + 1), (byte) 38, objArr4);
            objArr = (java.lang.Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1619985614);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4963;
            Fpnative.valueOf = objArr;
            return (valueOf[]) values().clone();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }
}
