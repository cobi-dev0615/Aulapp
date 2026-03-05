package com.identy;

import android.os.Process;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.util.HashMap;
import kotlin.io.ConstantsKt;

/* loaded from: classes2.dex */
public class UkhobTemplateBuilder {
    private static final byte[] $$a = {39, 24, -8, 15, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -36, -54, -17, -10, -10, -13, 43, -31, -8, -47, -30, -2, -26, 0, -24, -18, 72, -57, -43, -6, -16, 27, -44, -16, 4, -35, -11, -20, 0, -32, -14, -10, 0, -43, -6, -16, 27, -44, -16, 20, -60, 2, 17, -64, 8, -15, -24, -17, -2, -19, -12, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -38, -59, -1, -8, -14, 10, -46, 27, -59, -1, -8, -14, 16, -42, -20, -17, -2, -26, -43, -6, -16, 27, -44, -16, 4, -35, -11, -20, 0, -32, -14, -10, 0, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -70, 44, -47, -43, -6, -16, 27, -44, -16, 20, -60, 2, 17, -64, 8, -15, -24, -17, -2, -19, -12, 8, -24, -22, 3, -27};
    private static final int $$b = 80;
    long PngjBadCrcException;
    boolean PngjBadSignature;
    private HashMap valueOf;
    private String values;

    /* JADX WARN: Type inference failed for: r1v19, types: [boolean, int] */
    public UkhobTemplateBuilder(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int uptimeMillis = (int) SystemClock.uptimeMillis();
                    int i = ~uptimeMillis;
                    int i2 = (((~((-637572161) | i)) | (~((-408887962) | uptimeMillis))) * 520) - 1267216217;
                    int i3 = ~(408887961 | i);
                    int i4 = ~(uptimeMillis | 907777241);
                    int c = defpackage.a.c(i4 | (~(i | (-907777242))) | (-1046460122), 520, ((i3 | i4) * (-1040)) + i2, -1456294688);
                    int i5 = c ^ (c << 13);
                    int i6 = i5 ^ (i5 >>> 17);
                    ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
                    ((long[]) objArr[0])[0] = j + 4956;
                    Fpnative.valueOf = objArr;
                    this.valueOf = new HashMap();
                    int i7 = ((int[]) objArr[1])[0];
                    int i8 = i7 * i7;
                    int i9 = -(94710584 * i7);
                    int i10 = (i8 & i9) + (i8 | i9);
                    int i11 = -(i7 * (-1048117446));
                    int i12 = (i10 & i11) + (i11 | i10);
                    int i13 = (i12 & (-158439759)) + ((-158439759) | i12);
                    int i14 = i13 >> 24;
                    int a = IdentyB.a(i14 ^ (-511), (i14 & (-511)) << 1, 256, -1);
                    int i15 = (i13 & a) + (a | i13);
                    int i16 = i13 >> 29;
                    int i17 = ((i16 ^ (-15)) + ((i16 & (-15)) << 1)) / 8;
                    int i18 = -(((i17 & 1) + (i17 | 1)) ^ i15);
                    int i19 = ((i18 | 8) << 1) - (i18 ^ 8);
                    int i20 = i19 >> 19;
                    int i21 = ((i20 ^ (-16383)) + ((i20 & (-16383)) << 1)) / ConstantsKt.DEFAULT_BUFFER_SIZE;
                    int i22 = ((i21 | 1) << 1) - (i21 ^ 1);
                    this.PngjBadSignature = 9520 / (((-(((i22 | 1) << 1) - (i22 ^ 1))) & i19) * 1190);
                    this.PngjBadCrcException = init(str, str2, str3, str4, str5, str6, z).longValue();
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a((short) 135, bArr[27], (byte) (-bArr[77]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a((short) ($$b | 12), (byte) (-bArr[4]), bArr[27], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1456294688);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4956;
            Fpnative.valueOf = objArr;
            this.valueOf = new HashMap();
            int i72 = ((int[]) objArr[1])[0];
            int i82 = i72 * i72;
            int i92 = -(94710584 * i72);
            int i102 = (i82 & i92) + (i82 | i92);
            int i112 = -(i72 * (-1048117446));
            int i122 = (i102 & i112) + (i112 | i102);
            int i132 = (i122 & (-158439759)) + ((-158439759) | i122);
            int i142 = i132 >> 24;
            int a2 = IdentyB.a(i142 ^ (-511), (i142 & (-511)) << 1, 256, -1);
            int i152 = (i132 & a2) + (a2 | i132);
            int i162 = i132 >> 29;
            int i172 = ((i162 ^ (-15)) + ((i162 & (-15)) << 1)) / 8;
            int i182 = -(((i172 & 1) + (i172 | 1)) ^ i152);
            int i192 = ((i182 | 8) << 1) - (i182 ^ 8);
            int i202 = i192 >> 19;
            int i212 = ((i202 ^ (-16383)) + ((i202 & (-16383)) << 1)) / ConstantsKt.DEFAULT_BUFFER_SIZE;
            int i222 = ((i212 | 1) << 1) - (i212 ^ 1);
            this.PngjBadSignature = 9520 / (((-(((i222 | 1) << 1) - (i222 ^ 1))) & i192) * 1190);
            this.PngjBadCrcException = init(str, str2, str3, str4, str5, str6, z).longValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, byte b, byte b2, Object[] objArr) {
        int i2;
        int i3;
        int i4 = 138 - i;
        byte[] bArr = $$a;
        int i5 = (b2 * 19) + 80;
        byte[] bArr2 = new byte[44 - b];
        int i6 = 43 - b;
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i7 = 0;
            int i8 = i4;
            i4 = (i4 + (-i5)) - 13;
            i2 = i8;
            bArr = bArr3;
            i3 = i7;
            bArr2[i3] = (byte) i4;
            int i9 = i2 + 1;
            if (i3 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b3 = bArr[i9];
            byte[] bArr4 = bArr;
            i8 = i9;
            i5 = b3;
            i7 = i3 + 1;
            bArr3 = bArr4;
            i4 = (i4 + (-i5)) - 13;
            i2 = i8;
            bArr = bArr3;
            i3 = i7;
            bArr2[i3] = (byte) i4;
            int i92 = i2 + 1;
            if (i3 == i6) {
            }
        } else {
            i2 = i4;
            i4 = i5;
            i3 = 0;
            bArr2[i3] = (byte) i4;
            int i922 = i2 + 1;
            if (i3 == i6) {
            }
        }
    }

    public native Object[] buildtemplate(long j);

    public byte[] finishTransaction(boolean z) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i = ~((int) Process.getElapsedCpuTime());
                    int c = defpackage.a.c((~((-547250144) | i)) | 538841664 | (~(48360863 | i)), 184, (((~(i | 587202527)) | (~((-8408480) | i))) * (-184)) - 1102424841, 626245708);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4887;
                    Fpnative.valueOf = objArr;
                    String concat = "24\\17\\31\\".concat("Cdefault finish Transaction called");
                    int i4 = ((int[]) objArr[1])[0];
                    int i5 = i4 * i4;
                    int i6 = -(1558210087 * i4);
                    int i7 = (((i5 ^ i6) + ((i5 & i6) << 1)) - (~(-(i4 * (-1920950995))))) - 1;
                    int i8 = ((i7 | 1164756196) << 1) - (1164756196 ^ i7);
                    int i9 = ((i8 >> 21) - 4095) / 2048;
                    int i10 = (i9 ^ 1) + ((i9 & 1) << 1);
                    int i11 = ((i8 | i10) << 1) - (i10 ^ i8);
                    int i12 = i8 >> 18;
                    int i13 = (-(i11 ^ IdentyB.a(i12 & (-32767), i12 | (-32767), 16384, -1))) + 7;
                    int i14 = i13 >> 23;
                    int e = IdentyB.e((i14 | (-1023)) << 1, i14 ^ (-1023), ConstantsKt.MINIMUM_BLOCK_SIZE, -1);
                    concat.substring(69237 / ((i13 & (-((e & 1) + (e | 1)))) * 1099));
                    Object[] finishTransaction = finishTransaction(this.PngjBadCrcException, z);
                    this.PngjBadSignature = ((Boolean) finishTransaction[2]).booleanValue();
                    this.values = (String) finishTransaction[1];
                    return (byte[]) finishTransaction[0];
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a((short) 74, bArr[3], (byte) (-bArr[77]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a((short) (-bArr[81]), (byte) (bArr[35] + 1), bArr[27], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -612450044);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4887;
            Fpnative.valueOf = objArr;
            String concat2 = "24\\17\\31\\".concat("Cdefault finish Transaction called");
            int i42 = ((int[]) objArr[1])[0];
            int i52 = i42 * i42;
            int i62 = -(1558210087 * i42);
            int i72 = (((i52 ^ i62) + ((i52 & i62) << 1)) - (~(-(i42 * (-1920950995))))) - 1;
            int i82 = ((i72 | 1164756196) << 1) - (1164756196 ^ i72);
            int i92 = ((i82 >> 21) - 4095) / 2048;
            int i102 = (i92 ^ 1) + ((i92 & 1) << 1);
            int i112 = ((i82 | i102) << 1) - (i102 ^ i82);
            int i122 = i82 >> 18;
            int i132 = (-(i112 ^ IdentyB.a(i122 & (-32767), i122 | (-32767), 16384, -1))) + 7;
            int i142 = i132 >> 23;
            int e2 = IdentyB.e((i142 | (-1023)) << 1, i142 ^ (-1023), ConstantsKt.MINIMUM_BLOCK_SIZE, -1);
            concat2.substring(69237 / ((i132 & (-((e2 & 1) + (e2 | 1)))) * 1099));
            Object[] finishTransaction2 = finishTransaction(this.PngjBadCrcException, z);
            this.PngjBadSignature = ((Boolean) finishTransaction2[2]).booleanValue();
            this.values = (String) finishTransaction2[1];
            return (byte[]) finishTransaction2[0];
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public native Object[] finishTransaction(long j, boolean z);

    public long getAddress() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int freeMemory = (int) Runtime.getRuntime().freeMemory();
                    int i = ~freeMemory;
                    int c = defpackage.a.c((~(i | 1028129737)) | (~(529240457 | i)), 865, ((~(freeMemory | 1028129737)) * 865) + ((((~((-1028129738) | i)) | 529240457) * (-865)) - 995622990), 1741167836);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4857;
                    Fpnative.valueOf = objArr;
                    return this.PngjBadCrcException;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a((short) 74, bArr[3], (byte) (-bArr[77]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a((short) (-bArr[81]), (byte) (bArr[35] + 1), bArr[27], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1741167836);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4857;
            Fpnative.valueOf = objArr;
            return this.PngjBadCrcException;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public String getName() {
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
                    int c = defpackage.a.c(~((~identityHashCode) | 927768388), 476, ((~(927768388 | identityHashCode)) * 952) + (((285217028 | r6) * (-476)) - 1940637189), 289993935);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4889;
                    Fpnative.valueOf = objArr;
                    return this.values;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a((short) (-bArr[21]), (byte) (-bArr[64]), (byte) (-bArr[77]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(bArr[27], (byte) (-bArr[75]), bArr[55], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 289993935);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4889;
            Fpnative.valueOf = objArr;
            return this.values;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public byte[] getTemplate() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int a = defpackage.a.a();
                    int i = ~a;
                    int i2 = ~(658904334 | i);
                    int c = defpackage.a.c(i2 | 160015054, 712, (((~(a | (-143237825))) | (~(i | 802142158))) * (-712)) + (((-802142159) | i2) * (-712)) + 1543836567, 1259932792);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 4993;
                    Fpnative.valueOf = objArr;
                    Object[] buildtemplate = buildtemplate(this.PngjBadCrcException);
                    this.values = (String) buildtemplate[1];
                    this.valueOf = (HashMap) buildtemplate[2];
                    int i5 = ((int[]) objArr[1])[0];
                    int i6 = i5 * i5;
                    int i7 = -(896363758 * i5);
                    int i8 = (i6 & i7) + (i6 | i7);
                    int i9 = -(i5 * 428559102);
                    int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
                    int i11 = (i10 ^ 727240804) + ((727240804 & i10) << 1);
                    int i12 = i11 >> 28;
                    int i13 = (((i12 | (-31)) << 1) - (i12 ^ (-31))) / 16;
                    int i14 = (i13 & 1) + (i13 | 1);
                    int i15 = ((i11 | i14) << 1) - (i14 ^ i11);
                    int i16 = i11 >> 15;
                    int i17 = (((i16 | (-262143)) << 1) - (i16 ^ (-262143))) / 131072;
                    int i18 = -(((i17 & 1) + (i17 | 1)) ^ i15);
                    int i19 = (i18 ^ 3) + ((i18 & 3) << 1);
                    int i20 = i19 >> 17;
                    int i21 = ((i20 & (-65535)) + (i20 | (-65535))) / 32768;
                    int i22 = ((i21 | 1) << 1) - (i21 ^ 1);
                    return (byte[]) buildtemplate[0 / (((-(((i22 | 1) << 1) - (i22 ^ 1))) & i19) * 241)];
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a((short) 135, bArr[27], (byte) (-bArr[77]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a((short) ($$b | 12), (byte) (-bArr[4]), bArr[27], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1259932792);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4993;
            Fpnative.valueOf = objArr;
            Object[] buildtemplate2 = buildtemplate(this.PngjBadCrcException);
            this.values = (String) buildtemplate2[1];
            this.valueOf = (HashMap) buildtemplate2[2];
            int i52 = ((int[]) objArr[1])[0];
            int i62 = i52 * i52;
            int i72 = -(896363758 * i52);
            int i82 = (i62 & i72) + (i62 | i72);
            int i92 = -(i52 * 428559102);
            int i102 = (i82 ^ i92) + ((i92 & i82) << 1);
            int i112 = (i102 ^ 727240804) + ((727240804 & i102) << 1);
            int i122 = i112 >> 28;
            int i132 = (((i122 | (-31)) << 1) - (i122 ^ (-31))) / 16;
            int i142 = (i132 & 1) + (i132 | 1);
            int i152 = ((i112 | i142) << 1) - (i142 ^ i112);
            int i162 = i112 >> 15;
            int i172 = (((i162 | (-262143)) << 1) - (i162 ^ (-262143))) / 131072;
            int i182 = -(((i172 & 1) + (i172 | 1)) ^ i152);
            int i192 = (i182 ^ 3) + ((i182 & 3) << 1);
            int i202 = i192 >> 17;
            int i212 = ((i202 & (-65535)) + (i202 | (-65535))) / 32768;
            int i222 = ((i212 | 1) << 1) - (i212 ^ 1);
            return (byte[]) buildtemplate2[0 / (((-(((i222 | 1) << 1) - (i222 ^ 1))) & i192) * 241)];
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public native Long init(String str, String str2, String str3, String str4, String str5, String str6, boolean z);
}
