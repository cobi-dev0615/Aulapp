package com.identy.statusupdate;

import android.os.Process;
import com.d.e.a.values;
import com.identy.Fpnative;
import defpackage.a;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public enum CaptureStatus {
    NO_FINGERS,
    FAR,
    CLOSE,
    OUTSIDE,
    NOT_STABLE,
    PLEASE_HOLD,
    CAPTURING,
    CAPTURED,
    QC_ERROR;

    private static final byte[] $$a = null;
    private static final int $$b = 0;

    static {
        init$0();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, int i, Object[] objArr) {
        int i2;
        int i3 = s + 4;
        byte[] bArr = $$a;
        int i4 = 99 - (b * 19);
        byte[] bArr2 = new byte[i + 16];
        int i5 = i + 15;
        if (bArr == null) {
            i4 = i5;
            byte[] bArr3 = bArr;
            int i6 = 0;
            int i7 = i3;
            i4 = (i4 + (-i3)) - 13;
            i3 = i7;
            bArr = bArr3;
            i2 = i6;
            int i8 = i3 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b2 = bArr[i8];
            byte[] bArr4 = bArr;
            i7 = i8;
            i3 = b2;
            i6 = i2 + 1;
            bArr3 = bArr4;
            i4 = (i4 + (-i3)) - 13;
            i3 = i7;
            bArr = bArr3;
            i2 = i6;
            int i82 = i3 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            int i822 = i3 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{60, 89, 26, -54, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -36, -54, -17, -10, -10, -13, 43, -31, -8, -47, -30, -2, -26, 0, -24, -18, 72, -57, -43, -6, -16, 27, -44, -16, 4, -35, -11, -20, 0, -32, -14, -10, 0, -43, -6, -16, 27, -44, -16, 20, -60, 2, 17, -64, 8, -15, -24, -17, -2, -19, -12, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -38, -59, -1, -8, -14, 10, -46, 27, -59, -1, -8, -14, 16, -42, -20, -17, -2, -26, -43, -6, -16, 27, -44, -16, 4, -35, -11, -20, 0, -32, -14, -10, 0};
        $$b = 97;
    }

    public static CaptureStatus valueOf(String str) {
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
                    int c = a.c((~((~elapsedCpuTime) | (-215193142))) | 473647679, 398, (((~((-215193142) | elapsedCpuTime)) | 473647679) * 398) + 704347739, -1732802206);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4986;
                    Fpnative.valueOf = objArr;
                    return (CaptureStatus) Enum.valueOf(CaptureStatus.class, str);
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b(bArr[27], bArr[0], (byte) (-bArr[19]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((byte) (-bArr[77]), (byte) (bArr[1] - 1), bArr[27], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1732802206);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4986;
            Fpnative.valueOf = objArr;
            return (CaptureStatus) Enum.valueOf(CaptureStatus.class, str);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static CaptureStatus[] valuesCustom() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = a.c((~(Process.myUid() | 441305675)) | (-57583605), 529, (((~((~r0) | 441305675)) | (-460320768)) * 529) - 1876653424, 973346045);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 5041;
                    Fpnative.valueOf = objArr;
                    return (CaptureStatus[]) values().clone();
                }
            }
            byte[] bArr = $$a;
            byte b = bArr[27];
            byte b2 = bArr[77];
            Object[] objArr3 = new Object[1];
            b(b, b2, (byte) (b2 & 28), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((byte) (-bArr[77]), (byte) (-bArr[88]), (byte) (bArr[38] - 1), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 973346045);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5041;
            Fpnative.valueOf = objArr;
            return (CaptureStatus[]) values().clone();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
