package com.identy.ex;

import android.os.Process;
import com.d.e.a.values;
import com.identy.Fpnative;
import com.identy.R;
import defpackage.a;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public enum SIDE {
    CENTER(R.string.id_fin_show_center, R.drawable.ro_center, 180),
    LEFT(R.string.id_fin_show_left, R.drawable.ro_left_center, 360),
    RIGHT(R.string.id_fin_show_right, R.drawable.ro_all, 0);

    private static  byte[] $$a = null;
    private static  int $$b = 0;
    int a;
    int b;
    int c;

    static {
        init$0();
    }

    SIDE(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void e(byte b, byte b2, int i, Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = i + 4;
        int i4 = 118 - (b * 19);
        byte[] bArr2 = new byte[b2 + 6];
        int i5 = b2 + 5;
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            i4 = (i4 + (-i6)) - 13;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3++;
            i6 = bArr[i3];
            i4 = (i4 + (-i6)) - 13;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i5) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{2, 126, 117, -112, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -70, 44, -47, -43, -6, -16, 27, -44, -16, 20, -60, 2, 17, -64, 8, -15, -24, -17, -2, -19, -12, 8, -24, -22, 3, -27, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -36, -54, -17, -10, -10, -13, 43, -31, -8, -47, -30, -2, -26, 0, -24, -18, 72, -57, -43, -6, -16, 27, -44, -16, 4, -35, -11, -20, 0, -32, -14, -10, 0, -43, -6, -16, 27, -44, -16, 20, -60, 2, 17, -64, 8, -15, -24, -17, -2, -19, -12, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -38, -59, -1, -8, -14, 10, -46, 27, -59, -1, -8, -14, 16, -42, -20, -17, -2, -26, -43, -6, -16, 27, -44, -16, 4, -35, -11, -20, 0, -32, -14, -10, 0};
        $$b = 149;
    }

    public static SIDE valueOfString(String str) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int freeMemory = (int) Runtime.getRuntime().freeMemory();
                    int c = a.c((~(freeMemory | (-63803603))) | (~((-562692883) | freeMemory)) | 25690130, -69, (((~((-537002753) | freeMemory)) | (~((-38113473) | freeMemory))) * 69) + 777473784, 739977953);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4956;
                    Fpnative.valueOf = objArr;
                    return (SIDE) Enum.valueOf(SIDE.class, str);
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            e((byte) (-bArr[113]), (byte) (-bArr[111]), (byte) (-bArr[75]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            e(bArr[0], (byte) (-bArr[55]), (byte) 78, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -754056512);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4956;
            Fpnative.valueOf = objArr;
            return (SIDE) Enum.valueOf(SIDE.class, str);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static SIDE[] valuesCustom() {
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
                    int c = a.c((~(i | 245561929)) | (~((-253327351) | i)), 865, ((~(myUid | 245561929)) * 865) + ((((~((-245561930) | i)) | (-253327351)) * (-865)) - 1923232590), 277978404);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4982;
                    Fpnative.valueOf = objArr;
                    return (SIDE[]) values().clone();
                }
            }
            byte[] bArr = $$a;
            byte b = bArr[113];
            Object[] objArr3 = new Object[1];
            e((byte) (-b), (byte) (-bArr[62]), b, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b2 = bArr[63];
            Object[] objArr4 = new Object[1];
            e(b2, b2, (byte) (-bArr[60]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 277978404);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4982;
            Fpnative.valueOf = objArr;
            return (SIDE[]) values().clone();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final int getRes() {
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
                    int c = a.c((~(i | 270060048)) | (~(i2 | (-768949329))) | 269009408, -370, (((~(270060048 | i2)) | (~((-768949329) | i))) * (-370)) + 404328781, 1611634714);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 4969;
                    Fpnative.valueOf = objArr;
                    return this.a;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            e((byte) (-bArr[113]), (byte) (-bArr[111]), (byte) (-bArr[75]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            e(bArr[0], (byte) (-bArr[55]), (byte) 78, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 862401562);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4969;
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

    public final int getSdrawable() {
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
                    int i = (((~((~startElapsedRealtime) | 7587933)) | (-510917342)) * (-245)) - 893020152;
                    int i2 = ~(startElapsedRealtime | 7587933);
                    int c = a.c(i2 | 506477213, 245, (i2 * (-245)) + i, 1658559858);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 4856;
                    Fpnative.valueOf = objArr;
                    return this.b;
                }
            }
            byte b = (byte) (-$$a[113]);
            Object[] objArr3 = new Object[1];
            e(b, (byte) (b | 22), (byte) 96, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            e($$a[0], $$a[116], (byte) 124, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1658559858);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4856;
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

    public final int getTwistRoation() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = a.c((~((~System.identityHashCode(this)) | (-77912071))) | 498287167, 398, (((~((-77912071) | 0)) | 498287167) * 398) - 1120524709, 218961109);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 5005;
                    Fpnative.valueOf = objArr;
                    return this.c;
                }
            }
            byte[] bArr = $$a;
            byte b = bArr[113];
            Object[] objArr3 = new Object[1];
            e((byte) (-b), (byte) (-bArr[62]), b, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b2 = bArr[63];
            Object[] objArr4 = new Object[1];
            e(b2, b2, (byte) (-bArr[60]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 218961109);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5005;
            Fpnative.valueOf = objArr;
            return this.c;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
