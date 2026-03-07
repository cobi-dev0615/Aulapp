package com.identy;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ExpandableListView;
import android.widget.Toast;
import co.ceduladigital.sdk.x5;
import com.identy.enums.Finger;
import com.identy.enums.FingerDetectionMode;
import com.identy.enums.Hand;
import com.identy.isAuthSucess;
import com.karumi.dexter.BuildConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public class EnrollFingersActivity extends FingerActivity {
    private static  byte[] $$a = null;
    private static  int $$b = 0;
    private static  byte[] $$c = null;
    private static  int $$f = 0;
    private static int $10;
    private static int $11;
    private static int getFingerPrintQualityScore;
    private static int getScore;
    private static char valueOf;
    private static char[] values;
    HashMap PngjBadCrcException = new HashMap();

    public class PngjBadSignature implements com.identy.d.PngjBadCrcException {
        final /* synthetic */ HashMap PngjBadSignature;
        private /* synthetic */ HashMap PngjException;

        public class PngjException implements Runnable {
            public static int PngjException;
            public static int values;

            public PngjException() {
            }

            public static int PngjException() {
                int i = PngjException;
                int i2 = i % 5565434;
                PngjException = i + 1;
                if (i2 != 0) {
                    return values;
                }
                int myTid = Process.myTid();
                values = myTid;
                return myTid;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (FingerActivity.PngjPrematureEnding) {
                    EnrollFingersActivity enrollFingersActivity = EnrollFingersActivity.this;
                    PngjBadSignature pngjBadSignature = PngjBadSignature.this;
                    EnrollFingersActivity enrollFingersActivity2 = EnrollFingersActivity.this;
                    enrollFingersActivity.getPadSub1 = new com.identy.ui.c.PngjInputException(enrollFingersActivity2, enrollFingersActivity2.PngjBadCrcException, pngjBadSignature.PngjBadSignature, enrollFingersActivity2.getQualityScore);
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                    layoutParams.copyFrom(EnrollFingersActivity.this.getPadSub1.getWindow().getAttributes());
                    ((ViewGroup.LayoutParams) layoutParams).width = -1;
                    EnrollFingersActivity.this.getPadSub1.show();
                }
            }
        }

        public PngjBadSignature(HashMap hashMap, HashMap hashMap2) {
            this.PngjException = hashMap;
            this.PngjBadSignature = hashMap2;
        }

        @Override // com.identy.d.PngjBadCrcException
        public final /* synthetic */ void values() {
            try {
                e1.values(new Object[]{EnrollFingersActivity.this.onErrorResponse}, com.identy.i.PngjPrematureEnding.values(), com.identy.i.PngjPrematureEnding.values(), -431637600, com.identy.i.PngjPrematureEnding.values(), 431637601, com.identy.i.PngjPrematureEnding.values());
                IdentySdk identySdk = IdentySdk.getInstance();
                EnrollFingersActivity enrollFingersActivity = EnrollFingersActivity.this;
                FingerDetectionMode fingerDetectionMode = enrollFingersActivity.PngjExceptionInternal;
                HashMap hashMap = this.PngjException;
                e1 e1Var = enrollFingersActivity.onErrorResponse;
                long j = e1Var.toString;
                long j2 = e1Var.Enroll2IndexActivity;
                int i = e1Var.getEncryptedTemplates;
                byte[] PngjPrematureEnding = e1Var.PngjPrematureEnding();
                e1 e1Var2 = EnrollFingersActivity.this.onErrorResponse;
                identySdk.a(fingerDetectionMode, hashMap, j, j2, 0L, i, PngjPrematureEnding, e1Var2.setFoundMatchingTemplates + e1Var2.Enroll2IndexActivity, e1Var2.closeDialog, e1Var2.getHeight, e1Var2.ERRORS);
            } catch (Exception unused) {
            }
            EnrollFingersActivity.this.onErrorResponse.valueOf();
            try {
                EnrollFingersActivity.this.Action.PngjException();
            } catch (Exception unused2) {
            }
            try {
                if (IdentySdk.getInstance().isDisplayPrints()) {
                    EnrollFingersActivity.this.runOnUiThread(new PngjException());
                    return;
                }
                if (!IdentySdk.getInstance().v()) {
                    if (IdentySdk.getInstance().isDisplayMoveNextDialog()) {
                        EnrollFingersActivity.this.Attempt();
                        return;
                    } else {
                        EnrollFingersActivity.this.Action();
                        return;
                    }
                }
                EnrollFingersActivity enrollFingersActivity2 = EnrollFingersActivity.this;
                EnrollFingersActivity enrollFingersActivity3 = EnrollFingersActivity.this;
                enrollFingersActivity2.getPadSub1 = new com.identy.ui.c.PngjOutputException(enrollFingersActivity3, enrollFingersActivity3.getQualityScore, enrollFingersActivity3.PngjExceptionInternal, (FingerDetectionMode) FingerActivity.PngjException(com.identy.a.PngjException.values(), -388390624, new Object[]{enrollFingersActivity3}, com.identy.a.PngjException.values(), 388390631, com.identy.a.PngjException.values(), com.identy.a.PngjException.values()));
                EnrollFingersActivity.this.getPadSub1.show();
            } catch (Exception unused3) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$i(byte b, int i, short s) {
        int i2;
        int i3 = b * 4;
        int i4 = (i * 3) + 4;
        byte[] bArr = $$c;
        int i5 = 121 - (s * 2);
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i6 = i3;
            int i7 = 0;
            i5 += i6;
            i4++;
            i2 = i7;
            bArr2[i2] = (byte) i5;
            i7 = i2 + 1;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            i6 = bArr[i4];
            i5 += i6;
            i4++;
            i2 = i7;
            bArr2[i2] = (byte) i5;
            i7 = i2 + 1;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            i7 = i2 + 1;
            if (i2 == i3) {
            }
        }
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getFingerPrintQualityScore = 0;
        getScore = 1;
        values = new char[]{316, 298, 304, 307, 297, 308, 318, 282, 267, 303, 312, 314, 309, 310, 305, 299, 317, 266, 311, 707, 306, 288, 301, 375, 273};
        valueOf = (char) 13510;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, int i2, Object[] objArr) {
        int i3;
        int i4;
        int i5 = i + 4;
        int i6 = 80 - (i2 * 4);
        byte[] bArr = $$a;
        int i7 = (b * 6) + 13;
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            int i8 = i5;
            byte[] bArr3 = bArr;
            i4 = 0;
            int i9 = i7;
            int i10 = i9 + (-i5) + 5;
            int i11 = i8;
            i6 = i10;
            i5 = i11;
            bArr = bArr3;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            int i12 = i5 + 1;
            if (i4 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i13 = i6;
            i8 = i12;
            i5 = bArr[i12];
            bArr3 = bArr;
            i9 = i13;
            int i102 = i9 + (-i5) + 5;
            int i112 = i8;
            i6 = i102;
            i5 = i112;
            bArr = bArr3;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            int i122 = i5 + 1;
            if (i4 == i7) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            int i1222 = i5 + 1;
            if (i4 == i7) {
            }
        }
    }

    private static void c(String str, int i, byte b, Object[] objArr) {
        int i2;
        char c;
        char c2;
        char c3;
        char c4;
        char c5;
        int i3 = $10 + 77;
        $11 = i3 % 128;
        char c6 = 2;
        if (i3 % 2 == 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.d.e.PngjInputException pngjInputException = new com.d.e.PngjInputException();
        char[] cArr = values;
        char c7 = '0';
        Class cls = Integer.TYPE;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                char c8 = c6;
                int i5 = $11 + 47;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i4])};
                        Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(252968584);
                        if (PngjBadSignature2 == null) {
                            char indexOf = (char) ((-1) - TextUtils.indexOf(BuildConfig.FLAVOR, c7));
                            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 29;
                            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 1531;
                            byte b2 = (byte) ($$c[3] + 1);
                            byte b3 = b2;
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf, modifierMetaStateMask, tapTimeout, -201551053, false, $$i(b2, b3, b3), new Class[]{cls});
                        }
                        cArr2[i4] = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();

                        if (cause == null) {

                            throw new RuntimeException(th);

                        }

                        throw new RuntimeException(cause);
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr[i4])};
                    Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(252968584);
                    if (PngjBadSignature3 == null) {
                        char indexOf2 = (char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0);
                        int red = 28 - Color.red(0);
                        int offsetBefore = 1531 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0);
                        byte b4 = (byte) ($$c[3] + 1);
                        byte b5 = b4;
                        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf2, red, offsetBefore, -201551053, false, $$i(b4, b5, b5), new Class[]{cls});
                    }
                    cArr2[i4] = ((Character) ((Method) PngjBadSignature3).invoke(null, objArr3)).charValue();
                    i4++;
                }
                c6 = c8;
                c7 = '0';
            }
            cArr = cArr2;
        }
        char c9 = c6;
        Object[] objArr4 = {Integer.valueOf(valueOf)};
        Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(252968584);
        if (PngjBadSignature4 == null) {
            char combineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
            int indexOf3 = 27 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0);
            int maximumFlingVelocity = 1531 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            byte b6 = (byte) ($$c[3] + 1);
            byte b7 = b6;
            PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(combineMeasuredStates, indexOf3, maximumFlingVelocity, -201551053, false, $$i(b6, b7, b7), new Class[]{cls});
        }
        char charValue = ((Character) ((Method) PngjBadSignature4).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            int i6 = $10 + 3;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                i2 = i + 25;
                cArr3[i2] = (char) (charArray[i2] * b);
            } else {
                i2 = i - 1;
                cArr3[i2] = (char) (charArray[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            $10 = ($11 + 1) % 128;
            int i7 = 0;
            while (true) {
                pngjInputException.values = i7;
                int i8 = pngjInputException.values;
                if (i8 >= i2) {
                    break;
                }
                char c10 = charArray[i8];
                pngjInputException.valueOf = c10;
                char c11 = charArray[i8 + 1];
                pngjInputException.PngjException = c11;
                if (c10 == c11) {
                    int i9 = $11;
                    $10 = (i9 + 65) % 128;
                    cArr3[i8] = (char) (c10 - b);
                    cArr3[i8 + 1] = (char) (c11 - b);
                    $10 = (i9 + 47) % 128;
                } else {
                    Object[] objArr5 = new Object[13];
                    objArr5[12] = pngjInputException;
                    objArr5[11] = Integer.valueOf(charValue);
                    objArr5[10] = pngjInputException;
                    objArr5[9] = pngjInputException;
                    objArr5[8] = Integer.valueOf(charValue);
                    objArr5[7] = pngjInputException;
                    objArr5[6] = pngjInputException;
                    objArr5[5] = Integer.valueOf(charValue);
                    objArr5[4] = pngjInputException;
                    objArr5[3] = pngjInputException;
                    objArr5[c9] = Integer.valueOf(charValue);
                    objArr5[1] = pngjInputException;
                    objArr5[0] = pngjInputException;
                    Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1620847519);
                    if (PngjBadSignature5 == null) {
                        c = '\n';
                        char trimmedLength = (char) TextUtils.getTrimmedLength(BuildConfig.FLAVOR);
                        int edgeSlop = 27 - (ViewConfiguration.getEdgeSlop() >> 16);
                        c2 = '\t';
                        c3 = 7;
                        int deadChar = KeyEvent.getDeadChar(0, 0) + 1475;
                        byte b8 = $$c[3];
                        c4 = '\b';
                        byte b9 = (byte) (b8 + 1);
                        c5 = 6;
                        String $$i = $$i(b9, b9, (byte) (-b8));
                        Class cls2 = Integer.TYPE;
                        PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(trimmedLength, edgeSlop, deadChar, 1670167002, false, $$i, new Class[]{Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class});
                    } else {
                        c = '\n';
                        c2 = '\t';
                        c3 = 7;
                        c4 = '\b';
                        c5 = 6;
                    }
                    int intValue = ((Integer) ((Method) PngjBadSignature5).invoke(null, objArr5)).intValue();
                    int i10 = pngjInputException.PngjUnsupportedException;
                    if (intValue == i10) {
                        $10 = ($11 + 75) % 128;
                        Object[] objArr6 = new Object[11];
                        objArr6[c] = pngjInputException;
                        objArr6[c2] = Integer.valueOf(charValue);
                        objArr6[c4] = pngjInputException;
                        objArr6[c3] = Integer.valueOf(charValue);
                        objArr6[c5] = Integer.valueOf(charValue);
                        objArr6[5] = pngjInputException;
                        objArr6[4] = pngjInputException;
                        objArr6[3] = Integer.valueOf(charValue);
                        objArr6[c9] = Integer.valueOf(charValue);
                        objArr6[1] = pngjInputException;
                        objArr6[0] = pngjInputException;
                        Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1410004713);
                        if (PngjBadSignature6 == null) {
                            char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 37426);
                            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 26;
                            int capsMode = 1017 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0);
                            byte b10 = (byte) ($$c[3] + 1);
                            byte b11 = b10;
                            String $$i2 = $$i(b10, b11, (byte) (b11 + 2));
                            Class cls3 = Integer.TYPE;
                            PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(touchSlop, packedPositionType, capsMode, 1461347500, false, $$i2, new Class[]{Object.class, Object.class, cls3, cls3, Object.class, Object.class, cls3, cls3, Object.class, cls3, Object.class});
                        }
                        int intValue2 = ((Integer) ((Method) PngjBadSignature6).invoke(null, objArr6)).intValue();
                        int i11 = (pngjInputException.PngjBadCrcException * charValue) + pngjInputException.PngjUnsupportedException;
                        int i12 = pngjInputException.values;
                        cArr3[i12] = cArr[intValue2];
                        cArr3[i12 + 1] = cArr[i11];
                    } else {
                        int i13 = pngjInputException.PngjBadSignature;
                        int i14 = pngjInputException.PngjBadCrcException;
                        if (i13 == i14) {
                            $11 = ($10 + 81) % 128;
                            int C = x5.C(pngjInputException.PngjOutputException, charValue, 1, charValue);
                            pngjInputException.PngjOutputException = C;
                            int C2 = x5.C(i10, charValue, 1, charValue);
                            pngjInputException.PngjUnsupportedException = C2;
                            int i15 = (i14 * charValue) + C2;
                            int i16 = pngjInputException.values;
                            cArr3[i16] = cArr[(i13 * charValue) + C];
                            cArr3[i16 + 1] = cArr[i15];
                        } else {
                            int i17 = (i13 * charValue) + i10;
                            int i18 = (i14 * charValue) + pngjInputException.PngjOutputException;
                            int i19 = pngjInputException.values;
                            cArr3[i19] = cArr[i17];
                            cArr3[i19 + 1] = cArr[i18];
                            i7 = pngjInputException.values + 2;
                        }
                    }
                }
                i7 = pngjInputException.values + 2;
            }
        }
        for (int i20 = 0; i20 < i; i20++) {
            cArr3[i20] = (char) (cArr3[i20] ^ 13722);
        }
        objArr[0] = new String(cArr3);
    }

    public static void init$0() {
        $$a = new byte[]{2, 126, 117, -112, -25, 12, 2, 45, -26, 2, 38, -42, 20, 35, -46, 26, 3, -6, 1, 16, -1, 6, -25, 12, 2, 42, -46, 26, 3, -6, 1, 16, -1, 6};
        $$b = 126;
    }

    public static void init$1() {
        $$c = new byte[]{34, -96, 112, -1};
        $$f = 150;
    }

    @Override // com.identy.FingerActivity, com.identy.d.PngjBadSignature
    public final void PngjBadSignature(List<HashMap<Pair<Hand, Finger>, a>> list, boolean z, boolean z2, HashMap<Pair<Hand, Finger>, Float> hashMap) {
        getScore = (getFingerPrintQualityScore + 75) % 128;
        super.PngjBadSignature(list, z, z2, hashMap);
        int i = getScore + 27;
        getFingerPrintQualityScore = i % 128;
        if (i % 2 != 0) {
            int i2 = 38 / 0;
        }
    }

    @Override // com.identy.FingerActivity, com.identy.d.PngjBadSignature
    public void PngjException(HashMap<Pair<Hand, Finger>, a> hashMap, HashMap<Pair<Hand, Finger>, a> hashMap2, Bitmap bitmap, boolean z, boolean z2) {
        int i = getScore + 27;
        getFingerPrintQualityScore = i % 128;
        if (i % 2 != 0) {
            super.PngjException(hashMap, hashMap2, bitmap, z, z2);
            throw null;
        }
        super.PngjException(hashMap, hashMap2, bitmap, z, z2);
        if (!z) {
            int i2 = getScore + 7;
            getFingerPrintQualityScore = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        if (this.getAsHighestSecurityLevelReached) {
            this.PngjBadCrcException.clear();
            this.PngjBadCrcException.putAll(hashMap);
            this.onErrorResponse.PngjException(R.string.id_processing);
            new getAsHighestSecurityLevelReached(this, new PngjBadSignature(hashMap, hashMap2)).PngjException(this.PngjBadCrcException, e1.PngjInputException);
            getFingerPrintQualityScore = (getScore + 5) % 128;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x03b0  */
    @Override // com.identy.FingerActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void attachBaseContext(Context context) {
        char c;
        char c2;
        int i;
        long j;
        int intValue;
        Object[] PngjException$1eba2e16;
        int i2;
        int i3;
        int i4 = getFingerPrintQualityScore + 107;
        getScore = i4 % 128;
        if (i4 % 2 == 0) {
            super.attachBaseContext(context);
            Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
            if (PngjBadSignature2 == null) {
                char blue = (char) (Color.blue(0) + 14830);
                int mirror = AndroidCharacter.getMirror('0') - 20;
                int i5 = 722 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                byte[] bArr = $$a;
                byte b = bArr[18];
                byte b2 = bArr[20];
                Object[] objArr = new Object[1];
                b(b, b2, (byte) (b2 + 1), objArr);
                PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(blue, mirror, i5, -815159504, false, (String) objArr[0], null);
            }
            ((Field) PngjBadSignature2).getLong(null);
            throw null;
        }
        super.attachBaseContext(context);
        Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
        if (PngjBadSignature3 == null) {
            char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 14830);
            int size = View.MeasureSpec.getSize(0) + 28;
            int blue2 = 721 - Color.blue(0);
            byte[] bArr2 = $$a;
            byte b3 = bArr2[18];
            byte b4 = bArr2[20];
            c = 2;
            Object[] objArr2 = new Object[1];
            b(b3, b4, (byte) (b4 + 1), objArr2);
            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(tapTimeout, size, blue2, -815159504, false, (String) objArr2[0], null);
        } else {
            c = 2;
        }
        long j2 = ((Field) PngjBadSignature3).getLong(null);
        try {
            try {
                if (j2 != -1) {
                    long j3 = j2 + 4611686018427387841L;
                    c2 = 20;
                    i = 864471691;
                    Object[] objArr3 = new Object[1];
                    c("\r\u000f\u0011\u0010\f\u0003\u0012\u0015\u000b\u0003\u0016\u0012\u0001\u0006\u0014\u0002\u0006\b\r\u000e\n\u0015", 21 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0), (byte) (7 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr3);
                    Class<?> cls = Class.forName((String) objArr3[0]);
                    j = 0;
                    Object[] objArr4 = new Object[1];
                    c("\u0002\n\u000e\u0000\u0002\u0001\u0012\u0006\u0005\u000f\u0011\u0002\u0000\u0007㙬", TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 15, (byte) (109 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr4);
                    if (j3 >= ((Long) cls.getDeclaredMethod((String) objArr4[0], null).invoke(null, null)).longValue()) {
                        Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                        if (PngjBadSignature4 == null) {
                            char keyRepeatDelay = (char) (14830 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 28;
                            int size2 = 721 - View.MeasureSpec.getSize(0);
                            byte b5 = $$a[18];
                            byte b6 = (byte) (b5 - 1);
                            Object[] objArr5 = new Object[1];
                            b(b6, (byte) (b6 | 17), (byte) (b5 - 1), objArr5);
                            PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(keyRepeatDelay, touchSlop, size2, -779023007, false, (String) objArr5[0], null);
                        }
                        Object[] objArr6 = (Object[]) ((Field) PngjBadSignature4).get(null);
                        PngjException$1eba2e16 = new Object[4];
                        PngjException$1eba2e16[0] = new int[]{0};
                        PngjException$1eba2e16[1] = new int[1];
                        PngjException$1eba2e16[3] = new int[]{0};
                        int i6 = ((int[]) objArr6[3])[0];
                        int i7 = ((int[]) objArr6[0])[0];
                        PngjException$1eba2e16[c] = (String[]) objArr6[c];
                        int identityHashCode = System.identityHashCode(this);
                        int c3 = defpackage.a.c((~(identityHashCode | (-565177173))) | (-469388802), 301, (((~((-469388802) | identityHashCode)) | (~((~identityHashCode) | 565177172))) * (-301)) + (((~(1006628693 | identityHashCode)) * (-301)) - 2027929922), 805595971);
                        int i8 = c3 ^ (c3 << 13);
                        int i9 = i8 ^ (i8 >>> 17);
                        ((int[]) PngjException$1eba2e16[1])[0] = i9 ^ (i9 << 5);
                        getScore = (getFingerPrintQualityScore + 111) % 128;
                        i2 = ((int[]) PngjException$1eba2e16[0])[0];
                        i3 = ((int[]) PngjException$1eba2e16[3])[0];
                        if (i3 != i2) {
                            Object[] objArr7 = new Object[4];
                            objArr7[0] = new int[]{0};
                            objArr7[1] = new int[1];
                            objArr7[3] = new int[]{0};
                            int i10 = ((int[]) PngjException$1eba2e16[1])[0];
                            int i11 = ((int[]) PngjException$1eba2e16[3])[0];
                            int i12 = ((int[]) PngjException$1eba2e16[0])[0];
                            objArr7[c] = (String[]) PngjException$1eba2e16[c];
                            int identityHashCode2 = System.identityHashCode(this);
                            int d = defpackage.a.d((~(identityHashCode2 | 43649499)) | (~(990916474 | identityHashCode2)) | (-999960572), -1444, (((~identityHashCode2) | (-965355170)) * 1444) + 1402242971, 1201730066, i10);
                            int i13 = d ^ (d << 13);
                            int i14 = i13 ^ (i13 >>> 17);
                            ((int[]) objArr7[1])[0] = i14 ^ (i14 << 5);
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) PngjException$1eba2e16[c];
                        if (strArr != null) {
                            int i15 = 0;
                            while (i15 < strArr.length) {
                                getFingerPrintQualityScore = (getScore + 37) % 128;
                                arrayList.add(strArr[i15]);
                                i15++;
                                getScore = (getFingerPrintQualityScore + 47) % 128;
                            }
                        }
                        Toast.makeText((Context) null, i3 / (((i3 - 1) * i3) % 2), 0).show();
                        Object[] objArr8 = new Object[4];
                        objArr8[0] = new int[]{0};
                        objArr8[1] = new int[1];
                        objArr8[3] = new int[]{0};
                        int i16 = ((int[]) PngjException$1eba2e16[1])[0];
                        int i17 = ((int[]) PngjException$1eba2e16[3])[0];
                        int i18 = ((int[]) PngjException$1eba2e16[0])[0];
                        objArr8[c] = (String[]) PngjException$1eba2e16[c];
                        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                        int i19 = ((elapsedCpuTime | 717015458) * (-50)) - 467023357;
                        int i20 = ~((-44845475) | elapsedCpuTime);
                        int i21 = ~elapsedCpuTime;
                        int c4 = defpackage.a.c((~(i21 | 717015458)) | (~((-317550516) | i21)) | 272705041, 50, ((i20 | (~((-272705042) | i21))) * 50) + i19, i16);
                        int i22 = c4 ^ (c4 << 13);
                        int i23 = i22 ^ (i22 >>> 17);
                        ((int[]) objArr8[1])[0] = i23 ^ (i23 << 5);
                        return;
                    }
                } else {
                    c2 = 20;
                    i = 864471691;
                    j = 0;
                }
                Object[] objArr9 = new Object[1];
                c("\r\u000f\u0011\u0010\f\u0003\u0012\u0015\u000b\u0003\u0016\u0012\u0001\u0006\u0014\u0002\u0006\b\r\u000e\n\u0015", AndroidCharacter.getMirror('0') - 26, (byte) (View.resolveSize(0, 0) + 6), objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                Object[] objArr10 = new Object[1];
                c("\u0002\n\u000e\u0000\u0002\u0001\u0012\u0006\u0005\u000f\u0011\u0002\u0000\u0007㙬", 14 - MotionEvent.axisFromString(BuildConfig.FLAVOR), (byte) (109 - Color.green(0)), objArr10);
                Long valueOf2 = Long.valueOf(((Long) cls2.getDeclaredMethod((String) objArr10[0], null).invoke(null, null)).longValue());
                Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i);
                if (PngjBadSignature5 == null) {
                    char alpha = (char) (14830 - Color.alpha(0));
                    int capsMode = TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 28;
                    int pressedStateDuration = 721 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    byte[] bArr3 = $$a;
                    byte b7 = bArr3[18];
                    byte b8 = bArr3[c2];
                    Object[] objArr11 = new Object[1];
                    b(b7, b8, (byte) (b8 + 1), objArr11);
                    PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(alpha, capsMode, pressedStateDuration, -815159504, false, (String) objArr11[0], null);
                }
                ((Field) PngjBadSignature5).set(null, valueOf2);
                i2 = ((int[]) PngjException$1eba2e16[0])[0];
                i3 = ((int[]) PngjException$1eba2e16[3])[0];
                if (i3 != i2) {
                }
            } catch (Exception unused) {
                throw new RuntimeException();
            }
            Object[] objArr12 = {-1078248795};
            Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1439412966);
            if (PngjBadSignature6 == null) {
                PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) TextUtils.getTrimmedLength(BuildConfig.FLAVOR), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24, 698 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)), 1457201313, false, null, new Class[]{Integer.TYPE});
            }
            PngjException$1eba2e16 = isAuthSucess.PngjException.AnimationAnimationListenerC0024PngjException.RunnableC0025PngjException.PngjException$1eba2e16(intValue, ((Constructor) PngjBadSignature6).newInstance(objArr12), 805595971);
            Object PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
            if (PngjBadSignature7 == null) {
                char packedPositionType = (char) (ExpandableListView.getPackedPositionType(j) + 14830);
                int size3 = 28 - View.MeasureSpec.getSize(0);
                int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 721;
                byte b9 = $$a[18];
                byte b10 = (byte) (b9 - 1);
                Object[] objArr13 = new Object[1];
                b(b10, (byte) (b10 | 17), (byte) (b9 - 1), objArr13);
                PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(packedPositionType, size3, touchSlop2, -779023007, false, (String) objArr13[0], null);
            }
            ((Field) PngjBadSignature7).set(null, PngjException$1eba2e16);
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
        Object[] objArr14 = new Object[1];
        c("\u0000\r\u0005\u000e\u0016\r\r\u000f\b\u0015\u0010\u0016\u0002\u0015\u0005\n", 16 - (Process.myTid() >> 22), (byte) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) + 78), objArr14);
        Class<?> cls3 = Class.forName((String) objArr14[0]);
        Object[] objArr15 = new Object[1];
        c("\u0001\u0011\u0003\u000f\u0002\u0007\u0017\u0016\u0014\u000e\u0004\u000b\b\f\u000f\u0001", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 16, (byte) (85 - KeyEvent.normalizeMetaState(0)), objArr15);
        intValue = ((Integer) cls3.getMethod((String) objArr15[0], Object.class).invoke(null, this)).intValue();
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i = getScore + 95;
        getFingerPrintQualityScore = i % 128;
        int i2 = i % 2;
        super.onCreate(bundle);
        if (i2 != 0) {
            int i3 = 96 / 0;
        }
        getScore = (getFingerPrintQualityScore + 15) % 128;
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onPause() {
        int i = getScore + 55;
        getFingerPrintQualityScore = i % 128;
        int i2 = i % 2;
        super.onPause();
        if (i2 != 0) {
            throw null;
        }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onResume() {
        int i = getFingerPrintQualityScore + 73;
        getScore = i % 128;
        int i2 = i % 2;
        super.onResume();
        if (i2 == 0) {
            int i3 = 45 / 0;
        }
        int i4 = getScore + 51;
        getFingerPrintQualityScore = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 92 / 0;
        }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onStart() {
        int i = getScore + 63;
        getFingerPrintQualityScore = i % 128;
        int i2 = i % 2;
        super.onStart();
        if (i2 != 0) {
            throw null;
        }
    }

    @Override // com.identy.FingerActivity
    public void values(Bundle bundle) {
        super.values(bundle);
        try {
            try {
                this.onErrorResponse = new isAuthSucess(this, this, this.PngjExceptionInternal, this.a, IdentySdk.getInstance().u(), this.PngjUnsupportedException);
                int i = getFingerPrintQualityScore + 21;
                getScore = i % 128;
                if (i % 2 == 0) {
                    int i2 = 58 / 0;
                }
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
        }
    }
}
