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
import android.os.Handler;
import android.os.Looper;
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
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.Toast;
import com.identy.enums.Finger;
import com.identy.enums.FingerDetectionMode;
import com.identy.enums.Hand;
import com.identy.ex.FingerError;
import com.identy.ex.PreCaptureOutput;
import com.karumi.dexter.BuildConfig;
import com.touchlessid.TouchLessIDSDK$values;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import kotlin.io.encoding.Base64;
import org.c.a.PngjBadCrcException;
import org.identy.nativealgo.NativeAlgoUtils;
import org.identy.opencv.core.Mat;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class getOveralTimetaken extends e1 {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static final byte[] $$l = null;
    private static final int $$m = 0;
    private static int $10;
    private static int $11;
    private static int pfk;
    private static int pfkrolfinalizeF;
    private static long resetAttempt;
    final Handler configure;
    boolean configureroll;
    List pfkrol;

    public class PngjBadCrcException implements PngjBadCrcException.values {
        public PngjBadCrcException() {
        }

        @Override // org.c.a.PngjBadCrcException.values
        public final void drawCallback(Canvas canvas) {
            getOveralTimetaken getoveraltimetaken = getOveralTimetaken.this;
            getoveraltimetaken.getL2Score.values(canvas, getoveraltimetaken.getL3Score);
        }
    }

    public class PngjBadSignature implements Runnable {
        public static int PngjBadCrcException;
        public static int values;
        private /* synthetic */ long PngjBadSignature;

        public class valueOf implements Runnable {
            public valueOf() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                getOveralTimetaken.this.PngjOutputException();
                getOveralTimetaken getoveraltimetaken = getOveralTimetaken.this;
                int i = R.string.id_capturing;
                com.identy.d.PngjBadSignature pngjBadSignature = getoveraltimetaken.Attempt;
                if (pngjBadSignature != null) {
                    pngjBadSignature.PngjBadSignature(i, false);
                }
                getOveralTimetaken.this.PngjBadCrcException(0);
            }
        }

        public PngjBadSignature(long j) {
            this.PngjBadSignature = j;
        }

        public static int valueOf() {
            int i = PngjBadCrcException;
            int i2 = i % 7391431;
            PngjBadCrcException = i + 1;
            if (i2 != 0) {
                return values;
            }
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            values = startUptimeMillis;
            return startUptimeMillis;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.identy.ui.d.values valuesVar;
            com.identy.ui.d.values valuesVar2;
            com.identy.ui.d.values valuesVar3;
            com.identy.ui.d.values valuesVar4;
            try {
                try {
                    getOveralTimetaken.this.PngBadCharsetException();
                    com.identy.PngjBadCrcException.PngjException("generate RGB A frame ", this.PngjBadSignature);
                    getOveralTimetaken getoveraltimetaken = getOveralTimetaken.this;
                    if (getoveraltimetaken.onErrorResponse) {
                        getoveraltimetaken.getCaptureTime = false;
                        try {
                            if (getoveraltimetaken.Capture2TActivity != null && (valuesVar4 = getoveraltimetaken.getL2Score) != null) {
                                valuesVar4.values(getoveraltimetaken.pfkrol);
                                getOveralTimetaken.this.Capture2TActivity.postInvalidate();
                            }
                            getOveralTimetaken getoveraltimetaken2 = getOveralTimetaken.this;
                            Calendar.getInstance().getTimeInMillis();
                            getoveraltimetaken2.getCaptureTime = false;
                            com.identy.d.PngjBadSignature pngjBadSignature = getoveraltimetaken2.Attempt;
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
                    Mat mat = getoveraltimetaken.getFingerPrintQualityScore;
                    if (mat == null || Mat.n_empty(mat.PngjException)) {
                        getOveralTimetaken getoveraltimetaken3 = getOveralTimetaken.this;
                        getoveraltimetaken3.getCaptureTime = false;
                        try {
                            if (getoveraltimetaken3.Capture2TActivity != null && (valuesVar3 = getoveraltimetaken3.getL2Score) != null) {
                                valuesVar3.values(getoveraltimetaken3.pfkrol);
                                getOveralTimetaken.this.Capture2TActivity.postInvalidate();
                            }
                            getOveralTimetaken getoveraltimetaken4 = getOveralTimetaken.this;
                            Calendar.getInstance().getTimeInMillis();
                            getoveraltimetaken4.getCaptureTime = false;
                            com.identy.d.PngjBadSignature pngjBadSignature2 = getoveraltimetaken4.Attempt;
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
                    getOveralTimetaken getoveraltimetaken5 = getOveralTimetaken.this;
                    if (getoveraltimetaken5.CaptureMode != 0 && this.PngjBadSignature > 15000) {
                        getoveraltimetaken5.CaptureMode = 0L;
                    }
                    com.identy.PngjBadCrcException.PngjException("generate RGB A frame  mat ", this.PngjBadSignature);
                    getOveralTimetaken getoveraltimetaken6 = getOveralTimetaken.this;
                    PreCaptureOutput valueOf2 = getoveraltimetaken6.valueOf(new Mat(Mat.n_clone(getoveraltimetaken6.getFingerPrintQualityScore.PngjException)));
                    com.identy.PngjBadCrcException.PngjException("callpfk", this.PngjBadSignature);
                    if (valueOf2.isGoodToCapture()) {
                        getOveralTimetaken getoveraltimetaken7 = getOveralTimetaken.this;
                        getoveraltimetaken7.onErrorResponse = true;
                        getoveraltimetaken7.configure.postDelayed(new valueOf(), 10L);
                    } else if (valueOf2.getError().equals(FingerError.NO_BOXES)) {
                        getOveralTimetaken.this.pfkrol.clear();
                        getOveralTimetaken getoveraltimetaken8 = getOveralTimetaken.this;
                        int res = valueOf2.getError().getRes();
                        com.identy.d.PngjBadSignature pngjBadSignature3 = getoveraltimetaken8.Attempt;
                        if (pngjBadSignature3 != null) {
                            pngjBadSignature3.PngjBadSignature(res, true);
                        }
                    } else {
                        getOveralTimetaken getoveraltimetaken9 = getOveralTimetaken.this;
                        getoveraltimetaken9.pfkrol = getoveraltimetaken9.getSpoofScore;
                        if (valueOf2.getError().equals(FingerError.CORRECT)) {
                            getOveralTimetaken.this.PngjBadCrcException(3 - valueOf2.getStreakCount());
                        } else {
                            getOveralTimetaken getoveraltimetaken10 = getOveralTimetaken.this;
                            int res2 = valueOf2.getError().getRes();
                            com.identy.d.PngjBadSignature pngjBadSignature4 = getoveraltimetaken10.Attempt;
                            if (pngjBadSignature4 != null) {
                                pngjBadSignature4.PngjBadSignature(res2, true);
                            }
                        }
                    }
                } finally {
                    try {
                        getOveralTimetaken getoveraltimetaken11 = getOveralTimetaken.this;
                        if (getoveraltimetaken11.Capture2TActivity != null && (valuesVar2 = getoveraltimetaken11.getL2Score) != null) {
                            valuesVar2.values(getoveraltimetaken11.pfkrol);
                            getOveralTimetaken.this.Capture2TActivity.postInvalidate();
                        }
                        getOveralTimetaken getoveraltimetaken12 = getOveralTimetaken.this;
                        Calendar.getInstance().getTimeInMillis();
                        getoveraltimetaken12.getCaptureTime = false;
                        com.identy.d.PngjBadSignature pngjBadSignature5 = getoveraltimetaken12.Attempt;
                        if (pngjBadSignature5 != null) {
                            pngjBadSignature5.getData();
                        }
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
            } catch (Exception e4) {
                e4.printStackTrace();
                try {
                    getOveralTimetaken getoveraltimetaken13 = getOveralTimetaken.this;
                    if (getoveraltimetaken13.Capture2TActivity != null && (valuesVar = getoveraltimetaken13.getL2Score) != null) {
                        valuesVar.values(getoveraltimetaken13.pfkrol);
                        getOveralTimetaken.this.Capture2TActivity.postInvalidate();
                    }
                    getOveralTimetaken getoveraltimetaken14 = getOveralTimetaken.this;
                    Calendar.getInstance().getTimeInMillis();
                    getoveraltimetaken14.getCaptureTime = false;
                    com.identy.d.PngjBadSignature pngjBadSignature6 = getoveraltimetaken14.Attempt;
                    if (pngjBadSignature6 != null) {
                        pngjBadSignature6.getData();
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    public class PngjException implements Runnable {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10;
        private static int $11;
        private static long PngjBadCrcException;
        private static char PngjBadSignature;
        private static int PngjOutputException;
        private static int PngjUnsupportedException;
        private static long valueOf;
        private static int values;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x0025). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$e(short s, short s2, short s3) {
            int i;
            byte[] bArr = $$c;
            int i2 = s2 + 4;
            int i3 = 120 - s;
            int i4 = s3 * 2;
            byte[] bArr2 = new byte[i4 + 1];
            if (bArr == null) {
                int i5 = i3;
                i3 = i4;
                i = 0;
                i3 += i5;
                i2++;
                bArr2[i] = (byte) i3;
                if (i == i4) {
                    return new String(bArr2, 0);
                }
                i++;
                i5 = bArr[i2];
                i3 += i5;
                i2++;
                bArr2[i] = (byte) i3;
                if (i == i4) {
                }
            } else {
                i = 0;
                i2++;
                bArr2[i] = (byte) i3;
                if (i == i4) {
                }
            }
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            PngjOutputException = 0;
            PngjUnsupportedException = 1;
            PngjBadCrcException = 698259225915410659L;
            values = 30656739;
            PngjBadSignature = (char) 9634;
            valueOf = 6299841537488426841L;
        }

        public PngjException() {
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1602)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:298)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] PngjBadCrcException$52c725b(int r74, java.lang.Object r75) {
            /*
                Method dump skipped, instructions count: 16071
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.identy.getOveralTimetaken.PngjException.PngjBadCrcException$52c725b(int, java.lang.Object):java.lang.Object[]");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:4:0x0022). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(int i, short s, short s2, Object[] objArr) {
            int i2;
            int i3;
            int i4 = 5 - i;
            int i5 = s2 + 97;
            byte[] bArr = $$a;
            int i6 = 3 - s;
            byte[] bArr2 = new byte[i6];
            if (bArr == null) {
                int i7 = i4;
                i3 = 0;
                i4++;
                i5 = (i5 + i7) - 23;
                i2 = i3;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i5;
                if (i3 == i6) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i7 = bArr[i4];
                i4++;
                i5 = (i5 + i7) - 23;
                i2 = i3;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i5;
                if (i3 == i6) {
                }
            } else {
                i2 = 0;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i5;
                if (i3 == i6) {
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static void b(char c, String str, String str2, int i, String str3, Object[] objArr) {
            char[] cArr;
            int i2;
            float f;
            int i3;
            char[] cArr2;
            char c2;
            char c3;
            char[] charArray = str3 != null ? str3.toCharArray() : str3;
            char[] charArray2 = str2 != 0 ? str2.toCharArray() : str2;
            if (str != null) {
                $10 = ($11 + 119) % 128;
                cArr = str.toCharArray();
            } else {
                cArr = str;
            }
            char[] cArr3 = cArr;
            com.d.e.getPadSub2 getpadsub2 = new com.d.e.getPadSub2();
            int length = charArray.length;
            char[] cArr4 = new char[length];
            int length2 = cArr3.length;
            char[] cArr5 = new char[length2];
            int i4 = 0;
            System.arraycopy(charArray, 0, cArr4, 0, length);
            System.arraycopy(cArr3, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            int i5 = 2;
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = charArray2.length;
            char[] cArr6 = new char[length3];
            getpadsub2.PngjBadSignature = 0;
            while (getpadsub2.PngjBadSignature < length3) {
                $11 = ($10 + 29) % 128;
                try {
                    Object[] objArr2 = {getpadsub2};
                    Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(152054586);
                    if (PngjBadSignature2 == null) {
                        char c4 = (char) (TypedValue.complexToFraction(i4, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i4, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int mode = View.MeasureSpec.getMode(i4) + 28;
                        int indexOf = 1854 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', i4);
                        f = 0.0f;
                        byte b = (byte) ($$d & 10);
                        i2 = i5;
                        byte b2 = (byte) (b - 3);
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c4, mode, indexOf, -167819647, false, $$e(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                    } else {
                        i2 = i5;
                        f = 0.0f;
                    }
                    int intValue = ((Integer) ((Method) PngjBadSignature2).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {getpadsub2};
                    Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1496933771);
                    if (PngjBadSignature3 == null) {
                        char scrollBarSize = (char) (35511 - (ViewConfiguration.getScrollBarSize() >> 8));
                        int maxKeyCode = 42 - (KeyEvent.getMaxKeyCode() >> 16);
                        int offsetBefore = 507 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, i4);
                        i3 = i4;
                        byte b3 = (byte) (-1);
                        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(scrollBarSize, maxKeyCode, offsetBefore, 1512699854, false, $$e((byte) 52, b3, (byte) (b3 + 1)), new Class[]{Object.class});
                    } else {
                        i3 = i4;
                    }
                    int intValue2 = ((Integer) ((Method) PngjBadSignature3).invoke(null, objArr3)).intValue();
                    int i6 = cArr4[getpadsub2.PngjBadSignature % 4] * 32718;
                    Object[] objArr4 = new Object[3];
                    objArr4[i2] = Integer.valueOf(cArr5[intValue]);
                    objArr4[1] = Integer.valueOf(i6);
                    objArr4[i3] = getpadsub2;
                    Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1094318588);
                    Class cls = Integer.TYPE;
                    if (PngjBadSignature4 == null) {
                        c2 = 1;
                        int i7 = i3;
                        c3 = 3;
                        cArr2 = charArray2;
                        byte b4 = (byte) (-1);
                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 1), 31 - Drawable.resolveOpacity(i7, i7), MotionEvent.axisFromString(BuildConfig.FLAVOR) + 248, 1110010815, false, $$e((byte) 53, b4, (byte) (b4 + 1)), new Class[]{Object.class, cls, cls});
                    } else {
                        cArr2 = charArray2;
                        c2 = 1;
                        c3 = 3;
                    }
                    ((Method) PngjBadSignature4).invoke(null, objArr4);
                    int i8 = cArr4[intValue2] * 32718;
                    char c5 = cArr5[intValue];
                    int i9 = i2;
                    Object[] objArr5 = new Object[i9];
                    objArr5[c2] = Integer.valueOf(c5);
                    objArr5[0] = Integer.valueOf(i8);
                    Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-2032891769);
                    if (PngjBadSignature5 == null) {
                        byte b5 = (byte) (-1);
                        PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)) - 1), TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 37, Drawable.resolveOpacity(0, 0) + 549, 2050745660, false, $$e((byte) ($$c[c3] - 1), b5, (byte) (b5 + 1)), new Class[]{cls, cls});
                    }
                    cArr5[intValue2] = ((Character) ((Method) PngjBadSignature5).invoke(null, objArr5)).charValue();
                    cArr4[intValue2] = getpadsub2.values;
                    int i10 = getpadsub2.PngjBadSignature;
                    cArr6[i10] = (char) ((((r0 ^ cArr2[i10]) ^ (PngjBadCrcException ^ 698259225915410659L)) ^ ((int) (values ^ 698259225915410659L))) ^ ((char) (PngjBadSignature ^ 698259225915410659L)));
                    getpadsub2.PngjBadSignature = i10 + 1;
                    i5 = i9;
                    charArray2 = cArr2;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            String str4 = new String(cArr6);
            $11 = ($10 + com.karumi.dexter.R.styleable.AppCompatTheme_tooltipFrameBackground) % 128;
            objArr[0] = str4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:59:0x01ca, code lost:
        
            r4[r7] = (char) r5[r7];
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x01d0, code lost:
        
            r1 = new java.lang.Object[]{r3, r3};
            r2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-125632871);
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x01da, code lost:
        
            if (r2 != null) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x01dc, code lost:
        
            r4 = (byte) 0;
            r5 = (byte) (r4 - 1);
            r2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (35510 - android.graphics.ImageFormat.getBitsPerPixel(0)), 43 - (android.media.AudioTrack.getMaxVolume() > r16 ? 1 : (android.media.AudioTrack.getMaxVolume() == r16 ? 0 : -1)), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 507, 74289954, false, $$e(r4, r5, (byte) (r5 + 1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x020f, code lost:
        
            ((java.lang.reflect.Method) r2).invoke(null, r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0214, code lost:
        
            throw null;
         */
        /* JADX WARN: Removed duplicated region for block: B:42:0x026d  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x026e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void c(String str, int i, Object[] objArr) {
            char[] cArr;
            float f;
            Throwable cause;
            char c;
            long j;
            float f2;
            if (str != null) {
                int i2 = $10 + 91;
                $11 = i2 % 128;
                if (i2 % 2 == 0) {
                    str.toCharArray();
                    throw null;
                }
                cArr = str.toCharArray();
            } else {
                cArr = str;
            }
            char[] cArr2 = cArr;
            com.d.e.PngjUnsupportedException pngjUnsupportedException = new com.d.e.PngjUnsupportedException();
            pngjUnsupportedException.PngjBadCrcException = i;
            int length = cArr2.length;
            long[] jArr = new long[length];
            pngjUnsupportedException.valueOf = 0;
            while (true) {
                int i3 = pngjUnsupportedException.valueOf;
                if (i3 >= cArr2.length) {
                    break;
                }
                int i4 = $11 + 17;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                Class cls = Integer.TYPE;
                if (i5 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i3]), pngjUnsupportedException, pngjUnsupportedException};
                        Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-930920279);
                        if (PngjBadSignature2 == null) {
                            c = 1;
                            byte b = (byte) (-1);
                            j = 2636593786896957769L;
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (Process.myTid() >> 22), Gravity.getAbsoluteGravity(0, 0) + 48, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 944, 879502610, false, $$e((byte) ($$d & 29), b, (byte) (b + 1)), new Class[]{cls, Object.class, Object.class});
                        } else {
                            c = 1;
                            j = 2636593786896957769L;
                        }
                        jArr[i3] = ((Long) ((Method) PngjBadSignature2).invoke(null, objArr2)).longValue() % (valueOf + j);
                        Object[] objArr3 = new Object[2];
                        objArr3[c] = pngjUnsupportedException;
                        objArr3[0] = pngjUnsupportedException;
                        Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-125632871);
                        if (PngjBadSignature3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 - 1);
                            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 35510), Color.alpha(0) + 42, 507 - (ViewConfiguration.getPressedStateDuration() >> 16), 74289954, false, $$e(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) PngjBadSignature3).invoke(null, objArr3);
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
                        }
                    }
                } else {
                    Object[] objArr4 = {Integer.valueOf(cArr2[i3]), pngjUnsupportedException, pngjUnsupportedException};
                    Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-930920279);
                    if (PngjBadSignature4 == null) {
                        byte b4 = (byte) (-1);
                        f2 = 0.0f;
                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((-16777216) - Color.rgb(0, 0, 0)), ImageFormat.getBitsPerPixel(0) + 49, 945 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 879502610, false, $$e((byte) ($$d & 29), b4, (byte) (b4 + 1)), new Class[]{cls, Object.class, Object.class});
                    } else {
                        f2 = 0.0f;
                    }
                    jArr[i3] = ((Long) ((Method) PngjBadSignature4).invoke(null, objArr4)).longValue() ^ (valueOf ^ 2636593786896957769L);
                    Object[] objArr5 = {pngjUnsupportedException, pngjUnsupportedException};
                    Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-125632871);
                    if (PngjBadSignature5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 - 1);
                        PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (KeyEvent.getDeadChar(0, 0) + 35511), (AudioTrack.getMaxVolume() > f2 ? 1 : (AudioTrack.getMaxVolume() == f2 ? 0 : -1)) + 41, Color.red(0) + 507, 74289954, false, $$e(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) PngjBadSignature5).invoke(null, objArr5);
                }
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            float f3 = 0.0f;
            char[] cArr3 = new char[length];
            pngjUnsupportedException.valueOf = 0;
            while (true) {
                int i6 = pngjUnsupportedException.valueOf;
                if (i6 >= cArr2.length) {
                    objArr[0] = new String(cArr3);
                    return;
                }
                int i7 = $10 + 79;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    break;
                }
                cArr3[i6] = (char) jArr[i6];
                Object[] objArr6 = {pngjUnsupportedException, pngjUnsupportedException};
                Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-125632871);
                if (PngjBadSignature6 == null) {
                    f = f3;
                    byte b7 = (byte) 0;
                    byte b8 = (byte) (b7 - 1);
                    PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (35511 - Gravity.getAbsoluteGravity(0, 0)), Color.blue(0) + 42, (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)) + 507, 74289954, false, $$e(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Object.class});
                } else {
                    f = f3;
                }
                ((Method) PngjBadSignature6).invoke(null, objArr6);
                f3 = f;
            }
        }

        public static void init$0() {
            $$a = new byte[]{52, -30, -5, 49, -29, 13, 28};
            $$b = 36;
        }

        public static void init$1() {
            $$c = new byte[]{73, -60, 64, 55};
            $$d = 71;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = PngjOutputException + 27;
            int i2 = i % 128;
            PngjUnsupportedException = i2;
            try {
                if (i % 2 == 0) {
                    boolean z = getOveralTimetaken.this.getL3Score;
                    throw null;
                }
                getOveralTimetaken getoveraltimetaken = getOveralTimetaken.this;
                if (getoveraltimetaken.getL3Score) {
                    return;
                }
                int i3 = i2 + 113;
                PngjOutputException = i3 % 128;
                if (i3 % 2 == 0) {
                    getoveraltimetaken.getL1Score.PngjBadSignature(getoveraltimetaken.a, 8.0d, 8.0d, 8.0d);
                } else {
                    getoveraltimetaken.getL1Score.PngjBadSignature(getoveraltimetaken.a, 8.0d, 8.0d, 8.0d);
                    int i4 = 92 / 0;
                }
            } catch (Exception unused) {
            }
        }
    }

    public class values implements Runnable {
        private /* synthetic */ long PngjBadSignature;

        public class valueOf implements Animation.AnimationListener {
            final /* synthetic */ ImageView PngjBadCrcException;

            /* renamed from: com.identy.getOveralTimetaken$values$valueOf$values, reason: collision with other inner class name */
            public class RunnableC0021values implements Runnable {
                public RunnableC0021values() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    valueOf.this.PngjBadCrcException.clearAnimation();
                    valueOf.this.PngjBadCrcException.setVisibility(8);
                }
            }

            public valueOf(ImageView imageView) {
                this.PngjBadCrcException = imageView;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                getOveralTimetaken.this.Action.runOnUiThread(new RunnableC0021values());
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }
        }

        /* renamed from: com.identy.getOveralTimetaken$values$values, reason: collision with other inner class name */
        public class AnimationAnimationListenerC0022values implements Animation.AnimationListener {
            final /* synthetic */ ImageView PngjException;
            final /* synthetic */ Animation valueOf;

            /* renamed from: com.identy.getOveralTimetaken$values$values$PngjException */
            public class PngjException implements Runnable {
                public static int PngjBadSignature;
                public static int valueOf;

                public PngjException() {
                }

                public static int PngjException() {
                    int i = valueOf;
                    int i2 = i % 9901266;
                    valueOf = i + 1;
                    if (i2 != 0) {
                        return PngjBadSignature;
                    }
                    int a = defpackage.a.a();
                    PngjBadSignature = a;
                    return a;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AnimationAnimationListenerC0022values.this.PngjException.clearAnimation();
                    AnimationAnimationListenerC0022values.this.PngjException.setAnimation(null);
                    AnimationAnimationListenerC0022values animationAnimationListenerC0022values = AnimationAnimationListenerC0022values.this;
                    animationAnimationListenerC0022values.PngjException.startAnimation(animationAnimationListenerC0022values.valueOf);
                }
            }

            public AnimationAnimationListenerC0022values(ImageView imageView, Animation animation) {
                this.PngjException = imageView;
                this.valueOf = animation;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                getOveralTimetaken.this.Action.runOnUiThread(new PngjException());
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }
        }

        public values(long j) {
            this.PngjBadSignature = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            org.c.a.PngjBadCrcException pngjBadCrcException = getOveralTimetaken.this.Capture2TActivity;
            if (pngjBadCrcException != null) {
                ViewGroup.LayoutParams layoutParams = pngjBadCrcException.getLayoutParams();
                Activity activity = getOveralTimetaken.this.Action;
                int i = R.id.preview;
                layoutParams.height = activity.findViewById(i).getHeight();
                layoutParams.width = getOveralTimetaken.this.Action.findViewById(i).getWidth();
                getOveralTimetaken.this.Capture2TActivity.setLayoutParams(layoutParams);
                Activity activity2 = getOveralTimetaken.this.Action;
                int i2 = R.id.info_layout;
                ViewGroup.LayoutParams layoutParams2 = activity2.findViewById(i2).getLayoutParams();
                layoutParams2.height = getOveralTimetaken.this.Action.findViewById(i).getHeight();
                layoutParams2.width = getOveralTimetaken.this.Action.findViewById(i).getWidth();
                getOveralTimetaken.this.Action.findViewById(i2).setLayoutParams(layoutParams2);
                Activity activity3 = getOveralTimetaken.this.Action;
                int i3 = R.id.location_error_layout;
                ViewGroup.LayoutParams layoutParams3 = activity3.findViewById(i3).getLayoutParams();
                layoutParams3.height = getOveralTimetaken.this.Action.findViewById(i).getHeight();
                layoutParams3.width = getOveralTimetaken.this.Action.findViewById(i).getWidth();
                getOveralTimetaken.this.Action.findViewById(i3).setLayoutParams(layoutParams3);
                Activity activity4 = getOveralTimetaken.this.Action;
                int i4 = R.id.scanner_overlay;
                ViewGroup.LayoutParams layoutParams4 = activity4.findViewById(i4).getLayoutParams();
                layoutParams4.height = getOveralTimetaken.this.Action.findViewById(i).getHeight();
                layoutParams4.width = getOveralTimetaken.this.Action.findViewById(i).getWidth();
                getOveralTimetaken.this.Action.findViewById(i4).setLayoutParams(layoutParams4);
                try {
                    if (IdentySdk.getInstance().isInlineGuide()) {
                        InlineGuideOption guideOption = IdentySdk.getInstance().getGuideOption();
                        Animation loadAnimation = AnimationUtils.loadAnimation(getOveralTimetaken.this.Action, R.anim.identy_left_to_rights_slide);
                        Activity activity5 = getOveralTimetaken.this.Action;
                        int i5 = R.id.inline_guide;
                        ((ImageView) activity5.findViewById(i5)).setImageResource(R.drawable.identy_guide);
                        Hand hand = getOveralTimetaken.this.a;
                        if (hand == null || !hand.equals(Hand.LEFT)) {
                            getOveralTimetaken.this.Action.findViewById(i5).setScaleY(-1.0f);
                            getOveralTimetaken.this.Action.findViewById(i5).setRotation(180.0f);
                            loadAnimation = AnimationUtils.loadAnimation(getOveralTimetaken.this.Action, R.anim.identy_right_to_left_slide);
                            boolean z = getOveralTimetaken.this.configureroll;
                        } else {
                            getOveralTimetaken.this.Action.findViewById(i5).setRotation(0.0f);
                            boolean z2 = getOveralTimetaken.this.configureroll;
                        }
                        ImageView imageView = (ImageView) getOveralTimetaken.this.Action.findViewById(i5);
                        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                        alphaAnimation.setDuration(guideOption.getDuration());
                        alphaAnimation.setInterpolator(new LinearInterpolator());
                        alphaAnimation.setRepeatCount(guideOption.getNumberOfRepeats());
                        alphaAnimation.setRepeatMode(2);
                        loadAnimation.setAnimationListener(new AnimationAnimationListenerC0022values(imageView, alphaAnimation));
                        loadAnimation.setRepeatCount(0);
                        ViewGroup.LayoutParams layoutParams5 = getOveralTimetaken.this.Action.findViewById(i5).getLayoutParams();
                        layoutParams5.height = getOveralTimetaken.this.Action.findViewById(i).getHeight();
                        getOveralTimetaken.this.Action.findViewById(i5).setLayoutParams(layoutParams5);
                        imageView.setVisibility(0);
                        imageView.startAnimation(loadAnimation);
                        alphaAnimation.setAnimationListener(new valueOf(imageView));
                        com.identy.PngjBadCrcException.PngjException("PREVIEW SET UP ", this.PngjBadSignature);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$n(byte b, int i, byte b2) {
        int i2;
        int i3;
        int i4 = 3 - (b * 4);
        int i5 = b2 * 4;
        int i6 = 107 - (i * 2);
        byte[] bArr = $$l;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            i2 = i4;
            int i7 = i5;
            i3 = 0;
            i4 += -i7;
            bArr2[i3] = (byte) i4;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
            i3++;
            i2++;
            i7 = bArr[i2];
            i4 += -i7;
            bArr2[i3] = (byte) i4;
            if (i3 == i5) {
            }
        } else {
            i2 = i4;
            i4 = i6;
            i3 = 0;
            bArr2[i3] = (byte) i4;
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
        pfk = 0;
        pfkrolfinalizeF = 1;
        resetAttempt = 6291871977379779242L;
    }

    public getOveralTimetaken(Activity activity, com.identy.d.PngjBadSignature pngjBadSignature, FingerDetectionMode fingerDetectionMode, boolean z, boolean z2, boolean z3) {
        super(activity, z2, fingerDetectionMode, z3, false);
        this.configureroll = false;
        this.pfkrol = new LinkedList();
        new NativeAlgoUtils();
        this.Action = activity;
        this.Attempt = pngjBadSignature;
        this.configure = new Handler(Looper.getMainLooper());
        e1.PngjOutputException = 0L;
        this.getOveralTimetaken = new float[0];
        this.a = fingerDetectionMode.getHand();
        this.getL3Score = z;
        this.Capture2IndexActivity = new PngjOutputException(PngjExceptionInternal());
        try {
            IdentySdk.getInstance().t();
            this.configureroll = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        Hand hand = this.a;
        int i = (hand == null || hand.equals(Hand.LEFT)) ? R.string.id_searching_left : R.string.id_searching_right;
        com.identy.d.PngjBadSignature pngjBadSignature2 = this.Attempt;
        if (pngjBadSignature2 != null) {
            pngjBadSignature2.PngjBadSignature(i, false);
        }
        this.cvtyuv2bgr = CapturePosition.HORIZONTAL;
    }

    private static /* synthetic */ Object PngjException(Object[] objArr) {
        getOveralTimetaken getoveraltimetaken = (getOveralTimetaken) objArr[0];
        int intValue = ((Number) objArr[1]).intValue();
        int intValue2 = ((Number) objArr[2]).intValue();
        int intValue3 = ((Number) objArr[3]).intValue();
        boolean booleanValue = ((Boolean) objArr[4]).booleanValue();
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        super.valueOf(intValue, intValue2, intValue3, booleanValue);
        if (getoveraltimetaken.getMatchingTime) {
            return null;
        }
        getoveraltimetaken.getL1Score = (com.identy.ui.PngjBadCrcException) getoveraltimetaken.Action.findViewById(R.id.scanner_overlay);
        try {
            if (getoveraltimetaken.CaptureThumbActivity) {
                float f = getoveraltimetaken.getPadSub3;
                float f2 = getoveraltimetaken.getPadSub2;
                getoveraltimetaken.CaptureRolledFingersActivity = new RectF((int) (f / 7.1f), (int) (f2 / 10.0f), (int) (f - (f2 / 4.1f)), (int) (f2 - (f / 10.0f)));
            } else {
                float f3 = getoveraltimetaken.getPadSub2;
                float f4 = getoveraltimetaken.getPadSub3;
                getoveraltimetaken.CaptureRolledFingersActivity = new RectF((int) (f3 / 7.1f), (int) (f4 / 10.0f), (int) (f3 - (f4 / 4.1f)), (int) (f4 - (f3 / 10.0f)));
            }
            getoveraltimetaken.getL2Score = new com.identy.ui.d.values(getoveraltimetaken.Action, 10.0d, 7.099999904632568d, 10.0d, 4.099999904632568d, IdentySdk.getInstance().getFingerPrintDrawable(), IdentySdk.getInstance().isDisableOuterBox(), getoveraltimetaken.a.equals(Hand.RIGHT) ? 180 : 0, false, getoveraltimetaken.a.equals(Hand.LEFT), false, getoveraltimetaken.uxd565jk, getoveraltimetaken.cvtyuv2bgr);
            if (!getoveraltimetaken.getL3Score && IdentySdk.getInstance().getFingerPrintDrawable() == 0) {
                getoveraltimetaken.getL1Score.PngjBadSignature(getoveraltimetaken.a, 8.0d, 8.0d, 8.0d);
            }
        } catch (Exception unused) {
        }
        if (getoveraltimetaken.CaptureThumbActivity) {
            getoveraltimetaken.getScore = (int) (getoveraltimetaken.CaptureRolledFingersActivity.width() / 5.7f);
            getoveraltimetaken.isQualityFailed = (int) (getoveraltimetaken.CaptureRolledFingersActivity.width() / 4.2f);
        } else {
            int i = getoveraltimetaken.getPadSub2;
            getoveraltimetaken.getScore = Math.round(((i - (i / 5)) / 6) * 0.9f);
            if (booleanValue) {
                int i2 = getoveraltimetaken.getPadSub2;
                getoveraltimetaken.isQualityFailed = (int) (((i2 - (i2 / 5)) / 4) * 0.98d);
            } else {
                int i3 = getoveraltimetaken.getPadSub2;
                getoveraltimetaken.isQualityFailed = (i3 - (i3 / 5)) / 4;
            }
        }
        getoveraltimetaken.getMatchingTime = true;
        getoveraltimetaken.getData = Integer.valueOf(getoveraltimetaken.Action.getWindowManager().getDefaultDisplay().getRotation() + intValue3);
        com.identy.PngjBadCrcException.PngjException("PREVIEW SET UP ", timeInMillis);
        org.c.a.PngjBadCrcException pngjBadCrcException = (org.c.a.PngjBadCrcException) getoveraltimetaken.Action.findViewById(R.id.tracking_overlay);
        getoveraltimetaken.Capture2TActivity = pngjBadCrcException;
        pngjBadCrcException.setLayerType(1, null);
        getoveraltimetaken.Action.runOnUiThread(getoveraltimetaken.new values(timeInMillis));
        getoveraltimetaken.Capture2TActivity.valueOf = getoveraltimetaken.new PngjBadCrcException();
        return null;
    }

    private static void e(String str, int i, Object[] objArr) {
        int i2 = $11 + 5;
        $10 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.d.e.ComDeA aVar = new com.d.e.ComDeA();
        char[] values2 = com.d.e.ComDeA.values(resetAttempt ^ 8332534422373704609L, charArray, i);
        aVar.PngjBadSignature = 4;
        while (true) {
            int i3 = aVar.PngjBadSignature;
            if (i3 >= values2.length) {
                break;
            }
            int i4 = i3 - 4;
            aVar.PngjBadCrcException = i4;
            try {
                Object[] objArr2 = {Long.valueOf(values2[i3] ^ values2[i3 % 4]), Long.valueOf(i4), Long.valueOf(resetAttempt)};
                Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1668670198);
                if (PngjBadSignature2 == null) {
                    char c = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29;
                    int indexOf = TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0);
                    Class cls = Long.TYPE;
                    PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c, scrollBarFadeDuration, indexOf, 1617260721, false, "o", new Class[]{cls, cls, cls});
                }
                values2[i3] = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {aVar, aVar};
                Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1405973094);
                if (PngjBadSignature3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (14831 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 27 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0), 722 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -1356718115, false, $$n(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) PngjBadSignature3).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str2 = new String(values2, 4, values2.length - 4);
        int i5 = $10 + 13;
        $11 = i5 % 128;
        if (i5 % 2 != 0) {
            objArr[0] = str2;
        } else {
            int i6 = 5 / 0;
            objArr[0] = str2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void f(byte b, byte b2, short s, Object[] objArr) {
        int i;
        int i2 = (b2 * 38) + 80;
        byte[] bArr = $$d;
        int i3 = b + 4;
        byte[] bArr2 = new byte[19 - s];
        int i4 = 18 - s;
        if (bArr == null) {
            int i5 = i4;
            i = 0;
            i2 = i2 + (-i5) + 5;
            i3++;
            bArr2[i] = (byte) i2;
            if (i == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i5 = bArr[i3];
            i++;
            i2 = i2 + (-i5) + 5;
            i3++;
            bArr2[i] = (byte) i2;
            if (i == i4) {
            }
        } else {
            i = 0;
            i3++;
            bArr2[i] = (byte) i2;
            if (i == i4) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void g(byte b, short s, byte b2, Object[] objArr) {
        int i;
        int i2;
        int r7 = (b2 * 56) + 4;
        int i3 = 111 - (s * 31);
        byte[] bArr = $$g;
        int i4 = b * 38;
        byte[] bArr2 = new byte[i4 + 19];
        int i5 = i4 + 18;
        if (bArr == null) {
            byte b3 = r7;
            i = 0;
            int i6 = r7;
            i3 = (i3 + (-b3)) - 7;
            i2 = i6 + 1;
            bArr2[i] = (byte) i3;
            if (i == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i++;
            b3 = bArr[i2];
            i6 = i2;
            i3 = (i3 + (-b3)) - 7;
            i2 = i6 + 1;
            bArr2[i] = (byte) i3;
            if (i == i5) {
            }
        } else {
            i = 0;
            i2 = r7;
            bArr2[i] = (byte) i3;
            if (i == i5) {
            }
        }
    }

    public static void init$0() {
        $$d = new byte[]{57, -23, -86, 28, -25, 12, 2, 45, -26, 2, 38, -42, 20, 35, -46, 26, 3, -6, 1, 16, -1, 6, 26, -6, -4, 21, 27, -18, -25, 12, 2, 42, -46, 26, 3, -6, 1, 16, -1, 6, 26, -6, -4, 21, -9};
        $$e = 203;
    }

    public static void init$1() {
        $$g = new byte[]{20, 75, 62, -49, -10, 4, 50, -60, -5, -19, 1, -20, 10, -9, -19, -6, -13, -5, -4, -4, -7, 0, -20, Base64.padSymbol, -41, -37, 0, -10, 33, -38, -10, 10, -29, -5, -14, 6, -26, -8, -4, 6, 58, -51, -37, 0, -10, 19, -41, 6, -15, 5, -26, -8, -4, 6, 25, -48, 3, -12, -12, 0, -37, 0, -10, 33, -38, -10, 26, -54, 8, 23, -58, 14, -9, -18, -11, 4, -13, -6};
        $$h = 121;
    }

    public static void init$2() {
        $$l = new byte[]{36, 13, -101, 57};
        $$m = 82;
    }

    public static /* synthetic */ Object valueOf(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i6;
        int i8 = ~i3;
        int i9 = (~(i8 | i2)) | i7;
        int i10 = ~i2;
        int i11 = ~(i8 | i10 | i6);
        int i12 = (~(i2 | i7)) | i8 | (~(i10 | i6));
        int i13 = ((-1284996642) * i4) + (325770565 * i) + i6 + i3 + i5;
        int i14 = i13 * i13;
        int i15 = (1116340224 * i14) + ((-145752064) * i4) + ((-667418624) * i) + ((-287834112) * i5) + ((-1076876666) * i12) + (1076876666 * i11) + (i9 * 1076876666) + ((-1364710777) * i3) + ((789042555 * i6) - 1205338112);
        int i16 = i12 * 906;
        int i17 = i5 * (-1991010217);
        int i18 = i * (-1223611789);
        int i19 = i4 * (-291900814);
        int i20 = i14 * (-1931083776);
        int i21 = i20 + i19 + i18 + i17 + i16 + (i11 * (-906)) + (i9 * (-906)) + (i3 * (-1991009311)) + (i6 * (-1991011123)) + 595473426;
        return ((i21 * i21) * (-1558839296)) + i15 != 1 ? values(objArr) : PngjException(objArr);
    }

    private static /* synthetic */ Object values(Object[] objArr) {
        getOveralTimetaken getoveraltimetaken = (getOveralTimetaken) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
        List list = (List) objArr[3];
        List list2 = (List) objArr[4];
        float floatValue = ((Number) objArr[5]).floatValue();
        Long l = (Long) objArr[6];
        int i = pfkrolfinalizeF + 51;
        pfk = i % 128;
        int i2 = i % 2;
        super.PngjBadCrcException(bArr, booleanValue, list, list2, floatValue, l);
        if (i2 != 0) {
            throw null;
        }
        int i3 = pfkrolfinalizeF + 5;
        pfk = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 19 / 0;
        }
        return null;
    }

    @Override // com.identy.e1
    public final RectF Action() {
        int i = pfk + 27;
        pfkrolfinalizeF = i % 128;
        int i2 = i % 2;
        return PngjException().get(1);
    }

    @Override // com.identy.e1
    public final void PngjBadCrcException() {
        int i = (pfk + 39) % 128;
        pfkrolfinalizeF = i;
        this.getMatchingTime = false;
        pfk = (i + com.karumi.dexter.R.styleable.AppCompatTheme_tooltipFrameBackground) % 128;
    }

    @Override // com.identy.e1
    public final Pair[] PngjExceptionInternal() {
        Pair[] pairArr = {new Pair(this.a, Finger.INDEX), new Pair(this.a, Finger.MIDDLE), new Pair(this.a, Finger.RING), new Pair(this.a, Finger.LITTLE)};
        pfkrolfinalizeF = (pfk + 85) % 128;
        return pairArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (r11.CaptureThumbActivity != true) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        r11.getL2Score.values(r11.getPadSub3, r11.getPadSub2, r11.getData.intValue(), r11.CaptureRolledFingersActivity);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        r11.getL2Score.values(r11.getPadSub2, r11.getPadSub3, r11.getData.intValue(), r11.CaptureRolledFingersActivity);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0045, code lost:
    
        if (r11.CaptureThumbActivity != false) goto L16;
     */
    @Override // com.identy.e1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean PngjUnsupportedException() {
        long timeInMillis;
        boolean PngjUnsupportedException = super.PngjUnsupportedException();
        if (!this.PngBadCharsetException) {
            int i = pfkrolfinalizeF;
            pfk = (i + 47) % 128;
            if (!this.onErrorResponse && PngjUnsupportedException) {
                int i2 = i + 77;
                pfk = i2 % 128;
                try {
                    if (i2 % 2 != 0) {
                        timeInMillis = Calendar.getInstance().getTimeInMillis();
                        this.getQualityScore++;
                    } else {
                        timeInMillis = Calendar.getInstance().getTimeInMillis();
                        this.getQualityScore++;
                    }
                } catch (Exception unused) {
                }
                if (this.getQualityScore < 1) {
                    com.identy.d.PngjBadSignature pngjBadSignature = this.Attempt;
                    if (pngjBadSignature != null) {
                        pngjBadSignature.getData();
                    }
                    return false;
                }
                if (this.getCaptureTime) {
                    return false;
                }
                this.getCaptureTime = true;
                values(new PngjBadSignature(timeInMillis));
                return true;
            }
        }
        return false;
    }

    @Override // com.identy.e1
    public final void a() {
        int i;
        super.a();
        if (this.a.equals(Hand.LEFT)) {
            int i2 = pfk + 123;
            pfkrolfinalizeF = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            i = R.string.id_searching_left;
        } else {
            i = R.string.id_searching_right;
        }
        com.identy.d.PngjBadSignature pngjBadSignature = this.Attempt;
        if (pngjBadSignature != null) {
            pngjBadSignature.PngjBadSignature(i, false);
        }
        new Message().what = 0;
        this.onErrorResponse = false;
        this.getQualityScore = 0L;
        this.getL2Score.PngjBadCrcException();
        this.Capture2TActivity.postInvalidate();
        this.Action.runOnUiThread(new PngjException());
        com.identy.d.PngjBadSignature pngjBadSignature2 = this.Attempt;
        if (pngjBadSignature2 != null) {
            pfkrolfinalizeF = (pfk + 61) % 128;
            pngjBadSignature2.getData();
        }
    }

    @Override // com.identy.e1
    public final void e1() {
        super.e1();
        FingerDetectionMode fingerDetectionMode = this.CapturePosition;
        FingerDetectionMode fingerDetectionMode2 = FingerDetectionMode.L4F;
        if (!fingerDetectionMode.equals(fingerDetectionMode2)) {
            this.CapturePosition = fingerDetectionMode2;
        } else {
            this.CapturePosition = FingerDetectionMode.R4F;
        }
        try {
            this.isFoundMatchingTemplates = false;
            pfkrolfinalizeF = (pfk + 103) % 128;
        } catch (Exception e) {
            e.printStackTrace();
        }
        int i = !this.a.equals(Hand.LEFT) ? R.string.id_searching_right : R.string.id_searching_left;
        com.identy.d.PngjBadSignature pngjBadSignature = this.Attempt;
        if (pngjBadSignature != null) {
            int i2 = pfkrolfinalizeF + 101;
            pfk = i2 % 128;
            int i3 = i2 % 2;
            pngjBadSignature.PngjBadSignature(i, false);
        }
    }

    @Override // com.identy.e1
    public final void getPadSub1() {
        pfkrolfinalizeF = (pfk + 95) % 128;
        try {
            super.getPadSub1();
            if (this.getL1Score != null) {
                pfk = (pfkrolfinalizeF + 71) % 128;
                this.getL1Score = null;
            }
            if (this.Capture2TActivity != null) {
                this.Capture2TActivity = null;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x09b6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0a2f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x08cb A[Catch: all -> 0x0203, TryCatch #1 {all -> 0x0203, blocks: (B:63:0x08ba, B:65:0x08cb, B:66:0x08f5, B:124:0x01a6, B:126:0x01c0, B:127:0x0208), top: B:123:0x01a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x090b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x096d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x06c0  */
    @Override // com.identy.e1, android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        int i;
        char c;
        long j;
        char c2;
        Object[] objArr;
        char c3;
        Object[] objArr2;
        int i2;
        int i3;
        int i4;
        Object PngjBadSignature2;
        long j2;
        Object PngjBadSignature3;
        Object PngjBadSignature4;
        Object PngjBadSignature5;
        Object[] objArr3;
        int i5;
        int i6;
        int i7 = 0;
        Object[] objArr4 = new Object[1];
        e("霴橀靕✽ᬥ앏\uddf2卷躡弞脛駂ἃ鍐䵽喋\udbc9ힼ\u09d3ᅡ蟩\uebb8햗\ued1f䎋⿌", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1, objArr4);
        String str = (String) objArr4[0];
        Object[] objArr5 = new Object[1];
        e("ꮷ⚧ꯒ„埀쉩펿濨胮Ᏽ蘸韱⎊\udfa5䨜寣\ue75a魅\u0ee1", 1 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr5);
        String str2 = (String) objArr5[0];
        Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1556686741);
        if (PngjBadSignature6 == null) {
            char c4 = (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
            int fadingEdgeLength = 37 - (ViewConfiguration.getFadingEdgeLength() >> 16);
            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 549;
            byte b = $$d[20];
            byte b2 = (byte) (b + 1);
            Object[] objArr6 = new Object[1];
            f(b, b2, b2, objArr6);
            PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c4, fadingEdgeLength, maxKeyCode, -1608103378, false, (String) objArr6[0], null);
        }
        long j3 = ((Field) PngjBadSignature6).getLong(null);
        if (j3 == -1 || j3 + 4611686018427387865L < ((Long) defpackage.a.i(str, str2, null, null, null)).longValue()) {
            i = 5;
            c = 18;
            j = 0;
            Object[] objArr7 = new Object[1];
            e("䍨\uf71a䌂歩虰褉梉蝪㯉쉁쵊⳪쭗๗Ŕ\ue0c9ྟ䫡䖖ꐁ", 1 - Gravity.getAbsoluteGravity(0, 0), objArr7);
            Class<?> cls = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            e("鹣꯲鸊\uf6b7\uda9dᓄ\uf5db娻Ꚕ麬傁놠ᙳ勰鲪綅튤ᘒ\ud849㥔", '1' - AndroidCharacter.getMirror('0'), objArr8);
            try {
                Object[] objArr9 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue()), -1450100647};
                Object PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1437710995);
                if (PngjBadSignature7 == null) {
                    int scrollBarFadeDuration = 37 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int packedPositionChild = 548 - ExpandableListView.getPackedPositionChild(0L);
                    byte[] bArr = $$d;
                    c2 = 3;
                    Object[] objArr10 = new Object[1];
                    f((byte) (-bArr[1]), (byte) (bArr[18] - 1), bArr[21], objArr10);
                    String str3 = (String) objArr10[0];
                    Class cls2 = Integer.TYPE;
                    PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (AndroidCharacter.getMirror('0') - '0'), scrollBarFadeDuration, packedPositionChild, -1453402328, false, str3, new Class[]{cls2, cls2});
                } else {
                    c2 = 3;
                }
                objArr = (Object[]) ((Method) PngjBadSignature7).invoke(null, objArr9);
                Object PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1434812162);
                if (PngjBadSignature8 == null) {
                    char lastIndexOf = (char) ((-1) - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0));
                    int fadingEdgeLength2 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 37;
                    int bitsPerPixel = 548 - ImageFormat.getBitsPerPixel(0);
                    Object[] objArr11 = new Object[1];
                    f((byte) ($$d[19] + 1), r9[18], r9[5], objArr11);
                    PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(lastIndexOf, fadingEdgeLength2, bitsPerPixel, 1452666181, false, (String) objArr11[0], null);
                }
                ((Field) PngjBadSignature8).set(null, objArr);
                try {
                    Long valueOf = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, null).invoke(null, null)).longValue());
                    Object PngjBadSignature9 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1556686741);
                    if (PngjBadSignature9 == null) {
                        char red = (char) Color.red(0);
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 37;
                        int maximumDrawingCacheSize = 549 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        byte b3 = $$d[20];
                        byte b4 = (byte) (b3 + 1);
                        c3 = 2;
                        Object[] objArr12 = new Object[1];
                        f(b3, b4, b4, objArr12);
                        PngjBadSignature9 = com.d.e.a.PngjBadCrcException.PngjBadSignature(red, scrollBarSize, maximumDrawingCacheSize, -1608103378, false, (String) objArr12[0], null);
                    } else {
                        c3 = 2;
                    }
                    ((Field) PngjBadSignature9).set(null, valueOf);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        } else {
            pfkrolfinalizeF = (pfk + 57) % 128;
            Object PngjBadSignature10 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1434812162);
            if (PngjBadSignature10 == null) {
                int gidForName = Process.getGidForName(BuildConfig.FLAVOR) + 38;
                int keyCodeFromString = KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 549;
                c = 18;
                j = 0;
                i = 5;
                Object[] objArr13 = new Object[1];
                f((byte) ($$d[19] + 1), r10[18], r10[5], objArr13);
                PngjBadSignature10 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), gidForName, keyCodeFromString, 1452666181, false, (String) objArr13[0], null);
            } else {
                i = 5;
                c = 18;
                j = 0;
            }
            Object[] objArr14 = (Object[]) ((Field) PngjBadSignature10).get(null);
            objArr = new Object[]{new int[1], new int[]{r12}, new int[]{r3}};
            int i8 = ((int[]) objArr14[1])[0];
            int i9 = ((int[]) objArr14[2])[0];
            int identityHashCode = System.identityHashCode(this);
            int i10 = ~identityHashCode;
            int c5 = defpackage.a.c((~(identityHashCode | (-988519794))) | 407540785 | (~(i10 | 1056702449)), 988, (((~((-580979009) | i10)) | (~(1056702449 | identityHashCode))) * 988) + 109231614, -1450100647);
            int i11 = c5 ^ (c5 << 13);
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[0])[0] = i12 ^ (i12 << 5);
            c2 = 3;
            c3 = 2;
        }
        Object obj = objArr[c3];
        int i13 = ((int[]) obj)[0];
        Object obj2 = objArr[1];
        int i14 = ((int[]) obj2)[0];
        if (i14 == i13) {
            Object[] objArr15 = {new int[1], new int[1], new int[1]};
            int i15 = ((int[]) objArr[0])[0];
            int i16 = ((int[]) obj2)[0];
            int i17 = ((int[]) obj)[0];
            ((int[]) objArr15[1])[0] = i16;
            ((int[]) objArr15[c3])[0] = i17;
            int i18 = (int) Runtime.getRuntime().totalMemory();
            int i19 = ~i18;
            int c6 = defpackage.a.c((~(i18 | (-606355457))) | (~(1014258179 | i19)) | 42082332, 140, (((~(449985055 | i19)) | 606355456) * (-280)) + ((i18 | 449985055) * 140) + 284703710, i15);
            int i20 = c6 ^ (c6 << 13);
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr15[0])[0] = i21 ^ (i21 << 5);
        } else {
            int[] iArr = new int[i14];
            int i22 = i14 - 1;
            iArr[i22] = 1;
            Toast.makeText((Context) null, iArr[((i14 * i22) % 2) - 1], 1).show();
            Object[] objArr16 = {new int[1], new int[1], new int[1]};
            int i23 = ((int[]) objArr[0])[0];
            int i24 = ((int[]) objArr[1])[0];
            int i25 = ((int[]) objArr[c3])[0];
            ((int[]) objArr16[1])[0] = i24;
            ((int[]) objArr16[c3])[0] = i25;
            int elapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i26 = (((~((-112529958) | elapsedRealtime)) | (~((-1351713278) | elapsedRealtime))) * 140) + (((103027200 | r9) * (-280)) - 222729726);
            int i27 = ~((-9502758) | elapsedRealtime);
            int i28 = ~elapsedRealtime;
            int c7 = defpackage.a.c((~(i28 | (-1342210521))) | i27 | (~((-103027201) | i28)), 140, i26, i23);
            int i29 = c7 ^ (c7 << 13);
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr16[0])[0] = i30 ^ (i30 << 5);
        }
        Object PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-175041514);
        if (PngjBadSignature11 == null) {
            char packedPositionType = (char) (31077 - ExpandableListView.getPackedPositionType(j));
            int i31 = 49 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int keyRepeatTimeout = 1043 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            byte b5 = $$d[20];
            byte b6 = (byte) (b5 + 1);
            Object[] objArr17 = new Object[1];
            f(b5, b6, b6, objArr17);
            PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature(packedPositionType, i31, keyRepeatTimeout, 159283629, false, (String) objArr17[0], null);
        }
        long j4 = ((Field) PngjBadSignature11).getLong(null);
        try {
            if (j4 == -1 || j4 + 4611686018427387896L < ((Long) defpackage.a.i(str, str2, null, null, null)).longValue()) {
                Context applicationContext = context != null ? ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext() : context;
                Object[] objArr18 = new Object[1];
                e("䍨\uf71a䌂歩虰褉梉蝪㯉쉁쵊⳪쭗๗Ŕ\ue0c9ྟ䫡䖖ꐁ", (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)), objArr18);
                Class<?> cls3 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                e("鹣꯲鸊\uf6b7\uda9dᓄ\uf5db娻Ꚕ麬傁놠ᙳ勰鲪綅튤ᘒ\ud849㥔", (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)), objArr19);
                int intValue = ((Integer) cls3.getMethod((String) objArr19[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr20 = new Object[4];
                    objArr20[c2] = -526284406;
                    objArr20[c3] = 0;
                    objArr20[1] = Integer.valueOf(intValue);
                    objArr20[0] = applicationContext;
                    byte[] bArr2 = $$g;
                    byte b7 = bArr2[10];
                    byte b8 = bArr2[21];
                    Object[] objArr21 = new Object[1];
                    g(b7, b8, b8, objArr21);
                    Class<?> cls4 = Class.forName((String) objArr21[0]);
                    byte b9 = bArr2[21];
                    byte b10 = bArr2[10];
                    Object[] objArr22 = new Object[1];
                    g(b9, b10, b10, objArr22);
                    String str4 = (String) objArr22[0];
                    Class cls5 = Integer.TYPE;
                    objArr2 = (Object[]) cls4.getMethod(str4, Context.class, cls5, cls5, cls5).invoke(null, objArr20);
                    if (applicationContext != null) {
                        Object PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1200224935);
                        if (PngjBadSignature12 == null) {
                            char green = (char) (Color.green(0) + 31077);
                            int i32 = (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 48;
                            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 1043;
                            byte[] bArr3 = $$d;
                            byte b11 = bArr3[13];
                            byte b12 = bArr3[c];
                            Object[] objArr23 = new Object[1];
                            f(b11, b12, (byte) (b12 | 12), objArr23);
                            PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature(green, i32, tapTimeout, 1150904546, false, (String) objArr23[0], null);
                        }
                        ((Field) PngjBadSignature12).set(null, objArr2);
                        try {
                            Long valueOf2 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, null).invoke(null, null)).longValue());
                            Object PngjBadSignature13 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-175041514);
                            if (PngjBadSignature13 == null) {
                                char maximumDrawingCacheSize2 = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 31077);
                                int i33 = (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 48;
                                int makeMeasureSpec = 1043 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                byte b13 = $$d[20];
                                byte b14 = (byte) (b13 + 1);
                                i2 = 4;
                                Object[] objArr24 = new Object[1];
                                f(b13, b14, b14, objArr24);
                                PngjBadSignature13 = com.d.e.a.PngjBadCrcException.PngjBadSignature(maximumDrawingCacheSize2, i33, makeMeasureSpec, 159283629, false, (String) objArr24[0], null);
                            } else {
                                i2 = 4;
                            }
                            ((Field) PngjBadSignature13).set(null, valueOf2);
                            i3 = ((int[]) objArr2[c3])[0];
                            i4 = ((int[]) objArr2[c2])[0];
                            if (i4 != i3) {
                                pfkrolfinalizeF = (pfk + 65) % 128;
                                Object[] objArr25 = new Object[5];
                                objArr25[c3] = new int[]{r12};
                                objArr25[c2] = new int[]{r11};
                                objArr25[i2] = new int[1];
                                int i34 = ((int[]) objArr2[i2])[0];
                                int i35 = ((int[]) objArr2[c2])[0];
                                int i36 = ((int[]) objArr2[c3])[0];
                                String str5 = (String) objArr2[1];
                                String str6 = (String) objArr2[0];
                                objArr25[1] = str5;
                                objArr25[0] = str6;
                                int c8 = defpackage.a.c((~((~((int) SystemClock.elapsedRealtime())) | 385874745)) | 238482624, 56, (((~(r6 | 238482624)) | 385874745) * 56) - 919441359, i34);
                                int i37 = c8 ^ (c8 << 13);
                                int i38 = i37 ^ (i37 >>> 17);
                                ((int[]) objArr25[i2])[0] = i38 ^ (i38 << 5);
                            } else {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add((String) objArr2[1]);
                                arrayList.add((String) objArr2[0]);
                                int[] iArr2 = new int[i4];
                                int i39 = i4 - 1;
                                iArr2[i39] = 1;
                                Toast.makeText((Context) null, iArr2[((i4 * i39) % 2) - 1], 1).show();
                                Object[] objArr26 = new Object[5];
                                objArr26[c3] = new int[]{r12};
                                objArr26[c2] = new int[]{r11};
                                objArr26[i2] = new int[1];
                                int i40 = ((int[]) objArr2[i2])[0];
                                int i41 = ((int[]) objArr2[c2])[0];
                                int i42 = ((int[]) objArr2[c3])[0];
                                String str7 = (String) objArr2[1];
                                String str8 = (String) objArr2[0];
                                objArr26[1] = str7;
                                objArr26[0] = str8;
                                int identityHashCode2 = System.identityHashCode(this);
                                int c9 = defpackage.a.c((~(identityHashCode2 | 507776900)) | (~((~identityHashCode2) | 116580469)), 627, (((~((-116580470) | identityHashCode2)) | 507776900) * (-627)) + (((-402919297) | identityHashCode2) * (-627)) + 1254403796, i40);
                                int i43 = c9 ^ (c9 << 13);
                                int i44 = i43 ^ (i43 >>> 17);
                                ((int[]) objArr26[i2])[0] = i44 ^ (i44 << 5);
                            }
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
                            if (PngjBadSignature2 == null) {
                                char c10 = (char) ((SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) + 14829);
                                int lastIndexOf2 = 27 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0);
                                int maximumDrawingCacheSize3 = 721 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                byte b15 = $$d[20];
                                byte b16 = (byte) (b15 + 1);
                                Object[] objArr27 = new Object[1];
                                f(b15, b16, b16, objArr27);
                                PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c10, lastIndexOf2, maximumDrawingCacheSize3, -815159504, false, (String) objArr27[0], null);
                            }
                            j2 = ((Field) PngjBadSignature2).getLong(null);
                            if (j2 != -1 || j2 + 4611686018427387812L < ((Long) defpackage.a.i(str, str2, null, null, null)).longValue()) {
                                Object[] objArr28 = new Object[1];
                                e("䍨\uf71a䌂歩虰褉梉蝪㯉쉁쵊⳪쭗๗Ŕ\ue0c9ྟ䫡䖖ꐁ", 1 - (Process.myTid() >> 22), objArr28);
                                Class<?> cls6 = Class.forName((String) objArr28[0]);
                                Object[] objArr29 = new Object[1];
                                e("鹣꯲鸊\uf6b7\uda9dᓄ\uf5db娻Ꚕ麬傁놠ᙳ勰鲪綅튤ᘒ\ud849㥔", TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0) + 1, objArr29);
                                int intValue2 = ((Integer) cls6.getMethod((String) objArr29[0], Object.class).invoke(null, this)).intValue();
                                Object[] objArr30 = {876384600};
                                PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1439412966);
                                if (PngjBadSignature3 == null) {
                                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (1 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1))), 24 - View.MeasureSpec.getMode(0), TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 698, 1457201313, false, null, new Class[]{Integer.TYPE});
                                }
                                Object[] valueOf$1eba2e16 = TouchLessIDSDK$values.valueOf$1eba2e16(intValue2, ((Constructor) PngjBadSignature3).newInstance(objArr30), 1025413808);
                                PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                                if (PngjBadSignature4 == null) {
                                    char c11 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 14830);
                                    int keyRepeatTimeout2 = 28 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                    int indexOf = 720 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0);
                                    byte[] bArr4 = $$d;
                                    Object[] objArr31 = new Object[1];
                                    f((byte) (-bArr4[1]), (byte) (bArr4[c] - 1), bArr4[21], objArr31);
                                    PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c11, keyRepeatTimeout2, indexOf, -779023007, false, (String) objArr31[0], null);
                                }
                                ((Field) PngjBadSignature4).set(null, valueOf$1eba2e16);
                                Long valueOf3 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, null).invoke(null, null)).longValue());
                                PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
                                if (PngjBadSignature5 == null) {
                                    char c12 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 14829);
                                    int i45 = 28 - (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1));
                                    int maximumDrawingCacheSize4 = 721 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                    byte b17 = $$d[20];
                                    byte b18 = (byte) (b17 + 1);
                                    Object[] objArr32 = new Object[1];
                                    f(b17, b18, b18, objArr32);
                                    PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c12, i45, maximumDrawingCacheSize4, -815159504, false, (String) objArr32[0], null);
                                }
                                ((Field) PngjBadSignature5).set(null, valueOf3);
                                objArr3 = valueOf$1eba2e16;
                            } else {
                                pfkrolfinalizeF = (pfk + 105) % 128;
                                Object PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                                if (PngjBadSignature14 == null) {
                                    char scrollBarSize2 = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 14830);
                                    int offsetBefore = 28 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0);
                                    int touchSlop = 721 - (ViewConfiguration.getTouchSlop() >> 8);
                                    byte[] bArr5 = $$d;
                                    Object[] objArr33 = new Object[1];
                                    f((byte) (-bArr5[1]), (byte) (bArr5[c] - 1), bArr5[21], objArr33);
                                    PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(scrollBarSize2, offsetBefore, touchSlop, -779023007, false, (String) objArr33[0], null);
                                }
                                Object[] objArr34 = (Object[]) ((Field) PngjBadSignature14).get(null);
                                objArr3 = new Object[i2];
                                objArr3[0] = new int[]{r8};
                                objArr3[1] = new int[1];
                                objArr3[c2] = new int[]{r7};
                                int i46 = ((int[]) objArr34[c2])[0];
                                int i47 = ((int[]) objArr34[0])[0];
                                objArr3[c3] = (String[]) objArr34[c3];
                                int maxMemory = (int) Runtime.getRuntime().maxMemory();
                                int i48 = ~maxMemory;
                                int c13 = defpackage.a.c((~(i48 | 452953696)) | (~((-581612278) | i48)), 865, ((~(maxMemory | 452953696)) * 865) + (((~((-452953697) | i48)) | (-581612278)) * (-865)) + 1414043104, 1025413808);
                                int i49 = c13 ^ (c13 << 13);
                                int i50 = i49 ^ (i49 >>> 17);
                                ((int[]) objArr3[1])[0] = i50 ^ (i50 << 5);
                            }
                            i5 = ((int[]) objArr3[0])[0];
                            i6 = ((int[]) objArr3[c2])[0];
                            if (i6 == i5) {
                                ArrayList arrayList2 = new ArrayList();
                                String[] strArr = (String[]) objArr3[c3];
                                if (strArr != null) {
                                    while (i7 < strArr.length) {
                                        int i51 = pfkrolfinalizeF + 73;
                                        pfk = i51 % 128;
                                        if (i51 % 2 != 0) {
                                            arrayList2.add(strArr[i7]);
                                            i7 += 13;
                                        } else {
                                            arrayList2.add(strArr[i7]);
                                            i7++;
                                        }
                                    }
                                }
                                throw new RuntimeException(String.valueOf(i6));
                            }
                            pfk = (pfkrolfinalizeF + 107) % 128;
                            Object[] objArr35 = new Object[4];
                            objArr35[0] = new int[]{r9};
                            objArr35[1] = new int[1];
                            objArr35[c2] = new int[]{r8};
                            int i52 = ((int[]) objArr3[1])[0];
                            int i53 = ((int[]) objArr3[c2])[0];
                            int i54 = ((int[]) objArr3[0])[0];
                            objArr35[c3] = (String[]) objArr3[c3];
                            int identityHashCode3 = System.identityHashCode(this);
                            int i55 = ~identityHashCode3;
                            int c14 = defpackage.a.c(~(identityHashCode3 | (-412972879)), 113, (((~(i55 | (-412169545))) | (~((-621593096) | identityHashCode3)) | 620789761) * (-113)) + (((~((-412972879) | i55)) | 621593095) * 226) + 92728016, i52);
                            int i56 = c14 ^ (c14 << 13);
                            int i57 = i56 ^ (i56 >>> 17);
                            ((int[]) objArr35[1])[0] = i57 ^ (i57 << 5);
                            super.onReceive(context, intent);
                            return;
                        } catch (Exception unused2) {
                            throw new RuntimeException();
                        }
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } else {
                pfkrolfinalizeF = (pfk + 41) % 128;
                Object PngjBadSignature15 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1200224935);
                if (PngjBadSignature15 == null) {
                    char normalizeMetaState = (char) (31077 - KeyEvent.normalizeMetaState(0));
                    int blue = 49 - Color.blue(0);
                    int myPid = (Process.myPid() >> 22) + 1043;
                    byte[] bArr6 = $$d;
                    byte b19 = bArr6[13];
                    byte b20 = bArr6[c];
                    Object[] objArr36 = new Object[1];
                    f(b19, b20, (byte) (b20 | 12), objArr36);
                    PngjBadSignature15 = com.d.e.a.PngjBadCrcException.PngjBadSignature(normalizeMetaState, blue, myPid, 1150904546, false, (String) objArr36[0], null);
                }
                Object[] objArr37 = (Object[]) ((Field) PngjBadSignature15).get(null);
                objArr2 = new Object[i];
                objArr2[c3] = new int[]{r12};
                objArr2[c2] = new int[]{r11};
                objArr2[4] = new int[1];
                int i58 = ((int[]) objArr37[c2])[0];
                int i59 = ((int[]) objArr37[c3])[0];
                String str9 = (String) objArr37[1];
                String str10 = (String) objArr37[0];
                objArr2[1] = str9;
                objArr2[0] = str10;
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i60 = ((((~((-468059854) | startElapsedRealtime)) | 312870593) | (~(156297516 | startElapsedRealtime))) * (-754)) - 530041813;
                int i61 = ~((-312870594) | startElapsedRealtime);
                int i62 = ~startElapsedRealtime;
                int c15 = defpackage.a.c(i62 | (-468059854), 754, ((i61 | (~(469168109 | i62))) * (-754)) + i60, -526284406);
                int i63 = c15 ^ (c15 << 13);
                int i64 = i63 ^ (i63 >>> 17);
                ((int[]) objArr2[4])[0] = i64 ^ (i64 << 5);
            }
            Long valueOf32 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, null).invoke(null, null)).longValue());
            PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
            if (PngjBadSignature5 == null) {
            }
            ((Field) PngjBadSignature5).set(null, valueOf32);
            objArr3 = valueOf$1eba2e16;
            i5 = ((int[]) objArr3[0])[0];
            i6 = ((int[]) objArr3[c2])[0];
            if (i6 == i5) {
            }
        } catch (Exception unused3) {
            throw new RuntimeException();
        }
        i2 = 4;
        i3 = ((int[]) objArr2[c3])[0];
        i4 = ((int[]) objArr2[c2])[0];
        if (i4 != i3) {
        }
        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
        if (PngjBadSignature2 == null) {
        }
        j2 = ((Field) PngjBadSignature2).getLong(null);
        if (j2 != -1) {
        }
        Object[] objArr282 = new Object[1];
        e("䍨\uf71a䌂歩虰褉梉蝪㯉쉁쵊⳪쭗๗Ŕ\ue0c9ྟ䫡䖖ꐁ", 1 - (Process.myTid() >> 22), objArr282);
        Class<?> cls62 = Class.forName((String) objArr282[0]);
        Object[] objArr292 = new Object[1];
        e("鹣꯲鸊\uf6b7\uda9dᓄ\uf5db娻Ꚕ麬傁놠ᙳ勰鲪綅튤ᘒ\ud849㥔", TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0) + 1, objArr292);
        int intValue22 = ((Integer) cls62.getMethod((String) objArr292[0], Object.class).invoke(null, this)).intValue();
        Object[] objArr302 = {876384600};
        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1439412966);
        if (PngjBadSignature3 == null) {
        }
        Object[] valueOf$1eba2e162 = TouchLessIDSDK$values.valueOf$1eba2e16(intValue22, ((Constructor) PngjBadSignature3).newInstance(objArr302), 1025413808);
        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
        if (PngjBadSignature4 == null) {
        }
        ((Field) PngjBadSignature4).set(null, valueOf$1eba2e162);
    }

    @Override // com.identy.e1
    public final void PngjBadCrcException(byte[] bArr, boolean z, List list, List list2, float f, Long l) {
        Object[] objArr = {this, bArr, Boolean.valueOf(z), list, list2, Float.valueOf(f), l};
        valueOf(com.identy.i.PngjException.PngjException(), com.identy.i.PngjException.PngjException(), 244111684, com.identy.i.PngjException.PngjException(), com.identy.i.PngjException.PngjException(), -244111684, objArr);
    }

    @Override // com.identy.e1
    public final void valueOf(int i, int i2, int i3, boolean z) {
        Object[] objArr = {this, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z)};
        valueOf(com.identy.i.PngjException.PngjException(), com.identy.i.PngjException.PngjException(), 1096272123, com.identy.i.PngjException.PngjException(), com.identy.i.PngjException.PngjException(), -1096272122, objArr);
    }
}
