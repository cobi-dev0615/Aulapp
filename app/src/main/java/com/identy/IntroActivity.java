package com.identy;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.CheckBox;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.Toast;
import co.ceduladigital.sdk.x5;
import com.identy.enums.Finger;
import com.identy.enums.FingerDetectionMode;
import com.identy.enums.Hand;
import com.identy.isAuthSucess;
import com.identy.ui.PlayGifView;
import com.karumi.dexter.BuildConfig;
import com.touchlessid.TouchLessIDSDK$values;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class IntroActivity extends Activity {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10;
    private static int $11;
    private static int PngjBadCrcException;
    private static char[] PngjBadSignature;
    private static int PngjException;
    private static char valueOf;

    public class PngjException implements View.OnClickListener {
        private /* synthetic */ boolean PngjBadSignature;
        private /* synthetic */ Hand PngjException;

        public PngjException(boolean z, Hand hand) {
            this.PngjBadSignature = z;
            this.PngjException = hand;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            FingerDetectionMode[] fingerDetectionModeArr = (FingerDetectionMode[]) IntroActivity.this.getIntent().getSerializableExtra("option_selected");
            if (((CheckBox) IntroActivity.this.findViewById(R.id.intro_no_repeat)).isChecked()) {
                GuideNoGuideHelper.markIntroShown(IntroActivity.this, GuideNoGuideHelper.getKey(fingerDetectionModeArr[0], this.PngjBadSignature));
            }
            try {
                if (fingerDetectionModeArr[0].getFinger() == null || !fingerDetectionModeArr[0].getFinger().equals(Finger.THUMB)) {
                    IdentySdk identySdk = IdentySdk.getInstance();
                    identySdk.PngjExceptionInternal.add(this.PngjException);
                } else {
                    IdentySdk identySdk2 = IdentySdk.getInstance();
                    identySdk2.PngjPrematureEnding.add(this.PngjException);
                }
            } catch (Exception unused) {
            }
            try {
                IntroActivity introActivity = IntroActivity.this;
                Intent intent = new Intent(introActivity, (Class<?>) GuideNoGuideHelper.getClassForDetection(introActivity, introActivity.getIntent(), true, fingerDetectionModeArr, IdentySdk.getInstance().isRolledfp()));
                intent.putExtras(IntroActivity.this.getIntent());
                IntroActivity.this.startActivity(intent);
                IntroActivity.this.finish();
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$g(short s, byte b, short s2) {
        int i;
        int i2 = s2 * 2;
        int i3 = 121 - (s * 2);
        byte[] bArr = $$c;
        int i4 = 3 - (b * 2);
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        if (bArr == null) {
            int i6 = i3;
            i3 = i5;
            i = 0;
            i3 += i6;
            i4++;
            bArr2[i] = (byte) i3;
            if (i == i5) {
                return new String(bArr2, 0);
            }
            i6 = bArr[i4];
            i++;
            i3 += i6;
            i4++;
            bArr2[i] = (byte) i3;
            if (i == i5) {
            }
        } else {
            i = 0;
            i4++;
            bArr2[i] = (byte) i3;
            if (i == i5) {
            }
        }
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        PngjBadCrcException = 0;
        PngjException = 1;
        PngjBadSignature = new char[]{300, 288, 269, 299, 304, 303, 305, 312, 313, 314, 310, 319, 315, 318, 706, 266, 375, 267, 301, 711, 705, 309, 704, 710, 316, 282, 280, 308, 317, 307, 297, 707, 311, 306, 298, 273};
        valueOf = (char) 13509;
    }

    private static void a(String str, int i, byte b, java.lang.Object[] objArr) {
        char[] cArr;
        int i2;
        int i3;
        char c;
        char c2;
        char c3;
        int i4;
        if (str != null) {
            $10 = ($11 + 41) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.d.e.PngjInputException pngjInputException = new com.d.e.PngjInputException();
        char[] cArr3 = PngjBadSignature;
        Class cls = Integer.TYPE;
        int i5 = 252968584;
        int i6 = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    java.lang.Object[] objArr2 = {Integer.valueOf(cArr3[i7])};
                    java.lang.Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i5);
                    if (PngjBadSignature2 == null) {
                        char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                        int axisFromString = MotionEvent.axisFromString(BuildConfig.FLAVOR) + 29;
                        int deadChar = 1531 - KeyEvent.getDeadChar(i6, i6);
                        i4 = i5;
                        byte b2 = (byte) i6;
                        byte b3 = b2;
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(maxKeyCode, axisFromString, deadChar, -201551053, false, $$g(b2, b3, b3), new Class[]{cls});
                    } else {
                        i4 = i5;
                    }
                    cArr4[i7] = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr2)).charValue();
                    i7++;
                    i5 = i4;
                    i6 = 0;
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
        int i8 = i5;
        java.lang.Object[] objArr3 = {Integer.valueOf(valueOf)};
        java.lang.Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i8);
        if (PngjBadSignature3 == null) {
            byte b4 = (byte) 0;
            byte b5 = b4;
            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) View.resolveSizeAndState(0, 0, 0), ExpandableListView.getPackedPositionGroup(0L) + 28, 1530 - ImageFormat.getBitsPerPixel(0), -201551053, false, $$g(b4, b5, b5), new Class[]{cls});
        }
        char charValue = ((Character) ((Method) PngjBadSignature3).invoke(null, objArr3)).charValue();
        char[] cArr5 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr5[i2] = (char) (cArr2[i2] - b);
        } else {
            i2 = i;
        }
        int i9 = 1;
        if (i2 > 1) {
            pngjInputException.values = 0;
            while (true) {
                int i10 = pngjInputException.values;
                if (i10 >= i2) {
                    break;
                }
                int i11 = ($10 + 21) % 128;
                $11 = i11;
                char c4 = cArr2[i10];
                pngjInputException.valueOf = c4;
                char c5 = cArr2[i10 + 1];
                pngjInputException.PngjException = c5;
                if (c4 == c5) {
                    int i12 = i11 + 1;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        cArr5[i10] = (char) (c4 >>> b);
                        cArr5[i10 - 1] = (char) (c5 >>> b);
                    } else {
                        cArr5[i10] = (char) (c4 - b);
                        cArr5[i10 + 1] = (char) (c5 - b);
                    }
                    i3 = i9;
                } else {
                    java.lang.Object[] objArr4 = new java.lang.Object[13];
                    objArr4[12] = pngjInputException;
                    objArr4[11] = Integer.valueOf(charValue);
                    objArr4[10] = pngjInputException;
                    objArr4[9] = pngjInputException;
                    objArr4[8] = Integer.valueOf(charValue);
                    objArr4[7] = pngjInputException;
                    objArr4[6] = pngjInputException;
                    objArr4[5] = Integer.valueOf(charValue);
                    objArr4[4] = pngjInputException;
                    objArr4[3] = pngjInputException;
                    objArr4[2] = Integer.valueOf(charValue);
                    objArr4[i9] = pngjInputException;
                    objArr4[0] = pngjInputException;
                    java.lang.Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1620847519);
                    if (PngjBadSignature4 == null) {
                        c = '\t';
                        char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                        int green = Color.green(0) + 27;
                        c2 = 7;
                        int resolveSize = View.resolveSize(0, 0) + 1475;
                        byte b6 = (byte) i9;
                        c3 = '\b';
                        byte b7 = (byte) (b6 - 1);
                        i3 = i9;
                        String $$g = $$g(b6, b7, b7);
                        Class cls2 = Integer.TYPE;
                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(bitsPerPixel, green, resolveSize, 1670167002, false, $$g, new Class[]{java.lang.Object.class, java.lang.Object.class, cls2, java.lang.Object.class, java.lang.Object.class, cls2, java.lang.Object.class, java.lang.Object.class, cls2, java.lang.Object.class, java.lang.Object.class, cls2, java.lang.Object.class});
                    } else {
                        i3 = i9;
                        c = '\t';
                        c2 = 7;
                        c3 = '\b';
                    }
                    int intValue = ((Integer) ((Method) PngjBadSignature4).invoke(null, objArr4)).intValue();
                    int i13 = pngjInputException.PngjUnsupportedException;
                    if (intValue == i13) {
                        $11 = ($10 + 71) % 128;
                        java.lang.Object[] objArr5 = new java.lang.Object[11];
                        objArr5[10] = pngjInputException;
                        objArr5[c] = Integer.valueOf(charValue);
                        objArr5[c3] = pngjInputException;
                        objArr5[c2] = Integer.valueOf(charValue);
                        objArr5[6] = Integer.valueOf(charValue);
                        objArr5[5] = pngjInputException;
                        objArr5[4] = pngjInputException;
                        objArr5[3] = Integer.valueOf(charValue);
                        objArr5[2] = Integer.valueOf(charValue);
                        objArr5[i3] = pngjInputException;
                        objArr5[0] = pngjInputException;
                        java.lang.Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1410004713);
                        if (PngjBadSignature5 == null) {
                            char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 37426);
                            int defaultSize = 26 - View.getDefaultSize(0, 0);
                            int axisFromString2 = 1016 - MotionEvent.axisFromString(BuildConfig.FLAVOR);
                            byte b8 = (byte) 2;
                            byte b9 = (byte) (b8 - 2);
                            String $$g2 = $$g(b8, b9, b9);
                            Class cls3 = Integer.TYPE;
                            PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(edgeSlop, defaultSize, axisFromString2, 1461347500, false, $$g2, new Class[]{java.lang.Object.class, java.lang.Object.class, cls3, cls3, java.lang.Object.class, java.lang.Object.class, cls3, cls3, java.lang.Object.class, cls3, java.lang.Object.class});
                        }
                        int intValue2 = ((Integer) ((Method) PngjBadSignature5).invoke(null, objArr5)).intValue();
                        int i14 = (pngjInputException.PngjBadCrcException * charValue) + pngjInputException.PngjUnsupportedException;
                        int i15 = pngjInputException.values;
                        cArr5[i15] = cArr3[intValue2];
                        cArr5[i15 + 1] = cArr3[i14];
                        $10 = ($11 + 9) % 128;
                    } else {
                        int i16 = pngjInputException.PngjBadSignature;
                        int i17 = pngjInputException.PngjBadCrcException;
                        if (i16 == i17) {
                            int i18 = i3;
                            int C = x5.C(pngjInputException.PngjOutputException, charValue, i18, charValue);
                            pngjInputException.PngjOutputException = C;
                            int C2 = x5.C(i13, charValue, i18, charValue);
                            pngjInputException.PngjUnsupportedException = C2;
                            int i19 = (i17 * charValue) + C2;
                            int i20 = pngjInputException.values;
                            cArr5[i20] = cArr3[(i16 * charValue) + C];
                            cArr5[i20 + i18] = cArr3[i19];
                            i3 = 1;
                        } else {
                            int i21 = (i16 * charValue) + i13;
                            int i22 = (i17 * charValue) + pngjInputException.PngjOutputException;
                            int i23 = pngjInputException.values;
                            cArr5[i23] = cArr3[i21];
                            i3 = 1;
                            cArr5[i23 + 1] = cArr3[i22];
                        }
                    }
                }
                pngjInputException.values += 2;
                i9 = i3;
            }
        }
        for (int i24 = 0; i24 < i; i24++) {
            cArr5[i24] = (char) (cArr5[i24] ^ 13722);
        }
        objArr[0] = new String(cArr5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Type inference failed for: r7v6, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, byte b2, java.lang.Object[] objArr) {
        int i;
        byte b3;
        byte[] bArr = $$a;
        int i2 = 39 - b;
        int r7 = 118 - (b2 * 38);
        byte[] bArr2 = new byte[19 - s];
        int r5 = 18 - s;
        if (bArr == null) {
            byte b4 = r7;
            i = 0;
            byte b5 = r5;
            i2++;
            b3 = b5 + b4 + 5;
            bArr2[i] = b3 == true ? (byte) 1 : (byte) 0;
            if (i == r5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i++;
            b4 = bArr[i2];
            b5 = b3;
            i2++;
            b3 = b5 + b4 + 5;
            bArr2[i] = b3 == true ? (byte) 1 : (byte) 0;
            if (i == r5) {
            }
        } else {
            i = 0;
            b3 = r7;
            bArr2[i] = b3 == true ? (byte) 1 : (byte) 0;
            if (i == r5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, short s2, byte b, java.lang.Object[] objArr) {
        int i;
        int i2 = 40 - (s2 * 36);
        int i3 = (s * 19) + 99;
        byte[] bArr = $$d;
        int i4 = b * 30;
        byte[] bArr2 = new byte[i4 + 7];
        int i5 = i4 + 6;
        if (bArr == null) {
            i3 = i5;
            byte[] bArr3 = bArr;
            int i6 = 0;
            int i7 = i2;
            i3 = i3 + (-i2) + 3;
            i2 = i7 + 1;
            bArr = bArr3;
            i = i6;
            bArr2[i] = (byte) i3;
            if (i == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b2 = bArr[i2];
            byte[] bArr4 = bArr;
            i7 = i2;
            i2 = b2;
            i6 = i + 1;
            bArr3 = bArr4;
            i3 = i3 + (-i2) + 3;
            i2 = i7 + 1;
            bArr = bArr3;
            i = i6;
            bArr2[i] = (byte) i3;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            if (i == i5) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{52, -30, -5, 49, 25, -12, -2, -45, 26, -2, -38, 42, -20, -35, 46, -26, -3, 6, -1, -16, 1, -6, 25, -12, -2, -42, 46, -26, -3, 6, -1, -16, 1, -6, -26, 6, 4, -21, 9, -26, 6, 4, -21, -27, 18};
        $$b = 79;
    }

    public static void init$1() {
        $$d = new byte[]{8, 114, -25, 117, -9, 5, 66, -56, 8, 2, -6, -3, -2, 78, -31, -27, 10, 0, 36, -34, 1, -2, 4, 50, -48, 24, 1, -8, -1, 14, -3, 4, 77, -79, 24, -8, -6, 19, 25, -20, 24, -8, -6, 19, 25, -20};
        $$e = 9;
    }

    public static void init$2() {
        $$c = new byte[]{52, -103, -35, 117};
        $$f = 164;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x035e  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void attachBaseContext(Context context) {
        int i;
        char c;
        int intValue;
        java.lang.Object[] valueOf$1eba2e16;
        char c2;
        int i2;
        int i3;
        PngjException = (PngjBadCrcException + 15) % 128;
        super.attachBaseContext(context);
        java.lang.Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
        if (PngjBadSignature2 == null) {
            char offsetAfter = (char) (14830 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0));
            int rgb = (-16777188) - Color.rgb(0, 0, 0);
            int blue = 721 - Color.blue(0);
            byte[] bArr = $$a;
            byte b = bArr[20];
            java.lang.Object[] objArr = new java.lang.Object[1];
            b((byte) (b - 1), (byte) (-bArr[13]), b, objArr);
            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(offsetAfter, rgb, blue, -815159504, false, (String) objArr[0], null);
        }
        long j = ((Field) PngjBadSignature2).getLong(null);
        try {
            try {
                if (j != -1) {
                    long j2 = j + 4611686018427387945L;
                    i = 864471691;
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a("\b\u001f\u001b\u0004\u0010\n\"\u0016\u0010\u0004\u0011\u0010\u0004\u001f\u0018\u001e\u001c\u001a\u0016\t\u000f\u0003", ExpandableListView.getPackedPositionGroup(0L) + 22, (byte) (19 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0)), objArr2);
                    Class<?> cls = Class.forName((String) objArr2[0]);
                    c = 20;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a("\u001b\u0012\u0006\u001f\u001e\u001c\u001d\u0010\u0019\u0006\u0016\u0013\u0003\u001c㘊", 15 - KeyEvent.normalizeMetaState(0), (byte) ((-16777205) - Color.rgb(0, 0, 0)), objArr3);
                    if (j2 >= ((Long) cls.getDeclaredMethod((String) objArr3[0], null).invoke(null, null)).longValue()) {
                        java.lang.Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                        if (PngjBadSignature3 == null) {
                            char alpha = (char) (14830 - Color.alpha(0));
                            int rgb2 = (-16777188) - Color.rgb(0, 0, 0);
                            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 722;
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            b(r2[17], (byte) ($$a[44] - 1), r2[20], objArr4);
                            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(alpha, rgb2, modifierMetaStateMask, -779023007, false, (String) objArr4[0], null);
                        }
                        java.lang.Object[] objArr5 = (java.lang.Object[]) ((Field) PngjBadSignature3).get(null);
                        valueOf$1eba2e16 = new java.lang.Object[]{new int[]{r5}, new int[1], r0, new int[]{r4}};
                        int i4 = ((int[]) objArr5[3])[0];
                        int i5 = ((int[]) objArr5[0])[0];
                        String[] strArr = (String[]) objArr5[2];
                        int identityHashCode = System.identityHashCode(this);
                        int i6 = ~identityHashCode;
                        int c3 = defpackage.a.c((~((-399053667) | i6)) | 302518784, 859, (((~(identityHashCode | (-96534883))) | (~(635512307 | i6))) * 859) + (((identityHashCode | 635512307) * (-859)) - 2005891616), -311167260);
                        int i7 = c3 ^ (c3 << 13);
                        int i8 = i7 ^ (i7 >>> 17);
                        ((int[]) valueOf$1eba2e16[1])[0] = i8 ^ (i8 << 5);
                        i2 = ((int[]) valueOf$1eba2e16[0])[0];
                        i3 = ((int[]) valueOf$1eba2e16[3])[0];
                        if (i3 != i2) {
                            java.lang.Object[] objArr6 = {new int[]{r8}, new int[1], r1, new int[]{r5}};
                            int i9 = ((int[]) valueOf$1eba2e16[1])[0];
                            int i10 = ((int[]) valueOf$1eba2e16[3])[0];
                            int i11 = ((int[]) valueOf$1eba2e16[0])[0];
                            String[] strArr2 = (String[]) valueOf$1eba2e16[2];
                            int i12 = ~((~Process.myPid()) | 556584377);
                            int c4 = defpackage.a.c(i12 | 2902424, 374, ((553681953 | i12) * (-374)) + 867679611, i9);
                            int i13 = c4 ^ (c4 << 13);
                            int i14 = i13 ^ (i13 >>> 17);
                            ((int[]) objArr6[1])[0] = i14 ^ (i14 << 5);
                            PngjBadCrcException = (PngjException + 83) % 128;
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        String[] strArr3 = (String[]) valueOf$1eba2e16[2];
                        if (strArr3 != null) {
                            for (String str : strArr3) {
                                arrayList.add(str);
                            }
                        }
                        Toast.makeText((Context) null, i3 / (((i3 - 1) * i3) % 2), 0).show();
                        java.lang.Object[] objArr7 = {new int[]{r8}, new int[1], r1, new int[]{r5}};
                        int i15 = ((int[]) valueOf$1eba2e16[1])[0];
                        int i16 = ((int[]) valueOf$1eba2e16[3])[0];
                        int i17 = ((int[]) valueOf$1eba2e16[0])[0];
                        String[] strArr4 = (String[]) valueOf$1eba2e16[2];
                        int identityHashCode2 = System.identityHashCode(this);
                        int c5 = defpackage.a.c((~(identityHashCode2 | (-504898612))) | 529667362, 376, (((~((~identityHashCode2) | 504898611)) | (-530199860)) * (-376)) + ((((-25833746) | identityHashCode2) * 376) - 1415183235), i15);
                        int i18 = c5 ^ (c5 << 13);
                        int i19 = i18 ^ (i18 >>> 17);
                        ((int[]) objArr7[1])[0] = i19 ^ (i19 << 5);
                        return;
                    }
                } else {
                    i = 864471691;
                    c = 20;
                }
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                a("\b\u001f\u001b\u0004\u0010\n\"\u0016\u0010\u0004\u0011\u0010\u0004\u001f\u0018\u001e\u001c\u001a\u0016\t\u000f\u0003", (ViewConfiguration.getScrollBarSize() >> 8) + 22, (byte) (19 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0)), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                a("\u001b\u0012\u0006\u001f\u001e\u001c\u001d\u0010\u0019\u0006\u0016\u0013\u0003\u001c㘊", View.getDefaultSize(0, 0) + 15, (byte) (11 - Color.green(0)), objArr9);
                Long valueOf2 = Long.valueOf(((Long) cls2.getDeclaredMethod((String) objArr9[0], null).invoke(null, null)).longValue());
                java.lang.Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i);
                if (PngjBadSignature4 == null) {
                    char lastIndexOf = (char) (14829 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0));
                    int resolveOpacity = Drawable.resolveOpacity(0, 0) + 28;
                    int trimmedLength = TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 721;
                    byte[] bArr2 = $$a;
                    byte b2 = bArr2[c];
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    b((byte) (b2 - 1), (byte) (-bArr2[c2]), b2, objArr10);
                    PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(lastIndexOf, resolveOpacity, trimmedLength, -815159504, false, (String) objArr10[0], null);
                }
                ((Field) PngjBadSignature4).set(null, valueOf2);
                i2 = ((int[]) valueOf$1eba2e16[0])[0];
                i3 = ((int[]) valueOf$1eba2e16[3])[0];
                if (i3 != i2) {
                }
            } catch (Exception unused) {
                throw new RuntimeException();
            }
            java.lang.Object[] objArr11 = {-1605263163};
            java.lang.Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1439412966);
            if (PngjBadSignature5 == null) {
                PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) Color.green(0), 25 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 697 - KeyEvent.normalizeMetaState(0), 1457201313, false, null, new Class[]{Integer.TYPE});
            }
            valueOf$1eba2e16 = TouchLessIDSDK$values.valueOf$1eba2e16(intValue, ((Constructor) PngjBadSignature5).newInstance(objArr11), -311167260);
            java.lang.Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
            if (PngjBadSignature6 == null) {
                char myPid = (char) ((Process.myPid() >> 22) + 14830);
                int blue2 = 28 - Color.blue(0);
                int tapTimeout = 721 - (ViewConfiguration.getTapTimeout() >> 16);
                c2 = '\r';
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                b(r9[17], (byte) ($$a[44] - 1), r9[c], objArr12);
                PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(myPid, blue2, tapTimeout, -779023007, false, (String) objArr12[0], null);
            } else {
                c2 = '\r';
            }
            ((Field) PngjBadSignature6).set(null, valueOf$1eba2e16);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        a("\u0019\u000b\u0001\u000b\u000f\u0016\b\u001f\u000e\u0011\r\u0003\u001e\u0016\u0019\u001c", '@' - AndroidCharacter.getMirror('0'), (byte) (14 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0)), objArr13);
        Class<?> cls3 = Class.forName((String) objArr13[0]);
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        a("\n\"\u001a\u001e\u0016\u0000\u0013\u0000\u001f\u000b\u001e\n\u001c\u0007\u001d\u0019", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 16, (byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 113), objArr14);
        intValue = ((Integer) cls3.getMethod((String) objArr14[0], java.lang.Object.class).invoke(null, this)).intValue();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        int i = PngjException + 57;
        PngjBadCrcException = i % 128;
        try {
            if (i % 2 != 0) {
                super.onBackPressed();
                IdentySdk.getInstance().a(ERRORS.ACTIVITY_PAUSED_ON_BACK_PRESSED, new Pair[1]);
            } else {
                super.onBackPressed();
                IdentySdk.getInstance().a(ERRORS.ACTIVITY_PAUSED_ON_BACK_PRESSED, new Pair[0]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:193:0x00da, code lost:
    
        if ((!(r8 instanceof com.identy.ui.PlayGifView)) != true) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x00e5, code lost:
    
        r8 = (com.identy.ui.PlayGifView) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x00ed, code lost:
    
        if (r3[0].getFinger() == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x00fb, code lost:
    
        if (r3[0].getFinger().equals(com.identy.enums.Finger.THUMB) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x00fe, code lost:
    
        r8.setImageResource(com.identy.R.drawable.id_rol_thumb);
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x010d, code lost:
    
        if (r10.equals(com.identy.enums.Hand.LEFT) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x010f, code lost:
    
        r8.setImageResource(com.identy.R.drawable.id_rol_left_finger);
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0115, code lost:
    
        r8.setImageResource(com.identy.R.drawable.id_rol_right_finger);
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x011a, code lost:
    
        com.identy.IntroActivity.PngjException = (com.identy.IntroActivity.PngjBadCrcException + 109) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x00e3, code lost:
    
        if ((r8 instanceof com.identy.ui.PlayGifView) != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0ccc  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03d1 A[Catch: all -> 0x03f9, TryCatch #3 {all -> 0x03f9, blocks: (B:87:0x0a67, B:89:0x0a84, B:90:0x0aca, B:161:0x03c0, B:163:0x03d1, B:164:0x03fc), top: B:160:0x03c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x04d8  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(Bundle bundle) {
        char c;
        boolean z;
        char c2;
        Hand hand;
        boolean isRolledfp;
        int i;
        int i2;
        int i3;
        java.lang.Object PngjBadSignature2;
        long j;
        char c3;
        long j2;
        java.lang.Object PngjBadSignature3;
        java.lang.Object[] PngjException$1eba2e16;
        java.lang.Object PngjBadSignature4;
        Class cls;
        java.lang.Object PngjBadSignature5;
        int i4;
        int i5;
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        java.lang.Object[] objArr3;
        int i6;
        Class cls2 = Integer.TYPE;
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a("\b\u001f\u001b\u0004\u0010\n\"\u0016\u0010\u0004\u0011\u0010\u0004\u001f\u0018\u001e\u001c\u001a\u0016\t\u000f\u0003", 22 - Color.argb(0, 0, 0, 0), (byte) (19 - (ViewConfiguration.getTouchSlop() >> 8)), objArr4);
        String str = (String) objArr4[0];
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a("\u001b\u0012\u0006\u001f\u001e\u001c\u001d\u0010\u0019\u0006\u0016\u0013\u0003\u001c㘊", View.getDefaultSize(0, 0) + 15, (byte) (11 - Color.green(0)), objArr5);
        String str2 = (String) objArr5[0];
        super.onCreate(bundle);
        FingerDetectionMode[] fingerDetectionModeArr = (FingerDetectionMode[]) getIntent().getSerializableExtra("option_selected");
        try {
            try {
                try {
                    if (fingerDetectionModeArr[0].getFinger() != null) {
                        c = ',';
                        if (fingerDetectionModeArr[0].getFinger().equals(Finger.THUMB)) {
                            int i7 = PngjException + 107;
                            PngjBadCrcException = i7 % 128;
                            if (i7 % 2 == 0) {
                                z = false;
                                if (fingerDetectionModeArr[0].getHand() != null) {
                                    int i8 = PngjBadCrcException + 119;
                                    c2 = '\r';
                                    PngjException = i8 % 128;
                                    if (i8 % 2 == 0) {
                                        Hand hand2 = Hand.LEFT;
                                        throw null;
                                    }
                                    hand = Hand.LEFT;
                                } else {
                                    c2 = '\r';
                                    hand = fingerDetectionModeArr[0].getHand();
                                }
                                isRolledfp = IdentySdk.getInstance().isRolledfp();
                                if (isRolledfp) {
                                    i3 = 0;
                                    i = 2;
                                    i2 = 5;
                                    if (z) {
                                        setContentView(R.layout.touchless_activity_intro_four_fingers);
                                    } else if (fingerDetectionModeArr[0].equals(FingerDetectionMode.TWO_THUMB)) {
                                        setContentView(R.layout.touchless_activity_intro_two_thumb);
                                    } else {
                                        setContentView(R.layout.touchless_activity_intro_thumb);
                                    }
                                    View findViewById = findViewById(R.id.intro_gif);
                                    if (findViewById != null) {
                                        int i9 = PngjBadCrcException;
                                        int i10 = i9 + 103;
                                        PngjException = i10 % 128;
                                        if (i10 % 2 == 0) {
                                            boolean z2 = findViewById instanceof PlayGifView;
                                            throw null;
                                        }
                                        if (findViewById instanceof PlayGifView) {
                                            PngjException = (i9 + 121) % 128;
                                            PlayGifView playGifView = (PlayGifView) findViewById;
                                            if (fingerDetectionModeArr[0].equals(FingerDetectionMode.TWO_THUMB)) {
                                                playGifView.setImageResource(R.drawable.id_two_thumb_animation);
                                            } else if (fingerDetectionModeArr[0].getFinger() == null || !fingerDetectionModeArr[0].getFinger().equals(Finger.THUMB)) {
                                                if (hand.equals(Hand.LEFT)) {
                                                    playGifView.setImageResource(R.drawable.ff_animation);
                                                } else {
                                                    playGifView.setImageResource(R.drawable.id_right_ff_animation);
                                                }
                                            } else if (hand.equals(Hand.LEFT)) {
                                                playGifView.setImageResource(R.drawable.id_left_thumb_animation);
                                            } else {
                                                playGifView.setImageResource(R.drawable.id_right_thumb_animation);
                                            }
                                        }
                                    }
                                } else {
                                    try {
                                        if (IdentySdk.getInstance().x()) {
                                            i = 2;
                                            i2 = 5;
                                            setContentView(R.layout.touchless_activity_intro_rol_option_two);
                                            ImageView imageView = (ImageView) findViewById(R.id.ivStep1Animation);
                                            ImageView imageView2 = (ImageView) findViewById(R.id.ivStep2Animation);
                                            ImageView imageView3 = (ImageView) findViewById(R.id.ivStep3Animation);
                                            if (fingerDetectionModeArr[0].getFinger() != null) {
                                                i3 = 0;
                                                if (fingerDetectionModeArr[0].getFinger().equals(Finger.THUMB)) {
                                                    PngjException = (PngjBadCrcException + 83) % 128;
                                                    imageView.setImageResource(R.drawable.id_rol_thumb_capture_first_side);
                                                    imageView2.setImageResource(R.drawable.id_rol_thumb_capture_second_side);
                                                    imageView3.setImageResource(R.drawable.id_rol_thumb_capture_third_side);
                                                }
                                            } else {
                                                i3 = 0;
                                            }
                                            if (!hand.equals(Hand.LEFT)) {
                                                imageView.setRotationY(180.0f);
                                                imageView2.setRotationY(180.0f);
                                                imageView3.setRotationY(180.0f);
                                            }
                                        } else {
                                            setContentView(R.layout.touchless_activity_intro_rol);
                                            View findViewById2 = findViewById(R.id.intro_gif);
                                            if (findViewById2 != null) {
                                                i = 2;
                                                int i11 = PngjException + 61;
                                                i2 = 5;
                                                PngjBadCrcException = i11 % 128;
                                                if (i11 % 2 != 0) {
                                                    int i12 = 60 / 0;
                                                }
                                            } else {
                                                i = 2;
                                                i2 = 5;
                                            }
                                            i3 = 0;
                                        }
                                    } catch (Exception e) {
                                        throw new RuntimeException(e);
                                    }
                                }
                                PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
                                if (PngjBadSignature2 != null) {
                                    char c4 = (char) (14831 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                                    int i13 = 29 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                    int i14 = 721 - (ExpandableListView.getPackedPositionForGroup(i3) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i3) == 0L ? 0 : -1));
                                    byte[] bArr = $$a;
                                    c3 = 20;
                                    byte b = bArr[20];
                                    j = 0;
                                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                                    b((byte) (b - 1), (byte) (-bArr[c2]), b, objArr6);
                                    PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c4, i13, i14, -815159504, false, (String) objArr6[i3], null);
                                } else {
                                    j = 0;
                                    c3 = 20;
                                }
                                j2 = ((Field) PngjBadSignature2).getLong(null);
                                if (j2 != -1 || j2 + 4611686018427387794L < ((Long) defpackage.a.i(str, str2, null, null, null)).longValue()) {
                                    int i15 = i3;
                                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                                    a("\u0019\u000b\u0001\u000b\u000f\u0016\b\u001f\u000e\u0011\r\u0003\u001e\u0016\u0019\u001c", (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 15, (byte) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', i15) + 16), objArr7);
                                    Class<?> cls3 = Class.forName((String) objArr7[i15]);
                                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                                    a("\n\"\u001a\u001e\u0016\u0000\u0013\u0000\u001f\u000b\u001e\n\u001c\u0007\u001d\u0019", TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 16, (byte) ((ExpandableListView.getPackedPositionForChild(i15, i15) > j ? 1 : (ExpandableListView.getPackedPositionForChild(i15, i15) == j ? 0 : -1)) + 114), objArr8);
                                    int intValue = ((Integer) cls3.getMethod((String) objArr8[i15], java.lang.Object.class).invoke(null, this)).intValue();
                                    java.lang.Object[] objArr9 = {306537755};
                                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1439412966);
                                    if (PngjBadSignature3 == null) {
                                        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) View.MeasureSpec.makeMeasureSpec(0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 23, TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 697, 1457201313, false, null, new Class[]{cls2});
                                    }
                                    PngjException$1eba2e16 = isAuthSucess.PngjException.AnimationAnimationListenerC0024PngjException.RunnableC0025PngjException.PngjException$1eba2e16(intValue, ((Constructor) PngjBadSignature3).newInstance(objArr9), 173451453);
                                    PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                                    if (PngjBadSignature4 != null) {
                                        char c5 = (char) (14830 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                                        int doubleTapTimeout = 28 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                        int offsetAfter = 721 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0);
                                        byte[] bArr2 = $$a;
                                        cls = java.lang.Object.class;
                                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                                        b(bArr2[17], (byte) (bArr2[c] - 1), bArr2[c3], objArr10);
                                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c5, doubleTapTimeout, offsetAfter, -779023007, false, (String) objArr10[0], null);
                                    } else {
                                        cls = java.lang.Object.class;
                                    }
                                    ((Field) PngjBadSignature4).set(null, PngjException$1eba2e16);
                                    Long valueOf2 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, null).invoke(null, null)).longValue());
                                    PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
                                    if (PngjBadSignature5 != null) {
                                        char gidForName = (char) (14829 - Process.getGidForName(BuildConfig.FLAVOR));
                                        int myTid = 28 - (Process.myTid() >> 22);
                                        int alpha = Color.alpha(0) + 721;
                                        byte[] bArr3 = $$a;
                                        byte b2 = bArr3[c3];
                                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                                        b((byte) (b2 - 1), (byte) (-bArr3[c2]), b2, objArr11);
                                        i3 = 0;
                                        PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(gidForName, myTid, alpha, -815159504, false, (String) objArr11[0], null);
                                    } else {
                                        i3 = 0;
                                    }
                                    ((Field) PngjBadSignature5).set(null, valueOf2);
                                } else {
                                    java.lang.Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                                    if (PngjBadSignature6 == null) {
                                        char c6 = (char) (14830 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 28;
                                        int i16 = 722 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1));
                                        byte[] bArr4 = $$a;
                                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                                        b(bArr4[17], (byte) (bArr4[c] - 1), bArr4[c3], objArr12);
                                        PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c6, keyRepeatDelay, i16, -779023007, false, (String) objArr12[i3], null);
                                    }
                                    java.lang.Object[] objArr13 = (java.lang.Object[]) ((Field) PngjBadSignature6).get(null);
                                    PngjException$1eba2e16 = new java.lang.Object[4];
                                    int[] iArr = new int[1];
                                    PngjException$1eba2e16[i3] = iArr;
                                    PngjException$1eba2e16[1] = new int[1];
                                    int[] iArr2 = new int[1];
                                    PngjException$1eba2e16[3] = iArr2;
                                    int i17 = ((int[]) objArr13[3])[i3];
                                    int i18 = ((int[]) objArr13[i3])[i3];
                                    String[] strArr = (String[]) objArr13[i];
                                    iArr2[i3] = i17;
                                    iArr[i3] = i18;
                                    PngjException$1eba2e16[i] = strArr;
                                    int c7 = defpackage.a.c((~((~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", null).invoke(null, null)).getResources().getConfiguration().orientation) | (-832603653))) | 201670673, 521, ((~((-832603653) | r3)) * 521) - 951445352, 173451453);
                                    int i19 = c7 ^ (c7 << 13);
                                    int i20 = i19 ^ (i19 >>> 17);
                                    ((int[]) PngjException$1eba2e16[1])[i3] = i20 ^ (i20 << 5);
                                    cls = java.lang.Object.class;
                                }
                                i4 = ((int[]) PngjException$1eba2e16[i3])[i3];
                                i5 = ((int[]) PngjException$1eba2e16[3])[i3];
                                if (i5 == i4) {
                                    ArrayList arrayList = new ArrayList();
                                    String[] strArr2 = (String[]) PngjException$1eba2e16[2];
                                    if (strArr2 != null) {
                                        for (int i21 = i3; i21 < strArr2.length; i21++) {
                                            arrayList.add(strArr2[i21]);
                                        }
                                    }
                                    throw new RuntimeException(String.valueOf(i5));
                                }
                                java.lang.Object[] objArr14 = new java.lang.Object[4];
                                int[] iArr3 = new int[1];
                                objArr14[i3] = iArr3;
                                objArr14[1] = new int[1];
                                int[] iArr4 = new int[1];
                                objArr14[3] = iArr4;
                                int i22 = ((int[]) PngjException$1eba2e16[1])[i3];
                                int i23 = ((int[]) PngjException$1eba2e16[3])[i3];
                                int i24 = ((int[]) PngjException$1eba2e16[i3])[i3];
                                String[] strArr3 = (String[]) PngjException$1eba2e16[i];
                                iArr4[i3] = i23;
                                iArr3[i3] = i24;
                                objArr14[i] = strArr3;
                                int elapsedRealtime = (int) SystemClock.elapsedRealtime();
                                int i25 = (~(8365080 | elapsedRealtime)) | 1040210278;
                                int i26 = ~((~elapsedRealtime) | (-5644305));
                                int c8 = defpackage.a.c((~(elapsedRealtime | 1048575358)) | i26, 470, ((i25 | i26) * (-470)) + 307124889, i22);
                                int i27 = c8 ^ (c8 << 13);
                                int i28 = i27 ^ (i27 >>> 17);
                                ((int[]) objArr14[1])[0] = i28 ^ (i28 << 5);
                                PngjException = (PngjBadCrcException + 63) % 128;
                                java.lang.Object PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-175041514);
                                if (PngjBadSignature7 == null) {
                                    char c9 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31077);
                                    int offsetBefore = 49 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0);
                                    int i29 = 1043 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                    byte[] bArr5 = $$a;
                                    byte b3 = bArr5[c3];
                                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                                    b((byte) (b3 - 1), (byte) (-bArr5[c2]), b3, objArr15);
                                    PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c9, offsetBefore, i29, 159283629, false, (String) objArr15[0], null);
                                }
                                long j3 = ((Field) PngjBadSignature7).getLong(null);
                                if (j3 == -1 || j3 + 4611686018427387909L < ((Long) defpackage.a.i(str, str2, null, null, null)).longValue()) {
                                    Context baseContext = getBaseContext();
                                    if (baseContext == null) {
                                        java.lang.Object[] objArr16 = new java.lang.Object[1];
                                        a("\b\u001f\u001b\u0004\u0010\n\"\u0016\u0006\u001f\"\f\u001b\b\u0016\u0000\u0000\u0005\u0013\u0000\u0000\b\u0000\u001b\n\u0019", 26 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) (9 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0)), objArr16);
                                        Class<?> cls4 = Class.forName((String) objArr16[0]);
                                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                                        a("\u0006\u0003㘄㘄\u001a\u001e\u0014\u0018㘆㘆\u0016\u0003\n\b\u0016\u0000\b\"", 18 - View.MeasureSpec.getMode(0), (byte) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 29), objArr17);
                                        baseContext = (Context) cls4.getMethod((String) objArr17[0], null).invoke(null, null);
                                    }
                                    if (baseContext != null) {
                                        baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
                                    }
                                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                                    a("\u0019\u000b\u0001\u000b\u000f\u0016\b\u001f\u000e\u0011\r\u0003\u001e\u0016\u0019\u001c", 16 - Drawable.resolveOpacity(0, 0), (byte) (15 - (ViewConfiguration.getLongPressTimeout() >> 16)), objArr18);
                                    Class<?> cls5 = Class.forName((String) objArr18[0]);
                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                    a("\n\"\u001a\u001e\u0016\u0000\u0013\u0000\u001f\u000b\u001e\n\u001c\u0007\u001d\u0019", 16 - ExpandableListView.getPackedPositionType(j), (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 113), objArr19);
                                    int intValue2 = ((Integer) cls5.getMethod((String) objArr19[0], cls).invoke(null, this)).intValue();
                                    PngjException = (PngjBadCrcException + 19) % 128;
                                    try {
                                        java.lang.Object[] objArr20 = new java.lang.Object[4];
                                        objArr20[3] = 1786026783;
                                        objArr20[i] = 0;
                                        objArr20[1] = Integer.valueOf(intValue2);
                                        objArr20[0] = baseContext;
                                        byte[] bArr6 = $$d;
                                        byte b4 = bArr6[17];
                                        byte b5 = bArr6[c3];
                                        Context context = baseContext;
                                        java.lang.Object[] objArr21 = new java.lang.Object[1];
                                        c(b4, b5, b5, objArr21);
                                        Class<?> cls6 = Class.forName((String) objArr21[0]);
                                        byte b6 = bArr6[c3];
                                        byte b7 = bArr6[17];
                                        java.lang.Object[] objArr22 = new java.lang.Object[1];
                                        c(b6, b7, b7, objArr22);
                                        java.lang.Object[] objArr23 = (java.lang.Object[]) cls6.getMethod((String) objArr22[0], Context.class, cls2, cls2, cls2).invoke(null, objArr20);
                                        if (context != null) {
                                            java.lang.Object PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1200224935);
                                            if (PngjBadSignature8 == null) {
                                                char c10 = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 31077);
                                                int minimumFlingVelocity = 49 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1043;
                                                byte b8 = (byte) ($$b & 61);
                                                byte b9 = (byte) (-$$a[i]);
                                                java.lang.Object[] objArr24 = new java.lang.Object[1];
                                                b(b8, b9, (byte) (b9 - 5), objArr24);
                                                PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c10, minimumFlingVelocity, fadingEdgeLength, 1150904546, false, (String) objArr24[0], null);
                                            }
                                            ((Field) PngjBadSignature8).set(null, objArr23);
                                            try {
                                                Long valueOf3 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, null).invoke(null, null)).longValue());
                                                java.lang.Object PngjBadSignature9 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-175041514);
                                                if (PngjBadSignature9 == null) {
                                                    char green = (char) (Color.green(0) + 31077);
                                                    int maximumFlingVelocity = 49 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 1044;
                                                    byte[] bArr7 = $$a;
                                                    byte b10 = bArr7[c3];
                                                    objArr = objArr23;
                                                    java.lang.Object[] objArr25 = new java.lang.Object[1];
                                                    b((byte) (b10 - 1), (byte) (-bArr7[c2]), b10, objArr25);
                                                    PngjBadSignature9 = com.d.e.a.PngjBadCrcException.PngjBadSignature(green, maximumFlingVelocity, bitsPerPixel, 159283629, false, (String) objArr25[0], null);
                                                } else {
                                                    objArr = objArr23;
                                                }
                                                ((Field) PngjBadSignature9).set(null, valueOf3);
                                            } catch (Exception unused) {
                                                throw new RuntimeException();
                                            }
                                        } else {
                                            objArr = objArr23;
                                        }
                                        objArr2 = objArr;
                                    } catch (Throwable th) {
                                        Throwable cause = th.getCause();
                                        if (cause == null) {
                                            throw th;
                                        }
                                        throw cause;
                                    }
                                } else {
                                    java.lang.Object PngjBadSignature10 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1200224935);
                                    if (PngjBadSignature10 == null) {
                                        char axisFromString = (char) (31076 - MotionEvent.axisFromString(BuildConfig.FLAVOR));
                                        int packedPositionChild = ExpandableListView.getPackedPositionChild(j) + 50;
                                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 1043;
                                        byte b11 = (byte) ($$b & 61);
                                        byte b12 = (byte) (-$$a[i]);
                                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                                        b(b11, b12, (byte) (b12 - 5), objArr26);
                                        PngjBadSignature10 = com.d.e.a.PngjBadCrcException.PngjBadSignature(axisFromString, packedPositionChild, maxKeyCode, 1150904546, false, (String) objArr26[0], null);
                                    }
                                    java.lang.Object[] objArr27 = (java.lang.Object[]) ((Field) PngjBadSignature10).get(null);
                                    objArr2 = new java.lang.Object[i2];
                                    objArr2[i] = new int[]{r13};
                                    objArr2[3] = new int[]{r12};
                                    objArr2[4] = new int[1];
                                    int i30 = ((int[]) objArr27[3])[0];
                                    int i31 = ((int[]) objArr27[i])[0];
                                    String str3 = (String) objArr27[1];
                                    String str4 = (String) objArr27[0];
                                    objArr2[1] = str3;
                                    objArr2[0] = str4;
                                    int freeMemory = (int) Runtime.getRuntime().freeMemory();
                                    int i32 = (((~((~freeMemory) | (-236927580))) | 134744641) * (-245)) - 1888945958;
                                    int i33 = ~(freeMemory | (-236927580));
                                    int c11 = defpackage.a.c(i33 | 387429790, 245, (i33 * (-245)) + i32, 1786026783);
                                    int i34 = c11 ^ (c11 << 13);
                                    int i35 = i34 ^ (i34 >>> 17);
                                    ((int[]) objArr2[4])[0] = i35 ^ (i35 << 5);
                                }
                                if (((int[]) objArr2[3])[0] != ((int[]) objArr2[i])[0]) {
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add((String) objArr2[1]);
                                    arrayList2.add((String) objArr2[0]);
                                    throw null;
                                }
                                java.lang.Object[] objArr28 = new java.lang.Object[5];
                                objArr28[i] = new int[]{r16};
                                objArr28[3] = new int[]{r13};
                                objArr28[4] = new int[1];
                                int i36 = ((int[]) objArr2[4])[0];
                                int i37 = ((int[]) objArr2[3])[0];
                                int i38 = ((int[]) objArr2[i])[0];
                                String str5 = (String) objArr2[1];
                                String str6 = (String) objArr2[0];
                                objArr28[1] = str5;
                                objArr28[0] = str6;
                                int identityHashCode = System.identityHashCode(this);
                                int i39 = ((~(identityHashCode | 565458744)) * 216) - 1627806623;
                                int i40 = ~identityHashCode;
                                int c12 = defpackage.a.c((~(i40 | 565458744)) | 58898625, 216, (((-33720514) | i40) * (-216)) + i39, i36);
                                int i41 = c12 ^ (c12 << 13);
                                int i42 = i41 ^ (i41 >>> 17);
                                ((int[]) objArr28[4])[0] = i42 ^ (i42 << 5);
                                java.lang.Object PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1556686741);
                                if (PngjBadSignature11 == null) {
                                    char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                                    int green2 = 37 - Color.green(0);
                                    int alpha2 = Color.alpha(0) + 549;
                                    byte[] bArr8 = $$a;
                                    byte b13 = bArr8[c3];
                                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                                    b((byte) (b13 - 1), (byte) (-bArr8[c2]), b13, objArr29);
                                    PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature(scrollBarSize, green2, alpha2, -1608103378, false, (String) objArr29[0], null);
                                }
                                long j4 = ((Field) PngjBadSignature11).getLong(null);
                                if (j4 == -1 || j4 + 4611686018427387813L < ((Long) defpackage.a.i(str, str2, null, null, null)).longValue()) {
                                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                                    a("\u0019\u000b\u0001\u000b\u000f\u0016\b\u001f\u000e\u0011\r\u0003\u001e\u0016\u0019\u001c", 16 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (byte) (ExpandableListView.getPackedPositionChild(j) + 16), objArr30);
                                    Class<?> cls7 = Class.forName((String) objArr30[0]);
                                    java.lang.Object[] objArr31 = new java.lang.Object[1];
                                    a("\n\"\u001a\u001e\u0016\u0000\u0013\u0000\u001f\u000b\u001e\n\u001c\u0007\u001d\u0019", 17 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)), (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 112), objArr31);
                                    int intValue3 = ((Integer) cls7.getMethod((String) objArr31[0], cls).invoke(null, this)).intValue();
                                    java.lang.Object[] objArr32 = new java.lang.Object[i];
                                    objArr32[1] = 1828566857;
                                    objArr32[0] = Integer.valueOf(intValue3);
                                    java.lang.Object PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1437710995);
                                    if (PngjBadSignature12 == null) {
                                        char indexOf = (char) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 1);
                                        int size = View.MeasureSpec.getSize(0) + 37;
                                        int i43 = 550 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                        java.lang.Object[] objArr33 = new java.lang.Object[1];
                                        b(r7[17], (byte) ($$a[c] - 1), r7[c3], objArr33);
                                        PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf, size, i43, -1453402328, false, (String) objArr33[0], new Class[]{cls2, cls2});
                                    }
                                    java.lang.Object[] objArr34 = (java.lang.Object[]) ((Method) PngjBadSignature12).invoke(null, objArr32);
                                    java.lang.Object PngjBadSignature13 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1434812162);
                                    if (PngjBadSignature13 == null) {
                                        char c13 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        int i44 = (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 36;
                                        int i45 = (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) + 548;
                                        byte[] bArr9 = $$a;
                                        byte b14 = (byte) (-bArr9[5]);
                                        byte b15 = (byte) (bArr9[c3] - 1);
                                        java.lang.Object[] objArr35 = new java.lang.Object[1];
                                        b(b14, b15, b15, objArr35);
                                        PngjBadSignature13 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c13, i44, i45, 1452666181, false, (String) objArr35[0], null);
                                    }
                                    ((Field) PngjBadSignature13).set(null, objArr34);
                                    try {
                                        Long valueOf4 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, null).invoke(null, null)).longValue());
                                        java.lang.Object PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1556686741);
                                        if (PngjBadSignature14 == null) {
                                            char lastIndexOf = (char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 1);
                                            int windowTouchSlop = 37 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                            int i46 = 550 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1));
                                            byte[] bArr10 = $$a;
                                            byte b16 = bArr10[c3];
                                            java.lang.Object[] objArr36 = new java.lang.Object[1];
                                            b((byte) (b16 - 1), (byte) (-bArr10[c2]), b16, objArr36);
                                            PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(lastIndexOf, windowTouchSlop, i46, -1608103378, false, (String) objArr36[0], null);
                                        }
                                        ((Field) PngjBadSignature14).set(null, valueOf4);
                                        objArr3 = objArr34;
                                        i6 = 2;
                                    } catch (Exception unused2) {
                                        throw new RuntimeException();
                                    }
                                } else {
                                    PngjBadCrcException = (PngjException + 77) % 128;
                                    java.lang.Object PngjBadSignature15 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1434812162);
                                    if (PngjBadSignature15 == null) {
                                        char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                                        int axisFromString2 = 36 - MotionEvent.axisFromString(BuildConfig.FLAVOR);
                                        int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 550;
                                        byte[] bArr11 = $$a;
                                        byte b17 = (byte) (-bArr11[5]);
                                        byte b18 = (byte) (bArr11[c3] - 1);
                                        java.lang.Object[] objArr37 = new java.lang.Object[1];
                                        b(b17, b18, b18, objArr37);
                                        PngjBadSignature15 = com.d.e.a.PngjBadCrcException.PngjBadSignature(touchSlop, axisFromString2, bitsPerPixel2, 1452666181, false, (String) objArr37[0], null);
                                    }
                                    java.lang.Object[] objArr38 = (java.lang.Object[]) ((Field) PngjBadSignature15).get(null);
                                    objArr3 = new java.lang.Object[3];
                                    objArr3[0] = new int[1];
                                    objArr3[1] = new int[]{r5};
                                    objArr3[i] = new int[]{r0};
                                    int i47 = ((int[]) objArr38[1])[0];
                                    int i48 = ((int[]) objArr38[i])[0];
                                    int identityHashCode2 = System.identityHashCode(this);
                                    int i49 = ~identityHashCode2;
                                    int c14 = defpackage.a.c((~(identityHashCode2 | (-397080240))) | 394957859 | (~(i49 | 1069285375)), 521, ((1067162995 | identityHashCode2) * 521) + (((~(i49 | 1067162995)) | 397080239) * (-1042)) + 243478334, 1828566857);
                                    int i50 = c14 ^ (c14 << 13);
                                    int i51 = i50 ^ (i50 >>> 17);
                                    ((int[]) objArr3[0])[0] = i51 ^ (i51 << 5);
                                    i6 = i;
                                }
                                java.lang.Object obj = objArr3[i6];
                                int i52 = ((int[]) obj)[0];
                                java.lang.Object obj2 = objArr3[1];
                                int i53 = ((int[]) obj2)[0];
                                if (i53 == i52) {
                                    java.lang.Object[] objArr39 = {new int[1], new int[1], new int[1]};
                                    int i54 = ((int[]) objArr3[0])[0];
                                    int i55 = ((int[]) obj2)[0];
                                    int i56 = ((int[]) obj)[0];
                                    ((int[]) objArr39[1])[0] = i55;
                                    ((int[]) objArr39[2])[0] = i56;
                                    int c15 = defpackage.a.c((~((~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", null).invoke(null, null)).getResources().getConfiguration().keyboard) | 461631680)) | (-541152163), 184, (((-541066019) | r0) * 184) - 2042973694, i54);
                                    int i57 = c15 ^ (c15 << 13);
                                    int i58 = i57 ^ (i57 >>> 17);
                                    ((int[]) objArr39[0])[0] = i58 ^ (i58 << 5);
                                } else {
                                    int[] iArr5 = new int[i53];
                                    int i59 = i53 - 1;
                                    iArr5[i59] = 1;
                                    Toast.makeText((Context) null, iArr5[((i53 * i59) % 2) - 1], 1).show();
                                    java.lang.Object[] objArr40 = {new int[1], new int[1], new int[1]};
                                    int i60 = ((int[]) objArr3[0])[0];
                                    int i61 = ((int[]) objArr3[1])[0];
                                    int i62 = ((int[]) objArr3[2])[0];
                                    ((int[]) objArr40[1])[0] = i61;
                                    ((int[]) objArr40[2])[0] = i62;
                                    int identityHashCode3 = System.identityHashCode(this);
                                    int i63 = ((((~((-109259299) | identityHashCode3)) | 100663330) | (~(1354983936 | identityHashCode3))) * (-754)) - 1509263290;
                                    int i64 = ~((-100663331) | identityHashCode3);
                                    int i65 = ~identityHashCode3;
                                    int c16 = defpackage.a.c(i65 | (-109259299), 754, ((i64 | (~(1455647266 | i65))) * (-754)) + i63, i60);
                                    int i66 = c16 ^ (c16 << 13);
                                    int i67 = i66 ^ (i66 >>> 17);
                                    ((int[]) objArr40[0])[0] = i67 ^ (i67 << 5);
                                }
                                findViewById(R.id.intro_skip).setOnClickListener(new PngjException(isRolledfp, hand));
                                return;
                            }
                        }
                    } else {
                        c = ',';
                    }
                    Long valueOf22 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, null).invoke(null, null)).longValue());
                    PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
                    if (PngjBadSignature5 != null) {
                    }
                    ((Field) PngjBadSignature5).set(null, valueOf22);
                    i4 = ((int[]) PngjException$1eba2e16[i3])[i3];
                    i5 = ((int[]) PngjException$1eba2e16[3])[i3];
                    if (i5 == i4) {
                    }
                } catch (Exception unused3) {
                    throw new RuntimeException();
                }
                java.lang.Object[] objArr92 = {306537755};
                PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1439412966);
                if (PngjBadSignature3 == null) {
                }
                PngjException$1eba2e16 = isAuthSucess.PngjException.AnimationAnimationListenerC0024PngjException.RunnableC0025PngjException.PngjException$1eba2e16(intValue, ((Constructor) PngjBadSignature3).newInstance(objArr92), 173451453);
                PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                if (PngjBadSignature4 != null) {
                }
                ((Field) PngjBadSignature4).set(null, PngjException$1eba2e16);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
            isRolledfp = IdentySdk.getInstance().isRolledfp();
            if (isRolledfp) {
            }
            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
            if (PngjBadSignature2 != null) {
            }
            j2 = ((Field) PngjBadSignature2).getLong(null);
            if (j2 != -1) {
            }
            int i152 = i3;
            java.lang.Object[] objArr72 = new java.lang.Object[1];
            a("\u0019\u000b\u0001\u000b\u000f\u0016\b\u001f\u000e\u0011\r\u0003\u001e\u0016\u0019\u001c", (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 15, (byte) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', i152) + 16), objArr72);
            Class<?> cls32 = Class.forName((String) objArr72[i152]);
            java.lang.Object[] objArr82 = new java.lang.Object[1];
            a("\n\"\u001a\u001e\u0016\u0000\u0013\u0000\u001f\u000b\u001e\n\u001c\u0007\u001d\u0019", TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 16, (byte) ((ExpandableListView.getPackedPositionForChild(i152, i152) > j ? 1 : (ExpandableListView.getPackedPositionForChild(i152, i152) == j ? 0 : -1)) + 114), objArr82);
            int intValue4 = ((Integer) cls32.getMethod((String) objArr82[i152], java.lang.Object.class).invoke(null, this)).intValue();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
        z = true;
        if (fingerDetectionModeArr[0].getHand() != null) {
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        int i = PngjBadCrcException + 33;
        PngjException = i % 128;
        int i2 = i % 2;
        super.onPause();
        if (i2 == 0) {
            throw null;
        }
        PngjException = (PngjBadCrcException + 77) % 128;
    }

    @Override // android.app.Activity
    public void onResume() {
        int i = PngjException + 23;
        PngjBadCrcException = i % 128;
        int i2 = i % 2;
        super.onResume();
        if (i2 != 0) {
            throw null;
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        PngjException = (PngjBadCrcException + 89) % 128;
        super.onStart();
        PngjBadCrcException = (PngjException + 63) % 128;
    }
}
