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
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.ExpandableListView;
import android.widget.ImageView;
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
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.ByteCompanionObject;
import org.c.a.PngjBadCrcException;
import org.identy.nativealgo.NativeAlgoUtils;
import org.identy.opencv.core.Mat;

/* loaded from: classes2.dex */
final class isFoundMatchingTemplates extends e1 {
    private static  byte[] $$d = null;
    private static  int $$e = 0;
    private static  byte[] $$g = null;
    private static  int $$h = 0;
    private static  byte[] $$l = null;
    private static  int $$m = 0;
    private static int $10;
    private static int $11;
    private static int destroy;
    private static int getServerRequest;
    private static long resetAttempt;
    List configure;
    private boolean configureroll;
    private boolean pfk;
    Handler pfkrol;

    public class PngjBadCrcException implements org.c.a.PngjBadCrcException.values {
        public int valueOf;
        public int values;

        public PngjBadCrcException() {
        }

        public static int values() {
            int i = valueOf;
            int i2 = i % 5649071;
            valueOf = i + 1;
            if (i2 != 0) {
                return values;
            }
            int freeMemory = (int) Runtime.getRuntime().freeMemory();
            values = freeMemory;
            return freeMemory;
        }

        @Override // org.c.a.PngjBadCrcException.values
        public final void drawCallback(Canvas canvas) {
            isFoundMatchingTemplates isfoundmatchingtemplates = isFoundMatchingTemplates.this;
            isfoundmatchingtemplates.getL2Score.values(canvas, isfoundmatchingtemplates.getL3Score);
        }
    }

    public class PngjBadSignature implements Runnable {
        private static  byte[] $$a = null;
        private static  int $$b = 0;
        private static  byte[] $$c = null;
        private static  int $$d = 0;
        private static int $10;
        private static int $11;
        private static int PngjBadCrcException;
        private static int PngjException;
        private static int PngjInputException;
        private static int PngjOutputException;
        private static short[] PngjPrematureEnding;
        private static long PngjUnsupportedException;
        private static byte[] valueOf;
        private static int values;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$e(byte b, short s, byte b2) {
            int i;
            int i2;
            int i3;
            int i4;
            byte[] bArr = $$c;
            int i5 = (s * 4) + 1;
            int i6 = 4 - (b2 * 2);
            int i7 = b + 105;
            byte[] bArr2 = new byte[i5];
            if (bArr == null) {
                int i8 = i5;
                int i9 = i6;
                i4 = 0;
                int i10 = i6 + 1;
                i = i9 + i8;
                i2 = i10;
                i3 = i4;
                i4 = i3 + 1;
                bArr2[i3] = (byte) i;
                if (i4 == i5) {
                    return new String(bArr2, 0);
                }
                i8 = bArr[i2];
                int i11 = i;
                i6 = i2;
                i9 = i11;
                int i102 = i6 + 1;
                i = i9 + i8;
                i2 = i102;
                i3 = i4;
                i4 = i3 + 1;
                bArr2[i3] = (byte) i;
                if (i4 == i5) {
                }
            } else {
                i = i7;
                i2 = i6;
                i3 = 0;
                i4 = i3 + 1;
                bArr2[i3] = (byte) i;
                if (i4 == i5) {
                }
            }
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            PngjInputException = 0;
            PngjOutputException = 1;
            PngjBadCrcException = -1342845489;
            values = -961251487;
            PngjException = -634544610;
            valueOf = new byte[]{-110, 102, 8, 111, 6, 103, 8, 96, 63, -70, 124, -105, -50, 54, 38, -50, 44, -65, -114, -24, -2, -6, -118, -7, -32, -22, -12, -114, -25, -68, 58, -13, -22, -6, -31, -11, -74, 33, -118, -19, -118, -26, -2, -7, -71, 60, -2, -108, 14, 108, 119, 14, 105, 10, 125, 126, -83, 12, 29, 97, 13, -55, -76, 13, 4, 120, 13, 1, 121, 5, 118, 11, -109, 2, -17, 105, 22, 45, 6, 38, 27, 16, -107, -70, 74, -88, 72, -93, -70, -75, -106, 110, 91, 110, 82, 108, 65, -106, -106, -15, -113, -99, -98, -16, -101, 46, -87, -120, -123, -16, -120, -8, -122, -6, -117, -127, -9, -6, -125, -4, -106, -29, -116, -99, -31, -115, -101, -31, -108, -13, -108, -10, -100, -123, -123, -8, -119, -109, -23, -125, -92, -122, -84, -107, -107, -120, -103, -110, 3, 35, 53, -50, 55, -57, 50, 50, 37, 54, -82, 1, 114, 5, 0, 114, 8, 119, 23, 15, 116, 5, 120, 1, 113, -84, -109, -112, -66, -124, -112, 109, -24, -105, -86, -97, 109, -27, -99, -108, -81, 80, -106, 76, -93, -77, -70, 78, 112, -111, -30, -32, -35, -66, 37, -1, -42, -26, -19, -31, -93, -110, -31, -1, -109, 41, -29, -5, -48, -3, -41, -65, -104, -56, -58, 62, -119, -112, 122, 119, 116, 33, -79, 99, 120, 103, 8, 39, -68, 126, -110, 23, 42, 45, 35, 46, 20, 43, 63, 4, 54, -85, 112, 13, 7, 11, 114, 10, 101, 13, -54, 68, 98, 12, -54, -75, 4, 116, 10, -106, 24, 44, 22, 17, 24, 46, -111, 39, -1, -20, -42, -25, -83, 60, -35, -9, -19, -107, -84, 89, 21, 19, 112, -47, 87, 47, 28, 6, 23, -35, 108, 13, 39, 29, -59, -105, -101, 87, 85, 77, 24, -84, -59, -124, -83, 73, -127, -33, -101, -103, 77, -34, -104, -113, -97, -122, -102, 92, -92, -118, 64, 69, 72, 0, -100, 70, 69, 78, 4, -99, -73, 29, -120, 70, 71, 31, -125, 93, -76, 68, 75, 95, 1, -112, 57, -11, -13, -48, -79, 56, -14, -23, -7, -32, -12, -74, -84, -66, -73, -92, -73, -69, ByteCompanionObject.MAX_VALUE, -12, -93, -74, -85, 121, -15, -87, -96, -69, 124, -89, 47, 11, 8, 8, 6, -60, 78, 2, 30, 0, 8, 30, 115, -63, 73, 24, -50, 73, 11, 31, -63, -110, -96, 78, -74, -86, -71, 13, -1, 71, -73, 99, -83, 33, 40, 17, 58, 48, -34, 125, 43, 55, 47, -26, 119, 25, -49, 45};
            PngjUnsupportedException = -492961037255713796L;
        }

        public PngjBadSignature() {
        }

        /*  JADX ERROR: Type inference failed
            jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r4v375 ?? I:int), method size: 17835
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
            */
        public static java.lang.Object[] PngjBadCrcException$1eba2e16(int r80, java.lang.Object r81, int r82) {
            /*
                Method dump skipped, instructions count: 17835
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.identy.isFoundMatchingTemplates.PngjBadSignature.PngjBadCrcException$1eba2e16(int, java.lang.Object, int):java.lang.Object[]");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(short s, int i, short s2, java.lang.Object[] objArr) {
            int i2;
            int i3 = (s2 * 4) + 97;
            byte[] bArr = $$a;
            int i4 = i + 4;
            byte[] bArr2 = new byte[2 - s];
            int i5 = 1 - s;
            if (bArr == null) {
                int i6 = i3;
                int i7 = 0;
                int i8 = i4;
                int i9 = (i4 + i6) - 52;
                int i10 = i8;
                i3 = i9;
                i4 = i10;
                i2 = i7;
                bArr2[i2] = (byte) i3;
                i7 = i2 + 1;
                if (i2 == i5) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                int i11 = i4 + 1;
                i6 = bArr[i11];
                int i12 = i3;
                i8 = i11;
                i4 = i12;
                int i92 = (i4 + i6) - 52;
                int i102 = i8;
                i3 = i92;
                i4 = i102;
                i2 = i7;
                bArr2[i2] = (byte) i3;
                i7 = i2 + 1;
                if (i2 == i5) {
                }
            } else {
                i2 = 0;
                bArr2[i2] = (byte) i3;
                i7 = i2 + 1;
                if (i2 == i5) {
                }
            }
        }

        private static void b(short s, int i, int i2, byte b, int i3, java.lang.Object[] objArr) {
            boolean z;
            boolean z2;
            long j;
            long j2;
            int i4;
            boolean z3;
            int i5;
            com.d.e.PngjPrematureEnding pngjPrematureEnding = new com.d.e.PngjPrematureEnding();
            StringBuilder sb = new StringBuilder();
            try {
                boolean z4 = true;
                java.lang.Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(values)};
                int i6 = 0;
                java.lang.Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1302984176);
                Class cls = Integer.TYPE;
                if (PngjBadSignature == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (60329 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR)), 32 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), 1167 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1320773547, false, $$e(b2, b3, b3), new Class[]{cls, cls});
                }
                int intValue = ((Integer) ((Method) PngjBadSignature).invoke(null, objArr2)).intValue();
                if (intValue == -1) {
                    $11 = ($10 + 43) % 128;
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    byte[] bArr = valueOf;
                    if (bArr != null) {
                        int length = bArr.length;
                        i4 = 60329;
                        byte[] bArr2 = new byte[length];
                        int i7 = 0;
                        j = 0;
                        while (i7 < length) {
                            java.lang.Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                            java.lang.Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1053815139);
                            if (PngjBadSignature2 == null) {
                                char defaultSize = (char) (View.getDefaultSize(i6, i6) + 14830);
                                int minimumFlingVelocity = 28 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                int myPid = 721 - (Process.myPid() >> 22);
                                z3 = z4;
                                byte length2 = (byte) $$c.length;
                                i5 = i6;
                                byte b4 = (byte) (length2 - 4);
                                PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(defaultSize, minimumFlingVelocity, myPid, 1038050086, false, $$e(length2, b4, b4), new Class[]{cls});
                            } else {
                                z3 = z4;
                                i5 = i6;
                            }
                            bArr2[i7] = ((Byte) ((Method) PngjBadSignature2).invoke(null, objArr3)).byteValue();
                            i7++;
                            z4 = z3;
                            i6 = i5;
                        }
                        bArr = bArr2;
                    } else {
                        i4 = 60329;
                        j = 0;
                    }
                    z2 = z4;
                    int i8 = i6;
                    j2 = -6165791747575875761L;
                    if (bArr != null) {
                        byte[] bArr3 = valueOf;
                        java.lang.Object[] objArr4 = new java.lang.Object[2];
                        objArr4[z2 ? 1 : 0] = Integer.valueOf(PngjBadCrcException);
                        objArr4[i8] = Integer.valueOf(i2);
                        java.lang.Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1302984176);
                        if (PngjBadSignature3 == null) {
                            byte b5 = (byte) i8;
                            byte b6 = b5;
                            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (Color.alpha(i8) + i4), 32 - (ViewConfiguration.getScrollBarSize() >> 8), 1167 - ExpandableListView.getPackedPositionType(j), 1320773547, false, $$e(b5, b6, b6), new Class[]{cls, cls});
                        }
                        intValue = (byte) (((byte) (bArr3[((Integer) ((Method) PngjBadSignature3).invoke(null, objArr4)).intValue()] ^ (-6165791747575875761L))) + ((int) (values ^ (-6165791747575875761L))));
                    } else {
                        intValue = (short) (((short) (PngjPrematureEnding[i2 + ((int) (PngjBadCrcException ^ (-6165791747575875761L)))] ^ (-6165791747575875761L))) + ((int) (values ^ (-6165791747575875761L))));
                    }
                } else {
                    z2 = true;
                    j = 0;
                    j2 = -6165791747575875761L;
                }
                if (intValue > 0) {
                    pngjPrematureEnding.values = ((i2 + intValue) - 2) + ((int) (PngjBadCrcException ^ j2)) + ((z ^ true) != z2 ? 1 : 0);
                    java.lang.Object[] objArr5 = {pngjPrematureEnding, Integer.valueOf(i), Integer.valueOf(PngjException), sb};
                    java.lang.Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1013119226);
                    if (PngjBadSignature4 == null) {
                        byte b7 = (byte) 3;
                        byte b8 = (byte) (b7 - 3);
                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ExpandableListView.getPackedPositionChild(j) + 45718), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 40, 625 - KeyEvent.normalizeMetaState(0), 1064463037, false, $$e(b7, b8, b8), new Class[]{java.lang.Object.class, cls, cls, java.lang.Object.class});
                    }
                    ((StringBuilder) ((Method) PngjBadSignature4).invoke(null, objArr5)).append(pngjPrematureEnding.valueOf);
                    pngjPrematureEnding.PngjBadCrcException = pngjPrematureEnding.valueOf;
                    byte[] bArr4 = valueOf;
                    if (bArr4 != null) {
                        $11 = ($10 + 21) % 128;
                        int length3 = bArr4.length;
                        byte[] bArr5 = new byte[length3];
                        int i9 = 0;
                        while (i9 < length3) {
                            bArr5[i9] = (byte) (bArr4[i9] ^ j2);
                            i9++;
                            $11 = ($10 + 121) % 128;
                        }
                        bArr4 = bArr5;
                    }
                    boolean z5 = bArr4 != null;
                    pngjPrematureEnding.PngjException = 1;
                    while (pngjPrematureEnding.PngjException < intValue) {
                        if (z5) {
                            byte[] bArr6 = valueOf;
                            pngjPrematureEnding.values = pngjPrematureEnding.values - 1;
                            pngjPrematureEnding.valueOf = (char) (pngjPrematureEnding.PngjBadCrcException + (((byte) (((byte) (bArr6[0] ^ j2)) + s)) ^ b));
                        } else {
                            short[] sArr = PngjPrematureEnding;
                            pngjPrematureEnding.values = pngjPrematureEnding.values - 1;
                            pngjPrematureEnding.valueOf = (char) (pngjPrematureEnding.PngjBadCrcException + (((short) (((short) (sArr[0] ^ j2)) + s)) ^ b));
                        }
                        sb.append(pngjPrematureEnding.valueOf);
                        pngjPrematureEnding.PngjBadCrcException = pngjPrematureEnding.valueOf;
                        pngjPrematureEnding.PngjException++;
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

        private static void c(String str, int i, java.lang.Object[] objArr) {
            char[] cArr;
            if (str != null) {
                $11 = ($10 + 45) % 128;
                cArr = str.toCharArray();
                $10 = ($11 + 47) % 128;
            } else {
                cArr = str;
            }
            com.d.e.ComDeA aVar = new com.d.e.ComDeA();
            char[] values2 = com.d.e.ComDeA.values(PngjUnsupportedException ^ 8332534422373704609L, cArr, i);
            aVar.PngjBadSignature = 4;
            while (true) {
                int i2 = aVar.PngjBadSignature;
                if (i2 >= values2.length) {
                    objArr[0] = new String(values2, 4, values2.length - 4);
                    return;
                }
                $11 = ($10 + 93) % 128;
                int i3 = i2 - 4;
                aVar.PngjBadCrcException = i3;
                try {
                    java.lang.Object[] objArr2 = {Long.valueOf(values2[i2] ^ values2[i2 % 4]), Long.valueOf(i3), Long.valueOf(PngjUnsupportedException)};
                    java.lang.Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1668670198);
                    if (PngjBadSignature == null) {
                        char c = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int indexOf = TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 30;
                        int deadChar = KeyEvent.getDeadChar(0, 0);
                        Class cls = Long.TYPE;
                        PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(c, indexOf, deadChar, 1617260721, false, "o", new Class[]{cls, cls, cls});
                    }
                    values2[i2] = ((Character) ((Method) PngjBadSignature).invoke(null, objArr2)).charValue();
                    java.lang.Object[] objArr3 = {aVar, aVar};
                    java.lang.Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1405973094);
                    if (PngjBadSignature2 == null) {
                        char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 14830);
                        int lastIndexOf = 27 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0);
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 721;
                        byte b = (byte) ($$d & 11);
                        byte b2 = (byte) (b - 2);
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(fadingEdgeLength, lastIndexOf, absoluteGravity, -1356718115, false, $$e(b, b2, b2), new Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((Method) PngjBadSignature2).invoke(null, objArr3);
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
            $$a = new byte[]{54, 69, 3, 115, 0};
            $$b = 200;
        }

        public static void init$1() {
            $$c = new byte[]{34, -5, 8, -42};
            $$d = 150;
        }

        @Override // java.lang.Runnable
        public final void run() {
            PngjOutputException = (PngjInputException + 121) % 128;
            try {
                isFoundMatchingTemplates.this.Attempt();
                PngjOutputException = (PngjInputException + 27) % 128;
            } catch (Exception unused) {
            }
        }
    }

    public class PngjException implements Runnable {
        public PngjException() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            isFoundMatchingTemplates isfoundmatchingtemplates = isFoundMatchingTemplates.this;
            isfoundmatchingtemplates.getL1Score = (com.identy.ui.PngjBadCrcException) isfoundmatchingtemplates.Action.findViewById(R.id.scanner_overlay);
            isFoundMatchingTemplates.this.Attempt();
        }
    }

    public class valueOf implements Runnable {

        public class PngjBadCrcException implements Animation.AnimationListener {
            final /* synthetic */ ImageView PngjBadSignature;

            /* renamed from: com.identy.isFoundMatchingTemplates$valueOf$PngjBadCrcException$PngjBadCrcException, reason: collision with other inner class name */
            public class RunnableC0026PngjBadCrcException implements Runnable {
                public RunnableC0026PngjBadCrcException() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    PngjBadCrcException.this.PngjBadSignature.clearAnimation();
                    PngjBadCrcException.this.PngjBadSignature.setVisibility(8);
                }
            }

            public PngjBadCrcException(ImageView imageView) {
                this.PngjBadSignature = imageView;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                isFoundMatchingTemplates.this.Action.runOnUiThread(new RunnableC0026PngjBadCrcException());
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }
        }

        public valueOf() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            org.c.a.PngjBadCrcException pngjBadCrcException = isFoundMatchingTemplates.this.Capture2TActivity;
            if (pngjBadCrcException != null) {
                ViewGroup.LayoutParams layoutParams = pngjBadCrcException.getLayoutParams();
                Activity activity = isFoundMatchingTemplates.this.Action;
                int i = R.id.preview;
                layoutParams.height = activity.findViewById(i).getHeight();
                isFoundMatchingTemplates.this.Capture2TActivity.setLayoutParams(layoutParams);
                Activity activity2 = isFoundMatchingTemplates.this.Action;
                int i2 = R.id.info_layout;
                ViewGroup.LayoutParams layoutParams2 = activity2.findViewById(i2).getLayoutParams();
                layoutParams2.height = isFoundMatchingTemplates.this.Action.findViewById(i).getHeight();
                isFoundMatchingTemplates.this.Action.findViewById(i2).setLayoutParams(layoutParams2);
                Activity activity3 = isFoundMatchingTemplates.this.Action;
                int i3 = R.id.location_error_layout;
                ViewGroup.LayoutParams layoutParams3 = activity3.findViewById(i3).getLayoutParams();
                layoutParams3.height = isFoundMatchingTemplates.this.Action.findViewById(i).getHeight();
                isFoundMatchingTemplates.this.Action.findViewById(i3).setLayoutParams(layoutParams3);
                Activity activity4 = isFoundMatchingTemplates.this.Action;
                int i4 = R.id.scanner_overlay;
                ViewGroup.LayoutParams layoutParams4 = activity4.findViewById(i4).getLayoutParams();
                layoutParams4.height = isFoundMatchingTemplates.this.Action.findViewById(i).getHeight();
                isFoundMatchingTemplates.this.Action.findViewById(i4).setLayoutParams(layoutParams4);
                try {
                    if (IdentySdk.getInstance().isInlineGuide()) {
                        InlineGuideOption guideOption = IdentySdk.getInstance().getGuideOption();
                        Activity activity5 = isFoundMatchingTemplates.this.Action;
                        int i5 = R.id.inline_guide;
                        ((ImageView) activity5.findViewById(i5)).setImageResource(R.drawable.twothumb_inline_guide);
                        ImageView imageView = (ImageView) isFoundMatchingTemplates.this.Action.findViewById(i5);
                        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                        alphaAnimation.setDuration(guideOption.getDuration());
                        alphaAnimation.setInterpolator(new LinearInterpolator());
                        alphaAnimation.setRepeatCount(guideOption.getNumberOfRepeats());
                        alphaAnimation.setRepeatMode(2);
                        ViewGroup.LayoutParams layoutParams5 = isFoundMatchingTemplates.this.Action.findViewById(i5).getLayoutParams();
                        layoutParams5.height = isFoundMatchingTemplates.this.Action.findViewById(i).getHeight();
                        isFoundMatchingTemplates.this.Action.findViewById(i5).setLayoutParams(layoutParams5);
                        imageView.setVisibility(0);
                        alphaAnimation.setAnimationListener(new PngjBadCrcException(imageView));
                        imageView.startAnimation(alphaAnimation);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public class values implements Runnable {

        public class PngjBadSignature implements Runnable {
            public PngjBadSignature() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                isFoundMatchingTemplates.this.PngjOutputException();
                isFoundMatchingTemplates isfoundmatchingtemplates = isFoundMatchingTemplates.this;
                int i = R.string.id_capturing;
                com.identy.d.PngjBadSignature pngjBadSignature = isfoundmatchingtemplates.Attempt;
                if (pngjBadSignature != null) {
                    pngjBadSignature.PngjBadSignature(i, false);
                }
                isFoundMatchingTemplates.this.PngjBadCrcException(0);
            }
        }

        public values() {
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
                    isFoundMatchingTemplates.this.PngBadCharsetException();
                    Mat mat = isFoundMatchingTemplates.this.getFingerPrintQualityScore;
                    if (mat == null || Mat.n_empty(mat.PngjException)) {
                        isFoundMatchingTemplates isfoundmatchingtemplates = isFoundMatchingTemplates.this;
                        isfoundmatchingtemplates.getCaptureTime = false;
                        try {
                            if (isfoundmatchingtemplates.Capture2TActivity != null && (valuesVar3 = isfoundmatchingtemplates.getL2Score) != null) {
                                valuesVar3.values(isfoundmatchingtemplates.configure);
                                isFoundMatchingTemplates.this.Capture2TActivity.postInvalidate();
                            }
                            isFoundMatchingTemplates isfoundmatchingtemplates2 = isFoundMatchingTemplates.this;
                            Calendar.getInstance().getTimeInMillis();
                            isfoundmatchingtemplates2.getCaptureTime = false;
                            com.identy.d.PngjBadSignature pngjBadSignature = isfoundmatchingtemplates2.Attempt;
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
                    isFoundMatchingTemplates isfoundmatchingtemplates3 = isFoundMatchingTemplates.this;
                    if (isfoundmatchingtemplates3.onErrorResponse) {
                        try {
                            if (isfoundmatchingtemplates3.Capture2TActivity != null && (valuesVar4 = isfoundmatchingtemplates3.getL2Score) != null) {
                                valuesVar4.values(isfoundmatchingtemplates3.configure);
                                isFoundMatchingTemplates.this.Capture2TActivity.postInvalidate();
                            }
                            isFoundMatchingTemplates isfoundmatchingtemplates4 = isFoundMatchingTemplates.this;
                            Calendar.getInstance().getTimeInMillis();
                            isfoundmatchingtemplates4.getCaptureTime = false;
                            com.identy.d.PngjBadSignature pngjBadSignature2 = isfoundmatchingtemplates4.Attempt;
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
                    if (isfoundmatchingtemplates3.CaptureMode != 0 && timeInMillis > 15000) {
                        isfoundmatchingtemplates3.CaptureMode = 0L;
                    }
                    PreCaptureOutput valueOf = isfoundmatchingtemplates3.valueOf(new Mat(Mat.n_clone(isfoundmatchingtemplates3.getFingerPrintQualityScore.PngjException)));
                    if (valueOf.isGoodToCapture()) {
                        isFoundMatchingTemplates isfoundmatchingtemplates5 = isFoundMatchingTemplates.this;
                        isfoundmatchingtemplates5.onErrorResponse = true;
                        isfoundmatchingtemplates5.pfkrol.postDelayed(new PngjBadSignature(), 10L);
                    } else if (valueOf.getError().equals(FingerError.NO_BOXES)) {
                        isFoundMatchingTemplates.this.configure.clear();
                        isFoundMatchingTemplates isfoundmatchingtemplates6 = isFoundMatchingTemplates.this;
                        int res = valueOf.getError().getRes();
                        com.identy.d.PngjBadSignature pngjBadSignature3 = isfoundmatchingtemplates6.Attempt;
                        if (pngjBadSignature3 != null) {
                            pngjBadSignature3.PngjBadSignature(res, true);
                        }
                    } else {
                        isFoundMatchingTemplates isfoundmatchingtemplates7 = isFoundMatchingTemplates.this;
                        isfoundmatchingtemplates7.configure = isfoundmatchingtemplates7.getSpoofScore;
                        if (valueOf.getError().equals(FingerError.CORRECT)) {
                            isFoundMatchingTemplates.this.PngjBadCrcException(3 - valueOf.getStreakCount());
                        } else {
                            isFoundMatchingTemplates isfoundmatchingtemplates8 = isFoundMatchingTemplates.this;
                            int res2 = valueOf.getError().getRes();
                            com.identy.d.PngjBadSignature pngjBadSignature4 = isfoundmatchingtemplates8.Attempt;
                            if (pngjBadSignature4 != null) {
                                pngjBadSignature4.PngjBadSignature(res2, true);
                            }
                        }
                    }
                    try {
                        isFoundMatchingTemplates isfoundmatchingtemplates9 = isFoundMatchingTemplates.this;
                        if (isfoundmatchingtemplates9.Capture2TActivity != null && (valuesVar5 = isfoundmatchingtemplates9.getL2Score) != null) {
                            valuesVar5.values(isfoundmatchingtemplates9.configure);
                            isFoundMatchingTemplates.this.Capture2TActivity.postInvalidate();
                        }
                        isFoundMatchingTemplates isfoundmatchingtemplates10 = isFoundMatchingTemplates.this;
                        Calendar.getInstance().getTimeInMillis();
                        isfoundmatchingtemplates10.getCaptureTime = false;
                        com.identy.d.PngjBadSignature pngjBadSignature5 = isfoundmatchingtemplates10.Attempt;
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
                isFoundMatchingTemplates isfoundmatchingtemplates11 = isFoundMatchingTemplates.this;
                if (isfoundmatchingtemplates11.Capture2TActivity != null && (valuesVar2 = isfoundmatchingtemplates11.getL2Score) != null) {
                    valuesVar2.values(isfoundmatchingtemplates11.configure);
                    isFoundMatchingTemplates.this.Capture2TActivity.postInvalidate();
                }
                isFoundMatchingTemplates isfoundmatchingtemplates12 = isFoundMatchingTemplates.this;
                Calendar.getInstance().getTimeInMillis();
                isfoundmatchingtemplates12.getCaptureTime = false;
                com.identy.d.PngjBadSignature pngjBadSignature6 = isfoundmatchingtemplates12.Attempt;
                if (pngjBadSignature6 != null) {
                    pngjBadSignature6.getData();
                }
            } catch (Throwable th) {
                try {
                    isFoundMatchingTemplates isfoundmatchingtemplates13 = isFoundMatchingTemplates.this;
                    if (isfoundmatchingtemplates13.Capture2TActivity != null && (valuesVar = isfoundmatchingtemplates13.getL2Score) != null) {
                        valuesVar.values(isfoundmatchingtemplates13.configure);
                        isFoundMatchingTemplates.this.Capture2TActivity.postInvalidate();
                    }
                    isFoundMatchingTemplates isfoundmatchingtemplates14 = isFoundMatchingTemplates.this;
                    Calendar.getInstance().getTimeInMillis();
                    isfoundmatchingtemplates14.getCaptureTime = false;
                    com.identy.d.PngjBadSignature pngjBadSignature7 = isfoundmatchingtemplates14.Attempt;
                    if (pngjBadSignature7 != null) {
                        pngjBadSignature7.getData();
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                throw th;
            }
        }
    }

    private static String $$n(byte b, int i, byte b2) {
        int i2 = 3 - (b * 4);
        int i3 = (b2 * 5) + com.karumi.dexter.R.styleable.AppCompatTheme_tooltipFrameBackground;
        byte[] bArr = $$l;
        int i4 = i * 3;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3 = i2 + i4;
            i2 = i2;
        }
        while (true) {
            i5++;
            int i6 = i2 + 1;
            bArr2[i5] = (byte) i3;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            i3 += bArr[i6];
            i2 = i6;
        }
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        getServerRequest = 0;
        destroy = 1;
        resetAttempt = 550567048056045813L;
    }

    public isFoundMatchingTemplates(Activity activity, com.identy.d.PngjBadSignature pngjBadSignature, FingerDetectionMode fingerDetectionMode, boolean z, boolean z2) {
        super(activity, z2, fingerDetectionMode, true, false);
        this.configureroll = false;
        this.pfk = false;
        this.configure = new LinkedList();
        new NativeAlgoUtils();
        this.getProcessingTime = 2;
        this.Action = activity;
        this.Attempt = pngjBadSignature;
        this.pfkrol = new Handler(this.Action.getMainLooper());
        e1.PngjOutputException = 0L;
        this.getOveralTimetaken = new float[0];
        this.a = fingerDetectionMode.getHand();
        this.getL3Score = z;
        this.Capture2IndexActivity = new PngjOutputException(PngjExceptionInternal());
        int i = R.string.id_searching_thumb;
        com.identy.d.PngjBadSignature pngjBadSignature2 = this.Attempt;
        if (pngjBadSignature2 != null) {
            pngjBadSignature2.PngjBadSignature(i, false);
        }
        this.cvtyuv2bgr = CapturePosition.VERTICAL_FROM_BOTTOM;
    }

    public static /* synthetic */ java.lang.Object PngjException(int i, int i2, int i3, int i4, java.lang.Object[] objArr, int i5, int i6) {
        int i7 = ~((~i4) | i | i3);
        int i8 = ~((~i) | i4);
        int i9 = ~i3;
        int i10 = i8 | (~(i9 | i4));
        int i11 = ~(i9 | i);
        int i12 = (1617068012 * i6) + ((-1568348280) * i2) + i4 + i + i5;
        int i13 = i12 * i12;
        int i14 = (858456064 * i13) + (1743781888 * i6) + ((-1885339648) * i2) + (557056000 * i5) + (987930861 * i11) + ((-987930861) * i10) + (i7 * 987930861) + (1544986862 * i) + (((-430874860) * i4) - 739508224);
        int i15 = i10 * (-945);
        int i16 = i11 * 945;
        int i17 = i5 * (-973780651);
        int i18 = i2 * 424585256;
        int i19 = i6 * 537576796;
        int i20 = i13 * 1078394880;
        int i21 = i20 + i19 + i18 + i17 + i16 + i15 + (i7 * 945) + (i * (-973779706)) + (i4 * (-973781596)) + 539565670;
        if ((i21 * i21 * 192741376) + i14 != 1) {
            return valueOf(objArr);
        }
        isFoundMatchingTemplates isfoundmatchingtemplates = (isFoundMatchingTemplates) objArr[0];
        int i22 = getServerRequest;
        int i23 = i22 + 31;
        destroy = i23 % 128;
        int i24 = i23 % 2;
        isfoundmatchingtemplates.getMatchingTime = false;
        destroy = (i22 + 13) % 128;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void e(String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        Throwable cause;
        char c;
        int i2;
        if (str != null) {
            $10 = ($11 + 83) % 128;
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
        $11 = ($10 + 111) % 128;
        while (true) {
            int i3 = pngjUnsupportedException.valueOf;
            if (i3 >= cArr2.length) {
                break;
            }
            try {
                java.lang.Object[] objArr2 = {Integer.valueOf(cArr2[i3]), pngjUnsupportedException, pngjUnsupportedException};
                java.lang.Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-930920279);
                if (PngjBadSignature2 == null) {
                    byte b = (byte) 0;
                    i2 = -125632871;
                    byte b2 = b;
                    c = 1;
                    PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 1), 48 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 944, 879502610, false, $$n(b, b2, b2), new Class[]{Integer.TYPE, java.lang.Object.class, java.lang.Object.class});
                } else {
                    c = 1;
                    i2 = -125632871;
                }
                jArr[i3] = ((Long) ((Method) PngjBadSignature2).invoke(null, objArr2)).longValue() ^ (resetAttempt ^ 2636593786896957769L);
                java.lang.Object[] objArr3 = new java.lang.Object[2];
                objArr3[c] = pngjUnsupportedException;
                objArr3[0] = pngjUnsupportedException;
                java.lang.Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i2);
                if (PngjBadSignature3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 35510), TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 42, (ViewConfiguration.getTapTimeout() >> 16) + 507, 74289954, false, $$n(b3, b4, (byte) (b4 + 1)), new Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((Method) PngjBadSignature3).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw new RuntimeException(cause);
        }
        char[] cArr3 = new char[length];
        pngjUnsupportedException.valueOf = 0;
        while (true) {
            int i4 = pngjUnsupportedException.valueOf;
            if (i4 >= cArr2.length) {
                objArr[0] = new String(cArr3);
                return;
            }
            $11 = ($10 + 59) % 128;
            cArr3[i4] = (char) jArr[i4];
            java.lang.Object[] objArr4 = {pngjUnsupportedException, pngjUnsupportedException};
            java.lang.Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-125632871);
            if (PngjBadSignature4 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (Color.alpha(0) + 35511), Color.red(0) + 42, 507 - KeyEvent.getDeadChar(0, 0), 74289954, false, $$n(b5, b6, (byte) (b6 + 1)), new Class[]{java.lang.Object.class, java.lang.Object.class});
            }
            ((Method) PngjBadSignature4).invoke(null, objArr4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void f(int i, byte b, short s, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = i + 4;
        int i5 = s + 6;
        int i6 = 118 - (b * 38);
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            byte[] bArr3 = bArr;
            i3 = 0;
            int i7 = i6;
            int i8 = i4;
            int i9 = i7 + (-i4) + 5;
            int i10 = i8;
            i6 = i9;
            i4 = i10;
            bArr = bArr3;
            i2 = i3;
            int i11 = i4 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i12 = i6;
            i8 = i11;
            i4 = bArr[i11];
            bArr3 = bArr;
            i7 = i12;
            int i92 = i7 + (-i4) + 5;
            int i102 = i8;
            i6 = i92;
            i4 = i102;
            bArr = bArr3;
            i2 = i3;
            int i112 = i4 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            int i1122 = i4 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void g(byte b, short s, short s2, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = b + 4;
        byte[] bArr = $$g;
        int i4 = (s * 20) + 6;
        int i5 = (s2 * 7) + 111;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i3;
            int i7 = i4;
            i2 = 0;
            int i8 = (i3 + i7) - 5;
            int i9 = i6;
            i5 = i8;
            i3 = i9;
            i = i2;
            int i10 = i3 + 1;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i7 = bArr[i10];
            int i11 = i5;
            i6 = i10;
            i3 = i11;
            int i82 = (i3 + i7) - 5;
            int i92 = i6;
            i5 = i82;
            i3 = i92;
            i = i2;
            int i102 = i3 + 1;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i4) {
            }
        } else {
            i = 0;
            int i1022 = i3 + 1;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i4) {
            }
        }
    }

    public static void init$0() {
        $$d = new byte[]{15, -119, -68, 8, -25, 12, 2, 45, -26, 2, 38, -42, 20, 35, -46, 26, 3, -6, 1, 16, -1, 6, 26, -6, -4, 21, 27, -18, -25, 12, 2, 42, -46, 26, 3, -6, 1, 16, -1, 6, 26, -6, -4, 21, -9};
        $$e = 201;
    }

    public static void init$1() {
        $$g = new byte[]{90, 12, -119, 4, 8, -6, -52, 64, 0, 6, 14, 11, 10, -70, 70, 6, -6, 14, -6, 24, -67, 58, 17, 8, -8, -50, 36, 25, 24, -16, 16, 14, -11, 19};
        $$h = 163;
    }

    public static void init$2() {
        $$l = new byte[]{48, -79, 4, 52};
        $$m = 204;
    }

    @Override // com.identy.e1
    public final RectF Action() {
        List<RectF> PngjException2 = PngjException();
        RectF rectF = PngjException2.get(0);
        RectF rectF2 = PngjException2.get(1);
        RectF rectF3 = new RectF(rectF2.left, rectF2.top, rectF.right, rectF.bottom);
        int i = destroy + 59;
        getServerRequest = i % 128;
        if (i % 2 != 0) {
            int i2 = 27 / 0;
        }
        return rectF3;
    }

    public final void Attempt() {
        int i = (destroy + 39) % 128;
        getServerRequest = i;
        try {
            if (!this.getL3Score) {
                destroy = (i + 121) % 128;
                if (IdentySdk.getInstance().getFingerPrintDrawable() == 0) {
                    getServerRequest = (destroy + 77) % 128;
                    this.getL1Score.PngjBadSignature(this.a, 8.0d, 6.0d, 3.0d);
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.identy.e1
    public final void PngjBadCrcException(byte[] bArr, boolean z, List list, List list2, float f, Long l) {
        getServerRequest = (destroy + 11) % 128;
        super.PngjBadCrcException(bArr, z, list, list2, f, l);
        getServerRequest = (destroy + 41) % 128;
    }

    @Override // com.identy.e1
    public final Pair[] PngjExceptionInternal() {
        Hand hand = Hand.LEFT;
        Finger finger = Finger.THUMB;
        Pair[] pairArr = {new Pair(hand, finger), new Pair(Hand.RIGHT, finger)};
        int i = getServerRequest + 39;
        destroy = i % 128;
        if (i % 2 != 0) {
            return pairArr;
        }
        throw null;
    }

    @Override // com.identy.e1
    public final boolean PngjUnsupportedException() {
        boolean PngjUnsupportedException;
        destroy = (getServerRequest + 79) % 128;
        try {
            PngjUnsupportedException = super.PngjUnsupportedException();
        } catch (Exception unused) {
        }
        if (!this.PngBadCharsetException) {
            int i = destroy;
            getServerRequest = (i + 1) % 128;
            if (!this.onErrorResponse) {
                getServerRequest = (i + 1) % 128;
                if (PngjUnsupportedException) {
                    this.getQualityScore++;
                    this.getL2Score.values(this.getPadSub3, this.getPadSub2, this.getData.intValue(), this.CaptureRolledFingersActivity);
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
                    values(new values());
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.identy.e1
    public final void a() {
        getServerRequest = (destroy + 33) % 128;
        super.a();
        int i = R.string.id_searching_thumb;
        com.identy.d.PngjBadSignature pngjBadSignature = this.Attempt;
        if (pngjBadSignature != null) {
            getServerRequest = (destroy + 53) % 128;
            pngjBadSignature.PngjBadSignature(i, false);
        }
        new Message().what = 0;
        this.onErrorResponse = false;
        this.getQualityScore = 0L;
        this.getL2Score.PngjBadCrcException();
        this.Capture2TActivity.postInvalidate();
        this.Action.runOnUiThread(new PngjBadSignature());
        com.identy.d.PngjBadSignature pngjBadSignature2 = this.Attempt;
        if (pngjBadSignature2 != null) {
            pngjBadSignature2.getData();
        }
    }

    @Override // com.identy.e1
    public final void getPadSub1() {
        super.getPadSub1();
        if (this.getL1Score != null) {
            int i = destroy + 35;
            getServerRequest = i % 128;
            if (i % 2 != 0) {
                this.getL1Score = null;
                int i2 = 60 / 0;
            } else {
                this.getL1Score = null;
            }
        }
        if (this.Capture2TActivity != null) {
            this.Capture2TActivity = null;
        }
        destroy = (getServerRequest + 61) % 128;
    }

    @Override // com.identy.e1
    public final RectF onErrorResponse() {
        destroy = (getServerRequest + 121) % 128;
        RectF Action = Action();
        destroy = (getServerRequest + 53) % 128;
        return Action;
    }

    @Override // com.identy.e1, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int PngjException2 = isQualityFailed.PngjException();
        int PngjException3 = isQualityFailed.PngjException();
        PngjException(-796303406, isQualityFailed.PngjException(), PngjException2, 796303406, new java.lang.Object[]{this, context, intent}, PngjException3, isQualityFailed.PngjException());
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0022, code lost:
    
        0 = com.identy.isFoundMatchingTemplates.getServerRequest + 7;
        com.identy.isFoundMatchingTemplates.destroy = 0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if ((0 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0020, code lost:
    
        if (0.getMatchingTime != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (0.getMatchingTime != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0030, code lost:
    
        0.getMatchingTime = true;
        0.getData = java.lang.Integer.valueOf(0.Action.getWindowManager().getDefaultDisplay().getRotation() + 0);
        0 = (org.c.a.PngjBadCrcException) 0.Action.findViewById(com.identy.R.id.tracking_overlay);
        0.Capture2TActivity = 0;
        0.setLayerType(1, null);
        0 = 0.getPadSub2 / 7.0d;
        0 = 0.getPadSub3;
        0.CaptureRolledFingersActivity = new android.graphics.RectF((int) 0, (int) (0 / 6.0d), (int) (0 - 0), (int) (0 - (0 / 3.0d)));
        0.getScore = (int) (0.width() / 3.7d);
        0.isQualityFailed = (int) (0.CaptureRolledFingersActivity.width() / 2.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0095, code lost:
    
        0.getL2Score = new com.identy.ui.d.values(0.Action, 7.0d, 6.0d, 7.0d, 3.0d, com.identy.IdentySdk.getInstance().getFingerPrintDrawable(), com.identy.IdentySdk.getInstance().isDisableOuterBox(), 90, true, false, false, 0.uxd565jk, 0.cvtyuv2bgr);
     */
    @Override // com.identy.e1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void valueOf(int i, int i2, int i3, boolean z) {
        int i4 = getServerRequest + 77;
        destroy = i4 % 128;
        if (i4 % 2 == 0) {
            super.valueOf(i, i2, i3, z);
            int i5 = 96 / 0;
        } else {
            super.valueOf(i, i2, i3, z);
        }
        try {
            this.Action.runOnUiThread(new PngjException());
        } catch (Exception unused) {
        }
        this.Action.runOnUiThread(new valueOf());
        this.Capture2TActivity.valueOf = new PngjBadCrcException();
        this.Action.runOnUiThread(new valueOf());
        this.Capture2TActivity.valueOf = new PngjBadCrcException();
    }

    @Override // com.identy.e1
    public final void PngjBadCrcException() {
        int PngjException2 = isQualityFailed.PngjException();
        int PngjException3 = isQualityFailed.PngjException();
        PngjException(-1418043732, isQualityFailed.PngjException(), PngjException2, 1418043733, new java.lang.Object[]{this}, PngjException3, isQualityFailed.PngjException());
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        long j;
        char c;
        char c2;
        char c3;
        java.lang.Object[] objArr2;
        int i;
        char c4;
        Context context;
        int i2;
        java.lang.Object[] objArr3;
        char c5;
        java.lang.Object[] objArr4;
        isFoundMatchingTemplates isfoundmatchingtemplates = (isFoundMatchingTemplates) objArr[0];
        Context context2 = (Context) objArr[1];
        Intent intent = (Intent) objArr[2];
        getServerRequest = (destroy + 113) % 128;
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        e("䇝펣攺\uf69dࠗ鷠⽾䂅퉛搶笠\u0b34鲉\u2e72䏦핆曁\uf87eਢ龰ㄋ䊒", 37489 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR), objArr5);
        String str = (String) objArr5[0];
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        e("䇙\u0c29\uda2fꠧ瘫쐄鈎怡⸑ﰜ䩪\u187b\ue679둴ɇ", 19961 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), objArr6);
        String str2 = (String) objArr6[0];
        java.lang.Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1556686741);
        if (PngjBadSignature2 == null) {
            char c6 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int argb = Color.argb(0, 0, 0, 0) + 37;
            int i3 = 548 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            byte[] bArr = $$d;
            c2 = 20;
            byte b = bArr[20];
            j = 0;
            byte b2 = bArr[18];
            c = 18;
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            f(b, b2, (byte) (b2 | 12), objArr7);
            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c6, argb, i3, -1608103378, false, (String) objArr7[0], null);
        } else {
            j = 0;
            c = 18;
            c2 = 20;
        }
        long j2 = ((Field) PngjBadSignature2).getLong(null);
        if (j2 != -1 && j2 + 4611686018427387944L >= ((Long) defpackage.a.i(str, str2, null, null, null)).longValue()) {
            java.lang.Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1434812162);
            if (PngjBadSignature3 == null) {
                char argb2 = (char) Color.argb(0, 0, 0, 0);
                int argb3 = 37 - Color.argb(0, 0, 0, 0);
                int i4 = 550 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                byte[] bArr2 = $$d;
                byte b3 = (byte) (bArr2[19] + 1);
                byte b4 = bArr2[c];
                c4 = 2;
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                f(b3, (byte) (b4 - 1), b4, objArr8);
                PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(argb2, argb3, i4, 1452666181, false, (String) objArr8[0], null);
            } else {
                c4 = 2;
            }
            java.lang.Object[] objArr9 = (java.lang.Object[]) ((Field) PngjBadSignature3).get(null);
            objArr2 = new java.lang.Object[3];
            objArr2[0] = new int[1];
            objArr2[1] = new int[]{0};
            objArr2[c4] = new int[]{0};
            int i5 = ((int[]) objArr9[1])[0];
            int i6 = ((int[]) objArr9[c4])[0];
            int uptimeMillis = (int) SystemClock.uptimeMillis();
            int c7 = defpackage.a.c(uptimeMillis | 872284159, 220, (((~((~uptimeMillis) | 863884411)) | 600358823) * (-440)) + ((((~(872284159 | 0)) | 591959075) * 220) - 676811278), -98945853);
            int i7 = c7 ^ (c7 << 13);
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr2[0])[0] = i8 ^ (i8 << 5);
            i = 0;
            c3 = 3;
        } else {
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            e("䇖⥂郴砀\ue3ee䫋㉧鶋ԣ\uec05埙㼐ꚻᇛ參悀", 26783 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr10);
            Class<?> cls = Class.forName((String) objArr10[0]);
            java.lang.Object[] objArr11 = new java.lang.Object[1];
            e("䇕쥉僻\ud861掌\ueb00犮免ռ賄ᑥ鿯✳꺎㘶䆦", TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 34961, objArr11);
            try {
                java.lang.Object[] objArr12 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr11[0], java.lang.Object.class).invoke(null, isfoundmatchingtemplates)).intValue()), -98945853};
                java.lang.Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1437710995);
                if (PngjBadSignature4 == null) {
                    char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int packedPositionType = 37 - ExpandableListView.getPackedPositionType(j);
                    int indexOf = 548 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0);
                    byte b5 = $$d[c];
                    c3 = 3;
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    f((byte) 23, b5, (byte) (b5 | 6), objArr13);
                    String str3 = (String) objArr13[0];
                    Class cls2 = Integer.TYPE;
                    PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(jumpTapTimeout, packedPositionType, indexOf, -1453402328, false, str3, new Class[]{cls2, cls2});
                } else {
                    c3 = 3;
                }
                objArr2 = (java.lang.Object[]) ((Method) PngjBadSignature4).invoke(null, objArr12);
                java.lang.Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1434812162);
                if (PngjBadSignature5 == null) {
                    char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 37;
                    int red = Color.red(0) + 549;
                    byte[] bArr3 = $$d;
                    byte b6 = (byte) (bArr3[19] + 1);
                    byte b7 = bArr3[c];
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    f(b6, (byte) (b7 - 1), b7, objArr14);
                    PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(bitsPerPixel, doubleTapTimeout, red, 1452666181, false, (String) objArr14[0], null);
                }
                ((Field) PngjBadSignature5).set(null, objArr2);
                try {
                    Long valueOf2 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, null).invoke(null, null)).longValue());
                    java.lang.Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1556686741);
                    if (PngjBadSignature6 == null) {
                        char defaultSize = (char) View.getDefaultSize(0, 0);
                        int rgb = (-16777179) - Color.rgb(0, 0, 0);
                        int combineMeasuredStates = 549 - View.combineMeasuredStates(0, 0);
                        byte[] bArr4 = $$d;
                        byte b8 = bArr4[c2];
                        byte b9 = bArr4[c];
                        i = 0;
                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                        f(b8, b9, (byte) (b9 | 12), objArr15);
                        PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(defaultSize, rgb, combineMeasuredStates, -1608103378, false, (String) objArr15[0], null);
                    } else {
                        i = 0;
                    }
                    ((Field) PngjBadSignature6).set(null, valueOf2);
                    c4 = 2;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw new RuntimeException(cause);
                }
                throw new RuntimeException(th);
            }
        }
        java.lang.Object obj = objArr2[c4];
        int i9 = ((int[]) obj)[i];
        java.lang.Object obj2 = objArr2[1];
        if (((int[]) obj2)[i] == i9) {
            java.lang.Object[] objArr16 = {new int[1], new int[1], new int[1]};
            int i10 = ((int[]) objArr2[i])[i];
            int i11 = ((int[]) obj2)[i];
            int i12 = ((int[]) obj)[i];
            ((int[]) objArr16[1])[i] = i11;
            ((int[]) objArr16[2])[i] = i12;
            int a = defpackage.a.a();
            int i13 = (((~((-326661885) | a)) | (-1137581351)) * (-318)) + 1289890806;
            int i14 = ~((-1137581351) | a);
            int i15 = ~a;
            int c8 = defpackage.a.c((~(a | 1409187838)) | (~((-1082525955) | i15)), 318, ((i14 | (~(1409187838 | i15))) * 318) + i13, i10);
            int i16 = c8 ^ (c8 << 13);
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr16[i])[i] = i17 ^ (i17 << 5);
            java.lang.Object PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-175041514);
            if (PngjBadSignature7 == null) {
                char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 31077);
                int i18 = i;
                int resolveSizeAndState = View.resolveSizeAndState(i18, i18, i18) + 49;
                int maxKeyCode = 1043 - (KeyEvent.getMaxKeyCode() >> 16);
                byte[] bArr5 = $$d;
                byte b10 = bArr5[c2];
                byte b11 = bArr5[c];
                java.lang.Object[] objArr17 = new java.lang.Object[1];
                f(b10, b11, (byte) (b11 | 12), objArr17);
                PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(maximumDrawingCacheSize, resolveSizeAndState, maxKeyCode, 159283629, false, (String) objArr17[0], null);
            }
            long j3 = ((Field) PngjBadSignature7).getLong(null);
            if (j3 != -1 && j3 + 4611686018427387892L >= ((Long) defpackage.a.i(str, str2, null, null, null)).longValue()) {
                java.lang.Object PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1200224935);
                if (PngjBadSignature8 == null) {
                    char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 31077);
                    int packedPositionGroup = 49 - ExpandableListView.getPackedPositionGroup(j);
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(j) + 1044;
                    byte[] bArr6 = $$d;
                    byte b12 = bArr6[13];
                    byte b13 = (byte) (bArr6[c] - 1);
                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                    f(b12, b13, b13, objArr18);
                    PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(deadChar, packedPositionGroup, packedPositionChild, 1150904546, false, (String) objArr18[0], null);
                }
                java.lang.Object[] objArr19 = (java.lang.Object[]) ((Field) PngjBadSignature8).get(null);
                objArr3 = new java.lang.Object[5];
                objArr3[2] = new int[]{0};
                objArr3[c3] = new int[]{0};
                objArr3[4] = new int[1];
                int i19 = ((int[]) objArr19[c3])[0];
                int i20 = ((int[]) objArr19[2])[0];
                String str4 = (String) objArr19[1];
                String str5 = (String) objArr19[0];
                objArr3[1] = str4;
                objArr3[0] = str5;
                int myTid = Process.myTid();
                int i21 = ~myTid;
                int i22 = (~((-854915216) | i21)) | 11798661;
                int i23 = ~(myTid | 1073674399);
                int c9 = defpackage.a.c(~(i21 | 230557845), 713, (i23 * 1426) + ((i22 | i23) * (-713)) + 1472536582, 42969038);
                int i24 = c9 ^ (c9 << 13);
                int i25 = i24 ^ (i24 >>> 17);
                ((int[]) objArr3[4])[0] = i25 ^ (i25 << 5);
                i2 = 4;
            } else {
                if (context2 != null) {
                    int i26 = getServerRequest + 11;
                    destroy = i26 % 128;
                    if (i26 % 2 != 0) {
                        context = ((context2 instanceof ContextWrapper) && ((ContextWrapper) context2).getBaseContext() == null) ? null : context2.getApplicationContext();
                    } else {
                        boolean z = context2 instanceof ContextWrapper;
                        throw null;
                    }
                } else {
                    context = context2;
                }
                java.lang.Object[] objArr20 = new java.lang.Object[1];
                e("䇖⥂郴砀\ue3ee䫋㉧鶋ԣ\uec05埙㼐ꚻᇛ參悀", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 26783, objArr20);
                Class<?> cls3 = Class.forName((String) objArr20[0]);
                java.lang.Object[] objArr21 = new java.lang.Object[1];
                e("䇕쥉僻\ud861掌\ueb00犮免ռ賄ᑥ鿯✳꺎㘶䆦", 34961 - KeyEvent.normalizeMetaState(0), objArr21);
                int intValue = ((Integer) cls3.getMethod((String) objArr21[0], java.lang.Object.class).invoke(null, isfoundmatchingtemplates)).intValue();
                try {
                    java.lang.Object[] objArr22 = new java.lang.Object[4];
                    objArr22[c3] = 42969038;
                    objArr22[2] = 0;
                    objArr22[1] = Integer.valueOf(intValue);
                    objArr22[0] = context;
                    byte[] bArr7 = $$g;
                    byte b14 = bArr7[8];
                    byte b15 = (byte) (b14 - 1);
                    i2 = 4;
                    java.lang.Object[] objArr23 = new java.lang.Object[1];
                    g(b15, (byte) (-b15), b14, objArr23);
                    Class<?> cls4 = Class.forName((String) objArr23[0]);
                    byte b16 = bArr7[19];
                    byte b17 = bArr7[8];
                    java.lang.Object[] objArr24 = new java.lang.Object[1];
                    g(b16, b17, (byte) (b17 + 1), objArr24);
                    String str6 = (String) objArr24[0];
                    Class cls5 = Integer.TYPE;
                    objArr3 = (java.lang.Object[]) cls4.getMethod(str6, Context.class, cls5, cls5, cls5).invoke(null, objArr22);
                    if (context != null) {
                        getServerRequest = (destroy + 79) % 128;
                        java.lang.Object PngjBadSignature9 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1200224935);
                        if (PngjBadSignature9 == null) {
                            char indexOf2 = (char) (31076 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0'));
                            int i27 = (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 48;
                            int edgeSlop = 1043 - (ViewConfiguration.getEdgeSlop() >> 16);
                            byte[] bArr8 = $$d;
                            byte b18 = bArr8[13];
                            byte b19 = (byte) (bArr8[c] - 1);
                            java.lang.Object[] objArr25 = new java.lang.Object[1];
                            f(b18, b19, b19, objArr25);
                            PngjBadSignature9 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf2, i27, edgeSlop, 1150904546, false, (String) objArr25[0], null);
                        }
                        ((Field) PngjBadSignature9).set(null, objArr3);
                        try {
                            Long valueOf3 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, null).invoke(null, null)).longValue());
                            java.lang.Object PngjBadSignature10 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-175041514);
                            if (PngjBadSignature10 == null) {
                                char resolveSizeAndState2 = (char) (31077 - View.resolveSizeAndState(0, 0, 0));
                                int i28 = (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 48;
                                int deadChar2 = KeyEvent.getDeadChar(0, 0) + 1043;
                                byte[] bArr9 = $$d;
                                byte b20 = bArr9[c2];
                                byte b21 = bArr9[c];
                                java.lang.Object[] objArr26 = new java.lang.Object[1];
                                f(b20, b21, (byte) (b21 | 12), objArr26);
                                PngjBadSignature10 = com.d.e.a.PngjBadCrcException.PngjBadSignature(resolveSizeAndState2, i28, deadChar2, 159283629, false, (String) objArr26[0], null);
                            }
                            ((Field) PngjBadSignature10).set(null, valueOf3);
                        } catch (Exception unused2) {
                            throw new RuntimeException();
                        }
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
            int i29 = ((int[]) objArr3[2])[0];
            int i30 = ((int[]) objArr3[c3])[0];
            if (i30 == i29) {
                java.lang.Object[] objArr27 = new java.lang.Object[5];
                objArr27[2] = new int[]{0};
                objArr27[c3] = new int[]{0};
                objArr27[i2] = new int[1];
                int i31 = ((int[]) objArr3[i2])[0];
                int i32 = ((int[]) objArr3[c3])[0];
                int i33 = ((int[]) objArr3[2])[0];
                String str7 = (String) objArr3[1];
                String str8 = (String) objArr3[0];
                objArr27[1] = str7;
                objArr27[0] = str8;
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int c10 = defpackage.a.c((~(elapsedCpuTime | 370655110)) | 692584448, 116, ((995012480 | elapsedCpuTime) * 116) + ((~((~elapsedCpuTime) | (-68227079))) * (-116)) + 1213346597, i31);
                int i34 = c10 ^ (c10 << 13);
                int i35 = i34 ^ (i34 >>> 17);
                ((int[]) objArr27[i2])[0] = i35 ^ (i35 << 5);
                getServerRequest = (destroy + 5) % 128;
                java.lang.Object PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
                if (PngjBadSignature11 == null) {
                    char c11 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14830);
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 28;
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 721;
                    byte[] bArr10 = $$d;
                    byte b22 = bArr10[c2];
                    byte b23 = bArr10[c];
                    java.lang.Object[] objArr28 = new java.lang.Object[1];
                    f(b22, b23, (byte) (b23 | 12), objArr28);
                    PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c11, scrollBarFadeDuration, pressedStateDuration, -815159504, false, (String) objArr28[0], null);
                }
                long j4 = ((Field) PngjBadSignature11).getLong(null);
                if (j4 != -1 && j4 + 4611686018427387760L >= ((Long) defpackage.a.i(str, str2, null, null, null)).longValue()) {
                    destroy = (getServerRequest + 87) % 128;
                    java.lang.Object PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                    if (PngjBadSignature12 == null) {
                        char c12 = (char) (14830 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 28;
                        int indexOf3 = 721 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR);
                        byte b24 = $$d[c];
                        java.lang.Object[] objArr29 = new java.lang.Object[1];
                        f((byte) 23, b24, (byte) (b24 | 6), objArr29);
                        PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c12, tapTimeout, indexOf3, -779023007, false, (String) objArr29[0], null);
                    }
                    java.lang.Object[] objArr30 = (java.lang.Object[]) ((Field) PngjBadSignature12).get(null);
                    objArr4 = new java.lang.Object[i2];
                    objArr4[0] = new int[]{0};
                    objArr4[1] = new int[1];
                    objArr4[c3] = new int[]{0};
                    int i36 = ((int[]) objArr30[c3])[0];
                    int i37 = ((int[]) objArr30[0])[0];
                    objArr4[2] = (String[]) objArr30[2];
                    int elapsedRealtime = (int) SystemClock.elapsedRealtime();
                    int i38 = ~((-147559) | elapsedRealtime);
                    int i39 = ~elapsedRealtime;
                    int c13 = defpackage.a.c((~(elapsedRealtime | (-832606346))) | (~((-147559) | i39)) | (~((-201664513) | elapsedRealtime)), 920, (((~((-201812071) | i39)) | 147558) * 920) + (((i38 | (~((-832606346) | i39))) * 920) - 1578356771), 247766195);
                    int i40 = c13 ^ (c13 << 13);
                    int i41 = i40 ^ (i40 >>> 17);
                    c5 = 0;
                    ((int[]) objArr4[1])[0] = i41 ^ (i41 << 5);
                } else {
                    java.lang.Object[] objArr31 = new java.lang.Object[1];
                    e("䇖⥂郴砀\ue3ee䫋㉧鶋ԣ\uec05埙㼐ꚻᇛ參悀", 26783 - (KeyEvent.getMaxKeyCode() >> 16), objArr31);
                    Class<?> cls6 = Class.forName((String) objArr31[0]);
                    java.lang.Object[] objArr32 = new java.lang.Object[1];
                    e("䇕쥉僻\ud861掌\ueb00犮免ռ賄ᑥ鿯✳꺎㘶䆦", (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 34960, objArr32);
                    int intValue2 = ((Integer) cls6.getMethod((String) objArr32[0], java.lang.Object.class).invoke(null, isfoundmatchingtemplates)).intValue();
                    java.lang.Object[] objArr33 = {363831610};
                    java.lang.Object PngjBadSignature13 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1439412966);
                    if (PngjBadSignature13 == null) {
                        PngjBadSignature13 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 24 - (ViewConfiguration.getPressedStateDuration() >> 16), 697 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), 1457201313, false, null, new Class[]{Integer.TYPE});
                    }
                    java.lang.Object[] PngjBadSignature$1eba2e16 = arid.chunks.PngBadCharsetException.PngjBadSignature$1eba2e16(intValue2, ((Constructor) PngjBadSignature13).newInstance(objArr33), 247766195);
                    java.lang.Object PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                    if (PngjBadSignature14 == null) {
                        char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 14830);
                        int i42 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28;
                        int rgb2 = Color.rgb(0, 0, 0) + 16777937;
                        byte b25 = $$d[c];
                        java.lang.Object[] objArr34 = new java.lang.Object[1];
                        f((byte) 23, b25, (byte) (b25 | 6), objArr34);
                        PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(minimumFlingVelocity, i42, rgb2, -779023007, false, (String) objArr34[0], null);
                    }
                    ((Field) PngjBadSignature14).set(null, PngjBadSignature$1eba2e16);
                    try {
                        Long valueOf4 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, null).invoke(null, null)).longValue());
                        java.lang.Object PngjBadSignature15 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
                        if (PngjBadSignature15 == null) {
                            char green = (char) (14830 - Color.green(0));
                            int i43 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28;
                            int offsetAfter = 721 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0);
                            byte[] bArr11 = $$d;
                            byte b26 = bArr11[c2];
                            byte b27 = bArr11[c];
                            java.lang.Object[] objArr35 = new java.lang.Object[1];
                            f(b26, b27, (byte) (b27 | 12), objArr35);
                            c5 = 0;
                            PngjBadSignature15 = com.d.e.a.PngjBadCrcException.PngjBadSignature(green, i43, offsetAfter, -815159504, false, (String) objArr35[0], null);
                        } else {
                            c5 = 0;
                        }
                        ((Field) PngjBadSignature15).set(null, valueOf4);
                        objArr4 = PngjBadSignature$1eba2e16;
                    } catch (Exception unused3) {
                        throw new RuntimeException();
                    }
                }
                if (((int[]) objArr4[c3])[c5] == ((int[]) objArr4[c5])[c5]) {
                    java.lang.Object[] objArr36 = new java.lang.Object[4];
                    int[] iArr = new int[1];
                    objArr36[c5] = iArr;
                    objArr36[1] = new int[1];
                    int[] iArr2 = new int[1];
                    objArr36[c3] = iArr2;
                    int i44 = ((int[]) objArr4[1])[c5];
                    int i45 = ((int[]) objArr4[c3])[c5];
                    int i46 = ((int[]) objArr4[c5])[c5];
                    String[] strArr = (String[]) objArr4[2];
                    iArr2[c5] = i45;
                    iArr[c5] = i46;
                    objArr36[2] = strArr;
                    int startUptimeMillis = (int) Process.getStartUptimeMillis();
                    int i47 = ~startUptimeMillis;
                    int c14 = defpackage.a.c(~(i47 | 323978610), 301, (((~(startUptimeMillis | (-710587364))) | 38437218 | (~(996128755 | i47))) * (-301)) + (((~((-710587364) | i47)) | 323978610) * (-602)) + 1934592336, i44);
                    int i48 = c14 ^ (c14 << 13);
                    int i49 = i48 ^ (i48 >>> 17);
                    ((int[]) objArr36[1])[0] = i49 ^ (i49 << 5);
                    super.onReceive(context2, intent);
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                String[] strArr2 = (String[]) objArr4[2];
                if (strArr2 != null) {
                    for (String str9 : strArr2) {
                        arrayList.add(str9);
                    }
                    throw null;
                }
                throw null;
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add((String) objArr3[1]);
            arrayList2.add((String) objArr3[0]);
            throw new RuntimeException(String.valueOf(i30));
        }
        throw null;
    }
}
