package com.identy.ui.c;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ExpandableListView;
import android.widget.TextView;
import com.d.e.a.c.getPadSub3B15685$PngjException;
import com.identy.IdentySdk;
import com.identy.UIAfterCaptures;
import com.identy.enums.FingerDetectionMode;
import com.karumi.dexter.BuildConfig;
import java.lang.reflect.Method;
import kotlin.io.encoding.Base64;

/* loaded from: classes2.dex */
public final class getFingerPrintQualityScore extends Dialog {
    private static final byte[] $$a = {25, Base64.padSymbol, -16, 69, -18, 14, 12, -13, 17};
    private static final int $$b = 170;
    private FingerDetectionMode PngjBadCrcException;
    private com.identy.d.PngjException PngjBadSignature;
    private final boolean PngjException;
    private FingerDetectionMode valueOf;

    public class PngjBadCrcException implements DialogInterface.OnDismissListener {
        private /* synthetic */ com.identy.d.PngjException PngjException;

        public PngjBadCrcException(com.identy.d.PngjException pngjException) {
            this.PngjException = pngjException;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            this.PngjException.PngjBadCrcException();
        }
    }

    public class PngjBadSignature implements Runnable {
        private static  byte[] $$a = null;
        private static  int $$b = 0;
        private static  byte[] $$c = null;
        private static  int $$d = 0;
        private static int $10;
        private static int $11;
        private static char[] PngjBadCrcException;
        private static int PngjBadSignature;
        private static boolean PngjException;
        private static int PngjOutputException;
        private static long PngjPrematureEnding;
        private static int PngjUnsupportedException;
        private static boolean values;

        private static String $$e(short s, int i, byte b) {
            byte[] bArr = $$c;
            int i2 = s + 97;
            int i3 = 3 - (i * 3);
            int i4 = b * 3;
            byte[] bArr2 = new byte[i4 + 1];
            int i5 = -1;
            if (bArr == null) {
                i2 += i3;
                i3 = i3;
                bArr = bArr;
                i5 = -1;
            }
            while (true) {
                int i6 = i5 + 1;
                int i7 = i3 + 1;
                bArr2[i6] = (byte) i2;
                if (i6 == i4) {
                    return new String(bArr2, 0);
                }
                byte[] bArr3 = bArr;
                i2 = bArr[i7] + i2;
                i3 = i7;
                bArr = bArr3;
                i5 = i6;
            }
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            PngjUnsupportedException = 0;
            PngjOutputException = 1;
            PngjBadCrcException = new char[]{25205, 25202, 25521, 25211, 25476, 25479, 25194, 25208, 25201, 25478, 25192, 25203, 25207, 25206, 25196, 25200, 25209, 25477, 25210, 25215, 25524, 25474, 25214, 25193, 25212, 25197, 25520, 25522, 25195, 25486, 25523, 25516, 25472, 25534};
            PngjBadSignature = -2081201181;
            PngjException = true;
            values = true;
            PngjPrematureEnding = 8475136342134805167L;
        }

        public PngjBadSignature() {
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1602)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:298)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        /* JADX WARN: Multi-variable search skipped. Vars limit reached: 6049 (expected less than 5000) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v729, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r3v258 */
        /* JADX WARN: Type inference failed for: r3v413 */
        /* JADX WARN: Type inference failed for: r3v414, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r3v416 */
        /* JADX WARN: Type inference failed for: r3v419, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r3v420 */
        /* JADX WARN: Type inference failed for: r3v421 */
        /* JADX WARN: Type inference failed for: r3v425, types: [java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r3v427 */
        /* JADX WARN: Type inference failed for: r3v428 */
        /* JADX WARN: Type inference failed for: r3v709 */
        /* JADX WARN: Type inference failed for: r3v710 */
        /* JADX WARN: Type inference failed for: r3v714 */
        /* JADX WARN: Type inference failed for: r6v758, types: [java.lang.Object[]] */
        public static java.lang.Object[] PngjBadSignature$1eba2e16(int r72, java.lang.Object r73, int r74) {
            /*
                Method dump skipped, instructions count: 15181
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.identy.ui.c.getFingerPrintQualityScore.PngjBadSignature.PngjBadSignature$1eba2e16(int, java.lang.Object, int):java.lang.Object[]");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(byte b, short s, int i, java.lang.Object[] objArr) {
            int i2;
            int i3;
            int i4;
            int i5 = s + 4;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[b + 1];
            int i6 = 112 - i;
            if (bArr == null) {
                int i7 = 0;
                int i8 = i5;
                int i9 = (i8 + i6) - 23;
                i2 = i5 + 1;
                i3 = i9;
                i4 = i7;
                bArr2[i4] = (byte) i3;
                int i10 = i4 + 1;
                if (i4 == b) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i6 = bArr[i2];
                int i11 = i2;
                i8 = i3;
                i5 = i11;
                i7 = i10;
                int i92 = (i8 + i6) - 23;
                i2 = i5 + 1;
                i3 = i92;
                i4 = i7;
                bArr2[i4] = (byte) i3;
                int i102 = i4 + 1;
                if (i4 == b) {
                }
            } else {
                i2 = i5;
                i3 = i6;
                i4 = 0;
                bArr2[i4] = (byte) i3;
                int i1022 = i4 + 1;
                if (i4 == b) {
                }
            }
        }

        private static void b(int[] iArr, int i, String str, String str2, java.lang.Object[] objArr) {
            char[] cArr;
            int i2;
            char c;
            String str3 = str2;
            $11 = ($10 + 55) % 128;
            byte[] bArr = str3;
            if (str3 != null) {
                bArr = str3.getBytes("ISO-8859-1");
            }
            byte[] bArr2 = bArr;
            int i3 = 2;
            if (str != null) {
                int i4 = $11 + 39;
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
            com.d.e.PngjExceptionInternal pngjExceptionInternal = new com.d.e.PngjExceptionInternal();
            char[] cArr3 = PngjBadCrcException;
            Class cls = Integer.TYPE;
            if (cArr3 != null) {
                int length = cArr3.length;
                char[] cArr4 = new char[length];
                for (int i5 = 0; i5 < length; i5++) {
                    try {
                        java.lang.Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                        java.lang.Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(358189806);
                        if (PngjBadSignature2 == null) {
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (View.getDefaultSize(0, 0) + 27092), 37 - (ViewConfiguration.getScrollBarSize() >> 8), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 118, -373889195, false, "b", new Class[]{cls});
                        }
                        cArr4[i5] = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                $10 = ($11 + 41) % 128;
                cArr3 = cArr4;
            }
            java.lang.Object[] objArr3 = {Integer.valueOf(PngjBadSignature)};
            java.lang.Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1639226071);
            if (PngjBadSignature3 == null) {
                char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 61713);
                int i6 = 34 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 278;
                byte length2 = (byte) $$c.length;
                byte b = (byte) (length2 - 4);
                PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(doubleTapTimeout, i6, windowTouchSlop, -1654917268, false, $$e(length2, b, b), new Class[]{cls});
            }
            int intValue = ((Integer) ((Method) PngjBadSignature3).invoke(null, objArr3)).intValue();
            int i7 = -528960794;
            char c2 = 1;
            if (values) {
                int i8 = $11 + 51;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                int length3 = bArr2.length;
                pngjExceptionInternal.PngjException = length3;
                char[] cArr5 = new char[length3];
                pngjExceptionInternal.values = 0;
                while (true) {
                    int i10 = pngjExceptionInternal.values;
                    int i11 = pngjExceptionInternal.PngjException;
                    if (i10 >= i11) {
                        objArr[0] = new String(cArr5);
                        return;
                    }
                    cArr5[i10] = (char) (cArr3[bArr2[(i11 - 1) - i10] + i] - intValue);
                    java.lang.Object[] objArr4 = new java.lang.Object[i3];
                    objArr4[c2] = pngjExceptionInternal;
                    objArr4[0] = pngjExceptionInternal;
                    java.lang.Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i7);
                    if (PngjBadSignature4 == null) {
                        i2 = i7;
                        byte b2 = (byte) 0;
                        c = c2;
                        byte b3 = b2;
                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 37 - (Process.myTid() >> 22), 548 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0), 479715165, false, $$e(b2, b3, b3), new Class[]{java.lang.Object.class, java.lang.Object.class});
                    } else {
                        i2 = i7;
                        c = c2;
                    }
                    ((Method) PngjBadSignature4).invoke(null, objArr4);
                    i7 = i2;
                    c2 = c;
                    i3 = 2;
                }
            } else if (PngjException) {
                int length4 = cArr2.length;
                pngjExceptionInternal.PngjException = length4;
                char[] cArr6 = new char[length4];
                pngjExceptionInternal.values = 0;
                while (true) {
                    int i12 = pngjExceptionInternal.values;
                    int i13 = pngjExceptionInternal.PngjException;
                    if (i12 >= i13) {
                        objArr[0] = new String(cArr6);
                        return;
                    }
                    cArr6[i12] = (char) (cArr3[cArr2[(i13 - 1) - i12] - i] - intValue);
                    java.lang.Object[] objArr5 = {pngjExceptionInternal, pngjExceptionInternal};
                    java.lang.Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-528960794);
                    if (PngjBadSignature5 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 37 - Color.green(0), 549 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), 479715165, false, $$e(b4, b5, b5), new Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((Method) PngjBadSignature5).invoke(null, objArr5);
                }
            } else {
                int length5 = iArr.length;
                pngjExceptionInternal.PngjException = length5;
                char[] cArr7 = new char[length5];
                pngjExceptionInternal.values = 0;
                while (true) {
                    int i14 = pngjExceptionInternal.values;
                    int i15 = pngjExceptionInternal.PngjException;
                    if (i14 >= i15) {
                        objArr[0] = new String(cArr7);
                        return;
                    } else {
                        cArr7[i14] = (char) (cArr3[iArr[(i15 - 1) - i14] - i] - intValue);
                        pngjExceptionInternal.values = i14 + 1;
                    }
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x0015, code lost:
        
            com.identy.ui.c.getFingerPrintQualityScore.PngjBadSignature.$10 = (0 + 45) % 128;
            0 = 0.toCharArray();
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0013, code lost:
        
            if (0 != null) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
        
            if (0 != null) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
        
            0 = 0;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0160  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0161  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void c(String str, int i, java.lang.Object[] objArr) {
            throw new UnsupportedOperationException("Method not decompiled");
        }


        public static void init$0() {
            $$a = new byte[]{100, 91, -82, 96, -29, 13, 28};
            $$b = 205;
        }

        public static void init$1() {
            $$c = new byte[]{122, 44, -96, 114};
            $$d = 187;
        }

        @Override // java.lang.Runnable
        public final void run() {
            PngjUnsupportedException = (PngjOutputException + 99) % 128;
            getFingerPrintQualityScore.this.dismiss();
            int i = PngjUnsupportedException + 87;
            PngjOutputException = i % 128;
            if (i % 2 == 0) {
                int i2 = 10 / 0;
            }
        }
    }

    public class PngjException implements getPadSub3B15685$PngjException {
        public PngjException() {
        }

        @Override // com.d.e.a.c.getPadSub3B15685$PngjException
        public final void PngjBadCrcException(int i, int i2) {
            if (i != i2) {
                getFingerPrintQualityScore.this.dismiss();
            }
        }
    }

    public class valueOf implements View.OnClickListener {
        public valueOf() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            getFingerPrintQualityScore.this.dismiss();
        }
    }

    public getFingerPrintQualityScore(Context context, com.identy.d.PngjException pngjException, FingerDetectionMode fingerDetectionMode, FingerDetectionMode fingerDetectionMode2) {
        super(context, R.style.Theme.Translucent.NoTitleBar);
        this.PngjException = true;
        this.PngjBadSignature = pngjException;
        this.PngjBadCrcException = fingerDetectionMode2;
        this.valueOf = fingerDetectionMode;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(getWindow().getAttributes());
        ((ViewGroup.LayoutParams) layoutParams).width = -1;
        ((ViewGroup.LayoutParams) layoutParams).height = -1;
        getWindow().setAttributes(layoutParams);
        setOnDismissListener(new PngjBadCrcException(pngjException));
        try {
            java.lang.Object[] objArr = {context, 10, new PngjException()};
            java.lang.Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1578525895);
            if (PngjBadSignature2 == null) {
                char offsetBefore = (char) (TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 14830);
                int touchSlop = 28 - (ViewConfiguration.getTouchSlop() >> 8);
                int indexOf = 721 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0);
                byte b = (byte) 0;
                byte b2 = b;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(b, b2, b2, objArr2);
                PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(offsetBefore, touchSlop, indexOf, 1560737410, false, (String) objArr2[0], new Class[]{Context.class, Integer.TYPE, getPadSub3B15685$PngjException.class});
            }
            ((Method) PngjBadSignature2).invoke(null, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, byte b, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5 = (i2 * 2) + 6;
        byte[] bArr = $$a;
        int i6 = 118 - (i * 3);
        int i7 = 4 - (b * 4);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            i6 = i7;
            int i8 = i5;
            i4 = 0;
            i7++;
            i6 = (i6 + i8) - 3;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i8 = bArr[i7];
            i7++;
            i6 = (i6 + i8) - 3;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
            }
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        boolean z;
        long j;
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        try {
            z = IdentySdk.getInstance().isCustomSDK();
        } catch (Exception e) {
            e.printStackTrace();
            z = false;
        }
        setContentView(z ? com.identy.R.layout.touchless_popup_verify_success : com.identy.R.layout.identy_popup_verify_success);
        findViewById(com.identy.R.id.close_sep).setOnClickListener(new valueOf());
        try {
            if (!IdentySdk.getInstance().getUitype().equals(UIAfterCaptures.INLINE)) {
                findViewById(com.identy.R.id.verify_inline_ui).setVisibility(8);
                return;
            }
            if (this.PngjBadCrcException != null) {
                ((TextView) findViewById(com.identy.R.id.id_fin_enroll_next)).setText(this.PngjBadCrcException.getVerifynextMsg());
            } else {
                ((TextView) findViewById(com.identy.R.id.id_fin_enroll_next)).setText(com.identy.R.string.id_no_next);
            }
            ((TextView) findViewById(com.identy.R.id.id_fin_enroll_success)).setText(this.valueOf.getVerifysuccessMsg());
            findViewById(com.identy.R.id.verify_inline_ui).setVisibility(0);
            try {
                j = IdentySdk.getInstance().getAfterCaptureInlinemsgTime();
            } catch (Exception e2) {
                e2.printStackTrace();
                j = 0;
            }
            new Handler(Looper.getMainLooper()).postDelayed(new PngjBadSignature(), j);
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
    }
}
