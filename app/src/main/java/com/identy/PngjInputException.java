package com.identy;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.identy.ui.PngjBadCrcException;
import com.karumi.dexter.BuildConfig;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import kotlin.text.Typography;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class PngjInputException {
    public static int PngjBadCrcException;
    public static int valueOf;

    public class PngjBadCrcException implements Response.ErrorListener {
        public static int PngjException;
        public static int values;
        private /* synthetic */ PngjPrematureEnding PngjBadSignature;

        public PngjBadCrcException(PngjPrematureEnding pngjPrematureEnding) {
            this.PngjBadSignature = pngjPrematureEnding;
        }

        public static int PngjBadCrcException() {
            int i = values;
            int i2 = i % 5997829;
            values = i + 1;
            if (i2 != 0) {
                return PngjException;
            }
            int b = defpackage.a.b(2067944965);
            PngjException = b;
            return b;
        }

        @Override // com.android.volley.Response.ErrorListener
        public final void onErrorResponse(VolleyError volleyError) {
            try {
                volleyError.printStackTrace();
                PngjPrematureEnding pngjPrematureEnding = this.PngjBadSignature;
                boolean z = !(volleyError instanceof AuthFailureError);
                int i = volleyError.networkResponse.statusCode;
                pngjPrematureEnding.PngjBadSignature(z);
            } catch (Exception e) {
                e.printStackTrace();
                this.PngjBadSignature.PngjBadSignature(false);
            }
        }
    }

    public class PngjBadSignature extends StringRequest {
        private static  byte[] $$a = null;
        private static  int $$b = 0;
        private static  byte[] $$c = null;
        private static  int $$d = 0;
        private static int $10;
        private static int $11;
        private static char[] PngjBadSignature;
        private static boolean PngjExceptionInternal;
        private static long PngjInputException;
        private static int PngjOutputException;
        private static int PngjUnsupportedException;
        private static boolean valueOf;
        private static int values;
        private /* synthetic */ JSONObject PngjException;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$e(short s, int i, byte b) {
            int i2;
            int i3 = 3 - (i * 3);
            int i4 = s * 3;
            int i5 = b + 97;
            byte[] bArr = $$c;
            byte[] bArr2 = new byte[i4 + 1];
            if (bArr == null) {
                int i6 = i4;
                int i7 = 0;
                i5 += i6;
                i2 = i7;
                bArr2[i2] = (byte) i5;
                i3++;
                i7 = i2 + 1;
                if (i2 == i4) {
                    return new String(bArr2, 0);
                }
                i6 = bArr[i3];
                i5 += i6;
                i2 = i7;
                bArr2[i2] = (byte) i5;
                i3++;
                i7 = i2 + 1;
                if (i2 == i4) {
                }
            } else {
                i2 = 0;
                bArr2[i2] = (byte) i5;
                i3++;
                i7 = i2 + 1;
                if (i2 == i4) {
                }
            }
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            PngjUnsupportedException = 0;
            PngjOutputException = 1;
            PngjBadSignature = new char[]{25599, 25596, 25403, 25349, 25358, 25345, 25588, 25346, 25595, 25344, 25586, 25348, 25593, 25347, 25350, 25584, 25597, 25585, 25590, 25594, 25404, 25592, 25402, 25359, 25406, 25598, 25392, 25356, 25395, 25589, 25352, 25405, 25398, 25354, 25400, 25587, 25591};
            values = -2081201299;
            valueOf = true;
            PngjExceptionInternal = true;
            PngjInputException = -6761866525473223151L;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PngjBadSignature(String str, Response.Listener listener, Response.ErrorListener errorListener, JSONObject jSONObject) {
            super(1, str, listener, errorListener);
            this.PngjException = jSONObject;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0027). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(short s, byte b, int i, java.lang.Object[] objArr) {
            int i2;
            int i3 = 101 - (b * 4);
            int i4 = 4 - (i * 2);
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[s + 1];
            if (bArr == null) {
                int i5 = s;
                i3 = i4;
                i2 = 0;
                i4++;
                i3 = (i3 + (-i5)) - 52;
                bArr2[i2] = (byte) i3;
                if (i2 == s) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i2++;
                i5 = bArr[i4];
                i4++;
                i3 = (i3 + (-i5)) - 52;
                bArr2[i2] = (byte) i3;
                if (i2 == s) {
                }
            } else {
                i2 = 0;
                bArr2[i2] = (byte) i3;
                if (i2 == s) {
                }
            }
        }

        private static void b(int[] iArr, int i, String str, String str2, java.lang.Object[] objArr) {
            char c;
            int i2;
            String str3 = str2;
            $11 = ($10 + 45) % 128;
            byte[] bArr = str3;
            if (str3 != null) {
                bArr = str3.getBytes("ISO-8859-1");
            }
            byte[] bArr2 = bArr;
            char[] charArray = str != null ? str.toCharArray() : str;
            com.d.e.PngjExceptionInternal pngjExceptionInternal = new com.d.e.PngjExceptionInternal();
            char[] cArr = PngjBadSignature;
            Class cls = Integer.TYPE;
            int i3 = 2;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i4 = 0;
                while (i4 < length) {
                    int i5 = $11 + 89;
                    $10 = i5 % 128;
                    if (i5 % 2 != 0) {
                        try {
                            java.lang.Object[] objArr2 = {Integer.valueOf(cArr[i4])};
                            java.lang.Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(358189806);
                            if (PngjBadSignature2 == null) {
                                PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (27092 - Color.argb(0, 0, 0, 0)), 37 - (ViewConfiguration.getScrollDefaultDelay() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 118, -373889195, false, "b", new Class[]{cls});
                            }
                            cArr2[i4] = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr2)).charValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        java.lang.Object[] objArr3 = {Integer.valueOf(cArr[i4])};
                        java.lang.Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(358189806);
                        if (PngjBadSignature3 == null) {
                            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 27092), 37 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), 118 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), -373889195, false, "b", new Class[]{cls});
                        }
                        cArr2[i4] = ((Character) ((Method) PngjBadSignature3).invoke(null, objArr3)).charValue();
                        i4++;
                    }
                }
                cArr = cArr2;
            }
            java.lang.Object[] objArr4 = {Integer.valueOf(values)};
            java.lang.Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1639226071);
            if (PngjBadSignature4 == null) {
                byte b = (byte) 0;
                PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (61712 - ExpandableListView.getPackedPositionChild(0L)), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 35, 279 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -1654917268, false, $$e(b, b, (byte) $$c.length), new Class[]{cls});
            }
            int intValue = ((Integer) ((Method) PngjBadSignature4).invoke(null, objArr4)).intValue();
            char c2 = 1;
            int i6 = -528960794;
            if (!(!PngjExceptionInternal)) {
                $10 = ($11 + 51) % 128;
                int length2 = bArr2.length;
                pngjExceptionInternal.PngjException = length2;
                char[] cArr3 = new char[length2];
                pngjExceptionInternal.values = 0;
                while (true) {
                    int i7 = pngjExceptionInternal.values;
                    int i8 = pngjExceptionInternal.PngjException;
                    if (i7 >= i8) {
                        String str4 = new String(cArr3);
                        $11 = ($10 + 31) % 128;
                        objArr[0] = str4;
                        return;
                    }
                    cArr3[i7] = (char) (cArr[bArr2[(i8 - 1) - i7] + i] - intValue);
                    java.lang.Object[] objArr5 = new java.lang.Object[i3];
                    objArr5[c2] = pngjExceptionInternal;
                    objArr5[0] = pngjExceptionInternal;
                    java.lang.Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i6);
                    if (PngjBadSignature5 == null) {
                        c = c2;
                        byte b2 = (byte) 0;
                        i2 = i6;
                        byte b3 = b2;
                        PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), 37 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), (ViewConfiguration.getTouchSlop() >> 8) + 549, 479715165, false, $$e(b2, b3, b3), new Class[]{java.lang.Object.class, java.lang.Object.class});
                    } else {
                        c = c2;
                        i2 = i6;
                    }
                    ((Method) PngjBadSignature5).invoke(null, objArr5);
                    c2 = c;
                    i6 = i2;
                    i3 = 2;
                }
            } else if (valueOf) {
                $11 = ($10 + 37) % 128;
                int length3 = charArray.length;
                pngjExceptionInternal.PngjException = length3;
                char[] cArr4 = new char[length3];
                pngjExceptionInternal.values = 0;
                while (true) {
                    int i9 = pngjExceptionInternal.values;
                    int i10 = pngjExceptionInternal.PngjException;
                    if (i9 >= i10) {
                        objArr[0] = new String(cArr4);
                        return;
                    }
                    cArr4[i9] = (char) (cArr[charArray[(i10 - 1) - i9] - i] - intValue);
                    java.lang.Object[] objArr6 = {pngjExceptionInternal, pngjExceptionInternal};
                    java.lang.Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-528960794);
                    if (PngjBadSignature6 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getEdgeSlop() >> 16), 36 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0'), 550 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 479715165, false, $$e(b4, b5, b5), new Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((Method) PngjBadSignature6).invoke(null, objArr6);
                }
            } else {
                int length4 = iArr.length;
                pngjExceptionInternal.PngjException = length4;
                char[] cArr5 = new char[length4];
                pngjExceptionInternal.values = 0;
                while (true) {
                    int i11 = pngjExceptionInternal.values;
                    int i12 = pngjExceptionInternal.PngjException;
                    if (i11 >= i12) {
                        objArr[0] = new String(cArr5);
                        return;
                    } else {
                        cArr5[i11] = (char) (cArr[iArr[(i12 - 1) - i11] - i] - intValue);
                        pngjExceptionInternal.values = i11 + 1;
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x01aa  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x01ab  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void c(String str, int i, java.lang.Object[] objArr) {
            Throwable cause;
            char c;
            int i2;
            int i3;
            $11 = ($10 + 35) % 128;
            char[] charArray = str != null ? str.toCharArray() : str;
            com.d.e.PngjUnsupportedException pngjUnsupportedException = new com.d.e.PngjUnsupportedException();
            pngjUnsupportedException.PngjBadCrcException = i;
            int length = charArray.length;
            long[] jArr = new long[length];
            pngjUnsupportedException.valueOf = 0;
            while (true) {
                int i4 = pngjUnsupportedException.valueOf;
                if (i4 >= charArray.length) {
                    break;
                }
                $11 = ($10 + 55) % 128;
                try {
                    java.lang.Object[] objArr2 = {Integer.valueOf(charArray[i4]), pngjUnsupportedException, pngjUnsupportedException};
                    java.lang.Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-930920279);
                    if (PngjBadSignature2 == null) {
                        i2 = 35511;
                        byte b = (byte) 0;
                        i3 = -125632871;
                        c = 1;
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), 49 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 944, 879502610, false, $$e(b, b, $$c[0]), new Class[]{Integer.TYPE, java.lang.Object.class, java.lang.Object.class});
                    } else {
                        c = 1;
                        i2 = 35511;
                        i3 = -125632871;
                    }
                    jArr[i4] = ((Long) ((Method) PngjBadSignature2).invoke(null, objArr2)).longValue() ^ (PngjInputException ^ 2636593786896957769L);
                    java.lang.Object[] objArr3 = new java.lang.Object[2];
                    objArr3[c] = pngjUnsupportedException;
                    objArr3[0] = pngjUnsupportedException;
                    java.lang.Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                    if (PngjBadSignature3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (i2 - (Process.myTid() >> 22)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 42, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 507, 74289954, false, $$e(b2, b3, (byte) (b3 | 23)), new Class[]{java.lang.Object.class, java.lang.Object.class});
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
                throw cause;
            }
            char[] cArr = new char[length];
            pngjUnsupportedException.valueOf = 0;
            while (true) {
                int i5 = pngjUnsupportedException.valueOf;
                if (i5 >= charArray.length) {
                    String str2 = new String(cArr);
                    $11 = ($10 + 19) % 128;
                    objArr[0] = str2;
                    return;
                }
                int i6 = $10 + 21;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    cArr[i5] = (char) jArr[i5];
                    java.lang.Object[] objArr4 = {pngjUnsupportedException, pngjUnsupportedException};
                    java.lang.Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-125632871);
                    if (PngjBadSignature4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 35510), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 43, 508 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 74289954, false, $$e(b4, b5, (byte) (b5 | 23)), new Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((Method) PngjBadSignature4).invoke(null, objArr4);
                    int i7 = 24 / 0;
                } else {
                    cArr[i5] = (char) jArr[i5];
                    java.lang.Object[] objArr5 = {pngjUnsupportedException, pngjUnsupportedException};
                    java.lang.Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-125632871);
                    if (PngjBadSignature5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (KeyEvent.normalizeMetaState(0) + 35511), Color.red(0) + 42, 507 - View.MeasureSpec.getSize(0), 74289954, false, $$e(b6, b7, (byte) (b7 | 23)), new Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((Method) PngjBadSignature5).invoke(null, objArr5);
                }
            }
        }

        public static void init$0() {
            $$a = new byte[]{32, -56, -74, 95, 0};
            $$b = 123;
        }

        public static void init$1() {
            $$c = new byte[]{18, 103, 62, 73};
            $$d = 144;
        }

        /* JADX WARN: Code restructure failed: missing block: B:100:0x1283, code lost:
        
            0 = $$a[0];
            0 = -(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            0 = (0 ^ 128) + ((0 & 128) << 1);
            0 = new java.lang.Object[1];
            b(null, 0, null, "\u0095\u0089\u008f\u0098\u0095\u0094\u0088\u0092\u0090\u0093\u0090\u0095", 0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:101:0x12ad, code lost:
        
            0 = new java.lang.Object[]{((java.lang.String) $$a[0]).concat(java.lang.String.valueOf(0))};
            0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1666380462);
         */
        /* JADX WARN: Code restructure failed: missing block: B:102:0x12b8, code lost:
        
            if (0 != null) goto L181;
         */
        /* JADX WARN: Code restructure failed: missing block: B:103:0x12ba, code lost:
        
            0 = (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            0 = 28 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
            0 = 1447 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16);
            0 = (byte) (com.identy.PngjInputException.PngjBadSignature.$$b & 5);
            0 = 0;
            0 = com.identy.PngjInputException.PngjBadSignature.$$a[4];
            0 = 0;
            0 = new java.lang.Object[1];
            a(0, 0, 0, 0);
            0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(0, 0, 0, -1614962923, false, (java.lang.String) $$a[0], new java.lang.Class[]{java.lang.String.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:104:0x1306, code lost:
        
            0 = ((java.lang.Long) ((java.lang.reflect.Method) 0).invoke(null, 0)).longValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:105:0x1313, code lost:
        
            0 = -1664614654;
            0 = 0;
            0 = 765;
            0 = 0 ^ 0;
            0 = 0 ^ 0;
            0 = 0 | 0;
            0 = 0;
            0 = 0 ^ 0;
            0 = (((((0 | 0) ^ 0) | (((0 | 0) | 0) ^ 0)) * 0) + ((1530 * ((0 ^ 0) | ((0 | 0) ^ 0))) + ((((((0 | 0) ^ 0) | (((0 | 0) | 0) ^ 0)) | (((0 | 0) | 0) ^ 0)) * 0) + (((-764) * 0) + ((-1529) * 0))))) + 2135102971;
            0 = (int) android.os.Process.getStartElapsedRealtime();
            0 = ((int) (0 >> 32)) & defpackage.a.c((~(0 | (-122534499))) | 16850978, 490, (((-105683521) | (~0)) * (-490)) + 1478807014, 46057030);
            0 = ~(android.os.Process.myUid() | 714489693);
            0 = ((int) 0) & (((0 | 714484312) * 196) + (((5381 | 0) * (-196)) + 258823881));
         */
        /* JADX WARN: Code restructure failed: missing block: B:106:0x13b4, code lost:
        
            if (((0 & 0) | (0 ^ 0)) != 0) goto L186;
         */
        /* JADX WARN: Code restructure failed: missing block: B:107:0x13b6, code lost:
        
            0 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:109:0x13b9, code lost:
        
            0 = (0 * (-112)) + (0 * (-112));
            0 = ~0;
            0 = (0 & 0) | (0 ^ 0);
            0 = ((~0) | 0) * 226;
            0 = (0 & 0) + (0 | 0);
            0 = ~0;
            0 = ~((0 ^ 0) | (0 & 0));
            0 = ~(0 | 0);
            0 = (0 & 0) | (0 ^ 0);
            0 = ~((0 & 0) | (0 ^ 0));
            0 = (0 - (~(-(-(((0 & 0) | (0 ^ 0)) * (-113)))))) - 1;
            0 = ~0;
            0 = (0 - (~((~((0 & 0) | (0 ^ 0))) * 113))) - 1;
            0 = ((0 | 1) << 1) - (0 ^ 1);
            0 = 0;
            0 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:110:0x13b8, code lost:
        
            0 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:112:0x1302, code lost:
        
            0 = 0;
            0 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:115:0x1275, code lost:
        
            if (0 < 25.2d) goto L174;
         */
        /* JADX WARN: Code restructure failed: missing block: B:116:0x1277, code lost:
        
            0 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:117:0x127a, code lost:
        
            if (0 == false) goto L163;
         */
        /* JADX WARN: Code restructure failed: missing block: B:118:0x125a, code lost:
        
            0 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:207:0x1e8d, code lost:
        
            if (((0 & 0) | (0 ^ 0)) == 0) goto L287;
         */
        /* JADX WARN: Code restructure failed: missing block: B:448:0x26d3, code lost:
        
            if (0 == null) goto L404;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0472, code lost:
        
            if ((0 | (0 & (((((~((-986869648) | 0)) | 1157697600) | 0) * 520) + (((0 | 0) * (-1040)) + 0)))) != 477111747) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x07c3, code lost:
        
            if (android.os.Build.VERSION.SDK_INT <= 33) goto L84;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x07c5, code lost:
        
            0 = -(-android.os.Process.getGidForName(com.karumi.dexter.BuildConfig.FLAVOR));
            0 = ((0 | 128) << 1) - (0 ^ 128);
            0 = new java.lang.Object[1];
            b(null, 0, null, "\u008a\u0081\u0083\u0088\u008d\u0098\u0085\u008c\u008c\u008b\u0098\u0088\u0086\u0097\u0086\u0096\u008d\u008d\u0095\u0092\u008f\u0089\u008f\u0095\u008a\u0092\u0088\u0095", 0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x07df, code lost:
        
            0 = new java.lang.Object[]{(java.lang.String) $$a[0]};
            0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1666380462);
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x07ea, code lost:
        
            if (0 != null) goto L79;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x07ec, code lost:
        
            0 = (char) android.widget.ExpandableListView.getPackedPositionType(0);
            0 = 27 - android.widget.ExpandableListView.getPackedPositionChild(0);
            0 = 1447 - android.text.TextUtils.getOffsetAfter(com.karumi.dexter.BuildConfig.FLAVOR, 0);
            0 = (byte) (com.identy.PngjInputException.PngjBadSignature.$$b & 5);
            0 = com.identy.PngjInputException.PngjBadSignature.$$a[4];
            0 = new java.lang.Object[1];
            a(0, 0, 0, 0);
            0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(0, 0, 0, -1614962923, false, (java.lang.String) $$a[0], new java.lang.Class[]{java.lang.String.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:525:0x127c, code lost:
        
            0 = 0;
            0 = 0;
            0 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:526:0x1279, code lost:
        
            0 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:527:0x1267, code lost:
        
            0 = kotlin.text.Typography.quote;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0829, code lost:
        
            0 = ((java.lang.Long) ((java.lang.reflect.Method) 0).invoke(null, 0)).longValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:539:0x1140, code lost:
        
            if (((0 & 0) | (0 ^ 0)) == 477111747) goto L134;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0836, code lost:
        
            0 = 362670167;
            0 = -55;
            0 = 0 * 0;
            0 = 56;
            0 = 0;
            0 = (((0 | (((0 ^ 0) | 0) ^ 0)) * 0) + (((-56) * ((0 | 0) ^ 0)) + (((0 | ((0 | 0) ^ 0)) * 0) + ((0 * 0) + 0)))) + 107818150;
            0 = (((~((-697846851) | 0)) | 92947754) * 262) - 29601230;
            0 = ~0;
            0 = ((int) (0 >> 32)) & ((((~((-697846851) | 0)) | 92947754) * 262) + 0);
            0 = ((int) 0) & defpackage.a.c((~((-1099040838) | 0)) | 2629888, 576, (((~(170407730 | 0)) | (-1269448568)) * 576) + 1771465493, -1057934848);
         */
        /* JADX WARN: Code restructure failed: missing block: B:549:0x1258, code lost:
        
            if (((0 | (((int) 0) & (((~(1273795280 | 0)) * 713) + ((0 * 1426) + (((0 | 0) * (-713)) + (-21569212)))))) == 477111747 ? 'N' : kotlin.text.Typography.amp) != 'N') goto L163;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x08b8, code lost:
        
            if (((0 & 0) | (0 ^ 0)) != 1) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x08ba, code lost:
        
            0 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:561:0x08bd, code lost:
        
            0 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:562:0x08c0, code lost:
        
            0 = new java.lang.Object[1];
            c("輪᧶ꋴ䭿퐹绿ޫ選㤷쏰沰\uf57f鸱", 38592 - (~(-(android.view.ViewConfiguration.getWindowTouchSlop() >> 8))), 0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:563:0x08d9, code lost:
        
            0 = new java.lang.Object[]{(java.lang.String) $$a[0]};
            0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(547370249);
         */
        /* JADX WARN: Code restructure failed: missing block: B:564:0x08e1, code lost:
        
            if (0 != null) goto L88;
         */
        /* JADX WARN: Code restructure failed: missing block: B:565:0x08e3, code lost:
        
            0 = (char) (android.text.TextUtils.lastIndexOf(com.karumi.dexter.BuildConfig.FLAVOR, '0') + 8753);
            0 = 24 - android.widget.ExpandableListView.getPackedPositionGroup(0);
            0 = android.view.KeyEvent.normalizeMetaState(0) + 336;
            0 = com.identy.PngjInputException.PngjBadSignature.$$a[4];
            0 = 0;
            0 = new java.lang.Object[1];
            a(0, (byte) (0 + 1), 0, 0);
            0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(0, 0, 0, -598779726, false, (java.lang.String) $$a[0], new java.lang.Class[]{java.lang.String.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:566:0x0923, code lost:
        
            0 = ((java.lang.reflect.Method) 0).invoke(null, 0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:567:0x092a, code lost:
        
            0 = new java.lang.Object[1];
            b(null, android.text.TextUtils.lastIndexOf(com.karumi.dexter.BuildConfig.FLAVOR, '0', 0) + 128, null, "\u0099", 0);
            0 = 0.equals((java.lang.String) $$a[0]);
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0943, code lost:
        
            if (0 == false) goto L94;
         */
        /* JADX WARN: Code restructure failed: missing block: B:575:0x0587, code lost:
        
            if ((0 | (0 & (((0 | 920006723) * 245) + ((0 * (-245)) + 0)))) != 477111747) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0945, code lost:
        
            com.identy.PngjInputException.PngjBadSignature.PngjOutputException = (com.identy.PngjInputException.PngjBadSignature.PngjUnsupportedException + 83) % 128;
            0 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:583:0x0697, code lost:
        
            if (((0 & 0) | (0 ^ 0)) != (-1032769152)) goto L65;
         */
        /* JADX WARN: Code restructure failed: missing block: B:591:0x07bd, code lost:
        
            if ((0 | (0 & (((((~(0 | (-1784390698))) | 710542376) | (~(0 | 2147198509))) * 988) + ((((~((-1073848322) | 0)) | (~(2147198509 | 0))) * 988) + 534607265)))) == 542074309) goto L73;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x0ffd, code lost:
        
            if (((0 & 0) | (0 ^ 0)) != 477111747) goto L136;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x1000, code lost:
        
            0 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x125e, code lost:
        
            0 = 0;
            0 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x1262, code lost:
        
            if (0 >= 28) goto L168;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x1264, code lost:
        
            0 = '7';
         */
        /* JADX WARN: Code restructure failed: missing block: B:99:0x126b, code lost:
        
            if (0 == '7') goto L177;
         */
        /* JADX WARN: Removed duplicated region for block: B:122:0x140b  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x1495  */
        /* JADX WARN: Removed duplicated region for block: B:145:0x1720  */
        /* JADX WARN: Removed duplicated region for block: B:147:0x1787  */
        /* JADX WARN: Removed duplicated region for block: B:168:0x19d6  */
        /* JADX WARN: Removed duplicated region for block: B:171:0x19e0  */
        /* JADX WARN: Removed duplicated region for block: B:173:0x1aa0  */
        /* JADX WARN: Removed duplicated region for block: B:210:0x1fce  */
        /* JADX WARN: Removed duplicated region for block: B:212:0x2032  */
        /* JADX WARN: Removed duplicated region for block: B:274:0x26d9  */
        /* JADX WARN: Removed duplicated region for block: B:276:0x26ea  */
        /* JADX WARN: Removed duplicated region for block: B:278:0x26f4  */
        /* JADX WARN: Removed duplicated region for block: B:431:0x3b43  */
        /* JADX WARN: Removed duplicated region for block: B:433:0x26ee  */
        /* JADX WARN: Removed duplicated region for block: B:434:0x26e7  */
        /* JADX WARN: Removed duplicated region for block: B:518:0x19db  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static java.lang.Object[] values$1eba2e16(int i, java.lang.Object obj, int i2) {
            throw new UnsupportedOperationException("Method not decompiled");
        }

        private static java.lang.Object[] values$1eba2e16_REMOVED(int i, java.lang.Object obj, int i2) {
            int i3;
            int i4;
            char c;
            char c2;
            int i5;
            long j;
            long j2;
            long j3;
            String[] strArr;
            Class cls;
            boolean z;
            long j4;
            long j5;
            int i6;
            boolean z2;
            long j6;
            boolean z3;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            BufferedInputStream bufferedInputStream;
            BufferedInputStream bufferedInputStream2;
            int i12;
            int i13;
            char c3;
            char c4;
            Class cls2;
            long j7;
            int i14;
            int i15;
            java.lang.Object[] objArr;
            char c5;
            boolean z4;
            long j8;
            int i16;
            String[] strArr2;
            java.lang.Object[] objArr2;
            int parseInt;
            String[] strArr3;
            int i17;
            boolean z5;
            java.lang.Object obj2;
            java.lang.Object obj3;
            Class cls3;
            Class cls4;
            java.lang.Object obj4;
            java.lang.Object obj5;
            try {
                java.lang.Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1085800324);
                if (PngjBadSignature2 == null) {
                    char trimmedLength = (char) (1179 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR));
                    int trimmedLength2 = 44 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR);
                    i3 = 42;
                    int i18 = 1092 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    i4 = 5;
                    byte b = $$a[4];
                    c = '\r';
                    byte b2 = b;
                    c2 = 31;
                    i5 = 16;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a(b2, (byte) (b2 + 1), b, objArr3);
                    PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(trimmedLength, trimmedLength2, i18, -1135046081, false, (String) objArr3[0], new Class[0]);
                } else {
                    i3 = 42;
                    i4 = 5;
                    c = '\r';
                    c2 = 31;
                    i5 = 16;
                }
                long longValue = ((Long) ((Method) PngjBadSignature2).invoke(null, null)).longValue();
                long j9 = 280631332;
                long j10 = -1939;
                int i19 = 0;
                long j11 = 971;
                long j12 = -970;
                long j13 = -1;
                long j14 = longValue ^ j13;
                long myTid = ((Process.myTid() ^ j13) | longValue) ^ j13;
                long j15 = ((((j14 | j9) ^ j13) | myTid) * j12) + (j11 * longValue) + (j10 * j9);
                long j16 = 1940;
                long j17 = j9 ^ j13;
                long j18 = 970;
                long j19 = ((myTid | ((j17 | j14) ^ j13)) * j18) + (((j17 | longValue) ^ j13) * j16) + j15 + 1644284985;
                int myUid = Process.myUid();
                int i20 = ((int) (j19 >> 32)) & (((16818464 | (~((~myUid) | 1867970557))) * 449) + ((16818464 | (~(1867970557 | myUid))) * 449) + 419305448);
                int i21 = ((int) j19) & ((((~((~((int) Process.getStartUptimeMillis())) | 48386888)) | 1517222842) * 184) + (((1525611514 | 0) * 184) - 1433354915));
                if (((i20 & i21) | (i20 ^ i21)) != 0) {
                    java.lang.Object[] objArr4 = {new int[]{0}, new int[]{((~0) & 0) | ((~0) & 0)}, null, new int[]{i}};
                    int i22 = (~(i & 271)) & (i | 271);
                    int i23 = ~i;
                    int i24 = ((114697 | (~((-803093799) | i)) | (~(803093798 | i23))) * 988) + (((~(231472175 | i23)) | 571736320) * (-1976)) + ((i | 114697) * 988) + 2094771509;
                    int i25 = ((i24 | 16) << 1) - (i24 ^ 16);
                    int i26 = i25 * (-103);
                    int i27 = i2 * (-103);
                    int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
                    int i29 = ~i25;
                    int i30 = ~i2;
                    int i31 = ~((i29 & i30) | (i29 ^ i30));
                    int i32 = ~((i30 & i) | (i30 ^ i));
                    int i33 = ((i31 & i32) | (i31 ^ i32)) * 104;
                    int i34 = ((((~(i2 | ((~i) | i25))) * (-104)) + (((i28 | i33) << 1) - (i33 ^ i28))) - (~(-(-(((i & i25) | (i25 ^ i)) * 104))))) - 1;
                    int i35 = i34 << 13;
                    int i36 = (i35 & (~i34)) | ((~i35) & i34);
                    int i37 = i36 >>> 17;
                    int i38 = (i36 | i37) & (~(i36 & i37));
                    int i39 = i38 << 5;
                    return objArr4;
                }
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                b(null, 126 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0'), null, "\u0088\u0081\u0085\u0087\u0086\u0081\u0085\u0084\u0083\u0082\u0081", objArr5);
                java.lang.Object[] objArr6 = {(String) objArr5[0]};
                java.lang.Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(547370249);
                if (PngjBadSignature3 == null) {
                    char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 8752);
                    int alpha = 24 - Color.alpha(0);
                    int mode = View.MeasureSpec.getMode(0) + 336;
                    byte b3 = $$a[4];
                    j = j12;
                    byte b4 = b3;
                    j2 = j10;
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a(b4, (byte) (b4 + 1), b3, objArr7);
                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(fadingEdgeLength, alpha, mode, -598779726, false, (String) objArr7[0], new Class[]{String.class});
                } else {
                    j = j12;
                    j2 = j10;
                }
                String str = (String) ((Method) PngjBadSignature3).invoke(null, objArr6);
                Class cls5 = Integer.TYPE;
                if (str != null) {
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    j3 = 0;
                    b(null, 126 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0'), null, "\u008b\u0084\u008a\u0089\u0085\u0081", objArr8);
                    String str2 = (String) objArr8[0];
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    b(null, 126 - (~TextUtils.getTrimmedLength(BuildConfig.FLAVOR)), null, "\u0084\u0090\u008f\u008e\u0086\u008d\u0082\u008c", objArr9);
                    String[] strArr4 = {str2, (String) objArr9[0]};
                    int i40 = 0;
                    while (true) {
                        if (i40 >= 2) {
                            break;
                        }
                        if (str.contains(strArr4[i40])) {
                            PngjUnsupportedException = (PngjOutputException + 89) % 128;
                            int i41 = -(-TextUtils.getTrimmedLength(BuildConfig.FLAVOR));
                            int i42 = ((i41 | 27883) << 1) - (i41 ^ 27883);
                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                            c("輪\ue3dc嚠짩㲆꾠ʾ畀\ue863孯치ℬ鐽ࣙ篷\ueefb䆉뒠➪驜൶恺팘", i42, objArr10);
                            java.lang.Object[] objArr11 = {(String) objArr10[i19]};
                            java.lang.Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(547370249);
                            if (PngjBadSignature4 == null) {
                                char c6 = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(i19) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i19) == 0.0d ? 0 : -1)) + 8752);
                                int mode2 = View.MeasureSpec.getMode(i19) + 24;
                                int i43 = i19;
                                int argb = Color.argb(i43, i43, i43, i43) + 336;
                                byte b5 = $$a[4];
                                byte b6 = b5;
                                java.lang.Object[] objArr12 = new java.lang.Object[1];
                                a(b6, (byte) (b6 + 1), b5, objArr12);
                                PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c6, mode2, argb, -598779726, false, (String) objArr12[0], new Class[]{String.class});
                            }
                            java.lang.Object invoke = ((Method) PngjBadSignature4).invoke(null, objArr11);
                            int i44 = -(-TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0));
                            int i45 = (i44 ^ 127) + ((i44 & 127) << 1);
                            java.lang.Object[] objArr13 = new java.lang.Object[1];
                            b(null, i45, null, "\u0081\u0088\u0081\u008b\u0092\u008a\u0085\u008e\u008b\u0089\u0085\u0094\u0083\u0094\u0088\u0092\u0090\u0093\u0090\u0083\u0092\u008a\u008b\u0086\u0082\u0081\u0091\u0083\u0082\u0081", objArr13);
                            java.lang.Object[] objArr14 = {(String) objArr13[0]};
                            java.lang.Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(547370249);
                            if (PngjBadSignature5 == null) {
                                char gidForName = (char) (8751 - Process.getGidForName(BuildConfig.FLAVOR));
                                int i46 = 25 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 336;
                                byte b7 = $$a[4];
                                byte b8 = b7;
                                obj4 = invoke;
                                java.lang.Object[] objArr15 = new java.lang.Object[1];
                                a(b8, (byte) (b8 + 1), b7, objArr15);
                                PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(gidForName, i46, maximumFlingVelocity, -598779726, false, (String) objArr15[0], new Class[]{String.class});
                            } else {
                                obj4 = invoke;
                            }
                            java.lang.Object invoke2 = ((Method) PngjBadSignature5).invoke(null, objArr14);
                            if (obj4 != null) {
                                PngjOutputException = (PngjUnsupportedException + 111) % 128;
                                java.lang.Object[] objArr16 = {obj4, Integer.valueOf(i3)};
                                java.lang.Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(989703296);
                                if (PngjBadSignature6 == null) {
                                    char lastIndexOf = (char) (11038 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0));
                                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 31;
                                    int resolveOpacity = 1282 - Drawable.resolveOpacity(0, 0);
                                    byte b9 = (byte) ($$b & 5);
                                    byte b10 = $$a[4];
                                    obj5 = invoke2;
                                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                                    a(b9, b10, b10, objArr17);
                                    PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(lastIndexOf, packedPositionType, resolveOpacity, -971849413, false, (String) objArr17[0], new Class[]{String.class, cls5});
                                } else {
                                    obj5 = invoke2;
                                }
                                long longValue2 = ((Long) ((Method) PngjBadSignature6).invoke(null, objArr16)).longValue();
                                long j20 = -880450680;
                                long j21 = -167;
                                long j22 = j21 * j20;
                                long j23 = longValue2 ^ j13;
                                long j24 = ((j20 ^ j13) | j23) ^ j13;
                                long uptimeMillis = (int) SystemClock.uptimeMillis();
                                long j25 = (168 * (j23 | (((uptimeMillis ^ j13) | j20) ^ j13))) + ((-168) * (((j20 | longValue2) ^ j13) | ((j20 | uptimeMillis) ^ j13))) + ((j24 | ((j23 | uptimeMillis) ^ j13)) * 336) + (j21 * longValue2) + j22 + 1536158380;
                                int i47 = (((~(2088217598 | i)) | 1370117544) * 398) + 1275592124;
                                int i48 = ~i;
                                int i49 = ((int) (j25 >> 32)) & ((((~(2088217598 | i48)) | 1370117544) * 398) + i47);
                                int i50 = (int) j25;
                                int i51 = (((~((-713173639) | i48)) | (~(1870871238 | i))) * 520) - 1317899763;
                                int i52 = ~((-1870871239) | i48);
                                int i53 = ~(986869647 | i);
                            } else {
                                obj5 = invoke2;
                            }
                            if (obj5 != null) {
                                int i54 = PngjOutputException;
                                PngjUnsupportedException = ((i54 & 49) + (i54 | 49)) % 128;
                                java.lang.Object[] objArr18 = {obj5, Integer.valueOf(i3)};
                                java.lang.Object PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(989703296);
                                if (PngjBadSignature7 == null) {
                                    char blue = (char) (11039 - Color.blue(0));
                                    int gidForName2 = Process.getGidForName(BuildConfig.FLAVOR) + 32;
                                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 1282;
                                    byte b11 = (byte) ($$b & 5);
                                    byte b12 = $$a[4];
                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                    a(b11, b12, b12, objArr19);
                                    PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(blue, gidForName2, tapTimeout, -971849413, false, (String) objArr19[0], new Class[]{String.class, cls5});
                                }
                                long longValue3 = ((Long) ((Method) PngjBadSignature7).invoke(null, objArr18)).longValue();
                                long j26 = 70892543;
                                long j27 = ((-903) * longValue3) + (905 * j26);
                                long j28 = j26 ^ j13;
                                long myTid2 = Process.myTid();
                                long j29 = myTid2 ^ j13;
                                long j30 = ((-1808) * (((j28 | myTid2) ^ j13) | ((j29 | longValue3) ^ j13))) + j27;
                                long j31 = 904;
                                long j32 = longValue3 ^ j13;
                                long j33 = j29 | j26;
                                long j34 = (j31 * (((j28 | longValue3) ^ j13) | ((j32 | myTid2) ^ j13) | (j33 ^ j13))) + (((((j28 | j32) | myTid2) ^ j13) | ((j33 | longValue3) ^ j13)) * j31) + j30 + 584815157;
                                int i55 = ((int) (j34 >> 32)) & ((((~((-217570581) | (~i))) | 1145415042) * 262) + ((((~((-217570581) | i)) | 1145415042) * 262) - 1332384998));
                                int i56 = (int) j34;
                                int uptimeMillis2 = (int) SystemClock.uptimeMillis();
                                int i57 = (((~((~uptimeMillis2) | (-1937734163))) | 1093224976) * (-245)) - 1202107024;
                                int i58 = ~(uptimeMillis2 | (-1937734163));
                            }
                            if (obj4 != null) {
                                java.lang.Object[] objArr20 = {obj4, Integer.valueOf(i3)};
                                java.lang.Object PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(989703296);
                                if (PngjBadSignature8 == null) {
                                    char resolveOpacity2 = (char) (Drawable.resolveOpacity(0, 0) + 11039);
                                    int longPressTimeout = 31 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                    int touchSlop = 1282 - (ViewConfiguration.getTouchSlop() >> 8);
                                    byte b13 = (byte) ($$b & 5);
                                    byte b14 = $$a[4];
                                    java.lang.Object[] objArr21 = new java.lang.Object[1];
                                    a(b13, b14, b14, objArr21);
                                    PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(resolveOpacity2, longPressTimeout, touchSlop, -971849413, false, (String) objArr21[0], new Class[]{String.class, cls5});
                                }
                                long longValue4 = ((Long) ((Method) PngjBadSignature8).invoke(null, objArr20)).longValue();
                                long j35 = -1254972398;
                                long j36 = (302 * longValue4) + ((-300) * j35);
                                long j37 = -301;
                                long j38 = j35 | longValue4;
                                long j39 = i;
                                long j40 = longValue4 ^ j13;
                                long j41 = (301 * (j40 | (((j35 ^ j13) | j39) ^ j13))) + (j37 * (((j40 | j39) ^ j13) | (((j39 ^ j13) | j35) ^ j13))) + (((j38 | j39) ^ j13) * j37) + j36 + 1910680098;
                                int freeMemory = (int) Runtime.getRuntime().freeMemory();
                                int c7 = ((int) (j41 >> 32)) & defpackage.a.c((~(freeMemory | (-35073))) | 556073032, 446, (((~((~freeMemory) | (-440594226))) | 440559153) * 446) + 384374654, -1079113378);
                                int i59 = (int) j41;
                                int i60 = ~(2129513423 | i);
                                int i61 = ~i;
                                int i62 = i59 & ((((~((-692287014) | i)) | (~(i61 | (-2129513424)))) * 406) + ((~(2146435055 | i61)) * (-406)) + (((i60 | (~((-1454148043) | i61))) * (-406)) - 331935801));
                            }
                            if (obj5 != null) {
                                java.lang.Object[] objArr22 = {obj5, Integer.valueOf(i3)};
                                java.lang.Object PngjBadSignature9 = com.d.e.a.PngjBadCrcException.PngjBadSignature(989703296);
                                if (PngjBadSignature9 == null) {
                                    char c8 = (char) (11040 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                    int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 31;
                                    int deadChar = 1282 - KeyEvent.getDeadChar(0, 0);
                                    byte b15 = (byte) ($$b & 5);
                                    byte b16 = $$a[4];
                                    java.lang.Object[] objArr23 = new java.lang.Object[1];
                                    a(b15, b16, b16, objArr23);
                                    PngjBadSignature9 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c8, touchSlop2, deadChar, -971849413, false, (String) objArr23[0], new Class[]{String.class, cls5});
                                }
                                long longValue5 = ((Long) ((Method) PngjBadSignature9).invoke(null, objArr22)).longValue();
                                long j42 = 406215024;
                                long j43 = ((-903) * longValue5) + (905 * j42);
                                long j44 = j42 ^ j13;
                                long b17 = defpackage.a.b(1753428702);
                                long j45 = b17 ^ j13;
                                long j46 = ((-1808) * (((j44 | b17) ^ j13) | ((j45 | longValue5) ^ j13))) + j43;
                                long j47 = 904;
                                long j48 = longValue5 ^ j13;
                                long j49 = j45 | j42;
                                long j50 = (j47 * (((j44 | longValue5) ^ j13) | ((j48 | b17) ^ j13) | (j49 ^ j13))) + (((((j44 | j48) | b17) ^ j13) | ((j49 | longValue5) ^ j13)) * j47) + j46 + 249492676;
                                int i63 = ~i;
                                int i64 = ((int) (j50 >> 32)) & ((((~((-1510627398) | i63)) | (~(i63 | (-73400987)))) * 614) + (((~(74785722 | i63)) | (-1585413120) | (~(1512012133 | i63))) * (-1228)) + (((-1584028384) | i) * 614) + 2100919018);
                                int i65 = (int) j50;
                                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                                int i66 = ~startUptimeMillis;
                            }
                        } else {
                            int i67 = ((i40 | (-45)) << 1) - (i40 ^ (-45));
                            i40 = (i67 & 46) + (i67 | 46);
                            i19 = 0;
                        }
                    }
                } else {
                    j3 = 0;
                }
                boolean z6 = false;
                if (z6) {
                    java.lang.Object[] objArr24 = {new int[]{i ^ 260}, new int[1], null, new int[]{i}};
                    int freeMemory2 = (int) Runtime.getRuntime().freeMemory();
                    int i68 = -(-defpackage.a.A(~((~freeMemory2) | (-556341286)), 501, (((~((-556341286) | freeMemory2)) | 8396928) * 501) + 1568562796, -16));
                    int i69 = (i2 ^ i68) + ((i68 & i2) << 1);
                    int i70 = i69 << 13;
                    int i71 = (i70 | i69) & (~(i69 & i70));
                    int i72 = i71 >>> 17;
                    int i73 = (i71 | i72) & (~(i71 & i72));
                    int i74 = i73 << 5;
                    ((int[]) objArr24[1])[0] = (i73 | i74) & (~(i73 & i74));
                    return objArr24;
                }
                java.lang.Object[] objArr25 = new java.lang.Object[1];
                c("輹빏\ueddc᭞䫿砂ꞓ픎", 12659 - (~TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0)), objArr25);
                String str3 = (String) objArr25[0];
                java.lang.Object[] objArr26 = new java.lang.Object[1];
                c("輹씩ᬮ儸Ꜻﴰ", 18946 - (~(-(ViewConfiguration.getMaximumFlingVelocity() >> 16))), objArr26);
                String str4 = (String) objArr26[0];
                int i75 = -(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                int i76 = ((i75 | 41719) << 1) - (i75 ^ 41719);
                java.lang.Object[] objArr27 = new java.lang.Object[1];
                c("輼ⷂ쫃柎ӡꇹ延", i76, objArr27);
                String str5 = (String) objArr27[0];
                java.lang.Object[] objArr28 = new java.lang.Object[1];
                c("輿\uf865憈\ue920剙\udb97䌸챒㗢", 30553 - View.MeasureSpec.getSize(0), objArr28);
                String str6 = (String) objArr28[0];
                int i77 = -(ViewConfiguration.getZoomControlsTimeout() > j3 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j3 ? 0 : -1));
                int i78 = (i77 ^ 128) + ((i77 & 128) << 1);
                java.lang.Object[] objArr29 = new java.lang.Object[1];
                b(null, i78, null, "\u008f\u008d\u008a\u008d\u0086\u008f", objArr29);
                String str7 = (String) objArr29[0];
                int i79 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int i80 = ((i79 | 62297) << 1) - (i79 ^ 62297);
                java.lang.Object[] objArr30 = new java.lang.Object[1];
                c("輱籯榃唧䈑侁㬫⡕ᗥĞฌﯹ\ue717", i80, objArr30);
                String str8 = (String) objArr30[0];
                java.lang.Object[] objArr31 = new java.lang.Object[1];
                b(null, 126 - (~(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), null, "\u0091\u0082\u0092\u0082\u008f", objArr31);
                String str9 = (String) objArr31[0];
                int i81 = -(-TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR));
                int i82 = (i81 ^ 30773) + ((i81 & 30773) << 1);
                java.lang.Object[] objArr32 = new java.lang.Object[1];
                c("輱\uf71d罗\ue7b5濪홢", i82, objArr32);
                String str10 = (String) objArr32[0];
                java.lang.Object[] objArr33 = new java.lang.Object[1];
                c("輱㖀", 47790 - (~(-(-View.resolveSizeAndState(0, 0, 0)))), objArr33);
                String str11 = (String) objArr33[0];
                int i83 = -(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                int i84 = (i83 & 127) + (i83 | 127);
                java.lang.Object[] objArr34 = new java.lang.Object[1];
                b(null, i84, null, "\u0092\u0081\u0085\u0092\u0090\u0083\u0092\u0090\u008f\u0090\u0081\u0088\u0091\u008c\u0082\u008d", objArr34);
                String str12 = (String) objArr34[0];
                int i85 = -TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0);
                int i86 = (i85 ^ 126) + ((i85 & 126) << 1);
                java.lang.Object[] objArr35 = new java.lang.Object[1];
                b(null, i86, null, "\u008a\u0081\u0083\u0086\u008c\u0085\u0092\u008c\u0082\u008d", objArr35);
                String str13 = (String) objArr35[0];
                int i87 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                int i88 = ((i87 | 22063) << 1) - (i87 ^ 22063);
                java.lang.Object[] objArr36 = new java.lang.Object[1];
                c("輨\ud905⍩趶힖⇒訬푺", i88, objArr36);
                String str14 = (String) objArr36[0];
                java.lang.Object[] objArr37 = new java.lang.Object[1];
                b(null, 126 - (~(-TextUtils.getTrimmedLength(BuildConfig.FLAVOR))), null, "\u0086\u0092\u008a\u0088\u008d\u008d\u0082\u008a\u008e\u0082\u0081\u0091", objArr37);
                String str15 = (String) objArr37[0];
                int i89 = -Drawable.resolveOpacity(0, 0);
                int i90 = (i89 & 127) + (i89 | 127);
                java.lang.Object[] objArr38 = new java.lang.Object[1];
                b(null, i90, null, "\u008d\u0092\u008a\u0092\u008a\u0088\u008d\u008d\u0082\u008a\u008e\u0082\u0081\u0091", objArr38);
                String str16 = (String) objArr38[0];
                int i91 = -(-Gravity.getAbsoluteGravity(0, 0));
                int i92 = ((i91 | 127) << 1) - (i91 ^ 127);
                java.lang.Object[] objArr39 = new java.lang.Object[1];
                b(null, i92, null, "\u0092\u0089\u008b\u0082\u0094\u0088\u0081", objArr39);
                String str17 = (String) objArr39[0];
                int i93 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int i94 = ((i93 | 38261) << 1) - (i93 ^ 38261);
                java.lang.Object[] objArr40 = new java.lang.Object[1];
                c("輫ᩅꗝ佰\udae1摰ྖ", i94, objArr40);
                String str18 = (String) objArr40[0];
                int i95 = -((byte) KeyEvent.getModifierMetaStateMask());
                int i96 = ((i95 | 126) << 1) - (i95 ^ 126);
                java.lang.Object[] objArr41 = new java.lang.Object[1];
                b(null, i96, null, "\u009b\u0088\u0092\u008f\u008d\u009a\u0090", objArr41);
                String str19 = (String) objArr41[0];
                int i97 = -Gravity.getAbsoluteGravity(0, 0);
                int i98 = (i97 ^ 127) + ((i97 & 127) << 1);
                java.lang.Object[] objArr42 = new java.lang.Object[1];
                b(null, i98, null, "\u0090\u0090", objArr42);
                String str20 = (String) objArr42[0];
                java.lang.Object[] objArr43 = new java.lang.Object[1];
                b(null, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 127, null, "\u0092\u0089\u0088\u008c\u0085\u0096\u008a\u0082\u008d\u009c\u0084\u0092\u008f\u0087\u009c\u0092\u0081\u0085\u0092\u0090", objArr43);
                String str21 = (String) objArr43[0];
                int i99 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                int i100 = ((i99 | 55381) << 1) - (i99 ^ 55381);
                java.lang.Object[] objArr44 = new java.lang.Object[1];
                c("輫坹㾀߆\uee6f뚔", i100, objArr44);
                String str22 = (String) objArr44[0];
                int defaultSize = View.getDefaultSize(0, 0);
                int i101 = defaultSize * 55;
                int i102 = (i101 ^ (-4023949)) + ((i101 & (-4023949)) << 1);
                int i103 = ~defaultSize;
                int i104 = ~((i103 ^ 37607) | (i103 & 37607));
                int i105 = ~i;
                int i106 = ((~(37607 | i105)) | i104) * (-108);
                int i107 = (i102 & i106) + (i106 | i102);
                int i108 = ~((i103 & i) | (i103 ^ i));
                int i109 = ((-37608) & defaultSize) | ((-37608) ^ defaultSize);
                int i110 = ~i109;
                int i111 = (i108 ^ i110) | (i108 & i110);
                int i112 = ~((defaultSize & i105) | (i105 ^ defaultSize));
                int i113 = -(-(((i112 & i111) | (i111 ^ i112)) * 54));
                int i114 = (i107 ^ i113) + ((i113 & i107) << 1);
                int i115 = ~i109;
                int i116 = (i114 - (~(((i115 & i) | (i ^ i115)) * 54))) - 1;
                java.lang.Object[] objArr45 = new java.lang.Object[1];
                c("輫᷊", i116, objArr45);
                String str23 = (String) objArr45[0];
                int i117 = -(-(Process.myTid() >> 22));
                int i118 = ((i117 | 33911) << 1) - (i117 ^ 33911);
                java.lang.Object[] objArr46 = new java.lang.Object[1];
                c("輫\u0b4e蟘ɔ黰ᥢ门ၼ겒❚ꎍ㸱몭㔧놯䷒", i118, objArr46);
                String str24 = (String) objArr46[0];
                java.lang.Object[] objArr47 = new java.lang.Object[1];
                c("輬嶩⨿\uf8b2씱鎧怫亹ᬨ", 53891 - View.combineMeasuredStates(0, 0), objArr47);
                String str25 = (String) objArr47[0];
                int i119 = -Process.getGidForName(BuildConfig.FLAVOR);
                int i120 = (i119 & 126) + (i119 | 126);
                java.lang.Object[] objArr48 = new java.lang.Object[1];
                b(null, i120, null, "\u009d\u0084\u0092\u0085\u0091\u0088\u008a\u0085\u0081\u0092", objArr48);
                String str26 = (String) objArr48[0];
                java.lang.Object[] objArr49 = new java.lang.Object[1];
                b(null, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126, null, "\u009d\u0088\u0092\u008b\u0082\u0081\u0088\u008a\u0085\u0081\u0092", objArr49);
                String str27 = (String) objArr49[0];
                java.lang.Object[] objArr50 = new java.lang.Object[1];
                b(null, 126 - (~(-(-(ViewConfiguration.getEdgeSlop() >> 16)))), null, "\u0082\u008e\u0089\u008f\u009c\u0086\u0089\u008f\u0087\u0089\u008b", objArr50);
                String str28 = (String) objArr50[0];
                int i121 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int i122 = ((i121 | 9883) << 1) - (i121 ^ 9883);
                java.lang.Object[] objArr51 = new java.lang.Object[1];
                c("輭ꦭ숙ﳠᕚ主梥脗믥푌ഉ➘䁲竡鍍", i122, objArr51);
                String str29 = (String) objArr51[0];
                int windowTouchSlop = ViewConfiguration.getWindowTouchSlop() >> 8;
                int i123 = windowTouchSlop * (-464);
                int i124 = (i123 & (-117983)) + (i123 | (-117983));
                int i125 = ~windowTouchSlop;
                int i126 = (i ^ 127) | (i & 127);
                int i127 = ~i126;
                int i128 = -(-(((i125 ^ i127) | (i125 & i127)) * (-465)));
                int i129 = (i124 & i128) + (i128 | i124);
                int i130 = ~windowTouchSlop;
                int i131 = ~((i130 ^ i) | (i130 & i));
                int i132 = ((i131 & 127) | (i131 ^ 127)) * 930;
                int i133 = ((i129 | i132) << 1) - (i132 ^ i129);
                int i134 = -(-((i130 | i126) * 465));
                int i135 = (i133 ^ i134) + ((i134 & i133) << 1);
                java.lang.Object[] objArr52 = new java.lang.Object[1];
                b(null, i135, null, "\u0090\u008d\u0082\u0098\u0094\u0093\u0090\u009c\u0086\u0089\u008f\u0087\u0089\u008b", objArr52);
                String[] strArr5 = {str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, (String) objArr52[0]};
                int i136 = -TextUtils.getTrimmedLength(BuildConfig.FLAVOR);
                int i137 = ((i136 | 127) << 1) - (i136 ^ 127);
                java.lang.Object[] objArr53 = new java.lang.Object[1];
                b(null, i137, null, "\u0088\u0081\u0085\u0087\u0086\u0081\u0085\u0084\u0083\u0082\u0081", objArr53);
                java.lang.Object[] objArr54 = {(String) objArr53[0]};
                java.lang.Object PngjBadSignature10 = com.d.e.a.PngjBadCrcException.PngjBadSignature(547370249);
                if (PngjBadSignature10 == null) {
                    char alpha2 = (char) (8752 - Color.alpha(0));
                    int argb2 = Color.argb(0, 0, 0, 0) + 24;
                    int keyCodeFromString = 336 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR);
                    byte b18 = $$a[4];
                    byte b19 = b18;
                    strArr = strArr5;
                    java.lang.Object[] objArr55 = new java.lang.Object[1];
                    a(b19, (byte) (b19 + 1), b18, objArr55);
                    PngjBadSignature10 = com.d.e.a.PngjBadCrcException.PngjBadSignature(alpha2, argb2, keyCodeFromString, -598779726, false, (String) objArr55[0], new Class[]{String.class});
                } else {
                    strArr = strArr5;
                }
                String str30 = (String) ((Method) PngjBadSignature10).invoke(null, objArr54);
                if (str30 != null) {
                    int i138 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int i139 = ((i138 | 127) << 1) - (i138 ^ 127);
                    java.lang.Object[] objArr56 = new java.lang.Object[1];
                    b(null, i139, null, "\u008b\u0084\u008a\u0089\u0085\u0081", objArr56);
                    String str31 = (String) objArr56[0];
                    java.lang.Object[] objArr57 = new java.lang.Object[1];
                    b(null, 128 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), null, "\u0084\u0090\u008f\u008e\u0086\u008d\u0082\u008c", objArr57);
                    String[] strArr6 = {str31, (String) objArr57[0]};
                    int i140 = 0;
                    while (true) {
                        if (i140 >= 2) {
                            z5 = false;
                            break;
                        }
                        if (str30.contains(strArr6[i140])) {
                            com.identy.a.PngjException.values();
                            z5 = true;
                            break;
                        }
                        i140 = ((i140 | 1) << 1) - (i140 ^ 1);
                    }
                    if (z5) {
                        PngjUnsupportedException = (PngjOutputException + 43) % 128;
                        int i141 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int i142 = (i141 & 27883) + (i141 | 27883);
                        java.lang.Object[] objArr58 = new java.lang.Object[1];
                        c("輪\ue3dc嚠짩㲆꾠ʾ畀\ue863孯치ℬ鐽ࣙ篷\ueefb䆉뒠➪驜൶恺팘", i142, objArr58);
                        java.lang.Object[] objArr59 = {(String) objArr58[0]};
                        java.lang.Object PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature(547370249);
                        if (PngjBadSignature11 == null) {
                            char doubleTapTimeout = (char) (8752 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                            int fadingEdgeLength2 = 24 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                            int indexOf = TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 337;
                            byte b20 = $$a[4];
                            byte b21 = b20;
                            java.lang.Object[] objArr60 = new java.lang.Object[1];
                            a(b21, (byte) (b21 + 1), b20, objArr60);
                            PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature(doubleTapTimeout, fadingEdgeLength2, indexOf, -598779726, false, (String) objArr60[0], new Class[]{String.class});
                        }
                        java.lang.Object invoke3 = ((Method) PngjBadSignature11).invoke(null, objArr59);
                        int i143 = -KeyEvent.normalizeMetaState(0);
                        int i144 = ((i143 | 127) << 1) - (i143 ^ 127);
                        java.lang.Object[] objArr61 = new java.lang.Object[1];
                        b(null, i144, null, "\u0081\u0088\u0081\u008b\u0092\u008a\u0085\u008e\u008b\u0089\u0085\u0094\u0083\u0094\u0088\u0092\u0090\u0093\u0090\u0083\u0092\u008a\u008b\u0086\u0082\u0081\u0091\u0083\u0082\u0081", objArr61);
                        java.lang.Object[] objArr62 = {(String) objArr61[0]};
                        java.lang.Object PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature(547370249);
                        if (PngjBadSignature12 == null) {
                            char makeMeasureSpec = (char) (8752 - View.MeasureSpec.makeMeasureSpec(0, 0));
                            int windowTouchSlop2 = 24 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 336;
                            byte b22 = $$a[4];
                            byte b23 = b22;
                            obj2 = invoke3;
                            java.lang.Object[] objArr63 = new java.lang.Object[1];
                            a(b23, (byte) (b23 + 1), b22, objArr63);
                            PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature(makeMeasureSpec, windowTouchSlop2, edgeSlop, -598779726, false, (String) objArr63[0], new Class[]{String.class});
                        } else {
                            obj2 = invoke3;
                        }
                        java.lang.Object invoke4 = ((Method) PngjBadSignature12).invoke(null, objArr62);
                        if (obj2 != null) {
                            java.lang.Object[] objArr64 = {obj2, Integer.valueOf(i3)};
                            java.lang.Object PngjBadSignature13 = com.d.e.a.PngjBadCrcException.PngjBadSignature(989703296);
                            if (PngjBadSignature13 == null) {
                                char resolveOpacity3 = (char) (Drawable.resolveOpacity(0, 0) + 11039);
                                int pressedStateDuration = 31 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                int touchSlop3 = (ViewConfiguration.getTouchSlop() >> 8) + 1282;
                                byte b24 = (byte) ($$b & 5);
                                byte b25 = $$a[4];
                                obj3 = invoke4;
                                java.lang.Object[] objArr65 = new java.lang.Object[1];
                                a(b24, b25, b25, objArr65);
                                PngjBadSignature13 = com.d.e.a.PngjBadCrcException.PngjBadSignature(resolveOpacity3, pressedStateDuration, touchSlop3, -971849413, false, (String) objArr65[0], new Class[]{String.class, cls5});
                            } else {
                                obj3 = invoke4;
                            }
                            long longValue6 = ((Long) ((Method) PngjBadSignature13).invoke(null, objArr64)).longValue();
                            long j51 = 460045499;
                            long j52 = 503;
                            cls = cls5;
                            long j53 = -502;
                            long j54 = j51 | longValue6;
                            long j55 = (j53 * j54) + (j52 * longValue6) + (j52 * j51);
                            long j56 = j51 ^ j13;
                            long j57 = ((longValue6 ^ j13) | j56) ^ j13;
                            long j58 = i;
                            long j59 = j56 | (j58 ^ j13);
                            long j60 = (j54 | j58) ^ j13;
                            long j61 = (502 * (((j59 | longValue6) ^ j13) | j60)) + ((j57 | (j59 ^ j13) | j60) * j53) + j55 + 195662201;
                            int a = defpackage.a.a();
                            int i145 = ~a;
                            int i146 = ((int) (j61 >> 32)) & (((1095721872 | (~((-1762019013) | i145))) * 712) + (((~((-1090929281) | a)) | (~(i145 | (-671089733)))) * (-712)) + (((671089732 | 0) * (-712)) - 900579766));
                            int freeMemory3 = (int) Runtime.getRuntime().freeMemory();
                            int i147 = ((1396432277 | freeMemory3) * (-50)) - 386075665;
                            int i148 = ~((-1394199681) | freeMemory3);
                            int i149 = ~freeMemory3;
                            int i150 = ((int) j61) & ((((~(i149 | 1396432277)) | (~((-1461308609) | i149)) | 67108928) * 50) + (((~(i149 | (-67108929))) | i148) * 50) + i147);
                        } else {
                            obj3 = invoke4;
                            cls = cls5;
                        }
                        if (obj3 != null) {
                            int i151 = PngjUnsupportedException + 7;
                            PngjOutputException = i151 % 128;
                            if ((i151 % 2 == 0 ? '(' : 'Y') != 'Y') {
                                java.lang.Object[] objArr66 = {obj3, 86};
                                java.lang.Object PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(989703296);
                                if (PngjBadSignature14 == null) {
                                    char defaultSize2 = (char) (11039 - View.getDefaultSize(0, 0));
                                    int lastIndexOf2 = TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 32;
                                    int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1282;
                                    byte b26 = (byte) ($$b & 5);
                                    byte b27 = $$a[4];
                                    java.lang.Object[] objArr67 = new java.lang.Object[1];
                                    a(b26, b27, b27, objArr67);
                                    cls4 = cls;
                                    PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(defaultSize2, lastIndexOf2, doubleTapTimeout2, -971849413, false, (String) objArr67[0], new Class[]{String.class, cls4});
                                } else {
                                    cls4 = cls;
                                }
                                long longValue7 = ((Long) ((Method) PngjBadSignature14).invoke(null, objArr66)).longValue();
                                long j62 = -763514;
                                cls = cls4;
                                long j63 = ((-68) * longValue7) + (70 * j62);
                                long j64 = 69;
                                long j65 = j62 ^ j13;
                                long j66 = longValue7 ^ j13;
                                long j67 = (int) Runtime.getRuntime().totalMemory();
                                long j68 = (j64 * ((j66 | j62) ^ j13)) + ((-69) * (((j65 | longValue7) ^ j13) | ((j65 | j67) ^ j13) | ((longValue7 | j67) ^ j13))) + (((((j65 | j66) | j67) ^ j13) | (((j62 | longValue7) | j67) ^ j13)) * j64) + j63 + 656471214;
                                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                                int i152 = ((int) (j68 >>> 28)) & ((((~(startElapsedRealtime | (-4196609))) | 1376256018) * 235) + (((~((-32583501) | startElapsedRealtime)) | 1404642910) * (-470)) + ((((~((~startElapsedRealtime) | (-32583501))) | 1404642910) * (-235)) - 738381566));
                                int i153 = (int) j68;
                                int startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
                                int i154 = ~startElapsedRealtime2;
                                int i155 = (~(1305455827 | i154)) | 34603012;
                                int i156 = i153 & (((~(i154 | 131770582)) * 713) + ((~(startElapsedRealtime2 | (-1208288258))) * 1426) + (((i155 | 0) * (-713)) - 756183376));
                            } else {
                                java.lang.Object[] objArr68 = {obj3, Integer.valueOf(i3)};
                                java.lang.Object PngjBadSignature15 = com.d.e.a.PngjBadCrcException.PngjBadSignature(989703296);
                                if (PngjBadSignature15 == null) {
                                    char c9 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 11039);
                                    int absoluteGravity = 31 - Gravity.getAbsoluteGravity(0, 0);
                                    int i157 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1281;
                                    byte b28 = (byte) ($$b & 5);
                                    byte b29 = $$a[4];
                                    java.lang.Object[] objArr69 = new java.lang.Object[1];
                                    a(b28, b29, b29, objArr69);
                                    cls3 = cls;
                                    PngjBadSignature15 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c9, absoluteGravity, i157, -971849413, false, (String) objArr69[0], new Class[]{String.class, cls3});
                                } else {
                                    cls3 = cls;
                                }
                                long longValue8 = ((Long) ((Method) PngjBadSignature15).invoke(null, objArr68)).longValue();
                                long j69 = -251099258;
                                long j70 = (319 * longValue8) + ((-317) * j69);
                                long j71 = -318;
                                long j72 = j69 ^ j13;
                                long j73 = longValue8 ^ j13;
                                long a2 = defpackage.a.a();
                                long j74 = (318 * (j73 | ((j72 | a2) ^ j13))) + ((((j73 | j69) ^ j13) | ((j69 | a2) ^ j13)) * j71) + (((((j72 | j73) | a2) ^ j13) | ((((a2 ^ j13) | j69) | longValue8) ^ j13)) * j71) + j70 + 906806958;
                                int i158 = (((~(525200739 | i)) | 912025671) * 56) + 1962116922;
                                int i159 = ~i;
                                int i160 = ((int) (j74 >> 32)) & (((525200739 | (~(912025671 | i159))) * 56) + i158);
                                int i161 = (~(163431129 | i159)) | 1111494656;
                                int i162 = ~((-1130506) | i);
                            }
                        }
                        long j75 = j16;
                        z = false;
                        if (!z) {
                            int i163 = PngjUnsupportedException;
                            PngjOutputException = (((i163 | 81) << 1) - (i163 ^ 81)) % 128;
                            java.lang.Object[] objArr70 = {new int[]{0}, new int[1], null, new int[]{i}};
                            int i164 = (i & (-262)) | ((~i) & 261);
                            int a3 = defpackage.a.a();
                            int i165 = (((~((-614116398) | a3)) | 691240 | (~((-420449577) | a3))) * (-880)) + 919555461;
                            int i166 = (~((-614116398) | (~a3))) | 420449576;
                            int i167 = ~(a3 | 614116397);
                            int i168 = (i167 * 880) + ((i166 | i167) * (-880)) + i165;
                            int i169 = ((i168 | 16) << 1) - (i168 ^ 16);
                            int i170 = (i2 & i169) + (i2 | i169);
                            int i171 = i170 << 13;
                            int i172 = (i170 | i171) & (~(i170 & i171));
                            int i173 = i172 >>> 17;
                            int i174 = ((~i172) & i173) | ((~i173) & i172);
                            int i175 = i174 << 5;
                            ((int[]) objArr70[1])[0] = ((~i174) & i175) | ((~i175) & i174);
                            return objArr70;
                        }
                        int scrollDefaultDelay = ViewConfiguration.getScrollDefaultDelay() >> 16;
                        int i176 = (scrollDefaultDelay ^ 55733) + ((scrollDefaultDelay & 55733) << 1);
                        java.lang.Object[] objArr71 = new java.lang.Object[1];
                        c("轷嚞㱋ȴ\ue9a3쾷锕粄䊃⡠ฦ헶뭊脜棆们ᑭ勉솄Ꝙ贎哢㪳", i176, objArr71);
                        java.lang.Object[] objArr72 = {(String) objArr71[0]};
                        java.lang.Object PngjBadSignature16 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-936033973);
                        if (PngjBadSignature16 == null) {
                            char alpha3 = (char) (29467 - Color.alpha(0));
                            int offsetBefore = 39 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0);
                            int indexOf2 = 432 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0);
                            byte b30 = $$a[4];
                            byte b31 = b30;
                            java.lang.Object[] objArr73 = new java.lang.Object[1];
                            a(b31, (byte) (b31 + 1), b30, objArr73);
                            PngjBadSignature16 = com.d.e.a.PngjBadCrcException.PngjBadSignature(alpha3, offsetBefore, indexOf2, 886713584, false, (String) objArr73[0], new Class[]{String.class});
                        }
                        long longValue9 = ((Long) ((Method) PngjBadSignature16).invoke(null, objArr72)).longValue();
                        long j76 = 693553833;
                        long j77 = ((-301) * longValue9) + (303 * j76);
                        long j78 = j76 ^ j13;
                        long j79 = i;
                        long j80 = j79 ^ j13;
                        long j81 = ((302 * ((((longValue9 ^ j13) | j76) ^ j13) | ((longValue9 | j79) ^ j13))) + (((-604) * (((j78 | longValue9) | j79) ^ j13)) + (((-302) * ((((j78 | j80) | longValue9) ^ j13) | (((j76 | longValue9) | j79) ^ j13))) + j77))) - 1842266481;
                        int i177 = ((int) (j81 >> 32)) & ((((~((-759285460) | i)) | (-2102650836)) * 196) + (((1343365376 | 0) * (-196)) - 1748428806));
                        int i178 = ~i;
                        int i179 = ((int) j81) & (((~((-1682652261) | i178)) * 184) + ((33571217 | i) * (-184)) + ((((~(1175088625 | i178)) | 541134852) * 184) - 339654739));
                        long j82 = (i177 & i179) | (i177 ^ i179);
                        int maximumFlingVelocity2 = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                        int i180 = (maximumFlingVelocity2 * (-209)) - 26543;
                        int i181 = ~maximumFlingVelocity2;
                        int i182 = -(-((~((i181 ^ (-128)) | (i181 & (-128)))) * 210));
                        int i183 = (i180 ^ i182) + ((i180 & i182) << 1);
                        int i184 = ((~(((-128) ^ i178) | ((-128) & i178))) | (~(i181 | i))) * 210;
                        int i185 = ((i183 | i184) << 1) - (i183 ^ i184);
                        int i186 = i181 | i178;
                        int i187 = ((-128) & maximumFlingVelocity2) | ((-128) ^ maximumFlingVelocity2);
                        int i188 = ((~((i187 & i) | (i187 ^ i))) | (~((i186 & 127) | (i186 ^ 127)))) * 210;
                        int i189 = ((i185 | i188) << 1) - (i188 ^ i185);
                        java.lang.Object[] objArr74 = new java.lang.Object[1];
                        b(null, i189, null, "\u0090\u008b\u0092\u0085\u0092\u0090\u0095\u008e\u008d\u0088\u0090\u0095\u008a\u0082\u0081\u0091\u0095", objArr74);
                        java.lang.Object[] objArr75 = {(String) objArr74[0]};
                        java.lang.Object PngjBadSignature17 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-936033973);
                        if (PngjBadSignature17 == null) {
                            char offsetAfter = (char) (TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 29467);
                            int i190 = (ExpandableListView.getPackedPositionForGroup(0) > j3 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j3 ? 0 : -1)) + 39;
                            int trimmedLength3 = 432 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR);
                            byte b32 = $$a[4];
                            j4 = j79;
                            byte b33 = b32;
                            j5 = j82;
                            java.lang.Object[] objArr76 = new java.lang.Object[1];
                            a(b33, (byte) (b33 + 1), b32, objArr76);
                            PngjBadSignature17 = com.d.e.a.PngjBadCrcException.PngjBadSignature(offsetAfter, i190, trimmedLength3, 886713584, false, (String) objArr76[0], new Class[]{String.class});
                        } else {
                            j4 = j79;
                            j5 = j82;
                        }
                        long longValue10 = ((Long) ((Method) PngjBadSignature17).invoke(null, objArr75)).longValue();
                        long j83 = 582561079;
                        long j84 = 51;
                        long j85 = -49;
                        long j86 = j85 * longValue10;
                        long j87 = -50;
                        long j88 = (int) Runtime.getRuntime().totalMemory();
                        long j89 = ((j83 | j88) * j87) + j86 + (j84 * j83);
                        long j90 = 50;
                        long j91 = longValue10 ^ j13;
                        long j92 = j88 ^ j13;
                        long j93 = j91 | j92;
                        long j94 = (((((j93 ^ j13) | ((j91 | j83) ^ j13)) | ((j92 | j83) ^ j13)) * j90) + (((((((j83 ^ j13) | j91) | j88) ^ j13) | ((j93 | j83) ^ j13)) * j90) + j89)) - 1731273727;
                        int i191 = ((int) (j94 >> 32)) & ((((~((-19009877) | i)) | 1351091200) * 130) + (((~((-19009877) | i178)) * 130) - 582254334));
                        int i192 = ((int) j94) & ((((~((-75530417) | i)) | 75497472 | (~((-1361663050) | i178))) * 369) + (((~(75530416 | i178)) | (-1361695994)) * (-369)) + (((-32945) | i178) * (-369)) + 802172634);
                        long j95 = (i191 & i192) | (i191 ^ i192);
                        if (j5 > j3 && j95 > j3) {
                            if ((j95 - 3 < j5 ? 'c' : 'A') == 'c') {
                                i6 = 1;
                                z2 = true;
                                if (!z2) {
                                    java.lang.Object[] objArr77 = new java.lang.Object[4];
                                    int[] iArr = new int[i6];
                                    objArr77[0] = iArr;
                                    int[] iArr2 = new int[i6];
                                    objArr77[i6] = iArr2;
                                    int[] iArr3 = new int[i6];
                                    objArr77[3] = iArr3;
                                    int i193 = (~(i & 247)) & (i | 247);
                                    iArr3[0] = i;
                                    iArr[0] = i193;
                                    objArr77[2] = null;
                                    int i194 = -(-defpackage.a.c((~(931434864 | i178)) | (-103131110), 305, (((~(i | 931434864)) | (-933607414)) * 305) - 1250391556, i5));
                                    int i195 = (i2 ^ i194) + ((i194 & i2) << 1);
                                    int i196 = i195 << 13;
                                    int i197 = (i196 | i195) & (~(i195 & i196));
                                    int i198 = i197 >>> 17;
                                    int i199 = (i197 | i198) & (~(i197 & i198));
                                    int i200 = i199 << 5;
                                    iArr2[0] = (i199 | i200) & (~(i199 & i200));
                                    return objArr77;
                                }
                                int i201 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                int i202 = (i201 & 55733) + (i201 | 55733);
                                java.lang.Object[] objArr78 = new java.lang.Object[1];
                                c("轷嚞㱋ȴ\ue9a3쾷锕粄䊃⡠ฦ헶뭊脜棆们ᑭ勉솄Ꝙ贎哢㪳", i202, objArr78);
                                java.lang.Object[] objArr79 = {(String) objArr78[0]};
                                java.lang.Object PngjBadSignature18 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-936033973);
                                if (PngjBadSignature18 == null) {
                                    char normalizeMetaState = (char) (29467 - KeyEvent.normalizeMetaState(0));
                                    int capsMode = 39 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0);
                                    int i203 = 433 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                    byte b34 = $$a[4];
                                    byte b35 = b34;
                                    java.lang.Object[] objArr80 = new java.lang.Object[1];
                                    a(b35, (byte) (b35 + 1), b34, objArr80);
                                    PngjBadSignature18 = com.d.e.a.PngjBadCrcException.PngjBadSignature(normalizeMetaState, capsMode, i203, 886713584, false, (String) objArr80[0], new Class[]{String.class});
                                }
                                long longValue11 = ((Long) ((Method) PngjBadSignature18).invoke(null, objArr79)).longValue();
                                long j96 = 511660707;
                                long j97 = ((j96 | j4) * j87) + (j85 * longValue11) + (j84 * j96);
                                long j98 = longValue11 ^ j13;
                                long j99 = j98 | j80;
                                long j100 = ((((((j98 | j96) ^ j13) | (j99 ^ j13)) | ((j80 | j96) ^ j13)) * j90) + (((((((j96 ^ j13) | j98) | j4) ^ j13) | ((j99 | j96) ^ j13)) * j90) + j97)) - 1660373355;
                                int i204 = ((int) (j100 >> 32)) & ((((~((-1459856588) | i)) | 22630176) * 318) + (((~(1459856587 | i)) | (-1465642988)) * (-318)) + ((((~((-1443012812) | i)) | (~((-5786401) | i178))) * (-318)) - 1842129278));
                                int b36 = defpackage.a.b(153981363);
                                long j101 = i204 | (((int) j100) & ((((~(b36 | (-1078296578))) | 285213700) * 235) + (((~(322071766 | b36)) | (-1115154644)) * (-470)) + (((~((~b36) | 322071766)) | (-1115154644)) * (-235)) + 48647104));
                                java.lang.Object[] objArr81 = new java.lang.Object[1];
                                c("轷ᇉ닗叱", ((byte) KeyEvent.getModifierMetaStateMask()) + 40694, objArr81);
                                java.lang.Object[] objArr82 = {(String) objArr81[0]};
                                java.lang.Object PngjBadSignature19 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-936033973);
                                if (PngjBadSignature19 == null) {
                                    char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 29467);
                                    int indexOf3 = TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 40;
                                    int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 432;
                                    byte b37 = $$a[4];
                                    byte b38 = b37;
                                    j6 = j101;
                                    java.lang.Object[] objArr83 = new java.lang.Object[1];
                                    a(b38, (byte) (b38 + 1), b37, objArr83);
                                    PngjBadSignature19 = com.d.e.a.PngjBadCrcException.PngjBadSignature(maxKeyCode, indexOf3, tapTimeout2, 886713584, false, (String) objArr83[0], new Class[]{String.class});
                                } else {
                                    j6 = j101;
                                }
                                long longValue12 = ((Long) ((Method) PngjBadSignature19).invoke(null, objArr82)).longValue();
                                long j102 = -805404200;
                                long j103 = 628;
                                long j104 = j103 * longValue12;
                                long j105 = -627;
                                long j106 = (int) Runtime.getRuntime().totalMemory();
                                long j107 = ((j102 | (((longValue12 ^ j13) | j106) ^ j13)) * j105) + ((longValue12 | j106 | (j102 ^ j13)) * j105) + j104 + (j103 * j102);
                                long j108 = 627;
                                long j109 = ((((((j106 ^ j13) | longValue12) ^ j13) | ((j102 | j106) ^ j13)) * j108) + j107) - 343308448;
                                int a4 = defpackage.a.a();
                                int i205 = (((~((~a4) | (-956985063))) | 553650210) * (-245)) - 2019647948;
                                int i206 = ~(a4 | (-956985063));
                                int i207 = ((int) (j109 >> 32)) & (((i206 | 480241348) * 245) + (i206 * (-245)) + i205);
                                int i208 = ~(1629925024 | i178);
                                long j110 = i207 | (((int) j109) & (((i208 | 1093053088) * 970) + ((536871936 | i208) * (-970)) + 232935445));
                                if (j6 > j3) {
                                    int i209 = PngjOutputException;
                                    int i210 = (((i209 | 29) << 1) - (i209 ^ 29)) % 128;
                                    PngjUnsupportedException = i210;
                                    if (j110 > j3) {
                                        if ((j110 + 100 < j6 ? c : '6') != '6') {
                                            PngjOutputException = ((i210 & 59) + (i210 | 59)) % 128;
                                            z3 = true;
                                            if ((!z3 ? '3' : '8') == '8') {
                                                java.lang.Object[] objArr84 = {new int[]{(i & (-249)) | (i178 & 248)}, new int[1], null, new int[]{i}};
                                                int myUid2 = Process.myUid();
                                                int i211 = ~myUid2;
                                                int i212 = (((~(myUid2 | (-785530086))) | 376848 | (~(785530085 | i211))) * 988) + (((~(249035888 | i211)) | 536871045) * (-1976)) + ((myUid2 | 376848) * 988) + 1575533729;
                                                int i213 = -(-(i212 * 407));
                                                int i214 = (((-6480) | i213) << 1) - (i213 ^ (-6480));
                                                int i215 = ~i212;
                                                int i216 = i178 | 16;
                                                int i217 = ((~((i215 & i) | (i215 ^ i))) | (~((i216 & i212) | (i216 ^ i212)))) * (-406);
                                                int i218 = ((i214 | i217) << 1) - (i217 ^ i214);
                                                int i219 = ~i212;
                                                int i220 = (i219 & i178) | (i219 ^ i178);
                                                int i221 = ((~((i220 & 16) | (i220 ^ 16))) * (-406)) + i218;
                                                int i222 = ~((i & (-17)) | ((-17) ^ i));
                                                int i223 = ~((i212 & i178) | (i178 ^ i212));
                                                int i224 = (((i222 & i223) | (i222 ^ i223)) * 406) + i221;
                                                int i225 = ((i2 | i224) << 1) - (i224 ^ i2);
                                                int i226 = i225 << 13;
                                                int i227 = (i226 & (~i225)) | ((~i226) & i225);
                                                int i228 = i227 >>> 17;
                                                int i229 = ((~i227) & i228) | ((~i228) & i227);
                                                int i230 = i229 << 5;
                                                ((int[]) objArr84[1])[0] = ((~i229) & i230) | ((~i230) & i229);
                                                return objArr84;
                                            }
                                            int i231 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
                                            int i232 = (i231 & 127) + (i231 | 127);
                                            java.lang.Object[] objArr85 = new java.lang.Object[1];
                                            b(null, i232, null, "\u0094\u0088\u0092\u0090\u0093\u0090\u0095", objArr85);
                                            String str32 = (String) objArr85[0];
                                            java.lang.Object[] objArr86 = new java.lang.Object[1];
                                            b(null, 126 - (~(-View.resolveSizeAndState(0, 0, 0))), null, "\u0089\u008f\u0098\u0095\u0094\u0088\u0092\u0090\u0093\u0090\u0095", objArr86);
                                            String str33 = (String) objArr86[0];
                                            int packedPositionType2 = ExpandableListView.getPackedPositionType(j3);
                                            int i233 = (packedPositionType2 & 127) + (packedPositionType2 | 127);
                                            java.lang.Object[] objArr87 = new java.lang.Object[1];
                                            b(null, i233, null, "\u0089\u008f\u0098\u0090\u0095\u0094\u0088\u0092\u0090\u0093\u0090\u0095", objArr87);
                                            String str34 = (String) objArr87[0];
                                            int i234 = -Color.alpha(0);
                                            int i235 = ((i234 | 127) << 1) - (i234 ^ 127);
                                            java.lang.Object[] objArr88 = new java.lang.Object[1];
                                            b(null, i235, null, "\u0089\u008f\u0098\u009e\u0095\u0094\u0088\u0092\u0090\u0093\u0090\u0095", objArr88);
                                            String str35 = (String) objArr88[0];
                                            java.lang.Object[] objArr89 = new java.lang.Object[1];
                                            c("轷ḉ굳㱃쮠嫴\ue9c0睦\u0602镮⒰", 37159 - Color.argb(0, 0, 0, 0), objArr89);
                                            String str36 = (String) objArr89[0];
                                            int i236 = -TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0);
                                            int i237 = (i236 ^ 42330) + ((i236 & 42330) << 1);
                                            java.lang.Object[] objArr90 = new java.lang.Object[1];
                                            c("轷⩰얌缠ᩚ", i237, objArr90);
                                            String str37 = (String) objArr90[0];
                                            java.lang.Object[] objArr91 = new java.lang.Object[1];
                                            c("轷\ud990≶謼", Color.red(0) + 22189, objArr91);
                                            String[] strArr7 = {str32, str33, str34, str35, str36, str37, (String) objArr91[0]};
                                            int i238 = 0;
                                            while (true) {
                                                if (i238 >= 7) {
                                                    i7 = i178;
                                                    i8 = 0;
                                                    break;
                                                }
                                                int i239 = PngjUnsupportedException;
                                                PngjOutputException = ((i239 ^ 15) + ((i239 & 15) << 1)) % 128;
                                                java.lang.Object[] objArr92 = {strArr7[i238]};
                                                java.lang.Object PngjBadSignature20 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1492900309);
                                                if (PngjBadSignature20 == null) {
                                                    char deadChar2 = (char) KeyEvent.getDeadChar(0, 0);
                                                    int makeMeasureSpec2 = 35 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                                    int i240 = 397 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                    byte b39 = $$a[4];
                                                    strArr3 = strArr7;
                                                    byte b40 = b39;
                                                    i17 = i238;
                                                    java.lang.Object[] objArr93 = new java.lang.Object[1];
                                                    a(b40, (byte) (b40 + 1), b39, objArr93);
                                                    PngjBadSignature20 = com.d.e.a.PngjBadCrcException.PngjBadSignature(deadChar2, makeMeasureSpec2, i240, 1542146960, false, (String) objArr93[0], new Class[]{String.class});
                                                } else {
                                                    strArr3 = strArr7;
                                                    i17 = i238;
                                                }
                                                long longValue13 = ((Long) ((Method) PngjBadSignature20).invoke(null, objArr92)).longValue();
                                                long j111 = 450535309;
                                                i7 = i178;
                                                long j112 = ((-903) * longValue13) + (905 * j111);
                                                long j113 = j111 ^ j13;
                                                long elapsedCpuTime = (int) Process.getElapsedCpuTime();
                                                long j114 = elapsedCpuTime ^ j13;
                                                long j115 = ((-1808) * (((j113 | elapsedCpuTime) ^ j13) | ((j114 | longValue13) ^ j13))) + j112;
                                                long j116 = 904;
                                                long j117 = longValue13 ^ j13;
                                                long j118 = j114 | j111;
                                                long j119 = ((j116 * ((((j113 | longValue13) ^ j13) | ((j117 | elapsedCpuTime) ^ j13)) | (j118 ^ j13))) + ((((((j113 | j117) | elapsedCpuTime) ^ j13) | ((j118 | longValue13) ^ j13)) * j116) + j115)) - 815114088;
                                                int startElapsedRealtime3 = (int) Process.getStartElapsedRealtime();
                                                if (((((int) (j119 >> 32)) & (((startElapsedRealtime3 | (-604241985)) * 668) + ((416546613 | (~((-1020679798) | startElapsedRealtime3))) * 1336) + (((~(416546613 | startElapsedRealtime3)) | (-1020679798)) * (-668)) + 67428294)) | (((int) j119) & ((((~(((int) Process.getStartUptimeMillis()) | 1372008377)) | 1350970008) * 196) + (((21038369 | 0) * (-196)) - 110822599)))) != 0) {
                                                    int i241 = PngjOutputException;
                                                    PngjUnsupportedException = ((i241 ^ 101) + ((i241 & 101) << 1)) % 128;
                                                    i8 = (i17 ^ 90) + ((i17 & 90) << 1);
                                                    break;
                                                }
                                                int i242 = i17 + 126;
                                                i238 = (i242 | (-125)) + (i242 & (-125));
                                                strArr7 = strArr3;
                                                i178 = i7;
                                            }
                                            if (i8 != 0) {
                                                java.lang.Object[] objArr94 = {new int[]{(i8 & i7) | ((~i8) & i)}, new int[1], null, new int[]{i}};
                                                int c10 = defpackage.a.c((~((~Process.myUid()) | (-5243394))) | 805450920, 521, ((~((-5243394) | 0)) * 521) - 430376092, 16);
                                                int i243 = ((i2 | c10) << 1) - (c10 ^ i2);
                                                int i244 = i243 << 13;
                                                int i245 = (i244 | i243) & (~(i243 & i244));
                                                int i246 = i245 >>> 17;
                                                int i247 = ((~i245) & i246) | ((~i246) & i245);
                                                ((int[]) objArr94[1])[0] = i247 ^ (i247 << 5);
                                                return objArr94;
                                            }
                                            try {
                                                int i248 = -(-(ViewConfiguration.getJumpTapTimeout() >> 16));
                                                int i249 = ((i248 | 21647) << 1) - (i248 ^ 21647);
                                                java.lang.Object[] objArr95 = new java.lang.Object[1];
                                                c("輪\udbb8♨犗\udd11⧺瑮샕⬎瘷슡ⴎ禘", i249, objArr95);
                                                try {
                                                    java.lang.Object[] objArr96 = {(String) objArr95[0]};
                                                    java.lang.Object PngjBadSignature21 = com.d.e.a.PngjBadCrcException.PngjBadSignature(547370249);
                                                    if (PngjBadSignature21 == null) {
                                                        char trimmedLength4 = (char) (TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 8752);
                                                        int combineMeasuredStates = 24 - View.combineMeasuredStates(0, 0);
                                                        int indexOf4 = 336 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0);
                                                        byte b41 = $$a[4];
                                                        byte b42 = b41;
                                                        java.lang.Object[] objArr97 = new java.lang.Object[1];
                                                        a(b42, (byte) (b42 + 1), b41, objArr97);
                                                        PngjBadSignature21 = com.d.e.a.PngjBadCrcException.PngjBadSignature(trimmedLength4, combineMeasuredStates, indexOf4, -598779726, false, (String) objArr97[0], new Class[]{String.class});
                                                    }
                                                    java.lang.Object invoke5 = ((Method) PngjBadSignature21).invoke(null, objArr96);
                                                    if (invoke5 != null) {
                                                        int i250 = PngjOutputException;
                                                        PngjUnsupportedException = ((i250 & 29) + (i250 | 29)) % 128;
                                                        java.lang.Object[] objArr98 = new java.lang.Object[1];
                                                        c("輻␠\ud93b踵⌳\ud83a贻∱휽谾ℶ", 43777 - (~(-(-TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0)))), objArr98);
                                                        try {
                                                            java.lang.Object[] objArr99 = {invoke5, new String[]{(String) objArr98[0]}};
                                                            java.lang.Object PngjBadSignature22 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-344601997);
                                                            if (PngjBadSignature22 == null) {
                                                                char scrollBarFadeDuration = (char) (26716 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                                                int maxKeyCode2 = 33 - (KeyEvent.getMaxKeyCode() >> 16);
                                                                int indexOf5 = TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0) + 1668;
                                                                byte b43 = $$a[4];
                                                                byte b44 = b43;
                                                                java.lang.Object[] objArr100 = new java.lang.Object[1];
                                                                a(b44, (byte) (b44 + 1), b43, objArr100);
                                                                PngjBadSignature22 = com.d.e.a.PngjBadCrcException.PngjBadSignature(scrollBarFadeDuration, maxKeyCode2, indexOf5, 396011464, false, (String) objArr100[0], new Class[]{String.class, String[].class});
                                                            }
                                                            long longValue14 = ((Long) ((Method) PngjBadSignature22).invoke(null, objArr99)).longValue();
                                                            long j120 = -340682019;
                                                            long j121 = (j11 * longValue14) + (j2 * j120);
                                                            long j122 = longValue14 ^ j13;
                                                            long myTid3 = ((Process.myTid() ^ j13) | longValue14) ^ j13;
                                                            long j123 = ((((j122 | j120) ^ j13) | myTid3) * j) + j121;
                                                            long j124 = j120 ^ j13;
                                                            long j125 = ((j18 * (myTid3 | ((j124 | j122) ^ j13))) + ((((j124 | longValue14) ^ j13) * j75) + j123)) - 1345910202;
                                                            int i251 = ((int) (j125 >> 32)) & ((((~((-1914365573) | i)) | (~(i7 | (-477139162)))) * 979) + (((-477139162) | i) * (-979)) + ((~((-1914365573) | i7)) * 979) + 911268144);
                                                            int i252 = ((int) j125) & ((((~(1081258469 | i)) | (~(i7 | (-1077940258)))) * 765) + (((~(1081258469 | i7)) | (-1433908198)) * 1530) + (((~(1433908197 | i7)) | (~((-352649729) | i)) | (~((-1077940258) | i))) * 765) + 1058358946);
                                                        } catch (Throwable th) {
                                                            Throwable cause = th.getCause();
                                                            if (cause != null) {
                                                                throw cause;
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    int i253 = -(-Color.argb(0, 0, 0, 0));
                                                    int i254 = (i253 ^ 11273) + ((i253 & 11273) << 1);
                                                    objArr2 = new java.lang.Object[1];
                                                    c("輱ꌿ휣ଷ㽒匆蜘묄\uef3eͺ㝷此齐덌\ue743᮲侧掯", i254, objArr2);
                                                } catch (Throwable th2) {
                                                    Throwable cause2 = th2.getCause();
                                                    if (cause2 != null) {
                                                        throw cause2;
                                                    }
                                                    throw th2;
                                                }
                                            } catch (Exception unused) {
                                            }
                                            try {
                                                java.lang.Object[] objArr101 = {(String) objArr2[0]};
                                                java.lang.Object PngjBadSignature23 = com.d.e.a.PngjBadCrcException.PngjBadSignature(547370249);
                                                if (PngjBadSignature23 == null) {
                                                    char capsMode2 = (char) (TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 8752);
                                                    int packedPositionGroup = 24 - ExpandableListView.getPackedPositionGroup(j3);
                                                    int i255 = (SystemClock.elapsedRealtime() > j3 ? 1 : (SystemClock.elapsedRealtime() == j3 ? 0 : -1)) + 335;
                                                    byte b45 = $$a[4];
                                                    byte b46 = b45;
                                                    java.lang.Object[] objArr102 = new java.lang.Object[1];
                                                    a(b46, (byte) (b46 + 1), b45, objArr102);
                                                    PngjBadSignature23 = com.d.e.a.PngjBadCrcException.PngjBadSignature(capsMode2, packedPositionGroup, i255, -598779726, false, (String) objArr102[0], new Class[]{String.class});
                                                }
                                                java.lang.Object invoke6 = ((Method) PngjBadSignature23).invoke(null, objArr101);
                                                if (invoke6 != null) {
                                                    int i256 = -(-(ViewConfiguration.getJumpTapTimeout() >> 16));
                                                    int i257 = ((i256 | 19139) << 1) - (i256 ^ 19139);
                                                    java.lang.Object[] objArr103 = new java.lang.Object[1];
                                                    c("輪엮᪰潿ꐽ\ufaf9侭", i257, objArr103);
                                                    if (invoke6.equals((String) objArr103[0])) {
                                                        int i258 = -(KeyEvent.getMaxKeyCode() >> 16);
                                                        java.lang.Object[] objArr104 = new java.lang.Object[1];
                                                        b(null, (i258 ^ 127) + ((i258 & 127) << 1), null, "\u0090\u0090\u0088\u008a\u008a\u0085\u009c\u0092\u0082\u0082\u0081\u0083\u0090\u0093\u0090\u0083\u0092\u0090\u008f\u0090\u0081\u0088\u0091", objArr104);
                                                        try {
                                                            java.lang.Object[] objArr105 = {(String) objArr104[0]};
                                                            java.lang.Object PngjBadSignature24 = com.d.e.a.PngjBadCrcException.PngjBadSignature(547370249);
                                                            if (PngjBadSignature24 == null) {
                                                                char c11 = (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 8751);
                                                                int i259 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 24;
                                                                int indexOf6 = 336 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0);
                                                                byte b47 = $$a[4];
                                                                byte b48 = b47;
                                                                java.lang.Object[] objArr106 = new java.lang.Object[1];
                                                                a(b48, (byte) (b48 + 1), b47, objArr106);
                                                                PngjBadSignature24 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c11, i259, indexOf6, -598779726, false, (String) objArr106[0], new Class[]{String.class});
                                                            }
                                                            String str38 = (String) ((Method) PngjBadSignature24).invoke(null, objArr105);
                                                            if (str38 != null && (parseInt = Integer.parseInt(str38)) != 0) {
                                                                i9 = (parseInt | 170) + (parseInt & 170);
                                                                if (i9 == 0) {
                                                                    java.lang.Object[] objArr107 = {new int[]{(i9 & i7) | ((~i9) & i)}, new int[1], null, new int[]{i}};
                                                                    int myTid4 = Process.myTid();
                                                                    int d = defpackage.a.d((~((~myTid4) | (-1017689761))) | android.R.attr.label, 576, (((~((-1017706491) | myTid4)) | 16730) * 576) + 2125019669, 9636496, i2);
                                                                    int i260 = d ^ (d << 13);
                                                                    int i261 = i260 >>> 17;
                                                                    int i262 = ((~i260) & i261) | ((~i261) & i260);
                                                                    int i263 = i262 << 5;
                                                                    ((int[]) objArr107[1])[0] = (i262 | i263) & (~(i262 & i263));
                                                                    return objArr107;
                                                                }
                                                                int i264 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                                int i265 = i264 * 905;
                                                                int i266 = ((i265 | (-19547241)) << 1) - (i265 ^ (-19547241));
                                                                int i267 = ~i264;
                                                                int i268 = -(-(((~(i267 | i)) | (~((i105 ^ 21647) | (i105 & 21647)))) * (-1808)));
                                                                int i269 = ((i266 | i268) << 1) - (i268 ^ i266);
                                                                int i270 = (i267 ^ (-21648)) | (i267 & (-21648));
                                                                int i271 = ~((i270 & i) | (i270 ^ i));
                                                                int i272 = (i264 & i105) | (i105 ^ i264);
                                                                int i273 = ~((i272 ^ 21647) | (i272 & 21647));
                                                                int i274 = ((i271 & i273) | (i271 ^ i273)) * 904;
                                                                int i275 = (~((i267 & 21647) | (i267 ^ 21647))) | (~(((-21648) & i) | ((-21648) ^ i)));
                                                                int i276 = ~i272;
                                                                int i277 = (((i276 & i275) | (i275 ^ i276)) * 904) + (((i269 | i274) << 1) - (i274 ^ i269));
                                                                java.lang.Object[] objArr108 = new java.lang.Object[1];
                                                                c("輪\udbb8♨犗\udd11⧺瑮샕⬎瘷슡ⴎ禘", i277, objArr108);
                                                                java.lang.Object[] objArr109 = {(String) objArr108[0]};
                                                                java.lang.Object PngjBadSignature25 = com.d.e.a.PngjBadCrcException.PngjBadSignature(547370249);
                                                                if (PngjBadSignature25 == null) {
                                                                    char c12 = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8752);
                                                                    int i278 = 25 - (ViewConfiguration.getZoomControlsTimeout() > j3 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j3 ? 0 : -1));
                                                                    int i279 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 336;
                                                                    byte b49 = $$a[4];
                                                                    byte b50 = b49;
                                                                    java.lang.Object[] objArr110 = new java.lang.Object[1];
                                                                    a(b50, (byte) (b50 + 1), b49, objArr110);
                                                                    PngjBadSignature25 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c12, i278, i279, -598779726, false, (String) objArr110[0], new Class[]{String.class});
                                                                }
                                                                java.lang.Object invoke7 = ((Method) PngjBadSignature25).invoke(null, objArr109);
                                                                if (invoke7 != null) {
                                                                    int i280 = -Color.red(0);
                                                                    int i281 = (i280 ^ 43777) + ((i280 & 43777) << 1);
                                                                    java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                                    c("輻␠\ud93b踵⌳\ud83a贻∱휽谾ℶ", i281, objArr111);
                                                                    java.lang.Object[] objArr112 = {invoke7, new String[]{(String) objArr111[0]}};
                                                                    java.lang.Object PngjBadSignature26 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-344601997);
                                                                    if (PngjBadSignature26 == null) {
                                                                        char lastIndexOf3 = (char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 26717);
                                                                        int i282 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33;
                                                                        int alpha4 = 1668 - Color.alpha(0);
                                                                        byte b51 = $$a[4];
                                                                        byte b52 = b51;
                                                                        java.lang.Object[] objArr113 = new java.lang.Object[1];
                                                                        a(b52, (byte) (b52 + 1), b51, objArr113);
                                                                        PngjBadSignature26 = com.d.e.a.PngjBadCrcException.PngjBadSignature(lastIndexOf3, i282, alpha4, 396011464, false, (String) objArr113[0], new Class[]{String.class, String[].class});
                                                                    }
                                                                    long longValue15 = ((Long) ((Method) PngjBadSignature26).invoke(null, objArr112)).longValue();
                                                                    long j126 = -1484368893;
                                                                    i10 = i105;
                                                                    long j127 = -318;
                                                                    long j128 = j126 ^ j13;
                                                                    long j129 = longValue15 ^ j13;
                                                                    long j130 = ((318 * (j129 | ((j128 | j4) ^ j13))) + ((j127 * (((j126 | j4) ^ j13) | ((j129 | j126) ^ j13))) + ((((((j128 | j129) | j4) ^ j13) | (((j80 | j126) | longValue15) ^ j13)) * j127) + ((319 * longValue15) + ((-317) * j126))))) - 202223328;
                                                                    int i283 = (int) Runtime.getRuntime().totalMemory();
                                                                    int i284 = ((1208590762 | i283) * 614) + 361383910;
                                                                    int i285 = ~i283;
                                                                    int i286 = ((int) (j130 >> 32)) & ((((~(i285 | (-824575062))) | (~(2033165823 | i285))) * 614) + (((~(824673781 | i285)) | 1208492042 | (~((-2033067104) | i285))) * (-1228)) + i284);
                                                                    int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
                                                                    int i287 = ~startUptimeMillis2;
                                                                    int i288 = ~(578970678 | i287);
                                                                    int i289 = ((int) j130) & (((2016197088 | i288) * 712) + (((~(startUptimeMillis2 | (-1479317953))) | (~(i287 | 2058288630))) * (-712)) + (((-2058288631) | i288) * (-712)) + 1934228061);
                                                                    if (((i286 & i289) | (i286 ^ i289)) != 1) {
                                                                        int i290 = -((byte) KeyEvent.getModifierMetaStateMask());
                                                                        int values2 = com.identy.a.PngjException.values();
                                                                        int i291 = i290 * 989;
                                                                        int i292 = (i291 & (-124362)) + (i291 | (-124362));
                                                                        int i293 = ~values2;
                                                                        int i294 = (i293 & (-127)) | ((-127) ^ i293);
                                                                        int i295 = ~((i294 & i290) | (i294 ^ i290));
                                                                        int i296 = (i290 ^ 126) | (i290 & 126);
                                                                        int i297 = ~((i296 & values2) | (i296 ^ values2));
                                                                        int i298 = -(-(((i295 & i297) | (i295 ^ i297)) * 988));
                                                                        int i299 = ((i292 | i298) << 1) - (i298 ^ i292);
                                                                        int i300 = -(-(((i290 ^ (-127)) | (i290 & (-127))) * (-988)));
                                                                        int i301 = (i299 ^ i300) + ((i300 & i299) << 1);
                                                                        int i302 = ~i290;
                                                                        int i303 = (~((i302 & (-127)) | (i302 ^ (-127)))) | (~(((-127) & values2) | ((-127) ^ values2)));
                                                                        int i304 = ~values2;
                                                                        int i305 = (i290 & i304) | (i304 ^ i290);
                                                                        int i306 = ~((i305 & 126) | (i305 ^ 126));
                                                                        int i307 = (i301 - (~(((i306 & i303) | (i303 ^ i306)) * 988))) - 1;
                                                                        java.lang.Object[] objArr114 = new java.lang.Object[1];
                                                                        b(null, i307, null, "\u0095\u008d\u0085\u008a\u0082\u008d\u0095\u0085\u0092\u0085\u0086\u0095", objArr114);
                                                                        String str39 = (String) objArr114[0];
                                                                        int i308 = -View.MeasureSpec.getMode(0);
                                                                        int values3 = com.identy.a.PngjException.values();
                                                                        int i309 = i308 * (-167);
                                                                        int i310 = (i309 ^ (-21209)) + ((i309 & (-21209)) << 1);
                                                                        int i311 = ~i308;
                                                                        int i312 = ~((i311 ^ (-128)) | (i311 & (-128)));
                                                                        int i313 = ~values3;
                                                                        int i314 = ~((-128) | i313);
                                                                        int i315 = ((i312 & i314) | (i312 ^ i314)) * 168;
                                                                        int i316 = (i310 ^ i315) + ((i310 & i315) << 1);
                                                                        int i317 = ~i308;
                                                                        int i318 = (i317 ^ (-128)) | (i317 & (-128));
                                                                        int i319 = ((~((i318 & values3) | (i318 ^ values3))) * 168) + i316;
                                                                        int i320 = ~((i317 & i313) | (i317 ^ i313));
                                                                        int i321 = ~(i311 | 127);
                                                                        int i322 = ((-128) & i308) | ((-128) ^ i308);
                                                                        int i323 = ((~((i322 & values3) | (i322 ^ values3))) | (i321 & i320) | (i320 ^ i321)) * 168;
                                                                        int i324 = (i319 ^ i323) + ((i323 & i319) << 1);
                                                                        java.lang.Object[] objArr115 = new java.lang.Object[1];
                                                                        b(null, i324, null, "\u0095\u0089\u008f\u0098\u0095\u008d\u0085\u008a\u0082\u008d\u0095\u0085\u0092\u0085\u0086\u0095", objArr115);
                                                                        String str40 = (String) objArr115[0];
                                                                        java.lang.Object[] objArr116 = new java.lang.Object[1];
                                                                        c("轷퍻㞷鯹︥䈔ꚞ\u0ac6洃녆ᗲ硺\udc74₡蓓\ue71f䬇", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23623, objArr116);
                                                                        String str41 = (String) objArr116[0];
                                                                        int i325 = -View.getDefaultSize(0, 0);
                                                                        int i326 = (i325 ^ 63097) + ((i325 & 63097) << 1);
                                                                        java.lang.Object[] objArr117 = new java.lang.Object[1];
                                                                        c("轷祒揈汚囒弪", i326, objArr117);
                                                                        String str42 = (String) objArr117[0];
                                                                        java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                                        b(null, 127 - (ViewConfiguration.getJumpTapTimeout() >> 16), null, "\u0095\u0089\u008f\u0098\u0095\u0094\u0088\u0092\u0090\u0093\u0090\u0095", objArr118);
                                                                        String str43 = (String) objArr118[0];
                                                                        java.lang.Object[] objArr119 = new java.lang.Object[1];
                                                                        c("轷뎮\uf62b㪤紸ꆤ\ue42b⣔欒꾜툄ᛀ奊鷼쁦ӧ䜧", 15492 - (~(-View.MeasureSpec.getSize(0))), objArr119);
                                                                        String str44 = (String) objArr119[0];
                                                                        java.lang.Object[] objArr120 = new java.lang.Object[1];
                                                                        c("轷鶘ꩇ뜲엠퉂＇ඒ᪢❺㗈䋆潚簮諻靉ꐛ닚\udfa8\uec74懲", Color.argb(0, 0, 0, 0) + 4787, objArr120);
                                                                        String str45 = (String) objArr120[0];
                                                                        int i327 = -TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0);
                                                                        int i328 = (i327 ^ 126) + ((i327 & 126) << 1);
                                                                        java.lang.Object[] objArr121 = new java.lang.Object[1];
                                                                        b(null, i328, null, "\u0095\u0089\u008f\u0098\u009e\u0095\u0086\u0090\u0095\u0094\u0088\u0092\u0090\u0093\u0090\u0095", objArr121);
                                                                        String str46 = (String) objArr121[0];
                                                                        java.lang.Object[] objArr122 = new java.lang.Object[1];
                                                                        c("轷奾⎋ු홸ꂔ請匤㶅ߖ큸뫐蓓浬㟓Ǎ\uea6d뒘黆机ㆎᯎ\ue479캏颏", 54868 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0'), objArr122);
                                                                        String str47 = (String) objArr122[0];
                                                                        int myTid5 = Process.myTid() >> 22;
                                                                        int values4 = com.identy.a.PngjException.values();
                                                                        int i329 = myTid5 * 319;
                                                                        int i330 = (i329 & (-40259)) + (i329 | (-40259));
                                                                        int i331 = ~((~myTid5) | values4);
                                                                        int i332 = (i330 - (~((((-128) & i331) | ((-128) ^ i331)) * (-318)))) - 1;
                                                                        int i333 = ~(((-128) ^ values4) | ((-128) & values4));
                                                                        int i334 = (~values4) | myTid5;
                                                                        int i335 = ~((i334 & 127) | (i334 ^ 127));
                                                                        int i336 = (((i333 & i335) | (i333 ^ i335)) * 318) + i332;
                                                                        int i337 = ~values4;
                                                                        int i338 = ((-128) & i337) | ((-128) ^ i337);
                                                                        int i339 = ~((i338 & myTid5) | (i338 ^ myTid5));
                                                                        int i340 = ~((myTid5 & 127) | (myTid5 ^ 127) | values4);
                                                                        int i341 = ((i340 & i339) | (i339 ^ i340)) * 318;
                                                                        int i342 = (i336 & i341) + (i341 | i336);
                                                                        java.lang.Object[] objArr123 = new java.lang.Object[1];
                                                                        b(null, i342, null, "\u0095\u0089\u008f\u0098\u009e\u0095\u0094\u0088\u0092\u0090\u0093\u0090\u0095", objArr123);
                                                                        String str48 = (String) objArr123[0];
                                                                        int i343 = -(-TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0));
                                                                        int i344 = (i343 ^ 16763) + ((i343 & 16763) << 1);
                                                                        java.lang.Object[] objArr124 = new java.lang.Object[1];
                                                                        c("轷칖ෝ䭛誛졝ߓ䕫蒯", i344, objArr124);
                                                                        String str49 = (String) objArr124[0];
                                                                        java.lang.Object[] objArr125 = new java.lang.Object[1];
                                                                        b(null, 126 - (~(-(-ExpandableListView.getPackedPositionType(j3)))), null, "\u0095\u0089\u008f\u0098\u0095\u008b\u0090\u0095", objArr125);
                                                                        String[] strArr8 = {str39, str40, str41, str42, str43, str44, str45, str46, str47, str48, str49, (String) objArr125[0]};
                                                                        int i345 = 0;
                                                                        while (i345 < 12) {
                                                                            StringBuilder sb = new StringBuilder();
                                                                            sb.append(strArr8[i345]);
                                                                            int i346 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                                            int i347 = ((i346 | 37607) << 1) - (i346 ^ 37607);
                                                                            java.lang.Object[] objArr126 = new java.lang.Object[1];
                                                                            c("輫᷊", i347, objArr126);
                                                                            sb.append((String) objArr126[0]);
                                                                            java.lang.Object[] objArr127 = {sb.toString()};
                                                                            java.lang.Object PngjBadSignature27 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1666380462);
                                                                            if (PngjBadSignature27 == null) {
                                                                                char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(j3) + 1);
                                                                                int bitsPerPixel = 27 - ImageFormat.getBitsPerPixel(0);
                                                                                int bitsPerPixel2 = 1446 - ImageFormat.getBitsPerPixel(0);
                                                                                byte b53 = (byte) ($$b & 5);
                                                                                byte b54 = $$a[4];
                                                                                strArr2 = strArr8;
                                                                                java.lang.Object[] objArr128 = new java.lang.Object[1];
                                                                                a(b53, b54, b54, objArr128);
                                                                                PngjBadSignature27 = com.d.e.a.PngjBadCrcException.PngjBadSignature(packedPositionChild, bitsPerPixel, bitsPerPixel2, -1614962923, false, (String) objArr128[0], new Class[]{String.class});
                                                                            } else {
                                                                                strArr2 = strArr8;
                                                                            }
                                                                            long longValue16 = ((Long) ((Method) PngjBadSignature27).invoke(null, objArr127)).longValue();
                                                                            long j131 = 271928728;
                                                                            int i348 = i345;
                                                                            long j132 = 52;
                                                                            long j133 = j80 | j131;
                                                                            long j134 = longValue16 ^ j13;
                                                                            long j135 = ((-52) * (((j134 | j80) ^ j13) | ((j134 | j131) ^ j13) | (j133 ^ j13))) + (((j133 | longValue16) ^ j13) * j132) + (53 * longValue16) + ((-51) * j131);
                                                                            long j136 = j131 ^ j13;
                                                                            long j137 = (j132 * (((j136 | j80) ^ j13) | ((longValue16 | j136) ^ j13))) + j135 + 198559589;
                                                                            int freeMemory4 = (int) Runtime.getRuntime().freeMemory();
                                                                            int i349 = ~freeMemory4;
                                                                            if ((((((int) (j137 >> 32)) & ((((~(freeMemory4 | 1459616511)) | ((~((-13333173) | i349)) | 4276244)) * 140) + ((((~(1450559583 | i349)) | (-1459616512)) * (-280)) + (((1450559583 | freeMemory4) * 140) + 1435792070)))) | (((int) j137) & defpackage.a.c((~(1704244536 | i)) | (-1878982591), 490, (((-174738055) | i7) * (-490)) + (-1886163141), -1989863350))) != 0 ? '5' : '8') != '8') {
                                                                                i11 = (i348 ^ 110) + ((i348 & 110) << 1);
                                                                                break;
                                                                            }
                                                                            i345 = ((i348 & 1) << 1) + (i348 ^ 1);
                                                                            strArr8 = strArr2;
                                                                        }
                                                                    }
                                                                } else {
                                                                    i10 = i105;
                                                                }
                                                                i11 = 0;
                                                                if (i11 != 0) {
                                                                    java.lang.Object[] objArr129 = {new int[]{0}, new int[]{(0 | 0) & (~(0 & 0))}, null, new int[]{i}};
                                                                    int i350 = (~(i & i11)) & (i | i11);
                                                                    int i351 = (((~((-690802354) | i7)) | 687899665) * (-245)) + 159709638;
                                                                    int i352 = ~((-690802354) | i);
                                                                    int i353 = ((i352 | 343763620) * 245) + (i352 * (-245)) + i351;
                                                                    int i354 = (i353 ^ 16) + ((i353 & 16) << 1);
                                                                    int i355 = ((i354 * 860) - (~(i2 * (-858)))) - 1;
                                                                    int i356 = ((i354 ^ i) | (i354 & i)) * (-859);
                                                                    int i357 = (i355 & i356) + (i355 | i356);
                                                                    int i358 = ~((i7 ^ i354) | (i7 & i354));
                                                                    int i359 = ~i354;
                                                                    int i360 = ~i2;
                                                                    int i361 = ((~(i | (i359 & i360) | (i359 ^ i360))) | i358) * 859;
                                                                    int i362 = (i357 & i361) + (i361 | i357);
                                                                    int i363 = ~(i360 | i7);
                                                                    int i364 = ~((i360 & i354) | (i360 ^ i354));
                                                                    int i365 = (i362 - (~(-(-(((i363 & i364) | (i363 ^ i364)) * 859))))) - 1;
                                                                    int i366 = i365 << 13;
                                                                    int i367 = (i366 & (~i365)) | ((~i366) & i365);
                                                                    int i368 = i367 ^ (i367 >>> 17);
                                                                    int i369 = i368 << 5;
                                                                    return objArr129;
                                                                }
                                                                long[] jArr = {472001035};
                                                                java.lang.Object[] objArr130 = new java.lang.Object[1];
                                                                b(null, 126 - (~(-(ViewConfiguration.getLongPressTimeout() >> 16))), null, "\u0090\u0092\u0089\u008b\u0082\u0094\u0095\u008e\u008d\u0088\u0090\u0095\u008a\u0082\u0081\u0091\u0095", objArr130);
                                                                try {
                                                                    bufferedInputStream2 = new BufferedInputStream(new FileInputStream((String) objArr130[0]));
                                                                    j8 = j3;
                                                                } catch (IOException unused2) {
                                                                    bufferedInputStream2 = null;
                                                                } catch (Throwable th3) {
                                                                    th = th3;
                                                                    bufferedInputStream = null;
                                                                }
                                                                loop5: while (true) {
                                                                    try {
                                                                        int read = bufferedInputStream2.read();
                                                                        if (read != -1) {
                                                                            int i370 = PngjUnsupportedException + 25;
                                                                            PngjOutputException = i370 % 128;
                                                                            if (i370 % 2 == 0) {
                                                                                j8 = ((j8 >> 2) ^ read) / 1073741823;
                                                                                i16 = 1;
                                                                            } else {
                                                                                j8 = ((j8 << i4) ^ read) & 1073741823;
                                                                                i16 = 0;
                                                                            }
                                                                            while (true) {
                                                                                if ((i16 < 1 ? Typography.amp : (char) 15) != 15) {
                                                                                    if ((j8 == jArr[i16] ? ' ' : '%') != '%') {
                                                                                        i12 = (i16 ^ 1) + ((i16 & 1) << 1);
                                                                                        try {
                                                                                            bufferedInputStream2.close();
                                                                                            break loop5;
                                                                                        } catch (Exception unused3) {
                                                                                        }
                                                                                    } else {
                                                                                        i16++;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } catch (IOException unused4) {
                                                                    } catch (Throwable th4) {
                                                                        th = th4;
                                                                        bufferedInputStream = bufferedInputStream2;
                                                                        if (bufferedInputStream != null) {
                                                                            try {
                                                                                bufferedInputStream.close();
                                                                            } catch (Exception unused5) {
                                                                            }
                                                                        }
                                                                        throw th;
                                                                    }
                                                                    try {
                                                                        bufferedInputStream2.close();
                                                                        break;
                                                                    } catch (Exception unused6) {
                                                                    }
                                                                }
                                                                if (i12 == 0) {
                                                                    int i371 = PngjOutputException;
                                                                    PngjUnsupportedException = ((i371 & 123) + (i371 | 123)) % 128;
                                                                    i13 = 240;
                                                                } else {
                                                                    i13 = 0;
                                                                }
                                                                if (i13 == 0) {
                                                                    c3 = c2;
                                                                    c4 = c3;
                                                                } else {
                                                                    c3 = '`';
                                                                    c4 = c2;
                                                                }
                                                                if (c3 != c4) {
                                                                    int i372 = i7;
                                                                    java.lang.Object[] objArr131 = {new int[]{(i13 | i) & (~(i & i13))}, new int[1], null, new int[]{i}};
                                                                    int c13 = defpackage.a.c((~((int) Runtime.getRuntime().freeMemory())) | 1000995149, -828, (((~(1000995149 | 0)) | 33570824) * (-828)) - 1338267583, 104703928);
                                                                    int i373 = (c13 ^ 16) + ((c13 & 16) << 1);
                                                                    int i374 = i373 * 755;
                                                                    int i375 = -(-(i2 * (-753)));
                                                                    int i376 = ((i374 | i375) << 1) - (i374 ^ i375);
                                                                    int i377 = ~i373;
                                                                    int i378 = (~((i377 ^ i2) | (i377 & i2))) | (~((i377 ^ i) | (i377 & i)));
                                                                    int i379 = ~((i2 ^ i) | (i2 & i));
                                                                    int i380 = (i376 - (~(((i378 & i379) | (i378 ^ i379)) * (-754)))) - 1;
                                                                    int i381 = ~i373;
                                                                    int i382 = (i381 & i2) | (i381 ^ i2);
                                                                    int i383 = ~((i & i382) | (i382 ^ i));
                                                                    int i384 = i373 | i372;
                                                                    int i385 = ~((i2 & i384) | (i384 ^ i2));
                                                                    int i386 = (((i377 & i372) | (i377 ^ i372)) * 754) + (((i383 & i385) | (i383 ^ i385)) * (-754)) + i380;
                                                                    int i387 = i386 << 13;
                                                                    int i388 = (i386 | i387) & (~(i386 & i387));
                                                                    int i389 = i388 >>> 17;
                                                                    int i390 = ((~i388) & i389) | ((~i389) & i388);
                                                                    int i391 = i390 << 5;
                                                                    ((int[]) objArr131[1])[0] = (i390 | i391) & (~(i390 & i391));
                                                                    return objArr131;
                                                                }
                                                                long[] jArr2 = {472001035};
                                                                int i392 = -View.MeasureSpec.getSize(0);
                                                                int i393 = (i392 & 127) + (i392 | 127);
                                                                java.lang.Object[] objArr132 = new java.lang.Object[1];
                                                                b(null, i393, null, "\u0093\u008a\u008f\u008d\u0082\u0091\u0095\u009e\u008b\u0089\u008f\u008d\u0088\u0090\u0095\u0090\u008e\u0095\u0090\u0093\u0090\u0095", objArr132);
                                                                java.lang.Object[] objArr133 = {(String) objArr132[0], Integer.valueOf(i4), 1073741823L, jArr2};
                                                                java.lang.Object PngjBadSignature28 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1000971846);
                                                                if (PngjBadSignature28 == null) {
                                                                    char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                                                                    int alpha5 = 35 - Color.alpha(0);
                                                                    int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 1313;
                                                                    byte b55 = $$a[4];
                                                                    byte b56 = b55;
                                                                    java.lang.Object[] objArr134 = new java.lang.Object[1];
                                                                    a(b56, (byte) (b56 + 1), b55, objArr134);
                                                                    cls2 = cls;
                                                                    PngjBadSignature28 = com.d.e.a.PngjBadCrcException.PngjBadSignature(threadPriority, alpha5, longPressTimeout2, 951651329, false, (String) objArr134[0], new Class[]{String.class, cls2, Long.TYPE, long[].class});
                                                                } else {
                                                                    cls2 = cls;
                                                                }
                                                                long longValue17 = ((Long) ((Method) PngjBadSignature28).invoke(null, objArr133)).longValue();
                                                                long j138 = 395104649;
                                                                long j139 = 371;
                                                                long j140 = j139 * longValue17;
                                                                long j141 = -370;
                                                                long j142 = longValue17 ^ j13;
                                                                long j143 = j138 ^ j13;
                                                                long j144 = ((((j142 | j80) ^ j13) | ((j143 | j4) ^ j13)) * j141) + j140 + (j139 * j138);
                                                                long j145 = (j138 | longValue17) ^ j13;
                                                                long j146 = ((((j143 | j80) ^ j13) | ((j142 | j4) ^ j13) | j145) * j141) + j144;
                                                                long j147 = 370;
                                                                long j148 = ((j145 * j147) + j146) - 574948818;
                                                                int i394 = ((int) (j148 >> 32)) & ((((-635668905) | (~(i7 | 2072895315))) * 56) + ((((~((-635668905) | i)) | 2072895315) * 56) - 1560841286));
                                                                int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                                                                int i395 = ~elapsedCpuTime2;
                                                                int i396 = ((int) j148) & ((((~(elapsedCpuTime2 | (-67109154))) | (~((-962153545) | i395)) | 554189832) * 140) + ((67109153 | (~((-475072866) | i395))) * (-280)) + (((-475072866) | elapsedCpuTime2) * 140) + 1176647065);
                                                                if (((i394 & i396) | (i394 ^ i396)) != 0) {
                                                                    PngjOutputException = (PngjUnsupportedException + 81) % 128;
                                                                    java.lang.Object[] objArr135 = {new int[]{0}, new int[1], null, new int[]{i}};
                                                                    int i397 = (~(i & 242)) & (i | 242);
                                                                    int A = defpackage.a.A(~(Process.myTid() | (-153991)), 566, (((~((-218323408) | 0)) | 218169417) * (-566)) - 35595589, -16);
                                                                    int i398 = (i2 & A) + (A | i2);
                                                                    int i399 = i398 << 13;
                                                                    int i400 = (i399 & (~i398)) | ((~i399) & i398);
                                                                    int i401 = i400 >>> 17;
                                                                    int i402 = ((~i400) & i401) | ((~i401) & i400);
                                                                    int i403 = i402 << 5;
                                                                    ((int[]) objArr135[1])[0] = ((~i402) & i403) | ((~i403) & i402);
                                                                    return objArr135;
                                                                }
                                                                java.lang.Object PngjBadSignature29 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1372235840);
                                                                if (PngjBadSignature29 == null) {
                                                                    char indexOf7 = (char) (23941 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0));
                                                                    int indexOf8 = 23 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0);
                                                                    int myTid6 = (Process.myTid() >> 22) + 312;
                                                                    byte b57 = (byte) ($$b & 5);
                                                                    byte b58 = $$a[4];
                                                                    java.lang.Object[] objArr136 = new java.lang.Object[1];
                                                                    a(b57, b58, b58, objArr136);
                                                                    PngjBadSignature29 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf7, indexOf8, myTid6, 1390033531, false, (String) objArr136[0], new Class[0]);
                                                                }
                                                                long longValue18 = ((Long) ((Method) PngjBadSignature29).invoke(null, null)).longValue();
                                                                long j149 = -281456995;
                                                                long j150 = (434 * longValue18) + ((-432) * j149);
                                                                long j151 = 433;
                                                                long j152 = j149 ^ j13;
                                                                long myUid3 = Process.myUid();
                                                                long j153 = ((((j152 | myUid3) ^ j13) | ((j149 | longValue18) ^ j13)) * j151) + ((-433) * (j152 | (((longValue18 ^ j13) | myUid3) ^ j13))) + ((((j152 | (myUid3 ^ j13)) | longValue18) ^ j13) * j151) + j150 + 428371721;
                                                                int elapsedCpuTime3 = (int) Process.getElapsedCpuTime();
                                                                int i404 = ~elapsedCpuTime3;
                                                                int i405 = ((int) (j153 >> 32)) & ((((~(elapsedCpuTime3 | (-1099202595))) | (~(i404 | 1201071718)) | 134285568) * 140) + ((1099202594 | (~(i404 | 236154692))) * (-280)) + ((236154692 | elapsedCpuTime3) * 140) + 384738066);
                                                                int i406 = (int) j153;
                                                                int myUid4 = Process.myUid();
                                                                int i407 = (~(1924816999 | myUid4)) | 218106520;
                                                                int i408 = ~((~myUid4) | (-1655332931));
                                                                if ((i405 | (i406 & ((((~(myUid4 | 2142923519)) | i408) * 470) + (((i407 | i408) * (-470)) + (-2006377115))))) != 0) {
                                                                    objArr = new java.lang.Object[]{new int[]{0}, new int[]{0}, null, new int[]{i}};
                                                                    int i409 = (~(i & 264)) & (i | 264);
                                                                    int i410 = (((~((-982874909) | i)) | 34880024 | (~(i7 | 999685949))) * 988) + (((~(i7 | (-947994885))) | (~(999685949 | i))) * 988) + 464006285;
                                                                    int i411 = i410 * 185;
                                                                    int i412 = ((-2928) & i411) + (i411 | (-2928));
                                                                    int i413 = ((i410 ^ (-17)) | (i410 & (-17))) * (-368);
                                                                    int i414 = (i412 ^ i413) + ((i412 & i413) << 1);
                                                                    int i415 = ~i410;
                                                                    int i416 = (i415 ^ 16) | (i415 & 16);
                                                                    j7 = j103;
                                                                    int i417 = (i414 - (~(-(-(((i416 ^ i7) | (i416 & i7)) * 184))))) - 1;
                                                                    int i418 = ~i410;
                                                                    int i419 = (~((i418 & (-17)) | ((-17) ^ i418))) | (~((i7 ^ 16) | (i7 & 16)));
                                                                    int i420 = ~((i410 ^ 16) | (i410 & 16));
                                                                    int c14 = defpackage.a.c((i419 & i420) | (i419 ^ i420), 184, i417, i2);
                                                                    int i421 = c14 << 13;
                                                                    int i422 = ((~c14) & i421) | ((~i421) & c14);
                                                                    int i423 = i422 >>> 17;
                                                                    int i424 = (i422 | i423) & (~(i422 & i423));
                                                                    int i425 = i424 << 5;
                                                                    int i426 = (i424 | i425) & (~(i424 & i425));
                                                                    c5 = 0;
                                                                    i14 = i7;
                                                                } else {
                                                                    j7 = j103;
                                                                    java.lang.Object PngjBadSignature30 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-40521023);
                                                                    if (PngjBadSignature30 == null) {
                                                                        char indexOf9 = (char) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 1);
                                                                        int bitsPerPixel3 = ImageFormat.getBitsPerPixel(0) + 29;
                                                                        int indexOf10 = TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 1855;
                                                                        byte b59 = $$a[4];
                                                                        byte b60 = b59;
                                                                        java.lang.Object[] objArr137 = new java.lang.Object[1];
                                                                        a(b60, (byte) (b60 + 1), b59, objArr137);
                                                                        PngjBadSignature30 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf9, bitsPerPixel3, indexOf10, 24829818, false, (String) objArr137[0], new Class[0]);
                                                                    }
                                                                    long longValue19 = ((Long) ((Method) PngjBadSignature30).invoke(null, null)).longValue();
                                                                    long j154 = 1216279500;
                                                                    long j155 = -167;
                                                                    long j156 = (j155 * longValue19) + (j155 * j154);
                                                                    long j157 = 168;
                                                                    long j158 = j154 ^ j13;
                                                                    long j159 = longValue19 ^ j13;
                                                                    long j160 = j158 | j159;
                                                                    long uptimeMillis3 = (int) SystemClock.uptimeMillis();
                                                                    long j161 = uptimeMillis3 ^ j13;
                                                                    long j162 = ((((((j158 | j161) ^ j13) | ((j158 | longValue19) ^ j13)) | ((uptimeMillis3 | (j159 | j154)) ^ j13)) * j157) + ((((j160 | uptimeMillis3) ^ j13) * j157) + ((((j160 ^ j13) | ((j159 | j161) ^ j13)) * j157) + j156))) - 1963645521;
                                                                    int i427 = ~Process.myUid();
                                                                    int i428 = ((int) (j162 >> 32)) & ((((~(i427 | (-764720847))) | (-1364477257)) * 494) + (((-18089033) | i427) * 494) + 1179126390);
                                                                    int i429 = ((int) j162) & ((((~((-1612092646) | i7)) | 1245648240) * 217) + (((~((-1245648241) | i)) | 1075188832) * 217) + (((~((-1245648241) | i7)) | (~((-1612092646) | i))) * 217) + 1480531032);
                                                                    if ((((i428 & i429) | (i428 ^ i429)) != 0 ? '+' : '^') != '+') {
                                                                        i15 = i;
                                                                        i14 = i7;
                                                                    } else {
                                                                        i14 = i7;
                                                                        i15 = (i & (-282)) | (i14 & 281);
                                                                    }
                                                                    if (i15 != i) {
                                                                        PngjUnsupportedException = (PngjOutputException + 51) % 128;
                                                                        java.lang.Object[] objArr138 = {new int[]{i15}, new int[1], null, new int[]{i}};
                                                                        int startUptimeMillis3 = (int) Process.getStartUptimeMillis();
                                                                        int c15 = defpackage.a.c((~(startUptimeMillis3 | 738658453)) | (~(295907520 | startUptimeMillis3)) | (-1034369238), -1444, (((~startUptimeMillis3) | (-1034172502)) * 1444) + 1402242971, -651763782);
                                                                        int values5 = com.identy.a.PngjException.values();
                                                                        int i430 = -(-(c15 * (-69)));
                                                                        int i431 = (1136 ^ i430) + ((i430 & 1136) << 1);
                                                                        int i432 = ~((-17) | c15);
                                                                        int i433 = ~(c15 | values5);
                                                                        int i434 = (i431 - (~(((i432 ^ i433) | (i432 & i433)) * (-140)))) - 1;
                                                                        int i435 = (c15 ^ 16) | (c15 & 16);
                                                                        int i436 = ((~((i435 & values5) | (i435 ^ values5))) * 70) + i434;
                                                                        int i437 = ~(((-17) & c15) | ((-17) ^ c15));
                                                                        int i438 = ~c15;
                                                                        int i439 = ((i436 - (~(-(-((((~((i438 & 16) | (i438 ^ 16))) | i437) | (~((values5 & 16) | (values5 ^ 16)))) * 70))))) - 1) + i2;
                                                                        int i440 = i439 << 13;
                                                                        int i441 = (i440 | i439) & (~(i439 & i440));
                                                                        int i442 = i441 >>> 17;
                                                                        int i443 = (i441 | i442) & (~(i441 & i442));
                                                                        int i444 = i443 << 5;
                                                                        c5 = 0;
                                                                        ((int[]) objArr138[1])[0] = (i443 | i444) & (~(i443 & i444));
                                                                        objArr = objArr138;
                                                                    } else {
                                                                        java.lang.Object PngjBadSignature31 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-792668357);
                                                                        if (PngjBadSignature31 == null) {
                                                                            char c16 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > j3 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j3 ? 0 : -1)) + 30094);
                                                                            int packedPositionType3 = 45 - ExpandableListView.getPackedPositionType(j3);
                                                                            int trimmedLength5 = TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 1810;
                                                                            byte b61 = (byte) ($$b & 5);
                                                                            byte b62 = $$a[4];
                                                                            java.lang.Object[] objArr139 = new java.lang.Object[1];
                                                                            a(b61, b62, b62, objArr139);
                                                                            PngjBadSignature31 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c16, packedPositionType3, trimmedLength5, 741325440, false, (String) objArr139[0], new Class[0]);
                                                                        }
                                                                        long longValue20 = ((Long) ((Method) PngjBadSignature31).invoke(null, null)).longValue();
                                                                        long j163 = -852543239;
                                                                        long j164 = ((-271) * longValue20) + (273 * j163);
                                                                        long j165 = -272;
                                                                        long j166 = j163 ^ j13;
                                                                        long j167 = j166 | (longValue20 ^ j13);
                                                                        long j168 = (int) Runtime.getRuntime().totalMemory();
                                                                        long j169 = (272 * (longValue20 | ((j163 | j168) ^ j13))) + ((((j166 | longValue20) ^ j13) | ((j166 | j168) ^ j13)) * j165) + ((((j167 | (j168 ^ j13)) ^ j13) | (((j163 | longValue20) | j168) ^ j13)) * j165) + j164 + 1208277783;
                                                                        int i445 = ((int) (j169 >> 32)) & ((((~(98863833 | i)) | 1241595904) * 464) + (((-96766674) | i) * (-464)) + (((~((-1338362578) | i14)) | 1241595904 | (~(i14 | 98863833))) * 464) + 1835426858);
                                                                        int i446 = ((int) j169) & ((((~(1446332208 | i14)) | 34939925) * 764) + (((~(1411408677 | i14)) | 34931728) * (-1528)) + (((1411408677 | 0) * 764) - 804890435));
                                                                        if (((i445 & i446) | (i445 ^ i446)) != 0) {
                                                                            objArr = new java.lang.Object[]{new int[]{(i & (-269)) | (i14 & 268)}, new int[]{(0 | 0) & (~(0 & 0))}, null, new int[]{i}};
                                                                            int c17 = defpackage.a.c((~((-240145751) | i14)) | 240140630 | (~((-794420224) | i14)), 184, (((~(i14 | (-5121))) | (~((-554279594) | i14))) * (-184)) - 347012035, 145375048);
                                                                            int i447 = ((c17 | 16) << 1) - (c17 ^ 16);
                                                                            int i448 = (i2 & i447) + (i447 | i2);
                                                                            int i449 = i448 << 13;
                                                                            int i450 = ((~i448) & i449) | ((~i449) & i448);
                                                                            int i451 = i450 >>> 17;
                                                                            int i452 = ((~i450) & i451) | ((~i451) & i450);
                                                                            int i453 = i452 << 5;
                                                                        } else {
                                                                            java.lang.Object PngjBadSignature32 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-25572490);
                                                                            if (PngjBadSignature32 == null) {
                                                                                char c18 = (char) ((Process.getElapsedCpuTime() > j3 ? 1 : (Process.getElapsedCpuTime() == j3 ? 0 : -1)) + 30093);
                                                                                int i454 = 46 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                                                                int combineMeasuredStates2 = 1810 - View.combineMeasuredStates(0, 0);
                                                                                byte b63 = $$a[4];
                                                                                byte b64 = b63;
                                                                                java.lang.Object[] objArr140 = new java.lang.Object[1];
                                                                                a(b64, (byte) (b64 + 1), b63, objArr140);
                                                                                PngjBadSignature32 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c18, i454, combineMeasuredStates2, 43427533, false, (String) objArr140[0], new Class[0]);
                                                                            }
                                                                            long longValue21 = ((Long) ((Method) PngjBadSignature32).invoke(null, null)).longValue();
                                                                            long j170 = -1002485823;
                                                                            long j171 = (522 * longValue21) + ((-520) * j170);
                                                                            long j172 = 521;
                                                                            long j173 = j170 ^ j13;
                                                                            long j174 = j173 | longValue21;
                                                                            long freeMemory5 = (int) Runtime.getRuntime().freeMemory();
                                                                            long j175 = ((longValue21 ^ j13) | j170) ^ j13;
                                                                            long j176 = (((j175 | (((j173 | (freeMemory5 ^ j13)) | longValue21) ^ j13)) * j172) + (((-1042) * j175) + ((((j174 | freeMemory5) ^ j13) * j172) + j171))) - 595752963;
                                                                            int maxMemory = (int) Runtime.getRuntime().maxMemory();
                                                                            int i455 = ~maxMemory;
                                                                            if (((((int) (j176 >> 32)) & ((((~(maxMemory | (-289440913))) | (~(325774492 | i455)) | 1075118338) * 140) + ((289440912 | (~(1111451918 | i455))) * (-280)) + ((1111451918 | maxMemory) * 140) + 2127090602)) | (((int) j176) & ((((~(141923437 | i14)) | (~((-1579149848) | i14)) | (~((-6296681) | i))) * 568) + (((~((-141923438) | i)) | (~(1579149847 | i)) | (~((-1443523091) | i14))) * (-568)) + (((((~((-141923438) | i14)) | 6296680) | (~(1579149847 | i14))) * (-1136)) - 1738041619)))) != 0) {
                                                                                objArr = new java.lang.Object[]{new int[]{i ^ 266}, new int[]{(0 | 0) & (~(0 & 0))}, null, new int[]{i}};
                                                                                int i456 = (i2 - (~defpackage.a.A((~(651361 | i14)) | (-1034533014), 494, (((-1033898133) | i14) * 494) + 992767159, -16))) - 1;
                                                                                int i457 = i456 << 13;
                                                                                int i458 = ((~i456) & i457) | ((~i457) & i456);
                                                                                int i459 = i458 ^ (i458 >>> 17);
                                                                                int i460 = i459 << 5;
                                                                            } else {
                                                                                java.lang.Object PngjBadSignature33 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-2091466614);
                                                                                if (PngjBadSignature33 == null) {
                                                                                    char doubleTapTimeout3 = (char) (45717 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                                                                                    int mode3 = View.MeasureSpec.getMode(0) + 40;
                                                                                    int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 626;
                                                                                    byte b65 = (byte) ($$b & 5);
                                                                                    byte b66 = $$a[4];
                                                                                    java.lang.Object[] objArr141 = new java.lang.Object[1];
                                                                                    a(b65, b66, b66, objArr141);
                                                                                    PngjBadSignature33 = com.d.e.a.PngjBadCrcException.PngjBadSignature(doubleTapTimeout3, mode3, modifierMetaStateMask, 2142874929, false, (String) objArr141[0], new Class[0]);
                                                                                }
                                                                                long longValue22 = ((Long) ((Method) PngjBadSignature33).invoke(null, null)).longValue();
                                                                                long j177 = 1305623589;
                                                                                long j178 = -751;
                                                                                long j179 = j177 ^ j13;
                                                                                long j180 = longValue22 ^ j13;
                                                                                long j181 = j179 | longValue22;
                                                                                long j182 = (752 * ((j181 ^ j13) | ((j180 | j177) ^ j13))) + ((-1504) * ((j181 | j4) ^ j13)) + (1504 * (((j179 | j180) ^ j13) | ((j179 | j4) ^ j13))) + (j178 * longValue22) + (j178 * j177) + 31179693;
                                                                                int maxMemory2 = (int) Runtime.getRuntime().maxMemory();
                                                                                int i461 = (((-1449048024) | maxMemory2) * 614) + 1316840858;
                                                                                int i462 = ~maxMemory2;
                                                                                int i463 = ((int) (j182 >> 32)) & ((((~(i462 | (-5910807))) | (~((-1443137218) | i462))) * 614) + (((~((-1470484202) | i462)) | 27346984 | (~((-33257791) | i462))) * (-1228)) + i461);
                                                                                int i464 = ((int) j182) & ((((~((-965362795) | i14)) | 150994944) * 983) + (((~((-1892378092) | i14)) | (-965362795)) * (-983)) + 694743928);
                                                                                if (((i463 & i464) | (i463 ^ i464)) != 0) {
                                                                                    objArr = new java.lang.Object[]{new int[]{(i & (-281)) | (i14 & 280)}, new int[1], null, new int[]{i}};
                                                                                    int myTid7 = Process.myTid();
                                                                                    int i465 = ~myTid7;
                                                                                    int i466 = (((~((-263312045) | i465)) | 33656836) * 859) + (((~(myTid7 | (-229655209))) | (~(771253929 | i465))) * 859) + (((myTid7 | 771253929) * (-859)) - 730019004);
                                                                                    int i467 = (i466 ^ 16) + ((i466 & 16) << 1) + i2;
                                                                                    int i468 = i467 << 13;
                                                                                    int i469 = (i467 | i468) & (~(i467 & i468));
                                                                                    int i470 = i469 ^ (i469 >>> 17);
                                                                                    int i471 = i470 << 5;
                                                                                    c5 = 0;
                                                                                    ((int[]) objArr[1])[0] = (i470 | i471) & (~(i470 & i471));
                                                                                } else {
                                                                                    objArr = new java.lang.Object[]{new int[]{i}, new int[]{(0 | 0) & (~(0 & 0))}, null, new int[]{i}};
                                                                                    int i472 = -(-defpackage.a.c((~((-402915594) | i14)) | 562136128, 576, (((~((-437672720) | i)) | 34757126) * 576) + 2125019669, -1454731904));
                                                                                    int i473 = (i2 ^ i472) + ((i472 & i2) << 1);
                                                                                    int i474 = i473 << 13;
                                                                                    int i475 = (i474 | i473) & (~(i473 & i474));
                                                                                    int i476 = i475 >>> 17;
                                                                                    int i477 = ((~i475) & i476) | ((~i476) & i475);
                                                                                    int i478 = i477 << 5;
                                                                                    c5 = 0;
                                                                                }
                                                                            }
                                                                        }
                                                                        c5 = 0;
                                                                    }
                                                                }
                                                                if ((((int[]) objArr[3])[c5] != ((int[]) objArr[c5])[c5] ? ':' : '\b') == ':') {
                                                                    int i479 = PngjUnsupportedException;
                                                                    PngjOutputException = ((i479 & com.karumi.dexter.R.styleable.AppCompatTheme_tooltipFrameBackground) + (i479 | com.karumi.dexter.R.styleable.AppCompatTheme_tooltipFrameBackground)) % 128;
                                                                    return objArr;
                                                                }
                                                                java.lang.Object[] objArr142 = {2};
                                                                java.lang.Object PngjBadSignature34 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-476828914);
                                                                if (PngjBadSignature34 == null) {
                                                                    char c19 = (char) ((SystemClock.elapsedRealtimeNanos() > j3 ? 1 : (SystemClock.elapsedRealtimeNanos() == j3 ? 0 : -1)) + 35510);
                                                                    int i480 = (ViewConfiguration.getGlobalActionKeyTimeout() > j3 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j3 ? 0 : -1)) + 41;
                                                                    int indexOf11 = TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 507;
                                                                    byte b67 = (byte) ($$b & 5);
                                                                    byte b68 = $$a[4];
                                                                    java.lang.Object[] objArr143 = new java.lang.Object[1];
                                                                    a(b67, b68, b68, objArr143);
                                                                    PngjBadSignature34 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c19, i480, indexOf11, 528172725, false, (String) objArr143[0], new Class[]{cls2});
                                                                }
                                                                long longValue23 = ((Long) ((Method) PngjBadSignature34).invoke(null, objArr142)).longValue();
                                                                long j183 = -200446030;
                                                                long j184 = longValue23 ^ j13;
                                                                long j185 = ((-676) * (j183 | j4 | j184)) + ((-675) * longValue23) + (677 * j183);
                                                                long j186 = 676;
                                                                long j187 = (j186 * ((((j183 ^ j13) | j184) ^ j13) | ((j184 | j80) ^ j13) | (((j183 | longValue23) | j4) ^ j13))) + ((((j184 | j183) ^ j13) | ((j80 | j183) ^ j13)) * j186) + j185 + 1068192542;
                                                                int freeMemory6 = (int) Runtime.getRuntime().freeMemory();
                                                                int i481 = ((int) (j187 >> 32)) & ((((~((~freeMemory6) | 1060489865)) | 1412044098) * 262) + (((~(1060489865 | freeMemory6)) | 1412044098) * 262) + 1256578394);
                                                                int i482 = ((int) j187) & ((((~((~((int) Process.getElapsedCpuTime())) | (-776006153))) | (-795470762)) * 970) + (((19464609 | 0) * (-970)) - 1223899005));
                                                                if (((i481 & i482) | (i481 ^ i482)) == 2) {
                                                                    PngjOutputException = (PngjUnsupportedException + 9) % 128;
                                                                    java.lang.Object[] objArr144 = {new int[]{i ^ 270}, new int[]{0 ^ (0 << 5)}, null, new int[]{i}};
                                                                    int i483 = (((~(190728840 | i14)) | 805413957) * 191) + (((~(i | 190728840)) | 843837133) * 191) + 844933785;
                                                                    int i484 = ((i483 | 16) << 1) - (i483 ^ 16);
                                                                    int i485 = (i2 * (-216)) + (i484 * (-433));
                                                                    int i486 = ~i484;
                                                                    int i487 = ~((i486 ^ i10) | (i486 & i10));
                                                                    int i488 = ~i2;
                                                                    int i489 = ~((i488 ^ i) | (i488 & i));
                                                                    int i490 = ((i487 & i489) | (i487 ^ i489)) * 217;
                                                                    int i491 = ((i485 | i490) << 1) - (i485 ^ i490);
                                                                    int i492 = ~(i486 | i488);
                                                                    int i493 = ~((i & i486) | (i486 ^ i));
                                                                    int i494 = (((i493 & i492) | (i492 ^ i493)) * 217) + i491;
                                                                    int i495 = ~((~i2) | i14);
                                                                    int i496 = ((i495 & i484) | (i484 ^ i495)) * 217;
                                                                    int i497 = ((i494 | i496) << 1) - (i494 ^ i496);
                                                                    int i498 = (i497 << 13) ^ i497;
                                                                    int i499 = i498 >>> 17;
                                                                    int i500 = ((~i498) & i499) | ((~i499) & i498);
                                                                    return objArr144;
                                                                }
                                                                java.lang.Object PngjBadSignature35 = com.d.e.a.PngjBadCrcException.PngjBadSignature(98436405);
                                                                if (PngjBadSignature35 == null) {
                                                                    char capsMode3 = (char) (TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 51309);
                                                                    int i501 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 43;
                                                                    int resolveOpacity4 = Drawable.resolveOpacity(0, 0) + 1767;
                                                                    byte b69 = (byte) ($$b & 5);
                                                                    byte b70 = $$a[4];
                                                                    java.lang.Object[] objArr145 = new java.lang.Object[1];
                                                                    a(b69, b70, b70, objArr145);
                                                                    PngjBadSignature35 = com.d.e.a.PngjBadCrcException.PngjBadSignature(capsMode3, i501, resolveOpacity4, -114202482, false, (String) objArr145[0], new Class[0]);
                                                                }
                                                                long longValue24 = ((Long) ((Method) PngjBadSignature35).invoke(null, null)).longValue();
                                                                long j188 = 1472300824;
                                                                long j189 = (j139 * longValue24) + (j139 * j188);
                                                                long j190 = longValue24 ^ j13;
                                                                long j191 = j188 ^ j13;
                                                                long j192 = (longValue24 | j188) ^ j13;
                                                                long j193 = ((j192 * j147) + ((((((j191 | j80) ^ j13) | ((j190 | j4) ^ j13)) | j192) * j141) + (((((j190 | j80) ^ j13) | ((j191 | j4) ^ j13)) * j141) + j189))) - 2100729904;
                                                                int i502 = (~(689698100 | i)) | 1455688395;
                                                                int i503 = ((int) (j193 >> 32)) & ((((~((-18461985) | i14)) | (~(2145386495 | i))) * 470) + (((i502 | 0) * (-470)) - 1583995300));
                                                                int i504 = (int) j193;
                                                                int maxMemory3 = (int) Runtime.getRuntime().maxMemory();
                                                                int i505 = i504 & ((((~((~maxMemory3) | (-1405784694))) | 88180117) * 262) + (((~((-1405784694) | maxMemory3)) | 88180117) * 262) + 1860792089);
                                                                if (((i503 & i505) | (i503 ^ i505)) != 0) {
                                                                    java.lang.Object[] objArr146 = {new int[]{0}, new int[1], null, new int[]{i}};
                                                                    int i506 = (~(i & 272)) & (i | 272);
                                                                    int elapsedRealtime = (int) SystemClock.elapsedRealtime();
                                                                    int i507 = (i2 - (~defpackage.a.A((~((~elapsedRealtime) | 867385241)) | (-167180733), 168, (((~(elapsedRealtime | 867385241)) | (-1006108606)) * (-168)) + ((((~((-167180733) | elapsedRealtime)) | 28457368) * 336) - 973825651), -16))) - 1;
                                                                    int i508 = i507 << 13;
                                                                    int i509 = (i507 | i508) & (~(i507 & i508));
                                                                    int i510 = i509 >>> 17;
                                                                    int i511 = ((~i509) & i510) | ((~i510) & i509);
                                                                    ((int[]) objArr146[1])[0] = i511 ^ (i511 << 5);
                                                                    return objArr146;
                                                                }
                                                                long[] jArr3 = {624887784092251L};
                                                                int i512 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                                int i513 = i512 * 960;
                                                                int i514 = ((((i513 | (-243459)) << 1) - (i513 ^ (-243459))) - (~(-(-(((~((-128) | i14)) | (~((i512 ^ i) | (i512 & i)))) * 959))))) - (-122751);
                                                                int i515 = ~((-128) | i);
                                                                int i516 = ~((i512 & i10) | (i10 ^ i512));
                                                                int i517 = ((i516 & i515) | (i515 ^ i516)) * 959;
                                                                int i518 = ((i514 | i517) << 1) - (i517 ^ i514);
                                                                java.lang.Object[] objArr147 = new java.lang.Object[1];
                                                                b(null, i518, null, "\u0090\u0092\u0089\u008b\u0082\u0094\u0095\u008e\u008d\u0088\u0090\u0095\u008a\u0082\u0081\u0091\u0095", objArr147);
                                                                java.lang.Object[] objArr148 = {(String) objArr147[0], 3, 2251799813685247L, jArr3};
                                                                java.lang.Object PngjBadSignature36 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1000971846);
                                                                if (PngjBadSignature36 == null) {
                                                                    char c20 = (char) (1 - (Process.getElapsedCpuTime() > j3 ? 1 : (Process.getElapsedCpuTime() == j3 ? 0 : -1)));
                                                                    int pressedStateDuration2 = 35 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                                                    int keyCodeFromString2 = KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 1313;
                                                                    byte b71 = $$a[4];
                                                                    byte b72 = b71;
                                                                    java.lang.Object[] objArr149 = new java.lang.Object[1];
                                                                    a(b72, (byte) (b72 + 1), b71, objArr149);
                                                                    PngjBadSignature36 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c20, pressedStateDuration2, keyCodeFromString2, 951651329, false, (String) objArr149[0], new Class[]{String.class, cls2, Long.TYPE, long[].class});
                                                                }
                                                                long longValue25 = ((Long) ((Method) PngjBadSignature36).invoke(null, objArr148)).longValue();
                                                                long j194 = 843442055;
                                                                long j195 = j194 ^ j13;
                                                                long j196 = 381;
                                                                long j197 = ((j196 * ((j195 | longValue25) ^ j13)) + (((((j194 | longValue25) ^ j13) | (((j195 | (longValue25 ^ j13)) ^ j13) | ((j80 | longValue25) ^ j13))) * j196) + (((-381) * ((longValue25 | j4) | j195)) + ((382 * longValue25) + ((-380) * j194))))) - 1023286224;
                                                                int startUptimeMillis4 = (int) Process.getStartUptimeMillis();
                                                                int i519 = ((int) (j197 >> 32)) & ((((~(startUptimeMillis4 | (-1175165861))) | (-1682575025)) * 519) + (((~((~startUptimeMillis4) | (-33657093))) | (~((-1141508769) | startUptimeMillis4))) * (-519)) + ((((~(1682575024 | 0)) | (-1175165861)) * 519) - 1453938172));
                                                                int i520 = (((~((-590880652) | i)) | 51907210 | (~(2028107061 | i))) * (-880)) + 818884229;
                                                                int i521 = (~((-590880652) | i14)) | (-2028107062);
                                                                int i522 = ~(590880651 | i);
                                                                int i523 = ((int) j197) & ((i522 * 880) + ((i521 | i522) * (-880)) + i520);
                                                                if (((i519 & i523) | (i519 ^ i523)) != 0) {
                                                                    z4 = true;
                                                                } else {
                                                                    int i524 = PngjOutputException;
                                                                    PngjUnsupportedException = ((i524 & 67) + (i524 | 67)) % 128;
                                                                    z4 = false;
                                                                }
                                                                if (z4) {
                                                                    java.lang.Object[] objArr150 = {new int[]{(i & (-276)) | (i14 & 275)}, new int[]{(0 | 0) & (~(0 & 0))}, null, new int[]{i}};
                                                                    int i525 = (i2 - (~(-(-defpackage.a.c((~(i | (-188580945))) | 845985029, 376, (((~(i14 | 188580944)) | (-998094166)) * (-376)) + ((((-961622358) | i) * 376) - 1415183235), 16))))) - 1;
                                                                    int i526 = i525 << 13;
                                                                    int i527 = (i525 | i526) & (~(i525 & i526));
                                                                    int i528 = i527 >>> 17;
                                                                    int i529 = (i527 | i528) & (~(i527 & i528));
                                                                    int i530 = i529 << 5;
                                                                    return objArr150;
                                                                }
                                                                java.lang.Object[] objArr151 = new java.lang.Object[1];
                                                                b(null, 126 - (~(-(-TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0)))), null, "\u0096\u0090\u008f\u008c\u0093¥\u0095¤\u0088\u0086\u0095", objArr151);
                                                                java.lang.Object[] objArr152 = {(String) objArr151[0]};
                                                                java.lang.Object PngjBadSignature37 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1142218481);
                                                                if (PngjBadSignature37 == null) {
                                                                    char green = (char) Color.green(0);
                                                                    int i531 = 29 - (SystemClock.elapsedRealtimeNanos() > j3 ? 1 : (SystemClock.elapsedRealtimeNanos() == j3 ? 0 : -1));
                                                                    int normalizeMetaState2 = 1447 - KeyEvent.normalizeMetaState(0);
                                                                    byte b73 = $$a[4];
                                                                    byte b74 = b73;
                                                                    java.lang.Object[] objArr153 = new java.lang.Object[1];
                                                                    a(b74, (byte) (b74 + 1), b73, objArr153);
                                                                    PngjBadSignature37 = com.d.e.a.PngjBadCrcException.PngjBadSignature(green, i531, normalizeMetaState2, 1191464116, false, (String) objArr153[0], new Class[]{String.class});
                                                                }
                                                                long longValue26 = ((Long) ((Method) PngjBadSignature37).invoke(null, objArr152)).longValue();
                                                                long j198 = 9088649;
                                                                long j199 = 367;
                                                                long j200 = -366;
                                                                long j201 = ((j198 | longValue26) * j200) + (j199 * longValue26) + (j199 * j198);
                                                                long j202 = longValue26 ^ j13;
                                                                long j203 = ((366 * ((((j198 ^ j13) | longValue26) ^ j13) | (((j198 | j202) | j4) ^ j13))) + ((j200 * (j198 | ((j202 | j4) ^ j13))) + j201)) - 1965086526;
                                                                int i532 = (~(950718254 | i)) | (~((-1907022631) | i14));
                                                                int i533 = ~((-950718255) | i14);
                                                                int i534 = ((int) (j203 >> 32)) & (((134218760 | i533) * 516) + (((~(2041241390 | i)) | (~((-134218761) | i14))) * 516) + ((i532 | i533) * (-516)) + 969045386);
                                                                int i535 = ((int) j203) & ((((~((-905565454) | i14)) | 27262981 | (~((-1073872961) | i))) * 497) + ((((~((-878302473) | i)) | (~((-1073872961) | i14))) * 497) - 1670606888));
                                                                if (((i534 & i535) | (i534 ^ i535)) != 0) {
                                                                    java.lang.Object[] objArr154 = {new int[]{0}, new int[]{0 ^ (0 << 5)}, null, new int[]{i}};
                                                                    int i536 = (~(i & 276)) & (i | 276);
                                                                    int d2 = defpackage.a.d((~(i | 150645041)) | (~((-883920933) | i)) | 872747012, 623, ((i14 | 139471121) * (-623)) + (((~((-872747013) | i)) * 623) - 529780744), 16, i2);
                                                                    int i537 = d2 << 13;
                                                                    int i538 = ((~d2) & i537) | ((~i537) & d2);
                                                                    int i539 = i538 >>> 17;
                                                                    int i540 = ((~i538) & i539) | ((~i539) & i538);
                                                                    return objArr154;
                                                                }
                                                                java.lang.Object PngjBadSignature38 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1617763359);
                                                                if (PngjBadSignature38 == null) {
                                                                    char size = (char) View.MeasureSpec.getSize(0);
                                                                    int resolveSize = View.resolveSize(0, 0) + 31;
                                                                    int i541 = 1382 - (SystemClock.uptimeMillis() > j3 ? 1 : (SystemClock.uptimeMillis() == j3 ? 0 : -1));
                                                                    byte b75 = (byte) ($$b & 5);
                                                                    byte b76 = $$a[4];
                                                                    java.lang.Object[] objArr155 = new java.lang.Object[1];
                                                                    a(b75, b76, b76, objArr155);
                                                                    PngjBadSignature38 = com.d.e.a.PngjBadCrcException.PngjBadSignature(size, resolveSize, i541, -1669172828, false, (String) objArr155[0], new Class[0]);
                                                                }
                                                                long longValue27 = ((Long) ((Method) PngjBadSignature38).invoke(null, null)).longValue();
                                                                long j204 = -643729334;
                                                                long elapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                                                                long j205 = ((((((elapsedRealtime2 ^ j13) | longValue27) ^ j13) | ((j204 | elapsedRealtime2) ^ j13)) * j108) + ((((((longValue27 ^ j13) | elapsedRealtime2) ^ j13) | j204) * j105) + ((((longValue27 | elapsedRealtime2) | (j204 ^ j13)) * j105) + ((j7 * longValue27) + (j7 * j204))))) - 402965175;
                                                                int i542 = ((int) (j205 >> 32)) & ((((~((-1369506817) | i14)) | (~((-743852678) | i))) * 318) + (((~(744381391 | i)) | (~((-743852678) | i14))) * 318) + ((((~(2113359493 | i)) | 744381391) * (-318)) - 106113130));
                                                                int startElapsedRealtime4 = (int) Process.getStartElapsedRealtime();
                                                                if (!((i542 | (((int) j205) & ((((~(startElapsedRealtime4 | (-1240290833))) | 1080579072) * 116) + (((1617450053 | startElapsedRealtime4) * 116) + (((~((~startElapsedRealtime4) | 1777161813)) * (-116)) + 2072280017))))) == 0)) {
                                                                    java.lang.Object[] objArr156 = {new int[]{i ^ 273}, new int[]{((~0) & 0) | ((~0) & 0)}, null, new int[]{i}};
                                                                    int i543 = (((~(i | 25382510)) | 1034265737) * 70) + ((~(1034415855 | i)) * 70) + (((~(1009183463 | i)) | 25232392) * (-140)) + 887975999;
                                                                    int i544 = ((i543 | 16) << 1) - (i543 ^ 16);
                                                                    int i545 = (i2 & i544) + (i2 | i544);
                                                                    int i546 = i545 << 13;
                                                                    int i547 = ((~i545) & i546) | ((~i546) & i545);
                                                                    int i548 = i547 >>> 17;
                                                                    int i549 = ((~i547) & i548) | ((~i548) & i547);
                                                                    int i550 = i549 << 5;
                                                                    return objArr156;
                                                                }
                                                                java.lang.Object PngjBadSignature39 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-820027826);
                                                                if (PngjBadSignature39 == null) {
                                                                    char c21 = (char) ((ViewConfiguration.getZoomControlsTimeout() > j3 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j3 ? 0 : -1)) + 13778);
                                                                    int i551 = (Process.getElapsedCpuTime() > j3 ? 1 : (Process.getElapsedCpuTime() == j3 ? 0 : -1)) + 28;
                                                                    int trimmedLength6 = 1502 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR);
                                                                    byte b77 = $$a[4];
                                                                    byte b78 = b77;
                                                                    java.lang.Object[] objArr157 = new java.lang.Object[1];
                                                                    a(b78, (byte) (b78 + 1), b77, objArr157);
                                                                    PngjBadSignature39 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c21, i551, trimmedLength6, 871379957, false, (String) objArr157[0], new Class[0]);
                                                                }
                                                                long longValue28 = ((Long) ((Method) PngjBadSignature39).invoke(null, null)).longValue();
                                                                long j206 = -24802697;
                                                                long j207 = ((-1527) * longValue28) + (765 * j206);
                                                                long j208 = 764;
                                                                long uptimeMillis4 = ((int) SystemClock.uptimeMillis()) ^ j13;
                                                                long j209 = (uptimeMillis4 | j206) ^ j13;
                                                                long j210 = ((j206 ^ j13) | longValue28) ^ j13;
                                                                long j211 = ((j208 * ((j210 | (((longValue28 ^ j13) | j206) ^ j13)) | j209)) + (((-1528) * (j210 | ((uptimeMillis4 | longValue28) ^ j13))) + (((longValue28 | j209) * j208) + j207))) - 142592519;
                                                                int i552 = ((int) (j211 >> 32)) & ((((~(367577699 | i14)) | (~(i14 | 1804804110))) * 865) + ((~(1804804110 | i)) * 865) + ((((~((-1804804111) | i14)) | 367577699) * (-865)) - 648183588));
                                                                int i553 = ((int) j211) & ((((~((-1426577486) | i14)) | (-1437072734)) * 374) + (((10495248 | 0) * (-374)) - 1212680439));
                                                                if (((i552 & i553) | (i552 ^ i553)) != 0) {
                                                                    java.lang.Object[] objArr158 = {new int[]{(i & (-280)) | (i14 & 279)}, new int[]{(0 | 0) & (~(0 & 0))}, null, new int[]{i}};
                                                                    int i554 = -(-defpackage.a.A(886309140 | (~(i14 | (-148256834))), 160, (((~(i14 | 886309140)) | (-1020672342)) * (-160)) + 860206869, -16));
                                                                    int i555 = (i2 ^ i554) + ((i554 & i2) << 1);
                                                                    int i556 = i555 << 13;
                                                                    int i557 = (i556 & (~i555)) | ((~i556) & i555);
                                                                    int i558 = i557 >>> 17;
                                                                    int i559 = ((~i557) & i558) | ((~i558) & i557);
                                                                    int i560 = i559 << 5;
                                                                    return objArr158;
                                                                }
                                                                java.lang.Object[] objArr159 = {Integer.valueOf(i), obj, Integer.valueOf(i2), 16777216};
                                                                java.lang.Object PngjBadSignature40 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1284430186);
                                                                if (PngjBadSignature40 == null) {
                                                                    PngjBadSignature40 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) Gravity.getAbsoluteGravity(0, 0), 26 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), 1224 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), 1335773997, false, null, new Class[]{cls2, (Class) com.d.e.a.PngjBadCrcException.values((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 26 - (SystemClock.uptimeMillis() > j3 ? 1 : (SystemClock.uptimeMillis() == j3 ? 0 : -1)), 1199 - Color.argb(0, 0, 0, 0)), cls2, cls2});
                                                                }
                                                                java.lang.Object newInstance = ((Constructor) PngjBadSignature40).newInstance(objArr159);
                                                                PngjOutputException = (PngjUnsupportedException + 1) % 128;
                                                                try {
                                                                    int i561 = -((byte) KeyEvent.getModifierMetaStateMask());
                                                                    int i562 = (i561 & 60916) + (i561 | 60916);
                                                                    java.lang.Object[] objArr160 = new java.lang.Object[1];
                                                                    c("輲拌哄䛦㢢⫽ᲇ\u0e85\ue097틫쒞뚷ꡖ驌豟繧", i562, objArr160);
                                                                    Class<?> cls6 = Class.forName((String) objArr160[0]);
                                                                    int i563 = -KeyEvent.getDeadChar(0, 0);
                                                                    java.lang.Object[] objArr161 = new java.lang.Object[1];
                                                                    b(null, (i563 & 127) + (i563 | 127), null, "\u0092\u0081\u0085\u0092\u0090", objArr161);
                                                                    cls6.getMethod((String) objArr161[0], null).invoke(newInstance, null);
                                                                    java.lang.Object[] objArr162 = {new int[]{i}, new int[1], null, new int[]{i}};
                                                                    int myPid = Process.myPid();
                                                                    int i564 = ~(59500058 | myPid);
                                                                    int i565 = (((~(myPid | 975065915)) | (~((-59500059) | myPid)) | 25273344) * 407) + ((i564 | (~((~myPid) | (-975065916))) | 25273344) * 407) + ((940839201 | i564) * (-814)) + 1560995190;
                                                                    int i566 = ((i2 | i565) << 1) - (i565 ^ i2);
                                                                    int i567 = i566 << 13;
                                                                    int i568 = (i567 & (~i566)) | ((~i567) & i566);
                                                                    int i569 = i568 >>> 17;
                                                                    int i570 = (i568 | i569) & (~(i568 & i569));
                                                                    int i571 = i570 << 5;
                                                                    ((int[]) objArr162[1])[0] = (i570 | i571) & (~(i570 & i571));
                                                                    return objArr162;
                                                                } catch (Throwable th5) {
                                                                    Throwable cause3 = th5.getCause();
                                                                    if (cause3 != null) {
                                                                        throw cause3;
                                                                    }
                                                                    throw th5;
                                                                }
                                                            }
                                                        } catch (Throwable th6) {
                                                            Throwable cause4 = th6.getCause();
                                                            if (cause4 != null) {
                                                                throw cause4;
                                                            }
                                                            throw th6;
                                                        }
                                                    }
                                                }
                                                i9 = 0;
                                                if (i9 == 0) {
                                                }
                                            } catch (Throwable th7) {
                                                Throwable cause5 = th7.getCause();
                                                if (cause5 != null) {
                                                    throw cause5;
                                                }
                                                throw th7;
                                            }
                                        }
                                    }
                                }
                                z3 = false;
                                if ((!z3 ? '3' : '8') == '8') {
                                }
                            }
                        }
                        i6 = 1;
                        PngjUnsupportedException = (PngjOutputException + 1) % 128;
                        z2 = false;
                        if (!z2) {
                        }
                    }
                }
                cls = cls5;
                long j752 = j16;
                z = false;
                if (!z) {
                }
                i12 = 0;
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                if (c3 != c4) {
                }
            } catch (Throwable th8) {
                Throwable cause6 = th8.getCause();
                if (cause6 != null) {
                    throw cause6;
                }
                throw th8;
            }
        }

        @Override // com.android.volley.Request
        public final byte[] getBody() {
            PngjOutputException = (PngjUnsupportedException + 61) % 128;
            byte[] bytes = this.PngjException.toString().getBytes();
            int i = PngjOutputException + 17;
            PngjUnsupportedException = i % 128;
            if (i % 2 == 0) {
                return bytes;
            }
            throw null;
        }

        @Override // com.android.volley.Request
        public final String getBodyContentType() {
            int i = (PngjOutputException + 81) % 128;
            PngjUnsupportedException = i;
            PngjOutputException = (i + 59) % 128;
            return "application/json";
        }
    }

    public class PngjException implements Response.Listener {
        public static int PngjBadSignature;
        public static int values;
        private /* synthetic */ PngjPrematureEnding PngjBadCrcException;

        public PngjException(PngjPrematureEnding pngjPrematureEnding) {
            this.PngjBadCrcException = pngjPrematureEnding;
        }

        public static int PngjException() {
            int i = values;
            int i2 = i % 5224792;
            values = i + 1;
            if (i2 != 0) {
                return PngjBadSignature;
            }
            int myPid = Process.myPid();
            PngjBadSignature = myPid;
            return myPid;
        }

        @Override // com.android.volley.Response.Listener
        public final /* synthetic */ void onResponse(java.lang.Object obj) {
            String str = (String) obj;
            "response ?".concat(String.valueOf(str));
            try {
                LibSettings.isSaveCaptured();
            } catch (Exception e) {
                e.printStackTrace();
            }
            PngjInputException.this.new valueOf();
            char[] charArray = str.toCharArray();
            for (int i = 0; i < charArray.length - 1; i += 2) {
                char c = charArray[i];
                int i2 = i + 1;
                charArray[i] = charArray[i2];
                charArray[i2] = c;
            }
            int i3 = 0;
            for (int length = charArray.length - 1; i3 < length; length--) {
                char c2 = charArray[i3];
                charArray[i3] = charArray[length];
                charArray[length] = c2;
                i3++;
            }
            for (int i4 = 0; i4 < charArray.length; i4++) {
                charArray[i4] = (char) (charArray[i4] - 3);
            }
            String str2 = new String(charArray);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("key", str2);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            this.PngjBadCrcException.valueOf(jSONObject);
        }
    }

    public class valueOf {
        private static  byte[] $$a = null;
        private static  int $$b = 0;
        private static  byte[] $$c = null;
        private static  int $$d = 0;
        private static int $10;
        private static int $11;
        private static long PngjBadCrcException;
        private static char[] valueOf;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$e(int i, int i2, int i3) {
            int i4;
            byte[] bArr = $$c;
            int i5 = (i2 * 4) + 4;
            int i6 = i * 3;
            int i7 = i3 + 99;
            byte[] bArr2 = new byte[1 - i6];
            int i8 = 0 - i6;
            if (bArr == null) {
                int i9 = i5;
                i4 = 0;
                i5++;
                i7 += i9;
                bArr2[i4] = (byte) i7;
                if (i4 == i8) {
                    return new String(bArr2, 0);
                }
                i9 = bArr[i5];
                i4++;
                i5++;
                i7 += i9;
                bArr2[i4] = (byte) i7;
                if (i4 == i8) {
                }
            } else {
                i4 = 0;
                bArr2[i4] = (byte) i7;
                if (i4 == i8) {
                }
            }
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            valueOf = new char[]{40115, 40133, 40154, 40143, 40190, 40190, 40155, 40159, 40186, 40185, 40184, 40167, 40107, 40142, 40130, 40165, 40160, 40175, 40170, 40170, 40141, 40134, 40184, 40190, 40164, 40173, 40165, 40190, 40165, 40162, 40167, 40160, 40067, 40157, 40182, 40190, 40190, 40156, 40157, 40189, 40186, 40153, 40156, 40179, 40185, 40186, 40189, 40157, 40147, 40179, 40189, 40191, 40164, 40184, 40178, 40157, 40157, 40184, 40191, 40178, 40153, 40132, 40165, 40188, 40182, 40176, 40158, 40134, 40165, 40154, 40157, 40182, 40190, 40190, 40177, 40018, 40016, 40018, 39981, 39971, 40019, 40029, 40018, 40018, 40024, 40022, 39980, 40022, 40103, 40190, 40188, 40179, 40189, 40191, 40164, 40184, 40178, 40157, 40156, 40189, 40186, 40165, 40184, 40189, 40165, 40133, 40155, 40186, 40153, 40099, 40140, 40164, 40186, 40190, 40178, 40182, 40190, 40186, 40184, 40186, 40143, 40143, 40169, 40044, 40340, 40340, 40060, 40056, 40343, 40161, 40061, 40005, 40098, 40178, 40179, 40190, 40158, 40149, 40138, 40185, 40191, 40183, 40182, 40179, 40177, 40191, 40191, 40147, 40118, 40126, 40128, 40153, 40109, 40102, 40157, 39937, 39945, 39944, 40167, 40173, 39991, 40168, 40160, 39938, 39950, 39944, 39939, 39953, 40184, 39958, 39985, 39946, 39938, 39951, 39990, 39991, 40174, 40166, 40166, 40160, 39946, 40166, 40009, 40003, 40008, 40015, 40013, 40015, 40016, 40023, 40010, 40055, 40022, 39976, 40008, 40010, 40052, 40049, 40053, 40015, 39978, 40073, 40155, 40178, 40176, 40178, 40179, 40182, 40188, 40073, 40128, 39996, 39994, 39985, 39996, 39980, 39969, 39994, 39999, 39990, 39946, 39993, 39970, 39973, 39996, 39986, 40180, 39978, 39983, 39978, 40016, 39969, 39969, 40022, 40020, 40016, 39992, 39993, 39979, 39977, 40018, 39971, 39994};
            PngjBadCrcException = -6670759548625836832L;
        }

        public valueOf() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x00d4, code lost:
        
            0 = $$a[0];
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00d8, code lost:
        
            0 = new java.lang.Object[0];
            $$a[1] = java.lang.Integer.valueOf(0);
            $$a[0] = java.lang.Integer.valueOf(0);
            0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-655108508);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00ee, code lost:
        
            if (0 != null) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00f0, code lost:
        
            0 = (byte) 0;
            0 = 0;
            0 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 31883), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 32, android.text.TextUtils.indexOf(com.karumi.dexter.BuildConfig.FLAVOR, com.karumi.dexter.BuildConfig.FLAVOR, 0) + 1250, 605862879, false, $$e(0, 0, 0), new java.lang.Class[]{0, 0});
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0129, code lost:
        
            $$a[0] = ((java.lang.Character) ((java.lang.reflect.Method) 0).invoke(null, 0)).charValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x012b, code lost:
        
            throw null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(int[] iArr, String str, boolean z, java.lang.Object[] objArr) {
            int i;
            char[] cArr;
            byte[] bArr;
            byte b;
            String str2 = str;
            byte[] bArr2 = str2;
            if (str2 != null) {
                bArr2 = str2.getBytes("ISO-8859-1");
            }
            byte[] bArr3 = bArr2;
            com.d.e.e1 e1Var = new com.d.e.e1();
            int i2 = 0;
            int i3 = iArr[0];
            byte b2 = 1;
            int i4 = iArr[1];
            int i5 = 2;
            int i6 = iArr[2];
            int i7 = iArr[3];
            char[] cArr2 = valueOf;
            Class cls = Integer.TYPE;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i8 = 0;
                while (i8 < length) {
                    int i9 = i5;
                    $10 = ($11 + 1) % 128;
                    try {
                        java.lang.Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                        java.lang.Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(-259747866);
                        if (PngjBadSignature == null) {
                            b = b2;
                            bArr = bArr3;
                            byte b3 = (byte) i2;
                            byte b4 = b3;
                            PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ImageFormat.getBitsPerPixel(i2) + 1), 36 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1313 - (ViewConfiguration.getEdgeSlop() >> 16), 208396893, false, $$e(b3, b4, (byte) (b4 + 1)), new Class[]{cls});
                        } else {
                            bArr = bArr3;
                            b = b2;
                        }
                        cArr3[i8] = ((Character) ((Method) PngjBadSignature).invoke(null, objArr2)).charValue();
                        i8++;
                        i5 = i9;
                        b2 = b;
                        bArr3 = bArr;
                        i2 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            byte[] bArr4 = bArr3;
            byte b5 = b2;
            int i10 = i5;
            char[] cArr4 = new char[i4];
            System.arraycopy(cArr2, i3, cArr4, 0, i4);
            if (bArr4 != null) {
                char[] cArr5 = new char[i4];
                e1Var.PngjBadSignature = 0;
                char c = 0;
                while (true) {
                    int i11 = e1Var.PngjBadSignature;
                    if (i11 >= i4) {
                        cArr4 = cArr5;
                        break;
                    }
                    int i12 = $11;
                    $10 = (i12 + 95) % 128;
                    if (bArr4[i11] == b5) {
                        int i13 = i12 + 91;
                        $10 = i13 % 128;
                        if (i13 % 2 != 0) {
                            break;
                        }
                        java.lang.Object[] objArr3 = {Integer.valueOf(cArr4[i11]), Integer.valueOf(c)};
                        java.lang.Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-655108508);
                        if (PngjBadSignature2 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0) + 31882), 32 - (ViewConfiguration.getScrollBarSize() >> 8), 1250 - (ViewConfiguration.getPressedStateDuration() >> 16), 605862879, false, $$e(b6, b7, b7), new Class[]{cls, cls});
                        }
                        cArr5[i11] = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr3)).charValue();
                    } else {
                        java.lang.Object[] objArr4 = {Integer.valueOf(cArr4[i11]), Integer.valueOf(c)};
                        java.lang.Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(269554740);
                        if (PngjBadSignature3 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) Color.alpha(0), 35 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1598 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -318867057, false, $$e(b8, b9, (byte) (b9 + 3)), new Class[]{cls, cls});
                        }
                        cArr5[i11] = ((Character) ((Method) PngjBadSignature3).invoke(null, objArr4)).charValue();
                    }
                    c = cArr5[e1Var.PngjBadSignature];
                    java.lang.Object[] objArr5 = {e1Var, e1Var};
                    java.lang.Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1060060353);
                    if (PngjBadSignature4 == null) {
                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 36, Color.green(0) + ModuleDescriptor.MODULE_VERSION, -1010806406, false, "g", new Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((Method) PngjBadSignature4).invoke(null, objArr5);
                    $11 = ($10 + 1) % 128;
                    i10 = 2;
                    b5 = 1;
                }
            }
            if (i7 > 0) {
                int i14 = $11 + 41;
                $10 = i14 % 128;
                if (i14 % 2 != 0) {
                    char[] cArr6 = new char[i4];
                    System.arraycopy(cArr4, 0, cArr6, 1, i4);
                    System.arraycopy(cArr6, 0, cArr4, i4 * i7, i7);
                    System.arraycopy(cArr6, i7, cArr4, 0, i4 - i7);
                } else {
                    char[] cArr7 = new char[i4];
                    System.arraycopy(cArr4, 0, cArr7, 0, i4);
                    int i15 = i4 - i7;
                    System.arraycopy(cArr7, 0, cArr4, i15, i7);
                    System.arraycopy(cArr7, i7, cArr4, 0, i15);
                }
            }
            if (z) {
                int i16 = $10 + 71;
                $11 = i16 % 128;
                if (i16 % 2 == 0) {
                    cArr = new char[i4];
                    i = 1;
                    e1Var.PngjBadSignature = 1;
                } else {
                    i = 1;
                    cArr = new char[i4];
                    e1Var.PngjBadSignature = 0;
                }
                while (true) {
                    int i17 = e1Var.PngjBadSignature;
                    if (i17 >= i4) {
                        break;
                    }
                    cArr[i17] = cArr4[(i4 - i17) - i];
                    e1Var.PngjBadSignature = i17 + 1;
                }
                cArr4 = cArr;
            }
            if (i6 > 0) {
                e1Var.PngjBadSignature = 0;
                while (true) {
                    int i18 = e1Var.PngjBadSignature;
                    if (i18 >= i4) {
                        break;
                    }
                    cArr4[i18] = (char) (cArr4[i18] - iArr[2]);
                    e1Var.PngjBadSignature = i18 + 1;
                }
            }
            objArr[0] = new String(cArr4);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
        /* JADX WARN: Type inference failed for: r3v2, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:4:0x0029). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(short s, byte b, short s2, java.lang.Object[] objArr) {
            short s3;
            int i = s2 + 4;
            int i2 = b + 80;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[s + 1];
            if (bArr == null) {
                i2 = s;
                byte[] bArr3 = bArr;
                short s4 = 0;
                int i3 = i;
                i2 += i;
                i = i3 + 1;
                bArr = bArr3;
                s3 = s4;
                bArr2[s3] = (byte) i2;
                if (s3 == s) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                byte b2 = bArr[i];
                byte[] bArr4 = bArr;
                i3 = i;
                i = b2;
                s4 = s3 + 1;
                bArr3 = bArr4;
                i2 += i;
                i = i3 + 1;
                bArr = bArr3;
                s3 = s4;
                bArr2[s3] = (byte) i2;
                if (s3 == s) {
                }
            } else {
                s3 = 0;
                bArr2[s3] = (byte) i2;
                if (s3 == s) {
                }
            }
        }

        private static void c(String str, int i, java.lang.Object[] objArr) {
            char[] cArr;
            if (str != null) {
                $10 = ($11 + 25) % 128;
                cArr = str.toCharArray();
                $11 = ($10 + 57) % 128;
            } else {
                cArr = str;
            }
            com.d.e.ComDeA aVar = new com.d.e.ComDeA();
            char[] values = com.d.e.ComDeA.values(PngjBadCrcException ^ 8332534422373704609L, cArr, i);
            aVar.PngjBadSignature = 4;
            while (true) {
                int i2 = aVar.PngjBadSignature;
                if (i2 >= values.length) {
                    objArr[0] = new String(values, 4, values.length - 4);
                    return;
                }
                int i3 = i2 - 4;
                aVar.PngjBadCrcException = i3;
                try {
                    java.lang.Object[] objArr2 = {Long.valueOf(values[i2] ^ values[i2 % 4]), Long.valueOf(i3), Long.valueOf(PngjBadCrcException)};
                    java.lang.Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1668670198);
                    if (PngjBadSignature == null) {
                        char offsetBefore = (char) TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0);
                        int i4 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 30;
                        int windowTouchSlop = ViewConfiguration.getWindowTouchSlop() >> 8;
                        Class cls = Long.TYPE;
                        PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(offsetBefore, i4, windowTouchSlop, 1617260721, false, "o", new Class[]{cls, cls, cls});
                    }
                    values[i2] = ((Character) ((Method) PngjBadSignature).invoke(null, objArr2)).charValue();
                    java.lang.Object[] objArr3 = {aVar, aVar};
                    java.lang.Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1405973094);
                    if (PngjBadSignature2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (14830 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 27 - ((byte) KeyEvent.getModifierMetaStateMask()), 721 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1356718115, false, $$e(b, b2, (byte) (b2 | 8)), new Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((Method) PngjBadSignature2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }

        public static void init$0() {
            $$a = new byte[]{62, 18, 50, 13, -10, 5, -52, 30, -7, 3, -37, 51, -21, 2, 11, 4, -11, 6, -1};
            $$b = 78;
        }

        public static void init$1() {
            $$c = new byte[]{12, -72, -13, -35};
            $$d = 215;
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1602)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:298)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        /* JADX WARN: Type inference failed for: r14v43 */
        /* JADX WARN: Type inference failed for: r14v54 */
        /* JADX WARN: Type inference failed for: r9v409 */
        /* JADX WARN: Type inference failed for: r9v439 */
        public static java.lang.Object[] valueOf(android.content.Context r53, int r54, int r55, int r56) {
            /*
                Method dump skipped, instructions count: 8701
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.identy.PngjInputException.valueOf.valueOf(android.content.Context, int, int, int):java.lang.Object[]");
        }
    }

    public class values implements RetryPolicy {
        private static  byte[] $$a = null;
        private static  int $$b = 0;
        private static  byte[] $$c = null;
        private static  int $$d = 0;
        private static int $10;
        private static int $11;
        private static char PngjBadCrcException;
        private static int PngjBadSignature;
        private static int PngjOutputException;
        private static int PngjUnsupportedException;
        private static long valueOf;
        private static int values;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$e(short s, byte b, byte b2) {
            int i;
            int i2;
            int i3 = 118 - b2;
            int i4 = 3 - (s * 4);
            byte[] bArr = $$c;
            int i5 = 1 - (b * 4);
            byte[] bArr2 = new byte[i5];
            if (bArr == null) {
                int i6 = i4;
                int i7 = i5;
                i2 = 0;
                int i8 = i4 + (-i7);
                int i9 = i6;
                i3 = i8;
                i4 = i9;
                i = i2;
                int i10 = i4 + 1;
                i2 = i + 1;
                bArr2[i] = (byte) i3;
                if (i2 == i5) {
                    return new String(bArr2, 0);
                }
                i7 = bArr[i10];
                int i11 = i3;
                i6 = i10;
                i4 = i11;
                int i82 = i4 + (-i7);
                int i92 = i6;
                i3 = i82;
                i4 = i92;
                i = i2;
                int i102 = i4 + 1;
                i2 = i + 1;
                bArr2[i] = (byte) i3;
                if (i2 == i5) {
                }
            } else {
                i = 0;
                int i1022 = i4 + 1;
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
            PngjOutputException = 0;
            PngjUnsupportedException = 1;
            PngjBadSignature = 97773836;
            valueOf = -7722231461877240512L;
            values = 30656739;
            PngjBadCrcException = (char) 51427;
        }

        public values() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:123:0x1422, code lost:
        
            if (((((int) 0) & ((((~((-1616165079) | 0)) | (-1783953920)) * 433) + ((((~((-1241575808) | 0)) | (-1616165079)) * (-433)) + (((~((-542378113) | 0)) * 433) - 425623506)))) | (((int) (0 >> 0)) & ((((~((~0) | (-671096316))) | (-2108322727)) * 305) + ((((~((-671096316) | 0)) | 3161) * 305) + 1704617878)))) != 477111747) goto L129;
         */
        /* JADX WARN: Code restructure failed: missing block: B:124:0x153d, code lost:
        
            0 = 0;
            0 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:126:0x1541, code lost:
        
            if (0 >= 28) goto L478;
         */
        /* JADX WARN: Code restructure failed: missing block: B:127:0x1543, code lost:
        
            0 = $$a[0];
            0 = new java.lang.Object[1];
            b(12 - android.text.TextUtils.getCapsMode(0, 0, 0), false, "\uffd1\u0015\u001b\u0015\u0016\u0007\u000f\uffd1\u0004\u000b\u0010\uffd1", 11 - android.text.TextUtils.lastIndexOf(0, '0'), 99 - (~(android.view.ViewConfiguration.getEdgeSlop() >> 16)), 0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:128:0x1577, code lost:
        
            0 = new java.lang.Object[]{((java.lang.String) $$a[0]).concat(java.lang.String.valueOf(0))};
            0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1142218481);
         */
        /* JADX WARN: Code restructure failed: missing block: B:129:0x1582, code lost:
        
            if (0 != null) goto L144;
         */
        /* JADX WARN: Code restructure failed: missing block: B:130:0x1584, code lost:
        
            0 = (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
            0 = 28 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            0 = (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)) + 1446;
            0 = (byte) 0;
            0 = (byte) (0 + 1);
            0 = 0;
            0 = new java.lang.Object[1];
            a(0, 0, (byte) (0 - 1), 0);
            0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(0, 0, 0, 1191464116, false, (java.lang.String) $$a[0], new java.lang.Class[]{java.lang.String.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:131:0x15c8, code lost:
        
            0 = ((java.lang.Long) ((java.lang.reflect.Method) 0).invoke(null, 0)).longValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:132:0x15d5, code lost:
        
            0 = -1718086821;
            0 = -494;
            0 = ((-495) * ((0 | 0) ^ 0)) + ((0 * 0) + (0 * 0));
            0 = 495;
            0 = (((int) android.os.SystemClock.elapsedRealtime()) ^ 0) | 0;
            0 = ((((0 ^ 0) | (((0 ^ 0) | (0 ^ 0)) ^ 0)) * 0) + ((0 * 0) + 0)) - 237911056;
            0 = ((int) (0 >> 0)) & ((((~(2058367739 | 0)) | 536875088) * 302) + (((~(2142633979 | 0)) * (-604)) + ((((~(2142633979 | 0)) | (~((-84266241) | 0))) * (-302)) - 320660478)));
            0 = (int) android.os.SystemClock.uptimeMillis();
            0 = ((int) 0) & (((0 | 1876815806) * 465) + (((236834060 | (~(1674060470 | 0))) * 930) + ((((~(236834060 | 0)) | 1674060470) * (-465)) - 1600531676)));
         */
        /* JADX WARN: Code restructure failed: missing block: B:133:0x1666, code lost:
        
            if (((0 & 0) | (0 ^ 0)) != 0) goto L149;
         */
        /* JADX WARN: Code restructure failed: missing block: B:134:0x1668, code lost:
        
            com.identy.PngjInputException.values.PngjUnsupportedException = (com.identy.PngjInputException.values.PngjOutputException + 91) % 128;
            0 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:136:0x1673, code lost:
        
            0 = (0 - (~(-(-0)))) - 1;
            0 = ((0 | 1) << 1) - (0 ^ 1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:137:0x1672, code lost:
        
            0 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:139:0x15c6, code lost:
        
            0 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:142:0x168c, code lost:
        
            if (0 < 25.2d) goto L155;
         */
        /* JADX WARN: Code restructure failed: missing block: B:143:0x168e, code lost:
        
            0 = com.identy.PngjInputException.values.PngjUnsupportedException;
            com.identy.PngjInputException.values.PngjOutputException = ((0 & 85) + (0 | 85)) % 128;
            0 = new java.lang.Object[]{new int[]{0 ^ 261}, new int[]{0 ^ (0 << 5)}, null, new int[]{0}};
            0 = (0 - (~defpackage.a.A((~(0 | 434817350)) | 599748623, 519, (((~(0 | (-571813898))) | (~(1006631247 | 0))) * (-519)) + ((((~((-599748624) | 0)) | 434817350) * 519) + 965737986), -16))) - 1;
            0 = 0 << 13;
            0 = ((~0) & 0) | ((~0) & 0);
            0 = 0 >>> 17;
            0 = ((~0) & 0) | ((~0) & 0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:144:0x1703, code lost:
        
            return 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:152:0x153b, code lost:
        
            if (((0 & 0) | (0 ^ 0)) == 477111747) goto L137;
         */
        /* JADX WARN: Code restructure failed: missing block: B:341:0x4024, code lost:
        
            if (((0 & 0) | (0 ^ 0)) != 0) goto L424;
         */
        /* JADX WARN: Code restructure failed: missing block: B:343:0x411b, code lost:
        
            0 = new java.lang.Object[]{new int[]{0 ^ 273}, new int[1], null, new int[]{0}};
            0 = android.os.Process.myPid();
            0 = defpackage.a.A((~(0 | (-559154689))) | ((~((~0) | (-439032270))) | 402653253), 168, ((~((-36379017) | 0)) * 168) + ((((~((-595533705) | 0)) | 36379016) * 168) - 973825651), -16);
            0 = 0 * 284;
            0 = -(-(0 * (-282)));
            0 = (0 & 0) + (0 | 0);
            0 = ~0;
            0 = ~(0 | 0);
            0 = ~((0 & 0) | (0 ^ 0));
            0 = ((0 & 0) | (0 ^ 0)) * (-283);
            0 = ~0;
            0 = ((~((0 ^ 0) | (0 & 0))) * 283) + ((0 & 0) + (0 | 0));
            0 = ~0;
            0 = (~(0 | ((0 & 0) | (0 ^ 0)))) * 283;
            0 = (0 ^ 0) + ((0 & 0) << 1);
            0 = 0 << 13;
            0 = (0 & (~0)) | ((~0) & 0);
            0 = 0 ^ (0 >>> 17);
            ((int[]) $$a[1])[0] = 0 ^ (0 << 5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:344:0x41bc, code lost:
        
            return 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:347:0x41c0, code lost:
        
            0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-820027826);
         */
        /* JADX WARN: Code restructure failed: missing block: B:348:0x41c4, code lost:
        
            if (0 != null) goto L439;
         */
        /* JADX WARN: Code restructure failed: missing block: B:349:0x41c6, code lost:
        
            0 = (char) (android.graphics.Color.red(0) + 13779);
            0 = 30 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            0 = 1502 - android.text.TextUtils.getOffsetBefore(0, 0);
            0 = (byte) 0;
            0 = (byte) (0 + 1);
            0 = new java.lang.Object[1];
            a(0, 0, (byte) (0 - 1), 0);
            0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(0, 0, 0, 871379957, false, (java.lang.String) $$a[0], new java.lang.Class[0]);
         */
        /* JADX WARN: Code restructure failed: missing block: B:350:0x4200, code lost:
        
            0 = ((java.lang.Long) ((java.lang.reflect.Method) 0).invoke(null, null)).longValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:351:0x420d, code lost:
        
            0 = 339993277;
            0 = 829;
            0 = (0 * 0) + (0 * 0);
            0 = -828;
            0 = android.os.Process.myTid() ^ 0;
            0 = 0 | 0;
            0 = ((828 * (0 ^ 0)) + ((0 * (0 | 0)) + ((((((0 ^ 0) | (0 ^ 0)) ^ 0) | (((0 | 0) | 0) ^ 0)) * 0) + 0))) - 507388493;
            0 = ((int) (0 >> 0)) & ((((~((~((int) android.os.SystemClock.elapsedRealtime())) | (-621415160))) | 1606314581) * 494) + ((((-536871075) | 0) * 494) - 1808193646));
            0 = (int) android.os.Process.getStartUptimeMillis();
            0 = ((int) 0) & ((((~(0 | (-1081431777))) | ((~((~0) | 1081431776)) | (~(355794633 | 0)))) * 959) + (((((~(355794633 | 0)) | (~(1081431776 | 0))) | (~(0 | (-1081431777)))) * 959) - 816079702));
         */
        /* JADX WARN: Code restructure failed: missing block: B:352:0x429d, code lost:
        
            if (((0 & 0) | (0 ^ 0)) == 0) goto L444;
         */
        /* JADX WARN: Code restructure failed: missing block: B:353:0x429f, code lost:
        
            0 = com.identy.PngjInputException.values.PngjUnsupportedException;
            com.identy.PngjInputException.values.PngjOutputException = (((0 | 7) << 1) - (0 ^ 7)) % 128;
            0 = new java.lang.Object[]{new int[]{0 ^ 279}, new int[]{0 ^ (0 << 5)}, null, new int[]{0}};
            0 = (((((~(0 | (-272639042))) | 705692168) * 235) + ((((~((-300756424) | 0)) | 733809550) * (-470)) + ((((~((-300756424) | 0)) | 733809550) * (-235)) - 9013834))) + 16) + 0;
            0 = 0 << 13;
            0 = (0 | 0) & (~(0 & 0));
            0 = 0 >>> 17;
            0 = (0 | 0) & (~(0 & 0));
         */
        /* JADX WARN: Code restructure failed: missing block: B:354:0x430c, code lost:
        
            return 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:356:0x430e, code lost:
        
            0 = new java.lang.Object[]{java.lang.Integer.valueOf(0), 0, java.lang.Integer.valueOf(0), 16777216};
            0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1284430186);
         */
        /* JADX WARN: Code restructure failed: missing block: B:357:0x4332, code lost:
        
            if (0 != null) goto L448;
         */
        /* JADX WARN: Code restructure failed: missing block: B:358:0x4334, code lost:
        
            0 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ('0' - android.text.AndroidCharacter.getMirror('0')), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 26, 1225 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)), 1335773997, false, null, new java.lang.Class[]{0, (java.lang.Class) com.d.e.a.PngjBadCrcException.values((char) (android.view.ViewConfiguration.getTouchSlop() >> 8), android.text.TextUtils.getOffsetBefore(0, 0) + 25, (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)) + 1198), 0, 0});
         */
        /* JADX WARN: Code restructure failed: missing block: B:359:0x437e, code lost:
        
            0 = ((java.lang.reflect.Constructor) 0).newInstance(0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:362:0x4384, code lost:
        
            0 = new java.lang.Object[1];
            c("䦢\u0897\u1fdc\u137f", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (32543 - android.view.KeyEvent.keyCodeFromString(0)), "\ue5a3䢥꡷鵥", "眨Յភ\uf869쀬钭홀垄잃\uf891\udaacᴾ巃딾輺淅", 0);
            0 = java.lang.Class.forName((java.lang.String) $$a[0]);
            0 = android.view.ViewConfiguration.getLongPressTimeout() >> 16;
            0 = new java.lang.Object[1];
            c("煔쭷濇噪", ((0 | (-942966927)) << 1) - (0 ^ (-942966927)), (char) (27246 - (~(-android.text.TextUtils.indexOf(0, 0)))), "\ue5a3䢥꡷鵥", "븪뚭ᕅ祺\uf670", 0);
            0.getMethod((java.lang.String) $$a[0], null).invoke(0, null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:363:0x43e7, code lost:
        
            0 = new java.lang.Object[]{new int[]{0}, new int[]{0 ^ (0 << 5)}, null, new int[]{0}};
            0 = ((((~((-399775408) | 0)) | 97780390) | (~((-634790567) | 0))) * (-880)) + 919555461;
            0 = (~((-399775408) | 0)) | 634790566;
            0 = ~(0 | 399775407);
            0 = (0 - (~((0 * 880) + (((0 | 0) * (-880)) + 0)))) - 1;
            0 = 0 << 13;
            0 = ((~0) & 0) | ((~0) & 0);
            0 = 0 >>> 17;
            0 = ((~0) & 0) | ((~0) & 0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:364:0x444a, code lost:
        
            return 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:366:0x444b, code lost:
        
            0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:367:0x444c, code lost:
        
            0 = 0.getCause();
         */
        /* JADX WARN: Code restructure failed: missing block: B:368:0x4450, code lost:
        
            if (0 != null) goto L455;
         */
        /* JADX WARN: Code restructure failed: missing block: B:369:0x4452, code lost:
        
            throw 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:370:0x4453, code lost:
        
            throw 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:376:0x4117, code lost:
        
            if (((0 & 0) | (0 ^ 0)) != 0) goto L424;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x055b, code lost:
        
            if (((((int) (0 >> 0)) & defpackage.a.c(((~(196579716 | 0)) | 1614833195) | (~((-1633806128) | 0)), 184, (((~(0 | (-18972933))) | (~(1811412911 | 0))) * (-184)) - 1019427974, 1680089928)) | (((int) 0) & ((((1432018003 | (~(5208406 | 0))) | (~(0 | (-5208407)))) * 45) + ((((~(1432018003 | 0)) | 4872274) * (-45)) + ((((~(1432018003 | 0)) | (-5208407)) * (-90)) - 1687905466))))) != 477111747) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0863, code lost:
        
            if (android.os.Build.VERSION.SDK_INT <= 33) goto L85;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0865, code lost:
        
            0 = new java.lang.Object[1];
            c("\udf1dꇀ◟尯", android.graphics.Color.red(0), (char) ((android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)) + 12068), "\ue5a3䢥꡷鵥", "탹ʀ䂐齗뼾䂟\udae1Ⳍ\u20f3Ꮄ陵\ue521ⶐ\ue418ꥩ饛옞\ue08dൺ\udddd\uddc7\uf1b4䰅海싫귢ᓐꑆ", 0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0888, code lost:
        
            0 = new java.lang.Object[]{(java.lang.String) $$a[0]};
            0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1666380462);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0893, code lost:
        
            if (0 != null) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0895, code lost:
        
            0 = (char) android.text.TextUtils.indexOf(0, 0);
            0 = 28 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16);
            0 = 1448 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
            0 = (byte) (com.identy.PngjInputException.values.$$b & 3);
            0 = 0;
            0 = new java.lang.Object[1];
            a(0, 0, (byte) (0 + 3), 0);
            0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(0, 0, 0, -1614962923, false, (java.lang.String) $$a[0], new java.lang.Class[]{java.lang.String.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x08d3, code lost:
        
            0 = ((java.lang.Long) ((java.lang.reflect.Method) 0).invoke(null, 0)).longValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x08e0, code lost:
        
            0 = -1236063203;
            0 = ((-301) * 0) + (303 * 0);
            0 = 0 ^ 0;
            0 = (int) android.os.SystemClock.elapsedRealtime();
            0 = ((302 * ((((0 ^ 0) | 0) ^ 0) | ((0 | 0) ^ 0))) + (((-604) * (((0 | 0) | 0) ^ 0)) + (((-302) * ((((0 | (0 ^ 0)) | 0) ^ 0) | (((0 | 0) | 0) ^ 0))) + 0))) + 1706551520;
            0 = ((int) (0 >> 0)) & ((((~(803178606 | 0)) | (-169166163)) * 494) + ((((-17681) | 0) * 494) - 894034494));
            0 = (int) java.lang.Runtime.getRuntime().maxMemory();
            0 = ~0;
            0 = ((int) 0) & ((((~(0 | (-386791353))) | (~(0 | (-1824017763)))) * 333) + ((((~((-386791353) | 0)) | (~((-1824017763) | 0))) * 333) + 1097713539));
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0979, code lost:
        
            if (((0 & 0) | (0 ^ 0)) != 1) goto L84;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x097b, code lost:
        
            0 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0a3f, code lost:
        
            if (0 != false) goto L93;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0a44, code lost:
        
            0 = com.identy.PngjInputException.values.PngjOutputException;
            com.identy.PngjInputException.values.PngjUnsupportedException = ((0 & 27) + (0 | 27)) % 128;
            0 = new java.lang.Object[]{new int[]{0}, new int[1], null, new int[]{0}};
            0 = (0 & (-261)) | ((~0) & 260);
            0 = (int) android.os.Process.getStartElapsedRealtime();
            0 = -(-defpackage.a.c((~(0 | (-128143541))) | 27332628, 490, (((-100810913) | (~0)) * (-490)) + 139134199, -1765361156));
            0 = (0 & 0) + (0 | 0);
            0 = 0 << 13;
            0 = (0 | 0) & (~(0 & 0));
            0 = 0 ^ (0 >>> 17);
            0 = 0 << 5;
            ((int[]) $$a[1])[0] = (0 | 0) & (~(0 & 0));
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0ab9, code lost:
        
            return 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x097e, code lost:
        
            0 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0981, code lost:
        
            0 = -android.view.View.getDefaultSize(0, 0);
            0 = ((0 | (-1579264646)) << 1) - (0 ^ (-1579264646));
            0 = android.graphics.Color.red(0);
            0 = new java.lang.Object[1];
            c("窂\ude55ᒡ粢", 0, (char) ((0 ^ 41492) + ((0 & 41492) << 1)), "\ue5a3䢥꡷鵥", "烙╒୶뮸\u2e5f뵧罞糖\ueec7懹盨䧀\udf2f", 0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x09b3, code lost:
        
            0 = new java.lang.Object[]{(java.lang.String) $$a[0]};
            0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x09bb, code lost:
        
            if (0 != null) goto L89;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x09bd, code lost:
        
            0 = (char) (8752 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
            0 = android.text.TextUtils.getTrimmedLength(0) + 24;
            0 = 337 - (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1));
            0 = (byte) 0;
            0 = (byte) (0 + 1);
            0 = new java.lang.Object[1];
            a(0, 0, (byte) (0 - 1), 0);
            0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(0, 0, 0, -598779726, false, (java.lang.String) $$a[0], new java.lang.Class[]{java.lang.String.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x09fb, code lost:
        
            0 = ((java.lang.reflect.Method) 0).invoke(null, 0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0a02, code lost:
        
            0 = -(-(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
            0 = ((0 | 1) << 1) - (0 ^ 1);
            0 = 1 - (android.view.ViewConfiguration.getEdgeSlop() >> 16);
            0 = -(-(android.os.Process.myPid() >> 22));
            0 = (0 & 55) + (0 | 55);
            0 = new java.lang.Object[1];
            b(0, false, "\u0000", 0, 0, 0);
            0 = 0.equals((java.lang.String) $$a[0]);
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x064a, code lost:
        
            if (((0 & 0) | (0 ^ 0)) != 477111747) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x075d, code lost:
        
            if (((0 & 0) | (0 ^ 0)) != (-1032769152)) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x085d, code lost:
        
            if (((0 & 0) | (0 ^ 0)) == 542074309) goto L74;
         */
        /* JADX WARN: Removed duplicated region for block: B:230:0x245c  */
        /* JADX WARN: Removed duplicated region for block: B:232:0x2537  */
        /* JADX WARN: Removed duplicated region for block: B:294:0x383b  */
        /* JADX WARN: Removed duplicated region for block: B:298:0x384f  */
        /* JADX WARN: Removed duplicated region for block: B:480:0x445b  */
        /* JADX WARN: Removed duplicated region for block: B:481:0x445c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static java.lang.Object[] PngjBadCrcException$1eba2e16(int i, java.lang.Object obj, int i2) {
            throw new UnsupportedOperationException("Method not decompiled");
        }

        private static java.lang.Object[] PngjBadCrcException$1eba2e16_REMOVED(int i, java.lang.Object obj, int i2) {
            Throwable cause;
            int i3;
            int i4;
            int i5;
            int i6;
            long j;
            int i7;
            int i8;
            int i9;
            char c;
            long j2;
            String str;
            int i10;
            String[] strArr;
            int i11;
            long j3;
            long j4;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            java.lang.Object[] objArr;
            char c2;
            char c3;
            String[] strArr2;
            int i18;
            java.lang.Object invoke;
            java.lang.Object[] objArr2;
            int parseInt;
            String[] strArr3;
            int i19;
            java.lang.Object obj2;
            java.lang.Object obj3;
            java.lang.Object obj4;
            Class cls = Integer.TYPE;
            try {
                java.lang.Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1085800324);
                if (PngjBadSignature2 == null) {
                    char c4 = (char) (1179 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    int trimmedLength = 44 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR);
                    i3 = 989703296;
                    int mirror = 1140 - AndroidCharacter.getMirror('0');
                    i4 = 5;
                    byte b = (byte) 0;
                    i5 = 16;
                    byte b2 = (byte) (b + 1);
                    i6 = 7;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a(b, b2, (byte) (b2 - 1), objArr3);
                    PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c4, trimmedLength, mirror, -1135046081, false, (String) objArr3[0], new Class[0]);
                } else {
                    i3 = 989703296;
                    i4 = 5;
                    i5 = 16;
                    i6 = 7;
                }
                long longValue = ((Long) ((Method) PngjBadSignature2).invoke(null, null)).longValue();
                long j5 = 986867349;
                j = -1;
                long j6 = j5 ^ j;
                long startUptimeMillis = ((((int) Process.getStartUptimeMillis()) ^ j) | j5) ^ j;
                long j7 = ((-374) * (((j6 | longValue) ^ j) | startUptimeMillis)) + ((-747) * longValue) + (375 * j5);
                long j8 = longValue ^ j;
                long j9 = (374 * (startUptimeMillis | ((j6 | j8) ^ j))) + (748 * ((j5 | j8) ^ j)) + j7 + 938048968;
                int a = defpackage.a.a();
                int i20 = (((~((~a) | 1544272604)) | 37766432) * (-245)) + 724741878;
                int i21 = ~(a | 1544272604);
                i7 = ((int) (j9 >> 32)) & (((i21 | (-1313468281)) * 245) + (i21 * (-245)) + i20);
                int myPid = Process.myPid();
                i8 = ((int) j9) & ((((~((~myPid) | 601752684)) | (-2038979095)) * 56) + (((~((-2038979095) | myPid)) | 601752684) * 56) + 663008205);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause == null) {
                }
            }
            if (((i7 & i8) | (i7 ^ i8)) != 0) {
                java.lang.Object[] objArr4 = {new int[]{0}, new int[]{(0 | 0) & (~(0 & 0))}, null, new int[]{i}};
                int i22 = (~(i & 271)) & (i | 271);
                int c5 = defpackage.a.c(~((~i) | (-44860449)), -948, (((~((-45909041) | i)) | (-988656934)) * (-948)) + 662760977, -994066164);
                int i23 = (i2 - (~((c5 ^ 16) + ((c5 & 16) << 1)))) - 1;
                int i24 = i23 << 13;
                int i25 = ((~i23) & i24) | ((~i24) & i23);
                int i26 = i25 ^ (i25 >>> 17);
                int i27 = i26 << 5;
                return objArr4;
            }
            int i28 = -(ViewConfiguration.getLongPressTimeout() >> 16);
            int i29 = (i28 & 11) + (i28 | 11);
            int makeMeasureSpec = 2 - View.MeasureSpec.makeMeasureSpec(0, 0);
            int i30 = -((byte) KeyEvent.getModifierMetaStateMask());
            int i31 = (i30 & 106) + (i30 | 106);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            b(i29, false, "\r\u0000\r\n\uffc9\u0003￼\r\uffff\u0012￼", makeMeasureSpec, i31, objArr5);
            java.lang.Object[] objArr6 = {(String) objArr5[0]};
            java.lang.Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(547370249);
            if (PngjBadSignature3 == null) {
                char c6 = (char) (8753 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                int scrollBarFadeDuration = 24 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int mirror2 = 384 - AndroidCharacter.getMirror('0');
                i9 = 547370249;
                c = ' ';
                byte b3 = (byte) 0;
                j2 = 0;
                byte b4 = (byte) (b3 + 1);
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                a(b3, b4, (byte) (b4 - 1), objArr7);
                PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c6, scrollBarFadeDuration, mirror2, -598779726, false, (String) objArr7[0], new Class[]{String.class});
            } else {
                i9 = 547370249;
                c = ' ';
                j2 = 0;
            }
            java.lang.Object invoke2 = ((Method) PngjBadSignature3).invoke(null, objArr6);
            if (invoke2 != null) {
                PngjBadCrcException.PngjException.valueOf();
                int gidForName = Process.getGidForName(BuildConfig.FLAVOR) + 1;
                int i32 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                c("뭝엛દ裛", gidForName, (char) (((i32 | 56074) << 1) - (i32 ^ 56074)), "\ue5a3䢥꡷鵥", "扃枖씳츲㐲ݜ", objArr8);
                String str2 = (String) objArr8[0];
                str = BuildConfig.FLAVOR;
                int i33 = 7 - (~(-TextUtils.getOffsetBefore(str, 0)));
                int i34 = 6 - (~(-(ViewConfiguration.getFadingEdgeLength() >> 16)));
                int i35 = -(-Color.rgb(0, 0, 0));
                int i36 = ((i35 | 16777328) << 1) - (i35 ^ 16777328);
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                b(i33, false, "\u0005\u0002\ufffa￼\uffff\t\ufffe�", i34, i36, objArr9);
                java.lang.Object[] objArr10 = {invoke2, new String[]{str2, (String) objArr9[0]}};
                java.lang.Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-344601997);
                if (PngjBadSignature4 == null) {
                    char resolveSize = (char) (26716 - View.resolveSize(0, 0));
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 33;
                    int i37 = 1669 - (SystemClock.elapsedRealtime() > j2 ? 1 : (SystemClock.elapsedRealtime() == j2 ? 0 : -1));
                    byte b5 = (byte) 0;
                    i10 = 22;
                    byte b6 = (byte) (b5 + 1);
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    a(b5, b6, (byte) (b6 - 1), objArr11);
                    PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(resolveSize, maximumDrawingCacheSize, i37, 396011464, false, (String) objArr11[0], new Class[]{String.class, String[].class});
                } else {
                    i10 = 22;
                }
                long longValue2 = ((Long) ((Method) PngjBadSignature4).invoke(null, objArr10)).longValue();
                long j10 = 82191726;
                long j11 = -574;
                long j12 = j10 ^ j;
                long j13 = i;
                long j14 = j13 ^ j;
                long j15 = ((longValue2 ^ j) | j13) ^ j;
                long j16 = ((575 * (((j12 | j13) ^ j) | ((j14 | j10) ^ j))) + (((-575) * (j15 | ((j14 | longValue2) ^ j))) + ((1150 * (((j12 | j14) ^ j) | j15)) + ((j11 * longValue2) + (j11 * j10))))) - 1768783947;
                int i38 = (((~(1320319748 | i)) | (-1324874663)) * 305) + 1704617878;
                int i39 = ~i;
                int i40 = ((int) (j16 >> c)) & ((((~(1320319748 | i39)) | (-116906663)) * 305) + i38);
                int b7 = defpackage.a.b(1855735996);
                int i41 = ((int) j16) & (((b7 | (-1250034775)) * 591) + (((~((-1250034775) | (~b7))) | (-1607706112)) * (-591)) + 1927378222);
                if (((i40 & i41) | (i40 ^ i41)) != 0) {
                    PngjOutputException = (PngjUnsupportedException + 29) % 128;
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    c("弴ꎮꛐ낷", (-794579362) - (~Drawable.resolveOpacity(0, 0)), (char) (47 - (~(-AndroidCharacter.getMirror('0')))), "\ue5a3䢥꡷鵥", "\u0be4吸ண➚ྦ贕ꉒ䕯缵\uf866䗾䣰\uf7bc⋍櫢奼㸔뵑肸₤富땰᭔", objArr12);
                    java.lang.Object[] objArr13 = {(String) objArr12[0]};
                    java.lang.Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i9);
                    if (PngjBadSignature5 == null) {
                        char alpha = (char) (8752 - Color.alpha(0));
                        int alpha2 = 24 - Color.alpha(0);
                        int windowTouchSlop = 336 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        byte b8 = (byte) 0;
                        byte b9 = (byte) (b8 + 1);
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        a(b8, b9, (byte) (b9 - 1), objArr14);
                        PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(alpha, alpha2, windowTouchSlop, -598779726, false, (String) objArr14[0], new Class[]{String.class});
                    }
                    java.lang.Object invoke3 = ((Method) PngjBadSignature5).invoke(null, objArr13);
                    int lastIndexOf = TextUtils.lastIndexOf(str, '0', 0);
                    int i42 = -(ExpandableListView.getPackedPositionForGroup(0) > j2 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j2 ? 0 : -1));
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    c("\ue96a⫇奂礒", ((lastIndexOf | 1) << 1) - (lastIndexOf ^ 1), (char) ((i42 & 4697) + (i42 | 4697)), "\ue5a3䢥꡷鵥", "瀻錣\ude98ﶬ䢐믱ᬋ\uf89a뚜\uf40b慙蔊罈齕ꭧ묱ᩄ\uf399薘堪ཋ㬉띀㋃⍅\ue598릿ꎅ㧖\ue16c", objArr15);
                    java.lang.Object[] objArr16 = {(String) objArr15[0]};
                    java.lang.Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i9);
                    if (PngjBadSignature6 == null) {
                        char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 8752);
                        int indexOf = TextUtils.indexOf(str, str) + 24;
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 336;
                        byte b10 = (byte) 0;
                        byte b11 = (byte) (b10 + 1);
                        obj3 = invoke3;
                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                        a(b10, b11, (byte) (b11 - 1), objArr17);
                        PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(deadChar, indexOf, edgeSlop, -598779726, false, (String) objArr17[0], new Class[]{String.class});
                    } else {
                        obj3 = invoke3;
                    }
                    java.lang.Object invoke4 = ((Method) PngjBadSignature6).invoke(null, objArr16);
                    if (obj3 != null) {
                        java.lang.Object[] objArr18 = {obj3, 42};
                        java.lang.Object PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                        if (PngjBadSignature7 == null) {
                            char indexOf2 = (char) (11038 - TextUtils.indexOf((CharSequence) str, '0', 0));
                            int i43 = 32 - (Process.getElapsedCpuTime() > j2 ? 1 : (Process.getElapsedCpuTime() == j2 ? 0 : -1));
                            int windowTouchSlop2 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1282;
                            byte b12 = (byte) ($$b & 3);
                            byte b13 = b12;
                            obj4 = invoke4;
                            java.lang.Object[] objArr19 = new java.lang.Object[1];
                            a(b12, b13, (byte) (b13 + 3), objArr19);
                            PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf2, i43, windowTouchSlop2, -971849413, false, (String) objArr19[0], new Class[]{String.class, cls});
                        } else {
                            obj4 = invoke4;
                        }
                        long longValue3 = ((Long) ((Method) PngjBadSignature7).invoke(null, objArr18)).longValue();
                        long j17 = -981427695;
                        long j18 = -495;
                        long j19 = j17 ^ j;
                        long j20 = ((j19 | (longValue3 ^ j)) ^ j) | ((j19 | j13) ^ j);
                        long j21 = (496 * (longValue3 | j13)) + ((-496) * (j20 | (((j14 | j17) | longValue3) ^ j))) + (992 * j20) + (j18 * longValue3) + (j18 * j17) + 1637135395;
                        int i44 = ~defpackage.a.a();
                    } else {
                        obj4 = invoke4;
                    }
                    if (obj4 != null) {
                        java.lang.Object[] objArr20 = {obj4, 42};
                        java.lang.Object PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                        if (PngjBadSignature8 == null) {
                            char maximumFlingVelocity = (char) (11039 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0) + 31;
                            int indexOf3 = 1282 - TextUtils.indexOf(str, str, 0);
                            byte b14 = (byte) ($$b & 3);
                            byte b15 = b14;
                            java.lang.Object[] objArr21 = new java.lang.Object[1];
                            a(b14, b15, (byte) (b15 + 3), objArr21);
                            PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(maximumFlingVelocity, makeMeasureSpec2, indexOf3, -971849413, false, (String) objArr21[0], new Class[]{String.class, cls});
                        }
                        long longValue4 = ((Long) ((Method) PngjBadSignature8).invoke(null, objArr20)).longValue();
                        long j22 = -550450016;
                        long j23 = -183;
                        long j24 = j22 ^ j;
                        long j25 = j24 | j14;
                        long j26 = longValue4 ^ j;
                        long j27 = j26 | j14;
                        long j28 = ((-184) * (((j25 | longValue4) ^ j) | ((j27 | j22) ^ j))) + (j23 * longValue4) + (j23 * j22);
                        long j29 = 184;
                        long j30 = (j29 * (j22 | longValue4)) + ((((j24 | j26) ^ j) | (j25 ^ j) | (j27 ^ j)) * j29) + j28 + 1206157716;
                        int i45 = ((int) (j30 >> c)) & ((((~((~Process.myUid()) | (-302000169))) | 1078984960) * 521) + (((~((-302000169) | 0)) * 521) - 796486846));
                        int i46 = (~(522511035 | i39)) | (-1067840256);
                        int i47 = ((int) j30) & ((((~((-369386155) | i)) | (~((-545329221) | i39))) * 502) + (((i46 | 0) * (-502)) - 622122923));
                    }
                    if (obj3 != null) {
                        java.lang.Object[] objArr22 = {obj3, 42};
                        java.lang.Object PngjBadSignature9 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                        if (PngjBadSignature9 == null) {
                            char c7 = (char) (11039 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                            int i48 = (ExpandableListView.getPackedPositionForGroup(0) > j2 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j2 ? 0 : -1)) + 31;
                            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 1282;
                            byte b16 = (byte) ($$b & 3);
                            byte b17 = b16;
                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                            a(b16, b17, (byte) (b17 + 3), objArr23);
                            PngjBadSignature9 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c7, i48, absoluteGravity, -971849413, false, (String) objArr23[0], new Class[]{String.class, cls});
                        }
                        long longValue5 = ((Long) ((Method) PngjBadSignature9).invoke(null, objArr22)).longValue();
                        long j31 = -1091945724;
                        long j32 = -919;
                        long j33 = (j32 * longValue5) + (j32 * j31);
                        long j34 = 920;
                        long j35 = j31 ^ j;
                        long j36 = longValue5 ^ j;
                        long j37 = j35 | j36;
                        long j38 = (int) Runtime.getRuntime().totalMemory();
                        long j39 = j38 ^ j;
                        long j40 = ((((j37 | j39) ^ j) | (((j35 | longValue5) | j38) ^ j) | ((j38 | (j36 | j31)) ^ j)) * j34) + (((j37 ^ j) | ((j35 | j39) ^ j)) * j34) + ((((j37 | j38) ^ j) | (((j36 | j39) | j31) ^ j)) * j34) + j33 + 1747653424;
                        int i49 = ((int) (j40 >> c)) & ((((~((~((int) Process.getStartElapsedRealtime())) | 979228219)) | 16787780) * 191) + ((((~(979228219 | 0)) | 457998191) * 191) - 2087053155));
                        int i50 = ((int) j40) & ((((~(1211322451 | i)) | (~((-225903959) | i39))) * 406) + ((~((-1073762306) | i39)) * (-406)) + ((((~(225903958 | i)) | (~((-137560147) | i39))) * (-406)) - 789276781));
                    }
                    if (obj4 != null) {
                        java.lang.Object[] objArr24 = {obj4, 42};
                        java.lang.Object PngjBadSignature10 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                        if (PngjBadSignature10 == null) {
                            char mirror3 = (char) (11087 - AndroidCharacter.getMirror('0'));
                            int indexOf4 = TextUtils.indexOf((CharSequence) str, '0') + 32;
                            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1282;
                            byte b18 = (byte) ($$b & 3);
                            byte b19 = b18;
                            java.lang.Object[] objArr25 = new java.lang.Object[1];
                            a(b18, b19, (byte) (b19 + 3), objArr25);
                            PngjBadSignature10 = com.d.e.a.PngjBadCrcException.PngjBadSignature(mirror3, indexOf4, keyRepeatDelay, -971849413, false, (String) objArr25[0], new Class[]{String.class, cls});
                        }
                        long longValue6 = ((Long) ((Method) PngjBadSignature10).invoke(null, objArr24)).longValue();
                        long j41 = -1044889366;
                        long j42 = ((-864) * longValue6) + (866 * j41);
                        long j43 = longValue6 ^ j;
                        long startUptimeMillis2 = (int) Process.getStartUptimeMillis();
                        long j44 = startUptimeMillis2 ^ j;
                        long j45 = ((-865) * (j43 | (((j41 ^ j) | j44) ^ j))) + j42;
                        long j46 = 865;
                        long j47 = (j46 * (((j44 | j41) ^ j) | ((j43 | j44) ^ j))) + (((j41 | startUptimeMillis2) ^ j) * j46) + j45 + 1700597066;
                        int i51 = ((int) (j47 >> c)) & ((((-531418403) | (~((-905808009) | i))) * 502) + ((~((-167789859) | i39)) * (-502)) + ((((~((-531418403) | i)) | (-1073597867)) * (-502)) - 1822762074));
                        int i52 = ((int) j47) & ((((~(617405808 | i)) | (~(819820601 | i39)) | (~((-819820602) | i))) * 959) + (((((~(617405808 | i39)) | (~(819820601 | i))) | (~(i39 | (-819820602)))) * 959) - 1242678758));
                    }
                }
            } else {
                str = BuildConfig.FLAVOR;
                i10 = 22;
            }
            int offsetAfter = TextUtils.getOffsetAfter(str, 0);
            int i53 = -(ViewConfiguration.getZoomControlsTimeout() > j2 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j2 ? 0 : -1));
            java.lang.Object[] objArr26 = new java.lang.Object[1];
            c("纤罱였ꚼ", offsetAfter, (char) ((i53 & 1) + (i53 | 1)), "\ue5a3䢥꡷鵥", "칫쬋Ꮣꮖ뎖擧ࠔ≋", objArr26);
            String str3 = (String) objArr26[0];
            java.lang.Object[] objArr27 = new java.lang.Object[1];
            c("솤ꢶ䜢䥭", Color.green(0), (char) (27975 - (~(-(SystemClock.elapsedRealtime() > j2 ? 1 : (SystemClock.elapsedRealtime() == j2 ? 0 : -1))))), "\ue5a3䢥꡷鵥", "徳悇烼⋶뺅\ue1a5", objArr27);
            String str4 = (String) objArr27[0];
            int i54 = 7 - (ExpandableListView.getPackedPositionForGroup(0) > j2 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j2 ? 0 : -1));
            int i55 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
            int i56 = (i55 ^ 5) + ((i55 & 5) << 1);
            int i57 = -(-TextUtils.getCapsMode(str, 0, 0));
            int i58 = (i57 & 114) + (i57 | 114);
            java.lang.Object[] objArr28 = new java.lang.Object[1];
            b(i54, false, "\t\u0007\ufff9\u0006\ufff8\ufff8\u0001", i56, i58, objArr28);
            String str5 = (String) objArr28[0];
            int axisFromString = 8 - MotionEvent.axisFromString(str);
            int i59 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 4;
            int i60 = -View.resolveSizeAndState(0, 0, 0);
            int i61 = (i60 ^ 113) + ((i60 & 113) << 1);
            java.lang.Object[] objArr29 = new java.lang.Object[1];
            b(axisFromString, false, "\u0007\u000b\ufffa\u0007￼\ufff9\ufff7\b\ufffa", i59, i61, objArr29);
            String str6 = (String) objArr29[0];
            int i62 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int i63 = ((i62 | 6) << 1) - (i62 ^ 6);
            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int i64 = (makeMeasureSpec3 * (-405)) + 2035;
            int i65 = ~(((-6) ^ i) | ((-6) & i));
            int i66 = ~i;
            int i67 = (i66 ^ makeMeasureSpec3) | (i66 & makeMeasureSpec3);
            int i68 = ~((i67 & 5) | (i67 ^ 5));
            int i69 = -(-(((i65 & i68) | (i65 ^ i68)) * (-406)));
            int i70 = ((i64 | i69) << 1) - (i64 ^ i69);
            int i71 = ~i;
            java.lang.Object[] objArr30 = new java.lang.Object[1];
            b(i63, true, "\u0004\ufffb\u0004￼\u0001\u0001", (((~((~makeMeasureSpec3) | i)) | (~((i66 ^ 5) | (i66 & 5)))) * 406) + ((i70 - (~(-(-((~(((-6) | i71) | makeMeasureSpec3)) * (-406)))))) - 1), (Process.myPid() >> 22) + 110, objArr30);
            String str7 = (String) objArr30[0];
            int i72 = -(-Drawable.resolveOpacity(0, 0));
            int i73 = ((i72 | 13) << 1) - (i72 ^ 13);
            int i74 = 5 - (~Gravity.getAbsoluteGravity(0, 0));
            int i75 = -TextUtils.getOffsetAfter(str, 0);
            int i76 = (i75 & 102) + (i75 | 102);
            java.lang.Object[] objArr31 = new java.lang.Object[1];
            b(i73, false, "\u0002\u0015\u0007ￎ\u0012\u0003\t\u000e\t\u0014ￍ\u0004\u0005", i74, i76, objArr31);
            String str8 = (String) objArr31[0];
            int i77 = -Color.rgb(0, 0, 0);
            int i78 = ((-16777211) ^ i77) + ((i77 & (-16777211)) << 1);
            int i79 = -View.MeasureSpec.getMode(0);
            java.lang.Object[] objArr32 = new java.lang.Object[1];
            b(i78, false, "\u0005\u0000\u0001\ufffa\u0000", (i79 ^ 3) + ((i79 & 3) << 1), 116 - (~(-(-TextUtils.indexOf(str, str, 0, 0)))), objArr32);
            String str9 = (String) objArr32[0];
            int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >> 16;
            int i80 = (SystemClock.elapsedRealtime() > j2 ? 1 : (SystemClock.elapsedRealtime() == j2 ? 0 : -1));
            java.lang.Object[] objArr33 = new java.lang.Object[1];
            c("웚↽ള퍜", jumpTapTimeout, (char) (((i80 | 23564) << 1) - (i80 ^ 23564)), "\ue5a3䢥꡷鵥", "툍蚠\uda28∃긂嫖", objArr33);
            String str10 = (String) objArr33[0];
            int mode = View.MeasureSpec.getMode(0);
            int indexOf5 = TextUtils.indexOf(str, str, 0);
            java.lang.Object[] objArr34 = new java.lang.Object[1];
            c("黗\u1778횺ꮣ", mode, (char) ((41942 ^ indexOf5) + ((indexOf5 & 41942) << 1)), "\ue5a3䢥꡷鵥", "륰⸣", objArr34);
            String str11 = (String) objArr34[0];
            int i81 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i82 = -Color.blue(0);
            java.lang.Object[] objArr35 = new java.lang.Object[1];
            c("⇽閷༝\ue026", i81, (char) (((i82 | 9743) << 1) - (i82 ^ 9743)), "\ue5a3䢥꡷鵥", "\ufae4ᤤ爜☴언囼藍\ue6a6\ud9a7ዡ喝㢵텃\uf737짨죩", objArr35);
            String str12 = (String) objArr35[0];
            java.lang.Object[] objArr36 = new java.lang.Object[1];
            c("ꌷ\u1ad9ؤ빴", Color.argb(0, 0, 0, 0), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "\ue5a3䢥꡷鵥", "糺䯖쑁࡞봥듺൸薍ⓘ了", objArr36);
            String str13 = (String) objArr36[0];
            int i83 = -ExpandableListView.getPackedPositionType(j2);
            java.lang.Object[] objArr37 = new java.lang.Object[1];
            b(((i83 | 8) << 1) - (i83 ^ 8), false, "\uffff\u0004\u0006\u0003\ufff7\u0006\ufff5\u0002", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), TextUtils.indexOf(str, str, 0) + 114, objArr37);
            String str14 = (String) objArr37[0];
            java.lang.Object[] objArr38 = new java.lang.Object[1];
            c("₴㈹ꊏ貞", ViewConfiguration.getScrollBarSize() >> 8, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "\ue5a3䢥꡷鵥", "끰\uf5f4쑁\uec38吽젻籮쏽䑶쇝凨\ueccc", objArr38);
            String str15 = (String) objArr38[0];
            java.lang.Object[] objArr39 = new java.lang.Object[1];
            c("\udd02铪ꤹ㟆", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (50856 - TextUtils.lastIndexOf(str, '0', 0)), "\ue5a3䢥꡷鵥", "⬲떭ュⱫ↲䩽촭诵ฒ龘\ue2bd齽欼\ue373", objArr39);
            String str16 = (String) objArr39[0];
            java.lang.Object[] objArr40 = new java.lang.Object[1];
            c("朁뵗ꈌꔦ", 213735270 - (~(-(KeyEvent.getMaxKeyCode() >> 16))), (char) View.getDefaultSize(0, 0), "\ue5a3䢥꡷鵥", "烈퀻㠴\uefd9薧뮠䈵", objArr40);
            String str17 = (String) objArr40[0];
            int absoluteGravity2 = 1992143738 - Gravity.getAbsoluteGravity(0, 0);
            int i84 = -(ViewConfiguration.getZoomControlsTimeout() > j2 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j2 ? 0 : -1));
            java.lang.Object[] objArr41 = new java.lang.Object[1];
            c("稘붳콶\ue876", absoluteGravity2, (char) (((i84 | 1) << 1) - (i84 ^ 1)), "\ue5a3䢥꡷鵥", "◥ꀆ覆冄趬Ɽꃭ", objArr41);
            String str18 = (String) objArr41[0];
            int i85 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int i86 = (i85 & 7) + (i85 | 7);
            int resolveSizeAndState = View.resolveSizeAndState(0, 0, 0);
            int i87 = (resolveSizeAndState ^ 5) + ((resolveSizeAndState & 5) << 1);
            int i88 = -Color.argb(0, 0, 0, 0);
            int i89 = ((i88 | 107) << 1) - (i88 ^ 107);
            java.lang.Object[] objArr42 = new java.lang.Object[1];
            b(i86, true, "\u000f\u0004\u0007\f\u000eￎ\u0000", i87, i89, objArr42);
            String str19 = (String) objArr42[0];
            int indexOf6 = TextUtils.indexOf(str, str) + 2;
            int i90 = (ViewConfiguration.getGlobalActionKeyTimeout() > j2 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j2 ? 0 : -1));
            int i91 = -((byte) KeyEvent.getModifierMetaStateMask());
            int i92 = (i91 & 120) + (i91 | 120);
            java.lang.Object[] objArr43 = new java.lang.Object[1];
            b(indexOf6, false, "\u0000\u0000", i90, i92, objArr43);
            String str20 = (String) objArr43[0];
            int i93 = -Drawable.resolveOpacity(0, 0);
            java.lang.Object[] objArr44 = new java.lang.Object[1];
            b((i93 & 20) + (i93 | 20), true, "\t\b\t\u0003\ufffa￼\ufff6\u0000\ufff8\u0004\u0001\ufff4�\t\ufffe\f\ufff4\t\u0007\ufff6", MotionEvent.axisFromString(str) + 3, 112 - (~(ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr44);
            String str21 = (String) objArr44[0];
            int indexOf7 = TextUtils.indexOf(str, str, 0, 0);
            int i94 = (indexOf7 & 6) + (indexOf7 | 6);
            int i95 = -(-(ViewConfiguration.getTouchSlop() >> 8));
            java.lang.Object[] objArr45 = new java.lang.Object[1];
            b(i94, false, "\ufffa\b\t\u0007\ufff6\ufff8", ((i95 | 1) << 1) - (i95 ^ 1), 112 - TextUtils.indexOf((CharSequence) str, '0'), objArr45);
            String str22 = (String) objArr45[0];
            int i96 = -(-(ViewConfiguration.getZoomControlsTimeout() > j2 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j2 ? 0 : -1)));
            int i97 = (i96 ^ (-1)) + (i96 << 1);
            int i98 = -Color.rgb(0, 0, 0);
            java.lang.Object[] objArr46 = new java.lang.Object[1];
            c("ῴ꺠䀙\uf2a0", i97, (char) ((((-16736192) | i98) << 1) - (i98 ^ (-16736192))), "\ue5a3䢥꡷鵥", "狔僙", objArr46);
            String str23 = (String) objArr46[0];
            int i99 = 15 - (~View.resolveSize(0, 0));
            int i100 = -(-TextUtils.indexOf((CharSequence) str, '0', 0, 0));
            java.lang.Object[] objArr47 = new java.lang.Object[1];
            b(i99, true, "\b\ufffb\u0010\uffff\n\uffff\u0004\ufff7\t\t\u000b\n\ufff7\n\tￃ", ((i100 | 10) << 1) - (i100 ^ 10), TextUtils.getOffsetAfter(str, 0) + 112, objArr47);
            String str24 = (String) objArr47[0];
            int i101 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            java.lang.Object[] objArr48 = new java.lang.Object[1];
            c("ॎ㬇ꊖ𧻓", ((-1774516470) & i101) + (i101 | (-1774516470)), (char) (Process.myTid() >> 22), "\ue5a3䢥꡷鵥", "ܾ的煆壾뇙屶吮揁ᴥ", objArr48);
            String str25 = (String) objArr48[0];
            int i102 = 9 - (~(-View.combineMeasuredStates(0, 0)));
            int i103 = -Color.argb(0, 0, 0, 0);
            int i104 = (i103 ^ 5) + ((i103 & 5) << 1);
            int i105 = -(Process.myPid() >> 22);
            int i106 = (i105 ^ 107) + ((i105 & 107) << 1);
            java.lang.Object[] objArr49 = new java.lang.Object[1];
            b(i102, false, "\u000b￼\u000f\u0003\uffd1\u000f\r￼\ufffe\u0000", i104, i106, objArr49);
            String str26 = (String) objArr49[0];
            int i107 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            java.lang.Object[] objArr50 = new java.lang.Object[1];
            c("\udec6\uf083㻢猵", (((-487554081) | i107) << 1) - (i107 ^ (-487554081)), (char) (Process.myPid() >> 22), "\ue5a3䢥꡷鵥", "ﴶ\uddd0ꎻ쵍⻮ฦⅥ㼜ᘚ㭞숀", objArr50);
            String str27 = (String) objArr50[0];
            int i108 = -TextUtils.indexOf(str, str);
            int i109 = (i108 & 11) + (i108 | 11);
            int scrollBarSize = ViewConfiguration.getScrollBarSize() >> 8;
            int i110 = scrollBarSize * 881;
            int i111 = (i110 ^ 5286) + ((i110 & 5286) << 1);
            int i112 = ~scrollBarSize;
            int i113 = ~((i112 ^ (-7)) | (i112 & (-7)));
            int i114 = ~((i112 & i) | (i112 ^ i));
            int i115 = (i114 & i113) | (i113 ^ i114);
            int i116 = ~(((-7) ^ i) | ((-7) & i));
            int i117 = ((i115 & i116) | (i115 ^ i116)) * (-880);
            int i118 = ((i111 | i117) << 1) - (i117 ^ i111);
            int i119 = ~scrollBarSize;
            int i120 = ~((i119 & i66) | (i119 ^ i66));
            int i121 = (i120 & 6) | (i120 ^ 6);
            int i122 = (scrollBarSize & i) | (scrollBarSize ^ i);
            int i123 = ~i122;
            int i124 = (((i118 - (~(((i121 & i123) | (i121 ^ i123)) * (-880)))) - 1) - (~(-(-((~i122) * 880))))) - 1;
            int normalizeMetaState = KeyEvent.normalizeMetaState(0);
            int i125 = (normalizeMetaState ^ 113) + ((normalizeMetaState & 113) << 1);
            java.lang.Object[] objArr51 = new java.lang.Object[1];
            b(i109, true, "\ufff9\u0003\ufffe\f\u0003\n\u0004\ufffb\u0003\ufffe\ufff4", i124, i125, objArr51);
            String str28 = (String) objArr51[0];
            int gidForName2 = 14 - Process.getGidForName(str);
            int packedPositionType = 1 - ExpandableListView.getPackedPositionType(j2);
            int i126 = -(-TextUtils.indexOf((CharSequence) str, '0', 0));
            int i127 = ((i126 | 113) << 1) - (i126 ^ 113);
            java.lang.Object[] objArr52 = new java.lang.Object[1];
            b(gidForName2, true, "\u000b\u0005￼\u0004\uffff\ufff5�\ufffb\b\ufff5\ufffa\u0004\uffff\r\u0004", packedPositionType, i127, objArr52);
            String str29 = (String) objArr52[0];
            int i128 = -(-View.MeasureSpec.getSize(0));
            int i129 = (i128 ^ 14) + ((i128 & 14) << 1);
            int i130 = -(Process.getElapsedCpuTime() > j2 ? 1 : (Process.getElapsedCpuTime() == j2 ? 0 : -1));
            int i131 = (i130 & 7) + (i130 | 7);
            int tapTimeout = ViewConfiguration.getTapTimeout() >> 16;
            int i132 = (tapTimeout ^ com.karumi.dexter.R.styleable.AppCompatTheme_tooltipFrameBackground) + ((tapTimeout & com.karumi.dexter.R.styleable.AppCompatTheme_tooltipFrameBackground) << 1);
            java.lang.Object[] objArr53 = new java.lang.Object[1];
            b(i129, true, "\ufff7\u0001￼\n\u0001\b\u0006\uffff\u0002\ufff5\u0000\f\u0006\ufff2", i131, i132, objArr53);
            String[] strArr4 = {str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, (String) objArr53[0]};
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 11;
            int i133 = -TextUtils.indexOf(str, str, 0);
            int i134 = (i133 ^ 2) + ((i133 & 2) << 1);
            int i135 = (Process.getElapsedCpuTime() > j2 ? 1 : (Process.getElapsedCpuTime() == j2 ? 0 : -1));
            int i136 = (i135 & 106) + (i135 | 106);
            java.lang.Object[] objArr54 = new java.lang.Object[1];
            b(touchSlop, false, "\r\u0000\r\n\uffc9\u0003￼\r\uffff\u0012￼", i134, i136, objArr54);
            java.lang.Object[] objArr55 = {(String) objArr54[0]};
            java.lang.Object PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i9);
            if (PngjBadSignature11 == null) {
                char c8 = (char) (8752 - (ExpandableListView.getPackedPositionForGroup(0) > j2 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j2 ? 0 : -1)));
                int maxKeyCode = 24 - (KeyEvent.getMaxKeyCode() >> 16);
                int offsetAfter2 = TextUtils.getOffsetAfter(str, 0) + 336;
                byte b20 = (byte) 0;
                byte b21 = (byte) (b20 + 1);
                strArr = strArr4;
                i11 = i71;
                java.lang.Object[] objArr56 = new java.lang.Object[1];
                a(b20, b21, (byte) (b21 - 1), objArr56);
                PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c8, maxKeyCode, offsetAfter2, -598779726, false, (String) objArr56[0], new Class[]{String.class});
            } else {
                strArr = strArr4;
                i11 = i71;
            }
            String str30 = (String) ((Method) PngjBadSignature11).invoke(null, objArr55);
            if (str30 != null) {
                PngjOutputException = (PngjUnsupportedException + 39) % 128;
                java.lang.Object[] objArr57 = new java.lang.Object[1];
                c("뭝엛દ裛", View.MeasureSpec.makeMeasureSpec(0, 0), (char) (56073 - (~(-(-(ExpandableListView.getPackedPositionForGroup(0) > j2 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j2 ? 0 : -1)))))), "\ue5a3䢥꡷鵥", "扃枖씳츲㐲ݜ", objArr57);
                String str31 = (String) objArr57[0];
                int i137 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                int i138 = ((i137 | 8) << 1) - (i137 ^ 8);
                int i139 = -Color.rgb(0, 0, 0);
                java.lang.Object[] objArr58 = new java.lang.Object[1];
                b(i138, false, "\u0005\u0002\ufffa￼\uffff\t\ufffe�", (i139 & (-16777209)) + (i139 | (-16777209)), 111 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr58);
                String[] strArr5 = {str31, (String) objArr58[0]};
                int i140 = 0;
                while (true) {
                    if (i140 >= 2) {
                        break;
                    }
                    if (str30.contains(strArr5[i140])) {
                        int i141 = (204780723 & i11) | (204780723 ^ i11);
                        int i142 = ~((i141 & (-776090917)) | (i141 ^ (-776090917)));
                        int i143 = ~(((-201339937) & i) | ((-201339937) ^ i));
                        int i144 = (-243885196) - (~(-(-(((i142 & i143) | (i142 ^ i143)) * (-302)))));
                        int i145 = (~(((-574750981) & i) | ((-574750981) ^ i))) * (-604);
                        int i146 = (i144 & i145) + (i145 | i144);
                        int i147 = ~(((-776090917) ^ i) | ((-776090917) & i));
                        int i148 = -(-(((i147 & 3440787) | (3440787 ^ i147)) * 302));
                        int i149 = ((i146 | i148) << 1) - (i148 ^ i146);
                        int valueOf2 = PngjBadCrcException.PngjException.valueOf();
                        int i150 = ~valueOf2;
                        int i151 = ((((-1415828271) ^ valueOf2) | ((-1415828271) & valueOf2)) * (-979)) + (((~((i150 & (-606504452)) | ((-606504452) ^ i150))) * 979) - 693135202);
                        int i152 = ~(((-606504452) ^ valueOf2) | ((-606504452) & valueOf2));
                        int i153 = ~valueOf2;
                        int i154 = ~((i153 & (-1415828271)) | (i153 ^ (-1415828271)));
                        int i155 = -(-(((i154 & i152) | (i152 ^ i154)) * 979));
                        if (i149 <= (i151 ^ i155) + ((i155 & i151) << 1)) {
                            int i156 = PngjOutputException;
                            PngjUnsupportedException = (((i156 | 39) << 1) - (i156 ^ 39)) % 128;
                            int i157 = -TextUtils.indexOf((CharSequence) str, '0');
                            java.lang.Object[] objArr59 = new java.lang.Object[1];
                            c("弴ꎮꛐ낷", (i157 & (-794579362)) + (i157 | (-794579362)), (char) (Process.myPid() >> 22), "\ue5a3䢥꡷鵥", "\u0be4吸ண➚ྦ贕ꉒ䕯缵\uf866䗾䣰\uf7bc⋍櫢奼㸔뵑肸₤富땰᭔", objArr59);
                            java.lang.Object[] objArr60 = {(String) objArr59[0]};
                            java.lang.Object PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i9);
                            if (PngjBadSignature12 == null) {
                                char offsetBefore = (char) (TextUtils.getOffsetBefore(str, 0) + 8752);
                                int minimumFlingVelocity = 24 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                int rgb = Color.rgb(0, 0, 0) + 16777552;
                                byte b22 = (byte) 0;
                                byte b23 = (byte) (b22 + 1);
                                java.lang.Object[] objArr61 = new java.lang.Object[1];
                                a(b22, b23, (byte) (b23 - 1), objArr61);
                                PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature(offsetBefore, minimumFlingVelocity, rgb, -598779726, false, (String) objArr61[0], new Class[]{String.class});
                            }
                            java.lang.Object invoke5 = ((Method) PngjBadSignature12).invoke(null, objArr60);
                            int i158 = (-(-(ViewConfiguration.getZoomControlsTimeout() > j2 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j2 ? 0 : -1)))) - 1;
                            int windowTouchSlop3 = ViewConfiguration.getWindowTouchSlop() >> 8;
                            int valueOf3 = PngjBadCrcException.PngjException.valueOf();
                            int i159 = windowTouchSlop3 * (-445);
                            int i160 = ((i159 | (-2090165)) << 1) - (i159 ^ (-2090165));
                            int i161 = ~((~windowTouchSlop3) | (-4698));
                            int i162 = ~valueOf3;
                            int i163 = ((i161 | (~(((-4698) ^ i162) | (i162 & (-4698))))) * 446) + i160;
                            int i164 = ~windowTouchSlop3;
                            int i165 = ~((i164 ^ 4697) | (i164 & 4697));
                            int i166 = (windowTouchSlop3 & (-4698)) | ((-4698) ^ windowTouchSlop3);
                            int i167 = ~((i166 & valueOf3) | (i166 ^ valueOf3));
                            int i168 = ((i167 & i165) | (i165 ^ i167)) * 446;
                            java.lang.Object[] objArr62 = new java.lang.Object[1];
                            c("\ue96a⫇奂礒", i158, (char) (((((i163 | i168) << 1) - (i168 ^ i163)) - (~(-(-((~(i164 | (-4698))) * 446))))) - 1), "\ue5a3䢥꡷鵥", "瀻錣\ude98ﶬ䢐믱ᬋ\uf89a뚜\uf40b慙蔊罈齕ꭧ묱ᩄ\uf399薘堪ཋ㬉띀㋃⍅\ue598릿ꎅ㧖\ue16c", objArr62);
                            java.lang.Object[] objArr63 = {(String) objArr62[0]};
                            java.lang.Object PngjBadSignature13 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i9);
                            if (PngjBadSignature13 == null) {
                                char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 8753);
                                int resolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 24;
                                int i169 = 337 - (Process.getElapsedCpuTime() > j2 ? 1 : (Process.getElapsedCpuTime() == j2 ? 0 : -1));
                                byte b24 = (byte) 0;
                                byte b25 = (byte) (b24 + 1);
                                obj2 = invoke5;
                                java.lang.Object[] objArr64 = new java.lang.Object[1];
                                a(b24, b25, (byte) (b25 - 1), objArr64);
                                PngjBadSignature13 = com.d.e.a.PngjBadCrcException.PngjBadSignature(modifierMetaStateMask, resolveSizeAndState2, i169, -598779726, false, (String) objArr64[0], new Class[]{String.class});
                            } else {
                                obj2 = invoke5;
                            }
                            java.lang.Object invoke6 = ((Method) PngjBadSignature13).invoke(null, objArr63);
                            if (obj2 != null) {
                                java.lang.Object[] objArr65 = {obj2, 42};
                                java.lang.Object PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                                if (PngjBadSignature14 == null) {
                                    char c9 = (char) (11040 - (ViewConfiguration.getZoomControlsTimeout() > j2 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j2 ? 0 : -1)));
                                    int i170 = 32 - (SystemClock.elapsedRealtime() > j2 ? 1 : (SystemClock.elapsedRealtime() == j2 ? 0 : -1));
                                    int rgb2 = Color.rgb(0, 0, 0) + 16778498;
                                    byte b26 = (byte) ($$b & 3);
                                    byte b27 = b26;
                                    java.lang.Object[] objArr66 = new java.lang.Object[1];
                                    a(b26, b27, (byte) (b27 + 3), objArr66);
                                    PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c9, i170, rgb2, -971849413, false, (String) objArr66[0], new Class[]{String.class, cls});
                                }
                                long longValue7 = ((Long) ((Method) PngjBadSignature14).invoke(null, objArr65)).longValue();
                                long j48 = -1312578804;
                                long j49 = -115;
                                long j50 = (j49 * longValue7) + (j49 * j48);
                                long startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                                long j51 = ((-116) * ((((startElapsedRealtime ^ j) | j48) | longValue7) ^ j)) + j50;
                                long j52 = 116;
                                long j53 = longValue7 ^ j;
                                long j54 = (j52 * ((((j48 ^ j) | j53) ^ j) | ((j53 | startElapsedRealtime) ^ j))) + ((j48 | startElapsedRealtime) * j52) + j51 + 1968286504;
                                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                            }
                            if (invoke6 != null) {
                                java.lang.Object[] objArr67 = {invoke6, 42};
                                java.lang.Object PngjBadSignature15 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                                if (PngjBadSignature15 == null) {
                                    char maxKeyCode2 = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 11039);
                                    int resolveSizeAndState3 = 31 - View.resolveSizeAndState(0, 0, 0);
                                    int maxKeyCode3 = (KeyEvent.getMaxKeyCode() >> 16) + 1282;
                                    byte b28 = (byte) ($$b & 3);
                                    byte b29 = b28;
                                    java.lang.Object[] objArr68 = new java.lang.Object[1];
                                    a(b28, b29, (byte) (b29 + 3), objArr68);
                                    PngjBadSignature15 = com.d.e.a.PngjBadCrcException.PngjBadSignature(maxKeyCode2, resolveSizeAndState3, maxKeyCode3, -971849413, false, (String) objArr68[0], new Class[]{String.class, cls});
                                }
                                long longValue8 = ((Long) ((Method) PngjBadSignature15).invoke(null, objArr67)).longValue();
                                long j55 = 311449932;
                                long j56 = -721;
                                long j57 = (j56 * longValue8) + (j56 * j55);
                                long maxMemory = (int) Runtime.getRuntime().maxMemory();
                                long j58 = j55 ^ j;
                                long j59 = longValue8 ^ j;
                                long j60 = (j55 | longValue8) ^ j;
                                long j61 = (722 * (((j58 | longValue8) ^ j) | ((j59 | j55) ^ j))) + ((-1444) * (j60 | ((j55 | maxMemory) ^ j) | ((longValue8 | maxMemory) ^ j))) + (1444 * ((maxMemory ^ j) | ((j58 | j59) ^ j) | j60)) + j57 + 344257768;
                                int i171 = ((int) (j61 >> c)) & ((((~((-1513136148) | i)) | (~(1589574399 | i66)) | (~((-75909737) | i))) * 192) + (((~(76438252 | i66)) | 1513136147) * (-384)) + (((528516 | i66) * (-192)) - 1788177110));
                                int c10 = ((int) j61) & defpackage.a.c(~((-139460610) | i), -1504, (((~((-1213378658) | i)) | 1073918048) * 1504) + 1320243365, 1272456624);
                            }
                        }
                    } else {
                        i140++;
                    }
                }
            }
            java.lang.Object[] objArr69 = new java.lang.Object[1];
            c("贐㹋왼坉", 2084457356 - (~(-Color.green(0))), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), "\ue5a3䢥꡷鵥", "䣝䗗\u0091\ufe1eᐑ斟ਖ਼\udfe3\ud9b2䊵陝⽝\ud982₅䋤\uf5ec墷ꊀ툵ퟍ孪桠ᶛ", objArr69);
            java.lang.Object[] objArr70 = {(String) objArr69[0]};
            java.lang.Object PngjBadSignature16 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-936033973);
            if (PngjBadSignature16 == null) {
                char packedPositionType2 = (char) (29467 - ExpandableListView.getPackedPositionType(j2));
                int combineMeasuredStates = 39 - View.combineMeasuredStates(0, 0);
                int indexOf8 = TextUtils.indexOf(str, str) + 432;
                byte b30 = (byte) 0;
                byte b31 = (byte) (b30 + 1);
                java.lang.Object[] objArr71 = new java.lang.Object[1];
                a(b30, b31, (byte) (b31 - 1), objArr71);
                PngjBadSignature16 = com.d.e.a.PngjBadCrcException.PngjBadSignature(packedPositionType2, combineMeasuredStates, indexOf8, 886713584, false, (String) objArr71[0], new Class[]{String.class});
            }
            long longValue9 = ((Long) ((Method) PngjBadSignature16).invoke(null, objArr70)).longValue();
            long j62 = 105941368;
            long j63 = 319;
            long j64 = j63 * j62;
            long j65 = -317;
            long j66 = (j65 * longValue9) + j64;
            long j67 = -318;
            long j68 = longValue9 ^ j;
            long j69 = i;
            long j70 = ((j68 | (((j62 ^ j) | j69) ^ j)) * j67) + j66;
            long j71 = 318;
            long j72 = j69 ^ j;
            long j73 = ((((((j68 | j72) | j62) ^ j) | (((j62 | longValue9) | j69) ^ j)) * j71) + (((((j68 | j69) ^ j) | (((j72 | j62) | longValue9) ^ j)) * j71) + j70)) - 1254654016;
            int i172 = ((int) (j73 >> c)) & ((((~((-1548609465) | i)) | 1481401776) * 116) + (((-111383054) | i) * 116) + (((~((-44175366) | i66)) * (-116)) - 2072279902));
            int startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
            int i173 = ((int) j73) & ((((~(startElapsedRealtime2 | (-1082140038))) | (~((~startElapsedRealtime2) | (-812008041))) | (~((-151584769) | startElapsedRealtime2))) * 867) + (((~((-963592809) | startElapsedRealtime2)) | 812008040 | (~((-1894148078) | startElapsedRealtime2))) * (-1734)) + ((((~((-963592809) | 0)) | (~((-1894148078) | 0))) * (-867)) - 1972008908));
            long j74 = (i172 & i173) | (i172 ^ i173);
            int i174 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
            int i175 = ((i174 | (-1291446460)) << 1) - (i174 ^ (-1291446460));
            int keyRepeatTimeout = ViewConfiguration.getKeyRepeatTimeout() >> 16;
            java.lang.Object[] objArr72 = new java.lang.Object[1];
            c("䐾ؗꎳ৾", i175, (char) (((keyRepeatTimeout | 65187) << 1) - (keyRepeatTimeout ^ 65187)), "\ue5a3䢥꡷鵥", "쾰뉚퀿㶫Ū䈊㙎ئ\ue24f挶ꘫᎴ㱺謤笎潾\ueca4", objArr72);
            java.lang.Object[] objArr73 = {(String) objArr72[0]};
            java.lang.Object PngjBadSignature17 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-936033973);
            if (PngjBadSignature17 == null) {
                char windowTouchSlop4 = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 29467);
                int keyCodeFromString = KeyEvent.keyCodeFromString(str) + 39;
                int packedPositionGroup = 432 - ExpandableListView.getPackedPositionGroup(j2);
                byte b32 = (byte) 0;
                byte b33 = (byte) (b32 + 1);
                j3 = j74;
                java.lang.Object[] objArr74 = new java.lang.Object[1];
                a(b32, b33, (byte) (b33 - 1), objArr74);
                PngjBadSignature17 = com.d.e.a.PngjBadCrcException.PngjBadSignature(windowTouchSlop4, keyCodeFromString, packedPositionGroup, 886713584, false, (String) objArr74[0], new Class[]{String.class});
            } else {
                j3 = j74;
            }
            long longValue10 = ((Long) ((Method) PngjBadSignature17).invoke(null, objArr73)).longValue();
            long j75 = 571047010;
            long j76 = ((-903) * longValue10) + (905 * j75);
            long j77 = j75 ^ j;
            long startUptimeMillis3 = (int) Process.getStartUptimeMillis();
            long j78 = startUptimeMillis3 ^ j;
            long j79 = ((-1808) * (((j77 | startUptimeMillis3) ^ j) | ((j78 | longValue10) ^ j))) + j76;
            long j80 = 904;
            long j81 = longValue10 ^ j;
            long j82 = j78 | j75;
            long j83 = ((j80 * ((((j77 | longValue10) ^ j) | ((j81 | startUptimeMillis3) ^ j)) | (j82 ^ j))) + ((((((j77 | j81) | startUptimeMillis3) ^ j) | ((j82 | longValue10) ^ j)) * j80) + j79)) - 1719759658;
            int i176 = ((int) (j83 >> c)) & ((((~(1453034704 | i)) | (-15808294)) * 519) + (((~(1459339253 | i66)) | (~((-6304550) | i))) * (-519)) + ((((~(15808293 | i66)) | 1453034704) * 519) - 1453938172));
            int i177 = ((int) j83) & (((~((-174084761) | i)) * 345) + (((~(1955573063 | i66)) | 344261893) * 345) + (((~(1955573063 | i)) | 174084760) * 345) + 484646344);
            long j84 = (i176 & i177) | (i176 ^ i177);
            if (j3 > j2) {
                int i178 = (PngjUnsupportedException + 97) % 128;
                PngjOutputException = i178;
                if (j84 > j2 && j84 - 3 < j3) {
                    PngjUnsupportedException = (((i178 | 17) << 1) - (i178 ^ 17)) % 128;
                    java.lang.Object[] objArr75 = {new int[]{0}, new int[]{0 ^ (0 << 5)}, null, new int[]{i}};
                    int i179 = (~(i & 247)) & (i | 247);
                    int i180 = (((~(i | (-907752458))) | 25428292 | (~(126813516 | i66))) * 904) + (((~((-101385225) | i)) | (~(i66 | 933180749))) * 904) + ((((~((-126813517) | i)) | (~(907752457 | i66))) * (-1808)) - 559600147);
                    int i181 = (i180 & 16) + (i180 | 16) + i2;
                    int i182 = i181 << 13;
                    int i183 = (i182 | i181) & (~(i181 & i182));
                    int i184 = i183 >>> 17;
                    int i185 = ((~i183) & i184) | ((~i184) & i183);
                    return objArr75;
                }
            }
            int i186 = -(-(KeyEvent.getMaxKeyCode() >> 16));
            java.lang.Object[] objArr76 = new java.lang.Object[1];
            c("贐㹋왼坉", ((i186 | 2084457357) << 1) - (i186 ^ 2084457357), (char) KeyEvent.getDeadChar(0, 0), "\ue5a3䢥꡷鵥", "䣝䗗\u0091\ufe1eᐑ斟ਖ਼\udfe3\ud9b2䊵陝⽝\ud982₅䋤\uf5ec墷ꊀ툵ퟍ孪桠ᶛ", objArr76);
            java.lang.Object[] objArr77 = {(String) objArr76[0]};
            java.lang.Object PngjBadSignature18 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-936033973);
            if (PngjBadSignature18 == null) {
                char indexOf9 = (char) (TextUtils.indexOf((CharSequence) str, '0', 0, 0) + 29468);
                int mode2 = View.MeasureSpec.getMode(0) + 39;
                int size = 432 - View.MeasureSpec.getSize(0);
                byte b34 = (byte) 0;
                byte b35 = (byte) (b34 + 1);
                java.lang.Object[] objArr78 = new java.lang.Object[1];
                a(b34, b35, (byte) (b35 - 1), objArr78);
                PngjBadSignature18 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf9, mode2, size, 886713584, false, (String) objArr78[0], new Class[]{String.class});
            }
            long longValue11 = ((Long) ((Method) PngjBadSignature18).invoke(null, objArr77)).longValue();
            long j85 = 390874792;
            long j86 = ((-667) * longValue11) + ((-1335) * j85);
            long j87 = longValue11 ^ j;
            long elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
            long j88 = j85 | elapsedCpuTime2;
            long j89 = ((668 * (j88 | j87)) + ((1336 * (j85 | ((j87 | elapsedCpuTime2) ^ j))) + (((-668) * (j87 | (j88 ^ j))) + j86))) - 1539587440;
            int i187 = ((int) (j89 >> c)) & ((((~(747028573 | i66)) | 1363683746) * 672) + (((~((-747028574) | i)) | (~(2110712311 | i66))) * (-672)) + ((((~((-2110712312) | i)) | (-747028574)) * 672) - 638183382));
            int c11 = ((int) j89) & defpackage.a.c((~(((int) SystemClock.elapsedRealtime()) | 290440223)) | 1141903744, 490, ((1432343967 | (~0)) * (-490)) - 139953273, -715484636);
            long j90 = (i187 & c11) | (i187 ^ c11);
            int i188 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int i189 = (i188 ^ 4) + ((i188 & 4) << 1);
            int i190 = -Process.getGidForName(str);
            int i191 = -(SystemClock.elapsedRealtime() > j2 ? 1 : (SystemClock.elapsedRealtime() == j2 ? 0 : -1));
            int valueOf4 = PngjBadCrcException.PngjException.valueOf();
            int i192 = (i191 * (-958)) - 93884;
            int i193 = ~valueOf4;
            int i194 = ~(((-99) ^ i193) | ((-99) & i193));
            int i195 = ~i191;
            int i196 = ~((i195 ^ valueOf4) | (i195 & valueOf4));
            int i197 = (i194 ^ i196) | (i196 & i194);
            int i198 = ~((i193 ^ i191) | (i193 & i191));
            int i199 = ((i197 ^ i198) | (i197 & i198)) * 959;
            int i200 = (i192 ^ i199) + ((i199 & i192) << 1);
            int i201 = (~((i191 ^ 98) | (i191 & 98))) * (-959);
            int i202 = (i200 ^ i201) + ((i201 & i200) << 1);
            int i203 = ~i191;
            int i204 = ~((i203 & i193) | (i203 ^ i193));
            int i205 = ~(((-99) ^ valueOf4) | ((-99) & valueOf4));
            int i206 = (i204 & i205) | (i204 ^ i205);
            int i207 = ~(i191 | valueOf4);
            int i208 = (i202 - (~(-(-(((i206 & i207) | (i206 ^ i207)) * 959))))) - 1;
            java.lang.Object[] objArr79 = new java.lang.Object[1];
            b(i189, false, "\u001bￔ\t\n", i190, i208, objArr79);
            java.lang.Object[] objArr80 = {(String) objArr79[0]};
            java.lang.Object PngjBadSignature19 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-936033973);
            if (PngjBadSignature19 == null) {
                char c12 = (char) (29467 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                int i209 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 39;
                int i210 = 433 - (Process.getElapsedCpuTime() > j2 ? 1 : (Process.getElapsedCpuTime() == j2 ? 0 : -1));
                byte b36 = (byte) 0;
                byte b37 = (byte) (b36 + 1);
                j4 = j90;
                java.lang.Object[] objArr81 = new java.lang.Object[1];
                a(b36, b37, (byte) (b37 - 1), objArr81);
                PngjBadSignature19 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c12, i209, i210, 886713584, false, (String) objArr81[0], new Class[]{String.class});
            } else {
                j4 = j90;
            }
            long longValue12 = ((Long) ((Method) PngjBadSignature19).invoke(null, objArr80)).longValue();
            long j91 = -270489382;
            long j92 = (131 * longValue12) + ((-129) * j91);
            long j93 = 130;
            long j94 = longValue12 ^ j;
            long elapsedRealtime = (int) SystemClock.elapsedRealtime();
            long j95 = ((((j94 | (elapsedRealtime ^ j)) | j91) ^ j) * j93) + j92;
            long j96 = j94 | j91;
            long j97 = ((((((j91 ^ j) | longValue12) ^ j) | ((j96 | elapsedRealtime) ^ j)) * j93) + (((-260) * (j96 ^ j)) + j95)) - 878223266;
            int i211 = (~((-1258885804) | i66)) | 167838379;
            int i212 = ((int) (j97 >> c)) & ((((~(1269388031 | i)) | (~((-1091047425) | i66))) * 502) + (((i211 | 0) * (-502)) - 207253252));
            int startElapsedRealtime3 = (int) Process.getStartElapsedRealtime();
            int i213 = ((int) j97) & ((((~((~startElapsedRealtime3) | 663527718)) | 42467622) * 420) + ((~(663527718 | startElapsedRealtime3)) * 420) + 1709976569);
            long j98 = (i212 & i213) | (i212 ^ i213);
            if (j4 > j2 && j98 > j2 && j98 + 100 < j4) {
                PngjOutputException = (PngjUnsupportedException + 93) % 128;
                java.lang.Object[] objArr82 = {new int[]{i ^ 248}, new int[]{((~0) & 0) | ((~0) & 0)}, null, new int[]{i}};
                int i214 = (((~(i | 544103778)) | (~(490462195 | i66))) * 627) + (((~((-490462196) | i)) | 544103778) * (-627)) + (((-541328385) | i) * (-627)) + 1167369348;
                int i215 = (i214 & 16) + (i214 | 16) + i2;
                int i216 = i215 << 13;
                int i217 = (i216 | i215) & (~(i215 & i216));
                int i218 = i217 >>> 17;
                int i219 = (i217 | i218) & (~(i217 & i218));
                int i220 = i219 << 5;
                return objArr82;
            }
            int keyCodeFromString2 = KeyEvent.keyCodeFromString(str);
            int i221 = (keyCodeFromString2 & 7) + (keyCodeFromString2 | 7);
            int i222 = -Color.alpha(0);
            int i223 = (i222 & 3) + (i222 | 3);
            int i224 = -(ExpandableListView.getPackedPositionForChild(0, 0) > j2 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j2 ? 0 : -1));
            int i225 = (i224 ^ 108) + ((i224 & 108) << 1);
            java.lang.Object[] objArr83 = new java.lang.Object[1];
            b(i221, true, "\u0012\f\uffc8\u0006\ufffe\r\f", i223, i225, objArr83);
            String str32 = (String) objArr83[0];
            int i226 = (-601613306) - (ExpandableListView.getPackedPositionForChild(0, 0) > j2 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j2 ? 0 : -1));
            int i227 = -(-TextUtils.lastIndexOf(str, '0', 0));
            java.lang.Object[] objArr84 = new java.lang.Object[1];
            c("݂␜⻜귈", i226, (char) ((i227 ^ 1) + ((i227 & 1) << 1)), "\ue5a3䢥꡷鵥", "뢶뺂ᇑ\ueeee謯鯽\ue4d6\ue141\uf8dd\ue488㒭", objArr84);
            String str33 = (String) objArr84[0];
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 12;
            int tapTimeout2 = 2 - (ViewConfiguration.getTapTimeout() >> 16);
            int i228 = -(-(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
            int i229 = ((i228 | 104) << 1) - (i228 ^ 104);
            java.lang.Object[] objArr85 = new java.lang.Object[1];
            b(longPressTimeout, true, "\u0010ￌ\u000b\u0006\uffff\u0010ￌ\n\u0002\u0011\u0010\u0016", tapTimeout2, i229, objArr85);
            String str34 = (String) objArr85[0];
            int indexOf10 = TextUtils.indexOf((CharSequence) str, '0');
            int i230 = indexOf10 * (-523);
            int i231 = ((i230 | 263) << 1) - (i230 ^ 263);
            int i232 = ~indexOf10;
            int i233 = ~((i232 & 1) | (i232 ^ 1));
            int i234 = (-2) | indexOf10;
            int i235 = ~i234;
            int i236 = (i235 & i233) | (i233 ^ i235);
            int i237 = ~((-2) | i);
            int i238 = ((i236 ^ i237) | (i237 & i236)) * 262;
            int i239 = (i231 ^ i238) + ((i238 & i231) << 1);
            int i240 = (~i234) * (-786);
            int i241 = (i239 & i240) + (i240 | i239);
            int i242 = (~((-2) | i11)) | i233;
            int i243 = ~((indexOf10 & (-2)) | ((-2) ^ indexOf10));
            int i244 = i242 ^ i243;
            java.lang.Object[] objArr86 = new java.lang.Object[1];
            c("쪂綐㘌紁", (((i243 & i242) | i244) * 262) + i241, (char) View.MeasureSpec.getSize(0), "\ue5a3䢥꡷鵥", "斡ጧᑧဳ㿟\ue405詹ꩶ䙖뜣氰\uf22f", objArr86);
            String str35 = (String) objArr86[0];
            int i245 = -Color.red(0);
            java.lang.Object[] objArr87 = new java.lang.Object[1];
            c("ᤕ頷杖秗", (i245 & 1452816153) + (i245 | 1452816153), (char) (Process.myTid() >> 22), "\ue5a3䢥꡷鵥", "恰ꯁ\uf496虧ｭతљԳዶ钒驡", objArr87);
            String str36 = (String) objArr87[0];
            int i246 = -TextUtils.lastIndexOf(str, '0', 0, 0);
            int i247 = ((i246 | 4) << 1) - (i246 ^ 4);
            int i248 = -View.getDefaultSize(0, 0);
            int i249 = i248 * (-381);
            int i250 = (i249 & 960) + (i249 | 960);
            int i251 = (~i248) * (-191);
            int i252 = (i250 ^ i251) + ((i251 & i250) << 1);
            int i253 = -(-(((~((i ^ 5) | (i & 5))) | i248) * 191));
            int i254 = (i252 & i253) + (i253 | i252);
            int i255 = ~i248;
            int i256 = ~((i255 & 5) | (i255 ^ 5));
            int i257 = ~((i66 ^ 5) | (i66 & 5));
            java.lang.Object[] objArr88 = new java.lang.Object[1];
            b(i247, true, "\u000f\n\u0003\u0014\uffd0", (((i256 & i257) | (i256 ^ i257)) * 191) + i254, TextUtils.indexOf((CharSequence) str, '0', 0, 0) + 102, objArr88);
            String str37 = (String) objArr88[0];
            int keyCodeFromString3 = KeyEvent.keyCodeFromString(str);
            java.lang.Object[] objArr89 = new java.lang.Object[1];
            b((keyCodeFromString3 & 4) + (keyCodeFromString3 | 4), true, "\t\u001a\u000bￕ", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 3, 96 - Color.green(0), objArr89);
            String[] strArr6 = {str32, str33, str34, str35, str36, str37, (String) objArr89[0]};
            int i258 = i6;
            int i259 = 0;
            while (true) {
                if (i259 >= i258) {
                    i12 = 0;
                    break;
                }
                java.lang.Object[] objArr90 = {strArr6[i259]};
                java.lang.Object PngjBadSignature20 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1492900309);
                if (PngjBadSignature20 == null) {
                    char indexOf11 = (char) ((-1) - TextUtils.indexOf((CharSequence) str, '0', 0));
                    int i260 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 34;
                    int blue = 397 - Color.blue(0);
                    byte b38 = (byte) 0;
                    byte b39 = (byte) (b38 + 1);
                    strArr3 = strArr6;
                    i19 = i259;
                    java.lang.Object[] objArr91 = new java.lang.Object[1];
                    a(b38, b39, (byte) (b39 - 1), objArr91);
                    PngjBadSignature20 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf11, i260, blue, 1542146960, false, (String) objArr91[0], new Class[]{String.class});
                } else {
                    strArr3 = strArr6;
                    i19 = i259;
                }
                long longValue13 = ((Long) ((Method) PngjBadSignature20).invoke(null, objArr90)).longValue();
                long j99 = 1615594315;
                long j100 = 471;
                long j101 = (j100 * longValue13) + (j100 * j99);
                long j102 = -470;
                long j103 = ((j99 | longValue13) * j102) + j101;
                long j104 = longValue13 ^ j;
                long myPid2 = Process.myPid();
                long j105 = (((myPid2 ^ j) | j99) | longValue13) ^ j;
                long j106 = ((470 * ((((j104 | j99) | myPid2) ^ j) | j105)) + (((((((j99 ^ j) | j104) ^ j) | ((j104 | myPid2) ^ j)) | j105) * j102) + j103)) - 1980173094;
                if (((((int) (j106 >> c)) & ((((~(420476198 | i66)) | 1722813137 | (~((-285586727) | i))) * 676) + (((~(1857702609 | i66)) | (-2143289336)) * 676) + (((2143289335 | i) * (-676)) - 407158646))) | (((int) j106) & (((~(i66 | 693718040)) * 886) + ((693718040 | (~((-2130944451) | i66))) * (-1772)) + (((~(2130944450 | i)) | 5786648 | (~((-1443013059) | i66))) * 886) + 1996634455))) != 0) {
                    i12 = ((i19 | 90) << 1) - (i19 ^ 90);
                    break;
                }
                i259 = i19 + 1;
                strArr6 = strArr3;
                i258 = 7;
            }
            if (i12 != 0) {
                PngjUnsupportedException = (PngjOutputException + 39) % 128;
                java.lang.Object[] objArr92 = {new int[]{(i12 & i66) | ((~i12) & i)}, new int[1], null, new int[]{i}};
                int i261 = ~defpackage.a.a();
                int i262 = (((~(i261 | (-940572678))) | 16920576) * 241) + (((~((-979109038) | i261)) | 38536360) * (-241)) + 1949002621;
                int i263 = i262 * (-756);
                int i264 = ~i262;
                int i265 = (i264 & 16) | (i264 ^ 16);
                int i266 = ((((i11 | 16) * (-757)) + ((12128 ^ i263) + ((i263 & 12128) << 1))) - (~(-(-((~((i265 & i) | (i265 ^ i))) * 1514))))) - 1;
                int i267 = ~i262;
                int i268 = ~((-17) | i267);
                int i269 = ~(i267 | i66);
                int i270 = (i269 & i268) | (i268 ^ i269);
                int i271 = ~((i262 & 16) | (i262 ^ 16) | i);
                int i272 = ((i271 & i270) | (i270 ^ i271)) * 757;
                int i273 = -(-((i266 & i272) + (i272 | i266)));
                int i274 = (i2 & i273) + (i273 | i2);
                int i275 = (i274 << 13) ^ i274;
                int i276 = i275 >>> 17;
                int i277 = (i275 | i276) & (~(i275 & i276));
                ((int[]) objArr92[1])[0] = i277 ^ (i277 << 5);
                return objArr92;
            }
            try {
                byte modifierMetaStateMask2 = (byte) KeyEvent.getModifierMetaStateMask();
                int i278 = (modifierMetaStateMask2 & 860597673) + (modifierMetaStateMask2 | 860597673);
                int i279 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                java.lang.Object[] objArr93 = new java.lang.Object[1];
                c("ꣽ䮭ᔳ쇟", i278, (char) ((i279 ^ 57109) + ((i279 & 57109) << 1)), "\ue5a3䢥꡷鵥", "썽\udb04䟱亿̊䷾᎗䢠⫢㓆ꦡ㬍辱", objArr93);
                try {
                    java.lang.Object[] objArr94 = {(String) objArr93[0]};
                    java.lang.Object PngjBadSignature21 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i9);
                    if (PngjBadSignature21 == null) {
                        char resolveSizeAndState4 = (char) (View.resolveSizeAndState(0, 0, 0) + 8752);
                        int scrollDefaultDelay = 24 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 336;
                        byte b40 = (byte) 0;
                        byte b41 = (byte) (b40 + 1);
                        java.lang.Object[] objArr95 = new java.lang.Object[1];
                        a(b40, b41, (byte) (b41 - 1), objArr95);
                        PngjBadSignature21 = com.d.e.a.PngjBadCrcException.PngjBadSignature(resolveSizeAndState4, scrollDefaultDelay, keyRepeatTimeout2, -598779726, false, (String) objArr95[0], new Class[]{String.class});
                    }
                    invoke = ((Method) PngjBadSignature21).invoke(null, objArr94);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            } catch (Exception unused) {
            }
            try {
                if (invoke != null) {
                    int size2 = View.MeasureSpec.getSize(0);
                    int i280 = (size2 ^ 11) + ((size2 & 11) << 1);
                    int i281 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                    int i282 = ((i281 | 6) << 1) - (i281 ^ 6);
                    int i283 = -(ViewConfiguration.getGlobalActionKeyTimeout() > j2 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j2 ? 0 : -1));
                    int i284 = (i283 & 113) + (i283 | 113);
                    java.lang.Object[] objArr96 = new java.lang.Object[1];
                    b(i280, true, "�\u0005\u0004\ufff7\u000f\ufff9\ufffa\u0005\u0003\u0004\ufffb", i282, i284, objArr96);
                    try {
                        java.lang.Object[] objArr97 = {invoke, new String[]{(String) objArr96[0]}};
                        java.lang.Object PngjBadSignature22 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-344601997);
                        if (PngjBadSignature22 == null) {
                            char maxKeyCode4 = (char) (26716 - (KeyEvent.getMaxKeyCode() >> 16));
                            int offsetAfter3 = TextUtils.getOffsetAfter(str, 0) + 33;
                            int combineMeasuredStates2 = 1668 - View.combineMeasuredStates(0, 0);
                            byte b42 = (byte) 0;
                            byte b43 = (byte) (b42 + 1);
                            java.lang.Object[] objArr98 = new java.lang.Object[1];
                            a(b42, b43, (byte) (b43 - 1), objArr98);
                            PngjBadSignature22 = com.d.e.a.PngjBadCrcException.PngjBadSignature(maxKeyCode4, offsetAfter3, combineMeasuredStates2, 396011464, false, (String) objArr98[0], new Class[]{String.class, String[].class});
                        }
                        long longValue14 = ((Long) ((Method) PngjBadSignature22).invoke(null, objArr97)).longValue();
                        long j107 = -1042974189;
                        long j108 = 370;
                        long j109 = (j108 * longValue14) + (j108 * j107);
                        long j110 = -369;
                        long j111 = (j107 ^ j) | j72;
                        long j112 = ((369 * (((((longValue14 ^ j) | j107) ^ j) | ((j107 | j69) ^ j)) | ((j111 | longValue14) ^ j))) + ((j110 * (longValue14 | (j111 ^ j))) + ((((j107 | longValue14) | j72) * j110) + j109))) - 643618032;
                        int i285 = (int) (j112 >> c);
                        int elapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                        if (((i285 & defpackage.a.c((~(elapsedRealtime2 | (-1797955253))) | (~((-1059785633) | elapsedRealtime2)), -1324, (((~elapsedRealtime2) | (-2133565365)) * 1324) - 818884594, 1008173496)) | (((int) j112) & defpackage.a.c(2135686965 | i66, -828, (((~(2135686965 | i66)) | 722053920) * (-828)) - 1754753727, 1177718104))) == 0) {
                            int i286 = PngjOutputException;
                            PngjUnsupportedException = ((i286 ^ 13) + ((i286 & 13) << 1)) % 128;
                            i13 = 0;
                            if (i13 != 0) {
                                PngjOutputException = (PngjUnsupportedException + 107) % 128;
                                java.lang.Object[] objArr99 = {new int[]{i13 ^ i}, new int[1], null, new int[]{i}};
                                int myUid = Process.myUid();
                                int i287 = ~myUid;
                                int i288 = (~((-900195201) | i287)) | 900047360;
                                int i289 = ~(myUid | (-134222934));
                                int i290 = ((~(i287 | (-134370774))) * 713) + (i289 * 1426) + ((i288 | i289) * (-713)) + 1606535832;
                                int valueOf5 = PngjBadCrcException.PngjException.valueOf();
                                int i291 = (i290 * (-167)) - 2672;
                                int i292 = ~i290;
                                int i293 = ~(((-17) ^ i292) | ((-17) & i292));
                                int i294 = ~i290;
                                int i295 = ~valueOf5;
                                int i296 = -(-((i293 | (~(i294 | i295))) * 168));
                                int i297 = (i291 ^ i296) + ((i291 & i296) << 1);
                                int i298 = (i292 & (-17)) | ((-17) ^ i292);
                                int i299 = (~((i298 & valueOf5) | (i298 ^ valueOf5))) * 168;
                                int i300 = (i297 ^ i299) + ((i299 & i297) << 1);
                                int i301 = ~(((-17) & i295) | ((-17) ^ i295));
                                int i302 = ~((i290 & (-17)) | ((-17) ^ i290));
                                int i303 = (i302 & i301) | (i301 ^ i302);
                                int i304 = (i294 ^ 16) | (i294 & 16);
                                int i305 = ~((valueOf5 & i304) | (i304 ^ valueOf5));
                                int i306 = ((i305 & i303) | (i303 ^ i305)) * 168;
                                int i307 = (i300 & i306) + (i306 | i300);
                                int i308 = (i2 ^ i307) + ((i307 & i2) << 1);
                                int i309 = i308 << 13;
                                int i310 = ((~i308) & i309) | ((~i309) & i308);
                                int i311 = i310 >>> 17;
                                int i312 = (i310 | i311) & (~(i310 & i311));
                                int i313 = i312 << 5;
                                ((int[]) objArr99[1])[0] = (i312 | i313) & (~(i312 & i313));
                                PngjOutputException = (PngjUnsupportedException + 55) % 128;
                                return objArr99;
                            }
                            java.lang.Object[] objArr100 = new java.lang.Object[1];
                            c("ꣽ䮭ᔳ쇟", 860597672 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 57109), "\ue5a3䢥꡷鵥", "썽\udb04䟱亿̊䷾᎗䢠⫢㓆ꦡ㬍辱", objArr100);
                            java.lang.Object[] objArr101 = {(String) objArr100[0]};
                            java.lang.Object PngjBadSignature23 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i9);
                            if (PngjBadSignature23 == null) {
                                char lastIndexOf2 = (char) (8751 - TextUtils.lastIndexOf(str, '0', 0));
                                int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 24;
                                int gidForName3 = 335 - Process.getGidForName(str);
                                byte b44 = (byte) 0;
                                byte b45 = (byte) (b44 + 1);
                                java.lang.Object[] objArr102 = new java.lang.Object[1];
                                a(b44, b45, (byte) (b45 - 1), objArr102);
                                PngjBadSignature23 = com.d.e.a.PngjBadCrcException.PngjBadSignature(lastIndexOf2, touchSlop2, gidForName3, -598779726, false, (String) objArr102[0], new Class[]{String.class});
                            }
                            java.lang.Object invoke7 = ((Method) PngjBadSignature23).invoke(null, objArr101);
                            if (invoke7 != null) {
                                int i314 = -(-Color.alpha(0));
                                int i315 = (i314 ^ 11) + ((i314 & 11) << 1);
                                int i316 = 6 - (~(-(SystemClock.elapsedRealtime() > j2 ? 1 : (SystemClock.elapsedRealtime() == j2 ? 0 : -1))));
                                int i317 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                int i318 = ((i317 | 112) << 1) - (i317 ^ 112);
                                java.lang.Object[] objArr103 = new java.lang.Object[1];
                                b(i315, true, "�\u0005\u0004\ufff7\u000f\ufff9\ufffa\u0005\u0003\u0004\ufffb", i316, i318, objArr103);
                                java.lang.Object[] objArr104 = {invoke7, new String[]{(String) objArr103[0]}};
                                java.lang.Object PngjBadSignature24 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-344601997);
                                if (PngjBadSignature24 == null) {
                                    char packedPositionGroup2 = (char) (26716 - ExpandableListView.getPackedPositionGroup(j2));
                                    int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 33;
                                    int modifierMetaStateMask3 = ((byte) KeyEvent.getModifierMetaStateMask()) + 1669;
                                    byte b46 = (byte) 0;
                                    byte b47 = (byte) (b46 + 1);
                                    java.lang.Object[] objArr105 = new java.lang.Object[1];
                                    a(b46, b47, (byte) (b47 - 1), objArr105);
                                    PngjBadSignature24 = com.d.e.a.PngjBadCrcException.PngjBadSignature(packedPositionGroup2, scrollBarFadeDuration2, modifierMetaStateMask3, 396011464, false, (String) objArr105[0], new Class[]{String.class, String[].class});
                                }
                                long longValue15 = ((Long) ((Method) PngjBadSignature24).invoke(null, objArr104)).longValue();
                                long j113 = -528806672;
                                long j114 = j113 ^ j;
                                long j115 = (j114 | j69) ^ j;
                                long j116 = ((-280) * (((j114 | longValue15) ^ j) | j115)) + ((-139) * longValue15) + (141 * j113);
                                long j117 = 140;
                                long j118 = longValue15 ^ j;
                                long j119 = ((j117 * (((((j114 | j118) | j69) ^ j) | (((j114 | j72) | longValue15) ^ j)) | (((j118 | j72) | j113) ^ j))) + (((j115 | ((j118 | j69) ^ j)) * j117) + j116)) - 1157785549;
                                int maxMemory2 = (int) Runtime.getRuntime().maxMemory();
                                int i319 = ((int) (j119 >> c)) & ((((~(maxMemory2 | 1317535526)) | 1235593634) * 70) + ((~(1336410022 | maxMemory2)) * 70) + ((((~(119690884 | maxMemory2)) | 1216719138) * (-140)) - 612994570));
                                int i320 = ((int) j119) & ((((~((-790740782) | i66)) | 153168129 | (~((-8912977) | i))) * 140) + (((~((-646485629) | i66)) | 8912976) * (-280)) + (((-646485629) | i) * 140) + 155563493);
                                if (((i319 & i320) | (i319 ^ i320)) != 1) {
                                    int i321 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                                    java.lang.Object[] objArr106 = new java.lang.Object[1];
                                    b((i321 ^ 12) + ((i321 & 12) << 1), true, "\b\n\u0016\u0013ￖ\b\u001b\b\u000bￖￖ\u0013", 9 - (~(-(-KeyEvent.getDeadChar(0, 0)))), 94 - (~(-(ViewConfiguration.getPressedStateDuration() >> 16))), objArr106);
                                    String str38 = (String) objArr106[0];
                                    int i322 = -(-((byte) KeyEvent.getModifierMetaStateMask()));
                                    int i323 = (i322 & 17) + (i322 | 17);
                                    int rgb3 = Color.rgb(0, 0, 0) + 16777224;
                                    int i324 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                    int i325 = (i324 & 96) + (i324 | 96);
                                    java.lang.Object[] objArr107 = new java.lang.Object[1];
                                    b(i323, true, "\u0016\u0013ￖ\b\u001b\b\u000bￖￖ\u0015\u0010\tￖ\u0013\b\n", rgb3, i325, objArr107);
                                    String str39 = (String) objArr107[0];
                                    int i326 = -(-TextUtils.getCapsMode(str, 0, 0));
                                    int i327 = (i326 & 17) + (i326 | 17);
                                    int i328 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                    int i329 = (i328 & 17) + (i328 | 17);
                                    int i330 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                    int i331 = ((i330 | 97) << 1) - (i330 ^ 97);
                                    java.lang.Object[] objArr108 = new java.lang.Object[1];
                                    b(i327, false, "\t\u0006\u0019\u0006ￔ\u0011\u0014\b\u0006\u0011ￔ\u001d\u0007\u000e\u0013ￔￔ", i329, i331, objArr108);
                                    String str40 = (String) objArr108[0];
                                    int i332 = -Process.getGidForName(str);
                                    int valueOf6 = PngjBadCrcException.PngjException.valueOf();
                                    int i333 = (i332 * 569) + 2845;
                                    int i334 = ~i332;
                                    int i335 = ~((i334 & (-6)) | (i334 ^ (-6)));
                                    int i336 = ~i332;
                                    int i337 = ~valueOf6;
                                    int i338 = ~(i336 | i337);
                                    int i339 = (i335 ^ i338) | (i335 & i338);
                                    int i340 = ~valueOf6;
                                    int i341 = ~(((-6) ^ i340) | ((-6) & i340));
                                    int i342 = -(-(((i339 ^ i341) | (i339 & i341)) * (-1136)));
                                    int i343 = ((i333 | i342) << 1) - (i333 ^ i342);
                                    int i344 = ~((i336 ^ valueOf6) | (i336 & valueOf6));
                                    int i345 = ~(((-6) ^ valueOf6) | ((-6) & valueOf6));
                                    int i346 = (i344 ^ i345) | (i344 & i345);
                                    int i347 = (i340 ^ i332) | (i340 & i332);
                                    int i348 = ~((i347 ^ 5) | (i347 & 5));
                                    int i349 = ((i346 ^ i348) | (i346 & i348)) * (-568);
                                    int i350 = (i343 ^ i349) + ((i349 & i343) << 1);
                                    int i351 = ~((i332 & i337) | (i337 ^ i332));
                                    int i352 = ~((i340 ^ 5) | (i340 & 5));
                                    int i353 = (i351 & i352) | (i351 ^ i352);
                                    int i354 = (i336 ^ (-6)) | (i336 & (-6));
                                    int i355 = ~((valueOf6 & i354) | (i354 ^ valueOf6));
                                    int i356 = -(-(((i353 & i355) | (i353 ^ i355)) * 568));
                                    int i357 = (i350 & i356) + (i356 | i350);
                                    int i358 = -TextUtils.getCapsMode(str, 0, 0);
                                    int i359 = (i358 & 3) + (i358 | 3);
                                    int i360 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                                    int i361 = (i360 & 93) + (i360 | 93);
                                    java.lang.Object[] objArr109 = new java.lang.Object[1];
                                    b(i357, true, "\u000b\u001c\uffd8\uffd8\u0017\u0012", i359, i361, objArr109);
                                    String str41 = (String) objArr109[0];
                                    java.lang.Object[] objArr110 = new java.lang.Object[1];
                                    b((KeyEvent.getMaxKeyCode() >> 16) + 12, false, "\uffd1\u0015\u001b\u0015\u0016\u0007\u000f\uffd1\u0004\u000b\u0010\uffd1", 11 - (~(ViewConfiguration.getLongPressTimeout() >> 16)), TextUtils.getOffsetAfter(str, 0) + 100, objArr110);
                                    String str42 = (String) objArr110[0];
                                    int i362 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
                                    int i363 = (i362 ^ 17) + ((i362 & 17) << 1);
                                    int i364 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                                    int i365 = (i364 ^ 5) + ((i364 & 5) << 1);
                                    int i366 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                    int i367 = (i366 & 97) + (i366 | 97);
                                    java.lang.Object[] objArr111 = new java.lang.Object[1];
                                    b(i363, false, "ￓ\n\u001d\u0019ￔￔ\u0018\u001e\u0018\u0019\n\u0012ￔ\u0007\u000e\u0013ￔ", i365, i367, objArr111);
                                    String str43 = (String) objArr111[0];
                                    int i368 = -AndroidCharacter.getMirror('0');
                                    int i369 = ((i368 | 69) << 1) - (i368 ^ 69);
                                    int i370 = -MotionEvent.axisFromString(str);
                                    int i371 = (i370 & 6) + (i370 | 6);
                                    int i372 = -((Process.getThreadPriority(0) + 20) >> 6);
                                    int i373 = (i372 ^ 101) + ((i372 & 101) << 1);
                                    java.lang.Object[] objArr112 = new java.lang.Object[1];
                                    b(i369, true, "\u000e\u0006\u0015\u0014\u001a\u0014\uffd0\uffd0\u0006\u0007\u0002\u0014\r\n\u0002\u0007\uffd0\u000f\n\u0003\uffd0", i371, i373, objArr112);
                                    String str44 = (String) objArr112[0];
                                    int i374 = -KeyEvent.getDeadChar(0, 0);
                                    int i375 = (i374 ^ 16) + ((i374 & 16) << 1);
                                    int i376 = -View.combineMeasuredStates(0, 0);
                                    int i377 = (i376 & 4) + (i376 | 4);
                                    int i378 = -(-(Process.myPid() >> 22));
                                    int i379 = (i378 ^ 100) + ((i378 & 100) << 1);
                                    java.lang.Object[] objArr113 = new java.lang.Object[1];
                                    b(i375, false, "\u0004\u000b\u0010\uffd1\uffd1\u0015\u001b\u0015\u0016\u0007\u000f\uffd1\u0015\u0006\uffd1\u001a", i377, i379, objArr113);
                                    String str45 = (String) objArr113[0];
                                    int i380 = -(Process.getElapsedCpuTime() > j2 ? 1 : (Process.getElapsedCpuTime() == j2 ? 0 : -1));
                                    java.lang.Object[] objArr114 = new java.lang.Object[1];
                                    c("큁㥶湥ꘛ", (i380 & 1698264785) + (i380 | 1698264785), (char) View.resolveSizeAndState(0, 0, 0), "\ue5a3䢥꡷鵥", "뼁퍁檁ﾋ쿞\u10c6杮䍇䢮㜢尾叭沅ݹ䃥ꩂ\ue735ⷻ欺ꔖਔ㺽͊轊퐷", objArr114);
                                    String str46 = (String) objArr114[0];
                                    int argb = Color.argb(0, 0, 0, 0) + 13;
                                    int i381 = -KeyEvent.getDeadChar(0, 0);
                                    int i382 = (i381 & 1) + (i381 | 1);
                                    int i383 = -AndroidCharacter.getMirror('0');
                                    int i384 = (i383 & 150) + (i383 | 150);
                                    java.lang.Object[] objArr115 = new java.lang.Object[1];
                                    b(argb, false, "ￏￏ\u0013\u0019\u0013\u0014\u0005\rￏ\u0018\u0002\t\u000e", i382, i384, objArr115);
                                    String str47 = (String) objArr115[0];
                                    int i385 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                                    int i386 = (i385 ^ 9) + ((i385 & 9) << 1);
                                    int i387 = -TextUtils.indexOf(str, str, 0);
                                    int i388 = (i387 & 8) + (i387 | 8);
                                    int defaultSize = View.getDefaultSize(0, 0);
                                    int i389 = ((defaultSize | 94) << 1) - (defaultSize ^ 94);
                                    java.lang.Object[] objArr116 = new java.lang.Object[1];
                                    b(i386, false, "\u001d\u001b\u001aￗ\n\u0011\u0016ￗￗ", i388, i389, objArr116);
                                    String str48 = (String) objArr116[0];
                                    int i390 = 6 - (~(-(-(ViewConfiguration.getGlobalActionKeyTimeout() > j2 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j2 ? 0 : -1)))));
                                    int i391 = -TextUtils.indexOf(str, str, 0);
                                    java.lang.Object[] objArr117 = new java.lang.Object[1];
                                    b(i390, false, "ￚￚ\u001e ￚ\r\u0014\u0019", ((i391 | 1) << 1) - (i391 ^ 1), 91 - (~(-(-TextUtils.indexOf((CharSequence) str, '0', 0)))), objArr117);
                                    String[] strArr7 = {str38, str39, str40, str41, str42, str43, str44, str45, str46, str47, str48, (String) objArr117[0]};
                                    int i392 = 0;
                                    while (i392 < 12) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(strArr7[i392]);
                                        java.lang.Object[] objArr118 = new java.lang.Object[1];
                                        c("ῴ꺠䀙\uf2a0", KeyEvent.keyCodeFromString(str), (char) (41024 - View.MeasureSpec.getMode(0)), "\ue5a3䢥꡷鵥", "狔僙", objArr118);
                                        sb.append((String) objArr118[0]);
                                        java.lang.Object[] objArr119 = {sb.toString()};
                                        java.lang.Object PngjBadSignature25 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1142218481);
                                        if (PngjBadSignature25 == null) {
                                            char argb2 = (char) Color.argb(0, 0, 0, 0);
                                            int minimumFlingVelocity2 = 28 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                            int lastIndexOf3 = TextUtils.lastIndexOf(str, '0', 0, 0) + 1448;
                                            byte b48 = (byte) 0;
                                            byte b49 = (byte) (b48 + 1);
                                            strArr2 = strArr7;
                                            i18 = i392;
                                            java.lang.Object[] objArr120 = new java.lang.Object[1];
                                            a(b48, b49, (byte) (b49 - 1), objArr120);
                                            PngjBadSignature25 = com.d.e.a.PngjBadCrcException.PngjBadSignature(argb2, minimumFlingVelocity2, lastIndexOf3, 1191464116, false, (String) objArr120[0], new Class[]{String.class});
                                        } else {
                                            strArr2 = strArr7;
                                            i18 = i392;
                                        }
                                        long longValue16 = ((Long) ((Method) PngjBadSignature25).invoke(null, objArr119)).longValue();
                                        long j120 = -1055933748;
                                        long j121 = ((-271) * longValue16) + (273 * j120);
                                        long j122 = -272;
                                        long j123 = j120 ^ j;
                                        long j124 = j123 | (longValue16 ^ j);
                                        long elapsedCpuTime3 = (int) Process.getElapsedCpuTime();
                                        long j125 = ((272 * (longValue16 | ((j120 | elapsedCpuTime3) ^ j))) + (((((j123 | longValue16) ^ j) | ((j123 | elapsedCpuTime3) ^ j)) * j122) + (((((j124 | (elapsedCpuTime3 ^ j)) ^ j) | (((j120 | longValue16) | elapsedCpuTime3) ^ j)) * j122) + j121))) - 900064129;
                                        int i393 = ((int) (j125 >> c)) & ((((~(929526469 | i66)) | 373449413) * 420) + (((~(929526469 | i)) * 420) - 1233610930));
                                        int maxMemory3 = (int) Runtime.getRuntime().maxMemory();
                                        int c13 = ((int) j125) & defpackage.a.c((~((~maxMemory3) | (-84025382))) | (-1601697408), 576, (((~((-124248190) | maxMemory3)) | 40222808) * 576) + 1771465493, 1693500928);
                                        if (((i393 & c13) | (i393 ^ c13)) != 0) {
                                            int i394 = PngjUnsupportedException;
                                            PngjOutputException = (((i394 | 23) << 1) - (i394 ^ 23)) % 128;
                                            i15 = ((i18 | 110) << 1) - (i18 ^ 110);
                                            i14 = 1;
                                            break;
                                        }
                                        i392 = i18 + 1;
                                        strArr7 = strArr2;
                                    }
                                }
                            }
                            int i395 = PngjOutputException;
                            i14 = 1;
                            PngjUnsupportedException = (((i395 | 19) << 1) - (i395 ^ 19)) % 128;
                            i15 = 0;
                            if (i15 != 0) {
                                java.lang.Object[] objArr121 = new java.lang.Object[4];
                                int[] iArr = new int[i14];
                                objArr121[0] = iArr;
                                int[] iArr2 = new int[i14];
                                objArr121[i14] = iArr2;
                                int[] iArr3 = new int[i14];
                                objArr121[3] = iArr3;
                                int i396 = (~i15) & i;
                                iArr3[0] = i;
                                iArr[0] = (i15 & i66) | i396;
                                objArr121[2] = null;
                                int i397 = (((~((-933117007) | i)) | (~(i66 | 101448967))) * 979) + ((i | 101448967) * (-979)) + (((~((-933117007) | i66)) * 979) - 1419625264);
                                int i398 = (i397 ^ 16) + ((i397 & 16) << 1);
                                int i399 = i398 * (-445);
                                int i400 = -(-(i2 * (-445)));
                                int i401 = ((i399 | i400) << 1) - (i399 ^ i400);
                                int i402 = ~i398;
                                int i403 = ~i2;
                                int i404 = ~((i402 & i403) | (i402 ^ i403));
                                int i405 = ~i2;
                                int i406 = ~((i66 & i405) | (i405 ^ i66));
                                int i407 = -(-(((i404 & i406) | (i404 ^ i406)) * 446));
                                int i408 = ((i401 | i407) << 1) - (i407 ^ i401);
                                int i409 = ~i398;
                                int i410 = ~((i2 & i409) | (i409 ^ i2));
                                int i411 = i398 | i403;
                                int i412 = ~((i & i411) | (i411 ^ i));
                                int i413 = ((i412 & i410) | (i410 ^ i412)) * 446;
                                int i414 = ((~(i409 | i403)) * 446) + (i408 & i413) + (i413 | i408);
                                int i415 = i414 << 13;
                                int i416 = (i414 | i415) & (~(i414 & i415));
                                int i417 = i416 >>> 17;
                                int i418 = (i416 | i417) & (~(i416 & i417));
                                iArr2[0] = i418 ^ (i418 << 5);
                                return objArr121;
                            }
                            long[] jArr = new long[i14];
                            jArr[0] = 472001035;
                            int i419 = 16 - (~KeyEvent.getDeadChar(0, 0));
                            int i420 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int i421 = i420 * 465;
                            int i422 = (i421 ^ (-3241)) + ((i421 & (-3241)) << 1);
                            int i423 = (~(((-8) & i11) | ((-8) ^ i11))) | (~(((-8) ^ i420) | ((-8) & i420)));
                            int i424 = ~((i11 ^ i420) | (i11 & i420));
                            int i425 = (i422 - (~(((i423 ^ i424) | (i423 & i424)) * 464))) - 1;
                            int i426 = ~i420;
                            java.lang.Object[] objArr122 = new java.lang.Object[1];
                            b(i419, true, "\u0011ￍ\u0001\r\u0010\u000eￍ\u0011\u0012\f\u0013\r\u000bￍ\u0004\n\u0003", ((((((i426 & i) | (i ^ i426)) | (-8)) * (-464)) + i425) - (~(((~(i420 | i)) | (~(((-8) & i420) | ((-8) ^ i420)))) * 464))) - 1, 104 - (~(-(SystemClock.elapsedRealtimeNanos() > j2 ? 1 : (SystemClock.elapsedRealtimeNanos() == j2 ? 0 : -1)))), objArr122);
                            java.lang.Object[] objArr123 = {(String) objArr122[0], Integer.valueOf(i4), 1073741823L, jArr};
                            java.lang.Object PngjBadSignature26 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1000971846);
                            if (PngjBadSignature26 == null) {
                                char touchSlop3 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                                int size3 = View.MeasureSpec.getSize(0) + 35;
                                int i427 = (SystemClock.elapsedRealtimeNanos() > j2 ? 1 : (SystemClock.elapsedRealtimeNanos() == j2 ? 0 : -1)) + 1312;
                                byte b50 = (byte) 0;
                                byte b51 = (byte) (b50 + 1);
                                java.lang.Object[] objArr124 = new java.lang.Object[1];
                                a(b50, b51, (byte) (b51 - 1), objArr124);
                                PngjBadSignature26 = com.d.e.a.PngjBadCrcException.PngjBadSignature(touchSlop3, size3, i427, 951651329, false, (String) objArr124[0], new Class[]{String.class, cls, Long.TYPE, long[].class});
                            }
                            long longValue17 = ((Long) ((Method) PngjBadSignature26).invoke(null, objArr123)).longValue();
                            long j126 = 1889075805;
                            long j127 = (949 * longValue17) + ((-947) * j126);
                            long j128 = -948;
                            long j129 = j126 ^ j;
                            long j130 = longValue17 ^ j;
                            long j131 = ((948 * (j126 | j130)) + ((j128 * (((j129 | j130) | j72) ^ j)) + (((j129 | ((j130 | j69) ^ j)) * j128) + j127))) - 2068919974;
                            int i428 = ((int) (j131 >> c)) & ((((~(2012981067 | i66)) | (~((-1084227585) | i)) | (~((-83993667) | i))) * 920) + (((~(928753483 | i66)) | (-2012981068)) * 920) + (((~(2012981067 | i)) | (~((-83993667) | i66))) * 920) + 2038856378);
                            int a2 = defpackage.a.a();
                            int i429 = ~a2;
                            int i430 = ~(226796884 | i429);
                            if ((i428 | (((int) j131) & (((1664023294 | i430) * 712) + (((~(a2 | (-1646942891))) | (~(i429 | 1873739774))) * (-712)) + (((-1873739775) | i430) * (-712)) + 918537085))) != 0) {
                                i17 = 240;
                                i16 = 1;
                            } else {
                                int i431 = PngjOutputException;
                                i16 = 1;
                                PngjUnsupportedException = ((i431 ^ 43) + ((i431 & 43) << 1)) % 128;
                                i17 = 0;
                            }
                            if (i17 != 0) {
                                java.lang.Object[] objArr125 = new java.lang.Object[4];
                                int[] iArr4 = new int[i16];
                                objArr125[0] = iArr4;
                                int[] iArr5 = new int[i16];
                                objArr125[i16] = iArr5;
                                int[] iArr6 = new int[i16];
                                objArr125[3] = iArr6;
                                int i432 = ~(i & i17);
                                iArr6[0] = i;
                                iArr4[0] = (i17 | i) & i432;
                                objArr125[2] = null;
                                int i433 = ((776825147 | (~((-257740827) | i66))) * 160) + ((((~(i66 | 776825147)) | (-794687804)) * (-160)) - 1299403019);
                                int i434 = i433 * (-661);
                                int i435 = ((-10576) & i434) + (i434 | (-10576));
                                int i436 = ~i433;
                                int i437 = ~((i436 & (-17)) | ((-17) ^ i436));
                                int i438 = (i435 - (~(((i437 & i66) | (i66 ^ i437)) * 1324))) - 1;
                                int i439 = ~((i ^ 16) | (i & 16));
                                int i440 = ~(i | i433);
                                int i441 = ((i440 & i439) | (i439 ^ i440)) * (-1324);
                                int i442 = (i438 & i441) + (i441 | i438);
                                int i443 = ~((-17) | i433);
                                int i444 = ~i433;
                                int i445 = (i2 - (~(-(-((i442 - (~(((~((i444 & 16) | (i444 ^ 16))) | i443) * 662))) - 1))))) - 1;
                                int i446 = i445 << 13;
                                int i447 = (i445 | i446) & (~(i445 & i446));
                                int i448 = i447 >>> 17;
                                int i449 = ((~i447) & i448) | ((~i448) & i447);
                                int i450 = i449 << 5;
                                iArr5[0] = (i449 | i450) & (~(i449 & i450));
                                return objArr125;
                            }
                            long[] jArr2 = new long[i16];
                            jArr2[0] = 472001035;
                            int indexOf12 = TextUtils.indexOf(str, str, 0);
                            int i451 = -(-TextUtils.lastIndexOf(str, '0', 0, 0));
                            java.lang.Object[] objArr126 = new java.lang.Object[i16];
                            c("誓ᑺ\uef24暾", indexOf12, (char) (((i451 | 1) << i16) - (i451 ^ i16)), "\ue5a3䢥꡷鵥", "를\ud860\ue250\uf46f汃峰햊㮭崨ຝദ뇆襒㛋탅\u16ff㉢ᔮ㎶kh雺", objArr126);
                            java.lang.Object[] objArr127 = {(String) objArr126[0], Integer.valueOf(i4), 1073741823L, jArr2};
                            java.lang.Object PngjBadSignature27 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1000971846);
                            if (PngjBadSignature27 == null) {
                                int packedPositionGroup3 = 35 - ExpandableListView.getPackedPositionGroup(j2);
                                int indexOf13 = TextUtils.indexOf((CharSequence) str, '0') + 1314;
                                byte b52 = (byte) 0;
                                byte b53 = (byte) (b52 + 1);
                                java.lang.Object[] objArr128 = new java.lang.Object[1];
                                a(b52, b53, (byte) (b53 - 1), objArr128);
                                PngjBadSignature27 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((SystemClock.elapsedRealtimeNanos() > j2 ? 1 : (SystemClock.elapsedRealtimeNanos() == j2 ? 0 : -1)) - 1), packedPositionGroup3, indexOf13, 951651329, false, (String) objArr128[0], new Class[]{String.class, cls, Long.TYPE, long[].class});
                            }
                            long longValue18 = ((Long) ((Method) PngjBadSignature27).invoke(null, objArr127)).longValue();
                            long j132 = 953116013;
                            long j133 = -964;
                            long j134 = (965 * longValue18) + ((-963) * j132) + j133;
                            long j135 = longValue18 ^ j;
                            long freeMemory = (int) Runtime.getRuntime().freeMemory();
                            long j136 = (((((j135 | (freeMemory ^ j)) ^ j) | ((j135 | j132) ^ j)) * j133) + ((((j132 ^ j) | ((j135 | freeMemory) ^ j)) * j133) + j134)) - 1132960182;
                            int i452 = ((int) (j136 >> c)) & ((((~(1744527348 | i)) | (~((-604050705) | i66)) | (~((-1113213537) | i))) * 192) + (((~(1140476644 | i66)) | (-1744527349)) * (-384)) + (((27263108 | i66) * (-192)) - 1788177110));
                            int myPid3 = Process.myPid();
                            int i453 = (((~(1284798498 | myPid3)) | (-1301675432) | (~(152427911 | myPid3))) * (-880)) + 818884229;
                            int i454 = (~(1284798498 | (~myPid3))) | (-152427912);
                            int i455 = ~(myPid3 | (-1284798499));
                            int i456 = ((int) j136) & ((i455 * 880) + ((i454 | i455) * (-880)) + i453);
                            if (((i452 & i456) | (i452 ^ i456)) != 0) {
                                java.lang.Object[] objArr129 = {new int[]{0}, new int[1], null, new int[]{i}};
                                int i457 = (~(i & 242)) & (i | 242);
                                int startUptimeMillis4 = (int) Process.getStartUptimeMillis();
                                int i458 = ~startUptimeMillis4;
                                int i459 = (((~((-2906649) | i458)) | (~(75324984 | startUptimeMillis4))) * 520) + 959744045;
                                int i460 = ~((-75324985) | i458);
                                int i461 = ~(startUptimeMillis4 | 959240989);
                                int i462 = ((i461 | (~(i458 | (-959240990))) | 72418336) * 520) + ((i460 | i461) * (-1040)) + i459;
                                int i463 = ((i462 | 16) << 1) - (i462 ^ 16);
                                int i464 = (i2 ^ i463) + ((i2 & i463) << 1);
                                int i465 = i464 << 13;
                                int i466 = ((~i464) & i465) | ((~i465) & i464);
                                int i467 = i466 ^ (i466 >>> 17);
                                int i468 = i467 << 5;
                                ((int[]) objArr129[1])[0] = (i467 | i468) & (~(i467 & i468));
                                return objArr129;
                            }
                            java.lang.Object PngjBadSignature28 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1372235840);
                            if (PngjBadSignature28 == null) {
                                char c14 = (char) (23943 - (ViewConfiguration.getZoomControlsTimeout() > j2 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j2 ? 0 : -1)));
                                int i469 = 25 - (ViewConfiguration.getGlobalActionKeyTimeout() > j2 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j2 ? 0 : -1));
                                int packedPositionGroup4 = 312 - ExpandableListView.getPackedPositionGroup(j2);
                                byte b54 = (byte) ($$b & 3);
                                byte b55 = b54;
                                java.lang.Object[] objArr130 = new java.lang.Object[1];
                                a(b54, b55, (byte) (b55 + 3), objArr130);
                                PngjBadSignature28 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c14, i469, packedPositionGroup4, 1390033531, false, (String) objArr130[0], new Class[0]);
                            }
                            long longValue19 = ((Long) ((Method) PngjBadSignature28).invoke(null, null)).longValue();
                            long j137 = -47894137;
                            long j138 = 471;
                            long j139 = (j138 * longValue19) + (j138 * j137);
                            long j140 = -470;
                            long j141 = longValue19 ^ j;
                            long j142 = ((j72 | j137) | longValue19) ^ j;
                            long j143 = (470 * ((((j141 | j137) | j69) ^ j) | j142)) + (j140 * ((((j137 ^ j) | j141) ^ j) | ((j141 | j69) ^ j) | j142)) + ((j137 | longValue19) * j140) + j139 + 194808863;
                            int i470 = ((int) (j143 >> c)) & (((~((-343932961) | i66)) * 501) + (((~((-343932961) | i)) | 17106952) * 501) + 944856930);
                            int startUptimeMillis5 = (int) Process.getStartUptimeMillis();
                            int i471 = ((int) j143) & (((startUptimeMillis5 | (-134807849)) * 668) + ((1371963031 | (~((-1485777855) | startUptimeMillis5))) * 1336) + ((((~(1371963031 | startUptimeMillis5)) | (-1485777855)) * (-668)) - 790961531));
                            if (((i470 & i471) | (i470 ^ i471)) != 0) {
                                objArr = new java.lang.Object[]{new int[]{(i & (-265)) | (i66 & 264)}, new int[1], null, new int[]{i}};
                                int myPid4 = Process.myPid();
                                int i472 = ~myPid4;
                                int c15 = defpackage.a.c((~(myPid4 | (-96633217))) | (~(i472 | 99062661)) | (~(935503312 | i472)), 568, (((~((-935503313) | myPid4)) | (~((-99062662) | myPid4)) | (~(937932757 | i472))) * (-568)) + (((~((-935503313) | i472)) | 96633216 | (~((-99062662) | i472))) * (-1136)) + 257519085, i5);
                                int i473 = (i2 ^ c15) + ((c15 & i2) << 1);
                                int i474 = i473 << 13;
                                int i475 = (i474 | i473) & (~(i473 & i474));
                                int i476 = i475 ^ (i475 >>> 17);
                                c3 = 0;
                                ((int[]) objArr[1])[0] = i476 ^ (i476 << 5);
                            } else {
                                java.lang.Object PngjBadSignature29 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-40521023);
                                if (PngjBadSignature29 == null) {
                                    char scrollDefaultDelay2 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                    int size4 = 28 - View.MeasureSpec.getSize(0);
                                    int i477 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1855;
                                    byte b56 = (byte) 0;
                                    byte b57 = (byte) (b56 + 1);
                                    java.lang.Object[] objArr131 = new java.lang.Object[1];
                                    a(b56, b57, (byte) (b57 - 1), objArr131);
                                    PngjBadSignature29 = com.d.e.a.PngjBadCrcException.PngjBadSignature(scrollDefaultDelay2, size4, i477, 24829818, false, (String) objArr131[0], new Class[0]);
                                }
                                long longValue20 = ((Long) ((Method) PngjBadSignature29).invoke(null, null)).longValue();
                                long j144 = -65956929;
                                long j145 = ((-675) * longValue20) + (677 * j144);
                                long startUptimeMillis6 = (int) Process.getStartUptimeMillis();
                                long j146 = longValue20 ^ j;
                                long j147 = ((-676) * (j144 | startUptimeMillis6 | j146)) + j145;
                                long j148 = 676;
                                long j149 = startUptimeMillis6 ^ j;
                                long j150 = ((j148 * (((((j144 ^ j) | j146) ^ j) | ((j146 | j149) ^ j)) | (((j144 | longValue20) | startUptimeMillis6) ^ j))) + (((((j146 | j144) ^ j) | ((j149 | j144) ^ j)) * j148) + j147)) - 681409092;
                                int i478 = ((int) (j150 >> c)) & ((((~(1459879615 | i66)) | (~(22653204 | i66)) | (-1465647040)) * 50) + (((~((-1442993836) | i)) | (~(1465647039 | i66))) * 50) + (((1459879615 | i) * (-50)) - 1745543918));
                                int i479 = ((int) j150) & ((((~(1890941913 | i66)) | 1622432208) * 564) + ((~(2076147711 | i)) * 1128) + (((((~((-453715504) | i66)) | 1890941913) | (~(453715503 | i))) * (-564)) - 1900370391));
                                int i480 = ((i478 & i479) | (i478 ^ i479)) != 0 ? (i & (-282)) | (i66 & 281) : i;
                                if (i480 != i) {
                                    java.lang.Object[] objArr132 = {new int[]{i480}, new int[1], null, new int[]{i}};
                                    int elapsedRealtime3 = (int) SystemClock.elapsedRealtime();
                                    int c16 = defpackage.a.c((~((~elapsedRealtime3) | 724858018)) | (-960606226), 381, (((-272728082) | elapsedRealtime3) * (-381)) + 292950024, 830183757);
                                    int i481 = (((c16 | 16) << 1) - (c16 ^ 16)) + i2;
                                    int i482 = i481 << 13;
                                    int i483 = (i482 | i481) & (~(i481 & i482));
                                    int i484 = i483 >>> 17;
                                    int i485 = ((~i483) & i484) | ((~i484) & i483);
                                    c3 = 0;
                                    ((int[]) objArr132[1])[0] = i485 ^ (i485 << 5);
                                    PngjBadCrcException.PngjException.valueOf();
                                    objArr = objArr132;
                                } else {
                                    java.lang.Object PngjBadSignature30 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-792668357);
                                    if (PngjBadSignature30 == null) {
                                        char lastIndexOf4 = (char) (TextUtils.lastIndexOf(str, '0', 0, 0) + 30095);
                                        int scrollDefaultDelay3 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 45;
                                        int resolveSizeAndState5 = View.resolveSizeAndState(0, 0, 0) + 1810;
                                        byte b58 = (byte) ($$b & 3);
                                        byte b59 = b58;
                                        java.lang.Object[] objArr133 = new java.lang.Object[1];
                                        a(b58, b59, (byte) (b59 + 3), objArr133);
                                        PngjBadSignature30 = com.d.e.a.PngjBadCrcException.PngjBadSignature(lastIndexOf4, scrollDefaultDelay3, resolveSizeAndState5, 741325440, false, (String) objArr133[0], new Class[0]);
                                    }
                                    long longValue21 = ((Long) ((Method) PngjBadSignature30).invoke(null, null)).longValue();
                                    long j151 = -1644985567;
                                    long j152 = 184;
                                    long j153 = j151 ^ j;
                                    long j154 = (int) Runtime.getRuntime().totalMemory();
                                    long j155 = j154 ^ j;
                                    long j156 = (((j153 | j155) ^ j) * j152) + ((-184) * (j154 | (((longValue21 ^ j) | j151) ^ j))) + ((((j153 | longValue21) ^ j) | ((j155 | longValue21) ^ j)) * j152) + (185 * longValue21) + ((-183) * j151) + 2000720111;
                                    int i486 = ((int) (j156 >> c)) & ((((~((-1650884651) | i)) | 1648525312 | (~((-211298902) | i66))) * 521) + (((-213658240) | i) * 521) + ((((~(i66 | (-213658240))) | 1650884650) * (-1042)) - 2093504092));
                                    int i487 = ((int) j156) & ((((-2130442975) | (~((-483451551) | i)) | (~(483451550 | i66))) * 988) + (((~((-1920677961) | i66)) | 273686536) * (-1976)) + (((i | (-2130442975)) * 988) - 2019903595));
                                    if (((i486 & i487) | (i486 ^ i487)) == 0) {
                                        java.lang.Object PngjBadSignature31 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-25572490);
                                        if (PngjBadSignature31 == null) {
                                            char capsMode = (char) (TextUtils.getCapsMode(str, 0, 0) + 30094);
                                            int i488 = 46 - (SystemClock.uptimeMillis() > j2 ? 1 : (SystemClock.uptimeMillis() == j2 ? 0 : -1));
                                            int alpha3 = 1810 - Color.alpha(0);
                                            byte b60 = (byte) 0;
                                            byte b61 = (byte) (b60 + 1);
                                            java.lang.Object[] objArr134 = new java.lang.Object[1];
                                            a(b60, b61, (byte) (b61 - 1), objArr134);
                                            PngjBadSignature31 = com.d.e.a.PngjBadCrcException.PngjBadSignature(capsMode, i488, alpha3, 43427533, false, (String) objArr134[0], new Class[0]);
                                        }
                                        long longValue22 = ((Long) ((Method) PngjBadSignature31).invoke(null, null)).longValue();
                                        long j157 = -1408215780;
                                        long j158 = longValue22 ^ j;
                                        long j159 = ((((((j158 | j72) | j157) ^ j) | (((longValue22 | j157) | j69) ^ j)) * j71) + (((((j158 | j69) ^ j) | (((j72 | j157) | longValue22) ^ j)) * j71) + (((j158 | (((j157 ^ j) | j69) ^ j)) * j67) + ((j65 * longValue22) + (j63 * j157))))) - 190023006;
                                        int c17 = ((int) (j159 >> c)) & defpackage.a.c((~((~((int) SystemClock.uptimeMillis())) | (-1409029))) | (-1606418048), 576, (((~((-1522526744) | 0)) | 1521117715) * 576) - 1771464918, -9524544);
                                        int i489 = ((int) j159) & ((((~((-1258302087) | i)) | (~((-335888650) | i66)) | (~(1599438799 | i))) * 192) + (((~((-1594190736) | i66)) | 1258302086) * (-384)) + ((5248064 | i66) * (-192)) + 1788176917);
                                        if (((c17 & i489) | (c17 ^ i489)) != 0) {
                                            objArr = new java.lang.Object[]{new int[]{i ^ 266}, new int[]{((~0) & 0) | ((~0) & 0)}, null, new int[]{i}};
                                            int i490 = (((~((-1008862209) | i66)) | 524885) * 241) + ((((~((-1021451649) | i66)) | 12589440) * (-241)) - 352843568);
                                            int i491 = (i490 & 16) + (i490 | 16) + i2;
                                            int i492 = i491 ^ (i491 << 13);
                                            int i493 = i492 >>> 17;
                                            int i494 = (i492 | i493) & (~(i492 & i493));
                                            int i495 = i494 << 5;
                                            c2 = 0;
                                        } else {
                                            java.lang.Object PngjBadSignature32 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-2091466614);
                                            if (PngjBadSignature32 == null) {
                                                char normalizeMetaState2 = (char) (45717 - KeyEvent.normalizeMetaState(0));
                                                int indexOf14 = TextUtils.indexOf(str, str) + 40;
                                                int alpha4 = Color.alpha(0) + 625;
                                                byte b62 = (byte) ($$b & 3);
                                                byte b63 = b62;
                                                java.lang.Object[] objArr135 = new java.lang.Object[1];
                                                a(b62, b63, (byte) (b63 + 3), objArr135);
                                                PngjBadSignature32 = com.d.e.a.PngjBadCrcException.PngjBadSignature(normalizeMetaState2, indexOf14, alpha4, 2142874929, false, (String) objArr135[0], new Class[0]);
                                            }
                                            long longValue23 = ((Long) ((Method) PngjBadSignature32).invoke(null, null)).longValue();
                                            long j160 = 699841440;
                                            long j161 = -375;
                                            long j162 = (j161 * longValue23) + (j161 * j160);
                                            long j163 = 376;
                                            long elapsedCpuTime4 = (int) Process.getElapsedCpuTime();
                                            long j164 = j160 ^ j;
                                            long j165 = (j160 | longValue23) ^ j;
                                            long j166 = ((longValue23 | ((j164 | elapsedCpuTime4) ^ j)) * j163) + ((-376) * ((((elapsedCpuTime4 ^ j) | j160) ^ j) | j165)) + ((elapsedCpuTime4 | ((j164 | (longValue23 ^ j)) ^ j) | j165) * j163) + j162 + 636961842;
                                            if (((((int) (j166 >> c)) & ((((~(1600318462 | i66)) | 9442304 | (~((-352338345) | i))) * 168) + ((~(1609760766 | i)) * 168) + (((~(1257422422 | i66)) | (-1609760767)) * 168) + 501358106)) | (((int) j166) & ((((~(1125889337 | i)) | 277086272 | (~((-311337073) | i))) * 407) + (((~((-1125889338) | i)) | (~(311337072 | i66)) | 277086272) * 407) + (((1091638537 | 0) * (-814)) - 1951476454)))) != 0) {
                                                int i496 = PngjUnsupportedException;
                                                PngjOutputException = ((i496 ^ 95) + ((i496 & 95) << 1)) % 128;
                                                objArr = new java.lang.Object[]{new int[]{0}, new int[1], null, new int[]{i}};
                                                int i497 = (~(i & 280)) & (i | 280);
                                                int i498 = ~(107317974 | i66);
                                                int c18 = defpackage.a.c(i498 | (-927248000), 712, (((~((-822092842) | i66)) | (~(929410815 | i))) * (-712)) + ((822092841 | i498) * (-712)) + 709191517, 16);
                                                int valueOf7 = PngjBadCrcException.PngjException.valueOf();
                                                int i499 = c18 * 592;
                                                int i500 = i2 * (-590);
                                                int i501 = (i499 & i500) + (i499 | i500);
                                                int i502 = ~c18;
                                                int i503 = (i501 - (~(-(-((~((i502 ^ i2) | (i502 & i2))) * (-1182)))))) - 1;
                                                int i504 = ~c18;
                                                int i505 = ~i2;
                                                int i506 = ~((~valueOf7) | (i504 ^ i505) | (i504 & i505));
                                                int i507 = ~(c18 | i2);
                                                int i508 = (i503 - (~(-(-(((i506 & i507) | (i506 ^ i507)) * (-591)))))) - 1;
                                                int i509 = (valueOf7 ^ i502) | (valueOf7 & i502);
                                                int i510 = (i508 - (~(((i509 & i505) | (i509 ^ i505)) * 591))) - 1;
                                                int i511 = i510 << 13;
                                                int i512 = (i511 | i510) & (~(i510 & i511));
                                                int i513 = i512 >>> 17;
                                                int i514 = ((~i512) & i513) | ((~i513) & i512);
                                                c2 = 0;
                                                ((int[]) objArr[1])[0] = i514 ^ (i514 << 5);
                                            } else {
                                                objArr = new java.lang.Object[]{new int[]{i}, new int[1], null, new int[]{i}};
                                                int i515 = (((~((-685641532) | i66)) | (-348924443)) * 68) + ((~((-335552513) | i66)) * (-68)) + (((((~((-13371931) | i66)) | (-1021194044)) | (~(685641531 | i))) * (-68)) - 387359599);
                                                int valueOf8 = PngjBadCrcException.PngjException.valueOf();
                                                int i516 = (-1) - (~(i515 * 989));
                                                int i517 = -(-(valueOf8 * 988));
                                                int i518 = (i516 ^ i517) + ((i516 & i517) << 1);
                                                int i519 = ~(~i515);
                                                int i520 = ~(~valueOf8);
                                                int i521 = (((i519 & i520) | (i519 ^ i520)) * (-1976)) + i518;
                                                int i522 = ~((~i515) | valueOf8);
                                                int i523 = ~valueOf8;
                                                int i524 = ~((i515 & i523) | (i523 ^ i515));
                                                int i525 = -(-(((i524 & i522) | (i522 ^ i524)) * 988));
                                                int i526 = -(-(((i521 | i525) << 1) - (i525 ^ i521)));
                                                int i527 = (i2 ^ i526) + ((i526 & i2) << 1);
                                                int i528 = i527 << 13;
                                                int i529 = (i528 & (~i527)) | ((~i528) & i527);
                                                int i530 = i529 ^ (i529 >>> 17);
                                                int i531 = i530 << 5;
                                                c2 = 0;
                                                ((int[]) objArr[1])[0] = (i530 | i531) & (~(i530 & i531));
                                            }
                                        }
                                        if (((int[]) objArr[3])[c2] == ((int[]) objArr[c2])[c2]) {
                                            int i532 = PngjUnsupportedException;
                                            int i533 = (i532 & 37) + (i532 | 37);
                                            PngjOutputException = i533 % 128;
                                            if (i533 % 2 != 0) {
                                                int i534 = i10 / 0;
                                            }
                                            return objArr;
                                        }
                                        java.lang.Object[] objArr136 = {2};
                                        java.lang.Object PngjBadSignature33 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-476828914);
                                        if (PngjBadSignature33 == null) {
                                            char offsetAfter4 = (char) (35511 - TextUtils.getOffsetAfter(str, 0));
                                            int i535 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 42;
                                            int size5 = View.MeasureSpec.getSize(0) + 507;
                                            byte b64 = (byte) ($$b & 3);
                                            byte b65 = b64;
                                            java.lang.Object[] objArr137 = new java.lang.Object[1];
                                            a(b64, b65, (byte) (b65 + 3), objArr137);
                                            PngjBadSignature33 = com.d.e.a.PngjBadCrcException.PngjBadSignature(offsetAfter4, i535, size5, 528172725, false, (String) objArr137[0], new Class[]{cls});
                                        }
                                        long longValue24 = ((Long) ((Method) PngjBadSignature33).invoke(null, objArr136)).longValue();
                                        long j167 = -848798692;
                                        long j168 = (246 * longValue24) + ((-244) * j167);
                                        long j169 = -245;
                                        long j170 = longValue24 ^ j;
                                        long startElapsedRealtime4 = (int) Process.getStartElapsedRealtime();
                                        long j171 = ((((j170 | (startElapsedRealtime4 ^ j)) ^ j) | ((j170 | j167) ^ j)) * j169) + j168;
                                        long j172 = (startElapsedRealtime4 | j170) ^ j;
                                        long j173 = (245 * (j167 | j172)) + (j169 * j172) + j171 + 1716545204;
                                        int i536 = ((int) (j173 >> c)) & ((((-369924270) | i) * 591) + (((~((-369924270) | i66)) | (-1067302142)) * (-591)) + 1603764474);
                                        int b66 = defpackage.a.b(395753295);
                                        int i537 = ~((-315618519) | b66);
                                        int i538 = ~b66;
                                        int i539 = i537 | (~((-1752844929) | i538));
                                        int i540 = ~(315618518 | i538);
                                        int i541 = ((int) j173) & ((((-2063597271) | i540) * 516) + (((~(b66 | (-310752343))) | (~(i538 | 2063597270))) * 516) + ((i539 | i540) * (-516)) + 738022833);
                                        if (((i536 & i541) | (i536 ^ i541)) == 2) {
                                            java.lang.Object[] objArr138 = {new int[]{0}, new int[1], null, new int[]{i}};
                                            int i542 = (~(i & 270)) & (i | 270);
                                            int i543 = ~Process.myUid();
                                            int A = defpackage.a.A((~(i543 | (-237204957))) | 2176132, 52, (((~(237204956 | i543)) | (~((-797361018) | i543)) | 562332193) * (-52)) + ((~(799537149 | i543)) * 52) + 97910073, -16);
                                            int i544 = A * 46;
                                            int i545 = -(-(i2 * 46));
                                            int i546 = ((i544 | i545) << 1) - (i544 ^ i545);
                                            int i547 = ~i2;
                                            int i548 = (i546 - (~(-(-(((~((i547 ^ i66) | (i547 & i66))) | A) * (-90)))))) - 1;
                                            int i549 = ~(i547 | i);
                                            int i550 = ~((A ^ i2) | (A & i2));
                                            int i551 = (((i549 & i550) | (i549 ^ i550)) * (-45)) + i548;
                                            int i552 = ~i2;
                                            int i553 = ~A;
                                            int i554 = -(-(((~((i & i553) | (i553 ^ i))) | i552 | (~((i66 ^ A) | (A & i66)))) * 45));
                                            int i555 = (i551 ^ i554) + ((i554 & i551) << 1);
                                            int i556 = i555 << 13;
                                            int i557 = (i556 | i555) & (~(i555 & i556));
                                            int i558 = i557 ^ (i557 >>> 17);
                                            ((int[]) objArr138[1])[0] = i558 ^ (i558 << 5);
                                            return objArr138;
                                        }
                                        java.lang.Object PngjBadSignature34 = com.d.e.a.PngjBadCrcException.PngjBadSignature(98436405);
                                        if (PngjBadSignature34 == null) {
                                            char indexOf15 = (char) (TextUtils.indexOf((CharSequence) str, '0', 0) + 51310);
                                            int rgb4 = Color.rgb(0, 0, 0) + 16777259;
                                            int resolveOpacity = Drawable.resolveOpacity(0, 0) + 1767;
                                            byte b67 = (byte) ($$b & 3);
                                            byte b68 = b67;
                                            java.lang.Object[] objArr139 = new java.lang.Object[1];
                                            a(b67, b68, (byte) (b68 + 3), objArr139);
                                            PngjBadSignature34 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf15, rgb4, resolveOpacity, -114202482, false, (String) objArr139[0], new Class[0]);
                                        }
                                        long longValue25 = ((Long) ((Method) PngjBadSignature34).invoke(null, null)).longValue();
                                        long j174 = 1277600579;
                                        long j175 = -167;
                                        long j176 = (j175 * longValue25) + (j175 * j174);
                                        long j177 = 168;
                                        long j178 = j174 ^ j;
                                        long j179 = longValue25 ^ j;
                                        long j180 = j178 | j179;
                                        long freeMemory2 = (int) Runtime.getRuntime().freeMemory();
                                        long j181 = freeMemory2 ^ j;
                                        long j182 = ((((((j178 | j181) ^ j) | ((j178 | longValue25) ^ j)) | ((freeMemory2 | (j179 | j174)) ^ j)) * j177) + ((((j180 | freeMemory2) ^ j) * j177) + ((((j180 ^ j) | ((j179 | j181) ^ j)) * j177) + j176))) - 1906029659;
                                        if (((((int) (j182 >> c)) & (((i | 1210126628) * 54) + (((~(2033793980 | i)) | 1210126628 | (~((-2033793981) | i66))) * 54) + (((~((-823946905) | i66)) | 279552) * (-108)) + 2073453656)) | (((int) j182) & ((((-40284295) | i) * 591) + ((((~((-40284295) | i66)) | 1477510704) * (-591)) - 2068546866)))) != 0) {
                                            java.lang.Object[] objArr140 = {new int[]{(i & (-273)) | (i66 & 272)}, new int[1], null, new int[]{i}};
                                            int elapsedCpuTime5 = (int) Process.getElapsedCpuTime();
                                            int i559 = -(-defpackage.a.A((~(elapsedCpuTime5 | 1031273677)) | (~((-276020365) | (~elapsedCpuTime5))), 338, (((755253313 | 0) | (~(276020364 | elapsedCpuTime5))) * (-338)) - 1387851993, -16));
                                            int i560 = (i2 ^ i559) + ((i559 & i2) << 1);
                                            int i561 = (i560 << 13) ^ i560;
                                            int i562 = i561 >>> 17;
                                            int i563 = (i561 | i562) & (~(i561 & i562));
                                            int i564 = i563 << 5;
                                            ((int[]) objArr140[1])[0] = (i563 | i564) & (~(i563 & i564));
                                            return objArr140;
                                        }
                                        long[] jArr3 = {624887784092251L};
                                        int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 17;
                                        int indexOf16 = TextUtils.indexOf(str, str, 0, 0);
                                        int i565 = ((indexOf16 | 7) << 1) - (indexOf16 ^ 7);
                                        int i566 = -Gravity.getAbsoluteGravity(0, 0);
                                        int i567 = i566 * 69;
                                        int i568 = ((i567 | (-6968)) << 1) - (i567 ^ (-6968));
                                        int i569 = ~i566;
                                        int i570 = (i569 ^ (-105)) | (i569 & (-105));
                                        int i571 = ~((i570 & i66) | (i570 ^ i66));
                                        int i572 = ~((i566 ^ 104) | (i566 & 104));
                                        int i573 = (i571 & i572) | (i571 ^ i572);
                                        int i574 = ~(i | 104);
                                        int i575 = (((i573 & i574) | (i573 ^ i574)) * (-68)) + i568;
                                        int i576 = (i569 & i66) | (i569 ^ i66);
                                        int i577 = -(-((~((i576 & 104) | (i576 ^ 104))) * (-68)));
                                        int i578 = (i575 ^ i577) + ((i577 & i575) << 1);
                                        int i579 = ~i566;
                                        int i580 = ~(((-105) & i66) | ((-105) ^ i66));
                                        int i581 = (i578 - (~(-(-(((i579 & i580) | (i579 ^ i580)) * 68))))) - 1;
                                        java.lang.Object[] objArr141 = new java.lang.Object[1];
                                        b(jumpTapTimeout2, true, "\u0011ￍ\u0001\r\u0010\u000eￍ\u0011\u0012\f\u0013\r\u000bￍ\u0004\n\u0003", i565, i581, objArr141);
                                        java.lang.Object[] objArr142 = {(String) objArr141[0], 3, 2251799813685247L, jArr3};
                                        java.lang.Object PngjBadSignature35 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1000971846);
                                        if (PngjBadSignature35 == null) {
                                            char absoluteGravity3 = (char) Gravity.getAbsoluteGravity(0, 0);
                                            int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 35;
                                            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1313;
                                            byte b69 = (byte) 0;
                                            byte b70 = (byte) (b69 + 1);
                                            java.lang.Object[] objArr143 = new java.lang.Object[1];
                                            a(b69, b70, (byte) (b70 - 1), objArr143);
                                            PngjBadSignature35 = com.d.e.a.PngjBadCrcException.PngjBadSignature(absoluteGravity3, edgeSlop2, doubleTapTimeout, 951651329, false, (String) objArr143[0], new Class[]{String.class, cls, Long.TYPE, long[].class});
                                        }
                                        long longValue26 = ((Long) ((Method) PngjBadSignature35).invoke(null, objArr142)).longValue();
                                        long j183 = 969421471;
                                        long j184 = ((-622) * longValue26) + (624 * j183);
                                        long j185 = 623;
                                        long j186 = longValue26 ^ j;
                                        long j187 = j186 | j183;
                                        long j188 = (((((j183 | j69) ^ j) | ((j187 ^ j) | ((j186 | j69) ^ j))) * j185) + (((-623) * (j72 | (((j183 ^ j) | longValue26) ^ j))) + ((((j187 | j69) ^ j) * j185) + j184))) - 1149265640;
                                        int c19 = ((int) (j188 >> c)) & defpackage.a.c((~((-1630564091) | i66)) | (-672486817), 381, (((-537937057) | i) * (-381)) - 1929478006, -1204411872);
                                        int i582 = ((int) j188) & ((((~((~Process.myUid()) | 2352075)) | 1441651390) * 184) + (((1441790975 | 0) * 184) - 413109635));
                                        if (((c19 & i582) | (c19 ^ i582)) != 0) {
                                            java.lang.Object[] objArr144 = {new int[]{(i & (-276)) | (i66 & 275)}, new int[1], null, new int[]{i}};
                                            int b71 = defpackage.a.b(1454353943);
                                            int i583 = ~b71;
                                            int i584 = (((~(b71 | 997718015)) | (~((-456279904) | i583)) | 36847958) * 676) + (((~(578286070 | i583)) | 419431945) * 676) + (((-419431946) | b71) * (-676)) + 1906356241;
                                            int i585 = ((i584 | 16) << 1) - (i584 ^ 16);
                                            int i586 = (i2 & i585) + (i2 | i585);
                                            int i587 = i586 << 13;
                                            int i588 = ((~i586) & i587) | ((~i587) & i586);
                                            int i589 = i588 >>> 17;
                                            int i590 = ((~i588) & i589) | ((~i589) & i588);
                                            int i591 = i590 << 5;
                                            ((int[]) objArr144[1])[0] = ((~i590) & i591) | ((~i591) & i590);
                                            return objArr144;
                                        }
                                        int i592 = -(-Color.blue(0));
                                        int i593 = (i592 ^ 11) + ((i592 & 11) << 1);
                                        int lastIndexOf5 = TextUtils.lastIndexOf(str, '0', 0);
                                        int i594 = (lastIndexOf5 & 4) + (lastIndexOf5 | 4);
                                        int i595 = -View.combineMeasuredStates(0, 0);
                                        int i596 = ((i595 | 104) << 1) - (i595 ^ 104);
                                        java.lang.Object[] objArr145 = new java.lang.Object[1];
                                        b(i593, true, "\u0003\u0002ￍ\t\u0011\u0007\u0005\u0017\u0018ￍ\u0014", i594, i596, objArr145);
                                        java.lang.Object[] objArr146 = {(String) objArr145[0]};
                                        java.lang.Object PngjBadSignature36 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1934049891);
                                        if (PngjBadSignature36 == null) {
                                            char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                                            int i597 = (Process.getElapsedCpuTime() > j2 ? 1 : (Process.getElapsedCpuTime() == j2 ? 0 : -1)) + 27;
                                            int mode3 = 1447 - View.MeasureSpec.getMode(0);
                                            byte b72 = (byte) 2;
                                            byte b73 = (byte) (b72 - 2);
                                            java.lang.Object[] objArr147 = new java.lang.Object[1];
                                            a(b72, b73, (byte) (b73 | 15), objArr147);
                                            PngjBadSignature36 = com.d.e.a.PngjBadCrcException.PngjBadSignature(pressedStateDuration, i597, mode3, -1884803112, false, (String) objArr147[0], new Class[]{String.class});
                                        }
                                        long longValue27 = ((Long) ((Method) PngjBadSignature36).invoke(null, objArr146)).longValue();
                                        long j189 = -1593699975;
                                        long j190 = -445;
                                        long j191 = (j190 * longValue27) + (j190 * j189);
                                        long j192 = 446;
                                        long j193 = j189 ^ j;
                                        long j194 = longValue27 ^ j;
                                        long j195 = (j193 | j194) ^ j;
                                        long uptimeMillis = (int) SystemClock.uptimeMillis();
                                        long j196 = ((j192 * j195) + (((((uptimeMillis | (j194 | j189)) ^ j) | ((j193 | longValue27) ^ j)) * j192) + (((j195 | ((j194 | (uptimeMillis ^ j)) ^ j)) * j192) + j191))) - 123217292;
                                        int startUptimeMillis7 = (int) Process.getStartUptimeMillis();
                                        int i598 = ~startUptimeMillis7;
                                        int i599 = ((int) (j196 >> c)) & ((((~(startUptimeMillis7 | 1226641639)) | 1631099245 | (~(i598 | (-1226641640)))) * 45) + (((~(1631099245 | startUptimeMillis7)) | 1092096101) * (-45)) + (((~(1631099245 | i598)) | (-1226641640)) * (-90)) + 1687905420);
                                        int maxMemory4 = (int) Runtime.getRuntime().maxMemory();
                                        int i600 = ((int) j196) & ((((~(maxMemory4 | (-969783687))) | (~((~maxMemory4) | 969783686)) | (~(467442723 | maxMemory4))) * 959) + (((((~(467442723 | 0)) | (~(969783686 | maxMemory4))) | (~(0 | (-969783687)))) * 959) - 302045588));
                                        if (((i599 & i600) | (i599 ^ i600)) != 0) {
                                            java.lang.Object[] objArr148 = {new int[]{i ^ 276}, new int[]{0 ^ (0 << 5)}, null, new int[]{i}};
                                            int i601 = (((~((-867513290) | i66)) | 838873665) * 52) + (((~(867513289 | i66)) | (~((-167052685) | i66)) | 138413060) * (-52)) + (((~(1005926349 | i66)) * 52) - 1029647119);
                                            int i602 = (((i601 | 16) << 1) - (i601 ^ 16)) + i2;
                                            int i603 = i602 << 13;
                                            int i604 = (i602 | i603) & (~(i602 & i603));
                                            int i605 = i604 >>> 17;
                                            int i606 = ((~i604) & i605) | ((~i605) & i604);
                                            return objArr148;
                                        }
                                        int i607 = PngjOutputException;
                                        int i608 = (i607 & 103) + (i607 | 103);
                                        PngjUnsupportedException = i608 % 128;
                                        if (i608 % 2 == 0) {
                                            java.lang.Object PngjBadSignature37 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1617763359);
                                            if (PngjBadSignature37 == null) {
                                                int myTid = (Process.myTid() >> 22) + 31;
                                                int gidForName4 = 1380 - Process.getGidForName(str);
                                                byte b74 = (byte) ($$b & 3);
                                                byte b75 = b74;
                                                java.lang.Object[] objArr149 = new java.lang.Object[1];
                                                a(b74, b75, (byte) (b75 + 3), objArr149);
                                                PngjBadSignature37 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((ViewConfiguration.getZoomControlsTimeout() > j2 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j2 ? 0 : -1)) - 1), myTid, gidForName4, -1669172828, false, (String) objArr149[0], new Class[0]);
                                            }
                                            long longValue28 = ((Long) ((Method) PngjBadSignature37).invoke(null, null)).longValue();
                                            long j197 = 134845690;
                                            long j198 = 140;
                                            long elapsedRealtime4 = (int) SystemClock.elapsedRealtime();
                                            long j199 = (j197 ^ j) | longValue28;
                                            long j200 = elapsedRealtime4 ^ j;
                                            long j201 = (((((((longValue28 ^ j) | j197) ^ j) | ((j200 | j197) ^ j)) | ((j199 | elapsedRealtime4) ^ j)) * j198) + (((-280) * ((j199 ^ j) | ((j200 | longValue28) ^ j))) + (((longValue28 | elapsedRealtime4) * j198) + (((-279) * longValue28) + (141 * j197))))) - 1181540199;
                                            int i609 = (~(768436174 | i66)) | 1342177280;
                                            int i610 = ((int) (j201 >> 25)) & (((~(2089304710 | i66)) * 713) + ((~((-21308745) | i)) * 1426) + (((i609 | 0) * (-713)) - 1676312542));
                                            int i611 = ((int) j201) & ((((~(i66 | (-810056731))) | (~((-627169680) | i))) * 950) + (((~(i66 | (-627169680))) | (~((-810056731) | i))) * (-950)) + ((((~(810056730 | i66)) | (~(627169679 | i))) * 1900) - 1871736089));
                                        } else {
                                            java.lang.Object PngjBadSignature38 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1617763359);
                                            if (PngjBadSignature38 == null) {
                                                char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(j2) + 1);
                                                int indexOf17 = TextUtils.indexOf((CharSequence) str, '0') + 32;
                                                int axisFromString2 = 1380 - MotionEvent.axisFromString(str);
                                                byte b76 = (byte) ($$b & 3);
                                                byte b77 = b76;
                                                java.lang.Object[] objArr150 = new java.lang.Object[1];
                                                a(b76, b77, (byte) (b77 + 3), objArr150);
                                                PngjBadSignature38 = com.d.e.a.PngjBadCrcException.PngjBadSignature(packedPositionChild, indexOf17, axisFromString2, -1669172828, false, (String) objArr150[0], new Class[0]);
                                            }
                                            long longValue29 = ((Long) ((Method) PngjBadSignature38).invoke(null, null)).longValue();
                                            long j202 = -284763584;
                                            long j203 = (713 * longValue29) + ((-711) * j202);
                                            long j204 = -712;
                                            long j205 = longValue29 ^ j;
                                            long elapsedRealtime5 = (int) SystemClock.elapsedRealtime();
                                            long j206 = elapsedRealtime5 ^ j;
                                            long j207 = (j206 | j202) ^ j;
                                            long j208 = ((712 * (j205 | j207)) + ((((((j205 | j206) | j202) ^ j) | ((elapsedRealtime5 | (j202 | longValue29)) ^ j)) * j204) + (((((j205 | j202) ^ j) | j207) * j204) + j203))) - 761930925;
                                            int b78 = defpackage.a.b(285382931);
                                            int i612 = ~b78;
                                            int i613 = ((int) (j208 >> c)) & ((((~((-1246761459) | b78)) | (~(i612 | 190464952))) * 333) + (((~(190464952 | b78)) | (~((-1246761459) | i612))) * 333) + 1877808517);
                                            int i614 = ((int) j208) & ((((~((-34669126) | i66)) | 541368336) * 241) + (((~((-1175520838) | i66)) | 1140851712) * (-241)) + 1304346437);
                                        }
                                        cause = th.getCause();
                                        if (cause == null) {
                                            throw cause;
                                        }
                                        throw th;
                                    }
                                    objArr = new java.lang.Object[]{new int[]{(i & (-269)) | (i66 & 268)}, new int[1], null, new int[]{i}};
                                    int freeMemory3 = (int) Runtime.getRuntime().freeMemory();
                                    int i615 = (((~((~freeMemory3) | (-992059729))) | 958472528) * (-245)) + 1746935324;
                                    int i616 = ~(freeMemory3 | (-992059729));
                                    int i617 = ((i616 | 42506245) * 245) + (i616 * (-245)) + i615;
                                    int i618 = (i617 ^ 16) + ((i617 & 16) << 1);
                                    int i619 = ((i2 | i618) << 1) - (i618 ^ i2);
                                    int i620 = i619 << 13;
                                    int i621 = (i619 | i620) & (~(i619 & i620));
                                    int i622 = i621 ^ (i621 >>> 17);
                                    int i623 = i622 << 5;
                                    c3 = 0;
                                    ((int[]) objArr[1])[0] = ((~i622) & i623) | ((~i623) & i622);
                                }
                            }
                            c2 = c3;
                            if (((int[]) objArr[3])[c2] == ((int[]) objArr[c2])[c2]) {
                            }
                        }
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 != null) {
                            throw cause3;
                        }
                        throw th3;
                    }
                }
                java.lang.Object[] objArr151 = {(String) objArr2[0]};
                java.lang.Object PngjBadSignature39 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i9);
                if (PngjBadSignature39 == null) {
                    char c20 = (char) ((SystemClock.elapsedRealtime() > j2 ? 1 : (SystemClock.elapsedRealtime() == j2 ? 0 : -1)) + 8751);
                    int i624 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24;
                    int indexOf18 = 335 - TextUtils.indexOf((CharSequence) str, '0', 0, 0);
                    byte b79 = (byte) 0;
                    byte b80 = (byte) (b79 + 1);
                    java.lang.Object[] objArr152 = new java.lang.Object[1];
                    a(b79, b80, (byte) (b80 - 1), objArr152);
                    PngjBadSignature39 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c20, i624, indexOf18, -598779726, false, (String) objArr152[0], new Class[]{String.class});
                }
                java.lang.Object invoke8 = ((Method) PngjBadSignature39).invoke(null, objArr151);
                if (invoke8 != null) {
                    int i625 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    java.lang.Object[] objArr153 = new java.lang.Object[1];
                    c("壷쾞脷䮮", ((i625 | 936353368) << 1) - (i625 ^ 936353368), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "\ue5a3䢥꡷鵥", "眪\ue545嗣駏䇟\udd97\ue00a", objArr153);
                    if (invoke8.equals((String) objArr153[0])) {
                        int i626 = 22 - (~TextUtils.getOffsetBefore(str, 0));
                        int pressedStateDuration2 = ViewConfiguration.getPressedStateDuration() >> 16;
                        int i627 = (pressedStateDuration2 * (-167)) - 3674;
                        int i628 = ~pressedStateDuration2;
                        int i629 = ((~((i628 ^ (-23)) | (i628 & (-23)))) | (~((-23) | i11))) * 168;
                        int i630 = ((i627 | i629) << 1) - (i627 ^ i629);
                        int i631 = ~pressedStateDuration2;
                        int i632 = ((~((i631 ^ (-23)) | (i631 & (-23)) | i)) * 168) + i630;
                        int i633 = ~((i631 & i66) | (i631 ^ i66));
                        int i634 = ~(i628 | 22);
                        int i635 = (i633 & i634) | (i633 ^ i634);
                        int i636 = ~((pressedStateDuration2 & (-23)) | ((-23) ^ pressedStateDuration2) | i);
                        int i637 = -(-(((i636 & i635) | (i635 ^ i636)) * 168));
                        int i638 = (i632 & i637) + (i637 | i632);
                        int i639 = -(-TextUtils.lastIndexOf(str, '0', 0));
                        int i640 = (i639 & 111) + (i639 | 111);
                        java.lang.Object[] objArr154 = new java.lang.Object[1];
                        b(i626, false, "�\n\u000b\u0001\u000b\fￆ\u000b\u0011\u000bￆ\n\u0007\u0007\f\ufff7\ufff9\ufffb\ufffb�\u000b\u000b\b", i638, i640, objArr154);
                        try {
                            java.lang.Object[] objArr155 = {(String) objArr154[0]};
                            java.lang.Object PngjBadSignature40 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i9);
                            if (PngjBadSignature40 == null) {
                                char lastIndexOf6 = (char) (8751 - TextUtils.lastIndexOf(str, '0', 0, 0));
                                int maximumFlingVelocity2 = 24 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                int i641 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 335;
                                byte b81 = (byte) 0;
                                byte b82 = (byte) (b81 + 1);
                                java.lang.Object[] objArr156 = new java.lang.Object[1];
                                a(b81, b82, (byte) (b82 - 1), objArr156);
                                PngjBadSignature40 = com.d.e.a.PngjBadCrcException.PngjBadSignature(lastIndexOf6, maximumFlingVelocity2, i641, -598779726, false, (String) objArr156[0], new Class[]{String.class});
                            }
                            String str49 = (String) ((Method) PngjBadSignature40).invoke(null, objArr155);
                            if (str49 != null && (parseInt = Integer.parseInt(str49)) != 0) {
                                PngjBadCrcException.PngjException.valueOf();
                                PngjBadCrcException.PngjException.valueOf();
                                i13 = parseInt + 170;
                                if (i13 != 0) {
                                }
                            }
                        } catch (Throwable th4) {
                            Throwable cause4 = th4.getCause();
                            if (cause4 != null) {
                                throw cause4;
                            }
                            throw th4;
                        }
                    }
                }
                i13 = 0;
                if (i13 != 0) {
                }
            } catch (Throwable th5) {
                Throwable cause5 = th5.getCause();
                if (cause5 != null) {
                    throw cause5;
                }
                throw th5;
            }
            int i642 = -(SystemClock.elapsedRealtime() > j2 ? 1 : (SystemClock.elapsedRealtime() == j2 ? 0 : -1));
            int i643 = (i642 & 19) + (i642 | 19);
            int i644 = 0 - (~(-(ViewConfiguration.getMaximumFlingVelocity() >> 16)));
            int i645 = -View.getDefaultSize(0, 0);
            int i646 = ((i645 | 106) << 1) - (i645 ^ 106);
            objArr2 = new java.lang.Object[1];
            b(i643, false, "\n\u0005\n\u0005\u0010ￊ\u000f\u0012\uffffￊ\u000f\u0011\ufffb\u0000�\u0001\t\u000b", i644, i646, objArr2);
        }

        private static void a(short s, short s2, int i, java.lang.Object[] objArr) {
            int i2 = i + 97;
            int i3 = 5 - s2;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[s + 1];
            int i4 = -1;
            if (bArr == null) {
                i2 = (i2 + s) - 23;
                i3++;
            }
            while (true) {
                i4++;
                bArr2[i4] = (byte) i2;
                if (i4 == s) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    i2 = (i2 + bArr[i3]) - 23;
                    i3++;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
        
            if (0 != null) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0019, code lost:
        
            0 = 0.toCharArray();
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0017, code lost:
        
            if (0 != null) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
        
            0 = 0;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0161  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0162  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(int i, boolean z, String str, int i2, int i3, java.lang.Object[] objArr) {
            throw new UnsupportedOperationException("Method not decompiled");
        }

        private static void b_REMOVED(int i, boolean z, String str, int i2, int i3, java.lang.Object[] objArr) {
            char[] charArray;
            int i4;
            Throwable cause;
            int i5;
            char c;
            int i6;
            int i7 = $10 + 11;
            $11 = i7 % 128;
            int i8 = 0;
            if (i7 % 2 == 0) {
                int i9 = 87 / 0;
            }
            char[] cArr = charArray;
            com.d.e.Action action = new com.d.e.Action();
            char[] cArr2 = new char[i];
            action.valueOf = 0;
            while (true) {
                int i10 = action.valueOf;
                if (i10 >= i) {
                    break;
                }
                char c2 = cArr[i10];
                action.values = c2;
                char c3 = (char) (i3 + c2);
                cArr2[i10] = c3;
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[2];
                    objArr2[1] = Integer.valueOf(PngjBadSignature);
                    objArr2[i8] = Integer.valueOf(c3);
                    java.lang.Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(610361420);
                    if (PngjBadSignature2 == null) {
                        char lastIndexOf = (char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', i8) + 1);
                        int scrollBarSize = 28 - (ViewConfiguration.getScrollBarSize() >> 8);
                        int axisFromString = 1530 - MotionEvent.axisFromString(BuildConfig.FLAVOR);
                        i6 = -743328348;
                        byte b = (byte) i8;
                        c = 1;
                        byte b2 = b;
                        i5 = i8;
                        String $$e = $$e(b, b2, (byte) (b2 | 14));
                        Class cls = Integer.TYPE;
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(lastIndexOf, scrollBarSize, axisFromString, -661778953, false, $$e, new Class[]{cls, cls});
                    } else {
                        i5 = i8;
                        c = 1;
                        i6 = -743328348;
                    }
                    cArr2[i10] = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr2)).charValue();
                    java.lang.Object[] objArr3 = new java.lang.Object[2];
                    objArr3[c] = action;
                    objArr3[i5] = action;
                    java.lang.Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i6);
                    if (PngjBadSignature3 == null) {
                        int i11 = i5;
                        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), TextUtils.getOffsetBefore(BuildConfig.FLAVOR, i11) + 40, Color.green(i11) + 190, 794744863, false, "j", new Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((Method) PngjBadSignature3).invoke(null, objArr3);
                    i8 = 0;
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            if (i2 > 0) {
                action.PngjException = i2;
                char[] cArr3 = new char[i];
                i4 = 0;
                System.arraycopy(cArr2, 0, cArr3, 0, i);
                int i12 = action.PngjException;
                System.arraycopy(cArr3, 0, cArr2, i - i12, i12);
                int i13 = action.PngjException;
                System.arraycopy(cArr3, i13, cArr2, 0, i - i13);
            } else {
                i4 = 0;
            }
            if (z) {
                char[] cArr4 = new char[i];
                action.valueOf = i4;
                $11 = ($10 + 91) % 128;
                while (true) {
                    int i14 = action.valueOf;
                    if (i14 >= i) {
                        break;
                    }
                    $11 = ($10 + 99) % 128;
                    cArr4[i14] = cArr2[(i - i14) - 1];
                    java.lang.Object[] objArr4 = {action, action};
                    java.lang.Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-743328348);
                    if (PngjBadSignature4 == null) {
                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getTapTimeout() >> 16), 40 - (ViewConfiguration.getJumpTapTimeout() >> 16), 190 - (ViewConfiguration.getJumpTapTimeout() >> 16), 794744863, false, "j", new Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((Method) PngjBadSignature4).invoke(null, objArr4);
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static void c(String str, int i, char c, String str2, String str3, java.lang.Object[] objArr) {
            char[] cArr;
            int i2;
            long j;
            char[] cArr2;
            int i3;
            char c2;
            $11 = ($10 + 125) % 128;
            char[] charArray = str3 != 0 ? str3.toCharArray() : str3;
            if (str2 != null) {
                $11 = ($10 + 33) % 128;
                cArr = str2.toCharArray();
                $10 = ($11 + 63) % 128;
            } else {
                cArr = str2;
            }
            char[] cArr3 = cArr;
            char[] charArray2 = str != null ? str.toCharArray() : str;
            com.d.e.getPadSub2 getpadsub2 = new com.d.e.getPadSub2();
            int length = charArray2.length;
            char[] cArr4 = new char[length];
            int length2 = cArr3.length;
            char[] cArr5 = new char[length2];
            int i4 = 0;
            System.arraycopy(charArray2, 0, cArr4, 0, length);
            System.arraycopy(cArr3, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            int i5 = 2;
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = charArray.length;
            char[] cArr6 = new char[length3];
            getpadsub2.PngjBadSignature = 0;
            while (getpadsub2.PngjBadSignature < length3) {
                try {
                    java.lang.Object[] objArr2 = {getpadsub2};
                    java.lang.Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(152054586);
                    if (PngjBadSignature2 == null) {
                        byte b = (byte) i4;
                        byte b2 = b;
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (Process.myTid() >> 22), Color.argb(i4, i4, i4, i4) + 28, 1855 - (ViewConfiguration.getLongPressTimeout() >> 16), -167819647, false, $$e(b, b2, b2), new Class[]{java.lang.Object.class});
                    }
                    int intValue = ((Integer) ((Method) PngjBadSignature2).invoke(null, objArr2)).intValue();
                    java.lang.Object[] objArr3 = {getpadsub2};
                    java.lang.Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1496933771);
                    if (PngjBadSignature3 == null) {
                        j = 0;
                        byte b3 = (byte) i4;
                        byte b4 = b3;
                        i2 = i5;
                        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((Process.myPid() >> 22) + 35511), 42 - (ViewConfiguration.getLongPressTimeout() >> 16), 508 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1512699854, false, $$e(b3, b4, (byte) (b4 | 50)), new Class[]{java.lang.Object.class});
                    } else {
                        i2 = i5;
                        j = 0;
                    }
                    int intValue2 = ((Integer) ((Method) PngjBadSignature3).invoke(null, objArr3)).intValue();
                    int i6 = cArr4[getpadsub2.PngjBadSignature % 4] * 32718;
                    java.lang.Object[] objArr4 = new java.lang.Object[3];
                    objArr4[i2] = Integer.valueOf(cArr5[intValue]);
                    objArr4[1] = Integer.valueOf(i6);
                    objArr4[i4] = getpadsub2;
                    java.lang.Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1094318588);
                    Class cls = Integer.TYPE;
                    if (PngjBadSignature4 == null) {
                        char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                        int i7 = 32 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1));
                        c2 = 1;
                        int offsetAfter = 247 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, i4);
                        byte b5 = (byte) i4;
                        i3 = i4;
                        byte b6 = b5;
                        cArr2 = charArray;
                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(modifierMetaStateMask, i7, offsetAfter, 1110010815, false, $$e(b5, b6, (byte) (b6 | 51)), new Class[]{java.lang.Object.class, cls, cls});
                    } else {
                        cArr2 = charArray;
                        i3 = i4;
                        c2 = 1;
                    }
                    ((Method) PngjBadSignature4).invoke(null, objArr4);
                    int i8 = cArr4[intValue2] * 32718;
                    int i9 = i2;
                    java.lang.Object[] objArr5 = new java.lang.Object[i9];
                    objArr5[c2] = Integer.valueOf(cArr5[intValue]);
                    objArr5[i3] = Integer.valueOf(i8);
                    java.lang.Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-2032891769);
                    if (PngjBadSignature5 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) TextUtils.getOffsetAfter(BuildConfig.FLAVOR, i3), (ViewConfiguration.getFadingEdgeLength() >> 16) + 37, 549 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 2050745660, false, $$e(b7, b8, (byte) (b8 | 52)), new Class[]{cls, cls});
                    }
                    cArr5[intValue2] = ((Character) ((Method) PngjBadSignature5).invoke(null, objArr5)).charValue();
                    cArr4[intValue2] = getpadsub2.values;
                    int i10 = getpadsub2.PngjBadSignature;
                    cArr6[i10] = (char) ((((0 ^ cArr2[i10]) ^ (valueOf ^ 698259225915410659L)) ^ ((int) (values ^ 698259225915410659L))) ^ ((char) (PngjBadCrcException ^ 698259225915410659L)));
                    getpadsub2.PngjBadSignature = i10 + 1;
                    charArray = cArr2;
                    i5 = i9;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr6);
        }

        public static void init$0() {
            $$a = new byte[]{126, 106, 85, 73, -29, 13, 28};
            $$b = 53;
        }

        public static void init$1() {
            $$c = new byte[]{5, -80, 22, 85};
            $$d = 63;
        }

        @Override // com.android.volley.RetryPolicy
        public final int getCurrentRetryCount() {
            int i = (PngjUnsupportedException + 41) % 128;
            PngjOutputException = i;
            int i2 = i + 107;
            PngjUnsupportedException = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 66 / 0;
            }
            return 0;
        }

        @Override // com.android.volley.RetryPolicy
        public final int getCurrentTimeout() {
            int i = (PngjOutputException + 123) % 128;
            PngjUnsupportedException = i;
            PngjOutputException = (i + 111) % 128;
            return 0;
        }

        @Override // com.android.volley.RetryPolicy
        public final void retry(VolleyError volleyError) {
            PngjOutputException = (PngjUnsupportedException + 1) % 128;
        }
    }

    public static int values() {
        int i = PngjBadCrcException;
        int i2 = i % 6910550;
        PngjBadCrcException = i + 1;
        if (i2 != 0) {
            return valueOf;
        }
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        valueOf = startElapsedRealtime;
        return startElapsedRealtime;
    }

    public final void PngjBadSignature(Context context, String str, PngjPrematureEnding pngjPrematureEnding) {
        JSONObject jSONObject;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("type", "FINGER");
            jSONObject = new JSONObject(hashMap);
            getPadSub2.PngjException("TAG", "? ?".concat(String.valueOf(jSONObject)));
        } catch (Exception e) {
            e = e;
        }
        try {
            PngjBadSignature pngjBadSignature = new PngjBadSignature(str, new PngjException(pngjPrematureEnding), new PngjBadCrcException(pngjPrematureEnding), jSONObject);
            pngjBadSignature.setRetryPolicy(new values());
            Volley.newRequestQueue(context, new com.identy.app.PngjInputException(context)).add(pngjBadSignature);
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
        }
    }
}
