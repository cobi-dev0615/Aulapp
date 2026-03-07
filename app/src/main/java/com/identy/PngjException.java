package com.identy;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.identy.isFoundMatchingTemplates;
import com.karumi.dexter.BuildConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes2.dex */
public final class PngjException implements SensorEventListener {
    private static  byte[] $$a = null;
    private static  int $$b = 0;
    private static  byte[] $$c = null;
    private static  int $$d = 0;
    private static int $10;
    private static int $11;
    private static int PngjInputException;
    private static int PngjOutputException;
    private static int PngjUnsupportedException;
    final SensorManager PngjBadCrcException;
    final Sensor PngjBadSignature;
    long PngjException;
    boolean valueOf;
    List values = new ArrayList();

    private static String $$e(short s, short s2, byte b) {
        int i = 4 - (b * 4);
        int i2 = s * 2;
        byte[] bArr = $$c;
        int i3 = (s2 * 3) + 104;
        byte[] bArr2 = new byte[i2 + 1];
        int i4 = -1;
        if (bArr == null) {
            i++;
            i3 += i;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i3;
            if (i4 == i2) {
                return new String(bArr2, 0);
            }
            byte b2 = bArr[i];
            i++;
            i3 += b2;
        }
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        PngjInputException = 0;
        PngjUnsupportedException = 1;
        PngjOutputException = 97773872;
    }

    public PngjException(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.PngjBadCrcException = sensorManager;
        this.PngjBadSignature = sensorManager.getDefaultSensor(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, int i, short s, Object[] objArr) {
        int i2;
        int i3 = 80 - (s * 3);
        byte[] bArr = $$a;
        int i4 = 21 - (b * 18);
        int i5 = (i * 6) + 13;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i6 = i5;
            i2 = 0;
            i3 = i3 + (-i6) + 5;
            i4++;
            bArr2[i2] = (byte) i3;
            i2++;
            if (i2 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i6 = bArr[i4];
            i3 = i3 + (-i6) + 5;
            i4++;
            bArr2[i2] = (byte) i3;
            i2++;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            i4++;
            bArr2[i2] = (byte) i3;
            i2++;
            if (i2 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, boolean z, String str, int i2, int i3, Object[] objArr) {
        char[] cArr;
        int i4;
        Throwable cause;
        int i5;
        char c;
        int i6;
        int i7 = ($10 + 63) % 128;
        $11 = i7;
        if (str != null) {
            int i8 = i7 + 123;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.d.e.Action action = new com.d.e.Action();
        char[] cArr3 = new char[i];
        int i9 = 0;
        action.valueOf = 0;
        while (true) {
            int i10 = action.valueOf;
            if (i10 >= i) {
                break;
            }
            $10 = ($11 + 59) % 128;
            char c2 = cArr2[i10];
            action.values = c2;
            char c3 = (char) (i3 + c2);
            cArr3[i10] = c3;
            try {
                Object[] objArr2 = new Object[2];
                objArr2[1] = Integer.valueOf(PngjOutputException);
                objArr2[i9] = Integer.valueOf(c3);
                Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(610361420);
                if (PngjBadSignature == null) {
                    char lastIndexOf = (char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 1);
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 28;
                    i6 = -743328348;
                    int i11 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1531;
                    c = 1;
                    byte b = (byte) i9;
                    i5 = i9;
                    byte b2 = b;
                    String $$e = $$e(b, b2, b2);
                    Class cls = Integer.TYPE;
                    PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(lastIndexOf, longPressTimeout, i11, -661778953, false, $$e, new Class[]{cls, cls});
                } else {
                    i5 = i9;
                    c = 1;
                    i6 = -743328348;
                }
                cArr3[i10] = ((Character) ((Method) PngjBadSignature).invoke(null, objArr2)).charValue();
                Object[] objArr3 = new Object[2];
                objArr3[c] = action;
                objArr3[i5] = action;
                Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i6);
                if (PngjBadSignature2 == null) {
                    int i12 = i5;
                    PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 1), 40 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 190 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, i12, i12), 794744863, false, "j", new Class[]{Object.class, Object.class});
                }
                ((Method) PngjBadSignature2).invoke(null, objArr3);
                i9 = 0;
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(th);
            }
            throw new RuntimeException(cause);
        }
        if (i2 > 0) {
            action.PngjException = i2;
            char[] cArr4 = new char[i];
            i4 = 0;
            System.arraycopy(cArr3, 0, cArr4, 0, i);
            int i13 = action.PngjException;
            System.arraycopy(cArr4, 0, cArr3, i - i13, i13);
            int i14 = action.PngjException;
            System.arraycopy(cArr4, i14, cArr3, 0, i - i14);
        } else {
            i4 = 0;
        }
        if (z) {
            char[] cArr5 = new char[i];
            action.valueOf = i4;
            while (true) {
                int i15 = action.valueOf;
                if (i15 >= i) {
                    break;
                }
                cArr5[i15] = cArr3[(i - i15) - 1];
                Object[] objArr4 = {action, action};
                Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-743328348);
                if (PngjBadSignature3 == null) {
                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Drawable.resolveOpacity(0, 0) + 40, 190 - Color.green(0), 794744863, false, "j", new Class[]{Object.class, Object.class});
                }
                ((Method) PngjBadSignature3).invoke(null, objArr4);
            }
            cArr3 = cArr5;
        }
        objArr[0] = new String(cArr3);
    }

    public static void init$0() {
        $$a = new byte[]{70, 91, ByteCompanionObject.MAX_VALUE, -16, -25, 12, 2, 45, -26, 2, 38, -42, 20, 35, -46, 26, 3, -6, 1, 16, -1, 6, -25, 12, 2, 42, -46, 26, 3, -6, 1, 16, -1, 6};
        $$b = 119;
    }

    public static void init$1() {
        $$c = new byte[]{14, 74, -24, 5};
        $$d = 242;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        PngjInputException = (PngjUnsupportedException + 113) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0479  */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onSensorChanged(SensorEvent sensorEvent) {
        long j;
        int i;
        int i2;
        char c;
        char c2;
        int intValue;
        Object[] PngjBadCrcException$1eba2e16;
        int i3;
        int i4;
        PngjUnsupportedException = (PngjInputException + 35) % 128;
        if (this.PngjException != 0) {
            float[] fArr = sensorEvent.values;
            double d = fArr[0];
            double d2 = fArr[1];
            Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
            if (PngjBadSignature == null) {
                char keyCodeFromString = (char) (14830 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR));
                int tapTimeout = 28 - (ViewConfiguration.getTapTimeout() >> 16);
                j = 0;
                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 721;
                byte b = $$a[18];
                i = 864471691;
                byte b2 = b;
                c = 18;
                i2 = 6;
                Object[] objArr = new Object[1];
                a(b, b2, (byte) (b2 - 1), objArr);
                PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(keyCodeFromString, tapTimeout, threadPriority, -815159504, false, (String) objArr[0], null);
            } else {
                j = 0;
                i = 864471691;
                i2 = 6;
                c = 18;
            }
            long j2 = ((Field) PngjBadSignature).getLong(null);
            try {
                try {
                    if (j2 != -1) {
                        long j3 = j2 + 1996;
                        c2 = 3;
                        Object[] objArr2 = new Object[1];
                        b(22 - Color.argb(0, 0, 0, 0), false, "\f\u0006\u0001ￋ\f\u0010ￋ\ufff0\u0016\u0010\u0011\u0002\n￠\t\f\u0000\b\ufffe\u000b\u0001\u000f", 18 - (Process.myPid() >> 22), 157 - Color.alpha(0), objArr2);
                        Class<?> cls = Class.forName((String) objArr2[0]);
                        Object[] objArr3 = new Object[1];
                        b(15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), false, "\ufffa\u0005\r\u0002\u0006\ufffe\ufffe\u0005\ufffa\t\f\ufffe�￫\ufffe", 5 - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 161, objArr3);
                        if (j3 >= ((Long) cls.getDeclaredMethod((String) objArr3[0], null).invoke(null, null)).longValue()) {
                            PngjUnsupportedException = (PngjInputException + 95) % 128;
                            Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                            if (PngjBadSignature2 == null) {
                                char resolveSizeAndState = (char) (14830 - View.resolveSizeAndState(0, 0, 0));
                                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 28;
                                int i5 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 720;
                                byte b3 = (byte) ($$a[c] - 1);
                                byte b4 = b3;
                                Object[] objArr4 = new Object[1];
                                a(b3, b4, b4, objArr4);
                                PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(resolveSizeAndState, fadingEdgeLength, i5, -779023007, false, (String) objArr4[0], null);
                            }
                            Object[] objArr5 = (Object[]) ((Field) PngjBadSignature2).get(null);
                            PngjBadCrcException$1eba2e16 = new Object[]{new int[]{0}, new int[1], 0, new int[]{0}};
                            int i6 = ((int[]) objArr5[3])[0];
                            int i7 = ((int[]) objArr5[0])[0];
                            String[] strArr = (String[]) objArr5[2];
                            int identityHashCode = System.identityHashCode(this);
                            int c3 = defpackage.a.c((~((~identityHashCode) | (-556277890))) | 268572712, 576, (((~((-661135576) | identityHashCode)) | 104857686) * 576) + 2125019669, 265984511);
                            int i8 = c3 ^ (c3 << 13);
                            int i9 = i8 ^ (i8 >>> 17);
                            ((int[]) PngjBadCrcException$1eba2e16[1])[0] = i9 ^ (i9 << 5);
                            i4 = 0;
                            if (((int[]) PngjBadCrcException$1eba2e16[c2])[i4] == ((int[]) PngjBadCrcException$1eba2e16[i4])[i4]) {
                                ArrayList arrayList = new ArrayList();
                                String[] strArr2 = (String[]) PngjBadCrcException$1eba2e16[2];
                                if (strArr2 != null) {
                                    for (int i10 = i4; i10 < strArr2.length; i10++) {
                                        PngjUnsupportedException = (PngjInputException + 63) % 128;
                                        arrayList.add(strArr2[i10]);
                                    }
                                }
                                throw null;
                            }
                            Object[] objArr6 = new Object[4];
                            int[] iArr = new int[1];
                            objArr6[i4] = iArr;
                            objArr6[1] = new int[1];
                            int[] iArr2 = new int[1];
                            objArr6[c2] = iArr2;
                            int i11 = ((int[]) PngjBadCrcException$1eba2e16[1])[i4];
                            int i12 = ((int[]) PngjBadCrcException$1eba2e16[c2])[i4];
                            int i13 = ((int[]) PngjBadCrcException$1eba2e16[i4])[i4];
                            String[] strArr3 = (String[]) PngjBadCrcException$1eba2e16[2];
                            iArr2[i4] = i12;
                            iArr[i4] = i13;
                            objArr6[2] = strArr3;
                            int identityHashCode2 = System.identityHashCode(this);
                            int c4 = defpackage.a.c((~(identityHashCode2 | (-531260646))) | 497697888, 116, ((503305328 | identityHashCode2) * 116) + ((~((~identityHashCode2) | 536868085)) * (-116)) + 1283997393, i11);
                            int i14 = c4 ^ (c4 << 13);
                            int i15 = i14 ^ (i14 >>> 17);
                            ((int[]) objArr6[1])[0] = i15 ^ (i15 << 5);
                            double d3 = fArr[2];
                            List list = this.values;
                            Double valueOf = Double.valueOf(d);
                            Double valueOf2 = Double.valueOf(d2);
                            Double valueOf3 = Double.valueOf(d3);
                            Integer valueOf4 = Integer.valueOf(sensorEvent.accuracy);
                            Long valueOf5 = Long.valueOf(sensorEvent.timestamp);
                            Long valueOf6 = Long.valueOf(((sensorEvent.timestamp - SystemClock.elapsedRealtimeNanos()) / 1000000) + System.currentTimeMillis());
                            Object[] objArr7 = new Object[i2];
                            objArr7[0] = valueOf;
                            objArr7[1] = valueOf2;
                            objArr7[2] = valueOf3;
                            objArr7[c2] = valueOf4;
                            objArr7[4] = valueOf5;
                            int i16 = ((int[]) objArr6[1])[0];
                            int i17 = ((i16 * i16) - (~(-(2021392998 * i16)))) - 1;
                            int i18 = -(i16 * 601484578);
                            int i19 = (i17 & i18) + (i18 | i17);
                            int i20 = (i19 & (-1407463920)) + ((-1407463920) | i19);
                            int i21 = i20 >> 24;
                            int i22 = ((i21 ^ (-511)) + ((i21 & (-511)) << 1)) / 256;
                            int i23 = (i22 & 1) + (i22 | 1);
                            int i24 = -(IdentyB.e(i20 >> 27, 63, 32, -1) ^ ((i20 & i23) + (i23 | i20)));
                            int i25 = ((i24 | 7) << 1) - (i24 ^ 7);
                            int i26 = ((i25 >> 16) - 131071) / 65536;
                            int i27 = (i26 ^ 1) + ((i26 & 1) << 1);
                            objArr7[30135 / (((-((i27 ^ 1) + ((i27 & 1) << 1))) & i25) * 861)] = valueOf6;
                            list.add(objArr7);
                        }
                    } else {
                        c2 = 3;
                    }
                    int i28 = i3;
                    Object[] objArr8 = new Object[1];
                    b(22 - (ViewConfiguration.getEdgeSlop() >> 16), false, "\f\u0006\u0001ￋ\f\u0010ￋ\ufff0\u0016\u0010\u0011\u0002\n￠\t\f\u0000\b\ufffe\u000b\u0001\u000f", 18 - View.MeasureSpec.makeMeasureSpec(i28, i28), 157 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    b(15 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), false, "\ufffa\u0005\r\u0002\u0006\ufffe\ufffe\u0005\ufffa\t\f\ufffe�￫\ufffe", 6 - Color.alpha(0), 160 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0), objArr9);
                    Long valueOf7 = Long.valueOf(((Long) cls2.getDeclaredMethod((String) objArr9[0], null).invoke(null, null)).longValue());
                    Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i);
                    if (PngjBadSignature3 == null) {
                        char alpha = (char) (14830 - Color.alpha(0));
                        int indexOf = 27 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0);
                        int i29 = (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 720;
                        byte b5 = $$a[c];
                        byte b6 = b5;
                        Object[] objArr10 = new Object[1];
                        a(b5, b6, (byte) (b6 - 1), objArr10);
                        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(alpha, indexOf, i29, -815159504, false, (String) objArr10[0], null);
                    }
                    ((Field) PngjBadSignature3).set(null, valueOf7);
                    i4 = 0;
                    if (((int[]) PngjBadCrcException$1eba2e16[c2])[i4] == ((int[]) PngjBadCrcException$1eba2e16[i4])[i4]) {
                    }
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
                Object[] objArr11 = {9300772};
                Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1439412966);
                if (PngjBadSignature4 == null) {
                    PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), (ViewConfiguration.getTapTimeout() >> 16) + 24, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 697, 1457201313, false, null, new Class[]{Integer.TYPE});
                }
                PngjBadCrcException$1eba2e16 = isFoundMatchingTemplates.PngjBadSignature.PngjBadCrcException$1eba2e16(intValue, ((Constructor) PngjBadSignature4).newInstance(objArr11), -2500481);
                Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                if (PngjBadSignature5 == null) {
                    char indexOf2 = (char) (14830 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR));
                    int mirror = 'L' - AndroidCharacter.getMirror('0');
                    int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 721;
                    byte b7 = (byte) ($$a[c] - 1);
                    byte b8 = b7;
                    i3 = 0;
                    Object[] objArr12 = new Object[1];
                    a(b7, b8, b8, objArr12);
                    PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf2, mirror, touchSlop, -779023007, false, (String) objArr12[0], null);
                } else {
                    i3 = 0;
                }
                ((Field) PngjBadSignature5).set(null, PngjBadCrcException$1eba2e16);
            } catch (Throwable th) {
                Throwable cause = th.getCause();

                if (cause == null) {

                    throw new RuntimeException(th);

                }

                throw new RuntimeException(cause);
            }
            Object[] objArr13 = new Object[1];
            b(16 - ExpandableListView.getPackedPositionType(j), true, "\u0005\f\uffff\nￌ\uffff\u0014\uffff\b\u000b\u0003\u0012\u0011\u0017\ufff1ￌ", 9 - (ViewConfiguration.getPressedStateDuration() >> 16), 155 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0'), objArr13);
            Class<?> cls3 = Class.forName((String) objArr13[0]);
            Object[] objArr14 = new Object[1];
            b(16 - Color.green(0), true, "\ufffb￢\u0013\u000e\u0003\u000e\b\uffff\ufffe\u0003\uffff\ufffe\t\uffdd\u0002\r", (ViewConfiguration.getTapTimeout() >> 16) + 10, 159 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0), objArr14);
            intValue = ((Integer) cls3.getMethod((String) objArr14[0], Object.class).invoke(null, this)).intValue();
        }
        this.PngjException = sensorEvent.timestamp;
        PngjInputException = (PngjUnsupportedException + 77) % 128;
    }
}
