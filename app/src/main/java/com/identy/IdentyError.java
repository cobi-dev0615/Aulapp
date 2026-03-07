package com.identy;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.identy.enums.Finger;
import com.identy.enums.Hand;
import com.karumi.dexter.BuildConfig;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes2.dex */
public final class IdentyError extends IdentyResponse {
    private static  byte[] $$a = null;
    private static  int $$b = 0;
    private static  byte[] $$c = null;
    private static  byte[] $$d = null;
    private static  int $$e = 0;
    private static  int $$f = 0;
    private static int $10;
    private static int $11;
    private static int PngjExceptionInternal;
    private static int PngjPrematureEnding;
    private static int PngjUnsupportedException;
    private Pair[] PngjInputException;
    private ERRORS PngjOutputException;

    private static String $$i(byte b, int i, byte b2) {
        int i2 = 104 - (b2 * 4);
        byte[] bArr = $$c;
        int i3 = i + 4;
        int i4 = b * 4;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i2 = i3 + i2;
            i3 = i3;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            int i6 = i3 + 1;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            i2 += bArr[i6];
            i3 = i6;
        }
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        PngjUnsupportedException = 0;
        PngjExceptionInternal = 1;
        PngjPrematureEnding = 97773847;
    }

    public IdentyError(Action action, ERRORS errors, Activity activity) {
        super(action, 0, WSQCompression.WSQ_10_1, null, null, null, activity, null, null);
        this.PngjOutputException = errors;
        this.PngjInputException = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, byte b2, int i, Object[] objArr) {
        int i2;
        byte[] bArr = $$d;
        int i3 = b + 4;
        int i4 = (i * 19) + 80;
        byte[] bArr2 = new byte[b2 + 6];
        int i5 = b2 + 5;
        if (bArr == null) {
            int i6 = i3;
            byte[] bArr3 = bArr;
            int i7 = 0;
            int i8 = i5;
            int i9 = i6 + 1;
            i4 = (i8 + i3) - 13;
            i3 = i9;
            bArr = bArr3;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i10 = i4;
            i6 = i3;
            i3 = bArr[i3];
            i7 = i2 + 1;
            bArr3 = bArr;
            i8 = i10;
            int i92 = i6 + 1;
            i4 = (i8 + i3) - 13;
            i3 = i92;
            bArr = bArr3;
            i2 = i7;
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, byte b, Object[] objArr) {
        int i = 0;
        int i2;
        int i3 = 19 - (s2 * 6);
        int i4 = 118 - (b * 38);
        byte[] bArr = $$a;
        int i5 = (s * 6) + 4;
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            int i6 = i3;
            i2 = 0;
            i4 = i4 + (-i6) + 5;
            i5++;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i6 = bArr[i5];
            i4 = i4 + (-i6) + 5;
            i5++;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, boolean z, String str, int i2, int i3, Object[] objArr) throws Exception {
        int i4;
        Throwable cause;
        int i5;
        char c;
        int i6;
        $10 = ($11 + 45) % 128;
        char[] charArray = str != null ? str.toCharArray() : null;
        com.d.e.Action action = new com.d.e.Action();
        char[] cArr = new char[i];
        int i7 = 0;
        action.valueOf = 0;
        $10 = ($11 + 51) % 128;
        while (true) {
            int i8 = action.valueOf;
            if (i8 >= i) {
                break;
            }
            char c2 = charArray[i8];
            action.values = c2;
            char c3 = (char) (i3 + c2);
            cArr[i8] = c3;
            try {
                Object[] objArr2 = new Object[2];
                objArr2[1] = Integer.valueOf(PngjPrematureEnding);
                objArr2[i7] = Integer.valueOf(c3);
                Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(610361420);
                if (PngjBadSignature == null) {
                    char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int size = 28 - View.MeasureSpec.getSize(i7);
                    int lastIndexOf = TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', i7) + 1532;
                    i6 = -743328348;
                    byte b = (byte) i7;
                    c = 1;
                    byte b2 = (byte) (b - 1);
                    i5 = i7;
                    String $$i = $$i(b, b2, (byte) (b2 + 1));
                    Class cls = Integer.TYPE;
                    PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(keyRepeatTimeout, size, lastIndexOf, -661778953, false, $$i, new Class[]{cls, cls});
                } else {
                    i5 = i7;
                    c = 1;
                    i6 = -743328348;
                }
                cArr[i8] = ((Character) ((Method) PngjBadSignature).invoke(null, objArr2)).charValue();
                Object[] objArr3 = new Object[2];
                objArr3[c] = action;
                objArr3[i5] = action;
                Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i6);
                if (PngjBadSignature2 == null) {
                    PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ExpandableListView.getPackedPositionType(0L), 40 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, i5), 190 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 794744863, false, "j", new Class[]{Object.class, Object.class});
                }
                ((Method) PngjBadSignature2).invoke(null, objArr3);
                i7 = 0;
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            // decompiler artifact: dead code removed
        }
        if (i2 > 0) {
            action.PngjException = i2;
            char[] cArr2 = new char[i];
            i4 = 0;
            System.arraycopy(cArr, 0, cArr2, 0, i);
            int i9 = action.PngjException;
            System.arraycopy(cArr2, 0, cArr, i - i9, i9);
            int i10 = action.PngjException;
            System.arraycopy(cArr2, i10, cArr, 0, i - i10);
        } else {
            i4 = 0;
        }
        if (z) {
            char[] cArr3 = new char[i];
            action.valueOf = i4;
            while (true) {
                int i11 = action.valueOf;
                if (i11 >= i) {
                    break;
                }
                $11 = ($10 + 125) % 128;
                cArr3[i11] = cArr[(i - i11) - 1];
                Object[] objArr4 = {action, action};
                Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-743328348);
                if (PngjBadSignature3 == null) {
                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) View.resolveSizeAndState(0, 0, 0), Color.blue(0) + 40, 190 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR), 794744863, false, "j", new Class[]{Object.class, Object.class});
                }
                ((Method) PngjBadSignature3).invoke(null, objArr4);
            }
            cArr = cArr3;
        }
        String str2 = new String(cArr);
        int i12 = $10 + 103;
        $11 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    public static void init$0() {
        $$a = new byte[]{115, 31, 111, -79, -25, 12, 2, 45, -26, 2, 38, -42, 20, 35, -46, 26, 3, -6, 1, 16, -1, 6, 26, -6, -4, 21, 27, -18, -25, 12, 2, 42, -46, 26, 3, -6, 1, 16, -1, 6};
        $$b = 160;
    }

    public static void init$1() {
        $$d = new byte[]{85, 38, 73, ByteCompanionObject.MAX_VALUE, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 70, -44, 47, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, -8, 24, 22, -3, 27, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 36, 54, 17, 10, 10, 13, -43, 31, 8, 47, 30, 2, 26, 0, 24, 18, -72, 57, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 38, 59, 1, 8, 14, -10, 46, -27, 59, 1, 8, 14, -16, 42, 20, 17, 2, 26, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0};
        $$e = 146;
    }

    public static void init$2() {
        $$c = new byte[]{18, -90, 23, -81};
        $$f = 183;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (0 <= 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0031, code lost:
    
        if (0 <= 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004f, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a[0])[0]}, new int[1]};
        0 = java.lang.System.identityHashCode(0);
        0 = ~0;
        0 = defpackage.a.c((~(0 | 925329944)) | (~(426440664 | 0)), 865, ((~(0 | 925329944)) * 865) + ((((~((-925329945) | 0)) | 426440664) * (-865)) + 1549361552), -1411907857);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a[1])[0] = 0 ^ (0 << 5);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ERRORS getError() {
        long j;
        int i;
        Object[] objArr = Fpnative.valueOf;
        try {
            if (objArr != null) {
                int i2 = PngjUnsupportedException + 113;
                PngjExceptionInternal = i2 % 128;
                if (i2 % 2 == 0) {
                    long j2 = ((long[]) objArr[0])[1];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, new Object[1])).longValue();
                } else {
                    long j3 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                }
                ((long[]) objArr[0])[0] = j + 4873;
                Fpnative.valueOf = null;
                ERRORS errors = this.PngjOutputException;
                i = PngjExceptionInternal + 45;
                PngjUnsupportedException = i % 128;
                if (i % 2 != 0) {
                    int i3 = 32 / 0;
                }
                return errors;
            }
            Object[] objArr2 = new Object[1];
            a((byte) 97, (byte) ($$d[30] - 1), $$a[113], objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            a((byte) 125, $$a[53], $$a[63], objArr3);
            Object[] objArr4 = (Object[]) cls.getMethod((String) objArr3[0], Integer.TYPE).invoke(null, -1411907857);
            j = ((long[]) objArr4[0])[0];
            ((long[]) objArr4[0])[0] = j + 4873;
            Fpnative.valueOf = objArr4;
            ERRORS errors2 = this.PngjOutputException;
            i = PngjExceptionInternal + 45;
            PngjUnsupportedException = i % 128;
            if (i % 2 != 0) {
            }
            return errors2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    public final Pair<Hand, Finger>[] getErrorFingers() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                PngjExceptionInternal = (PngjUnsupportedException + 3) % 128;
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i = ~((-35324221) | identityHashCode);
                    int c = defpackage.a.c(~((~identityHashCode) | (-35324221)), 476, (i * 952) + ((404785283 | i) * (-476)) + 268696131, -185448578);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4964;
                    Fpnative.valueOf = objArr;
                    return this.PngjInputException;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            a(bArr[50], bArr[1], bArr[113], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a((byte) 79, bArr[55], bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -185448578);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4964;
            Fpnative.valueOf = objArr;
            return this.PngjInputException;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getMessage() {
        Object[] objArr;
        long j;
        Object PngjBadSignature;
        long j2;
        int i = 0;
        Object PngjBadSignature2;
        char c;
        char c2 = 0;
        char c3;
        Object[] objArr2 = null;
        Object PngjBadSignature3;
        Object PngjBadSignature4;
        int i2;
        int i3;
        Object[] objArr3 = Fpnative.valueOf;
        Class cls = Integer.TYPE;
        try {
            try {
                try {
                    if (objArr3 != null) {
                        PngjUnsupportedException = (PngjExceptionInternal + 63) % 128;
                        long j3 = ((long[]) objArr3[0])[0];
                        j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                        if (j3 > j) {
                            objArr = new Object[]{new long[]{((long[]) objArr3[0])[0]}, new int[1]};
                            int identityHashCode = System.identityHashCode(this);
                            int i4 = ~((-486668097) | identityHashCode);
                            int i5 = ~identityHashCode;
                            int c4 = defpackage.a.c((~(identityHashCode | (-12221184))) | (~(486668096 | i5)), 406, ((~((-486638849) | i5)) * (-406)) + (((i4 | (~(498860031 | i5))) * (-406)) - 149192363), 1432688339);
                            int i6 = c4 ^ (c4 << 13);
                            int i7 = i6 ^ (i6 >>> 17);
                            ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
                            PngjUnsupportedException = (PngjExceptionInternal + 89) % 128;
                            ((long[]) objArr[0])[0] = j + 4985;
                            Fpnative.valueOf = objArr;
                            PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(1556686741);
                            if (PngjBadSignature == null) {
                                char blue = (char) Color.blue(0);
                                int scrollBarSize = 37 - (ViewConfiguration.getScrollBarSize() >> 8);
                                int size = 549 - View.MeasureSpec.getSize(0);
                                byte b = $$a[18];
                                byte b2 = (byte) (b - 1);
                                Object[] objArr4 = new Object[1];
                                b(b2, b2, b, objArr4);
                                PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(blue, scrollBarSize, size, -1608103378, false, (String) objArr4[0], null);
                            }
                            j2 = ((Field) PngjBadSignature).getLong(null);
                            if (j2 == -1) {
                                long j4 = j2 + 1987;
                                Object[] objArr5 = new Object[1];
                                c(22 - (ViewConfiguration.getTouchSlop() >> 8), true, "\n\u0002\u0011\u0010\u0016\ufff0ￋ\u0010\fￋ\u0001\u0006\f\u000f\u0001\u000b\ufffe\b\u0000\f\t￠", 17 - (ViewConfiguration.getFadingEdgeLength() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 128, objArr5);
                                Class<?> cls2 = Class.forName((String) objArr5[0]);
                                i = 1556686741;
                                Object[] objArr6 = new Object[1];
                                c(16 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), false, "\u0005\r\u0002\u0006\ufffe\ufffe\u0005\ufffa\t\f\ufffe�￫\ufffe\ufffa", Color.alpha(0) + 5, ImageFormat.getBitsPerPixel(0) + 133, objArr6);
                                if (j4 >= ((Long) cls2.getDeclaredMethod((String) objArr6[0], null).invoke(null, null)).longValue()) {
                                    PngjExceptionInternal = (PngjUnsupportedException + 39) % 128;
                                    Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1434812162);
                                    if (PngjBadSignature5 == null) {
                                        int deadChar = KeyEvent.getDeadChar(0, 0) + 37;
                                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 549;
                                        byte[] bArr = $$a;
                                        byte b3 = bArr[16];
                                        byte b4 = bArr[6];
                                        Object[] objArr7 = new Object[1];
                                        b(b3, b4, (byte) (b4 - 2), objArr7);
                                        PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), deadChar, tapTimeout, 1452666181, false, (String) objArr7[0], null);
                                    }
                                    Object[] objArr8 = (Object[]) ((Field) PngjBadSignature5).get(null);
                                    objArr2 = new Object[]{new int[1], new int[]{0}, new int[]{0}};
                                    int i8 = ((int[]) objArr8[1])[0];
                                    int i9 = ((int[]) objArr8[2])[0];
                                    int identityHashCode2 = System.identityHashCode(this);
                                    int i10 = ~identityHashCode2;
                                    int c5 = defpackage.a.c((~(identityHashCode2 | (-478015029))) | (~(i10 | (-578814411))), 765, (((~((-478015029) | i10)) | 407413796) * 1530) + (((~((-407413797) | i10)) | (~((-70601233) | identityHashCode2)) | (~((-578814411) | identityHashCode2))) * 765) + 1695357220, 713092027);
                                    int i11 = c5 ^ (c5 << 13);
                                    int i12 = i11 ^ (i11 >>> 17);
                                    ((int[]) objArr2[0])[0] = i12 ^ (i12 << 5);
                                    c2 = 2;
                                    Object obj = objArr2[c2];
                                    i2 = ((int[]) obj)[0];
                                    Object obj2 = objArr2[1];
                                    i3 = ((int[]) obj2)[0];
                                    if (i3 == i2) {
                                        Object[] objArr9 = {new int[1], new int[1], new int[1]};
                                        int i13 = ((int[]) objArr2[0])[0];
                                        int i14 = ((int[]) obj2)[0];
                                        int i15 = ((int[]) obj)[0];
                                        ((int[]) objArr9[1])[0] = i14;
                                        ((int[]) objArr9[c2])[0] = i15;
                                        int identityHashCode3 = System.identityHashCode(this);
                                        int i16 = ~((-547427366) | identityHashCode3);
                                        int i17 = ~identityHashCode3;
                                        int c6 = defpackage.a.c((~(identityHashCode3 | (-100942465))) | (~((-547427366) | i17)) | (~((-268446041) | identityHashCode3)), 920, (((~((-815873406) | i17)) | 547427365) * 920) + (((i16 | (~((-100942465) | i17))) * 920) - 1314768398), i13);
                                        int i18 = c6 ^ (c6 << 13);
                                        int i19 = i18 ^ (i18 >>> 17);
                                        ((int[]) objArr9[0])[0] = i19 ^ (i19 << 5);
                                    } else {
                                        Toast.makeText((Context) null, i3 / (((i3 - 1) * i3) % 2), 0).show();
                                        Object[] objArr10 = {new int[1], new int[1], new int[1]};
                                        int i20 = ((int[]) objArr2[0])[0];
                                        int i21 = ((int[]) objArr2[1])[0];
                                        int i22 = ((int[]) objArr2[c2])[0];
                                        ((int[]) objArr10[1])[0] = i21;
                                        ((int[]) objArr10[c2])[0] = i22;
                                        int uptimeMillis = (int) SystemClock.uptimeMillis();
                                        int c7 = defpackage.a.c((~(uptimeMillis | 760023247)) | (~((-704219988) | uptimeMillis)) | 11567888, 407, (((~(704219987 | uptimeMillis)) | (~((~uptimeMillis) | (-760023248))) | 11567888) * 407) + (((67371148 | 0) * (-814)) - 448359599), i20);
                                        int i23 = c7 ^ (c7 << 13);
                                        int i24 = i23 ^ (i23 >>> 17);
                                        ((int[]) objArr10[0])[0] = i24 ^ (i24 << 5);
                                    }
                                    return this.PngjOutputException.toString();
                                }
                            } else {
                                i = 1556686741;
                            }
                            Object[] objArr11 = new Object[1];
                            c(16 - Gravity.getAbsoluteGravity(0, 0), false, "\n\uffff\f\u0005ￌ\ufff1\u0017\u0011\u0012\u0003\u000b\b\uffff\u0014\uffffￌ", 11 - (ViewConfiguration.getJumpTapTimeout() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 127, objArr11);
                            Class<?> cls3 = Class.forName((String) objArr11[0]);
                            Object[] objArr12 = new Object[1];
                            c((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 15, true, "\ufffb￢\u0013\u000e\u0003\u000e\b\uffff\ufffe\u0003\uffff\ufffe\t\uffdd\u0002\r", 9 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 131 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr12);
                            Object[] objArr132 = {Integer.valueOf(0), 713092027};
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1437710995);
                            if (PngjBadSignature2 != null) {
                                char lastIndexOf = (char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 1);
                                int red = Color.red(0) + 37;
                                int green = Color.green(0) + 549;
                                byte[] bArr2 = $$a;
                                c = 18;
                                byte b5 = (byte) (-bArr2[24]);
                                byte b6 = bArr2[18];
                                c2 = 2;
                                c3 = 6;
                                Object[] objArr14 = new Object[1];
                                b(b5, b6, b6, objArr14);
                                PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(lastIndexOf, red, green, -1453402328, false, (String) objArr14[0], new Class[]{cls, cls});
                            } else {
                                c = 18;
                                c2 = 2;
                                c3 = 6;
                            }
                            objArr2 = (Object[]) ((Method) PngjBadSignature2).invoke(null, objArr132);
                            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1434812162);
                            if (PngjBadSignature3 == null) {
                                char keyCodeFromString = (char) KeyEvent.keyCodeFromString(BuildConfig.FLAVOR);
                                int indexOf = TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 37;
                                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 549;
                                byte[] bArr3 = $$a;
                                byte b7 = bArr3[16];
                                byte b8 = bArr3[c3];
                                Object[] objArr15 = new Object[1];
                                b(b7, b8, (byte) (b8 - 2), objArr15);
                                PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(keyCodeFromString, indexOf, scrollBarFadeDuration, 1452666181, false, (String) objArr15[0], null);
                            }
                            ((Field) PngjBadSignature3).set(null, objArr2);
                            Object[] objArr16 = new Object[1];
                            c(22 - (ViewConfiguration.getScrollDefaultDelay() >> 16), true, "\n\u0002\u0011\u0010\u0016\ufff0ￋ\u0010\fￋ\u0001\u0006\f\u000f\u0001\u000b\ufffe\b\u0000\f\t￠", 17 - ExpandableListView.getPackedPositionGroup(0L), 128 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), objArr16);
                            Class<?> cls4 = Class.forName((String) objArr16[0]);
                            Object[] objArr17 = new Object[1];
                            c((KeyEvent.getMaxKeyCode() >> 16) + 15, false, "\u0005\r\u0002\u0006\ufffe\ufffe\u0005\ufffa\t\f\ufffe�￫\ufffe\ufffa", 5 - View.MeasureSpec.getMode(0), View.resolveSizeAndState(0, 0, 0) + 132, objArr17);
                            Long valueOf = Long.valueOf(((Long) cls4.getDeclaredMethod((String) objArr17[0], null).invoke(null, null)).longValue());
                            PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i);
                            if (PngjBadSignature4 == null) {
                                char c8 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                int lastIndexOf2 = 36 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0');
                                int i25 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 550;
                                byte b9 = $$a[c];
                                byte b10 = (byte) (b9 - 1);
                                Object[] objArr18 = new Object[1];
                                b(b10, b10, b9, objArr18);
                                PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c8, lastIndexOf2, i25, -1608103378, false, (String) objArr18[0], null);
                            }
                            ((Field) PngjBadSignature4).set(null, valueOf);
                            Object obj3 = objArr2[c2];
                            i2 = ((int[]) obj3)[0];
                            Object obj22 = objArr2[1];
                            i3 = ((int[]) obj22)[0];
                            if (i3 == i2) {
                            }
                            return this.PngjOutputException.toString();
                        }
                    }
                    Object[] objArr162 = new Object[1];
                    c(22 - (ViewConfiguration.getScrollDefaultDelay() >> 16), true, "\n\u0002\u0011\u0010\u0016\ufff0ￋ\u0010\fￋ\u0001\u0006\f\u000f\u0001\u000b\ufffe\b\u0000\f\t￠", 17 - ExpandableListView.getPackedPositionGroup(0L), 128 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), objArr162);
                    Class<?> cls42 = Class.forName((String) objArr162[0]);
                    Object[] objArr172 = new Object[1];
                    c((KeyEvent.getMaxKeyCode() >> 16) + 15, false, "\u0005\r\u0002\u0006\ufffe\ufffe\u0005\ufffa\t\f\ufffe�￫\ufffe\ufffa", 5 - View.MeasureSpec.getMode(0), View.resolveSizeAndState(0, 0, 0) + 132, objArr172);
                    Long valueOf2 = Long.valueOf(((Long) cls42.getDeclaredMethod((String) objArr172[0], null).invoke(null, null)).longValue());
                    PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i);
                    if (PngjBadSignature4 == null) {
                    }
                    ((Field) PngjBadSignature4).set(null, valueOf2);
                    Object obj32 = objArr2[c2];
                    i2 = ((int[]) obj32)[0];
                    Object obj222 = objArr2[1];
                    i3 = ((int[]) obj222)[0];
                    if (i3 == i2) {
                    }
                    return this.PngjOutputException.toString();
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
                Object[] objArr132 = {Integer.valueOf(0), 713092027};
                PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1437710995);
                if (PngjBadSignature2 != null) {
                }
                objArr2 = (Object[]) ((Method) PngjBadSignature2).invoke(null, objArr132);
                PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1434812162);
                if (PngjBadSignature3 == null) {
                }
                ((Field) PngjBadSignature3).set(null, objArr2);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw new RuntimeException(cause);
                }
                throw new RuntimeException(th);
            }
            byte[] bArr4 = $$d;
            Object[] objArr19 = new Object[1];
            a(bArr4[63], bArr4[62], bArr4[113], objArr19);
            Class<?> cls5 = Class.forName((String) objArr19[0]);
            Object[] objArr20 = new Object[1];
            a(bArr4[57], bArr4[63], bArr4[32], objArr20);
            objArr = (Object[]) cls5.getMethod((String) objArr20[0], cls).invoke(null, 1432688339);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4985;
            Fpnative.valueOf = objArr;
            PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(1556686741);
            if (PngjBadSignature == null) {
            }
            j2 = ((Field) PngjBadSignature).getLong(null);
            if (j2 == -1) {
            }
            Object[] objArr112 = new Object[1];
            c(16 - Gravity.getAbsoluteGravity(0, 0), false, "\n\uffff\f\u0005ￌ\ufff1\u0017\u0011\u0012\u0003\u000b\b\uffff\u0014\uffffￌ", 11 - (ViewConfiguration.getJumpTapTimeout() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 127, objArr112);
            Class<?> cls32 = Class.forName((String) objArr112[0]);
            Object[] objArr122 = new Object[1];
            c((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 15, true, "\ufffb￢\u0013\u000e\u0003\u000e\b\uffff\ufffe\u0003\uffff\ufffe\t\uffdd\u0002\r", 9 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 131 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr122);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw new RuntimeException(cause2);
            }
            throw new RuntimeException(th2);
        }
        return null;
    }

    public IdentyError(ERRORS errors, Pair[] pairArr, Action action, int i, WSQCompression wSQCompression, IdentyEncrytion identyEncrytion, String str, IdentyCustomEncryption identyCustomEncryption, Activity activity, Map map) {
        super(action, i, wSQCompression, identyEncrytion, str, identyCustomEncryption, activity, map, null);
        this.PngjOutputException = errors;
        this.PngjInputException = pairArr;
    }
}
