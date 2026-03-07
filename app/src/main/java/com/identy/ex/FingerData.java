package com.identy.ex;

import com.d.e.a.values;
import com.identy.Fpnative;
import com.identy.IdentyB;
import defpackage.a;
import java.lang.reflect.Method;
import kotlin.io.ConstantsKt;

/* loaded from: classes2.dex */
public class FingerData {
    private static final byte[] $$a = {47, 41, -12, 122, -20, -6, 55, -67, -3, -9, -17, -14, -13, 67, -33, -54, 4, -3, -9, 15, -41, 32, -54, 4, -3, -9, 21, -37, -15, -12, 3, -21, -38, -1, -11, 32, -39, -11, 9, -30, -6, -15, 5, -27, -9, -5, 5};
    private static final int $$b = 156;
    public int height;
    public byte[] image;
    public int pad_decision;
    public int pad_score;
    public int rfq;
    public int rfq_decision;
    public int width;

    public FingerData() {
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
                    int i2 = ~i;
                    int c = a.c((~(i | (-71755853))) | (~(i2 | (-427133428))) | (-494397952), -370, (((~((-71755853) | i2)) | (~((-427133428) | i))) * (-370)) + 404328781, -1953637235);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 4914;
                    Fpnative.valueOf = objArr;
                    int i5 = ((int[]) objArr[1])[0];
                    int i6 = i5 * i5;
                    int i7 = -(1867636114 * i5);
                    int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
                    int i9 = -(i5 * (-1577918328));
                    int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
                    int i11 = (i10 & 1069459113) + (1069459113 | i10);
                    int i12 = ((i11 >> 24) - 511) / 256;
                    int i13 = (i11 - (~(((i12 | 1) << 1) - (i12 ^ 1)))) - 1;
                    int i14 = i11 >> 20;
                    int i15 = ((i14 ^ (-8191)) + ((i14 & (-8191)) << 1)) / ConstantsKt.DEFAULT_BLOCK_SIZE;
                    int i16 = -(i13 ^ (((i15 | 1) << 1) - (i15 ^ 1)));
                    int i17 = (i16 ^ 1) + ((i16 & 1) << 1);
                    int i18 = i17 >> 23;
                    int e = IdentyB.e((i18 | (-1023)) << 1, i18 ^ (-1023), ConstantsKt.MINIMUM_BLOCK_SIZE, -1);
                    this.width = 0 / (((-((e ^ 1) + ((e & 1) << 1))) & i17) * 320);
                    this.height = 0;
                    this.pad_score = 254;
                    this.pad_decision = 254;
                    this.rfq = 254;
                    this.rfq_decision = 254;
                }
            }
            byte[] bArr = $$a;
            byte b = (byte) (-bArr[33]);
            byte b2 = b;
            Object[] objArr3 = new Object[1];
            a(b, b2, b2, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b3 = (byte) (bArr[33] + 1);
            byte b4 = b3;
            Object[] objArr4 = new Object[1];
            a(b3, b4, b4, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 584978573);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4914;
            Fpnative.valueOf = objArr;
            int i52 = ((int[]) objArr[1])[0];
            int i62 = i52 * i52;
            int i72 = -(1867636114 * i52);
            int i82 = (i62 ^ i72) + ((i62 & i72) << 1);
            int i92 = -(i52 * (-1577918328));
            int i102 = (i82 ^ i92) + ((i92 & i82) << 1);
            int i112 = (i102 & 1069459113) + (1069459113 | i102);
            int i122 = ((i112 >> 24) - 511) / 256;
            int i132 = (i112 - (~(((i122 | 1) << 1) - (i122 ^ 1)))) - 1;
            int i142 = i112 >> 20;
            int i152 = ((i142 ^ (-8191)) + ((i142 & (-8191)) << 1)) / ConstantsKt.DEFAULT_BLOCK_SIZE;
            int i162 = -(i132 ^ (((i152 | 1) << 1) - (i152 ^ 1)));
            int i172 = (i162 ^ 1) + ((i162 & 1) << 1);
            int i182 = i172 >> 23;
            int e2 = IdentyB.e((i182 | (-1023)) << 1, i182 ^ (-1023), ConstantsKt.MINIMUM_BLOCK_SIZE, -1);
            this.width = 0 / (((-((e2 ^ 1) + ((e2 & 1) << 1))) & i172) * 320);
            this.height = 0;
            this.pad_score = 254;
            this.pad_decision = 254;
            this.rfq = 254;
            this.rfq_decision = 254;
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, short s2, Object[] objArr) {
        int i;
        int i2 = s2 * 13;
        int i3 = 32 - (s * 28);
        int i4 = (b * 19) + 80;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i2 + 16];
        int i5 = i2 + 15;
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i6 = 0;
            int i7 = i4;
            int i8 = i3;
            int i9 = i8 + 1;
            i4 = (i7 + (-i3)) - 8;
            i3 = i9;
            bArr = bArr3;
            i = i6;
            bArr2[i] = (byte) i4;
            if (i == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i10 = i4;
            i8 = i3;
            i3 = bArr[i3];
            i6 = i + 1;
            bArr3 = bArr;
            i7 = i10;
            int i92 = i8 + 1;
            i4 = (i7 + (-i3)) - 8;
            i3 = i92;
            bArr = bArr3;
            i = i6;
            bArr2[i] = (byte) i4;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i4;
            if (i == i5) {
            }
        }
    }
}
