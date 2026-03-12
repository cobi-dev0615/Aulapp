package com.identy;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.identy.PngjInputException;
import com.identy.app.users.IdentyUser;
import com.identy.b.PngjBadSignature;
import com.identy.enums.Finger;
import com.identy.enums.FingerDetectionMode;
import com.identy.enums.FingerMatchSecLevel;
import com.identy.enums.Hand;
import com.karumi.dexter.BuildConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class Verify2IndexActivity extends FingerActivity {
    private static  byte[] $$a = null;
    private static  int $$b = 0;
    private static  byte[] $$c = null;
    private static  int $$f = 0;
    private static int $10;
    private static int $11;
    private static int getFingerPrintQualityScore;
    private static int getScore;
    private static char[] values;
    protected HashMap valueOf = new HashMap();
    int PngjBadCrcException = 0;

    public class PngjBadCrcException implements org.cameracontroller.PngjBadSignature.values {
        private /* synthetic */ HashMap PngjBadCrcException;
        private /* synthetic */ long PngjBadSignature;
        private /* synthetic */ HashMap PngjException;
        private /* synthetic */ FingerMatchSecLevel valueOf;

        public class values implements DialogInterface.OnDismissListener {
            public values() {
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                Verify2IndexActivity verify2IndexActivity = Verify2IndexActivity.this;
                verify2IndexActivity.values((Pair<Hand, Finger>[]) verify2IndexActivity.onErrorResponse.PngjExceptionInternal());
            }
        }

        public PngjBadCrcException(HashMap hashMap, FingerMatchSecLevel fingerMatchSecLevel, long j, HashMap hashMap2) {
            this.PngjBadCrcException = hashMap;
            this.valueOf = fingerMatchSecLevel;
            this.PngjBadSignature = j;
            this.PngjException = hashMap2;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(6:(14:14|15|(4:18|19|21|16)|90|91|(1:93)(1:115)|94|95|96|97|98|99|100|101)|30|31|32|33|(2:35|(2:37|38)(5:40|41|(1:43)(1:47)|44|45))(7:52|53|(1:55)|56|(2:79|80)|58|(2:60|61)(2:62|(4:64|(1:66)(2:69|(1:71)(1:72))|67|68)(2:73|(2:75|76)(2:77|78))))) */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x0190, code lost:
        
            0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x0191, code lost:
        
            0.printStackTrace();
            0 = 0;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x017d A[Catch: Exception -> 0x0181, TRY_LEAVE, TryCatch #8 {Exception -> 0x0181, blocks: (B:25:0x0177, B:27:0x017d), top: B:24:0x0177 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x01b3  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x01f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void values() {
            throw new UnsupportedOperationException("Method not decompiled");
        }

        @Override
        public void PngjException(boolean z) {
        }

    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$i(int i, byte b, byte b2) {
        int i2;
        int i3;
        int i4 = (b2 * 2) + 4;
        int i5 = 102 - i;
        int i6 = 1 - (b * 3);
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i6;
            i2 = i4;
            i3 = 0;
            i4 += -i7;
            i2++;
            bArr2[i3] = (byte) i4;
            i3++;
            if (i3 == i6) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i2];
            i4 += -i7;
            i2++;
            bArr2[i3] = (byte) i4;
            i3++;
            if (i3 == i6) {
                return new String(bArr2, 0);
            }
        } else {
            i4 = i5;
            i2 = i4;
            i3 = 0;
            bArr2[i3] = (byte) i4;
            i3++;
            if (i3 == i6) {
                return new String(bArr2, 0);
            }
        }
        return new String(bArr2, 0);
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getScore = 0;
        getFingerPrintQualityScore = 1;
        values = new char[]{40106, 39959, 39953, 39955, 39960, 39964, 39958, 40177, 40190, 39961, 40184, 40136, 39958, 39942, 39963, 39964, 39953, 40160, 40167, 39965, 39953, 39959, 40129, 39994, 39992, 39994, 39971, 39974, 39998, 39989, 39989, 39997, 39992, 39970, 39968, 39973, 39995, 40182, 40053, 40341, 40042, 40041, 40048, 40010, 40342, 40342, 40040, 40342, 40340, 40343, 40350, 40345, 40041, 40096, 40185, 40190, 40128, 40180, 40162, 40186, 40186, 40165, 40189, 40176, 40178, 40179, 40176, 40189, 40141};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, short s, java.lang.Object[] objArr) {
        int i;
        int i2;
        int r8 = 80 - (s * 2);
        byte[] bArr = $$a;
        int i3 = b * 6;
        int i4 = 21 - (b2 * 18);
        byte[] bArr2 = new byte[i3 + 13];
        int i5 = i3 + 12;
        if (bArr == null) {
            byte b3 = 0;
            i = 0;
            int i6 = i4;
            int i7 = i6;
            i2 = i4 + (-b3) + 5;
            i4 = i7;
            int i8 = i4 + 1;
            bArr2[i] = (byte) i2;
            if (i == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i++;
            b3 = bArr[i8];
            int i9 = i2;
            i6 = i8;
            i4 = i9;
            int i72 = i6;
            i2 = i4 + (-b3) + 5;
            i4 = i72;
            int i82 = i4 + 1;
            bArr2[i] = (byte) i2;
            if (i == i5) {
            }
        } else {
            i = 0;
            i2 = 0;
            int i822 = i4 + 1;
            bArr2[i] = (byte) i2;
            if (i == i5) {
            }
        }
    }

    private static void c(int[] iArr, String str, boolean z, java.lang.Object[] objArr) {
        float f;
        int i;
        byte[] bArr;
        int i2;
        String str2 = str;
        byte[] bArr2 = null;
        if (str2 != null) {
            $11 = ($10 + 81) % 128;
            try { bArr2 = str2.getBytes("ISO-8859-1"); } catch (java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
        }
        byte[] bArr3 = bArr2;
        com.d.e.e1 e1Var = new com.d.e.e1();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = 2;
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr = values;
        Class cls = Integer.TYPE;
        if (cArr != null) {
            int length = cArr.length;
            f = 0.0f;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = i3;
                int i11 = $11 + 83;
                $10 = i11 % 128;
                if (i11 % i6 != 0) {
                    try {
                        java.lang.Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                        java.lang.Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(-259747866);
                        if (PngjBadSignature == null) {
                            bArr = bArr3;
                            i2 = i9;
                            byte b = (byte) 2;
                            byte b2 = (byte) (b - 2);
                            PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getTouchSlop() >> 8), (TypedValue.complexToFloat(i10) > 0.0f ? 1 : (TypedValue.complexToFloat(i10) == 0.0f ? 0 : -1)) + 35, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1312, 208396893, false, $$i(b, b2, b2), new Class[]{cls});
                        } else {
                            bArr = bArr3;
                            i2 = i9;
                        }
                        cArr2[i2] = ((Character) ((Method) PngjBadSignature).invoke(null, objArr2)).charValue();
                        i9 = i2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();

                        if (cause == null) {

                            throw new RuntimeException(th);

                        }

                        throw new RuntimeException(cause);
                    }
                } else {
                    bArr = bArr3;
                    int i12 = i9;
                    java.lang.Object[] objArr3 = {Integer.valueOf(cArr[i12])};
                    java.lang.Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-259747866);
                    if (PngjBadSignature2 == null) {
                        byte b3 = (byte) 2;
                        byte b4 = (byte) (b3 - 2);
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (TypedValue.complexToFloat(i10) > 0.0f ? 1 : (TypedValue.complexToFloat(i10) == 0.0f ? 0 : -1)), 35 - (ViewConfiguration.getTouchSlop() >> 8), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, i10) + 1313, 208396893, false, $$i(b3, b4, b4), new Class[]{cls});
                    }
                    try { cArr2[i12] = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr3)).charValue(); } catch (Exception e) { throw new RuntimeException(e); }
                    i9 = i12 + 1;
                }
                bArr3 = bArr;
                i3 = 0;
                i6 = 2;
            }
            cArr = cArr2;
        } else {
            f = 0.0f;
        }
        byte[] bArr4 = bArr3;
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr4 != null) {
            char[] cArr4 = new char[i5];
            e1Var.PngjBadSignature = 0;
            char c = 0;
            while (true) {
                int i13 = e1Var.PngjBadSignature;
                if (i13 >= i5) {
                    break;
                }
                int i14 = $10;
                $11 = (i14 + 53) % 128;
                if (bArr4[i13] == 1) {
                    $11 = (i14 + 53) % 128;
                    java.lang.Object[] objArr4 = {Integer.valueOf(cArr3[i13]), Integer.valueOf(c)};
                    java.lang.Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-655108508);
                    if (PngjBadSignature3 == null) {
                        float f2 = f;
                        byte b5 = (byte) 3;
                        byte b6 = (byte) (b5 - 3);
                        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((PointF.length(f2, f2) > f2 ? 1 : (PointF.length(f2, f2) == f2 ? 0 : -1)) + 31882), (-16777184) - Color.rgb(0, 0, 0), (Process.myPid() >> 22) + 1250, 605862879, false, $$i(b5, b6, b6), new Class[]{cls, cls});
                    }
                    try { cArr4[i13] = ((Character) ((Method) PngjBadSignature3).invoke(null, objArr4)).charValue(); } catch (Exception e) { throw new RuntimeException(e); }
                } else {
                    java.lang.Object[] objArr5 = {Integer.valueOf(cArr3[i13]), Integer.valueOf(c)};
                    java.lang.Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(269554740);
                    if (PngjBadSignature4 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 36, 1598 - View.resolveSizeAndState(0, 0, 0), -318867057, false, $$i(b7, b8, b8), new Class[]{cls, cls});
                    }
                    try { cArr4[i13] = ((Character) ((Method) PngjBadSignature4).invoke(null, objArr5)).charValue(); } catch (Exception e) { throw new RuntimeException(e); }
                }
                c = cArr4[e1Var.PngjBadSignature];
                java.lang.Object[] objArr6 = {e1Var, e1Var};
                java.lang.Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1060060353);
                if (PngjBadSignature5 == null) {
                    f = 0.0f;
                    PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) View.MeasureSpec.getMode(0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 34, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 154, -1010806406, false, "g", new Class[]{java.lang.Object.class, java.lang.Object.class});
                } else {
                    f = 0.0f;
                }
                try { ((Method) PngjBadSignature5).invoke(null, objArr6); } catch (Exception e) { throw new RuntimeException(e); }
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            char[] cArr5 = new char[i5];
            i = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i15 = i5 - i8;
            System.arraycopy(cArr5, 0, cArr3, i15, i8);
            System.arraycopy(cArr5, i8, cArr3, 0, i15);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i5];
            e1Var.PngjBadSignature = i;
            while (true) {
                int i16 = e1Var.PngjBadSignature;
                if (i16 >= i5) {
                    break;
                }
                cArr6[i16] = cArr3[(i5 - i16) - 1];
                e1Var.PngjBadSignature = i16 + 1;
            }
            $11 = ($10 + 37) % 128;
            cArr3 = cArr6;
        }
        if (i7 > 0) {
            e1Var.PngjBadSignature = 0;
            while (true) {
                int i17 = e1Var.PngjBadSignature;
                if (i17 >= i5) {
                    break;
                }
                cArr3[i17] = (char) (cArr3[i17] - iArr[2]);
                e1Var.PngjBadSignature = i17 + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public static void init$0() {
        $$a = new byte[]{87, 36, -81, -25, -25, 12, 2, 45, -26, 2, 38, -42, 20, 35, -46, 26, 3, -6, 1, 16, -1, 6, -25, 12, 2, 42, -46, 26, 3, -6, 1, 16, -1, 6};
        $$b = 7;
    }

    public static void init$1() {
        $$c = new byte[]{126, 106, 85, 73};
        $$f = 76;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:26:0x0061
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // com.identy.FingerActivity, com.identy.d.PngjBadSignature
    public void PngjException(java.util.HashMap<android.util.Pair<com.identy.enums.Hand, com.identy.enums.Finger>, com.identy.IdentyA> r15, java.util.HashMap<android.util.Pair<com.identy.enums.Hand, com.identy.enums.Finger>, com.identy.IdentyA> r16, android.graphics.Bitmap r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.identy.Verify2IndexActivity.PngjException(java.util.HashMap, java.util.HashMap, android.graphics.Bitmap, boolean, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x034c  */
    @Override // com.identy.FingerActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void attachBaseContext(Context context) {
        char c;
        int i;
        int intValue = 0;
        java.lang.Object[] values$1eba2e16 = null;
        long j = 0;
        getFingerPrintQualityScore = (getScore + 123) % 128;
        super.attachBaseContext(context);
        java.lang.Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
        if (PngjBadSignature == null) {
            char pressedStateDuration = (char) (14830 - (ViewConfiguration.getPressedStateDuration() >> 16));
            int i2 = 28 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int i3 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 720;
            byte b = $$a[18];
            byte b2 = b;
            java.lang.Object[] objArr = new java.lang.Object[1];
            b(b, b2, (byte) (b2 - 1), objArr);
            PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(pressedStateDuration, i2, i3, -815159504, false, (String) objArr[0], null);
        }
        long j2; try { j2 = ((Field) PngjBadSignature).getLong(null); } catch (Exception e) { throw new RuntimeException(e); }
        try {
            try {
                if (j2 != -1) {
                    getFingerPrintQualityScore = (getScore + 119) % 128;
                    long j3 = j2 + 4611686018427387836L;
                    i = 763257050;
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    c(new int[]{0, 22, 28, 0}, "\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000", false, objArr2);
                    Class<?> cls = Class.forName((String) objArr2[0]);
                    c = 18;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c(new int[]{22, 15, 70, 0}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000", false, objArr3);
                    if (j3 >= ((Long) cls.getDeclaredMethod((String) objArr3[0], null).invoke(null, null)).longValue()) {
                        getFingerPrintQualityScore = (getScore + 3) % 128;
                        java.lang.Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                        if (PngjBadSignature2 == null) {
                            char resolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 14830);
                            int alpha = 28 - Color.alpha(0);
                            int mirror = AndroidCharacter.getMirror('0') + 673;
                            byte b3 = (byte) ($$a[18] - 1);
                            byte b4 = b3;
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            b(b3, b4, b4, objArr4);
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(resolveOpacity, alpha, mirror, -779023007, false, (String) objArr4[0], null);
                        }
                        java.lang.Object[] objArr5 = (java.lang.Object[]) ((Field) PngjBadSignature2).get(null);
                        values$1eba2e16 = new java.lang.Object[]{new int[]{0}, new int[1], 0, new int[]{0}};
                        int i4 = ((int[]) objArr5[3])[0];
                        int i5 = ((int[]) objArr5[0])[0];
                        String[] strArr = (String[]) objArr5[2];
                        int i6 = ~((int) Runtime.getRuntime().freeMemory());
                        int c2 = defpackage.a.c((~((-606582157) | i6)) | 164232 | (~((-427983818) | i6)), 184, (((~(i6 | (-427819586))) | (~((-606417925) | i6))) * (-184)) - 347012035, 1294523447);
                        int i7 = c2 ^ (c2 << 13);
                        int i8 = i7 ^ (i7 >>> 17);
                        ((int[]) values$1eba2e16[1])[0] = i8 ^ (i8 << 5);
                        if (((int[]) values$1eba2e16[3])[0] == ((int[]) values$1eba2e16[0])[0]) {
                            ArrayList arrayList = new ArrayList();
                            String[] strArr2 = (String[]) values$1eba2e16[2];
                            if (strArr2 == null) {
                                throw null;
                            }
                            for (String str : strArr2) {
                                getScore = (getFingerPrintQualityScore + 117) % 128;
                                arrayList.add(str);
                            }
                            throw null;
                        }
                        getFingerPrintQualityScore = (getScore + 51) % 128;
                        java.lang.Object[] objArr6 = {new int[]{0}, new int[1], 0, new int[]{0}};
                        int i9 = ((int[]) values$1eba2e16[1])[0];
                        int i10 = ((int[]) values$1eba2e16[3])[0];
                        int i11 = ((int[]) values$1eba2e16[0])[0];
                        String[] strArr3 = (String[]) values$1eba2e16[2];
                        int identityHashCode = System.identityHashCode(this);
                        int i12 = (((~((-1072254445) | identityHashCode)) | 37688470) * (-318)) + 1809094671;
                        int i13 = ~(37688470 | identityHashCode);
                        int i14 = ~identityHashCode;
                        int c3 = defpackage.a.c((~(identityHashCode | (-1445907))) | (~(1073700350 | i14)), 318, ((i13 | (~((-1445907) | i14))) * 318) + i12, i9);
                        int i15 = c3 ^ (c3 << 13);
                        int i16 = i15 ^ (i15 >>> 17);
                        ((int[]) objArr6[1])[0] = i16 ^ (i16 << 5);
                        return;
                    }
                } else {
                    c = 18;
                    i = 763257050;
                }
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                c(new int[]{0, 22, 28, 0}, "\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000", false, objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                c(new int[]{22, 15, 70, 0}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000", false, objArr8);
                Long valueOf = Long.valueOf(((Long) cls2.getDeclaredMethod((String) objArr8[0], null).invoke(null, null)).longValue());
                java.lang.Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
                if (PngjBadSignature3 == null) {
                    char packedPositionChild = (char) (14829 - ExpandableListView.getPackedPositionChild(j));
                    int maximumDrawingCacheSize = 28 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int i17 = (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 720;
                    byte b5 = $$a[c];
                    byte b6 = b5;
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    b(b5, b6, (byte) (b6 - 1), objArr9);
                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(packedPositionChild, maximumDrawingCacheSize, i17, -815159504, false, (String) objArr9[0], null);
                }
                ((Field) PngjBadSignature3).set(null, valueOf);
                if (((int[]) values$1eba2e16[3])[0] == ((int[]) values$1eba2e16[0])[0]) {
                }
            } catch (Exception unused) {
                throw new RuntimeException();
            }
            java.lang.Object[] objArr10 = {-1148600848};
            java.lang.Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1439412966);
            if (PngjBadSignature4 == null) {
                PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getPressedStateDuration() >> 16), 23 - MotionEvent.axisFromString(BuildConfig.FLAVOR), 697 - Color.blue(0), 1457201313, false, null, new Class[]{Integer.TYPE});
            }
            values$1eba2e16 = com.identy.PngjInputException.PngjBadSignature.values$1eba2e16(intValue, ((Constructor) PngjBadSignature4).newInstance(objArr10), -56835873);
            java.lang.Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i);
            if (PngjBadSignature5 == null) {
                char c4 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14829);
                int i18 = 28 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int i19 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 721;
                byte b7 = (byte) ($$a[c] - 1);
                j = 0;
                byte b8 = b7;
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                b(b7, b8, b8, objArr11);
                PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c4, i18, i19, -779023007, false, (String) objArr11[0], null);
            } else {
                j = 0;
            }
            ((Field) PngjBadSignature5).set(null, values$1eba2e16);
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        c(new int[]{37, 16, 151, 10}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000", true, objArr12);
        Class<?> cls3; try { cls3 = Class.forName((String) objArr12[0]); } catch (ClassNotFoundException e) { throw new RuntimeException(e); }
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        c(new int[]{53, 16, 0, 12}, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000", true, objArr13);
        try { intValue = ((Integer) cls3.getMethod((String) objArr13[0], java.lang.Object.class).invoke(null, this)).intValue(); } catch (Exception e) { throw new RuntimeException(e); }
    }

    @Override // com.identy.FingerActivity
    public final void getPadSub2() {
        super.getPadSub2();
        try {
            IdentyUser B = IdentySdk.getInstance().B();
            boolean isEnrolled = IdentySdk.getInstance().isEnrolled(new FingerDetectionMode[]{this.PngjExceptionInternal}, B);
            IdentySdk identySdk = IdentySdk.getInstance();
            this.valueOf = com.identy.f.PngjBadSignature.PngjException(identySdk.getData, new FingerDetectionMode[]{this.PngjExceptionInternal}, B);
            if (isEnrolled) {
                return;
            }
            getScore = (getFingerPrintQualityScore + 13) % 128;
            Toast.makeText(this, "Fingers not registered .. please register first", 1).show();
            finish();
            getFingerPrintQualityScore = (getScore + 117) % 128;
        } catch (Exception unused) {
        }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i = getScore + 83;
        getFingerPrintQualityScore = i % 128;
        int i2 = i % 2;
        super.onCreate(bundle);
        if (i2 == 0) {
            int i3 = 8 / 0;
        }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onPause() {
        getScore = (getFingerPrintQualityScore + 111) % 128;
        super.onPause();
        int i = getFingerPrintQualityScore + 117;
        getScore = i % 128;
        if (i % 2 != 0) {
            int i2 = 2 / 0;
        }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onResume() {
        int i = getFingerPrintQualityScore + 39;
        getScore = i % 128;
        int i2 = i % 2;
        super.onResume();
        if (i2 != 0) {
            throw null;
        }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onStart() {
        int i = getScore + 113;
        getFingerPrintQualityScore = i % 128;
        int i2 = i % 2;
        super.onStart();
        if (i2 == 0) {
            throw null;
        }
    }

    @Override // com.identy.FingerActivity
    public void values(Bundle bundle) {
        super.values(bundle);
        try {
            try {
                this.onErrorResponse = new setFingers(this, this, this.PngjExceptionInternal, IdentySdk.getInstance().u(), this.PngjUnsupportedException);
                getFingerPrintQualityScore = (getScore + 75) % 128;
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
        }
    }
}
