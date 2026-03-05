package com.identy;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.identy.FingerActivity;
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
public class CaptureThumbActivity extends FingerActivity {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$f = 0;
    private static int $10;
    private static int $11;
    private static char PngjBadCrcException;
    private static final int getCaptureTime = 0;
    private static int getFingerPrintQualityScore;
    private static final byte[] getNfiq1Score = null;
    private static int getProcessingTime;
    private static char getScore;
    private static char valueOf;
    private static char values;

    public class values implements Runnable {
        private /* synthetic */ HashMap PngjException;

        public values(HashMap hashMap) {
            this.PngjException = hashMap;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (FingerActivity.PngjPrematureEnding) {
                CaptureThumbActivity.this.getPadSub1 = new com.identy.ui.c.onErrorResponse(CaptureThumbActivity.this, (a) this.PngjException.get(new Pair(CaptureThumbActivity.this.PngjExceptionInternal.getHand(), Finger.THUMB)), CaptureThumbActivity.this.getQualityScore);
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.copyFrom(CaptureThumbActivity.this.getPadSub1.getWindow().getAttributes());
                ((ViewGroup.LayoutParams) layoutParams).width = -1;
                CaptureThumbActivity.this.getPadSub1.show();
            }
        }
    }

    private static String $$i(byte b, int i, int i2) {
        int i3 = (i2 * 2) + 114;
        byte[] bArr = $$c;
        int i4 = b * 2;
        int i5 = (i * 2) + 4;
        byte[] bArr2 = new byte[i4 + 1];
        int i6 = -1;
        if (bArr == null) {
            i5++;
            i3 += -i5;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            byte b2 = bArr[i5];
            i5++;
            i3 += -b2;
        }
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        PngjException();
        getFingerPrintQualityScore = 0;
        getProcessingTime = 1;
        PngjBadCrcException = (char) 42547;
        values = (char) 14289;
        valueOf = (char) 30173;
        getScore = (char) 15380;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, byte b, Object[] objArr) {
        int i2;
        int i3;
        int i4 = i + 4;
        int i5 = s + 1;
        byte[] bArr = getNfiq1Score;
        int i6 = 118 - b;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            i2 = i4;
            i2++;
            i4 = (i4 + i7) - 2;
            bArr2[i3] = (byte) i4;
            i3++;
            if (i3 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i7 = bArr[i2];
            i2++;
            i4 = (i4 + i7) - 2;
            bArr2[i3] = (byte) i4;
            i3++;
            if (i3 == i5) {
            }
        } else {
            i2 = i4;
            i4 = i6;
            i3 = 0;
            bArr2[i3] = (byte) i4;
            i3++;
            if (i3 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, byte b, short s2, Object[] objArr) {
        int i;
        int i2;
        byte[] bArr = $$a;
        int i3 = (s * 6) + 13;
        int i4 = (b * 18) + 4;
        int i5 = (s2 * 2) + 80;
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i6 = 0;
            int i7 = i3;
            i4++;
            i5 = i7 + (-i5) + 5;
            bArr = bArr3;
            i = i6;
            bArr2[i] = (byte) i5;
            i2 = i + 1;
            if (i2 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b2 = bArr[i4];
            byte[] bArr4 = bArr;
            i7 = i5;
            i5 = b2;
            i6 = i2;
            bArr3 = bArr4;
            i4++;
            i5 = i7 + (-i5) + 5;
            bArr = bArr3;
            i = i6;
            bArr2[i] = (byte) i5;
            i2 = i + 1;
            if (i2 == i3) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i5;
            i2 = i + 1;
            if (i2 == i3) {
            }
        }
    }

    private static void d(String str, int i, Object[] objArr) {
        char[] cArr;
        int i2;
        Object obj = null;
        int i3 = 2;
        if (str != null) {
            int i4 = $11 + 13;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.d.e.PngjOutputException pngjOutputException = new com.d.e.PngjOutputException();
        char[] cArr3 = new char[cArr2.length];
        pngjOutputException.values = 0;
        char[] cArr4 = new char[2];
        while (true) {
            int i5 = pngjOutputException.values;
            if (i5 >= cArr2.length) {
                objArr[0] = new String(cArr3, 0, i);
                return;
            }
            int i6 = $10 + 67;
            $11 = i6 % 128;
            int i7 = 58224;
            char c = 1;
            if (i6 % i3 == 0) {
                cArr4[1] = cArr2[i5];
                cArr4[1] = cArr2[i5 << 1];
            } else {
                cArr4[0] = cArr2[i5];
                cArr4[1] = cArr2[i5 + 1];
            }
            int i8 = 0;
            while (i8 < 16) {
                char c2 = cArr4[c];
                char c3 = cArr4[0];
                char c4 = c;
                int i9 = (c3 + i7) ^ ((c3 << 4) + ((char) (valueOf ^ (-4937072311772145044L))));
                int i10 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getScore);
                    objArr2[i3] = Integer.valueOf(i10);
                    objArr2[c4] = Integer.valueOf(i9);
                    objArr2[0] = Integer.valueOf(c2);
                    Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(-222953304);
                    Class cls = Integer.TYPE;
                    if (PngjBadSignature == null) {
                        i2 = -222953304;
                        PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 36, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + ModuleDescriptor.MODULE_VERSION, 240741651, false, "n", new Class[]{cls, cls, cls, cls});
                    } else {
                        i2 = -222953304;
                    }
                    char charValue = ((Character) ((Method) PngjBadSignature).invoke(obj, objArr2)).charValue();
                    cArr4[c4] = charValue;
                    char c5 = cArr4[0];
                    int i11 = i3;
                    int i12 = (charValue + i7) ^ ((charValue << 4) + ((char) (PngjBadCrcException ^ (-4937072311772145044L))));
                    int i13 = charValue >>> 5;
                    Object[] objArr3 = new Object[4];
                    objArr3[3] = Integer.valueOf(values);
                    objArr3[i11] = Integer.valueOf(i13);
                    objArr3[c4] = Integer.valueOf(i12);
                    objArr3[0] = Integer.valueOf(c5);
                    Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i2);
                    if (PngjBadSignature2 == null) {
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) Drawable.resolveOpacity(0, 0), Color.rgb(0, 0, 0) + 16777251, Drawable.resolveOpacity(0, 0) + ModuleDescriptor.MODULE_VERSION, 240741651, false, "n", new Class[]{cls, cls, cls, cls});
                    }
                    cArr4[0] = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8++;
                    c = c4;
                    i3 = i11;
                    obj = null;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i14 = i3;
            char c6 = c;
            int i15 = pngjOutputException.values;
            cArr3[i15] = cArr4[0];
            cArr3[i15 + 1] = cArr4[c6];
            Object[] objArr4 = new Object[i14];
            objArr4[c6] = pngjOutputException;
            objArr4[0] = pngjOutputException;
            Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(150653722);
            if (PngjBadSignature3 == null) {
                byte b = (byte) 0;
                byte b2 = b;
                PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (8056 - Color.argb(0, 0, 0, 0)), ImageFormat.getBitsPerPixel(0) + 33, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 664, -199907679, false, $$i(b, b2, b2), new Class[]{Object.class, Object.class});
            }
            ((Method) PngjBadSignature3).invoke(null, objArr4);
            i3 = i14;
            obj = null;
        }
    }

    public static void init$0() {
        $$a = new byte[]{57, -3, -81, -41, -25, 12, 2, 45, -26, 2, 38, -42, 20, 35, -46, 26, 3, -6, 1, 16, -1, 6, -25, 12, 2, 42, -46, 26, 3, -6, 1, 16, -1, 6};
        $$b = 59;
    }

    public static void init$1() {
        $$c = new byte[]{58, -87, 109, 66};
        $$f = 116;
    }

    @Override // com.identy.FingerActivity, com.identy.d.PngjBadSignature
    public void PngjException(HashMap<Pair<Hand, Finger>, a> hashMap, HashMap<Pair<Hand, Finger>, a> hashMap2, Bitmap bitmap, boolean z, boolean z2) {
        super.PngjException(hashMap, hashMap2, bitmap, z, z2);
        if (z) {
            if (!this.getAsHighestSecurityLevelReached) {
                getProcessingTime = (getFingerPrintQualityScore + 85) % 128;
                return;
            }
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
            } catch (Exception unused) {
            }
            try {
                if (IdentySdk.getInstance().isDisplayPrints()) {
                    runOnUiThread(new values(hashMap));
                    return;
                }
                if (!IdentySdk.getInstance().v()) {
                    if (!IdentySdk.getInstance().isDisplayMoveNextDialog()) {
                        Action();
                        return;
                    }
                    int i2 = getFingerPrintQualityScore + 113;
                    getProcessingTime = i2 % 128;
                    if (i2 % 2 != 0) {
                        Attempt();
                        return;
                    } else {
                        Attempt();
                        throw null;
                    }
                }
                getProcessingTime = (getFingerPrintQualityScore + 33) % 128;
                if (FingerActivity.PngjPrematureEnding) {
                    com.identy.ui.c.PngjUnsupportedException pngjUnsupportedException = new com.identy.ui.c.PngjUnsupportedException(this, this.getQualityScore, this.PngjExceptionInternal, (FingerDetectionMode) FingerActivity.PngjException(com.identy.a.PngjException.values(), -388390624, new Object[]{this}, com.identy.a.PngjException.values(), 388390631, com.identy.a.PngjException.values(), com.identy.a.PngjException.values()));
                    this.getPadSub1 = pngjUnsupportedException;
                    short s = (short) 296;
                    try {
                        byte[] bArr = getNfiq1Score;
                        byte b = bArr[308];
                        Object[] objArr = new Object[1];
                        b(s, b, (byte) (b + 4), objArr);
                        Class<?> cls = Class.forName((String) objArr[0]);
                        byte b2 = bArr[8];
                        Object[] objArr2 = new Object[1];
                        b((short) 313, b2, b2, objArr2);
                        cls.getMethod((String) objArr2[0], null).invoke(pngjUnsupportedException, null);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0323  */
    @Override // com.identy.FingerActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void attachBaseContext(Context context) {
        int i;
        char c;
        int intValue;
        Object[] PngjBadSignature$1eba2e16;
        int i2;
        int i3;
        super.attachBaseContext(context);
        Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
        if (PngjBadSignature == null) {
            char red = (char) (14830 - Color.red(0));
            int doubleTapTimeout = 28 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int makeMeasureSpec = 721 - View.MeasureSpec.makeMeasureSpec(0, 0);
            byte b = $$a[18];
            byte b2 = (byte) (b - 1);
            Object[] objArr = new Object[1];
            c(b, b2, b2, objArr);
            PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(red, doubleTapTimeout, makeMeasureSpec, -815159504, false, (String) objArr[0], null);
        }
        long j = ((Field) PngjBadSignature).getLong(null);
        try {
            try {
                if (j != -1) {
                    getProcessingTime = (getFingerPrintQualityScore + 117) % 128;
                    long j2 = j + 4611686018427387833L;
                    i = 864471691;
                    Object[] objArr2 = new Object[1];
                    d("ꑞܶ쫎\ue1e2\ud83f湱咱㎱Ⰹᑼ礗\uec93歶呮揥㋏腒\ue096\uddac䝀梐됑", 22 - View.getDefaultSize(0, 0), objArr2);
                    Class<?> cls = Class.forName((String) objArr2[0]);
                    c = 18;
                    Object[] objArr3 = new Object[1];
                    d("佥꿟劓浪뻭똟\uf6f5쫮蒏敕\udb45ゟᝍ囡㋶\udbbd", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15, objArr3);
                    if (j2 >= ((Long) cls.getDeclaredMethod((String) objArr3[0], null).invoke(null, null)).longValue()) {
                        Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                        if (PngjBadSignature2 == null) {
                            char mirror = (char) (AndroidCharacter.getMirror('0') + 14782);
                            int indexOf = TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 29;
                            int i4 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 720;
                            byte b3 = $$a[18];
                            byte b4 = (byte) (b3 - 1);
                            byte b5 = b3;
                            Object[] objArr4 = new Object[1];
                            c(b4, b5, (byte) (b5 - 1), objArr4);
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(mirror, indexOf, i4, -779023007, false, (String) objArr4[0], null);
                        }
                        Object[] objArr5 = (Object[]) ((Field) PngjBadSignature2).get(null);
                        PngjBadSignature$1eba2e16 = new Object[]{new int[]{r8}, new int[1], r0, new int[]{r7}};
                        int i5 = ((int[]) objArr5[3])[0];
                        int i6 = ((int[]) objArr5[0])[0];
                        String[] strArr = (String[]) objArr5[2];
                        int identityHashCode = System.identityHashCode(this);
                        int i7 = ~identityHashCode;
                        int c2 = defpackage.a.c((~(identityHashCode | 642561768)) | 286326789, 464, (((-105677417) | identityHashCode) * (-464)) + (((~(i7 | 642561768)) | (~((-392004206) | i7)) | 286326789) * 464) + 1329158213, 1795394698);
                        int i8 = c2 ^ (c2 << 13);
                        int i9 = i8 ^ (i8 >>> 17);
                        ((int[]) PngjBadSignature$1eba2e16[1])[0] = i9 ^ (i9 << 5);
                        i2 = ((int[]) PngjBadSignature$1eba2e16[0])[0];
                        i3 = ((int[]) PngjBadSignature$1eba2e16[3])[0];
                        if (i3 != i2) {
                            Object[] objArr6 = {new int[]{r8}, new int[1], r1, new int[]{r7}};
                            int i10 = ((int[]) PngjBadSignature$1eba2e16[1])[0];
                            int i11 = ((int[]) PngjBadSignature$1eba2e16[3])[0];
                            int i12 = ((int[]) PngjBadSignature$1eba2e16[0])[0];
                            String[] strArr2 = (String[]) PngjBadSignature$1eba2e16[2];
                            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                            int c3 = defpackage.a.c(~((~elapsedCpuTime) | (-211849473)), 476, ((~((-211849473) | elapsedCpuTime)) * 952) + (((822420521 | r2) * (-476)) - 391390831), i10);
                            int i13 = c3 ^ (c3 << 13);
                            int i14 = i13 ^ (i13 >>> 17);
                            ((int[]) objArr6[1])[0] = i14 ^ (i14 << 5);
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        String[] strArr3 = (String[]) PngjBadSignature$1eba2e16[2];
                        if (strArr3 != null) {
                            getFingerPrintQualityScore = (getProcessingTime + 59) % 128;
                            int i15 = 0;
                            while (i15 < strArr3.length) {
                                arrayList.add(strArr3[i15]);
                                i15++;
                                getFingerPrintQualityScore = (getProcessingTime + 93) % 128;
                            }
                        }
                        int[] iArr = new int[i3];
                        int i16 = i3 - 1;
                        iArr[i16] = 1;
                        Toast.makeText((Context) null, iArr[((i3 * i16) % 2) - 1], 1).show();
                        Object[] objArr7 = {new int[]{r8}, new int[1], r1, new int[]{r7}};
                        int i17 = ((int[]) PngjBadSignature$1eba2e16[1])[0];
                        int i18 = ((int[]) PngjBadSignature$1eba2e16[3])[0];
                        int i19 = ((int[]) PngjBadSignature$1eba2e16[0])[0];
                        String[] strArr4 = (String[]) PngjBadSignature$1eba2e16[2];
                        int a = defpackage.a.a();
                        int c4 = defpackage.a.c((~(a | 512482668)) | (~((~a) | 522083305)), 627, (((~((-522083306) | a)) | 512482668) * (-627)) + (((-8487941) | a) * (-627)) + 1167369348, i17);
                        int i20 = c4 ^ (c4 << 13);
                        int i21 = i20 ^ (i20 >>> 17);
                        ((int[]) objArr7[1])[0] = i21 ^ (i21 << 5);
                        return;
                    }
                } else {
                    i = 864471691;
                    c = 18;
                }
                Object[] objArr8 = new Object[1];
                d("ꑞܶ쫎\ue1e2\ud83f湱咱㎱Ⰹᑼ礗\uec93歶呮揥㋏腒\ue096\uddac䝀梐됑", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 21, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                d("佥꿟劓浪뻭똟\uf6f5쫮蒏敕\udb45ゟᝍ囡㋶\udbbd", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 16, objArr9);
                Long valueOf2 = Long.valueOf(((Long) cls2.getDeclaredMethod((String) objArr9[0], null).invoke(null, null)).longValue());
                Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i);
                if (PngjBadSignature3 == null) {
                    char edgeSlop = (char) (14830 - (ViewConfiguration.getEdgeSlop() >> 16));
                    int i22 = 29 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    int i23 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 720;
                    byte b6 = $$a[c];
                    byte b7 = (byte) (b6 - 1);
                    Object[] objArr10 = new Object[1];
                    c(b6, b7, b7, objArr10);
                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(edgeSlop, i22, i23, -815159504, false, (String) objArr10[0], null);
                }
                ((Field) PngjBadSignature3).set(null, valueOf2);
                i2 = ((int[]) PngjBadSignature$1eba2e16[0])[0];
                i3 = ((int[]) PngjBadSignature$1eba2e16[3])[0];
                if (i3 != i2) {
                }
            } catch (Exception unused) {
                throw new RuntimeException();
            }
            Object[] objArr11 = {-1892002977};
            Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1439412966);
            if (PngjBadSignature4 == null) {
                PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 23 - ExpandableListView.getPackedPositionChild(0L), 697 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1457201313, false, null, new Class[]{Integer.TYPE});
            }
            PngjBadSignature$1eba2e16 = FingerActivity.PngjUnsupportedException.PngjBadSignature$1eba2e16(intValue, ((Constructor) PngjBadSignature4).newInstance(objArr11), 1795394698);
            Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
            if (PngjBadSignature5 == null) {
                char gidForName = (char) (Process.getGidForName(BuildConfig.FLAVOR) + 14831);
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 28;
                int lastIndexOf = TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) + 722;
                byte b8 = $$a[c];
                byte b9 = (byte) (b8 - 1);
                byte b10 = b8;
                Object[] objArr12 = new Object[1];
                c(b9, b10, (byte) (b10 - 1), objArr12);
                PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(gidForName, jumpTapTimeout, lastIndexOf, -779023007, false, (String) objArr12[0], null);
            }
            ((Field) PngjBadSignature5).set(null, PngjBadSignature$1eba2e16);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
        Object[] objArr13 = new Object[1];
        d("\uf7d8䃦\uf137숟㼭捩ꑞܶ綇\uffddἥ懥ᎌ搌䓄岡", (ViewConfiguration.getScrollBarSize() >> 8) + 16, objArr13);
        Class<?> cls3 = Class.forName((String) objArr13[0]);
        Object[] objArr14 = new Object[1];
        d("栠淎\udf3a\ue16d鏎☖\uf3e7䖼渇쐅깒\uf24d횏雾貞촲", 15 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0'), objArr14);
        intValue = ((Integer) cls3.getMethod((String) objArr14[0], Object.class).invoke(null, this)).intValue();
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        getQualityScore getqualityscore = new getQualityScore(this, bundle);
        byte[] bArr = getNfiq1Score;
        short s = bArr[104];
        int i = getCaptureTime;
        Object[] objArr = new Object[1];
        b(s, (byte) (s | 112), (byte) (i | 9), objArr);
        int i2 = 0;
        String str = (String) objArr[0];
        byte b = bArr[104];
        Object[] objArr2 = new Object[1];
        b((short) (i | 48), b, (byte) (b | 74), objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            char c = 31;
            int i3 = 18;
            Object[] objArr4 = new Object[1];
            b((short) (i | 48), bArr[31], bArr[18], objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b((short) (i | 63), bArr[77], bArr[8], objArr5);
            String str2 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            b((short) (i | 48), bArr[31], bArr[18], objArr6);
            Object[] objArr7 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i4 = 0;
            while (i4 < objArr7.length) {
                Object[] objArr8 = {objArr7[i4]};
                short s2 = (short) 131;
                byte[] bArr2 = getNfiq1Score;
                int i5 = i2;
                Object[] objArr9 = new Object[1];
                b(s2, bArr2[302], bArr2[i3], objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[i5]);
                char c2 = c;
                int i6 = i3;
                Object[] objArr10 = new Object[1];
                b((short) 147, bArr2[4], bArr2[104], objArr10);
                String str3 = (String) objArr10[i5];
                Object[] objArr11 = new Object[1];
                b((short) (getCaptureTime | 48), bArr2[c2], bArr2[i6], objArr11);
                Object invoke = cls2.getMethod(str3, Class.forName((String) objArr11[i5])).invoke(null, objArr8);
                Object[] objArr12 = new Object[1];
                b(s2, bArr2[302], bArr2[i6], objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[i5]);
                Object[] objArr13 = new Object[1];
                b((short) 153, bArr2[9], bArr2[23], objArr13);
                iArr[i4] = ((Integer) cls3.getMethod((String) objArr13[i5], null).invoke(invoke, null)).intValue();
                i4++;
                i2 = i5;
                c = c2;
                i3 = i6;
            }
            int i7 = i3;
            while (true) {
                int i8 = i2 + 1;
                try {
                } catch (Throwable th) {
                    if (i2 < 30 || i2 >= 32) {
                        throw th;
                    }
                    getqualityscore.PngjPrematureEnding = th;
                    getqualityscore.PngjBadSignature(22);
                    i2 = 28;
                }
                switch (getqualityscore.PngjBadSignature(iArr[i2])) {
                    case -18:
                        i2 = 32;
                    case -17:
                        getqualityscore.PngjBadSignature(19);
                        int i9 = getqualityscore.PngjBadSignature;
                        if (i9 == 0 || i9 != 1) {
                            i2 = 8;
                        } else {
                            i8 = 29;
                        }
                        break;
                    case -16:
                        getqualityscore.PngjBadSignature(17);
                        throw ((Throwable) getqualityscore.PngjUnsupportedException);
                        break;
                    case -15:
                        i2 = 33;
                    case -14:
                        i2 = 35;
                    case -13:
                        getqualityscore.PngjBadSignature(16);
                        if (getqualityscore.PngjBadSignature == 0) {
                            i8 = 27;
                        }
                    case -12:
                        getqualityscore.PngjException = 1;
                        getqualityscore.PngjBadSignature(1);
                        getqualityscore.PngjBadSignature(11);
                        getFingerPrintQualityScore = getqualityscore.PngjBadSignature;
                    case -11:
                        getqualityscore.PngjException = getProcessingTime;
                        getqualityscore.PngjBadSignature(8);
                    case -10:
                        i2 = 1;
                    case -9:
                        i2 = i7;
                    case -8:
                        getqualityscore.PngjBadSignature(13);
                        i2 = getqualityscore.PngjBadSignature == 0 ? 17 : i8;
                    case -7:
                        getqualityscore.PngjException = 1;
                        getqualityscore.PngjBadSignature(1);
                        getqualityscore.PngjBadSignature(11);
                        getProcessingTime = getqualityscore.PngjBadSignature;
                    case -6:
                        getqualityscore.PngjException = getFingerPrintQualityScore;
                        getqualityscore.PngjBadSignature(8);
                    case -5:
                        return;
                    case -4:
                        i2 = 10;
                    case -3:
                        i2 = 19;
                    case -2:
                        getqualityscore.PngjException = 2;
                        getqualityscore.PngjBadSignature(1);
                        getqualityscore.PngjBadSignature(2);
                        FingerActivity fingerActivity = (FingerActivity) getqualityscore.PngjUnsupportedException;
                        getqualityscore.PngjBadSignature(2);
                        super.onCreate((Bundle) getqualityscore.PngjUnsupportedException);
                    case UInt.MAX_VALUE /* -1 */:
                        i2 = 4;
                    default:
                }
            }
            throw th;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onPause() {
        int i = getProcessingTime + 3;
        getFingerPrintQualityScore = i % 128;
        int i2 = i % 2;
        super.onPause();
        if (i2 != 0) {
            throw null;
        }
        int i3 = getProcessingTime + 89;
        getFingerPrintQualityScore = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onResume() {
        int i = getProcessingTime + 113;
        getFingerPrintQualityScore = i % 128;
        int i2 = i % 2;
        super.onResume();
        if (i2 != 0) {
            int i3 = 31 / 0;
        }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onStart() {
        int i = getFingerPrintQualityScore + 97;
        getProcessingTime = i % 128;
        int i2 = i % 2;
        super.onStart();
        if (i2 == 0) {
            int i3 = 92 / 0;
        }
        getFingerPrintQualityScore = (getProcessingTime + 59) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x028b, code lost:
    
        if (r4 < r11) goto L79;
     */
    @Override // com.identy.FingerActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void values(Bundle bundle) {
        int i;
        getQualityScore getqualityscore = new getQualityScore(this, bundle);
        int i2 = getCaptureTime;
        Object[] objArr = new Object[1];
        b((short) 160, (byte) (i2 | 54), (byte) (i2 | 9), objArr);
        String str = (String) objArr[0];
        char c = 'h';
        byte b = getNfiq1Score[104];
        Object[] objArr2 = new Object[1];
        b((short) (i2 | 48), b, (byte) (b | 74), objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            char c2 = 31;
            char c3 = 18;
            Object[] objArr4 = new Object[1];
            b((short) (i2 | 48), r7[31], r7[18], objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b((short) (i2 | 63), r7[77], r7[8], objArr5);
            String str2 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            b((short) (i2 | 48), r7[31], r7[18], objArr6);
            Object[] objArr7 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i3 = 0;
            while (i3 < objArr7.length) {
                try {
                    Object[] objArr8 = {objArr7[i3]};
                    short s = (short) 131;
                    byte[] bArr = getNfiq1Score;
                    char c4 = c;
                    byte b2 = bArr[302];
                    char c5 = c2;
                    byte b3 = bArr[c3];
                    char c6 = c3;
                    Object[] objArr9 = new Object[1];
                    b(s, b2, b3, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    b((short) 147, bArr[4], bArr[c4], objArr10);
                    String str3 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    b((short) (getCaptureTime | 48), bArr[c5], bArr[c6], objArr11);
                    Object invoke = cls2.getMethod(str3, Class.forName((String) objArr11[0])).invoke(null, objArr8);
                    Object[] objArr12 = new Object[1];
                    b(s, bArr[302], bArr[c6], objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    b((short) 153, bArr[9], bArr[23], objArr13);
                    iArr[i3] = ((Integer) cls3.getMethod((String) objArr13[0], null).invoke(invoke, null)).intValue();
                    i3++;
                    c = c4;
                    c2 = c5;
                    c3 = c6;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char c7 = c3;
            int i4 = 9;
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                try {
                } catch (Throwable th2) {
                    short s2 = (short) 278;
                    byte b4 = (byte) (s2 & 123);
                    byte[] bArr2 = getNfiq1Score;
                    Object[] objArr14 = new Object[1];
                    b(s2, b4, bArr2[c7], objArr14);
                    if (!Class.forName((String) objArr14[0]).isInstance(th2) || i5 < 4 || i5 >= 6) {
                        Object[] objArr15 = new Object[1];
                        b(s2, b4, bArr2[c7], objArr15);
                        if (!Class.forName((String) objArr15[0]).isInstance(th2) || i5 < 7) {
                            i = i4;
                        } else {
                            i = i4;
                        }
                        Object[] objArr16 = new Object[1];
                        b(s2, b4, bArr2[c7], objArr16);
                        if (!Class.forName((String) objArr16[0]).isInstance(th2) || i5 < 10 || i5 >= 11) {
                            byte b5 = bArr2[c7];
                            Object[] objArr17 = new Object[1];
                            b(s2, b4, b5, objArr17);
                            if (!Class.forName((String) objArr17[0]).isInstance(th2) || i5 < 12 || i5 >= 19) {
                                throw th2;
                            }
                        }
                    } else {
                        i = i4;
                    }
                    getqualityscore.PngjPrematureEnding = th2;
                    getqualityscore.PngjBadSignature(22);
                    i4 = i;
                    i5 = 19;
                }
                switch (getqualityscore.PngjBadSignature(iArr[i5])) {
                    case -16:
                        i5 = 26;
                    case -15:
                        i5 = 38;
                    case -14:
                        getqualityscore.PngjBadSignature(16);
                        if (getqualityscore.PngjBadSignature == 0) {
                            i6 = 37;
                        }
                        i5 = i6;
                    case -13:
                        getqualityscore.PngjException = 1;
                        getqualityscore.PngjBadSignature(1);
                        getqualityscore.PngjBadSignature(11);
                        getFingerPrintQualityScore = getqualityscore.PngjBadSignature;
                        i5 = i6;
                    case -12:
                        getqualityscore.PngjException = getProcessingTime;
                        getqualityscore.PngjBadSignature(8);
                        i5 = i6;
                    case -11:
                        i5 = 1;
                    case -10:
                        return;
                    case -9:
                        i5 = 28;
                    case -8:
                        getqualityscore.PngjException = 2;
                        getqualityscore.PngjBadSignature(1);
                        getqualityscore.PngjBadSignature(2);
                        FingerActivity fingerActivity = (FingerActivity) getqualityscore.PngjUnsupportedException;
                        getqualityscore.PngjBadSignature(2);
                        fingerActivity.onErrorResponse = (e1) getqualityscore.PngjUnsupportedException;
                        i5 = i6;
                    case -7:
                        getqualityscore.PngjException = 5;
                        getqualityscore.PngjBadSignature(1);
                        getqualityscore.PngjBadSignature(2);
                        Activity activity = (Activity) getqualityscore.PngjUnsupportedException;
                        getqualityscore.PngjBadSignature(2);
                        com.identy.d.PngjBadSignature pngjBadSignature = (com.identy.d.PngjBadSignature) getqualityscore.PngjUnsupportedException;
                        getqualityscore.PngjBadSignature(2);
                        FingerDetectionMode fingerDetectionMode = (FingerDetectionMode) getqualityscore.PngjUnsupportedException;
                        getqualityscore.PngjBadSignature(11);
                        boolean z = getqualityscore.PngjBadSignature != 0;
                        getqualityscore.PngjBadSignature(11);
                        getqualityscore.PngjPrematureEnding = new getFingers(activity, pngjBadSignature, fingerDetectionMode, z, getqualityscore.PngjBadSignature != 0);
                        getqualityscore.PngjBadSignature(26);
                        i5 = i6;
                    case -6:
                        getqualityscore.PngjException = 1;
                        getqualityscore.PngjBadSignature(1);
                        getqualityscore.PngjBadSignature(2);
                        getqualityscore.PngjException = ((FingerActivity) getqualityscore.PngjUnsupportedException).PngjUnsupportedException ? 1 : 0;
                        getqualityscore.PngjBadSignature(8);
                        i5 = i6;
                    case -5:
                        getqualityscore.PngjException = 1;
                        getqualityscore.PngjBadSignature(1);
                        getqualityscore.PngjBadSignature(2);
                        getqualityscore.PngjException = ((IdentySdk) getqualityscore.PngjUnsupportedException).u() ? 1 : 0;
                        getqualityscore.PngjBadSignature(8);
                        i5 = i6;
                    case -4:
                        getqualityscore.PngjPrematureEnding = IdentySdk.getInstance();
                        getqualityscore.PngjBadSignature(26);
                        i5 = i6;
                    case -3:
                        getqualityscore.PngjException = 1;
                        getqualityscore.PngjBadSignature(1);
                        getqualityscore.PngjBadSignature(2);
                        getqualityscore.PngjPrematureEnding = ((FingerActivity) getqualityscore.PngjUnsupportedException).PngjExceptionInternal;
                        getqualityscore.PngjBadSignature(26);
                        i5 = i6;
                    case -2:
                        getqualityscore.PngjException = 2;
                        getqualityscore.PngjBadSignature(1);
                        getqualityscore.PngjBadSignature(2);
                        FingerActivity fingerActivity2 = (FingerActivity) getqualityscore.PngjUnsupportedException;
                        getqualityscore.PngjBadSignature(2);
                        super.values((Bundle) getqualityscore.PngjUnsupportedException);
                        i5 = i6;
                    case UInt.MAX_VALUE /* -1 */:
                        i5 = 21;
                    default:
                        i5 = i6;
                }
            }
        } catch (Throwable th3) {
            Throwable cause2 = th3.getCause();
            if (cause2 == null) {
                throw th3;
            }
            throw cause2;
        }
    }

    public static void PngjException() {
        getNfiq1Score = new byte[]{35, 90, 104, -37, 6, -3, 9, -5, 3, 7, -4, 3, 8, -5, 10, -6, 11, -7, 12, -8, 3, 9, -6, 13, -9, 3, 10, -7, 3, 11, -8, 15, -11, 7, 1, -2, 3, 12, -9, 7, 3, -4, 3, 13, -10, 3, 14, -11, 3, 6, 1, -2, 3, 6, 1, -2, 3, 6, 2, -3, 7, 5, -6, 7, 6, -7, 11, -7, 3, 6, 3, -4, 7, 3, -4, 3, 6, 4, -5, 3, 6, 5, -6, 3, 6, 6, -7, 3, 6, 7, -8, 13, -9, 7, 9, -10, 3, 10, -7, 3, 6, 8, -9, 8, 0, -2, 3, 6, 9, -10, 8, 1, -3, 3, 6, 9, -7, 23, -19, -49, 64, -9, 15, -5, -55, 39, 35, 0, -7, 7, -5, -1, -2, -1, 13, -7, 23, -19, -49, 64, -9, 15, -5, -55, 29, 39, 8, -13, 4, 0, 15, -19, 13, 11, -14, -20, 25, 7, 8, -28, 13, 13, 11, -14, 6, -3, 8, 3, -5, 8, 4, -6, 3, 7, -4, 8, 5, -7, 3, 8, -5, 8, 7, -9, 3, 9, -6, 3, 10, -7, 8, 8, -10, 3, 11, -8, 8, 9, -11, 9, -1, -2, 8, 4, -6, 9, 0, -3, 9, 1, -4, 3, 12, -9, 3, 13, -10, 3, 14, -11, 12, -8, 3, 6, 1, -2, 9, 2, -5, 9, 2, -5, 11, -7, 12, -8, 3, 6, 2, -3, 13, -9, 3, 6, 1, -2, 3, 6, 3, -4, 9, 3, -6, 9, 4, -7, 11, -7, 3, 6, 4, -5, 9, 2, -5, 11, -7, 3, 6, 5, -6, 3, 6, 6, -7, 3, 6, 7, -8, 3, 6, 7, -7, 23, -19, -49, 64, -9, 15, -5, -55, 25, 53, -19, 4, 13, 6, -9, 8, 1, 15, -8, 16, -1, -4, -3, -52, 53, 17, 2, -64, 24, 39, -6, 13, 5, -6, -9, 9, 10};
        getCaptureTime = 64;
    }
}
