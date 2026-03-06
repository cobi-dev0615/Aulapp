package com.identy.enums;

import android.os.Process;
import com.d.e.a.values;
import com.identy.Fpnative;
import defpackage.a;
import java.io.Serializable;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public enum PngjBadSignature implements Serializable {
    ACCEPTED(2),
    GOOD(1),
    BAD(0);

    private static  byte[] $$a = null;
    private static  int $$b = 0;
    private int PngjBadSignature;

    static {
        init$0();
    }

    PngjBadSignature(int i) {
        this.PngjBadSignature = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, short s, byte b, Object[] objArr) {
        int i2;
        int i3;
        int i4;
        int i5 = s + 4;
        int i6 = 118 - (b * 19);
        int i7 = i + 6;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            byte[] bArr3 = bArr;
            i4 = 0;
            int i8 = i5;
            i5 = (i5 + i6) - 13;
            i2 = i8;
            bArr = bArr3;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            int i9 = i2 + 1;
            if (i4 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b2 = bArr[i9];
            byte[] bArr4 = bArr;
            i8 = i9;
            i6 = b2;
            bArr3 = bArr4;
            i5 = (i5 + i6) - 13;
            i2 = i8;
            bArr = bArr3;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            int i92 = i2 + 1;
            if (i4 == i7) {
            }
        } else {
            i2 = i5;
            i5 = i6;
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            int i922 = i2 + 1;
            if (i4 == i7) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{72, 101, -55, -108, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 70, -44, 47, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, -8, 24, 22, -3, 27, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 36, 54, 17, 10, 10, 13, -43, 31, 8, 47, 30, 2, 26, 0, 24, 18, -72, 57, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12};
        $$b = 55;
    }

    public static PngjBadSignature valueOfString(String str) {
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
                    int c = a.c(myUid | (-19417481), 465, (((-61598601) | (~((-560487881) | myUid))) * 930) + ((((~(myUid | (-61598601))) | (-560487881)) * (-465)) - 977813079), 399097436);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 5021;
                    Fpnative.valueOf = objArr;
                    return (PngjBadSignature) Enum.valueOf(PngjBadSignature.class, str);
                }
            }
            byte b = (byte) ($$b & 238);
            byte b2 = $$a[75];
            Object[] objArr3 = new Object[1];
            a(b, b2, (byte) (b2 & 5), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a($$a[55], (byte) 78, $$a[32], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 399097436);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5021;
            Fpnative.valueOf = objArr;
            return (PngjBadSignature) Enum.valueOf(PngjBadSignature.class, str);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static PngjBadSignature[] valuesCustom() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int myTid = Process.myTid();
                    int c = a.c((~(myTid | 3599601)) | 303296, 49, (((~((~myTid) | (-502488882))) | 3599601 | (~(502488881 | myTid))) * (-49)) + ((((~(3599601 | 0)) | (-502792178)) * 98) - 296198332), -1841564973);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4980;
                    Fpnative.valueOf = objArr;
                    return (PngjBadSignature[]) values().clone();
                }
            }
            byte[] bArr = $$a;
            byte b = bArr[62];
            byte b2 = (byte) (bArr[63] - 1);
            Object[] objArr3 = new Object[1];
            a(b, b2, (byte) (-b2), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b3 = bArr[63];
            Object[] objArr4 = new Object[1];
            a(b3, bArr[60], b3, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1841564973);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4980;
            Fpnative.valueOf = objArr;
            return (PngjBadSignature[]) values().clone();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
