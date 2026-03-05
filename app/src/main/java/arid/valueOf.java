package arid;

import android.os.Process;
import com.identy.Fpnative;
import java.lang.reflect.Method;
import java.util.HashMap;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes.dex */
public enum valueOf {
    FILTER_NONE(0),
    FILTER_SUB(1),
    FILTER_UP(2),
    FILTER_AVERAGE(3),
    FILTER_PAETH(4),
    FILTER_DEFAULT(-1),
    FILTER_AGGRESSIVE(-2),
    FILTER_VERYAGGRESSIVE(-4),
    FILTER_ADAPTIVE_FULL(-4),
    FILTER_ADAPTIVE_MEDIUM(-3),
    FILTER_ADAPTIVE_FAST(-2),
    FILTER_SUPER_ADAPTIVE(-10),
    FILTER_PRESERVE(-40),
    FILTER_CYCLIC(-50),
    FILTER_UNKNOWN(-100);

    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final HashMap Attempt;
    public final int Action;

    static {
        init$0();
        Attempt = new HashMap();
        for (valueOf valueof : valuesCustom()) {
            Attempt.put(Integer.valueOf(valueof.Action), valueof);
        }
    }

    valueOf(int i) {
        this.Action = i;
    }

    public static valueOf[] PngjBadCrcException() {
        return new valueOf[]{FILTER_NONE, FILTER_SUB, FILTER_UP, FILTER_AVERAGE, FILTER_PAETH};
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, short s, Object[] objArr) {
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = 77 - b;
        int i5 = 118 - (s * 19);
        byte[] bArr2 = new byte[32 - i];
        int i6 = 31 - i;
        if (bArr == null) {
            i2 = i4;
            int i7 = i6;
            int i8 = 0;
            i4 = (i4 + i7) - 8;
            i3 = i8;
            bArr2[i3] = (byte) i4;
            i8 = i3 + 1;
            i2++;
            if (i3 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i7 = bArr[i2];
            i4 = (i4 + i7) - 8;
            i3 = i8;
            bArr2[i3] = (byte) i4;
            i8 = i3 + 1;
            i2++;
            if (i3 == i6) {
            }
        } else {
            i2 = i4;
            i4 = i5;
            i3 = 0;
            bArr2[i3] = (byte) i4;
            i8 = i3 + 1;
            i2++;
            if (i3 == i6) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{85, 38, 73, ByteCompanionObject.MAX_VALUE, 20, 6, -55, 67, 3, 9, 17, 14, 13, -67, 33, 54, -4, 3, 9, -15, 41, -32, 54, -4, 3, 9, -21, 37, 15, 12, -3, 21, 38, 1, 11, -32, 39, 11, -9, 30, 6, 15, -5, 27, 9, 5, -5, 20, 6, -55, 67, 3, 9, 17, 14, 13, -67, 65, -49, 42, 38, 1, 11, -32, 39, 11, -25, 55, -7, -22, 59, -13, 10, 19, 12, -3, 14, 7, -13, 19, 17, -8, 22};
        $$b = 223;
    }

    public static valueOf valueOfString(String str) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    int i = ~elapsedCpuTime;
                    int i2 = (((~(115639876 | i)) | 269707707) * (-1188)) + 574548757;
                    int i3 = (~(elapsedCpuTime | (-115639877))) | 269707707;
                    int i4 = ~(383249403 | i);
                    int c = defpackage.a.c((~(i | (-115639877))) | 2098180 | i4, 594, ((i3 | i4) * 594) + i2, -610406511);
                    int i5 = c ^ (c << 13);
                    int i6 = i5 ^ (i5 >>> 17);
                    ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
                    ((long[]) objArr[0])[0] = j + 4851;
                    Fpnative.valueOf = objArr;
                    return (valueOf) Enum.valueOf(valueOf.class, str);
                }
            }
            byte b = (byte) ($$b & 63);
            byte[] bArr = $$a;
            byte b2 = bArr[33];
            Object[] objArr3 = new Object[1];
            b(b, (byte) (b2 - 1), b2, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b3 = bArr[33];
            byte b4 = (byte) (b3 - 1);
            Object[] objArr4 = new Object[1];
            b(b4, (byte) (b4 | 26), (byte) (b3 - 1), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -610406511);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4851;
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
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int myPid = Process.myPid();
                    int i = ~myPid;
                    int c = defpackage.a.c((~(myPid | (-675398042))) | (~(i | (-176508762))), 333, (((~((-675398042) | i)) | (~(myPid | (-176508762)))) * 333) + 281765749, 623843718);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 5006;
                    Fpnative.valueOf = objArr;
                    return (valueOf[]) values().clone();
                }
            }
            int i4 = $$b;
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) (i4 & 362), bArr[8], bArr[33], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((byte) 46, (byte) (i4 & 48), (byte) (i4 & 2), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 623843718);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5006;
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

    public static boolean PngjBadCrcException(valueOf valueof) {
        int i;
        return valueof != null && (i = valueof.Action) >= 0 && i <= 4;
    }

    public static valueOf valueOf(int i) {
        return (valueOf) Attempt.get(Integer.valueOf(i));
    }

    public static boolean valueOf(valueOf valueof) {
        int i = valueof.Action;
        return i <= -2 && i >= -4;
    }
}
