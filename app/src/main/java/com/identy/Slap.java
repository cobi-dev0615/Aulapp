package com.identy;

import android.os.Process;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public enum Slap {
    LEFT_FOUR_FINGERS,
    RIGHT_FOUR_FINGERS,
    TWO_THUMB;

    private static final byte[] $$a = null;
    private static final int $$b = 0;

    static {
        init$0();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, int i, int i2, Object[] objArr) {
        int i3;
        int i4 = 92 - i2;
        int i5 = (i * 19) + 80;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[44 - s];
        int i6 = 43 - s;
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            i5 = (i5 + i7) - 13;
            i4++;
            bArr2[i3] = (byte) i5;
            if (i3 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3++;
            i7 = bArr[i4];
            i5 = (i5 + i7) - 13;
            i4++;
            bArr2[i3] = (byte) i5;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            i4++;
            bArr2[i3] = (byte) i5;
            if (i3 == i6) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{77, 125, 4, 95, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 36, 54, 17, 10, 10, 13, -43, 31, 8, 47, 30, 2, 26, 0, 24, 18, -72, 57, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 38, 59, 1, 8, 14, -10, 46, -27, 59, 1, 8, 14, -16, 42, 20, 17, 2, 26, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0};
        $$b = 171;
    }

    public static Slap valueOf(String str) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int elapsedRealtime = (int) SystemClock.elapsedRealtime();
                    int c = defpackage.a.c((~((~elapsedRealtime) | 952202100)) | 453312820, 168, (((~(elapsedRealtime | 952202100)) | 50593792) * (-168)) + ((((~(453312820 | elapsedRealtime)) | 549483072) * 336) - 1710130969), -845076321);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4938;
                    Fpnative.valueOf = objArr;
                    return (Slap) Enum.valueOf(Slap.class, str);
                }
            }
            byte[] bArr = $$a;
            byte b = (byte) 28;
            Object[] objArr3 = new Object[1];
            a(bArr[59], bArr[77], b, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b2 = bArr[27];
            Object[] objArr4 = new Object[1];
            a(b, b2, b2, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -845076321);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4938;
            Fpnative.valueOf = objArr;
            return (Slap) Enum.valueOf(Slap.class, str);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static Slap[] valuesCustom() {
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
                    int i = ~startElapsedRealtime;
                    int i2 = ~(402844723 | i);
                    int c = defpackage.a.c(i2 | (-96044557), 712, (((~(startElapsedRealtime | 498855487)) | (~(i | (-96010765)))) * (-712)) + ((96010764 | i2) * (-712)) + 1100502471, -820486679);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 4910;
                    Fpnative.valueOf = objArr;
                    return (Slap[]) values().clone();
                }
            }
            byte[] bArr = $$a;
            byte b = bArr[27];
            byte b2 = bArr[77];
            Object[] objArr3 = new Object[1];
            a(b, b2, (byte) (b2 | 88), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(bArr[4], bArr[27], bArr[81], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -820486679);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4910;
            Fpnative.valueOf = objArr;
            return (Slap[]) values().clone();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
