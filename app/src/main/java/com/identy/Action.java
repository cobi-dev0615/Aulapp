package com.identy;

import android.os.Process;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public enum Action {
    ENROLL,
    VERIFY,
    CAPTURE,
    DEDUP,
    ENROLL_WITH_TEMPLATE,
    MATCH_WITH_TEMPLATE;

    private static  byte[] $$a = null;
    private static  int $$b = 0;

    static {
        init$0();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, byte b2, Object[] objArr) {
        int i2;
        int i3;
        int i4 = 78 - b;
        byte[] bArr = $$a;
        int i5 = b2 + 6;
        int i6 = 118 - (i * 19);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i5;
            i3 = 0;
            i4++;
            i6 = (i6 + (-i7)) - 8;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i7 = bArr[i4];
            i4++;
            i6 = (i6 + (-i7)) - 8;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{86, -2, 20, 39, -20, -6, 55, -67, -3, -9, -17, -14, -13, 67, -33, -54, 4, -3, -9, 15, -41, 32, -54, 4, -3, -9, 21, -37, -15, -12, 3, -21, -38, -1, -11, 32, -39, -11, 9, -30, -6, -15, 5, -27, -9, -5, 5, -20, -6, 55, -67, -3, -9, -17, -14, -13, 67, -65, 49, -42, -38, -1, -11, 32, -39, -11, 25, -55, 7, 22, -59, 13, -10, -19, -12, 3, -14, -7, 13, -19, -17, 8, -22};
        $$b = 71;
    }

    public static Action valueOfString(String str) {
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
                    int c = defpackage.a.c((~(elapsedRealtime | 848851307)) | (-641961537), 70, ((~((-71536129) | elapsedRealtime)) * 70) + ((((~((-349962028) | elapsedRealtime)) | 278425899) * (-140)) - 1483523191), 830084114);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4853;
                    Fpnative.valueOf = objArr;
                    return (Action) Enum.valueOf(Action.class, str);
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) (bArr[21] - 1), (byte) (-bArr[33]), (byte) (bArr[66] + 1), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = (byte) (bArr[33] + 1);
            byte b2 = b;
            Object[] objArr4 = new Object[1];
            b(b, b2, b2, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 830084114);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4853;
            Fpnative.valueOf = objArr;
            return (Action) Enum.valueOf(Action.class, str);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static Action[] valuesCustom() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = defpackage.a.c((~((~((int) Process.getElapsedCpuTime())) | (-417298110))) | 278618301, 191, (((~(0 | (-417298110))) | 916187389) * 191) - 793770375, 2019811095);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4963;
                    Fpnative.valueOf = objArr;
                    return (Action[]) values().clone();
                }
            }
            byte b = (byte) ($$b + 3);
            byte[] bArr = $$a;
            byte b2 = (byte) (-bArr[33]);
            Object[] objArr3 = new Object[1];
            b(b, b2, (byte) (b2 | 22), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((byte) 46, (byte) (-bArr[1]), (byte) (-bArr[72]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 2019811095);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4963;
            Fpnative.valueOf = objArr;
            return (Action[]) values().clone();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }
}
