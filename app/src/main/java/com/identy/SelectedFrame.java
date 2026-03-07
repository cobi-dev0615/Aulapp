package com.identy;

import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes2.dex */
public class SelectedFrame {
    private static final byte[] $$a = {37, -49, ByteCompanionObject.MAX_VALUE, 88, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 36, 54, 17, 10, 10, 13, -43, 31, 8, 47, 30, 2, 26, 0, 24, 18, -72, 57, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12};
    private static final int $$b = 184;
    public ArrayList<byte[]> opticalflow;
    public ArrayList<byte[]> sequence;

    public SelectedFrame() {
        java.lang.Object[] objArr;
        long j;
        java.lang.Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new java.lang.Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int b = defpackage.a.b(943483186);
                    int i = ~b;
                    int c = defpackage.a.c((~(b | 469297551)) | 537203264 | (~(i | (-38313985))), 988, (((~(1006500815 | i)) | (~((-38313985) | b))) * 988) + 1108892159, 1536766574);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4972;
                    Fpnative.valueOf = objArr;
                    this.opticalflow = new ArrayList<>();
                    this.sequence = new ArrayList<>();
                }
            }
            byte[] bArr = $$a;
            byte b2 = (byte) (bArr[25] - 1);
            byte b3 = bArr[27];
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a(b2, b3, (byte) (b3 - 1), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b4 = bArr[27];
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a(b4, (byte) (b4 + 1), (byte) (bArr[32] - 1), objArr4);
            objArr = (java.lang.Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1536766574);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4972;
            Fpnative.valueOf = objArr;
            this.opticalflow = new ArrayList<>();
            this.sequence = new ArrayList<>();
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, short s, short s2, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = 44 - (s * 25);
        int i4 = (b * 19) + 80;
        int i5 = s2 + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            int i6 = i4;
            i4 = i3;
            i2 = 0;
            i4 = (i4 + i6) - 13;
            i = i2;
            i5++;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i6 = bArr[i5];
            i4 = (i4 + i6) - 13;
            i = i2;
            i5++;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
            }
        } else {
            i = 0;
            i5++;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
            }
        }
    }
}
