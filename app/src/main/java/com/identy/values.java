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
import kotlin.uuid.Uuid;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class values {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static char[] PngjBadSignature;
    private static char valueOf;

    public class PngjBadCrcException extends com.a.e.d.PngjBadCrcException {
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

    public class PngjBadSignature implements Response.ErrorListener {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
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
                }
            } else {
                i3 = 0;
                i5++;
                bArr2[i3] = (byte) i6;
                i3++;
                if (i3 == i4) {
                }
            }
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
        private static void a(int i, int i2, short s, Object[] objArr) {
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
        private static void b(char c, String str, String str2, int i, String str3, Object[] objArr) {
            char[] cArr;
            char[] cArr2;
            long j;
            int i2;
            int i3;
            int i4;
            char c2;
            $11 = ($10 + 9) % Uuid.SIZE_BITS;
            if (str3 != null) {
                cArr = str3.toCharArray();
                $11 = ($10 + 91) % Uuid.SIZE_BITS;
            } else {
                cArr = str3;
            }
            char[] cArr3 = cArr;
            char[] charArray = str2 != 0 ? str2.toCharArray() : str2;
            if (str != null) {
                $10 = ($11 + 31) % Uuid.SIZE_BITS;
                cArr2 = str.toCharArray();
            } else {
                cArr2 = str;
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
                    Object[] objArr2 = {getpadsub2};
                    Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(152054586);
                    if (PngjBadSignature2 == null) {
                        byte b = (byte) i5;
                        j = 0;
                        byte b2 = (byte) (b - 1);
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), ExpandableListView.getPackedPositionType(0L) + 28, 1855 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -167819647, false, $$e(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                    } else {
                        j = 0;
                    }
                    int intValue = ((Integer) ((Method) PngjBadSignature2).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {getpadsub2};
                    Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1496933771);
                    if (PngjBadSignature3 == null) {
                        byte b3 = (byte) i5;
                        i2 = i6;
                        byte b4 = (byte) (b3 - 1);
                        i3 = i5;
                        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (35511 - TextUtils.getCapsMode(BuildConfig.FLAVOR, i5, i5)), (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 41, 507 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, i5), 1512699854, false, $$e(b3, b4, (byte) (b4 & 50)), new Class[]{Object.class});
                    } else {
                        i2 = i6;
                        i3 = i5;
                    }
                    int intValue2 = ((Integer) ((Method) PngjBadSignature3).invoke(null, objArr3)).intValue();
                    int i7 = cArr5[getpadsub2.PngjBadSignature % 4] * 32718;
                    Object[] objArr4 = new Object[3];
                    objArr4[i2] = Integer.valueOf(cArr6[intValue]);
                    objArr4[1] = Integer.valueOf(i7);
                    objArr4[i3] = getpadsub2;
                    Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1094318588);
                    Class cls = Integer.TYPE;
                    if (PngjBadSignature4 == null) {
                        c2 = 1;
                        byte b5 = (byte) i3;
                        byte b6 = (byte) (b5 - 1);
                        i4 = intValue2;
                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 31 - (CdmaCellLocation.convertQuartSecToDecDegrees(i3) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i3) == 0.0d ? 0 : -1)), 247 - (ViewConfiguration.getEdgeSlop() >> 16), 1110010815, false, $$e(b5, b6, (byte) (b6 & 51)), new Class[]{Object.class, cls, cls});
                    } else {
                        i4 = intValue2;
                        c2 = 1;
                    }
                    ((Method) PngjBadSignature4).invoke(null, objArr4);
                    int i8 = cArr5[i4] * 32718;
                    int i9 = i2;
                    Object[] objArr5 = new Object[i9];
                    objArr5[c2] = Integer.valueOf(cArr6[intValue]);
                    objArr5[0] = Integer.valueOf(i8);
                    Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-2032891769);
                    if (PngjBadSignature5 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 - 1);
                        PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 1), Color.blue(0) + 37, 550 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)), 2050745660, false, $$e(b7, b8, (byte) (b8 & 52)), new Class[]{cls, cls});
                    }
                    cArr6[i4] = ((Character) ((Method) PngjBadSignature5).invoke(null, objArr5)).charValue();
                    cArr5[i4] = getpadsub2.values;
                    int i10 = getpadsub2.PngjBadSignature;
                    cArr7[i10] = (char) ((((r0 ^ charArray[i10]) ^ (valueOf ^ 698259225915410659L)) ^ ((int) (values ^ 698259225915410659L))) ^ ((char) (PngjBadSignature ^ 698259225915410659L)));
                    getpadsub2.PngjBadSignature = i10 + 1;
                    i6 = i9;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            String str4 = new String(cArr7);
            $10 = ($11 + 57) % Uuid.SIZE_BITS;
            objArr[0] = str4;
        }

        private static void c(String str, boolean z, int[] iArr, Object[] objArr) {
            char c;
            long j;
            int i;
            byte[] bArr;
            String str2 = str;
            int i2 = ($11 + 67) % Uuid.SIZE_BITS;
            $10 = i2;
            byte[] bArr2 = str2;
            if (str2 != null) {
                $11 = (i2 + 9) % Uuid.SIZE_BITS;
                bArr2 = str2.getBytes("ISO-8859-1");
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
                $10 = ($11 + 71) % Uuid.SIZE_BITS;
                int length = cArr.length;
                j = 0;
                char[] cArr2 = new char[length];
                int i8 = 0;
                while (i8 < length) {
                    $11 = ($10 + 103) % Uuid.SIZE_BITS;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                        Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-259747866);
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
                            throw th;
                        }
                        throw cause;
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
                $11 = ($10 + 55) % Uuid.SIZE_BITS;
                char c2 = 0;
                while (true) {
                    int i10 = e1Var.PngjBadSignature;
                    if (i10 >= i5) {
                        break;
                    }
                    if (bArr4[i10] == 1) {
                        $11 = ($10 + 43) % Uuid.SIZE_BITS;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i10]), Integer.valueOf(c2)};
                        Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-655108508);
                        if (PngjBadSignature3 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = (byte) (b3 - 1);
                            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) + 31881), 31 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)), 1250 - ExpandableListView.getPackedPositionType(j), 605862879, false, $$e(b3, b4, (byte) (b4 & 19)), new Class[]{cls, cls});
                        }
                        cArr4[i10] = ((Character) ((Method) PngjBadSignature3).invoke(null, objArr3)).charValue();
                        $10 = ($11 + 109) % Uuid.SIZE_BITS;
                    } else {
                        Object[] objArr4 = {Integer.valueOf(cArr3[i10]), Integer.valueOf(c2)};
                        Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(269554740);
                        if (PngjBadSignature4 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = (byte) (b5 - 1);
                            PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (1 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1))), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 36, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1597, -318867057, false, $$e(b5, b6, (byte) (b6 & 16)), new Class[]{cls, cls});
                        }
                        cArr4[i10] = ((Character) ((Method) PngjBadSignature4).invoke(null, objArr4)).charValue();
                    }
                    c2 = cArr4[e1Var.PngjBadSignature];
                    Object[] objArr5 = {e1Var, e1Var};
                    Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1060060353);
                    if (PngjBadSignature5 == null) {
                        PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getTapTimeout() >> 16), 34 - ((byte) KeyEvent.getModifierMetaStateMask()), (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 156, -1010806406, false, "g", new Class[]{Object.class, Object.class});
                    }
                    ((Method) PngjBadSignature5).invoke(null, objArr5);
                }
                cArr3 = cArr4;
            }
            if (i7 > 0) {
                $11 = ($10 + 95) % Uuid.SIZE_BITS;
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
                    $11 = i14 % Uuid.SIZE_BITS;
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
        
            r12 = -401238845;
            r8 = ((-782) * r8) + (784 * r12);
            r8 = -783;
            r47 = ((r8 ^ r39) * r8) + r8;
            r12 = r12 ^ r39;
            r8 = android.os.Process.myUid() ^ r39;
            r8 = ((783 * (r12 | ((r8 | r8) ^ r39))) + ((r8 * (((r12 | r8) | r8) ^ r39)) + r47)) - 1315678422;
            r10 = defpackage.a.a();
            r0 = ((int) (r8 >> 32)) & ((((~((~r10) | (-506042135))) | 302089216) * 191) + ((((~((-506042135) | r10)) | 1943268545) * 191) + 1770321985));
            r9 = ~android.os.Process.myTid();
            r8 = ((int) r8) & defpackage.a.c((~(r9 | (-1905789270))) | 1090521173, 933, (((~((-951951617) | r9)) | (-1905789270)) * (-933)) + 1985440908, 1338366354);
         */
        /* JADX WARN: Code restructure failed: missing block: B:101:0x1379, code lost:
        
            if (((r0 & r8) | (r0 ^ r8)) != 0) goto L148;
         */
        /* JADX WARN: Code restructure failed: missing block: B:102:0x137b, code lost:
        
            r0 = com.identy.values.PngjBadSignature.PngjUnsupportedException;
            r15 = 1;
            com.identy.values.PngjBadSignature.PngjInputException = ((r0 ^ 109) + ((r0 & 109) << 1)) % kotlin.uuid.Uuid.SIZE_BITS;
            r0 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:104:0x138c, code lost:
        
            r0 = -(-r0);
            r4 = ((r4 | r0) << r15) - (r0 ^ r4);
            r0 = ((r23 | 58) << r15) - (r23 ^ 58);
            r0 = ((r0 & (-57)) << r15) + (r0 ^ (-57));
         */
        /* JADX WARN: Code restructure failed: missing block: B:105:0x138a, code lost:
        
            r15 = 1;
            r0 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:107:0x12d9, code lost:
        
            r23 = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:110:0x13aa, code lost:
        
            if (r4 < 25.2d) goto L155;
         */
        /* JADX WARN: Code restructure failed: missing block: B:111:0x13ac, code lost:
        
            r0 = com.identy.values.PngjBadSignature.PngjInputException;
            com.identy.values.PngjBadSignature.PngjUnsupportedException = ((r0 ^ 103) + ((r0 & 103) << 1)) % kotlin.uuid.Uuid.SIZE_BITS;
            r0 = new java.lang.Object[]{new int[]{r5}, new int[1], null, new int[]{r74}};
            r5 = (~(r74 & 261)) & (r74 | 261);
            r1 = (int) android.os.SystemClock.elapsedRealtime();
            r3 = (((~(416960840 | r1)) | 617605133) * 672) + 926765589;
            r5 = ~r1;
            r3 = (((~((-617605134) | r5)) | 604350469) * 672) + ((((~(r1 | 617605133)) | (~((-416960841) | r5))) * (-672)) + r3);
            r1 = -(-((r3 ^ 16) + ((r3 & 16) << 1)));
            r3 = ((r76 | r1) << 1) - (r1 ^ r76);
            r1 = (r3 << 13) ^ r3;
            r2 = r1 >>> 17;
            r1 = ((~r1) & r2) | ((~r2) & r1);
            r2 = r1 << 5;
            ((int[]) r0[1])[0] = ((~r1) & r2) | ((~r2) & r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:112:0x143a, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:120:0x1261, code lost:
        
            if ((r0 | (r4 & ((((~(200336606 | r8)) | (~(r9 | (-1637563017)))) * 950) + ((((~((-1637563017) | r8)) | (~(r9 | 200336606))) * (-950)) + ((((~(1637563016 | r9)) | (~((-200336607) | r8))) * 1900) - 1871736089))))) == 477111747) goto L136;
         */
        /* JADX WARN: Code restructure failed: missing block: B:428:0x2a73, code lost:
        
            if (r6 == null) goto L359;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0460, code lost:
        
            if (((((int) (r8 >> 32)) & defpackage.a.c(((~(138273982 | r74)) | (~((-1575500394) | r5))) | 1426582, -370, (((~(138273982 | r5)) | (~((-1575500394) | r74))) * (-370)) + 635053406, 527835340)) | (((int) r8) & defpackage.a.c((~(android.os.Process.myPid() | (-94970258))) | 268435456, 446, (((~((~r6) | 805345804)) | (-900316062)) * 446) - 384374209, -2109005124))) != 477111747) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0774, code lost:
        
            if (android.os.Build.VERSION.SDK_INT <= 33) goto L84;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0776, code lost:
        
            r4 = new java.lang.Object[1];
            c("\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001", false, new int[]{44, 28, 172, 0}, r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:503:0x089b, code lost:
        
            r0 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:504:0x089d, code lost:
        
            r6 = r32;
            r4 = new java.lang.Object[1];
            c("\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001", false, new int[]{72, r6, 61, r6}, r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:505:0x08b4, code lost:
        
            r0 = new java.lang.Object[]{(java.lang.String) r4[0]};
            r4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(547370249);
         */
        /* JADX WARN: Code restructure failed: missing block: B:506:0x08bc, code lost:
        
            if (r4 != null) goto L88;
         */
        /* JADX WARN: Code restructure failed: missing block: B:507:0x08be, code lost:
        
            r4 = (char) (8752 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
            r44 = (android.view.ViewConfiguration.getTapTimeout() >> 16) + 24;
            r6 = 336 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
            r9 = (byte) 0;
            r10 = (byte) (r9 + 2);
            r13 = new java.lang.Object[1];
            a(r9, r10, (byte) (r10 - 1), r13);
            r4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(r4, r44, r6, -598779726, false, (java.lang.String) r13[0], new java.lang.Class[]{java.lang.String.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:508:0x0900, code lost:
        
            r0 = ((java.lang.reflect.Method) r4).invoke(null, r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:509:0x0907, code lost:
        
            r15 = 1;
            r6 = new java.lang.Object[1];
            c("\u0000", false, new int[]{85, 1, 167, 0}, r6);
            r0 = r0.equals((java.lang.String) r6[0]);
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x078d, code lost:
        
            r0 = new java.lang.Object[]{(java.lang.String) r4[0]};
            r4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1666380462);
         */
        /* JADX WARN: Code restructure failed: missing block: B:516:0x056d, code lost:
        
            if (((r0 & r4) | (r0 ^ r4)) != 477111747) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0798, code lost:
        
            if (r4 != null) goto L78;
         */
        /* JADX WARN: Code restructure failed: missing block: B:523:0x0668, code lost:
        
            if (((r0 & r4) | (r0 ^ r4)) != (-1032769152)) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x079a, code lost:
        
            r4 = (char) android.view.View.resolveSize(0, 0);
            r44 = 28 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16);
            r6 = 1446 - android.text.TextUtils.indexOf((java.lang.CharSequence) com.karumi.dexter.BuildConfig.FLAVOR, '0');
            r9 = (byte) 4;
            r8 = (byte) (r9 - 3);
            r12 = new java.lang.Object[1];
            a(r9, r8, r8, r12);
            r4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(r4, r44, r6, -1614962923, false, (java.lang.String) r12[0], new java.lang.Class[]{java.lang.String.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:531:0x076e, code lost:
        
            if ((r0 | (r4 & (((r6 | (-761521794)) * 245) + ((r6 * (-245)) + r8)))) == 542074309) goto L72;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x07d6, code lost:
        
            r8 = ((java.lang.Long) ((java.lang.reflect.Method) r4).invoke(null, r0)).longValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x07e3, code lost:
        
            r12 = -279591644;
            r8 = -575;
            r8 = (r8 * r8) + (r8 * r12);
            r8 = 576;
            r45 = r12 ^ r39;
            r47 = r8 ^ r39;
            r49 = (r45 | r47) ^ r39;
            r8 = r74;
            r12 = ((r8 * r49) + (((((r45 | r8) ^ r39) | (((r47 | (r8 ^ r39)) | r12) ^ r39)) * r8) + (((r49 | ((r47 | r8) ^ r39)) * r8) + r8))) + 750079961;
            r4 = android.os.Process.myPid();
            r6 = ~((-1732778608) | r4);
            r8 = ~r4;
            r0 = ((int) (r12 >> 32)) & ((((~(r4 | 295552196)) | (~(1732778607 | r8))) * 406) + (((~((-17301573) | r8)) * (-406)) + (((r6 | (~((-278250625) | r8))) * (-406)) + 305812002)));
            r6 = android.os.Process.myPid();
            r8 = ((1159825701 | r6) * 614) + 1969666967;
            r6 = ~r6;
            r4 = ((int) r12) & ((((~(r6 | (-138700355))) | (~(1298526055 | r6))) * 614) + (((((~(1296428903 | r6)) | 2097152) | (~((-140797507) | r6))) * (-1228)) + r8));
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x088a, code lost:
        
            if (((r0 & r4) | (r0 ^ r4)) != 1) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x088c, code lost:
        
            r0 = com.identy.values.PngjBadSignature.PngjUnsupportedException;
            com.identy.values.PngjBadSignature.PngjInputException = ((r0 & 11) + (r0 | 11)) % kotlin.uuid.Uuid.SIZE_BITS;
            r0 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0898, code lost:
        
            r15 = 1;
            r0 = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0921, code lost:
        
            if ((r0 ^ r15) == r15) goto L96;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0923, code lost:
        
            com.identy.values.PngjBadSignature.PngjUnsupportedException = (com.identy.values.PngjBadSignature.PngjInputException + 77) % kotlin.uuid.Uuid.SIZE_BITS;
            r0 = new java.lang.Object[4];
            r3 = new int[r15];
            r0[0] = r3;
            r0[r15] = new int[r15];
            r4 = new int[r15];
            r0[3] = r4;
            r5 = (~(r74 & 260)) & (r74 | 260);
            r4[0] = r74;
            r3[0] = r5;
            r0[2] = null;
            r1 = (((~(((int) android.os.SystemClock.elapsedRealtime()) | 216704833)) | 806686740) * 658) + (((1012217173 | r1) * (-658)) - 1165362585);
            r1 = (r76 - (~(-(-((r1 & 16) + (r1 | 16)))))) - 1;
            r2 = r1 << 13;
            r1 = ((~r1) & r2) | ((~r2) & r1);
            r2 = r1 >>> 17;
            r1 = (r1 | r2) & (~(r1 & r2));
            r2 = r1 << 5;
            ((int[]) r0[1])[0] = (r1 | r2) & (~(r1 & r2));
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x099b, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x1151, code lost:
        
            if (((((int) (r8 >> 32)) & ((r10 * 880) + (((r12 | r10) * (-880)) + r13))) | (((int) r8) & ((((~((-195683167) | r74)) | 1616123904) * 433) + ((((~(1632909576 | r74)) | (-195683167)) * (-433)) + (((~((-16785673) | r5)) * 433) + 1351065630))))) != 477111747) goto L128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x1263, code lost:
        
            r0 = 0;
            r4 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x1267, code lost:
        
            if (r0 >= 28) goto L539;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x1269, code lost:
        
            r8 = r41[r0];
            r12 = new java.lang.Object[1];
            b((char) android.text.TextUtils.indexOf(com.karumi.dexter.BuildConfig.FLAVOR, com.karumi.dexter.BuildConfig.FLAVOR, 0, 0), "\u0000\u0000\u0000\u0000", "Ⲏ᭗崿쌩璽摛✾\u1cbb철ᲅꄖ䌌", ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1, "╼큠ᚦ薜", r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x1294, code lost:
        
            r8 = new java.lang.Object[]{((java.lang.String) r12[0]).concat(java.lang.String.valueOf(r8))};
            r10 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1934049891);
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x129f, code lost:
        
            if (r10 != null) goto L143;
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x12a1, code lost:
        
            r10 = (char) android.view.View.MeasureSpec.getSize(0);
            r44 = 27 - android.widget.ExpandableListView.getPackedPositionChild(r37);
            r12 = android.view.KeyEvent.getDeadChar(0, 0) + 1447;
            r14 = (byte) 0;
            r23 = r0;
            r0 = new java.lang.Object[1];
            a((byte) 15, r14, r14, r0);
            r10 = com.d.e.a.PngjBadCrcException.PngjBadSignature(r10, r44, r12, -1884803112, false, (java.lang.String) r0[0], new java.lang.Class[]{java.lang.String.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:99:0x12db, code lost:
        
            r8 = ((java.lang.Long) ((java.lang.reflect.Method) r10).invoke(null, r8)).longValue();
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
        public static Object[] values$1eba2e16(int i, Object obj, int i2) {
            Throwable cause;
            int i3;
            int i4;
            int i5;
            long j;
            int c;
            int i6;
            int i7;
            float f;
            int i8;
            long j2;
            Object PngjBadSignature2;
            long j3;
            Object invoke;
            int i9;
            Object PngjBadSignature3;
            long j4;
            Object PngjBadSignature4;
            Object PngjBadSignature5;
            long j5;
            Object PngjBadSignature6;
            long j6;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            BufferedInputStream bufferedInputStream;
            BufferedInputStream bufferedInputStream2;
            int i16;
            boolean z;
            int i17;
            Object[] objArr;
            int i18;
            long j7;
            Object invoke2;
            Object[] objArr2;
            int parseInt;
            int i19;
            String[] strArr;
            Object obj2;
            Object obj3;
            Class cls = Integer.TYPE;
            try {
                Object PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1085800324);
                if (PngjBadSignature7 == null) {
                    i3 = 989703296;
                    char resolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 1179);
                    int axisFromString = MotionEvent.axisFromString(BuildConfig.FLAVOR) + 45;
                    i4 = 5;
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 1092;
                    i5 = 13;
                    byte b = (byte) 0;
                    byte b2 = (byte) (b + 2);
                    Object[] objArr3 = new Object[1];
                    a(b, b2, (byte) (b2 - 1), objArr3);
                    PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(resolveOpacity, axisFromString, threadPriority, -1135046081, false, (String) objArr3[0], new Class[0]);
                } else {
                    i3 = 989703296;
                    i4 = 5;
                    i5 = 13;
                }
                long longValue = ((Long) ((Method) PngjBadSignature7).invoke(null, null)).longValue();
                long j8 = 474875626;
                long j9 = 370;
                long j10 = -369;
                long a = defpackage.a.a();
                j = -1;
                long j11 = a ^ j;
                long j12 = (j8 ^ j) | j11;
                long j13 = (369 * ((((longValue ^ j) | j8) ^ j) | ((j8 | a) ^ j) | ((j12 | longValue) ^ j))) + (j10 * (longValue | (j12 ^ j))) + ((j8 | longValue | j11) * j10) + (j9 * longValue) + (j9 * j8) + 1450040691;
                int i20 = ~((int) Runtime.getRuntime().totalMemory());
                c = ((int) (j13 >> 32)) & defpackage.a.c(i20 | (-1275080795), -828, (((~((-1275080795) | i20)) | (-1582660091)) * (-828)) + 1754752898, -795057384);
                i6 = ~i;
                i7 = ((int) j13) & ((((~(i6 | 8970162)) | (~((-1446196573) | i))) * 950) + (((~(8970162 | i)) | (~(i6 | (-1446196573)))) * (-950)) + ((((~((-8970163) | i6)) | (~(1446196572 | i))) * 1900) - 1871736089));
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause == null) {
                }
            }
            if (((c & i7) | (c ^ i7)) != 0) {
                Object[] objArr4 = {new int[]{i ^ 271}, new int[]{((~r1) & r2) | ((~r2) & r1)}, null, new int[]{i}};
                int i21 = -(-defpackage.a.c(5243465 | (~(i6 | (-570700801))), 449, (((~(i | (-570700801))) | 5243465) * 449) + 2074280259, 16));
                int i22 = (i2 ^ i21) + ((i21 & i2) << 1);
                int i23 = i22 << 13;
                int i24 = (i23 & (~i22)) | ((~i23) & i22);
                int i25 = i24 >>> 17;
                int i26 = ((~i24) & i25) | ((~i25) & i24);
                int i27 = i26 << 5;
                return objArr4;
            }
            char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int i28 = -(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
            int i29 = ((i28 | (-947231464)) << 1) - (i28 ^ (-947231464));
            Object[] objArr5 = new Object[1];
            b(scrollBarFadeDuration, "\u0000\u0000\u0000\u0000", "信\ude90\ue037嵲躜㖗헷\ue012뭡\uf06c\u1ac3", i29, "ᢚ詥⛇\ue9df", objArr5);
            Object[] objArr6 = {(String) objArr5[0]};
            Object PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(547370249);
            if (PngjBadSignature8 == null) {
                char resolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 8752);
                int lastIndexOf = TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 25;
                i8 = -1;
                int offsetAfter = TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 336;
                f = 0.0f;
                byte b3 = (byte) 0;
                byte b4 = (byte) (b3 + 2);
                Object[] objArr7 = new Object[1];
                a(b3, b4, (byte) (b4 - 1), objArr7);
                PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(resolveSizeAndState, lastIndexOf, offsetAfter, -598779726, false, (String) objArr7[0], new Class[]{String.class});
            } else {
                f = 0.0f;
                i8 = -1;
            }
            String str = (String) ((Method) PngjBadSignature8).invoke(null, objArr6);
            if (str != null) {
                Object[] objArr8 = new Object[1];
                c("\u0000\u0001\u0001\u0001\u0001\u0001", false, new int[]{0, 6, 0, 4}, objArr8);
                String str2 = (String) objArr8[0];
                Object[] objArr9 = new Object[1];
                c("\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001", false, new int[]{6, 8, 152, 0}, objArr9);
                String[] strArr2 = {str2, (String) objArr9[0]};
                int i30 = 0;
                while (i30 < 2) {
                    int i31 = PngjInputException;
                    PngjUnsupportedException = ((i31 & 37) + (i31 | 37)) % Uuid.SIZE_BITS;
                    if (str.contains(strArr2[i30])) {
                        Object[] objArr10 = new Object[1];
                        b((char) (Process.myPid() >> 22), "\u0000\u0000\u0000\u0000", "ಹ鈥죃\u1af9퀮鲜燚㈛⛟썽䑪䃴쏽Ꙁ⒝尗들\u0c72ᜉꋖಙ梢꾟", 9763439 - (ViewConfiguration.getFadingEdgeLength() >> 16), "澹铺洀驌", objArr10);
                        Object[] objArr11 = {(String) objArr10[0]};
                        Object PngjBadSignature9 = com.d.e.a.PngjBadCrcException.PngjBadSignature(547370249);
                        if (PngjBadSignature9 == null) {
                            char c2 = (char) (8752 - (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)));
                            int indexOf = 24 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0);
                            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 336;
                            byte b5 = (byte) 0;
                            byte b6 = (byte) (b5 + 2);
                            Object[] objArr12 = new Object[1];
                            a(b5, b6, (byte) (b6 - 1), objArr12);
                            PngjBadSignature9 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c2, indexOf, keyRepeatTimeout, -598779726, false, (String) objArr12[0], new Class[]{String.class});
                        }
                        Object invoke3 = ((Method) PngjBadSignature9).invoke(null, objArr11);
                        Object[] objArr13 = new Object[1];
                        c("\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001", true, new int[]{14, 30, 0, 0}, objArr13);
                        Object[] objArr14 = {(String) objArr13[0]};
                        Object PngjBadSignature10 = com.d.e.a.PngjBadCrcException.PngjBadSignature(547370249);
                        if (PngjBadSignature10 == null) {
                            char c3 = (char) ((TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)) + 8752);
                            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 24;
                            int deadChar = 336 - KeyEvent.getDeadChar(0, 0);
                            byte b7 = (byte) 0;
                            byte b8 = (byte) (b7 + 2);
                            obj2 = invoke3;
                            Object[] objArr15 = new Object[1];
                            a(b7, b8, (byte) (b8 - 1), objArr15);
                            PngjBadSignature10 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c3, fadingEdgeLength, deadChar, -598779726, false, (String) objArr15[0], new Class[]{String.class});
                        } else {
                            obj2 = invoke3;
                        }
                        Object invoke4 = ((Method) PngjBadSignature10).invoke(null, objArr14);
                        if (obj2 != null) {
                            Object[] objArr16 = {obj2, 42};
                            Object PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                            if (PngjBadSignature11 == null) {
                                char fadingEdgeLength2 = (char) (11039 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                                int keyRepeatTimeout2 = 31 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                int indexOf2 = TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 1283;
                                byte b9 = (byte) 4;
                                byte b10 = (byte) (b9 - 3);
                                obj3 = invoke4;
                                Object[] objArr17 = new Object[1];
                                a(b9, b10, b10, objArr17);
                                PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature(fadingEdgeLength2, keyRepeatTimeout2, indexOf2, -971849413, false, (String) objArr17[0], new Class[]{String.class, cls});
                            } else {
                                obj3 = invoke4;
                            }
                            long longValue2 = ((Long) ((Method) PngjBadSignature11).invoke(null, objArr16)).longValue();
                            long j14 = 452316398;
                            long j15 = -919;
                            long j16 = (j15 * longValue2) + (j15 * j14);
                            long j17 = 920;
                            long j18 = j14 ^ j;
                            long j19 = longValue2 ^ j;
                            long j20 = j18 | j19;
                            long j21 = i;
                            long j22 = j21 ^ j;
                            long j23 = ((((j20 | j22) ^ j) | (((j18 | longValue2) | j21) ^ j) | (((j19 | j14) | j21) ^ j)) * j17) + (((j20 ^ j) | ((j18 | j22) ^ j)) * j17) + ((((j20 | j21) ^ j) | (((j19 | j22) | j14) ^ j)) * j17) + j16 + 203391302;
                            j2 = j;
                        } else {
                            obj3 = invoke4;
                            j2 = j;
                        }
                        if (obj3 != null) {
                            Object[] objArr18 = {obj3, 42};
                            Object PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                            if (PngjBadSignature12 == null) {
                                char indexOf3 = (char) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 11040);
                                int indexOf4 = TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0) + 31;
                                int maximumDrawingCacheSize = 1282 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                byte b11 = (byte) 4;
                                byte b12 = (byte) (b11 - 3);
                                Object[] objArr19 = new Object[1];
                                a(b11, b12, b12, objArr19);
                                PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf3, indexOf4, maximumDrawingCacheSize, -971849413, false, (String) objArr19[0], new Class[]{String.class, cls});
                            }
                            long longValue3 = ((Long) ((Method) PngjBadSignature12).invoke(null, objArr18)).longValue();
                            long j24 = -1101165153;
                            long j25 = -445;
                            long j26 = (j25 * longValue3) + (j25 * j24);
                            long j27 = 446;
                            long j28 = j24 ^ j2;
                            long j29 = longValue3 ^ j2;
                            long j30 = (j28 | j29) ^ j2;
                            long j31 = i;
                            long j32 = (j27 * j30) + ((((j28 | longValue3) ^ j2) | ((j31 | (j29 | j24)) ^ j2)) * j27) + ((j30 | ((j29 | (j31 ^ j2)) ^ j2)) * j27) + j26 + 1756872853;
                            int i32 = ((int) (j32 >> 32)) & ((((~(862035894 | i)) | 16880928 | (~((-1995704991) | i6))) * 904) + (((~(2012585918 | i)) | (~((-845154967) | i6))) * 904) + ((((~(1995704990 | i)) | (~((-862035895) | i6))) * (-1808)) - 1197419926));
                            int i33 = ((int) j32) & ((((~(445397956 | i)) | 437000644) * 49) + (((~(991828453 | i6)) | 445397956 | (~((-991828454) | i))) * (-49)) + ((((~(445397956 | i6)) | 554827809) * 98) - 2092853575));
                        }
                        if (obj2 != null) {
                            Object[] objArr20 = {obj2, 42};
                            Object PngjBadSignature13 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                            if (PngjBadSignature13 == null) {
                                char bitsPerPixel = (char) (11038 - ImageFormat.getBitsPerPixel(0));
                                int maxKeyCode = 31 - (KeyEvent.getMaxKeyCode() >> 16);
                                int keyCodeFromString = KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 1282;
                                byte b13 = (byte) 4;
                                byte b14 = (byte) (b13 - 3);
                                Object[] objArr21 = new Object[1];
                                a(b13, b14, b14, objArr21);
                                PngjBadSignature13 = com.d.e.a.PngjBadCrcException.PngjBadSignature(bitsPerPixel, maxKeyCode, keyCodeFromString, -971849413, false, (String) objArr21[0], new Class[]{String.class, cls});
                            }
                            long longValue4 = ((Long) ((Method) PngjBadSignature13).invoke(null, objArr20)).longValue();
                            long j33 = 10156515;
                            long j34 = ((-215) * longValue4) + (217 * j33);
                            long j35 = 216;
                            long j36 = i;
                            long j37 = j36 ^ j2;
                            long j38 = ((longValue4 | ((j37 | j33) ^ j2)) * j35) + ((-216) * (j33 | (longValue4 ^ j2) | j37)) + (((j33 | j36) ^ j2) * j35) + j34 + 645551185;
                            int i34 = ((int) (j38 >> 32)) & ((((~(2090600896 | i6)) | 18980884) * 52) + (((~((-2090600897) | i6)) | (~(767139988 | i6)) | 1342441792) * (-52)) + ((~((-748159105) | i6)) * 52) + 1537716890);
                            int i35 = ((int) j38) & ((((~((~((int) Runtime.getRuntime().maxMemory())) | 2013192123)) | 17335569) * 449) + ((((~(2013192123 | r6)) | 17335569) * 449) - 2139533969));
                        }
                        if (obj3 != null) {
                            Object[] objArr22 = {obj3, 42};
                            Object PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                            if (PngjBadSignature14 == null) {
                                char indexOf5 = (char) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 11040);
                                int offsetBefore = TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 31;
                                int indexOf6 = TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0) + 1282;
                                byte b15 = (byte) 4;
                                byte b16 = (byte) (b15 - 3);
                                Object[] objArr23 = new Object[1];
                                a(b15, b16, b16, objArr23);
                                PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf5, offsetBefore, indexOf6, -971849413, false, (String) objArr23[0], new Class[]{String.class, cls});
                            }
                            long longValue5 = ((Long) ((Method) PngjBadSignature14).invoke(null, objArr22)).longValue();
                            long j39 = -97103689;
                            long j40 = (246 * longValue5) + ((-244) * j39);
                            long j41 = -245;
                            long j42 = longValue5 ^ j2;
                            long j43 = i;
                            long j44 = ((((j42 | (j43 ^ j2)) ^ j2) | ((j42 | j39) ^ j2)) * j41) + j40;
                            long j45 = (j42 | j43) ^ j2;
                            long j46 = (245 * (j39 | j45)) + (j41 * j45) + j44 + 752811389;
                            int b17 = defpackage.a.b(95476528);
                            int i36 = ~(1607833522 | b17);
                            int i37 = ~b17;
                            int i38 = ((int) (j46 >> 32)) & ((((~(b17 | (-17859601))) | (~(1607833522 | i37)) | (~((-340066561) | b17))) * 920) + (((-1607833523) | (~(1267766962 | i37))) * 920) + ((i36 | (~((-17859601) | i37))) * 920) + 2038856378);
                            int i39 = (int) j46;
                            int startUptimeMillis = (int) Process.getStartUptimeMillis();
                            int i40 = (((~((~startUptimeMillis) | 675704616)) | 86081665) * (-245)) - 1886854526;
                            int i41 = ~(startUptimeMillis | 675704616);
                        }
                        Object[] objArr24 = new Object[1];
                        c("\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001", true, new int[]{86, 8, 0, 8}, objArr24);
                        String str3 = (String) objArr24[0];
                        int i42 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int i43 = i42 * 881;
                        int i44 = ((38981607 | i43) << 1) - (i43 ^ 38981607);
                        int i45 = ~i42;
                        int i46 = ~(((-44248) ^ i45) | ((-44248) & i45));
                        int i47 = ~((i45 ^ i) | (i45 & i));
                        int i48 = (i46 & i47) | (i46 ^ i47);
                        int i49 = ~((-44248) | i);
                        int i50 = -(-(((i48 & i49) | (i48 ^ i49)) * (-880)));
                        int i51 = ((i44 | i50) << 1) - (i44 ^ i50);
                        int i52 = ~((i45 & i6) | (i45 ^ i6));
                        int i53 = (i52 & 44247) | (44247 ^ i52);
                        int i54 = (i42 & i) | (i42 ^ i);
                        int i55 = ~i54;
                        int i56 = (i51 - (~(-(-(((i53 & i55) | (i53 ^ i55)) * (-880)))))) - 1;
                        int i57 = (~i54) * 880;
                        Object[] objArr25 = new Object[1];
                        b((char) ((i56 & i57) + (i57 | i56)), "\u0000\u0000\u0000\u0000", "沿㪥횇\ue107\ue593\ued99", ViewConfiguration.getJumpTapTimeout() >> 16, "冱鰲\ud801Ꭼ", objArr25);
                        String str4 = (String) objArr25[0];
                        char alpha = (char) Color.alpha(0);
                        int i58 = -TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0);
                        int i59 = (784461212 & i58) + (i58 | 784461212);
                        Object[] objArr26 = new Object[1];
                        b(alpha, "\u0000\u0000\u0000\u0000", "顅펭瞰ⴱ剥큮쌹", i59, "鶖쇭\ue72e絟", objArr26);
                        String str5 = (String) objArr26[0];
                        Object[] objArr27 = new Object[1];
                        c("\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001", false, new int[]{94, 9, 74, 0}, objArr27);
                        String str6 = (String) objArr27[0];
                        Object[] objArr28 = new Object[1];
                        c("\u0001\u0001\u0000\u0001\u0001\u0001", false, new int[]{103, 6, 0, 0}, objArr28);
                        String str7 = (String) objArr28[0];
                        Object[] objArr29 = new Object[1];
                        b((char) (24468 - (~(-(TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1))))), "\u0000\u0000\u0000\u0000", "燬\ue3c0\ue385㲉⋎㊕⑃쩩鵲\ue612\u0017豑\uef3d", 1836744629 - (~(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), "략穿镭繟", objArr29);
                        String str8 = (String) objArr29[0];
                        int i60 = i4;
                        Object[] objArr30 = new Object[1];
                        c("\u0001\u0001\u0001\u0001\u0001", false, new int[]{109, i60, 0, 4}, objArr30);
                        String str9 = (String) objArr30[0];
                        int[] iArr = {114, 6, 0, i60};
                        Object[] objArr31 = new Object[1];
                        c("\u0000\u0001\u0001\u0000\u0001\u0000", false, iArr, objArr31);
                        String str10 = (String) objArr31[0];
                        Object[] objArr32 = new Object[1];
                        c("\u0000\u0000", true, new int[]{120, 2, 37, 0}, objArr32);
                        String str11 = (String) objArr32[0];
                        int i61 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                        int i62 = i61 | 17897;
                        int i63 = ~i;
                        int i64 = (((i61 * 370) - (-6621890)) - (~(((i62 & i63) | (i62 ^ i63)) * (-369)))) - 1;
                        int i65 = ~i61;
                        int i66 = ~((i65 & i63) | (i65 ^ i63));
                        int i67 = -(-(((i66 & 17897) | (i66 ^ 17897)) * (-369)));
                        int i68 = (i64 ^ i67) + ((i64 & i67) << 1);
                        int i69 = ~(((-17898) ^ i61) | ((-17898) & i61));
                        int i70 = ~((i61 ^ i) | (i61 & i));
                        int i71 = (i69 & i70) | (i69 ^ i70);
                        int i72 = ~i61;
                        int i73 = (i72 & i6) | (i72 ^ i6);
                        int i74 = ~((i73 & 17897) | (i73 ^ 17897));
                        int i75 = -(-(((i74 & i71) | (i71 ^ i74)) * 369));
                        Object[] objArr33 = new Object[1];
                        b((char) (((i68 | i75) << 1) - (i75 ^ i68)), "\u0000\u0000\u0000\u0000", "㖍塮䐖앞靸∂劆読煝鐮쐒렔覀\u0a53㘫\ue82e", (-2) - ((-(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))) ^ (-1)), "詏坑\ue9ff⹅", objArr33);
                        String str12 = (String) objArr33[0];
                        Object[] objArr34 = new Object[1];
                        c("\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001", false, new int[]{122, 10, 0, 0}, objArr34);
                        String str13 = (String) objArr34[0];
                        Object[] objArr35 = new Object[1];
                        b((char) (ViewConfiguration.getWindowTouchSlop() >> 8), "\u0000\u0000\u0000\u0000", "⮀⺿ᙐ腽⺾\u0c4e䭍髙", TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), "䛷\ue355醠溇", objArr35);
                        String str14 = (String) objArr35[0];
                        char capsMode = (char) TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0);
                        int threadPriority2 = Process.getThreadPriority(0);
                        Object[] objArr36 = new Object[1];
                        b(capsMode, "\u0000\u0000\u0000\u0000", "펣뎃〙\ud9b9䟠᠐͊꜌⇬舄렏⼾", ((threadPriority2 & 20) + (threadPriority2 | 20)) >> 6, "代찋▶ꜭ", objArr36);
                        String str15 = (String) objArr36[0];
                        Object[] objArr37 = new Object[1];
                        c("\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000", true, new int[]{132, 14, 188, 0}, objArr37);
                        String str16 = (String) objArr37[0];
                        Object[] objArr38 = new Object[1];
                        c("\u0000\u0001\u0000\u0000\u0000\u0001\u0000", false, new int[]{146, 7, 0, 0}, objArr38);
                        String str17 = (String) objArr38[0];
                        Object[] objArr39 = new Object[1];
                        c(null, true, new int[]{153, 7, 186, 5}, objArr39);
                        String str18 = (String) objArr39[0];
                        char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int indexOf7 = TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0);
                        Object[] objArr40 = new Object[1];
                        b(maximumFlingVelocity, "\u0000\u0000\u0000\u0000", "ⲫ௪ꜷ砄护⥳币", ((-93548614) & indexOf7) + (indexOf7 | (-93548614)), "뤴沏诺쩏", objArr40);
                        String str19 = (String) objArr40[0];
                        Object[] objArr41 = new Object[1];
                        c("\u0001\u0000", true, new int[]{160, 2, 0, 0}, objArr41);
                        String str20 = (String) objArr41[0];
                        Object[] objArr42 = new Object[1];
                        c("\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001", true, new int[]{162, 20, 0, 0}, objArr42);
                        String str21 = (String) objArr42[0];
                        Object[] objArr43 = new Object[1];
                        c("\u0000\u0001\u0000\u0001\u0000\u0000", true, new int[]{182, 6, 197, 4}, objArr43);
                        String str22 = (String) objArr43[0];
                        Object[] objArr44 = new Object[1];
                        c("\u0001\u0000", false, new int[]{188, 2, 0, 2}, objArr44);
                        String str23 = (String) objArr44[0];
                        Object[] objArr45 = new Object[1];
                        c("\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000", true, new int[]{190, 16, 166, 14}, objArr45);
                        String str24 = (String) objArr45[0];
                        Object[] objArr46 = new Object[1];
                        c("\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000", true, new int[]{206, 9, 101, 0}, objArr46);
                        String str25 = (String) objArr46[0];
                        int i76 = -((byte) KeyEvent.getModifierMetaStateMask());
                        Object[] objArr47 = new Object[1];
                        b((char) ((i76 ^ (-1)) + (i76 << 1)), "\u0000\u0000\u0000\u0000", "糓맲넔酦ꢱ윀㡡樾ꃂ鑙", 0 - (~(-(-TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0)))), "\uf026\udaa9谪㪅", objArr47);
                        String str26 = (String) objArr47[0];
                        char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                        int i77 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                        int i78 = ((56390031 | i77) << 1) - (i77 ^ 56390031);
                        Object[] objArr48 = new Object[1];
                        b(modifierMetaStateMask, "\u0000\u0000\u0000\u0000", "\udd97\uf1e0쵏䖾샍\ue4d9谬\u1b4f嵛譌禩", i78, "辅山긃𣏕", objArr48);
                        String str27 = (String) objArr48[0];
                        Object[] objArr49 = new Object[1];
                        b((char) (KeyEvent.getMaxKeyCode() >> 16), "\u0000\u0000\u0000\u0000", "먳횖⇏㜲燹ἒ䙗ᆶ㲋⥫慄", 70544068 - (~ImageFormat.getBitsPerPixel(0)), "쓮㑪렄릧", objArr49);
                        String str28 = (String) objArr49[0];
                        Object[] objArr50 = new Object[1];
                        c("\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001", false, new int[]{215, 15, 0, 13}, objArr50);
                        String str29 = (String) objArr50[0];
                        Object[] objArr51 = new Object[1];
                        c("\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000", false, new int[]{230, 14, 28, 5}, objArr51);
                        String[] strArr3 = {str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, (String) objArr51[0]};
                        char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int i79 = -(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        int i80 = ((-947231465) ^ i79) + ((i79 & (-947231465)) << 1);
                        Object[] objArr52 = new Object[1];
                        b(keyRepeatDelay, "\u0000\u0000\u0000\u0000", "信\ude90\ue037嵲躜㖗헷\ue012뭡\uf06c\u1ac3", i80, "ᢚ詥⛇\ue9df", objArr52);
                        Object[] objArr53 = {(String) objArr52[0]};
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(547370249);
                        if (PngjBadSignature2 != null) {
                            float f2 = f;
                            char c4 = (char) (8752 - (PointF.length(f2, f2) > f2 ? 1 : (PointF.length(f2, f2) == f2 ? 0 : -1)));
                            int threadPriority3 = ((Process.getThreadPriority(0) + 20) >> 6) + 24;
                            int gidForName = 335 - Process.getGidForName(BuildConfig.FLAVOR);
                            byte b18 = (byte) 0;
                            byte b19 = (byte) (b18 + 2);
                            j3 = 0;
                            Object[] objArr54 = new Object[1];
                            a(b18, b19, (byte) (b19 - 1), objArr54);
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c4, threadPriority3, gidForName, -598779726, false, (String) objArr54[0], new Class[]{String.class});
                        } else {
                            j3 = 0;
                        }
                        invoke = ((Method) PngjBadSignature2).invoke(null, objArr53);
                        if (invoke == null) {
                            isAuthSucess.valueOf.PngjBadSignature();
                            Object[] objArr55 = new Object[1];
                            c("\u0000\u0001\u0001\u0001\u0001\u0001", false, new int[]{0, 6, 0, 4}, objArr55);
                            String str30 = (String) objArr55[0];
                            Object[] objArr56 = new Object[1];
                            c("\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001", false, new int[]{6, 8, 152, 0}, objArr56);
                            Object[] objArr57 = {invoke, new String[]{str30, (String) objArr56[0]}};
                            Object PngjBadSignature15 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-344601997);
                            if (PngjBadSignature15 == null) {
                                char deadChar2 = (char) (26716 - KeyEvent.getDeadChar(0, 0));
                                int myTid = (Process.myTid() >> 22) + 33;
                                int i81 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1668;
                                byte b20 = (byte) 0;
                                byte b21 = (byte) (b20 + 2);
                                Object[] objArr58 = new Object[1];
                                a(b20, b21, (byte) (b21 - 1), objArr58);
                                PngjBadSignature15 = com.d.e.a.PngjBadCrcException.PngjBadSignature(deadChar2, myTid, i81, 396011464, false, (String) objArr58[0], new Class[]{String.class, String[].class});
                            }
                            long longValue6 = ((Long) ((Method) PngjBadSignature15).invoke(null, objArr57)).longValue();
                            long j47 = -106468688;
                            i9 = i63;
                            long j48 = 140;
                            long j49 = i;
                            long j50 = (j47 ^ j2) | longValue6;
                            long j51 = j49 ^ j2;
                            long j52 = (((((((longValue6 ^ j2) | j47) ^ j2) | ((j51 | j47) ^ j2)) | ((j50 | j49) ^ j2)) * j48) + (((-280) * ((j50 ^ j2) | ((j51 | longValue6) ^ j2))) + (((longValue6 | j49) * j48) + (((-279) * longValue6) + (141 * j47))))) - 1580123533;
                            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                            if (((((int) (j52 >> 32)) & ((((~(startElapsedRealtime | 2090870889)) | (-1515584216)) * 70) + ((~((-39178903) | startElapsedRealtime)) * 70) + (((~((-653644479) | startElapsedRealtime)) | 614465576) * (-140)) + 279773850)) | (((int) j52) & ((((~((-1224158069) | i)) | (~(1633582817 | i6))) * 406) + ((~((-554194050) | i6)) * (-406)) + (((~((-1633582818) | i)) | (~(1778352117 | i6))) * (-406)) + 1580464435))) != 0) {
                                Object[] objArr59 = new Object[1];
                                b((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "\u0000\u0000\u0000\u0000", "ಹ鈥죃\u1af9퀮鲜燚㈛⛟썽䑪䃴쏽Ꙁ⒝尗들\u0c72ᜉꋖಙ梢꾟", 9763438 - (~(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))), "澹铺洀驌", objArr59);
                                Object[] objArr60 = {(String) objArr59[0]};
                                Object PngjBadSignature16 = com.d.e.a.PngjBadCrcException.PngjBadSignature(547370249);
                                if (PngjBadSignature16 == null) {
                                    char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(j3) + 8752);
                                    int indexOf8 = TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 24;
                                    int i82 = 335 - (ExpandableListView.getPackedPositionForChild(0, 0) > j3 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j3 ? 0 : -1));
                                    byte b22 = (byte) 0;
                                    byte b23 = (byte) (b22 + 2);
                                    Object[] objArr61 = new Object[1];
                                    a(b22, b23, (byte) (b23 - 1), objArr61);
                                    PngjBadSignature16 = com.d.e.a.PngjBadCrcException.PngjBadSignature(packedPositionGroup, indexOf8, i82, -598779726, false, (String) objArr61[0], new Class[]{String.class});
                                }
                                Object invoke5 = ((Method) PngjBadSignature16).invoke(null, objArr60);
                                Object[] objArr62 = new Object[1];
                                c("\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001", true, new int[]{14, 30, 0, 0}, objArr62);
                                Object[] objArr63 = {(String) objArr62[0]};
                                Object PngjBadSignature17 = com.d.e.a.PngjBadCrcException.PngjBadSignature(547370249);
                                if (PngjBadSignature17 == null) {
                                    char indexOf9 = (char) (8751 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0'));
                                    int i83 = 25 - (ViewConfiguration.getZoomControlsTimeout() > j3 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j3 ? 0 : -1));
                                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 336;
                                    byte b24 = (byte) 0;
                                    byte b25 = (byte) (b24 + 2);
                                    strArr = strArr3;
                                    Object[] objArr64 = new Object[1];
                                    a(b24, b25, (byte) (b25 - 1), objArr64);
                                    PngjBadSignature17 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf9, i83, makeMeasureSpec, -598779726, false, (String) objArr64[0], new Class[]{String.class});
                                } else {
                                    strArr = strArr3;
                                }
                                Object invoke6 = ((Method) PngjBadSignature17).invoke(null, objArr63);
                                if (invoke5 != null) {
                                    Object[] objArr65 = {invoke5, 42};
                                    Object PngjBadSignature18 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                                    if (PngjBadSignature18 == null) {
                                        char indexOf10 = (char) (TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 11039);
                                        int jumpTapTimeout = 31 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                        int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1282;
                                        byte b26 = (byte) 4;
                                        byte b27 = (byte) (b26 - 3);
                                        Object[] objArr66 = new Object[1];
                                        a(b26, b27, b27, objArr66);
                                        PngjBadSignature18 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf10, jumpTapTimeout, scrollBarFadeDuration2, -971849413, false, (String) objArr66[0], new Class[]{String.class, cls});
                                    }
                                    long longValue7 = ((Long) ((Method) PngjBadSignature18).invoke(null, objArr65)).longValue();
                                    long j53 = -850933585;
                                    long j54 = ((j53 ^ j2) | longValue7) ^ j2;
                                    long j55 = ((-140) * (j54 | ((longValue7 | j49) ^ j2))) + ((-69) * longValue7) + (71 * j53);
                                    long j56 = 70;
                                    long j57 = (j56 * (j54 | (((longValue7 ^ j2) | j53) ^ j2) | ((j53 | j49) ^ j2))) + ((((j53 | longValue7) | j49) ^ j2) * j56) + j55 + 1506641285;
                                    int myPid = Process.myPid();
                                    int i84 = ((((~((-543354852) | myPid)) | 541222339) | (~((-893871560) | myPid))) * (-880)) - 818885110;
                                    int i85 = (~((-543354852) | (~myPid))) | 893871559;
                                    int i86 = ~(myPid | 543354851);
                                }
                                if (invoke6 != null) {
                                    Object[] objArr67 = {invoke6, 42};
                                    Object PngjBadSignature19 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                                    if (PngjBadSignature19 == null) {
                                        char offsetAfter2 = (char) (11039 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0));
                                        int red = Color.red(0) + 31;
                                        int deadChar3 = 1282 - KeyEvent.getDeadChar(0, 0);
                                        byte b28 = (byte) 4;
                                        byte b29 = (byte) (b28 - 3);
                                        Object[] objArr68 = new Object[1];
                                        a(b28, b29, b29, objArr68);
                                        PngjBadSignature19 = com.d.e.a.PngjBadCrcException.PngjBadSignature(offsetAfter2, red, deadChar3, -971849413, false, (String) objArr68[0], new Class[]{String.class, cls});
                                    }
                                    long longValue8 = ((Long) ((Method) PngjBadSignature19).invoke(null, objArr67)).longValue();
                                    long j58 = -1349966350;
                                    long j59 = (421 * longValue8) + ((-419) * j58);
                                    long j60 = 420;
                                    long a2 = defpackage.a.a();
                                    long j61 = j58 ^ j2;
                                    long j62 = ((((j61 | (longValue8 ^ j2)) ^ j2) | (((a2 ^ j2) | longValue8) ^ j2)) * j60) + ((-420) * (longValue8 | j61)) + (((longValue8 | a2) ^ j2) * j60) + j59 + 2005674050;
                                    int i87 = ((int) (j62 >> 32)) & ((((~(i6 | (-1389701271))) | (~((-1468039615) | i))) * 950) + (((~(i6 | (-1468039615))) | (~((-1389701271) | i))) * (-950)) + (((~(1389701270 | i6)) | (~(1468039614 | i))) * 1900) + 1871737038);
                                    int i88 = (int) j62;
                                    int freeMemory = (int) Runtime.getRuntime().freeMemory();
                                    int i89 = ~freeMemory;
                                }
                            }
                        } else {
                            i9 = i63;
                        }
                        char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                        int i90 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int PngjBadSignature20 = isAuthSucess.valueOf.PngjBadSignature();
                        int i91 = (i90 * (-919)) - (-1177750335);
                        int i92 = ~i90;
                        int i93 = (i92 ^ 1744505496) | (i92 & 1744505496);
                        int i94 = ~((i93 & PngjBadSignature20) | (i93 ^ PngjBadSignature20));
                        int i95 = ~PngjBadSignature20;
                        int i96 = (1744505496 ^ i95) | (1744505496 & i95);
                        int i97 = ~((i96 ^ i90) | (i96 & i90));
                        int i98 = -(-(((i94 ^ i97) | (i97 & i94)) * 920));
                        int i99 = (i91 ^ i98) + ((i91 & i98) << 1);
                        int i100 = ~((~i90) | 1744505496);
                        int i101 = ~(i92 | i95);
                        int i102 = (i99 - (~(((i100 ^ i101) | (i100 & i101)) * 920))) - 1;
                        int i103 = ~((i92 ^ 1744505496) | (i92 & 1744505496) | i95);
                        int i104 = (i92 ^ (-1744505497)) | (i92 & (-1744505497));
                        int i105 = ~((i104 & PngjBadSignature20) | (i104 ^ PngjBadSignature20));
                        int i106 = (i90 & 1744505496) | (1744505496 ^ i90);
                        int i107 = -(-(((~((i106 & PngjBadSignature20) | (i106 ^ PngjBadSignature20))) | (i105 & i103) | (i103 ^ i105)) * 920));
                        int i108 = (i102 & i107) + (i107 | i102);
                        Object[] objArr69 = new Object[1];
                        b(tapTimeout, "\u0000\u0000\u0000\u0000", "躚䃿篽ᙊ迹聕㻲䧏脧梡⸡嘦ꮜ篥쉟\uf112矺\ue23d棨ﻅ퉻\udb03ᤥ", i108, "柑ӵ檘䎁", objArr69);
                        Object[] objArr70 = {(String) objArr69[0]};
                        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-936033973);
                        if (PngjBadSignature3 == null) {
                            char c5 = (char) ((SystemClock.uptimeMillis() > j3 ? 1 : (SystemClock.uptimeMillis() == j3 ? 0 : -1)) + 29466);
                            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 39;
                            int i109 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 432;
                            byte b30 = (byte) 0;
                            byte b31 = (byte) (b30 + 2);
                            Object[] objArr71 = new Object[1];
                            a(b30, b31, (byte) (b31 - 1), objArr71);
                            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c5, longPressTimeout, i109, 886713584, false, (String) objArr71[0], new Class[]{String.class});
                        }
                        long longValue9 = ((Long) ((Method) PngjBadSignature3).invoke(null, objArr70)).longValue();
                        long j63 = -566650168;
                        long j64 = (263 * longValue9) + ((-523) * j63);
                        long j65 = 262;
                        long j66 = ((j63 ^ j2) | longValue9) ^ j2;
                        long j67 = longValue9 ^ j2;
                        long j68 = (j67 | j63) ^ j2;
                        long elapsedRealtime = (int) SystemClock.elapsedRealtime();
                        long j69 = ((((((j67 | (elapsedRealtime ^ j2)) ^ j2) | j66) | j68) * j65) + (((-786) * j68) + ((((j66 | j68) | ((j67 | elapsedRealtime) ^ j2)) * j65) + j64))) - 582062480;
                        int i110 = ((int) (j69 >> 32)) & ((((~((-160364688) | i6)) | 1446053424) * 420) + ((~((-160364688) | i)) * 420) + 1051485262);
                        int i111 = ((int) j69) & (((~((-64910267) | i)) * 113) + (((~(1502136676 | i)) | (-1541340159) | (~((-25706785) | i6))) * (-113)) + (((~((-64910267) | i6)) | (-1502136677)) * 226) + 2055568080);
                        j4 = (i110 & i111) | (i110 ^ i111);
                        int size = View.MeasureSpec.getSize(0);
                        Object[] objArr72 = new Object[1];
                        b((char) ((size ^ 14827) + ((size & 14827) << 1)), "\u0000\u0000\u0000\u0000", "峅鎶\uf85e㼯軹☇㢠暰䘏\udc2d墺諎೩鑵ꂒᆹ뭩", (SystemClock.elapsedRealtime() > j3 ? 1 : (SystemClock.elapsedRealtime() == j3 ? 0 : -1)) - 1043574162, "濭챒\uebc1ȹ", objArr72);
                        Object[] objArr73 = {(String) objArr72[0]};
                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-936033973);
                        if (PngjBadSignature4 == null) {
                            char myTid2 = (char) ((Process.myTid() >> 22) + 29467);
                            int bitsPerPixel2 = 38 - ImageFormat.getBitsPerPixel(0);
                            int mode = View.MeasureSpec.getMode(0) + 432;
                            byte b32 = (byte) 0;
                            byte b33 = (byte) (b32 + 2);
                            Object[] objArr74 = new Object[1];
                            a(b32, b33, (byte) (b33 - 1), objArr74);
                            PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(myTid2, bitsPerPixel2, mode, 886713584, false, (String) objArr74[0], new Class[]{String.class});
                        }
                        long longValue10 = ((Long) ((Method) PngjBadSignature4).invoke(null, objArr73)).longValue();
                        long j70 = -494525746;
                        long j71 = -500;
                        long j72 = (j71 * longValue10) + (j71 * j70);
                        long j73 = 501;
                        long j74 = longValue10 ^ j2;
                        long j75 = (j74 | j70) ^ j2;
                        long j76 = j70 ^ j2;
                        long maxMemory = (int) Runtime.getRuntime().maxMemory();
                        long j77 = ((j75 | (((j76 | longValue10) | maxMemory) ^ j2)) * j73) + j72;
                        long j78 = 1002;
                        long j79 = (((((j76 | (maxMemory ^ j2)) | longValue10) ^ j2) * j73) + ((((j76 | j74) ^ j2) * j78) + j77)) - 654186902;
                        long j80 = (((int) (j79 >> 32)) & ((((~((-1146246401) | i)) | 285212808) * 235) + (((~(998353646 | i)) | (-1859387239)) * (-470)) + (((~(998353646 | i6)) | (-1859387239)) * (-235)) + 1013679403)) | (((int) j79) & ((((~((-75501865) | i)) | 286408833) * 366) + (((~((-1323416959) | i)) | 1534323927) * (-366)) + 33164617));
                        if (j4 <= j3 && j80 > j3 && j80 - 3 < j4) {
                            Object[] objArr75 = {new int[]{r7}, new int[]{((~r1) & r2) | ((~r2) & r1)}, null, new int[]{i}};
                            int i112 = (~(i & 247)) & (i | 247);
                            int i113 = (i2 - (~defpackage.a.c(~(i | (-2916905)), 345, (((~((-813478697) | i6)) | 218170373) * 345) + ((((~((-813478697) | i)) | 2916904) * 345) + 591590856), 16))) - 1;
                            int i114 = i113 ^ (i113 << 13);
                            int i115 = i114 ^ (i114 >>> 17);
                            int i116 = i115 << 5;
                            return objArr75;
                        }
                        Object[] objArr76 = new Object[1];
                        b((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u0000\u0000\u0000\u0000", "躚䃿篽ᙊ迹聕㻲䧏脧梡⸡嘦ꮜ篥쉟\uf112矺\ue23d棨ﻅ퉻\udb03ᤥ", ExpandableListView.getPackedPositionChild(j3) - 1744505496, "柑ӵ檘䎁", objArr76);
                        Object[] objArr77 = {(String) objArr76[0]};
                        PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-936033973);
                        if (PngjBadSignature5 == null) {
                            char c6 = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29467);
                            int gidForName2 = 38 - Process.getGidForName(BuildConfig.FLAVOR);
                            int resolveOpacity2 = Drawable.resolveOpacity(0, 0) + 432;
                            byte b34 = (byte) 0;
                            byte b35 = (byte) (b34 + 2);
                            Object[] objArr78 = new Object[1];
                            a(b34, b35, (byte) (b35 - 1), objArr78);
                            PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c6, gidForName2, resolveOpacity2, 886713584, false, (String) objArr78[0], new Class[]{String.class});
                        }
                        long longValue11 = ((Long) ((Method) PngjBadSignature5).invoke(null, objArr77)).longValue();
                        long j81 = -145928452;
                        long j82 = (111 * longValue11) + ((-109) * j81);
                        long j83 = j81 ^ j2;
                        long myPid2 = (longValue11 | Process.myPid()) ^ j2;
                        long j84 = ((110 * (((j83 | longValue11) ^ j2) | (((longValue11 ^ j2) | j81) ^ j2))) + ((220 * (((j81 | longValue11) ^ j2) | myPid2)) + (((-220) * (j83 | myPid2)) + j82))) - 1002784196;
                        int i117 = ~(((int) Process.getElapsedCpuTime()) | 329613215);
                        int c7 = ((int) (j84 >> 32)) & defpackage.a.c(i117 | (-1403387808), 220, (((-1107613196) | i117) * (-220)) + 1756574530, 326557080);
                        int i118 = (int) j84;
                        int i119 = ~((int) Process.getElapsedCpuTime());
                        int i120 = i118 & ((((~((-859504128) | i119)) | (-1998236759)) * 68) + ((~((-1140850689) | i119)) * (-68)) + ((((~(r8 | 859504127)) | ((~((-857386071) | i119)) | (-2000354816))) * (-68)) - 1312818831));
                        j5 = (c7 & i120) | (c7 ^ i120);
                        Object[] objArr79 = new Object[1];
                        c("\u0001\u0001\u0001\u0001", false, new int[]{244, 4, 0, 0}, objArr79);
                        Object[] objArr80 = {(String) objArr79[0]};
                        PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-936033973);
                        if (PngjBadSignature6 == null) {
                            char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 29467);
                            int i121 = (ViewConfiguration.getGlobalActionKeyTimeout() > j3 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j3 ? 0 : -1)) + 38;
                            int capsMode2 = TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 432;
                            byte b36 = (byte) 0;
                            byte b37 = (byte) (b36 + 2);
                            Object[] objArr81 = new Object[1];
                            a(b36, b37, (byte) (b37 - 1), objArr81);
                            PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(edgeSlop, i121, capsMode2, 886713584, false, (String) objArr81[0], new Class[]{String.class});
                        }
                        long longValue12 = ((Long) ((Method) PngjBadSignature6).invoke(null, objArr80)).longValue();
                        long j85 = 662295032;
                        long j86 = 530;
                        long j87 = (j86 * longValue12) + (j86 * j85) + 1058;
                        long j88 = 529;
                        long j89 = i;
                        long j90 = j89 ^ j2;
                        long j91 = ((((longValue12 ^ j2) | ((j85 | j89) ^ j2)) * j88) + (((((j90 | j85) ^ j2) | ((j85 | longValue12) ^ j2)) * j88) + j87)) - 1811007680;
                        int i122 = ((int) (j91 >> 32)) & (((~((-1504977460) | i)) * 283) + (((~(101436876 | i)) | (-1606414336)) * (-283)) + 2088502698);
                        int c8 = ((int) j91) & defpackage.a.c((~(423678542 | i)) | 606667025 | (~((-1013547868) | i)), -69, (((~(1030345567 | i)) | (~((-406880843) | i))) * 69) + 609051350, 1159041300);
                        j6 = (i122 & c8) | (i122 ^ c8);
                        if (j5 > j3 && j6 > j3) {
                            int i123 = PngjUnsupportedException;
                            i19 = (i123 & 51) + (i123 | 51);
                            PngjInputException = i19 % Uuid.SIZE_BITS;
                            long j92 = j6 + 100;
                            if (i19 % 2 == 0 ? j92 < j5 : j92 < j5) {
                                isAuthSucess.valueOf.PngjBadSignature();
                                isAuthSucess.valueOf.PngjBadSignature();
                                Object[] objArr82 = {new int[]{i ^ 248}, new int[1], null, new int[]{i}};
                                int b38 = defpackage.a.b(155067504);
                                int i124 = ~b38;
                                int i125 = (((~(b38 | (-942986825))) | (~(i124 | (-88154374)))) * 765) + (((~((-942986825) | i124)) | 3424776) * 1530) + (((~((-3424777) | i124)) | (~((-939562049) | b38)) | (~((-88154374) | b38))) * 765) + 35164460;
                                int i126 = ~((-17) | i125);
                                int i127 = ~((i125 ^ i) | (i125 & i));
                                int i128 = (((i125 * (-69)) + 1136) - (~(((i126 & i127) | (i126 ^ i127)) * (-140)))) - 1;
                                int i129 = (i125 ^ 16) | (i125 & 16);
                                int i130 = (~((i129 & i) | (i129 ^ i))) * 70;
                                int i131 = (i128 & i130) + (i128 | i130);
                                int i132 = ~(((-17) ^ i125) | ((-17) & i125));
                                int i133 = ~i125;
                                int i134 = ~((i133 & 16) | (i133 ^ 16));
                                int i135 = (i134 & i132) | (i132 ^ i134);
                                int i136 = ~(i | 16);
                                int i137 = ((i136 & i135) | (i135 ^ i136)) * 70;
                                int i138 = (i2 - (~(((i131 | i137) << 1) - (i137 ^ i131)))) - 1;
                                int i139 = i138 ^ (i138 << 13);
                                int i140 = i139 ^ (i139 >>> 17);
                                int i141 = i140 << 5;
                                ((int[]) objArr82[1])[0] = (i140 | i141) & (~(i140 & i141));
                                return objArr82;
                            }
                        }
                        Object[] objArr83 = new Object[1];
                        b((char) Color.blue(0), "\u0000\u0000\u0000\u0000", "✯赌扵懧쿠ꭚ뉳", 1777500325 - (~(-(Process.myPid() >> 22))), "ꚏ\uf280\u2069诔", objArr83);
                        String str31 = (String) objArr83[0];
                        int bitsPerPixel3 = ImageFormat.getBitsPerPixel(0);
                        int i142 = (i6 ^ bitsPerPixel3) | (i6 & bitsPerPixel3);
                        int i143 = ~i142;
                        int i144 = (((bitsPerPixel3 * 765) - 1527) - (~(-(-(((i143 & 1) | (i143 ^ 1)) * 764))))) - 1;
                        int i145 = ~bitsPerPixel3;
                        int i146 = ~((i145 & 1) | (i145 ^ 1));
                        int i147 = ~((i9 ^ 1) | (i9 & 1));
                        int i148 = (((i146 & i147) | (i146 ^ i147)) * (-1528)) + i144;
                        int i149 = ~bitsPerPixel3;
                        int i150 = ~((i149 & 1) | (i149 ^ 1));
                        int i151 = ~((bitsPerPixel3 & (-2)) | ((-2) ^ bitsPerPixel3));
                        int i152 = (i151 & i150) | (i150 ^ i151);
                        int i153 = ~i142;
                        int i154 = ((i152 & i153) | (i152 ^ i153)) * 764;
                        char c9 = (char) (((i148 | i154) << 1) - (i154 ^ i148));
                        int combineMeasuredStates = View.combineMeasuredStates(0, 0);
                        int i155 = ~combineMeasuredStates;
                        int i156 = (i6 ^ combineMeasuredStates) | (i6 & combineMeasuredStates);
                        int i157 = (((combineMeasuredStates * 221) - 1083706127) - (~(-(-(((~((i155 & (-612911838)) | (i155 ^ (-612911838)))) | (~((i156 & 612911837) | (i156 ^ 612911837)))) * 220))))) - 1;
                        int i158 = ~(i9 | 612911837);
                        int i159 = (((i158 & combineMeasuredStates) | (combineMeasuredStates ^ i158)) * (-440)) + i157;
                        int i160 = combineMeasuredStates | 612911837;
                        int i161 = ((i160 & i) | (i160 ^ i)) * 220;
                        int i162 = ((i159 | i161) << 1) - (i161 ^ i159);
                        Object[] objArr84 = new Object[1];
                        b(c9, "\u0000\u0000\u0000\u0000", "ଁ\u1ad9퉥٨㟪㶰壘훩\ue520셈䃍", i162, "\uddcb衊ؤꇽ", objArr84);
                        String str32 = (String) objArr84[0];
                        char resolveSize = (char) View.resolveSize(0, 0);
                        int i163 = -TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0);
                        int PngjBadSignature21 = isAuthSucess.valueOf.PngjBadSignature();
                        int i164 = i163 * 980;
                        int i165 = ((~(~PngjBadSignature21)) * 979) + (((i164 | 978) << 1) - (i164 ^ 978));
                        int i166 = -(-(((i163 ^ PngjBadSignature21) | (i163 & PngjBadSignature21)) * (-979)));
                        int i167 = ((i165 | i166) << 1) - (i165 ^ i166);
                        int i168 = ~PngjBadSignature21;
                        int i169 = ~PngjBadSignature21;
                        int i170 = ~((i163 & i169) | (i169 ^ i163));
                        int i171 = -(-(((i170 & i168) | (i168 ^ i170)) * 979));
                        int i172 = ((i167 | i171) << 1) - (i171 ^ i167);
                        Object[] objArr85 = new Object[1];
                        b(resolveSize, "\u0000\u0000\u0000\u0000", "䠁\ue66bⰅ嗣臮縔峄叏፮ﬧ⋐ཕ", i172, "꒿㰩և妣", objArr85);
                        String str33 = (String) objArr85[0];
                        Object[] objArr86 = new Object[1];
                        c("\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001", false, new int[]{248, 12, 41, 0}, objArr86);
                        String str34 = (String) objArr86[0];
                        int i173 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        Object[] objArr87 = new Object[1];
                        b((char) ((i173 ^ 1) + ((i173 & 1) << 1)), "\u0000\u0000\u0000\u0000", "몥郩䎬\ue92e곮벇䭥訝\ueca1䉧ⶕ", (-764516043) - (~(-(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))))), "㚯湩跒ꮈ", objArr87);
                        String str35 = (String) objArr87[0];
                        int i174 = -(-(ViewConfiguration.getEdgeSlop() >> 16));
                        int i175 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > j3 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j3 ? 0 : -1)));
                        int i176 = (i175 & (-543875791)) + (i175 | (-543875791));
                        Object[] objArr88 = new Object[1];
                        b((char) ((i174 & 10665) + (i174 | 10665)), "\u0000\u0000\u0000\u0000", "쑋ݮ墶۶刬", i176, "〉锝꧟舩", objArr88);
                        String str36 = (String) objArr88[0];
                        int i177 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        Object[] objArr89 = new Object[1];
                        b((char) ((i177 & 64845) + (i177 | 64845)), "\u0000\u0000\u0000\u0000", "鵾饖쀕\ue0c4", ViewConfiguration.getLongPressTimeout() >> 16, "욉̈䵆\u17fd", objArr89);
                        String[] strArr4 = {str31, str32, str33, str34, str35, str36, (String) objArr89[0]};
                        i10 = 0;
                        while (true) {
                            if (i10 < 7) {
                                i11 = 0;
                                break;
                            }
                            Object[] objArr90 = {strArr4[i10]};
                            Object PngjBadSignature22 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1492900309);
                            if (PngjBadSignature22 == null) {
                                char axisFromString2 = (char) ((-1) - MotionEvent.axisFromString(BuildConfig.FLAVOR));
                                int myPid3 = (Process.myPid() >> 22) + 35;
                                int touchSlop = 397 - (ViewConfiguration.getTouchSlop() >> 8);
                                byte b39 = (byte) 0;
                                byte b40 = (byte) (b39 + 2);
                                Object[] objArr91 = new Object[1];
                                a(b39, b40, (byte) (b40 - 1), objArr91);
                                PngjBadSignature22 = com.d.e.a.PngjBadCrcException.PngjBadSignature(axisFromString2, myPid3, touchSlop, 1542146960, false, (String) objArr91[0], new Class[]{String.class});
                            }
                            long longValue13 = ((Long) ((Method) PngjBadSignature22).invoke(null, objArr90)).longValue();
                            long j93 = 275974902;
                            long j94 = 829;
                            long j95 = (j94 * longValue13) + (j94 * j93);
                            long j96 = -828;
                            long j97 = ((j93 ^ j2) | (longValue13 ^ j2)) ^ j2;
                            long myTid3 = Process.myTid() ^ j2;
                            long j98 = ((j97 | (((myTid3 | j93) | longValue13) ^ j2)) * j96) + j95;
                            long j99 = j93 | longValue13;
                            long j100 = ((828 * (j99 ^ j2)) + (((myTid3 | j99) * j96) + j98)) - 640553681;
                            int b41 = defpackage.a.b(1290095703);
                            int i178 = ((int) (j100 >> 32)) & ((((~(b41 | 1143559238)) | (~((~b41) | 293667172))) * 627) + (((~((-293667173) | b41)) | 1143559238) * (-627)) + (((-1143493635) | b41) * (-627)) + 635053320);
                            int i179 = ((int) j100) & (((67592206 | (~(1369634203 | i)) | (~(i6 | (-1369634204)))) * 45) + (((~(67592206 | i)) | 155658) * (-45)) + ((((~(67592206 | i6)) | (-1369634204)) * (-90)) - 1687905466));
                            if (((i178 & i179) | (i178 ^ i179)) != 0) {
                                int PngjBadSignature23 = isAuthSucess.valueOf.PngjBadSignature();
                                int i180 = -(-(i10 * 471));
                                int i181 = (21240 ^ i180) + ((i180 & 21240) << 1);
                                int i182 = ~PngjBadSignature23;
                                int i183 = ((~((i182 & (-91)) | ((-91) ^ i182))) | i10) * (-235);
                                int i184 = ((i181 | i183) << 1) - (i183 ^ i181);
                                int i185 = ((~(((-91) ^ PngjBadSignature23) | ((-91) & PngjBadSignature23))) | i10) * (-470);
                                int i186 = (i184 ^ i185) + ((i184 & i185) << 1);
                                int i187 = ~i10;
                                int i188 = ~((i187 & 90) | (i187 ^ 90));
                                int i189 = i10 | (-91);
                                int i190 = ~((PngjBadSignature23 & i189) | (i189 ^ PngjBadSignature23));
                                int i191 = ((i190 & i188) | (i188 ^ i190)) * 235;
                                i11 = (i191 | i186) + (i186 & i191);
                                break;
                            }
                            i10++;
                        }
                        if (i11 == 0) {
                            Object[] objArr92 = {new int[]{i11 ^ i}, new int[]{((~r0) & r1) | ((~r1) & r0)}, null, new int[]{i}};
                            int i192 = ~((-578379160) | i);
                            int i193 = (((~((-36723095) | i)) | (~((-541656066) | i6)) | (~((-419463721) | i6))) * 140) + ((i192 | (~((-456186815) | i))) * 140) + ((541656065 | i192) * (-280)) + 961625089;
                            int i194 = (i193 * (-445)) - 7120;
                            int i195 = ~i193;
                            int i196 = ~(((-17) ^ i195) | ((-17) & i195));
                            int i197 = ~((i6 & i195) | (i195 ^ i6));
                            int i198 = -(-(((i197 & i196) | (i196 ^ i197)) * 446));
                            int i199 = (((i194 & i198) + (i194 | i198)) - (~(-(-(((~(((-17) ^ i193) | ((-17) & i193))) | (~(i | (i195 | 16)))) * 446))))) - 1;
                            int i200 = ~i193;
                            int i201 = -(-((~(((-17) & i200) | ((-17) ^ i200))) * 446));
                            int i202 = -(-(((i199 | i201) << 1) - (i201 ^ i199)));
                            int i203 = (i2 ^ i202) + ((i202 & i2) << 1);
                            int i204 = (i203 << 13) ^ i203;
                            int i205 = i204 >>> 17;
                            int i206 = ((~i204) & i205) | ((~i205) & i204);
                            int i207 = i206 << 5;
                            return objArr92;
                        }
                        try {
                            Object[] objArr93 = new Object[1];
                            c("\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001", true, new int[]{260, 13, 135, 0}, objArr93);
                            try {
                                Object[] objArr94 = {(String) objArr93[0]};
                                Object PngjBadSignature24 = com.d.e.a.PngjBadCrcException.PngjBadSignature(547370249);
                                if (PngjBadSignature24 == null) {
                                    char argb = (char) (Color.argb(0, 0, 0, 0) + 8752);
                                    int longPressTimeout2 = 24 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                    int offsetBefore2 = 336 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0);
                                    byte b42 = (byte) 0;
                                    byte b43 = (byte) (b42 + 2);
                                    Object[] objArr95 = new Object[1];
                                    a(b42, b43, (byte) (b43 - 1), objArr95);
                                    PngjBadSignature24 = com.d.e.a.PngjBadCrcException.PngjBadSignature(argb, longPressTimeout2, offsetBefore2, -598779726, false, (String) objArr95[0], new Class[]{String.class});
                                }
                                invoke2 = ((Method) PngjBadSignature24).invoke(null, objArr94);
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
                            if (invoke2 != null) {
                                Object[] objArr96 = new Object[1];
                                c("\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001", false, new int[]{273, 11, 0, 0}, objArr96);
                                try {
                                    Object[] objArr97 = {invoke2, new String[]{(String) objArr96[0]}};
                                    Object PngjBadSignature25 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-344601997);
                                    if (PngjBadSignature25 == null) {
                                        char c10 = (char) (26716 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                        int combineMeasuredStates2 = 33 - View.combineMeasuredStates(0, 0);
                                        int i208 = 1668 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        byte b44 = (byte) 0;
                                        byte b45 = (byte) (b44 + 2);
                                        Object[] objArr98 = new Object[1];
                                        a(b44, b45, (byte) (b45 - 1), objArr98);
                                        PngjBadSignature25 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c10, combineMeasuredStates2, i208, 396011464, false, (String) objArr98[0], new Class[]{String.class, String[].class});
                                    }
                                    long longValue14 = ((Long) ((Method) PngjBadSignature25).invoke(null, objArr97)).longValue();
                                    long j101 = -462442820;
                                    long j102 = (949 * longValue14) + ((-947) * j101);
                                    long j103 = -948;
                                    long j104 = j101 ^ j2;
                                    long j105 = longValue14 ^ j2;
                                    long startUptimeMillis2 = (int) Process.getStartUptimeMillis();
                                    long j106 = ((948 * (j101 | j105)) + (((((j104 | j105) | (startUptimeMillis2 ^ j2)) ^ j2) * j103) + (((j104 | ((j105 | startUptimeMillis2) ^ j2)) * j103) + j102))) - 1224149401;
                                    int i209 = (int) (j106 >> 32);
                                    int maxMemory2 = (int) Runtime.getRuntime().maxMemory();
                                    int i210 = i209 & ((((~((~maxMemory2) | 1374985252)) | (-62241159)) * 168) + (((~(1374985252 | maxMemory2)) | (-1408613799)) * (-168)) + (((~((-62241159) | maxMemory2)) | 28612612) * 336) + 501358106);
                                    int i211 = ((int) j106) & ((((-1595518306) | (~((-1262222581) | i))) * 502) + ((~((-335544578) | i6)) * (-502)) + ((((~((-1595518306) | i)) | (-1597767158)) * (-502)) - 1626497005));
                                    if (((i210 & i211) | (i210 ^ i211)) == 0) {
                                        PngjUnsupportedException = (PngjInputException + 91) % Uuid.SIZE_BITS;
                                        i12 = 0;
                                        if (i12 != 0) {
                                            Object[] objArr99 = {new int[]{(i12 & i6) | ((~i12) & i)}, new int[1], null, new int[]{i}};
                                            int i212 = ((~(i6 | 549729792)) * 886) + ((549729792 | (~(i6 | 484836181))) * (-1772)) + (((~((-484836182) | i)) | 12845568 | (~(1021720405 | i6))) * 886) + 130054439;
                                            int PngjBadSignature26 = isAuthSucess.valueOf.PngjBadSignature();
                                            int i213 = i212 * 868;
                                            int i214 = (13888 & i213) + (i213 | 13888);
                                            int i215 = ~PngjBadSignature26;
                                            int i216 = ~(((-17) ^ i215) | ((-17) & i215));
                                            int i217 = ~i212;
                                            int i218 = ~((i215 & i217) | (i217 ^ i215));
                                            int i219 = ((i218 & i216) | (i216 ^ i218)) * (-867);
                                            int i220 = ((i214 | i219) << 1) - (i219 ^ i214);
                                            int i221 = ~(((-17) ^ i217) | ((-17) & i217));
                                            int i222 = ~(((-17) ^ PngjBadSignature26) | ((-17) & PngjBadSignature26));
                                            int i223 = (i221 & i222) | (i221 ^ i222);
                                            int i224 = ~((i217 ^ PngjBadSignature26) | (i217 & PngjBadSignature26));
                                            int i225 = ((i223 & i224) | (i223 ^ i224)) * (-1734);
                                            int i226 = (i220 ^ i225) + ((i225 & i220) << 1);
                                            int i227 = ~i212;
                                            int i228 = ((-17) & i227) | ((-17) ^ i227);
                                            int i229 = ~PngjBadSignature26;
                                            int i230 = ~((i228 & i229) | (i228 ^ i229));
                                            int i231 = ((-17) & i212) | ((-17) ^ i212);
                                            int i232 = ~((i231 & PngjBadSignature26) | (i231 ^ PngjBadSignature26));
                                            int i233 = (i232 & i230) | (i230 ^ i232);
                                            int i234 = (i217 ^ 16) | (i217 & 16);
                                            int i235 = ~((PngjBadSignature26 & i234) | (i234 ^ PngjBadSignature26));
                                            int i236 = ((i233 & i235) | (i233 ^ i235)) * 867;
                                            int i237 = -(-((i226 ^ i236) + ((i236 & i226) << 1)));
                                            int i238 = (i2 ^ i237) + ((i237 & i2) << 1);
                                            int i239 = i238 << 13;
                                            int i240 = (i239 & (~i238)) | ((~i239) & i238);
                                            int i241 = i240 >>> 17;
                                            int i242 = (i240 | i241) & (~(i240 & i241));
                                            int i243 = i242 << 5;
                                            ((int[]) objArr99[1])[0] = ((~i242) & i243) | ((~i243) & i242);
                                            return objArr99;
                                        }
                                        Object[] objArr100 = new Object[1];
                                        c("\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001", true, new int[]{260, 13, 135, 0}, objArr100);
                                        Object[] objArr101 = {(String) objArr100[0]};
                                        Object PngjBadSignature27 = com.d.e.a.PngjBadCrcException.PngjBadSignature(547370249);
                                        if (PngjBadSignature27 == null) {
                                            char longPressTimeout3 = (char) (8752 - (ViewConfiguration.getLongPressTimeout() >> 16));
                                            int lastIndexOf2 = TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 25;
                                            int rgb = (-16776880) - Color.rgb(0, 0, 0);
                                            byte b46 = (byte) 0;
                                            byte b47 = (byte) (b46 + 2);
                                            Object[] objArr102 = new Object[1];
                                            a(b46, b47, (byte) (b47 - 1), objArr102);
                                            PngjBadSignature27 = com.d.e.a.PngjBadCrcException.PngjBadSignature(longPressTimeout3, lastIndexOf2, rgb, -598779726, false, (String) objArr102[0], new Class[]{String.class});
                                        }
                                        Object invoke7 = ((Method) PngjBadSignature27).invoke(null, objArr101);
                                        if (invoke7 != null) {
                                            Object[] objArr103 = new Object[1];
                                            c("\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001", false, new int[]{273, 11, 0, 0}, objArr103);
                                            Object[] objArr104 = {invoke7, new String[]{(String) objArr103[0]}};
                                            Object PngjBadSignature28 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-344601997);
                                            if (PngjBadSignature28 == null) {
                                                char edgeSlop2 = (char) (26716 - (ViewConfiguration.getEdgeSlop() >> 16));
                                                int mirror = 'Q' - AndroidCharacter.getMirror('0');
                                                int lastIndexOf3 = TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 1669;
                                                byte b48 = (byte) 0;
                                                byte b49 = (byte) (b48 + 2);
                                                Object[] objArr105 = new Object[1];
                                                a(b48, b49, (byte) (b49 - 1), objArr105);
                                                PngjBadSignature28 = com.d.e.a.PngjBadCrcException.PngjBadSignature(edgeSlop2, mirror, lastIndexOf3, 396011464, false, (String) objArr105[0], new Class[]{String.class, String[].class});
                                            }
                                            long longValue15 = ((Long) ((Method) PngjBadSignature28).invoke(null, objArr104)).longValue();
                                            long j107 = -1193947160;
                                            long j108 = -518;
                                            long j109 = (j108 * longValue15) + (j108 * j107);
                                            long j110 = 519;
                                            long uptimeMillis = (int) SystemClock.uptimeMillis();
                                            long j111 = (j107 ^ j2) | (uptimeMillis ^ j2);
                                            long j112 = (((j107 | ((longValue15 | uptimeMillis) ^ j2)) * j110) + (((-519) * (((j111 | longValue15) ^ j2) | (((j107 | longValue15) | uptimeMillis) ^ j2))) + (((longValue15 | (j111 ^ j2)) * j110) + j109))) - 492645061;
                                            int maxMemory3 = (int) Runtime.getRuntime().maxMemory();
                                            int i244 = ((int) (j112 >> 32)) & ((((~((~maxMemory3) | (-1569419305))) | 1288321580) * 168) + (((~((-1569419305) | maxMemory3)) | 1284124712) * (-168)) + (((~(1288321580 | maxMemory3)) | (-1573616173)) * 336) + 501358106);
                                            int a3 = defpackage.a.a();
                                            int i245 = ~a3;
                                            if ((i244 | (((int) j112) & ((((~((-28692703) | i245)) | 18874504) * 859) + (((~(a3 | (-9818199))) | (~((-1465919113) | i245))) * 859) + ((((-1465919113) | a3) * (-859)) - 1113553992)))) != 1) {
                                                Object[] objArr106 = new Object[1];
                                                c("\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001", true, new int[]{309, 12, 0, 0}, objArr106);
                                                String str37 = (String) objArr106[0];
                                                Object[] objArr107 = new Object[1];
                                                c("\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001", true, new int[]{321, 16, 0, 0}, objArr107);
                                                String str38 = (String) objArr107[0];
                                                Object[] objArr108 = new Object[1];
                                                c("\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000", false, new int[]{337, 17, 0, 8}, objArr108);
                                                String str39 = (String) objArr108[0];
                                                Object[] objArr109 = new Object[1];
                                                c("\u0001\u0000\u0001\u0001\u0001\u0001", false, new int[]{354, 6, 0, 0}, objArr109);
                                                String str40 = (String) objArr109[0];
                                                Object[] objArr110 = new Object[1];
                                                b((char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 1), "\u0000\u0000\u0000\u0000", "Ⲏ᭗崿쌩璽摛✾\u1cbb철ᲅꄖ䌌", ViewConfiguration.getScrollBarFadeDuration() >> 16, "╼큠ᚦ薜", objArr110);
                                                String str41 = (String) objArr110[0];
                                                int i246 = -TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0);
                                                int i247 = -TextUtils.getTrimmedLength(BuildConfig.FLAVOR);
                                                int i248 = ((i247 | (-1657316227)) << 1) - (i247 ^ (-1657316227));
                                                Object[] objArr111 = new Object[1];
                                                b((char) ((i246 ^ 38635) + ((i246 & 38635) << 1)), "\u0000\u0000\u0000\u0000", "\u0bdb廢諳Љែ앜そ\ufae9뚙ꦕꎠ\uecb5쁇辝禋溔룴", i248, "緳㝜\ueb9d춖", objArr111);
                                                String str42 = (String) objArr111[0];
                                                Object[] objArr112 = new Object[1];
                                                c("\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000", true, new int[]{360, 21, 0, 2}, objArr112);
                                                String str43 = (String) objArr112[0];
                                                Object[] objArr113 = new Object[1];
                                                c("\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000", false, new int[]{381, 16, 0, 7}, objArr113);
                                                String str44 = (String) objArr113[0];
                                                char indexOf11 = (char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR);
                                                int i249 = -(ViewConfiguration.getZoomControlsTimeout() > j3 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j3 ? 0 : -1));
                                                int i250 = (i249 & 877617835) + (i249 | 877617835);
                                                Object[] objArr114 = new Object[1];
                                                b(indexOf11, "\u0000\u0000\u0000\u0000", "鵏쿜衿䖰歮푺눔鵗럨ᨰ仙攛旋⢻볡곭㈹ꑡᲸ䶈攗櫣ޘ㫪㮇", i250, "꩜佢쐴海", objArr114);
                                                String str45 = (String) objArr114[0];
                                                int i251 = -(Process.myPid() >> 22);
                                                int i252 = -TextUtils.getTrimmedLength(BuildConfig.FLAVOR);
                                                int PngjBadSignature29 = isAuthSucess.valueOf.PngjBadSignature();
                                                int i253 = i252 * (-518);
                                                int i254 = ((i253 | 999910600) << 1) - (i253 ^ 999910600);
                                                int i255 = ~i252;
                                                int i256 = ~PngjBadSignature29;
                                                int i257 = ~((i255 & i256) | (i255 ^ i256));
                                                int i258 = (((i257 & (-10221772)) | (i257 ^ (-10221772))) * 519) + i254;
                                                int i259 = ~i252;
                                                int i260 = (i256 & i259) | (i259 ^ i256);
                                                int i261 = ~((i260 & (-10221772)) | (i260 ^ (-10221772)));
                                                int i262 = i252 | (-10221772);
                                                int i263 = ~((i262 & PngjBadSignature29) | (i262 ^ PngjBadSignature29));
                                                int i264 = (((i261 & i263) | (i261 ^ i263)) * (-519)) + i258;
                                                int i265 = ~((PngjBadSignature29 & (-10221772)) | (PngjBadSignature29 ^ (-10221772)));
                                                int i266 = -(-(((i252 & i265) | (i252 ^ i265)) * 519));
                                                int i267 = ((i264 | i266) << 1) - (i266 ^ i264);
                                                Object[] objArr115 = new Object[1];
                                                b((char) ((i251 ^ 58702) + ((i251 & 58702) << 1)), "\u0000\u0000\u0000\u0000", "鼷韈仃ꉳꜩ뾜釞宑\uffd0ঊ\ud8a8ឧ旎", i267, "㒖搇仿ꗥ", objArr115);
                                                int i268 = 0;
                                                String str46 = (String) objArr115[0];
                                                Object[] objArr116 = new Object[1];
                                                c("\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001", false, new int[]{397, 9, 0, 0}, objArr116);
                                                String str47 = (String) objArr116[0];
                                                Object[] objArr117 = new Object[1];
                                                c("\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000", true, new int[]{406, 8, 8, 1}, objArr117);
                                                String[] strArr5 = {str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, str47, (String) objArr117[0]};
                                                int i269 = 0;
                                                while (i269 < 12) {
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append(strArr5[i269]);
                                                    Object[] objArr118 = new Object[1];
                                                    c("\u0001\u0000", i268, new int[]{188, 2, i268, 2}, objArr118);
                                                    sb.append((String) objArr118[i268]);
                                                    Object[] objArr119 = {sb.toString()};
                                                    Object PngjBadSignature30 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1142218481);
                                                    if (PngjBadSignature30 == null) {
                                                        char keyCodeFromString2 = (char) KeyEvent.keyCodeFromString(BuildConfig.FLAVOR);
                                                        int indexOf12 = 27 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0');
                                                        int minimumFlingVelocity = 1447 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                        byte b50 = (byte) 0;
                                                        byte b51 = (byte) (b50 + 2);
                                                        Object[] objArr120 = new Object[1];
                                                        a(b50, b51, (byte) (b51 - 1), objArr120);
                                                        PngjBadSignature30 = com.d.e.a.PngjBadCrcException.PngjBadSignature(keyCodeFromString2, indexOf12, minimumFlingVelocity, 1191464116, false, (String) objArr120[0], new Class[]{String.class});
                                                    }
                                                    long longValue16 = ((Long) ((Method) PngjBadSignature30).invoke(null, objArr119)).longValue();
                                                    long j113 = -1091788320;
                                                    long j114 = 85;
                                                    long j115 = (j114 * longValue16) + (j114 * j113);
                                                    long j116 = -84;
                                                    long j117 = j113 ^ j2;
                                                    long j118 = longValue16 ^ j2;
                                                    long myPid4 = Process.myPid();
                                                    long j119 = myPid4 ^ j2;
                                                    long j120 = j113 | longValue16;
                                                    long j121 = ((((j117 | j118) ^ j2) | ((j117 | j119) ^ j2) | ((j118 | j119) ^ j2) | ((j120 | myPid4) ^ j2)) * j116) + j115;
                                                    long j122 = ((j118 | myPid4) ^ j2) | j113;
                                                    long j123 = (j119 | longValue16) ^ j2;
                                                    long j124 = ((84 * (j123 | (j120 ^ j2))) + (((j122 | j123) * j116) + j121)) - 864209557;
                                                    int i270 = ((int) (j124 >> 32)) & (((1879047871 | i) * 465) + ((1666830902 | (~(229604491 | i))) * 930) + (((~(1666830902 | i)) | 229604491) * (-465)) + 1159587786);
                                                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                                                    if ((i270 | (((int) j124) & defpackage.a.c((~(elapsedCpuTime | 840669787)) | (~(2017071098 | elapsedCpuTime)), -1324, (((~elapsedCpuTime) | 807012954) * 1324) + 818885255, -1294406058))) != 0) {
                                                        i13 = i269 + 110;
                                                        break;
                                                    }
                                                    int i271 = i269 + 28;
                                                    i269 = ((i271 & (-27)) << 1) + (i271 ^ (-27));
                                                    i268 = 0;
                                                }
                                            }
                                        }
                                        i13 = 0;
                                        if (i13 != 0) {
                                            Object[] objArr121 = {new int[]{(i13 | i) & (~(i & i13))}, new int[1], null, new int[]{i}};
                                            int myUid = Process.myUid();
                                            int c11 = defpackage.a.c(~(myUid | (-575668261)), -1504, (((~((-805083517) | myUid)) | 229415256) * 1504) + 430034853, -838630208);
                                            int i272 = ((i2 | c11) << 1) - (c11 ^ i2);
                                            int i273 = i272 << 13;
                                            int i274 = (i273 & (~i272)) | ((~i273) & i272);
                                            int i275 = i274 ^ (i274 >>> 17);
                                            int i276 = i275 << 5;
                                            ((int[]) objArr121[1])[0] = ((~i275) & i276) | ((~i276) & i275);
                                            return objArr121;
                                        }
                                        long[] jArr = {472001035};
                                        int i277 = (SystemClock.elapsedRealtime() > j3 ? 1 : (SystemClock.elapsedRealtime() == j3 ? 0 : -1));
                                        int i278 = -(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                        int PngjBadSignature31 = isAuthSucess.valueOf.PngjBadSignature();
                                        int i279 = i278 * (-129);
                                        int i280 = (i279 ^ 186668524) + ((i279 & 186668524) << 1);
                                        int i281 = ~PngjBadSignature31;
                                        int i282 = (i281 & (-788289189)) | ((-788289189) ^ i281);
                                        int i283 = -(-((~((i282 & i278) | (i282 ^ i278))) * 130));
                                        int i284 = (i280 ^ i283) + ((i283 & i280) << 1);
                                        int i285 = -(-((~((-788289189) | i278)) * (-260)));
                                        int i286 = (i284 & i285) + (i285 | i284);
                                        int i287 = ~i278;
                                        int i288 = (i278 & (-788289189)) | ((-788289189) ^ i278);
                                        int i289 = -(-(((~((i288 & PngjBadSignature31) | (i288 ^ PngjBadSignature31))) | (~((i287 & 788289188) | (i287 ^ 788289188)))) * 130));
                                        int i290 = (i286 ^ i289) + ((i289 & i286) << 1);
                                        Object[] objArr122 = new Object[1];
                                        b((char) ((i277 & 8524) + (i277 | 8524)), "\u0000\u0000\u0000\u0000", "䲕벛렉ᛣ䣖Ẽ걡댘侫ꛜ១箤ꆘ꧘˴约ㅹ", i290, "ꌮﱖ䴮㘡", objArr122);
                                        Object[] objArr123 = {(String) objArr122[0], 5, 1073741823L, jArr};
                                        Object PngjBadSignature32 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1000971846);
                                        if (PngjBadSignature32 == null) {
                                            char trimmedLength = (char) TextUtils.getTrimmedLength(BuildConfig.FLAVOR);
                                            int indexOf13 = TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 35;
                                            int indexOf14 = 1313 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR);
                                            byte b52 = (byte) 0;
                                            byte b53 = (byte) (b52 + 2);
                                            Object[] objArr124 = new Object[1];
                                            a(b52, b53, (byte) (b53 - 1), objArr124);
                                            PngjBadSignature32 = com.d.e.a.PngjBadCrcException.PngjBadSignature(trimmedLength, indexOf13, indexOf14, 951651329, false, (String) objArr124[0], new Class[]{String.class, cls, Long.TYPE, long[].class});
                                        }
                                        long longValue17 = ((Long) ((Method) PngjBadSignature32).invoke(null, objArr123)).longValue();
                                        long j125 = 1812256766;
                                        long j126 = -661;
                                        long j127 = j125 ^ j2;
                                        long j128 = longValue17 ^ j2;
                                        long j129 = ((662 * (((j127 | longValue17) ^ j2) | ((j128 | j125) ^ j2))) + (((-1324) * (((j125 | j89) ^ j2) | ((longValue17 | j89) ^ j2))) + ((1324 * (j90 | ((j127 | j128) ^ j2))) + ((j126 * longValue17) + (j126 * j125))))) - 1992100935;
                                        int startUptimeMillis3 = (int) Process.getStartUptimeMillis();
                                        int i291 = ((int) (j129 >> 32)) & (((startUptimeMillis3 | (-874512474)) * 220) + (((~((~startUptimeMillis3) | (-1949346140))) | (-908394746)) * (-440)) + ((((~((-874512474) | r6)) | (-1983228412)) * 220) - 1481700894));
                                        int i292 = ((int) j129) & ((((~((-581888466) | i)) | (~(2063597563 | i6))) * 765) + (((~((-581888466) | i6)) | 44482688) * 1530) + (((~((-44482689) | i6)) | (~((-537405778) | i)) | (~(2063597563 | i))) * 765) + 61273287);
                                        if (((i291 & i292) | (i291 ^ i292)) != 0) {
                                            int i293 = PngjUnsupportedException + 47;
                                            PngjInputException = i293 % Uuid.SIZE_BITS;
                                            i15 = i293 % 2 == 0 ? 24266 : 240;
                                            i14 = 1;
                                        } else {
                                            int i294 = PngjUnsupportedException;
                                            i14 = 1;
                                            PngjInputException = ((i294 ^ 35) + ((i294 & 35) << 1)) % Uuid.SIZE_BITS;
                                            i15 = 0;
                                        }
                                        if (i15 != 0) {
                                            Object[] objArr125 = new Object[4];
                                            int[] iArr2 = new int[i14];
                                            objArr125[0] = iArr2;
                                            objArr125[i14] = new int[i14];
                                            int[] iArr3 = new int[i14];
                                            objArr125[3] = iArr3;
                                            int i295 = ~(i & i15);
                                            iArr3[0] = i;
                                            iArr2[0] = (i15 | i) & i295;
                                            objArr125[2] = null;
                                            int i296 = (((~(i | 997377991)) | (~((-37187983) | i)) | 339976) * 407) + (((~(37187982 | i)) | (~(i6 | (-997377992))) | 339976) * 407) + (((960529985 | r0) * (-814)) - 1260731086);
                                            int i297 = (i296 & 16) + (i296 | 16);
                                            int PngjBadSignature33 = isAuthSucess.valueOf.PngjBadSignature();
                                            int i298 = i297 * (-445);
                                            int i299 = -(-(i2 * (-445)));
                                            int i300 = (i298 ^ i299) + ((i298 & i299) << 1);
                                            int i301 = ~i297;
                                            int i302 = ~i2;
                                            int i303 = ~((i301 ^ i302) | (i301 & i302));
                                            int i304 = ~PngjBadSignature33;
                                            int i305 = ~((i304 & i302) | (i302 ^ i304));
                                            int i306 = -(-(((i303 & i305) | (i303 ^ i305)) * 446));
                                            int i307 = ~((i2 & i301) | (i301 ^ i2));
                                            int i308 = (i302 ^ i297) | (i302 & i297);
                                            int i309 = (((~((PngjBadSignature33 & i308) | (i308 ^ PngjBadSignature33))) | i307) * 446) + (i300 ^ i306) + ((i300 & i306) << 1);
                                            int i310 = ~i297;
                                            int i311 = -(-((~((i310 & i302) | (i310 ^ i302))) * 446));
                                            int i312 = ((i309 | i311) << 1) - (i311 ^ i309);
                                            int i313 = (i312 << 13) ^ i312;
                                            int i314 = i313 ^ (i313 >>> 17);
                                            int i315 = i314 << 5;
                                            ((int[]) objArr125[1])[0] = (i314 | i315) & (~(i314 & i315));
                                            return objArr125;
                                        }
                                        long[] jArr2 = new long[i14];
                                        jArr2[0] = 472001035;
                                        Object[] objArr126 = new Object[i14];
                                        b((char) ((-2) - (~(-ImageFormat.getBitsPerPixel(0)))), "\u0000\u0000\u0000\u0000", "\ue2deữ湡䯌\ued50턹\uf76eᰩ華乽\ue023\ue6e7鈒┛㸿\ue558槪樜樀좄ᛉ婷", ExpandableListView.getPackedPositionType(j3), "路쫞돌壔", objArr126);
                                        try {
                                            bufferedInputStream2 = new BufferedInputStream(new FileInputStream((String) objArr126[0]));
                                            j7 = j3;
                                        } catch (IOException unused2) {
                                            bufferedInputStream2 = null;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            bufferedInputStream = null;
                                        }
                                        loop4: while (true) {
                                            try {
                                                try {
                                                    int read = bufferedInputStream2.read();
                                                    if (read != i8) {
                                                        j7 = ((j7 << 5) ^ read) & 1073741823;
                                                        for (int i316 = 0; i316 < 1; i316++) {
                                                            int i317 = PngjUnsupportedException;
                                                            int i318 = ((i317 | 51) << 1) - (i317 ^ 51);
                                                            PngjInputException = i318 % Uuid.SIZE_BITS;
                                                            if (i318 % 2 == 0) {
                                                                long j130 = jArr2[i316];
                                                                throw null;
                                                            }
                                                            if (j7 == jArr2[i316]) {
                                                                i16 = (i316 & 1) + (i316 | 1);
                                                                try {
                                                                    bufferedInputStream2.close();
                                                                    break loop4;
                                                                } catch (Exception unused3) {
                                                                }
                                                            }
                                                        }
                                                        i8 = -1;
                                                    }
                                                } catch (IOException unused4) {
                                                }
                                                try {
                                                    bufferedInputStream2.close();
                                                    break;
                                                } catch (Exception unused5) {
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                bufferedInputStream = bufferedInputStream2;
                                                if (bufferedInputStream != null) {
                                                    try {
                                                        bufferedInputStream.close();
                                                    } catch (Exception unused6) {
                                                    }
                                                }
                                                throw th;
                                            }
                                        }
                                        if (!((i16 == 0 ? '+' : (char) 14) != '+')) {
                                            Object[] objArr127 = {new int[]{i ^ 242}, new int[]{(r1 | r2) & (~(r1 & r2))}, null, new int[]{i}};
                                            int c12 = defpackage.a.c(1031780605 | i6, -828, (((~(1031780605 | i6)) | 2785368) * (-828)) - 1338267583, 384150136);
                                            int i319 = (c12 & 16) + (c12 | 16) + i2;
                                            int i320 = (i319 << 13) ^ i319;
                                            int i321 = i320 >>> 17;
                                            int i322 = (i320 | i321) & (~(i320 & i321));
                                            int i323 = i322 << 5;
                                            return objArr127;
                                        }
                                        Object PngjBadSignature34 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1372235840);
                                        if (PngjBadSignature34 == null) {
                                            char c13 = (char) ((SystemClock.uptimeMillis() > j3 ? 1 : (SystemClock.uptimeMillis() == j3 ? 0 : -1)) + 23941);
                                            int indexOf15 = TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 25;
                                            int indexOf16 = TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 313;
                                            byte b54 = (byte) 4;
                                            byte b55 = (byte) (b54 - 3);
                                            Object[] objArr128 = new Object[1];
                                            a(b54, b55, b55, objArr128);
                                            PngjBadSignature34 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c13, indexOf15, indexOf16, 1390033531, false, (String) objArr128[0], new Class[0]);
                                        }
                                        long longValue18 = ((Long) ((Method) PngjBadSignature34).invoke(null, null)).longValue();
                                        long j131 = 16970906;
                                        long j132 = (949 * longValue18) + ((-947) * j131);
                                        long j133 = -948;
                                        long j134 = j131 ^ j2;
                                        long j135 = longValue18 ^ j2;
                                        long j136 = (948 * (j131 | j135)) + (j133 * (((j134 | j135) | j90) ^ j2)) + ((j134 | ((j135 | j89) ^ j2)) * j133) + j132 + 129943820;
                                        int maxMemory4 = (int) Runtime.getRuntime().maxMemory();
                                        int i324 = ~maxMemory4;
                                        if (((((int) (j136 >> 32)) & ((((~(maxMemory4 | 1717001624)) | (-1744788925) | (~(i324 | (-1112951961)))) * 521) + (((-1140739261) | maxMemory4) * 521) + (((~(i324 | (-1140739261))) | (-1717001625)) * (-1042)) + 1852245486)) | (((int) j136) & ((((~(267100093 | i)) | (~((-1170126317) | i6))) * 406) + ((~((-172034578) | i6)) * (-406)) + (((~(1170126316 | i)) | (~((-95065517) | i6))) * (-406)) + 1301314507))) != 0) {
                                            PngjInputException = (PngjUnsupportedException + 121) % Uuid.SIZE_BITS;
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if ((z ? ',' : 'a') != 'a') {
                                            PngjInputException = (PngjUnsupportedException + 83) % Uuid.SIZE_BITS;
                                            objArr = new Object[]{new int[]{i ^ 264}, new int[1], null, new int[]{i}};
                                            int freeMemory2 = (int) Runtime.getRuntime().freeMemory();
                                            int i325 = ~freeMemory2;
                                            int i326 = (((~(freeMemory2 | (-63098531))) | (~(i325 | 971467443))) * 979) + ((freeMemory2 | 971467443) * (-979)) + ((~((-63098531) | i325)) * 979) + 1269501528;
                                            int i327 = (i2 - (~((i326 ^ 16) + ((i326 & 16) << 1)))) - 1;
                                            int i328 = i327 << 13;
                                            int i329 = (i327 | i328) & (~(i327 & i328));
                                            int i330 = i329 >>> 17;
                                            int i331 = ((~i329) & i330) | ((~i330) & i329);
                                            ((int[]) objArr[1])[0] = i331 ^ (i331 << 5);
                                        } else {
                                            Object PngjBadSignature35 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-40521023);
                                            if (PngjBadSignature35 == null) {
                                                char packedPositionType = (char) ExpandableListView.getPackedPositionType(j3);
                                                int indexOf17 = 28 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR);
                                                int modifierMetaStateMask2 = 1854 - ((byte) KeyEvent.getModifierMetaStateMask());
                                                byte b56 = (byte) 0;
                                                byte b57 = (byte) (b56 + 2);
                                                Object[] objArr129 = new Object[1];
                                                a(b56, b57, (byte) (b57 - 1), objArr129);
                                                PngjBadSignature35 = com.d.e.a.PngjBadCrcException.PngjBadSignature(packedPositionType, indexOf17, modifierMetaStateMask2, 24829818, false, (String) objArr129[0], new Class[0]);
                                            }
                                            long longValue19 = ((Long) ((Method) PngjBadSignature35).invoke(null, null)).longValue();
                                            long j137 = 107821747;
                                            long j138 = -743;
                                            long j139 = (j138 * longValue19) + (j138 * j137);
                                            long j140 = j137 | longValue19;
                                            long a4 = defpackage.a.a();
                                            long j141 = (((j140 ^ j2) | ((j137 | a4) ^ j2) | ((longValue19 | a4) ^ j2)) * (-744)) + j139;
                                            long j142 = 744;
                                            long j143 = ((j142 * (j140 | a4)) + ((((a4 ^ j2) | (((j137 ^ j2) | (longValue19 ^ j2)) ^ j2)) * j142) + j141)) - 855187768;
                                            int i332 = (((~((-2059137255) | i6)) | 1521115332 | (~(621910843 | i6)) | (~((-83888922) | i))) * (-84)) + 1905160562;
                                            int i333 = (~(621910843 | i)) | 2059137254;
                                            int i334 = ~((-621910844) | i6);
                                            if (((((int) (j143 >> 32)) & (((83888921 | i334) * 84) + ((i333 | i334) * (-84)) + i332)) | (((int) j143) & (((~((-345617675) | i)) * 345) + (((~(1801718517 | i6)) | 18874433) * 345) + (((~(1801718517 | i)) | 345617674) * 345) + 484646344))) != 0) {
                                                int i335 = (PngjInputException + 117) % Uuid.SIZE_BITS;
                                                PngjUnsupportedException = i335;
                                                i17 = (~(i & 281)) & (i | 281);
                                                PngjInputException = (i335 + 87) % Uuid.SIZE_BITS;
                                            } else {
                                                i17 = i;
                                            }
                                            if (i17 == i) {
                                                Object PngjBadSignature36 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-792668357);
                                                if (PngjBadSignature36 == null) {
                                                    char fadingEdgeLength3 = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 30094);
                                                    int indexOf18 = TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 46;
                                                    int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 1810;
                                                    byte b58 = (byte) 4;
                                                    byte b59 = (byte) (b58 - 3);
                                                    Object[] objArr130 = new Object[1];
                                                    a(b58, b59, b59, objArr130);
                                                    PngjBadSignature36 = com.d.e.a.PngjBadCrcException.PngjBadSignature(fadingEdgeLength3, indexOf18, tapTimeout2, 741325440, false, (String) objArr130[0], new Class[0]);
                                                }
                                                long longValue20 = ((Long) ((Method) PngjBadSignature36).invoke(null, null)).longValue();
                                                long j144 = -479899641;
                                                long j145 = (713 * longValue20) + ((-711) * j144);
                                                long j146 = -712;
                                                long j147 = longValue20 ^ j2;
                                                long j148 = (j90 | j144) ^ j2;
                                                long j149 = (712 * (j147 | j148)) + (j146 * ((((j147 | j90) | j144) ^ j2) | (((j144 | longValue20) | j89) ^ j2))) + ((((j147 | j144) ^ j2) | j148) * j146) + j145 + 835634185;
                                                int b60 = defpackage.a.b(135232561);
                                                int i336 = ~b60;
                                                int i337 = ((int) (j149 >> 32)) & ((((~(b60 | 1756888678)) | (~(i336 | 319662267)) | (~((-319662268) | b60))) * 831) + ((~((-370723) | b60)) * (-1662)) + (((~((-1756888679) | i336)) | (~((-319291546) | b60))) * (-831)) + 474209544);
                                                int i338 = ((int) j149) & ((((~(((int) Runtime.getRuntime().totalMemory()) | (-1099432978))) | 74048) * 366) + ((((~(168933740 | r6)) | (-1268292670)) * (-366)) - 1802977231));
                                                if (((i337 & i338) | (i337 ^ i338)) != 0) {
                                                    objArr = new Object[]{new int[]{(i & (-269)) | (i6 & 268)}, new int[1], null, new int[]{i}};
                                                    int i339 = (int) Runtime.getRuntime().totalMemory();
                                                    int i340 = ~i339;
                                                    int c14 = defpackage.a.c((~(i339 | (-1022781300))) | (~(i340 | (-11784675))) | (-1022883828), -370, (((~((-1022781300) | i340)) | (~((-11784675) | i339))) * (-370)) + 1571886639, -509894312);
                                                    int i341 = (i2 - (~(-(-((c14 & 16) + (c14 | 16)))))) - 1;
                                                    int i342 = i341 << 13;
                                                    int i343 = ((~i341) & i342) | ((~i342) & i341);
                                                    int i344 = i343 >>> 17;
                                                    int i345 = (i343 | i344) & (~(i343 & i344));
                                                    int i346 = i345 << 5;
                                                    i18 = 0;
                                                    ((int[]) objArr[1])[0] = (i345 | i346) & (~(i345 & i346));
                                                } else {
                                                    Object PngjBadSignature37 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-25572490);
                                                    if (PngjBadSignature37 == null) {
                                                        char defaultSize = (char) (30094 - View.getDefaultSize(0, 0));
                                                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 45;
                                                        int argb2 = 1810 - Color.argb(0, 0, 0, 0);
                                                        byte b61 = (byte) 0;
                                                        byte b62 = (byte) (b61 + 2);
                                                        Object[] objArr131 = new Object[1];
                                                        a(b61, b62, (byte) (b62 - 1), objArr131);
                                                        PngjBadSignature37 = com.d.e.a.PngjBadCrcException.PngjBadSignature(defaultSize, doubleTapTimeout, argb2, 43427533, false, (String) objArr131[0], new Class[0]);
                                                    }
                                                    long longValue21 = ((Long) ((Method) PngjBadSignature37).invoke(null, null)).longValue();
                                                    long j150 = -607579431;
                                                    long j151 = j150 ^ j2;
                                                    long j152 = longValue21 ^ j2;
                                                    long j153 = ((591 * ((j89 | j151) | j152)) + (((-591) * ((((j151 | j152) | j90) ^ j2) | ((j150 | longValue21) ^ j2))) + (((-1182) * ((j151 | longValue21) ^ j2)) + (((-590) * longValue21) + (592 * j150))))) - 990659355;
                                                    int maxMemory5 = (int) Runtime.getRuntime().maxMemory();
                                                    int i347 = ~maxMemory5;
                                                    int i348 = ((int) (j153 >> 32)) & ((((~(maxMemory5 | (-88261345))) | (~(i347 | (-1525487756))) | (~(1525487755 | maxMemory5))) * 831) + ((~(1609554667 | maxMemory5)) * (-1662)) + (((~(88261344 | i347)) | (~((-84066913) | maxMemory5))) * (-831)) + 441520662);
                                                    int freeMemory3 = (int) Runtime.getRuntime().freeMemory();
                                                    int i349 = ((int) j153) & ((((~(freeMemory3 | (-1513722284))) | (-1344018603)) * 301) + (((~((-1344018603) | freeMemory3)) | (~((~freeMemory3) | 1513722283))) * (-301)) + (((~(1513986475 | freeMemory3)) * (-301)) - 978426840));
                                                    if ((((i348 & i349) | (i348 ^ i349)) != 0 ? ':' : '3') != '3') {
                                                        objArr = new Object[]{new int[]{(i & (-267)) | (i6 & 266)}, new int[1], null, new int[]{i}};
                                                        int i350 = ~(Process.myPid() | 305246066);
                                                        int i351 = ((i350 | 692584577) * 658) + ((961095313 | i350) * (-658)) + 1620971125;
                                                        int i352 = (i351 & 16) + (i351 | 16) + i2;
                                                        int i353 = i352 << 13;
                                                        int i354 = (i353 | i352) & (~(i352 & i353));
                                                        int i355 = i354 >>> 17;
                                                        int i356 = (i354 | i355) & (~(i354 & i355));
                                                        int i357 = i356 << 5;
                                                        ((int[]) objArr[1])[0] = (i356 | i357) & (~(i356 & i357));
                                                    } else {
                                                        Object PngjBadSignature38 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-2091466614);
                                                        if (PngjBadSignature38 == null) {
                                                            char touchSlop2 = (char) (45717 - (ViewConfiguration.getTouchSlop() >> 8));
                                                            int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 40;
                                                            int i358 = (ViewConfiguration.getGlobalActionKeyTimeout() > j3 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j3 ? 0 : -1)) + 624;
                                                            byte b63 = (byte) 4;
                                                            byte b64 = (byte) (b63 - 3);
                                                            Object[] objArr132 = new Object[1];
                                                            a(b63, b64, b64, objArr132);
                                                            PngjBadSignature38 = com.d.e.a.PngjBadCrcException.PngjBadSignature(touchSlop2, maxKeyCode2, i358, 2142874929, false, (String) objArr132[0], new Class[0]);
                                                        }
                                                        long longValue22 = ((Long) ((Method) PngjBadSignature38).invoke(null, null)).longValue();
                                                        long j154 = 426292194;
                                                        long j155 = ((-67) * longValue22) + (69 * j154);
                                                        long j156 = -68;
                                                        long j157 = j154 ^ j2;
                                                        long j158 = longValue22 ^ j2;
                                                        long startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
                                                        long j159 = startElapsedRealtime2 ^ j2;
                                                        long j160 = (68 * (j157 | ((j158 | j159) ^ j2))) + ((((j157 | j159) | longValue22) ^ j2) * j156) + ((((longValue22 | startElapsedRealtime2) ^ j2) | (((j157 | j158) | j159) ^ j2) | ((j154 | longValue22) ^ j2)) * j156) + j155 + 910511088;
                                                        if (((((int) (j160 >> 32)) & ((((~((-1142954204) | i6)) | (~(1714786681 | i6)) | 2178) * 50) + (((~(1714788859 | i)) | (~(i6 | (-2179)))) * 50) + ((((-1142954204) | i) * (-50)) - 35920762))) | (((int) j160) & (((~(1434451367 | i)) * 566) + ((((~(339475714 | i)) | 1094975653) * (-566)) - 156297437)))) != 0) {
                                                            objArr = new Object[]{new int[]{(i & (-281)) | (i6 & 280)}, new int[]{((~r4) & r8) | ((~r8) & r4)}, null, new int[]{i}};
                                                            int i359 = -(-defpackage.a.A((~((-536936521) | i)) | 272933121, 130, ((~((-536936521) | i6)) * 130) - 1169272253, -16));
                                                            int i360 = ((i2 | i359) << 1) - (i359 ^ i2);
                                                            int i361 = i360 << 13;
                                                            int i362 = (i361 & (~i360)) | ((~i361) & i360);
                                                            int i363 = i362 >>> 17;
                                                            int i364 = (i362 | i363) & (~(i362 & i363));
                                                            int i365 = i364 << 5;
                                                            i18 = 0;
                                                        } else {
                                                            objArr = new Object[]{new int[]{i}, new int[1], null, new int[]{i}};
                                                            int myTid4 = Process.myTid();
                                                            int i366 = ~myTid4;
                                                            int i367 = (((-588710848) | (~(445855126 | i366))) * 712) + (((~(myTid4 | 999765951)) | (~(i366 | (-553910826)))) * (-712)) + (((553910825 | r8) * (-712)) - 331375779);
                                                            int i368 = ~i367;
                                                            int i369 = i368 | ((-1) ^ i368);
                                                            int i370 = ((~((i367 ^ i) | (i367 & i))) * (-69)) + (((~((i369 & i) | (i369 ^ i))) | (~((i367 ^ i) | (i367 & i)))) * 69) + (i367 * (-68));
                                                            int i371 = -(-((~(~i367)) * 69));
                                                            int i372 = -(-((i370 & i371) + (i370 | i371)));
                                                            int i373 = (i2 ^ i372) + ((i372 & i2) << 1);
                                                            int i374 = i373 << 13;
                                                            int i375 = (i374 | i373) & (~(i373 & i374));
                                                            int i376 = i375 >>> 17;
                                                            int i377 = (i375 | i376) & (~(i375 & i376));
                                                            int i378 = i377 << 5;
                                                            i18 = 0;
                                                            ((int[]) objArr[1])[0] = ((~i377) & i378) | ((~i378) & i377);
                                                        }
                                                    }
                                                }
                                                if (((int[]) objArr[3])[i18] == ((int[]) objArr[i18])[i18]) {
                                                    return objArr;
                                                }
                                                Object[] objArr133 = {2};
                                                Object PngjBadSignature39 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-476828914);
                                                if (PngjBadSignature39 == null) {
                                                    char resolveSize2 = (char) (View.resolveSize(i18, i18) + 35511);
                                                    int fadingEdgeLength4 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 42;
                                                    int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 507;
                                                    byte b65 = (byte) 4;
                                                    byte b66 = (byte) (b65 - 3);
                                                    Object[] objArr134 = new Object[1];
                                                    a(b65, b66, b66, objArr134);
                                                    PngjBadSignature39 = com.d.e.a.PngjBadCrcException.PngjBadSignature(resolveSize2, fadingEdgeLength4, jumpTapTimeout2, 528172725, false, (String) objArr134[0], new Class[]{cls});
                                                }
                                                long longValue23 = ((Long) ((Method) PngjBadSignature39).invoke(null, objArr133)).longValue();
                                                long j161 = -72307396;
                                                long j162 = (131 * longValue23) + ((-129) * j161);
                                                long j163 = 130;
                                                long j164 = longValue23 ^ j2;
                                                long j165 = ((((j164 | j90) | j161) ^ j2) * j163) + j162;
                                                long j166 = j164 | j161;
                                                long j167 = (((((j161 ^ j2) | longValue23) ^ j2) | ((j166 | j89) ^ j2)) * j163) + ((-260) * (j166 ^ j2)) + j165 + 940053908;
                                                int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                                                int i379 = ((int) (j167 >> 32)) & ((((~(elapsedCpuTime2 | (-1078528259))) | 33562640) * 366) + (((~(906387633 | elapsedCpuTime2)) | (-1951353252)) * (-366)) + 807482962);
                                                int myUid2 = Process.myUid();
                                                int i380 = ((int) j167) & ((((~(myUid2 | (-1354744505))) | (~(82481905 | myUid2)) | 1343569928) * 407) + (((~((-82481906) | myUid2)) | (~((~myUid2) | 1354744504)) | 1343569928) * 407) + (((71307329 | r8) * (-814)) - 346664014));
                                                if (((i379 & i380) | (i379 ^ i380)) == 2) {
                                                    PngjInputException = (PngjUnsupportedException + 101) % Uuid.SIZE_BITS;
                                                    Object[] objArr135 = {new int[]{r6}, new int[1], null, new int[]{i}};
                                                    int i381 = (~(i & 270)) & (i | 270);
                                                    int i382 = (((~(i | 168689599)) | 831520768) * 464) + (((-34355607) | i) * (-464)) + (((((~((-865876375) | i6)) | 831520768) | (~(i6 | 168689599))) * 464) - 337550427);
                                                    int i383 = (i382 & 16) + (i382 | 16);
                                                    int PngjBadSignature40 = isAuthSucess.valueOf.PngjBadSignature();
                                                    int i384 = i383 * 302;
                                                    int i385 = -(-(i2 * 603));
                                                    int i386 = (i384 ^ i385) + ((i384 & i385) << 1);
                                                    int i387 = ~i383;
                                                    int i388 = ~PngjBadSignature40;
                                                    int i389 = ~((i388 & i387) | (i387 ^ i388));
                                                    int i390 = -(-(((i389 & i2) | (i2 ^ i389)) * (-602)));
                                                    int i391 = ((i386 | i390) << 1) - (i390 ^ i386);
                                                    int i392 = ~i2;
                                                    int i393 = ~((i392 & i387) | (i387 ^ i392));
                                                    int i394 = ~((i387 & PngjBadSignature40) | (i387 ^ PngjBadSignature40));
                                                    int i395 = (i394 & i393) | (i393 ^ i394);
                                                    int i396 = ~PngjBadSignature40;
                                                    int i397 = (i383 & i396) | (i396 ^ i383);
                                                    int i398 = ~((i397 & i2) | (i397 ^ i2));
                                                    int i399 = (i391 - (~(-(-(((i398 & i395) | (i395 ^ i398)) * (-301)))))) - 1;
                                                    int i400 = -(-((~(i396 | i2)) * 301));
                                                    int i401 = ((i399 | i400) << 1) - (i400 ^ i399);
                                                    int i402 = (i401 << 13) ^ i401;
                                                    int i403 = i402 >>> 17;
                                                    int i404 = ((~i402) & i403) | ((~i403) & i402);
                                                    ((int[]) objArr135[1])[0] = i404 ^ (i404 << 5);
                                                    return objArr135;
                                                }
                                                Object PngjBadSignature41 = com.d.e.a.PngjBadCrcException.PngjBadSignature(98436405);
                                                if (PngjBadSignature41 == null) {
                                                    char resolveSize3 = (char) (51309 - View.resolveSize(0, 0));
                                                    int i405 = 44 - (SystemClock.elapsedRealtime() > j3 ? 1 : (SystemClock.elapsedRealtime() == j3 ? 0 : -1));
                                                    int resolveSize4 = View.resolveSize(0, 0) + 1767;
                                                    byte b67 = (byte) 4;
                                                    byte b68 = (byte) (b67 - 3);
                                                    Object[] objArr136 = new Object[1];
                                                    a(b67, b68, b68, objArr136);
                                                    PngjBadSignature41 = com.d.e.a.PngjBadCrcException.PngjBadSignature(resolveSize3, i405, resolveSize4, -114202482, false, (String) objArr136[0], new Class[0]);
                                                }
                                                long longValue24 = ((Long) ((Method) PngjBadSignature41).invoke(null, null)).longValue();
                                                long j168 = 1184989919;
                                                long j169 = ((-712) * longValue24) + (714 * j168);
                                                long j170 = j168 ^ j2;
                                                long myUid3 = Process.myUid();
                                                long j171 = myUid3 ^ j2;
                                                long j172 = ((j170 | j171) ^ j2) | ((j170 | longValue24) ^ j2);
                                                long j173 = longValue24 ^ j2;
                                                long j174 = (myUid3 | (j173 | j168)) ^ j2;
                                                long j175 = ((713 * ((j173 | j171) ^ j2)) + ((1426 * j174) + (((j172 | j174) * (-713)) + j169))) - 1813418999;
                                                int i406 = ((int) (j175 >> 32)) & (((~(((int) Process.getStartUptimeMillis()) | (-1477452300))) * 283) + ((((~(124636528 | r4)) | (-1602088828)) * (-283)) - 982345834));
                                                int startElapsedRealtime3 = (int) Process.getStartElapsedRealtime();
                                                if ((i406 | (((int) j175) & ((((~((~startElapsedRealtime3) | 2001221910)) | 563995500) * 217) + (((~(startElapsedRealtime3 | (-563995501))) | 9814632) * 217) + ((((~((-563995501) | r8)) | (~(2001221910 | startElapsedRealtime3))) * 217) - 924679748)))) != 0) {
                                                    PngjUnsupportedException = (PngjInputException + 9) % Uuid.SIZE_BITS;
                                                    Object[] objArr137 = {new int[]{(i & (-273)) | (i6 & 272)}, new int[1], null, new int[]{i}};
                                                    int c15 = defpackage.a.c(~((-235553175) | i6), -948, (((~(i | (-253719960))) | (-780846015)) * (-948)) - 464727831, -42243944);
                                                    int PngjBadSignature42 = isAuthSucess.valueOf.PngjBadSignature();
                                                    int i407 = (c15 * (-495)) - 7920;
                                                    int i408 = ~c15;
                                                    int i409 = ~(((-17) & i408) | ((-17) ^ i408));
                                                    int i410 = ~(((-17) ^ PngjBadSignature42) | ((-17) & PngjBadSignature42));
                                                    int i411 = -(-(((i409 & i410) | (i409 ^ i410)) * 992));
                                                    int i412 = (i407 ^ i411) + ((i407 & i411) << 1);
                                                    int i413 = ~c15;
                                                    int i414 = ~(((-17) & i413) | ((-17) ^ i413));
                                                    int i415 = ~((-17) | PngjBadSignature42);
                                                    int i416 = (i414 & i415) | (i414 ^ i415);
                                                    int i417 = ~PngjBadSignature42;
                                                    int i418 = -(-((i416 | (~((i417 & 16) | (i417 ^ 16) | c15))) * (-496)));
                                                    int i419 = -(-((((c15 & PngjBadSignature42) | (c15 ^ PngjBadSignature42)) * 496) + (((i412 | i418) << 1) - (i418 ^ i412))));
                                                    int i420 = ((i2 | i419) << 1) - (i419 ^ i2);
                                                    int i421 = i420 << 13;
                                                    int i422 = (i421 & (~i420)) | ((~i421) & i420);
                                                    int i423 = i422 >>> 17;
                                                    int i424 = (i422 | i423) & (~(i422 & i423));
                                                    int i425 = i424 << 5;
                                                    ((int[]) objArr137[1])[0] = (i424 | i425) & (~(i424 & i425));
                                                    return objArr137;
                                                }
                                                long[] jArr3 = {624887784092251L};
                                                int i426 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                                                Object[] objArr138 = new Object[1];
                                                b((char) ((i426 ^ 8525) + ((i426 & 8525) << 1)), "\u0000\u0000\u0000\u0000", "䲕벛렉ᛣ䣖Ẽ걡댘侫ꛜ១箤ꆘ꧘˴约ㅹ", 788289186 - (~View.resolveSizeAndState(0, 0, 0)), "ꌮﱖ䴮㘡", objArr138);
                                                Object[] objArr139 = {(String) objArr138[0], 3, 2251799813685247L, jArr3};
                                                Object PngjBadSignature43 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1000971846);
                                                if (PngjBadSignature43 == null) {
                                                    char rgb2 = (char) (Color.rgb(0, 0, 0) + 16777216);
                                                    int i427 = 36 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                    int i428 = (ViewConfiguration.getZoomControlsTimeout() > j3 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j3 ? 0 : -1)) + 1312;
                                                    byte b69 = (byte) 0;
                                                    byte b70 = (byte) (b69 + 2);
                                                    Object[] objArr140 = new Object[1];
                                                    a(b69, b70, (byte) (b70 - 1), objArr140);
                                                    PngjBadSignature43 = com.d.e.a.PngjBadCrcException.PngjBadSignature(rgb2, i427, i428, 951651329, false, (String) objArr140[0], new Class[]{String.class, cls, Long.TYPE, long[].class});
                                                }
                                                long longValue25 = ((Long) ((Method) PngjBadSignature43).invoke(null, objArr139)).longValue();
                                                long j176 = 536210985;
                                                long j177 = (j71 * longValue25) + (j71 * j176);
                                                long j178 = longValue25 ^ j2;
                                                long j179 = (j178 | j176) ^ j2;
                                                long j180 = j176 ^ j2;
                                                long maxMemory6 = (int) Runtime.getRuntime().maxMemory();
                                                long j181 = ((j73 * ((((maxMemory6 ^ j2) | j180) | longValue25) ^ j2)) + ((((j180 | j178) ^ j2) * j78) + (((j179 | (((j180 | longValue25) | maxMemory6) ^ j2)) * j73) + j177))) - 716055154;
                                                int i429 = ((int) (j181 >> 32)) & ((((~(375307361 | i)) | (~((-1812533773) | i6)) | (~(1812533772 | i))) * 959) + (((((~(375307361 | i6)) | (~((-1812533773) | i))) | (~(i6 | 1812533772))) * 959) - 1176261003));
                                                int maxMemory7 = (int) Runtime.getRuntime().maxMemory();
                                                int i430 = ((int) j181) & ((((~((~maxMemory7) | 2130702303)) | 278217217) * 521) + ((~(2130702303 | maxMemory7)) * 521) + 1634829612);
                                                if (((i429 & i430) | (i429 ^ i430)) != 0) {
                                                    int i431 = PngjInputException;
                                                    PngjUnsupportedException = ((i431 ^ 81) + ((i431 & 81) << 1)) % Uuid.SIZE_BITS;
                                                    Object[] objArr141 = {new int[]{r5}, new int[1], null, new int[]{i}};
                                                    int i432 = (~(i & 275)) & (i | 275);
                                                    int myUid4 = Process.myUid();
                                                    int i433 = ((myUid4 | 100182824) * (-50)) - 2020744613;
                                                    int i434 = ~((-95455785) | myUid4);
                                                    int i435 = ~myUid4;
                                                    int i436 = (i2 - (~(-(-defpackage.a.A((~(i435 | 100182824)) | ((~((-934383150) | i435)) | 838927365), 50, ((i434 | (~((-838927366) | i435))) * 50) + i433, -16))))) - 1;
                                                    int i437 = i436 << 13;
                                                    int i438 = ((~i436) & i437) | ((~i437) & i436);
                                                    int i439 = i438 >>> 17;
                                                    int i440 = (i438 | i439) & (~(i438 & i439));
                                                    int i441 = i440 << 5;
                                                    ((int[]) objArr141[1])[0] = ((~i440) & i441) | ((~i441) & i440);
                                                    return objArr141;
                                                }
                                                Object[] objArr142 = new Object[1];
                                                b((char) TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), "\u0000\u0000\u0000\u0000", "䋎坕襞䘘宵俶マ깛갽嚌ฬ", Process.getGidForName(BuildConfig.FLAVOR) - 373823336, "霨럨ᯩ霕", objArr142);
                                                Object[] objArr143 = {(String) objArr142[0]};
                                                Object PngjBadSignature44 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1934049891);
                                                if (PngjBadSignature44 == null) {
                                                    char trimmedLength2 = (char) TextUtils.getTrimmedLength(BuildConfig.FLAVOR);
                                                    int i442 = 29 - (SystemClock.elapsedRealtimeNanos() > j3 ? 1 : (SystemClock.elapsedRealtimeNanos() == j3 ? 0 : -1));
                                                    int myTid5 = (Process.myTid() >> 22) + 1447;
                                                    byte b71 = (byte) 0;
                                                    Object[] objArr144 = new Object[1];
                                                    a((byte) 15, b71, b71, objArr144);
                                                    PngjBadSignature44 = com.d.e.a.PngjBadCrcException.PngjBadSignature(trimmedLength2, i442, myTid5, -1884803112, false, (String) objArr144[0], new Class[]{String.class});
                                                }
                                                long longValue26 = ((Long) ((Method) PngjBadSignature44).invoke(null, objArr143)).longValue();
                                                long j182 = -379564306;
                                                long j183 = ((-929) * longValue26) + ((-464) * j182);
                                                long j184 = j182 ^ j2;
                                                long j185 = longValue26 | j89;
                                                long j186 = ((465 * (j185 | j184)) + ((930 * (longValue26 | ((j184 | j89) ^ j2))) + (((-465) * (j184 | (j185 ^ j2))) + j183))) - 1337352961;
                                                int i443 = ((int) (j186 >> 32)) & ((((~(1292887563 | i6)) | (~((-1564853322) | i6))) * 590) + (((~(1564853321 | i6)) | 664066 | (~((-1292887564) | i6))) * (-1180)) + ((((~((-272629825) | i)) | r7) * 590) - 108780858));
                                                int i444 = ((int) j186) & ((((~((-479303110) | i6)) | (-629746210)) * 184) + ((((-75563010) | i6) * 184) - 1528040579));
                                                if (((i443 & i444) | (i443 ^ i444)) != 0) {
                                                    int i445 = PngjUnsupportedException;
                                                    PngjInputException = ((i445 ^ 103) + ((i445 & 103) << 1)) % Uuid.SIZE_BITS;
                                                    Object[] objArr145 = {new int[]{r7}, new int[]{(r1 | r2) & (~(r1 & r2))}, null, new int[]{i}};
                                                    int i446 = (~(i & 276)) & (i | 276);
                                                    int A = defpackage.a.A((~(i | (-33838745))) | 966893605 | (~(1000727229 | i6)), 904, (((~((-33833625) | i)) | (~(i6 | 1000732349))) * 904) + ((((~((-1000727230) | i)) | (~(33838744 | i6))) * (-1808)) - 1071571971), -16);
                                                    int i447 = (i2 & A) + (A | i2);
                                                    int i448 = (i447 << 13) ^ i447;
                                                    int i449 = i448 >>> 17;
                                                    int i450 = ((~i448) & i449) | ((~i449) & i448);
                                                    int i451 = i450 << 5;
                                                    return objArr145;
                                                }
                                                Object PngjBadSignature45 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1617763359);
                                                if (PngjBadSignature45 == null) {
                                                    char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                                                    int i452 = 31 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                    int offsetAfter3 = 1381 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0);
                                                    byte b72 = (byte) 4;
                                                    byte b73 = (byte) (b72 - 3);
                                                    Object[] objArr146 = new Object[1];
                                                    a(b72, b73, b73, objArr146);
                                                    PngjBadSignature45 = com.d.e.a.PngjBadCrcException.PngjBadSignature(absoluteGravity, i452, offsetAfter3, -1669172828, false, (String) objArr146[0], new Class[0]);
                                                }
                                                long longValue27 = ((Long) ((Method) PngjBadSignature45).invoke(null, null)).longValue();
                                                long j187 = -384923107;
                                                long j188 = ((-1917) * longValue27) + (960 * j187);
                                                long j189 = 959;
                                                long j190 = longValue27 ^ j2;
                                                long j191 = ((j189 * (((j190 | j89) ^ j2) | ((j90 | j187) ^ j2))) + (((-959) * j190) + (((((j190 | j90) ^ j2) | ((j187 | j89) ^ j2)) * j189) + j188))) - 661771402;
                                                int freeMemory4 = (int) Runtime.getRuntime().freeMemory();
                                                int i453 = ~freeMemory4;
                                                int i454 = ((int) (j191 >> 32)) & ((((~(freeMemory4 | 1514944950)) | (-1592655296) | (~(i453 | (-8195)))) * 369) + (((~((-1514944951) | i453)) | (-77718540)) * (-369)) + ((((-77710346) | i453) * (-369)) - 802173004));
                                                int i455 = ((int) j191) & ((((~(839148037 | i6)) | (~((-839148038) | i)) | (~((-598078373) | i))) * 831) + ((~((-268435458) | i)) * (-1662)) + (((~(598078372 | i6)) | (~((-570712581) | i))) * (-831)) + 1323169588);
                                                if (((i454 & i455) | (i454 ^ i455)) != 0) {
                                                    Object[] objArr147 = {new int[]{i ^ 273}, new int[1], null, new int[]{i}};
                                                    int c16 = defpackage.a.c((~(defpackage.a.a() | (-413401090))) | 620832256, 446, (((~((~r1) | (-413567404))) | 166314) * 446) - 820357313, 74176044);
                                                    int i456 = (c16 & 16) + (c16 | 16);
                                                    int i457 = (i2 & i456) + (i2 | i456);
                                                    int i458 = i457 << 13;
                                                    int i459 = (i457 | i458) & (~(i457 & i458));
                                                    int i460 = i459 >>> 17;
                                                    int i461 = ((~i459) & i460) | ((~i460) & i459);
                                                    int i462 = i461 << 5;
                                                    ((int[]) objArr147[1])[0] = (i461 | i462) & (~(i461 & i462));
                                                    return objArr147;
                                                }
                                                Object PngjBadSignature46 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-820027826);
                                                if (PngjBadSignature46 == null) {
                                                    char argb3 = (char) (Color.argb(0, 0, 0, 0) + 13779);
                                                    int offsetAfter4 = 29 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0);
                                                    int indexOf19 = TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 1503;
                                                    byte b74 = (byte) 0;
                                                    byte b75 = (byte) (b74 + 2);
                                                    Object[] objArr148 = new Object[1];
                                                    a(b74, b75, (byte) (b75 - 1), objArr148);
                                                    PngjBadSignature46 = com.d.e.a.PngjBadCrcException.PngjBadSignature(argb3, offsetAfter4, indexOf19, 871379957, false, (String) objArr148[0], new Class[0]);
                                                }
                                                long longValue28 = ((Long) ((Method) PngjBadSignature46).invoke(null, null)).longValue();
                                                long j192 = 456427545;
                                                long j193 = ((-69) * longValue28) + (71 * j192);
                                                long j194 = ((j192 ^ j2) | longValue28) ^ j2;
                                                long myTid6 = Process.myTid();
                                                long j195 = ((-140) * (j194 | ((longValue28 | myTid6) ^ j2))) + j193;
                                                long j196 = 70;
                                                long j197 = ((j196 * (((myTid6 | j192) ^ j2) | (j194 | (((longValue28 ^ j2) | j192) ^ j2)))) + (((((j192 | longValue28) | myTid6) ^ j2) * j196) + j195)) - 623822761;
                                                int i463 = ((int) (j197 >> 32)) & ((((-525591) | i6) * 756) + ((((~((-525591) | i)) | 1437752001) * (-756)) - 2146607222));
                                                int i464 = ((int) j197) & ((((~((-1754851328) | i6)) | 1083753046 | (~(1773987839 | i))) * 757) + ((~((-671098282) | i)) * 1514) + (((1102889558 | i6) * (-757)) - 1051046504));
                                                if (((i463 & i464) | (i463 ^ i464)) != 0) {
                                                    Object[] objArr149 = {new int[]{r7}, new int[]{(r1 | r2) & (~(r1 & r2))}, null, new int[]{i}};
                                                    int i465 = (~(i & 279)) & (i | 279);
                                                    int i466 = (~((-688335009) | i)) | 196768;
                                                    int i467 = ~(1034369205 | i6);
                                                    int A2 = defpackage.a.A((~(i | (-688138241))) | i467, 470, ((i466 | i467) * (-470)) + 1127046933, -16);
                                                    int i468 = ((i2 | A2) << 1) - (A2 ^ i2);
                                                    int i469 = i468 << 13;
                                                    int i470 = (i469 | i468) & (~(i468 & i469));
                                                    int i471 = i470 >>> 17;
                                                    int i472 = (i470 | i471) & (~(i470 & i471));
                                                    int i473 = i472 << 5;
                                                    return objArr149;
                                                }
                                                Object[] objArr150 = {Integer.valueOf(i), obj, Integer.valueOf(i2), 16777216};
                                                Object PngjBadSignature47 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1284430186);
                                                if (PngjBadSignature47 == null) {
                                                    PngjBadSignature47 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (Process.getGidForName(BuildConfig.FLAVOR) + 1), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 26, (ViewConfiguration.getGlobalActionKeyTimeout() > j3 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j3 ? 0 : -1)) + 1223, 1335773997, false, null, new Class[]{cls, (Class) com.d.e.a.PngjBadCrcException.values((char) KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), (ViewConfiguration.getZoomControlsTimeout() > j3 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j3 ? 0 : -1)) + 24, TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 1199), cls, cls});
                                                }
                                                Object newInstance = ((Constructor) PngjBadSignature47).newInstance(objArr150);
                                                try {
                                                    Object[] objArr151 = new Object[1];
                                                    c(null, true, new int[]{426, 16, 172, 12}, objArr151);
                                                    Class<?> cls2 = Class.forName((String) objArr151[0]);
                                                    int bitsPerPixel4 = ImageFormat.getBitsPerPixel(0);
                                                    int i474 = -TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0);
                                                    Object[] objArr152 = new Object[1];
                                                    b((char) (((bitsPerPixel4 | 4988) << 1) - (bitsPerPixel4 ^ 4988)), "\u0000\u0000\u0000\u0000", "㬰㋃ௗ䖊퀵", (i474 ^ (-72074287)) + ((i474 & (-72074287)) << 1), "툛됻篻瀓", objArr152);
                                                    cls2.getMethod((String) objArr152[0], null).invoke(newInstance, null);
                                                    Object[] objArr153 = {new int[]{i}, new int[1], null, new int[]{i}};
                                                    int i475 = (((~(i | (-800943857))) | 4227077 | (~(233622117 | i6))) * 904) + (((~((-229395041) | i)) | (~(i6 | 805170933))) * 904) + ((((~((-233622118) | i)) | (~(800943856 | i6))) * (-1808)) - 723177859);
                                                    int PngjBadSignature48 = isAuthSucess.valueOf.PngjBadSignature();
                                                    int i476 = i475 * (-622);
                                                    int i477 = (i476 << 1) - i476;
                                                    int i478 = ~i475;
                                                    int i479 = ((~PngjBadSignature48) * (-623)) + ((~((i478 & PngjBadSignature48) | (i478 ^ PngjBadSignature48))) * 623) + i477;
                                                    int i480 = ~i475;
                                                    int i481 = ~i480;
                                                    int i482 = ~((i480 & PngjBadSignature48) | (i480 ^ PngjBadSignature48));
                                                    int i483 = (i482 & i481) | (i481 ^ i482);
                                                    int i484 = ~PngjBadSignature48;
                                                    int i485 = ((i483 & i484) | (i483 ^ i484)) * 623;
                                                    int i486 = (((i479 | i485) << 1) - (i485 ^ i479)) + i2;
                                                    int i487 = (i486 << 13) ^ i486;
                                                    int i488 = i487 ^ (i487 >>> 17);
                                                    int i489 = i488 << 5;
                                                    ((int[]) objArr153[1])[0] = (i488 | i489) & (~(i488 & i489));
                                                    return objArr153;
                                                } catch (Throwable th5) {
                                                    Throwable cause3 = th5.getCause();
                                                    if (cause3 != null) {
                                                        throw cause3;
                                                    }
                                                    throw th5;
                                                }
                                            }
                                            PngjUnsupportedException = (PngjInputException + 85) % Uuid.SIZE_BITS;
                                            objArr = new Object[]{new int[]{i17}, new int[1], null, new int[]{i}};
                                            int myUid5 = Process.myUid();
                                            int i490 = (i2 - (~(-(-defpackage.a.c((~(myUid5 | (-77236699))) | 957329275, 376, (((~((~myUid5) | 77236698)) | (-1033875452)) * (-376)) + ((((-1033184930) | myUid5) * 376) - 1415183235), 16))))) - 1;
                                            int i491 = i490 << 13;
                                            int i492 = (i490 | i491) & (~(i490 & i491));
                                            int i493 = i492 >>> 17;
                                            int i494 = ((~i492) & i493) | ((~i493) & i492);
                                            int i495 = i494 << 5;
                                            ((int[]) objArr[1])[0] = ((~i494) & i495) | ((~i495) & i494);
                                        }
                                        i18 = 0;
                                        if (((int[]) objArr[3])[i18] == ((int[]) objArr[i18])[i18]) {
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
                            Object[] objArr154 = {(String) objArr2[0]};
                            Object PngjBadSignature49 = com.d.e.a.PngjBadCrcException.PngjBadSignature(547370249);
                            if (PngjBadSignature49 == null) {
                                char offsetBefore3 = (char) (TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 8752);
                                int i496 = 25 - (ViewConfiguration.getZoomControlsTimeout() > j3 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j3 ? 0 : -1));
                                int lastIndexOf4 = 335 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0);
                                byte b76 = (byte) 0;
                                byte b77 = (byte) (b76 + 2);
                                Object[] objArr155 = new Object[1];
                                a(b76, b77, (byte) (b77 - 1), objArr155);
                                PngjBadSignature49 = com.d.e.a.PngjBadCrcException.PngjBadSignature(offsetBefore3, i496, lastIndexOf4, -598779726, false, (String) objArr155[0], new Class[]{String.class});
                            }
                            Object invoke8 = ((Method) PngjBadSignature49).invoke(null, objArr154);
                            if (invoke8 != null) {
                                int i497 = PngjInputException;
                                int i498 = (i497 ^ 41) + ((i497 & 41) << 1);
                                PngjUnsupportedException = i498 % Uuid.SIZE_BITS;
                                if (i498 % 2 != 0) {
                                    Object[] objArr156 = new Object[1];
                                    c("\u0000\u0001\u0001\u0000\u0001\u0001\u0001", true, new int[]{302, 7, 0, 0}, objArr156);
                                    if (!invoke8.equals((String) objArr156[0])) {
                                    }
                                } else {
                                    Object[] objArr157 = new Object[1];
                                    c("\u0000\u0001\u0001\u0000\u0001\u0001\u0001", false, new int[]{302, 7, 0, 0}, objArr157);
                                    if (!invoke8.equals((String) objArr157[0])) {
                                    }
                                }
                                int i499 = -((byte) KeyEvent.getModifierMetaStateMask());
                                int i500 = i499 * 567;
                                int i501 = ((i500 | 565) << 1) - (i500 ^ 565);
                                int i502 = ~i499;
                                int i503 = ~((~i502) | i502);
                                int i504 = ~(i502 | i);
                                int i505 = (i501 - (~(((i503 & i504) | (i503 ^ i504)) * (-566)))) - 1;
                                int i506 = (~i499) * 566;
                                Object[] objArr158 = new Object[1];
                                b((char) ((((i505 ^ i506) + ((i506 & i505) << 1)) - (~((~((i502 ^ i) | (i502 & i))) * 566))) - 1), "\u0000\u0000\u0000\u0000", "ꀒ㼳머ﲬ噯ӂ봳曑﨧竲刓ꀦ\udf37䖝Ϛ衂ᲈ∫뷨\ue171ⳓ劫흑", 466453762 - (~ExpandableListView.getPackedPositionGroup(j3)), "ι춅䐛⇟", objArr158);
                                try {
                                    Object[] objArr159 = {(String) objArr158[0]};
                                    Object PngjBadSignature50 = com.d.e.a.PngjBadCrcException.PngjBadSignature(547370249);
                                    if (PngjBadSignature50 == null) {
                                        char c17 = (char) (8752 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                        int green = Color.green(0) + 24;
                                        int jumpTapTimeout3 = 336 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                        byte b78 = (byte) 0;
                                        byte b79 = (byte) (b78 + 2);
                                        Object[] objArr160 = new Object[1];
                                        a(b78, b79, (byte) (b79 - 1), objArr160);
                                        PngjBadSignature50 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c17, green, jumpTapTimeout3, -598779726, false, (String) objArr160[0], new Class[]{String.class});
                                    }
                                    String str48 = (String) ((Method) PngjBadSignature50).invoke(null, objArr159);
                                    if (str48 != null && (parseInt = Integer.parseInt(str48)) != 0) {
                                        i12 = parseInt + 170;
                                        if (i12 != 0) {
                                        }
                                    }
                                } catch (Throwable th7) {
                                    Throwable cause5 = th7.getCause();
                                    if (cause5 != null) {
                                        throw cause5;
                                    }
                                    throw th7;
                                }
                            }
                            i12 = 0;
                            if (i12 != 0) {
                            }
                        } catch (Throwable th8) {
                            Throwable cause6 = th8.getCause();
                            if (cause6 != null) {
                                throw cause6;
                            }
                            throw th8;
                        }
                        objArr2 = new Object[1];
                        c(null, true, new int[]{284, 18, 108, 12}, objArr2);
                    } else {
                        int i507 = (i30 & (-96)) + (i30 | (-96));
                        i30 = (i507 & 97) + (i507 | 97);
                        i5 = 13;
                    }
                }
            }
            j2 = j;
            Object[] objArr242 = new Object[1];
            c("\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001", true, new int[]{86, 8, 0, 8}, objArr242);
            String str310 = (String) objArr242[0];
            int i4210 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int i4310 = i4210 * 881;
            int i4410 = ((38981607 | i4310) << 1) - (i4310 ^ 38981607);
            int i4510 = ~i4210;
            int i4610 = ~(((-44248) ^ i4510) | ((-44248) & i4510));
            int i4710 = ~((i4510 ^ i) | (i4510 & i));
            int i4810 = (i4610 & i4710) | (i4610 ^ i4710);
            int i4910 = ~((-44248) | i);
            int i508 = -(-(((i4810 & i4910) | (i4810 ^ i4910)) * (-880)));
            int i512 = ((i4410 | i508) << 1) - (i4410 ^ i508);
            int i522 = ~((i4510 & i6) | (i4510 ^ i6));
            int i532 = (i522 & 44247) | (44247 ^ i522);
            int i542 = (i4210 & i) | (i4210 ^ i);
            int i552 = ~i542;
            int i562 = (i512 - (~(-(-(((i532 & i552) | (i532 ^ i552)) * (-880)))))) - 1;
            int i572 = (~i542) * 880;
            Object[] objArr252 = new Object[1];
            b((char) ((i562 & i572) + (i572 | i562)), "\u0000\u0000\u0000\u0000", "沿㪥횇\ue107\ue593\ued99", ViewConfiguration.getJumpTapTimeout() >> 16, "冱鰲\ud801Ꭼ", objArr252);
            String str49 = (String) objArr252[0];
            char alpha2 = (char) Color.alpha(0);
            int i582 = -TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0);
            int i592 = (784461212 & i582) + (i582 | 784461212);
            Object[] objArr262 = new Object[1];
            b(alpha2, "\u0000\u0000\u0000\u0000", "顅펭瞰ⴱ剥큮쌹", i592, "鶖쇭\ue72e絟", objArr262);
            String str52 = (String) objArr262[0];
            Object[] objArr272 = new Object[1];
            c("\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001", false, new int[]{94, 9, 74, 0}, objArr272);
            String str62 = (String) objArr272[0];
            Object[] objArr282 = new Object[1];
            c("\u0001\u0001\u0000\u0001\u0001\u0001", false, new int[]{103, 6, 0, 0}, objArr282);
            String str72 = (String) objArr282[0];
            Object[] objArr292 = new Object[1];
            b((char) (24468 - (~(-(TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1))))), "\u0000\u0000\u0000\u0000", "燬\ue3c0\ue385㲉⋎㊕⑃쩩鵲\ue612\u0017豑\uef3d", 1836744629 - (~(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), "략穿镭繟", objArr292);
            String str82 = (String) objArr292[0];
            int i602 = i4;
            Object[] objArr302 = new Object[1];
            c("\u0001\u0001\u0001\u0001\u0001", false, new int[]{109, i602, 0, 4}, objArr302);
            String str92 = (String) objArr302[0];
            int[] iArr4 = {114, 6, 0, i602};
            Object[] objArr312 = new Object[1];
            c("\u0000\u0001\u0001\u0000\u0001\u0000", false, iArr4, objArr312);
            String str102 = (String) objArr312[0];
            Object[] objArr322 = new Object[1];
            c("\u0000\u0000", true, new int[]{120, 2, 37, 0}, objArr322);
            String str112 = (String) objArr322[0];
            int i612 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
            int i622 = i612 | 17897;
            int i632 = ~i;
            int i642 = (((i612 * 370) - (-6621890)) - (~(((i622 & i632) | (i622 ^ i632)) * (-369)))) - 1;
            int i652 = ~i612;
            int i662 = ~((i652 & i632) | (i652 ^ i632));
            int i672 = -(-(((i662 & 17897) | (i662 ^ 17897)) * (-369)));
            int i682 = (i642 ^ i672) + ((i642 & i672) << 1);
            int i692 = ~(((-17898) ^ i612) | ((-17898) & i612));
            int i702 = ~((i612 ^ i) | (i612 & i));
            int i712 = (i692 & i702) | (i692 ^ i702);
            int i722 = ~i612;
            int i732 = (i722 & i6) | (i722 ^ i6);
            int i742 = ~((i732 & 17897) | (i732 ^ 17897));
            int i752 = -(-(((i742 & i712) | (i712 ^ i742)) * 369));
            Object[] objArr332 = new Object[1];
            b((char) (((i682 | i752) << 1) - (i752 ^ i682)), "\u0000\u0000\u0000\u0000", "㖍塮䐖앞靸∂劆読煝鐮쐒렔覀\u0a53㘫\ue82e", (-2) - ((-(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))) ^ (-1)), "詏坑\ue9ff⹅", objArr332);
            String str122 = (String) objArr332[0];
            Object[] objArr342 = new Object[1];
            c("\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001", false, new int[]{122, 10, 0, 0}, objArr342);
            String str132 = (String) objArr342[0];
            Object[] objArr352 = new Object[1];
            b((char) (ViewConfiguration.getWindowTouchSlop() >> 8), "\u0000\u0000\u0000\u0000", "⮀⺿ᙐ腽⺾\u0c4e䭍髙", TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), "䛷\ue355醠溇", objArr352);
            String str142 = (String) objArr352[0];
            char capsMode3 = (char) TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0);
            int threadPriority22 = Process.getThreadPriority(0);
            Object[] objArr362 = new Object[1];
            b(capsMode3, "\u0000\u0000\u0000\u0000", "펣뎃〙\ud9b9䟠᠐͊꜌⇬舄렏⼾", ((threadPriority22 & 20) + (threadPriority22 | 20)) >> 6, "代찋▶ꜭ", objArr362);
            String str152 = (String) objArr362[0];
            Object[] objArr372 = new Object[1];
            c("\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000", true, new int[]{132, 14, 188, 0}, objArr372);
            String str162 = (String) objArr372[0];
            Object[] objArr382 = new Object[1];
            c("\u0000\u0001\u0000\u0000\u0000\u0001\u0000", false, new int[]{146, 7, 0, 0}, objArr382);
            String str172 = (String) objArr382[0];
            Object[] objArr392 = new Object[1];
            c(null, true, new int[]{153, 7, 186, 5}, objArr392);
            String str182 = (String) objArr392[0];
            char maximumFlingVelocity2 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int indexOf72 = TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0);
            Object[] objArr402 = new Object[1];
            b(maximumFlingVelocity2, "\u0000\u0000\u0000\u0000", "ⲫ௪ꜷ砄护⥳币", ((-93548614) & indexOf72) + (indexOf72 | (-93548614)), "뤴沏诺쩏", objArr402);
            String str192 = (String) objArr402[0];
            Object[] objArr412 = new Object[1];
            c("\u0001\u0000", true, new int[]{160, 2, 0, 0}, objArr412);
            String str202 = (String) objArr412[0];
            Object[] objArr422 = new Object[1];
            c("\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001", true, new int[]{162, 20, 0, 0}, objArr422);
            String str212 = (String) objArr422[0];
            Object[] objArr432 = new Object[1];
            c("\u0000\u0001\u0000\u0001\u0000\u0000", true, new int[]{182, 6, 197, 4}, objArr432);
            String str222 = (String) objArr432[0];
            Object[] objArr442 = new Object[1];
            c("\u0001\u0000", false, new int[]{188, 2, 0, 2}, objArr442);
            String str232 = (String) objArr442[0];
            Object[] objArr452 = new Object[1];
            c("\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000", true, new int[]{190, 16, 166, 14}, objArr452);
            String str242 = (String) objArr452[0];
            Object[] objArr462 = new Object[1];
            c("\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000", true, new int[]{206, 9, 101, 0}, objArr462);
            String str252 = (String) objArr462[0];
            int i762 = -((byte) KeyEvent.getModifierMetaStateMask());
            Object[] objArr472 = new Object[1];
            b((char) ((i762 ^ (-1)) + (i762 << 1)), "\u0000\u0000\u0000\u0000", "糓맲넔酦ꢱ윀㡡樾ꃂ鑙", 0 - (~(-(-TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0)))), "\uf026\udaa9谪㪅", objArr472);
            String str262 = (String) objArr472[0];
            char modifierMetaStateMask3 = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
            int i772 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
            int i782 = ((56390031 | i772) << 1) - (i772 ^ 56390031);
            Object[] objArr482 = new Object[1];
            b(modifierMetaStateMask3, "\u0000\u0000\u0000\u0000", "\udd97\uf1e0쵏䖾샍\ue4d9谬\u1b4f嵛譌禩", i782, "辅山긃𣏕", objArr482);
            String str272 = (String) objArr482[0];
            Object[] objArr492 = new Object[1];
            b((char) (KeyEvent.getMaxKeyCode() >> 16), "\u0000\u0000\u0000\u0000", "먳횖⇏㜲燹ἒ䙗ᆶ㲋⥫慄", 70544068 - (~ImageFormat.getBitsPerPixel(0)), "쓮㑪렄릧", objArr492);
            String str282 = (String) objArr492[0];
            Object[] objArr502 = new Object[1];
            c("\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001", false, new int[]{215, 15, 0, 13}, objArr502);
            String str292 = (String) objArr502[0];
            Object[] objArr512 = new Object[1];
            c("\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000", false, new int[]{230, 14, 28, 5}, objArr512);
            String[] strArr32 = {str310, str49, str52, str62, str72, str82, str92, str102, str112, str122, str132, str142, str152, str162, str172, str182, str192, str202, str212, str222, str232, str242, str252, str262, str272, str282, str292, (String) objArr512[0]};
            char keyRepeatDelay2 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
            int i792 = -(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
            int i802 = ((-947231465) ^ i792) + ((i792 & (-947231465)) << 1);
            Object[] objArr522 = new Object[1];
            b(keyRepeatDelay2, "\u0000\u0000\u0000\u0000", "信\ude90\ue037嵲躜㖗헷\ue012뭡\uf06c\u1ac3", i802, "ᢚ詥⛇\ue9df", objArr522);
            Object[] objArr532 = {(String) objArr522[0]};
            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(547370249);
            if (PngjBadSignature2 != null) {
            }
            invoke = ((Method) PngjBadSignature2).invoke(null, objArr532);
            if (invoke == null) {
            }
            char tapTimeout3 = (char) (ViewConfiguration.getTapTimeout() >> 16);
            int i902 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
            int PngjBadSignature202 = isAuthSucess.valueOf.PngjBadSignature();
            int i912 = (i902 * (-919)) - (-1177750335);
            int i922 = ~i902;
            int i932 = (i922 ^ 1744505496) | (i922 & 1744505496);
            int i942 = ~((i932 & PngjBadSignature202) | (i932 ^ PngjBadSignature202));
            int i952 = ~PngjBadSignature202;
            int i962 = (1744505496 ^ i952) | (1744505496 & i952);
            int i972 = ~((i962 ^ i902) | (i962 & i902));
            int i982 = -(-(((i942 ^ i972) | (i972 & i942)) * 920));
            int i992 = (i912 ^ i982) + ((i912 & i982) << 1);
            int i1002 = ~((~i902) | 1744505496);
            int i1012 = ~(i922 | i952);
            int i1022 = (i992 - (~(((i1002 ^ i1012) | (i1002 & i1012)) * 920))) - 1;
            int i1032 = ~((i922 ^ 1744505496) | (i922 & 1744505496) | i952);
            int i1042 = (i922 ^ (-1744505497)) | (i922 & (-1744505497));
            int i1052 = ~((i1042 & PngjBadSignature202) | (i1042 ^ PngjBadSignature202));
            int i1062 = (i902 & 1744505496) | (1744505496 ^ i902);
            int i1072 = -(-(((~((i1062 & PngjBadSignature202) | (i1062 ^ PngjBadSignature202))) | (i1052 & i1032) | (i1032 ^ i1052)) * 920));
            int i1082 = (i1022 & i1072) + (i1072 | i1022);
            Object[] objArr692 = new Object[1];
            b(tapTimeout3, "\u0000\u0000\u0000\u0000", "躚䃿篽ᙊ迹聕㻲䧏脧梡⸡嘦ꮜ篥쉟\uf112矺\ue23d棨ﻅ퉻\udb03ᤥ", i1082, "柑ӵ檘䎁", objArr692);
            Object[] objArr702 = {(String) objArr692[0]};
            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-936033973);
            if (PngjBadSignature3 == null) {
            }
            long longValue92 = ((Long) ((Method) PngjBadSignature3).invoke(null, objArr702)).longValue();
            long j632 = -566650168;
            long j642 = (263 * longValue92) + ((-523) * j632);
            long j652 = 262;
            long j662 = ((j632 ^ j2) | longValue92) ^ j2;
            long j672 = longValue92 ^ j2;
            long j682 = (j672 | j632) ^ j2;
            long elapsedRealtime2 = (int) SystemClock.elapsedRealtime();
            long j692 = ((((((j672 | (elapsedRealtime2 ^ j2)) ^ j2) | j662) | j682) * j652) + (((-786) * j682) + ((((j662 | j682) | ((j672 | elapsedRealtime2) ^ j2)) * j652) + j642))) - 582062480;
            int i1102 = ((int) (j692 >> 32)) & ((((~((-160364688) | i6)) | 1446053424) * 420) + ((~((-160364688) | i)) * 420) + 1051485262);
            int i1112 = ((int) j692) & (((~((-64910267) | i)) * 113) + (((~(1502136676 | i)) | (-1541340159) | (~((-25706785) | i6))) * (-113)) + (((~((-64910267) | i6)) | (-1502136677)) * 226) + 2055568080);
            j4 = (i1102 & i1112) | (i1102 ^ i1112);
            int size2 = View.MeasureSpec.getSize(0);
            Object[] objArr722 = new Object[1];
            b((char) ((size2 ^ 14827) + ((size2 & 14827) << 1)), "\u0000\u0000\u0000\u0000", "峅鎶\uf85e㼯軹☇㢠暰䘏\udc2d墺諎೩鑵ꂒᆹ뭩", (SystemClock.elapsedRealtime() > j3 ? 1 : (SystemClock.elapsedRealtime() == j3 ? 0 : -1)) - 1043574162, "濭챒\uebc1ȹ", objArr722);
            Object[] objArr732 = {(String) objArr722[0]};
            PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-936033973);
            if (PngjBadSignature4 == null) {
            }
            long longValue102 = ((Long) ((Method) PngjBadSignature4).invoke(null, objArr732)).longValue();
            long j702 = -494525746;
            long j712 = -500;
            long j722 = (j712 * longValue102) + (j712 * j702);
            long j732 = 501;
            long j742 = longValue102 ^ j2;
            long j752 = (j742 | j702) ^ j2;
            long j762 = j702 ^ j2;
            long maxMemory8 = (int) Runtime.getRuntime().maxMemory();
            long j772 = ((j752 | (((j762 | longValue102) | maxMemory8) ^ j2)) * j732) + j722;
            long j782 = 1002;
            long j792 = (((((j762 | (maxMemory8 ^ j2)) | longValue102) ^ j2) * j732) + ((((j762 | j742) ^ j2) * j782) + j772)) - 654186902;
            long j802 = (((int) (j792 >> 32)) & ((((~((-1146246401) | i)) | 285212808) * 235) + (((~(998353646 | i)) | (-1859387239)) * (-470)) + (((~(998353646 | i6)) | (-1859387239)) * (-235)) + 1013679403)) | (((int) j792) & ((((~((-75501865) | i)) | 286408833) * 366) + (((~((-1323416959) | i)) | 1534323927) * (-366)) + 33164617));
            if (j4 <= j3) {
            }
            Object[] objArr762 = new Object[1];
            b((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u0000\u0000\u0000\u0000", "躚䃿篽ᙊ迹聕㻲䧏脧梡⸡嘦ꮜ篥쉟\uf112矺\ue23d棨ﻅ퉻\udb03ᤥ", ExpandableListView.getPackedPositionChild(j3) - 1744505496, "柑ӵ檘䎁", objArr762);
            Object[] objArr772 = {(String) objArr762[0]};
            PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-936033973);
            if (PngjBadSignature5 == null) {
            }
            long longValue112 = ((Long) ((Method) PngjBadSignature5).invoke(null, objArr772)).longValue();
            long j812 = -145928452;
            long j822 = (111 * longValue112) + ((-109) * j812);
            long j832 = j812 ^ j2;
            long myPid22 = (longValue112 | Process.myPid()) ^ j2;
            long j842 = ((110 * (((j832 | longValue112) ^ j2) | (((longValue112 ^ j2) | j812) ^ j2))) + ((220 * (((j812 | longValue112) ^ j2) | myPid22)) + (((-220) * (j832 | myPid22)) + j822))) - 1002784196;
            int i1172 = ~(((int) Process.getElapsedCpuTime()) | 329613215);
            int c72 = ((int) (j842 >> 32)) & defpackage.a.c(i1172 | (-1403387808), 220, (((-1107613196) | i1172) * (-220)) + 1756574530, 326557080);
            int i1182 = (int) j842;
            int i1192 = ~((int) Process.getElapsedCpuTime());
            int i1202 = i1182 & ((((~((-859504128) | i1192)) | (-1998236759)) * 68) + ((~((-1140850689) | i1192)) * (-68)) + ((((~(r8 | 859504127)) | ((~((-857386071) | i1192)) | (-2000354816))) * (-68)) - 1312818831));
            j5 = (c72 & i1202) | (c72 ^ i1202);
            Object[] objArr792 = new Object[1];
            c("\u0001\u0001\u0001\u0001", false, new int[]{244, 4, 0, 0}, objArr792);
            Object[] objArr802 = {(String) objArr792[0]};
            PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-936033973);
            if (PngjBadSignature6 == null) {
            }
            long longValue122 = ((Long) ((Method) PngjBadSignature6).invoke(null, objArr802)).longValue();
            long j852 = 662295032;
            long j862 = 530;
            long j872 = (j862 * longValue122) + (j862 * j852) + 1058;
            long j882 = 529;
            long j892 = i;
            long j902 = j892 ^ j2;
            long j912 = ((((longValue122 ^ j2) | ((j852 | j892) ^ j2)) * j882) + (((((j902 | j852) ^ j2) | ((j852 | longValue122) ^ j2)) * j882) + j872)) - 1811007680;
            int i1222 = ((int) (j912 >> 32)) & (((~((-1504977460) | i)) * 283) + (((~(101436876 | i)) | (-1606414336)) * (-283)) + 2088502698);
            int c82 = ((int) j912) & defpackage.a.c((~(423678542 | i)) | 606667025 | (~((-1013547868) | i)), -69, (((~(1030345567 | i)) | (~((-406880843) | i))) * 69) + 609051350, 1159041300);
            j6 = (i1222 & c82) | (i1222 ^ c82);
            if (j5 > j3) {
                int i1232 = PngjUnsupportedException;
                i19 = (i1232 & 51) + (i1232 | 51);
                PngjInputException = i19 % Uuid.SIZE_BITS;
                long j922 = j6 + 100;
                if (i19 % 2 == 0) {
                    isAuthSucess.valueOf.PngjBadSignature();
                    isAuthSucess.valueOf.PngjBadSignature();
                    Object[] objArr822 = {new int[]{i ^ 248}, new int[1], null, new int[]{i}};
                    int b382 = defpackage.a.b(155067504);
                    int i1242 = ~b382;
                    int i1252 = (((~(b382 | (-942986825))) | (~(i1242 | (-88154374)))) * 765) + (((~((-942986825) | i1242)) | 3424776) * 1530) + (((~((-3424777) | i1242)) | (~((-939562049) | b382)) | (~((-88154374) | b382))) * 765) + 35164460;
                    int i1262 = ~((-17) | i1252);
                    int i1272 = ~((i1252 ^ i) | (i1252 & i));
                    int i1282 = (((i1252 * (-69)) + 1136) - (~(((i1262 & i1272) | (i1262 ^ i1272)) * (-140)))) - 1;
                    int i1292 = (i1252 ^ 16) | (i1252 & 16);
                    int i1302 = (~((i1292 & i) | (i1292 ^ i))) * 70;
                    int i1312 = (i1282 & i1302) + (i1282 | i1302);
                    int i1322 = ~(((-17) ^ i1252) | ((-17) & i1252));
                    int i1332 = ~i1252;
                    int i1342 = ~((i1332 & 16) | (i1332 ^ 16));
                    int i1352 = (i1342 & i1322) | (i1322 ^ i1342);
                    int i1362 = ~(i | 16);
                    int i1372 = ((i1362 & i1352) | (i1352 ^ i1362)) * 70;
                    int i1382 = (i2 - (~(((i1312 | i1372) << 1) - (i1372 ^ i1312)))) - 1;
                    int i1392 = i1382 ^ (i1382 << 13);
                    int i1402 = i1392 ^ (i1392 >>> 17);
                    int i1412 = i1402 << 5;
                    ((int[]) objArr822[1])[0] = (i1402 | i1412) & (~(i1402 & i1412));
                    return objArr822;
                }
                isAuthSucess.valueOf.PngjBadSignature();
                isAuthSucess.valueOf.PngjBadSignature();
                Object[] objArr8222 = {new int[]{i ^ 248}, new int[1], null, new int[]{i}};
                int b3822 = defpackage.a.b(155067504);
                int i12422 = ~b3822;
                int i12522 = (((~(b3822 | (-942986825))) | (~(i12422 | (-88154374)))) * 765) + (((~((-942986825) | i12422)) | 3424776) * 1530) + (((~((-3424777) | i12422)) | (~((-939562049) | b3822)) | (~((-88154374) | b3822))) * 765) + 35164460;
                int i12622 = ~((-17) | i12522);
                int i12722 = ~((i12522 ^ i) | (i12522 & i));
                int i12822 = (((i12522 * (-69)) + 1136) - (~(((i12622 & i12722) | (i12622 ^ i12722)) * (-140)))) - 1;
                int i12922 = (i12522 ^ 16) | (i12522 & 16);
                int i13022 = (~((i12922 & i) | (i12922 ^ i))) * 70;
                int i13122 = (i12822 & i13022) + (i12822 | i13022);
                int i13222 = ~(((-17) ^ i12522) | ((-17) & i12522));
                int i13322 = ~i12522;
                int i13422 = ~((i13322 & 16) | (i13322 ^ 16));
                int i13522 = (i13422 & i13222) | (i13222 ^ i13422);
                int i13622 = ~(i | 16);
                int i13722 = ((i13622 & i13522) | (i13522 ^ i13622)) * 70;
                int i13822 = (i2 - (~(((i13122 | i13722) << 1) - (i13722 ^ i13122)))) - 1;
                int i13922 = i13822 ^ (i13822 << 13);
                int i14022 = i13922 ^ (i13922 >>> 17);
                int i14122 = i14022 << 5;
                ((int[]) objArr8222[1])[0] = (i14022 | i14122) & (~(i14022 & i14122));
                return objArr8222;
                cause = th.getCause();
                if (cause == null) {
                    throw cause;
                }
                throw th;
            }
            Object[] objArr832 = new Object[1];
            b((char) Color.blue(0), "\u0000\u0000\u0000\u0000", "✯赌扵懧쿠ꭚ뉳", 1777500325 - (~(-(Process.myPid() >> 22))), "ꚏ\uf280\u2069诔", objArr832);
            String str312 = (String) objArr832[0];
            int bitsPerPixel32 = ImageFormat.getBitsPerPixel(0);
            int i1422 = (i6 ^ bitsPerPixel32) | (i6 & bitsPerPixel32);
            int i1432 = ~i1422;
            int i1442 = (((bitsPerPixel32 * 765) - 1527) - (~(-(-(((i1432 & 1) | (i1432 ^ 1)) * 764))))) - 1;
            int i1452 = ~bitsPerPixel32;
            int i1462 = ~((i1452 & 1) | (i1452 ^ 1));
            int i1472 = ~((i9 ^ 1) | (i9 & 1));
            int i1482 = (((i1462 & i1472) | (i1462 ^ i1472)) * (-1528)) + i1442;
            int i1492 = ~bitsPerPixel32;
            int i1502 = ~((i1492 & 1) | (i1492 ^ 1));
            int i1512 = ~((bitsPerPixel32 & (-2)) | ((-2) ^ bitsPerPixel32));
            int i1522 = (i1512 & i1502) | (i1502 ^ i1512);
            int i1532 = ~i1422;
            int i1542 = ((i1522 & i1532) | (i1522 ^ i1532)) * 764;
            char c92 = (char) (((i1482 | i1542) << 1) - (i1542 ^ i1482));
            int combineMeasuredStates3 = View.combineMeasuredStates(0, 0);
            int i1552 = ~combineMeasuredStates3;
            int i1562 = (i6 ^ combineMeasuredStates3) | (i6 & combineMeasuredStates3);
            int i1572 = (((combineMeasuredStates3 * 221) - 1083706127) - (~(-(-(((~((i1552 & (-612911838)) | (i1552 ^ (-612911838)))) | (~((i1562 & 612911837) | (i1562 ^ 612911837)))) * 220))))) - 1;
            int i1582 = ~(i9 | 612911837);
            int i1592 = (((i1582 & combineMeasuredStates3) | (combineMeasuredStates3 ^ i1582)) * (-440)) + i1572;
            int i1602 = combineMeasuredStates3 | 612911837;
            int i1612 = ((i1602 & i) | (i1602 ^ i)) * 220;
            int i1622 = ((i1592 | i1612) << 1) - (i1612 ^ i1592);
            Object[] objArr842 = new Object[1];
            b(c92, "\u0000\u0000\u0000\u0000", "ଁ\u1ad9퉥٨㟪㶰壘훩\ue520셈䃍", i1622, "\uddcb衊ؤꇽ", objArr842);
            String str322 = (String) objArr842[0];
            char resolveSize5 = (char) View.resolveSize(0, 0);
            int i1632 = -TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0);
            int PngjBadSignature212 = isAuthSucess.valueOf.PngjBadSignature();
            int i1642 = i1632 * 980;
            int i1652 = ((~(~PngjBadSignature212)) * 979) + (((i1642 | 978) << 1) - (i1642 ^ 978));
            int i1662 = -(-(((i1632 ^ PngjBadSignature212) | (i1632 & PngjBadSignature212)) * (-979)));
            int i1672 = ((i1652 | i1662) << 1) - (i1652 ^ i1662);
            int i1682 = ~PngjBadSignature212;
            int i1692 = ~PngjBadSignature212;
            int i1702 = ~((i1632 & i1692) | (i1692 ^ i1632));
            int i1712 = -(-(((i1702 & i1682) | (i1682 ^ i1702)) * 979));
            int i1722 = ((i1672 | i1712) << 1) - (i1712 ^ i1672);
            Object[] objArr852 = new Object[1];
            b(resolveSize5, "\u0000\u0000\u0000\u0000", "䠁\ue66bⰅ嗣臮縔峄叏፮ﬧ⋐ཕ", i1722, "꒿㰩և妣", objArr852);
            String str332 = (String) objArr852[0];
            Object[] objArr862 = new Object[1];
            c("\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001", false, new int[]{248, 12, 41, 0}, objArr862);
            String str342 = (String) objArr862[0];
            int i1732 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            Object[] objArr872 = new Object[1];
            b((char) ((i1732 ^ 1) + ((i1732 & 1) << 1)), "\u0000\u0000\u0000\u0000", "몥郩䎬\ue92e곮벇䭥訝\ueca1䉧ⶕ", (-764516043) - (~(-(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))))), "㚯湩跒ꮈ", objArr872);
            String str352 = (String) objArr872[0];
            int i1742 = -(-(ViewConfiguration.getEdgeSlop() >> 16));
            int i1752 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > j3 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j3 ? 0 : -1)));
            int i1762 = (i1752 & (-543875791)) + (i1752 | (-543875791));
            Object[] objArr882 = new Object[1];
            b((char) ((i1742 & 10665) + (i1742 | 10665)), "\u0000\u0000\u0000\u0000", "쑋ݮ墶۶刬", i1762, "〉锝꧟舩", objArr882);
            String str362 = (String) objArr882[0];
            int i1772 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
            Object[] objArr892 = new Object[1];
            b((char) ((i1772 & 64845) + (i1772 | 64845)), "\u0000\u0000\u0000\u0000", "鵾饖쀕\ue0c4", ViewConfiguration.getLongPressTimeout() >> 16, "욉̈䵆\u17fd", objArr892);
            String[] strArr42 = {str312, str322, str332, str342, str352, str362, (String) objArr892[0]};
            i10 = 0;
            while (true) {
                if (i10 < 7) {
                }
                i10++;
            }
            if (i11 == 0) {
            }
            i16 = 0;
            if (!((i16 == 0 ? '+' : (char) 14) != '+')) {
            }
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
                    int i = (PngjUnsupportedException + 5) % Uuid.SIZE_BITS;
                    PngjInputException = i;
                    PngjUnsupportedException = (i + 15) % Uuid.SIZE_BITS;
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

    public class PngjException implements Response.Listener {
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
        public final /* synthetic */ void onResponse(Object obj) {
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
    public class C0027values implements RetryPolicy {
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
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i4;
            if (i == i5) {
            }
        }
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

    private static void a(String str, int i, byte b, Object[] objArr) {
        int i2;
        char c;
        char c2;
        char c3;
        char c4;
        char c5;
        int i3;
        char[] charArray = str != null ? str.toCharArray() : str;
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
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i4);
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
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        int i7 = i4;
        Object[] objArr3 = {Integer.valueOf(valueOf)};
        Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i7);
        if (PngjBadSignature3 == null) {
            byte b4 = (byte) 0;
            byte b5 = b4;
            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getTapTimeout() >> 16), View.getDefaultSize(0, 0) + 28, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1530, -201551053, false, $$c(b4, b5, b5), new Class[]{cls});
        }
        char charValue = ((Character) ((Method) PngjBadSignature3).invoke(null, objArr3)).charValue();
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
                    Object[] objArr4 = {pngjInputException, pngjInputException, Integer.valueOf(charValue), pngjInputException, pngjInputException, Integer.valueOf(charValue), pngjInputException, pngjInputException, Integer.valueOf(charValue), pngjInputException, pngjInputException, Integer.valueOf(charValue), pngjInputException};
                    Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1620847519);
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
                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(fadingEdgeLength, modifierMetaStateMask, alpha, 1670167002, false, $$c, new Class[]{Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class});
                    } else {
                        c = '\n';
                        c2 = 2;
                        c3 = '\t';
                        c4 = 7;
                        c5 = '\b';
                    }
                    int intValue = ((Integer) ((Method) PngjBadSignature4).invoke(null, objArr4)).intValue();
                    int i10 = pngjInputException.PngjUnsupportedException;
                    if (intValue == i10) {
                        Object[] objArr5 = new Object[11];
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
                        Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1410004713);
                        if (PngjBadSignature5 == null) {
                            char keyRepeatDelay = (char) (37426 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                            int i11 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 26;
                            int rgb = (-16776199) - Color.rgb(0, 0, 0);
                            byte b8 = (byte) 0;
                            byte b9 = (byte) (b8 + 2);
                            String $$c2 = $$c(b8, b9, (byte) (b9 - 2));
                            Class cls3 = Integer.TYPE;
                            PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(keyRepeatDelay, i11, rgb, 1461347500, false, $$c2, new Class[]{Object.class, Object.class, cls3, cls3, Object.class, Object.class, cls3, cls3, Object.class, cls3, Object.class});
                        }
                        int intValue2 = ((Integer) ((Method) PngjBadSignature5).invoke(null, objArr5)).intValue();
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
                Object[] objArr = new Object[1];
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
                    Object[] objArr2 = new Object[1];
                    a("\u0018\t\u0013\u0002\u0014\u0001\u0011\n\u0015\u0004\r\u0004\u0015\u0001\u0013\u0010\u000e\u0016\u0000\u0010\u000e\u0001\u0015\b\u0005\f", 26 - View.getDefaultSize(0, 0), (byte) (92 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0)), objArr2);
                    byte[] bArr2 = new byte[16];
                    ((Random) Class.forName((String) objArr2[0]).getDeclaredConstructor(null).newInstance(null)).nextBytes(bArr2);
                    cipher.init(1, generateKey, new GCMParameterSpec(Uuid.SIZE_BITS, bArr2));
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
                        throw cause;
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
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
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(Base64.decode(jSONObject.getString("key"), 1));
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
