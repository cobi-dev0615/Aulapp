package com.identy;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ExpandableListView;
import com.d.e.a.c.getPadSub3B15685$PngjException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.identy.enums.Finger;
import com.identy.enums.FingerDetectionMode;
import com.identy.enums.Hand;
import com.karumi.dexter.BuildConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.identy.nativealgo.NativeAlgoUtils;

/* loaded from: classes2.dex */
public class EnrollThumbActivity extends FingerActivity {
    private static  byte[] $$a = null;
    private static  int $$b = 0;
    private static  byte[] $$c = null;
    private static  int $$f = 0;
    private static int $10;
    private static int $11;
    private static int getFingerPrintQualityScore;
    private static int valueOf;
    private static char[] values;
    HashMap PngjBadCrcException = new HashMap();

    public class PngjBadCrcException implements getPadSub3B15685$PngjException {
        public PngjBadCrcException() {
        }

        @Override // com.d.e.a.c.getPadSub3B15685$PngjException
        public final void PngjBadCrcException(int i, int i2) {
            if (i != i2) {
                EnrollThumbActivity.this.finish();
            }
        }
    }

    public class valueOf implements com.identy.d.PngjBadCrcException {

        public class PngjException implements Runnable {
            public PngjException() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (FingerActivity.PngjPrematureEnding) {
                    EnrollThumbActivity enrollThumbActivity = EnrollThumbActivity.this;
                    EnrollThumbActivity enrollThumbActivity2 = EnrollThumbActivity.this;
                    enrollThumbActivity.getPadSub1 = new com.identy.ui.c.onErrorResponse(enrollThumbActivity2, (a) enrollThumbActivity2.PngjBadCrcException.get(new Pair(EnrollThumbActivity.this.PngjExceptionInternal.getHand(), Finger.THUMB)), EnrollThumbActivity.this.getQualityScore);
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                    layoutParams.copyFrom(EnrollThumbActivity.this.getPadSub1.getWindow().getAttributes());
                    ((ViewGroup.LayoutParams) layoutParams).width = -1;
                    EnrollThumbActivity.this.getPadSub1.show();
                }
            }
        }

        public valueOf() {
        }

        @Override // com.identy.d.PngjBadCrcException
        public final /* synthetic */ void values() {
            try {
                e1.values(new Object[]{EnrollThumbActivity.this.onErrorResponse}, com.identy.i.PngjPrematureEnding.values(), com.identy.i.PngjPrematureEnding.values(), -431637600, com.identy.i.PngjPrematureEnding.values(), 431637601, com.identy.i.PngjPrematureEnding.values());
                IdentySdk identySdk = IdentySdk.getInstance();
                EnrollThumbActivity enrollThumbActivity = EnrollThumbActivity.this;
                FingerDetectionMode fingerDetectionMode = enrollThumbActivity.PngjExceptionInternal;
                HashMap hashMap = enrollThumbActivity.PngjBadCrcException;
                e1 e1Var = enrollThumbActivity.onErrorResponse;
                long j = e1Var.toString;
                long j2 = e1Var.Enroll2IndexActivity;
                int i = e1Var.getEncryptedTemplates;
                byte[] PngjPrematureEnding = e1Var.PngjPrematureEnding();
                e1 e1Var2 = EnrollThumbActivity.this.onErrorResponse;
                identySdk.a(fingerDetectionMode, hashMap, j, j2, 0L, i, PngjPrematureEnding, e1Var2.setFoundMatchingTemplates + e1Var2.Enroll2IndexActivity, e1Var2.closeDialog, e1Var2.getHeight, e1Var2.ERRORS);
            } catch (Exception unused) {
            }
            EnrollThumbActivity.this.onErrorResponse.valueOf();
            try {
                EnrollThumbActivity.this.Action.PngjException();
            } catch (Exception unused2) {
            }
            try {
                if (IdentySdk.getInstance().isDisplayPrints()) {
                    EnrollThumbActivity.this.runOnUiThread(new PngjException());
                    return;
                }
                if (!IdentySdk.getInstance().v()) {
                    if (IdentySdk.getInstance().isDisplayMoveNextDialog()) {
                        EnrollThumbActivity.this.Attempt();
                        return;
                    } else {
                        EnrollThumbActivity.this.Action();
                        return;
                    }
                }
                EnrollThumbActivity enrollThumbActivity2 = EnrollThumbActivity.this;
                EnrollThumbActivity enrollThumbActivity3 = EnrollThumbActivity.this;
                enrollThumbActivity2.getPadSub1 = new com.identy.ui.c.PngjOutputException(enrollThumbActivity3, enrollThumbActivity3.getQualityScore, enrollThumbActivity3.PngjExceptionInternal, (FingerDetectionMode) FingerActivity.PngjException(com.identy.a.PngjException.values(), -388390624, new Object[]{enrollThumbActivity3}, com.identy.a.PngjException.values(), 388390631, com.identy.a.PngjException.values(), com.identy.a.PngjException.values()));
                EnrollThumbActivity.this.getPadSub1.show();
            } catch (Exception unused3) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$i(byte b, int i, int i2) {
        int i3;
        int i4 = 102 - i2;
        byte[] bArr = $$c;
        int i5 = i + 4;
        int i6 = (b * 3) + 1;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i4;
            i3 = 0;
            int i8 = i5;
            int i9 = i8;
            i4 = i5 + (-i7);
            i5 = i9;
            int i10 = i5 + 1;
            bArr2[i3] = (byte) i4;
            i3++;
            if (i3 == i6) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i10];
            int i11 = i4;
            i8 = i10;
            i5 = i11;
            int i92 = i8;
            i4 = i5 + (-i7);
            i5 = i92;
            int i102 = i5 + 1;
            bArr2[i3] = (byte) i4;
            i3++;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            int i1022 = i5 + 1;
            bArr2[i3] = (byte) i4;
            i3++;
            if (i3 == i6) {
            }
        }
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        valueOf = 0;
        getFingerPrintQualityScore = 1;
        values = new char[]{40100, 40179, 40189, 40191, 40164, 40184, 40178, 40157, 40154, 40165, 40132, 40148, 40178, 40162, 40167, 40184, 40189, 40140, 40131, 40185, 40189, 40179, 40102, 40188, 40178, 40188, 40165, 40184, 40176, 40143, 40143, 40183, 40178, 40164, 40186, 40191, 40189, 40111, 40165, 40163, 40163, 40135, 40141, 40166, 40167, 40162, 40130, 40152, 40166, 39958, 40171, 40172, 40161, 40188, 40025, 40031, 40004, 40012, 40001, 40001, 40009, 40019, 39983, 40005, 40000, 39976, 40020, 40004, 40031};
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, short s, Object[] objArr) {
        int i2;
        int i3;
        int i4 = i + 4;
        int i5 = 19 - b;
        int i6 = (s * 38) + 80;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            i6 = i5;
            i6 = i6 + i7 + 5;
            i2 = i3;
            i4++;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i7 = bArr[i4];
            i6 = i6 + i7 + 5;
            i2 = i3;
            i4++;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i4++;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
            }
        }
    }

    private static void c(int[] iArr, String str, boolean z, Object[] objArr) {
        byte[] bArr;
        int i;
        long j;
        int i2;
        byte[] bArr2;
        int i3;
        String str2 = str;
        int i4 = $11 + 29;
        $10 = i4 % 128;
        byte[] bArr3 = null;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (str2 != null) {
            bArr3 = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr4 = bArr3;
        com.d.e.e1 e1Var = new com.d.e.e1();
        int i5 = 0;
        int i6 = iArr[0];
        int i7 = iArr[1];
        int i8 = iArr[2];
        int i9 = iArr[3];
        char[] cArr = values;
        Class cls = Integer.TYPE;
        if (cArr != null) {
            int i10 = $11;
            j = 0;
            $10 = (i10 + 97) % 128;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            i = 2;
            $10 = (i10 + 63) % 128;
            int i11 = 0;
            while (i11 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i11])};
                    Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(-259747866);
                    if (PngjBadSignature == null) {
                        char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                        int red = 35 - Color.red(i5);
                        bArr2 = bArr4;
                        int lastIndexOf = 1312 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', i5);
                        byte b = $$c[2];
                        byte b2 = (byte) (b - 1);
                        byte b3 = (byte) (-b);
                        i3 = i11;
                        PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(packedPositionChild, red, lastIndexOf, 208396893, false, $$i(b2, b3, (byte) (b3 + 3)), new Class[]{cls});
                    } else {
                        bArr2 = bArr4;
                        i3 = i11;
                    }
                    cArr2[i3] = ((Character) ((Method) PngjBadSignature).invoke(null, objArr2)).charValue();
                    i11 = i3 + 1;
                    bArr4 = bArr2;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();

                    if (cause == null) {

                        throw new RuntimeException(th);

                    }

                    throw new RuntimeException(cause);
                }
            }
            bArr = bArr4;
            $10 = ($11 + 91) % 128;
            cArr = cArr2;
        } else {
            bArr = bArr4;
            i = 2;
            j = 0;
        }
        char[] cArr3 = new char[i7];
        System.arraycopy(cArr, i6, cArr3, 0, i7);
        if (bArr != null) {
            $11 = ($10 + 45) % 128;
            char[] cArr4 = new char[i7];
            e1Var.PngjBadSignature = 0;
            char c = 0;
            while (true) {
                int i12 = e1Var.PngjBadSignature;
                if (i12 >= i7) {
                    break;
                }
                if (bArr[i12] == 1) {
                    char c2 = cArr3[i12];
                    Object[] objArr3 = new Object[i];
                    objArr3[1] = Integer.valueOf(c);
                    objArr3[0] = Integer.valueOf(c2);
                    Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-655108508);
                    if (PngjBadSignature2 == null) {
                        char resolveSize = (char) (View.resolveSize(0, 0) + 31882);
                        int gidForName = 31 - Process.getGidForName(BuildConfig.FLAVOR);
                        int keyRepeatDelay = 1250 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        byte b4 = $$c[2];
                        byte b5 = (byte) (b4 - 1);
                        byte b6 = (byte) (-b4);
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(resolveSize, gidForName, keyRepeatDelay, 605862879, false, $$i(b5, b6, (byte) (b6 + 4)), new Class[]{cls, cls});
                    }
                    cArr4[i12] = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr3)).charValue();
                } else {
                    Object[] objArr4 = {Integer.valueOf(cArr3[i12]), Integer.valueOf(c)};
                    Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(269554740);
                    if (PngjBadSignature3 == null) {
                        char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int red2 = Color.red(0) + 35;
                        int i13 = 1599 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1));
                        byte b7 = $$c[2];
                        byte b8 = (byte) (b7 - 1);
                        byte b9 = (byte) (-b7);
                        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(scrollBarFadeDuration, red2, i13, -318867057, false, $$i(b8, b9, (byte) (b9 + 1)), new Class[]{cls, cls});
                    }
                    cArr4[i12] = ((Character) ((Method) PngjBadSignature3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[e1Var.PngjBadSignature];
                Object[] objArr5 = {e1Var, e1Var};
                Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1060060353);
                if (PngjBadSignature4 == null) {
                    PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) View.MeasureSpec.getMode(0), 35 - (ViewConfiguration.getJumpTapTimeout() >> 16), ExpandableListView.getPackedPositionGroup(j) + ModuleDescriptor.MODULE_VERSION, -1010806406, false, "g", new Class[]{Object.class, Object.class});
                }
                ((Method) PngjBadSignature4).invoke(null, objArr5);
                i = 2;
            }
            cArr3 = cArr4;
        }
        if (i9 > 0) {
            char[] cArr5 = new char[i7];
            i2 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i7);
            int i14 = i7 - i9;
            System.arraycopy(cArr5, 0, cArr3, i14, i9);
            System.arraycopy(cArr5, i9, cArr3, 0, i14);
        } else {
            i2 = 0;
        }
        if (!(!z)) {
            char[] cArr6 = new char[i7];
            while (true) {
                e1Var.PngjBadSignature = i2;
                int i15 = e1Var.PngjBadSignature;
                if (i15 >= i7) {
                    break;
                }
                $10 = ($11 + 23) % 128;
                cArr6[i15] = cArr3[(i7 - i15) - 1];
                i2 = i15 + 1;
            }
            cArr3 = cArr6;
        }
        if (i8 > 0) {
            int i16 = $10 + 39;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            e1Var.PngjBadSignature = 0;
            while (true) {
                int i18 = e1Var.PngjBadSignature;
                if (i18 >= i7) {
                    break;
                }
                cArr3[i18] = (char) (cArr3[i18] - iArr[2]);
                e1Var.PngjBadSignature = i18 + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public static void init$0() {
        $$a = new byte[]{72, 101, -55, -108, -26, 6, 4, -21, 9, 25, -12, -2, -45, 26, -2, -38, 42, -20, -35, 46, -26, -3, 6, -1, -16, 1, -6, 25, -12, -2, -42, 46, -26, -3, 6, -1, -16, 1, -6};
        $$b = 65;
    }

    public static void init$1() {
        $$c = new byte[]{56, -68, 1, -57};
        $$f = 225;
    }

    @Override // com.identy.FingerActivity, com.identy.d.PngjBadSignature
    public final void PngjBadSignature(List<HashMap<Pair<Hand, Finger>, a>> list, boolean z, boolean z2, HashMap<Pair<Hand, Finger>, Float> hashMap) {
        int i = valueOf + 25;
        getFingerPrintQualityScore = i % 128;
        int i2 = i % 2;
        super.PngjBadSignature(list, z, z2, hashMap);
        if (i2 == 0) {
            int i3 = 34 / 0;
        }
        getFingerPrintQualityScore = (valueOf + 79) % 128;
    }

    @Override // com.identy.FingerActivity, com.identy.d.PngjBadSignature
    public void PngjException(HashMap<Pair<Hand, Finger>, a> hashMap, HashMap<Pair<Hand, Finger>, a> hashMap2, Bitmap bitmap, boolean z, boolean z2) {
        HashMap<Pair<Hand, Finger>, a> hashMap3;
        EnrollThumbActivity enrollThumbActivity;
        int i = valueOf + 65;
        getFingerPrintQualityScore = i % 128;
        if (i % 2 == 0) {
            super.PngjException(hashMap, hashMap2, bitmap, z, z2);
            int i2 = 40 / 0;
            if (!z) {
                return;
            }
            hashMap3 = hashMap;
            enrollThumbActivity = this;
        } else {
            super.PngjException(hashMap, hashMap2, bitmap, z, z2);
            hashMap3 = hashMap;
            enrollThumbActivity = this;
            if (!z) {
                return;
            }
        }
        if (!enrollThumbActivity.getAsHighestSecurityLevelReached) {
            getFingerPrintQualityScore = (valueOf + 7) % 128;
            return;
        }
        enrollThumbActivity.PngjBadCrcException.clear();
        enrollThumbActivity.PngjBadCrcException.putAll(hashMap3);
        enrollThumbActivity.onErrorResponse.PngjException(R.string.id_processing);
        new getAsHighestSecurityLevelReached(this, new valueOf()).PngjException(enrollThumbActivity.PngjBadCrcException, e1.PngjInputException);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x030d  */
    @Override // com.identy.FingerActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void attachBaseContext(Context context) {
        char c;
        char c2;
        int intValue;
        Object[] PngjException$1eba2e16;
        valueOf = (getFingerPrintQualityScore + 13) % 128;
        super.attachBaseContext(context);
        Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
        if (PngjBadSignature == null) {
            char indexOf = (char) (14830 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0));
            int pressedStateDuration = 28 - (ViewConfiguration.getPressedStateDuration() >> 16);
            int indexOf2 = 720 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0);
            byte b = $$a[6];
            byte b2 = (byte) (b - 4);
            Object[] objArr = new Object[1];
            b(b, b2, b2, objArr);
            PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf, pressedStateDuration, indexOf2, -815159504, false, (String) objArr[0], null);
        }
        long j = ((Field) PngjBadSignature).getLong(null);
        try {
            try {
                if (j != -1) {
                    long j2 = j + 4611686018427387951L;
                    c = 6;
                    Object[] objArr2 = new Object[1];
                    c(new int[]{0, 22, 0, 0}, "\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000", false, objArr2);
                    Class<?> cls = Class.forName((String) objArr2[0]);
                    c2 = 25;
                    Object[] objArr3 = new Object[1];
                    c(new int[]{22, 15, 0, 0}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000", false, objArr3);
                    if (j2 >= ((Long) cls.getDeclaredMethod((String) objArr3[0], null).invoke(null, null)).longValue()) {
                        Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                        if (PngjBadSignature2 == null) {
                            char indexOf3 = (char) (TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 14830);
                            int capsMode = TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 28;
                            int gidForName = 720 - Process.getGidForName(BuildConfig.FLAVOR);
                            Object[] objArr4 = new Object[1];
                            b((byte) 22, $$a[5], (byte) ($$a[25] - 1), objArr4);
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf3, capsMode, gidForName, -779023007, false, (String) objArr4[0], null);
                        }
                        Object[] objArr5 = (Object[]) ((Field) PngjBadSignature2).get(null);
                        PngjException$1eba2e16 = new Object[]{new int[]{0}, new int[1], 0, new int[]{0}};
                        int i = ((int[]) objArr5[3])[0];
                        int i2 = ((int[]) objArr5[0])[0];
                        String[] strArr = (String[]) objArr5[2];
                        int c3 = defpackage.a.c((~System.identityHashCode(this)) | 931018483, -828, (((~(931018483 | 0)) | 103547490) * (-828)) - 1338267583, -1625002363);
                        int i3 = c3 ^ (c3 << 13);
                        int i4 = i3 ^ (i3 >>> 17);
                        ((int[]) PngjException$1eba2e16[1])[0] = i4 ^ (i4 << 5);
                        if (((int[]) PngjException$1eba2e16[3])[0] == ((int[]) PngjException$1eba2e16[0])[0]) {
                            ArrayList arrayList = new ArrayList();
                            String[] strArr2 = (String[]) PngjException$1eba2e16[2];
                            if (strArr2 == null) {
                                throw null;
                            }
                            valueOf = (getFingerPrintQualityScore + 5) % 128;
                            for (String str : strArr2) {
                                arrayList.add(str);
                            }
                            throw null;
                        }
                        getFingerPrintQualityScore = (valueOf + 55) % 128;
                        Object[] objArr6 = {new int[]{0}, new int[1], 0, new int[]{0}};
                        int i5 = ((int[]) PngjException$1eba2e16[1])[0];
                        int i6 = ((int[]) PngjException$1eba2e16[3])[0];
                        int i7 = ((int[]) PngjException$1eba2e16[0])[0];
                        String[] strArr3 = (String[]) PngjException$1eba2e16[2];
                        int identityHashCode = System.identityHashCode(this);
                        int c4 = defpackage.a.c((~(identityHashCode | (-142606401))) | 891405829, 235, (((~((-142883273) | identityHashCode)) | 891682701) * (-470)) + ((((~((~identityHashCode) | (-142883273))) | 891682701) * (-235)) - 1563529013), i5);
                        int i8 = c4 ^ (c4 << 13);
                        int i9 = i8 ^ (i8 >>> 17);
                        ((int[]) objArr6[1])[0] = i9 ^ (i9 << 5);
                        return;
                    }
                } else {
                    c = 6;
                    c2 = 25;
                }
                Object[] objArr7 = new Object[1];
                c(new int[]{0, 22, 0, 0}, "\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000", false, objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                Object[] objArr8 = new Object[1];
                c(new int[]{22, 15, 0, 0}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000", false, objArr8);
                Long valueOf2 = Long.valueOf(((Long) cls2.getDeclaredMethod((String) objArr8[0], null).invoke(null, null)).longValue());
                Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
                if (PngjBadSignature3 == null) {
                    char indexOf4 = (char) (14830 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR));
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 29;
                    int resolveOpacity = 721 - Drawable.resolveOpacity(0, 0);
                    byte b3 = $$a[c];
                    byte b4 = (byte) (b3 - 4);
                    Object[] objArr9 = new Object[1];
                    b(b3, b4, b4, objArr9);
                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf4, packedPositionChild, resolveOpacity, -815159504, false, (String) objArr9[0], null);
                }
                ((Field) PngjBadSignature3).set(null, valueOf2);
                getFingerPrintQualityScore = (valueOf + 81) % 128;
                if (((int[]) PngjException$1eba2e16[3])[0] == ((int[]) PngjException$1eba2e16[0])[0]) {
                }
            } catch (Exception unused) {
                throw new RuntimeException();
            }
            Object[] objArr10 = {-49204293};
            Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1439412966);
            if (PngjBadSignature4 == null) {
                PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) KeyEvent.normalizeMetaState(0), 24 - View.MeasureSpec.getMode(0), Color.rgb(0, 0, 0) + 16777913, 1457201313, false, null, new Class[]{Integer.TYPE});
            }
            PngjException$1eba2e16 = NativeAlgoUtils.PngjException$1eba2e16(intValue, ((Constructor) PngjBadSignature4).newInstance(objArr10), 459156405);
            Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
            if (PngjBadSignature5 == null) {
                char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 14830);
                int pressedStateDuration2 = 28 - (ViewConfiguration.getPressedStateDuration() >> 16);
                int rgb = (-16776495) - Color.rgb(0, 0, 0);
                Object[] objArr11 = new Object[1];
                b((byte) 22, $$a[5], (byte) ($$a[c2] - 1), objArr11);
                PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(threadPriority, pressedStateDuration2, rgb, -779023007, false, (String) objArr11[0], null);
            }
            ((Field) PngjBadSignature5).set(null, PngjException$1eba2e16);
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
        Object[] objArr12 = new Object[1];
        c(new int[]{37, 16, 12, 0}, "\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000", false, objArr12);
        Class<?> cls3 = Class.forName((String) objArr12[0]);
        Object[] objArr13 = new Object[1];
        c(new int[]{53, 16, 103, 0}, "\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001", false, objArr13);
        intValue = ((Integer) cls3.getMethod((String) objArr13[0], Object.class).invoke(null, this)).intValue();
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Object[] objArr = {this, 1, new PngjBadCrcException()};
            Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1578525895);
            if (PngjBadSignature == null) {
                char blue = (char) (14830 - Color.blue(0));
                int i = 29 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int i2 = 722 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                byte b = $$a[23];
                Object[] objArr2 = new Object[1];
                b(b, (byte) (b & 13), $$a[25], objArr2);
                PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(blue, i, i2, 1560737410, false, (String) objArr2[0], new Class[]{Context.class, Integer.TYPE, getPadSub3B15685$PngjException.class});
            }
            ((Method) PngjBadSignature).invoke(null, objArr);
            getFingerPrintQualityScore = (valueOf + 103) % 128;
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onPause() {
        getFingerPrintQualityScore = (valueOf + 59) % 128;
        super.onPause();
        int i = getFingerPrintQualityScore + 11;
        valueOf = i % 128;
        if (i % 2 != 0) {
            int i2 = 49 / 0;
        }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onResume() {
        int i = valueOf + 21;
        getFingerPrintQualityScore = i % 128;
        int i2 = i % 2;
        super.onResume();
        if (i2 == 0) {
            int i3 = 91 / 0;
        }
        getFingerPrintQualityScore = (valueOf + 15) % 128;
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onStart() {
        valueOf = (getFingerPrintQualityScore + 15) % 128;
        super.onStart();
        getFingerPrintQualityScore = (valueOf + 37) % 128;
    }

    @Override // com.identy.FingerActivity
    public void values(Bundle bundle) {
        super.values(bundle);
        try {
            try {
                this.onErrorResponse = new getFingers(this, this, this.PngjExceptionInternal, IdentySdk.getInstance().u(), this.PngjUnsupportedException);
                int i = getFingerPrintQualityScore + 5;
                valueOf = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
        }
    }
}
