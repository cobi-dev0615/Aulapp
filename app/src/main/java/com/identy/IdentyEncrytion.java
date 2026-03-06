package com.identy;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.d.e.PngjPrematureEnding;
import com.identy.TemplateOutput;
import com.karumi.dexter.BuildConfig;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Method;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* loaded from: classes2.dex */
public enum IdentyEncrytion {
    AES(new com.identy.e.PngjBadSignature() { // from class: com.identy.e.values
        @Override // com.identy.e.PngjBadSignature
        public final TemplateOutput PngjBadSignature(byte[] bArr, String str, int i) {
            TemplateOutput templateOutput = new TemplateOutput();
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                new com.identy.e.PngjException(str).PngjException(byteArrayInputStream, byteArrayOutputStream);
                templateOutput.setData(Base64.encodeToString(byteArrayOutputStream.toByteArray(), i));
                return templateOutput;
            } catch (Exception e) {
                e.printStackTrace();
                return templateOutput;
            }
        }
    }),
    RSA_AES(new com.identy.e.PngjBadSignature() { // from class: com.identy.e.PngjBadCrcException
        private static  byte[] $$a = null;
        private static  int $$b = 0;
        private static int PngjBadCrcException;
        private static int PngjBadSignature;
        private static byte[] PngjException;
        private static int valueOf;
        private static short[] values;

        private static String $$c(byte b2, byte b3, byte b4) {
            byte[] bArr = $$a;
            int i = 109 - b2;
            int i2 = 4 - (b3 * 4);
            int i3 = b4 * 3;
            byte[] bArr2 = new byte[1 - i3];
            int i4 = 0 - i3;
            int i5 = -1;
            if (bArr == null) {
                i += -i4;
                i2++;
            }
            while (true) {
                i5++;
                bArr2[i5] = (byte) i;
                if (i5 == i4) {
                    return new String(bArr2, 0);
                }
                i += -bArr[i2];
                i2++;
            }
        }

        static {
            init$0();
            PngjBadSignature = 999495114;
            valueOf = -961251571;
            PngjBadCrcException = -132212457;
            PngjException = new byte[]{-79, 68, -71, 66, 64, -94, -68, -78, 93, -79, 93, 106, -6, 74, 68, -72, -78, 93, -79, -67, 10, -126, -92, 90, -72, 79};
        }

        private static void a(short s, int i, int i2, byte b2, int i3, Object[] objArr) {
            int i4;
            float f;
            int i5;
            long j;
            int i6;
            int i7;
            int i8;
            int i9;
            PngjPrematureEnding pngjPrematureEnding = new PngjPrematureEnding();
            StringBuilder sb = new StringBuilder();
            try {
                int i10 = 1;
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(valueOf)};
                int i11 = 0;
                Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1302984176);
                Class cls = Integer.TYPE;
                if (PngjBadSignature2 == null) {
                    char lastIndexOf = (char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 60330);
                    int offsetAfter = TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 32;
                    int i12 = 1167 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    byte length = (byte) $$a.length;
                    i4 = -1302984176;
                    byte b3 = (byte) (length - 4);
                    f = 0.0f;
                    PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(lastIndexOf, offsetAfter, i12, 1320773547, false, $$c(length, b3, b3), new Class[]{cls, cls});
                } else {
                    i4 = -1302984176;
                    f = 0.0f;
                }
                int intValue = ((Integer) ((Method) PngjBadSignature2).invoke(null, objArr2)).intValue();
                int i13 = intValue == -1 ? 1 : 0;
                if (i13 != 0) {
                    byte[] bArr = PngjException;
                    if (bArr != null) {
                        int length2 = bArr.length;
                        byte[] bArr2 = new byte[length2];
                        int i14 = 0;
                        j = -6165791747575875761L;
                        while (i14 < length2) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i14])};
                            Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1053815139);
                            if (PngjBadSignature3 == null) {
                                i8 = i10;
                                char indexOf = (char) (14830 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, i11, i11));
                                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 28;
                                int i15 = (TypedValue.complexToFloat(i11) > f ? 1 : (TypedValue.complexToFloat(i11) == f ? 0 : -1)) + 721;
                                byte b4 = (byte) i11;
                                i9 = i11;
                                byte b5 = b4;
                                PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf, keyRepeatTimeout, i15, 1038050086, false, $$c(b4, b5, b5), new Class[]{cls});
                            } else {
                                i8 = i10;
                                i9 = i11;
                            }
                            bArr2[i14] = ((Byte) ((Method) PngjBadSignature3).invoke(null, objArr3)).byteValue();
                            i14++;
                            i10 = i8;
                            i11 = i9;
                        }
                        bArr = bArr2;
                    } else {
                        j = -6165791747575875761L;
                    }
                    i5 = i10;
                    int i16 = i11;
                    if (bArr != null) {
                        byte[] bArr3 = PngjException;
                        Object[] objArr4 = new Object[2];
                        objArr4[i5] = Integer.valueOf(PngjBadSignature);
                        objArr4[i16] = Integer.valueOf(i2);
                        Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i4);
                        if (PngjBadSignature4 == null) {
                            char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 60329);
                            int deadChar = 32 - KeyEvent.getDeadChar(i16, i16);
                            int fadingEdgeLength2 = 1167 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                            byte length3 = (byte) $$a.length;
                            byte b6 = (byte) (length3 - 4);
                            PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(fadingEdgeLength, deadChar, fadingEdgeLength2, 1320773547, false, $$c(length3, b6, b6), new Class[]{cls, cls});
                        }
                        intValue = (byte) (((byte) (bArr3[((Integer) ((Method) PngjBadSignature4).invoke(null, objArr4)).intValue()] ^ j)) + ((int) (valueOf ^ j)));
                    } else {
                        intValue = (short) (((short) (values[i2 + ((int) (PngjBadSignature ^ j))] ^ j)) + ((int) (valueOf ^ j)));
                    }
                } else {
                    i5 = 1;
                    j = -6165791747575875761L;
                }
                if (intValue > 0) {
                    pngjPrematureEnding.values = ((i2 + intValue) - 2) + ((int) (PngjBadSignature ^ j)) + i13;
                    int i17 = PngjBadCrcException;
                    Object[] objArr5 = new Object[4];
                    objArr5[3] = sb;
                    objArr5[2] = Integer.valueOf(i17);
                    objArr5[i5] = Integer.valueOf(i);
                    objArr5[0] = pngjPrematureEnding;
                    Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1013119226);
                    if (PngjBadSignature5 == null) {
                        char keyRepeatTimeout2 = (char) (45717 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        int indexOf2 = TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 41;
                        int indexOf3 = TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 626;
                        byte b7 = (byte) ($$b & 7);
                        byte b8 = (byte) (b7 - 1);
                        PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(keyRepeatTimeout2, indexOf2, indexOf3, 1064463037, false, $$c(b7, b8, b8), new Class[]{Object.class, cls, cls, Object.class});
                    }
                    ((StringBuilder) ((Method) PngjBadSignature5).invoke(null, objArr5)).append(pngjPrematureEnding.valueOf);
                    pngjPrematureEnding.PngjBadCrcException = pngjPrematureEnding.valueOf;
                    byte[] bArr4 = PngjException;
                    if (bArr4 != null) {
                        int length4 = bArr4.length;
                        byte[] bArr5 = new byte[length4];
                        for (int i18 = 0; i18 < length4; i18++) {
                            bArr5[i18] = (byte) (bArr4[i18] ^ j);
                        }
                        bArr4 = bArr5;
                    }
                    if (bArr4 != null) {
                        i7 = i5;
                        i6 = i7;
                    } else {
                        i6 = i5;
                        i7 = 0;
                    }
                    while (true) {
                        pngjPrematureEnding.PngjException = i6;
                        if (pngjPrematureEnding.PngjException >= intValue) {
                            break;
                        }
                        if (i7 != 0) {
                            byte[] bArr6 = PngjException;
                            pngjPrematureEnding.values = pngjPrematureEnding.values - 1;
                            pngjPrematureEnding.valueOf = (char) (pngjPrematureEnding.PngjBadCrcException + (((byte) (((byte) (bArr6[0] ^ j)) + s)) ^ b2));
                        } else {
                            short[] sArr = values;
                            pngjPrematureEnding.values = pngjPrematureEnding.values - 1;
                            pngjPrematureEnding.valueOf = (char) (pngjPrematureEnding.PngjBadCrcException + (((short) (((short) (sArr[0] ^ j)) + s)) ^ b2));
                        }
                        sb.append(pngjPrematureEnding.valueOf);
                        pngjPrematureEnding.PngjBadCrcException = pngjPrematureEnding.valueOf;
                        i6 = pngjPrematureEnding.PngjException + 1;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        public static void init$0() {
            $$a = new byte[]{31, 93, -84, 91};
            $$b = 33;
        }

        @Override // com.identy.e.PngjBadSignature
        public final TemplateOutput PngjBadSignature(byte[] bArr, String str, int i) {
            KeyFactory keyFactory;
            PublicKey publicKey;
            KeyGenerator keyGenerator;
            TemplateOutput templateOutput = new TemplateOutput();
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(Base64.decode(str, i));
            try {
                keyFactory = KeyFactory.getInstance("RSA");
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
                keyFactory = null;
            }
            try {
                publicKey = keyFactory.generatePublic(x509EncodedKeySpec);
            } catch (InvalidKeySpecException e2) {
                e2.printStackTrace();
                publicKey = null;
            }
            try {
                try {
                    Object[] objArr = new Object[1];
                    a((short) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 1), (-1051389422) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getTouchSlop() >> 8) + 47750523, (byte) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), (-40) - Gravity.getAbsoluteGravity(0, 0), objArr);
                    SecureRandom secureRandom = (SecureRandom) Class.forName((String) objArr[0]).getDeclaredConstructor(null).newInstance(null);
                    try {
                        keyGenerator = KeyGenerator.getInstance("AES");
                    } catch (NoSuchAlgorithmException e3) {
                        e3.printStackTrace();
                        keyGenerator = null;
                    }
                    keyGenerator.init(256, secureRandom);
                    SecretKey generateKey = keyGenerator.generateKey();
                    Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                    try {
                        Object[] objArr2 = new Object[1];
                        a((short) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) - 1051389422, 47750523 - Drawable.resolveOpacity(0, 0), (byte) Color.red(0), (-39) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr2);
                        byte[] bArr2 = new byte[12];
                        ((Random) Class.forName((String) objArr2[0]).getDeclaredConstructor(null).newInstance(null)).nextBytes(bArr2);
                        cipher.init(1, generateKey, new GCMParameterSpec(128, bArr2));
                        byte[] doFinal = cipher.doFinal(bArr);
                        byte[] encoded = generateKey.getEncoded();
                        Cipher cipher2 = Cipher.getInstance("RSA/ECB/OAEPWithSHA1AndMGF1Padding");
                        cipher2.init(1, publicKey);
                        byte[] doFinal2 = cipher2.doFinal(encoded);
                        byte[] doFinal3 = cipher2.doFinal(bArr2);
                        templateOutput.setData(Base64.encodeToString(doFinal, 3));
                        templateOutput.setKey1(Base64.encodeToString(doFinal2, 3));
                        templateOutput.setKey2(Base64.encodeToString(doFinal3, 3));
                        return templateOutput;
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
            } catch (Exception e4) {
                e4.printStackTrace();
                return templateOutput;
            }
        }
    });

    private static  byte[] $$a = null;
    private static  int $$b = 0;
    com.identy.e.PngjBadSignature a;

    static {
        init$0();
    }

    IdentyEncrytion(com.identy.e.PngjBadSignature pngjBadSignature) {
        this.a = pngjBadSignature;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, int i, int i2, Object[] objArr) {
        int i3;
        int i4;
        int i5;
        int i6 = i2 + 4;
        byte[] bArr = $$a;
        int i7 = 99 - (i * 19);
        byte[] bArr2 = new byte[s + 16];
        int i8 = s + 15;
        int i9 = -1;
        if (bArr == null) {
            int i10 = -1;
            byte[] bArr3 = bArr;
            int i11 = i6;
            int i12 = i6 + 1;
            i3 = (i11 + (-i7)) - 13;
            i4 = i12;
            bArr = bArr3;
            i9 = i10;
            i5 = i9 + 1;
            bArr2[i5] = (byte) i3;
            if (i5 == i8) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i13 = i3;
            i6 = i4;
            i7 = bArr[i4];
            i10 = i5;
            bArr3 = bArr;
            i11 = i13;
            int i122 = i6 + 1;
            i3 = (i11 + (-i7)) - 13;
            i4 = i122;
            bArr = bArr3;
            i9 = i10;
            i5 = i9 + 1;
            bArr2[i5] = (byte) i3;
            if (i5 == i8) {
            }
        } else {
            i3 = i7;
            i4 = i6;
            i5 = i9 + 1;
            bArr2[i5] = (byte) i3;
            if (i5 == i8) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{41, -78, 52, -27, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -36, -54, -17, -10, -10, -13, 43, -31, -8, -47, -30, -2, -26, 0, -24, -18, 72, -57, -43, -6, -16, 27, -44, -16, 4, -35, -11, -20, 0, -32, -14, -10, 0, -43, -6, -16, 27, -44, -16, 20, -60, 2, 17, -64, 8, -15, -24, -17, -2, -19, -12, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -38, -59, -1, -8, -14, 10, -46, 27, -59, -1, -8, -14, 16, -42, -20, -17, -2, -26, -43, -6, -16, 27, -44, -16, 4, -35, -11, -20, 0, -32, -14, -10, 0};
        $$b = 162;
    }

    public static IdentyEncrytion valueOfString(String str) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int myTid = Process.myTid();
                    int c = defpackage.a.c(~((~myTid) | (-150997010)), 501, (((~((-150997010) | myTid)) | (-735902418)) * 501) + 1478723060, -847187117);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4885;
                    Fpnative.valueOf = objArr;
                    return (IdentyEncrytion) Enum.valueOf(IdentyEncrytion.class, str);
                }
            }
            byte[] bArr = $$a;
            byte b2 = (byte) (-bArr[19]);
            byte b3 = bArr[27];
            Object[] objArr3 = new Object[1];
            c(b2, b3, (byte) (b3 | kotlin.io.encoding.Base64.padSymbol), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b4 = bArr[27];
            byte b5 = (byte) (-bArr[77]);
            Object[] objArr4 = new Object[1];
            c(b4, b5, (byte) (b5 | 88), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -847187117);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4885;
            Fpnative.valueOf = objArr;
            return (IdentyEncrytion) Enum.valueOf(IdentyEncrytion.class, str);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static IdentyEncrytion[] valuesCustom() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int maxMemory = (int) Runtime.getRuntime().maxMemory();
                    int i = ~maxMemory;
                    int c = defpackage.a.c((~(maxMemory | 570087375)) | (~(i | (-1068976656))) | 4756928, -370, (((~(570087375 | i)) | (~((-1068976656) | maxMemory))) * (-370)) + 404328781, -2010866849);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4930;
                    Fpnative.valueOf = objArr;
                    return (IdentyEncrytion[]) values().clone();
                }
            }
            byte[] bArr = $$a;
            byte b2 = (byte) (bArr[35] + 1);
            byte b3 = bArr[27];
            Object[] objArr3 = new Object[1];
            c(b2, b3, b3, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c((byte) (bArr[38] - 1), (byte) (-bArr[77]), bArr[20], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 524037087);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4930;
            Fpnative.valueOf = objArr;
            return (IdentyEncrytion[]) values().clone();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final com.identy.e.PngjBadSignature getEncryptor() {
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
                    int c = defpackage.a.c(~(identityHashCode | 504887759), 113, (((~((~identityHashCode) | 1071119823)) | (~((-1003777040) | identityHashCode)) | 437544975) * (-113)) + ((((~(504887759 | 0)) | 1003777039) * 226) - 41024400), -1835887858);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4918;
                    Fpnative.valueOf = objArr;
                    return this.a;
                }
            }
            byte[] bArr = $$a;
            byte b2 = (byte) (bArr[35] + 1);
            byte b3 = bArr[27];
            Object[] objArr3 = new Object[1];
            c(b2, b3, b3, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c((byte) (bArr[38] - 1), (byte) (-bArr[77]), bArr[20], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1835887858);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4918;
            Fpnative.valueOf = objArr;
            return this.a;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
