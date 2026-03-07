package com.identy.app.users.modalities;

import android.os.Process;
import com.d.e.a.values;
import com.identy.Fpnative;
import defpackage.a;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class FingerModality {
    private static final byte[] $$a = {36, 88, 119, 1, -20, -6, 55, -67, -3, -9, -17, -14, -13, 67, -33, -54, 4, -3, -9, 15, -41, 32, -54, 4, -3, -9, 21, -37, -15, -12, 3, -21, -38, -1, -11, 32, -39, -11, 9, -30, -6, -15, 5, -27, -9, -5, 5};
    private static final int $$b = 165;

    public FingerModality() {
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
                    int c = a.c((~(elapsedCpuTime | 217031195)) | 570430528 | (~((~elapsedCpuTime) | (-71541249))), 988, (((~(787461723 | 0)) | (~((-71541249) | elapsedCpuTime))) * 988) - 1785930161, 2004246426);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4902;
                    Fpnative.valueOf = objArr;
                }
            }
            byte[] bArr = $$a;
            byte b = bArr[3];
            byte b2 = b;
            Object[] objArr3 = new Object[1];
            a(b, b2, b2, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b3 = (byte) (bArr[3] - 1);
            byte b4 = b3;
            Object[] objArr4 = new Object[1];
            a(b3, b4, b4, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 2004246426);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4902;
            Fpnative.valueOf = objArr;
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, byte b, byte b2, Object[] objArr) {
        int i2;
        int i3;
        int i4 = 31 - (b2 * 28);
        byte[] bArr = $$a;
        int i5 = (b * 19) + 80;
        int i6 = (i * 13) + 16;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            i5 = i6;
            byte[] bArr3 = bArr;
            i3 = 0;
            int i7 = i4;
            i5 = (i5 + (-i4)) - 8;
            i4 = i7;
            bArr = bArr3;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i8 = i4 + 1;
            byte b3 = bArr[i8];
            byte[] bArr4 = bArr;
            i7 = i8;
            i4 = b3;
            bArr3 = bArr4;
            i5 = (i5 + (-i4)) - 8;
            i4 = i7;
            bArr = bArr3;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
            }
        }
    }
}
