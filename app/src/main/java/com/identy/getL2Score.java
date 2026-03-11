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
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.identy.Enroll2IndexActivity;
import com.identy.enums.Finger;
import com.identy.enums.FingerDetectionMode;
import com.identy.enums.Hand;
import com.identy.getL2Score;
import com.karumi.dexter.BuildConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.time.DurationKt;

/* loaded from: classes2.dex */
final class getL2Score extends getL3Score {
    private static  byte[] $$g = null;
    private static  int $$h = 0;
    private static  byte[] $$p = null;
    private static  int $$q = 0;
    private static  byte[] $$s = null;
    private static  int $$t = 0;
    private static int $10;
    private static int $11;
    private static byte[] destroy;
    private static short[] getServerRequest;
    private static int pfkrolGetQuality;
    private static int pfkrolfinalize;
    private static int pfkrolfinalizeF;
    private static int ppk;
    private static int rgenerate;

    public class PngjBadCrcException implements Animation.AnimationListener {
        private /* synthetic */ ImageView valueOf;
        private /* synthetic */ Animation values;

        public PngjBadCrcException(ImageView imageView, Animation animation) {
            this.valueOf = imageView;
            this.values = animation;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void PngjBadSignature(ImageView imageView, Animation animation) {
            imageView.clearAnimation();
            imageView.setAnimation(null);
            imageView.startAnimation(animation);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            Activity activity = getL2Score.this.Action;
            final ImageView imageView = this.valueOf;
            final Animation animation2 = this.values;
            activity.runOnUiThread(new Runnable() { // from class: com.identy.e
                @Override // java.lang.Runnable
                public final void run() {
                    imageView.clearAnimation();
                    imageView.setAnimation(null);
                    imageView.startAnimation(animation2);
                }
            });
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    public class PngjBadSignature implements Animation.AnimationListener {
        private /* synthetic */ ImageView PngjBadCrcException;

        public PngjBadSignature(ImageView imageView) {
            this.PngjBadCrcException = imageView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void PngjException(ImageView imageView) {
            imageView.clearAnimation();
            imageView.setVisibility(8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            getL2Score.this.Action.runOnUiThread(new IdentyC(this.PngjBadCrcException, 3));
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    private static String $$u(short s, short s2, short s3) {
        int i = 109 - s;
        byte[] bArr = $$s;
        int i2 = s2 + 4;
        int i3 = s3 * 4;
        byte[] bArr2 = new byte[i3 + 1];
        int i4 = -1;
        if (bArr == null) {
            i += i3;
        }
        while (true) {
            i2++;
            i4++;
            bArr2[i4] = (byte) i;
            if (i4 == i3) {
                return new String(bArr2, 0);
            }
            i += bArr[i2];
        }
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        rgenerate = 0;
        ppk = 1;
        pfkrolfinalize = 1485479144;
        pfkrolfinalizeF = -961251458;
        pfkrolGetQuality = -775378469;
        destroy = new byte[]{49, 37, 56, -46, 3, 49, 42, 58, 63, -45, -42, 96, 53, -6, 15, 32, 63, 62, -53, 35, -50, -20, 16, -1, 28, 25, -24, 1, -10, -27, -30, 17, 21, -1, 45, -81, -40, -88, -63, -123, -124, -26, -64, -84, -44, -99, -20, 50, -76, -42, -118, -74, -19, 64, -74, -105, -126, 76, -122, -16, -74, -125, -14, -118, -96, 79, 79, 79, 79};
    }

    public getL2Score(Activity activity, com.identy.d.PngjBadSignature pngjBadSignature, FingerDetectionMode fingerDetectionMode, Finger[] fingerArr, boolean z, boolean z2) {
        super(activity, pngjBadSignature, fingerDetectionMode, fingerArr, z, z2);
    }

    public static /* synthetic */ Object PngjBadCrcException(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = ~i4;
        int i11 = ~(i10 | i8);
        int i12 = i9 | i11 | (~(i5 | i4 | i2));
        int i13 = i7 | i10;
        int i14 = (~i13) | i9 | i11;
        int i15 = (~(i2 | i4)) | (~(i13 | i8)) | (~(i5 | i2));
        int i16 = ((-427515960) * i3) + ((-298151579) * i6) + i5 + i4 + i;
        int i17 = i16 * i16;
        int i18 = (1109590016 * i17) + (423624704 * i3) + ((-16252928) * i6) + (1449656320 * i) + (1881159201 * i15) + ((-532648894) * i14) + ((-1881159201) * i12) + ((-431502880) * i4) + (i5 * (-431502880)) + 875560960;
        int i19 = i15 * 423;
        int i20 = i * (-2003554617);
        int i21 = i6 * 1812671363;
        int i22 = i3 * (-1519508360);
        int i23 = i17 * (-1288372224);
        int i24 = i23 + i22 + i21 + i20 + i19 + (i14 * 846) + (i12 * (-423)) + (i4 * (-2003555040)) + ((i5 * (-2003555040)) - 1632655964);
        return ((i24 * i24) * (-1796407296)) + i18 != 1 ? values(objArr) : valueOf(objArr);
    }

    private void PngjBadSignature(Runnable runnable) {
        org.c.a.PngjBadCrcException pngjBadCrcException;
        IdentyD dVar;
        int i = rgenerate + 9;
        ppk = i % 128;
        if (i % 2 == 0) {
            org.c.a.PngjBadCrcException pngjBadCrcException2 = (org.c.a.PngjBadCrcException) this.Action.findViewById(R.id.tracking_overlay);
            this.Capture2TActivity = pngjBadCrcException2;
            pngjBadCrcException2.setLayerType(1, null);
            this.Action.runOnUiThread(runnable);
            pngjBadCrcException = this.Capture2TActivity;
            dVar = new IdentyD(this, 0);
        } else {
            org.c.a.PngjBadCrcException pngjBadCrcException3 = (org.c.a.PngjBadCrcException) this.Action.findViewById(R.id.tracking_overlay);
            this.Capture2TActivity = pngjBadCrcException3;
            pngjBadCrcException3.setLayerType(1, null);
            this.Action.runOnUiThread(runnable);
            pngjBadCrcException = this.Capture2TActivity;
            dVar = new IdentyD(this, 0);
        }
        pngjBadCrcException.valueOf = dVar;
        rgenerate = (ppk + 43) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void PngjException(Canvas canvas) {
        int i = ppk + 87;
        rgenerate = i % 128;
        if (i % 2 != 0) {
            this.getL2Score.values(canvas, this.getL3Score);
            int i2 = 53 / 0;
        } else {
            this.getL2Score.values(canvas, this.getL3Score);
        }
        ppk = (rgenerate + 87) % 128;
    }

    private void getData() {
        int i = rgenerate + 109;
        ppk = i % 128;
        try {
            if (i % 2 != 0) {
                this.Action.runOnUiThread(new IdentyC(this, 2));
            } else {
                this.Action.runOnUiThread(new IdentyC(this, 2));
                throw null;
            }
        } catch (Exception e) {
            try {
                if (LibSettings.isSaveCaptured()) {
                    e.getMessage();
                    rgenerate = (ppk + 39) % 128;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getFingerPrintQualityScore() {
        int i = ppk + 89;
        rgenerate = i % 128;
        if (i % 2 == 0) {
            this.getL1Score = (com.identy.ui.PngjBadCrcException) this.Action.findViewById(R.id.scanner_overlay);
            getPadSub3();
        } else {
            this.getL1Score = (com.identy.ui.PngjBadCrcException) this.Action.findViewById(R.id.scanner_overlay);
            getPadSub3();
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getProcessingTime() {
        int i = ppk + 91;
        rgenerate = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (this.Capture2TActivity != null) {
            getScore();
            try {
                if (IdentySdk.getInstance().isInlineGuide()) {
                    ppk = (rgenerate + 87) % 128;
                    InlineGuideOption guideOption = IdentySdk.getInstance().getGuideOption();
                    ImageView imageView = (ImageView) this.Action.findViewById(R.id.inline_guide);
                    imageView.setImageResource(R.drawable.identy_thumb_guide);
                    View findViewById = this.Action.findViewById(R.id.preview);
                    int height = findViewById.getHeight();
                    int width = findViewById.getWidth();
                    int i2 = rgenerate + 35;
                    ppk = i2 % 128;
                    if (i2 % 2 == 0) {
                        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                        layoutParams.height = height;
                        layoutParams.width = width;
                        imageView.setLayoutParams(layoutParams);
                        throw null;
                    }
                    ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                    layoutParams2.height = height;
                    layoutParams2.width = width;
                    imageView.setLayoutParams(layoutParams2);
                    imageView.setVisibility(0);
                    Animation PngjBadCrcException2 = PngjBadCrcException(guideOption);
                    PngjBadCrcException2.setAnimationListener(new PngjBadSignature(imageView));
                    imageView.startAnimation(PngjBadCrcException2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void getQualityScore() {
        this.getL1Score = (com.identy.ui.PngjBadCrcException) this.Action.findViewById(R.id.scanner_overlay);
        try {
            if (this.getL3Score || IdentySdk.getInstance().getFingerPrintDrawable() != 0) {
                return;
            }
            int i = rgenerate + 103;
            ppk = i % 128;
            if (i % 2 == 0) {
                this.getL1Score.PngjBadSignature(this.a, 3.2d, 3.2d, 3.2d);
                throw null;
            }
            this.getL1Score.PngjBadSignature(this.a, 3.2d, 3.2d, 3.2d);
            int i2 = rgenerate + 81;
            ppk = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 63 / 0;
            }
        } catch (Exception unused) {
        }
    }

    private void getScore() {
        View findViewById = this.Action.findViewById(R.id.preview);
        int height = findViewById.getHeight();
        int width = findViewById.getWidth();
        org.c.a.PngjBadCrcException pngjBadCrcException = this.Capture2TActivity;
        if (pngjBadCrcException != null) {
            ViewGroup.LayoutParams layoutParams = pngjBadCrcException.getLayoutParams();
            layoutParams.height = height;
            layoutParams.width = width;
            pngjBadCrcException.setLayoutParams(layoutParams);
        }
        View findViewById2 = this.Action.findViewById(R.id.info_layout);
        if (findViewById2 != null) {
            ViewGroup.LayoutParams layoutParams2 = findViewById2.getLayoutParams();
            layoutParams2.height = height;
            layoutParams2.width = width;
            findViewById2.setLayoutParams(layoutParams2);
        }
        View findViewById3 = this.Action.findViewById(R.id.location_error_layout);
        if (findViewById3 != null) {
            ViewGroup.LayoutParams layoutParams3 = findViewById3.getLayoutParams();
            layoutParams3.height = height;
            layoutParams3.width = width;
            findViewById3.setLayoutParams(layoutParams3);
        }
        View findViewById4 = this.Action.findViewById(R.id.scanner_overlay);
        if (findViewById4 != null) {
            ppk = (rgenerate + 25) % 128;
            ViewGroup.LayoutParams layoutParams4 = findViewById4.getLayoutParams();
            layoutParams4.height = height;
            layoutParams4.width = width;
            findViewById4.setLayoutParams(layoutParams4);
        }
        View findViewById5 = this.Action.findViewById(R.id.info_layout_rol);
        if (findViewById5 != null) {
            ViewGroup.LayoutParams layoutParams5 = findViewById5.getLayoutParams();
            layoutParams5.height = height;
            layoutParams5.width = width;
            findViewById5.setLayoutParams(layoutParams5);
        }
        rgenerate = (ppk + 55) % 128;
    }

    public static void init$0() {
        $$g = new byte[]{84, -10, -23, -36, -25, 12, 2, 45, -26, 2, 38, -42, 20, 35, -46, 26, 3, -6, 1, 16, -1, 6, 26, -6, -4, 21, 27, -18, -25, 12, 2, 42, -46, 26, 3, -6, 1, 16, -1, 6, 26, -6, -4, 21, -9};
        $$h = 97;
    }

    public static void init$1() {
        $$p = new byte[]{107, 79, -72, 70, 11, -3, -64, 58, -6, 0, 8, 5, 4, -76, 56, -3, 14, -47, 34, 4, -8, -3, 12, 0, -80, 81, -22, 10, 8, -17, -23, 22, -22, 10, 8, -17, 13};
        $$q = 207;
    }

    public static void init$2() {
        $$s = new byte[]{1, 76, -120, -61};
        $$t = 65;
    }

    private void isQualityFailed() {
        int PngjException = 0;
        PngjBadCrcException(new Object[]{this}, 0, PngjException, 0, -644123029, 644123030, 0);
    }

    private static /* synthetic */ Object values(Object[] objArr) {
        getL2Score getl2score = (getL2Score) objArr[0];
        double doubleValue = ((Number) objArr[1]).doubleValue();
        try {
            getl2score.getL2Score = new com.identy.ui.d.values(getl2score.Action, doubleValue, ((Number) objArr[2]).doubleValue(), doubleValue, 2.5d, IdentySdk.getInstance().getFingerPrintDrawable(), IdentySdk.getInstance().isDisableOuterBox(), -90, true, getl2score.a.equals(Hand.LEFT), true, getl2score.uxd565jk, getl2score.cvtyuv2bgr);
            int i = ppk + 81;
            rgenerate = i % 128;
            if (i % 2 == 0) {
                return null;
            }
            throw null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.identy.getL3Score, com.identy.e1, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        long j;
        char c;
        char c2;
        char c3;
        int i;
        float f;
        Object[] objArr;
        char c4;
        char c5;
        Object[] PngjException$1eba2e16;
        Object[] objArr2;
        Context context2 = context;
        Object[] objArr3 = new Object[1];
        h(Color.rgb(0, 0, 0) - 377282099, (short) (11 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0)), (byte) ((-127) - View.MeasureSpec.makeMeasureSpec(0, 0)), 5257 - AndroidCharacter.getMirror('0'), (-27) - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr3);
        String str = (String) objArr3[0];
        Object[] objArr4 = new Object[1];
        h((-394059311) - ExpandableListView.getPackedPositionType(0L), (short) ((-3) - (ViewConfiguration.getEdgeSlop() >> 16)), (byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 88), View.resolveSizeAndState(0, 0, 0) + 1640043630, Color.argb(0, 0, 0, 0) - 34, objArr4);
        String str2 = (String) objArr4[0];
        Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1556686741);
        if (PngjBadSignature2 == null) {
            char gidForName = (char) ((-1) - Process.getGidForName(BuildConfig.FLAVOR));
            int i2 = 37 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int modifierMetaStateMask = 548 - ((byte) KeyEvent.getModifierMetaStateMask());
            byte b = $$g[18];
            j = 0;
            c = 16;
            c2 = 21;
            Object[] objArr5 = new Object[1];
            i((byte) (b - 1), $$a[21], (byte) (b - 1), objArr5);
            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(gidForName, i2, modifierMetaStateMask, -1608103378, false, (String) objArr5[0], null);
        } else {
            j = 0;
            c = 16;
            c2 = 21;
        }
        long j2 = ((Field) PngjBadSignature2).getLong(null);
        if (j2 == -1 || j2 + 4611686018427387807L < ((Long) defpackage.a.i(str, str2, null, null, null)).longValue()) {
            c3 = 6;
            i = 5;
            Object[] objArr6 = new Object[1];
            h((-394059305) - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)), (short) (View.combineMeasuredStates(0, 0) + 67), (byte) (43 - Color.argb(0, 0, 0, 0)), 1640043643 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0'), (ViewConfiguration.getEdgeSlop() >> 16) - 33, objArr6);
            Class<?> cls = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            h(Drawable.resolveOpacity(0, 0) - 394059307, (short) (View.MeasureSpec.getMode(0) - 93), (byte) ((Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 104), View.MeasureSpec.getSize(0) + 1640043659, (-33) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr7);
            try {
                Object[] objArr8 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr7[0], Object.class).invoke(null, this)).intValue()), -1338134532};
                Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1437710995);
                if (PngjBadSignature3 == null) {
                    char capsMode = (char) TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0);
                    int indexOf = TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 37;
                    int i3 = 550 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1));
                    f = 0.0f;
                    Object[] objArr9 = new Object[1];
                    i((byte) ($$g[18] - 1), $$a[6], $$a[c2], objArr9);
                    String str3 = (String) objArr9[0];
                    Class cls2 = Integer.TYPE;
                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(capsMode, indexOf, i3, -1453402328, false, str3, new Class[]{cls2, cls2});
                } else {
                    f = 0.0f;
                }
                objArr = (Object[]) ((Method) PngjBadSignature3).invoke(null, objArr8);
                Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1434812162);
                if (PngjBadSignature4 == null) {
                    char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int modifierMetaStateMask2 = 36 - ((byte) KeyEvent.getModifierMetaStateMask());
                    int scrollBarSize = 549 - (ViewConfiguration.getScrollBarSize() >> 8);
                    byte[] bArr = $$g;
                    Object[] objArr10 = new Object[1];
                    i(bArr[18], bArr[c], bArr[5], objArr10);
                    PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(scrollDefaultDelay, modifierMetaStateMask2, scrollBarSize, 1452666181, false, (String) objArr10[0], null);
                }
                ((Field) PngjBadSignature4).set(null, objArr);
                try {
                    Long valueOf = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, null).invoke(null, null)).longValue());
                    Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1556686741);
                    if (PngjBadSignature5 == null) {
                        char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                        int resolveOpacity = 37 - Drawable.resolveOpacity(0, 0);
                        int red = 549 - Color.red(0);
                        byte b2 = $$g[18];
                        c4 = 3;
                        Object[] objArr11 = new Object[1];
                        i((byte) (b2 - 1), $$a[c2], (byte) (b2 - 1), objArr11);
                        PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(pressedStateDuration, resolveOpacity, red, -1608103378, false, (String) objArr11[0], null);
                    } else {
                        c4 = 3;
                    }
                    ((Field) PngjBadSignature5).set(null, valueOf);
                    c5 = 2;
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
            Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1434812162);
            if (PngjBadSignature6 == null) {
                char alpha = (char) Color.alpha(0);
                int gidForName2 = 36 - Process.getGidForName(BuildConfig.FLAVOR);
                int keyRepeatTimeout = 549 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                byte[] bArr2 = $$g;
                c3 = 6;
                i = 5;
                c5 = 2;
                Object[] objArr12 = new Object[1];
                i(bArr2[18], bArr2[c], bArr2[5], objArr12);
                PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(alpha, gidForName2, keyRepeatTimeout, 1452666181, false, (String) objArr12[0], null);
            } else {
                c3 = 6;
                i = 5;
                c5 = 2;
            }
            Object[] objArr13 = (Object[]) ((Field) PngjBadSignature6).get(null);
            objArr = new Object[3];
            objArr[0] = new int[1];
            objArr[1] = new int[]{0};
            objArr[c5] = new int[]{0};
            int i4 = ((int[]) objArr13[1])[0];
            int i5 = ((int[]) objArr13[c5])[0];
            int i6 = ~((~((int) Process.getStartUptimeMillis())) | 363525272);
            int c6 = defpackage.a.c(i6 | 25859208, 374, ((337666064 | i6) * (-374)) + 2115890386, -1338134532);
            int i7 = c6 ^ (c6 << 13);
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
            f = 0.0f;
            c4 = 3;
        }
        Object obj = objArr[c5];
        int i9 = ((int[]) obj)[0];
        Object obj2 = objArr[1];
        int i10 = ((int[]) obj2)[0];
        if (i10 == i9) {
            Object[] objArr14 = {new int[1], new int[1], new int[1]};
            int i11 = ((int[]) objArr[0])[0];
            int i12 = ((int[]) obj2)[0];
            int i13 = ((int[]) obj)[0];
            ((int[]) objArr14[1])[0] = i12;
            ((int[]) objArr14[2])[0] = i13;
            int d = defpackage.a.d((~((~System.identityHashCode(this)) | (-1359500473))) | 1358971024, 933, (((~((-104742763) | 0)) | (-1359500473)) * (-933)) - 993595684, 154636857, i11);
            int i14 = d ^ (d << 13);
            int i15 = i14 ^ (i14 >>> 17);
            ((int[]) objArr14[0])[0] = i15 ^ (i15 << 5);
        } else {
            int[] iArr = new int[i10];
            int i16 = i10 - 1;
            iArr[i16] = 1;
            Toast.makeText((Context) null, iArr[((i10 * i16) % 2) - 1], 1).show();
            Object[] objArr15 = {new int[1], new int[1], new int[1]};
            int i17 = ((int[]) objArr[0])[0];
            int i18 = ((int[]) objArr[1])[0];
            int i19 = ((int[]) objArr[2])[0];
            ((int[]) objArr15[1])[0] = i18;
            ((int[]) objArr15[2])[0] = i19;
            int identityHashCode = System.identityHashCode(this);
            int i20 = ~identityHashCode;
            int c7 = defpackage.a.c((~((-885439548) | i20)) | (-578803688), 68, ((~((-37307333) | i20)) * (-68)) + (((~(identityHashCode | 885439547)) | (~((-541496356) | i20)) | (-922746880)) * (-68)) + 2087841234, i17);
            int i21 = c7 ^ (c7 << 13);
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr15[0])[0] = i22 ^ (i22 << 5);
        }
        Object PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
        if (PngjBadSignature7 == null) {
            char defaultSize = (char) (14830 - View.getDefaultSize(0, 0));
            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 28;
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 721;
            byte b3 = $$g[18];
            Object[] objArr16 = new Object[1];
            i((byte) (b3 - 1), $$a[c2], (byte) (b3 - 1), objArr16);
            PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(defaultSize, edgeSlop, keyRepeatDelay, -815159504, false, (String) objArr16[0], null);
        }
        long j3 = ((Field) PngjBadSignature7).getLong(null);
        if (j3 == -1 || j3 + 4611686018427387890L < ((Long) defpackage.a.i(str, str2, null, null, null)).longValue()) {
            Object[] objArr17 = new Object[1];
            h((ViewConfiguration.getLongPressTimeout() >> 16) - 394059306, (short) (67 - Gravity.getAbsoluteGravity(0, 0)), (byte) (43 - KeyEvent.normalizeMetaState(0)), (KeyEvent.getMaxKeyCode() >> 16) + 1640043644, (Process.myPid() >> 22) - 33, objArr17);
            Class<?> cls3 = Class.forName((String) objArr17[0]);
            Object[] objArr18 = new Object[1];
            h((-394059308) - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)), (short) ((-92) - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1))), (byte) ((Process.myTid() >> 22) + 105), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0) + 1640043659, (-34) - Process.getGidForName(BuildConfig.FLAVOR), objArr18);
            int intValue = ((Integer) cls3.getMethod((String) objArr18[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr19 = {-157324690};
            Object PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1439412966);
            if (PngjBadSignature8 == null) {
                PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (Process.myPid() >> 22), 24 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), 697 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1457201313, false, null, new Class[]{Integer.TYPE});
            }
            PngjException$1eba2e16 = (Object[]) arid.a.valueOf.PngjException$1eba2e16(intValue, ((Constructor) PngjBadSignature8).newInstance(objArr19), -1511602340);
            Object PngjBadSignature9 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
            if (PngjBadSignature9 == null) {
                char blue = (char) (14830 - Color.blue(0));
                int i23 = 29 - (ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1));
                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 721;
                Object[] objArr20 = new Object[1];
                i((byte) ($$g[18] - 1), $$a[c3], $$a[c2], objArr20);
                PngjBadSignature9 = com.d.e.a.PngjBadCrcException.PngjBadSignature(blue, i23, maximumFlingVelocity, -779023007, false, (String) objArr20[0], null);
            }
            ((Field) PngjBadSignature9).set(null, PngjException$1eba2e16);
            try {
                Long valueOf2 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, null).invoke(null, null)).longValue());
                Object PngjBadSignature10 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
                if (PngjBadSignature10 == null) {
                    char c8 = (char) (14830 - (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)));
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 28;
                    int argb = Color.argb(0, 0, 0, 0) + 721;
                    byte b4 = $$g[18];
                    Object[] objArr21 = new Object[1];
                    i((byte) (b4 - 1), $$a[c2], (byte) (b4 - 1), objArr21);
                    PngjBadSignature10 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c8, longPressTimeout, argb, -815159504, false, (String) objArr21[0], null);
                }
                ((Field) PngjBadSignature10).set(null, valueOf2);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        } else {
            Object PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
            if (PngjBadSignature11 == null) {
                char c9 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14829);
                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 28;
                int i24 = (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 720;
                Object[] objArr22 = new Object[1];
                i((byte) ($$g[18] - 1), $$a[c3], $$a[c2], objArr22);
                PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c9, threadPriority, i24, -779023007, false, (String) objArr22[0], null);
            }
            Object[] objArr23 = (Object[]) ((Field) PngjBadSignature11).get(null);
            PngjException$1eba2e16 = new Object[4];
            PngjException$1eba2e16[0] = new int[]{0};
            PngjException$1eba2e16[1] = new int[1];
            PngjException$1eba2e16[c4] = new int[]{0};
            int i25 = ((int[]) objArr23[c4])[0];
            int i26 = ((int[]) objArr23[0])[0];
            PngjException$1eba2e16[2] = (String[]) objArr23[2];
            int c10 = defpackage.a.c(~((~Process.myUid()) | (-290489349)), 501, (((~((-290489349) | 0)) | 536944929) * 501) - 1193146388, -1511602340);
            int i27 = c10 ^ (c10 << 13);
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) PngjException$1eba2e16[1])[0] = i28 ^ (i28 << 5);
        }
        if (((int[]) PngjException$1eba2e16[c4])[0] != ((int[]) PngjException$1eba2e16[0])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) PngjException$1eba2e16[2];
            if (strArr == null) {
                throw null;
            }
            ppk = (rgenerate + 39) % 128;
            for (String str4 : strArr) {
                arrayList.add(str4);
            }
            throw null;
        }
        Object[] objArr24 = new Object[4];
        objArr24[0] = new int[]{0};
        objArr24[1] = new int[1];
        objArr24[c4] = new int[]{0};
        int i29 = ((int[]) PngjException$1eba2e16[1])[0];
        int i30 = ((int[]) PngjException$1eba2e16[c4])[0];
        int i31 = ((int[]) PngjException$1eba2e16[0])[0];
        objArr24[2] = (String[]) PngjException$1eba2e16[2];
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int d2 = defpackage.a.d((~(startElapsedRealtime | 383198949)) | (~((-651367025) | startElapsedRealtime)) | 536875024, -69, (((~((-114492001) | startElapsedRealtime)) | (~(920073973 | startElapsedRealtime))) * 69) - 1936673332, 1360910297, i29);
        int i32 = d2 ^ (d2 << 13);
        int i33 = i32 ^ (i32 >>> 17);
        ((int[]) objArr24[1])[0] = i33 ^ (i33 << 5);
        super.onReceive(context, intent);
        Object PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-175041514);
        if (PngjBadSignature12 == null) {
            char offsetBefore = (char) (31077 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0));
            int indexOf2 = TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 50;
            int scrollBarSize2 = 1043 - (ViewConfiguration.getScrollBarSize() >> 8);
            byte b5 = $$g[18];
            Object[] objArr25 = new Object[1];
            i((byte) (b5 - 1), $$a[c2], (byte) (b5 - 1), objArr25);
            PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature(offsetBefore, indexOf2, scrollBarSize2, 159283629, false, (String) objArr25[0], null);
        }
        long j4 = ((Field) PngjBadSignature12).getLong(null);
        if (j4 == -1 || j4 + 4611686018427387939L < ((Long) defpackage.a.i(str, str2, null, null, null)).longValue()) {
            if (context2 != null) {
                int i34 = ppk + 77;
                rgenerate = i34 % 128;
                if (i34 % 2 != 0) {
                    boolean z = context2 instanceof ContextWrapper;
                    throw null;
                }
                context2 = ((context2 instanceof ContextWrapper) && ((ContextWrapper) context2).getBaseContext() == null) ? null : context2.getApplicationContext();
            }
            Object[] objArr26 = new Object[1];
            h((SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) - 394059307, (short) ((SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 66), (byte) ((AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)) + 42), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1640043643, (-33) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr26);
            Class<?> cls4 = Class.forName((String) objArr26[0]);
            Object[] objArr27 = new Object[1];
            h((-394059307) - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), (short) (View.resolveSize(0, 0) - 93), (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 105), 1640043659 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (-34) - Process.getGidForName(BuildConfig.FLAVOR), objArr27);
            int intValue2 = ((Integer) cls4.getMethod((String) objArr27[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr28 = new Object[4];
                objArr28[c4] = -1230797421;
                objArr28[2] = 0;
                objArr28[1] = Integer.valueOf(intValue2);
                objArr28[0] = context2;
                byte b6 = (byte) ($$q & 1);
                byte[] bArr3 = $$p;
                Object[] objArr29 = new Object[1];
                j(b6, b6, bArr3[9], objArr29);
                Class<?> cls5 = Class.forName((String) objArr29[0]);
                byte b7 = bArr3[9];
                byte b8 = b7;
                Object[] objArr30 = new Object[1];
                j(b7, b8, (byte) (b8 + 1), objArr30);
                String str5 = (String) objArr30[0];
                Class cls6 = Integer.TYPE;
                Object[] objArr31 = (Object[]) cls5.getMethod(str5, Context.class, cls6, cls6, cls6).invoke(null, objArr28);
                if (context2 != null) {
                    Object PngjBadSignature13 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1200224935);
                    if (PngjBadSignature13 == null) {
                        char c11 = (char) (31078 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)));
                        int packedPositionType = 49 - ExpandableListView.getPackedPositionType(j);
                        int i35 = (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 1043;
                        byte b9 = $$g[18];
                        byte b10 = (byte) (b9 - 1);
                        Object[] objArr32 = new Object[1];
                        i(b9, b10, (byte) (b10 | 13), objArr32);
                        PngjBadSignature13 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c11, packedPositionType, i35, 1150904546, false, (String) objArr32[0], null);
                    }
                    ((Field) PngjBadSignature13).set(null, objArr31);
                    try {
                        Long valueOf3 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, null).invoke(null, null)).longValue());
                        Object PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-175041514);
                        if (PngjBadSignature14 == null) {
                            char c12 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 31077);
                            int argb2 = Color.argb(0, 0, 0, 0) + 49;
                            int i36 = (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 1043;
                            byte b11 = $$g[18];
                            Object[] objArr33 = new Object[1];
                            i((byte) (b11 - 1), $$a[c2], (byte) (b11 - 1), objArr33);
                            PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c12, argb2, i36, 159283629, false, (String) objArr33[0], null);
                        }
                        ((Field) PngjBadSignature14).set(null, valueOf3);
                    } catch (Exception unused3) {
                        throw new RuntimeException();
                    }
                }
                objArr2 = objArr31;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw new RuntimeException(th2);
                }
                throw new RuntimeException(cause2);
            }
        } else {
            Object PngjBadSignature15 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1200224935);
            if (PngjBadSignature15 == null) {
                char edgeSlop2 = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 31077);
                int resolveSize = 49 - View.resolveSize(0, 0);
                int modifierMetaStateMask3 = ((byte) KeyEvent.getModifierMetaStateMask()) + 1044;
                byte b12 = $$g[18];
                byte b13 = (byte) (b12 - 1);
                Object[] objArr34 = new Object[1];
                i(b12, b13, (byte) (b13 | 13), objArr34);
                PngjBadSignature15 = com.d.e.a.PngjBadCrcException.PngjBadSignature(edgeSlop2, resolveSize, modifierMetaStateMask3, 1150904546, false, (String) objArr34[0], null);
            }
            Object[] objArr35 = (Object[]) ((Field) PngjBadSignature15).get(null);
            objArr2 = new Object[i];
            objArr2[2] = new int[]{0};
            objArr2[c4] = new int[]{0};
            objArr2[4] = new int[1];
            int i37 = ((int[]) objArr35[c4])[0];
            int i38 = ((int[]) objArr35[2])[0];
            String str6 = (String) objArr35[1];
            String str7 = (String) objArr35[0];
            objArr2[1] = str6;
            objArr2[0] = str7;
            int c13 = defpackage.a.c(~(System.identityHashCode(this) | (-537314357)), -1504, (((~((-541512759) | 0)) | 4198402) * 1504) - 740948855, -1884920509);
            int i39 = c13 ^ (c13 << 13);
            int i40 = i39 ^ (i39 >>> 17);
            ((int[]) objArr2[4])[0] = i40 ^ (i40 << 5);
        }
        int i41 = ((int[]) objArr2[2])[0];
        int i42 = ((int[]) objArr2[c4])[0];
        if (i42 == i41) {
            rgenerate = (ppk + 125) % 128;
            Object[] objArr36 = new Object[5];
            objArr36[2] = new int[]{0};
            objArr36[c4] = new int[]{0};
            objArr36[4] = new int[1];
            int i43 = ((int[]) objArr2[4])[0];
            int i44 = ((int[]) objArr2[c4])[0];
            int i45 = ((int[]) objArr2[2])[0];
            String str8 = (String) objArr2[1];
            String str9 = (String) objArr2[0];
            objArr36[1] = str8;
            objArr36[0] = str9;
            int d3 = defpackage.a.d((~((int) Runtime.getRuntime().freeMemory())) | 536276973, -828, (((~(536276973 | 0)) | 88080396) * (-828)) - 2098783915, -1655702984, i43);
            int i46 = d3 ^ (d3 << 13);
            int i47 = i46 ^ (i46 >>> 17);
            ((int[]) objArr36[4])[0] = i47 ^ (i47 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((String) objArr2[1]);
        arrayList2.add((String) objArr2[0]);
        Toast.makeText((Context) null, i42 / (((i42 - 1) * i42) % 2), 0).show();
        Object[] objArr37 = new Object[5];
        objArr37[2] = new int[]{0};
        objArr37[c4] = new int[]{0};
        objArr37[4] = new int[1];
        int i48 = ((int[]) objArr2[4])[0];
        int i49 = ((int[]) objArr2[c4])[0];
        int i50 = ((int[]) objArr2[2])[0];
        String str10 = (String) objArr2[1];
        String str11 = (String) objArr2[0];
        objArr37[1] = str10;
        objArr37[0] = str11;
        int d4 = defpackage.a.d((~(((int) SystemClock.uptimeMillis()) | (-121023444))) | 51519506, 220, (((-745380814) | 0) * (-220)) - 190830389, 1590776494, i48);
        int i51 = d4 ^ (d4 << 13);
        int i52 = i51 ^ (i51 >>> 17);
        ((int[]) objArr37[4])[0] = i52 ^ (i52 << 5);
    }

    @Override // com.identy.e1
    public final void valueOf(int i, int i2, int i3, boolean z) {
        double d;
        super.valueOf(i, i2, i3, z);
        if (this.getMatchingTime) {
            return;
        }
        if (!(!this.uxd566jk.getScore.equals(com.identy.CapturePosition.VERTICAL_FROM_BOTTOM))) {
            ppk = (rgenerate + 71) % 128;
            double d2 = 3.2d;
            if (this.CaptureThumbActivity) {
                d = 4.699999809265137d;
                PngjBadCrcException(new Object[]{this, Double.valueOf(3.2d), Double.valueOf(4.699999809265137d)}, 0, 0, 0, -5471382, 5471382, 0);
                ppk = (rgenerate + 69) % 128;
            } else {
                PngjBadCrcException(new Object[]{this, Double.valueOf(2.5d), Double.valueOf(3.2d)}, 0, 0, 0, -5471382, 5471382, 0);
                d = 3.2d;
                d2 = 2.5d;
            }
            getQualityScore();
            this.getMatchingTime = true;
            this.getData = Integer.valueOf(this.Action.getWindowManager().getDefaultDisplay().getRotation() + i3);
            double d3 = this.getPadSub2_f / d2;
            double d4 = this.getPadSub3;
            this.CaptureRolledFingersActivity = new RectF((int) d3, (int) (d4 / d), (int) (0 - d3), (int) (d4 - (d4 / 2.5d)));
            this.getScore = 0;
            this.isQualityFailed = DurationKt.NANOS_IN_MILLIS;
            PngjBadSignature(new IdentyC(this, 0));
            rgenerate = (ppk + 97) % 128;
        } else {
            this.getData = Integer.valueOf(this.Action.getWindowManager().getDefaultDisplay().getRotation() + i3);
            org.c.a.PngjBadCrcException pngjBadCrcException = (org.c.a.PngjBadCrcException) this.Action.findViewById(R.id.tracking_overlay);
            this.Capture2TActivity = pngjBadCrcException;
            pngjBadCrcException.setLayerType(1, null);
            PngjBadCrcException(new Object[]{this}, 0, 0, 0, -644123029, 644123030, 0);
            this.getScore = (int) (this.CaptureRolledFingersActivity.height() * 0.6f);
            this.CaptureRolledFingersActivity.height();
            this.getScore = 0;
            this.isQualityFailed = DurationKt.NANOS_IN_MILLIS;
            StringBuilder sb = new StringBuilder(" allowed ?");
            sb.append(this.CaptureRolledFingersActivity.width());
            com.identy.getPadSub2.PngjException("allowed ? ", sb.toString());
            StringBuilder sb2 = new StringBuilder(" allowed ?");
            sb2.append(this.CaptureRolledFingersActivity.width());
            sb2.append(" --- ");
            sb2.append(this.CaptureRolledFingersActivity.height());
            sb2.append(" -- > ");
            sb2.append(this.getPadSub3);
            sb2.append(" -- ");
            sb2.append(this.getPadSub2_f);
            com.identy.getPadSub2.PngjException("allowed ? ", sb2.toString());
            StringBuilder sb3 = new StringBuilder(" MAX ");
            sb3.append(this.isQualityFailed);
            sb3.append(" MIN_FINGER_WIDTH ");
            sb3.append(this.getScore);
            com.identy.getPadSub2.PngjException("allowed ? ", sb3.toString());
            getData();
            PngjBadSignature(new IdentyC(this, 1));
        }
        RectF rectF = this.CaptureRolledFingersActivity;
        this.CaptureRolledThumbActivity = rectF;
        rectF.inset(-100.0f, -100.0f);
        this.getMatchingTime = true;
    }

    private static Animation PngjBadCrcException(InlineGuideOption inlineGuideOption) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(inlineGuideOption.getDuration());
        alphaAnimation.setInterpolator(new LinearInterpolator());
        alphaAnimation.setRepeatCount(inlineGuideOption.getNumberOfRepeats());
        alphaAnimation.setRepeatMode(2);
        ppk = (rgenerate + 85) % 128;
        return alphaAnimation;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0201 A[Catch: all -> 0x02e8, TryCatch #0 {all -> 0x02e8, blocks: (B:3:0x000f, B:6:0x002f, B:7:0x006a, B:20:0x00a5, B:22:0x00b6, B:23:0x00fb, B:31:0x012b, B:33:0x013f, B:34:0x017b, B:43:0x01e2, B:45:0x0201, B:46:0x023b), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02df A[EDGE_INSN: B:70:0x02df->B:74:0x02df BREAK  A[LOOP:3: B:62:0x0284->B:67:0x02cf], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0281  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void h(int i, short s, byte b, int i2, int i3, Object[] objArr) {
        int i4;
        long j;
        int i5;
        long j2;
        int i6;
        Object PngjBadSignature2;
        byte[] bArr;
        int i7;
        int i8;
        int length;
        byte[] bArr2;
        int i9;
        int i10;
        int i11;
        int i12;
        com.d.e.PngjPrematureEnding pngjPrematureEnding = new com.d.e.PngjPrematureEnding();
        StringBuilder sb = new StringBuilder();
        try {
            int i13 = 1;
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(pfkrolfinalizeF)};
            int i14 = 0;
            Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1302984176);
            int i15 = 60329;
            Class cls = Integer.TYPE;
            if (PngjBadSignature3 == null) {
                char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 60329);
                int i16 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 31;
                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 1167;
                byte[] bArr3 = $$s;
                i4 = -1302984176;
                byte length2 = (byte) bArr3.length;
                byte b2 = (byte) (-bArr3[0]);
                j = 0;
                PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(deadChar, i16, longPressTimeout, 1320773547, false, $$u(length2, b2, (byte) (b2 + 1)), new Class[]{cls, cls});
            } else {
                i4 = -1302984176;
                j = 0;
            }
            int intValue = ((Integer) ((Method) PngjBadSignature3).invoke(null, objArr2)).intValue();
            boolean z = intValue == -1;
            if (z) {
                byte[] bArr4 = destroy;
                float f = 0.0f;
                if (bArr4 != null) {
                    int i17 = $10 + 75;
                    $11 = i17 % 128;
                    if (i17 % 2 == 0) {
                        length = bArr4.length;
                        bArr2 = new byte[length];
                        i9 = 1;
                    } else {
                        length = bArr4.length;
                        bArr2 = new byte[length];
                        i9 = 0;
                    }
                    int i18 = i9;
                    j2 = -6165791747575875761L;
                    while (i18 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr4[i18])};
                        Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1053815139);
                        if (PngjBadSignature4 == null) {
                            i12 = i15;
                            char c = (char) ((PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)) + 14830);
                            int myTid = (Process.myTid() >> 22) + 28;
                            i10 = i13;
                            int bitsPerPixel = 720 - ImageFormat.getBitsPerPixel(i14);
                            i11 = i14;
                            byte b3 = $$s[i11];
                            byte b4 = (byte) (b3 - 1);
                            byte b5 = (byte) (-b3);
                            PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c, myTid, bitsPerPixel, 1038050086, false, $$u(b4, b5, (byte) (b5 + 1)), new Class[]{cls});
                        } else {
                            i10 = i13;
                            i11 = i14;
                            i12 = i15;
                        }
                        bArr2[i18] = ((Byte) ((Method) PngjBadSignature4).invoke(null, objArr3)).byteValue();
                        i18++;
                        i15 = i12;
                        i13 = i10;
                        i14 = i11;
                        f = 0.0f;
                    }
                    bArr4 = bArr2;
                } else {
                    j2 = -6165791747575875761L;
                }
                i5 = i13;
                int i19 = i14;
                int i20 = i15;
                if (bArr4 != null) {
                    byte[] bArr5 = destroy;
                    Object[] objArr4 = new Object[2];
                    objArr4[i5] = Integer.valueOf(pfkrolfinalize);
                    objArr4[i19] = Integer.valueOf(i2);
                    Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i4);
                    if (PngjBadSignature5 == null) {
                        char mode = (char) (View.MeasureSpec.getMode(i19) + i20);
                        int i21 = (TypedValue.complexToFraction(i19, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i19, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 32;
                        int gidForName = 1166 - Process.getGidForName(BuildConfig.FLAVOR);
                        byte[] bArr6 = $$s;
                        byte length3 = (byte) bArr6.length;
                        byte b6 = (byte) (-bArr6[0]);
                        PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(mode, i21, gidForName, 1320773547, false, $$u(length3, b6, (byte) (b6 + 1)), new Class[]{cls, cls});
                    }
                    intValue = (byte) (((byte) (bArr5[((Integer) ((Method) PngjBadSignature5).invoke(null, objArr4)).intValue()] ^ j2)) + ((int) (pfkrolfinalizeF ^ j2)));
                } else {
                    intValue = (short) (((short) (getServerRequest[i2 + ((int) (pfkrolfinalize ^ j2))] ^ j2)) + ((int) (pfkrolfinalizeF ^ j2)));
                }
            } else {
                i5 = 1;
                j2 = -6165791747575875761L;
            }
            if (intValue > 0) {
                int i22 = ((i2 + intValue) - 2) + ((int) (pfkrolfinalize ^ j2));
                if (z) {
                    int i23 = $10 + 83;
                    $11 = i23 % 128;
                    if (i23 % 2 != 0) {
                        i6 = i5;
                        pngjPrematureEnding.values = i22 + i6;
                        int i24 = pfkrolGetQuality;
                        Object[] objArr5 = new Object[4];
                        objArr5[3] = sb;
                        objArr5[2] = Integer.valueOf(i24);
                        objArr5[i5] = Integer.valueOf(i);
                        objArr5[0] = pngjPrematureEnding;
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1013119226);
                        if (PngjBadSignature2 == null) {
                            char resolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 45717);
                            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 40;
                            int i25 = (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 624;
                            byte b7 = $$s[0];
                            byte b8 = (byte) (-b7);
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(resolveOpacity, edgeSlop, i25, 1064463037, false, $$u(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, cls, cls, Object.class});
                        }
                        ((StringBuilder) ((Method) PngjBadSignature2).invoke(null, objArr5)).append(pngjPrematureEnding.valueOf);
                        pngjPrematureEnding.PngjBadCrcException = pngjPrematureEnding.valueOf;
                        bArr = destroy;
                        if (bArr != null) {
                            int length4 = bArr.length;
                            byte[] bArr7 = new byte[length4];
                            loop1: while (true) {
                                int i26 = 0;
                                while (i26 < length4) {
                                    int i27 = $10 + 89;
                                    $11 = i27 % 128;
                                    if (i27 % 2 == 0) {
                                        break;
                                    }
                                    bArr7[i26] = (byte) (bArr[i26] ^ j2);
                                    i26++;
                                }
                                bArr7[i26] = (byte) (bArr[i26] ^ j2);
                            }
                            bArr = bArr7;
                        }
                        if (bArr == null) {
                            i7 = i5;
                            i8 = i7;
                        } else {
                            i7 = i5;
                            i8 = 0;
                        }
                        while (true) {
                            pngjPrematureEnding.PngjException = i7;
                            if (pngjPrematureEnding.PngjException < intValue) {
                                break;
                            }
                            if (i8 != 0) {
                                int i28 = ($10 + 49) % 128;
                                $11 = i28;
                                byte[] bArr8 = destroy;
                                pngjPrematureEnding.values = pngjPrematureEnding.values - 1;
                                pngjPrematureEnding.valueOf = (char) (pngjPrematureEnding.PngjBadCrcException + (((byte) (((byte) (bArr8[0] ^ j2)) + s)) ^ b));
                                $10 = (i28 + 13) % 128;
                            } else {
                                short[] sArr = getServerRequest;
                                pngjPrematureEnding.values = pngjPrematureEnding.values - 1;
                                pngjPrematureEnding.valueOf = (char) (pngjPrematureEnding.PngjBadCrcException + (((short) (((short) (sArr[0] ^ j2)) + s)) ^ b));
                            }
                            sb.append(pngjPrematureEnding.valueOf);
                            pngjPrematureEnding.PngjBadCrcException = pngjPrematureEnding.valueOf;
                            i7 = pngjPrematureEnding.PngjException + 1;
                        }
                    }
                }
                i6 = 0;
                pngjPrematureEnding.values = i22 + i6;
                int i242 = pfkrolGetQuality;
                Object[] objArr52 = new Object[4];
                objArr52[3] = sb;
                objArr52[2] = Integer.valueOf(i242);
                objArr52[i5] = Integer.valueOf(i);
                objArr52[0] = pngjPrematureEnding;
                PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1013119226);
                if (PngjBadSignature2 == null) {
                }
                ((StringBuilder) ((Method) PngjBadSignature2).invoke(null, objArr52)).append(pngjPrematureEnding.valueOf);
                pngjPrematureEnding.PngjBadCrcException = pngjPrematureEnding.valueOf;
                bArr = destroy;
                if (bArr != null) {
                }
                if (bArr == null) {
                }
                while (true) {
                    pngjPrematureEnding.PngjException = i7;
                    if (pngjPrematureEnding.PngjException < intValue) {
                    }
                    sb.append(pngjPrematureEnding.valueOf);
                    pngjPrematureEnding.PngjBadCrcException = pngjPrematureEnding.valueOf;
                    i7 = pngjPrematureEnding.PngjException + 1;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
    }

    private static void i(short s, int i, short s2, Object[] objArr) {
        int i2 = (s * 38) + 80;
        int i3 = 40 - (i * 6);
        byte[] bArr = $$g;
        byte[] bArr2 = new byte[19 - s2];
        int i4 = 18 - s2;
        int i5 = -1;
        if (bArr == null) {
            int i6 = i4 + (-i3);
            i3++;
            i2 = i6 + 5;
            bArr = bArr;
            i5 = -1;
        }
        while (true) {
            int i7 = i5 + 1;
            bArr2[i7] = (byte) i2;
            if (i7 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b = bArr[i3];
            i3++;
            i2 = i2 + (-b) + 5;
            bArr = bArr;
            i5 = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void j(byte b, byte b2, short s, Object[] objArr) {
        int i;
        int i2;
        int i3;
        int i4 = 31 - (b2 * 28);
        byte[] bArr = $$p;
        int i5 = (s * 19) + 99;
        int i6 = (b * 23) + 6;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            byte[] bArr3 = bArr;
            i3 = 0;
            int i7 = i4;
            i4 = i4 + i5 + 1;
            i = i7;
            bArr = bArr3;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i8 = i + 1;
            byte b3 = bArr[i8];
            byte[] bArr4 = bArr;
            i7 = i8;
            i5 = b3;
            bArr3 = bArr4;
            i4 = i4 + i5 + 1;
            i = i7;
            bArr = bArr3;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        } else {
            i = i4;
            i4 = i5;
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void PngjBadCrcException(float f, float f2) {
        Hand hand;
        Animation loadAnimation;
        if (this.Capture2TActivity != null) {
            getScore();
            ImageView imageView = (ImageView) this.Action.findViewById(R.id.middle_info_image);
            Hand hand2 = this.CapturePosition.getHand();
            Hand hand3 = Hand.LEFT;
            boolean equals = hand2.equals(hand3);
            imageView.setRotation(!equals ? 270.0f : 90.0f);
            if (!equals) {
                rgenerate = (ppk + 63) % 128;
                imageView.setRotationX(180.0f);
                rgenerate = (ppk + 97) % 128;
            }
            Activity activity = this.Action;
            int i = R.id.preview;
            int height = activity.findViewById(i).getHeight();
            Activity activity2 = this.Action;
            int i2 = R.id.rol_twist_info_image;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) activity2.findViewById(i2).getLayoutParams();
            Hand hand4 = this.a;
            if (hand4 != null && hand4.equals(Hand.RIGHT)) {
                layoutParams.removeRule(11);
                layoutParams.addRule(9);
                layoutParams.setMargins(10, ((int) (height / f)) + 50, 0, 0);
                this.Action.findViewById(i2).setLayoutParams(layoutParams);
                ppk = (rgenerate + 27) % 128;
            } else {
                this.Action.findViewById(i2).setScaleY(-1.0f);
            }
            Activity activity3 = this.Action;
            int i3 = R.id.rol_twist_info_msg;
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) activity3.findViewById(i3).getLayoutParams();
            layoutParams2.setMargins(0, ((int) (height / f)) + 20, 0, 0);
            this.Action.findViewById(i3).setLayoutParams(layoutParams2);
            try {
                if (IdentySdk.getInstance().isInlineGuide() && this.getProcessingTime == 1) {
                    InlineGuideOption guideOption = IdentySdk.getInstance().getGuideOption();
                    ImageView imageView2 = (ImageView) this.Action.findViewById(R.id.inline_guide);
                    RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                    layoutParams3.setMargins(0, -120, 0, 0);
                    imageView2.setLayoutParams(layoutParams3);
                    imageView2.setImageResource(R.drawable.identy_single_finger_guide);
                    Hand hand5 = this.a;
                    if (hand5 != null) {
                        ppk = (rgenerate + 35) % 128;
                        if (hand5.equals(hand3)) {
                            imageView2.setRotation(0.0f);
                            View findViewById = this.Action.findViewById(i);
                            int height2 = findViewById.getHeight();
                            int width = findViewById.getWidth();
                            ViewGroup.LayoutParams layoutParams4 = imageView2.getLayoutParams();
                            layoutParams4.height = height2;
                            layoutParams4.width = width;
                            imageView2.setLayoutParams(layoutParams4);
                            hand = this.a;
                            if (hand != null) {
                                int i4 = ppk + 49;
                                rgenerate = i4 % 128;
                                if (i4 % 2 == 0) {
                                    if (hand.equals(hand3)) {
                                        loadAnimation = AnimationUtils.loadAnimation(this.Action, R.anim.identy_left_to_rights_slide);
                                        Animation PngjBadCrcException2 = PngjBadCrcException(guideOption);
                                        loadAnimation.setAnimationListener(new PngjBadCrcException(imageView2, PngjBadCrcException2));
                                        loadAnimation.setRepeatCount(0);
                                        PngjBadCrcException2.setAnimationListener(new PngjBadSignature(imageView2));
                                        imageView2.setVisibility(0);
                                        imageView2.startAnimation(loadAnimation);
                                    }
                                } else {
                                    hand.equals(hand3);
                                    throw null;
                                }
                            }
                            loadAnimation = AnimationUtils.loadAnimation(this.Action, R.anim.identy_right_to_left_slide);
                            Animation PngjBadCrcException22 = PngjBadCrcException(guideOption);
                            loadAnimation.setAnimationListener(new PngjBadCrcException(imageView2, PngjBadCrcException22));
                            loadAnimation.setRepeatCount(0);
                            PngjBadCrcException22.setAnimationListener(new PngjBadSignature(imageView2));
                            imageView2.setVisibility(0);
                            imageView2.startAnimation(loadAnimation);
                        }
                    }
                    imageView2.setScaleY(-1.0f);
                    imageView2.setRotation(180.0f);
                    View findViewById2 = this.Action.findViewById(i);
                    int height22 = findViewById2.getHeight();
                    int width2 = findViewById2.getWidth();
                    ViewGroup.LayoutParams layoutParams42 = imageView2.getLayoutParams();
                    layoutParams42.height = height22;
                    layoutParams42.width = width2;
                    imageView2.setLayoutParams(layoutParams42);
                    hand = this.a;
                    if (hand != null) {
                    }
                    loadAnimation = AnimationUtils.loadAnimation(this.Action, R.anim.identy_right_to_left_slide);
                    Animation PngjBadCrcException222 = PngjBadCrcException(guideOption);
                    loadAnimation.setAnimationListener(new PngjBadCrcException(imageView2, PngjBadCrcException222));
                    loadAnimation.setRepeatCount(0);
                    PngjBadCrcException222.setAnimationListener(new PngjBadSignature(imageView2));
                    imageView2.setVisibility(0);
                    imageView2.startAnimation(loadAnimation);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static /* synthetic */ Object valueOf(Object[] objArr) {
        getL2Score getl2score = (getL2Score) objArr[0];
        try {
            float f = getl2score.getPadSub2;
            float f2 = getl2score.getPadSub3;
            getl2score.CaptureRolledFingersActivity = new RectF((int) (f / 5.0f), (int) (f2 / 6.5f), (int) (f - (f / 3.5f)), (int) (f2 - (f2 / 1.8f)));
            getl2score.getL2Score = new com.identy.ui.d.values(getl2score.Action, 5.0d, 6.5d, 3.5d, 1.7999999523162842d, IdentySdk.getInstance().getFingerPrintDrawable(), IdentySdk.getInstance().isDisableOuterBox(), getl2score.a.equals(Hand.RIGHT) ? 180 : 0, false, getl2score.a.equals(Hand.LEFT), true, getl2score.uxd565jk, getl2score.cvtyuv2bgr);
            return null;
        } catch (Exception e) {
            try {
                if (LibSettings.isSaveCaptured()) {
                    e.getMessage();
                    return null;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return null;
        }
    }

    private void valueOf(double d, double d2) {
        Object[] objArr = {this, Double.valueOf(d), Double.valueOf(d2)};
        int PngjException = 0;
        PngjBadCrcException(objArr, 0, PngjException, 0, -5471382, 5471382, 0);
    }
}
