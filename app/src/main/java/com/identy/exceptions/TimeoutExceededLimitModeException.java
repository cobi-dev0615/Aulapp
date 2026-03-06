package com.identy.exceptions;

import android.os.Process;
import com.d.e.a.values;
import com.identy.Fpnative;
import com.identy.IdentyB;
import defpackage.a;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class TimeoutExceededLimitModeException extends Exception {
    private static final byte[] $$a = {58, -87, 109, 66, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 36, 54, 17, 10, 10, 13, -43, 31, 8, 47, 30, 2, 26, 0, 24, 18, -72, 57, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 38, 59, 1, 8, 14, -10, 46, -27, 59, 1, 8, 14, -16, 42, 20, 17, 2, 26, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0};
    private static final int $$b = 253;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TimeoutExceededLimitModeException() {
        super(IdentyB.c((-(((0 | 1) << 1) - (0 ^ 1))) & 0, 1155, 72765, "20,14,11,Select time out between 1 to 40 sec"));
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int myUid = Process.myUid();
                    int i = ~myUid;
                    int c = a.c((~(myUid | 89975701)) | (~(i | (-6062721))) | (-492826560), 717, (((~(i | 89975701)) | (-492826560) | (~((-6062721) | myUid))) * 717) + 1704280477, -1757211682);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4944;
                    Fpnative.valueOf = objArr;
                    int i4 = ((int[]) objArr[1])[0];
                    int i5 = i4 * i4;
                    int i6 = -(85139025 * i4);
                    int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
                    int i8 = -(i4 * (-2107250059));
                    int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                    int i10 = (i9 ^ (-2015478199)) + (((-2015478199) & i9) << 1);
                    int i11 = i10 >> 21;
                    int i12 = ((i11 ^ (-4095)) + ((i11 & (-4095)) << 1)) / 2048;
                    int i13 = (i12 ^ 1) + ((i12 & 1) << 1);
                    int i14 = (i10 & i13) + (i13 | i10);
                    int i15 = i10 >> 24;
                    int i16 = -(IdentyB.a(i15 ^ (-511), (i15 & (-511)) << 1, 256, -1) ^ i14);
                    int i17 = (i16 & 7) + (i16 | 7);
                    int i18 = i17 >> 24;
                    int i19 = ((i18 ^ (-511)) + ((i18 & (-511)) << 1)) / 256;
                    int i20 = (i19 & 1) + (i19 | 1);
                }
            }
            byte[] bArr = $$a;
            byte b = bArr[77];
            byte b2 = (byte) (-b);
            Object[] objArr3 = new Object[1];
            a(b2, (byte) (b2 & 28), b, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(bArr[88], (byte) (bArr[25] + 1), bArr[27], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1757211682);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4944;
            Fpnative.valueOf = objArr;
            int i42 = ((int[]) objArr[1])[0];
            int i52 = i42 * i42;
            int i62 = -(85139025 * i42);
            int i72 = (i52 ^ i62) + ((i52 & i62) << 1);
            int i82 = -(i42 * (-2107250059));
            int i92 = (i72 ^ i82) + ((i82 & i72) << 1);
            int i102 = (i92 ^ (-2015478199)) + (((-2015478199) & i92) << 1);
            int i112 = i102 >> 21;
            int i122 = ((i112 ^ (-4095)) + ((i112 & (-4095)) << 1)) / 2048;
            int i132 = (i122 ^ 1) + ((i122 & 1) << 1);
            int i142 = (i102 & i132) + (i132 | i102);
            int i152 = i102 >> 24;
            int i162 = -(IdentyB.a(i152 ^ (-511), (i152 & (-511)) << 1, 256, -1) ^ i142);
            int i172 = (i162 & 7) + (i162 | 7);
            int i182 = i172 >> 24;
            int i192 = ((i182 ^ (-511)) + ((i182 & (-511)) << 1)) / 256;
            int i202 = (i192 & 1) + (i192 | 1);
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, short s2, Object[] objArr) {
        int i;
        int i2 = (s2 * 19) + 80;
        byte[] bArr = $$a;
        int i3 = s + 4;
        byte[] bArr2 = new byte[b + 16];
        int i4 = b + 15;
        if (bArr == null) {
            int i5 = i3;
            byte[] bArr3 = bArr;
            int i6 = 0;
            int i7 = i4;
            int i8 = (i7 + i3) - 13;
            int i9 = i5;
            i2 = i8;
            i3 = i9;
            bArr = bArr3;
            i = i6;
            bArr2[i] = (byte) i2;
            int i10 = i3 + 1;
            i6 = i + 1;
            if (i == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i11 = i2;
            i5 = i10;
            i3 = bArr[i10];
            bArr3 = bArr;
            i7 = i11;
            int i82 = (i7 + i3) - 13;
            int i92 = i5;
            i2 = i82;
            i3 = i92;
            bArr = bArr3;
            i = i6;
            bArr2[i] = (byte) i2;
            int i102 = i3 + 1;
            i6 = i + 1;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            int i1022 = i3 + 1;
            i6 = i + 1;
            if (i == i4) {
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
                    int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                    int c = a.c((~(startElapsedRealtime | (-988130907))) | (~((~startElapsedRealtime) | (-489241627))), 333, (((~((-988130907) | 0)) | (~(startElapsedRealtime | (-489241627)))) * 333) - 1839892133, 1492378966);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4936;
                    Fpnative.valueOf = objArr;
                    return super.getMessage();
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a(bArr[54], bArr[19], bArr[77], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = (byte) ($$b & 346);
            byte b2 = bArr[27];
            Object[] objArr4 = new Object[1];
            a(b, b2, b2, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1492378966);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4936;
            Fpnative.valueOf = objArr;
            return super.getMessage();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
