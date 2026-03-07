package com.identy.g;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.d.e.PngjExceptionInternal;
import com.karumi.dexter.BuildConfig;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class PngjBadCrcException {
    private static  byte[] $$a = null;
    private static  int $$b = 0;
    private static  byte[] $$c = null;
    private static  byte[] $$d = null;
    private static  int $$e = 0;
    private static  int $$f = 0;
    private static int $10;
    private static int $11;
    private static int PngjExceptionInternal;
    private static boolean PngjInputException;
    private static int PngjOutputException;
    private static boolean PngjPrematureEnding;
    private static int PngjUnsupportedException;
    private static char[] values;
    public float PngjBadCrcException;
    public ArrayList PngjBadSignature;
    public ArrayList PngjException;
    private int valueOf;

    private static String $$g(int i, byte b, int i2) {
        int i3 = (i * 4) + 97;
        int i4 = i2 * 4;
        int i5 = b + 4;
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        int i7 = -1;
        if (bArr == null) {
            i3 += -i5;
            i5 = i5;
            bArr = bArr;
            i7 = -1;
        }
        while (true) {
            int i8 = i7 + 1;
            bArr2[i8] = (byte) i3;
            int i9 = i5 + 1;
            if (i8 == i6) {
                return new String(bArr2, 0);
            }
            byte[] bArr3 = bArr;
            i3 += -bArr[i9];
            i5 = i9;
            bArr = bArr3;
            i7 = i8;
        }
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        PngjExceptionInternal = 0;
        PngjOutputException = 1;
        values = new char[]{25166, 25147, 25153, 25151, 25148, 25158, 25211, 25136, 25168, 25142, 25137, 25154, 25146, 25184, 25145, 25152, 25144, 25149, 25183, 25198, 25139, 25169, 25157, 25138};
        PngjUnsupportedException = -2081201235;
        PngjPrematureEnding = true;
        PngjInputException = true;
    }

    public PngjBadCrcException(float f, List<Object[]> list, List<Object[]> list2, int i) {
        long j;
        long j2;
        char c;
        char c2;
        this.PngjException = new ArrayList();
        this.PngjBadSignature = new ArrayList();
        this.PngjBadCrcException = f;
        this.valueOf = i;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            long j3 = 0;
            long j4 = 0;
            for (Object[] objArr : list) {
                long longValue = ((Long) objArr[5]).longValue();
                j3 = j3 == 0 ? longValue : j3;
                if (this.valueOf != 0) {
                    c = 1;
                    c2 = 0;
                    if (Math.abs(j3 - longValue) <= this.valueOf) {
                    }
                } else {
                    c = 1;
                    c2 = 0;
                }
                if (j4 == 0 || Math.abs(j4 - longValue) > 250) {
                    arrayList.add(new PngjException(((Double) objArr[c2]).doubleValue(), ((Double) objArr[c]).doubleValue(), ((Double) objArr[2]).doubleValue(), longValue));
                    j4 = longValue;
                }
            }
        }
        this.PngjException = arrayList;
        ArrayList arrayList2 = new ArrayList();
        if (list2 != null) {
            long j5 = 0;
            long j6 = 0;
            for (Object[] objArr2 : list2) {
                long longValue2 = ((Long) objArr2[5]).longValue();
                j5 = j5 == 0 ? longValue2 : j5;
                if (this.valueOf != 0) {
                    j2 = j;
                    j = Math.abs(j5 - longValue2) > ((long) this.valueOf) ? j2 : 250L;
                } else {
                    j2 = j;
                }
                if (j6 == 0 || Math.abs(j6 - longValue2) > j2) {
                    arrayList2.add(new PngjBadSignature(((Float) objArr2[0]).floatValue(), ((Float) objArr2[1]).floatValue(), ((Float) objArr2[2]).floatValue(), longValue2));
                    j6 = longValue2;
                }
            }
        }
        this.PngjBadSignature = arrayList2;
    }

    private static void a(int[] iArr, int i, String str, String str2, Object[] objArr) {
        char[] cArr;
        char c;
        int i2;
        int length;
        char[] cArr2;
        int i3;
        String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        if (str != null) {
            $10 = ($11 + 27) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr3 = cArr;
        PngjExceptionInternal pngjExceptionInternal = new PngjExceptionInternal();
        char[] cArr4 = values;
        Class cls = Integer.TYPE;
        if (cArr4 != null) {
            int i4 = $11 + 1;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                length = cArr4.length;
                cArr2 = new char[length];
                i3 = 1;
            } else {
                length = cArr4.length;
                cArr2 = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr4[i3])};
                    Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(358189806);
                    if (PngjBadSignature == null) {
                        PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 27092), 37 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 118, -373889195, false, "b", new Class[]{cls});
                    }
                    cArr2[i3] = ((Character) ((Method) PngjBadSignature).invoke(null, objArr2)).charValue();
                    i3++;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();

                    if (cause == null) {

                        throw new RuntimeException(th);

                    }

                    throw new RuntimeException(cause);
                }
            }
            cArr4 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(PngjUnsupportedException)};
        Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1639226071);
        if (PngjBadSignature2 == null) {
            byte b = (byte) 1;
            c = 1;
            byte b2 = (byte) (-b);
            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (61713 - Color.alpha(0)), 34 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), (Process.myPid() >> 22) + 278, -1654917268, false, $$g(b, b2, (byte) (b2 + 1)), new Class[]{cls});
        } else {
            c = 1;
        }
        int intValue = ((Integer) ((Method) PngjBadSignature2).invoke(null, objArr3)).intValue();
        int i5 = -528960794;
        if (PngjInputException) {
            int length2 = bArr2.length;
            pngjExceptionInternal.PngjException = length2;
            char[] cArr5 = new char[length2];
            pngjExceptionInternal.values = 0;
            while (true) {
                int i6 = pngjExceptionInternal.values;
                int i7 = pngjExceptionInternal.PngjException;
                if (i6 >= i7) {
                    objArr[0] = new String(cArr5);
                    return;
                }
                $10 = ($11 + 89) % 128;
                cArr5[i6] = (char) (cArr4[bArr2[(i7 - 1) - i6] + i] - intValue);
                Object[] objArr4 = new Object[2];
                objArr4[c] = pngjExceptionInternal;
                objArr4[0] = pngjExceptionInternal;
                Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i5);
                if (PngjBadSignature3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 - 1);
                    i2 = i5;
                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) Color.green(0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 37, 548 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0'), 479715165, false, $$g(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                } else {
                    i2 = i5;
                }
                ((Method) PngjBadSignature3).invoke(null, objArr4);
                i5 = i2;
            }
        } else if (PngjPrematureEnding) {
            int length3 = cArr3.length;
            pngjExceptionInternal.PngjException = length3;
            char[] cArr6 = new char[length3];
            pngjExceptionInternal.values = 0;
            while (true) {
                int i8 = pngjExceptionInternal.values;
                int i9 = pngjExceptionInternal.PngjException;
                if (i8 >= i9) {
                    objArr[0] = new String(cArr6);
                    return;
                }
                cArr6[i8] = (char) (cArr4[cArr3[(i9 - 1) - i8] - i] - intValue);
                Object[] objArr5 = new Object[2];
                objArr5[c] = pngjExceptionInternal;
                objArr5[0] = pngjExceptionInternal;
                Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-528960794);
                if (PngjBadSignature4 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 - 1);
                    PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) Color.alpha(0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 37, TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 549, 479715165, false, $$g(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) PngjBadSignature4).invoke(null, objArr5);
            }
        } else {
            int length4 = iArr.length;
            pngjExceptionInternal.PngjException = length4;
            char[] cArr7 = new char[length4];
            pngjExceptionInternal.values = 0;
            $11 = ($10 + 11) % 128;
            while (true) {
                int i10 = pngjExceptionInternal.values;
                int i11 = pngjExceptionInternal.PngjException;
                if (i10 >= i11) {
                    objArr[0] = new String(cArr7);
                    return;
                } else {
                    cArr7[i10] = (char) (cArr4[iArr[(i11 - 1) - i10] - i] - intValue);
                    pngjExceptionInternal.values = i10 + 1;
                }
            }
        }
    }

    private static void b(int i, short s, short s2, Object[] objArr) {
        byte[] bArr = $$a;
        int i2 = (s * 38) + 80;
        int i3 = s2 + 4;
        byte[] bArr2 = new byte[19 - i];
        int i4 = 18 - i;
        int i5 = -1;
        if (bArr == null) {
            i3++;
            i2 = i2 + i4 + 5;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3++;
                i2 = i2 + bArr[i3] + 5;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, byte b2, int i, Object[] objArr) {
        int i2;
        byte[] bArr = $$d;
        int i3 = 99 - (i * 19);
        int i4 = 54 - (b2 * 51);
        int i5 = b * 33;
        byte[] bArr2 = new byte[i5 + 19];
        int i6 = i5 + 18;
        if (bArr == null) {
            int i7 = i4;
            byte[] bArr3 = bArr;
            int i8 = 0;
            int i9 = i6;
            int i10 = (i9 + i4) - 8;
            int i11 = i7;
            i3 = i10;
            i4 = i11;
            bArr = bArr3;
            i2 = i8;
            int i12 = i4 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i13 = i3;
            i7 = i12;
            i4 = bArr[i12];
            i8 = i2 + 1;
            bArr3 = bArr;
            i9 = i13;
            int i102 = (i9 + i4) - 8;
            int i112 = i7;
            i3 = i102;
            i4 = i112;
            bArr = bArr3;
            i2 = i8;
            int i122 = i4 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            int i1222 = i4 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{6, 29, 71, 91, 25, -12, -2, -45, 26, -2, -38, 42, -20, -35, 46, -26, -3, 6, -1, -16, 1, -6, -26, 6, 4, -21, 9, 25, -12, -2, -42, 46, -26, -3, 6, -1, -16, 1, -6, -26, 6, 4, -21, -27, 18};
        $$b = 246;
    }

    public static void init$1() {
        $$d = new byte[]{25, 31, -61, 78, 20, 6, -55, 67, 3, 9, 17, 14, 13, -67, 65, 6, 23, -32, -17, 40, 24, 20, 11, -5, -57, 52, 38, 1, 11, -32, 39, 11, -9, 30, 6, 15, -5, 27, 9, 5, -5, -57, 52, 38, 1, 11, -29, 59, -13, 10, 19, 12, -3, 14, 7, 38, 1, 11, -32, 39, 11, -25, 55, -7, -22, 59, -13, 10, 19, 12, -3, 14, 7};
        $$e = 154;
    }

    public static void init$2() {
        $$c = new byte[]{77, 125, 4, 95};
        $$f = 70;
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1602)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:298)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] values(int r38) {
        /*
            Method dump skipped, instructions count: 2964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.identy.g.PngjBadCrcException.values(int):java.lang.Object[]");
    }
}
