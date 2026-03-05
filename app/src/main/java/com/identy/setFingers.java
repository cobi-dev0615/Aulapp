package com.identy;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import com.identy.enums.Finger;
import com.identy.enums.FingerDetectionMode;
import com.identy.enums.Hand;
import com.identy.ex.FingerError;
import com.identy.ex.PreCaptureOutput;
import com.karumi.dexter.BuildConfig;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.camera.preview.PngjBadCrcException;
import org.identy.nativealgo.NativeAlgoUtils;
import org.identy.opencv.core.Mat;

/* loaded from: classes2.dex */
final class setFingers extends e1 {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static final byte[] $$l = null;
    private static final int $$m = 0;
    private static int $10;
    private static int $11;
    private static int[] destroy;
    private static int generateNFIQ;
    private static int pfkrolChangeMinMaxWidth;
    private List configure;
    private final Handler configureroll;
    private View getServerRequest;
    private View pfk;
    private boolean pfkrol;
    private View pfkrolGetQuality;
    private ImageView pfkrolfinalize;
    private View pfkrolfinalizeF;
    private boolean resetAttempt;

    private static String $$n(int i, int i2, byte b) {
        int i3 = 122 - (i2 * 57);
        int i4 = i * 2;
        byte[] bArr = $$l;
        int i5 = b + 4;
        byte[] bArr2 = new byte[i4 + 1];
        int i6 = -1;
        if (bArr == null) {
            i3 += -i4;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            i5++;
            i3 += -bArr[i5];
        }
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        pfkrolChangeMinMaxWidth = 0;
        generateNFIQ = 1;
        destroy = new int[]{1469157585, 1165251799, -699343989, 489251810, -1387951319, 1667955547, 324279232, 1007432137, 1809920812, 164783365, 31645736, 1726874425, -337178231, 110424699, 1762176873, -2097184003, -164164580, -305639194};
    }

    public setFingers(Activity activity, com.identy.d.PngjBadSignature pngjBadSignature, FingerDetectionMode fingerDetectionMode, boolean z, boolean z2) {
        super(activity, z2, fingerDetectionMode, true, false);
        this.pfkrol = false;
        this.resetAttempt = false;
        this.configure = new ArrayList();
        new NativeAlgoUtils();
        this.getProcessingTime = 2;
        this.Action = activity;
        this.Attempt = pngjBadSignature;
        this.configureroll = new Handler(this.Action.getMainLooper());
        e1.PngjOutputException = 0L;
        this.getOveralTimetaken = new float[0];
        this.a = fingerDetectionMode.getHand();
        this.getL3Score = z;
        this.Capture2IndexActivity = new PngjOutputException(PngjExceptionInternal());
        int i = R.string.id_searching_index;
        com.identy.d.PngjBadSignature pngjBadSignature2 = this.Attempt;
        if (pngjBadSignature2 != null) {
            pngjBadSignature2.PngjBadSignature(i, false);
        }
        this.cvtyuv2bgr = CapturePosition.VERTICAL_FROM_BOTTOM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Attempt() {
        int i = pfkrolChangeMinMaxWidth + 17;
        generateNFIQ = i % 128;
        try {
            if (i % 2 != 0) {
                int valueOf = PngjBadCrcException.getPadSub3.valueOf();
                int valueOf2 = PngjBadCrcException.getPadSub3.valueOf();
                int valueOf3 = PngjBadCrcException.getPadSub3.valueOf();
                PngjBadSignature(PngjBadCrcException.getPadSub3.valueOf(), new Object[]{this}, valueOf3, valueOf2, -1609665347, 1609665349, valueOf);
                return;
            }
            int valueOf4 = PngjBadCrcException.getPadSub3.valueOf();
            int valueOf5 = PngjBadCrcException.getPadSub3.valueOf();
            int valueOf6 = PngjBadCrcException.getPadSub3.valueOf();
            PngjBadSignature(PngjBadCrcException.getPadSub3.valueOf(), new Object[]{this}, valueOf6, valueOf5, -1609665347, 1609665349, valueOf4);
            throw null;
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ Object PngjBadSignature(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = (~(i7 | i6)) | i4;
        int i9 = i6 | i4 | i7;
        int i10 = ((-617157175) * i) + (1159740906 * i2) + i4 + i5 + i3;
        int i11 = i10 * i10;
        int i12 = (2070937600 * i11) + (2111832064 * i) + (1488977920 * i2) + ((-18874368) * i3) + (953110385 * i7) + ((-953110385) * i9) + (i8 * (-953110385)) + (934236018 * i5) + ((i4 * 934236018) - 2089811968);
        int i13 = i9 * (-923);
        int i14 = i7 * 923;
        int i15 = i3 * (-824977973);
        int i16 = i2 * (-135083378);
        int i17 = i * 1125239651;
        int i18 = i11 * 298844160;
        int i19 = i18 + i17 + i16 + i15 + i14 + i13 + (i8 * (-923)) + (i5 * (-824977050)) + (i4 * (-824977050)) + 1921657099;
        int i20 = (i19 * i19 * 2098200576) + i12;
        if (i20 == 1) {
            return PngjBadSignature(objArr);
        }
        if (i20 == 2) {
            return valueOf(objArr);
        }
        List<RectF> PngjException = ((setFingers) objArr[0]).PngjException();
        RectF rectF = PngjException.get(0);
        RectF rectF2 = PngjException.get(1);
        RectF rectF3 = new RectF(rectF2.left, rectF2.top, rectF.right, rectF.bottom);
        generateNFIQ = (pfkrolChangeMinMaxWidth + 37) % 128;
        return rectF3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getData() {
        int i = generateNFIQ + 63;
        pfkrolChangeMinMaxWidth = i % 128;
        if (i % 2 != 0) {
            PngjOutputException();
            throw null;
        }
        PngjOutputException();
        int i2 = R.string.id_capturing;
        com.identy.d.PngjBadSignature pngjBadSignature = this.Attempt;
        if (pngjBadSignature != null) {
            int i3 = generateNFIQ + 43;
            pfkrolChangeMinMaxWidth = i3 % 128;
            if (i3 % 2 != 0) {
                pngjBadSignature.PngjBadSignature(i2, true);
            } else {
                pngjBadSignature.PngjBadSignature(i2, false);
            }
        }
        PngjBadCrcException(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getFingerPrintQualityScore() {
        int valueOf = PngjBadCrcException.getPadSub3.valueOf();
        int valueOf2 = PngjBadCrcException.getPadSub3.valueOf();
        int valueOf3 = PngjBadCrcException.getPadSub3.valueOf();
        PngjBadSignature(PngjBadCrcException.getPadSub3.valueOf(), new Object[]{this}, valueOf3, valueOf2, -2022270286, 2022270287, valueOf);
    }

    private void getPadSub3() {
        int valueOf = PngjBadCrcException.getPadSub3.valueOf();
        int valueOf2 = PngjBadCrcException.getPadSub3.valueOf();
        int valueOf3 = PngjBadCrcException.getPadSub3.valueOf();
        PngjBadSignature(PngjBadCrcException.getPadSub3.valueOf(), new Object[]{this}, valueOf3, valueOf2, -1609665347, 1609665349, valueOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0090, code lost:
    
        if (r2 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0099, code lost:
    
        r2.height = r0;
        r1.setLayoutParams(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
    
        if (r2 != null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void getQualityScore() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        if (this.Capture2TActivity != null) {
            if (this.pfk == null) {
                generateNFIQ = (pfkrolChangeMinMaxWidth + 83) % 128;
                this.pfk = this.Action.findViewById(R.id.preview);
                this.pfkrolfinalizeF = this.Action.findViewById(R.id.info_layout);
                this.getServerRequest = this.Action.findViewById(R.id.location_error_layout);
                this.pfkrolGetQuality = this.Action.findViewById(R.id.scanner_overlay);
                this.pfkrolfinalize = (ImageView) this.Action.findViewById(R.id.inline_guide);
            }
            int height = this.pfk.getHeight();
            org.c.a.PngjBadCrcException pngjBadCrcException = this.Capture2TActivity;
            if (pngjBadCrcException != null && (layoutParams4 = pngjBadCrcException.getLayoutParams()) != null) {
                generateNFIQ = (pfkrolChangeMinMaxWidth + 55) % 128;
                layoutParams4.height = height;
                pngjBadCrcException.setLayoutParams(layoutParams4);
            }
            View view = this.pfkrolfinalizeF;
            if (view != null && (layoutParams3 = view.getLayoutParams()) != null) {
                pfkrolChangeMinMaxWidth = (generateNFIQ + 55) % 128;
                layoutParams3.height = height;
                view.setLayoutParams(layoutParams3);
            }
            View view2 = this.getServerRequest;
            if (view2 != null) {
                int i = pfkrolChangeMinMaxWidth + 101;
                generateNFIQ = i % 128;
                if (i % 2 == 0) {
                    layoutParams2 = view2.getLayoutParams();
                    int i2 = 8 / 0;
                } else {
                    layoutParams2 = view2.getLayoutParams();
                }
            }
            View view3 = this.pfkrolGetQuality;
            if (view3 != null && (layoutParams = view3.getLayoutParams()) != null) {
                layoutParams.height = height;
                view3.setLayoutParams(layoutParams);
            }
            try {
                IdentySdk.getInstance().isInlineGuide();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getScore() {
        int i = pfkrolChangeMinMaxWidth + 41;
        generateNFIQ = i % 128;
        if (i % 2 != 0) {
            this.getL1Score = (com.identy.ui.PngjBadCrcException) this.Action.findViewById(R.id.scanner_overlay);
            int valueOf = PngjBadCrcException.getPadSub3.valueOf();
            int valueOf2 = PngjBadCrcException.getPadSub3.valueOf();
            int valueOf3 = PngjBadCrcException.getPadSub3.valueOf();
            PngjBadSignature(PngjBadCrcException.getPadSub3.valueOf(), new Object[]{this}, valueOf3, valueOf2, -1609665347, 1609665349, valueOf);
            return;
        }
        this.getL1Score = (com.identy.ui.PngjBadCrcException) this.Action.findViewById(R.id.scanner_overlay);
        int valueOf4 = PngjBadCrcException.getPadSub3.valueOf();
        int valueOf5 = PngjBadCrcException.getPadSub3.valueOf();
        int valueOf6 = PngjBadCrcException.getPadSub3.valueOf();
        PngjBadSignature(PngjBadCrcException.getPadSub3.valueOf(), new Object[]{this}, valueOf6, valueOf5, -1609665347, 1609665349, valueOf4);
        int i2 = 16 / 0;
    }

    public static void init$0() {
        $$d = new byte[]{1, 76, -120, -61, 25, -12, -2, -45, 26, -2, -38, 42, -20, -35, 46, -26, -3, 6, -1, -16, 1, -6, -26, 6, 4, -21, -27, 18, 25, -12, -2, -42, 46, -26, -3, 6, -1, -16, 1, -6, -26, 6, 4, -21, 9};
        $$e = 214;
    }

    public static void init$1() {
        $$g = new byte[]{49, -88, 79, -64, -13, 1, 62, -60, 4, -2, -10, -7, -6, 74, -60, 58, -73, 20, -12, -10, 15, -15, -31, 6, -4, 39, -32, -4, 16, -23, 1, -8, 12, -20, -2, 2, 12};
        $$h = 44;
    }

    public static void init$2() {
        $$l = new byte[]{57, -3, -81, -41};
        $$m = 134;
    }

    private static /* synthetic */ Object valueOf(Object[] objArr) {
        setFingers setfingers = (setFingers) objArr[0];
        int i = generateNFIQ + 45;
        pfkrolChangeMinMaxWidth = i % 128;
        if (i % 2 != 0) {
            boolean z = setfingers.getL3Score;
            throw null;
        }
        if (!setfingers.getL3Score && IdentySdk.getInstance().getFingerPrintDrawable() == 0) {
            setfingers.getL1Score.PngjBadSignature(setfingers.a, 8.0d, 6.0d, 3.0d);
            return null;
        }
        pfkrolChangeMinMaxWidth = (generateNFIQ + 65) % 128;
        return null;
    }

    @Override // com.identy.e1
    public final RectF Action() {
        int valueOf = PngjBadCrcException.getPadSub3.valueOf();
        int valueOf2 = PngjBadCrcException.getPadSub3.valueOf();
        int valueOf3 = PngjBadCrcException.getPadSub3.valueOf();
        return (RectF) PngjBadSignature(PngjBadCrcException.getPadSub3.valueOf(), new Object[]{this}, valueOf3, valueOf2, -53535754, 53535754, valueOf);
    }

    @Override // com.identy.e1
    public final void PngjBadCrcException() {
        int i = pfkrolChangeMinMaxWidth;
        this.getMatchingTime = false;
        generateNFIQ = (i + 29) % 128;
    }

    @Override // com.identy.e1
    public final Pair[] PngjExceptionInternal() {
        Hand hand = Hand.LEFT;
        Finger finger = Finger.INDEX;
        Pair[] pairArr = {new Pair(hand, finger), new Pair(Hand.RIGHT, finger)};
        generateNFIQ = (pfkrolChangeMinMaxWidth + 105) % 128;
        return pairArr;
    }

    @Override // com.identy.e1
    public final boolean PngjUnsupportedException() {
        boolean PngjUnsupportedException;
        try {
            PngjUnsupportedException = super.PngjUnsupportedException();
        } catch (Exception unused) {
        }
        if ((!this.PngBadCharsetException) && (!this.onErrorResponse)) {
            int i = (pfkrolChangeMinMaxWidth + 103) % 128;
            generateNFIQ = i;
            if (PngjUnsupportedException) {
                pfkrolChangeMinMaxWidth = (i + 101) % 128;
                this.getQualityScore++;
                this.getL2Score.values(this.getPadSub3, this.getPadSub2, this.getData.intValue(), this.CaptureRolledFingersActivity);
                if (this.getQualityScore < 1) {
                    com.identy.d.PngjBadSignature pngjBadSignature = this.Attempt;
                    if (pngjBadSignature != null) {
                        pfkrolChangeMinMaxWidth = (generateNFIQ + 23) % 128;
                        pngjBadSignature.getData();
                        return false;
                    }
                } else {
                    if (!this.getCaptureTime) {
                        this.getCaptureTime = true;
                        values(new f(this, 4));
                        return true;
                    }
                    int i2 = generateNFIQ + 3;
                    pfkrolChangeMinMaxWidth = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 95 / 0;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.identy.e1
    public final void a() {
        super.a();
        int i = R.string.id_searching_index;
        com.identy.d.PngjBadSignature pngjBadSignature = this.Attempt;
        if (pngjBadSignature != null) {
            pfkrolChangeMinMaxWidth = (generateNFIQ + 73) % 128;
            pngjBadSignature.PngjBadSignature(i, false);
        }
        new Message().what = 0;
        this.onErrorResponse = false;
        this.getQualityScore = 0L;
        this.getL2Score.PngjBadCrcException();
        this.Capture2TActivity.postInvalidate();
        this.Action.runOnUiThread(new f(this, 3));
        com.identy.d.PngjBadSignature pngjBadSignature2 = this.Attempt;
        if (pngjBadSignature2 != null) {
            int i2 = pfkrolChangeMinMaxWidth + 3;
            generateNFIQ = i2 % 128;
            if (i2 % 2 != 0) {
                pngjBadSignature2.getData();
            } else {
                pngjBadSignature2.getData();
                throw null;
            }
        }
    }

    @Override // com.identy.e1
    public final void getPadSub1() {
        super.getPadSub1();
        this.pfk = null;
        this.pfkrolfinalizeF = null;
        this.getServerRequest = null;
        this.pfkrolGetQuality = null;
        this.pfkrolfinalize = null;
        this.getL1Score = null;
        this.Capture2TActivity = null;
        List list = this.configure;
        if (list != null) {
            pfkrolChangeMinMaxWidth = (generateNFIQ + 79) % 128;
            list.clear();
            generateNFIQ = (pfkrolChangeMinMaxWidth + 117) % 128;
        }
    }

    @Override // com.identy.e1
    public final RectF onErrorResponse() {
        pfkrolChangeMinMaxWidth = (generateNFIQ + 29) % 128;
        RectF Action = Action();
        pfkrolChangeMinMaxWidth = (generateNFIQ + 9) % 128;
        return Action;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0555, code lost:
    
        r4 = new java.lang.Object[]{r1, java.lang.Integer.valueOf(((java.lang.Integer) r4.getMethod((java.lang.String) r13[0], java.lang.Object.class).invoke(null, r36)).intValue()), 0, 792966357};
        r3 = com.identy.setFingers.$$g;
        r8 = r3[5];
        r13 = (byte) (r8 - 1);
        r15 = new java.lang.Object[1];
        g(r8, r13, r13, r15);
        r8 = java.lang.Class.forName((java.lang.String) r15[0]);
        r3 = r3[5];
        r13 = (byte) (r3 - 1);
        r3 = r3;
        r15 = new java.lang.Object[1];
        g(r13, r3, r3, r15);
        r3 = (java.lang.String) r15[0];
        r14 = java.lang.Integer.TYPE;
        r4 = (java.lang.Object[]) r8.getMethod(r3, android.content.Context.class, r14, r14, r14).invoke(null, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x05af, code lost:
    
        if (r1 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x05b1, code lost:
    
        r1 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1200224935);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x05b8, code lost:
    
        if (r1 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x05ba, code lost:
    
        r1 = (char) (31077 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
        r27 = ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 49;
        r3 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > r24 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == r24 ? 0 : -1)) + 1044;
        r8 = (byte) (com.identy.setFingers.$$d[0] - 1);
        r13 = r8;
        r15 = new java.lang.Object[1];
        f(r8, r13, r13, r15);
        r1 = com.d.e.a.PngjBadCrcException.PngjBadSignature(r1, r27, r3, 1150904546, false, (java.lang.String) r15[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x05f7, code lost:
    
        ((java.lang.reflect.Field) r1).set(null, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x060e, code lost:
    
        r1 = java.lang.Long.valueOf(((java.lang.Long) java.lang.Class.forName(r7).getDeclaredMethod(r12, null).invoke(null, null)).longValue());
        r3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-175041514);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0619, code lost:
    
        if (r3 != null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0235, code lost:
    
        r8 = new java.lang.Object[r34];
        r8[1] = -332083894;
        r8[0] = java.lang.Integer.valueOf(r1);
        r1 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1437710995);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x061b, code lost:
    
        r3 = (char) ((android.os.Process.getElapsedCpuTime() > r24 ? 1 : (android.os.Process.getElapsedCpuTime() == r24 ? 0 : -1)) + 31076);
        r27 = 49 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
        r8 = android.text.TextUtils.indexOf(com.karumi.dexter.BuildConfig.FLAVOR, com.karumi.dexter.BuildConfig.FLAVOR, 0) + 1043;
        r13 = com.identy.setFingers.$$d;
        r35 = 4;
        r6 = new java.lang.Object[1];
        f((byte) 13, r13[17], r13[0], r6);
        r3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(r3, r27, r8, 159283629, false, (java.lang.String) r6[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x065e, code lost:
    
        ((java.lang.reflect.Field) r3).set(null, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x065c, code lost:
    
        r35 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x066a, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0aaf, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0ab0, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0ab4, code lost:
    
        if (r1 != null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x024d, code lost:
    
        if (r1 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0ab6, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0ab7, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0502, code lost:
    
        ((android.content.ContextWrapper) r37).getBaseContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0507, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0508, code lost:
    
        r1 = r37.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x050d, code lost:
    
        r1 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0ac1, code lost:
    
        throw new java.lang.RuntimeException(java.lang.String.valueOf(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x033d, code lost:
    
        r19 = 13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x024f, code lost:
    
        r1 = (char) android.view.View.resolveSize(0, 0);
        r27 = (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 37;
        r3 = 549 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
        r13 = com.identy.setFingers.$$d;
        r4 = new java.lang.Object[1];
        f((byte) (r13[17] + 1), (byte) (-r13[6]), r13[0], r4);
        r31 = (java.lang.String) r4[0];
        r4 = java.lang.Integer.TYPE;
        r1 = com.d.e.a.PngjBadCrcException.PngjBadSignature(r1, r27, r3, -1453402328, false, r31, new java.lang.Class[]{r4, r4});
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0ac7, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0290, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0ac8, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0acc, code lost:
    
        if (r1 != null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0ace, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0acf, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0138, code lost:
    
        if ((r13 + 4611686018427387913L) < ((java.lang.Long) defpackage.a.i(r7, r12, null, null, null)).longValue()) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0293, code lost:
    
        r8 = (java.lang.Object[]) ((java.lang.reflect.Method) r1).invoke(null, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x013a, code lost:
    
        r1 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1434812162);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0141, code lost:
    
        if (r1 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0143, code lost:
    
        r1 = (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16);
        r27 = 37 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
        r3 = 549 - android.view.View.MeasureSpec.getSize(0);
        r8 = com.identy.setFingers.$$d;
        r13 = r8[0];
        r8 = (byte) (-r8[16]);
        r15 = new java.lang.Object[1];
        f(r13, r8, (byte) (r8 - 3), r15);
        r1 = com.d.e.a.PngjBadCrcException.PngjBadSignature(r1, r27, r3, 1452666181, false, (java.lang.String) r15[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x017e, code lost:
    
        r1 = (java.lang.Object[]) ((java.lang.reflect.Field) r1).get(null);
        r8 = new java.lang.Object[r21];
        r8[0] = new int[1];
        r8[1] = new int[]{r14};
        r8[r34] = new int[]{r1};
        r14 = ((int[]) r1[1])[0];
        r1 = ((int[]) r1[r34])[0];
        r1 = java.lang.System.identityHashCode(r36);
        r3 = ~r1;
        r1 = defpackage.a.c((~(r3 | (-806337932))) | 657905303, 217, ((537302147 | (~((-657905304) | r1))) * 217) + ((((~((-806337932) | r1)) | (~((-657905304) | r3))) * 217) + 519511377), -332083894);
        r1 = r1 ^ (r1 << 13);
        r1 = r1 ^ (r1 >>> 17);
        ((int[]) r8[0])[0] = r1 ^ (r1 << 5);
        r19 = 13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0123, code lost:
    
        if (r13 != (-1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x029c, code lost:
    
        r1 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1434812162);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x02a3, code lost:
    
        if (r1 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x02a5, code lost:
    
        r1 = (char) android.text.TextUtils.getTrimmedLength(com.karumi.dexter.BuildConfig.FLAVOR);
        r27 = 38 - (android.os.Process.getElapsedCpuTime() > r24 ? 1 : (android.os.Process.getElapsedCpuTime() == r24 ? 0 : -1));
        r3 = 549 - android.view.View.resolveSizeAndState(0, 0, 0);
        r4 = com.identy.setFingers.$$d;
        r13 = r4[0];
        r4 = (byte) (-r4[16]);
        r15 = new java.lang.Object[1];
        f(r13, r4, (byte) (r4 - 3), r15);
        r1 = com.d.e.a.PngjBadCrcException.PngjBadSignature(r1, r27, r3, 1452666181, false, (java.lang.String) r15[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x02e0, code lost:
    
        ((java.lang.reflect.Field) r1).set(null, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x02f7, code lost:
    
        r1 = java.lang.Long.valueOf(((java.lang.Long) java.lang.Class.forName(r7).getDeclaredMethod(r12, null).invoke(null, null)).longValue());
        r3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1556686741);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x02ff, code lost:
    
        if (r3 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0301, code lost:
    
        r3 = (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16);
        r27 = 37 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
        r4 = android.text.TextUtils.indexOf(com.karumi.dexter.BuildConfig.FLAVOR, com.karumi.dexter.BuildConfig.FLAVOR, 0) + 549;
        r14 = com.identy.setFingers.$$d;
        r19 = 13;
        r6 = new java.lang.Object[1];
        f((byte) 13, r14[17], r14[0], r6);
        r3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(r3, r27, r4, -1608103378, false, (java.lang.String) r6[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x033f, code lost:
    
        ((java.lang.reflect.Field) r3).set(null, r1);
        com.identy.setFingers.generateNFIQ = (com.identy.setFingers.pfkrolChangeMinMaxWidth + 121) % 128;
        r34 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x034e, code lost:
    
        r1 = r8[r34];
        r3 = ((int[]) r1)[0];
        r4 = r8[1];
        r6 = ((int[]) r4)[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x035c, code lost:
    
        if (r6 != r3) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x035e, code lost:
    
        r3 = new java.lang.Object[]{new int[1], new int[1], new int[1]};
        r6 = ((int[]) r8[0])[0];
        r4 = ((int[]) r4)[0];
        r1 = ((int[]) r1)[0];
        ((int[]) r3[1])[0] = r4;
        ((int[]) r3[2])[0] = r1;
        r1 = defpackage.a.a();
        r4 = ~r1;
        r8 = (~((-1063426692) | r4)) | 392337539;
        r1 = ~(r1 | 1071905695);
        r1 = defpackage.a.c(r1 | (~(r4 | (-671089153))), 502, ((r8 | r1) * (-502)) + 849192196, r6);
        r1 = r1 ^ (r1 << 13);
        r1 = r1 ^ (r1 >>> 17);
        ((int[]) r3[0])[0] = r1 ^ (r1 << 5);
        r1 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-175041514);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x03c0, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x03c2, code lost:
    
        r1 = (char) (31078 - (android.os.SystemClock.elapsedRealtime() > r24 ? 1 : (android.os.SystemClock.elapsedRealtime() == r24 ? 0 : -1)));
        r27 = android.view.View.combineMeasuredStates(0, 0) + 49;
        r3 = android.graphics.Color.red(0) + 1043;
        r4 = com.identy.setFingers.$$d;
        r13 = new java.lang.Object[1];
        f((byte) r19, r4[17], r4[0], r13);
        r1 = com.d.e.a.PngjBadCrcException.PngjBadSignature(r1, r27, r3, 159283629, false, (java.lang.String) r13[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x03fc, code lost:
    
        r3 = ((java.lang.reflect.Field) r1).getLong(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0405, code lost:
    
        if (r3 == r22) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0419, code lost:
    
        if ((r3 + 4611686018427387855L) < ((java.lang.Long) defpackage.a.i(r7, r12, null, null, null)).longValue()) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x041b, code lost:
    
        com.identy.setFingers.generateNFIQ = (com.identy.setFingers.pfkrolChangeMinMaxWidth + 87) % 128;
        r1 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1200224935);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x042a, code lost:
    
        if (r1 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x042c, code lost:
    
        r1 = (char) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 31077);
        r27 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > r24 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == r24 ? 0 : -1)) + 50;
        r3 = 1043 - android.graphics.Color.green(0);
        r4 = (byte) (com.identy.setFingers.$$d[0] - 1);
        r8 = r4;
        r14 = new java.lang.Object[1];
        f(r4, r8, r8, r14);
        r1 = com.d.e.a.PngjBadCrcException.PngjBadSignature(r1, r27, r3, 1150904546, false, (java.lang.String) r14[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0465, code lost:
    
        r1 = (java.lang.Object[]) ((java.lang.reflect.Field) r1).get(null);
        r4 = new java.lang.Object[r16];
        r4[2] = new int[]{r14};
        r4[3] = new int[]{r13};
        r4[4] = new int[1];
        r13 = ((int[]) r1[3])[0];
        r14 = ((int[]) r1[2])[0];
        r15 = (java.lang.String) r1[1];
        r1 = (java.lang.String) r1[0];
        r4[1] = r15;
        r4[0] = r1;
        r1 = ~(java.lang.System.identityHashCode(r36) | 103612674);
        r1 = defpackage.a.c(r1 | (-523104248), 220, (((-520744696) | r1) * (-220)) + 1984475315, -48050149);
        r1 = r1 ^ (r1 << 13);
        r1 = r1 ^ (r1 >>> 17);
        ((int[]) r4[4])[0] = r1 ^ (r1 << 5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x04d4, code lost:
    
        r35 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x066b, code lost:
    
        r1 = ((int[]) r4[2])[0];
        r3 = ((int[]) r4[3])[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0679, code lost:
    
        if (r3 != r1) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x067b, code lost:
    
        r3 = new java.lang.Object[5];
        r3[2] = new int[]{r14};
        r3[3] = new int[]{r13};
        r3[r35] = new int[1];
        r8 = ((int[]) r4[r35])[0];
        r13 = ((int[]) r4[3])[0];
        r14 = ((int[]) r4[2])[0];
        r15 = (java.lang.String) r4[1];
        r4 = (java.lang.String) r4[0];
        r3[1] = r15;
        r3[0] = r4;
        r1 = android.os.Process.myTid();
        r4 = ~r1;
        r6 = (((~((-88608771) | r4)) | (~(124523171 | r1))) * 520) - 1263848351;
        r13 = ~((-124523172) | r4);
        r1 = ~(r1 | 499834198);
        r1 = defpackage.a.c(r1 | ((~(r4 | (-499834199))) | 35914401), 520, ((r13 | r1) * (-1040)) + r6, r8);
        r1 = r1 ^ (r1 << 13);
        r1 = r1 ^ (r1 >>> 17);
        ((int[]) r3[r35])[0] = r1 ^ (r1 << 5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x078c, code lost:
    
        r1 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0793, code lost:
    
        if (r1 != null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0795, code lost:
    
        r1 = (char) (14829 - android.view.MotionEvent.axisFromString(com.karumi.dexter.BuildConfig.FLAVOR));
        r27 = android.text.TextUtils.indexOf(com.karumi.dexter.BuildConfig.FLAVOR, com.karumi.dexter.BuildConfig.FLAVOR, 0) + 28;
        r3 = android.view.MotionEvent.axisFromString(com.karumi.dexter.BuildConfig.FLAVOR) + 722;
        r6 = com.identy.setFingers.$$d;
        r13 = new java.lang.Object[1];
        f((byte) 13, r6[17], r6[0], r13);
        r1 = com.d.e.a.PngjBadCrcException.PngjBadSignature(r1, r27, r3, -815159504, false, (java.lang.String) r13[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x07cd, code lost:
    
        r3 = ((java.lang.reflect.Field) r1).getLong(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x07d5, code lost:
    
        if (r3 == r22) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x07e9, code lost:
    
        if ((r3 + 4611686018427387780L) < ((java.lang.Long) defpackage.a.i(r7, r12, null, null, null)).longValue()) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x07eb, code lost:
    
        com.identy.setFingers.generateNFIQ = (com.identy.setFingers.pfkrolChangeMinMaxWidth + 89) % 128;
        r1 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x07fa, code lost:
    
        if (r1 != null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x07fc, code lost:
    
        r1 = (char) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 14830);
        r23 = android.view.KeyEvent.keyCodeFromString(com.karumi.dexter.BuildConfig.FLAVOR) + 28;
        r3 = android.text.TextUtils.getOffsetAfter(com.karumi.dexter.BuildConfig.FLAVOR, 0) + 721;
        r4 = com.identy.setFingers.$$d;
        r7 = new java.lang.Object[1];
        f((byte) (r4[17] + 1), (byte) (-r4[6]), r4[0], r7);
        r1 = com.d.e.a.PngjBadCrcException.PngjBadSignature(r1, r23, r3, -779023007, false, (java.lang.String) r7[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0838, code lost:
    
        r1 = (java.lang.Object[]) ((java.lang.reflect.Field) r1).get(null);
        r4 = new java.lang.Object[r35];
        r4[0] = new int[]{r7};
        r4[1] = new int[1];
        r4[3] = new int[]{r6};
        r6 = ((int[]) r1[3])[0];
        r7 = ((int[]) r1[0])[0];
        r4[2] = (java.lang.String[]) r1[2];
        r1 = ~java.lang.System.identityHashCode(r36);
        r1 = defpackage.a.c(((~((-811029068) | r1)) | 5390858) | (~((-223536907) | r1)), 184, (((~(r1 | (-218146049))) | (~((-805638210) | r1))) * (-184)) - 347012035, -1316634333);
        r1 = r1 ^ (r1 << 13);
        r1 = r1 ^ (r1 >>> 17);
        ((int[]) r4[1])[0] = r1 ^ (r1 << 5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0a05, code lost:
    
        if (((int[]) r4[3])[0] != ((int[]) r4[0])[0]) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0a07, code lost:
    
        r1 = new java.lang.Object[]{new int[]{r8}, new int[1], r4, new int[]{r7}};
        r6 = ((int[]) r4[1])[0];
        r7 = ((int[]) r4[3])[0];
        r8 = ((int[]) r4[0])[0];
        r4 = (java.lang.String[]) r4[2];
        r3 = java.lang.System.identityHashCode(r36);
        r3 = defpackage.a.c((~((~r3) | 852470554)) | (-182095420), 168, (((~(r3 | 852470554)) | (-987737916)) * (-168)) + ((((~((-182095420) | r3)) | 46828058) * 336) - 973825651), r6);
        r3 = r3 ^ (r3 << 13);
        r3 = r3 ^ (r3 >>> 17);
        ((int[]) r1[1])[0] = r3 ^ (r3 << 5);
        r1 = com.identy.setFingers.generateNFIQ + 43;
        com.identy.setFingers.pfkrolChangeMinMaxWidth = r1 % 128;
        r1 = r1 % 2;
        super.onReceive(r37, r38);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0a85, code lost:
    
        if (r1 != 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0a87, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0a88, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0a89, code lost:
    
        r0 = new java.util.ArrayList();
        r1 = (java.lang.String[]) r4[2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0a94, code lost:
    
        if (r1 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0a96, code lost:
    
        com.identy.setFingers.generateNFIQ = (com.identy.setFingers.pfkrolChangeMinMaxWidth + 23) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0a9f, code lost:
    
        if (r11 >= r1.length) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0aa1, code lost:
    
        r0.add(r1[r11]);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0aa8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x08b1, code lost:
    
        r6 = new java.lang.Object[1];
        e(new int[]{30266216, 977086156, -1650830022, 1735886405, 992645496, 1122101911, 1703073393, 478097594}, 16 - android.graphics.Color.argb(0, 0, 0, 0), r6);
        r1 = java.lang.Class.forName((java.lang.String) r6[0]);
        r6 = new java.lang.Object[1];
        e(new int[]{1551909375, 223664038, 1892115062, -2072098593, -1325504391, 1390373483, -1264418426, -164569808}, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 15, r6);
        r1 = ((java.lang.Integer) r1.getMethod((java.lang.String) r6[0], java.lang.Object.class).invoke(null, r36)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x08fc, code lost:
    
        r3 = new java.lang.Object[]{749250485};
        r4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1439412966);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x090b, code lost:
    
        if (r4 != null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x090d, code lost:
    
        r4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (android.text.TextUtils.lastIndexOf(com.karumi.dexter.BuildConfig.FLAVOR, '0', 0, 0) + 1), 24 - android.text.TextUtils.getOffsetAfter(com.karumi.dexter.BuildConfig.FLAVOR, 0), 696 - android.graphics.ImageFormat.getBitsPerPixel(0), 1457201313, false, null, new java.lang.Class[]{java.lang.Integer.TYPE});
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x093c, code lost:
    
        r4 = com.identy.isFoundMatchingTemplates.PngjBadSignature.PngjBadCrcException$1eba2e16(r1, ((java.lang.reflect.Constructor) r4).newInstance(r3), -1706294469);
        r1 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x094a, code lost:
    
        if (r1 != null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x094c, code lost:
    
        r1 = (char) (14830 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
        r27 = (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 28;
        r3 = android.text.TextUtils.indexOf(com.karumi.dexter.BuildConfig.FLAVOR, com.karumi.dexter.BuildConfig.FLAVOR, 0) + 721;
        r6 = com.identy.setFingers.$$d;
        r13 = new java.lang.Object[1];
        f((byte) (r6[17] + 1), (byte) (-r6[6]), r6[0], r13);
        r1 = com.d.e.a.PngjBadCrcException.PngjBadSignature(r1, r27, r3, -779023007, false, (java.lang.String) r13[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x098a, code lost:
    
        ((java.lang.reflect.Field) r1).set(null, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00a5, code lost:
    
        if (r13 != (-1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x09a1, code lost:
    
        r1 = java.lang.Long.valueOf(((java.lang.Long) java.lang.Class.forName(r7).getDeclaredMethod(r12, null).invoke(null, null)).longValue());
        r3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x09ac, code lost:
    
        if (r3 != null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x09ae, code lost:
    
        r3 = (char) (android.view.View.MeasureSpec.getSize(0) + 14830);
        r27 = 27 - android.text.TextUtils.lastIndexOf(com.karumi.dexter.BuildConfig.FLAVOR, '0');
        r5 = (android.os.Process.getElapsedCpuTime() > r24 ? 1 : (android.os.Process.getElapsedCpuTime() == r24 ? 0 : -1)) + 720;
        r7 = com.identy.setFingers.$$d;
        r9 = new java.lang.Object[1];
        f((byte) 13, r7[17], r7[0], r9);
        r3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(r3, r27, r5, -815159504, false, (java.lang.String) r9[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x09ea, code lost:
    
        ((java.lang.reflect.Field) r3).set(null, r1);
        com.identy.setFingers.generateNFIQ = (com.identy.setFingers.pfkrolChangeMinMaxWidth + 125) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0aae, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x06f9, code lost:
    
        r1 = new java.util.ArrayList();
        r1.add((java.lang.String) r4[1]);
        r1.add((java.lang.String) r4[0]);
        r1 = new int[r3];
        r6 = r3 - 1;
        r1[r6] = 1;
        android.widget.Toast.makeText((android.content.Context) null, r1[((r3 * r6) % 2) - 1], 1).show();
        r3 = new java.lang.Object[5];
        r3[2] = new int[]{r14};
        r3[3] = new int[]{r13};
        r3[r35] = new int[1];
        r8 = ((int[]) r4[r35])[0];
        r13 = ((int[]) r4[3])[0];
        r14 = ((int[]) r4[2])[0];
        r15 = (java.lang.String) r4[1];
        r4 = (java.lang.String) r4[0];
        r3[1] = r15;
        r3[0] = r4;
        r1 = java.lang.System.identityHashCode(r36);
        r1 = defpackage.a.c((~((~r1) | (-28820308))) | 583593973, 398, (((~((-28820308) | r1)) | 583593973) * 398) + 418041617, r8);
        r1 = r1 ^ (r1 << 13);
        r1 = r1 ^ (r1 >>> 17);
        ((int[]) r3[r35])[0] = r1 ^ (r1 << 5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x04da, code lost:
    
        if (r37 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x01f0, code lost:
    
        r8 = new java.lang.Object[1];
        e(new int[]{30266216, 977086156, -1650830022, 1735886405, 992645496, 1122101911, 1703073393, 478097594}, android.graphics.Color.alpha(0) + 16, r8);
        r1 = java.lang.Class.forName((java.lang.String) r8[0]);
        r13 = new java.lang.Object[1];
        e(new int[]{1551909375, 223664038, 1892115062, -2072098593, -1325504391, 1390373483, -1264418426, -164569808}, 15 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), r13);
        r1 = ((java.lang.Integer) r1.getMethod((java.lang.String) r13[0], java.lang.Object.class).invoke(null, r36)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x04dc, code lost:
    
        r1 = com.identy.setFingers.pfkrolChangeMinMaxWidth;
        com.identy.setFingers.generateNFIQ = (r1 + 63) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x04e6, code lost:
    
        if ((r37 instanceof android.content.ContextWrapper) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x04e8, code lost:
    
        r1 = r1 + 65;
        com.identy.setFingers.generateNFIQ = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x04f2, code lost:
    
        if ((r1 % 2) == 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x04fb, code lost:
    
        if (((android.content.ContextWrapper) r37).getBaseContext() == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x04fe, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x050f, code lost:
    
        r13 = new java.lang.Object[1];
        e(new int[]{30266216, 977086156, -1650830022, 1735886405, 992645496, 1122101911, 1703073393, 478097594}, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 15, r13);
        r4 = java.lang.Class.forName((java.lang.String) r13[0]);
        r13 = new java.lang.Object[1];
        e(new int[]{1551909375, 223664038, 1892115062, -2072098593, -1325504391, 1390373483, -1264418426, -164569808}, 16 - android.view.View.resolveSizeAndState(0, 0, 0), r13);
     */
    @Override // com.identy.e1, android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        int i;
        int i2;
        int i3;
        long j;
        long j2;
        String str;
        String str2;
        long j3;
        int i4 = generateNFIQ + 27;
        pfkrolChangeMinMaxWidth = i4 % 128;
        int i5 = 0;
        if (i4 % 2 != 0) {
            j = -1;
            Object[] objArr = new Object[1];
            e(new int[]{1036369326, -1752761909, -1220829774, -1369761805, -215872125, -1464893336, 1771611089, 1929727866, 61377720, -1238655573, -235958307, 811175433}, Gravity.getAbsoluteGravity(0, 1) * 16, objArr);
            str = (String) objArr[0];
            j2 = 0;
            Object[] objArr2 = new Object[1];
            e(new int[]{-1533640142, -502740938, -960465581, 832921941, -1290124194, 164588923, -460069947, 756362562}, 17 / ExpandableListView.getPackedPositionType(1L), objArr2);
            str2 = (String) objArr2[0];
            Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(1556686741);
            if (PngjBadSignature == null) {
                char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                int i6 = 37 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int indexOf = TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 549;
                i2 = 5;
                byte[] bArr = $$d;
                byte b = bArr[17];
                i = 2;
                byte b2 = bArr[0];
                i3 = 3;
                Object[] objArr3 = new Object[1];
                f((byte) 13, b, b2, objArr3);
                PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(packedPositionChild, i6, indexOf, -1608103378, false, (String) objArr3[0], null);
            } else {
                i = 2;
                i2 = 5;
                i3 = 3;
            }
            j3 = ((Field) PngjBadSignature).getLong(null);
        } else {
            i = 2;
            i2 = 5;
            i3 = 3;
            j = -1;
            j2 = 0;
            Object[] objArr4 = new Object[1];
            e(new int[]{1036369326, -1752761909, -1220829774, -1369761805, -215872125, -1464893336, 1771611089, 1929727866, 61377720, -1238655573, -235958307, 811175433}, Gravity.getAbsoluteGravity(0, 0) + 22, objArr4);
            str = (String) objArr4[0];
            Object[] objArr5 = new Object[1];
            e(new int[]{-1533640142, -502740938, -960465581, 832921941, -1290124194, 164588923, -460069947, 756362562}, 15 - ExpandableListView.getPackedPositionType(0L), objArr5);
            str2 = (String) objArr5[0];
            Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1556686741);
            if (PngjBadSignature2 == null) {
                char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                int i7 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 36;
                int resolveOpacity = Drawable.resolveOpacity(0, 0) + 549;
                byte[] bArr2 = $$d;
                Object[] objArr6 = new Object[1];
                f((byte) 13, bArr2[17], bArr2[0], objArr6);
                PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(packedPositionGroup, i7, resolveOpacity, -1608103378, false, (String) objArr6[0], null);
            }
            j3 = ((Field) PngjBadSignature2).getLong(null);
        }
    }

    private static void e(int[] iArr, int i, Object[] objArr) {
        long j;
        char[] cArr;
        float f;
        char[] cArr2;
        int i2;
        int i3;
        com.d.e.PngBadCharsetException pngBadCharsetException = new com.d.e.PngBadCharsetException();
        char[] cArr3 = new char[4];
        int i4 = 2;
        char[] cArr4 = new char[iArr.length * 2];
        int[] iArr2 = destroy;
        Class cls = Integer.TYPE;
        int i5 = 16;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            j = 0;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(1618428774);
                    if (PngjBadSignature == null) {
                        i2 = i4;
                        byte b = (byte) i6;
                        i3 = i5;
                        byte b2 = b;
                        PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ExpandableListView.getPackedPositionForGroup(i6) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i6) == 0L ? 0 : -1)), 31 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1381 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1667748131, false, $$n(b, b2, (byte) (b2 - 1)), new Class[]{cls});
                    } else {
                        i2 = i4;
                        i3 = i5;
                    }
                    iArr3[i7] = ((Integer) ((Method) PngjBadSignature).invoke(null, objArr2)).intValue();
                    i7++;
                    i4 = i2;
                    i5 = i3;
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        } else {
            j = 0;
        }
        int i8 = i4;
        int i9 = i5;
        float f2 = 0.0f;
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = destroy;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                int i11 = $11 + 123;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    Object[] objArr3 = {Integer.valueOf(iArr5[i10])};
                    Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1618428774);
                    if (PngjBadSignature2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        cArr2 = cArr3;
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (ViewConfiguration.getEdgeSlop() >> 16) + 31, TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 1381, -1667748131, false, $$n(b3, b4, (byte) (b4 - 1)), new Class[]{cls});
                    } else {
                        cArr2 = cArr3;
                    }
                    iArr6[i10] = ((Integer) ((Method) PngjBadSignature2).invoke(null, objArr3)).intValue();
                } else {
                    cArr2 = cArr3;
                    Object[] objArr4 = {Integer.valueOf(iArr5[i10])};
                    Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1618428774);
                    if (PngjBadSignature3 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 31, TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 1382, -1667748131, false, $$n(b5, b6, (byte) (b6 - 1)), new Class[]{cls});
                    }
                    iArr6[i10] = ((Integer) ((Method) PngjBadSignature3).invoke(null, objArr4)).intValue();
                }
                i10++;
                $10 = ($11 + 11) % 128;
                cArr3 = cArr2;
            }
            cArr = cArr3;
            $11 = ($10 + 77) % 128;
            iArr5 = iArr6;
        } else {
            cArr = cArr3;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        pngBadCharsetException.values = 0;
        while (true) {
            int i12 = pngBadCharsetException.values;
            if (i12 >= iArr.length) {
                objArr[0] = new String(cArr4, 0, i);
                return;
            }
            $10 = ($11 + 81) % 128;
            int i13 = iArr[i12];
            char c = (char) (i13 >> 16);
            cArr[0] = c;
            char c2 = (char) i13;
            cArr[1] = c2;
            char c3 = (char) (iArr[i12 + 1] >> 16);
            cArr[i8] = c3;
            char c4 = (char) iArr[i12 + 1];
            cArr[3] = c4;
            pngBadCharsetException.PngjException = (c << 16) + c2;
            pngBadCharsetException.PngjBadCrcException = (c3 << 16) + c4;
            com.d.e.PngBadCharsetException.values(iArr4);
            int i14 = 0;
            while (i14 < i9) {
                int i15 = pngBadCharsetException.PngjException ^ iArr4[i14];
                pngBadCharsetException.PngjException = i15;
                int PngjBadCrcException = com.d.e.PngBadCharsetException.PngjBadCrcException(i15);
                Object[] objArr5 = new Object[4];
                objArr5[3] = pngBadCharsetException;
                objArr5[i8] = pngBadCharsetException;
                objArr5[1] = Integer.valueOf(PngjBadCrcException);
                objArr5[0] = pngBadCharsetException;
                Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-2104166611);
                if (PngjBadSignature4 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = (byte) (b7 + 1);
                    PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (2786 - View.MeasureSpec.getMode(0)), 37 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)), Color.rgb(0, 0, 0) + 16778001, 2122029718, false, $$n(b7, b8, (byte) (-b8)), new Class[]{Object.class, cls, Object.class, Object.class});
                }
                int intValue = ((Integer) ((Method) PngjBadSignature4).invoke(null, objArr5)).intValue();
                pngBadCharsetException.PngjException = pngBadCharsetException.PngjBadCrcException;
                pngBadCharsetException.PngjBadCrcException = intValue;
                i14++;
                i9 = 16;
            }
            int i16 = pngBadCharsetException.PngjException;
            int i17 = pngBadCharsetException.PngjBadCrcException;
            pngBadCharsetException.PngjException = i17;
            pngBadCharsetException.PngjBadCrcException = i16;
            i9 = 16;
            int i18 = i16 ^ iArr4[16];
            pngBadCharsetException.PngjBadCrcException = i18;
            int i19 = i17 ^ iArr4[17];
            pngBadCharsetException.PngjException = i19;
            cArr[0] = (char) (i19 >>> 16);
            cArr[1] = (char) i19;
            cArr[i8] = (char) (i18 >>> 16);
            cArr[3] = (char) i18;
            com.d.e.PngBadCharsetException.values(iArr4);
            int i20 = pngBadCharsetException.values;
            cArr4[i20 * 2] = cArr[0];
            cArr4[(i20 * 2) + 1] = cArr[1];
            cArr4[(i20 * 2) + 2] = cArr[i8];
            cArr4[(i20 * 2) + 3] = cArr[3];
            int i21 = i8;
            Object[] objArr6 = new Object[i21];
            objArr6[1] = pngBadCharsetException;
            objArr6[0] = pngBadCharsetException;
            Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-800662452);
            if (PngjBadSignature5 == null) {
                f = f2;
                PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (TypedValue.complexToFloat(0) > f2 ? 1 : (TypedValue.complexToFloat(0) == f2 ? 0 : -1)), 22 - (ViewConfiguration.getWindowTouchSlop() >> 8), (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)) + 29, 749318647, false, "E", new Class[]{Object.class, Object.class});
            } else {
                f = f2;
            }
            ((Method) PngjBadSignature5).invoke(null, objArr6);
            i8 = i21;
            f2 = f;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void f(short s, byte b, short s2, Object[] objArr) {
        int i;
        int i2 = 118 - (s2 * 38);
        byte[] bArr = $$d;
        int i3 = 40 - (b * 6);
        byte[] bArr2 = new byte[s + 6];
        int i4 = s + 5;
        if (bArr == null) {
            int i5 = i4;
            int i6 = i3;
            i = 0;
            int i7 = i6 + 1;
            i2 = i3 + i5 + 5;
            i3 = i7;
            bArr2[i] = (byte) i2;
            if (i == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i5 = bArr[i3];
            i++;
            int i8 = i2;
            i6 = i3;
            i3 = i8;
            int i72 = i6 + 1;
            i2 = i3 + i5 + 5;
            i3 = i72;
            bArr2[i] = (byte) i2;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            if (i == i4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:4:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void g(int i, byte b, byte b2, Object[] objArr) {
        int i2;
        int i3;
        int i4 = 99 - (b * 19);
        int i5 = 22 - (i * 18);
        byte[] bArr = $$g;
        int i6 = b2 * 3;
        byte[] bArr2 = new byte[19 - i6];
        int i7 = 18 - i6;
        if (bArr == null) {
            int i8 = i5;
            byte[] bArr3 = bArr;
            int i9 = -1;
            int i10 = i7;
            int i11 = i8 + 1;
            i4 = (i10 + (-i5)) - 1;
            i5 = i11;
            bArr = bArr3;
            i2 = i9;
            i3 = i2 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i12 = i4;
            i8 = i5;
            i5 = bArr[i5];
            i9 = i3;
            bArr3 = bArr;
            i10 = i12;
            int i112 = i8 + 1;
            i4 = (i10 + (-i5)) - 1;
            i5 = i112;
            bArr = bArr3;
            i2 = i9;
            i3 = i2 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        } else {
            i2 = -1;
            i3 = i2 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        }
    }

    @Override // com.identy.e1
    public final void PngjBadCrcException(byte[] bArr, boolean z, List list, List list2, float f, Long l) {
        int i = generateNFIQ + 111;
        pfkrolChangeMinMaxWidth = i % 128;
        int i2 = i % 2;
        super.PngjBadCrcException(bArr, z, list, list2, f, l);
        if (i2 != 0) {
            int i3 = 26 / 0;
        }
        int i4 = pfkrolChangeMinMaxWidth + 99;
        generateNFIQ = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object PngjBadSignature(Object[] objArr) {
        com.identy.ui.d.values valuesVar;
        com.identy.ui.d.values valuesVar2;
        com.identy.ui.d.values valuesVar3;
        setFingers setfingers = (setFingers) objArr[0];
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        try {
            try {
                setfingers.PngBadCharsetException();
                Mat mat = setfingers.getFingerPrintQualityScore;
                if (mat != null && !Mat.n_empty(mat.PngjException)) {
                    int i = generateNFIQ;
                    int i2 = i + 43;
                    pfkrolChangeMinMaxWidth = i2 % 128;
                    if (i2 % 2 == 0) {
                        if (setfingers.onErrorResponse) {
                            if (setfingers.Capture2TActivity != null) {
                                pfkrolChangeMinMaxWidth = (i + 9) % 128;
                                com.identy.ui.d.values valuesVar4 = setfingers.getL2Score;
                                if (valuesVar4 != null) {
                                    valuesVar4.values(setfingers.configure);
                                    setfingers.Capture2TActivity.postInvalidate();
                                }
                            }
                            Calendar.getInstance().getTimeInMillis();
                            setfingers.getCaptureTime = false;
                            com.identy.d.PngjBadSignature pngjBadSignature = setfingers.Attempt;
                            if (pngjBadSignature != null) {
                                pngjBadSignature.getData();
                            }
                            int i3 = pfkrolChangeMinMaxWidth + 103;
                            generateNFIQ = i3 % 128;
                            if (i3 % 2 == 0) {
                                throw null;
                            }
                        } else {
                            if (setfingers.CaptureMode != 0 && timeInMillis > 15000) {
                                setfingers.CaptureMode = 0L;
                            }
                            PreCaptureOutput valueOf = setfingers.valueOf(new Mat(Mat.n_clone(setfingers.getFingerPrintQualityScore.PngjException)));
                            if (valueOf.isGoodToCapture()) {
                                setfingers.onErrorResponse = true;
                                setfingers.configureroll.postDelayed(new f(setfingers, 0), 10L);
                            } else if (!valueOf.getError().equals(FingerError.NO_BOXES)) {
                                generateNFIQ = (pfkrolChangeMinMaxWidth + 57) % 128;
                                setfingers.configure = setfingers.getSpoofScore;
                                if (valueOf.getError().equals(FingerError.CORRECT)) {
                                    setfingers.PngjBadCrcException(3 - valueOf.getStreakCount());
                                } else {
                                    int res = valueOf.getError().getRes();
                                    com.identy.d.PngjBadSignature pngjBadSignature2 = setfingers.Attempt;
                                    if (pngjBadSignature2 != null) {
                                        pngjBadSignature2.PngjBadSignature(res, true);
                                    }
                                }
                            } else {
                                setfingers.configure.clear();
                                int res2 = valueOf.getError().getRes();
                                com.identy.d.PngjBadSignature pngjBadSignature3 = setfingers.Attempt;
                                if (pngjBadSignature3 != null) {
                                    int i4 = pfkrolChangeMinMaxWidth + 119;
                                    generateNFIQ = i4 % 128;
                                    int i5 = i4 % 2;
                                    pngjBadSignature3.PngjBadSignature(res2, true);
                                }
                            }
                            if (setfingers.Capture2TActivity != null && (valuesVar3 = setfingers.getL2Score) != null) {
                                valuesVar3.values(setfingers.configure);
                                setfingers.Capture2TActivity.postInvalidate();
                            }
                            Calendar.getInstance().getTimeInMillis();
                            setfingers.getCaptureTime = false;
                            com.identy.d.PngjBadSignature pngjBadSignature4 = setfingers.Attempt;
                            if (pngjBadSignature4 != null) {
                                int i6 = generateNFIQ + 17;
                                pfkrolChangeMinMaxWidth = i6 % 128;
                                if (i6 % 2 == 0) {
                                    pngjBadSignature4.getData();
                                    return null;
                                }
                                pngjBadSignature4.getData();
                                throw null;
                            }
                        }
                    } else {
                        throw null;
                    }
                } else {
                    setfingers.getCaptureTime = false;
                    if (setfingers.Capture2TActivity != null) {
                        int i7 = pfkrolChangeMinMaxWidth + 109;
                        generateNFIQ = i7 % 128;
                        if (i7 % 2 != 0) {
                            com.identy.ui.d.values valuesVar5 = setfingers.getL2Score;
                            if (valuesVar5 != null) {
                                valuesVar5.values(setfingers.configure);
                                setfingers.Capture2TActivity.postInvalidate();
                            }
                        } else {
                            throw null;
                        }
                    }
                    Calendar.getInstance().getTimeInMillis();
                    setfingers.getCaptureTime = false;
                    com.identy.d.PngjBadSignature pngjBadSignature5 = setfingers.Attempt;
                    if (pngjBadSignature5 != null) {
                        pngjBadSignature5.getData();
                        return null;
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            if (setfingers.Capture2TActivity != null && (valuesVar2 = setfingers.getL2Score) != null) {
                valuesVar2.values(setfingers.configure);
                setfingers.Capture2TActivity.postInvalidate();
            }
            Calendar.getInstance().getTimeInMillis();
            setfingers.getCaptureTime = false;
            com.identy.d.PngjBadSignature pngjBadSignature6 = setfingers.Attempt;
            if (pngjBadSignature6 != null) {
                pngjBadSignature6.getData();
            }
        } catch (Throwable th) {
            try {
                if (setfingers.Capture2TActivity != null && (valuesVar = setfingers.getL2Score) != null) {
                    valuesVar.values(setfingers.configure);
                    setfingers.Capture2TActivity.postInvalidate();
                }
                Calendar.getInstance().getTimeInMillis();
                setfingers.getCaptureTime = false;
                com.identy.d.PngjBadSignature pngjBadSignature7 = setfingers.Attempt;
                if (pngjBadSignature7 != null) {
                    pngjBadSignature7.getData();
                }
            } catch (Exception unused3) {
            }
            throw th;
        }
        return null;
    }

    @Override // com.identy.e1
    public final void valueOf(int i, int i2, int i3, boolean z) {
        int i4 = pfkrolChangeMinMaxWidth + 65;
        generateNFIQ = i4 % 128;
        if (i4 % 2 != 0) {
            super.valueOf(i, i2, i3, z);
            if (this.getMatchingTime) {
                return;
            }
            this.getMatchingTime = true;
            this.getData = Integer.valueOf(this.Action.getWindowManager().getDefaultDisplay().getRotation() + i3);
            org.c.a.PngjBadCrcException pngjBadCrcException = (org.c.a.PngjBadCrcException) this.Action.findViewById(R.id.tracking_overlay);
            this.Capture2TActivity = pngjBadCrcException;
            pngjBadCrcException.setLayerType(1, null);
            double d = this.getPadSub2 / 5.6d;
            double d2 = this.getPadSub3;
            this.CaptureRolledFingersActivity = new RectF((int) d, (int) (d2 / 6.0d), (int) (r2 - d), (int) (d2 - (d2 / 3.0d)));
            this.getScore = (int) (r1.width() / 3.7d);
            this.isQualityFailed = (int) (this.CaptureRolledFingersActivity.width() / 2.0f);
            try {
                this.getL2Score = new com.identy.ui.d.values(this.Action, 5.6d, 6.0d, 5.6d, 3.0d, IdentySdk.getInstance().getFingerPrintDrawable(), IdentySdk.getInstance().isDisableOuterBox(), 90, true, false, false, this.uxd565jk, this.cvtyuv2bgr);
            } catch (Exception unused) {
            }
            try {
                this.Action.runOnUiThread(new f(this, 1));
                generateNFIQ = (pfkrolChangeMinMaxWidth + 11) % 128;
            } catch (Exception unused2) {
            }
            this.Action.runOnUiThread(new f(this, 2));
            this.Capture2TActivity.valueOf = new IdentyD(this, 1);
            return;
        }
        super.valueOf(i, i2, i3, z);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void PngjBadSignature(Canvas canvas) {
        generateNFIQ = (pfkrolChangeMinMaxWidth + 49) % 128;
        this.getL2Score.values(canvas, this.getL3Score);
        int i = pfkrolChangeMinMaxWidth + 77;
        generateNFIQ = i % 128;
        if (i % 2 == 0) {
            int i2 = 95 / 0;
        }
    }
}
