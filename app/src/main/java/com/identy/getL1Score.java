package com.identy;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.Toast;
import co.ceduladigital.sdk.x5;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.face.ModuleDescriptor;
import com.identy.enums.Finger;
import com.identy.enums.FingerDetectionMode;
import com.identy.enums.Hand;
import com.identy.ui.c.getFingerPrintQualityScore;
import com.karumi.dexter.BuildConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import org.c.a.PngjBadCrcException;

/* loaded from: classes2.dex */
final class getL1Score extends getL3Score {
    private static  byte[] $$g = null;
    private static  int $$h = 0;
    private static  byte[] $$p = null;
    private static  int $$q = 0;
    private static  byte[] $$s = null;
    private static  int $$t = 0;
    private static int $10;
    private static int $11;
    private static int destroy;
    private static char getServerRequest;
    private static char[] pfkrolGetQuality;
    private static int pfkrolfinalizeF;

    public class PngjBadCrcException implements Runnable {

        public class values implements Animation.AnimationListener {
            final /* synthetic */ ImageView values;

            public class valueOf implements Runnable {
                public static int PngjException;
                public static int valueOf;

                public valueOf() {
                }

                public static int PngjBadSignature() {
                    int i = PngjException;
                    int i2 = i % 8607650;
                    PngjException = i + 1;
                    if (i2 != 0) {
                        return valueOf;
                    }
                    int myTid = Process.myTid();
                    valueOf = myTid;
                    return myTid;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    values.this.values.clearAnimation();
                    values.this.values.setVisibility(8);
                }
            }

            public values(ImageView imageView) {
                this.values = imageView;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                getL1Score.this.Action.runOnUiThread(new valueOf());
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }
        }

        public PngjBadCrcException() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            org.c.a.PngjBadCrcException pngjBadCrcException = getL1Score.this.Capture2TActivity;
            if (pngjBadCrcException != null) {
                ViewGroup.LayoutParams layoutParams = pngjBadCrcException.getLayoutParams();
                Activity activity = getL1Score.this.Action;
                int i = R.id.preview;
                layoutParams.height = activity.findViewById(i).getHeight();
                layoutParams.width = getL1Score.this.Action.findViewById(i).getWidth();
                getL1Score.this.Capture2TActivity.setLayoutParams(layoutParams);
                Activity activity2 = getL1Score.this.Action;
                int i2 = R.id.info_layout;
                ViewGroup.LayoutParams layoutParams2 = activity2.findViewById(i2).getLayoutParams();
                layoutParams2.height = getL1Score.this.Action.findViewById(i).getHeight();
                layoutParams2.width = getL1Score.this.Action.findViewById(i).getWidth();
                getL1Score.this.Action.findViewById(i2).setLayoutParams(layoutParams2);
                Activity activity3 = getL1Score.this.Action;
                int i3 = R.id.location_error_layout;
                ViewGroup.LayoutParams layoutParams3 = activity3.findViewById(i3).getLayoutParams();
                layoutParams3.height = getL1Score.this.Action.findViewById(i).getHeight();
                layoutParams3.width = getL1Score.this.Action.findViewById(i).getWidth();
                getL1Score.this.Action.findViewById(i3).setLayoutParams(layoutParams3);
                Activity activity4 = getL1Score.this.Action;
                int i4 = R.id.scanner_overlay;
                ViewGroup.LayoutParams layoutParams4 = activity4.findViewById(i4).getLayoutParams();
                layoutParams4.height = getL1Score.this.Action.findViewById(i).getHeight();
                layoutParams4.width = getL1Score.this.Action.findViewById(i).getWidth();
                getL1Score.this.Action.findViewById(i4).setLayoutParams(layoutParams4);
                getL1Score.this.Action.findViewById(R.id.info_layout_rol).setLayoutParams(layoutParams4);
                try {
                    if (IdentySdk.getInstance().isInlineGuide()) {
                        InlineGuideOption guideOption = IdentySdk.getInstance().getGuideOption();
                        Activity activity5 = getL1Score.this.Action;
                        int i5 = R.id.inline_guide;
                        ((ImageView) activity5.findViewById(i5)).setImageResource(R.drawable.identy_thumb_guide);
                        ImageView imageView = (ImageView) getL1Score.this.Action.findViewById(i5);
                        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                        alphaAnimation.setDuration(guideOption.getDuration());
                        alphaAnimation.setInterpolator(new LinearInterpolator());
                        alphaAnimation.setRepeatCount(guideOption.getNumberOfRepeats());
                        alphaAnimation.setRepeatMode(2);
                        ViewGroup.LayoutParams layoutParams5 = getL1Score.this.Action.findViewById(i5).getLayoutParams();
                        layoutParams5.height = getL1Score.this.Action.findViewById(i).getHeight();
                        getL1Score.this.Action.findViewById(i5).setLayoutParams(layoutParams5);
                        imageView.setVisibility(0);
                        alphaAnimation.setAnimationListener(new values(imageView));
                        imageView.startAnimation(alphaAnimation);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public class PngjBadSignature implements org.c.a.PngjBadCrcException.values {
        public PngjBadSignature() {
        }

        @Override // org.c.a.PngjBadCrcException.values
        public final void drawCallback(Canvas canvas) {
            getL1Score getl1score = getL1Score.this;
            getl1score.getL2Score.values(canvas, getl1score.getL3Score);
        }
    }

    private static String $$u(int i, byte b, short s) {
        int i2 = b * 4;
        int i3 = i + 4;
        byte[] bArr = $$s;
        int i4 = 121 - (s * 2);
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i4 += i2;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i4;
            i3++;
            if (i5 == i2) {
                return new String(bArr2, 0);
            }
            i4 += bArr[i3];
        }
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        destroy = 0;
        pfkrolfinalizeF = 1;
        pfkrolGetQuality = new char[]{318, 298, 316, 375, 307, 308, 267, 309, 282, 310, 306, 299, 314, 273, 312, 297, 707, 288, 303, 317, 301, 266, 311, 305, 304};
        getServerRequest = (char) 13510;
    }

    public getL1Score(Activity activity, com.identy.d.PngjBadSignature pngjBadSignature, FingerDetectionMode fingerDetectionMode, Finger[] fingerArr, boolean z, boolean z2) {
        super(activity, pngjBadSignature, fingerDetectionMode, fingerArr, z, z2);
    }

    private static void h(byte b, String str, int i, Object[] objArr) {
        int i2;
        char c;
        int i3;
        char c2;
        char c3;
        char c4;
        int i4;
        $10 = ($11 + 87) % 128;
        char[] charArray = str != null ? str.toCharArray() : null;
        com.d.e.PngjInputException pngjInputException = new com.d.e.PngjInputException();
        char[] cArr = pfkrolGetQuality;
        Class cls = Integer.TYPE;
        int i5 = 252968584;
        int i6 = -1;
        int i7 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                    Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i5);
                    if (PngjBadSignature2 == null) {
                        i4 = i5;
                        byte b2 = (byte) i6;
                        byte b3 = (byte) (b2 + 1);
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) TextUtils.getCapsMode(BuildConfig.FLAVOR, i7, i7), 27 - ImageFormat.getBitsPerPixel(i7), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1530, -201551053, false, $$u(b2, b3, b3), new Class[]{cls});
                    } else {
                        i4 = i5;
                    }
                    cArr2[i8] = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr2)).charValue();
                    i8++;
                    i5 = i4;
                    i6 = -1;
                    i7 = 0;
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
        int i9 = i5;
        Object[] objArr3 = {Integer.valueOf(getServerRequest)};
        Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i9);
        if (PngjBadSignature3 == null) {
            byte b4 = (byte) (-1);
            byte b5 = (byte) (b4 + 1);
            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) KeyEvent.getDeadChar(0, 0), Color.red(0) + 28, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1532, -201551053, false, $$u(b4, b5, b5), new Class[]{cls});
        }
        char charValue;
        try {
            charValue = ((Character) ((Method) PngjBadSignature3).invoke(null, objArr3)).charValue();
        } catch (Exception e_inv) {
            throw new RuntimeException(e_inv);
        }
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        char c5 = 2;
        int i10 = 1;
        if (i2 > 1) {
            pngjInputException.values = 0;
            while (true) {
                int i11 = pngjInputException.values;
                if (i11 >= i2) {
                    break;
                }
                char c6 = charArray[i11];
                pngjInputException.valueOf = c6;
                char c7 = charArray[i11 + 1];
                pngjInputException.PngjException = c7;
                if (c6 == c7) {
                    cArr3[i11] = (char) (c6 - b);
                    cArr3[i11 + 1] = (char) (c7 - b);
                    c = c5;
                    i3 = i10;
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = pngjInputException;
                    objArr4[11] = Integer.valueOf(charValue);
                    objArr4[10] = pngjInputException;
                    objArr4[9] = pngjInputException;
                    objArr4[8] = Integer.valueOf(charValue);
                    objArr4[7] = pngjInputException;
                    objArr4[6] = pngjInputException;
                    objArr4[5] = Integer.valueOf(charValue);
                    objArr4[4] = pngjInputException;
                    objArr4[3] = pngjInputException;
                    objArr4[c5] = Integer.valueOf(charValue);
                    objArr4[i10] = pngjInputException;
                    c = c5;
                    objArr4[0] = pngjInputException;
                    Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1620847519);
                    if (PngjBadSignature4 == null) {
                        c2 = '\n';
                        c3 = '\t';
                        char lastIndexOf = (char) ((-1) - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0));
                        int resolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 27;
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 1475;
                        c4 = 7;
                        byte b6 = (byte) (-1);
                        byte b7 = (byte) (b6 + 1);
                        i3 = i10;
                        String $$u = $$u(b6, b7, (byte) (b7 + 1));
                        Class cls2 = Integer.TYPE;
                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(lastIndexOf, resolveSizeAndState, scrollBarSize, 1670167002, false, $$u, new Class[]{Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class});
                    } else {
                        i3 = i10;
                        c2 = '\n';
                        c3 = '\t';
                        c4 = 7;
                    }
                    int intValue = ((Integer) ((Method) PngjBadSignature4).invoke(null, objArr4)).intValue();
                    int i12 = pngjInputException.PngjUnsupportedException;
                    if (intValue == i12) {
                        $11 = ($10 + 47) % 128;
                        Object[] objArr5 = new Object[11];
                        objArr5[c2] = pngjInputException;
                        objArr5[c3] = Integer.valueOf(charValue);
                        objArr5[8] = pngjInputException;
                        objArr5[c4] = Integer.valueOf(charValue);
                        objArr5[6] = Integer.valueOf(charValue);
                        objArr5[5] = pngjInputException;
                        objArr5[4] = pngjInputException;
                        objArr5[3] = Integer.valueOf(charValue);
                        objArr5[c] = Integer.valueOf(charValue);
                        objArr5[i3] = pngjInputException;
                        objArr5[0] = pngjInputException;
                        Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1410004713);
                        if (PngjBadSignature5 == null) {
                            char c8 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 37425);
                            int deadChar = 26 - KeyEvent.getDeadChar(0, 0);
                            int i13 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1016;
                            byte b8 = (byte) (-1);
                            byte b9 = (byte) (b8 + 1);
                            String $$u2 = $$u(b8, b9, (byte) (b9 + 2));
                            Class cls3 = Integer.TYPE;
                            PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c8, deadChar, i13, 1461347500, false, $$u2, new Class[]{Object.class, Object.class, cls3, cls3, Object.class, Object.class, cls3, cls3, Object.class, cls3, Object.class});
                        }
                        int intValue2 = ((Integer) ((Method) PngjBadSignature5).invoke(null, objArr5)).intValue();
                        int i14 = (pngjInputException.PngjBadCrcException * charValue) + pngjInputException.PngjUnsupportedException;
                        int i15 = pngjInputException.values;
                        cArr3[i15] = cArr[intValue2];
                        cArr3[i15 + 1] = cArr[i14];
                    } else {
                        int i16 = pngjInputException.PngjBadSignature;
                        int i17 = pngjInputException.PngjBadCrcException;
                        if (i16 == i17) {
                            int i18 = $11;
                            $10 = (i18 + 113) % 128;
                            int i19 = i3;
                            int C = x5.C(pngjInputException.PngjOutputException, charValue, i19, charValue);
                            pngjInputException.PngjOutputException = C;
                            int C2 = x5.C(i12, charValue, i19, charValue);
                            pngjInputException.PngjUnsupportedException = C2;
                            int i20 = (i17 * charValue) + C2;
                            int i21 = pngjInputException.values;
                            cArr3[i21] = cArr[(i16 * charValue) + C];
                            cArr3[i21 + i19] = cArr[i20];
                            $10 = (i18 + 103) % 128;
                            i3 = 1;
                        } else {
                            int i22 = (i16 * charValue) + i12;
                            int i23 = (i17 * charValue) + pngjInputException.PngjOutputException;
                            int i24 = pngjInputException.values;
                            cArr3[i24] = cArr[i22];
                            i3 = 1;
                            cArr3[i24 + 1] = cArr[i23];
                            $11 = ($10 + 113) % 128;
                        }
                    }
                }
                pngjInputException.values += 2;
                c5 = c;
                i10 = i3;
            }
        }
        int i25 = 0;
        while (i25 < i) {
            int i26 = $10 + 33;
            $11 = i26 % 128;
            if (i26 % 2 == 0) {
                cArr3[i25] = (char) (cArr3[i25] ^ 23985);
                i25 += 2;
            } else {
                cArr3[i25] = (char) (cArr3[i25] ^ 13722);
                i25++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void i(short s, short s2, short s3, Object[] objArr) {
        int i;
        int i2 = 118 - (s * 38);
        byte[] bArr = $$g;
        int i3 = (s3 * 6) + 4;
        byte[] bArr2 = new byte[s2 + 6];
        int i4 = s2 + 5;
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i5 = 0;
            int i6 = i3;
            int i7 = i3 + i2 + 5;
            i3 = i6 + 1;
            i2 = i7;
            bArr = bArr3;
            i = i5;
            bArr2[i] = (byte) i2;
            if (i == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b = bArr[i3];
            int i8 = i3;
            i3 = i2;
            i2 = b;
            i5 = i + 1;
            bArr3 = bArr;
            i6 = i8;
            int i72 = i3 + i2 + 5;
            i3 = i6 + 1;
            i2 = i72;
            bArr = bArr3;
            i = i5;
            bArr2[i] = (byte) i2;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            if (i == i4) {
            }
        }
    }

    public static void init$0() {
        $$g = new byte[]{62, 106, -83, -91, 25, -12, -2, -45, 26, -2, -38, 42, -20, -35, 46, -26, -3, 6, -1, -16, 1, -6, 25, -12, -2, -42, 46, -26, -3, 6, -1, -16, 1, -6, -26, 6, 4, -21, -27, 18, -26, 6, 4, -21, 9};
        $$h = 238;
    }

    public static void init$1() {
        $$p = new byte[]{40, -94, -119, -6, 27, 1, 5, -44, 44, 40, 3, 13, -30, 41, 13, -7, 32, 8, 17, -3, 29, 11, 7, -3, 40, 3, 13, -30, 41, 13, -7, 32, 8, 17, -3, 29, 11, 7, -3};
        $$q = 163;
    }

    public static void init$2() {
        $$s = new byte[]{93, 97, 119, -49};
        $$t = 242;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void j(byte b, short s, byte b2, Object[] objArr) {
        int i;
        int i2 = (s * 17) + 80;
        int i3 = b * 5;
        int i4 = 24 - (b2 * 20);
        byte[] bArr = $$p;
        byte[] bArr2 = new byte[21 - i3];
        int i5 = 20 - i3;
        if (bArr == null) {
            int i6 = i5;
            int i7 = i4;
            i = 0;
            int i8 = (i4 + i6) - 10;
            i4 = i7 + 1;
            i2 = i8;
            bArr2[i] = (byte) i2;
            if (i == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i++;
            i6 = bArr[i4];
            int i9 = i4;
            i4 = i2;
            i7 = i9;
            int i82 = (i4 + i6) - 10;
            i4 = i7 + 1;
            i2 = i82;
            bArr2[i] = (byte) i2;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            if (i == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x09a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0a05  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0aa9  */
    @Override // com.identy.getL3Score, com.identy.e1, android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        long j;
        char c;
        int i;
        int i2;
        Object[] PngjBadSignature$1eba2e16;
        Object[] objArr = null;
        int i3;
        int i4;
        Class<?> cls = null;
        Object[] objArr2 = null;
        Object[] objArr3;
        int i5;
        int i6;
        Context context2 = context;
        pfkrolfinalizeF = (destroy + 101) % 128;
        Object[] objArr4 = new Object[1];
        h((byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 109), "\f\u0018\u0010\u000e\u000e\u0004\u0012\u0004\u0006\u0004\u0001\u0017\u0010\u0002\u0016\u0000\u0006\t\b\u0005\r\u000b", 22 - (ViewConfiguration.getTouchSlop() >> 8), objArr4);
        String str = (String) objArr4[0];
        Object[] objArr5 = new Object[1];
        h((byte) (View.getDefaultSize(0, 0) + 70), "\u0007\f\n\u0013\u0002\u0003\u0010\t\u0004\f\u0005\u0016\u0014\t㙅", 14 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0), objArr5);
        String str2 = (String) objArr5[0];
        Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
        if (PngjBadSignature2 == null) {
            char mode = (char) (View.MeasureSpec.getMode(0) + 14830);
            int capsMode = TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 28;
            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 721;
            byte b = $$g[20];
            byte b2 = b;
            j = 0;
            byte b3 = (byte) (b - 1);
            Object[] objArr6 = new Object[1];
            i(b2, (byte) (b2 | 12), b3, objArr6);
            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(mode, capsMode, scrollBarFadeDuration, -815159504, false, (String) objArr6[0], null);
        } else {
            j = 0;
        }
        long j2 = ((Field) PngjBadSignature2).getLong(null);
        if (j2 == -1 || j2 + 4611686018427387901L < ((Long) defpackage.a.i(str, str2, null, null, null)).longValue()) {
            c = 17;
            i = 2;
            i2 = 3;
            Object[] objArr7 = new Object[1];
            h((byte) (17 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1))), "\t\u0013\u0013\r\u0002\b\f\u0018\u0001\u0004\u0016\u0010\u0000\u0015\u0000\u0007", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 15, objArr7);
            Class<?> cls2 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            h((byte) (104 - ExpandableListView.getPackedPositionGroup(j)), "\u0004\u0018\u0007\u0002\u0015\u0014\u0016\u000f\u000e\n\u0003\u0015\t\u0005\u0011\u0004", 16 - Color.blue(0), objArr8);
            int intValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr9 = {902664825};
                Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1439412966);
                if (PngjBadSignature3 == null) {
                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) View.MeasureSpec.getMode(0), TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 24, View.resolveSize(0, 0) + 697, 1457201313, false, null, new Class[]{Integer.TYPE});
                }
                PngjBadSignature$1eba2e16 = (Object[]) com.identy.ui.c.getFingerPrintQualityScore.PngjBadSignature.PngjBadSignature$1eba2e16(intValue, ((Constructor) PngjBadSignature3).newInstance(objArr9), 267851442);
                Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                if (PngjBadSignature4 == null) {
                    char red = (char) (14830 - Color.red(0));
                    int defaultSize = 28 - View.getDefaultSize(0, 0);
                    int lastIndexOf = 720 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0);
                    byte[] bArr = $$g;
                    byte b4 = bArr[20];
                    Object[] objArr10 = new Object[1];
                    i(b4, (byte) (b4 | 6), (byte) (-bArr[16]), objArr10);
                    PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(red, defaultSize, lastIndexOf, -779023007, false, (String) objArr10[0], null);
                }
                ((Field) PngjBadSignature4).set(null, PngjBadSignature$1eba2e16);
                try {
                    Long valueOf = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, null).invoke(null, null)).longValue());
                    Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
                    if (PngjBadSignature5 == null) {
                        char indexOf = (char) (14829 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0'));
                        int fadingEdgeLength = 28 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int combineMeasuredStates = View.combineMeasuredStates(0, 0) + 721;
                        byte b5 = $$g[20];
                        byte b6 = b5;
                        Object[] objArr11 = new Object[1];
                        i(b6, (byte) (b6 | 12), (byte) (b5 - 1), objArr11);
                        PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf, fadingEdgeLength, combineMeasuredStates, -815159504, false, (String) objArr11[0], null);
                    }
                    ((Field) PngjBadSignature5).set(null, valueOf);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();

                if (cause == null) {

                    throw new RuntimeException(th);

                }

                throw new RuntimeException(cause);
            }
        } else {
            Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
            if (PngjBadSignature6 == null) {
                char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 14831);
                int indexOf2 = 27 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0');
                int size = View.MeasureSpec.getSize(0) + 721;
                byte[] bArr2 = $$g;
                c = 17;
                byte b7 = bArr2[20];
                i = 2;
                i2 = 3;
                Object[] objArr12 = new Object[1];
                i(b7, (byte) (b7 | 6), (byte) (-bArr2[16]), objArr12);
                PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(modifierMetaStateMask, indexOf2, size, -779023007, false, (String) objArr12[0], null);
            } else {
                c = 17;
                i = 2;
                i2 = 3;
            }
            Object[] objArr13 = (Object[]) ((Field) PngjBadSignature6).get(null);
            PngjBadSignature$1eba2e16 = new Object[4];
            PngjBadSignature$1eba2e16[0] = new int[]{0};
            PngjBadSignature$1eba2e16[1] = new int[1];
            PngjBadSignature$1eba2e16[i2] = new int[]{0};
            int i7 = ((int[]) objArr13[i2])[0];
            int i8 = ((int[]) objArr13[0])[0];
            PngjBadSignature$1eba2e16[i] = (String[]) objArr13[i];
            int elapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i9 = ~elapsedRealtime;
            int c2 = defpackage.a.c((~(elapsedRealtime | (-285258754))) | (~(288027993 | i9)) | 743768740, 140, (((~(746537980 | i9)) | 285258753) * (-280)) + (((elapsedRealtime | 746537980) * 140) - 168424863), 267851442);
            int i10 = c2 ^ (c2 << 13);
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) PngjBadSignature$1eba2e16[1])[0] = i11 ^ (i11 << 5);
        }
        int i12 = ((int[]) PngjBadSignature$1eba2e16[0])[0];
        int i13 = ((int[]) PngjBadSignature$1eba2e16[i2])[0];
        if (i13 == i12) {
            Object[] objArr14 = new Object[4];
            objArr14[0] = new int[]{0};
            objArr14[1] = new int[1];
            objArr14[i2] = new int[]{0};
            int i14 = ((int[]) PngjBadSignature$1eba2e16[1])[0];
            int i15 = ((int[]) PngjBadSignature$1eba2e16[i2])[0];
            int i16 = ((int[]) PngjBadSignature$1eba2e16[0])[0];
            objArr14[i] = (String[]) PngjBadSignature$1eba2e16[i];
            int identityHashCode = System.identityHashCode(this);
            int i17 = ~identityHashCode;
            int c3 = defpackage.a.c((~(identityHashCode | 372274831)) | (~(i17 | (-103826055))) | (-930739920), 717, (((~((-103826055) | identityHashCode)) | (~(i17 | 372274831)) | (-930739920)) * 717) + 1859403239, i14);
            int i18 = c3 ^ (c3 << 13);
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr14[1])[0] = i19 ^ (i19 << 5);
            destroy = (pfkrolfinalizeF + 121) % 128;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) PngjBadSignature$1eba2e16[i];
            if (strArr != null) {
                for (String str3 : strArr) {
                    arrayList.add(str3);
                }
            }
            int[] iArr = new int[i13];
            int i20 = i13 - 1;
            iArr[i20] = 1;
            Toast.makeText((Context) null, iArr[((i13 * i20) % 2) - 1], 1).show();
            Object[] objArr15 = new Object[4];
            objArr15[0] = new int[]{0};
            objArr15[1] = new int[1];
            objArr15[i2] = new int[]{0};
            int i21 = ((int[]) PngjBadSignature$1eba2e16[1])[0];
            int i22 = ((int[]) PngjBadSignature$1eba2e16[i2])[0];
            int i23 = ((int[]) PngjBadSignature$1eba2e16[0])[0];
            objArr15[i] = (String[]) PngjBadSignature$1eba2e16[i];
            int c4 = defpackage.a.c(~(System.identityHashCode(this) | (-234895979)), 566, (((~((-245939947) | 0)) | 11043968) * (-566)) - 1304482731, i21);
            int i24 = c4 ^ (c4 << 13);
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr15[1])[0] = i25 ^ (i25 << 5);
        }
        Object PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1556686741);
        if (PngjBadSignature7 == null) {
            char c5 = (char) (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1));
            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 37;
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 549;
            byte b8 = $$g[20];
            byte b9 = b8;
            Object[] objArr16 = new Object[1];
            i(b9, (byte) (b9 | 12), (byte) (b8 - 1), objArr16);
            PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c5, tapTimeout, threadPriority, -1608103378, false, (String) objArr16[0], null);
        }
        long j3 = ((Field) PngjBadSignature7).getLong(null);
        try {
            if (j3 != -1) {
                int i26 = destroy + 91;
                pfkrolfinalizeF = i26 % 128;
                if (i26 % 2 != 0 ? j3 + 4611686018427387777L >= ((Long) defpackage.a.i(str, str2, null, null, null)).longValue() : j3 + 4611686018427387777L >= ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[1]).invoke(null, new Object[1])).longValue()) {
                    Object PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1434812162);
                    if (PngjBadSignature8 == null) {
                        char c6 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int resolveOpacity = Drawable.resolveOpacity(0, 0) + 37;
                        int i27 = (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 548;
                        byte b10 = $$g[20];
                        byte b11 = (byte) (b10 - 1);
                        byte b12 = b10;
                        Object[] objArr17 = new Object[1];
                        i(b11, b12, (byte) (b12 + 4), objArr17);
                        PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c6, resolveOpacity, i27, 1452666181, false, (String) objArr17[0], null);
                    }
                    Object[] objArr18 = (Object[]) ((Field) PngjBadSignature8).get(null);
                    objArr = new Object[i2];
                    objArr[0] = new int[1];
                    objArr[1] = new int[]{0};
                    objArr[i] = new int[]{0};
                    int i28 = ((int[]) objArr18[1])[0];
                    int i29 = ((int[]) objArr18[i])[0];
                    int identityHashCode2 = System.identityHashCode(this);
                    int i30 = (((~((-501851334) | identityHashCode2)) | 77660288 | (~(962391901 | identityHashCode2))) * (-754)) + 2109005938;
                    int i31 = ~((-77660289) | identityHashCode2);
                    int i32 = ~identityHashCode2;
                    int c7 = defpackage.a.c(i32 | (-501851334), 754, ((i31 | (~(1040052189 | i32))) * (-754)) + i30, -1922030223);
                    int i33 = c7 ^ (c7 << 13);
                    int i34 = i33 ^ (i33 >>> 17);
                    ((int[]) objArr[0])[0] = i34 ^ (i34 << 5);
                    Object obj = objArr[i];
                    i3 = ((int[]) obj)[0];
                    Object obj2 = objArr[1];
                    i4 = ((int[]) obj2)[0];
                    if (i4 == i3) {
                        throw new RuntimeException(String.valueOf(i4));
                    }
                    destroy = (pfkrolfinalizeF + 29) % 128;
                    Object[] objArr19 = {new int[1], new int[1], new int[1]};
                    int i35 = ((int[]) objArr[0])[0];
                    int i36 = ((int[]) obj2)[0];
                    int i37 = ((int[]) obj)[0];
                    ((int[]) objArr19[1])[0] = i36;
                    ((int[]) objArr19[2])[0] = i37;
                    int identityHashCode3 = System.identityHashCode(this);
                    int i38 = ~identityHashCode3;
                    int c8 = defpackage.a.c((~(i38 | (-932458451))) | 531784784, 217, (((~(identityHashCode3 | (-531784785))) | 395322448) * 217) + (((~((-531784785) | i38)) | (~((-932458451) | identityHashCode3))) * 217) + 2117860224, i35);
                    int i39 = c8 ^ (c8 << 13);
                    int i40 = i39 ^ (i39 >>> 17);
                    ((int[]) objArr19[0])[0] = i40 ^ (i40 << 5);
                    super.onReceive(context, intent);
                    Object PngjBadSignature9 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-175041514);
                    if (PngjBadSignature9 == null) {
                        char bitsPerPixel = (char) (31076 - ImageFormat.getBitsPerPixel(0));
                        int packedPositionGroup = 49 - ExpandableListView.getPackedPositionGroup(j);
                        int axisFromString = 1042 - MotionEvent.axisFromString(BuildConfig.FLAVOR);
                        byte b13 = $$g[20];
                        byte b14 = b13;
                        Object[] objArr20 = new Object[1];
                        i(b14, (byte) (b14 | 12), (byte) (b13 - 1), objArr20);
                        PngjBadSignature9 = com.d.e.a.PngjBadCrcException.PngjBadSignature(bitsPerPixel, packedPositionGroup, axisFromString, 159283629, false, (String) objArr20[0], null);
                    }
                    long j4 = ((Field) PngjBadSignature9).getLong(null);
                    try {
                        if (j4 != -1) {
                            destroy = (pfkrolfinalizeF + 19) % 128;
                            if (j4 + 4611686018427387880L >= ((Long) defpackage.a.i(str, str2, null, null, null)).longValue()) {
                                Object PngjBadSignature10 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1200224935);
                                if (PngjBadSignature10 == null) {
                                    char myPid = (char) ((Process.myPid() >> 22) + 31077);
                                    int mirror = 'a' - AndroidCharacter.getMirror('0');
                                    int deadChar = KeyEvent.getDeadChar(0, 0) + 1043;
                                    byte b15 = (byte) ($$g[20] - 1);
                                    Object[] objArr21 = new Object[1];
                                    i(b15, b15, $$a[c], objArr21);
                                    PngjBadSignature10 = com.d.e.a.PngjBadCrcException.PngjBadSignature(myPid, mirror, deadChar, 1150904546, false, (String) objArr21[0], null);
                                }
                                Object[] objArr22 = (Object[]) ((Field) PngjBadSignature10).get(null);
                                objArr3 = new Object[]{0, 0, new int[]{0}, new int[]{0}, new int[1]};
                                int i41 = ((int[]) objArr22[3])[0];
                                int i42 = ((int[]) objArr22[2])[0];
                                String str4 = (String) objArr22[1];
                                String str5 = (String) objArr22[0];
                                int uptimeMillis = (int) SystemClock.uptimeMillis();
                                int i43 = ~uptimeMillis;
                                int i44 = (((~((-1067868102) | i43)) | 629149700 | (~(443510731 | i43)) | (~((-4792331) | uptimeMillis))) * (-84)) + 1530768813;
                                int i45 = (~(uptimeMillis | 443510731)) | 1067868101;
                                int i46 = ~(i43 | (-443510732));
                                int c9 = defpackage.a.c(i46 | 4792330, 84, ((i45 | i46) * (-84)) + i44, -555516700);
                                int i47 = c9 ^ (c9 << 13);
                                int i48 = i47 ^ (i47 >>> 17);
                                ((int[]) objArr3[4])[0] = i48 ^ (i48 << 5);
                                i5 = ((int[]) objArr3[2])[0];
                                i6 = ((int[]) objArr3[3])[0];
                                if (i6 != i5) {
                                    Object[] objArr23 = {0, 0, new int[]{0}, new int[]{0}, new int[1]};
                                    int i49 = ((int[]) objArr3[4])[0];
                                    int i50 = ((int[]) objArr3[3])[0];
                                    int i51 = ((int[]) objArr3[2])[0];
                                    String str6 = (String) objArr3[1];
                                    String str7 = (String) objArr3[0];
                                    int d = defpackage.a.d((~System.identityHashCode(this)) | 456585199, -828, (((~(456585199 | 0)) | 167772170) * (-828)) - 2098783915, -95423552, i49);
                                    int i52 = d ^ (d << 13);
                                    int i53 = i52 ^ (i52 >>> 17);
                                    ((int[]) objArr23[4])[0] = i53 ^ (i53 << 5);
                                    return;
                                }
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add((String) objArr3[1]);
                                arrayList2.add((String) objArr3[0]);
                                int[] iArr2 = new int[i6];
                                int i54 = i6 - 1;
                                iArr2[i54] = 1;
                                Toast.makeText((Context) null, iArr2[((i6 * i54) % 2) - 1], 1).show();
                                Object[] objArr24 = {0, 0, new int[]{0}, new int[]{0}, new int[1]};
                                int i55 = ((int[]) objArr3[4])[0];
                                int i56 = ((int[]) objArr3[3])[0];
                                int i57 = ((int[]) objArr3[2])[0];
                                String str8 = (String) objArr3[1];
                                String str9 = (String) objArr3[0];
                                int identityHashCode4 = System.identityHashCode(this);
                                int c10 = defpackage.a.c((~(identityHashCode4 | 152626557)) | (~((~identityHashCode4) | (-152626558))) | (~((-471730813) | identityHashCode4)), 959, ((((~((-471730813) | 0)) | (~((-152626558) | identityHashCode4))) | (~(0 | 152626557))) * 959) - 749919436, i55);
                                int i58 = c10 ^ (c10 << 13);
                                int i59 = i58 ^ (i58 >>> 17);
                                ((int[]) objArr24[4])[0] = i59 ^ (i59 << 5);
                                return;
                            }
                        }
                        Object[] objArr25 = {context2, Integer.valueOf(((Integer) cls.getMethod((String) objArr2[0], Object.class).invoke(null, this)).intValue()), 0, -555516700};
                        byte[] bArr3 = $$p;
                        byte b16 = bArr3[5];
                        byte b17 = (byte) (b16 - 1);
                        byte b18 = b16;
                        Object[] objArr26 = new Object[1];
                        j(b17, b18, b18, objArr26);
                        Class<?> cls3 = Class.forName((String) objArr26[0]);
                        byte b19 = bArr3[5];
                        byte b20 = (byte) (b19 - 1);
                        Object[] objArr27 = new Object[1];
                        j(b19, b20, b20, objArr27);
                        String str10 = (String) objArr27[0];
                        Class cls4 = Integer.TYPE;
                        Object[] objArr28 = (Object[]) cls3.getMethod(str10, Context.class, cls4, cls4, cls4).invoke(null, objArr25);
                        if (context2 != null) {
                            Object PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1200224935);
                            if (PngjBadSignature11 == null) {
                                char absoluteGravity = (char) (31077 - Gravity.getAbsoluteGravity(0, 0));
                                int i60 = (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 48;
                                int minimumFlingVelocity = 1043 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                byte b21 = (byte) ($$g[20] - 1);
                                Object[] objArr29 = new Object[1];
                                i(b21, b21, $$a[c], objArr29);
                                PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature(absoluteGravity, i60, minimumFlingVelocity, 1150904546, false, (String) objArr29[0], null);
                            }
                            ((Field) PngjBadSignature11).set(null, objArr28);
                            try {
                                Long valueOf2 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, null).invoke(null, null)).longValue());
                                Object PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-175041514);
                                if (PngjBadSignature12 == null) {
                                    char c11 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 31078);
                                    int resolveOpacity2 = Drawable.resolveOpacity(0, 0) + 49;
                                    int offsetBefore = TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 1043;
                                    byte b22 = $$g[20];
                                    byte b23 = b22;
                                    Object[] objArr30 = new Object[1];
                                    i(b23, (byte) (b23 | 12), (byte) (b22 - 1), objArr30);
                                    PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c11, resolveOpacity2, offsetBefore, 159283629, false, (String) objArr30[0], null);
                                }
                                ((Field) PngjBadSignature12).set(null, valueOf2);
                            } catch (Exception unused2) {
                                throw new RuntimeException();
                            }
                        }
                        objArr3 = objArr28;
                        i5 = ((int[]) objArr3[2])[0];
                        i6 = ((int[]) objArr3[3])[0];
                        if (i6 != i5) {
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw new RuntimeException(th2);
                        }
                        throw new RuntimeException(cause2);
                    }
                    if (context2 != null) {
                        if (context2 instanceof ContextWrapper) {
                            int i61 = destroy + 15;
                            pfkrolfinalizeF = i61 % 128;
                            if (i61 % 2 == 0) {
                                ((ContextWrapper) context2).getBaseContext();
                                throw null;
                            }
                            if (((ContextWrapper) context2).getBaseContext() == null) {
                                context2 = null;
                            }
                        }
                        context2 = context2.getApplicationContext();
                    }
                    Object[] objArr31 = new Object[1];
                    h((byte) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 16), "\t\u0013\u0013\r\u0002\b\f\u0018\u0001\u0004\u0016\u0010\u0000\u0015\u0000\u0007", 16 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr31);
                    cls = Class.forName((String) objArr31[0]);
                    objArr2 = new Object[1];
                    h((byte) (View.combineMeasuredStates(0, 0) + 104), "\u0004\u0018\u0007\u0002\u0015\u0014\u0016\u000f\u000e\n\u0003\u0015\t\u0005\u0011\u0004", KeyEvent.normalizeMetaState(0) + 16, objArr2);
                }
            }
            Long valueOf3 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, null).invoke(null, null)).longValue());
            Object PngjBadSignature13 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1556686741);
            if (PngjBadSignature13 == null) {
                char red2 = (char) Color.red(0);
                int lastIndexOf2 = 36 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0');
                int i62 = 550 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1));
                byte b24 = $$g[20];
                byte b25 = b24;
                Object[] objArr32 = new Object[1];
                i(b25, (byte) (b25 | 12), (byte) (b24 - 1), objArr32);
                PngjBadSignature13 = com.d.e.a.PngjBadCrcException.PngjBadSignature(red2, lastIndexOf2, i62, -1608103378, false, (String) objArr32[0], null);
            }
            ((Field) PngjBadSignature13).set(null, valueOf3);
            i = 2;
            Object obj3 = objArr[i];
            i3 = ((int[]) obj3)[0];
            Object obj22 = objArr[1];
            i4 = ((int[]) obj22)[0];
            if (i4 == i3) {
            }
        } catch (Exception unused3) {
            throw new RuntimeException();
        }
        Object[] objArr33 = new Object[1];
        h((byte) (Gravity.getAbsoluteGravity(0, 0) + 16), "\t\u0013\u0013\r\u0002\b\f\u0018\u0001\u0004\u0016\u0010\u0000\u0015\u0000\u0007", TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 16, objArr33);
        Class<?> cls5 = Class.forName((String) objArr33[0]);
        Object[] objArr34 = new Object[1];
        h((byte) (103 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1))), "\u0004\u0018\u0007\u0002\u0015\u0014\u0016\u000f\u000e\n\u0003\u0015\t\u0005\u0011\u0004", 16 - (Process.myTid() >> 22), objArr34);
        int intValue2 = ((Integer) cls5.getMethod((String) objArr34[0], Object.class).invoke(null, this)).intValue();
        Object[] objArr35 = new Object[i];
        objArr35[1] = -1922030223;
        objArr35[0] = Integer.valueOf(intValue2);
        Object PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1437710995);
        if (PngjBadSignature14 == null) {
            char indexOf3 = (char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0);
            int scrollBarSize = 37 - (ViewConfiguration.getScrollBarSize() >> 8);
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 549;
            byte[] bArr4 = $$g;
            byte b26 = bArr4[20];
            Object[] objArr36 = new Object[1];
            i(b26, (byte) (b26 | 6), (byte) (-bArr4[16]), objArr36);
            String str11 = (String) objArr36[0];
            Class cls6 = Integer.TYPE;
            PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf3, scrollBarSize, touchSlop, -1453402328, false, str11, new Class[]{cls6, cls6});
        }
        objArr = (Object[]) ((Method) PngjBadSignature14).invoke(null, objArr35);
        Object PngjBadSignature15 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1434812162);
        if (PngjBadSignature15 == null) {
            char myTid = (char) (Process.myTid() >> 22);
            int minimumFlingVelocity2 = 37 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 549;
            byte b27 = $$g[20];
            byte b28 = (byte) (b27 - 1);
            byte b29 = b27;
            Object[] objArr37 = new Object[1];
            i(b28, b29, (byte) (b29 + 4), objArr37);
            PngjBadSignature15 = com.d.e.a.PngjBadCrcException.PngjBadSignature(myTid, minimumFlingVelocity2, keyRepeatTimeout, 1452666181, false, (String) objArr37[0], null);
        }
        ((Field) PngjBadSignature15).set(null, objArr);
    }

    @Override // com.identy.e1
    public final void valueOf(int i, int i2, int i3, boolean z) {
        throw new UnsupportedOperationException("Method not decompiled");
    }

}
