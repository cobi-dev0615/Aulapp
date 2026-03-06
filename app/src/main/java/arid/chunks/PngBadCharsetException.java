package arid.chunks;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.identy.getAsHighestSecurityLevelReached;
import com.karumi.dexter.BuildConfig;
import defpackage.a;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class PngBadCharsetException extends arid.PngjException {
    private static byte[] $$a = null;
    private static int $$b = 0;
    private static byte[] $$c = null;
    private static int $$d = 0;
    private static int $10;
    private static int $11;
    private static char[] PngjBadSignature;
    private static boolean PngjExceptionInternal;
    private static int PngjInputException;
    private static int PngjPrematureEnding;
    private static boolean PngjUnsupportedException;
    private static int valueOf;
    private static char[] values;

    public PngBadCharsetException() {
        super("");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$e(byte b, byte b2, short s) {
        int i;
        int i2;
        int i3 = 102 - s;
        byte[] bArr = $$c;
        int i4 = (b * 3) + 4;
        int i5 = (b2 * 3) + 1;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            byte[] bArr3 = bArr;
            i2 = 0;
            int i6 = i5;
            i4++;
            i3 = (-i3) + i6;
            bArr = bArr3;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i5) {
                return new String(bArr2, 0);
            }
            byte b3 = bArr[i4];
            byte[] bArr4 = bArr;
            i6 = i3;
            i3 = b3;
            bArr3 = bArr4;
            i4++;
            i3 = (-i3) + i6;
            bArr = bArr3;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i5) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i5) {
            }
        }
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        PngjInputException = 0;
        PngjPrematureEnding = 1;
        PngjBadSignature = new char[]{40100, 40189, 40191, 40191, 40164, 40154, 40159, 40176, 40189, 40191, 40185, 40109, 40189, 40179, 40188, 40177, 40186, 40103, 40179, 40186, 40191, 40183, 40176, 40157, 40154, 40164, 40191, 40188, 40179, 40181, 40191, 40102, 40188, 40186, 40187, 40164, 40161, 40180, 39979, 40021, 40021, 39976, 40142, 39976, 40018, 40023, 40020, 39978, 39978, 39977, 39978, 40017, 40021, 40021, 40018, 39984, 39991, 40018, 40101, 40176, 40188, 40184, 40185, 40189, 40176, 40190, 40164, 40165, 40190, 40184, 40099, 40164, 40165, 40186, 40164, 40191, 40191, 40191, 40176, 40188, 40184, 40185, 40189, 40176, 40108, 40188, 40179, 40166, 40167, 40191, 40185, 40077, 40152, 40184, 40186, 40190, 40186, 40166, 40123, 40191, 40164, 40186, 40186, 40183, 40177, 40185, 40189, 40179, 40178, 40176, 40178, 40189, 40165, 40167, 40167, 40190, 40189, 40167, 40102, 40176, 40182, 40189, 40167, 40167, 40060, 40046, 40046, 40040, 40047, 40060, 40047, 40046, 39968, 40045, 40056, 40341, 40036, 40047, 40036, 40033, 40079, 40155, 40186, 40190, 40188, 40190, 40176, 40182, 40189, 40167, 40111, 40166, 40165, 40166, 40190, 40190, 40191, 40176, 40181, 40189, 40191, 40067, 40154, 40191, 40177, 40156, 40154, 40189, 40184, 40167, 40162, 40162, 40133, 40109, 40133, 40158, 40184, 40133, 40133, 40184, 40188, 40190, 40191, 40165, 40162, 40135, 40158, 40189, 40190, 40190, 40164, 40190, 40176, 40158, 40133, 40162, 40141, 39976, 40018, 40018, 39991, 39989, 40023, 40022, 39983, 39951, 39991, 39978, 39982, 39983, 39944, 39991, 40017, 40102, 40185, 40134, 40157, 39936, 40383, 40346, 40325, 40354, 40354, 40359, 40376, 40381, 40346, 40325, 40382, 40099, 40191, 40177, 40156, 40132, 40164, 40189, 40189, 40189, 40185, 40134, 40102, 40178, 40191, 40186, 40179, 40185, 40186, 40183, 40189, 40186, 40185, 40096, 40191, 40191, 40186, 40133, 40132, 40160, 40184, 40156, 40132, 40160, 40190, 40181, 40182, 40183, 40189, 40186, 40186, 39967, 40324, 40325, 40332, 40320, 40320, 40333, 40035, 40034, 40328, 40328, 40034, 40034, 40322, 40321, 40323, 40347, 40338, 40348, 40349, 40350, 40326, 40333, 40100, 40182, 40189, 40185, 40153, 40156, 40190, 40190, 40182, 40157, 40123, 40154, 40191, 40177, 40185, 40135, 40153, 40067, 40154, 40191, 40177, 40156, 40132, 40166, 40160, 40134, 40096, 39957, 39946, 39984, 39955, 40188, 39966, 39993, 40109, 40167, 40165, 40165, 40166, 40186, 40154, 40158, 40189, 40188, 40184, 40133, 40157, 40189, 40164, 40165, 40155, 40101, 40175, 39958, 40190, 40177, 40168, 40107, 39988, 40017, 40017, 39988, 39949, 39983, 39988, 39988, 39983, 39971, 39981, 39982, 40020, 40017, 39990, 39946, 39978, 39976, 39981, 39969, 39977, 40067, 40157, 40176, 40185, 40134, 40128, 40173, 40164, 40188, 40186, 40187, 40139, 39981, 39979, 39979, 39951, 39989, 39982, 39983, 39978, 39946, 39937, 39974, 40021, 39979, 39971, 39970};
        values = new char[]{25337, 25329, 25342, 25094, 25336, 25339, 25333, 25338, 25332, 25136, 25330, 25335, 25093, 25334, 25343, 25091, 25328, 25095, 25323, 25137, 25341, 25151, 25092, 25089, 25320, 25141, 25321, 25128, 25322};
        valueOf = -2081201566;
        PngjUnsupportedException = true;
        PngjExceptionInternal = true;
    }

    public static Object[] PngjBadSignature$1eba2e16(int i, Object obj, int i2) {
        throw new UnsupportedOperationException("Method not decompiled: arid.chunks.PngBadCharsetException.PngjBadSignature$1eba2e16(int, Object, int)");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, short s, byte b2, Object[] objArr) {
        int i;
        int i2;
        int i3 = s + 1;
        int i4 = (b2 * 4) + 97;
        byte[] bArr = $$a;
        int i5 = 4 - (b * 3);
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            int i6 = i5;
            i4 = i3;
            i = 0;
            int i7 = i5;
            i4 = (i4 + i6) - 52;
            i2 = i7 + 1;
            bArr2[i] = (byte) i4;
            i++;
            if (i == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i6 = bArr[i2];
            i7 = i2;
            i4 = (i4 + i6) - 52;
            i2 = i7 + 1;
            bArr2[i] = (byte) i4;
            i++;
            if (i == i3) {
            }
        } else {
            i = 0;
            i2 = i5;
            bArr2[i] = (byte) i4;
            i++;
            if (i == i3) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d5, code lost:

        if (r27[r5] == 1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b4 A[Catch: all -> 0x01e6, TryCatch #0 {all -> 0x01e6, blocks: (B:10:0x003b, B:12:0x004c, B:13:0x0086, B:36:0x00db, B:38:0x00f4, B:39:0x012f, B:42:0x01a1, B:44:0x01b4, B:45:0x01dc, B:49:0x0142, B:51:0x015c, B:52:0x018d), top: B:9:0x003b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int[] iArr, String str, boolean z, Object[] objArr) {
        int i;
        float f;
        int i2;
        char c;
        Object PngjBadSignature2;
        byte[] bArr;
        int i3;
        String str2 = str;
        byte[] bArr2 = str2 != null ? str2.getBytes("ISO-8859-1") : null;
        if (str2 != null) {
            $10 = ($11 + 53) % 128;
            bArr2 = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr3 = bArr2;
        com.d.e.e1 e1Var = new com.d.e.e1();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = PngjBadSignature;
        Class cls = Integer.TYPE;
        if (cArr != null) {
            int length = cArr.length;
            f = 0.0f;
            char[] cArr2 = new char[length];
            i = 2;
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                    Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-259747866);
                    if (PngjBadSignature3 == null) {
                        char c2 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int keyCodeFromString = KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 35;
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1313;
                        bArr = bArr3;
                        int i9 = $$d;
                        byte b = (byte) (i9 - 2);
                        i3 = i8;
                        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c2, keyCodeFromString, fadingEdgeLength, 208396893, false, $$e(b, b, (byte) i9), new Class[]{cls});
                    } else {
                        bArr = bArr3;
                        i3 = i8;
                    }
                    cArr2[i3] = ((Character) ((Method) PngjBadSignature3).invoke(null, objArr2)).charValue();
                    i8 = i3 + 1;
                    bArr3 = bArr;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        } else {
            i = 2;
            f = 0.0f;
        }
        byte[] bArr4 = bArr3;
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr4 != null) {
            $11 = ($10 + 47) % 128;
            char[] cArr4 = new char[i5];
            e1Var.PngjBadSignature = 0;
            char c3 = 0;
            while (true) {
                int i10 = e1Var.PngjBadSignature;
                if (i10 >= i5) {
                    break;
                }
                int i11 = $11 + 29;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    if (bArr4[i10] == 0) {
                        c = 1;
                        char c4 = cArr3[i10];
                        Object[] objArr3 = new Object[i];
                        objArr3[c] = Integer.valueOf(c3);
                        objArr3[0] = Integer.valueOf(c4);
                        Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-655108508);
                        if (PngjBadSignature4 == null) {
                            byte b2 = (byte) ($$d - 2);
                            byte b3 = b2;
                            PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (((Process.getThreadPriority(0) + 20) >> 6) + 31882), 32 - ExpandableListView.getPackedPositionGroup(0L), 1250 - (ViewConfiguration.getJumpTapTimeout() >> 16), 605862879, false, $$e(b2, b3, (byte) (b3 + 3)), new Class[]{cls, cls});
                        }
                        cArr4[i10] = ((Character) ((Method) PngjBadSignature4).invoke(null, objArr3)).charValue();
                        c3 = cArr4[e1Var.PngjBadSignature];
                        Object[] objArr4 = {e1Var, e1Var};
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1060060353);
                        if (PngjBadSignature2 == null) {
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), Color.alpha(0) + 35, 155 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), -1010806406, false, "g", new Class[]{Object.class, Object.class});
                        }
                        ((Method) PngjBadSignature2).invoke(null, objArr4);
                        i = 2;
                    }
                    Object[] objArr5 = {Integer.valueOf(cArr3[i10]), Integer.valueOf(c3)};
                    Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(269554740);
                    if (PngjBadSignature5 == null) {
                        byte b4 = (byte) ($$d - 2);
                        byte b5 = b4;
                        PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)), View.resolveSize(0, 0) + 35, KeyEvent.normalizeMetaState(0) + 1598, -318867057, false, $$e(b4, b5, b5), new Class[]{cls, cls});
                    }
                    cArr4[i10] = ((Character) ((Method) PngjBadSignature5).invoke(null, objArr5)).charValue();
                    c3 = cArr4[e1Var.PngjBadSignature];
                    Object[] objArr42 = {e1Var, e1Var};
                    PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1060060353);
                    if (PngjBadSignature2 == null) {
                    }
                    ((Method) PngjBadSignature2).invoke(null, objArr42);
                    i = 2;
                } else {
                    c = 1;
                }
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            i2 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i12 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i12, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i12);
        } else {
            i2 = 0;
        }
        if (z) {
            char[] cArr6 = new char[i5];
            while (true) {
                e1Var.PngjBadSignature = i2;
                int i13 = e1Var.PngjBadSignature;
                if (i13 >= i5) {
                    break;
                }
                $10 = ($11 + 29) % 128;
                cArr6[i13] = cArr3[(i5 - i13) - 1];
                i2 = i13 + 1;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            e1Var.PngjBadSignature = 0;
            while (true) {
                int i14 = e1Var.PngjBadSignature;
                if (i14 >= i5) {
                    break;
                }
                $11 = ($10 + 33) % 128;
                cArr3[i14] = (char) (cArr3[i14] - iArr[2]);
                e1Var.PngjBadSignature = i14 + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private static void c(int[] iArr, String str, int i, String str2, Object[] objArr) {
        char[] cArr;
        int i2;
        char c;
        int length;
        char[] cArr2;
        int i3;
        String str3 = str2;
        byte[] bArr = str3 != null ? str3.getBytes("ISO-8859-1") : null;
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        if (str != null) {
            int i4 = $10 + 121;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                cArr = str.toCharArray();
                int i5 = 16 / 0;
            } else {
                cArr = str.toCharArray();
            }
        } else {
            cArr = str != null ? str.toCharArray() : null;
        }
        char[] cArr3 = cArr;
        com.d.e.PngjExceptionInternal pngjExceptionInternal = new com.d.e.PngjExceptionInternal();
        char[] cArr4 = values;
        Class cls = Integer.TYPE;
        if (cArr4 != null) {
            int i6 = $10 + 49;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                length = cArr4.length;
                cArr2 = new char[length];
                i3 = 1;
            } else {
                length = cArr4.length;
                cArr2 = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                $11 = ($10 + 95) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr4[i3])};
                    Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(358189806);
                    if (PngjBadSignature2 == null) {
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (27092 - Color.green(0)), Process.getGidForName(BuildConfig.FLAVOR) + 38, 118 - View.MeasureSpec.getMode(0), -373889195, false, "b", new Class[]{cls});
                    }
                    cArr2[i3] = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr2)).charValue();
                    i3++;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr4 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(valueOf)};
        Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1639226071);
        if (PngjBadSignature3 == null) {
            char green = (char) (61713 - Color.green(0));
            int i7 = 35 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            int lastIndexOf = TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 279;
            byte b = (byte) ($$d - 2);
            c = 1;
            byte b2 = b;
            i2 = 2;
            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(green, i7, lastIndexOf, -1654917268, false, $$e(b, b2, (byte) (b2 + 1)), new Class[]{cls});
        } else {
            i2 = 2;
            c = 1;
        }
        int intValue = ((Integer) ((Method) PngjBadSignature3).invoke(null, objArr3)).intValue();
        int i8 = -528960794;
        if (PngjExceptionInternal) {
            int i9 = $10;
            int i10 = i9 + 25;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            int length2 = bArr2.length;
            pngjExceptionInternal.PngjException = length2;
            char[] cArr5 = new char[length2];
            pngjExceptionInternal.values = 0;
            $11 = (i9 + 35) % 128;
            while (true) {
                int i12 = pngjExceptionInternal.values;
                int i13 = pngjExceptionInternal.PngjException;
                if (i12 >= i13) {
                    objArr[0] = new String(cArr5);
                    return;
                }
                cArr5[i12] = (char) (cArr4[bArr2[(i13 - 1) - i12] + i] - intValue);
                Object[] objArr4 = new Object[i2];
                objArr4[c] = pngjExceptionInternal;
                objArr4[0] = pngjExceptionInternal;
                Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-528960794);
                if (PngjBadSignature4 == null) {
                    char mode = (char) View.MeasureSpec.getMode(0);
                    int bitsPerPixel = 36 - ImageFormat.getBitsPerPixel(0);
                    int alpha = 549 - Color.alpha(0);
                    byte b3 = (byte) ($$d - 2);
                    byte b4 = b3;
                    PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(mode, bitsPerPixel, alpha, 479715165, false, $$e(b3, b4, (byte) (b4 + 5)), new Class[]{Object.class, Object.class});
                }
                ((Method) PngjBadSignature4).invoke(null, objArr4);
                i2 = 2;
            }
        } else if (PngjUnsupportedException) {
            int length3 = cArr3.length;
            pngjExceptionInternal.PngjException = length3;
            char[] cArr6 = new char[length3];
            pngjExceptionInternal.values = 0;
            while (true) {
                int i14 = pngjExceptionInternal.values;
                int i15 = pngjExceptionInternal.PngjException;
                if (i14 >= i15) {
                    objArr[0] = new String(cArr6);
                    return;
                }
                cArr6[i14] = (char) (cArr4[cArr3[(i15 - 1) - i14] - i] - intValue);
                Object[] objArr5 = new Object[2];
                objArr5[c] = pngjExceptionInternal;
                objArr5[0] = pngjExceptionInternal;
                Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i8);
                if (PngjBadSignature5 == null) {
                    byte b5 = (byte) ($$d - 2);
                    byte b6 = b5;
                    PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 37, 549 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 479715165, false, $$e(b5, b6, (byte) (b6 + 5)), new Class[]{Object.class, Object.class});
                }
                ((Method) PngjBadSignature5).invoke(null, objArr5);
                i8 = -528960794;
            }
        } else {
            int length4 = iArr.length;
            pngjExceptionInternal.PngjException = length4;
            char[] cArr7 = new char[length4];
            pngjExceptionInternal.values = 0;
            while (true) {
                int i16 = pngjExceptionInternal.values;
                int i17 = pngjExceptionInternal.PngjException;
                if (i16 >= i17) {
                    objArr[0] = new String(cArr7);
                    return;
                } else {
                    cArr7[i16] = (char) (cArr4[iArr[(i17 - 1) - i16] - i] - intValue);
                    pngjExceptionInternal.values = i16 + 1;
                }
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{58, 76, -101, 43, 0};
        $$b = 70;
    }

    public static void init$1() {
        $$c = new byte[]{47, 36, -120, -67};
        $$d = 2;
    }
}
