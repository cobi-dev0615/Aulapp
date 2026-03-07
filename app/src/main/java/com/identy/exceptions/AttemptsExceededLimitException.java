package com.identy.exceptions;

import com.d.e.a.values;
import com.identy.Fpnative;
import com.identy.IdentyB;
import defpackage.a;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class AttemptsExceededLimitException extends Exception {
    private static final byte[] $$a = {93, 97, 119, -49, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 70, -44, 47, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, -8, 24, 22, -3, 27, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 36, 54, 17, 10, 10, 13, -43, 31, 8, 47, 30, 2, 26, 0, 24, 18, -72, 57, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12};
    private static final int $$b = 63;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AttemptsExceededLimitException() {
        super(IdentyB.c((-((((0 | 1) << 1) - (0 ^ 1)) - (-1))) & 0, 1637, 104768, "22;10;7;Select attempts between 1 to 6"));
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i = (int) Runtime.getRuntime().totalMemory();
                    int c = a.c((~(i | (-755171335))) | (-256282055), 376, (((~((~i) | 755171334)) | 38047168) * (-376)) + ((574983616 | i) * 376) + 1895081399, 466333971);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 5025;
                    Fpnative.valueOf = objArr;
                    int i4 = ((int[]) objArr[1])[0];
                    int i5 = i4 * i4;
                    int i6 = -(1861029548 * i4);
                    int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
                    int i8 = -(i4 * (-1804696358));
                    int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                    int i10 = ((i9 | (-695088503)) << 1) - ((-695088503) ^ i9);
                    int i11 = i10 >> 24;
                    int a = IdentyB.a(i11 ^ (-511), (i11 & (-511)) << 1, 256, -1);
                    int i12 = (i10 ^ a) + ((a & i10) << 1);
                    int i13 = ((i10 >> 22) - 2047) / 1024;
                    int i14 = -(i12 ^ (((i13 | 1) << 1) - (i13 ^ 1)));
                    int i15 = (i14 & 8) + (i14 | 8);
                    int i16 = i15 >> 24;
                    int i17 = (((i16 | (-511)) << 1) - (i16 ^ (-511))) / 256;
                }
            }
            byte b = (byte) ($$b & 1);
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a(b, (byte) (b | 78), bArr[62], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b2 = bArr[63];
            byte b3 = b2;
            Object[] objArr4 = new Object[1];
            a(b3, (byte) (b3 | 48), b2, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 466333971);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5025;
            Fpnative.valueOf = objArr;
            int i42 = ((int[]) objArr[1])[0];
            int i52 = i42 * i42;
            int i62 = -(1861029548 * i42);
            int i72 = (i52 ^ i62) + ((i52 & i62) << 1);
            int i82 = -(i42 * (-1804696358));
            int i92 = (i72 ^ i82) + ((i82 & i72) << 1);
            int i102 = ((i92 | (-695088503)) << 1) - ((-695088503) ^ i92);
            int i112 = i102 >> 24;
            int a2 = IdentyB.a(i112 ^ (-511), (i112 & (-511)) << 1, 256, -1);
            int i122 = (i102 ^ a2) + ((a2 & i102) << 1);
            int i132 = ((i102 >> 22) - 2047) / 1024;
            int i142 = -(i122 ^ (((i132 | 1) << 1) - (i132 ^ 1)));
            int i152 = (i142 & 8) + (i142 | 8);
            int i162 = i152 >> 24;
            int i172 = (((i162 | (-511)) << 1) - (i162 ^ (-511))) / 256;
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, short s, byte b2, Object[] objArr) {
        int i;
        int i2;
        byte[] bArr = $$a;
        int i3 = 82 - s;
        int i4 = 118 - (b * 19);
        byte[] bArr2 = new byte[b2 + 6];
        int i5 = b2 + 5;
        if (bArr == null) {
            i = i3;
            int i6 = i5;
            i2 = 0;
            i3 = (i3 + i6) - 13;
            bArr2[i2] = (byte) i3;
            i++;
            if (i2 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2++;
            i6 = bArr[i];
            i3 = (i3 + i6) - 13;
            bArr2[i2] = (byte) i3;
            i++;
            if (i2 == i5) {
            }
        } else {
            i3 = i4;
            i = i3;
            i2 = 0;
            bArr2[i2] = (byte) i3;
            i++;
            if (i2 == i5) {
            }
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = a.c((~(identityHashCode | 496757583)) | (~((~identityHashCode) | 2131696)), 627, (((~((-2131697) | identityHashCode)) | 496757583) * (-627)) + ((((-496724240) | identityHashCode) * (-627)) - 230145396), -2090262755);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4978;
                    Fpnative.valueOf = objArr;
                    return super.getMessage();
                }
            }
            byte b = (byte) ($$b & 1);
            byte b2 = $$a[17];
            Object[] objArr3 = new Object[1];
            a(b, b2, (byte) (b2 - 5), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a($$a[32], $$a[63], $$a[55], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -2090262755);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4978;
            Fpnative.valueOf = objArr;
            return super.getMessage();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }
}
