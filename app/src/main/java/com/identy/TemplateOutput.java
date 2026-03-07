package com.identy;

import android.os.Process;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class TemplateOutput {
    private static final byte[] $$a = {0, -93, 11, 14, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 38, 59, 1, 8, 14, -10, 46, -27, 59, 1, 8, 14, -16, 42, 20, 17, 2, 26, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 70, -44, 47, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, -8, 24, 22, -3, 27, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 36, 54, 17, 10, 10, 13, -43, 31, 8, 47, 30, 2, 26, 0, 24, 18, -72, 57, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12};
    private static final int $$b = 148;
    String a;
    String b;
    String c;

    public TemplateOutput() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = defpackage.a.c((~((~((int) Process.getStartElapsedRealtime())) | (-271187973))) | 135285051, 521, ((~((-271187973) | 0)) * 521) - 820158200, -1502932265);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4965;
                    Fpnative.valueOf = objArr;
                }
            }
            byte b = $$a[16];
            Object[] objArr3 = new Object[1];
            d((byte) 122, b, (byte) (b | 22), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((byte) 94, $$a[0], $$a[45], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1502932265);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4965;
            Fpnative.valueOf = objArr;
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(short s, int i, int i2, Object[] objArr) {
        int i3;
        int i4;
        int i5 = i2 + 6;
        byte[] bArr = $$a;
        int i6 = (i * 19) + 80;
        int i7 = 126 - s;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            i6 = i7;
            int i8 = i5;
            i4 = 0;
            i7++;
            i6 = (i6 + i8) - 13;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i8 = bArr[i7];
            i7++;
            i6 = (i6 + i8) - 13;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
            }
        }
    }

    public String getData() {
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
                    int c = defpackage.a.c((~(myTid | (-488353914))) | (~(i | (-10502535))), 765, (((~((-488353914) | i)) | 32832) * 1530) + (((~((-32833) | i)) | (~((-488321082) | myTid)) | (~((-10502535) | myTid))) * 765) + 1172091495, 1023695698);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4871;
                    Fpnative.valueOf = objArr;
                    return this.a;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            d((byte) 79, bArr[16], bArr[31], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((byte) (bArr[59] + 1), bArr[30], bArr[0], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1023695698);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4871;
            Fpnative.valueOf = objArr;
            return this.a;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    public String getKey1() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = defpackage.a.c((~(((int) Process.getElapsedCpuTime()) | (-434627965))) | 404971836, 490, (((-29656129) | (~0)) * (-490)) - 592142299, -840371877);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 5019;
                    Fpnative.valueOf = objArr;
                    return this.b;
                }
            }
            byte b = $$a[16];
            Object[] objArr3 = new Object[1];
            d((byte) 122, b, (byte) (b | 22), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((byte) 94, $$a[0], $$a[45], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 582901891);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5019;
            Fpnative.valueOf = objArr;
            return this.b;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    public String getKey2() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i = ~identityHashCode;
                    int c = defpackage.a.c((~(identityHashCode | 931622539)) | (~(i | (-432733260))), 950, (((~(i | 931622539)) | (~(identityHashCode | (-432733260)))) * (-950)) + ((((~(432733259 | i)) | (~((-931622540) | identityHashCode))) * 1900) - 999523211), 1480746199);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4902;
                    Fpnative.valueOf = objArr;
                    return this.c;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            d(bArr[32], bArr[16], bArr[14], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr[0];
            Object[] objArr4 = new Object[1];
            d(b, b, bArr[98], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1480746199);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4902;
            Fpnative.valueOf = objArr;
            return this.c;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    public void setData(String str) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = defpackage.a.c((~(identityHashCode | (-226004318))) | 221776157, 490, (((-4228161) | (~identityHashCode)) * (-490)) + 1995568849, 1827135714);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4948;
                    Fpnative.valueOf = objArr;
                    this.a = str;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            d(bArr[32], bArr[16], bArr[14], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr[0];
            Object[] objArr4 = new Object[1];
            d(b, b, bArr[98], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1898185888);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4948;
            Fpnative.valueOf = objArr;
            this.a = str;
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
    }

    public void setKey1(String str) {
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
                    int c = defpackage.a.c((~((~myTid) | 300760198)) | 799649478, 217, (((~(myTid | (-799649479))) | 771785280) * 217) + ((((~((-799649479) | 0)) | (~(300760198 | myTid))) * 217) - 2111146750), 1041120715);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4887;
                    Fpnative.valueOf = objArr;
                    this.b = str;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            d((byte) 79, bArr[16], bArr[31], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((byte) (bArr[59] + 1), bArr[30], bArr[0], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1041120715);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4887;
            Fpnative.valueOf = objArr;
            this.b = str;
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
    }

    public void setKey2(String str) {
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
                    int c = defpackage.a.c((~(i | (-320935528))) | (-465264640), 564, ((~(myTid | (-287310888))) * 1128) + (((~((-177953753) | i)) | (-320935528) | (~(177953752 | myTid))) * (-564)) + 1461546803, -1825815553);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 5036;
                    Fpnative.valueOf = objArr;
                    this.c = str;
                }
            }
            byte b = $$a[16];
            Object[] objArr3 = new Object[1];
            d((byte) 122, b, (byte) (b | 22), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((byte) 94, $$a[0], $$a[45], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1825815553);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5036;
            Fpnative.valueOf = objArr;
            this.c = str;
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
    }
}
