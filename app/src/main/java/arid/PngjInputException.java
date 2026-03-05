package arid;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.karumi.dexter.BuildConfig;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class PngjInputException extends PngjException {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$h = null;
    private static final int $$i = 0;
    private static int $10;
    private static int $11;
    private static char PngjBadSignature;
    private static char PngjExceptionInternal;
    private static int PngjInputException;
    private static char PngjOutputException;
    private static int PngjUnsupportedException;
    private static char valueOf;
    private static long values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$j(int i, byte b, byte b2) {
        int i2;
        int i3 = (b2 * 3) + 4;
        int i4 = b * 4;
        int i5 = 114 - (i * 7);
        byte[] bArr = $$h;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            i5 = i6;
            byte[] bArr3 = bArr;
            int i7 = 0;
            int i8 = i3;
            i5 += i3;
            i3 = i8 + 1;
            bArr = bArr3;
            i2 = i7;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            byte b3 = bArr[i3];
            byte[] bArr4 = bArr;
            i8 = i3;
            i3 = b3;
            i7 = i2 + 1;
            bArr3 = bArr4;
            i5 += i3;
            i3 = i8 + 1;
            bArr = bArr3;
            i2 = i7;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        }
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        PngjUnsupportedException = 0;
        PngjInputException = 1;
        values = -6412473068118928390L;
        valueOf = (char) 8936;
        PngjBadSignature = (char) 55403;
        PngjOutputException = (char) 30354;
        PngjExceptionInternal = (char) 59142;
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1602)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:298)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] PngjBadSignature$52c725b(int r80, java.lang.Object r81) {
        /*
            Method dump skipped, instructions count: 15108
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: arid.PngjInputException.PngjBadSignature$52c725b(int, java.lang.Object):java.lang.Object[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(short s, byte b, short s2, Object[] objArr) {
        int i;
        byte[] bArr = $$d;
        int i2 = b + 97;
        int i3 = s2 + 4;
        byte[] bArr2 = new byte[3 - s];
        int i4 = 2 - s;
        if (bArr == null) {
            int i5 = i4;
            i = 0;
            i2 = (i2 + (-i5)) - 23;
            bArr2[i] = (byte) i2;
            i3++;
            if (i == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i++;
            i5 = bArr[i3];
            i2 = (i2 + (-i5)) - 23;
            bArr2[i] = (byte) i2;
            i3++;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            i3++;
            if (i == i4) {
            }
        }
    }

    private static void e(String str, int i, Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $11 = ($10 + 25) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        com.d.e.a aVar = new com.d.e.a();
        char[] values2 = com.d.e.a.values(values ^ 8332534422373704609L, cArr, i);
        aVar.PngjBadSignature = 4;
        while (true) {
            int i2 = aVar.PngjBadSignature;
            if (i2 >= values2.length) {
                objArr[0] = new String(values2, 4, values2.length - 4);
                return;
            }
            int i3 = i2 - 4;
            aVar.PngjBadCrcException = i3;
            try {
                Object[] objArr2 = {Long.valueOf(values2[i2] ^ values2[i2 % 4]), Long.valueOf(i3), Long.valueOf(values)};
                Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1668670198);
                if (PngjBadSignature2 == null) {
                    char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 29;
                    int axisFromString = (-1) - MotionEvent.axisFromString(BuildConfig.FLAVOR);
                    Class cls = Long.TYPE;
                    PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(keyRepeatTimeout, fadingEdgeLength, axisFromString, 1617260721, false, "o", new Class[]{cls, cls, cls});
                }
                values2[i2] = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {aVar, aVar};
                Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1405973094);
                if (PngjBadSignature3 == null) {
                    char capsMode = (char) (14830 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0));
                    int fadingEdgeLength2 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 28;
                    int combineMeasuredStates = 721 - View.combineMeasuredStates(0, 0);
                    byte b = (byte) ($$i & 1);
                    byte b2 = (byte) (b - 1);
                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(capsMode, fadingEdgeLength2, combineMeasuredStates, -1356718115, false, $$j(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) PngjBadSignature3).invoke(null, objArr3);
                $11 = ($10 + 5) % 128;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    private static void f(String str, int i, Object[] objArr) {
        $10 = ($11 + 81) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.d.e.PngjOutputException pngjOutputException = new com.d.e.PngjOutputException();
        char[] cArr = new char[charArray.length];
        int i2 = 0;
        pngjOutputException.values = 0;
        int i3 = 2;
        char[] cArr2 = new char[2];
        while (true) {
            int i4 = pngjOutputException.values;
            if (i4 >= charArray.length) {
                break;
            }
            cArr2[i2] = charArray[i4];
            cArr2[1] = charArray[i4 + 1];
            int i5 = 58224;
            int i6 = i2;
            while (i6 < 16) {
                $11 = ($10 + 105) % 128;
                char c = cArr2[1];
                char c2 = cArr2[i2];
                int i7 = i3;
                char[] cArr3 = cArr2;
                int i8 = (c2 + i5) ^ ((c2 << 4) + ((char) (PngjOutputException ^ (-4937072311772145044L))));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(PngjExceptionInternal);
                    objArr2[i7] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i2] = Integer.valueOf(c);
                    Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-222953304);
                    Class cls = Integer.TYPE;
                    if (PngjBadSignature2 == null) {
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) Color.red(i2), ((byte) KeyEvent.getModifierMetaStateMask()) + 36, Color.rgb(i2, i2, i2) + 16777371, 240741651, false, "n", new Class[]{cls, cls, cls, cls});
                    }
                    char charValue = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr2)).charValue();
                    cArr3[1] = charValue;
                    char c3 = cArr3[i2];
                    int i10 = i2;
                    int i11 = (charValue + i5) ^ ((charValue << 4) + ((char) (valueOf ^ (-4937072311772145044L))));
                    int i12 = charValue >>> 5;
                    Object[] objArr3 = new Object[4];
                    objArr3[3] = Integer.valueOf(PngjBadSignature);
                    objArr3[i7] = Integer.valueOf(i12);
                    objArr3[1] = Integer.valueOf(i11);
                    objArr3[i10] = Integer.valueOf(c3);
                    Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-222953304);
                    if (PngjBadSignature3 == null) {
                        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 35 - (TypedValue.complexToFloat(i10) > 0.0f ? 1 : (TypedValue.complexToFloat(i10) == 0.0f ? 0 : -1)), 154 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0'), 240741651, false, "n", new Class[]{cls, cls, cls, cls});
                    }
                    cArr3[i10] = ((Character) ((Method) PngjBadSignature3).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6++;
                    i3 = i7;
                    cArr2 = cArr3;
                    i2 = i10;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i13 = i2;
            int i14 = i3;
            char[] cArr4 = cArr2;
            int i15 = pngjOutputException.values;
            cArr[i15] = cArr4[i13];
            cArr[i15 + 1] = cArr4[1];
            Object[] objArr4 = new Object[i14];
            objArr4[1] = pngjOutputException;
            objArr4[i13] = pngjOutputException;
            Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(150653722);
            if (PngjBadSignature4 == null) {
                byte b = (byte) i13;
                byte b2 = b;
                PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (View.getDefaultSize(i13, i13) + 8056), View.MeasureSpec.getMode(i13) + 32, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 665, -199907679, false, $$j(b, b2, b2), new Class[]{Object.class, Object.class});
            }
            ((Method) PngjBadSignature4).invoke(null, objArr4);
            cArr2 = cArr4;
            i2 = 0;
            i3 = 2;
        }
        String str2 = new String(cArr, 0, i);
        int i16 = $10 + 107;
        $11 = i16 % 128;
        if (i16 % 2 == 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    public static void init$0() {
        $$d = new byte[]{14, 74, -24, 5, 29, -13, -28};
        $$e = 230;
    }

    public static void init$1() {
        $$h = new byte[]{50, -45, -122, 25};
        $$i = 239;
    }
}
