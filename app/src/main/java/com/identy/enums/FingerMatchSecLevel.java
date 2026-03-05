package com.identy.enums;

import android.os.Process;
import com.d.e.a.values;
import com.identy.Fpnative;
import defpackage.a;
import java.lang.reflect.Method;
import kotlin.io.encoding.Base64;

/* loaded from: classes2.dex */
public enum FingerMatchSecLevel {
    NONE("N"),
    LOW("L"),
    MEDIUM("M"),
    HIGH("H"),
    HIGHEST("G");

    private static final byte[] $$a = null;
    private static final int $$b = 0;
    String a;

    static {
        init$0();
    }

    FingerMatchSecLevel(String str) {
        this.a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, short s2, short s3, Object[] objArr) {
        int i;
        int i2;
        int i3 = 99 - (s2 * 19);
        int r7 = s3 + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[s + 16];
        int i4 = s + 15;
        if (bArr == null) {
            i3 = i4;
            byte b2 = r7;
            i = 0;
            int i5 = r7;
            i3 = (i3 + b2) - 13;
            i2 = i5 + 1;
            bArr2[i] = (byte) i3;
            if (i == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            b2 = bArr[i2];
            i++;
            i5 = i2;
            i3 = (i3 + b2) - 13;
            i2 = i5 + 1;
            bArr2[i] = (byte) i3;
            if (i == i4) {
            }
        } else {
            i = 0;
            i2 = r7;
            bArr2[i] = (byte) i3;
            if (i == i4) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{115, 31, 111, -79, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 36, 54, 17, 10, 10, 13, -43, 31, 8, 47, 30, 2, 26, 0, 24, 18, -72, 57, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 38, 59, 1, 8, 14, -10, 46, -27, 59, 1, 8, 14, -16, 42, 20, 17, 2, 26, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0};
        $$b = 130;
    }

    public static FingerMatchSecLevel valueOf(String str) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int myPid = Process.myPid();
                    int i = ~myPid;
                    int c = a.c((~(374842609 | i)) | (-124046671), 712, (((~(myPid | 393735679)) | (~(i | (-18893071)))) * (-712)) + (((18893070 | r6) * (-712)) - 1974160153), 1195728185);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4862;
                    Fpnative.valueOf = objArr;
                    return (FingerMatchSecLevel) Enum.valueOf(FingerMatchSecLevel.class, str);
                }
            }
            byte[] bArr = $$a;
            byte b2 = bArr[19];
            byte b3 = bArr[27];
            Object[] objArr3 = new Object[1];
            c(b2, b3, (byte) (b3 | Base64.padSymbol), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b4 = bArr[27];
            byte b5 = bArr[77];
            Object[] objArr4 = new Object[1];
            c(b4, b5, (byte) (b5 | 88), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1195728185);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4862;
            Fpnative.valueOf = objArr;
            return (FingerMatchSecLevel) Enum.valueOf(FingerMatchSecLevel.class, str);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static FingerMatchSecLevel[] valuesCustom() {
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
                    int i = ~startElapsedRealtime;
                    int c = a.c((~(657196034 | i)) | 158306754, 712, (((~(startElapsedRealtime | (-138645953))) | (~(i | 795841986))) * (-712)) + ((((-795841987) | r6) * (-712)) - 318511529), 923107545);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4951;
                    Fpnative.valueOf = objArr;
                    return (FingerMatchSecLevel[]) values().clone();
                }
            }
            byte[] bArr = $$a;
            byte b2 = bArr[27];
            Object[] objArr3 = new Object[1];
            c((byte) 28, b2, b2, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c((byte) (bArr[25] + 1), bArr[77], bArr[32], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 923107545);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4951;
            Fpnative.valueOf = objArr;
            return (FingerMatchSecLevel[]) values().clone();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final String getShortform() {
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
                    int c = a.c((~((~identityHashCode) | 91121498)) | (-661585883), -964, (((~(91121498 | identityHashCode)) | (-590010779)) * (-964)) + 1017369575, -125337086);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4913;
                    Fpnative.valueOf = objArr;
                    return this.a;
                }
            }
            byte[] bArr = $$a;
            byte b2 = bArr[27];
            Object[] objArr3 = new Object[1];
            c((byte) 28, b2, b2, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c((byte) (bArr[25] + 1), bArr[77], bArr[32], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -125337086);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4913;
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
