package arid;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.R;
import java.lang.reflect.Method;
import kotlin.io.encoding.Base64;
import kotlin.uuid.Uuid;

/* loaded from: classes.dex */
public class PngjBadSignature extends PngjInputException {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$f = 0;
    private static int $10;
    private static int $11;
    private static int PngjBadSignature;
    private static char[] PngjOutputException;
    private static byte[] PngjPrematureEnding;
    private static short[] PngjUnsupportedException;
    private static int valueOf;
    private static int values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$g(byte b, short s, short s2) {
        int i;
        byte[] bArr = $$c;
        int i2 = s2 + 99;
        int i3 = s * 3;
        int i4 = 4 - (b * 4);
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i5 = i4;
            byte[] bArr3 = bArr;
            int i6 = 0;
            int i7 = i3;
            int i8 = i5 + 1;
            i2 = (-i4) + i7;
            i4 = i8;
            bArr = bArr3;
            i = i6;
            bArr2[i] = (byte) i2;
            i6 = i + 1;
            if (i == i3) {
                return new String(bArr2, 0);
            }
            int i9 = i2;
            i5 = i4;
            i4 = bArr[i4];
            bArr3 = bArr;
            i7 = i9;
            int i82 = i5 + 1;
            i2 = (-i4) + i7;
            i4 = i82;
            bArr = bArr3;
            i = i6;
            bArr2[i] = (byte) i2;
            i6 = i + 1;
            if (i == i3) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            i6 = i + 1;
            if (i == i3) {
            }
        }
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        PngjBadSignature = 889759305;
        values = -961251552;
        valueOf = 1300474246;
        PngjPrematureEnding = new byte[]{-99, -82, -23, -100, -118, 79, -123, -124, -106, -124, -18, 24, 24, 39, 59, 2, 32, 37, Base64.padSymbol, 21, 62, 32, 85, -40, 46, 39, 23, 32, 20, 82, -104, 104, -5, -93, -93, -110, -82, 102, -29, -68, -99, -78, 87, -5, -84, -85, -82, -65, -105, -66, 84, -6, -104, -112, -92, -70, 86, -30, -81, -67, 85, -1, -98, -76, -82, 86, -1, -98, -76, -82, 86, -72, -107, -77, -126, -71, -24, -81, 126, -126, -117, -77, -126, -71, -120, -113, 78, -67, -66, -73, -118, -78, -121, -20, -40, -61, -3, -26, -18, -2, -36, -46, -59, -120, -41, -26, 18, 62, 120, 118, 8, 102, 28, 76, 20, 68, 22, 16, 93, -2, -6, 45, 24, 73, -38, -97, 73, -80, 3, -30, -13, 12, 26, 40, -57, -3, 113, -7, 32, 49, -21, 25, -9, -70, -87, 109, -71, 74, 126, 81, 86, -25, -20, 117, 117, 115, 59, 34, 113, 8, 3, 47, 13, 36, 116, 59, 111, -42, 6, 55, -52, -71, 49, -66, -52, -61, -125, -63, -75, -68, -68, -38, -90, -51, -75, -66, -64, -48, -63, -113, 52, -69, -56, -50, -2, 121, -49, -54, -2, -123, -74, -75, -68, -55, -95, -52, -68, -68, -123, -80, 86, -27, -110, -76, -116, -88, 87, -12, -78, -125, 31, -117, -28, Base64.padSymbol, -15, -114, 0, 24, 24, -12, 25, -21, -30, 93, -15, -114, 6, -15, 24, -117, -62, -51, 28, 29, 26, -119, 1, -118, -2, -37, -69, -7, -13, -13, -42, -104, -123, -1, -1, -13, -119, -64, -87, -8, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79};
        PngjOutputException = new char[]{40100, 40190, 40190, 40182, 40181, 40189, 40184, 40186, 40134, 40157, 40178, 40184, 40164, 40191, 40189, 40179, 40147, 40135, 40167, 40188, 40176, 40158, 40153, 40186, 40189, 40157, 40156, 40190, 40190, 40182, 40157, 40156, 40190, 40190, 40182, 40157, 40099, 40190, 40190, 40143, 40143, 40186, 40184, 40186, 40190, 40182, 40178, 40190, 40186, 40164, 40140, 40142, 40184, 40178, 40174, 40059, 40059, 40052, 40052, 40039, 40037, 40039, 40059, 40051, 40063, 40059, 40039, 40033, 40009, 39976, 40006, 40039, 40000, 40002, 40034, 40058, 40037, 40034, 40039, 40058, 40025, 40026, 40063, 40037, 40033, 40036, 40058, 40056, 40121, 40136, 40145, 40183, 40026, 40024, 39937, 39945, 40099, 40184, 40191, 40184, 40183, 40060, 40351, 40336, 40040, 40341, 40348, 40349, 40052, 40012, 40012, 40014, 40336, 40342, 40047, 40343, 40342, 40013, 40011, 40349, 40054, 40014, 40040, 40340, 40342, 40041, 40063, 40108, 40188, 40182, 40179, 40178, 40176, 40178, 40155, 40154, 40189, 40186, 40153, 40158, 40191, 40187, 40191, 40189, 40188, 40157, 40067, 40157, 40178, 40184, 40164, 40191, 40189, 40179, 40147, 40153, 40186, 40189, 40154, 40155, 40178, 40176, 40178, 40179, 40182, 40188, 40073, 40155, 40178, 40176, 40178, 40179, 40182, 40188, 40099, 40146, 39936, 39938, 39961, 39967, 39965, 39962, 39938, 39936, 39941, 39961, 39937, 39937};
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1602)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:298)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v79 */
    /* JADX WARN: Type inference failed for: r15v82 */
    public static java.lang.Object[] PngjBadSignature(android.content.Context r56, int r57, int r58, int r59) {
        /*
            Method dump skipped, instructions count: 10744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: arid.PngjBadSignature.PngjBadSignature(android.content.Context, int, int, int):java.lang.Object[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0142, code lost:
    
        if (r25[r5] == r7) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0213 A[Catch: all -> 0x0245, TryCatch #0 {all -> 0x0245, blocks: (B:17:0x0053, B:19:0x0061, B:20:0x0097, B:31:0x00b3, B:33:0x00c1, B:34:0x00f7, B:52:0x0148, B:54:0x0160, B:55:0x0190, B:58:0x0201, B:60:0x0213, B:61:0x0239, B:65:0x01a3, B:67:0x01bc, B:68:0x01ed), top: B:16:0x0053 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(String str, boolean z, int[] iArr, Object[] objArr) {
        int i;
        int i2;
        byte b;
        Object PngjBadSignature2;
        byte[] bArr;
        int i3;
        String str2 = str;
        byte[] bArr2 = str2;
        if (str2 != null) {
            int i4 = $11 + 121;
            $10 = i4 % Uuid.SIZE_BITS;
            if (i4 % 2 != 0) {
                str2.getBytes("ISO-8859-1");
                throw null;
            }
            bArr2 = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr3 = bArr2;
        com.d.e.e1 e1Var = new com.d.e.e1();
        int i5 = 0;
        int i6 = iArr[0];
        byte b2 = 1;
        int i7 = iArr[1];
        int i8 = iArr[2];
        int i9 = iArr[3];
        char[] cArr = PngjOutputException;
        Class cls = Integer.TYPE;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            i = 2;
            int i10 = 0;
            while (i10 < length) {
                byte b3 = b2;
                int i11 = $11 + 1;
                $10 = i11 % Uuid.SIZE_BITS;
                if (i11 % 2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i10])};
                        Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-259747866);
                        if (PngjBadSignature3 == null) {
                            char c = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(i5) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i5) == 0.0d ? 0 : -1));
                            int makeMeasureSpec = 35 - View.MeasureSpec.makeMeasureSpec(i5, i5);
                            bArr = bArr3;
                            int lastIndexOf = 1312 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', i5);
                            byte b4 = (byte) i5;
                            byte b5 = b4;
                            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c, makeMeasureSpec, lastIndexOf, 208396893, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{cls});
                        } else {
                            bArr = bArr3;
                        }
                        cArr2[i10] = ((Character) ((Method) PngjBadSignature3).invoke(null, objArr2)).charValue();
                        i10--;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    bArr = bArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr[i10])};
                    Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-259747866);
                    if (PngjBadSignature4 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        i3 = i10;
                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (Process.myTid() >> 22), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 35, View.resolveSizeAndState(0, 0, 0) + 1313, 208396893, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{cls});
                    } else {
                        i3 = i10;
                    }
                    cArr2[i3] = ((Character) ((Method) PngjBadSignature4).invoke(null, objArr3)).charValue();
                    i10 = i3 + 1;
                }
                b2 = b3;
                bArr3 = bArr;
                i5 = 0;
            }
            cArr = cArr2;
        } else {
            i = 2;
        }
        byte[] bArr4 = bArr3;
        byte b8 = b2;
        char[] cArr3 = new char[i7];
        System.arraycopy(cArr, i6, cArr3, 0, i7);
        if (bArr4 != null) {
            char[] cArr4 = new char[i7];
            e1Var.PngjBadSignature = 0;
            $11 = ($10 + 11) % Uuid.SIZE_BITS;
            char c2 = 0;
            while (true) {
                int i12 = e1Var.PngjBadSignature;
                if (i12 >= i7) {
                    break;
                }
                int i13 = $11 + 89;
                $10 = i13 % Uuid.SIZE_BITS;
                if (i13 % 2 != 0) {
                    if (bArr4[i12] == 0) {
                        b = b8;
                        char c3 = cArr3[i12];
                        Object[] objArr4 = new Object[i];
                        objArr4[b] = Integer.valueOf(c2);
                        objArr4[0] = Integer.valueOf(c3);
                        Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-655108508);
                        if (PngjBadSignature5 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (View.combineMeasuredStates(0, 0) + 31882), (ViewConfiguration.getFadingEdgeLength() >> 16) + 32, (ViewConfiguration.getJumpTapTimeout() >> 16) + 1250, 605862879, false, $$g(b9, b10, b10), new Class[]{cls, cls});
                        }
                        cArr4[i12] = ((Character) ((Method) PngjBadSignature5).invoke(null, objArr4)).charValue();
                        c2 = cArr4[e1Var.PngjBadSignature];
                        Object[] objArr5 = {e1Var, e1Var};
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1060060353);
                        if (PngjBadSignature2 == null) {
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) TextUtils.getTrimmedLength(BuildConfig.FLAVOR), (Process.myTid() >> 22) + 35, KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + ModuleDescriptor.MODULE_VERSION, -1010806406, false, "g", new Class[]{Object.class, Object.class});
                        }
                        ((Method) PngjBadSignature2).invoke(null, objArr5);
                        b8 = 1;
                        i = 2;
                    }
                    Object[] objArr6 = {Integer.valueOf(cArr3[i12]), Integer.valueOf(c2)};
                    Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(269554740);
                    if (PngjBadSignature6 == null) {
                        byte b11 = (byte) 0;
                        byte b12 = b11;
                        PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 35 - View.resolveSize(0, 0), 1598 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -318867057, false, $$g(b11, b12, (byte) (b12 + 3)), new Class[]{cls, cls});
                    }
                    cArr4[i12] = ((Character) ((Method) PngjBadSignature6).invoke(null, objArr6)).charValue();
                    c2 = cArr4[e1Var.PngjBadSignature];
                    Object[] objArr52 = {e1Var, e1Var};
                    PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1060060353);
                    if (PngjBadSignature2 == null) {
                    }
                    ((Method) PngjBadSignature2).invoke(null, objArr52);
                    b8 = 1;
                    i = 2;
                } else {
                    b = b8;
                }
            }
            cArr3 = cArr4;
        }
        if (i9 > 0) {
            char[] cArr5 = new char[i7];
            i2 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i7);
            int i14 = i7 - i9;
            System.arraycopy(cArr5, 0, cArr3, i14, i9);
            System.arraycopy(cArr5, i9, cArr3, 0, i14);
        } else {
            i2 = 0;
        }
        if (z) {
            $11 = ($10 + 35) % Uuid.SIZE_BITS;
            char[] cArr6 = new char[i7];
            e1Var.PngjBadSignature = i2;
            while (true) {
                int i15 = e1Var.PngjBadSignature;
                if (i15 >= i7) {
                    break;
                }
                cArr6[i15] = cArr3[(i7 - i15) - 1];
                e1Var.PngjBadSignature = i15 + 1;
            }
            cArr3 = cArr6;
        }
        if (i8 > 0) {
            e1Var.PngjBadSignature = 0;
            while (true) {
                int i16 = e1Var.PngjBadSignature;
                if (i16 >= i7) {
                    break;
                }
                $11 = ($10 + 19) % Uuid.SIZE_BITS;
                cArr3[i16] = (char) (cArr3[i16] - iArr[2]);
                e1Var.PngjBadSignature = i16 + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x01c0, code lost:
    
        if (r8 != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01d5, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01d2, code lost:
    
        r6 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01d0, code lost:
    
        if (r8 != false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, int i, int i2, byte b, int i3, Object[] objArr) {
        int i4;
        int i5;
        int i6;
        long j;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        com.d.e.PngjPrematureEnding pngjPrematureEnding = new com.d.e.PngjPrematureEnding();
        StringBuilder sb = new StringBuilder();
        try {
            int i13 = 1;
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(values)};
            int i14 = 0;
            Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1302984176);
            Class cls = Integer.TYPE;
            if (PngjBadSignature2 == null) {
                byte b2 = (byte) 0;
                i4 = -1302984176;
                byte b3 = b2;
                i5 = 60329;
                PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 60329), 31 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0), 1167 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1320773547, false, $$g(b2, b3, (byte) (b3 | 6)), new Class[]{cls, cls});
            } else {
                i4 = -1302984176;
                i5 = 60329;
            }
            int intValue = ((Integer) ((Method) PngjBadSignature2).invoke(null, objArr2)).intValue();
            boolean z = intValue == -1;
            if (!(!z)) {
                int i15 = $10 + 97;
                $11 = i15 % Uuid.SIZE_BITS;
                if (i15 % 2 == 0) {
                    throw null;
                }
                byte[] bArr = PngjPrematureEnding;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i16 = 0;
                    j = -6165791747575875761L;
                    while (i16 < length) {
                        $10 = ($11 + 59) % Uuid.SIZE_BITS;
                        Object[] objArr3 = {Integer.valueOf(bArr[i16])};
                        Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1053815139);
                        if (PngjBadSignature3 == null) {
                            i11 = i13;
                            char c = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14829);
                            int rgb = (-16777188) - Color.rgb(i14, i14, i14);
                            int size = View.MeasureSpec.getSize(i14) + 721;
                            byte b4 = (byte) i14;
                            i12 = i14;
                            byte b5 = b4;
                            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c, rgb, size, 1038050086, false, $$g(b4, b5, (byte) (b5 | 10)), new Class[]{cls});
                        } else {
                            i11 = i13;
                            i12 = i14;
                        }
                        bArr2[i16] = ((Byte) ((Method) PngjBadSignature3).invoke(null, objArr3)).byteValue();
                        i16++;
                        i14 = i12;
                        i13 = i11;
                    }
                    bArr = bArr2;
                } else {
                    j = -6165791747575875761L;
                }
                i6 = i13;
                int i17 = i14;
                if (bArr != null) {
                    byte[] bArr3 = PngjPrematureEnding;
                    Object[] objArr4 = new Object[2];
                    objArr4[i6] = Integer.valueOf(PngjBadSignature);
                    objArr4[i17] = Integer.valueOf(i2);
                    Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i4);
                    if (PngjBadSignature4 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (i5 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, i17)), TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 33, (ViewConfiguration.getJumpTapTimeout() >> 16) + 1167, 1320773547, false, $$g(b6, b7, (byte) (b7 | 6)), new Class[]{cls, cls});
                    }
                    intValue = (byte) (((byte) (bArr3[((Integer) ((Method) PngjBadSignature4).invoke(null, objArr4)).intValue()] ^ j)) + ((int) (values ^ j)));
                } else {
                    intValue = (short) (((short) (PngjUnsupportedException[i2 + ((int) (PngjBadSignature ^ j))] ^ j)) + ((int) (values ^ j)));
                }
            } else {
                i6 = 1;
                j = -6165791747575875761L;
            }
            if (intValue > 0) {
                int i18 = $11 + 53;
                $10 = i18 % Uuid.SIZE_BITS;
                if (i18 % 2 != 0) {
                    i7 = ((i2 / intValue) % 4) << ((int) (PngjBadSignature | j));
                } else {
                    i7 = ((i2 + intValue) - 2) + ((int) (PngjBadSignature ^ j));
                }
                pngjPrematureEnding.values = i7 + i8;
                int i19 = valueOf;
                Object[] objArr5 = new Object[4];
                objArr5[3] = sb;
                objArr5[2] = Integer.valueOf(i19);
                objArr5[i6] = Integer.valueOf(i);
                objArr5[0] = pngjPrematureEnding;
                Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1013119226);
                if (PngjBadSignature5 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (45717 - KeyEvent.normalizeMetaState(0)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 39, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 625, 1064463037, false, $$g(b8, b9, (byte) (b9 | 9)), new Class[]{Object.class, cls, cls, Object.class});
                }
                ((StringBuilder) ((Method) PngjBadSignature5).invoke(null, objArr5)).append(pngjPrematureEnding.valueOf);
                pngjPrematureEnding.PngjBadCrcException = pngjPrematureEnding.valueOf;
                byte[] bArr4 = PngjPrematureEnding;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    $11 = ($10 + 37) % Uuid.SIZE_BITS;
                    for (int i20 = 0; i20 < length2; i20++) {
                        bArr5[i20] = (byte) (bArr4[i20] ^ j);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    i10 = i6;
                    i9 = 0;
                } else {
                    i9 = i6;
                    i10 = i9;
                }
                while (true) {
                    pngjPrematureEnding.PngjException = i10;
                    if (pngjPrematureEnding.PngjException >= intValue) {
                        break;
                    }
                    if (i9 == 0) {
                        $11 = ($10 + R.styleable.AppCompatTheme_tooltipFrameBackground) % Uuid.SIZE_BITS;
                        byte[] bArr6 = PngjPrematureEnding;
                        pngjPrematureEnding.values = pngjPrematureEnding.values - 1;
                        pngjPrematureEnding.valueOf = (char) (pngjPrematureEnding.PngjBadCrcException + (((byte) (((byte) (bArr6[r4] ^ j)) + s)) ^ b));
                    } else {
                        short[] sArr = PngjUnsupportedException;
                        pngjPrematureEnding.values = pngjPrematureEnding.values - 1;
                        pngjPrematureEnding.valueOf = (char) (pngjPrematureEnding.PngjBadCrcException + (((short) (((short) (sArr[r4] ^ j)) + s)) ^ b));
                        $10 = ($11 + 63) % Uuid.SIZE_BITS;
                    }
                    sb.append(pngjPrematureEnding.valueOf);
                    pngjPrematureEnding.PngjBadCrcException = pngjPrematureEnding.valueOf;
                    i10 = pngjPrematureEnding.PngjException + 1;
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, short s2, byte b, Object[] objArr) {
        int i;
        int i2 = 112 - s;
        byte[] bArr = $$a;
        int i3 = 6 - s2;
        byte[] bArr2 = new byte[13 - b];
        int i4 = 12 - b;
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i5 = 0;
            int i6 = i3;
            i2 += i3;
            i3 = i6;
            bArr = bArr3;
            i = i5;
            int i7 = i3 + 1;
            bArr2[i] = (byte) i2;
            i5 = i + 1;
            if (i == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b2 = bArr[i7];
            i3 = i2;
            i2 = b2;
            bArr3 = bArr;
            i6 = i7;
            i2 += i3;
            i3 = i6;
            bArr = bArr3;
            i = i5;
            int i72 = i3 + 1;
            bArr2[i] = (byte) i2;
            i5 = i + 1;
            if (i == i4) {
            }
        } else {
            i = 0;
            int i722 = i3 + 1;
            bArr2[i] = (byte) i2;
            i5 = i + 1;
            if (i == i4) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{57, -3, -81, -41, -10, 5, -52, 30, -7, 3, -37, 51, -21, 2, 11, 4, -11, 6, -1};
        $$b = 217;
    }

    public static void init$1() {
        $$c = new byte[]{48, -79, 4, 52};
        $$f = 229;
    }
}
