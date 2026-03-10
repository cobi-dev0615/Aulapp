package com.identy;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ExpandableListView;
import com.d.e.a.c.getPadSub3B15685$PngjException;
import com.identy.enums.Finger;
import com.identy.enums.FingerDetectionMode;
import com.identy.enums.Hand;
import com.karumi.dexter.BuildConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public class Enroll4FActivity extends FingerActivity {
    private static  byte[] $$a = null;
    private static  int $$b = 0;
    private static  byte[] $$c = null;
    private static  int $$f = 0;
    private static int $10;
    private static int $11;
    private static long PngjBadCrcException;
    private static int getFingerPrintQualityScore;
    private static int values;
    HashMap valueOf = new HashMap();

    public class PngjBadSignature implements com.identy.d.PngjBadCrcException {
        private static  byte[] $$a = null;
        private static  int $$b = 0;
        private static  byte[] $$c = null;
        private static  byte[] $$d = null;
        private static  int $$e = 0;
        private static  int $$f = 0;
        private static int $10;
        private static int $11;
        private static int[] PngjException;
        private static int valueOf;
        private static int values;
        final /* synthetic */ HashMap PngjBadCrcException;

        public class valueOf implements Runnable {
            public static int PngjException;
            public static int values;

            public valueOf() {
            }

            public static int PngjException() {
                int i = values;
                int i2 = i % 6087989;
                values = i + 1;
                if (i2 != 0) {
                    return PngjException;
                }
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                PngjException = elapsedCpuTime;
                return elapsedCpuTime;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (FingerActivity.PngjPrematureEnding) {
                    Enroll4FActivity enroll4FActivity = Enroll4FActivity.this;
                    PngjBadSignature pngjBadSignature = PngjBadSignature.this;
                    Enroll4FActivity enroll4FActivity2 = Enroll4FActivity.this;
                    enroll4FActivity.getPadSub1 = new com.identy.ui.c.PngjInputException(enroll4FActivity2, enroll4FActivity2.valueOf, pngjBadSignature.PngjBadCrcException, enroll4FActivity2.getQualityScore);
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                    layoutParams.copyFrom(Enroll4FActivity.this.getPadSub1.getWindow().getAttributes());
                    ((ViewGroup.LayoutParams) layoutParams).width = -1;
                    Enroll4FActivity.this.getPadSub1.show();
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$g(byte b, int i, byte b2) {
            int i2;
            int i3;
            int i4 = 122 - (b2 * 57);
            int i5 = (i * 3) + 1;
            byte[] bArr = $$c;
            int i6 = 3 - (b * 4);
            byte[] bArr2 = new byte[i5];
            if (bArr == null) {
                int i7 = i6;
                int i8 = i5;
                i3 = 0;
                int i9 = i6 + (-i8);
                int i10 = i7;
                i4 = i9;
                i6 = i10;
                i2 = i3;
                int i11 = i6 + 1;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i4;
                if (i3 == i5) {
                    return new String(bArr2, 0);
                }
                i8 = bArr[i11];
                int i12 = i4;
                i7 = i11;
                i6 = i12;
                int i92 = i6 + (-i8);
                int i102 = i7;
                i4 = i92;
                i6 = i102;
                i2 = i3;
                int i112 = i6 + 1;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i4;
                if (i3 == i5) {
                }
            } else {
                i2 = 0;
                int i1122 = i6 + 1;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i4;
                if (i3 == i5) {
                }
            }
        }

        static {
            init$2();
            $10 = 0;
            $11 = 1;
            init$1();
            init$0();
            valueOf = 0;
            values = 1;
            PngjException = new int[]{111479923, 853103068, 105161017, -2034488638, -1227812239, -1491967083, -709142527, 1829397500, 1980831781, 827058315, -640070087, 969067698, 1538418039, -232891631, 1121404944, -1208647540, 1565905900, -47022626};
        }

        public PngjBadSignature(HashMap hashMap) {
            this.PngjBadCrcException = hashMap;
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1602)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:298)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] PngjBadCrcException(int r44) {
            /*
                Method dump skipped, instructions count: 2902
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.identy.Enroll4FActivity.PngjBadSignature.PngjBadCrcException(int):java.lang.Object[]");
        }

        private static void a(int[] iArr, int i, Object[] objArr) {
            char c;
            char[] cArr;
            int[] iArr2;
            int i2;
            int i3;
            com.d.e.PngBadCharsetException pngBadCharsetException = new com.d.e.PngBadCharsetException();
            char[] cArr2 = new char[4];
            int i4 = 2;
            char[] cArr3 = new char[iArr.length * 2];
            int[] iArr3 = PngjException;
            int i5 = 1618428774;
            Class cls = Integer.TYPE;
            int i6 = 0;
            if (iArr3 != null) {
                int length = iArr3.length;
                int[] iArr4 = new int[length];
                int i7 = 0;
                while (i7 < length) {
                    $11 = ($10 + 61) % 128;
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i7])};
                        Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(i5);
                        if (PngjBadSignature == null) {
                            i3 = i5;
                            char deadChar = (char) KeyEvent.getDeadChar(i6, i6);
                            i2 = i4;
                            int lastIndexOf = 30 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', i6);
                            int combineMeasuredStates = 1381 - View.combineMeasuredStates(i6, i6);
                            byte b = (byte) i6;
                            byte b2 = b;
                            PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(deadChar, lastIndexOf, combineMeasuredStates, -1667748131, false, $$g(b, b2, b2), new Class[]{cls});
                        } else {
                            i2 = i4;
                            i3 = i5;
                        }
                        iArr4[i7] = ((Integer) ((Method) PngjBadSignature).invoke(null, objArr2)).intValue();
                        i7++;
                        i5 = i3;
                        i4 = i2;
                        i6 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();

                        if (cause == null) {

                            throw new RuntimeException(th);

                        }

                        throw new RuntimeException(cause);
                    }
                }
                iArr3 = iArr4;
            }
            int i8 = i4;
            int i9 = i5;
            int length2 = iArr3.length;
            int[] iArr5 = new int[length2];
            int[] iArr6 = PngjException;
            if (iArr6 != null) {
                int length3 = iArr6.length;
                int[] iArr7 = new int[length3];
                int i10 = 0;
                while (i10 < length3) {
                    int i11 = $10 + 55;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        Object[] objArr3 = {Integer.valueOf(iArr6[i10])};
                        Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i9);
                        if (PngjBadSignature2 == null) {
                            cArr = cArr2;
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            iArr2 = iArr6;
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) View.resolveSize(0, 0), Color.green(0) + 31, 1381 - ExpandableListView.getPackedPositionType(0L), -1667748131, false, $$g(b3, b4, b4), new Class[]{cls});
                        } else {
                            cArr = cArr2;
                            iArr2 = iArr6;
                        }
                        try { iArr7[i10] = ((Integer) ((Method) PngjBadSignature2).invoke(null, objArr3)).intValue(); } catch (Exception _e) { throw new RuntimeException(_e); }
                        i10 %= 1;
                    } else {
                        cArr = cArr2;
                        iArr2 = iArr6;
                        Object[] objArr4 = {Integer.valueOf(iArr2[i10])};
                        Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i9);
                        if (PngjBadSignature3 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 32 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1381 - View.MeasureSpec.getMode(0), -1667748131, false, $$g(b5, b6, b6), new Class[]{cls});
                        }
                        try { iArr7[i10] = ((Integer) ((Method) PngjBadSignature3).invoke(null, objArr4)).intValue(); } catch (Exception _e) { throw new RuntimeException(_e); }
                        i10++;
                    }
                    cArr2 = cArr;
                    iArr6 = iArr2;
                }
                iArr6 = iArr7;
            }
            char[] cArr4 = cArr2;
            char c2 = 0;
            System.arraycopy(iArr6, 0, iArr5, 0, length2);
            pngBadCharsetException.values = 0;
            while (true) {
                int i12 = pngBadCharsetException.values;
                if (i12 >= iArr.length) {
                    objArr[0] = new String(cArr3, 0, i);
                    return;
                }
                int i13 = iArr[i12];
                char c3 = (char) (i13 >> 16);
                cArr4[c2] = c3;
                char c4 = (char) i13;
                char c5 = 1;
                cArr4[1] = c4;
                char c6 = (char) (iArr[i12 + 1] >> 16);
                cArr4[i8] = c6;
                char c7 = (char) iArr[i12 + 1];
                cArr4[3] = c7;
                pngBadCharsetException.PngjException = (c3 << 16) + c4;
                pngBadCharsetException.PngjBadCrcException = (c6 << 16) + c7;
                com.d.e.PngBadCharsetException.values(iArr5);
                $10 = ($11 + 125) % 128;
                int i14 = 0;
                while (i14 < 16) {
                    $11 = ($10 + 49) % 128;
                    int i15 = pngBadCharsetException.PngjException ^ iArr5[i14];
                    pngBadCharsetException.PngjException = i15;
                    int PngjBadCrcException = com.d.e.PngBadCharsetException.PngjBadCrcException(i15);
                    Object[] objArr5 = new Object[4];
                    objArr5[3] = pngBadCharsetException;
                    objArr5[i8] = pngBadCharsetException;
                    objArr5[c5] = Integer.valueOf(PngjBadCrcException);
                    objArr5[0] = pngBadCharsetException;
                    Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-2104166611);
                    if (PngjBadSignature4 == null) {
                        c = c5;
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (2786 - (ViewConfiguration.getTouchSlop() >> 8)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 36, 785 - (ViewConfiguration.getScrollBarSize() >> 8), 2122029718, false, $$g(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, cls, Object.class, Object.class});
                    } else {
                        c = c5;
                    }
                    int intValue; try { intValue = ((Integer) ((Method) PngjBadSignature4).invoke(null, objArr5)).intValue(); } catch (Exception _e) { throw new RuntimeException(_e); }
                    pngBadCharsetException.PngjException = pngBadCharsetException.PngjBadCrcException;
                    pngBadCharsetException.PngjBadCrcException = intValue;
                    i14++;
                    c5 = c;
                }
                char c8 = c5;
                int i16 = pngBadCharsetException.PngjException;
                int i17 = pngBadCharsetException.PngjBadCrcException;
                pngBadCharsetException.PngjException = i17;
                pngBadCharsetException.PngjBadCrcException = i16;
                int i18 = i16 ^ iArr5[16];
                pngBadCharsetException.PngjBadCrcException = i18;
                int i19 = i17 ^ iArr5[17];
                pngBadCharsetException.PngjException = i19;
                cArr4[0] = (char) (i19 >>> 16);
                cArr4[c8] = (char) i19;
                cArr4[i8] = (char) (i18 >>> 16);
                cArr4[3] = (char) i18;
                com.d.e.PngBadCharsetException.values(iArr5);
                int i20 = pngBadCharsetException.values;
                cArr3[i20 * 2] = cArr4[0];
                cArr3[(i20 * 2) + 1] = cArr4[c8];
                cArr3[(i20 * 2) + 2] = cArr4[i8];
                cArr3[(i20 * 2) + 3] = cArr4[3];
                int i21 = i8;
                Object[] objArr6 = new Object[i21];
                objArr6[c8] = pngBadCharsetException;
                objArr6[0] = pngBadCharsetException;
                Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-800662452);
                if (PngjBadSignature5 == null) {
                    PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) TextUtils.getTrimmedLength(BuildConfig.FLAVOR), 22 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), 29 - (ViewConfiguration.getPressedStateDuration() >> 16), 749318647, false, "E", new Class[]{Object.class, Object.class});
                }
                try { ((Method) PngjBadSignature5).invoke(null, objArr6); } catch (Exception _e) { throw new RuntimeException(_e); }
                i8 = i21;
                c2 = 0;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(byte b, short s, int i, Object[] objArr) {
            int i2;
            int i3;
            int i4;
            int i10;
            int i5 = 39 - s;
            int i6 = 118 - (i * 38);
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[19 - b];
            int i7 = 18 - b;
            if (bArr == null) {
                int i8 = i7;
                int i9 = i5;
                i10 = 0;
                int i11 = i9 + (-i8) + 5;
                i2 = i5 + 1;
                i3 = i11;
                i4 = i10;
                bArr2[i4] = (byte) i3;
                i10 = i4 + 1;
                if (i4 == i7) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i8 = bArr[i2];
                int i12 = i2;
                i9 = i3;
                i5 = i12;
                int i112 = i9 + (-i8) + 5;
                i2 = i5 + 1;
                i3 = i112;
                i4 = i10;
                bArr2[i4] = (byte) i3;
                i10 = i4 + 1;
                if (i4 == i7) {
                }
            } else {
                i2 = i5;
                i3 = i6;
                i4 = 0;
                bArr2[i4] = (byte) i3;
                i10 = i4 + 1;
                if (i4 == i7) {
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void c(int i, int i2, byte b, Object[] objArr) {
            int i3;
            int i4;
            int i5 = 97 - (i2 * 17);
            int i6 = 20 - b;
            byte[] bArr = $$d;
            int i7 = 23 - (i * 19);
            byte[] bArr2 = new byte[i6];
            if (bArr == null) {
                byte[] bArr3 = bArr;
                i4 = 0;
                int i8 = i6;
                i7++;
                i5 = (i8 + (-i5)) - 1;
                bArr = bArr3;
                i3 = i4;
                i4 = i3 + 1;
                bArr2[i3] = (byte) i5;
                if (i4 == i6) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                byte b2 = bArr[i7];
                byte[] bArr4 = bArr;
                i8 = i5;
                i5 = b2;
                bArr3 = bArr4;
                i7++;
                i5 = (i8 + (-i5)) - 1;
                bArr = bArr3;
                i3 = i4;
                i4 = i3 + 1;
                bArr2[i3] = (byte) i5;
                if (i4 == i6) {
                }
            } else {
                i3 = 0;
                i4 = i3 + 1;
                bArr2[i3] = (byte) i5;
                if (i4 == i6) {
                }
            }
        }

        public static void init$0() {
            $$a = new byte[]{55, -94, 20, 114, -25, 12, 2, 45, -26, 2, 38, -42, 20, 35, -46, 26, 3, -6, 1, 16, -1, 6, 26, -6, -4, 21, -9, -25, 12, 2, 42, -46, 26, 3, -6, 1, 16, -1, 6, 26, -6, -4, 21, 27, -18};
            $$b = 57;
        }

        public static void init$1() {
            $$d = new byte[]{64, -114, 47, -55, -18, 8, 4, 53, -52, 50, -35, -31, 6, -4, 36, -52, 20, -3, -12, -5, 10, -7, 0, -31, 6, -4, 39, -32, -4, 32, -48, 14, 29, -52, 20, -3, -12, -5, 10, -7, 0};
            $$e = 232;
        }

        public static void init$2() {
            $$c = new byte[]{39, 24, -8, 15};
            $$f = 188;
        }

        @Override // com.identy.d.PngjBadCrcException
        public final /* synthetic */ void values() {
            try {
                com.identy.e1.values(new Object[]{Enroll4FActivity.this.onErrorResponse}, com.identy.i.PngjPrematureEnding.values(), com.identy.i.PngjPrematureEnding.values(), -431637600, com.identy.i.PngjPrematureEnding.values(), 431637601, com.identy.i.PngjPrematureEnding.values());
                IdentySdk identySdk = IdentySdk.getInstance();
                Enroll4FActivity enroll4FActivity = Enroll4FActivity.this;
                FingerDetectionMode fingerDetectionMode = enroll4FActivity.PngjExceptionInternal;
                HashMap hashMap = enroll4FActivity.valueOf;
                com.identy.e1 e1Var = enroll4FActivity.onErrorResponse;
                long j = e1Var.toString;
                long j2 = e1Var.Enroll2IndexActivity;
                int i = e1Var.getEncryptedTemplates;
                byte[] PngjPrematureEnding = e1Var.PngjPrematureEnding();
                com.identy.e1 e1Var2 = Enroll4FActivity.this.onErrorResponse;
                identySdk.a(fingerDetectionMode, hashMap, j, j2, 0L, i, PngjPrematureEnding, e1Var2.setFoundMatchingTemplates + e1Var2.Enroll2IndexActivity, e1Var2.closeDialog, e1Var2.getHeight, e1Var2.ERRORS);
                valueOf = (values + 119) % 128;
            } catch (Exception unused) {
            }
            com.identy.e1 e1Var3 = Enroll4FActivity.this.onErrorResponse;
            if (e1Var3 != null) {
                e1Var3.valueOf();
                values = (valueOf + 5) % 128;
            }
            try {
                org.camera.preview.PngjBadCrcException pngjBadCrcException = Enroll4FActivity.this.Action;
                if (pngjBadCrcException != null) {
                    pngjBadCrcException.PngjException();
                }
            } catch (Exception unused2) {
            }
            try {
                if (IdentySdk.getInstance().isDisplayPrints()) {
                    Enroll4FActivity.this.runOnUiThread(new valueOf());
                    valueOf = (values + 83) % 128;
                    return;
                }
                if (!IdentySdk.getInstance().v()) {
                    if (!IdentySdk.getInstance().isDisplayMoveNextDialog()) {
                        Enroll4FActivity.this.Action();
                        return;
                    } else {
                        Enroll4FActivity.this.Attempt();
                        return;
                    }
                }
                Enroll4FActivity enroll4FActivity2 = Enroll4FActivity.this;
                Enroll4FActivity enroll4FActivity3 = Enroll4FActivity.this;
                enroll4FActivity2.getPadSub1 = new com.identy.ui.c.PngjOutputException(enroll4FActivity3, enroll4FActivity3.getQualityScore, enroll4FActivity3.PngjExceptionInternal, (FingerDetectionMode) FingerActivity.PngjException(com.identy.a.PngjException.values(), -388390624, new Object[]{enroll4FActivity3}, com.identy.a.PngjException.values(), 388390631, com.identy.a.PngjException.values(), com.identy.a.PngjException.values()));
                Enroll4FActivity.this.getPadSub1.show();
            } catch (Exception unused3) {
            }
        }
    }

    public class valueOf implements getPadSub3B15685$PngjException {
        public valueOf() {
        }

        @Override // com.d.e.a.c.getPadSub3B15685$PngjException
        public final void PngjBadCrcException(int i, int i2) {
            if (i != i2) {
                Enroll4FActivity.this.finish();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$i(short s, byte b, byte b2) {
        int i;
        int i2;
        int i3 = (b2 * 2) + 1;
        int i4 = (s * 4) + 107;
        int i5 = b + 4;
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            byte[] bArr3 = bArr;
            i2 = 0;
            int i6 = i5;
            i4 += -i5;
            i5 = i6;
            bArr = bArr3;
            i = i2;
            i2 = i + 1;
            int i7 = i5 + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            byte b3 = bArr[i7];
            byte[] bArr4 = bArr;
            i6 = i7;
            i5 = b3;
            bArr3 = bArr4;
            i4 += -i5;
            i5 = i6;
            bArr = bArr3;
            i = i2;
            i2 = i + 1;
            int i72 = i5 + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            int i722 = i5 + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
            }
        }
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        values = 0;
        getFingerPrintQualityScore = 1;
        PngjBadCrcException = -4778347802716894974L;
    }

    private static void b(int i, short s, int i2, Object[] objArr) {
        int i3 = s + 4;
        byte[] bArr = $$a;
        int i4 = 118 - (i2 * 38);
        byte[] bArr2 = new byte[19 - i];
        int i5 = 18 - i;
        int i6 = -1;
        if (bArr == null) {
            i4 = i5 + (-i4) + 5;
            bArr = bArr;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i4;
            i3++;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i4 = i4 + (-bArr[i3]) + 5;
            bArr = bArr;
            i6 = i7;
        }
    }

    private static void c(String str, int i, Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $11 = ($10 + 17) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = null;
        }
        com.d.e.ComDeA aVar = new com.d.e.ComDeA();
        char[] values2 = com.d.e.ComDeA.values(PngjBadCrcException ^ 8332534422373704609L, cArr, i);
        aVar.PngjBadSignature = 4;
        while (true) {
            int i2 = aVar.PngjBadSignature;
            if (i2 >= values2.length) {
                objArr[0] = new String(values2, 4, values2.length - 4);
                return;
            }
            $11 = ($10 + 117) % 128;
            int i3 = i2 - 4;
            aVar.PngjBadCrcException = i3;
            try {
                Object[] objArr2 = {Long.valueOf(values2[i2] ^ values2[i2 % 4]), Long.valueOf(i3), Long.valueOf(PngjBadCrcException)};
                Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1668670198);
                if (PngjBadSignature2 == null) {
                    char rgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                    int i4 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 28;
                    int i5 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1;
                    Class cls = Long.TYPE;
                    PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(rgb, i4, i5, 1617260721, false, "o", new Class[]{cls, cls, cls});
                }
                values2[i2] = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {aVar, aVar};
                Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1405973094);
                if (PngjBadSignature3 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (14830 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 27 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0), KeyEvent.normalizeMetaState(0) + 721, -1356718115, false, $$i(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) PngjBadSignature3).invoke(null, objArr3);
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
        $$a = new byte[]{44, 12, -115, -112, 26, -6, -4, 21, -9, -25, 12, 2, 45, -26, 2, 38, -42, 20, 35, -46, 26, 3, -6, 1, 16, -1, 6, -25, 12, 2, 42, -46, 26, 3, -6, 1, 16, -1, 6};
        $$b = 154;
    }

    public static void init$1() {
        $$c = new byte[]{105, 69, 94, -3};
        $$f = 29;
    }

    @Override // com.identy.FingerActivity, com.identy.d.PngjBadSignature
    public final void PngjBadSignature(List<HashMap<Pair<Hand, Finger>, com.identy.IdentyA>> list, boolean z, boolean z2, HashMap<Pair<Hand, Finger>, Float> hashMap) {
        int i = getFingerPrintQualityScore + 63;
        values = i % 128;
        int i2 = i % 2;
        super.PngjBadSignature(list, z, z2, hashMap);
        if (i2 != 0) {
            int i3 = 14 / 0;
        }
        int i4 = getFingerPrintQualityScore + 61;
        values = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 99 / 0;
        }
    }

    @Override // com.identy.FingerActivity, com.identy.d.PngjBadSignature
    public void PngjException(HashMap<Pair<Hand, Finger>, com.identy.IdentyA> hashMap, HashMap<Pair<Hand, Finger>, com.identy.IdentyA> hashMap2, Bitmap bitmap, boolean z, boolean z2) {
        values = (getFingerPrintQualityScore + 31) % 128;
        super.PngjException(hashMap, hashMap2, bitmap, z, z2);
        if (!z) {
            int i = values + 29;
            getFingerPrintQualityScore = i % 128;
            if (i % 2 == 0) {
                int i2 = 42 / 0;
                return;
            }
            return;
        }
        if (this.getAsHighestSecurityLevelReached) {
            this.valueOf.clear();
            this.valueOf.putAll(hashMap);
            this.onErrorResponse.PngjException(R.string.id_processing);
            new getAsHighestSecurityLevelReached(this, new PngjBadSignature(hashMap2)).PngjException(this.valueOf, com.identy.e1.PngjInputException);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0335  */
    @Override // com.identy.FingerActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void attachBaseContext(Context context) {
        long j;
        int intValue = 0;
        Object[] PngjException$1eba2e16 = null;
        int i;
        int i2;
        super.attachBaseContext(context);
        Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
        int i3 = 0;
        if (PngjBadSignature2 == null) {
            char c = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 14830);
            int i4 = 28 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int red = Color.red(0) + 721;
            byte[] bArr = $$a;
            byte b = bArr[23];
            Object[] objArr = new Object[1];
            b((byte) (b - 1), (byte) (-bArr[6]), b, objArr);
            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c, i4, red, -815159504, false, (String) objArr[0], null);
        }
        long j2; try { j2 = ((Field) PngjBadSignature2).getLong(null); } catch (Exception _e) { throw new RuntimeException(_e); }
        try {
            try {
                if (j2 != -1) {
                    values = (getFingerPrintQualityScore + 75) % 128;
                    long j3 = j2 + 4611686018427387864L;
                    j = 0;
                    Object[] objArr2 = new Object[1];
                    c("ꍝ덀ꌼ馍填\u0d49圻⢠া昆\uf2ff˻\uf62a첈ꜹﷲ岀饴姗坈ऀ某\uf253˖\uf782챴", (ViewConfiguration.getPressedStateDuration() >> 16) + 1, objArr2);
                    Class<?> cls = Class.forName((String) objArr2[0]);
                    Object[] objArr3 = new Object[1];
                    c("묯넹뭊鯶匶ؑ싥뵼ᇐ摳獵靛\uee52컣갣栉䓢鬓办", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr3);
                    if (j3 >= ((Long) cls.getDeclaredMethod((String) objArr3[0], null).invoke(null, null)).longValue()) {
                        Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                        if (PngjBadSignature3 == null) {
                            char c2 = (char) (14831 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 28;
                            int defaultSize = View.getDefaultSize(0, 0) + 721;
                            byte b2 = $$a[26];
                            Object[] objArr4 = new Object[1];
                            b(b2, (byte) (b2 | 16), $$a[23], objArr4);
                            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c2, pressedStateDuration, defaultSize, -779023007, false, (String) objArr4[0], null);
                        }
                        Object[] objArr5 = (Object[]) ((Field) PngjBadSignature3).get(null);
                        PngjException$1eba2e16 = new Object[]{new int[]{0}, new int[1], 0, new int[]{0}};
                        int i5 = ((int[]) objArr5[3])[0];
                        int i6 = ((int[]) objArr5[0])[0];
                        String[] strArr = (String[]) objArr5[2];
                        int i7 = ~System.identityHashCode(this);
                        int c3 = defpackage.a.c((~((-188508661) | i7)) | (-846057314), 68, ((~((-809600514) | i7)) * (-68)) + ((((~(0 | 188508660)) | ((~((-36456801) | i7)) | (-998109174))) * (-68)) - 1496765879), -1517060756);
                        int i8 = c3 ^ (c3 << 13);
                        int i9 = i8 ^ (i8 >>> 17);
                        ((int[]) PngjException$1eba2e16[1])[0] = i9 ^ (i9 << 5);
                        i = ((int[]) PngjException$1eba2e16[0])[0];
                        i2 = ((int[]) PngjException$1eba2e16[3])[0];
                        if (i2 != i) {
                            values = (getFingerPrintQualityScore + 19) % 128;
                            Object[] objArr6 = {new int[]{0}, new int[1], 0, new int[]{0}};
                            int i10 = ((int[]) PngjException$1eba2e16[1])[0];
                            int i11 = ((int[]) PngjException$1eba2e16[3])[0];
                            int i12 = ((int[]) PngjException$1eba2e16[0])[0];
                            String[] strArr2 = (String[]) PngjException$1eba2e16[2];
                            int elapsedRealtime = (int) SystemClock.elapsedRealtime();
                            int d = defpackage.a.d((~((~elapsedRealtime) | 416972789)) | (-1008060054), 381, (((-604340225) | elapsedRealtime) * (-381)) + 1907606806, -1674608640, i10);
                            int i13 = d ^ (d << 13);
                            int i14 = i13 ^ (i13 >>> 17);
                            ((int[]) objArr6[1])[0] = i14 ^ (i14 << 5);
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        String[] strArr3 = (String[]) PngjException$1eba2e16[2];
                        if (strArr3 != null) {
                            values = (getFingerPrintQualityScore + 83) % 128;
                            while (i3 < strArr3.length) {
                                int i15 = getFingerPrintQualityScore + 7;
                                values = i15 % 128;
                                if (i15 % 2 != 0) {
                                    arrayList.add(strArr3[i3]);
                                    i3 += 23;
                                } else {
                                    arrayList.add(strArr3[i3]);
                                    i3++;
                                }
                            }
                        }
                        throw new RuntimeException(String.valueOf(i2));
                    }
                } else {
                    j = 0;
                }
                Object[] objArr7 = new Object[1];
                c("ꍝ덀ꌼ馍填\u0d49圻⢠া昆\uf2ff˻\uf62a첈ꜹﷲ岀饴姗坈ऀ某\uf253˖\uf782챴", 1 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                Object[] objArr8 = new Object[1];
                c("묯넹뭊鯶匶ؑ싥뵼ᇐ摳獵靛\uee52컣갣栉䓢鬓办", 1 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr8);
                Long valueOf2 = Long.valueOf(((Long) cls2.getDeclaredMethod((String) objArr8[0], null).invoke(null, null)).longValue());
                Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
                if (PngjBadSignature4 == null) {
                    char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 14831);
                    int axisFromString = 27 - MotionEvent.axisFromString(BuildConfig.FLAVOR);
                    int lastIndexOf = TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) + 722;
                    byte[] bArr2 = $$a;
                    byte b3 = bArr2[23];
                    Object[] objArr9 = new Object[1];
                    b((byte) (b3 - 1), (byte) (-bArr2[6]), b3, objArr9);
                    PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(modifierMetaStateMask, axisFromString, lastIndexOf, -815159504, false, (String) objArr9[0], null);
                }
                ((Field) PngjBadSignature4).set(null, valueOf2);
                i = ((int[]) PngjException$1eba2e16[0])[0];
                i2 = ((int[]) PngjException$1eba2e16[3])[0];
                if (i2 != i) {
                }
            } catch (Exception unused) {
                throw new RuntimeException();
            }
            Object[] objArr10 = {1302159083};
            Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1439412966);
            if (PngjBadSignature5 == null) {
                PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((-1) - ExpandableListView.getPackedPositionChild(j)), 24 - (ViewConfiguration.getScrollDefaultDelay() >> 16), View.MeasureSpec.getSize(0) + 697, 1457201313, false, null, new Class[]{Integer.TYPE});
            }
            PngjException$1eba2e16 = arid.a.valueOf.PngjException$1eba2e16(intValue, ((Constructor) PngjBadSignature5).newInstance(objArr10), -1517060756);
            Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
            if (PngjBadSignature6 == null) {
                char c4 = (char) (14830 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                int rgb = (-16777188) - Color.rgb(0, 0, 0);
                int indexOf = TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 722;
                byte b4 = $$a[26];
                Object[] objArr11 = new Object[1];
                b(b4, (byte) (b4 | 16), $$a[23], objArr11);
                PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c4, rgb, indexOf, -779023007, false, (String) objArr11[0], null);
            }
            ((Field) PngjBadSignature6).set(null, PngjException$1eba2e16);
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
        try {
        Object[] objArr12 = new Object[1];
        c("䮀䠑䯪拓츺鬊⾈倀\ue122鵒撹稛ỿ㞄ㄇ蕸둗戢쾅\u2fe0", (ViewConfiguration.getJumpTapTimeout() >> 16) + 1, objArr12);
        Class<?> cls3 = Class.forName((String) objArr12[0]);
        Object[] objArr13 = new Object[1];
        c("\ue204ꙅ\ue26d貂\ue27f띜甜છ䣼猃䣺ₗ띔\ud99fᵱ\udff2ᷣ豭\ue3d2畳", -((byte) KeyEvent.getModifierMetaStateMask()), objArr13);
        intValue = ((Integer) cls3.getMethod((String) objArr13[0], Object.class).invoke(null, this)).intValue();
        } catch (Exception _e) { throw new RuntimeException(_e); }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Object[] objArr = {this, 1, new valueOf()};
            Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1578525895);
            if (PngjBadSignature2 == null) {
                char packedPositionChild = (char) (14829 - ExpandableListView.getPackedPositionChild(0L));
                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 28;
                int i = 722 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                byte[] bArr = $$a;
                byte b = (byte) (bArr[1] + 1);
                byte b2 = bArr[25];
                Object[] objArr2 = new Object[1];
                b(b, b2, (byte) (b2 + 1), objArr2);
                PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(packedPositionChild, pressedStateDuration, i, 1560737410, false, (String) objArr2[0], new Class[]{Context.class, Integer.TYPE, getPadSub3B15685$PngjException.class});
            }
            ((Method) PngjBadSignature2).invoke(null, objArr);
            values = (getFingerPrintQualityScore + 67) % 128;
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onPause() {
        int i = values + 17;
        getFingerPrintQualityScore = i % 128;
        int i2 = i % 2;
        super.onPause();
        if (i2 == 0) {
            throw null;
        }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onResume() {
        int i = values + 89;
        getFingerPrintQualityScore = i % 128;
        int i2 = i % 2;
        super.onResume();
        if (i2 == 0) {
            int i3 = 76 / 0;
        }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onStart() {
        getFingerPrintQualityScore = (values + 35) % 128;
        super.onStart();
        int i = getFingerPrintQualityScore + 101;
        values = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.identy.FingerActivity
    public void values(Bundle bundle) {
        super.values(bundle);
        try {
            try {
                this.onErrorResponse = new getOveralTimetaken(this, this, this.PngjExceptionInternal, IdentySdk.getInstance().u(), this.PngjUnsupportedException, true);
                int i = values + 107;
                getFingerPrintQualityScore = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
        }
    }
}
