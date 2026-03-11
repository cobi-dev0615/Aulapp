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
            int i7 = 0;
            int i3 = 3 - (i * 3);
            int i4 = s * 3;
            int i5 = b + 97;
            byte[] bArr = $$c;
            byte[] bArr2 = new byte[i4 + 1];
            if (bArr == null) {
                int i6 = i4;
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
                    return new String(bArr2, 0);
                }
            } else {
                i2 = 0;
                bArr2[i2] = (byte) i5;
                i3++;
                i7 = i2 + 1;
                if (i2 == i4) {
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
            byte[] bArr = null;
            if (str3 != null) {
                try {
                    bArr = str3.getBytes("ISO-8859-1");
                } catch (java.io.UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                }
            }
            byte[] bArr2 = bArr;
            char[] charArray = str != null ? str.toCharArray() : null;
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
                            cArr2[i4] = ((Character) ((java.lang.reflect.Method) PngjBadSignature2).invoke(null, objArr2)).charValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();

                            if (cause == null) {

                                throw new RuntimeException(th);

                            }

                            throw new RuntimeException(cause);
                        }
                    } else {
                        try {
                            java.lang.Object[] objArr3 = {Integer.valueOf(cArr[i4])};
                            java.lang.Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(358189806);
                            if (PngjBadSignature3 == null) {
                                PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 27092), 37 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), 118 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), -373889195, false, "b", new Class[]{cls});
                            }
                            cArr2[i4] = ((Character) ((java.lang.reflect.Method) PngjBadSignature3).invoke(null, objArr3)).charValue();
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
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
            int intValue;
            try {
                intValue = ((Integer) ((java.lang.reflect.Method) PngjBadSignature4).invoke(null, objArr4)).intValue();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
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
                    try { ((java.lang.reflect.Method) PngjBadSignature5).invoke(null, objArr5); } catch (Exception e) { throw new RuntimeException(e); }
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
                    try { ((java.lang.reflect.Method) PngjBadSignature6).invoke(null, objArr6); } catch (Exception e) { throw new RuntimeException(e); }
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
            char[] charArray = str != null ? str.toCharArray() : null;
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
                    jArr[i4] = ((Long) ((java.lang.reflect.Method) PngjBadSignature2).invoke(null, objArr2)).longValue() ^ (PngjInputException ^ 2636593786896957769L);
                    java.lang.Object[] objArr3 = new java.lang.Object[2];
                    objArr3[c] = pngjUnsupportedException;
                    objArr3[0] = pngjUnsupportedException;
                    java.lang.Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                    if (PngjBadSignature3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (i2 - (Process.myTid() >> 22)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 42, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 507, 74289954, false, $$e(b2, b3, (byte) (b3 | 23)), new Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) PngjBadSignature3).invoke(null, objArr3);
                } catch (Throwable th) {

                    Throwable cause2 = th.getCause();

                    if (cause2 != null) {

                        throw new RuntimeException(cause2);

                    }

                    throw new RuntimeException(th);

                }
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
                    try { ((java.lang.reflect.Method) PngjBadSignature4).invoke(null, objArr4); } catch (Exception e) { throw new RuntimeException(e); }
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
                    try { ((java.lang.reflect.Method) PngjBadSignature5).invoke(null, objArr5); } catch (Exception e) { throw new RuntimeException(e); }
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
                    return new String(bArr2, 0);
                }
            } else {
                i4 = 0;
                bArr2[i4] = (byte) i7;
                if (i4 == i8) {
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
            byte[] bArr2 = null;
            if (str2 != null) {
                try {
                    bArr2 = str2.getBytes("ISO-8859-1");
                } catch (java.io.UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                }
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
                        cArr3[i8] = ((Character) ((java.lang.reflect.Method) PngjBadSignature).invoke(null, objArr2)).charValue();
                        i8++;
                        i5 = i9;
                        b2 = b;
                        bArr3 = bArr;
                        i2 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();

                        if (cause == null) {

                            throw new RuntimeException(th);

                        }

                        throw new RuntimeException(cause);
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
                        try { cArr5[i11] = ((Character) ((java.lang.reflect.Method) PngjBadSignature2).invoke(null, objArr3)).charValue(); } catch (Exception e) { throw new RuntimeException(e); }
                    } else {
                        java.lang.Object[] objArr4 = {Integer.valueOf(cArr4[i11]), Integer.valueOf(c)};
                        java.lang.Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(269554740);
                        if (PngjBadSignature3 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) Color.alpha(0), 35 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1598 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -318867057, false, $$e(b8, b9, (byte) (b9 + 3)), new Class[]{cls, cls});
                        }
                        try { cArr5[i11] = ((Character) ((java.lang.reflect.Method) PngjBadSignature3).invoke(null, objArr4)).charValue(); } catch (Exception e) { throw new RuntimeException(e); }
                    }
                    c = cArr5[e1Var.PngjBadSignature];
                    java.lang.Object[] objArr5 = {e1Var, e1Var};
                    java.lang.Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1060060353);
                    if (PngjBadSignature4 == null) {
                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 36, Color.green(0) + ModuleDescriptor.MODULE_VERSION, -1010806406, false, "g", new Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    try { ((java.lang.reflect.Method) PngjBadSignature4).invoke(null, objArr5); } catch (Exception e) { throw new RuntimeException(e); }
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
                s4 = (short) (s3 + 1);
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
                cArr = null;
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
                    values[i2] = ((Character) ((java.lang.reflect.Method) PngjBadSignature).invoke(null, objArr2)).charValue();
                    java.lang.Object[] objArr3 = {aVar, aVar};
                    java.lang.Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1405973094);
                    if (PngjBadSignature2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (14830 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 27 - ((byte) KeyEvent.getModifierMetaStateMask()), 721 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1356718115, false, $$e(b, b2, (byte) (b2 | 8)), new Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) PngjBadSignature2).invoke(null, objArr3);
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
                    return new String(bArr2, 0);
                }
            } else {
                i = 0;
                int i1022 = i4 + 1;
                i2 = i + 1;
                bArr2[i] = (byte) i3;
                if (i2 == i5) {
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


        /* JADX WARN: Multi-variable type inference failed */
        private static void c(String str, int i, char c, String str2, String str3, java.lang.Object[] objArr) {
            char[] cArr;
            int i2;
            long j;
            char[] cArr2;
            int i3;
            char c2;
            $11 = ($10 + 125) % 128;
            char[] charArray = str3 != null ? str3.toCharArray() : new char[0];
            if (str2 != null) {
                $11 = ($10 + 33) % 128;
                cArr = str2.toCharArray();
                $10 = ($11 + 63) % 128;
            } else {
                cArr = null;
            }
            char[] cArr3 = cArr;
            char[] charArray2 = str != null ? str.toCharArray() : null;
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
                    int intValue = ((Integer) ((java.lang.reflect.Method) PngjBadSignature2).invoke(null, objArr2)).intValue();
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
                    int intValue2 = ((Integer) ((java.lang.reflect.Method) PngjBadSignature3).invoke(null, objArr3)).intValue();
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
                    ((java.lang.reflect.Method) PngjBadSignature4).invoke(null, objArr4);
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
                    cArr5[intValue2] = ((Character) ((java.lang.reflect.Method) PngjBadSignature5).invoke(null, objArr5)).charValue();
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

                        throw new RuntimeException(th);

                    }

                    throw new RuntimeException(cause);
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
        JSONObject jSONObject = null;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("type", "FINGER");
            jSONObject = new JSONObject(hashMap);
            getPadSub2.PngjException("TAG", "? ?".concat(String.valueOf(jSONObject)));
        } catch (Exception e) {
        }
        try {
            PngjBadSignature pngjBadSignature = new PngjBadSignature(str, new PngjException(pngjPrematureEnding), new PngjBadCrcException(pngjPrematureEnding), jSONObject);
            pngjBadSignature.setRetryPolicy(new values());
            Volley.newRequestQueue(context, new com.identy.app.PngjInputException(context)).add(pngjBadSignature);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
