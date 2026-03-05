package com.identy.enums;

import android.os.Process;
import android.os.SystemClock;
import com.d.e.a.values;
import com.identy.Fpnative;
import defpackage.a;
import java.io.Serializable;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public enum Hand implements Serializable {
    LEFT("left"),
    RIGHT("right");

    private static final byte[] $$a = null;
    private static final int $$b = 0;
    String a;

    static {
        init$0();
    }

    Hand(String str) {
        this.a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Type inference failed for: r6v6, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, byte b2, int i, Object[] objArr) {
        int i2;
        byte b3;
        int r6 = 118 - (b2 * 19);
        byte[] bArr = $$a;
        int i3 = 78 - i;
        byte[] bArr2 = new byte[s + 6];
        int r5 = s + 5;
        if (bArr == null) {
            byte b4 = r6;
            i2 = 0;
            byte b5 = r5;
            i3++;
            b3 = (b5 + b4) - 8;
            bArr2[i2] = b3 == true ? (byte) 1 : (byte) 0;
            if (i2 == r5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2++;
            b4 = bArr[i3];
            b5 = b3;
            i3++;
            b3 = (b5 + b4) - 8;
            bArr2[i2] = b3 == true ? (byte) 1 : (byte) 0;
            if (i2 == r5) {
            }
        } else {
            i2 = 0;
            b3 = r6;
            bArr2[i2] = b3 == true ? (byte) 1 : (byte) 0;
            if (i2 == r5) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{58, -87, 109, 66, 20, 6, -55, 67, 3, 9, 17, 14, 13, -67, 33, 54, -4, 3, 9, -15, 41, -32, 54, -4, 3, 9, -21, 37, 15, 12, -3, 21, 38, 1, 11, -32, 39, 11, -9, 30, 6, 15, -5, 27, 9, 5, -5, 20, 6, -55, 67, 3, 9, 17, 14, 13, -67, 65, -49, 42, 38, 1, 11, -32, 39, 11, -25, 55, -7, -22, 59, -13, 10, 19, 12, -3, 14, 7, -13, 19, 17, -8, 22};
        $$b = 248;
    }

    public static Hand valueOf(String str) {
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
                    int c = a.c(~(myUid | (-291457)), 566, (((~((-478540459) | myUid)) | 478249002) * (-566)) + 604884763, -590478048);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4977;
                    Fpnative.valueOf = objArr;
                    return (Hand) Enum.valueOf(Hand.class, str);
                }
            }
            byte[] bArr = $$a;
            byte b2 = (byte) (bArr[43] - 1);
            byte b3 = bArr[33];
            Object[] objArr3 = new Object[1];
            c(b2, b3, (byte) (b3 | 30), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b4 = (byte) (bArr[33] - 1);
            byte b5 = b4;
            Object[] objArr4 = new Object[1];
            c(b4, b5, b5, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -590478048);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4977;
            Fpnative.valueOf = objArr;
            return (Hand) Enum.valueOf(Hand.class, str);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static Hand[] valuesCustom() {
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
                    int c = a.c((~(uptimeMillis | (-406347803))) | (~((~uptimeMillis) | (-79924518))) | 67307557, 168, ((~((-12616961) | uptimeMillis)) * 168) + ((((~((-418964763) | r5)) | 12616960) * 168) - 1710130969), -241117023);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4910;
                    Fpnative.valueOf = objArr;
                    return (Hand[]) values().clone();
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c((byte) (bArr[82] + 1), bArr[33], (byte) 74, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b2 = bArr[72];
            byte b3 = (byte) (b2 >>> 2);
            Object[] objArr4 = new Object[1];
            c(b2, b3, (byte) (b3 | 44), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -241117023);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4910;
            Fpnative.valueOf = objArr;
            return (Hand[]) values().clone();
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
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = a.c((~(identityHashCode | (-138543123))) | 302057517, 446, (((~((~identityHashCode) | (-167687443))) | 29144320) * 446) + 1332570237, -66154022);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4951;
                    Fpnative.valueOf = objArr;
                    return this.a;
                }
            }
            byte[] bArr = $$a;
            byte b2 = (byte) (bArr[43] - 1);
            byte b3 = bArr[33];
            Object[] objArr3 = new Object[1];
            c(b2, b3, (byte) (b3 | 30), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b4 = (byte) (bArr[33] - 1);
            byte b5 = b4;
            Object[] objArr4 = new Object[1];
            c(b4, b5, b5, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -179618854);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4951;
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
