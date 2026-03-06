package com.identy.app.s3;

import android.os.Process;
import com.d.e.a.values;
import com.identy.Fpnative;
import defpackage.a;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class FrameTiming extends HashMap<String, Long> {
    private static final byte[] $$a = {117, 44, -20, -120, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 38, 59, 1, 8, 14, -10, 46, -27, 59, 1, 8, 14, -16, 42, 20, 17, 2, 26, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 70, -44, 47, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, -8, 24, 22, -3, 27, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 36, 54, 17, 10, 10, 13, -43, 31, 8, 47, 30, 2, 26, 0, 24, 18, -72, 57, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12};
    private static final int $$b = 135;

    public FrameTiming() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int startUptimeMillis = (int) Process.getStartUptimeMillis();
                    int i = ~startUptimeMillis;
                    int c = a.c(startUptimeMillis | (-788304833), 397, (((~(i | (-161624290))) | ((~((-660513570) | i)) | 16916513)) * (-397)) - 1950783559, -1246087541);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4914;
                    Fpnative.valueOf = objArr;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b(bArr[72], (byte) 122, bArr[16], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = (byte) (bArr[82] + 1);
            Object[] objArr4 = new Object[1];
            b(b, (byte) (b | 66), bArr[42], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1246087541);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4914;
            Fpnative.valueOf = objArr;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, short s3, Object[] objArr) {
        int i;
        int i2 = (s3 * 19) + 80;
        byte[] bArr = $$a;
        int i3 = 125 - s2;
        byte[] bArr2 = new byte[44 - s];
        int i4 = 43 - s;
        if (bArr == null) {
            int i5 = i4;
            int i6 = i3;
            i = 0;
            int i7 = i6;
            i2 = (i3 + i5) - 13;
            i3 = i7;
            bArr2[i] = (byte) i2;
            int i8 = i3 + 1;
            if (i == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i++;
            i5 = bArr[i8];
            int i9 = i2;
            i6 = i8;
            i3 = i9;
            int i72 = i6;
            i2 = (i3 + i5) - 13;
            i3 = i72;
            bArr2[i] = (byte) i2;
            int i82 = i3 + 1;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            int i822 = i3 + 1;
            if (i == i4) {
            }
        }
    }

    public JSONObject a() {
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
                    int i = ~(307463781 | identityHashCode);
                    int i2 = ~identityHashCode;
                    int c = a.c((~(identityHashCode | (-806353062))) | (~((-307463782) | i2)), 406, ((~(845151973 | i2)) * (-406)) + (((i | (~((-38798913) | i2))) * (-406)) - 739182899), 781213206);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 4875;
                    Fpnative.valueOf = objArr;
                    return new JSONObject(this);
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b(bArr[42], bArr[32], bArr[16], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr[4];
            byte b2 = bArr[42];
            Object[] objArr4 = new Object[1];
            b(b, b2, b2, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 781213206);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4875;
            Fpnative.valueOf = objArr;
            return new JSONObject(this);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
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
                    int c = a.c((~(elapsedCpuTime | 443235899)) | 38276608, 49, (((~((~elapsedCpuTime) | (-942125180))) | 443235899 | (~(942125179 | elapsedCpuTime))) * (-49)) + ((((~(443235899 | 0)) | (-980401788)) * 98) - 94171966), 1313004950);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4964;
                    Fpnative.valueOf = objArr;
                    return put((String) obj, (Long) obj2);
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b(bArr[72], (byte) 122, bArr[16], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = (byte) (bArr[82] + 1);
            Object[] objArr4 = new Object[1];
            b(b, (byte) (b | 66), bArr[42], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1313004950);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4964;
            Fpnative.valueOf = objArr;
            return put((String) obj, (Long) obj2);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public Long put(String str, Long l) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = a.c((~((~((int) Runtime.getRuntime().totalMemory())) | 54294757)) | (-423854528), 494, (((-407077147) | 0) * 494) - 570370899, -1942652077);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4871;
                    Fpnative.valueOf = objArr;
                    return (Long) super.put((FrameTiming) str, (String) Long.valueOf(Calendar.getInstance().getTimeInMillis() - l.longValue()));
                }
            }
            byte[] bArr = $$a;
            byte b = bArr[77];
            Object[] objArr3 = new Object[1];
            b(b, (byte) (b | 67), bArr[16], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b(bArr[14], (byte) (bArr[59] + 1), bArr[30], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1942652077);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4871;
            Fpnative.valueOf = objArr;
            return (Long) super.put((FrameTiming) str, (String) Long.valueOf(Calendar.getInstance().getTimeInMillis() - l.longValue()));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
