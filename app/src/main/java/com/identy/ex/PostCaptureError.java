package com.identy.ex;

import android.os.Process;
import android.os.SystemClock;
import com.d.e.a.values;
import com.identy.Fpnative;
import defpackage.a;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public enum PostCaptureError {
    INCORRECT_BOXES,
    RT_QUALITY_FAILED,
    RF_QUALITY_FAILED,
    AS_FAILED,
    NO_ERROR;

    private static final byte[] $$a = null;
    private static final int $$b = 0;

    static {
        init$0();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, short s, Object[] objArr) {
        int i;
        int i2;
        int i3 = b + 4;
        int i4 = b2 + 16;
        int i5 = 99 - (s * 19);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i3;
            byte[] bArr3 = bArr;
            i2 = 0;
            int i7 = i4;
            int i8 = i6 + 1;
            i5 = (i7 + i3) - 13;
            i3 = i8;
            bArr = bArr3;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i9 = i5;
            i6 = i3;
            i3 = bArr[i3];
            bArr3 = bArr;
            i7 = i9;
            int i82 = i6 + 1;
            i5 = (i7 + i3) - 13;
            i3 = i82;
            bArr = bArr3;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i4) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i4) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{87, 56, 56, -96, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 36, 54, 17, 10, 10, 13, -43, 31, 8, 47, 30, 2, 26, 0, 24, 18, -72, 57, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 38, 59, 1, 8, 14, -10, 46, -27, 59, 1, 8, 14, -16, 42, 20, 17, 2, 26, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0};
        $$b = 127;
    }

    public static PostCaptureError valueOfString(String str) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    int i = ~((-570561601) | elapsedCpuTime);
                    int i2 = ~elapsedCpuTime;
                    int c = a.c((~(elapsedCpuTime | 651165537)) | (~((-570561601) | i2)) | (~((-8931618) | elapsedCpuTime)), 920, (((~((-579493218) | i2)) | 570561600) * 920) + ((i | (~(i2 | 651165537))) * 920) + 1082253271, 483426050);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 4856;
                    Fpnative.valueOf = objArr;
                    return (PostCaptureError) Enum.valueOf(PostCaptureError.class, str);
                }
            }
            int i5 = $$b;
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) (i5 & 189), bArr[19], bArr[27], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((byte) (i5 & 473), bArr[27], bArr[77], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 483426050);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4856;
            Fpnative.valueOf = objArr;
            return (PostCaptureError) Enum.valueOf(PostCaptureError.class, str);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static PostCaptureError[] valuesCustom() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int elapsedRealtime = (int) SystemClock.elapsedRealtime();
                    int i = ~elapsedRealtime;
                    int i2 = ~(176218464 | i);
                    int c = a.c(i2 | (-322670816), 712, (((~(elapsedRealtime | 465302015)) | (~(i | (-289083552)))) * (-712)) + ((289083551 | i2) * (-712)) + 1693748087, 757599290);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 4893;
                    Fpnative.valueOf = objArr;
                    return (PostCaptureError[]) values().clone();
                }
            }
            byte[] bArr = $$a;
            byte b = bArr[27];
            byte b2 = b;
            Object[] objArr3 = new Object[1];
            b(b2, (byte) (b2 | 28), b, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b3 = bArr[32];
            Object[] objArr4 = new Object[1];
            b(b3, (byte) (b3 & 7), bArr[77], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 757599290);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4893;
            Fpnative.valueOf = objArr;
            return (PostCaptureError[]) values().clone();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
