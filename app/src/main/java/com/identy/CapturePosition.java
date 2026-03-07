package com.identy;

import android.os.Process;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public enum CapturePosition {
    HORIZONTAL,
    VERTICAL_FROM_BOTTOM,
    VERTICAL_FROM_TOP;

    private static  byte[] $$a = null;
    private static  int $$b = 0;

    static {
        init$0();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, int i, int i2, Object[] objArr) {
        int i3;
        int i4 = (s * 19) + 80;
        int i5 = 83 - i;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i2 + 6];
        int i6 = i2 + 5;
        if (bArr == null) {
            int i7 = i5;
            int i8 = 0;
            i5++;
            i4 = (i4 + i7) - 13;
            i3 = i8;
            bArr2[i3] = (byte) i4;
            i8 = i3 + 1;
            if (i3 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i7 = bArr[i5];
            i5++;
            i4 = (i4 + i7) - 13;
            i3 = i8;
            bArr2[i3] = (byte) i4;
            i8 = i3 + 1;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            int i8 = i3 + 1;
            if (i3 == i6) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{30, 69, 34, 112, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 70, -44, 47, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, -8, 24, 22, -3, 27, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 36, 54, 17, 10, 10, 13, -43, 31, 8, 47, 30, 2, 26, 0, 24, 18, -72, 57, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12};
        $$b = 123;
    }

    public static CapturePosition valueOfString(String str) {
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
                    int i = ~a2;
                    int i2 = (((~((-541201473) | i)) | (~((-178119559) | a2))) * 520) - 1786245673;
                    int i3 = ~(178119558 | i);
                    int i4 = ~(a2 | 677008838);
                    int c = defpackage.a.c(i4 | (~(i | (-677008839))) | (-719321031), 520, ((i3 | i4) * (-1040)) + i2, -960266671);
                    int i5 = c ^ (c << 13);
                    int i6 = i5 ^ (i5 >>> 17);
                    ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
                    ((long[]) objArr[0])[0] = j + 4968;
                    Fpnative.valueOf = objArr;
                    return (CapturePosition) Enum.valueOf(CapturePosition.class, str);
                }
            }
            byte b = (byte) ($$b & 5);
            byte[] bArr = $$a;
            byte b2 = bArr[17];
            Object[] objArr3 = new Object[1];
            b(b, b2, (byte) (b2 - 5), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b3 = bArr[63];
            Object[] objArr4 = new Object[1];
            b(b3, b3, bArr[55], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -960266671);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4968;
            Fpnative.valueOf = objArr;
            return (CapturePosition) Enum.valueOf(CapturePosition.class, str);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static CapturePosition[] valuesCustom() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int myTid = Process.myTid();
                    int i = ~myTid;
                    int i2 = (((~((-566165262) | i)) | 557478157) * (-1188)) + 75559905;
                    int i3 = (~(myTid | 566165261)) | 557478157;
                    int i4 = ~(1065054541 | i);
                    int c = defpackage.a.c((~(i | 566165261)) | (-1073741646) | i4, 594, ((i3 | i4) * 594) + i2, 1348539460);
                    int i5 = c ^ (c << 13);
                    int i6 = i5 ^ (i5 >>> 17);
                    ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
                    ((long[]) objArr[0])[0] = j + 4858;
                    Fpnative.valueOf = objArr;
                    return (CapturePosition[]) values().clone();
                }
            }
            int i7 = $$b;
            byte b = (byte) (i7 & 5);
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b(b, (byte) (b | 78), bArr[62], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b(bArr[32], (byte) (i7 & 180), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1348539460);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4858;
            Fpnative.valueOf = objArr;
            return (CapturePosition[]) values().clone();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }
}
