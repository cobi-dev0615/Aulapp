package arid;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.karumi.dexter.BuildConfig;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class Action {
    private static byte[] $$a = null;
    private static int $$b = 0;
    private static byte[] $$c = null;
    private static int $$d = 0;
    private static int $10;
    private static int $11;
    private static char[] Attempt;
    private static boolean getAsHighestSecurityLevelReached;
    private static int getData;
    private static char[] getPadSub1;
    private static int getPadSub2;
    private static boolean getPadSub3;
    private static int isQualityFailed;
    public final int PngjPrematureEnding;
    public final int PngjUnsupportedException;
    private int onErrorResponse;
    public final int valueOf;
    public final int values;
    public long PngjOutputException = -1;
    public long Action = -1;
    public final boolean PngjException = false;
    public final boolean PngjExceptionInternal = false;
    public final boolean PngjBadSignature = true;
    private int e1 = 1;
    public final int PngjBadCrcException = 8;
    private boolean a = false;
    private int PngBadCharsetException = 8;
    public final int PngjInputException = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$e(byte b, short s, byte b2) {
        int i;
        int i2 = b + 4;
        int i3 = s * 2;
        byte[] bArr = $$c;
        int i4 = 102 - b2;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        if (bArr == null) {
            int i6 = i5;
            i = 0;
            i4 += i6;
            bArr2[i] = (byte) i4;
            i2++;
            if (i == i5) {
                return new String(bArr2, 0);
            }
            i++;
            i6 = bArr[i2];
            i4 += i6;
            bArr2[i] = (byte) i4;
            i2++;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i4;
            i2++;
            if (i == i5) {
            }
        }
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getData = 0;
        isQualityFailed = 1;
        getPadSub1 = new char[]{25347, 25592, 25584, 25355, 25350, 25358, 25418, 25596, 25593, 25585, 25597, 25399, 25400, 25594, 25599, 25357, 25598, 25351, 25344, 25359, 25401, 25349, 25415, 25356, 25345, 25353, 25587, 25405, 25595, 25346, 25392, 25586, 25365, 25402, 25395, 25367, 25413, 25588};
        getPadSub2 = -2081201302;
        getAsHighestSecurityLevelReached = true;
        getPadSub3 = true;
        Attempt = new char[]{39944, 39991, 40189, 39998, 39993, 39988, 39993, 39944, 39974, 39947, 39993, 40109, 40189, 40179, 40188, 40177, 40186, 40098, 40188, 40177, 40179, 40186, 40185, 40179, 40191, 39963, 40328, 40046, 40047, 40329, 40328, 40321, 40332, 40332, 40323, 40041, 40040, 40374, 40374, 40331, 40332, 40321, 40045, 40045, 40327, 40327, 40329, 40333, 40347, 40346, 40323, 40372, 40331, 40323, 40323, 40179, 39994, 39997, 40016, 40023, 40031, 40026, 40019, 40016, 40021, 40019, 40028, 40031, 40076, 40191, 40000, 40006, 40013, 40015, 40014, 40055, 40008, 40014, 40096, 40184, 40165, 40165, 40187, 40356, 40374, 40154, 39979, 40054, 40013, 40012, 40054, 40011, 40008, 40014, 40014, 40013, 40014, 40053, 40009, 40009, 40054, 40096, 40185, 40165, 40188, 40179, 40166, 40167, 40110, 40165, 40189, 40178, 40176, 40178, 40179, 40189, 40185, 40177, 40183, 40186, 40186, 40164, 40191, 40189, 40167, 40189, 40190, 40167, 40109, 40160, 40109, 40190, 40179, 40191, 40186, 40186, 40165, 40187, 40191, 40155, 40132, 40167, 40190, 40190, 40160, 40160, 40137, 40020, 40019, 40018, 40018, 40026, 40025, 40026, 40024, 40019, 40017, 39977, 40016, 40019, 40022, 40101, 40177, 40191, 40154, 40123, 40133, 40162, 40162, 40167, 40184, 40189, 40154, 40102, 40184, 40133, 40133, 40184, 40158, 40133, 40162, 40162, 40133, 40158, 40176, 40190, 40164, 40190, 40190, 40189, 40158, 40135, 40162, 40165, 40191, 40190, 40177, 39972, 39981, 40000, 40109, 40133, 40154, 40189, 40184, 40167, 40162, 40099, 40191, 40177, 40156, 40154, 40189, 40184, 40167, 40162, 40162, 40133, 40144, 39953, 40171, 39952, 40191, 40188, 39959, 39954, 39961, 39940, 39940, 40191, 40133, 39988, 39950, 39990, 39964, 39959, 39946, 39989, 39996, 39999, 39999, 39954, 40102, 40185, 40134, 40154, 40191, 40177, 40156, 40132, 40164, 40189, 40189, 40163, 40060, 40055, 40053, 40022, 40016, 40048, 40062, 40056, 40056, 40061, 40019, 40021, 40102, 40183, 40186, 40185, 40179, 40186, 40191, 40178, 40189, 40185, 40186, 40109, 40167, 40165, 40186, 40191, 40191, 40190, 40173, 40325, 40378, 40380, 40351, 40324, 40381, 40369, 40376, 40356, 40324, 40351, 40377, 40377, 40369, 40344, 40067, 40154, 40191, 40177, 40185, 40135, 40153, 40178, 40182, 40189, 40185, 40153, 40156, 40190, 40190, 40182, 40157, 39938, 40381, 40376, 40359, 40354, 40354, 40325, 40059, 40325, 40354, 40378, 40349, 40058, 40346, 40383, 40369, 40348, 40143, 39980, 39951, 40168, 39947, 40021, 39979, 39945, 39937, 40067, 40133, 40160, 40134, 40156, 40177, 40191, 40154, 40072, 40134, 40166, 40173, 40174, 40140, 40063, 40060, 40056, 40045, 40059, 40015, 39969, 40058, 40033, 40060, 40039, 39969, 40060, 40041, 40060, 40037};
    }

    public Action(int i, int i2) {
        this.values = i;
        this.valueOf = i2;
        this.PngjPrematureEnding = ((i * 8) + 7) / 8;
        this.PngjUnsupportedException = i;
        this.onErrorResponse = i;
        if (i <= 0 || i > 16777216) {
            StringBuilder sb = new StringBuilder("invalid cols=");
            sb.append(i);
            sb.append(" ???");
            throw new PngjException(sb.toString());
        }
        if (i2 > 0 && i2 <= 16777216) {
            if (i <= 0) {
                throw new PngjException("invalid image parameters (overflow?)");
            }
            return;
        }
        Object[] objArr = new Object[1];
        b(null, Process.getGidForName(BuildConfig.FLAVOR) + 128, null, "\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0081\u0085\u0084\u0083\u0082\u0081", objArr);
        StringBuilder sb2 = new StringBuilder((String) objArr[0]);
        sb2.append(i2);
        sb2.append(" ???");
        throw new PngjException(sb2.toString());
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1602)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:298)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    /* JADX WARN: Multi-variable search skipped. Vars limit reached: 5852 (expected less than 5000) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v775 */
    /* JADX WARN: Type inference failed for: r2v808 */
    public static java.lang.Object[] PngjException$52c725b(int r73, java.lang.Object r74) {
        /*
            Method dump skipped, instructions count: 15433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: arid.Action.PngjException$52c725b(int, java.lang.Object):java.lang.Object[]");
    }

    private static void b(int[] iArr, int i, String str, String str2, Object[] objArr) {
        char[] cArr;
        long j;
        int i2;
        int i3;
        char c;
        String str3 = str2;
        $11 = ($10 + 35) % 128;
        byte[] bArr = str3.getBytes();
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        int i4 = 2;
        if (str != null) {
            int i5 = $11 + 11;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        com.d.e.PngjExceptionInternal pngjExceptionInternal = new com.d.e.PngjExceptionInternal();
        char[] cArr3 = getPadSub1;
        Class cls = Integer.TYPE;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i6])};
                    Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(358189806);
                    if (PngjBadSignature == null) {
                        PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 27092), Drawable.resolveOpacity(0, 0) + 37, (ViewConfiguration.getLongPressTimeout() >> 16) + 118, -373889195, false, "b", new Class[]{cls});
                    }
                    cArr4[i6] = ((Character) ((Method) PngjBadSignature).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(getPadSub2)};
        Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1639226071);
        if (PngjBadSignature2 == null) {
            j = 0;
            byte b = (byte) (-1);
            byte b2 = (byte) (b + 1);
            i2 = -1;
            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 61714), Process.getGidForName(BuildConfig.FLAVOR) + 35, 278 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), -1654917268, false, $$e(b, b2, (byte) (b2 + 1)), new Class[]{cls});
        } else {
            j = 0;
            i2 = -1;
        }
        int intValue = ((Integer) ((Method) PngjBadSignature2).invoke(null, objArr3)).intValue();
        int i7 = -528960794;
        char c2 = 1;
        if (getPadSub3) {
            $11 = ($10 + 83) % 128;
            int length2 = bArr2.length;
            pngjExceptionInternal.PngjException = length2;
            char[] cArr5 = new char[length2];
            pngjExceptionInternal.values = 0;
            while (true) {
                int i8 = pngjExceptionInternal.values;
                int i9 = pngjExceptionInternal.PngjException;
                if (i8 >= i9) {
                    objArr[0] = new String(cArr5);
                    return;
                }
                cArr5[i8] = (char) (cArr3[bArr2[(i9 - 1) - i8] + i] - intValue);
                Object[] objArr4 = new Object[2];
                objArr4[c2] = pngjExceptionInternal;
                objArr4[0] = pngjExceptionInternal;
                Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i7);
                if (PngjBadSignature3 == null) {
                    i3 = i7;
                    byte b3 = (byte) i2;
                    byte b4 = (byte) (b3 + 1);
                    c = c2;
                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) - 1), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 37, (Process.myTid() >> 22) + 549, 479715165, false, $$e(b3, b4, (byte) (b4 + 5)), new Class[]{Object.class, Object.class});
                } else {
                    i3 = i7;
                    c = c2;
                }
                ((Method) PngjBadSignature3).invoke(null, objArr4);
                i7 = i3;
                c2 = c;
                i2 = -1;
            }
        } else if (getAsHighestSecurityLevelReached) {
            int length3 = cArr2.length;
            pngjExceptionInternal.PngjException = length3;
            char[] cArr6 = new char[length3];
            pngjExceptionInternal.values = 0;
            while (true) {
                int i10 = pngjExceptionInternal.values;
                int i11 = pngjExceptionInternal.PngjException;
                if (i10 >= i11) {
                    objArr[0] = new String(cArr6);
                    return;
                }
                int i12 = $11 + 121;
                $10 = i12 % 128;
                if (i12 % i4 != 0) {
                    cArr6[i10] = (char) (cArr3[cArr2[(i11 % 0) + i10] % i] - intValue);
                    Object[] objArr5 = new Object[i4];
                    objArr5[1] = pngjExceptionInternal;
                    objArr5[0] = pngjExceptionInternal;
                    Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-528960794);
                    if (PngjBadSignature4 == null) {
                        byte b5 = (byte) (-1);
                        byte b6 = (byte) (b5 + 1);
                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) View.MeasureSpec.getSize(0), Process.getGidForName(BuildConfig.FLAVOR) + 38, 549 - Color.red(0), 479715165, false, $$e(b5, b6, (byte) (b6 + 5)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) PngjBadSignature4).invoke(null, objArr5);
                } else {
                    cArr6[i10] = (char) (cArr3[cArr2[(i11 - 1) - i10] - i] - intValue);
                    Object[] objArr6 = new Object[i4];
                    objArr6[1] = pngjExceptionInternal;
                    objArr6[0] = pngjExceptionInternal;
                    Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-528960794);
                    if (PngjBadSignature5 == null) {
                        byte b7 = (byte) (-1);
                        byte b8 = (byte) (b7 + 1);
                        PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), Color.green(0) + 37, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 549, 479715165, false, $$e(b7, b8, (byte) (b8 + 5)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) PngjBadSignature5).invoke(null, objArr6);
                }
                $11 = ($10 + 59) % 128;
                i4 = 2;
            }
        } else {
            int length4 = iArr.length;
            pngjExceptionInternal.PngjException = length4;
            char[] cArr7 = new char[length4];
            pngjExceptionInternal.values = 0;
            while (true) {
                int i13 = pngjExceptionInternal.values;
                int i14 = pngjExceptionInternal.PngjException;
                if (i13 >= i14) {
                    objArr[0] = new String(cArr7);
                    return;
                } else {
                    cArr7[i13] = (char) (cArr3[iArr[(i14 - 1) - i13] - i] - intValue);
                    pngjExceptionInternal.values = i13 + 1;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, byte b, int i, Object[] objArr) {
        byte b2;
        int i2 = 112 - s;
        int i3 = 4 - i;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[b + 1];
        if (bArr == null) {
            byte[] bArr3 = bArr;
            byte b3 = 0;
            int i4 = i3;
            i2 = (i3 + i2) - 23;
            i3 = i4;
            bArr = bArr3;
            b2 = b3;
            int i5 = i3 + 1;
            bArr2[b2] = (byte) i2;
            if (b2 == b) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b4 = bArr[i5];
            i3 = i2;
            i2 = b4;
            b3 = (byte)(b2 + 1);
            bArr3 = bArr;
            i4 = i5;
            i2 = (i3 + i2) - 23;
            i3 = i4;
            bArr = bArr3;
            b2 = b3;
            int i52 = i3 + 1;
            bArr2[b2] = (byte) i2;
            if (b2 == b) {
            }
        } else {
            b2 = 0;
            int i522 = i3 + 1;
            bArr2[b2] = (byte) i2;
            if (b2 == b) {
            }
        }
    }

    private static void d(String str, boolean z, int[] iArr, Object[] objArr) {
        byte b;
        int i;
        byte[] bArr;
        String str2;
        char[] cArr;
        String str3 = str;
        String str4 = BuildConfig.FLAVOR;
        int i2 = 0;
        byte[] bArr2 = str3.getBytes();
        if (str3 != null) {
            int i3 = $10 + 13;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 / 0;
                bArr2 = str3.getBytes("ISO-8859-1");
            } else {
                bArr2 = str3.getBytes("ISO-8859-1");
            }
        }
        byte[] bArr3 = bArr2;
        com.d.e.e1 e1Var = new com.d.e.e1();
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr2 = Attempt;
        Class cls = Integer.TYPE;
        if (cArr2 != null) {
            $10 = ($11 + 121) % 128;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            b = 1;
            int i9 = 0;
            while (i9 < length) {
                $11 = ($10 + 75) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                    Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(-259747866);
                    if (PngjBadSignature == null) {
                        char c = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                        int resolveOpacity = 35 - Drawable.resolveOpacity(i2, i2);
                        int indexOf = 1313 - TextUtils.indexOf(str4, str4);
                        bArr = bArr3;
                        str2 = str4;
                        byte b2 = (byte) (-1);
                        byte b3 = (byte) (b2 + 1);
                        cArr = cArr3;
                        PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(c, resolveOpacity, indexOf, 208396893, false, $$e(b2, b3, (byte) (b3 + 2)), new Class[]{cls});
                    } else {
                        bArr = bArr3;
                        str2 = str4;
                        cArr = cArr3;
                    }
                    cArr[i9] = ((Character) ((Method) PngjBadSignature).invoke(null, objArr2)).charValue();
                    i9++;
                    bArr3 = bArr;
                    str4 = str2;
                    cArr3 = cArr;
                    i2 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        } else {
            b = 1;
        }
        byte[] bArr4 = bArr3;
        char[] cArr4 = new char[i6];
        System.arraycopy(cArr2, i5, cArr4, 0, i6);
        if (bArr4 != null) {
            $10 = ($11 + 9) % 128;
            char[] cArr5 = new char[i6];
            e1Var.PngjBadSignature = 0;
            char c2 = 0;
            while (true) {
                int i10 = e1Var.PngjBadSignature;
                if (i10 >= i6) {
                    break;
                }
                byte b4 = b;
                if (bArr4[i10] == b4) {
                    char c3 = cArr4[i10];
                    Object[] objArr3 = new Object[2];
                    objArr3[b4] = Integer.valueOf(c2);
                    objArr3[0] = Integer.valueOf(c3);
                    Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-655108508);
                    if (PngjBadSignature2 == null) {
                        byte b5 = (byte) (-1);
                        byte b6 = (byte) (b5 + 1);
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (31882 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), ImageFormat.getBitsPerPixel(0) + 33, 1250 - (ViewConfiguration.getJumpTapTimeout() >> 16), 605862879, false, $$e(b5, b6, (byte) (b6 + 3)), new Class[]{cls, cls});
                    }
                    cArr5[i10] = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr3)).charValue();
                } else {
                    Object[] objArr4 = {Integer.valueOf(cArr4[i10]), Integer.valueOf(c2)};
                    Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(269554740);
                    if (PngjBadSignature3 == null) {
                        byte b7 = (byte) (-1);
                        byte b8 = (byte) (b7 + 1);
                        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) Gravity.getAbsoluteGravity(0, 0), 35 - View.resolveSize(0, 0), 1598 - (ViewConfiguration.getFadingEdgeLength() >> 16), -318867057, false, $$e(b7, b8, b8), new Class[]{cls, cls});
                    }
                    cArr5[i10] = ((Character) ((Method) PngjBadSignature3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr5[e1Var.PngjBadSignature];
                Object[] objArr5 = {e1Var, e1Var};
                Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1060060353);
                if (PngjBadSignature4 == null) {
                    PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getScrollBarSize() >> 8), 35 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), View.resolveSize(0, 0) + ModuleDescriptor.MODULE_VERSION, -1010806406, false, "g", new Class[]{Object.class, Object.class});
                }
                ((Method) PngjBadSignature4).invoke(null, objArr5);
                b = 1;
            }
            cArr4 = cArr5;
        }
        if (i8 > 0) {
            char[] cArr6 = new char[i6];
            i = 0;
            System.arraycopy(cArr4, 0, cArr6, 0, i6);
            int i11 = i6 - i8;
            System.arraycopy(cArr6, 0, cArr4, i11, i8);
            System.arraycopy(cArr6, i8, cArr4, 0, i11);
        } else {
            i = 0;
        }
        if (z) {
            $10 = ($11 + 19) % 128;
            char[] cArr7 = new char[i6];
            while (true) {
                e1Var.PngjBadSignature = i;
                int i12 = e1Var.PngjBadSignature;
                if (i12 >= i6) {
                    break;
                }
                int i13 = $10 + 103;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    cArr7[i12] = cArr4[(i6 % i12) / 0];
                    i = i12 % 1;
                } else {
                    cArr7[i12] = cArr4[(i6 - i12) - 1];
                    i = i12 + 1;
                }
            }
            $10 = ($11 + 67) % 128;
            cArr4 = cArr7;
        }
        if (i7 > 0) {
            e1Var.PngjBadSignature = 0;
            while (true) {
                int i14 = e1Var.PngjBadSignature;
                if (i14 >= i6) {
                    break;
                }
                cArr4[i14] = (char) (cArr4[i14] - iArr[2]);
                e1Var.PngjBadSignature = i14 + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }

    public static void init$0() {
        $$a = new byte[]{60, 89, 26, -54, -29, 13, 28};
        $$b = 0;
    }

    public static void init$1() {
        $$c = new byte[]{62, 106, -83, -91};
        $$d = 73;
    }

    public final boolean equals(Object obj) {
        getData = (isQualityFailed + 33) % 128;
        if (this == obj) {
            return true;
        }
        if (obj == null || Action.class != obj.getClass()) {
            return false;
        }
        Action action = (Action) obj;
        if (this.PngjBadCrcException != action.PngjBadCrcException) {
            isQualityFailed = (getData + 75) % 128;
            return false;
        }
        if (this.values != action.values) {
            return false;
        }
        if (this.PngjBadSignature == action.PngjBadSignature) {
            return this.valueOf == action.valueOf;
        }
        int i = getData + 53;
        isQualityFailed = i % 128;
        return i % 2 == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        if (r4.PngjBadSignature != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r4.PngjBadSignature != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0032, code lost:
    
        arid.Action.getData = (r1 + 65) % 128;
        r3 = 1237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        r3 = 1231;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int hashCode() {
        int i;
        int i2;
        int i3 = getData + 85;
        int i4 = i3 % 128;
        isQualityFailed = i4;
        if (i3 % 2 == 0) {
            i = ((39432 - this.PngjBadCrcException) + this.values) >> 20;
        } else {
            i = (((this.PngjBadCrcException + 39308) * 31) + this.values) * 31;
        }
        int i5 = ((((i + i2) * 31) + 1237) * 31) + this.valueOf;
        getData = (i4 + 21) % 128;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageInfo [cols=");
        sb.append(this.values);
        sb.append(", rows=");
        sb.append(this.valueOf);
        sb.append(", bitDepth=");
        sb.append(this.PngjBadCrcException);
        sb.append(", channels=");
        sb.append(this.e1);
        sb.append(", alpha=");
        sb.append(this.PngjException);
        sb.append(", greyscale=");
        sb.append(this.PngjBadSignature);
        sb.append(", indexed=");
        sb.append(this.PngjExceptionInternal);
        sb.append("]");
        String obj = sb.toString();
        int i = isQualityFailed + 119;
        getData = i % 128;
        if (i % 2 != 0) {
            int i2 = 90 / 0;
        }
        return obj;
    }
}
