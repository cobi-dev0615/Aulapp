package com.identy;

import android.os.SystemClock;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public enum QualityMode {
    ENROLMENT_PLUS,
    ENROLLMENT,
    VERIFICATION,
    VERIFICATION_PLUS;

    private static  byte[] $$a = null;
    private static  int $$b = 0;

    static {
        init$0();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, byte b2, Object[] objArr) {
        int i;
        int i2 = 118 - (s * 19);
        int i3 = b + 6;
        byte[] bArr = $$a;
        int i4 = 78 - b2;
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            int i5 = i3;
            int i6 = i4;
            i = 0;
            int i7 = (i4 + i5) - 8;
            i4 = i6 + 1;
            i2 = i7;
            bArr2[i] = (byte) i2;
            i++;
            if (i == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i5 = bArr[i4];
            int i8 = i4;
            i4 = i2;
            i6 = i8;
            int i72 = (i4 + i5) - 8;
            i4 = i6 + 1;
            i2 = i72;
            bArr2[i] = (byte) i2;
            i++;
            if (i == i3) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            i++;
            if (i == i3) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{47, 36, -120, -67, 20, 6, -55, 67, 3, 9, 17, 14, 13, -67, 33, 54, -4, 3, 9, -15, 41, -32, 54, -4, 3, 9, -21, 37, 15, 12, -3, 21, 38, 1, 11, -32, 39, 11, -9, 30, 6, 15, -5, 27, 9, 5, -5, 20, 6, -55, 67, 3, 9, 17, 14, 13, -67, 65, -49, 42, 38, 1, 11, -32, 39, 11, -25, 55, -7, -22, 59, -13, 10, 19, 12, -3, 14, 7, -13, 19, 17, -8, 22};
        $$b = 67;
    }

    public static QualityMode valueOfString(String str) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int a2 = defpackage.a.a();
                    int c = defpackage.a.c((~(a2 | 778027000)) | (~((~a2) | (-639085881))) | 1255480, 168, ((~((-637830401) | a2)) * 168) + ((((~(140196600 | 0)) | 637830400) * 168) - 1710130969), 1348073422);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4940;
                    Fpnative.valueOf = objArr;
                    return (QualityMode) Enum.valueOf(QualityMode.class, str);
                }
            }
            byte[] bArr = $$a;
            byte b = (byte) (bArr[43] - 1);
            byte b2 = bArr[33];
            Object[] objArr3 = new Object[1];
            b(b, b2, (byte) (b2 | 30), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b3 = (byte) (bArr[33] - 1);
            byte b4 = b3;
            Object[] objArr4 = new Object[1];
            b(b3, b4, b4, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1348073422);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4940;
            Fpnative.valueOf = objArr;
            return (QualityMode) Enum.valueOf(QualityMode.class, str);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static QualityMode[] valuesCustom() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int elapsedRealtime = (int) SystemClock.elapsedRealtime();
                    int i = (((~((-279127905) | elapsedRealtime)) | 66112 | (~((-219761376) | elapsedRealtime))) * (-880)) + 1434790607;
                    int i2 = (~((-279127905) | (~elapsedRealtime))) | 219761375;
                    int i3 = ~(elapsedRealtime | 279127904);
                    int c = defpackage.a.c(i3, 880, ((i2 | i3) * (-880)) + i, -1502714902);
                    int i4 = c ^ (c << 13);
                    int i5 = i4 ^ (i4 >>> 17);
                    ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                    ((long[]) objArr[0])[0] = j + 5033;
                    Fpnative.valueOf = objArr;
                    return (QualityMode[]) values().clone();
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) (bArr[82] + 1), bArr[33], (byte) 74, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr[72];
            byte b2 = (byte) (b >>> 2);
            Object[] objArr4 = new Object[1];
            b(b, b2, (byte) (b2 | 44), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1502714902);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5033;
            Fpnative.valueOf = objArr;
            return (QualityMode[]) values().clone();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
