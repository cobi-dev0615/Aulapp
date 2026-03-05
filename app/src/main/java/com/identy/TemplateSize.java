package com.identy;

import android.os.Process;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public enum TemplateSize {
    DEFAULT;

    private static final byte[] $$a = null;
    private static final int $$b = 0;

    static {
        init$0();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, short s2, Object[] objArr) {
        int i;
        int i2 = (s * 19) + 80;
        byte[] bArr = $$a;
        int i3 = b + 4;
        byte[] bArr2 = new byte[s2 + 6];
        int i4 = s2 + 5;
        if (bArr == null) {
            int i5 = i3;
            int i6 = i4;
            i = 0;
            int i7 = (i3 + (-i6)) - 13;
            i3 = i5 + 1;
            i2 = i7;
            bArr2[i] = (byte) i2;
            if (i == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i++;
            i6 = bArr[i3];
            int i8 = i3;
            i3 = i2;
            i5 = i8;
            int i72 = (i3 + (-i6)) - 13;
            i3 = i5 + 1;
            i2 = i72;
            bArr2[i] = (byte) i2;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            if (i == i4) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{14, 74, -24, 5, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -70, 44, -47, -43, -6, -16, 27, -44, -16, 20, -60, 2, 17, -64, 8, -15, -24, -17, -2, -19, -12, 8, -24, -22, 3, -27, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -36, -54, -17, -10, -10, -13, 43, -31, -8, -47, -30, -2, -26, 0, -24, -18, 72, -57, -43, -6, -16, 27, -44, -16, 4, -35, -11, -20, 0, -32, -14, -10, 0, -43, -6, -16, 27, -44, -16, 20, -60, 2, 17, -64, 8, -15, -24, -17, -2, -19, -12};
        $$b = 223;
    }

    public static TemplateSize valueOfString(String str) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                    int c = defpackage.a.c((~(startElapsedRealtime | (-28313895))) | 469893273, 235, (((~((-28654951) | startElapsedRealtime)) | 470234329) * (-470)) + (((~((~startElapsedRealtime) | (-28654951))) | 470234329) * (-235)) + 609670471, 251465370);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 5011;
                    Fpnative.valueOf = objArr;
                    return (TemplateSize) Enum.valueOf(TemplateSize.class, str);
                }
            }
            byte b = (byte) ($$b & 1);
            byte[] bArr = $$a;
            byte b2 = (byte) (-bArr[50]);
            Object[] objArr3 = new Object[1];
            b(b, b2, (byte) (b2 + 2), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b3 = bArr[63];
            Object[] objArr4 = new Object[1];
            b(b3, (byte) (b3 | 79), (byte) (-bArr[55]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 251465370);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5011;
            Fpnative.valueOf = objArr;
            return (TemplateSize) Enum.valueOf(TemplateSize.class, str);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static TemplateSize[] valuesCustom() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int startUptimeMillis = (int) Process.getStartUptimeMillis();
                    int c = defpackage.a.c(startUptimeMillis | (-19005875), 668, ((475610701 | (~((-23278579) | startUptimeMillis))) * 1336) + ((((~(startUptimeMillis | 475610701)) | (-23278579)) * (-668)) - 1927035665), 415953700);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 5001;
                    Fpnative.valueOf = objArr;
                    return (TemplateSize[]) values().clone();
                }
            }
            byte b = (byte) ($$b & 1);
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b(b, bArr[63], (byte) (-bArr[62]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b(bArr[25], (byte) (-bArr[57]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 415953700);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5001;
            Fpnative.valueOf = objArr;
            return (TemplateSize[]) values().clone();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
