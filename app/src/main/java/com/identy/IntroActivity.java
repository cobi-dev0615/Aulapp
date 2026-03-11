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
    private static  byte[] $$a = null;
    private static  int $$b = 0;
    private static  byte[] $$c = null;
    private static  byte[] $$d = null;
    private static  int $$e = 0;
    private static  int $$f = 0;
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
                try {
                    GuideNoGuideHelper.markIntroShown(IntroActivity.this, GuideNoGuideHelper.getKey(fingerDetectionModeArr[0], this.PngjBadSignature));
                } catch (Exception e_key) { throw new RuntimeException(e_key); }
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
                return new String(bArr2, 0);
            }
        }
        return new String(bArr2, 0);
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

    private static void a(String str, int i, byte b, java.lang.Object[] objArr) throws Exception {
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
            cArr = null;
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

                        throw new RuntimeException(th);

                    }

                    throw new RuntimeException(cause);
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
            byte b4 = 0;
            i = 0;
            byte b5 = 0;
            i2++;
            b3 = (byte) (b5 + b4 + 5);
            bArr2[i] = b3 == 0 ? (byte) 1 : (byte) 0;
            if (i == 0) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i++;
            b4 = bArr[i2];
            b5 = b3;
            i2++;
            b3 = (byte) (b5 + b4 + 5);
            bArr2[i] = b3 == 0 ? (byte) 1 : (byte) 0;
            if (i == 0) {
            }
        } else {
            i = 0;
            b3 = 0;
            bArr2[i] = b3 == 0 ? (byte) 1 : (byte) 0;
            if (i == 0) {
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
        char c = 0;
        int intValue = 0;
        java.lang.Object[] valueOf$1eba2e16 = null;
        char c2 = 0;
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
                            b($$a[17], (byte) ($$a[44] - 1), $$a[20], objArr4);
                            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(alpha, rgb2, modifierMetaStateMask, -779023007, false, (String) objArr4[0], null);
                        }
                        java.lang.Object[] objArr5 = (java.lang.Object[]) ((Field) PngjBadSignature3).get(null);
                        valueOf$1eba2e16 = new java.lang.Object[]{new int[]{0}, new int[1], 0, new int[]{0}};
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
                            java.lang.Object[] objArr6 = {new int[]{0}, new int[1], 0, new int[]{0}};
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
                        java.lang.Object[] objArr7 = {new int[]{0}, new int[1], 0, new int[]{0}};
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
                b($$a[17], (byte) ($$a[44] - 1), $$a[c], objArr12);
                PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(myPid, blue2, tapTimeout, -779023007, false, (String) objArr12[0], null);
            } else {
                c2 = '\r';
            }
            ((Field) PngjBadSignature6).set(null, valueOf$1eba2e16);
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
        try {
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        a("\u0019\u000b\u0001\u000b\u000f\u0016\b\u001f\u000e\u0011\r\u0003\u001e\u0016\u0019\u001c", '@' - AndroidCharacter.getMirror('0'), (byte) (14 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0)), objArr13);
        Class<?> cls3 = Class.forName((String) objArr13[0]);
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        a("\n\"\u001a\u001e\u0016\u0000\u0013\u0000\u001f\u000b\u001e\n\u001c\u0007\u001d\u0019", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 16, (byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 113), objArr14);
        intValue = ((Integer) cls3.getMethod((String) objArr14[0], java.lang.Object.class).invoke(null, this)).intValue();
        } catch (Exception e_abc) { throw new RuntimeException(e_abc); }
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
    
        if ((!(0 instanceof com.identy.ui.PlayGifView)) != true) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x00e5, code lost:
    
        0 = (com.identy.ui.PlayGifView) 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x00ed, code lost:
    
        if ($$a[0].getFinger() == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x00fb, code lost:
    
        if ($$a[0].getFinger().equals(com.identy.enums.Finger.THUMB) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x00fe, code lost:
    
        0.setImageResource(com.identy.R.drawable.id_rol_thumb);
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x010d, code lost:
    
        if (0.equals(com.identy.enums.Hand.LEFT) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x010f, code lost:
    
        0.setImageResource(com.identy.R.drawable.id_rol_left_finger);
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0115, code lost:
    
        0.setImageResource(com.identy.R.drawable.id_rol_right_finger);
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x011a, code lost:
    
        com.identy.IntroActivity.PngjException = (com.identy.IntroActivity.PngjBadCrcException + 109) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x00e3, code lost:
    
        if ((0 instanceof com.identy.ui.PlayGifView) != false) goto L33;
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
        throw new UnsupportedOperationException("Method not decompiled");
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
