package arid.chunks;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import arid.Action;
import com.d.e.onErrorResponse;
import com.identy.Fpnative;
import com.karumi.dexter.BuildConfig;
import defpackage.a;
import java.io.OutputStream;
import java.lang.reflect.Method;
import kotlin.io.encoding.Base64;

/* loaded from: classes.dex */
public abstract class PngjInputException {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$f = 0;
    private static int $10;
    private static int $11;
    private static long Action;
    private static int PngBadCharsetException;
    private static int PngjExceptionInternal;
    private static char[] PngjUnsupportedException;
    private static int a;
    protected PngjBadSignature PngjBadCrcException;
    public final String PngjBadSignature;
    public final boolean PngjException;
    private boolean PngjInputException;
    private boolean PngjOutputException;
    protected final Action values;
    boolean valueOf = false;
    int PngjPrematureEnding = -1;

    public enum values {
        NONE,
        BEFORE_PLTE_AND_IDAT,
        AFTER_PLTE_BEFORE_IDAT,
        AFTER_PLTE_BEFORE_IDAT_PLTE_REQUIRED,
        BEFORE_IDAT,
        AFTER_IDAT,
        NA;

        private static final byte[] $$a = null;
        private static final int $$b = 0;

        static {
            init$0();
        }

        private static void a(short s, short s2, int i, Object[] objArr) {
            int i2 = 99 - (s2 * 19);
            int i3 = i + 4;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[44 - s];
            int i4 = 43 - s;
            int i5 = -1;
            if (bArr == null) {
                int i6 = i3 + i2;
                int i7 = i3 + 1;
                int i8 = i6 - 13;
                i3 = i7;
                i2 = i8;
                bArr = bArr;
                i5 = -1;
            }
            while (true) {
                int i9 = i5 + 1;
                bArr2[i9] = (byte) i2;
                if (i9 == i4) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i3++;
                i2 = (i2 + bArr[i3]) - 13;
                bArr = bArr;
                i5 = i9;
            }
        }

        public static void init$0() {
            $$a = new byte[]{113, 99, 26, 66, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 36, 54, 17, 10, 10, 13, -43, 31, 8, 47, 30, 2, 26, 0, 24, 18, -72, 57, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 38, 59, 1, 8, 14, -10, 46, -27, 59, 1, 8, 14, -16, 42, 20, 17, 2, 26, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0};
            $$b = 73;
        }

        public static values valueOfString(String str) {
            Object[] objArr;
            long j;
            Object[] objArr2 = Fpnative.valueOf;
            try {
                if (objArr2 != null) {
                    long j2 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                    if (j2 > j) {
                        objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                        int a = a.a();
                        int c = a.c((~(a | 480937827)) | (~((~a) | (-17951453))) | (~(17951452 | a)), 831, ((~((-480904484) | a)) * (-1662)) + ((((~((-480937828) | r5)) | (~(498855935 | a))) * (-831)) - 1306489736), -66117936);
                        int i = c ^ (c << 13);
                        int i2 = i ^ (i >>> 17);
                        ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                        ((long[]) objArr[0])[0] = j + 4927;
                        Fpnative.valueOf = objArr;
                        return (values) Enum.valueOf(values.class, str);
                    }
                }
                byte[] bArr = $$a;
                byte b = bArr[59];
                byte b2 = bArr[27];
                Object[] objArr3 = new Object[1];
                a(b, b2, (byte) (b2 | Base64.padSymbol), objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                byte b3 = bArr[77];
                Object[] objArr4 = new Object[1];
                a((byte) 28, b3, (byte) (b3 | 88), objArr4);
                objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -66117936);
                j = ((long[]) objArr[0])[0];
                ((long[]) objArr[0])[0] = j + 4927;
                Fpnative.valueOf = objArr;
                return (values) Enum.valueOf(values.class, str);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static values[] valuesCustom() {
            Object[] objArr;
            long j;
            Object[] objArr2 = Fpnative.valueOf;
            try {
                if (objArr2 != null) {
                    long j2 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                    if (j2 > j) {
                        objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                        int a = a.a();
                        int c = a.c((~((~a) | 339618318)) | 159270961, 56, (((~(a | 159270961)) | 339618318) * 56) + 271233655, -224608341);
                        int i = c ^ (c << 13);
                        int i2 = i ^ (i >>> 17);
                        ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                        ((long[]) objArr[0])[0] = j + 4883;
                        Fpnative.valueOf = objArr;
                        return (values[]) values().clone();
                    }
                }
                byte b = $$a[27];
                byte b2 = b;
                Object[] objArr3 = new Object[1];
                a(b, b2, b2, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                a(r1[4], r1[77], r1[32], objArr4);
                objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -224608341);
                j = ((long[]) objArr[0])[0];
                ((long[]) objArr[0])[0] = j + 4883;
                Fpnative.valueOf = objArr;
                return (values[]) values().clone();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$g(int i, short s, byte b) {
        int i2;
        int i3;
        int i4 = i + 4;
        byte[] bArr = $$c;
        int i5 = b * 4;
        int i6 = 113 - (s * 9);
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i7 = 0;
            int i8 = i4;
            i4 += -i6;
            i2 = i8;
            bArr = bArr3;
            i3 = i7;
            bArr2[i3] = (byte) i4;
            i7 = i3 + 1;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
            int i9 = i2 + 1;
            byte b2 = bArr[i9];
            byte[] bArr4 = bArr;
            i8 = i9;
            i6 = b2;
            bArr3 = bArr4;
            i4 += -i6;
            i2 = i8;
            bArr = bArr3;
            i3 = i7;
            bArr2[i3] = (byte) i4;
            i7 = i3 + 1;
            if (i3 == i5) {
            }
        } else {
            i2 = i4;
            i4 = i6;
            i3 = 0;
            bArr2[i3] = (byte) i4;
            i7 = i3 + 1;
            if (i3 == i5) {
            }
        }
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        PngBadCharsetException = 0;
        a = 1;
        PngjExceptionInternal = 97773996;
        PngjUnsupportedException = new char[]{26031, 8515, 60535, 43799, 30267, 15727, 63695, 34809, 17097, 2547, 29786, 12469, 64984, 47786, 26504, 11460, 29779, 29704, 12540, 64986, 47788, 26510, 11404, 9701, 24842, 44064, 60243, 13944, 32104, 47259, 51131, 40863, 56165, 5645, 20776, 35843, 50945, 739, 32201, 47286, 62342, 11973, 27245, 42328, 57400, 23354, 38402, 53756, 3289, 18343, 33469, 64915, 14715, 29765, 48223, 63653, 13773, 29416, 44995, 58561, 8483, 24073, 39798, 53318, 3333, 18867, 34432, 50149, 30971, 46529, 62000, 12116, 25726, 41321, 56911, 6827, 22417, 35981, 51686, 1750, 17198, 63490, 13580, 29300, 29781, 12536, 64960, 47788, 26569, 11408, 59774, 38466, 21302, 6218, 50448, 33275, 20165, 2981, 45301, 32151, 14959, 59215, 44081, 26936, 5649, 53992, 40898, 17623, 439, 52955, 35710, 12356, 29771, 29726, 12528, 64961, 47804, 26499, 11403, 59764, 847, 18350, 35484, 52732, 4298, 40291, 55706, 29718, 12530, 64979, 47807, 26499, 11403, 59747, 38466, 21297, 6161, 50514, 33252, 20186, 2976, 45226, 32135, 29706, 12527, 64987, 47788, 26516, 11416, 59774, 38464, 29706, 12527, 64987, 47785, 26501, 11414, 59772, 38471, 21287, 6150, 50440, 33267, 29706, 12527, 64987, 47785, 26501, 11414, 59772, 38471, 21287, 6150, 50440, 33268, 20186, 2989, 29704, 12536, 64985, 47776, 26515, 11415, 59748, 38028, 53360, 7518, 23101, 34574, 52253, 2533, 57417, 42153, 27014, 12014, 62405, 47324, 58504, 41065, 29705, 12540, 64986, 47782, 26514, 11408, 59754, 38478, 21296, 6216, 50447, 33251, 20175, 2997, 45229, 32128, 58259, 42863, 27231, 11578, 61460, 47873, 32467, 453, 50363, 36766, 21183, 5730, 55644, 39995, 10027, 40708, 56255, 5788, 20973, 36035, 51149, 556, 32085, 47217, 62301, 11843, 27369, 13634, 29178, 48337, 64439, 9874, 28097, 43124, 55129, 4665, 22804, 33860, 49395, 4045, 19127, 61883, 15505, 31598, 56429, 39126, 22005, 4740, 53162, 33956, 16709, 29781, 12526, 64973, 47804, 26514, 11420, 59773, 38404, 21297, 6151, 50453, 33273, 29781, 12526, 64982, 47782, 26504, 2241, 19564, 33108, 50744, 29721, 12516, 64981, 47777, 26505, 11422, 59765, 38469, 21295, 6154, 50456, 56490, 38918, 21802, 4676, 53112, 33833, 16771, 16059, 64478, 45307, 28143, 10567, 58921, 41820, 6222, 54626, 37594, 29781, 12526, 64982, 47782, 26504, 11478, 6946, 24473, 37562, 54731, 2277, 17387, 34314, 63859, 15447, 30587, 43621, 61135, 8639, 25815, 57286, 4840, 21774, 34875, 50005, 1613, 31022, 46214, 61501, 15646, 31343, 42817, 60495, 10670, 22231, 37858, 55506, 1408, 16700, 36383, 52091, 28773, 48399, 29781, 12526, 64973, 47804, 26514, 11420, 59773, 38404, 21303, 6166, 50446, 33208, 20185, 2980, 45301, 32157, 14959, 59208, 44064, 26994, 5636, 53990, 40911, 17615, 509, 63830, 48621, 28878, 14271, 60049, 41375, 25726, 6919, 56889, 38148, 18454, 3322, 50050, 29781, 12520, 64967, 47805, 26569, 11419, 59769, 38469, 21357, 35665, 53213, 745, 17798, 39115, 54178, 63154, 45578, 32545, 14407, 58722, 44593, 29781, 12528, 64987, 47802, 26504, 11405, 59747, 29705, 12521, 64981, 47805, 26514};
        Action = -7552018824929922915L;
    }

    public PngjInputException(String str, Action action) {
        this.PngjBadSignature = str;
        this.values = action;
        this.PngjException = valueOf.valueOf(str);
        this.PngjInputException = valueOf.PngjException(str);
        this.PngjOutputException = valueOf.values(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, boolean z, String str, int i2, int i3, Object[] objArr) {
        char[] cArr;
        Throwable cause;
        char c;
        int i4;
        int i5 = $11 + 99;
        int i6 = i5 % 128;
        $10 = i6;
        if (i5 % 2 != 0) {
            throw null;
        }
        if (str != null) {
            $11 = (i6 + 79) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.d.e.Action action = new com.d.e.Action();
        char[] cArr3 = new char[i];
        action.valueOf = 0;
        while (true) {
            int i7 = action.valueOf;
            if (i7 >= i) {
                break;
            }
            char c2 = cArr2[i7];
            action.values = c2;
            char c3 = (char) (i3 + c2);
            cArr3[i7] = c3;
            try {
                Object[] objArr2 = {Integer.valueOf(c3), Integer.valueOf(PngjExceptionInternal)};
                Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(610361420);
                if (PngjBadSignature == null) {
                    char c4 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int defaultSize = 28 - View.getDefaultSize(0, 0);
                    int makeMeasureSpec = 1531 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    byte b = (byte) (-1);
                    i4 = -743328348;
                    byte b2 = (byte) (-b);
                    c = 1;
                    String $$g = $$g(b, b2, (byte) (b2 - 1));
                    Class cls = Integer.TYPE;
                    PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(c4, defaultSize, makeMeasureSpec, -661778953, false, $$g, new Class[]{cls, cls});
                } else {
                    c = 1;
                    i4 = -743328348;
                }
                cArr3[i7] = ((Character) ((Method) PngjBadSignature).invoke(null, objArr2)).charValue();
                Object[] objArr3 = new Object[2];
                objArr3[c] = action;
                objArr3[0] = action;
                Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i4);
                if (PngjBadSignature2 == null) {
                    PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) Color.green(0), ExpandableListView.getPackedPositionGroup(0L) + 40, 190 - (ViewConfiguration.getLongPressTimeout() >> 16), 794744863, false, "j", new Class[]{Object.class, Object.class});
                }
                ((Method) PngjBadSignature2).invoke(null, objArr3);
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
            $11 = ($10 + 123) % 128;
            action.PngjException = i2;
            char[] cArr4 = new char[i];
            System.arraycopy(cArr3, 0, cArr4, 0, i);
            int i8 = action.PngjException;
            System.arraycopy(cArr4, 0, cArr3, i - i8, i8);
            int i9 = action.PngjException;
            System.arraycopy(cArr4, i9, cArr3, 0, i - i9);
        }
        if (z) {
            $11 = ($10 + 11) % 128;
            char[] cArr5 = new char[i];
            action.valueOf = 0;
            while (true) {
                int i10 = action.valueOf;
                if (i10 >= i) {
                    break;
                }
                cArr5[i10] = cArr3[(i - i10) - 1];
                Object[] objArr4 = {action, action};
                Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-743328348);
                if (PngjBadSignature3 == null) {
                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 40 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 190 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 794744863, false, "j", new Class[]{Object.class, Object.class});
                }
                ((Method) PngjBadSignature3).invoke(null, objArr4);
            }
            cArr3 = cArr5;
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(char c, int i, int i2, Object[] objArr) {
        Throwable cause;
        float f;
        char c2;
        int i3;
        int i4;
        onErrorResponse onerrorresponse = new onErrorResponse();
        long[] jArr = new long[i];
        onerrorresponse.PngjBadSignature = 0;
        $10 = ($11 + 5) % 128;
        while (true) {
            int i5 = onerrorresponse.PngjBadSignature;
            if (i5 >= i) {
                break;
            }
            int i6 = $11 + 109;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            Class cls = Integer.TYPE;
            if (i7 != 0) {
                try {
                    Object[] objArr2 = {Integer.valueOf(PngjUnsupportedException[i2 >>> i5])};
                    Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(1678178881);
                    if (PngjBadSignature == null) {
                        c2 = 1;
                        f = 0.0f;
                        byte b = (byte) (-1);
                        i3 = 57266;
                        byte b2 = (byte) (b + 1);
                        i4 = -173046460;
                        PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 19, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 585, -1729521670, false, $$g(b, b2, b2), new Class[]{cls});
                    } else {
                        f = 0.0f;
                        c2 = 1;
                        i3 = 57266;
                        i4 = -173046460;
                    }
                    Long l = (Long) ((Method) PngjBadSignature).invoke(null, objArr2);
                    l.longValue();
                    long j = i5;
                    long j2 = Action;
                    Object[] objArr3 = new Object[4];
                    objArr3[3] = Integer.valueOf(c);
                    objArr3[2] = Long.valueOf(j2);
                    objArr3[c2] = Long.valueOf(j);
                    objArr3[0] = l;
                    Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i4);
                    if (PngjBadSignature2 == null) {
                        char mode = (char) (View.MeasureSpec.getMode(0) + i3);
                        int tapTimeout = 35 - (ViewConfiguration.getTapTimeout() >> 16);
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 51;
                        Class cls2 = Long.TYPE;
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(mode, tapTimeout, scrollDefaultDelay, 155248895, false, "t", new Class[]{cls2, cls2, cls2, cls});
                    }
                    jArr[i5] = ((Long) ((Method) PngjBadSignature2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = new Object[2];
                    objArr4[c2] = onerrorresponse;
                    objArr4[0] = onerrorresponse;
                    Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(818986954);
                    if (PngjBadSignature3 == null) {
                        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getPressedStateDuration() >> 16), 36 - (ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)), 155 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -868232591, false, "p", new Class[]{Object.class, Object.class});
                    }
                    ((Method) PngjBadSignature3).invoke(null, objArr4);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
            } else {
                Object[] objArr5 = {Integer.valueOf(PngjUnsupportedException[i2 + i5])};
                Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1678178881);
                if (PngjBadSignature4 == null) {
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (b3 + 1);
                    PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ExpandableListView.getPackedPositionGroup(0L), Gravity.getAbsoluteGravity(0, 0) + 19, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 586, -1729521670, false, $$g(b3, b4, b4), new Class[]{cls});
                }
                Long l2 = (Long) ((Method) PngjBadSignature4).invoke(null, objArr5);
                l2.longValue();
                Object[] objArr6 = {l2, Long.valueOf(i5), Long.valueOf(Action), Integer.valueOf(c)};
                Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-173046460);
                if (PngjBadSignature5 == null) {
                    char c3 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 57266);
                    int indexOf = TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 36;
                    int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 51;
                    Class cls3 = Long.TYPE;
                    PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c3, indexOf, touchSlop, 155248895, false, "t", new Class[]{cls3, cls3, cls3, cls});
                }
                jArr[i5] = ((Long) ((Method) PngjBadSignature5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {onerrorresponse, onerrorresponse};
                Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(818986954);
                if (PngjBadSignature6 == null) {
                    PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 1), 34 - ((byte) KeyEvent.getModifierMetaStateMask()), 155 - (Process.myTid() >> 22), -868232591, false, "p", new Class[]{Object.class, Object.class});
                }
                ((Method) PngjBadSignature6).invoke(null, objArr7);
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i];
        onerrorresponse.PngjBadSignature = 0;
        while (true) {
            int i8 = onerrorresponse.PngjBadSignature;
            if (i8 >= i) {
                objArr[0] = new String(cArr);
                return;
            }
            int i9 = $11 + 89;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr[i8] = (char) jArr[i8];
                Object[] objArr8 = {onerrorresponse, onerrorresponse};
                Object PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(818986954);
                if (PngjBadSignature7 == null) {
                    PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), View.combineMeasuredStates(0, 0) + 35, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 154, -868232591, false, "p", new Class[]{Object.class, Object.class});
                }
                ((Method) PngjBadSignature7).invoke(null, objArr8);
                int i10 = 10 / 0;
            } else {
                cArr[i8] = (char) jArr[i8];
                Object[] objArr9 = {onerrorresponse, onerrorresponse};
                Object PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(818986954);
                if (PngjBadSignature8 == null) {
                    PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 35, 155 - (ViewConfiguration.getWindowTouchSlop() >> 8), -868232591, false, "p", new Class[]{Object.class, Object.class});
                }
                ((Method) PngjBadSignature8).invoke(null, objArr9);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(int i, short s, short s2, Object[] objArr) {
        short s3;
        int i2 = s + 97;
        int i3 = 5 - i;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[s2 + 1];
        if (bArr == null) {
            byte[] bArr3 = bArr;
            short s4 = 0;
            int i4 = i2;
            int i5 = i3;
            int i6 = i5 + 1;
            i2 = (i4 + i3) - 23;
            i3 = i6;
            bArr = bArr3;
            s3 = s4;
            bArr2[s3] = (byte) i2;
            if (s3 == s2) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i7 = i2;
            i5 = i3;
            i3 = bArr[i3];
            s4 = s3 + 1;
            bArr3 = bArr;
            i4 = i7;
            int i62 = i5 + 1;
            i2 = (i4 + i3) - 23;
            i3 = i62;
            bArr = bArr3;
            s3 = s4;
            bArr2[s3] = (byte) i2;
            if (s3 == s2) {
            }
        } else {
            s3 = 0;
            bArr2[s3] = (byte) i2;
            if (s3 == s2) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{73, 25, -23, 110, -29, 13, 28};
        $$b = 175;
    }

    public static void init$1() {
        $$c = new byte[]{49, -88, 79, -64};
        $$f = 116;
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1602)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:298)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    /* JADX WARN: Multi-variable search skipped. Vars limit reached: 7084 (expected less than 5000) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v444 */
    /* JADX WARN: Type inference failed for: r8v445 */
    /* JADX WARN: Type inference failed for: r8v692 */
    public static java.lang.Object[] values$52c725b(int r79, java.lang.Object r80) {
        /*
            Method dump skipped, instructions count: 17983
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: arid.chunks.PngjInputException.values$52c725b(int, java.lang.Object):java.lang.Object[]");
    }

    public abstract values PngjBadCrcException();

    public abstract boolean PngjBadSignature();

    public String toString() {
        int i;
        long j;
        Object[] objArr = new Object[1];
        c((char) (KeyEvent.getDeadChar(0, 0) + 4534), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 9, 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
        StringBuilder sb = new StringBuilder((String) objArr[0]);
        sb.append(this.PngjBadSignature);
        Object[] objArr2 = new Object[1];
        c((char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), 6 - View.combineMeasuredStates(0, 0), 10 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr2);
        sb.append((String) objArr2[0]);
        PngjBadSignature pngjBadSignature = this.PngjBadCrcException;
        if (pngjBadSignature != null) {
            int i2 = PngBadCharsetException + 103;
            a = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            i = pngjBadSignature.PngjException;
        } else {
            i = -1;
        }
        sb.append(i);
        Object[] objArr3 = new Object[1];
        b(Color.red(0) + 8, false, "\n\u0017\t\u0018￡ￄ\u0013\n", (ViewConfiguration.getLongPressTimeout() >> 16) + 5, 259 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr3);
        sb.append((String) objArr3[0]);
        PngjBadSignature pngjBadSignature2 = this.PngjBadCrcException;
        if (pngjBadSignature2 != null) {
            j = pngjBadSignature2.values;
            a = (PngBadCharsetException + 117) % 128;
        } else {
            PngBadCharsetException = (a + 19) % 128;
            j = -1;
        }
        sb.append(j);
        Object[] objArr4 = new Object[1];
        c((char) (ViewConfiguration.getJumpTapTimeout() >> 16), -TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0'), 16 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), objArr4);
        sb.append((String) objArr4[0]);
        String obj = sb.toString();
        int i3 = PngBadCharsetException + 83;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            return obj;
        }
        throw null;
    }

    public final void valueOf(OutputStream outputStream) {
        PngBadCharsetException = (a + 119) % 128;
        PngjBadSignature pngjBadSignature = this.PngjBadCrcException;
        if (pngjBadSignature == null || pngjBadSignature.valueOf == null) {
            this.PngjBadCrcException = values();
        }
        PngjBadSignature pngjBadSignature2 = this.PngjBadCrcException;
        if (pngjBadSignature2 == null) {
            Object[] objArr = new Object[1];
            b((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 33, false, "\u0018ￆ\u0014\u001b\u0012\u0012ￆ\t\u000e\u001b\u0014\u0011ￆￇￆ\t\u0018\u000b\u0007\u001a\u000f\u0015\u0014ￆ\f\u0007\u000f\u0012\u000b\nￆ\f\u0015", 2 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 256 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
            throw new arid.PngjExceptionInternal(((String) objArr[0]).concat(String.valueOf(this)));
        }
        PngBadCharsetException = (a + 99) % 128;
        pngjBadSignature2.PngjBadCrcException(outputStream);
        int i = PngBadCharsetException + 75;
        a = i % 128;
        if (i % 2 == 0) {
            int i2 = 94 / 0;
        }
    }

    public abstract PngjBadSignature values();
}
