package arid.a;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import arid.Action;
import arid.AridA;
import arid.e1;
import com.d.e.PngjOutputException;
import com.d.e.PngjPrematureEnding;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.karumi.dexter.BuildConfig;
import java.io.OutputStream;
import java.lang.reflect.Method;
import kotlin.UByte;

/* loaded from: classes.dex */
public abstract class PngjException {
    private static byte[] $$a = null;
    private static int $$b = 0;
    private static byte[] $$c = null;
    private static int $$d = 0;
    private static int $10;
    private static int $11;
    private static char Attempt;
    private static char PngBadCharsetException;
    private static char a;
    private static char getAsHighestSecurityLevelReached;
    private static int getData;
    private static int getPadSub1;
    private static int getPadSub2;
    private static int getPadSub3;
    private static int getQualityScore;
    private static short[] getScore;
    private static byte[] isQualityFailed;
    protected arid.valueOf PngjBadCrcException;
    protected final int PngjBadSignature;
    public OutputStream PngjExceptionInternal;
    private int PngjOutputException;
    protected int PngjPrematureEnding;
    private int PngjUnsupportedException;
    private valueOf onErrorResponse;
    protected final Action valueOf;
    public int values = 6;
    private int Action = 0;
    protected boolean PngjException = false;
    private final int[] e1 = new int[5];
    public int PngjInputException = 32000;

    public static /* synthetic */ class PngjBadCrcException {
        static final /* synthetic */ int[] PngjBadSignature;

        static {
            int[] iArr = new int[arid.valueOf.valuesCustom().length];
            PngjBadSignature = iArr;
            try {
                iArr[arid.valueOf.FILTER_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PngjBadSignature[arid.valueOf.FILTER_PAETH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PngjBadSignature[arid.valueOf.FILTER_SUB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                PngjBadSignature[arid.valueOf.FILTER_AVERAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                PngjBadSignature[arid.valueOf.FILTER_UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$e(int i, byte b, int i2) {
        int i3;
        int i4;
        int i5;
        byte[] bArr = $$c;
        int i6 = (i * 4) + 4;
        int i7 = (b * 3) + 1;
        int i8 = i2 + 105;
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            i3 = i6;
            int i9 = i7;
            i5 = 0;
            i6 += -i9;
            i3++;
            i4 = i5;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i6;
            if (i5 == i7) {
                return new String(bArr2, 0);
            }
            i9 = bArr[i3];
            i6 += -i9;
            i3++;
            i4 = i5;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i6;
            if (i5 == i7) {
            }
        } else {
            i3 = i6;
            i6 = i8;
            i4 = 0;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i6;
            if (i5 == i7) {
            }
        }
        return new String(bArr2, 0);
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getQualityScore = 0;
        getData = 1;
        PngBadCharsetException = (char) 54545;
        a = (char) 20559;
        Attempt = (char) 59698;
        getAsHighestSecurityLevelReached = (char) 41702;
        getPadSub1 = -341674776;
        getPadSub2 = -961251469;
        getPadSub3 = -1791434657;
        isQualityFailed = new byte[]{108, 108, -5, -9, 94, -12, -31, -7, 81, -14, -12, 17, -84, 98, -5, 107, -12, 80, 46, -73, 39, -86, -30, -30, -79, -67, 37, -94, -21, 76, -47, -10, -86, -69, -70, -67, -18, -74, -19, -13, -87, -73, -65, -29, -23, -11, -95, -66, -20, -12, -82, 77, -45, -67, -11, -82, 77, -45, -67, -11, 6, -89, 9, -100, 3, -74, -83, -64, -100, -111, 9, -100, 3, -106, 77, 80, 31, 0, 5, -108, 12, -107, 84, -91, 8, -122, -94, 107, -72, 94, -93, -89, -96, -95, 109, 114, -112, 82, -93, -14, -125, 23, -13, -14, 46, 57, 38, 43, 16, -71, -71, 20, -85, 20, -45, -66, -96, -68, -86, -111, -68, 14, -17, 125, -45, -83, 75, -110, -85, -65, 123, -19, -109, 10, -46, -81, -107, -69, -90, -77, 126, 46, -70, 47, -73, -65, 110, 118, 21, -93, 94, 10, 21, -67, 45, -65, -71, 38, -77, 4, 76, 25, -77, -70, 122, -68, 0, 3, 3, -91, 17, 72, 0, 25, -73, 103, -68, 6, 75, 2, 79, 73, 89, -60, 70, -75, 89, 112, 1, 0, 3, -76, 28, -77, -36, -9, -105, -39, -81, -81, -12, -78, -91, -37, -37, -81, -87, -6, -119, -46, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79};
    }

    public PngjException(Action action) {
        this.valueOf = action;
        int i = action.PngjPrematureEnding;
        this.PngjOutputException = i;
        this.PngjBadSignature = i + 1;
        this.PngjUnsupportedException = action.PngjInputException;
        this.PngjPrematureEnding = -1;
        this.PngjBadCrcException = arid.valueOf.FILTER_DEFAULT;
    }

    private static void b(String str, int i, Object[] objArr) throws Throwable {
        char[] cArr;
        if (str != null) {
            int i2 = $11 + 77;
            $10 = i2 % 128;
            if (i2 % 2 != 0) {
                cArr = str.toCharArray();
                int i3 = 87 / 0;
            } else {
                cArr = str.toCharArray();
            }
        } else {
            cArr = str != null ? str.toCharArray() : null;
        }
        char[] cArr2 = cArr;
        PngjOutputException pngjOutputException = new PngjOutputException();
        char[] cArr3 = new char[cArr2.length];
        pngjOutputException.values = 0;
        char[] cArr4 = new char[2];
        while (true) {
            int i4 = pngjOutputException.values;
            if (i4 >= cArr2.length) {
                objArr[0] = new String(cArr3, 0, i);
                return;
            }
            cArr4[0] = cArr2[i4];
            char c = 1;
            cArr4[1] = cArr2[i4 + 1];
            int i5 = 58224;
            int i6 = 0;
            while (i6 < 16) {
                $11 = ($10 + 97) % 128;
                char c2 = cArr4[c];
                char c3 = cArr4[0];
                char c4 = c;
                int i7 = (c3 + i5) ^ ((c3 << 4) + ((char) (Attempt ^ (-4937072311772145044L))));
                int i8 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getAsHighestSecurityLevelReached);
                    objArr2[2] = Integer.valueOf(i8);
                    objArr2[c4] = Integer.valueOf(i7);
                    objArr2[0] = Integer.valueOf(c2);
                    Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(-222953304);
                    Class cls = Integer.TYPE;
                    if (PngjBadSignature == null) {
                        PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) View.resolveSize(0, 0), Color.rgb(0, 0, 0) + 16777251, 155 - View.MeasureSpec.getSize(0), 240741651, false, "n", new Class[]{cls, cls, cls, cls});
                    }
                    char charValue = ((Character) ((Method) PngjBadSignature).invoke(null, objArr2)).charValue();
                    cArr4[c4] = charValue;
                    char c5 = cArr4[0];
                    int i9 = (charValue + i5) ^ ((charValue << 4) + ((char) (PngBadCharsetException ^ (-4937072311772145044L))));
                    int i10 = charValue >>> 5;
                    Object[] objArr3 = new Object[4];
                    objArr3[3] = Integer.valueOf(a);
                    objArr3[2] = Integer.valueOf(i10);
                    objArr3[c4] = Integer.valueOf(i9);
                    objArr3[0] = Integer.valueOf(c5);
                    Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-222953304);
                    if (PngjBadSignature2 == null) {
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) View.resolveSizeAndState(0, 0, 0), MotionEvent.axisFromString(BuildConfig.FLAVOR) + 36, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + ModuleDescriptor.MODULE_VERSION, 240741651, false, "n", new Class[]{cls, cls, cls, cls});
                    }
                    cArr4[0] = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6++;
                    c = c4;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char c6 = c;
            int i11 = pngjOutputException.values;
            cArr3[i11] = cArr4[0];
            cArr3[i11 + 1] = cArr4[c6];
            Object[] objArr4 = new Object[2];
            objArr4[c6] = pngjOutputException;
            objArr4[0] = pngjOutputException;
            Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(150653722);
            if (PngjBadSignature3 == null) {
                byte b = (byte) 0;
                byte b2 = b;
                PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (8055 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0')), 32 - (ViewConfiguration.getPressedStateDuration() >> 16), 665 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), -199907679, false, $$e(b, b2, (byte) (b2 | 9)), new Class[]{Object.class, Object.class});
            }
            ((Method) PngjBadSignature3).invoke(null, objArr4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, byte b2, short s, Object[] objArr) {
        byte b3;
        int i = 112 - b;
        int i2 = s + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[b2 + 1];
        if (bArr == null) {
            byte[] bArr3 = bArr;
            byte b4 = 0;
            int i3 = i2;
            i2++;
            i += i3;
            bArr = bArr3;
            b3 = b4;
            bArr2[b3] = (byte) i;
            if (b3 == b2) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b5 = bArr[i2];
            byte[] bArr4 = bArr;
            i3 = i;
            i = b5;
            b4 = (byte)(b3 + 1);
            bArr3 = bArr4;
            i2++;
            i += i3;
            bArr = bArr3;
            b3 = b4;
            bArr2[b3] = (byte) i;
            if (b3 == b2) {
            }
        } else {
            b3 = 0;
            bArr2[b3] = (byte) i;
            if (b3 == b2) {
            }
        }
    }

    private static void d(int i, byte b, short s, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        long j;
        long j2;
        int i5;
        int i6;
        int i7;
        char c;
        int i8;
        int i9;
        int i10;
        int i11;
        PngjPrematureEnding pngjPrematureEnding = new PngjPrematureEnding();
        StringBuilder sb = new StringBuilder();
        try {
            int i12 = 1;
            Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(getPadSub2)};
            int i13 = 0;
            Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1302984176);
            Class cls = Integer.TYPE;
            if (PngjBadSignature == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (60329 - (KeyEvent.getMaxKeyCode() >> 16)), 32 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), View.resolveSizeAndState(0, 0, 0) + 1167, 1320773547, false, $$e(b2, b3, b3), new Class[]{cls, cls});
            }
            int intValue = ((Integer) ((Method) PngjBadSignature).invoke(null, objArr2)).intValue();
            boolean z = intValue == -1;
            if (z) {
                byte[] bArr = isQualityFailed;
                if (bArr != null) {
                    int length = bArr.length;
                    i9 = 60329;
                    byte[] bArr2 = new byte[length];
                    int i14 = 0;
                    j = 0;
                    while (i14 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i14])};
                        Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1053815139);
                        if (PngjBadSignature2 == null) {
                            i10 = i12;
                            byte b4 = (byte) i13;
                            i11 = i13;
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (14830 - (ViewConfiguration.getPressedStateDuration() >> 16)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 28, (ExpandableListView.getPackedPositionForChild(i13, i13) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i13, i13) == 0L ? 0 : -1)) + 722, 1038050086, false, $$e(b4, b4, (byte) $$c.length), new Class[]{cls});
                        } else {
                            i10 = i12;
                            i11 = i13;
                        }
                        bArr2[i14] = ((Byte) ((Method) PngjBadSignature2).invoke(null, objArr3)).byteValue();
                        i14++;
                        i12 = i10;
                        i13 = i11;
                    }
                    i4 = i12;
                    i8 = i13;
                    j2 = -6165791747575875761L;
                    $11 = ($10 + 113) % 128;
                    bArr = bArr2;
                } else {
                    i4 = 1;
                    i8 = 0;
                    i9 = 60329;
                    j = 0;
                    j2 = -6165791747575875761L;
                }
                if (bArr != null) {
                    byte[] bArr3 = isQualityFailed;
                    Object[] objArr4 = new Object[2];
                    objArr4[i4] = Integer.valueOf(getPadSub1);
                    objArr4[i8] = Integer.valueOf(i3);
                    Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1302984176);
                    if (PngjBadSignature3 == null) {
                        int i15 = i8;
                        byte b5 = (byte) i15;
                        byte b6 = b5;
                        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((ViewConfiguration.getScrollBarSize() >> 8) + i9), 32 - View.resolveSizeAndState(i15, i15, i15), 1167 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1320773547, false, $$e(b5, b6, b6), new Class[]{cls, cls});
                    }
                    intValue = (byte) (((byte) (bArr3[((Integer) ((Method) PngjBadSignature3).invoke(null, objArr4)).intValue()] ^ j2)) + ((int) (getPadSub2 ^ j2)));
                } else {
                    intValue = (short) (((short) (getScore[i3 + ((int) (getPadSub1 ^ j2))] ^ j2)) + ((int) (getPadSub2 ^ j2)));
                }
            } else {
                i4 = 1;
                j = 0;
                j2 = -6165791747575875761L;
            }
            if (intValue > 0) {
                int i16 = ((i3 + intValue) - 2) + ((int) (getPadSub1 ^ j2));
                if (z) {
                    $10 = ($11 + 75) % 128;
                    i5 = i4;
                } else {
                    i5 = 0;
                }
                pngjPrematureEnding.values = i16 + i5;
                int i17 = getPadSub3;
                Object[] objArr5 = new Object[4];
                objArr5[3] = sb;
                objArr5[2] = Integer.valueOf(i17);
                objArr5[i4] = Integer.valueOf(i2);
                objArr5[0] = pngjPrematureEnding;
                Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1013119226);
                if (PngjBadSignature4 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 45718), (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 39, (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 625, 1064463037, false, $$e(b7, b8, (byte) (b8 + 3)), new Class[]{Object.class, cls, cls, Object.class});
                }
                ((StringBuilder) ((Method) PngjBadSignature4).invoke(null, objArr5)).append(pngjPrematureEnding.valueOf);
                pngjPrematureEnding.PngjBadCrcException = pngjPrematureEnding.valueOf;
                byte[] bArr4 = isQualityFailed;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i18 = 0; i18 < length2; i18++) {
                        bArr5[i18] = (byte) (bArr4[i18] ^ j2);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    i7 = i4;
                    i6 = i7;
                } else {
                    i6 = i4;
                    i7 = 0;
                }
                while (true) {
                    pngjPrematureEnding.PngjException = i6;
                    if (pngjPrematureEnding.PngjException >= intValue) {
                        break;
                    }
                    if (i7 == 0) {
                        short[] sArr = getScore;
                        pngjPrematureEnding.values = pngjPrematureEnding.values - 1;
                        pngjPrematureEnding.valueOf = (char) (pngjPrematureEnding.PngjBadCrcException + (((short) (((short) (sArr[pngjPrematureEnding.values] ^ j2)) + s)) ^ b));
                        $10 = ($11 + 103) % 128;
                    } else {
                        int i19 = $11 + 61;
                        $10 = i19 % 128;
                        if (i19 % 2 != 0) {
                            byte[] bArr6 = isQualityFailed;
                            pngjPrematureEnding.values = pngjPrematureEnding.values;
                            c = (char) (pngjPrematureEnding.PngjBadCrcException >>> (((byte) (((byte) (bArr6[pngjPrematureEnding.values] * j2)) / s)) ^ b));
                        } else {
                            byte[] bArr7 = isQualityFailed;
                            pngjPrematureEnding.values = pngjPrematureEnding.values - 1;
                            c = (char) (pngjPrematureEnding.PngjBadCrcException + (((byte) (((byte) (bArr7[pngjPrematureEnding.values] ^ j2)) + s)) ^ b));
                        }
                        pngjPrematureEnding.valueOf = c;
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
        $$a = new byte[]{117, 44, -20, -120, -10, 5, -52, 30, -7, 3, -37, 51, -21, 2, 11, 4, -11, 6, -1};
        $$b = 108;
    }

    public static void init$1() {
        $$c = new byte[]{31, 93, -84, 91};
        $$d = 127;
    }

    public final void PngjBadCrcException(byte[] bArr) {
        boolean z = this.PngjException;
        if (!z) {
            int i = getQualityScore;
            getData = (i + 85) % 128;
            if (!z) {
                int i2 = i + 55;
                getData = i2 % 128;
                int i3 = i2 % 2;
                PngjBadSignature();
                this.PngjException = true;
            }
        }
        this.PngjPrematureEnding++;
        PngjBadSignature(bArr);
    }

    public void PngjBadSignature() {
        e1 e1Var = new e1(this.PngjExceptionInternal, this.PngjInputException);
        if (this.onErrorResponse == null) {
            int i = this.PngjBadSignature;
            Action action = this.valueOf;
            if (action.Action < 0) {
                action.Action = (action.PngjPrematureEnding + 1) * action.valueOf;
            }
            this.onErrorResponse = new PngjBadSignature(e1Var, i, action.Action, this.values, 0);
        }
    }

    public abstract void PngjBadSignature(byte[] bArr);

    public final void PngjException(byte[] bArr) {
        getData = (getQualityScore + 59) % 128;
        this.onErrorResponse.write(bArr, 0, bArr.length);
        int[] iArr = this.e1;
        byte b = bArr[0];
        iArr[b] = iArr[b] + 1;
        getQualityScore = (getData + 49) % 128;
    }

    public final boolean PngjExceptionInternal() {
        int i = getData;
        getQualityScore = (i + 75) % 128;
        if (this.PngjPrematureEnding != this.valueOf.valueOf - 1) {
            return false;
        }
        int i2 = i + 13;
        getQualityScore = i2 % 128;
        return i2 % 2 == 0;
    }

    public final arid.valueOf PngjPrematureEnding() {
        Action action = this.valueOf;
        boolean z = action.PngjExceptionInternal;
        if (action.PngjBadCrcException < 8) {
            return arid.valueOf.FILTER_NONE;
        }
        if (action.PngjOutputException < 0) {
            int i = getQualityScore + 91;
            getData = i % 128;
            action.PngjOutputException = i % 2 == 0 ? action.values | action.valueOf : action.values * action.valueOf;
        }
        if (action.PngjOutputException < 1024) {
            getQualityScore = (getData + 83) % 128;
            return arid.valueOf.FILTER_NONE;
        }
        if (action.valueOf == 1) {
            return arid.valueOf.FILTER_SUB;
        }
        if (action.values == 1) {
            getData = (getQualityScore + 105) % 128;
            return arid.valueOf.FILTER_UP;
        }
        arid.valueOf valueof = arid.valueOf.FILTER_PAETH;
        int i2 = getQualityScore + 37;
        getData = i2 % 128;
        if (i2 % 2 != 0) {
            return valueof;
        }
        throw null;
    }

    public final arid.valueOf valueOf() {
        int i = getData;
        arid.valueOf valueof = this.PngjBadCrcException;
        getQualityScore = (i + 109) % 128;
        return valueof;
    }

    public abstract byte[] values();

    public final void valueOf(arid.valueOf valueof) {
        int i = getQualityScore + 27;
        getData = i % 128;
        int i2 = i % 2;
        this.PngjBadCrcException = valueof;
        if (i2 == 0) {
            throw null;
        }
    }

    public final void PngjException() {
        int i = getQualityScore + 85;
        getData = i % 128;
        if (i % 2 != 0) {
            if (this.PngjException) {
                return;
            }
            PngjBadSignature();
            this.PngjException = true;
            getData = (getQualityScore + 77) % 128;
            return;
        }
        throw null;
    }

    public final byte[] PngjBadCrcException(arid.valueOf valueof, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i;
        int i2;
        int i3;
        if (valueof == arid.valueOf.FILTER_NONE) {
            getQualityScore = (getData + 43) % 128;
            bArr3 = bArr;
        }
        bArr3[0] = (byte) valueof.Action;
        int i4;
        switch (valueof) {
            case FILTER_NONE: i4 = 1; break;
            case FILTER_PAETH: i4 = 2; break;
            case FILTER_SUB: i4 = 3; break;
            case FILTER_UP: i4 = 4; break;
            case FILTER_AVERAGE: i4 = 5; break;
            default: i4 = 0; break;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                int i5 = 1;
                while (true) {
                    i = this.PngjUnsupportedException;
                    if (i5 > i) {
                        break;
                    }
                    bArr3[i5] = (byte) AridA.PngjBadCrcException(bArr[i5], 0, bArr2[i5] & UByte.MAX_VALUE, 0);
                    i5++;
                    getData = (getQualityScore + 121) % 128;
                }
                int i6 = i + 1;
                int i7 = 1;
                while (i6 <= this.PngjOutputException) {
                    bArr3[i6] = (byte) AridA.PngjBadCrcException(bArr[i6], bArr[i7] & UByte.MAX_VALUE, bArr2[i6] & UByte.MAX_VALUE, bArr2[i7] & UByte.MAX_VALUE);
                    i6++;
                    i7++;
                }
            } else {
                if (i4 == 3) {
                    int i8 = 1;
                    while (true) {
                        i2 = this.PngjUnsupportedException;
                        if (i8 > i2) {
                            break;
                        }
                        bArr3[i8] = bArr[i8];
                        i8++;
                    }
                    int i9 = i2 + 1;
                    int i10 = 1;
                    while (i9 <= this.PngjOutputException) {
                        bArr3[i9] = (byte) (bArr[i9] - bArr[i10]);
                        i9++;
                        i10++;
                    }
                    return bArr3;
                }
                if (i4 == 4) {
                    int i11 = 1;
                    while (true) {
                        i3 = this.PngjUnsupportedException;
                        if (i11 > i3) {
                            break;
                        }
                        bArr3[i11] = (byte) (bArr[i11] - ((bArr2[i11] & UByte.MAX_VALUE) / 2));
                        i11++;
                        getData = (getQualityScore + 17) % 128;
                    }
                    int i12 = i3 + 1;
                    int i13 = 1;
                    while (i12 <= this.PngjOutputException) {
                        bArr3[i12] = (byte) (bArr[i12] - (((bArr2[i12] & UByte.MAX_VALUE) + (bArr[i13] & UByte.MAX_VALUE)) / 2));
                        i12++;
                        i13++;
                    }
                    return bArr3;
                }
                if (i4 == 5) {
                    for (int i14 = 1; i14 <= this.PngjOutputException; i14++) {
                        bArr3[i14] = (byte) (bArr[i14] - bArr2[i14]);
                    }
                } else {
                    throw new arid.PngjOutputException("Filter type not recognized: ".concat(String.valueOf(valueof)));
                }
            }
        }
        return bArr3;
    }

    public void PngjBadCrcException() {
        valueOf valueof;
        int i = getQualityScore + 79;
        getData = i % 128;
        if (i % 2 == 0) {
            valueof = this.onErrorResponse;
            int i2 = 35 / 0;
            if (valueof == null) {
                return;
            }
        } else {
            valueof = this.onErrorResponse;
            if (valueof == null) {
                return;
            }
        }
        valueof.close();
        getQualityScore = (getData + 125) % 128;
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1602)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:298)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] PngjBadCrcException(android.content.Context r53, int r54, int r55, int r56) {
        /*
            Method dump skipped, instructions count: 10495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: arid.a.PngjException.PngjBadCrcException(android.content.Context, int, int, int):java.lang.Object[]");
    }
}
