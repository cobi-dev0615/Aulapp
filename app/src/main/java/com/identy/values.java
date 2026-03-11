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
import android.util.Base64;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import co.ceduladigital.sdk.x5;
import com.a.e.d.PngjBadCrcException;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.identy.isAuthSucess;
import com.karumi.dexter.BuildConfig;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class values {
    private static  byte[] $$a = null;
    private static  int $$b = 0;
    private static char[] PngjBadSignature;
    private static char valueOf;

    public static class PngjBadCrcException extends com.a.e.d.PngjBadCrcException {
        public static int PngjBadCrcException;
        public static int PngjException;
        private /* synthetic */ String PngjBadSignature;
        private /* synthetic */ String valueOf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PngjBadCrcException(String str, Response.Listener listener, Response.ErrorListener errorListener, String str2, String str3) {
            super(1, str, listener, errorListener);
            this.valueOf = str2;
            this.PngjBadSignature = str3;
        }

        public static int PngjException() {
            int i = PngjBadCrcException;
            int i2 = i % 9158661;
            PngjBadCrcException = i + 1;
            if (i2 != 0) {
                return PngjException;
            }
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            PngjException = startUptimeMillis;
            return startUptimeMillis;
        }

        @Override // com.a.e.d.PngjBadCrcException
        public final Map PngjBadCrcException() {
            HashMap hashMap = new HashMap();
            long currentTimeMillis = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            sb.append(currentTimeMillis);
            sb.append(".txt");
            hashMap.put("file", new PngjBadCrcException.values(sb.toString(), this.valueOf.getBytes()));
            return hashMap;
        }

        @Override // com.android.volley.Request
        public final Map getHeaders() {
            HashMap hashMap = new HashMap();
            String str = this.PngjBadSignature;
            if (str != null) {
                hashMap.put("X-DEBUG", str);
            }
            return hashMap;
        }
    }

    public static class PngjBadSignature implements Response.ErrorListener {
        private static  byte[] $$a = null;
        private static  int $$b = 0;
        private static  byte[] $$c = null;
        private static  int $$d = 0;
        private static int $10;
        private static int $11;
        private static char PngjBadSignature;
        private static char[] PngjException;
        private static int PngjInputException;
        private static int PngjUnsupportedException;
        private static long valueOf;
        private static int values;
        private /* synthetic */ PngjPrematureEnding PngjBadCrcException;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0025). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$e(short s, int i, int i2) {
            int i3;
            int i4 = 1 - (s * 3);
            byte[] bArr = $$c;
            int i5 = i + 4;
            int i6 = 118 - i2;
            byte[] bArr2 = new byte[i4];
            if (bArr == null) {
                int i7 = i6;
                i3 = 0;
                i6 = i4;
                i6 += i7;
                i5++;
                bArr2[i3] = (byte) i6;
                i3++;
                if (i3 == i4) {
                    return new String(bArr2, 0);
                }
                i7 = bArr[i5];
                i6 += i7;
                i5++;
                bArr2[i3] = (byte) i6;
                i3++;
                if (i3 == i4) {
                    return new String(bArr2, 0);
                }
            } else {
                i3 = 0;
                i5++;
                bArr2[i3] = (byte) i6;
                i3++;
                if (i3 == i4) {
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
            PngjInputException = 1;
            valueOf = 698259225915410659L;
            values = -666360772;
            PngjBadSignature = (char) 51427;
            PngjException = new char[]{40099, 40188, 40177, 40186, 40167, 40189, 40171, 40343, 40337, 40340, 40041, 40043, 40338, 40337, 40109, 40191, 40191, 40167, 40160, 40191, 40182, 40183, 40185, 40165, 40179, 40179, 40153, 40153, 40189, 40184, 40167, 40162, 40162, 40132, 40133, 40191, 40184, 40184, 40189, 40164, 40165, 40155, 40154, 40164, 40185, 40034, 40332, 40323, 40033, 40044, 40323, 40323, 40334, 40041, 40045, 40332, 40323, 40327, 40032, 40032, 40324, 40347, 40323, 40334, 40327, 40324, 40345, 40327, 40320, 40033, 40040, 40322, 40131, 39993, 39967, 39954, 39989, 39988, 39996, 39999, 39984, 39989, 39946, 39984, 39985, 40184, 40109, 40162, 40187, 40188, 40177, 40180, 40183, 40182, 40140, 39995, 39993, 39968, 39970, 39969, 39978, 39971, 39969, 40096, 40178, 40188, 40179, 40179, 40190, 40099, 40165, 40165, 40187, 40184, 40108, 40190, 40191, 40184, 40152, 40154, 40154, 39937, 40098, 40185, 40191, 40185, 40190, 40176, 40177, 40157, 40132, 40190, 39936, 40376, 40371, 40371, 40371, 40372, 40368, 40380, 40381, 40369, 40372, 40370, 40376, 40377, 40109, 40191, 40189, 40186, 40166, 40165, 40165, 40371, 40357, 40381, 40374, 40377, 40382, 40335, 40109, 40167, 40110, 40165, 40189, 40178, 40176, 40178, 40179, 40189, 40185, 40177, 40183, 40186, 40186, 40164, 40191, 40189, 40167, 40189, 40190, 40167, 39943, 40378, 40364, 40364, 40357, 40381, 40109, 40160, 39961, 40324, 40324, 40333, 40034, 40033, 40325, 40321, 40323, 40320, 40320, 40325, 40345, 40324, 40333, 40334, 40178, 40007, 40027, 40025, 40027, 40029, 40019, 40026, 40012, 40111, 40164, 40191, 40189, 40181, 40188, 40191, 40178, 40183, 40176, 40191, 40190, 40190, 40166, 40165, 40144, 39959, 39952, 39965, 39967, 39940, 39961, 39962, 39960, 39955, 39953, 40169, 39953, 39942, 40067, 40157, 40176, 40185, 40120, 40174, 39947, 39947, 39944, 39937, 39942, 40163, 40168, 39938, 39962, 39936, 40169, 40046, 40044, 40038, 40006, 40004, 40059, 40037, 40034, 40038, 40027, 40001, 40035, 40101, 40186, 40185, 40179, 40186, 40191, 40178, 40189, 40185, 40186, 40189, 40031, 40053, 40011, 39950, 40027, 40054, 40011, 39950, 40052, 40001, 40014, 40001, 40014, 40015, 40013, 40005, 40025, 40004, 40109, 40167, 40165, 40186, 40191, 40191, 40190, 40067, 40153, 40178, 40182, 40189, 40185, 40153, 40156, 40190, 40190, 40182, 40157, 40067, 40154, 40191, 40177, 40156, 40153, 40178, 40182, 40189, 40185, 40153, 40156, 40190, 40190, 40182, 40157, 40100, 40178, 40153, 40135, 40185, 40177, 40191, 40154, 40123, 40157, 40182, 40190, 40190, 40156, 40153, 40185, 40189, 40067, 40133, 40190, 40177, 40191, 40154, 40109, 40133, 40123, 40158, 40177, 40183, 40190, 40187, 40190, 40177, 40183, 40158, 40154, 40191, 40177, 40156, 40154, 40189, 40184, 40167, 40162, 40102, 40157, 40135, 40185, 40177, 40191, 40154, 40123, 40133, 40162, 40162, 40167, 40184, 40189, 40154, 40133, 40067, 40134, 40160, 40166, 40132, 40156, 40177, 40191, 40154, 40079, 40099, 40130, 40167, 40185, 40132, 40142, 40168, 40017, 39989, 39937, 39948, 40023, 39943, 40178, 40019, 39987, 39961, 39993, 40027, 40320, 40340, 40014, 40327, 40334, 40345, 40332, 40014, 40345, 40374, 40345, 40322, 40324, 40345, 40325, 40330};
        }

        public PngjBadSignature(PngjPrematureEnding pngjPrematureEnding) {
            this.PngjBadCrcException = pngjPrematureEnding;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x0025). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(int i, int i2, short s, java.lang.Object[] objArr) {
            int i3;
            int i4 = i + 97;
            byte[] bArr = $$a;
            int i5 = 5 - s;
            byte[] bArr2 = new byte[3 - i2];
            int i6 = 2 - i2;
            if (bArr == null) {
                int i7 = i6;
                i4 = i5;
                i3 = 0;
                i5++;
                i4 = (i4 + (-i7)) - 23;
                bArr2[i3] = (byte) i4;
                if (i3 == i6) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i3++;
                i7 = bArr[i5];
                i5++;
                i4 = (i4 + (-i7)) - 23;
                bArr2[i3] = (byte) i4;
                if (i3 == i6) {
                }
            } else {
                i3 = 0;
                bArr2[i3] = (byte) i4;
                if (i3 == i6) {
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static void b(char c, String str, String str2, int i, String str3, java.lang.Object[] objArr) {
            char[] cArr;
            char[] cArr2;
            long j;
            int i2;
            int i3;
            int i4;
            char c2;
            $11 = ($10 + 9) % 128;
            if (str3 != null) {
                cArr = str3.toCharArray();
                $11 = ($10 + 91) % 128;
            } else {
                cArr = null;
            }
            char[] cArr3 = cArr;
            char[] charArray = str2 != null ? str2.toCharArray() : null;
            if (str != null) {
                $10 = ($11 + 31) % 128;
                cArr2 = str.toCharArray();
            } else {
                cArr2 = null;
            }
            char[] cArr4 = cArr2;
            com.d.e.getPadSub2 getpadsub2 = new com.d.e.getPadSub2();
            int length = cArr3.length;
            char[] cArr5 = new char[length];
            int length2 = cArr4.length;
            char[] cArr6 = new char[length2];
            int i5 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, length);
            System.arraycopy(cArr4, 0, cArr6, 0, length2);
            cArr5[0] = (char) (cArr5[0] ^ c);
            int i6 = 2;
            cArr6[2] = (char) (cArr6[2] + ((char) i));
            int length3 = charArray.length;
            char[] cArr7 = new char[length3];
            getpadsub2.PngjBadSignature = 0;
            while (getpadsub2.PngjBadSignature < length3) {
                try {
                    java.lang.Object[] objArr2 = {getpadsub2};
                    java.lang.Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(152054586);
                    if (PngjBadSignature2 == null) {
                        byte b = (byte) i5;
                        j = 0;
                        byte b2 = (byte) (b - 1);
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), ExpandableListView.getPackedPositionType(0L) + 28, 1855 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -167819647, false, $$e(b, b2, (byte) (b2 + 1)), new Class[]{java.lang.Object.class});
                    } else {
                        j = 0;
                    }
                    int intValue; try { intValue = ((Integer) ((Method) PngjBadSignature2).invoke(null, objArr2)).intValue(); } catch (Exception e) { throw new RuntimeException(e); }
                    java.lang.Object[] objArr3 = {getpadsub2};
                    java.lang.Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1496933771);
                    if (PngjBadSignature3 == null) {
                        byte b3 = (byte) i5;
                        i2 = i6;
                        byte b4 = (byte) (b3 - 1);
                        i3 = i5;
                        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (35511 - TextUtils.getCapsMode(BuildConfig.FLAVOR, i5, i5)), (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 41, 507 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, i5), 1512699854, false, $$e(b3, b4, (byte) (b4 & 50)), new Class[]{java.lang.Object.class});
                    } else {
                        i2 = i6;
                        i3 = i5;
                    }
                    int intValue2; try { intValue2 = ((Integer) ((Method) PngjBadSignature3).invoke(null, objArr3)).intValue(); } catch (Exception e) { throw new RuntimeException(e); }
                    int i7 = cArr5[getpadsub2.PngjBadSignature % 4] * 32718;
                    java.lang.Object[] objArr4 = new java.lang.Object[3];
                    objArr4[i2] = Integer.valueOf(cArr6[intValue]);
                    objArr4[1] = Integer.valueOf(i7);
                    objArr4[i3] = getpadsub2;
                    java.lang.Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1094318588);
                    Class cls = Integer.TYPE;
                    if (PngjBadSignature4 == null) {
                        c2 = 1;
                        byte b5 = (byte) i3;
                        byte b6 = (byte) (b5 - 1);
                        i4 = intValue2;
                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 31 - (CdmaCellLocation.convertQuartSecToDecDegrees(i3) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i3) == 0.0d ? 0 : -1)), 247 - (ViewConfiguration.getEdgeSlop() >> 16), 1110010815, false, $$e(b5, b6, (byte) (b6 & 51)), new Class[]{java.lang.Object.class, cls, cls});
                    } else {
                        i4 = intValue2;
                        c2 = 1;
                    }
                    try { ((Method) PngjBadSignature4).invoke(null, objArr4); } catch (Exception e) { throw new RuntimeException(e); }
                    int i8 = cArr5[i4] * 32718;
                    int i9 = i2;
                    java.lang.Object[] objArr5 = new java.lang.Object[i9];
                    objArr5[c2] = Integer.valueOf(cArr6[intValue]);
                    objArr5[0] = Integer.valueOf(i8);
                    java.lang.Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-2032891769);
                    if (PngjBadSignature5 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 - 1);
                        PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 1), Color.blue(0) + 37, 550 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)), 2050745660, false, $$e(b7, b8, (byte) (b8 & 52)), new Class[]{cls, cls});
                    }
                    try { cArr6[i4] = ((Character) ((Method) PngjBadSignature5).invoke(null, objArr5)).charValue(); } catch (Exception e) { throw new RuntimeException(e); }
                    cArr5[i4] = getpadsub2.values;
                    int i10 = getpadsub2.PngjBadSignature;
                    cArr7[i10] = (char) ((((0 ^ charArray[i10]) ^ (valueOf ^ 698259225915410659L)) ^ ((int) (values ^ 698259225915410659L))) ^ ((char) (PngjBadSignature ^ 698259225915410659L)));
                    getpadsub2.PngjBadSignature = i10 + 1;
                    i6 = i9;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();

                    if (cause == null) {

                        throw new RuntimeException(th);

                    }

                    throw new RuntimeException(cause);
                }
            }
            String str4 = new String(cArr7);
            $10 = ($11 + 57) % 128;
            objArr[0] = str4;
        }

        private static void c(String str, boolean z, int[] iArr, java.lang.Object[] objArr) {
            char c;
            long j;
            int i;
            byte[] bArr;
            String str2 = str;
            int i2 = ($11 + 67) % 128;
            $10 = i2;
            byte[] bArr2 = null;
            if (str2 != null) {
                $11 = (i2 + 9) % 128;
                try { bArr2 = str2.getBytes("ISO-8859-1"); } catch (java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
            }
            byte[] bArr3 = bArr2;
            com.d.e.e1 e1Var = new com.d.e.e1();
            int i3 = 0;
            int i4 = iArr[0];
            int i5 = iArr[1];
            int i6 = iArr[2];
            int i7 = iArr[3];
            char[] cArr = PngjException;
            Class cls = Integer.TYPE;
            if (cArr != null) {
                c = 3;
                $10 = ($11 + 71) % 128;
                int length = cArr.length;
                j = 0;
                char[] cArr2 = new char[length];
                int i8 = 0;
                while (i8 < length) {
                    $11 = ($10 + 103) % 128;
                    try {
                        java.lang.Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                        java.lang.Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-259747866);
                        if (PngjBadSignature2 == null) {
                            char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                            int pressedStateDuration = 35 - (ViewConfiguration.getPressedStateDuration() >> 16);
                            int i9 = 1313 - (ExpandableListView.getPackedPositionForGroup(i3) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i3) == 0L ? 0 : -1));
                            bArr = bArr3;
                            byte b = (byte) i3;
                            byte b2 = (byte) (b - 1);
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(longPressTimeout, pressedStateDuration, i9, 208396893, false, $$e(b, b2, (byte) (b2 & 18)), new Class[]{cls});
                        } else {
                            bArr = bArr3;
                        }
                        cArr2[i8] = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr2)).charValue();
                        i8++;
                        bArr3 = bArr;
                        i3 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();

                        if (cause == null) {

                            throw new RuntimeException(th);

                        }

                        throw new RuntimeException(cause);
                    }
                }
                cArr = cArr2;
            } else {
                c = 3;
                j = 0;
            }
            byte[] bArr4 = bArr3;
            char[] cArr3 = new char[i5];
            System.arraycopy(cArr, i4, cArr3, 0, i5);
            if (bArr4 != null) {
                char[] cArr4 = new char[i5];
                e1Var.PngjBadSignature = 0;
                $11 = ($10 + 55) % 128;
                char c2 = 0;
                while (true) {
                    int i10 = e1Var.PngjBadSignature;
                    if (i10 >= i5) {
                        break;
                    }
                    if (bArr4[i10] == 1) {
                        $11 = ($10 + 43) % 128;
                        java.lang.Object[] objArr3 = {Integer.valueOf(cArr3[i10]), Integer.valueOf(c2)};
                        java.lang.Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-655108508);
                        if (PngjBadSignature3 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = (byte) (b3 - 1);
                            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) + 31881), 31 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)), 1250 - ExpandableListView.getPackedPositionType(j), 605862879, false, $$e(b3, b4, (byte) (b4 & 19)), new Class[]{cls, cls});
                        }
                        try { cArr4[i10] = ((Character) ((Method) PngjBadSignature3).invoke(null, objArr3)).charValue(); } catch (Exception e) { throw new RuntimeException(e); }
                        $10 = ($11 + 109) % 128;
                    } else {
                        java.lang.Object[] objArr4 = {Integer.valueOf(cArr3[i10]), Integer.valueOf(c2)};
                        java.lang.Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(269554740);
                        if (PngjBadSignature4 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = (byte) (b5 - 1);
                            PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (1 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1))), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 36, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1597, -318867057, false, $$e(b5, b6, (byte) (b6 & 16)), new Class[]{cls, cls});
                        }
                        try { cArr4[i10] = ((Character) ((Method) PngjBadSignature4).invoke(null, objArr4)).charValue(); } catch (Exception e) { throw new RuntimeException(e); }
                    }
                    c2 = cArr4[e1Var.PngjBadSignature];
                    java.lang.Object[] objArr5 = {e1Var, e1Var};
                    java.lang.Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1060060353);
                    if (PngjBadSignature5 == null) {
                        PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getTapTimeout() >> 16), 34 - ((byte) KeyEvent.getModifierMetaStateMask()), (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 156, -1010806406, false, "g", new Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    try { ((Method) PngjBadSignature5).invoke(null, objArr5); } catch (Exception e) { throw new RuntimeException(e); }
                }
                cArr3 = cArr4;
            }
            if (i7 > 0) {
                $11 = ($10 + 95) % 128;
                char[] cArr5 = new char[i5];
                i = 0;
                System.arraycopy(cArr3, 0, cArr5, 0, i5);
                int i11 = i5 - i7;
                System.arraycopy(cArr5, 0, cArr3, i11, i7);
                System.arraycopy(cArr5, i7, cArr3, 0, i11);
            } else {
                i = 0;
            }
            if (z) {
                char[] cArr6 = new char[i5];
                e1Var.PngjBadSignature = i;
                while (true) {
                    int i12 = e1Var.PngjBadSignature;
                    if (i12 >= i5) {
                        break;
                    }
                    cArr6[i12] = cArr3[(i5 - i12) - 1];
                    e1Var.PngjBadSignature = i12 + 1;
                }
                cArr3 = cArr6;
            }
            if (i6 > 0) {
                e1Var.PngjBadSignature = 0;
                while (true) {
                    int i13 = e1Var.PngjBadSignature;
                    if (i13 >= i5) {
                        break;
                    }
                    int i14 = $10 + 47;
                    $11 = i14 % 128;
                    if (i14 % 2 == 0) {
                        cArr3[i13] = (char) (cArr3[i13] / iArr[c]);
                    } else {
                        cArr3[i13] = (char) (cArr3[i13] - iArr[2]);
                        i13++;
                    }
                    e1Var.PngjBadSignature = i13;
                }
            }
            objArr[0] = new String(cArr3);
        }

        public static void init$0() {
            $$a = new byte[]{122, 44, -96, 114, 29, -13, -28};
            $$b = 146;
        }

        public static void init$1() {
            $$c = new byte[]{104, 100, -31, -82};
            $$d = 221;
        }

        /* JADX WARN: Code restructure failed: missing block: B:100:0x12e8, code lost:
        
            0 = -401238845;
            0 = ((-782) * 0) + (784 * 0);
            0 = -783;
            0 = ((0 ^ 0) * 0) + 0;
            0 = 0 ^ 0;
            0 = android.os.Process.myUid() ^ 0;
            0 = ((783 * (0 | ((0 | 0) ^ 0))) + ((0 * (((0 | 0) | 0) ^ 0)) + 0)) - 1315678422;
            0 = defpackage.a.a();
            0 = ((int) (0 >> 32)) & ((((~((~0) | (-506042135))) | 302089216) * 191) + ((((~((-506042135) | 0)) | 1943268545) * 191) + 1770321985));
            0 = ~android.os.Process.myTid();
            0 = ((int) 0) & defpackage.a.c((~(0 | (-1905789270))) | 1090521173, 933, (((~((-951951617) | 0)) | (-1905789270)) * (-933)) + 1985440908, 1338366354);
         */
        /* JADX WARN: Code restructure failed: missing block: B:101:0x1379, code lost:
        
            if (((0 & 0) | (0 ^ 0)) != 0) goto L148;
         */
        /* JADX WARN: Code restructure failed: missing block: B:102:0x137b, code lost:
        
            0 = com.identy.values.PngjBadSignature.PngjUnsupportedException;
            0 = 1;
            com.identy.values.PngjBadSignature.PngjInputException = ((0 ^ 109) + ((0 & 109) << 1)) % 128;
            0 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:104:0x138c, code lost:
        
            0 = -(-0);
            0 = ((0 | 0) << 0) - (0 ^ 0);
            0 = ((0 | 58) << 0) - (0 ^ 58);
            0 = ((0 & (-57)) << 0) + (0 ^ (-57));
         */
        /* JADX WARN: Code restructure failed: missing block: B:105:0x138a, code lost:
        
            0 = 1;
            0 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:107:0x12d9, code lost:
        
            0 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:110:0x13aa, code lost:
        
            if (0 < 25.2d) goto L155;
         */
        /* JADX WARN: Code restructure failed: missing block: B:111:0x13ac, code lost:
        
            0 = com.identy.values.PngjBadSignature.PngjInputException;
            com.identy.values.PngjBadSignature.PngjUnsupportedException = ((0 ^ 103) + ((0 & 103) << 1)) % 128;
            0 = new java.lang.Object[]{new int[]{0}, new int[1], null, new int[]{0}};
            0 = (~(0 & 261)) & (0 | 261);
            0 = (int) android.os.SystemClock.elapsedRealtime();
            0 = (((~(416960840 | 0)) | 617605133) * 672) + 926765589;
            0 = ~0;
            0 = (((~((-617605134) | 0)) | 604350469) * 672) + ((((~(0 | 617605133)) | (~((-416960841) | 0))) * (-672)) + 0);
            0 = -(-((0 ^ 16) + ((0 & 16) << 1)));
            0 = ((0 | 0) << 1) - (0 ^ 0);
            0 = (0 << 13) ^ 0;
            0 = 0 >>> 17;
            0 = ((~0) & 0) | ((~0) & 0);
            0 = 0 << 5;
            ((int[]) $$a[1])[0] = ((~0) & 0) | ((~0) & 0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:112:0x143a, code lost:
        
            return 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:120:0x1261, code lost:
        
            if ((0 | (0 & ((((~(200336606 | 0)) | (~(0 | (-1637563017)))) * 950) + ((((~((-1637563017) | 0)) | (~(0 | 200336606))) * (-950)) + ((((~(1637563016 | 0)) | (~((-200336607) | 0))) * 1900) - 1871736089))))) == 477111747) goto L136;
         */
        /* JADX WARN: Code restructure failed: missing block: B:428:0x2a73, code lost:
        
            if (0 == null) goto L359;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0460, code lost:
        
            if (((((int) (0 >> 32)) & defpackage.a.c(((~(138273982 | 0)) | (~((-1575500394) | 0))) | 1426582, -370, (((~(138273982 | 0)) | (~((-1575500394) | 0))) * (-370)) + 635053406, 527835340)) | (((int) 0) & defpackage.a.c((~(android.os.Process.myPid() | (-94970258))) | 268435456, 446, (((~((~0) | 805345804)) | (-900316062)) * 446) - 384374209, -2109005124))) != 477111747) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0774, code lost:
        
            if (android.os.Build.VERSION.SDK_INT <= 33) goto L84;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0776, code lost:
        
            0 = new java.lang.Object[1];
            c("\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001", false, new int[]{44, 28, 172, 0}, 0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:503:0x089b, code lost:
        
            0 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:504:0x089d, code lost:
        
            0 = 0;
            0 = new java.lang.Object[1];
            c("\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001", false, new int[]{72, 0, 61, 0}, 0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:505:0x08b4, code lost:
        
            0 = new java.lang.Object[]{(java.lang.String) $$a[0]};
            0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(547370249);
         */
        /* JADX WARN: Code restructure failed: missing block: B:506:0x08bc, code lost:
        
            if (0 != null) goto L88;
         */
        /* JADX WARN: Code restructure failed: missing block: B:507:0x08be, code lost:
        
            0 = (char) (8752 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
            0 = (android.view.ViewConfiguration.getTapTimeout() >> 16) + 24;
            0 = 336 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
            0 = (byte) 0;
            0 = (byte) (0 + 2);
            0 = new java.lang.Object[1];
            a(0, 0, (byte) (0 - 1), 0);
            0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(0, 0, 0, -598779726, false, (java.lang.String) $$a[0], new java.lang.Class[]{java.lang.String.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:508:0x0900, code lost:
        
            0 = ((java.lang.reflect.Method) 0).invoke(null, 0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:509:0x0907, code lost:
        
            0 = 1;
            0 = new java.lang.Object[1];
            c("\u0000", false, new int[]{85, 1, 167, 0}, 0);
            0 = 0.equals((java.lang.String) $$a[0]);
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x078d, code lost:
        
            0 = new java.lang.Object[]{(java.lang.String) $$a[0]};
            0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1666380462);
         */
        /* JADX WARN: Code restructure failed: missing block: B:516:0x056d, code lost:
        
            if (((0 & 0) | (0 ^ 0)) != 477111747) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0798, code lost:
        
            if (0 != null) goto L78;
         */
        /* JADX WARN: Code restructure failed: missing block: B:523:0x0668, code lost:
        
            if (((0 & 0) | (0 ^ 0)) != (-1032769152)) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x079a, code lost:
        
            0 = (char) android.view.View.resolveSize(0, 0);
            0 = 28 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16);
            0 = 1446 - android.text.TextUtils.indexOf((java.lang.CharSequence) com.karumi.dexter.BuildConfig.FLAVOR, '0');
            0 = (byte) 4;
            0 = (byte) (0 - 3);
            0 = new java.lang.Object[1];
            a(0, 0, 0, 0);
            0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(0, 0, 0, -1614962923, false, (java.lang.String) $$a[0], new java.lang.Class[]{java.lang.String.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:531:0x076e, code lost:
        
            if ((0 | (0 & (((0 | (-761521794)) * 245) + ((0 * (-245)) + 0)))) == 542074309) goto L72;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x07d6, code lost:
        
            0 = ((java.lang.Long) ((java.lang.reflect.Method) 0).invoke(null, 0)).longValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x07e3, code lost:
        
            0 = -279591644;
            0 = -575;
            0 = (0 * 0) + (0 * 0);
            0 = 576;
            0 = 0 ^ 0;
            0 = 0 ^ 0;
            0 = (0 | 0) ^ 0;
            0 = 0;
            0 = ((0 * 0) + (((((0 | 0) ^ 0) | (((0 | (0 ^ 0)) | 0) ^ 0)) * 0) + (((0 | ((0 | 0) ^ 0)) * 0) + 0))) + 750079961;
            0 = android.os.Process.myPid();
            0 = ~((-1732778608) | 0);
            0 = ~0;
            0 = ((int) (0 >> 32)) & ((((~(0 | 295552196)) | (~(1732778607 | 0))) * 406) + (((~((-17301573) | 0)) * (-406)) + (((0 | (~((-278250625) | 0))) * (-406)) + 305812002)));
            0 = android.os.Process.myPid();
            0 = ((1159825701 | 0) * 614) + 1969666967;
            0 = ~0;
            0 = ((int) 0) & ((((~(0 | (-138700355))) | (~(1298526055 | 0))) * 614) + (((((~(1296428903 | 0)) | 2097152) | (~((-140797507) | 0))) * (-1228)) + 0));
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x088a, code lost:
        
            if (((0 & 0) | (0 ^ 0)) != 1) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x088c, code lost:
        
            0 = com.identy.values.PngjBadSignature.PngjUnsupportedException;
            com.identy.values.PngjBadSignature.PngjInputException = ((0 & 11) + (0 | 11)) % 128;
            0 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0898, code lost:
        
            0 = 1;
            0 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0921, code lost:
        
            if ((0 ^ 0) == 0) goto L96;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0923, code lost:
        
            com.identy.values.PngjBadSignature.PngjUnsupportedException = (com.identy.values.PngjBadSignature.PngjInputException + 77) % 128;
            0 = new java.lang.Object[4];
            0 = new int[0];
            $$a[0] = 0;
            $$a[0] = new int[0];
            0 = new int[0];
            $$a[3] = 0;
            0 = (~(0 & 260)) & (0 | 260);
            $$a[0] = 0;
            $$a[0] = 0;
            $$a[2] = null;
            0 = (((~(((int) android.os.SystemClock.elapsedRealtime()) | 216704833)) | 806686740) * 658) + (((1012217173 | 0) * (-658)) - 1165362585);
            0 = (0 - (~(-(-((0 & 16) + (0 | 16)))))) - 1;
            0 = 0 << 13;
            0 = ((~0) & 0) | ((~0) & 0);
            0 = 0 >>> 17;
            0 = (0 | 0) & (~(0 & 0));
            0 = 0 << 5;
            ((int[]) $$a[1])[0] = (0 | 0) & (~(0 & 0));
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x099b, code lost:
        
            return 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x1151, code lost:
        
            if (((((int) (0 >> 32)) & ((0 * 880) + (((0 | 0) * (-880)) + 0))) | (((int) 0) & ((((~((-195683167) | 0)) | 1616123904) * 433) + ((((~(1632909576 | 0)) | (-195683167)) * (-433)) + (((~((-16785673) | 0)) * 433) + 1351065630))))) != 477111747) goto L128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x1263, code lost:
        
            0 = 0;
            0 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x1267, code lost:
        
            if (0 >= 28) goto L539;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x1269, code lost:
        
            0 = $$a[0];
            0 = new java.lang.Object[1];
            b((char) android.text.TextUtils.indexOf(com.karumi.dexter.BuildConfig.FLAVOR, com.karumi.dexter.BuildConfig.FLAVOR, 0, 0), "\u0000\u0000\u0000\u0000", "Ⲏ᭗崿쌩璽摛✾\u1cbb철ᲅꄖ䌌", ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1, "╼큠ᚦ薜", 0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x1294, code lost:
        
            0 = new java.lang.Object[]{((java.lang.String) $$a[0]).concat(java.lang.String.valueOf(0))};
            0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1934049891);
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x129f, code lost:
        
            if (0 != null) goto L143;
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x12a1, code lost:
        
            0 = (char) android.view.View.MeasureSpec.getSize(0);
            0 = 27 - android.widget.ExpandableListView.getPackedPositionChild(0);
            0 = android.view.KeyEvent.getDeadChar(0, 0) + 1447;
            0 = (byte) 0;
            0 = 0;
            0 = new java.lang.Object[1];
            a((byte) 15, 0, 0, 0);
            0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(0, 0, 0, -1884803112, false, (java.lang.String) $$a[0], new java.lang.Class[]{java.lang.String.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:99:0x12db, code lost:
        
            0 = ((java.lang.Long) ((java.lang.reflect.Method) 0).invoke(null, 0)).longValue();
         */
        /* JADX WARN: Multi-variable search skipped. Vars limit reached: 5951 (expected less than 5000) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:125:0x14ea A[Catch: all -> 0x3e18, TryCatch #12 {all -> 0x3e18, blocks: (B:3:0x0012, B:7:0x0023, B:8:0x0069, B:15:0x01b9, B:19:0x01ce, B:20:0x0210, B:31:0x0288, B:33:0x0292, B:34:0x02d4, B:36:0x02f0, B:38:0x02fa, B:39:0x0340, B:41:0x0349, B:43:0x035d, B:44:0x03a2, B:50:0x078d, B:52:0x079a, B:53:0x07d6, B:63:0x0dcc, B:65:0x0dd6, B:66:0x0e1f, B:69:0x0e56, B:71:0x0e65, B:72:0x0ea9, B:76:0x0f91, B:78:0x0f9b, B:79:0x0fd9, B:81:0x0ff5, B:83:0x0fff, B:84:0x1044, B:86:0x104d, B:88:0x1061, B:89:0x109f, B:96:0x1294, B:98:0x12a1, B:99:0x12db, B:115:0x1156, B:117:0x1168, B:118:0x11a0, B:123:0x14dd, B:125:0x14ea, B:126:0x152d, B:128:0x1601, B:130:0x160e, B:131:0x164c, B:141:0x1795, B:143:0x17a2, B:144:0x17de, B:146:0x18ad, B:148:0x18ba, B:149:0x18fc, B:165:0x1c6d, B:167:0x1c7a, B:168:0x1cbc, B:203:0x2296, B:205:0x22a0, B:206:0x22e1, B:209:0x2304, B:211:0x2313, B:212:0x2355, B:219:0x25e2, B:221:0x25ef, B:222:0x262f, B:232:0x27e6, B:234:0x280a, B:235:0x2845, B:275:0x2aee, B:277:0x2af4, B:278:0x2b30, B:292:0x3319, B:294:0x332a, B:295:0x336a, B:301:0x34e6, B:303:0x34ec, B:304:0x3527, B:310:0x36d3, B:312:0x36f7, B:313:0x373c, B:321:0x3897, B:323:0x38a4, B:324:0x38dc, B:332:0x39fc, B:334:0x3a02, B:335:0x3a3b, B:341:0x3b61, B:343:0x3b67, B:344:0x3ba2, B:350:0x3cad, B:352:0x3cd3, B:353:0x3d19, B:369:0x2c75, B:371:0x2c7b, B:372:0x2cb4, B:379:0x2e06, B:381:0x2e0c, B:382:0x2e4b, B:387:0x2f8e, B:389:0x2f94, B:390:0x2fd1, B:398:0x310e, B:400:0x3114, B:401:0x3157, B:505:0x08b4, B:507:0x08be, B:508:0x0900, B:512:0x046a, B:514:0x047c, B:515:0x04b8, B:518:0x0571, B:520:0x0585, B:521:0x05c1, B:526:0x066d, B:528:0x067f, B:529:0x06b9), top: B:2:0x0012 }] */
        /* JADX WARN: Removed duplicated region for block: B:130:0x160e A[Catch: all -> 0x3e18, TryCatch #12 {all -> 0x3e18, blocks: (B:3:0x0012, B:7:0x0023, B:8:0x0069, B:15:0x01b9, B:19:0x01ce, B:20:0x0210, B:31:0x0288, B:33:0x0292, B:34:0x02d4, B:36:0x02f0, B:38:0x02fa, B:39:0x0340, B:41:0x0349, B:43:0x035d, B:44:0x03a2, B:50:0x078d, B:52:0x079a, B:53:0x07d6, B:63:0x0dcc, B:65:0x0dd6, B:66:0x0e1f, B:69:0x0e56, B:71:0x0e65, B:72:0x0ea9, B:76:0x0f91, B:78:0x0f9b, B:79:0x0fd9, B:81:0x0ff5, B:83:0x0fff, B:84:0x1044, B:86:0x104d, B:88:0x1061, B:89:0x109f, B:96:0x1294, B:98:0x12a1, B:99:0x12db, B:115:0x1156, B:117:0x1168, B:118:0x11a0, B:123:0x14dd, B:125:0x14ea, B:126:0x152d, B:128:0x1601, B:130:0x160e, B:131:0x164c, B:141:0x1795, B:143:0x17a2, B:144:0x17de, B:146:0x18ad, B:148:0x18ba, B:149:0x18fc, B:165:0x1c6d, B:167:0x1c7a, B:168:0x1cbc, B:203:0x2296, B:205:0x22a0, B:206:0x22e1, B:209:0x2304, B:211:0x2313, B:212:0x2355, B:219:0x25e2, B:221:0x25ef, B:222:0x262f, B:232:0x27e6, B:234:0x280a, B:235:0x2845, B:275:0x2aee, B:277:0x2af4, B:278:0x2b30, B:292:0x3319, B:294:0x332a, B:295:0x336a, B:301:0x34e6, B:303:0x34ec, B:304:0x3527, B:310:0x36d3, B:312:0x36f7, B:313:0x373c, B:321:0x3897, B:323:0x38a4, B:324:0x38dc, B:332:0x39fc, B:334:0x3a02, B:335:0x3a3b, B:341:0x3b61, B:343:0x3b67, B:344:0x3ba2, B:350:0x3cad, B:352:0x3cd3, B:353:0x3d19, B:369:0x2c75, B:371:0x2c7b, B:372:0x2cb4, B:379:0x2e06, B:381:0x2e0c, B:382:0x2e4b, B:387:0x2f8e, B:389:0x2f94, B:390:0x2fd1, B:398:0x310e, B:400:0x3114, B:401:0x3157, B:505:0x08b4, B:507:0x08be, B:508:0x0900, B:512:0x046a, B:514:0x047c, B:515:0x04b8, B:518:0x0571, B:520:0x0585, B:521:0x05c1, B:526:0x066d, B:528:0x067f, B:529:0x06b9), top: B:2:0x0012 }] */
        /* JADX WARN: Removed duplicated region for block: B:143:0x17a2 A[Catch: all -> 0x3e18, TryCatch #12 {all -> 0x3e18, blocks: (B:3:0x0012, B:7:0x0023, B:8:0x0069, B:15:0x01b9, B:19:0x01ce, B:20:0x0210, B:31:0x0288, B:33:0x0292, B:34:0x02d4, B:36:0x02f0, B:38:0x02fa, B:39:0x0340, B:41:0x0349, B:43:0x035d, B:44:0x03a2, B:50:0x078d, B:52:0x079a, B:53:0x07d6, B:63:0x0dcc, B:65:0x0dd6, B:66:0x0e1f, B:69:0x0e56, B:71:0x0e65, B:72:0x0ea9, B:76:0x0f91, B:78:0x0f9b, B:79:0x0fd9, B:81:0x0ff5, B:83:0x0fff, B:84:0x1044, B:86:0x104d, B:88:0x1061, B:89:0x109f, B:96:0x1294, B:98:0x12a1, B:99:0x12db, B:115:0x1156, B:117:0x1168, B:118:0x11a0, B:123:0x14dd, B:125:0x14ea, B:126:0x152d, B:128:0x1601, B:130:0x160e, B:131:0x164c, B:141:0x1795, B:143:0x17a2, B:144:0x17de, B:146:0x18ad, B:148:0x18ba, B:149:0x18fc, B:165:0x1c6d, B:167:0x1c7a, B:168:0x1cbc, B:203:0x2296, B:205:0x22a0, B:206:0x22e1, B:209:0x2304, B:211:0x2313, B:212:0x2355, B:219:0x25e2, B:221:0x25ef, B:222:0x262f, B:232:0x27e6, B:234:0x280a, B:235:0x2845, B:275:0x2aee, B:277:0x2af4, B:278:0x2b30, B:292:0x3319, B:294:0x332a, B:295:0x336a, B:301:0x34e6, B:303:0x34ec, B:304:0x3527, B:310:0x36d3, B:312:0x36f7, B:313:0x373c, B:321:0x3897, B:323:0x38a4, B:324:0x38dc, B:332:0x39fc, B:334:0x3a02, B:335:0x3a3b, B:341:0x3b61, B:343:0x3b67, B:344:0x3ba2, B:350:0x3cad, B:352:0x3cd3, B:353:0x3d19, B:369:0x2c75, B:371:0x2c7b, B:372:0x2cb4, B:379:0x2e06, B:381:0x2e0c, B:382:0x2e4b, B:387:0x2f8e, B:389:0x2f94, B:390:0x2fd1, B:398:0x310e, B:400:0x3114, B:401:0x3157, B:505:0x08b4, B:507:0x08be, B:508:0x0900, B:512:0x046a, B:514:0x047c, B:515:0x04b8, B:518:0x0571, B:520:0x0585, B:521:0x05c1, B:526:0x066d, B:528:0x067f, B:529:0x06b9), top: B:2:0x0012 }] */
        /* JADX WARN: Removed duplicated region for block: B:148:0x18ba A[Catch: all -> 0x3e18, TryCatch #12 {all -> 0x3e18, blocks: (B:3:0x0012, B:7:0x0023, B:8:0x0069, B:15:0x01b9, B:19:0x01ce, B:20:0x0210, B:31:0x0288, B:33:0x0292, B:34:0x02d4, B:36:0x02f0, B:38:0x02fa, B:39:0x0340, B:41:0x0349, B:43:0x035d, B:44:0x03a2, B:50:0x078d, B:52:0x079a, B:53:0x07d6, B:63:0x0dcc, B:65:0x0dd6, B:66:0x0e1f, B:69:0x0e56, B:71:0x0e65, B:72:0x0ea9, B:76:0x0f91, B:78:0x0f9b, B:79:0x0fd9, B:81:0x0ff5, B:83:0x0fff, B:84:0x1044, B:86:0x104d, B:88:0x1061, B:89:0x109f, B:96:0x1294, B:98:0x12a1, B:99:0x12db, B:115:0x1156, B:117:0x1168, B:118:0x11a0, B:123:0x14dd, B:125:0x14ea, B:126:0x152d, B:128:0x1601, B:130:0x160e, B:131:0x164c, B:141:0x1795, B:143:0x17a2, B:144:0x17de, B:146:0x18ad, B:148:0x18ba, B:149:0x18fc, B:165:0x1c6d, B:167:0x1c7a, B:168:0x1cbc, B:203:0x2296, B:205:0x22a0, B:206:0x22e1, B:209:0x2304, B:211:0x2313, B:212:0x2355, B:219:0x25e2, B:221:0x25ef, B:222:0x262f, B:232:0x27e6, B:234:0x280a, B:235:0x2845, B:275:0x2aee, B:277:0x2af4, B:278:0x2b30, B:292:0x3319, B:294:0x332a, B:295:0x336a, B:301:0x34e6, B:303:0x34ec, B:304:0x3527, B:310:0x36d3, B:312:0x36f7, B:313:0x373c, B:321:0x3897, B:323:0x38a4, B:324:0x38dc, B:332:0x39fc, B:334:0x3a02, B:335:0x3a3b, B:341:0x3b61, B:343:0x3b67, B:344:0x3ba2, B:350:0x3cad, B:352:0x3cd3, B:353:0x3d19, B:369:0x2c75, B:371:0x2c7b, B:372:0x2cb4, B:379:0x2e06, B:381:0x2e0c, B:382:0x2e4b, B:387:0x2f8e, B:389:0x2f94, B:390:0x2fd1, B:398:0x310e, B:400:0x3114, B:401:0x3157, B:505:0x08b4, B:507:0x08be, B:508:0x0900, B:512:0x046a, B:514:0x047c, B:515:0x04b8, B:518:0x0571, B:520:0x0585, B:521:0x05c1, B:526:0x066d, B:528:0x067f, B:529:0x06b9), top: B:2:0x0012 }] */
        /* JADX WARN: Removed duplicated region for block: B:164:0x1c6b  */
        /* JADX WARN: Removed duplicated region for block: B:175:0x1dbe  */
        /* JADX WARN: Removed duplicated region for block: B:177:0x1e6f  */
        /* JADX WARN: Removed duplicated region for block: B:200:0x2192  */
        /* JADX WARN: Removed duplicated region for block: B:202:0x227f  */
        /* JADX WARN: Removed duplicated region for block: B:267:0x2a79  */
        /* JADX WARN: Removed duplicated region for block: B:270:0x2a82  */
        /* JADX WARN: Removed duplicated region for block: B:272:0x2a87  */
        /* JADX WARN: Removed duplicated region for block: B:274:0x2aeb  */
        /* JADX WARN: Removed duplicated region for block: B:290:0x3316 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:291:0x3317  */
        /* JADX WARN: Removed duplicated region for block: B:410:0x2a84  */
        /* JADX WARN: Removed duplicated region for block: B:411:0x2a7c  */
        /* JADX WARN: Removed duplicated region for block: B:499:0x1dbb A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:501:0x143b  */
        /* JADX WARN: Removed duplicated region for block: B:502:0x0e1d  */
        /* JADX WARN: Removed duplicated region for block: B:542:0x3e1f  */
        /* JADX WARN: Removed duplicated region for block: B:543:0x3e20  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0dd6 A[Catch: all -> 0x3e18, TryCatch #12 {all -> 0x3e18, blocks: (B:3:0x0012, B:7:0x0023, B:8:0x0069, B:15:0x01b9, B:19:0x01ce, B:20:0x0210, B:31:0x0288, B:33:0x0292, B:34:0x02d4, B:36:0x02f0, B:38:0x02fa, B:39:0x0340, B:41:0x0349, B:43:0x035d, B:44:0x03a2, B:50:0x078d, B:52:0x079a, B:53:0x07d6, B:63:0x0dcc, B:65:0x0dd6, B:66:0x0e1f, B:69:0x0e56, B:71:0x0e65, B:72:0x0ea9, B:76:0x0f91, B:78:0x0f9b, B:79:0x0fd9, B:81:0x0ff5, B:83:0x0fff, B:84:0x1044, B:86:0x104d, B:88:0x1061, B:89:0x109f, B:96:0x1294, B:98:0x12a1, B:99:0x12db, B:115:0x1156, B:117:0x1168, B:118:0x11a0, B:123:0x14dd, B:125:0x14ea, B:126:0x152d, B:128:0x1601, B:130:0x160e, B:131:0x164c, B:141:0x1795, B:143:0x17a2, B:144:0x17de, B:146:0x18ad, B:148:0x18ba, B:149:0x18fc, B:165:0x1c6d, B:167:0x1c7a, B:168:0x1cbc, B:203:0x2296, B:205:0x22a0, B:206:0x22e1, B:209:0x2304, B:211:0x2313, B:212:0x2355, B:219:0x25e2, B:221:0x25ef, B:222:0x262f, B:232:0x27e6, B:234:0x280a, B:235:0x2845, B:275:0x2aee, B:277:0x2af4, B:278:0x2b30, B:292:0x3319, B:294:0x332a, B:295:0x336a, B:301:0x34e6, B:303:0x34ec, B:304:0x3527, B:310:0x36d3, B:312:0x36f7, B:313:0x373c, B:321:0x3897, B:323:0x38a4, B:324:0x38dc, B:332:0x39fc, B:334:0x3a02, B:335:0x3a3b, B:341:0x3b61, B:343:0x3b67, B:344:0x3ba2, B:350:0x3cad, B:352:0x3cd3, B:353:0x3d19, B:369:0x2c75, B:371:0x2c7b, B:372:0x2cb4, B:379:0x2e06, B:381:0x2e0c, B:382:0x2e4b, B:387:0x2f8e, B:389:0x2f94, B:390:0x2fd1, B:398:0x310e, B:400:0x3114, B:401:0x3157, B:505:0x08b4, B:507:0x08be, B:508:0x0900, B:512:0x046a, B:514:0x047c, B:515:0x04b8, B:518:0x0571, B:520:0x0585, B:521:0x05c1, B:526:0x066d, B:528:0x067f, B:529:0x06b9), top: B:2:0x0012 }] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0e28  */
        /* JADX WARN: Type inference failed for: r0v919, types: [boolean] */
        /* JADX WARN: Type inference failed for: r8v647 */
        /* JADX WARN: Type inference failed for: r8v671 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static java.lang.Object[] values$1eba2e16(int i, java.lang.Object obj, int i2) {
            throw new UnsupportedOperationException("Method not decompiled");
        }


        @Override // com.android.volley.Response.ErrorListener
        public final void onErrorResponse(VolleyError volleyError) {
            boolean z;
            try {
                volleyError.printStackTrace();
                getPadSub2.PngjException("Response", "response ?".concat(new String(volleyError.toString())));
                getPadSub2.PngjException("Response", "response ?".concat(new String(volleyError.getMessage())));
                PngjPrematureEnding pngjPrematureEnding = this.PngjBadCrcException;
                if (volleyError instanceof AuthFailureError) {
                    z = false;
                } else {
                    int i = (PngjUnsupportedException + 5) % 128;
                    PngjInputException = i;
                    PngjUnsupportedException = (i + 15) % 128;
                    z = true;
                }
                int i2 = volleyError.networkResponse.statusCode;
                pngjPrematureEnding.PngjBadSignature(z);
            } catch (Exception e) {
                e.printStackTrace();
                this.PngjBadCrcException.PngjBadSignature(false);
            }
        }
    }

    public static class PngjException implements Response.Listener {
        public static int PngjBadCrcException;
        public static int PngjException;
        private /* synthetic */ PngjPrematureEnding values;

        public PngjException(PngjPrematureEnding pngjPrematureEnding) {
            this.values = pngjPrematureEnding;
        }

        public static int valueOf() {
            int i = PngjBadCrcException;
            int i2 = i % 8253562;
            PngjBadCrcException = i + 1;
            if (i2 != 0) {
                return PngjException;
            }
            int freeMemory = (int) Runtime.getRuntime().freeMemory();
            PngjException = freeMemory;
            return freeMemory;
        }

        @Override // com.android.volley.Response.Listener
        public final /* synthetic */ void onResponse(java.lang.Object obj) {
            NetworkResponse networkResponse = (NetworkResponse) obj;
            try {
                getPadSub2.PngjException("Response", "response ?".concat(new String(networkResponse.data)));
                this.values.valueOf(new JSONObject(new String(networkResponse.data)));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.identy.values$values, reason: collision with other inner class name */
    public static class C0027values implements RetryPolicy {
        @Override // com.android.volley.RetryPolicy
        public final int getCurrentRetryCount() {
            return 3;
        }

        @Override // com.android.volley.RetryPolicy
        public final int getCurrentTimeout() {
            return 500000;
        }

        @Override // com.android.volley.RetryPolicy
        public final void retry(VolleyError volleyError) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, byte b3) {
        int i;
        byte[] bArr = $$a;
        int i2 = b * 4;
        int i3 = (b3 * 2) + 4;
        int i4 = 121 - (b2 * 2);
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        if (bArr == null) {
            i4 = i5;
            byte[] bArr3 = bArr;
            int i6 = 0;
            int i7 = i3;
            i4 += i3;
            i3 = i7 + 1;
            bArr = bArr3;
            i = i6;
            bArr2[i] = (byte) i4;
            if (i == i5) {
                return new String(bArr2, 0);
            }
            byte b4 = bArr[i3];
            byte[] bArr4 = bArr;
            i7 = i3;
            i3 = b4;
            i6 = i + 1;
            bArr3 = bArr4;
            i4 += i3;
            i3 = i7 + 1;
            bArr = bArr3;
            i = i6;
            bArr2[i] = (byte) i4;
            if (i == i5) {
                return new String(bArr2, 0);
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i4;
            if (i == i5) {
                return new String(bArr2, 0);
            }
        }
        return new String(bArr2, 0);
    }

    static {
        init$0();
        PngjBadSignature = new char[]{298, 299, 315, 301, 312, 306, 317, 310, 305, 297, 308, 267, 314, 309, 304, 316, 288, 303, 266, 307, 302, 375, 296, 311, 300};
        valueOf = (char) 13510;
    }

    private static String PngjBadCrcException(Context context, String str, String str2, byte[] bArr, String str3, JSONArray jSONArray, PublicKey publicKey) {
        HashMap hashMap = new HashMap();
        hashMap.put("hash", str2);
        hashMap.put("bundleId", str);
        hashMap.put("uniqueId", str3);
        hashMap.put("timestamp", String.valueOf(Calendar.getInstance().getTimeInMillis()));
        hashMap.put("license", Base64.encodeToString(bArr, 3));
        JSONObject jSONObject = new JSONObject(hashMap);
        try {
            jSONObject.put("data", jSONArray);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            StringBuilder sb = new StringBuilder(" -- 1  ");
            sb.append(jSONObject.toString());
            getPadSub2.PngjException("data", sb.toString());
            byte[] bytes = jSONObject.toString().getBytes();
            StringBuilder sb2 = new StringBuilder(" -- 2  ");
            sb2.append(jSONObject.toString());
            getPadSub2.PngjException("data", sb2.toString());
            String PngjBadCrcException2 = PngjBadCrcException(bytes, context, publicKey);
            jSONObject.toString();
            try {
                LibSettings.isSaveCaptured();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            jSONObject.toString();
            try {
                LibSettings.isSaveCaptured();
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(PngjBadCrcException2);
            sb3.append("|FINGER");
            return sb3.toString();
        } catch (Exception e4) {
            e4.printStackTrace();
            return null;
        }
    }

    public static String PngjBadSignature(Context context, String str, String str2, byte[] bArr, String str3, JSONArray jSONArray) {
        try {
            return values(context, str, str2, bArr, str3, jSONArray);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static byte[] PngjException(byte[] bArr, PrivateKey privateKey) {
        try {
            Signature signature = Signature.getInstance("SHA256withECDSA");
            signature.initSign(privateKey);
            signature.update(MessageDigest.getInstance("SHA-256").digest(bArr));
            return signature.sign();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void a(String str, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        char c;
        char c2;
        char c3;
        char c4;
        char c5;
        int i3;
        char[] charArray = str != null ? str.toCharArray() : null;
        com.d.e.PngjInputException pngjInputException = new com.d.e.PngjInputException();
        char[] cArr = PngjBadSignature;
        Class cls = Integer.TYPE;
        int i4 = 252968584;
        int i5 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    java.lang.Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    java.lang.Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i4);
                    if (PngjBadSignature2 == null) {
                        byte b2 = (byte) i5;
                        i3 = i4;
                        byte b3 = b2;
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (Process.myPid() >> 22), Color.blue(i5) + 28, TextUtils.getCapsMode(BuildConfig.FLAVOR, i5, i5) + 1531, -201551053, false, $$c(b2, b3, b3), new Class[]{cls});
                    } else {
                        i3 = i4;
                    }
                    cArr2[i6] = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr2)).charValue();
                    i6++;
                    i4 = i3;
                    i5 = 0;
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
        int i7 = i4;
        java.lang.Object[] objArr3 = {Integer.valueOf(valueOf)};
        java.lang.Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i7);
        if (PngjBadSignature3 == null) {
            byte b4 = (byte) 0;
            byte b5 = b4;
            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getTapTimeout() >> 16), View.getDefaultSize(0, 0) + 28, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1530, -201551053, false, $$c(b4, b5, b5), new Class[]{cls});
        }
        char charValue; try { charValue = ((Character) ((Method) PngjBadSignature3).invoke(null, objArr3)).charValue(); } catch (Exception e) { throw new RuntimeException(e); }
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i8 = 0;
            while (true) {
                pngjInputException.values = i8;
                int i9 = pngjInputException.values;
                if (i9 >= i2) {
                    break;
                }
                char c6 = charArray[i9];
                pngjInputException.valueOf = c6;
                char c7 = charArray[i9 + 1];
                pngjInputException.PngjException = c7;
                if (c6 == c7) {
                    cArr3[i9] = (char) (c6 - b);
                    cArr3[i9 + 1] = (char) (c7 - b);
                } else {
                    java.lang.Object[] objArr4 = {pngjInputException, pngjInputException, Integer.valueOf(charValue), pngjInputException, pngjInputException, Integer.valueOf(charValue), pngjInputException, pngjInputException, Integer.valueOf(charValue), pngjInputException, pngjInputException, Integer.valueOf(charValue), pngjInputException};
                    java.lang.Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1620847519);
                    if (PngjBadSignature4 == null) {
                        c = '\n';
                        char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                        c2 = 2;
                        int modifierMetaStateMask = 26 - ((byte) KeyEvent.getModifierMetaStateMask());
                        c3 = '\t';
                        int alpha = 1475 - Color.alpha(0);
                        c4 = 7;
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 + 1);
                        c5 = '\b';
                        String $$c = $$c(b6, b7, (byte) (b7 - 1));
                        Class cls2 = Integer.TYPE;
                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(fadingEdgeLength, modifierMetaStateMask, alpha, 1670167002, false, $$c, new Class[]{java.lang.Object.class, java.lang.Object.class, cls2, java.lang.Object.class, java.lang.Object.class, cls2, java.lang.Object.class, java.lang.Object.class, cls2, java.lang.Object.class, java.lang.Object.class, cls2, java.lang.Object.class});
                    } else {
                        c = '\n';
                        c2 = 2;
                        c3 = '\t';
                        c4 = 7;
                        c5 = '\b';
                    }
                    int intValue; try { intValue = ((Integer) ((Method) PngjBadSignature4).invoke(null, objArr4)).intValue(); } catch (Exception e) { throw new RuntimeException(e); }
                    int i10 = pngjInputException.PngjUnsupportedException;
                    if (intValue == i10) {
                        java.lang.Object[] objArr5 = new java.lang.Object[11];
                        objArr5[c] = pngjInputException;
                        objArr5[c3] = Integer.valueOf(charValue);
                        objArr5[c5] = pngjInputException;
                        objArr5[c4] = Integer.valueOf(charValue);
                        objArr5[6] = Integer.valueOf(charValue);
                        objArr5[5] = pngjInputException;
                        objArr5[4] = pngjInputException;
                        objArr5[3] = Integer.valueOf(charValue);
                        objArr5[c2] = Integer.valueOf(charValue);
                        objArr5[1] = pngjInputException;
                        objArr5[0] = pngjInputException;
                        java.lang.Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1410004713);
                        if (PngjBadSignature5 == null) {
                            char keyRepeatDelay = (char) (37426 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                            int i11 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 26;
                            int rgb = (-16776199) - Color.rgb(0, 0, 0);
                            byte b8 = (byte) 0;
                            byte b9 = (byte) (b8 + 2);
                            String $$c2 = $$c(b8, b9, (byte) (b9 - 2));
                            Class cls3 = Integer.TYPE;
                            PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(keyRepeatDelay, i11, rgb, 1461347500, false, $$c2, new Class[]{java.lang.Object.class, java.lang.Object.class, cls3, cls3, java.lang.Object.class, java.lang.Object.class, cls3, cls3, java.lang.Object.class, cls3, java.lang.Object.class});
                        }
                        int intValue2; try { intValue2 = ((Integer) ((Method) PngjBadSignature5).invoke(null, objArr5)).intValue(); } catch (Exception e) { throw new RuntimeException(e); }
                        int i12 = (pngjInputException.PngjBadCrcException * charValue) + pngjInputException.PngjUnsupportedException;
                        int i13 = pngjInputException.values;
                        cArr3[i13] = cArr[intValue2];
                        cArr3[i13 + 1] = cArr[i12];
                    } else {
                        int i14 = pngjInputException.PngjBadSignature;
                        int i15 = pngjInputException.PngjBadCrcException;
                        if (i14 == i15) {
                            int C = x5.C(pngjInputException.PngjOutputException, charValue, 1, charValue);
                            pngjInputException.PngjOutputException = C;
                            int C2 = x5.C(i10, charValue, 1, charValue);
                            pngjInputException.PngjUnsupportedException = C2;
                            int i16 = (i15 * charValue) + C2;
                            int i17 = pngjInputException.values;
                            cArr3[i17] = cArr[(i14 * charValue) + C];
                            cArr3[i17 + 1] = cArr[i16];
                        } else {
                            int i18 = (i14 * charValue) + i10;
                            int i19 = (i15 * charValue) + pngjInputException.PngjOutputException;
                            int i20 = pngjInputException.values;
                            cArr3[i20] = cArr[i18];
                            cArr3[i20 + 1] = cArr[i19];
                        }
                    }
                }
                i8 = pngjInputException.values + 2;
            }
        }
        for (int i21 = 0; i21 < i; i21++) {
            cArr3[i21] = (char) (cArr3[i21] ^ 13722);
        }
        objArr[0] = new String(cArr3);
    }

    public static void init$0() {
        $$a = new byte[]{57, -3, -81, -41};
        $$b = 235;
    }

    public static String valueOf(Context context, String str, String str2, byte[] bArr, String str3, JSONArray jSONArray, PublicKey publicKey) {
        try {
            return PngjBadCrcException(context, str, str2, bArr, str3, jSONArray, publicKey);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String values(Context context, String str, String str2, byte[] bArr, String str3, JSONArray jSONArray) {
        HashMap hashMap = new HashMap();
        hashMap.put("hash", str2);
        hashMap.put("bundleId", str);
        hashMap.put("uniqueId", str3);
        hashMap.put("timestamp", String.valueOf(Calendar.getInstance().getTimeInMillis()));
        hashMap.put("license", Base64.encodeToString(bArr, 3));
        JSONObject jSONObject = new JSONObject(hashMap);
        try {
            jSONObject.put("data", jSONArray);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            StringBuilder sb = new StringBuilder(" -- 1  ");
            sb.append(jSONObject.toString());
            getPadSub2.PngjException("data", sb.toString());
            byte[] bytes = jSONObject.toString().getBytes();
            StringBuilder sb2 = new StringBuilder(" -- 2  ");
            sb2.append(jSONObject.toString());
            getPadSub2.PngjException("data", sb2.toString());
            String values = values(bytes, context);
            jSONObject.toString();
            try {
                LibSettings.isSaveCaptured();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            jSONObject.toString();
            try {
                LibSettings.isSaveCaptured();
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(values);
            sb3.append("|FINGER");
            return sb3.toString();
        } catch (Exception e4) {
            e4.printStackTrace();
            return null;
        }
    }

    private static String PngjBadCrcException(byte[] bArr, Context context, PublicKey publicKey) {
        KeyGenerator keyGenerator;
        try {
            KeyPair PngjBadCrcException2 = com.identy.app.PngjException.PngjBadCrcException();
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                a("\u0018\t\u0013\u0002\u0014\u0001\u0011\n\u0015\u0004\r\u0004\u0015\u0001\u0013\u0010\u000e\u0016\u0000\u0010\u000e\u0001\u0015\b\u0005\f", Process.getGidForName(BuildConfig.FLAVOR) + 27, (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 92), objArr);
                SecureRandom secureRandom = (SecureRandom) Class.forName((String) objArr[0]).getDeclaredConstructor(null).newInstance(null);
                try {
                    keyGenerator = KeyGenerator.getInstance("AES");
                } catch (NoSuchAlgorithmException e) {
                    e.printStackTrace();
                    keyGenerator = null;
                }
                keyGenerator.init(256, secureRandom);
                SecretKey generateKey = keyGenerator.generateKey();
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a("\u0018\t\u0013\u0002\u0014\u0001\u0011\n\u0015\u0004\r\u0004\u0015\u0001\u0013\u0010\u000e\u0016\u0000\u0010\u000e\u0001\u0015\b\u0005\f", 26 - View.getDefaultSize(0, 0), (byte) (92 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0)), objArr2);
                    byte[] bArr2 = new byte[16];
                    ((Random) Class.forName((String) objArr2[0]).getDeclaredConstructor(null).newInstance(null)).nextBytes(bArr2);
                    cipher.init(1, generateKey, new GCMParameterSpec(128, bArr2));
                    byte[] doFinal = cipher.doFinal(bArr);
                    byte[] encoded = generateKey.getEncoded();
                    Cipher cipher2 = Cipher.getInstance("RSA");
                    cipher2.init(1, publicKey, new OAEPParameterSpec("SHA-256", "MGF1", new MGF1ParameterSpec("SHA-256"), PSource.PSpecified.DEFAULT));
                    byte[] PngjException2 = PngjException(bArr, PngjBadCrcException2.getPrivate());
                    byte[] doFinal2 = cipher2.doFinal(encoded);
                    ByteBuffer allocate = ByteBuffer.allocate(doFinal2.length + 23 + PngjBadCrcException2.getPublic().getEncoded().length + 4 + PngjException2.length + doFinal.length);
                    allocate.put("IDENTY2".getBytes());
                    allocate.put(bArr2);
                    allocate.put(doFinal2);
                    allocate.put(PngjBadCrcException2.getPublic().getEncoded());
                    allocate.putInt(PngjException2.length);
                    allocate.put(PngjException2);
                    allocate.put(doFinal);
                    return Base64.encodeToString(allocate.array(), 3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw new RuntimeException(cause);
                    }
                    throw new RuntimeException(th);
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw new RuntimeException(cause2);
                }
                throw new RuntimeException(th2);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static String values(byte[] bArr, Context context) {
        KeyFactory keyFactory;
        JSONObject jSONObject = IdentySdk.getInstance().getL1Score;
        "KEY ?".concat(String.valueOf(jSONObject));
        try {
            LibSettings.isSaveCaptured();
        } catch (Exception e) {
            e.printStackTrace();
        }
        X509EncodedKeySpec x509EncodedKeySpec; try { x509EncodedKeySpec = new X509EncodedKeySpec(Base64.decode(jSONObject.getString("key"), 1)); } catch (org.json.JSONException e) { throw new RuntimeException(e); }
        PublicKey publicKey = null;
        try {
            keyFactory = KeyFactory.getInstance("RSA");
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            keyFactory = null;
        }
        try {
            publicKey = keyFactory.generatePublic(x509EncodedKeySpec);
        } catch (InvalidKeySpecException e3) {
            e3.printStackTrace();
        }
        return PngjBadCrcException(bArr, context, publicKey);
    }
}
