package com.touchlessid;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.d.e.PngBadCharsetException;
import com.d.e.a.PngjBadCrcException;
import com.d.e.e1;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.identy.InitializationListener;
import com.karumi.dexter.BuildConfig;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public abstract class TouchLessIDSDK$PngjBadCrcException implements InitializationListener {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10;
    private static int $11;
    private static int PngjBadCrcException;
    private static int[] PngjBadSignature;
    private static char[] PngjException;
    private static int valueOf;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:4:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$e(short s, int i, byte b) {
        int i2;
        int i3 = s + 65;
        int i4 = 4 - (b * 2);
        byte[] bArr = $$c;
        int i5 = i * 3;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i6 = i5;
            i2 = 0;
            i4++;
            i3 += -i6;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
                return new String(bArr2, 0);
            }
            i2++;
            i6 = bArr[i4];
            i4++;
            i3 += -i6;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        }
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        valueOf = 0;
        PngjBadCrcException = 1;
        PngjBadSignature = new int[]{1658931676, 1419134726, 750122322, -1010998053, 529316487, 1737159711, 518470738, 1483777002, -58379738, -193262221, 169718375, 204788740, 303330432, 540218610, -1624742567, 2032365978, -770878340, -1582735276};
        PngjException = new char[]{40024, 40012, 39949, 40011, 40026, 40052, 40027, 40014, 40009, 40015, 39949, 40014, 40009, 40009, 40004, 40009, 40052, 40011, 40026, 40024, 40005, 40052, 40013, 40168, 40032, 40001, 40001, 40037, 40036, 40044, 40047, 40032, 40037, 40058, 40032, 40033, 40002, 40009, 40035, 40002, 40003, 40045, 40044, 40002, 40013, 40044, 40044, 40047, 40010, 40014, 40045, 40101, 40179, 40188, 40191, 40164, 40154, 40157, 40176, 40183, 40191, 40186, 40179, 40176, 40100, 40190, 40162, 40187, 40188, 40177, 40180, 40183, 40103, 40190, 40191, 40184, 40165, 40189, 40099, 40191, 40178, 40190, 40132, 40158, 40186, 40191, 40183, 40176, 40156, 40132, 40186, 40140, 39993, 39963, 39961, 39993, 39992, 40111, 40164, 40102, 40157, 40132, 40190, 40179, 40185, 40191, 40185, 40190, 40176, 40133, 39984, 39991, 39945, 39939, 39944, 39988, 39947, 39951, 39939, 39946, 39946, 39946, 39991, 40143, 39975, 39975, 39968, 39972, 39999, 39993, 40165, 40015, 40014, 40049, 40050, 40010, 40052, 40109, 40167, 40190, 40189, 40167, 40189, 40191, 40164, 40186, 40186, 40183, 40177, 40185, 40189, 40179, 40178, 40176, 40178, 40189, 40165, 40109, 40167, 40167, 40189, 40182, 40176, 40147, 39961, 39959, 40168, 40170, 39952, 39958, 39952, 39964, 40099, 40190, 40190, 40191, 40176, 40183, 40178, 40191, 40188, 40181, 40189, 40191, 40164, 40166, 40165, 40150, 39955, 39960, 39965, 39966, 39964, 39959, 39957, 40173, 39957, 39962, 39967, 40171, 39956, 40067, 40154, 40191, 40177, 40156, 40154, 40189, 40184, 40167, 40162, 40162, 40133, 40106, 40172, 40172, 40170, 40172, 40166, 40140, 40139, 39952, 39952, 40139, 40140, 40174, 40139, 40139, 40174, 40162, 40172, 40173, 40171, 39952, 40181, 40140, 40189, 40030, 40021, 39986, 40104, 40162, 40167, 40184, 40189, 40154, 40133, 40138, 40020, 40020, 39977, 39970, 39975, 39948, 39942, 39995, 39969, 39948, 40109, 40162, 40162, 40133, 40154, 40191, 40177, 40190, 40133, 40154, 40189, 40184, 40067, 40134, 40185, 40189, 40189, 40189, 40164, 40132, 40156, 40177, 40191, 40067, 40133, 40190, 40177, 40191, 40110, 40184, 40158, 40157, 40110, 40167, 40165, 40191, 40159, 40157, 40188, 40190, 40187, 40191, 40156, 40154, 40164, 39966, 40320, 40345, 40327, 40320, 40349, 40347, 40320, 40327, 40347, 40344, 40067, 40153, 40178, 40182, 40189, 40185, 40153, 40156, 40190, 40190, 40182, 40157, 40067, 40123, 40133, 40190, 40177, 40191, 40072, 40131, 40166, 40161, 40168, 40171, 40171, 40142, 40108, 40142, 40171, 40163, 40134, 40099, 40131, 40160, 40186, 40109, 40167, 40184, 40189, 40154, 40156, 40177, 40191, 40154, 40158, 40183, 40177, 40190, 40187, 40190, 40183, 40177, 40158, 40123, 40133, 40162, 40078, 40141, 40160, 40155, 40135, 40187, 40191, 40190, 40154, 40129, 40162, 40161, 40163, 40131, 40097, 40131, 40168, 40168, 40173, 40166, 40187, 40128, 40140, 40174, 40172, 40155, 40171, 39952, 39946, 39938, 39944, 40171, 40180, 39958, 39987, 39987, 39984, 39945, 40067, 40154, 40191, 40177, 40156, 40134, 40160, 40133, 40103, 40158, 40154, 40186, 40166, 40165, 40165, 40167, 40133, 40155, 40165, 40164, 40189, 40157, 40133, 40184, 40188, 40065, 40144, 40159, 40103, 40122, 40145, 40333, 40323, 40002, 40002, 40350, 40322, 39952, 40348, 40338, 40338, 40339, 40343, 40055, 39956, 40043, 40340, 40348, 40350, 40047, 40010, 40051, 40339, 40336, 40343, 40062, 40048, 40348, 40348, 40342, 40133, 39990, 39990, 39949, 39948};
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1602)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:298)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] PngjBadCrcException$52c725b(int r76, java.lang.Object r77) {
        /*
            Method dump skipped, instructions count: 16634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.touchlessid.TouchLessIDSDK$PngjBadCrcException.PngjBadCrcException$52c725b(int, java.lang.Object):java.lang.Object[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, byte b, byte b2, Object[] objArr) {
        int i2;
        int i3;
        int i4 = i + 4;
        int i5 = b2 + 1;
        int i6 = 112 - b;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i6;
            i6 = i5;
            i3 = 0;
            i6 = (i6 + i7) - 23;
            i2 = i3;
            i4++;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i7 = bArr[i4];
            i6 = (i6 + i7) - 23;
            i2 = i3;
            i4++;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i4++;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
            }
        }
    }

    private static void b(int[] iArr, int i, Object[] objArr) {
        int i2;
        int i3;
        char c;
        char[] cArr;
        PngBadCharsetException pngBadCharsetException = new PngBadCharsetException();
        char[] cArr2 = new char[4];
        char[] cArr3 = new char[iArr.length * 2];
        int[] iArr2 = PngjBadSignature;
        int i4 = 57;
        Class cls = Integer.TYPE;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            i3 = 1618428774;
            int[] iArr3 = new int[length];
            i2 = 2;
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object PngjBadSignature2 = PngjBadCrcException.PngjBadSignature(1618428774);
                    if (PngjBadSignature2 == null) {
                        byte b = (byte) i4;
                        byte b2 = (byte) i5;
                        PngjBadSignature2 = PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.getOffsetAfter(BuildConfig.FLAVOR, i5) + 31, 1429 - AndroidCharacter.getMirror('0'), -1667748131, false, $$e(b, b2, b2), new Class[]{cls});
                    }
                    iArr3[i6] = ((Integer) ((Method) PngjBadSignature2).invoke(null, objArr2)).intValue();
                    i6++;
                    i4 = 57;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();

                    if (cause == null) {

                        throw new RuntimeException(th);

                    }

                    throw new RuntimeException(cause);
                }
            }
            iArr2 = iArr3;
        } else {
            i2 = 2;
            i3 = 1618428774;
        }
        int i7 = 16;
        char c2 = '0';
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = PngjBadSignature;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i8 = 0;
            while (i8 < length3) {
                int i9 = $11 + 11;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    Object[] objArr3 = {Integer.valueOf(iArr5[i8])};
                    Object PngjBadSignature3 = PngjBadCrcException.PngjBadSignature(i3);
                    if (PngjBadSignature3 == null) {
                        char c3 = c2;
                        char lastIndexOf = (char) ((-1) - TextUtils.lastIndexOf(BuildConfig.FLAVOR, c3, 0, 0));
                        int maxKeyCode = 31 - (KeyEvent.getMaxKeyCode() >> 16);
                        cArr = cArr2;
                        int indexOf = TextUtils.indexOf(BuildConfig.FLAVOR, c3, 0) + 1382;
                        byte b3 = (byte) 0;
                        PngjBadSignature3 = PngjBadCrcException.PngjBadSignature(lastIndexOf, maxKeyCode, indexOf, -1667748131, false, $$e((byte) 57, b3, b3), new Class[]{cls});
                    } else {
                        cArr = cArr2;
                    }
                    iArr6[i8] = ((Integer) ((Method) PngjBadSignature3).invoke(null, objArr3)).intValue();
                    i8 /= 0;
                } else {
                    cArr = cArr2;
                    Object[] objArr4 = {Integer.valueOf(iArr5[i8])};
                    Object PngjBadSignature4 = PngjBadCrcException.PngjBadSignature(i3);
                    if (PngjBadSignature4 == null) {
                        byte b4 = (byte) 0;
                        PngjBadSignature4 = PngjBadCrcException.PngjBadSignature((char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), 31 - View.resolveSizeAndState(0, 0, 0), Color.rgb(0, 0, 0) + 16778597, -1667748131, false, $$e((byte) 57, b4, b4), new Class[]{cls});
                    }
                    iArr6[i8] = ((Integer) ((Method) PngjBadSignature4).invoke(null, objArr4)).intValue();
                    i8++;
                }
                cArr2 = cArr;
                c2 = '0';
            }
            iArr5 = iArr6;
        }
        char[] cArr4 = cArr2;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        pngBadCharsetException.values = 0;
        $10 = ($11 + 23) % 128;
        while (true) {
            int i10 = pngBadCharsetException.values;
            if (i10 >= iArr.length) {
                objArr[0] = new String(cArr3, 0, i);
                return;
            }
            int i11 = iArr[i10];
            char c4 = (char) (i11 >> 16);
            cArr4[0] = c4;
            char c5 = (char) i11;
            char c6 = 1;
            cArr4[1] = c5;
            char c7 = (char) (iArr[i10 + 1] >> 16);
            cArr4[i2] = c7;
            char c8 = (char) iArr[i10 + 1];
            cArr4[3] = c8;
            pngBadCharsetException.PngjException = (c4 << 16) + c5;
            pngBadCharsetException.PngjBadCrcException = (c7 << 16) + c8;
            PngBadCharsetException.values(iArr4);
            int i12 = 0;
            while (i12 < i7) {
                int i13 = pngBadCharsetException.PngjException ^ iArr4[i12];
                pngBadCharsetException.PngjException = i13;
                int PngjBadCrcException2 = PngBadCharsetException.PngjBadCrcException(i13);
                Object[] objArr5 = new Object[4];
                objArr5[3] = pngBadCharsetException;
                objArr5[i2] = pngBadCharsetException;
                objArr5[c6] = Integer.valueOf(PngjBadCrcException2);
                objArr5[0] = pngBadCharsetException;
                Object PngjBadSignature5 = PngjBadCrcException.PngjBadSignature(-2104166611);
                if (PngjBadSignature5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    c = c6;
                    PngjBadSignature5 = PngjBadCrcException.PngjBadSignature((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2785), 36 - Color.alpha(0), 785 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), 2122029718, false, $$e(b5, b6, b6), new Class[]{Object.class, cls, Object.class, Object.class});
                } else {
                    c = c6;
                }
                int intValue = ((Integer) ((Method) PngjBadSignature5).invoke(null, objArr5)).intValue();
                pngBadCharsetException.PngjException = pngBadCharsetException.PngjBadCrcException;
                pngBadCharsetException.PngjBadCrcException = intValue;
                i12++;
                c6 = c;
                i7 = 16;
            }
            char c9 = c6;
            int i14 = pngBadCharsetException.PngjException;
            int i15 = pngBadCharsetException.PngjBadCrcException;
            pngBadCharsetException.PngjException = i15;
            pngBadCharsetException.PngjBadCrcException = i14;
            i7 = 16;
            int i16 = i14 ^ iArr4[16];
            pngBadCharsetException.PngjBadCrcException = i16;
            int i17 = i15 ^ iArr4[17];
            pngBadCharsetException.PngjException = i17;
            cArr4[0] = (char) (i17 >>> 16);
            cArr4[c9] = (char) i17;
            cArr4[i2] = (char) (i16 >>> 16);
            cArr4[3] = (char) i16;
            PngBadCharsetException.values(iArr4);
            int i18 = pngBadCharsetException.values;
            cArr3[i18 * 2] = cArr4[0];
            cArr3[(i18 * 2) + 1] = cArr4[c9];
            cArr3[(i18 * 2) + 2] = cArr4[i2];
            cArr3[(i18 * 2) + 3] = cArr4[3];
            int i19 = i2;
            Object[] objArr6 = new Object[i19];
            objArr6[c9] = pngBadCharsetException;
            objArr6[0] = pngBadCharsetException;
            Object PngjBadSignature6 = PngjBadCrcException.PngjBadSignature(-800662452);
            if (PngjBadSignature6 == null) {
                PngjBadSignature6 = PngjBadCrcException.PngjBadSignature((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 22 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 30, 749318647, false, "E", new Class[]{Object.class, Object.class});
            }
            ((Method) PngjBadSignature6).invoke(null, objArr6);
            i2 = i19;
        }
    }

    private static void c(String str, boolean z, int[] iArr, Object[] objArr) {
        int length;
        char[] cArr;
        byte[] bArr;
        String str2 = str;
        int i = $10 + 55;
        $11 = i % 128;
        int i2 = 2;
        byte[] bArr2 = str2;
        if (i % 2 == 0) {
            throw null;
        }
        if (str2 != null) {
            bArr2 = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr3 = bArr2;
        e1 e1Var = new e1();
        int i3 = 0;
        int i4 = iArr[0];
        byte b = 1;
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = PngjException;
        Class cls = Integer.TYPE;
        if (cArr2 != null) {
            int i8 = $11 + 25;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i9 = 0;
            while (i9 < length) {
                int i10 = i2;
                int i11 = $10 + 39;
                byte b2 = b;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                        Object PngjBadSignature2 = PngjBadCrcException.PngjBadSignature(-259747866);
                        if (PngjBadSignature2 == null) {
                            bArr = bArr3;
                            byte b3 = (byte) i3;
                            PngjBadSignature2 = PngjBadCrcException.PngjBadSignature((char) ExpandableListView.getPackedPositionType(0L), 35 - (TypedValue.complexToFloat(i3) > 0.0f ? 1 : (TypedValue.complexToFloat(i3) == 0.0f ? 0 : -1)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1312, 208396893, false, $$e((byte) ($$c[b2] - 1), b3, b3), new Class[]{cls});
                        } else {
                            bArr = bArr3;
                        }
                        cArr[i9] = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();

                        if (cause == null) {

                            throw new RuntimeException(th);

                        }

                        throw new RuntimeException(cause);
                    }
                } else {
                    bArr = bArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr2[i9])};
                    Object PngjBadSignature3 = PngjBadCrcException.PngjBadSignature(-259747866);
                    if (PngjBadSignature3 == null) {
                        byte b4 = (byte) 0;
                        PngjBadSignature3 = PngjBadCrcException.PngjBadSignature((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getScrollBarSize() >> 8) + 35, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1313, 208396893, false, $$e((byte) ($$c[b2] - 1), b4, b4), new Class[]{cls});
                    }
                    cArr[i9] = ((Character) ((Method) PngjBadSignature3).invoke(null, objArr3)).charValue();
                    i9++;
                }
                b = b2;
                i2 = i10;
                bArr3 = bArr;
                i3 = 0;
            }
            cArr2 = cArr;
        }
        byte[] bArr4 = bArr3;
        int i12 = i2;
        byte b5 = b;
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr2, i4, cArr3, 0, i5);
        if (bArr4 != null) {
            char[] cArr4 = new char[i5];
            e1Var.PngjBadSignature = 0;
            char c = 0;
            while (true) {
                int i13 = e1Var.PngjBadSignature;
                if (i13 >= i5) {
                    break;
                }
                byte b6 = b5;
                if (bArr4[i13] == b6) {
                    char c2 = cArr3[i13];
                    Object[] objArr4 = new Object[i12];
                    objArr4[b6] = Integer.valueOf(c);
                    objArr4[0] = Integer.valueOf(c2);
                    Object PngjBadSignature4 = PngjBadCrcException.PngjBadSignature(-655108508);
                    if (PngjBadSignature4 == null) {
                        byte b7 = (byte) 0;
                        PngjBadSignature4 = PngjBadCrcException.PngjBadSignature((char) (View.combineMeasuredStates(0, 0) + 31882), TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 32, 1250 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR), 605862879, false, $$e((byte) ($$d & 243), b7, b7), new Class[]{cls, cls});
                    }
                    cArr4[i13] = ((Character) ((Method) PngjBadSignature4).invoke(null, objArr4)).charValue();
                } else {
                    Object[] objArr5 = {Integer.valueOf(cArr3[i13]), Integer.valueOf(c)};
                    Object PngjBadSignature5 = PngjBadCrcException.PngjBadSignature(269554740);
                    if (PngjBadSignature5 == null) {
                        byte b8 = (byte) 0;
                        PngjBadSignature5 = PngjBadCrcException.PngjBadSignature((char) ((-1) - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0)), 35 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1598, -318867057, false, $$e((byte) ($$c[1] + 1), b8, b8), new Class[]{cls, cls});
                    }
                    cArr4[i13] = ((Character) ((Method) PngjBadSignature5).invoke(null, objArr5)).charValue();
                }
                c = cArr4[e1Var.PngjBadSignature];
                Object[] objArr6 = {e1Var, e1Var};
                Object PngjBadSignature6 = PngjBadCrcException.PngjBadSignature(1060060353);
                if (PngjBadSignature6 == null) {
                    PngjBadSignature6 = PngjBadCrcException.PngjBadSignature((char) View.MeasureSpec.getSize(0), 35 - Color.alpha(0), (ViewConfiguration.getTapTimeout() >> 16) + ModuleDescriptor.MODULE_VERSION, -1010806406, false, "g", new Class[]{Object.class, Object.class});
                }
                ((Method) PngjBadSignature6).invoke(null, objArr6);
                b5 = 1;
                i12 = 2;
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i14 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i14, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i14);
        }
        if (z) {
            $10 = ($11 + 71) % 128;
            char[] cArr6 = new char[i5];
            e1Var.PngjBadSignature = 0;
            while (true) {
                int i15 = e1Var.PngjBadSignature;
                if (i15 >= i5) {
                    break;
                }
                cArr6[i15] = cArr3[(i5 - i15) - 1];
                e1Var.PngjBadSignature = i15 + 1;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            e1Var.PngjBadSignature = 0;
            while (true) {
                int i16 = e1Var.PngjBadSignature;
                if (i16 >= i5) {
                    break;
                }
                $11 = ($10 + 67) % 128;
                cArr3[i16] = (char) (cArr3[i16] - iArr[2]);
                e1Var.PngjBadSignature = i16 + 1;
            }
        }
        String str3 = new String(cArr3);
        $10 = ($11 + 79) % 128;
        objArr[0] = str3;
    }

    public static void init$0() {
        $$a = new byte[]{126, -62, -66, -22, -29, 13, 28};
        $$b = 229;
    }

    public static void init$1() {
        $$c = new byte[]{92, 36, 102, 86};
        $$d = 46;
    }
}
