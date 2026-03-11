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
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
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
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.identy.FingerActivity;
import com.identy.enums.Finger;
import com.identy.enums.FingerDetectionMode;
import com.identy.enums.Hand;
import com.identy.ex.FingerError;
import com.identy.ex.PreCaptureOutput;
import com.karumi.dexter.BuildConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import org.c.a.PngjBadCrcException;
import org.identy.nativealgo.NativeAlgoUtils;
import org.identy.opencv.core.Mat;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class isAuthSucess extends e1 {
    private static  byte[] $$d = null;
    private static  int $$e = 0;
    private static  byte[] $$g = null;
    private static  int $$h = 0;
    private static  byte[] $$l = null;
    private static  int $$m = 0;
    private static int $10;
    private static int $11;
    private static char configureroll;
    private static int destroy;
    private static char pfk;
    private static char pfkrolGetQuality;
    private static int pfkrolfinalize;
    private static char pfkrolfinalizeF;
    Handler configure;
    List pfkrol;
    private List resetAttempt;

    public static Object[] bridgePngjException$1eba2e16(int a, Object b, int c) {
        return PngjException.AnimationAnimationListenerC0024PngjException.RunnableC0025PngjException.PngjException$1eba2e16(a, b, c);
    }

    public class PngjBadCrcException implements org.c.a.PngjBadCrcException.values {
        public PngjBadCrcException() {
        }

        @Override // org.c.a.PngjBadCrcException.values
        public final void drawCallback(Canvas canvas) {
            isAuthSucess isauthsucess = isAuthSucess.this;
            isauthsucess.getL2Score.values(canvas, isauthsucess.getL3Score);
        }
    }

    public class PngjBadSignature implements Runnable {

        /* renamed from: com.identy.isAuthSucess$PngjBadSignature$PngjBadSignature, reason: collision with other inner class name */
        public class RunnableC0023PngjBadSignature implements Runnable {
            public RunnableC0023PngjBadSignature() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                isAuthSucess.this.PngjOutputException();
                isAuthSucess isauthsucess = isAuthSucess.this;
                int i = R.string.id_capturing;
                com.identy.d.PngjBadSignature pngjBadSignature = isauthsucess.Attempt;
                if (pngjBadSignature != null) {
                    pngjBadSignature.PngjBadSignature(i, false);
                }
                isAuthSucess.this.PngjBadCrcException(0);
            }
        }

        public PngjBadSignature() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            long timeInMillis = Calendar.getInstance().getTimeInMillis();
            try {
                try {
                    isAuthSucess.this.PngBadCharsetException();
                    Mat mat = isAuthSucess.this.getFingerPrintQualityScore;
                    if (mat == null || Mat.n_empty(mat.PngjException)) {
                        isAuthSucess isauthsucess = isAuthSucess.this;
                        isauthsucess.getCaptureTime = false;
                        try {
                            if (isauthsucess.Capture2TActivity != null) {
                                isauthsucess.getL2Score.values(isauthsucess.pfkrol);
                                isAuthSucess.this.Capture2TActivity.postInvalidate();
                            }
                            isAuthSucess isauthsucess2 = isAuthSucess.this;
                            Calendar.getInstance().getTimeInMillis();
                            isauthsucess2.getCaptureTime = false;
                            com.identy.d.PngjBadSignature pngjBadSignature = isauthsucess2.Attempt;
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
                    isAuthSucess isauthsucess3 = isAuthSucess.this;
                    if (isauthsucess3.onErrorResponse) {
                        try {
                            if (isauthsucess3.Capture2TActivity != null) {
                                isauthsucess3.getL2Score.values(isauthsucess3.pfkrol);
                                isAuthSucess.this.Capture2TActivity.postInvalidate();
                            }
                            isAuthSucess isauthsucess4 = isAuthSucess.this;
                            Calendar.getInstance().getTimeInMillis();
                            isauthsucess4.getCaptureTime = false;
                            com.identy.d.PngjBadSignature pngjBadSignature2 = isauthsucess4.Attempt;
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
                    if (isauthsucess3.CaptureMode != 0 && timeInMillis > 15000) {
                        isauthsucess3.CaptureMode = 0L;
                    }
                    PreCaptureOutput valueOf = isauthsucess3.valueOf(new Mat(Mat.n_clone(isauthsucess3.getFingerPrintQualityScore.PngjException)));
                    if (valueOf.isGoodToCapture()) {
                        isAuthSucess isauthsucess5 = isAuthSucess.this;
                        isauthsucess5.onErrorResponse = true;
                        isauthsucess5.configure.postDelayed(new RunnableC0023PngjBadSignature(), 10L);
                    } else if (valueOf.getError().equals(FingerError.NO_BOXES)) {
                        isAuthSucess.this.pfkrol.clear();
                        isAuthSucess isauthsucess6 = isAuthSucess.this;
                        int res = valueOf.getError().getRes();
                        com.identy.d.PngjBadSignature pngjBadSignature3 = isauthsucess6.Attempt;
                        if (pngjBadSignature3 != null) {
                            pngjBadSignature3.PngjBadSignature(res, true);
                        }
                    } else {
                        isAuthSucess isauthsucess7 = isAuthSucess.this;
                        isauthsucess7.pfkrol = isauthsucess7.getSpoofScore;
                        if (valueOf.getError().equals(FingerError.CORRECT)) {
                            isAuthSucess.this.PngjBadCrcException(3 - valueOf.getStreakCount());
                        } else {
                            isAuthSucess isauthsucess8 = isAuthSucess.this;
                            int res2 = valueOf.getError().getRes();
                            com.identy.d.PngjBadSignature pngjBadSignature4 = isauthsucess8.Attempt;
                            if (pngjBadSignature4 != null) {
                                pngjBadSignature4.PngjBadSignature(res2, true);
                            }
                        }
                    }
                    try {
                        isAuthSucess isauthsucess9 = isAuthSucess.this;
                        if (isauthsucess9.Capture2TActivity != null) {
                            isauthsucess9.getL2Score.values(isauthsucess9.pfkrol);
                            isAuthSucess.this.Capture2TActivity.postInvalidate();
                        }
                        isAuthSucess isauthsucess10 = isAuthSucess.this;
                        Calendar.getInstance().getTimeInMillis();
                        isauthsucess10.getCaptureTime = false;
                        com.identy.d.PngjBadSignature pngjBadSignature5 = isauthsucess10.Attempt;
                        if (pngjBadSignature5 != null) {
                            pngjBadSignature5.getData();
                        }
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                } catch (Exception e4) {
                    try {
                        if (LibSettings.isSaveCaptured()) {
                            e4.getMessage();
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                    try {
                        isAuthSucess isauthsucess11 = isAuthSucess.this;
                        if (isauthsucess11.Capture2TActivity != null) {
                            isauthsucess11.getL2Score.values(isauthsucess11.pfkrol);
                            isAuthSucess.this.Capture2TActivity.postInvalidate();
                        }
                        isAuthSucess isauthsucess12 = isAuthSucess.this;
                        Calendar.getInstance().getTimeInMillis();
                        isauthsucess12.getCaptureTime = false;
                        com.identy.d.PngjBadSignature pngjBadSignature6 = isauthsucess12.Attempt;
                        if (pngjBadSignature6 != null) {
                            pngjBadSignature6.getData();
                        }
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                }
            } catch (Throwable th) {
                try {
                    isAuthSucess isauthsucess13 = isAuthSucess.this;
                    if (isauthsucess13.Capture2TActivity != null) {
                        isauthsucess13.getL2Score.values(isauthsucess13.pfkrol);
                        isAuthSucess.this.Capture2TActivity.postInvalidate();
                    }
                    isAuthSucess isauthsucess14 = isAuthSucess.this;
                    Calendar.getInstance().getTimeInMillis();
                    isauthsucess14.getCaptureTime = false;
                    com.identy.d.PngjBadSignature pngjBadSignature7 = isauthsucess14.Attempt;
                    if (pngjBadSignature7 != null) {
                        pngjBadSignature7.getData();
                    }
                } catch (Exception e7) {
                    e7.printStackTrace();
                }
                throw new RuntimeException(th);
            }
        }
    }

    public class PngjException implements Runnable {

        public class PngjBadCrcException implements Runnable {
            private /* synthetic */ ImageView PngjBadCrcException;
            private /* synthetic */ Animation valueOf;

            public PngjBadCrcException(ImageView imageView, Animation animation) {
                this.PngjBadCrcException = imageView;
                this.valueOf = animation;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.PngjBadCrcException.clearAnimation();
                this.PngjBadCrcException.setAnimation(null);
                this.PngjBadCrcException.startAnimation(this.valueOf);
            }
        }

        public class PngjBadSignature implements Animation.AnimationListener {
            final /* synthetic */ ImageView valueOf;

            public class values implements Runnable {
                public static int PngjBadSignature;
                public static int PngjException;

                public values() {
                }

                public static int PngjBadSignature() {
                    int i = PngjException;
                    int i2 = i % 9439279;
                    PngjException = i + 1;
                    if (i2 != 0) {
                        return PngjBadSignature;
                    }
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    PngjBadSignature = elapsedCpuTime;
                    return elapsedCpuTime;
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
                isAuthSucess.this.Action.runOnUiThread(new values());
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }
        }

        /* renamed from: com.identy.isAuthSucess$PngjException$PngjException, reason: collision with other inner class name */
        public class AnimationAnimationListenerC0024PngjException implements Animation.AnimationListener {
            final /* synthetic */ ImageView PngjBadCrcException;

            /* renamed from: com.identy.isAuthSucess$PngjException$PngjException$PngjException, reason: collision with other inner class name */
            public class RunnableC0025PngjException implements Runnable {
                private static  byte[] $$a = null;
                private static  int $$b = 0;
                private static  byte[] $$c = null;
                private static  int $$d = 0;
                private static int $10;
                private static int $11;
                private static int PngjBadCrcException;
                private static int PngjException;
                private static byte[] PngjExceptionInternal;
                private static int PngjInputException;
                private static short[] PngjOutputException;
                private static int PngjUnsupportedException;
                private static int valueOf;
                private static int values;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
                /* JADX WARN: Type inference failed for: r5v2, types: [int] */
                /* JADX WARN: Type inference failed for: r5v3 */
                /* JADX WARN: Type inference failed for: r5v5, types: [int] */
                /* JADX WARN: Type inference failed for: r5v6, types: [int] */
                /* JADX WARN: Type inference failed for: r7v1, types: [int] */
                /* JADX WARN: Type inference failed for: r7v4, types: [int] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x0025). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private static String $$e(byte b, short s, short s2) {
                    int i;
                    byte b2;
                    byte[] bArr = $$c;
                    int r7 = s2 + 104;
                    int r5 = 4 - (b * 3);
                    int i2 = s * 2;
                    byte[] bArr2 = new byte[i2 + 1];
                    if (bArr == null) {
                        byte b3 = 0;
                        i = 0;
                        byte b4 = 0;
                        0++;
                        b2 = (byte) (b4 + b3);
                        bArr2[i] = b2 == 0 ? (byte) 1 : (byte) 0;
                        if (i == i2) {
                            return new String(bArr2, 0);
                        }
                        i++;
                        b3 = bArr[0];
                        b4 = b2;
                        0++;
                        b2 = (byte) (b4 + b3);
                        bArr2[i] = b2 == 0 ? (byte) 1 : (byte) 0;
                        if (i == i2) {
                        }
                    } else {
                        i = 0;
                        b2 = 0;
                        bArr2[i] = b2 == 0 ? (byte) 1 : (byte) 0;
                        if (i == i2) {
                        }
                    }
                }

                static {
                    init$1();
                    $10 = 0;
                    $11 = 1;
                    init$0();
                    PngjInputException = 0;
                    PngjUnsupportedException = 1;
                    PngjBadCrcException = 97773958;
                    PngjException = -1703419907;
                    valueOf = -961251528;
                    values = -1641869523;
                    PngjExceptionInternal = new byte[]{122, -123, -116, -115, 119, 114, -121, -1, 1, 15, -13, -29, -16, 9, 3, -11, -1, 6, -51, 72, -29, 28, -29, 7, 15, -16, -80, 77, 15, 58, -60, -54, 54, 38, 53, -52, -58, 48, 58, -61, 8, -10, 63, -58, 54, -51, 49, 114, -115, 38, -39, 38, -62, -54, 53, 117, -120, -54, 37, -42, -35, 38, -36, 46, -49, 33, -35, -22, 99, 33, -47, 63, -47, 39, -42, -43, 40, -113, 112, -113, -125, 117, 116, 93, -65, 84, 93, -94, 65, -82, -83, 88, -84, 82, -83, 94, 18, 43, -46, 42, -40, -116, -120, -101, 103, -117, -49, 48, -117, ByteCompanionObject.MIN_VALUE, 124, -117, -121, ByteCompanionObject.MAX_VALUE, -125, 114, -119, -10, 67, -51, -6, 1, -22, 10, -1, 4, 103, -122, 105, 110, -105, 106, -101, 106, 96, 106, -107, 37, -52, 50, -52, 35, 36, -35, 32, -47, 32, 42, 32, -33, -112, 107, 105, -105, -104, 106, -74, -119, 115, -123, -125, -122, -69, -76, 67, -69, 75, -75, 73, -66, -80, 74, 73, -74, 79, -91, 86, -65, -84, 80, -68, 60, 60, -47, -64, 63, 120, -121, -107, 107, -121, -64, Base64.padSymbol, -117, 109, -105, 115, -115, 125, -117, 104, 31, -8, 26, -32, -23, -23, 4, 21, 81, 107, -116, 110, -108, -99, -99, 112, 97, 89, 121, 119, -114, 117, -123, -118, -118, 103, 118, 37, -33, 47, -41, -42, 36, 54, -39, -44, 39, -48, 43, -37, 70, -126, ByteCompanionObject.MIN_VALUE, -76, 69, -113, 118, -122, 125, -127, -61, 20, -25, 21, 31, -18, 31, 32, -95, 21, 17, 19, -21, 17, -28, 82, -86, 27, 33, -86, -20, 16, 82, 114, -115, -97, 97, -115, -56, 69, 118, -117, 126, -56, 64, 120, 113, -114, -51, 100, 116, 64, -98, 103, -105, 108, -112, -46, -126, ByteCompanionObject.MIN_VALUE, -76, 69, -113, 118, -122, 125, -127, -61, -74, -76, 92, -9, 113, -69, 66, -78, 73, -75, -9, -30, -32, 13, -82, 37, -17, 22, -26, 29, -31, -93, 39, 37, -51, 102, 123, -116, 113, -121, 112, 118, -113, -125, 102, -104, -118, 66, -73, -67, 74, 116, -121, -92, 90, -76, 124, -83, 105, 107, -122, 37, -81, 103, -110, -104, 111, 81, -94, -127, ByteCompanionObject.MAX_VALUE, -111, 89, 54, -120, -115, 112, -56, 68, 114, -115, 122, -52, 69, 99, -59, 48, 114, 115, -53, 79, -123, 124, -116, 119, -117, -55, 102, -94, -96, 77, -18, 101, -81, 86, -90, 93, -95, -29, -14, 54, 52, 0, -119, 49, 119, 4, -3, 2, -3, -7, -59, 50, 1, -4, 9, -65, 55, 15, 6, -7, -70, -36, -28, -19, 18, 81, -105, 104, 103, -98, ByteCompanionObject.MIN_VALUE, -78, 83, 109, -103, 97, -86, 89, ByteCompanionObject.MAX_VALUE, -127, 99, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79};
                }

                public RunnableC0025PngjException() {
                }

                /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                    java.util.NoSuchElementException
                    	at java.base/java.util.TreeMap.key(TreeMap.java:1602)
                    	at java.base/java.util.TreeMap.lastKey(TreeMap.java:298)
                    	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                    	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                    	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                    */
                /* JADX WARN: Multi-variable search skipped. Vars limit reached: 7530 (expected less than 5000) */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v1175 */
                /* JADX WARN: Type inference failed for: r0v436 */
                /* JADX WARN: Type inference failed for: r0v437 */
                public static java.lang.Object[] PngjException$1eba2e16(int r84, java.lang.Object r85, int r86) {
                    /*
                        Method dump skipped, instructions count: 19511
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.identy.isAuthSucess.PngjException.AnimationAnimationListenerC0024PngjException.RunnableC0025PngjException.PngjException$1eba2e16(int, java.lang.Object, int):java.lang.Object[]");
                }

                private static void a(int i, short s, byte b, java.lang.Object[] objArr) {
                    int i2 = i + 4;
                    int i3 = 112 - b;
                    byte[] bArr = $$a;
                    byte[] bArr2 = new byte[3 - s];
                    int i4 = 2 - s;
                    int i5 = -1;
                    if (bArr == null) {
                        i3 = (i3 + (-i4)) - 23;
                        i2++;
                    }
                    while (true) {
                        i5++;
                        bArr2[i5] = (byte) i3;
                        if (i5 == i4) {
                            objArr[0] = new String(bArr2, 0);
                            return;
                        } else {
                            i3 = (i3 + (-bArr[i2])) - 23;
                            i2++;
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:23:0x01a4  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x01a5  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private static void b(int i, boolean z, String str, int i2, int i3, java.lang.Object[] objArr) {
                    int i4;
                    Throwable cause;
                    int i5;
                    char c;
                    long j;
                    char[] charArray = str != null ? str.toCharArray() : null;
                    com.d.e.Action action = new com.d.e.Action();
                    char[] cArr = new char[i];
                    int i6 = 0;
                    action.valueOf = 0;
                    while (true) {
                        int i7 = action.valueOf;
                        if (i7 >= i) {
                            break;
                        }
                        char c2 = charArray[i7];
                        action.values = c2;
                        char c3 = (char) (i3 + c2);
                        cArr[i7] = c3;
                        try {
                            java.lang.Object[] objArr2 = new java.lang.Object[2];
                            objArr2[1] = Integer.valueOf(PngjBadCrcException);
                            objArr2[i6] = Integer.valueOf(c3);
                            java.lang.Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(610361420);
                            if (PngjBadSignature == null) {
                                char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 28;
                                c = 1;
                                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1531;
                                j = 0;
                                byte b = (byte) i6;
                                byte b2 = b;
                                i5 = i6;
                                String $$e = $$e(b, b2, b2);
                                Class cls = Integer.TYPE;
                                PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(packedPositionChild, jumpTapTimeout, maximumDrawingCacheSize, -661778953, false, $$e, new Class[]{cls, cls});
                            } else {
                                i5 = i6;
                                c = 1;
                                j = 0;
                            }
                            cArr[i7] = ((Character) ((Method) PngjBadSignature).invoke(null, objArr2)).charValue();
                            java.lang.Object[] objArr3 = new java.lang.Object[2];
                            objArr3[c] = action;
                            objArr3[i5] = action;
                            java.lang.Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-743328348);
                            if (PngjBadSignature2 == null) {
                                int i8 = i5;
                                PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((-1) - (ExpandableListView.getPackedPositionForChild(i8, i8) > j ? 1 : (ExpandableListView.getPackedPositionForChild(i8, i8) == j ? 0 : -1))), 39 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0'), 190 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 794744863, false, "j", new Class[]{java.lang.Object.class, java.lang.Object.class});
                            }
                            ((Method) PngjBadSignature2).invoke(null, objArr3);
                            i6 = 0;
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
                        char[] cArr2 = new char[i];
                        i4 = 0;
                        System.arraycopy(cArr, 0, cArr2, 0, i);
                        int i9 = action.PngjException;
                        System.arraycopy(cArr2, 0, cArr, i - i9, i9);
                        int i10 = action.PngjException;
                        System.arraycopy(cArr2, i10, cArr, 0, i - i10);
                    } else {
                        i4 = 0;
                    }
                    if (z) {
                        char[] cArr3 = new char[i];
                        action.valueOf = i4;
                        $10 = ($11 + 109) % 128;
                        while (true) {
                            int i11 = action.valueOf;
                            if (i11 >= i) {
                                break;
                            }
                            int i12 = $11 + 35;
                            $10 = i12 % 128;
                            if (i12 % 2 != 0) {
                                cArr3[i11] = cArr[(i - i11) % 0];
                                java.lang.Object[] objArr4 = {action, action};
                                java.lang.Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-743328348);
                                if (PngjBadSignature3 == null) {
                                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) Color.blue(0), (ViewConfiguration.getTapTimeout() >> 16) + 40, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 190, 794744863, false, "j", new Class[]{java.lang.Object.class, java.lang.Object.class});
                                }
                                ((Method) PngjBadSignature3).invoke(null, objArr4);
                            } else {
                                cArr3[i11] = cArr[(i - i11) - 1];
                                java.lang.Object[] objArr5 = {action, action};
                                java.lang.Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-743328348);
                                if (PngjBadSignature4 == null) {
                                    PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) + 1), Color.argb(0, 0, 0, 0) + 40, View.combineMeasuredStates(0, 0) + 190, 794744863, false, "j", new Class[]{java.lang.Object.class, java.lang.Object.class});
                                }
                                ((Method) PngjBadSignature4).invoke(null, objArr5);
                            }
                        }
                        cArr = cArr3;
                    }
                    objArr[0] = new String(cArr);
                }

                private static void c(int i, byte b, short s, int i2, int i3, java.lang.Object[] objArr) {
                    int i4;
                    int i5;
                    int i6;
                    long j;
                    float f;
                    long j2;
                    int i7;
                    int i8;
                    int i9;
                    int i10;
                    int i11;
                    int i12;
                    com.d.e.PngjPrematureEnding pngjPrematureEnding = new com.d.e.PngjPrematureEnding();
                    StringBuilder sb = new StringBuilder();
                    int i13 = 2;
                    try {
                        int i14 = 1;
                        java.lang.Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(valueOf)};
                        int i15 = 0;
                        java.lang.Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1302984176);
                        Class cls = Integer.TYPE;
                        if (PngjBadSignature == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            i4 = -1302984176;
                            PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((-16716887) - Color.rgb(0, 0, 0)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 31, Color.green(0) + 1167, 1320773547, false, $$e(b2, b3, (byte) (b3 + 1)), new Class[]{cls, cls});
                        } else {
                            i4 = -1302984176;
                        }
                        int intValue = ((Integer) ((Method) PngjBadSignature).invoke(null, objArr2)).intValue();
                        if (intValue == -1) {
                            $10 = ($11 + 65) % 128;
                            i5 = 1;
                        } else {
                            i5 = 0;
                        }
                        if (i5 != 0) {
                            byte[] bArr = PngjExceptionInternal;
                            j = 0;
                            if (bArr != null) {
                                int length = bArr.length;
                                byte[] bArr2 = new byte[length];
                                int i16 = 0;
                                f = 0.0f;
                                while (i16 < length) {
                                    java.lang.Object[] objArr3 = {Integer.valueOf(bArr[i16])};
                                    java.lang.Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1053815139);
                                    if (PngjBadSignature2 == null) {
                                        char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14829);
                                        int myPid = (Process.myPid() >> 22) + 28;
                                        i11 = i14;
                                        int capsMode = 721 - TextUtils.getCapsMode(BuildConfig.FLAVOR, i15, i15);
                                        i10 = i13;
                                        byte b4 = (byte) i15;
                                        i12 = i15;
                                        byte b5 = b4;
                                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c, myPid, capsMode, 1038050086, false, $$e(b4, b5, (byte) (b5 + 5)), new Class[]{cls});
                                    } else {
                                        i10 = i13;
                                        i11 = i14;
                                        i12 = i15;
                                    }
                                    bArr2[i16] = ((Byte) ((Method) PngjBadSignature2).invoke(null, objArr3)).byteValue();
                                    i16++;
                                    i14 = i11;
                                    i13 = i10;
                                    i15 = i12;
                                }
                                bArr = bArr2;
                            } else {
                                f = 0.0f;
                            }
                            int i17 = i13;
                            i6 = i14;
                            int i18 = i15;
                            j2 = -6165791747575875761L;
                            if (bArr != null) {
                                int i19 = $10 + 67;
                                $11 = i19 % 128;
                                if (i19 % 2 == 0) {
                                    byte[] bArr3 = PngjExceptionInternal;
                                    java.lang.Object[] objArr4 = new java.lang.Object[i17];
                                    objArr4[i6] = Integer.valueOf(PngjException);
                                    objArr4[i18] = Integer.valueOf(i3);
                                    java.lang.Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i4);
                                    if (PngjBadSignature3 == null) {
                                        byte b6 = (byte) i18;
                                        byte b7 = b6;
                                        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((TypedValue.complexToFloat(i18) > f ? 1 : (TypedValue.complexToFloat(i18) == f ? 0 : -1)) + 60329), ((byte) KeyEvent.getModifierMetaStateMask()) + 33, (ViewConfiguration.getTapTimeout() >> 16) + 1167, 1320773547, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{cls, cls});
                                    }
                                    i9 = ((byte) (bArr3[((Integer) ((Method) PngjBadSignature3).invoke(null, objArr4)).intValue()] ^ (-6165791747575875761L))) * ((int) (valueOf * (-6165791747575875761L)));
                                } else {
                                    byte[] bArr4 = PngjExceptionInternal;
                                    java.lang.Object[] objArr5 = new java.lang.Object[2];
                                    objArr5[i6] = Integer.valueOf(PngjException);
                                    objArr5[0] = Integer.valueOf(i3);
                                    java.lang.Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i4);
                                    if (PngjBadSignature4 == null) {
                                        byte b8 = (byte) 0;
                                        byte b9 = b8;
                                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (60329 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 32 - (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 1168, 1320773547, false, $$e(b8, b9, (byte) (b9 + 1)), new Class[]{cls, cls});
                                    }
                                    i9 = ((byte) (bArr4[((Integer) ((Method) PngjBadSignature4).invoke(null, objArr5)).intValue()] ^ (-6165791747575875761L))) + ((int) (valueOf ^ (-6165791747575875761L)));
                                }
                                intValue = (byte) i9;
                            } else {
                                intValue = (short) (((short) (PngjOutputException[i3 + ((int) (PngjException ^ (-6165791747575875761L)))] ^ (-6165791747575875761L))) + ((int) (valueOf ^ (-6165791747575875761L))));
                                $11 = ($10 + 119) % 128;
                            }
                        } else {
                            i6 = 1;
                            j = 0;
                            f = 0.0f;
                            j2 = -6165791747575875761L;
                        }
                        if (intValue > 0) {
                            pngjPrematureEnding.values = ((i3 + intValue) - 2) + ((int) (PngjException ^ j2)) + i5;
                            int i20 = values;
                            java.lang.Object[] objArr6 = new java.lang.Object[4];
                            objArr6[3] = sb;
                            objArr6[2] = Integer.valueOf(i20);
                            objArr6[i6] = Integer.valueOf(i2);
                            objArr6[0] = pngjPrematureEnding;
                            java.lang.Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1013119226);
                            if (PngjBadSignature5 == null) {
                                byte b10 = (byte) 0;
                                PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (45718 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1))), 40 - (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)), 625 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), 1064463037, false, $$e(b10, b10, (byte) $$c.length), new Class[]{java.lang.Object.class, cls, cls, java.lang.Object.class});
                            }
                            ((StringBuilder) ((Method) PngjBadSignature5).invoke(null, objArr6)).append(pngjPrematureEnding.valueOf);
                            pngjPrematureEnding.PngjBadCrcException = pngjPrematureEnding.valueOf;
                            byte[] bArr5 = PngjExceptionInternal;
                            if (bArr5 != null) {
                                $11 = ($10 + 77) % 128;
                                int length2 = bArr5.length;
                                byte[] bArr6 = new byte[length2];
                                for (int i21 = 0; i21 < length2; i21++) {
                                    $10 = ($11 + 111) % 128;
                                    bArr6[i21] = (byte) (bArr5[i21] ^ j2);
                                }
                                bArr5 = bArr6;
                            }
                            if (bArr5 != null) {
                                $11 = ($10 + 53) % 128;
                                i7 = i6;
                                i8 = i7;
                            } else {
                                i7 = i6;
                                i8 = 0;
                            }
                            while (true) {
                                pngjPrematureEnding.PngjException = i7;
                                if (pngjPrematureEnding.PngjException >= intValue) {
                                    break;
                                }
                                if (i8 != 0) {
                                    $10 = ($11 + 13) % 128;
                                    byte[] bArr7 = PngjExceptionInternal;
                                    pngjPrematureEnding.values = pngjPrematureEnding.values - 1;
                                    pngjPrematureEnding.valueOf = (char) (pngjPrematureEnding.PngjBadCrcException + (((byte) (((byte) (bArr7[0] ^ j2)) + s)) ^ b));
                                } else {
                                    short[] sArr = PngjOutputException;
                                    pngjPrematureEnding.values = pngjPrematureEnding.values - 1;
                                    pngjPrematureEnding.valueOf = (char) (pngjPrematureEnding.PngjBadCrcException + (((short) (((short) (sArr[0] ^ j2)) + s)) ^ b));
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

                public static void init$0() {
                    $$a = new byte[]{117, -53, -53, -125, 29, -13, -28};
                    $$b = 45;
                }

                public static void init$1() {
                    $$c = new byte[]{84, -6, 83, -9};
                    $$d = 80;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ImageView imageView;
                    int i;
                    int i2 = PngjUnsupportedException + 31;
                    PngjInputException = i2 % 128;
                    if (i2 % 2 != 0) {
                        AnimationAnimationListenerC0024PngjException.this.PngjBadCrcException.clearAnimation();
                        imageView = AnimationAnimationListenerC0024PngjException.this.PngjBadCrcException;
                        i = 6;
                    } else {
                        AnimationAnimationListenerC0024PngjException.this.PngjBadCrcException.clearAnimation();
                        imageView = AnimationAnimationListenerC0024PngjException.this.PngjBadCrcException;
                        i = 8;
                    }
                    imageView.setVisibility(i);
                    PngjUnsupportedException = (PngjInputException + 33) % 128;
                }
            }

            public AnimationAnimationListenerC0024PngjException(ImageView imageView) {
                this.PngjBadCrcException = imageView;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                isAuthSucess.this.Action.runOnUiThread(new RunnableC0025PngjException());
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }
        }

        public class valueOf implements Runnable {
            private /* synthetic */ ImageView PngjBadCrcException;
            private /* synthetic */ Animation PngjException;

            public valueOf(ImageView imageView, Animation animation) {
                this.PngjBadCrcException = imageView;
                this.PngjException = animation;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.PngjBadCrcException.clearAnimation();
                this.PngjBadCrcException.setAnimation(null);
                this.PngjBadCrcException.startAnimation(this.PngjException);
            }
        }

        public PngjException() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            org.c.a.PngjBadCrcException pngjBadCrcException = isAuthSucess.this.Capture2TActivity;
            if (pngjBadCrcException != null) {
                ViewGroup.LayoutParams layoutParams = pngjBadCrcException.getLayoutParams();
                Activity activity = isAuthSucess.this.Action;
                int i = R.id.preview;
                layoutParams.height = activity.findViewById(i).getHeight();
                layoutParams.width = isAuthSucess.this.Action.findViewById(i).getWidth();
                isAuthSucess.this.Capture2TActivity.setLayoutParams(layoutParams);
                Activity activity2 = isAuthSucess.this.Action;
                int i2 = R.id.info_layout;
                ViewGroup.LayoutParams layoutParams2 = activity2.findViewById(i2).getLayoutParams();
                layoutParams2.height = isAuthSucess.this.Action.findViewById(i).getHeight();
                layoutParams2.width = isAuthSucess.this.Action.findViewById(i).getWidth();
                isAuthSucess.this.Action.findViewById(i2).setLayoutParams(layoutParams2);
                Activity activity3 = isAuthSucess.this.Action;
                int i3 = R.id.location_error_layout;
                ViewGroup.LayoutParams layoutParams3 = activity3.findViewById(i3).getLayoutParams();
                layoutParams3.height = isAuthSucess.this.Action.findViewById(i).getHeight();
                layoutParams3.width = isAuthSucess.this.Action.findViewById(i).getWidth();
                isAuthSucess.this.Action.findViewById(i3).setLayoutParams(layoutParams3);
                Activity activity4 = isAuthSucess.this.Action;
                int i4 = R.id.scanner_overlay;
                ViewGroup.LayoutParams layoutParams4 = activity4.findViewById(i4).getLayoutParams();
                layoutParams4.height = isAuthSucess.this.Action.findViewById(i).getHeight();
                layoutParams4.width = isAuthSucess.this.Action.findViewById(i).getWidth();
                isAuthSucess.this.Action.findViewById(i4).setLayoutParams(layoutParams4);
                try {
                    if (IdentySdk.getInstance().isInlineGuide()) {
                        InlineGuideOption guideOption = IdentySdk.getInstance().getGuideOption();
                        isAuthSucess isauthsucess = isAuthSucess.this;
                        if (isauthsucess.getProcessingTime != 1) {
                            if (isauthsucess.cvtyuv2bgr.equals(com.identy.CapturePosition.HORIZONTAL)) {
                                return;
                            }
                            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
                            layoutParams5.setMargins(0, 0, 0, 0);
                            Activity activity5 = isAuthSucess.this.Action;
                            int i5 = R.id.inline_guide;
                            ((ImageView) activity5.findViewById(i5)).setLayoutParams(layoutParams5);
                            ((ImageView) isAuthSucess.this.Action.findViewById(i5)).setImageResource(R.drawable.identy_two_finger_guide);
                            if (isAuthSucess.this.cvtyuv2bgr.equals(com.identy.CapturePosition.VERTICAL_FROM_TOP)) {
                                ((ImageView) isAuthSucess.this.Action.findViewById(i5)).setRotation(180.0f);
                            }
                            ImageView imageView = (ImageView) isAuthSucess.this.Action.findViewById(i5);
                            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                            alphaAnimation.setDuration(guideOption.getDuration());
                            alphaAnimation.setInterpolator(new LinearInterpolator());
                            alphaAnimation.setRepeatCount(guideOption.getNumberOfRepeats());
                            alphaAnimation.setRepeatMode(2);
                            isAuthSucess.this.Action.runOnUiThread(new PngjBadCrcException(imageView, alphaAnimation));
                            ViewGroup.LayoutParams layoutParams6 = isAuthSucess.this.Action.findViewById(i5).getLayoutParams();
                            layoutParams6.height = isAuthSucess.this.Action.findViewById(i).getHeight();
                            isAuthSucess.this.Action.findViewById(i5).setLayoutParams(layoutParams6);
                            imageView.setVisibility(0);
                            alphaAnimation.setAnimationListener(new PngjBadSignature(imageView));
                            return;
                        }
                        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, -1);
                        layoutParams7.setMargins(0, 0, 0, 0);
                        Activity activity6 = isAuthSucess.this.Action;
                        int i6 = R.id.inline_guide;
                        ((ImageView) activity6.findViewById(i6)).setLayoutParams(layoutParams7);
                        CapturePosition capturePosition = isAuthSucess.this.cvtyuv2bgr;
                        CapturePosition capturePosition2 = com.identy.CapturePosition.HORIZONTAL;
                        if (capturePosition.equals(capturePosition2)) {
                            Hand hand = isAuthSucess.this.a;
                            if (hand == null || !hand.equals(Hand.LEFT)) {
                                isAuthSucess.this.Action.findViewById(i6).setScaleY(-1.0f);
                                isAuthSucess.this.Action.findViewById(i6).setRotation(180.0f);
                            } else {
                                isAuthSucess.this.Action.findViewById(i6).setRotation(0.0f);
                            }
                        }
                        if (isAuthSucess.this.cvtyuv2bgr.equals(capturePosition2)) {
                            ((ImageView) isAuthSucess.this.Action.findViewById(i6)).setImageResource(R.drawable.identy_single_finger_guide);
                        } else {
                            ImageView imageView2 = (ImageView) isAuthSucess.this.Action.findViewById(i6);
                            int i7 = R.drawable.identy_vertical_single_finger_guide;
                            imageView2.setImageResource(i7);
                            if (isAuthSucess.this.cvtyuv2bgr.equals(com.identy.CapturePosition.VERTICAL_FROM_TOP)) {
                                ((ImageView) isAuthSucess.this.Action.findViewById(i6)).setRotation(180.0f);
                            } else {
                                ((ImageView) isAuthSucess.this.Action.findViewById(i6)).setImageResource(i7);
                            }
                        }
                        ImageView imageView3 = (ImageView) isAuthSucess.this.Action.findViewById(i6);
                        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                        alphaAnimation2.setDuration(guideOption.getDuration());
                        alphaAnimation2.setInterpolator(new LinearInterpolator());
                        alphaAnimation2.setRepeatCount(guideOption.getNumberOfRepeats());
                        alphaAnimation2.setRepeatMode(2);
                        isAuthSucess.this.Action.runOnUiThread(new valueOf(imageView3, alphaAnimation2));
                        ViewGroup.LayoutParams layoutParams8 = isAuthSucess.this.Action.findViewById(i6).getLayoutParams();
                        layoutParams8.height = isAuthSucess.this.Action.findViewById(i).getHeight();
                        isAuthSucess.this.Action.findViewById(i6).setLayoutParams(layoutParams8);
                        imageView3.setVisibility(0);
                        alphaAnimation2.setAnimationListener(new AnimationAnimationListenerC0024PngjException(imageView3));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public class valueOf implements Runnable {
        public static int PngjException;
        public static int values;

        public valueOf() {
        }

        public static int PngjBadSignature() {
            int i = PngjException;
            int i2 = i % 8010521;
            PngjException = i + 1;
            if (i2 != 0) {
                return values;
            }
            int myUid = Process.myUid();
            values = myUid;
            return myUid;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                isAuthSucess.this.getPadSub3();
            } catch (Exception unused) {
            }
        }
    }

    public class values implements Runnable {
        public values() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            isAuthSucess isauthsucess = isAuthSucess.this;
            isauthsucess.getL1Score = (com.identy.ui.PngjBadCrcException) isauthsucess.Action.findViewById(R.id.scanner_overlay);
            isAuthSucess.this.getPadSub3();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$n(short s, byte b, int i) {
        int i2;
        int i3;
        int i4 = 114 - (b * 4);
        byte[] bArr = $$l;
        int i5 = 1 - (s * 4);
        int i6 = i + 4;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            i4 = i5;
            byte[] bArr3 = bArr;
            i3 = 0;
            int i7 = i6;
            i4 += -i6;
            i6 = i7;
            bArr = bArr3;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            int i8 = i6 + 1;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
            byte b2 = bArr[i8];
            byte[] bArr4 = bArr;
            i7 = i8;
            i6 = b2;
            bArr3 = bArr4;
            i4 += -i6;
            i6 = i7;
            bArr = bArr3;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            int i82 = i6 + 1;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            int i822 = i6 + 1;
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
        destroy = 0;
        pfkrolfinalize = 1;
        configureroll = (char) 12278;
        pfk = (char) 43560;
        pfkrolGetQuality = (char) 34693;
        pfkrolfinalizeF = (char) 63399;
    }

    public isAuthSucess(Activity activity, com.identy.d.PngjBadSignature pngjBadSignature, FingerDetectionMode fingerDetectionMode, Finger[] fingerArr, boolean z, boolean z2) {
        super(activity, z2, fingerDetectionMode, true, false);
        this.resetAttempt = null;
        this.pfkrol = new LinkedList();
        new NativeAlgoUtils();
        this.getProcessingTime = fingerArr.length;
        this.Action = activity;
        this.Attempt = pngjBadSignature;
        this.configure = new Handler(this.Action.getMainLooper());
        com.identy.e1.PngjOutputException = 0L;
        this.getOveralTimetaken = new float[0];
        this.a = fingerDetectionMode.getHand();
        this.resetAttempt = new ArrayList(Arrays.asList(fingerArr));
        this.getL3Score = z;
        this.Capture2IndexActivity = new com.identy.PngjOutputException(PngjExceptionInternal());
        int Attempt = Attempt();
        com.identy.d.PngjBadSignature pngjBadSignature2 = this.Attempt;
        if (pngjBadSignature2 != null) {
            pngjBadSignature2.PngjBadSignature(Attempt, false);
        }
        CapturePosition capturePosition = this.cvtyuv2bgr;
        CapturePosition capturePosition2 = com.identy.CapturePosition.HORIZONTAL;
        if (capturePosition.equals(capturePosition2)) {
            return;
        }
        int i = this.getProcessingTime;
        if (i > 2) {
            this.cvtyuv2bgr = capturePosition2;
        }
        if (i == 2) {
            Pair[] PngjExceptionInternal = PngjExceptionInternal();
            if (Math.abs(Position.getFromHandFinger(PngjExceptionInternal[0]).ordinal() - Position.getFromHandFinger(PngjExceptionInternal[1]).ordinal()) != 1) {
                this.cvtyuv2bgr = capturePosition2;
            }
        }
    }

    private int Attempt() {
        if (!this.a.equals(Hand.LEFT)) {
            int i = this.getProcessingTime;
            if (i == 1) {
                int i2 = destroy + com.karumi.dexter.R.styleable.AppCompatTheme_tooltipFrameBackground;
                pfkrolfinalize = i2 % 128;
                if (i2 % 2 != 0 ? i == 1 : i == 1) {
                    if (this.resetAttempt.size() == 1) {
                        if (((Finger) this.resetAttempt.get(0)).equals(Finger.INDEX)) {
                            return R.string.id_searching_right_index;
                        }
                        if (((Finger) this.resetAttempt.get(0)).equals(Finger.MIDDLE)) {
                            int i3 = R.string.id_searching_right_middle;
                            pfkrolfinalize = (destroy + 113) % 128;
                            return i3;
                        }
                        if (((Finger) this.resetAttempt.get(0)).equals(Finger.RING)) {
                            return R.string.id_searching_right_ring;
                        }
                        if (((Finger) this.resetAttempt.get(0)).equals(Finger.LITTLE)) {
                            return R.string.id_searching_right_little;
                        }
                    }
                }
            } else if (i == 2) {
                destroy = (pfkrolfinalize + 81) % 128;
                if (this.resetAttempt.size() == 2 && this.resetAttempt.contains(Finger.INDEX) && this.resetAttempt.contains(Finger.MIDDLE)) {
                    return R.string.id_searching_right_index_middle;
                }
            }
            return R.string.id_searching_right;
        }
        if (this.getProcessingTime == 1) {
            pfkrolfinalize = (destroy + 105) % 128;
            if (this.resetAttempt.size() == 1) {
                if (((Finger) this.resetAttempt.get(0)).equals(Finger.INDEX)) {
                    return R.string.id_searching_left_index;
                }
                if (!(!((Finger) this.resetAttempt.get(0)).equals(Finger.MIDDLE))) {
                    int i4 = destroy + 125;
                    pfkrolfinalize = i4 % 128;
                    if (i4 % 2 != 0) {
                        return R.string.id_searching_left_middle;
                    }
                    int i5 = 7 / 0;
                    return R.string.id_searching_left_middle;
                }
                if (((Finger) this.resetAttempt.get(0)).equals(Finger.RING)) {
                    pfkrolfinalize = (destroy + 91) % 128;
                    return R.string.id_searching_left_ring;
                }
                if (((Finger) this.resetAttempt.get(0)).equals(Finger.LITTLE)) {
                    return R.string.id_searching_left_little;
                }
                return R.string.id_searching_left;
            }
        }
        if (this.getProcessingTime == 2 && this.resetAttempt.size() == 2 && this.resetAttempt.contains(Finger.INDEX)) {
            int i6 = pfkrolfinalize + 17;
            destroy = i6 % 128;
            if (i6 % 2 != 0) {
                this.resetAttempt.contains(Finger.MIDDLE);
                throw null;
            }
            if (!(!this.resetAttempt.contains(Finger.MIDDLE))) {
                return R.string.id_searching_left_index_middle;
            }
        }
        return R.string.id_searching_left;
    }

    public static /* synthetic */ java.lang.Object PngjBadSignature(java.lang.Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = i7 | i;
        int i9 = ~i8;
        int i10 = ~i2;
        int i11 = i9 | (~(i10 | i));
        int i12 = i8 | i10;
        int i13 = (~(i2 | i)) | (~(i7 | (~i)));
        int i14 = (1761575915 * i5) + ((-1311665080) * i3) + i + i6 + i4;
        int i15 = i14 * i14;
        int i16 = (1783169024 * i15) + ((-649461760) * i5) + (175112192 * i3) + ((-77725696) * i4) + ((-1995296350) * i13) + (1995296350 * i12) + (i11 * (-1995296350)) + (1917570655 * i6) + ((-2073022045) * i) + 412680192;
        int i17 = i13 * 510;
        int i18 = i4 * 1226043599;
        int i19 = i3 * (-858626504);
        int i20 = i5 * 1069087493;
        int i21 = i15 * 1627848704;
        int i22 = i21 + i20 + i19 + i18 + i17 + (i12 * (-510)) + (i11 * 510) + (i6 * 1226043089) + ((i * 1226044109) - 1701849991);
        return ((i22 * i22) * 739704832) + i16 != 1 ? PngjBadCrcException(objArr) : valueOf(objArr);
    }

    private static void e(String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : null;
        com.d.e.PngjOutputException pngjOutputException = new com.d.e.PngjOutputException();
        char[] cArr = new char[charArray.length];
        int i2 = 0;
        pngjOutputException.values = 0;
        int i3 = 2;
        char[] cArr2 = new char[2];
        while (true) {
            int i4 = pngjOutputException.values;
            if (i4 >= charArray.length) {
                objArr[0] = new String(cArr, 0, i);
                return;
            }
            $10 = ($11 + 111) % 128;
            cArr2[i2] = charArray[i4];
            char c = 1;
            cArr2[1] = charArray[i4 + 1];
            int i5 = 58224;
            int i6 = i2;
            while (i6 < 16) {
                $11 = ($10 + 125) % 128;
                char c2 = cArr2[c];
                char c3 = cArr2[i2];
                char c4 = c;
                int i7 = i3;
                char[] cArr3 = cArr2;
                int i8 = (c3 + i5) ^ ((c3 << 4) + ((char) (pfkrolGetQuality ^ (-4937072311772145044L))));
                int i9 = c3 >>> 5;
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[4];
                    objArr2[3] = Integer.valueOf(pfkrolfinalizeF);
                    objArr2[i7] = Integer.valueOf(i9);
                    objArr2[c4] = Integer.valueOf(i8);
                    objArr2[i2] = Integer.valueOf(c2);
                    java.lang.Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-222953304);
                    Class cls = Integer.TYPE;
                    if (PngjBadSignature2 == null) {
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) View.MeasureSpec.getSize(i2), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 34, 155 - View.resolveSizeAndState(i2, i2, i2), 240741651, false, "n", new Class[]{cls, cls, cls, cls});
                    }
                    char charValue = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr2)).charValue();
                    cArr3[c4] = charValue;
                    char c5 = cArr3[i2];
                    int i10 = i2;
                    int i11 = (charValue + i5) ^ ((charValue << 4) + ((char) (configureroll ^ (-4937072311772145044L))));
                    int i12 = charValue >>> 5;
                    java.lang.Object[] objArr3 = new java.lang.Object[4];
                    objArr3[3] = Integer.valueOf(pfk);
                    objArr3[i7] = Integer.valueOf(i12);
                    objArr3[c4] = Integer.valueOf(i11);
                    objArr3[i10] = Integer.valueOf(c5);
                    java.lang.Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-222953304);
                    if (PngjBadSignature3 == null) {
                        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 35 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, i10), ExpandableListView.getPackedPositionChild(0L) + 156, 240741651, false, "n", new Class[]{cls, cls, cls, cls});
                    }
                    cArr3[0] = ((Character) ((Method) PngjBadSignature3).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6++;
                    c = c4;
                    i3 = i7;
                    cArr2 = cArr3;
                    i2 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();

                    if (cause == null) {

                        throw new RuntimeException(th);

                    }

                    throw new RuntimeException(cause);
                }
            }
            int i13 = i3;
            char[] cArr4 = cArr2;
            char c6 = c;
            int i14 = pngjOutputException.values;
            cArr[i14] = cArr4[0];
            cArr[i14 + 1] = cArr4[c6];
            java.lang.Object[] objArr4 = new java.lang.Object[i13];
            objArr4[c6] = pngjOutputException;
            objArr4[0] = pngjOutputException;
            java.lang.Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(150653722);
            if (PngjBadSignature4 == null) {
                byte b = (byte) 0;
                byte b2 = b;
                PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (8055 - Process.getGidForName(BuildConfig.FLAVOR)), View.MeasureSpec.getMode(0) + 32, TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 665, -199907679, false, $$n(b, b2, (byte) (b2 - 1)), new Class[]{java.lang.Object.class, java.lang.Object.class});
            }
            ((Method) PngjBadSignature4).invoke(null, objArr4);
            i3 = i13;
            cArr2 = cArr4;
            i2 = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void f(short s, byte b, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4;
        byte[] bArr = $$d;
        int i5 = i + 4;
        int i6 = (s * 38) + 80;
        byte[] bArr2 = new byte[b + 6];
        int i7 = b + 5;
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i8 = 0;
            int i9 = i5;
            int i10 = i9 + (-i6) + 5;
            int i11 = i5;
            i2 = i10;
            i3 = i11;
            bArr = bArr3;
            i4 = i8;
            bArr2[i4] = (byte) i2;
            if (i4 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i12 = i3 + 1;
            int i13 = i2;
            i5 = i12;
            i6 = bArr[i12];
            i8 = i4 + 1;
            bArr3 = bArr;
            i9 = i13;
            int i102 = i9 + (-i6) + 5;
            int i112 = i5;
            i2 = i102;
            i3 = i112;
            bArr = bArr3;
            i4 = i8;
            bArr2[i4] = (byte) i2;
            if (i4 == i7) {
            }
        } else {
            i2 = i6;
            i3 = i5;
            i4 = 0;
            bArr2[i4] = (byte) i2;
            if (i4 == i7) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void g(int i, int i2, byte b, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5 = (b * 31) + 80;
        byte[] bArr = $$g;
        int i6 = 57 - (i2 * 38);
        int i7 = 59 - (i * 56);
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i8 = 0;
            int i9 = i5;
            int i10 = i7;
            int i11 = (i9 + i7) - 7;
            int i12 = i10;
            i5 = i11;
            i7 = i12;
            bArr = bArr3;
            i3 = i8;
            bArr2[i3] = (byte) i5;
            i4 = i3 + 1;
            int i13 = i7 + 1;
            if (i4 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i14 = i5;
            i10 = i13;
            i7 = bArr[i13];
            i8 = i4;
            bArr3 = bArr;
            i9 = i14;
            int i112 = (i9 + i7) - 7;
            int i122 = i10;
            i5 = i112;
            i7 = i122;
            bArr = bArr3;
            i3 = i8;
            bArr2[i3] = (byte) i5;
            i4 = i3 + 1;
            int i132 = i7 + 1;
            if (i4 == i6) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i5;
            i4 = i3 + 1;
            int i1322 = i7 + 1;
            if (i4 == i6) {
            }
        }
    }

    public static void init$0() {
        $$d = new byte[]{48, -79, 4, 52, -25, 12, 2, 45, -26, 2, 38, -42, 20, 35, -46, 26, 3, -6, 1, 16, -1, 6, 26, -6, -4, 21, 27, -18, -25, 12, 2, 42, -46, 26, 3, -6, 1, 16, -1, 6, 26, -6, -4, 21, -9};
        $$e = 139;
    }

    public static void init$1() {
        $$g = new byte[]{100, 91, -82, 96, 10, -4, -50, 60, 5, 19, -1, 20, -10, 9, 19, 6, 13, 5, 4, 4, 7, 0, 20, -61, 41, 37, 0, 10, -33, 38, 10, -10, 29, 5, 14, -6, 26, 8, 4, -6, -58, 51, 37, 0, 10, -33, 38, 10, -26, 54, -8, -23, 58, -14, 9, 18, 11, -4, 13, 6, 37, 0, 10, -33, 38, 10, -26, 54, -8, -23, 58, -14, 9, 18, 11, -4, 13, 6};
        $$h = 200;
    }

    public static void init$2() {
        $$l = new byte[]{5, -70, 93, -40};
        $$m = 65;
    }

    @Override // com.identy.e1
    public final RectF Action() {
        int i = pfkrolfinalize + 35;
        destroy = i % 128;
        int i2 = i % 2;
        RectF rectF = PngjException().get(0);
        int i3 = pfkrolfinalize + 29;
        destroy = i3 % 128;
        if (i3 % 2 == 0) {
            return rectF;
        }
        throw null;
    }

    @Override // com.identy.e1
    public final void PngjBadCrcException() {
        int i = (pfkrolfinalize + 121) % 128;
        destroy = i;
        this.getMatchingTime = false;
        pfkrolfinalize = (i + 123) % 128;
    }

    @Override // com.identy.e1
    public final Pair[] PngjExceptionInternal() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.resetAttempt.iterator();
        pfkrolfinalize = (destroy + 69) % 128;
        while (it.hasNext()) {
            arrayList.add(new Pair(this.a, (Finger) it.next()));
            destroy = (pfkrolfinalize + 61) % 128;
        }
        return (Pair[]) arrayList.toArray(new Pair[arrayList.size()]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (0.onErrorResponse != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if (0 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        0.getQualityScore++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (0.CaptureThumbActivity == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        0.getL2Score.values(0.getPadSub3, 0.getPadSub2, 0.getData.intValue(), 0.CaptureRolledFingersActivity);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        com.identy.isAuthSucess.destroy = (com.identy.isAuthSucess.pfkrolfinalize + 105) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        if (0.getQualityScore >= 1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        0 = 0.Attempt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if (0 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        0 = com.identy.isAuthSucess.pfkrolfinalize + 69;
        com.identy.isAuthSucess.destroy = 0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if ((0 % 2) != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        0.getData();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
    
        com.identy.isAuthSucess.destroy = (com.identy.isAuthSucess.pfkrolfinalize + 65) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        0.getData();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0085, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
    
        if (0.getCaptureTime == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
    
        com.identy.isAuthSucess.pfkrolfinalize = (com.identy.isAuthSucess.destroy + 21) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0095, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0096, code lost:
    
        0.getCaptureTime = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x004e, code lost:
    
        0.getL2Score.values(0.getPadSub2, 0.getPadSub3, 0.getData.intValue(), 0.CaptureRolledFingersActivity);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0021, code lost:
    
        if (0.PngBadCharsetException == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (0.PngBadCharsetException == false) goto L13;
     */
    @Override // com.identy.e1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean PngjUnsupportedException() {
        boolean PngjUnsupportedException;
        int i = destroy + 49;
        pfkrolfinalize = i % 128;
        try {
            if (i % 2 == 0) {
                PngjUnsupportedException = super.PngjUnsupportedException();
                int i2 = 5 / 0;
            } else {
                PngjUnsupportedException = super.PngjUnsupportedException();
            }
            return false;
        } catch (Exception unused) {
        }
        values(new PngjBadSignature());
        return true;
    }

    @Override // com.identy.e1
    public final void a() {
        PngjBadSignature(new java.lang.Object[]{this}, 2120009648, arid.chunks.values.valueOf(), arid.chunks.values.valueOf(), arid.chunks.values.valueOf(), arid.chunks.values.valueOf(), -2120009647);
    }

    @Override // com.identy.e1
    public final void e1() {
        PngjBadSignature(new java.lang.Object[]{this}, -1977365682, arid.chunks.values.valueOf(), arid.chunks.values.valueOf(), arid.chunks.values.valueOf(), arid.chunks.values.valueOf(), 1977365682);
    }

    @Override // com.identy.e1
    public final void getPadSub1() {
        int i = pfkrolfinalize + 7;
        destroy = i % 128;
        if (i % 2 != 0) {
            super.getPadSub1();
            throw null;
        }
        super.getPadSub1();
        if (this.getL1Score != null) {
            int i2 = pfkrolfinalize + 31;
            destroy = i2 % 128;
            if (i2 % 2 != 0) {
                this.getL1Score = null;
                throw null;
            }
            this.getL1Score = null;
        }
        if (this.Capture2TActivity != null) {
            int i3 = destroy + 121;
            pfkrolfinalize = i3 % 128;
            int i4 = i3 % 2;
            this.Capture2TActivity = null;
            if (i4 == 0) {
                throw null;
            }
        }
    }

    public final void getPadSub3() {
        try {
            if (this.getL3Score) {
                return;
            }
            destroy = (pfkrolfinalize + 47) % 128;
            if (IdentySdk.getInstance().getFingerPrintDrawable() == 0) {
                if (this.getProcessingTime != 1) {
                    this.getL1Score.PngjBadSignature(this.a, 8.0d, 8.0d, 8.0d);
                    return;
                }
                this.getL1Score.PngjBadSignature(this.a, 4.0d, 3.5d, 2.0d);
                int i = destroy + 15;
                pfkrolfinalize = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.identy.e1, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        long j;
        char c;
        float f;
        long j2;
        java.lang.Object[] objArr;
        char c2;
        int i;
        java.lang.Object[] objArr2;
        int i2;
        int i3;
        java.lang.Object[] objArr3;
        try {
        destroy = (pfkrolfinalize + 29) % 128;
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        e("䑢ಹ㵸Ꙝ钪謏\udccc鵫뽖휱멠狭즏닕ꕦ榊\udf13퀊헶붿뜋⩖", 23 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr4);
        String str = (String) objArr4[0];
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        e("馩ꦦ玈ⵗ\udf7f⺰厑䖺謩뵍澽Ӽ弖\ue859\udde3；", 15 - Drawable.resolveOpacity(0, 0), objArr5);
        String str2 = (String) objArr5[0];
        java.lang.Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1556686741);
        if (PngjBadSignature2 == null) {
            char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
            int i4 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 37;
            int i5 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 548;
            byte b = (byte) ($$d[18] - 1);
            j = 0;
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            f(b, (byte) (b | 13), $$a[20], objArr6);
            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(bitsPerPixel, i4, i5, -1608103378, false, (String) objArr6[0], null);
        } else {
            j = 0;
        }
        long j3 = ((Field) PngjBadSignature2).getLong(null);
        if (j3 == -1 || j3 + 4611686018427387831L < ((Long) defpackage.a.i(str, str2, null, null, null)).longValue()) {
            c = 3;
            f = 0.0f;
            j2 = -1;
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            e("ᚼ\uf7ca䐐\ud82c匑㰜䑢ಹ㿳澁噫탾쩖벸鳹쯰", 16 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr7);
            Class<?> cls = Class.forName((String) objArr7[0]);
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            e("擑Ԗ᷹㛚ⰽ춷옠繹★У塹嗍㵎蕜橘욛", TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 17, objArr8);
            try {
                java.lang.Object[] objArr9 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr8[0], java.lang.Object.class).invoke(null, this)).intValue()), 847920981};
                java.lang.Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1437710995);
                if (PngjBadSignature3 == null) {
                    char alpha = (char) Color.alpha(0);
                    int green = Color.green(0) + 37;
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 549;
                    byte b2 = (byte) ($$d[18] - 1);
                    byte b3 = (byte) (b2 | 7);
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    f(b2, b3, (byte) (b3 | 16), objArr10);
                    String str3 = (String) objArr10[0];
                    Class cls2 = Integer.TYPE;
                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(alpha, green, maximumDrawingCacheSize, -1453402328, false, str3, new Class[]{cls2, cls2});
                }
                objArr = (java.lang.Object[]) ((Method) PngjBadSignature3).invoke(null, objArr9);
                java.lang.Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1434812162);
                if (PngjBadSignature4 == null) {
                    char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(j) + 1);
                    int i6 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 36;
                    int mode = View.MeasureSpec.getMode(0) + 549;
                    byte b4 = $$d[18];
                    byte b5 = b4;
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    f(b4, b5, (byte) (b5 | 16), objArr11);
                    PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(packedPositionChild, i6, mode, 1452666181, false, (String) objArr11[0], null);
                }
                ((Field) PngjBadSignature4).set(null, objArr);
                try {
                    Long valueOf2 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, null).invoke(null, null)).longValue());
                    java.lang.Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1556686741);
                    if (PngjBadSignature5 == null) {
                        char c3 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 37;
                        int deadChar = 549 - KeyEvent.getDeadChar(0, 0);
                        byte b6 = (byte) ($$d[18] - 1);
                        c2 = 2;
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        f(b6, (byte) (b6 | 13), $$a[20], objArr12);
                        PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c3, pressedStateDuration, deadChar, -1608103378, false, (String) objArr12[0], null);
                    } else {
                        c2 = 2;
                    }
                    ((Field) PngjBadSignature5).set(null, valueOf2);
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
            pfkrolfinalize = (destroy + 39) % 128;
            java.lang.Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1434812162);
            if (PngjBadSignature6 == null) {
                char deadChar2 = (char) KeyEvent.getDeadChar(0, 0);
                int maximumFlingVelocity = 37 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int i7 = 550 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1));
                byte b7 = $$d[18];
                j2 = -1;
                byte b8 = b7;
                f = 0.0f;
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                f(b7, b8, (byte) (b8 | 16), objArr13);
                PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(deadChar2, maximumFlingVelocity, i7, 1452666181, false, (String) objArr13[0], null);
            } else {
                f = 0.0f;
                j2 = -1;
            }
            java.lang.Object[] objArr14 = (java.lang.Object[]) ((Field) PngjBadSignature6).get(null);
            objArr = new java.lang.Object[]{new int[1], new int[]{0}, new int[]{0}};
            int i8 = ((int[]) objArr14[1])[0];
            int i9 = ((int[]) objArr14[2])[0];
            int uptimeMillis = (int) SystemClock.uptimeMillis();
            c = 3;
            int c4 = defpackage.a.c((~(uptimeMillis | (-258076658))) | (~((~uptimeMillis) | 1206166577)), 333, (((~(uptimeMillis | 1206166577)) | (~((-258076658) | 0))) * 333) - 649392977, 847920981);
            int i10 = c4 ^ (c4 << 13);
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[0])[0] = i11 ^ (i11 << 5);
            c2 = 2;
        }
        java.lang.Object obj = objArr[c2];
        int i12 = ((int[]) obj)[0];
        java.lang.Object obj2 = objArr[1];
        int i13 = ((int[]) obj2)[0];
        if (i13 != i12) {
            throw new RuntimeException(String.valueOf(i13));
        }
        pfkrolfinalize = (destroy + 99) % 128;
        java.lang.Object[] objArr15 = {new int[1], new int[1], new int[1]};
        int i14 = ((int[]) objArr[0])[0];
        int i15 = ((int[]) obj2)[0];
        int i16 = ((int[]) obj)[0];
        ((int[]) objArr15[1])[0] = i15;
        ((int[]) objArr15[c2])[0] = i16;
        int identityHashCode = System.identityHashCode(this);
        int c5 = defpackage.a.c((~(identityHashCode | (-803180129))) | (~((~identityHashCode) | 661063106)), 959, (((~((-803180129) | 0)) | (~(identityHashCode | 661063106))) * 959) - 1681993729, i14);
        int i17 = c5 ^ (c5 << 13);
        int i18 = i17 ^ (i17 >>> 17);
        ((int[]) objArr15[0])[0] = i18 ^ (i18 << 5);
        int i19 = pfkrolfinalize + 31;
        destroy = i19 % 128;
        if (i19 % 2 != 0) {
            java.lang.Object PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-175041514);
            if (PngjBadSignature7 == null) {
                char green2 = (char) (31077 - Color.green(0));
                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 49;
                int i20 = 1043 - (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1));
                byte b9 = (byte) ($$d[18] - 1);
                java.lang.Object[] objArr16 = new java.lang.Object[1];
                f(b9, (byte) (b9 | 13), $$a[20], objArr16);
                PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(green2, maxKeyCode, i20, 159283629, false, (String) objArr16[0], null);
            }
            ((Field) PngjBadSignature7).getLong(null);
            throw null;
        }
        java.lang.Object PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-175041514);
        if (PngjBadSignature8 == null) {
            char trimmedLength = (char) (TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 31077);
            int i21 = 49 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1043;
            byte b10 = (byte) ($$d[18] - 1);
            java.lang.Object[] objArr17 = new java.lang.Object[1];
            f(b10, (byte) (b10 | 13), $$a[20], objArr17);
            PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(trimmedLength, i21, scrollBarFadeDuration, 159283629, false, (String) objArr17[0], null);
        }
        long j4 = ((Field) PngjBadSignature8).getLong(null);
        if (j4 == j2 || j4 + 4611686018427387791L < ((Long) defpackage.a.i(str, str2, null, null, null)).longValue()) {
            Context applicationContext = context != null ? ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext() : context;
            java.lang.Object[] objArr18 = new java.lang.Object[1];
            e("ᚼ\uf7ca䐐\ud82c匑㰜䑢ಹ㿳澁噫탾쩖벸鳹쯰", ExpandableListView.getPackedPositionGroup(j) + 16, objArr18);
            Class<?> cls3 = Class.forName((String) objArr18[0]);
            java.lang.Object[] objArr19 = new java.lang.Object[1];
            e("擑Ԗ᷹㛚ⰽ춷옠繹★У塹嗍㵎蕜橘욛", 16 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr19);
            int intValue = ((Integer) cls3.getMethod((String) objArr19[0], java.lang.Object.class).invoke(null, this)).intValue();
            try {
                java.lang.Object[] objArr20 = new java.lang.Object[4];
                objArr20[c] = -246762248;
                objArr20[c2] = 0;
                objArr20[1] = Integer.valueOf(intValue);
                objArr20[0] = applicationContext;
                byte[] bArr = $$g;
                byte b11 = bArr[10];
                i = 4;
                java.lang.Object[] objArr21 = new java.lang.Object[1];
                g((byte) (-b11), bArr[21], (byte) (-b11), objArr21);
                Class<?> cls4 = Class.forName((String) objArr21[0]);
                byte b12 = bArr[21];
                java.lang.Object[] objArr22 = new java.lang.Object[1];
                g(b12, (byte) (-bArr[10]), b12, objArr22);
                String str4 = (String) objArr22[0];
                Class cls5 = Integer.TYPE;
                objArr2 = (java.lang.Object[]) cls4.getMethod(str4, Context.class, cls5, cls5, cls5).invoke(null, objArr20);
                if (applicationContext != null) {
                    java.lang.Object PngjBadSignature9 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1200224935);
                    if (PngjBadSignature9 == null) {
                        char deadChar3 = (char) (KeyEvent.getDeadChar(0, 0) + 31077);
                        int threadPriority = 49 - ((Process.getThreadPriority(0) + 20) >> 6);
                        int i22 = 1044 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1));
                        byte b13 = $$d[18];
                        java.lang.Object[] objArr23 = new java.lang.Object[1];
                        f(b13, (byte) (b13 - 1), $$a[13], objArr23);
                        PngjBadSignature9 = com.d.e.a.PngjBadCrcException.PngjBadSignature(deadChar3, threadPriority, i22, 1150904546, false, (String) objArr23[0], null);
                    }
                    ((Field) PngjBadSignature9).set(null, objArr2);
                    try {
                        Long valueOf3 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, null).invoke(null, null)).longValue());
                        java.lang.Object PngjBadSignature10 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-175041514);
                        if (PngjBadSignature10 == null) {
                            char c6 = (char) (31078 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)));
                            int maximumFlingVelocity2 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 49;
                            int trimmedLength2 = TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 1043;
                            byte b14 = (byte) ($$d[18] - 1);
                            i2 = 0;
                            java.lang.Object[] objArr24 = new java.lang.Object[1];
                            f(b14, (byte) (b14 | 13), $$a[20], objArr24);
                            PngjBadSignature10 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c6, maximumFlingVelocity2, trimmedLength2, 159283629, false, (String) objArr24[0], null);
                        } else {
                            i2 = 0;
                        }
                        ((Field) PngjBadSignature10).set(null, valueOf3);
                        destroy = (pfkrolfinalize + 25) % 128;
                    } catch (Exception unused2) {
                        throw new RuntimeException();
                    }
                } else {
                    i2 = 0;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw new RuntimeException(th2);
                }
                throw new RuntimeException(cause2);
            }
        } else {
            java.lang.Object PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1200224935);
            if (PngjBadSignature11 == null) {
                char size = (char) (View.MeasureSpec.getSize(0) + 31077);
                int i23 = (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 49;
                int offsetBefore = TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 1043;
                byte b15 = $$d[18];
                java.lang.Object[] objArr25 = new java.lang.Object[1];
                f(b15, (byte) (b15 - 1), $$a[13], objArr25);
                PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature(size, i23, offsetBefore, 1150904546, false, (String) objArr25[0], null);
            }
            java.lang.Object[] objArr26 = (java.lang.Object[]) ((Field) PngjBadSignature11).get(null);
            objArr2 = new java.lang.Object[5];
            objArr2[c2] = new int[]{0};
            objArr2[c] = new int[]{0};
            objArr2[4] = new int[1];
            int i24 = ((int[]) objArr26[c])[0];
            int i25 = ((int[]) objArr26[c2])[0];
            String str5 = (String) objArr26[1];
            String str6 = (String) objArr26[0];
            objArr2[1] = str5;
            objArr2[0] = str6;
            int identityHashCode2 = System.identityHashCode(this);
            int i26 = (~((-254249788) | identityHashCode2)) | 101122106;
            int c7 = defpackage.a.c(identityHashCode2 | 370107582, 496, ((i26 | (~((~identityHashCode2) | 523235263))) * (-496)) + (i26 * 992) + 180747657, -246762248);
            int i27 = c7 ^ (c7 << 13);
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr2[4])[0] = i28 ^ (i28 << 5);
            i2 = 0;
            i = 4;
        }
        int i29 = ((int[]) objArr2[c2])[i2];
        int i30 = ((int[]) objArr2[c])[i2];
        if (i30 == i29) {
            java.lang.Object[] objArr27 = new java.lang.Object[5];
            int[] iArr = new int[1];
            objArr27[c2] = iArr;
            int[] iArr2 = new int[1];
            objArr27[c] = iArr2;
            objArr27[i] = new int[1];
            int i31 = ((int[]) objArr2[i])[i2];
            int i32 = ((int[]) objArr2[c])[i2];
            int i33 = ((int[]) objArr2[c2])[i2];
            String str7 = (String) objArr2[1];
            String str8 = (String) objArr2[i2];
            iArr2[i2] = i32;
            iArr[i2] = i33;
            objArr27[1] = str7;
            objArr27[i2] = str8;
            int identityHashCode3 = System.identityHashCode(this);
            int c8 = defpackage.a.c((~(identityHashCode3 | (-663905296))) | (~((~identityHashCode3) | (-39547926))), 333, (((~((-663905296) | 0)) | (~(identityHashCode3 | (-39547926)))) * 333) - 1697330907, i31);
            int i34 = c8 ^ (c8 << 13);
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArr27[i])[i2] = i35 ^ (i35 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add((String) objArr2[1]);
            arrayList.add((String) objArr2[i2]);
            int[] iArr3 = new int[i30];
            int i36 = i30 - 1;
            iArr3[i36] = 1;
            Toast.makeText((Context) null, iArr3[((i30 * i36) % 2) - 1], 1).show();
            java.lang.Object[] objArr28 = new java.lang.Object[5];
            int[] iArr4 = new int[1];
            objArr28[c2] = iArr4;
            int[] iArr5 = new int[1];
            objArr28[c] = iArr5;
            objArr28[i] = new int[1];
            int i37 = ((int[]) objArr2[i])[i2];
            int i38 = ((int[]) objArr2[c])[i2];
            int i39 = ((int[]) objArr2[c2])[i2];
            String str9 = (String) objArr2[1];
            String str10 = (String) objArr2[i2];
            iArr5[i2] = i38;
            iArr4[i2] = i39;
            objArr28[1] = str9;
            objArr28[i2] = str10;
            int identityHashCode4 = System.identityHashCode(this);
            int c9 = defpackage.a.c((~(identityHashCode4 | (-226206534))) | (~((-850563904) | identityHashCode4)) | 3310341, 407, (((~(850563903 | identityHashCode4)) | (~((~identityHashCode4) | 226206533)) | 3310341) * 407) + ((((-1073460096) | 0) * (-814)) - 2116671139), i37);
            int i40 = c9 ^ (c9 << 13);
            int i41 = i40 ^ (i40 >>> 17);
            ((int[]) objArr28[i])[i2] = i41 ^ (i41 << 5);
        }
        java.lang.Object PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
        if (PngjBadSignature12 == null) {
            int i42 = i2;
            float f2 = f;
            char c10 = (char) ((TypedValue.complexToFraction(i42, f2, f2) > f2 ? 1 : (TypedValue.complexToFraction(i42, f2, f2) == f2 ? 0 : -1)) + 14830);
            int i43 = 27 - (ExpandableListView.getPackedPositionForChild(i42, i42) > j ? 1 : (ExpandableListView.getPackedPositionForChild(i42, i42) == j ? 0 : -1));
            int capsMode = 721 - TextUtils.getCapsMode(BuildConfig.FLAVOR, i42, i42);
            byte b16 = (byte) ($$d[18] - 1);
            java.lang.Object[] objArr29 = new java.lang.Object[1];
            f(b16, (byte) (b16 | 13), $$a[20], objArr29);
            PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c10, i43, capsMode, -815159504, false, (String) objArr29[0], null);
        }
        long j5 = ((Field) PngjBadSignature12).getLong(null);
        if (j5 == j2 || j5 + 4611686018427387859L < ((Long) defpackage.a.i(str, str2, null, null, null)).longValue()) {
            java.lang.Object[] objArr30 = new java.lang.Object[1];
            e("ᚼ\uf7ca䐐\ud82c匑㰜䑢ಹ㿳澁噫탾쩖벸鳹쯰", (ViewConfiguration.getTouchSlop() >> 8) + 16, objArr30);
            Class<?> cls6 = Class.forName((String) objArr30[0]);
            java.lang.Object[] objArr31 = new java.lang.Object[1];
            e("擑Ԗ᷹㛚ⰽ춷옠繹★У塹嗍㵎蕜橘욛", 16 - Color.alpha(0), objArr31);
            int intValue2 = ((Integer) cls6.getMethod((String) objArr31[0], java.lang.Object.class).invoke(null, this)).intValue();
            java.lang.Object[] objArr32 = {-2022153982};
            java.lang.Object PngjBadSignature13 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1439412966);
            if (PngjBadSignature13 == null) {
                PngjBadSignature13 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (Process.getGidForName(BuildConfig.FLAVOR) + 1), TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 24, 697 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1457201313, false, null, new Class[]{Integer.TYPE});
            }
            java.lang.Object[] PngjBadSignature$1eba2e16 = FingerActivity.PngjUnsupportedException.PngjBadSignature$1eba2e16(intValue2, ((Constructor) PngjBadSignature13).newInstance(objArr32), -1978388072);
            java.lang.Object PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
            if (PngjBadSignature14 == null) {
                char doubleTapTimeout = (char) (14830 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                int lastIndexOf = 27 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0);
                int keyRepeatDelay = 721 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                byte b17 = (byte) ($$d[18] - 1);
                byte b18 = (byte) (b17 | 7);
                java.lang.Object[] objArr33 = new java.lang.Object[1];
                f(b17, b18, (byte) (b18 | 16), objArr33);
                PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(doubleTapTimeout, lastIndexOf, keyRepeatDelay, -779023007, false, (String) objArr33[0], null);
            }
            ((Field) PngjBadSignature14).set(null, PngjBadSignature$1eba2e16);
            try {
                Long valueOf4 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, null).invoke(null, null)).longValue());
                java.lang.Object PngjBadSignature15 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
                i3 = 0;
                if (PngjBadSignature15 == null) {
                    char c11 = (char) (14830 - (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)));
                    int indexOf = TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 28;
                    int i44 = 722 - (SystemClock.currentThreadTimeMillis() > j2 ? 1 : (SystemClock.currentThreadTimeMillis() == j2 ? 0 : -1));
                    byte b19 = (byte) ($$d[18] - 1);
                    java.lang.Object[] objArr34 = new java.lang.Object[1];
                    f(b19, (byte) (b19 | 13), $$a[20], objArr34);
                    i3 = 0;
                    PngjBadSignature15 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c11, indexOf, i44, -815159504, false, (String) objArr34[0], null);
                }
                ((Field) PngjBadSignature15).set(null, valueOf4);
                objArr3 = PngjBadSignature$1eba2e16;
            } catch (Exception unused3) {
                throw new RuntimeException();
            }
        } else {
            java.lang.Object PngjBadSignature16 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
            if (PngjBadSignature16 == null) {
                char axisFromString = (char) (MotionEvent.axisFromString(BuildConfig.FLAVOR) + 14831);
                int i45 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 28;
                int makeMeasureSpec = 721 - View.MeasureSpec.makeMeasureSpec(0, 0);
                byte b20 = (byte) ($$d[18] - 1);
                byte b21 = (byte) (b20 | 7);
                java.lang.Object[] objArr35 = new java.lang.Object[1];
                f(b20, b21, (byte) (b21 | 16), objArr35);
                PngjBadSignature16 = com.d.e.a.PngjBadCrcException.PngjBadSignature(axisFromString, i45, makeMeasureSpec, -779023007, false, (String) objArr35[0], null);
            }
            java.lang.Object[] objArr36 = (java.lang.Object[]) ((Field) PngjBadSignature16).get(null);
            objArr3 = new java.lang.Object[i];
            objArr3[0] = new int[]{0};
            objArr3[1] = new int[1];
            objArr3[c] = new int[]{0};
            int i46 = ((int[]) objArr36[c])[0];
            int i47 = ((int[]) objArr36[0])[0];
            objArr3[c2] = (String[]) objArr36[c2];
            int identityHashCode5 = System.identityHashCode(this);
            int i48 = ~identityHashCode5;
            int c12 = defpackage.a.c((~(identityHashCode5 | 37806225)) | (~(i48 | 1072372199)), 959, (((~(37806225 | i48)) | (~(identityHashCode5 | 1072372199))) * 959) + 543787099, -1978388072);
            int i49 = c12 ^ (c12 << 13);
            int i50 = i49 ^ (i49 >>> 17);
            i3 = 0;
            ((int[]) objArr3[1])[0] = i50 ^ (i50 << 5);
        }
        int i51 = ((int[]) objArr3[i3])[i3];
        int i52 = ((int[]) objArr3[c])[i3];
        if (i52 != i51) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr = (String[]) objArr3[c2];
            if (strArr != null) {
                for (int i53 = i3; i53 < strArr.length; i53++) {
                    arrayList2.add(strArr[i53]);
                }
            }
            throw new RuntimeException(String.valueOf(i52));
        }
        java.lang.Object[] objArr37 = new java.lang.Object[4];
        int[] iArr6 = new int[1];
        objArr37[i3] = iArr6;
        objArr37[1] = new int[1];
        int[] iArr7 = new int[1];
        objArr37[c] = iArr7;
        int i54 = ((int[]) objArr3[1])[i3];
        int i55 = ((int[]) objArr3[c])[i3];
        int i56 = ((int[]) objArr3[i3])[i3];
        String[] strArr2 = (String[]) objArr3[c2];
        iArr7[i3] = i55;
        iArr6[i3] = i56;
        objArr37[c2] = strArr2;
        int identityHashCode6 = System.identityHashCode(this);
        int c13 = defpackage.a.c(identityHashCode6 | (-151061537), 465, ((849935067 | (~((-184630907) | identityHashCode6))) * 930) + (((~(identityHashCode6 | 849935067)) | (-184630907)) * (-465)) + 914910757, i54);
        int i57 = c13 ^ (c13 << 13);
        int i58 = i57 ^ (i57 >>> 17);
        ((int[]) objArr37[1])[0] = i58 ^ (i58 << 5);
        super.onReceive(context, intent);
        int i59 = destroy + 35;
        pfkrolfinalize = i59 % 128;
        if (i59 % 2 == 0) {
            throw null;
        }
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:5|(1:7)(1:108)|8|(1:9)|(4:11|12|13|(10:15|(5:51|52|53|54|55)(3:17|(1:19)(1:50)|20)|21|22|(2:24|(2:26|(1:28)(1:36))(1:(2:39|(1:41)(1:42))))(4:43|(1:45)(1:49)|46|(1:48))|29|30|31|32|33)(1:(3:92|(1:94)(1:96)|95)(10:63|(5:65|66|67|68|69)(2:75|(3:77|78|79)(5:83|(1:85)(1:91)|86|(1:88)(1:90)|89))|107|22|(0)(0)|29|30|31|32|33)))(3:98|99|(1:101)(3:102|(1:104)(1:106)|105))|70|22|(0)(0)|29|30|31|32|33) */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x04cf  */
    @Override // com.identy.e1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void valueOf(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        super.valueOf(i, i2, i3, z);
        if (this.getMatchingTime) {
            return;
        }
        this.getMatchingTime = true;
        this.getData = Integer.valueOf(this.Action.getWindowManager().getDefaultDisplay().getRotation() + i3);
        org.c.a.PngjBadCrcException pngjBadCrcException = (org.c.a.PngjBadCrcException) this.Action.findViewById(R.id.tracking_overlay);
        this.Capture2TActivity = pngjBadCrcException;
        pngjBadCrcException.setLayerType(1, null);
        if (this.getProcessingTime == 2) {
            Pair[] PngjExceptionInternal = PngjExceptionInternal();
            i4 = Math.abs(Position.getFromHandFinger(PngjExceptionInternal[0]).ordinal() - Position.getFromHandFinger(PngjExceptionInternal[1]).ordinal());
        } else {
            i4 = 0;
        }
        if (this.CaptureThumbActivity) {
            float f = this.getPadSub3;
            float f2 = this.getPadSub2_f;
            this.CaptureRolledFingersActivity = new RectF((int) (f / 6.3f), (int) (f2 / 8.0f), (int) (f - (f / 4.8f)), (int) (f2 - (f / 8.0f)));
            try {
                i5 = this.getProcessingTime;
            } catch (Exception unused) {
            }
            if (i5 == 1) {
                if (this.cvtyuv2bgr.equals(com.identy.CapturePosition.HORIZONTAL)) {
                    float f3 = this.getPadSub3;
                    float f4 = this.getPadSub2_f;
                    this.CaptureRolledFingersActivity = new RectF((int) (f3 / 3.5f), (int) (f4 / 3.5f), (int) (f3 - (f3 / 2.0f)), (int) (f4 - (f3 / 3.6f)));
                    this.getL2Score = new com.identy.ui.d.values(this.Action, 3.5999999046325684d, 3.5d, 3.5d, 2.0d, IdentySdk.getInstance().getFingerPrintDrawable(), IdentySdk.getInstance().isDisableOuterBox(), this.a.equals(Hand.RIGHT) ? 180 : 0, false, this.a.equals(Hand.LEFT), false, this.uxd565jk, this.cvtyuv2bgr);
                } else {
                    try {
                        this.getL2Score = new com.identy.ui.d.values(this.Action, 2.9d, 3.9000000953674316d, 2.9d, 2.740000009536743d, IdentySdk.getInstance().getFingerPrintDrawable(), IdentySdk.getInstance().isDisableOuterBox(), -90, true, this.a.equals(Hand.LEFT), false, this.uxd565jk, this.cvtyuv2bgr);
                    } catch (Exception unused2) {
                    }
                    double d = this.getPadSub3 / 2.9d;
                    float f5 = this.getPadSub2_f;
                    RectF rectF = new RectF((int) d, (int) (0 / 3.9000000953674316d), (int) (0 - d), (int) (f5 - (f5 / 2.74f)));
                    this.CaptureRolledFingersActivity = rectF;
                    rectF.width();
                    this.CaptureRolledFingersActivity.height();
                    try {
                        LibSettings.isSaveCaptured();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                i = 1073741824;
                i2 = 1080033280;
                i3 = 1083808154;
                if (this.CaptureThumbActivity) {
                    this.getScore = (int) (this.CaptureRolledFingersActivity.height() / i3);
                    this.isQualityFailed = (int) (this.CaptureRolledFingersActivity.height() / i2);
                    int i6 = this.getProcessingTime;
                    if (i6 == 1) {
                        if (this.cvtyuv2bgr.equals(com.identy.CapturePosition.HORIZONTAL)) {
                            this.getScore = (int) (this.CaptureRolledFingersActivity.height() * 0.65f);
                            this.isQualityFailed = (int) this.CaptureRolledFingersActivity.height();
                        } else {
                            this.getScore = (int) (this.CaptureRolledFingersActivity.height() * 0.57d);
                            this.isQualityFailed = (int) (this.CaptureRolledFingersActivity.height() * 1.1d);
                        }
                    } else if (i6 == 2 && i4 == 1) {
                        if (this.cvtyuv2bgr.equals(com.identy.CapturePosition.HORIZONTAL)) {
                            this.getScore = (int) ((this.CaptureRolledFingersActivity.height() / i) * 0.65f);
                            this.isQualityFailed = ((int) this.CaptureRolledFingersActivity.height()) / 2;
                        } else {
                            this.getScore = (int) (this.CaptureRolledFingersActivity.width() / 3.7d);
                            this.isQualityFailed = (int) (this.CaptureRolledFingersActivity.width() / i);
                        }
                    }
                } else {
                    int i7 = this.getPadSub2_f;
                    this.getScore = Math.round(((i7 - (i7 / 5)) / 6) * 0.9f);
                    if (z) {
                        int i8 = this.getPadSub2_f;
                        this.isQualityFailed = (int) (((i8 - (i8 / 5)) / 4) * 0.98d);
                    } else {
                        int i9 = this.getPadSub2_f;
                        this.isQualityFailed = (i9 - (i9 / 5)) / 4;
                    }
                    if (this.getProcessingTime == 1) {
                        this.getScore = (int) (this.CaptureRolledFingersActivity.width() * 0.7f);
                        this.isQualityFailed = (int) (this.CaptureRolledFingersActivity.width() * 1.2f);
                    }
                }
                this.CaptureRolledFingersActivity.inset(-50.0f, -50.0f);
                this.Action.runOnUiThread(new values());
                this.Action.runOnUiThread(new PngjException());
                this.Capture2TActivity.valueOf = new PngjBadCrcException();
            }
            if (i5 == 2 && i4 == 1) {
                if (this.cvtyuv2bgr.equals(com.identy.CapturePosition.VERTICAL_FROM_TOP)) {
                    i = 1073741824;
                    i2 = 1080033280;
                    i3 = 1083808154;
                    float f6 = (int) (this.getPadSub3 / 3.0d);
                    double d2 = this.getPadSub2_f / 5.6d;
                    this.CaptureRolledFingersActivity = new RectF(f6, (int) d2, (int) (0 - (0 / 6.0d)), (int) (0 - d2));
                    this.getL2Score = new com.identy.ui.d.values(this.Action, 5.6d, 6.0d, 5.6d, 3.0d, IdentySdk.getInstance().getFingerPrintDrawable(), IdentySdk.getInstance().isDisableOuterBox(), 90, true, false, false, this.uxd565jk, this.cvtyuv2bgr);
                    this.CaptureRolledFingersActivity.width();
                    this.CaptureRolledFingersActivity.height();
                    try {
                        LibSettings.isSaveCaptured();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                } else {
                    i = 1073741824;
                    i2 = 1080033280;
                    i3 = 1083808154;
                    if (this.cvtyuv2bgr.equals(com.identy.CapturePosition.HORIZONTAL)) {
                        float f7 = Build.MANUFACTURER.toUpperCase().trim().contains("INGENICO") ? 4.0f : 2.6f;
                        float f8 = this.getPadSub2_f / 10.0f;
                        float f9 = this.getPadSub3;
                        this.CaptureRolledFingersActivity = new RectF((int) f8, (int) (f9 / 4.75f), (int) (0 - f8), (int) (f9 - (f9 / f7)));
                        this.getL2Score = new com.identy.ui.d.values(this.Action, 10.0d, 4.75d, 10.0d, f7, IdentySdk.getInstance().getFingerPrintDrawable(), IdentySdk.getInstance().isDisableOuterBox(), this.a.equals(Hand.RIGHT) ? 180 : 0, false, this.a.equals(Hand.LEFT), false, this.uxd565jk, this.cvtyuv2bgr);
                    } else {
                        double d3 = this.getPadSub2_f / 5.6d;
                        double d4 = this.getPadSub3;
                        this.CaptureRolledFingersActivity = new RectF((int) d3, (int) (d4 / 6.0d), (int) (0 - d3), (int) (d4 - (d4 / 3.0d)));
                        this.getL2Score = new com.identy.ui.d.values(this.Action, 5.6d, 6.0d, 5.6d, 3.0d, IdentySdk.getInstance().getFingerPrintDrawable(), IdentySdk.getInstance().isDisableOuterBox(), 90, true, false, false, this.uxd565jk, this.cvtyuv2bgr);
                        this.CaptureRolledFingersActivity.width();
                        this.CaptureRolledFingersActivity.height();
                        try {
                            LibSettings.isSaveCaptured();
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                    }
                }
                if (this.CaptureThumbActivity) {
                }
                this.CaptureRolledFingersActivity.inset(-50.0f, -50.0f);
                this.Action.runOnUiThread(new values());
                this.Action.runOnUiThread(new PngjException());
                this.Capture2TActivity.valueOf = new PngjBadCrcException();
            }
            i = 1073741824;
            i2 = 1080033280;
            i3 = 1083808154;
            this.getL2Score = new com.identy.ui.d.values(this.Action, 8.0d, 6.300000190734863d, 8.0d, 4.800000190734863d, IdentySdk.getInstance().getFingerPrintDrawable(), IdentySdk.getInstance().isDisableOuterBox(), this.a.equals(Hand.RIGHT) ? 180 : 0, false, this.a.equals(Hand.LEFT), false, this.uxd565jk, this.cvtyuv2bgr);
        } else {
            i = 1073741824;
            i2 = 1080033280;
            i3 = 1083808154;
            float f10 = this.getPadSub2_f;
            float f11 = this.getPadSub3;
            this.CaptureRolledFingersActivity = new RectF((int) (f10 / 6.3f), (int) (f11 / 8.0f), (int) (f10 - (f10 / 4.8f)), (int) (f11 - (f10 / 8.0f)));
            if (this.getProcessingTime == 1) {
                int i10 = this.getPadSub2_f;
                int i11 = this.getPadSub3;
                this.CaptureRolledFingersActivity = new RectF((int) (i10 / 3.6d), (int) (i11 / 3.5d), i10 - (i10 / 2), i11 - (i11 / 4));
                this.getL2Score = new com.identy.ui.d.values(this.Action, 3.6d, 3.5d, 4.0d, 2.0d, IdentySdk.getInstance().getFingerPrintDrawable(), IdentySdk.getInstance().isDisableOuterBox(), 0, false, this.a.equals(Hand.LEFT), false, this.uxd565jk, this.cvtyuv2bgr);
            } else {
                this.getL2Score = new com.identy.ui.d.values(this.Action, 8.0d, 6.300000190734863d, 8.0d, 4.800000190734863d, IdentySdk.getInstance().getFingerPrintDrawable(), IdentySdk.getInstance().isDisableOuterBox(), this.a.equals(Hand.RIGHT) ? 180 : 0, false, this.a.equals(Hand.LEFT), false, this.uxd565jk, this.cvtyuv2bgr);
            }
        }
        if (this.CaptureThumbActivity) {
        }
        this.CaptureRolledFingersActivity.inset(-50.0f, -50.0f);
        this.Action.runOnUiThread(new values());
        this.Action.runOnUiThread(new PngjException());
        this.Capture2TActivity.valueOf = new PngjBadCrcException();
    }

    @Override // com.identy.e1
    public final void PngjBadCrcException(byte[] bArr, boolean z, List list, List list2, float f, Long l) {
        pfkrolfinalize = (destroy + 21) % 128;
        super.PngjBadCrcException(bArr, z, list, list2, f, l);
        destroy = (pfkrolfinalize + 15) % 128;
    }

    private static /* synthetic */ java.lang.Object PngjBadCrcException(java.lang.Object[] objArr) {
        isAuthSucess isauthsucess = (isAuthSucess) objArr[0];
        int i = destroy + 79;
        pfkrolfinalize = i % 128;
        if (i % 2 == 0) {
            super.e1();
        } else {
            super.e1();
        }
        try {
            isauthsucess.isFoundMatchingTemplates = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        int Attempt = isauthsucess.Attempt();
        com.identy.d.PngjBadSignature pngjBadSignature = isauthsucess.Attempt;
        if (pngjBadSignature == null) {
            return null;
        }
        int i2 = pfkrolfinalize + 3;
        destroy = i2 % 128;
        pngjBadSignature.PngjBadSignature(Attempt, i2 % 2 != 0);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002b, code lost:
    
        0.PngjBadSignature(0, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0029, code lost:
    
        if (0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (0 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        int Attempt;
        com.identy.d.PngjBadSignature pngjBadSignature;
        isAuthSucess isauthsucess = (isAuthSucess) objArr[0];
        int i = pfkrolfinalize + 109;
        destroy = i % 128;
        if (i % 2 != 0) {
            super.a();
            Attempt = isauthsucess.Attempt();
            pngjBadSignature = isauthsucess.Attempt;
            int i2 = 96 / 0;
        } else {
            super.a();
            Attempt = isauthsucess.Attempt();
            pngjBadSignature = isauthsucess.Attempt;
        }
        new Message().what = 0;
        isauthsucess.onErrorResponse = false;
        isauthsucess.getQualityScore = 0L;
        isauthsucess.getL2Score.PngjBadCrcException();
        isauthsucess.Capture2TActivity.postInvalidate();
        isauthsucess.Action.runOnUiThread(isauthsucess.new valueOf());
        com.identy.d.PngjBadSignature pngjBadSignature2 = isauthsucess.Attempt;
        if (pngjBadSignature2 != null) {
            int i3 = pfkrolfinalize + 75;
            destroy = i3 % 128;
            if (i3 % 2 == 0) {
                pngjBadSignature2.getData();
            } else {
                pngjBadSignature2.getData();
                throw null;
            }
        }
        int i4 = destroy + 121;
        pfkrolfinalize = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }
}
