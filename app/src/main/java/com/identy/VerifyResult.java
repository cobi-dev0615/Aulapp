package com.identy;

import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.identy.enums.Finger;
import com.identy.enums.FingerMatchSecLevel;
import com.identy.enums.Hand;
import com.karumi.dexter.BuildConfig;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.HashMap;
import kotlin.io.ConstantsKt;

/* loaded from: classes2.dex */
public class VerifyResult {
    private static  byte[] $$a = null;
    private static  int $$b = 0;
    private static  byte[] $$c = null;
    private static  int $$d = 0;
    private static int $10;
    private static int $11;
    private static int PngjBadCrcException;
    private static int PngjException;
    private static char[] values;
    public String enrollmentTs;
    public boolean matched;
    public FingerMatchSecLevel matched_true_up_to_security_level;
    public boolean positionMismatched;
    public double score;
    public HashMap<Position, Float> scores;

    private static String $$e(short s, int i, int i2) {
        byte[] bArr = $$c;
        int i3 = i * 4;
        int i4 = (s * 3) + 4;
        int i5 = i2 + 99;
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        int i7 = -1;
        if (bArr == null) {
            i5 = i4 + i6;
            i4++;
            bArr = bArr;
            i7 = -1;
        }
        while (true) {
            int i8 = i7 + 1;
            bArr2[i8] = (byte) i5;
            if (i8 == i6) {
                return new String(bArr2, 0);
            }
            int i9 = i5;
            byte[] bArr3 = bArr;
            i5 = bArr[i4] + i9;
            i4++;
            bArr = bArr3;
            i7 = i8;
        }
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        PngjBadCrcException = 0;
        PngjException = 1;
        values = new char[]{40135, 39991, 39985, 39997, 39943, 39936, 39985, 39996, 39995, 39974, 39990, 40168, 39960, 39993, 39966, 39953, 39990, 39996, 39992, 39987, 39985, 39991, 40177, 40029, 40020, 39978, 40020, 39977, 40021, 40023, 40018, 40028, 39978, 39983, 39975, 39975, 39976};
    }

    public VerifyResult() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i = (int) Runtime.getRuntime().totalMemory();
                    int i2 = ~i;
                    int i3 = ~((-422949514) | i2);
                    int i4 = ~((-75939767) | i);
                    int c = defpackage.a.c((~(i | (-422949514))) | (~(i2 | 422949513)), 575, ((i4 | (~(75939766 | i2))) * (-575)) + ((i3 | i4) * 1150) + 1400362686, -1194340689);
                    int i5 = c ^ (c << 13);
                    int i6 = i5 ^ (i5 >>> 17);
                    ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
                    ((long[]) objArr[0])[0] = j + 4926;
                    Fpnative.valueOf = objArr;
                    this.scores = new HashMap<>();
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a(bArr[2], bArr[63], bArr[62], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr[63];
            Object[] objArr4 = new Object[1];
            a(b, bArr[57], b, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1194340689);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4926;
            Fpnative.valueOf = objArr;
            this.scores = new HashMap<>();
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
    }

    public static /* synthetic */ void PngjBadSignature() {
        PngjBadCrcException = (PngjException + 93) % 128;
        Member[] memberArr = com.d.e.a.values.valueOf;
        Object[] objArr = new Object[1];
        b(new int[]{0, 22, 60, 0}, "\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001", true, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        b(new int[]{22, 15, 88, 5}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001", true, objArr2);
        memberArr[0] = cls.getDeclaredMethod((String) objArr2[0], null);
        PngjBadCrcException = (PngjException + 83) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, int i, byte b2, Object[] objArr) {
        int i2;
        int i3 = i + 4;
        byte[] bArr = $$a;
        int i4 = 118 - (b * 19);
        byte[] bArr2 = new byte[b2 + 6];
        int i5 = b2 + 5;
        if (bArr == null) {
            int i6 = i5;
            i2 = 0;
            i3++;
            i4 = (i4 + i6) - 13;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2++;
            i6 = bArr[i3];
            i3++;
            i4 = (i4 + i6) - 13;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        }
    }

    private static void b(int[] iArr, String str, boolean z, Object[] objArr) {
        byte[] bArr;
        float f;
        int i;
        byte[] bArr2;
        int i2;
        float f2;
        String str2 = str;
        byte[] bArr3 = null;
        if (str2 != null) {
            bArr3 = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr4 = bArr3;
        com.d.e.e1 e1Var = new com.d.e.e1();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = values;
        Class cls = Integer.TYPE;
        float f3 = 0.0f;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(-259747866);
                    if (PngjBadSignature == null) {
                        f2 = f3;
                        bArr2 = bArr4;
                        byte b = (byte) 0;
                        byte b2 = b;
                        i2 = i7;
                        PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), 35 - (ViewConfiguration.getScrollBarSize() >> 8), 1313 - (PointF.length(f3, f3) > f2 ? 1 : (PointF.length(f3, f3) == f2 ? 0 : -1)), 208396893, false, $$e(b, b2, (byte) (b2 + 1)), new Class[]{cls});
                    } else {
                        bArr2 = bArr4;
                        i2 = i7;
                        f2 = f3;
                    }
                    cArr2[i2] = ((Character) ((Method) PngjBadSignature).invoke(null, objArr2)).charValue();
                    i7 = i2 + 1;
                    f3 = f2;
                    bArr4 = bArr2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();

                    if (cause == null) {

                        throw new RuntimeException(th);

                    }

                    throw new RuntimeException(cause);
                }
            }
            bArr = bArr4;
            f = f3;
            $10 = ($11 + 111) % 128;
            cArr = cArr2;
        } else {
            bArr = bArr4;
            f = 0.0f;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            e1Var.PngjBadSignature = 0;
            char c = 0;
            while (true) {
                int i8 = e1Var.PngjBadSignature;
                if (i8 >= i4) {
                    break;
                }
                if (bArr[i8] == 1) {
                    $11 = ($10 + 33) % 128;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i8]), Integer.valueOf(c)};
                    Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-655108508);
                    if (PngjBadSignature2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 31883), TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 32, ImageFormat.getBitsPerPixel(0) + 1251, 605862879, false, $$e(b3, b4, b4), new Class[]{cls, cls});
                    }
                    cArr4[i8] = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr3)).charValue();
                } else {
                    Object[] objArr4 = {Integer.valueOf(cArr3[i8]), Integer.valueOf(c)};
                    Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(269554740);
                    if (PngjBadSignature3 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (Process.myPid() >> 22), 35 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)) + 1597, -318867057, false, $$e(b5, b6, (byte) (b6 + 3)), new Class[]{cls, cls});
                    }
                    cArr4[i8] = ((Character) ((Method) PngjBadSignature3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[e1Var.PngjBadSignature];
                Object[] objArr5 = {e1Var, e1Var};
                Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1060060353);
                if (PngjBadSignature4 == null) {
                    PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 1), 35 - (ViewConfiguration.getFadingEdgeLength() >> 16), 203 - AndroidCharacter.getMirror('0'), -1010806406, false, "g", new Class[]{Object.class, Object.class});
                }
                ((Method) PngjBadSignature4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i9 = $10 + 59;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                char[] cArr5 = new char[i4];
                i = 0;
                System.arraycopy(cArr3, 0, cArr5, 0, i4);
                System.arraycopy(cArr5, 0, cArr3, i4 >>> i6, i6);
                System.arraycopy(cArr5, i6, cArr3, 0, i4 >> i6);
            } else {
                i = 0;
                char[] cArr6 = new char[i4];
                System.arraycopy(cArr3, 0, cArr6, 0, i4);
                int i10 = i4 - i6;
                System.arraycopy(cArr6, 0, cArr3, i10, i6);
                System.arraycopy(cArr6, i6, cArr3, 0, i10);
            }
        } else {
            i = 0;
        }
        if (!(!z)) {
            char[] cArr7 = new char[i4];
            e1Var.PngjBadSignature = i;
            $11 = ($10 + 91) % 128;
            while (true) {
                int i11 = e1Var.PngjBadSignature;
                if (i11 >= i4) {
                    break;
                }
                cArr7[i11] = cArr3[(i4 - i11) - 1];
                e1Var.PngjBadSignature = i11 + 1;
            }
            cArr3 = cArr7;
        }
        if (i5 > 0) {
            int i12 = $11 + 109;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            e1Var.PngjBadSignature = 0;
            while (true) {
                int i14 = e1Var.PngjBadSignature;
                if (i14 >= i4) {
                    break;
                }
                cArr3[i14] = (char) (cArr3[i14] - iArr[2]);
                e1Var.PngjBadSignature = i14 + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public static void init$0() {
        $$a = new byte[]{7, -116, 1, 36, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 70, -44, 47, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, -8, 24, 22, -3, 27, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 36, 54, 17, 10, 10, 13, -43, 31, 8, 47, 30, 2, 26, 0, 24, 18, -72, 57, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 38, 59, 1, 8, 14, -10, 46, -27, 59, 1, 8, 14, -16, 42, 20, 17, 2, 26, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0};
        $$b = 244;
    }

    public static void init$1() {
        $$c = new byte[]{117, -116, -61, 23};
        $$d = 97;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
    
        if (0 <= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if (0 <= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004f, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a[0])[0]}, new int[1]};
        0 = (int) java.lang.Runtime.getRuntime().freeMemory();
        0 = ~((-577283448) | 0);
        0 = ~0;
        0 = defpackage.a.c(((~(0 | 78394167)) | 2629943) | (~(577283447 | 0)), 904, (((~(0 | (-75764225))) | (~((-574653505) | 0))) * 904) + (((0 | (~((-78394168) | 0))) * (-1808)) + 525966391), -1976579667);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a[1])[0] = 0 ^ (0 << 5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getEnrollmentTs() {
        long j;
        Object[] objArr = Fpnative.valueOf;
        try {
            if (objArr != null) {
                int i = PngjException + 87;
                PngjBadCrcException = i % 128;
                if (i % 2 != 0) {
                    long j2 = ((long[]) objArr[0])[1];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[1]).invoke(null, new Object[1])).longValue();
                } else {
                    long j3 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                }
                // ((long[]) $$a[0])[0] = j + 4985;
                Fpnative.valueOf = null;
                String str = this.enrollmentTs;
                PngjException = (PngjBadCrcException + 23) % 128;
                return str;
            }
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[2], bArr[3], bArr[111], objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            byte b = bArr[32];
            Object[] objArr3 = new Object[1];
            a(b, (byte) (b | 77), bArr[55], objArr3);
            Object[] objArr4 = (Object[]) cls.getMethod((String) objArr3[0], Integer.TYPE).invoke(null, -1976579667);
            j = ((long[]) objArr4[0])[0];
            ((long[]) objArr4[0])[0] = j + 4985;
            Fpnative.valueOf = objArr4;
            String str2 = this.enrollmentTs;
            PngjException = (PngjBadCrcException + 23) % 128;
            return str2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float getFingerScore(Pair<Hand, Finger> pair) {
        Object[] objArr;
        long j;
        PngjBadCrcException = (PngjException + com.karumi.dexter.R.styleable.AppCompatTheme_tooltipFrameBackground) % 128;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                    int c = defpackage.a.c((~(startElapsedRealtime | (-134072433))) | 96241728 | (~((~startElapsedRealtime) | 402647551)), 988, (((~((-37830705) | 0)) | (~(402647551 | startElapsedRealtime))) * 988) - 436864513, 2074016405);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4921;
                    Fpnative.valueOf = objArr;
                    if (!this.scores.containsKey(Integer.valueOf(Position.getFromHandFinger(pair).ordinal()))) {
                        PngjBadCrcException = (PngjException + 103) % 128;
                        return this.scores.get(Integer.valueOf(Position.getFromHandFinger(pair).ordinal())).floatValue();
                    }
                    int i3 = ((int[]) objArr[1])[0];
                    int i4 = i3 * i3;
                    int i5 = -(902391678 * i3);
                    int i6 = (i4 & i5) + (i4 | i5);
                    int i7 = -(i3 * (-1541596950));
                    int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
                    int i9 = (i8 ^ (-757986672)) + (((-757986672) & i8) << 1);
                    int e = IdentyB.e(i9 >> 28, 31, 16, -1);
                    int i10 = (i9 ^ e) + ((e & i9) << 1);
                    int i11 = ((i9 >> 19) - 16383) / ConstantsKt.DEFAULT_BUFFER_SIZE;
                    int i12 = -(i10 ^ ((i11 & 1) + (i11 | 1)));
                    int i13 = (i12 & 2) + (i12 | 2);
                    int i14 = ((i13 >> 26) - 127) / 64;
                    int i15 = (i14 & 1) + (i14 | 1);
                    return (1421035888 / (((-((i15 ^ 1) + ((i15 & 1) << 1))) & i13) << 2)) - 177629486;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a(bArr[2], bArr[3], bArr[111], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr[32];
            Object[] objArr4 = new Object[1];
            a(b, (byte) (b | 77), bArr[55], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 2074016405);
            j = ((long[]) objArr[0])[0];
            PngjBadCrcException = (PngjException + 31) % 128;
            ((long[]) objArr[0])[0] = j + 4921;
            Fpnative.valueOf = objArr;
            if (!this.scores.containsKey(Integer.valueOf(Position.getFromHandFinger(pair).ordinal()))) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
        PngjBadCrcException = (PngjException + 27) % 128;
    }

    public FingerMatchSecLevel getMatched_true_up_to_security_level() {
        Object[] objArr;
        long j;
        int i = PngjException;
        int i2 = i + 17;
        PngjBadCrcException = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                PngjBadCrcException = (i + 103) % 128;
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int freeMemory = (int) Runtime.getRuntime().freeMemory();
                    int c = defpackage.a.c((~(freeMemory | 305827496)) | 767885376, 116, ((804716776 | freeMemory) * 116) + (((~((~freeMemory) | (-268996097))) * (-116)) - 1537692237), 1513349550);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 5039;
                    Fpnative.valueOf = objArr;
                    return this.matched_true_up_to_security_level;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a(bArr[2], bArr[63], bArr[62], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr[63];
            Object[] objArr4 = new Object[1];
            a(b, bArr[57], b, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1513349550);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5039;
            Fpnative.valueOf = objArr;
            return this.matched_true_up_to_security_level;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    public double getScore() {
        Object[] objArr;
        long j;
        int i = PngjException + 13;
        int i2 = i % 128;
        PngjBadCrcException = i2;
        if (i % 2 != 0) {
            throw null;
        }
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                PngjException = (i2 + 61) % 128;
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i3 = ~identityHashCode;
                    int i4 = (((~(210007861 | i3)) | 288589834) * (-1188)) - 85475969;
                    int i5 = (~(identityHashCode | (-210007862))) | 288589834;
                    int i6 = ~(288881418 | i3);
                    int c = defpackage.a.c((~(i3 | (-210007862))) | 209716277 | i6, 594, ((i5 | i6) * 594) + i4, 1841458137);
                    int i7 = c ^ (c << 13);
                    int i8 = i7 ^ (i7 >>> 17);
                    ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
                    ((long[]) objArr[0])[0] = j + 5033;
                    Fpnative.valueOf = objArr;
                    return this.score;
                }
            }
            byte[] bArr = $$a;
            byte b = bArr[2];
            Object[] objArr3 = new Object[1];
            a(b, (byte) (b | 96), (byte) (bArr[30] - 1), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(bArr[32], (byte) 125, bArr[53], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1841458137);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5033;
            Fpnative.valueOf = objArr;
            return this.score;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
        PngjBadCrcException = (PngjException + 71) % 128;
    }

    public boolean isMatched() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = defpackage.a.c((~((~((int) Process.getStartUptimeMillis())) | (-439269703))) | 304752902, 191, (((~(0 | (-439269703))) | 938158982) * 191) - 596984309, -1335193006);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 5016;
                    Fpnative.valueOf = objArr;
                    return this.matched;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a(bArr[2], bArr[3], bArr[111], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr[32];
            Object[] objArr4 = new Object[1];
            a(b, (byte) (b | 77), bArr[55], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1335193006);
            j = ((long[]) objArr[0])[0];
            PngjException = (PngjBadCrcException + 29) % 128;
            ((long[]) objArr[0])[0] = j + 5016;
            Fpnative.valueOf = objArr;
            return this.matched;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
        PngjException = (PngjBadCrcException + 17) % 128;
    }

    public boolean isPositionMismatched() {
        Object[] objArr;
        long j;
        int i = (PngjException + 53) % 128;
        PngjBadCrcException = i;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                PngjException = (i + 21) % 128;
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i2 = ((identityHashCode | 313950213) * (-50)) - 1640487963;
                    int i3 = ~((-33849345) | identityHashCode);
                    int i4 = ~identityHashCode;
                    int c = defpackage.a.c((~(i4 | 313950213)) | (~((-184939067) | i4)) | 151089722, 50, ((i3 | (~((-151089723) | i4))) * 50) + i2, 1612916502);
                    int i5 = c ^ (c << 13);
                    int i6 = i5 ^ (i5 >>> 17);
                    ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
                    ((long[]) objArr[0])[0] = j + 4922;
                    Fpnative.valueOf = objArr;
                    return this.positionMismatched;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a(bArr[2], bArr[63], bArr[62], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr[63];
            Object[] objArr4 = new Object[1];
            a(b, bArr[57], b, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1612916502);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4922;
            Fpnative.valueOf = objArr;
            return this.positionMismatched;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
        PngjBadCrcException = (PngjException + 19) % 128;
    }

    public void setEnrollmentTs(String str) {
        Object[] objArr;
        long j;
        PngjException = (PngjBadCrcException + 65) % 128;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int myTid = Process.myTid();
                    int i = ~myTid;
                    int c = defpackage.a.c((~(myTid | (-716003531))) | (~(i | 788397770)), 765, (((~((-716003531) | i)) | 571283520) * 1530) + (((((~((-571283521) | i)) | (~((-144720011) | myTid))) | (~(788397770 | myTid))) * 765) - 1181173670), -1898574325);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    PngjException = (PngjBadCrcException + 87) % 128;
                    ((long[]) objArr[0])[0] = j + 5010;
                    Fpnative.valueOf = objArr;
                    this.enrollmentTs = str;
                    return;
                }
            }
            byte[] bArr = $$a;
            byte b = bArr[2];
            Object[] objArr3 = new Object[1];
            a(b, (byte) (b | 96), (byte) (bArr[30] - 1), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(bArr[32], (byte) 125, bArr[53], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1898574325);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5010;
            Fpnative.valueOf = objArr;
            this.enrollmentTs = str;
            return;
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
        PngjException = (PngjBadCrcException + 117) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
    
        if (0 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if (0 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004f, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a[0])[0]}, new int[1]};
        0 = defpackage.a.b(142163362);
        0 = ~((-120821665) | 0);
        0 = ~0;
        0 = defpackage.a.c(((~(0 | (-378067616))) | 20120864) | (~(120821664 | 0)), 904, (((~(0 | 398188479)) | (~((-100700801) | 0))) * 904) + (((0 | (~(378067615 | 0))) * (-1808)) - 123216441), 2143280105);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a[1])[0] = 0 ^ (0 << 5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setMatched(boolean z) {
        long j;
        Object[] objArr = Fpnative.valueOf;
        try {
            if (objArr != null) {
                int i = PngjBadCrcException + 75;
                PngjException = i % 128;
                if (i % 2 == 0) {
                    long j2 = ((long[]) objArr[0])[1];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, new Object[1])).longValue();
                } else {
                    long j3 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                }
                // ((long[]) $$a[0])[0] = j + 5009;
                Fpnative.valueOf = null;
                this.matched = z;
                return;
            }
            byte[] bArr = $$a;
            byte b = bArr[2];
            Object[] objArr2 = new Object[1];
            a(b, (byte) (b | 96), (byte) (bArr[30] - 1), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            a(bArr[32], (byte) 125, bArr[53], objArr3);
            Object[] objArr4 = (Object[]) cls.getMethod((String) objArr3[0], Integer.TYPE).invoke(null, 2143280105);
            j = ((long[]) objArr4[0])[0];
            ((long[]) objArr4[0])[0] = j + 5009;
            Fpnative.valueOf = objArr4;
            this.matched = z;
            return;
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
        PngjException = (PngjBadCrcException + 45) % 128;
    }

    public void setMatched_true_up_to_security_level(FingerMatchSecLevel fingerMatchSecLevel) {
        Object[] objArr;
        long j;
        PngjBadCrcException = (PngjException + 83) % 128;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i = (((~((-512960499) | identityHashCode)) | 503382592 | (~(14071218 | identityHashCode))) * (-880)) + 1434790607;
                    int i2 = (~((-512960499) | (~identityHashCode))) | (-14071219);
                    int i3 = ~(identityHashCode | 512960498);
                    int c = defpackage.a.c(i3, 880, ((i2 | i3) * (-880)) + i, -323864012);
                    int i4 = c ^ (c << 13);
                    int i5 = i4 ^ (i4 >>> 17);
                    ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                    ((long[]) objArr[0])[0] = j + 5047;
                    Fpnative.valueOf = objArr;
                    this.matched_true_up_to_security_level = fingerMatchSecLevel;
                }
            }
            byte[] bArr = $$a;
            byte b = bArr[2];
            Object[] objArr3 = new Object[1];
            a(b, (byte) (b | 96), (byte) (bArr[30] - 1), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(bArr[32], (byte) 125, bArr[53], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -323864012);
            j = ((long[]) objArr[0])[0];
            PngjBadCrcException = (PngjException + 43) % 128;
            ((long[]) objArr[0])[0] = j + 5047;
            Fpnative.valueOf = objArr;
            this.matched_true_up_to_security_level = fingerMatchSecLevel;
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
    }

    public void setScore(double d) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i = (int) Runtime.getRuntime().totalMemory();
                    int i2 = (((~(693544721 | i)) | (-194655442)) * 672) - 1966584481;
                    int i3 = ~i;
                    int c = defpackage.a.c((~(194655441 | i3)) | (-736016338), 672, (((~(i | (-194655442))) | (~((-693544722) | i3))) * (-672)) + i2, 1912922451);
                    int i4 = c ^ (c << 13);
                    int i5 = i4 ^ (i4 >>> 17);
                    ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                    ((long[]) objArr[0])[0] = j + 4882;
                    Fpnative.valueOf = objArr;
                    this.score = d;
                    return;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a(bArr[2], bArr[63], bArr[62], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr[63];
            Object[] objArr4 = new Object[1];
            a(b, bArr[57], b, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1912922451);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4882;
            Fpnative.valueOf = objArr;
            this.score = d;
            return;
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
        PngjBadCrcException = (PngjException + 45) % 128;
    }

    public VerifyResult(String str) {
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
                    int c = defpackage.a.c((~(maxMemory | 490828897)) | 582779520 | (~((~maxMemory) | (-83890241))), 988, (((~(1073608417 | 0)) | (~((-83890241) | maxMemory))) * 988) - 1172642441, -1244161780);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4886;
                    Fpnative.valueOf = objArr;
                    this.scores = new HashMap<>();
                    this.enrollmentTs = str;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a(bArr[2], bArr[3], bArr[111], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr[32];
            Object[] objArr4 = new Object[1];
            a(b, (byte) (b | 77), bArr[55], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1244161780);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4886;
            Fpnative.valueOf = objArr;
            this.scores = new HashMap<>();
            this.enrollmentTs = str;
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
    }
}
