package com.identy;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
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
import com.karumi.dexter.BuildConfig;
import com.touchlessid.TouchLessIDSDK$PngjBadCrcException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public class Enroll2TActivity extends FingerActivity {
    private static  byte[] $$a = null;
    private static  int $$b = 0;
    private static  byte[] $$c = null;
    private static  int $$f = 0;
    private static int $10;
    private static int $11;
    private static char[] PngjBadCrcException;
    private static char getFingerPrintQualityScore;
    private static int getOveralTimetaken;
    private static int getScore;
    private int valueOf = 0;
    final HashMap values = new HashMap();

    public class PngjException implements com.identy.d.PngjBadCrcException {
        private /* synthetic */ HashMap PngjBadSignature;
        final /* synthetic */ HashMap valueOf;

        public class PngjBadSignature implements Runnable {
            public PngjBadSignature() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (FingerActivity.PngjPrematureEnding) {
                    Enroll2TActivity enroll2TActivity = Enroll2TActivity.this;
                    PngjException pngjException = PngjException.this;
                    Enroll2TActivity enroll2TActivity2 = Enroll2TActivity.this;
                    enroll2TActivity.getPadSub1 = new com.identy.ui.c.e1(enroll2TActivity2, enroll2TActivity2.values, pngjException.valueOf, enroll2TActivity2.getQualityScore);
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                    layoutParams.copyFrom(Enroll2TActivity.this.getPadSub1.getWindow().getAttributes());
                    ((ViewGroup.LayoutParams) layoutParams).width = -1;
                    Enroll2TActivity.this.getPadSub1.show();
                }
            }
        }

        public PngjException(HashMap hashMap, HashMap hashMap2) {
            this.PngjBadSignature = hashMap;
            this.valueOf = hashMap2;
        }

        @Override // com.identy.d.PngjBadCrcException
        public final /* synthetic */ void values() {
            try {
                com.identy.e1.values(new Object[]{Enroll2TActivity.this.onErrorResponse}, com.identy.i.PngjPrematureEnding.values(), com.identy.i.PngjPrematureEnding.values(), -431637600, com.identy.i.PngjPrematureEnding.values(), 431637601, com.identy.i.PngjPrematureEnding.values());
                IdentySdk identySdk = IdentySdk.getInstance();
                Enroll2TActivity enroll2TActivity = Enroll2TActivity.this;
                FingerDetectionMode fingerDetectionMode = enroll2TActivity.PngjExceptionInternal;
                HashMap hashMap = this.PngjBadSignature;
                com.identy.e1 e1Var = enroll2TActivity.onErrorResponse;
                long j = e1Var.toString;
                long j2 = e1Var.Enroll2IndexActivity;
                int i = e1Var.getEncryptedTemplates;
                byte[] PngjPrematureEnding = e1Var.PngjPrematureEnding();
                com.identy.e1 e1Var2 = Enroll2TActivity.this.onErrorResponse;
                identySdk.a(fingerDetectionMode, hashMap, j, j2, 0L, i, PngjPrematureEnding, e1Var2.setFoundMatchingTemplates + e1Var2.Enroll2IndexActivity, e1Var2.closeDialog, e1Var2.getHeight, e1Var2.ERRORS);
            } catch (Exception unused) {
            }
            Enroll2TActivity.this.onErrorResponse.valueOf();
            try {
                Enroll2TActivity.this.Action.PngjException();
            } catch (Exception unused2) {
            }
            try {
                if (IdentySdk.getInstance().isDisplayPrints()) {
                    Enroll2TActivity.this.runOnUiThread(new PngjBadSignature());
                    return;
                }
                if (!IdentySdk.getInstance().v()) {
                    if (IdentySdk.getInstance().isDisplayMoveNextDialog()) {
                        Enroll2TActivity.this.Attempt();
                        return;
                    } else {
                        Enroll2TActivity.this.Action();
                        return;
                    }
                }
                Enroll2TActivity enroll2TActivity2 = Enroll2TActivity.this;
                Enroll2TActivity enroll2TActivity3 = Enroll2TActivity.this;
                enroll2TActivity2.getPadSub1 = new com.identy.ui.c.PngjOutputException(enroll2TActivity3, enroll2TActivity3.getQualityScore, enroll2TActivity3.PngjExceptionInternal, (FingerDetectionMode) FingerActivity.PngjException(com.identy.a.PngjException.values(), -388390624, new Object[]{enroll2TActivity3}, com.identy.a.PngjException.values(), 388390631, com.identy.a.PngjException.values(), com.identy.a.PngjException.values()));
                Enroll2TActivity.this.getPadSub1.show();
            } catch (Exception unused3) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$i(byte b, byte b2, byte b3) {
        int i;
        int i2;
        byte[] bArr = $$c;
        int i3 = 121 - (b3 * 2);
        int i4 = 1 - (b * 4);
        int i5 = b2 + 4;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i4;
            int i7 = i5;
            i2 = 0;
            int i8 = i5 + i6;
            int i9 = i7;
            i3 = i8;
            i5 = i9;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            int i10 = i5 + 1;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            i6 = bArr[i10];
            int i11 = i3;
            i7 = i10;
            i5 = i11;
            int i82 = i5 + i6;
            int i92 = i7;
            i3 = i82;
            i5 = i92;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            int i102 = i5 + 1;
            if (i2 == i4) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            int i1022 = i5 + 1;
            if (i2 == i4) {
            }
        }
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getScore = 0;
        getOveralTimetaken = 1;
        PngjBadCrcException = new char[]{310, 304, 311, 282, 375, 316, 308, 298, 312, 266, 318, 305, 315, 309, 299, 303, 297, 301, 288, 267, 314, 307, 317, 306, 273};
        getFingerPrintQualityScore = (char) 13510;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, byte b2, Object[] objArr) {
        int i2;
        int i3 = 80 - (i * 4);
        byte[] bArr = $$a;
        int i4 = b * 6;
        int i5 = b2 + 4;
        byte[] bArr2 = new byte[i4 + 13];
        int i6 = i4 + 12;
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i7 = 0;
            int i8 = i5;
            i3 = i5 + (-i3) + 5;
            i5 = i8;
            bArr = bArr3;
            i2 = i7;
            int i9 = i5 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b3 = bArr[i9];
            i5 = i3;
            i3 = b3;
            i7 = i2 + 1;
            bArr3 = bArr;
            i8 = i9;
            i3 = i5 + (-i3) + 5;
            i5 = i8;
            bArr = bArr3;
            i2 = i7;
            int i92 = i5 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            int i922 = i5 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        }
    }

    private static void c(String str, int i, byte b, Object[] objArr) {
        int i2;
        int i3;
        char c;
        char c2;
        char c3;
        char c4;
        int length;
        char[] cArr;
        char c5;
        char c6;
        int i4;
        long j;
        char c7 = '\t';
        int i5 = $10 + 9;
        $11 = i5 % 128;
        char c8 = 2;
        if (i5 % 2 == 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : null;
        com.d.e.PngjInputException pngjInputException = new com.d.e.PngjInputException();
        char[] cArr2 = PngjBadCrcException;
        Class cls = Integer.TYPE;
        int i6 = 252968584;
        long j2 = 0;
        if (cArr2 != null) {
            int i7 = $10 + 21;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(i6);
                    if (PngjBadSignature == null) {
                        c5 = c7;
                        c6 = c8;
                        i4 = i6;
                        byte b2 = (byte) 0;
                        j = j2;
                        byte b3 = (byte) (b2 - 1);
                        PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getTapTimeout() >> 16), 29 - (SystemClock.elapsedRealtime() > j2 ? 1 : (SystemClock.elapsedRealtime() == j2 ? 0 : -1)), 1531 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -201551053, false, $$i(b2, b3, (byte) (b3 + 1)), new Class[]{cls});
                    } else {
                        c5 = c7;
                        c6 = c8;
                        i4 = i6;
                        j = j2;
                    }
                    cArr[i8] = ((Character) ((Method) PngjBadSignature).invoke(null, objArr2)).charValue();
                    i8++;
                    $10 = ($11 + 71) % 128;
                    i6 = i4;
                    c7 = c5;
                    c8 = c6;
                    j2 = j;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();

                    if (cause == null) {

                        throw new RuntimeException(th);

                    }

                    throw new RuntimeException(cause);
                }
            }
            cArr2 = cArr;
        }
        char c9 = c7;
        char c10 = c8;
        int i9 = i6;
        long j3 = j2;
        Object[] objArr3 = {Integer.valueOf(getFingerPrintQualityScore)};
        Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i9);
        if (PngjBadSignature2 == null) {
            byte b4 = (byte) 0;
            byte b5 = (byte) (b4 - 1);
            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ExpandableListView.getPackedPositionType(j3), 28 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1531, -201551053, false, $$i(b4, b5, (byte) (b5 + 1)), new Class[]{cls});
        }
        char charValue = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr3)).charValue();
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        int i10 = 1;
        if (i2 > 1) {
            pngjInputException.values = 0;
            while (true) {
                int i11 = pngjInputException.values;
                if (i11 >= i2) {
                    break;
                }
                $11 = ($10 + 29) % 128;
                char c11 = charArray[i11];
                pngjInputException.valueOf = c11;
                char c12 = charArray[i11 + 1];
                pngjInputException.PngjException = c12;
                if (c11 == c12) {
                    cArr3[i11] = (char) (c11 - b);
                    cArr3[i11 + 1] = (char) (c12 - b);
                    i3 = i10;
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = pngjInputException;
                    objArr4[11] = Integer.valueOf(charValue);
                    objArr4[10] = pngjInputException;
                    objArr4[c9] = pngjInputException;
                    objArr4[8] = Integer.valueOf(charValue);
                    objArr4[7] = pngjInputException;
                    objArr4[6] = pngjInputException;
                    objArr4[5] = Integer.valueOf(charValue);
                    objArr4[4] = pngjInputException;
                    objArr4[3] = pngjInputException;
                    objArr4[c10] = Integer.valueOf(charValue);
                    objArr4[i10] = pngjInputException;
                    objArr4[0] = pngjInputException;
                    Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1620847519);
                    if (PngjBadSignature3 == null) {
                        c = '\n';
                        char axisFromString = (char) (MotionEvent.axisFromString(BuildConfig.FLAVOR) + 1);
                        int i12 = (Process.getElapsedCpuTime() > j3 ? 1 : (Process.getElapsedCpuTime() == j3 ? 0 : -1)) + 26;
                        c2 = 7;
                        int green = 1475 - Color.green(0);
                        c3 = '\b';
                        byte b6 = (byte) 0;
                        c4 = 6;
                        byte b7 = (byte) (b6 - 1);
                        i3 = i10;
                        String $$i = $$i(b6, b7, (byte) (-b7));
                        Class cls2 = Integer.TYPE;
                        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(axisFromString, i12, green, 1670167002, false, $$i, new Class[]{Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class});
                    } else {
                        i3 = i10;
                        c = '\n';
                        c2 = 7;
                        c3 = '\b';
                        c4 = 6;
                    }
                    int intValue = ((Integer) ((Method) PngjBadSignature3).invoke(null, objArr4)).intValue();
                    int i13 = pngjInputException.PngjUnsupportedException;
                    if (intValue == i13) {
                        Object[] objArr5 = new Object[11];
                        objArr5[c] = pngjInputException;
                        objArr5[c9] = Integer.valueOf(charValue);
                        objArr5[c3] = pngjInputException;
                        objArr5[c2] = Integer.valueOf(charValue);
                        objArr5[c4] = Integer.valueOf(charValue);
                        objArr5[5] = pngjInputException;
                        objArr5[4] = pngjInputException;
                        objArr5[3] = Integer.valueOf(charValue);
                        objArr5[c10] = Integer.valueOf(charValue);
                        objArr5[i3] = pngjInputException;
                        objArr5[0] = pngjInputException;
                        Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1410004713);
                        if (PngjBadSignature4 == null) {
                            char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 37426);
                            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 26;
                            int i14 = (ExpandableListView.getPackedPositionForChild(0, 0) > j3 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j3 ? 0 : -1)) + 1018;
                            byte b8 = (byte) 0;
                            byte b9 = (byte) (b8 - 1);
                            String $$i2 = $$i(b8, b9, (byte) (b9 + 3));
                            Class cls3 = Integer.TYPE;
                            PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(touchSlop, doubleTapTimeout, i14, 1461347500, false, $$i2, new Class[]{Object.class, Object.class, cls3, cls3, Object.class, Object.class, cls3, cls3, Object.class, cls3, Object.class});
                        }
                        int intValue2 = ((Integer) ((Method) PngjBadSignature4).invoke(null, objArr5)).intValue();
                        int i15 = (pngjInputException.PngjBadCrcException * charValue) + pngjInputException.PngjUnsupportedException;
                        int i16 = pngjInputException.values;
                        cArr3[i16] = cArr2[intValue2];
                        cArr3[i16 + 1] = cArr2[i15];
                    } else {
                        int i17 = pngjInputException.PngjBadSignature;
                        int i18 = pngjInputException.PngjBadCrcException;
                        if (i17 == i18) {
                            int i19 = i3;
                            int C = x5.C(pngjInputException.PngjOutputException, charValue, i19, charValue);
                            pngjInputException.PngjOutputException = C;
                            int C2 = x5.C(i13, charValue, i19, charValue);
                            pngjInputException.PngjUnsupportedException = C2;
                            int i20 = (i18 * charValue) + C2;
                            int i21 = pngjInputException.values;
                            cArr3[i21] = cArr2[(i17 * charValue) + C];
                            cArr3[i21 + i19] = cArr2[i20];
                            i3 = 1;
                        } else {
                            int i22 = (i17 * charValue) + i13;
                            int i23 = (i18 * charValue) + pngjInputException.PngjOutputException;
                            int i24 = pngjInputException.values;
                            cArr3[i24] = cArr2[i22];
                            i3 = 1;
                            cArr3[i24 + 1] = cArr2[i23];
                        }
                    }
                }
                pngjInputException.values += 2;
                i10 = i3;
            }
        }
        int i25 = 0;
        while (i25 < i) {
            int i26 = $11 + 49;
            $10 = i26 % 128;
            if (i26 % 2 != 0) {
                cArr3[i25] = (char) (cArr3[i25] ^ 26054);
                i25 += 38;
            } else {
                cArr3[i25] = (char) (cArr3[i25] ^ 13722);
                i25++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public static void init$0() {
        $$a = new byte[]{44, -95, 117, 19, -25, 12, 2, 45, -26, 2, 38, -42, 20, 35, -46, 26, 3, -6, 1, 16, -1, 6, -25, 12, 2, 42, -46, 26, 3, -6, 1, 16, -1, 6};
        $$b = 39;
    }

    public static void init$1() {
        $$c = new byte[]{62, 18, 50, 13};
        $$f = 64;
    }

    @Override // com.identy.FingerActivity, com.identy.d.PngjBadSignature
    public final void PngjBadSignature(List<HashMap<Pair<Hand, Finger>, com.identy.IdentyA>> list, boolean z, boolean z2, HashMap<Pair<Hand, Finger>, Float> hashMap) {
        getOveralTimetaken = (getScore + 53) % 128;
        this.valueOf = 0;
        if (!z) {
            super.PngjBadSignature(list, z, z2, hashMap);
            int i = getOveralTimetaken + 63;
            getScore = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
            return;
        }
        this.valueOf = 1;
        super.PngjBadSignature(list, z, z2, hashMap);
        int i2 = getOveralTimetaken + 9;
        getScore = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        0 = com.identy.Enroll2TActivity.getOveralTimetaken + 91;
        com.identy.Enroll2TActivity.getScore = 0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if ((0 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        0 = 38 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0024, code lost:
    
        if (0 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (0 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0038, code lost:
    
        if (0.getAsHighestSecurityLevelReached != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        0.values.clear();
        0.values.putAll(0);
        0.onErrorResponse.PngjException(com.identy.R.string.id_processing);
        new com.identy.getAsHighestSecurityLevelReached(0, new com.identy.Enroll2TActivity.PngjException(0, 0, 0)).PngjException(0.values, com.identy.e1.PngjInputException);
        0 = com.identy.Enroll2TActivity.getScore + 15;
        com.identy.Enroll2TActivity.getOveralTimetaken = 0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0067, code lost:
    
        if ((0 % 2) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0069, code lost:
    
        0 = 41 / 0;
     */
    @Override // com.identy.FingerActivity, com.identy.d.PngjBadSignature
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void PngjException(HashMap<Pair<Hand, Finger>, com.identy.IdentyA> hashMap, HashMap<Pair<Hand, Finger>, com.identy.IdentyA> hashMap2, Bitmap bitmap, boolean z, boolean z2) {
        throw new UnsupportedOperationException("Method not decompiled");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0377  */
    @Override // com.identy.FingerActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void attachBaseContext(Context context) {
        int i;
        char c;
        int intValue;
        Object[] PngjBadCrcException$52c725b;
        char c2;
        Object[] objArr;
        int i2;
        int i3;
        super.attachBaseContext(context);
        Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
        if (PngjBadSignature == null) {
            char c3 = (char) (14829 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 29;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 721;
            byte b = $$a[18];
            Object[] objArr2 = new Object[1];
            b((byte) (b - 1), b, $$a[20], objArr2);
            PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(c3, bitsPerPixel, makeMeasureSpec, -815159504, false, (String) objArr2[0], null);
        }
        long j = ((Field) PngjBadSignature).getLong(null);
        try {
            try {
                if (j != -1) {
                    long j2 = j + 4611686018427387804L;
                    i = 864471691;
                    c = 20;
                    Object[] objArr3 = new Object[1];
                    c("\u0007\u0003\u0018\f\u0001\u0002\u0018\u0002\u0002\u0005\t\u000e\u0011\b\u000f\u0007\b\u0001\n\u0003\u0015\u0018", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21, (byte) (View.combineMeasuredStates(0, 0) + 69), objArr3);
                    Class<?> cls = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    c("\b\n\u0006\u0012\b\u0006\u0018\u0011\u0006\t\f\u0012\u0006\u000b㘁", 16 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (byte) (2 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), objArr4);
                    if (j2 >= ((Long) cls.getDeclaredMethod((String) objArr4[0], null).invoke(null, null)).longValue()) {
                        getScore = (getOveralTimetaken + 59) % 128;
                        Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                        if (PngjBadSignature2 == null) {
                            char doubleTapTimeout = (char) (14830 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                            int gidForName = Process.getGidForName(BuildConfig.FLAVOR) + 29;
                            int threadPriority = 721 - ((Process.getThreadPriority(0) + 20) >> 6);
                            byte b2 = (byte) ($$a[18] - 1);
                            byte b3 = b2;
                            Object[] objArr5 = new Object[1];
                            b(b2, b3, (byte) (b3 | 17), objArr5);
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(doubleTapTimeout, gidForName, threadPriority, -779023007, false, (String) objArr5[0], null);
                        }
                        Object[] objArr6 = (Object[]) ((Field) PngjBadSignature2).get(null);
                        objArr = new Object[]{new int[]{0}, new int[1], 0, new int[]{0}};
                        int i4 = ((int[]) objArr6[3])[0];
                        int i5 = ((int[]) objArr6[0])[0];
                        String[] strArr = (String[]) objArr6[2];
                        int identityHashCode = System.identityHashCode(this);
                        int i6 = ~identityHashCode;
                        int i7 = (((~((-11304993) | i6)) | (~(887914533 | identityHashCode))) * 520) - 55682307;
                        int i8 = ~((-887914534) | i6);
                        int i9 = ~(identityHashCode | 146651440);
                        int c4 = defpackage.a.c(i9 | (~(i6 | (-146651441))) | 876609541, 520, ((i8 | i9) * (-1040)) + i7, 1801454624);
                        int i10 = c4 ^ (c4 << 13);
                        int i11 = i10 ^ (i10 >>> 17);
                        ((int[]) objArr[1])[0] = i11 ^ (i11 << 5);
                        i2 = ((int[]) objArr[0])[0];
                        i3 = ((int[]) objArr[3])[0];
                        if (i3 != i2) {
                            Object[] objArr7 = {new int[]{0}, new int[1], 0, new int[]{0}};
                            int i12 = ((int[]) objArr[1])[0];
                            int i13 = ((int[]) objArr[3])[0];
                            int i14 = ((int[]) objArr[0])[0];
                            String[] strArr2 = (String[]) objArr[2];
                            int identityHashCode2 = System.identityHashCode(this);
                            int i15 = ~identityHashCode2;
                            int c5 = defpackage.a.c((~(identityHashCode2 | 436558720)) | (~(i15 | 598007253)), 950, (((~(i15 | 436558720)) | (~(identityHashCode2 | 598007253))) * (-950)) + (((~((-598007254) | i15)) | (~((-436558721) | identityHashCode2))) * 1900) + 1744402407, i12);
                            int i16 = c5 ^ (c5 << 13);
                            int i17 = i16 ^ (i16 >>> 17);
                            ((int[]) objArr7[1])[0] = i17 ^ (i17 << 5);
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        String[] strArr3 = (String[]) objArr[2];
                        if (strArr3 != null) {
                            getScore = (getOveralTimetaken + 31) % 128;
                            int i18 = 0;
                            while (i18 < strArr3.length) {
                                int i19 = getOveralTimetaken + 75;
                                getScore = i19 % 128;
                                if (i19 % 2 != 0) {
                                    arrayList.add(strArr3[i18]);
                                    i18 += 40;
                                } else {
                                    arrayList.add(strArr3[i18]);
                                    i18++;
                                }
                            }
                        }
                        Toast.makeText((Context) null, i3 / (((i3 - 1) * i3) % 2), 0).show();
                        Object[] objArr8 = {new int[]{0}, new int[1], 0, new int[]{0}};
                        int i20 = ((int[]) objArr[1])[0];
                        int i21 = ((int[]) objArr[3])[0];
                        int i22 = ((int[]) objArr[0])[0];
                        String[] strArr4 = (String[]) objArr[2];
                        int identityHashCode3 = System.identityHashCode(this);
                        int c6 = defpackage.a.c((~(identityHashCode3 | (-240235493))) | (~((~identityHashCode3) | 794330481)), 979, ((identityHashCode3 | 794330481) * (-979)) + (((~((-240235493) | 0)) * 979) - 1967286388), i20);
                        int i23 = c6 ^ (c6 << 13);
                        int i24 = i23 ^ (i23 >>> 17);
                        ((int[]) objArr8[1])[0] = i24 ^ (i24 << 5);
                        return;
                    }
                } else {
                    i = 864471691;
                    c = 20;
                }
                Object[] objArr9 = new Object[1];
                c("\u0007\u0003\u0018\f\u0001\u0002\u0018\u0002\u0002\u0005\t\u000e\u0011\b\u000f\u0007\b\u0001\n\u0003\u0015\u0018", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 21, (byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 69), objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                Object[] objArr10 = new Object[1];
                c("\b\n\u0006\u0012\b\u0006\u0018\u0011\u0006\t\f\u0012\u0006\u000b㘁", AndroidCharacter.getMirror('0') - '!', (byte) ((Process.myTid() >> 22) + 2), objArr10);
                Long valueOf = Long.valueOf(((Long) cls2.getDeclaredMethod((String) objArr10[0], null).invoke(null, null)).longValue());
                Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i);
                if (PngjBadSignature3 == null) {
                    char longPressTimeout = (char) (14830 - (ViewConfiguration.getLongPressTimeout() >> 16));
                    int i25 = 28 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int lastIndexOf = TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 722;
                    byte b4 = $$a[c2];
                    Object[] objArr11 = new Object[1];
                    b((byte) (b4 - 1), b4, $$a[c], objArr11);
                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(longPressTimeout, i25, lastIndexOf, -815159504, false, (String) objArr11[0], null);
                }
                ((Field) PngjBadSignature3).set(null, valueOf);
                objArr = PngjBadCrcException$52c725b;
                i2 = ((int[]) objArr[0])[0];
                i3 = ((int[]) objArr[3])[0];
                if (i3 != i2) {
                }
            } catch (Exception unused) {
                throw new RuntimeException();
            }
            Object[] objArr12 = {-1690447873};
            Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1439412966);
            if (PngjBadSignature4 == null) {
                PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getEdgeSlop() >> 16) + 24, View.MeasureSpec.getMode(0) + 697, 1457201313, false, null, new Class[]{Integer.TYPE});
            }
            PngjBadCrcException$52c725b = (Object[]) TouchLessIDSDK$PngjBadCrcException.PngjBadCrcException$52c725b(intValue, ((Constructor) PngjBadSignature4).newInstance(objArr12));
            Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
            if (PngjBadSignature5 == null) {
                char myPid = (char) (14830 - (Process.myPid() >> 22));
                int doubleTapTimeout2 = 28 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int i26 = 721 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte b5 = (byte) ($$a[18] - 1);
                byte b6 = b5;
                c2 = 18;
                Object[] objArr13 = new Object[1];
                b(b5, b6, (byte) (b6 | 17), objArr13);
                PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(myPid, doubleTapTimeout2, i26, -779023007, false, (String) objArr13[0], null);
            } else {
                c2 = 18;
            }
            ((Field) PngjBadSignature5).set(null, PngjBadCrcException$52c725b);
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
        Object[] objArr14 = new Object[1];
        c("\u0017\u0006\u0012\u0005\u0003\u000e\u0007\u0003\u000e\u0000\b\u0013\f\u0016\u0006\u0007", 16 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) (39 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0)), objArr14);
        Class<?> cls3 = Class.forName((String) objArr14[0]);
        Object[] objArr15 = new Object[1];
        c("\u0002\u0015\u0007\u0000\u0010\u0002\u0012\u0013\u0017\t\u0006\f\u0004\u0001\u0014\u0007", 15 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0'), (byte) (TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 43), objArr15);
        intValue = ((Integer) cls3.getMethod((String) objArr15[0], Object.class).invoke(null, this)).intValue();
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        getScore = (getOveralTimetaken + 89) % 128;
        super.onCreate(bundle);
        this.valueOf = 0;
        int i = getScore + 67;
        getOveralTimetaken = i % 128;
        if (i % 2 == 0) {
            int i2 = 75 / 0;
        }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onPause() {
        getOveralTimetaken = (getScore + 51) % 128;
        super.onPause();
        getScore = (getOveralTimetaken + 25) % 128;
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onResume() {
        int i = getScore + 27;
        getOveralTimetaken = i % 128;
        int i2 = i % 2;
        super.onResume();
        if (i2 == 0) {
            throw null;
        }
        int i3 = getOveralTimetaken + 101;
        getScore = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onStart() {
        getScore = (getOveralTimetaken + 9) % 128;
        super.onStart();
        int i = getOveralTimetaken + 95;
        getScore = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.identy.FingerActivity
    public void values(Bundle bundle) {
        super.values(bundle);
        try {
            try {
                this.onErrorResponse = new isFoundMatchingTemplates(this, this, this.PngjExceptionInternal, IdentySdk.getInstance().u(), this.PngjUnsupportedException);
                getOveralTimetaken = (getScore + 21) % 128;
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
        }
    }
}
