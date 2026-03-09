package com.identy.app;

import android.app.Activity;
import android.os.Process;
import android.util.Base64;
import com.identy.Fpnative;
import com.identy.IdentySdk;
import com.identy.IdentyB;
import defpackage.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.io.ConstantsKt;

/* loaded from: classes2.dex */
public class UL {
    private static final byte[] $$a = {72, 101, -55, -108, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -70, 44, -47, -43, -6, -16, 27, -44, -16, 20, -60, 2, 17, -64, 8, -15, -24, -17, -2, -19, -12, 8, -24, -22, 3, -27, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -36, -54, -17, -10, -10, -13, 43, -31, -8, -47, -30, -2, -26, 0, -24, -18, 72, -57, -43, -6, -16, 27, -44, -16, 4, -35, -11, -20, 0, -32, -14, -10, 0, -43, -6, -16, 27, -44, -16, 20, -60, 2, 17, -64, 8, -15, -24, -17, -2, -19, -12, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -38, -59, -1, -8, -14, 10, -46, 27, -59, -1, -8, -14, 16, -42, -20, -17, -2, -26, -43, -6, -16, 27, -44, -16, 4, -35, -11, -20, 0, -32, -14, -10, 0};
    private static final int $$b = 63;
    Activity a;

    public UL() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            try {
                if (objArr2 != null) {
                    long j2 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                    if (j2 > j) {
                        objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                        int b = defpackage.a.b(1033034110);
                        int i = ~b;
                        int i2 = (~((-490727814) | i)) | 3967104;
                        int i3 = ~(b | 494922175);
                        int c = defpackage.a.c(i3 | (~(i | (-486760710))), 252, ((i2 | i3) * (-252)) + 1498599487, 682253692);
                        int i4 = c ^ (c << 13);
                        int i5 = i4 ^ (i4 >>> 17);
                        ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                        ((long[]) objArr[0])[0] = j + 4855;
                        Fpnative.valueOf = objArr;
                        this.a = IdentySdk.getInstance().getAc();
                        return;
                    }
                }
                this.a = IdentySdk.getInstance().getAc();
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(4:(2:3|(7:5|6|7|8|10|11|(1:13)(2:15|16)))|10|11|(0)(0))|23|24|25|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0140, code lost:
    
        0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0141, code lost:
    
        0.printStackTrace();
        0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x015a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x015b A[Catch: Exception -> 0x01a8, TRY_LEAVE, TryCatch #1 {Exception -> 0x01a8, blocks: (B:11:0x0145, B:15:0x015b), top: B:10:0x0145 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] a(byte[] bArr, String str) {
        throw new UnsupportedOperationException("Method not decompiled");
    }


    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, byte b2, Object[] objArr) {
        int i2;
        int i3 = (b * 19) + 80;
        byte[] bArr = $$a;
        int i4 = b2 + 4;
        byte[] bArr2 = new byte[44 - i];
        int i5 = 43 - i;
        if (bArr == null) {
            i3 = i5;
            byte[] bArr3 = bArr;
            int i6 = 0;
            int i7 = i4;
            i3 = (i3 + (-i4)) - 13;
            i4 = i7;
            bArr = bArr3;
            i2 = i6;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i8 = i4 + 1;
            byte b3 = bArr[i8];
            byte[] bArr4 = bArr;
            i7 = i8;
            i4 = b3;
            i6 = i2 + 1;
            bArr3 = bArr4;
            i3 = (i3 + (-i4)) - 13;
            i4 = i7;
            bArr = bArr3;
            i2 = i6;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(4:(2:3|(8:5|6|7|8|9|10|11|12))|10|11|12)|35|36|37|6|7|8|9) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ed, code lost:
    
        0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ee, code lost:
    
        0.printStackTrace();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] decryptModel(String str) {
        throw new UnsupportedOperationException("Method not decompiled");
    }


    public byte[] loadIntoBytes(String str) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            try {
                if (objArr2 != null) {
                    long j2 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                    if (j2 > j) {
                        objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                        int i = ~(402260972 | elapsedCpuTime);
                        int i2 = ~elapsedCpuTime;
                        int i3 = i | (~(901150252 | i2));
                        int c = defpackage.a.c(363987500 | (~((-402260973) | i2)), 516, (((~(elapsedCpuTime | (-537162753))) | (~(i2 | (-363987501)))) * 516) + (((i3 | 0) * (-516)) - 2046404645), -1357218802);
                        int i4 = c ^ (c << 13);
                        int i5 = i4 ^ (i4 >>> 17);
                        ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                        ((long[]) objArr[0])[0] = j + 4860;
                        Fpnative.valueOf = objArr;
                        InputStream open = this.a.getAssets().open(str);
                        byte[] bArr = new byte[open.available()];
                        open.read(bArr);
                        return bArr;
                    }
                }
                InputStream open2 = this.a.getAssets().open(str);
                byte[] bArr2 = new byte[open2.available()];
                open2.read(bArr2);
                return bArr2;
            } catch (IOException unused) {
                return null;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    public byte[] merge(byte[] bArr, byte[] bArr2, byte[] bArr3, String str) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i = ~((int) Process.getStartElapsedRealtime());
                    int c = defpackage.a.c((~(i | 996495080)) | 651006528, 184, ((1072553704 | i) * 184) + 972772599, -37058986);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4874;
                    Fpnative.valueOf = objArr;
                    return merge(bArr, bArr2, bArr3, str, null);
                }
            }
            byte[] bArr4 = $$a;
            byte b = (byte) (-bArr4[34]);
            byte b2 = bArr4[113];
            Object[] objArr3 = new Object[1];
            b(b, (byte) (-b2), b2, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((byte) (-bArr4[111]), bArr4[25], (byte) (-bArr4[60]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -37058986);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4874;
            Fpnative.valueOf = objArr;
            return merge(bArr, bArr2, bArr3, str, null);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] merge(byte[] bArr, byte[] bArr2, byte[] bArr3, String str, String str2) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = defpackage.a.c((~(System.identityHashCode(this) | (-58965629))) | 25365564, 490, (((-33600065) | (~0)) * (-490)) - 1810240475, 333024711);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4903;
                    Fpnative.valueOf = objArr;
                    if (str2 != null && (str.contains("15") || str.contains("15"))) {
                        int i3 = !str.contains("15") ? 500292 : 1000292;
                        byte[] bArr4 = new byte[i3];
                        System.arraycopy(bArr2, 0, bArr4, 0, i3);
                        int length = bArr2.length - i3;
                        byte[] bArr5 = new byte[length];
                        System.arraycopy(bArr2, bArr2.length - length, bArr5, 0, length);
                        byte[] a = a(bArr4, str2);
                        byte[] bArr6 = new byte[a.length + length];
                        System.arraycopy(a, 0, bArr6, 0, a.length);
                        System.arraycopy(bArr5, 0, bArr6, a.length, length);
                        bArr2 = bArr6;
                    }
                    byte[] bArr7 = new byte[bArr.length + bArr2.length + bArr3.length];
                    System.arraycopy(bArr, 0, bArr7, 0, bArr.length);
                    int length2 = bArr.length;
                    int length3 = bArr2.length;
                    int i4 = ((int[]) objArr[1])[0];
                    int i5 = i4 * i4;
                    int i6 = -(556831381 * i4);
                    int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
                    int i8 = -(i4 * 1315292049);
                    int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
                    int i10 = (i9 & (-2124323991)) + ((-2124323991) | i9);
                    int i11 = i10 >> 26;
                    int i12 = ((i11 ^ (-127)) + ((i11 & (-127)) << 1)) / 64;
                    int i13 = (i12 & 1) + (i12 | 1);
                    int i14 = ((i10 | i13) << 1) - (i13 ^ i10);
                    int i15 = i10 >> 25;
                    int i16 = (((i15 | (-255)) << 1) - (i15 ^ (-255))) / 128;
                    int i17 = -(((i16 & 1) + (i16 | 1)) ^ i14);
                    int i18 = (i17 & 2) + (2 | i17);
                    int i19 = i18 >> 19;
                    int e = IdentyB.e((i19 | (-16383)) << 1, i19 ^ (-16383), ConstantsKt.DEFAULT_BUFFER_SIZE, -1);
                    System.arraycopy(bArr2, 0 / (((-((e & 1) + (e | 1))) & i18) * 369), bArr7, length2, length3);
                    System.arraycopy(bArr3, 0, bArr7, bArr.length + bArr2.length, bArr3.length);
                    return bArr7;
                }
            }
            byte[] bArr8 = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) (-bArr8[29]), (byte) (-bArr8[113]), (byte) 96, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = (byte) ($$b & 92);
            byte b2 = bArr8[63];
            Object[] objArr4 = new Object[1];
            b(b, b2, (byte) (b2 | 124), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1147249391);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4903;
            Fpnative.valueOf = objArr;
            if (str2 != null) {
                if (!str.contains("15")) {
                }
                byte[] bArr42 = new byte[i3];
                System.arraycopy(bArr2, 0, bArr42, 0, i3);
                int length4 = bArr2.length - i3;
                byte[] bArr52 = new byte[length4];
                System.arraycopy(bArr2, bArr2.length - length4, bArr52, 0, length4);
                byte[] a2 = a(bArr42, str2);
                byte[] bArr62 = new byte[a2.length + length4];
                System.arraycopy(a2, 0, bArr62, 0, a2.length);
                System.arraycopy(bArr52, 0, bArr62, a2.length, length4);
                bArr2 = bArr62;
            }
            byte[] bArr72 = new byte[bArr.length + bArr2.length + bArr3.length];
            System.arraycopy(bArr, 0, bArr72, 0, bArr.length);
            int length22 = bArr.length;
            int length32 = bArr2.length;
            int i42 = ((int[]) objArr[1])[0];
            int i52 = i42 * i42;
            int i62 = -(556831381 * i42);
            int i72 = (i52 ^ i62) + ((i52 & i62) << 1);
            int i82 = -(i42 * 1315292049);
            int i92 = ((i72 | i82) << 1) - (i82 ^ i72);
            int i102 = (i92 & (-2124323991)) + ((-2124323991) | i92);
            int i112 = i102 >> 26;
            int i122 = ((i112 ^ (-127)) + ((i112 & (-127)) << 1)) / 64;
            int i132 = (i122 & 1) + (i122 | 1);
            int i142 = ((i102 | i132) << 1) - (i132 ^ i102);
            int i152 = i102 >> 25;
            int i162 = (((i152 | (-255)) << 1) - (i152 ^ (-255))) / 128;
            int i172 = -(((i162 & 1) + (i162 | 1)) ^ i142);
            int i182 = (i172 & 2) + (2 | i172);
            int i192 = i182 >> 19;
            int e2 = IdentyB.e((i192 | (-16383)) << 1, i192 ^ (-16383), ConstantsKt.DEFAULT_BUFFER_SIZE, -1);
            System.arraycopy(bArr2, 0 / (((-((e2 & 1) + (e2 | 1))) & i182) * 369), bArr72, length22, length32);
            System.arraycopy(bArr3, 0, bArr72, bArr.length + bArr2.length, bArr3.length);
            return bArr72;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }
}
