package com.identy;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.identy.enums.Finger;
import com.identy.enums.FingerDetectionMode;
import com.identy.enums.Hand;
import com.identy.exceptions.NoDetectionModeException;
import com.karumi.dexter.BuildConfig;
import java.lang.reflect.Method;
import kotlin.io.ConstantsKt;

/* loaded from: classes2.dex */
public class GuideNoGuideHelper {
    private static  byte[] $$a = null;
    private static  int $$b = 0;
    private static  byte[] $$c = null;
    private static  byte[] $$d = null;
    private static  int $$e = 0;
    private static  int $$f = 0;
    private static int $10;
    private static int $11;
    private static char[] PngjBadCrcException;
    private static int PngjBadSignature;
    private static int valueOf;

    private static String $$g(short s, short s2, short s3) {
        byte[] bArr = $$c;
        int i = 102 - s;
        int i2 = s3 * 4;
        int i3 = s2 + 4;
        byte[] bArr2 = new byte[i2 + 1];
        int i4 = -1;
        if (bArr == null) {
            i = i2 + (-i3);
            i3 = i3;
            bArr = bArr;
            i4 = -1;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i;
            int i6 = i3 + 1;
            if (i5 == i2) {
                return new String(bArr2, 0);
            }
            byte[] bArr3 = bArr;
            i += -bArr[i6];
            i3 = i6;
            bArr = bArr3;
            i4 = i5;
        }
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        PngjBadSignature = 0;
        valueOf = 1;
        PngjBadCrcException = new char[]{39974, 39980, 39983, 39993, 39971, 39998, 39968, 39992, 39980, 39969, 39960, 39970, 39994, 39977, 39976, 40022, 39944, 40163, 39976, 39980, 40163, 39993, 40099, 40166, 40164, 40166, 40175, 40162, 40186, 40177, 40177, 40185, 40164, 40174, 40172, 40161, 40167, 40163, 40057, 40058, 40034, 40044, 40061, 40037, 40341, 40045, 40046, 40046, 40045, 40034, 40009, 40022, 40014, 40047, 40039, 40006, 40000, 40037, 40035, 40047, 40034, 40032, 40038, 40101, 40184, 40167, 40166, 40191, 40189, 40165, 40142, 40140, 40164, 40186, 40190, 40178, 40182, 40190, 40186, 40184, 40186};
    }

    public GuideNoGuideHelper() {
        java.lang.Object[] objArr;
        long j;
        java.lang.Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new java.lang.Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    int c = defpackage.a.c((~(elapsedCpuTime | (-413392553))) | 37504 | (~((~elapsedCpuTime) | 498851775)), 988, (((~((-413355049) | 0)) | (~(498851775 | elapsedCpuTime))) * 988) - 966743329, 1796799628);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4997;
                    Fpnative.valueOf = objArr;
                }
            }
            byte[] bArr = $$d;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a((short) (-bArr[107]), bArr[60], (byte) (bArr[30] - 1), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a((short) (bArr[75] - 1), (byte) (bArr[67] - 1), (byte) (-bArr[149]), objArr4);
            objArr = (java.lang.Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1796799628);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4997;
            Fpnative.valueOf = objArr;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1602)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:298)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] PngjBadSignature(int r37) {
        /*
            Method dump skipped, instructions count: 2710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.identy.GuideNoGuideHelper.PngjBadSignature(int):java.lang.Object[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, short s2, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = s + 4;
        byte[] bArr = $$d;
        int i4 = s2 + 80;
        byte[] bArr2 = new byte[58 - b];
        int i5 = 57 - b;
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i6 = 0;
            int i7 = i3;
            i3 = (i3 + i4) - 9;
            i = i7;
            bArr = bArr3;
            i2 = i6;
            bArr2[i2] = (byte) i3;
            int i8 = i + 1;
            if (i2 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b2 = bArr[i8];
            byte[] bArr4 = bArr;
            i7 = i8;
            i4 = b2;
            i6 = i2 + 1;
            bArr3 = bArr4;
            i3 = (i3 + i4) - 9;
            i = i7;
            bArr = bArr3;
            i2 = i6;
            bArr2[i2] = (byte) i3;
            int i82 = i + 1;
            if (i2 == i5) {
            }
        } else {
            i = i3;
            i3 = i4;
            i2 = 0;
            bArr2[i2] = (byte) i3;
            int i822 = i + 1;
            if (i2 == i5) {
            }
        }
    }

    private static void b(int[] iArr, String str, boolean z, java.lang.Object[] objArr) {
        int i;
        int i2;
        long j;
        byte[] bArr;
        int i3;
        float f;
        String str2 = str;
        byte[] bArr2 = str2;
        if (str2 != null) {
            bArr2 = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr3 = bArr2;
        com.d.e.e1 e1Var = new com.d.e.e1();
        int i4 = 0;
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr = PngjBadCrcException;
        Class cls = Integer.TYPE;
        float f2 = 0.0f;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            i = 2;
            $11 = ($10 + 13) % 128;
            int i9 = 0;
            while (i9 < length) {
                try {
                    java.lang.Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                    java.lang.Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-259747866);
                    if (PngjBadSignature2 == null) {
                        char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int red = Color.red(i4) + 35;
                        f = f2;
                        int i10 = 1313 - (TypedValue.complexToFraction(i4, f2, f2) > f ? 1 : (TypedValue.complexToFraction(i4, f2, f2) == f ? 0 : -1));
                        byte b = (byte) ($$f & 11);
                        bArr = bArr3;
                        byte b2 = (byte) (b - 3);
                        i3 = i9;
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(scrollDefaultDelay, red, i10, 208396893, false, $$g(b, b2, (byte) (b2 + 1)), new Class[]{cls});
                    } else {
                        bArr = bArr3;
                        i3 = i9;
                        f = f2;
                    }
                    cArr2[i3] = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr2)).charValue();
                    i9 = i3 + 1;
                    f2 = f;
                    bArr3 = bArr;
                    i4 = 0;
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
        }
        byte[] bArr4 = bArr3;
        float f3 = f2;
        char[] cArr3 = new char[i6];
        System.arraycopy(cArr, i5, cArr3, 0, i6);
        if (bArr4 != null) {
            $11 = ($10 + 63) % 128;
            char[] cArr4 = new char[i6];
            e1Var.PngjBadSignature = 0;
            char c = 0;
            while (true) {
                int i11 = e1Var.PngjBadSignature;
                if (i11 >= i6) {
                    break;
                }
                if (bArr4[i11] == 1) {
                    int i12 = $11 + 109;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        char c2 = cArr3[i11];
                        java.lang.Object[] objArr3 = new java.lang.Object[i];
                        objArr3[1] = Integer.valueOf(c);
                        objArr3[0] = Integer.valueOf(c2);
                        java.lang.Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-655108508);
                        if (PngjBadSignature3 == null) {
                            byte b3 = (byte) 3;
                            byte b4 = (byte) (b3 - 4);
                            j = 0;
                            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (Color.alpha(0) + 31882), 32 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 1250, 605862879, false, $$g(b3, b4, (byte) (b4 + 1)), new Class[]{cls, cls});
                        } else {
                            j = 0;
                        }
                        cArr4[i11] = ((Character) ((Method) PngjBadSignature3).invoke(null, objArr3)).charValue();
                        int i13 = 5 / 0;
                    } else {
                        j = 0;
                        java.lang.Object[] objArr4 = {Integer.valueOf(cArr3[i11]), Integer.valueOf(c)};
                        java.lang.Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-655108508);
                        if (PngjBadSignature4 == null) {
                            byte b5 = (byte) 3;
                            byte b6 = (byte) (b5 - 4);
                            PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((TypedValue.complexToFloat(0) > f3 ? 1 : (TypedValue.complexToFloat(0) == f3 ? 0 : -1)) + 31882), ((byte) KeyEvent.getModifierMetaStateMask()) + 33, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1249, 605862879, false, $$g(b5, b6, (byte) (b6 + 1)), new Class[]{cls, cls});
                        }
                        cArr4[i11] = ((Character) ((Method) PngjBadSignature4).invoke(null, objArr4)).charValue();
                    }
                } else {
                    j = 0;
                    java.lang.Object[] objArr5 = {Integer.valueOf(cArr3[i11]), Integer.valueOf(c)};
                    java.lang.Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(269554740);
                    if (PngjBadSignature5 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 - 1);
                        PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) Drawable.resolveOpacity(0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 35, 1598 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -318867057, false, $$g(b7, b8, (byte) (b8 + 1)), new Class[]{cls, cls});
                    }
                    cArr4[i11] = ((Character) ((Method) PngjBadSignature5).invoke(null, objArr5)).charValue();
                }
                c = cArr4[e1Var.PngjBadSignature];
                java.lang.Object[] objArr6 = {e1Var, e1Var};
                java.lang.Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1060060353);
                if (PngjBadSignature6 == null) {
                    PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ExpandableListView.getPackedPositionGroup(j), 35 - Color.alpha(0), View.getDefaultSize(0, 0) + ModuleDescriptor.MODULE_VERSION, -1010806406, false, "g", new Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((Method) PngjBadSignature6).invoke(null, objArr6);
                i = 2;
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            char[] cArr5 = new char[i6];
            System.arraycopy(cArr3, 0, cArr5, 0, i6);
            int i14 = i6 - i8;
            System.arraycopy(cArr5, 0, cArr3, i14, i8);
            System.arraycopy(cArr5, i8, cArr3, 0, i14);
        }
        if (z) {
            $10 = ($11 + 119) % 128;
            char[] cArr6 = new char[i6];
            e1Var.PngjBadSignature = 0;
            while (true) {
                int i15 = e1Var.PngjBadSignature;
                if (i15 >= i6) {
                    break;
                }
                cArr6[i15] = cArr3[(i6 - i15) - 1];
                e1Var.PngjBadSignature = i15 + 1;
            }
            cArr3 = cArr6;
        }
        if (i7 > 0) {
            e1Var.PngjBadSignature = 0;
            while (true) {
                int i16 = e1Var.PngjBadSignature;
                if (i16 >= i6) {
                    break;
                }
                int i17 = $11 + 51;
                int i18 = i17 % 128;
                $10 = i18;
                if (i17 % 2 != 0) {
                    cArr3[i16] = (char) (cArr3[i16] / iArr[2]);
                    i2 = i16 >>> 1;
                } else {
                    cArr3[i16] = (char) (cArr3[i16] - iArr[2]);
                    i2 = i16 + 1;
                }
                e1Var.PngjBadSignature = i2;
                $11 = (i18 + 107) % 128;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, byte b, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = 118 - (b * 38);
        byte[] bArr = $$a;
        int i4 = i + 4;
        byte[] bArr2 = new byte[s + 6];
        int i5 = s + 5;
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i6 = 0;
            int i7 = i4;
            int i8 = i3 + (-i4);
            i4 = i7 + 1;
            i3 = i8 + 5;
            bArr = bArr3;
            i2 = i6;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b2 = bArr[i4];
            byte[] bArr4 = bArr;
            i7 = i4;
            i4 = b2;
            i6 = i2 + 1;
            bArr3 = bArr4;
            int i82 = i3 + (-i4);
            i4 = i7 + 1;
            i3 = i82 + 5;
            bArr = bArr3;
            i2 = i6;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Class getCaptureClass(Activity activity, boolean z, FingerDetectionMode[] fingerDetectionModeArr, boolean z2) {
        java.lang.Object[] objArr;
        long j;
        String key;
        int i = PngjBadSignature + 91;
        valueOf = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        java.lang.Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new java.lang.Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = defpackage.a.c((~((~((int) SystemClock.elapsedRealtime())) | (-383430534))) | 270150917, 933, (((~((-115458747) | 0)) | (-383430534)) * (-933)) - 410684824, -1725503618);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4876;
                    Fpnative.valueOf = objArr;
                    key = getKey(fingerDetectionModeArr[0], z2);
                    StringBuilder sb = new StringBuilder();
                    int i4 = ((int[]) objArr[1])[0];
                    int i5 = ((i4 * i4) - (~(-(1710321919 * i4)))) - 1;
                    int i6 = -(i4 * (-757689631));
                    int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
                    int i8 = (i7 ^ 58966272) + ((58966272 & i7) << 1);
                    int i9 = i8 >> 28;
                    int i10 = ((i9 & (-31)) + (i9 | (-31))) / 16;
                    int i11 = ((i10 | 1) << 1) - (i10 ^ 1);
                    int i12 = ((i8 | i11) << 1) - (i11 ^ i8);
                    int i13 = i8 >> 18;
                    int i14 = ((i13 & (-32767)) + (i13 | (-32767))) / 16384;
                    int i15 = -(((i14 ^ 1) + ((i14 & 1) << 1)) ^ i12);
                    int i16 = (i15 ^ 3) + ((i15 & 3) << 1);
                    int i17 = i16 >> 22;
                    int i18 = ((i17 & (-2047)) + (i17 | (-2047))) / 1024;
                    int i19 = (i18 & 1) + (i18 | 1);
                    sb.append("10,26,24, TAG ===  rolled ? ".substring(45603 / (((-(((i19 | 1) << 1) - (i19 ^ 1))) & i16) * 1689)));
                    sb.append(z2);
                    getPadSub2.PngjException("TAG", sb.toString());
                    if (!isIntroShown(activity, key)) {
                        int i20 = valueOf + 73;
                        PngjBadSignature = i20 % 128;
                        if (i20 % 2 != 0) {
                            int i21 = 19 / 0;
                            if (!z) {
                                return IntroActivity.class;
                            }
                        } else if (!z) {
                            return IntroActivity.class;
                        }
                    }
                    if (!z2) {
                        return (fingerDetectionModeArr[0].equals(FingerDetectionMode.LEFT_THUMB) || fingerDetectionModeArr[0].equals(FingerDetectionMode.RIGHT_THUMB)) ? CaptureRolledThumbActivity.class : CaptureRolledFingersActivity.class;
                    }
                    if (fingerDetectionModeArr[0].equals(FingerDetectionMode.L4F) || fingerDetectionModeArr[0].equals(FingerDetectionMode.R4F)) {
                        return Capture4FActivity.class;
                    }
                    if (fingerDetectionModeArr[0].equals(FingerDetectionMode.LEFT_RIGHT_INDEX)) {
                        return Capture2IndexActivity.class;
                    }
                    if (fingerDetectionModeArr[0].equals(FingerDetectionMode.TWO_THUMB)) {
                        valueOf = (PngjBadSignature + 113) % 128;
                        return Capture2TActivity.class;
                    }
                    if (fingerDetectionModeArr[0].equals(FingerDetectionMode.LEFT_THUMB) || fingerDetectionModeArr[0].equals(FingerDetectionMode.RIGHT_THUMB)) {
                        return CaptureThumbActivity.class;
                    }
                    if (fingerDetectionModeArr[0].equals(FingerDetectionMode.LEFT_INDEX)) {
                        return CaptureFingersActivity.class;
                    }
                    valueOf = (PngjBadSignature + 47) % 128;
                    if (fingerDetectionModeArr[0].equals(FingerDetectionMode.LEFT_MIDDLE) || fingerDetectionModeArr[0].equals(FingerDetectionMode.LEFT_RING) || fingerDetectionModeArr[0].equals(FingerDetectionMode.LEFT_LITTLE)) {
                        return CaptureFingersActivity.class;
                    }
                    int i22 = valueOf + 73;
                    PngjBadSignature = i22 % 128;
                    if (i22 % 2 != 0) {
                        if (fingerDetectionModeArr[1].equals(FingerDetectionMode.RIGHT_INDEX)) {
                            return CaptureFingersActivity.class;
                        }
                    } else if (fingerDetectionModeArr[0].equals(FingerDetectionMode.RIGHT_INDEX)) {
                        return CaptureFingersActivity.class;
                    }
                    return (fingerDetectionModeArr[0].equals(FingerDetectionMode.RIGHT_MIDDLE) || fingerDetectionModeArr[0].equals(FingerDetectionMode.RIGHT_RING) || fingerDetectionModeArr[0].equals(FingerDetectionMode.RIGHT_LITTLE)) ? CaptureFingersActivity.class : Capture4FActivity.class;
                }
            }
            byte[] bArr = $$d;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a((short) (-bArr[107]), bArr[60], (byte) (bArr[30] - 1), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a((short) (bArr[75] - 1), (byte) (bArr[67] - 1), (byte) (-bArr[149]), objArr4);
            objArr = (java.lang.Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1566027326);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4876;
            Fpnative.valueOf = objArr;
            key = getKey(fingerDetectionModeArr[0], z2);
            StringBuilder sb2 = new StringBuilder();
            int i42 = ((int[]) objArr[1])[0];
            int i52 = ((i42 * i42) - (~(-(1710321919 * i42)))) - 1;
            int i62 = -(i42 * (-757689631));
            int i72 = ((i52 | i62) << 1) - (i62 ^ i52);
            int i82 = (i72 ^ 58966272) + ((58966272 & i72) << 1);
            int i92 = i82 >> 28;
            int i102 = ((i92 & (-31)) + (i92 | (-31))) / 16;
            int i112 = ((i102 | 1) << 1) - (i102 ^ 1);
            int i122 = ((i82 | i112) << 1) - (i112 ^ i82);
            int i132 = i82 >> 18;
            int i142 = ((i132 & (-32767)) + (i132 | (-32767))) / 16384;
            int i152 = -(((i142 ^ 1) + ((i142 & 1) << 1)) ^ i122);
            int i162 = (i152 ^ 3) + ((i152 & 3) << 1);
            int i172 = i162 >> 22;
            int i182 = ((i172 & (-2047)) + (i172 | (-2047))) / 1024;
            int i192 = (i182 & 1) + (i182 | 1);
            sb2.append("10,26,24, TAG ===  rolled ? ".substring(45603 / (((-(((i192 | 1) << 1) - (i192 ^ 1))) & i162) * 1689)));
            sb2.append(z2);
            getPadSub2.PngjException("TAG", sb2.toString());
            if (!isIntroShown(activity, key)) {
            }
            if (!z2) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Class getClassForDetection(Activity activity, Intent intent, boolean z, FingerDetectionMode[] fingerDetectionModeArr, boolean z2) {
        java.lang.Object[] PngjBadSignature2;
        long j;
        String stringExtra;
        int i;
        int i2;
        java.lang.Object[] objArr = Fpnative.valueOf;
        if (objArr != null) {
            long j2 = ((long[]) objArr[0])[0];
            j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
            if (j2 > j) {
                PngjBadSignature2 = new java.lang.Object[]{new long[]{((long[]) objArr[0])[0]}, new int[1]};
                int myPid = Process.myPid();
                int c = defpackage.a.c(~(myPid | (-113377857)), 345, (((~((-384967420) | (~myPid))) | 544004) * 345) + (((~((-384967420) | myPid)) | 113377856) * 345) + 180779864, -689183080);
                int i3 = c ^ (c << 13);
                int i4 = i3 ^ (i3 >>> 17);
                ((int[]) PngjBadSignature2[1])[0] = i4 ^ (i4 << 5);
                valueOf = (PngjBadSignature + 35) % 128;
                ((long[]) PngjBadSignature2[0])[0] = j + 4979;
                Fpnative.valueOf = PngjBadSignature2;
                stringExtra = intent.getStringExtra("type");
                int i5 = ((int[]) PngjBadSignature2[1])[0];
                int i6 = ((i5 * i5) - (~(-(885835016 * i5)))) - 1;
                int i7 = -(i5 * (-553154412));
                int i8 = ((i6 & i7) + (i7 | i6)) - (-1920585156);
                int e = IdentyB.e(i8 >> 24, 511, 256, -1);
                int i9 = -(e ^ (((i8 | e) << 1) - (i8 ^ e)));
                i = (i9 ^ 9) + ((i9 & 9) << 1);
                i2 = ((i >> 27) - 63) / 32;
                if (!stringExtra.equals("18\\22\\28\\6\\register".substring(118602 / (((-(((i2 & 1) + (i2 | 1)) - (-1))) & i) * 1198)))) {
                    return getRegistrationClass(activity, z, fingerDetectionModeArr);
                }
                if (stringExtra.equals("verify")) {
                    return getVerifyClass(activity, z, fingerDetectionModeArr);
                }
                if (!stringExtra.equals("preview")) {
                    if (!stringExtra.equals("capture")) {
                        return getRegistrationClass(activity, z, fingerDetectionModeArr);
                    }
                    valueOf = (PngjBadSignature + 49) % 128;
                    return getCaptureClass(activity, z, fingerDetectionModeArr, z2);
                }
                PngjBadSignature = (valueOf + 107) % 128;
                Class previewClass = getPreviewClass(activity, z, fingerDetectionModeArr);
                int i10 = valueOf + 57;
                PngjBadSignature = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 10 / 0;
                }
                return previewClass;
            }
        }
        PngjBadSignature2 = PngjBadSignature(-689183080);
        j = ((long[]) PngjBadSignature2[0])[0];
        ((long[]) PngjBadSignature2[0])[0] = j + 4979;
        Fpnative.valueOf = PngjBadSignature2;
        stringExtra = intent.getStringExtra("type");
        int i52 = ((int[]) PngjBadSignature2[1])[0];
        int i62 = ((i52 * i52) - (~(-(885835016 * i52)))) - 1;
        int i72 = -(i52 * (-553154412));
        int i82 = ((i62 & i72) + (i72 | i62)) - (-1920585156);
        int e2 = IdentyB.e(i82 >> 24, 511, 256, -1);
        int i92 = -(e2 ^ (((i82 | e2) << 1) - (i82 ^ e2)));
        i = (i92 ^ 9) + ((i92 & 9) << 1);
        i2 = ((i >> 27) - 63) / 32;
        if (!stringExtra.equals("18\\22\\28\\6\\register".substring(118602 / (((-(((i2 & 1) + (i2 | 1)) - (-1))) & i) * 1198)))) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        if (0 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
    
        if (0 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004c, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a[0])[0]}, new int[1]};
        0 = defpackage.a.c((~((~android.os.Process.myPid()) | (-283152968))) | 773653632, 420, ((~(0 | (-283152968))) * 420) - 978250813, 1043284810);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a[1])[0] = 0 ^ (0 << 5);
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x014f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getKey(FingerDetectionMode fingerDetectionMode, boolean z) {
        long j;
        int i;
        java.lang.Object[] objArr = Fpnative.valueOf;
        if (objArr != null) {
            int i2 = valueOf + 7;
            PngjBadSignature = i2 % 128;
            if (i2 % 2 != 0) {
                long j2 = ((long[]) objArr[1])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[1]).invoke(null, null)).longValue();
            } else {
                long j3 = ((long[]) objArr[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
            }
            ((long[]) $$a[0])[0] = j + 4929;
            Fpnative.valueOf = 0;
            StringBuilder sb = new StringBuilder();
            sb.append((fingerDetectionMode.getFinger() == null && fingerDetectionMode.getFinger().equals(Finger.THUMB)) ? "thumb" : "4F");
            sb.append((fingerDetectionMode.getHand() == null && fingerDetectionMode.getHand().equals(Hand.LEFT)) ? "_left" : "_right");
            int i3 = ((int[]) $$a[1])[0];
            int i4 = i3 * i3;
            int i5 = -(620460754 * i3);
            int i6 = (i4 & i5) + (i4 | i5);
            int i7 = -(i3 * (-417704842));
            int i8 = (i6 & i7) + (i7 | i6);
            int i9 = (i8 ^ (-1704369904)) + (((-1704369904) & i8) << 1);
            int e = IdentyB.e(i9 >> 18, 32767, 16384, -1);
            int i10 = (i9 ^ e) + ((e & i9) << 1);
            int i11 = i9 >> 21;
            int i12 = ((i11 ^ (-4095)) + ((i11 & (-4095)) << 1)) / 2048;
            int i13 = (-(((i12 & 1) + (i12 | 1)) ^ i10)) + 8;
            int e2 = IdentyB.e(i13 >> 22, 2047, 1024, -1);
            sb.append("8/9/11/30/_".substring(13840 / ((i13 & (-(((e2 | 1) << 1) - (e2 ^ 1)))) * 173)));
            sb.append(z);
            String obj = sb.toString();
            i = PngjBadSignature + 97;
            valueOf = i % 128;
            if (i % 2 == 0) {
                return obj;
            }
            throw null;
        }
        java.lang.Object[] PngjBadSignature2 = PngjBadSignature(1043284810);
        j = ((long[]) PngjBadSignature2[0])[0];
        ((long[]) PngjBadSignature2[0])[0] = j + 4929;
        Fpnative.valueOf = PngjBadSignature2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((fingerDetectionMode.getFinger() == null && fingerDetectionMode.getFinger().equals(Finger.THUMB)) ? "thumb" : "4F");
        sb2.append((fingerDetectionMode.getHand() == null && fingerDetectionMode.getHand().equals(Hand.LEFT)) ? "_left" : "_right");
        int i32 = ((int[]) PngjBadSignature2[1])[0];
        int i42 = i32 * i32;
        int i52 = -(620460754 * i32);
        int i62 = (i42 & i52) + (i42 | i52);
        int i72 = -(i32 * (-417704842));
        int i82 = (i62 & i72) + (i72 | i62);
        int i92 = (i82 ^ (-1704369904)) + (((-1704369904) & i82) << 1);
        int e3 = IdentyB.e(i92 >> 18, 32767, 16384, -1);
        int i102 = (i92 ^ e3) + ((e3 & i92) << 1);
        int i112 = i92 >> 21;
        int i122 = ((i112 ^ (-4095)) + ((i112 & (-4095)) << 1)) / 2048;
        int i132 = (-(((i122 & 1) + (i122 | 1)) ^ i102)) + 8;
        int e22 = IdentyB.e(i132 >> 22, 2047, 1024, -1);
        sb2.append("8/9/11/30/_".substring(13840 / ((i132 & (-(((e22 | 1) << 1) - (e22 ^ 1)))) * 173)));
        sb2.append(z);
        String obj2 = sb2.toString();
        i = PngjBadSignature + 97;
        valueOf = i % 128;
        if (i % 2 == 0) {
        }
    }

    public static String getPersonSelected(Activity activity) {
        java.lang.Object[] objArr;
        long j;
        java.lang.Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new java.lang.Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = defpackage.a.c((~((~Process.myPid()) | (-35184276))) | 431705407, 398, (((~((-35184276) | 0)) | 431705407) * 398) - 25919653, 536136751);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    valueOf = (PngjBadSignature + 97) % 128;
                    ((long[]) objArr[0])[0] = j + 4851;
                    Fpnative.valueOf = objArr;
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(activity);
                    int i3 = ((int[]) objArr[1])[0];
                    int i4 = ((((i3 * i3) - (~(-(852946970 * i3)))) - 1) - (~(-(i3 * 2028880518)))) - 1;
                    int i5 = ((i4 | 756070656) << 1) - (756070656 ^ i4);
                    int i6 = i5 >> 17;
                    int i7 = (((i6 | (-65535)) << 1) - (i6 ^ (-65535))) / 32768;
                    int i8 = (i7 & 1) + (i7 | 1);
                    int i9 = (i5 ^ i8) + ((i8 & i5) << 1);
                    int i10 = ((i5 >> 20) - 8191) / ConstantsKt.DEFAULT_BLOCK_SIZE;
                    int i11 = -(i9 ^ ((i10 & 1) + (i10 | 1)));
                    int i12 = ((i11 | 7) << 1) - (i11 ^ 7);
                    int i13 = i12 >> 19;
                    int i14 = ((i13 & (-16383)) + (i13 | (-16383))) / ConstantsKt.DEFAULT_BUFFER_SIZE;
                    String string = defaultSharedPreferences.getString(IdentyB.c((-((i14 ^ 1) + ((i14 & 1) << 1) + 1)) & i12, 1284, 71904, "8;12;16;v1_person_selected"), BuildConfig.FLAVOR);
                    valueOf = (PngjBadSignature + 79) % 128;
                    return string;
                }
            }
            byte[] bArr = $$d;
            byte b = bArr[12];
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a((short) 35, b, (byte) (b + 5), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a((short) (bArr[0] + 1), bArr[17], (byte) (bArr[107] - 1), objArr4);
            objArr = (java.lang.Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 536136751);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4851;
            Fpnative.valueOf = objArr;
            SharedPreferences defaultSharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(activity);
            int i32 = ((int[]) objArr[1])[0];
            int i42 = ((((i32 * i32) - (~(-(852946970 * i32)))) - 1) - (~(-(i32 * 2028880518)))) - 1;
            int i52 = ((i42 | 756070656) << 1) - (756070656 ^ i42);
            int i62 = i52 >> 17;
            int i72 = (((i62 | (-65535)) << 1) - (i62 ^ (-65535))) / 32768;
            int i82 = (i72 & 1) + (i72 | 1);
            int i92 = (i52 ^ i82) + ((i82 & i52) << 1);
            int i102 = ((i52 >> 20) - 8191) / ConstantsKt.DEFAULT_BLOCK_SIZE;
            int i112 = -(i92 ^ ((i102 & 1) + (i102 | 1)));
            int i122 = ((i112 | 7) << 1) - (i112 ^ 7);
            int i132 = i122 >> 19;
            int i142 = ((i132 & (-16383)) + (i132 | (-16383))) / ConstantsKt.DEFAULT_BUFFER_SIZE;
            String string2 = defaultSharedPreferences2.getString(IdentyB.c((-((i142 ^ 1) + ((i142 & 1) << 1) + 1)) & i122, 1284, 71904, "8;12;16;v1_person_selected"), BuildConfig.FLAVOR);
            valueOf = (PngjBadSignature + 79) % 128;
            return string2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        valueOf = (PngjBadSignature + 79) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Class getPreviewClass(Activity activity, boolean z, FingerDetectionMode[] fingerDetectionModeArr) {
        java.lang.Object[] PngjBadSignature2;
        long j;
        String str;
        java.lang.Object[] objArr = Fpnative.valueOf;
        if (objArr != null) {
            valueOf = (PngjBadSignature + 1) % 128;
            long j2 = ((long[]) objArr[0])[0];
            j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
            if (j2 > j) {
                PngjBadSignature2 = new java.lang.Object[]{new long[]{((long[]) objArr[0])[0]}, new int[1]};
                int freeMemory = (int) Runtime.getRuntime().freeMemory();
                int c = defpackage.a.c((~(freeMemory | (-157751679))) | 153223486, 490, (((-4528193) | (~freeMemory)) * (-490)) + 163678333, 737800053);
                int i = c ^ (c << 13);
                int i2 = i ^ (i >>> 17);
                ((int[]) PngjBadSignature2[1])[0] = i2 ^ (i2 << 5);
                ((long[]) PngjBadSignature2[0])[0] = j + 5041;
                Fpnative.valueOf = PngjBadSignature2;
                if (fingerDetectionModeArr.length != 0) {
                    throw new NoDetectionModeException();
                }
                StringBuilder sb = new StringBuilder();
                int i3 = ((int[]) PngjBadSignature2[1])[0];
                int i4 = i3 * i3;
                int i5 = -(739870108 * i3);
                int i6 = (i4 & i5) + (i4 | i5);
                int i7 = -(i3 * 1805549126);
                int i8 = (i6 & i7) + (i7 | i6);
                int i9 = (i8 & (-1942240031)) + ((-1942240031) | i8);
                int i10 = i9 >> 15;
                int i11 = (((i10 | (-262143)) << 1) - (i10 ^ (-262143))) / 131072;
                int i12 = (i11 & 1) + (i11 | 1);
                int i13 = (i9 ^ i12) + ((i12 & i9) << 1);
                int i14 = i9 >> 22;
                int i15 = ((i14 ^ (-2047)) + ((i14 & (-2047)) << 1)) / 1024;
                int i16 = -((((i15 | 1) << 1) - (i15 ^ 1)) ^ i13);
                int i17 = (i16 ^ 4) + ((i16 & 4) << 1);
                int i18 = i17 >> 25;
                int a = IdentyB.a(i18 ^ (-255), (i18 & (-255)) << 1, 128, -1);
                if (fingerDetectionModeArr[0 / (((-((a ^ 1) + ((a & 1) << 1))) & i17) * 491)].getFinger() != null) {
                    valueOf = (PngjBadSignature + 5) % 128;
                    if (fingerDetectionModeArr[0].getFinger().equals(Finger.THUMB)) {
                        int i19 = valueOf + 25;
                        PngjBadSignature = i19 % 128;
                        if (i19 % 2 != 0) {
                            int i20 = 57 / 0;
                        }
                        str = "thumb";
                        sb.append(str);
                        sb.append((fingerDetectionModeArr[0].getHand() == null && fingerDetectionModeArr[0].getHand().equals(Hand.LEFT)) ? "_left" : "_right");
                        isIntroShown(activity, sb.toString());
                        return IntroActivity.class;
                    }
                }
                str = "4F";
                sb.append(str);
                sb.append((fingerDetectionModeArr[0].getHand() == null && fingerDetectionModeArr[0].getHand().equals(Hand.LEFT)) ? "_left" : "_right");
                isIntroShown(activity, sb.toString());
                return IntroActivity.class;
            }
        }
        PngjBadSignature2 = PngjBadSignature(391500489);
        j = ((long[]) PngjBadSignature2[0])[0];
        ((long[]) PngjBadSignature2[0])[0] = j + 5041;
        Fpnative.valueOf = PngjBadSignature2;
        if (fingerDetectionModeArr.length != 0) {
        }
    }

    public static Class getRegistrationClass(Activity activity, boolean z, FingerDetectionMode[] fingerDetectionModeArr) {
        java.lang.Object[] objArr;
        long j;
        int i;
        int i2;
        java.lang.Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new java.lang.Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    int i3 = ~elapsedCpuTime;
                    int i4 = ~((-705720364) | i3);
                    int i5 = ~(206831083 | elapsedCpuTime);
                    int c = defpackage.a.c((~(elapsedCpuTime | (-705720364))) | (~(i3 | 705720363)), 575, ((i5 | (~((-206831084) | i3))) * (-575)) + ((i4 | i5) * 1150) + 1400362686, -1168332796);
                    int i6 = c ^ (c << 13);
                    int i7 = i6 ^ (i6 >>> 17);
                    ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
                    PngjBadSignature = (valueOf + 91) % 128;
                    ((long[]) objArr[0])[0] = j + 4931;
                    Fpnative.valueOf = objArr;
                    int i8 = ((int[]) objArr[1])[0];
                    int i9 = ((i8 * i8) - (~(-(819411603 * i8)))) - 1;
                    int i10 = -(i8 * (-234046845));
                    int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
                    int i12 = (i11 & (-1712732295)) + ((-1712732295) | i11);
                    int i13 = i12 >> 26;
                    int i14 = ((i13 & (-127)) + (i13 | (-127))) / 64;
                    int i15 = (i14 ^ 1) + ((i14 & 1) << 1);
                    int i16 = (i12 ^ i15) + ((i15 & i12) << 1);
                    int i17 = i12 >> 23;
                    int i18 = ((i17 ^ (-1023)) + ((i17 & (-1023)) << 1)) / ConstantsKt.MINIMUM_BLOCK_SIZE;
                    int i19 = -(((i18 & 1) + (i18 | 1)) ^ i16);
                    i = ((i19 | 9) << 1) - (i19 ^ 9);
                    int i20 = i >> 23;
                    int i21 = (((i20 | (-1023)) << 1) - (i20 ^ (-1023))) / ConstantsKt.MINIMUM_BLOCK_SIZE;
                    i2 = ((i21 | 1) << 1) - (i21 ^ 1);
                    if (isIntroShown(activity, getKey(fingerDetectionModeArr[0 / (((-(((i2 | 1) << 1) - (i2 ^ 1))) & i) * 492)], false)) && !z) {
                        return IntroActivity.class;
                    }
                    if (fingerDetectionModeArr[0].equals(FingerDetectionMode.L4F) && !fingerDetectionModeArr[0].equals(FingerDetectionMode.R4F)) {
                        if (fingerDetectionModeArr[0].equals(FingerDetectionMode.LEFT_RIGHT_INDEX)) {
                            return Enroll2IndexActivity.class;
                        }
                        if (fingerDetectionModeArr[0].equals(FingerDetectionMode.TWO_THUMB)) {
                            return Enroll2TActivity.class;
                        }
                        if (fingerDetectionModeArr[0].equals(FingerDetectionMode.LEFT_THUMB)) {
                            return EnrollThumbActivity.class;
                        }
                        valueOf = (PngjBadSignature + 77) % 128;
                        if (fingerDetectionModeArr[0].equals(FingerDetectionMode.RIGHT_THUMB)) {
                            return EnrollThumbActivity.class;
                        }
                        if (fingerDetectionModeArr[0].equals(FingerDetectionMode.LEFT_INDEX) || fingerDetectionModeArr[0].equals(FingerDetectionMode.LEFT_MIDDLE) || fingerDetectionModeArr[0].equals(FingerDetectionMode.LEFT_RING)) {
                            return EnrollFingersActivity.class;
                        }
                        PngjBadSignature = (valueOf + 27) % 128;
                        if (fingerDetectionModeArr[0].equals(FingerDetectionMode.LEFT_LITTLE) || fingerDetectionModeArr[0].equals(FingerDetectionMode.RIGHT_INDEX)) {
                            return EnrollFingersActivity.class;
                        }
                        int i22 = valueOf + 91;
                        PngjBadSignature = i22 % 128;
                        if (i22 % 2 != 0) {
                            if (fingerDetectionModeArr[1].equals(FingerDetectionMode.RIGHT_MIDDLE)) {
                                return EnrollFingersActivity.class;
                            }
                        } else if (fingerDetectionModeArr[0].equals(FingerDetectionMode.RIGHT_MIDDLE)) {
                            return EnrollFingersActivity.class;
                        }
                        if (fingerDetectionModeArr[0].equals(FingerDetectionMode.RIGHT_RING)) {
                            return EnrollFingersActivity.class;
                        }
                        int i23 = PngjBadSignature + 57;
                        valueOf = i23 % 128;
                        return i23 % 2 == 0 ? !fingerDetectionModeArr[1].equals(FingerDetectionMode.RIGHT_LITTLE) ? IntroActivity.class : EnrollFingersActivity.class : !fingerDetectionModeArr[0].equals(FingerDetectionMode.RIGHT_LITTLE) ? IntroActivity.class : EnrollFingersActivity.class;
                    }
                }
            }
            byte[] bArr = $$d;
            byte b = bArr[12];
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a((short) 35, b, (byte) (b + 5), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a((short) (bArr[0] + 1), bArr[17], (byte) (bArr[107] - 1), objArr4);
            objArr = (java.lang.Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1168332796);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4931;
            Fpnative.valueOf = objArr;
            int i82 = ((int[]) objArr[1])[0];
            int i92 = ((i82 * i82) - (~(-(819411603 * i82)))) - 1;
            int i102 = -(i82 * (-234046845));
            int i112 = ((i92 | i102) << 1) - (i102 ^ i92);
            int i122 = (i112 & (-1712732295)) + ((-1712732295) | i112);
            int i132 = i122 >> 26;
            int i142 = ((i132 & (-127)) + (i132 | (-127))) / 64;
            int i152 = (i142 ^ 1) + ((i142 & 1) << 1);
            int i162 = (i122 ^ i152) + ((i152 & i122) << 1);
            int i172 = i122 >> 23;
            int i182 = ((i172 ^ (-1023)) + ((i172 & (-1023)) << 1)) / ConstantsKt.MINIMUM_BLOCK_SIZE;
            int i192 = -(((i182 & 1) + (i182 | 1)) ^ i162);
            i = ((i192 | 9) << 1) - (i192 ^ 9);
            int i202 = i >> 23;
            int i212 = (((i202 | (-1023)) << 1) - (i202 ^ (-1023))) / ConstantsKt.MINIMUM_BLOCK_SIZE;
            i2 = ((i212 | 1) << 1) - (i212 ^ 1);
            if (isIntroShown(activity, getKey(fingerDetectionModeArr[0 / (((-(((i2 | 1) << 1) - (i2 ^ 1))) & i) * 492)], false))) {
            }
            return fingerDetectionModeArr[0].equals(FingerDetectionMode.L4F) ? Enroll4FActivity.class : Enroll4FActivity.class;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        PngjBadSignature = (valueOf + 87) % 128;
    }

    /* JADX WARN: Type inference failed for: r2v39, types: [boolean, int] */
    public static Class getVerifyClass(Activity activity, boolean z, FingerDetectionMode[] fingerDetectionModeArr) {
        java.lang.Object[] objArr;
        long j;
        FingerDetectionMode fingerDetectionMode;
        int i;
        int i2;
        java.lang.Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new java.lang.Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = defpackage.a.c((~(Process.myUid() | 553975616)) | 55086336, 529, (((~((~0) | 553975616)) | 38273024) * 529) - 1876653424, -1518824212);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 4862;
                    Fpnative.valueOf = objArr;
                    fingerDetectionMode = fingerDetectionModeArr[0];
                    int i5 = ((int[]) objArr[1])[0];
                    int i6 = ((i5 * i5) - (~(-(527400600 * i5)))) - 1;
                    int i7 = -(i5 * 340106926);
                    int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
                    int i9 = (i8 & 320158665) + (320158665 | i8);
                    int i10 = i9 >> 16;
                    int i11 = (((i10 | (-131071)) << 1) - (i10 ^ (-131071))) / 65536;
                    int i12 = (i11 & 1) + (i11 | 1);
                    int i13 = (i9 & i12) + (i12 | i9);
                    int i14 = i9 >> 18;
                    int i15 = ((i14 ^ (-32767)) + ((i14 & (-32767)) << 1)) / 16384;
                    int i16 = -(((i15 & 1) + (i15 | 1)) ^ i13);
                    i = (i16 & 1) + (i16 | 1);
                    int i17 = i >> 22;
                    int i18 = ((i17 ^ (-2047)) + ((i17 & (-2047)) << 1)) / 1024;
                    i2 = ((i18 | 1) << 1) - (i18 ^ 1);
                    if (isIntroShown(activity, getKey(fingerDetectionMode, 0 / (((-(((i2 | 1) << 1) - (i2 ^ 1))) & i) * 1690))) && !z) {
                        return IntroActivity.class;
                    }
                    if (!fingerDetectionModeArr[0].equals(FingerDetectionMode.L4F) || fingerDetectionModeArr[0].equals(FingerDetectionMode.R4F)) {
                        return Verify4FActivity.class;
                    }
                    if (fingerDetectionModeArr[0].equals(FingerDetectionMode.LEFT_RIGHT_INDEX)) {
                        return Verify2IndexActivity.class;
                    }
                    if (fingerDetectionModeArr[0].equals(FingerDetectionMode.TWO_THUMB)) {
                        return Verify2TActivity.class;
                    }
                    if (fingerDetectionModeArr[0].equals(FingerDetectionMode.LEFT_THUMB) || fingerDetectionModeArr[0].equals(FingerDetectionMode.RIGHT_THUMB)) {
                        return VerifyThumbActivity.class;
                    }
                    if (fingerDetectionModeArr[0].equals(FingerDetectionMode.LEFT_INDEX)) {
                        return VerifyFingersActivity.class;
                    }
                    PngjBadSignature = (valueOf + 17) % 128;
                    if (fingerDetectionModeArr[0].equals(FingerDetectionMode.LEFT_MIDDLE) || fingerDetectionModeArr[0].equals(FingerDetectionMode.LEFT_RING) || fingerDetectionModeArr[0].equals(FingerDetectionMode.LEFT_LITTLE) || fingerDetectionModeArr[0].equals(FingerDetectionMode.RIGHT_INDEX)) {
                        return VerifyFingersActivity.class;
                    }
                    int i19 = PngjBadSignature + 35;
                    valueOf = i19 % 128;
                    if (i19 % 2 == 0) {
                        if (fingerDetectionModeArr[0].equals(FingerDetectionMode.RIGHT_MIDDLE)) {
                            return VerifyFingersActivity.class;
                        }
                    } else if (!(!fingerDetectionModeArr[0].equals(FingerDetectionMode.RIGHT_MIDDLE))) {
                        return VerifyFingersActivity.class;
                    }
                    return (fingerDetectionModeArr[0].equals(FingerDetectionMode.RIGHT_RING) || fingerDetectionModeArr[0].equals(FingerDetectionMode.RIGHT_LITTLE)) ? VerifyFingersActivity.class : Verify4FActivity.class;
                }
            }
            byte[] bArr = $$d;
            byte b = bArr[12];
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a((short) 35, b, (byte) (b + 5), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a((short) (bArr[0] + 1), bArr[17], (byte) (bArr[107] - 1), objArr4);
            objArr = (java.lang.Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1518824212);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4862;
            Fpnative.valueOf = objArr;
            fingerDetectionMode = fingerDetectionModeArr[0];
            int i52 = ((int[]) objArr[1])[0];
            int i62 = ((i52 * i52) - (~(-(527400600 * i52)))) - 1;
            int i72 = -(i52 * 340106926);
            int i82 = (i62 ^ i72) + ((i72 & i62) << 1);
            int i92 = (i82 & 320158665) + (320158665 | i82);
            int i102 = i92 >> 16;
            int i112 = (((i102 | (-131071)) << 1) - (i102 ^ (-131071))) / 65536;
            int i122 = (i112 & 1) + (i112 | 1);
            int i132 = (i92 & i122) + (i122 | i92);
            int i142 = i92 >> 18;
            int i152 = ((i142 ^ (-32767)) + ((i142 & (-32767)) << 1)) / 16384;
            int i162 = -(((i152 & 1) + (i152 | 1)) ^ i132);
            i = (i162 & 1) + (i162 | 1);
            int i172 = i >> 22;
            int i182 = ((i172 ^ (-2047)) + ((i172 & (-2047)) << 1)) / 1024;
            i2 = ((i182 | 1) << 1) - (i182 ^ 1);
            if (isIntroShown(activity, getKey(fingerDetectionMode, 0 / (((-(((i2 | 1) << 1) - (i2 ^ 1))) & i) * 1690)))) {
            }
            if (fingerDetectionModeArr[0].equals(FingerDetectionMode.L4F)) {
            }
            return Verify4FActivity.class;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        valueOf = (PngjBadSignature + 73) % 128;
    }

    public static void init$0() {
        $$a = new byte[]{12, -113, -62, 71, -25, 12, 2, 45, -26, 2, 38, -42, 20, 35, -46, 26, 3, -6, 1, 16, -1, 6, 26, -6, -4, 21, -9, -25, 12, 2, 42, -46, 26, 3, -6, 1, 16, -1, 6, 26, -6, -4, 21, 27, -18};
        $$b = 100;
    }

    public static void init$1() {
        $$d = new byte[]{77, 125, 4, 95, 21, 7, -54, 68, 4, 10, 18, 15, 14, -66, 66, -48, 43, 39, 2, 12, -31, 40, 12, -24, 56, -6, -21, 60, -12, 11, 20, 13, -2, 15, 8, -12, 20, 18, -7, 23, 21, 7, -54, 68, 4, 10, 18, 15, 14, -66, 32, 50, 13, 6, 6, 9, -47, 27, 4, 43, 26, -2, 22, -4, 20, 14, -76, 53, 39, 2, 12, -31, 40, 12, -8, 31, 7, 16, -4, 28, 10, 6, -4, 39, 2, 12, -31, 40, 12, -24, 56, -6, -21, 60, -12, 11, 20, 13, -2, 15, 8, 12, -2, -48, 62, 7, 21, 1, 22, -8, -42, 75, 11, -4, 26, -4, 5, 27, -64, 43, 39, 2, 12, -31, 40, 12, -24, 56, -6, -21, 60, -12, 11, 20, 13, -2, 15, 8, -65, 53, 39, 2, 12, -18, 47, 8, 5, 14, 8, -38, 60, -12, 11, 20, 13, -2, 15, 8, 39, 2, 12, -31, 40, 12, -8, 31, 7, 16, -4, 28, 10, 6, -4};
        $$e = 236;
    }

    public static void init$2() {
        $$c = new byte[]{12, -113, -62, 71};
        $$f = 182;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        0 = ((long[]) $$a[0])[0];
        0 = ((java.lang.Long) ((java.lang.reflect.Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
    
        if (0 > 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009f, code lost:
    
        0 = com.identy.GuideNoGuideHelper.$$d;
        0 = new java.lang.Object[1];
        a((short) (-$$a[107(0x6b, float:1.5E-43)]), $$a[60], (byte) ($$a[30] - 1), 0);
        0 = java.lang.Class.forName((java.lang.String) $$a[0]);
        0 = new java.lang.Object[1];
        a((short) ($$a[75] - 1), (byte) ($$a[67] - 1), (byte) (-$$a[149(0x95, float:2.09E-43)]), 0);
        0 = (java.lang.Object[]) 0.getMethod((java.lang.String) $$a[0], java.lang.Integer.TYPE).invoke(null, -164435209);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00f2, code lost:
    
        0 = ((long[]) $$a[0])[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0180, code lost:
    
        0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0181, code lost:
    
        0 = 0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0185, code lost:
    
        if (0 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0187, code lost:
    
        throw 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0188, code lost:
    
        throw 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x001c, code lost:
    
        if (0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        0 = 0 + 59;
        com.identy.GuideNoGuideHelper.PngjBadSignature = 0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
    
        if ((0 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
    
        0 = ((long[]) $$a[1])[1];
        0 = ((java.lang.Long) ((java.lang.reflect.Method) com.d.e.a.values.valueOf[0]).invoke(null, new java.lang.Object[1])).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0041, code lost:
    
        if (0 > 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005f, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a[0])[0]}, new int[1]};
        0 = defpackage.a.c((~android.os.Process.myPid()) | 494886911, 756, (((~(494886911 | 0)) | 4002368) * (-756)) - 1242637773, -164435209);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a[1])[0] = 0 ^ (0 << 5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean isIntroShown(Activity activity, String str) {
        throw new UnsupportedOperationException("Method not decompiled");
    }

    private static boolean isIntroShown_REMOVED(Activity activity, String str) {
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        long j;
        int i = valueOf;
        int i2 = i + com.karumi.dexter.R.styleable.AppCompatTheme_tooltipFrameBackground;
        PngjBadSignature = i2 % 128;
        if (i2 % 2 != 0) {
            objArr = Fpnative.valueOf;
            int i3 = 45 / 0;
        } else {
            objArr = Fpnative.valueOf;
        }
        ((long[]) objArr2[0])[0] = j + 4860;
        Fpnative.valueOf = objArr2;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(activity);
        StringBuilder sb = new StringBuilder();
        int i4 = ((int[]) objArr2[1])[0];
        int i5 = ((i4 * i4) - (~(-(2113035437 * i4)))) - 1;
        int i6 = -(i4 * 1694050807);
        int i7 = (((i5 | i6) << 1) - (i6 ^ i5)) - 2114320828;
        int i8 = i7 >> 23;
        int i9 = ((i8 & (-1023)) + (i8 | (-1023))) / ConstantsKt.MINIMUM_BLOCK_SIZE;
        int i10 = ((i9 | 1) << 1) - (i9 ^ 1);
        int i11 = ((i7 | i10) << 1) - (i10 ^ i7);
        int i12 = ((i7 >> 17) - 65535) / 32768;
        int i13 = -(i11 ^ ((i12 & 1) + (i12 | 1)));
        int i14 = (i13 & 9) + (i13 | 9);
        int i15 = ((i14 >> 20) - 8191) / ConstantsKt.DEFAULT_BLOCK_SIZE;
        int i16 = ((i15 | 1) << 1) - (i15 ^ 1);
        sb.append("4/21/v1_intro_shown_".substring(64530 / (((-((i16 ^ 1) + ((i16 & 1) << 1))) & i14) * 1434)));
        sb.append(str);
        return defaultSharedPreferences.getBoolean(sb.toString(), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0113  */
    /* JADX WARN: Type inference failed for: r4v33, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean isIntroShownG(Activity activity) {
        java.lang.Object[] PngjBadSignature2;
        long j;
        SharedPreferences defaultSharedPreferences;
        String obj;
        int i;
        int i2;
        valueOf = (PngjBadSignature + 67) % 128;
        java.lang.Object[] objArr = Fpnative.valueOf;
        if (objArr != null) {
            long j2 = ((long[]) objArr[0])[0];
            j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
            if (j2 > j) {
                PngjBadSignature2 = new java.lang.Object[]{new long[]{((long[]) objArr[0])[0]}, new int[1]};
                int a = defpackage.a.a();
                int i3 = (((~((-877262043) | a)) | 541094976 | (~(378372762 | a))) * (-880)) + 1434790607;
                int i4 = (~((-877262043) | (~a))) | (-378372763);
                int i5 = ~(a | 877262042);
                int c = defpackage.a.c(i5, 880, ((i4 | i5) * (-880)) + i3, -747563320);
                int i6 = c ^ (c << 13);
                int i7 = i6 ^ (i6 >>> 17);
                ((int[]) PngjBadSignature2[1])[0] = i7 ^ (i7 << 5);
                ((long[]) PngjBadSignature2[0])[0] = j + 4950;
                Fpnative.valueOf = PngjBadSignature2;
                defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(activity);
                StringBuilder sb = new StringBuilder("v1_intro_shown_");
                sb.append(getKey(FingerDetectionMode.L4F, false));
                obj = sb.toString();
                int i8 = ((int[]) PngjBadSignature2[1])[0];
                int i9 = i8 * i8;
                int i10 = -(1769387047 * i8);
                int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
                int i12 = -(i8 * 433200667);
                int i13 = ((i11 ^ i12) + ((i12 & i11) << 1)) - 1619782079;
                int i14 = i13 >> 24;
                int i15 = (((i14 | (-511)) << 1) - (i14 ^ (-511))) / 256;
                int i16 = (i15 ^ 1) + ((i15 & 1) << 1);
                int i17 = (i13 ^ i16) + ((i16 & i13) << 1);
                int i18 = ((i13 >> 26) - 127) / 64;
                int i19 = -(i17 ^ ((i18 ^ 1) + ((i18 & 1) << 1)));
                i = (i19 & 9) + (i19 | 9);
                int i20 = i >> 18;
                i2 = (((i20 | (-32767)) << 1) - (i20 ^ (-32767))) / 16384;
                if (!defaultSharedPreferences.getBoolean(obj, 0 / (((-((((i2 | 1) << 1) - (i2 ^ 1)) + 1)) & i) * 895))) {
                    StringBuilder sb2 = new StringBuilder("v1_intro_shown_");
                    sb2.append(getKey(FingerDetectionMode.R4F, false));
                    if (!defaultSharedPreferences.getBoolean(sb2.toString(), false)) {
                        StringBuilder sb3 = new StringBuilder("v1_intro_shown_");
                        sb3.append(getKey(FingerDetectionMode.LEFT_THUMB, false));
                        if (!defaultSharedPreferences.getBoolean(sb3.toString(), false)) {
                            StringBuilder sb4 = new StringBuilder("v1_intro_shown_");
                            sb4.append(getKey(FingerDetectionMode.RIGHT_THUMB, false));
                            if (!defaultSharedPreferences.getBoolean(sb4.toString(), false)) {
                                PngjBadSignature = (valueOf + 65) % 128;
                                return false;
                            }
                        }
                    }
                }
                return true;
            }
        }
        PngjBadSignature2 = PngjBadSignature(-747563320);
        j = ((long[]) PngjBadSignature2[0])[0];
        ((long[]) PngjBadSignature2[0])[0] = j + 4950;
        Fpnative.valueOf = PngjBadSignature2;
        defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(activity);
        StringBuilder sb5 = new StringBuilder("v1_intro_shown_");
        sb5.append(getKey(FingerDetectionMode.L4F, false));
        obj = sb5.toString();
        int i82 = ((int[]) PngjBadSignature2[1])[0];
        int i92 = i82 * i82;
        int i102 = -(1769387047 * i82);
        int i112 = (i92 ^ i102) + ((i92 & i102) << 1);
        int i122 = -(i82 * 433200667);
        int i132 = ((i112 ^ i122) + ((i122 & i112) << 1)) - 1619782079;
        int i142 = i132 >> 24;
        int i152 = (((i142 | (-511)) << 1) - (i142 ^ (-511))) / 256;
        int i162 = (i152 ^ 1) + ((i152 & 1) << 1);
        int i172 = (i132 ^ i162) + ((i162 & i132) << 1);
        int i182 = ((i132 >> 26) - 127) / 64;
        int i192 = -(i172 ^ ((i182 ^ 1) + ((i182 & 1) << 1)));
        i = (i192 & 9) + (i192 | 9);
        int i202 = i >> 18;
        i2 = (((i202 | (-32767)) << 1) - (i202 ^ (-32767))) / 16384;
        if (!defaultSharedPreferences.getBoolean(obj, 0 / (((-((((i2 | 1) << 1) - (i2 ^ 1)) + 1)) & i) * 895))) {
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        if (0 <= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if (0 <= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004e, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a[0])[0]}, new int[1]};
        0 = android.os.Process.myUid();
        0 = ~0;
        0 = defpackage.a.c((~(0 | (-37981697))) | ((~(466861576 | 0)) | 536870976), 676, (((~(965750856 | 0)) | (-1003732553)) * 676) + (((1003732552 | 0) * (-676)) - 1717714909), -972224104);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a[1])[0] = 0 ^ (0 << 5);
     */
    /* JADX WARN: Type inference failed for: r2v25, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void markIntroSetting(Activity activity, boolean z) {
        long j;
        java.lang.Object[] objArr = Fpnative.valueOf;
        try {
            if (objArr != null) {
                int i = valueOf + 5;
                PngjBadSignature = i % 128;
                if (i % 2 != 0) {
                    long j2 = ((long[]) objArr[1])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[1]).invoke(null, new java.lang.Object[1])).longValue();
                } else {
                    long j3 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                }
                ((long[]) $$a[0])[0] = j + 5008;
                Fpnative.valueOf = 0;
                SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(activity).edit();
                StringBuilder sb = new StringBuilder("v1_intro_shown_");
                sb.append(getKey(FingerDetectionMode.L4F, false));
                edit.putBoolean(sb.toString(), z);
                StringBuilder sb2 = new StringBuilder("v1_intro_shown_");
                FingerDetectionMode fingerDetectionMode = FingerDetectionMode.R4F;
                int i2 = ((int[]) $$a[1])[0];
                int i3 = ((((i2 * i2) - (~(-(2012947794 * i2)))) - 1) - (~(-(i2 * 1033728842)))) - 1;
                int i4 = ((i3 | (-1961990204)) << 1) - ((-1961990204) ^ i3);
                int i5 = i4 >> 21;
                int i6 = ((i5 & (-4095)) + (i5 | (-4095))) / 2048;
                int i7 = (i6 & 1) + (i6 | 1);
                int i8 = ((i4 | i7) << 1) - (i7 ^ i4);
                int i9 = i4 >> 26;
                int i10 = (-(IdentyB.e((i9 | (-127)) << 1, i9 ^ (-127), 64, -1) ^ i8)) + 7;
                int i11 = ((i10 >> 24) - 511) / 256;
                sb2.append(getKey(fingerDetectionMode, 0 / ((i10 & (-(((i11 & 1) + (1 | i11)) - (-1)))) * 356)));
                edit.putBoolean(sb2.toString(), z);
                StringBuilder sb3 = new StringBuilder("v1_intro_shown_");
                sb3.append(getKey(FingerDetectionMode.LEFT_THUMB, false));
                edit.putBoolean(sb3.toString(), z);
                StringBuilder sb4 = new StringBuilder("v1_intro_shown_");
                sb4.append(getKey(FingerDetectionMode.RIGHT_THUMB, false));
                edit.putBoolean(sb4.toString(), z);
                edit.commit();
            }
            byte[] bArr = $$d;
            byte b = bArr[12];
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a((short) 35, b, (byte) (b + 5), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a((short) (bArr[0] + 1), bArr[17], (byte) (bArr[107] - 1), objArr3);
            java.lang.Object[] objArr4 = (java.lang.Object[]) cls.getMethod((String) objArr3[0], Integer.TYPE).invoke(null, -972224104);
            j = ((long[]) objArr4[0])[0];
            PngjBadSignature = (valueOf + 49) % 128;
            ((long[]) objArr4[0])[0] = j + 5008;
            Fpnative.valueOf = objArr4;
            SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(activity).edit();
            StringBuilder sb5 = new StringBuilder("v1_intro_shown_");
            sb5.append(getKey(FingerDetectionMode.L4F, false));
            edit2.putBoolean(sb5.toString(), z);
            StringBuilder sb22 = new StringBuilder("v1_intro_shown_");
            FingerDetectionMode fingerDetectionMode2 = FingerDetectionMode.R4F;
            int i22 = ((int[]) objArr4[1])[0];
            int i32 = ((((i22 * i22) - (~(-(2012947794 * i22)))) - 1) - (~(-(i22 * 1033728842)))) - 1;
            int i42 = ((i32 | (-1961990204)) << 1) - ((-1961990204) ^ i32);
            int i52 = i42 >> 21;
            int i62 = ((i52 & (-4095)) + (i52 | (-4095))) / 2048;
            int i72 = (i62 & 1) + (i62 | 1);
            int i82 = ((i42 | i72) << 1) - (i72 ^ i42);
            int i92 = i42 >> 26;
            int i102 = (-(IdentyB.e((i92 | (-127)) << 1, i92 ^ (-127), 64, -1) ^ i82)) + 7;
            int i112 = ((i102 >> 24) - 511) / 256;
            sb22.append(getKey(fingerDetectionMode2, 0 / ((i102 & (-(((i112 & 1) + (1 | i112)) - (-1)))) * 356)));
            edit2.putBoolean(sb22.toString(), z);
            StringBuilder sb32 = new StringBuilder("v1_intro_shown_");
            sb32.append(getKey(FingerDetectionMode.LEFT_THUMB, false));
            edit2.putBoolean(sb32.toString(), z);
            StringBuilder sb42 = new StringBuilder("v1_intro_shown_");
            sb42.append(getKey(FingerDetectionMode.RIGHT_THUMB, false));
            edit2.putBoolean(sb42.toString(), z);
            edit2.commit();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v20, types: [boolean, int] */
    public static void markIntroShown(Activity activity, String str) {
        java.lang.Object[] objArr;
        long j;
        int i;
        java.lang.Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new java.lang.Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int uptimeMillis = (int) SystemClock.uptimeMillis();
                    int i2 = ~((-911973741) | (~uptimeMillis));
                    int c = defpackage.a.c((~(uptimeMillis | (-142877185))) | i2, 338, (((-1054850925) | i2 | (~(911973740 | uptimeMillis))) * (-338)) + 441562197, -175119839);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    i = valueOf + 5;
                    PngjBadSignature = i % 128;
                    ((long[]) objArr[0])[0] = j + 4927;
                    Fpnative.valueOf = objArr;
                    SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(activity).edit();
                    String concat = "v1_intro_shown_".concat(String.valueOf(str));
                    int i5 = ((int[]) objArr[1])[0];
                    int i6 = ((i5 * i5) - (~(-(1853245001 * i5)))) - 1;
                    int i7 = -(i5 * (-720385353));
                    int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
                    int i9 = (i8 ^ (-213368832)) + (((-213368832) & i8) << 1);
                    int i10 = ((i9 >> 24) - 511) / 256;
                    int i11 = (i10 & 1) + (i10 | 1);
                    int i12 = (i9 & i11) + (i11 | i9);
                    int i13 = i9 >> 23;
                    int i14 = (((i13 | (-1023)) << 1) - (i13 ^ (-1023))) / ConstantsKt.MINIMUM_BLOCK_SIZE;
                    int i15 = -(i12 ^ (((i14 | 1) << 1) - (i14 ^ 1)));
                    int i16 = (i15 ^ 8) + ((i15 & 8) << 1);
                    int i17 = i16 >> 15;
                    int i18 = ((i17 & (-262143)) + (i17 | (-262143))) / 131072;
                    int i19 = (i18 & 1) + (i18 | 1);
                    edit.putBoolean(concat, 3008 / (((-((i19 & 1) + (i19 | 1))) & i16) * 376));
                    edit.commit();
                }
            }
            byte[] bArr = $$d;
            byte b = bArr[12];
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a((short) 35, b, (byte) (b + 5), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a((short) (bArr[0] + 1), bArr[17], (byte) (bArr[107] - 1), objArr4);
            objArr = (java.lang.Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -175119839);
            j = ((long[]) objArr[0])[0];
            i = valueOf + 27;
            PngjBadSignature = i % 128;
            ((long[]) objArr[0])[0] = j + 4927;
            Fpnative.valueOf = objArr;
            SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(activity).edit();
            String concat2 = "v1_intro_shown_".concat(String.valueOf(str));
            int i52 = ((int[]) objArr[1])[0];
            int i62 = ((i52 * i52) - (~(-(1853245001 * i52)))) - 1;
            int i72 = -(i52 * (-720385353));
            int i82 = (i62 ^ i72) + ((i72 & i62) << 1);
            int i92 = (i82 ^ (-213368832)) + (((-213368832) & i82) << 1);
            int i102 = ((i92 >> 24) - 511) / 256;
            int i112 = (i102 & 1) + (i102 | 1);
            int i122 = (i92 & i112) + (i112 | i92);
            int i132 = i92 >> 23;
            int i142 = (((i132 | (-1023)) << 1) - (i132 ^ (-1023))) / ConstantsKt.MINIMUM_BLOCK_SIZE;
            int i152 = -(i122 ^ (((i142 | 1) << 1) - (i142 ^ 1)));
            int i162 = (i152 ^ 8) + ((i152 & 8) << 1);
            int i172 = i162 >> 15;
            int i182 = ((i172 & (-262143)) + (i172 | (-262143))) / 131072;
            int i192 = (i182 & 1) + (i182 | 1);
            edit2.putBoolean(concat2, 3008 / (((-((i192 & 1) + (i192 | 1))) & i162) * 376));
            edit2.commit();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static void setPersonSelected(Activity activity, String str) {
        java.lang.Object[] objArr;
        long j;
        int i = valueOf + 65;
        PngjBadSignature = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        java.lang.Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new java.lang.Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = defpackage.a.c((~((~((int) Runtime.getRuntime().totalMemory())) | 310950466)) | (-852344515), 933, (((~((-809839747) | 0)) | 310950466) * (-933)) - 1775862216, 1549362678);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4927;
                    Fpnative.valueOf = objArr;
                    SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(activity).edit();
                    int i4 = ((int[]) objArr[1])[0];
                    int i5 = ((i4 * i4) - (~(-(812310668 * i4)))) - 1;
                    int i6 = -(i4 * 1202358304);
                    int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
                    int i8 = (i7 ^ (-440333084)) + (((-440333084) & i7) << 1);
                    int i9 = i8 >> 27;
                    int i10 = (((i9 | (-63)) << 1) - (i9 ^ (-63))) / 32;
                    int i11 = ((i10 | 1) << 1) - (i10 ^ 1);
                    int i12 = (i8 & i11) + (i11 | i8);
                    int i13 = i8 >> 19;
                    int i14 = ((i13 ^ (-16383)) + ((i13 & (-16383)) << 1)) / ConstantsKt.DEFAULT_BUFFER_SIZE;
                    int i15 = -(((i14 & 1) + (i14 | 1)) ^ i12);
                    int i16 = (i15 ^ 6) + ((i15 & 6) << 1);
                    int i17 = i16 >> 27;
                    int i18 = ((i17 & (-63)) + (i17 | (-63))) / 32;
                    int i19 = (i18 & 1) + (i18 | 1);
                    edit.putString(IdentyB.c((-((i19 & 1) + (i19 | 1))) & i16, 292, 5256, "15/v1_person_selected"), str);
                    edit.commit();
                    return;
                }
            }
            byte[] bArr = $$d;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a((short) (-bArr[107]), bArr[60], (byte) (bArr[30] - 1), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a((short) (bArr[75] - 1), (byte) (bArr[67] - 1), (byte) (-bArr[149]), objArr4);
            objArr = (java.lang.Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 547119798);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4927;
            Fpnative.valueOf = objArr;
            SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(activity).edit();
            int i42 = ((int[]) objArr[1])[0];
            int i52 = ((i42 * i42) - (~(-(812310668 * i42)))) - 1;
            int i62 = -(i42 * 1202358304);
            int i72 = (i52 ^ i62) + ((i62 & i52) << 1);
            int i82 = (i72 ^ (-440333084)) + (((-440333084) & i72) << 1);
            int i92 = i82 >> 27;
            int i102 = (((i92 | (-63)) << 1) - (i92 ^ (-63))) / 32;
            int i112 = ((i102 | 1) << 1) - (i102 ^ 1);
            int i122 = (i82 & i112) + (i112 | i82);
            int i132 = i82 >> 19;
            int i142 = ((i132 ^ (-16383)) + ((i132 & (-16383)) << 1)) / ConstantsKt.DEFAULT_BUFFER_SIZE;
            int i152 = -(((i142 & 1) + (i142 | 1)) ^ i122);
            int i162 = (i152 ^ 6) + ((i152 & 6) << 1);
            int i172 = i162 >> 27;
            int i182 = ((i172 & (-63)) + (i172 | (-63))) / 32;
            int i192 = (i182 & 1) + (i182 | 1);
            edit2.putString(IdentyB.c((-((i192 & 1) + (i192 | 1))) & i162, 292, 5256, "15/v1_person_selected"), str);
            edit2.commit();
            return;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
        valueOf = (PngjBadSignature + 93) % 128;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v32, types: [boolean, int] */
    public static void markIntroShown(Activity activity, FingerDetectionMode fingerDetectionMode) {
        java.lang.Object[] objArr;
        long j;
        int i = valueOf + 125;
        PngjBadSignature = i % 128;
        if (i % 2 == 0) {
            java.lang.Object[] objArr2 = Fpnative.valueOf;
            try {
                if (objArr2 != null) {
                    long j2 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                    if (j2 > j) {
                        objArr = new java.lang.Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                        int myUid = Process.myUid();
                        int i2 = ~myUid;
                        int i3 = (~((-1058533527) | i2)) | 554922006;
                        int c = defpackage.a.c(~(i2 | 559644246), 713, ((~(myUid | 1063255766)) * 1426) + (((i3 | 0) * (-713)) - 1086561196), 1427098041);
                        int i4 = c ^ (c << 13);
                        int i5 = i4 ^ (i4 >>> 17);
                        ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                        ((long[]) objArr[0])[0] = j + 4854;
                        Fpnative.valueOf = objArr;
                        String key = getKey(fingerDetectionMode, false);
                        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(activity).edit();
                        String concat = "v1_intro_shown_".concat(String.valueOf(key));
                        int i6 = ((int[]) objArr[1])[0];
                        int i7 = i6 * i6;
                        int i8 = -(1363722617 * i6);
                        int i9 = (i7 & i8) + (i7 | i8);
                        int i10 = -(i6 * 913180809);
                        int i11 = (((i9 | i10) << 1) - (i10 ^ i9)) - (-2106575361);
                        int i12 = i11 >> 22;
                        int e = IdentyB.e((i12 | (-2047)) << 1, i12 ^ (-2047), 1024, -1);
                        int i13 = (i11 ^ e) + ((e & i11) << 1);
                        int i14 = ((i11 >> 16) - 131071) / 65536;
                        int i15 = (-(i13 ^ ((i14 & 1) + (i14 | 1)))) + 6;
                        int i16 = ((i15 >> 20) - 8191) / ConstantsKt.DEFAULT_BLOCK_SIZE;
                        int i17 = ((i16 | 1) << 1) - (i16 ^ 1);
                        edit.putBoolean(concat, 5364 / ((i15 & (-(((i17 | 1) << 1) - (i17 ^ 1)))) * 894));
                        edit.commit();
                        return;
                    }
                }
                byte[] bArr = $$d;
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a((short) (-bArr[107]), bArr[60], (byte) (bArr[30] - 1), objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                a((short) (bArr[75] - 1), (byte) (bArr[67] - 1), (byte) (-bArr[149]), objArr4);
                objArr = (java.lang.Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1427098041);
                j = ((long[]) objArr[0])[0];
                ((long[]) objArr[0])[0] = j + 4854;
                Fpnative.valueOf = objArr;
                String key2 = getKey(fingerDetectionMode, false);
                SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(activity).edit();
                String concat2 = "v1_intro_shown_".concat(String.valueOf(key2));
                int i62 = ((int[]) objArr[1])[0];
                int i72 = i62 * i62;
                int i82 = -(1363722617 * i62);
                int i92 = (i72 & i82) + (i72 | i82);
                int i102 = -(i62 * 913180809);
                int i112 = (((i92 | i102) << 1) - (i102 ^ i92)) - (-2106575361);
                int i122 = i112 >> 22;
                int e2 = IdentyB.e((i122 | (-2047)) << 1, i122 ^ (-2047), 1024, -1);
                int i132 = (i112 ^ e2) + ((e2 & i112) << 1);
                int i142 = ((i112 >> 16) - 131071) / 65536;
                int i152 = (-(i132 ^ ((i142 & 1) + (i142 | 1)))) + 6;
                int i162 = ((i152 >> 20) - 8191) / ConstantsKt.DEFAULT_BLOCK_SIZE;
                int i172 = ((i162 | 1) << 1) - (i162 ^ 1);
                edit2.putBoolean(concat2, 5364 / ((i152 & (-(((i172 | 1) << 1) - (i172 ^ 1)))) * 894));
                edit2.commit();
                return;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
            valueOf = (PngjBadSignature + 67) % 128;
        } else {
            throw null;
        }
    }
}
