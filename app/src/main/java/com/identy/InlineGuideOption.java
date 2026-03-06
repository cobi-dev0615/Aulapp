package com.identy;

import android.os.Process;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class InlineGuideOption {
    private static final byte[] $$a = {126, 106, 85, 73, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -36, -54, -17, -10, -10, -13, 43, -31, -8, -47, -30, -2, -26, 0, -24, -18, 72, -57, -43, -6, -16, 27, -44, -16, 4, -35, -11, -20, 0, -32, -14, -10, 0, -43, -6, -16, 27, -44, -16, 20, -60, 2, 17, -64, 8, -15, -24, -17, -2, -19, -12, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -38, -59, -1, -8, -14, 10, -46, 27, -59, -1, -8, -14, 16, -42, -20, -17, -2, -26, -43, -6, -16, 27, -44, -16, 4, -35, -11, -20, 0, -32, -14, -10, 0, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -70, 44, -47, -43, -6, -16, 27, -44, -16, 20, -60, 2, 17, -64, 8, -15, -24, -17, -2, -19, -12, 8, -24, -22, 3, -27};
    private static final int $$b = 226;
    int a;
    int b;

    public InlineGuideOption(int i, int i2) {
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
                    int c = defpackage.a.c((~(maxMemory | (-737987208))) | 239097927, 301, (((~(239097927 | maxMemory)) | (~((~maxMemory) | 737987207))) * (-301)) + (((~((-67113025) | maxMemory)) * (-301)) - 1545960228), -349568870);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 5045;
                    Fpnative.valueOf = objArr;
                    this.a = i;
                    this.b = i2;
                }
            }
            byte[] bArr = $$a;
            short s = bArr[27];
            Object[] objArr3 = new Object[1];
            c(s, (byte) s, (byte) (-bArr[77]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(bArr[20], (byte) (-bArr[4]), bArr[55], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -349568870);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5045;
            Fpnative.valueOf = objArr;
            this.a = i;
            this.b = i2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, int i, byte b, Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = s + 4;
        int i4 = 118 - (b * 19);
        byte[] bArr2 = new byte[44 - i];
        int i5 = 43 - i;
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i6 = 0;
            int i7 = i4;
            int i8 = i3;
            int i9 = i8 + 1;
            i4 = (i7 + (-i3)) - 13;
            i3 = i9;
            bArr = bArr3;
            i2 = i6;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i10 = i4;
            i8 = i3;
            i3 = bArr[i3];
            i6 = i2 + 1;
            bArr3 = bArr;
            i7 = i10;
            int i92 = i8 + 1;
            i4 = (i7 + (-i3)) - 13;
            i3 = i92;
            bArr = bArr3;
            i2 = i6;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        }
    }

    public int getDuration() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    int c = defpackage.a.c((~(elapsedCpuTime | (-122904776))) | (~((~elapsedCpuTime) | 375984504)), 959, (((~((-122904776) | 0)) | (~(elapsedCpuTime | 375984504))) * 959) - 1610785523, -977081042);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4899;
                    Fpnative.valueOf = objArr;
                    return this.a;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c((short) (bArr[13] - 1), (byte) (-bArr[59]), (byte) (-bArr[77]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c((short) 89, (byte) (bArr[35] + 1), bArr[55], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -977081042);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4899;
            Fpnative.valueOf = objArr;
            return this.a;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public int getNumberOfRepeats() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i = ~System.identityHashCode(this);
                    int c = defpackage.a.c(i | 498855935, -828, (((~(i | 498855935)) | 33344) * (-828)) + 1262351875, -1848519708);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4854;
                    Fpnative.valueOf = objArr;
                    return this.b;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c((short) 104, (byte) (-bArr[64]), (byte) (-bArr[77]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c((short) 135, (byte) (-bArr[75]), bArr[27], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1112665116);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4854;
            Fpnative.valueOf = objArr;
            return this.b;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
