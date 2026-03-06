package com.identy;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.identy.CaptureRolledThumbActivity;
import com.identy.enums.Finger;
import com.identy.enums.FingerDetectionMode;
import com.identy.enums.Hand;
import com.karumi.dexter.BuildConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class Capture2IndexActivity extends FingerActivity {
    private static  byte[] $$a = null;
    private static  int $$b = 0;
    private static  byte[] $$c = null;
    private static  int $$f = 0;
    private static int $10;
    private static int $11;
    private static int PngjBadCrcException;
    private static int getFingerPrintQualityScore;
    private static long valueOf;
    final HashMap values = new HashMap();

    public class PngjBadCrcException implements Runnable {
        private /* synthetic */ HashMap PngjException;

        public PngjBadCrcException(HashMap hashMap) {
            this.PngjException = hashMap;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (FingerActivity.PngjPrematureEnding) {
                Capture2IndexActivity capture2IndexActivity = Capture2IndexActivity.this;
                Capture2IndexActivity capture2IndexActivity2 = Capture2IndexActivity.this;
                capture2IndexActivity.getPadSub1 = new com.identy.ui.c.PngjPrematureEnding(capture2IndexActivity2, capture2IndexActivity2.values, this.PngjException, capture2IndexActivity2.getQualityScore);
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.copyFrom(Capture2IndexActivity.this.getPadSub1.getWindow().getAttributes());
                ((ViewGroup.LayoutParams) layoutParams).width = -1;
                Capture2IndexActivity.this.getPadSub1.show();
            }
        }
    }

    private static String $$i(byte b, int i, int i2) {
        byte[] bArr = $$c;
        int i3 = 120 - (i * 5);
        int i4 = 3 - (i2 * 2);
        int i5 = b * 4;
        byte[] bArr2 = new byte[i5 + 1];
        int i6 = -1;
        if (bArr == null) {
            i3 += -i4;
            i4 = i4;
            bArr = bArr;
            i6 = -1;
        }
        while (true) {
            int i7 = i4 + 1;
            int i8 = i6 + 1;
            bArr2[i8] = (byte) i3;
            if (i8 == i5) {
                return new String(bArr2, 0);
            }
            byte[] bArr3 = bArr;
            i3 += -bArr[i7];
            i4 = i7;
            bArr = bArr3;
            i6 = i8;
        }
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        PngjBadCrcException = 0;
        getFingerPrintQualityScore = 1;
        valueOf = 961263889147448695L;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, int i3, Object[] objArr) {
        int i4;
        int i5;
        int i6 = 22 - (i2 * 18);
        int i7 = 80 - (i3 * 4);
        int i8 = i * 6;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[19 - i8];
        int i9 = 18 - i8;
        if (bArr == null) {
            int i10 = i9;
            i4 = i6;
            int i11 = 0;
            i6 = i6 + i10 + 5;
            i4++;
            i5 = i11;
            bArr2[i5] = (byte) i6;
            i11 = i5 + 1;
            if (i5 == i9) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i10 = bArr[i4];
            i6 = i6 + i10 + 5;
            i4++;
            i5 = i11;
            bArr2[i5] = (byte) i6;
            i11 = i5 + 1;
            if (i5 == i9) {
            }
        } else {
            i4 = i6;
            i6 = i7;
            i5 = 0;
            bArr2[i5] = (byte) i6;
            i11 = i5 + 1;
            if (i5 == i9) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(String str, int i, Object[] objArr) {
        char[] cArr;
        Throwable cause;
        char c;
        int i2;
        int i3;
        if (str != null) {
            $11 = ($10 + 63) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.d.e.PngjUnsupportedException pngjUnsupportedException = new com.d.e.PngjUnsupportedException();
        pngjUnsupportedException.PngjBadCrcException = i;
        int length = cArr2.length;
        long[] jArr = new long[length];
        pngjUnsupportedException.valueOf = 0;
        while (true) {
            int i4 = pngjUnsupportedException.valueOf;
            if (i4 >= cArr2.length) {
                break;
            }
            $11 = ($10 + 113) % 128;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i4]), pngjUnsupportedException, pngjUnsupportedException};
                Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(-930920279);
                if (PngjBadSignature == null) {
                    i2 = 35511;
                    byte b = (byte) 0;
                    i3 = -125632871;
                    byte b2 = (byte) (b + 1);
                    c = 1;
                    PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getTapTimeout() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 48, Gravity.getAbsoluteGravity(0, 0) + 944, 879502610, false, $$i(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                } else {
                    c = 1;
                    i2 = 35511;
                    i3 = -125632871;
                }
                jArr[i4] = ((Long) ((Method) PngjBadSignature).invoke(null, objArr2)).longValue() ^ (valueOf ^ 2636593786896957769L);
                Object[] objArr3 = new Object[2];
                objArr3[c] = pngjUnsupportedException;
                objArr3[0] = pngjUnsupportedException;
                Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                if (PngjBadSignature2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (i2 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR)), 42 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), 507 - Color.blue(0), 74289954, false, $$i(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) PngjBadSignature2).invoke(null, objArr3);
                $11 = ($10 + 19) % 128;
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr3 = new char[length];
        pngjUnsupportedException.valueOf = 0;
        while (true) {
            int i5 = pngjUnsupportedException.valueOf;
            if (i5 >= cArr2.length) {
                objArr[0] = new String(cArr3);
                return;
            }
            cArr3[i5] = (char) jArr[i5];
            Object[] objArr4 = {pngjUnsupportedException, pngjUnsupportedException};
            Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-125632871);
            if (PngjBadSignature3 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (35511 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 42 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 507 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 74289954, false, $$i(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) PngjBadSignature3).invoke(null, objArr4);
        }
    }

    public static void init$0() {
        $$a = new byte[]{19, -54, -54, -53, 25, -12, -2, -45, 26, -2, -38, 42, -20, -35, 46, -26, -3, 6, -1, -16, 1, -6, 25, -12, -2, -42, 46, -26, -3, 6, -1, -16, 1, -6};
        $$b = 7;
    }

    public static void init$1() {
        $$c = new byte[]{47, 36, -120, -67};
        $$f = 44;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00f6 -> B:13:0x0108). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0100 -> B:13:0x0108). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0105 -> B:13:0x0108). Please report as a decompilation issue!!! */
    @Override // com.identy.FingerActivity, com.identy.d.PngjBadSignature
    public void PngjException(HashMap<Pair<Hand, Finger>, a> hashMap, HashMap<Pair<Hand, Finger>, a> hashMap2, Bitmap bitmap, boolean z, boolean z2) {
        PngjBadCrcException = (getFingerPrintQualityScore + 99) % 128;
        super.PngjException(hashMap, hashMap2, bitmap, z, z2);
        if (z && this.getAsHighestSecurityLevelReached) {
            this.values.clear();
            this.values.putAll(hashMap);
            try {
                e1.values(new Object[]{this.onErrorResponse}, com.identy.i.PngjPrematureEnding.values(), com.identy.i.PngjPrematureEnding.values(), -431637600, com.identy.i.PngjPrematureEnding.values(), 431637601, com.identy.i.PngjPrematureEnding.values());
                IdentySdk identySdk = IdentySdk.getInstance();
                FingerDetectionMode fingerDetectionMode = this.PngjExceptionInternal;
                e1 e1Var = this.onErrorResponse;
                long j = e1Var.toString;
                long j2 = e1Var.Enroll2IndexActivity;
                int i = e1Var.getEncryptedTemplates;
                byte[] PngjPrematureEnding = e1Var.PngjPrematureEnding();
                e1 e1Var2 = this.onErrorResponse;
                identySdk.a(fingerDetectionMode, hashMap, j, j2, 0L, i, PngjPrematureEnding, e1Var2.setFoundMatchingTemplates + e1Var2.Enroll2IndexActivity, e1Var2.closeDialog, e1Var2.getHeight, e1Var2.ERRORS);
            } catch (Exception e) {
                try {
                    if (LibSettings.isSaveCaptured()) {
                        e.getMessage();
                        PngjBadCrcException = (getFingerPrintQualityScore + 57) % 128;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            try {
                if (IdentySdk.getInstance().isDisplayPrints()) {
                    runOnUiThread(new PngjBadCrcException(hashMap2));
                } else if (IdentySdk.getInstance().v()) {
                    if (FingerActivity.PngjPrematureEnding) {
                        com.identy.ui.c.PngjUnsupportedException pngjUnsupportedException = new com.identy.ui.c.PngjUnsupportedException(this, this.getQualityScore, this.PngjExceptionInternal, (FingerDetectionMode) FingerActivity.PngjException(com.identy.a.PngjException.values(), -388390624, new Object[]{this}, com.identy.a.PngjException.values(), 388390631, com.identy.a.PngjException.values(), com.identy.a.PngjException.values()));
                        this.getPadSub1 = pngjUnsupportedException;
                        pngjUnsupportedException.show();
                    }
                } else if (IdentySdk.getInstance().isDisplayMoveNextDialog()) {
                    getFingerPrintQualityScore = (PngjBadCrcException + 13) % 128;
                    Attempt();
                } else {
                    Action();
                }
            } catch (Exception e3) {
                try {
                    if (LibSettings.isSaveCaptured()) {
                        PngjBadCrcException = (getFingerPrintQualityScore + 39) % 128;
                        e3.getMessage();
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0333  */
    @Override // com.identy.FingerActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void attachBaseContext(Context context) {
        int i;
        int intValue;
        Object[] PngjBadCrcException$52c725b;
        char c;
        int i2;
        int i3;
        int i4;
        super.attachBaseContext(context);
        Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
        if (PngjBadSignature == null) {
            char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 14830);
            int alpha = Color.alpha(0) + 28;
            int red = Color.red(0) + 721;
            byte b = $$a[20];
            byte b2 = (byte) (b - 1);
            byte b3 = b;
            Object[] objArr = new Object[1];
            b(b2, b3, (byte) (b3 - 1), objArr);
            PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(tapTimeout, alpha, red, -815159504, false, (String) objArr[0], null);
        }
        long j = ((Field) PngjBadSignature).getLong(null);
        try {
            try {
                if (j != -1) {
                    long j2 = j + 4611686018427387930L;
                    Object[] objArr2 = new Object[1];
                    c("豟\uf08b痬\ufadd缽ﰐ慸\ue5ed檉\ueffe沞턄嘃\udb52徰\udc8e䇣웶䬴점䵁놢", 31963 - (Process.myTid() >> 22), objArr2);
                    Class<?> cls = Class.forName((String) objArr2[0]);
                    i = 864471691;
                    Object[] objArr3 = new Object[1];
                    c("豛㊡\uf1b9낗瞁㛤\uf5e8듉篃㫔郎렻缳㸄ﴑ", 48883 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr3);
                    if (j2 >= ((Long) cls.getDeclaredMethod((String) objArr3[0], null).invoke(null, null)).longValue()) {
                        Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                        if (PngjBadSignature2 == null) {
                            char deadChar = (char) (14830 - KeyEvent.getDeadChar(0, 0));
                            int indexOf = 28 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR);
                            int capsMode = 721 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0);
                            byte b4 = $$a[20];
                            byte b5 = (byte) (b4 - 1);
                            Object[] objArr4 = new Object[1];
                            b(b4, b5, b5, objArr4);
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(deadChar, indexOf, capsMode, -779023007, false, (String) objArr4[0], null);
                        }
                        Object[] objArr5 = (Object[]) ((Field) PngjBadSignature2).get(null);
                        PngjBadCrcException$52c725b = new Object[]{new int[]{0}, new int[1], 0, new int[]{0}};
                        int i5 = ((int[]) objArr5[3])[0];
                        int i6 = ((int[]) objArr5[0])[0];
                        String[] strArr = (String[]) objArr5[2];
                        int identityHashCode = System.identityHashCode(this);
                        int i7 = ~identityHashCode;
                        int i8 = (((~((-36375079) | i7)) | (~(174788391 | identityHashCode))) * 520) + 1322472221;
                        int i9 = ~((-174788392) | i7);
                        int i10 = ~(identityHashCode | 859777582);
                        int c2 = defpackage.a.c(i10 | (~(i7 | (-859777583))) | 138413313, 520, ((i9 | i10) * (-1040)) + i8, -1289643680);
                        int i11 = c2 ^ (c2 << 13);
                        int i12 = i11 ^ (i11 >>> 17);
                        ((int[]) PngjBadCrcException$52c725b[1])[0] = i12 ^ (i12 << 5);
                        PngjBadCrcException = (getFingerPrintQualityScore + 47) % 128;
                        i3 = ((int[]) PngjBadCrcException$52c725b[0])[0];
                        i4 = ((int[]) PngjBadCrcException$52c725b[3])[0];
                        if (i4 != i3) {
                            getFingerPrintQualityScore = (PngjBadCrcException + 65) % 128;
                            Object[] objArr6 = {new int[]{0}, new int[1], 0, new int[]{0}};
                            int i13 = ((int[]) PngjBadCrcException$52c725b[1])[0];
                            int i14 = ((int[]) PngjBadCrcException$52c725b[3])[0];
                            int i15 = ((int[]) PngjBadCrcException$52c725b[0])[0];
                            String[] strArr2 = (String[]) PngjBadCrcException$52c725b[2];
                            int i16 = ~defpackage.a.b(1820661510);
                            int i17 = ~(217482562 | i16);
                            int c3 = defpackage.a.c(i17 | 1011167569, 764, (((~(i16 | 817083411)) | 205783360) * (-1528)) + ((i17 | 817083411) * 764) + 1019549925, i13);
                            int i18 = c3 ^ (c3 << 13);
                            int i19 = i18 ^ (i18 >>> 17);
                            ((int[]) objArr6[1])[0] = i19 ^ (i19 << 5);
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        String[] strArr3 = (String[]) PngjBadCrcException$52c725b[2];
                        if (strArr3 != null) {
                            PngjBadCrcException = (getFingerPrintQualityScore + 113) % 128;
                            for (String str : strArr3) {
                                PngjBadCrcException = (getFingerPrintQualityScore + 43) % 128;
                                arrayList.add(str);
                            }
                        }
                        Toast.makeText((Context) null, i4 / (((i4 - 1) * i4) % 2), 0).show();
                        Object[] objArr7 = {new int[]{0}, new int[1], 0, new int[]{0}};
                        int i20 = ((int[]) PngjBadCrcException$52c725b[1])[0];
                        int i21 = ((int[]) PngjBadCrcException$52c725b[3])[0];
                        int i22 = ((int[]) PngjBadCrcException$52c725b[0])[0];
                        String[] strArr4 = (String[]) PngjBadCrcException$52c725b[2];
                        int c4 = defpackage.a.c((~(System.identityHashCode(this) | (-27853313))) | 939574305, 130, ((~((~0) | (-27853313))) * 130) - 176972653, i20);
                        int i23 = c4 ^ (c4 << 13);
                        int i24 = i23 ^ (i23 >>> 17);
                        ((int[]) objArr7[1])[0] = i24 ^ (i24 << 5);
                        return;
                    }
                } else {
                    i = 864471691;
                }
                Object[] objArr8 = new Object[1];
                c("豟\uf08b痬\ufadd缽ﰐ慸\ue5ed檉\ueffe沞턄嘃\udb52徰\udc8e䇣웶䬴점䵁놢", ExpandableListView.getPackedPositionGroup(0L) + 31963, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c("豛㊡\uf1b9낗瞁㛤\uf5e8듉篃㫔郎렻缳㸄ﴑ", View.resolveSizeAndState(0, 0, 0) + i2, objArr9);
                Long valueOf2 = Long.valueOf(((Long) cls2.getDeclaredMethod((String) objArr9[0], null).invoke(null, null)).longValue());
                Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i);
                if (PngjBadSignature3 == null) {
                    char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 14830);
                    int keyCodeFromString = KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 28;
                    int argb = Color.argb(0, 0, 0, 0) + 721;
                    byte b6 = $$a[c];
                    byte b7 = (byte) (b6 - 1);
                    byte b8 = b6;
                    Object[] objArr10 = new Object[1];
                    b(b7, b8, (byte) (b8 - 1), objArr10);
                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(touchSlop, keyCodeFromString, argb, -815159504, false, (String) objArr10[0], null);
                }
                ((Field) PngjBadSignature3).set(null, valueOf2);
                i3 = ((int[]) PngjBadCrcException$52c725b[0])[0];
                i4 = ((int[]) PngjBadCrcException$52c725b[3])[0];
                if (i4 != i3) {
                }
            } catch (Exception unused) {
                throw new RuntimeException();
            }
            Object[] objArr11 = {-969883009};
            Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1439412966);
            if (PngjBadSignature4 == null) {
                PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 24 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 745 - AndroidCharacter.getMirror('0'), 1457201313, false, null, new Class[]{Integer.TYPE});
            }
            PngjBadCrcException$52c725b = CaptureRolledThumbActivity.PngjBadSignature.PngjBadCrcException$52c725b(intValue, ((Constructor) PngjBadSignature4).newInstance(objArr11));
            Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
            if (PngjBadSignature5 == null) {
                char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 14831);
                int i25 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 28;
                int indexOf2 = 721 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0);
                byte b9 = $$a[20];
                byte b10 = (byte) (b9 - 1);
                c = 20;
                i2 = 48883;
                Object[] objArr12 = new Object[1];
                b(b9, b10, b10, objArr12);
                PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(bitsPerPixel, i25, indexOf2, -779023007, false, (String) objArr12[0], null);
            } else {
                c = 20;
                i2 = 48883;
            }
            ((Field) PngjBadSignature5).set(null, PngjBadCrcException$52c725b);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
        Object[] objArr13 = new Object[1];
        c("豔隖맚\udc04\ue734ি⳩㜯娑紁螷ꫤ촡큿瘟ᶔ", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 6857, objArr13);
        Class<?> cls3 = Class.forName((String) objArr13[0]);
        Object[] objArr14 = new Object[1];
        c("豗羛毙圓䍎互㫌☀ቾᶖে\uf51d\ue171\uec9c\ud8d4쐔", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 62401, objArr14);
        intValue = ((Integer) cls3.getMethod((String) objArr14[0], Object.class).invoke(null, this)).intValue();
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i = PngjBadCrcException + 45;
        getFingerPrintQualityScore = i % 128;
        int i2 = i % 2;
        super.onCreate(bundle);
        if (i2 == 0) {
            throw null;
        }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onPause() {
        int i = PngjBadCrcException + 99;
        getFingerPrintQualityScore = i % 128;
        int i2 = i % 2;
        super.onPause();
        if (i2 == 0) {
            throw null;
        }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onResume() {
        int i = getFingerPrintQualityScore + 47;
        PngjBadCrcException = i % 128;
        int i2 = i % 2;
        super.onResume();
        if (i2 != 0) {
            throw null;
        }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onStart() {
        int i = getFingerPrintQualityScore + 95;
        PngjBadCrcException = i % 128;
        int i2 = i % 2;
        super.onStart();
        if (i2 != 0) {
            int i3 = 42 / 0;
        }
        getFingerPrintQualityScore = (PngjBadCrcException + com.karumi.dexter.R.styleable.AppCompatTheme_tooltipFrameBackground) % 128;
    }

    @Override // com.identy.FingerActivity
    public void values(Bundle bundle) {
        super.values(bundle);
        try {
            try {
                this.onErrorResponse = new setFingers(this, this, this.PngjExceptionInternal, IdentySdk.getInstance().u(), this.PngjUnsupportedException);
                int i = getFingerPrintQualityScore + 63;
                PngjBadCrcException = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
        }
    }
}
