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
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
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
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.Toast;
import com.identy.enums.FingerDetectionMode;
import com.identy.enums.Hand;
import com.identy.ex.FingerError;
import com.identy.ex.PreCaptureOutput;
import com.karumi.dexter.BuildConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import org.c.a.PngjBadCrcException;
import org.identy.nativealgo.NativeAlgoUtils;
import org.identy.opencv.core.Mat;

/* loaded from: classes2.dex */
final class getFingers extends e1 {
    private static  byte[] $$d = null;
    private static  int $$e = 0;
    private static  byte[] $$g = null;
    private static  int $$h = 0;
    private static  byte[] $$l = null;
    private static  int $$m = 0;
    private static int $10;
    private static int $11;
    private static int[] pfk;
    private static int pfkrolGetQuality;
    private static int resetAttempt;
    Handler configure;
    List configureroll;
    private Pair pfkrol;

    public class PngjBadSignature implements Runnable {

        public class PngjException implements Runnable {
            public PngjException() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                getFingers.this.PngjOutputException();
                getFingers getfingers = getFingers.this;
                int i = R.string.id_capturing;
                com.identy.d.PngjBadSignature pngjBadSignature = getfingers.Attempt;
                if (pngjBadSignature != null) {
                    pngjBadSignature.PngjBadSignature(i, false);
                }
                getFingers.this.PngjBadCrcException(0);
            }
        }

        public PngjBadSignature() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.identy.ui.d.values valuesVar;
            com.identy.ui.d.values valuesVar2;
            com.identy.ui.d.values valuesVar3;
            com.identy.ui.d.values valuesVar4;
            com.identy.ui.d.values valuesVar5;
            long timeInMillis = Calendar.getInstance().getTimeInMillis();
            try {
                try {
                    getFingers.this.PngBadCharsetException();
                    Mat mat = getFingers.this.getFingerPrintQualityScore;
                    if (mat == null || Mat.n_empty(mat.PngjException)) {
                        getFingers getfingers = getFingers.this;
                        getfingers.getCaptureTime = false;
                        try {
                            if (getfingers.Capture2TActivity != null && (valuesVar3 = getfingers.getL2Score) != null) {
                                valuesVar3.values(getfingers.configureroll);
                                getFingers.this.Capture2TActivity.postInvalidate();
                            }
                            getFingers getfingers2 = getFingers.this;
                            Calendar.getInstance().getTimeInMillis();
                            getfingers2.getCaptureTime = false;
                            com.identy.d.PngjBadSignature pngjBadSignature = getfingers2.Attempt;
                            if (pngjBadSignature != null) {
                                pngjBadSignature.getData();
                                return;
                            }
                            return;
                        } catch (Exception e) {
                            e.printStackTrace();
                            return;
                        }
                    }
                    getFingers getfingers3 = getFingers.this;
                    if (getfingers3.onErrorResponse) {
                        try {
                            if (getfingers3.Capture2TActivity != null && (valuesVar4 = getfingers3.getL2Score) != null) {
                                valuesVar4.values(getfingers3.configureroll);
                                getFingers.this.Capture2TActivity.postInvalidate();
                            }
                            getFingers getfingers4 = getFingers.this;
                            Calendar.getInstance().getTimeInMillis();
                            getfingers4.getCaptureTime = false;
                            com.identy.d.PngjBadSignature pngjBadSignature2 = getfingers4.Attempt;
                            if (pngjBadSignature2 != null) {
                                pngjBadSignature2.getData();
                                return;
                            }
                            return;
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            return;
                        }
                    }
                    if (getfingers3.CaptureMode != 0 && timeInMillis > 15000) {
                        getfingers3.CaptureMode = 0L;
                    }
                    PreCaptureOutput valueOf = getfingers3.valueOf(new Mat(Mat.n_clone(getfingers3.getFingerPrintQualityScore.PngjException)));
                    getFingers getfingers5 = getFingers.this;
                    getfingers5.configureroll = getfingers5.getSpoofScore;
                    if (valueOf.isGoodToCapture()) {
                        getFingers getfingers6 = getFingers.this;
                        getfingers6.onErrorResponse = true;
                        getfingers6.configure.postDelayed(new PngjException(), 10L);
                    } else {
                        if (valueOf.getError().equals(FingerError.NO_BOXES)) {
                            getFingers getfingers7 = getFingers.this;
                            int res = valueOf.getError().getRes();
                            com.identy.d.PngjBadSignature pngjBadSignature3 = getfingers7.Attempt;
                            if (pngjBadSignature3 != null) {
                                pngjBadSignature3.PngjBadSignature(res, true);
                            }
                        } else {
                            getFingers getfingers8 = getFingers.this;
                            getfingers8.configureroll = getfingers8.getSpoofScore;
                            if (valueOf.getError().equals(FingerError.CORRECT)) {
                                getFingers.this.PngjBadCrcException(3 - valueOf.getStreakCount());
                            } else {
                                getFingers getfingers9 = getFingers.this;
                                int res2 = valueOf.getError().getRes();
                                com.identy.d.PngjBadSignature pngjBadSignature4 = getfingers9.Attempt;
                                if (pngjBadSignature4 != null) {
                                    pngjBadSignature4.PngjBadSignature(res2, true);
                                }
                            }
                        }
                        getFingers getfingers10 = getFingers.this;
                        getfingers10.configureroll = getfingers10.getSpoofScore;
                    }
                    try {
                        getFingers getfingers11 = getFingers.this;
                        if (getfingers11.Capture2TActivity != null && (valuesVar5 = getfingers11.getL2Score) != null) {
                            valuesVar5.values(getfingers11.configureroll);
                            getFingers.this.Capture2TActivity.postInvalidate();
                        }
                        getFingers getfingers12 = getFingers.this;
                        Calendar.getInstance().getTimeInMillis();
                        getfingers12.getCaptureTime = false;
                        com.identy.d.PngjBadSignature pngjBadSignature5 = getfingers12.Attempt;
                        if (pngjBadSignature5 != null) {
                            pngjBadSignature5.getData();
                        }
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            } catch (Exception unused) {
                getFingers getfingers13 = getFingers.this;
                if (getfingers13.Capture2TActivity != null && (valuesVar2 = getfingers13.getL2Score) != null) {
                    valuesVar2.values(getfingers13.configureroll);
                    getFingers.this.Capture2TActivity.postInvalidate();
                }
                getFingers getfingers14 = getFingers.this;
                Calendar.getInstance().getTimeInMillis();
                getfingers14.getCaptureTime = false;
                com.identy.d.PngjBadSignature pngjBadSignature6 = getfingers14.Attempt;
                if (pngjBadSignature6 != null) {
                    pngjBadSignature6.getData();
                }
            } catch (Throwable th) {
                try {
                    getFingers getfingers15 = getFingers.this;
                    if (getfingers15.Capture2TActivity != null && (valuesVar = getfingers15.getL2Score) != null) {
                        valuesVar.values(getfingers15.configureroll);
                        getFingers.this.Capture2TActivity.postInvalidate();
                    }
                    getFingers getfingers16 = getFingers.this;
                    Calendar.getInstance().getTimeInMillis();
                    getfingers16.getCaptureTime = false;
                    com.identy.d.PngjBadSignature pngjBadSignature7 = getfingers16.Attempt;
                    if (pngjBadSignature7 != null) {
                        pngjBadSignature7.getData();
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                throw new RuntimeException(th);
            }
        }
    }

    public class PngjException implements Runnable {

        public class PngjBadSignature implements Animation.AnimationListener {
            final /* synthetic */ ImageView valueOf;

            /* renamed from: com.identy.getFingers$PngjException$PngjBadSignature$PngjException, reason: collision with other inner class name */
            public class RunnableC0020PngjException implements Runnable {
                public RunnableC0020PngjException() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    PngjBadSignature.this.valueOf.clearAnimation();
                    PngjBadSignature.this.valueOf.setVisibility(8);
                }
            }

            public PngjBadSignature(ImageView imageView) {
                this.valueOf = imageView;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                getFingers.this.Action.runOnUiThread(new RunnableC0020PngjException());
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }
        }

        public PngjException() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            org.c.a.PngjBadCrcException pngjBadCrcException = getFingers.this.Capture2TActivity;
            if (pngjBadCrcException != null) {
                ViewGroup.LayoutParams layoutParams = pngjBadCrcException.getLayoutParams();
                Activity activity = getFingers.this.Action;
                int i = R.id.preview;
                layoutParams.height = activity.findViewById(i).getHeight();
                layoutParams.width = getFingers.this.Action.findViewById(i).getWidth();
                getFingers.this.Capture2TActivity.setLayoutParams(layoutParams);
                Activity activity2 = getFingers.this.Action;
                int i2 = R.id.info_layout;
                ViewGroup.LayoutParams layoutParams2 = activity2.findViewById(i2).getLayoutParams();
                layoutParams2.height = getFingers.this.Action.findViewById(i).getHeight();
                layoutParams2.width = getFingers.this.Action.findViewById(i).getWidth();
                getFingers.this.Action.findViewById(i2).setLayoutParams(layoutParams2);
                Activity activity3 = getFingers.this.Action;
                int i3 = R.id.location_error_layout;
                ViewGroup.LayoutParams layoutParams3 = activity3.findViewById(i3).getLayoutParams();
                layoutParams3.height = getFingers.this.Action.findViewById(i).getHeight();
                layoutParams3.width = getFingers.this.Action.findViewById(i).getWidth();
                getFingers.this.Action.findViewById(i3).setLayoutParams(layoutParams3);
                Activity activity4 = getFingers.this.Action;
                int i4 = R.id.scanner_overlay;
                ViewGroup.LayoutParams layoutParams4 = activity4.findViewById(i4).getLayoutParams();
                layoutParams4.height = getFingers.this.Action.findViewById(i).getHeight();
                layoutParams4.width = getFingers.this.Action.findViewById(i).getWidth();
                getFingers.this.Action.findViewById(i4).setLayoutParams(layoutParams4);
                try {
                    if (IdentySdk.getInstance().isInlineGuide()) {
                        InlineGuideOption guideOption = IdentySdk.getInstance().getGuideOption();
                        Activity activity5 = getFingers.this.Action;
                        int i5 = R.id.inline_guide;
                        ((ImageView) activity5.findViewById(i5)).setImageResource(R.drawable.identy_thumb_guide);
                        ImageView imageView = (ImageView) getFingers.this.Action.findViewById(i5);
                        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                        alphaAnimation.setDuration(guideOption.getDuration());
                        alphaAnimation.setInterpolator(new LinearInterpolator());
                        alphaAnimation.setRepeatCount(guideOption.getNumberOfRepeats());
                        alphaAnimation.setRepeatMode(2);
                        ViewGroup.LayoutParams layoutParams5 = getFingers.this.Action.findViewById(i5).getLayoutParams();
                        layoutParams5.height = getFingers.this.Action.findViewById(i).getHeight();
                        getFingers.this.Action.findViewById(i5).setLayoutParams(layoutParams5);
                        imageView.setVisibility(0);
                        alphaAnimation.setAnimationListener(new PngjBadSignature(imageView));
                        imageView.startAnimation(alphaAnimation);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public class valueOf implements Runnable {
        private static  byte[] $$a = null;
        private static  int $$b = 0;
        private static  byte[] $$c = null;
        private static  int $$d = 0;
        private static int $10;
        private static int $11;
        private static int PngjBadCrcException;
        private static long PngjBadSignature;
        private static char[] PngjException;
        private static int PngjOutputException;
        private static int valueOf;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0030). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$e(byte b, byte b2, byte b3) {
            int i;
            int i2 = b * 4;
            int i3 = (b3 * 9) + 104;
            byte[] bArr = $$c;
            int i4 = (b2 * 4) + 4;
            byte[] bArr2 = new byte[1 - i2];
            int i5 = 0 - i2;
            if (bArr == null) {
                int i6 = i4;
                byte[] bArr3 = bArr;
                int i7 = 0;
                int i8 = i5;
                int i9 = i6 + 1;
                i3 = i4 + i8;
                i4 = i9;
                bArr = bArr3;
                i = i7;
                bArr2[i] = (byte) i3;
                if (i == i5) {
                    return new String(bArr2, 0);
                }
                int i10 = i3;
                i6 = i4;
                i4 = bArr[i4];
                i7 = i + 1;
                bArr3 = bArr;
                i8 = i10;
                int i92 = i6 + 1;
                i3 = i4 + i8;
                i4 = i92;
                bArr = bArr3;
                i = i7;
                bArr2[i] = (byte) i3;
                if (i == i5) {
                    return new String(bArr2, 0);
                }
            } else {
                i = 0;
                bArr2[i] = (byte) i3;
                if (i == i5) {
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
            valueOf = 0;
            PngjOutputException = 1;
            PngjBadCrcException = 97773954;
            PngjException = new char[]{29725, 6802, 43284, 16269, 52783, 23768, 58207, 29120, 'u', 38634, 9654, 46100, 23179, 59702, 29725, 6802, 43284, 16284, 52798, 23755, 58200, 29128, 'q', 38638, 9612, 46108, 23177, 59709, 32645, 3671, 40140, 9032, 56067, 46465, 1564, 37047, 24889, 62410, 19528, 56983, 44905, 14840, 35470, 6937, 62875, 17957, 53408, 41231, 13250, 35922, 7846, 61268, 30742, 51843, 23312, 13728, 34361, 4294, 57668, 29652, 52321, 24309, 12205, 47135, 2724, 39712, 28336, '8', 46010, 9490, 54436, 18044, 63976, 53471, 48679, 3523, 29706, 6810, 43328, 16305, 52775, 23752, 58176, 29057, 'b', 38638, 9627, 46110, 23175, 59700, 32681, 3658, 29727, 6799, 43273, 16297, 52804, 39195, 63369, 17431, 53930, 9004, 315, 28595, 56354, 19096, 16014, 20498, 58247, 30002, 33963, 5720, 43477, 15135, 29760, 29725, 6802, 43284, 16284, 52781, 23759, 58205, 29143, 'w', 38606, 9628, 46104, 23183, 59709, 32703, 29723, 6809, 43268, 16303, 52769, 23762, 58192, 29071, 'q', 38624, 9622, 46081, 23171, 59709, 32696, 3607, 40169, 9032, 45565, 16509, 55057, 25989, 62465, 39615, 10550, 49137, 20041, 56520, 25459, 36357, 57490, 21286, 50617, 13367, 42699, 6475, 35803, 64097, 27862, 57241, 19981, 41109, 4919, 34203, 62559, 26316};
            PngjBadSignature = -7616325261325821193L;
        }

        public valueOf() {
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x017f  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0180  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(char c, int i, int i2, Object[] objArr) throws Exception {
            Throwable cause;
            long j;
            int i3;
            char c2;
            com.d.e.onErrorResponse onerrorresponse = new com.d.e.onErrorResponse();
            long[] jArr = new long[i];
            onerrorresponse.PngjBadSignature = 0;
            while (true) {
                int i4 = onerrorresponse.PngjBadSignature;
                if (i4 >= i) {
                    break;
                }
                $10 = ($11 + 99) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(PngjException[i2 + i4])};
                    Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1678178881);
                    Class cls = Integer.TYPE;
                    if (PngjBadSignature2 == null) {
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 19;
                        i3 = 818986954;
                        int scrollBarSize = 586 - (ViewConfiguration.getScrollBarSize() >> 8);
                        j = 0;
                        byte b = $$c[2];
                        byte b2 = (byte) (b - 1);
                        c2 = 1;
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), jumpTapTimeout, scrollBarSize, -1729521670, false, $$e(b2, b2, b), new Class[]{cls});
                    } else {
                        j = 0;
                        i3 = 818986954;
                        c2 = 1;
                    }
                    Long l = (Long) ((Method) PngjBadSignature2).invoke(null, objArr2);
                    l.longValue();
                    long j2 = i4;
                    long j3 = PngjBadSignature;
                    Object[] objArr3 = new Object[4];
                    objArr3[3] = Integer.valueOf(c);
                    objArr3[2] = Long.valueOf(j3);
                    objArr3[c2] = Long.valueOf(j2);
                    objArr3[0] = l;
                    Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-173046460);
                    if (PngjBadSignature3 == null) {
                        char c3 = (char) (57265 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)));
                        int i5 = (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) + 34;
                        int absoluteGravity = 51 - Gravity.getAbsoluteGravity(0, 0);
                        Class cls2 = Long.TYPE;
                        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c3, i5, absoluteGravity, 155248895, false, "t", new Class[]{cls2, cls2, cls2, cls});
                    }
                    jArr[i4] = ((Long) ((Method) PngjBadSignature3).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = new Object[2];
                    objArr4[c2] = onerrorresponse;
                    objArr4[0] = onerrorresponse;
                    Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                    if (PngjBadSignature4 == null) {
                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (Process.getGidForName(BuildConfig.FLAVOR) + 1), 35 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 155 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -868232591, false, "p", new Class[]{Object.class, Object.class});
                    }
                    ((Method) PngjBadSignature4).invoke(null, objArr4);
                    $11 = ($10 + 31) % 128;
                } catch (Throwable th) {

                    Throwable cause2 = th.getCause();

                    if (cause2 != null) {

                        throw new RuntimeException(cause2);

                    }

                    throw new RuntimeException(th);

                }
            }
            char[] cArr = new char[i];
            onerrorresponse.PngjBadSignature = 0;
            while (true) {
                int i6 = onerrorresponse.PngjBadSignature;
                if (i6 >= i) {
                    String str = new String(cArr);
                    $10 = ($11 + 5) % 128;
                    objArr[0] = str;
                    return;
                } else {
                    cArr[i6] = (char) jArr[i6];
                    Object[] objArr5 = {onerrorresponse, onerrorresponse};
                    Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(818986954);
                    if (PngjBadSignature5 == null) {
                        PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) + 36, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 154, -868232591, false, "p", new Class[]{Object.class, Object.class});
                    }
                    ((Method) PngjBadSignature5).invoke(null, objArr5);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0163  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0164  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(int i, boolean z, String str, int i2, int i3, Object[] objArr) throws Exception {
            char[] cArr;
            Throwable cause;
            char c;
            long j;
            int i4;
            if (str != null) {
                $11 = ($10 + 67) % 128;
                cArr = str.toCharArray();
            } else {
                cArr = null;
            }
            char[] cArr2 = cArr;
            com.d.e.Action action = new com.d.e.Action();
            char[] cArr3 = new char[i];
            action.valueOf = 0;
            while (true) {
                int i5 = action.valueOf;
                if (i5 >= i) {
                    break;
                }
                char c2 = cArr2[i5];
                action.values = c2;
                char c3 = (char) (i3 + c2);
                cArr3[i5] = c3;
                try {
                    Object[] objArr2 = {Integer.valueOf(c3), Integer.valueOf(PngjBadCrcException)};
                    Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(610361420);
                    if (PngjBadSignature2 == null) {
                        char c4 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                        int packedPositionType = 28 - ExpandableListView.getPackedPositionType(0L);
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 1531;
                        i4 = -743328348;
                        byte b = (byte) ($$c[2] - 1);
                        c = 1;
                        byte b2 = b;
                        j = 0;
                        String $$e = $$e(b, b2, b2);
                        Class cls = Integer.TYPE;
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c4, packedPositionType, maxKeyCode, -661778953, false, $$e, new Class[]{cls, cls});
                    } else {
                        c = 1;
                        j = 0;
                        i4 = -743328348;
                    }
                    cArr3[i5] = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = new Object[2];
                    objArr3[c] = action;
                    objArr3[0] = action;
                    Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i4);
                    if (PngjBadSignature3 == null) {
                        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 39, View.resolveSize(0, 0) + 190, 794744863, false, "j", new Class[]{Object.class, Object.class});
                    }
                    ((Method) PngjBadSignature3).invoke(null, objArr3);
                } catch (Throwable th) {

                    Throwable cause2 = th.getCause();

                    if (cause2 != null) {

                        throw new RuntimeException(cause2);

                    }

                    throw new RuntimeException(th);

                }
            }
            if (i2 > 0) {
                $10 = ($11 + 55) % 128;
                action.PngjException = i2;
                char[] cArr4 = new char[i];
                System.arraycopy(cArr3, 0, cArr4, 0, i);
                int i6 = action.PngjException;
                System.arraycopy(cArr4, 0, cArr3, i - i6, i6);
                int i7 = action.PngjException;
                System.arraycopy(cArr4, i7, cArr3, 0, i - i7);
            }
            if (z) {
                int i8 = ($11 + 51) % 128;
                $10 = i8;
                char[] cArr5 = new char[i];
                action.valueOf = 0;
                $11 = (i8 + 11) % 128;
                while (true) {
                    int i9 = action.valueOf;
                    if (i9 >= i) {
                        break;
                    }
                    $10 = ($11 + 23) % 128;
                    cArr5[i9] = cArr3[(i - i9) - 1];
                    Object[] objArr4 = {action, action};
                    Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-743328348);
                    if (PngjBadSignature4 == null) {
                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 40, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 190, 794744863, false, "j", new Class[]{Object.class, Object.class});
                    }
                    ((Method) PngjBadSignature4).invoke(null, objArr4);
                }
                cArr3 = cArr5;
            }
            objArr[0] = new String(cArr3);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0029). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void c(int i, short s, int i2, Object[] objArr) {
            int i3;
            int i4 = 112 - i2;
            byte[] bArr = $$a;
            int i5 = 7 - i;
            byte[] bArr2 = new byte[13 - s];
            int i6 = 12 - s;
            int i7 = 0;
            if (bArr == null) {
                byte[] bArr3 = bArr;
                i7 = 0;
                int i8 = i6;
                i5++;
                i4 = (-i4) + i8;
                bArr = bArr3;
                i3 = i7;
                bArr2[i3] = (byte) i4;
                i7 = i3 + 1;
                if (i3 == i6) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                byte b = bArr[i5];
                byte[] bArr4 = bArr;
                i8 = i4;
                i4 = b;
                bArr3 = bArr4;
                i5++;
                i4 = (-i4) + i8;
                bArr = bArr3;
                i3 = i7;
                bArr2[i3] = (byte) i4;
                i7 = i3 + 1;
                if (i3 == i6) {
                }
            } else {
                i3 = 0;
                bArr2[i3] = (byte) i4;
                i7 = i3 + 1;
                if (i3 == i6) {
                }
            }
        }

        public static void init$0() {
            $$a = new byte[]{47, 41, -12, 122, 10, -5, 52, -30, 7, -3, 37, -51, 21, -2, -11, -4, 11, -6, 1};
            $$b = 91;
        }

        public static void init$1() {
            $$c = new byte[]{22, -6, 1, 71};
            $$d = 85;
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1602)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:298)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] values(android.content.Context r53, int r54, int r55, int r56) {
            /*
                Method dump skipped, instructions count: 10496
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.identy.getFingers.valueOf.values(android.content.Context, int, int, int):java.lang.Object[]");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!getFingers.this.getL3Score) {
                    int i = PngjOutputException + 15;
                    valueOf = i % 128;
                    if (i % 2 != 0) {
                        IdentySdk.getInstance().getFingerPrintDrawable();
                        throw null;
                    }
                    if (IdentySdk.getInstance().getFingerPrintDrawable() == 0) {
                        getFingers getfingers = getFingers.this;
                        getfingers.getL1Score.PngjBadSignature(getfingers.a, 3.2d, 3.2d, 3.2d);
                        return;
                    }
                }
            } catch (Exception unused) {
            }
            int i2 = PngjOutputException + 47;
            valueOf = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }
    }

    public class values implements org.c.a.PngjBadCrcException.values {
        public values() {
        }

        @Override // org.c.a.PngjBadCrcException.values
        public final void drawCallback(Canvas canvas) {
            getFingers getfingers = getFingers.this;
            getfingers.getL2Score.values(canvas, getfingers.getL3Score);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$n(int i, int i2, short s) {
        int i3;
        int i4;
        int i5 = 122 - (s * 57);
        int i6 = 4 - (i * 4);
        byte[] bArr = $$l;
        int i7 = 1 - (i2 * 3);
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            int i8 = i5;
            i4 = 0;
            i5 = i7;
            i6++;
            i5 += i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i7) {
                return new String(bArr2, 0);
            }
            i8 = bArr[i6];
            i6++;
            i5 += i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i7) {
                return new String(bArr2, 0);
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i7) {
                return new String(bArr2, 0);
            }
        }
        return new String(bArr2, 0);
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        resetAttempt = 0;
        pfkrolGetQuality = 1;
        pfk = new int[]{-1629022051, -1900844353, 1844911964, 1392857629, 204952597, 1830789382, -2002278338, 1402050739, 1855811426, -2092832723, -422896485, 618361845, 1472998381, -385381569, -1150061508, 1457513754, -957778667, -288253132};
    }

    public getFingers(Activity activity, com.identy.d.PngjBadSignature pngjBadSignature, FingerDetectionMode fingerDetectionMode, boolean z, boolean z2) {
        super(activity, z2, fingerDetectionMode, true, false);
        this.pfkrol = null;
        this.configureroll = new LinkedList();
        new NativeAlgoUtils();
        this.Action = activity;
        this.Attempt = pngjBadSignature;
        this.configure = new Handler(this.Action.getMainLooper());
        com.identy.e1.PngjOutputException = 0L;
        this.getOveralTimetaken = new float[0];
        this.a = fingerDetectionMode.getHand();
        this.pfkrol = new Pair(fingerDetectionMode.getHand(), fingerDetectionMode.getFinger());
        this.getL3Score = z;
        this.Capture2IndexActivity = new com.identy.PngjOutputException(PngjExceptionInternal());
        this.getProcessingTime = 1;
        int i = this.a.equals(Hand.LEFT) ? R.string.id_searching_left_thumb : R.string.id_searching_right_thumb;
        com.identy.d.PngjBadSignature pngjBadSignature2 = this.Attempt;
        if (pngjBadSignature2 != null) {
            pngjBadSignature2.PngjBadSignature(i, false);
        }
        this.cvtyuv2bgr = com.identy.CapturePosition.VERTICAL_FROM_BOTTOM;
    }

    public static /* synthetic */ Object PngjBadSignature(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i;
        int i9 = ~i5;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i | i4);
        int i12 = i5 | i11;
        int i13 = (~(i5 | i4)) | (~(i7 | i8 | i9)) | i11 | (~(i | i5));
        int i14 = (-849346560) * i2;
        int i15 = (-1881145344) * i3;
        int i16 = ((-578813952) * i6) + i15 + i14 + (587901737 * i13) + (i12 * 587901737) + ((-1175803474) * i10) + ((-1437248296) * i4) + ((-261444822) * i) + 922746880;
        int i17 = ((-51365948) * i6) + (1272450877 * i3) + i + i4 + i2;
        int i18 = i17 * i17;
        int i19 = ((-124846080) * i18) + i16;
        int i20 = i12 * 177;
        int i21 = i13 * 177;
        int i22 = i2 * 1187242569;
        int i23 = i3 * (-1484311963);
        int i24 = i6 * 1141305060;
        int i25 = i18 * 516358144;
        int i26 = i25 + i24 + i23 + i22 + i21 + i20 + (i10 * (-354)) + (i4 * 1187242392) + (i * 1187242746) + 1002376400;
        return ((i26 * i26) * (-861863936)) + i19 != 1 ? values(objArr) : valueOf(objArr);
    }

    private static void e(int[] iArr, int i, Object[] objArr) throws Exception {
        char[] cArr;
        char c;
        char[] cArr2;
        int[] iArr2;
        int length;
        int[] iArr3;
        int i2;
        com.d.e.PngBadCharsetException pngBadCharsetException = new com.d.e.PngBadCharsetException();
        char[] cArr3 = new char[4];
        int i3 = 2;
        char[] cArr4 = new char[iArr.length * 2];
        int[] iArr4 = pfk;
        Class cls = Integer.TYPE;
        int i4 = 16;
        int i5 = 0;
        if (iArr4 != null) {
            int i6 = $10 + 39;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                length = iArr4.length;
                iArr3 = new int[length];
            } else {
                length = iArr4.length;
                iArr3 = new int[length];
            }
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 25;
                int i9 = i3;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr4[i7])};
                        Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1618428774);
                        if (PngjBadSignature2 == null) {
                            i2 = i4;
                            byte b = (byte) i5;
                            byte b2 = b;
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (CdmaCellLocation.convertQuartSecToDecDegrees(i5) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i5) == 0.0d ? 0 : -1)), 31 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1381 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR), -1667748131, false, $$n(b, b2, b2), new Class[]{cls});
                        } else {
                            i2 = i4;
                        }
                        iArr3[i7] = ((Integer) ((Method) PngjBadSignature2).invoke(null, objArr2)).intValue();
                        i7 <<= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();

                        if (cause == null) {

                            throw new RuntimeException(th);

                        }

                        throw new RuntimeException(cause);
                    }
                } else {
                    i2 = i4;
                    Object[] objArr3 = {Integer.valueOf(iArr4[i7])};
                    Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1618428774);
                    if (PngjBadSignature3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (Color.rgb(0, 0, 0) + 16777216), ImageFormat.getBitsPerPixel(0) + 32, (KeyEvent.getMaxKeyCode() >> 16) + 1381, -1667748131, false, $$n(b3, b4, b4), new Class[]{cls});
                    }
                    iArr3[i7] = ((Integer) ((Method) PngjBadSignature3).invoke(null, objArr3)).intValue();
                    i7++;
                }
                i3 = i9;
                i4 = i2;
                i5 = 0;
            }
            iArr4 = iArr3;
        }
        int i10 = i3;
        int i11 = i4;
        int length2 = iArr4.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = pfk;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                Object[] objArr4 = {Integer.valueOf(iArr6[i12])};
                Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1618428774);
                if (PngjBadSignature4 == null) {
                    cArr2 = cArr3;
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    iArr2 = iArr6;
                    PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) View.getDefaultSize(0, 0), 31 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1381 - (ViewConfiguration.getLongPressTimeout() >> 16), -1667748131, false, $$n(b5, b6, b6), new Class[]{cls});
                } else {
                    cArr2 = cArr3;
                    iArr2 = iArr6;
                }
                iArr7[i12] = ((Integer) ((Method) PngjBadSignature4).invoke(null, objArr4)).intValue();
                i12++;
                cArr3 = cArr2;
                iArr6 = iArr2;
            }
            cArr = cArr3;
            $10 = ($11 + 15) % 128;
            iArr6 = iArr7;
        } else {
            cArr = cArr3;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length2);
        pngBadCharsetException.values = 0;
        while (true) {
            int i13 = pngBadCharsetException.values;
            if (i13 >= iArr.length) {
                objArr[0] = new String(cArr4, 0, i);
                return;
            }
            $11 = ($10 + 91) % 128;
            int i14 = iArr[i13];
            char c2 = (char) (i14 >> 16);
            cArr[0] = c2;
            char c3 = (char) i14;
            char c4 = 1;
            cArr[1] = c3;
            char c5 = (char) (iArr[i13 + 1] >> 16);
            cArr[i10] = c5;
            char c6 = (char) iArr[i13 + 1];
            cArr[3] = c6;
            pngBadCharsetException.PngjException = (c2 << 16) + c3;
            pngBadCharsetException.PngjBadCrcException = (c5 << 16) + c6;
            com.d.e.PngBadCharsetException.values(iArr5);
            int i15 = 0;
            while (i15 < i11) {
                int i16 = pngBadCharsetException.PngjException ^ iArr5[i15];
                pngBadCharsetException.PngjException = i16;
                int PngjBadCrcException = com.d.e.PngBadCharsetException.PngjBadCrcException(i16);
                Object[] objArr5 = new Object[4];
                objArr5[3] = pngBadCharsetException;
                objArr5[i10] = pngBadCharsetException;
                objArr5[c4] = Integer.valueOf(PngjBadCrcException);
                objArr5[0] = pngBadCharsetException;
                Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-2104166611);
                if (PngjBadSignature5 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    c = c4;
                    PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 2787), (-16777180) - Color.rgb(0, 0, 0), 785 - (ViewConfiguration.getEdgeSlop() >> 16), 2122029718, false, $$n(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, cls, Object.class, Object.class});
                } else {
                    c = c4;
                }
                int intValue = ((Integer) ((Method) PngjBadSignature5).invoke(null, objArr5)).intValue();
                pngBadCharsetException.PngjException = pngBadCharsetException.PngjBadCrcException;
                pngBadCharsetException.PngjBadCrcException = intValue;
                i15++;
                $10 = ($11 + 51) % 128;
                c4 = c;
                i11 = 16;
            }
            char c7 = c4;
            int i17 = pngBadCharsetException.PngjException;
            int i18 = pngBadCharsetException.PngjBadCrcException;
            pngBadCharsetException.PngjException = i18;
            pngBadCharsetException.PngjBadCrcException = i17;
            i11 = 16;
            int i19 = i17 ^ iArr5[16];
            pngBadCharsetException.PngjBadCrcException = i19;
            int i20 = i18 ^ iArr5[17];
            pngBadCharsetException.PngjException = i20;
            cArr[0] = (char) (i20 >>> 16);
            cArr[c7] = (char) i20;
            cArr[i10] = (char) (i19 >>> 16);
            cArr[3] = (char) i19;
            com.d.e.PngBadCharsetException.values(iArr5);
            int i21 = pngBadCharsetException.values;
            cArr4[i21 * 2] = cArr[0];
            cArr4[(i21 * 2) + 1] = cArr[c7];
            cArr4[(i21 * 2) + 2] = cArr[i10];
            cArr4[(i21 * 2) + 3] = cArr[3];
            int i22 = i10;
            Object[] objArr6 = new Object[i22];
            objArr6[c7] = pngBadCharsetException;
            objArr6[0] = pngBadCharsetException;
            Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-800662452);
            if (PngjBadSignature6 == null) {
                PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ('0' - AndroidCharacter.getMirror('0')), TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 23, 29 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), 749318647, false, "E", new Class[]{Object.class, Object.class});
            }
            ((Method) PngjBadSignature6).invoke(null, objArr6);
            i10 = i22;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void f(byte b, int i, byte b2, Object[] objArr) {
        int i2;
        int i3 = b + 4;
        int i4 = 118 - (b2 * 38);
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[19 - i];
        int i5 = 18 - i;
        int i8 = 0;
        if (bArr == null) {
            int i6 = i3;
            int i7 = i5;
            i8 = 0;
            int i9 = i3 + (-i7) + 5;
            int i10 = i6;
            i4 = i9;
            i3 = i10;
            i2 = i8;
            int i11 = i3 + 1;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i7 = bArr[i11];
            int i12 = i4;
            i6 = i11;
            i3 = i12;
            int i92 = i3 + (-i7) + 5;
            int i102 = i6;
            i4 = i92;
            i3 = i102;
            i2 = i8;
            int i112 = i3 + 1;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            int i1122 = i3 + 1;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void g(int i, int i2, byte b, Object[] objArr) {
        int i3;
        int i4 = (i * 44) + 4;
        int i5 = (b * 19) + 99;
        int i6 = i2 * 39;
        byte[] bArr = $$g;
        byte[] bArr2 = new byte[i6 + 6];
        int i7 = i6 + 5;
        if (bArr == null) {
            int i8 = i5;
            i3 = 0;
            i5 = i7;
            i4++;
            i5 = (i5 + i8) - 13;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i8 = bArr[i4];
            i3++;
            i4++;
            i5 = (i5 + i8) - 13;
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

    public static void init$0() {
        $$d = new byte[]{12, -72, -13, -35, -25, 12, 2, 45, -26, 2, 38, -42, 20, 35, -46, 26, 3, -6, 1, 16, -1, 6, 26, -6, -4, 21, -9, -25, 12, 2, 42, -46, 26, 3, -6, 1, 16, -1, 6, 26, -6, -4, 21, 27, -18};
        $$e = 27;
    }

    public static void init$1() {
        $$g = new byte[]{25, 31, -61, 78, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 37, 48, 18, 6, 11, 26, -36, 47, 30, 2, 26, 0, 24, 18, -72, 57, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, -8, 24, 22, -3, 27};
        $$h = 106;
    }

    public static void init$2() {
        $$l = new byte[]{15, -119, -68, 8};
        $$m = 159;
    }

    private static /* synthetic */ Object valueOf(Object[] objArr) {
        getFingers getfingers = (getFingers) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
        List list = (List) objArr[3];
        List list2 = (List) objArr[4];
        float floatValue = ((Number) objArr[5]).floatValue();
        Long l = (Long) objArr[6];
        int i = pfkrolGetQuality + 101;
        resetAttempt = i % 128;
        int i2 = i % 2;
        getfingers.PngjBadCrcException(bArr, booleanValue, list, list2, floatValue, l);
        if (i2 == 0) {
            return null;
        }
        int i3 = 49 / 0;
        return null;
    }

    private static /* synthetic */ Object values(Object[] objArr) {
        getFingers getfingers = (getFingers) objArr[0];
        getfingers.a();
        int i = getfingers.a.equals(Hand.LEFT) ? R.string.id_searching_left_thumb : R.string.id_searching_right_thumb;
        com.identy.d.PngjBadSignature pngjBadSignature = getfingers.Attempt;
        if (pngjBadSignature != null) {
            pngjBadSignature.PngjBadSignature(i, false);
        }
        new Message().what = 0;
        getfingers.onErrorResponse = false;
        getfingers.getQualityScore = 0L;
        getfingers.getL2Score.PngjBadCrcException();
        getfingers.Capture2TActivity.postInvalidate();
        getfingers.Action.runOnUiThread(getfingers.new valueOf());
        com.identy.d.PngjBadSignature pngjBadSignature2 = getfingers.Attempt;
        if (pngjBadSignature2 != null) {
            int i2 = pfkrolGetQuality + 105;
            resetAttempt = i2 % 128;
            if (i2 % 2 != 0) {
                pngjBadSignature2.getData();
                int i3 = 0 / 0;
            } else {
                pngjBadSignature2.getData();
            }
        }
        resetAttempt = (pfkrolGetQuality + 123) % 128;
        return null;
    }

    @Override // com.identy.e1
    public final RectF Action() {
        pfkrolGetQuality = (resetAttempt + 21) % 128;
        RectF rectF = PngjException().get(0);
        int i = pfkrolGetQuality + 1;
        resetAttempt = i % 128;
        if (i % 2 == 0) {
            return rectF;
        }
        throw null;
    }

    @Override // com.identy.e1
    public final void PngjBadCrcException() {
        int i = pfkrolGetQuality + 107;
        resetAttempt = i % 128;
        int i2 = i % 2;
        this.getMatchingTime = false;
    }

    @Override // com.identy.e1
    public final Pair[] PngjExceptionInternal() {
        int i = pfkrolGetQuality;
        int i2 = i + 31;
        resetAttempt = i2 % 128;
        Pair[] pairArr = i2 % 2 != 0 ? new Pair[]{this.pfkrol} : new Pair[]{this.pfkrol};
        int i3 = i + 7;
        resetAttempt = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 45 / 0;
        }
        return pairArr;
    }

    @Override // com.identy.e1
    public final boolean PngjUnsupportedException() {
        boolean PngjUnsupportedException = false;
        try {
            PngjUnsupportedException = super.PngjUnsupportedException();
        } catch (Exception unused) {
        }
        if (this.PngBadCharsetException || this.onErrorResponse || !PngjUnsupportedException) {
            return false;
        }
        int i = (pfkrolGetQuality + 89) % 128;
        resetAttempt = i;
        this.getQualityScore++;
        if (this.CaptureThumbActivity) {
            pfkrolGetQuality = (i + 9) % 128;
            this.getL2Score.values(this.getPadSub3, this.getPadSub2_f, this.getData.intValue(), this.CaptureRolledFingersActivity);
        } else {
            this.getL2Score.values(this.getPadSub2_f, this.getPadSub3, this.getData.intValue(), this.CaptureRolledFingersActivity);
        }
        if (this.getQualityScore >= 1) {
            if (this.getCaptureTime) {
                return false;
            }
            this.Capture2TActivity.postInvalidate();
            this.getCaptureTime = true;
            values(new PngjBadSignature());
            return true;
        }
        int i2 = pfkrolGetQuality + 47;
        int i3 = i2 % 128;
        resetAttempt = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        com.identy.d.PngjBadSignature pngjBadSignature = this.Attempt;
        if (pngjBadSignature != null) {
            int i4 = i3 + 15;
            pfkrolGetQuality = i4 % 128;
            if (i4 % 2 == 0) {
                pngjBadSignature.getData();
                throw null;
            }
            pngjBadSignature.getData();
        }
        return false;
    }

    @Override // com.identy.e1
    public final void a() {
        int values2 = com.identy.PngjInputException.values();
        PngjBadSignature(568689751, com.identy.PngjInputException.values(), new Object[]{this}, com.identy.PngjInputException.values(), -568689751, values2, com.identy.PngjInputException.values());
    }

    @Override // com.identy.e1
    public final void e1() {
        int i;
        resetAttempt = (pfkrolGetQuality + 37) % 128;
        super.e1();
        FingerDetectionMode fingerDetectionMode = this.CapturePosition;
        FingerDetectionMode fingerDetectionMode2 = FingerDetectionMode.LEFT_THUMB;
        if (fingerDetectionMode.equals(fingerDetectionMode2)) {
            int i2 = pfkrolGetQuality + 53;
            resetAttempt = i2 % 128;
            if (i2 % 2 != 0) {
                this.CapturePosition = FingerDetectionMode.RIGHT_THUMB;
                throw null;
            }
            this.CapturePosition = FingerDetectionMode.RIGHT_THUMB;
        } else {
            this.CapturePosition = fingerDetectionMode2;
        }
        this.pfkrol = new Pair(this.CapturePosition.getHand(), this.CapturePosition.getFinger());
        try {
            this.isFoundMatchingTemplates = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (this.a.equals(Hand.LEFT)) {
            pfkrolGetQuality = (resetAttempt + 67) % 128;
            i = R.string.id_searching_left_thumb;
        } else {
            i = R.string.id_searching_right_thumb;
        }
        com.identy.d.PngjBadSignature pngjBadSignature = this.Attempt;
        if (pngjBadSignature != null) {
            resetAttempt = (pfkrolGetQuality + 87) % 128;
            pngjBadSignature.PngjBadSignature(i, false);
        }
    }

    @Override // com.identy.e1
    public final void getPadSub1() {
        pfkrolGetQuality = (resetAttempt + 111) % 128;
        super.getPadSub1();
        if (this.getL1Score != null) {
            int i = pfkrolGetQuality;
            this.getL1Score = null;
            resetAttempt = (i + 63) % 128;
        }
        if (this.Capture2TActivity != null) {
            int i2 = resetAttempt + 65;
            pfkrolGetQuality = i2 % 128;
            int i3 = i2 % 2;
            this.Capture2TActivity = null;
            if (i3 == 0) {
                int i4 = 90 / 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0b05  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x03bd  */
    @Override // com.identy.e1, android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        int i;
        char c;
        int i2;
        char c2;
        char c3;
        int i3;
        int i4;
        int i5;
        Object[] objArr;
        int i6;
        Long valueOf2;
        Object PngjBadSignature2;
        char packedPositionGroup;
        int i7;
        int fadingEdgeLength;
        Object obj;
        Object[] PngjException$1eba2e16;
        Object[] objArr2;
        try {
        Object[] objArr3 = new Object[1];
        e(new int[]{-1676244467, -1703071708, 1706719474, 900826739, -1118099777, 470574448, -1526612644, -1582791603, -1105660864, -1366941366, 350366560, 680354268}, 22 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr3);
        String str = (String) objArr3[0];
        Object[] objArr4 = new Object[1];
        e(new int[]{-271401473, 1915021160, 1243774207, -13120593, 1926285683, -828960240, -1724440136, -666153196}, View.MeasureSpec.getMode(0) + 15, objArr4);
        String str2 = (String) objArr4[0];
        Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-175041514);
        if (PngjBadSignature3 == null) {
            char indexOf = (char) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 31078);
            int indexOf2 = TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 50;
            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1043;
            i2 = -1200224935;
            byte b = $$d[20];
            i = -175041514;
            c2 = '\r';
            c = 20;
            Object[] objArr5 = new Object[1];
            f(b, (byte) (b + 1), $$a[18], objArr5);
            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf, indexOf2, windowTouchSlop, 159283629, false, (String) objArr5[0], null);
        } else {
            i = -175041514;
            c = 20;
            i2 = -1200224935;
            c2 = '\r';
        }
        long j = ((Field) PngjBadSignature3).getLong(null);
        if (j == -1 || j + 4611686018427387776L < ((Long) defpackage.a.i(str, str2, null, null, null)).longValue()) {
            c3 = '0';
            i3 = 2;
            i4 = 3;
            Context applicationContext = context != null ? ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext() : context;
            Object[] objArr6 = new Object[1];
            e(new int[]{-377127188, 1979954923, -946673863, -767101309, 725826624, -191020041, 843321439, -707617266}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 16, objArr6);
            Class<?> cls = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            e(new int[]{-526629029, -295923446, -204638643, -1270275452, -1100282735, -474133330, 1272240934, -2086630726}, 16 - Color.alpha(0), objArr7);
            int intValue = ((Integer) cls.getMethod((String) objArr7[0], Object.class).invoke(null, this)).intValue();
            pfkrolGetQuality = (resetAttempt + 23) % 128;
            try {
                Object[] objArr8 = {applicationContext, Integer.valueOf(intValue), 0, -1810509524};
                byte[] bArr = $$g;
                byte b2 = bArr[25];
                byte b3 = b2;
                i5 = 8;
                Object[] objArr9 = new Object[1];
                g(b3, (byte) (b3 + 1), b2, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                byte b4 = (byte) (bArr[23] - 1);
                byte b5 = bArr[25];
                Object[] objArr10 = new Object[1];
                g(b4, b5, (byte) (b5 + 1), objArr10);
                String str3 = (String) objArr10[0];
                Class cls3 = Integer.TYPE;
                objArr = (Object[]) cls2.getMethod(str3, Context.class, cls3, cls3, cls3).invoke(null, objArr8);
                if (applicationContext != null) {
                    int i8 = pfkrolGetQuality + 57;
                    resetAttempt = i8 % 128;
                    try {
                        if (i8 % 2 != 0) {
                            Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i2);
                            if (PngjBadSignature4 == null) {
                                char c4 = (char) (31078 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                int axisFromString = MotionEvent.axisFromString(BuildConfig.FLAVOR) + 50;
                                int i9 = 1044 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                byte b6 = (byte) ($$e & 117);
                                byte[] bArr2 = $$d;
                                Object[] objArr11 = new Object[1];
                                f(b6, (byte) (-bArr2[2]), (byte) (bArr2[18] - 1), objArr11);
                                PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c4, axisFromString, i9, 1150904546, false, (String) objArr11[0], null);
                            }
                            ((Field) PngjBadSignature4).set(null, objArr);
                            valueOf2 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, new Class[1]).invoke(null, null)).longValue());
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i);
                            if (PngjBadSignature2 == null) {
                                packedPositionGroup = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 31077);
                                i7 = 50 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                fadingEdgeLength = 1043 - Color.argb(0, 0, 0, 0);
                                byte b7 = $$d[c];
                                i6 = 4;
                                Object[] objArr12 = new Object[1];
                                f(b7, (byte) (b7 + 1), $$a[18], objArr12);
                                obj = objArr12[0];
                                PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(packedPositionGroup, i7, fadingEdgeLength, 159283629, false, (String) obj, null);
                                ((Field) PngjBadSignature2).set(null, valueOf2);
                                if (((int[]) objArr[i4])[0] == ((int[]) objArr[i3])[0]) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add((String) objArr[1]);
                                    arrayList.add((String) objArr[0]);
                                    throw null;
                                }
                                Object[] objArr13 = new Object[5];
                                objArr13[i3] = new int[]{0};
                                objArr13[i4] = new int[]{0};
                                objArr13[i6] = new int[1];
                                int i10 = ((int[]) objArr[i6])[0];
                                int i11 = ((int[]) objArr[i4])[0];
                                int i12 = ((int[]) objArr[i3])[0];
                                String str4 = (String) objArr[1];
                                String str5 = (String) objArr[0];
                                objArr13[1] = str4;
                                objArr13[0] = str5;
                                int i13 = ~System.identityHashCode(this);
                                int c5 = defpackage.a.c((~(i13 | (-31821148))) | 10784065, 983, (((~((-592536223) | i13)) | (-31821148)) * (-983)) + 1693105950, i10);
                                int i14 = c5 ^ (c5 << 13);
                                int i15 = i14 ^ (i14 >>> 17);
                                ((int[]) objArr13[i6])[0] = i15 ^ (i15 << 5);
                                int i16 = resetAttempt + 5;
                                pfkrolGetQuality = i16 % 128;
                                if (i16 % 2 == 0) {
                                    Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
                                    if (PngjBadSignature5 == null) {
                                        char myPid = (char) (14830 - (Process.myPid() >> 22));
                                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 28;
                                        int mode = View.MeasureSpec.getMode(0) + 721;
                                        byte b8 = $$d[c];
                                        Object[] objArr14 = new Object[1];
                                        f(b8, (byte) (b8 + 1), $$a[18], objArr14);
                                        PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(myPid, tapTimeout, mode, -815159504, false, (String) objArr14[0], null);
                                    }
                                    ((Field) PngjBadSignature5).getLong(null);
                                    throw null;
                                }
                                Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
                                if (PngjBadSignature6 == null) {
                                    char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 14830);
                                    int resolveSize = View.resolveSize(0, 0) + 28;
                                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 721;
                                    byte b9 = $$d[c];
                                    Object[] objArr15 = new Object[1];
                                    f(b9, (byte) (b9 + 1), $$a[18], objArr15);
                                    PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(threadPriority, resolveSize, scrollDefaultDelay, -815159504, false, (String) objArr15[0], null);
                                }
                                long j2 = ((Field) PngjBadSignature6).getLong(null);
                                if (j2 == -1 || j2 + 4611686018427387817L < ((Long) defpackage.a.i(str, str2, null, null, null)).longValue()) {
                                    int i17 = i5;
                                    int[] iArr = new int[i17];
                                    // fill-array-data instruction
                                    iArr[0] = -377127188;
                                    iArr[1] = 1979954923;
                                    iArr[2] = -946673863;
                                    iArr[3] = -767101309;
                                    iArr[4] = 725826624;
                                    iArr[5] = -191020041;
                                    iArr[6] = 843321439;
                                    iArr[7] = -707617266;
                                    Object[] objArr16 = new Object[1];
                                    e(iArr, '@' - AndroidCharacter.getMirror(c3), objArr16);
                                    Class<?> cls4 = Class.forName((String) objArr16[0]);
                                    int[] iArr2 = new int[i17];
                                    // fill-array-data instruction
                                    iArr2[0] = -526629029;
                                    iArr2[1] = -295923446;
                                    iArr2[2] = -204638643;
                                    iArr2[3] = -1270275452;
                                    iArr2[4] = -1100282735;
                                    iArr2[5] = -474133330;
                                    iArr2[6] = 1272240934;
                                    iArr2[7] = -2086630726;
                                    Object[] objArr17 = new Object[1];
                                    e(iArr2, 16 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), objArr17);
                                    int intValue2 = ((Integer) cls4.getMethod((String) objArr17[0], Object.class).invoke(null, this)).intValue();
                                    try {
                                        Object[] objArr18 = {1097076694};
                                        Object PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1439412966);
                                        if (PngjBadSignature7 == null) {
                                            PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (Process.myPid() >> 22), (-16777192) - Color.rgb(0, 0, 0), 697 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), 1457201313, false, null, new Class[]{Integer.TYPE});
                                        }
                                        PngjException$1eba2e16 = (Object[]) arid.a.valueOf.PngjException$1eba2e16(intValue2, ((Constructor) PngjBadSignature7).newInstance(objArr18), 1696279871);
                                        Object PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                                        if (PngjBadSignature8 == null) {
                                            char c6 = (char) (14831 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                            int i18 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28;
                                            int red = 721 - Color.red(0);
                                            byte b10 = (byte) ($$e - 5);
                                            byte[] bArr3 = $$d;
                                            Object[] objArr19 = new Object[1];
                                            f(b10, bArr3[21], bArr3[18], objArr19);
                                            PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c6, i18, red, -779023007, false, (String) objArr19[0], null);
                                        }
                                        ((Field) PngjBadSignature8).set(null, PngjException$1eba2e16);
                                        try {
                                            Long valueOf3 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, null).invoke(null, null)).longValue());
                                            Object PngjBadSignature9 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
                                            if (PngjBadSignature9 == null) {
                                                char c7 = (char) (14830 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                                                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 29;
                                                int indexOf3 = 720 - TextUtils.indexOf(BuildConfig.FLAVOR, c3, 0, 0);
                                                byte b11 = $$d[c];
                                                Object[] objArr20 = new Object[1];
                                                f(b11, (byte) (b11 + 1), $$a[18], objArr20);
                                                PngjBadSignature9 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c7, modifierMetaStateMask, indexOf3, -815159504, false, (String) objArr20[0], null);
                                            }
                                            ((Field) PngjBadSignature9).set(null, valueOf3);
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
                                    Object PngjBadSignature10 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                                    if (PngjBadSignature10 == null) {
                                        char c8 = (char) (14830 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                                        int alpha = Color.alpha(0) + 28;
                                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 721;
                                        byte b12 = (byte) ($$e - 5);
                                        byte[] bArr4 = $$d;
                                        Object[] objArr21 = new Object[1];
                                        f(b12, bArr4[21], bArr4[18], objArr21);
                                        PngjBadSignature10 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c8, alpha, edgeSlop, -779023007, false, (String) objArr21[0], null);
                                    }
                                    Object[] objArr22 = (Object[]) ((Field) PngjBadSignature10).get(null);
                                    PngjException$1eba2e16 = new Object[i6];
                                    PngjException$1eba2e16[0] = new int[]{0};
                                    PngjException$1eba2e16[1] = new int[1];
                                    PngjException$1eba2e16[i4] = new int[]{0};
                                    int i19 = ((int[]) objArr22[i4])[0];
                                    int i20 = ((int[]) objArr22[0])[0];
                                    PngjException$1eba2e16[i3] = (String[]) objArr22[i3];
                                    int identityHashCode = System.identityHashCode(this);
                                    int i21 = ~((-520856355) | identityHashCode);
                                    int i22 = ~identityHashCode;
                                    int i23 = i21 | (~(513709619 | i22));
                                    int i24 = ~(520856354 | i22);
                                    int c9 = defpackage.a.c(9704465 | i24, 516, (((~(identityHashCode | (-504005155))) | (~(i22 | (-9704466)))) * 516) + ((i23 | i24) * (-516)) + 427313937, 1696279871);
                                    int i25 = c9 ^ (c9 << 13);
                                    int i26 = i25 ^ (i25 >>> 17);
                                    ((int[]) PngjException$1eba2e16[1])[0] = i26 ^ (i26 << 5);
                                }
                                int i27 = ((int[]) PngjException$1eba2e16[0])[0];
                                int i28 = ((int[]) PngjException$1eba2e16[i4])[0];
                                if (i28 != i27) {
                                    ArrayList arrayList2 = new ArrayList();
                                    String[] strArr = (String[]) PngjException$1eba2e16[2];
                                    if (strArr != null) {
                                        for (String str6 : strArr) {
                                            arrayList2.add(str6);
                                        }
                                    }
                                    throw new RuntimeException(String.valueOf(i28));
                                }
                                resetAttempt = (pfkrolGetQuality + com.karumi.dexter.R.styleable.AppCompatTheme_tooltipFrameBackground) % 128;
                                Object[] objArr23 = new Object[4];
                                objArr23[0] = new int[]{0};
                                objArr23[1] = new int[1];
                                objArr23[i4] = new int[]{0};
                                int i29 = ((int[]) PngjException$1eba2e16[1])[0];
                                int i30 = ((int[]) PngjException$1eba2e16[i4])[0];
                                int i31 = ((int[]) PngjException$1eba2e16[0])[0];
                                objArr23[i3] = (String[]) PngjException$1eba2e16[i3];
                                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                                int c10 = defpackage.a.c((~((~startUptimeMillis) | (-547364866))) | 486900000, 449, (((~((-547364866) | startUptimeMillis)) | 486900000) * 449) + 931341652, i29);
                                int i32 = c10 ^ (c10 << 13);
                                int i33 = i32 ^ (i32 >>> 17);
                                ((int[]) objArr23[1])[0] = i33 ^ (i33 << 5);
                                Object PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1556686741);
                                if (PngjBadSignature11 == null) {
                                    char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                                    int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 37;
                                    int i34 = 549 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                    byte b13 = $$d[c];
                                    Object[] objArr24 = new Object[1];
                                    f(b13, (byte) (b13 + 1), $$a[18], objArr24);
                                    PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature(maxKeyCode, tapTimeout2, i34, -1608103378, false, (String) objArr24[0], null);
                                }
                                long j3 = ((Field) PngjBadSignature11).getLong(null);
                                if (j3 == -1 || j3 + 4611686018427387891L < ((Long) defpackage.a.i(str, str2, null, null, null)).longValue()) {
                                    Object[] objArr25 = new Object[1];
                                    e(new int[]{-377127188, 1979954923, -946673863, -767101309, 725826624, -191020041, 843321439, -707617266}, 16 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), objArr25);
                                    Class<?> cls5 = Class.forName((String) objArr25[0]);
                                    Object[] objArr26 = new Object[1];
                                    e(new int[]{-526629029, -295923446, -204638643, -1270275452, -1100282735, -474133330, 1272240934, -2086630726}, 16 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr26);
                                    int intValue3 = ((Integer) cls5.getMethod((String) objArr26[0], Object.class).invoke(null, this)).intValue();
                                    Object[] objArr27 = new Object[i3];
                                    objArr27[1] = -1900814834;
                                    objArr27[0] = Integer.valueOf(intValue3);
                                    Object PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1437710995);
                                    if (PngjBadSignature12 == null) {
                                        int mode2 = View.MeasureSpec.getMode(0) + 37;
                                        int scrollBarFadeDuration = 549 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                        byte[] bArr5 = $$d;
                                        Object[] objArr28 = new Object[1];
                                        f((byte) ($$e - 5), bArr5[21], bArr5[18], objArr28);
                                        String str7 = (String) objArr28[0];
                                        Class cls6 = Integer.TYPE;
                                        PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), mode2, scrollBarFadeDuration, -1453402328, false, str7, new Class[]{cls6, cls6});
                                    }
                                    objArr2 = (Object[]) ((Method) PngjBadSignature12).invoke(null, objArr27);
                                    Object PngjBadSignature13 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1434812162);
                                    if (PngjBadSignature13 == null) {
                                        char edgeSlop2 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                                        int windowTouchSlop2 = 37 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                        int i35 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 549;
                                        byte[] bArr6 = $$d;
                                        Object[] objArr29 = new Object[1];
                                        f((byte) (bArr6[c2] - 1), bArr6[0], (byte) (bArr6[18] - 1), objArr29);
                                        PngjBadSignature13 = com.d.e.a.PngjBadCrcException.PngjBadSignature(edgeSlop2, windowTouchSlop2, i35, 1452666181, false, (String) objArr29[0], null);
                                    }
                                    ((Field) PngjBadSignature13).set(null, objArr2);
                                    try {
                                        Long valueOf4 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, null).invoke(null, null)).longValue());
                                        Object PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1556686741);
                                        if (PngjBadSignature14 == null) {
                                            char combineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                                            int touchSlop = 37 - (ViewConfiguration.getTouchSlop() >> 8);
                                            int mirror = 597 - AndroidCharacter.getMirror('0');
                                            byte b14 = $$d[c];
                                            Object[] objArr30 = new Object[1];
                                            f(b14, (byte) (b14 + 1), $$a[18], objArr30);
                                            PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(combineMeasuredStates, touchSlop, mirror, -1608103378, false, (String) objArr30[0], null);
                                        }
                                        ((Field) PngjBadSignature14).set(null, valueOf4);
                                        i3 = 2;
                                    } catch (Exception unused2) {
                                        throw new RuntimeException();
                                    }
                                } else {
                                    pfkrolGetQuality = (resetAttempt + 27) % 128;
                                    Object PngjBadSignature15 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1434812162);
                                    if (PngjBadSignature15 == null) {
                                        char c11 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                        int indexOf4 = TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 37;
                                        int i36 = 550 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                        byte[] bArr7 = $$d;
                                        Object[] objArr31 = new Object[1];
                                        f((byte) (bArr7[c2] - 1), bArr7[0], (byte) (bArr7[18] - 1), objArr31);
                                        PngjBadSignature15 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c11, indexOf4, i36, 1452666181, false, (String) objArr31[0], null);
                                    }
                                    Object[] objArr32 = (Object[]) ((Field) PngjBadSignature15).get(null);
                                    objArr2 = new Object[i4];
                                    objArr2[0] = new int[1];
                                    objArr2[1] = new int[]{0};
                                    objArr2[i3] = new int[]{0};
                                    int i37 = ((int[]) objArr32[1])[0];
                                    int i38 = ((int[]) objArr32[i3])[0];
                                    int identityHashCode2 = System.identityHashCode(this);
                                    int c12 = defpackage.a.c((~(identityHashCode2 | 979261507)) | 571883520, 302, ((~((-77603741) | identityHashCode2)) * (-604)) + ((((~((~identityHashCode2) | (-77603741))) | (~(1056865247 | identityHashCode2))) * (-302)) - 1779362262), -1900814834);
                                    int i39 = c12 ^ (c12 << 13);
                                    int i40 = i39 ^ (i39 >>> 17);
                                    ((int[]) objArr2[0])[0] = i40 ^ (i40 << 5);
                                }
                                Object obj2 = objArr2[i3];
                                int i41 = ((int[]) obj2)[0];
                                Object obj3 = objArr2[1];
                                int i42 = ((int[]) obj3)[0];
                                if (i42 == i41) {
                                    Object[] objArr33 = {new int[1], new int[1], new int[1]};
                                    int i43 = ((int[]) objArr2[0])[0];
                                    int i44 = ((int[]) obj3)[0];
                                    int i45 = ((int[]) obj2)[0];
                                    ((int[]) objArr33[1])[0] = i44;
                                    ((int[]) objArr33[2])[0] = i45;
                                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                                    int i46 = ~elapsedCpuTime;
                                    int c13 = defpackage.a.c((~(elapsedCpuTime | (-693289))) | (~(i46 | 1362820138)) | (~(101423096 | i46)), 568, (((~((-101423097) | elapsedCpuTime)) | (~((-1362820139) | elapsedCpuTime)) | (~(1463549946 | i46))) * (-568)) + (((((~((-101423097) | i46)) | 693288) | (~((-1362820139) | i46))) * (-1136)) - 69255278), i43);
                                    int i47 = c13 ^ (c13 << 13);
                                    int i48 = i47 ^ (i47 >>> 17);
                                    ((int[]) objArr33[0])[0] = i48 ^ (i48 << 5);
                                } else {
                                    Toast.makeText((Context) null, i42 / (((i42 - 1) * i42) % 2), 0).show();
                                    Object[] objArr34 = {new int[1], new int[1], new int[1]};
                                    int i49 = ((int[]) objArr2[0])[0];
                                    int i50 = ((int[]) objArr2[1])[0];
                                    int i51 = ((int[]) objArr2[2])[0];
                                    ((int[]) objArr34[1])[0] = i50;
                                    ((int[]) objArr34[2])[0] = i51;
                                    int b15 = defpackage.a.b(835252545);
                                    int i52 = (~((-143145352) | b15)) | 143136899;
                                    int c14 = defpackage.a.c(b15 | 1321097883, 496, ((i52 | (~((~b15) | 1321106335))) * (-496)) + (i52 * 992) + 1049072194, i49);
                                    int i53 = c14 ^ (c14 << 13);
                                    int i54 = i53 ^ (i53 >>> 17);
                                    ((int[]) objArr34[0])[0] = i54 ^ (i54 << 5);
                                }
                                super.onReceive(context, intent);
                                return;
                            }
                            i6 = 4;
                            ((Field) PngjBadSignature2).set(null, valueOf2);
                            if (((int[]) objArr[i4])[0] == ((int[]) objArr[i3])[0]) {
                            }
                        } else {
                            i6 = 4;
                            Object PngjBadSignature16 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i2);
                            if (PngjBadSignature16 == null) {
                                char c15 = (char) (31076 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                int touchSlop2 = 49 - (ViewConfiguration.getTouchSlop() >> 8);
                                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 1043;
                                byte b16 = (byte) ($$e & 117);
                                byte[] bArr8 = $$d;
                                Object[] objArr35 = new Object[1];
                                f(b16, (byte) (-bArr8[2]), (byte) (bArr8[18] - 1), objArr35);
                                PngjBadSignature16 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c15, touchSlop2, longPressTimeout, 1150904546, false, (String) objArr35[0], null);
                            }
                            ((Field) PngjBadSignature16).set(null, objArr);
                            valueOf2 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, null).invoke(null, null)).longValue());
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i);
                            if (PngjBadSignature2 == null) {
                                packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 31077);
                                i7 = 49 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                fadingEdgeLength = 1043 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                                byte b17 = $$d[c];
                                Object[] objArr36 = new Object[1];
                                f(b17, (byte) (b17 + 1), $$a[18], objArr36);
                                obj = objArr36[0];
                                PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(packedPositionGroup, i7, fadingEdgeLength, 159283629, false, (String) obj, null);
                            }
                            ((Field) PngjBadSignature2).set(null, valueOf2);
                            if (((int[]) objArr[i4])[0] == ((int[]) objArr[i3])[0]) {
                            }
                        }
                    } catch (Exception unused3) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw new RuntimeException(th2);
                }
                throw new RuntimeException(cause2);
            }
        } else {
            resetAttempt = (pfkrolGetQuality + 123) % 128;
            Object PngjBadSignature17 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i2);
            if (PngjBadSignature17 == null) {
                char rgb = (char) ((-16746139) - Color.rgb(0, 0, 0));
                int i55 = 50 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                int windowTouchSlop3 = 1043 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                i3 = 2;
                i4 = 3;
                byte b18 = (byte) ($$a[18] - 1);
                c3 = '0';
                Object[] objArr37 = new Object[1];
                f((byte) ($$e & 117), (byte) (-$$d[2]), b18, objArr37);
                PngjBadSignature17 = com.d.e.a.PngjBadCrcException.PngjBadSignature(rgb, i55, windowTouchSlop3, 1150904546, false, (String) objArr37[0], null);
            } else {
                c3 = '0';
                i3 = 2;
                i4 = 3;
            }
            Object[] objArr38 = (Object[]) ((Field) PngjBadSignature17).get(null);
            objArr = new Object[5];
            objArr[i3] = new int[]{0};
            objArr[i4] = new int[]{0};
            objArr[4] = new int[1];
            int i56 = ((int[]) objArr38[i4])[0];
            int i57 = ((int[]) objArr38[i3])[0];
            String str8 = (String) objArr38[1];
            String str9 = (String) objArr38[0];
            objArr[1] = str8;
            objArr[0] = str9;
            int identityHashCode3 = System.identityHashCode(this);
            int c16 = defpackage.a.c((~(identityHashCode3 | (-472183811))) | (-490078200), 433, (((~((-152173560) | identityHashCode3)) | (-472183811)) * (-433)) + (((~((~identityHashCode3) | (-337904641))) * 433) - 501127842), -1810509524);
            int i58 = c16 ^ (c16 << 13);
            int i59 = i58 ^ (i58 >>> 17);
            ((int[]) objArr[4])[0] = i59 ^ (i59 << 5);
            i5 = 8;
        }
        i6 = 4;
        if (((int[]) objArr[i4])[0] == ((int[]) objArr[i3])[0]) {
        }
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.identy.e1
    public final void PngjBadCrcException(byte[] bArr, boolean z, List list, List list2, float f, Long l) {
        PngjBadSignature(335695611, com.identy.PngjInputException.values(), new Object[]{this, bArr, Boolean.valueOf(z), list, list2, Float.valueOf(f), l}, com.identy.PngjInputException.values(), -335695610, com.identy.PngjInputException.values(), com.identy.PngjInputException.values());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [double] */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    @Override // com.identy.e1
    public final void valueOf(int i, int i2, int i3, boolean z) {
        throw new UnsupportedOperationException("Method not decompiled");
    }

}
