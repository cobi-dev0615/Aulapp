package com.identy;

import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class LibSettings {
    private static  byte[] $$a = null;
    private static  int $$b = 0;
    public static boolean SAVE_4F_DATA = false;
    protected static int a = 200;
    public static int cameraId = 0;
    public static String captureType = "adult";
    public static String focusmode = "focus_mode_auto";

    static {
        init$0();
    }

    public LibSettings() {
        java.lang.Object[] objArr;
        long j;
        java.lang.Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new java.lang.Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = defpackage.a.c((~((~defpackage.a.b(1079731555)) | 188898746)) | 37885056, 420, ((~(0 | 188898746)) * 420) - 499869941, 1208440908);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4893;
                    Fpnative.valueOf = objArr;
                }
            }
            byte b = $$a[77];
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            b((short) (-b), b, $$a[75], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            b($$a[88], $$a[27], $$a[19], objArr4);
            objArr = (java.lang.Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1208440908);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4893;
            Fpnative.valueOf = objArr;
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = i + 4;
        int i5 = (s * 19) + 80;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i2 + 6];
        int i6 = i2 + 5;
        if (bArr == null) {
            int i7 = i4;
            byte[] bArr3 = bArr;
            int i8 = 0;
            int i9 = i6;
            int i10 = (i9 + i4) - 13;
            int i11 = i7;
            i5 = i10;
            i4 = i11;
            bArr = bArr3;
            i3 = i8;
            bArr2[i3] = (byte) i5;
            if (i3 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i12 = i4 + 1;
            int i13 = i5;
            i7 = i12;
            i4 = bArr[i12];
            i8 = i3 + 1;
            bArr3 = bArr;
            i9 = i13;
            int i102 = (i9 + i4) - 13;
            int i112 = i7;
            i5 = i102;
            i4 = i112;
            bArr = bArr3;
            i3 = i8;
            bArr2[i3] = (byte) i5;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i5;
            if (i3 == i6) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{122, 57, 33, -49, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 36, 54, 17, 10, 10, 13, -43, 31, 8, 47, 30, 2, 26, 0, 24, 18, -72, 57, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 38, 59, 1, 8, 14, -10, 46, -27, 59, 1, 8, 14, -16, 42, 20, 17, 2, 26, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 70, -44, 47, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, -8, 24, 22, -3, 27};
        $$b = 200;
    }

    public static boolean isSaveCaptured() {
        java.lang.Object[] objArr;
        long j;
        java.lang.Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new java.lang.Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i = (int) Runtime.getRuntime().totalMemory();
                    int c = defpackage.a.c((~(i | 237323694)) | 261565585, 519, (((~((~i) | (-26355730))) | (~(263679423 | i))) * (-519)) + ((((~((-261565586) | 0)) | 237323694) * 519) - 726608762), -253050616);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4939;
                    Fpnative.valueOf = objArr;
                    return SAVE_4F_DATA;
                }
            }
            byte[] bArr = $$a;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            b((short) 103, bArr[77], bArr[26], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            b((short) 134, bArr[25], bArr[27], objArr4);
            objArr = (java.lang.Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -253050616);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4939;
            Fpnative.valueOf = objArr;
            return SAVE_4F_DATA;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    public static boolean saveML4FData() {
        java.lang.Object[] objArr;
        long j;
        java.lang.Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new java.lang.Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int a2 = defpackage.a.a();
                    int c = defpackage.a.c((~(a2 | 59508580)) | (~((~a2) | 439380699)), 627, (((~((-439380700) | a2)) | 59508580) * (-627)) + ((((-25953573) | a2) * (-627)) - 230145396), -803306537);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4949;
                    Fpnative.valueOf = objArr;
                    return SAVE_4F_DATA;
                }
            }
            byte[] bArr = $$a;
            short s = bArr[54];
            byte b = bArr[77];
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            b(s, b, (byte) (b | 22), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            b((short) 88, bArr[27], bArr[17], objArr4);
            objArr = (java.lang.Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -803306537);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4949;
            Fpnative.valueOf = objArr;
            return SAVE_4F_DATA;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }
}
