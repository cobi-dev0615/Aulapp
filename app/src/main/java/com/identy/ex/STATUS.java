package com.identy.ex;

import android.os.Process;
import android.os.SystemClock;
import com.d.e.a.values;
import com.identy.Fpnative;
import com.identy.R;
import defpackage.a;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public enum STATUS {
    STATUS_OK(R.string.id_r_status_ok),
    BAD_QUALITY(R.string.id_r_status_bad_quality),
    TWIST_LESS(R.string.id_r_status_twist_less),
    TWIST_MORE(R.string.id_r_status_twist_more),
    PRECAPTURE_ERROR(R.string.id_r_status_pre_capture_erro);

    private static  byte[] $$a = null;
    private static  int $$b = 0;
    int a;

    static {
        init$0();
    }

    STATUS(int i) {
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, short s2, int i, Object[] objArr) {
        int i2;
        int i3 = 118 - (s * 19);
        byte[] bArr = $$a;
        int i4 = 77 - s2;
        byte[] bArr2 = new byte[i + 6];
        int i5 = i + 5;
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i6 = 0;
            int i7 = i4;
            i3 = (i3 + i4) - 8;
            i4 = i7;
            bArr = bArr3;
            i2 = i6;
            int i8 = i4 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b2 = bArr[i8];
            byte[] bArr4 = bArr;
            i7 = i8;
            i4 = b2;
            i6 = i2 + 1;
            bArr3 = bArr4;
            i3 = (i3 + i4) - 8;
            i4 = i7;
            bArr = bArr3;
            i2 = i6;
            int i82 = i4 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            int i822 = i4 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{90, 12, -119, 4, 20, 6, -55, 67, 3, 9, 17, 14, 13, -67, 33, 54, -4, 3, 9, -15, 41, -32, 54, -4, 3, 9, -21, 37, 15, 12, -3, 21, 38, 1, 11, -32, 39, 11, -9, 30, 6, 15, -5, 27, 9, 5, -5, 20, 6, -55, 67, 3, 9, 17, 14, 13, -67, 65, -49, 42, 38, 1, 11, -32, 39, 11, -25, 55, -7, -22, 59, -13, 10, 19, 12, -3, 14, 7, -13, 19, 17, -8, 22};
        $$b = 134;
    }

    public static STATUS valueOfString(String str) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int uptimeMillis = (int) SystemClock.uptimeMillis();
                    int c = defpackage.a.c((~(uptimeMillis | (-973984119))) | 475094838, 318, (((~(973984118 | uptimeMillis)) | (-1046339447)) * (-318)) + ((((~((-571244609) | uptimeMillis)) | (~((~uptimeMillis) | (-72355329)))) * (-318)) - 746718375), 855727932);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4886;
                    Fpnative.valueOf = objArr;
                    return (STATUS) Enum.valueOf(STATUS.class, str);
                }
            }
            byte[] bArr = $$a;
            byte b2 = bArr[33];
            byte b3 = (byte) (b2 | 30);
            Object[] objArr3 = new Object[1];
            c(b2, b3, (byte) (b3 - 5), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b4 = (byte) (bArr[33] - 1);
            byte b5 = b4;
            Object[] objArr4 = new Object[1];
            c(b4, b5, b5, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 855727932);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4886;
            Fpnative.valueOf = objArr;
            return (STATUS) Enum.valueOf(STATUS.class, str);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static STATUS[] valuesCustom() {
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
                    int c = defpackage.a.c((~((~myUid) | 737077539)) | 238188259, 168, (((~(myUid | 737077539)) | 68163264) * (-168)) + ((((~(238188259 | myUid)) | 567052544) * 336) - 1710130969), 1527135602);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4866;
                    Fpnative.valueOf = objArr;
                    return (STATUS[]) values().clone();
                }
            }
            Object[] objArr3 = new Object[1];
            c($$a[33], (byte) 74, (byte) ($$a[82] + 1), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b2 = (byte) ($$b & 11);
            Object[] objArr4 = new Object[1];
            c(b2, (byte) (b2 | 44), $$a[72], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1527135602);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4866;
            Fpnative.valueOf = objArr;
            return (STATUS[]) values().clone();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    public final int getMessage() {
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
                    int c = defpackage.a.c(identityHashCode | 796262237, 668, ((758243165 | (~(259353885 | identityHashCode))) * 1336) + ((((~(identityHashCode | 758243165)) | 259353885) * (-668)) - 1746960593), 1269694876);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4890;
                    Fpnative.valueOf = objArr;
                    return this.a;
                }
            }
            byte[] bArr = $$a;
            byte b2 = bArr[33];
            byte b3 = (byte) (b2 | 30);
            Object[] objArr3 = new Object[1];
            c(b2, b3, (byte) (b3 - 5), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b4 = (byte) (bArr[33] - 1);
            byte b5 = b4;
            Object[] objArr4 = new Object[1];
            c(b4, b5, b5, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1269694876);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4890;
            Fpnative.valueOf = objArr;
            return this.a;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }
}
