package com.identy.exceptions;

import android.os.Process;
import com.d.e.a.values;
import com.identy.Fpnative;
import defpackage.a;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class RetriesAttemptsExceededLimitException extends Exception {
    private static final byte[] $$a = {2, 126, 117, -112, 20, 6, -55, 67, 3, 9, 17, 14, 13, -67, 33, 54, -4, 3, 9, -15, 41, -32, 54, -4, 3, 9, -21, 37, 15, 12, -3, 21, 38, 1, 11, -32, 39, 11, -9, 30, 6, 15, -5, 27, 9, 5, -5, 20, 6, -55, 67, 3, 9, 17, 14, 13, -67, 65, -49, 42, 38, 1, 11, -32, 39, 11, -25, 55, -7, -22, 59, -13, 10, 19, 12, -3, 14, 7, -13, 19, 17, -8, 22};
    private static final int $$b = 220;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetriesAttemptsExceededLimitException(String str) {
        super(str);
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
                    int c = a.c((~(myTid | 928500620)) | (~(429611340 | myTid)) | (-1071635405), 623, (((~myTid) | 286476556) * (-623)) + ((~(1071635404 | myTid)) * 623) + 494083670, -968971455);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 5037;
                    Fpnative.valueOf = objArr;
                }
            }
            byte[] bArr = $$a;
            byte b = (byte) (bArr[82] + 1);
            byte b2 = bArr[33];
            Object[] objArr3 = new Object[1];
            a(b, (byte) (-b2), b2, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(bArr[72], bArr[43], bArr[0], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -968971455);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5037;
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, byte b2, short s, Object[] objArr) {
        int i;
        int i2;
        byte[] bArr = $$a;
        int i3 = b + 6;
        int i4 = b2 + 4;
        int i5 = 118 - (s * 19);
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            int i6 = i4;
            byte[] bArr3 = bArr;
            int i7 = 0;
            int i8 = i3;
            int i9 = (i8 + i4) - 8;
            int i10 = i6;
            i5 = i9;
            i4 = i10;
            bArr = bArr3;
            i = i7;
            bArr2[i] = (byte) i5;
            i2 = i + 1;
            if (i2 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i11 = i4 + 1;
            int i12 = i5;
            i6 = i11;
            i4 = bArr[i11];
            i7 = i2;
            bArr3 = bArr;
            i8 = i12;
            int i92 = (i8 + i4) - 8;
            int i102 = i6;
            i5 = i92;
            i4 = i102;
            bArr = bArr3;
            i = i7;
            bArr2[i] = (byte) i5;
            i2 = i + 1;
            if (i2 == i3) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i5;
            i2 = i + 1;
            if (i2 == i3) {
            }
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
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
                    int c = a.c((~(identityHashCode | (-42209985))) | (~((-560104761) | (~identityHashCode))), 338, ((((-602314745) | 0) | (~(560104760 | identityHashCode))) * (-338)) - 1220031619, -991316377);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4926;
                    Fpnative.valueOf = objArr;
                    return super.getMessage();
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a((byte) (bArr[43] - 1), bArr[59], bArr[33], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr[33];
            byte b2 = (byte) (b - 1);
            Object[] objArr4 = new Object[1];
            a(b2, (byte) (b2 | 73), (byte) (b - 1), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -991316377);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4926;
            Fpnative.valueOf = objArr;
            return super.getMessage();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
