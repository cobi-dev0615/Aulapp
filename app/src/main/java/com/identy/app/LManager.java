package com.identy.app;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.d.e.Action;
import com.d.e.a.c.getPadSub3B15685$PngjException;
import com.identy.Fpnative;
import com.identy.IdentyB;
import com.karumi.dexter.BuildConfig;
import defpackage.a;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.Key;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.UByte;
import kotlin.io.ConstantsKt;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class LManager {
    private static  byte[] $$a = null;
    private static  int $$b = 0;
    private static  byte[] $$c = null;
    private static  byte[] $$d = null;
    private static  int $$e = 0;
    private static  int $$f = 0;
    public static final long MILLIS_PER_DAY = 86400000;
    private static int onErrorResponse;
    String PngjBadCrcException;
    Activity PngjBadSignature;
    private String PngjException;
    private byte[] PngjExceptionInternal;
    private String PngjInputException;
    private final byte[] PngjOutputException;
    private PngjBadCrcException PngjPrematureEnding;
    private boolean PngjUnsupportedException;
    public String appSignature;
    public long nativeAddres;
    int valueOf;
    String values;

    public class PngjException implements getPadSub3B15685$PngjException {
        public PngjException() {
        }

        @Override // com.d.e.a.c.getPadSub3B15685$PngjException
        public final void PngjBadCrcException(int i, int i2) {
            LManager.this.valueOf = 10;
        }
    }

    public class valueOf implements PngjOutputException {
        private /* synthetic */ String PngjBadSignature;
        private /* synthetic */ String valueOf;

        public valueOf(String str, String str2) {
            this.valueOf = str;
            this.PngjBadSignature = str2;
        }

        @Override // com.identy.app.PngjOutputException
        public final void PngjException(JSONObject jSONObject) {
            try {
                File file = new File(com.identy.app.PngjBadSignature.PngjBadSignature(LManager.this.PngjBadSignature, "IDENTY_ASSETS"), "FIN/");
                if (!file.exists()) {
                    file.mkdirs();
                }
                JSONObject jSONObject2 = jSONObject.has("result") ? jSONObject.getJSONObject("result") : new JSONObject();
                if (LManager.this.PngjBadCrcException.equals("finger")) {
                    try {
                        String absolutePath = com.identy.app.PngjBadSignature.PngjBadSignature(LManager.this.PngjBadSignature, "ID").getAbsolutePath();
                        String str = LManager.this.values;
                        try {
                            File file2 = new File(absolutePath);
                            if (!file2.exists()) {
                                file2.mkdirs();
                            }
                            String concat = absolutePath.endsWith("/") ? "license" : "/".concat("license");
                            StringBuilder sb = new StringBuilder();
                            sb.append(absolutePath);
                            sb.append(concat);
                            PrintWriter printWriter = new PrintWriter(sb.toString());
                            printWriter.println(str);
                            printWriter.close();
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        }
                    } catch (Exception unused) {
                    }
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (jSONObject2.has(next)) {
                            JSONObject jSONObject3 = jSONObject2.getJSONObject(next);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(next);
                            sb2.append(".header");
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(file, sb2.toString()));
                            fileOutputStream.write(Base64.decode(jSONObject3.getString("header"), 3));
                            fileOutputStream.close();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(next);
                            sb3.append(".footer");
                            FileOutputStream fileOutputStream2 = new FileOutputStream(new File(file, sb3.toString()));
                            fileOutputStream2.write(Base64.decode(jSONObject3.getString("footer"), 3));
                            fileOutputStream2.close();
                        }
                    }
                }
                LManager lManager = LManager.this;
                lManager.validate(lManager.nativeAddres, jSONObject.getJSONObject("data").getString("refid").getBytes(), LManager.this.appSignature.getBytes(), LManager.this.PngjBadSignature.getApplicationContext().getPackageName().getBytes(), LManager.this.values.getBytes(), this.valueOf.getBytes(), LManager.this.PngjBadCrcException.getBytes(), false, this.PngjBadSignature.getBytes());
            } catch (Exception unused2) {
                LManager.this.doECallback();
            }
        }

        @Override // com.identy.app.PngjOutputException
        public final void values(boolean z) {
            if (z) {
                LManager lManager = LManager.this;
                lManager.validate(lManager.nativeAddres, "v".getBytes(), LManager.this.appSignature.getBytes(), LManager.this.PngjBadSignature.getApplicationContext().getPackageName().getBytes(), LManager.this.values.getBytes(), this.valueOf.getBytes(), LManager.this.PngjBadCrcException.getBytes(), false, this.PngjBadSignature.getBytes());
            } else {
                LManager lManager2 = LManager.this;
                lManager2.validate(lManager2.nativeAddres, BuildConfig.FLAVOR.getBytes(), LManager.this.appSignature.getBytes(), LManager.this.PngjBadSignature.getApplicationContext().getPackageName().getBytes(), LManager.this.values.getBytes(), this.valueOf.getBytes(), LManager.this.PngjBadCrcException.getBytes(), false, this.PngjBadSignature.getBytes());
            }
        }
    }

    public class values implements PngjOutputException {
        private /* synthetic */ String valueOf;

        public values(String str) {
            this.valueOf = str;
        }

        @Override // com.identy.app.PngjOutputException
        public final void PngjException(JSONObject jSONObject) {
            try {
                LManager lManager = LManager.this;
                lManager.validate(lManager.nativeAddres, jSONObject.getJSONObject("data").getString("refid").getBytes(), LManager.this.appSignature.getBytes(), LManager.this.PngjBadSignature.getApplicationContext().getPackageName().getBytes(), LManager.this.values.getBytes(), this.valueOf.getBytes(), LManager.this.PngjBadCrcException.getBytes(), true, BuildConfig.FLAVOR.getBytes());
                LManager.this.destroy();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // com.identy.app.PngjOutputException
        public final void values(boolean z) {
            LManager.this.destroy();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$g(short s, short s2, short s3) {
        int i;
        int i2 = s * 2;
        int i3 = 3 - (s2 * 3);
        byte[] bArr = $$c;
        int i4 = 104 - (s3 * 3);
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        if (bArr == null) {
            int i6 = i4;
            int i7 = 0;
            i4 = i5;
            i4 += i6;
            i = i7;
            bArr2[i] = (byte) i4;
            i3++;
            i7 = i + 1;
            if (i == i5) {
                return new String(bArr2, 0);
            }
            i6 = bArr[i3];
            i4 += i6;
            i = i7;
            bArr2[i] = (byte) i4;
            i3++;
            i7 = i + 1;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i4;
            i3++;
            int i7 = i + 1;
            if (i == i5) {
            }
        }
        return null;
    }

    static {
        init$2();
        init$1();
        init$0();
        values();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LManager(Activity activity, String str, PngjBadCrcException pngjBadCrcException, String str2, String str3, boolean z) {
        this(activity, getFileDataFromFile(activity.getAssets(), str), pngjBadCrcException, str2, str3, z);
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int elapsedRealtime = (int) SystemClock.elapsedRealtime();
                    int c = a.c((~(elapsedRealtime | 467959186)) | 438307090, 302, ((~((-1277998) | elapsedRealtime)) * (-604)) + (((~((~elapsedRealtime) | (-1277998))) | (~(469237183 | elapsedRealtime))) * (-302)) + 1660089369, 885258084);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 5010;
                    Fpnative.valueOf = objArr;
                }
            }
            byte[] bArr = $$d;
            byte b = bArr[113];
            Object[] objArr3 = new Object[1];
            a(b, (byte) (b | 124), bArr[62], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b2 = bArr[32];
            Object[] objArr4 = new Object[1];
            a(b2, (byte) (b2 | 92), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 885258084);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5010;
            Fpnative.valueOf = objArr;
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, short s, int i2, Object[] objArr) {
        int i3;
        int i4;
        int i5 = i2 + 6;
        int i6 = (i * 19) + 80;
        byte[] bArr = $$d;
        int i7 = 129 - s;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            i6 = i5;
            byte[] bArr3 = bArr;
            i4 = 0;
            int i8 = i7;
            int i9 = i6 + i7;
            i7 = i8 + 1;
            i6 = i9 - 13;
            bArr = bArr3;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b = bArr[i7];
            byte[] bArr4 = bArr;
            i8 = i7;
            i7 = b;
            bArr3 = bArr4;
            int i92 = i6 + i7;
            i7 = i8 + 1;
            i6 = i92 - 13;
            bArr = bArr3;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, short s, Object[] objArr) {
        int i;
        int i2 = 118 - (b * 2);
        byte[] bArr = $$a;
        int i3 = s * 4;
        int i4 = (b2 * 4) + 4;
        byte[] bArr2 = new byte[6 - i3];
        int i5 = 5 - i3;
        if (bArr == null) {
            i2 = i4;
            int i6 = i5;
            i = 0;
            i4++;
            i2 = (i2 + i6) - 3;
            bArr2[i] = (byte) i2;
            if (i == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i++;
            i6 = bArr[i4];
            i4++;
            i2 = (i2 + i6) - 3;
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

    /* JADX WARN: Removed duplicated region for block: B:9:0x012f A[LOOP:0: B:7:0x012c->B:9:0x012f, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String bytesToHex(byte[] bArr) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int startUptimeMillis = (int) Process.getStartUptimeMillis();
                    int c = a.c((~((~startUptimeMillis) | 563783095)) | (-1071626232), -964, (((~(563783095 | startUptimeMillis)) | (-1062672376)) * (-964)) + 258877311, -804557578);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 5027;
                    Fpnative.valueOf = objArr;
                    char[] charArray = "0123456789abcdef".toCharArray();
                    int length = bArr.length;
                    int i3 = ((int[]) objArr[1])[0];
                    int i4 = i3 * i3;
                    int i5 = -(1819301717 * i3);
                    int i6 = ((((i4 | i5) << 1) - (i4 ^ i5)) - (~(-(i3 * 934250933)))) - 1;
                    int i7 = (i6 & 1167041817) + (1167041817 | i6);
                    int i8 = i7 >> 26;
                    int a = IdentyB.a(i8 ^ (-127), (i8 & (-127)) << 1, 64, -1);
                    int i9 = (i7 & a) + (a | i7);
                    int i10 = ((i7 >> 27) - 63) / 32;
                    int i11 = -(((i10 & 1) + (i10 | 1)) ^ i9);
                    int i12 = ((i11 | 6) << 1) - (i11 ^ 6);
                    int i13 = ((i12 >> 21) - 4095) / 2048;
                    int i14 = ((i13 | 1) << 1) - (i13 ^ 1);
                    char[] cArr = new char[(20544 / (((-((i14 ^ 1) + ((i14 & 1) << 1))) & i12) * 1712)) * length];
                    for (int i15 = 0; i15 < bArr.length; i15++) {
                        byte b = bArr[i15];
                        int i16 = i15 << 1;
                        cArr[i16] = charArray[(b & UByte.MAX_VALUE) >>> 4];
                        cArr[i16 + 1] = charArray[b & 15];
                    }
                    return new String(cArr);
                }
            }
            byte[] bArr2 = $$d;
            byte b2 = bArr2[113];
            Object[] objArr3 = new Object[1];
            a(b2, (byte) (b2 | 124), bArr2[62], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b3 = bArr2[32];
            Object[] objArr4 = new Object[1];
            a(b3, (byte) (b3 | 92), bArr2[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -804557578);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5027;
            Fpnative.valueOf = objArr;
            char[] charArray2 = "0123456789abcdef".toCharArray();
            int length2 = bArr.length;
            int i32 = ((int[]) objArr[1])[0];
            int i42 = i32 * i32;
            int i52 = -(1819301717 * i32);
            int i62 = ((((i42 | i52) << 1) - (i42 ^ i52)) - (~(-(i32 * 934250933)))) - 1;
            int i72 = (i62 & 1167041817) + (1167041817 | i62);
            int i82 = i72 >> 26;
            int a2 = IdentyB.a(i82 ^ (-127), (i82 & (-127)) << 1, 64, -1);
            int i92 = (i72 & a2) + (a2 | i72);
            int i102 = ((i72 >> 27) - 63) / 32;
            int i112 = -(((i102 & 1) + (i102 | 1)) ^ i92);
            int i122 = ((i112 | 6) << 1) - (i112 ^ 6);
            int i132 = ((i122 >> 21) - 4095) / 2048;
            int i142 = ((i132 | 1) << 1) - (i132 ^ 1);
            char[] cArr2 = new char[(20544 / (((-((i142 ^ 1) + ((i142 & 1) << 1))) & i122) * 1712)) * length2];
            /* while (false) {
            } */
            return new String(cArr2);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, boolean z, String str, int i2, int i3, Object[] objArr) {
        Throwable cause;
        char c;
        char[] charArray = str != null ? str.toCharArray() : null;
        Action action = new Action();
        char[] cArr = new char[i];
        action.valueOf = 0;
        while (true) {
            int i4 = action.valueOf;
            if (i4 >= i) {
                break;
            }
            char c2 = charArray[i4];
            action.values = c2;
            char c3 = (char) (i3 + c2);
            cArr[i4] = c3;
            try {
                Object[] objArr2 = {Integer.valueOf(c3), Integer.valueOf(onErrorResponse)};
                Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(610361420);
                if (PngjBadSignature == null) {
                    char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int i5 = 28 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int i6 = 1532 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    byte b = (byte) 0;
                    byte b2 = b;
                    c = 1;
                    String $$g = $$g(b, b2, b2);
                    Class cls = Integer.TYPE;
                    PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(windowTouchSlop, i5, i6, -661778953, false, $$g, new Class[]{cls, cls});
                } else {
                    c = 1;
                }
                cArr[i4] = ((Character) ((Method) PngjBadSignature).invoke(null, objArr2)).charValue();
                Object[] objArr3 = new Object[2];
                objArr3[c] = action;
                objArr3[0] = action;
                Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-743328348);
                if (PngjBadSignature2 == null) {
                    PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 40 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 189 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0), 794744863, false, "j", new Class[]{Object.class, Object.class});
                }
                ((Method) PngjBadSignature2).invoke(null, objArr3);
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
            System.arraycopy(cArr, 0, cArr2, 0, i);
            int i7 = action.PngjException;
            System.arraycopy(cArr2, 0, cArr, i - i7, i7);
            int i8 = action.PngjException;
            System.arraycopy(cArr2, i8, cArr, 0, i - i8);
        }
        if (z) {
            char[] cArr3 = new char[i];
            action.valueOf = 0;
            while (true) {
                int i9 = action.valueOf;
                if (i9 >= i) {
                    break;
                }
                cArr3[i9] = cArr[(i - i9) - 1];
                Object[] objArr4 = {action, action};
                Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-743328348);
                if (PngjBadSignature3 == null) {
                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) View.resolveSizeAndState(0, 0, 0), 40 - (ViewConfiguration.getKeyRepeatDelay() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 190, 794744863, false, "j", new Class[]{Object.class, Object.class});
                }
                try {
                    ((Method) PngjBadSignature3).invoke(null, objArr4);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            cArr = cArr3;
        }
        objArr[0] = new String(cArr);
    }

    public static String generateHashWithHmac256(byte[] bArr, byte[] bArr2) {
        Object[] objArr = null;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            try {
                if (objArr2 != null) {
                    long j2 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                    if (j2 > j) {
                        objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                        int b = a.b(1125331670);
                        int i = ((b | 567102930) * (-50)) - 2095020039;
                        int i2 = ~((-567084097) | b);
                        int i3 = ~b;
                        int c = a.c((~(i3 | 567102930)) | (~(68213650 | i3)) | (-635297747), 50, ((i2 | (~(635297746 | i3))) * 50) + i, 2031826682);
                        int i4 = c ^ (c << 13);
                        int i5 = i4 ^ (i4 >>> 17);
                        ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                        ((long[]) objArr[0])[0] = j + 5047;
                        Fpnative.valueOf = objArr;
                        int i6 = ((int[]) objArr[1])[0];
                        int i7 = i6 * i6;
                        int i8 = -(159849862 * i6);
                        int i9 = (((i7 ^ i8) + ((i7 & i8) << 1)) - (~(-(i6 * 843588668)))) - 1;
                        int i10 = ((i9 | (-1255668287)) << 1) - ((-1255668287) ^ i9);
                        int i11 = ((i10 >> 28) - 31) / 16;
                        int i12 = ((i11 | 1) << 1) - (i11 ^ 1);
                        int i13 = (i10 ^ i12) + ((i12 & i10) << 1);
                        int i14 = i10 >> 19;
                        int i15 = ((i14 ^ (-16383)) + ((i14 & (-16383)) << 1)) / ConstantsKt.DEFAULT_BUFFER_SIZE;
                        int i16 = -(i13 ^ ((i15 & 1) + (i15 | 1)));
                        int i17 = (i16 ^ 9) + ((i16 & 9) << 1);
                        int i18 = i17 >> 16;
                        int i19 = (((i18 & (-131071)) + (i18 | (-131071))) / 65536) + 1;
                        return bytesToHex(hmac("21;1;3;22;HmacSHA256".substring(16470 / (((-(((i19 | 1) << 1) - (i19 ^ 1))) & i17) * 183)), bArr2, bArr));
                    }
                }
                int i62 = ((int[]) objArr[1])[0];
                int i72 = i62 * i62;
                int i82 = -(159849862 * i62);
                int i92 = (((i72 ^ i82) + ((i72 & i82) << 1)) - (~(-(i62 * 843588668)))) - 1;
                int i102 = ((i92 | (-1255668287)) << 1) - ((-1255668287) ^ i92);
                int i112 = ((i102 >> 28) - 31) / 16;
                int i122 = ((i112 | 1) << 1) - (i112 ^ 1);
                int i132 = (i102 ^ i122) + ((i122 & i102) << 1);
                int i142 = i102 >> 19;
                int i152 = ((i142 ^ (-16383)) + ((i142 & (-16383)) << 1)) / ConstantsKt.DEFAULT_BUFFER_SIZE;
                int i162 = -(i132 ^ ((i152 & 1) + (i152 | 1)));
                int i172 = (i162 ^ 9) + ((i162 & 9) << 1);
                int i182 = i172 >> 16;
                int i192 = (((i182 & (-131071)) + (i182 | (-131071))) / 65536) + 1;
                return bytesToHex(hmac("21;1;3;22;HmacSHA256".substring(16470 / (((-(((i192 | 1) << 1) - (i192 ^ 1))) & i172) * 183)), bArr2, bArr));
            } catch (Exception e) {
                e.printStackTrace();
                return BuildConfig.FLAVOR;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(6:(2:3|(10:5|6|7|8|9|10|11|12|13|14))|10|11|12|13|14)|55|56|57|6|7|8|9|(2:(0)|(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:(2:3|(10:5|6|7|8|9|10|11|12|13|14))|10|11|12|13|14) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:(6:(2:3|(10:5|6|7|8|9|10|11|12|13|14))|10|11|12|13|14)|55|56|57|6|7|8|9) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0168, code lost:
    
        if (0 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0172, code lost:
    
        0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0175, code lost:
    
        throw 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
    
        throw 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        throw 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0160, code lost:
    
        0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0161, code lost:
    
        0 = 0;
        0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x016f, code lost:
    
        0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0156, code lost:
    
        0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0157, code lost:
    
        0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0164, code lost:
    
        0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0153, code lost:
    
        0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0154, code lost:
    
        0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0159, code lost:
    
        0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0150, code lost:
    
        0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0151, code lost:
    
        0 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0172 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] getFileDataFromFile(AssetManager assetManager, String str) {
        Object[] objArr;
        long j;
        BufferedInputStream bufferedInputStream = null;
        Object[] objArr2 = Fpnative.valueOf;
        int r3 = -1774109310;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            try {
                if (objArr2 != null) {
                    long j2 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                    if (j2 > j) {
                        objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                        int b = a.b(989110959);
                        int c = a.c(~(b | 397237902), 113, (((~((~b) | 938335950)) | (~((-896127183) | b)) | 355029134) * (-113)) + ((((~(397237902 | 0)) | 896127182) * 226) - 41024400), -1774109310);
                        int i = c ^ (c << 13);
                        int i2 = i ^ (i >>> 17);
                        ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                        ((long[]) objArr[0])[0] = j + 4959;
                        Fpnative.valueOf = objArr;
                        InputStream open = assetManager.open(str);
                        int available = open.available();
                        byte[] bArr = new byte[available];
                        bufferedInputStream = new BufferedInputStream(open);
                        int i3 = ((int[]) objArr[1])[0];
                        int i4 = i3 * i3;
                        int i5 = -(470782916 * i3);
                        int i6 = (i4 & i5) + (i4 | i5);
                        int i7 = -(i3 * 1901630850);
                        int i8 = (((i6 | i7) << 1) - (i7 ^ i6)) - (-719445961);
                        int i9 = i8 >> 19;
                        int i10 = (((i9 | (-16383)) << 1) - (i9 ^ (-16383))) / ConstantsKt.DEFAULT_BUFFER_SIZE;
                        int i11 = (i8 - (~((i10 & 1) + (i10 | 1)))) - 1;
                        int i12 = ((i8 >> 15) - 262143) / 131072;
                        int i13 = (-(i11 ^ ((i12 ^ 1) + ((i12 & 1) << 1)))) + 5;
                        int i14 = i13 >> 27;
                        bufferedInputStream.read(bArr, 0 / (((-IdentyB.e((i14 | (-63)) << 1, i14 ^ (-63), 32, -2)) & i13) * 1033), available);
                        bufferedInputStream.close();
                        open.close();
                        bufferedInputStream.close();
                        return bArr;
                    }
                }
                bufferedInputStream.read(new byte[0], 0, 0);
                bufferedInputStream.close();
                // open.close();
                bufferedInputStream.close();
                return new byte[0];
            } catch (FileNotFoundException e) {
                FileNotFoundException fileNotFoundException = e;
                fileNotFoundException.printStackTrace();
            } catch (IOException e2) {
                IOException iOException = e2;
                iOException.printStackTrace();
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return null;
            } catch (Throwable th) {
                Throwable th2 = th;
                if (bufferedInputStream != null) {
                }
            }
            byte[] bArr2 = $$d;
            byte b2 = bArr2[113];
            Object[] objArr3 = new Object[1];
            a(b2, (byte) (b2 | 124), bArr2[62], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b3 = bArr2[32];
            Object[] objArr4 = new Object[1];
            a(b3, (byte) (b3 | 92), bArr2[63], objArr4);
            String str2 = (String) objArr4[0];
            objArr = (Object[]) cls.getMethod(str2, Integer.TYPE).invoke(null, -1774109310);
            j = ((long[]) objArr[0])[0];
            // 0 = str2;
            ((long[]) objArr[0])[0] = j + 4959;
            Fpnative.valueOf = objArr;
            InputStream open2 = assetManager.open(str);
            int available2 = open2.available();
            byte[] bArr3 = new byte[available2];
            bufferedInputStream = new BufferedInputStream(open2);
            int i32 = ((int[]) objArr[1])[0];
            int i42 = i32 * i32;
            int i52 = -(470782916 * i32);
            int i62 = (i42 & i52) + (i42 | i52);
            int i72 = -(i32 * 1901630850);
            int i82 = (((i62 | i72) << 1) - (i72 ^ i62)) - (-719445961);
            int i92 = i82 >> 19;
            int i102 = (((i92 | (-16383)) << 1) - (i92 ^ (-16383))) / ConstantsKt.DEFAULT_BUFFER_SIZE;
            int i112 = (i82 - (~((i102 & 1) + (i102 | 1)))) - 1;
            int i122 = ((i82 >> 15) - 262143) / 131072;
            int i132 = (-(i112 ^ ((i122 ^ 1) + ((i122 & 1) << 1)))) + 5;
            int i142 = i132 >> 27;
        } catch (Throwable th3) {
            Throwable cause = th3.getCause();

            if (cause != null) {

                throw new RuntimeException(cause);

            }

            throw new RuntimeException(th3);
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(2:3|(8:5|6|7|8|10|11|12|13))|23|24|25|6|7|8|10|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0106, code lost:
    
        0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0107, code lost:
    
        0.printStackTrace();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Key getSecureRandomKey() {
        Object[] objArr = null;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        KeyGenerator keyGenerator = null;
        try {
            try {
                if (objArr2 != null) {
                    long j2 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                    if (j2 > j) {
                        objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                        int i = ~((int) Process.getStartElapsedRealtime());
                        int i2 = ~(1018481123 | i);
                        int c = a.c(i2 | (-575446593), 764, (((~(i | (-519591844))) | 481313187) * (-1528)) + ((i2 | (-519591844)) * 764) + 596774547, 1920019168);
                        int i3 = c ^ (c << 13);
                        int i4 = i3 ^ (i3 >>> 17);
                        ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                        ((long[]) objArr[0])[0] = j + 4939;
                        Fpnative.valueOf = objArr;
                        Object[] objArr3 = new Object[1];
                        c((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 25, true, "ￊ�\u0012�\u0006\t\u000b\u0000\n�￮\u0001\u000e\u0011\uffff\u0001\uffefￊ\u0015\u0010\u0005\u000e\u0011\uffff\u0001\u000f", ExpandableListView.getPackedPositionChild(0L) + 6, TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 142, objArr3);
                        SecureRandom secureRandom = (SecureRandom) Class.forName((String) objArr3[0]).getDeclaredConstructor(null).newInstance(null);
                        keyGenerator = KeyGenerator.getInstance("AES");
                        int i5 = ((int[]) objArr[1])[0];
                        int i6 = ((i5 * i5) - (~(-(422555121 * i5)))) - 1;
                        int i7 = -(i5 * (-1957150273));
                        int i8 = (i6 & i7) + (i7 | i6);
                        int i9 = (i8 ^ 184714816) + ((184714816 & i8) << 1);
                        int i10 = ((i9 >> 18) - 32767) / 16384;
                        int i11 = ((i10 | 1) << 1) - (i10 ^ 1);
                        int i12 = (i9 & i11) + (i11 | i9);
                        int i13 = i9 >> 17;
                        int i14 = ((i13 ^ (-65535)) + ((i13 & (-65535)) << 1)) / 32768;
                        int i15 = -(i12 ^ (((i14 | 1) << 1) - (i14 ^ 1)));
                        int i16 = (i15 & 4) + (i15 | 4);
                        int i17 = ((i16 >> 17) - 65535) / 32768;
                        keyGenerator.init(1822720 / (((-((((i17 | 1) << 1) - (i17 ^ 1)) + 1)) & i16) * 1780), secureRandom);
                        return keyGenerator.generateKey();
                    }
                }
                Object[] objArr32 = new Object[1];
                c((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 25, true, "ￊ�\u0012�\u0006\t\u000b\u0000\n�￮\u0001\u000e\u0011\uffff\u0001\uffefￊ\u0015\u0010\u0005\u000e\u0011\uffff\u0001\u000f", ExpandableListView.getPackedPositionChild(0L) + 6, TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 142, objArr32);
                SecureRandom secureRandom2 = (SecureRandom) Class.forName((String) objArr32[0]).getDeclaredConstructor(null).newInstance(null);
                keyGenerator = KeyGenerator.getInstance("AES");
                int i52 = ((int[]) objArr[1])[0];
                int i62 = ((i52 * i52) - (~(-(422555121 * i52)))) - 1;
                int i72 = -(i52 * (-1957150273));
                int i82 = (i62 & i72) + (i72 | i62);
                int i92 = (i82 ^ 184714816) + ((184714816 & i82) << 1);
                int i102 = ((i92 >> 18) - 32767) / 16384;
                int i112 = ((i102 | 1) << 1) - (i102 ^ 1);
                int i122 = (i92 & i112) + (i112 | i92);
                int i132 = i92 >> 17;
                int i142 = ((i132 ^ (-65535)) + ((i132 & (-65535)) << 1)) / 32768;
                int i152 = -(i122 ^ (((i142 | 1) << 1) - (i142 ^ 1)));
                int i162 = (i152 & 4) + (i152 | 4);
                int i172 = ((i162 >> 17) - 65535) / 32768;
                keyGenerator.init(1822720 / (((-((((i172 | 1) << 1) - (i172 ^ 1)) + 1)) & i162) * 1780), secureRandom2);
                return keyGenerator.generateKey();
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
    }

    public static byte[] hmac(String str, byte[] bArr, byte[] bArr2) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int uptimeMillis = (int) SystemClock.uptimeMillis();
                    int i = ~((-37781569) | uptimeMillis);
                    int c = a.c((~(uptimeMillis | (-423100438))) | (~((~uptimeMillis) | (-38007275))) | 225706, 497, ((i | (~(0 | (-423100438)))) * 497) - 1038376400, 1872094805);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4861;
                    Fpnative.valueOf = objArr;
                    Mac mac = Mac.getInstance(str);
                    mac.init(new SecretKeySpec(bArr, str));
                    return mac.doFinal(bArr2);
                }
            }
            byte[] bArr3 = $$d;
            Object[] objArr3 = new Object[1];
            a(bArr3[113], bArr3[3], (byte) (-bArr3[1]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr3[63];
            Object[] objArr4 = new Object[1];
            a(b, b, bArr3[53], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1872094805);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4861;
            Fpnative.valueOf = objArr;
            Mac mac2 = Mac.getInstance(str);
            mac2.init(new SecretKeySpec(bArr, str));
            return mac2.doFinal(bArr2);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    public static void init$0() {
        $$a = new byte[]{49, 26, -54, -27, -18, 14, 12, -13, 17};
        $$b = 67;
    }

    public static void init$1() {
        $$d = new byte[]{57, -23, -86, 28, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 70, -44, 47, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, -8, 24, 22, -3, 27, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 36, 54, 17, 10, 10, 13, -43, 31, 8, 47, 30, 2, 26, 0, 24, 18, -72, 57, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 38, 59, 1, 8, 14, -10, 46, -27, 59, 1, 8, 14, -16, 42, 20, 17, 2, 26, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0};
        $$e = 84;
    }

    public static void init$2() {
        $$c = new byte[]{30, 69, 34, 112};
        $$f = 244;
    }

    public static void values() {
        onErrorResponse = 97773856;
    }

    public final native void addTransaction(long j, String str, byte[] bArr);

    public final void addTransaction(String str) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = a.c(identityHashCode | 958417637, 104, ((~((~identityHashCode) | (-37982209))) * (-104)) + (((~(459528357 | identityHashCode)) | 536871488) * 104) + 154011815, 1256249670);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4954;
                    Fpnative.valueOf = objArr;
                    addTransaction(this.nativeAddres, str, this.PngjBadCrcException.getBytes());
                }
            }
            byte[] bArr = $$d;
            byte b = bArr[113];
            Object[] objArr3 = new Object[1];
            a(b, (byte) (b | 124), bArr[62], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b2 = bArr[32];
            Object[] objArr4 = new Object[1];
            a(b2, (byte) (b2 | 92), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1256249670);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4954;
            Fpnative.valueOf = objArr;
            addTransaction(this.nativeAddres, str, this.PngjBadCrcException.getBytes());
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
    }

    public final native void addTransactionv2(long j, String str, byte[] bArr);

    public final void addTransactionv2(String str) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    int c = a.c((~((~elapsedCpuTime) | (-348510504))) | 473120831, 398, (((~((-348510504) | elapsedCpuTime)) | 473120831) * 398) + 1018875995, 280702535);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4951;
                    Fpnative.valueOf = objArr;
                    addTransactionv2(this.nativeAddres, str, this.PngjBadCrcException.getBytes());
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            a(bArr[113], bArr[3], (byte) (-bArr[1]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr[63];
            Object[] objArr4 = new Object[1];
            a(b, b, bArr[53], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 280702535);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4951;
            Fpnative.valueOf = objArr;
            addTransactionv2(this.nativeAddres, str, this.PngjBadCrcException.getBytes());
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
    }

    public final boolean checkAssets() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i = ~((-403917970) | identityHashCode);
                    int c = a.c(~((~identityHashCode) | (-403917970)), 476, (i * 952) + ((35651886 | i) * (-476)) + 1297892907, -1972682829);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 5037;
                    Fpnative.valueOf = objArr;
                    File PngjBadSignature = com.identy.app.PngjBadSignature.PngjBadSignature(this.PngjBadSignature, "IDENTY_ASSETS/FIN");
                    StringBuilder sb = new StringBuilder();
                    int i4 = ((int[]) objArr[1])[0];
                    int i5 = ((i4 * i4) - (~(-(1004571103 * i4)))) - 1;
                    int i6 = -(i4 * (-27035491));
                    int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
                    int i8 = (i7 ^ 1618578180) + ((1618578180 & i7) << 1);
                    int i9 = i8 >> 24;
                    int i10 = ((i9 ^ (-511)) + ((i9 & (-511)) << 1)) / 256;
                    int i11 = (i8 - (~(((i10 | 1) << 1) - (i10 ^ 1)))) - 1;
                    int i12 = i8 >> 27;
                    int i13 = ((i12 ^ (-63)) + ((i12 & (-63)) << 1)) / 32;
                    int i14 = -(i11 ^ ((i13 ^ 1) + ((i13 & 1) << 1)));
                    int i15 = (i14 & 7) + (i14 | 7);
                    int i16 = i15 >> 22;
                    int i17 = (((i16 | (-2047)) << 1) - (i16 ^ (-2047))) / 1024;
                    int i18 = (i17 & 1) + (i17 | 1);
                    sb.append("10\\0\\4\\identy_".substring(39200 / (((-(((i18 | 1) << 1) - (i18 ^ 1))) & i15) * 800)));
                    sb.append(this.PngjBadCrcException);
                    sb.append("_");
                    sb.append(this.PngjInputException.replace(".", "_"));
                    return com.identy.app.PngjException.PngjBadCrcException(sb.toString()) == null && this.PngjBadCrcException.equals("finger") && new File(PngjBadSignature, "data1.footer").exists() && new File(PngjBadSignature, "data1.footer").length() > 0;
                }
            }
            byte b = $$d[113];
            Object[] objArr3 = new Object[1];
            a(b, (byte) (b | 88), $$a[111], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a($$a[63], $$a[117], $$a[55], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1972682829);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5037;
            Fpnative.valueOf = objArr;
            File PngjBadSignature2 = com.identy.app.PngjBadSignature.PngjBadSignature(this.PngjBadSignature, "IDENTY_ASSETS/FIN");
            StringBuilder sb2 = new StringBuilder();
            int i42 = ((int[]) objArr[1])[0];
            int i52 = ((i42 * i42) - (~(-(1004571103 * i42)))) - 1;
            int i62 = -(i42 * (-27035491));
            int i72 = (i52 ^ i62) + ((i62 & i52) << 1);
            int i82 = (i72 ^ 1618578180) + ((1618578180 & i72) << 1);
            int i92 = i82 >> 24;
            int i102 = ((i92 ^ (-511)) + ((i92 & (-511)) << 1)) / 256;
            int i112 = (i82 - (~(((i102 | 1) << 1) - (i102 ^ 1)))) - 1;
            int i122 = i82 >> 27;
            int i132 = ((i122 ^ (-63)) + ((i122 & (-63)) << 1)) / 32;
            int i142 = -(i112 ^ ((i132 ^ 1) + ((i132 & 1) << 1)));
            int i152 = (i142 & 7) + (i142 | 7);
            int i162 = i152 >> 22;
            int i172 = (((i162 | (-2047)) << 1) - (i162 ^ (-2047))) / 1024;
            int i182 = (i172 & 1) + (i172 | 1);
            sb2.append("10\\0\\4\\identy_".substring(39200 / (((-(((i182 | 1) << 1) - (i182 ^ 1))) & i152) * 800)));
            sb2.append(this.PngjBadCrcException);
            sb2.append("_");
            sb2.append(this.PngjInputException.replace(".", "_"));
            if (com.identy.app.PngjException.PngjBadCrcException(sb2.toString()) == null) {
                return false;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
        return false;
    }

    public final native long create(AssetManager assetManager, Context context, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, boolean z);

    /* JADX WARN: Removed duplicated region for block: B:10:0x00e2 A[Catch: Exception -> 0x0104, TryCatch #1 {Exception -> 0x0104, blocks: (B:8:0x00db, B:10:0x00e2, B:11:0x0129, B:15:0x0106), top: B:7:0x00db }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0106 A[Catch: Exception -> 0x0104, TryCatch #1 {Exception -> 0x0104, blocks: (B:8:0x00db, B:10:0x00e2, B:11:0x0129, B:15:0x0106), top: B:7:0x00db }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] decryptAES(byte[] bArr, Key key, String str, boolean z, String str2) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            try {
                if (objArr2 != null) {
                    long j2 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                    if (j2 > j) {
                        objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                        int myPid = Process.myPid();
                        int c = a.c((~(myPid | (-841239244))) | 342349963, 318, (((~(841239243 | myPid)) | (-912775884)) * (-318)) + (((~((-570425921) | myPid)) | (~((~myPid) | (-71536641)))) * (-318)) + 2074643501, 1620582236);
                        int i = c ^ (c << 13);
                        int i2 = i ^ (i >>> 17);
                        ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                        ((long[]) objArr[0])[0] = j + 5000;
                        Fpnative.valueOf = objArr;
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        if (z) {
                            byte[] bArr2 = new byte[12];
                            int length = bArr.length - 12;
                            byte[] bArr3 = new byte[length];
                            Cipher cipher = Cipher.getInstance(str);
                            System.arraycopy(bArr, 0, bArr2, 0, 12);
                            System.arraycopy(bArr, 12, bArr3, 0, length);
                            cipher.init(2, key, new GCMParameterSpec(128, bArr2));
                            byteArrayOutputStream.write(cipher.doFinal(bArr3));
                        } else {
                            byte[] bArr4 = new byte[16];
                            int length2 = bArr.length - 16;
                            byte[] bArr5 = new byte[length2];
                            Cipher cipher2 = Cipher.getInstance(str);
                            System.arraycopy(bArr, 0, bArr4, 0, 16);
                            System.arraycopy(bArr, 16, bArr5, 0, length2);
                            cipher2.init(2, key, new IvParameterSpec(bArr4));
                            byteArrayOutputStream.write(cipher2.doFinal(bArr5));
                        }
                        return byteArrayOutputStream.toByteArray();
                    }
                }
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                if (z) {
                }
                return byteArrayOutputStream2.toByteArray();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    public final void decryptTemplate(String str, String str2) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            try {
                if (objArr2 != null) {
                    long j2 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                    if (j2 > j) {
                        objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                        int i = ~(1065927021 | elapsedCpuTime);
                        int c = a.c((~(elapsedCpuTime | (-567037742))) | (~((-1065927022) | elapsedCpuTime)) | 562577709, 407, ((i | (~((~elapsedCpuTime) | 567037741)) | 562577709) * 407) + (((-1070387054) | i) * (-814)) + 1561560967, -1388326072);
                        int i2 = c ^ (c << 13);
                        int i3 = i2 ^ (i2 >>> 17);
                        ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                        ((long[]) objArr[0])[0] = j + 4897;
                        Fpnative.valueOf = objArr;
                        File file = new File(str);
                        byte[] bArr = new byte[(int) file.length()];
                        FileInputStream fileInputStream = new FileInputStream(file);
                        fileInputStream.read(bArr);
                        fileInputStream.close();
                        byte[] decryptTemplate = decryptTemplate(this.nativeAddres, bArr, str2.getBytes(), this.appSignature.getBytes(), this.values.getBytes());
                        FileOutputStream fileOutputStream = new FileOutputStream(str2);
                        fileOutputStream.write(decryptTemplate);
                        fileOutputStream.close();
                        return;
                    }
                }
                File file2 = new File(str);
                byte[] bArr2 = new byte[(int) file2.length()];
                FileInputStream fileInputStream2 = new FileInputStream(file2);
                fileInputStream2.read(bArr2);
                fileInputStream2.close();
                byte[] decryptTemplate2 = decryptTemplate(this.nativeAddres, bArr2, str2.getBytes(), this.appSignature.getBytes(), this.values.getBytes());
                FileOutputStream fileOutputStream2 = new FileOutputStream(str2);
                fileOutputStream2.write(decryptTemplate2);
                fileOutputStream2.close();
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw new RuntimeException(th);
            }
            throw new RuntimeException(cause);
        }
    }

    public final native byte[] decryptTemplate(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    public final native byte[] decryptTemplatev3(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    public final byte[] decryptTemplatev3(byte[] bArr, String str) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            try {
                if (objArr2 != null) {
                    long j2 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                    if (j2 > j) {
                        objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                        int c = a.c((~(startElapsedRealtime | (-721917977))) | (~((~startElapsedRealtime) | (-223028697))), 333, (((~((-721917977) | 0)) | (~(startElapsedRealtime | (-223028697)))) * 333) - 635739889, -1930179136);
                        int i = c ^ (c << 13);
                        int i2 = i ^ (i >>> 17);
                        ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                        ((long[]) objArr[0])[0] = j + 4986;
                        Fpnative.valueOf = objArr;
                        return decryptTemplatev3(this.nativeAddres, bArr, str.getBytes(), this.appSignature.getBytes(), this.values.getBytes());
                    }
                }
                return decryptTemplatev3(this.nativeAddres, bArr, str.getBytes(), this.appSignature.getBytes(), this.values.getBytes());
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    public final native byte[] decryptTemplatev4(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, boolean z);

    public final byte[] decryptTemplatev4(byte[] bArr, String str, boolean z) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            try {
                if (objArr2 != null) {
                    long j2 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                    if (j2 > j) {
                        objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                        int i = ~((int) Runtime.getRuntime().totalMemory());
                        int c = a.c((~(i | (-134285585))) | (-784728017), 241, (((~((-708951441) | i)) | 574665856) * (-241)) + 1695298176, -729129890);
                        int i2 = c ^ (c << 13);
                        int i3 = i2 ^ (i2 >>> 17);
                        ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                        ((long[]) objArr[0])[0] = j + 4871;
                        Fpnative.valueOf = objArr;
                        return decryptTemplatev4(this.nativeAddres, bArr, str.getBytes(), this.appSignature.getBytes(), this.values.getBytes(), z);
                    }
                }
                return decryptTemplatev4(this.nativeAddres, bArr, str.getBytes(), this.appSignature.getBytes(), this.values.getBytes(), z);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    public final void destroy() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i = ~identityHashCode;
                    int c = a.c((~(identityHashCode | 340161721)) | 268592313 | (~((-340161722) | i)), 988, (((~(839051001 | i)) | (-910620410)) * (-1976)) + (((identityHashCode | 268592313) * 988) - 680844689), 543598441);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4932;
                    Fpnative.valueOf = objArr;
                    freeLManager(this.nativeAddres);
                }
            }
            byte b = $$d[113];
            Object[] objArr3 = new Object[1];
            a(b, (byte) (b | 88), $$a[111], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a($$a[63], $$a[117], $$a[55], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 543598441);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4932;
            Fpnative.valueOf = objArr;
            freeLManager(this.nativeAddres);
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00d6  */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void doECallback() {
        Object[] objArr;
        long j;
        PngjBadCrcException pngjBadCrcException;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int freeMemory = (int) Runtime.getRuntime().freeMemory();
                    int c = a.c((~(freeMemory | 781305075)) | (-1044682305), 70, ((~((-272896513) | freeMemory)) * 70) + (((~((-282415796) | freeMemory)) | 9519283) * (-140)) + 1944906217, 835722772);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4887;
                    Fpnative.valueOf = objArr;
                    pngjBadCrcException = this.PngjPrematureEnding;
                    if (pngjBadCrcException == null) {
                        int i3 = ((int[]) objArr[1])[0];
                        int i4 = i3 * i3;
                        int i5 = -(638277455 * i3);
                        int i6 = (i4 & i5) + (i4 | i5);
                        int i7 = -(i3 * (-1264631343));
                        int i8 = (i6 & i7) + (i7 | i6);
                        int i9 = (i8 & (-1903832832)) + ((-1903832832) | i8);
                        int i10 = i9 >> 28;
                        int i11 = (((i10 | (-31)) << 1) - (i10 ^ (-31))) / 16;
                        int i12 = (i9 - (~((i11 ^ 1) + ((i11 & 1) << 1)))) - 1;
                        int i13 = i9 >> 26;
                        int i14 = ((i13 ^ (-127)) + ((i13 & (-127)) << 1)) / 64;
                        int i15 = -(i12 ^ ((i14 ^ 1) + ((i14 & 1) << 1)));
                        int i16 = (i15 & 6) + (i15 | 6);
                        int i17 = i16 >> 24;
                        int i18 = ((i17 ^ (-511)) + ((i17 & (-511)) << 1)) / 256;
                        int i19 = (i18 & 1) + (i18 | 1);
                        pngjBadCrcException.PngjBadCrcException(false);
                        this.PngjPrematureEnding = null;
                        return;
                    }
                    return;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            a(bArr[113], bArr[3], (byte) (-bArr[1]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr[63];
            Object[] objArr4 = new Object[1];
            a(b, b, bArr[53], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 835722772);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4887;
            Fpnative.valueOf = objArr;
            pngjBadCrcException = this.PngjPrematureEnding;
            if (pngjBadCrcException == null) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void doSCallback() {
        Object[] objArr;
        long j;
        PngjBadCrcException pngjBadCrcException;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i = ((identityHashCode | 801180319) * (-50)) - 162117619;
                    int i2 = ~((-767623809) | identityHashCode);
                    int i3 = ~identityHashCode;
                    int c = a.c((~(i3 | 801180319)) | (~(302291039 | i3)) | (-1069914848), 50, ((i2 | (~(1069914847 | i3))) * 50) + i, 1240999738);
                    int i4 = c ^ (c << 13);
                    int i5 = i4 ^ (i4 >>> 17);
                    ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                    ((long[]) objArr[0])[0] = j + 5031;
                    Fpnative.valueOf = objArr;
                    pngjBadCrcException = this.PngjPrematureEnding;
                    if (pngjBadCrcException == null) {
                        int i6 = this.valueOf;
                        int i7 = ((int[]) objArr[1])[0];
                        int i8 = ((i7 * i7) - (~(-(1149120385 * i7)))) - 1;
                        int i9 = -(i7 * (-1958143001));
                        int i10 = (i8 & i9) + (i9 | i8);
                        int i11 = ((i10 | 544835216) << 1) - (544835216 ^ i10);
                        int i12 = i11 >> 27;
                        int i13 = ((i12 & (-63)) + (i12 | (-63))) / 32;
                        int i14 = (i13 ^ 1) + ((i13 & 1) << 1);
                        int i15 = ((i11 | i14) << 1) - (i14 ^ i11);
                        int i16 = ((i11 >> 17) - 65535) / 32768;
                        int i17 = -(i15 ^ (((i16 | 1) << 1) - (i16 ^ 1)));
                        int i18 = (i17 ^ 5) + ((i17 & 5) << 1);
                        int i19 = i18 >> 29;
                        if (i6 != 28650 / (((-IdentyB.a(i19 ^ (-15), (i19 & (-15)) << 1, 8, -2)) & i18) * 573)) {
                            pngjBadCrcException.PngjBadCrcException(true);
                            return;
                        } else {
                            pngjBadCrcException.values(this);
                            this.PngjPrematureEnding = null;
                            return;
                        }
                    }
                    return;
                }
            }
            byte b = $$d[113];
            Object[] objArr3 = new Object[1];
            a(b, (byte) (b | 88), $$a[111], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a($$a[63], $$a[117], $$a[55], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1240999738);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5031;
            Fpnative.valueOf = objArr;
            pngjBadCrcException = this.PngjPrematureEnding;
            if (pngjBadCrcException == null) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|1|(2:3|(11:5|6|(3:8|(1:10)(1:85)|11)(1:86)|12|(5:75|76|77|(1:79)|80)(2:18|(6:74|25|(6:27|(1:29)|30|(5:32|33|34|(13:36|37|(1:39)(1:61)|40|41|(1:43)(1:55)|44|(1:46)(1:54)|47|(1:49)|50|51|52)(2:62|63)|53)|67|68)(1:73)|69|70|71))|24|25|(0)(0)|69|70|71))|87|88|89|6|(0)(0)|12|(1:14)|75|76|77|(0)|80|24|25|(0)(0)|69|70|71) */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x018a, code lost:
    
        0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0190, code lost:
    
        0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0179 A[Catch: Exception -> 0x018a, TryCatch #1 {Exception -> 0x018a, blocks: (B:77:0x0171, B:79:0x0179, B:80:0x018c), top: B:76:0x0171 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void doServerCheck(long j, String str) {
        Object[] objArr;
        long j2;
        String obj;
        KeyPair PngjBadCrcException;
        boolean z = false;
        KeyPair keyPair;
        String[] transactions;
        StringBuilder sb = null;
        StringBuilder sb2 = null;
        char c;
        String str2;
        Object[] objArr2 = Fpnative.valueOf;
        char c2 = 3;
        KeyPair keyPair2 = null;
        try {
            if (objArr2 != null) {
                long j3 = ((long[]) objArr2[0])[0];
                j2 = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j3 > j2) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int uptimeMillis = (int) SystemClock.uptimeMillis();
                    int i = ~uptimeMillis;
                    int c3 = a.c((~(uptimeMillis | 382557411)) | 2228508 | (~(i | (-268454052))), 369, (((~((-382557412) | i)) | 116331868) * (-369)) + (((384785919 | i) * (-369)) - 94560498), -1162386314);
                    int i2 = c3 ^ (c3 << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j2 + 5038;
                    Fpnative.valueOf = objArr;
                    StringBuilder sb3 = new StringBuilder("identy_");
                    sb3.append(this.PngjBadCrcException);
                    sb3.append("_");
                    sb3.append(this.PngjInputException.replace(".", "_"));
                    obj = sb3.toString();
                    PngjBadCrcException = com.identy.app.PngjException.PngjBadCrcException(obj);
                    if (PngjBadCrcException == null) {
                        z = !(Math.abs(Calendar.getInstance().getTime().getTime() - com.identy.app.PngjException.PngjException(obj).getTime()) > 1296000000);
                    } else {
                        z = false;
                    }
                    if (z || this.PngjUnsupportedException || this.valueOf != 10) {
                        keyPair2 = com.identy.app.PngjException.PngjBadSignature(obj, this.PngjBadSignature);
                        File PngjBadSignature = com.identy.app.PngjBadSignature.PngjBadSignature(this.PngjBadSignature, "IDENTY_ASSETS/FIN");
                        if (this.PngjBadCrcException.equals("finger")) {
                            com.identy.app.PngjBadSignature.values(new File(PngjBadSignature, "data1.footer"));
                            com.identy.app.PngjBadSignature.values(new File(PngjBadSignature, "data1.footer"));
                        }
                        com.identy.app.PngjBadSignature.PngjException(PngjBadSignature);
                    } else {
                        File PngjBadSignature2 = com.identy.app.PngjBadSignature.PngjBadSignature(this.PngjBadSignature, "IDENTY_ASSETS/FIN");
                        if (!this.PngjBadCrcException.equals("finger") || !new File(PngjBadSignature2, "data1.footer").exists() || new File(PngjBadSignature2, "data1.footer").length() <= 0) {
                            keyPair = PngjBadCrcException;
                            transactions = getTransactions(j, this.PngjBadCrcException.getBytes());
                            StringBuilder sb4 = new StringBuilder("LVERIFY");
                            StringBuilder sb5 = new StringBuilder(String.valueOf(Calendar.getInstance().getTimeInMillis()));
                            StringBuilder sb6 = new StringBuilder();
                            if (transactions != null) {
                                if (transactions.length > 0) {
                                    sb4 = new StringBuilder();
                                    sb5 = new StringBuilder();
                                }
                                StringBuilder sb7 = sb5;
                                StringBuilder sb8 = sb4;
                                int length = transactions.length;
                                int i4 = 0;
                                while (i4 < length) {
                                    String str3 = transactions[i4];
                                    try {
                                        if (str3.trim().isEmpty()) {
                                            c = c2;
                                        } else {
                                            String[] split = str3.split(",");
                                            int length2 = sb8.length();
                                            String str4 = BuildConfig.FLAVOR;
                                            if (length2 > 0) {
                                                c = c2;
                                                str2 = ",";
                                            } else {
                                                c = c2;
                                                str2 = BuildConfig.FLAVOR;
                                            }
                                            try {
                                                sb8.append(str2);
                                                sb8.append(split[0]);
                                                sb7.append(sb7.length() > 0 ? "," : BuildConfig.FLAVOR);
                                                sb7.append(split[1]);
                                                sb6.append(sb6.length() > 0 ? "," : BuildConfig.FLAVOR);
                                                if (split.length > 2) {
                                                    str4 = split[2];
                                                }
                                                sb6.append(str4);
                                            } catch (Exception e) {
                                                e = e;
                                                e.printStackTrace();
                                                i4++;
                                                c2 = c;
                                            }
                                        }
                                    } catch (Exception e2) {
                                        // e = e2;
                                        c = c2;
                                    }
                                    i4++;
                                    c2 = c;
                                }
                                sb = sb8;
                                sb2 = sb7;
                            } else {
                                sb = sb4;
                                sb2 = sb5;
                            }
                            long timeInMillis = Calendar.getInstance().getTimeInMillis();
                            int i5 = ((int[]) objArr[1])[0];
                            int i6 = i5 * i5;
                            int i7 = -(703493508 * i5);
                            int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
                            int i9 = -(i5 * (-1038794614));
                            int i10 = (i8 & i9) + (i9 | i8);
                            int i11 = (i10 ^ (-445449679)) + (((-445449679) & i10) << 1);
                            int i12 = i11 >> 15;
                            int i13 = (((i12 | (-262143)) << 1) - (i12 ^ (-262143))) / 131072;
                            int i14 = (i13 & 1) + (i13 | 1);
                            int i15 = (i11 & i14) + (i14 | i11);
                            int i16 = ((i11 >> 23) - 1023) / ConstantsKt.MINIMUM_BLOCK_SIZE;
                            int i17 = -(i15 ^ ((i16 & 1) + (i16 | 1)));
                            int i18 = ((i17 ^ 3) + ((i17 & 3) << 1)) >> 22;
                            int i19 = ((i18 ^ (-2047)) + ((i18 & (-2047)) << 1)) / 1024;
                            int i20 = (i19 & 1) + (i19 | 1);
                            String valueOf2 = String.valueOf(timeInMillis / ((1570752 / (((-((i20 ^ 1) + ((i20 & 1) << 1))) & 0) * 808)) + 352));
                            String requestData = getRequestData(j, sb.toString().getBytes(), sb2.toString().getBytes(), this.appSignature.getBytes(), Build.MANUFACTURER.getBytes(), Build.MODEL.getBytes(), this.PngjInputException.getBytes(), this.PngjBadSignature.getApplicationContext().getPackageName().getBytes(), this.values.getBytes(), valueOf2.getBytes(), this.PngjBadCrcException.getBytes());
                            PngjPrematureEnding pngjPrematureEnding = new PngjPrematureEnding();
                            Activity activity = this.PngjBadSignature;
                            pngjPrematureEnding.PngjBadCrcException(activity, activity.getApplicationContext().getPackageName(), this.PngjException, this.appSignature, this.PngjOutputException, new valueOf(valueOf2, str), this.values, requestData, sb, sb2, valueOf2, this.PngjBadCrcException, this.PngjInputException, keyPair, sb6.toString(), this.valueOf);
                        }
                    }
                    keyPair = keyPair2;
                    transactions = getTransactions(j, this.PngjBadCrcException.getBytes());
                    StringBuilder sb42 = new StringBuilder("LVERIFY");
                    StringBuilder sb52 = new StringBuilder(String.valueOf(Calendar.getInstance().getTimeInMillis()));
                    StringBuilder sb62 = new StringBuilder();
                    if (transactions != null) {
                    }
                    long timeInMillis2 = Calendar.getInstance().getTimeInMillis();
                    int i52 = ((int[]) objArr[1])[0];
                    int i62 = i52 * i52;
                    int i72 = -(703493508 * i52);
                    int i82 = ((i62 | i72) << 1) - (i62 ^ i72);
                    int i92 = -(i52 * (-1038794614));
                    int i102 = (i82 & i92) + (i92 | i82);
                    int i112 = (i102 ^ (-445449679)) + (((-445449679) & i102) << 1);
                    int i122 = i112 >> 15;
                    int i132 = (((i122 | (-262143)) << 1) - (i122 ^ (-262143))) / 131072;
                    int i142 = (i132 & 1) + (i132 | 1);
                    int i152 = (i112 & i142) + (i142 | i112);
                    int i162 = ((i112 >> 23) - 1023) / ConstantsKt.MINIMUM_BLOCK_SIZE;
                    int i172 = -(i152 ^ ((i162 & 1) + (i162 | 1)));
                    int i182 = ((i172 ^ 3) + ((i172 & 3) << 1)) >> 22;
                    int i192 = ((i182 ^ (-2047)) + ((i182 & (-2047)) << 1)) / 1024;
                    int i202 = (i192 & 1) + (i192 | 1);
                    String valueOf22 = String.valueOf(timeInMillis2 / ((1570752 / (((-((i202 ^ 1) + ((i202 & 1) << 1))) & 0) * 808)) + 352));
                    String requestData2 = getRequestData(j, sb.toString().getBytes(), sb2.toString().getBytes(), this.appSignature.getBytes(), Build.MANUFACTURER.getBytes(), Build.MODEL.getBytes(), this.PngjInputException.getBytes(), this.PngjBadSignature.getApplicationContext().getPackageName().getBytes(), this.values.getBytes(), valueOf22.getBytes(), this.PngjBadCrcException.getBytes());
                    PngjPrematureEnding pngjPrematureEnding2 = new PngjPrematureEnding();
                    Activity activity2 = this.PngjBadSignature;
                    pngjPrematureEnding2.PngjBadCrcException(activity2, activity2.getApplicationContext().getPackageName(), this.PngjException, this.appSignature, this.PngjOutputException, new valueOf(valueOf22, str), this.values, requestData2, sb, sb2, valueOf22, this.PngjBadCrcException, this.PngjInputException, keyPair, sb62.toString(), this.valueOf);
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            a(bArr[113], bArr[3], (byte) (-bArr[1]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr[63];
            Object[] objArr4 = new Object[1];
            a(b, b, bArr[53], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1162386314);
            j2 = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j2 + 5038;
            Fpnative.valueOf = objArr;
            StringBuilder sb32 = new StringBuilder("identy_");
            sb32.append(this.PngjBadCrcException);
            sb32.append("_");
            sb32.append(this.PngjInputException.replace(".", "_"));
            obj = sb32.toString();
            PngjBadCrcException = com.identy.app.PngjException.PngjBadCrcException(obj);
            if (PngjBadCrcException == null) {
            }
            if (z) {
            }
            keyPair2 = com.identy.app.PngjException.PngjBadSignature(obj, this.PngjBadSignature);
            File PngjBadSignature3 = com.identy.app.PngjBadSignature.PngjBadSignature(this.PngjBadSignature, "IDENTY_ASSETS/FIN");
            if (this.PngjBadCrcException.equals("finger")) {
            }
            com.identy.app.PngjBadSignature.PngjException(PngjBadSignature3);
            keyPair = keyPair2;
            transactions = getTransactions(j, this.PngjBadCrcException.getBytes());
            StringBuilder sb422 = new StringBuilder("LVERIFY");
            StringBuilder sb522 = new StringBuilder(String.valueOf(Calendar.getInstance().getTimeInMillis()));
            StringBuilder sb622 = new StringBuilder();
            if (transactions != null) {
            }
            long timeInMillis22 = Calendar.getInstance().getTimeInMillis();
            int i522 = ((int[]) objArr[1])[0];
            int i622 = i522 * i522;
            int i722 = -(703493508 * i522);
            int i822 = ((i622 | i722) << 1) - (i622 ^ i722);
            int i922 = -(i522 * (-1038794614));
            int i1022 = (i822 & i922) + (i922 | i822);
            int i1122 = (i1022 ^ (-445449679)) + (((-445449679) & i1022) << 1);
            int i1222 = i1122 >> 15;
            int i1322 = (((i1222 | (-262143)) << 1) - (i1222 ^ (-262143))) / 131072;
            int i1422 = (i1322 & 1) + (i1322 | 1);
            int i1522 = (i1122 & i1422) + (i1422 | i1122);
            int i1622 = ((i1122 >> 23) - 1023) / ConstantsKt.MINIMUM_BLOCK_SIZE;
            int i1722 = -(i1522 ^ ((i1622 & 1) + (i1622 | 1)));
            int i1822 = ((i1722 ^ 3) + ((i1722 & 3) << 1)) >> 22;
            int i1922 = ((i1822 ^ (-2047)) + ((i1822 & (-2047)) << 1)) / 1024;
            int i2022 = (i1922 & 1) + (i1922 | 1);
            String valueOf222 = String.valueOf(timeInMillis22 / ((1570752 / (((-((i2022 ^ 1) + ((i2022 & 1) << 1))) & 0) * 808)) + 352));
            String requestData22 = getRequestData(j, sb.toString().getBytes(), sb2.toString().getBytes(), this.appSignature.getBytes(), Build.MANUFACTURER.getBytes(), Build.MODEL.getBytes(), this.PngjInputException.getBytes(), this.PngjBadSignature.getApplicationContext().getPackageName().getBytes(), this.values.getBytes(), valueOf222.getBytes(), this.PngjBadCrcException.getBytes());
            PngjPrematureEnding pngjPrematureEnding22 = new PngjPrematureEnding();
            Activity activity22 = this.PngjBadSignature;
            pngjPrematureEnding22.PngjBadCrcException(activity22, activity22.getApplicationContext().getPackageName(), this.PngjException, this.appSignature, this.PngjOutputException, new valueOf(valueOf222, str), this.values, requestData22, sb, sb2, valueOf222, this.PngjBadCrcException, this.PngjInputException, keyPair, sb622.toString(), this.valueOf);
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x014c A[Catch: Exception -> 0x0195, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0195, blocks: (B:8:0x00cf, B:11:0x014c, B:14:0x0182, B:15:0x021f, B:20:0x0199, B:22:0x019f, B:23:0x01a0, B:27:0x01d5, B:30:0x0225, B:32:0x022b, B:33:0x022c, B:25:0x01a1, B:13:0x0150), top: B:7:0x00cf, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] encryptAES2(byte[] bArr, Key key, String str) {
        Object[] objArr = null;
        long j;
        int i;
        int i2;
        int i3;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            try {
                if (objArr2 != null) {
                    long j2 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                    if (j2 > j) {
                        objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                        int identityHashCode = System.identityHashCode(this);
                        int c = a.c((~(identityHashCode | (-649969842))) | 150998592, 433, (((~(151080561 | identityHashCode)) | (-649969842)) * (-433)) + ((~((~identityHashCode) | (-81970))) * 433) + 1536415756, 1090412018);
                        int i4 = c ^ (c << 13);
                        int i5 = i4 ^ (i4 >>> 17);
                        ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                        ((long[]) objArr[0])[0] = j + 5024;
                        Fpnative.valueOf = objArr;
                        Calendar.getInstance().getTimeInMillis();
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        i = Build.VERSION.SDK_INT;
                        int i6 = ((int[]) objArr[1])[0];
                        int i7 = i6 * i6;
                        int i8 = -(1674195949 * i6);
                        int i9 = (((i7 ^ i8) + ((i7 & i8) << 1)) - (~(-(i6 * (-1032107215))))) - 1;
                        int i10 = ((i9 | (-1420643871)) << 1) - ((-1420643871) ^ i9);
                        int i11 = i10 >> 17;
                        int i12 = ((i11 ^ (-65535)) + ((i11 & (-65535)) << 1)) / 32768;
                        int i13 = (i10 - (~((i12 & 1) + (i12 | 1)))) - 1;
                        int i14 = i10 >> 22;
                        int i15 = ((i14 ^ (-2047)) + ((i14 & (-2047)) << 1)) / 1024;
                        int i16 = -(i13 ^ ((i15 ^ 1) + ((i15 & 1) << 1)));
                        i2 = (i16 & 7) + (i16 | 7);
                        int i17 = i2 >> 22;
                        int i18 = (((i17 | (-2047)) << 1) - (i17 ^ (-2047))) / 1024;
                        i3 = ((i18 | 1) << 1) - (i18 ^ 1);
                        if (i < 151018 / (((-(((i3 | 1) << 1) - (i3 ^ 1))) & i2) * 938)) {
                            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                            try {
                                Object[] objArr3 = new Object[1];
                                c(Color.alpha(0) + 26, true, "ￊ�\u0012�\u0006\t\u000b\u0000\n�￮\u0001\u000e\u0011\uffff\u0001\uffefￊ\u0015\u0010\u0005\u000e\u0011\uffff\u0001\u000f", 5 - (ViewConfiguration.getEdgeSlop() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 141, objArr3);
                                cipher.init(1, key, (SecureRandom) Class.forName((String) objArr3[0]).getDeclaredConstructor(null).newInstance(null));
                                byteArrayOutputStream.write(cipher.getIV());
                                byteArrayOutputStream.write(cipher.doFinal(bArr));
                                return byteArrayOutputStream.toByteArray();
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause != null) {
                                    throw new RuntimeException(cause);
                                }
                                throw new RuntimeException(th);
                            }
                        }
                        try {
                            Object[] objArr4 = new Object[1];
                            c((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 26, true, "ￊ�\u0012�\u0006\t\u000b\u0000\n�￮\u0001\u000e\u0011\uffff\u0001\uffefￊ\u0015\u0010\u0005\u000e\u0011\uffff\u0001\u000f", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 5, 142 - View.MeasureSpec.getMode(0), objArr4);
                            byte[] bArr2 = new byte[12];
                            ((Random) Class.forName((String) objArr4[0]).getDeclaredConstructor(null).newInstance(null)).nextBytes(bArr2);
                            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr2);
                            Cipher cipher2 = Cipher.getInstance("AES/GCM/NoPadding");
                            Key secureRandomKey = getSecureRandomKey();
                            cipher2.init(1, secureRandomKey, gCMParameterSpec);
                            byte[] doFinal = cipher2.doFinal(bArr);
                            byte[] encoded = secureRandomKey.getEncoded();
                            Cipher cipher3 = Cipher.getInstance(str);
                            cipher3.init(1, key);
                            byte[] doFinal2 = cipher3.doFinal(encoded);
                            ByteBuffer allocate = ByteBuffer.allocate(doFinal2.length + 20 + doFinal.length);
                            allocate.putInt(doFinal2.length);
                            allocate.put(doFinal2);
                            allocate.putInt(12);
                            allocate.put(bArr2);
                            allocate.put(doFinal);
                            byteArrayOutputStream.write(allocate.array());
                            return byteArrayOutputStream.toByteArray();
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 != null) {
                                throw new RuntimeException(cause2);
                            }
                            throw new RuntimeException(th2);
                        }
                    }
                }
                Calendar.getInstance().getTimeInMillis();
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                i = Build.VERSION.SDK_INT;
                int i62 = ((int[]) objArr[1])[0];
                int i72 = i62 * i62;
                int i82 = -(1674195949 * i62);
                int i92 = (((i72 ^ i82) + ((i72 & i82) << 1)) - (~(-(i62 * (-1032107215))))) - 1;
                int i102 = ((i92 | (-1420643871)) << 1) - ((-1420643871) ^ i92);
                int i112 = i102 >> 17;
                int i122 = ((i112 ^ (-65535)) + ((i112 & (-65535)) << 1)) / 32768;
                int i132 = (i102 - (~((i122 & 1) + (i122 | 1)))) - 1;
                int i142 = i102 >> 22;
                int i152 = ((i142 ^ (-2047)) + ((i142 & (-2047)) << 1)) / 1024;
                int i162 = -(i132 ^ ((i152 ^ 1) + ((i152 & 1) << 1)));
                i2 = (i162 & 7) + (i162 | 7);
                int i172 = i2 >> 22;
                int i182 = (((i172 | (-2047)) << 1) - (i172 ^ (-2047))) / 1024;
                i3 = ((i182 | 1) << 1) - (i182 ^ 1);
                if (i < 151018 / (((-(((i3 | 1) << 1) - (i3 ^ 1))) & i2) * 938)) {
                }
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 != null) {
                throw new RuntimeException(cause3);
            }
            throw new RuntimeException(th3);
        }
        return null;
    }

    public final void encryptTemplate(String str, String str2) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            try {
                if (objArr2 != null) {
                    long j2 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                    if (j2 > j) {
                        objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                        int i = ~((int) Process.getStartElapsedRealtime());
                        int c = a.c((~(826234487 | i)) | (-582857281), 764, (((~(i | (-327345208))) | 285361207) * (-1528)) + (((0 | (-327345208)) * 764) - 1945850973), 1874909962);
                        int i2 = c ^ (c << 13);
                        int i3 = i2 ^ (i2 >>> 17);
                        ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                        ((long[]) objArr[0])[0] = j + 4922;
                        Fpnative.valueOf = objArr;
                        Calendar.getInstance().getTimeInMillis();
                        File file = new File(str);
                        byte[] bArr = new byte[(int) file.length()];
                        FileInputStream fileInputStream = new FileInputStream(file);
                        fileInputStream.read(bArr);
                        fileInputStream.close();
                        byte[] encrytTemplate = encrytTemplate(this.nativeAddres, bArr, str2.getBytes());
                        FileOutputStream fileOutputStream = new FileOutputStream(str2);
                        fileOutputStream.write(encrytTemplate);
                        fileOutputStream.close();
                        return;
                    }
                }
                File file2 = new File(str);
                byte[] bArr2 = new byte[(int) file2.length()];
                FileInputStream fileInputStream2 = new FileInputStream(file2);
                fileInputStream2.read(bArr2);
                fileInputStream2.close();
                byte[] encrytTemplate2 = encrytTemplate(this.nativeAddres, bArr2, str2.getBytes());
                FileOutputStream fileOutputStream2 = new FileOutputStream(str2);
                fileOutputStream2.write(encrytTemplate2);
                fileOutputStream2.close();
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw new RuntimeException(th);
            }
            throw new RuntimeException(cause);
        }
    }

    public final void encryptTemplatev2(byte[] bArr, String str) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            try {
                if (objArr2 != null) {
                    long j2 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                    if (j2 > j) {
                        objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                        int i = ~System.identityHashCode(this);
                        int c = a.c((~(i | (-267890937))) | 36909240, 52, (((~(267890936 | i)) | (~((-230998344) | i)) | 16647) * (-52)) + (((~(267907583 | i)) * 52) - 1419525557), 1518827033);
                        int i2 = c ^ (c << 13);
                        int i3 = i2 ^ (i2 >>> 17);
                        ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                        ((long[]) objArr[0])[0] = j + 4910;
                        Fpnative.valueOf = objArr;
                        Calendar.getInstance().getTimeInMillis();
                        byte[] encrytTemplate = encrytTemplate(this.nativeAddres, bArr, str.getBytes());
                        FileOutputStream fileOutputStream = new FileOutputStream(str);
                        fileOutputStream.write(encrytTemplate);
                        fileOutputStream.close();
                        return;
                    }
                }
                byte[] encrytTemplate2 = encrytTemplate(this.nativeAddres, bArr, str.getBytes());
                FileOutputStream fileOutputStream2 = new FileOutputStream(str);
                fileOutputStream2.write(encrytTemplate2);
                fileOutputStream2.close();
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw new RuntimeException(th);
            }
            throw new RuntimeException(cause);
        }
    }

    public final native byte[] encrytTemplate(long j, byte[] bArr, byte[] bArr2);

    public final native void freeLManager(long j);

    public final Key generateEncryptKey(String str) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i = ~identityHashCode;
                    int c = a.c((~(identityHashCode | 398179839)) | (~((-370324596) | i)) | 100709440, 676, (((~(128564684 | i)) | 269615155) * 676) + (((-269615156) | identityHashCode) * (-676)) + 277946691, 1208687703);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 5046;
                    Fpnative.valueOf = objArr;
                    return com.identy.app.PngjException.PngjException(str, this.PngjBadSignature);
                }
            }
            byte b = $$d[113];
            Object[] objArr3 = new Object[1];
            a(b, (byte) (b | 88), $$a[111], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a($$a[63], $$a[117], $$a[55], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1208687703);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5046;
            Fpnative.valueOf = objArr;
            return com.identy.app.PngjException.PngjException(str, this.PngjBadSignature);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    public final PrivateKey generateSignKey(String str) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = a.c((~((~((int) SystemClock.elapsedRealtime())) | 505226933)) | (-633650753), 262, (((~(505226933 | 0)) | (-633650753)) * 262) - 514454069, 1629380421);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 5002;
                    Fpnative.valueOf = objArr;
                    return com.identy.app.PngjException.valueOf(str, this.PngjBadSignature).getPrivate();
                }
            }
            byte[] bArr = $$d;
            byte b = bArr[113];
            Object[] objArr3 = new Object[1];
            a(b, (byte) (b | 124), bArr[62], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b2 = bArr[32];
            Object[] objArr4 = new Object[1];
            a(b2, (byte) (b2 | 92), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1629380421);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5002;
            Fpnative.valueOf = objArr;
            return com.identy.app.PngjException.valueOf(str, this.PngjBadSignature).getPrivate();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|1|(2:3|(16:5|6|7|8|9|10|11|12|13|15|16|(7:19|(1:21)|(1:23)|24|(2:26|27)(1:29)|28|17)|30|31|32|33))|50|51|52|6|7|8|9|10|11|12|13|15|16|(1:17)|30|31|32|33) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x012c, code lost:
    
        0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0152, code lost:
    
        0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x012a, code lost:
    
        0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x014e, code lost:
    
        0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f9, code lost:
    
        0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fa, code lost:
    
        0.printStackTrace();
        0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ed, code lost:
    
        0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ee, code lost:
    
        0.printStackTrace();
        0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d4, code lost:
    
        0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d5, code lost:
    
        0.printStackTrace();
        0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0117 A[Catch: CertificateEncodingException -> 0x012a, NoSuchAlgorithmException -> 0x012c, TryCatch #6 {NoSuchAlgorithmException -> 0x012c, CertificateEncodingException -> 0x012a, blocks: (B:16:0x00fe, B:17:0x0114, B:19:0x0117, B:21:0x0123, B:23:0x0130, B:24:0x0136, B:26:0x0141, B:28:0x0146, B:31:0x0149), top: B:15:0x00fe }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getCertificateSHA1Fingerprint() {
        Object[] objArr;
        long j;
        byte[] digest;
        int i = 0;
        Object[] objArr2 = Fpnative.valueOf;
        String str = null;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = a.c((~((~System.identityHashCode(this)) | 233552548)) | (-37424448), 184, (((-34604316) | 0) * 184) - 1204946697, 1722441282);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 5043;
                    Fpnative.valueOf = objArr;
                    PackageInfo packageInfo = this.PngjBadSignature.getPackageManager().getPackageInfo(this.PngjBadSignature.getPackageName(), 64);
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(packageInfo.signatures[0].toByteArray());
                    CertificateFactory certificateFactory = CertificateFactory.getInstance("X509");
                    X509Certificate x509Certificate = (X509Certificate) certificateFactory.generateCertificate(byteArrayInputStream);
                    digest = MessageDigest.getInstance("SHA1").digest(x509Certificate.getEncoded());
                    StringBuilder sb = new StringBuilder(digest.length << 1);
                    for (i = 0; i < digest.length; i++) {
                        String hexString = Integer.toHexString(digest[i]);
                        int length = hexString.length();
                        if (length == 1) {
                            hexString = "0".concat(hexString);
                        }
                        if (length > 2) {
                            hexString = hexString.substring(length - 2, length);
                        }
                        sb.append(hexString.toUpperCase());
                        if (i < digest.length - 1) {
                            sb.append(':');
                        }
                    }
                    str = sb.toString();
                    int i4 = ((int[]) objArr[1])[0];
                    int i5 = i4 * i4;
                    int i6 = -(712831115 * i4);
                    int i7 = (((i5 & i6) + (i5 | i6)) - (~(-(i4 * (-153263767))))) - 1;
                    int i8 = (i7 ^ (-1468853212)) + (((-1468853212) & i7) << 1);
                    int i9 = i8 >> 19;
                    int i10 = ((i9 ^ (-16383)) + ((i9 & (-16383)) << 1)) / ConstantsKt.DEFAULT_BUFFER_SIZE;
                    int i11 = (i10 & 1) + (i10 | 1);
                    int i12 = (i8 & i11) + (i11 | i8);
                    int i13 = i8 >> 18;
                    int i14 = -(IdentyB.a(i13 & (-32767), i13 | (-32767), 16384, -1) ^ i12);
                    int i15 = (i14 & 1) + (i14 | 1);
                    int i16 = ((i15 >> 17) - 65535) / 32768;
                    int i17 = (i16 & 1) + (i16 | 1);
                    return str.replace(IdentyB.c((-((i17 ^ 1) + ((i17 & 1) << 1))) & i15, 1945, 15560, "22/4/20/:"), BuildConfig.FLAVOR);
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            a(bArr[113], bArr[3], (byte) (-bArr[1]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr[63];
            Object[] objArr4 = new Object[1];
            a(b, b, bArr[53], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1722441282);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5043;
            Fpnative.valueOf = objArr;
            PackageInfo packageInfo2 = this.PngjBadSignature.getPackageManager().getPackageInfo(this.PngjBadSignature.getPackageName(), 64);
            ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(packageInfo2.signatures[0].toByteArray());
            CertificateFactory certificateFactory2 = CertificateFactory.getInstance("X509");
            X509Certificate x509Certificate2 = (X509Certificate) certificateFactory2.generateCertificate(byteArrayInputStream2);
            digest = MessageDigest.getInstance("SHA1").digest(x509Certificate2.getEncoded());
            StringBuilder sb2 = new StringBuilder(digest.length << 1);
            while (i < digest.length) {
            }
            str = sb2.toString();
            int i42 = ((int[]) objArr[1])[0];
            int i52 = i42 * i42;
            int i62 = -(712831115 * i42);
            int i72 = (((i52 & i62) + (i52 | i62)) - (~(-(i42 * (-153263767))))) - 1;
            int i82 = (i72 ^ (-1468853212)) + (((-1468853212) & i72) << 1);
            int i92 = i82 >> 19;
            int i102 = ((i92 ^ (-16383)) + ((i92 & (-16383)) << 1)) / ConstantsKt.DEFAULT_BUFFER_SIZE;
            int i112 = (i102 & 1) + (i102 | 1);
            int i122 = (i82 & i112) + (i112 | i82);
            int i132 = i82 >> 18;
            int i142 = -(IdentyB.a(i132 & (-32767), i132 | (-32767), 16384, -1) ^ i122);
            int i152 = (i142 & 1) + (i142 | 1);
            int i162 = ((i152 >> 17) - 65535) / 32768;
            int i172 = (i162 & 1) + (i162 | 1);
            return str.replace(IdentyB.c((-((i172 ^ 1) + ((i172 & 1) << 1))) & i152, 1945, 15560, "22/4/20/:"), BuildConfig.FLAVOR);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    public final Key getDecryptKey(String str) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i = ~identityHashCode;
                    int i2 = (((((~((-506585944) | i)) | 503349824) | (~(7696663 | i))) | (~((-4460545) | identityHashCode))) * (-84)) - 544084245;
                    int i3 = (~(identityHashCode | 7696663)) | 506585943;
                    int i4 = ~(i | (-7696664));
                    int c = a.c(i4 | 4460544, 84, ((i3 | i4) * (-84)) + i2, -1418530903);
                    int i5 = c ^ (c << 13);
                    int i6 = i5 ^ (i5 >>> 17);
                    ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
                    ((long[]) objArr[0])[0] = j + 5000;
                    Fpnative.valueOf = objArr;
                    return com.identy.app.PngjException.values(str);
                }
            }
            byte[] bArr = $$d;
            byte b = bArr[113];
            Object[] objArr3 = new Object[1];
            a(b, (byte) (b | 124), bArr[62], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b2 = bArr[32];
            Object[] objArr4 = new Object[1];
            a(b2, (byte) (b2 | 92), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1418530903);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5000;
            Fpnative.valueOf = objArr;
            return com.identy.app.PngjException.values(str);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    public final String getKeyValue(String str) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = a.c((~System.identityHashCode(this)) | 469496383, 756, (((~(469496383 | 0)) | 29392896) * (-756)) - 1506865101, 552683111);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4896;
                    Fpnative.valueOf = objArr;
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.PngjBadSignature);
                    int i3 = ((int[]) objArr[1])[0];
                    int i4 = i3 * i3;
                    int i5 = -(1866474450 * i3);
                    int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
                    int i7 = -(i3 * 234701474);
                    int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
                    int i9 = (i8 & (-787338972)) + ((-787338972) | i8);
                    int i10 = i9 >> 24;
                    int i11 = ((i10 & (-511)) + (i10 | (-511))) / 256;
                    int i12 = ((i11 | 1) << 1) - (i11 ^ 1);
                    int i13 = (i9 ^ i12) + ((i12 & i9) << 1);
                    int i14 = i9 >> 29;
                    int i15 = -(IdentyB.e((i14 | (-15)) << 1, i14 ^ (-15), 8, -1) ^ i13);
                    int i16 = (i15 ^ 3) + ((i15 & 3) << 1);
                    int i17 = i16 >> 17;
                    int i18 = ((i17 ^ (-65535)) + ((i17 & (-65535)) << 1)) / 32768;
                    return defaultSharedPreferences.getString(str, IdentyB.c((-(((i18 & 1) + (i18 | 1)) - (-1))) & i16, 1224, 18360, "2|14|"));
                }
            }
            byte b = $$d[113];
            Object[] objArr3 = new Object[1];
            a(b, (byte) (b | 88), $$a[111], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a($$a[63], $$a[117], $$a[55], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 552683111);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4896;
            Fpnative.valueOf = objArr;
            SharedPreferences defaultSharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(this.PngjBadSignature);
            int i32 = ((int[]) objArr[1])[0];
            int i42 = i32 * i32;
            int i52 = -(1866474450 * i32);
            int i62 = (i42 ^ i52) + ((i42 & i52) << 1);
            int i72 = -(i32 * 234701474);
            int i82 = ((i62 | i72) << 1) - (i72 ^ i62);
            int i92 = (i82 & (-787338972)) + ((-787338972) | i82);
            int i102 = i92 >> 24;
            int i112 = ((i102 & (-511)) + (i102 | (-511))) / 256;
            int i122 = ((i112 | 1) << 1) - (i112 ^ 1);
            int i132 = (i92 ^ i122) + ((i122 & i92) << 1);
            int i142 = i92 >> 29;
            int i152 = -(IdentyB.e((i142 | (-15)) << 1, i142 ^ (-15), 8, -1) ^ i132);
            int i162 = (i152 ^ 3) + ((i152 & 3) << 1);
            int i172 = i162 >> 17;
            int i182 = ((i172 ^ (-65535)) + ((i172 & (-65535)) << 1)) / 32768;
            return defaultSharedPreferences2.getString(str, IdentyB.c((-(((i182 & 1) + (i182 | 1)) - (-1))) & i162, 1224, 18360, "2|14|"));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    public final native String getRequestData(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, byte[] bArr9, byte[] bArr10);

    public final String getSecureStorage() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i = ~((int) SystemClock.uptimeMillis());
                    int c = a.c((~(i | (-226582691))) | 226517026, 52, (((~(226582690 | i)) | (~((-272306590) | i)) | 272240925) * (-52)) + (((~(498823615 | i)) * 52) - 1418435269), -453287128);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4927;
                    Fpnative.valueOf = objArr;
                    Activity activity = this.PngjBadSignature;
                    int i4 = ((int[]) objArr[1])[0];
                    int i5 = ((((i4 * i4) - (~(-(1109771911 * i4)))) - 1) - (~(-(i4 * (-1262550579))))) - 1;
                    int i6 = (i5 ^ (-1197943068)) + (((-1197943068) & i5) << 1);
                    int i7 = i6 >> 29;
                    int i8 = (((i7 | (-15)) << 1) - (i7 ^ (-15))) / 8;
                    int i9 = (i8 & 1) + (i8 | 1);
                    int i10 = (i7 - 15) / 8;
                    int i11 = -(((i6 ^ i9) + ((i6 & i9) << 1)) ^ ((i10 & 1) + (i10 | 1)));
                    int i12 = (i11 ^ 8) + ((i11 & 8) << 1);
                    int i13 = ((i12 >> 29) - 15) / 8;
                    int i14 = (i13 & 1) + (i13 | 1);
                    return com.identy.app.PngjBadSignature.PngjBadSignature(activity, "7|15|31|IDENTY".substring(89536 / (((-((i14 & 1) + (i14 | 1))) & i12) * 1399))).getAbsolutePath();
                }
            }
            byte[] bArr = $$d;
            byte b = bArr[113];
            Object[] objArr3 = new Object[1];
            a(b, (byte) (b | 124), bArr[62], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b2 = bArr[32];
            Object[] objArr4 = new Object[1];
            a(b2, (byte) (b2 | 92), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -453287128);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4927;
            Fpnative.valueOf = objArr;
            Activity activity2 = this.PngjBadSignature;
            int i42 = ((int[]) objArr[1])[0];
            int i52 = ((((i42 * i42) - (~(-(1109771911 * i42)))) - 1) - (~(-(i42 * (-1262550579))))) - 1;
            int i62 = (i52 ^ (-1197943068)) + (((-1197943068) & i52) << 1);
            int i72 = i62 >> 29;
            int i82 = (((i72 | (-15)) << 1) - (i72 ^ (-15))) / 8;
            int i92 = (i82 & 1) + (i82 | 1);
            int i102 = (i72 - 15) / 8;
            int i112 = -(((i62 ^ i92) + ((i62 & i92) << 1)) ^ ((i102 & 1) + (i102 | 1)));
            int i122 = (i112 ^ 8) + ((i112 & 8) << 1);
            int i132 = ((i122 >> 29) - 15) / 8;
            int i142 = (i132 & 1) + (i132 | 1);
            return com.identy.app.PngjBadSignature.PngjBadSignature(activity2, "7|15|31|IDENTY".substring(89536 / (((-((i142 & 1) + (i142 | 1))) & i122) * 1399))).getAbsolutePath();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    public final String getSecureStorageEx() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = a.c((~(identityHashCode | 769113841)) | (~((~identityHashCode) | (-701739250))) | 135475377, 168, ((~((-566263873) | identityHashCode)) * 168) + ((((~(202849969 | 0)) | 566263872) * 168) - 1710130969), 2094784876);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4967;
                    Fpnative.valueOf = objArr;
                    Activity activity = this.PngjBadSignature;
                    int i3 = ((int[]) objArr[1])[0];
                    int i4 = i3 * i3;
                    int i5 = -(625240553 * i3);
                    int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
                    int i7 = -(i3 * (-180381935));
                    int i8 = (i6 & i7) + (i7 | i6);
                    int i9 = (i8 & (-227263223)) + ((-227263223) | i8);
                    int i10 = i9 >> 26;
                    int i11 = (((i10 | (-127)) << 1) - (i10 ^ (-127))) / 64;
                    int i12 = (i11 ^ 1) + ((i11 & 1) << 1);
                    int i13 = ((i9 | i12) << 1) - (i12 ^ i9);
                    int i14 = i9 >> 25;
                    int i15 = -(IdentyB.a(i14 & (-255), i14 | (-255), 128, -1) ^ i13);
                    int i16 = (i15 ^ 4) + ((i15 & 4) << 1);
                    int i17 = ((i16 >> 26) - 127) / 64;
                    int i18 = ((i17 | 1) << 1) - (i17 ^ 1);
                    return com.identy.app.PngjBadSignature.PngjBadSignature(activity, "1,4,19,15,0,IDENTY".substring(95952 / (((-(((i18 | 1) << 1) - (i18 ^ 1))) & i16) * 1999))).getAbsolutePath();
                }
            }
            byte b = $$d[113];
            Object[] objArr3 = new Object[1];
            a(b, (byte) (b | 88), $$a[111], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a($$a[63], $$a[117], $$a[55], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 2094784876);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4967;
            Fpnative.valueOf = objArr;
            Activity activity2 = this.PngjBadSignature;
            int i32 = ((int[]) objArr[1])[0];
            int i42 = i32 * i32;
            int i52 = -(625240553 * i32);
            int i62 = (i42 ^ i52) + ((i42 & i52) << 1);
            int i72 = -(i32 * (-180381935));
            int i82 = (i62 & i72) + (i72 | i62);
            int i92 = (i82 & (-227263223)) + ((-227263223) | i82);
            int i102 = i92 >> 26;
            int i112 = (((i102 | (-127)) << 1) - (i102 ^ (-127))) / 64;
            int i122 = (i112 ^ 1) + ((i112 & 1) << 1);
            int i132 = ((i92 | i122) << 1) - (i122 ^ i92);
            int i142 = i92 >> 25;
            int i152 = -(IdentyB.a(i142 & (-255), i142 | (-255), 128, -1) ^ i132);
            int i162 = (i152 ^ 4) + ((i152 & 4) << 1);
            int i172 = ((i162 >> 26) - 127) / 64;
            int i182 = ((i172 | 1) << 1) - (i172 ^ 1);
            return com.identy.app.PngjBadSignature.PngjBadSignature(activity2, "1,4,19,15,0,IDENTY".substring(95952 / (((-(((i182 | 1) << 1) - (i182 ^ 1))) & i162) * 1999))).getAbsolutePath();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    public final PublicKey getSignKey(String str) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = a.c((~((~System.identityHashCode(this)) | 23202632)) | (-475686648), 305, (((~(0 | 23202632)) | (-494563328)) * 305) - 1958702672, -1464420651);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4855;
                    Fpnative.valueOf = objArr;
                    return com.identy.app.PngjException.PngjBadSignature(str);
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            a(bArr[113], bArr[3], (byte) (-bArr[1]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr[63];
            Object[] objArr4 = new Object[1];
            a(b, b, bArr[53], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1464420651);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4855;
            Fpnative.valueOf = objArr;
            return com.identy.app.PngjException.PngjBadSignature(str);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    public final native String[] getTransactions(long j, byte[] bArr);

    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sendLogAfterCompletionN() {
        Object[] objArr;
        long j;
        String[] transactions;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = a.c((~((~identityHashCode) | 251496392)) | (-4419008), 381, (((-157752) | identityHashCode) * (-381)) + 2062324684, 1216931192);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4893;
                    Fpnative.valueOf = objArr;
                    transactions = getTransactions(this.nativeAddres, this.PngjBadCrcException.getBytes());
                    int i3 = ((int[]) objArr[1])[0];
                    int i4 = ((i3 * i3) - (~(-(78835322 * i3)))) - 1;
                    int i5 = -(i3 * (-2076059016));
                    int i6 = ((i4 & i5) + (i5 | i4)) - (-851624241);
                    int i7 = ((i6 >> 20) - 8191) / ConstantsKt.DEFAULT_BLOCK_SIZE;
                    int i8 = (i7 & 1) + (i7 | 1);
                    int i9 = ((i6 | i8) << 1) - (i8 ^ i6);
                    int i10 = i6 >> 28;
                    int i11 = (((i10 | (-31)) << 1) - (i10 ^ (-31))) / 16;
                    int i12 = -(i9 ^ ((i11 ^ 1) + ((i11 & 1) << 1)));
                    int i13 = ((i12 | 7) << 1) - (i12 ^ 7);
                    int i14 = i13 >> 28;
                    int i15 = (((i14 | (-31)) << 1) - (i14 ^ (-31))) / 16;
                    StringBuilder sb = new StringBuilder(IdentyB.c((-((((i15 | 1) << 1) - (i15 ^ 1)) + 1)) & i13, 1056, 66528, "12,23,30,LVERIFY"));
                    StringBuilder sb2 = new StringBuilder(String.valueOf(Calendar.getInstance().getTimeInMillis()));
                    StringBuilder sb3 = new StringBuilder();
                    if (transactions == null) {
                        if (transactions.length > 0) {
                            sb = new StringBuilder();
                            sb2 = new StringBuilder();
                        }
                        StringBuilder sb4 = sb;
                        for (String str : transactions) {
                            if (!str.trim().isEmpty()) {
                                try {
                                    String[] split = str.split(",");
                                    int length = sb4.length();
                                    String str2 = BuildConfig.FLAVOR;
                                    sb4.append(length > 0 ? "," : BuildConfig.FLAVOR);
                                    sb4.append(split[0]);
                                    sb2.append(sb2.length() > 0 ? "," : BuildConfig.FLAVOR);
                                    sb2.append(split[1]);
                                    sb3.append(sb3.length() > 0 ? "," : BuildConfig.FLAVOR);
                                    if (split.length > 2) {
                                        str2 = split[2];
                                    }
                                    sb3.append(str2);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                        String valueOf2 = String.valueOf(Calendar.getInstance().getTimeInMillis() / 1000);
                        String requestData = getRequestData(this.nativeAddres, sb4.toString().getBytes(), sb2.toString().getBytes(), this.appSignature.getBytes(), Build.MANUFACTURER.getBytes(), Build.MODEL.getBytes(), this.PngjInputException.getBytes(), this.PngjBadSignature.getApplicationContext().getPackageName().getBytes(), this.values.getBytes(), valueOf2.getBytes(), this.PngjBadCrcException.getBytes());
                        PngjPrematureEnding pngjPrematureEnding = new PngjPrematureEnding();
                        Activity activity = this.PngjBadSignature;
                        pngjPrematureEnding.PngjBadCrcException(activity, activity.getApplicationContext().getPackageName(), this.PngjException, this.appSignature, this.PngjOutputException, new values(valueOf2), this.values, requestData, sb4, sb2, valueOf2, this.PngjBadCrcException, this.PngjInputException, null, sb3.toString(), this.valueOf);
                        return;
                    }
                    return;
                }
            }
            byte[] bArr = $$d;
            byte b = bArr[113];
            Object[] objArr3 = new Object[1];
            a(b, (byte) (b | 124), bArr[62], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b2 = bArr[32];
            Object[] objArr4 = new Object[1];
            a(b2, (byte) (b2 | 92), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1156828061);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4893;
            Fpnative.valueOf = objArr;
            transactions = getTransactions(this.nativeAddres, this.PngjBadCrcException.getBytes());
            int i32 = ((int[]) objArr[1])[0];
            int i42 = ((i32 * i32) - (~(-(78835322 * i32)))) - 1;
            int i52 = -(i32 * (-2076059016));
            int i62 = ((i42 & i52) + (i52 | i42)) - (-851624241);
            int i72 = ((i62 >> 20) - 8191) / ConstantsKt.DEFAULT_BLOCK_SIZE;
            int i82 = (i72 & 1) + (i72 | 1);
            int i92 = ((i62 | i82) << 1) - (i82 ^ i62);
            int i102 = i62 >> 28;
            int i112 = (((i102 | (-31)) << 1) - (i102 ^ (-31))) / 16;
            int i122 = -(i92 ^ ((i112 ^ 1) + ((i112 & 1) << 1)));
            int i132 = ((i122 | 7) << 1) - (i122 ^ 7);
            int i142 = i132 >> 28;
            int i152 = (((i142 | (-31)) << 1) - (i142 ^ (-31))) / 16;
            StringBuilder sb5 = new StringBuilder(IdentyB.c((-((((i152 | 1) << 1) - (i152 ^ 1)) + 1)) & i132, 1056, 66528, "12,23,30,LVERIFY"));
            StringBuilder sb22 = new StringBuilder(String.valueOf(Calendar.getInstance().getTimeInMillis()));
            StringBuilder sb32 = new StringBuilder();
            if (transactions == null) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
    }

    public final void sendTransaction() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = a.c((~(identityHashCode | (-1060885986))) | 561996705, 318, (((~(1060885985 | identityHashCode)) | (-1065351138)) * (-318)) + ((((~((-503354433) | identityHashCode)) | (~((~identityHashCode) | (-4465153)))) * (-318)) - 181730939), -860372080);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4865;
                    Fpnative.valueOf = objArr;
                    sendTransaction(this.nativeAddres);
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            a(bArr[113], bArr[3], (byte) (-bArr[1]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr[63];
            Object[] objArr4 = new Object[1];
            a(b, b, bArr[53], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -860372080);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4865;
            Fpnative.valueOf = objArr;
            sendTransaction(this.nativeAddres);
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
    }

    public final native void sendTransaction(long j);

    public final void setKeyValue(String str, String str2) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = a.c(~(identityHashCode | (-767591425)), 345, (((~((-804310571) | (~identityHashCode))) | (-1073012715)) * 345) + (((~((-804310571) | identityHashCode)) | 767591424) * 345) + 180779864, -1553342756);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 5016;
                    Fpnative.valueOf = objArr;
                    SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(this.PngjBadSignature).edit();
                    edit.putString(str, str2);
                    edit.commit();
                }
            }
            byte[] bArr = $$d;
            byte b = bArr[113];
            Object[] objArr3 = new Object[1];
            a(b, (byte) (b | 124), bArr[62], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b2 = bArr[32];
            Object[] objArr4 = new Object[1];
            a(b2, (byte) (b2 | 92), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1553342756);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5016;
            Fpnative.valueOf = objArr;
            SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(this.PngjBadSignature).edit();
            edit2.putString(str, str2);
            edit2.commit();
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
    }

    public final String sign(byte[] bArr, PrivateKey privateKey) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                    int c = a.c(startElapsedRealtime | 268201535, 744, (((~startElapsedRealtime) | 230687744) * 744) + (((((~(231484476 | startElapsedRealtime)) | (-268201536)) | (~(267404803 | startElapsedRealtime))) * (-744)) - 1307546841), 550523096);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4859;
                    Fpnative.valueOf = objArr;
                    return com.identy.app.PngjException.valueOf(bArr, privateKey);
                }
            }
            byte[] bArr2 = $$d;
            Object[] objArr3 = new Object[1];
            a(bArr2[113], bArr2[3], (byte) (-bArr2[1]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr2[63];
            Object[] objArr4 = new Object[1];
            a(b, b, bArr2[53], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 550523096);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4859;
            Fpnative.valueOf = objArr;
            return com.identy.app.PngjException.valueOf(bArr, privateKey);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    public final native void updateTransaction(long j, String str, byte[] bArr);

    public final void updateTransaction(String str) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = a.c(identityHashCode | (-100992065), 591, (((~((~identityHashCode) | (-100992065))) | (-397897216)) * (-591)) + 1121604174, -1557508997);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 5015;
                    Fpnative.valueOf = objArr;
                    updateTransaction(this.nativeAddres, str, this.PngjBadCrcException.getBytes());
                }
            }
            byte b = $$d[113];
            Object[] objArr3 = new Object[1];
            a(b, (byte) (b | 88), $$a[111], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a($$a[63], $$a[117], $$a[55], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1557508997);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5015;
            Fpnative.valueOf = objArr;
            updateTransaction(this.nativeAddres, str, this.PngjBadCrcException.getBytes());
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
    }

    public final native void validate(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, boolean z, byte[] bArr7);

    public final boolean verify(byte[] bArr, String str, PublicKey publicKey) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int uptimeMillis = (int) SystemClock.uptimeMillis();
                    int i = ~uptimeMillis;
                    int i2 = (~(437514661 | i)) | (-1070855142) | (~(936403941 | i));
                    int c = a.c((~((-936403942) | i)) | (~(i | (-437514662))), 590, (i2 * (-1180)) + (((~(uptimeMillis | (-303063462))) | i2) * 590) + 1635732453, 705516381);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 4981;
                    Fpnative.valueOf = objArr;
                    return com.identy.app.PngjException.PngjBadSignature(bArr, str, publicKey);
                }
            }
            byte b = $$d[113];
            Object[] objArr3 = new Object[1];
            a(b, (byte) (b | 88), $$a[111], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a($$a[63], $$a[117], $$a[55], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 705516381);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4981;
            Fpnative.valueOf = objArr;
            return com.identy.app.PngjException.PngjBadSignature(bArr, str, publicKey);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0102 A[Catch: all -> 0x013d, TryCatch #1 {all -> 0x013d, blocks: (B:8:0x00ed, B:10:0x0102, B:11:0x0140), top: B:7:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LManager(Activity activity, byte[] bArr, PngjBadCrcException pngjBadCrcException, String str, String str2, boolean z) {
        Object[] objArr = null;
        long j;
        Object PngjBadSignature;
        Object[] objArr2 = Fpnative.valueOf;
        Class cls = Integer.TYPE;
        try {
            try {
                if (objArr2 != null) {
                    long j2 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                    if (j2 > j) {
                        objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                        int startUptimeMillis = (int) Process.getStartUptimeMillis();
                        int c = a.c(startUptimeMillis | (-569428804), 496, (((~((-1068318084) | startUptimeMillis)) | 504181888 | (~((~startUptimeMillis) | (-5292609)))) * (-496)) + ((0 * 992) - 2137057233), -818561606);
                        int i = c ^ (c << 13);
                        int i2 = i ^ (i >>> 17);
                        ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                        ((long[]) objArr[0])[0] = j + 4969;
                        Fpnative.valueOf = objArr;
                        this.PngjException = "https://bancolicensemgr.identy.io/nverify/v1";
                        this.appSignature = BuildConfig.FLAVOR;
                        this.values = BuildConfig.FLAVOR;
                        this.PngjUnsupportedException = false;
                        this.valueOf = 10;
                        Object[] objArr3 = {activity, 10, new PngjException()};
                        PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1578525895);
                        if (PngjBadSignature == null) {
                            char c2 = (char) (14830 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                            int i3 = 29 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            int i4 = 721 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            byte b = (byte) 0;
                            byte b2 = b;
                            Object[] objArr4 = new Object[1];
                            b(b, b2, b2, objArr4);
                            PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(c2, i3, i4, 1560737410, false, (String) objArr4[0], new Class[]{Context.class, cls, getPadSub3B15685$PngjException.class});
                        }
                        ((Method) PngjBadSignature).invoke(null, objArr3);
                        this.PngjBadCrcException = str;
                        this.PngjBadSignature = activity;
                        this.PngjPrematureEnding = pngjBadCrcException;
                        this.PngjOutputException = bArr;
                        this.appSignature = getCertificateSHA1Fingerprint();
                        this.values = Settings.Secure.getString(activity.getContentResolver(), "android_id");
                        this.PngjInputException = str2;
                        this.PngjUnsupportedException = z;
                        String packageName = activity.getApplicationContext().getPackageName();
                        int i5 = ((int[]) objArr[1])[0];
                        int i6 = ((((i5 * i5) - (~(-(24708221 * i5)))) - 1) - (~(-(i5 * 265512129)))) - 1;
                        int i7 = (i6 ^ 956627649) + ((956627649 & i6) << 1);
                        int i8 = i7 >> 16;
                        int i9 = ((i8 ^ (-131071)) + ((i8 & (-131071)) << 1)) / 65536;
                        int i10 = (i9 ^ 1) + ((i9 & 1) << 1);
                        int i11 = (i7 ^ i10) + ((i10 & i7) << 1);
                        int i12 = i7 >> 28;
                        int i13 = ((i12 ^ (-31)) + ((i12 & (-31)) << 1)) / 16;
                        int i14 = -(((i13 ^ 1) + ((i13 & 1) << 1)) ^ i11);
                        int i15 = (i14 & 5) + (i14 | 5);
                        int i16 = i15 >> 28;
                        int i17 = (((i16 | (-31)) << 1) - (i16 ^ (-31))) / 16;
                        int i18 = (i17 ^ 1) + ((i17 & 1) << 1);
                        String c3 = "com.pinkapp.app, com.popular.joven ,com.popular.app.remesas,com.popular.app.micropyme,com.popular.pinkapp".toLowerCase().contains(packageName.toLowerCase()) ? "banco" : IdentyB.c((-(((i18 | 1) << 1) - (i18 ^ 1))) & i15, 1892, 47300, "2,25,");
                        StringBuilder sb = new StringBuilder("https://");
                        sb.append(c3);
                        sb.append("licensemgr.identy.io/nverify/v1");
                        this.PngjException = sb.toString();
                        this.nativeAddres = create(activity.getAssets(), activity.getBaseContext(), this.appSignature.getBytes(), Build.MANUFACTURER.getBytes(), Build.MODEL.getBytes(), str2.getBytes(), activity.getApplicationContext().getPackageName().getBytes(), str.getBytes(), z);
                        return;
                    }
                }
                Object[] objArr32 = {activity, 10, new PngjException()};
                PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1578525895);
                if (PngjBadSignature == null) {
                }
                ((Method) PngjBadSignature).invoke(null, objArr32);
                this.PngjBadCrcException = str;
                this.PngjBadSignature = activity;
                this.PngjPrematureEnding = pngjBadCrcException;
                this.PngjOutputException = bArr;
                this.appSignature = getCertificateSHA1Fingerprint();
                this.values = Settings.Secure.getString(activity.getContentResolver(), "android_id");
                this.PngjInputException = str2;
                this.PngjUnsupportedException = z;
                String packageName2 = activity.getApplicationContext().getPackageName();
                int i52 = ((int[]) objArr[1])[0];
                int i62 = ((((i52 * i52) - (~(-(24708221 * i52)))) - 1) - (~(-(i52 * 265512129)))) - 1;
                int i72 = (i62 ^ 956627649) + ((956627649 & i62) << 1);
                int i82 = i72 >> 16;
                int i92 = ((i82 ^ (-131071)) + ((i82 & (-131071)) << 1)) / 65536;
                int i102 = (i92 ^ 1) + ((i92 & 1) << 1);
                int i112 = (i72 ^ i102) + ((i102 & i72) << 1);
                int i122 = i72 >> 28;
                int i132 = ((i122 ^ (-31)) + ((i122 & (-31)) << 1)) / 16;
                int i142 = -(((i132 ^ 1) + ((i132 & 1) << 1)) ^ i112);
                int i152 = (i142 & 5) + (i142 | 5);
                int i162 = i152 >> 28;
                int i172 = (((i162 | (-31)) << 1) - (i162 ^ (-31))) / 16;
                int i182 = (i172 ^ 1) + ((i172 & 1) << 1);
                if ("com.pinkapp.app, com.popular.joven ,com.popular.app.remesas,com.popular.app.micropyme,com.popular.pinkapp".toLowerCase().contains(packageName2.toLowerCase())) {
                }
                StringBuilder sb2 = new StringBuilder("https://");
                sb2.append("");
                sb2.append("licensemgr.identy.io/nverify/v1");
                this.PngjException = sb2.toString();
                this.nativeAddres = create(activity.getAssets(), activity.getBaseContext(), this.appSignature.getBytes(), Build.MANUFACTURER.getBytes(), Build.MODEL.getBytes(), str2.getBytes(), activity.getApplicationContext().getPackageName().getBytes(), str.getBytes(), z);
                return;
            } catch (Throwable th) {
                Throwable cause = th.getCause();

                if (cause == null) {

                    throw new RuntimeException(th);

                }

                throw new RuntimeException(cause);
            }
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw new RuntimeException(th2);
            }
            throw new RuntimeException(cause2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void doECallback(boolean z) {
        Object[] objArr;
        long j;
        PngjBadCrcException pngjBadCrcException;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = a.c((~(identityHashCode | (-577681793))) | 575453312 | (~((~identityHashCode) | (-76564033))), 521, (((-78792513) | identityHashCode) * 521) + ((((~(0 | (-78792513))) | 577681792) * (-1042)) - 1075381496), -1978653699);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4950;
                    Fpnative.valueOf = objArr;
                    pngjBadCrcException = this.PngjPrematureEnding;
                    if (pngjBadCrcException == null) {
                        pngjBadCrcException.PngjBadCrcException(z);
                        this.PngjPrematureEnding = null;
                        return;
                    }
                    return;
                }
            }
            byte[] bArr = $$d;
            byte b = bArr[113];
            Object[] objArr3 = new Object[1];
            a(b, (byte) (b | 124), bArr[62], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b2 = bArr[32];
            Object[] objArr4 = new Object[1];
            a(b2, (byte) (b2 | 92), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1978653699);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4950;
            Fpnative.valueOf = objArr;
            pngjBadCrcException = this.PngjPrematureEnding;
            if (pngjBadCrcException == null) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
    }

    public final byte[] decryptTemplate(byte[] bArr, String str) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            try {
                if (objArr2 != null) {
                    long j2 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                    if (j2 > j) {
                        objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                        int myTid = Process.myTid();
                        int c = a.c((~(myTid | 152369684)) | (~((~myTid) | (-292865))) | (-498596416), 717, ((((~(0 | 152369684)) | (-498596416)) | (~((-292865) | myTid))) * 717) - 1119835056, -816574437);
                        int i = c ^ (c << 13);
                        int i2 = i ^ (i >>> 17);
                        ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                        ((long[]) objArr[0])[0] = j + 4936;
                        Fpnative.valueOf = objArr;
                        return decryptTemplate(this.nativeAddres, bArr, str.getBytes(), this.appSignature.getBytes(), this.values.getBytes());
                    }
                }
                return decryptTemplate(this.nativeAddres, bArr, str.getBytes(), this.appSignature.getBytes(), this.values.getBytes());
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }
}
