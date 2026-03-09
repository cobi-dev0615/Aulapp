package com.identy.e;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import co.ceduladigital.sdk.x5;
import com.d.e.PngjInputException;
import com.karumi.dexter.BuildConfig;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.NetworkInterface;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Enumeration;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.UByte;

/* loaded from: classes2.dex */
public class PngjException {
    private static  byte[] $$a = null;
    private static  int $$b = 0;
    private static char[] Action;
    private static char PngBadCharsetException;
    private static /* synthetic */ boolean valueOf;
    private static final byte[] values;
    private final Cipher PngjBadCrcException;
    public final boolean PngjBadSignature;
    private byte[] PngjException;
    private final MessageDigest PngjExceptionInternal;
    private final SecureRandom PngjInputException;
    private final Mac PngjOutputException;
    private SecretKeySpec PngjPrematureEnding;
    private IvParameterSpec PngjUnsupportedException;
    private SecretKeySpec a;
    private IvParameterSpec e1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, short s2) {
        int i;
        int i2 = (s2 * 3) + 4;
        int i3 = s * 2;
        byte[] bArr = $$a;
        int i4 = 121 - (b * 2);
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        if (bArr == null) {
            int i6 = i4;
            i4 = i5;
            i = 0;
            i4 += i6;
            i2++;
            bArr2[i] = (byte) i4;
            if (i == i5) {
                return new String(bArr2, 0);
            }
            i++;
            i6 = bArr[i2];
            i4 += i6;
            i2++;
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
        PngjException();
        valueOf = true;
        values = new byte[]{1, 35, 69, 103, -119, -85, -51, -17};
    }

    public PngjException(String str) {
        this(str, (byte) 0);
    }

    private byte[] PngjBadCrcException() {
        byte[] bArr = new byte[16];
        long currentTimeMillis = System.currentTimeMillis();
        byte[] bArr2 = null;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (bArr2 == null) {
                if (!networkInterfaces.hasMoreElements()) {
                    break;
                }
                bArr2 = networkInterfaces.nextElement().getHardwareAddress();
            }
        } catch (Exception unused) {
        }
        if (bArr2 == null) {
            bArr2 = values;
        }
        for (int i = 0; i < 8; i++) {
            bArr[i] = (byte) (currentTimeMillis >> (i << 3));
        }
        System.arraycopy(bArr2, 0, bArr, 8, bArr2.length);
        PngjException(bArr, 256);
        return bArr;
    }

    private void PngjException(byte[] bArr, int i) {
        if (!valueOf && bArr.length > 32) {
            throw new AssertionError();
        }
        this.PngjExceptionInternal.reset();
        this.PngjExceptionInternal.update(bArr);
        for (int i2 = 0; i2 < i; i2++) {
            this.PngjInputException.nextBytes(bArr);
            this.PngjExceptionInternal.update(bArr);
        }
        System.arraycopy(this.PngjExceptionInternal.digest(), 0, bArr, 0, bArr.length);
    }

    private static void b(String str, int i, byte b, Object[] objArr) {
        int i2;
        long j;
        char c;
        char c2;
        char c3;
        int i3;
        int i4;
        char[] charArray = str != null ? str.toCharArray() : null;
        PngjInputException pngjInputException = new PngjInputException();
        char[] cArr = Action;
        Class cls = Integer.TYPE;
        int i5 = 252968584;
        int i6 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(i5);
                    if (PngjBadSignature == null) {
                        i3 = i5;
                        byte b2 = (byte) i6;
                        i4 = i6;
                        byte b3 = b2;
                        PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), Process.getGidForName(BuildConfig.FLAVOR) + 29, 1530 - MotionEvent.axisFromString(BuildConfig.FLAVOR), -201551053, false, $$c(b2, b3, b3), new Class[]{cls});
                    } else {
                        i3 = i5;
                        i4 = i6;
                    }
                    cArr2[i7] = ((Character) ((Method) PngjBadSignature).invoke(null, objArr2)).charValue();
                    i7++;
                    i5 = i3;
                    i6 = i4;
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
        int i8 = i5;
        int i9 = i6;
        Object[] objArr3 = {Integer.valueOf(PngBadCharsetException)};
        Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i8);
        long j2 = 0;
        if (PngjBadSignature2 == null) {
            byte b4 = (byte) i9;
            byte b5 = b4;
            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ExpandableListView.getPackedPositionForGroup(i9) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i9) == 0L ? 0 : -1)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 28, Color.rgb(i9, i9, i9) + 16778747, -201551053, false, $$c(b4, b5, b5), new Class[]{cls});
        }
        char charValue = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr3)).charValue();
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            pngjInputException.values = 0;
            while (true) {
                int i10 = pngjInputException.values;
                if (i10 >= i2) {
                    break;
                }
                char c4 = charArray[i10];
                pngjInputException.valueOf = c4;
                char c5 = charArray[i10 + 1];
                pngjInputException.PngjException = c5;
                if (c4 == c5) {
                    cArr3[i10] = (char) (c4 - b);
                    cArr3[i10 + 1] = (char) (c5 - b);
                    j = j2;
                } else {
                    Object[] objArr4 = {pngjInputException, pngjInputException, Integer.valueOf(charValue), pngjInputException, pngjInputException, Integer.valueOf(charValue), pngjInputException, pngjInputException, Integer.valueOf(charValue), pngjInputException, pngjInputException, Integer.valueOf(charValue), pngjInputException};
                    j = j2;
                    Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1620847519);
                    if (PngjBadSignature3 == null) {
                        char c6 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int i11 = (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 26;
                        c = '\n';
                        int resolveOpacity = Drawable.resolveOpacity(0, 0) + 1475;
                        byte b6 = (byte) 1;
                        c2 = 2;
                        byte b7 = (byte) (b6 - 1);
                        c3 = '\t';
                        String $$c = $$c(b6, b7, b7);
                        Class cls2 = Integer.TYPE;
                        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c6, i11, resolveOpacity, 1670167002, false, $$c, new Class[]{Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class});
                    } else {
                        c = '\n';
                        c2 = 2;
                        c3 = '\t';
                    }
                    int intValue = ((Integer) ((Method) PngjBadSignature3).invoke(null, objArr4)).intValue();
                    int i12 = pngjInputException.PngjUnsupportedException;
                    if (intValue == i12) {
                        Object[] objArr5 = new Object[11];
                        objArr5[c] = pngjInputException;
                        objArr5[c3] = Integer.valueOf(charValue);
                        objArr5[8] = pngjInputException;
                        objArr5[7] = Integer.valueOf(charValue);
                        objArr5[6] = Integer.valueOf(charValue);
                        objArr5[5] = pngjInputException;
                        objArr5[4] = pngjInputException;
                        objArr5[3] = Integer.valueOf(charValue);
                        objArr5[c2] = Integer.valueOf(charValue);
                        objArr5[1] = pngjInputException;
                        objArr5[0] = pngjInputException;
                        Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1410004713);
                        if (PngjBadSignature4 == null) {
                            char axisFromString = (char) (MotionEvent.axisFromString(BuildConfig.FLAVOR) + 37427);
                            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 26;
                            int resolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1017;
                            byte b8 = (byte) ($$b & 11);
                            byte b9 = (byte) (b8 - 2);
                            String $$c2 = $$c(b8, b9, b9);
                            Class cls3 = Integer.TYPE;
                            PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(axisFromString, threadPriority, resolveSizeAndState, 1461347500, false, $$c2, new Class[]{Object.class, Object.class, cls3, cls3, Object.class, Object.class, cls3, cls3, Object.class, cls3, Object.class});
                        }
                        int intValue2 = ((Integer) ((Method) PngjBadSignature4).invoke(null, objArr5)).intValue();
                        int i13 = (pngjInputException.PngjBadCrcException * charValue) + pngjInputException.PngjUnsupportedException;
                        int i14 = pngjInputException.values;
                        cArr3[i14] = cArr[intValue2];
                        cArr3[i14 + 1] = cArr[i13];
                    } else {
                        int i15 = pngjInputException.PngjBadSignature;
                        int i16 = pngjInputException.PngjBadCrcException;
                        if (i15 == i16) {
                            int C = x5.C(pngjInputException.PngjOutputException, charValue, 1, charValue);
                            pngjInputException.PngjOutputException = C;
                            int C2 = x5.C(i12, charValue, 1, charValue);
                            pngjInputException.PngjUnsupportedException = C2;
                            int i17 = (i16 * charValue) + C2;
                            int i18 = pngjInputException.values;
                            cArr3[i18] = cArr[(i15 * charValue) + C];
                            cArr3[i18 + 1] = cArr[i17];
                        } else {
                            int i19 = (i15 * charValue) + i12;
                            int i20 = (i16 * charValue) + pngjInputException.PngjOutputException;
                            int i21 = pngjInputException.values;
                            cArr3[i21] = cArr[i19];
                            cArr3[i21 + 1] = cArr[i20];
                        }
                    }
                }
                pngjInputException.values += 2;
                j2 = j;
            }
        }
        for (int i22 = 0; i22 < i; i22++) {
            cArr3[i22] = (char) (cArr3[i22] ^ 13722);
        }
        objArr[0] = new String(cArr3);
    }

    public static void init$0() {
        $$a = new byte[]{99, -40, 88, 17};
        $$b = 150;
    }

    private byte[] values(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[32];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        for (int i = 0; i < 8192; i++) {
            this.PngjExceptionInternal.reset();
            this.PngjExceptionInternal.update(bArr3);
            this.PngjExceptionInternal.update(bArr2);
            bArr3 = this.PngjExceptionInternal.digest();
        }
        return bArr3;
    }

    public void PngjBadSignature(long j, InputStream inputStream, OutputStream outputStream) {
        int i;
        try {
            byte[] bArr = new byte[3];
            if (inputStream.read(bArr) != 3) {
                throw new IOException("Unexpected end of file");
            }
            if (!new String(bArr, StandardCharsets.UTF_8).equals("AES")) {
                throw new IOException("Invalid file header");
            }
            int read = inputStream.read();
            if (read <= 0 || read > 2) {
                throw new IOException("Unsupported version number: ".concat(String.valueOf(read)));
            }
            "Version: ".concat(String.valueOf(read));
            inputStream.read();
            long j2 = 134;
            if (read == 2) {
                byte[] bArr2 = new byte[2];
                while (inputStream.read(bArr2) == 2) {
                    int i2 = ((bArr2[0] & UByte.MAX_VALUE) << 8) | (bArr2[1] & UByte.MAX_VALUE);
                    long j3 = i2;
                    if (inputStream.skip(j3) != j3) {
                        throw new IOException("Unexpected end of extension");
                    }
                    j2 += i2 + 2;
                    "Skipped extension sized: ".concat(String.valueOf(i2));
                    if (i2 == 0) {
                    }
                }
                throw new IOException("Unexpected end of file");
            }
            byte[] bArr3 = new byte[16];
            if (inputStream.read(bArr3) != 16) {
                throw new IOException("Unexpected end of file");
            }
            this.PngjUnsupportedException = new IvParameterSpec(bArr3);
            this.PngjPrematureEnding = new SecretKeySpec(values(this.PngjUnsupportedException.getIV(), this.PngjException), "AES");
            this.PngjUnsupportedException.getIV();
            this.PngjPrematureEnding.getEncoded();
            this.PngjBadCrcException.init(2, this.PngjPrematureEnding, this.PngjUnsupportedException);
            byte[] bArr4 = new byte[48];
            if (inputStream.read(bArr4) != 48) {
                throw new IOException("Unexpected end of file");
            }
            byte[] doFinal = this.PngjBadCrcException.doFinal(bArr4);
            this.e1 = new IvParameterSpec(doFinal, 0, 16);
            this.a = new SecretKeySpec(doFinal, 16, 32, "AES");
            this.e1.getIV();
            this.a.getEncoded();
            this.PngjOutputException.init(new SecretKeySpec(this.PngjPrematureEnding.getEncoded(), "HmacSHA256"));
            byte[] doFinal2 = this.PngjOutputException.doFinal(bArr4);
            byte[] bArr5 = new byte[32];
            if (inputStream.read(bArr5) != 32) {
                throw new IOException("Unexpected end of file");
            }
            if (!Arrays.equals(doFinal2, bArr5)) {
                throw new IOException("Message has been altered or password incorrect");
            }
            long j4 = j - j2;
            if (j4 % 16 != 0) {
                throw new IOException("Input file is corrupt");
            }
            if (j4 == 0) {
                inputStream.read();
            }
            "Payload size: ".concat(String.valueOf(j4));
            this.PngjBadCrcException.init(2, this.a, this.e1);
            this.PngjOutputException.init(new SecretKeySpec(this.a.getEncoded(), "HmacSHA256"));
            byte[] bArr6 = new byte[16];
            byte[] bArr7 = new byte[16];
            for (int i3 = (int) (j4 / 16); i3 > 0; i3--) {
                if (inputStream.read(bArr6, 0, 16) != 16) {
                    throw new IOException("Unexpected end of file contents");
                }
                this.PngjBadCrcException.update(bArr6, 0, 16, bArr7);
                this.PngjOutputException.update(bArr6, 0, 16);
                if (i3 == 1) {
                    i = inputStream.read();
                    "Last block size mod 16: ".concat(String.valueOf(i));
                    if (i > 0) {
                        outputStream.write(bArr7, 0, i);
                    }
                }
                i = 16;
                outputStream.write(bArr7, 0, i);
            }
            outputStream.write(this.PngjBadCrcException.doFinal());
            byte[] doFinal3 = this.PngjOutputException.doFinal();
            byte[] bArr8 = new byte[32];
            if (inputStream.read(bArr8) != 32) {
                throw new IOException("Unexpected end of file");
            }
            if (!Arrays.equals(doFinal3, bArr8)) {
                throw new IOException("Message has been altered or password incorrect");
            }
        } catch (InvalidKeyException e) {
            throw new GeneralSecurityException("Please make sure \"Java Cryptography Extension (JCE) Unlimited Strength Jurisdiction Policy Files\" is installed on your JRE.", e);
        }
    }

    private PngjException(String str, byte b) {
        try {
            this.PngjBadSignature = false;
            this.PngjException = str.getBytes(StandardCharsets.UTF_16LE);
            try {
                Object[] objArr = new Object[1];
                b("\u0006\u0017\u000b\u0014\u0012\u0002\n\u0015\u000e\u0002\u0012\u000b\u0002\u0010\u0010\u000e\u0016\n\u0001\u000e\u0014\u0016\n\u0013\b\u0018", ImageFormat.getBitsPerPixel(0) + 27, (byte) (29 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr);
                this.PngjInputException = (SecureRandom) Class.forName((String) objArr[0]).getDeclaredConstructor(null).newInstance(null);
                this.PngjExceptionInternal = MessageDigest.getInstance("SHA-256");
                this.PngjBadCrcException = Cipher.getInstance("AES/CBC/NoPadding");
                this.PngjOutputException = Mac.getInstance("HmacSHA256");
            } catch (Throwable th) {
                Throwable cause = th.getCause();

                if (cause == null) {

                    throw new RuntimeException(th);

                }

                throw new RuntimeException(cause);
            }
        } catch (GeneralSecurityException e) {
            throw new GeneralSecurityException("Please make sure \"Java Cryptography Extension (JCE) Unlimited Strength Jurisdiction Policy Files\" is installed on your JRE.", e);
        }
    }

    private byte[] values() {
        byte[] bArr = new byte[32];
        this.PngjInputException.nextBytes(bArr);
        PngjException(bArr, 32);
        return bArr;
    }

    public final void PngjException(InputStream inputStream, OutputStream outputStream) {
        try {
            this.PngjUnsupportedException = new IvParameterSpec(PngjBadCrcException());
            this.PngjPrematureEnding = new SecretKeySpec(values(this.PngjUnsupportedException.getIV(), this.PngjException), "AES");
            this.e1 = new IvParameterSpec(PngjBadSignature());
            this.a = new SecretKeySpec(values(), "AES");
            this.PngjUnsupportedException.getIV();
            this.PngjPrematureEnding.getEncoded();
            this.e1.getIV();
            this.a.getEncoded();
            outputStream.write("AES".getBytes(StandardCharsets.UTF_8));
            outputStream.write(1);
            outputStream.write(0);
            outputStream.write(this.PngjUnsupportedException.getIV());
            byte[] bArr = new byte[48];
            this.PngjBadCrcException.init(1, this.PngjPrematureEnding, this.PngjUnsupportedException);
            this.PngjBadCrcException.update(this.e1.getIV(), 0, 16, bArr);
            this.PngjBadCrcException.doFinal(this.a.getEncoded(), 0, 32, bArr, 16);
            outputStream.write(bArr);
            this.PngjOutputException.init(new SecretKeySpec(this.PngjPrematureEnding.getEncoded(), "HmacSHA256"));
            outputStream.write(this.PngjOutputException.doFinal(bArr));
            this.PngjBadCrcException.init(1, this.a, this.e1);
            this.PngjOutputException.init(new SecretKeySpec(this.a.getEncoded(), "HmacSHA256"));
            byte[] bArr2 = new byte[16];
            int i = 0;
            while (true) {
                int read = inputStream.read(bArr2);
                if (read > 0) {
                    this.PngjBadCrcException.update(bArr2, 0, 16, bArr2);
                    this.PngjOutputException.update(bArr2);
                    outputStream.write(bArr2);
                    i = read;
                } else {
                    int i2 = i & 15;
                    outputStream.write(i2);
                    "Last block size mod 16: ".concat(String.valueOf(i2));
                    outputStream.write(this.PngjOutputException.doFinal());
                    return;
                }
            }
        } catch (InvalidKeyException e) {
            throw new GeneralSecurityException("Please make sure \"Java Cryptography Extension (JCE) Unlimited Strength Jurisdiction Policy Files\" is installed on your JRE.", e);
        }
    }

    public static void PngjException() {
        Action = new char[]{13504, 288, 13511, 298, 299, 13510, 13505, 13509, 307, 310, 303, 316, 300, 301, 311, 317, 304, 375, 13506, 266, 314, 312, 13508, 308, 267};
        PngBadCharsetException = (char) 13510;
    }

    private byte[] PngjBadSignature() {
        byte[] bArr = new byte[16];
        this.PngjInputException.nextBytes(bArr);
        PngjException(bArr, 256);
        return bArr;
    }
}
