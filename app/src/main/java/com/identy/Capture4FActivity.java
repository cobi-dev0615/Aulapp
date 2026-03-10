package com.identy;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Toast;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.identy.enums.Finger;
import com.identy.enums.FingerDetectionMode;
import com.identy.enums.Hand;
import com.karumi.dexter.BuildConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.UInt;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes2.dex */
@SuppressWarnings("all")
public class Capture4FActivity extends FingerActivity {
    private static  byte[] $$a = null;
    private static  int $$b = 0;
    private static  byte[] $$c = null;
    private static  int $$f = 0;
    private static int $10;
    private static int $11;
    private static int PngjBadCrcException;
    private static int getFingerPrintQualityScore = 0;
    private static byte[] getScore = null;
    private static int valueOf;
    private static int[] values;

    public class PngjBadSignature implements Runnable {
        private static  byte[] $$a = null;
        private static  int $$b = 0;
        private static  byte[] $$c = null;
        private static  int $$d = 0;
        private static int $10;
        private static int $11;
        private static char PngjBadCrcException;
        private static char PngjExceptionInternal;
        private static int PngjInputException;
        private static char[] PngjOutputException;
        private static int PngjPrematureEnding;
        private static char PngjUnsupportedException;
        private static char valueOf;
        private /* synthetic */ HashMap PngjBadSignature;
        private /* synthetic */ HashMap values;

        private static String $$e(int i, int i2, byte b) {
            byte[] bArr = $$c;
            int i3 = i2 * 2;
            int i4 = 114 - i;
            int i5 = 4 - (b * 2);
            byte[] bArr2 = new byte[1 - i3];
            int i6 = 0 - i3;
            int i7 = -1;
            if (bArr == null) {
                i4 += -i6;
                i5++;
            }
            while (true) {
                i7++;
                bArr2[i7] = (byte) i4;
                if (i7 == i6) {
                    return new String(bArr2, 0);
                }
                i4 += -bArr[i5];
                i5++;
            }
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            PngjInputException = 0;
            PngjPrematureEnding = 1;
            valueOf = (char) 10180;
            PngjBadCrcException = (char) 14;
            PngjExceptionInternal = (char) 36458;
            PngjUnsupportedException = (char) 27429;
            PngjOutputException = new char[]{40109, 40189, 40182, 40189, 40186, 40191, 40184, 40167, 40134, 40154, 40189, 40184, 40167, 40162, 40162, 40133, 40158, 40176, 40182, 40188, 40102, 40157, 40154, 40165, 40134, 40158, 40176, 40182, 40188, 40165, 40132, 40153, 40178, 40191, 40184, 40157, 40157, 40178, 40184, 40164, 40191, 40189, 40179, 40147, 40157, 40189, 40186, 40185, 40179, 40156, 40153, 40186, 40189, 40157, 40156, 40190, 40190, 40182, 40157, 40156, 40190, 40190, 40100, 40179, 40189, 40191, 40164, 40184, 40178, 40157, 40156, 40189, 40186, 40165, 40184, 40189, 40165, 40133, 40108, 40141, 40186, 40165, 40184, 40186, 40162, 40099, 40143, 40143, 40186, 40184, 40186, 40190, 40182, 40178, 40190, 40186, 40164, 40140, 40142, 40184, 40178, 40191, 40190, 40180, 40109, 40187, 40188, 40177, 40190, 40099, 40184, 40184, 40191, 40067, 40132, 40167, 40184, 40176, 40189, 40164, 40165, 40156, 40148, 40148, 40150, 40184, 40190, 40183, 40191, 40190, 40149, 40147, 40165, 40158, 40150, 40176, 40188, 40190, 40177, 40135, 40067, 40157, 40178, 40184, 40164, 40191, 40189, 40179, 40147, 40153, 40186, 40189, 40154, 40155, 40178, 40176, 40178, 40179, 40182, 40188, 39943, 40331, 40333, 40330, 40329, 40335, 40329, 40338, 40105, 40175, 39952, 39954, 40169, 40175, 40173, 40170, 39954, 39952, 39957, 40169, 39953, 40143, 39976, 39995, 39995, 39978, 39980, 39969, 39980, 39970, 39996, 39973, 40020, 39971, 39981, 39987, 39986, 39978};
        }

        public PngjBadSignature(HashMap hashMap, HashMap hashMap2) {
            this.values = hashMap;
            this.PngjBadSignature = hashMap2;
        }

        private static void a(String str, int i, Object[] objArr) throws Exception {
            int i2;
            int i3;
            int i4 = $10 + 45;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            char[] charArray = str != null ? str.toCharArray() : null;
            com.d.e.PngjOutputException pngjOutputException = new com.d.e.PngjOutputException();
            char[] cArr = new char[charArray.length];
            int i5 = 0;
            pngjOutputException.values = 0;
            char[] cArr2 = new char[2];
            while (true) {
                int i6 = pngjOutputException.values;
                if (i6 >= charArray.length) {
                    objArr[0] = new String(cArr, 0, i);
                    return;
                }
                int i7 = $10 + 59;
                $11 = i7 % 128;
                int i8 = 58224;
                char c = 1;
                if (i7 % 2 == 0) {
                    cArr2[i5] = charArray[i6];
                    cArr2[1] = charArray[i5];
                    i2 = 1;
                } else {
                    cArr2[i5] = charArray[i6];
                    cArr2[1] = charArray[i6 + 1];
                    i2 = i5;
                }
                while (i2 < 16) {
                    char c2 = cArr2[c];
                    char c3 = cArr2[i5];
                    char c4 = c;
                    int i9 = (c3 + i8) ^ ((c3 << 4) + ((char) (PngjExceptionInternal ^ (-4937072311772145044L))));
                    int i10 = c3 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(PngjUnsupportedException);
                        objArr2[2] = Integer.valueOf(i10);
                        objArr2[c4] = Integer.valueOf(i9);
                        objArr2[i5] = Integer.valueOf(c2);
                        Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(-222953304);
                        Class cls = Integer.TYPE;
                        if (PngjBadSignature == null) {
                            i3 = -222953304;
                            PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) TextUtils.getTrimmedLength(BuildConfig.FLAVOR), Color.blue(i5) + 35, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + ModuleDescriptor.MODULE_VERSION, 240741651, false, "n", new Class[]{cls, cls, cls, cls});
                        } else {
                            i3 = -222953304;
                        }
                        char charValue = ((Character) ((Method) PngjBadSignature).invoke(null, objArr2)).charValue();
                        cArr2[c4] = charValue;
                        char c5 = cArr2[i5];
                        int i11 = i5;
                        char[] cArr3 = cArr2;
                        int i12 = (charValue + i8) ^ ((charValue << 4) + ((char) (valueOf ^ (-4937072311772145044L))));
                        int i13 = charValue >>> 5;
                        Object[] objArr3 = new Object[4];
                        objArr3[3] = Integer.valueOf(PngjBadCrcException);
                        objArr3[2] = Integer.valueOf(i13);
                        objArr3[c4] = Integer.valueOf(i12);
                        objArr3[i11] = Integer.valueOf(c5);
                        Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                        if (PngjBadSignature2 == null) {
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 35 - View.MeasureSpec.getMode(i11), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + ModuleDescriptor.MODULE_VERSION, 240741651, false, "n", new Class[]{cls, cls, cls, cls});
                        }
                        cArr3[i11] = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr3)).charValue();
                        i8 -= 40503;
                        i2++;
                        $10 = ($11 + 35) % 128;
                        c = c4;
                        i5 = i11;
                        cArr2 = cArr3;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();

                        if (cause == null) {

                            throw new RuntimeException(th);

                        }

                        throw new RuntimeException(cause);
                    }
                }
                int i14 = i5;
                char[] cArr4 = cArr2;
                char c6 = c;
                int i15 = pngjOutputException.values;
                cArr[i15] = cArr4[i14];
                cArr[i15 + 1] = cArr4[c6];
                Object[] objArr4 = new Object[2];
                objArr4[c6] = pngjOutputException;
                objArr4[i14] = pngjOutputException;
                Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(150653722);
                if (PngjBadSignature3 == null) {
                    byte b = (byte) i14;
                    byte b2 = b;
                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (8056 - View.resolveSizeAndState(i14, i14, i14)), Color.blue(i14) + 32, 665 - (ViewConfiguration.getWindowTouchSlop() >> 8), -199907679, false, $$e(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                try { ((Method) PngjBadSignature3).invoke(null, objArr4); } catch (Exception _e) { throw new RuntimeException(_e); }
                cArr2 = cArr4;
                i5 = 0;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x0023). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(byte b, short s, short s2, Object[] objArr) throws Exception {
            int i;
            int i2;
            int i3 = 112 - s2;
            byte[] bArr = $$a;
            int i4 = 7 - b;
            int i5 = s + 1;
            byte[] bArr2 = new byte[i5];
            if (bArr == null) {
                i3 = i4;
                int i6 = i5;
                i2 = 0;
                i4++;
                i3 += i6;
                i = i2;
                i2 = i + 1;
                bArr2[i] = (byte) i3;
                if (i2 == i5) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i6 = bArr[i4];
                i4++;
                i3 += i6;
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

        private static void c(String str, boolean z, int[] iArr, Object[] objArr) throws Exception {
            int i;
            byte[] bArr;
            String str2 = str;
            byte[] bArr2 = null;
            if (str2 != null) {
                try { bArr2 = str2.getBytes("ISO-8859-1"); } catch (Exception _e) { throw new RuntimeException(_e); }
            }
            byte[] bArr3 = bArr2;
            com.d.e.e1 e1Var = new com.d.e.e1();
            int i2 = 0;
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = iArr[3];
            char[] cArr = PngjOutputException;
            Class cls = Integer.TYPE;
            if (cArr != null) {
                $11 = ($10 + 47) % 128;
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i7 = 0;
                while (i7 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                        Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(-259747866);
                        if (PngjBadSignature == null) {
                            bArr = bArr3;
                            byte b = (byte) i2;
                            PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) Gravity.getAbsoluteGravity(i2, i2), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 35, 1313 - Color.blue(i2), 208396893, false, $$e($$c[0], b, b), new Class[]{cls});
                        } else {
                            bArr = bArr3;
                        }
                        cArr2[i7] = ((Character) ((Method) PngjBadSignature).invoke(null, objArr2)).charValue();
                        i7++;
                        $10 = ($11 + 41) % 128;
                        bArr3 = bArr;
                        i2 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();

                        if (cause == null) {

                            throw new RuntimeException(th);

                        }

                        throw new RuntimeException(cause);
                    }
                }
                cArr = cArr2;
            }
            byte[] bArr4 = bArr3;
            char[] cArr3 = new char[i4];
            System.arraycopy(cArr, i3, cArr3, 0, i4);
            if (bArr4 != null) {
                $10 = ($11 + 65) % 128;
                char[] cArr4 = new char[i4];
                e1Var.PngjBadSignature = 0;
                char c = 0;
                while (true) {
                    int i8 = e1Var.PngjBadSignature;
                    if (i8 >= i4) {
                        break;
                    }
                    if (bArr4[i8] == 1) {
                        $10 = ($11 + 97) % 128;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i8]), Integer.valueOf(c)};
                        Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-655108508);
                        if (PngjBadSignature2 == null) {
                            byte b2 = (byte) 0;
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (Color.rgb(0, 0, 0) + 16809098), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 32, 1251 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 605862879, false, $$e((byte) ($$c[0] + 1), b2, b2), new Class[]{cls, cls});
                        }
                        try { cArr4[i8] = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr3)).charValue(); } catch (Exception _e) { throw new RuntimeException(_e); }
                    } else {
                        Object[] objArr4 = {Integer.valueOf(cArr3[i8]), Integer.valueOf(c)};
                        Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(269554740);
                        if (PngjBadSignature3 == null) {
                            byte b3 = (byte) 0;
                            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 35, 1598 - (ViewConfiguration.getJumpTapTimeout() >> 16), -318867057, false, $$e($$c[1], b3, b3), new Class[]{cls, cls});
                        }
                        try { cArr4[i8] = ((Character) ((Method) PngjBadSignature3).invoke(null, objArr4)).charValue(); } catch (Exception _e) { throw new RuntimeException(_e); }
                    }
                    c = cArr4[e1Var.PngjBadSignature];
                    Object[] objArr5 = {e1Var, e1Var};
                    Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1060060353);
                    if (PngjBadSignature4 == null) {
                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 36, 156 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -1010806406, false, "g", new Class[]{Object.class, Object.class});
                    }
                    try { ((Method) PngjBadSignature4).invoke(null, objArr5); } catch (Exception _e) { throw new RuntimeException(_e); }
                }
                cArr3 = cArr4;
            }
            if (i6 > 0) {
                int i9 = $10 + 55;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    char[] cArr5 = new char[i4];
                    i = 0;
                    System.arraycopy(cArr3, 0, cArr5, 0, i4);
                    System.arraycopy(cArr5, 0, cArr3, i4 % i6, i6);
                    System.arraycopy(cArr5, i6, cArr3, 0, i4 * i6);
                } else {
                    i = 0;
                    char[] cArr6 = new char[i4];
                    System.arraycopy(cArr3, 0, cArr6, 0, i4);
                    int i10 = i4 - i6;
                    System.arraycopy(cArr6, 0, cArr3, i10, i6);
                    System.arraycopy(cArr6, i6, cArr3, 0, i10);
                }
            } else {
                i = 0;
            }
            if (z) {
                char[] cArr7 = new char[i4];
                e1Var.PngjBadSignature = i;
                while (true) {
                    int i11 = e1Var.PngjBadSignature;
                    if (i11 >= i4) {
                        break;
                    }
                    cArr7[i11] = cArr3[(i4 - i11) - 1];
                    e1Var.PngjBadSignature = i11 + 1;
                }
                cArr3 = cArr7;
            }
            if (i5 > 0) {
                e1Var.PngjBadSignature = 0;
                while (true) {
                    int i12 = e1Var.PngjBadSignature;
                    if (i12 >= i4) {
                        break;
                    }
                    cArr3[i12] = (char) (cArr3[i12] - iArr[2]);
                    e1Var.PngjBadSignature = i12 + 1;
                }
            }
            objArr[0] = new String(cArr3);
        }

        public static void init$0() {
            $$a = new byte[]{22, -6, 1, 71, -10, 5, -52, 30, -7, 3, -37, 51, -21, 2, 11, 4, -11, 6, -1};
            $$b = 71;
        }

        public static void init$1() {
            $$c = new byte[]{14, 12, 119, -3};
            $$d = 43;
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1602)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:298)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] valueOf(android.content.Context r54, int r55, int r56, int r57) {
            /*
                Method dump skipped, instructions count: 8974
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.identy.Capture4FActivity.PngjBadSignature.valueOf(android.content.Context, int, int, int):java.lang.Object[]");
        }

        @Override // java.lang.Runnable
        public void run() {
            PngjInputException = (PngjPrematureEnding + 65) % 128;
            if (FingerActivity.PngjPrematureEnding) {
                Capture4FActivity capture4FActivity = Capture4FActivity.this;
                Capture4FActivity capture4FActivity2 = Capture4FActivity.this;
                capture4FActivity.getPadSub1 = new com.identy.ui.c.PngjBadSignature(capture4FActivity2, this.values, this.PngjBadSignature, capture4FActivity2.getQualityScore);
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.copyFrom(Capture4FActivity.this.getPadSub1.getWindow().getAttributes());
                ((ViewGroup.LayoutParams) layoutParams).width = -1;
                Capture4FActivity.this.getPadSub1.show();
                PngjPrematureEnding = (PngjInputException + 9) % 128;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$i(short s, short s2, int i) {
        int i2;
        int i3 = i * 4;
        int i4 = s + 4;
        byte[] bArr = $$c;
        int i5 = (s2 * 57) + 65;
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i6 = 0;
            int i7 = i5;
            int i8 = i4;
            int i9 = (-i4) + i7;
            int i10 = i8;
            i5 = i9;
            i4 = i10;
            bArr = bArr3;
            i2 = i6;
            bArr2[i2] = (byte) i5;
            i6 = i2 + 1;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            int i11 = i4 + 1;
            int i12 = i5;
            i8 = i11;
            i4 = bArr[i11];
            bArr3 = bArr;
            i7 = i12;
            int i92 = (-i4) + i7;
            int i102 = i8;
            i5 = i92;
            i4 = i102;
            bArr = bArr3;
            i2 = i6;
            bArr2[i2] = (byte) i5;
            i6 = i2 + 1;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            int i6 = i2 + 1;
            if (i2 == i3) {
            }
        }
        return new String(bArr2, 0);
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        valueOf();
        valueOf = 0;
        PngjBadCrcException = 1;
        values = new int[]{1978767917, 397238621, -1800833284, -134624618, 1540175832, 1714793956, -1293119626, 1210318006, 1705699631, -381522572, 571931749, 1723461435, -33650609, -458080424, 1234097137, -1938468364, -110342217, 1840900426};
    }

    private static void b(byte b, int i, short s, Object[] objArr) throws Exception {
        int i2 = i + 4;
        int i3 = b + 44;
        byte[] bArr = getScore;
        byte[] bArr2 = new byte[s + 1];
        int i4 = -1;
        if (bArr == null) {
            i3 = (s + (-i3)) - 2;
            i2++;
            bArr = bArr;
            i4 = -1;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i3;
            if (i5 == s) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3 = (i3 + (-bArr[i2])) - 2;
            i2++;
            bArr = bArr;
            i4 = i5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, short s, int i2, Object[] objArr) throws Exception {
        int i3;
        int i4 = i * 6;
        int i5 = 80 - (i2 * 2);
        int i6 = (s * 18) + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[19 - i4];
        int i7 = 18 - i4;
        if (bArr == null) {
            int i8 = i5;
            i3 = 0;
            i5 = i7;
            i5 = i5 + i8 + 5;
            i6++;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i8 = bArr[i6];
            i3++;
            i5 = i5 + i8 + 5;
            i6++;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
            }
        }
    }

    private static void d(int[] iArr, int i, Object[] objArr) throws Exception {
        int i2;
        char c;
        char c2;
        char[] cArr;
        int[] iArr2;
        int i3;
        int i4;
        com.d.e.PngBadCharsetException pngBadCharsetException = new com.d.e.PngBadCharsetException();
        char[] cArr2 = new char[4];
        int i5 = 2;
        char[] cArr3 = new char[iArr.length * 2];
        int[] iArr3 = values;
        Class cls = Integer.TYPE;
        int i6 = -1;
        int i7 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i8 = 0;
            i2 = 1618428774;
            while (i8 < length) {
                int i9 = i5;
                $10 = ($11 + 65) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i8])};
                    Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1618428774);
                    if (PngjBadSignature2 == null) {
                        char indexOf = (char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR);
                        int i10 = 31 - (TypedValue.complexToFloat(i7) > 0.0f ? 1 : (TypedValue.complexToFloat(i7) == 0.0f ? 0 : -1));
                        int threadPriority = ((Process.getThreadPriority(i7) + 20) >> 6) + 1381;
                        byte b = (byte) i6;
                        i4 = i6;
                        byte b2 = (byte) (-b);
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf, i10, threadPriority, -1667748131, false, $$i(b, b2, (byte) (b2 - 1)), new Class[]{cls});
                    } else {
                        i4 = i6;
                    }
                    iArr4[i8] = ((Integer) ((Method) PngjBadSignature2).invoke(null, objArr2)).intValue();
                    i8++;
                    $11 = ($10 + 61) % 128;
                    i5 = i9;
                    i6 = i4;
                    i7 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();

                    if (cause == null) {

                        throw new RuntimeException(th);

                    }

                    throw new RuntimeException(cause);
                }
            }
            iArr3 = iArr4;
        } else {
            i2 = 1618428774;
        }
        int i11 = i5;
        int i12 = i6;
        float f = 0.0f;
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = values;
        int i13 = 16;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i14 = 0;
            while (i14 < length3) {
                int i15 = $10 + 31;
                $11 = i15 % 128;
                if (i15 % 2 == 0) {
                    Object[] objArr3 = {Integer.valueOf(iArr6[i14])};
                    Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i2);
                    if (PngjBadSignature3 == null) {
                        char indexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0));
                        int offsetAfter = 31 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0);
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> i13) + 1381;
                        cArr = cArr2;
                        i3 = i13;
                        byte b3 = (byte) i12;
                        byte b4 = (byte) (-b3);
                        iArr2 = iArr6;
                        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf2, offsetAfter, maxKeyCode, -1667748131, false, $$i(b3, b4, (byte) (b4 - 1)), new Class[]{cls});
                    } else {
                        cArr = cArr2;
                        iArr2 = iArr6;
                        i3 = i13;
                    }
                    try { iArr7[i14] = ((Integer) ((Method) PngjBadSignature3).invoke(null, objArr3)).intValue(); } catch (Exception _e) { throw new RuntimeException(_e); }
                    i14 <<= 1;
                } else {
                    cArr = cArr2;
                    iArr2 = iArr6;
                    i3 = i13;
                    Object[] objArr4 = {Integer.valueOf(iArr2[i14])};
                    Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i2);
                    if (PngjBadSignature4 == null) {
                        byte b5 = (byte) (-1);
                        byte b6 = (byte) (-b5);
                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) Color.red(0), View.MeasureSpec.makeMeasureSpec(0, 0) + 31, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1380, -1667748131, false, $$i(b5, b6, (byte) (b6 - 1)), new Class[]{cls});
                    }
                    try { iArr7[i14] = ((Integer) ((Method) PngjBadSignature4).invoke(null, objArr4)).intValue(); } catch (Exception _e) { throw new RuntimeException(_e); }
                    i14++;
                }
                i13 = i3;
                cArr2 = cArr;
                iArr6 = iArr2;
                i12 = -1;
            }
            iArr6 = iArr7;
        }
        char[] cArr4 = cArr2;
        int i16 = i13;
        System.arraycopy(iArr6, 0, iArr5, 0, length2);
        pngBadCharsetException.values = 0;
        while (true) {
            int i17 = pngBadCharsetException.values;
            if (i17 >= iArr.length) {
                objArr[0] = new String(cArr3, 0, i);
                return;
            }
            $10 = ($11 + 117) % 128;
            int i18 = iArr[i17];
            char c3 = (char) (i18 >> 16);
            cArr4[0] = c3;
            char c4 = (char) i18;
            char c5 = 1;
            cArr4[1] = c4;
            char c6 = (char) (iArr[i17 + 1] >> 16);
            cArr4[i11] = c6;
            char c7 = (char) iArr[i17 + 1];
            char c8 = 3;
            cArr4[3] = c7;
            pngBadCharsetException.PngjException = (c3 << 16) + c4;
            pngBadCharsetException.PngjBadCrcException = (c6 << 16) + c7;
            com.d.e.PngBadCharsetException.values(iArr5);
            int i19 = 0;
            while (i19 < i16) {
                int i20 = $11 + 61;
                $10 = i20 % 128;
                if (i20 % 2 != 0) {
                    int i21 = pngBadCharsetException.PngjException ^ iArr5[i19];
                    pngBadCharsetException.PngjException = i21;
                    int PngjBadCrcException2 = com.d.e.PngBadCharsetException.PngjBadCrcException(i21);
                    Object[] objArr5 = new Object[4];
                    objArr5[c8] = pngBadCharsetException;
                    objArr5[i11] = pngBadCharsetException;
                    objArr5[c5] = Integer.valueOf(PngjBadCrcException2);
                    objArr5[0] = pngBadCharsetException;
                    Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-2104166611);
                    if (PngjBadSignature5 == null) {
                        byte b7 = (byte) (-1);
                        byte b8 = (byte) (b7 + 1);
                        PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 2786), 36 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)) + 784, 2122029718, false, $$i(b7, b8, b8), new Class[]{Object.class, cls, Object.class, Object.class});
                    }
                    int intValue; try { intValue = ((Integer) ((Method) PngjBadSignature5).invoke(null, objArr5)).intValue(); } catch (Exception _e) { throw new RuntimeException(_e); }
                    pngBadCharsetException.PngjException = pngBadCharsetException.PngjBadCrcException;
                    pngBadCharsetException.PngjBadCrcException = intValue;
                    i19 += 84;
                    i16 = 16;
                } else {
                    int i22 = pngBadCharsetException.PngjException ^ iArr5[i19];
                    pngBadCharsetException.PngjException = i22;
                    int PngjBadCrcException3 = com.d.e.PngBadCharsetException.PngjBadCrcException(i22);
                    Object[] objArr6 = new Object[4];
                    objArr6[c8] = pngBadCharsetException;
                    objArr6[i11] = pngBadCharsetException;
                    objArr6[c5] = Integer.valueOf(PngjBadCrcException3);
                    objArr6[0] = pngBadCharsetException;
                    Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-2104166611);
                    if (PngjBadSignature6 == null) {
                        float f2 = f;
                        c = c5;
                        byte b9 = (byte) (-1);
                        byte b10 = (byte) (b9 + 1);
                        c2 = c8;
                        PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (2786 - (TypedValue.complexToFraction(0, f2, f2) > f2 ? 1 : (TypedValue.complexToFraction(0, f2, f2) == f2 ? 0 : -1))), View.resolveSizeAndState(0, 0, 0) + 36, 785 - (ViewConfiguration.getTapTimeout() >> 16), 2122029718, false, $$i(b9, b10, b10), new Class[]{Object.class, cls, Object.class, Object.class});
                    } else {
                        c = c5;
                        c2 = c8;
                    }
                    int intValue2; try { intValue2 = ((Integer) ((Method) PngjBadSignature6).invoke(null, objArr6)).intValue(); } catch (Exception _e) { throw new RuntimeException(_e); }
                    pngBadCharsetException.PngjException = pngBadCharsetException.PngjBadCrcException;
                    pngBadCharsetException.PngjBadCrcException = intValue2;
                    i19++;
                    c5 = c;
                    c8 = c2;
                    i16 = 16;
                    f = 0.0f;
                }
            }
            char c9 = c5;
            char c10 = c8;
            int i23 = pngBadCharsetException.PngjException;
            int i24 = pngBadCharsetException.PngjBadCrcException;
            pngBadCharsetException.PngjException = i24;
            pngBadCharsetException.PngjBadCrcException = i23;
            i16 = 16;
            int i25 = i23 ^ iArr5[16];
            pngBadCharsetException.PngjBadCrcException = i25;
            int i26 = i24 ^ iArr5[17];
            pngBadCharsetException.PngjException = i26;
            cArr4[0] = (char) (i26 >>> 16);
            cArr4[c9] = (char) i26;
            cArr4[i11] = (char) (i25 >>> 16);
            cArr4[c10] = (char) i25;
            com.d.e.PngBadCharsetException.values(iArr5);
            int i27 = pngBadCharsetException.values;
            cArr3[i27 * 2] = cArr4[0];
            cArr3[(i27 * 2) + 1] = cArr4[c9];
            cArr3[(i27 * 2) + 2] = cArr4[i11];
            cArr3[(i27 * 2) + 3] = cArr4[c10];
            int i28 = i11;
            Object[] objArr7 = new Object[i28];
            objArr7[c9] = pngBadCharsetException;
            objArr7[0] = pngBadCharsetException;
            Object PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-800662452);
            if (PngjBadSignature7 == null) {
                PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), View.getDefaultSize(0, 0) + 22, 30 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 749318647, false, "E", new Class[]{Object.class, Object.class});
            }
            try { ((Method) PngjBadSignature7).invoke(null, objArr7); } catch (Exception _e) { throw new RuntimeException(_e); }
            i11 = i28;
            f = 0.0f;
        }
    }

    public static void init$0() {
        $$a = new byte[]{18, -90, 23, -81, 25, -12, -2, -45, 26, -2, -38, 42, -20, -35, 46, -26, -3, 6, -1, -16, 1, -6, 25, -12, -2, -42, 46, -26, -3, 6, -1, -16, 1, -6};
        $$b = 149;
    }

    public static void init$1() {
        $$c = new byte[]{20, 46, -94, -102};
        $$f = 173;
    }

    public static void valueOf() {
        getScore = new byte[]{122, 41, -119, -106, -6, 3, -7, 3, -10, 6, -3, -7, 4, -3, -8, 5, -11, 7, -11, 7, -12, 8, -3, -9, 6, -13, 9, -3, -10, 7, -3, -11, 8, -15, 11, -7, -1, 2, -7, -2, 3, -7, -3, 4, -3, -12, 9, -11, 7, -7, -3, 4, -3, -13, 10, -3, -14, 11, -3, -6, -1, 2, -3, -6, -2, 3, -13, 9, -7, -7, 8, -7, -8, 9, -3, -10, 7, -3, -11, 8, -7, -9, 10, -7, -1, 2, -7, -2, 3, -7, -3, 4, -3, -12, 9, -7, -10, 11, -3, -6, -3, 4, -3, -6, -4, 5, -3, -6, -5, 6, -3, -6, -5, 6, -3, -6, -6, 7, -8, -1, 3, -3, -6, -7, 8, -8, -2, 4, -3, -6, -7, 7, -23, 19, 49, -64, 9, -15, 5, 55, -39, -35, 0, 7, -7, 5, 1, 2, 1, -13, 7, -23, 19, 49, -64, 9, -15, 5, 55, -29, -39, -8, 13, -4, 0, -15, 19, -13, -11, 14, 20, -25, -7, -8, 28, -13, -13, -11, 14, -6, 3, -7, 3, -8, -4, 6, -10, 6, -3, -7, 4, -8, -5, 7, -3, -8, 5, -8, -7, 9, -3, -9, 6, -3, -10, 7, -8, -8, 10, -3, -11, 8, -8, -9, 11, -7, 3, -9, 1, 2, -9, 0, 3, -3, -12, 9, -3, -13, 10, -3, -14, 11, -9, -1, 4, -3, -6, -1, 2, -11, 7, -9, -2, 5, -3, -6, -2, 3, -13, 9, -3, -6, -1, 2, -3, -6, -3, 4, -9, -3, 6, -9, -4, 7, -7, -1, 2, -9, -5, 8, -3, -6, -4, 5, -11, 7, -7, -3, 4, -3, -6, -5, 6, -3, -6, -6, 7, -3, -6, -7, 8, -3, -6, -8, 9, -13, 9, -9, -7, 10, -3, -6, -9, 10, -9, -1, 4, -3, -6, -1, 2, -3, -6, -10, 11, -9, 0, 3, -3, -7, 0, 2, -9, -8, 11, -3, -7, 0, 7, -23, 19, 49, -64, 9, -15, 5, 55, -25, -53, 19, -4, -13, -6, 9, -8, -1, -15, 8, -16, 1, 4, 3, 52, -53, -17, -2, 64, -24, -39, 6, -13, -5, 6, 9, -9, -10, 7, -23, 19, 49, -64, 9, -15, 5, 55, -40, -22, -12, 1, -10, 20, -3, -12, 5, -4, 7, -7, -8, 31, -35, 17, -4, -10, 21, -32, 15, -4, -4};
        getFingerPrintQualityScore = 12;
    }

    @Override // com.identy.FingerActivity, com.identy.d.PngjBadSignature
    public void PngjException(HashMap<Pair<Hand, Finger>, com.identy.IdentyA> hashMap, HashMap<Pair<Hand, Finger>, com.identy.IdentyA> hashMap2, Bitmap bitmap, boolean z, boolean z2) {
        super.PngjException(hashMap, hashMap2, bitmap, z, z2);
        if (z && this.getAsHighestSecurityLevelReached) {
            try {
                com.identy.e1.values(new Object[]{this.onErrorResponse}, com.identy.i.PngjPrematureEnding.values(), com.identy.i.PngjPrematureEnding.values(), -431637600, com.identy.i.PngjPrematureEnding.values(), 431637601, com.identy.i.PngjPrematureEnding.values());
                IdentySdk identySdk = IdentySdk.getInstance();
                FingerDetectionMode fingerDetectionMode = this.PngjExceptionInternal;
                com.identy.e1 e1Var = this.onErrorResponse;
                long j = e1Var.toString;
                long j2 = e1Var.Enroll2IndexActivity;
                int i = e1Var.getEncryptedTemplates;
                byte[] PngjPrematureEnding = e1Var.PngjPrematureEnding();
                com.identy.e1 e1Var2 = this.onErrorResponse;
                identySdk.a(fingerDetectionMode, hashMap, j, j2, 0L, i, PngjPrematureEnding, e1Var2.setFoundMatchingTemplates + e1Var2.Enroll2IndexActivity, e1Var2.closeDialog, e1Var2.getHeight, e1Var2.ERRORS);
                valueOf = (PngjBadCrcException + 85) % 128;
            } catch (Exception unused) {
            }
            try {
                if (IdentySdk.getInstance().isDisplayPrints()) {
                    runOnUiThread(new PngjBadSignature(hashMap, hashMap2));
                    return;
                }
                if (!IdentySdk.getInstance().v()) {
                    if (IdentySdk.getInstance().isDisplayMoveNextDialog()) {
                        Attempt();
                        return;
                    } else {
                        Action();
                        PngjBadCrcException = (valueOf + 27) % 128;
                        return;
                    }
                }
                com.identy.ui.c.PngjUnsupportedException pngjUnsupportedException = new com.identy.ui.c.PngjUnsupportedException(this, this.getQualityScore, this.PngjExceptionInternal, (FingerDetectionMode) FingerActivity.PngjException(com.identy.a.PngjException.values(), -388390624, new Object[]{this}, com.identy.a.PngjException.values(), 388390631, com.identy.a.PngjException.values(), com.identy.a.PngjException.values()));
                this.getPadSub1 = pngjUnsupportedException;
                try {
                    Object[] objArr = new Object[1];
                    b((byte) (-getScore[338]), (short) 342, $$a[390], objArr);
                    Class<?> cls = Class.forName((String) objArr[0]);
                    byte b = (byte) 71;
                    Object[] objArr2 = new Object[1];
                    b(b, (short) (b | 288), $$a[5], objArr2);
                    cls.getMethod((String) objArr2[0], null).invoke(pngjUnsupportedException, null);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();

                    if (cause == null) {

                        throw new RuntimeException(th);

                    }

                    throw new RuntimeException(cause);
                }
            } catch (Exception e) {
                try {
                    Object[] objArr3 = new Object[1];
                    b((byte) (getFingerPrintQualityScore | 50), (short) 362, (short) (getScore[133] - 1), objArr3);
                    Class<?> cls2 = Class.forName((String) objArr3[0]);
                    byte b2 = (byte) 68;
                    Object[] objArr4 = new Object[1];
                    b(b2, (short) (b2 | 312), $$a[169], objArr4);
                    cls2.getMethod((String) objArr4[0], null).invoke(e, null);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw new RuntimeException(th2);
                    }
                    throw new RuntimeException(cause2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0336  */
    @Override // com.identy.FingerActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void attachBaseContext(Context context) {
        long j;
        char c;
        int intValue = 0;
        Object[] valueOf$1eba2e16 = null;
        Object[] objArr;
        int i;
        int i2;
        super.attachBaseContext(context);
        Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
        if (PngjBadSignature2 == null) {
            char jumpTapTimeout = (char) (14830 - (ViewConfiguration.getJumpTapTimeout() >> 16));
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 28;
            int i3 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 720;
            byte b = (byte) ($$a[20] - 1);
            byte b2 = b;
            Object[] objArr2 = new Object[1];
            try { c(b, b2, b2, objArr2); } catch (Exception _e) { throw new RuntimeException(_e); }
            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(jumpTapTimeout, longPressTimeout, i3, -815159504, false, (String) objArr2[0], null);
        }
        long j2;
        try { j2 = ((Field) PngjBadSignature2).getLong(null); } catch (Exception _e) { throw new RuntimeException(_e); }
        try {
            try {
                if (j2 != -1) {
                    long j3 = j2 + 4611686018427387770L;
                    j = 0;
                    Object[] objArr3 = new Object[1];
                    d(new int[]{1480847212, -1856757245, 1182359707, -166847477, 721825327, 1049023312, 1904435283, -128828298, 159779828, 1424823076, 1663403918, 803830804}, TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 23, objArr3);
                    Class<?> cls = Class.forName((String) objArr3[0]);
                    c = 20;
                    Object[] objArr4 = new Object[1];
                    d(new int[]{-249813231, 960108010, -1585771522, 1146739332, -344303641, 445210742, 2073504452, -1501091640}, 15 - Color.alpha(0), objArr4);
                    if (j3 >= ((Long) cls.getDeclaredMethod((String) objArr4[0], null).invoke(null, null)).longValue()) {
                        valueOf = (PngjBadCrcException + 105) % 128;
                        Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                        if (PngjBadSignature3 == null) {
                            char absoluteGravity = (char) (14830 - Gravity.getAbsoluteGravity(0, 0));
                            int maxKeyCode = 28 - (KeyEvent.getMaxKeyCode() >> 16);
                            int maximumFlingVelocity = 721 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            byte b3 = $$a[20];
                            byte b4 = b3;
                            Object[] objArr5 = new Object[1];
                            c(b3, b4, (byte) (b4 - 1), objArr5);
                            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(absoluteGravity, maxKeyCode, maximumFlingVelocity, -779023007, false, (String) objArr5[0], null);
                        }
                        Object[] objArr6 = (Object[]) ((Field) PngjBadSignature3).get(null);
                        objArr = new Object[]{new int[]{0}, new int[1], 0, new int[]{0}};
                        int i4 = ((int[]) objArr6[3])[0];
                        int i5 = ((int[]) objArr6[0])[0];
                        String[] strArr = (String[]) objArr6[2];
                        int identityHashCode = System.identityHashCode(this);
                        int i6 = ~identityHashCode;
                        int c2 = defpackage.a.c((~(identityHashCode | (-4194946))) | (~(32152545 | i6)) | 974455828, 140, (((~(1002413428 | i6)) | 4194945) * (-280)) + (((identityHashCode | 1002413428) * 140) - 261930623), 272950108);
                        int i7 = c2 ^ (c2 << 13);
                        int i8 = i7 ^ (i7 >>> 17);
                        ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
                        i = ((int[]) objArr[0])[0];
                        i2 = ((int[]) objArr[3])[0];
                        if (i2 != i) {
                            Object[] objArr7 = {new int[]{0}, new int[1], 0, new int[]{0}};
                            int i9 = ((int[]) objArr[1])[0];
                            int i10 = ((int[]) objArr[3])[0];
                            int i11 = ((int[]) objArr[0])[0];
                            String[] strArr2 = (String[]) objArr[2];
                            int c3 = defpackage.a.c((~((~System.identityHashCode(this)) | 859091093)) | 36995200, 374, ((822095893 | 0) * (-374)) - 1690518269, i9);
                            int i12 = c3 ^ (c3 << 13);
                            int i13 = i12 ^ (i12 >>> 17);
                            ((int[]) objArr7[1])[0] = i13 ^ (i13 << 5);
                            valueOf = (PngjBadCrcException + 41) % 128;
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        String[] strArr3 = (String[]) objArr[2];
                        if (strArr3 != null) {
                            int i14 = 0;
                            while (i14 < strArr3.length) {
                                arrayList.add(strArr3[i14]);
                                i14++;
                                PngjBadCrcException = (valueOf + 41) % 128;
                            }
                        }
                        int[] iArr = new int[i2];
                        int i15 = i2 - 1;
                        iArr[i15] = 1;
                        Toast.makeText((Context) null, iArr[((i2 * i15) % 2) - 1], 1).show();
                        Object[] objArr8 = {new int[]{0}, new int[1], 0, new int[]{0}};
                        int i16 = ((int[]) objArr[1])[0];
                        int i17 = ((int[]) objArr[3])[0];
                        int i18 = ((int[]) objArr[0])[0];
                        String[] strArr4 = (String[]) objArr[2];
                        int identityHashCode2 = System.identityHashCode(this);
                        int i19 = ~identityHashCode2;
                        int c4 = defpackage.a.c((~(identityHashCode2 | 634495215)) | 400070758, 519, (((~(i19 | (-302520321))) | (~(937015535 | identityHashCode2))) * (-519)) + (((~((-400070759) | i19)) | 634495215) * 519) + 965737986, i16);
                        int i20 = c4 ^ (c4 << 13);
                        int i21 = i20 ^ (i20 >>> 17);
                        ((int[]) objArr8[1])[0] = i21 ^ (i21 << 5);
                        return;
                    }
                } else {
                    j = 0;
                    c = 20;
                }
                Object[] objArr9 = new Object[1];
                d(new int[]{1480847212, -1856757245, 1182359707, -166847477, 721825327, 1049023312, 1904435283, -128828298, 159779828, 1424823076, 1663403918, 803830804}, 21 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0'), objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                Object[] objArr10 = new Object[1];
                d(new int[]{-249813231, 960108010, -1585771522, 1146739332, -344303641, 445210742, 2073504452, -1501091640}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 14, objArr10);
                Long valueOf2 = Long.valueOf(((Long) cls2.getDeclaredMethod((String) objArr10[0], null).invoke(null, null)).longValue());
                Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
                if (PngjBadSignature4 == null) {
                    char axisFromString = (char) (14829 - MotionEvent.axisFromString(BuildConfig.FLAVOR));
                    int maxKeyCode2 = 28 - (KeyEvent.getMaxKeyCode() >> 16);
                    int doubleTapTimeout = 721 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    byte b5 = (byte) ($$a[c] - 1);
                    byte b6 = b5;
                    Object[] objArr11 = new Object[1];
                    c(b5, b6, b6, objArr11);
                    PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(axisFromString, maxKeyCode2, doubleTapTimeout, -815159504, false, (String) objArr11[0], null);
                }
                ((Field) PngjBadSignature4).set(null, valueOf2);
                objArr = valueOf$1eba2e16;
                i = ((int[]) objArr[0])[0];
                i2 = ((int[]) objArr[3])[0];
                if (i2 != i) {
                }
            } catch (Exception unused) {
                throw new RuntimeException();
            }
            Object[] objArr12 = {1074110959};
            Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1439412966);
            if (PngjBadSignature5 == null) {
                PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) View.MeasureSpec.getMode(0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 24, 696 - ((byte) KeyEvent.getModifierMetaStateMask()), 1457201313, false, null, new Class[]{Integer.TYPE});
            }
            valueOf$1eba2e16 = org.identy.opencv.core.valueOf.valueOf$1eba2e16(intValue, ((Constructor) PngjBadSignature5).newInstance(objArr12), 272950108);
            Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
            if (PngjBadSignature6 == null) {
                char c5 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 14829);
                int indexOf = TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 29;
                int defaultSize = View.getDefaultSize(0, 0) + 721;
                byte b7 = $$a[c];
                byte b8 = b7;
                Object[] objArr13 = new Object[1];
                c(b7, b8, (byte) (b8 - 1), objArr13);
                PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c5, indexOf, defaultSize, -779023007, false, (String) objArr13[0], null);
            }
            ((Field) PngjBadSignature6).set(null, valueOf$1eba2e16);
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
        try {
        Object[] objArr14 = new Object[1];
        d(new int[]{2084832049, -111914299, -1160638004, -147775934, -1152498730, -368385006, -1140650880, -1297890663}, 15 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0'), objArr14);
        Class<?> cls3 = Class.forName((String) objArr14[0]);
        Object[] objArr15 = new Object[1];
        d(new int[]{2016418701, 2027700486, -1230003372, 1203852804, -1231723277, 1008429795, -279051450, 1286702230}, AndroidCharacter.getMirror('0') - ' ', objArr15);
        intValue = ((Integer) cls3.getMethod((String) objArr15[0], Object.class).invoke(null, this)).intValue();
        } catch (Exception _ignored) { throw new RuntimeException(_ignored); }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
      try {
        getData getdata = new getData(this, bundle);
        byte[] bArr = getScore;
        int i = 146;
        byte b = bArr[146];
        short s = bArr[142];
        Object[] objArr = new Object[1];
        b(b, s, (short) (s | 127), objArr);
        int i2 = 0;
        String str = (String) objArr[0];
        byte b2 = bArr[142];
        byte b3 = b2;
        Object[] objArr2 = new Object[1];
        b(b3, (short) (b3 | ByteCompanionObject.MAX_VALUE), b2, objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            int i3 = getFingerPrintQualityScore;
            byte b4 = (byte) (i3 | 50);
            char c = 395;
            Object[] objArr4 = new Object[1];
            b(b4, (short) (b4 | 65), bArr[395], objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            byte b5 = (byte) 71;
            Object[] objArr5 = new Object[1];
            b(b5, (short) (b5 << 1), bArr[12], objArr5);
            String str2 = (String) objArr5[0];
            byte b6 = (byte) (i3 | 50);
            Object[] objArr6 = new Object[1];
            b(b6, (short) (b6 | 65), bArr[395], objArr6);
            Object[] objArr7 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i4 = 0;
            while (i4 < objArr7.length) {
                Object[] objArr8 = {objArr7[i4]};
                int i5 = getFingerPrintQualityScore;
                short s2 = (short) i;
                byte[] bArr2 = getScore;
                int i6 = i2;
                Object[] objArr9 = new Object[1];
                b((byte) (i5 | 50), s2, (short) (-bArr2[348]), objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[i6]);
                char c2 = c;
                Object[] objArr10 = new Object[1];
                b((byte) 74, (short) 162, bArr2[9], objArr10);
                String str3 = (String) objArr10[i6];
                byte b7 = (byte) (i5 | 50);
                Object[] objArr11 = new Object[1];
                b(b7, (short) (b7 | 65), bArr2[c2], objArr11);
                Object invoke = cls2.getMethod(str3, Class.forName((String) objArr11[i6])).invoke(null, objArr8);
                Object[] objArr12 = new Object[1];
                b((byte) (i5 | 50), s2, (short) (-bArr2[348]), objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[i6]);
                Object[] objArr13 = new Object[1];
                b((byte) (i5 | 49), (short) 168, bArr2[17], objArr13);
                iArr[i4] = ((Integer) cls3.getMethod((String) objArr13[i6], null).invoke(invoke, null)).intValue();
                i4++;
                i2 = i6;
                c = c2;
                i = 146;
            }
            while (true) {
                int i7 = i2 + 1;
                try {
                } catch (Throwable th) {
                    if (i2 < 24 || i2 >= 27) {
                        throw new RuntimeException(th);
                    }
                    getdata.PngjPrematureEnding = th;
                    getdata.PngjException(23);
                    i2 = 22;
                }
                switch (getdata.PngjException(iArr[i2])) {
                    case -16:
                        i2 = 38;
                    case -15:
                        getdata.PngjException(20);
                        int i8 = getdata.PngjException;
                        i2 = (i8 == 32 || i8 != 86) ? 9 : 23;
                        break;
                    case -14:
                        i2 = 1;
                    case -13:
                        i2 = 37;
                    case -12:
                        getdata.PngjException(14);
                        if (getdata.PngjException == 0) {
                            i7 = 36;
                        }
                        i2 = i7;
                    case -11:
                        getdata.PngjException(15);
                        throw ((Throwable) getdata.PngjInputException);
                    case -10:
                        i2 = 39;
                    case -9:
                        i2 = 41;
                    case -8:
                        getdata.PngjException(14);
                        if (getdata.PngjException == 0) {
                            i7 = 21;
                        }
                        i2 = i7;
                    case -7:
                        getdata.valueOf = 1;
                        getdata.PngjException(2);
                        getdata.PngjException(13);
                        valueOf = getdata.PngjException;
                        i2 = i7;
                    case -6:
                        getdata.valueOf = PngjBadCrcException;
                        getdata.PngjException(8);
                        i2 = i7;
                    case -5:
                        return;
                    case -4:
                        i2 = 27;
                    case -3:
                        i2 = 11;
                    case -2:
                        getdata.valueOf = 2;
                        getdata.PngjException(2);
                        getdata.PngjException(3);
                        FingerActivity fingerActivity = (FingerActivity) getdata.PngjInputException;
                        getdata.PngjException(3);
                        super.onCreate((Bundle) getdata.PngjInputException);
                        i2 = i7;
                    case UInt.MAX_VALUE /* -1 */:
                        i2 = 5;
                    default:
                        i2 = i7;
                }
            }
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();

            if (cause == null) {

                throw new RuntimeException(th2);

            }

            throw new RuntimeException(cause);
        }
      } catch (Exception _ignored) { throw new RuntimeException(_ignored); }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onPause() {
        int i = PngjBadCrcException + 107;
        valueOf = i % 128;
        int i2 = i % 2;
        super.onPause();
        if (i2 != 0) {
            throw null;
        }
        valueOf = (PngjBadCrcException + 39) % 128;
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onResume() {
        valueOf = (PngjBadCrcException + 51) % 128;
        super.onResume();
        int i = valueOf + 91;
        PngjBadCrcException = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onStart() {
        PngjBadCrcException = (valueOf + 63) % 128;
        super.onStart();
        int i = PngjBadCrcException + 113;
        valueOf = i % 128;
        if (i % 2 != 0) {
            int i2 = 37 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x02f6, code lost:
    
        if (0 < 12) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.identy.FingerActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void values(Bundle bundle) {
      try {
        getData getdata = new getData(this, bundle);
        byte[] bArr = getScore;
        int i = 146;
        byte b = bArr[146];
        Object[] objArr = new Object[1];
        b(b, (short) (b | 174), (short) 149, objArr);
        int i2 = 0;
        String str = (String) objArr[0];
        byte b2 = bArr[142];
        byte b3 = b2;
        Object[] objArr2 = new Object[1];
        b(b3, (short) (b3 | ByteCompanionObject.MAX_VALUE), b2, objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            int i3 = getFingerPrintQualityScore;
            byte b4 = (byte) (i3 | 50);
            char c = 395;
            Object[] objArr4 = new Object[1];
            b(b4, (short) (b4 | 65), bArr[395], objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            byte b5 = (byte) 71;
            Object[] objArr5 = new Object[1];
            b(b5, (short) (b5 << 1), bArr[12], objArr5);
            String str2 = (String) objArr5[0];
            byte b6 = (byte) (i3 | 50);
            Object[] objArr6 = new Object[1];
            b(b6, (short) (b6 | 65), bArr[395], objArr6);
            Object[] objArr7 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i4 = 0;
            while (i4 < objArr7.length) {
                try {
                    Object[] objArr8 = {objArr7[i4]};
                    int i5 = getFingerPrintQualityScore;
                    short s = (short) i;
                    byte[] bArr2 = getScore;
                    int i6 = i2;
                    Object[] objArr9 = new Object[1];
                    b((byte) (i5 | 50), s, (short) (-bArr2[348]), objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[i6]);
                    char c2 = c;
                    Object[] objArr10 = new Object[1];
                    b((byte) 74, (short) 162, bArr2[9], objArr10);
                    String str3 = (String) objArr10[i6];
                    byte b7 = (byte) (i5 | 50);
                    Object[] objArr11 = new Object[1];
                    b(b7, (short) (b7 | 65), bArr2[c2], objArr11);
                    Object invoke = cls2.getMethod(str3, Class.forName((String) objArr11[i6])).invoke(null, objArr8);
                    Object[] objArr12 = new Object[1];
                    b((byte) (i5 | 50), s, (short) (-bArr2[348]), objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[i6]);
                    Object[] objArr13 = new Object[1];
                    b((byte) (i5 | 49), (short) 168, bArr2[17], objArr13);
                    iArr[i4] = ((Integer) cls3.getMethod((String) objArr13[i6], null).invoke(invoke, null)).intValue();
                    i4++;
                    i2 = i6;
                    c = c2;
                    i = 146;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();

                    if (cause == null) {

                        throw new RuntimeException(th);

                    }

                    throw new RuntimeException(cause);
                }
            }
            int i7 = i2;
            int i8 = i7;
            while (true) {
                int i9 = i8 + 1;
                try {
                } catch (Throwable th2) {
                    int i10 = getFingerPrintQualityScore;
                    short s2 = (short) 324;
                    byte[] bArr3 = getScore;
                    Object[] objArr14 = new Object[1];
                    b((byte) (i10 | 50), s2, (short) (bArr3[133] - 1), objArr14);
                    if (!Class.forName((String) objArr14[i7]).isInstance(th2) || i8 < 5 || i8 >= 7) {
                        Object[] objArr15 = new Object[1];
                        b((byte) (i10 | 50), s2, (short) (bArr3[133] - 1), objArr15);
                        if (!Class.forName((String) objArr15[i7]).isInstance(th2) || i8 < 8 || i8 >= 10) {
                            Object[] objArr16 = new Object[1];
                            b((byte) (i10 | 50), s2, (short) (bArr3[133] - 1), objArr16);
                            if (!Class.forName((String) objArr16[i7]).isInstance(th2) || i8 < 11) {
                            }
                            byte b8 = (byte) (i10 | 50);
                            short s3 = (short) (bArr3[133] - 1);
                            Object[] objArr17 = new Object[1];
                            b(b8, s2, s3, objArr17);
                            if (!Class.forName((String) objArr17[i7]).isInstance(th2) || i8 < 13 || i8 >= 19) {
                                if (i8 < 39 || i8 >= 43) {
                                    throw new RuntimeException(th2);
                                }
                                i8 = 37;
                                getdata.PngjPrematureEnding = th2;
                                getdata.PngjException(23);
                            }
                            i8 = 19;
                            getdata.PngjPrematureEnding = th2;
                            getdata.PngjException(23);
                        }
                    }
                    i8 = 19;
                    getdata.PngjPrematureEnding = th2;
                    getdata.PngjException(23);
                }
                switch (getdata.PngjException(iArr[i8])) {
                    case -20:
                        i8 = 43;
                    case -19:
                        getdata.PngjException(20);
                        int i11 = getdata.PngjException;
                        i8 = 38;
                        if (i11 != 0 && i11 == 1) {
                            i9 = 24;
                            i8 = i9;
                        }
                        break;
                    case -18:
                        getdata.valueOf = 1;
                        getdata.PngjException(2);
                        getdata.PngjException(3);
                        getdata.valueOf = getdata.PngjInputException.hashCode();
                        getdata.PngjException(8);
                        i8 = i9;
                    case -17:
                        getdata.PngjException(15);
                        throw ((Throwable) getdata.PngjInputException);
                    case -16:
                        i8 = 44;
                    case -15:
                        i8 = 46;
                    case -14:
                        getdata.PngjException(37);
                        if (getdata.PngjException == 0) {
                            i9 = 36;
                        }
                        i8 = i9;
                    case -13:
                        getdata.valueOf = 1;
                        getdata.PngjException(2);
                        getdata.PngjException(13);
                        PngjBadCrcException = getdata.PngjException;
                        i8 = i9;
                    case -12:
                        getdata.valueOf = valueOf;
                        getdata.PngjException(8);
                        i8 = i9;
                    case -11:
                        i8 = 1;
                    case -10:
                        return;
                    case -9:
                        i8 = 26;
                    case -8:
                        getdata.valueOf = 2;
                        getdata.PngjException(2);
                        getdata.PngjException(3);
                        FingerActivity fingerActivity = (FingerActivity) getdata.PngjInputException;
                        getdata.PngjException(3);
                        fingerActivity.onErrorResponse = (com.identy.e1) getdata.PngjInputException;
                        i8 = i9;
                    case -7:
                        getdata.valueOf = 6;
                        getdata.PngjException(2);
                        getdata.PngjException(3);
                        Activity activity = (Activity) getdata.PngjInputException;
                        getdata.PngjException(3);
                        com.identy.d.PngjBadSignature pngjBadSignature = (com.identy.d.PngjBadSignature) getdata.PngjInputException;
                        getdata.PngjException(3);
                        FingerDetectionMode fingerDetectionMode = (FingerDetectionMode) getdata.PngjInputException;
                        getdata.PngjException(13);
                        boolean z = getdata.PngjException != 0 ? true : (i7 != 0);
                        getdata.PngjException(13);
                        boolean z2 = getdata.PngjException != 0 ? true : (i7 != 0);
                        getdata.PngjException(13);
                        getdata.PngjPrematureEnding = new com.identy.getOveralTimetaken(activity, pngjBadSignature, fingerDetectionMode, z, z2, getdata.PngjException != 0 ? true : (i7 != 0));
                        getdata.PngjException(26);
                        i8 = i9;
                    case -6:
                        getdata.valueOf = 1;
                        getdata.PngjException(2);
                        getdata.PngjException(3);
                        getdata.valueOf = ((FingerActivity) getdata.PngjInputException).PngjUnsupportedException ? 1 : 0;
                        getdata.PngjException(8);
                        i8 = i9;
                    case -5:
                        getdata.valueOf = 1;
                        getdata.PngjException(2);
                        getdata.PngjException(3);
                        getdata.valueOf = ((IdentySdk) getdata.PngjInputException).u() ? 1 : 0;
                        getdata.PngjException(8);
                        i8 = i9;
                    case -4:
                        getdata.PngjPrematureEnding = IdentySdk.getInstance();
                        getdata.PngjException(26);
                        i8 = i9;
                    case -3:
                        getdata.valueOf = 1;
                        getdata.PngjException(2);
                        getdata.PngjException(3);
                        getdata.PngjPrematureEnding = ((FingerActivity) getdata.PngjInputException).PngjExceptionInternal;
                        getdata.PngjException(26);
                        i8 = i9;
                    case -2:
                        getdata.valueOf = 2;
                        getdata.PngjException(2);
                        getdata.PngjException(3);
                        FingerActivity fingerActivity2 = (FingerActivity) getdata.PngjInputException;
                        getdata.PngjException(3);
                        super.values((Bundle) getdata.PngjInputException);
                        i8 = i9;
                    case UInt.MAX_VALUE /* -1 */:
                        i8 = 21;
                    default:
                        i8 = i9;
                }
            }
        } catch (Throwable th3) {
            Throwable cause2 = th3.getCause();
            if (cause2 == null) {
                throw new RuntimeException(th3);
            }
            throw new RuntimeException(cause2);
        }
      } catch (Exception _ignored) { throw new RuntimeException(_ignored); }
    }
}
