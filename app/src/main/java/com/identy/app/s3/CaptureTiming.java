package com.identy.app.s3;

import com.d.e.a.values;
import com.identy.Fpnative;
import defpackage.a;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.HashMap;
import kotlin.io.encoding.Base64;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class CaptureTiming extends HashMap<String, Long> {
    private static final byte[] $$a = {97, -73, Base64.padSymbol, -61, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -70, 44, -47, -43, -6, -16, 27, -44, -16, 20, -60, 2, 17, -64, 8, -15, -24, -17, -2, -19, -12, 8, -24, -22, 3, -27, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -36, -54, -17, -10, -10, -13, 43, -31, -8, -47, -30, -2, -26, 0, -24, -18, 72, -57, -43, -6, -16, 27, -44, -16, 4, -35, -11, -20, 0, -32, -14, -10, 0, -43, -6, -16, 27, -44, -16, 20, -60, 2, 17, -64, 8, -15, -24, -17, -2, -19, -12, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -38, -59, -1, -8, -14, 10, -46, 27, -59, -1, -8, -14, 16, -42, -20, -17, -2, -26, -43, -6, -16, 27, -44, -16, 4, -35, -11, -20, 0, -32, -14, -10, 0};
    private static final int $$b = 211;

    public CaptureTiming() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int a = a.a();
                    int c = a.c((~(a | (-347706556))) | (~((~a) | 151182724)), 333, (((~((-347706556) | 0)) | (~(a | 151182724))) * 333) - 519036671, 2044863978);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 5002;
                    Fpnative.valueOf = objArr;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) 125, (byte) (-bArr[62]), (byte) (-bArr[113]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((byte) 94, bArr[63], bArr[25], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 2044863978);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5002;
            Fpnative.valueOf = objArr;
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, byte b2, Object[] objArr) {
        int i2;
        int i3;
        int i4 = 129 - b;
        int i5 = i + 6;
        byte[] bArr = $$a;
        int i6 = (b2 * 19) + 80;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i4;
            byte[] bArr3 = bArr;
            i3 = 0;
            int i8 = i5;
            int i9 = i7 + 1;
            i6 = (i8 + (-i4)) - 13;
            i4 = i9;
            bArr = bArr3;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i10 = i6;
            i7 = i4;
            i4 = bArr[i4];
            bArr3 = bArr;
            i8 = i10;
            int i92 = i7 + 1;
            i6 = (i8 + (-i4)) - 13;
            i4 = i92;
            bArr = bArr3;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
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
                    int c = a.c((~((~identityHashCode) | 173913882)) | 285345829, 191, (((~(identityHashCode | 173913882)) | 324975397) * 191) + 1710911177, 1115072439);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4925;
                    Fpnative.valueOf = objArr;
                    return new JSONObject(this);
                }
            }
            byte[] bArr = $$a;
            byte b = (byte) (bArr[20] + 1);
            Object[] objArr3 = new Object[1];
            b(b, (byte) (b - 5), (byte) (-bArr[113]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b2 = bArr[63];
            Object[] objArr4 = new Object[1];
            b(b2, bArr[116], b2, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1115072439);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4925;
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
                    int identityHashCode = System.identityHashCode(this);
                    int c = a.c((~(identityHashCode | 611022683)) | (-112133404), 272, (((~((-611022684) | identityHashCode)) | 69928219) * (-272)) + ((((~((-541094465) | (~identityHashCode))) | (~((-42205185) | identityHashCode))) * (-272)) - 371150673), -329185572);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 5000;
                    Fpnative.valueOf = objArr;
                    return put((String) obj, (Long) obj2);
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) 125, (byte) (-bArr[62]), (byte) (-bArr[113]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((byte) 94, bArr[63], bArr[25], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -329185572);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5000;
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
                    int identityHashCode = System.identityHashCode(this);
                    int i = ~identityHashCode;
                    int i2 = (~((-233075419) | i)) | 2097306;
                    int c = a.c(~(i | (-265813862)), 713, ((~(identityHashCode | (-34835750))) * 1426) + (((i2 | 0) * (-713)) - 1368784100), -935451220);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 4867;
                    Fpnative.valueOf = objArr;
                    return (Long) super.put((CaptureTiming) str, (String) Long.valueOf(Calendar.getInstance().getTimeInMillis() - l.longValue()));
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) 89, (byte) (-bArr[111]), (byte) (-bArr[113]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((byte) (-bArr[117]), (byte) (-bArr[55]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -935451220);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4867;
            Fpnative.valueOf = objArr;
            return (Long) super.put((CaptureTiming) str, (String) Long.valueOf(Calendar.getInstance().getTimeInMillis() - l.longValue()));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
