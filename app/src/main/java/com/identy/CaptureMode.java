package com.identy;

import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public enum CaptureMode {
    L,
    H;

    private static final byte[] $$a = null;
    private static final int $$b = 0;

    static {
        init$0();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, int i, short s2, Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = 92 - i;
        int i4 = (s2 * 19) + 80;
        byte[] bArr2 = new byte[44 - s];
        int i5 = 43 - s;
        if (bArr == null) {
            int i6 = i5;
            i2 = 0;
            i4 = (i4 + (-i6)) - 13;
            i3++;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2++;
            i6 = bArr[i3];
            i4 = (i4 + (-i6)) - 13;
            i3++;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            i3++;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{49, 26, -54, -27, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -36, -54, -17, -10, -10, -13, 43, -31, -8, -47, -30, -2, -26, 0, -24, -18, 72, -57, -43, -6, -16, 27, -44, -16, 4, -35, -11, -20, 0, -32, -14, -10, 0, -43, -6, -16, 27, -44, -16, 20, -60, 2, 17, -64, 8, -15, -24, -17, -2, -19, -12, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -38, -59, -1, -8, -14, 10, -46, 27, -59, -1, -8, -14, 16, -42, -20, -17, -2, -26, -43, -6, -16, 27, -44, -16, 4, -35, -11, -20, 0, -32, -14, -10, 0};
        $$b = 97;
    }

    public static CaptureMode valueOf(String str) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int maxMemory = (int) Runtime.getRuntime().maxMemory();
                    int i = (((~((-994671272) | maxMemory)) | (~(495781991 | maxMemory))) * 140) + (((420022311 | r5) * (-280)) - 1291051405);
                    int i2 = ~((-574648961) | maxMemory);
                    int i3 = ~maxMemory;
                    int c = defpackage.a.c((~(i3 | 1070430951)) | i2 | (~((-420022312) | i3)), 140, i, -451325483);
                    int i4 = c ^ (c << 13);
                    int i5 = i4 ^ (i4 >>> 17);
                    ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                    ((long[]) objArr[0])[0] = j + 4988;
                    Fpnative.valueOf = objArr;
                    return (CaptureMode) Enum.valueOf(CaptureMode.class, str);
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) (-bArr[59]), (byte) (bArr[35] + 1), (byte) (-bArr[77]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = (byte) (bArr[35] + 1);
            byte b2 = bArr[27];
            Object[] objArr4 = new Object[1];
            b(b, b2, b2, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -451325483);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4988;
            Fpnative.valueOf = objArr;
            return (CaptureMode) Enum.valueOf(CaptureMode.class, str);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static CaptureMode[] valuesCustom() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i = ~defpackage.a.a();
                    int c = defpackage.a.c((~(i | 231482871)) | (-801947128), 933, (((~((-730372152) | i)) | 231482871) * (-933)) + 261460874, -1946196344);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4927;
                    Fpnative.valueOf = objArr;
                    return (CaptureMode[]) values().clone();
                }
            }
            byte[] bArr = $$a;
            byte b = bArr[27];
            Object[] objArr3 = new Object[1];
            b(b, (byte) (b | 89), (byte) (-bArr[77]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((byte) (-bArr[4]), (byte) (-bArr[81]), bArr[27], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -6172216);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4927;
            Fpnative.valueOf = objArr;
            return (CaptureMode[]) values().clone();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
