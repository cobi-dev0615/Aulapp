package com.identy;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
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
import com.identy.ui.c.getFingerPrintQualityScore;
import com.karumi.dexter.BuildConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.KotlinVersion;
import kotlin.io.encoding.Base64;

/* loaded from: classes2.dex */
public class CaptureRolledFingersActivity extends FingerActivity {
    private static  byte[] $$a = null;
    private static  int $$b = 0;
    private static  byte[] $$c = null;
    private static  int $$f = 0;
    private static int $10;
    private static int $11;
    private static int PngjBadCrcException;
    private static int valueOf;
    private static int values;

    public class valueOf implements Runnable {
        private /* synthetic */ HashMap PngjBadCrcException;

        public valueOf(HashMap hashMap) {
            this.PngjBadCrcException = hashMap;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (FingerActivity.PngjPrematureEnding) {
                CaptureRolledFingersActivity captureRolledFingersActivity = CaptureRolledFingersActivity.this;
                CaptureRolledFingersActivity captureRolledFingersActivity2 = CaptureRolledFingersActivity.this;
                captureRolledFingersActivity.getPadSub1 = new com.identy.ui.c.PngjBadSignature(captureRolledFingersActivity2, this.PngjBadCrcException, null, captureRolledFingersActivity2.getQualityScore);
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.copyFrom(CaptureRolledFingersActivity.this.getPadSub1.getWindow().getAttributes());
                ((ViewGroup.LayoutParams) layoutParams).width = -1;
                CaptureRolledFingersActivity.this.getPadSub1.show();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$i(int i, byte b, short s) {
        int i2;
        byte[] bArr = $$c;
        int i3 = 104 - (i * 2);
        int i4 = s * 4;
        int i5 = 3 - (b * 3);
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i3;
            i3 = i6;
            i2 = 0;
            i3 += i7;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i5++;
            i7 = bArr[i5];
            i2++;
            i3 += i7;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        }
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        PngjBadCrcException = 0;
        valueOf = 1;
        values = 97773974;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, int i3, Object[] objArr) {
        int i4;
        int i5 = 21 - (i3 * 18);
        int i6 = 80 - (i2 * 3);
        byte[] bArr = $$a;
        int i7 = i * 6;
        byte[] bArr2 = new byte[19 - i7];
        int i8 = 18 - i7;
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i9 = 0;
            int i10 = i5;
            i6 = i5 + i6 + 5;
            i5 = i10;
            bArr = bArr3;
            i4 = i9;
            int i11 = i5 + 1;
            bArr2[i4] = (byte) i6;
            if (i4 == i8) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b = bArr[i11];
            i5 = i6;
            i6 = b;
            i9 = i4 + 1;
            bArr3 = bArr;
            i10 = i11;
            i6 = i5 + i6 + 5;
            i5 = i10;
            bArr = bArr3;
            i4 = i9;
            int i112 = i5 + 1;
            bArr2[i4] = (byte) i6;
            if (i4 == i8) {
            }
        } else {
            i4 = 0;
            int i1122 = i5 + 1;
            bArr2[i4] = (byte) i6;
            if (i4 == i8) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, boolean z, String str, int i2, int i3, Object[] objArr) {
        char[] cArr;
        Throwable cause;
        char c;
        int i4;
        int i5 = $10;
        $11 = (i5 + 45) % 128;
        if (str != null) {
            $11 = (i5 + 89) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = null;
        }
        char[] cArr2 = cArr;
        com.d.e.Action action = new com.d.e.Action();
        char[] cArr3 = new char[i];
        action.valueOf = 0;
        while (true) {
            int i6 = action.valueOf;
            if (i6 >= i) {
                break;
            }
            char c2 = cArr2[i6];
            action.values = c2;
            char c3 = (char) (i3 + c2);
            cArr3[i6] = c3;
            try {
                Object[] objArr2 = {Integer.valueOf(c3), Integer.valueOf(values)};
                Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(610361420);
                if (PngjBadSignature == null) {
                    char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                    int normalizeMetaState = 28 - KeyEvent.normalizeMetaState(0);
                    int indexOf = 1531 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR);
                    byte b = (byte) ($$c[3] + 1);
                    i4 = -743328348;
                    byte b2 = b;
                    c = 1;
                    String $$i = $$i(b, b2, b2);
                    Class cls = Integer.TYPE;
                    PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(packedPositionType, normalizeMetaState, indexOf, -661778953, false, $$i, new Class[]{cls, cls});
                } else {
                    c = 1;
                    i4 = -743328348;
                }
                cArr3[i6] = ((Character) ((Method) PngjBadSignature).invoke(null, objArr2)).charValue();
                Object[] objArr3 = new Object[2];
                objArr3[c] = action;
                objArr3[0] = action;
                Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i4);
                if (PngjBadSignature2 == null) {
                    PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), Drawable.resolveOpacity(0, 0) + 40, 190 - (ViewConfiguration.getWindowTouchSlop() >> 8), 794744863, false, "j", new Class[]{Object.class, Object.class});
                }
                ((Method) PngjBadSignature2).invoke(null, objArr3);
            } catch (Throwable th) {

                Throwable cause2 = th.getCause();

                if (cause2 != null) {

                    throw new RuntimeException(cause2);

                }

                throw new RuntimeException(th);

            }
        }
        if (i2 > 0) {
            $10 = ($11 + 13) % 128;
            action.PngjException = i2;
            char[] cArr4 = new char[i];
            System.arraycopy(cArr3, 0, cArr4, 0, i);
            int i7 = action.PngjException;
            System.arraycopy(cArr4, 0, cArr3, i - i7, i7);
            int i8 = action.PngjException;
            System.arraycopy(cArr4, i8, cArr3, 0, i - i8);
        }
        if (z) {
            char[] cArr5 = new char[i];
            action.valueOf = 0;
            while (true) {
                int i9 = action.valueOf;
                if (i9 >= i) {
                    break;
                }
                cArr5[i9] = cArr3[(i - i9) - 1];
                Object[] objArr4 = {action, action};
                Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-743328348);
                if (PngjBadSignature3 == null) {
                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 40, View.MeasureSpec.makeMeasureSpec(0, 0) + 190, 794744863, false, "j", new Class[]{Object.class, Object.class});
                }
                ((Method) PngjBadSignature3).invoke(null, objArr4);
            }
            cArr3 = cArr5;
        }
        objArr[0] = new String(cArr3);
    }

    public static void init$0() {
        $$a = new byte[]{97, -73, Base64.padSymbol, -61, 25, -12, -2, -45, 26, -2, -38, 42, -20, -35, 46, -26, -3, 6, -1, -16, 1, -6, 25, -12, -2, -42, 46, -26, -3, 6, -1, -16, 1, -6};
        $$b = 149;
    }

    public static void init$1() {
        $$c = new byte[]{34, -96, 112, -1};
        $$f = 160;
    }

    @Override // com.identy.FingerActivity, com.identy.d.PngjBadSignature
    public void PngjException(HashMap<Pair<Hand, Finger>, com.identy.IdentyA> hashMap, HashMap<Pair<Hand, Finger>, com.identy.IdentyA> hashMap2, Bitmap bitmap, boolean z, boolean z2) {
        int i = PngjBadCrcException + 109;
        valueOf = i % 128;
        if (i % 2 == 0) {
            super.PngjException(hashMap, hashMap2, bitmap, z, z2);
            int i2 = 48 / 0;
            if (!z) {
                return;
            }
        } else {
            super.PngjException(hashMap, hashMap2, bitmap, z, z2);
            if (!z) {
                return;
            }
        }
        if (this.getAsHighestSecurityLevelReached) {
            try {
                e1.values(new Object[]{this.onErrorResponse}, com.identy.i.PngjPrematureEnding.values(), com.identy.i.PngjPrematureEnding.values(), -431637600, com.identy.i.PngjPrematureEnding.values(), 431637601, com.identy.i.PngjPrematureEnding.values());
                IdentySdk identySdk = IdentySdk.getInstance();
                FingerDetectionMode fingerDetectionMode = this.PngjExceptionInternal;
                e1 e1Var = this.onErrorResponse;
                long j = e1Var.toString;
                long j2 = e1Var.Enroll2IndexActivity;
                int i3 = e1Var.getEncryptedTemplates;
                byte[] PngjPrematureEnding = e1Var.PngjPrematureEnding();
                e1 e1Var2 = this.onErrorResponse;
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
                    runOnUiThread(new valueOf(hashMap));
                } else if (IdentySdk.getInstance().v()) {
                    com.identy.ui.c.PngjUnsupportedException pngjUnsupportedException = new com.identy.ui.c.PngjUnsupportedException(this, this.getQualityScore, this.PngjExceptionInternal, (FingerDetectionMode) FingerActivity.PngjException(com.identy.a.PngjException.values(), -388390624, new Object[]{this}, com.identy.a.PngjException.values(), 388390631, com.identy.a.PngjException.values(), com.identy.a.PngjException.values()));
                    this.getPadSub1 = pngjUnsupportedException;
                    pngjUnsupportedException.show();
                } else if (IdentySdk.getInstance().isDisplayMoveNextDialog()) {
                    valueOf = (PngjBadCrcException + 37) % 128;
                    Attempt();
                } else {
                    Action();
                }
            } catch (Exception e3) {
                try {
                    if (LibSettings.isSaveCaptured()) {
                        int i4 = valueOf + 55;
                        PngjBadCrcException = i4 % 128;
                        if (i4 % 2 != 0) {
                            e3.getMessage();
                            int i5 = 16 / 0;
                        } else {
                            e3.getMessage();
                        }
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x03b1  */
    @Override // com.identy.FingerActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void attachBaseContext(Context context) {
        int i;
        char c;
        int intValue;
        Object[] PngjBadSignature$1eba2e16;
        int i2;
        int i3;
        valueOf = (PngjBadCrcException + 37) % 128;
        super.attachBaseContext(context);
        Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
        if (PngjBadSignature == null) {
            char combineMeasuredStates = (char) (14830 - View.combineMeasuredStates(0, 0));
            int offsetBefore = TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 28;
            int rgb = (-16776495) - Color.rgb(0, 0, 0);
            byte b = $$a[20];
            byte b2 = (byte) (b - 1);
            Object[] objArr = new Object[1];
            b(b2, b2, b, objArr);
            PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(combineMeasuredStates, offsetBefore, rgb, -815159504, false, (String) objArr[0], null);
        }
        long j = ((Field) PngjBadSignature).getLong(null);
        try {
            try {
                if (j != -1) {
                    long j2 = j + 4611686018427387755L;
                    i = 864471691;
                    Object[] objArr2 = new Object[1];
                    c(View.MeasureSpec.makeMeasureSpec(0, 0) + 22, false, "\u0016\u0010\u0011\u0002\n￠\t\f\u0000\b\ufffe\u000b\u0001\u000f\f\u0006\u0001ￋ\f\u0010ￋ\ufff0", (KeyEvent.getMaxKeyCode() >> 16) + 10, 254 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr2);
                    Class<?> cls = Class.forName((String) objArr2[0]);
                    c = 20;
                    Object[] objArr3 = new Object[1];
                    c(14 - ImageFormat.getBitsPerPixel(0), true, "\ufffa\u0005\ufffe\ufffe\u0006\u0002\r\u0005\ufffa\ufffe￫�\ufffe\f\t", (ViewConfiguration.getFadingEdgeLength() >> 16) + 3, 259 - (ViewConfiguration.getTapTimeout() >> 16), objArr3);
                    if (j2 >= ((Long) cls.getDeclaredMethod((String) objArr3[0], null).invoke(null, null)).longValue()) {
                        Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                        if (PngjBadSignature2 == null) {
                            char scrollDefaultDelay = (char) (14830 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                            int indexOf = TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 28;
                            int resolveSize = 721 - View.resolveSize(0, 0);
                            byte b3 = $$a[20];
                            byte b4 = (byte) (b3 - 1);
                            Object[] objArr4 = new Object[1];
                            b(b3, b4, b4, objArr4);
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(scrollDefaultDelay, indexOf, resolveSize, -779023007, false, (String) objArr4[0], null);
                        }
                        Object[] objArr5 = (Object[]) ((Field) PngjBadSignature2).get(null);
                        PngjBadSignature$1eba2e16 = new Object[]{new int[]{0}, new int[1], 0, new int[]{0}};
                        int i4 = ((int[]) objArr5[3])[0];
                        int i5 = ((int[]) objArr5[0])[0];
                        String[] strArr = (String[]) objArr5[2];
                        int startUptimeMillis = (int) Process.getStartUptimeMillis();
                        int i6 = ~startUptimeMillis;
                        int c2 = defpackage.a.c((~(startUptimeMillis | 207795389)) | (~(i6 | (-826770585))) | (~(826770584 | startUptimeMillis)), 831, ((~((-203436070) | startUptimeMillis)) * (-1662)) + (((~((-207795390) | i6)) | (~(1030206653 | startUptimeMillis))) * (-831)) + 2062254448, -1024524190);
                        int i7 = c2 ^ (c2 << 13);
                        int i8 = i7 ^ (i7 >>> 17);
                        ((int[]) PngjBadSignature$1eba2e16[1])[0] = i8 ^ (i8 << 5);
                        i2 = ((int[]) PngjBadSignature$1eba2e16[0])[0];
                        i3 = ((int[]) PngjBadSignature$1eba2e16[3])[0];
                        if (i3 != i2) {
                            Object[] objArr6 = {new int[]{0}, new int[1], 0, new int[]{0}};
                            int i9 = ((int[]) PngjBadSignature$1eba2e16[1])[0];
                            int i10 = ((int[]) PngjBadSignature$1eba2e16[3])[0];
                            int i11 = ((int[]) PngjBadSignature$1eba2e16[0])[0];
                            String[] strArr2 = (String[]) PngjBadSignature$1eba2e16[2];
                            int identityHashCode = System.identityHashCode(this);
                            int c3 = defpackage.a.c((~(identityHashCode | 817543488)) | 217022485, 272, (((~((-817543489) | identityHashCode)) | 806369600) * (-272)) + (((~((-11173889) | (~identityHashCode))) | (~(1023392085 | identityHashCode))) * (-272)) + 1167521541, i9);
                            int i12 = c3 ^ (c3 << 13);
                            int i13 = i12 ^ (i12 >>> 17);
                            ((int[]) objArr6[1])[0] = i13 ^ (i13 << 5);
                            PngjBadCrcException = (valueOf + 83) % 128;
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        String[] strArr3 = (String[]) PngjBadSignature$1eba2e16[2];
                        if (strArr3 != null) {
                            int i14 = 0;
                            while (i14 < strArr3.length) {
                                int i15 = PngjBadCrcException + 93;
                                valueOf = i15 % 128;
                                if (i15 % 2 == 0) {
                                    arrayList.add(strArr3[i14]);
                                    i14 += com.karumi.dexter.R.styleable.AppCompatTheme_tooltipFrameBackground;
                                } else {
                                    arrayList.add(strArr3[i14]);
                                    i14++;
                                }
                            }
                        }
                        Toast.makeText((Context) null, i3 / (((i3 - 1) * i3) % 2), 0).show();
                        Object[] objArr7 = {new int[]{0}, new int[1], 0, new int[]{0}};
                        int i16 = ((int[]) PngjBadSignature$1eba2e16[1])[0];
                        int i17 = ((int[]) PngjBadSignature$1eba2e16[3])[0];
                        int i18 = ((int[]) PngjBadSignature$1eba2e16[0])[0];
                        String[] strArr4 = (String[]) PngjBadSignature$1eba2e16[2];
                        int uptimeMillis = (int) SystemClock.uptimeMillis();
                        int i19 = ~uptimeMillis;
                        int i20 = ~((-871676836) | i19);
                        int c4 = defpackage.a.c((~(uptimeMillis | (-871676836))) | (~(i19 | 871676835)), 575, (((~((-162889139) | uptimeMillis)) | (~(162889138 | i19))) * (-575)) + (((i20 | 0) * 1150) - 1135381654), i16);
                        int i21 = c4 ^ (c4 << 13);
                        int i22 = i21 ^ (i21 >>> 17);
                        ((int[]) objArr7[1])[0] = i22 ^ (i22 << 5);
                        return;
                    }
                } else {
                    i = 864471691;
                    c = 20;
                }
                Object[] objArr8 = new Object[1];
                c(Color.red(0) + 22, false, "\u0016\u0010\u0011\u0002\n￠\t\f\u0000\b\ufffe\u000b\u0001\u000f\f\u0006\u0001ￋ\f\u0010ￋ\ufff0", TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 11, (ViewConfiguration.getFadingEdgeLength() >> 16) + KotlinVersion.MAX_COMPONENT_VALUE, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c((ViewConfiguration.getTouchSlop() >> 8) + 15, true, "\ufffa\u0005\ufffe\ufffe\u0006\u0002\r\u0005\ufffa\ufffe￫�\ufffe\f\t", (ViewConfiguration.getFadingEdgeLength() >> 16) + 3, 259 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), objArr9);
                Long valueOf2 = Long.valueOf(((Long) cls2.getDeclaredMethod((String) objArr9[0], null).invoke(null, null)).longValue());
                Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i);
                if (PngjBadSignature3 == null) {
                    char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 14830);
                    int i23 = 28 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int defaultSize = 721 - View.getDefaultSize(0, 0);
                    byte b5 = $$a[c];
                    byte b6 = (byte) (b5 - 1);
                    Object[] objArr10 = new Object[1];
                    b(b6, b6, b5, objArr10);
                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(keyRepeatDelay, i23, defaultSize, -815159504, false, (String) objArr10[0], null);
                }
                ((Field) PngjBadSignature3).set(null, valueOf2);
                i2 = ((int[]) PngjBadSignature$1eba2e16[0])[0];
                i3 = ((int[]) PngjBadSignature$1eba2e16[3])[0];
                if (i3 != i2) {
                }
            } catch (Exception unused) {
                throw new RuntimeException();
            }
            Object[] objArr11 = {-887280533};
            Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1439412966);
            if (PngjBadSignature4 == null) {
                PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) Color.red(0), 24 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 697 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1457201313, false, null, new Class[]{Integer.TYPE});
            }
            PngjBadSignature$1eba2e16 = getFingerPrintQualityScore.PngjBadSignature.PngjBadSignature$1eba2e16(intValue, ((Constructor) PngjBadSignature4).newInstance(objArr11), -1024524190);
            Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
            if (PngjBadSignature5 == null) {
                char indexOf2 = (char) (TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0) + 14830);
                int packedPositionChild = 27 - ExpandableListView.getPackedPositionChild(0L);
                int rgb2 = Color.rgb(0, 0, 0) + 16777937;
                byte b7 = $$a[c];
                byte b8 = (byte) (b7 - 1);
                Object[] objArr12 = new Object[1];
                b(b7, b8, b8, objArr12);
                PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf2, packedPositionChild, rgb2, -779023007, false, (String) objArr12[0], null);
            }
            ((Field) PngjBadSignature5).set(null, PngjBadSignature$1eba2e16);
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
        Object[] objArr13 = new Object[1];
        c(16 - (ViewConfiguration.getDoubleTapTimeout() >> 16), true, "ￌ\uffff\u0014\uffff\b\u000b\u0003\u0012\u0011\u0017\ufff1ￌ\u0005\f\uffff\n", View.resolveSize(0, 0) + 5, 254 - Color.alpha(0), objArr13);
        Class<?> cls3 = Class.forName((String) objArr13[0]);
        Object[] objArr14 = new Object[1];
        c(16 - View.resolveSize(0, 0), false, "\t\ufffe\uffff\u0003\ufffe\uffff\b\u000e\u0003\u000e\u0013￢\ufffb\r\u0002\uffdd", 2 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 257 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr14);
        intValue = ((Integer) cls3.getMethod((String) objArr14[0], Object.class).invoke(null, this)).intValue();
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        View findViewById;
        int i;
        int i2 = PngjBadCrcException + 37;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            super.onCreate(bundle);
            findViewById = findViewById(R.id.middle_info_image);
            i = 1;
        } else {
            super.onCreate(bundle);
            findViewById = findViewById(R.id.middle_info_image);
            i = 0;
        }
        findViewById.setVisibility(i);
        int i3 = PngjBadCrcException + 121;
        valueOf = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onPause() {
        int i = valueOf + 113;
        PngjBadCrcException = i % 128;
        int i2 = i % 2;
        super.onPause();
        if (i2 != 0) {
            throw null;
        }
        int i3 = valueOf + 59;
        PngjBadCrcException = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onResume() {
        int i = valueOf + com.karumi.dexter.R.styleable.AppCompatTheme_tooltipFrameBackground;
        PngjBadCrcException = i % 128;
        int i2 = i % 2;
        super.onResume();
        if (i2 != 0) {
            throw null;
        }
        valueOf = (PngjBadCrcException + 51) % 128;
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onStart() {
        int i = PngjBadCrcException + 99;
        valueOf = i % 128;
        int i2 = i % 2;
        super.onStart();
        if (i2 == 0) {
            int i3 = 27 / 0;
        }
        PngjBadCrcException = (valueOf + 15) % 128;
    }

    @Override // com.identy.FingerActivity
    public void values(Bundle bundle) {
        FingerDetectionMode fingerDetectionMode;
        super.values(bundle);
        try {
            fingerDetectionMode = this.PngjExceptionInternal;
        } catch (Exception e) {
        }
        try {
            this.onErrorResponse = new getL2Score(this, this, fingerDetectionMode, new Finger[]{fingerDetectionMode.getFinger()}, IdentySdk.getInstance().u(), this.PngjUnsupportedException);
        } catch (Exception e2) {
            Exception exc = e2;
            try {
                if (LibSettings.isSaveCaptured()) {
                    exc.getMessage();
                    PngjBadCrcException = (valueOf + 85) % 128;
                    return;
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            valueOf = (PngjBadCrcException + 33) % 128;
        }
    }
}
