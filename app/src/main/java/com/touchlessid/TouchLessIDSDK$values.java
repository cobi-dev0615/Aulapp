package com.touchlessid;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.d.e.PngjExceptionInternal;
import com.d.e.a.PngjBadCrcException;
import com.d.e.e1;
import com.identy.IdentyResponseListener;
import defpackage.a;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;


/* loaded from: classes2.dex */
public abstract class TouchLessIDSDK$values implements IdentyResponseListener {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10;
    private static int $11;
    private static int PngjBadCrcException;
    private static boolean PngjBadSignature;
    private static boolean PngjException;
    private static char[] PngjInputException;
    private static int PngjOutputException;
    private static int PngjUnsupportedException;
    private static char[] values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$e(byte b, int i, byte b2) {
        int i2;
        byte[] bArr = $$c;
        int i3 = b2 * 2;
        int i4 = 102 - i;
        int i5 = 4 - (b * 3);
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        if (bArr == null) {
            int i7 = i5;
            i4 = i6;
            int i8 = 0;
            i5++;
            i4 += i7;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i5];
            i5++;
            i4 += i7;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
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
        PngjOutputException = 1;
        values = new char[]{25562, 25575, 25382, 25568, 25577, 25580, 25567, 25581, 25574, 25579, 25565, 25583, 25572, 25582, 25569, 25563, 25560, 25564, 25553, 25573, 25383, 25571, 25381, 25578, 25591, 25566, 25552, 25587, 25368, 25361, 25589, 25379};
        PngjBadCrcException = -2081201336;
        PngjException = true;
        PngjBadSignature = true;
        PngjInputException = new char[]{40109, 40165, 40155, 40154, 40164, 40166, 40191, 40191, 40167, 40160, 40191, 40182, 40183, 40185, 40165, 40179, 40179, 40153, 40133, 40191, 40184, 40184, 40189, 40152, 39951, 39950, 39936, 39939, 39950, 39989, 39946, 39938, 39939, 40168, 39957, 39991, 40076, 40160, 40056, 40033, 40044, 40036, 40059, 40059, 40148, 40168, 40138, 40136, 40168, 40175, 40098, 40185, 40191, 40191, 40190, 40191, 40166, 40186, 40186, 40167, 40133, 40132, 40167, 40190, 40189, 40167, 40098, 40185, 40191, 40185, 40190, 40176, 40177, 40157, 40132, 40190, 40137, 39976, 39983, 39968, 39969, 39968, 39974, 39971, 40108, 40160, 40187, 40187, 40187, 40188, 40184, 40164, 40165, 40185, 40188, 40186, 40160, 40161, 40150, 39964, 39955, 39955, 39965, 39957, 40171, 40132, 39947, 39951, 39939, 39951, 39949, 40173, 40109, 40167, 40110, 40160, 40054, 40001, 40062, 40013, 40048, 40013, 40010, 40005, 40055, 40055, 40049, 40048, 40005, 40048, 40055, 39945, 40110, 40186, 40186, 40190, 40188, 40190, 40176, 40182, 40189, 40049, 40051, 39997, 40015, 40051, 40000, 40055, 40012, 40002, 40000, 40178, 40055, 40342, 40350, 40348, 40338, 40341, 40046, 40044, 40043, 40349, 39952, 40345, 40351, 40338, 40336, 40040, 40043, 40338, 40337, 40337, 40345, 40099, 40190, 40190, 40191, 40176, 40183, 40178, 40191, 40188, 40181, 40189, 40191, 40164, 40166, 40165, 40104, 40186, 40178, 40186, 40164, 40161, 40163, 40162, 40173, 40160, 40166, 40185, 40184, 40172, 39969, 39968, 39982, 39968, 40164, 40164, 39995, 39998, 39991, 40164, 39994, 39986, 40136, 39995, 39986, 39967, 40098, 40189, 40184, 40167, 40162, 40162, 40133, 40141, 39995, 39997, 39960, 39942, 39993, 39972, 39971, 39982, 39982, 39937, 39957, 40338, 40063, 40058, 40339, 40342, 40348, 40063, 40058, 40327, 40327, 40324, 40137, 40001, 40035, 40034, 40109, 40164, 40154, 40156, 40191, 40187, 40190, 40188, 40157, 40159, 40191, 40165, 40167, 40162, 40057, 40057, 40060, 40054, 40053, 40052, 40061, 40039, 40027, 40019, 40063, 40039, 40027, 40004, 40057, 40062, 40062, 40099, 40187, 40164, 40132, 40132, 40162, 40162, 40132, 40133, 40167, 40186, 40186, 40166, 40191, 40190, 40165, 40167, 40184, 40176, 40183, 40182, 40180, 40189, 39960, 40374, 40374, 40340, 40337, 40369, 40373, 40334, 40330, 40337, 40340, 40329, 40375, 40338, 40051, 40341, 40079, 40130, 40167, 40185, 40166, 40141, 40109, 40162, 40162, 40167, 40184, 40189, 40154, 40133, 40191, 40157, 40135, 40185, 40177, 40191, 40154, 40123, 40067, 40133, 40162, 40162, 40167, 40184, 40189, 40154, 40134, 40160, 40166, 40132, 40135, 40186, 40157, 40153, 40189, 40177, 40176, 40156, 40155, 40164, 40187, 40165, 40133, 40187, 40341, 40368, 40342, 40044, 40321, 40335, 40042, 40348, 40347, 40349, 40339, 40029, 40345, 40346, 40067, 40128, 40173, 40164, 40188, 40186, 40187, 40153, 40157, 40176, 40185, 40102, 40182, 40183, 40191, 40185, 40138, 40149, 40158, 40190, 40179, 40178, 40153, 40147, 40191, 40191, 40177};
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, int i, int i2, Object[] objArr) {
        int i3;
        byte[] bArr = $$a;
        int i4 = 3 - (i * 3);
        int i5 = 101 - (i2 * 4);
        byte[] bArr2 = new byte[2 - b];
        int i6 = 1 - b;
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i7 = 0;
            int i8 = i5;
            int i9 = i4;
            int i10 = (i8 + (-i4)) - 52;
            int i11 = i9;
            i5 = i10;
            i4 = i11;
            bArr = bArr3;
            i3 = i7;
            bArr2[i3] = (byte) i5;
            if (i3 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i12 = i4 + 1;
            int i13 = i5;
            i9 = i12;
            i4 = bArr[i12];
            i7 = i3 + 1;
            bArr3 = bArr;
            i8 = i13;
            int i102 = (i8 + (-i4)) - 52;
            int i112 = i9;
            i5 = i102;
            i4 = i112;
            bArr = bArr3;
            i3 = i7;
            bArr2[i3] = (byte) i5;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i5;
            if (i3 == i6) {
            }
        }
    }

    private static void b(int[] iArr, int i, String str, String str2, Object[] objArr) {
        char[] cArr;
        int i2;
        int i3;
        char[] cArr2;
        String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        if (str != null) {
            int i4 = $10 + 29;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                str.toCharArray();
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr3 = cArr;
        PngjExceptionInternal pngjExceptionInternal = new PngjExceptionInternal();
        char[] cArr4 = values;
        Class cls = Integer.TYPE;
        if (cArr4 != null) {
            int length = cArr4.length;
            char[] cArr5 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr4[i5])};
                    Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(358189806);
                    if (PngjBadSignature2 == null) {
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (27093 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 37 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 119, -373889195, false, "b", new Class[]{cls});
                    }
                    cArr5[i5] = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr2)).charValue();
                    i5++;
                    $11 = ($10 + 79) % 128;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();

                    if (cause == null) {

                        throw new RuntimeException(th);

                    }

                    throw new RuntimeException(cause);
                }
            }
            cArr4 = cArr5;
        }
        Object[] objArr3 = {Integer.valueOf(PngjBadCrcException)};
        Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1639226071);
        if (PngjBadSignature3 == null) {
            byte b = (byte) 0;
            byte b2 = (byte) (b + 1);
            i2 = 2;
            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (KeyEvent.getDeadChar(0, 0) + 61713), (ViewConfiguration.getEdgeSlop() >> 16) + 34, Process.getGidForName("") + 279, -1654917268, false, $$e(b, b2, (byte) (b2 - 1)), new Class[]{cls});
        } else {
            i2 = 2;
        }
        int intValue = ((Integer) ((Method) PngjBadSignature3).invoke(null, objArr3)).intValue();
        int i6 = -528960794;
        if (PngjBadSignature) {
            int i7 = $11 + 23;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                int length2 = bArr2.length;
                pngjExceptionInternal.PngjException = length2;
                cArr2 = new char[length2];
                pngjExceptionInternal.values = 1;
            } else {
                int length3 = bArr2.length;
                pngjExceptionInternal.PngjException = length3;
                cArr2 = new char[length3];
                pngjExceptionInternal.values = 0;
            }
            while (true) {
                int i8 = pngjExceptionInternal.values;
                int i9 = pngjExceptionInternal.PngjException;
                if (i8 >= i9) {
                    objArr[0] = new String(cArr2);
                    return;
                }
                cArr2[i8] = (char) (cArr4[bArr2[(i9 - 1) - i8] + i] - intValue);
                Object[] objArr4 = new Object[i2];
                objArr4[1] = pngjExceptionInternal;
                objArr4[0] = pngjExceptionInternal;
                Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-528960794);
                if (PngjBadSignature4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 + 5);
                    PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ImageFormat.getBitsPerPixel(0) + 1), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 36, 549 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 479715165, false, $$e(b3, b4, (byte) (b4 - 5)), new Class[]{Object.class, Object.class});
                }
                ((Method) PngjBadSignature4).invoke(null, objArr4);
                i2 = 2;
            }
        } else {
            if (!PngjException) {
                int length4 = iArr.length;
                pngjExceptionInternal.PngjException = length4;
                char[] cArr6 = new char[length4];
                pngjExceptionInternal.values = 0;
                while (true) {
                    int i10 = pngjExceptionInternal.values;
                    int i11 = pngjExceptionInternal.PngjException;
                    if (i10 >= i11) {
                        break;
                    }
                    cArr6[i10] = (char) (cArr4[iArr[(i11 - 1) - i10] - i] - intValue);
                    pngjExceptionInternal.values = i10 + 1;
                }
                String str4 = new String(cArr6);
                int i12 = $11 + 37;
                $10 = i12 % 128;
                if (i12 % 2 == 0) {
                    objArr[0] = str4;
                    return;
                } else {
                    int i13 = 29 / 0;
                    objArr[0] = str4;
                    return;
                }
            }
            int i14 = $10 + 67;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            int length5 = cArr3.length;
            pngjExceptionInternal.PngjException = length5;
            char[] cArr7 = new char[length5];
            pngjExceptionInternal.values = 0;
            while (true) {
                int i16 = pngjExceptionInternal.values;
                int i17 = pngjExceptionInternal.PngjException;
                if (i16 >= i17) {
                    objArr[0] = new String(cArr7);
                    return;
                }
                int i18 = $11 + 87;
                $10 = i18 % 128;
                if (i18 % 2 != 0) {
                    cArr7[i16] = (char) (cArr4[cArr3[0] >>> i] % intValue);
                    Object[] objArr5 = {pngjExceptionInternal, pngjExceptionInternal};
                    Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i6);
                    if (PngjBadSignature5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 + 5);
                        i3 = i6;
                        PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) TextUtils.indexOf("", "", 0), 37 - TextUtils.getOffsetAfter("", 0), 549 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 479715165, false, $$e(b5, b6, (byte) (b6 - 5)), new Class[]{Object.class, Object.class});
                    } else {
                        i3 = i6;
                    }
                    ((Method) PngjBadSignature5).invoke(null, objArr5);
                } else {
                    i3 = i6;
                    cArr7[i16] = (char) (cArr4[cArr3[(i17 - 1) - i16] - i] - intValue);
                    Object[] objArr6 = {pngjExceptionInternal, pngjExceptionInternal};
                    Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                    if (PngjBadSignature6 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 + 5);
                        PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) View.MeasureSpec.getMode(0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 36, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 548, 479715165, false, $$e(b7, b8, (byte) (b8 - 5)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) PngjBadSignature6).invoke(null, objArr6);
                }
                i6 = i3;
            }
        }
    }

    private static void c(String str, boolean z, int[] iArr, Object[] objArr) {
        byte[] bArr;
        byte b;
        long j;
        int i;
        int i2;
        byte[] bArr2;
        int i3;
        String str2 = str;
        int i4 = $11 + 55;
        $10 = i4 % 128;
        byte[] bArr3 = str2;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (str2 != null) {
            bArr3 = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr4 = bArr3;
        e1 e1Var = new e1();
        int i5 = 0;
        int i6 = iArr[0];
        byte b2 = 1;
        int i7 = iArr[1];
        int i8 = iArr[2];
        int i9 = iArr[3];
        char[] cArr = PngjInputException;
        Class cls = Integer.TYPE;
        if (cArr != null) {
            j = 0;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i10 = 0;
            while (i10 < length) {
                try {
                    byte b3 = b2;
                    Object[] objArr2 = {Integer.valueOf(cArr[i10])};
                    Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-259747866);
                    if (PngjBadSignature2 == null) {
                        bArr2 = bArr4;
                        i3 = i10;
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 2);
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), TextUtils.getOffsetBefore("", i5) + 35, ExpandableListView.getPackedPositionType(0L) + 1313, 208396893, false, $$e(b4, b5, (byte) (b5 - 2)), new Class[]{cls});
                    } else {
                        bArr2 = bArr4;
                        i3 = i10;
                    }
                    cArr2[i3] = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr2)).charValue();
                    i10 = i3 + 1;
                    b2 = b3;
                    bArr4 = bArr2;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();

                    if (cause == null) {

                        throw new RuntimeException(th);

                    }

                    throw new RuntimeException(cause);
                }
            }
            bArr = bArr4;
            b = b2;
            $10 = ($11 + 77) % 128;
            cArr = cArr2;
        } else {
            bArr = bArr4;
            b = 1;
            j = 0;
        }
        char[] cArr3 = new char[i7];
        System.arraycopy(cArr, i6, cArr3, 0, i7);
        if (bArr != null) {
            char[] cArr4 = new char[i7];
            e1Var.PngjBadSignature = 0;
            char c = 0;
            while (true) {
                int i11 = e1Var.PngjBadSignature;
                if (i11 >= i7) {
                    break;
                }
                byte b6 = b;
                if (bArr[i11] == b6) {
                    char c2 = cArr3[i11];
                    Object[] objArr3 = new Object[2];
                    objArr3[b6] = Integer.valueOf(c);
                    objArr3[0] = Integer.valueOf(c2);
                    Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-655108508);
                    if (PngjBadSignature3 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 + 3);
                        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (31881 - ImageFormat.getBitsPerPixel(0)), View.combineMeasuredStates(0, 0) + 32, TextUtils.indexOf("", "", 0) + 1250, 605862879, false, $$e(b7, b8, (byte) (b8 - 3)), new Class[]{cls, cls});
                    }
                    cArr4[i11] = ((Character) ((Method) PngjBadSignature3).invoke(null, objArr3)).charValue();
                } else {
                    Object[] objArr4 = {Integer.valueOf(cArr3[i11]), Integer.valueOf(c)};
                    Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(269554740);
                    if (PngjBadSignature4 == null) {
                        byte b9 = (byte) 0;
                        byte b10 = b9;
                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) - 1), Color.green(0) + 35, (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 1598, -318867057, false, $$e(b9, b10, b10), new Class[]{cls, cls});
                    }
                    cArr4[i11] = ((Character) ((Method) PngjBadSignature4).invoke(null, objArr4)).charValue();
                }
                c = cArr4[e1Var.PngjBadSignature];
                Object[] objArr5 = {e1Var, e1Var};
                Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1060060353);
                if (PngjBadSignature5 == null) {
                    PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 35, 155 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -1010806406, false, "g", new Class[]{Object.class, Object.class});
                }
                ((Method) PngjBadSignature5).invoke(null, objArr5);
                b = 1;
            }
            cArr3 = cArr4;
        }
        if (i9 > 0) {
            char[] cArr5 = new char[i7];
            i = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i7);
            int i12 = i7 - i9;
            System.arraycopy(cArr5, 0, cArr3, i12, i9);
            System.arraycopy(cArr5, i9, cArr3, 0, i12);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i7];
            e1Var.PngjBadSignature = i;
            while (true) {
                int i13 = e1Var.PngjBadSignature;
                if (i13 >= i7) {
                    break;
                }
                cArr6[i13] = cArr3[(i7 - i13) - 1];
                e1Var.PngjBadSignature = i13 + 1;
                $11 = ($10 + 119) % 128;
            }
            cArr3 = cArr6;
        }
        if (i8 > 0) {
            $10 = ($11 + 41) % 128;
            loop3: while (true) {
                e1Var.PngjBadSignature = 0;
                while (true) {
                    i2 = e1Var.PngjBadSignature;
                    if (i2 >= i7) {
                        break loop3;
                    }
                    int i14 = $11 + 63;
                    $10 = i14 % 128;
                    if (i14 % 2 != 0) {
                        break;
                    }
                    cArr3[i2] = (char) (cArr3[i2] - iArr[2]);
                    e1Var.PngjBadSignature = i2 + 1;
                }
                cArr3[i2] = (char) (cArr3[i2] * iArr[3]);
            }
        }
        objArr[0] = new String(cArr3);
    }

    public static void init$0() {
        $$a = new byte[]{50, -37, 84, 124, 0};
        $$b = 222;
    }

    public static void init$1() {
        $$c = new byte[]{12, -78, -49, 23};
        $$d = 207;
    }

    /* JADX WARN: Code restructure failed: missing block: B:206:0x1d8e, code lost:
    
        if (r0 == false) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x25f7, code lost:
    
        r0 = org.camera.preview.PngjBadCrcException.onErrorResponse.PngjBadCrcException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x25fb, code lost:
    
        r8 = r5 * (-301);
        r11 = (303 ^ r8) + ((r8 & 303) << 1);
        r8 = ~r0;
        r8 = ~(((r8 & (-2)) | ((-2) ^ r8)) | r5);
        r9 = (r5 ^ 1) | (r5 & 1);
        r9 = ~((r9 & r0) | (r9 ^ r0));
        r11 = (r11 - (~(((r8 & r9) | (r8 ^ r9)) * (-302)))) - 1;
        r8 = (-2) | r5;
        r8 = ((~((r8 & r0) | (r8 ^ r0))) * (-604)) + r11;
        r9 = ~r5;
        r9 = ~((r9 & 1) | (r9 ^ 1));
        r0 = ~((r0 & r5) | (r5 ^ r0));
        r0 = (((r0 & r9) | (r9 ^ r0)) * 302) + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x2642, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x2665, code lost:
    
        if (r7 == null) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x067b, code lost:
    
        if (((r0 & r3) | (r0 ^ r3)) != 477111747) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x099f, code lost:
    
        if (android.os.Build.VERSION.SDK_INT <= 33) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x2503, code lost:
    
        if (r7 == null) goto L384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x09a1, code lost:
    
        r0 = android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16;
        r3 = (r0 * (-501)) + 63881;
        r4 = ~(((-128) ^ r74) | ((-128) & r74));
        r5 = ~((r0 ^ 127) | (r0 & 127));
        r4 = -(-(((r4 & r5) | (r4 ^ r5)) * (-502)));
        r5 = ((r3 | r4) << 1) - (r3 ^ r4);
        r3 = ~r74;
        r5 = (r5 - (~((~((((-128) & r3) | ((-128) ^ r3)) | r0)) * (-502)))) - 1;
        r0 = ~r0;
        r0 = ~((r0 & r74) | (r0 ^ r74));
        r0 = -(-((((-128) & r0) | ((-128) ^ r0)) * 502));
        r3 = (r5 & r0) + (r0 | r5);
        r0 = new java.lang.Object[1];
        b(null, r3, null, "\u008a\u0081\u0083\u0088\u008d\u0098\u0085\u008c\u008c\u008b\u0098\u0088\u0086\u0097\u0086\u0096\u008d\u008d\u0095\u0092\u008f\u0089\u008f\u0095\u008a\u0092\u0088\u0095", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x09fc, code lost:
    
        r0 = new java.lang.Object[]{(java.lang.String) r0[0]};
        r3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1666380462);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0a07, code lost:
    
        if (r3 != null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0a09, code lost:
    
        r3 = (char) android.widget.ExpandableListView.getPackedPositionType(0);
        r47 = (android.view.ViewConfiguration.getTouchSlop() >> 8) + 28;
        r4 = android.text.TextUtils.getOffsetBefore(com.karumi.dexter."", 0) + 1447;
        r5 = com.touchlessid.TouchLessIDSDK$values.$$a[4];
        r7 = r5;
        r6 = new java.lang.Object[1];
        a(r5, r7, r7, r6);
        r3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(r3, r47, r4, -1614962923, false, (java.lang.String) r6[0], new java.lang.Class[]{r12});
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0a44, code lost:
    
        r3 = ((java.lang.Long) ((java.lang.reflect.Method) r3).invoke(null, r0)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0a51, code lost:
    
        r6 = -1163625004;
        r3 = ((-219) * r3) + (221 * r6);
        r13 = 220;
        r43 = ((r6 ^ r8) | (r3 ^ r8)) ^ r8;
        r3 = r74;
        r48 = r3 ^ r8;
        r13 = ((r13 * ((r6 | r3) | r3)) + (((-440) * (((r48 | r3) ^ r8) | r6)) + (((r43 | (((r48 | r6) | r3) ^ r8)) * r13) + r3))) + 1634113321;
        r3 = (int) android.os.Process.getElapsedCpuTime();
        r4 = ~r3;
        r5 = (((((~(1049262792 | r4)) | (-2144042957)) | (~(1808478092 | r4))) | (~((-713697929) | r3))) * (-84)) + 1905160562;
        r3 = (~(r3 | 1808478092)) | (-1049262793);
        r4 = ~(r4 | (-1808478093));
        r0 = ((int) (r13 >> 32)) & (((r4 | 713697928) * 84) + (((r3 | r4) * (-84)) + r5));
        r4 = (int) android.os.SystemClock.uptimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0afc, code lost:
    
        if ((r0 | (((int) r13) & ((((~(r4 | (-1146093637))) | 268522753) * 235) + ((((~((-1867655885) | r4)) | 990085001) * (-470)) + ((((~((~r4) | (-1867655885))) | 990085001) * (-235)) + 858724639))))) != 1) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0afe, code lost:
    
        com.touchlessid.TouchLessIDSDK$values.PngjUnsupportedException = (com.touchlessid.TouchLessIDSDK$values.PngjOutputException + 97) % 128;
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x1263, code lost:
    
        if (((((int) r5) & ((((~(r6 | (-95458755))) | r9) * 338) + ((((33630245 | r9) | (~((-129089000) | r6))) * (-338)) + 1339861807))) | r8) == 477111747) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0b8f, code lost:
    
        if (r0 == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x0b94, code lost:
    
        r0 = '7';
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x0b09, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x0b0c, code lost:
    
        r3 = new java.lang.Object[1];
        c("\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001", true, new int[]{23, 13, 51, 0}, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x0b23, code lost:
    
        r0 = new java.lang.Object[]{(java.lang.String) r3[0]};
        r3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x0b2b, code lost:
    
        if (r3 != null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x0b2d, code lost:
    
        r3 = (char) ((android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)) + 8751);
        r47 = (android.view.ViewConfiguration.getTapTimeout() >> 16) + 24;
        r4 = 337 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1));
        r5 = com.touchlessid.TouchLessIDSDK$values.$$a[4];
        r6 = (byte) (r5 + 1);
        r5 = r5;
        r8 = new java.lang.Object[1];
        a(r6, r5, (byte) (r5 + 1), r8);
        r3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(r3, r47, r4, -598779726, false, (java.lang.String) r8[0], new java.lang.Class[]{r12});
     */
    /* JADX WARN: Code restructure failed: missing block: B:588:0x0b71, code lost:
    
        r0 = ((java.lang.reflect.Method) r3).invoke(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x0b78, code lost:
    
        r4 = new java.lang.Object[1];
        c("\u0001", true, new int[]{36, 1, 0, 0}, r4);
        r0 = r0.equals((java.lang.String) r4[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0b91, code lost:
    
        r0 = '4';
     */
    /* JADX WARN: Code restructure failed: missing block: B:597:0x0795, code lost:
    
        if (((r0 & r3) | (r0 ^ r3)) != 477111747) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:605:0x089f, code lost:
    
        if (((r0 & r3) | (r0 ^ r3)) != (-1032769152)) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0b98, code lost:
    
        if (r0 == '4') goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x0999, code lost:
    
        if (((r0 & r3) | (r0 ^ r3)) == 542074309) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0b9b, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Multi-variable search skipped. Vars limit reached: 5905 (expected less than 5000) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x13f3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x14d0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x1764  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x1800  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x1a21  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x1a2b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02d8 A[Catch: all -> 0x3b32, TRY_ENTER, TryCatch #6 {all -> 0x3b32, blocks: (B:5:0x0038, B:7:0x003e, B:8:0x008f, B:16:0x02c9, B:19:0x02d8, B:20:0x031f, B:24:0x0359, B:26:0x0368, B:27:0x03a9, B:31:0x046f, B:33:0x0479, B:34:0x04c0, B:36:0x051a, B:38:0x0524, B:39:0x056b, B:41:0x0574, B:43:0x058b, B:44:0x05d0, B:50:0x09fc, B:52:0x0a09, B:53:0x0a44, B:64:0x0ecb, B:66:0x0ed5, B:67:0x0f1a, B:80:0x0f82, B:82:0x0f8c, B:83:0x0fcd, B:85:0x0fef, B:87:0x0ff9, B:88:0x103c, B:90:0x1045, B:92:0x105c, B:93:0x1099, B:101:0x128c, B:103:0x1299, B:104:0x12e0, B:127:0x14e8, B:129:0x14f5, B:130:0x1537, B:132:0x164f, B:134:0x165c, B:135:0x169b, B:147:0x1815, B:149:0x1822, B:150:0x1864, B:152:0x1910, B:154:0x191d, B:155:0x1965, B:174:0x1ad4, B:176:0x1ae1, B:177:0x1b23, B:212:0x1f91, B:214:0x1f9b, B:215:0x1fdf, B:218:0x2003, B:220:0x2012, B:221:0x205b, B:230:0x2303, B:232:0x2310, B:233:0x234d, B:305:0x27bf, B:307:0x27c5, B:308:0x2807, B:318:0x2f54, B:320:0x2f65, B:321:0x2fa6, B:327:0x303b, B:329:0x3041, B:330:0x3082, B:336:0x3211, B:338:0x3236, B:339:0x327e, B:350:0x339d, B:352:0x33aa, B:353:0x33ea, B:360:0x34c4, B:362:0x34cd, B:363:0x3508, B:369:0x362f, B:371:0x3635, B:372:0x367b, B:381:0x37ba, B:383:0x37e0, B:384:0x3823, B:408:0x2933, B:410:0x2939, B:411:0x297b, B:419:0x2a82, B:421:0x2a88, B:422:0x2ace, B:427:0x2be5, B:429:0x2beb, B:430:0x2c30, B:435:0x2d46, B:437:0x2d4c, B:438:0x2d8c, B:569:0x116c, B:571:0x1182, B:572:0x11c5, B:585:0x0b23, B:587:0x0b2d, B:588:0x0b71, B:592:0x0684, B:594:0x069a, B:595:0x06d9, B:600:0x079a, B:602:0x07b0, B:603:0x07ef, B:608:0x08a4, B:610:0x08ba, B:611:0x08f4, B:621:0x013e, B:623:0x0153, B:624:0x0195), top: B:2:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x1ec3  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x1f7c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x2509  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x2527  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x2585  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x266b  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x2670  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x27bb  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x266d  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x2524  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x3a28  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x1a26  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x3ab7  */
    /* JADX WARN: Removed duplicated region for block: B:618:0x0b9f  */
    /* JADX WARN: Removed duplicated region for block: B:619:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x3b39  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x3b3a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0bad  */
    /* JADX WARN: Type inference failed for: r13v169 */
    /* JADX WARN: Type inference failed for: r13v171 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object[] valueOf$1eba2e16(int i, Object obj, int i2) {
        Throwable cause;
        int i3;
        int i4;
        float f;
        int i5;
        int i6;
        int i7;
        Object PngjBadSignature2;
        int i8;
        Object invoke;
        int i9;
        Class cls;
        boolean z;
        Class cls2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i10;
        int i11;
        int i12;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2;
        int i13;
        int i14;
        BufferedInputStream bufferedInputStream3;
        BufferedInputStream bufferedInputStream4;
        int i15;
        boolean z5;
        Object[] objArr;
        char c;
        Class cls3;
        long j;
        long j2;
        Class cls4;
        Object[] objArr2;
        boolean z6;
        boolean z7;
        Object obj2;
        String[] strArr;
        Object obj3;
        Object obj4;
        Class cls5 = Integer.TYPE;
        int i16 = PngjUnsupportedException;
        int i17 = ((i16 | 57) << 1) - (i16 ^ 57);
        PngjOutputException = i17 % 128;
        try {
            if (i17 % 2 != 0) {
                i3 = 4;
                i4 = 2;
                f = 0.0f;
                i5 = 5;
                Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1085800324);
                if (PngjBadSignature3 == null) {
                    char lastIndexOf = (char) (1178 - TextUtils.lastIndexOf("", '0'));
                    int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 44;
                    int size = 1092 - View.MeasureSpec.getSize(0);
                    byte b = $$a[4];
                    byte b2 = (byte) (b + 1);
                    byte b3 = b;
                    Object[] objArr3 = new Object[1];
                    a(b2, b3, (byte) (b3 + 1), objArr3);
                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(lastIndexOf, keyRepeatDelay, size, -1135046081, false, (String) objArr3[0], new Class[0]);
                }
                long longValue = ((Long) ((Method) PngjBadSignature3).invoke(null, null)).longValue();
                long j3 = 1839113996;
                long j4 = 988;
                long j5 = -1;
                long j6 = longValue ^ j5;
                long j7 = i;
                long j8 = j7 ^ j5;
                long j9 = (j4 * (((longValue | (j8 | j3)) ^ j5) | (((j3 ^ j5) | j6) ^ j5) | ((j6 | j7) ^ j5))) + ((-988) * (j3 | j6)) + (((((j6 | j8) | j3) ^ j5) | (((j3 | longValue) | j7) ^ j5)) * j4) + (989 * j3) + ((-987) * longValue) + 85802321;
                int uptimeMillis = (int) SystemClock.uptimeMillis();
                int i18 = ((int) (j9 >> 32)) & (((~(uptimeMillis | (-582115858))) * 345) + (((~((-582480410) | (~uptimeMillis))) | 272630144) * 345) + ((((~((-582480410) | uptimeMillis)) | 582115857) * 345) - 484646000));
                int i19 = ((int) j9) & ((((~(918223162 | i)) | 1939517723) * 272) + (((~((-918223163) | i)) | 69224480) * (-272)) + ((((~((-848998683) | (~i))) | (~(2008742203 | i))) * (-272)) - 56472763));
                if (((i18 & i19) | (i18 ^ i19)) == 0) {
                    i6 = 1;
                    i7 = 0;
                    Object[] objArr4 = new Object[i6];
                    b(null, (-16777090) - (~(-Color.rgb(i7, i7, i7))), null, "\u0088\u0081\u0085\u0087\u0086\u0081\u0085\u0084\u0083\u0082\u0081", objArr4);
                    Object[] objArr5 = {(String) objArr4[i7]};
                    PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(547370249);
                    if (PngjBadSignature2 != null) {
                    }
                    invoke = ((Method) PngjBadSignature2).invoke(null, objArr5);
                    if (invoke == null) {
                    }
                    cls = String.class;
                    PngjUnsupportedException = (PngjOutputException + 49) % 128;
                    z = false;
                    if (z) {
                    }
                }
                Object[] objArr6 = new Object[i3];
                objArr6[0] = new int[]{r5};
                objArr6[1] = new int[1];
                objArr6[3] = new int[]{i};
                int i20 = (~(i & 271)) & (i | 271);
                objArr6[i4] = null;
                int elapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i21 = ~elapsedRealtime;
                int d = a.d((~(elapsedRealtime | (-426730399))) | (~(i21 | (-607835576))) | (-1031796672), -370, (((~((-426730399) | i21)) | (~((-607835576) | elapsedRealtime))) * (-370)) + 1571886639, 487320720, i2);
                int i22 = d ^ (d << 13);
                int i23 = i22 >>> 17;
                int i24 = ((~i22) & i23) | ((~i23) & i22);
                ((int[]) objArr6[1])[0] = i24 ^ (i24 << 5);
                return objArr6;
            }
            Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1085800324);
            if (PngjBadSignature4 == null) {
                char c2 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1178);
                int i25 = 45 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                f = 0.0f;
                int i26 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1092;
                i5 = 5;
                byte b4 = $$a[4];
                i4 = 2;
                byte b5 = (byte) (b4 + 1);
                byte b6 = b4;
                i3 = 4;
                Object[] objArr7 = new Object[1];
                a(b5, b6, (byte) (b6 + 1), objArr7);
                PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c2, i25, i26, -1135046081, false, (String) objArr7[0], new Class[0]);
            } else {
                i3 = 4;
                i4 = 2;
                f = 0.0f;
                i5 = 5;
            }
            long longValue2 = ((Long) ((Method) PngjBadSignature4).invoke(null, null)).longValue();
            long j10 = -111590606;
            long j11 = -1;
            long j12 = j10 ^ j11;
            long j13 = i;
            long j14 = (302 * ((j11 ^ (longValue2 | j13)) | (((longValue2 ^ j11) | j10) ^ j11))) + ((-604) * (((j12 | longValue2) | j13) ^ j11)) + ((-302) * ((((j12 | (j13 ^ j11)) | longValue2) ^ j11) | (((j10 | longValue2) | j13) ^ j11))) + ((-301) * longValue2) + (303 * j10) + 2036506923;
            int i27 = (((~((-936668347) | i)) | 366241968) * 345) - 484646000;
            int i28 = ~i;
            if (((((int) (j14 >> 116)) & (((~((-366241969) | i)) * 345) + (((~((-936668347) | i28)) | 134316096) * 345) + i27)) | (((int) j14) & ((((~((-1635651637) | i28)) | 22155264) * 560) + ((~(1811921598 | i)) * (-560)) + (((~(198425226 | i28)) * (-560)) - 2023085947)))) == 0) {
                i6 = 1;
                i7 = 0;
                Object[] objArr42 = new Object[i6];
                b(null, (-16777090) - (~(-Color.rgb(i7, i7, i7))), null, "\u0088\u0081\u0085\u0087\u0086\u0081\u0085\u0084\u0083\u0082\u0081", objArr42);
                Object[] objArr52 = {(String) objArr42[i7]};
                PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(547370249);
                if (PngjBadSignature2 != null) {
                    char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 8752);
                    int myPid = (Process.myPid() >> 22) + 24;
                    int i29 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 335;
                    byte b7 = $$a[4];
                    byte b8 = (byte) (b7 + 1);
                    byte b9 = b7;
                    i8 = 547370249;
                    Object[] objArr8 = new Object[1];
                    a(b8, b9, (byte) (b9 + 1), objArr8);
                    PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(packedPositionType, myPid, i29, -598779726, false, (String) objArr8[0], new Class[]{String.class});
                } else {
                    i8 = 547370249;
                }
                invoke = ((Method) PngjBadSignature2).invoke(null, objArr52);
                if (invoke == null) {
                    Object[] objArr9 = new Object[1];
                    b(null, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 127, null, "\u008b\u0084\u008a\u0089\u0085\u0081", objArr9);
                    String str = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    b(null, 126 - (~(-(-View.MeasureSpec.makeMeasureSpec(0, 0)))), null, "\u0084\u0090\u008f\u008e\u0086\u008d\u0082\u008c", objArr10);
                    String[] strArr2 = {str, (String) objArr10[0]};
                    Object[] objArr11 = new Object[i4];
                    objArr11[1] = strArr2;
                    objArr11[0] = invoke;
                    Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-344601997);
                    if (PngjBadSignature5 == null) {
                        char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 26717);
                        int windowTouchSlop = 33 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int mode = View.MeasureSpec.getMode(0) + 1668;
                        byte b10 = $$a[4];
                        byte b11 = (byte) (b10 + 1);
                        byte b12 = b10;
                        Object[] objArr12 = new Object[1];
                        a(b11, b12, (byte) (b12 + 1), objArr12);
                        PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(bitsPerPixel, windowTouchSlop, mode, 396011464, false, (String) objArr12[0], new Class[]{String.class, String[].class});
                    }
                    long longValue3 = ((Long) ((Method) PngjBadSignature5).invoke(null, objArr11)).longValue();
                    long j15 = -1066165088;
                    i9 = 8;
                    long j16 = -406;
                    long j17 = -1;
                    long j18 = longValue3 ^ j17;
                    long myTid = Process.myTid();
                    long j19 = myTid ^ j17;
                    long j20 = ((406 * ((((j15 ^ j17) | myTid) ^ j17) | ((j19 | longValue3) ^ j17))) + ((j16 * (((j18 | j19) | j15) ^ j17)) + (((((j18 | myTid) ^ j17) | (((j19 | j15) | longValue3) ^ j17)) * j16) + ((407 * longValue3) + ((-405) * j15))))) - 620427133;
                    int i30 = ((int) (j20 >> 32)) & (((~(((int) Runtime.getRuntime().freeMemory()) | (-539646156))) * 283) + ((((~((-560888012) | r5)) | 21241856) * (-283)) - 1141262934));
                    int i31 = (((~((-1859705180) | i)) | 710463578) * 345) + 484646344;
                    int i32 = ~i;
                    int i33 = ((int) j20) & (((~((-710463579) | i)) * 345) + (((~((-1859705180) | i32)) | 287572128) * 345) + i31);
                    if (((i30 & i33) | (i30 ^ i33)) != 0) {
                        int i34 = PngjOutputException;
                        PngjUnsupportedException = ((i34 ^ 15) + ((i34 & 15) << 1)) % 128;
                        Object[] objArr13 = new Object[1];
                        c("\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001", true, new int[]{0, 23, 0, i5}, objArr13);
                        Object[] objArr14 = {(String) objArr13[0]};
                        Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i8);
                        if (PngjBadSignature6 == null) {
                            char c3 = (char) (8751 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                            float f2 = f;
                            int i35 = 24 - (TypedValue.complexToFraction(0, f2, f2) > f2 ? 1 : (TypedValue.complexToFraction(0, f2, f2) == f2 ? 0 : -1));
                            int i36 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 335;
                            byte b13 = $$a[4];
                            byte b14 = (byte) (b13 + 1);
                            byte b15 = b13;
                            Object[] objArr15 = new Object[1];
                            a(b14, b15, (byte) (b15 + 1), objArr15);
                            PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c3, i35, i36, -598779726, false, (String) objArr15[0], new Class[]{String.class});
                        }
                        Object invoke2 = ((Method) PngjBadSignature6).invoke(null, objArr14);
                        int i37 = -View.resolveSizeAndState(0, 0, 0);
                        int PngjBadCrcException2 = PngjBadCrcException.onErrorResponse.PngjBadCrcException();
                        int i38 = i37 * (-494);
                        int i39 = (i38 ^ (-62738)) + ((i38 & (-62738)) << 1);
                        int i40 = -(-((~(i37 | 127)) * (-495)));
                        int i41 = ~PngjBadCrcException2;
                        int i42 = (((i39 & i40) + (i40 | i39)) - (~((i37 | i41) * 495))) - 1;
                        int i43 = ~i37;
                        int i44 = ~((i43 & (-128)) | (i43 ^ (-128)));
                        int i45 = ~((i37 & i41) | (i41 ^ i37));
                        int i46 = -(-(((i45 & i44) | (i44 ^ i45)) * 495));
                        Object[] objArr16 = new Object[1];
                        b(null, (i42 & i46) + (i46 | i42), null, "\u0081\u0088\u0081\u008b\u0092\u008a\u0085\u008e\u008b\u0089\u0085\u0094\u0083\u0094\u0088\u0092\u0090\u0093\u0090\u0083\u0092\u008a\u008b\u0086\u0082\u0081\u0091\u0083\u0082\u0081", objArr16);
                        Object[] objArr17 = {(String) objArr16[0]};
                        Object PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i8);
                        if (PngjBadSignature7 == null) {
                            char capsMode = (char) (8752 - TextUtils.getCapsMode("", 0, 0));
                            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 24;
                            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 336;
                            byte b16 = $$a[4];
                            byte b17 = (byte) (b16 + 1);
                            byte b18 = b16;
                            obj3 = invoke2;
                            Object[] objArr18 = new Object[1];
                            a(b17, b18, (byte) (b18 + 1), objArr18);
                            PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(capsMode, scrollDefaultDelay, jumpTapTimeout, -598779726, false, (String) objArr18[0], new Class[]{String.class});
                        } else {
                            obj3 = invoke2;
                        }
                        Object invoke3 = ((Method) PngjBadSignature7).invoke(null, objArr17);
                        if (obj3 != null) {
                            Object[] objArr19 = {obj3, 42};
                            Object PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(989703296);
                            if (PngjBadSignature8 == null) {
                                char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 11039);
                                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 31;
                                int i47 = 1283 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                byte b19 = $$a[4];
                                byte b20 = b19;
                                obj4 = invoke3;
                                Object[] objArr20 = new Object[1];
                                a(b19, b20, b20, objArr20);
                                PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(threadPriority, offsetBefore, i47, -971849413, false, (String) objArr20[0], new Class[]{String.class, cls5});
                            } else {
                                obj4 = invoke3;
                            }
                            long longValue4 = ((Long) ((Method) PngjBadSignature8).invoke(null, objArr19)).longValue();
                            long j21 = -853729266;
                            cls = String.class;
                            long j22 = ((-858) * longValue4) + (860 * j21);
                            long maxMemory = (int) Runtime.getRuntime().maxMemory();
                            long j23 = ((-859) * (j21 | maxMemory)) + j22;
                            long j24 = 859;
                            long j25 = maxMemory ^ j17;
                            long j26 = longValue4 ^ j17;
                            long j27 = (j24 * (((j26 | j25) ^ j17) | ((j26 | j21) ^ j17))) + ((((j25 | j21) ^ j17) | ((((j21 ^ j17) | j26) | maxMemory) ^ j17)) * j24) + j23 + 1509436966;
                            int i48 = (int) Runtime.getRuntime().totalMemory();
                            int i49 = ~i48;
                            int i50 = ((int) (j27 >> 32)) & ((((~((-951850181) | i48)) | (~(i49 | 485376230))) * 959) + (((~(485376230 | i48)) | (~((-951850181) | i49))) * 959) + 765308103);
                            int i51 = ((int) j27) & ((((~((-1018286) | i32)) | 327681) * 191) + (((~((-1018286) | i)) | (-1436208125)) * 191) + 2101093381);
                        } else {
                            obj4 = invoke3;
                            cls = String.class;
                        }
                        if (obj4 != null) {
                            Object[] objArr21 = {obj4, 42};
                            Object PngjBadSignature9 = com.d.e.a.PngjBadCrcException.PngjBadSignature(989703296);
                            if (PngjBadSignature9 == null) {
                                char threadPriority2 = (char) (11039 - ((Process.getThreadPriority(0) + 20) >> 6));
                                int bitsPerPixel2 = 30 - ImageFormat.getBitsPerPixel(0);
                                int indexOf = 1282 - TextUtils.indexOf("", "", 0);
                                byte b21 = $$a[4];
                                byte b22 = b21;
                                Object[] objArr22 = new Object[1];
                                a(b21, b22, b22, objArr22);
                                PngjBadSignature9 = com.d.e.a.PngjBadCrcException.PngjBadSignature(threadPriority2, bitsPerPixel2, indexOf, -971849413, false, (String) objArr22[0], new Class[]{cls, cls5});
                            }
                            long longValue5 = ((Long) ((Method) PngjBadSignature9).invoke(null, objArr21)).longValue();
                            long j28 = -125969805;
                            long j29 = ((-271) * longValue5) + (273 * j28);
                            long j30 = -272;
                            long j31 = j28 ^ j17;
                            long j32 = j31 | (longValue5 ^ j17);
                            long j33 = i;
                            long j34 = (272 * (longValue5 | ((j28 | j33) ^ j17))) + (j30 * (((j31 | longValue5) ^ j17) | ((j31 | j33) ^ j17))) + ((((j32 | (j33 ^ j17)) ^ j17) | (((j28 | longValue5) | j33) ^ j17)) * j30) + j29 + 781677505;
                            int myTid2 = Process.myTid();
                            int i52 = ~myTid2;
                            int i53 = ((int) (j34 >> 32)) & ((((~(myTid2 | (-845169798))) | (~(i52 | (-67174657))) | (~(2012571087 | myTid2))) * 192) + (((~(1945396431 | i52)) | (-2012571088)) * (-384)) + (((1100226634 | i52) * (-192)) - 1788177110));
                            int i54 = ((int) j34) & ((((~((-1065423574) | i)) | (~((-1792317313) | i32)) | (~(1792317312 | i))) * 959) + (((~((-1065423574) | i32)) | (~((-1792317313) | i)) | (~(i32 | 1792317312))) * 959) + 1955618964);
                        }
                        if (obj3 != null) {
                            Object[] objArr23 = {obj3, 42};
                            Object PngjBadSignature10 = com.d.e.a.PngjBadCrcException.PngjBadSignature(989703296);
                            if (PngjBadSignature10 == null) {
                                char mode2 = (char) (11039 - View.MeasureSpec.getMode(0));
                                int indexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 32;
                                int scrollBarFadeDuration = 1282 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                byte b23 = $$a[4];
                                byte b24 = b23;
                                Object[] objArr24 = new Object[1];
                                a(b23, b24, b24, objArr24);
                                PngjBadSignature10 = com.d.e.a.PngjBadCrcException.PngjBadSignature(mode2, indexOf2, scrollBarFadeDuration, -971849413, false, (String) objArr24[0], new Class[]{cls, cls5});
                            }
                            long longValue6 = ((Long) ((Method) PngjBadSignature10).invoke(null, objArr23)).longValue();
                            long j35 = -1470540915;
                            long j36 = ((-764) * longValue6) + ((-1529) * j35);
                            long j37 = 765;
                            long j38 = j35 ^ j17;
                            long j39 = longValue6 ^ j17;
                            long j40 = j38 | j39;
                            long myUid = Process.myUid();
                            long j41 = myUid ^ j17;
                            long j42 = (j37 * (((j38 | myUid) ^ j17) | (((j39 | j41) | j35) ^ j17))) + (1530 * ((j40 ^ j17) | ((j38 | j41) ^ j17))) + ((((j40 | j41) ^ j17) | (((j38 | longValue6) | myUid) ^ j17) | (((j39 | j35) | myUid) ^ j17)) * j37) + j36 + 2126248615;
                            int i55 = ((int) (j42 >> 32)) & ((((-8388881) | i) * 465) + (((-853691793) | (~(2004049092 | i))) * 930) + (((~((-853691793) | i)) | 2004049092) * (-465)) + 676569153);
                            int c4 = ((int) j42) & a.c((-36724739) | i32, -828, (((~((-36724739) | i32)) | (-1400501672)) * (-828)) - 1754753727, 343311992);
                        }
                        if (obj4 != null) {
                            Object[] objArr25 = {obj4, 42};
                            Object PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature(989703296);
                            if (PngjBadSignature11 == null) {
                                char makeMeasureSpec = (char) (11039 - View.MeasureSpec.makeMeasureSpec(0, 0));
                                int resolveSize = View.resolveSize(0, 0) + 31;
                                int axisFromString = MotionEvent.axisFromString("") + 1283;
                                byte b25 = $$a[4];
                                byte b26 = b25;
                                Object[] objArr26 = new Object[1];
                                a(b25, b26, b26, objArr26);
                                PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature(makeMeasureSpec, resolveSize, axisFromString, -971849413, false, (String) objArr26[0], new Class[]{cls, cls5});
                            }
                            long longValue7 = ((Long) ((Method) PngjBadSignature11).invoke(null, objArr25)).longValue();
                            long j43 = -981042030;
                            long j44 = -112;
                            long j45 = (j44 * longValue7) + (j44 * j43);
                            long j46 = longValue7 ^ j17;
                            long j47 = i;
                            long j48 = j46 | (j47 ^ j17);
                            long j49 = j43 ^ j17;
                            long j50 = (113 * ((j46 | j47) ^ j17)) + ((-113) * (((j49 | longValue7) ^ j17) | ((j49 | j47) ^ j17) | ((j48 | j43) ^ j17))) + (226 * (j43 | (j48 ^ j17))) + j45 + 1636749730;
                            int myPid2 = Process.myPid();
                            int i56 = ((int) (j50 >> 32)) & ((((~((~myPid2) | 2115415448)) | 1378373924) * 398) + (((~(2115415448 | myPid2)) | 1378373924) * 398) + 641500560);
                            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                            int i57 = ((int) j50) & ((((~(startElapsedRealtime | (-272630869))) | 67772673) * 235) + (((~((-1531299541) | startElapsedRealtime)) | 1326441345) * (-470)) + ((((~((~startElapsedRealtime) | (-1531299541))) | 1326441345) * (-235)) - 1701913145));
                        }
                        PngjUnsupportedException = (PngjOutputException + 49) % 128;
                        z = false;
                        if (z) {
                            Object[] objArr27 = {new int[]{r5}, new int[1], null, new int[]{i}};
                            int i58 = (i & (-261)) | ((~i) & 260);
                            int myPid3 = Process.myPid();
                            int c5 = a.c((~((~myPid3) | 416919293)) | (-1007232166), 381, (((-603979777) | myPid3) * (-381)) + 1866842854, -1811939328);
                            int i59 = -(-((c5 ^ 16) + ((c5 & 16) << 1)));
                            int i60 = (i2 ^ i59) + ((i59 & i2) << 1);
                            int i61 = i60 << 13;
                            int i62 = (i61 & (~i60)) | ((~i61) & i60);
                            int i63 = i62 >>> 17;
                            int i64 = (i62 | i63) & (~(i62 & i63));
                            int i65 = i64 << 5;
                            ((int[]) objArr27[1])[0] = ((~i64) & i65) | ((~i65) & i64);
                            return objArr27;
                        }
                        Object[] objArr28 = new Object[1];
                        b(null, ExpandableListView.getPackedPositionGroup(0L) + 127, null, "\u0090\u0093\u0088\u0096\u0099\u0098\u0086\u0085", objArr28);
                        String str2 = (String) objArr28[0];
                        int blue = Color.blue(0);
                        int i66 = (blue * (-55)) - 6985;
                        int i67 = ~((blue ^ i) | (blue & i));
                        int i68 = -(-(((i67 & 127) | (i67 ^ 127)) * 56));
                        int i69 = ((~((blue ^ 127) | (blue & 127))) * (-56)) + (((i66 | i68) << 1) - (i66 ^ i68));
                        int i70 = ~i;
                        int i71 = ~((i70 ^ 127) | (i70 & 127));
                        int i72 = ((blue & i71) | (blue ^ i71)) * 56;
                        int i73 = ((i69 | i72) << 1) - (i72 ^ i69);
                        Object[] objArr29 = new Object[1];
                        b(null, i73, null, "\u008c\u0089\u008f\u0091\u0081\u0085", objArr29);
                        String str3 = (String) objArr29[0];
                        Object[] objArr30 = new Object[1];
                        c("\u0000\u0001\u0000\u0000\u0000\u0001\u0000", false, new int[]{37, 7, 132, 0}, objArr30);
                        String str4 = (String) objArr30[0];
                        int i74 = -(-((Process.getThreadPriority(0) + 20) >> 6));
                        int i75 = (i74 ^ 127) + ((i74 & 127) << 1);
                        Object[] objArr31 = new Object[1];
                        b(null, i75, null, "\u0081\u0088\u009a\u0081\u0088\u0090\u0098\u0086\u008c", objArr31);
                        String str5 = (String) objArr31[0];
                        int i76 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        int i77 = (i76 & 126) + (i76 | 126);
                        Object[] objArr32 = new Object[1];
                        b(null, i77, null, "\u008f\u008d\u008a\u008d\u0086\u008f", objArr32);
                        String str6 = (String) objArr32[0];
                        Object[] objArr33 = new Object[1];
                        b(null, 126 - (~(-(-KeyEvent.keyCodeFromString("")))), null, "\u008a\u0081\u0083\u008c\u008b\u0098\u0088\u0086\u0097\u0092\u008f\u0089\u008f", objArr33);
                        String str7 = (String) objArr33[0];
                        int scrollDefaultDelay2 = ViewConfiguration.getScrollDefaultDelay() >> 16;
                        int i78 = ((scrollDefaultDelay2 | 127) << 1) - (scrollDefaultDelay2 ^ 127);
                        Object[] objArr34 = new Object[1];
                        b(null, i78, null, "\u0091\u0082\u0092\u0082\u008f", objArr34);
                        String str8 = (String) objArr34[0];
                        Object[] objArr35 = new Object[1];
                        c("\u0000\u0001\u0000\u0001\u0000\u0001", true, new int[]{44, 6, 16, 2}, objArr35);
                        String str9 = (String) objArr35[0];
                        int i79 = -(-(ViewConfiguration.getFadingEdgeLength() >> 16));
                        int i80 = (i79 & 127) + (i79 | 127);
                        Object[] objArr36 = new Object[1];
                        b(null, i80, null, "\u0087\u008f", objArr36);
                        String str10 = (String) objArr36[0];
                        Object[] objArr37 = new Object[1];
                        c("\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000", false, new int[]{50, 16, 0, 0}, objArr37);
                        String str11 = (String) objArr37[0];
                        Object[] objArr38 = new Object[1];
                        c("\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001", false, new int[]{66, 10, 0, 0}, objArr38);
                        String str12 = (String) objArr38[0];
                        Object[] objArr39 = new Object[1];
                        c("\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001", false, new int[]{76, i9, 75, 0}, objArr39);
                        String str13 = (String) objArr39[0];
                        int scrollDefaultDelay3 = ViewConfiguration.getScrollDefaultDelay() >> 16;
                        int i81 = (scrollDefaultDelay3 * (-300)) + 38354;
                        int i82 = (scrollDefaultDelay3 ^ 127) | (scrollDefaultDelay3 & 127);
                        int i83 = (~((i82 & i) | (i82 ^ i))) * (-301);
                        int i84 = (i81 & i83) + (i81 | i83);
                        int i85 = ~(((-128) ^ i) | ((-128) & i));
                        int i86 = ~((i70 ^ scrollDefaultDelay3) | (i70 & scrollDefaultDelay3));
                        int i87 = -(-(((i85 & i86) | (i85 ^ i86)) * (-301)));
                        int i88 = (i84 ^ i87) + ((i87 & i84) << 1);
                        int i89 = ((-128) | (~((~scrollDefaultDelay3) | i))) * 301;
                        int i90 = (i88 ^ i89) + ((i89 & i88) << 1);
                        Object[] objArr40 = new Object[1];
                        b(null, i90, null, "\u0086\u0092\u008a\u0088\u008d\u008d\u0082\u008a\u008e\u0082\u0081\u0091", objArr40);
                        String str14 = (String) objArr40[0];
                        Object[] objArr41 = new Object[1];
                        c("\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000", true, new int[]{84, 14, 4, 0}, objArr41);
                        String str15 = (String) objArr41[0];
                        Object[] objArr43 = new Object[1];
                        c("\u0001\u0000\u0001\u0000\u0000\u0001\u0000", false, new int[]{98, 7, 22, 4}, objArr43);
                        String str16 = (String) objArr43[0];
                        int i91 = -(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                        int i92 = (i91 & 127) + (i91 | 127);
                        Object[] objArr44 = new Object[1];
                        b(null, i92, null, "\u0091\u0085\u0094\u0087\u0082\u0084\u0090", objArr44);
                        String str17 = (String) objArr44[0];
                        Object[] objArr45 = new Object[1];
                        c("\u0000\u0000\u0001\u0001\u0001\u0001\u0000", false, new int[]{105, 7, 45, 0}, objArr45);
                        String str18 = (String) objArr45[0];
                        Object[] objArr46 = new Object[1];
                        c("\u0001\u0000", true, new int[]{112, 2, 0, 2}, objArr46);
                        String str19 = (String) objArr46[0];
                        Object[] objArr47 = new Object[1];
                        b(null, (ViewConfiguration.getScrollBarSize() >> 8) + 127, null, "\u0092\u0089\u0088\u008c\u0085\u0096\u008a\u0082\u008d\u0099\u0084\u0092\u008f\u0087\u0099\u0092\u0081\u0085\u0092\u0090", objArr47);
                        String str20 = (String) objArr47[0];
                        int i93 = -(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                        int i94 = (i93 & 127) + (i93 | 127);
                        Object[] objArr48 = new Object[1];
                        b(null, i94, null, "\u0088\u008a\u0085\u0081\u0092\u0090", objArr48);
                        String str21 = (String) objArr48[0];
                        Object[] objArr49 = new Object[1];
                        c("\u0001\u0000", false, new int[]{114, 2, 0, 1}, objArr49);
                        String str22 = (String) objArr49[0];
                        Object[] objArr50 = new Object[1];
                        c(null, true, new int[]{116, 16, 112, 9}, objArr50);
                        String str23 = (String) objArr50[0];
                        Object[] objArr51 = new Object[1];
                        c("\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001", true, new int[]{132, 9, 0, 1}, objArr51);
                        String str24 = (String) objArr51[0];
                        Object[] objArr53 = new Object[1];
                        c(null, true, new int[]{141, 10, 115, 2}, objArr53);
                        String str25 = (String) objArr53[0];
                        Object[] objArr54 = new Object[1];
                        c("\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000", true, new int[]{151, 11, 150, 0}, objArr54);
                        String str26 = (String) objArr54[0];
                        Object[] objArr55 = new Object[1];
                        c("\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000", false, new int[]{162, 11, 155, 10}, objArr55);
                        String str27 = (String) objArr55[0];
                        Object[] objArr56 = new Object[1];
                        c("\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001", true, new int[]{173, 15, 0, 0}, objArr56);
                        String str28 = (String) objArr56[0];
                        Object[] objArr57 = new Object[1];
                        c("\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000", true, new int[]{188, 14, 5, 8}, objArr57);
                        String[] strArr3 = {str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, (String) objArr57[0]};
                        Object[] objArr58 = new Object[1];
                        b(null, 125 - (~(-TextUtils.lastIndexOf("", '0', 0, 0))), null, "\u0088\u0081\u0085\u0087\u0086\u0081\u0085\u0084\u0083\u0082\u0081", objArr58);
                        Object[] objArr59 = {(String) objArr58[0]};
                        Object PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i8);
                        if (PngjBadSignature12 == null) {
                            char scrollBarFadeDuration2 = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 8752);
                            int green = Color.green(0) + 24;
                            int i95 = 335 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                            byte b27 = $$a[4];
                            byte b28 = (byte) (b27 + 1);
                            byte b29 = b27;
                            Object[] objArr60 = new Object[1];
                            a(b28, b29, (byte) (b29 + 1), objArr60);
                            PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature(scrollBarFadeDuration2, green, i95, -598779726, false, (String) objArr60[0], new Class[]{cls});
                        }
                        String str29 = (String) ((Method) PngjBadSignature12).invoke(null, objArr59);
                        if (str29 != null) {
                            Object[] objArr61 = new Object[1];
                            b(null, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126, null, "\u008b\u0084\u008a\u0089\u0085\u0081", objArr61);
                            String str30 = (String) objArr61[0];
                            Object[] objArr62 = new Object[1];
                            b(null, 126 - (~(-(-Color.red(0)))), null, "\u0084\u0090\u008f\u008e\u0086\u008d\u0082\u008c", objArr62);
                            String[] strArr4 = {str30, (String) objArr62[0]};
                            int i96 = 0;
                            while (true) {
                                if (i96 >= 2) {
                                    z7 = false;
                                    break;
                                }
                                if (str29.contains(strArr4[i96])) {
                                    z7 = true;
                                    break;
                                }
                                i96 = (i96 | 1) + (i96 & 1);
                            }
                            if (z7) {
                                Object[] objArr63 = new Object[1];
                                c("\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001", true, new int[]{0, 23, 0, 5}, objArr63);
                                Object[] objArr64 = {(String) objArr63[0]};
                                Object PngjBadSignature13 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i8);
                                if (PngjBadSignature13 == null) {
                                    char lastIndexOf2 = (char) (8751 - TextUtils.lastIndexOf("", '0'));
                                    int resolveOpacity = Drawable.resolveOpacity(0, 0) + 24;
                                    int indexOf3 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 337;
                                    byte b30 = $$a[4];
                                    byte b31 = (byte) (b30 + 1);
                                    byte b32 = b30;
                                    Object[] objArr65 = new Object[1];
                                    a(b31, b32, (byte) (b32 + 1), objArr65);
                                    PngjBadSignature13 = com.d.e.a.PngjBadCrcException.PngjBadSignature(lastIndexOf2, resolveOpacity, indexOf3, -598779726, false, (String) objArr65[0], new Class[]{cls});
                                }
                                Object invoke4 = ((Method) PngjBadSignature13).invoke(null, objArr64);
                                int i97 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                int i98 = (i97 & 127) + (i97 | 127);
                                Object[] objArr66 = new Object[1];
                                b(null, i98, null, "\u0081\u0088\u0081\u008b\u0092\u008a\u0085\u008e\u008b\u0089\u0085\u0094\u0083\u0094\u0088\u0092\u0090\u0093\u0090\u0083\u0092\u008a\u008b\u0086\u0082\u0081\u0091\u0083\u0082\u0081", objArr66);
                                Object[] objArr67 = {(String) objArr66[0]};
                                Object PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i8);
                                if (PngjBadSignature14 == null) {
                                    char capsMode2 = (char) (TextUtils.getCapsMode("", 0, 0) + 8752);
                                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 25;
                                    int scrollDefaultDelay4 = 336 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                    byte b33 = $$a[4];
                                    byte b34 = (byte) (b33 + 1);
                                    byte b35 = b33;
                                    Object[] objArr68 = new Object[1];
                                    a(b34, b35, (byte) (b35 + 1), objArr68);
                                    PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(capsMode2, packedPositionChild, scrollDefaultDelay4, -598779726, false, (String) objArr68[0], new Class[]{cls});
                                }
                                Object invoke5 = ((Method) PngjBadSignature14).invoke(null, objArr67);
                                if (invoke4 != null) {
                                    Object[] objArr69 = {invoke4, 42};
                                    Object PngjBadSignature15 = com.d.e.a.PngjBadCrcException.PngjBadSignature(989703296);
                                    if (PngjBadSignature15 == null) {
                                        char makeMeasureSpec2 = (char) (11039 - View.MeasureSpec.makeMeasureSpec(0, 0));
                                        int i99 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 30;
                                        int offsetBefore2 = 1282 - TextUtils.getOffsetBefore("", 0);
                                        byte b36 = $$a[4];
                                        byte b37 = b36;
                                        Object[] objArr70 = new Object[1];
                                        a(b36, b37, b37, objArr70);
                                        PngjBadSignature15 = com.d.e.a.PngjBadCrcException.PngjBadSignature(makeMeasureSpec2, i99, offsetBefore2, -971849413, false, (String) objArr70[0], new Class[]{cls, cls5});
                                    }
                                    long longValue8 = ((Long) ((Method) PngjBadSignature15).invoke(null, objArr69)).longValue();
                                    obj2 = invoke5;
                                    long j51 = -699911243;
                                    long j52 = (407 * longValue8) + ((-405) * j51);
                                    long j53 = -406;
                                    long j54 = -1;
                                    long j55 = longValue8 ^ j54;
                                    long startUptimeMillis = (int) Process.getStartUptimeMillis();
                                    long j56 = startUptimeMillis ^ j54;
                                    long j57 = (406 * ((((j51 ^ j54) | startUptimeMillis) ^ j54) | ((j56 | longValue8) ^ j54))) + (j53 * (((j55 | j56) | j51) ^ j54)) + ((((j55 | startUptimeMillis) ^ j54) | (((j56 | j51) | longValue8) ^ j54)) * j53) + j52 + 1355618943;
                                    int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
                                    int i100 = (~((-1504581502) | startUptimeMillis2)) | 1504450093;
                                    int i101 = ((int) (j57 >> 32)) & ((((~(startUptimeMillis2 | (-131409))) | (~((~startUptimeMillis2) | (-67223683)))) * 470) + (((i100 | r13) * (-470)) - 140833720));
                                    int a2 = a.a();
                                    int i102 = ((int) j57) & ((((~(a2 | (-552736207))) | (-884490204)) * 272) + (((~(552736206 | a2)) | 336079377) * (-272)) + ((((~(888815583 | (~a2))) | (~((-548410827) | a2))) * (-272)) - 1394452443));
                                    if (((i101 & i102) | (i101 ^ i102)) == 477111747) {
                                        cls2 = cls;
                                        int i103 = 0;
                                        int i104 = 0;
                                        while (i103 < 28) {
                                            String str31 = strArr3[i103];
                                            Object[] objArr71 = new Object[1];
                                            c(null, true, new int[]{202, 12, 65, 5}, objArr71);
                                            Object[] objArr72 = {((String) objArr71[0]).concat(String.valueOf(str31))};
                                            Object PngjBadSignature16 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1142218481);
                                            if (PngjBadSignature16 == null) {
                                                int gidForName = Process.getGidForName("") + 29;
                                                int green2 = Color.green(0) + 1447;
                                                byte b38 = $$a[4];
                                                byte b39 = (byte) (b38 + 1);
                                                byte b40 = b38;
                                                strArr = strArr3;
                                                Object[] objArr73 = new Object[1];
                                                a(b39, b40, (byte) (b40 + 1), objArr73);
                                                PngjBadSignature16 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), gidForName, green2, 1191464116, false, (String) objArr73[0], new Class[]{cls2});
                                            } else {
                                                strArr = strArr3;
                                            }
                                            long longValue9 = ((Long) ((Method) PngjBadSignature16).invoke(null, objArr72)).longValue();
                                            long j58 = -137596934;
                                            long j59 = (503 * longValue9) + ((-501) * j58);
                                            long j60 = -502;
                                            long j61 = -1;
                                            long j62 = longValue9 ^ j61;
                                            long j63 = i;
                                            long j64 = ((502 * (j62 | (((j58 ^ j61) | j63) ^ j61))) + ((j60 * (((j62 | (j63 ^ j61)) | j58) ^ j61)) + (((((j62 | j63) ^ j61) | ((j58 | longValue9) ^ j61)) * j60) + j59))) - 1818400943;
                                            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                                            int i105 = !(((((int) (j64 >> 32)) & ((((~(elapsedCpuTime | (-38283267))) | 671088960) * 366) + ((((~(1745273289 | elapsedCpuTime)) | (-1112467596)) * (-366)) + 1490555906))) | (((int) j64) & ((((~((-192934024) | i70)) | 19546113) * 859) + ((((~((-1630160434) | i70)) | (~((-173387911) | i))) * 859) + ((((-1630160434) | i) * (-859)) + 187698066))))) == 0) ? 1 : 0;
                                            int PngjBadCrcException3 = PngjBadCrcException.onErrorResponse.PngjBadCrcException();
                                            int i106 = (i104 * (-667)) + (i105 * (-1335));
                                            int i107 = ~i104;
                                            int i108 = ~((i105 ^ PngjBadCrcException3) | (i105 & PngjBadCrcException3));
                                            int i109 = (((i108 & i107) | (i107 ^ i108)) * (-668)) + i106;
                                            int i110 = ~(i107 | PngjBadCrcException3);
                                            int i111 = -(-(((i110 & i105) | (i105 ^ i110)) * 1336));
                                            int i112 = ((i109 | i111) << 1) - (i111 ^ i109);
                                            int i113 = PngjBadCrcException3 | i105;
                                            int i114 = ((i113 & i107) | (i113 ^ i107)) * 668;
                                            i104 = ((i112 | i114) << 1) - (i114 ^ i112);
                                            i103 = ((i103 | 1) << 1) - (i103 ^ 1);
                                            strArr3 = strArr;
                                        }
                                        if (!(((double) i104) < 25.2d)) {
                                            int i115 = PngjOutputException;
                                            PngjUnsupportedException = ((i115 ^ 7) + ((i115 & 7) << 1)) % 128;
                                            z2 = true;
                                            if (z2) {
                                                int i116 = PngjOutputException;
                                                PngjUnsupportedException = (((i116 | 29) << 1) - (i116 ^ 29)) % 128;
                                                Object[] objArr74 = {new int[]{(i & (-262)) | (i70 & 261)}, new int[1], null, new int[]{i}};
                                                int b41 = a.b(1824485297);
                                                int i117 = (((~((-657192633) | b41)) | 553759776 | (~(377373341 | b41))) * (-754)) + 1564913883;
                                                int i118 = ~((-553759777) | b41);
                                                int i119 = ~b41;
                                                int i120 = ((i119 | (-657192633)) * 754) + ((i118 | (~(931133117 | i119))) * (-754)) + i117;
                                                int i121 = ((i120 | 16) << 1) - (i120 ^ 16);
                                                int i122 = i121 * (-515);
                                                int i123 = -(-(i2 * 517));
                                                int i124 = (i122 & i123) + (i122 | i123);
                                                int i125 = ~i2;
                                                int i126 = ~((i125 & i) | (i125 ^ i));
                                                int i127 = ~i;
                                                int i128 = -(-((i126 | (~(i127 | i121)) | (~((i127 & i2) | (i127 ^ i2)))) * (-516)));
                                                int i129 = ((i124 | i128) << 1) - (i128 ^ i124);
                                                int i130 = ~i121;
                                                int i131 = ~i2;
                                                int i132 = (i130 & i131) | (i130 ^ i131);
                                                int i133 = ~((i & i132) | (i132 ^ i));
                                                int i134 = ~i121;
                                                int i135 = (i129 - (~(-(-((i133 | (~((i134 | i70) | i2))) * 516))))) - 1;
                                                int i136 = ((~(i134 | i2)) | (~((i2 & i70) | (i70 ^ i2)))) * 516;
                                                int i137 = (i135 ^ i136) + ((i136 & i135) << 1);
                                                int i138 = i137 << 13;
                                                int i139 = (i138 & (~i137)) | ((~i138) & i137);
                                                int i140 = i139 ^ (i139 >>> 17);
                                                int i141 = i140 << 5;
                                                ((int[]) objArr74[1])[0] = ((~i140) & i141) | ((~i141) & i140);
                                                return objArr74;
                                            }
                                            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L);
                                            int i142 = ((packedPositionGroup | 127) << 1) - (packedPositionGroup ^ 127);
                                            Object[] objArr75 = new Object[1];
                                            b(null, i142, null, "\u0088\u008a\u0081\u0082\u008e\u0089\u0088\u0095\u009b\u008b\u0089\u008f\u008d\u0088\u0090\u0095\u0090\u008e\u0095\u0090\u0093\u0090\u0095", objArr75);
                                            Object[] objArr76 = {(String) objArr75[0]};
                                            Object PngjBadSignature17 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-936033973);
                                            if (PngjBadSignature17 == null) {
                                                char offsetAfter = (char) (TextUtils.getOffsetAfter("", 0) + 29467);
                                                int indexOf4 = TextUtils.indexOf((CharSequence) "", '0', 0) + 40;
                                                int i143 = 433 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                byte b42 = $$a[4];
                                                byte b43 = (byte) (b42 + 1);
                                                byte b44 = b42;
                                                Object[] objArr77 = new Object[1];
                                                a(b43, b44, (byte) (b44 + 1), objArr77);
                                                PngjBadSignature17 = com.d.e.a.PngjBadCrcException.PngjBadSignature(offsetAfter, indexOf4, i143, 886713584, false, (String) objArr77[0], new Class[]{cls2});
                                            }
                                            long longValue10 = ((Long) ((Method) PngjBadSignature17).invoke(null, objArr76)).longValue();
                                            long j65 = 748589746;
                                            long j66 = -209;
                                            long j67 = (j66 * longValue10) + (j66 * j65);
                                            long j68 = 210;
                                            long j69 = -1;
                                            long j70 = j65 ^ j69;
                                            long j71 = longValue10 ^ j69;
                                            long myTid3 = Process.myTid();
                                            long j72 = myTid3 ^ j69;
                                            long j73 = ((j68 * (((myTid3 | (j71 | j65)) ^ j69) | (((j70 | j72) | longValue10) ^ j69))) + (((((j71 | j72) ^ j69) | ((j70 | myTid3) ^ j69)) * j68) + ((((j70 | j71) ^ j69) * j68) + j67))) - 1897302394;
                                            int i144 = ((int) (j73 >> 32)) & ((((~(2130377711 | i70)) | 269525316) * 521) + ((~(2130377711 | i)) * 521) + 278715830);
                                            int i145 = ((int) j73) & ((((~((-970147799) | i70)) | 156304768) * 983) + ((((~((-1887593088) | i70)) | (-970147799)) * (-983)) - 638537404));
                                            long j74 = (i144 & i145) | (i144 ^ i145);
                                            int i146 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                            int PngjBadCrcException4 = PngjBadCrcException.onErrorResponse.PngjBadCrcException();
                                            int i147 = i146 * 868;
                                            int i148 = (i147 & 111104) + (i147 | 111104);
                                            int i149 = ~i146;
                                            int i150 = ~PngjBadCrcException4;
                                            int i151 = ~((i150 & i149) | (i149 ^ i150));
                                            int i152 = ~PngjBadCrcException4;
                                            int i153 = ~(((-129) ^ i152) | ((-129) & i152));
                                            int i154 = (((i151 ^ i153) | (i153 & i151)) * (-867)) + i148;
                                            int i155 = ~((i149 ^ (-129)) | (i149 & (-129)));
                                            int i156 = ~((i149 ^ PngjBadCrcException4) | (i149 & PngjBadCrcException4));
                                            int i157 = (((i155 ^ i156) | (i155 & i156) | (~(((-129) ^ PngjBadCrcException4) | ((-129) & PngjBadCrcException4)))) * (-1734)) + i154;
                                            int i158 = (i149 ^ (-129)) | (i149 & (-129));
                                            int i159 = ~((i158 & i152) | (i158 ^ i152));
                                            int i160 = (i149 & 128) | (i149 ^ 128);
                                            int i161 = ~((i160 & PngjBadCrcException4) | (i160 ^ PngjBadCrcException4));
                                            int i162 = (i159 & i161) | (i159 ^ i161);
                                            int i163 = ((-129) & i146) | ((-129) ^ i146);
                                            int i164 = ~((i163 & PngjBadCrcException4) | (i163 ^ PngjBadCrcException4));
                                            int i165 = (i157 - (~(-(-(((i164 & i162) | (i162 ^ i164)) * 867))))) - 1;
                                            Object[] objArr78 = new Object[1];
                                            b(null, i165, null, "\u0090\u008b\u0092\u0085\u0092\u0090\u0095\u008e\u008d\u0088\u0090\u0095\u008a\u0082\u0081\u0091\u0095", objArr78);
                                            Object[] objArr79 = {(String) objArr78[0]};
                                            Object PngjBadSignature18 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-936033973);
                                            if (PngjBadSignature18 == null) {
                                                char makeMeasureSpec3 = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 29467);
                                                int green3 = Color.green(0) + 39;
                                                int red = 432 - Color.red(0);
                                                byte b45 = $$a[4];
                                                byte b46 = (byte) (b45 + 1);
                                                byte b47 = b45;
                                                Object[] objArr80 = new Object[1];
                                                a(b46, b47, (byte) (b47 + 1), objArr80);
                                                PngjBadSignature18 = com.d.e.a.PngjBadCrcException.PngjBadSignature(makeMeasureSpec3, green3, red, 886713584, false, (String) objArr80[0], new Class[]{cls2});
                                            }
                                            long longValue11 = ((Long) ((Method) PngjBadSignature18).invoke(null, objArr79)).longValue();
                                            long j75 = 400251191;
                                            long j76 = ((-475) * longValue11) + (477 * j75);
                                            long j77 = ((j75 ^ j69) | longValue11) ^ j69;
                                            long j78 = longValue11 ^ j69;
                                            long j79 = i;
                                            long j80 = ((j78 | j75) | j79) ^ j69;
                                            long j81 = (952 * j80) + ((-476) * (j77 | j80)) + j76;
                                            long j82 = j79 ^ j69;
                                            long j83 = ((476 * (((j78 | j82) | j75) ^ j69)) + j81) - 1548963839;
                                            int i166 = ~((int) Runtime.getRuntime().totalMemory());
                                            int i167 = ((int) (j83 >> 32)) & ((((~(i166 | 1949195596)) | 33619968) * 52) + (((~((-1949195597) | i166)) | (~(908545288 | i166)) | 1074270276) * (-52)) + (((~((-874925321) | i166)) * 52) - 283532422));
                                            int b48 = a.b(565182523);
                                            int c6 = ((int) j83) & a.c((~(b48 | 1724880472)) | (~(1132860413 | b48)), -1324, (((~b48) | 1116082776) * 1324) + 818885255, 1814010030);
                                            long j84 = (i167 & c6) | (i167 ^ c6);
                                            if (j74 > 0 && j84 > 0) {
                                                PngjBadCrcException.onErrorResponse.PngjBadCrcException();
                                                if (j84 - 3 < j74) {
                                                    z3 = true;
                                                    if (!z3) {
                                                        PngjUnsupportedException = (PngjOutputException + 7) % 128;
                                                        Object[] objArr81 = {new int[]{(i & (-248)) | (i70 & 247)}, new int[]{r1 ^ (r1 << 5)}, null, new int[]{i}};
                                                        int i168 = (((~(978758662 | i70)) | 38964230) * 495) + ((r3 * 495) - 1072858198);
                                                        int i169 = -(-(i168 * 530));
                                                        int i170 = ((9538 | i169) << 1) - (i169 ^ 9538);
                                                        int i171 = ~((i70 & 16) | (i70 ^ 16));
                                                        int i172 = ~((i168 ^ 16) | (i168 & 16));
                                                        int i173 = -(-(((i171 & i172) | (i171 ^ i172)) * 529));
                                                        int i174 = ~i168;
                                                        int i175 = ~((i & 16) | (i ^ 16));
                                                        int i176 = ((((i170 ^ i173) + ((i173 & i170) << 1)) - (~(-(-(((i175 & i174) | (i174 ^ i175)) * 529))))) - 1) + i2;
                                                        int i177 = i176 << 13;
                                                        int i178 = (i177 & (~i176)) | ((~i177) & i176);
                                                        int i179 = i178 >>> 17;
                                                        int i180 = (i178 | i179) & (~(i178 & i179));
                                                        return objArr81;
                                                    }
                                                    Object[] objArr82 = new Object[1];
                                                    b(null, 126 - (~TextUtils.indexOf("", "", 0)), null, "\u0088\u008a\u0081\u0082\u008e\u0089\u0088\u0095\u009b\u008b\u0089\u008f\u008d\u0088\u0090\u0095\u0090\u008e\u0095\u0090\u0093\u0090\u0095", objArr82);
                                                    Object[] objArr83 = {(String) objArr82[0]};
                                                    Object PngjBadSignature19 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-936033973);
                                                    if (PngjBadSignature19 == null) {
                                                        char alpha = (char) (29467 - Color.alpha(0));
                                                        int deadChar = KeyEvent.getDeadChar(0, 0) + 39;
                                                        int i181 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 431;
                                                        byte b49 = $$a[4];
                                                        byte b50 = (byte) (b49 + 1);
                                                        byte b51 = b49;
                                                        Object[] objArr84 = new Object[1];
                                                        a(b50, b51, (byte) (b51 + 1), objArr84);
                                                        PngjBadSignature19 = com.d.e.a.PngjBadCrcException.PngjBadSignature(alpha, deadChar, i181, 886713584, false, (String) objArr84[0], new Class[]{cls2});
                                                    }
                                                    long longValue12 = ((Long) ((Method) PngjBadSignature19).invoke(null, objArr83)).longValue();
                                                    long j85 = 462253610;
                                                    long j86 = 959;
                                                    long j87 = longValue12 ^ j69;
                                                    long myTid4 = Process.myTid();
                                                    long j88 = myTid4 ^ j69;
                                                    long j89 = ((j86 * (((j88 | j85) ^ j69) | ((j87 | myTid4) ^ j69))) + (((-959) * j87) + (((((j87 | j88) ^ j69) | ((j85 | myTid4) ^ j69)) * j86) + (((-1917) * longValue12) + (960 * j85))))) - 1610966258;
                                                    int i182 = ((int) (j89 >> 32)) & ((((~((-1078381392) | i)) | (-1432865632)) * 433) + (((~((-358845020) | i)) | (-1078381392)) * (-433)) + (((~((-1074020613) | i70)) * 433) - 884377354));
                                                    int i183 = ((int) j89) & ((((~((~Process.myPid()) | 2071911934)) | 16810064) * 521) + (((~(2071911934 | r6)) * 521) - 176008324));
                                                    long j90 = (i182 & i183) | (i182 ^ i183);
                                                    Object[] objArr85 = new Object[1];
                                                    c("\u0000\u0001\u0001\u0001", true, new int[]{214, 4, 66, 0}, objArr85);
                                                    Object[] objArr86 = {(String) objArr85[0]};
                                                    Object PngjBadSignature20 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-936033973);
                                                    if (PngjBadSignature20 == null) {
                                                        char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 29467);
                                                        int i184 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 38;
                                                        int capsMode3 = TextUtils.getCapsMode("", 0, 0) + 432;
                                                        byte b52 = $$a[4];
                                                        byte b53 = (byte) (b52 + 1);
                                                        byte b54 = b52;
                                                        Object[] objArr87 = new Object[1];
                                                        a(b53, b54, (byte) (b54 + 1), objArr87);
                                                        PngjBadSignature20 = com.d.e.a.PngjBadCrcException.PngjBadSignature(edgeSlop, i184, capsMode3, 886713584, false, (String) objArr87[0], new Class[]{cls2});
                                                    }
                                                    long longValue13 = ((Long) ((Method) PngjBadSignature20).invoke(null, objArr86)).longValue();
                                                    long j91 = -902954895;
                                                    long j92 = (334 * longValue13) + ((-665) * j91);
                                                    long j93 = j91 ^ j69;
                                                    long j94 = ((-333) * j93) + j92;
                                                    long j95 = 333;
                                                    long j96 = ((j95 * (((j82 | longValue13) ^ j69) | ((j93 | j79) ^ j69))) + (((((j93 | j82) ^ j69) | ((longValue13 | j79) ^ j69)) * j95) + j94)) - 245757753;
                                                    int startUptimeMillis3 = (int) Process.getStartUptimeMillis();
                                                    int i185 = ((int) (j96 >> 32)) & (((startUptimeMillis3 | (-711475307)) * 744) + (((~startUptimeMillis3) | (-2146265579)) * 744) + (((~((-996763883) | startUptimeMillis3)) | 711475306 | (~((-1860977003) | startUptimeMillis3))) * (-744)) + 1587634074);
                                                    int i186 = ~a.a();
                                                    int i187 = ((int) j96) & ((((~(1176350841 | i186)) | 573196709) * 764) + (((~(i186 | 1681390044)) | 34078753) * (-1528)) + (((1681390044 | r7) * 764) - 1126892975));
                                                    long j97 = (i185 & i187) | (i185 ^ i187);
                                                    if (j90 > 0 && j97 > 0) {
                                                        if ((j97 + 100 < j90 ? '!' : (char) 25) == '!') {
                                                            z4 = true;
                                                            if ((!z4 ? (char) 15 : ' ') != 15) {
                                                                PngjOutputException = (PngjUnsupportedException + 13) % 128;
                                                                Object[] objArr88 = {new int[]{r5}, new int[1], null, new int[]{i}};
                                                                int i188 = (~(i & 248)) & (i | 248);
                                                                int startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
                                                                int i189 = ~startElapsedRealtime2;
                                                                int i190 = (((~(startElapsedRealtime2 | 164374792)) | 840044613 | (~(i189 | (-134228225)))) * 369) + (((~((-164374793) | i189)) | 870191181) * (-369)) + ((1004419405 | i189) * (-369)) + 537320666;
                                                                int i191 = (i190 ^ 16) + ((i190 & 16) << 1);
                                                                int i192 = (i2 & i191) + (i2 | i191);
                                                                int i193 = i192 << 13;
                                                                int i194 = (i192 | i193) & (~(i192 & i193));
                                                                int i195 = i194 >>> 17;
                                                                int i196 = ((~i194) & i195) | ((~i195) & i194);
                                                                int i197 = i196 << 5;
                                                                ((int[]) objArr88[1])[0] = ((~i196) & i197) | ((~i197) & i196);
                                                                return objArr88;
                                                            }
                                                            Object[] objArr89 = new Object[1];
                                                            c("\u0001\u0000\u0001\u0001\u0000\u0000\u0000", true, new int[]{218, 7, 0, 0}, objArr89);
                                                            String str32 = (String) objArr89[0];
                                                            Object[] objArr90 = new Object[1];
                                                            c("\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000", true, new int[]{225, 11, 68, 0}, objArr90);
                                                            String str33 = (String) objArr90[0];
                                                            Object[] objArr91 = new Object[1];
                                                            c("\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001", false, new int[]{236, 12, 157, 7}, objArr91);
                                                            String str34 = (String) objArr91[0];
                                                            int i198 = -Drawable.resolveOpacity(0, 0);
                                                            int i199 = (i198 ^ 127) + ((i198 & 127) << 1);
                                                            Object[] objArr92 = new Object[1];
                                                            b(null, i199, null, "\u0089\u008f\u0098\u009b\u0095\u0094\u0088\u0092\u0090\u0093\u0090\u0095", objArr92);
                                                            String str35 = (String) objArr92[0];
                                                            Object[] objArr93 = new Object[1];
                                                            b(null, (ViewConfiguration.getLongPressTimeout() >> 16) + 127, null, "\u0089\u008f\u0098\u0095\u0081\u0082\u0086\u0089\u0088\u009a\u0095", objArr93);
                                                            String str36 = (String) objArr93[0];
                                                            Object[] objArr94 = new Object[1];
                                                            b(null, 126 - (~Color.alpha(0)), null, "\u0089\u008f\u0098\u0090\u0095", objArr94);
                                                            String str37 = (String) objArr94[0];
                                                            Object[] objArr95 = new Object[1];
                                                            c("\u0000\u0000\u0001\u0001", false, new int[]{248, 4, 139, 0}, objArr95);
                                                            String[] strArr5 = {str32, str33, str34, str35, str36, str37, (String) objArr95[0]};
                                                            int i200 = 0;
                                                            while (true) {
                                                                if (i200 >= 7) {
                                                                    i10 = 0;
                                                                    break;
                                                                }
                                                                Object[] objArr96 = {strArr5[i200]};
                                                                Object PngjBadSignature21 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1492900309);
                                                                if (PngjBadSignature21 == null) {
                                                                    char mirror = (char) ('0' - AndroidCharacter.getMirror('0'));
                                                                    int indexOf5 = 35 - TextUtils.indexOf("", "", 0, 0);
                                                                    int makeMeasureSpec4 = 397 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                                                    byte b55 = $$a[4];
                                                                    byte b56 = (byte) (b55 + 1);
                                                                    byte b57 = b55;
                                                                    Object[] objArr97 = new Object[1];
                                                                    a(b56, b57, (byte) (b57 + 1), objArr97);
                                                                    PngjBadSignature21 = com.d.e.a.PngjBadCrcException.PngjBadSignature(mirror, indexOf5, makeMeasureSpec4, 1542146960, false, (String) objArr97[0], new Class[]{cls2});
                                                                }
                                                                long longValue14 = ((Long) ((Method) PngjBadSignature21).invoke(null, objArr96)).longValue();
                                                                long j98 = 1616678973;
                                                                long j99 = j98 ^ j69;
                                                                long j100 = longValue14 ^ j69;
                                                                long j101 = 490;
                                                                long j102 = ((j101 * j99) + (((((j100 | j98) ^ j69) | ((j100 | j79) ^ j69)) * j101) + (((-490) * ((j99 | j100) | j82)) + (((-489) * longValue14) + (491 * j98))))) - 1981257752;
                                                                int myPid4 = Process.myPid();
                                                                int i201 = ((int) (j102 >> 32)) & ((((~(myPid4 | 1948546526)) | (~(511320115 | myPid4)) | (-2122216960)) * 623) + (((~myPid4) | 337649682) * (-623)) + ((~(2122216959 | myPid4)) * 623) + 630819704);
                                                                int i202 = (int) j102;
                                                                int i203 = ~((int) Process.getStartElapsedRealtime());
                                                                int i204 = i202 & ((((~(i203 | 771774085)) | (-665452325)) * 160) + (((~(i203 | (-665452325))) | 637556228) * (-160)) + 885711861);
                                                                if ((((i201 & i204) | (i201 ^ i204)) != 0 ? (char) 29 : '%') != '%') {
                                                                    i10 = (i200 & 90) + (i200 | 90);
                                                                    break;
                                                                }
                                                                i200 = ((i200 | 1) << 1) - (i200 ^ 1);
                                                            }
                                                            if (i10 != 0) {
                                                                Object[] objArr98 = {new int[]{i10 ^ i}, new int[1], null, new int[]{i}};
                                                                int c7 = a.c((~(i | (-553650177))) | 407449941, 446, (((~((-590383105) | i70)) | 36732928) * 446) - 820357313, -796983296);
                                                                int PngjBadCrcException5 = PngjBadCrcException.onErrorResponse.PngjBadCrcException();
                                                                int i205 = ~c7;
                                                                int i206 = ~((i205 & (-17)) | ((-17) ^ i205));
                                                                int i207 = ~PngjBadCrcException5;
                                                                int i208 = ~((-17) | i207);
                                                                int i209 = (i206 & i208) | (i206 ^ i208);
                                                                int i210 = (c7 ^ 16) | (c7 & 16);
                                                                int i211 = ~((PngjBadCrcException5 & i210) | (i210 ^ PngjBadCrcException5));
                                                                int i212 = (((i209 & i211) | (i209 ^ i211)) * (-502)) + ((c7 | 16) * (-502)) + (c7 * 503) + 8048;
                                                                int i213 = ((-17) & i207) | ((-17) ^ i207);
                                                                int i214 = -(-(((~((c7 & i213) | (i213 ^ c7))) | i211) * 502));
                                                                int i215 = -(-((i212 ^ i214) + ((i214 & i212) << 1)));
                                                                int i216 = ((i2 | i215) << 1) - (i215 ^ i2);
                                                                int i217 = i216 << 13;
                                                                int i218 = (i217 | i216) & (~(i216 & i217));
                                                                int i219 = i218 >>> 17;
                                                                int i220 = ((~i218) & i219) | ((~i219) & i218);
                                                                ((int[]) objArr98[1])[0] = i220 ^ (i220 << 5);
                                                                return objArr98;
                                                            }
                                                            try {
                                                                objArr2 = new Object[1];
                                                                c("\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001", false, new int[]{252, 13, 0, 0}, objArr2);
                                                            } catch (Exception unused) {
                                                            }
                                                            try {
                                                                Object[] objArr99 = {(String) objArr2[0]};
                                                                Object PngjBadSignature22 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i8);
                                                                if (PngjBadSignature22 == null) {
                                                                    char maximumFlingVelocity = (char) (8752 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                                                    int lastIndexOf3 = 23 - TextUtils.lastIndexOf("", '0', 0);
                                                                    int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 336;
                                                                    byte b58 = $$a[4];
                                                                    byte b59 = (byte) (b58 + 1);
                                                                    byte b60 = b58;
                                                                    Object[] objArr100 = new Object[1];
                                                                    a(b59, b60, (byte) (b60 + 1), objArr100);
                                                                    PngjBadSignature22 = com.d.e.a.PngjBadCrcException.PngjBadSignature(maximumFlingVelocity, lastIndexOf3, offsetAfter2, -598779726, false, (String) objArr100[0], new Class[]{cls2});
                                                                }
                                                                String str38 = (String) ((Method) PngjBadSignature22).invoke(null, objArr99);
                                                                if (str38 != null) {
                                                                    int indexOf6 = TextUtils.indexOf((CharSequence) "", '0', 0);
                                                                    int i221 = indexOf6 * (-515);
                                                                    int i222 = ((i221 | 66176) << 1) - (i221 ^ 66176);
                                                                    int i223 = ~(((-129) ^ i) | ((-129) & i));
                                                                    int i224 = ~i;
                                                                    int i225 = ~((i224 ^ indexOf6) | (i224 & indexOf6));
                                                                    int i226 = (i223 & i225) | (i223 ^ i225);
                                                                    int i227 = ~((i224 & 128) | (i224 ^ 128));
                                                                    int i228 = -(-(((i226 & i227) | (i226 ^ i227)) * (-516)));
                                                                    int i229 = ((i222 | i228) << 1) - (i228 ^ i222);
                                                                    int i230 = ~indexOf6;
                                                                    int i231 = (i230 ^ (-129)) | (i230 & (-129));
                                                                    int i232 = ~((i231 & i) | (i231 ^ i));
                                                                    int i233 = ~((i230 ^ i70) | (i230 & i70) | 128);
                                                                    int i234 = (((i232 & i233) | (i232 ^ i233)) * 516) + i229;
                                                                    int i235 = ~((i230 & 128) | (i230 ^ 128));
                                                                    int i236 = ~((i70 ^ 128) | (i70 & 128));
                                                                    int i237 = ((i235 & i236) | (i235 ^ i236)) * 516;
                                                                    int i238 = (i234 & i237) + (i237 | i234);
                                                                    Object[] objArr101 = new Object[1];
                                                                    b(null, i238, null, "\u0086\u0082\u0094\u0089\u0088\u008c\u0082\u0089\u0085\u0093\u008a", objArr101);
                                                                    String[] strArr6 = {(String) objArr101[0]};
                                                                    int i239 = 0;
                                                                    while (true) {
                                                                        if (i239 > 0) {
                                                                            z6 = false;
                                                                            break;
                                                                        }
                                                                        if (str38.contains(strArr6[i239])) {
                                                                            z6 = true;
                                                                            break;
                                                                        }
                                                                        i239++;
                                                                    }
                                                                }
                                                                Object[] objArr102 = new Object[1];
                                                                c("\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001", true, new int[]{265, 18, 127, 0}, objArr102);
                                                                try {
                                                                    Object[] objArr103 = {(String) objArr102[0]};
                                                                    Object PngjBadSignature23 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i8);
                                                                    if (PngjBadSignature23 == null) {
                                                                        char indexOf7 = (char) (8751 - TextUtils.indexOf((CharSequence) "", '0', 0));
                                                                        int rgb = Color.rgb(0, 0, 0) + 16777240;
                                                                        int combineMeasuredStates = 336 - View.combineMeasuredStates(0, 0);
                                                                        byte b61 = $$a[4];
                                                                        byte b62 = (byte) (b61 + 1);
                                                                        byte b63 = b61;
                                                                        Object[] objArr104 = new Object[1];
                                                                        a(b62, b63, (byte) (b63 + 1), objArr104);
                                                                        PngjBadSignature23 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf7, rgb, combineMeasuredStates, -598779726, false, (String) objArr104[0], new Class[]{cls2});
                                                                    }
                                                                    Object invoke6 = ((Method) PngjBadSignature23).invoke(null, objArr103);
                                                                    if (invoke6 != null) {
                                                                        Object[] objArr105 = new Object[1];
                                                                        b(null, 127 - View.getDefaultSize(0, 0), null, "\u008c\u0089\u008f\u0089\u0089\u008b\u0081", objArr105);
                                                                        if (invoke6.equals((String) objArr105[0])) {
                                                                            Object[] objArr106 = new Object[1];
                                                                            c("\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001", true, new int[]{283, 23, 0, 15}, objArr106);
                                                                            try {
                                                                                Object[] objArr107 = {(String) objArr106[0]};
                                                                                Object PngjBadSignature24 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i8);
                                                                                if (PngjBadSignature24 == null) {
                                                                                    char maximumDrawingCacheSize = (char) (8752 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                                                                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 24;
                                                                                    int scrollBarSize = 336 - (ViewConfiguration.getScrollBarSize() >> 8);
                                                                                    byte b64 = $$a[4];
                                                                                    byte b65 = (byte) (b64 + 1);
                                                                                    byte b66 = b64;
                                                                                    Object[] objArr108 = new Object[1];
                                                                                    a(b65, b66, (byte) (b66 + 1), objArr108);
                                                                                    PngjBadSignature24 = com.d.e.a.PngjBadCrcException.PngjBadSignature(maximumDrawingCacheSize, absoluteGravity, scrollBarSize, -598779726, false, (String) objArr108[0], new Class[]{cls2});
                                                                                }
                                                                                String str39 = (String) ((Method) PngjBadSignature24).invoke(null, objArr107);
                                                                                if (str39 != null) {
                                                                                    int parseInt = Integer.parseInt(str39);
                                                                                    if ((parseInt != 0 ? 'U' : 'I') == 'U') {
                                                                                        i11 = parseInt + 170;
                                                                                        if (i11 == 0) {
                                                                                            Object[] objArr109 = {new int[]{(i11 | i) & (~(i & i11))}, new int[1], null, new int[]{i}};
                                                                                            int i240 = (((~((-483565542) | i)) | (~(i70 | 551000432))) * 333) + (((~((-483565542) | i70)) | (~(i | 551000432))) * 333) + 2015548529;
                                                                                            int PngjBadCrcException6 = PngjBadCrcException.onErrorResponse.PngjBadCrcException();
                                                                                            int i241 = -(-(i240 * 185));
                                                                                            int i242 = ((-2928) ^ i241) + ((i241 & (-2928)) << 1);
                                                                                            int i243 = -(-(((i240 ^ (-17)) | (i240 & (-17))) * (-368)));
                                                                                            int i244 = (i242 ^ i243) + ((i243 & i242) << 1);
                                                                                            int i245 = ~i240;
                                                                                            int i246 = (i245 ^ 16) | (i245 & 16);
                                                                                            int i247 = ~PngjBadCrcException6;
                                                                                            int i248 = (((i246 & i247) | (i246 ^ i247)) * 184) + i244;
                                                                                            int i249 = ~(i245 | (-17));
                                                                                            int i250 = ~((i247 & 16) | (i247 ^ 16));
                                                                                            int i251 = (i250 & i249) | (i249 ^ i250);
                                                                                            int i252 = ~((i240 & 16) | (i240 ^ 16));
                                                                                            int i253 = (((i252 & i251) | (i251 ^ i252)) * 184) + i248;
                                                                                            int i254 = ((i2 | i253) << 1) - (i253 ^ i2);
                                                                                            int i255 = i254 << 13;
                                                                                            int i256 = (i255 | i254) & (~(i254 & i255));
                                                                                            int i257 = i256 >>> 17;
                                                                                            int i258 = (i256 | i257) & (~(i256 & i257));
                                                                                            int i259 = i258 << 5;
                                                                                            ((int[]) objArr109[1])[0] = (i258 | i259) & (~(i258 & i259));
                                                                                            return objArr109;
                                                                                        }
                                                                                        Object[] objArr110 = new Object[1];
                                                                                        c("\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001", false, new int[]{252, 13, 0, 0}, objArr110);
                                                                                        Object[] objArr111 = {(String) objArr110[0]};
                                                                                        Object PngjBadSignature25 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i8);
                                                                                        if (PngjBadSignature25 == null) {
                                                                                            char green4 = (char) (8752 - Color.green(0));
                                                                                            int normalizeMetaState = 24 - KeyEvent.normalizeMetaState(0);
                                                                                            int threadPriority3 = 336 - ((Process.getThreadPriority(0) + 20) >> 6);
                                                                                            byte b67 = $$a[4];
                                                                                            byte b68 = (byte) (b67 + 1);
                                                                                            byte b69 = b67;
                                                                                            Object[] objArr112 = new Object[1];
                                                                                            a(b68, b69, (byte) (b69 + 1), objArr112);
                                                                                            PngjBadSignature25 = com.d.e.a.PngjBadCrcException.PngjBadSignature(green4, normalizeMetaState, threadPriority3, -598779726, false, (String) objArr112[0], new Class[]{cls2});
                                                                                        }
                                                                                        Object invoke7 = ((Method) PngjBadSignature25).invoke(null, objArr111);
                                                                                        if (invoke7 != null) {
                                                                                            int gidForName2 = Process.getGidForName("");
                                                                                            int i260 = (gidForName2 & 128) + (gidForName2 | 128);
                                                                                            Object[] objArr113 = new Object[1];
                                                                                            b(null, i260, null, "\u0086\u0082\u0094\u0089\u0088\u008c\u0082\u0089\u0085\u0093\u008a", objArr113);
                                                                                            Object[] objArr114 = {invoke7, new String[]{(String) objArr113[0]}};
                                                                                            Object PngjBadSignature26 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-344601997);
                                                                                            if (PngjBadSignature26 == null) {
                                                                                                char makeMeasureSpec5 = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 26716);
                                                                                                int lastIndexOf4 = TextUtils.lastIndexOf("", '0') + 34;
                                                                                                int doubleTapTimeout = 1668 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                                                                byte b70 = $$a[4];
                                                                                                byte b71 = (byte) (b70 + 1);
                                                                                                byte b72 = b70;
                                                                                                Object[] objArr115 = new Object[1];
                                                                                                a(b71, b72, (byte) (b72 + 1), objArr115);
                                                                                                String str40 = (String) objArr115[0];
                                                                                                cls4 = cls2;
                                                                                                PngjBadSignature26 = com.d.e.a.PngjBadCrcException.PngjBadSignature(makeMeasureSpec5, lastIndexOf4, doubleTapTimeout, 396011464, false, str40, new Class[]{cls4, String[].class});
                                                                                            } else {
                                                                                                cls4 = cls2;
                                                                                            }
                                                                                            long longValue15 = ((Long) ((Method) PngjBadSignature26).invoke(null, objArr114)).longValue();
                                                                                            long j103 = -1554558815;
                                                                                            long j104 = -68;
                                                                                            long j105 = j103 ^ j69;
                                                                                            long j106 = longValue15 ^ j69;
                                                                                            cls2 = cls4;
                                                                                            long myUid2 = Process.myUid();
                                                                                            long j107 = myUid2 ^ j69;
                                                                                            long j108 = ((68 * (j105 | ((j106 | j107) ^ j69))) + ((j104 * (((j105 | j107) | longValue15) ^ j69)) + (((((((j105 | j106) | j107) ^ j69) | ((j103 | longValue15) ^ j69)) | ((longValue15 | myUid2) ^ j69)) * j104) + (((-67) * longValue15) + (69 * j103))))) - 132033406;
                                                                                            int elapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                                                                                            int i261 = ~elapsedRealtime2;
                                                                                            int i262 = ~((-665385446) | i261);
                                                                                            int i263 = ((int) (j108 >> 32)) & ((((-2102611857) | i262) * 712) + (((~(elapsedRealtime2 | (-44609638))) | (~(i261 | (-620775809)))) * (-712)) + ((620775808 | i262) * (-712)) + 861316570);
                                                                                            int myTid5 = Process.myTid();
                                                                                            int i264 = ~myTid5;
                                                                                            int i265 = ((int) j108) & ((((~(i264 | (-837121246))) | 2020619640) * 217) + (((~(myTid5 | (-2020619641))) | 811611224) * 217) + (((~((-2020619641) | i264)) | (~((-837121246) | myTid5))) * 217) + 815461776);
                                                                                            if (((i263 & i265) | (i263 ^ i265)) != 1) {
                                                                                                PngjUnsupportedException = (PngjOutputException + 21) % 128;
                                                                                                int i266 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                                                                int i267 = i266 * 399;
                                                                                                int i268 = (i267 ^ 51072) + ((i267 & 51072) << 1);
                                                                                                int i269 = ~i266;
                                                                                                int i270 = ~((i269 ^ 128) | (i269 & 128));
                                                                                                int i271 = ~((-129) | i266);
                                                                                                int i272 = (i270 & i271) | (i270 ^ i271);
                                                                                                int i273 = ~((-129) | i);
                                                                                                int i274 = (((((i272 & i273) | (i272 ^ i273)) * 398) + i268) - (~(((i266 ^ 128) | (i266 & 128)) * (-1194)))) - 1;
                                                                                                int i275 = ~i;
                                                                                                int i276 = ~(((-129) & i275) | ((-129) ^ i275));
                                                                                                int i277 = ~((i269 & 128) | (i269 ^ 128));
                                                                                                int i278 = (i277 & i276) | (i276 ^ i277);
                                                                                                int i279 = ~((-129) | i266);
                                                                                                int i280 = (((i279 & i278) | (i278 ^ i279)) * 398) + i274;
                                                                                                Object[] objArr116 = new Object[1];
                                                                                                b(null, i280, null, "\u0095\u008d\u0085\u008a\u0082\u008d\u0095\u0085\u0092\u0085\u0086\u0095", objArr116);
                                                                                                String str41 = (String) objArr116[0];
                                                                                                Object[] objArr117 = new Object[1];
                                                                                                c("\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001", false, new int[]{306, 16, 184, 14}, objArr117);
                                                                                                String str42 = (String) objArr117[0];
                                                                                                int scrollBarSize2 = ViewConfiguration.getScrollBarSize() >> 8;
                                                                                                int i281 = (scrollBarSize2 ^ 127) + ((scrollBarSize2 & 127) << 1);
                                                                                                Object[] objArr118 = new Object[1];
                                                                                                b(null, i281, null, "\u0095\u0089\u008f\u0098\u009b\u0095\u008d\u0085\u008a\u0082\u008d\u0095\u0085\u0092\u0085\u0086\u0095", objArr118);
                                                                                                String str43 = (String) objArr118[0];
                                                                                                Object[] objArr119 = new Object[1];
                                                                                                c("\u0001\u0001\u0001\u0001\u0001\u0000", true, new int[]{322, 6, 8, 0}, objArr119);
                                                                                                String str44 = (String) objArr119[0];
                                                                                                Object[] objArr120 = new Object[1];
                                                                                                c(null, true, new int[]{202, 12, 65, 5}, objArr120);
                                                                                                String str45 = (String) objArr120[0];
                                                                                                Object[] objArr121 = new Object[1];
                                                                                                b(null, KeyEvent.normalizeMetaState(0) + 127, null, "\u0095\u0092\u009b\u0088\u0083\u0095\u0089\u008f\u0098\u0095\u0094\u0088\u0092\u0090\u0093\u0090\u0095", objArr121);
                                                                                                String str46 = (String) objArr121[0];
                                                                                                int i282 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                                                                                                int i283 = ((i282 | 127) << 1) - (i282 ^ 127);
                                                                                                Object[] objArr122 = new Object[1];
                                                                                                b(null, i283, null, "\u0095\u0088\u008e\u0085\u0090\u008d\u008f\u0085\u008e\u0095\u0089\u008f\u0098\u0095\u0094\u0088\u0092\u0090\u0093\u0090\u0095", objArr122);
                                                                                                String str47 = (String) objArr122[0];
                                                                                                Object[] objArr123 = new Object[1];
                                                                                                c("\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000", false, new int[]{328, 16, 0, 15}, objArr123);
                                                                                                String str48 = (String) objArr123[0];
                                                                                                Object[] objArr124 = new Object[1];
                                                                                                c("\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001", false, new int[]{344, 25, 0, 0}, objArr124);
                                                                                                String str49 = (String) objArr124[0];
                                                                                                int myPid5 = Process.myPid() >> 22;
                                                                                                int i284 = myPid5 * 673;
                                                                                                int i285 = (i284 ^ (-170561)) + ((i284 & (-170561)) << 1);
                                                                                                int i286 = ~((myPid5 ^ i) | (myPid5 & i));
                                                                                                int i287 = -(-(((i286 & 127) | (i286 ^ 127)) * 672));
                                                                                                int i288 = ((i285 | i287) << 1) - (i287 ^ i285);
                                                                                                int i289 = ~myPid5;
                                                                                                int i290 = ~((i289 & i70) | (i289 ^ i70));
                                                                                                int i291 = ~(i | 127);
                                                                                                int i292 = ((i290 & i291) | (i290 ^ i291)) * (-672);
                                                                                                int i293 = (i288 & i292) + (i292 | i288);
                                                                                                int i294 = ~(((-128) ^ i70) | ((-128) & i70));
                                                                                                int i295 = ~((-128) | myPid5);
                                                                                                int i296 = (((i295 & i294) | (i294 ^ i295)) * 672) + i293;
                                                                                                Object[] objArr125 = new Object[1];
                                                                                                b(null, i296, null, "\u0095\u0089\u008f\u0098\u009b\u0095\u0094\u0088\u0092\u0090\u0093\u0090\u0095", objArr125);
                                                                                                int i297 = 0;
                                                                                                String str50 = (String) objArr125[0];
                                                                                                Object[] objArr126 = new Object[1];
                                                                                                b(null, 128 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), null, "\u0095\u0089\u008f\u0098\u0095\u0081\u0090\u008b\u0095", objArr126);
                                                                                                String str51 = (String) objArr126[0];
                                                                                                Object[] objArr127 = new Object[1];
                                                                                                c("\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001", false, new int[]{369, 8, 176, 0}, objArr127);
                                                                                                String[] strArr7 = {str41, str42, str43, str44, str45, str46, str47, str48, str49, str50, str51, (String) objArr127[0]};
                                                                                                int i298 = 0;
                                                                                                while (i298 < 12) {
                                                                                                    StringBuilder sb = new StringBuilder();
                                                                                                    sb.append(strArr7[i298]);
                                                                                                    Object[] objArr128 = new Object[1];
                                                                                                    c("\u0001\u0000", i297, new int[]{114, 2, i297, 1}, objArr128);
                                                                                                    sb.append((String) objArr128[i297]);
                                                                                                    Object[] objArr129 = {sb.toString()};
                                                                                                    Object PngjBadSignature27 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1666380462);
                                                                                                    if (PngjBadSignature27 == null) {
                                                                                                        char capsMode4 = (char) TextUtils.getCapsMode("", i297, i297);
                                                                                                        int maxKeyCode = 28 - (KeyEvent.getMaxKeyCode() >> 16);
                                                                                                        int gidForName3 = Process.getGidForName("") + 1448;
                                                                                                        byte b73 = $$a[4];
                                                                                                        byte b74 = b73;
                                                                                                        Object[] objArr130 = new Object[1];
                                                                                                        a(b73, b74, b74, objArr130);
                                                                                                        PngjBadSignature27 = com.d.e.a.PngjBadCrcException.PngjBadSignature(capsMode4, maxKeyCode, gidForName3, -1614962923, false, (String) objArr130[0], new Class[]{cls2});
                                                                                                    }
                                                                                                    long longValue16 = ((Long) ((Method) PngjBadSignature27).invoke(null, objArr129)).longValue();
                                                                                                    long j109 = -1024264024;
                                                                                                    long j110 = -783;
                                                                                                    long j111 = j109 ^ j69;
                                                                                                    long j112 = (783 * (j111 | ((j82 | longValue16) ^ j69))) + (j110 * (((j111 | j82) | longValue16) ^ j69)) + ((longValue16 ^ j69) * j110) + ((-782) * longValue16) + (784 * j109) + 1494752341;
                                                                                                    int i299 = (int) Runtime.getRuntime().totalMemory();
                                                                                                    int i300 = ((int) (j112 >> 32)) & ((((~((-1572865554) | i299)) | (~((~i299) | (-135639143)))) * 959) + ((((~((-135639143) | i299)) | (~((-1572865554) | r8))) * 959) - 636236319));
                                                                                                    int i301 = ~((int) Runtime.getRuntime().maxMemory());
                                                                                                    int i302 = ((int) j112) & ((((~(i301 | (-751142436))) | 4555265) * 52) + (((~(751142435 | i301)) | (~((-2106598451) | i301)) | 1360011280) * (-52)) + ((~(2111153715 | i301)) * 52) + 327009633);
                                                                                                    if (((i300 & i302) | (i300 ^ i302)) != 0) {
                                                                                                        i12 = i298 + 110;
                                                                                                        break;
                                                                                                    }
                                                                                                    i298 = ((i298 | 1) << 1) - (i298 ^ 1);
                                                                                                    i297 = 0;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        i12 = 0;
                                                                                        if (i12 != 0) {
                                                                                            PngjBadCrcException.onErrorResponse.PngjBadCrcException();
                                                                                            PngjBadCrcException.onErrorResponse.PngjBadCrcException();
                                                                                            Object[] objArr131 = {new int[]{(i12 & i70) | ((~i12) & i)}, new int[1], null, new int[]{i}};
                                                                                            int elapsedRealtime3 = (int) SystemClock.elapsedRealtime();
                                                                                            int i303 = (~(5192366 | elapsedRealtime3)) | 1034961920;
                                                                                            int i304 = ~((~elapsedRealtime3) | (-395947));
                                                                                            int i305 = (((~(elapsedRealtime3 | 1040154286)) | i304) * 470) + ((i303 | i304) * (-470)) + 2135363925;
                                                                                            int i306 = (i2 - (~(((i305 | 16) << 1) - (i305 ^ 16)))) - 1;
                                                                                            int i307 = i306 ^ (i306 << 13);
                                                                                            int i308 = i307 ^ (i307 >>> 17);
                                                                                            ((int[]) objArr131[1])[0] = i308 ^ (i308 << 5);
                                                                                            int i309 = PngjOutputException;
                                                                                            PngjUnsupportedException = ((i309 ^ 17) + ((i309 & 17) << 1)) % 128;
                                                                                            return objArr131;
                                                                                        }
                                                                                        long[] jArr = {472001035};
                                                                                        int i310 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                                                                                        int i311 = ((i310 | 127) << 1) - (i310 ^ 127);
                                                                                        Object[] objArr132 = new Object[1];
                                                                                        b(null, i311, null, "\u0090\u0092\u0089\u008b\u0082\u0094\u0095\u008e\u008d\u0088\u0090\u0095\u008a\u0082\u0081\u0091\u0095", objArr132);
                                                                                        try {
                                                                                            bufferedInputStream2 = new BufferedInputStream(new FileInputStream((String) objArr132[0]));
                                                                                            j2 = 0;
                                                                                        } catch (IOException unused2) {
                                                                                            bufferedInputStream2 = null;
                                                                                        } catch (Throwable th) {
                                                                                            th = th;
                                                                                            bufferedInputStream = null;
                                                                                        }
                                                                                        loop5: while (true) {
                                                                                            try {
                                                                                                try {
                                                                                                    int read = bufferedInputStream2.read();
                                                                                                    if (read != -1) {
                                                                                                        j2 = ((j2 << 5) ^ read) & 1073741823;
                                                                                                        for (int i312 = 0; i312 < 1; i312++) {
                                                                                                            int i313 = PngjUnsupportedException + 125;
                                                                                                            PngjOutputException = i313 % 128;
                                                                                                            if (i313 % 2 == 0) {
                                                                                                                long j113 = jArr[i312];
                                                                                                                throw null;
                                                                                                            }
                                                                                                            if (j2 == jArr[i312]) {
                                                                                                                i13 = (i312 ^ 1) + ((i312 & 1) << 1);
                                                                                                                try {
                                                                                                                    bufferedInputStream2.close();
                                                                                                                    break loop5;
                                                                                                                } catch (Exception unused3) {
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } catch (Throwable th2) {
                                                                                                    th = th2;
                                                                                                    bufferedInputStream = bufferedInputStream2;
                                                                                                    if (bufferedInputStream != null) {
                                                                                                        try {
                                                                                                            bufferedInputStream.close();
                                                                                                        } catch (Exception unused4) {
                                                                                                        }
                                                                                                    }
                                                                                                    throw new RuntimeException(th);
                                                                                                }
                                                                                            } catch (IOException unused5) {
                                                                                            }
                                                                                            try {
                                                                                                bufferedInputStream2.close();
                                                                                                break;
                                                                                            } catch (Exception unused6) {
                                                                                            }
                                                                                        }
                                                                                        if (i13 == 0) {
                                                                                            int i314 = PngjUnsupportedException;
                                                                                            int i315 = (i314 ^ 119) + ((i314 & 119) << 1);
                                                                                            PngjOutputException = i315 % 128;
                                                                                            i14 = i315 % 2 == 0 ? 18986 : 240;
                                                                                        } else {
                                                                                            i14 = 0;
                                                                                        }
                                                                                        if (i14 == 0) {
                                                                                            Object[] objArr133 = {new int[]{i14 ^ i}, new int[]{((~r0) & r1) | ((~r1) & r0)}, null, new int[]{i}};
                                                                                            int A = a.A((~(i | (-9437481))) | 1023750145, 366, (((~((-10126655) | i)) | 1024439319) * (-366)) + 1286803657, -16);
                                                                                            int i316 = (i2 & A) + (A | i2);
                                                                                            int i317 = i316 << 13;
                                                                                            int i318 = (i317 | i316) & (~(i316 & i317));
                                                                                            int i319 = i318 ^ (i318 >>> 17);
                                                                                            int i320 = i319 << 5;
                                                                                            return objArr133;
                                                                                        }
                                                                                        long[] jArr2 = {472001035};
                                                                                        Object[] objArr134 = new Object[1];
                                                                                        b(null, 126 - (~(-KeyEvent.getDeadChar(0, 0))), null, "\u0093\u008a\u008f\u008d\u0082\u0091\u0095\u009b\u008b\u0089\u008f\u008d\u0088\u0090\u0095\u0090\u008e\u0095\u0090\u0093\u0090\u0095", objArr134);
                                                                                        try {
                                                                                            bufferedInputStream4 = new BufferedInputStream(new FileInputStream((String) objArr134[0]));
                                                                                            j = 0;
                                                                                        } catch (IOException unused7) {
                                                                                            bufferedInputStream4 = null;
                                                                                        } catch (Throwable th3) {
                                                                                            th = th3;
                                                                                            bufferedInputStream3 = null;
                                                                                        }
                                                                                        loop7: while (true) {
                                                                                            try {
                                                                                                int read2 = bufferedInputStream4.read();
                                                                                                if (read2 != -1) {
                                                                                                    int i321 = PngjUnsupportedException;
                                                                                                    int i322 = ((i321 | 113) << 1) - (i321 ^ 113);
                                                                                                    PngjOutputException = i322 % 128;
                                                                                                    j = i322 % 2 != 0 ? ((j << 5) ^ read2) & 1073741823 : ((j >>> 2) - read2) - 1073741823;
                                                                                                    int i323 = 0;
                                                                                                    while (true) {
                                                                                                        if ((i323 < 1 ? (char) 19 : 'W') != 'W') {
                                                                                                            if (j == jArr2[i323]) {
                                                                                                                break loop7;
                                                                                                            }
                                                                                                            int i324 = (i323 ^ 48) + ((i323 & 48) << 1);
                                                                                                            i323 = (i324 & (-47)) + (i324 | (-47));
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } catch (IOException unused8) {
                                                                                            } catch (Throwable th4) {
                                                                                                th = th4;
                                                                                                bufferedInputStream3 = bufferedInputStream4;
                                                                                                if (bufferedInputStream3 != null) {
                                                                                                    try {
                                                                                                        bufferedInputStream3.close();
                                                                                                    } catch (Exception unused9) {
                                                                                                    }
                                                                                                }
                                                                                                throw new RuntimeException(th);
                                                                                            }
                                                                                            try {
                                                                                                bufferedInputStream4.close();
                                                                                                break;
                                                                                            } catch (Exception unused10) {
                                                                                            }
                                                                                        }
                                                                                        if (!(i15 == 0)) {
                                                                                            Object[] objArr135 = {new int[]{(i & (-243)) | (i70 & 242)}, new int[1], null, new int[]{i}};
                                                                                            int i325 = ~(a.b(1813306073) | 493262692);
                                                                                            int i326 = ((i325 | 4358496) * 196) + ((488904196 | i325) * (-196)) + 1516242661;
                                                                                            int i327 = ~i326;
                                                                                            int i328 = ~((i327 ^ i) | (i327 & i));
                                                                                            int i329 = ~i;
                                                                                            int i330 = ~((i329 & 16) | (i329 ^ 16));
                                                                                            int i331 = (i328 & i330) | (i328 ^ i330);
                                                                                            int i332 = ~((i70 ^ i326) | (i70 & i326));
                                                                                            int i333 = (((i331 & i332) | (i331 ^ i332)) * (-516)) + ((i326 * 517) - 8240);
                                                                                            int i334 = ~(((-17) & i327) | ((-17) ^ i327) | i);
                                                                                            int i335 = (-17) | i70;
                                                                                            int i336 = ~((i335 & i326) | (i335 ^ i326));
                                                                                            int i337 = -(-(((i334 & i336) | (i334 ^ i336)) * 516));
                                                                                            int i338 = (i333 & i337) + (i337 | i333);
                                                                                            int i339 = ~((i326 & (-17)) | ((-17) ^ i326));
                                                                                            int i340 = -(-(((i339 & i332) | (i339 ^ i332)) * 516));
                                                                                            int i341 = -(-((i338 ^ i340) + ((i340 & i338) << 1)));
                                                                                            int i342 = (i2 ^ i341) + ((i2 & i341) << 1);
                                                                                            int i343 = i342 << 13;
                                                                                            int i344 = (i343 & (~i342)) | ((~i343) & i342);
                                                                                            int i345 = i344 >>> 17;
                                                                                            int i346 = (i344 | i345) & (~(i344 & i345));
                                                                                            int i347 = i346 << 5;
                                                                                            ((int[]) objArr135[1])[0] = ((~i346) & i347) | ((~i347) & i346);
                                                                                            int i348 = ~((236219397 & i70) | (236219397 ^ i70));
                                                                                            int i349 = ~(((-616983656) & i) | ((-616983656) ^ i));
                                                                                            int i350 = ((i348 & i349) | (i348 ^ i349)) * 1900;
                                                                                            int i351 = ~((i70 ^ 616983655) | (i70 & 616983655));
                                                                                            int i352 = ~(((-236219398) ^ i) | ((-236219398) & i));
                                                                                            int i353 = ((((-568027029) | i350) << 1) - (i350 ^ (-568027029))) + (((i351 & i352) | (i351 ^ i352)) * (-950));
                                                                                            int i354 = ((~((616983655 & i) | (616983655 ^ i))) | (~((i70 ^ (-236219398)) | ((-236219398) & i70)))) * 950;
                                                                                            int i355 = (i353 & i354) + (i354 | i353);
                                                                                            int i356 = ~((i & (-1114060284)) | ((-1114060284) ^ i));
                                                                                            int i357 = -(-(((i356 & 1109603753) | (1109603753 ^ i356)) * 576));
                                                                                            int i358 = (579224228 & i357) + (i357 | 579224228);
                                                                                            int i359 = (-1114060284) | i70;
                                                                                            int i360 = ~((i359 & 2007186857) | (i359 ^ 2007186857));
                                                                                            if (i355 <= (i358 - (~(-(-(((i360 & 897583104) | (897583104 ^ i360)) * 576))))) - 818365377) {
                                                                                                int i361 = 13 / 0;
                                                                                            }
                                                                                            return objArr135;
                                                                                        }
                                                                                        Object PngjBadSignature28 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1372235840);
                                                                                        if (PngjBadSignature28 == null) {
                                                                                            char threadPriority4 = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 23942);
                                                                                            int lastIndexOf5 = 23 - TextUtils.lastIndexOf("", '0', 0);
                                                                                            int bitsPerPixel3 = ImageFormat.getBitsPerPixel(0) + 313;
                                                                                            byte b75 = $$a[4];
                                                                                            byte b76 = b75;
                                                                                            Object[] objArr136 = new Object[1];
                                                                                            a(b75, b76, b76, objArr136);
                                                                                            PngjBadSignature28 = com.d.e.a.PngjBadCrcException.PngjBadSignature(threadPriority4, lastIndexOf5, bitsPerPixel3, 1390033531, false, (String) objArr136[0], new Class[0]);
                                                                                        }
                                                                                        long longValue17 = ((Long) ((Method) PngjBadSignature28).invoke(null, null)).longValue();
                                                                                        long j114 = -238664901;
                                                                                        long j115 = 306;
                                                                                        long j116 = 305;
                                                                                        long b77 = a.b(989104411);
                                                                                        long j117 = (j116 * ((longValue17 ^ j69) | ((j114 | (b77 ^ j69)) ^ j69))) + ((((j114 | longValue17) ^ j69) | ((j114 | b77) ^ j69)) * j116) + (j115 * longValue17) + (j115 * j114) + 610 + 385579627;
                                                                                        int myTid6 = Process.myTid();
                                                                                        int i362 = ((int) (j117 >> 32)) & (((myTid6 | (-1073816587)) * 668) + ((316184944 | (~((-1121041467) | myTid6))) * 1336) + ((((~(316184944 | myTid6)) | (-1121041467)) * (-668)) - 1610453550));
                                                                                        int i363 = ~((int) SystemClock.elapsedRealtime());
                                                                                        int i364 = ((int) j117) & ((((~((-1336483936) | i363)) | 1235752213) * 764) + (((~(i363 | (-100742475))) | 5376) * (-1528)) + ((((-100742475) | r8) * 764) - 993057923));
                                                                                        if (((i362 & i364) | (i362 ^ i364)) != 0) {
                                                                                            int i365 = PngjUnsupportedException;
                                                                                            PngjOutputException = (((i365 | 41) << 1) - (i365 ^ 41)) % 128;
                                                                                            z5 = true;
                                                                                        } else {
                                                                                            z5 = false;
                                                                                        }
                                                                                        if (z5) {
                                                                                            PngjOutputException = (PngjUnsupportedException + 107) % 128;
                                                                                            objArr = new Object[]{new int[]{r8}, new int[]{((~r5) & r7) | ((~r7) & r5)}, null, new int[]{i}};
                                                                                            int i366 = (~(i & 264)) & (i | 264);
                                                                                            int i367 = (((~((-557668368) | i)) | 2899974 | (~(1031665999 | i70))) * 988) + (((~((-554768394) | i70)) | (~(1031665999 | i))) * 988) + 1192792113;
                                                                                            int i368 = (i367 & 16) + (i367 | 16);
                                                                                            int i369 = (i2 & i368) + (i368 | i2);
                                                                                            int i370 = (i369 << 13) ^ i369;
                                                                                            int i371 = i370 >>> 17;
                                                                                            int i372 = ((~i370) & i371) | ((~i371) & i370);
                                                                                            int i373 = i372 << 5;
                                                                                            c = 0;
                                                                                        } else {
                                                                                            Object PngjBadSignature29 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-40521023);
                                                                                            if (PngjBadSignature29 == null) {
                                                                                                char c8 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                                                                                                int makeMeasureSpec6 = 28 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                                                                                int axisFromString2 = MotionEvent.axisFromString("") + 1856;
                                                                                                byte b78 = $$a[4];
                                                                                                byte b79 = (byte) (b78 + 1);
                                                                                                byte b80 = b78;
                                                                                                Object[] objArr137 = new Object[1];
                                                                                                a(b79, b80, (byte) (b80 + 1), objArr137);
                                                                                                PngjBadSignature29 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c8, makeMeasureSpec6, axisFromString2, 24829818, false, (String) objArr137[0], new Class[0]);
                                                                                            }
                                                                                            long longValue18 = ((Long) ((Method) PngjBadSignature29).invoke(null, null)).longValue();
                                                                                            long j118 = 208302688;
                                                                                            long j119 = 130;
                                                                                            long j120 = longValue18 ^ j69;
                                                                                            long j121 = (((j120 | j82) | j118) ^ j69) * j119;
                                                                                            long j122 = j120 | j118;
                                                                                            long j123 = ((j119 * ((((j118 ^ j69) | longValue18) ^ j69) | ((j122 | j79) ^ j69))) + (((-260) * (j122 ^ j69)) + (j121 + ((131 * longValue18) + ((-129) * j118))))) - 955668709;
                                                                                            int maxMemory2 = (int) Runtime.getRuntime().maxMemory();
                                                                                            int i374 = ((int) (j123 >> 32)) & (((maxMemory2 | (-33640517)) * 668) + (((-237600077) | (~((-1674826488) | maxMemory2))) * 1336) + ((((~((-237600077) | maxMemory2)) | (-1674826488)) * (-668)) - 1049246978));
                                                                                            int i375 = ((int) j123) & ((((~(1240595200 | i70)) | 34078889) * (-964)) + (((~(1240595200 | i)) | 196631209) * (-964)) + 1498799861);
                                                                                            int i376 = ((i374 & i375) | (i374 ^ i375)) != 0 ? (i & (-282)) | (i70 & 281) : i;
                                                                                            if (i376 != i) {
                                                                                                Object[] objArr138 = {new int[]{i376}, new int[]{((~r0) & r8) | ((~r8) & r0)}, null, new int[]{i}};
                                                                                                int A2 = a.A((~((-845134563) | i70)) | 806715520, -964, (((~((-845134563) | i)) | (-189431412)) * (-964)) + 1772210061, -16);
                                                                                                int i377 = (i2 ^ A2) + ((A2 & i2) << 1);
                                                                                                int i378 = i377 << 13;
                                                                                                int i379 = (i378 & (~i377)) | ((~i378) & i377);
                                                                                                int i380 = i379 >>> 17;
                                                                                                int i381 = (i379 | i380) & (~(i379 & i380));
                                                                                                int i382 = i381 << 5;
                                                                                                objArr = objArr138;
                                                                                            } else {
                                                                                                Object PngjBadSignature30 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-792668357);
                                                                                                if (PngjBadSignature30 == null) {
                                                                                                    char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 30094);
                                                                                                    int scrollBarSize3 = (ViewConfiguration.getScrollBarSize() >> 8) + 45;
                                                                                                    int i383 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1810;
                                                                                                    byte b81 = $$a[4];
                                                                                                    byte b82 = b81;
                                                                                                    Object[] objArr139 = new Object[1];
                                                                                                    a(b81, b82, b82, objArr139);
                                                                                                    PngjBadSignature30 = com.d.e.a.PngjBadCrcException.PngjBadSignature(pressedStateDuration, scrollBarSize3, i383, 741325440, false, (String) objArr139[0], new Class[0]);
                                                                                                }
                                                                                                long longValue19 = ((Long) ((Method) PngjBadSignature30).invoke(null, null)).longValue();
                                                                                                long j124 = -1530462549;
                                                                                                long j125 = 217;
                                                                                                long j126 = j124 ^ j69;
                                                                                                long j127 = longValue19 ^ j69;
                                                                                                long j128 = (j125 * (j124 | ((j127 | j82) ^ j69))) + ((((j126 | j127) ^ j69) | ((j126 | j79) ^ j69)) * j125) + ((((j126 | j82) ^ j69) | ((j127 | j79) ^ j69)) * j125) + ((-216) * longValue19) + ((-433) * j124) + 1886197093;
                                                                                                int i384 = (~((-550748073) | i70)) | 76200 | (~(886478338 | i70));
                                                                                                int i385 = ((int) (j128 >> 32)) & ((((~((-886478339) | i70)) | (~(550748072 | i70))) * 590) + (i384 * (-1180)) + (((~((-335806467) | i)) | i384) * 590) + 924865086);
                                                                                                int i386 = (int) j128;
                                                                                                int i387 = ~a.a();
                                                                                                if ((i385 | (i386 & ((((~(i387 | (-1969310668))) | 1090584897) * 983) + (((~((-888430219) | i387)) | (-1969310668)) * (-983)) + 1457507690))) != 0) {
                                                                                                    objArr = new Object[]{new int[]{(i & (-269)) | (i70 & 268)}, new int[1], null, new int[]{i}};
                                                                                                    int maxMemory3 = (int) Runtime.getRuntime().maxMemory();
                                                                                                    int d2 = a.d((~(maxMemory3 | (-99628299))) | (-939144524), 49, (((~((~maxMemory3) | (-934937676))) | (-99628299) | (~(934937675 | maxMemory3))) * (-49)) + ((((~((-99628299) | r7)) | 4206848) * 98) - 1571766820), 16, i2);
                                                                                                    int i388 = d2 ^ (d2 << 13);
                                                                                                    int i389 = i388 >>> 17;
                                                                                                    int i390 = (i388 | i389) & (~(i388 & i389));
                                                                                                    ((int[]) objArr[1])[0] = i390 ^ (i390 << 5);
                                                                                                } else {
                                                                                                    Object PngjBadSignature31 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-25572490);
                                                                                                    if (PngjBadSignature31 == null) {
                                                                                                        char keyRepeatDelay2 = (char) (30094 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                                                                                                        int argb = 45 - Color.argb(0, 0, 0, 0);
                                                                                                        int i391 = 1809 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                                                                        byte b83 = $$a[4];
                                                                                                        byte b84 = (byte) (b83 + 1);
                                                                                                        byte b85 = b83;
                                                                                                        Object[] objArr140 = new Object[1];
                                                                                                        a(b84, b85, (byte) (b85 + 1), objArr140);
                                                                                                        PngjBadSignature31 = com.d.e.a.PngjBadCrcException.PngjBadSignature(keyRepeatDelay2, argb, i391, 43427533, false, (String) objArr140[0], new Class[0]);
                                                                                                    }
                                                                                                    long longValue20 = ((Long) ((Method) PngjBadSignature31).invoke(null, null)).longValue();
                                                                                                    long j129 = 29086571;
                                                                                                    long j130 = -494;
                                                                                                    long j131 = 495;
                                                                                                    long b86 = (a.b(415576620) ^ j69) | j129;
                                                                                                    long j132 = ((j131 * ((((j129 ^ j69) | (longValue20 ^ j69)) ^ j69) | (b86 ^ j69))) + ((j131 * b86) + (((-495) * ((j129 | longValue20) ^ j69)) + ((j130 * longValue20) + (j130 * j129))))) - 1627325357;
                                                                                                    int b87 = a.b(1499973375);
                                                                                                    if (((((int) (j132 >> 32)) & ((((~(b87 | (-1407899936))) | (-29326476)) * 502) + ((~((~b87) | (-1385601))) * (-502)) + (((~((-29326476) | b87)) | (-1409285536)) * (-502)) + 883084146)) | (((int) j132) & ((((~(309398903 | i)) | (-1400458616)) * 116) + (((-1127827507) | i) * 116) + ((~((-36767795) | i70)) * (-116)) + 2072280017))) != 0) {
                                                                                                        int i392 = PngjUnsupportedException;
                                                                                                        PngjOutputException = (((i392 | 55) << 1) - (i392 ^ 55)) % 128;
                                                                                                        objArr = new Object[]{new int[]{(i & (-267)) | (i70 & 266)}, new int[1], null, new int[]{i}};
                                                                                                        int startElapsedRealtime3 = (int) Process.getStartElapsedRealtime();
                                                                                                        int i393 = (i2 - (~(-(-a.A((~((~startElapsedRealtime3) | (-201359362))) | 827409476, 521, ((~((-201359362) | startElapsedRealtime3)) * 521) + 1916913896, -16))))) - 1;
                                                                                                        int i394 = i393 << 13;
                                                                                                        int i395 = (i393 | i394) & (~(i393 & i394));
                                                                                                        int i396 = i395 ^ (i395 >>> 17);
                                                                                                        int i397 = i396 << 5;
                                                                                                        c = 0;
                                                                                                        ((int[]) objArr[1])[0] = (i396 | i397) & (~(i396 & i397));
                                                                                                    } else {
                                                                                                        Object PngjBadSignature32 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-2091466614);
                                                                                                        if (PngjBadSignature32 == null) {
                                                                                                            char combineMeasuredStates2 = (char) (45717 - View.combineMeasuredStates(0, 0));
                                                                                                            int alpha2 = 40 - Color.alpha(0);
                                                                                                            int maximumFlingVelocity2 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 625;
                                                                                                            byte b88 = $$a[4];
                                                                                                            byte b89 = b88;
                                                                                                            Object[] objArr141 = new Object[1];
                                                                                                            a(b88, b89, b89, objArr141);
                                                                                                            PngjBadSignature32 = com.d.e.a.PngjBadCrcException.PngjBadSignature(combineMeasuredStates2, alpha2, maximumFlingVelocity2, 2142874929, false, (String) objArr141[0], new Class[0]);
                                                                                                        }
                                                                                                        long longValue21 = ((Long) ((Method) PngjBadSignature32).invoke(null, null)).longValue();
                                                                                                        long j133 = -278978137;
                                                                                                        long j134 = 614;
                                                                                                        long j135 = j133 ^ j69;
                                                                                                        long j136 = (j135 | longValue21) ^ j69;
                                                                                                        long j137 = longValue21 ^ j69;
                                                                                                        long j138 = (j134 * ((((j135 | j137) | j82) ^ j69) | (((j82 | j133) | longValue21) ^ j69))) + ((-1228) * (((j135 | j82) ^ j69) | j136 | ((j82 | longValue21) ^ j69))) + ((j79 | j136 | ((j137 | j133) ^ j69)) * j134) + ((-613) * longValue21) + (615 * j133) + 1615781419;
                                                                                                        int i398 = ((int) (j138 >> 32)) & ((((~((~((int) Process.getStartUptimeMillis())) | (-8454545))) | (-2062505984)) * 521) + (((~((-8454545) | r7)) * 521) - 2143797350));
                                                                                                        int i399 = ~Process.myPid();
                                                                                                        if ((i398 | (((int) j138) & ((((~(i399 | 746619203)) | (-690607207)) * 160) + (((~(i399 | (-690607207))) | 671121474) * (-160)) + 1690997749))) != 0) {
                                                                                                            objArr = new Object[]{new int[]{r7}, new int[1], null, new int[]{i}};
                                                                                                            int i400 = (~(i & 280)) & (i | 280);
                                                                                                            int i401 = (((~((-274707093) | i70)) | 759858881) * 217) + (((~((-759858882) | i)) | 4883072) * 217) + ((((~((-759858882) | i70)) | (~((-274707093) | i))) * 217) - 1808570705);
                                                                                                            int i402 = (i401 & 16) + (i401 | 16);
                                                                                                            int PngjBadCrcException7 = PngjBadCrcException.onErrorResponse.PngjBadCrcException();
                                                                                                            int i403 = i402 * (-464);
                                                                                                            int i404 = i2 * (-929);
                                                                                                            int i405 = (i403 ^ i404) + ((i403 & i404) << 1);
                                                                                                            int i406 = ~i402;
                                                                                                            int i407 = (i2 ^ PngjBadCrcException7) | (i2 & PngjBadCrcException7);
                                                                                                            int i408 = ~i407;
                                                                                                            int i409 = -(-(((i406 & i408) | (i406 ^ i408)) * (-465)));
                                                                                                            int i410 = ((i405 | i409) << 1) - (i409 ^ i405);
                                                                                                            int i411 = ~i402;
                                                                                                            int i412 = -(-(((~(PngjBadCrcException7 | i411)) | i2) * 930));
                                                                                                            int i413 = ((i410 | i412) << 1) - (i412 ^ i410);
                                                                                                            int i414 = (i411 | i407) * 465;
                                                                                                            int i415 = ((i413 | i414) << 1) - (i414 ^ i413);
                                                                                                            int i416 = i415 << 13;
                                                                                                            int i417 = (i416 | i415) & (~(i415 & i416));
                                                                                                            int i418 = i417 >>> 17;
                                                                                                            int i419 = ((~i417) & i418) | ((~i418) & i417);
                                                                                                            int i420 = i419 << 5;
                                                                                                            c = 0;
                                                                                                            ((int[]) objArr[1])[0] = ((~i419) & i420) | ((~i420) & i419);
                                                                                                        } else {
                                                                                                            objArr = new Object[]{new int[]{i}, new int[]{((~r5) & r8) | ((~r8) & r5)}, null, new int[]{i}};
                                                                                                            int i421 = (i2 - (~(((((~((-579065209) | i)) | 33702232) | (~(1000863741 | i70))) * 521) + (((455500765 | i) * 521) + ((((~(i70 | 455500765)) | 579065208) * (-1042)) + 987131336))))) - 1;
                                                                                                            int i422 = i421 << 13;
                                                                                                            int i423 = (i421 | i422) & (~(i421 & i422));
                                                                                                            int i424 = i423 ^ (i423 >>> 17);
                                                                                                            int i425 = i424 << 5;
                                                                                                            c = 0;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            c = 0;
                                                                                        }
                                                                                        if (((int[]) objArr[3])[c] != ((int[]) objArr[c])[c]) {
                                                                                            return objArr;
                                                                                        }
                                                                                        Object[] objArr142 = {2};
                                                                                        Object PngjBadSignature33 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-476828914);
                                                                                        if (PngjBadSignature33 == null) {
                                                                                            char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 35511);
                                                                                            int resolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 42;
                                                                                            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 507;
                                                                                            byte b90 = $$a[4];
                                                                                            byte b91 = b90;
                                                                                            Object[] objArr143 = new Object[1];
                                                                                            a(b90, b91, b91, objArr143);
                                                                                            PngjBadSignature33 = com.d.e.a.PngjBadCrcException.PngjBadSignature(trimmedLength, resolveSizeAndState, touchSlop, 528172725, false, (String) objArr143[0], new Class[]{cls5});
                                                                                        }
                                                                                        long longValue22 = ((Long) ((Method) PngjBadSignature33).invoke(null, objArr142)).longValue();
                                                                                        long j139 = -124019519;
                                                                                        long j140 = 829;
                                                                                        long j141 = -828;
                                                                                        long j142 = j139 | longValue22;
                                                                                        long j143 = (828 * (j142 ^ j69)) + (j141 * (j142 | j82)) + (((((j139 ^ j69) | (longValue22 ^ j69)) ^ j69) | (((j82 | j139) | longValue22) ^ j69)) * j141) + (j140 * longValue22) + (j140 * j139) + 991766031;
                                                                                        int i426 = (int) Runtime.getRuntime().totalMemory();
                                                                                        int i427 = ((int) (j143 >> 32)) & ((((~((~i426) | (-153591079))) | 1590817489) * 56) + (((~(1590817489 | i426)) | (-153591079)) * 56) + 1477752874);
                                                                                        int myPid6 = Process.myPid();
                                                                                        if (!((i427 | (((int) j143) & ((((~((~myPid6) | (-1241500476))) | 699012129) * 262) + ((((~((-1241500476) | myPid6)) | 699012129) * 262) + (-1972987347))))) != 2)) {
                                                                                            Object[] objArr144 = {new int[]{r5}, new int[1], null, new int[]{i}};
                                                                                            int i428 = (~(i & 270)) & (i | 270);
                                                                                            int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                                                                                            int c9 = a.c((~(elapsedCpuTime2 | 905129503)) | (~((-129436471) | elapsedCpuTime2)) | 33816864, -69, (((~((-95619607) | elapsedCpuTime2)) | (~(938946367 | elapsedCpuTime2))) * 69) - 948645752, 21608045);
                                                                                            int i429 = (c9 ^ 16) + ((c9 & 16) << 1);
                                                                                            int i430 = ((i2 | i429) << 1) - (i2 ^ i429);
                                                                                            int i431 = i430 << 13;
                                                                                            int i432 = (i430 | i431) & (~(i430 & i431));
                                                                                            int i433 = i432 >>> 17;
                                                                                            int i434 = (i432 | i433) & (~(i432 & i433));
                                                                                            int i435 = i434 << 5;
                                                                                            ((int[]) objArr144[1])[0] = ((~i434) & i435) | ((~i435) & i434);
                                                                                            return objArr144;
                                                                                        }
                                                                                        Object PngjBadSignature34 = com.d.e.a.PngjBadCrcException.PngjBadSignature(98436405);
                                                                                        if (PngjBadSignature34 == null) {
                                                                                            char combineMeasuredStates3 = (char) (View.combineMeasuredStates(0, 0) + 51309);
                                                                                            int myTid7 = (Process.myTid() >> 22) + 43;
                                                                                            int i436 = 1766 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                                                            byte b92 = $$a[4];
                                                                                            byte b93 = b92;
                                                                                            Object[] objArr145 = new Object[1];
                                                                                            a(b92, b93, b93, objArr145);
                                                                                            PngjBadSignature34 = com.d.e.a.PngjBadCrcException.PngjBadSignature(combineMeasuredStates3, myTid7, i436, -114202482, false, (String) objArr145[0], new Class[0]);
                                                                                        }
                                                                                        long longValue23 = ((Long) ((Method) PngjBadSignature34).invoke(null, null)).longValue();
                                                                                        long j144 = 502350764;
                                                                                        long j145 = 503;
                                                                                        long j146 = (j145 * longValue23) + (j145 * j144);
                                                                                        long j147 = -502;
                                                                                        long j148 = j144 | longValue23;
                                                                                        long j149 = (j147 * j148) + j146;
                                                                                        long j150 = j144 ^ j69;
                                                                                        long j151 = ((longValue23 ^ j69) | j150) ^ j69;
                                                                                        long startElapsedRealtime4 = (int) Process.getStartElapsedRealtime();
                                                                                        long j152 = j150 | (startElapsedRealtime4 ^ j69);
                                                                                        long j153 = (j148 | startElapsedRealtime4) ^ j69;
                                                                                        long j154 = ((502 * (((j152 | longValue23) ^ j69) | j153)) + ((j147 * ((j151 | (j152 ^ j69)) | j153)) + j149)) - 1130779844;
                                                                                        if (((((int) (j154 >> 32)) & ((((~(778333637 | i)) | (-795209702) | (~((-642016710) | i70))) * 717) + (((((~(i70 | 778333637)) | (-795209702)) | (~((-642016710) | i))) * 717) - 673077339))) | (((int) j154) & ((((~(341003476 | i)) | 335694976) * 196) + (((5308500 | r6) * (-196)) - 1768466267)))) != 0) {
                                                                                            int i437 = PngjOutputException;
                                                                                            PngjUnsupportedException = ((i437 & 109) + (i437 | 109)) % 128;
                                                                                            Object[] objArr146 = {new int[]{r5}, new int[1], null, new int[]{i}};
                                                                                            int i438 = (272 | i) & (~(i & 272));
                                                                                            int a2 = a.a();
                                                                                            int i439 = ~a2;
                                                                                            int c10 = a.c((~(a2 | (-784634741))) | (~(i439 | (-249931234))) | (-786806774), -370, (((~((-784634741) | i439)) | (~((-249931234) | a2))) * (-370)) + 1571886639, 939269748);
                                                                                            int i440 = -(-((c10 ^ 16) + ((c10 & 16) << 1)));
                                                                                            int i441 = ((i2 | i440) << 1) - (i440 ^ i2);
                                                                                            int i442 = i441 << 13;
                                                                                            int i443 = (i442 & (~i441)) | ((~i442) & i441);
                                                                                            int i444 = i443 ^ (i443 >>> 17);
                                                                                            int i445 = i444 << 5;
                                                                                            ((int[]) objArr146[1])[0] = (i444 | i445) & (~(i444 & i445));
                                                                                            return objArr146;
                                                                                        }
                                                                                        long[] jArr3 = {624887784092251L};
                                                                                        int edgeSlop2 = ViewConfiguration.getEdgeSlop() >> 16;
                                                                                        int i446 = edgeSlop2 * 273;
                                                                                        int i447 = (i446 & (-34417)) + (i446 | (-34417));
                                                                                        int i448 = ~edgeSlop2;
                                                                                        int i449 = (i448 ^ (-128)) | (i448 & (-128));
                                                                                        int i450 = (edgeSlop2 ^ 127) | (edgeSlop2 & 127);
                                                                                        int i451 = ((~((i449 & i70) | (i449 ^ i70))) | (~((i450 & i) | (i450 ^ i)))) * (-272);
                                                                                        int i452 = ((i447 | i451) << 1) - (i451 ^ i447);
                                                                                        int i453 = ~((i448 ^ 127) | (i448 & 127));
                                                                                        int i454 = ~((i448 & i) | (i448 ^ i));
                                                                                        int i455 = (i452 - (~(((i454 & i453) | (i453 ^ i454)) * (-272)))) - 1;
                                                                                        int i456 = ~((edgeSlop2 & i) | (edgeSlop2 ^ i));
                                                                                        Object[] objArr147 = new Object[1];
                                                                                        b(null, (((i456 & 127) | (i456 ^ 127)) * 272) + i455, null, "\u0090\u0092\u0089\u008b\u0082\u0094\u0095\u008e\u008d\u0088\u0090\u0095\u008a\u0082\u0081\u0091\u0095", objArr147);
                                                                                        Object[] objArr148 = {(String) objArr147[0], 3, 2251799813685247L, jArr3};
                                                                                        Object PngjBadSignature35 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1000971846);
                                                                                        if (PngjBadSignature35 == null) {
                                                                                            char bitsPerPixel4 = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                                                                                            int axisFromString3 = 34 - MotionEvent.axisFromString("");
                                                                                            int lastIndexOf6 = 1312 - TextUtils.lastIndexOf("", '0', 0, 0);
                                                                                            byte b94 = $$a[4];
                                                                                            byte b95 = (byte) (b94 + 1);
                                                                                            byte b96 = b94;
                                                                                            Object[] objArr149 = new Object[1];
                                                                                            a(b95, b96, (byte) (b96 + 1), objArr149);
                                                                                            cls3 = cls2;
                                                                                            PngjBadSignature35 = com.d.e.a.PngjBadCrcException.PngjBadSignature(bitsPerPixel4, axisFromString3, lastIndexOf6, 951651329, false, (String) objArr149[0], new Class[]{cls3, cls5, Long.TYPE, long[].class});
                                                                                        } else {
                                                                                            cls3 = cls2;
                                                                                        }
                                                                                        long longValue24 = ((Long) ((Method) PngjBadSignature35).invoke(null, objArr148)).longValue();
                                                                                        long j155 = -73221891;
                                                                                        long j156 = 69;
                                                                                        long j157 = j155 ^ j69;
                                                                                        long j158 = longValue24 ^ j69;
                                                                                        long j159 = ((j156 * ((j158 | j155) ^ j69)) + (((-69) * ((((j157 | longValue24) ^ j69) | ((j157 | j79) ^ j69)) | ((longValue24 | j79) ^ j69))) + ((((((j157 | j158) | j79) ^ j69) | (((j155 | longValue24) | j79) ^ j69)) * j156) + (((-68) * longValue24) + (70 * j155))))) - 106622278;
                                                                                        int i457 = ((int) (j159 >> 32)) & ((((-808687584) | (~((-2049053302) | i70))) * 56) + (((~((-808687584) | i)) | (-2049053302)) * 56) + 284399074);
                                                                                        int i458 = ((int) j159) & ((((~((~((int) SystemClock.uptimeMillis())) | 730392041)) | 713606248) * 374) + (((16785793 | r5) * (-374)) - 55071525));
                                                                                        if ((((i457 & i458) | (i457 ^ i458)) != 0 ? 'R' : (char) 18) == 'R') {
                                                                                            Object[] objArr150 = {new int[]{(i & (-276)) | (i70 & 275)}, new int[]{(r1 | r2) & (~(r1 & r2))}, null, new int[]{i}};
                                                                                            int i459 = -(-a.A((~((-790543469) | i70)) | 563462277, 262, (((~(i | (-790543469))) | 563462277) * 262) + 548034217, -16));
                                                                                            int i460 = ((i2 | i459) << 1) - (i459 ^ i2);
                                                                                            int i461 = i460 << 13;
                                                                                            int i462 = (i461 & (~i460)) | ((~i461) & i460);
                                                                                            int i463 = i462 ^ (i462 >>> 17);
                                                                                            int i464 = i463 << 5;
                                                                                            return objArr150;
                                                                                        }
                                                                                        Object[] objArr151 = new Object[1];
                                                                                        c("\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001", false, new int[]{384, 11, 0, 7}, objArr151);
                                                                                        Object[] objArr152 = {(String) objArr151[0]};
                                                                                        Object PngjBadSignature36 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1142218481);
                                                                                        if (PngjBadSignature36 == null) {
                                                                                            char packedPositionGroup2 = (char) ExpandableListView.getPackedPositionGroup(0L);
                                                                                            int argb2 = Color.argb(0, 0, 0, 0) + 28;
                                                                                            int i465 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1447;
                                                                                            byte b97 = $$a[4];
                                                                                            byte b98 = (byte) (b97 + 1);
                                                                                            byte b99 = b97;
                                                                                            Object[] objArr153 = new Object[1];
                                                                                            a(b98, b99, (byte) (b99 + 1), objArr153);
                                                                                            PngjBadSignature36 = com.d.e.a.PngjBadCrcException.PngjBadSignature(packedPositionGroup2, argb2, i465, 1191464116, false, (String) objArr153[0], new Class[]{cls3});
                                                                                        }
                                                                                        long longValue25 = ((Long) ((Method) PngjBadSignature36).invoke(null, objArr152)).longValue();
                                                                                        long j160 = -1617313325;
                                                                                        long j161 = (-139) * longValue25;
                                                                                        long j162 = j160 ^ j69;
                                                                                        long j163 = (j162 | j79) ^ j69;
                                                                                        long j164 = (-280) * (((j162 | longValue25) ^ j69) | j163);
                                                                                        long j165 = 140;
                                                                                        long j166 = longValue25 ^ j69;
                                                                                        long j167 = ((j165 * (((((j162 | j166) | j79) ^ j69) | (((j162 | j82) | longValue25) ^ j69)) | (((j166 | j82) | j160) ^ j69))) + (((j163 | ((j166 | j79) ^ j69)) * j165) + (j164 + (j161 + (141 * j160))))) - 338684552;
                                                                                        int i466 = ((int) (j167 >> 32)) & ((((~((-363890245) | i70)) | (~((-37767425) | i)) | (~((-671678499) | i))) * 867) + (((~((-401657669) | i)) | 363890244 | (~((-1035568743) | i))) * (-1734)) + (((~((-401657669) | i70)) | (~((-1035568743) | i70))) * (-867)) + 1972008040);
                                                                                        int i467 = (int) j167;
                                                                                        int i468 = (((((~((-30378679) | i70)) | 8784534) | (~(1467605088 | i70))) | (~((-1446010945) | i))) * (-84)) - 1905160647;
                                                                                        int i469 = (~(1467605088 | i)) | 30378678;
                                                                                        int i470 = ~((-1467605089) | i70);
                                                                                        int i471 = i467 & (((1446010944 | i470) * 84) + ((i469 | i470) * (-84)) + i468);
                                                                                        if ((((i466 & i471) | (i466 ^ i471)) != 0 ? '2' : '-') == '2') {
                                                                                            int i472 = PngjOutputException;
                                                                                            PngjUnsupportedException = ((i472 & 41) + (i472 | 41)) % 128;
                                                                                            Object[] objArr154 = {new int[]{(i70 & 276) | (i & (-277))}, new int[1], null, new int[]{i}};
                                                                                            int a3 = a.a();
                                                                                            int A3 = a.A((~(a3 | 236838843)) | 797727130, 272, (((~((-236838844) | a3)) | 1148449) * (-272)) + ((((~((-235690395) | (~a3))) | (~(798875579 | a3))) * (-272)) - 1203192731), -16);
                                                                                            int PngjBadCrcException8 = PngjBadCrcException.onErrorResponse.PngjBadCrcException();
                                                                                            int i473 = A3 * 70;
                                                                                            int i474 = -(-(i2 * (-68)));
                                                                                            int i475 = (i473 ^ i474) + ((i473 & i474) << 1);
                                                                                            int i476 = ~A3;
                                                                                            int i477 = ~i2;
                                                                                            int i478 = (i477 & i476) | (i476 ^ i477);
                                                                                            int i479 = ~((i478 & PngjBadCrcException8) | (i478 ^ PngjBadCrcException8));
                                                                                            int i480 = ~((A3 ^ i2) | (A3 & i2) | PngjBadCrcException8);
                                                                                            int i481 = -(-(((i479 & i480) | (i479 ^ i480)) * 69));
                                                                                            int i482 = ((((i475 | i481) << 1) - (i481 ^ i475)) - (~(-(-(((~((PngjBadCrcException8 & i2) | (i2 ^ PngjBadCrcException8))) | ((~((i476 & PngjBadCrcException8) | (i476 ^ PngjBadCrcException8))) | (~(i476 | i2)))) * (-69)))))) - 1;
                                                                                            int i483 = ~i2;
                                                                                            int i484 = -(-((~((A3 & i483) | (i483 ^ A3))) * 69));
                                                                                            int i485 = (i482 & i484) + (i484 | i482);
                                                                                            int i486 = i485 << 13;
                                                                                            int i487 = (i486 & (~i485)) | ((~i486) & i485);
                                                                                            int i488 = i487 ^ (i487 >>> 17);
                                                                                            int i489 = i488 << 5;
                                                                                            ((int[]) objArr154[1])[0] = ((~i488) & i489) | ((~i489) & i488);
                                                                                            return objArr154;
                                                                                        }
                                                                                        Object PngjBadSignature37 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1617763359);
                                                                                        if (PngjBadSignature37 == null) {
                                                                                            char mode3 = (char) View.MeasureSpec.getMode(0);
                                                                                            int i490 = 32 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                                                            int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L) + 1382;
                                                                                            byte b100 = $$a[4];
                                                                                            byte b101 = b100;
                                                                                            Object[] objArr155 = new Object[1];
                                                                                            a(b100, b101, b101, objArr155);
                                                                                            PngjBadSignature37 = com.d.e.a.PngjBadCrcException.PngjBadSignature(mode3, i490, packedPositionChild2, -1669172828, false, (String) objArr155[0], new Class[0]);
                                                                                        }
                                                                                        long longValue26 = ((Long) ((Method) PngjBadSignature37).invoke(null, null)).longValue();
                                                                                        long j168 = -125664145;
                                                                                        long j169 = j168 ^ j69;
                                                                                        long j170 = longValue26 ^ j69;
                                                                                        long j171 = j169 | (((int) Runtime.getRuntime().totalMemory()) ^ j69);
                                                                                        long j172 = ((241 * (((j170 | j168) ^ j69) | ((j171 | longValue26) ^ j69))) + (((-482) * (j168 | longValue26)) + (((-241) * (((j169 | j170) ^ j69) | (j171 ^ j69))) + ((242 * longValue26) + (483 * j168))))) - 921030364;
                                                                                        int i491 = ((int) (j172 >> 32)) & ((((~(1256776242 | i)) | (~((-8397329) | i70))) * 765) + (((~(1256776242 | i70)) | (-1609361971)) * 1530) + (((~(1609361970 | i70)) | (~((-352585729) | i)) | (~((-8397329) | i))) * 765) + 831802127);
                                                                                        int i492 = (int) j172;
                                                                                        int startUptimeMillis4 = (int) Process.getStartUptimeMillis();
                                                                                        int i493 = ~startUptimeMillis4;
                                                                                        if ((i491 | (i492 & ((((~(i493 | 720395494)) | (-716830916)) * 217) + (((~(startUptimeMillis4 | 716830915)) | (-721026280)) * 217) + (((~(716830915 | i493)) | (~(720395494 | startUptimeMillis4))) * 217) + 2136745580))) != 0) {
                                                                                            Object[] objArr156 = {new int[]{i ^ 273}, new int[]{(r1 | r2) & (~(r1 & r2))}, null, new int[]{i}};
                                                                                            int i494 = -(-a.c((~(i | (-839190017))) | (~(i70 | (-139493382))), 210, (((~((-867131305) | i70)) | (~((-167434670) | i))) * 210) + 96779627, 16));
                                                                                            int i495 = (i2 ^ i494) + ((i494 & i2) << 1);
                                                                                            int i496 = i495 << 13;
                                                                                            int i497 = (i496 | i495) & (~(i495 & i496));
                                                                                            int i498 = i497 ^ (i497 >>> 17);
                                                                                            int i499 = i498 << 5;
                                                                                            return objArr156;
                                                                                        }
                                                                                        Object PngjBadSignature38 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-820027826);
                                                                                        if (PngjBadSignature38 == null) {
                                                                                            char axisFromString4 = (char) (MotionEvent.axisFromString("") + 13780);
                                                                                            int i500 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 29;
                                                                                            int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1502;
                                                                                            byte b102 = $$a[4];
                                                                                            byte b103 = (byte) (b102 + 1);
                                                                                            byte b104 = b102;
                                                                                            Object[] objArr157 = new Object[1];
                                                                                            a(b103, b104, (byte) (b104 + 1), objArr157);
                                                                                            PngjBadSignature38 = com.d.e.a.PngjBadCrcException.PngjBadSignature(axisFromString4, i500, jumpTapTimeout2, 871379957, false, (String) objArr157[0], new Class[0]);
                                                                                        }
                                                                                        long longValue27 = ((Long) ((Method) PngjBadSignature38).invoke(null, null)).longValue();
                                                                                        long j173 = 281161718;
                                                                                        long j174 = -743;
                                                                                        long j175 = j173 | longValue27;
                                                                                        long a4 = a.a();
                                                                                        long j176 = 744;
                                                                                        long j177 = ((j176 * (j175 | a4)) + ((((a4 ^ j69) | (((j173 ^ j69) | (longValue27 ^ j69)) ^ j69)) * j176) + (((-744) * (((j175 ^ j69) | ((j173 | a4) ^ j69)) | ((longValue27 | a4) ^ j69))) + ((j174 * longValue27) + (j174 * j173))))) - 448556934;
                                                                                        int i501 = ~((-1156192793) | i70);
                                                                                        int i502 = ((int) (j177 >> 32)) & ((((~((-1156192793) | i)) | (~(1156192792 | i70))) * 575) + (((~((-281033619) | i)) | (~(281033618 | i70))) * (-575)) + (((i501 | r8) * 1150) - 334238508));
                                                                                        int i503 = ((int) j177) & ((((~(1785458647 | i)) | 4295173 | (~(348232237 | i70))) * 904) + (((~((-343937065) | i)) | (~((-1781163475) | i70))) * 904) + ((((~((-348232238) | i)) | (~((-1785458648) | i70))) * (-1808)) - 1020982275));
                                                                                        if ((((i502 & i503) | (i502 ^ i503)) != 0 ? '7' : 'F') != 'F') {
                                                                                            PngjUnsupportedException = (PngjOutputException + 105) % 128;
                                                                                            Object[] objArr158 = {new int[]{r5}, new int[1], null, new int[]{i}};
                                                                                            int i504 = (~(i & 279)) & (i | 279);
                                                                                            int i505 = ~((int) Runtime.getRuntime().freeMemory());
                                                                                            int i506 = (((~(i505 | (-272894864))) | 761671110) * 160) + (((~(i505 | 761671110)) | (-1030107088)) * (-160)) + 2112863125;
                                                                                            int i507 = ((i506 | 16) << 1) - (i506 ^ 16);
                                                                                            int i508 = (i2 & i507) + (i2 | i507);
                                                                                            int i509 = i508 << 13;
                                                                                            int i510 = ((~i508) & i509) | ((~i509) & i508);
                                                                                            int i511 = i510 >>> 17;
                                                                                            int i512 = ((~i510) & i511) | ((~i511) & i510);
                                                                                            int i513 = i512 << 5;
                                                                                            ((int[]) objArr158[1])[0] = ((~i512) & i513) | ((~i513) & i512);
                                                                                            return objArr158;
                                                                                        }
                                                                                        Object[] objArr159 = {Integer.valueOf(i), obj, Integer.valueOf(i2), 16777216};
                                                                                        Object PngjBadSignature39 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1284430186);
                                                                                        if (PngjBadSignature39 == null) {
                                                                                            PngjBadSignature39 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) Color.green(0), TextUtils.getOffsetBefore("", 0) + 26, ImageFormat.getBitsPerPixel(0) + 1225, 1335773997, false, null, new Class[]{cls5, (Class) com.d.e.a.PngjBadCrcException.values((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 25 - Drawable.resolveOpacity(0, 0), 1199 - View.resolveSize(0, 0)), cls5, cls5});
                                                                                        }
                                                                                        Object newInstance = ((Constructor) PngjBadSignature39).newInstance(objArr159);
                                                                                        try {
                                                                                            Object[] objArr160 = new Object[1];
                                                                                            c("\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001", true, new int[]{395, 16, 0, 0}, objArr160);
                                                                                            Class<?> cls6 = Class.forName((String) objArr160[0]);
                                                                                            Object[] objArr161 = new Object[1];
                                                                                            b(null, 127 - (ViewConfiguration.getEdgeSlop() >> 16), null, "\u0092\u0081\u0085\u0092\u0090", objArr161);
                                                                                            cls6.getMethod((String) objArr161[0], null).invoke(newInstance, null);
                                                                                            Object[] objArr162 = {new int[]{i}, new int[]{((~r1) & r2) | ((~r2) & r1)}, null, new int[]{i}};
                                                                                            int i514 = (~((-222425333) | i70)) | 4210784;
                                                                                            int i515 = ~(i | 1030355189);
                                                                                            int i516 = ((i515 | (~(i70 | (-218214549)))) * 252) + ((i514 | i515) * (-252)) + 2095683541;
                                                                                            int i517 = (i2 & i516) + (i516 | i2);
                                                                                            int i518 = i517 << 13;
                                                                                            int i519 = (i518 & (~i517)) | ((~i518) & i517);
                                                                                            int i520 = i519 ^ (i519 >>> 17);
                                                                                            int i521 = i520 << 5;
                                                                                            return objArr162;
                                                                                        } catch (Throwable th5) {
                                                                                            Throwable cause2 = th5.getCause();
                                                                                            if (cause2 != null) {
                                                                                                throw new RuntimeException(cause2);
                                                                                            }
                                                                                            throw new RuntimeException(th5);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } catch (Throwable th6) {
                                                                                Throwable cause3 = th6.getCause();
                                                                                if (cause3 != null) {
                                                                                    throw new RuntimeException(cause3);
                                                                                }
                                                                                throw new RuntimeException(th6);
                                                                            }
                                                                        }
                                                                    }
                                                                    i11 = 0;
                                                                    if (i11 == 0) {
                                                                    }
                                                                } catch (Throwable th7) {
                                                                    Throwable cause4 = th7.getCause();
                                                                    if (cause4 != null) {
                                                                        throw new RuntimeException(cause4);
                                                                    }
                                                                    throw new RuntimeException(th7);
                                                                }
                                                            } catch (Throwable th8) {
                                                                Throwable cause5 = th8.getCause();
                                                                if (cause5 != null) {
                                                                    throw new RuntimeException(cause5);
                                                                }
                                                                throw new RuntimeException(th8);
                                                            }
                                                        }
                                                    }
                                                    z4 = false;
                                                    if ((!z4 ? (char) 15 : ' ') != 15) {
                                                    }
                                                }
                                            }
                                            z3 = false;
                                            if (!z3) {
                                            }
                                        }
                                        z2 = false;
                                        if (z2) {
                                        }
                                    }
                                } else {
                                    obj2 = invoke5;
                                }
                                if (obj2 != null) {
                                    PngjBadCrcException.onErrorResponse.PngjBadCrcException();
                                    PngjBadCrcException.onErrorResponse.PngjBadCrcException();
                                    Object[] objArr163 = {obj2, 42};
                                    Object PngjBadSignature40 = com.d.e.a.PngjBadCrcException.PngjBadSignature(989703296);
                                    if (PngjBadSignature40 == null) {
                                        char c11 = (char) (11040 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                                        int bitsPerPixel5 = 30 - ImageFormat.getBitsPerPixel(0);
                                        int edgeSlop3 = (ViewConfiguration.getEdgeSlop() >> 16) + 1282;
                                        byte b105 = $$a[4];
                                        byte b106 = b105;
                                        Object[] objArr164 = new Object[1];
                                        a(b105, b106, b106, objArr164);
                                        PngjBadSignature40 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c11, bitsPerPixel5, edgeSlop3, -971849413, false, (String) objArr164[0], new Class[]{cls, cls5});
                                    }
                                    long longValue28 = ((Long) ((Method) PngjBadSignature40).invoke(null, objArr163)).longValue();
                                    long j178 = -850895924;
                                    cls2 = cls;
                                    long j179 = -1;
                                    long j180 = j178 ^ j179;
                                    long j181 = (longValue28 | i) ^ j179;
                                    long j182 = (110 * (((j180 | longValue28) ^ j179) | (((longValue28 ^ j179) | j178) ^ j179))) + (220 * (((j178 | longValue28) ^ j179) | j181)) + ((-220) * (j180 | j181)) + (111 * longValue28) + ((-109) * j178) + 1506603624;
                                    int i522 = ((int) (j182 >> 32)) & (((~(1565878268 | i)) * 345) + (((~(1561683932 | i70)) | 269821316) * 345) + ((((~(1561683932 | i)) | (-1565878269)) * 345) - 484646000));
                                    int elapsedRealtime4 = (int) SystemClock.elapsedRealtime();
                                    int i523 = ~(129088999 | (~elapsedRealtime4));
                                }
                            }
                        }
                        cls2 = cls;
                        z2 = false;
                        if (z2) {
                        }
                    }
                } else {
                    i9 = 8;
                }
                cls = String.class;
                PngjUnsupportedException = (PngjOutputException + 49) % 128;
                z = false;
                if (z) {
                }
            }
            Object[] objArr610 = new Object[i3];
            objArr610[0] = new int[]{i20};
            objArr610[1] = new int[1];
            objArr610[3] = new int[]{i};
            int i2010 = (~(i & 271)) & (i | 271);
            objArr610[i4] = null;
            int elapsedRealtime5 = (int) SystemClock.elapsedRealtime();
            int i2110 = ~elapsedRealtime5;
            int d3 = a.d((~(elapsedRealtime5 | (-426730399))) | (~(i2110 | (-607835576))) | (-1031796672), -370, (((~((-426730399) | i2110)) | (~((-607835576) | elapsedRealtime5))) * (-370)) + 1571886639, 487320720, i2);
            int i2210 = d3 ^ (d3 << 13);
            int i2310 = i2210 >>> 17;
            int i2410 = ((~i2210) & i2310) | ((~i2310) & i2210);
            ((int[]) objArr610[1])[0] = i2410 ^ (i2410 << 5);
            return objArr610;
        } catch (Throwable th9) {
            cause = th9.getCause();
            if (cause == null) {
            }
        }
        cause = th9.getCause();
        if (cause == null) {
            throw new RuntimeException(cause);
        }
        throw new RuntimeException(th9);
        i13 = 0;
        if (i13 == 0) {
        }
        if (i14 == 0) {
        }
        i15 = 0;
        if (!(i15 == 0)) {
        }
    }
}
