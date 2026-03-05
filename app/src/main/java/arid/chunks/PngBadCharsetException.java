package arid.chunks;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.identy.getAsHighestSecurityLevelReached;
import com.karumi.dexter.BuildConfig;
import defpackage.a;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class PngBadCharsetException extends arid.PngjException {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10;
    private static int $11;
    private static char[] PngjBadSignature;
    private static boolean PngjExceptionInternal;
    private static int PngjInputException;
    private static int PngjPrematureEnding;
    private static boolean PngjUnsupportedException;
    private static int valueOf;
    private static char[] values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$e(byte b, byte b2, short s) {
        int i;
        int i2;
        int i3 = 102 - s;
        byte[] bArr = $$c;
        int i4 = (b * 3) + 4;
        int i5 = (b2 * 3) + 1;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            byte[] bArr3 = bArr;
            i2 = 0;
            int i6 = i5;
            i4++;
            i3 = (-i3) + i6;
            bArr = bArr3;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i5) {
                return new String(bArr2, 0);
            }
            byte b3 = bArr[i4];
            byte[] bArr4 = bArr;
            i6 = i3;
            i3 = b3;
            bArr3 = bArr4;
            i4++;
            i3 = (-i3) + i6;
            bArr = bArr3;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i5) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i5) {
            }
        }
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        PngjInputException = 0;
        PngjPrematureEnding = 1;
        PngjBadSignature = new char[]{40100, 40189, 40191, 40191, 40164, 40154, 40159, 40176, 40189, 40191, 40185, 40109, 40189, 40179, 40188, 40177, 40186, 40103, 40179, 40186, 40191, 40183, 40176, 40157, 40154, 40164, 40191, 40188, 40179, 40181, 40191, 40102, 40188, 40186, 40187, 40164, 40161, 40180, 39979, 40021, 40021, 39976, 40142, 39976, 40018, 40023, 40020, 39978, 39978, 39977, 39978, 40017, 40021, 40021, 40018, 39984, 39991, 40018, 40101, 40176, 40188, 40184, 40185, 40189, 40176, 40190, 40164, 40165, 40190, 40184, 40099, 40164, 40165, 40186, 40164, 40191, 40191, 40191, 40176, 40188, 40184, 40185, 40189, 40176, 40108, 40188, 40179, 40166, 40167, 40191, 40185, 40077, 40152, 40184, 40186, 40190, 40186, 40166, 40123, 40191, 40164, 40186, 40186, 40183, 40177, 40185, 40189, 40179, 40178, 40176, 40178, 40189, 40165, 40167, 40167, 40190, 40189, 40167, 40102, 40176, 40182, 40189, 40167, 40167, 40060, 40046, 40046, 40040, 40047, 40060, 40047, 40046, 39968, 40045, 40056, 40341, 40036, 40047, 40036, 40033, 40079, 40155, 40186, 40190, 40188, 40190, 40176, 40182, 40189, 40167, 40111, 40166, 40165, 40166, 40190, 40190, 40191, 40176, 40181, 40189, 40191, 40067, 40154, 40191, 40177, 40156, 40154, 40189, 40184, 40167, 40162, 40162, 40133, 40109, 40133, 40158, 40184, 40133, 40133, 40184, 40188, 40190, 40191, 40165, 40162, 40135, 40158, 40189, 40190, 40190, 40164, 40190, 40176, 40158, 40133, 40162, 40141, 39976, 40018, 40018, 39991, 39989, 40023, 40022, 39983, 39951, 39991, 39978, 39982, 39983, 39944, 39991, 40017, 40102, 40185, 40134, 40157, 39936, 40383, 40346, 40325, 40354, 40354, 40359, 40376, 40381, 40346, 40325, 40382, 40099, 40191, 40177, 40156, 40132, 40164, 40189, 40189, 40189, 40185, 40134, 40102, 40178, 40191, 40186, 40179, 40185, 40186, 40183, 40189, 40186, 40185, 40096, 40191, 40191, 40186, 40133, 40132, 40160, 40184, 40156, 40132, 40160, 40190, 40181, 40182, 40183, 40189, 40186, 40186, 39967, 40324, 40325, 40332, 40320, 40320, 40333, 40035, 40034, 40328, 40328, 40034, 40034, 40322, 40321, 40323, 40347, 40338, 40348, 40349, 40350, 40326, 40333, 40100, 40182, 40189, 40185, 40153, 40156, 40190, 40190, 40182, 40157, 40123, 40154, 40191, 40177, 40185, 40135, 40153, 40067, 40154, 40191, 40177, 40156, 40132, 40166, 40160, 40134, 40096, 39957, 39946, 39984, 39955, 40188, 39966, 39993, 40109, 40167, 40165, 40165, 40166, 40186, 40154, 40158, 40189, 40188, 40184, 40133, 40157, 40189, 40164, 40165, 40155, 40101, 40175, 39958, 40190, 40177, 40168, 40107, 39988, 40017, 40017, 39988, 39949, 39983, 39988, 39988, 39983, 39971, 39981, 39982, 40020, 40017, 39990, 39946, 39978, 39976, 39981, 39969, 39977, 40067, 40157, 40176, 40185, 40134, 40128, 40173, 40164, 40188, 40186, 40187, 40139, 39981, 39979, 39979, 39951, 39989, 39982, 39983, 39978, 39946, 39937, 39974, 40021, 39979, 39971, 39970};
        values = new char[]{25337, 25329, 25342, 25094, 25336, 25339, 25333, 25338, 25332, 25136, 25330, 25335, 25093, 25334, 25343, 25091, 25328, 25095, 25323, 25137, 25341, 25151, 25092, 25089, 25320, 25141, 25321, 25128, 25322};
        valueOf = -2081201566;
        PngjUnsupportedException = true;
        PngjExceptionInternal = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x1cb5, code lost:
    
        if ((r9 & 100) < r52) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x1cc7, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x2259, code lost:
    
        if (r0 != false) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x225b, code lost:
    
        r0 = arid.chunks.PngBadCharsetException.PngjInputException + 95;
        arid.chunks.PngBadCharsetException.PngjPrematureEnding = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x2267, code lost:
    
        if ((r0 % 2) != 0) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x2269, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x05f7, code lost:
    
        if (((r0 & r3) | (r0 ^ r3)) != 477111747) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x08dc, code lost:
    
        if (android.os.Build.VERSION.SDK_INT <= 33) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x08de, code lost:
    
        r0 = arid.chunks.PngBadCharsetException.PngjPrematureEnding + 33;
        arid.chunks.PngBadCharsetException.PngjInputException = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x2b21, code lost:
    
        if (r7 == null) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x08ea, code lost:
    
        if ((r0 % 2) == 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x08ec, code lost:
    
        r3 = new java.lang.Object[1];
        c(null, null, 7 >> android.view.View.resolveSize(1, 1), "\u008d\u0089\u008a\u0092\u0083\u0097\u0090\u0081\u0081\u008c\u0097\u0092\u0084\u0096\u0084\u0095\u0083\u0083\u0094\u008e\u0086\u0091\u0086\u0094\u008d\u008e\u0092\u0094", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0900, code lost:
    
        r0 = new java.lang.Object[]{(java.lang.String) r3[0]};
        r3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1666380462);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x090b, code lost:
    
        if (r3 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x090d, code lost:
    
        r3 = (char) ((-1) - android.text.TextUtils.indexOf((java.lang.CharSequence) r5, '0', 0, 0));
        r46 = 28 - (android.os.Process.myPid() >> 22);
        r4 = (android.view.ViewConfiguration.getTouchSlop() >> 8) + 1447;
        r7 = arid.chunks.PngBadCharsetException.$$a[r35];
        r9 = (byte) (r7 + 1);
        r11 = new java.lang.Object[1];
        a(r7, r9, r9, r11);
        r3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(r3, r46, r4, -1614962923, false, (java.lang.String) r11[0], new java.lang.Class[]{r6});
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x094e, code lost:
    
        r3 = ((java.lang.Long) ((java.lang.reflect.Method) r3).invoke(null, r0)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x095b, code lost:
    
        r9 = -1426345073;
        r3 = ((-929) * r3) + ((-464) * r9);
        r9 = r9 ^ r14;
        r47 = r3 | r39;
        r11 = ((465 * (r47 | r9)) + ((930 * (r3 | ((r9 | r39) ^ r14))) + (((-465) * (r9 | (r47 ^ r14))) + r3))) + 1896833390;
        r0 = ((int) (r11 >>> 105)) & (((((~((-458442345) | r74)) | 441648704) | (~(995577706 | r8))) * 988) + ((((~((-16793641) | r8)) | (~(995577706 | r74))) * 988) - 448979650));
        r3 = ((int) r11) & ((((~(455906116 | r8)) | 542195745) * (-964)) + ((((~(455906116 | r74)) | 981320293) * (-964)) - 1744101675));
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x09d8, code lost:
    
        if (((r0 & r3) | (r0 ^ r3)) != 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0ae5, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0b65, code lost:
    
        if (r0 == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0b67, code lost:
    
        r0 = '9';
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0b6e, code lost:
    
        if (r0 == 'A') goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0b70, code lost:
    
        r0 = arid.chunks.PngBadCharsetException.PngjPrematureEnding;
        arid.chunks.PngBadCharsetException.PngjInputException = ((r0 & 99) + (r0 | 99)) % 128;
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x1cc4, code lost:
    
        if ((r9 + 100 < r52 ? kotlin.text.Typography.greater : 22) != '>') goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x1579, code lost:
    
        if (((r0 & r4) | (r0 ^ r4)) == 477111747) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:651:0x0b6a, code lost:
    
        r0 = 'A';
     */
    /* JADX WARN: Code restructure failed: missing block: B:652:0x0ae2, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:653:0x09dc, code lost:
    
        r3 = new java.lang.Object[1];
        c(null, null, 127 - android.view.View.resolveSize(0, 0), "\u008d\u0089\u008a\u0092\u0083\u0097\u0090\u0081\u0081\u008c\u0097\u0092\u0084\u0096\u0084\u0095\u0083\u0083\u0094\u008e\u0086\u0091\u0086\u0094\u008d\u008e\u0092\u0094", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x09f0, code lost:
    
        r0 = new java.lang.Object[]{(java.lang.String) r3[0]};
        r3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1666380462);
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:0x09fb, code lost:
    
        if (r3 != null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:656:0x09fd, code lost:
    
        r3 = (char) ((-1) - android.text.TextUtils.indexOf((java.lang.CharSequence) r5, '0'));
        r46 = android.view.KeyEvent.getDeadChar(0, 0) + 28;
        r4 = 1446 - android.os.Process.getGidForName(r5);
        r7 = arid.chunks.PngBadCharsetException.$$a[r35];
        r9 = (byte) (r7 + 1);
        r11 = new java.lang.Object[1];
        a(r7, r9, r9, r11);
        r3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(r3, r46, r4, -1614962923, false, (java.lang.String) r11[0], new java.lang.Class[]{r6});
     */
    /* JADX WARN: Code restructure failed: missing block: B:657:0x0a3b, code lost:
    
        r3 = ((java.lang.Long) ((java.lang.reflect.Method) r3).invoke(null, r0)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:658:0x0a48, code lost:
    
        r9 = -396991984;
        r3 = ((-216) * r3) + ((-433) * r9);
        r11 = 217;
        r47 = r9 ^ r14;
        r3 = defpackage.a.b(1209276849);
        r51 = r3 ^ r14;
        r45 = r3 ^ r14;
        r11 = ((r11 * (r9 | ((r45 | r51) ^ r14))) + (((((r47 | r45) ^ r14) | ((r47 | r3) ^ r14)) * r11) + (((((r47 | r51) ^ r14) | ((r45 | r3) ^ r14)) * r11) + r3))) + 867480301;
        r3 = (int) android.os.SystemClock.elapsedRealtime();
        r0 = ((int) (r11 >> 32)) & ((((~(1916934646 | r3)) | (~((~r3) | (-940806239)))) * 979) + ((((-940806239) | r3) * (-979)) + (((~(1916934646 | r4)) * 979) - 710769166)));
        r4 = ~android.os.Process.myPid();
        r3 = ((int) r11) & ((((~(r4 | (-825001669))) | 2032739217) * 160) + ((((~(r4 | 2032739217)) | (-2033035222)) * (-160)) + 873892341));
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x0ae0, code lost:
    
        if (((r0 & r3) | (r0 ^ r3)) != 1) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:660:0x0ae8, code lost:
    
        r3 = new java.lang.Object[1];
        b(new int[]{r32, r31, 0, 9}, "\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001", true, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x0aff, code lost:
    
        r0 = new java.lang.Object[]{(java.lang.String) r3[0]};
        r3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:662:0x0b07, code lost:
    
        if (r3 != null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:663:0x0b09, code lost:
    
        r3 = (char) (android.graphics.Color.blue(0) + 8752);
        r46 = 24 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16);
        r4 = 335 - ((byte) android.view.KeyEvent.getModifierMetaStateMask());
        r7 = arid.chunks.PngBadCharsetException.$$a[r35];
        r9 = r7;
        r11 = new java.lang.Object[1];
        a(r7, r9, r9, r11);
        r3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(r3, r46, r4, -598779726, false, (java.lang.String) r11[0], new java.lang.Class[]{r6});
     */
    /* JADX WARN: Code restructure failed: missing block: B:664:0x0b45, code lost:
    
        r0 = ((java.lang.reflect.Method) r3).invoke(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:665:0x0b4c, code lost:
    
        r4 = new java.lang.Object[1];
        b(new int[]{30, 1, 165, 0}, "\u0000", false, r4);
        r0 = r0.equals((java.lang.String) r4[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:673:0x06ef, code lost:
    
        if (((r0 & r3) | (r0 ^ r3)) != 477111747) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:681:0x07e3, code lost:
    
        if (((r0 & r3) | (r0 ^ r3)) != (-1032769152)) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:689:0x08d6, code lost:
    
        if ((r0 | (((int) r3) & defpackage.a.c(r4 | 550659586, 220, ((550954499 | r4) * (-220)) + 332564043, -1704909594))) == 542074309) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x125a, code lost:
    
        if (r52 != null) goto L139;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x170b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x177f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x19e0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x1a55  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x1ccc  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x1d59  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x23d9  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x2458  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x2a12  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x2a2e  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x2a37  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x2aa5  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x2cb4  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x33ca  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x33d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x33d4  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x33cd  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x2d25  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x2a31  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x2a18  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x2355 A[Catch: all -> 0x2397, TryCatch #13 {all -> 0x2397, blocks: (B:569:0x234b, B:571:0x2355, B:572:0x2399), top: B:568:0x234b, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:700:0x3f05  */
    /* JADX WARN: Removed duplicated region for block: B:701:0x3f06  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object[] PngjBadSignature$1eba2e16(int i, Object obj, int i2) {
        Throwable cause;
        int i3;
        int i4;
        int i5;
        int i6;
        Class cls;
        long j;
        long j2;
        long j3;
        int i7;
        int i8;
        int i9;
        int i10;
        long j4;
        int i11;
        int i12;
        Class cls2;
        String str;
        long j5;
        String[] strArr;
        boolean z;
        long j6;
        boolean z2;
        long j7;
        boolean z3;
        int i13;
        int i14;
        int i15;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2;
        int i16;
        int i17;
        BufferedInputStream bufferedInputStream3;
        Class cls3;
        BufferedInputStream bufferedInputStream4;
        int i18;
        boolean z4;
        int i19;
        char c;
        Object[] objArr;
        Class cls4;
        String[] strArr2;
        int i20;
        Object[] objArr2;
        Object PngjBadSignature2;
        String str2;
        int parseInt;
        boolean z5;
        String[] strArr3;
        Object obj2;
        Object invoke;
        int i21;
        Object obj3;
        Object obj4;
        Object obj5;
        Class cls5 = Integer.TYPE;
        try {
            Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1085800324);
            if (PngjBadSignature3 == null) {
                i3 = 989703296;
                char c2 = (char) (1179 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                int resolveOpacity = Drawable.resolveOpacity(0, 0) + 44;
                i4 = 31;
                int lastIndexOf = 1091 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0);
                byte b = $$a[4];
                i5 = 13;
                byte b2 = b;
                i6 = 17;
                Object[] objArr3 = new Object[1];
                a(b, b2, b2, objArr3);
                PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c2, resolveOpacity, lastIndexOf, -1135046081, false, (String) objArr3[0], new Class[0]);
            } else {
                i3 = 989703296;
                i4 = 31;
                i5 = 13;
                i6 = 17;
            }
            long longValue = ((Long) ((Method) PngjBadSignature3).invoke(null, null)).longValue();
            long j8 = 878741387;
            cls = cls5;
            long j9 = 140;
            j = i;
            j2 = -1;
            long j10 = (j8 ^ j2) | longValue;
            j3 = j ^ j2;
            long j11 = (j9 * ((((longValue ^ j2) | j8) ^ j2) | ((j3 | j8) ^ j2) | ((j10 | j) ^ j2))) + ((-280) * ((j10 ^ j2) | ((j3 | longValue) ^ j2))) + ((longValue | j) * j9) + ((-279) * longValue) + (141 * j8) + 1046174930;
            int b3 = a.b(973965672);
            int i22 = ~b3;
            i7 = ((int) (j11 >> 32)) & ((((~(i22 | 469696903)) | 536892448 | (~(b3 | (-469696904)))) * 988) + ((39059844 | (~(i22 | 967529507))) * (-1976)) + ((b3 | 536892448) * 988) + 1063439494);
            i8 = (int) j11;
            i9 = ~i;
        } catch (Throwable th) {
            cause = th.getCause();
            if (cause == null) {
            }
        }
        if ((i7 | (i8 & ((((~((-673356509) | i9)) | 2230872 | (~((-1439457283) | i))) * 676) + (((~((-2110582919) | i9)) | 671125636) * 676) + (((-671125637) | i) * (-676)) + 2110363881))) != 0) {
            Object[] objArr4 = {new int[]{r3}, new int[1], null, new int[]{i}};
            int i23 = (~(i & 271)) & (i | 271);
            int freeMemory = (int) Runtime.getRuntime().freeMemory();
            int i24 = ~freeMemory;
            int i25 = (((~((-629888594) | i24)) | 672256 | (~((-404677381) | i24)) | (~(1033893717 | freeMemory))) * (-84)) + 2038761785;
            int i26 = (~(freeMemory | (-404677381))) | 629888593;
            int i27 = ~(i24 | 404677380);
            int i28 = ((i27 | (-1033893718)) * 84) + ((i26 | i27) * (-84)) + i25;
            int PngjBadCrcException = getAsHighestSecurityLevelReached.PngjBadCrcException();
            int i29 = -(-(i28 * 471));
            int i30 = (7536 & i29) + (i29 | 7536);
            int i31 = ((i28 ^ 16) | (i28 & 16)) * (-470);
            int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
            int i33 = ~i28;
            int i34 = ~(((-17) & i33) | ((-17) ^ i33));
            int i35 = ~((i33 ^ PngjBadCrcException) | (i33 & PngjBadCrcException));
            int i36 = (i34 & i35) | (i34 ^ i35);
            int i37 = ~((~PngjBadCrcException) | 16 | i28);
            int i38 = (i32 - (~(((i36 & i37) | (i36 ^ i37)) * (-470)))) - 1;
            int i39 = (i33 & 16) | (i33 ^ 16);
            int i40 = ~((i39 & PngjBadCrcException) | (i39 ^ PngjBadCrcException));
            int i41 = ~PngjBadCrcException;
            int i42 = ~((i41 & 16) | (i41 ^ 16) | i28);
            int i43 = ((i42 & i40) | (i40 ^ i42)) * 470;
            int i44 = -(-(((i38 | i43) << 1) - (i43 ^ i38)));
            int i45 = ((i2 | i44) << 1) - (i44 ^ i2);
            int i46 = i45 << 13;
            int i47 = (i46 | i45) & (~(i45 & i46));
            int i48 = i47 ^ (i47 >>> 17);
            int i49 = i48 << 5;
            ((int[]) objArr4[1])[0] = ((~i48) & i49) | ((~i49) & i48);
            return objArr4;
        }
        int i50 = -1;
        Object[] objArr5 = new Object[1];
        b(new int[]{0, 11, 0, 3}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001", false, objArr5);
        Object[] objArr6 = {(String) objArr5[0]};
        Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(547370249);
        if (PngjBadSignature4 == null) {
            char jumpTapTimeout = (char) (8752 - (ViewConfiguration.getJumpTapTimeout() >> 16));
            i12 = 547370249;
            int rgb = (-16777192) - Color.rgb(0, 0, 0);
            int i51 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 335;
            i10 = 3;
            byte b4 = $$a[4];
            i11 = 4;
            byte b5 = b4;
            j4 = j;
            Object[] objArr7 = new Object[1];
            a(b4, b5, b5, objArr7);
            PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(jumpTapTimeout, rgb, i51, -598779726, false, (String) objArr7[0], new Class[]{String.class});
        } else {
            i10 = 3;
            j4 = j;
            i11 = 4;
            i12 = 547370249;
        }
        Object invoke2 = ((Method) PngjBadSignature4).invoke(null, objArr6);
        if (invoke2 != null) {
            cls2 = String.class;
            Object[] objArr8 = new Object[1];
            j5 = 0;
            b(new int[]{11, 6, 0, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001", false, objArr8);
            String str3 = (String) objArr8[0];
            str = BuildConfig.FLAVOR;
            int indexOf = TextUtils.indexOf(str, str, 0);
            int i52 = (indexOf ^ 127) + ((indexOf & 127) << 1);
            Object[] objArr9 = new Object[1];
            c(null, null, i52, "\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr9);
            Object[] objArr10 = {invoke2, new String[]{str3, (String) objArr9[0]}};
            Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-344601997);
            if (PngjBadSignature5 == null) {
                char c3 = (char) (26716 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 33;
                int pressedStateDuration = 1668 - (ViewConfiguration.getPressedStateDuration() >> 16);
                byte b6 = $$a[i11];
                byte b7 = b6;
                Object[] objArr11 = new Object[1];
                a(b6, b7, b7, objArr11);
                PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c3, windowTouchSlop, pressedStateDuration, 396011464, false, (String) objArr11[0], new Class[]{cls2, String[].class});
            }
            long longValue2 = ((Long) ((Method) PngjBadSignature5).invoke(null, objArr10)).longValue();
            long j12 = 29357480;
            long j13 = (565 * longValue2) + ((-563) * j12);
            long j14 = j12 ^ j2;
            long j15 = longValue2 ^ j2;
            long b8 = a.b(1296201134);
            long j16 = b8 ^ j2;
            long j17 = ((564 * (((j14 | j16) ^ j2) | ((j12 | longValue2) ^ j2))) + ((1128 * (((j14 | longValue2) | b8) ^ j2)) + (((-564) * ((j14 | ((j15 | j16) ^ j2)) | ((longValue2 | b8) ^ j2))) + j13))) - 1715949701;
            int i53 = (int) Runtime.getRuntime().totalMemory();
            int i54 = ~i53;
            int i55 = ((int) (j17 >> 32)) & ((((~(i53 | (-274333866))) | (~((-1862565463) | i54)) | 1711560276) * 676) + (((~((-425339052) | i54)) | 151005186) * 676) + (((-151005187) | i53) * (-676)) + 1002001506);
            int i56 = ((int) j17) & (((1945147221 | (~((-507920812) | i))) * 502) + ((~(2146883583 | i9)) * (-502)) + ((((~(1945147221 | i)) | 1638962772) * (-502)) - 221765025));
            if (((i55 & i56) | (i55 ^ i56)) != 0) {
                Object[] objArr12 = new Object[1];
                c(null, null, 126 - (~(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), "\u0089\u0092\u0089\u008c\u008e\u008d\u0090\u0085\u008c\u0091\u0090\u008f\u008a\u008e\u008d\u008c\u0084\u0082\u0089\u008b\u008a\u0082\u0089", objArr12);
                Object[] objArr13 = {(String) objArr12[0]};
                Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i12);
                if (PngjBadSignature6 == null) {
                    char rgb2 = (char) (Color.rgb(0, 0, 0) + 16785968);
                    int resolveOpacity2 = Drawable.resolveOpacity(0, 0) + 24;
                    int argb = 336 - Color.argb(0, 0, 0, 0);
                    byte b9 = $$a[i11];
                    byte b10 = b9;
                    Object[] objArr14 = new Object[1];
                    a(b9, b10, b10, objArr14);
                    PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(rgb2, resolveOpacity2, argb, -598779726, false, (String) objArr14[0], new Class[]{cls2});
                }
                Object invoke3 = ((Method) PngjBadSignature6).invoke(null, objArr13);
                int i57 = -View.MeasureSpec.getSize(0);
                int i58 = i57 * (-183);
                int i59 = ((i58 & 23495) << 1) + (i58 ^ 23495);
                int i60 = ~i57;
                int i61 = ~((i60 ^ 127) | (i60 & 127));
                int i62 = ~((i9 ^ 127) | (i9 & 127));
                int i63 = -(-(((i61 & i62) | (i61 ^ i62)) * 184));
                int i64 = ~((i57 & (-128)) | ((-128) ^ i57));
                int i65 = (((i59 ^ i63) + ((i59 & i63) << 1)) - (~(((i64 & i) | (i ^ i64)) * (-184)))) - 1;
                int i66 = ~i;
                Object[] objArr15 = new Object[1];
                c(null, null, ((~((i66 & i60) | (i60 ^ i66))) * 184) + i65, "\u0089\u0092\u0089\u008c\u008e\u008d\u0090\u0085\u008c\u0091\u0090\u008f\u008a\u008f\u0092\u008e\u0087\u0093\u0087\u008a\u008e\u008d\u008c\u0084\u0082\u0089\u008b\u008a\u0082\u0089", objArr15);
                Object[] objArr16 = {(String) objArr15[0]};
                Object PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i12);
                if (PngjBadSignature7 == null) {
                    char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 8753);
                    int i67 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 23;
                    int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 337;
                    byte b11 = $$a[i11];
                    byte b12 = b11;
                    obj4 = invoke3;
                    Object[] objArr17 = new Object[1];
                    a(b11, b12, b12, objArr17);
                    PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(bitsPerPixel, i67, bitsPerPixel2, -598779726, false, (String) objArr17[0], new Class[]{cls2});
                } else {
                    obj4 = invoke3;
                }
                Object invoke4 = ((Method) PngjBadSignature7).invoke(null, objArr16);
                if (obj4 != null) {
                    Object[] objArr18 = {obj4, 42};
                    Object PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                    if (PngjBadSignature8 == null) {
                        char c4 = (char) (11040 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        int edgeSlop = 31 - (ViewConfiguration.getEdgeSlop() >> 16);
                        int indexOf2 = TextUtils.indexOf(str, str, 0, 0) + 1282;
                        byte b13 = $$a[i11];
                        byte b14 = (byte) (b13 + 1);
                        obj5 = invoke4;
                        Object[] objArr19 = new Object[1];
                        a(b13, b14, b14, objArr19);
                        PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c4, edgeSlop, indexOf2, -971849413, false, (String) objArr19[0], new Class[]{cls2, cls});
                    } else {
                        obj5 = invoke4;
                    }
                    long longValue3 = ((Long) ((Method) PngjBadSignature8).invoke(null, objArr18)).longValue();
                    long j18 = -1155924847;
                    long j19 = ((-756) * longValue3) + (758 * j18);
                    long startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                    long j20 = startElapsedRealtime ^ j2;
                    long j21 = longValue3 ^ j2;
                    long j22 = (757 * ((((j18 ^ j2) | j21) ^ j2) | ((j21 | j20) ^ j2) | (((j18 | longValue3) | startElapsedRealtime) ^ j2))) + (1514 * (((j21 | j18) | startElapsedRealtime) ^ j2)) + ((-757) * (j18 | j20)) + j19 + 1811632547;
                    int i68 = ((int) (j22 >> 32)) & ((((~((-1861810964) | i)) | (~((-424584553) | i9))) * 959) + ((((~((-1861810964) | i9)) | (~((-424584553) | i))) * 959) - 782751515));
                    int i69 = ((int) j22) & ((((~((-1108354408) | i)) | 294260736) * 302) + ((~((-1073743142) | i)) * (-604)) + (((~((-1073743142) | i9)) | (~((-34611267) | i))) * (-302)) + 2038225915);
                } else {
                    obj5 = invoke4;
                }
                if (obj5 != null) {
                    Object[] objArr20 = {obj5, 42};
                    Object PngjBadSignature9 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                    if (PngjBadSignature9 == null) {
                        char scrollBarSize = (char) (11039 - (ViewConfiguration.getScrollBarSize() >> 8));
                        int pressedStateDuration2 = 31 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        int alpha = 1282 - Color.alpha(0);
                        byte b15 = $$a[i11];
                        byte b16 = (byte) (b15 + 1);
                        Object[] objArr21 = new Object[1];
                        a(b15, b16, b16, objArr21);
                        PngjBadSignature9 = com.d.e.a.PngjBadCrcException.PngjBadSignature(scrollBarSize, pressedStateDuration2, alpha, -971849413, false, (String) objArr21[0], new Class[]{cls2, cls});
                    }
                    long longValue4 = ((Long) ((Method) PngjBadSignature9).invoke(null, objArr20)).longValue();
                    long j23 = 98302024;
                    long j24 = ((-163) * longValue4) + (165 * j23);
                    long myPid = Process.myPid();
                    long j25 = myPid ^ j2;
                    long j26 = ((-328) * (j23 | ((j25 | longValue4) ^ j2))) + j24;
                    long j27 = 164;
                    long j28 = longValue4 ^ j2;
                    long j29 = (j27 * ((((j25 | j23) | longValue4) ^ j2) | (((j23 ^ j2) | j28) ^ j2) | ((j28 | myPid) ^ j2))) + ((j23 | myPid) * j27) + j26 + 557405676;
                    int i70 = ((int) (j29 >> 32)) & ((((~((-2051313829) | i9)) | (-1591650910)) * 398) + ((((~((-2051313829) | i)) | (-1591650910)) * 398) - 75166790));
                    int c5 = ((int) j29) & a.c((~((-1092340235) | i)) | 133632, 490, (((-1092206603) | i9) * (-490)) + 1944863423, -1757892984);
                }
                if (obj4 != null) {
                    Object[] objArr22 = {obj4, 42};
                    Object PngjBadSignature10 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                    if (PngjBadSignature10 == null) {
                        char deadChar = (char) (11039 - KeyEvent.getDeadChar(0, 0));
                        int pressedStateDuration3 = 31 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        int indexOf3 = TextUtils.indexOf(str, str) + 1282;
                        byte b17 = $$a[i11];
                        byte b18 = (byte) (b17 + 1);
                        Object[] objArr23 = new Object[1];
                        a(b17, b18, b18, objArr23);
                        PngjBadSignature10 = com.d.e.a.PngjBadCrcException.PngjBadSignature(deadChar, pressedStateDuration3, indexOf3, -971849413, false, (String) objArr23[0], new Class[]{cls2, cls});
                    }
                    long longValue5 = ((Long) ((Method) PngjBadSignature10).invoke(null, objArr22)).longValue();
                    long j30 = -6840165;
                    long j31 = ((-328) * (j30 | ((j3 | longValue5) ^ j2))) + ((-163) * longValue5) + (165 * j30);
                    long j32 = 164;
                    long j33 = longValue5 ^ j2;
                    long j34 = (j32 * ((((j3 | j30) | longValue5) ^ j2) | (((j30 ^ j2) | j33) ^ j2) | ((j33 | j4) ^ j2))) + ((j30 | j4) * j32) + j31 + 662547865;
                    int i71 = ((int) (j34 >> 32)) & ((((~((-33656835) | i)) | 1208222120) * 366) + ((((~(2016153085 | i)) | (-841587800)) * (-366)) - 1468894806));
                    int i72 = ~((int) Runtime.getRuntime().maxMemory());
                    int i73 = ~(196839203 | i72);
                    int i74 = ((int) j34) & (((i73 | (-1792957423)) * 764) + (((~(i72 | (-1634065614))) | 18973697) * (-1528)) + (((-1634065614) | i73) * 764) + 100328537);
                }
                if (obj5 != null) {
                    Object[] objArr24 = {obj5, 42};
                    Object PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                    if (PngjBadSignature11 == null) {
                        char offsetAfter = (char) (11039 - TextUtils.getOffsetAfter(str, 0));
                        int indexOf4 = 31 - TextUtils.indexOf(str, str);
                        int i75 = 1283 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        byte b19 = $$a[i11];
                        byte b20 = (byte) (b19 + 1);
                        Object[] objArr25 = new Object[1];
                        a(b19, b20, b20, objArr25);
                        PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature(offsetAfter, indexOf4, i75, -971849413, false, (String) objArr25[0], new Class[]{cls2, cls});
                    }
                    long longValue6 = ((Long) ((Method) PngjBadSignature11).invoke(null, objArr24)).longValue();
                    long j35 = -127458912;
                    long j36 = ((j35 ^ j2) | longValue6) ^ j2;
                    long j37 = ((-140) * (j36 | ((longValue6 | j4) ^ j2))) + ((-69) * longValue6) + (71 * j35);
                    long j38 = 70;
                    long j39 = (j38 * (((j35 | j4) ^ j2) | j36 | (((longValue6 ^ j2) | j35) ^ j2))) + ((((j35 | longValue6) | j4) ^ j2) * j38) + j37 + 783166612;
                    int i76 = ((int) (j39 >> 32)) & ((((~(7457307 | i)) | 4276240) * 302) + ((~((-1426588037) | i)) * (-604)) + (((~((-1426588037) | i9)) | (~(1434045343 | i))) * (-302)) + 1478659202);
                    int i77 = ~(((int) Process.getElapsedCpuTime()) | (-886271911));
                }
            }
        } else {
            cls2 = String.class;
            str = BuildConfig.FLAVOR;
            j5 = 0;
        }
        boolean z6 = false;
        if (z6) {
            Object[] objArr26 = new Object[i11];
            objArr26[0] = new int[]{r5};
            objArr26[1] = new int[1];
            objArr26[i10] = new int[]{i};
            int i78 = (~(i & 260)) & (i | 260);
            objArr26[2] = null;
            int freeMemory2 = (int) Runtime.getRuntime().freeMemory();
            int i79 = (((~(freeMemory2 | (-141137973))) | 4227104 | (~((~freeMemory2) | 1030338869))) * 521) + ((893428001 | freeMemory2) * 521) + ((((~(r4 | 893428001)) | 141137972) * (-1042)) - 66515200);
            int i80 = i79 * 306;
            int i81 = ((5506 | i80) << 1) - (i80 ^ 5506);
            int i82 = ~((i79 ^ 16) | (i79 & 16));
            int i83 = ~((i ^ 16) | (i & 16));
            int i84 = (i81 - (~(-(-(((i82 & i83) | (i82 ^ i83)) * 305))))) - 1;
            int i85 = ~i79;
            int i86 = ~i;
            int i87 = ~((i86 & 16) | (i86 ^ 16));
            int i88 = ((i87 & i85) | (i85 ^ i87)) * 305;
            int i89 = (i2 - (~(-(-((i84 & i88) + (i88 | i84)))))) - 1;
            int i90 = i89 ^ (i89 << 13);
            int i91 = i90 >>> 17;
            int i92 = ((~i90) & i91) | ((~i91) & i90);
            int i93 = i92 << 5;
            ((int[]) objArr26[1])[0] = (i92 | i93) & (~(i92 & i93));
            return objArr26;
        }
        int size = View.MeasureSpec.getSize(0);
        int i94 = size * 765;
        int i95 = ((i94 | (-193929)) << 1) - (i94 ^ (-193929));
        int i96 = ~i;
        int i97 = ~((i96 ^ size) | (i96 & size));
        int i98 = (i95 - (~(-(-(((i97 & 127) | (i97 ^ 127)) * 764))))) - 1;
        int i99 = ~size;
        int i100 = ~((i99 & 127) | (i99 ^ 127));
        int i101 = ~(i9 | 127);
        int i102 = (((i100 & i101) | (i100 ^ i101)) * (-1528)) + i98;
        int i103 = ~size;
        int i104 = ~((i103 & 127) | (i103 ^ 127));
        int i105 = ~((-128) | size);
        int i106 = (i104 & i105) | (i104 ^ i105);
        int i107 = ~((size & i9) | (i9 ^ size));
        int i108 = -(-(((i107 & i106) | (i106 ^ i107)) * 764));
        int i109 = (i102 & i108) + (i108 | i102);
        Object[] objArr27 = new Object[1];
        c(null, null, i109, "\u0087\u0093\u0092\u0095\u0098\u0097\u0084\u0090", objArr27);
        String str4 = (String) objArr27[0];
        Object[] objArr28 = new Object[1];
        b(new int[]{i4, 6, 4, 1}, "\u0001\u0000\u0001\u0001\u0001\u0000", true, objArr28);
        String str5 = (String) objArr28[0];
        Object[] objArr29 = new Object[1];
        c(null, null, 126 - TextUtils.indexOf((CharSequence) str, '0'), "\u0084\u0089\u0092\u0087\u008c\u008f\u0084", objArr29);
        String str6 = (String) objArr29[0];
        int i110 = -(SystemClock.elapsedRealtimeNanos() > j5 ? 1 : (SystemClock.elapsedRealtimeNanos() == j5 ? 0 : -1));
        int i111 = (i110 ^ 128) + ((i110 & 128) << 1);
        Object[] objArr30 = new Object[1];
        c(null, null, i111, "\u0089\u0092\u0099\u0089\u0092\u0087\u0097\u0084\u0081", objArr30);
        String str7 = (String) objArr30[0];
        int i112 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
        int i113 = (i112 ^ 127) + ((i112 & 127) << 1);
        Object[] objArr31 = new Object[1];
        c(null, null, i113, "\u0086\u0083\u008d\u0083\u0084\u0086", objArr31);
        String str8 = (String) objArr31[0];
        int lastIndexOf2 = TextUtils.lastIndexOf(str, '0', 0);
        int i114 = ((lastIndexOf2 | 128) << 1) - (lastIndexOf2 ^ 128);
        Object[] objArr32 = new Object[1];
        c(null, null, i114, "\u008d\u0089\u008a\u0081\u008c\u0097\u0092\u0084\u0096\u008e\u0086\u0091\u0086", objArr32);
        String str9 = (String) objArr32[0];
        Object[] objArr33 = new Object[1];
        b(new int[]{37, 5, 80, 0}, "\u0000\u0001\u0001\u0001\u0000", true, objArr33);
        String str10 = (String) objArr33[0];
        Object[] objArr34 = new Object[1];
        c(null, null, 126 - (~(-(ViewConfiguration.getPressedStateDuration() >> 16))), "\u009a\u0085\u0089\u0092\u008b\u0086", objArr34);
        String str11 = (String) objArr34[0];
        Object[] objArr35 = new Object[1];
        c(null, null, 127 - TextUtils.indexOf(str, str, 0, 0), "\u009b\u0086", objArr35);
        String str12 = (String) objArr35[0];
        Object[] objArr36 = new Object[1];
        b(new int[]{42, 16, 83, i10}, "\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001", false, objArr36);
        String str13 = (String) objArr36[0];
        int i115 = (ViewConfiguration.getZoomControlsTimeout() > j5 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j5 ? 0 : -1));
        int PngjBadCrcException2 = getAsHighestSecurityLevelReached.PngjBadCrcException();
        int i116 = i115 * 868;
        int i117 = ((i116 | 109368) << 1) - (i116 ^ 109368);
        int i118 = ~i115;
        int i119 = ~PngjBadCrcException2;
        int i120 = ~((i119 & i118) | (i118 ^ i119));
        int i121 = ~PngjBadCrcException2;
        int i122 = (i117 - (~(-(-((i120 | (~(((-127) ^ i121) | ((-127) & i121)))) * (-867)))))) - 1;
        int i123 = ~i115;
        int i124 = ~((i123 ^ (-127)) | (i123 & (-127)));
        int i125 = ~((i118 ^ PngjBadCrcException2) | (i118 & PngjBadCrcException2));
        int i126 = (i124 ^ i125) | (i125 & i124);
        int i127 = ~(((-127) ^ PngjBadCrcException2) | ((-127) & PngjBadCrcException2));
        int i128 = (i122 - (~(((i126 ^ i127) | (i126 & i127)) * (-1734)))) - 1;
        int i129 = (i123 ^ (-127)) | (i123 & (-127));
        int i130 = ~((i129 & i121) | (i129 ^ i121));
        int i131 = ~((i123 & 126) | (i123 ^ 126) | PngjBadCrcException2);
        int i132 = (i130 & i131) | (i130 ^ i131);
        int i133 = ((-127) & i115) | ((-127) ^ i115);
        int i134 = ~((i133 & PngjBadCrcException2) | (i133 ^ PngjBadCrcException2));
        int i135 = -(-(((i134 & i132) | (i132 ^ i134)) * 867));
        int i136 = (i128 & i135) + (i135 | i128);
        Object[] objArr37 = new Object[1];
        c(null, null, i136, "\u008d\u0089\u008a\u0084\u0081\u0090\u008e\u0081\u0082\u0083", objArr37);
        String str14 = (String) objArr37[0];
        int i137 = -Color.blue(0);
        int i138 = (i137 ^ 127) + ((i137 & 127) << 1);
        Object[] objArr38 = new Object[1];
        c(null, null, i138, "\u0095\u0091\u0090\u0089\u008d\u0082\u0089\u008b", objArr38);
        String str15 = (String) objArr38[0];
        Object[] objArr39 = new Object[1];
        b(new int[]{58, 12, 0, 10}, "\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000", true, objArr39);
        String str16 = (String) objArr39[0];
        Object[] objArr40 = new Object[1];
        b(new int[]{70, 14, 0, 3}, "\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001", true, objArr40);
        String str17 = (String) objArr40[0];
        int resolveSizeAndState = View.resolveSizeAndState(0, 0, 0);
        int i139 = (resolveSizeAndState & 127) + (resolveSizeAndState | 127);
        Object[] objArr41 = new Object[1];
        c(null, null, i139, "\u008e\u0091\u008c\u0082\u008f\u0092\u0089", objArr41);
        String str18 = (String) objArr41[0];
        Object[] objArr42 = new Object[1];
        b(new int[]{84, 7, 0, 0}, "\u0000\u0001\u0000\u0000\u0000\u0001\u0001", true, objArr42);
        String str19 = (String) objArr42[0];
        Object[] objArr43 = new Object[1];
        b(new int[]{91, 7, 0, 0}, "\u0001\u0000\u0001\u0001\u0001\u0001\u0000", true, objArr43);
        String str20 = (String) objArr43[0];
        int i140 = -TextUtils.indexOf(str, str);
        int i141 = ((i140 | 127) << 1) - (i140 ^ 127);
        Object[] objArr44 = new Object[1];
        c(null, null, i141, "\u0087\u0087", objArr44);
        String str21 = (String) objArr44[0];
        Object[] objArr45 = new Object[1];
        b(new int[]{98, 20, 0, 15}, "\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000", false, objArr45);
        String str22 = (String) objArr45[0];
        Object[] objArr46 = new Object[1];
        b(new int[]{118, 6, 0, 0}, "\u0001\u0000\u0000\u0001\u0000\u0001", true, objArr46);
        String str23 = (String) objArr46[0];
        int indexOf5 = TextUtils.indexOf(str, str, 0);
        int i142 = (indexOf5 * 306) + 610;
        int i143 = ((((i142 | 38862) << 1) - (i142 ^ 38862)) - (~(((~(indexOf5 | 127)) | (~((indexOf5 ^ i) | (indexOf5 & i)))) * 305))) - 1;
        int i144 = ~(indexOf5 | i96);
        int i145 = (i143 - (~(-(-((((-128) & i144) | ((-128) ^ i144)) * 305))))) - 1;
        Object[] objArr47 = new Object[1];
        c(null, null, i145, "\u008c\u0087", objArr47);
        String str24 = (String) objArr47[0];
        Object[] objArr48 = new Object[1];
        b(new int[]{124, 16, 135, 2}, null, true, objArr48);
        String str25 = (String) objArr48[0];
        int i146 = -(-(ViewConfiguration.getMaximumFlingVelocity() >> 16));
        int i147 = (i146 & 127) + (i146 | 127);
        Object[] objArr49 = new Object[1];
        c(null, null, i147, "\u0088\u008e\u0090\u008b\u0092\u008d\u0090\u0089\u008e", objArr49);
        String str26 = (String) objArr49[0];
        Object[] objArr50 = new Object[1];
        b(new int[]{140, 10, 0, 0}, "\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000", true, objArr50);
        String str27 = (String) objArr50[0];
        int normalizeMetaState = KeyEvent.normalizeMetaState(0);
        int i148 = ((normalizeMetaState | 127) << 1) - (normalizeMetaState ^ 127);
        Object[] objArr51 = new Object[1];
        c(null, null, i148, "\u009c\u0092\u008e\u008c\u0082\u0089\u0092\u008d\u0090\u0089\u008e", objArr51);
        String str28 = (String) objArr51[0];
        Object[] objArr52 = new Object[1];
        b(new int[]{150, 11, 0, 3}, "\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001", true, objArr52);
        String str29 = (String) objArr52[0];
        int i149 = -(-(ViewConfiguration.getKeyRepeatTimeout() >> 16));
        int i150 = (i149 ^ 127) + ((i149 & 127) << 1);
        Object[] objArr53 = new Object[1];
        c(null, null, i150, "\u0082\u0085\u0091\u0086\u0098\u0081\u0092\u0089\u0098\u0084\u0091\u0086\u009b\u0091\u008c", objArr53);
        String str30 = (String) objArr53[0];
        Object[] objArr54 = new Object[1];
        c(null, null, 126 - (~(-(ViewConfiguration.getKeyRepeatDelay() >> 16))), "\u0087\u0083\u0082\u0097\u008f\u0093\u0087\u0098\u0084\u0091\u0086\u009b\u0091\u008c", objArr54);
        String[] strArr4 = {str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, (String) objArr54[0]};
        Object[] objArr55 = new Object[1];
        b(new int[]{0, 11, 0, 3}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001", false, objArr55);
        Object[] objArr56 = {(String) objArr55[0]};
        Object PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i12);
        if (PngjBadSignature12 == null) {
            char c6 = (char) (8752 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
            int indexOf6 = TextUtils.indexOf(str, str, 0) + 24;
            int indexOf7 = 336 - TextUtils.indexOf(str, str);
            byte b21 = $$a[4];
            byte b22 = b21;
            strArr = strArr4;
            Object[] objArr57 = new Object[1];
            a(b21, b22, b22, objArr57);
            PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c6, indexOf6, indexOf7, -598779726, false, (String) objArr57[0], new Class[]{cls2});
        } else {
            strArr = strArr4;
        }
        Object invoke5 = ((Method) PngjBadSignature12).invoke(null, objArr56);
        if (invoke5 != null) {
            Object[] objArr58 = new Object[1];
            b(new int[]{11, 6, 0, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001", false, objArr58);
            String str31 = (String) objArr58[0];
            int windowTouchSlop2 = ViewConfiguration.getWindowTouchSlop() >> 8;
            int i151 = ((windowTouchSlop2 | 127) << 1) - (windowTouchSlop2 ^ 127);
            Object[] objArr59 = new Object[1];
            c(null, null, i151, "\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr59);
            Object[] objArr60 = {invoke5, new String[]{str31, (String) objArr59[0]}};
            Object PngjBadSignature13 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-344601997);
            if (PngjBadSignature13 == null) {
                char capsMode = (char) (26716 - TextUtils.getCapsMode(str, 0, 0));
                int packedPositionChild = 32 - ExpandableListView.getPackedPositionChild(j5);
                int indexOf8 = TextUtils.indexOf((CharSequence) str, '0', 0, 0) + 1669;
                byte b23 = $$a[4];
                byte b24 = b23;
                Object[] objArr61 = new Object[1];
                a(b23, b24, b24, objArr61);
                PngjBadSignature13 = com.d.e.a.PngjBadCrcException.PngjBadSignature(capsMode, packedPositionChild, indexOf8, 396011464, false, (String) objArr61[0], new Class[]{cls2, String[].class});
            }
            long longValue7 = ((Long) ((Method) PngjBadSignature13).invoke(null, objArr60)).longValue();
            long j40 = -1065548619;
            long j41 = ((-69) * longValue7) + (71 * j40);
            long j42 = ((j40 ^ j2) | longValue7) ^ j2;
            long startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
            long j43 = ((-140) * (j42 | ((longValue7 | startElapsedRealtime2) ^ j2))) + j41;
            long j44 = 70;
            long j45 = ((j44 * ((j42 | (((longValue7 ^ j2) | j40) ^ j2)) | ((j40 | startElapsedRealtime2) ^ j2))) + (((((j40 | longValue7) | startElapsedRealtime2) ^ j2) * j44) + j43)) - 621043602;
            int i152 = ((int) (j45 >> 32)) & ((((~((int) Runtime.getRuntime().maxMemory())) | (-748339331)) * 756) + ((((~((-748339331) | r4)) | (-2109401555)) * (-756)) - 1028631190));
            int i153 = ((int) j45) & ((((-118319557) | i9) * 754) + (((~((-67447109) | i)) | (~((-1488098859) | i9))) * (-754)) + (((((~((-118319557) | i)) | 67447108) | (~((-1555545967) | i))) * (-754)) - 2063007093));
            if (((i152 & i153) | (i152 ^ i153)) != 0) {
                int i154 = PngjInputException + 105;
                PngjPrematureEnding = i154 % 128;
                if (i154 % 2 == 0) {
                    Object[] objArr62 = new Object[1];
                    c(null, null, TextUtils.getCapsMode(str, 0, 1) * 57, "\u0089\u0092\u0089\u008c\u008e\u008d\u0090\u0085\u008c\u0091\u0090\u008f\u008a\u008e\u008d\u008c\u0084\u0082\u0089\u008b\u008a\u0082\u0089", objArr62);
                    Object[] objArr63 = {(String) objArr62[0]};
                    Object PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i12);
                    if (PngjBadSignature14 == null) {
                        char maximumFlingVelocity = (char) (8752 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                        int gidForName = Process.getGidForName(str) + 25;
                        int normalizeMetaState2 = 336 - KeyEvent.normalizeMetaState(0);
                        byte b25 = $$a[4];
                        byte b26 = b25;
                        Object[] objArr64 = new Object[1];
                        a(b25, b26, b26, objArr64);
                        PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(maximumFlingVelocity, gidForName, normalizeMetaState2, -598779726, false, (String) objArr64[0], new Class[]{cls2});
                    }
                    Object invoke6 = ((Method) PngjBadSignature14).invoke(null, objArr63);
                    Object[] objArr65 = new Object[1];
                    c(null, null, 27276 - (~(-(ExpandableListView.getPackedPositionForChild(1, 1) > 1L ? 1 : (ExpandableListView.getPackedPositionForChild(1, 1) == 1L ? 0 : -1)))), "\u0089\u0092\u0089\u008c\u008e\u008d\u0090\u0085\u008c\u0091\u0090\u008f\u008a\u008f\u0092\u008e\u0087\u0093\u0087\u008a\u008e\u008d\u008c\u0084\u0082\u0089\u008b\u008a\u0082\u0089", objArr65);
                    Object[] objArr66 = {(String) objArr65[0]};
                    Object PngjBadSignature15 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i12);
                    if (PngjBadSignature15 == null) {
                        char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 8752);
                        int i155 = 25 - (SystemClock.elapsedRealtimeNanos() > j5 ? 1 : (SystemClock.elapsedRealtimeNanos() == j5 ? 0 : -1));
                        int edgeSlop2 = 336 - (ViewConfiguration.getEdgeSlop() >> 16);
                        byte b27 = $$a[4];
                        byte b28 = b27;
                        obj2 = invoke6;
                        Object[] objArr67 = new Object[1];
                        a(b27, b28, b28, objArr67);
                        PngjBadSignature15 = com.d.e.a.PngjBadCrcException.PngjBadSignature(longPressTimeout, i155, edgeSlop2, -598779726, false, (String) objArr67[0], new Class[]{cls2});
                    } else {
                        obj2 = invoke6;
                    }
                    invoke = ((Method) PngjBadSignature15).invoke(null, objArr66);
                } else {
                    Object[] objArr68 = new Object[1];
                    c(null, null, 126 - (~(-TextUtils.getCapsMode(str, 0, 0))), "\u0089\u0092\u0089\u008c\u008e\u008d\u0090\u0085\u008c\u0091\u0090\u008f\u008a\u008e\u008d\u008c\u0084\u0082\u0089\u008b\u008a\u0082\u0089", objArr68);
                    Object[] objArr69 = {(String) objArr68[0]};
                    Object PngjBadSignature16 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i12);
                    if (PngjBadSignature16 == null) {
                        char c7 = (char) (8753 - (SystemClock.elapsedRealtimeNanos() > j5 ? 1 : (SystemClock.elapsedRealtimeNanos() == j5 ? 0 : -1)));
                        int capsMode2 = TextUtils.getCapsMode(str, 0, 0) + 24;
                        int i156 = 337 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        byte b29 = $$a[4];
                        byte b30 = b29;
                        Object[] objArr70 = new Object[1];
                        a(b29, b30, b30, objArr70);
                        PngjBadSignature16 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c7, capsMode2, i156, -598779726, false, (String) objArr70[0], new Class[]{cls2});
                    }
                    Object invoke7 = ((Method) PngjBadSignature16).invoke(null, objArr69);
                    Object[] objArr71 = new Object[1];
                    c(null, null, (ExpandableListView.getPackedPositionForChild(0, 0) > j5 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j5 ? 0 : -1)) + 128, "\u0089\u0092\u0089\u008c\u008e\u008d\u0090\u0085\u008c\u0091\u0090\u008f\u008a\u008f\u0092\u008e\u0087\u0093\u0087\u008a\u008e\u008d\u008c\u0084\u0082\u0089\u008b\u008a\u0082\u0089", objArr71);
                    Object[] objArr72 = {(String) objArr71[0]};
                    Object PngjBadSignature17 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i12);
                    if (PngjBadSignature17 == null) {
                        char jumpTapTimeout2 = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 8752);
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 24;
                        int blue = 336 - Color.blue(0);
                        byte b31 = $$a[4];
                        byte b32 = b31;
                        obj2 = invoke7;
                        Object[] objArr73 = new Object[1];
                        a(b31, b32, b32, objArr73);
                        PngjBadSignature17 = com.d.e.a.PngjBadCrcException.PngjBadSignature(jumpTapTimeout2, doubleTapTimeout, blue, -598779726, false, (String) objArr73[0], new Class[]{cls2});
                    } else {
                        obj2 = invoke7;
                    }
                    invoke = ((Method) PngjBadSignature17).invoke(null, objArr72);
                    if (obj2 != null) {
                        Object obj6 = invoke;
                        Object[] objArr74 = {obj2, 42};
                        Object PngjBadSignature18 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                        if (PngjBadSignature18 == null) {
                            char c8 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 11039);
                            int maximumFlingVelocity2 = 31 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int lastIndexOf3 = TextUtils.lastIndexOf(str, '0', 0) + 1283;
                            byte b33 = $$a[4];
                            byte b34 = (byte) (b33 + 1);
                            obj3 = obj6;
                            Object[] objArr75 = new Object[1];
                            a(b33, b34, b34, objArr75);
                            PngjBadSignature18 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c8, maximumFlingVelocity2, lastIndexOf3, -971849413, false, (String) objArr75[0], new Class[]{cls2, cls});
                        } else {
                            obj3 = obj6;
                        }
                        long longValue8 = ((Long) ((Method) PngjBadSignature18).invoke(null, objArr74)).longValue();
                        long j46 = -573997224;
                        long j47 = j46 ^ j2;
                        long j48 = ((-1808) * (((j47 | j4) ^ j2) | ((j3 | longValue8) ^ j2))) + ((-903) * longValue8) + (905 * j46);
                        long j49 = 904;
                        long j50 = longValue8 ^ j2;
                        long j51 = j3 | j46;
                        long j52 = (j49 * (((j47 | longValue8) ^ j2) | ((j50 | j4) ^ j2) | (j51 ^ j2))) + (((((j47 | j50) | j4) ^ j2) | ((j51 | longValue8) ^ j2)) * j49) + j48 + 1229704924;
                        int startElapsedRealtime3 = (int) Process.getStartElapsedRealtime();
                        int i157 = ~startElapsedRealtime3;
                        int i158 = ~(766466743 | i157);
                        int i159 = ((int) (j52 >> 32)) & ((((-670759668) | i158) * 712) + (((~(805305079 | startElapsedRealtime3)) | (~(i157 | (-38838337)))) * (-712)) + ((38838336 | i158) * (-712)) + 2013265034);
                        int c9 = ((int) j52) & a.c((~(((int) SystemClock.elapsedRealtime()) | (-987135698))) | 449992400, 220, ((450090712 | r7) * (-220)) - 382632617, -1032965154);
                        if (((i159 & c9) | (i159 ^ c9)) != 477111747) {
                            invoke = obj3;
                        }
                        int i160 = 0;
                        int i161 = 0;
                        while (i160 < 28) {
                            String str32 = strArr[i160];
                            Object[] objArr76 = new Object[1];
                            b(new int[]{161, 12, 0, 0}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000", true, objArr76);
                            Object[] objArr77 = {((String) objArr76[0]).concat(String.valueOf(str32))};
                            Object PngjBadSignature19 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1666380462);
                            if (PngjBadSignature19 == null) {
                                char myTid = (char) (Process.myTid() >> 22);
                                int bitsPerPixel3 = ImageFormat.getBitsPerPixel(0) + 29;
                                int defaultSize = 1447 - View.getDefaultSize(0, 0);
                                byte b35 = $$a[4];
                                byte b36 = (byte) (b35 + 1);
                                i21 = i160;
                                Object[] objArr78 = new Object[1];
                                a(b35, b36, b36, objArr78);
                                PngjBadSignature19 = com.d.e.a.PngjBadCrcException.PngjBadSignature(myTid, bitsPerPixel3, defaultSize, -1614962923, false, (String) objArr78[0], new Class[]{cls2});
                            } else {
                                i21 = i160;
                            }
                            long longValue9 = ((Long) ((Method) PngjBadSignature19).invoke(null, objArr77)).longValue();
                            long j53 = 365163232;
                            long j54 = ((-859) * (j53 | j4)) + ((-858) * longValue9) + (860 * j53);
                            long j55 = 859;
                            long j56 = longValue9 ^ j2;
                            long j57 = (j55 * (((j56 | j3) ^ j2) | ((j56 | j53) ^ j2))) + ((((j3 | j53) ^ j2) | ((((j53 ^ j2) | j56) | j4) ^ j2)) * j55) + j54 + 105325085;
                            int startUptimeMillis = (int) Process.getStartUptimeMillis();
                            int i162 = ((int) (j57 >> 32)) & ((((~((~startUptimeMillis) | 1304691383)) | 96731827) * 420) + ((~(1304691383 | startUptimeMillis)) * 420) + 1974099422);
                            int i163 = (int) j57;
                            int myUid = Process.myUid();
                            int c10 = i163 & a.c((~((~myUid) | (-283717))) | 1109459217, 576, (((~((-874282693) | myUid)) | 873998976) * 576) + 1771465493, 912236544);
                            int i164 = ((i162 & c10) | (i162 ^ c10)) == 0 ? 0 : 1;
                            int PngjBadCrcException3 = getAsHighestSecurityLevelReached.PngjBadCrcException();
                            int i165 = (i161 * (-271)) + (i164 * 273);
                            int i166 = ~i164;
                            int i167 = ~i161;
                            int i168 = (i167 & i166) | (i166 ^ i167);
                            int i169 = ~PngjBadCrcException3;
                            int i170 = ~((i168 ^ i169) | (i168 & i169));
                            int i171 = ~((i164 ^ i161) | (i164 & i161) | PngjBadCrcException3);
                            int i172 = ((i170 ^ i171) | (i170 & i171)) * (-272);
                            int i173 = (i165 ^ i172) + ((i165 & i172) << 1);
                            int i174 = ~((i166 & i161) | (i166 ^ i161));
                            int i175 = ~i164;
                            int i176 = ~((i175 & PngjBadCrcException3) | (i175 ^ PngjBadCrcException3));
                            int i177 = ~((i164 & PngjBadCrcException3) | (i164 ^ PngjBadCrcException3));
                            i161 = (((((i174 & i176) | (i174 ^ i176)) * (-272)) + i173) - (~(((i177 & i161) | (i161 ^ i177)) * 272))) - 1;
                            int i178 = ((i21 | 86) << 1) - (i21 ^ 86);
                            i160 = ((i178 | (-85)) << 1) - (i178 ^ (-85));
                        }
                        z = ((double) i161) >= 25.2d;
                    }
                    if (invoke != null) {
                        Object[] objArr79 = {invoke, 42};
                        Object PngjBadSignature20 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                        if (PngjBadSignature20 == null) {
                            char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 11039);
                            int i179 = 32 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                            int i180 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1282;
                            byte b37 = $$a[4];
                            byte b38 = (byte) (b37 + 1);
                            Object[] objArr80 = new Object[1];
                            a(b37, b38, b38, objArr80);
                            PngjBadSignature20 = com.d.e.a.PngjBadCrcException.PngjBadSignature(threadPriority, i179, i180, -971849413, false, (String) objArr80[0], new Class[]{cls2, cls});
                        }
                        long longValue10 = ((Long) ((Method) PngjBadSignature20).invoke(null, objArr79)).longValue();
                        long j58 = -258498538;
                        long j59 = 370;
                        long j60 = (j59 * longValue10) + (j59 * j58);
                        long j61 = -369;
                        long j62 = j58 | longValue10;
                        long freeMemory3 = (int) Runtime.getRuntime().freeMemory();
                        long j63 = freeMemory3 ^ j2;
                        long j64 = (j58 ^ j2) | j63;
                        long j65 = (369 * ((((longValue10 ^ j2) | j58) ^ j2) | ((j58 | freeMemory3) ^ j2) | ((j64 | longValue10) ^ j2))) + (j61 * (longValue10 | (j64 ^ j2))) + ((j62 | j63) * j61) + j60 + 914206238;
                        int i181 = ((int) (j65 >> 32)) & ((((-760780701) | (~((-676445711) | i))) * 502) + ((~((-84410769) | i9)) * (-502)) + (((~((-760780701) | i)) | (-760856479)) * (-502)) + 823718430);
                        int i182 = ((int) j65) & ((((~(1878863493 | i9)) | 268456272 | (~((-1168442374) | i))) * 140) + (((~(978877392 | i9)) | 1168442373) * (-280)) + ((978877392 | i) * 140) + 402894737);
                    }
                }
                if (!z) {
                    Object[] objArr81 = {new int[]{i ^ 261}, new int[]{r1 ^ (r1 << 5)}, null, new int[]{i}};
                    int i183 = (((~(i | 1022835021)) | (~((-1022820361) | i9)) | 11730952) * 676) + (((~(11745613 | i9)) | 1011089408) * 676) + (((-1011089409) | i) * (-676)) + 447837065;
                    int i184 = (((i183 | 16) << 1) - (i183 ^ 16)) + i2;
                    int i185 = i184 << 13;
                    int i186 = (i185 & (~i184)) | ((~i185) & i184);
                    int i187 = i186 >>> 17;
                    int i188 = ((~i186) & i187) | ((~i187) & i186);
                    return objArr81;
                }
                Object[] objArr82 = new Object[1];
                b(new int[]{173, 23, 0, 20}, "\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000", false, objArr82);
                Object[] objArr83 = {(String) objArr82[0]};
                Object PngjBadSignature21 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-936033973);
                if (PngjBadSignature21 == null) {
                    char alpha2 = (char) (Color.alpha(0) + 29467);
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 39;
                    int i189 = 433 - (ViewConfiguration.getGlobalActionKeyTimeout() > j5 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j5 ? 0 : -1));
                    byte b39 = $$a[4];
                    byte b40 = b39;
                    Object[] objArr84 = new Object[1];
                    a(b39, b40, b40, objArr84);
                    PngjBadSignature21 = com.d.e.a.PngjBadCrcException.PngjBadSignature(alpha2, scrollBarFadeDuration, i189, 886713584, false, (String) objArr84[0], new Class[]{cls2});
                }
                long longValue11 = ((Long) ((Method) PngjBadSignature21).invoke(null, objArr83)).longValue();
                long j66 = -991364458;
                long j67 = 881;
                long j68 = (j67 * longValue11) + (j67 * j66);
                long j69 = -880;
                long j70 = j66 ^ j2;
                long j71 = longValue11 ^ j2;
                long startUptimeMillis2 = (int) Process.getStartUptimeMillis();
                long j72 = ((((j70 | j71) ^ j2) | ((j70 | startUptimeMillis2) ^ j2) | ((j71 | startUptimeMillis2) ^ j2)) * j69) + j68;
                long j73 = longValue11 | ((j70 | (startUptimeMillis2 ^ j2)) ^ j2);
                long j74 = (startUptimeMillis2 | j66) ^ j2;
                long j75 = ((880 * j74) + (((j73 | j74) * j69) + j72)) - 157348190;
                int myPid2 = Process.myPid();
                long j76 = (((int) (j75 >> 32)) & ((((~(myPid2 | (-177366759))) | (~((~myPid2) | (-1614593170))) | (~(1614593169 | myPid2))) * 831) + ((~(1790902007 | myPid2)) * (-1662)) + ((((~(177366758 | r7)) | (~((-176308839) | myPid2))) * (-831)) - 1622789342))) | (((int) j75) & ((((~(((int) SystemClock.uptimeMillis()) | (-1377658340))) | 1343291425) * 658) + (((1368492581 | r7) * (-658)) - 2034734947)));
                Object[] objArr85 = new Object[1];
                b(new int[]{196, 17, 82, 4}, "\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001", false, objArr85);
                Object[] objArr86 = {(String) objArr85[0]};
                Object PngjBadSignature22 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-936033973);
                if (PngjBadSignature22 == null) {
                    char size2 = (char) (View.MeasureSpec.getSize(0) + 29467);
                    int scrollBarSize2 = (ViewConfiguration.getScrollBarSize() >> 8) + 39;
                    int lastIndexOf4 = 431 - TextUtils.lastIndexOf(str, '0', 0);
                    byte b41 = $$a[4];
                    byte b42 = b41;
                    j6 = j76;
                    Object[] objArr87 = new Object[1];
                    a(b41, b42, b42, objArr87);
                    PngjBadSignature22 = com.d.e.a.PngjBadCrcException.PngjBadSignature(size2, scrollBarSize2, lastIndexOf4, 886713584, false, (String) objArr87[0], new Class[]{cls2});
                } else {
                    j6 = j76;
                }
                long longValue12 = ((Long) ((Method) PngjBadSignature22).invoke(null, objArr86)).longValue();
                long j77 = 622434567;
                long j78 = 628;
                long j79 = (j78 * longValue12) + (j78 * j77);
                long j80 = -627;
                long b43 = a.b(1316014513);
                long j81 = ((627 * ((((b43 ^ j2) | longValue12) ^ j2) | ((j77 | b43) ^ j2))) + (((j77 | (((longValue12 ^ j2) | b43) ^ j2)) * j80) + ((((longValue12 | b43) | (j77 ^ j2)) * j80) + j79))) - 1771147215;
                int i190 = ((int) (j81 >> 32)) & ((((~((-1968788480) | i)) | 352866900 | (~((-531562069) | i))) * 407) + (((~(1968788479 | i)) | (~(531562068 | i9)) | 352866900) * 407) + (((Integer.MIN_VALUE | r4) * (-814)) - 731191371));
                int i191 = ((int) j81) & (((i | (-1524626935)) * 54) + (((~((-43872327) | i)) | (-1524626935) | (~(43872326 | i9))) * 54) + (((~((-1481098737) | i9)) | 344128) * (-108)) + 1976752837);
                long j82 = (i190 & i191) | (i190 ^ i191);
                if (j6 > j5) {
                    int i192 = PngjPrematureEnding;
                    int i193 = ((i192 | 83) << 1) - (i192 ^ 83);
                    PngjInputException = i193 % 128;
                    if (i193 % 2 == 0 ? j82 > j5 : j82 > j5) {
                        if (j82 - 3 < j6) {
                            z2 = true;
                            if (!z2) {
                                Object[] objArr88 = {new int[]{r6}, new int[]{((~r1) & r2) | ((~r2) & r1)}, null, new int[]{i}};
                                int i194 = (~(i & 247)) & (i | 247);
                                int i195 = (~((-325271682) | i)) | 37896320;
                                int i196 = ~(996669653 | i9);
                                int i197 = (((~(i | (-287375362))) | i196) * 470) + ((i195 | i196) * (-470)) + 1665967189;
                                int i198 = (i197 ^ 16) + ((i197 & 16) << 1) + i2;
                                int i199 = i198 << 13;
                                int i200 = (i199 & (~i198)) | ((~i199) & i198);
                                int i201 = i200 >>> 17;
                                int i202 = ((~i200) & i201) | ((~i201) & i200);
                                int i203 = i202 << 5;
                                return objArr88;
                            }
                            Object[] objArr89 = new Object[1];
                            b(new int[]{173, 23, 0, 20}, "\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000", false, objArr89);
                            Object[] objArr90 = {(String) objArr89[0]};
                            Object PngjBadSignature23 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-936033973);
                            if (PngjBadSignature23 == null) {
                                char blue2 = (char) (29467 - Color.blue(0));
                                int packedPositionGroup = 39 - ExpandableListView.getPackedPositionGroup(j5);
                                int lastIndexOf5 = TextUtils.lastIndexOf(str, '0') + 433;
                                byte b44 = $$a[4];
                                byte b45 = b44;
                                Object[] objArr91 = new Object[1];
                                a(b44, b45, b45, objArr91);
                                PngjBadSignature23 = com.d.e.a.PngjBadCrcException.PngjBadSignature(blue2, packedPositionGroup, lastIndexOf5, 886713584, false, (String) objArr91[0], new Class[]{cls2});
                            }
                            long longValue13 = ((Long) ((Method) PngjBadSignature23).invoke(null, objArr90)).longValue();
                            long j83 = -946009075;
                            long j84 = longValue13 ^ j2;
                            long j85 = ((-318) * (j84 | (((j83 ^ j2) | j4) ^ j2))) + ((-317) * longValue13) + (319 * j83);
                            long j86 = 318;
                            long j87 = ((j86 * ((((j84 | j3) | j83) ^ j2) | (((j83 | longValue13) | j4) ^ j2))) + (((((j84 | j4) ^ j2) | (((j3 | j83) | longValue13) ^ j2)) * j86) + j85)) - 202703573;
                            int myPid3 = Process.myPid();
                            int i204 = ~((-260039224) | myPid3);
                            int i205 = ~myPid3;
                            int i206 = ((int) (j87 >> 32)) & ((((~(myPid3 | (-1177187188))) | (~(260039223 | i205))) * 406) + ((~((-156598277) | i205)) * (-406)) + (((i204 | (~(1333785463 | i205))) * (-406)) - 1557659518));
                            int uptimeMillis = (int) SystemClock.uptimeMillis();
                            int i207 = ((int) j87) & (((uptimeMillis | (-2004950427)) * 496) + (((~((-567724017) | uptimeMillis)) | 5685856 | (~((~uptimeMillis) | (-1442912267)))) * (-496)) + ((r9 * 992) - 1537497691));
                            long j88 = (i206 & i207) | (i206 ^ i207);
                            Object[] objArr92 = new Object[1];
                            b(new int[]{213, 4, 0, 2}, "\u0001\u0001\u0001\u0001", false, objArr92);
                            Object[] objArr93 = {(String) objArr92[0]};
                            Object PngjBadSignature24 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-936033973);
                            if (PngjBadSignature24 == null) {
                                char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29467);
                                int i208 = 40 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                int gidForName2 = Process.getGidForName(str) + 433;
                                byte b46 = $$a[4];
                                byte b47 = b46;
                                j7 = j88;
                                Object[] objArr94 = new Object[1];
                                a(b46, b47, b47, objArr94);
                                PngjBadSignature24 = com.d.e.a.PngjBadCrcException.PngjBadSignature(minimumFlingVelocity, i208, gidForName2, 886713584, false, (String) objArr94[0], new Class[]{cls2});
                            } else {
                                j7 = j88;
                            }
                            long longValue14 = ((Long) ((Method) PngjBadSignature24).invoke(null, objArr93)).longValue();
                            long j89 = -1046736625;
                            long j90 = 46;
                            long j91 = longValue14 ^ j2;
                            long j92 = ((45 * ((j91 | (((j89 ^ j2) | j4) ^ j2)) | ((j3 | j89) ^ j2))) + (((-45) * (((j91 | j4) ^ j2) | ((j89 | longValue14) ^ j2))) + (((-90) * (j89 | ((j91 | j3) ^ j2))) + ((j90 * longValue14) + (j90 * j89))))) - 101976023;
                            int maxMemory = (int) Runtime.getRuntime().maxMemory();
                            int i209 = ((int) (j92 >> 32)) & ((((~((-1829426613) | maxMemory)) | (~(1829426612 | (~maxMemory))) | (~(1028314272 | maxMemory))) * 959) + (((((~(1829426612 | maxMemory)) | (~(1028314272 | r7))) | (~(r7 | (-1829426613)))) * 959) - 1325340044));
                            int startElapsedRealtime4 = (int) Process.getStartElapsedRealtime();
                            int i210 = ((int) j92) & ((((~((~startElapsedRealtime4) | 1639648324)) | (-1839971039)) * 398) + (((~(1639648324 | startElapsedRealtime4)) | (-1839971039)) * 398) + 54070349);
                            long j93 = (i209 & i210) | (i209 ^ i210);
                            if ((j7 > j5 ? '\n' : (char) 29) != 29 && j93 > j5) {
                                int i211 = PngjInputException + 31;
                                PngjPrematureEnding = i211 % 128;
                                if (i211 % 2 == 0) {
                                }
                                if (!z3) {
                                    PngjPrematureEnding = (PngjInputException + 67) % 128;
                                    Object[] objArr95 = {new int[]{(i & (-249)) | (i9 & 248)}, new int[1], null, new int[]{i}};
                                    int myUid2 = Process.myUid();
                                    int i212 = (((~((~myUid2) | 251942316)) | (-782623658)) * 168) + (((~(myUid2 | 251942316)) | (-799405998)) * (-168)) + ((((~((-782623658) | myUid2)) | 235159976) * 336) - 973825651);
                                    int i213 = ((i212 | 16) << 1) - (i212 ^ 16);
                                    int i214 = (i2 ^ i213) + ((i2 & i213) << 1);
                                    int i215 = i214 << 13;
                                    int i216 = ((~i214) & i215) | ((~i215) & i214);
                                    int i217 = i216 >>> 17;
                                    int i218 = (i216 | i217) & (~(i216 & i217));
                                    int i219 = i218 << 5;
                                    ((int[]) objArr95[1])[0] = ((~i218) & i219) | ((~i219) & i218);
                                    return objArr95;
                                }
                                Object[] objArr96 = new Object[1];
                                c(null, null, (ViewConfiguration.getPressedStateDuration() >> 16) + 127, "\u008f\u0092\u008e\u0087\u0093\u0087\u0094", objArr96);
                                String str33 = (String) objArr96[0];
                                int i220 = -View.combineMeasuredStates(0, 0);
                                int i221 = (i220 * (-51)) + 6731;
                                int i222 = (i9 ^ i220) | (i9 & i220);
                                int i223 = (~((i222 ^ 127) | (i222 & 127))) * 52;
                                int i224 = (i221 ^ i223) + ((i221 & i223) << 1);
                                int i225 = (~(((-128) & i220) | ((-128) ^ i220))) | (~(((-128) ^ i96) | ((-128) & i96)));
                                int i226 = ~i222;
                                int i227 = -(-(((i225 & i226) | (i225 ^ i226)) * (-52)));
                                int i228 = (i224 ^ i227) + ((i227 & i224) << 1);
                                int i229 = ~i220;
                                int i230 = ~((i229 & i9) | (i229 ^ i9));
                                int i231 = ~i220;
                                int i232 = -(-(((~((i231 & 127) | (i231 ^ 127))) | i230) * 52));
                                int i233 = (i228 & i232) + (i232 | i228);
                                Object[] objArr97 = new Object[1];
                                c(null, null, i233, "\u0091\u0086\u0097\u0094\u008f\u0092\u008e\u0087\u0093\u0087\u0094", objArr97);
                                String str34 = (String) objArr97[0];
                                Object[] objArr98 = new Object[1];
                                b(new int[]{217, 12, 192, 2}, "\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001", false, objArr98);
                                String str35 = (String) objArr98[0];
                                int i234 = -TextUtils.indexOf((CharSequence) str, '0', 0, 0);
                                int i235 = (i234 & 126) + (i234 | 126);
                                Object[] objArr99 = new Object[1];
                                c(null, null, i235, "\u0091\u0086\u0097\u009d\u0094\u008f\u0092\u008e\u0087\u0093\u0087\u0094", objArr99);
                                String str36 = (String) objArr99[0];
                                Object[] objArr100 = new Object[1];
                                b(new int[]{229, 11, 0, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001", true, objArr100);
                                String str37 = (String) objArr100[0];
                                int i236 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                int i237 = (i236 ^ 127) + ((i236 & 127) << 1);
                                Object[] objArr101 = new Object[1];
                                c(null, null, i237, "\u0091\u0086\u0097\u0087\u0094", objArr101);
                                String str38 = (String) objArr101[0];
                                int deadChar2 = KeyEvent.getDeadChar(0, 0);
                                int i238 = (deadChar2 ^ 127) + ((deadChar2 & 127) << 1);
                                Object[] objArr102 = new Object[1];
                                c(null, null, i238, "\u008d\u008e\u0092\u0094", objArr102);
                                String[] strArr5 = {str33, str34, str35, str36, str37, str38, (String) objArr102[0]};
                                int i239 = 0;
                                while (i239 < 7) {
                                    int i240 = PngjPrematureEnding + 83;
                                    PngjInputException = i240 % 128;
                                    if (i240 % 2 != 0) {
                                        Object[] objArr103 = {strArr5[i239]};
                                        Object PngjBadSignature25 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1492900309);
                                        if (PngjBadSignature25 == null) {
                                            char deadChar3 = (char) KeyEvent.getDeadChar(0, 0);
                                            int indexOf9 = 35 - TextUtils.indexOf(str, str, 0);
                                            int defaultSize2 = 397 - View.getDefaultSize(0, 0);
                                            byte b48 = $$a[4];
                                            byte b49 = b48;
                                            strArr3 = strArr5;
                                            Object[] objArr104 = new Object[1];
                                            a(b48, b49, b49, objArr104);
                                            PngjBadSignature25 = com.d.e.a.PngjBadCrcException.PngjBadSignature(deadChar3, indexOf9, defaultSize2, 1542146960, false, (String) objArr104[0], new Class[]{cls2});
                                        } else {
                                            strArr3 = strArr5;
                                        }
                                        long longValue15 = ((Long) ((Method) PngjBadSignature25).invoke(null, objArr103)).longValue();
                                        long j94 = 1034849906;
                                        long j95 = -964;
                                        long j96 = longValue15 ^ j2;
                                        long j97 = (((((j96 | j3) ^ j2) | ((j96 | j94) ^ j2)) * j95) + ((((j94 ^ j2) | ((j96 | j4) ^ j2)) * j95) + ((965 * longValue15) + (((-963) * j94) + j95)))) - 1399428685;
                                        int freeMemory4 = (int) Runtime.getRuntime().freeMemory();
                                        int i241 = ((int) (j97 >> 63)) & (((freeMemory4 | 33882146) * 54) + (((~(33883195 | freeMemory4)) | 33882146 | (~((~freeMemory4) | (-33883196)))) * 54) + ((((-1471110656) | (~(1471109606 | r11))) * (-108)) - 358513670));
                                        int i242 = ((int) j97) & ((((~((-100590205) | i9)) | 27795492 | (~(i9 | (-1537816615)))) * 50) + (((~(i9 | (-27795493))) | (~((-72794713) | i))) * 50) + ((((-1537816615) | i) * (-50)) - 1753188737));
                                        if (((i241 & i242) | (i241 ^ i242)) != 0) {
                                            int PngjBadCrcException4 = getAsHighestSecurityLevelReached.PngjBadCrcException();
                                            int i243 = i239 * (-445);
                                            int i244 = ((-40050) ^ i243) + ((i243 & (-40050)) << 1);
                                            int i245 = ~i239;
                                            int i246 = ~((-91) | i245);
                                            int i247 = ~PngjBadCrcException4;
                                            int i248 = ~((i245 ^ i247) | (i247 & i245));
                                            int i249 = (i244 - (~(((i246 ^ i248) | (i246 & i248)) * 446))) - 1;
                                            int i250 = ~((i239 & (-91)) | ((-91) ^ i239));
                                            int i251 = (i245 ^ 90) | (i245 & 90);
                                            int i252 = ~((PngjBadCrcException4 & i251) | (i251 ^ PngjBadCrcException4));
                                            int i253 = ((i252 & i250) | (i250 ^ i252)) * 446;
                                            int i254 = (i249 & i253) + (i253 | i249);
                                            int i255 = (~(((-91) & i245) | ((-91) ^ i245))) * 446;
                                            i13 = ((i255 & i254) << 1) + (i254 ^ i255);
                                            break;
                                        }
                                        i239 = (i239 ^ (-96)) + ((i239 & (-96)) << 1) + 97;
                                        strArr5 = strArr3;
                                    } else {
                                        strArr3 = strArr5;
                                        Object[] objArr105 = {strArr3[i239]};
                                        Object PngjBadSignature26 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1492900309);
                                        if (PngjBadSignature26 == null) {
                                            char alpha3 = (char) Color.alpha(0);
                                            int lastIndexOf6 = 34 - TextUtils.lastIndexOf(str, '0');
                                            int resolveSize = 397 - View.resolveSize(0, 0);
                                            byte b50 = $$a[4];
                                            byte b51 = b50;
                                            Object[] objArr106 = new Object[1];
                                            a(b50, b51, b51, objArr106);
                                            PngjBadSignature26 = com.d.e.a.PngjBadCrcException.PngjBadSignature(alpha3, lastIndexOf6, resolveSize, 1542146960, false, (String) objArr106[0], new Class[]{cls2});
                                        }
                                        long longValue16 = ((Long) ((Method) PngjBadSignature26).invoke(null, objArr105)).longValue();
                                        long j98 = 1631037474;
                                        long j99 = -751;
                                        long j100 = (j99 * longValue16) + (j99 * j98);
                                        long j101 = j98 ^ j2;
                                        long j102 = longValue16 ^ j2;
                                        long elapsedCpuTime = (int) Process.getElapsedCpuTime();
                                        long j103 = j101 | longValue16;
                                        long j104 = ((752 * ((j103 ^ j2) | ((j102 | j98) ^ j2))) + (((-1504) * ((j103 | elapsedCpuTime) ^ j2)) + (((((j101 | j102) ^ j2) | ((j101 | elapsedCpuTime) ^ j2)) * 1504) + j100))) - 1995616253;
                                        int i256 = ((int) (j104 >> 32)) & (((~((~((int) Runtime.getRuntime().freeMemory())) | (-1073759653))) * 501) + ((((~((-1073759653) | r7)) | 352583680) * 501) - 196211786));
                                        int c11 = ((int) j104) & a.c(~(889049053 | i9), -948, (((~(817661389 | i)) | 619565020) * (-948)) - 254023199, 1043970316);
                                        if (((i256 & c11) | (i256 ^ c11)) != 0) {
                                            int PngjBadCrcException42 = getAsHighestSecurityLevelReached.PngjBadCrcException();
                                            int i2432 = i239 * (-445);
                                            int i2442 = ((-40050) ^ i2432) + ((i2432 & (-40050)) << 1);
                                            int i2452 = ~i239;
                                            int i2462 = ~((-91) | i2452);
                                            int i2472 = ~PngjBadCrcException42;
                                            int i2482 = ~((i2452 ^ i2472) | (i2472 & i2452));
                                            int i2492 = (i2442 - (~(((i2462 ^ i2482) | (i2462 & i2482)) * 446))) - 1;
                                            int i2502 = ~((i239 & (-91)) | ((-91) ^ i239));
                                            int i2512 = (i2452 ^ 90) | (i2452 & 90);
                                            int i2522 = ~((PngjBadCrcException42 & i2512) | (i2512 ^ PngjBadCrcException42));
                                            int i2532 = ((i2522 & i2502) | (i2502 ^ i2522)) * 446;
                                            int i2542 = (i2492 & i2532) + (i2532 | i2492);
                                            int i2552 = (~(((-91) & i2452) | ((-91) ^ i2452))) * 446;
                                            i13 = ((i2552 & i2542) << 1) + (i2542 ^ i2552);
                                            break;
                                        }
                                        i239 = (i239 ^ (-96)) + ((i239 & (-96)) << 1) + 97;
                                        strArr5 = strArr3;
                                    }
                                }
                                i13 = 0;
                                if (i13 != 0) {
                                    PngjPrematureEnding = (PngjInputException + 81) % 128;
                                    Object[] objArr107 = {new int[]{(i13 & i9) | ((~i13) & i)}, new int[1], null, new int[]{i}};
                                    int i257 = ((933738239 | i9) * 756) + ((((~(i | 933738239)) | 100827734) * (-756)) - 1580550591);
                                    int i258 = (i257 ^ 16) + ((i257 & 16) << 1);
                                    int PngjBadCrcException5 = getAsHighestSecurityLevelReached.PngjBadCrcException();
                                    int i259 = i258 * 522;
                                    int i260 = i2 * (-520);
                                    int i261 = (i259 & i260) + (i259 | i260);
                                    int i262 = ~PngjBadCrcException5;
                                    int i263 = ~((i262 & i2) | (i262 ^ i2));
                                    int i264 = ((i263 & i258) | (i258 ^ i263)) * (-1042);
                                    int i265 = (i261 ^ i264) + ((i264 & i261) << 1);
                                    int i266 = ((i2 ^ PngjBadCrcException5) | (i2 & PngjBadCrcException5)) * 521;
                                    int i267 = (i265 & i266) + (i266 | i265);
                                    int i268 = ~i258;
                                    int i269 = ~i2;
                                    int i270 = ~((i269 & i268) | (i268 ^ i269));
                                    int i271 = ~((i268 & PngjBadCrcException5) | (i268 ^ PngjBadCrcException5));
                                    int i272 = (~PngjBadCrcException5) | i258;
                                    int i273 = (((~((i272 & i2) | (i272 ^ i2))) | (i271 & i270) | (i270 ^ i271)) * 521) + i267;
                                    int i274 = i273 ^ (i273 << 13);
                                    int i275 = i274 >>> 17;
                                    int i276 = (i274 | i275) & (~(i274 & i275));
                                    int i277 = i276 << 5;
                                    ((int[]) objArr107[1])[0] = (i276 | i277) & (~(i276 & i277));
                                    return objArr107;
                                }
                                try {
                                    int i278 = -(-TextUtils.lastIndexOf(str, '0'));
                                    objArr2 = new Object[1];
                                    c(null, null, (i278 & 128) + (i278 | 128), "\u008e\u0087\u0082\u0088\u008a\u0084\u0083\u0086\u008c\u0097\u008a\u0082\u0089", objArr2);
                                } catch (Exception unused) {
                                }
                                try {
                                    Object[] objArr108 = {(String) objArr2[0]};
                                    Object PngjBadSignature27 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i12);
                                    if (PngjBadSignature27 == null) {
                                        char alpha4 = (char) (8752 - Color.alpha(0));
                                        int argb2 = Color.argb(0, 0, 0, 0) + 24;
                                        int longPressTimeout2 = 336 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                        byte b52 = $$a[4];
                                        byte b53 = b52;
                                        Object[] objArr109 = new Object[1];
                                        a(b52, b53, b53, objArr109);
                                        PngjBadSignature27 = com.d.e.a.PngjBadCrcException.PngjBadSignature(alpha4, argb2, longPressTimeout2, -598779726, false, (String) objArr109[0], new Class[]{cls2});
                                    }
                                    String str39 = (String) ((Method) PngjBadSignature27).invoke(null, objArr108);
                                    if (str39 != null) {
                                        int i279 = PngjPrematureEnding;
                                        PngjInputException = (((i279 | 11) << 1) - (i279 ^ 11)) % 128;
                                        Object[] objArr110 = new Object[1];
                                        b(new int[]{240, 11, 0, 7}, "\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001", true, objArr110);
                                        String[] strArr6 = {(String) objArr110[0]};
                                        int i280 = 0;
                                        while (true) {
                                            if (i280 > 0) {
                                                z5 = false;
                                                break;
                                            }
                                            int i281 = PngjInputException;
                                            int i282 = (i281 & 85) + (i281 | 85);
                                            PngjPrematureEnding = i282 % 128;
                                            if ((i282 % 2 == 0 ? 'R' : (char) 22) == 'R') {
                                                str39.contains(strArr6[i280]);
                                                throw null;
                                            }
                                            if (str39.contains(strArr6[i280])) {
                                                z5 = true;
                                                break;
                                            }
                                            i280 = (i280 & (-13)) + (i280 | (-13)) + 14;
                                        }
                                    }
                                    Object[] objArr111 = new Object[1];
                                    b(new int[]{251, 18, 0, 0}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001", false, objArr111);
                                    try {
                                        Object[] objArr112 = {(String) objArr111[0]};
                                        Object PngjBadSignature28 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i12);
                                        if (PngjBadSignature28 == null) {
                                            char myPid4 = (char) ((Process.myPid() >> 22) + 8752);
                                            int longPressTimeout3 = 24 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                            int i283 = 337 - (SystemClock.elapsedRealtimeNanos() > j5 ? 1 : (SystemClock.elapsedRealtimeNanos() == j5 ? 0 : -1));
                                            byte b54 = $$a[4];
                                            byte b55 = b54;
                                            Object[] objArr113 = new Object[1];
                                            a(b54, b55, b55, objArr113);
                                            PngjBadSignature28 = com.d.e.a.PngjBadCrcException.PngjBadSignature(myPid4, longPressTimeout3, i283, -598779726, false, (String) objArr113[0], new Class[]{cls2});
                                        }
                                        Object invoke8 = ((Method) PngjBadSignature28).invoke(null, objArr112);
                                        if (invoke8 != null) {
                                            int i284 = PngjInputException;
                                            int i285 = (i284 & 75) + (i284 | 75);
                                            PngjPrematureEnding = i285 % 128;
                                            if (i285 % 2 == 0) {
                                                Object[] objArr114 = new Object[1];
                                                c(null, null, 94 % (KeyEvent.getMaxKeyCode() - 90), "\u0081\u0091\u0086\u0091\u0091\u008c\u0089", objArr114);
                                                if (!invoke8.equals((String) objArr114[0])) {
                                                }
                                                Object[] objArr115 = new Object[1];
                                                b(new int[]{269, 23, 166, 0}, "\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000", false, objArr115);
                                                try {
                                                    Object[] objArr116 = {(String) objArr115[0]};
                                                    PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i12);
                                                    if (PngjBadSignature2 == null) {
                                                        char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 8753);
                                                        int i286 = 25 - (ViewConfiguration.getGlobalActionKeyTimeout() > j5 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j5 ? 0 : -1));
                                                        int offsetAfter2 = 336 - TextUtils.getOffsetAfter(str, 0);
                                                        byte b56 = $$a[4];
                                                        byte b57 = b56;
                                                        Object[] objArr117 = new Object[1];
                                                        a(b56, b57, b57, objArr117);
                                                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(modifierMetaStateMask, i286, offsetAfter2, -598779726, false, (String) objArr117[0], new Class[]{cls2});
                                                    }
                                                    str2 = (String) ((Method) PngjBadSignature2).invoke(null, objArr116);
                                                    if (str2 != null && (parseInt = Integer.parseInt(str2)) != 0) {
                                                        i14 = ((parseInt | 170) << 1) - (parseInt ^ 170);
                                                        if (i14 != 0) {
                                                            Object[] objArr118 = {new int[]{(i14 | i) & (~(i & i14))}, new int[]{((~r0) & r1) | ((~r1) & r0)}, null, new int[]{i}};
                                                            int c12 = a.c((~(19130491 | i)) | 139345 | (~(1053696465 | i9)), 904, (((~((-1053557121) | i)) | (~((-18991147) | i9))) * 904) + (((~((-1053696466) | i)) | (~((-19130492) | i9))) * (-1808)) + 207526205, 16);
                                                            int i287 = (i2 & c12) + (c12 | i2);
                                                            int i288 = i287 << 13;
                                                            int i289 = (i288 & (~i287)) | ((~i288) & i287);
                                                            int i290 = i289 ^ (i289 >>> 17);
                                                            int i291 = i290 << 5;
                                                            return objArr118;
                                                        }
                                                        int i292 = -(-(SystemClock.uptimeMillis() > j5 ? 1 : (SystemClock.uptimeMillis() == j5 ? 0 : -1)));
                                                        int i293 = ((i292 | 126) << 1) - (i292 ^ 126);
                                                        Object[] objArr119 = new Object[1];
                                                        c(null, null, i293, "\u008e\u0087\u0082\u0088\u008a\u0084\u0083\u0086\u008c\u0097\u008a\u0082\u0089", objArr119);
                                                        Object[] objArr120 = {(String) objArr119[0]};
                                                        Object PngjBadSignature29 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i12);
                                                        if (PngjBadSignature29 == null) {
                                                            char offsetAfter3 = (char) (TextUtils.getOffsetAfter(str, 0) + 8752);
                                                            int jumpTapTimeout3 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 24;
                                                            int mode = View.MeasureSpec.getMode(0) + 336;
                                                            byte b58 = $$a[4];
                                                            byte b59 = b58;
                                                            Object[] objArr121 = new Object[1];
                                                            a(b58, b59, b59, objArr121);
                                                            PngjBadSignature29 = com.d.e.a.PngjBadCrcException.PngjBadSignature(offsetAfter3, jumpTapTimeout3, mode, -598779726, false, (String) objArr121[0], new Class[]{cls2});
                                                        }
                                                        Object invoke9 = ((Method) PngjBadSignature29).invoke(null, objArr120);
                                                        if (invoke9 != null) {
                                                            Object[] objArr122 = new Object[1];
                                                            b(new int[]{240, 11, 0, 7}, "\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001", true, objArr122);
                                                            Object[] objArr123 = {invoke9, new String[]{(String) objArr122[0]}};
                                                            Object PngjBadSignature30 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-344601997);
                                                            if (PngjBadSignature30 == null) {
                                                                char defaultSize3 = (char) (View.getDefaultSize(0, 0) + 26716);
                                                                int gidForName3 = Process.getGidForName(str) + 34;
                                                                int resolveSize2 = View.resolveSize(0, 0) + 1668;
                                                                byte b60 = $$a[4];
                                                                byte b61 = b60;
                                                                Object[] objArr124 = new Object[1];
                                                                a(b60, b61, b61, objArr124);
                                                                PngjBadSignature30 = com.d.e.a.PngjBadCrcException.PngjBadSignature(defaultSize3, gidForName3, resolveSize2, 396011464, false, (String) objArr124[0], new Class[]{cls2, String[].class});
                                                            }
                                                            long longValue17 = ((Long) ((Method) PngjBadSignature30).invoke(null, objArr123)).longValue();
                                                            long j105 = -1248721055;
                                                            long j106 = -574;
                                                            long j107 = (j106 * longValue17) + (j106 * j105);
                                                            long j108 = j105 ^ j2;
                                                            long startUptimeMillis3 = (int) Process.getStartUptimeMillis();
                                                            long j109 = startUptimeMillis3 ^ j2;
                                                            long j110 = ((longValue17 ^ j2) | startUptimeMillis3) ^ j2;
                                                            long j111 = ((575 * (((j108 | startUptimeMillis3) ^ j2) | ((j109 | j105) ^ j2))) + (((-575) * (j110 | ((j109 | longValue17) ^ j2))) + ((1150 * (((j108 | j109) ^ j2) | j110)) + j107))) - 437871166;
                                                            int maxMemory2 = (int) Runtime.getRuntime().maxMemory();
                                                            int i294 = ((int) (j111 >> 32)) & (((~(maxMemory2 | (-1614961325))) * 345) + (((~((-1684208319) | (~maxMemory2))) | (-1861943232)) * 345) + ((((~((-1684208319) | maxMemory2)) | 1614961324) * 345) - 484646000));
                                                            int i295 = ((int) j111) & ((((~(2107212669 | i9)) | (-1517727407)) * 262) + (((~(2107212669 | i)) | (-1517727407)) * 262) + 1622256509);
                                                            if (((i294 & i295) | (i294 ^ i295)) != 1) {
                                                                int i296 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                                int i297 = (i296 & 127) + (i296 | 127);
                                                                Object[] objArr125 = new Object[1];
                                                                c(null, null, i297, "\u0094\u0083\u0090\u008d\u0082\u0083\u0094\u0090\u008e\u0090\u0084\u0094", objArr125);
                                                                String str40 = (String) objArr125[0];
                                                                Object[] objArr126 = new Object[1];
                                                                c(null, null, 128 - (Process.getElapsedCpuTime() > j5 ? 1 : (Process.getElapsedCpuTime() == j5 ? 0 : -1)), "\u0094\u0091\u0086\u0097\u0094\u0083\u0090\u008d\u0082\u0083\u0094\u0090\u008e\u0090\u0084\u0094", objArr126);
                                                                String str41 = (String) objArr126[0];
                                                                Object[] objArr127 = new Object[1];
                                                                b(new int[]{292, 17, 0, 10}, "\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001", true, objArr127);
                                                                String str42 = (String) objArr127[0];
                                                                int threadPriority2 = Process.getThreadPriority(0);
                                                                int i298 = -(-(((threadPriority2 & 20) + (threadPriority2 | 20)) >> 6));
                                                                int i299 = (i298 ^ 127) + ((i298 & 127) << 1);
                                                                Object[] objArr128 = new Object[1];
                                                                c(null, null, i299, "\u0094\u0091\u0086\u0097\u0087\u0094", objArr128);
                                                                String str43 = (String) objArr128[0];
                                                                Object[] objArr129 = new Object[1];
                                                                b(new int[]{161, 12, 0, 0}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000", true, objArr129);
                                                                String str44 = (String) objArr129[0];
                                                                int i300 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                                int i301 = (i300 * 221) - 27813;
                                                                int i302 = ~i300;
                                                                int i303 = ~((i302 & (-128)) | (i302 ^ (-128)));
                                                                int i304 = (i96 ^ i300) | (i96 & i300);
                                                                int i305 = ~((i304 & 127) | (i304 ^ 127));
                                                                int i306 = ((i303 & i305) | (i303 ^ i305)) * 220;
                                                                int i307 = (i301 ^ i306) + ((i301 & i306) << 1);
                                                                int i308 = -(-(((~((i9 ^ 127) | (i9 & 127))) | i300) * (-440)));
                                                                int i309 = (i307 ^ i308) + ((i308 & i307) << 1);
                                                                int i310 = (i300 & 127) | (i300 ^ 127);
                                                                int i311 = ((i310 & i) | (i310 ^ i)) * 220;
                                                                int i312 = (i309 ^ i311) + ((i311 & i309) << 1);
                                                                Object[] objArr130 = new Object[1];
                                                                c(null, null, i312, "\u0094\u008e\u009d\u0092\u008a\u0094\u0091\u0086\u0097\u0094\u008f\u0092\u008e\u0087\u0093\u0087\u0094", objArr130);
                                                                String str45 = (String) objArr130[0];
                                                                int i313 = -(-Color.rgb(0, 0, 0));
                                                                int i314 = (i313 ^ 16777343) + ((i313 & 16777343) << 1);
                                                                Object[] objArr131 = new Object[1];
                                                                c(null, null, i314, "\u0094\u0092\u0085\u0090\u0087\u0083\u0086\u0090\u0085\u0094\u0091\u0086\u0097\u0094\u008f\u0092\u008e\u0087\u0093\u0087\u0094", objArr131);
                                                                String str46 = (String) objArr131[0];
                                                                int i315 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                                int PngjBadCrcException6 = getAsHighestSecurityLevelReached.PngjBadCrcException();
                                                                int i316 = i315 * 51;
                                                                int i317 = (i316 ^ (-6272)) + ((i316 & (-6272)) << 1);
                                                                int i318 = (i315 | PngjBadCrcException6) * (-50);
                                                                int i319 = (i317 & i318) + (i318 | i317);
                                                                int i320 = ~((~i315) | (-129) | PngjBadCrcException6);
                                                                int i321 = ~PngjBadCrcException6;
                                                                int i322 = ((-129) & i321) | ((-129) ^ i321);
                                                                int i323 = ~((i322 & i315) | (i322 ^ i315));
                                                                int i324 = (((i320 & i323) | (i320 ^ i323)) * 50) + i319;
                                                                int i325 = ~(((-129) ^ i321) | ((-129) & i321));
                                                                int i326 = ~(((-129) & i315) | ((-129) ^ i315));
                                                                int i327 = (i326 & i325) | (i325 ^ i326);
                                                                int i328 = ~((i315 & i321) | (i321 ^ i315));
                                                                int i329 = (i324 - (~(((i328 & i327) | (i327 ^ i328)) * 50))) - 1;
                                                                Object[] objArr132 = new Object[1];
                                                                c(null, null, i329, "\u0094\u0091\u0086\u0097\u009d\u0094\u0084\u0087\u0094\u008f\u0092\u008e\u0087\u0093\u0087\u0094", objArr132);
                                                                int i330 = 0;
                                                                String str47 = (String) objArr132[0];
                                                                int windowTouchSlop3 = ViewConfiguration.getWindowTouchSlop() >> 8;
                                                                int i331 = (windowTouchSlop3 ^ 127) + ((windowTouchSlop3 & 127) << 1);
                                                                Object[] objArr133 = new Object[1];
                                                                c(null, null, i331, "\u0094\u008e\u0082\u0082\u0089\u0096\u0084\u0092\u0092\u0091\u0096\u0092\u009b\u0094\u0089\u0087\u008c\u0094\u008f\u0092\u008e\u0087\u0093\u0087\u0094", objArr133);
                                                                String str48 = (String) objArr133[0];
                                                                int i332 = -(-Process.getGidForName(str));
                                                                int i333 = (i332 & 128) + (i332 | 128);
                                                                Object[] objArr134 = new Object[1];
                                                                c(null, null, i333, "\u0094\u0091\u0086\u0097\u009d\u0094\u008f\u0092\u008e\u0087\u0093\u0087\u0094", objArr134);
                                                                String str49 = (String) objArr134[0];
                                                                Object[] objArr135 = new Object[1];
                                                                b(new int[]{309, 9, 0, 0}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000", true, objArr135);
                                                                String str50 = (String) objArr135[0];
                                                                Object[] objArr136 = new Object[1];
                                                                b(new int[]{318, 8, 57, 5}, "\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000", false, objArr136);
                                                                String[] strArr7 = {str40, str41, str42, str43, str44, str45, str46, str47, str48, str49, str50, (String) objArr136[0]};
                                                                int i334 = 0;
                                                                while (i334 < 12) {
                                                                    StringBuilder sb = new StringBuilder();
                                                                    sb.append(strArr7[i334]);
                                                                    Object[] objArr137 = new Object[1];
                                                                    c(null, null, 126 - (~(-Color.alpha(i330))), "\u008c\u0087", objArr137);
                                                                    sb.append((String) objArr137[i330]);
                                                                    Object[] objArr138 = {sb.toString()};
                                                                    Object PngjBadSignature31 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1666380462);
                                                                    if (PngjBadSignature31 == null) {
                                                                        char c13 = (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                                                                        int normalizeMetaState3 = KeyEvent.normalizeMetaState(0) + 28;
                                                                        int combineMeasuredStates = 1447 - View.combineMeasuredStates(0, 0);
                                                                        byte b62 = $$a[4];
                                                                        byte b63 = (byte) (b62 + 1);
                                                                        strArr2 = strArr7;
                                                                        i20 = i334;
                                                                        Object[] objArr139 = new Object[1];
                                                                        a(b62, b63, b63, objArr139);
                                                                        PngjBadSignature31 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c13, normalizeMetaState3, combineMeasuredStates, -1614962923, false, (String) objArr139[0], new Class[]{cls2});
                                                                    } else {
                                                                        strArr2 = strArr7;
                                                                        i20 = i334;
                                                                    }
                                                                    long longValue18 = ((Long) ((Method) PngjBadSignature31).invoke(null, objArr138)).longValue();
                                                                    long j112 = -850949301;
                                                                    long j113 = (713 * longValue18) + ((-711) * j112);
                                                                    long j114 = -712;
                                                                    long j115 = longValue18 ^ j2;
                                                                    long elapsedRealtime = (int) SystemClock.elapsedRealtime();
                                                                    long j116 = elapsedRealtime ^ j2;
                                                                    long j117 = (j116 | j112) ^ j2;
                                                                    long j118 = (712 * (j115 | j117)) + (((((j115 | j116) | j112) ^ j2) | ((elapsedRealtime | (j112 | longValue18)) ^ j2)) * j114) + ((((j115 | j112) ^ j2) | j117) * j114) + j113 + 1321437618;
                                                                    int c14 = ((int) (j118 >> 32)) & a.c((~((~Process.myPid()) | (-1594496102))) | 151655456, 933, (((~(157269690 | r4)) | (-1594496102)) * (-933)) - 872685046, 943113026);
                                                                    int myPid5 = Process.myPid();
                                                                    if ((c14 | (((int) j118) & ((((~(myPid5 | 1401247828)) | 17107028) * 302) + ((~((-72352258) | myPid5)) * (-604)) + ((((~((~myPid5) | (-72352258))) | (~(1473600085 | myPid5))) * (-302)) - 1933036437)))) != 0) {
                                                                        i15 = i20 + 110;
                                                                        break;
                                                                    }
                                                                    int i335 = (i20 & (-118)) + (i20 | (-118));
                                                                    i334 = (i335 ^ 119) + ((i335 & 119) << 1);
                                                                    strArr7 = strArr2;
                                                                    i330 = 0;
                                                                }
                                                            }
                                                        }
                                                        i15 = 0;
                                                        if (i15 != 0) {
                                                            Object[] objArr140 = {new int[]{i15 ^ i}, new int[1], null, new int[]{i}};
                                                            int uptimeMillis2 = (int) SystemClock.uptimeMillis();
                                                            int i336 = ~((-278881) | uptimeMillis2);
                                                            int i337 = (((~(uptimeMillis2 | (-1008743554))) | (~((~uptimeMillis2) | (-25543541))) | 25264660) * 497) + (((i336 | (~((-1008743554) | r4))) * 497) - 1905011024) + 16 + i2;
                                                            int i338 = i337 << 13;
                                                            int i339 = (i337 | i338) & (~(i337 & i338));
                                                            int i340 = i339 >>> 17;
                                                            int i341 = ((~i339) & i340) | ((~i340) & i339);
                                                            int i342 = i341 << 5;
                                                            ((int[]) objArr140[1])[0] = ((~i341) & i342) | ((~i342) & i341);
                                                            return objArr140;
                                                        }
                                                        long[] jArr = {472001035};
                                                        Object[] objArr141 = new Object[1];
                                                        b(new int[]{326, 17, 0, 0}, "\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001", true, objArr141);
                                                        try {
                                                            try {
                                                                BufferedInputStream bufferedInputStream5 = new BufferedInputStream(new FileInputStream((String) objArr141[0]));
                                                                long j119 = j5;
                                                                loop4: while (true) {
                                                                    try {
                                                                        int read = bufferedInputStream5.read();
                                                                        if (read == i50) {
                                                                            bufferedInputStream5.close();
                                                                            break;
                                                                        }
                                                                        j119 = ((j119 << 5) ^ read) & 1073741823;
                                                                        int i343 = 0;
                                                                        int i344 = 1;
                                                                        while (true) {
                                                                            if ((i343 < i344 ? i344 : 0) != i344) {
                                                                                break;
                                                                            }
                                                                            int i345 = PngjInputException;
                                                                            PngjPrematureEnding = (i345 + 117) % 128;
                                                                            BufferedInputStream bufferedInputStream6 = bufferedInputStream5;
                                                                            if ((j119 == jArr[i343] ? (char) 3 : (char) 25) != 3) {
                                                                                i343 = ((i343 | 1) << 1) - (i343 ^ 1);
                                                                                bufferedInputStream5 = bufferedInputStream6;
                                                                                i344 = 1;
                                                                            } else {
                                                                                PngjPrematureEnding = (i345 + 29) % 128;
                                                                                i16 = ((i343 | 1) << 1) - (i343 ^ 1);
                                                                                try {
                                                                                    bufferedInputStream6.close();
                                                                                    break loop4;
                                                                                } catch (Exception unused2) {
                                                                                }
                                                                            }
                                                                        }
                                                                        i50 = -1;
                                                                    } catch (IOException unused3) {
                                                                        bufferedInputStream2 = bufferedInputStream5;
                                                                        if (bufferedInputStream2 != null) {
                                                                            bufferedInputStream2.close();
                                                                        }
                                                                        i16 = 0;
                                                                        if (i16 != 0) {
                                                                        }
                                                                        if ((i17 != 0 ? '9' : '\\') != '\\') {
                                                                        }
                                                                    } catch (Throwable th2) {
                                                                        th = th2;
                                                                        bufferedInputStream = bufferedInputStream5;
                                                                        if (bufferedInputStream != null) {
                                                                            try {
                                                                                bufferedInputStream.close();
                                                                            } catch (Exception unused4) {
                                                                            }
                                                                        }
                                                                        throw th;
                                                                    }
                                                                }
                                                            } catch (Exception unused5) {
                                                                i16 = 0;
                                                                if (i16 != 0) {
                                                                }
                                                                if ((i17 != 0 ? '9' : '\\') != '\\') {
                                                                }
                                                            }
                                                        } catch (IOException unused6) {
                                                            bufferedInputStream2 = null;
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            bufferedInputStream = null;
                                                        }
                                                        if (i16 != 0) {
                                                            getAsHighestSecurityLevelReached.PngjBadCrcException();
                                                            i17 = 240;
                                                        } else {
                                                            int i346 = PngjInputException;
                                                            int i347 = (i346 & 65) + (i346 | 65);
                                                            PngjPrematureEnding = i347 % 128;
                                                            i17 = i347 % 2 == 0 ? 1 : 0;
                                                        }
                                                        if ((i17 != 0 ? '9' : '\\') != '\\') {
                                                            Object[] objArr142 = {new int[]{(i17 | i) & (~(i & i17))}, new int[]{(r0 | r1) & (~(r0 & r1))}, null, new int[]{i}};
                                                            int i348 = ((1030337867 | i9) * 756) + ((((~(i | 1030337867)) | 4228106) * (-756)) - 1610300063);
                                                            int i349 = -(-((i348 ^ 16) + ((i348 & 16) << 1)));
                                                            int i350 = ((i2 | i349) << 1) - (i349 ^ i2);
                                                            int i351 = i350 << 13;
                                                            int i352 = (i351 | i350) & (~(i350 & i351));
                                                            int i353 = i352 >>> 17;
                                                            int i354 = (i352 | i353) & (~(i352 & i353));
                                                            int i355 = i354 << 5;
                                                            return objArr142;
                                                        }
                                                        long[] jArr2 = {472001035};
                                                        Object[] objArr143 = new Object[1];
                                                        b(new int[]{349, 22, 79, 0}, "\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000", false, objArr143);
                                                        try {
                                                            bufferedInputStream4 = new BufferedInputStream(new FileInputStream((String) objArr143[0]));
                                                            long j120 = j5;
                                                            loop6: while (true) {
                                                                try {
                                                                    try {
                                                                        int read2 = bufferedInputStream4.read();
                                                                        if (read2 == -1) {
                                                                            cls3 = cls;
                                                                            break;
                                                                        }
                                                                        cls3 = cls;
                                                                        j120 = ((j120 << 5) ^ read2) & 1073741823;
                                                                        int i356 = 0;
                                                                        while (i356 < 1) {
                                                                            try {
                                                                                if (!(j120 == jArr2[i356])) {
                                                                                    i356++;
                                                                                    PngjPrematureEnding = (PngjInputException + 55) % 128;
                                                                                } else {
                                                                                    i18 = i356 + 1;
                                                                                    try {
                                                                                        bufferedInputStream4.close();
                                                                                        break loop6;
                                                                                    } catch (Exception unused7) {
                                                                                    }
                                                                                }
                                                                            } catch (IOException unused8) {
                                                                            }
                                                                        }
                                                                        cls = cls3;
                                                                    } catch (IOException unused9) {
                                                                        cls3 = cls;
                                                                    }
                                                                } catch (Throwable th4) {
                                                                    th = th4;
                                                                    bufferedInputStream3 = bufferedInputStream4;
                                                                    if (bufferedInputStream3 != null) {
                                                                        try {
                                                                            bufferedInputStream3.close();
                                                                        } catch (Exception unused10) {
                                                                        }
                                                                    }
                                                                    throw th;
                                                                }
                                                            }
                                                        } catch (IOException unused11) {
                                                            cls3 = cls;
                                                            bufferedInputStream4 = null;
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            bufferedInputStream3 = null;
                                                        }
                                                        try {
                                                            bufferedInputStream4.close();
                                                        } catch (Exception unused12) {
                                                        }
                                                        i18 = 0;
                                                        if (!(i18 == 0)) {
                                                            PngjInputException = (PngjPrematureEnding + 55) % 128;
                                                            Object[] objArr144 = {new int[]{r6}, new int[]{(r1 | r2) & (~(r1 & r2))}, null, new int[]{i}};
                                                            int i357 = (~(i & 242)) & (i | 242);
                                                            int i358 = ((i | 594976258) * 104) + ((~(997695315 | i9)) * (-104)) + (((~((-439589716) | i)) | 36870658) * 104) + 813887181;
                                                            int i359 = (i2 - (~((i358 & 16) + (i358 | 16)))) - 1;
                                                            int i360 = i359 << 13;
                                                            int i361 = (i359 | i360) & (~(i359 & i360));
                                                            int i362 = i361 >>> 17;
                                                            int i363 = ((~i361) & i362) | ((~i362) & i361);
                                                            int i364 = i363 << 5;
                                                            return objArr144;
                                                        }
                                                        Object PngjBadSignature32 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1372235840);
                                                        if (PngjBadSignature32 == null) {
                                                            char combineMeasuredStates2 = (char) (23942 - View.combineMeasuredStates(0, 0));
                                                            int i365 = 24 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                            int i366 = (ViewConfiguration.getZoomControlsTimeout() > j5 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j5 ? 0 : -1)) + 311;
                                                            byte b64 = $$a[4];
                                                            byte b65 = (byte) (b64 + 1);
                                                            Object[] objArr145 = new Object[1];
                                                            a(b64, b65, b65, objArr145);
                                                            PngjBadSignature32 = com.d.e.a.PngjBadCrcException.PngjBadSignature(combineMeasuredStates2, i365, i366, 1390033531, false, (String) objArr145[0], new Class[0]);
                                                        }
                                                        long longValue19 = ((Long) ((Method) PngjBadSignature32).invoke(null, null)).longValue();
                                                        long j121 = -268315070;
                                                        long j122 = 829;
                                                        long j123 = (j122 * longValue19) + (j122 * j121);
                                                        long j124 = -828;
                                                        long j125 = (((((j121 ^ j2) | (longValue19 ^ j2)) ^ j2) | (((j3 | j121) | longValue19) ^ j2)) * j124) + j123;
                                                        long j126 = j121 | longValue19;
                                                        long j127 = (828 * (j126 ^ j2)) + (j124 * (j126 | j3)) + j125 + 415229796;
                                                        int i367 = ((int) (j127 >> 32)) & ((((~(((int) Process.getStartElapsedRealtime()) | 572741685)) | 293905728) * 658) + (((296068416 | r4) * (-658)) - 1434692182));
                                                        int i368 = (int) j127;
                                                        int myPid6 = Process.myPid();
                                                        int i369 = (((~(2026125416 | myPid6)) | 52019862 | (~((-588899007) | myPid6))) * (-880)) + 818884229;
                                                        int i370 = (~(2026125416 | (~myPid6))) | 588899006;
                                                        int i371 = ~(myPid6 | (-2026125417));
                                                        int i372 = i368 & ((i371 * 880) + ((i370 | i371) * (-880)) + i369);
                                                        if (((i367 & i372) | (i367 ^ i372)) != 0) {
                                                            int i373 = PngjPrematureEnding;
                                                            int i374 = (i373 & 31) + (i373 | 31);
                                                            PngjInputException = i374 % 128;
                                                            if (i374 % 2 == 0) {
                                                                z4 = true;
                                                                if (z4) {
                                                                    Object PngjBadSignature33 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-40521023);
                                                                    if (PngjBadSignature33 == null) {
                                                                        char pressedStateDuration4 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                                                                        int axisFromString = MotionEvent.axisFromString(str) + 29;
                                                                        int lastIndexOf7 = 1854 - TextUtils.lastIndexOf(str, '0', 0, 0);
                                                                        byte b66 = $$a[4];
                                                                        byte b67 = b66;
                                                                        Object[] objArr146 = new Object[1];
                                                                        a(b66, b67, b67, objArr146);
                                                                        PngjBadSignature33 = com.d.e.a.PngjBadCrcException.PngjBadSignature(pressedStateDuration4, axisFromString, lastIndexOf7, 24829818, false, (String) objArr146[0], new Class[0]);
                                                                    }
                                                                    long longValue20 = ((Long) ((Method) PngjBadSignature33).invoke(null, null)).longValue();
                                                                    long j128 = -210433101;
                                                                    long j129 = longValue20 ^ j2;
                                                                    long j130 = ((-988) * (j128 | j129)) + ((-493) * longValue20) + (495 * j128);
                                                                    long j131 = 494;
                                                                    long j132 = j128 ^ j2;
                                                                    long j133 = ((j131 * ((((j132 | j129) ^ j2) | ((j3 | longValue20) ^ j2)) | ((j128 | longValue20) ^ j2))) + ((((longValue20 | j132) | j3) * j131) + j130)) - 536932920;
                                                                    if (((((int) (j133 >> 32)) & (((~(i9 | (-1969658710))) * 301) + (((~(888082175 | i)) | (-1978638336) | (~((-879102550) | i9))) * (-301)) + (((~(888082175 | i9)) | (-1969658710)) * (-602)) + 88894062)) | (((int) j133) & ((((~(222849762 | i)) | (~((-1214376648) | i9))) * 333) + ((((~(222849762 | i9)) | (~((-1214376648) | i))) * 333) - 903196991)))) != 0) {
                                                                        int i375 = PngjInputException;
                                                                        PngjPrematureEnding = ((i375 & 17) + (i375 | 17)) % 128;
                                                                        i19 = (~(i & 281)) & (i | 281);
                                                                    } else {
                                                                        i19 = i;
                                                                    }
                                                                    if (i19 != i) {
                                                                        Object[] objArr147 = {new int[]{i19}, new int[]{(r0 | r4) & (~(r0 & r4))}, null, new int[]{i}};
                                                                        int d = a.d((~((-30031975) | i)) | (~((-34705546) | i9)) | (~(1004533999 | i)), 192, (((~((-64737520) | i9)) | 30031974) * (-384)) + ((939796480 | i9) * (-192)) + 2102737173, 16, i2);
                                                                        int i376 = d << 13;
                                                                        int i377 = ((~d) & i376) | ((~i376) & d);
                                                                        int i378 = i377 >>> 17;
                                                                        int i379 = (i377 | i378) & (~(i377 & i378));
                                                                        int i380 = i379 << 5;
                                                                        objArr = objArr147;
                                                                    } else {
                                                                        Object PngjBadSignature34 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-792668357);
                                                                        if (PngjBadSignature34 == null) {
                                                                            char c15 = (char) (30095 - (SystemClock.elapsedRealtime() > j5 ? 1 : (SystemClock.elapsedRealtime() == j5 ? 0 : -1)));
                                                                            int maximumFlingVelocity3 = 45 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                                            int packedPositionType = 1810 - ExpandableListView.getPackedPositionType(j5);
                                                                            byte b68 = $$a[4];
                                                                            byte b69 = (byte) (b68 + 1);
                                                                            Object[] objArr148 = new Object[1];
                                                                            a(b68, b69, b69, objArr148);
                                                                            PngjBadSignature34 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c15, maximumFlingVelocity3, packedPositionType, 741325440, false, (String) objArr148[0], new Class[0]);
                                                                        }
                                                                        long longValue21 = ((Long) ((Method) PngjBadSignature34).invoke(null, null)).longValue();
                                                                        long j134 = -112592085;
                                                                        long j135 = ((-978) * longValue21) + (980 * j134);
                                                                        long j136 = 979;
                                                                        long j137 = longValue21 ^ j2;
                                                                        long maxMemory3 = (int) Runtime.getRuntime().maxMemory();
                                                                        long j138 = maxMemory3 ^ j2;
                                                                        long j139 = ((((j137 | maxMemory3) ^ j2) | ((j138 | j134) ^ j2)) * j136) + ((-979) * (j134 | maxMemory3)) + (((j137 | j138) ^ j2) * j136) + j135 + 468326629;
                                                                        int i381 = ((int) (j139 >> 32)) & ((((~(1485558628 | i)) | (~((-1372182257) | i9))) * 406) + ((~((-134349061) | i9)) * (-406)) + (((~(1372182256 | i)) | (~((-1351209569) | i9))) * (-406)) + 223393186);
                                                                        int b70 = a.b(2107946);
                                                                        int i382 = ((int) j139) & ((((~((~b70) | (-134287617))) | 2130961) * 521) + ((~((-134287617) | b70)) * 521) + 503139004);
                                                                        if (((i381 & i382) | (i381 ^ i382)) == 0) {
                                                                            Object PngjBadSignature35 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-25572490);
                                                                            if (PngjBadSignature35 == null) {
                                                                                char scrollDefaultDelay = (char) (30094 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                                                                                int i383 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 44;
                                                                                int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(j5) + 1810;
                                                                                byte b71 = $$a[4];
                                                                                byte b72 = b71;
                                                                                Object[] objArr149 = new Object[1];
                                                                                a(b71, b72, b72, objArr149);
                                                                                PngjBadSignature35 = com.d.e.a.PngjBadCrcException.PngjBadSignature(scrollDefaultDelay, i383, packedPositionGroup2, 43427533, false, (String) objArr149[0], new Class[0]);
                                                                            }
                                                                            long longValue22 = ((Long) ((Method) PngjBadSignature35).invoke(null, null)).longValue();
                                                                            long j140 = -328551165;
                                                                            long j141 = -167;
                                                                            long j142 = longValue22 ^ j2;
                                                                            long j143 = ((168 * (j142 | ((j3 | j140) ^ j2))) + (((-168) * (((j140 | longValue22) ^ j2) | ((j140 | j4) ^ j2))) + ((336 * ((((j140 ^ j2) | j142) ^ j2) | ((j142 | j4) ^ j2))) + ((j141 * longValue22) + (j141 * j140))))) - 1269687621;
                                                                            int i384 = ((int) (j143 >> 32)) & ((((~(320231164 | i9)) | (-2077687552)) * (-964)) + (((~(320231164 | i)) | (-1757457576)) * (-964)) + 40022);
                                                                            int i385 = ((int) j143) & ((((~((~((int) Runtime.getRuntime().totalMemory())) | (-1694217657))) | 184565766) * 374) + ((((-1878783423) | r7) * (-374)) - 35709817));
                                                                            if (((i384 & i385) | (i384 ^ i385)) != 0) {
                                                                                objArr = new Object[]{new int[]{(i & (-267)) | (i9 & 266)}, new int[1], null, new int[]{i}};
                                                                                int myUid3 = Process.myUid();
                                                                                int i386 = (i2 - (~(-(-a.c((~(myUid3 | (-413748210))) | 620817764, 376, (((~((~myUid3) | 413748209)) | (-1034547190)) * (-376)) + ((((-1034528406) | myUid3) * 376) - 1415183235), 16))))) - 1;
                                                                                int i387 = i386 ^ (i386 << 13);
                                                                                int i388 = i387 ^ (i387 >>> 17);
                                                                                c = 0;
                                                                                ((int[]) objArr[1])[0] = i388 ^ (i388 << 5);
                                                                            } else {
                                                                                Object PngjBadSignature36 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-2091466614);
                                                                                if (PngjBadSignature36 == null) {
                                                                                    char bitsPerPixel4 = (char) (45716 - ImageFormat.getBitsPerPixel(0));
                                                                                    int modifierMetaStateMask2 = 39 - ((byte) KeyEvent.getModifierMetaStateMask());
                                                                                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 625;
                                                                                    byte b73 = $$a[4];
                                                                                    byte b74 = (byte) (b73 + 1);
                                                                                    Object[] objArr150 = new Object[1];
                                                                                    a(b73, b74, b74, objArr150);
                                                                                    PngjBadSignature36 = com.d.e.a.PngjBadCrcException.PngjBadSignature(bitsPerPixel4, modifierMetaStateMask2, tapTimeout, 2142874929, false, (String) objArr150[0], new Class[0]);
                                                                                }
                                                                                long longValue23 = ((Long) ((Method) PngjBadSignature36).invoke(null, null)).longValue();
                                                                                long j144 = 1176658774;
                                                                                long j145 = (246 * longValue23) + ((-244) * j144);
                                                                                long j146 = -245;
                                                                                long j147 = longValue23 ^ j2;
                                                                                long j148 = ((((j147 | j3) ^ j2) | ((j147 | j144) ^ j2)) * j146) + j145;
                                                                                long j149 = (j147 | j4) ^ j2;
                                                                                long j150 = (245 * (j144 | j149)) + (j146 * j149) + j148 + 160144508;
                                                                                int myPid7 = Process.myPid();
                                                                                int i389 = ~myPid7;
                                                                                int i390 = (((~((-1533496991) | i389)) | 285279240) * (-1188)) + 1543659752;
                                                                                int i391 = (~(1533496990 | myPid7)) | 285279240;
                                                                                int i392 = ~((-1324243895) | i389);
                                                                                int i393 = ((int) (j150 >> 32)) & ((((~(1533496990 | i389)) | 76026144 | i392) * 594) + ((i391 | i392) * 594) + i390);
                                                                                int i394 = ~a.b(425583468);
                                                                                int i395 = ((int) j150) & ((((~(i394 | 1153962295)) | 270681152) * 52) + (((~((-1153962296) | i394)) | (~(283264114 | i394)) | 1141379333) * (-52)) + ((~((-12582963) | i394)) * 52) + 889406041);
                                                                                if (((i393 & i395) | (i393 ^ i395)) != 0) {
                                                                                    objArr = new Object[]{new int[]{(i & (-281)) | (i9 & 280)}, new int[]{(r4 | r9) & (~(r4 & r9))}, null, new int[]{i}};
                                                                                    int i396 = (((~((-741329604) | i9)) | 738558017) * 859) + (((~(293236370 | i9)) | (~((-2771587) | i))) * 859) + (((i | 293236370) * (-859)) - 1625431830);
                                                                                    int i397 = (i2 - (~(-(-(((i396 | 16) << 1) - (i396 ^ 16)))))) - 1;
                                                                                    int i398 = i397 << 13;
                                                                                    int i399 = (i397 | i398) & (~(i397 & i398));
                                                                                    int i400 = i399 >>> 17;
                                                                                    int i401 = (i399 | i400) & (~(i399 & i400));
                                                                                    int i402 = i401 << 5;
                                                                                    c = 0;
                                                                                } else {
                                                                                    Object[] objArr151 = {new int[]{i}, new int[1], null, new int[]{i}};
                                                                                    int freeMemory5 = (int) Runtime.getRuntime().freeMemory();
                                                                                    int i403 = ~freeMemory5;
                                                                                    int i404 = (((-214681199) | (~(819884775 | i403))) * 712) + (((~(freeMemory5 | 1021310703)) | (~(i403 | (-201425929)))) * (-712)) + (((201425928 | r9) * (-712)) - 373651251);
                                                                                    int PngjBadCrcException7 = getAsHighestSecurityLevelReached.PngjBadCrcException();
                                                                                    int i405 = ~i404;
                                                                                    int i406 = ((~(((-1) ^ i405) | i405)) * 497) + (-(-(i404 * (-496))));
                                                                                    int i407 = ~i404;
                                                                                    int i408 = ((-1) ^ i407) | i407;
                                                                                    int i409 = ~((i408 ^ PngjBadCrcException7) | (i408 & PngjBadCrcException7));
                                                                                    int i410 = ~PngjBadCrcException7;
                                                                                    int i411 = ~((i405 ^ i410) | (i410 & i405));
                                                                                    int i412 = (i406 - (~(-(-(((i411 & i409) | (i409 ^ i411)) * 497))))) - 1;
                                                                                    int i413 = ~PngjBadCrcException7;
                                                                                    int i414 = ~(i413 | ((-1) ^ i413));
                                                                                    int i415 = ~(i404 | ((-1) ^ i404));
                                                                                    int i416 = (i412 - (~(-(-((((i414 & i415) | (i414 ^ i415)) | (~(PngjBadCrcException7 | i407))) * 497))))) - 1;
                                                                                    int i417 = ((i2 | i416) << 1) - (i2 ^ i416);
                                                                                    int i418 = i417 << 13;
                                                                                    int i419 = ((~i417) & i418) | ((~i418) & i417);
                                                                                    int i420 = i419 >>> 17;
                                                                                    int i421 = (i419 | i420) & (~(i419 & i420));
                                                                                    int i422 = i421 << 5;
                                                                                    c = 0;
                                                                                    ((int[]) objArr151[1])[0] = ((~i421) & i422) | ((~i422) & i421);
                                                                                    objArr = objArr151;
                                                                                }
                                                                            }
                                                                            if ((((int[]) objArr[3])[c] != ((int[]) objArr[c])[c] ? 'O' : 'P') != 'P') {
                                                                                return objArr;
                                                                            }
                                                                            Object[] objArr152 = {2};
                                                                            Object PngjBadSignature37 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-476828914);
                                                                            if (PngjBadSignature37 == null) {
                                                                                char modifierMetaStateMask3 = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 35512);
                                                                                int indexOf10 = 41 - TextUtils.indexOf((CharSequence) str, '0', 0, 0);
                                                                                int resolveOpacity3 = 507 - Drawable.resolveOpacity(0, 0);
                                                                                byte b75 = $$a[4];
                                                                                byte b76 = (byte) (b75 + 1);
                                                                                Object[] objArr153 = new Object[1];
                                                                                a(b75, b76, b76, objArr153);
                                                                                PngjBadSignature37 = com.d.e.a.PngjBadCrcException.PngjBadSignature(modifierMetaStateMask3, indexOf10, resolveOpacity3, 528172725, false, (String) objArr153[0], new Class[]{cls3});
                                                                            }
                                                                            long longValue24 = ((Long) ((Method) PngjBadSignature37).invoke(null, objArr152)).longValue();
                                                                            long j151 = 182692518;
                                                                            long j152 = (421 * longValue24) + ((-419) * j151);
                                                                            long j153 = 420;
                                                                            long startElapsedRealtime5 = (int) Process.getStartElapsedRealtime();
                                                                            long j154 = j151 ^ j2;
                                                                            long j155 = ((((j154 | (longValue24 ^ j2)) ^ j2) | (((startElapsedRealtime5 ^ j2) | longValue24) ^ j2)) * j153) + ((-420) * (longValue24 | j154)) + (((longValue24 | startElapsedRealtime5) ^ j2) * j153) + j152 + 685053994;
                                                                            int myTid2 = Process.myTid();
                                                                            int i423 = ((((~(1233352418 | myTid2)) | (-1775466483)) | (~(1624388466 | myTid2))) * (-880)) - 818885110;
                                                                            int i424 = (~(1233352418 | (~myTid2))) | (-1624388467);
                                                                            int i425 = ~(myTid2 | (-1233352419));
                                                                            int i426 = ((int) (j155 >> 32)) & ((i425 * 880) + ((i424 | i425) * (-880)) + i423);
                                                                            int i427 = (int) Runtime.getRuntime().totalMemory();
                                                                            int i428 = ~i427;
                                                                            int i429 = ((int) j155) & ((((~(i427 | 1111884610)) | (~(i428 | (-1073873153)))) * 765) + (((-1399214952) | (~(1111884610 | i428))) * 1530) + (((((~(1399214951 | i428)) | (~((-287330342) | i427))) | (~((-1073873153) | i427))) * 765) - 1282446965));
                                                                            if (((i426 & i429) | (i426 ^ i429)) == 2) {
                                                                                PngjPrematureEnding = (PngjInputException + 19) % 128;
                                                                                Object[] objArr154 = {new int[]{r6}, new int[]{r1 ^ (r1 << 5)}, null, new int[]{i}};
                                                                                int i430 = (~(i & 270)) & (i | 270);
                                                                                int i431 = (i2 - (~a.c((~(9926723 | i9)) | (-1024639251), 305, (((~(i | 9926723)) | (-1033369940)) * 305) - 1250391556, 16))) - 1;
                                                                                int i432 = i431 << 13;
                                                                                int i433 = (i431 | i432) & (~(i431 & i432));
                                                                                int i434 = i433 ^ (i433 >>> 17);
                                                                                return objArr154;
                                                                            }
                                                                            Object PngjBadSignature38 = com.d.e.a.PngjBadCrcException.PngjBadSignature(98436405);
                                                                            if (PngjBadSignature38 == null) {
                                                                                char argb3 = (char) (Color.argb(0, 0, 0, 0) + 51309);
                                                                                int gidForName4 = Process.getGidForName(str) + 44;
                                                                                int trimmedLength = TextUtils.getTrimmedLength(str) + 1767;
                                                                                byte b77 = $$a[4];
                                                                                byte b78 = (byte) (b77 + 1);
                                                                                Object[] objArr155 = new Object[1];
                                                                                a(b77, b78, b78, objArr155);
                                                                                PngjBadSignature38 = com.d.e.a.PngjBadCrcException.PngjBadSignature(argb3, gidForName4, trimmedLength, -114202482, false, (String) objArr155[0], new Class[0]);
                                                                            }
                                                                            long longValue25 = ((Long) ((Method) PngjBadSignature38).invoke(null, null)).longValue();
                                                                            long j156 = 529850031;
                                                                            long j157 = ((-764) * longValue25) + ((-1529) * j156);
                                                                            long j158 = 765;
                                                                            long j159 = j156 ^ j2;
                                                                            long j160 = longValue25 ^ j2;
                                                                            long j161 = j159 | j160;
                                                                            long j162 = (((((j159 | j4) ^ j2) | (((j160 | j3) | j156) ^ j2)) * j158) + ((1530 * ((j161 ^ j2) | ((j159 | j3) ^ j2))) + ((((((j161 | j3) ^ j2) | (((j159 | longValue25) | j4) ^ j2)) | (((j160 | j156) | j4) ^ j2)) * j158) + j157))) - 1158279111;
                                                                            int i435 = ((int) (j162 >> 32)) & ((((~((-1215487257) | i9)) | (-1777524029)) * 420) + ((~((-1215487257) | i)) * 420) + 1269469790);
                                                                            int startUptimeMillis4 = (int) Process.getStartUptimeMillis();
                                                                            int i436 = ((int) j162) & ((((~(startUptimeMillis4 | (-2162774))) | 1074039296) * 130) + ((~((~startUptimeMillis4) | (-2162774))) * 130) + 390425387);
                                                                            if ((((i435 & i436) | (i435 ^ i436)) != 0 ? '3' : (char) 11) == '3') {
                                                                                Object[] objArr156 = {new int[]{i ^ 272}, new int[1], null, new int[]{i}};
                                                                                int a = a.a();
                                                                                int i437 = (((~(a | (-352025632))) | 682540342) * 376) + (((~((~a) | 352025631)) | (-1023409472)) * (-376)) + ((((-1012252970) | a) * 376) - 1415183235);
                                                                                int i438 = (i437 & 16) + (i437 | 16) + i2;
                                                                                int i439 = i438 << 13;
                                                                                int i440 = (i439 & (~i438)) | ((~i439) & i438);
                                                                                int i441 = i440 >>> 17;
                                                                                int i442 = (i440 | i441) & (~(i440 & i441));
                                                                                ((int[]) objArr156[1])[0] = i442 ^ (i442 << 5);
                                                                                return objArr156;
                                                                            }
                                                                            long[] jArr3 = {624887784092251L};
                                                                            Object[] objArr157 = new Object[1];
                                                                            b(new int[]{326, 17, 0, 0}, "\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001", true, objArr157);
                                                                            Object[] objArr158 = {(String) objArr157[0], 3, 2251799813685247L, jArr3};
                                                                            Object PngjBadSignature39 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1000971846);
                                                                            if (PngjBadSignature39 == null) {
                                                                                char defaultSize4 = (char) View.getDefaultSize(0, 0);
                                                                                int normalizeMetaState4 = KeyEvent.normalizeMetaState(0) + 35;
                                                                                int deadChar4 = KeyEvent.getDeadChar(0, 0) + 1313;
                                                                                byte b79 = $$a[4];
                                                                                byte b80 = b79;
                                                                                Object[] objArr159 = new Object[1];
                                                                                a(b79, b80, b80, objArr159);
                                                                                cls4 = cls3;
                                                                                PngjBadSignature39 = com.d.e.a.PngjBadCrcException.PngjBadSignature(defaultSize4, normalizeMetaState4, deadChar4, 951651329, false, (String) objArr159[0], new Class[]{cls2, cls4, Long.TYPE, long[].class});
                                                                            } else {
                                                                                cls4 = cls3;
                                                                            }
                                                                            long longValue26 = ((Long) ((Method) PngjBadSignature39).invoke(null, objArr158)).longValue();
                                                                            long j163 = 1947031228;
                                                                            Class cls6 = cls2;
                                                                            long j164 = -496;
                                                                            long j165 = (j164 * longValue26) + (j164 * j163);
                                                                            long j166 = 497;
                                                                            long j167 = j163 ^ j2;
                                                                            long j168 = longValue26 ^ j2;
                                                                            long j169 = j167 | j168;
                                                                            long j170 = ((j166 * ((((j167 | j3) ^ j2) | ((j167 | longValue26) ^ j2)) | (((j168 | j163) | j4) ^ j2))) + (((((j169 | j4) ^ j2) | (((j168 | j3) | j163) ^ j2)) * j166) + (((j169 ^ j2) * j166) + j165))) - 2126875397;
                                                                            int uptimeMillis3 = (int) SystemClock.uptimeMillis();
                                                                            int i443 = ((int) (j170 >> 32)) & ((((~(uptimeMillis3 | (-406792958))) | (~((~uptimeMillis3) | 1844019368))) * 627) + (((~((-1844019369) | uptimeMillis3)) | (-406792958)) * (-627)) + ((2113907453 | uptimeMillis3) * (-627)) + 635053320);
                                                                            int i444 = ((int) j170) & ((((~(577500719 | i9)) | (-859725691)) * 217) + (((~(859725690 | i)) | (-864026496)) * 217) + ((((~(859725690 | i9)) | (~(577500719 | i))) * 217) - 1214826613));
                                                                            if (((i443 & i444) | (i443 ^ i444)) != 0) {
                                                                                Object[] objArr160 = {new int[]{r6}, new int[]{((~r1) & r2) | ((~r2) & r1)}, null, new int[]{i}};
                                                                                int i445 = (~(i & 275)) & (i | 275);
                                                                                int i446 = (i2 - (~(-(-a.c(~(i | (-503988737)), 566, (((~((-512423505) | i)) | 8434768) * (-566)) + 1513677365, 16))))) - 1;
                                                                                int i447 = i446 ^ (i446 << 13);
                                                                                int i448 = i447 ^ (i447 >>> 17);
                                                                                int i449 = i448 << 5;
                                                                                return objArr160;
                                                                            }
                                                                            Object[] objArr161 = new Object[1];
                                                                            b(new int[]{371, 11, 0, 0}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000", false, objArr161);
                                                                            Object[] objArr162 = {(String) objArr161[0]};
                                                                            Object PngjBadSignature40 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1666380462);
                                                                            if (PngjBadSignature40 == null) {
                                                                                char alpha5 = (char) Color.alpha(0);
                                                                                int combineMeasuredStates3 = 28 - View.combineMeasuredStates(0, 0);
                                                                                int i450 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1446;
                                                                                byte b81 = $$a[4];
                                                                                byte b82 = (byte) (b81 + 1);
                                                                                Object[] objArr163 = new Object[1];
                                                                                a(b81, b82, b82, objArr163);
                                                                                PngjBadSignature40 = com.d.e.a.PngjBadCrcException.PngjBadSignature(alpha5, combineMeasuredStates3, i450, -1614962923, false, (String) objArr163[0], new Class[]{cls6});
                                                                            }
                                                                            long longValue27 = ((Long) ((Method) PngjBadSignature40).invoke(null, objArr162)).longValue();
                                                                            long j171 = -1499103831;
                                                                            long j172 = -964;
                                                                            long j173 = (965 * longValue27) + ((-963) * j171) + j172;
                                                                            long j174 = longValue27 ^ j2;
                                                                            long elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                                                                            long j175 = (j172 * (((j174 | (elapsedCpuTime2 ^ j2)) ^ j2) | ((j174 | j171) ^ j2))) + (((j171 ^ j2) | ((j174 | elapsedCpuTime2) ^ j2)) * j172) + j173 + 1969592148;
                                                                            int myUid4 = Process.myUid();
                                                                            int i451 = ((int) (j175 >> 32)) & ((((~(myUid4 | (-1350815677))) | (~(1506925208 | myUid4)) | 132388) * 623) + (((~myUid4) | 156241920) * (-623)) + (((~((-132389) | myUid4)) * 623) - 90782962));
                                                                            int i452 = 619016821 | i9;
                                                                            int i453 = ((int) j175) & ((((~i452) | 73413216) * 495) + (i452 * 495) + 877937828);
                                                                            if (!(((i451 & i453) | (i451 ^ i453)) == 0)) {
                                                                                Object[] objArr164 = {new int[]{r5}, new int[1], null, new int[]{i}};
                                                                                int i454 = (~(i & 276)) & (i | 276);
                                                                                int c16 = a.c((~(612258699 | i9)) | (-1029027394), 381, ((i | (-419537985)) * (-381)) + 391614866, 930181952);
                                                                                int i455 = (((c16 ^ (-17)) | (c16 & (-17))) * (-368)) + ((c16 * 185) - 2928);
                                                                                int i456 = ~c16;
                                                                                int i457 = (i456 & 16) | (i456 ^ 16);
                                                                                int i458 = -(-(((i457 & i9) | (i457 ^ i9)) * 184));
                                                                                int i459 = ((i455 | i458) << 1) - (i458 ^ i455);
                                                                                int i460 = (~((~c16) | (-17))) | (~((i9 ^ 16) | (i9 & 16)));
                                                                                int i461 = ~((c16 & 16) | (c16 ^ 16));
                                                                                int i462 = (i459 - (~(-(-(((i461 & i460) | (i460 ^ i461)) * 184))))) - 1;
                                                                                int PngjBadCrcException8 = getAsHighestSecurityLevelReached.PngjBadCrcException();
                                                                                int i463 = i462 * (-112);
                                                                                int i464 = -(-(i2 * (-112)));
                                                                                int i465 = (i463 & i464) + (i463 | i464);
                                                                                int i466 = ~i2;
                                                                                int i467 = ~PngjBadCrcException8;
                                                                                int i468 = ((~((i466 ^ i467) | (i466 & i467))) | i462) * 226;
                                                                                int i469 = (i465 ^ i468) + ((i465 & i468) << 1);
                                                                                int i470 = ~i462;
                                                                                int i471 = ~((i470 ^ i2) | (i470 & i2));
                                                                                int i472 = ~((i470 & PngjBadCrcException8) | (i470 ^ PngjBadCrcException8));
                                                                                int i473 = (i472 & i471) | (i471 ^ i472);
                                                                                int i474 = i466 | i467;
                                                                                int i475 = ~((i474 & i462) | (i474 ^ i462));
                                                                                int i476 = ((i475 & i473) | (i473 ^ i475)) * (-113);
                                                                                int i477 = (i469 ^ i476) + ((i476 & i469) << 1);
                                                                                int i478 = ~i2;
                                                                                int i479 = -(-((~((PngjBadCrcException8 & i478) | (i478 ^ PngjBadCrcException8))) * 113));
                                                                                int i480 = ((i477 | i479) << 1) - (i479 ^ i477);
                                                                                int i481 = i480 << 13;
                                                                                int i482 = (i481 | i480) & (~(i480 & i481));
                                                                                int i483 = i482 ^ (i482 >>> 17);
                                                                                ((int[]) objArr164[1])[0] = i483 ^ (i483 << 5);
                                                                                return objArr164;
                                                                            }
                                                                            Object PngjBadSignature41 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1617763359);
                                                                            if (PngjBadSignature41 == null) {
                                                                                char c17 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > j5 ? 1 : (SystemClock.elapsedRealtimeNanos() == j5 ? 0 : -1)));
                                                                                int mode2 = 31 - View.MeasureSpec.getMode(0);
                                                                                int touchSlop = 1381 - (ViewConfiguration.getTouchSlop() >> 8);
                                                                                byte b83 = $$a[4];
                                                                                byte b84 = (byte) (b83 + 1);
                                                                                Object[] objArr165 = new Object[1];
                                                                                a(b83, b84, b84, objArr165);
                                                                                PngjBadSignature41 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c17, mode2, touchSlop, -1669172828, false, (String) objArr165[0], new Class[0]);
                                                                            }
                                                                            long longValue28 = ((Long) ((Method) PngjBadSignature41).invoke(null, null)).longValue();
                                                                            long j176 = 735746855;
                                                                            long j177 = 220;
                                                                            long j178 = ((j177 * ((j176 | longValue28) | j4)) + (((-440) * (j176 | ((j3 | longValue28) ^ j2))) + ((((((j176 ^ j2) | (longValue28 ^ j2)) ^ j2) | (((j3 | j176) | longValue28) ^ j2)) * j177) + (((-219) * longValue28) + (221 * j176))))) - 1782441364;
                                                                            int i484 = ((int) (j178 >> 32)) & ((((~((-2078043594) | i9)) | 779697291) * 305) + (((~((-2078043594) | i)) | 710421641) * 305) + 1704617878);
                                                                            int c18 = ((int) j178) & a.c((~((~((int) Process.getStartUptimeMillis())) | 258432822)) | 1073782849, 933, (((~(1178793587 | r6)) | 258432822) * (-933)) - 1140360956, -809229254);
                                                                            if (!(((i484 & c18) | (i484 ^ c18)) == 0)) {
                                                                                Object[] objArr166 = {new int[]{r6}, new int[]{r1 ^ (r1 << 5)}, null, new int[]{i}};
                                                                                int i485 = (~(i & 273)) & (i | 273);
                                                                                int i486 = (~((-440727663) | i9)) | 38027366;
                                                                                int i487 = (((~(i | 996538607)) | (~((-402700297) | i9))) * 502) + (((i486 | r1) * (-502)) - 1350532775);
                                                                                int i488 = (i487 & 16) + (i487 | 16);
                                                                                int i489 = (i2 & i488) + (i2 | i488);
                                                                                int i490 = i489 ^ (i489 << 13);
                                                                                int i491 = i490 >>> 17;
                                                                                int i492 = ((~i490) & i491) | ((~i491) & i490);
                                                                                int i493 = PngjPrematureEnding;
                                                                                int i494 = (i493 & 65) + (i493 | 65);
                                                                                PngjInputException = i494 % 128;
                                                                                if (i494 % 2 == 0) {
                                                                                    return objArr166;
                                                                                }
                                                                                throw null;
                                                                            }
                                                                            Object PngjBadSignature42 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-820027826);
                                                                            if (PngjBadSignature42 == null) {
                                                                                char c19 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 13779);
                                                                                int scrollBarSize3 = 29 - (ViewConfiguration.getScrollBarSize() >> 8);
                                                                                int trimmedLength2 = TextUtils.getTrimmedLength(str) + 1502;
                                                                                byte b85 = $$a[4];
                                                                                byte b86 = b85;
                                                                                Object[] objArr167 = new Object[1];
                                                                                a(b85, b86, b86, objArr167);
                                                                                PngjBadSignature42 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c19, scrollBarSize3, trimmedLength2, 871379957, false, (String) objArr167[0], new Class[0]);
                                                                            }
                                                                            long longValue29 = ((Long) ((Method) PngjBadSignature42).invoke(null, null)).longValue();
                                                                            long j179 = -27687633;
                                                                            long j180 = -743;
                                                                            long j181 = j179 | longValue29;
                                                                            long j182 = ((-744) * ((j181 ^ j2) | ((j179 | j4) ^ j2) | ((longValue29 | j4) ^ j2))) + (j180 * longValue29) + (j180 * j179);
                                                                            long j183 = 744;
                                                                            long j184 = ((j183 * (j181 | j4)) + (((j3 | (((j179 ^ j2) | (longValue29 ^ j2)) ^ j2)) * j183) + j182)) - 139707583;
                                                                            int i495 = ((int) (j184 >> 32)) & ((((~((-636449567) | i)) | 73806614 | (~((-1511033026) | i9))) * 717) + (((((~(i9 | (-636449567))) | 73806614) | (~((-1511033026) | i))) * 717) - 2089234055));
                                                                            int maxMemory4 = (int) Runtime.getRuntime().maxMemory();
                                                                            int i496 = ((int) j184) & ((((~(maxMemory4 | 501071504)) | (~((~maxMemory4) | 1938297914)) | (~((-1938297915) | maxMemory4))) * 831) + ((~((-294130705) | maxMemory4)) * (-1662)) + ((((~((-501071505) | r7)) | (~((-1644167211) | maxMemory4))) * (-831)) - 1545802934));
                                                                            if (!(((i495 & i496) | (i495 ^ i496)) == 0)) {
                                                                                Object[] objArr168 = {new int[]{r6}, new int[]{(r1 | r2) & (~(r1 & r2))}, null, new int[]{i}};
                                                                                int i497 = (~(i & 279)) & (i | 279);
                                                                                int i498 = (((~(i | (-37750402))) | (~((-901656939) | i9)) | 806498304) * 168) + ((~((-95158635) | i)) * 168) + ((((~((-132909036) | i9)) | 95158634) * 168) - 973825651);
                                                                                int i499 = (i498 ^ 16) + ((i498 & 16) << 1);
                                                                                int i500 = (i2 & i499) + (i2 | i499);
                                                                                int i501 = i500 << 13;
                                                                                int i502 = ((~i500) & i501) | ((~i501) & i500);
                                                                                int i503 = i502 >>> 17;
                                                                                int i504 = (i502 | i503) & (~(i502 & i503));
                                                                                int i505 = i504 << 5;
                                                                                return objArr168;
                                                                            }
                                                                            Object[] objArr169 = {Integer.valueOf(i), obj, Integer.valueOf(i2), 16777216};
                                                                            Object PngjBadSignature43 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1284430186);
                                                                            if (PngjBadSignature43 == null) {
                                                                                PngjBadSignature43 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) Drawable.resolveOpacity(0, 0), 26 - (ViewConfiguration.getPressedStateDuration() >> 16), 1224 - View.resolveSize(0, 0), 1335773997, false, null, new Class[]{cls4, (Class) com.d.e.a.PngjBadCrcException.values((char) TextUtils.indexOf(str, str, 0, 0), 25 - ExpandableListView.getPackedPositionType(j5), TextUtils.indexOf(str, str, 0) + 1199), cls4, cls4});
                                                                            }
                                                                            Object newInstance = ((Constructor) PngjBadSignature43).newInstance(objArr169);
                                                                            try {
                                                                                Object[] objArr170 = new Object[1];
                                                                                b(new int[]{382, 16, 84, 0}, "\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001", false, objArr170);
                                                                                Class<?> cls7 = Class.forName((String) objArr170[0]);
                                                                                int i506 = -KeyEvent.normalizeMetaState(0);
                                                                                Object[] objArr171 = new Object[1];
                                                                                c(null, null, (i506 ^ 127) + ((i506 & 127) << 1), "\u008e\u0089\u0090\u008e\u0087", objArr171);
                                                                                cls7.getMethod((String) objArr171[0], null).invoke(newInstance, null);
                                                                                Object[] objArr172 = {new int[]{i}, new int[1], null, new int[]{i}};
                                                                                int i507 = (((~(i | (-363129027))) | 278658 | (~(1034287315 | i9))) * 988) + ((((~((-362850369) | i9)) | (~(1034287315 | i))) * 988) - 1580974387);
                                                                                int i508 = ~i9;
                                                                                int i509 = (((i508 & i507) | (i507 ^ i508)) * 764) + (-(-(i507 * (-1527))));
                                                                                int i510 = (~((i96 ^ i507) | (i96 & i507))) * (-1528);
                                                                                int i511 = ((i509 | i510) << 1) - (i510 ^ i509);
                                                                                int i512 = ~(((-1) ^ i507) | i507);
                                                                                int i513 = ~(~i507);
                                                                                int i514 = (i513 & i512) | (i512 ^ i513);
                                                                                int i515 = ~i96;
                                                                                int i516 = -(-(((i514 & i515) | (i514 ^ i515)) * 764));
                                                                                int i517 = (i511 & i516) + (i516 | i511);
                                                                                int PngjBadCrcException9 = getAsHighestSecurityLevelReached.PngjBadCrcException();
                                                                                int i518 = i517 * (-518);
                                                                                int i519 = -(-(i2 * (-518)));
                                                                                int i520 = (i518 ^ i519) + ((i518 & i519) << 1);
                                                                                int i521 = ~i517;
                                                                                int i522 = ~PngjBadCrcException9;
                                                                                int i523 = (i520 - (~(-(-(((~((i521 & i522) | (i521 ^ i522))) | i2) * 519))))) - 1;
                                                                                int i524 = ~i517;
                                                                                int i525 = (i524 & i522) | (i524 ^ i522);
                                                                                int i526 = ~((i525 & i2) | (i525 ^ i2));
                                                                                int i527 = (i517 ^ i2) | (i517 & i2);
                                                                                int i528 = ~((i527 & PngjBadCrcException9) | (i527 ^ PngjBadCrcException9));
                                                                                int i529 = ((i526 & i528) | (i526 ^ i528)) * (-519);
                                                                                int i530 = ((i523 | i529) << 1) - (i529 ^ i523);
                                                                                int i531 = ~((PngjBadCrcException9 & i2) | (i2 ^ PngjBadCrcException9));
                                                                                int i532 = -(-(((i531 & i517) | (i517 ^ i531)) * 519));
                                                                                int i533 = (i530 & i532) + (i532 | i530);
                                                                                int i534 = i533 << 13;
                                                                                int i535 = (i534 | i533) & (~(i533 & i534));
                                                                                int i536 = i535 >>> 17;
                                                                                int i537 = ((~i535) & i536) | ((~i536) & i535);
                                                                                ((int[]) objArr172[1])[0] = i537 ^ (i537 << 5);
                                                                                return objArr172;
                                                                            } catch (Throwable th6) {
                                                                                Throwable cause2 = th6.getCause();
                                                                                if (cause2 != null) {
                                                                                    throw cause2;
                                                                                }
                                                                                throw th6;
                                                                            }
                                                                        }
                                                                        objArr = new Object[]{new int[]{(i & (-269)) | (i9 & 268)}, new int[1], null, new int[]{i}};
                                                                        int startUptimeMillis5 = (int) Process.getStartUptimeMillis();
                                                                        int i538 = (~((-165946480) | startUptimeMillis5)) | 29623398;
                                                                        int i539 = ~((~startUptimeMillis5) | 1004942575);
                                                                        int i540 = (i2 - (~(-(-a.A((~(startUptimeMillis5 | (-136323082))) | i539, 470, ((i538 | i539) * (-470)) + 2072661145, -16))))) - 1;
                                                                        int i541 = i540 ^ (i540 << 13);
                                                                        int i542 = i541 >>> 17;
                                                                        int i543 = ((~i541) & i542) | ((~i542) & i541);
                                                                        ((int[]) objArr[1])[0] = i543 ^ (i543 << 5);
                                                                    }
                                                                } else {
                                                                    objArr = new Object[]{new int[]{r10}, new int[]{r4 ^ (r4 << 5)}, null, new int[]{i}};
                                                                    int i544 = (~(i & 264)) & (i | 264);
                                                                    int i545 = -(-a.c((~(801595785 | i9)) | (-572896838), 184, (((-2135621) | i9) * 184) - 926598051, 16));
                                                                    int i546 = ((i2 | i545) << 1) - (i545 ^ i2);
                                                                    int i547 = i546 << 13;
                                                                    int i548 = (i547 | i546) & (~(i546 & i547));
                                                                    int i549 = i548 >>> 17;
                                                                    int i550 = ((~i548) & i549) | ((~i549) & i548);
                                                                }
                                                                c = 0;
                                                                if ((((int[]) objArr[3])[c] != ((int[]) objArr[c])[c] ? 'O' : 'P') != 'P') {
                                                                }
                                                            }
                                                        }
                                                        z4 = false;
                                                        if (z4) {
                                                        }
                                                        c = 0;
                                                        if ((((int[]) objArr[3])[c] != ((int[]) objArr[c])[c] ? 'O' : 'P') != 'P') {
                                                        }
                                                    }
                                                    PngjInputException = (PngjPrematureEnding + 111) % 128;
                                                } catch (Throwable th7) {
                                                    Throwable cause3 = th7.getCause();
                                                    if (cause3 != null) {
                                                        throw cause3;
                                                    }
                                                    throw th7;
                                                }
                                            } else {
                                                int maxKeyCode = KeyEvent.getMaxKeyCode() >> 16;
                                                Object[] objArr173 = new Object[1];
                                                c(null, null, (maxKeyCode ^ 127) + ((maxKeyCode & 127) << 1), "\u0081\u0091\u0086\u0091\u0091\u008c\u0089", objArr173);
                                                if (!invoke8.equals((String) objArr173[0])) {
                                                }
                                                Object[] objArr1152 = new Object[1];
                                                b(new int[]{269, 23, 166, 0}, "\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000", false, objArr1152);
                                                Object[] objArr1162 = {(String) objArr1152[0]};
                                                PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i12);
                                                if (PngjBadSignature2 == null) {
                                                }
                                                str2 = (String) ((Method) PngjBadSignature2).invoke(null, objArr1162);
                                                if (str2 != null) {
                                                    i14 = ((parseInt | 170) << 1) - (parseInt ^ 170);
                                                    if (i14 != 0) {
                                                    }
                                                }
                                                PngjInputException = (PngjPrematureEnding + 111) % 128;
                                            }
                                            cause = th.getCause();
                                            if (cause == null) {
                                                throw cause;
                                            }
                                            throw th;
                                        }
                                        i14 = 0;
                                        if (i14 != 0) {
                                        }
                                    } catch (Throwable th8) {
                                        Throwable cause4 = th8.getCause();
                                        if (cause4 != null) {
                                            throw cause4;
                                        }
                                        throw th8;
                                    }
                                } catch (Throwable th9) {
                                    Throwable cause5 = th9.getCause();
                                    if (cause5 != null) {
                                        throw cause5;
                                    }
                                    throw th9;
                                }
                            }
                            z3 = false;
                            if (!z3) {
                            }
                        }
                    }
                }
                z2 = false;
                if (!z2) {
                }
            }
        }
        if (!z) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, short s, byte b2, Object[] objArr) {
        int i;
        int i2;
        int i3 = s + 1;
        int i4 = (b2 * 4) + 97;
        byte[] bArr = $$a;
        int i5 = 4 - (b * 3);
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            int i6 = i5;
            i4 = i3;
            i = 0;
            int i7 = i5;
            i4 = (i4 + i6) - 52;
            i2 = i7 + 1;
            bArr2[i] = (byte) i4;
            i++;
            if (i == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i6 = bArr[i2];
            i7 = i2;
            i4 = (i4 + i6) - 52;
            i2 = i7 + 1;
            bArr2[i] = (byte) i4;
            i++;
            if (i == i3) {
            }
        } else {
            i = 0;
            i2 = i5;
            bArr2[i] = (byte) i4;
            i++;
            if (i == i3) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d5, code lost:
    
        if (r27[r5] == 1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b4 A[Catch: all -> 0x01e6, TryCatch #0 {all -> 0x01e6, blocks: (B:10:0x003b, B:12:0x004c, B:13:0x0086, B:36:0x00db, B:38:0x00f4, B:39:0x012f, B:42:0x01a1, B:44:0x01b4, B:45:0x01dc, B:49:0x0142, B:51:0x015c, B:52:0x018d), top: B:9:0x003b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int[] iArr, String str, boolean z, Object[] objArr) {
        int i;
        float f;
        int i2;
        char c;
        Object PngjBadSignature2;
        byte[] bArr;
        int i3;
        String str2 = str;
        byte[] bArr2 = str2;
        if (str2 != null) {
            $10 = ($11 + 53) % 128;
            bArr2 = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr3 = bArr2;
        com.d.e.e1 e1Var = new com.d.e.e1();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = PngjBadSignature;
        Class cls = Integer.TYPE;
        if (cArr != null) {
            int length = cArr.length;
            f = 0.0f;
            char[] cArr2 = new char[length];
            i = 2;
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                    Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-259747866);
                    if (PngjBadSignature3 == null) {
                        char c2 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int keyCodeFromString = KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 35;
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1313;
                        bArr = bArr3;
                        int i9 = $$d;
                        byte b = (byte) (i9 - 2);
                        i3 = i8;
                        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c2, keyCodeFromString, fadingEdgeLength, 208396893, false, $$e(b, b, (byte) i9), new Class[]{cls});
                    } else {
                        bArr = bArr3;
                        i3 = i8;
                    }
                    cArr2[i3] = ((Character) ((Method) PngjBadSignature3).invoke(null, objArr2)).charValue();
                    i8 = i3 + 1;
                    bArr3 = bArr;
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
            i = 2;
            f = 0.0f;
        }
        byte[] bArr4 = bArr3;
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr4 != null) {
            $11 = ($10 + 47) % 128;
            char[] cArr4 = new char[i5];
            e1Var.PngjBadSignature = 0;
            char c3 = 0;
            while (true) {
                int i10 = e1Var.PngjBadSignature;
                if (i10 >= i5) {
                    break;
                }
                int i11 = $11 + 29;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    if (bArr4[i10] == 0) {
                        c = 1;
                        char c4 = cArr3[i10];
                        Object[] objArr3 = new Object[i];
                        objArr3[c] = Integer.valueOf(c3);
                        objArr3[0] = Integer.valueOf(c4);
                        Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-655108508);
                        if (PngjBadSignature4 == null) {
                            byte b2 = (byte) ($$d - 2);
                            byte b3 = b2;
                            PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (((Process.getThreadPriority(0) + 20) >> 6) + 31882), 32 - ExpandableListView.getPackedPositionGroup(0L), 1250 - (ViewConfiguration.getJumpTapTimeout() >> 16), 605862879, false, $$e(b2, b3, (byte) (b3 + 3)), new Class[]{cls, cls});
                        }
                        cArr4[i10] = ((Character) ((Method) PngjBadSignature4).invoke(null, objArr3)).charValue();
                        c3 = cArr4[e1Var.PngjBadSignature];
                        Object[] objArr4 = {e1Var, e1Var};
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1060060353);
                        if (PngjBadSignature2 == null) {
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), Color.alpha(0) + 35, 155 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), -1010806406, false, "g", new Class[]{Object.class, Object.class});
                        }
                        ((Method) PngjBadSignature2).invoke(null, objArr4);
                        i = 2;
                    }
                    Object[] objArr5 = {Integer.valueOf(cArr3[i10]), Integer.valueOf(c3)};
                    Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(269554740);
                    if (PngjBadSignature5 == null) {
                        byte b4 = (byte) ($$d - 2);
                        byte b5 = b4;
                        PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)), View.resolveSize(0, 0) + 35, KeyEvent.normalizeMetaState(0) + 1598, -318867057, false, $$e(b4, b5, b5), new Class[]{cls, cls});
                    }
                    cArr4[i10] = ((Character) ((Method) PngjBadSignature5).invoke(null, objArr5)).charValue();
                    c3 = cArr4[e1Var.PngjBadSignature];
                    Object[] objArr42 = {e1Var, e1Var};
                    PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1060060353);
                    if (PngjBadSignature2 == null) {
                    }
                    ((Method) PngjBadSignature2).invoke(null, objArr42);
                    i = 2;
                } else {
                    c = 1;
                }
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            i2 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i12 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i12, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i12);
        } else {
            i2 = 0;
        }
        if (z) {
            char[] cArr6 = new char[i5];
            while (true) {
                e1Var.PngjBadSignature = i2;
                int i13 = e1Var.PngjBadSignature;
                if (i13 >= i5) {
                    break;
                }
                $10 = ($11 + 29) % 128;
                cArr6[i13] = cArr3[(i5 - i13) - 1];
                i2 = i13 + 1;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            e1Var.PngjBadSignature = 0;
            while (true) {
                int i14 = e1Var.PngjBadSignature;
                if (i14 >= i5) {
                    break;
                }
                $11 = ($10 + 33) % 128;
                cArr3[i14] = (char) (cArr3[i14] - iArr[2]);
                e1Var.PngjBadSignature = i14 + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private static void c(int[] iArr, String str, int i, String str2, Object[] objArr) {
        char[] cArr;
        int i2;
        char c;
        int length;
        char[] cArr2;
        int i3;
        String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        if (str != null) {
            int i4 = $10 + 121;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                cArr = str.toCharArray();
                int i5 = 16 / 0;
            } else {
                cArr = str.toCharArray();
            }
        } else {
            cArr = str;
        }
        char[] cArr3 = cArr;
        com.d.e.PngjExceptionInternal pngjExceptionInternal = new com.d.e.PngjExceptionInternal();
        char[] cArr4 = values;
        Class cls = Integer.TYPE;
        if (cArr4 != null) {
            int i6 = $10 + 49;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                length = cArr4.length;
                cArr2 = new char[length];
                i3 = 1;
            } else {
                length = cArr4.length;
                cArr2 = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                $11 = ($10 + 95) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr4[i3])};
                    Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(358189806);
                    if (PngjBadSignature2 == null) {
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (27092 - Color.green(0)), Process.getGidForName(BuildConfig.FLAVOR) + 38, 118 - View.MeasureSpec.getMode(0), -373889195, false, "b", new Class[]{cls});
                    }
                    cArr2[i3] = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr2)).charValue();
                    i3++;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr4 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(valueOf)};
        Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1639226071);
        if (PngjBadSignature3 == null) {
            char green = (char) (61713 - Color.green(0));
            int i7 = 35 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            int lastIndexOf = TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 279;
            byte b = (byte) ($$d - 2);
            c = 1;
            byte b2 = b;
            i2 = 2;
            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(green, i7, lastIndexOf, -1654917268, false, $$e(b, b2, (byte) (b2 + 1)), new Class[]{cls});
        } else {
            i2 = 2;
            c = 1;
        }
        int intValue = ((Integer) ((Method) PngjBadSignature3).invoke(null, objArr3)).intValue();
        int i8 = -528960794;
        if (PngjExceptionInternal) {
            int i9 = $10;
            int i10 = i9 + 25;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            int length2 = bArr2.length;
            pngjExceptionInternal.PngjException = length2;
            char[] cArr5 = new char[length2];
            pngjExceptionInternal.values = 0;
            $11 = (i9 + 35) % 128;
            while (true) {
                int i12 = pngjExceptionInternal.values;
                int i13 = pngjExceptionInternal.PngjException;
                if (i12 >= i13) {
                    objArr[0] = new String(cArr5);
                    return;
                }
                cArr5[i12] = (char) (cArr4[bArr2[(i13 - 1) - i12] + i] - intValue);
                Object[] objArr4 = new Object[i2];
                objArr4[c] = pngjExceptionInternal;
                objArr4[0] = pngjExceptionInternal;
                Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-528960794);
                if (PngjBadSignature4 == null) {
                    char mode = (char) View.MeasureSpec.getMode(0);
                    int bitsPerPixel = 36 - ImageFormat.getBitsPerPixel(0);
                    int alpha = 549 - Color.alpha(0);
                    byte b3 = (byte) ($$d - 2);
                    byte b4 = b3;
                    PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(mode, bitsPerPixel, alpha, 479715165, false, $$e(b3, b4, (byte) (b4 + 5)), new Class[]{Object.class, Object.class});
                }
                ((Method) PngjBadSignature4).invoke(null, objArr4);
                i2 = 2;
            }
        } else if (PngjUnsupportedException) {
            int length3 = cArr3.length;
            pngjExceptionInternal.PngjException = length3;
            char[] cArr6 = new char[length3];
            pngjExceptionInternal.values = 0;
            while (true) {
                int i14 = pngjExceptionInternal.values;
                int i15 = pngjExceptionInternal.PngjException;
                if (i14 >= i15) {
                    objArr[0] = new String(cArr6);
                    return;
                }
                cArr6[i14] = (char) (cArr4[cArr3[(i15 - 1) - i14] - i] - intValue);
                Object[] objArr5 = new Object[2];
                objArr5[c] = pngjExceptionInternal;
                objArr5[0] = pngjExceptionInternal;
                Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i8);
                if (PngjBadSignature5 == null) {
                    byte b5 = (byte) ($$d - 2);
                    byte b6 = b5;
                    PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 37, 549 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 479715165, false, $$e(b5, b6, (byte) (b6 + 5)), new Class[]{Object.class, Object.class});
                }
                ((Method) PngjBadSignature5).invoke(null, objArr5);
                i8 = -528960794;
            }
        } else {
            int length4 = iArr.length;
            pngjExceptionInternal.PngjException = length4;
            char[] cArr7 = new char[length4];
            pngjExceptionInternal.values = 0;
            while (true) {
                int i16 = pngjExceptionInternal.values;
                int i17 = pngjExceptionInternal.PngjException;
                if (i16 >= i17) {
                    objArr[0] = new String(cArr7);
                    return;
                } else {
                    cArr7[i16] = (char) (cArr4[iArr[(i17 - 1) - i16] - i] - intValue);
                    pngjExceptionInternal.values = i16 + 1;
                }
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{58, 76, -101, 43, 0};
        $$b = 70;
    }

    public static void init$1() {
        $$c = new byte[]{47, 36, -120, -67};
        $$d = 2;
    }
}
