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
    private static  byte[] $$d = null;
    private static  int $$e = 0;
    private static  byte[] $$g = null;
    private static  int $$h = 0;
    private static  byte[] $$l = null;
    private static  int $$m = 0;
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
        com.identy.e1.PngjOutputException = 0L;
        this.getOveralTimetaken = new float[0];
        this.a = fingerDetectionMode.getHand();
        this.getL3Score = z;
        this.Capture2IndexActivity = new com.identy.PngjOutputException(PngjExceptionInternal());
        int i = R.string.id_searching_index;
        com.identy.d.PngjBadSignature pngjBadSignature2 = this.Attempt;
        if (pngjBadSignature2 != null) {
            pngjBadSignature2.PngjBadSignature(i, false);
        }
        this.cvtyuv2bgr = com.identy.CapturePosition.VERTICAL_FROM_BOTTOM;
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
                PngjBadSignature(PngjBadCrcException.getPadSub3.valueOf(), new java.lang.Object[]{this}, valueOf3, valueOf2, -1609665347, 1609665349, valueOf);
                return;
            }
            int valueOf4 = PngjBadCrcException.getPadSub3.valueOf();
            int valueOf5 = PngjBadCrcException.getPadSub3.valueOf();
            int valueOf6 = PngjBadCrcException.getPadSub3.valueOf();
            PngjBadSignature(PngjBadCrcException.getPadSub3.valueOf(), new java.lang.Object[]{this}, valueOf6, valueOf5, -1609665347, 1609665349, valueOf4);
            throw null;
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ java.lang.Object PngjBadSignature(int i, java.lang.Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
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
        PngjBadSignature(PngjBadCrcException.getPadSub3.valueOf(), new java.lang.Object[]{this}, valueOf3, valueOf2, -2022270286, 2022270287, valueOf);
    }

    private void getPadSub3() {
        int valueOf = PngjBadCrcException.getPadSub3.valueOf();
        int valueOf2 = PngjBadCrcException.getPadSub3.valueOf();
        int valueOf3 = PngjBadCrcException.getPadSub3.valueOf();
        PngjBadSignature(PngjBadCrcException.getPadSub3.valueOf(), new java.lang.Object[]{this}, valueOf3, valueOf2, -1609665347, 1609665349, valueOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0090, code lost:
    
        if (0 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0099, code lost:
    
        0.height = 0;
        0.setLayoutParams(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
    
        if (0 != null) goto L26;
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
            PngjBadSignature(PngjBadCrcException.getPadSub3.valueOf(), new java.lang.Object[]{this}, valueOf3, valueOf2, -1609665347, 1609665349, valueOf);
            return;
        }
        this.getL1Score = (com.identy.ui.PngjBadCrcException) this.Action.findViewById(R.id.scanner_overlay);
        int valueOf4 = PngjBadCrcException.getPadSub3.valueOf();
        int valueOf5 = PngjBadCrcException.getPadSub3.valueOf();
        int valueOf6 = PngjBadCrcException.getPadSub3.valueOf();
        PngjBadSignature(PngjBadCrcException.getPadSub3.valueOf(), new java.lang.Object[]{this}, valueOf6, valueOf5, -1609665347, 1609665349, valueOf4);
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

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
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
        return (RectF) PngjBadSignature(PngjBadCrcException.getPadSub3.valueOf(), new java.lang.Object[]{this}, valueOf3, valueOf2, -53535754, 53535754, valueOf);
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
                this.getL2Score.values(this.getPadSub3, this.getPadSub2_f, this.getData.intValue(), this.CaptureRolledFingersActivity);
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
                        values(new IdentyF(this, 4));
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
        this.Action.runOnUiThread(new IdentyF(this, 3));
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
    
        0 = new java.lang.Object[]{0, java.lang.Integer.valueOf(((java.lang.Integer) 0.getMethod((java.lang.String) $$a[0], java.lang.Object.class).invoke(null, 0)).intValue()), 0, 792966357};
        0 = com.identy.setFingers.$$g;
        0 = $$a[5];
        0 = (byte) (0 - 1);
        0 = new java.lang.Object[1];
        g(0, 0, 0, 0);
        0 = java.lang.Class.forName((java.lang.String) $$a[0]);
        0 = $$a[5];
        0 = (byte) (0 - 1);
        0 = 0;
        0 = new java.lang.Object[1];
        g(0, 0, 0, 0);
        0 = (java.lang.String) $$a[0];
        0 = java.lang.Integer.TYPE;
        0 = (java.lang.Object[]) 0.getMethod(0, android.content.Context.class, 0, 0, 0).invoke(null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x05af, code lost:
    
        if (0 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x05b1, code lost:
    
        0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1200224935);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x05b8, code lost:
    
        if (0 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x05ba, code lost:
    
        0 = (char) (31077 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
        0 = ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 49;
        0 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) + 1044;
        0 = (byte) (com.identy.setFingers.$$d[0] - 1);
        0 = 0;
        0 = new java.lang.Object[1];
        f(0, 0, 0, 0);
        0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(0, 0, 0, 1150904546, false, (java.lang.String) $$a[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x05f7, code lost:
    
        ((java.lang.reflect.Field) 0).set(null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x060e, code lost:
    
        0 = java.lang.Long.valueOf(((java.lang.Long) java.lang.Class.forName(0).getDeclaredMethod(0, null).invoke(null, null)).longValue());
        0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-175041514);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0619, code lost:
    
        if (0 != null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0235, code lost:
    
        0 = new java.lang.Object[0];
        $$a[1] = -332083894;
        $$a[0] = java.lang.Integer.valueOf(0);
        0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1437710995);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x061b, code lost:
    
        0 = (char) ((android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)) + 31076);
        0 = 49 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
        0 = android.text.TextUtils.indexOf(com.karumi.dexter.BuildConfig.FLAVOR, com.karumi.dexter.BuildConfig.FLAVOR, 0) + 1043;
        0 = com.identy.setFingers.$$d;
        0 = 4;
        0 = new java.lang.Object[1];
        f((byte) 13, $$a[17], $$a[0], 0);
        0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(0, 0, 0, 159283629, false, (java.lang.String) $$a[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x065e, code lost:
    
        ((java.lang.reflect.Field) 0).set(null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x065c, code lost:
    
        0 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x066a, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0aaf, code lost:
    
        0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0ab0, code lost:
    
        0 = 0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0ab4, code lost:
    
        if (0 != null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x024d, code lost:
    
        if (0 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0ab6, code lost:
    
        throw 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0ab7, code lost:
    
        throw 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0502, code lost:
    
        ((android.content.ContextWrapper) 0).getBaseContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0507, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0508, code lost:
    
        0 = 0.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x050d, code lost:
    
        0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0ac1, code lost:
    
        throw new java.lang.RuntimeException(java.lang.String.valueOf(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x033d, code lost:
    
        0 = 13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x024f, code lost:
    
        0 = (char) android.view.View.resolveSize(0, 0);
        0 = (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 37;
        0 = 549 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
        0 = com.identy.setFingers.$$d;
        0 = new java.lang.Object[1];
        f((byte) ($$a[17] + 1), (byte) (-$$a[6]), $$a[0], 0);
        0 = (java.lang.String) $$a[0];
        0 = java.lang.Integer.TYPE;
        0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(0, 0, 0, -1453402328, false, 0, new java.lang.Class[]{0, 0});
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0ac7, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0290, code lost:
    
        0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0ac8, code lost:
    
        0 = 0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0acc, code lost:
    
        if (0 != null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0ace, code lost:
    
        throw 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0acf, code lost:
    
        throw 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0138, code lost:
    
        if ((0 + 4611686018427387913L) < ((java.lang.Long) defpackage.a.i(0, 0, null, null, null)).longValue()) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0293, code lost:
    
        0 = (java.lang.Object[]) ((java.lang.reflect.Method) 0).invoke(null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x013a, code lost:
    
        0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1434812162);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0141, code lost:
    
        if (0 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0143, code lost:
    
        0 = (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16);
        0 = 37 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
        0 = 549 - android.view.View.MeasureSpec.getSize(0);
        0 = com.identy.setFingers.$$d;
        0 = $$a[0];
        0 = (byte) (-$$a[16]);
        0 = new java.lang.Object[1];
        f(0, 0, (byte) (0 - 3), 0);
        0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(0, 0, 0, 1452666181, false, (java.lang.String) $$a[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x017e, code lost:
    
        0 = (java.lang.Object[]) ((java.lang.reflect.Field) 0).get(null);
        0 = new java.lang.Object[0];
        $$a[0] = new int[1];
        $$a[1] = new int[]{0};
        $$a[0] = new int[]{0};
        0 = ((int[]) $$a[1])[0];
        0 = ((int[]) $$a[0])[0];
        0 = java.lang.System.identityHashCode(0);
        0 = ~0;
        0 = defpackage.a.c((~(0 | (-806337932))) | 657905303, 217, ((537302147 | (~((-657905304) | 0))) * 217) + ((((~((-806337932) | 0)) | (~((-657905304) | 0))) * 217) + 519511377), -332083894);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a[0])[0] = 0 ^ (0 << 5);
        0 = 13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0123, code lost:
    
        if (0 != (-1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x029c, code lost:
    
        0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1434812162);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x02a3, code lost:
    
        if (0 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x02a5, code lost:
    
        0 = (char) android.text.TextUtils.getTrimmedLength(com.karumi.dexter.BuildConfig.FLAVOR);
        0 = 38 - (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1));
        0 = 549 - android.view.View.resolveSizeAndState(0, 0, 0);
        0 = com.identy.setFingers.$$d;
        0 = $$a[0];
        0 = (byte) (-$$a[16]);
        0 = new java.lang.Object[1];
        f(0, 0, (byte) (0 - 3), 0);
        0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(0, 0, 0, 1452666181, false, (java.lang.String) $$a[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x02e0, code lost:
    
        ((java.lang.reflect.Field) 0).set(null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x02f7, code lost:
    
        0 = java.lang.Long.valueOf(((java.lang.Long) java.lang.Class.forName(0).getDeclaredMethod(0, null).invoke(null, null)).longValue());
        0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1556686741);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x02ff, code lost:
    
        if (0 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0301, code lost:
    
        0 = (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16);
        0 = 37 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
        0 = android.text.TextUtils.indexOf(com.karumi.dexter.BuildConfig.FLAVOR, com.karumi.dexter.BuildConfig.FLAVOR, 0) + 549;
        0 = com.identy.setFingers.$$d;
        0 = 13;
        0 = new java.lang.Object[1];
        f((byte) 13, $$a[17], $$a[0], 0);
        0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(0, 0, 0, -1608103378, false, (java.lang.String) $$a[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x033f, code lost:
    
        ((java.lang.reflect.Field) 0).set(null, 0);
        com.identy.setFingers.generateNFIQ = (com.identy.setFingers.pfkrolChangeMinMaxWidth + 121) % 128;
        0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x034e, code lost:
    
        0 = $$a[0];
        0 = ((int[]) 0)[0];
        0 = $$a[1];
        0 = ((int[]) 0)[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x035c, code lost:
    
        if (0 != 0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x035e, code lost:
    
        0 = new java.lang.Object[]{new int[1], new int[1], new int[1]};
        0 = ((int[]) $$a[0])[0];
        0 = ((int[]) 0)[0];
        0 = ((int[]) 0)[0];
        ((int[]) $$a[1])[0] = 0;
        ((int[]) $$a[2])[0] = 0;
        0 = defpackage.a.a();
        0 = ~0;
        0 = (~((-1063426692) | 0)) | 392337539;
        0 = ~(0 | 1071905695);
        0 = defpackage.a.c(0 | (~(0 | (-671089153))), 502, ((0 | 0) * (-502)) + 849192196, 0);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a[0])[0] = 0 ^ (0 << 5);
        0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-175041514);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x03c0, code lost:
    
        if (0 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x03c2, code lost:
    
        0 = (char) (31078 - (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)));
        0 = android.view.View.combineMeasuredStates(0, 0) + 49;
        0 = android.graphics.Color.red(0) + 1043;
        0 = com.identy.setFingers.$$d;
        0 = new java.lang.Object[1];
        f((byte) 0, $$a[17], $$a[0], 0);
        0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(0, 0, 0, 159283629, false, (java.lang.String) $$a[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x03fc, code lost:
    
        0 = ((java.lang.reflect.Field) 0).getLong(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0405, code lost:
    
        if (0 == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0419, code lost:
    
        if ((0 + 4611686018427387855L) < ((java.lang.Long) defpackage.a.i(0, 0, null, null, null)).longValue()) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x041b, code lost:
    
        com.identy.setFingers.generateNFIQ = (com.identy.setFingers.pfkrolChangeMinMaxWidth + 87) % 128;
        0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1200224935);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x042a, code lost:
    
        if (0 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x042c, code lost:
    
        0 = (char) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 31077);
        0 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) + 50;
        0 = 1043 - android.graphics.Color.green(0);
        0 = (byte) (com.identy.setFingers.$$d[0] - 1);
        0 = 0;
        0 = new java.lang.Object[1];
        f(0, 0, 0, 0);
        0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(0, 0, 0, 1150904546, false, (java.lang.String) $$a[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0465, code lost:
    
        0 = (java.lang.Object[]) ((java.lang.reflect.Field) 0).get(null);
        0 = new java.lang.Object[0];
        $$a[2] = new int[]{0};
        $$a[3] = new int[]{0};
        $$a[4] = new int[1];
        0 = ((int[]) $$a[3])[0];
        0 = ((int[]) $$a[2])[0];
        0 = (java.lang.String) $$a[1];
        0 = (java.lang.String) $$a[0];
        $$a[1] = 0;
        $$a[0] = 0;
        0 = ~(java.lang.System.identityHashCode(0) | 103612674);
        0 = defpackage.a.c(0 | (-523104248), 220, (((-520744696) | 0) * (-220)) + 1984475315, -48050149);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a[4])[0] = 0 ^ (0 << 5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x04d4, code lost:
    
        0 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x066b, code lost:
    
        0 = ((int[]) $$a[2])[0];
        0 = ((int[]) $$a[3])[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0679, code lost:
    
        if (0 != 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x067b, code lost:
    
        0 = new java.lang.Object[5];
        $$a[2] = new int[]{0};
        $$a[3] = new int[]{0};
        $$a[0] = new int[1];
        0 = ((int[]) $$a[0])[0];
        0 = ((int[]) $$a[3])[0];
        0 = ((int[]) $$a[2])[0];
        0 = (java.lang.String) $$a[1];
        0 = (java.lang.String) $$a[0];
        $$a[1] = 0;
        $$a[0] = 0;
        0 = android.os.Process.myTid();
        0 = ~0;
        0 = (((~((-88608771) | 0)) | (~(124523171 | 0))) * 520) - 1263848351;
        0 = ~((-124523172) | 0);
        0 = ~(0 | 499834198);
        0 = defpackage.a.c(0 | ((~(0 | (-499834199))) | 35914401), 520, ((0 | 0) * (-1040)) + 0, 0);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a[0])[0] = 0 ^ (0 << 5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x078c, code lost:
    
        0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0793, code lost:
    
        if (0 != null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0795, code lost:
    
        0 = (char) (14829 - android.view.MotionEvent.axisFromString(com.karumi.dexter.BuildConfig.FLAVOR));
        0 = android.text.TextUtils.indexOf(com.karumi.dexter.BuildConfig.FLAVOR, com.karumi.dexter.BuildConfig.FLAVOR, 0) + 28;
        0 = android.view.MotionEvent.axisFromString(com.karumi.dexter.BuildConfig.FLAVOR) + 722;
        0 = com.identy.setFingers.$$d;
        0 = new java.lang.Object[1];
        f((byte) 13, $$a[17], $$a[0], 0);
        0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(0, 0, 0, -815159504, false, (java.lang.String) $$a[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x07cd, code lost:
    
        0 = ((java.lang.reflect.Field) 0).getLong(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x07d5, code lost:
    
        if (0 == 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x07e9, code lost:
    
        if ((0 + 4611686018427387780L) < ((java.lang.Long) defpackage.a.i(0, 0, null, null, null)).longValue()) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x07eb, code lost:
    
        com.identy.setFingers.generateNFIQ = (com.identy.setFingers.pfkrolChangeMinMaxWidth + 89) % 128;
        0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x07fa, code lost:
    
        if (0 != null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x07fc, code lost:
    
        0 = (char) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 14830);
        0 = android.view.KeyEvent.keyCodeFromString(com.karumi.dexter.BuildConfig.FLAVOR) + 28;
        0 = android.text.TextUtils.getOffsetAfter(com.karumi.dexter.BuildConfig.FLAVOR, 0) + 721;
        0 = com.identy.setFingers.$$d;
        0 = new java.lang.Object[1];
        f((byte) ($$a[17] + 1), (byte) (-$$a[6]), $$a[0], 0);
        0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(0, 0, 0, -779023007, false, (java.lang.String) $$a[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0838, code lost:
    
        0 = (java.lang.Object[]) ((java.lang.reflect.Field) 0).get(null);
        0 = new java.lang.Object[0];
        $$a[0] = new int[]{0};
        $$a[1] = new int[1];
        $$a[3] = new int[]{0};
        0 = ((int[]) $$a[3])[0];
        0 = ((int[]) $$a[0])[0];
        $$a[2] = (java.lang.String[]) $$a[2];
        0 = ~java.lang.System.identityHashCode(0);
        0 = defpackage.a.c(((~((-811029068) | 0)) | 5390858) | (~((-223536907) | 0)), 184, (((~(0 | (-218146049))) | (~((-805638210) | 0))) * (-184)) - 347012035, -1316634333);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a[1])[0] = 0 ^ (0 << 5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0a05, code lost:
    
        if (((int[]) $$a[3])[0] != ((int[]) $$a[0])[0]) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0a07, code lost:
    
        0 = new java.lang.Object[]{new int[]{0}, new int[1], 0, new int[]{0}};
        0 = ((int[]) $$a[1])[0];
        0 = ((int[]) $$a[3])[0];
        0 = ((int[]) $$a[0])[0];
        0 = (java.lang.String[]) $$a[2];
        0 = java.lang.System.identityHashCode(0);
        0 = defpackage.a.c((~((~0) | 852470554)) | (-182095420), 168, (((~(0 | 852470554)) | (-987737916)) * (-168)) + ((((~((-182095420) | 0)) | 46828058) * 336) - 973825651), 0);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a[1])[0] = 0 ^ (0 << 5);
        0 = com.identy.setFingers.generateNFIQ + 43;
        com.identy.setFingers.pfkrolChangeMinMaxWidth = 0 % 128;
        0 = 0 % 2;
        super.onReceive(0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0a85, code lost:
    
        if (0 != 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0a87, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0a88, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0a89, code lost:
    
        0 = new java.util.ArrayList();
        0 = (java.lang.String[]) $$a[2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0a94, code lost:
    
        if (0 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0a96, code lost:
    
        com.identy.setFingers.generateNFIQ = (com.identy.setFingers.pfkrolChangeMinMaxWidth + 23) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0a9f, code lost:
    
        if (0 >= 0.length) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0aa1, code lost:
    
        0.add($$a[0]);
        0 = 0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0aa8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x08b1, code lost:
    
        0 = new java.lang.Object[1];
        e(new int[]{30266216, 977086156, -1650830022, 1735886405, 992645496, 1122101911, 1703073393, 478097594}, 16 - android.graphics.Color.argb(0, 0, 0, 0), 0);
        0 = java.lang.Class.forName((java.lang.String) $$a[0]);
        0 = new java.lang.Object[1];
        e(new int[]{1551909375, 223664038, 1892115062, -2072098593, -1325504391, 1390373483, -1264418426, -164569808}, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 15, 0);
        0 = ((java.lang.Integer) 0.getMethod((java.lang.String) $$a[0], java.lang.Object.class).invoke(null, 0)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x08fc, code lost:
    
        0 = new java.lang.Object[]{749250485};
        0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1439412966);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x090b, code lost:
    
        if (0 != null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x090d, code lost:
    
        0 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (android.text.TextUtils.lastIndexOf(com.karumi.dexter.BuildConfig.FLAVOR, '0', 0, 0) + 1), 24 - android.text.TextUtils.getOffsetAfter(com.karumi.dexter.BuildConfig.FLAVOR, 0), 696 - android.graphics.ImageFormat.getBitsPerPixel(0), 1457201313, false, null, new java.lang.Class[]{java.lang.Integer.TYPE});
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x093c, code lost:
    
        0 = com.identy.isFoundMatchingTemplates.PngjBadSignature.PngjBadCrcException$1eba2e16(0, ((java.lang.reflect.Constructor) 0).newInstance(0), -1706294469);
        0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x094a, code lost:
    
        if (0 != null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x094c, code lost:
    
        0 = (char) (14830 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
        0 = (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 28;
        0 = android.text.TextUtils.indexOf(com.karumi.dexter.BuildConfig.FLAVOR, com.karumi.dexter.BuildConfig.FLAVOR, 0) + 721;
        0 = com.identy.setFingers.$$d;
        0 = new java.lang.Object[1];
        f((byte) ($$a[17] + 1), (byte) (-$$a[6]), $$a[0], 0);
        0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(0, 0, 0, -779023007, false, (java.lang.String) $$a[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x098a, code lost:
    
        ((java.lang.reflect.Field) 0).set(null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00a5, code lost:
    
        if (0 != (-1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x09a1, code lost:
    
        0 = java.lang.Long.valueOf(((java.lang.Long) java.lang.Class.forName(0).getDeclaredMethod(0, null).invoke(null, null)).longValue());
        0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x09ac, code lost:
    
        if (0 != null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x09ae, code lost:
    
        0 = (char) (android.view.View.MeasureSpec.getSize(0) + 14830);
        0 = 27 - android.text.TextUtils.lastIndexOf(com.karumi.dexter.BuildConfig.FLAVOR, '0');
        0 = (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)) + 720;
        0 = com.identy.setFingers.$$d;
        0 = new java.lang.Object[1];
        f((byte) 13, $$a[17], $$a[0], 0);
        0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(0, 0, 0, -815159504, false, (java.lang.String) $$a[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x09ea, code lost:
    
        ((java.lang.reflect.Field) 0).set(null, 0);
        com.identy.setFingers.generateNFIQ = (com.identy.setFingers.pfkrolChangeMinMaxWidth + 125) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0aae, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x06f9, code lost:
    
        0 = new java.util.ArrayList();
        0.add((java.lang.String) $$a[1]);
        0.add((java.lang.String) $$a[0]);
        0 = new int[0];
        0 = 0 - 1;
        $$a[0] = 1;
        android.widget.Toast.makeText((android.content.Context) null, $$a[((0 * 0) % 2) - 1], 1).show();
        0 = new java.lang.Object[5];
        $$a[2] = new int[]{0};
        $$a[3] = new int[]{0};
        $$a[0] = new int[1];
        0 = ((int[]) $$a[0])[0];
        0 = ((int[]) $$a[3])[0];
        0 = ((int[]) $$a[2])[0];
        0 = (java.lang.String) $$a[1];
        0 = (java.lang.String) $$a[0];
        $$a[1] = 0;
        $$a[0] = 0;
        0 = java.lang.System.identityHashCode(0);
        0 = defpackage.a.c((~((~0) | (-28820308))) | 583593973, 398, (((~((-28820308) | 0)) | 583593973) * 398) + 418041617, 0);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a[0])[0] = 0 ^ (0 << 5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x04da, code lost:
    
        if (0 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x01f0, code lost:
    
        0 = new java.lang.Object[1];
        e(new int[]{30266216, 977086156, -1650830022, 1735886405, 992645496, 1122101911, 1703073393, 478097594}, android.graphics.Color.alpha(0) + 16, 0);
        0 = java.lang.Class.forName((java.lang.String) $$a[0]);
        0 = new java.lang.Object[1];
        e(new int[]{1551909375, 223664038, 1892115062, -2072098593, -1325504391, 1390373483, -1264418426, -164569808}, 15 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 0);
        0 = ((java.lang.Integer) 0.getMethod((java.lang.String) $$a[0], java.lang.Object.class).invoke(null, 0)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x04dc, code lost:
    
        0 = com.identy.setFingers.pfkrolChangeMinMaxWidth;
        com.identy.setFingers.generateNFIQ = (0 + 63) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x04e6, code lost:
    
        if ((0 instanceof android.content.ContextWrapper) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x04e8, code lost:
    
        0 = 0 + 65;
        com.identy.setFingers.generateNFIQ = 0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x04f2, code lost:
    
        if ((0 % 2) == 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x04fb, code lost:
    
        if (((android.content.ContextWrapper) 0).getBaseContext() == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x04fe, code lost:
    
        0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x050f, code lost:
    
        0 = new java.lang.Object[1];
        e(new int[]{30266216, 977086156, -1650830022, 1735886405, 992645496, 1122101911, 1703073393, 478097594}, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 15, 0);
        0 = java.lang.Class.forName((java.lang.String) $$a[0]);
        0 = new java.lang.Object[1];
        e(new int[]{1551909375, 223664038, 1892115062, -2072098593, -1325504391, 1390373483, -1264418426, -164569808}, 16 - android.view.View.resolveSizeAndState(0, 0, 0), 0);
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
        try {
        int i4 = generateNFIQ + 27;
        pfkrolChangeMinMaxWidth = i4 % 128;
        int i5 = 0;
        if (i4 % 2 != 0) {
            j = -1;
            java.lang.Object[] objArr = new java.lang.Object[1];
            e(new int[]{1036369326, -1752761909, -1220829774, -1369761805, -215872125, -1464893336, 1771611089, 1929727866, 61377720, -1238655573, -235958307, 811175433}, Gravity.getAbsoluteGravity(0, 1) * 16, objArr);
            str = (String) objArr[0];
            j2 = 0;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            e(new int[]{-1533640142, -502740938, -960465581, 832921941, -1290124194, 164588923, -460069947, 756362562}, 17 / ExpandableListView.getPackedPositionType(1L), objArr2);
            str2 = (String) objArr2[0];
            java.lang.Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(1556686741);
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
                java.lang.Object[] objArr3 = new java.lang.Object[1];
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
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            e(new int[]{1036369326, -1752761909, -1220829774, -1369761805, -215872125, -1464893336, 1771611089, 1929727866, 61377720, -1238655573, -235958307, 811175433}, Gravity.getAbsoluteGravity(0, 0) + 22, objArr4);
            str = (String) objArr4[0];
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            e(new int[]{-1533640142, -502740938, -960465581, 832921941, -1290124194, 164588923, -460069947, 756362562}, 15 - ExpandableListView.getPackedPositionType(0L), objArr5);
            str2 = (String) objArr5[0];
            java.lang.Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1556686741);
            if (PngjBadSignature2 == null) {
                char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                int i7 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 36;
                int resolveOpacity = Drawable.resolveOpacity(0, 0) + 549;
                byte[] bArr2 = $$d;
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                f((byte) 13, bArr2[17], bArr2[0], objArr6);
                PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(packedPositionGroup, i7, resolveOpacity, -1608103378, false, (String) objArr6[0], null);
            }
            j3 = ((Field) PngjBadSignature2).getLong(null);
        }
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    private static void e(int[] iArr, int i, java.lang.Object[] objArr) {
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
                    java.lang.Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    java.lang.Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(1618428774);
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

                        throw new RuntimeException(th);

                    }

                    throw new RuntimeException(cause);
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
                    java.lang.Object[] objArr3 = {Integer.valueOf(iArr5[i10])};
                    java.lang.Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1618428774);
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
                    java.lang.Object[] objArr4 = {Integer.valueOf(iArr5[i10])};
                    java.lang.Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1618428774);
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
                java.lang.Object[] objArr5 = new java.lang.Object[4];
                objArr5[3] = pngBadCharsetException;
                objArr5[i8] = pngBadCharsetException;
                objArr5[1] = Integer.valueOf(PngjBadCrcException);
                objArr5[0] = pngBadCharsetException;
                java.lang.Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-2104166611);
                if (PngjBadSignature4 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = (byte) (b7 + 1);
                    PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (2786 - View.MeasureSpec.getMode(0)), 37 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)), Color.rgb(0, 0, 0) + 16778001, 2122029718, false, $$n(b7, b8, (byte) (-b8)), new Class[]{java.lang.Object.class, cls, java.lang.Object.class, java.lang.Object.class});
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
            java.lang.Object[] objArr6 = new java.lang.Object[i21];
            objArr6[1] = pngBadCharsetException;
            objArr6[0] = pngBadCharsetException;
            java.lang.Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-800662452);
            if (PngjBadSignature5 == null) {
                f = f2;
                PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (TypedValue.complexToFloat(0) > f2 ? 1 : (TypedValue.complexToFloat(0) == f2 ? 0 : -1)), 22 - (ViewConfiguration.getWindowTouchSlop() >> 8), (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)) + 29, 749318647, false, "E", new Class[]{java.lang.Object.class, java.lang.Object.class});
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
    private static void f(short s, byte b, short s2, java.lang.Object[] objArr) {
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
    private static void g(int i, byte b, byte b2, java.lang.Object[] objArr) {
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

    private static /* synthetic */ java.lang.Object PngjBadSignature(java.lang.Object[] objArr) {
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
                                setfingers.configureroll.postDelayed(new IdentyF(setfingers, 0), 10L);
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
            throw new RuntimeException(th);
        }
        return null;
    }

    @Override // com.identy.e1
    public final void valueOf(int i, int i2, int i3, boolean z) {
        int i4 = pfkrolChangeMinMaxWidth + 65;
        generateNFIQ = i4 % 128;
        if (i4 % 2 != 0) {
            throw new UnsupportedOperationException("Method not decompiled");
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
