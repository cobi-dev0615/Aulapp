package com.identy;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ExpandableListView;
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
public class Enroll2IndexActivity extends FingerActivity {
    private static  byte[] $$a = null;
    private static  int $$b = 0;
    private static  byte[] $$c = null;
    private static  int $$f = 0;
    private static int $10;
    private static int $11;
    private static int[] PngjBadCrcException;
    private static int getFingerPrintQualityScore;
    private static int getScore;
    private int valueOf = 0;
    final HashMap values = new HashMap();

    public class PngjBadSignature implements com.identy.d.PngjBadCrcException {
        public static int PngjBadSignature;
        public static int PngjException;
        private /* synthetic */ HashMap PngjBadCrcException;
        final /* synthetic */ HashMap values;

        public class values implements Runnable {
            public values() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (FingerActivity.PngjPrematureEnding) {
                    Enroll2IndexActivity enroll2IndexActivity = Enroll2IndexActivity.this;
                    PngjBadSignature pngjBadSignature = PngjBadSignature.this;
                    Enroll2IndexActivity enroll2IndexActivity2 = Enroll2IndexActivity.this;
                    enroll2IndexActivity.getPadSub1 = new com.identy.ui.c.Action(enroll2IndexActivity2, enroll2IndexActivity2.values, pngjBadSignature.values, enroll2IndexActivity2.getQualityScore);
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                    layoutParams.copyFrom(Enroll2IndexActivity.this.getPadSub1.getWindow().getAttributes());
                    ((ViewGroup.LayoutParams) layoutParams).width = -1;
                    Enroll2IndexActivity.this.getPadSub1.show();
                }
            }
        }

        public PngjBadSignature(HashMap hashMap, HashMap hashMap2) {
            this.PngjBadCrcException = hashMap;
            this.values = hashMap2;
        }

        public static int PngjException() {
            int i = PngjException;
            int i2 = i % 7072498;
            PngjException = i + 1;
            if (i2 != 0) {
                return PngjBadSignature;
            }
            int elapsedRealtime = (int) SystemClock.elapsedRealtime();
            PngjBadSignature = elapsedRealtime;
            return elapsedRealtime;
        }

        @Override // com.identy.d.PngjBadCrcException
        public final /* synthetic */ void values() {
            try {
                com.identy.e1.values(new Object[]{Enroll2IndexActivity.this.onErrorResponse}, com.identy.i.PngjPrematureEnding.values(), com.identy.i.PngjPrematureEnding.values(), -431637600, com.identy.i.PngjPrematureEnding.values(), 431637601, com.identy.i.PngjPrematureEnding.values());
                IdentySdk identySdk = IdentySdk.getInstance();
                Enroll2IndexActivity enroll2IndexActivity = Enroll2IndexActivity.this;
                FingerDetectionMode fingerDetectionMode = enroll2IndexActivity.PngjExceptionInternal;
                HashMap hashMap = this.PngjBadCrcException;
                com.identy.e1 e1Var = enroll2IndexActivity.onErrorResponse;
                long j = e1Var.toString;
                long j2 = e1Var.Enroll2IndexActivity;
                int i = e1Var.getEncryptedTemplates;
                byte[] PngjPrematureEnding = e1Var.PngjPrematureEnding();
                com.identy.e1 e1Var2 = Enroll2IndexActivity.this.onErrorResponse;
                identySdk.a(fingerDetectionMode, hashMap, j, j2, 0L, i, PngjPrematureEnding, e1Var2.setFoundMatchingTemplates + e1Var2.Enroll2IndexActivity, e1Var2.closeDialog, e1Var2.getHeight, e1Var2.ERRORS);
            } catch (Exception unused) {
            }
            Enroll2IndexActivity.this.onErrorResponse.valueOf();
            try {
                Enroll2IndexActivity.this.Action.PngjException();
            } catch (Exception unused2) {
            }
            try {
                if (IdentySdk.getInstance().isDisplayPrints()) {
                    Enroll2IndexActivity.this.runOnUiThread(new values());
                    return;
                }
                if (!IdentySdk.getInstance().v()) {
                    if (IdentySdk.getInstance().isDisplayMoveNextDialog()) {
                        Enroll2IndexActivity.this.Attempt();
                        return;
                    } else {
                        Enroll2IndexActivity.this.Action();
                        return;
                    }
                }
                Enroll2IndexActivity enroll2IndexActivity2 = Enroll2IndexActivity.this;
                Enroll2IndexActivity enroll2IndexActivity3 = Enroll2IndexActivity.this;
                enroll2IndexActivity2.getPadSub1 = new com.identy.ui.c.PngjOutputException(enroll2IndexActivity3, enroll2IndexActivity3.getQualityScore, enroll2IndexActivity3.PngjExceptionInternal, (FingerDetectionMode) FingerActivity.PngjException(com.identy.a.PngjException.values(), -388390624, new Object[]{enroll2IndexActivity3}, com.identy.a.PngjException.values(), 388390631, com.identy.a.PngjException.values(), com.identy.a.PngjException.values()));
                Enroll2IndexActivity.this.getPadSub1.show();
            } catch (Exception unused3) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$i(byte b, short s, byte b2) {
        int i;
        int i2;
        int i3 = 122 - (b2 * 57);
        int i4 = (s * 3) + 4;
        int i5 = 1 - (b * 4);
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            byte[] bArr3 = bArr;
            i2 = 0;
            int i6 = i3;
            int i7 = i4;
            int i8 = i7 + 1;
            i3 = (-i4) + i6;
            i4 = i8;
            bArr = bArr3;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i5) {
                return new String(bArr2, 0);
            }
            int i9 = i3;
            i7 = i4;
            i4 = bArr[i4];
            bArr3 = bArr;
            i6 = i9;
            int i82 = i7 + 1;
            i3 = (-i4) + i6;
            i4 = i82;
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
        getScore = 0;
        getFingerPrintQualityScore = 1;
        PngjBadCrcException = new int[]{-924351201, -1106973654, 1143762103, -1821322160, -1774739959, -302507186, 1811182261, 1323374828, 1467256000, 443263771, 2147443810, 661840416, -700867680, -1241477401, -1258074301, 1793593735, 1308789689, -190756068};
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, short s2, Object[] objArr) {
        int i;
        int i2;
        int i3 = (b * 2) + 80;
        byte[] bArr = $$a;
        int i4 = s + 4;
        int i5 = 19 - (s2 * 6);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i6 = i5;
            i2 = 0;
            i3 = i3 + (-i6) + 5;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            i4++;
            if (i2 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i6 = bArr[i4];
            i3 = i3 + (-i6) + 5;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            i4++;
            if (i2 == i5) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            i4++;
            if (i2 == i5) {
            }
        }
    }

    private static void c(int[] iArr, int i, Object[] objArr) {
        int i2;
        float f;
        int i3;
        int i4;
        int i5;
        char[] cArr;
        long j;
        int i6;
        float f2;
        int i7;
        int i8;
        com.d.e.PngBadCharsetException pngBadCharsetException = new com.d.e.PngBadCharsetException();
        char[] cArr2 = new char[4];
        int i9 = 2;
        char[] cArr3 = new char[iArr.length * 2];
        int[] iArr2 = PngjBadCrcException;
        Class cls = Integer.TYPE;
        float f3 = 0.0f;
        int i10 = 16;
        int i11 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i12 = 0;
            while (i12 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i12])};
                    Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1618428774);
                    if (PngjBadSignature2 == null) {
                        i6 = i9;
                        f2 = f3;
                        byte b = (byte) i11;
                        i7 = i10;
                        byte b2 = b;
                        i8 = i11;
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getPressedStateDuration() >> 16), (PointF.length(f3, f3) > f3 ? 1 : (PointF.length(f3, f3) == f3 ? 0 : -1)) + 31, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1381, -1667748131, false, $$i(b, b2, b2), new Class[]{cls});
                    } else {
                        i6 = i9;
                        f2 = f3;
                        i7 = i10;
                        i8 = i11;
                    }
                    iArr3[i12] = ((Integer) ((Method) PngjBadSignature2).invoke(null, objArr2)).intValue();
                    i12++;
                    i9 = i6;
                    f3 = f2;
                    i10 = i7;
                    i11 = i8;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();

                    if (cause == null) {

                        throw new RuntimeException(th);

                    }

                    throw new RuntimeException(cause);
                }
            }
            i2 = i9;
            f = f3;
            i3 = i10;
            i4 = i11;
            i5 = 1618428774;
            $10 = ($11 + 55) % 128;
            iArr2 = iArr3;
        } else {
            i2 = 2;
            f = 0.0f;
            i3 = 16;
            i4 = 0;
            i5 = 1618428774;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = PngjBadCrcException;
        long j2 = 0;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i13 = i4;
            while (i13 < length3) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i13])};
                Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i5);
                if (PngjBadSignature3 == null) {
                    j = j2;
                    byte b3 = (byte) i4;
                    byte b4 = b3;
                    cArr = cArr2;
                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ExpandableListView.getPackedPositionGroup(j2), 32 - (ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)), KeyEvent.normalizeMetaState(i4) + 1381, -1667748131, false, $$i(b3, b4, b4), new Class[]{cls});
                } else {
                    cArr = cArr2;
                    j = j2;
                }
                try { iArr6[i13] = ((Integer) ((Method) PngjBadSignature3).invoke(null, objArr3)).intValue(); } catch (Exception _e) { throw new RuntimeException(_e); }
                i13++;
                j2 = j;
                cArr2 = cArr;
                i4 = 0;
            }
            iArr5 = iArr6;
        }
        char[] cArr4 = cArr2;
        long j3 = j2;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        pngBadCharsetException.values = 0;
        while (true) {
            int i14 = pngBadCharsetException.values;
            if (i14 >= iArr.length) {
                objArr[0] = new String(cArr3, 0, i);
                return;
            }
            $10 = ($11 + 29) % 128;
            int i15 = iArr[i14];
            char c = (char) (i15 >> 16);
            cArr4[0] = c;
            char c2 = (char) i15;
            cArr4[1] = c2;
            char c3 = (char) (iArr[i14 + 1] >> 16);
            cArr4[i2] = c3;
            char c4 = (char) iArr[i14 + 1];
            cArr4[3] = c4;
            pngBadCharsetException.PngjException = (c << 16) + c2;
            pngBadCharsetException.PngjBadCrcException = (c3 << 16) + c4;
            com.d.e.PngBadCharsetException.values(iArr4);
            $10 = ($11 + 37) % 128;
            int i16 = 0;
            while (i16 < i3) {
                int i17 = pngBadCharsetException.PngjException ^ iArr4[i16];
                pngBadCharsetException.PngjException = i17;
                int PngjBadCrcException2 = com.d.e.PngBadCharsetException.PngjBadCrcException(i17);
                Object[] objArr4 = new Object[4];
                objArr4[3] = pngBadCharsetException;
                objArr4[i2] = pngBadCharsetException;
                objArr4[1] = Integer.valueOf(PngjBadCrcException2);
                objArr4[0] = pngBadCharsetException;
                Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-2104166611);
                if (PngjBadSignature4 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (2786 - View.combineMeasuredStates(0, 0)), 36 - View.combineMeasuredStates(0, 0), 785 - (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)), 2122029718, false, $$i(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, cls, Object.class, Object.class});
                }
                int intValue; try { intValue = ((Integer) ((Method) PngjBadSignature4).invoke(null, objArr4)).intValue(); } catch (Exception _e) { throw new RuntimeException(_e); }
                pngBadCharsetException.PngjException = pngBadCharsetException.PngjBadCrcException;
                pngBadCharsetException.PngjBadCrcException = intValue;
                i16++;
                i3 = 16;
            }
            int i18 = pngBadCharsetException.PngjException;
            int i19 = pngBadCharsetException.PngjBadCrcException;
            pngBadCharsetException.PngjException = i19;
            pngBadCharsetException.PngjBadCrcException = i18;
            int i20 = i18 ^ iArr4[16];
            pngBadCharsetException.PngjBadCrcException = i20;
            int i21 = i19 ^ iArr4[17];
            pngBadCharsetException.PngjException = i21;
            cArr4[0] = (char) (i21 >>> 16);
            cArr4[1] = (char) i21;
            cArr4[i2] = (char) (i20 >>> 16);
            cArr4[3] = (char) i20;
            com.d.e.PngBadCharsetException.values(iArr4);
            int i22 = pngBadCharsetException.values;
            cArr3[i22 * 2] = cArr4[0];
            cArr3[(i22 * 2) + 1] = cArr4[1];
            cArr3[(i22 * 2) + 2] = cArr4[i2];
            cArr3[(i22 * 2) + 3] = cArr4[3];
            int i23 = i2;
            Object[] objArr5 = new Object[i23];
            objArr5[1] = pngBadCharsetException;
            objArr5[0] = pngBadCharsetException;
            Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-800662452);
            if (PngjBadSignature5 == null) {
                i3 = 16;
                PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((ViewConfiguration.getZoomControlsTimeout() > j3 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j3 ? 0 : -1)) - 1), (ViewConfiguration.getPressedStateDuration() >> 16) + 22, (ViewConfiguration.getLongPressTimeout() >> 16) + 29, 749318647, false, "E", new Class[]{Object.class, Object.class});
            } else {
                i3 = 16;
            }
            try { ((Method) PngjBadSignature5).invoke(null, objArr5); } catch (Exception _e) { throw new RuntimeException(_e); }
            i2 = i23;
        }
    }

    public static void init$0() {
        $$a = new byte[]{100, 91, -82, 96, -25, 12, 2, 45, -26, 2, 38, -42, 20, 35, -46, 26, 3, -6, 1, 16, -1, 6, -25, 12, 2, 42, -46, 26, 3, -6, 1, 16, -1, 6};
        $$b = 120;
    }

    public static void init$1() {
        $$c = new byte[]{105, 69, 94, -3};
        $$f = 148;
    }

    @Override // com.identy.FingerActivity, com.identy.d.PngjBadSignature
    public final void PngjBadSignature(List<HashMap<Pair<Hand, Finger>, com.identy.IdentyA>> list, boolean z, boolean z2, HashMap<Pair<Hand, Finger>, Float> hashMap) {
        int i = getScore;
        getFingerPrintQualityScore = (i + 123) % 128;
        this.valueOf = 0;
        if (z) {
            this.valueOf = 1;
            super.PngjBadSignature(list, z, z2, hashMap);
        } else {
            getFingerPrintQualityScore = (i + 97) % 128;
            super.PngjBadSignature(list, z, z2, hashMap);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        0 = com.identy.Enroll2IndexActivity.getScore + 35;
        com.identy.Enroll2IndexActivity.getFingerPrintQualityScore = 0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if ((0 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        0 = 40 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0024, code lost:
    
        if (0 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (0 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0038, code lost:
    
        if (0.getAsHighestSecurityLevelReached != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
    
        0.values.clear();
        0.values.putAll(0);
        0.onErrorResponse.PngjException(com.identy.R.string.id_processing);
        new com.identy.getAsHighestSecurityLevelReached(0, new com.identy.Enroll2IndexActivity.PngjBadSignature(0, 0, 0)).PngjException(0.values, com.identy.e1.PngjInputException);
     */
    @Override // com.identy.FingerActivity, com.identy.d.PngjBadSignature
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void PngjException(HashMap<Pair<Hand, Finger>, com.identy.IdentyA> hashMap, HashMap<Pair<Hand, Finger>, com.identy.IdentyA> hashMap2, Bitmap bitmap, boolean z, boolean z2) {
        throw new UnsupportedOperationException("Method not decompiled");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x034f  */
    @Override // com.identy.FingerActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void attachBaseContext(Context context) {
        int i;
        char c;
        char c2;
        long j;
        int intValue = 0;
        Object[] PngjBadCrcException$52c725b = null;
        Object[] objArr;
        int i2;
        int i3;
        super.attachBaseContext(context);
        Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
        int i4 = 0;
        if (PngjBadSignature2 == null) {
            char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 14831);
            int gidForName = Process.getGidForName(BuildConfig.FLAVOR) + 29;
            int modifierMetaStateMask = 720 - ((byte) KeyEvent.getModifierMetaStateMask());
            byte[] bArr = $$a;
            byte b = (byte) (bArr[18] - 1);
            byte b2 = bArr[20];
            i = 864471691;
            Object[] objArr2 = new Object[1];
            b(b, b2, (byte) (b2 + 1), objArr2);
            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(packedPositionChild, gidForName, modifierMetaStateMask, -815159504, false, (String) objArr2[0], null);
        } else {
            i = 864471691;
        }
        long j2; try { j2 = ((Field) PngjBadSignature2).getLong(null); } catch (Exception _e) { throw new RuntimeException(_e); }
        try {
            try {
                if (j2 != -1) {
                    long j3 = j2 + 4611686018427387922L;
                    c = 20;
                    c2 = 18;
                    Object[] objArr3 = new Object[1];
                    c(new int[]{1937646966, -165643002, 987231136, -655128927, 1776123400, 1580183253, 1844845655, 1008513266, -1300390554, 715141007, -1557838493, 990685495}, 22 - View.resolveSizeAndState(0, 0, 0), objArr3);
                    Class<?> cls = Class.forName((String) objArr3[0]);
                    j = 0;
                    Object[] objArr4 = new Object[1];
                    c(new int[]{-350278666, 813102565, -2055201792, -1772840947, -2118542015, -362178076, -1849065235, 1107289316}, 15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr4);
                    if (j3 >= ((Long) cls.getDeclaredMethod((String) objArr4[0], null).invoke(null, null)).longValue()) {
                        Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                        if (PngjBadSignature3 == null) {
                            char c3 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 14830);
                            int size = 28 - View.MeasureSpec.getSize(0);
                            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 721;
                            byte b3 = $$a[18];
                            byte b4 = (byte) (b3 - 1);
                            Object[] objArr5 = new Object[1];
                            b(b4, (byte) (b4 | 17), b3, objArr5);
                            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c3, size, keyRepeatDelay, -779023007, false, (String) objArr5[0], null);
                        }
                        Object[] objArr6 = (Object[]) ((Field) PngjBadSignature3).get(null);
                        objArr = new Object[]{new int[]{0}, new int[1], 0, new int[]{0}};
                        int i5 = ((int[]) objArr6[3])[0];
                        int i6 = ((int[]) objArr6[0])[0];
                        String[] strArr = (String[]) objArr6[2];
                        int identityHashCode = System.identityHashCode(this);
                        int c4 = defpackage.a.c((~((~identityHashCode) | (-106513))) | 38803781, 576, (((~((-497934353) | identityHashCode)) | 497827840) * 576) + 2125019669, -1316411669);
                        int i7 = c4 ^ (c4 << 13);
                        int i8 = i7 ^ (i7 >>> 17);
                        ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
                        i2 = ((int[]) objArr[0])[0];
                        i3 = ((int[]) objArr[3])[0];
                        if (i3 == i2) {
                            ArrayList arrayList = new ArrayList();
                            String[] strArr2 = (String[]) objArr[2];
                            if (strArr2 != null) {
                                while (i4 < strArr2.length) {
                                    int i9 = getScore + 21;
                                    getFingerPrintQualityScore = i9 % 128;
                                    if (i9 % 2 == 0) {
                                        arrayList.add(strArr2[i4]);
                                        i4 += 65;
                                    } else {
                                        arrayList.add(strArr2[i4]);
                                        i4++;
                                    }
                                }
                            }
                            throw new RuntimeException(String.valueOf(i3));
                        }
                        getScore = (getFingerPrintQualityScore + 35) % 128;
                        Object[] objArr7 = {new int[]{0}, new int[1], 0, new int[]{0}};
                        int i10 = ((int[]) objArr[1])[0];
                        int i11 = ((int[]) objArr[3])[0];
                        int i12 = ((int[]) objArr[0])[0];
                        String[] strArr3 = (String[]) objArr[2];
                        int i13 = (int) Runtime.getRuntime().totalMemory();
                        int i14 = ~i13;
                        int i15 = (((~(853949972 | i14)) | 134332737) * (-1188)) + 66003287;
                        int i16 = (~(i13 | (-853949973))) | 134332737;
                        int i17 = ~(180616001 | i14);
                        int c5 = defpackage.a.c((~(i14 | (-853949973))) | 807666708 | i17, 594, ((i16 | i17) * 594) + i15, i10);
                        int i18 = c5 ^ (c5 << 13);
                        int i19 = i18 ^ (i18 >>> 17);
                        ((int[]) objArr7[1])[0] = i19 ^ (i19 << 5);
                        return;
                    }
                } else {
                    c = 20;
                    c2 = 18;
                    j = 0;
                }
                Object[] objArr8 = new Object[1];
                c(new int[]{1937646966, -165643002, 987231136, -655128927, 1776123400, 1580183253, 1844845655, 1008513266, -1300390554, 715141007, -1557838493, 990685495}, 22 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(new int[]{-350278666, 813102565, -2055201792, -1772840947, -2118542015, -362178076, -1849065235, 1107289316}, 15 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr9);
                Long valueOf = Long.valueOf(((Long) cls2.getDeclaredMethod((String) objArr9[0], null).invoke(null, null)).longValue());
                Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i);
                if (PngjBadSignature4 == null) {
                    char packedPositionType = (char) (14830 - ExpandableListView.getPackedPositionType(j));
                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 28;
                    int packedPositionType2 = 721 - ExpandableListView.getPackedPositionType(j);
                    byte[] bArr2 = $$a;
                    byte b5 = (byte) (bArr2[c2] - 1);
                    byte b6 = bArr2[c];
                    Object[] objArr10 = new Object[1];
                    b(b5, b6, (byte) (b6 + 1), objArr10);
                    PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(packedPositionType, windowTouchSlop, packedPositionType2, -815159504, false, (String) objArr10[0], null);
                }
                ((Field) PngjBadSignature4).set(null, valueOf);
                objArr = PngjBadCrcException$52c725b;
                i2 = ((int[]) objArr[0])[0];
                i3 = ((int[]) objArr[3])[0];
                if (i3 == i2) {
                }
            } catch (Exception unused) {
                throw new RuntimeException();
            }
            Object[] objArr11 = {1528413843};
            Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1439412966);
            if (PngjBadSignature5 == null) {
                PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), Color.red(0) + 24, 696 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0'), 1457201313, false, null, new Class[]{Integer.TYPE});
            }
            PngjBadCrcException$52c725b = (Object[]) org.c.a.values$values.PngjBadCrcException$52c725b(intValue, ((Constructor) PngjBadSignature5).newInstance(objArr11));
            Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
            if (PngjBadSignature6 == null) {
                char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 14830);
                int jumpTapTimeout = 28 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                int threadPriority = 721 - ((Process.getThreadPriority(0) + 20) >> 6);
                byte b7 = $$a[c2];
                byte b8 = (byte) (b7 - 1);
                Object[] objArr12 = new Object[1];
                b(b8, (byte) (b8 | 17), b7, objArr12);
                PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(maxKeyCode, jumpTapTimeout, threadPriority, -779023007, false, (String) objArr12[0], null);
            }
            ((Field) PngjBadSignature6).set(null, PngjBadCrcException$52c725b);
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
        try {
        Object[] objArr13 = new Object[1];
        c(new int[]{155833484, -766790118, -1804259995, 1196741573, -1100295407, -917697114, -1490213639, 942890872}, ExpandableListView.getPackedPositionGroup(j) + 16, objArr13);
        Class<?> cls3 = Class.forName((String) objArr13[0]);
        Object[] objArr14 = new Object[1];
        c(new int[]{425499607, -1580448679, -1133630788, -2113699779, 2099968855, 1531750131, -217347101, 866688627}, 17 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)), objArr14);
        intValue = ((Integer) cls3.getMethod((String) objArr14[0], Object.class).invoke(null, this)).intValue();
        } catch (Exception _e) { throw new RuntimeException(_e); }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        getScore = (getFingerPrintQualityScore + 9) % 128;
        super.onCreate(bundle);
        this.valueOf = 0;
        getScore = (getFingerPrintQualityScore + 53) % 128;
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onPause() {
        getScore = (getFingerPrintQualityScore + 31) % 128;
        super.onPause();
        int i = getScore + 95;
        getFingerPrintQualityScore = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onResume() {
        getFingerPrintQualityScore = (getScore + 79) % 128;
        super.onResume();
        int i = getFingerPrintQualityScore + 49;
        getScore = i % 128;
        if (i % 2 != 0) {
            int i2 = 81 / 0;
        }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onStart() {
        getFingerPrintQualityScore = (getScore + 59) % 128;
        super.onStart();
        int i = getFingerPrintQualityScore + 77;
        getScore = i % 128;
        if (i % 2 != 0) {
            int i2 = 39 / 0;
        }
    }

    @Override // com.identy.FingerActivity
    public void values(Bundle bundle) {
        super.values(bundle);
        try {
            try {
                this.onErrorResponse = new setFingers(this, this, this.PngjExceptionInternal, IdentySdk.getInstance().u(), this.PngjUnsupportedException);
                int i = getFingerPrintQualityScore + 17;
                getScore = i % 128;
                if (i % 2 != 0) {
                    int i2 = 79 / 0;
                }
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
        }
    }
}
