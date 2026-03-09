package com.identy;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ExpandableListView;
import com.identy.enums.Finger;
import com.identy.enums.FingerDetectionMode;
import com.identy.enums.Hand;
import com.karumi.dexter.BuildConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.UInt;

/* loaded from: classes2.dex */
public class CaptureFingersActivity extends FingerActivity {
    private static  byte[] $$a = null;
    private static  int $$b = 0;
    private static  byte[] $$c = null;
    private static  int $$f = 0;
    private static int $10;
    private static int $11;
    private static long PngjBadCrcException;
    private static final byte[] getFingerPrintQualityScore = null;
    private static final int getScore = 0;
    private static int valueOf;
    private static int values;

    public class PngjBadCrcException implements Runnable {
        public static int PngjBadCrcException;
        public static int PngjBadSignature;
        private /* synthetic */ HashMap PngjException;
        private /* synthetic */ HashMap valueOf;

        public PngjBadCrcException(HashMap hashMap, HashMap hashMap2) {
            this.PngjException = hashMap;
            this.valueOf = hashMap2;
        }

        public static int valueOf() {
            int i = PngjBadCrcException;
            int i2 = i % 9069813;
            PngjBadCrcException = i + 1;
            if (i2 != 0) {
                return PngjBadSignature;
            }
            int elapsedRealtime = (int) SystemClock.elapsedRealtime();
            PngjBadSignature = elapsedRealtime;
            return elapsedRealtime;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (FingerActivity.PngjPrematureEnding) {
                CaptureFingersActivity captureFingersActivity = CaptureFingersActivity.this;
                CaptureFingersActivity captureFingersActivity2 = CaptureFingersActivity.this;
                captureFingersActivity.getPadSub1 = new com.identy.ui.c.PngjBadSignature(captureFingersActivity2, this.PngjException, this.valueOf, captureFingersActivity2.getQualityScore);
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.copyFrom(CaptureFingersActivity.this.getPadSub1.getWindow().getAttributes());
                ((ViewGroup.LayoutParams) layoutParams).width = -1;
                CaptureFingersActivity.this.getPadSub1.show();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$i(int i, byte b, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = b + 4;
        int i7 = i2 * 2;
        int i8 = 107 - (i * 3);
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[1 - i7];
        int i9 = 0 - i7;
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i10 = 0;
            int i11 = i6;
            int i12 = i8 + i11;
            int i13 = i6;
            i3 = i12;
            i4 = i13;
            bArr = bArr3;
            i5 = i10;
            bArr2[i5] = (byte) i3;
            i10 = i5 + 1;
            if (i5 == i9) {
                return new String(bArr2, 0);
            }
            int i14 = i4 + 1;
            int i15 = i3;
            i6 = i14;
            i8 = bArr[i14];
            bArr3 = bArr;
            i11 = i15;
            int i122 = i8 + i11;
            int i132 = i6;
            i3 = i122;
            i4 = i132;
            bArr = bArr3;
            i5 = i10;
            bArr2[i5] = (byte) i3;
            i10 = i5 + 1;
            if (i5 == i9) {
            }
        } else {
            i3 = i8;
            i4 = i6;
            i5 = 0;
            bArr2[i5] = (byte) i3;
            i10 = i5 + 1;
            if (i5 == i9) {
            }
        }
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        PngjException();
        values = 0;
        valueOf = 1;
        PngjBadCrcException = 3375942651859884772L;
    }

    private static void b(byte b, int i, short s, Object[] objArr) {
        int i2 = i + 4;
        int i3 = b + 44;
        byte[] bArr = getFingerPrintQualityScore;
        byte[] bArr2 = new byte[s + 1];
        int i4 = -1;
        if (bArr == null) {
            i3 = (s + (-i3)) - 2;
            i2++;
            bArr = bArr;
            i4 = -1;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i3;
            if (i5 == s) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3 = (i3 + (-bArr[i2])) - 2;
            i2++;
            bArr = bArr;
            i4 = i5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, byte b2, short s, Object[] objArr) {
        int i;
        int i2 = 80 - (b * 4);
        byte[] bArr = $$a;
        int i3 = 21 - (b2 * 18);
        int i4 = s * 6;
        byte[] bArr2 = new byte[i4 + 13];
        int i5 = i4 + 12;
        if (bArr == null) {
            i2 = i5;
            byte[] bArr3 = bArr;
            int i6 = 0;
            int i7 = i3;
            i2 = i2 + i3 + 5;
            i3 = i7;
            bArr = bArr3;
            i = i6;
            bArr2[i] = (byte) i2;
            int i8 = i3 + 1;
            if (i == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b3 = bArr[i8];
            byte[] bArr4 = bArr;
            i7 = i8;
            i3 = b3;
            i6 = i + 1;
            bArr3 = bArr4;
            i2 = i2 + i3 + 5;
            i3 = i7;
            bArr = bArr3;
            i = i6;
            bArr2[i] = (byte) i2;
            int i82 = i3 + 1;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            int i822 = i3 + 1;
            if (i == i5) {
            }
        }
    }

    private static void d(String str, int i, Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $11 = ($10 + 59) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = null;
        }
        com.d.e.ComDeA aVar = new com.d.e.ComDeA();
        char[] values2 = com.d.e.ComDeA.values(PngjBadCrcException ^ 8332534422373704609L, cArr, i);
        aVar.PngjBadSignature = 4;
        while (true) {
            int i2 = aVar.PngjBadSignature;
            if (i2 >= values2.length) {
                objArr[0] = new String(values2, 4, values2.length - 4);
                return;
            }
            $11 = ($10 + 105) % 128;
            int i3 = i2 - 4;
            aVar.PngjBadCrcException = i3;
            try {
                Object[] objArr2 = {Long.valueOf(values2[i2] ^ values2[i2 % 4]), Long.valueOf(i3), Long.valueOf(PngjBadCrcException)};
                Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1668670198);
                if (PngjBadSignature == null) {
                    char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                    int alpha = Color.alpha(0) + 29;
                    int modifierMetaStateMask = (-1) - ((byte) KeyEvent.getModifierMetaStateMask());
                    Class cls = Long.TYPE;
                    PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(deadChar, alpha, modifierMetaStateMask, 1617260721, false, "o", new Class[]{cls, cls, cls});
                }
                values2[i2] = ((Character) ((Method) PngjBadSignature).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {aVar, aVar};
                Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1405973094);
                if (PngjBadSignature2 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 14830), 27 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0'), (-16776495) - Color.rgb(0, 0, 0), -1356718115, false, $$i(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) PngjBadSignature2).invoke(null, objArr3);
                $11 = ($10 + 121) % 128;
            } catch (Throwable th) {
                Throwable cause = th.getCause();

                if (cause == null) {

                    throw new RuntimeException(th);

                }

                throw new RuntimeException(cause);
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{36, 13, -101, 57, 25, -12, -2, -45, 26, -2, -38, 42, -20, -35, 46, -26, -3, 6, -1, -16, 1, -6, 25, -12, -2, -42, 46, -26, -3, 6, -1, -16, 1, -6};
        $$b = 146;
    }

    public static void init$1() {
        $$c = new byte[]{47, 41, -12, 122};
        $$f = 210;
    }

    @Override // com.identy.FingerActivity, com.identy.d.PngjBadSignature
    public void PngjException(HashMap<Pair<Hand, Finger>, com.identy.IdentyA> hashMap, HashMap<Pair<Hand, Finger>, com.identy.IdentyA> hashMap2, Bitmap bitmap, boolean z, boolean z2) {
        valueOf = (values + 61) % 128;
        super.PngjException(hashMap, hashMap2, bitmap, z, z2);
        if (!z) {
            int i = values + 37;
            valueOf = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
            return;
        }
        if (this.getAsHighestSecurityLevelReached) {
            try {
                com.identy.e1.values(new Object[]{this.onErrorResponse}, com.identy.i.PngjPrematureEnding.values(), com.identy.i.PngjPrematureEnding.values(), -431637600, com.identy.i.PngjPrematureEnding.values(), 431637601, com.identy.i.PngjPrematureEnding.values());
                IdentySdk identySdk = IdentySdk.getInstance();
                FingerDetectionMode fingerDetectionMode = this.PngjExceptionInternal;
                com.identy.e1 e1Var = this.onErrorResponse;
                long j = e1Var.toString;
                long j2 = e1Var.Enroll2IndexActivity;
                int i2 = e1Var.getEncryptedTemplates;
                byte[] PngjPrematureEnding = e1Var.PngjPrematureEnding();
                com.identy.e1 e1Var2 = this.onErrorResponse;
                identySdk.a(fingerDetectionMode, hashMap, j, j2, 0L, i2, PngjPrematureEnding, e1Var2.setFoundMatchingTemplates + e1Var2.Enroll2IndexActivity, e1Var2.closeDialog, e1Var2.getHeight, e1Var2.ERRORS);
            } catch (Exception unused) {
            }
            try {
                if (IdentySdk.getInstance().isDisplayPrints()) {
                    runOnUiThread(new PngjBadCrcException(hashMap, hashMap2));
                    return;
                }
                if (!IdentySdk.getInstance().v()) {
                    if (IdentySdk.getInstance().isDisplayMoveNextDialog()) {
                        Attempt();
                        return;
                    } else {
                        Action();
                        return;
                    }
                }
                com.identy.ui.c.PngjUnsupportedException pngjUnsupportedException = new com.identy.ui.c.PngjUnsupportedException(this, this.getQualityScore, this.PngjExceptionInternal, (FingerDetectionMode) FingerActivity.PngjException(com.identy.a.PngjException.values(), -388390624, new Object[]{this}, com.identy.a.PngjException.values(), 388390631, com.identy.a.PngjException.values(), com.identy.a.PngjException.values()));
                this.getPadSub1 = pngjUnsupportedException;
                try {
                    byte[] bArr = getFingerPrintQualityScore;
                    Object[] objArr = new Object[1];
                    b((byte) (-bArr[340]), (short) 344, (short) (-bArr[356]), objArr);
                    Class<?> cls = Class.forName((String) objArr[0]);
                    Object[] objArr2 = new Object[1];
                    b((byte) 71, (short) 361, bArr[5], objArr2);
                    cls.getMethod((String) objArr2[0], null).invoke(pngjUnsupportedException, null);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();

                    if (cause == null) {

                        throw new RuntimeException(th);

                    }

                    throw new RuntimeException(cause);
                }
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0324  */
    @Override // com.identy.FingerActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void attachBaseContext(Context context) {
        int i;
        char c;
        int intValue;
        Object[] PngjBadSignature$52c725b;
        long j;
        super.attachBaseContext(context);
        Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
        if (PngjBadSignature == null) {
            char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 14830);
            int capsMode = TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 28;
            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 721;
            byte b = $$a[20];
            byte b2 = (byte) (b - 1);
            byte b3 = b;
            Object[] objArr = new Object[1];
            c(b2, b3, b3, objArr);
            PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(scrollBarSize, capsMode, jumpTapTimeout, -815159504, false, (String) objArr[0], null);
        }
        long j2 = ((Field) PngjBadSignature).getLong(null);
        try {
            try {
                if (j2 != -1) {
                    valueOf = (values + 39) % 128;
                    long j3 = j2 + 4611686018427387806L;
                    i = 864471691;
                    Object[] objArr2 = new Object[1];
                    d("~\u001f껒ퟹ뿎祠䴠\ue505ዝ\uf0e2髚䈐쨹\uedcc\uf1bc❹꼻蘠\uec92\u09b3鑃ꌄ쮖ክ祹尐", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr2);
                    Class<?> cls = Class.forName((String) objArr2[0]);
                    c = 20;
                    Object[] objArr3 = new Object[1];
                    d("\ued90\uedf5\u1cff旖ꮛũ奰ࣷ櫖䋃躊㩧⟝忳\ue5ae录䋅㐓\uf8d3", -TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0), objArr3);
                    if (j3 >= ((Long) cls.getDeclaredMethod((String) objArr3[0], null).invoke(null, null)).longValue()) {
                        valueOf = (values + 81) % 128;
                        Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                        if (PngjBadSignature2 == null) {
                            char indexOf = (char) (14830 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0));
                            int green = 28 - Color.green(0);
                            int keyCodeFromString = 721 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR);
                            byte b4 = (byte) ($$a[20] - 1);
                            byte b5 = b4;
                            Object[] objArr4 = new Object[1];
                            c(b4, b5, b5, objArr4);
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf, green, keyCodeFromString, -779023007, false, (String) objArr4[0], null);
                        }
                        Object[] objArr5 = (Object[]) ((Field) PngjBadSignature2).get(null);
                        PngjBadSignature$52c725b = new Object[]{new int[]{0}, new int[1], 0, new int[]{0}};
                        int i2 = ((int[]) objArr5[3])[0];
                        int i3 = ((int[]) objArr5[0])[0];
                        String[] strArr = (String[]) objArr5[2];
                        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                        int i4 = ~((-499710655) | startElapsedRealtime);
                        int i5 = ~startElapsedRealtime;
                        int i6 = i4 | (~(534855319 | i5));
                        int i7 = ~(499710654 | i5);
                        int c2 = defpackage.a.c(35718145 | i7, 516, (((~(startElapsedRealtime | (-499137175))) | (~(i5 | (-35718146)))) * 516) + ((i6 | i7) * (-516)) + 79788017, 860218383);
                        int i8 = c2 ^ (c2 << 13);
                        int i9 = i8 ^ (i8 >>> 17);
                        ((int[]) PngjBadSignature$52c725b[1])[0] = i9 ^ (i9 << 5);
                        if (((int[]) PngjBadSignature$52c725b[3])[0] != ((int[]) PngjBadSignature$52c725b[0])[0]) {
                            Object[] objArr6 = {new int[]{0}, new int[1], 0, new int[]{0}};
                            int i10 = ((int[]) PngjBadSignature$52c725b[1])[0];
                            int i11 = ((int[]) PngjBadSignature$52c725b[3])[0];
                            int i12 = ((int[]) PngjBadSignature$52c725b[0])[0];
                            String[] strArr2 = (String[]) PngjBadSignature$52c725b[2];
                            int identityHashCode = System.identityHashCode(this);
                            int c3 = defpackage.a.c((~(identityHashCode | (-539329626))) | 495236348, 376, (((~((~identityHashCode) | 539329625)) | (-1034269950)) * (-376)) + ((((-1033973926) | identityHashCode) * 376) - 1415183235), i10);
                            int i13 = c3 ^ (c3 << 13);
                            int i14 = i13 ^ (i13 >>> 17);
                            ((int[]) objArr6[1])[0] = i14 ^ (i14 << 5);
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        String[] strArr3 = (String[]) PngjBadSignature$52c725b[2];
                        if (strArr3 == null) {
                            throw null;
                        }
                        int i15 = values + 75;
                        valueOf = i15 % 128;
                        for (int i16 = i15 % 2 != 0 ? 0 : 1; i16 < strArr3.length; i16++) {
                            arrayList.add(strArr3[i16]);
                        }
                        throw null;
                    }
                } else {
                    i = 864471691;
                    c = 20;
                }
                Object[] objArr7 = new Object[1];
                d("~\u001f껒ퟹ뿎祠䴠\ue505ዝ\uf0e2髚䈐쨹\uedcc\uf1bc❹꼻蘠\uec92\u09b3鑃ꌄ쮖ክ祹尐", -TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0'), objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                Object[] objArr8 = new Object[1];
                d("\ued90\uedf5\u1cff旖ꮛũ奰ࣷ櫖䋃躊㩧⟝忳\ue5ae录䋅㐓\uf8d3", 1 - KeyEvent.getDeadChar(0, 0), objArr8);
                Long valueOf2 = Long.valueOf(((Long) cls2.getDeclaredMethod((String) objArr8[0], null).invoke(null, null)).longValue());
                Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i);
                if (PngjBadSignature3 == null) {
                    char c4 = (char) ((SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 14829);
                    int i17 = (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 28;
                    int indexOf2 = 721 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR);
                    byte b6 = $$a[c];
                    byte b7 = (byte) (b6 - 1);
                    byte b8 = b6;
                    Object[] objArr9 = new Object[1];
                    c(b7, b8, b8, objArr9);
                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c4, i17, indexOf2, -815159504, false, (String) objArr9[0], null);
                }
                ((Field) PngjBadSignature3).set(null, valueOf2);
                if (((int[]) PngjBadSignature$52c725b[3])[0] != ((int[]) PngjBadSignature$52c725b[0])[0]) {
                }
            } catch (Exception unused) {
                throw new RuntimeException();
            }
            Object[] objArr10 = {-1211019487};
            Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1439412966);
            if (PngjBadSignature4 == null) {
                PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) View.MeasureSpec.getSize(0), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 25, 697 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), 1457201313, false, null, new Class[]{Integer.TYPE});
            }
            PngjBadSignature$52c725b = arid.PngjInputException.PngjBadSignature$52c725b(intValue, ((Constructor) PngjBadSignature4).newInstance(objArr10));
            Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
            if (PngjBadSignature5 == null) {
                char minimumFlingVelocity = (char) (14830 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 28;
                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 721;
                byte b9 = (byte) ($$a[c] - 1);
                byte b10 = b9;
                j = 0;
                Object[] objArr11 = new Object[1];
                c(b9, b10, b10, objArr11);
                PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(minimumFlingVelocity, keyRepeatDelay, tapTimeout, -779023007, false, (String) objArr11[0], null);
            } else {
                j = 0;
            }
            ((Field) PngjBadSignature5).set(null, PngjBadSignature$52c725b);
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
        Object[] objArr12 = new Object[1];
        d("뤳륙㩣䍇丂ⅿ볾尉䫑摖欁ᩜ獼礠\u001f罟ᙼኖᵝ冷", ExpandableListView.getPackedPositionType(0L) + 1, objArr12);
        Class<?> cls3 = Class.forName((String) objArr12[0]);
        Object[] objArr13 = new Object[1];
        d("灍瀤䉴㭕헄壗✫锭㍶᱄\uf0c1揬먭Ÿ鯪۩\udf32檚蚉⠘", Color.red(0) + 1, objArr13);
        intValue = ((Integer) cls3.getMethod((String) objArr13[0], Object.class).invoke(null, this)).intValue();
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        getScore getscore = new getScore(this, bundle);
        byte[] bArr = getFingerPrintQualityScore;
        int i = 136;
        byte b = bArr[136];
        short s = bArr[132];
        Object[] objArr = new Object[1];
        b(b, s, (short) (s | 117), objArr);
        String str = (String) objArr[0];
        byte b2 = bArr[132];
        byte b3 = b2;
        Object[] objArr2 = new Object[1];
        b(b3, (short) (b3 | 117), b2, objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            int i2 = getScore;
            short s2 = (short) 117;
            char c = 127;
            Object[] objArr4 = new Object[1];
            b((byte) (i2 | 50), s2, (short) (-bArr[127]), objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b((byte) 71, (short) 132, bArr[12], objArr5);
            String str2 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            b((byte) (i2 | 50), s2, (short) (-bArr[127]), objArr6);
            Object[] objArr7 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i3 = 0;
            while (i3 < objArr7.length) {
                Object[] objArr8 = {objArr7[i3]};
                int i4 = getScore;
                short s3 = (short) i;
                byte[] bArr2 = getFingerPrintQualityScore;
                char c2 = c;
                Object[] objArr9 = new Object[1];
                b((byte) (i4 | 50), s3, (short) (-bArr2[350]), objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                Object[] objArr10 = new Object[1];
                b((byte) 74, (short) 152, bArr2[9], objArr10);
                String str3 = (String) objArr10[0];
                Object[] objArr11 = new Object[1];
                b((byte) (i4 | 50), s2, (short) (-bArr2[c2]), objArr11);
                Object invoke = cls2.getMethod(str3, Class.forName((String) objArr11[0])).invoke(null, objArr8);
                Object[] objArr12 = new Object[1];
                b((byte) (i4 | 50), s3, (short) (-bArr2[350]), objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                Object[] objArr13 = new Object[1];
                b((byte) (i4 | 49), (short) (i4 | 146), bArr2[17], objArr13);
                iArr[i3] = ((Integer) cls3.getMethod((String) objArr13[0], null).invoke(invoke, null)).intValue();
                i3++;
                c = c2;
                i = 136;
            }
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                try {
                } catch (Throwable th) {
                    th = th;
                }
                switch (getscore.PngjBadCrcException(iArr[i5])) {
                    case -18:
                        i5 = 34;
                    case -17:
                        i6 = 21;
                        getscore.PngjBadCrcException(21);
                        int i7 = getscore.PngjBadSignature;
                        if (i7 != 51 && i7 == 97) {
                            i5 = 9;
                        }
                        i5 = i6;
                        break;
                    case -16:
                        i5 = 1;
                    case -15:
                        i5 = 33;
                    case -14:
                        getscore.PngjBadCrcException(20);
                        if (getscore.PngjBadSignature == 0) {
                            i6 = 32;
                        }
                        i5 = i6;
                    case -13:
                        getscore.valueOf = 1;
                        getscore.PngjBadCrcException(2);
                        try {
                            getscore.PngjBadCrcException(12);
                            values = getscore.PngjBadSignature;
                            i5 = i6;
                        } catch (Throwable th2) {
                            if (i5 < 22 || i5 >= 24) {
                                throw new RuntimeException(th2);
                            }
                            getscore.PngjPrematureEnding = th;
                            getscore.PngjBadCrcException(24);
                            i5 = 20;
                        }
                        break;
                    case -12:
                        getscore.valueOf = valueOf;
                        getscore.PngjBadCrcException(9);
                        i5 = i6;
                    case -11:
                        getscore.PngjBadCrcException(15);
                        throw ((Throwable) getscore.PngjUnsupportedException);
                        break;
                    case -10:
                        i5 = 35;
                    case -9:
                        i5 = 37;
                    case -8:
                        getscore.PngjBadCrcException(13);
                        if (getscore.PngjBadSignature == 0) {
                            i6 = 19;
                        }
                        i5 = i6;
                    case -7:
                        getscore.valueOf = 1;
                        getscore.PngjBadCrcException(2);
                        getscore.PngjBadCrcException(12);
                        valueOf = getscore.PngjBadSignature;
                        i5 = i6;
                    case -6:
                        getscore.valueOf = values;
                        getscore.PngjBadCrcException(9);
                        i5 = i6;
                    case -5:
                        return;
                    case -4:
                        i5 = 24;
                    case -3:
                        i5 = 11;
                    case -2:
                        getscore.valueOf = 2;
                        getscore.PngjBadCrcException(2);
                        getscore.PngjBadCrcException(3);
                        FingerActivity fingerActivity = (FingerActivity) getscore.PngjUnsupportedException;
                        getscore.PngjBadCrcException(3);
                        super.onCreate((Bundle) getscore.PngjUnsupportedException);
                        i5 = i6;
                    case UInt.MAX_VALUE /* -1 */:
                        i5 = 5;
                    default:
                        i5 = i6;
                }
            }
            throw new RuntimeException(th);
        } catch (Throwable th3) {
            Throwable cause = th3.getCause();

            if (cause == null) {

                throw new RuntimeException(th3);

            }

            throw new RuntimeException(cause);
        }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onPause() {
        int i = values + 49;
        valueOf = i % 128;
        int i2 = i % 2;
        super.onPause();
        if (i2 == 0) {
            throw null;
        }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onResume() {
        values = (valueOf + 13) % 128;
        super.onResume();
        valueOf = (values + 43) % 128;
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onStart() {
        values = (valueOf + 93) % 128;
        super.onStart();
        values = (valueOf + 121) % 128;
    }

    @Override // com.identy.FingerActivity
    public void values(Bundle bundle) {
        getScore getscore = new getScore(this, bundle);
        byte[] bArr = getFingerPrintQualityScore;
        int i = 136;
        byte b = bArr[136];
        short s = (short) (b | 164);
        Object[] objArr = new Object[1];
        b(b, s, (short) (s - 4), objArr);
        String str = (String) objArr[0];
        byte b2 = bArr[132];
        byte b3 = b2;
        Object[] objArr2 = new Object[1];
        b(b3, (short) (b3 | 117), b2, objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            int i2 = getScore;
            short s2 = (short) 117;
            char c = 127;
            Object[] objArr4 = new Object[1];
            b((byte) (i2 | 50), s2, (short) (-bArr[127]), objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b((byte) 71, (short) 132, bArr[12], objArr5);
            String str2 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            b((byte) (i2 | 50), s2, (short) (-bArr[127]), objArr6);
            Object[] objArr7 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i3 = 0;
            while (i3 < objArr7.length) {
                try {
                    Object[] objArr8 = {objArr7[i3]};
                    int i4 = getScore;
                    short s3 = (short) i;
                    byte[] bArr2 = getFingerPrintQualityScore;
                    char c2 = c;
                    Object[] objArr9 = new Object[1];
                    b((byte) (i4 | 50), s3, (short) (-bArr2[350]), objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    b((byte) 74, (short) 152, bArr2[9], objArr10);
                    String str3 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    b((byte) (i4 | 50), s2, (short) (-bArr2[c2]), objArr11);
                    Object invoke = cls2.getMethod(str3, Class.forName((String) objArr11[0])).invoke(null, objArr8);
                    try {
                        Object[] objArr12 = new Object[1];
                        b((byte) (i4 | 50), s3, (short) (-bArr2[350]), objArr12);
                        Class<?> cls3 = Class.forName((String) objArr12[0]);
                        Object[] objArr13 = new Object[1];
                        b((byte) (i4 | 49), (short) (i4 | 146), bArr2[17], objArr13);
                        iArr[i3] = ((Integer) cls3.getMethod((String) objArr13[0], null).invoke(invoke, null)).intValue();
                        i3++;
                        c = c2;
                        i = 136;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();

                        if (cause == null) {

                            throw new RuntimeException(th);

                        }

                        throw new RuntimeException(cause);
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw new RuntimeException(th2);
                    }
                    throw new RuntimeException(cause2);
                }
            }
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                try {
                } catch (Throwable th3) {
                }
                switch (getscore.PngjBadCrcException(iArr[i5])) {
                    case -20:
                        i5 = 48;
                    case -19:
                        getscore.PngjBadCrcException(21);
                        int i7 = getscore.PngjBadSignature;
                        i5 = 43;
                        if (i7 != 0 && i7 == 1) {
                            i6 = 28;
                            i5 = i6;
                        }
                        break;
                    case -18:
                        getscore.PngjBadCrcException(15);
                        throw ((Throwable) getscore.PngjUnsupportedException);
                        break;
                    case -17:
                        i5 = 49;
                    case -16:
                        i5 = 51;
                    case -15:
                        getscore.PngjBadCrcException(13);
                        if (getscore.PngjBadSignature == 0) {
                            i6 = 41;
                        }
                        i5 = i6;
                    case -14:
                        getscore.valueOf = 1;
                        getscore.PngjBadCrcException(2);
                        try {
                            getscore.PngjBadCrcException(12);
                            valueOf = getscore.PngjBadSignature;
                            i5 = i6;
                        } catch (Throwable th4) {
                            int i8 = getScore;
                            short s4 = (short) 326;
                            byte[] bArr3 = getFingerPrintQualityScore;
                            Object[] objArr14 = new Object[1];
                            b((byte) (i8 | 50), s4, (short) (bArr3[123] - 1), objArr14);
                            if (!Class.forName((String) objArr14[0]).isInstance(th4) || i5 < 5 || i5 >= 8) {
                                Object[] objArr15 = new Object[1];
                                b((byte) (i8 | 50), s4, (short) (bArr3[123] - 1), objArr15);
                                if (!Class.forName((String) objArr15[0]).isInstance(th4) || i5 < 9 || i5 >= 10) {
                                    Object[] objArr16 = new Object[1];
                                    b((byte) (i8 | 50), s4, (short) (bArr3[123] - 1), objArr16);
                                    if (!Class.forName((String) objArr16[0]).isInstance(th) || i5 < 11 || i5 >= 13) {
                                        Object[] objArr17 = new Object[1];
                                        b((byte) (i8 | 50), s4, (short) (bArr3[123] - 1), objArr17);
                                        if (!Class.forName((String) objArr17[0]).isInstance(th) || i5 < 14 || i5 >= 15) {
                                            Object[] objArr18 = new Object[1];
                                            b((byte) (i8 | 50), s4, (short) (bArr3[123] - 1), objArr18);
                                            if (!Class.forName((String) objArr18[0]).isInstance(th) || i5 < 16 || i5 >= 22) {
                                                if (i5 < 44 || i5 >= 48) {
                                                    throw new RuntimeException(th);
                                                }
                                                i5 = 42;
                                                getscore.PngjPrematureEnding = th;
                                                getscore.PngjBadCrcException(24);
                                            }
                                        }
                                    }
                                }
                            }
                            i5 = 22;
                            getscore.PngjPrematureEnding = th;
                            getscore.PngjBadCrcException(24);
                        }
                        break;
                    case -13:
                        getscore.valueOf = values;
                        getscore.PngjBadCrcException(9);
                        i5 = i6;
                    case -12:
                        i5 = 1;
                    case -11:
                        return;
                    case -10:
                        i5 = 30;
                    case -9:
                        getscore.valueOf = 2;
                        getscore.PngjBadCrcException(2);
                        getscore.PngjBadCrcException(3);
                        FingerActivity fingerActivity = (FingerActivity) getscore.PngjUnsupportedException;
                        getscore.PngjBadCrcException(3);
                        fingerActivity.onErrorResponse = (e1) getscore.PngjUnsupportedException;
                        i5 = i6;
                    case -8:
                        getscore.valueOf = 6;
                        getscore.PngjBadCrcException(2);
                        getscore.PngjBadCrcException(3);
                        Activity activity = (Activity) getscore.PngjUnsupportedException;
                        getscore.PngjBadCrcException(3);
                        com.identy.d.PngjBadSignature pngjBadSignature = (com.identy.d.PngjBadSignature) getscore.PngjUnsupportedException;
                        getscore.PngjBadCrcException(3);
                        FingerDetectionMode fingerDetectionMode = (FingerDetectionMode) getscore.PngjUnsupportedException;
                        getscore.PngjBadCrcException(3);
                        Finger[] fingerArr = (Finger[]) getscore.PngjUnsupportedException;
                        getscore.PngjBadCrcException(12);
                        boolean z = getscore.PngjBadSignature != 0;
                        getscore.PngjBadCrcException(12);
                        getscore.PngjPrematureEnding = new isAuthSucess(activity, pngjBadSignature, fingerDetectionMode, fingerArr, z, getscore.PngjBadSignature != 0);
                        getscore.PngjBadCrcException(26);
                        i5 = i6;
                    case -7:
                        getscore.valueOf = 1;
                        getscore.PngjBadCrcException(2);
                        getscore.PngjBadCrcException(3);
                        getscore.valueOf = ((FingerActivity) getscore.PngjUnsupportedException).PngjUnsupportedException ? 1 : 0;
                        getscore.PngjBadCrcException(9);
                        i5 = i6;
                    case -6:
                        getscore.valueOf = 1;
                        getscore.PngjBadCrcException(2);
                        getscore.PngjBadCrcException(3);
                        getscore.valueOf = ((IdentySdk) getscore.PngjUnsupportedException).u() ? 1 : 0;
                        getscore.PngjBadCrcException(9);
                        i5 = i6;
                    case -5:
                        getscore.PngjPrematureEnding = IdentySdk.getInstance();
                        getscore.PngjBadCrcException(26);
                        i5 = i6;
                    case -4:
                        getscore.valueOf = 1;
                        getscore.PngjBadCrcException(2);
                        getscore.PngjBadCrcException(3);
                        getscore.PngjPrematureEnding = ((FingerActivity) getscore.PngjUnsupportedException).a;
                        getscore.PngjBadCrcException(26);
                        i5 = i6;
                    case -3:
                        getscore.valueOf = 1;
                        getscore.PngjBadCrcException(2);
                        getscore.PngjBadCrcException(3);
                        getscore.PngjPrematureEnding = ((FingerActivity) getscore.PngjUnsupportedException).PngjExceptionInternal;
                        getscore.PngjBadCrcException(26);
                        i5 = i6;
                    case -2:
                        getscore.valueOf = 2;
                        getscore.PngjBadCrcException(2);
                        getscore.PngjBadCrcException(3);
                        FingerActivity fingerActivity2 = (FingerActivity) getscore.PngjUnsupportedException;
                        getscore.PngjBadCrcException(3);
                        super.values((Bundle) getscore.PngjUnsupportedException);
                        i5 = i6;
                    case UInt.MAX_VALUE /* -1 */:
                        i5 = 24;
                    default:
                        i5 = i6;
                }
            }
        } catch (Throwable th5) {
            Throwable cause3 = th5.getCause();
            if (cause3 == null) {
                throw new RuntimeException(th5);
            }
            throw new RuntimeException(cause3);
        }
    }

    public static void PngjException() {
        getFingerPrintQualityScore = new byte[]{122, 41, -119, -106, -6, 3, -7, 3, -10, 6, -3, -7, 4, -3, -8, 5, -11, 7, -12, 8, -13, 9, -3, -9, 6, -14, 10, -3, -10, 7, -3, -11, 8, -7, -1, 2, -7, -2, 3, -12, 8, -3, -12, 9, -7, -5, 6, -3, -13, 10, -3, -14, 11, -3, -6, -1, 2, -3, -6, -2, 3, -14, 10, -7, -7, 8, -3, -10, 7, -3, -6, -3, 4, -7, -8, 9, -7, -9, 10, -3, -6, -4, 5, -7, -10, 11, -12, 8, -3, -6, -5, 6, -3, -6, -6, 7, -3, -6, -7, 8, -3, -6, -7, 8, -3, -6, -8, 9, -8, -2, 4, -3, -6, -9, 10, -8, -3, 5, -3, -6, -9, 7, -23, 19, 49, -64, 9, -15, 5, 55, -39, -35, 0, 7, -7, 5, 1, 2, 1, -13, 7, -23, 19, 49, -64, 9, -15, 5, 55, -29, -39, -8, 13, -4, 0, -15, 19, -13, -11, 14, 20, -25, -7, -8, 28, -13, -13, -11, 14, -6, 3, -7, 3, -8, -5, 7, -10, 6, -3, -7, 4, -7, 3, -8, -7, 9, -3, -8, 5, -8, -8, 10, -3, -9, 6, -8, -9, 11, -3, -10, 7, -3, -11, 8, -9, 1, 2, -3, -12, 9, -9, 0, 3, -9, -1, 4, -9, -2, 5, -9, -3, 6, -3, -13, 10, -3, -14, 11, -3, -6, -1, 2, -13, 9, -3, -6, -2, 3, -7, -10, 11, -7, -5, 6, -13, 9, -3, -6, -3, 4, -14, 10, -3, -6, -2, 3, -3, -6, -4, 5, -9, -4, 7, -9, -5, 8, -9, -6, 9, -7, -2, 3, -12, 8, -3, -6, -5, 6, -7, -10, 11, -12, 8, -3, -6, -6, 7, -3, -6, -7, 8, -3, -6, -8, 9, -3, -6, -9, 10, -14, 10, -9, -7, 10, -9, -8, 11, -13, 9, -3, -6, -2, 3, -3, -6, -10, 11, -10, 2, 2, -3, -7, 0, 2, -10, 1, 3, -3, -7, 0, 7, -23, 19, 49, -64, 9, -15, 5, 55, -25, -53, 19, -4, -13, -6, 9, -8, -1, -15, 8, -16, 1, 4, 3, 52, -53, -17, -2, 64, -24, -39, 6, -13, -5, 6, 9, -9, -10};
        getScore = 12;
    }
}
