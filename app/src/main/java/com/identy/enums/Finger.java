package com.identy.enums;

import android.os.Process;
import com.d.e.a.values;
import com.identy.Fpnative;
import defpackage.a;
import java.io.Serializable;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public enum Finger implements Serializable {
    THUMB("thumb"),
    INDEX("index"),
    MIDDLE("middle"),
    RING("ring"),
    LITTLE("little");

    private static  byte[] $$a = null;
    private static  int $$b = 0;
    String a;

    static {
        init$0();
    }

    Finger(String str) {
        this.a = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, byte b2, byte b3, Object[] objArr) {
        int i2;
        int i3 = 129 - b3;
        int i4 = 118 - (i * 19);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[44 - b2];
        int i5 = 43 - b2;
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i6 = 0;
            int i7 = i3;
            i4 = (i4 + i3) - 13;
            i3 = i7 + 1;
            bArr = bArr3;
            i2 = i6;
            bArr2[i2] = (byte) i4;
            i6 = i2 + 1;
            if (i2 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b4 = bArr[i3];
            byte[] bArr4 = bArr;
            i7 = i3;
            i3 = b4;
            bArr3 = bArr4;
            i4 = (i4 + i3) - 13;
            i3 = i7 + 1;
            bArr = bArr3;
            i2 = i6;
            bArr2[i2] = (byte) i4;
            i6 = i2 + 1;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            int i6 = i2 + 1;
            if (i2 == i5) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{49, 26, -54, -27, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 70, -44, 47, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, -8, 24, 22, -3, 27, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 36, 54, 17, 10, 10, 13, -43, 31, 8, 47, 30, 2, 26, 0, 24, 18, -72, 57, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 38, 59, 1, 8, 14, -10, 46, -27, 59, 1, 8, 14, -16, 42, 20, 17, 2, 26, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0};
        $$b = 158;
    }

    public static Finger valueOfString(String str) {
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
                    int c = defpackage.a.c(~(myPid | 293969574), 113, (((~((~myPid) | 1070046950)) | (~((-792858855) | myPid)) | 16781478) * (-113)) + ((((~(293969574 | 0)) | 792858854) * 226) - 41024400), -811822094);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4926;
                    Fpnative.valueOf = objArr;
                    return (Finger) Enum.valueOf(Finger.class, str);
                }
            }
            byte[] bArr = $$a;
            byte b2 = bArr[113];
            byte b3 = bArr[63];
            Object[] objArr3 = new Object[1];
            c(b2, b3, (byte) (b3 | 89), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(bArr[32], bArr[4], bArr[117], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -811822094);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4926;
            Fpnative.valueOf = objArr;
            return (Finger) Enum.valueOf(Finger.class, str);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static Finger[] valuesCustom() {
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
                    int c = defpackage.a.c((~(freeMemory | 1056374509)) | 548571309, 366, (((~(553028269 | freeMemory)) | 1051917549) * (-366)) + 40019391, -899590866);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4910;
                    Fpnative.valueOf = objArr;
                    return (Finger[]) values().clone();
                }
            }
            byte[] bArr = $$a;
            byte b2 = bArr[113];
            byte b3 = bArr[34];
            Object[] objArr3 = new Object[1];
            c(b2, b3, (byte) (b3 | 113), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(bArr[63], bArr[111], (byte) 94, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -899590866);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4910;
            Fpnative.valueOf = objArr;
            return (Finger[]) values().clone();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
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
                    int i2 = (~((-291694435) | i)) | 287466786;
                    int i3 = ~(identityHashCode | (-202967198));
                    int c = defpackage.a.c(~(i | (-207194846)), 713, (i3 * 1426) + ((i2 | i3) * (-713)) + 617554092, -2003598730);
                    int i4 = c ^ (c << 13);
                    int i5 = i4 ^ (i4 >>> 17);
                    ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                    ((long[]) objArr[0])[0] = j + 5043;
                    Fpnative.valueOf = objArr;
                    return this.a;
                }
            }
            byte[] bArr = $$a;
            byte b2 = bArr[113];
            byte b3 = bArr[29];
            int i6 = $$b;
            Object[] objArr3 = new Object[1];
            c(b2, b3, (byte) (i6 & 125), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(bArr[32], (byte) (i6 & 125), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -2003598730);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5043;
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
