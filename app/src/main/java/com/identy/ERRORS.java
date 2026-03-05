package com.identy;

import android.os.Process;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public enum ERRORS {
    CONFIG_URL_ERROR("config url doesn't exist"),
    LICENSE_NOT_EXIST("LICENSE_NOT_EXIST"),
    LICENSE_EMPTY("LICENSE_EMPTY"),
    LICENSE_VALIDATION_FAILED("LICENSE_VALIDATION_FAILED"),
    LICENSE_SERVER_NOT_CONNECTED("LICENSE_SERVER_NOT_CONNECTED"),
    NETWORK_ERROR("Network Error "),
    ACTIVITY_PAUSED("activty paused "),
    LICENSE_ERROR("license Error "),
    CAMERA_PERMISSION_REQUIRED("camera permission error  "),
    ACTIVITY_PAUSED_ON_BACK_PRESSED("activty paused on back pressed"),
    CUSTOM_BACK_BUTTON_PRESSED("user back pressed on ui "),
    USER_CANCELLED_ON_NEXT_DETECTION("user cancelled on next detection "),
    TIMED_OUT("timedout"),
    UNKNOWN("unknown error"),
    EXCEEDED_TRANSACTION_LIMIT("Transaction Limit exceeded");

    private static final byte[] $$a = null;
    private static final int $$b = 0;
    String a;

    static {
        init$0();
    }

    ERRORS(String str) {
        this.a = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, int i2, int i3, Object[] objArr) {
        int i4;
        int i5 = (i3 * 19) + 80;
        int i6 = i + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[32 - i2];
        int i7 = 31 - i2;
        if (bArr == null) {
            int i8 = i7;
            i4 = 0;
            i5 = (i5 + (-i8)) - 8;
            bArr2[i4] = (byte) i5;
            if (i4 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i6++;
            i4++;
            i8 = bArr[i6];
            i5 = (i5 + (-i8)) - 8;
            bArr2[i4] = (byte) i5;
            if (i4 == i7) {
            }
        } else {
            i4 = 0;
            bArr2[i4] = (byte) i5;
            if (i4 == i7) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{6, 29, 71, 91, -20, -6, 55, -67, -3, -9, -17, -14, -13, 67, -33, -54, 4, -3, -9, 15, -41, 32, -54, 4, -3, -9, 21, -37, -15, -12, 3, -21, -38, -1, -11, 32, -39, -11, 9, -30, -6, -15, 5, -27, -9, -5, 5, -20, -6, 55, -67, -3, -9, -17, -14, -13, 67, -65, 49, -42, -38, -1, -11, 32, -39, -11, 25, -55, 7, 22, -59, 13, -10, -19, -12, 3, -14, -7, 13, -19, -17, 8, -22};
        $$b = 188;
    }

    public static ERRORS valueOf(String str) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = defpackage.a.c((~((~((int) Process.getStartUptimeMillis())) | 376067172)) | (-575443649), 262, (((~(376067172 | r0)) | (-575443649)) * 262) - 1915009461, 1935578374);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4949;
                    Fpnative.valueOf = objArr;
                    return (ERRORS) Enum.valueOf(ERRORS.class, str);
                }
            }
            byte[] bArr = $$a;
            byte b2 = (byte) (-bArr[59]);
            byte b3 = bArr[33];
            Object[] objArr3 = new Object[1];
            c(b2, (byte) (b3 + 1), (byte) (-b3), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b4 = (byte) (bArr[66] + 1);
            Object[] objArr4 = new Object[1];
            c((byte) 73, b4, (byte) (b4 & 7), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1935578374);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4949;
            Fpnative.valueOf = objArr;
            return (ERRORS) Enum.valueOf(ERRORS.class, str);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static ERRORS[] valuesCustom() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int myPid = Process.myPid();
                    int c = defpackage.a.c(myPid | (-3680544), 668, ((398705888 | (~((-100183392) | myPid))) * 1336) + ((((~(myPid | 398705888)) | (-100183392)) * (-668)) - 2094228133), -148917398);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4886;
                    Fpnative.valueOf = objArr;
                    return (ERRORS[]) values().clone();
                }
            }
            byte[] bArr = $$a;
            byte b2 = bArr[33];
            Object[] objArr3 = new Object[1];
            c(b2, bArr[30], (byte) (-b2), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b3 = (byte) (-bArr[43]);
            Object[] objArr4 = new Object[1];
            c(b3, (byte) (b3 & 116), (byte) (bArr[33] + 1), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -148917398);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4886;
            Fpnative.valueOf = objArr;
            return (ERRORS[]) values().clone();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = defpackage.a.c((~((~identityHashCode) | (-560250346))) | 507874752, 381, (((-555757610) | identityHashCode) * (-381)) + 1986600952, 1952744848);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4922;
                    Fpnative.valueOf = objArr;
                    return this.a;
                }
            }
            byte[] bArr = $$a;
            byte b2 = (byte) (-bArr[59]);
            byte b3 = bArr[33];
            Object[] objArr3 = new Object[1];
            c(b2, (byte) (b3 + 1), (byte) (-b3), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b4 = (byte) (bArr[66] + 1);
            Object[] objArr4 = new Object[1];
            c((byte) 73, b4, (byte) (b4 & 7), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 662493323);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4922;
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
}
