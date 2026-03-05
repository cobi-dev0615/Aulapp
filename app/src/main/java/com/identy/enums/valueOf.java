package com.identy.enums;

import android.os.Process;
import com.d.e.a.values;
import com.identy.Fpnative;
import defpackage.a;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public enum valueOf {
    AWARE("aw", 4.0d),
    BOZORTH("bz", 40.0d),
    INNOVATIRCS("in", 60.0d),
    NEURO("ve", 98.0d),
    IDENTY("idty", 10.0d);

    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private String PngjExceptionInternal;
    private double PngjOutputException;

    static {
        init$0();
    }

    valueOf(String str, double d) {
        this.PngjExceptionInternal = str;
        this.PngjOutputException = d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Type inference failed for: r8v8, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, byte b2, byte b3, Object[] objArr) {
        int i;
        byte b4;
        int i2;
        ?? r6 = 93 - b;
        byte[] bArr = $$a;
        ?? r8 = (b3 * 19) + 80;
        byte[] bArr2 = new byte[b2 + 16];
        int i3 = b2 + 15;
        if (bArr == null) {
            byte b5 = r8;
            i2 = 0;
            byte b6 = r6;
            int i4 = r6;
            ?? r82 = (b6 + b5) - 13;
            i = i4 + 1;
            b4 = r82;
            bArr2[i2] = b4;
            if (i2 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2++;
            b5 = bArr[i];
            int i5 = i;
            b6 = b4;
            i4 = i5;
            ?? r822 = (b6 + b5) - 13;
            i = i4 + 1;
            b4 = r822;
            bArr2[i2] = b4;
            if (i2 == i3) {
            }
        } else {
            i = r6;
            b4 = r8;
            i2 = 0;
            bArr2[i2] = b4;
            if (i2 == i3) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{34, -96, 112, -1, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 36, 54, 17, 10, 10, 13, -43, 31, 8, 47, 30, 2, 26, 0, 24, 18, -72, 57, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 38, 59, 1, 8, 14, -10, 46, -27, 59, 1, 8, 14, -16, 42, 20, 17, 2, 26, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0};
        $$b = 17;
    }

    public static valueOf valueOf(String str) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = a.c((~(((int) Process.getElapsedCpuTime()) | 998563154)) | 499673874, 529, (((~((~r0) | 998563154)) | 71836160) * 529) - 1876653424, 35076901);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4911;
                    Fpnative.valueOf = objArr;
                    return (valueOf) Enum.valueOf(valueOf.class, str);
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a((byte) 28, bArr[19], bArr[77], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr[27];
            byte b2 = b;
            Object[] objArr4 = new Object[1];
            a(b, b2, b2, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 35076901);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4911;
            Fpnative.valueOf = objArr;
            return (valueOf) Enum.valueOf(valueOf.class, str);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static valueOf[] valuesCustom() {
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
                    int i = ~((-29364865) | myUid);
                    int c = a.c((~(myUid | (-137382174))) | (~((~myUid) | (-332142243))) | 302777378, 497, ((i | (~(r6 | (-137382174)))) * 497) - 926510992, 2107420654);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4903;
                    Fpnative.valueOf = objArr;
                    return (valueOf[]) values().clone();
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a((byte) ($$b | 72), (byte) 28, bArr[77], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(bArr[81], (byte) (bArr[25] + 1), bArr[27], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 2107420654);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4903;
            Fpnative.valueOf = objArr;
            return (valueOf[]) values().clone();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
