package com.identy;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.identy.enums.Finger;
import com.identy.enums.FingerDetectionMode;
import com.identy.enums.Hand;
import com.karumi.dexter.BuildConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class CaptureRolledThumbActivity extends FingerActivity {
    private static  byte[] $$a = null;
    private static  int $$b = 0;
    private static  byte[] $$c = null;
    private static  int $$f = 0;
    private static int $10;
    private static int $11;
    private static long PngjBadCrcException;
    private static int valueOf;
    private static int values;

    public class PngjBadSignature implements Runnable {
        private static  byte[] $$a = null;
        private static  int $$b = 0;
        private static  byte[] $$c = null;
        private static  int $$d = 0;
        private static int $10;
        private static int $11;
        private static int PngjException;
        private static int PngjInputException;
        private static int PngjOutputException;
        private static char[] valueOf;
        private static long values;
        private /* synthetic */ HashMap PngjBadSignature;

        private static String $$e(int i, byte b, byte b2) {
            int i2 = (b2 * 9) + 104;
            byte[] bArr = $$c;
            int i3 = b * 2;
            int i4 = 4 - (i * 4);
            byte[] bArr2 = new byte[1 - i3];
            int i5 = 0 - i3;
            int i6 = -1;
            if (bArr == null) {
                i2 = i5 + i2;
                i4++;
            }
            while (true) {
                i6++;
                bArr2[i6] = (byte) i2;
                if (i6 == i5) {
                    return new String(bArr2, 0);
                }
                i2 += bArr[i4];
                i4++;
            }
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            PngjOutputException = 0;
            PngjInputException = 1;
            valueOf = new char[]{27022, 58218, 31776, 51583, 17017, 57171, 10318, 42308, 15957, 35663, 1059, 31660, 61766, 28226, 56150, 20562, 52598, 38197, 8132, 32972, 13789, 48848, 9190, 54519, 23029, 29771, 33832, 3778, 37323, 9419, 44995, 13043, 5144, 40680, 507, 46308, 16381, 41683, 21966, 29715, 65261, 25057, 54501, 24499, 49859, 13769, 47319, 9159, 38620, 6638, 36027, 63413, 29715, 65267, 25069, 54499, 24568, 49812, 40611, 5188, 24603, 60128, 30198, 49382, 19436, 55001, 8657, 44232, 14278, 33481, 3493, 39099, 58291, 28322, 22734, 53792, 19747, 63544, 29485, 60943, 6430, 14792, 45866, 11302, 39207, 4658, 36615, 30749, 29705, 65266, 25060, 54520, 24554, 49858, 13727, 57226, 21876, 51818, 32608, 62569, 27003, 40536, 4959, 34885, 15696, 45596, 10022, 23610, 53567, 17932, 64271, 28686, 58645, 6677, 36854, 29705, 65271, 25082, 54512, 24573, 49858, 29705, 65270, 27164, 57591, 32755, 51949, 16895, 56539, 11203, 42693, 15829, 34947, 1958, 37544, 59810, 25790, 62340, 20107, 29710, 65265, 25065, 54514, 24571, 49879, 13773, 47297, 9178, 38541, 20032, 50338, 23472, 61111, 26047, 63628, 4028, 33427, 6547, 44178, 9184, 29711, 65261, 25087, 54520, 24560, 49859, 13811, 47303, 9175, 38620, 6559, 36000, 63416, 31417, 60811, 45480, 15117, 41996, 4383, 39447, 1855, 61500, 60091, 24606, 65311, 18956, 49412, 23596, 43823, 9844, 48446, 2108, 34624, 29781, 65264, 25073, 54498, 24554, 49858, 13761, 47258, 9153, 38617, 6569, 36007, 48944, 13712, 43656, 8090, 38047, 2477, 65211, 29695, 59573, 23991, 53963, 29781, 65264, 25066, 54520, 24560, 29781, 65254, 25084, 54514, 52275, 18070, 55692, 27806, 59286, 31470, 29781, 65264, 25073, 54498, 24554, 49858, 13761, 47258, 9168, 38610, 6574, 36070, 63480, 31418, 60828, 20633, 56261, 47447, 13298, 44275, 6624, 37608, 4032, 63683, 30104, 61138, 23504, 54444, 16868, 15026, 47036, 8335, 40323, 5787, 33680, 31900, 59750, 25123, 29781, 65264, 25073, 54498, 24554, 49858, 13761, 47258, 9159, 38600, 6578, 36070, 63393, 31418, 60873, 20611, 56207, 20118, 45468, 9260, 44924, 4728, 34163, 2129, 29453, 47299, 12901, 44396, 6248, 37739, 3614, 63817, 29766, 61256, 23115, 54649, 16434, 15151, 46652, 8476, 39951, 5903, 62112, 30770, 59172, 21033, 55618, 17421, 14086, 48544, 8873, 38829, 7342, 33243, 7774, 38117, 3052, 48879, 13819, 43224, 24532, 29712, 65250, 25086, 54512, 24496, 49867, 13773, 47323, 9173, 38549, 6548, 36001, 63396, 31418, 60805, 20617, 47123, 13037, 44531, 6393, 37872};
            values = 3349846237139893891L;
            PngjException = 97774027;
        }

        public PngjBadSignature(HashMap hashMap) {
            this.PngjBadSignature = hashMap;
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1602)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:298)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] PngjBadCrcException$52c725b(int r83, java.lang.Object r84) {
            /*
                Method dump skipped, instructions count: 16871
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.identy.CaptureRolledThumbActivity.PngjBadSignature.PngjBadCrcException$52c725b(int, java.lang.Object):java.lang.Object[]");
        }

        private static void a(short s, byte b, short s2, Object[] objArr) {
            byte[] bArr = $$a;
            int i = s2 + 97;
            int i2 = 5 - b;
            byte[] bArr2 = new byte[s + 1];
            int i3 = -1;
            if (bArr == null) {
                i = (s + (-i2)) - 23;
                i2++;
                bArr = bArr;
                i3 = -1;
            }
            while (true) {
                int i4 = i3 + 1;
                bArr2[i4] = (byte) i;
                if (i4 == s) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                int i5 = i;
                byte[] bArr3 = bArr;
                i = (i5 + (-bArr[i2])) - 23;
                i2++;
                bArr = bArr3;
                i3 = i4;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0276  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0277  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(int i, char c, int i2, Object[] objArr) {
            Throwable cause;
            int i3;
            int i4;
            char c2;
            int i5;
            int i6;
            com.d.e.onErrorResponse onerrorresponse = new com.d.e.onErrorResponse();
            long[] jArr = new long[i2];
            int i7 = 0;
            onerrorresponse.PngjBadSignature = 0;
            while (true) {
                int i8 = onerrorresponse.PngjBadSignature;
                if (i8 >= i2) {
                    break;
                }
                int i9 = $10 + 105;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                Class cls = Long.TYPE;
                Class cls2 = Integer.TYPE;
                if (i10 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(valueOf[i >> i8])};
                        Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(1678178881);
                        if (PngjBadSignature == null) {
                            c2 = 1;
                            char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int keyCodeFromString = KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 19;
                            i5 = 57266;
                            int offsetAfter = TextUtils.getOffsetAfter(BuildConfig.FLAVOR, i7) + 586;
                            i6 = -173046460;
                            byte b = (byte) i7;
                            i3 = i7;
                            byte b2 = b;
                            i4 = 2;
                            PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(maximumFlingVelocity, keyCodeFromString, offsetAfter, -1729521670, false, $$e(b, b2, (byte) (b2 + 1)), new Class[]{cls2});
                        } else {
                            i3 = i7;
                            i4 = 2;
                            c2 = 1;
                            i5 = 57266;
                            i6 = -173046460;
                        }
                        Long l = (Long) ((Method) PngjBadSignature).invoke(null, objArr2);
                        l.longValue();
                        long j = i8;
                        long j2 = values;
                        Object[] objArr3 = new Object[4];
                        objArr3[3] = Integer.valueOf(c);
                        objArr3[i4] = Long.valueOf(j2);
                        objArr3[c2] = Long.valueOf(j);
                        objArr3[i3] = l;
                        Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i6);
                        if (PngjBadSignature2 == null) {
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (Color.green(i3) + i5), 35 - (ViewConfiguration.getEdgeSlop() >> 16), ExpandableListView.getPackedPositionChild(0L) + 52, 155248895, false, "t", new Class[]{cls, cls, cls, cls2});
                        }
                        jArr[i8] = ((Long) ((Method) PngjBadSignature2).invoke(null, objArr3)).longValue();
                        Object[] objArr4 = new Object[i4];
                        objArr4[c2] = onerrorresponse;
                        objArr4[i3] = onerrorresponse;
                        Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(818986954);
                        if (PngjBadSignature3 == null) {
                            int i11 = i3;
                            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 35 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, i11), 155 - View.MeasureSpec.getSize(i11), -868232591, false, "p", new Class[]{Object.class, Object.class});
                        }
                        ((Method) PngjBadSignature3).invoke(null, objArr4);
                    } catch (Throwable th) {
                        Throwable cause2 = th.getCause();
                        if (cause2 != null) {
                            throw new RuntimeException(cause2);
                        }
                        throw new RuntimeException(th);
                    }
                } else {
                    try {
                    Object[] objArr5 = {Integer.valueOf(valueOf[i + i8])};
                    Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1678178881);
                    if (PngjBadSignature4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) Color.red(0), 18 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0'), ImageFormat.getBitsPerPixel(0) + 587, -1729521670, false, $$e(b3, b4, (byte) (b4 + 1)), new Class[]{cls2});
                    }
                    Long l2 = (Long) ((Method) PngjBadSignature4).invoke(null, objArr5);
                    l2.longValue();
                    Object[] objArr6 = {l2, Long.valueOf(i8), Long.valueOf(values), Integer.valueOf(c)};
                    Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-173046460);
                    if (PngjBadSignature5 == null) {
                        PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 57266), 35 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 51, 155248895, false, "t", new Class[]{cls, cls, cls, cls2});
                    }
                    jArr[i8] = ((Long) ((Method) PngjBadSignature5).invoke(null, objArr6)).longValue();
                    Object[] objArr7 = {onerrorresponse, onerrorresponse};
                    Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(818986954);
                    if (PngjBadSignature6 == null) {
                        PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) Gravity.getAbsoluteGravity(0, 0), 35 - (ViewConfiguration.getTouchSlop() >> 8), 155 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), -868232591, false, "p", new Class[]{Object.class, Object.class});
                    }
                    ((Method) PngjBadSignature6).invoke(null, objArr7);
                    } catch (Throwable th) { Throwable cause3 = th.getCause(); throw new RuntimeException(cause3 != null ? cause3 : th); }
                }
                i7 = 0;
            }
            char[] cArr = new char[i2];
            onerrorresponse.PngjBadSignature = 0;
            while (true) {
                int i12 = onerrorresponse.PngjBadSignature;
                if (i12 >= i2) {
                    break;
                }
                $11 = ($10 + 99) % 128;
                cArr[i12] = (char) jArr[i12];
                Object[] objArr8 = {onerrorresponse, onerrorresponse};
                Object PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(818986954);
                if (PngjBadSignature7 == null) {
                    PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 35 - KeyEvent.getDeadChar(0, 0), 155 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -868232591, false, "p", new Class[]{Object.class, Object.class});
                }
                try { ((Method) PngjBadSignature7).invoke(null, objArr8); } catch (Exception _e) { throw new RuntimeException(_e); }
                $11 = ($10 + 107) % 128;
            }
            String str = new String(cArr);
            int i13 = $10 + 39;
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
            objArr[0] = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x01a2  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x01a3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void c(int i, int i2, int i3, boolean z, String str, Object[] objArr) {
            char[] cArr;
            Throwable cause;
            char c;
            int i4;
            if (str != null) {
                int i5 = $10 + 125;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    cArr = str.toCharArray();
                    int i6 = 80 / 0;
                } else {
                    cArr = str.toCharArray();
                }
            } else {
                cArr = null;
            }
            char[] cArr2 = cArr;
            com.d.e.Action action = new com.d.e.Action();
            char[] cArr3 = new char[i3];
            action.valueOf = 0;
            while (true) {
                int i7 = action.valueOf;
                if (i7 >= i3) {
                    break;
                }
                $11 = ($10 + 15) % 128;
                char c2 = cArr2[i7];
                action.values = c2;
                char c3 = (char) (i + c2);
                cArr3[i7] = c3;
                try {
                    Object[] objArr2 = {Integer.valueOf(c3), Integer.valueOf(PngjException)};
                    Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(610361420);
                    if (PngjBadSignature == null) {
                        char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                        int i8 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 27;
                        int green = Color.green(0) + 1531;
                        byte b = (byte) 0;
                        i4 = -743328348;
                        byte b2 = b;
                        c = 1;
                        String $$e = $$e(b, b2, b2);
                        Class cls = Integer.TYPE;
                        PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(packedPositionChild, i8, green, -661778953, false, $$e, new Class[]{cls, cls});
                    } else {
                        c = 1;
                        i4 = -743328348;
                    }
                    cArr3[i7] = ((Character) ((Method) PngjBadSignature).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = new Object[2];
                    objArr3[c] = action;
                    objArr3[0] = action;
                    Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i4);
                    if (PngjBadSignature2 == null) {
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (Color.rgb(0, 0, 0) + 16777216), 40 - Color.alpha(0), (-16777026) - Color.rgb(0, 0, 0), 794744863, false, "j", new Class[]{Object.class, Object.class});
                    }
                    ((Method) PngjBadSignature2).invoke(null, objArr3);
                    $11 = ($10 + 29) % 128;
                } catch (Throwable th) {

                    Throwable cause2 = th.getCause();

                    if (cause2 != null) {

                        throw new RuntimeException(cause2);

                    }

                    throw new RuntimeException(th);

                }
            }
            if (i2 > 0) {
                action.PngjException = i2;
                char[] cArr4 = new char[i3];
                System.arraycopy(cArr3, 0, cArr4, 0, i3);
                int i9 = action.PngjException;
                System.arraycopy(cArr4, 0, cArr3, i3 - i9, i9);
                int i10 = action.PngjException;
                System.arraycopy(cArr4, i10, cArr3, 0, i3 - i10);
            }
            if (z) {
                $11 = ($10 + 37) % 128;
                char[] cArr5 = new char[i3];
                action.valueOf = 0;
                while (true) {
                    int i11 = action.valueOf;
                    if (i11 >= i3) {
                        break;
                    }
                    int i12 = $10 + 29;
                    $11 = i12 % 128;
                    try {
                    if (i12 % 2 == 0) {
                        cArr5[i11] = cArr3[(i3 / i11) << 1];
                        Object[] objArr4 = {action, action};
                        Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-743328348);
                        if (PngjBadSignature3 == null) {
                            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) Color.blue(0), 40 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 190, 794744863, false, "j", new Class[]{Object.class, Object.class});
                        }
                        ((Method) PngjBadSignature3).invoke(null, objArr4);
                    } else {
                        cArr5[i11] = cArr3[(i3 - i11) - 1];
                        Object[] objArr5 = {action, action};
                        Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-743328348);
                        if (PngjBadSignature4 == null) {
                            PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 40 - (ViewConfiguration.getTouchSlop() >> 8), Color.alpha(0) + 190, 794744863, false, "j", new Class[]{Object.class, Object.class});
                        }
                        ((Method) PngjBadSignature4).invoke(null, objArr5);
                    }
                    } catch (Exception _e) { throw new RuntimeException(_e); }
                }
                cArr3 = cArr5;
            }
            String str2 = new String(cArr3);
            $11 = ($10 + 81) % 128;
            objArr[0] = str2;
        }

        public static void init$0() {
            $$a = new byte[]{100, 91, -82, 96, 29, -13, -28};
            $$b = 175;
        }

        public static void init$1() {
            $$c = new byte[]{60, 89, 26, -54};
            $$d = 106;
        }

        @Override // java.lang.Runnable
        public final void run() {
            PngjOutputException = (PngjInputException + 97) % 128;
            if (FingerActivity.PngjPrematureEnding) {
                CaptureRolledThumbActivity.this.getPadSub1 = new com.identy.ui.c.getPadSub3(CaptureRolledThumbActivity.this, false, (com.identy.IdentyA) this.PngjBadSignature.get(new Pair(CaptureRolledThumbActivity.this.PngjExceptionInternal.getHand(), CaptureRolledThumbActivity.this.PngjExceptionInternal.getFinger())), CaptureRolledThumbActivity.this.getQualityScore);
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.copyFrom(CaptureRolledThumbActivity.this.getPadSub1.getWindow().getAttributes());
                ((ViewGroup.LayoutParams) layoutParams).width = -1;
                CaptureRolledThumbActivity.this.getPadSub1.show();
                PngjOutputException = (PngjInputException + 9) % 128;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$i(short s, short s2, short s3) {
        int i;
        int i2;
        int i3 = (s * 2) + 1;
        byte[] bArr = $$c;
        int i4 = 107 - (s2 * 3);
        int i5 = s3 + 4;
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            byte[] bArr3 = bArr;
            i2 = 0;
            int i6 = i5;
            i4 += i5;
            i5 = i6;
            bArr = bArr3;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            int i7 = i5 + 1;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            byte b = bArr[i7];
            byte[] bArr4 = bArr;
            i6 = i7;
            i5 = b;
            bArr3 = bArr4;
            i4 += i5;
            i5 = i6;
            bArr = bArr3;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            int i72 = i5 + 1;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            int i722 = i5 + 1;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
        }
        return new String(bArr2, 0);
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        values = 0;
        valueOf = 1;
        PngjBadCrcException = 3029512183989428577L;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, int i, Object[] objArr) {
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = (s * 2) + 80;
        int i5 = 22 - (b * 18);
        int i6 = 19 - (i * 6);
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i7 = 0;
            int i8 = i5;
            i5++;
            i4 = i8 + i4 + 5;
            bArr = bArr3;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            i3 = i2 + 1;
            if (i3 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b2 = bArr[i5];
            byte[] bArr4 = bArr;
            i8 = i4;
            i4 = b2;
            i7 = i3;
            bArr3 = bArr4;
            i5++;
            i4 = i8 + i4 + 5;
            bArr = bArr3;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            i3 = i2 + 1;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i3 = i2 + 1;
            if (i3 == i6) {
            }
        }
    }

    private static void c(String str, int i, Object[] objArr) {
        char[] cArr;
        int i2 = $11;
        $10 = (i2 + 111) % 128;
        if (str != null) {
            int i3 = i2 + 125;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                cArr = str.toCharArray();
                int i4 = 33 / 0;
            } else {
                cArr = str.toCharArray();
            }
        } else {
            cArr = null;
        }
        com.d.e.ComDeA aVar = new com.d.e.ComDeA();
        char[] values2 = com.d.e.ComDeA.values(PngjBadCrcException ^ 8332534422373704609L, cArr, i);
        aVar.PngjBadSignature = 4;
        while (true) {
            int i5 = aVar.PngjBadSignature;
            if (i5 >= values2.length) {
                objArr[0] = new String(values2, 4, values2.length - 4);
                return;
            }
            int i6 = i5 - 4;
            aVar.PngjBadCrcException = i6;
            try {
                Object[] objArr2 = {Long.valueOf(values2[i5] ^ values2[i5 % 4]), Long.valueOf(i6), Long.valueOf(PngjBadCrcException)};
                Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1668670198);
                if (PngjBadSignature2 == null) {
                    char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                    int scrollDefaultDelay = 29 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 1;
                    Class cls = Long.TYPE;
                    PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(pressedStateDuration, scrollDefaultDelay, modifierMetaStateMask, 1617260721, false, "o", new Class[]{cls, cls, cls});
                }
                values2[i5] = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {aVar, aVar};
                Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1405973094);
                if (PngjBadSignature3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (14830 - (ViewConfiguration.getLongPressTimeout() >> 16)), 28 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 721, -1356718115, false, $$i(b, b2, (byte) (b2 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) PngjBadSignature3).invoke(null, objArr3);
                $11 = ($10 + 79) % 128;
            } catch (Throwable th) {
                Throwable cause = th.getCause();

                if (cause == null) {

                    throw new RuntimeException(th);

                }

                throw new RuntimeException(cause);
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{87, -33, -73, -38, 25, -12, -2, -45, 26, -2, -38, 42, -20, -35, 46, -26, -3, 6, -1, -16, 1, -6, 25, -12, -2, -42, 46, -26, -3, 6, -1, -16, 1, -6};
        $$b = 133;
    }

    public static void init$1() {
        $$c = new byte[]{31, 93, -84, 91};
        $$f = 127;
    }

    @Override // com.identy.FingerActivity, com.identy.d.PngjBadSignature
    public void PngjException(HashMap<Pair<Hand, Finger>, com.identy.IdentyA> hashMap, HashMap<Pair<Hand, Finger>, com.identy.IdentyA> hashMap2, Bitmap bitmap, boolean z, boolean z2) {
        values = (valueOf + 25) % 128;
        super.PngjException(hashMap, hashMap2, bitmap, z, z2);
        if (!z) {
            int i = valueOf + 105;
            values = i % 128;
            if (i % 2 != 0) {
                int i2 = 17 / 0;
                return;
            }
            return;
        }
        if (this.getAsHighestSecurityLevelReached) {
            try {
                com.identy.e1.values(new Object[]{this.onErrorResponse}, com.identy.i.PngjPrematureEnding.values(), com.identy.i.PngjPrematureEnding.values(), -431637600, com.identy.i.PngjPrematureEnding.values(), 431637601, com.identy.i.PngjPrematureEnding.values());
                IdentySdk identySdk = IdentySdk.getInstance();
                FingerDetectionMode fingerDetectionMode = this.PngjExceptionInternal;
                com.identy.e1 e1Var = this.onErrorResponse;
                long j = e1Var.toString;
                long j2 = e1Var.Enroll2IndexActivity;
                int i3 = e1Var.getEncryptedTemplates;
                byte[] PngjPrematureEnding = e1Var.PngjPrematureEnding();
                com.identy.e1 e1Var2 = this.onErrorResponse;
                identySdk.a(fingerDetectionMode, hashMap, j, j2, 0L, i3, PngjPrematureEnding, e1Var2.setFoundMatchingTemplates + e1Var2.Enroll2IndexActivity, e1Var2.closeDialog, e1Var2.getHeight, e1Var2.ERRORS);
            } catch (Exception e) {
                try {
                    if (LibSettings.isSaveCaptured()) {
                        e.getMessage();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            try {
                this.Action.PngjException();
            } catch (Exception unused) {
            }
            try {
                if (IdentySdk.getInstance().isDisplayPrints()) {
                    runOnUiThread(new PngjBadSignature(hashMap));
                } else if (IdentySdk.getInstance().v()) {
                    com.identy.ui.c.PngjUnsupportedException pngjUnsupportedException = new com.identy.ui.c.PngjUnsupportedException(this, this.getQualityScore, this.PngjExceptionInternal, (FingerDetectionMode) FingerActivity.PngjException(com.identy.a.PngjException.values(), -388390624, new Object[]{this}, com.identy.a.PngjException.values(), 388390631, com.identy.a.PngjException.values(), com.identy.a.PngjException.values()));
                    this.getPadSub1 = pngjUnsupportedException;
                    pngjUnsupportedException.show();
                } else if (IdentySdk.getInstance().isDisplayMoveNextDialog()) {
                    Attempt();
                } else {
                    Action();
                }
            } catch (Exception e3) {
                try {
                    if (LibSettings.isSaveCaptured()) {
                        values = (valueOf + 107) % 128;
                        e3.getMessage();
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0337  */
    @Override // com.identy.FingerActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void attachBaseContext(Context context) {
        int i;
        char c;
        long j = 0;
        int intValue = 0;
        Object[] PngjBadSignature$1eba2e16 = null;
        int i2;
        int i3;
        values = (valueOf + 99) % 128;
        super.attachBaseContext(context);
        Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
        if (PngjBadSignature2 == null) {
            char keyCodeFromString = (char) (KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 14830);
            int combineMeasuredStates = 28 - View.combineMeasuredStates(0, 0);
            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 722;
            byte b = $$a[20];
            byte b2 = (byte) (b - 1);
            byte b3 = b;
            Object[] objArr = new Object[1];
            b(b2, b3, (byte) (b3 - 1), objArr);
            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(keyCodeFromString, combineMeasuredStates, packedPositionChild, -815159504, false, (String) objArr[0], null);
        }
        long j2;
        try { j2 = ((Field) PngjBadSignature2).getLong(null); } catch (Exception _e) { throw new RuntimeException(_e); }
        try {
            try {
                if (j2 != -1) {
                    values = (valueOf + 63) % 128;
                    long j3 = j2 + 4611686018427387777L;
                    i = 864471691;
                    Object[] objArr2 = new Object[1];
                    c("\udde7\ue11c좭앂\udd86⎲䵉走횈ⲵ塉阬쮈㦯匃魑ﲞʯ湙걧\uf18aྟ祁녭\uea84ᢷ", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, objArr2);
                    Class<?> cls = Class.forName((String) objArr2[0]);
                    c = 20;
                    Object[] objArr3 = new Object[1];
                    j = 0;
                    c("⺔苰뜒\u0c4f⻱䁜㋳䑿◧何⟶彝㣱婑⳾剻\u0ffd慝ᇷ", ViewConfiguration.getKeyRepeatDelay() >> 16, objArr3);
                    if (j3 >= ((Long) cls.getDeclaredMethod((String) objArr3[0], null).invoke(null, null)).longValue()) {
                        Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                        if (PngjBadSignature3 == null) {
                            char c2 = (char) (14830 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                            int i4 = 28 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            int mirror = AndroidCharacter.getMirror('0') + 673;
                            byte b4 = $$a[20];
                            byte b5 = (byte) (b4 - 1);
                            Object[] objArr4 = new Object[1];
                            b(b5, b5, b4, objArr4);
                            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c2, i4, mirror, -779023007, false, (String) objArr4[0], null);
                        }
                        Object[] objArr5 = (Object[]) ((Field) PngjBadSignature3).get(null);
                        PngjBadSignature$1eba2e16 = new Object[]{new int[]{0}, new int[1], 0, new int[]{0}};
                        int i5 = ((int[]) objArr5[3])[0];
                        int i6 = ((int[]) objArr5[0])[0];
                        String[] strArr = (String[]) objArr5[2];
                        int identityHashCode = System.identityHashCode(this);
                        int i7 = ~identityHashCode;
                        int c3 = defpackage.a.c(~(i7 | 510329803), 301, (((~(identityHashCode | (-524236171))) | 506134922 | (~(528431051 | i7))) * (-301)) + ((((~((-524236171) | i7)) | 510329803) * (-602)) - 2103240715), -1862998883);
                        int i8 = c3 ^ (c3 << 13);
                        int i9 = i8 ^ (i8 >>> 17);
                        ((int[]) PngjBadSignature$1eba2e16[1])[0] = i9 ^ (i9 << 5);
                        i2 = ((int[]) PngjBadSignature$1eba2e16[0])[0];
                        i3 = ((int[]) PngjBadSignature$1eba2e16[3])[0];
                        if (i3 != i2) {
                            Object[] objArr6 = {new int[]{0}, new int[1], 0, new int[]{0}};
                            int i10 = ((int[]) PngjBadSignature$1eba2e16[1])[0];
                            int i11 = ((int[]) PngjBadSignature$1eba2e16[3])[0];
                            int i12 = ((int[]) PngjBadSignature$1eba2e16[0])[0];
                            String[] strArr2 = (String[]) PngjBadSignature$1eba2e16[2];
                            int identityHashCode2 = System.identityHashCode(this);
                            int c4 = defpackage.a.c((~((~identityHashCode2) | 1000090678)) | (-34475296), 168, (((~(identityHashCode2 | 1000090678)) | (-1000222016)) * (-168)) + ((((~((-34475296) | identityHashCode2)) | 34343958) * 336) - 973825651), i10);
                            int i13 = c4 ^ (c4 << 13);
                            int i14 = i13 ^ (i13 >>> 17);
                            ((int[]) objArr6[1])[0] = i14 ^ (i14 << 5);
                            values = (valueOf + 47) % 128;
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        String[] strArr3 = (String[]) PngjBadSignature$1eba2e16[2];
                        if (strArr3 != null) {
                            for (String str : strArr3) {
                                arrayList.add(str);
                            }
                        }
                        Toast.makeText((Context) null, i3 / (((i3 - 1) * i3) % 2), 0).show();
                        Object[] objArr7 = {new int[]{0}, new int[1], 0, new int[]{0}};
                        int i15 = ((int[]) PngjBadSignature$1eba2e16[1])[0];
                        int i16 = ((int[]) PngjBadSignature$1eba2e16[3])[0];
                        int i17 = ((int[]) PngjBadSignature$1eba2e16[0])[0];
                        String[] strArr4 = (String[]) PngjBadSignature$1eba2e16[2];
                        int c5 = defpackage.a.c((~((~System.identityHashCode(this)) | 169493228)) | (-966112390), 184, (((-830845954) | 0) * 184) - 1589380515, i15);
                        int i18 = c5 ^ (c5 << 13);
                        int i19 = i18 ^ (i18 >>> 17);
                        ((int[]) objArr7[1])[0] = i19 ^ (i19 << 5);
                        int i20 = values + 47;
                        valueOf = i20 % 128;
                        if (i20 % 2 == 0) {
                            throw null;
                        }
                        return;
                    }
                } else {
                    i = 864471691;
                    c = 20;
                    j = 0;
                }
                Object[] objArr8 = new Object[1];
                c("\udde7\ue11c좭앂\udd86⎲䵉走횈ⲵ塉阬쮈㦯匃魑ﲞʯ湙걧\uf18aྟ祁녭\uea84ᢷ", KeyEvent.normalizeMetaState(0), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c("⺔苰뜒\u0c4f⻱䁜㋳䑿◧何⟶彝㣱婑⳾剻\u0ffd慝ᇷ", TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 1, objArr9);
                Long valueOf2 = Long.valueOf(((Long) cls2.getDeclaredMethod((String) objArr9[0], null).invoke(null, null)).longValue());
                Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i);
                if (PngjBadSignature4 == null) {
                    char green = (char) (14830 - Color.green(0));
                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 28;
                    int i21 = (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 722;
                    byte b6 = $$a[c];
                    byte b7 = (byte) (b6 - 1);
                    byte b8 = b6;
                    Object[] objArr10 = new Object[1];
                    b(b7, b8, (byte) (b8 - 1), objArr10);
                    PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(green, scrollBarSize, i21, -815159504, false, (String) objArr10[0], null);
                }
                ((Field) PngjBadSignature4).set(null, valueOf2);
                i2 = ((int[]) PngjBadSignature$1eba2e16[0])[0];
                i3 = ((int[]) PngjBadSignature$1eba2e16[3])[0];
                if (i3 != i2) {
                }
            } catch (Exception unused) {
                throw new RuntimeException();
            }
            Object[] objArr11 = {863387081};
            Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1439412966);
            if (PngjBadSignature5 == null) {
                PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 23 - ImageFormat.getBitsPerPixel(0), View.getDefaultSize(0, 0) + 697, 1457201313, false, null, new Class[]{Integer.TYPE});
            }
            PngjBadSignature$1eba2e16 = (Object[]) arid.chunks.PngBadCharsetException.PngjBadSignature$1eba2e16(intValue, ((Constructor) PngjBadSignature5).newInstance(objArr11), -1862998883);
            Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
            if (PngjBadSignature6 == null) {
                char maxKeyCode = (char) (14830 - (KeyEvent.getMaxKeyCode() >> 16));
                int combineMeasuredStates2 = 28 - View.combineMeasuredStates(0, 0);
                int jumpTapTimeout = 721 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                byte b9 = $$a[c];
                byte b10 = (byte) (b9 - 1);
                Object[] objArr12 = new Object[1];
                b(b10, b10, b9, objArr12);
                PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(maxKeyCode, combineMeasuredStates2, jumpTapTimeout, -779023007, false, (String) objArr12[0], null);
            }
            ((Field) PngjBadSignature6).set(null, PngjBadSignature$1eba2e16);
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
        try {
        Object[] objArr13 = new Object[1];
        c("⍾픚⏺쁊⌔ុꘌ衫⡐ᢶ댛鍤㔙෴렩鹳ȍ㚮蔟ꥧ", Drawable.resolveOpacity(0, 0), objArr13);
        Class<?> cls3 = Class.forName((String) objArr13[0]);
        Object[] objArr14 = new Object[1];
        c("⯤婾ཋ蓝⮍飚誮쳳ₐ韗龿ퟤ㶬苟钸\udaf5ધ맑ꦯ\uedf8", (-1) - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0), objArr14);
        intValue = ((Integer) cls3.getMethod((String) objArr14[0], Object.class).invoke(null, this)).intValue();
        } catch (Exception _e) { throw new RuntimeException(_e); }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i = values + 97;
        valueOf = i % 128;
        int i2 = i % 2;
        super.onCreate(bundle);
        findViewById(R.id.middle_info_image).setVisibility(0);
        valueOf = (values + 95) % 128;
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onPause() {
        valueOf = (values + 109) % 128;
        super.onPause();
        values = (valueOf + 59) % 128;
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onResume() {
        int i = valueOf + 9;
        values = i % 128;
        int i2 = i % 2;
        super.onResume();
        if (i2 != 0) {
            int i3 = 94 / 0;
        }
        values = (valueOf + 41) % 128;
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onStart() {
        values = (valueOf + 3) % 128;
        super.onStart();
        values = (valueOf + 37) % 128;
    }

    @Override // com.identy.FingerActivity
    public void values(Bundle bundle) {
        FingerDetectionMode fingerDetectionMode = null;
        super.values(bundle);
        try {
            fingerDetectionMode = this.PngjExceptionInternal;
        } catch (Exception e) {
        }
        try {
            this.onErrorResponse = new com.identy.getL1Score(this, this, fingerDetectionMode, new Finger[]{fingerDetectionMode.getFinger()}, IdentySdk.getInstance().u(), this.PngjUnsupportedException);
        } catch (Exception e2) {
            Exception exc = e2;
            try {
                if (LibSettings.isSaveCaptured()) {
                    exc.getMessage();
                    valueOf = (values + 121) % 128;
                    return;
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            int i = values + 7;
            valueOf = i % 128;
            if (i % 2 == 0) {
                int i2 = 79 / 0;
            }
        }
    }
}
